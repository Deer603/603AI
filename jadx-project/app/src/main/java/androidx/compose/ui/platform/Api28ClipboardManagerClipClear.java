package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* JADX INFO: compiled from: AndroidClipboardManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/Api28ClipboardManagerClipClear;", "", "()V", "clearPrimaryClip", "", "clipboardManager", "Landroid/content/ClipboardManager;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class Api28ClipboardManagerClipClear {
    public static final Api28ClipboardManagerClipClear INSTANCE = null;

    static {
        INSTANCE = new Api28ClipboardManagerClipClear();
    }

    private Api28ClipboardManagerClipClear() {
    }

    @JvmStatic
    public static final void clearPrimaryClip(android.content.ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }
}
