package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextLinkStyles;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextLinkScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0002*\u0018\b\u0000\u0010\u0003\"\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"isNullOrEmpty", "", "Landroidx/compose/ui/text/TextLinkStyles;", "LinkRange", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/LinkAnnotation;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextLinkScopeKt {
    public static final /* synthetic */ boolean access$isNullOrEmpty(TextLinkStyles $receiver) {
        return isNullOrEmpty($receiver);
    }

    private static final boolean isNullOrEmpty(TextLinkStyles $this$isNullOrEmpty) {
        if ($this$isNullOrEmpty != null) goto L4;
    L13:
        return true;
    L4:
        if ($this$isNullOrEmpty.getStyle() == null) goto L6;
    L12:
        return false;
    L6:
        if ($this$isNullOrEmpty.getFocusedStyle() != null) goto L12;
        if ($this$isNullOrEmpty.getHoveredStyle() != null) goto L12;
        if ($this$isNullOrEmpty.getPressedStyle() != null) goto L12;
        goto L12
    }
}
