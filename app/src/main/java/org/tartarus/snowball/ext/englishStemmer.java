package org.tartarus.snowball.ext;

import org.tartarus.snowball.Among;
import org.tartarus.snowball.SnowballProgram;
import org.tartarus.snowball.SnowballStemmer;

/* loaded from: classes.dex */
public class englishStemmer extends SnowballStemmer {
    private static final Among[] a_0;
    private static final Among[] a_1;
    private static final Among[] a_10;
    private static final Among[] a_2;
    private static final Among[] a_3;
    private static final Among[] a_4;
    private static final Among[] a_5;
    private static final Among[] a_6;
    private static final Among[] a_7;
    private static final Among[] a_8;
    private static final Among[] a_9;
    private static final char[] g_v;
    private static final char[] g_v_WXY;
    private static final char[] g_valid_LI;
    private static final englishStemmer methodObject;
    private static final long serialVersionUID = 1;
    private boolean B_Y_found;
    private int I_p1;
    private int I_p2;

    static {
        englishStemmer englishstemmer = new englishStemmer();
        methodObject = englishstemmer;
        a_0 = new Among[]{new Among("arsen", -1, -1, "", englishstemmer), new Among("commun", -1, -1, "", englishstemmer), new Among("gener", -1, -1, "", englishstemmer)};
        a_1 = new Among[]{new Among("'", -1, 1, "", englishstemmer), new Among("'s'", 0, 1, "", englishstemmer), new Among("'s", -1, 1, "", englishstemmer)};
        a_2 = new Among[]{new Among("ied", -1, 2, "", englishstemmer), new Among("s", -1, 3, "", englishstemmer), new Among("ies", 1, 2, "", englishstemmer), new Among("sses", 1, 1, "", englishstemmer), new Among("ss", 1, -1, "", englishstemmer), new Among("us", 1, -1, "", englishstemmer)};
        a_3 = new Among[]{new Among("", -1, 3, "", englishstemmer), new Among("bb", 0, 2, "", englishstemmer), new Among("dd", 0, 2, "", englishstemmer), new Among("ff", 0, 2, "", englishstemmer), new Among("gg", 0, 2, "", englishstemmer), new Among("bl", 0, 1, "", englishstemmer), new Among("mm", 0, 2, "", englishstemmer), new Among("nn", 0, 2, "", englishstemmer), new Among("pp", 0, 2, "", englishstemmer), new Among("rr", 0, 2, "", englishstemmer), new Among("at", 0, 1, "", englishstemmer), new Among("tt", 0, 2, "", englishstemmer), new Among("iz", 0, 1, "", englishstemmer)};
        a_4 = new Among[]{new Among("ed", -1, 2, "", englishstemmer), new Among("eed", 0, 1, "", englishstemmer), new Among("ing", -1, 2, "", englishstemmer), new Among("edly", -1, 2, "", englishstemmer), new Among("eedly", 3, 1, "", englishstemmer), new Among("ingly", -1, 2, "", englishstemmer)};
        a_5 = new Among[]{new Among("anci", -1, 3, "", englishstemmer), new Among("enci", -1, 2, "", englishstemmer), new Among("ogi", -1, 13, "", englishstemmer), new Among("li", -1, 16, "", englishstemmer), new Among("bli", 3, 12, "", englishstemmer), new Among("abli", 4, 4, "", englishstemmer), new Among("alli", 3, 8, "", englishstemmer), new Among("fulli", 3, 14, "", englishstemmer), new Among("lessli", 3, 15, "", englishstemmer), new Among("ousli", 3, 10, "", englishstemmer), new Among("entli", 3, 5, "", englishstemmer), new Among("aliti", -1, 8, "", englishstemmer), new Among("biliti", -1, 12, "", englishstemmer), new Among("iviti", -1, 11, "", englishstemmer), new Among("tional", -1, 1, "", englishstemmer), new Among("ational", 14, 7, "", englishstemmer), new Among("alism", -1, 8, "", englishstemmer), new Among("ation", -1, 7, "", englishstemmer), new Among("ization", 17, 6, "", englishstemmer), new Among("izer", -1, 6, "", englishstemmer), new Among("ator", -1, 7, "", englishstemmer), new Among("iveness", -1, 11, "", englishstemmer), new Among("fulness", -1, 9, "", englishstemmer), new Among("ousness", -1, 10, "", englishstemmer)};
        a_6 = new Among[]{new Among("icate", -1, 4, "", englishstemmer), new Among("ative", -1, 6, "", englishstemmer), new Among("alize", -1, 3, "", englishstemmer), new Among("iciti", -1, 4, "", englishstemmer), new Among("ical", -1, 4, "", englishstemmer), new Among("tional", -1, 1, "", englishstemmer), new Among("ational", 5, 2, "", englishstemmer), new Among("ful", -1, 5, "", englishstemmer), new Among("ness", -1, 5, "", englishstemmer)};
        a_7 = new Among[]{new Among("ic", -1, 1, "", englishstemmer), new Among("ance", -1, 1, "", englishstemmer), new Among("ence", -1, 1, "", englishstemmer), new Among("able", -1, 1, "", englishstemmer), new Among("ible", -1, 1, "", englishstemmer), new Among("ate", -1, 1, "", englishstemmer), new Among("ive", -1, 1, "", englishstemmer), new Among("ize", -1, 1, "", englishstemmer), new Among("iti", -1, 1, "", englishstemmer), new Among("al", -1, 1, "", englishstemmer), new Among("ism", -1, 1, "", englishstemmer), new Among("ion", -1, 2, "", englishstemmer), new Among("er", -1, 1, "", englishstemmer), new Among("ous", -1, 1, "", englishstemmer), new Among("ant", -1, 1, "", englishstemmer), new Among("ent", -1, 1, "", englishstemmer), new Among("ment", 15, 1, "", englishstemmer), new Among("ement", 16, 1, "", englishstemmer)};
        a_8 = new Among[]{new Among("e", -1, 1, "", englishstemmer), new Among("l", -1, 2, "", englishstemmer)};
        a_9 = new Among[]{new Among("succeed", -1, -1, "", englishstemmer), new Among("proceed", -1, -1, "", englishstemmer), new Among("exceed", -1, -1, "", englishstemmer), new Among("canning", -1, -1, "", englishstemmer), new Among("inning", -1, -1, "", englishstemmer), new Among("earring", -1, -1, "", englishstemmer), new Among("herring", -1, -1, "", englishstemmer), new Among("outing", -1, -1, "", englishstemmer)};
        a_10 = new Among[]{new Among("andes", -1, -1, "", englishstemmer), new Among("atlas", -1, -1, "", englishstemmer), new Among("bias", -1, -1, "", englishstemmer), new Among("cosmos", -1, -1, "", englishstemmer), new Among("dying", -1, 3, "", englishstemmer), new Among("early", -1, 9, "", englishstemmer), new Among("gently", -1, 7, "", englishstemmer), new Among("howe", -1, -1, "", englishstemmer), new Among("idly", -1, 6, "", englishstemmer), new Among("lying", -1, 4, "", englishstemmer), new Among("news", -1, -1, "", englishstemmer), new Among("only", -1, 10, "", englishstemmer), new Among("singly", -1, 11, "", englishstemmer), new Among("skies", -1, 2, "", englishstemmer), new Among("skis", -1, 1, "", englishstemmer), new Among("sky", -1, -1, "", englishstemmer), new Among("tying", -1, 5, "", englishstemmer), new Among("ugly", -1, 8, "", englishstemmer)};
        g_v = new char[]{17, 'A', 16, 1};
        g_v_WXY = new char[]{1, 17, 'A', 208, 1};
        g_valid_LI = new char[]{'7', 141, 2};
    }

