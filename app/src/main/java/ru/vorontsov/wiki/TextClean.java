package ru.vorontsov.wiki;

import java.util.regex.Pattern;

/** Чистка текста статьи после удаления шаблонов (транскрипции, этимология, языки). */
public final class TextClean {
    private TextClean() {}

    // Скобки, внутри которых только пробелы/знаки препинания/разделители (без букв и цифр).
    private static final Pattern EMPTY_PARENS =
            Pattern.compile("[ \\t\\u00A0]*[(\\[]\\s*[\\s,.;:\\-–—/|·•'\"«»„“”!?…]*\\s*[)\\]]");
    // Скобки только с языковыми пометками вида «(англ. ; лат. ,)» без самого слова.
    private static final Pattern LANG_ONLY = Pattern.compile(
            "[ \\t\\u00A0]*\\((?:\\s*(?:от\\s+)?(?:англ|лат|греч|др\\.-греч|нем|франц|фр|итал|исп|укр|белор|ст\\.-слав|церк\\.-слав|араб|ивр|кит|яп|тур|пол|чеш|санскр|ед\\.\\s*ч|мн\\.\\s*ч)\\.?\\s*[,;:–—]?)+\\s*\\)");
    private static final Pattern LEAD_PUNCT_IN = Pattern.compile("\\(\\s*[,;:–—]+\\s*");
    private static final Pattern TRAIL_PUNCT_IN = Pattern.compile("\\s*[,;:–—]+\\s*\\)");
    private static final Pattern MULTI_SEP = Pattern.compile("\\s*([,;])(?:\\s*[,;])+");
    private static final Pattern SPACE_BEFORE = Pattern.compile("[ \\t\\u00A0]+([,.;:!?…)\\]])");
    private static final Pattern SPACE_AFTER_OPEN = Pattern.compile("([(\\[])[ \\t\\u00A0]+");
    private static final Pattern MULTI_SPACE = Pattern.compile("[ \\t\\u00A0]{2,}");

    public static String line(String s) {
        if (s == null || s.isEmpty()) return s;
        String prev;
        int guard = 0;
        do { // повторяем — для вложенных скобок «((,))»
            prev = s;
            s = LEAD_PUNCT_IN.matcher(s).replaceAll("(");
            s = TRAIL_PUNCT_IN.matcher(s).replaceAll(")");
            s = MULTI_SEP.matcher(s).replaceAll("$1");
            s = EMPTY_PARENS.matcher(s).replaceAll("");
            s = LANG_ONLY.matcher(s).replaceAll("");
        } while (!s.equals(prev) && ++guard < 10);
        s = SPACE_AFTER_OPEN.matcher(s).replaceAll("$1");
        s = SPACE_BEFORE.matcher(s).replaceAll("$1");
        s = MULTI_SPACE.matcher(s).replaceAll(" ");
        return s.trim();
    }

    public static String text(String s) {
        if (s == null) return null;
        String[] lines = s.split("\n", -1);
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < lines.length; i++) {
            if (i > 0) sb.append('\n');
            sb.append(line(lines[i]));
        }
        return sb.toString();
    }
}
