package ru.vorontsov.wiki;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.vorontsov.wiki.MainActivity;
import ru.vorontsov.wiki.SearchCore;

/* loaded from: classes.dex */
public class MainActivity extends Activity {
    ArrayAdapter<Object> ad;
    TextView info;
    ListView list;
    Button perm;
    EditText q;
    final ExecutorService ex = Executors.newSingleThreadExecutor();
    final Handler h = new Handler(Looper.getMainLooper());
    final List<Object> items = new ArrayList();
    int gen = 0;
    List<String> hl = new ArrayList();

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        int dp = dp(12);
        linearLayout.setPadding(dp, dp, dp, 0);
        EditText editText = new EditText(this);
        this.q = editText;
        editText.setHint("Поиск по Википедии…");
        this.q.setSingleLine();
        this.q.setImeOptions(3);
        this.q.setTextSize(18.0f);
        TextView textView = new TextView(this);
        this.info = textView;
        textView.setTextColor(-7829368);
        this.info.setPadding(0, dp(4), 0, dp(4));
        Button button = new Button(this);
        this.perm = button;
        button.setText("Разрешить доступ к файлам");
        this.perm.setVisibility(8);
        this.perm.setOnClickListener(new View.OnClickListener() { // from class: ru.vorontsov.wiki.MainActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.this.lambda$onCreate$0(view);
            }
        });
        this.list = new ListView(this);
        ArrayAdapter<Object> arrayAdapter = new ArrayAdapter<Object>(this, android.R.layout.simple_list_item_2, android.R.id.text1, this.items) { // from class: ru.vorontsov.wiki.MainActivity.1
            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                TextView textView2 = (TextView) view2.findViewById(android.R.id.text1);
                TextView textView3 = (TextView) view2.findViewById(android.R.id.text2);
                Object obj = MainActivity.this.items.get(i);
                if (obj instanceof SearchCore.Hit) {
                    SearchCore.Hit hit = (SearchCore.Hit) obj;
                    textView2.setText(hit.title);
                    textView2.setTextColor(Color.rgb(26, 13, 171));
                    textView2.setTypeface(null, 1);
                    textView3.setText(MainActivity.this.highlight(hit.lead));
                    textView3.setMaxLines(3);
                    textView3.setVisibility(0);
                } else {
                    textView2.setText("🔍  " + ((String[]) obj)[1]);
                    textView2.setTextColor(-12303292);
                    textView2.setTypeface(null, 0);
                    textView3.setVisibility(8);
                }
                return view2;
            }
        };
        this.ad = arrayAdapter;
        this.list.setAdapter((ListAdapter) arrayAdapter);
        this.list.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: ru.vorontsov.wiki.MainActivity$$ExternalSyntheticLambda7
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                MainActivity.this.lambda$onCreate$1(adapterView, view, i, j);
            }
        });
        linearLayout.addView(this.q);
        linearLayout.addView(this.perm);
        linearLayout.addView(this.info);
        linearLayout.addView(this.list, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        setContentView(linearLayout);
        this.q.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ru.vorontsov.wiki.MainActivity$$ExternalSyntheticLambda8
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i, KeyEvent keyEvent) {
                boolean lambda$onCreate$2;
                lambda$onCreate$2 = MainActivity.this.lambda$onCreate$2(textView2, i, keyEvent);
                return lambda$onCreate$2;
            }
        });
        this.q.addTextChangedListener(new AnonymousClass2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        try {
            startActivity(new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", Uri.parse("package:" + getPackageName())));
        } catch (Exception unused) {
            startActivity(new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(AdapterView adapterView, View view, int i, long j) {
        Object obj = this.items.get(i);
        startActivity(new Intent(this, (Class<?>) ArticleActivity.class).putExtra("id", obj instanceof SearchCore.Hit ? ((SearchCore.Hit) obj).id : Long.parseLong(((String[]) obj)[0])).putExtra("q", this.q.getText().toString()));
    }

    /* renamed from: ru.vorontsov.wiki.MainActivity$2, reason: invalid class name */
    class AnonymousClass2 implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$afterTextChanged$0(int i, String str) {
            if (i == MainActivity.this.gen) {
                MainActivity.this.doSuggest(str, i);
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MainActivity mainActivity = MainActivity.this;
            final int i = mainActivity.gen + 1;
            mainActivity.gen = i;
            final String obj = editable.toString();
            MainActivity.this.h.postDelayed(new Runnable() { // from class: ru.vorontsov.wiki.MainActivity$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.AnonymousClass2.this.lambda$afterTextChanged$0(i, obj);
                }
            }, 250L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onCreate$2(TextView textView, int i, KeyEvent keyEvent) {
        doSearch();
        return true;
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        checkDb();
    }

    int dp(int i) {
        return (int) (i * getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkDb$4() {
        String exc0 = null;
        SearchCore sc0 = null;
        try {
            sc0 = Db.get(this);
        } catch (Exception e) {
            exc0 = e.toString();
        }
        final String exc = exc0;
        final SearchCore searchCore = sc0;
        this.h.post(new Runnable() { // from class: ru.vorontsov.wiki.MainActivity$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.this.lambda$checkDb$3(searchCore, exc);
            }
        });
    }

    void checkDb() {
        this.info.setText("Открываю базу…");
        this.ex.execute(new Runnable() { // from class: ru.vorontsov.wiki.MainActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.this.lambda$checkDb$4();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkDb$3(SearchCore searchCore, String str) {
        int i = 8;
        if (searchCore != null) {
            this.perm.setVisibility(8);
            this.info.setText("База: " + Db.path());
            String stringExtra = getIntent().getStringExtra("q");
            if (stringExtra != null) {
                getIntent().removeExtra("q");
                this.q.setText(stringExtra);
                doSearch();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Файл базы ruwiki.db не найден. Скопируйте его в одну из папок:\n");
        Iterator<File> it = Db.candidates(this).iterator();
        while (it.hasNext()) {
            sb.append("• ").append(it.next().getParent()).append('\n');
        }
        if (str != null) {
            sb.append("\nОшибка: ").append(str);
        }
        this.info.setText(sb);
        Button button = this.perm;
        if (Build.VERSION.SDK_INT >= 30 && !Environment.isExternalStorageManager()) {
            i = 0;
        }
        button.setVisibility(i);
        if (Build.VERSION.SDK_INT < 30) {
            requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 1);
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        checkDb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doSuggest$6(String str, final int i) {
        SearchCore searchCore = Db.get(this);
        if (searchCore == null) {
            return;
        }
        final List<String[]> suggest = searchCore.suggest(str, 8);
        this.h.post(new Runnable() { // from class: ru.vorontsov.wiki.MainActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.this.lambda$doSuggest$5(i, suggest);
            }
        });
    }

    void doSuggest(final String str, final int i) {
        this.ex.execute(new Runnable() { // from class: ru.vorontsov.wiki.MainActivity$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.this.lambda$doSuggest$6(str, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doSuggest$5(int i, List list) {
        if (i != this.gen) {
            return;
        }
        this.items.clear();
        this.items.addAll(list);
        this.ad.notifyDataSetChanged();
        this.info.setText(list.isEmpty() ? "" : "Подсказки — нажмите «Поиск» на клавиатуре для полного поиска");
    }

    void doSearch() {
        final String obj = this.q.getText().toString();
        final int i = this.gen + 1;
        this.gen = i;
        this.info.setText("Ищу…");
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.q.getWindowToken(), 0);
        this.ex.execute(new Runnable() { // from class: ru.vorontsov.wiki.MainActivity$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.this.lambda$doSearch$8(obj, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doSearch$8(final String str, final int i) {
        SearchCore searchCore = Db.get(this);
        if (searchCore == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        final SearchCore.Result search = searchCore.search(str, 30);
        final List<String> highlightStems = searchCore.highlightStems(str);
        final long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        this.h.post(new Runnable() { // from class: ru.vorontsov.wiki.MainActivity$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.this.lambda$doSearch$7(i, highlightStems, search, str, uptimeMillis2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doSearch$7(int i, List list, SearchCore.Result result, String str, long j) {
        if (i != this.gen) {
            return;
        }
        this.hl = list;
        this.items.clear();
        this.items.addAll(result.hits);
        this.ad.notifyDataSetChanged();
        this.list.setSelection(0);
        if (getIntent().getBooleanExtra("open_first", false) && !result.hits.isEmpty()) {
            getIntent().removeExtra("open_first");
            startActivity(new Intent(this, (Class<?>) ArticleActivity.class).putExtra("id", result.hits.get(0).id).putExtra("q", str));
        }
        this.info.setText((result.corrected != null ? "Исправлено на: «" + result.corrected + "»\n" : "") + (result.hits.isEmpty() ? "Ничего не найдено" : "Результатов: " + result.total + " (" + j + " мс)"));
    }

    CharSequence highlight(String str) {
        SpannableString spannableString = new SpannableString(str);
        Matcher matcher = Pattern.compile("[0-9a-zа-яё]+").matcher(SearchCore.norm(str));
        while (matcher.find()) {
            String group = matcher.group();
            Iterator<String> it = this.hl.iterator();
            while (true) {
                if (it.hasNext()) {
                    String next = it.next();
                    if (next.length() >= 2 && group.startsWith(next)) {
                        spannableString.setSpan(new StyleSpan(1), matcher.start(), matcher.end(), 0);
                        break;
                    }
                }
            }
        }
        return spannableString;
    }
}
