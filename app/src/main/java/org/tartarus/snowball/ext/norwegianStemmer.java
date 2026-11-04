package org.tartarus.snowball.ext;

import org.tartarus.snowball.Among;
import org.tartarus.snowball.SnowballProgram;
import org.tartarus.snowball.SnowballStemmer;

/* loaded from: classes.dex */
public class norwegianStemmer extends SnowballStemmer {
    private static final Among[] a_0;
    private static final Among[] a_1;
    private static final Among[] a_2;
    private static final char[] g_s_ending;
    private static final char[] g_v;
    private static final norwegianStemmer methodObject;
    private static final long serialVersionUID = 1;
    private int I_p1;
    private int I_x;

    static {
        norwegianStemmer norwegianstemmer = new norwegianStemmer();
        methodObject = norwegianstemmer;
        a_0 = new Among[]{new Among("a", -1, 1, "", norwegianstemmer), new Among("e", -1, 1, "", norwegianstemmer), new Among("ede", 1, 1, "", norwegianstemmer), new Among("ande", 1, 1, "", norwegianstemmer), new Among("ende", 1, 1, "", norwegianstemmer), new Among("ane", 1, 1, "", norwegianstemmer), new Among("ene", 1, 1, "", norwegianstemmer), new Among("hetene", 6, 1, "", norwegianstemmer), new Among("erte", 1, 3, "", norwegianstemmer), new Among("en", -1, 1, "", norwegianstemmer), new Among("heten", 9, 1, "", norwegianstemmer), new Among("ar", -1, 1, "", norwegianstemmer), new Among("er", -1, 1, "", norwegianstemmer), new Among("heter", 12, 1, "", norwegianstemmer), new Among("s", -1, 2, "", norwegianstemmer), new Among("as", 14, 1, "", norwegianstemmer), new Among("es", 14, 1, "", norwegianstemmer), new Among("edes", 16, 1, "", norwegianstemmer), new Among("endes", 16, 1, "", norwegianstemmer), new Among("enes", 16, 1, "", norwegianstemmer), new Among("hetenes", 19, 1, "", norwegianstemmer), new Among("ens", 14, 1, "", norwegianstemmer), new Among("hetens", 21, 1, "", norwegianstemmer), new Among("ers", 14, 1, "", norwegianstemmer), new Among("ets", 14, 1, "", norwegianstemmer), new Among("et", -1, 1, "", norwegianstemmer), new Among("het", 25, 1, "", norwegianstemmer), new Among("ert", -1, 3, "", norwegianstemmer), new Among("ast", -1, 1, "", norwegianstemmer)};
        a_1 = new Among[]{new Among("dt", -1, -1, "", norwegianstemmer), new Among("vt", -1, -1, "", norwegianstemmer)};
        a_2 = new Among[]{new Among("leg", -1, 1, "", norwegianstemmer), new Among("eleg", 0, 1, "", norwegianstemmer), new Among("ig", -1, 1, "", norwegianstemmer), new Among("eig", 2, 1, "", norwegianstemmer), new Among("lig", 2, 1, "", norwegianstemmer), new Among("elig", 4, 1, "", norwegianstemmer), new Among("els", -1, 1, "", norwegianstemmer), new Among("lov", -1, 1, "", norwegianstemmer), new Among("elov", 7, 1, "", norwegianstemmer), new Among("slov", 7, 1, "", norwegianstemmer), new Among("hetslov", 9, 1, "", norwegianstemmer)};
        g_v = new char[]{17, 'A', 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '0', 0, 128};
        g_s_ending = new char[]{'w', '}', 149, 1};
    }

    private void copy_from(norwegianStemmer norwegianstemmer) {
        this.I_x = norwegianstemmer.I_x;
        this.I_p1 = norwegianstemmer.I_p1;
        super.copy_from((SnowballProgram) norwegianstemmer);
    }

