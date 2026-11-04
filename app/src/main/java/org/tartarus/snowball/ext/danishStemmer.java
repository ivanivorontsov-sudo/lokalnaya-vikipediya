package org.tartarus.snowball.ext;

import org.tartarus.snowball.Among;
import org.tartarus.snowball.SnowballProgram;
import org.tartarus.snowball.SnowballStemmer;

/* loaded from: classes.dex */
public class danishStemmer extends SnowballStemmer {
    private static final Among[] a_0;
    private static final Among[] a_1;
    private static final Among[] a_2;
    private static final char[] g_s_ending;
    private static final char[] g_v;
    private static final danishStemmer methodObject;
    private static final long serialVersionUID = 1;
    private int I_p1;
    private int I_x;
    private StringBuilder S_ch = new StringBuilder();

    static {
        danishStemmer danishstemmer = new danishStemmer();
        methodObject = danishstemmer;
        a_0 = new Among[]{new Among("hed", -1, 1, "", danishstemmer), new Among("ethed", 0, 1, "", danishstemmer), new Among("ered", -1, 1, "", danishstemmer), new Among("e", -1, 1, "", danishstemmer), new Among("erede", 3, 1, "", danishstemmer), new Among("ende", 3, 1, "", danishstemmer), new Among("erende", 5, 1, "", danishstemmer), new Among("ene", 3, 1, "", danishstemmer), new Among("erne", 3, 1, "", danishstemmer), new Among("ere", 3, 1, "", danishstemmer), new Among("en", -1, 1, "", danishstemmer), new Among("heden", 10, 1, "", danishstemmer), new Among("eren", 10, 1, "", danishstemmer), new Among("er", -1, 1, "", danishstemmer), new Among("heder", 13, 1, "", danishstemmer), new Among("erer", 13, 1, "", danishstemmer), new Among("s", -1, 2, "", danishstemmer), new Among("heds", 16, 1, "", danishstemmer), new Among("es", 16, 1, "", danishstemmer), new Among("endes", 18, 1, "", danishstemmer), new Among("erendes", 19, 1, "", danishstemmer), new Among("enes", 18, 1, "", danishstemmer), new Among("ernes", 18, 1, "", danishstemmer), new Among("eres", 18, 1, "", danishstemmer), new Among("ens", 16, 1, "", danishstemmer), new Among("hedens", 24, 1, "", danishstemmer), new Among("erens", 24, 1, "", danishstemmer), new Among("ers", 16, 1, "", danishstemmer), new Among("ets", 16, 1, "", danishstemmer), new Among("erets", 28, 1, "", danishstemmer), new Among("et", -1, 1, "", danishstemmer), new Among("eret", 30, 1, "", danishstemmer)};
        a_1 = new Among[]{new Among("gd", -1, -1, "", danishstemmer), new Among("dt", -1, -1, "", danishstemmer), new Among("gt", -1, -1, "", danishstemmer), new Among("kt", -1, -1, "", danishstemmer)};
        a_2 = new Among[]{new Among("ig", -1, 1, "", danishstemmer), new Among("lig", 0, 1, "", danishstemmer), new Among("elig", 1, 1, "", danishstemmer), new Among("els", -1, 1, "", danishstemmer), new Among("løst", -1, 2, "", danishstemmer)};
        g_v = new char[]{17, 'A', 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '0', 0, 128};
        g_s_ending = new char[]{239, 254, '*', 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};
    }

    private void copy_from(danishStemmer danishstemmer) {
        this.I_x = danishstemmer.I_x;
        this.I_p1 = danishstemmer.I_p1;
        this.S_ch = danishstemmer.S_ch;
        super.copy_from((SnowballProgram) danishstemmer);
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
        int find_among_b = find_among_b(a_0, 32);
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
            if (!in_grouping_b(g_s_ending, 97, 229)) {
                return false;
            }
            slice_del();
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
        if (find_among_b(a_1, 4) == 0) {
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
        this.ket = this.cursor;
        if (eq_s_b(2, "st")) {
            this.bra = this.cursor;
            if (eq_s_b(2, "ig")) {
                slice_del();
            }
        }
        this.cursor = this.limit - i;
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
        int find_among_b = find_among_b(a_2, 5);
        if (find_among_b == 0) {
            this.limit_backward = i5;
            return false;
        }
        this.bra = this.cursor;
        this.limit_backward = i5;
        if (find_among_b == 0) {
            return false;
        }
        if (find_among_b == 1) {
            slice_del();
            int i6 = this.limit - this.cursor;
            r_consonant_pair();
            this.cursor = this.limit - i6;
        } else if (find_among_b == 2) {
            slice_from("løs");
        }
        return true;
    }

    private boolean r_undouble() {
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
        if (!out_grouping_b(g_v, 97, 248)) {
            this.limit_backward = i4;
            return false;
        }
        this.bra = this.cursor;
        this.S_ch = slice_to(this.S_ch);
        this.limit_backward = i4;
        if (!eq_v_b(this.S_ch)) {
            return false;
        }
        slice_del();
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
        int i5 = this.limit - this.cursor;
        r_undouble();
        this.cursor = this.limit - i5;
        this.cursor = this.limit_backward;
        return true;
    }

    public boolean equals(Object obj) {
        return obj instanceof danishStemmer;
    }

    public int hashCode() {
        return "org.tartarus.snowball.ext.danishStemmer".hashCode();
    }
}
