package androidx.compose.ui.platform;

import android.os.Looper;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0002¨\u0006\u0002"}, d2 = {"isMainThread", "", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidUiDispatcher_androidKt {
    public static final /* synthetic */ boolean access$isMainThread() {
        return isMainThread();
    }

    private static final boolean isMainThread() {
        if (Looper.myLooper() != Looper.getMainLooper()) goto L5;
        return true;
    L5:
        return false;
    }
}
