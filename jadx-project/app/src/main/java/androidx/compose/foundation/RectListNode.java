package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: RectListNode.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0006H\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H&J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0002J\u0016\u0010\u001b\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H&R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u000e8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/RectListNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "rect", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "(Lkotlin/jvm/functions/Function1;)V", "androidRect", "Landroid/graphics/Rect;", "getRect", "()Lkotlin/jvm/functions/Function1;", "setRect", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "calcBounds", "layoutCoordinates", "currentRects", "Landroidx/compose/runtime/collection/MutableVector;", "onDetach", "", "onGloballyPositioned", "coordinates", "replaceRect", "newRect", "updateRects", "rects", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class RectListNode extends Modifier.Node implements GlobalPositionAwareModifierNode {
    public static final int $stable = 0;
    private Rect androidRect;
    private Function1<? super LayoutCoordinates, androidx.compose.ui.geometry.Rect> rect;

    static {
        $stable = 8;
    }

    public abstract MutableVector<Rect> currentRects();

    public abstract void updateRects(MutableVector<Rect> r1);

    public Function1<LayoutCoordinates, androidx.compose.ui.geometry.Rect> getRect() {
        return this.rect;
    }

    public void setRect(Function1<? super LayoutCoordinates, androidx.compose.ui.geometry.Rect> r1) {
        this.rect = r1;
    }

    public RectListNode(Function1<? super LayoutCoordinates, androidx.compose.ui.geometry.Rect> r1) {
        this.rect = r1;
    }

    protected final View getView() {
        return DelegatableNode_androidKt.requireView(this);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        if (getRect() != null) goto L5;
        androidx.compose.ui.geometry.Rect boundsInRoot = LayoutCoordinatesKt.boundsInRoot(coordinates);
        Rect newRect = new Rect(MathKt.roundToInt(boundsInRoot.getLeft()), MathKt.roundToInt(boundsInRoot.getTop()), MathKt.roundToInt(boundsInRoot.getRight()), MathKt.roundToInt(boundsInRoot.getBottom()));
    L6:
        replaceRect(newRect);
        return;
    L5:
        Function1<LayoutCoordinates, androidx.compose.ui.geometry.Rect> r0 = getRect();
        Intrinsics.checkNotNull(r0);
        newRect = calcBounds(coordinates, r0.invoke(coordinates));
        goto L6
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        super.onDetach();
        replaceRect(null);
    }

    private final void replaceRect(Rect newRect) {
        MutableVector<Rect> r0 = currentRects();
        Rect it = this.androidRect;
        if (it == null) goto L5;
        r0.remove(it);
    L5:
        boolean r1 = false;
        if (newRect != null) goto L8;
    L10:
        if (r1 == false) goto L12;
        r0.add(newRect);
    L12:
        updateRects(r0);
        this.androidRect = newRect;
        return;
    L8:
        if (newRect.isEmpty() == true) goto L10;
        r1 = true;
        goto L10
    }

    private final Rect calcBounds(LayoutCoordinates layoutCoordinates, androidx.compose.ui.geometry.Rect rect) {
        LayoutCoordinates root = LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates);
        long topLeft = root.mo5723localPositionOfR5De75A(layoutCoordinates, rect.m4160getTopLeftF1C5BW0());
        long topRight = root.mo5723localPositionOfR5De75A(layoutCoordinates, rect.m4161getTopRightF1C5BW0());
        long bottomLeft = root.mo5723localPositionOfR5De75A(layoutCoordinates, rect.m4153getBottomLeftF1C5BW0());
        long bottomRight = root.mo5723localPositionOfR5De75A(layoutCoordinates, rect.m4154getBottomRightF1C5BW0());
        int bits$iv$iv$iv = (int) (topLeft >> 32);
        float r14 = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (topRight >> 32);
        float r0 = Float.intBitsToFloat(bits$iv$iv$iv2);
        int bits$iv$iv$iv3 = (int) (bottomLeft >> 32);
        float r1 = Float.intBitsToFloat(bits$iv$iv$iv3);
        int bits$iv$iv$iv4 = (int) (bottomRight >> 32);
        float left = ComparisonsKt.minOf(r14, new float[]{r0, r1, Float.intBitsToFloat(bits$iv$iv$iv4)});
        int bits$iv$iv$iv5 = (int) (topLeft & 4294967295L);
        int bits$iv$iv$iv6 = (int) (topRight & 4294967295L);
        int bits$iv$iv$iv7 = (int) (bottomLeft & 4294967295L);
        int bits$iv$iv$iv8 = (int) (bottomRight & 4294967295L);
        float top = ComparisonsKt.minOf(Float.intBitsToFloat(bits$iv$iv$iv5), new float[]{Float.intBitsToFloat(bits$iv$iv$iv6), Float.intBitsToFloat(bits$iv$iv$iv7), Float.intBitsToFloat(bits$iv$iv$iv8)});
        int bits$iv$iv$iv9 = (int) (topLeft >> 32);
        int bits$iv$iv$iv10 = (int) (topRight >> 32);
        int bits$iv$iv$iv11 = (int) (bottomLeft >> 32);
        int bits$iv$iv$iv12 = (int) (bottomRight >> 32);
        float right = ComparisonsKt.maxOf(Float.intBitsToFloat(bits$iv$iv$iv9), new float[]{Float.intBitsToFloat(bits$iv$iv$iv10), Float.intBitsToFloat(bits$iv$iv$iv11), Float.intBitsToFloat(bits$iv$iv$iv12)});
        int bits$iv$iv$iv13 = (int) (topLeft & 4294967295L);
        int bits$iv$iv$iv14 = (int) (topRight & 4294967295L);
        int bits$iv$iv$iv15 = (int) (bottomLeft & 4294967295L);
        int bits$iv$iv$iv16 = (int) (bottomRight & 4294967295L);
        float bottom = ComparisonsKt.maxOf(Float.intBitsToFloat(bits$iv$iv$iv13), new float[]{Float.intBitsToFloat(bits$iv$iv$iv14), Float.intBitsToFloat(bits$iv$iv$iv15), Float.intBitsToFloat(bits$iv$iv$iv16)});
        return new Rect(MathKt.roundToInt(left), MathKt.roundToInt(top), MathKt.roundToInt(right), MathKt.roundToInt(bottom));
    }
}
