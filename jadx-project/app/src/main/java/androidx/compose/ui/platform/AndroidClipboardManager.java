package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.os.Build;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidClipboardManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/AndroidClipboardManager;", "Landroidx/compose/ui/platform/ClipboardManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "clipboardManager", "Landroid/content/ClipboardManager;", "(Landroid/content/ClipboardManager;)V", "nativeClipboard", "Landroidx/compose/ui/platform/NativeClipboard;", "getNativeClipboard", "()Landroid/content/ClipboardManager;", "getClip", "Landroidx/compose/ui/platform/ClipEntry;", "getText", "Landroidx/compose/ui/text/AnnotatedString;", "hasText", "", "setClip", "", "clipEntry", "setText", "annotatedString", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidClipboardManager implements ClipboardManager {
    public static final int $stable = 0;
    private final android.content.ClipboardManager clipboardManager;

    static {
        $stable = 8;
    }

    public AndroidClipboardManager(android.content.ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public AndroidClipboardManager(Context context) {
        Object r0 = context.getSystemService("clipboard");
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type android.content.ClipboardManager");
        this((android.content.ClipboardManager) r0);
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public void setText(AnnotatedString annotatedString) {
        this.clipboardManager.setPrimaryClip(ClipData.newPlainText("plain text", AndroidClipboardManager_androidKt.convertToCharSequence(annotatedString)));
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public AnnotatedString getText() {
        ClipData primaryClip = this.clipboardManager.getPrimaryClip();
        CharSequence r1 = null;
        if (primaryClip != null) goto L5;
        return null;
    L5:
        if (primaryClip.getItemCount() <= 0) goto L14;
        ClipData.Item r3 = primaryClip.getItemAt(0);
        if (r3 == null) goto L13;
        r1 = r3.getText();
    L13:
        return AndroidClipboardManager_androidKt.convertToAnnotatedString(r1);
    L14:
        return null;
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public boolean hasText() {
        ClipDescription r0 = this.clipboardManager.getPrimaryClipDescription();
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.hasMimeType("text/*");
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public ClipEntry getClip() {
        ClipData p0 = this.clipboardManager.getPrimaryClip();
        if (p0 != null) goto L7;
        return null;
    L7:
        return new ClipEntry(p0);
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public void setClip(ClipEntry clipEntry) {
        if (clipEntry != null) goto L7;
        int r0 = Build.VERSION.SDK_INT;
        android.content.ClipboardManager r1 = this.clipboardManager;
        if (r0 < 28) goto L6;
        Api28ClipboardManagerClipClear.clearPrimaryClip(r1);
        return;
    L6:
        r1.setPrimaryClip(ClipData.newPlainText("", ""));
        return;
    L7:
        this.clipboardManager.setPrimaryClip(clipEntry.getClipData());
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public android.content.ClipboardManager getNativeClipboard() {
        return this.clipboardManager;
    }
}
