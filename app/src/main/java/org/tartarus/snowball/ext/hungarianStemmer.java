package org.tartarus.snowball.ext;

import org.tartarus.snowball.Among;
import org.tartarus.snowball.SnowballProgram;
import org.tartarus.snowball.SnowballStemmer;

/* loaded from: classes.dex */
public class hungarianStemmer extends SnowballStemmer {
    private static final Among[] a_0;
    private static final Among[] a_1;
    private static final Among[] a_10;
    private static final Among[] a_11;
    private static final Among[] a_2;
    private static final Among[] a_3;
    private static final Among[] a_4;
    private static final Among[] a_5;
    private static final Among[] a_6;
    private static final Among[] a_7;
    private static final Among[] a_8;
    private static final Among[] a_9;
    private static final char[] g_v;
    private static final hungarianStemmer methodObject;
    private static final long serialVersionUID = 1;
    private int I_p1;

    static {
        hungarianStemmer hungarianstemmer = new hungarianStemmer();
        methodObject = hungarianstemmer;
        a_0 = new Among[]{new Among("cs", -1, -1, "", hungarianstemmer), new Among("dzs", -1, -1, "", hungarianstemmer), new Among("gy", -1, -1, "", hungarianstemmer), new Among("ly", -1, -1, "", hungarianstemmer), new Among("ny", -1, -1, "", hungarianstemmer), new Among("sz", -1, -1, "", hungarianstemmer), new Among("ty", -1, -1, "", hungarianstemmer), new Among("zs", -1, -1, "", hungarianstemmer)};
        a_1 = new Among[]{new Among("á", -1, 1, "", hungarianstemmer), new Among("é", -1, 2, "", hungarianstemmer)};
        a_2 = new Among[]{new Among("bb", -1, -1, "", hungarianstemmer), new Among("cc", -1, -1, "", hungarianstemmer), new Among("dd", -1, -1, "", hungarianstemmer), new Among("ff", -1, -1, "", hungarianstemmer), new Among("gg", -1, -1, "", hungarianstemmer), new Among("jj", -1, -1, "", hungarianstemmer), new Among("kk", -1, -1, "", hungarianstemmer), new Among("ll", -1, -1, "", hungarianstemmer), new Among("mm", -1, -1, "", hungarianstemmer), new Among("nn", -1, -1, "", hungarianstemmer), new Among("pp", -1, -1, "", hungarianstemmer), new Among("rr", -1, -1, "", hungarianstemmer), new Among("ccs", -1, -1, "", hungarianstemmer), new Among("ss", -1, -1, "", hungarianstemmer), new Among("zzs", -1, -1, "", hungarianstemmer), new Among("tt", -1, -1, "", hungarianstemmer), new Among("vv", -1, -1, "", hungarianstemmer), new Among("ggy", -1, -1, "", hungarianstemmer), new Among("lly", -1, -1, "", hungarianstemmer), new Among("nny", -1, -1, "", hungarianstemmer), new Among("tty", -1, -1, "", hungarianstemmer), new Among("ssz", -1, -1, "", hungarianstemmer), new Among("zz", -1, -1, "", hungarianstemmer)};
        a_3 = new Among[]{new Among("al", -1, 1, "", hungarianstemmer), new Among("el", -1, 2, "", hungarianstemmer)};
        a_4 = new Among[]{new Among("ba", -1, -1, "", hungarianstemmer), new Among("ra", -1, -1, "", hungarianstemmer), new Among("be", -1, -1, "", hungarianstemmer), new Among("re", -1, -1, "", hungarianstemmer), new Among("ig", -1, -1, "", hungarianstemmer), new Among("nak", -1, -1, "", hungarianstemmer), new Among("nek", -1, -1, "", hungarianstemmer), new Among("val", -1, -1, "", hungarianstemmer), new Among("vel", -1, -1, "", hungarianstemmer), new Among("ul", -1, -1, "", hungarianstemmer), new Among("nál", -1, -1, "", hungarianstemmer), new Among("nél", -1, -1, "", hungarianstemmer), new Among("ból", -1, -1, "", hungarianstemmer), new Among("ról", -1, -1, "", hungarianstemmer), new Among("tól", -1, -1, "", hungarianstemmer), new Among("bõl", -1, -1, "", hungarianstemmer), new Among("rõl", -1, -1, "", hungarianstemmer), new Among("tõl", -1, -1, "", hungarianstemmer), new Among("ül", -1, -1, "", hungarianstemmer), new Among("n", -1, -1, "", hungarianstemmer), new Among("an", 19, -1, "", hungarianstemmer), new Among("ban", 20, -1, "", hungarianstemmer), new Among("en", 19, -1, "", hungarianstemmer), new Among("ben", 22, -1, "", hungarianstemmer), new Among("képpen", 22, -1, "", hungarianstemmer), new Among("on", 19, -1, "", hungarianstemmer), new Among("ön", 19, -1, "", hungarianstemmer), new Among("képp", -1, -1, "", hungarianstemmer), new Among("kor", -1, -1, "", hungarianstemmer), new Among("t", -1, -1, "", hungarianstemmer), new Among("at", 29, -1, "", hungarianstemmer), new Among("et", 29, -1, "", hungarianstemmer), new Among("ként", 29, -1, "", hungarianstemmer), new Among("anként", 32, -1, "", hungarianstemmer), new Among("enként", 32, -1, "", hungarianstemmer), new Among("onként", 32, -1, "", hungarianstemmer), new Among("ot", 29, -1, "", hungarianstemmer), new Among("ért", 29, -1, "", hungarianstemmer), new Among("öt", 29, -1, "", hungarianstemmer), new Among("hez", -1, -1, "", hungarianstemmer), new Among("hoz", -1, -1, "", hungarianstemmer), new Among("höz", -1, -1, "", hungarianstemmer), new Among("vá", -1, -1, "", hungarianstemmer), new Among("vé", -1, -1, "", hungarianstemmer)};
        a_5 = new Among[]{new Among("án", -1, 2, "", hungarianstemmer), new Among("én", -1, 1, "", hungarianstemmer), new Among("ánként", -1, 3, "", hungarianstemmer)};
        a_6 = new Among[]{new Among("stul", -1, 2, "", hungarianstemmer), new Among("astul", 0, 1, "", hungarianstemmer), new Among("ástul", 0, 3, "", hungarianstemmer), new Among("stül", -1, 2, "", hungarianstemmer), new Among("estül", 3, 1, "", hungarianstemmer), new Among("éstül", 3, 4, "", hungarianstemmer)};
        a_7 = new Among[]{new Among("á", -1, 1, "", hungarianstemmer), new Among("é", -1, 2, "", hungarianstemmer)};
        a_8 = new Among[]{new Among("k", -1, 7, "", hungarianstemmer), new Among("ak", 0, 4, "", hungarianstemmer), new Among("ek", 0, 6, "", hungarianstemmer), new Among("ok", 0, 5, "", hungarianstemmer), new Among("ák", 0, 1, "", hungarianstemmer), new Among("ék", 0, 2, "", hungarianstemmer), new Among("ök", 0, 3, "", hungarianstemmer)};
        a_9 = new Among[]{new Among("éi", -1, 7, "", hungarianstemmer), new Among("áéi", 0, 6, "", hungarianstemmer), new Among("ééi", 0, 5, "", hungarianstemmer), new Among("é", -1, 9, "", hungarianstemmer), new Among("ké", 3, 4, "", hungarianstemmer), new Among("aké", 4, 1, "", hungarianstemmer), new Among("eké", 4, 1, "", hungarianstemmer), new Among("oké", 4, 1, "", hungarianstemmer), new Among("áké", 4, 3, "", hungarianstemmer), new Among("éké", 4, 2, "", hungarianstemmer), new Among("öké", 4, 1, "", hungarianstemmer), new Among("éé", 3, 8, "", hungarianstemmer)};
        a_10 = new Among[]{new Among("a", -1, 18, "", hungarianstemmer), new Among("ja", 0, 17, "", hungarianstemmer), new Among("d", -1, 16, "", hungarianstemmer), new Among("ad", 2, 13, "", hungarianstemmer), new Among("ed", 2, 13, "", hungarianstemmer), new Among("od", 2, 13, "", hungarianstemmer), new Among("ád", 2, 14, "", hungarianstemmer), new Among("éd", 2, 15, "", hungarianstemmer), new Among("öd", 2, 13, "", hungarianstemmer), new Among("e", -1, 18, "", hungarianstemmer), new Among("je", 9, 17, "", hungarianstemmer), new Among("nk", -1, 4, "", hungarianstemmer), new Among("unk", 11, 1, "", hungarianstemmer), new Among("ánk", 11, 2, "", hungarianstemmer), new Among("énk", 11, 3, "", hungarianstemmer), new Among("ünk", 11, 1, "", hungarianstemmer), new Among("uk", -1, 8, "", hungarianstemmer), new Among("juk", 16, 7, "", hungarianstemmer), new Among("ájuk", 17, 5, "", hungarianstemmer), new Among("ük", -1, 8, "", hungarianstemmer), new Among("jük", 19, 7, "", hungarianstemmer), new Among("éjük", 20, 6, "", hungarianstemmer), new Among("m", -1, 12, "", hungarianstemmer), new Among("am", 22, 9, "", hungarianstemmer), new Among("em", 22, 9, "", hungarianstemmer), new Among("om", 22, 9, "", hungarianstemmer), new Among("ám", 22, 10, "", hungarianstemmer), new Among("ém", 22, 11, "", hungarianstemmer), new Among("o", -1, 18, "", hungarianstemmer), new Among("á", -1, 19, "", hungarianstemmer), new Among("é", -1, 20, "", hungarianstemmer)};
        a_11 = new Among[]{new Among("id", -1, 10, "", hungarianstemmer), new Among("aid", 0, 9, "", hungarianstemmer), new Among("jaid", 1, 6, "", hungarianstemmer), new Among("eid", 0, 9, "", hungarianstemmer), new Among("jeid", 3, 6, "", hungarianstemmer), new Among("áid", 0, 7, "", hungarianstemmer), new Among("éid", 0, 8, "", hungarianstemmer), new Among("i", -1, 15, "", hungarianstemmer), new Among("ai", 7, 14, "", hungarianstemmer), new Among("jai", 8, 11, "", hungarianstemmer), new Among("ei", 7, 14, "", hungarianstemmer), new Among("jei", 10, 11, "", hungarianstemmer), new Among("ái", 7, 12, "", hungarianstemmer), new Among("éi", 7, 13, "", hungarianstemmer), new Among("itek", -1, 24, "", hungarianstemmer), new Among("eitek", 14, 21, "", hungarianstemmer), new Among("jeitek", 15, 20, "", hungarianstemmer), new Among("éitek", 14, 23, "", hungarianstemmer), new Among("ik", -1, 29, "", hungarianstemmer), new Among("aik", 18, 26, "", hungarianstemmer), new Among("jaik", 19, 25, "", hungarianstemmer), new Among("eik", 18, 26, "", hungarianstemmer), new Among("jeik", 21, 25, "", hungarianstemmer), new Among("áik", 18, 27, "", hungarianstemmer), new Among("éik", 18, 28, "", hungarianstemmer), new Among("ink", -1, 20, "", hungarianstemmer), new Among("aink", 25, 17, "", hungarianstemmer), new Among("jaink", 26, 16, "", hungarianstemmer), new Among("eink", 25, 17, "", hungarianstemmer), new Among("jeink", 28, 16, "", hungarianstemmer), new Among("áink", 25, 18, "", hungarianstemmer), new Among("éink", 25, 19, "", hungarianstemmer), new Among("aitok", -1, 21, "", hungarianstemmer), new Among("jaitok", 32, 20, "", hungarianstemmer), new Among("áitok", -1, 22, "", hungarianstemmer), new Among("im", -1, 5, "", hungarianstemmer), new Among("aim", 35, 4, "", hungarianstemmer), new Among("jaim", 36, 1, "", hungarianstemmer), new Among("eim", 35, 4, "", hungarianstemmer), new Among("jeim", 38, 1, "", hungarianstemmer), new Among("áim", 35, 2, "", hungarianstemmer), new Among("éim", 35, 3, "", hungarianstemmer)};
        g_v = new char[]{17, 'A', 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 17, '4', 14};
    }

