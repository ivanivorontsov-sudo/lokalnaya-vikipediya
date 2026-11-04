package org.tartarus.snowball.ext;

import org.tartarus.snowball.Among;
import org.tartarus.snowball.SnowballProgram;
import org.tartarus.snowball.SnowballStemmer;

/* loaded from: classes.dex */
public class italianStemmer extends SnowballStemmer {
    private static final Among[] a_0;
    private static final Among[] a_1;
    private static final Among[] a_2;
    private static final Among[] a_3;
    private static final Among[] a_4;
    private static final Among[] a_5;
    private static final Among[] a_6;
    private static final Among[] a_7;
    private static final char[] g_AEIO;
    private static final char[] g_CG;
    private static final char[] g_v;
    private static final italianStemmer methodObject;
    private static final long serialVersionUID = 1;
    private int I_p1;
    private int I_p2;
    private int I_pV;

    static {
        italianStemmer italianstemmer = new italianStemmer();
        methodObject = italianstemmer;
        a_0 = new Among[]{new Among("", -1, 7, "", italianstemmer), new Among("qu", 0, 6, "", italianstemmer), new Among("á", 0, 1, "", italianstemmer), new Among("é", 0, 2, "", italianstemmer), new Among("í", 0, 3, "", italianstemmer), new Among("ó", 0, 4, "", italianstemmer), new Among("ú", 0, 5, "", italianstemmer)};
        a_1 = new Among[]{new Among("", -1, 3, "", italianstemmer), new Among("I", 0, 1, "", italianstemmer), new Among("U", 0, 2, "", italianstemmer)};
        a_2 = new Among[]{new Among("la", -1, -1, "", italianstemmer), new Among("cela", 0, -1, "", italianstemmer), new Among("gliela", 0, -1, "", italianstemmer), new Among("mela", 0, -1, "", italianstemmer), new Among("tela", 0, -1, "", italianstemmer), new Among("vela", 0, -1, "", italianstemmer), new Among("le", -1, -1, "", italianstemmer), new Among("cele", 6, -1, "", italianstemmer), new Among("gliele", 6, -1, "", italianstemmer), new Among("mele", 6, -1, "", italianstemmer), new Among("tele", 6, -1, "", italianstemmer), new Among("vele", 6, -1, "", italianstemmer), new Among("ne", -1, -1, "", italianstemmer), new Among("cene", 12, -1, "", italianstemmer), new Among("gliene", 12, -1, "", italianstemmer), new Among("mene", 12, -1, "", italianstemmer), new Among("sene", 12, -1, "", italianstemmer), new Among("tene", 12, -1, "", italianstemmer), new Among("vene", 12, -1, "", italianstemmer), new Among("ci", -1, -1, "", italianstemmer), new Among("li", -1, -1, "", italianstemmer), new Among("celi", 20, -1, "", italianstemmer), new Among("glieli", 20, -1, "", italianstemmer), new Among("meli", 20, -1, "", italianstemmer), new Among("teli", 20, -1, "", italianstemmer), new Among("veli", 20, -1, "", italianstemmer), new Among("gli", 20, -1, "", italianstemmer), new Among("mi", -1, -1, "", italianstemmer), new Among("si", -1, -1, "", italianstemmer), new Among("ti", -1, -1, "", italianstemmer), new Among("vi", -1, -1, "", italianstemmer), new Among("lo", -1, -1, "", italianstemmer), new Among("celo", 31, -1, "", italianstemmer), new Among("glielo", 31, -1, "", italianstemmer), new Among("melo", 31, -1, "", italianstemmer), new Among("telo", 31, -1, "", italianstemmer), new Among("velo", 31, -1, "", italianstemmer)};
        a_3 = new Among[]{new Among("ando", -1, 1, "", italianstemmer), new Among("endo", -1, 1, "", italianstemmer), new Among("ar", -1, 2, "", italianstemmer), new Among("er", -1, 2, "", italianstemmer), new Among("ir", -1, 2, "", italianstemmer)};
        a_4 = new Among[]{new Among("ic", -1, -1, "", italianstemmer), new Among("abil", -1, -1, "", italianstemmer), new Among("os", -1, -1, "", italianstemmer), new Among("iv", -1, 1, "", italianstemmer)};
        a_5 = new Among[]{new Among("ic", -1, 1, "", italianstemmer), new Among("abil", -1, 1, "", italianstemmer), new Among("iv", -1, 1, "", italianstemmer)};
        a_6 = new Among[]{new Among("ica", -1, 1, "", italianstemmer), new Among("logia", -1, 3, "", italianstemmer), new Among("osa", -1, 1, "", italianstemmer), new Among("ista", -1, 1, "", italianstemmer), new Among("iva", -1, 9, "", italianstemmer), new Among("anza", -1, 1, "", italianstemmer), new Among("enza", -1, 5, "", italianstemmer), new Among("ice", -1, 1, "", italianstemmer), new Among("atrice", 7, 1, "", italianstemmer), new Among("iche", -1, 1, "", italianstemmer), new Among("logie", -1, 3, "", italianstemmer), new Among("abile", -1, 1, "", italianstemmer), new Among("ibile", -1, 1, "", italianstemmer), new Among("usione", -1, 4, "", italianstemmer), new Among("azione", -1, 2, "", italianstemmer), new Among("uzione", -1, 4, "", italianstemmer), new Among("atore", -1, 2, "", italianstemmer), new Among("ose", -1, 1, "", italianstemmer), new Among("ante", -1, 1, "", italianstemmer), new Among("mente", -1, 1, "", italianstemmer), new Among("amente", 19, 7, "", italianstemmer), new Among("iste", -1, 1, "", italianstemmer), new Among("ive", -1, 9, "", italianstemmer), new Among("anze", -1, 1, "", italianstemmer), new Among("enze", -1, 5, "", italianstemmer), new Among("ici", -1, 1, "", italianstemmer), new Among("atrici", 25, 1, "", italianstemmer), new Among("ichi", -1, 1, "", italianstemmer), new Among("abili", -1, 1, "", italianstemmer), new Among("ibili", -1, 1, "", italianstemmer), new Among("ismi", -1, 1, "", italianstemmer), new Among("usioni", -1, 4, "", italianstemmer), new Among("azioni", -1, 2, "", italianstemmer), new Among("uzioni", -1, 4, "", italianstemmer), new Among("atori", -1, 2, "", italianstemmer), new Among("osi", -1, 1, "", italianstemmer), new Among("anti", -1, 1, "", italianstemmer), new Among("amenti", -1, 6, "", italianstemmer), new Among("imenti", -1, 6, "", italianstemmer), new Among("isti", -1, 1, "", italianstemmer), new Among("ivi", -1, 9, "", italianstemmer), new Among("ico", -1, 1, "", italianstemmer), new Among("ismo", -1, 1, "", italianstemmer), new Among("oso", -1, 1, "", italianstemmer), new Among("amento", -1, 6, "", italianstemmer), new Among("imento", -1, 6, "", italianstemmer), new Among("ivo", -1, 9, "", italianstemmer), new Among("ità", -1, 8, "", italianstemmer), new Among("istà", -1, 1, "", italianstemmer), new Among("istè", -1, 1, "", italianstemmer), new Among("istì", -1, 1, "", italianstemmer)};
        a_7 = new Among[]{new Among("isca", -1, 1, "", italianstemmer), new Among("enda", -1, 1, "", italianstemmer), new Among("ata", -1, 1, "", italianstemmer), new Among("ita", -1, 1, "", italianstemmer), new Among("uta", -1, 1, "", italianstemmer), new Among("ava", -1, 1, "", italianstemmer), new Among("eva", -1, 1, "", italianstemmer), new Among("iva", -1, 1, "", italianstemmer), new Among("erebbe", -1, 1, "", italianstemmer), new Among("irebbe", -1, 1, "", italianstemmer), new Among("isce", -1, 1, "", italianstemmer), new Among("ende", -1, 1, "", italianstemmer), new Among("are", -1, 1, "", italianstemmer), new Among("ere", -1, 1, "", italianstemmer), new Among("ire", -1, 1, "", italianstemmer), new Among("asse", -1, 1, "", italianstemmer), new Among("ate", -1, 1, "", italianstemmer), new Among("avate", 16, 1, "", italianstemmer), new Among("evate", 16, 1, "", italianstemmer), new Among("ivate", 16, 1, "", italianstemmer), new Among("ete", -1, 1, "", italianstemmer), new Among("erete", 20, 1, "", italianstemmer), new Among("irete", 20, 1, "", italianstemmer), new Among("ite", -1, 1, "", italianstemmer), new Among("ereste", -1, 1, "", italianstemmer), new Among("ireste", -1, 1, "", italianstemmer), new Among("ute", -1, 1, "", italianstemmer), new Among("erai", -1, 1, "", italianstemmer), new Among("irai", -1, 1, "", italianstemmer), new Among("isci", -1, 1, "", italianstemmer), new Among("endi", -1, 1, "", italianstemmer), new Among("erei", -1, 1, "", italianstemmer), new Among("irei", -1, 1, "", italianstemmer), new Among("assi", -1, 1, "", italianstemmer), new Among("ati", -1, 1, "", italianstemmer), new Among("iti", -1, 1, "", italianstemmer), new Among("eresti", -1, 1, "", italianstemmer), new Among("iresti", -1, 1, "", italianstemmer), new Among("uti", -1, 1, "", italianstemmer), new Among("avi", -1, 1, "", italianstemmer), new Among("evi", -1, 1, "", italianstemmer), new Among("ivi", -1, 1, "", italianstemmer), new Among("isco", -1, 1, "", italianstemmer), new Among("ando", -1, 1, "", italianstemmer), new Among("endo", -1, 1, "", italianstemmer), new Among("Yamo", -1, 1, "", italianstemmer), new Among("iamo", -1, 1, "", italianstemmer), new Among("avamo", -1, 1, "", italianstemmer), new Among("evamo", -1, 1, "", italianstemmer), new Among("ivamo", -1, 1, "", italianstemmer), new Among("eremo", -1, 1, "", italianstemmer), new Among("iremo", -1, 1, "", italianstemmer), new Among("assimo", -1, 1, "", italianstemmer), new Among("ammo", -1, 1, "", italianstemmer), new Among("emmo", -1, 1, "", italianstemmer), new Among("eremmo", 54, 1, "", italianstemmer), new Among("iremmo", 54, 1, "", italianstemmer), new Among("immo", -1, 1, "", italianstemmer), new Among("ano", -1, 1, "", italianstemmer), new Among("iscano", 58, 1, "", italianstemmer), new Among("avano", 58, 1, "", italianstemmer), new Among("evano", 58, 1, "", italianstemmer), new Among("ivano", 58, 1, "", italianstemmer), new Among("eranno", -1, 1, "", italianstemmer), new Among("iranno", -1, 1, "", italianstemmer), new Among("ono", -1, 1, "", italianstemmer), new Among("iscono", 65, 1, "", italianstemmer), new Among("arono", 65, 1, "", italianstemmer), new Among("erono", 65, 1, "", italianstemmer), new Among("irono", 65, 1, "", italianstemmer), new Among("erebbero", -1, 1, "", italianstemmer), new Among("irebbero", -1, 1, "", italianstemmer), new Among("assero", -1, 1, "", italianstemmer), new Among("essero", -1, 1, "", italianstemmer), new Among("issero", -1, 1, "", italianstemmer), new Among("ato", -1, 1, "", italianstemmer), new Among("ito", -1, 1, "", italianstemmer), new Among("uto", -1, 1, "", italianstemmer), new Among("avo", -1, 1, "", italianstemmer), new Among("evo", -1, 1, "", italianstemmer), new Among("ivo", -1, 1, "", italianstemmer), new Among("ar", -1, 1, "", italianstemmer), new Among("ir", -1, 1, "", italianstemmer), new Among("erà", -1, 1, "", italianstemmer), new Among("irà", -1, 1, "", italianstemmer), new Among("erò", -1, 1, "", italianstemmer), new Among("irò", -1, 1, "", italianstemmer)};
        g_v = new char[]{17, 'A', 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 128, 128, '\b', 2, 1};
        g_AEIO = new char[]{17, 'A', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 128, 128, '\b', 2};
        g_CG = new char[]{17};
    }

