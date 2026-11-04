package org.tartarus.snowball.ext;

import org.tartarus.snowball.Among;
import org.tartarus.snowball.SnowballProgram;
import org.tartarus.snowball.SnowballStemmer;

/* loaded from: classes.dex */
public class swedishStemmer extends SnowballStemmer {
    private static final Among[] a_0;
    private static final Among[] a_1;
    private static final Among[] a_2;
    private static final char[] g_s_ending;
    private static final char[] g_v;
    private static final swedishStemmer methodObject;
    private static final long serialVersionUID = 1;
    private int I_p1;
    private int I_x;

    static {
        swedishStemmer swedishstemmer = new swedishStemmer();
        methodObject = swedishstemmer;
        a_0 = new Among[]{new Among("a", -1, 1, "", swedishstemmer), new Among("arna", 0, 1, "", swedishstemmer), new Among("erna", 0, 1, "", swedishstemmer), new Among("heterna", 2, 1, "", swedishstemmer), new Among("orna", 0, 1, "", swedishstemmer), new Among("ad", -1, 1, "", swedishstemmer), new Among("e", -1, 1, "", swedishstemmer), new Among("ade", 6, 1, "", swedishstemmer), new Among("ande", 6, 1, "", swedishstemmer), new Among("arne", 6, 1, "", swedishstemmer), new Among("are", 6, 1, "", swedishstemmer), new Among("aste", 6, 1, "", swedishstemmer), new Among("en", -1, 1, "", swedishstemmer), new Among("anden", 12, 1, "", swedishstemmer), new Among("aren", 12, 1, "", swedishstemmer), new Among("heten", 12, 1, "", swedishstemmer), new Among("ern", -1, 1, "", swedishstemmer), new Among("ar", -1, 1, "", swedishstemmer), new Among("er", -1, 1, "", swedishstemmer), new Among("heter", 18, 1, "", swedishstemmer), new Among("or", -1, 1, "", swedishstemmer), new Among("s", -1, 2, "", swedishstemmer), new Among("as", 21, 1, "", swedishstemmer), new Among("arnas", 22, 1, "", swedishstemmer), new Among("ernas", 22, 1, "", swedishstemmer), new Among("ornas", 22, 1, "", swedishstemmer), new Among("es", 21, 1, "", swedishstemmer), new Among("ades", 26, 1, "", swedishstemmer), new Among("andes", 26, 1, "", swedishstemmer), new Among("ens", 21, 1, "", swedishstemmer), new Among("arens", 29, 1, "", swedishstemmer), new Among("hetens", 29, 1, "", swedishstemmer), new Among("erns", 21, 1, "", swedishstemmer), new Among("at", -1, 1, "", swedishstemmer), new Among("andet", -1, 1, "", swedishstemmer), new Among("het", -1, 1, "", swedishstemmer), new Among("ast", -1, 1, "", swedishstemmer)};
        a_1 = new Among[]{new Among("dd", -1, -1, "", swedishstemmer), new Among("gd", -1, -1, "", swedishstemmer), new Among("nn", -1, -1, "", swedishstemmer), new Among("dt", -1, -1, "", swedishstemmer), new Among("gt", -1, -1, "", swedishstemmer), new Among("kt", -1, -1, "", swedishstemmer), new Among("tt", -1, -1, "", swedishstemmer)};
        a_2 = new Among[]{new Among("ig", -1, 1, "", swedishstemmer), new Among("lig", 0, 1, "", swedishstemmer), new Among("els", -1, 1, "", swedishstemmer), new Among("fullt", -1, 3, "", swedishstemmer), new Among("löst", -1, 2, "", swedishstemmer)};
        g_v = new char[]{17, 'A', 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 24, 0, ' '};
        g_s_ending = new char[]{'w', 127, 149};
    }

    private void copy_from(swedishStemmer swedishstemmer) {
        this.I_x = swedishstemmer.I_x;
        this.I_p1 = swedishstemmer.I_p1;
        super.copy_from((SnowballProgram) swedishstemmer);
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
            if (in_grouping(g_v, 97, 246)) {
                this.cursor = i3;
                while (!out_grouping(g_v, 97, 246)) {
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
        int find_among_b = find_among_b(a_0, 37);
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
            if (!in_grouping_b(g_s_ending, 98, 121)) {
                return false;
            }
            slice_del();
        }
        return true;
    }

    private boolean r_consonant_pair() {
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
        int i5 = this.limit - this.cursor;
        if (find_among_b(a_1, 7) == 0) {
            this.limit_backward = i4;
            return false;
        }
        this.cursor = this.limit - i5;
        this.ket = this.cursor;
        if (this.cursor <= this.limit_backward) {
            this.limit_backward = i4;
            return false;
        }
        this.cursor--;
        this.bra = this.cursor;
        slice_del();
        this.limit_backward = i4;
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
        int find_among_b = find_among_b(a_2, 5);
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
        } else if (find_among_b == 2) {
            slice_from("lös");
        } else if (find_among_b == 3) {
            slice_from("full");
        }
        this.limit_backward = i4;
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
        return obj instanceof swedishStemmer;
    }

    public int hashCode() {
        return "org.tartarus.snowball.ext.swedishStemmer".hashCode();
    }
}
