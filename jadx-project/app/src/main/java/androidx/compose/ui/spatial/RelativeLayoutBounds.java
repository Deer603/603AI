package androidx.compose.ui.spatial;

import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: RelativeLayoutBounds.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0%R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\u00020\u00068Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\u00020\u00068Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u001e\u001a\u00020\u00068Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u0006X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010!R\u0011\u0010\"\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b#\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u0006X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", "topLeft", "", "bottomRight", "windowOffset", "Landroidx/compose/ui/unit/IntOffset;", "screenOffset", "viewToWindowMatrix", "Landroidx/compose/ui/graphics/Matrix;", "node", "Landroidx/compose/ui/node/DelegatableNode;", "(JJJJ[FLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "boundsInRoot", "Landroidx/compose/ui/unit/IntRect;", "getBoundsInRoot", "()Landroidx/compose/ui/unit/IntRect;", "boundsInScreen", "getBoundsInScreen", "boundsInWindow", "getBoundsInWindow", "height", "", "getHeight", "()I", "positionInRoot", "getPositionInRoot-nOcc-ac", "()J", "positionInScreen", "getPositionInScreen-nOcc-ac", "positionInWindow", "getPositionInWindow-nOcc-ac", "J", "[F", "width", "getWidth", "calculateOcclusions", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RelativeLayoutBounds {
    public static final int $stable = 0;
    private final long bottomRight;
    private final DelegatableNode node;
    private final long screenOffset;
    private final long topLeft;
    private final float[] viewToWindowMatrix;
    private final long windowOffset;

    static {
        $stable = 8;
    }

    public /* synthetic */ RelativeLayoutBounds(long r1, long r3, long r5, long r7, float[] r9, DelegatableNode r10, DefaultConstructorMarker r11) {
        this(r1, r3, r5, r7, r9, r10);
    }

    private RelativeLayoutBounds(long topLeft, long bottomRight, long windowOffset, long screenOffset, float[] viewToWindowMatrix, DelegatableNode node) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        this.windowOffset = windowOffset;
        this.screenOffset = screenOffset;
        this.viewToWindowMatrix = viewToWindowMatrix;
        this.node = node;
    }

    /* JADX INFO: renamed from: getPositionInRoot-nOcc-ac, reason: not valid java name */
    public final long m6211getPositionInRootnOccac() {
        return IntOffset.m7095constructorimpl(this.topLeft);
    }

    /* JADX INFO: renamed from: getPositionInWindow-nOcc-ac, reason: not valid java name */
    public final long m6213getPositionInWindownOccac() {
        int x = IntOffset.m7101getXimpl(this.screenOffset) - IntOffset.m7101getXimpl(this.windowOffset);
        int y = IntOffset.m7102getYimpl(this.screenOffset) - IntOffset.m7102getYimpl(this.windowOffset);
        long xy$iv = this.topLeft;
        int l = (int) (xy$iv >> 32);
        long xy$iv2 = this.topLeft;
        int t = (int) xy$iv2;
        int x$iv = l + x;
        int y$iv = t + y;
        return IntOffset.m7095constructorimpl((((long) x$iv) << 32) | (((long) y$iv) & 4294967295L));
    }

    /* JADX INFO: renamed from: getPositionInScreen-nOcc-ac, reason: not valid java name */
    public final long m6212getPositionInScreennOccac() {
        int x = IntOffset.m7101getXimpl(this.screenOffset);
        int y = IntOffset.m7102getYimpl(this.screenOffset);
        long xy$iv = this.topLeft;
        int l = (int) (xy$iv >> 32);
        long xy$iv2 = this.topLeft;
        int t = (int) xy$iv2;
        int x$iv = l + x;
        int y$iv = t + y;
        return IntOffset.m7095constructorimpl((((long) x$iv) << 32) | (((long) y$iv) & 4294967295L));
    }

    public final int getWidth() {
        long xy$iv = this.topLeft;
        int l = (int) (xy$iv >> 32);
        long xy$iv2 = this.bottomRight;
        int r = (int) (xy$iv2 >> 32);
        return r - l;
    }

    public final int getHeight() {
        long xy$iv = this.topLeft;
        int t = (int) xy$iv;
        long xy$iv2 = this.bottomRight;
        int b = (int) xy$iv2;
        return b - t;
    }

    public final IntRect getBoundsInRoot() {
        long xy$iv = this.topLeft;
        int l = (int) (xy$iv >> 32);
        long xy$iv2 = this.topLeft;
        int t = (int) xy$iv2;
        long xy$iv3 = this.bottomRight;
        int $i$f$unpackX = (int) (xy$iv3 >> 32);
        long xy$iv4 = this.bottomRight;
        int b = (int) xy$iv4;
        return new IntRect(l, t, $i$f$unpackX, b);
    }

    public final IntRect getBoundsInWindow() {
        long xy$iv = this.topLeft;
        int l = (int) (xy$iv >> 32);
        long xy$iv2 = this.topLeft;
        int t = (int) xy$iv2;
        long xy$iv3 = this.bottomRight;
        int $i$f$unpackX = (int) (xy$iv3 >> 32);
        long xy$iv4 = this.bottomRight;
        int b = (int) xy$iv4;
        if (this.viewToWindowMatrix != null) goto L5;
        int x = IntOffset.m7101getXimpl(this.screenOffset) - IntOffset.m7101getXimpl(this.windowOffset);
        int y = IntOffset.m7102getYimpl(this.screenOffset) - IntOffset.m7102getYimpl(this.windowOffset);
        return new IntRect(l + x, t + y, $i$f$unpackX + x, b + y);
    L5:
        return IntRectKt.roundToIntRect(Matrix.m4603mapimpl(this.viewToWindowMatrix, new Rect(l, t, $i$f$unpackX, b)));
    }

    public final IntRect getBoundsInScreen() {
        if (this.viewToWindowMatrix == null) goto L6;
        IntRect windowRect = getBoundsInWindow();
        long offset = this.windowOffset;
        return new IntRect(windowRect.getLeft() + IntOffset.m7101getXimpl(offset), windowRect.getTop() + IntOffset.m7102getYimpl(offset), windowRect.getRight() + IntOffset.m7101getXimpl(offset), windowRect.getBottom() + IntOffset.m7102getYimpl(offset));
    L6:
        long xy$iv = this.topLeft;
        int l = (int) (xy$iv >> 32);
        long xy$iv2 = this.topLeft;
        int t = (int) xy$iv2;
        long xy$iv3 = this.bottomRight;
        int $i$f$unpackX = (int) (xy$iv3 >> 32);
        long xy$iv4 = this.bottomRight;
        int b = (int) xy$iv4;
        int x = IntOffset.m7101getXimpl(this.screenOffset);
        int y = IntOffset.m7102getYimpl(this.screenOffset);
        return new IntRect(l + x, t + y, $i$f$unpackX + x, b + y);
    }

    public final List<IntRect> calculateOcclusions() {
        RectManager rectManager = DelegatableNodeKt.requireOwner(this.node).getRectManager();
        int id = DelegatableNodeKt.requireLayoutNode(this.node).getSemanticsId();
        RectList rectList = rectManager.getRects();
        int idIndex = rectList.indexOf(id);
        if (idIndex < 0) goto L5;
        List $this$calculateOcclusions_u24lambda_u241 = CollectionsKt.createListBuilder();
        int r7 = 0;
        RectList this_$iv = rectList;
        int $i$f$forEachIntersectingRectWithValueAt = 0;
        long[] items$iv = this_$iv.items;
        int size$iv = this_$iv.itemsSize;
        long destTopLeft$iv = items$iv[idIndex];
        long destBottomRight$iv = items$iv[idIndex + 1];
        int i$iv = 0;
    L7:
        rectList = rectList;
        if (i$iv >= (items$iv.length - 2)) goto L27;
        if (i$iv >= size$iv) goto L27;
        if (i$iv == idIndex) goto L11;
        int idIndex2 = idIndex;
        long topLeft$iv = items$iv[i$iv + 0];
        int r19 = r7;
        RectList this_$iv2 = this_$iv;
        long bottomRight$iv = items$iv[i$iv + 1];
        long a$iv$iv = ((destBottomRight$iv - topLeft$iv) - InlineClassHelperKt.Uint64Low32) | ((bottomRight$iv - destTopLeft$iv) - InlineClassHelperKt.Uint64Low32);
        if ((a$iv$iv & (-9223372034707292160L)) != 0) goto L15;
        boolean r23 = true;
    L16:
        if (r23 == false) goto L22;
        int $i$f$forEachIntersectingRectWithValueAt2 = $i$f$forEachIntersectingRectWithValueAt;
        long[] items$iv2 = items$iv;
        int l = (int) (topLeft$iv >> 32);
        int $i$f$unpackY = (int) topLeft$iv;
        int r = (int) (bottomRight$iv >> 32);
        int $i$f$unpackY2 = (int) bottomRight$iv;
        long meta$iv$iv = items$iv2[i$iv + 2];
        int i$iv2 = i$iv;
        int i$iv3 = (int) meta$iv$iv;
        int intersectingId = i$iv3 & RectListKt.Lower26Bits;
        if (rectManager.isTargetDrawnFirst$ui_release(id, intersectingId) == false) goto L23;
        $this$calculateOcclusions_u24lambda_u241.add(new IntRect(l, $i$f$unpackY, r, $i$f$unpackY2));
    L23:
        i$iv = i$iv2 + 3;
        idIndex = idIndex2;
        r7 = r19;
        this_$iv = this_$iv2;
        $i$f$forEachIntersectingRectWithValueAt = $i$f$forEachIntersectingRectWithValueAt2;
        items$iv = items$iv2;
        goto L7
    L22:
        i$iv2 = i$iv;
        $i$f$forEachIntersectingRectWithValueAt2 = $i$f$forEachIntersectingRectWithValueAt;
        items$iv2 = items$iv;
        goto L23
    L15:
        r23 = false;
        goto L16
    L11:
        i$iv = i$iv + 3;
    L27:
        return CollectionsKt.build($this$calculateOcclusions_u24lambda_u241);
    L5:
        return CollectionsKt.emptyList();
    }
}
