package ru.vorontsov.wiki;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import ru.vorontsov.wiki.SearchCore;

/* loaded from: classes.dex */
public class Db {
    public static final String NAME = "ruwiki.db";
    private static SearchCore core;
    private static String path;

    public static List<File> candidates(Context context) {
        ArrayList arrayList = new ArrayList();
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            arrayList.add(new File(externalFilesDir, NAME));
        }
        arrayList.add(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), NAME));
        arrayList.add(new File(Environment.getExternalStorageDirectory(), NAME));
        return arrayList;
    }

    public static synchronized SearchCore get(Context context) {
        synchronized (Db.class) {
            SearchCore searchCore = core;
            if (searchCore != null) {
                return searchCore;
            }
            for (File file : candidates(context)) {
                if (file.canRead()) {
                    final SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, 17);
                    core = new SearchCore(new SearchCore.Sql() { // from class: ru.vorontsov.wiki.Db$$ExternalSyntheticLambda0
                        @Override // ru.vorontsov.wiki.SearchCore.Sql
                        public final List q(String str, Object[] objArr) {
                            return Db.lambda$get$0(openDatabase, str, objArr);
                        }
                    });
                    path = file.getAbsolutePath();
                    return core;
                }
            }
            return null;
        }
    }

    static /* synthetic */ List lambda$get$0(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr) {
        int length = objArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = String.valueOf(objArr[i]);
        }
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = sQLiteDatabase.rawQuery(str, strArr);
        try {
            int columnCount = rawQuery.getColumnCount();
            while (rawQuery.moveToNext()) {
                Object[] objArr2 = new Object[columnCount];
                for (int i2 = 0; i2 < columnCount; i2++) {
                    int type = rawQuery.getType(i2);
                    if (type == 0) {
                        objArr2[i2] = null;
                    } else if (type == 1) {
                        objArr2[i2] = Long.valueOf(rawQuery.getLong(i2));
                    } else if (type == 2) {
                        objArr2[i2] = Double.valueOf(rawQuery.getDouble(i2));
                    } else if (type != 4) {
                        objArr2[i2] = rawQuery.getString(i2);
                    } else {
                        objArr2[i2] = rawQuery.getBlob(i2);
                    }
                }
                arrayList.add(objArr2);
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static String path() {
        return path;
    }
}
