package org.tartarus.snowball.ext;

import org.tartarus.snowball.Among;
import org.tartarus.snowball.SnowballProgram;
import org.tartarus.snowball.SnowballStemmer;

/* loaded from: classes.dex */
public class frenchStemmer extends SnowballStemmer {
    private static final Among[] a_0;
    private static final Among[] a_1;
    private static final Among[] a_2;
    private static final Among[] a_3;
    private static final Among[] a_4;
    private static final Among[] a_5;
    private static final Among[] a_6;
    private static final Among[] a_7;
    private static final Among[] a_8;
    private static final char[] g_keep_with_s;
    private static final char[] g_v;
    private static final frenchStemmer methodObject;
    private static final long serialVersionUID = 1;
    private int I_p1;
    private int I_p2;
    private int I_pV;

    static {
        frenchStemmer frenchstemmer = new frenchStemmer();
        methodObject = frenchstemmer;
        a_0 = new Among[]{new Among("col", -1, -1, "", frenchstemmer), new Among("par", -1, -1, "", frenchstemmer), new Among("tap", -1, -1, "", frenchstemmer)};
        a_1 = new Among[]{new Among("", -1, 4, "", frenchstemmer), new Among("I", 0, 1, "", frenchstemmer), new Among("U", 0, 2, "", frenchstemmer), new Among("Y", 0, 3, "", frenchstemmer)};
        a_2 = new Among[]{new Among("iqU", -1, 3, "", frenchstemmer), new Among("abl", -1, 3, "", frenchstemmer), new Among("Ièr", -1, 4, "", frenchstemmer), new Among("ièr", -1, 4, "", frenchstemmer), new Among("eus", -1, 2, "", frenchstemmer), new Among("iv", -1, 1, "", frenchstemmer)};
        a_3 = new Among[]{new Among("ic", -1, 2, "", frenchstemmer), new Among("abil", -1, 1, "", frenchstemmer), new Among("iv", -1, 3, "", frenchstemmer)};
        a_4 = new Among[]{new Among("iqUe", -1, 1, "", frenchstemmer), new Among("atrice", -1, 2, "", frenchstemmer), new Among("ance", -1, 1, "", frenchstemmer), new Among("ence", -1, 5, "", frenchstemmer), new Among("logie", -1, 3, "", frenchstemmer), new Among("able", -1, 1, "", frenchstemmer), new Among("isme", -1, 1, "", frenchstemmer), new Among("euse", -1, 11, "", frenchstemmer), new Among("iste", -1, 1, "", frenchstemmer), new Among("ive", -1, 8, "", frenchstemmer), new Among("if", -1, 8, "", frenchstemmer), new Among("usion", -1, 4, "", frenchstemmer), new Among("ation", -1, 2, "", frenchstemmer), new Among("ution", -1, 4, "", frenchstemmer), new Among("ateur", -1, 2, "", frenchstemmer), new Among("iqUes", -1, 1, "", frenchstemmer), new Among("atrices", -1, 2, "", frenchstemmer), new Among("ances", -1, 1, "", frenchstemmer), new Among("ences", -1, 5, "", frenchstemmer), new Among("logies", -1, 3, "", frenchstemmer), new Among("ables", -1, 1, "", frenchstemmer), new Among("ismes", -1, 1, "", frenchstemmer), new Among("euses", -1, 11, "", frenchstemmer), new Among("istes", -1, 1, "", frenchstemmer), new Among("ives", -1, 8, "", frenchstemmer), new Among("ifs", -1, 8, "", frenchstemmer), new Among("usions", -1, 4, "", frenchstemmer), new Among("ations", -1, 2, "", frenchstemmer), new Among("utions", -1, 4, "", frenchstemmer), new Among("ateurs", -1, 2, "", frenchstemmer), new Among("ments", -1, 15, "", frenchstemmer), new Among("ements", 30, 6, "", frenchstemmer), new Among("issements", 31, 12, "", frenchstemmer), new Among("ités", -1, 7, "", frenchstemmer), new Among("ment", -1, 15, "", frenchstemmer), new Among("ement", 34, 6, "", frenchstemmer), new Among("issement", 35, 12, "", frenchstemmer), new Among("amment", 34, 13, "", frenchstemmer), new Among("emment", 34, 14, "", frenchstemmer), new Among("aux", -1, 10, "", frenchstemmer), new Among("eaux", 39, 9, "", frenchstemmer), new Among("eux", -1, 1, "", frenchstemmer), new Among("ité", -1, 7, "", frenchstemmer)};
        a_5 = new Among[]{new Among("ira", -1, 1, "", frenchstemmer), new Among("ie", -1, 1, "", frenchstemmer), new Among("isse", -1, 1, "", frenchstemmer), new Among("issante", -1, 1, "", frenchstemmer), new Among("i", -1, 1, "", frenchstemmer), new Among("irai", 4, 1, "", frenchstemmer), new Among("ir", -1, 1, "", frenchstemmer), new Among("iras", -1, 1, "", frenchstemmer), new Among("ies", -1, 1, "", frenchstemmer), new Among("îmes", -1, 1, "", frenchstemmer), new Among("isses", -1, 1, "", frenchstemmer), new Among("issantes", -1, 1, "", frenchstemmer), new Among("îtes", -1, 1, "", frenchstemmer), new Among("is", -1, 1, "", frenchstemmer), new Among("irais", 13, 1, "", frenchstemmer), new Among("issais", 13, 1, "", frenchstemmer), new Among("irions", -1, 1, "", frenchstemmer), new Among("issions", -1, 1, "", frenchstemmer), new Among("irons", -1, 1, "", frenchstemmer), new Among("issons", -1, 1, "", frenchstemmer), new Among("issants", -1, 1, "", frenchstemmer), new Among("it", -1, 1, "", frenchstemmer), new Among("irait", 21, 1, "", frenchstemmer), new Among("issait", 21, 1, "", frenchstemmer), new Among("issant", -1, 1, "", frenchstemmer), new Among("iraIent", -1, 1, "", frenchstemmer), new Among("issaIent", -1, 1, "", frenchstemmer), new Among("irent", -1, 1, "", frenchstemmer), new Among("issent", -1, 1, "", frenchstemmer), new Among("iront", -1, 1, "", frenchstemmer), new Among("ît", -1, 1, "", frenchstemmer), new Among("iriez", -1, 1, "", frenchstemmer), new Among("issiez", -1, 1, "", frenchstemmer), new Among("irez", -1, 1, "", frenchstemmer), new Among("issez", -1, 1, "", frenchstemmer)};
        a_6 = new Among[]{new Among("a", -1, 3, "", frenchstemmer), new Among("era", 0, 2, "", frenchstemmer), new Among("asse", -1, 3, "", frenchstemmer), new Among("ante", -1, 3, "", frenchstemmer), new Among("ée", -1, 2, "", frenchstemmer), new Among("ai", -1, 3, "", frenchstemmer), new Among("erai", 5, 2, "", frenchstemmer), new Among("er", -1, 2, "", frenchstemmer), new Among("as", -1, 3, "", frenchstemmer), new Among("eras", 8, 2, "", frenchstemmer), new Among("âmes", -1, 3, "", frenchstemmer), new Among("asses", -1, 3, "", frenchstemmer), new Among("antes", -1, 3, "", frenchstemmer), new Among("âtes", -1, 3, "", frenchstemmer), new Among("ées", -1, 2, "", frenchstemmer), new Among("ais", -1, 3, "", frenchstemmer), new Among("erais", 15, 2, "", frenchstemmer), new Among("ions", -1, 1, "", frenchstemmer), new Among("erions", 17, 2, "", frenchstemmer), new Among("assions", 17, 3, "", frenchstemmer), new Among("erons", -1, 2, "", frenchstemmer), new Among("ants", -1, 3, "", frenchstemmer), new Among("és", -1, 2, "", frenchstemmer), new Among("ait", -1, 3, "", frenchstemmer), new Among("erait", 23, 2, "", frenchstemmer), new Among("ant", -1, 3, "", frenchstemmer), new Among("aIent", -1, 3, "", frenchstemmer), new Among("eraIent", 26, 2, "", frenchstemmer), new Among("èrent", -1, 2, "", frenchstemmer), new Among("assent", -1, 3, "", frenchstemmer), new Among("eront", -1, 2, "", frenchstemmer), new Among("ât", -1, 3, "", frenchstemmer), new Among("ez", -1, 2, "", frenchstemmer), new Among("iez", 32, 2, "", frenchstemmer), new Among("eriez", 33, 2, "", frenchstemmer), new Among("assiez", 33, 3, "", frenchstemmer), new Among("erez", 32, 2, "", frenchstemmer), new Among("é", -1, 2, "", frenchstemmer)};
        a_7 = new Among[]{new Among("e", -1, 3, "", frenchstemmer), new Among("Ière", 0, 2, "", frenchstemmer), new Among("ière", 0, 2, "", frenchstemmer), new Among("ion", -1, 1, "", frenchstemmer), new Among("Ier", -1, 2, "", frenchstemmer), new Among("ier", -1, 2, "", frenchstemmer), new Among("ë", -1, 4, "", frenchstemmer)};
        a_8 = new Among[]{new Among("ell", -1, -1, "", frenchstemmer), new Among("eill", -1, -1, "", frenchstemmer), new Among("enn", -1, -1, "", frenchstemmer), new Among("onn", -1, -1, "", frenchstemmer), new Among("ett", -1, -1, "", frenchstemmer)};
        g_v = new char[]{17, 'A', 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 128, 130, 'g', '\b', 5};
        g_keep_with_s = new char[]{1, 'A', 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 128};
    }

