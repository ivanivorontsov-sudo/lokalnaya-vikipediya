package ru.vorontsov.wiki;

import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.Inflater;
import org.tartarus.snowball.ext.russianStemmer;

/* loaded from: classes.dex */
public class SearchCore {
    private static final Pattern WORD = Pattern.compile("[0-9a-zа-яё]+");
    private final double N;
    private final Sql db;
    private final russianStemmer st = new russianStemmer();
    private final Map<String, String> corrCache = new HashMap();

    public static class Result {
        public String corrected;
        public List<Hit> hits = new ArrayList();
        public int total;
    }

    public interface Sql {
        List<Object[]> q(String str, Object... objArr);
    }

    public static class Hit {
        public long id;
        public String lead;
        public double score;
        public String title;

        public String toString() {
            return String.format("%s (%.1f)", this.title, Double.valueOf(this.score));
        }
    }

    public SearchCore(Sql sql) {
        this.db = sql;
        List<Object[]> q = sql.q("SELECT v FROM meta WHERE k='articles'", new Object[0]);
        this.N = q.isEmpty() ? 1000000.0d : Double.parseDouble((String) q.get(0)[0]);
    }

    public static String norm(String str) {
        return str.toLowerCase(Locale.ROOT).replace((char) 1105, (char) 1077).replace("́", "");
    }

    public static List<String> toks(String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = WORD.matcher(norm(str));
        while (matcher.find()) {
            arrayList.add(matcher.group());
        }
        return arrayList;
    }

    public synchronized String stem(String str) {
        this.st.setCurrent(str);
        this.st.stem();
        return this.st.getCurrent();
    }

