package androidx.core.app;

import android.app.Dialog;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class DialogCompat {

    static class Api28Impl {
        private Api28Impl() {
        }

        static <T> T requireViewById(Dialog r1, int r2) {
            return (T) r1.requireViewById(r2);
        }
    }

    private DialogCompat() {
    }

    public static View requireViewById(Dialog dialog, int id) {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        View view = dialog.findViewById(id);
        if (view == null) goto L10;
        return view;
    L10:
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    L5:
        return (View) Api28Impl.requireViewById(dialog, id);
    }
}