    private void copy_from(frenchStemmer frenchstemmer) {
        this.I_p2 = frenchstemmer.I_p2;
        this.I_p1 = frenchstemmer.I_p1;
        this.I_pV = frenchstemmer.I_pV;
        super.copy_from((SnowballProgram) frenchstemmer);
    }

    private boolean r_prelude() {
        int i;
        while (true) {
            int i2 = this.cursor;
            while (true) {
                i = this.cursor;
                int i3 = this.cursor;
                char[] cArr = g_v;
                if (in_grouping(cArr, 97, 251)) {
                    this.bra = this.cursor;
                    int i4 = this.cursor;
                    if (eq_s(1, "u")) {
                        this.ket = this.cursor;
                        if (in_grouping(cArr, 97, 251)) {
                            slice_from("U");
                            break;
                        }
                    }
                    this.cursor = i4;
                    if (eq_s(1, "i")) {
                        this.ket = this.cursor;
                        if (in_grouping(cArr, 97, 251)) {
                            slice_from("I");
                            break;
                        }
                    }
                    this.cursor = i4;
                    if (eq_s(1, "y")) {
                        this.ket = this.cursor;
                        slice_from("Y");
                        break;
                    }
                }
                this.cursor = i3;
                this.bra = this.cursor;
                if (eq_s(1, "y")) {
                    this.ket = this.cursor;
                    if (in_grouping(cArr, 97, 251)) {
                        slice_from("Y");
                        break;
                    }
                }
                this.cursor = i3;
                if (eq_s(1, "q")) {
                    this.bra = this.cursor;
                    if (eq_s(1, "u")) {
                        this.ket = this.cursor;
                        slice_from("U");
                        break;
                    }
                }
                this.cursor = i;
                if (this.cursor < this.limit) {
                    this.cursor++;
                } else {
                    this.cursor = i2;
                    return true;
                }
            }
            this.cursor = i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean r_mark_regions() {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tartarus.snowball.ext.frenchStemmer.r_mark_regions():boolean");
    }

    private boolean r_postlude() {
        int i;
        while (true) {
            i = this.cursor;
            this.bra = this.cursor;
            int find_among = find_among(a_1, 4);
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
            } else if (find_among == 3) {
                slice_from("y");
            } else if (find_among != 4) {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private boolean r_standard_suffix() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_4, 43);
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
                    int i2 = this.limit - this.cursor;
                    if (r_R2()) {
                        slice_del();
                    } else {
                        this.cursor = this.limit - i2;
                        slice_from("iqU");
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
                slice_from("ent");
                return true;
            case 6:
                if (!r_RV()) {
                    return false;
                }
                slice_del();
                int i3 = this.limit - this.cursor;
                this.ket = this.cursor;
                int find_among_b2 = find_among_b(a_2, 6);
                if (find_among_b2 == 0) {
                    this.cursor = this.limit - i3;
                } else {
                    this.bra = this.cursor;
                    if (find_among_b2 == 0) {
                        this.cursor = this.limit - i3;
                    } else if (find_among_b2 != 1) {
                        if (find_among_b2 == 2) {
                            int i4 = this.limit - this.cursor;
                            if (r_R2()) {
                                slice_del();
                            } else {
                                this.cursor = this.limit - i4;
                                if (!r_R1()) {
                                    this.cursor = this.limit - i3;
                                } else {
                                    slice_from("eux");
                                }
                            }
                        } else if (find_among_b2 != 3) {
                            if (find_among_b2 == 4) {
                                if (!r_RV()) {
                                    this.cursor = this.limit - i3;
                                } else {
                                    slice_from("i");
                                }
                            }
                        } else if (!r_R2()) {
                            this.cursor = this.limit - i3;
                        } else {
                            slice_del();
                        }
                    } else if (!r_R2()) {
                        this.cursor = this.limit - i3;
                    } else {
                        slice_del();
                        this.ket = this.cursor;
                        if (!eq_s_b(2, "at")) {
                            this.cursor = this.limit - i3;
                        } else {
                            this.bra = this.cursor;
                            if (!r_R2()) {
                                this.cursor = this.limit - i3;
                            } else {
                                slice_del();
                            }
                        }
                    }
                }
                return true;
            case 7:
                if (!r_R2()) {
                    return false;
                }
                slice_del();
                int i5 = this.limit - this.cursor;
                this.ket = this.cursor;
                int find_among_b3 = find_among_b(a_3, 3);
                if (find_among_b3 == 0) {
                    this.cursor = this.limit - i5;
                } else {
                    this.bra = this.cursor;
                    if (find_among_b3 == 0) {
                        this.cursor = this.limit - i5;
                    } else if (find_among_b3 == 1) {
                        int i6 = this.limit - this.cursor;
                        if (r_R2()) {
                            slice_del();
                        } else {
                            this.cursor = this.limit - i6;
                            slice_from("abl");
                        }
                    } else if (find_among_b3 == 2) {
                        int i7 = this.limit - this.cursor;
                        if (r_R2()) {
                            slice_del();
                        } else {
                            this.cursor = this.limit - i7;
                            slice_from("iqU");
                        }
                    } else if (find_among_b3 == 3) {
                        if (!r_R2()) {
                            this.cursor = this.limit - i5;
                        } else {
                            slice_del();
                        }
                    }
                }
                return true;
            case 8:
                if (!r_R2()) {
                    return false;
                }
                slice_del();
                int i8 = this.limit - this.cursor;
                this.ket = this.cursor;
                if (!eq_s_b(2, "at")) {
                    this.cursor = this.limit - i8;
                } else {
                    this.bra = this.cursor;
                    if (!r_R2()) {
                        this.cursor = this.limit - i8;
                    } else {
                        slice_del();
                        this.ket = this.cursor;
                        if (!eq_s_b(2, "ic")) {
                            this.cursor = this.limit - i8;
                        } else {
                            this.bra = this.cursor;
                            int i9 = this.limit - this.cursor;
                            if (r_R2()) {
                                slice_del();
                            } else {
                                this.cursor = this.limit - i9;
                                slice_from("iqU");
                            }
                        }
                    }
                }
                return true;
            case 9:
                slice_from("eau");
                return true;
            case 10:
                if (!r_R1()) {
                    return false;
                }
                slice_from("al");
                return true;
            case 11:
                int i10 = this.limit - this.cursor;
                if (r_R2()) {
                    slice_del();
                } else {
                    this.cursor = this.limit - i10;
                    if (!r_R1()) {
                        return false;
                    }
                    slice_from("eux");
                }
                return true;
            case 12:
                if (!r_R1() || !out_grouping_b(g_v, 97, 251)) {
                    return false;
                }
                slice_del();
                return true;
            case 13:
                if (!r_RV()) {
                    return false;
                }
                slice_from("ant");
                return false;
            case 14:
                if (!r_RV()) {
                    return false;
                }
                slice_from("ent");
                return false;
            case 15:
                int i11 = this.limit - this.cursor;
                if (!in_grouping_b(g_v, 97, 251) || !r_RV()) {
                    return false;
                }
                this.cursor = this.limit - i11;
                slice_del();
                return false;
            default:
                return true;
        }
    }

    private boolean r_i_verb_suffix() {
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
        int find_among_b = find_among_b(a_5, 35);
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
            if (!out_grouping_b(g_v, 97, 251)) {
                this.limit_backward = i4;
                return false;
            }
            slice_del();
        }
        this.limit_backward = i4;
        return true;
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
        int find_among_b = find_among_b(a_6, 38);
        if (find_among_b == 0) {
            this.limit_backward = i4;
            return false;
        }
        this.bra = this.cursor;
        if (find_among_b == 0) {
            this.limit_backward = i4;
            return false;
        }
        if (find_among_b != 1) {
            if (find_among_b == 2) {
                slice_del();
            } else if (find_among_b == 3) {
                slice_del();
                int i5 = this.limit - this.cursor;
                this.ket = this.cursor;
                if (!eq_s_b(1, "e")) {
                    this.cursor = this.limit - i5;
                } else {
                    this.bra = this.cursor;
                    slice_del();
                }
            }
        } else {
            if (!r_R2()) {
                this.limit_backward = i4;
                return false;
            }
            slice_del();
        }
        this.limit_backward = i4;
        return true;
    }

    private boolean r_residual_suffix() {
        int i = this.limit - this.cursor;
        this.ket = this.cursor;
        if (!eq_s_b(1, "s")) {
            this.cursor = this.limit - i;
        } else {
            this.bra = this.cursor;
            int i2 = this.limit - this.cursor;
            if (!out_grouping_b(g_keep_with_s, 97, 232)) {
                this.cursor = this.limit - i;
            } else {
                this.cursor = this.limit - i2;
                slice_del();
            }
        }
        int i3 = this.limit - this.cursor;
        int i4 = this.cursor;
        int i5 = this.I_pV;
        if (i4 < i5) {
            return false;
        }
        this.cursor = i5;
        int i6 = this.limit_backward;
        this.limit_backward = this.cursor;
        this.cursor = this.limit - i3;
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_7, 7);
        if (find_among_b == 0) {
            this.limit_backward = i6;
            return false;
        }
        this.bra = this.cursor;
        if (find_among_b == 0) {
            this.limit_backward = i6;
            return false;
        }
        if (find_among_b != 1) {
            if (find_among_b == 2) {
                slice_from("i");
            } else if (find_among_b == 3) {
                slice_del();
            } else if (find_among_b == 4) {
                if (!eq_s_b(2, "gu")) {
                    this.limit_backward = i6;
                    return false;
                }
                slice_del();
            }
        } else {
            if (!r_R2()) {
                this.limit_backward = i6;
                return false;
            }
            int i7 = this.limit - this.cursor;
            if (!eq_s_b(1, "s")) {
                this.cursor = this.limit - i7;
                if (!eq_s_b(1, "t")) {
                    this.limit_backward = i6;
                    return false;
                }
            }
            slice_del();
        }
        this.limit_backward = i6;
        return true;
    }

