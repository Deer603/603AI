package androidx.core.provider;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
class CalleeHandler {
    private CalleeHandler() {
    }

    static Handler create() {
        if (Looper.myLooper() != null) goto L5;
        Handler handler = new Handler(Looper.getMainLooper());
        return handler;
    L5:
        Handler handler2 = new Handler();
        return handler2;
    }
}