    private void copy_from(italianStemmer italianstemmer) {
        this.I_p2 = italianstemmer.I_p2;
        this.I_p1 = italianstemmer.I_p1;
        this.I_pV = italianstemmer.I_pV;
        super.copy_from((SnowballProgram) italianstemmer);
    }

    private boolean r_prelude() {
        int i;
        int i2;
        int i3 = this.cursor;
        while (true) {
            i = this.cursor;
            this.bra = this.cursor;
            int find_among = find_among(a_0, 7);
            if (find_among != 0) {
                this.ket = this.cursor;
                switch (find_among) {
                    case 1:
                        slice_from("à");
                        continue;
                    case 2:
                        slice_from("è");
                        continue;
                    case 3:
                        slice_from("ì");
                        continue;
                    case 4:
                        slice_from("ò");
                        continue;
                    case 5:
                        slice_from("ù");
                        continue;
                    case 6:
                        slice_from("qU");
                        continue;
                    case 7:
                        if (this.cursor >= this.limit) {
                            break;
                        } else {
                            this.cursor++;
                        }
                }
            }
        }
        this.cursor = i;
        this.cursor = i3;
        while (true) {
            int i4 = this.cursor;
            while (true) {
                i2 = this.cursor;
                char[] cArr = g_v;
                if (in_grouping(cArr, 97, 249)) {
                    this.bra = this.cursor;
                    int i5 = this.cursor;
                    if (eq_s(1, "u")) {
                        this.ket = this.cursor;
                        if (in_grouping(cArr, 97, 249)) {
                            slice_from("U");
                        }
                    }
                    this.cursor = i5;
                    if (eq_s(1, "i")) {
                        this.ket = this.cursor;
                        if (in_grouping(cArr, 97, 249)) {
                            slice_from("I");
                        }
                    }
                }
                this.cursor = i2;
                if (this.cursor < this.limit) {
                    this.cursor++;
                } else {
                    this.cursor = i4;
                    return true;
                }
            }
            this.cursor = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean r_mark_regions() {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tartarus.snowball.ext.italianStemmer.r_mark_regions():boolean");
    }

    private boolean r_postlude() {
        int i;
        while (true) {
            i = this.cursor;
            this.bra = this.cursor;
            int find_among = find_among(a_1, 3);
            if (find_among == 0) {
                break;
            }
            this.ket = this.cursor;
            if (find_among == 0) {
                break;
            }
            if (find_among == 1) {
                slice_from("i");
            } else if (find_among == 2) {
                slice_from("u");
            } else if (find_among != 3) {
                continue;
            } else {
                if (this.cursor >= this.limit) {
                    break;
                }
                this.cursor++;
            }
        }
        this.cursor = i;
        return true;
    }

    private boolean r_RV() {
        return this.I_pV <= this.cursor;
    }

    private boolean r_R1() {
        return this.I_p1 <= this.cursor;
    }

    private boolean r_R2() {
        return this.I_p2 <= this.cursor;
    }

    private boolean r_attached_pronoun() {
        this.ket = this.cursor;
        boolean z = false;
        if (find_among_b(a_2, 37) == 0) {
            return false;
        }
        this.bra = this.cursor;
        int find_among_b = find_among_b(a_3, 5);
        if (find_among_b == 0 || !r_RV()) {
            return false;
        }
        if (find_among_b != 0) {
            z = true;
            if (find_among_b == 1) {
                slice_del();
            } else if (find_among_b == 2) {
                slice_from("e");
            }
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private boolean r_standard_suffix() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_6, 51);
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        switch (find_among_b) {
            case 0:
                return false;
            case 1:
                if (!r_R2()) {
                    return false;
                }
                slice_del();
                return true;
            case 2:
                if (!r_R2()) {
                    return false;
                }
                slice_del();
                int i = this.limit - this.cursor;
                this.ket = this.cursor;
                if (!eq_s_b(2, "ic")) {
                    this.cursor = this.limit - i;
                } else {
                    this.bra = this.cursor;
                    if (!r_R2()) {
                        this.cursor = this.limit - i;
                    } else {
                        slice_del();
                    }
                }
                return true;
            case 3:
                if (!r_R2()) {
                    return false;
                }
                slice_from("log");
                return true;
            case 4:
                if (!r_R2()) {
                    return false;
                }
                slice_from("u");
                return true;
            case 5:
                if (!r_R2()) {
                    return false;
                }
                slice_from("ente");
                return true;
            case 6:
                if (!r_RV()) {
                    return false;
                }
                slice_del();
                return true;
            case 7:
                if (!r_R1()) {
                    return false;
                }
                slice_del();
                int i2 = this.limit - this.cursor;
                this.ket = this.cursor;
                int find_among_b2 = find_among_b(a_4, 4);
                if (find_among_b2 == 0) {
                    this.cursor = this.limit - i2;
                } else {
                    this.bra = this.cursor;
                    if (!r_R2()) {
                        this.cursor = this.limit - i2;
                    } else {
                        slice_del();
                        if (find_among_b2 == 0) {
                            this.cursor = this.limit - i2;
                        } else if (find_among_b2 == 1) {
                            this.ket = this.cursor;
                            if (!eq_s_b(2, "at")) {
                                this.cursor = this.limit - i2;
                            } else {
                                this.bra = this.cursor;
                                if (!r_R2()) {
                                    this.cursor = this.limit - i2;
                                } else {
                                    slice_del();
                                }
                            }
                        }
                    }
                }
                return true;
            case 8:
                if (!r_R2()) {
                    return false;
                }
                slice_del();
                int i3 = this.limit - this.cursor;
                this.ket = this.cursor;
                int find_among_b3 = find_among_b(a_5, 3);
                if (find_among_b3 == 0) {
                    this.cursor = this.limit - i3;
                } else {
                    this.bra = this.cursor;
                    if (find_among_b3 == 0) {
                        this.cursor = this.limit - i3;
                    } else if (find_among_b3 == 1) {
                        if (!r_R2()) {
                            this.cursor = this.limit - i3;
                        } else {
                            slice_del();
                        }
                    }
                }
                return true;
            case 9:
                if (!r_R2()) {
                    return false;
                }
                slice_del();
                int i4 = this.limit - this.cursor;
                this.ket = this.cursor;
                if (!eq_s_b(2, "at")) {
                    this.cursor = this.limit - i4;
                } else {
                    this.bra = this.cursor;
                    if (!r_R2()) {
                        this.cursor = this.limit - i4;
                    } else {
                        slice_del();
                        this.ket = this.cursor;
                        if (!eq_s_b(2, "ic")) {
                            this.cursor = this.limit - i4;
                        } else {
                            this.bra = this.cursor;
                            if (!r_R2()) {
                                this.cursor = this.limit - i4;
                            } else {
                                slice_del();
                            }
                        }
                    }
                }
                return true;
            default:
                return true;
        }
    }

    private boolean r_verb_suffix() {
        int i = this.limit - this.cursor;
        int i2 = this.cursor;
        int i3 = this.I_pV;
        if (i2 < i3) {
            return false;
        }
        this.cursor = i3;
        int i4 = this.limit_backward;
        this.limit_backward = this.cursor;
        this.cursor = this.limit - i;
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_7, 87);
        if (find_among_b == 0) {
            this.limit_backward = i4;
            return false;
        }
        this.bra = this.cursor;
        if (find_among_b == 0) {
            this.limit_backward = i4;
            return false;
        }
        if (find_among_b == 1) {
            slice_del();
        }
        this.limit_backward = i4;
        return true;
    }

    private boolean r_vowel_suffix() {
        int i = this.limit - this.cursor;
        this.ket = this.cursor;
        if (!in_grouping_b(g_AEIO, 97, 242)) {
            this.cursor = this.limit - i;
        } else {
            this.bra = this.cursor;
            if (!r_RV()) {
                this.cursor = this.limit - i;
            } else {
                slice_del();
                this.ket = this.cursor;
                if (!eq_s_b(1, "i")) {
                    this.cursor = this.limit - i;
                } else {
                    this.bra = this.cursor;
                    if (!r_RV()) {
                        this.cursor = this.limit - i;
                    } else {
                        slice_del();
                    }
                }
            }
        }
        int i2 = this.limit - this.cursor;
        this.ket = this.cursor;
        if (!eq_s_b(1, "h")) {
            this.cursor = this.limit - i2;
        } else {
            this.bra = this.cursor;
            if (!in_grouping_b(g_CG, 99, 103)) {
                this.cursor = this.limit - i2;
            } else if (!r_RV()) {
                this.cursor = this.limit - i2;
            } else {
                slice_del();
            }
        }
        return true;
    }

    @Override // org.tartarus.snowball.SnowballStemmer
    public boolean stem() {
        int i = this.cursor;
        r_prelude();
        this.cursor = i;
        int i2 = this.cursor;
        r_mark_regions();
        this.cursor = i2;
        this.limit_backward = this.cursor;
        this.cursor = this.limit;
        int i3 = this.limit - this.cursor;
        r_attached_pronoun();
        this.cursor = this.limit - i3;
        int i4 = this.limit - this.cursor;
        int i5 = this.limit - this.cursor;
        if (!r_standard_suffix()) {
            this.cursor = this.limit - i5;
            r_verb_suffix();
        }
        this.cursor = this.limit - i4;
        int i6 = this.limit - this.cursor;
        r_vowel_suffix();
        this.cursor = this.limit - i6;
        this.cursor = this.limit_backward;
        int i7 = this.cursor;
        r_postlude();
        this.cursor = i7;
        return true;
    }

    public boolean equals(Object obj) {
        return obj instanceof italianStemmer;
    }

    public int hashCode() {
        return "org.tartarus.snowball.ext.italianStemmer".hashCode();
    }
}
