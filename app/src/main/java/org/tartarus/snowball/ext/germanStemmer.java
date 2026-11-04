package org.tartarus.snowball.ext;

import org.tartarus.snowball.Among;
import org.tartarus.snowball.SnowballProgram;
import org.tartarus.snowball.SnowballStemmer;

/* loaded from: classes.dex */
public class germanStemmer extends SnowballStemmer {
    private static final Among[] a_0;
    private static final Among[] a_1;
    private static final Among[] a_2;
    private static final Among[] a_3;
    private static final Among[] a_4;
    private static final char[] g_s_ending;
    private static final char[] g_st_ending;
    private static final char[] g_v;
    private static final germanStemmer methodObject;
    private static final long serialVersionUID = 1;
    private int I_p1;
    private int I_p2;
    private int I_x;

    static {
        germanStemmer germanstemmer = new germanStemmer();
        methodObject = germanstemmer;
        a_0 = new Among[]{new Among("", -1, 6, "", germanstemmer), new Among("U", 0, 2, "", germanstemmer), new Among("Y", 0, 1, "", germanstemmer), new Among("ä", 0, 3, "", germanstemmer), new Among("ö", 0, 4, "", germanstemmer), new Among("ü", 0, 5, "", germanstemmer)};
        a_1 = new Among[]{new Among("e", -1, 2, "", germanstemmer), new Among("em", -1, 1, "", germanstemmer), new Among("en", -1, 2, "", germanstemmer), new Among("ern", -1, 1, "", germanstemmer), new Among("er", -1, 1, "", germanstemmer), new Among("s", -1, 3, "", germanstemmer), new Among("es", 5, 2, "", germanstemmer)};
        a_2 = new Among[]{new Among("en", -1, 1, "", germanstemmer), new Among("er", -1, 1, "", germanstemmer), new Among("st", -1, 2, "", germanstemmer), new Among("est", 2, 1, "", germanstemmer)};
        a_3 = new Among[]{new Among("ig", -1, 1, "", germanstemmer), new Among("lich", -1, 1, "", germanstemmer)};
        a_4 = new Among[]{new Among("end", -1, 1, "", germanstemmer), new Among("ig", -1, 2, "", germanstemmer), new Among("ung", -1, 1, "", germanstemmer), new Among("lich", -1, 3, "", germanstemmer), new Among("isch", -1, 2, "", germanstemmer), new Among("ik", -1, 2, "", germanstemmer), new Among("heit", -1, 3, "", germanstemmer), new Among("keit", -1, 4, "", germanstemmer)};
        g_v = new char[]{17, 'A', 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '\b', 0, ' ', '\b'};
        g_s_ending = new char[]{'u', 30, 5};
        g_st_ending = new char[]{'u', 30, 4};
    }

    private void copy_from(germanStemmer germanstemmer) {
        this.I_x = germanstemmer.I_x;
        this.I_p2 = germanstemmer.I_p2;
        this.I_p1 = germanstemmer.I_p1;
        super.copy_from((SnowballProgram) germanstemmer);
    }

    private boolean r_prelude() {
        int i;
        int i2;
        int i3 = this.cursor;
        while (true) {
            i = this.cursor;
            int i4 = this.cursor;
            this.bra = this.cursor;
            if (eq_s(1, "ß")) {
                this.ket = this.cursor;
                slice_from("ss");
            } else {
                this.cursor = i4;
                if (this.cursor >= this.limit) {
                    break;
                }
                this.cursor++;
            }
        }
        this.cursor = i;
        this.cursor = i3;
        while (true) {
            int i5 = this.cursor;
            while (true) {
                i2 = this.cursor;
                char[] cArr = g_v;
                if (in_grouping(cArr, 97, 252)) {
                    this.bra = this.cursor;
                    int i6 = this.cursor;
                    if (eq_s(1, "u")) {
                        this.ket = this.cursor;
                        if (in_grouping(cArr, 97, 252)) {
                            slice_from("U");
                            break;
                        }
                    }
                    this.cursor = i6;
                    if (eq_s(1, "y")) {
                        this.ket = this.cursor;
                        if (in_grouping(cArr, 97, 252)) {
                            slice_from("Y");
                            break;
                        }
                    }
                }
                this.cursor = i2;
                if (this.cursor < this.limit) {
                    this.cursor++;
                } else {
                    this.cursor = i5;
                    return true;
                }
            }
            this.cursor = i2;
        }
    }

    private boolean r_mark_regions() {
        this.I_p1 = this.limit;
        this.I_p2 = this.limit;
        int i = this.cursor;
        int i2 = this.cursor + 3;
        if (i2 < 0 || i2 > this.limit) {
            return false;
        }
        this.cursor = i2;
        this.I_x = this.cursor;
        this.cursor = i;
        while (!in_grouping(g_v, 97, 252)) {
            if (this.cursor >= this.limit) {
                return false;
            }
            this.cursor++;
        }
        while (!out_grouping(g_v, 97, 252)) {
            if (this.cursor >= this.limit) {
                return false;
            }
            this.cursor++;
        }
        int i3 = this.cursor;
        this.I_p1 = i3;
        int i4 = this.I_x;
        if (i3 < i4) {
            this.I_p1 = i4;
        }
        while (!in_grouping(g_v, 97, 252)) {
            if (this.cursor >= this.limit) {
                return false;
            }
            this.cursor++;
        }
        while (!out_grouping(g_v, 97, 252)) {
            if (this.cursor >= this.limit) {
                return false;
            }
            this.cursor++;
        }
        this.I_p2 = this.cursor;
        return true;
    }