    private void copy_from(englishStemmer englishstemmer) {
        this.B_Y_found = englishstemmer.B_Y_found;
        this.I_p2 = englishstemmer.I_p2;
        this.I_p1 = englishstemmer.I_p1;
        super.copy_from((SnowballProgram) englishstemmer);
    }

    private boolean r_prelude() {
        int i;
        this.B_Y_found = false;
        int i2 = this.cursor;
        this.bra = this.cursor;
        if (eq_s(1, "'")) {
            this.ket = this.cursor;
            slice_del();
        }
        this.cursor = i2;
        int i3 = this.cursor;
        this.bra = this.cursor;
        if (eq_s(1, "y")) {
            this.ket = this.cursor;
            slice_from("Y");
            this.B_Y_found = true;
        }
        this.cursor = i3;
        int i4 = this.cursor;
        while (true) {
            int i5 = this.cursor;
            while (true) {
                i = this.cursor;
                if (in_grouping(g_v, 97, 121)) {
                    this.bra = this.cursor;
                    if (eq_s(1, "y")) {
                        break;
                    }
                }
                this.cursor = i;
                if (this.cursor < this.limit) {
                    this.cursor++;
                } else {
                    this.cursor = i5;
                    this.cursor = i4;
                    return true;
                }
            }
            this.ket = this.cursor;
            this.cursor = i;
            slice_from("Y");
            this.B_Y_found = true;
        }
    }

