package androidx.compose.ui.graphics;

import androidx.autofill.HintConstants;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Outline.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001a\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b\u001aN\u0010\u0005\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aN\u0010\u0005\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0003\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u009f\u0001\u0010\u001a\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042,\u0010\u001b\u001a(\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b!2,\u0010\"\u001a(\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110#¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b!2,\u0010%\u001a(\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b!H\u0082\b\u001a\f\u0010'\u001a\u00020(*\u00020#H\u0002\u001a\u0011\u0010)\u001a\u00020**\u00020\u001dH\u0002¢\u0006\u0002\u0010+\u001a\u0011\u0010)\u001a\u00020**\u00020#H\u0002¢\u0006\u0002\u0010,\u001a\u0011\u0010-\u001a\u00020.*\u00020\u001dH\u0002¢\u0006\u0002\u0010+\u001a\u0011\u0010-\u001a\u00020.*\u00020#H\u0002¢\u0006\u0002\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"addOutline", "", "Landroidx/compose/ui/graphics/Path;", "outline", "Landroidx/compose/ui/graphics/Outline;", "drawOutline", "Landroidx/compose/ui/graphics/Canvas;", "paint", "Landroidx/compose/ui/graphics/Paint;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "", "style", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawOutline-hn5TExg", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "drawOutline-wDX37Ww", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOutlineHelper", "drawRectBlock", "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Rect;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "rect", "Lkotlin/ExtensionFunctionType;", "drawRoundedRectBlock", "Landroidx/compose/ui/geometry/RoundRect;", "rrect", "drawPathBlock", "path", "hasSameCornerRadius", "", "size", "Landroidx/compose/ui/geometry/Size;", "(Landroidx/compose/ui/geometry/Rect;)J", "(Landroidx/compose/ui/geometry/RoundRect;)J", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class OutlineKt {
    public static final void addOutline(Path $this$addOutline, Outline outline) {
        if ((outline instanceof Outline.Rectangle) == false) goto L6;
        Path.addRect$default($this$addOutline, ((Outline.Rectangle) outline).getRect(), null, 2, null);
        return;
    L6:
        if ((outline instanceof Outline.Rounded) == false) goto L9;
        Path.addRoundRect$default($this$addOutline, ((Outline.Rounded) outline).getRoundRect(), null, 2, null);
        return;
    L9:
        if ((outline instanceof Outline.Generic) == false) goto L13;
        Path.m4636addPathUv8p0NA$default($this$addOutline, ((Outline.Generic) outline).getPath(), 0, 2, null);
        return;
    L13:
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: drawOutline-wDX37Ww$default, reason: not valid java name */
    public static /* synthetic */ void m4625drawOutlinewDX37Ww$default(DrawScope r8, Outline r9, long r10, float r12, DrawStyle r13, ColorFilter r14, int r15, int r16, Object r17) {
        if ((r16 & 4) == 0) goto L5;
        float r4 = 1.0f;
    L7:
        if ((r16 & 8) == 0) goto L9;
        DrawStyle r5 = Fill.INSTANCE;
    L11:
        if ((r16 & 16) == 0) goto L13;
        ColorFilter r6 = null;
    L15:
        if ((r16 & 32) == 0) goto L17;
        int r7 = DrawScope.Companion.m4919getDefaultBlendMode0nO6VwU();
    L18:
        m4624drawOutlinewDX37Ww(r8, r9, r10, r4, r5, r6, r7);
        return;
    L17:
        r7 = r15;
        goto L18
    L13:
        r6 = r14;
        goto L15
    L9:
        r5 = r13;
        goto L11
    L5:
        r4 = r12;
        goto L7
    }

    /* JADX INFO: renamed from: drawOutline-wDX37Ww, reason: not valid java name */
    public static final void m4624drawOutlinewDX37Ww(DrawScope $this$drawOutline_u2dwDX37Ww, Outline outline, long color, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        if ((outline instanceof Outline.Rectangle) == false) goto L6;
        Rect rect = ((Outline.Rectangle) outline).getRect();
        $this$drawOutline_u2dwDX37Ww.mo4830drawRectnJ9OG0(color, topLeft(rect), size(rect), alpha, style, colorFilter, blendMode);
        return;
    L6:
        if ((outline instanceof Outline.Rounded) == false) goto L12;
        Path path$iv = ((Outline.Rounded) outline).getRoundRectPath$ui_graphics_release();
        if (path$iv == null) goto L10;
        $this$drawOutline_u2dwDX37Ww.mo4826drawPathLG529CI(path$iv, color, alpha, style, colorFilter, blendMode);
        return;
    L10:
        RoundRect rrect = ((Outline.Rounded) outline).getRoundRect();
        long arg0$iv = rrect.m4173getBottomLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        float radius = Float.intBitsToFloat(bits$iv$iv$iv);
        long r19 = topLeft(rrect);
        long r21 = size(rrect);
        long v1$iv$iv = Float.floatToRawIntBits(radius);
        long v2$iv$iv = Float.floatToRawIntBits(radius);
        $this$drawOutline_u2dwDX37Ww.mo4832drawRoundRectuAw5IA(color, r19, r21, CornerRadius.m4079constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L)), style, alpha, colorFilter, blendMode);
        return;
    L12:
        if ((outline instanceof Outline.Generic) == false) goto L17;
        Path path = ((Outline.Generic) outline).getPath();
        $this$drawOutline_u2dwDX37Ww.mo4826drawPathLG529CI(path, color, alpha, style, colorFilter, blendMode);
        return;
    L17:
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: drawOutline-hn5TExg$default, reason: not valid java name */
    public static /* synthetic */ void m4623drawOutlinehn5TExg$default(DrawScope r7, Outline r8, Brush r9, float r10, DrawStyle r11, ColorFilter r12, int r13, int r14, Object r15) {
        if ((r14 & 4) == 0) goto L5;
        float r3 = 1.0f;
    L7:
        if ((r14 & 8) == 0) goto L9;
        DrawStyle r4 = Fill.INSTANCE;
    L11:
        if ((r14 & 16) == 0) goto L13;
        ColorFilter r5 = null;
    L15:
        if ((r14 & 32) == 0) goto L17;
        int r6 = DrawScope.Companion.m4919getDefaultBlendMode0nO6VwU();
    L18:
        m4622drawOutlinehn5TExg(r7, r8, r9, r3, r4, r5, r6);
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

    /* JADX INFO: renamed from: drawOutline-hn5TExg, reason: not valid java name */
    public static final void m4622drawOutlinehn5TExg(DrawScope $this$drawOutline_u2dhn5TExg, Outline outline, Brush brush, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        if ((outline instanceof Outline.Rectangle) == false) goto L6;
        Rect rect = ((Outline.Rectangle) outline).getRect();
        $this$drawOutline_u2dhn5TExg.mo4829drawRectAsUm42w(brush, topLeft(rect), size(rect), alpha, style, colorFilter, blendMode);
        return;
    L6:
        if ((outline instanceof Outline.Rounded) == false) goto L12;
        Path path$iv = ((Outline.Rounded) outline).getRoundRectPath$ui_graphics_release();
        if (path$iv == null) goto L10;
        $this$drawOutline_u2dhn5TExg.mo4825drawPathGBMwjPU(path$iv, brush, alpha, style, colorFilter, blendMode);
        return;
    L10:
        RoundRect rrect = ((Outline.Rounded) outline).getRoundRect();
        long arg0$iv = rrect.m4173getBottomLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        float radius = Float.intBitsToFloat(bits$iv$iv$iv);
        long r17 = topLeft(rrect);
        long r19 = size(rrect);
        long v1$iv$iv = Float.floatToRawIntBits(radius);
        long v2$iv$iv = Float.floatToRawIntBits(radius);
        $this$drawOutline_u2dhn5TExg.mo4831drawRoundRectZuiqVtQ(brush, r17, r19, CornerRadius.m4079constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L)), alpha, style, colorFilter, blendMode);
        return;
    L12:
        if ((outline instanceof Outline.Generic) == false) goto L17;
        Path path = ((Outline.Generic) outline).getPath();
        $this$drawOutline_u2dhn5TExg.mo4825drawPathGBMwjPU(path, brush, alpha, style, colorFilter, blendMode);
        return;
    L17:
        throw new NoWhenBranchMatchedException();
    }

    private static final long topLeft(Rect $this$topLeft) {
        float x$iv = $this$topLeft.getLeft();
        float y$iv = $this$topLeft.getTop();
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    private static final long size(Rect $this$size) {
        float width$iv = $this$size.getRight() - $this$size.getLeft();
        float height$iv = $this$size.getBottom() - $this$size.getTop();
        long v1$iv$iv = Float.floatToRawIntBits(width$iv);
        long v2$iv$iv = Float.floatToRawIntBits(height$iv);
        return Size.m4185constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    private static final long topLeft(RoundRect $this$topLeft) {
        float x$iv = $this$topLeft.getLeft();
        float y$iv = $this$topLeft.getTop();
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    private static final long size(RoundRect $this$size) {
        float width$iv = $this$size.getWidth();
        float height$iv = $this$size.getHeight();
        long v1$iv$iv = Float.floatToRawIntBits(width$iv);
        long v2$iv$iv = Float.floatToRawIntBits(height$iv);
        return Size.m4185constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    private static final void drawOutlineHelper(DrawScope $this$drawOutlineHelper, Outline outline, Function2<? super DrawScope, ? super Rect, Unit> r5, Function2<? super DrawScope, ? super RoundRect, Unit> r6, Function2<? super DrawScope, ? super Path, Unit> r7) {
        if ((outline instanceof Outline.Rectangle) == false) goto L6;
        r5.invoke($this$drawOutlineHelper, ((Outline.Rectangle) outline).getRect());
        return;
    L6:
        if ((outline instanceof Outline.Rounded) == false) goto L12;
        Path path = ((Outline.Rounded) outline).getRoundRectPath$ui_graphics_release();
        if (path == null) goto L10;
        r7.invoke($this$drawOutlineHelper, path);
        return;
    L10:
        r6.invoke($this$drawOutlineHelper, ((Outline.Rounded) outline).getRoundRect());
        return;
    L12:
        if ((outline instanceof Outline.Generic) == false) goto L16;
        r7.invoke($this$drawOutlineHelper, ((Outline.Generic) outline).getPath());
        return;
    L16:
        throw new NoWhenBranchMatchedException();
    }

    public static final void drawOutline(Canvas $this$drawOutline, Outline outline, Paint paint) {
        if ((outline instanceof Outline.Rectangle) == false) goto L6;
        $this$drawOutline.drawRect(((Outline.Rectangle) outline).getRect(), paint);
        return;
    L6:
        if ((outline instanceof Outline.Rounded) == false) goto L12;
        Path path = ((Outline.Rounded) outline).getRoundRectPath$ui_graphics_release();
        if (path == null) goto L10;
        $this$drawOutline.drawPath(path, paint);
        return;
    L10:
        float r1 = ((Outline.Rounded) outline).getRoundRect().getLeft();
        float r2 = ((Outline.Rounded) outline).getRoundRect().getTop();
        float r3 = ((Outline.Rounded) outline).getRoundRect().getRight();
        float r4 = ((Outline.Rounded) outline).getRoundRect().getBottom();
        long arg0$iv = ((Outline.Rounded) outline).getRoundRect().m4173getBottomLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        float r14 = Float.intBitsToFloat(bits$iv$iv$iv);
        long arg0$iv2 = ((Outline.Rounded) outline).getRoundRect().m4173getBottomLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv2 = (int) (arg0$iv2 & 4294967295L);
        $this$drawOutline.drawRoundRect(r1, r2, r3, r4, r14, Float.intBitsToFloat(bits$iv$iv$iv2), paint);
        return;
    L12:
        if ((outline instanceof Outline.Generic) == false) goto L16;
        $this$drawOutline.drawPath(((Outline.Generic) outline).getPath(), paint);
        return;
    L16:
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean hasSameCornerRadius(RoundRect $this$hasSameCornerRadius) {
        long arg0$iv = $this$hasSameCornerRadius.m4173getBottomLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        float r7 = Float.intBitsToFloat(bits$iv$iv$iv);
        long arg0$iv2 = $this$hasSameCornerRadius.m4174getBottomRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv2 = (int) (arg0$iv2 >> 32);
        if (r7 != Float.intBitsToFloat(bits$iv$iv$iv2)) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L18;
        long arg0$iv3 = $this$hasSameCornerRadius.m4174getBottomRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv3 = (int) (arg0$iv3 >> 32);
        float r9 = Float.intBitsToFloat(bits$iv$iv$iv3);
        long arg0$iv4 = $this$hasSameCornerRadius.m4176getTopRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv4 = (int) (arg0$iv4 >> 32);
        if (r9 != Float.intBitsToFloat(bits$iv$iv$iv4)) goto L10;
        boolean r1 = true;
    L11:
        if (r1 == false) goto L18;
        long arg0$iv5 = $this$hasSameCornerRadius.m4176getTopRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv5 = (int) (arg0$iv5 >> 32);
        float r10 = Float.intBitsToFloat(bits$iv$iv$iv5);
        long arg0$iv6 = $this$hasSameCornerRadius.m4175getTopLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv6 = (int) (arg0$iv6 >> 32);
        if (r10 != Float.intBitsToFloat(bits$iv$iv$iv6)) goto L15;
        boolean r2 = true;
    L16:
        if (r2 == false) goto L18;
        boolean sameRadiusX = true;
    L19:
        long arg0$iv7 = $this$hasSameCornerRadius.m4173getBottomLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv7 = (int) (arg0$iv7 & 4294967295L);
        float r11 = Float.intBitsToFloat(bits$iv$iv$iv7);
        long arg0$iv8 = $this$hasSameCornerRadius.m4174getBottomRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv8 = (int) (arg0$iv8 & 4294967295L);
        if (r11 != Float.intBitsToFloat(bits$iv$iv$iv8)) goto L22;
        boolean r3 = true;
    L23:
        if (r3 == false) goto L35;
        long arg0$iv9 = $this$hasSameCornerRadius.m4174getBottomRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv9 = (int) (arg0$iv9 & 4294967295L);
        float r12 = Float.intBitsToFloat(bits$iv$iv$iv9);
        long arg0$iv10 = $this$hasSameCornerRadius.m4176getTopRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv10 = (int) (arg0$iv10 & 4294967295L);
        if (r12 != Float.intBitsToFloat(bits$iv$iv$iv10)) goto L27;
        boolean r4 = true;
    L28:
        if (r4 == false) goto L35;
        long arg0$iv11 = $this$hasSameCornerRadius.m4176getTopRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv11 = (int) (arg0$iv11 & 4294967295L);
        float r13 = Float.intBitsToFloat(bits$iv$iv$iv11);
        long arg0$iv12 = $this$hasSameCornerRadius.m4175getTopLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv12 = (int) (4294967295L & arg0$iv12);
        if (r13 != Float.intBitsToFloat(bits$iv$iv$iv12)) goto L32;
        boolean r5 = true;
    L33:
        if (r5 == false) goto L35;
        boolean sameRadiusY = true;
    L37:
        if (sameRadiusX == false) goto L41;
        if (sameRadiusY == false) goto L41;
        return true;
    L41:
        return false;
    L32:
        r5 = false;
        goto L33
    L27:
        r4 = false;
    L35:
        sameRadiusY = false;
        goto L37
    L22:
        r3 = false;
        goto L23
    L15:
        r2 = false;
        goto L16
    L10:
        r1 = false;
    L18:
        sameRadiusX = false;
        goto L19
    L5:
        r0 = false;
        goto L6
    }
}
