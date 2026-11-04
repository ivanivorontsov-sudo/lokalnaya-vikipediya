package org.tartarus.snowball.ext;

import org.tartarus.snowball.Among;
import org.tartarus.snowball.SnowballProgram;
import org.tartarus.snowball.SnowballStemmer;

/* loaded from: classes.dex */
public class finnishStemmer extends SnowballStemmer {
    private static final Among[] a_0;
    private static final Among[] a_1;
    private static final Among[] a_2;
    private static final Among[] a_3;
    private static final Among[] a_4;
    private static final Among[] a_5;
    private static final Among[] a_6;
    private static final Among[] a_7;
    private static final Among[] a_8;
    private static final Among[] a_9;
    private static final char[] g_AEI;
    private static final char[] g_V1;
    private static final char[] g_V2;
    private static final char[] g_particle_end;
    private static final finnishStemmer methodObject;
    private static final long serialVersionUID = 1;
    private boolean B_ending_removed;
    private int I_p1;
    private int I_p2;
    private StringBuilder S_x = new StringBuilder();

    static {
        finnishStemmer finnishstemmer = new finnishStemmer();
        methodObject = finnishstemmer;
        a_0 = new Among[]{new Among("pa", -1, 1, "", finnishstemmer), new Among("sti", -1, 2, "", finnishstemmer), new Among("kaan", -1, 1, "", finnishstemmer), new Among("han", -1, 1, "", finnishstemmer), new Among("kin", -1, 1, "", finnishstemmer), new Among("hän", -1, 1, "", finnishstemmer), new Among("kään", -1, 1, "", finnishstemmer), new Among("ko", -1, 1, "", finnishstemmer), new Among("pä", -1, 1, "", finnishstemmer), new Among("kö", -1, 1, "", finnishstemmer)};
        a_1 = new Among[]{new Among("lla", -1, -1, "", finnishstemmer), new Among("na", -1, -1, "", finnishstemmer), new Among("ssa", -1, -1, "", finnishstemmer), new Among("ta", -1, -1, "", finnishstemmer), new Among("lta", 3, -1, "", finnishstemmer), new Among("sta", 3, -1, "", finnishstemmer)};
        a_2 = new Among[]{new Among("llä", -1, -1, "", finnishstemmer), new Among("nä", -1, -1, "", finnishstemmer), new Among("ssä", -1, -1, "", finnishstemmer), new Among("tä", -1, -1, "", finnishstemmer), new Among("ltä", 3, -1, "", finnishstemmer), new Among("stä", 3, -1, "", finnishstemmer)};
        a_3 = new Among[]{new Among("lle", -1, -1, "", finnishstemmer), new Among("ine", -1, -1, "", finnishstemmer)};
        a_4 = new Among[]{new Among("nsa", -1, 3, "", finnishstemmer), new Among("mme", -1, 3, "", finnishstemmer), new Among("nne", -1, 3, "", finnishstemmer), new Among("ni", -1, 2, "", finnishstemmer), new Among("si", -1, 1, "", finnishstemmer), new Among("an", -1, 4, "", finnishstemmer), new Among("en", -1, 6, "", finnishstemmer), new Among("än", -1, 5, "", finnishstemmer), new Among("nsä", -1, 3, "", finnishstemmer)};
        a_5 = new Among[]{new Among("aa", -1, -1, "", finnishstemmer), new Among("ee", -1, -1, "", finnishstemmer), new Among("ii", -1, -1, "", finnishstemmer), new Among("oo", -1, -1, "", finnishstemmer), new Among("uu", -1, -1, "", finnishstemmer), new Among("ää", -1, -1, "", finnishstemmer), new Among("öö", -1, -1, "", finnishstemmer)};
        a_6 = new Among[]{new Among("a", -1, 8, "", finnishstemmer), new Among("lla", 0, -1, "", finnishstemmer), new Among("na", 0, -1, "", finnishstemmer), new Among("ssa", 0, -1, "", finnishstemmer), new Among("ta", 0, -1, "", finnishstemmer), new Among("lta", 4, -1, "", finnishstemmer), new Among("sta", 4, -1, "", finnishstemmer), new Among("tta", 4, 9, "", finnishstemmer), new Among("lle", -1, -1, "", finnishstemmer), new Among("ine", -1, -1, "", finnishstemmer), new Among("ksi", -1, -1, "", finnishstemmer), new Among("n", -1, 7, "", finnishstemmer), new Among("han", 11, 1, "", finnishstemmer), new Among("den", 11, -1, "r_VI", finnishstemmer), new Among("seen", 11, -1, "r_LONG", finnishstemmer), new Among("hen", 11, 2, "", finnishstemmer), new Among("tten", 11, -1, "r_VI", finnishstemmer), new Among("hin", 11, 3, "", finnishstemmer), new Among("siin", 11, -1, "r_VI", finnishstemmer), new Among("hon", 11, 4, "", finnishstemmer), new Among("hän", 11, 5, "", finnishstemmer), new Among("hön", 11, 6, "", finnishstemmer), new Among("ä", -1, 8, "", finnishstemmer), new Among("llä", 22, -1, "", finnishstemmer), new Among("nä", 22, -1, "", finnishstemmer), new Among("ssä", 22, -1, "", finnishstemmer), new Among("tä", 22, -1, "", finnishstemmer), new Among("ltä", 26, -1, "", finnishstemmer), new Among("stä", 26, -1, "", finnishstemmer), new Among("ttä", 26, 9, "", finnishstemmer)};
        a_7 = new Among[]{new Among("eja", -1, -1, "", finnishstemmer), new Among("mma", -1, 1, "", finnishstemmer), new Among("imma", 1, -1, "", finnishstemmer), new Among("mpa", -1, 1, "", finnishstemmer), new Among("impa", 3, -1, "", finnishstemmer), new Among("mmi", -1, 1, "", finnishstemmer), new Among("immi", 5, -1, "", finnishstemmer), new Among("mpi", -1, 1, "", finnishstemmer), new Among("impi", 7, -1, "", finnishstemmer), new Among("ejä", -1, -1, "", finnishstemmer), new Among("mmä", -1, 1, "", finnishstemmer), new Among("immä", 10, -1, "", finnishstemmer), new Among("mpä", -1, 1, "", finnishstemmer), new Among("impä", 12, -1, "", finnishstemmer)};
        a_8 = new Among[]{new Among("i", -1, -1, "", finnishstemmer), new Among("j", -1, -1, "", finnishstemmer)};
        a_9 = new Among[]{new Among("mma", -1, 1, "", finnishstemmer), new Among("imma", 0, -1, "", finnishstemmer)};
        g_AEI = new char[]{17, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '\b'};
        g_V1 = new char[]{17, 'A', 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '\b', 0, ' '};
        g_V2 = new char[]{17, 'A', 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '\b', 0, ' '};
        g_particle_end = new char[]{17, 'a', 24, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '\b', 0, ' '};
    }

