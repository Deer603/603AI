package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes4.dex */
public final class WindowCompat {
    public static final int FEATURE_ACTION_BAR = 8;
    public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;

    static class Api16Impl {
        private Api16Impl() {
        }

        static void setDecorFitsSystemWindows(Window window, boolean decorFitsSystemWindows) {
            View decorView = window.getDecorView();
            int sysUiVis = decorView.getSystemUiVisibility();
            if (decorFitsSystemWindows == false) goto L5;
            int r3 = sysUiVis & (-1793);
        L6:
            decorView.setSystemUiVisibility(r3);
            return;
        L5:
            r3 = sysUiVis | 1792;
            goto L6
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static <T> T requireViewById(Window r1, int r2) {
            return (T) r1.requireViewById(r2);
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static void setDecorFitsSystemWindows(Window window, boolean decorFitsSystemWindows) {
            View decorView = window.getDecorView();
            int sysUiVis = decorView.getSystemUiVisibility();
            if (decorFitsSystemWindows == false) goto L5;
            int r3 = sysUiVis & (-257);
        L6:
            decorView.setSystemUiVisibility(r3);
            window.setDecorFitsSystemWindows(decorFitsSystemWindows);
            return;
        L5:
            r3 = sysUiVis | 256;
            goto L6
        }
    }

    static class Api35Impl {
        private Api35Impl() {
        }

        static void setDecorFitsSystemWindows(Window window, boolean decorFitsSystemWindows) {
            window.setDecorFitsSystemWindows(decorFitsSystemWindows);
        }
    }

    private WindowCompat() {
    }

    public static <T extends View> T requireViewById(Window r3, int r4) {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        T r0 = (T) r3.findViewById(r4);
        if (r0 == null) goto L10;
        return r0;
    L10:
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    L5:
        return (T) Api28Impl.requireViewById(r3, r4);
    }

    public static void setDecorFitsSystemWindows(Window window, boolean decorFitsSystemWindows) {
        if (Build.VERSION.SDK_INT < 35) goto L6;
        Api35Impl.setDecorFitsSystemWindows(window, decorFitsSystemWindows);
        return;
    L6:
        if (Build.VERSION.SDK_INT < 30) goto L8;
        Api30Impl.setDecorFitsSystemWindows(window, decorFitsSystemWindows);
        return;
    L8:
        Api16Impl.setDecorFitsSystemWindows(window, decorFitsSystemWindows);
    }

    public static WindowInsetsControllerCompat getInsetsController(Window window, View view) {
        return new WindowInsetsControllerCompat(window, view);
    }
}
