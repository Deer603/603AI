package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutNodeDrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"nextDrawNode", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DelegatableNode;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LayoutNodeDrawScopeKt {
    public static final /* synthetic */ Modifier.Node access$nextDrawNode(DelegatableNode $receiver) {
        return nextDrawNode($receiver);
    }

    private static final Modifier.Node nextDrawNode(DelegatableNode $this$nextDrawNode) {
        int r0 = NodeKind.m5976constructorimpl(4);
        int r1 = NodeKind.m5976constructorimpl(2);
        Modifier.Node child = $this$nextDrawNode.getNode().getChild$ui_release();
        if (child != null) goto L6;
        return null;
    L6:
        if ((child.getAggregateChildKindSet$ui_release() & r0) != 0) goto L8;
        return null;
    L8:
        Modifier.Node next = child;
    L9:
        if (next == null) goto L17;
        if ((next.getKindSet$ui_release() & r1) != 0) goto L12;
        if ((next.getKindSet$ui_release() & r0) != 0) goto L15;
        next = next.getChild$ui_release();
        goto L9
    L15:
        return next;
    L12:
        return null;
    L17:
        return null;
    }
}
