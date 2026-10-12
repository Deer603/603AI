package androidx.compose.ui.input.key;

import kotlin.Metadata;

/* JADX INFO: compiled from: Key.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\u0010\u0006\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"nativeKeyCode", "", "Landroidx/compose/ui/input/key/Key;", "getNativeKeyCode-YVgTNJs", "(J)I", "Key", "(I)J", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Key_androidKt {
    /* JADX INFO: renamed from: getNativeKeyCode-YVgTNJs, reason: not valid java name */
    public static final int m5452getNativeKeyCodeYVgTNJs(long $this$nativeKeyCode) {
        return (int) ($this$nativeKeyCode >> 32);
    }

    public static final long Key(int nativeKeyCode) {
        return Key.m5135constructorimpl((((long) nativeKeyCode) << 32) | (((long) 0) & 4294967295L));
    }
}
