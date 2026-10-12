package androidx.core.database;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class DatabaseUtilsCompat {
    private DatabaseUtilsCompat() {
    }

    @Deprecated
    public static String concatenateWhere(String a, String b) {
        if (TextUtils.isEmpty(a) == false) goto L6;
        return b;
    L6:
        if (TextUtils.isEmpty(b) == false) goto L9;
        return a;
    L9:
        return "(" + a + ") AND (" + b + ")";
    }

    @Deprecated
    public static String[] appendSelectionArgs(String[] originalValues, String[] newValues) {
        if (originalValues != null) goto L4;
    L8:
        return newValues;
    L4:
        if (originalValues.length == 0) goto L8;
        String[] result = new String[originalValues.length + newValues.length];
        System.arraycopy(originalValues, 0, result, 0, originalValues.length);
        System.arraycopy(newValues, 0, result, originalValues.length, newValues.length);
        return result;
    }
}