    private boolean r_mark_regions() {
        this.I_p1 = this.limit;
        this.I_p2 = this.limit;
        int i = this.cursor;
        int i2 = this.cursor;
        if (find_among(a_0, 3) == 0) {
            this.cursor = i2;
            while (true) {
                if (!in_grouping(g_v, 97, 121)) {
                    if (this.cursor >= this.limit) {
                        break;
                    }
                    this.cursor++;
                } else {
                    while (!out_grouping(g_v, 97, 121)) {
                        if (this.cursor >= this.limit) {
                            break;
                        }
                        this.cursor++;
                    }
                }
            }
            this.cursor = i;
            return true;
        }
        this.I_p1 = this.cursor;
        while (true) {
            if (in_grouping(g_v, 97, 121)) {
                while (true) {
                    if (!out_grouping(g_v, 97, 121)) {
                        if (this.cursor >= this.limit) {
                            break;
                        }
                        this.cursor++;
                    } else {
                        this.I_p2 = this.cursor;
                        break;
                    }
                }
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

    private boolean r_shortv() {
        int i = this.limit - this.cursor;
        if (out_grouping_b(g_v_WXY, 89, 121)) {
            char[] cArr = g_v;
            if (in_grouping_b(cArr, 97, 121) && out_grouping_b(cArr, 97, 121)) {
                return true;
            }
        }
        this.cursor = this.limit - i;
        char[] cArr2 = g_v;
        return out_grouping_b(cArr2, 97, 121) && in_grouping_b(cArr2, 97, 121) && this.cursor <= this.limit_backward;
    }

    private boolean r_R1() {
        return this.I_p1 <= this.cursor;
    }

    private boolean r_R2() {
        return this.I_p2 <= this.cursor;
    }

    private boolean r_Step_1a() {
        int i = this.limit - this.cursor;
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_1, 3);
        if (find_among_b == 0) {
            this.cursor = this.limit - i;
        } else {
            this.bra = this.cursor;
            if (find_among_b == 0) {
                this.cursor = this.limit - i;
            } else if (find_among_b == 1) {
                slice_del();
            }
        }
        this.ket = this.cursor;
        int find_among_b2 = find_among_b(a_2, 6);
        if (find_among_b2 == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (find_among_b2 == 0) {
            return false;
        }
        if (find_among_b2 == 1) {
            slice_from("ss");
        } else if (find_among_b2 == 2) {
            int i2 = this.limit - this.cursor;
            int i3 = this.cursor - 2;
            if (this.limit_backward <= i3 && i3 <= this.limit) {
                this.cursor = i3;
                slice_from("i");
            } else {
                this.cursor = this.limit - i2;
                slice_from("ie");
            }
        } else if (find_among_b2 == 3) {
            if (this.cursor <= this.limit_backward) {
                return false;
            }
            this.cursor--;
            while (!in_grouping_b(g_v, 97, 121)) {
                if (this.cursor <= this.limit_backward) {
                    return false;
                }
                this.cursor--;
            }
            slice_del();
        }
        return true;
    }

    private boolean r_Step_1b() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_4, 6);
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (find_among_b == 0) {
            return false;
        }
        if (find_among_b != 1) {
            if (find_among_b == 2) {
                int i = this.limit - this.cursor;
                while (!in_grouping_b(g_v, 97, 121)) {
                    if (this.cursor <= this.limit_backward) {
                        return false;
                    }
                    this.cursor--;
                }
                this.cursor = this.limit - i;
                slice_del();
                int i2 = this.limit - this.cursor;
                int find_among_b2 = find_among_b(a_3, 13);
                if (find_among_b2 == 0) {
                    return false;
                }
                this.cursor = this.limit - i2;
                if (find_among_b2 == 0) {
                    return false;
                }
                if (find_among_b2 == 1) {
                    int i3 = this.cursor;
                    insert(this.cursor, this.cursor, "e");
                    this.cursor = i3;
                } else if (find_among_b2 == 2) {
                    this.ket = this.cursor;
                    if (this.cursor <= this.limit_backward) {
                        return false;
                    }
                    this.cursor--;
                    this.bra = this.cursor;
                    slice_del();
                } else if (find_among_b2 == 3) {
                    if (this.cursor != this.I_p1) {
                        return false;
                    }
                    int i4 = this.limit - this.cursor;
                    if (!r_shortv()) {
                        return false;
                    }
                    this.cursor = this.limit - i4;
                    int i5 = this.cursor;
                    insert(this.cursor, this.cursor, "e");
                    this.cursor = i5;
                }
            }
        } else {
            if (!r_R1()) {
                return false;
            }
            slice_from("ee");
        }
        return true;
    }

    private boolean r_Step_1c() {
        this.ket = this.cursor;
        int i = this.limit - this.cursor;
        if (!eq_s_b(1, "y")) {
            this.cursor = this.limit - i;
            if (!eq_s_b(1, "Y")) {
                return false;
            }
        }
        this.bra = this.cursor;
        if (!out_grouping_b(g_v, 97, 121)) {
            return false;
        }
        int i2 = this.limit - this.cursor;
        if (this.cursor <= this.limit_backward) {
            return false;
        }
        this.cursor = this.limit - i2;
        slice_from("i");
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private boolean r_Step_2() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_5, 24);
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (!r_R1()) {
            return false;
        }
        switch (find_among_b) {
            case 0:
                return false;
            case 1:
                slice_from("tion");
                return true;
            case 2:
                slice_from("ence");
                return true;
            case 3:
                slice_from("ance");
                return true;
            case 4:
                slice_from("able");
                return true;
            case 5:
                slice_from("ent");
                return true;
            case 6:
                slice_from("ize");
                return true;
            case 7:
                slice_from("ate");
                return true;
            case 8:
                slice_from("al");
                return true;
            case 9:
                slice_from("ful");
                return true;
            case 10:
                slice_from("ous");
                return true;
            case 11:
                slice_from("ive");
                return true;
            case 12:
                slice_from("ble");
                return true;
            case 13:
                if (!eq_s_b(1, "l")) {
                    return false;
                }
                slice_from("og");
                return true;
            case 14:
                slice_from("ful");
                return true;
            case 15:
                slice_from("less");
                return true;
            case 16:
                if (!in_grouping_b(g_valid_LI, 99, 116)) {
                    return false;
                }
                slice_del();
                return true;
            default:
                return true;
        }
    }