    private void copy_from(finnishStemmer finnishstemmer) {
        this.B_ending_removed = finnishstemmer.B_ending_removed;
        this.S_x = finnishstemmer.S_x;
        this.I_p2 = finnishstemmer.I_p2;
        this.I_p1 = finnishstemmer.I_p1;
        super.copy_from((SnowballProgram) finnishstemmer);
    }

    private boolean r_mark_regions() {
        this.I_p1 = this.limit;
        this.I_p2 = this.limit;
        while (true) {
            int i = this.cursor;
            if (in_grouping(g_V1, 97, 246)) {
                this.cursor = i;
                while (!out_grouping(g_V1, 97, 246)) {
                    if (this.cursor >= this.limit) {
                        return false;
                    }
                    this.cursor++;
                }
                this.I_p1 = this.cursor;
                while (true) {
                    int i2 = this.cursor;
                    if (in_grouping(g_V1, 97, 246)) {
                        this.cursor = i2;
                        while (!out_grouping(g_V1, 97, 246)) {
                            if (this.cursor >= this.limit) {
                                return false;
                            }
                            this.cursor++;
                        }
                        this.I_p2 = this.cursor;
                        return true;
                    }
                    this.cursor = i2;
                    if (this.cursor >= this.limit) {
                        return false;
                    }
                    this.cursor++;
                }
            } else {
                this.cursor = i;
                if (this.cursor >= this.limit) {
                    return false;
                }
                this.cursor++;
            }
        }
    }

    private boolean r_R2() {
        return this.I_p2 <= this.cursor;
    }

    private boolean r_particle_etc() {
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
        int find_among_b = find_among_b(a_0, 10);
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
            if (!in_grouping_b(g_particle_end, 97, 246)) {
                return false;
            }
        } else if (find_among_b == 2 && !r_R2()) {
            return false;
        }
        slice_del();
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private boolean r_possessive() {
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
        int find_among_b = find_among_b(a_4, 9);
        if (find_among_b == 0) {
            this.limit_backward = i4;
            return false;
        }
        this.bra = this.cursor;
        this.limit_backward = i4;
        switch (find_among_b) {
            case 1:
                int i5 = this.limit - this.cursor;
                if (!eq_s_b(1, "k")) {
                    this.cursor = this.limit - i5;
                    slice_del();
                    break;
                }
                break;
            case 2:
                slice_del();
                this.ket = this.cursor;
                if (eq_s_b(3, "kse")) {
                    this.bra = this.cursor;
                    slice_from("ksi");
                    break;
                }
                break;
            case 3:
                slice_del();
                break;
            case 4:
                if (find_among_b(a_1, 6) != 0) {
                    slice_del();
                    break;
                }
                break;
            case 5:
                if (find_among_b(a_2, 6) != 0) {
                    slice_del();
                    break;
                }
                break;
            case 6:
                if (find_among_b(a_3, 2) != 0) {
                    slice_del();
                    break;
                }
                break;
        }
        return false;
    }

