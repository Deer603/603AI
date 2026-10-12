package androidx.compose.ui;

import kotlin.Metadata;

/* JADX INFO: compiled from: SensitiveContent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"sensitiveContent", "Landroidx/compose/ui/Modifier;", "isContentSensitive", "", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SensitiveContentKt {
    public static /* synthetic */ Modifier sensitiveContent$default(Modifier r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = true;
    L6:
        return sensitiveContent(r0, r1);
    }

    public static final Modifier sensitiveContent(Modifier $this$sensitiveContent, boolean isContentSensitive) {
        return $this$sensitiveContent.then(new SensitiveNodeElement(isContentSensitive));
    }
}