    private boolean r_Step_3() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_6, 9);
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (!r_R1()) {
            return false;
        }
        switch (find_among_b) {
            case 1:
                slice_from("tion");
                break;
            case 2:
                slice_from("ate");
                break;
            case 3:
                slice_from("al");
                break;
            case 4:
                slice_from("ic");
                break;
            case 5:
                slice_del();
                break;
            case 6:
                if (r_R2()) {
                    slice_del();
                    break;
                }
                break;
        }
        return false;
    }

    private boolean r_Step_4() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_7, 18);
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (!r_R2() || find_among_b == 0) {
            return false;
        }
        if (find_among_b == 1) {
            slice_del();
        } else if (find_among_b == 2) {
            int i = this.limit - this.cursor;
            if (!eq_s_b(1, "s")) {
                this.cursor = this.limit - i;
                if (!eq_s_b(1, "t")) {
                    return false;
                }
            }
            slice_del();
        }
        return true;
    }

    private boolean r_Step_5() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_8, 2);
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (find_among_b == 0) {
            return false;
        }
        if (find_among_b == 1) {
            int i = this.limit - this.cursor;
            if (!r_R2()) {
                this.cursor = this.limit - i;
                if (!r_R1()) {
                    return false;
                }
                int i2 = this.limit - this.cursor;
                if (r_shortv()) {
                    return false;
                }
                this.cursor = this.limit - i2;
            }
            slice_del();
        } else if (find_among_b == 2) {
            if (!r_R2() || !eq_s_b(1, "l")) {
                return false;
            }
            slice_del();
        }
        return true;
    }

    private boolean r_exception2() {
        this.ket = this.cursor;
        if (find_among_b(a_9, 8) == 0) {
            return false;
        }
        this.bra = this.cursor;
        return this.cursor <= this.limit_backward;
    }

    private boolean r_exception1() {
        this.bra = this.cursor;
        int find_among = find_among(a_10, 18);
        if (find_among == 0) {
            return false;
        }
        this.ket = this.cursor;
        if (this.cursor < this.limit) {
            return false;
        }
        switch (find_among) {
            case 1:
                slice_from("ski");
                break;
            case 2:
                slice_from("sky");
                break;
            case 3:
                slice_from("die");
                break;
            case 4:
                slice_from("lie");
                break;
            case 5:
                slice_from("tie");
                break;
            case 6:
                slice_from("idl");
                break;
            case 7:
                slice_from("gentl");
                break;
            case 8:
                slice_from("ugli");
                break;
            case 9:
                slice_from("earli");
                break;
            case 10:
                slice_from("onli");
                break;
            case 11:
                slice_from("singl");
                break;
        }
        return false;
    }

    private boolean r_postlude() {
        int i;
        if (!this.B_Y_found) {
            return false;
        }
        while (true) {
            int i2 = this.cursor;
            while (true) {
                i = this.cursor;
                this.bra = this.cursor;
                if (!eq_s(1, "Y")) {
                    this.cursor = i;
                    if (this.cursor < this.limit) {
                        this.cursor++;
                    } else {
                        this.cursor = i2;
                        return true;
                    }
                }
            }
            this.ket = this.cursor;
            this.cursor = i;
            slice_from("y");
        }
    }

    @Override // org.tartarus.snowball.SnowballStemmer
    public boolean stem() {
        int i = this.cursor;
        if (r_exception1()) {
            return true;
        }
        this.cursor = i;
        int i2 = this.cursor;
        int i3 = this.cursor + 3;
        if (i3 >= 0 && i3 <= this.limit) {
            this.cursor = i3;
            this.cursor = i;
            int i4 = this.cursor;
            r_prelude();
            this.cursor = i4;
            int i5 = this.cursor;
            r_mark_regions();
            this.cursor = i5;
            this.limit_backward = this.cursor;
            this.cursor = this.limit;
            int i6 = this.limit - this.cursor;
            r_Step_1a();
            this.cursor = this.limit - i6;
            int i7 = this.limit - this.cursor;
            if (!r_exception2()) {
                this.cursor = this.limit - i7;
                int i8 = this.limit - this.cursor;
                r_Step_1b();
                this.cursor = this.limit - i8;
                int i9 = this.limit - this.cursor;
                r_Step_1c();
                this.cursor = this.limit - i9;
                int i10 = this.limit - this.cursor;
                r_Step_2();
                this.cursor = this.limit - i10;
                int i11 = this.limit - this.cursor;
                r_Step_3();
                this.cursor = this.limit - i11;
                int i12 = this.limit - this.cursor;
                r_Step_4();
                this.cursor = this.limit - i12;
                int i13 = this.limit - this.cursor;
                r_Step_5();
                this.cursor = this.limit - i13;
            }
            this.cursor = this.limit_backward;
            int i14 = this.cursor;
            r_postlude();
            this.cursor = i14;
            return true;
        }
        this.cursor = i2;
        return true;
    }

    public boolean equals(Object obj) {
        return obj instanceof englishStemmer;
    }

    public int hashCode() {
        return "org.tartarus.snowball.ext.englishStemmer".hashCode();
    }
}
