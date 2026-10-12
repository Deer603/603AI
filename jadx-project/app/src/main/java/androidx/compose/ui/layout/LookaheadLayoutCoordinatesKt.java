package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LookaheadLayoutCoordinates.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"rootLookaheadDelegate", "Landroidx/compose/ui/node/LookaheadDelegate;", "getRootLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)Landroidx/compose/ui/node/LookaheadDelegate;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LookaheadLayoutCoordinatesKt {
    public static final LookaheadDelegate getRootLookaheadDelegate(LookaheadDelegate $this$rootLookaheadDelegate) {
        LayoutNode root = $this$rootLookaheadDelegate.getLayoutNode();
    L3:
        LayoutNode r1 = root.getParent$ui_release();
        LayoutNode lookaheadRoot = null;
        if (r1 == null) goto L6;
        LayoutNode r2 = r1.getLookaheadRoot$ui_release();
    L7:
        if (r2 == null) goto L15;
        LayoutNode r3 = root.getParent$ui_release();
        if (r3 == null) goto L11;
        lookaheadRoot = r3.getLookaheadRoot$ui_release();
    L11:
        Intrinsics.checkNotNull(lookaheadRoot);
        if (lookaheadRoot.isVirtualLookaheadRoot$ui_release() == true) goto L13;
        LayoutNode r4 = root.getParent$ui_release();
        Intrinsics.checkNotNull(r4);
        LayoutNode r5 = r4.getLookaheadRoot$ui_release();
        Intrinsics.checkNotNull(r5);
        root = r5;
        goto L3
    L13:
        LayoutNode r6 = root.getParent$ui_release();
        Intrinsics.checkNotNull(r6);
        root = r6;
        goto L3
    L15:
        LookaheadDelegate r7 = root.getOuterCoordinator$ui_release().getLookaheadDelegate();
        Intrinsics.checkNotNull(r7);
        return r7;
    L6:
        r2 = null;
        goto L7
    }
}
