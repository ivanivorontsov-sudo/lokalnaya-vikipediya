package org.tartarus.snowball.ext;

import org.tartarus.snowball.Among;
import org.tartarus.snowball.SnowballProgram;
import org.tartarus.snowball.SnowballStemmer;

/* loaded from: classes.dex */
public class portugueseStemmer extends SnowballStemmer {
    private static final Among[] a_0;
    private static final Among[] a_1;
    private static final Among[] a_2;
    private static final Among[] a_3;
    private static final Among[] a_4;
    private static final Among[] a_5;
    private static final Among[] a_6;
    private static final Among[] a_7;
    private static final Among[] a_8;
    private static final char[] g_v;
    private static final portugueseStemmer methodObject;
    private static final long serialVersionUID = 1;
    private int I_p1;
    private int I_p2;
    private int I_pV;

    static {
        portugueseStemmer portuguesestemmer = new portugueseStemmer();
        methodObject = portuguesestemmer;
        a_0 = new Among[]{new Among("", -1, 3, "", portuguesestemmer), new Among("ã", 0, 1, "", portuguesestemmer), new Among("õ", 0, 2, "", portuguesestemmer)};
        a_1 = new Among[]{new Among("", -1, 3, "", portuguesestemmer), new Among("a~", 0, 1, "", portuguesestemmer), new Among("o~", 0, 2, "", portuguesestemmer)};
        a_2 = new Among[]{new Among("ic", -1, -1, "", portuguesestemmer), new Among("ad", -1, -1, "", portuguesestemmer), new Among("os", -1, -1, "", portuguesestemmer), new Among("iv", -1, 1, "", portuguesestemmer)};
        a_3 = new Among[]{new Among("ante", -1, 1, "", portuguesestemmer), new Among("avel", -1, 1, "", portuguesestemmer), new Among("ível", -1, 1, "", portuguesestemmer)};
        a_4 = new Among[]{new Among("ic", -1, 1, "", portuguesestemmer), new Among("abil", -1, 1, "", portuguesestemmer), new Among("iv", -1, 1, "", portuguesestemmer)};
        a_5 = new Among[]{new Among("ica", -1, 1, "", portuguesestemmer), new Among("ância", -1, 1, "", portuguesestemmer), new Among("ência", -1, 4, "", portuguesestemmer), new Among("ira", -1, 9, "", portuguesestemmer), new Among("adora", -1, 1, "", portuguesestemmer), new Among("osa", -1, 1, "", portuguesestemmer), new Among("ista", -1, 1, "", portuguesestemmer), new Among("iva", -1, 8, "", portuguesestemmer), new Among("eza", -1, 1, "", portuguesestemmer), new Among("logía", -1, 2, "", portuguesestemmer), new Among("idade", -1, 7, "", portuguesestemmer), new Among("ante", -1, 1, "", portuguesestemmer), new Among("mente", -1, 6, "", portuguesestemmer), new Among("amente", 12, 5, "", portuguesestemmer), new Among("ável", -1, 1, "", portuguesestemmer), new Among("ível", -1, 1, "", portuguesestemmer), new Among("ución", -1, 3, "", portuguesestemmer), new Among("ico", -1, 1, "", portuguesestemmer), new Among("ismo", -1, 1, "", portuguesestemmer), new Among("oso", -1, 1, "", portuguesestemmer), new Among("amento", -1, 1, "", portuguesestemmer), new Among("imento", -1, 1, "", portuguesestemmer), new Among("ivo", -1, 8, "", portuguesestemmer), new Among("aça~o", -1, 1, "", portuguesestemmer), new Among("ador", -1, 1, "", portuguesestemmer), new Among("icas", -1, 1, "", portuguesestemmer), new Among("ências", -1, 4, "", portuguesestemmer), new Among("iras", -1, 9, "", portuguesestemmer), new Among("adoras", -1, 1, "", portuguesestemmer), new Among("osas", -1, 1, "", portuguesestemmer), new Among("istas", -1, 1, "", portuguesestemmer), new Among("ivas", -1, 8, "", portuguesestemmer), new Among("ezas", -1, 1, "", portuguesestemmer), new Among("logías", -1, 2, "", portuguesestemmer), new Among("idades", -1, 7, "", portuguesestemmer), new Among("uciones", -1, 3, "", portuguesestemmer), new Among("adores", -1, 1, "", portuguesestemmer), new Among("antes", -1, 1, "", portuguesestemmer), new Among("aço~es", -1, 1, "", portuguesestemmer), new Among("icos", -1, 1, "", portuguesestemmer), new Among("ismos", -1, 1, "", portuguesestemmer), new Among("osos", -1, 1, "", portuguesestemmer), new Among("amentos", -1, 1, "", portuguesestemmer), new Among("imentos", -1, 1, "", portuguesestemmer), new Among("ivos", -1, 8, "", portuguesestemmer)};
        a_6 = new Among[]{new Among("ada", -1, 1, "", portuguesestemmer), new Among("ida", -1, 1, "", portuguesestemmer), new Among("ia", -1, 1, "", portuguesestemmer), new Among("aria", 2, 1, "", portuguesestemmer), new Among("eria", 2, 1, "", portuguesestemmer), new Among("iria", 2, 1, "", portuguesestemmer), new Among("ara", -1, 1, "", portuguesestemmer), new Among("era", -1, 1, "", portuguesestemmer), new Among("ira", -1, 1, "", portuguesestemmer), new Among("ava", -1, 1, "", portuguesestemmer), new Among("asse", -1, 1, "", portuguesestemmer), new Among("esse", -1, 1, "", portuguesestemmer), new Among("isse", -1, 1, "", portuguesestemmer), new Among("aste", -1, 1, "", portuguesestemmer), new Among("este", -1, 1, "", portuguesestemmer), new Among("iste", -1, 1, "", portuguesestemmer), new Among("ei", -1, 1, "", portuguesestemmer), new Among("arei", 16, 1, "", portuguesestemmer), new Among("erei", 16, 1, "", portuguesestemmer), new Among("irei", 16, 1, "", portuguesestemmer), new Among("am", -1, 1, "", portuguesestemmer), new Among("iam", 20, 1, "", portuguesestemmer), new Among("ariam", 21, 1, "", portuguesestemmer), new Among("eriam", 21, 1, "", portuguesestemmer), new Among("iriam", 21, 1, "", portuguesestemmer), new Among("aram", 20, 1, "", portuguesestemmer), new Among("eram", 20, 1, "", portuguesestemmer), new Among("iram", 20, 1, "", portuguesestemmer), new Among("avam", 20, 1, "", portuguesestemmer), new Among("em", -1, 1, "", portuguesestemmer), new Among("arem", 29, 1, "", portuguesestemmer), new Among("erem", 29, 1, "", portuguesestemmer), new Among("irem", 29, 1, "", portuguesestemmer), new Among("assem", 29, 1, "", portuguesestemmer), new Among("essem", 29, 1, "", portuguesestemmer), new Among("issem", 29, 1, "", portuguesestemmer), new Among("ado", -1, 1, "", portuguesestemmer), new Among("ido", -1, 1, "", portuguesestemmer), new Among("ando", -1, 1, "", portuguesestemmer), new Among("endo", -1, 1, "", portuguesestemmer), new Among("indo", -1, 1, "", portuguesestemmer), new Among("ara~o", -1, 1, "", portuguesestemmer), new Among("era~o", -1, 1, "", portuguesestemmer), new Among("ira~o", -1, 1, "", portuguesestemmer), new Among("ar", -1, 1, "", portuguesestemmer), new Among("er", -1, 1, "", portuguesestemmer), new Among("ir", -1, 1, "", portuguesestemmer), new Among("as", -1, 1, "", portuguesestemmer), new Among("adas", 47, 1, "", portuguesestemmer), new Among("idas", 47, 1, "", portuguesestemmer), new Among("ias", 47, 1, "", portuguesestemmer), new Among("arias", 50, 1, "", portuguesestemmer), new Among("erias", 50, 1, "", portuguesestemmer), new Among("irias", 50, 1, "", portuguesestemmer), new Among("aras", 47, 1, "", portuguesestemmer), new Among("eras", 47, 1, "", portuguesestemmer), new Among("iras", 47, 1, "", portuguesestemmer), new Among("avas", 47, 1, "", portuguesestemmer), new Among("es", -1, 1, "", portuguesestemmer), new Among("ardes", 58, 1, "", portuguesestemmer), new Among("erdes", 58, 1, "", portuguesestemmer), new Among("irdes", 58, 1, "", portuguesestemmer), new Among("ares", 58, 1, "", portuguesestemmer), new Among("eres", 58, 1, "", portuguesestemmer), new Among("ires", 58, 1, "", portuguesestemmer), new Among("asses", 58, 1, "", portuguesestemmer), new Among("esses", 58, 1, "", portuguesestemmer), new Among("isses", 58, 1, "", portuguesestemmer), new Among("astes", 58, 1, "", portuguesestemmer), new Among("estes", 58, 1, "", portuguesestemmer), new Among("istes", 58, 1, "", portuguesestemmer), new Among("is", -1, 1, "", portuguesestemmer), new Among("ais", 71, 1, "", portuguesestemmer), new Among("eis", 71, 1, "", portuguesestemmer), new Among("areis", 73, 1, "", portuguesestemmer), new Among("ereis", 73, 1, "", portuguesestemmer), new Among("ireis", 73, 1, "", portuguesestemmer), new Among("áreis", 73, 1, "", portuguesestemmer), new Among("éreis", 73, 1, "", portuguesestemmer), new Among("íreis", 73, 1, "", portuguesestemmer), new Among("ásseis", 73, 1, "", portuguesestemmer), new Among("ésseis", 73, 1, "", portuguesestemmer), new Among("ísseis", 73, 1, "", portuguesestemmer), new Among("áveis", 73, 1, "", portuguesestemmer), new Among("íeis", 73, 1, "", portuguesestemmer), new Among("aríeis", 84, 1, "", portuguesestemmer), new Among("eríeis", 84, 1, "", portuguesestemmer), new Among("iríeis", 84, 1, "", portuguesestemmer), new Among("ados", -1, 1, "", portuguesestemmer), new Among("idos", -1, 1, "", portuguesestemmer), new Among("amos", -1, 1, "", portuguesestemmer), new Among("áramos", 90, 1, "", portuguesestemmer), new Among("éramos", 90, 1, "", portuguesestemmer), new Among("íramos", 90, 1, "", portuguesestemmer), new Among("ávamos", 90, 1, "", portuguesestemmer), new Among("íamos", 90, 1, "", portuguesestemmer), new Among("aríamos", 95, 1, "", portuguesestemmer), new Among("eríamos", 95, 1, "", portuguesestemmer), new Among("iríamos", 95, 1, "", portuguesestemmer), new Among("emos", -1, 1, "", portuguesestemmer), new Among("aremos", 99, 1, "", portuguesestemmer), new Among("eremos", 99, 1, "", portuguesestemmer), new Among("iremos", 99, 1, "", portuguesestemmer), new Among("ássemos", 99, 1, "", portuguesestemmer), new Among("êssemos", 99, 1, "", portuguesestemmer), new Among("íssemos", 99, 1, "", portuguesestemmer), new Among("imos", -1, 1, "", portuguesestemmer), new Among("armos", -1, 1, "", portuguesestemmer), new Among("ermos", -1, 1, "", portuguesestemmer), new Among("irmos", -1, 1, "", portuguesestemmer), new Among("ámos", -1, 1, "", portuguesestemmer), new Among("arás", -1, 1, "", portuguesestemmer), new Among("erás", -1, 1, "", portuguesestemmer), new Among("irás", -1, 1, "", portuguesestemmer), new Among("eu", -1, 1, "", portuguesestemmer), new Among("iu", -1, 1, "", portuguesestemmer), new Among("ou", -1, 1, "", portuguesestemmer), new Among("ará", -1, 1, "", portuguesestemmer), new Among("erá", -1, 1, "", portuguesestemmer), new Among("irá", -1, 1, "", portuguesestemmer)};
        a_7 = new Among[]{new Among("a", -1, 1, "", portuguesestemmer), new Among("i", -1, 1, "", portuguesestemmer), new Among("o", -1, 1, "", portuguesestemmer), new Among("os", -1, 1, "", portuguesestemmer), new Among("á", -1, 1, "", portuguesestemmer), new Among("í", -1, 1, "", portuguesestemmer), new Among("ó", -1, 1, "", portuguesestemmer)};
        a_8 = new Among[]{new Among("e", -1, 1, "", portuguesestemmer), new Among("ç", -1, 2, "", portuguesestemmer), new Among("é", -1, 1, "", portuguesestemmer), new Among("ê", -1, 1, "", portuguesestemmer)};
        g_v = new char[]{17, 'A', 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 19, '\f', 2};
    }

