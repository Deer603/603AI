package androidx.compose.foundation.text.input.internal;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: compiled from: InputMethodManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text/input/internal/Api34StartStylusHandwriting;", "", "()V", "startStylusHandwriting", "", "imm", "Landroid/view/inputmethod/InputMethodManager;", "view", "Landroid/view/View;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Api34StartStylusHandwriting {
    public static final int $stable = 0;
    public static final Api34StartStylusHandwriting INSTANCE = null;

    static {
        INSTANCE = new Api34StartStylusHandwriting();
    }

    private Api34StartStylusHandwriting() {
    }

    public final void startStylusHandwriting(android.view.inputmethod.InputMethodManager imm, View view) {
        imm.startStylusHandwriting(view);
    }
}