    private void copy_from(hungarianStemmer hungarianstemmer) {
        this.I_p1 = hungarianstemmer.I_p1;
        super.copy_from((SnowballProgram) hungarianstemmer);
    }

    private boolean r_mark_regions() {
        this.I_p1 = this.limit;
        int i = this.cursor;
        if (in_grouping(g_v, 97, 252)) {
            while (true) {
                int i2 = this.cursor;
                if (out_grouping(g_v, 97, 252)) {
                    this.cursor = i2;
                    int i3 = this.cursor;
                    if (find_among(a_0, 8) == 0) {
                        this.cursor = i3;
                        if (this.cursor < this.limit) {
                            this.cursor++;
                        }
                    }
                    this.I_p1 = this.cursor;
                } else {
                    this.cursor = i2;
                    if (this.cursor >= this.limit) {
                        break;
                    }
                    this.cursor++;
                }
            }
        }
        this.cursor = i;
        if (!out_grouping(g_v, 97, 252)) {
            return false;
        }
        while (!in_grouping(g_v, 97, 252)) {
            if (this.cursor >= this.limit) {
                return false;
            }
            this.cursor++;
        }
        this.I_p1 = this.cursor;
        return true;
    }

    private boolean r_R1() {
        return this.I_p1 <= this.cursor;
    }

