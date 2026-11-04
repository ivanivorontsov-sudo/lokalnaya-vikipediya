package org.tartarus.snowball.ext;

import org.tartarus.snowball.Among;
import org.tartarus.snowball.SnowballProgram;
import org.tartarus.snowball.SnowballStemmer;

/* loaded from: classes.dex */
public class turkishStemmer extends SnowballStemmer {
    private static final Among[] a_0;
    private static final Among[] a_1;
    private static final Among[] a_10;
    private static final Among[] a_11;
    private static final Among[] a_12;
    private static final Among[] a_13;
    private static final Among[] a_14;
    private static final Among[] a_15;
    private static final Among[] a_16;
    private static final Among[] a_17;
    private static final Among[] a_18;
    private static final Among[] a_19;
    private static final Among[] a_2;
    private static final Among[] a_20;
    private static final Among[] a_21;
    private static final Among[] a_22;
    private static final Among[] a_23;
    private static final Among[] a_3;
    private static final Among[] a_4;
    private static final Among[] a_5;
    private static final Among[] a_6;
    private static final Among[] a_7;
    private static final Among[] a_8;
    private static final Among[] a_9;
    private static final char[] g_U;
    private static final char[] g_vowel;
    private static final char[] g_vowel1;
    private static final char[] g_vowel2;
    private static final char[] g_vowel3;
    private static final char[] g_vowel4;
    private static final char[] g_vowel5;
    private static final char[] g_vowel6;
    private static final turkishStemmer methodObject;
    private static final long serialVersionUID = 1;
    private boolean B_continue_stemming_noun_suffixes;
    private int I_strlen;

