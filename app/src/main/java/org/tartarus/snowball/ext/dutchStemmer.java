package org.tartarus.snowball.ext;

import org.tartarus.snowball.Among;
import org.tartarus.snowball.SnowballProgram;
import org.tartarus.snowball.SnowballStemmer;

/* loaded from: classes.dex */
public class dutchStemmer extends SnowballStemmer {
    private static final Among[] a_0;
    private static final Among[] a_1;
    private static final Among[] a_2;
    private static final Among[] a_3;
    private static final Among[] a_4;
    private static final Among[] a_5;
    private static final char[] g_v;
    private static final char[] g_v_I;
    private static final char[] g_v_j;
    private static final dutchStemmer methodObject;
    private static final long serialVersionUID = 1;
    private boolean B_e_found;
    private int I_p1;
    private int I_p2;

    static {
        dutchStemmer dutchstemmer = new dutchStemmer();
        methodObject = dutchstemmer;
        a_0 = new Among[]{new Among("", -1, 6, "", dutchstemmer), new Among("á", 0, 1, "", dutchstemmer), new Among("ä", 0, 1, "", dutchstemmer), new Among("é", 0, 2, "", dutchstemmer), new Among("ë", 0, 2, "", dutchstemmer), new Among("í", 0, 3, "", dutchstemmer), new Among("ï", 0, 3, "", dutchstemmer), new Among("ó", 0, 4, "", dutchstemmer), new Among("ö", 0, 4, "", dutchstemmer), new Among("ú", 0, 5, "", dutchstemmer), new Among("ü", 0, 5, "", dutchstemmer)};
        a_1 = new Among[]{new Among("", -1, 3, "", dutchstemmer), new Among("I", 0, 2, "", dutchstemmer), new Among("Y", 0, 1, "", dutchstemmer)};
        a_2 = new Among[]{new Among("dd", -1, -1, "", dutchstemmer), new Among("kk", -1, -1, "", dutchstemmer), new Among("tt", -1, -1, "", dutchstemmer)};
        a_3 = new Among[]{new Among("ene", -1, 2, "", dutchstemmer), new Among("se", -1, 3, "", dutchstemmer), new Among("en", -1, 2, "", dutchstemmer), new Among("heden", 2, 1, "", dutchstemmer), new Among("s", -1, 3, "", dutchstemmer)};
        a_4 = new Among[]{new Among("end", -1, 1, "", dutchstemmer), new Among("ig", -1, 2, "", dutchstemmer), new Among("ing", -1, 1, "", dutchstemmer), new Among("lijk", -1, 3, "", dutchstemmer), new Among("baar", -1, 4, "", dutchstemmer), new Among("bar", -1, 5, "", dutchstemmer)};
        a_5 = new Among[]{new Among("aa", -1, -1, "", dutchstemmer), new Among("ee", -1, -1, "", dutchstemmer), new Among("oo", -1, -1, "", dutchstemmer), new Among("uu", -1, -1, "", dutchstemmer)};
        g_v = new char[]{17, 'A', 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 128};
        g_v_I = new char[]{1, 0, 0, 17, 'A', 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 128};
        g_v_j = new char[]{17, 'C', 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 128};
    }

    private void copy_from(dutchStemmer dutchstemmer) {
        this.I_p2 = dutchstemmer.I_p2;
        this.I_p1 = dutchstemmer.I_p1;
        this.B_e_found = dutchstemmer.B_e_found;
        super.copy_from((SnowballProgram) dutchstemmer);
    }

