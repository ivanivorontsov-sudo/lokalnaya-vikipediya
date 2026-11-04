package org.tartarus.snowball;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class SnowballProgram {
    protected int bra;
    protected StringBuffer current = new StringBuffer();
    protected int cursor;
    protected int ket;
    protected int limit;
    protected int limit_backward;

    protected SnowballProgram() {
        setCurrent("");
    }

    public void setCurrent(String str) {
        StringBuffer stringBuffer = this.current;
        stringBuffer.replace(0, stringBuffer.length(), str);
        this.cursor = 0;
        int length = this.current.length();
        this.limit = length;
        this.limit_backward = 0;
        this.bra = this.cursor;
        this.ket = length;
    }

    public String getCurrent() {
        String stringBuffer = this.current.toString();
        this.current = new StringBuffer();
        return stringBuffer;
    }

    protected void copy_from(SnowballProgram snowballProgram) {
        this.current = snowballProgram.current;
        this.cursor = snowballProgram.cursor;
        this.limit = snowballProgram.limit;
        this.limit_backward = snowballProgram.limit_backward;
        this.bra = snowballProgram.bra;
        this.ket = snowballProgram.ket;
    }

    protected boolean in_grouping(char[] cArr, int i, int i2) {
        char charAt;
        int i3 = this.cursor;
        if (i3 >= this.limit || (charAt = this.current.charAt(i3)) > i2 || charAt < i) {
            return false;
        }
        char c = (char) (charAt - i);
        if ((cArr[c >> 3] & (1 << (c & 7))) == 0) {
            return false;
        }
        this.cursor++;
        return true;
    }

    protected boolean in_grouping_b(char[] cArr, int i, int i2) {
        char charAt;
        int i3 = this.cursor;
        if (i3 <= this.limit_backward || (charAt = this.current.charAt(i3 - 1)) > i2 || charAt < i) {
            return false;
        }
        char c = (char) (charAt - i);
        if ((cArr[c >> 3] & (1 << (c & 7))) == 0) {
            return false;
        }
        this.cursor--;
        return true;
    }

    protected boolean out_grouping(char[] cArr, int i, int i2) {
        int i3 = this.cursor;
        if (i3 >= this.limit) {
            return false;
        }
        char charAt = this.current.charAt(i3);
        if (charAt > i2 || charAt < i) {
            this.cursor++;
            return true;
        }
        char c = (char) (charAt - i);
        if ((cArr[c >> 3] & (1 << (c & 7))) != 0) {
            return false;
        }
        this.cursor++;
        return true;
    }

    protected boolean out_grouping_b(char[] cArr, int i, int i2) {
        int i3 = this.cursor;
        if (i3 <= this.limit_backward) {
            return false;
        }
        char charAt = this.current.charAt(i3 - 1);
        if (charAt > i2 || charAt < i) {
            this.cursor--;
            return true;
        }
        char c = (char) (charAt - i);
        if ((cArr[c >> 3] & (1 << (c & 7))) != 0) {
            return false;
        }
        this.cursor--;
        return true;
    }

    protected boolean in_range(int i, int i2) {
        char charAt;
        int i3 = this.cursor;
        if (i3 >= this.limit || (charAt = this.current.charAt(i3)) > i2 || charAt < i) {
            return false;
        }
        this.cursor++;
        return true;
    }

    protected boolean in_range_b(int i, int i2) {
        char charAt;
        int i3 = this.cursor;
        if (i3 <= this.limit_backward || (charAt = this.current.charAt(i3 - 1)) > i2 || charAt < i) {
            return false;
        }
        this.cursor--;
        return true;
    }

    protected boolean out_range(int i, int i2) {
        int i3 = this.cursor;
        if (i3 >= this.limit) {
            return false;
        }
        char charAt = this.current.charAt(i3);
        if (charAt <= i2 && charAt >= i) {
            return false;
        }
        this.cursor++;
        return true;
    }

    protected boolean out_range_b(int i, int i2) {
        int i3 = this.cursor;
        if (i3 <= this.limit_backward) {
            return false;
        }
        char charAt = this.current.charAt(i3 - 1);
        if (charAt <= i2 && charAt >= i) {
            return false;
        }
        this.cursor--;
        return true;
    }

    protected boolean eq_s(int i, String str) {
        if (this.limit - this.cursor < i) {
            return false;
        }
        for (int i2 = 0; i2 != i; i2++) {
            if (this.current.charAt(this.cursor + i2) != str.charAt(i2)) {
                return false;
            }
        }
        this.cursor += i;
        return true;
    }

    protected boolean eq_s_b(int i, String str) {
        if (this.cursor - this.limit_backward < i) {
            return false;
        }
        for (int i2 = 0; i2 != i; i2++) {
            if (this.current.charAt((this.cursor - i) + i2) != str.charAt(i2)) {
                return false;
            }
        }
        this.cursor -= i;
        return true;
    }

    protected boolean eq_v(CharSequence charSequence) {
        return eq_s(charSequence.length(), charSequence.toString());
    }

    protected boolean eq_v_b(CharSequence charSequence) {
        return eq_s_b(charSequence.length(), charSequence.toString());
    }

    protected int find_among(Among[] amongArr, int i) {
        boolean z;
        int i2 = this.cursor;
        int i3 = this.limit;
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        boolean z2 = false;
        while (true) {
            int i8 = ((i4 - i5) >> 1) + i5;
            int i9 = i6 < i7 ? i6 : i7;
            Among among = amongArr[i8];
            int i10 = 0;
            int i11 = i9;
            while (true) {
                if (i9 >= among.s_size) {
                    break;
                }
                int i12 = i2 + i11;
                if (i12 == i3) {
                    i10 = -1;
                    break;
                }
                i10 = this.current.charAt(i12) - among.s[i9];
                if (i10 != 0) {
                    break;
                }
                i11++;
                i9++;
            }
            if (i10 < 0) {
                i4 = i8;
                i7 = i11;
            } else {
                i5 = i8;
                i6 = i11;
            }
            if (i4 - i5 <= 1) {
                if (i5 <= 0 && i4 != i5 && !z2) {
                    z2 = true;
                }
            }
        }
        do {
            Among among2 = amongArr[i5];
            if (i6 >= among2.s_size) {
                this.cursor = among2.s_size + i2;
                if (among2.method == null) {
                    return among2.result;
                }
                try {
                    z = among2.method.invoke(among2.methodobject, new Object[0]).toString().equals("true");
                } catch (IllegalAccessException | InvocationTargetException unused) {
                    z = false;
                }
                this.cursor = among2.s_size + i2;
                if (z) {
                    return among2.result;
                }
            }
            i5 = among2.substring_i;
        } while (i5 >= 0);
        return 0;
    }

    protected int find_among_b(Among[] amongArr, int i) {
        boolean z;
        int i2 = this.cursor;
        int i3 = this.limit_backward;
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        boolean z2 = false;
        while (true) {
            int i8 = ((i4 - i5) >> 1) + i5;
            int i9 = i6 < i7 ? i6 : i7;
            Among among = amongArr[i8];
            int i10 = (among.s_size - 1) - i9;
            int i11 = 0;
            while (true) {
                if (i10 < 0) {
                    break;
                }
                if (i2 - i9 == i3) {
                    i11 = -1;
                    break;
                }
                i11 = this.current.charAt((i2 - 1) - i9) - among.s[i10];
                if (i11 != 0) {
                    break;
                }
                i9++;
                i10--;
            }
            if (i11 < 0) {
                i4 = i8;
                i7 = i9;
            } else {
                i5 = i8;
                i6 = i9;
            }
            if (i4 - i5 <= 1) {
                if (i5 <= 0 && i4 != i5 && !z2) {
                    z2 = true;
                }
            }
        }
        do {
            Among among2 = amongArr[i5];
            if (i6 >= among2.s_size) {
                this.cursor = i2 - among2.s_size;
                if (among2.method == null) {
                    return among2.result;
                }
                try {
                    z = among2.method.invoke(among2.methodobject, new Object[0]).toString().equals("true");
                } catch (IllegalAccessException | InvocationTargetException unused) {
                    z = false;
                }
                this.cursor = i2 - among2.s_size;
                if (z) {
                    return among2.result;
                }
            }
            i5 = among2.substring_i;
        } while (i5 >= 0);
        return 0;
    }

    protected int replace_s(int i, int i2, String str) {
        int length = str.length() - (i2 - i);
        this.current.replace(i, i2, str);
        this.limit += length;
        int i3 = this.cursor;
        if (i3 >= i2) {
            this.cursor = i3 + length;
        } else if (i3 > i) {
            this.cursor = i;
        }
        return length;
    }

    protected void slice_check() {
        int i;
        int i2;
        int i3 = this.bra;
        if (i3 < 0 || i3 > (i = this.ket) || i > (i2 = this.limit) || i2 > this.current.length()) {
            System.err.println("faulty slice operation");
        }
    }

    protected void slice_from(String str) {
        slice_check();
        replace_s(this.bra, this.ket, str);
    }

    protected void slice_from(CharSequence charSequence) {
        slice_from(charSequence.toString());
    }

    protected void slice_del() {
        slice_from("");
    }

    protected void insert(int i, int i2, String str) {
        int replace_s = replace_s(i, i2, str);
        int i3 = this.bra;
        if (i <= i3) {
            this.bra = i3 + replace_s;
        }
        int i4 = this.ket;
        if (i <= i4) {
            this.ket = i4 + replace_s;
        }
    }

    protected void insert(int i, int i2, CharSequence charSequence) {
        insert(i, i2, charSequence.toString());
    }

    protected StringBuffer slice_to(StringBuffer stringBuffer) {
        slice_check();
        stringBuffer.replace(0, stringBuffer.length(), this.current.substring(this.bra, this.ket));
        return stringBuffer;
    }

    protected StringBuilder slice_to(StringBuilder sb) {
        slice_check();
        sb.replace(0, sb.length(), this.current.substring(this.bra, this.ket));
        return sb;
    }

    protected StringBuffer assign_to(StringBuffer stringBuffer) {
        stringBuffer.replace(0, stringBuffer.length(), this.current.substring(0, this.limit));
        return stringBuffer;
    }

    protected StringBuilder assign_to(StringBuilder sb) {
        sb.replace(0, sb.length(), this.current.substring(0, this.limit));
        return sb;
    }
}
