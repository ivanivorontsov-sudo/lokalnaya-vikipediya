package org.tartarus.snowball.ext;

import org.tartarus.snowball.Among;
import org.tartarus.snowball.SnowballProgram;
import org.tartarus.snowball.SnowballStemmer;

/* loaded from: classes.dex */
public class porterStemmer extends SnowballStemmer {
    private static final Among[] a_0;
    private static final Among[] a_1;
    private static final Among[] a_2;
    private static final Among[] a_3;
    private static final Among[] a_4;
    private static final Among[] a_5;
    private static final char[] g_v;
    private static final char[] g_v_WXY;
    private static final porterStemmer methodObject;
    private static final long serialVersionUID = 1;
    private boolean B_Y_found;
    private int I_p1;
    private int I_p2;

    static {
        porterStemmer porterstemmer = new porterStemmer();
        methodObject = porterstemmer;
        a_0 = new Among[]{new Among("s", -1, 3, "", porterstemmer), new Among("ies", 0, 2, "", porterstemmer), new Among("sses", 0, 1, "", porterstemmer), new Among("ss", 0, -1, "", porterstemmer)};
        a_1 = new Among[]{new Among("", -1, 3, "", porterstemmer), new Among("bb", 0, 2, "", porterstemmer), new Among("dd", 0, 2, "", porterstemmer), new Among("ff", 0, 2, "", porterstemmer), new Among("gg", 0, 2, "", porterstemmer), new Among("bl", 0, 1, "", porterstemmer), new Among("mm", 0, 2, "", porterstemmer), new Among("nn", 0, 2, "", porterstemmer), new Among("pp", 0, 2, "", porterstemmer), new Among("rr", 0, 2, "", porterstemmer), new Among("at", 0, 1, "", porterstemmer), new Among("tt", 0, 2, "", porterstemmer), new Among("iz", 0, 1, "", porterstemmer)};
        a_2 = new Among[]{new Among("ed", -1, 2, "", porterstemmer), new Among("eed", 0, 1, "", porterstemmer), new Among("ing", -1, 2, "", porterstemmer)};
        a_3 = new Among[]{new Among("anci", -1, 3, "", porterstemmer), new Among("enci", -1, 2, "", porterstemmer), new Among("abli", -1, 4, "", porterstemmer), new Among("eli", -1, 6, "", porterstemmer), new Among("alli", -1, 9, "", porterstemmer), new Among("ousli", -1, 12, "", porterstemmer), new Among("entli", -1, 5, "", porterstemmer), new Among("aliti", -1, 10, "", porterstemmer), new Among("biliti", -1, 14, "", porterstemmer), new Among("iviti", -1, 13, "", porterstemmer), new Among("tional", -1, 1, "", porterstemmer), new Among("ational", 10, 8, "", porterstemmer), new Among("alism", -1, 10, "", porterstemmer), new Among("ation", -1, 8, "", porterstemmer), new Among("ization", 13, 7, "", porterstemmer), new Among("izer", -1, 7, "", porterstemmer), new Among("ator", -1, 8, "", porterstemmer), new Among("iveness", -1, 13, "", porterstemmer), new Among("fulness", -1, 11, "", porterstemmer), new Among("ousness", -1, 12, "", porterstemmer)};
        a_4 = new Among[]{new Among("icate", -1, 2, "", porterstemmer), new Among("ative", -1, 3, "", porterstemmer), new Among("alize", -1, 1, "", porterstemmer), new Among("iciti", -1, 2, "", porterstemmer), new Among("ical", -1, 2, "", porterstemmer), new Among("ful", -1, 3, "", porterstemmer), new Among("ness", -1, 3, "", porterstemmer)};
        a_5 = new Among[]{new Among("ic", -1, 1, "", porterstemmer), new Among("ance", -1, 1, "", porterstemmer), new Among("ence", -1, 1, "", porterstemmer), new Among("able", -1, 1, "", porterstemmer), new Among("ible", -1, 1, "", porterstemmer), new Among("ate", -1, 1, "", porterstemmer), new Among("ive", -1, 1, "", porterstemmer), new Among("ize", -1, 1, "", porterstemmer), new Among("iti", -1, 1, "", porterstemmer), new Among("al", -1, 1, "", porterstemmer), new Among("ism", -1, 1, "", porterstemmer), new Among("ion", -1, 2, "", porterstemmer), new Among("er", -1, 1, "", porterstemmer), new Among("ous", -1, 1, "", porterstemmer), new Among("ant", -1, 1, "", porterstemmer), new Among("ent", -1, 1, "", porterstemmer), new Among("ment", 15, 1, "", porterstemmer), new Among("ement", 16, 1, "", porterstemmer), new Among("ou", -1, 1, "", porterstemmer)};
        g_v = new char[]{17, 'A', 16, 1};
        g_v_WXY = new char[]{1, 17, 'A', 208, 1};
    }

    private void copy_from(porterStemmer porterstemmer) {
        this.B_Y_found = porterstemmer.B_Y_found;
        this.I_p2 = porterstemmer.I_p2;
        this.I_p1 = porterstemmer.I_p1;
        super.copy_from((SnowballProgram) porterstemmer);
    }

    private boolean r_shortv() {
        if (!out_grouping_b(g_v_WXY, 89, 121)) {
            return false;
        }
        char[] cArr = g_v;
        return in_grouping_b(cArr, 97, 121) && out_grouping_b(cArr, 97, 121);
    }

    private boolean r_R1() {
        return this.I_p1 <= this.cursor;
    }

