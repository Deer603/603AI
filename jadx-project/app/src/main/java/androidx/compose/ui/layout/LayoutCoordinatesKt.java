package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutCoordinates.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0002\u001a\u000f\u0010\u0006\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b\u001a\u000f\u0010\n\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b\u001a\u000f\u0010\u000b\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b¨\u0006\f"}, d2 = {"boundsInParent", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "boundsInRoot", "boundsInWindow", "findRootCoordinates", "positionInParent", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "positionInRoot", "positionInWindow", "positionOnScreen", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LayoutCoordinatesKt {
    public static final long positionInRoot(LayoutCoordinates $this$positionInRoot) {
        return $this$positionInRoot.mo5725localToRootMKHz9U(Offset.Companion.m4141getZeroF1C5BW0());
    }

    public static final long positionInWindow(LayoutCoordinates $this$positionInWindow) {
        return $this$positionInWindow.mo5727localToWindowMKHz9U(Offset.Companion.m4141getZeroF1C5BW0());
    }

    public static final long positionOnScreen(LayoutCoordinates $this$positionOnScreen) {
        return $this$positionOnScreen.mo5726localToScreenMKHz9U(Offset.Companion.m4141getZeroF1C5BW0());
    }

    public static final Rect boundsInRoot(LayoutCoordinates $this$boundsInRoot) {
        return LayoutCoordinates.localBoundingBoxOf$default(findRootCoordinates($this$boundsInRoot), $this$boundsInRoot, false, 2, null);
    }

    public static final Rect boundsInWindow(LayoutCoordinates $this$boundsInWindow) {
        LayoutCoordinates root = findRootCoordinates($this$boundsInWindow);
        long arg0$iv = root.mo5722getSizeYbymL2g();
        float rootWidth = (int) (arg0$iv >> 32);
        long arg0$iv2 = root.mo5722getSizeYbymL2g();
        float rootHeight = (int) (arg0$iv2 & 4294967295L);
        boolean r5 = false;
        Rect bounds = LayoutCoordinates.localBoundingBoxOf$default(root, $this$boundsInWindow, false, 2, null);
        float $this$fastCoerceIn$iv = bounds.getLeft();
        float $this$fastCoerceAtLeast$iv$iv = $this$fastCoerceIn$iv;
        if ($this$fastCoerceAtLeast$iv$iv >= 0.0f) goto L6;
        $this$fastCoerceAtLeast$iv$iv = 0.0f;
    L6:
        if ($this$fastCoerceAtLeast$iv$iv <= rootWidth) goto L8;
        $this$fastCoerceAtLeast$iv$iv = rootWidth;
    L8:
        float $this$fastCoerceIn$iv2 = bounds.getTop();
        float $this$fastCoerceAtLeast$iv$iv2 = $this$fastCoerceIn$iv2;
        if ($this$fastCoerceAtLeast$iv$iv2 >= 0.0f) goto L12;
        $this$fastCoerceAtLeast$iv$iv2 = 0.0f;
    L12:
        if ($this$fastCoerceAtLeast$iv$iv2 <= rootHeight) goto L14;
        $this$fastCoerceAtLeast$iv$iv2 = rootHeight;
    L14:
        float $this$fastCoerceIn$iv3 = bounds.getRight();
        float $this$fastCoerceAtLeast$iv$iv3 = $this$fastCoerceIn$iv3;
        if ($this$fastCoerceAtLeast$iv$iv3 >= 0.0f) goto L18;
        $this$fastCoerceAtLeast$iv$iv3 = 0.0f;
    L18:
        if ($this$fastCoerceAtLeast$iv$iv3 <= rootWidth) goto L20;
        $this$fastCoerceAtLeast$iv$iv3 = rootWidth;
    L20:
        float $this$fastCoerceIn$iv4 = bounds.getBottom();
        float $this$fastCoerceAtLeast$iv$iv4 = $this$fastCoerceIn$iv4;
        if ($this$fastCoerceAtLeast$iv$iv4 >= 0.0f) goto L24;
        $this$fastCoerceAtLeast$iv$iv4 = 0.0f;
    L24:
        if ($this$fastCoerceAtLeast$iv$iv4 <= rootHeight) goto L27;
        $this$fastCoerceAtLeast$iv$iv4 = rootHeight;
    L27:
        if ($this$fastCoerceAtLeast$iv$iv != $this$fastCoerceAtLeast$iv$iv3) goto L29;
        boolean r4 = true;
    L30:
        if (r4 == true) goto L40;
        if ($this$fastCoerceAtLeast$iv$iv2 != $this$fastCoerceAtLeast$iv$iv4) goto L34;
        r5 = true;
    L34:
        if (r5 == true) goto L40;
        long v1$iv$iv = Float.floatToRawIntBits($this$fastCoerceAtLeast$iv$iv);
        long v2$iv$iv = Float.floatToRawIntBits($this$fastCoerceAtLeast$iv$iv2);
        long topLeft = root.mo5727localToWindowMKHz9U(Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L)));
        long v1$iv$iv2 = Float.floatToRawIntBits($this$fastCoerceAtLeast$iv$iv3);
        long v2$iv$iv2 = Float.floatToRawIntBits($this$fastCoerceAtLeast$iv$iv2);
        long topRight = root.mo5727localToWindowMKHz9U(Offset.m4117constructorimpl((v1$iv$iv2 << 32) | (v2$iv$iv2 & 4294967295L)));
        long v1$iv$iv3 = Float.floatToRawIntBits($this$fastCoerceAtLeast$iv$iv3);
        long v2$iv$iv3 = (v1$iv$iv3 << 32) | (((long) Float.floatToRawIntBits($this$fastCoerceAtLeast$iv$iv4)) & 4294967295L);
        long bottomRight = root.mo5727localToWindowMKHz9U(Offset.m4117constructorimpl(v2$iv$iv3));
        long v1$iv$iv4 = Float.floatToRawIntBits($this$fastCoerceAtLeast$iv$iv);
        long v2$iv$iv4 = (v1$iv$iv4 << 32) | (((long) Float.floatToRawIntBits($this$fastCoerceAtLeast$iv$iv4)) & 4294967295L);
        long bottomLeft = root.mo5727localToWindowMKHz9U(Offset.m4117constructorimpl(v2$iv$iv4));
        int bits$iv$iv$iv = (int) (topLeft >> 32);
        float topLeftX = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (topRight >> 32);
        float topRightX = Float.intBitsToFloat(bits$iv$iv$iv2);
        int bits$iv$iv$iv3 = (int) (bottomLeft >> 32);
        float bottomLeftX = Float.intBitsToFloat(bits$iv$iv$iv3);
        int bits$iv$iv$iv4 = (int) (bottomRight >> 32);
        float bottomRightX = Float.intBitsToFloat(bits$iv$iv$iv4);
        float left = Math.min(topLeftX, Math.min(topRightX, Math.min(bottomLeftX, bottomRightX)));
        float right = Math.max(topLeftX, Math.max(topRightX, Math.max(bottomLeftX, bottomRightX)));
        int bits$iv$iv$iv5 = (int) (topLeft & 4294967295L);
        float topLeftY = Float.intBitsToFloat(bits$iv$iv$iv5);
        int bits$iv$iv$iv6 = (int) (topRight & 4294967295L);
        float topRightY = Float.intBitsToFloat(bits$iv$iv$iv6);
        int bits$iv$iv$iv7 = (int) (bottomLeft & 4294967295L);
        float bottomLeftY = Float.intBitsToFloat(bits$iv$iv$iv7);
        int bits$iv$iv$iv8 = (int) (bottomRight & 4294967295L);
        float bottomRightY = Float.intBitsToFloat(bits$iv$iv$iv8);
        float top = Math.min(topLeftY, Math.min(topRightY, Math.min(bottomLeftY, bottomRightY)));
        float bottom = Math.max(topLeftY, Math.max(topRightY, Math.max(bottomLeftY, bottomRightY)));
        return new Rect(left, top, right, bottom);
    L40:
        return Rect.Companion.getZero();
    L29:
        r4 = false;
        goto L30
    }

    public static final long positionInParent(LayoutCoordinates $this$positionInParent) {
        LayoutCoordinates r0 = $this$positionInParent.getParentLayoutCoordinates();
        if (r0 == null) goto L6;
        return r0.mo5723localPositionOfR5De75A($this$positionInParent, Offset.Companion.m4141getZeroF1C5BW0());
    L6:
        return Offset.Companion.m4141getZeroF1C5BW0();
    }

    public static final Rect boundsInParent(LayoutCoordinates $this$boundsInParent) {
        LayoutCoordinates r0 = $this$boundsInParent.getParentLayoutCoordinates();
        if (r0 == null) goto L6;
        Rect r1 = LayoutCoordinates.localBoundingBoxOf$default(r0, $this$boundsInParent, false, 2, null);
        if (r1 == null) goto L6;
        return r1;
    L6:
        long arg0$iv = $this$boundsInParent.mo5722getSizeYbymL2g();
        long arg0$iv2 = $this$boundsInParent.mo5722getSizeYbymL2g();
        return new Rect(0.0f, 0.0f, (int) (arg0$iv >> 32), (int) (4294967295L & arg0$iv2));
    }

    public static final LayoutCoordinates findRootCoordinates(LayoutCoordinates $this$findRootCoordinates) {
        LayoutCoordinates root = $this$findRootCoordinates;
        LayoutCoordinates parent = root.getParentLayoutCoordinates();
    L3:
        if (parent == null) goto L6;
        root = parent;
        parent = root.getParentLayoutCoordinates();
        goto L3
    L6:
        if ((root instanceof NodeCoordinator) == false) goto L8;
        NodeCoordinator rootCoordinator = (NodeCoordinator) root;
    L9:
        if (rootCoordinator != null) goto L11;
        return root;
    L11:
        NodeCoordinator parentCoordinator = rootCoordinator.getWrappedBy$ui_release();
    L12:
        if (parentCoordinator == null) goto L15;
        rootCoordinator = parentCoordinator;
        parentCoordinator = parentCoordinator.getWrappedBy$ui_release();
        goto L12
    L15:
        return rootCoordinator;
    L8:
        rootCoordinator = null;
        goto L9
    }
}
