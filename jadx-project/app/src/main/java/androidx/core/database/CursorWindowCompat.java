package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public final class CursorWindowCompat {

    static class Api28Impl {
        private Api28Impl() {
        }

        static CursorWindow createCursorWindow(String name, long windowSizeBytes) {
            return new CursorWindow(name, windowSizeBytes);
        }
    }

    private CursorWindowCompat() {
    }

    public static CursorWindow create(String name, long windowSizeBytes) {
        if (Build.VERSION.SDK_INT < 28) goto L7;
        return Api28Impl.createCursorWindow(name, windowSizeBytes);
    L7:
        return new CursorWindow(name);
    }
}