    private boolean r_R2() {
        return this.I_p2 <= this.cursor;
    }

    private boolean r_Step_1a() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_0, 4);
        boolean z = false;
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (find_among_b != 0) {
            z = true;
            if (find_among_b == 1) {
                slice_from("ss");
            } else if (find_among_b == 2) {
                slice_from("i");
            } else if (find_among_b == 3) {
                slice_del();
            }
        }
        return z;
    }

    private boolean r_Step_1b() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_2, 3);
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
                int find_among_b2 = find_among_b(a_1, 13);
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
        while (!in_grouping_b(g_v, 97, 121)) {
            if (this.cursor <= this.limit_backward) {
                return false;
            }
            this.cursor--;
        }
        slice_from("i");
        return true;
    }

    private boolean r_Step_2() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_3, 20);
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
                slice_from("ence");
                break;
            case 3:
                slice_from("ance");
                break;
            case 4:
                slice_from("able");
                break;
            case 5:
                slice_from("ent");
                break;
            case 6:
                slice_from("e");
                break;
            case 7:
                slice_from("ize");
                break;
            case 8:
                slice_from("ate");
                break;
            case 9:
                slice_from("al");
                break;
            case 10:
                slice_from("al");
                break;
            case 11:
                slice_from("ful");
                break;
            case 12:
                slice_from("ous");
                break;
            case 13:
                slice_from("ive");
                break;
            case 14:
                slice_from("ble");
                break;
        }
        return false;
    }

    private boolean r_Step_3() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_4, 7);
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
                slice_from("al");
            } else if (find_among_b == 2) {
                slice_from("ic");
            } else if (find_among_b == 3) {
                slice_del();
            }
        }
        return z;
    }

    private boolean r_Step_4() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_5, 19);
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

    private boolean r_Step_5a() {
        this.ket = this.cursor;
        if (!eq_s_b(1, "e")) {
            return false;
        }
        this.bra = this.cursor;
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
        return true;
    }

    private boolean r_Step_5b() {
        this.ket = this.cursor;
        if (!eq_s_b(1, "l")) {
            return false;
        }
        this.bra = this.cursor;
        if (!r_R2() || !eq_s_b(1, "l")) {
            return false;
        }
        slice_del();
        return true;
    }

    @Override // org.tartarus.snowball.SnowballStemmer
    public boolean stem() {
        int i;
        int i2;
        int i3;
        int i4;
        this.B_Y_found = false;
        int i5 = this.cursor;
        this.bra = this.cursor;
        if (eq_s(1, "y")) {
            this.ket = this.cursor;
            slice_from("Y");
            this.B_Y_found = true;
        }
        this.cursor = i5;
        int i6 = this.cursor;
        loop0: while (true) {
            i = this.cursor;
            while (true) {
                i2 = this.cursor;
                if (in_grouping(g_v, 97, 121)) {
                    this.bra = this.cursor;
                    if (eq_s(1, "y")) {
                        break;
                    }
                }
                this.cursor = i2;
                if (this.cursor >= this.limit) {
                    break loop0;
                }
                this.cursor++;
            }
            this.ket = this.cursor;
            this.cursor = i2;
            slice_from("Y");
            this.B_Y_found = true;
        }
        this.cursor = i;
        this.cursor = i6;
        this.I_p1 = this.limit;
        this.I_p2 = this.limit;
        int i7 = this.cursor;
        while (true) {
            if (in_grouping(g_v, 97, 121)) {
                while (true) {
                    if (!out_grouping(g_v, 97, 121)) {
                        if (this.cursor >= this.limit) {
                            break;
                        }
                        this.cursor++;
                    } else {
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
                    }
                }
            } else {
                if (this.cursor >= this.limit) {
                    break;
                }
                this.cursor++;
            }
        }
        this.cursor = i7;
        this.limit_backward = this.cursor;
        this.cursor = this.limit;
        int i8 = this.limit - this.cursor;
        r_Step_1a();
        this.cursor = this.limit - i8;
        int i9 = this.limit - this.cursor;
        r_Step_1b();
        this.cursor = this.limit - i9;
        int i10 = this.limit - this.cursor;
        r_Step_1c();
        this.cursor = this.limit - i10;
        int i11 = this.limit - this.cursor;
        r_Step_2();
        this.cursor = this.limit - i11;
        int i12 = this.limit - this.cursor;
        r_Step_3();
        this.cursor = this.limit - i12;
        int i13 = this.limit - this.cursor;
        r_Step_4();
        this.cursor = this.limit - i13;
        int i14 = this.limit - this.cursor;
        r_Step_5a();
        this.cursor = this.limit - i14;
        int i15 = this.limit - this.cursor;
        r_Step_5b();
        this.cursor = this.limit - i15;
        this.cursor = this.limit_backward;
        int i16 = this.cursor;
        if (this.B_Y_found) {
            loop3: while (true) {
                i3 = this.cursor;
                while (true) {
                    i4 = this.cursor;
                    this.bra = this.cursor;
                    if (!eq_s(1, "Y")) {
                        this.cursor = i4;
                        if (this.cursor >= this.limit) {
                            break loop3;
                        }
                        this.cursor++;
                    }
                }
                this.ket = this.cursor;
                this.cursor = i4;
                slice_from("y");
            }
            this.cursor = i3;
        }
        this.cursor = i16;
        return true;
    }

    public boolean equals(Object obj) {
        return obj instanceof porterStemmer;
    }

    public int hashCode() {
        return "org.tartarus.snowball.ext.porterStemmer".hashCode();
    }
}
