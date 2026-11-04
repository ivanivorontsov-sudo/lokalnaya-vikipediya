package org.tartarus.snowball.ext;

import org.tartarus.snowball.Among;
import org.tartarus.snowball.SnowballProgram;
import org.tartarus.snowball.SnowballStemmer;

/* loaded from: classes.dex */
public class russianStemmer extends SnowballStemmer {
    private static final Among[] a_0;
    private static final Among[] a_1;
    private static final Among[] a_2;
    private static final Among[] a_3;
    private static final Among[] a_4;
    private static final Among[] a_5;
    private static final Among[] a_6;
    private static final Among[] a_7;
    private static final char[] g_v;
    private static final russianStemmer methodObject;
    private static final long serialVersionUID = 1;
    private int I_p2;
    private int I_pV;

    static {
        russianStemmer russianstemmer = new russianStemmer();
        methodObject = russianstemmer;
        a_0 = new Among[]{new Among("в", -1, 1, "", russianstemmer), new Among("ив", 0, 2, "", russianstemmer), new Among("ыв", 0, 2, "", russianstemmer), new Among("вши", -1, 1, "", russianstemmer), new Among("ивши", 3, 2, "", russianstemmer), new Among("ывши", 3, 2, "", russianstemmer), new Among("вшись", -1, 1, "", russianstemmer), new Among("ившись", 6, 2, "", russianstemmer), new Among("ывшись", 6, 2, "", russianstemmer)};
        a_1 = new Among[]{new Among("ее", -1, 1, "", russianstemmer), new Among("ие", -1, 1, "", russianstemmer), new Among("ое", -1, 1, "", russianstemmer), new Among("ые", -1, 1, "", russianstemmer), new Among("ими", -1, 1, "", russianstemmer), new Among("ыми", -1, 1, "", russianstemmer), new Among("ей", -1, 1, "", russianstemmer), new Among("ий", -1, 1, "", russianstemmer), new Among("ой", -1, 1, "", russianstemmer), new Among("ый", -1, 1, "", russianstemmer), new Among("ем", -1, 1, "", russianstemmer), new Among("им", -1, 1, "", russianstemmer), new Among("ом", -1, 1, "", russianstemmer), new Among("ым", -1, 1, "", russianstemmer), new Among("его", -1, 1, "", russianstemmer), new Among("ого", -1, 1, "", russianstemmer), new Among("ему", -1, 1, "", russianstemmer), new Among("ому", -1, 1, "", russianstemmer), new Among("их", -1, 1, "", russianstemmer), new Among("ых", -1, 1, "", russianstemmer), new Among("ею", -1, 1, "", russianstemmer), new Among("ою", -1, 1, "", russianstemmer), new Among("ую", -1, 1, "", russianstemmer), new Among("юю", -1, 1, "", russianstemmer), new Among("ая", -1, 1, "", russianstemmer), new Among("яя", -1, 1, "", russianstemmer)};
        a_2 = new Among[]{new Among("ем", -1, 1, "", russianstemmer), new Among("нн", -1, 1, "", russianstemmer), new Among("вш", -1, 1, "", russianstemmer), new Among("ивш", 2, 2, "", russianstemmer), new Among("ывш", 2, 2, "", russianstemmer), new Among("щ", -1, 1, "", russianstemmer), new Among("ющ", 5, 1, "", russianstemmer), new Among("ующ", 6, 2, "", russianstemmer)};
        a_3 = new Among[]{new Among("сь", -1, 1, "", russianstemmer), new Among("ся", -1, 1, "", russianstemmer)};
        a_4 = new Among[]{new Among("ла", -1, 1, "", russianstemmer), new Among("ила", 0, 2, "", russianstemmer), new Among("ыла", 0, 2, "", russianstemmer), new Among("на", -1, 1, "", russianstemmer), new Among("ена", 3, 2, "", russianstemmer), new Among("ете", -1, 1, "", russianstemmer), new Among("ите", -1, 2, "", russianstemmer), new Among("йте", -1, 1, "", russianstemmer), new Among("ейте", 7, 2, "", russianstemmer), new Among("уйте", 7, 2, "", russianstemmer), new Among("ли", -1, 1, "", russianstemmer), new Among("или", 10, 2, "", russianstemmer), new Among("ыли", 10, 2, "", russianstemmer), new Among("й", -1, 1, "", russianstemmer), new Among("ей", 13, 2, "", russianstemmer), new Among("уй", 13, 2, "", russianstemmer), new Among("л", -1, 1, "", russianstemmer), new Among("ил", 16, 2, "", russianstemmer), new Among("ыл", 16, 2, "", russianstemmer), new Among("ем", -1, 1, "", russianstemmer), new Among("им", -1, 2, "", russianstemmer), new Among("ым", -1, 2, "", russianstemmer), new Among("н", -1, 1, "", russianstemmer), new Among("ен", 22, 2, "", russianstemmer), new Among("ло", -1, 1, "", russianstemmer), new Among("ило", 24, 2, "", russianstemmer), new Among("ыло", 24, 2, "", russianstemmer), new Among("но", -1, 1, "", russianstemmer), new Among("ено", 27, 2, "", russianstemmer), new Among("нно", 27, 1, "", russianstemmer), new Among("ет", -1, 1, "", russianstemmer), new Among("ует", 30, 2, "", russianstemmer), new Among("ит", -1, 2, "", russianstemmer), new Among("ыт", -1, 2, "", russianstemmer), new Among("ют", -1, 1, "", russianstemmer), new Among("уют", 34, 2, "", russianstemmer), new Among("ят", -1, 2, "", russianstemmer), new Among("ны", -1, 1, "", russianstemmer), new Among("ены", 37, 2, "", russianstemmer), new Among("ть", -1, 1, "", russianstemmer), new Among("ить", 39, 2, "", russianstemmer), new Among("ыть", 39, 2, "", russianstemmer), new Among("ешь", -1, 1, "", russianstemmer), new Among("ишь", -1, 2, "", russianstemmer), new Among("ю", -1, 2, "", russianstemmer), new Among("ую", 44, 2, "", russianstemmer)};
        a_5 = new Among[]{new Among("а", -1, 1, "", russianstemmer), new Among("ев", -1, 1, "", russianstemmer), new Among("ов", -1, 1, "", russianstemmer), new Among("е", -1, 1, "", russianstemmer), new Among("ие", 3, 1, "", russianstemmer), new Among("ье", 3, 1, "", russianstemmer), new Among("и", -1, 1, "", russianstemmer), new Among("еи", 6, 1, "", russianstemmer), new Among("ии", 6, 1, "", russianstemmer), new Among("ами", 6, 1, "", russianstemmer), new Among("ями", 6, 1, "", russianstemmer), new Among("иями", 10, 1, "", russianstemmer), new Among("й", -1, 1, "", russianstemmer), new Among("ей", 12, 1, "", russianstemmer), new Among("ией", 13, 1, "", russianstemmer), new Among("ий", 12, 1, "", russianstemmer), new Among("ой", 12, 1, "", russianstemmer), new Among("ам", -1, 1, "", russianstemmer), new Among("ем", -1, 1, "", russianstemmer), new Among("ием", 18, 1, "", russianstemmer), new Among("ом", -1, 1, "", russianstemmer), new Among("ям", -1, 1, "", russianstemmer), new Among("иям", 21, 1, "", russianstemmer), new Among("о", -1, 1, "", russianstemmer), new Among("у", -1, 1, "", russianstemmer), new Among("ах", -1, 1, "", russianstemmer), new Among("ях", -1, 1, "", russianstemmer), new Among("иях", 26, 1, "", russianstemmer), new Among("ы", -1, 1, "", russianstemmer), new Among("ь", -1, 1, "", russianstemmer), new Among("ю", -1, 1, "", russianstemmer), new Among("ию", 30, 1, "", russianstemmer), new Among("ью", 30, 1, "", russianstemmer), new Among("я", -1, 1, "", russianstemmer), new Among("ия", 33, 1, "", russianstemmer), new Among("ья", 33, 1, "", russianstemmer)};
        a_6 = new Among[]{new Among("ост", -1, 1, "", russianstemmer), new Among("ость", -1, 1, "", russianstemmer)};
        a_7 = new Among[]{new Among("ейше", -1, 1, "", russianstemmer), new Among("н", -1, 2, "", russianstemmer), new Among("ейш", -1, 1, "", russianstemmer), new Among("ь", -1, 3, "", russianstemmer)};
        g_v = new char[]{'!', 'A', '\b', 232};
    }