    private boolean r_mark_regions() {
        this.I_p1 = this.limit;
        int i = this.cursor;
        int i2 = this.cursor + 3;
        if (i2 < 0 || i2 > this.limit) {
            return false;
        }
        this.cursor = i2;
        this.I_x = this.cursor;
        this.cursor = i;
        while (true) {
            int i3 = this.cursor;
            if (in_grouping(g_v, 97, 248)) {
                this.cursor = i3;
                while (!out_grouping(g_v, 97, 248)) {
                    if (this.cursor >= this.limit) {
                        return false;
                    }
                    this.cursor++;
                }
                int i4 = this.cursor;
                this.I_p1 = i4;
                int i5 = this.I_x;
                if (i4 < i5) {
                    this.I_p1 = i5;
                }
                return true;
            }
            this.cursor = i3;
            if (this.cursor >= this.limit) {
                return false;
            }
            this.cursor++;
        }
    }

    private boolean r_main_suffix() {
        int i = this.limit - this.cursor;
        int i2 = this.cursor;
        int i3 = this.I_p1;
        if (i2 < i3) {
            return false;
        }
        this.cursor = i3;
        int i4 = this.limit_backward;
        this.limit_backward = this.cursor;
        this.cursor = this.limit - i;
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_0, 29);
        if (find_among_b == 0) {
            this.limit_backward = i4;
            return false;
        }
        this.bra = this.cursor;
        this.limit_backward = i4;
        if (find_among_b == 0) {
            return false;
        }
        if (find_among_b == 1) {
            slice_del();
        } else if (find_among_b == 2) {
            int i5 = this.limit - this.cursor;
            if (!in_grouping_b(g_s_ending, 98, 122)) {
                this.cursor = this.limit - i5;
                if (!eq_s_b(1, "k") || !out_grouping_b(g_v, 97, 248)) {
                    return false;
                }
            }
            slice_del();
        } else if (find_among_b == 3) {
            slice_from("er");
        }
        return true;
    }

    private boolean r_consonant_pair() {
        int i = this.limit - this.cursor;
        int i2 = this.limit - this.cursor;
        int i3 = this.cursor;
        int i4 = this.I_p1;
        if (i3 < i4) {
            return false;
        }
        this.cursor = i4;
        int i5 = this.limit_backward;
        this.limit_backward = this.cursor;
        this.cursor = this.limit - i2;
        this.ket = this.cursor;
        if (find_among_b(a_1, 2) == 0) {
            this.limit_backward = i5;
            return false;
        }
        this.bra = this.cursor;
        this.limit_backward = i5;
        this.cursor = this.limit - i;
        if (this.cursor <= this.limit_backward) {
            return false;
        }
        this.cursor--;
        this.bra = this.cursor;
        slice_del();
        return true;
    }

    private boolean r_other_suffix() {
        int i = this.limit - this.cursor;
        int i2 = this.cursor;
        int i3 = this.I_p1;
        if (i2 < i3) {
            return false;
        }
        this.cursor = i3;
        int i4 = this.limit_backward;
        this.limit_backward = this.cursor;
        this.cursor = this.limit - i;
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_2, 11);
        if (find_among_b == 0) {
            this.limit_backward = i4;
            return false;
        }
        this.bra = this.cursor;
        this.limit_backward = i4;
        if (find_among_b == 0) {
            return false;
        }
        if (find_among_b == 1) {
            slice_del();
        }
        return true;
    }

    @Override // org.tartarus.snowball.SnowballStemmer
    public boolean stem() {
        int i = this.cursor;
        r_mark_regions();
        this.cursor = i;
        this.limit_backward = this.cursor;
        this.cursor = this.limit;
        int i2 = this.limit - this.cursor;
        r_main_suffix();
        this.cursor = this.limit - i2;
        int i3 = this.limit - this.cursor;
        r_consonant_pair();
        this.cursor = this.limit - i3;
        int i4 = this.limit - this.cursor;
        r_other_suffix();
        this.cursor = this.limit - i4;
        this.cursor = this.limit_backward;
        return true;
    }

    public boolean equals(Object obj) {
        return obj instanceof norwegianStemmer;
    }

    public int hashCode() {
        return "org.tartarus.snowball.ext.norwegianStemmer".hashCode();
    }
}
