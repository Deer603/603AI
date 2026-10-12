package androidx.compose.foundation;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import kotlin.Metadata;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: AndroidOverscroll.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ6\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0015j\u0002`\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\f\u0010\u0019\u001a\u00020\u001a*\u00020\u001bH\u0016J \u0010\u001c\u001a\u00020\r*\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0015j\u0002`\u0016H\u0002J \u0010\u001f\u001a\u00020\r*\u00020\u001d2\u0006\u0010 \u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0015j\u0002`\u0016H\u0002J \u0010!\u001a\u00020\r*\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0015j\u0002`\u0016H\u0002J \u0010#\u001a\u00020\r*\u00020\u001d2\u0006\u0010$\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0015j\u0002`\u0016H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/foundation/GlowOverscrollNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "pointerInputNode", "Landroidx/compose/ui/node/DelegatableNode;", "overscrollEffect", "Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "edgeEffectWrapper", "Landroidx/compose/foundation/EdgeEffectWrapper;", "glowDrawPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;Landroidx/compose/foundation/EdgeEffectWrapper;Landroidx/compose/foundation/layout/PaddingValues;)V", "drawWithRotationAndOffset", "", "rotationDegrees", "", "offset", "Landroidx/compose/ui/geometry/Offset;", "edgeEffect", "Landroid/widget/EdgeEffect;", "canvas", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "drawWithRotationAndOffset-ubNVwUQ", "(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "draw", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "drawBottomGlow", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "bottom", "drawLeftGlow", "left", "drawRightGlow", "right", "drawTopGlow", "top", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class GlowOverscrollNode extends DelegatingNode implements DrawModifierNode {
    private final EdgeEffectWrapper edgeEffectWrapper;
    private final PaddingValues glowDrawPadding;
    private final AndroidEdgeEffectOverscrollEffect overscrollEffect;

    public GlowOverscrollNode(DelegatableNode pointerInputNode, AndroidEdgeEffectOverscrollEffect overscrollEffect, EdgeEffectWrapper edgeEffectWrapper, PaddingValues glowDrawPadding) {
        this.overscrollEffect = overscrollEffect;
        this.edgeEffectWrapper = edgeEffectWrapper;
        this.glowDrawPadding = glowDrawPadding;
        delegate(pointerInputNode);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope $this$draw) {
        this.overscrollEffect.m215updateSizeuvyYCjk$foundation_release($this$draw.mo4917getSizeNHjbRc());
        if (Size.m4196isEmptyimpl($this$draw.mo4917getSizeNHjbRc()) == false) goto L6;
        $this$draw.drawContent();
        return;
    L6:
        $this$draw.drawContent();
        this.overscrollEffect.getRedrawSignal$foundation_release().getValue();
        Canvas canvas = AndroidCanvas_androidKt.getNativeCanvas($this$draw.getDrawContext().getCanvas());
        boolean needsInvalidate = false;
        EdgeEffectWrapper $this$draw_u24lambda_u240 = this.edgeEffectWrapper;
        if ($this$draw_u24lambda_u240.isLeftAnimating() == false) goto L9;
        EdgeEffect leftEffect = $this$draw_u24lambda_u240.getOrCreateLeftEffect();
        needsInvalidate = drawLeftGlow($this$draw, leftEffect, canvas);
    L9:
        boolean r5 = false;
        if ($this$draw_u24lambda_u240.isTopAnimating() == false) goto L19;
        EdgeEffect topEffect = $this$draw_u24lambda_u240.getOrCreateTopEffect();
        if (drawTopGlow($this$draw, topEffect, canvas) == true) goto L16;
        if (needsInvalidate == true) goto L16;
        boolean r7 = false;
    L17:
        needsInvalidate = r7;
    L16:
        r7 = true;
    L19:
        if ($this$draw_u24lambda_u240.isRightAnimating() == false) goto L28;
        EdgeEffect rightEffect = $this$draw_u24lambda_u240.getOrCreateRightEffect();
        if (drawRightGlow($this$draw, rightEffect, canvas) == true) goto L25;
        if (needsInvalidate == true) goto L25;
        boolean r8 = false;
    L26:
        needsInvalidate = r8;
    L25:
        r8 = true;
    L28:
        if ($this$draw_u24lambda_u240.isBottomAnimating() == false) goto L34;
        EdgeEffect bottomEffect = $this$draw_u24lambda_u240.getOrCreateBottomEffect();
        if (drawBottomGlow($this$draw, bottomEffect, canvas) == true) goto L32;
        if (needsInvalidate == true) goto L32;
    L33:
        needsInvalidate = r5;
    L32:
        r5 = true;
    L34:
        if (needsInvalidate == false) goto L38;
        this.overscrollEffect.invalidateOverscroll$foundation_release();
        return;
    }

    private final boolean drawLeftGlow(DrawScope $this$drawLeftGlow, EdgeEffect left, Canvas canvas) {
        long arg0$iv = $this$drawLeftGlow.mo4917getSizeNHjbRc();
        int bits$iv$iv$iv = (int) (arg0$iv & 4294967295L);
        float x$iv = -Float.intBitsToFloat(bits$iv$iv$iv);
        float y$iv = $this$drawLeftGlow.mo376toPx0680j_4(this.glowDrawPadding.mo675calculateLeftPaddingu2uoSUM($this$drawLeftGlow.getLayoutDirection()));
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        long offset = Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
        return m289drawWithRotationAndOffsetubNVwUQ(270.0f, offset, left, canvas);
    }

    private final boolean drawTopGlow(DrawScope $this$drawTopGlow, EdgeEffect top, Canvas canvas) {
        float y$iv = $this$drawTopGlow.mo376toPx0680j_4(this.glowDrawPadding.mo677calculateTopPaddingD9Ej5fM());
        long v1$iv$iv = Float.floatToRawIntBits(0.0f);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return m289drawWithRotationAndOffsetubNVwUQ(0.0f, Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv)), top, canvas);
    }

    private final boolean drawRightGlow(DrawScope $this$drawRightGlow, EdgeEffect right, Canvas canvas) {
        long arg0$iv = $this$drawRightGlow.mo4917getSizeNHjbRc();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        int width = MathKt.roundToInt(Float.intBitsToFloat(bits$iv$iv$iv));
        float rightPadding = this.glowDrawPadding.mo676calculateRightPaddingu2uoSUM($this$drawRightGlow.getLayoutDirection());
        float y$iv = (-width) + $this$drawRightGlow.mo376toPx0680j_4(rightPadding);
        long v1$iv$iv = Float.floatToRawIntBits(0.0f);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        long offset = Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
        return m289drawWithRotationAndOffsetubNVwUQ(90.0f, offset, right, canvas);
    }

    private final boolean drawBottomGlow(DrawScope $this$drawBottomGlow, EdgeEffect bottom, Canvas canvas) {
        float bottomPadding = $this$drawBottomGlow.mo376toPx0680j_4(this.glowDrawPadding.mo674calculateBottomPaddingD9Ej5fM());
        long arg0$iv = $this$drawBottomGlow.mo4917getSizeNHjbRc();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        float x$iv = -Float.intBitsToFloat(bits$iv$iv$iv);
        long arg0$iv2 = $this$drawBottomGlow.mo4917getSizeNHjbRc();
        int bits$iv$iv$iv2 = (int) (arg0$iv2 & 4294967295L);
        float y$iv = (-Float.intBitsToFloat(bits$iv$iv$iv2)) + bottomPadding;
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        long offset = Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
        return m289drawWithRotationAndOffsetubNVwUQ(180.0f, offset, bottom, canvas);
    }

    /* JADX INFO: renamed from: drawWithRotationAndOffset-ubNVwUQ, reason: not valid java name */
    private final boolean m289drawWithRotationAndOffsetubNVwUQ(float rotationDegrees, long offset, EdgeEffect edgeEffect, Canvas canvas) {
        int restore = canvas.save();
        canvas.rotate(rotationDegrees);
        int bits$iv$iv$iv = (int) (offset >> 32);
        int bits$iv$iv$iv2 = (int) (4294967295L & offset);
        canvas.translate(Float.intBitsToFloat(bits$iv$iv$iv), Float.intBitsToFloat(bits$iv$iv$iv2));
        boolean needsInvalidate = edgeEffect.draw(canvas);
        canvas.restoreToCount(restore);
        return needsInvalidate;
    }
}