    private boolean r_prelude() {
        int i;
        int i2;
        int i3 = this.cursor;
        while (true) {
            i = this.cursor;
            this.bra = this.cursor;
            int find_among = find_among(a_0, 11);
            if (find_among != 0) {
                this.ket = this.cursor;
                switch (find_among) {
                    case 1:
                        slice_from("a");
                        continue;
                    case 2:
                        slice_from("e");
                        continue;
                    case 3:
                        slice_from("i");
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
        this.cursor = i3;
        int i4 = this.cursor;
        this.bra = this.cursor;
        if (!eq_s(1, "y")) {
            this.cursor = i4;
        } else {
            this.ket = this.cursor;
            slice_from("Y");
        }
        while (true) {
            int i5 = this.cursor;
            while (true) {
                i2 = this.cursor;
                char[] cArr = g_v;
                if (in_grouping(cArr, 97, 232)) {
                    this.bra = this.cursor;
                    int i6 = this.cursor;
                    if (eq_s(1, "i")) {
                        this.ket = this.cursor;
                        if (in_grouping(cArr, 97, 232)) {
                            slice_from("I");
                        }
                    }
                    this.cursor = i6;
                    if (eq_s(1, "y")) {
                        this.ket = this.cursor;
                        slice_from("Y");
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
        while (!in_grouping(g_v, 97, 232)) {
            if (this.cursor >= this.limit) {
                return false;
            }
            this.cursor++;
        }
        while (!out_grouping(g_v, 97, 232)) {
            if (this.cursor >= this.limit) {
                return false;
            }
            this.cursor++;
        }
        int i = this.cursor;
        this.I_p1 = i;
        if (i < 3) {
            this.I_p1 = 3;
        }
        while (!in_grouping(g_v, 97, 232)) {
            if (this.cursor >= this.limit) {
                return false;
            }
            this.cursor++;
        }
        while (!out_grouping(g_v, 97, 232)) {
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
            int find_among = find_among(a_1, 3);
            if (find_among == 0) {
                break;
            }
            this.ket = this.cursor;
            if (find_among == 0) {
                break;
            }
            if (find_among == 1) {
                slice_from("y");
            } else if (find_among == 2) {
                slice_from("i");
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

    private boolean r_R1() {
        return this.I_p1 <= this.cursor;
    }

    private boolean r_R2() {
        return this.I_p2 <= this.cursor;
    }

    private boolean r_undouble() {
        int i = this.limit - this.cursor;
        if (find_among_b(a_2, 3) == 0) {
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

    private boolean r_e_ending() {
        this.B_e_found = false;
        this.ket = this.cursor;
        if (!eq_s_b(1, "e")) {
            return false;
        }
        this.bra = this.cursor;
        if (!r_R1()) {
            return false;
        }
        int i = this.limit - this.cursor;
        if (!out_grouping_b(g_v, 97, 232)) {
            return false;
        }
        this.cursor = this.limit - i;
        slice_del();
        this.B_e_found = true;
        return r_undouble();
    }

    private boolean r_en_ending() {
        if (!r_R1()) {
            return false;
        }
        int i = this.limit - this.cursor;
        if (!out_grouping_b(g_v, 97, 232)) {
            return false;
        }
        this.cursor = this.limit - i;
        int i2 = this.limit - this.cursor;
        if (eq_s_b(3, "gem")) {
            return false;
        }
        this.cursor = this.limit - i2;
        slice_del();
        return r_undouble();
    }

    private boolean r_standard_suffix() {
        int i = this.limit - this.cursor;
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_3, 5);
        if (find_among_b != 0) {
            this.bra = this.cursor;
            if (find_among_b != 1) {
                if (find_among_b == 2) {
                    r_en_ending();
                } else if (find_among_b == 3 && r_R1() && out_grouping_b(g_v_j, 97, 232)) {
                    slice_del();
                }
            } else if (r_R1()) {
                slice_from("heid");
            }
        }
        this.cursor = this.limit - i;
        int i2 = this.limit - this.cursor;
        r_e_ending();
        this.cursor = this.limit - i2;
        int i3 = this.limit - this.cursor;
        this.ket = this.cursor;
        if (eq_s_b(4, "heid")) {
            this.bra = this.cursor;
            if (r_R2()) {
                int i4 = this.limit - this.cursor;
                if (!eq_s_b(1, "c")) {
                    this.cursor = this.limit - i4;
                    slice_del();
                    this.ket = this.cursor;
                    if (eq_s_b(2, "en")) {
                        this.bra = this.cursor;
                        r_en_ending();
                    }
                }
            }
        }
        this.cursor = this.limit - i3;
        int i5 = this.limit - this.cursor;
        this.ket = this.cursor;
        int find_among_b2 = find_among_b(a_4, 6);
        if (find_among_b2 != 0) {
            this.bra = this.cursor;
            if (find_among_b2 != 1) {
                if (find_among_b2 != 2) {
                    if (find_among_b2 != 3) {
                        if (find_among_b2 == 4) {
                            if (r_R2()) {
                                slice_del();
                            }
                        } else if (find_among_b2 == 5 && r_R2() && this.B_e_found) {
                            slice_del();
                        }
                    } else if (r_R2()) {
                        slice_del();
                        r_e_ending();
                    }
                } else if (r_R2()) {
                    int i6 = this.limit - this.cursor;
                    if (!eq_s_b(1, "e")) {
                        this.cursor = this.limit - i6;
                        slice_del();
                    }
                }
            } else if (r_R2()) {
                slice_del();
                int i7 = this.limit - this.cursor;
                this.ket = this.cursor;
                if (eq_s_b(2, "ig")) {
                    this.bra = this.cursor;
                    if (r_R2()) {
                        int i8 = this.limit - this.cursor;
                        if (!eq_s_b(1, "e")) {
                            this.cursor = this.limit - i8;
                            slice_del();
                        }
                    }
                }
                this.cursor = this.limit - i7;
                r_undouble();
            }
        }
        this.cursor = this.limit - i5;
        int i9 = this.limit - this.cursor;
        if (out_grouping_b(g_v_I, 73, 232)) {
            int i10 = this.limit - this.cursor;
            if (find_among_b(a_5, 4) != 0 && out_grouping_b(g_v, 97, 232)) {
                this.cursor = this.limit - i10;
                this.ket = this.cursor;
                if (this.cursor > this.limit_backward) {
                    this.cursor--;
                    this.bra = this.cursor;
                    slice_del();
                }
            }
        }
        this.cursor = this.limit - i9;
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
        return obj instanceof dutchStemmer;
    }

    public int hashCode() {
        return "org.tartarus.snowball.ext.dutchStemmer".hashCode();
    }
}
