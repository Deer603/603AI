package androidx.compose.foundation.text.handwriting;

import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: compiled from: StylusHandwriting.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0000\u0010\u0002¨\u0006\u0003"}, d2 = {"isStylusHandwritingSupported", "", "()Z", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class StylusHandwriting_androidKt {
    private static final boolean isStylusHandwritingSupported = false;

    public static final boolean isStylusHandwritingSupported() {
        return isStylusHandwritingSupported;
    }

    static {
        if (Build.VERSION.SDK_INT < 34) goto L5;
        boolean r0 = true;
    L6:
        isStylusHandwritingSupported = r0;
        return;
    L5:
        r0 = false;
        goto L6
    }
}
