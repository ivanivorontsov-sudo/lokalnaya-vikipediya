package org.tartarus.snowball.ext;

import org.tartarus.snowball.Among;
import org.tartarus.snowball.SnowballProgram;
import org.tartarus.snowball.SnowballStemmer;

/* loaded from: classes.dex */
public class romanianStemmer extends SnowballStemmer {
    private static final Among[] a_0;
    private static final Among[] a_1;
    private static final Among[] a_2;
    private static final Among[] a_3;
    private static final Among[] a_4;
    private static final Among[] a_5;
    private static final char[] g_v;
    private static final romanianStemmer methodObject;
    private static final long serialVersionUID = 1;
    private boolean B_standard_suffix_removed;
    private int I_p1;
    private int I_p2;
    private int I_pV;

    static {
        romanianStemmer romanianstemmer = new romanianStemmer();
        methodObject = romanianstemmer;
        a_0 = new Among[]{new Among("", -1, 3, "", romanianstemmer), new Among("I", 0, 1, "", romanianstemmer), new Among("U", 0, 2, "", romanianstemmer)};
        a_1 = new Among[]{new Among("ea", -1, 3, "", romanianstemmer), new Among("aţia", -1, 7, "", romanianstemmer), new Among("aua", -1, 2, "", romanianstemmer), new Among("iua", -1, 4, "", romanianstemmer), new Among("aţie", -1, 7, "", romanianstemmer), new Among("ele", -1, 3, "", romanianstemmer), new Among("ile", -1, 5, "", romanianstemmer), new Among("iile", 6, 4, "", romanianstemmer), new Among("iei", -1, 4, "", romanianstemmer), new Among("atei", -1, 6, "", romanianstemmer), new Among("ii", -1, 4, "", romanianstemmer), new Among("ului", -1, 1, "", romanianstemmer), new Among("ul", -1, 1, "", romanianstemmer), new Among("elor", -1, 3, "", romanianstemmer), new Among("ilor", -1, 4, "", romanianstemmer), new Among("iilor", 14, 4, "", romanianstemmer)};
        a_2 = new Among[]{new Among("icala", -1, 4, "", romanianstemmer), new Among("iciva", -1, 4, "", romanianstemmer), new Among("ativa", -1, 5, "", romanianstemmer), new Among("itiva", -1, 6, "", romanianstemmer), new Among("icale", -1, 4, "", romanianstemmer), new Among("aţiune", -1, 5, "", romanianstemmer), new Among("iţiune", -1, 6, "", romanianstemmer), new Among("atoare", -1, 5, "", romanianstemmer), new Among("itoare", -1, 6, "", romanianstemmer), new Among("ătoare", -1, 5, "", romanianstemmer), new Among("icitate", -1, 4, "", romanianstemmer), new Among("abilitate", -1, 1, "", romanianstemmer), new Among("ibilitate", -1, 2, "", romanianstemmer), new Among("ivitate", -1, 3, "", romanianstemmer), new Among("icive", -1, 4, "", romanianstemmer), new Among("ative", -1, 5, "", romanianstemmer), new Among("itive", -1, 6, "", romanianstemmer), new Among("icali", -1, 4, "", romanianstemmer), new Among("atori", -1, 5, "", romanianstemmer), new Among("icatori", 18, 4, "", romanianstemmer), new Among("itori", -1, 6, "", romanianstemmer), new Among("ători", -1, 5, "", romanianstemmer), new Among("icitati", -1, 4, "", romanianstemmer), new Among("abilitati", -1, 1, "", romanianstemmer), new Among("ivitati", -1, 3, "", romanianstemmer), new Among("icivi", -1, 4, "", romanianstemmer), new Among("ativi", -1, 5, "", romanianstemmer), new Among("itivi", -1, 6, "", romanianstemmer), new Among("icităi", -1, 4, "", romanianstemmer), new Among("abilităi", -1, 1, "", romanianstemmer), new Among("ivităi", -1, 3, "", romanianstemmer), new Among("icităţi", -1, 4, "", romanianstemmer), new Among("abilităţi", -1, 1, "", romanianstemmer), new Among("ivităţi", -1, 3, "", romanianstemmer), new Among("ical", -1, 4, "", romanianstemmer), new Among("ator", -1, 5, "", romanianstemmer), new Among("icator", 35, 4, "", romanianstemmer), new Among("itor", -1, 6, "", romanianstemmer), new Among("ător", -1, 5, "", romanianstemmer), new Among("iciv", -1, 4, "", romanianstemmer), new Among("ativ", -1, 5, "", romanianstemmer), new Among("itiv", -1, 6, "", romanianstemmer), new Among("icală", -1, 4, "", romanianstemmer), new Among("icivă", -1, 4, "", romanianstemmer), new Among("ativă", -1, 5, "", romanianstemmer), new Among("itivă", -1, 6, "", romanianstemmer)};
        a_3 = new Among[]{new Among("ica", -1, 1, "", romanianstemmer), new Among("abila", -1, 1, "", romanianstemmer), new Among("ibila", -1, 1, "", romanianstemmer), new Among("oasa", -1, 1, "", romanianstemmer), new Among("ata", -1, 1, "", romanianstemmer), new Among("ita", -1, 1, "", romanianstemmer), new Among("anta", -1, 1, "", romanianstemmer), new Among("ista", -1, 3, "", romanianstemmer), new Among("uta", -1, 1, "", romanianstemmer), new Among("iva", -1, 1, "", romanianstemmer), new Among("ic", -1, 1, "", romanianstemmer), new Among("ice", -1, 1, "", romanianstemmer), new Among("abile", -1, 1, "", romanianstemmer), new Among("ibile", -1, 1, "", romanianstemmer), new Among("isme", -1, 3, "", romanianstemmer), new Among("iune", -1, 2, "", romanianstemmer), new Among("oase", -1, 1, "", romanianstemmer), new Among("ate", -1, 1, "", romanianstemmer), new Among("itate", 17, 1, "", romanianstemmer), new Among("ite", -1, 1, "", romanianstemmer), new Among("ante", -1, 1, "", romanianstemmer), new Among("iste", -1, 3, "", romanianstemmer), new Among("ute", -1, 1, "", romanianstemmer), new Among("ive", -1, 1, "", romanianstemmer), new Among("ici", -1, 1, "", romanianstemmer), new Among("abili", -1, 1, "", romanianstemmer), new Among("ibili", -1, 1, "", romanianstemmer), new Among("iuni", -1, 2, "", romanianstemmer), new Among("atori", -1, 1, "", romanianstemmer), new Among("osi", -1, 1, "", romanianstemmer), new Among("ati", -1, 1, "", romanianstemmer), new Among("itati", 30, 1, "", romanianstemmer), new Among("iti", -1, 1, "", romanianstemmer), new Among("anti", -1, 1, "", romanianstemmer), new Among("isti", -1, 3, "", romanianstemmer), new Among("uti", -1, 1, "", romanianstemmer), new Among("işti", -1, 3, "", romanianstemmer), new Among("ivi", -1, 1, "", romanianstemmer), new Among("ităi", -1, 1, "", romanianstemmer), new Among("oşi", -1, 1, "", romanianstemmer), new Among("ităţi", -1, 1, "", romanianstemmer), new Among("abil", -1, 1, "", romanianstemmer), new Among("ibil", -1, 1, "", romanianstemmer), new Among("ism", -1, 3, "", romanianstemmer), new Among("ator", -1, 1, "", romanianstemmer), new Among("os", -1, 1, "", romanianstemmer), new Among("at", -1, 1, "", romanianstemmer), new Among("it", -1, 1, "", romanianstemmer), new Among("ant", -1, 1, "", romanianstemmer), new Among("ist", -1, 3, "", romanianstemmer), new Among("ut", -1, 1, "", romanianstemmer), new Among("iv", -1, 1, "", romanianstemmer), new Among("ică", -1, 1, "", romanianstemmer), new Among("abilă", -1, 1, "", romanianstemmer), new Among("ibilă", -1, 1, "", romanianstemmer), new Among("oasă", -1, 1, "", romanianstemmer), new Among("ată", -1, 1, "", romanianstemmer), new Among("ită", -1, 1, "", romanianstemmer), new Among("antă", -1, 1, "", romanianstemmer), new Among("istă", -1, 3, "", romanianstemmer), new Among("ută", -1, 1, "", romanianstemmer), new Among("ivă", -1, 1, "", romanianstemmer)};
        a_4 = new Among[]{new Among("ea", -1, 1, "", romanianstemmer), new Among("ia", -1, 1, "", romanianstemmer), new Among("esc", -1, 1, "", romanianstemmer), new Among("ăsc", -1, 1, "", romanianstemmer), new Among("ind", -1, 1, "", romanianstemmer), new Among("ând", -1, 1, "", romanianstemmer), new Among("are", -1, 1, "", romanianstemmer), new Among("ere", -1, 1, "", romanianstemmer), new Among("ire", -1, 1, "", romanianstemmer), new Among("âre", -1, 1, "", romanianstemmer), new Among("se", -1, 2, "", romanianstemmer), new Among("ase", 10, 1, "", romanianstemmer), new Among("sese", 10, 2, "", romanianstemmer), new Among("ise", 10, 1, "", romanianstemmer), new Among("use", 10, 1, "", romanianstemmer), new Among("âse", 10, 1, "", romanianstemmer), new Among("eşte", -1, 1, "", romanianstemmer), new Among("ăşte", -1, 1, "", romanianstemmer), new Among("eze", -1, 1, "", romanianstemmer), new Among("ai", -1, 1, "", romanianstemmer), new Among("eai", 19, 1, "", romanianstemmer), new Among("iai", 19, 1, "", romanianstemmer), new Among("sei", -1, 2, "", romanianstemmer), new Among("eşti", -1, 1, "", romanianstemmer), new Among("ăşti", -1, 1, "", romanianstemmer), new Among("ui", -1, 1, "", romanianstemmer), new Among("ezi", -1, 1, "", romanianstemmer), new Among("âi", -1, 1, "", romanianstemmer), new Among("aşi", -1, 1, "", romanianstemmer), new Among("seşi", -1, 2, "", romanianstemmer), new Among("aseşi", 29, 1, "", romanianstemmer), new Among("seseşi", 29, 2, "", romanianstemmer), new Among("iseşi", 29, 1, "", romanianstemmer), new Among("useşi", 29, 1, "", romanianstemmer), new Among("âseşi", 29, 1, "", romanianstemmer), new Among("işi", -1, 1, "", romanianstemmer), new Among("uşi", -1, 1, "", romanianstemmer), new Among("âşi", -1, 1, "", romanianstemmer), new Among("aţi", -1, 2, "", romanianstemmer), new Among("eaţi", 38, 1, "", romanianstemmer), new Among("iaţi", 38, 1, "", romanianstemmer), new Among("eţi", -1, 2, "", romanianstemmer), new Among("iţi", -1, 2, "", romanianstemmer), new Among("âţi", -1, 2, "", romanianstemmer), new Among("arăţi", -1, 1, "", romanianstemmer), new Among("serăţi", -1, 2, "", romanianstemmer), new Among("aserăţi", 45, 1, "", romanianstemmer), new Among("seserăţi", 45, 2, "", romanianstemmer), new Among("iserăţi", 45, 1, "", romanianstemmer), new Among("userăţi", 45, 1, "", romanianstemmer), new Among("âserăţi", 45, 1, "", romanianstemmer), new Among("irăţi", -1, 1, "", romanianstemmer), new Among("urăţi", -1, 1, "", romanianstemmer), new Among("ârăţi", -1, 1, "", romanianstemmer), new Among("am", -1, 1, "", romanianstemmer), new Among("eam", 54, 1, "", romanianstemmer), new Among("iam", 54, 1, "", romanianstemmer), new Among("em", -1, 2, "", romanianstemmer), new Among("asem", 57, 1, "", romanianstemmer), new Among("sesem", 57, 2, "", romanianstemmer), new Among("isem", 57, 1, "", romanianstemmer), new Among("usem", 57, 1, "", romanianstemmer), new Among("âsem", 57, 1, "", romanianstemmer), new Among("im", -1, 2, "", romanianstemmer), new Among("âm", -1, 2, "", romanianstemmer), new Among("ăm", -1, 2, "", romanianstemmer), new Among("arăm", 65, 1, "", romanianstemmer), new Among("serăm", 65, 2, "", romanianstemmer), new Among("aserăm", 67, 1, "", romanianstemmer), new Among("seserăm", 67, 2, "", romanianstemmer), new Among("iserăm", 67, 1, "", romanianstemmer), new Among("userăm", 67, 1, "", romanianstemmer), new Among("âserăm", 67, 1, "", romanianstemmer), new Among("irăm", 65, 1, "", romanianstemmer), new Among("urăm", 65, 1, "", romanianstemmer), new Among("ârăm", 65, 1, "", romanianstemmer), new Among("au", -1, 1, "", romanianstemmer), new Among("eau", 76, 1, "", romanianstemmer), new Among("iau", 76, 1, "", romanianstemmer), new Among("indu", -1, 1, "", romanianstemmer), new Among("ându", -1, 1, "", romanianstemmer), new Among("ez", -1, 1, "", romanianstemmer), new Among("ească", -1, 1, "", romanianstemmer), new Among("ară", -1, 1, "", romanianstemmer), new Among("seră", -1, 2, "", romanianstemmer), new Among("aseră", 84, 1, "", romanianstemmer), new Among("seseră", 84, 2, "", romanianstemmer), new Among("iseră", 84, 1, "", romanianstemmer), new Among("useră", 84, 1, "", romanianstemmer), new Among("âseră", 84, 1, "", romanianstemmer), new Among("iră", -1, 1, "", romanianstemmer), new Among("ură", -1, 1, "", romanianstemmer), new Among("âră", -1, 1, "", romanianstemmer), new Among("ează", -1, 1, "", romanianstemmer)};
        a_5 = new Among[]{new Among("a", -1, 1, "", romanianstemmer), new Among("e", -1, 1, "", romanianstemmer), new Among("ie", 1, 1, "", romanianstemmer), new Among("i", -1, 1, "", romanianstemmer), new Among("ă", -1, 1, "", romanianstemmer)};
        g_v = new char[]{17, 'A', 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, ' ', 0, 0, 4};
    }