    private void copy_from(portugueseStemmer portuguesestemmer) {
        this.I_p2 = portuguesestemmer.I_p2;
        this.I_p1 = portuguesestemmer.I_p1;
        this.I_pV = portuguesestemmer.I_pV;
        super.copy_from((SnowballProgram) portuguesestemmer);
    }

    private boolean r_prelude() {
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
                slice_from("a~");
            } else if (find_among == 2) {
                slice_from("o~");
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
        throw new UnsupportedOperationException("Method not decompiled: org.tartarus.snowball.ext.portugueseStemmer.r_mark_regions():boolean");
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
                slice_from("ã");
            } else if (find_among == 2) {
                slice_from("õ");
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private boolean r_standard_suffix() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_5, 45);
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
                slice_from("log");
                return true;
            case 3:
                if (!r_R2()) {
                    return false;
                }
                slice_from("u");
                return true;
            case 4:
                if (!r_R2()) {
                    return false;
                }
                slice_from("ente");
                return true;
            case 5:
                if (!r_R1()) {
                    return false;
                }
                slice_del();
                int i = this.limit - this.cursor;
                this.ket = this.cursor;
                int find_among_b2 = find_among_b(a_2, 4);
                if (find_among_b2 == 0) {
                    this.cursor = this.limit - i;
                } else {
                    this.bra = this.cursor;
                    if (!r_R2()) {
                        this.cursor = this.limit - i;
                    } else {
                        slice_del();
                        if (find_among_b2 == 0) {
                            this.cursor = this.limit - i;
                        } else if (find_among_b2 == 1) {
                            this.ket = this.cursor;
                            if (!eq_s_b(2, "at")) {
                                this.cursor = this.limit - i;
                            } else {
                                this.bra = this.cursor;
                                if (!r_R2()) {
                                    this.cursor = this.limit - i;
                                } else {
                                    slice_del();
                                }
                            }
                        }
                    }
                }
                return true;
            case 6:
                if (!r_R2()) {
                    return false;
                }
                slice_del();
                int i2 = this.limit - this.cursor;
                this.ket = this.cursor;
                int find_among_b3 = find_among_b(a_3, 3);
                if (find_among_b3 == 0) {
                    this.cursor = this.limit - i2;
                } else {
                    this.bra = this.cursor;
                    if (find_among_b3 == 0) {
                        this.cursor = this.limit - i2;
                    } else if (find_among_b3 == 1) {
                        if (!r_R2()) {
                            this.cursor = this.limit - i2;
                        } else {
                            slice_del();
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
                int find_among_b4 = find_among_b(a_4, 3);
                if (find_among_b4 == 0) {
                    this.cursor = this.limit - i3;
                } else {
                    this.bra = this.cursor;
                    if (find_among_b4 == 0) {
                        this.cursor = this.limit - i3;
                    } else if (find_among_b4 == 1) {
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
                if (!eq_s_b(2, "at")) {
                    this.cursor = this.limit - i4;
                } else {
                    this.bra = this.cursor;
                    if (!r_R2()) {
                        this.cursor = this.limit - i4;
                    } else {
                        slice_del();
                    }
                }
                return true;
            case 9:
                if (!r_RV() || !eq_s_b(1, "e")) {
                    return false;
                }
                slice_from("ir");
                return true;
            default:
                return true;
        }
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
        int find_among_b = find_among_b(a_6, 120);
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
        }
        this.limit_backward = i4;
        return true;
    }

    private boolean r_residual_suffix() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_7, 7);
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (find_among_b == 0) {
            return false;
        }
        if (find_among_b == 1) {
            if (!r_RV()) {
                return false;
            }
            slice_del();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean r_residual_form() {
        /*
            r6 = this;
            int r0 = r6.cursor
            r6.ket = r0
            org.tartarus.snowball.Among[] r0 = org.tartarus.snowball.ext.portugueseStemmer.a_8
            r1 = 4
            int r0 = r6.find_among_b(r0, r1)
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            int r2 = r6.cursor
            r6.bra = r2
            if (r0 == 0) goto L83
            java.lang.String r2 = "c"
            r3 = 1
            if (r0 == r3) goto L22
            r1 = 2
            if (r0 == r1) goto L1e
            goto L82
        L1e:
            r6.slice_from(r2)
            goto L82
        L22:
            boolean r0 = r6.r_RV()
            if (r0 != 0) goto L29
            return r1
        L29:
            r6.slice_del()
            int r0 = r6.cursor
            r6.ket = r0
            int r0 = r6.limit
            int r4 = r6.cursor
            int r0 = r0 - r4
            java.lang.String r4 = "u"
            boolean r4 = r6.eq_s_b(r3, r4)
            if (r4 != 0) goto L3e
            goto L4f
        L3e:
            int r4 = r6.cursor
            r6.bra = r4
            int r4 = r6.limit
            int r5 = r6.cursor
            int r4 = r4 - r5
            java.lang.String r5 = "g"
            boolean r5 = r6.eq_s_b(r3, r5)
            if (r5 != 0) goto L73
        L4f:
            int r4 = r6.limit
            int r4 = r4 - r0
            r6.cursor = r4
            java.lang.String r0 = "i"
            boolean r0 = r6.eq_s_b(r3, r0)
            if (r0 != 0) goto L5d
            return r1
        L5d:
            int r0 = r6.cursor
            r6.bra = r0
            int r0 = r6.limit
            int r4 = r6.cursor
            int r0 = r0 - r4
            boolean r2 = r6.eq_s_b(r3, r2)
            if (r2 != 0) goto L6d
            return r1
        L6d:
            int r2 = r6.limit
            int r2 = r2 - r0
            r6.cursor = r2
            goto L78
        L73:
            int r0 = r6.limit
            int r0 = r0 - r4
            r6.cursor = r0
        L78:
            boolean r0 = r6.r_RV()
            if (r0 != 0) goto L7f
            return r1
        L7f:
            r6.slice_del()
        L82:
            return r3
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tartarus.snowball.ext.portugueseStemmer.r_residual_form():boolean");
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
        int i4 = this.limit - this.cursor;
        int i5 = this.limit - this.cursor;
        int i6 = this.limit - this.cursor;
        if (!r_standard_suffix()) {
            this.cursor = this.limit - i6;
            if (!r_verb_suffix()) {
                this.cursor = this.limit - i4;
                r_residual_suffix();
                this.cursor = this.limit - i3;
                int i7 = this.limit - this.cursor;
                r_residual_form();
                this.cursor = this.limit - i7;
                this.cursor = this.limit_backward;
                int i8 = this.cursor;
                r_postlude();
                this.cursor = i8;
                return true;
            }
        }
        this.cursor = this.limit - i5;
        int i9 = this.limit - this.cursor;
        this.ket = this.cursor;
        if (eq_s_b(1, "i")) {
            this.bra = this.cursor;
            int i10 = this.limit - this.cursor;
            if (eq_s_b(1, "c")) {
                this.cursor = this.limit - i10;
                if (r_RV()) {
                    slice_del();
                }
            }
        }
        this.cursor = this.limit - i9;
        this.cursor = this.limit - i3;
        int i72 = this.limit - this.cursor;
        r_residual_form();
        this.cursor = this.limit - i72;
        this.cursor = this.limit_backward;
        int i82 = this.cursor;
        r_postlude();
        this.cursor = i82;
        return true;
    }

    public boolean equals(Object obj) {
        return obj instanceof portugueseStemmer;
    }

    public int hashCode() {
        return "org.tartarus.snowball.ext.portugueseStemmer".hashCode();
    }
}
