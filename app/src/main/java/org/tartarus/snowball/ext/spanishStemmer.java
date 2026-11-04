package org.tartarus.snowball.ext;

import org.tartarus.snowball.Among;
import org.tartarus.snowball.SnowballProgram;
import org.tartarus.snowball.SnowballStemmer;

/* loaded from: classes.dex */
public class spanishStemmer extends SnowballStemmer {
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
    private static final char[] g_v;
    private static final spanishStemmer methodObject;
    private static final long serialVersionUID = 1;
    private int I_p1;
    private int I_p2;
    private int I_pV;

    static {
        spanishStemmer spanishstemmer = new spanishStemmer();
        methodObject = spanishstemmer;
        a_0 = new Among[]{new Among("", -1, 6, "", spanishstemmer), new Among("á", 0, 1, "", spanishstemmer), new Among("é", 0, 2, "", spanishstemmer), new Among("í", 0, 3, "", spanishstemmer), new Among("ó", 0, 4, "", spanishstemmer), new Among("ú", 0, 5, "", spanishstemmer)};
        a_1 = new Among[]{new Among("la", -1, -1, "", spanishstemmer), new Among("sela", 0, -1, "", spanishstemmer), new Among("le", -1, -1, "", spanishstemmer), new Among("me", -1, -1, "", spanishstemmer), new Among("se", -1, -1, "", spanishstemmer), new Among("lo", -1, -1, "", spanishstemmer), new Among("selo", 5, -1, "", spanishstemmer), new Among("las", -1, -1, "", spanishstemmer), new Among("selas", 7, -1, "", spanishstemmer), new Among("les", -1, -1, "", spanishstemmer), new Among("los", -1, -1, "", spanishstemmer), new Among("selos", 10, -1, "", spanishstemmer), new Among("nos", -1, -1, "", spanishstemmer)};
        a_2 = new Among[]{new Among("ando", -1, 6, "", spanishstemmer), new Among("iendo", -1, 6, "", spanishstemmer), new Among("yendo", -1, 7, "", spanishstemmer), new Among("ándo", -1, 2, "", spanishstemmer), new Among("iéndo", -1, 1, "", spanishstemmer), new Among("ar", -1, 6, "", spanishstemmer), new Among("er", -1, 6, "", spanishstemmer), new Among("ir", -1, 6, "", spanishstemmer), new Among("ár", -1, 3, "", spanishstemmer), new Among("ér", -1, 4, "", spanishstemmer), new Among("ír", -1, 5, "", spanishstemmer)};
        a_3 = new Among[]{new Among("ic", -1, -1, "", spanishstemmer), new Among("ad", -1, -1, "", spanishstemmer), new Among("os", -1, -1, "", spanishstemmer), new Among("iv", -1, 1, "", spanishstemmer)};
        a_4 = new Among[]{new Among("able", -1, 1, "", spanishstemmer), new Among("ible", -1, 1, "", spanishstemmer), new Among("ante", -1, 1, "", spanishstemmer)};
        a_5 = new Among[]{new Among("ic", -1, 1, "", spanishstemmer), new Among("abil", -1, 1, "", spanishstemmer), new Among("iv", -1, 1, "", spanishstemmer)};
        a_6 = new Among[]{new Among("ica", -1, 1, "", spanishstemmer), new Among("ancia", -1, 2, "", spanishstemmer), new Among("encia", -1, 5, "", spanishstemmer), new Among("adora", -1, 2, "", spanishstemmer), new Among("osa", -1, 1, "", spanishstemmer), new Among("ista", -1, 1, "", spanishstemmer), new Among("iva", -1, 9, "", spanishstemmer), new Among("anza", -1, 1, "", spanishstemmer), new Among("logía", -1, 3, "", spanishstemmer), new Among("idad", -1, 8, "", spanishstemmer), new Among("able", -1, 1, "", spanishstemmer), new Among("ible", -1, 1, "", spanishstemmer), new Among("ante", -1, 2, "", spanishstemmer), new Among("mente", -1, 7, "", spanishstemmer), new Among("amente", 13, 6, "", spanishstemmer), new Among("ación", -1, 2, "", spanishstemmer), new Among("ución", -1, 4, "", spanishstemmer), new Among("ico", -1, 1, "", spanishstemmer), new Among("ismo", -1, 1, "", spanishstemmer), new Among("oso", -1, 1, "", spanishstemmer), new Among("amiento", -1, 1, "", spanishstemmer), new Among("imiento", -1, 1, "", spanishstemmer), new Among("ivo", -1, 9, "", spanishstemmer), new Among("ador", -1, 2, "", spanishstemmer), new Among("icas", -1, 1, "", spanishstemmer), new Among("ancias", -1, 2, "", spanishstemmer), new Among("encias", -1, 5, "", spanishstemmer), new Among("adoras", -1, 2, "", spanishstemmer), new Among("osas", -1, 1, "", spanishstemmer), new Among("istas", -1, 1, "", spanishstemmer), new Among("ivas", -1, 9, "", spanishstemmer), new Among("anzas", -1, 1, "", spanishstemmer), new Among("logías", -1, 3, "", spanishstemmer), new Among("idades", -1, 8, "", spanishstemmer), new Among("ables", -1, 1, "", spanishstemmer), new Among("ibles", -1, 1, "", spanishstemmer), new Among("aciones", -1, 2, "", spanishstemmer), new Among("uciones", -1, 4, "", spanishstemmer), new Among("adores", -1, 2, "", spanishstemmer), new Among("antes", -1, 2, "", spanishstemmer), new Among("icos", -1, 1, "", spanishstemmer), new Among("ismos", -1, 1, "", spanishstemmer), new Among("osos", -1, 1, "", spanishstemmer), new Among("amientos", -1, 1, "", spanishstemmer), new Among("imientos", -1, 1, "", spanishstemmer), new Among("ivos", -1, 9, "", spanishstemmer)};
        a_7 = new Among[]{new Among("ya", -1, 1, "", spanishstemmer), new Among("ye", -1, 1, "", spanishstemmer), new Among("yan", -1, 1, "", spanishstemmer), new Among("yen", -1, 1, "", spanishstemmer), new Among("yeron", -1, 1, "", spanishstemmer), new Among("yendo", -1, 1, "", spanishstemmer), new Among("yo", -1, 1, "", spanishstemmer), new Among("yas", -1, 1, "", spanishstemmer), new Among("yes", -1, 1, "", spanishstemmer), new Among("yais", -1, 1, "", spanishstemmer), new Among("yamos", -1, 1, "", spanishstemmer), new Among("yó", -1, 1, "", spanishstemmer)};
        a_8 = new Among[]{new Among("aba", -1, 2, "", spanishstemmer), new Among("ada", -1, 2, "", spanishstemmer), new Among("ida", -1, 2, "", spanishstemmer), new Among("ara", -1, 2, "", spanishstemmer), new Among("iera", -1, 2, "", spanishstemmer), new Among("ía", -1, 2, "", spanishstemmer), new Among("aría", 5, 2, "", spanishstemmer), new Among("ería", 5, 2, "", spanishstemmer), new Among("iría", 5, 2, "", spanishstemmer), new Among("ad", -1, 2, "", spanishstemmer), new Among("ed", -1, 2, "", spanishstemmer), new Among("id", -1, 2, "", spanishstemmer), new Among("ase", -1, 2, "", spanishstemmer), new Among("iese", -1, 2, "", spanishstemmer), new Among("aste", -1, 2, "", spanishstemmer), new Among("iste", -1, 2, "", spanishstemmer), new Among("an", -1, 2, "", spanishstemmer), new Among("aban", 16, 2, "", spanishstemmer), new Among("aran", 16, 2, "", spanishstemmer), new Among("ieran", 16, 2, "", spanishstemmer), new Among("ían", 16, 2, "", spanishstemmer), new Among("arían", 20, 2, "", spanishstemmer), new Among("erían", 20, 2, "", spanishstemmer), new Among("irían", 20, 2, "", spanishstemmer), new Among("en", -1, 1, "", spanishstemmer), new Among("asen", 24, 2, "", spanishstemmer), new Among("iesen", 24, 2, "", spanishstemmer), new Among("aron", -1, 2, "", spanishstemmer), new Among("ieron", -1, 2, "", spanishstemmer), new Among("arán", -1, 2, "", spanishstemmer), new Among("erán", -1, 2, "", spanishstemmer), new Among("irán", -1, 2, "", spanishstemmer), new Among("ado", -1, 2, "", spanishstemmer), new Among("ido", -1, 2, "", spanishstemmer), new Among("ando", -1, 2, "", spanishstemmer), new Among("iendo", -1, 2, "", spanishstemmer), new Among("ar", -1, 2, "", spanishstemmer), new Among("er", -1, 2, "", spanishstemmer), new Among("ir", -1, 2, "", spanishstemmer), new Among("as", -1, 2, "", spanishstemmer), new Among("abas", 39, 2, "", spanishstemmer), new Among("adas", 39, 2, "", spanishstemmer), new Among("idas", 39, 2, "", spanishstemmer), new Among("aras", 39, 2, "", spanishstemmer), new Among("ieras", 39, 2, "", spanishstemmer), new Among("ías", 39, 2, "", spanishstemmer), new Among("arías", 45, 2, "", spanishstemmer), new Among("erías", 45, 2, "", spanishstemmer), new Among("irías", 45, 2, "", spanishstemmer), new Among("es", -1, 1, "", spanishstemmer), new Among("ases", 49, 2, "", spanishstemmer), new Among("ieses", 49, 2, "", spanishstemmer), new Among("abais", -1, 2, "", spanishstemmer), new Among("arais", -1, 2, "", spanishstemmer), new Among("ierais", -1, 2, "", spanishstemmer), new Among("íais", -1, 2, "", spanishstemmer), new Among("aríais", 55, 2, "", spanishstemmer), new Among("eríais", 55, 2, "", spanishstemmer), new Among("iríais", 55, 2, "", spanishstemmer), new Among("aseis", -1, 2, "", spanishstemmer), new Among("ieseis", -1, 2, "", spanishstemmer), new Among("asteis", -1, 2, "", spanishstemmer), new Among("isteis", -1, 2, "", spanishstemmer), new Among("áis", -1, 2, "", spanishstemmer), new Among("éis", -1, 1, "", spanishstemmer), new Among("aréis", 64, 2, "", spanishstemmer), new Among("eréis", 64, 2, "", spanishstemmer), new Among("iréis", 64, 2, "", spanishstemmer), new Among("ados", -1, 2, "", spanishstemmer), new Among("idos", -1, 2, "", spanishstemmer), new Among("amos", -1, 2, "", spanishstemmer), new Among("ábamos", 70, 2, "", spanishstemmer), new Among("áramos", 70, 2, "", spanishstemmer), new Among("iéramos", 70, 2, "", spanishstemmer), new Among("íamos", 70, 2, "", spanishstemmer), new Among("aríamos", 74, 2, "", spanishstemmer), new Among("eríamos", 74, 2, "", spanishstemmer), new Among("iríamos", 74, 2, "", spanishstemmer), new Among("emos", -1, 1, "", spanishstemmer), new Among("aremos", 78, 2, "", spanishstemmer), new Among("eremos", 78, 2, "", spanishstemmer), new Among("iremos", 78, 2, "", spanishstemmer), new Among("ásemos", 78, 2, "", spanishstemmer), new Among("iésemos", 78, 2, "", spanishstemmer), new Among("imos", -1, 2, "", spanishstemmer), new Among("arás", -1, 2, "", spanishstemmer), new Among("erás", -1, 2, "", spanishstemmer), new Among("irás", -1, 2, "", spanishstemmer), new Among("ís", -1, 2, "", spanishstemmer), new Among("ará", -1, 2, "", spanishstemmer), new Among("erá", -1, 2, "", spanishstemmer), new Among("irá", -1, 2, "", spanishstemmer), new Among("aré", -1, 2, "", spanishstemmer), new Among("eré", -1, 2, "", spanishstemmer), new Among("iré", -1, 2, "", spanishstemmer), new Among("ió", -1, 2, "", spanishstemmer)};
        a_9 = new Among[]{new Among("a", -1, 1, "", spanishstemmer), new Among("e", -1, 2, "", spanishstemmer), new Among("o", -1, 1, "", spanishstemmer), new Among("os", -1, 1, "", spanishstemmer), new Among("á", -1, 1, "", spanishstemmer), new Among("é", -1, 2, "", spanishstemmer), new Among("í", -1, 1, "", spanishstemmer), new Among("ó", -1, 1, "", spanishstemmer)};
        g_v = new char[]{17, 'A', 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 17, 4, '\n'};
    }

