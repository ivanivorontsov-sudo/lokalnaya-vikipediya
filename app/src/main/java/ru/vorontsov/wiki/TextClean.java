package ru.vorontsov.wiki;

/** Линейная (без регулярных выражений) чистка пустых скобок после удаления шаблонов. */
public final class TextClean {
    private TextClean() {}

    static boolean isSep(char c) {
        return c == ',' || c == ';' || c == ':' || c == '–' || c == '—' || c == '-' || c == '/' || c == '|' || c == '·';
    }
    static boolean isSpace(char c) { return c == ' ' || c == '\t' || c == '\u00A0'; }

    /** Убирает «( , ; )», вложенные «((,))», и запятые у краёв скобок. Один проход стеком, O(n). */
    public static String line(String s) {
        if (s == null || s.indexOf('(') < 0 && s.indexOf('[') < 0) return s;
        StringBuilder out = new StringBuilder(s.length());
        int[] open = new int[16]; boolean[] content = new boolean[16]; int depth = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[') {
                if (depth == open.length) { open = java.util.Arrays.copyOf(open, depth * 2); content = java.util.Arrays.copyOf(content, depth * 2); }
                open[depth] = out.length(); content[depth] = false; depth++;
                out.append(c);
            } else if ((c == ')' || c == ']') && depth > 0) {
                depth--;
                int st = open[depth];
                if (!content[depth]) {
                    out.setLength(st);
                    while (out.length() > 0 && isSpace(out.charAt(out.length() - 1))) out.setLength(out.length() - 1);
                } else {
                    // хвост «, )» → «)»
                    int e = out.length();
                    while (e > st + 1 && (isSpace(out.charAt(e - 1)) || isSep(out.charAt(e - 1)))) e--;
                    out.setLength(e);
                    // голова «(, » → «(»
                    int b = st + 1, k = b;
                    while (k < out.length() && (isSpace(out.charAt(k)) || isSep(out.charAt(k)))) k++;
                    if (k > b) out.delete(b, k);
                    out.append(c);
                    if (depth > 0) content[depth - 1] = true;
                }
            } else {
                if (depth > 0 && Character.isLetterOrDigit(c)) content[depth - 1] = true;
                out.append(c);
            }
        }
        // уборка пробелов: двойные и перед знаками
        StringBuilder r = new StringBuilder(out.length());
        for (int i = 0; i < out.length(); i++) {
            char c = out.charAt(i);
            if (isSpace(c)) {
                if (r.length() == 0 || isSpace(r.charAt(r.length() - 1))) continue;
                r.append(' ');
            } else {
                if ((c == ',' || c == '.' || c == ';' || c == ':' || c == ')') && r.length() > 0 && r.charAt(r.length() - 1) == ' ') r.setLength(r.length() - 1);
                r.append(c);
            }
        }
        return r.toString().trim();
    }

    public static String text(String s) {
        if (s == null) return null;
        try {
            String[] lines = s.split("\n", -1);
            StringBuilder sb = new StringBuilder(s.length());
            for (int i = 0; i < lines.length; i++) { if (i > 0) sb.append('\n'); sb.append(line(lines[i])); }
            return sb.toString();
        } catch (Throwable t) { return s; }
    }
}