    private void copy_from(russianStemmer russianstemmer) {
        this.I_p2 = russianstemmer.I_p2;
        this.I_pV = russianstemmer.I_pV;
        super.copy_from((SnowballProgram) russianstemmer);
    }

    private boolean r_mark_regions() {
        this.I_pV = this.limit;
        this.I_p2 = this.limit;
        int i = this.cursor;
        while (true) {
            if (!in_grouping(g_v, 1072, 1103)) {
                if (this.cursor >= this.limit) {
                    break;
                }
                this.cursor++;
            } else {
                this.I_pV = this.cursor;
                while (true) {
                    if (out_grouping(g_v, 1072, 1103)) {
                        while (true) {
                            if (in_grouping(g_v, 1072, 1103)) {
                                while (true) {
                                    if (!out_grouping(g_v, 1072, 1103)) {
                                        if (this.cursor >= this.limit) {
                                            break;
                                        }
                                        this.cursor++;
                                    } else {
                                        this.I_p2 = this.cursor;
                                        break;
                                    }
                                }
                            } else {
                                if (this.cursor >= this.limit) {
                                    break;
                                }
                                this.cursor++;
                            }
                        }
                    } else {
                        if (this.cursor >= this.limit) {
                            break;
                        }
                        this.cursor++;
                    }
                }
            }
        }
        this.cursor = i;
        return true;
    }

