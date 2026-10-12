package androidx.compose.ui.spatial;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: ThrottledCallbacks.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aF\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"rectInfoFor", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "node", "Landroidx/compose/ui/node/DelegatableNode;", "topLeft", "", "bottomRight", "windowOffset", "Landroidx/compose/ui/unit/IntOffset;", "screenOffset", "viewToWindowMatrix", "Landroidx/compose/ui/graphics/Matrix;", "rectInfoFor-Q-MZNJw", "(Landroidx/compose/ui/node/DelegatableNode;JJJJ[F)Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ThrottledCallbacksKt {
    /* JADX INFO: renamed from: rectInfoFor-Q-MZNJw, reason: not valid java name */
    public static final RelativeLayoutBounds m6224rectInfoForQMZNJw(DelegatableNode node, long topLeft, long bottomRight, long windowOffset, long screenOffset, float[] viewToWindowMatrix) {
        NodeCoordinator coordinator = DelegatableNodeKt.m5836requireCoordinator64DMado(node, NodeKind.m5976constructorimpl(2));
        LayoutNode layoutNode = DelegatableNodeKt.requireLayoutNode(node);
        if (layoutNode.isPlaced() == true) goto L7;
        return null;
    L7:
        if (layoutNode.getOuterCoordinator$ui_release() == coordinator) goto L9;
        boolean r1 = true;
    L10:
        boolean needsTransform = r1;
        if (needsTransform == false) goto L14;
        long $this$toOffset_u2d_u2dgyyYBs$iv = IntOffset.m7095constructorimpl(topLeft);
        float x$iv$iv = IntOffset.m7101getXimpl($this$toOffset_u2d_u2dgyyYBs$iv);
        float y$iv$iv = IntOffset.m7102getYimpl($this$toOffset_u2d_u2dgyyYBs$iv);
        long v1$iv$iv$iv = Float.floatToRawIntBits(x$iv$iv);
        long v2$iv$iv$iv = Float.floatToRawIntBits(y$iv$iv);
        long topLeftOffset = Offset.m4117constructorimpl((v1$iv$iv$iv << 32) | (v2$iv$iv$iv & 4294967295L));
        long size = coordinator.getCoordinates().mo5722getSizeYbymL2g();
        long transformedPos = IntOffsetKt.m7118roundk4lQ0M(layoutNode.getOuterCoordinator$ui_release().getCoordinates().mo5723localPositionOfR5De75A(coordinator, topLeftOffset));
        int x$iv = IntOffset.m7101getXimpl(transformedPos) + ((int) (size >> 32));
        int $i$f$unpackInt2 = (int) (size & 4294967295L);
        int y$iv = IntOffset.m7102getYimpl(transformedPos) + $i$f$unpackInt2;
        return new RelativeLayoutBounds(transformedPos, IntOffset.m7095constructorimpl((((long) x$iv) << 32) | (((long) y$iv) & 4294967295L)), windowOffset, screenOffset, viewToWindowMatrix, node, null);
    L14:
        return new RelativeLayoutBounds(topLeft, bottomRight, windowOffset, screenOffset, viewToWindowMatrix, node, null);
    L9:
        r1 = false;
        goto L10
    }
}