    private void copy_from(spanishStemmer spanishstemmer) {
        this.I_p2 = spanishstemmer.I_p2;
        this.I_p1 = spanishstemmer.I_p1;
        this.I_pV = spanishstemmer.I_pV;
        super.copy_from((SnowballProgram) spanishstemmer);
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
        throw new UnsupportedOperationException("Method not decompiled: org.tartarus.snowball.ext.spanishStemmer.r_mark_regions():boolean");
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private boolean r_attached_pronoun() {
        this.ket = this.cursor;
        if (find_among_b(a_1, 13) == 0) {
            return false;
        }
        this.bra = this.cursor;
        int find_among_b = find_among_b(a_2, 11);
        if (find_among_b == 0 || !r_RV()) {
            return false;
        }
        switch (find_among_b) {
            case 0:
                return false;
            case 1:
                this.bra = this.cursor;
                slice_from("iendo");
                return true;
            case 2:
                this.bra = this.cursor;
                slice_from("ando");
                return true;
            case 3:
                this.bra = this.cursor;
                slice_from("ar");
                return true;
            case 4:
                this.bra = this.cursor;
                slice_from("er");
                return true;
            case 5:
                this.bra = this.cursor;
                slice_from("ir");
                return true;
            case 6:
                slice_del();
                return true;
            case 7:
                if (!eq_s_b(1, "u")) {
                    return false;
                }
                slice_del();
                return true;
            default:
                return true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private boolean r_standard_suffix() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_6, 46);
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        switch (find_among_b) {
            case 0:
                return false;
            case 1:
                if (!r_R2()) {
                    return false;
                }
                slice_del();
                return true;
            case 2:
                if (!r_R2()) {
                    return false;
                }
                slice_del();
                int i = this.limit - this.cursor;
                this.ket = this.cursor;
                if (!eq_s_b(2, "ic")) {
                    this.cursor = this.limit - i;
                } else {
                    this.bra = this.cursor;
                    if (!r_R2()) {
                        this.cursor = this.limit - i;
                    } else {
                        slice_del();
                    }
                }
                return true;
            case 3:
                if (!r_R2()) {
                    return false;
                }
                slice_from("log");
                return true;
            case 4:
                if (!r_R2()) {
                    return false;
                }
                slice_from("u");
                return true;
            case 5:
                if (!r_R2()) {
                    return false;
                }
                slice_from("ente");
                return true;
            case 6:
                if (!r_R1()) {
                    return false;
                }
                slice_del();
                int i2 = this.limit - this.cursor;
                this.ket = this.cursor;
                int find_among_b2 = find_among_b(a_3, 4);
                if (find_among_b2 == 0) {
                    this.cursor = this.limit - i2;
                } else {
                    this.bra = this.cursor;
                    if (!r_R2()) {
                        this.cursor = this.limit - i2;
                    } else {
                        slice_del();
                        if (find_among_b2 == 0) {
                            this.cursor = this.limit - i2;
                        } else if (find_among_b2 == 1) {
                            this.ket = this.cursor;
                            if (!eq_s_b(2, "at")) {
                                this.cursor = this.limit - i2;
                            } else {
                                this.bra = this.cursor;
                                if (!r_R2()) {
                                    this.cursor = this.limit - i2;
                                } else {
                                    slice_del();
                                }
                            }
                        }
                    }
                }
                return true;
            case 7:
                if (!r_R2()) {
                    return false;
                }
                slice_del();
                int i3 = this.limit - this.cursor;
                this.ket = this.cursor;
                int find_among_b3 = find_among_b(a_4, 3);
                if (find_among_b3 == 0) {
                    this.cursor = this.limit - i3;
                } else {
                    this.bra = this.cursor;
                    if (find_among_b3 == 0) {
                        this.cursor = this.limit - i3;
                    } else if (find_among_b3 == 1) {
                        if (!r_R2()) {
                            this.cursor = this.limit - i3;
                        } else {
                            slice_del();
                        }
                    }
                }
                return true;
            case 8:
                if (!r_R2()) {
                    return false;
                }
                slice_del();
                int i4 = this.limit - this.cursor;
                this.ket = this.cursor;
                int find_among_b4 = find_among_b(a_5, 3);
                if (find_among_b4 == 0) {
                    this.cursor = this.limit - i4;
                } else {
                    this.bra = this.cursor;
                    if (find_among_b4 == 0) {
                        this.cursor = this.limit - i4;
                    } else if (find_among_b4 == 1) {
                        if (!r_R2()) {
                            this.cursor = this.limit - i4;
                        } else {
                            slice_del();
                        }
                    }
                }
                return true;
            case 9:
                if (!r_R2()) {
                    return false;
                }
                slice_del();
                int i5 = this.limit - this.cursor;
                this.ket = this.cursor;
                if (!eq_s_b(2, "at")) {
                    this.cursor = this.limit - i5;
                } else {
                    this.bra = this.cursor;
                    if (!r_R2()) {
                        this.cursor = this.limit - i5;
                    } else {
                        slice_del();
                    }
                }
                return true;
            default:
                return true;
        }
    }

    private boolean r_y_verb_suffix() {
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
        int find_among_b = find_among_b(a_7, 12);
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
            if (!eq_s_b(1, "u")) {
                return false;
            }
            slice_del();
        }
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
        int find_among_b = find_among_b(a_8, 96);
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
            int i5 = this.limit - this.cursor;
            if (!eq_s_b(1, "u")) {
                this.cursor = this.limit - i5;
            } else {
                int i6 = this.limit - this.cursor;
                if (!eq_s_b(1, "g")) {
                    this.cursor = this.limit - i5;
                } else {
                    this.cursor = this.limit - i6;
                }
            }
            this.bra = this.cursor;
            slice_del();
        } else if (find_among_b == 2) {
            slice_del();
        }
        return true;
    }

    private boolean r_residual_suffix() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_9, 8);
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (find_among_b == 0) {
            return false;
        }
        if (find_among_b != 1) {
            if (find_among_b == 2) {
                if (!r_RV()) {
                    return false;
                }
                slice_del();
                int i = this.limit - this.cursor;
                this.ket = this.cursor;
                if (!eq_s_b(1, "u")) {
                    this.cursor = this.limit - i;
                } else {
                    this.bra = this.cursor;
                    int i2 = this.limit - this.cursor;
                    if (!eq_s_b(1, "g")) {
                        this.cursor = this.limit - i;
                    } else {
                        this.cursor = this.limit - i2;
                        if (!r_RV()) {
                            this.cursor = this.limit - i;
                        } else {
                            slice_del();
                        }
                    }
                }
            }
        } else {
            if (!r_RV()) {
                return false;
            }
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
        r_attached_pronoun();
        this.cursor = this.limit - i2;
        int i3 = this.limit - this.cursor;
        int i4 = this.limit - this.cursor;
        if (!r_standard_suffix()) {
            this.cursor = this.limit - i4;
            if (!r_y_verb_suffix()) {
                this.cursor = this.limit - i4;
                r_verb_suffix();
            }
        }
        this.cursor = this.limit - i3;
        int i5 = this.limit - this.cursor;
        r_residual_suffix();
        this.cursor = this.limit - i5;
        this.cursor = this.limit_backward;
        int i6 = this.cursor;
        r_postlude();
        this.cursor = i6;
        return true;
    }

    public boolean equals(Object obj) {
        return obj instanceof spanishStemmer;
    }

    public int hashCode() {
        return "org.tartarus.snowball.ext.spanishStemmer".hashCode();
    }
}
