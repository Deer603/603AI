package androidx.compose.ui.focus;

import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;

/* JADX INFO: compiled from: FocusTargetNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0000\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"focusTransactionManager", "Landroidx/compose/ui/focus/FocusTransactionManager;", "Landroidx/compose/ui/focus/FocusTargetNode;", "getFocusTransactionManager", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTransactionManager;", "invalidateFocusTarget", "", "requireTransactionManager", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FocusTargetNodeKt {
    public static final FocusTransactionManager requireTransactionManager(FocusTargetNode $this$requireTransactionManager) {
        return DelegatableNodeKt.requireOwner($this$requireTransactionManager).getFocusOwner().getFocusTransactionManager();
    }

    public static final FocusTransactionManager getFocusTransactionManager(FocusTargetNode $this$focusTransactionManager) {
        NodeCoordinator r0 = $this$focusTransactionManager.getNode().getCoordinator$ui_release();
        if (r0 == null) goto L11;
        LayoutNode r1 = r0.getLayoutNode();
        if (r1 == null) goto L11;
        Owner r2 = r1.getOwner$ui_release();
        if (r2 == null) goto L11;
        FocusOwner r3 = r2.getFocusOwner();
        if (r3 == null) goto L11;
        return r3.getFocusTransactionManager();
    L11:
        return null;
    }

    public static final void invalidateFocusTarget(FocusTargetNode $this$invalidateFocusTarget) {
        DelegatableNodeKt.requireOwner($this$invalidateFocusTarget).getFocusOwner().scheduleInvalidation($this$invalidateFocusTarget);
    }
}
