package org.tartarus.snowball;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class Among {
    public final Method method;
    public final SnowballProgram methodobject;
    public final int result;
    public final char[] s;
    public final int s_size;
    public final int substring_i;

    public Among(String str, int i, int i2, String str2, SnowballProgram snowballProgram) {
        this.s_size = str.length();
        this.s = str.toCharArray();
        this.substring_i = i;
        this.result = i2;
        this.methodobject = snowballProgram;
        if (str2.length() == 0) {
            this.method = null;
            return;
        }
        try {
            this.method = snowballProgram.getClass().getDeclaredMethod(str2, new Class[0]);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