    static int dl(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, length + 1, length2 + 1);
        for (int i = 0; i <= length; i++) {
            iArr[i][0] = i;
        }
        for (int i2 = 0; i2 <= length2; i2++) {
            iArr[0][i2] = i2;
        }
        for (int i3 = 1; i3 <= length; i3++) {
            for (int i4 = 1; i4 <= length2; i4++) {
                int i5 = i3 - 1;
                int i6 = i4 - 1;
                int i7 = str.charAt(i5) == str2.charAt(i6) ? 0 : 1;
                int[] iArr2 = iArr[i3];
                iArr2[i4] = Math.min(Math.min(iArr[i5][i4] + 1, iArr2[i6] + 1), iArr[i5][i6] + i7);
                if (i3 > 1 && i4 > 1) {
                    int i8 = i4 - 2;
                    if (str.charAt(i5) == str2.charAt(i8)) {
                        int i9 = i3 - 2;
                        if (str.charAt(i9) == str2.charAt(i6)) {
                            int[] iArr3 = iArr[i3];
                            iArr3[i4] = Math.min(iArr3[i4], iArr[i9][i8] + 1);
                        }
                    }
                }
            }
        }
        return iArr[length][length2];
    }

    private long freq(String str) {
        List<Object[]> q = this.db.q("SELECT f FROM vocab WHERE w=?", str);
        if (q.isEmpty()) {
            return 0L;
        }
        return ((Number) q.get(0)[0]).longValue();
    }

    public String correct(String str) {
        int dl;
        int i = 3;
        if (str.length() < 3 || !str.matches(".*[а-яa-z].*")) {
            return str;
        }
        String str2 = this.corrCache.get(str);
        if (str2 != null) {
            return str2;
        }
        long freq = freq(str);
        int length = str.length();
        char c = 1;
        if (length <= 4) {
            i = 1;
        } else if (length <= 8) {
            i = 2;
        }
        String str3 = "^" + str + "$";
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        int i2 = 0;
        while (true) {
            int i3 = i2 + 3;
            if (i3 > str3.length()) {
                break;
            }
            linkedHashSet.add(str3.substring(i2, i3));
            i2++;
        }
        StringBuilder sb = new StringBuilder("SELECT v.w,v.f FROM (SELECT w,count(*) c FROM tri WHERE t IN (");
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (String str4 : linkedHashSet) {
            int i5 = i4 + 1;
            sb.append(i4 > 0 ? ",?" : "?");
            arrayList.add(str4);
            i4 = i5;
        }
        sb.append(") AND l BETWEEN ? AND ? GROUP BY w ORDER BY c DESC, w ASC LIMIT 1500) x JOIN vocab v ON v.id=x.w ORDER BY x.c DESC, v.f DESC LIMIT 400");
        arrayList.add(Integer.valueOf(length - i));
        arrayList.add(Integer.valueOf(length + i));
        double log = freq > 0 ? Math.log(freq + 1) + 0.5d : -1.0E9d;
        String str5 = str;
        for (Object[] objArr : this.db.q(sb.toString(), arrayList.toArray())) {
            String str6 = (String) objArr[0];
            long longValue = ((Number) objArr[c]).longValue();
            if (!str6.equals(str) && (dl = dl(str, str6)) <= i) {
                double log2 = Math.log(longValue + 1) - (dl * 2.5d);
                if (str6.charAt(0) != str.charAt(0)) {
                    log2 -= 1.5d;
                }
                if (log2 > log) {
                    str5 = str6;
                    log = log2;
                }
                c = 1;
            }
        }
        this.corrCache.put(str, str5);
        return str5;
    }

    private String ftsQuery(List<List<String>> list, String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        for (List<String> list2 : list) {
            int i = 0;
            while (i < list2.size()) {
                if (!z2) {
                    sb.append((i > 0 || !z) ? " OR " : " ");
                }
                sb.append(str).append('\"').append(list2.get(i)).append('\"');
                i++;
                z2 = false;
            }
        }
        return sb.toString();
    }

    private static int[] ints(byte[] bArr) {
        int length = bArr.length / 4;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 4;
            iArr[i] = ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }
        return iArr;
    }

    private void collect(String str, int i, Map<Long, Double> map) {
        SearchCore searchCore = this;
        Map<Long, Double> map2 = map;
        Iterator<Object[]> it = searchCore.db.q("SELECT docid, matchinfo(fts,'pcx') FROM fts WHERE fts MATCH ? LIMIT " + i, str).iterator();
        while (it.hasNext()) {
            Object[] next = it.next();
            int i2 = 0;
            long longValue = ((Number) next[0]).longValue();
            if (!map2.containsKey(Long.valueOf(longValue))) {
                int[] ints = ints((byte[]) next[1]);
                int i3 = ints[0];
                int i4 = ints[1];
                double d = 0.0d;
                int i5 = 0;
                int i6 = 0;
                while (i5 < i3) {
                    int i7 = i2;
                    int i8 = i7;
                    while (i7 < i4) {
                        int i9 = ((i5 * i4) + i7) * 3;
                        int i10 = ints[i9 + 2];
                        int i11 = ints[i9 + 4];
                        Iterator<Object[]> it2 = it;
                        int[] iArr = ints;
                        if (i10 > 0) {
                            d += (i7 == 0 ? 6 : 1) * Math.log((searchCore.N / (i11 + 1.0d)) + 1.0d) * (Math.log(i10) + 1.0d);
                            if (i7 == 0) {
                                i8 = 1;
                            }
                        }
                        i7++;
                        searchCore = this;
                        it = it2;
                        ints = iArr;
                    }
                    Iterator<Object[]> it3 = it;
                    int[] iArr2 = ints;
                    if (i8 != 0) {
                        i6++;
                    }
                    i5++;
                    searchCore = this;
                    it = it3;
                    ints = iArr2;
                    i2 = 0;
                }
                Iterator<Object[]> it4 = it;
                if (i6 == i3) {
                    d *= 1.6d;
                }
                map.put(Long.valueOf(longValue), Double.valueOf(d + (4.0d / Math.log(10 + longValue))));
                searchCore = this;
                map2 = map;
                it = it4;
            }
        }
    }

    public Result search(String str, int i) {
        Result result = new Result();
        List<String> ksVar = toks(str);
        if (ksVar.isEmpty()) {
            return result;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        char c = 0;
        boolean z = false;
        for (String str2 : ksVar) {
            String correct = correct(str2);
            arrayList2.add(correct);
            if (!correct.equals(str2)) {
                z = true;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(stem(correct));
            linkedHashSet.add(stem(str2));
            arrayList.add(new ArrayList(linkedHashSet));
        }
        if (z) {
            result.corrected = SearchCore$$ExternalSyntheticBackport0.m(" ", arrayList2);
        }
        HashMap hashMap = new HashMap();
        Iterator it = new LinkedHashSet(Arrays.asList(SearchCore$$ExternalSyntheticBackport0.m(" ", ksVar), SearchCore$$ExternalSyntheticBackport0.m(" ", arrayList2))).iterator();
        while (it.hasNext()) {
            Iterator<Object[]> it2 = this.db.q("SELECT id FROM titles WHERE norm=? LIMIT 5", (String) it.next()).iterator();
            while (it2.hasNext()) {
                hashMap.merge(Long.valueOf(((Number) it2.next()[c]).longValue()), Double.valueOf((20.0d / Math.log(r10 + 10)) + 1000.0d), new BiFunction() { // from class: ru.vorontsov.wiki.SearchCore$$ExternalSyntheticLambda1
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        double max;
                        max = Math.max(((Double) obj).doubleValue(), ((Double) obj2).doubleValue());
                        return Double.valueOf(max);
                    }
                });
                c = 0;
            }
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i2 = 0; i2 < ksVar.size(); i2++) {
            if (i2 > 0) {
                sb.append(' ');
                sb2.append(' ');
            }
            sb.append(stem(ksVar.get(i2)));
            sb2.append(stem((String) arrayList2.get(i2)));
        }
        Iterator it3 = new LinkedHashSet(Arrays.asList(sb.toString(), sb2.toString())).iterator();
        while (it3.hasNext()) {
            Iterator<Object[]> it4 = this.db.q("SELECT id FROM titles WHERE sn=? LIMIT 5", (String) it3.next()).iterator();
            while (it4.hasNext()) {
                hashMap.merge(Long.valueOf(((Number) it4.next()[0]).longValue()), Double.valueOf((20.0d / Math.log(r6 + 10)) + 500.0d), new BiFunction() { // from class: ru.vorontsov.wiki.SearchCore$$ExternalSyntheticLambda1
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        double max;
                        max = Math.max(((Double) obj).doubleValue(), ((Double) obj2).doubleValue());
                        return Double.valueOf(max);
                    }
                });
            }
        }
        HashMap hashMap2 = new HashMap();
        collect(ftsQuery(arrayList, "t:", true), 300, hashMap2);
        collect(ftsQuery(arrayList, "", true), 400, hashMap2);
        if (hashMap2.size() < i && arrayList.size() > 1) {
            collect(ftsQuery(arrayList, "", false), 400, hashMap2);
        }
        for (Map.Entry<Long, Double> entry : hashMap2.entrySet()) {
            hashMap.merge(entry.getKey(), entry.getValue(), new BiFunction() { // from class: ru.vorontsov.wiki.SearchCore$$ExternalSyntheticLambda2
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    double sum;
                    sum = Double.sum(((Double) obj).doubleValue(), ((Double) obj2).doubleValue());
                    return Double.valueOf(sum);
                }
            });
        }
        result.total = hashMap.size();
        ArrayList arrayList3 = new ArrayList(hashMap.entrySet());
        arrayList3.sort(new Comparator() { // from class: ru.vorontsov.wiki.SearchCore$$ExternalSyntheticLambda3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compare;
                compare = Double.compare(((Double) ((Map.Entry) obj2).getValue()).doubleValue(), ((Double) ((Map.Entry) obj).getValue()).doubleValue());
                return compare;
            }
        });
        for (int i3 = 0; i3 < Math.min(i, arrayList3.size()); i3++) {
            Hit hit = new Hit();
            hit.id = ((Long) ((Map.Entry) arrayList3.get(i3)).getKey()).longValue();
            hit.score = ((Double) ((Map.Entry) arrayList3.get(i3)).getValue()).doubleValue();
            List<Object[]> q = this.db.q("SELECT title,lead FROM art WHERE id=?", Long.valueOf(hit.id));
            if (!q.isEmpty()) {
                hit.title = (String) q.get(0)[0];
                hit.lead = (String) q.get(0)[1];
                result.hits.add(hit);
            }
        }
        return result;
    }

    public List<String[]> suggest(String str, int i) {
        String trim = norm(str).trim();
        ArrayList arrayList = new ArrayList();
        if (trim.length() < 2) {
            return arrayList;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object[] objArr : this.db.q("SELECT id,norm FROM (SELECT id,norm FROM titles WHERE norm>=? AND norm<? LIMIT 3000) ORDER BY id LIMIT " + (i * 2), trim, trim + "\uffff")) {
            linkedHashMap.putIfAbsent(Long.valueOf(((Number) objArr[0]).longValue()), (String) objArr[1]);
        }
        for (Long l : linkedHashMap.keySet()) {
            if (arrayList.size() >= i) {
                break;
            }
            List<Object[]> q = this.db.q("SELECT title FROM art WHERE id=?", l);
            if (!q.isEmpty()) {
                String str2 = (String) q.get(0)[0];
                String str3 = (String) linkedHashMap.get(l);
                if (!norm(str2).equals(str3)) {
                    str2 = Character.toUpperCase(str3.charAt(0)) + str3.substring(1) + " → " + str2;
                }
                arrayList.add(new String[]{String.valueOf(l), str2});
            }
        }
        return arrayList;
    }

    public String[] article(long j) {
        int inflate;
        List<Object[]> q = this.db.q("SELECT title,body FROM art WHERE id=?", Long.valueOf(j));
        if (q.isEmpty()) {
            return null;
        }
        try {
            Inflater inflater = new Inflater();
            byte[] bArr = (byte[]) q.get(0)[1];
            inflater.setInput(bArr);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length * 3);
            byte[] bArr2 = new byte[65536];
            while (!inflater.finished() && ((inflate = inflater.inflate(bArr2)) != 0 || (!inflater.needsInput() && !inflater.needsDictionary()))) {
                byteArrayOutputStream.write(bArr2, 0, inflate);
            }
            inflater.end();
            return new String[]{(String) q.get(0)[0], byteArrayOutputStream.toString("UTF-8")};
        } catch (Exception e) {
            return new String[]{(String) q.get(0)[0], "Ошибка: " + e};
        }
    }

    public List<String> highlightStems(String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : toks(str)) {
            arrayList.add(stem(str2));
            arrayList.add(stem(correct(str2)));
        }
        return arrayList;
    }
}
