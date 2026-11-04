package ru.vorontsov.wiki;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class ArticleActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ScrollView scrollView = new ScrollView(this);
        final TextView textView = new TextView(this);
        int i = (int) (getResources().getDisplayMetrics().density * 14.0f);
        textView.setPadding(i, i, i, i);
        textView.setTextSize(17.0f);
        textView.setLineSpacing(0.0f, 1.2f);
        textView.setTextColor(-14671582);
        textView.setTextIsSelectable(true);
        scrollView.addView(textView);
        setContentView(scrollView);
        textView.setText("Загрузка…");
        final long longExtra = getIntent().getLongExtra("id", 0L);
        final String stringExtra = getIntent().getStringExtra("q");
        final Handler handler = new Handler(Looper.getMainLooper());
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: ru.vorontsov.wiki.ArticleActivity$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                ArticleActivity.this.lambda$onCreate$1(longExtra, stringExtra, handler, textView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(long j, String str, Handler handler, final TextView textView) {
        List<String> highlightStems;
        StringBuilder append;
        String str2;
        SearchCore searchCore = Db.get(this);
        String[] article = searchCore == null ? null : searchCore.article(j);
        if (searchCore == null) {
            highlightStems = new ArrayList<>();
        } else {
            if (str == null) {
                str = "";
            }
            highlightStems = searchCore.highlightStems(str);
        }
        StringBuilder sb = new StringBuilder("<html><head><meta name=viewport content='width=device-width,initial-scale=1'><style>body{font-family:serif;font-size:17px;line-height:1.55;margin:14px;color:#202122}h1{font-family:sans-serif;font-weight:normal;border-bottom:1px solid #a2a9b1}h3{font-family:sans-serif;margin-bottom:2px}mark{background:#fff3a0}</style></head><body>");
        if (article == null) {
            sb.append("Статья не найдена");
        } else {
            setTitleSafe(handler, article[0]);
            sb.append("<h1>").append(TextUtils.htmlEncode(article[0])).append("</h1>");
            for (String str3 : TextClean.text(article[1]).split("\n")) {
                if (str3.isEmpty()) continue;
                String mark = mark(TextUtils.htmlEncode(str3), highlightStems);
                if (str3.length() >= 90 || !str3.endsWith(".") || str3.contains(" — ") || str3.split(" ").length > 8) {
                    append = sb.append("<p>").append(mark);
                    str2 = "</p>";
                } else {
                    append = sb.append("<h3><font color='#000000'>").append((CharSequence) mark, 0, mark.length() - 1);
                    str2 = "</font></h3>";
                }
                append.append(str2);
            }
        }
        sb.append("</body></html>");
        final Spanned fromHtml = Html.fromHtml(sb.toString().replaceAll("(?s)<head>.*</head>", "").replace("<mark>", "<b><font color='#b8860b'>").replace("</mark>", "</font></b>"), 0);
        handler.post(new Runnable() { // from class: ru.vorontsov.wiki.ArticleActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                textView.setText(fromHtml);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTitleSafe$2(String str) {
        setTitle(str);
    }

    void setTitleSafe(Handler handler, final String str) {
        handler.post(new Runnable() { // from class: ru.vorontsov.wiki.ArticleActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ArticleActivity.this.lambda$setTitleSafe$2(str);
            }
        });
    }

    static String mark(String str, List<String> list) {
        StringBuilder sb = new StringBuilder();
        Matcher matcher = Pattern.compile("[0-9A-Za-zА-Яа-яЁё]+").matcher(str);
        int i = 0;
        while (matcher.find()) {
            String norm = SearchCore.norm(matcher.group());
            Iterator<String> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    String next = it.next();
                    if (next.length() >= 3 && norm.startsWith(next)) {
                        sb.append((CharSequence) str, i, matcher.start()).append("<mark>").append(matcher.group()).append("</mark>");
                        i = matcher.end();
                        break;
                    }
                }
            }
        }
        return sb.append(str.substring(i)).toString();
    }
}
