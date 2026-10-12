package androidx.compose.ui.text.platform;

import androidx.compose.runtime.State;
import kotlin.Metadata;

/* JADX INFO: compiled from: EmojiCompatStatus.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0002\b\fR\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/platform/EmojiCompatStatus;", "Landroidx/compose/ui/text/platform/EmojiCompatStatusDelegate;", "()V", "delegate", "fontLoaded", "Landroidx/compose/runtime/State;", "", "getFontLoaded", "()Landroidx/compose/runtime/State;", "setDelegateForTesting", "", "newDelegate", "setDelegateForTesting$ui_text_release", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EmojiCompatStatus implements EmojiCompatStatusDelegate {
    public static final int $stable = 0;
    public static final EmojiCompatStatus INSTANCE = null;
    private static EmojiCompatStatusDelegate delegate;

    private EmojiCompatStatus() {
    }

    static {
        INSTANCE = new EmojiCompatStatus();
        delegate = new DefaultImpl();
        $stable = 8;
    }

    @Override // androidx.compose.ui.text.platform.EmojiCompatStatusDelegate
    public State<Boolean> getFontLoaded() {
        return delegate.getFontLoaded();
    }

    public final void setDelegateForTesting$ui_text_release(EmojiCompatStatusDelegate newDelegate) {
        if (newDelegate != null) goto L4;
        DefaultImpl r0 = new DefaultImpl();
    L5:
        delegate = r0;
        return;
    L4:
        r0 = newDelegate;
        goto L5
    }
}