    private boolean r_un_double() {
        int i = this.limit - this.cursor;
        if (find_among_b(a_8, 5) == 0) {
            return false;
        }
        this.cursor = this.limit - i;
        this.ket = this.cursor;
        if (this.cursor <= this.limit_backward) {
            return false;
        }
        this.cursor--;
        this.bra = this.cursor;
        slice_del();
        return true;
    }

    private boolean r_un_accent() {
        int i = 1;
        while (out_grouping_b(g_v, 97, 251)) {
            i--;
        }
        if (i > 0) {
            return false;
        }
        this.ket = this.cursor;
        int i2 = this.limit - this.cursor;
        if (!eq_s_b(1, "é")) {
            this.cursor = this.limit - i2;
            if (!eq_s_b(1, "è")) {
                return false;
            }
        }
        this.bra = this.cursor;
        slice_from("e");
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
        int i4 = this.limit - this.cursor;
        int i5 = this.limit - this.cursor;
        int i6 = this.limit - this.cursor;
        if (!r_standard_suffix()) {
            this.cursor = this.limit - i6;
            if (!r_i_verb_suffix()) {
                this.cursor = this.limit - i6;
                if (!r_verb_suffix()) {
                    this.cursor = this.limit - i4;
                    r_residual_suffix();
                    this.cursor = this.limit - i3;
                    int i7 = this.limit - this.cursor;
                    r_un_double();
                    this.cursor = this.limit - i7;
                    int i8 = this.limit - this.cursor;
                    r_un_accent();
                    this.cursor = this.limit - i8;
                    this.cursor = this.limit_backward;
                    int i9 = this.cursor;
                    r_postlude();
                    this.cursor = i9;
                    return true;
                }
            }
        }
        this.cursor = this.limit - i5;
        int i10 = this.limit - this.cursor;
        this.ket = this.cursor;
        int i11 = this.limit - this.cursor;
        if (eq_s_b(1, "Y")) {
            this.bra = this.cursor;
            slice_from("i");
        } else {
            this.cursor = this.limit - i11;
            if (!eq_s_b(1, "ç")) {
                this.cursor = this.limit - i10;
            } else {
                this.bra = this.cursor;
                slice_from("c");
            }
        }
        this.cursor = this.limit - i3;
        int i72 = this.limit - this.cursor;
        r_un_double();
        this.cursor = this.limit - i72;
        int i82 = this.limit - this.cursor;
        r_un_accent();
        this.cursor = this.limit - i82;
        this.cursor = this.limit_backward;
        int i92 = this.cursor;
        r_postlude();
        this.cursor = i92;
        return true;
    }

    public boolean equals(Object obj) {
        return obj instanceof frenchStemmer;
    }

    public int hashCode() {
        return "org.tartarus.snowball.ext.frenchStemmer".hashCode();
    }
}