    private boolean r_LONG() {
        return find_among_b(a_5, 7) != 0;
    }

    private boolean r_VI() {
        return eq_s_b(1, "i") && in_grouping_b(g_V2, 97, 246);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c9, code lost:
    
        if (eq_s_b(1, "a") == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean r_case_ending() {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tartarus.snowball.ext.finnishStemmer.r_case_ending():boolean");
    }

    private boolean r_other_endings() {
        int i = this.limit - this.cursor;
        int i2 = this.cursor;
        int i3 = this.I_p2;
        if (i2 < i3) {
            return false;
        }
        this.cursor = i3;
        int i4 = this.limit_backward;
        this.limit_backward = this.cursor;
        this.cursor = this.limit - i;
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_7, 14);
        if (find_among_b == 0) {
            this.limit_backward = i4;
            return false;
        }
        this.bra = this.cursor;
        this.limit_backward = i4;
        if (find_among_b != 0) {
            if (find_among_b == 1) {
                int i5 = this.limit - this.cursor;
                if (!eq_s_b(2, "po")) {
                    this.cursor = this.limit - i5;
                }
            }
            slice_del();
            return true;
        }
        return false;
    }

    private boolean r_i_plural() {
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
        if (find_among_b(a_8, 2) == 0) {
            this.limit_backward = i4;
            return false;
        }
        this.bra = this.cursor;
        this.limit_backward = i4;
        slice_del();
        return true;
    }

    private boolean r_t_plural() {
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
        if (!eq_s_b(1, "t")) {
            this.limit_backward = i4;
            return false;
        }
        this.bra = this.cursor;
        int i5 = this.limit - this.cursor;
        if (!in_grouping_b(g_V1, 97, 246)) {
            this.limit_backward = i4;
            return false;
        }
        this.cursor = this.limit - i5;
        slice_del();
        this.limit_backward = i4;
        int i6 = this.limit - this.cursor;
        int i7 = this.cursor;
        int i8 = this.I_p2;
        if (i7 < i8) {
            return false;
        }
        this.cursor = i8;
        int i9 = this.limit_backward;
        this.limit_backward = this.cursor;
        this.cursor = this.limit - i6;
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_9, 2);
        if (find_among_b == 0) {
            this.limit_backward = i9;
            return false;
        }
        this.bra = this.cursor;
        this.limit_backward = i9;
        if (find_among_b != 0) {
            if (find_among_b == 1) {
                int i10 = this.limit - this.cursor;
                if (!eq_s_b(2, "po")) {
                    this.cursor = this.limit - i10;
                }
            }
            slice_del();
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a8, code lost:
    
        if (eq_s_b(1, "u") == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean r_tidy() {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tartarus.snowball.ext.finnishStemmer.r_tidy():boolean");
    }

    @Override // org.tartarus.snowball.SnowballStemmer
    public boolean stem() {
        int i = this.cursor;
        r_mark_regions();
        this.cursor = i;
        this.B_ending_removed = false;
        this.limit_backward = this.cursor;
        this.cursor = this.limit;
        int i2 = this.limit - this.cursor;
        r_particle_etc();
        this.cursor = this.limit - i2;
        int i3 = this.limit - this.cursor;
        r_possessive();
        this.cursor = this.limit - i3;
        int i4 = this.limit - this.cursor;
        r_case_ending();
        this.cursor = this.limit - i4;
        int i5 = this.limit - this.cursor;
        r_other_endings();
        this.cursor = this.limit - i5;
        int i6 = this.limit - this.cursor;
        if (this.B_ending_removed) {
            int i7 = this.limit - this.cursor;
            r_i_plural();
            this.cursor = this.limit - i7;
        } else {
            this.cursor = this.limit - i6;
            int i8 = this.limit - this.cursor;
            r_t_plural();
            this.cursor = this.limit - i8;
        }
        int i9 = this.limit - this.cursor;
        r_tidy();
        this.cursor = this.limit - i9;
        this.cursor = this.limit_backward;
        return true;
    }

    public boolean equals(Object obj) {
        return obj instanceof finnishStemmer;
    }

    public int hashCode() {
        return "org.tartarus.snowball.ext.finnishStemmer".hashCode();
    }
}
