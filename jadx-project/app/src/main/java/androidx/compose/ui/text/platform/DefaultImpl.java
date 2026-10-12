package androidx.compose.ui.text.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.emoji2.text.EmojiCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EmojiCompatStatus.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/platform/DefaultImpl;", "Landroidx/compose/ui/text/platform/EmojiCompatStatusDelegate;", "()V", "fontLoaded", "Landroidx/compose/runtime/State;", "", "getFontLoaded", "()Landroidx/compose/runtime/State;", "loadState", "getFontLoadState", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultImpl implements EmojiCompatStatusDelegate {
    private State<Boolean> loadState;

    public DefaultImpl() {
        if (EmojiCompat.isConfigured() == false) goto L5;
        State<Boolean> r0 = getFontLoadState();
    L6:
        this.loadState = r0;
        return;
    L5:
        r0 = null;
        goto L6
    }

    public static final /* synthetic */ void access$setLoadState$p(DefaultImpl $this, State r1) {
        $this.loadState = r1;
    }

    @Override // androidx.compose.ui.text.platform.EmojiCompatStatusDelegate
    public State<Boolean> getFontLoaded() {
        if (this.loadState == null) goto L6;
        State<Boolean> r0 = this.loadState;
        Intrinsics.checkNotNull(r0);
        return r0;
    L6:
        if (EmojiCompat.isConfigured() == false) goto L9;
        this.loadState = getFontLoadState();
        State<Boolean> r1 = this.loadState;
        Intrinsics.checkNotNull(r1);
        return r1;
    L9:
        return EmojiCompatStatus_androidKt.access$getFalsey$p();
    }

    private final State<Boolean> getFontLoadState() {
        EmojiCompat ec = EmojiCompat.get();
        if (ec.getLoadState() == 1) goto L7;
        final MutableState mutableLoaded = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        ec.registerInitCallback(new DefaultImpl$getFontLoadState$initCallback$1(mutableLoaded, this));
        return mutableLoaded;
    L7:
        return new ImmutableBool(true);
    }
}
