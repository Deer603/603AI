package androidx.compose.foundation;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: AndroidOverscroll.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001c\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002J\u001c\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002J\u001c\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002J\u001c\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002J$\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002J\b\u0010 \u001a\u00020\u0010H\u0002J\b\u0010!\u001a\u00020\u0010H\u0002J\f\u0010\"\u001a\u00020#*\u00020$H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006%"}, d2 = {"Landroidx/compose/foundation/StretchOverscrollNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "pointerInputNode", "Landroidx/compose/ui/node/DelegatableNode;", "overscrollEffect", "Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "edgeEffectWrapper", "Landroidx/compose/foundation/EdgeEffectWrapper;", "(Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;Landroidx/compose/foundation/EdgeEffectWrapper;)V", "_renderNode", "Landroid/graphics/RenderNode;", "renderNode", "getRenderNode", "()Landroid/graphics/RenderNode;", "drawBottomStretch", "", "bottom", "Landroid/widget/EdgeEffect;", "canvas", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "drawLeftStretch", "left", "drawRightStretch", "right", "drawTopStretch", "top", "drawWithRotation", "rotationDegrees", "", "edgeEffect", "shouldDrawHorizontalStretch", "shouldDrawVerticalStretch", "draw", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class StretchOverscrollNode extends DelegatingNode implements DrawModifierNode {
    private RenderNode _renderNode;
    private final EdgeEffectWrapper edgeEffectWrapper;
    private final AndroidEdgeEffectOverscrollEffect overscrollEffect;

    public StretchOverscrollNode(DelegatableNode pointerInputNode, AndroidEdgeEffectOverscrollEffect overscrollEffect, EdgeEffectWrapper edgeEffectWrapper) {
        this.overscrollEffect = overscrollEffect;
        this.edgeEffectWrapper = edgeEffectWrapper;
        delegate(pointerInputNode);
    }

    private final RenderNode getRenderNode() {
        RenderNode r0 = this._renderNode;
        if (r0 != null) goto L6;
        RenderNode it = new RenderNode("AndroidEdgeEffectOverscrollEffect");
        this._renderNode = it;
        return it;
    L6:
        return r0;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope $this$draw) {
        this.overscrollEffect.m215updateSizeuvyYCjk$foundation_release($this$draw.mo4917getSizeNHjbRc());
        Canvas canvas = AndroidCanvas_androidKt.getNativeCanvas($this$draw.getDrawContext().getCanvas());
        this.overscrollEffect.getRedrawSignal$foundation_release().getValue();
        if (Size.m4196isEmptyimpl($this$draw.mo4917getSizeNHjbRc()) == false) goto L7;
        $this$draw.drawContent();
        return;
    L7:
        if (canvas.isHardwareAccelerated() == true) goto L10;
        this.edgeEffectWrapper.finishAll();
        $this$draw.drawContent();
        return;
    L10:
        float maxElevation = $this$draw.mo376toPx0680j_4(ClipScrollableContainerKt.getMaxSupportedElevation());
        boolean needsInvalidate = false;
        EdgeEffectWrapper $this$draw_u24lambda_u244 = this.edgeEffectWrapper;
        boolean shouldDrawVerticalStretch = shouldDrawVerticalStretch();
        boolean shouldDrawHorizontalStretch = shouldDrawHorizontalStretch();
        if (shouldDrawVerticalStretch == false) goto L14;
        if (shouldDrawHorizontalStretch == false) goto L14;
        getRenderNode().setPosition(0, 0, canvas.getWidth(), canvas.getHeight());
    L18:
        RecordingCanvas recordingCanvas = getRenderNode().beginRecording();
        if ($this$draw_u24lambda_u244.isLeftNegationStretched() == false) goto L22;
        EdgeEffect leftEffectNegation = $this$draw_u24lambda_u244.getOrCreateLeftEffectNegation();
        drawRightStretch(leftEffectNegation, recordingCanvas);
        leftEffectNegation.finish();
    L22:
        if ($this$draw_u24lambda_u244.isLeftAnimating() == false) goto L27;
        EdgeEffect leftEffect = $this$draw_u24lambda_u244.getOrCreateLeftEffect();
        needsInvalidate = drawLeftStretch(leftEffect, recordingCanvas);
        if ($this$draw_u24lambda_u244.isLeftStretched() == false) goto L26;
        long arg0$iv = this.overscrollEffect.m214displacementF1C5BW0$foundation_release();
        int bits$iv$iv$iv = (int) (arg0$iv & 4294967295L);
        float displacementY = Float.intBitsToFloat(bits$iv$iv$iv);
        float r16 = 1.0f;
        EdgeEffectCompat.INSTANCE.onPullDistanceCompat($this$draw_u24lambda_u244.getOrCreateLeftEffectNegation(), EdgeEffectCompat.INSTANCE.getDistanceCompat(leftEffect), 1.0f - displacementY);
    L29:
        if ($this$draw_u24lambda_u244.isTopNegationStretched() == false) goto L32;
        EdgeEffect topEffectNegation = $this$draw_u24lambda_u244.getOrCreateTopEffectNegation();
        drawBottomStretch(topEffectNegation, recordingCanvas);
        topEffectNegation.finish();
    L32:
        if ($this$draw_u24lambda_u244.isTopAnimating() == false) goto L43;
        EdgeEffect topEffect = $this$draw_u24lambda_u244.getOrCreateTopEffect();
        if (drawTopStretch(topEffect, recordingCanvas) == true) goto L38;
        if (needsInvalidate == true) goto L38;
        boolean r12 = false;
    L39:
        needsInvalidate = r12;
        if ($this$draw_u24lambda_u244.isTopStretched() == false) goto L42;
        long arg0$iv2 = this.overscrollEffect.m214displacementF1C5BW0$foundation_release();
        char r23 = ' ';
        int bits$iv$iv$iv2 = (int) (arg0$iv2 >> 32);
        float displacementX = Float.intBitsToFloat(bits$iv$iv$iv2);
        EdgeEffectCompat.INSTANCE.onPullDistanceCompat($this$draw_u24lambda_u244.getOrCreateTopEffectNegation(), EdgeEffectCompat.INSTANCE.getDistanceCompat(topEffect), displacementX);
    L45:
        if ($this$draw_u24lambda_u244.isRightNegationStretched() == false) goto L48;
        EdgeEffect rightEffectNegation = $this$draw_u24lambda_u244.getOrCreateRightEffectNegation();
        drawLeftStretch(rightEffectNegation, recordingCanvas);
        rightEffectNegation.finish();
    L48:
        if ($this$draw_u24lambda_u244.isRightAnimating() == false) goto L61;
        EdgeEffect rightEffect = $this$draw_u24lambda_u244.getOrCreateRightEffect();
        if (drawRightStretch(rightEffect, recordingCanvas) == true) goto L54;
        if (needsInvalidate == true) goto L54;
        boolean r10 = false;
    L55:
        needsInvalidate = r10;
        if ($this$draw_u24lambda_u244.isRightStretched() == false) goto L61;
        long arg0$iv3 = this.overscrollEffect.m214displacementF1C5BW0$foundation_release();
        int bits$iv$iv$iv3 = (int) (arg0$iv3 & 4294967295L);
        float displacementY2 = Float.intBitsToFloat(bits$iv$iv$iv3);
        EdgeEffectCompat.INSTANCE.onPullDistanceCompat($this$draw_u24lambda_u244.getOrCreateRightEffectNegation(), EdgeEffectCompat.INSTANCE.getDistanceCompat(rightEffect), displacementY2);
    L54:
        r10 = true;
    L61:
        if ($this$draw_u24lambda_u244.isBottomNegationStretched() == false) goto L64;
        EdgeEffect bottomEffectNegation = $this$draw_u24lambda_u244.getOrCreateBottomEffectNegation();
        drawTopStretch(bottomEffectNegation, recordingCanvas);
        bottomEffectNegation.finish();
    L64:
        if ($this$draw_u24lambda_u244.isBottomAnimating() == false) goto L75;
        EdgeEffect bottomEffect = $this$draw_u24lambda_u244.getOrCreateBottomEffect();
        if (drawBottomStretch(bottomEffect, recordingCanvas) == true) goto L70;
        if (needsInvalidate == true) goto L70;
        boolean r9 = false;
    L71:
        boolean needsInvalidate2 = r9;
        if ($this$draw_u24lambda_u244.isBottomStretched() == false) goto L74;
        long arg0$iv4 = this.overscrollEffect.m214displacementF1C5BW0$foundation_release();
        int bits$iv$iv$iv4 = (int) (arg0$iv4 >> r23);
        float displacementX2 = Float.intBitsToFloat(bits$iv$iv$iv4);
        EdgeEffectCompat.INSTANCE.onPullDistanceCompat($this$draw_u24lambda_u244.getOrCreateBottomEffectNegation(), EdgeEffectCompat.INSTANCE.getDistanceCompat(bottomEffect), r16 - displacementX2);
    L74:
        boolean needsInvalidate3 = needsInvalidate2;
    L76:
        if (needsInvalidate3 == false) goto L78;
        this.overscrollEffect.invalidateOverscroll$foundation_release();
    L78:
        float r0 = 0.0f;
        if (shouldDrawHorizontalStretch == false) goto L81;
        float left = 0.0f;
    L82:
        if (shouldDrawVerticalStretch == true) goto L85;
        r0 = maxElevation;
    L85:
        float top = r0;
        ContentDrawScope $this$draw_u2dymL40Pk_u24default$iv = $this$draw;
        LayoutDirection layoutDirection$iv = $this$draw.getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvas$iv = AndroidCanvas_androidKt.Canvas(recordingCanvas);
        long size$iv = $this$draw.mo4917getSizeNHjbRc();
        Density prevDensity$iv = $this$draw_u2dymL40Pk_u24default$iv.getDrawContext().getDensity();
        LayoutDirection prevLayoutDirection$iv = $this$draw_u2dymL40Pk_u24default$iv.getDrawContext().getLayoutDirection();
        androidx.compose.ui.graphics.Canvas prevCanvas$iv = $this$draw_u2dymL40Pk_u24default$iv.getDrawContext().getCanvas();
        long prevSize$iv = $this$draw_u2dymL40Pk_u24default$iv.getDrawContext().mo4838getSizeNHjbRc();
        GraphicsLayer prevLayer$iv = $this$draw_u2dymL40Pk_u24default$iv.getDrawContext().getGraphicsLayer();
        DrawContext $this$draw_ymL40Pk_u24lambda_u247$iv = $this$draw_u2dymL40Pk_u24default$iv.getDrawContext();
        $this$draw_ymL40Pk_u24lambda_u247$iv.setDensity($this$draw);
        $this$draw_ymL40Pk_u24lambda_u247$iv.setLayoutDirection(layoutDirection$iv);
        $this$draw_ymL40Pk_u24lambda_u247$iv.setCanvas(canvas$iv);
        $this$draw_ymL40Pk_u24lambda_u247$iv.mo4839setSizeuvyYCjk(size$iv);
        $this$draw_ymL40Pk_u24lambda_u247$iv.setGraphicsLayer(null);
        canvas$iv.save();
        $this$draw_u2dymL40Pk_u24default$iv.getDrawContext().getTransform().translate(left, top);     // Catch: Throwable -> L100
        $this$draw.drawContent();     // Catch: Throwable -> L94
        $this$draw_u2dymL40Pk_u24default$iv.getDrawContext().getTransform().translate(-left, -top);     // Catch: Throwable -> L98
        canvas$iv.restore();
        DrawContext $this$draw_ymL40Pk_u24lambda_u248$iv = $this$draw_u2dymL40Pk_u24default$iv.getDrawContext();
        $this$draw_ymL40Pk_u24lambda_u248$iv.setDensity(prevDensity$iv);
        $this$draw_ymL40Pk_u24lambda_u248$iv.setLayoutDirection(prevLayoutDirection$iv);
        $this$draw_ymL40Pk_u24lambda_u248$iv.setCanvas(prevCanvas$iv);
        $this$draw_ymL40Pk_u24lambda_u248$iv.mo4839setSizeuvyYCjk(prevSize$iv);
        $this$draw_ymL40Pk_u24lambda_u248$iv.setGraphicsLayer(prevLayer$iv);
        getRenderNode().endRecording();
        int restore = canvas.save();
        canvas.translate(-left, -top);
        canvas.drawRenderNode(getRenderNode());
        canvas.restoreToCount(restore);
        return;
    L94:
        th = move-exception;
        $this$draw_u2dymL40Pk_u24default$iv.getDrawContext().getTransform().translate(-left, -top);     // Catch: Throwable -> L98
        throw th;     // Catch: Throwable -> L98
    L98:
        th = th;
    L102:
        canvas$iv.restore();
        DrawContext $this$draw_ymL40Pk_u24lambda_u248$iv2 = $this$draw_u2dymL40Pk_u24default$iv.getDrawContext();
        $this$draw_ymL40Pk_u24lambda_u248$iv2.setDensity(prevDensity$iv);
        $this$draw_ymL40Pk_u24lambda_u248$iv2.setLayoutDirection(prevLayoutDirection$iv);
        $this$draw_ymL40Pk_u24lambda_u248$iv2.setCanvas(prevCanvas$iv);
        $this$draw_ymL40Pk_u24lambda_u248$iv2.mo4839setSizeuvyYCjk(prevSize$iv);
        $this$draw_ymL40Pk_u24lambda_u248$iv2.setGraphicsLayer(prevLayer$iv);
        throw th;
    L100:
        th = th;
        goto L102
    L81:
        left = maxElevation;
    L70:
        r9 = true;
        goto L71
    L75:
        needsInvalidate3 = needsInvalidate;
        goto L76
    L42:
        r23 = ' ';
    L38:
        r12 = true;
        goto L39
    L43:
        r23 = ' ';
        goto L45
    L26:
        r16 = 1.0f;
        goto L29
    L27:
        r16 = 1.0f;
    L14:
        if (shouldDrawVerticalStretch == false) goto L16;
        getRenderNode().setPosition(0, 0, canvas.getWidth() + (MathKt.roundToInt(maxElevation) * 2), canvas.getHeight());
        goto L18
    L16:
        if (shouldDrawHorizontalStretch == false) goto L104;
        getRenderNode().setPosition(0, 0, canvas.getWidth(), canvas.getHeight() + (MathKt.roundToInt(maxElevation) * 2));
        goto L18
    L104:
        $this$draw.drawContent();
    }

    private final boolean shouldDrawVerticalStretch() {
        EdgeEffectWrapper $this$shouldDrawVerticalStretch_u24lambda_u245 = this.edgeEffectWrapper;
        if ($this$shouldDrawVerticalStretch_u24lambda_u245.isTopAnimating() == false) goto L5;
    L12:
        return true;
    L5:
        if ($this$shouldDrawVerticalStretch_u24lambda_u245.isTopNegationStretched() == true) goto L12;
        if ($this$shouldDrawVerticalStretch_u24lambda_u245.isBottomAnimating() == true) goto L12;
        if ($this$shouldDrawVerticalStretch_u24lambda_u245.isBottomNegationStretched() == true) goto L12;
        return false;
    }

    private final boolean shouldDrawHorizontalStretch() {
        EdgeEffectWrapper $this$shouldDrawHorizontalStretch_u24lambda_u246 = this.edgeEffectWrapper;
        if ($this$shouldDrawHorizontalStretch_u24lambda_u246.isLeftAnimating() == false) goto L5;
    L12:
        return true;
    L5:
        if ($this$shouldDrawHorizontalStretch_u24lambda_u246.isLeftNegationStretched() == true) goto L12;
        if ($this$shouldDrawHorizontalStretch_u24lambda_u246.isRightAnimating() == true) goto L12;
        if ($this$shouldDrawHorizontalStretch_u24lambda_u246.isRightNegationStretched() == true) goto L12;
        return false;
    }

    private final boolean drawLeftStretch(EdgeEffect left, Canvas canvas) {
        return drawWithRotation(270.0f, left, canvas);
    }

    private final boolean drawTopStretch(EdgeEffect top, Canvas canvas) {
        return drawWithRotation(0.0f, top, canvas);
    }

    private final boolean drawRightStretch(EdgeEffect right, Canvas canvas) {
        return drawWithRotation(90.0f, right, canvas);
    }

    private final boolean drawBottomStretch(EdgeEffect bottom, Canvas canvas) {
        return drawWithRotation(180.0f, bottom, canvas);
    }

    private final boolean drawWithRotation(float rotationDegrees, EdgeEffect edgeEffect, Canvas canvas) {
        if (rotationDegrees != 0.0f) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L9;
        boolean needsInvalidate = edgeEffect.draw(canvas);
        return needsInvalidate;
    L9:
        int restore = canvas.save();
        canvas.rotate(rotationDegrees);
        boolean needsInvalidate2 = edgeEffect.draw(canvas);
        canvas.restoreToCount(restore);
        return needsInvalidate2;
    L5:
        r0 = false;
        goto L6
    }
}