    private boolean r_v_ending() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_1, 2);
        boolean z = false;
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (!r_R1()) {
            return false;
        }
        if (find_among_b != 0) {
            z = true;
            if (find_among_b == 1) {
                slice_from("a");
            } else if (find_among_b == 2) {
                slice_from("e");
            }
        }
        return z;
    }

    private boolean r_double() {
        int i = this.limit - this.cursor;
        if (find_among_b(a_2, 23) == 0) {
            return false;
        }
        this.cursor = this.limit - i;
        return true;
    }

    private boolean r_undouble() {
        if (this.cursor <= this.limit_backward) {
            return false;
        }
        this.cursor--;
        this.ket = this.cursor;
        int i = this.cursor - 1;
        if (this.limit_backward > i || i > this.limit) {
            return false;
        }
        this.cursor = i;
        this.bra = this.cursor;
        slice_del();
        return true;
    }

    private boolean r_instrum() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_3, 2);
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (!r_R1() || find_among_b == 0) {
            return false;
        }
        if (find_among_b == 1) {
            if (!r_double()) {
                return false;
            }
        } else if (find_among_b == 2 && !r_double()) {
            return false;
        }
        slice_del();
        return r_undouble();
    }

    private boolean r_case() {
        this.ket = this.cursor;
        if (find_among_b(a_4, 44) == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (!r_R1()) {
            return false;
        }
        slice_del();
        return r_v_ending();
    }

    private boolean r_case_special() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_5, 3);
        boolean z = false;
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (!r_R1()) {
            return false;
        }
        if (find_among_b != 0) {
            z = true;
            if (find_among_b == 1) {
                slice_from("e");
            } else if (find_among_b == 2) {
                slice_from("a");
            } else if (find_among_b == 3) {
                slice_from("a");
            }
        }
        return z;
    }

    private boolean r_case_other() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_6, 6);
        boolean z = false;
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (!r_R1()) {
            return false;
        }
        if (find_among_b != 0) {
            z = true;
            if (find_among_b == 1) {
                slice_del();
            } else if (find_among_b == 2) {
                slice_del();
            } else if (find_among_b == 3) {
                slice_from("a");
            } else if (find_among_b == 4) {
                slice_from("e");
            }
        }
        return z;
    }

    private boolean r_factive() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_7, 2);
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (!r_R1() || find_among_b == 0) {
            return false;
        }
        if (find_among_b == 1) {
            if (!r_double()) {
                return false;
            }
        } else if (find_among_b == 2 && !r_double()) {
            return false;
        }
        slice_del();
        return r_undouble();
    }

    private boolean r_plural() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_8, 7);
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (!r_R1()) {
            return false;
        }
        switch (find_among_b) {
            case 1:
                slice_from("a");
                break;
            case 2:
                slice_from("e");
                break;
            case 3:
                slice_del();
                break;
            case 4:
                slice_del();
                break;
            case 5:
                slice_del();
                break;
            case 6:
                slice_del();
                break;
            case 7:
                slice_del();
                break;
        }
        return false;
    }

    private boolean r_owned() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_9, 12);
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (!r_R1()) {
            return false;
        }
        switch (find_among_b) {
            case 1:
                slice_del();
                break;
            case 2:
                slice_from("e");
                break;
            case 3:
                slice_from("a");
                break;
            case 4:
                slice_del();
                break;
            case 5:
                slice_from("e");
                break;
            case 6:
                slice_from("a");
                break;
            case 7:
                slice_del();
                break;
            case 8:
                slice_from("e");
                break;
            case 9:
                slice_del();
                break;
        }
        return false;
    }

    private boolean r_sing_owner() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_10, 31);
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (!r_R1()) {
            return false;
        }
        switch (find_among_b) {
            case 1:
                slice_del();
                break;
            case 2:
                slice_from("a");
                break;
            case 3:
                slice_from("e");
                break;
            case 4:
                slice_del();
                break;
            case 5:
                slice_from("a");
                break;
            case 6:
                slice_from("e");
                break;
            case 7:
                slice_del();
                break;
            case 8:
                slice_del();
                break;
            case 9:
                slice_del();
                break;
            case 10:
                slice_from("a");
                break;
            case 11:
                slice_from("e");
                break;
            case 12:
                slice_del();
                break;
            case 13:
                slice_del();
                break;
            case 14:
                slice_from("a");
                break;
            case 15:
                slice_from("e");
                break;
            case 16:
                slice_del();
                break;
            case 17:
                slice_del();
                break;
            case 18:
                slice_del();
                break;
            case 19:
                slice_from("a");
                break;
            case 20:
                slice_from("e");
                break;
        }
        return false;
    }

    private boolean r_plur_owner() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_11, 42);
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (!r_R1()) {
            return false;
        }
        switch (find_among_b) {
            case 1:
                slice_del();
                break;
            case 2:
                slice_from("a");
                break;
            case 3:
                slice_from("e");
                break;
            case 4:
                slice_del();
                break;
            case 5:
                slice_del();
                break;
            case 6:
                slice_del();
                break;
            case 7:
                slice_from("a");
                break;
            case 8:
                slice_from("e");
                break;
            case 9:
                slice_del();
                break;
            case 10:
                slice_del();
                break;
            case 11:
                slice_del();
                break;
            case 12:
                slice_from("a");
                break;
            case 13:
                slice_from("e");
                break;
            case 14:
                slice_del();
                break;
            case 15:
                slice_del();
                break;
            case 16:
                slice_del();
                break;
            case 17:
                slice_del();
                break;
            case 18:
                slice_from("a");
                break;
            case 19:
                slice_from("e");
                break;
            case 20:
                slice_del();
                break;
            case 21:
                slice_del();
                break;
            case 22:
                slice_from("a");
                break;
            case 23:
                slice_from("e");
                break;
            case 24:
                slice_del();
                break;
            case 25:
                slice_del();
                break;
            case 26:
                slice_del();
                break;
            case 27:
                slice_from("a");
                break;
            case 28:
                slice_from("e");
                break;
            case 29:
                slice_del();
                break;
        }
        return false;
    }

    @Override // org.tartarus.snowball.SnowballStemmer
    public boolean stem() {
        int i = this.cursor;
        r_mark_regions();
        this.cursor = i;
        this.limit_backward = this.cursor;
        this.cursor = this.limit;
        int i2 = this.limit - this.cursor;
        r_instrum();
        this.cursor = this.limit - i2;
        int i3 = this.limit - this.cursor;
        r_case();
        this.cursor = this.limit - i3;
        int i4 = this.limit - this.cursor;
        r_case_special();
        this.cursor = this.limit - i4;
        int i5 = this.limit - this.cursor;
        r_case_other();
        this.cursor = this.limit - i5;
        int i6 = this.limit - this.cursor;
        r_factive();
        this.cursor = this.limit - i6;
        int i7 = this.limit - this.cursor;
        r_owned();
        this.cursor = this.limit - i7;
        int i8 = this.limit - this.cursor;
        r_sing_owner();
        this.cursor = this.limit - i8;
        int i9 = this.limit - this.cursor;
        r_plur_owner();
        this.cursor = this.limit - i9;
        int i10 = this.limit - this.cursor;
        r_plural();
        this.cursor = this.limit - i10;
        this.cursor = this.limit_backward;
        return true;
    }

    public boolean equals(Object obj) {
        return obj instanceof hungarianStemmer;
    }

    public int hashCode() {
        return "org.tartarus.snowball.ext.hungarianStemmer".hashCode();
    }
}
