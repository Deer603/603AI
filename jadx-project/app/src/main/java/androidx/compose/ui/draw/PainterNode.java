package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: PainterModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B?\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u001a\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0002ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u001a\u00102\u001a\u0002032\u0006\u00104\u001a\u000203H\u0002ø\u0001\u0000¢\u0006\u0004\b5\u00101J\b\u00106\u001a\u000207H\u0016J\f\u00108\u001a\u000209*\u00020:H\u0016J\u0016\u0010;\u001a\u00020\u0007*\u00020.H\u0002ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u0016\u0010>\u001a\u00020\u0007*\u00020.H\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010=J\u001c\u0010@\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020AH\u0016J\u001c\u0010F\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010G\u001a\u00020AH\u0016J&\u0010H\u001a\u00020I*\u00020J2\u0006\u0010C\u001a\u00020K2\u0006\u00104\u001a\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ\u001c\u0010N\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020AH\u0016J\u001c\u0010O\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010G\u001a\u00020AH\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010'\"\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006P"}, d2 = {"Landroidx/compose/ui/draw/PainterNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "sizeToIntrinsics", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "setAlignment", "(Landroidx/compose/ui/Alignment;)V", "getAlpha", "()F", "setAlpha", "(F)V", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "setContentScale", "(Landroidx/compose/ui/layout/ContentScale;)V", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "setPainter", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "getSizeToIntrinsics", "setSizeToIntrinsics", "(Z)V", "useIntrinsicSize", "getUseIntrinsicSize", "calculateScaledSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "calculateScaledSize-E7KxVPU", "(J)J", "modifyConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "modifyConstraints-ZezNO4M", "toString", "", "draw", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "hasSpecifiedAndFiniteHeight", "hasSpecifiedAndFiniteHeight-uvyYCjk", "(J)Z", "hasSpecifiedAndFiniteWidth", "hasSpecifiedAndFiniteWidth-uvyYCjk", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class PainterNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {
    private Alignment alignment;
    private float alpha;
    private ColorFilter colorFilter;
    private ContentScale contentScale;
    private Painter painter;
    private boolean sizeToIntrinsics;

    public /* synthetic */ PainterNode(Painter r8, boolean r9, Alignment r10, ContentScale r11, float r12, ColorFilter r13, int r14, DefaultConstructorMarker r15) {
        if ((r14 & 4) == 0) goto L5;
        Alignment r3 = Alignment.Companion.getCenter();
    L7:
        if ((r14 & 8) == 0) goto L9;
        ContentScale r4 = ContentScale.Companion.getInside();
    L11:
        if ((r14 & 16) == 0) goto L13;
        float r5 = 1.0f;
    L15:
        if ((r14 & 32) == 0) goto L17;
        ColorFilter r6 = null;
    L18:
        this(r8, r9, r3, r4, r5, r6);
        return;
    L17:
        r6 = r13;
        goto L18
    L13:
        r5 = r12;
        goto L15
    L9:
        r4 = r11;
        goto L11
    L5:
        r3 = r10;
        goto L7
    }

    public final Painter getPainter() {
        return this.painter;
    }

    public final void setPainter(Painter r1) {
        this.painter = r1;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    public final void setSizeToIntrinsics(boolean r1) {
        this.sizeToIntrinsics = r1;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final void setAlignment(Alignment r1) {
        this.alignment = r1;
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    public final void setContentScale(ContentScale r1) {
        this.contentScale = r1;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final void setAlpha(float r1) {
        this.alpha = r1;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final void setColorFilter(ColorFilter r1) {
        this.colorFilter = r1;
    }

    public PainterNode(Painter painter, boolean sizeToIntrinsics, Alignment alignment, ContentScale contentScale, float alpha, ColorFilter colorFilter) {
        this.painter = painter;
        this.sizeToIntrinsics = sizeToIntrinsics;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = alpha;
        this.colorFilter = colorFilter;
    }

    private final boolean getUseIntrinsicSize() {
        if (this.sizeToIntrinsics == false) goto L11;
        long $this$isSpecified$iv = this.painter.mo5037getIntrinsicSizeNHjbRc();
        if ($this$isSpecified$iv == InlineClassHelperKt.UnspecifiedPackedFloats) goto L7;
        int r0 = 1;
    L8:
        if (r0 != 0) goto L10;
        return false;
    L10:
        return true;
    L7:
        r0 = 0;
        goto L8
    L11:
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo60measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, Measurable measurable, long constraints) {
        final Placeable placeable = measurable.mo5714measureBRTryo0(m3991modifyConstraintsZezNO4M(constraints));
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, placeable.getWidth(), placeable.getHeight(), null, new PainterNode$measure$1(placeable), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope $this$minIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        if (getUseIntrinsicSize() == false) goto L6;
        long constraints = m3991modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, height, 7, null));
        int layoutWidth = measurable.minIntrinsicWidth(height);
        return Math.max(Constraints.m6928getMinWidthimpl(constraints), layoutWidth);
    L6:
        return measurable.minIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        if (getUseIntrinsicSize() == false) goto L6;
        long constraints = m3991modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, height, 7, null));
        int layoutWidth = measurable.maxIntrinsicWidth(height);
        return Math.max(Constraints.m6928getMinWidthimpl(constraints), layoutWidth);
    L6:
        return measurable.maxIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope $this$minIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        if (getUseIntrinsicSize() == false) goto L6;
        long constraints = m3991modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, width, 0, 0, 13, null));
        int layoutHeight = measurable.minIntrinsicHeight(width);
        return Math.max(Constraints.m6927getMinHeightimpl(constraints), layoutHeight);
    L6:
        return measurable.minIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope $this$maxIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        if (getUseIntrinsicSize() == false) goto L6;
        long constraints = m3991modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, width, 0, 0, 13, null));
        int layoutHeight = measurable.maxIntrinsicHeight(width);
        return Math.max(Constraints.m6927getMinHeightimpl(constraints), layoutHeight);
    L6:
        return measurable.maxIntrinsicHeight(width);
    }

    /* JADX INFO: renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m3988calculateScaledSizeE7KxVPU(long dstSize) {
        if (getUseIntrinsicSize() == true) goto L6;
        return dstSize;
    L6:
        if (m3990hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.mo5037getIntrinsicSizeNHjbRc()) == true) goto L8;
        int bits$iv$iv$iv = (int) (dstSize >> 32);
        float srcWidth = Float.intBitsToFloat(bits$iv$iv$iv);
    L10:
        if (m3989hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.mo5037getIntrinsicSizeNHjbRc()) == true) goto L12;
        int bits$iv$iv$iv2 = (int) (dstSize & 4294967295L);
        float srcHeight = Float.intBitsToFloat(bits$iv$iv$iv2);
    L13:
        long v1$iv$iv = Float.floatToRawIntBits(srcWidth);
        long v2$iv$iv = Float.floatToRawIntBits(srcHeight);
        long srcSize = Size.m4185constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
        int bits$iv$iv$iv3 = (int) (dstSize >> 32);
        boolean r5 = true;
        if (Float.intBitsToFloat(bits$iv$iv$iv3) != 0.0f) goto L16;
        boolean r2 = true;
    L17:
        if (r2 == true) goto L25;
        int bits$iv$iv$iv4 = (int) (4294967295L & dstSize);
        if (Float.intBitsToFloat(bits$iv$iv$iv4) == 0.0f) goto L22;
        r5 = false;
    L22:
        if (r5 == true) goto L25;
        return ScaleFactorKt.m5818timesUQTWf7w(srcSize, this.contentScale.mo5707computeScaleFactorH7hwNQA(srcSize, dstSize));
    L25:
        return Size.Companion.m4203getZeroNHjbRc();
    L16:
        r2 = false;
        goto L17
    L12:
        long arg0$iv = this.painter.mo5037getIntrinsicSizeNHjbRc();
        int bits$iv$iv$iv5 = (int) (arg0$iv & 4294967295L);
        srcHeight = Float.intBitsToFloat(bits$iv$iv$iv5);
        goto L13
    L8:
        long arg0$iv2 = this.painter.mo5037getIntrinsicSizeNHjbRc();
        int bits$iv$iv$iv6 = (int) (arg0$iv2 >> 32);
        srcWidth = Float.intBitsToFloat(bits$iv$iv$iv6);
        goto L10
    }

    /* JADX INFO: renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m3991modifyConstraintsZezNO4M(long constraints) {
        boolean r2 = true;
        if (Constraints.m6922getHasBoundedWidthimpl(constraints) == true) goto L5;
    L7:
        boolean r1 = false;
    L8:
        boolean hasBoundedDimens = r1;
        if (Constraints.m6924getHasFixedWidthimpl(constraints) == true) goto L11;
    L13:
        r2 = false;
    L14:
        boolean hasFixedDimens = r2;
        if (getUseIntrinsicSize() == true) goto L17;
        if (hasBoundedDimens == false) goto L17;
    L20:
        return Constraints.m6916copyZbe2FdA$default(constraints, Constraints.m6926getMaxWidthimpl(constraints), 0, Constraints.m6925getMaxHeightimpl(constraints), 0, 10, null);
    L17:
        if (hasFixedDimens == true) goto L20;
        long intrinsicSize = this.painter.mo5037getIntrinsicSizeNHjbRc();
        if (m3990hasSpecifiedAndFiniteWidthuvyYCjk(intrinsicSize) == false) goto L24;
        int bits$iv$iv$iv = (int) (intrinsicSize >> 32);
        float $this$fastRoundToInt$iv = Float.intBitsToFloat(bits$iv$iv$iv);
        int $i$f$fastRoundToInt = Math.round($this$fastRoundToInt$iv);
    L25:
        int intrinsicWidth = $i$f$fastRoundToInt;
        if (m3989hasSpecifiedAndFiniteHeightuvyYCjk(intrinsicSize) == false) goto L28;
        long r16 = 4294967295L;
        int bits$iv$iv$iv2 = (int) (intrinsicSize & 4294967295L);
        float $this$fastRoundToInt$iv2 = Float.intBitsToFloat(bits$iv$iv$iv2);
        int $i$f$fastRoundToInt2 = Math.round($this$fastRoundToInt$iv2);
    L29:
        int intrinsicHeight = $i$f$fastRoundToInt2;
        int constrainedWidth = ConstraintsKt.m6943constrainWidthK40F9xA(constraints, intrinsicWidth);
        int constrainedHeight = ConstraintsKt.m6942constrainHeightK40F9xA(constraints, intrinsicHeight);
        float width$iv = constrainedWidth;
        float height$iv = constrainedHeight;
        long v1$iv$iv = Float.floatToRawIntBits(width$iv);
        long v1$iv$iv2 = Float.floatToRawIntBits(height$iv);
        long v2$iv$iv = (v1$iv$iv << 32) | (v1$iv$iv2 & r16);
        long scaledSize = m3988calculateScaledSizeE7KxVPU(Size.m4185constructorimpl(v2$iv$iv));
        int bits$iv$iv$iv3 = (int) (scaledSize >> 32);
        float $this$fastRoundToInt$iv3 = Float.intBitsToFloat(bits$iv$iv$iv3);
        int $i$f$fastRoundToInt3 = Math.round($this$fastRoundToInt$iv3);
        int minWidth = ConstraintsKt.m6943constrainWidthK40F9xA(constraints, $i$f$fastRoundToInt3);
        int bits$iv$iv$iv4 = (int) (scaledSize & r16);
        float $this$fastRoundToInt$iv4 = Float.intBitsToFloat(bits$iv$iv$iv4);
        int minHeight = ConstraintsKt.m6942constrainHeightK40F9xA(constraints, Math.round($this$fastRoundToInt$iv4));
        return Constraints.m6916copyZbe2FdA$default(constraints, minWidth, 0, minHeight, 0, 10, null);
    L28:
        r16 = 4294967295L;
        $i$f$fastRoundToInt2 = Constraints.m6927getMinHeightimpl(constraints);
        goto L29
    L24:
        $i$f$fastRoundToInt = Constraints.m6928getMinWidthimpl(constraints);
        goto L25
    L11:
        if (Constraints.m6923getHasFixedHeightimpl(constraints) == false) goto L13;
    L5:
        if (Constraints.m6921getHasBoundedHeightimpl(constraints) == false) goto L7;
        r1 = true;
        goto L8
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope $this$draw) {
        long intrinsicSize = this.painter.mo5037getIntrinsicSizeNHjbRc();
        if (m3990hasSpecifiedAndFiniteWidthuvyYCjk(intrinsicSize) == false) goto L5;
        int bits$iv$iv$iv = (int) (intrinsicSize >> 32);
        float srcWidth = Float.intBitsToFloat(bits$iv$iv$iv);
    L7:
        if (m3989hasSpecifiedAndFiniteHeightuvyYCjk(intrinsicSize) == false) goto L9;
        int bits$iv$iv$iv2 = (int) (intrinsicSize & 4294967295L);
        float srcHeight = Float.intBitsToFloat(bits$iv$iv$iv2);
    L10:
        long v1$iv$iv = Float.floatToRawIntBits(srcWidth);
        long v2$iv$iv = Float.floatToRawIntBits(srcHeight);
        long srcSize = Size.m4185constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
        long arg0$iv = $this$draw.mo4917getSizeNHjbRc();
        int bits$iv$iv$iv3 = (int) (arg0$iv >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv3) != 0.0f) goto L13;
        boolean r4 = true;
    L14:
        if (r4 == true) goto L21;
        long arg0$iv2 = $this$draw.mo4917getSizeNHjbRc();
        int bits$iv$iv$iv4 = (int) (arg0$iv2 & 4294967295L);
        if (Float.intBitsToFloat(bits$iv$iv$iv4) != 0.0f) goto L18;
        boolean r5 = true;
    L19:
        if (r5 == true) goto L21;
        long r6 = ScaleFactorKt.m5818timesUQTWf7w(srcSize, this.contentScale.mo5707computeScaleFactorH7hwNQA(srcSize, $this$draw.mo4917getSizeNHjbRc()));
    L22:
        long scaledSize = r6;
        Alignment r0 = this.alignment;
        int bits$iv$iv$iv5 = (int) (scaledSize >> 32);
        float $this$fastRoundToInt$iv = Float.intBitsToFloat(bits$iv$iv$iv5);
        int $i$f$fastRoundToInt = Math.round($this$fastRoundToInt$iv);
        int bits$iv$iv$iv6 = (int) (scaledSize & 4294967295L);
        float $this$fastRoundToInt$iv2 = Float.intBitsToFloat(bits$iv$iv$iv6);
        int $i$f$fastRoundToInt2 = Math.round($this$fastRoundToInt$iv2);
        long r24 = IntSize.m7139constructorimpl((((long) $i$f$fastRoundToInt) << 32) | (((long) $i$f$fastRoundToInt2) & 4294967295L));
        long arg0$iv3 = $this$draw.mo4917getSizeNHjbRc();
        int bits$iv$iv$iv7 = (int) (arg0$iv3 >> 32);
        float $this$fastRoundToInt$iv3 = Float.intBitsToFloat(bits$iv$iv$iv7);
        int $i$f$fastRoundToInt3 = Math.round($this$fastRoundToInt$iv3);
        long arg0$iv4 = $this$draw.mo4917getSizeNHjbRc();
        int bits$iv$iv$iv8 = (int) (arg0$iv4 & 4294967295L);
        float $this$fastRoundToInt$iv4 = Float.intBitsToFloat(bits$iv$iv$iv8);
        int height$iv = Math.round($this$fastRoundToInt$iv4);
        long alignedPosition = r0.mo3942alignKFBX0sM(r24, IntSize.m7139constructorimpl((((long) $i$f$fastRoundToInt3) << 32) | (((long) height$iv) & 4294967295L)), $this$draw.getLayoutDirection());
        float dx = IntOffset.m7101getXimpl(alignedPosition);
        float dy = IntOffset.m7102getYimpl(alignedPosition);
        ContentDrawScope $this$translate$iv = $this$draw;
        $this$translate$iv.getDrawContext().getTransform().translate(dx, dy);
        Painter $this$draw_u24lambda_u241_u24lambda_u240 = this.painter;     // Catch: Throwable -> L26
        $this$draw_u24lambda_u241_u24lambda_u240.m5043drawx_KDEd0($this$translate$iv, scaledSize, this.alpha, this.colorFilter);     // Catch: Throwable -> L26
        $this$translate$iv.getDrawContext().getTransform().translate(-dx, -dy);
        $this$draw.drawContent();
        return;
    L26:
        th = move-exception;
        $this$translate$iv.getDrawContext().getTransform().translate(-dx, -dy);
        throw th;
    L18:
        r5 = false;
    L21:
        r6 = Size.Companion.m4203getZeroNHjbRc();
        goto L22
    L13:
        r4 = false;
        goto L14
    L9:
        long arg0$iv5 = $this$draw.mo4917getSizeNHjbRc();
        int bits$iv$iv$iv9 = (int) (arg0$iv5 & 4294967295L);
        srcHeight = Float.intBitsToFloat(bits$iv$iv$iv9);
        goto L10
    L5:
        long arg0$iv6 = $this$draw.mo4917getSizeNHjbRc();
        int bits$iv$iv$iv10 = (int) (arg0$iv6 >> 32);
        srcWidth = Float.intBitsToFloat(bits$iv$iv$iv10);
        goto L7
    }

    /* JADX INFO: renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk, reason: not valid java name */
    private final boolean m3990hasSpecifiedAndFiniteWidthuvyYCjk(long $this$hasSpecifiedAndFiniteWidth_u2duvyYCjk) {
        if (Size.m4190equalsimpl0($this$hasSpecifiedAndFiniteWidth_u2duvyYCjk, Size.Companion.m4202getUnspecifiedNHjbRc()) == true) goto L11;
        int bits$iv$iv$iv = (int) ($this$hasSpecifiedAndFiniteWidth_u2duvyYCjk >> 32);
        float $this$fastIsFinite$iv = Float.intBitsToFloat(bits$iv$iv$iv);
        if ((Float.floatToRawIntBits($this$fastIsFinite$iv) & Integer.MAX_VALUE) >= 2139095040) goto L7;
        int $i$f$fastIsFinite = 1;
    L8:
        if ($i$f$fastIsFinite != 0) goto L10;
        return false;
    L10:
        return true;
    L7:
        $i$f$fastIsFinite = 0;
        goto L8
    L11:
        return false;
    }

    /* JADX INFO: renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk, reason: not valid java name */
    private final boolean m3989hasSpecifiedAndFiniteHeightuvyYCjk(long $this$hasSpecifiedAndFiniteHeight_u2duvyYCjk) {
        if (Size.m4190equalsimpl0($this$hasSpecifiedAndFiniteHeight_u2duvyYCjk, Size.Companion.m4202getUnspecifiedNHjbRc()) == true) goto L11;
        int bits$iv$iv$iv = (int) (4294967295L & $this$hasSpecifiedAndFiniteHeight_u2duvyYCjk);
        float $this$fastIsFinite$iv = Float.intBitsToFloat(bits$iv$iv$iv);
        if ((Float.floatToRawIntBits($this$fastIsFinite$iv) & Integer.MAX_VALUE) >= 2139095040) goto L7;
        int $i$f$fastIsFinite = 1;
    L8:
        if ($i$f$fastIsFinite != 0) goto L10;
        return false;
    L10:
        return true;
    L7:
        $i$f$fastIsFinite = 0;
        goto L8
    L11:
        return false;
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }
}