    private boolean r_postlude() {
        int i;
        while (true) {
            i = this.cursor;
            this.bra = this.cursor;
            int find_among = find_among(a_0, 6);
            if (find_among != 0) {
                this.ket = this.cursor;
                switch (find_among) {
                    case 1:
                        slice_from("y");
                        continue;
                    case 2:
                        slice_from("u");
                        continue;
                    case 3:
                        slice_from("a");
                        continue;
                    case 4:
                        slice_from("o");
                        continue;
                    case 5:
                        slice_from("u");
                        continue;
                    case 6:
                        if (this.cursor >= this.limit) {
                            break;
                        } else {
                            this.cursor++;
                        }
                }
            }
        }
        this.cursor = i;
        return true;
    }

    private boolean r_R1() {
        return this.I_p1 <= this.cursor;
    }

    private boolean r_R2() {
        return this.I_p2 <= this.cursor;
    }

    private boolean r_standard_suffix() {
        int i;
        int i2 = this.limit - this.cursor;
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_1, 7);
        if (find_among_b != 0) {
            this.bra = this.cursor;
            if (r_R1()) {
                if (find_among_b == 1) {
                    slice_del();
                } else if (find_among_b == 2) {
                    slice_del();
                    int i3 = this.limit - this.cursor;
                    this.ket = this.cursor;
                    if (!eq_s_b(1, "s")) {
                        this.cursor = this.limit - i3;
                    } else {
                        this.bra = this.cursor;
                        if (!eq_s_b(3, "nis")) {
                            this.cursor = this.limit - i3;
                        } else {
                            slice_del();
                        }
                    }
                } else if (find_among_b == 3 && in_grouping_b(g_s_ending, 98, 116)) {
                    slice_del();
                }
            }
        }
        this.cursor = this.limit - i2;
        int i4 = this.limit - this.cursor;
        this.ket = this.cursor;
        int find_among_b2 = find_among_b(a_2, 4);
        if (find_among_b2 != 0) {
            this.bra = this.cursor;
            if (r_R1()) {
                if (find_among_b2 == 1) {
                    slice_del();
                } else if (find_among_b2 == 2 && in_grouping_b(g_st_ending, 98, 116) && this.limit_backward <= (i = this.cursor - 3) && i <= this.limit) {
                    this.cursor = i;
                    slice_del();
                }
            }
        }
        this.cursor = this.limit - i4;
        int i5 = this.limit - this.cursor;
        this.ket = this.cursor;
        int find_among_b3 = find_among_b(a_4, 8);
        if (find_among_b3 != 0) {
            this.bra = this.cursor;
            if (r_R2()) {
                if (find_among_b3 == 1) {
                    slice_del();
                    int i6 = this.limit - this.cursor;
                    this.ket = this.cursor;
                    if (!eq_s_b(2, "ig")) {
                        this.cursor = this.limit - i6;
                    } else {
                        this.bra = this.cursor;
                        int i7 = this.limit - this.cursor;
                        if (eq_s_b(1, "e")) {
                            this.cursor = this.limit - i6;
                        } else {
                            this.cursor = this.limit - i7;
                            if (!r_R2()) {
                                this.cursor = this.limit - i6;
                            } else {
                                slice_del();
                            }
                        }
                    }
                } else if (find_among_b3 == 2) {
                    int i8 = this.limit - this.cursor;
                    if (!eq_s_b(1, "e")) {
                        this.cursor = this.limit - i8;
                        slice_del();
                    }
                } else if (find_among_b3 == 3) {
                    slice_del();
                    int i9 = this.limit - this.cursor;
                    this.ket = this.cursor;
                    int i10 = this.limit - this.cursor;
                    if (!eq_s_b(2, "er")) {
                        this.cursor = this.limit - i10;
                        if (!eq_s_b(2, "en")) {
                            this.cursor = this.limit - i9;
                        }
                    }
                    this.bra = this.cursor;
                    if (!r_R1()) {
                        this.cursor = this.limit - i9;
                    } else {
                        slice_del();
                    }
                } else if (find_among_b3 == 4) {
                    slice_del();
                    int i11 = this.limit - this.cursor;
                    this.ket = this.cursor;
                    int find_among_b4 = find_among_b(a_3, 2);
                    if (find_among_b4 == 0) {
                        this.cursor = this.limit - i11;
                    } else {
                        this.bra = this.cursor;
                        if (!r_R2()) {
                            this.cursor = this.limit - i11;
                        } else if (find_among_b4 == 0) {
                            this.cursor = this.limit - i11;
                        } else if (find_among_b4 == 1) {
                            slice_del();
                        }
                    }
                }
            }
        }
        this.cursor = this.limit - i5;
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
        r_standard_suffix();
        this.cursor = this.limit - i3;
        this.cursor = this.limit_backward;
        int i4 = this.cursor;
        r_postlude();
        this.cursor = i4;
        return true;
    }

    public boolean equals(Object obj) {
        return obj instanceof germanStemmer;
    }

    public int hashCode() {
        return "org.tartarus.snowball.ext.germanStemmer".hashCode();
    }
}