    private boolean r_R2() {
        return this.I_p2 <= this.cursor;
    }

    private boolean r_perfective_gerund() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_0, 9);
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (find_among_b == 0) {
            return false;
        }
        if (find_among_b == 1) {
            int i = this.limit - this.cursor;
            if (!eq_s_b(1, "а")) {
                this.cursor = this.limit - i;
                if (!eq_s_b(1, "я")) {
                    return false;
                }
            }
            slice_del();
        } else if (find_among_b == 2) {
            slice_del();
        }
        return true;
    }

    private boolean r_adjective() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_1, 26);
        boolean z = false;
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (find_among_b != 0) {
            z = true;
            if (find_among_b == 1) {
                slice_del();
            }
        }
        return z;
    }

    private boolean r_adjectival() {
        if (!r_adjective()) {
            return false;
        }
        int i = this.limit - this.cursor;
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_2, 8);
        if (find_among_b == 0) {
            this.cursor = this.limit - i;
        } else {
            this.bra = this.cursor;
            if (find_among_b == 0) {
                this.cursor = this.limit - i;
            } else if (find_among_b == 1) {
                int i2 = this.limit - this.cursor;
                if (!eq_s_b(1, "а")) {
                    this.cursor = this.limit - i2;
                    if (!eq_s_b(1, "я")) {
                        this.cursor = this.limit - i;
                    }
                }
                slice_del();
            } else if (find_among_b == 2) {
                slice_del();
            }
        }
        return true;
    }

    private boolean r_reflexive() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_3, 2);
        boolean z = false;
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (find_among_b != 0) {
            z = true;
            if (find_among_b == 1) {
                slice_del();
            }
        }
        return z;
    }

    private boolean r_verb() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_4, 46);
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (find_among_b == 0) {
            return false;
        }
        if (find_among_b == 1) {
            int i = this.limit - this.cursor;
            if (!eq_s_b(1, "а")) {
                this.cursor = this.limit - i;
                if (!eq_s_b(1, "я")) {
                    return false;
                }
            }
            slice_del();
        } else if (find_among_b == 2) {
            slice_del();
        }
        return true;
    }

    private boolean r_noun() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_5, 36);
        boolean z = false;
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (find_among_b != 0) {
            z = true;
            if (find_among_b == 1) {
                slice_del();
            }
        }
        return z;
    }

    private boolean r_derivational() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_6, 2);
        boolean z = false;
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (!r_R2()) {
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

    private boolean r_tidy_up() {
        this.ket = this.cursor;
        int find_among_b = find_among_b(a_7, 4);
        if (find_among_b == 0) {
            return false;
        }
        this.bra = this.cursor;
        if (find_among_b == 0) {
            return false;
        }
        if (find_among_b == 1) {
            slice_del();
            this.ket = this.cursor;
            if (!eq_s_b(1, "н")) {
                return false;
            }
            this.bra = this.cursor;
            if (!eq_s_b(1, "н")) {
                return false;
            }
            slice_del();
        } else if (find_among_b != 2) {
            if (find_among_b == 3) {
                slice_del();
            }
        } else {
            if (!eq_s_b(1, "н")) {
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
        int i3 = this.cursor;
        int i4 = this.I_pV;
        if (i3 < i4) {
            return false;
        }
        this.cursor = i4;
        int i5 = this.limit_backward;
        this.limit_backward = this.cursor;
        this.cursor = this.limit - i2;
        int i6 = this.limit - this.cursor;
        int i7 = this.limit - this.cursor;
        if (!r_perfective_gerund()) {
            this.cursor = this.limit - i7;
            int i8 = this.limit - this.cursor;
            if (!r_reflexive()) {
                this.cursor = this.limit - i8;
            }
            int i9 = this.limit - this.cursor;
            if (!r_adjectival()) {
                this.cursor = this.limit - i9;
                if (!r_verb()) {
                    this.cursor = this.limit - i9;
                    r_noun();
                }
            }
        }
        this.cursor = this.limit - i6;
        int i10 = this.limit - this.cursor;
        this.ket = this.cursor;
        if (!eq_s_b(1, "и")) {
            this.cursor = this.limit - i10;
        } else {
            this.bra = this.cursor;
            slice_del();
        }
        int i11 = this.limit - this.cursor;
        r_derivational();
        this.cursor = this.limit - i11;
        int i12 = this.limit - this.cursor;
        r_tidy_up();
        this.cursor = this.limit - i12;
        this.limit_backward = i5;
        this.cursor = this.limit_backward;
        return true;
    }

    public boolean equals(Object obj) {
        return obj instanceof russianStemmer;
    }

    public int hashCode() {
        return "org.tartarus.snowball.ext.russianStemmer".hashCode();
    }
}