    static {
        turkishStemmer turkishstemmer = new turkishStemmer();
        methodObject = turkishstemmer;
        a_0 = new Among[]{new Among("m", -1, -1, "", turkishstemmer), new Among("n", -1, -1, "", turkishstemmer), new Among("miz", -1, -1, "", turkishstemmer), new Among("niz", -1, -1, "", turkishstemmer), new Among("muz", -1, -1, "", turkishstemmer), new Among("nuz", -1, -1, "", turkishstemmer), new Among("müz", -1, -1, "", turkishstemmer), new Among("nüz", -1, -1, "", turkishstemmer), new Among("mız", -1, -1, "", turkishstemmer), new Among("nız", -1, -1, "", turkishstemmer)};
        a_1 = new Among[]{new Among("leri", -1, -1, "", turkishstemmer), new Among("ları", -1, -1, "", turkishstemmer)};
        a_2 = new Among[]{new Among("ni", -1, -1, "", turkishstemmer), new Among("nu", -1, -1, "", turkishstemmer), new Among("nü", -1, -1, "", turkishstemmer), new Among("nı", -1, -1, "", turkishstemmer)};
        a_3 = new Among[]{new Among("in", -1, -1, "", turkishstemmer), new Among("un", -1, -1, "", turkishstemmer), new Among("ün", -1, -1, "", turkishstemmer), new Among("ın", -1, -1, "", turkishstemmer)};
        a_4 = new Among[]{new Among("a", -1, -1, "", turkishstemmer), new Among("e", -1, -1, "", turkishstemmer)};
        a_5 = new Among[]{new Among("na", -1, -1, "", turkishstemmer), new Among("ne", -1, -1, "", turkishstemmer)};
        a_6 = new Among[]{new Among("da", -1, -1, "", turkishstemmer), new Among("ta", -1, -1, "", turkishstemmer), new Among("de", -1, -1, "", turkishstemmer), new Among("te", -1, -1, "", turkishstemmer)};
        a_7 = new Among[]{new Among("nda", -1, -1, "", turkishstemmer), new Among("nde", -1, -1, "", turkishstemmer)};
        a_8 = new Among[]{new Among("dan", -1, -1, "", turkishstemmer), new Among("tan", -1, -1, "", turkishstemmer), new Among("den", -1, -1, "", turkishstemmer), new Among("ten", -1, -1, "", turkishstemmer)};
        a_9 = new Among[]{new Among("ndan", -1, -1, "", turkishstemmer), new Among("nden", -1, -1, "", turkishstemmer)};
        a_10 = new Among[]{new Among("la", -1, -1, "", turkishstemmer), new Among("le", -1, -1, "", turkishstemmer)};
        a_11 = new Among[]{new Among("ca", -1, -1, "", turkishstemmer), new Among("ce", -1, -1, "", turkishstemmer)};
        a_12 = new Among[]{new Among("im", -1, -1, "", turkishstemmer), new Among("um", -1, -1, "", turkishstemmer), new Among("üm", -1, -1, "", turkishstemmer), new Among("ım", -1, -1, "", turkishstemmer)};
        a_13 = new Among[]{new Among("sin", -1, -1, "", turkishstemmer), new Among("sun", -1, -1, "", turkishstemmer), new Among("sün", -1, -1, "", turkishstemmer), new Among("sın", -1, -1, "", turkishstemmer)};
        a_14 = new Among[]{new Among("iz", -1, -1, "", turkishstemmer), new Among("uz", -1, -1, "", turkishstemmer), new Among("üz", -1, -1, "", turkishstemmer), new Among("ız", -1, -1, "", turkishstemmer)};
        a_15 = new Among[]{new Among("siniz", -1, -1, "", turkishstemmer), new Among("sunuz", -1, -1, "", turkishstemmer), new Among("sünüz", -1, -1, "", turkishstemmer), new Among("sınız", -1, -1, "", turkishstemmer)};
        a_16 = new Among[]{new Among("lar", -1, -1, "", turkishstemmer), new Among("ler", -1, -1, "", turkishstemmer)};
        a_17 = new Among[]{new Among("niz", -1, -1, "", turkishstemmer), new Among("nuz", -1, -1, "", turkishstemmer), new Among("nüz", -1, -1, "", turkishstemmer), new Among("nız", -1, -1, "", turkishstemmer)};
        a_18 = new Among[]{new Among("dir", -1, -1, "", turkishstemmer), new Among("tir", -1, -1, "", turkishstemmer), new Among("dur", -1, -1, "", turkishstemmer), new Among("tur", -1, -1, "", turkishstemmer), new Among("dür", -1, -1, "", turkishstemmer), new Among("tür", -1, -1, "", turkishstemmer), new Among("dır", -1, -1, "", turkishstemmer), new Among("tır", -1, -1, "", turkishstemmer)};
        a_19 = new Among[]{new Among("casına", -1, -1, "", turkishstemmer), new Among("cesine", -1, -1, "", turkishstemmer)};
        a_20 = new Among[]{new Among("di", -1, -1, "", turkishstemmer), new Among("ti", -1, -1, "", turkishstemmer), new Among("dik", -1, -1, "", turkishstemmer), new Among("tik", -1, -1, "", turkishstemmer), new Among("duk", -1, -1, "", turkishstemmer), new Among("tuk", -1, -1, "", turkishstemmer), new Among("dük", -1, -1, "", turkishstemmer), new Among("tük", -1, -1, "", turkishstemmer), new Among("dık", -1, -1, "", turkishstemmer), new Among("tık", -1, -1, "", turkishstemmer), new Among("dim", -1, -1, "", turkishstemmer), new Among("tim", -1, -1, "", turkishstemmer), new Among("dum", -1, -1, "", turkishstemmer), new Among("tum", -1, -1, "", turkishstemmer), new Among("düm", -1, -1, "", turkishstemmer), new Among("tüm", -1, -1, "", turkishstemmer), new Among("dım", -1, -1, "", turkishstemmer), new Among("tım", -1, -1, "", turkishstemmer), new Among("din", -1, -1, "", turkishstemmer), new Among("tin", -1, -1, "", turkishstemmer), new Among("dun", -1, -1, "", turkishstemmer), new Among("tun", -1, -1, "", turkishstemmer), new Among("dün", -1, -1, "", turkishstemmer), new Among("tün", -1, -1, "", turkishstemmer), new Among("dın", -1, -1, "", turkishstemmer), new Among("tın", -1, -1, "", turkishstemmer), new Among("du", -1, -1, "", turkishstemmer), new Among("tu", -1, -1, "", turkishstemmer), new Among("dü", -1, -1, "", turkishstemmer), new Among("tü", -1, -1, "", turkishstemmer), new Among("dı", -1, -1, "", turkishstemmer), new Among("tı", -1, -1, "", turkishstemmer)};
        a_21 = new Among[]{new Among("sa", -1, -1, "", turkishstemmer), new Among("se", -1, -1, "", turkishstemmer), new Among("sak", -1, -1, "", turkishstemmer), new Among("sek", -1, -1, "", turkishstemmer), new Among("sam", -1, -1, "", turkishstemmer), new Among("sem", -1, -1, "", turkishstemmer), new Among("san", -1, -1, "", turkishstemmer), new Among("sen", -1, -1, "", turkishstemmer)};
        a_22 = new Among[]{new Among("miş", -1, -1, "", turkishstemmer), new Among("muş", -1, -1, "", turkishstemmer), new Among("müş", -1, -1, "", turkishstemmer), new Among("mış", -1, -1, "", turkishstemmer)};
        a_23 = new Among[]{new Among("b", -1, 1, "", turkishstemmer), new Among("c", -1, 2, "", turkishstemmer), new Among("d", -1, 3, "", turkishstemmer), new Among("ğ", -1, 4, "", turkishstemmer)};
        g_vowel = new char[]{17, 'A', 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', '\b', 0, 0, 0, 0, 0, 0, 1};
        g_U = new char[]{1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '\b', 0, 0, 0, 0, 0, 0, 1};
        g_vowel1 = new char[]{1, '@', 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        g_vowel2 = new char[]{17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 130};
        g_vowel3 = new char[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        g_vowel4 = new char[]{17};
        g_vowel5 = new char[]{'A'};
        g_vowel6 = new char[]{'A'};
    }

    private void copy_from(turkishStemmer turkishstemmer) {
        this.B_continue_stemming_noun_suffixes = turkishstemmer.B_continue_stemming_noun_suffixes;
        this.I_strlen = turkishstemmer.I_strlen;
        super.copy_from((SnowballProgram) turkishstemmer);
    }

    private boolean r_check_vowel_harmony() {
        int i = this.limit - this.cursor;
        while (true) {
            int i2 = this.limit - this.cursor;
            if (in_grouping_b(g_vowel, 97, 305)) {
                this.cursor = this.limit - i2;
                int i3 = this.limit - this.cursor;
                if (eq_s_b(1, "a")) {
                    while (true) {
                        int i4 = this.limit - this.cursor;
                        if (in_grouping_b(g_vowel1, 97, 305)) {
                            this.cursor = this.limit - i4;
                            break;
                        }
                        this.cursor = this.limit - i4;
                        if (this.cursor <= this.limit_backward) {
                            break;
                        }
                        this.cursor--;
                    }
                    this.cursor = this.limit - i;
                    return true;
                }
                this.cursor = this.limit - i3;
                if (eq_s_b(1, "e")) {
                    while (true) {
                        int i5 = this.limit - this.cursor;
                        if (in_grouping_b(g_vowel2, 101, 252)) {
                            this.cursor = this.limit - i5;
                            break;
                        }
                        this.cursor = this.limit - i5;
                        if (this.cursor <= this.limit_backward) {
                            break;
                        }
                        this.cursor--;
                    }
                }
                this.cursor = this.limit - i3;
                if (eq_s_b(1, "ı")) {
                    while (true) {
                        int i6 = this.limit - this.cursor;
                        if (in_grouping_b(g_vowel3, 97, 305)) {
                            this.cursor = this.limit - i6;
                            break;
                        }
                        this.cursor = this.limit - i6;
                        if (this.cursor <= this.limit_backward) {
                            break;
                        }
                        this.cursor--;
                    }
                    this.cursor = this.limit - i;
                    return true;
                }
                this.cursor = this.limit - i3;
                if (eq_s_b(1, "i")) {
                    while (true) {
                        int i7 = this.limit - this.cursor;
                        if (in_grouping_b(g_vowel4, 101, 105)) {
                            this.cursor = this.limit - i7;
                            break;
                        }
                        this.cursor = this.limit - i7;
                        if (this.cursor <= this.limit_backward) {
                            break;
                        }
                        this.cursor--;
                    }
                }
                this.cursor = this.limit - i3;
                if (eq_s_b(1, "o")) {
                    while (true) {
                        int i8 = this.limit - this.cursor;
                        if (in_grouping_b(g_vowel5, 111, 117)) {
                            this.cursor = this.limit - i8;
                            break;
                        }
                        this.cursor = this.limit - i8;
                        if (this.cursor <= this.limit_backward) {
                            break;
                        }
                        this.cursor--;
                    }
                    this.cursor = this.limit - i;
                    return true;
                }
                this.cursor = this.limit - i3;
                if (eq_s_b(1, "ö")) {
                    while (true) {
                        int i9 = this.limit - this.cursor;
                        if (in_grouping_b(g_vowel6, 246, 252)) {
                            this.cursor = this.limit - i9;
                            break;
                        }
                        this.cursor = this.limit - i9;
                        if (this.cursor <= this.limit_backward) {
                            break;
                        }
                        this.cursor--;
                    }
                }
                this.cursor = this.limit - i3;
                if (eq_s_b(1, "u")) {
                    while (true) {
                        int i10 = this.limit - this.cursor;
                        if (in_grouping_b(g_vowel5, 111, 117)) {
                            this.cursor = this.limit - i10;
                            break;
                        }
                        this.cursor = this.limit - i10;
                        if (this.cursor <= this.limit_backward) {
                            break;
                        }
                        this.cursor--;
                    }
                    this.cursor = this.limit - i;
                    return true;
                }
                this.cursor = this.limit - i3;
                if (!eq_s_b(1, "ü")) {
                    return false;
                }
                while (true) {
                    int i11 = this.limit - this.cursor;
                    if (in_grouping_b(g_vowel6, 246, 252)) {
                        this.cursor = this.limit - i11;
                        break;
                    }
                    this.cursor = this.limit - i11;
                    if (this.cursor <= this.limit_backward) {
                        return false;
                    }
                    this.cursor--;
                }
                this.cursor = this.limit - i;
                return true;
            }
            this.cursor = this.limit - i2;
            if (this.cursor <= this.limit_backward) {
                return false;
            }
            this.cursor--;
        }
    }

    private boolean r_mark_suffix_with_optional_n_consonant() {
        int i = this.limit - this.cursor;
        int i2 = this.limit - this.cursor;
        if (eq_s_b(1, "n")) {
            this.cursor = this.limit - i2;
            if (this.cursor > this.limit_backward) {
                this.cursor--;
                int i3 = this.limit - this.cursor;
                if (in_grouping_b(g_vowel, 97, 305)) {
                    this.cursor = this.limit - i3;
                    return true;
                }
            }
        }
        this.cursor = this.limit - i;
        int i4 = this.limit - this.cursor;
        int i5 = this.limit - this.cursor;
        if (eq_s_b(1, "n")) {
            this.cursor = this.limit - i5;
            return false;
        }
        this.cursor = this.limit - i4;
        int i6 = this.limit - this.cursor;
        if (this.cursor <= this.limit_backward) {
            return false;
        }
        this.cursor--;
        int i7 = this.limit - this.cursor;
        if (!in_grouping_b(g_vowel, 97, 305)) {
            return false;
        }
        this.cursor = this.limit - i7;
        this.cursor = this.limit - i6;
        return true;
    }

    private boolean r_mark_suffix_with_optional_s_consonant() {
        int i = this.limit - this.cursor;
        int i2 = this.limit - this.cursor;
        if (eq_s_b(1, "s")) {
            this.cursor = this.limit - i2;
            if (this.cursor > this.limit_backward) {
                this.cursor--;
                int i3 = this.limit - this.cursor;
                if (in_grouping_b(g_vowel, 97, 305)) {
                    this.cursor = this.limit - i3;
                    return true;
                }
            }
        }
        this.cursor = this.limit - i;
        int i4 = this.limit - this.cursor;
        int i5 = this.limit - this.cursor;
        if (eq_s_b(1, "s")) {
            this.cursor = this.limit - i5;
            return false;
        }
        this.cursor = this.limit - i4;
        int i6 = this.limit - this.cursor;
        if (this.cursor <= this.limit_backward) {
            return false;
        }
        this.cursor--;
        int i7 = this.limit - this.cursor;
        if (!in_grouping_b(g_vowel, 97, 305)) {
            return false;
        }
        this.cursor = this.limit - i7;
        this.cursor = this.limit - i6;
        return true;
    }

    private boolean r_mark_suffix_with_optional_y_consonant() {
        int i = this.limit - this.cursor;
        int i2 = this.limit - this.cursor;
        if (eq_s_b(1, "y")) {
            this.cursor = this.limit - i2;
            if (this.cursor > this.limit_backward) {
                this.cursor--;
                int i3 = this.limit - this.cursor;
                if (in_grouping_b(g_vowel, 97, 305)) {
                    this.cursor = this.limit - i3;
                    return true;
                }
            }
        }
        this.cursor = this.limit - i;
        int i4 = this.limit - this.cursor;
        int i5 = this.limit - this.cursor;
        if (eq_s_b(1, "y")) {
            this.cursor = this.limit - i5;
            return false;
        }
        this.cursor = this.limit - i4;
        int i6 = this.limit - this.cursor;
        if (this.cursor <= this.limit_backward) {
            return false;
        }
        this.cursor--;
        int i7 = this.limit - this.cursor;
        if (!in_grouping_b(g_vowel, 97, 305)) {
            return false;
        }
        this.cursor = this.limit - i7;
        this.cursor = this.limit - i6;
        return true;
    }

    private boolean r_mark_suffix_with_optional_U_vowel() {
        int i = this.limit - this.cursor;
        int i2 = this.limit - this.cursor;
        char[] cArr = g_U;
        if (in_grouping_b(cArr, 105, 305)) {
            this.cursor = this.limit - i2;
            if (this.cursor > this.limit_backward) {
                this.cursor--;
                int i3 = this.limit - this.cursor;
                if (out_grouping_b(g_vowel, 97, 305)) {
                    this.cursor = this.limit - i3;
                    return true;
                }
            }
        }
        this.cursor = this.limit - i;
        int i4 = this.limit - this.cursor;
        int i5 = this.limit - this.cursor;
        if (in_grouping_b(cArr, 105, 305)) {
            this.cursor = this.limit - i5;
            return false;
        }
        this.cursor = this.limit - i4;
        int i6 = this.limit - this.cursor;
        if (this.cursor <= this.limit_backward) {
            return false;
        }
        this.cursor--;
        int i7 = this.limit - this.cursor;
        if (!out_grouping_b(g_vowel, 97, 305)) {
            return false;
        }
        this.cursor = this.limit - i7;
        this.cursor = this.limit - i6;
        return true;
    }

    private boolean r_mark_possessives() {
        return find_among_b(a_0, 10) != 0 && r_mark_suffix_with_optional_U_vowel();
    }

    private boolean r_mark_sU() {
        return r_check_vowel_harmony() && in_grouping_b(g_U, 105, 305) && r_mark_suffix_with_optional_s_consonant();
    }

    private boolean r_mark_lArI() {
        return find_among_b(a_1, 2) != 0;
    }

    private boolean r_mark_yU() {
        return r_check_vowel_harmony() && in_grouping_b(g_U, 105, 305) && r_mark_suffix_with_optional_y_consonant();
    }

    private boolean r_mark_nU() {
        return r_check_vowel_harmony() && find_among_b(a_2, 4) != 0;
    }

    private boolean r_mark_nUn() {
        return r_check_vowel_harmony() && find_among_b(a_3, 4) != 0 && r_mark_suffix_with_optional_n_consonant();
    }

    private boolean r_mark_yA() {
        return r_check_vowel_harmony() && find_among_b(a_4, 2) != 0 && r_mark_suffix_with_optional_y_consonant();
    }

    private boolean r_mark_nA() {
        return r_check_vowel_harmony() && find_among_b(a_5, 2) != 0;
    }

    private boolean r_mark_DA() {
        return r_check_vowel_harmony() && find_among_b(a_6, 4) != 0;
    }

    private boolean r_mark_ndA() {
        return r_check_vowel_harmony() && find_among_b(a_7, 2) != 0;
    }

    private boolean r_mark_DAn() {
        return r_check_vowel_harmony() && find_among_b(a_8, 4) != 0;
    }

    private boolean r_mark_ndAn() {
        return r_check_vowel_harmony() && find_among_b(a_9, 2) != 0;
    }

    private boolean r_mark_ylA() {
        return r_check_vowel_harmony() && find_among_b(a_10, 2) != 0 && r_mark_suffix_with_optional_y_consonant();
    }

    private boolean r_mark_ki() {
        return eq_s_b(2, "ki");
    }

    private boolean r_mark_ncA() {
        return r_check_vowel_harmony() && find_among_b(a_11, 2) != 0 && r_mark_suffix_with_optional_n_consonant();
    }

    private boolean r_mark_yUm() {
        return r_check_vowel_harmony() && find_among_b(a_12, 4) != 0 && r_mark_suffix_with_optional_y_consonant();
    }

    private boolean r_mark_sUn() {
        return r_check_vowel_harmony() && find_among_b(a_13, 4) != 0;
    }

    private boolean r_mark_yUz() {
        return r_check_vowel_harmony() && find_among_b(a_14, 4) != 0 && r_mark_suffix_with_optional_y_consonant();
    }

    private boolean r_mark_sUnUz() {
        return find_among_b(a_15, 4) != 0;
    }

    private boolean r_mark_lAr() {
        return r_check_vowel_harmony() && find_among_b(a_16, 2) != 0;
    }

    private boolean r_mark_nUz() {
        return r_check_vowel_harmony() && find_among_b(a_17, 4) != 0;
    }

    private boolean r_mark_DUr() {
        return r_check_vowel_harmony() && find_among_b(a_18, 8) != 0;
    }

    private boolean r_mark_cAsInA() {
        return find_among_b(a_19, 2) != 0;
    }

    private boolean r_mark_yDU() {
        return r_check_vowel_harmony() && find_among_b(a_20, 32) != 0 && r_mark_suffix_with_optional_y_consonant();
    }

    private boolean r_mark_ysA() {
        return find_among_b(a_21, 8) != 0 && r_mark_suffix_with_optional_y_consonant();
    }

    private boolean r_mark_ymUs_() {
        return r_check_vowel_harmony() && find_among_b(a_22, 4) != 0 && r_mark_suffix_with_optional_y_consonant();
    }

    private boolean r_mark_yken() {
        return eq_s_b(3, "ken") && r_mark_suffix_with_optional_y_consonant();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (r_mark_ymUs_() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        if (r_mark_ysA() == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean r_stem_nominal_verb_suffixes() {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tartarus.snowball.ext.turkishStemmer.r_stem_nominal_verb_suffixes():boolean");
    }

    private boolean r_stem_suffix_chain_before_ki() {
        this.ket = this.cursor;
        if (!r_mark_ki()) {
            return false;
        }
        int i = this.limit - this.cursor;
        if (r_mark_DA()) {
            this.bra = this.cursor;
            slice_del();
            int i2 = this.limit - this.cursor;
            this.ket = this.cursor;
            int i3 = this.limit - this.cursor;
            if (r_mark_lAr()) {
                this.bra = this.cursor;
                slice_del();
                int i4 = this.limit - this.cursor;
                if (r_stem_suffix_chain_before_ki()) {
                    return true;
                }
                this.cursor = this.limit - i4;
                return true;
            }
            this.cursor = this.limit - i3;
            if (!r_mark_possessives()) {
                this.cursor = this.limit - i2;
                return true;
            }
            this.bra = this.cursor;
            slice_del();
            int i5 = this.limit - this.cursor;
            this.ket = this.cursor;
            if (!r_mark_lAr()) {
                this.cursor = this.limit - i5;
                return true;
            }
            this.bra = this.cursor;
            slice_del();
            if (r_stem_suffix_chain_before_ki()) {
                return true;
            }
            this.cursor = this.limit - i5;
            return true;
        }
        this.cursor = this.limit - i;
        if (r_mark_nUn()) {
            this.bra = this.cursor;
            slice_del();
            int i6 = this.limit - this.cursor;
            this.ket = this.cursor;
            int i7 = this.limit - this.cursor;
            if (r_mark_lArI()) {
                this.bra = this.cursor;
                slice_del();
                return true;
            }
            this.cursor = this.limit - i7;
            this.ket = this.cursor;
            int i8 = this.limit - this.cursor;
            if (!r_mark_possessives()) {
                this.cursor = this.limit - i8;
                if (!r_mark_sU()) {
                    this.cursor = this.limit - i7;
                    if (r_stem_suffix_chain_before_ki()) {
                        return true;
                    }
                    this.cursor = this.limit - i6;
                    return true;
                }
            }
            this.bra = this.cursor;
            slice_del();
            int i9 = this.limit - this.cursor;
            this.ket = this.cursor;
            if (!r_mark_lAr()) {
                this.cursor = this.limit - i9;
                return true;
            }
            this.bra = this.cursor;
            slice_del();
            if (r_stem_suffix_chain_before_ki()) {
                return true;
            }
            this.cursor = this.limit - i9;
            return true;
        }
        this.cursor = this.limit - i;
        if (!r_mark_ndA()) {
            return false;
        }
        int i10 = this.limit - this.cursor;
        if (r_mark_lArI()) {
            this.bra = this.cursor;
            slice_del();
            return true;
        }
        this.cursor = this.limit - i10;
        if (r_mark_sU()) {
            this.bra = this.cursor;
            slice_del();
            int i11 = this.limit - this.cursor;
            this.ket = this.cursor;
            if (!r_mark_lAr()) {
                this.cursor = this.limit - i11;
                return true;
            }
            this.bra = this.cursor;
            slice_del();
            if (r_stem_suffix_chain_before_ki()) {
                return true;
            }
            this.cursor = this.limit - i11;
            return true;
        }
        this.cursor = this.limit - i10;
        return r_stem_suffix_chain_before_ki();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        if (r_mark_nU() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r_mark_nA() == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean r_stem_noun_suffixes() {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tartarus.snowball.ext.turkishStemmer.r_stem_noun_suffixes():boolean");
    }

    private boolean r_post_process_last_consonants() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_23, 4);
        boolean z = false;
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (find_among_b != 0) {
            z = true;
            if (find_among_b == 1) {
                slice_from("p");
            } else if (find_among_b == 2) {
                slice_from("ç");
            } else if (find_among_b == 3) {
                slice_from("t");
            } else if (find_among_b == 4) {
                slice_from("k");
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bb, code lost:
    
        r9.cursor = r9.limit - r0;
        r1 = r9.limit - r9.cursor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c5, code lost:
    
        r2 = r9.limit - r9.cursor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d0, code lost:
    
        if (in_grouping_b(org.tartarus.snowball.ext.turkishStemmer.g_vowel, 97, 305) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d2, code lost:
    
        r9.cursor = r9.limit - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00db, code lost:
    
        if (r9.cursor > r9.limit_backward) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00de, code lost:
    
        r9.cursor--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0103, code lost:
    
        r9.cursor = r9.limit - r0;
        r0 = r9.limit - r9.cursor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x010d, code lost:
    
        r1 = r9.limit - r9.cursor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0118, code lost:
    
        if (in_grouping_b(org.tartarus.snowball.ext.turkishStemmer.g_vowel, 97, 305) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011a, code lost:
    
        r9.cursor = r9.limit - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0123, code lost:
    
        if (r9.cursor > r9.limit_backward) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0126, code lost:
    
        r9.cursor--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0125, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012c, code lost:
    
        r9.cursor = r9.limit - r1;
        r1 = r9.limit - r9.cursor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x013e, code lost:
    
        if (eq_s_b(1, "ö") != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0140, code lost:
    
        r9.cursor = r9.limit - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0149, code lost:
    
        if (eq_s_b(1, "ü") != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x014b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014c, code lost:
    
        r9.cursor = r9.limit - r0;
        r0 = r9.cursor;
        insert(r9.cursor, r9.cursor, "ü");
        r9.cursor = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e4, code lost:
    
        r9.cursor = r9.limit - r2;
        r2 = r9.limit - r9.cursor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f6, code lost:
    
        if (eq_s_b(1, "o") != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
    
        r9.cursor = r9.limit - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0101, code lost:
    
        if (eq_s_b(1, "u") != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x015d, code lost:
    
        r9.cursor = r9.limit - r1;
        r0 = r9.cursor;
        insert(r9.cursor, r9.cursor, "u");
        r9.cursor = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b9, code lost:
    
        if (eq_s_b(1, "i") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0071, code lost:
    
        if (eq_s_b(1, "ı") == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean r_append_U_to_stems_ending_with_d_or_g() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tartarus.snowball.ext.turkishStemmer.r_append_U_to_stems_ending_with_d_or_g():boolean");
    }

    private boolean r_more_than_one_syllable_word() {
        int i;
        int i2 = this.cursor;
        int i3 = 2;
        loop0: while (true) {
            i = this.cursor;
            while (!in_grouping(g_vowel, 97, 305)) {
                if (this.cursor >= this.limit) {
                    break loop0;
                }
                this.cursor++;
            }
            i3--;
        }
        this.cursor = i;
        if (i3 > 0) {
            return false;
        }
        this.cursor = i2;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (eq_s(5, "soyad") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r5.cursor < r5.limit) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r5.cursor++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        r5.I_strlen = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (5 == r5.limit) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        r5.cursor = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        r5.cursor = r0;
        r0 = r5.cursor;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean r_is_reserved_word() {
        /*
            r5 = this;
            int r0 = r5.cursor
            int r1 = r5.cursor
        L4:
            java.lang.String r2 = "ad"
            r3 = 2
            boolean r2 = r5.eq_s(r3, r2)
            r4 = 1
            if (r2 != 0) goto L1b
            int r2 = r5.cursor
            int r3 = r5.limit
            if (r2 < r3) goto L15
            goto L21
        L15:
            int r2 = r5.cursor
            int r2 = r2 + r4
            r5.cursor = r2
            goto L4
        L1b:
            r5.I_strlen = r3
            int r2 = r5.limit
            if (r3 == r2) goto L46
        L21:
            r5.cursor = r0
            int r0 = r5.cursor
        L25:
            java.lang.String r1 = "soyad"
            r2 = 5
            boolean r1 = r5.eq_s(r2, r1)
            r3 = 0
            if (r1 != 0) goto L3c
            int r1 = r5.cursor
            int r2 = r5.limit
            if (r1 < r2) goto L36
            return r3
        L36:
            int r1 = r5.cursor
            int r1 = r1 + r4
            r5.cursor = r1
            goto L25
        L3c:
            r5.I_strlen = r2
            int r1 = r5.limit
            if (r2 == r1) goto L43
            return r3
        L43:
            r5.cursor = r0
            goto L48
        L46:
            r5.cursor = r1
        L48:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tartarus.snowball.ext.turkishStemmer.r_is_reserved_word():boolean");
    }

    private boolean r_postlude() {
        int i = this.cursor;
        if (r_is_reserved_word()) {
            return false;
        }
        this.cursor = i;
        this.limit_backward = this.cursor;
        this.cursor = this.limit;
        int i2 = this.limit - this.cursor;
        r_append_U_to_stems_ending_with_d_or_g();
        this.cursor = this.limit - i2;
        int i3 = this.limit - this.cursor;
        r_post_process_last_consonants();
        this.cursor = this.limit - i3;
        this.cursor = this.limit_backward;
        return true;
    }

    @Override // org.tartarus.snowball.SnowballStemmer
    public boolean stem() {
        if (!r_more_than_one_syllable_word()) {
            return false;
        }
        this.limit_backward = this.cursor;
        this.cursor = this.limit;
        int i = this.limit - this.cursor;
        r_stem_nominal_verb_suffixes();
        this.cursor = this.limit - i;
        if (!this.B_continue_stemming_noun_suffixes) {
            return false;
        }
        int i2 = this.limit - this.cursor;
        r_stem_noun_suffixes();
        this.cursor = this.limit - i2;
        this.cursor = this.limit_backward;
        return r_postlude();
    }

    public boolean equals(Object obj) {
        return obj instanceof turkishStemmer;
    }

    public int hashCode() {
        return "org.tartarus.snowball.ext.turkishStemmer".hashCode();
    }
}