    private void copy_from(romanianStemmer romanianstemmer) {
        this.B_standard_suffix_removed = romanianstemmer.B_standard_suffix_removed;
        this.I_p2 = romanianstemmer.I_p2;
        this.I_p1 = romanianstemmer.I_p1;
        this.I_pV = romanianstemmer.I_pV;
        super.copy_from((SnowballProgram) romanianstemmer);
    }

    private boolean r_prelude() {
        int i;
        while (true) {
            int i2 = this.cursor;
            while (true) {
                i = this.cursor;
                char[] cArr = g_v;
                if (in_grouping(cArr, 97, 259)) {
                    this.bra = this.cursor;
                    int i3 = this.cursor;
                    if (eq_s(1, "u")) {
                        this.ket = this.cursor;
                        if (in_grouping(cArr, 97, 259)) {
                            slice_from("U");
                            break;
                        }
                    }
                    this.cursor = i3;
                    if (eq_s(1, "i")) {
                        this.ket = this.cursor;
                        if (in_grouping(cArr, 97, 259)) {
                            slice_from("I");
                            break;
                        }
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean r_mark_regions() {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tartarus.snowball.ext.romanianStemmer.r_mark_regions():boolean");
    }

    private boolean r_postlude() {
        int i;
        while (true) {
            i = this.cursor;
            this.bra = this.cursor;
            int find_among = find_among(a_0, 3);
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

    private boolean r_RV() {
        return this.I_pV <= this.cursor;
    }

    private boolean r_R1() {
        return this.I_p1 <= this.cursor;
    }

    private boolean r_R2() {
        return this.I_p2 <= this.cursor;
    }

    private boolean r_step_0() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_1, 16);
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (!r_R1()) {
            return false;
        }
        switch (find_among_b) {
            case 1:
                slice_del();
                break;
            case 2:
                slice_from("a");
                break;
            case 3:
                slice_from("e");
                break;
            case 4:
                slice_from("i");
                break;
            case 5:
                int i = this.limit - this.cursor;
                if (!eq_s_b(2, "ab")) {
                    this.cursor = this.limit - i;
                    slice_from("i");
                    break;
                }
                break;
            case 6:
                slice_from("at");
                break;
            case 7:
                slice_from("aţi");
                break;
        }
        return false;
    }

    private boolean r_combo_suffix() {
        int i = this.limit - this.cursor;
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_2, 46);
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
                slice_from("abil");
                break;
            case 2:
                slice_from("ibil");
                break;
            case 3:
                slice_from("iv");
                break;
            case 4:
                slice_from("ic");
                break;
            case 5:
                slice_from("at");
                break;
            case 6:
                slice_from("it");
                break;
        }
        this.B_standard_suffix_removed = true;
        this.cursor = this.limit - i;
        return true;
    }

    private boolean r_standard_suffix() {
        int i;
        this.B_standard_suffix_removed = false;
        do {
            i = this.limit - this.cursor;
        } while (r_combo_suffix());
        this.cursor = this.limit - i;
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_3, 62);
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (!r_R2() || find_among_b == 0) {
            return false;
        }
        if (find_among_b == 1) {
            slice_del();
        } else if (find_among_b != 2) {
            if (find_among_b == 3) {
                slice_from("ist");
            }
        } else {
            if (!eq_s_b(1, "ţ")) {
                return false;
            }
            this.bra = this.cursor;
            slice_from("t");
        }
        this.B_standard_suffix_removed = true;
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
        int find_among_b = find_among_b(a_4, 94);
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
            int i5 = this.limit - this.cursor;
            if (!out_grouping_b(g_v, 97, 259)) {
                this.cursor = this.limit - i5;
                if (!eq_s_b(1, "u")) {
                    this.limit_backward = i4;
                    return false;
                }
            }
            slice_del();
        } else if (find_among_b == 2) {
            slice_del();
        }
        this.limit_backward = i4;
        return true;
    }

    private boolean r_vowel_suffix() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_5, 5);
        boolean z = false;
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (!r_RV()) {
            return false;
        }
        if (find_among_b != 0) {
            z = true;
            if (find_among_b == 1) {
                slice_del();
            }
        }
        return z;
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
        r_step_0();
        this.cursor = this.limit - i3;
        int i4 = this.limit - this.cursor;
        r_standard_suffix();
        this.cursor = this.limit - i4;
        int i5 = this.limit - this.cursor;
        int i6 = this.limit - this.cursor;
        if (!this.B_standard_suffix_removed) {
            this.cursor = this.limit - i6;
            r_verb_suffix();
        }
        this.cursor = this.limit - i5;
        int i7 = this.limit - this.cursor;
        r_vowel_suffix();
        this.cursor = this.limit - i7;
        this.cursor = this.limit_backward;
        int i8 = this.cursor;
        r_postlude();
        this.cursor = i8;
        return true;
    }

    public boolean equals(Object obj) {
        return obj instanceof romanianStemmer;
    }

    public int hashCode() {
        return "org.tartarus.snowball.ext.romanianStemmer".hashCode();
    }
}
