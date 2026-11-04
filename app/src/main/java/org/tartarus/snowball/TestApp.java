package org.tartarus.snowball;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/* loaded from: classes.dex */
public class TestApp {
    private static void usage() {
        System.err.println("Usage: TestApp <algorithm> <input file> [-o <output file>]");
    }

    public static void main(String[] strArr) throws Throwable {
        OutputStream outputStream;
        if (strArr.length < 2) {
            usage();
            return;
        }
        SnowballStemmer snowballStemmer = (SnowballStemmer) Class.forName("org.tartarus.snowball.ext." + strArr[0] + "Stemmer").newInstance();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(strArr[1])));
        StringBuffer stringBuffer = new StringBuffer();
        if (strArr.length > 2) {
            if (strArr.length >= 4 && strArr[2].equals("-o")) {
                outputStream = new FileOutputStream(strArr[3]);
            } else {
                usage();
                return;
            }
        } else {
            outputStream = System.out;
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        int parseInt = strArr.length > 4 ? Integer.parseInt(strArr[4]) : 1;
        while (true) {
            int read = bufferedReader.read();
            if (read != -1) {
                char c = (char) read;
                if (Character.isWhitespace(c)) {
                    if (stringBuffer.length() > 0) {
                        snowballStemmer.setCurrent(stringBuffer.toString());
                        for (int i = parseInt; i != 0; i--) {
                            snowballStemmer.stem();
                        }
                        bufferedWriter.write(snowballStemmer.getCurrent());
                        bufferedWriter.write(10);
                        stringBuffer.delete(0, stringBuffer.length());
                    }
                } else {
                    stringBuffer.append(Character.toLowerCase(c));
                }
            } else {
                bufferedWriter.flush();
                return;
            }
        }
    }
}
