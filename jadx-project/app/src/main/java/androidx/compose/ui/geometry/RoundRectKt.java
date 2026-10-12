package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: RoundRect.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\u001a \u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a@\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u001c2\b\b\u0002\u0010!\u001a\u00020\u001c2\b\b\u0002\u0010\"\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012\u001a8\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a6\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012\u001a\u001e\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0012\u001a\u001c\u00101\u001a\u00020\u0002*\u00020\u00022\u0006\u00102\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b3\u00104\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b\"\u0015\u0010\f\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000b\"\u0015\u0010\r\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\"\u0015\u0010\u000e\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b\"\u0015\u0010\u000f\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b\"\u0015\u0010\u0010\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000b\"\u0015\u0010\u0011\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0015\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014\"\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"boundingRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/RoundRect;", "getBoundingRect", "(Landroidx/compose/ui/geometry/RoundRect;)Landroidx/compose/ui/geometry/Rect;", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter", "(Landroidx/compose/ui/geometry/RoundRect;)J", "isCircle", "", "(Landroidx/compose/ui/geometry/RoundRect;)Z", "isEllipse", "isEmpty", "isFinite", "isRect", "isSimple", "maxDimension", "", "getMaxDimension", "(Landroidx/compose/ui/geometry/RoundRect;)F", "minDimension", "getMinDimension", "safeInnerRect", "getSafeInnerRect", "RoundRect", "rect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "RoundRect-sniSvfs", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/RoundRect;", "topLeft", "topRight", "bottomRight", "bottomLeft", "RoundRect-ZAM2FJo", "(Landroidx/compose/ui/geometry/Rect;JJJJ)Landroidx/compose/ui/geometry/RoundRect;", "radiusX", "radiusY", "left", "top", "right", "bottom", "RoundRect-gG7oq9Y", "(FFFFJ)Landroidx/compose/ui/geometry/RoundRect;", "lerp", "start", "stop", "fraction", "translate", "offset", "translate-Uv8p0NA", "(Landroidx/compose/ui/geometry/RoundRect;J)Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RoundRectKt {
    public static final RoundRect RoundRect(float left, float top, float right, float bottom, float radiusX, float radiusY) {
        long v1$iv$iv = Float.floatToRawIntBits(radiusX);
        long v2$iv$iv = Float.floatToRawIntBits(radiusY);
        long r0 = CornerRadius.m4079constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
        return new RoundRect(left, top, right, bottom, r0, r0, r0, r0, null);
    }

    /* JADX INFO: renamed from: RoundRect-gG7oq9Y, reason: not valid java name */
    public static final RoundRect m4179RoundRectgG7oq9Y(float left, float top, float right, float bottom, long cornerRadius) {
        int bits$iv$iv$iv = (int) (cornerRadius >> 32);
        float r10 = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (4294967295L & cornerRadius);
        return RoundRect(left, top, right, bottom, r10, Float.intBitsToFloat(bits$iv$iv$iv2));
    }

    public static final RoundRect RoundRect(Rect rect, float radiusX, float radiusY) {
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), radiusX, radiusY);
    }

    /* JADX INFO: renamed from: RoundRect-sniSvfs, reason: not valid java name */
    public static final RoundRect m4180RoundRectsniSvfs(Rect rect, long cornerRadius) {
        int bits$iv$iv$iv = (int) (cornerRadius >> 32);
        int bits$iv$iv$iv2 = (int) (4294967295L & cornerRadius);
        return RoundRect(rect, Float.intBitsToFloat(bits$iv$iv$iv), Float.intBitsToFloat(bits$iv$iv$iv2));
    }

    /* JADX INFO: renamed from: RoundRect-ZAM2FJo$default, reason: not valid java name */
    public static /* synthetic */ RoundRect m4178RoundRectZAM2FJo$default(Rect r8, long r9, long r11, long r13, long r15, int r17, Object r18) {
        if ((r17 & 2) == 0) goto L5;
        long r0 = CornerRadius.Companion.m4097getZerokKHJgLs();
    L7:
        if ((r17 & 4) == 0) goto L9;
        long r2 = CornerRadius.Companion.m4097getZerokKHJgLs();
    L11:
        if ((r17 & 8) == 0) goto L13;
        long r4 = CornerRadius.Companion.m4097getZerokKHJgLs();
    L15:
        if ((r17 & 16) == 0) goto L17;
        long r6 = CornerRadius.Companion.m4097getZerokKHJgLs();
    L19:
        return m4177RoundRectZAM2FJo(r8, r0, r2, r4, r6);
    L17:
        r6 = r15;
        goto L19
    L13:
        r4 = r13;
        goto L15
    L9:
        r2 = r11;
        goto L11
    L5:
        r0 = r9;
        goto L7
    }

    /* JADX INFO: renamed from: RoundRect-ZAM2FJo, reason: not valid java name */
    public static final RoundRect m4177RoundRectZAM2FJo(Rect rect, long topLeft, long topRight, long bottomRight, long bottomLeft) {
        return new RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), topLeft, topRight, bottomRight, bottomLeft, null);
    }

    /* JADX INFO: renamed from: translate-Uv8p0NA, reason: not valid java name */
    public static final RoundRect m4181translateUv8p0NA(RoundRect $this$translate_u2dUv8p0NA, long offset) {
        int bits$iv$iv$iv = (int) (offset >> 32);
        int bits$iv$iv$iv2 = (int) (offset & 4294967295L);
        int bits$iv$iv$iv3 = (int) (offset >> 32);
        int bits$iv$iv$iv4 = (int) (4294967295L & offset);
        return new RoundRect($this$translate_u2dUv8p0NA.getLeft() + Float.intBitsToFloat(bits$iv$iv$iv), $this$translate_u2dUv8p0NA.getTop() + Float.intBitsToFloat(bits$iv$iv$iv2), $this$translate_u2dUv8p0NA.getRight() + Float.intBitsToFloat(bits$iv$iv$iv3), $this$translate_u2dUv8p0NA.getBottom() + Float.intBitsToFloat(bits$iv$iv$iv4), $this$translate_u2dUv8p0NA.m4175getTopLeftCornerRadiuskKHJgLs(), $this$translate_u2dUv8p0NA.m4176getTopRightCornerRadiuskKHJgLs(), $this$translate_u2dUv8p0NA.m4174getBottomRightCornerRadiuskKHJgLs(), $this$translate_u2dUv8p0NA.m4173getBottomLeftCornerRadiuskKHJgLs(), null);
    }

    public static final Rect getBoundingRect(RoundRect $this$boundingRect) {
        return new Rect($this$boundingRect.getLeft(), $this$boundingRect.getTop(), $this$boundingRect.getRight(), $this$boundingRect.getBottom());
    }

    public static final Rect getSafeInnerRect(RoundRect $this$safeInnerRect) {
        long arg0$iv = $this$safeInnerRect.m4173getBottomLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        float r8 = Float.intBitsToFloat(bits$iv$iv$iv);
        long arg0$iv2 = $this$safeInnerRect.m4175getTopLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv2 = (int) (arg0$iv2 >> 32);
        float leftRadius = Math.max(r8, Float.intBitsToFloat(bits$iv$iv$iv2));
        long arg0$iv3 = $this$safeInnerRect.m4175getTopLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv3 = (int) (arg0$iv3 & 4294967295L);
        float r11 = Float.intBitsToFloat(bits$iv$iv$iv3);
        long arg0$iv4 = $this$safeInnerRect.m4176getTopRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv4 = (int) (arg0$iv4 & 4294967295L);
        float topRadius = Math.max(r11, Float.intBitsToFloat(bits$iv$iv$iv4));
        long arg0$iv5 = $this$safeInnerRect.m4176getTopRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv5 = (int) (arg0$iv5 >> 32);
        float r9 = Float.intBitsToFloat(bits$iv$iv$iv5);
        long arg0$iv6 = $this$safeInnerRect.m4174getBottomRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv6 = (int) (arg0$iv6 >> 32);
        float rightRadius = Math.max(r9, Float.intBitsToFloat(bits$iv$iv$iv6));
        long arg0$iv7 = $this$safeInnerRect.m4174getBottomRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv7 = (int) (arg0$iv7 & 4294967295L);
        float r12 = Float.intBitsToFloat(bits$iv$iv$iv7);
        long arg0$iv8 = $this$safeInnerRect.m4173getBottomLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv8 = (int) (4294967295L & arg0$iv8);
        float bottomRadius = Math.max(r12, Float.intBitsToFloat(bits$iv$iv$iv8));
        return new Rect($this$safeInnerRect.getLeft() + (leftRadius * 0.29289323f), $this$safeInnerRect.getTop() + (topRadius * 0.29289323f), $this$safeInnerRect.getRight() - (rightRadius * 0.29289323f), $this$safeInnerRect.getBottom() - (bottomRadius * 0.29289323f));
    }

    public static final boolean isEmpty(RoundRect $this$isEmpty) {
        if ($this$isEmpty.getLeft() < $this$isEmpty.getRight()) goto L5;
    L8:
        return true;
    L5:
        if ($this$isEmpty.getTop() >= $this$isEmpty.getBottom()) goto L8;
        return false;
    }

    public static final boolean isFinite(RoundRect $this$isFinite) {
        float $this$fastIsFinite$iv = $this$isFinite.getLeft();
        if ((Float.floatToRawIntBits($this$fastIsFinite$iv) & Integer.MAX_VALUE) >= 2139095040) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L24;
        float $this$fastIsFinite$iv2 = $this$isFinite.getTop();
        if ((Float.floatToRawIntBits($this$fastIsFinite$iv2) & Integer.MAX_VALUE) >= 2139095040) goto L10;
        boolean r1 = true;
    L11:
        if (r1 == false) goto L24;
        float $this$fastIsFinite$iv3 = $this$isFinite.getRight();
        if ((Float.floatToRawIntBits($this$fastIsFinite$iv3) & Integer.MAX_VALUE) >= 2139095040) goto L15;
        boolean r2 = true;
    L16:
        if (r2 == false) goto L24;
        float $this$fastIsFinite$iv4 = $this$isFinite.getBottom();
        if ((Float.floatToRawIntBits($this$fastIsFinite$iv4) & Integer.MAX_VALUE) >= 2139095040) goto L20;
        boolean r3 = true;
    L21:
        if (r3 == false) goto L24;
        return true;
    L20:
        r3 = false;
        goto L21
    L15:
        r2 = false;
        goto L16
    L10:
        r1 = false;
    L24:
        return false;
    L5:
        r0 = false;
        goto L6
    }

    public static final boolean isRect(RoundRect $this$isRect) {
        long arg0$iv = $this$isRect.m4175getTopLeftCornerRadiuskKHJgLs();
        long v$iv = arg0$iv & 9223372034707292159L;
        if ((((v$iv - InlineClassHelperKt.Uint64Low32) & (~v$iv)) & (-9223372034707292160L)) == 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L24;
        long arg0$iv2 = $this$isRect.m4176getTopRightCornerRadiuskKHJgLs();
        long v$iv2 = arg0$iv2 & 9223372034707292159L;
        if ((((v$iv2 - InlineClassHelperKt.Uint64Low32) & (~v$iv2)) & (-9223372034707292160L)) == 0) goto L10;
        boolean r1 = true;
    L11:
        if (r1 == false) goto L24;
        long arg0$iv3 = $this$isRect.m4173getBottomLeftCornerRadiuskKHJgLs();
        long v$iv3 = arg0$iv3 & 9223372034707292159L;
        if ((((v$iv3 - InlineClassHelperKt.Uint64Low32) & (~v$iv3)) & (-9223372034707292160L)) == 0) goto L15;
        boolean r2 = true;
    L16:
        if (r2 == false) goto L24;
        long arg0$iv4 = $this$isRect.m4174getBottomRightCornerRadiuskKHJgLs();
        long v$iv4 = arg0$iv4 & 9223372034707292159L;
        if ((((v$iv4 - InlineClassHelperKt.Uint64Low32) & (~v$iv4)) & (-9223372034707292160L)) == 0) goto L20;
        boolean r3 = true;
    L21:
        if (r3 == false) goto L24;
        return true;
    L20:
        r3 = false;
        goto L21
    L15:
        r2 = false;
        goto L16
    L10:
        r1 = false;
    L24:
        return false;
    L5:
        r0 = false;
        goto L6
    }

    public static final boolean isEllipse(RoundRect $this$isEllipse) {
        if ($this$isEllipse.m4175getTopLeftCornerRadiuskKHJgLs() == $this$isEllipse.m4176getTopRightCornerRadiuskKHJgLs()) goto L5;
    L13:
        return false;
    L5:
        if ($this$isEllipse.m4176getTopRightCornerRadiuskKHJgLs() != $this$isEllipse.m4174getBottomRightCornerRadiuskKHJgLs()) goto L13;
        if ($this$isEllipse.m4174getBottomRightCornerRadiuskKHJgLs() != $this$isEllipse.m4173getBottomLeftCornerRadiuskKHJgLs()) goto L13;
        double r0 = $this$isEllipse.getWidth();
        long arg0$iv = $this$isEllipse.m4175getTopLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        if (r0 > (((double) Float.intBitsToFloat(bits$iv$iv$iv)) * 2.0d)) goto L13;
        double r1 = $this$isEllipse.getHeight();
        long arg0$iv2 = $this$isEllipse.m4175getTopLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv2 = (int) (4294967295L & arg0$iv2);
        if (r1 > (((double) Float.intBitsToFloat(bits$iv$iv$iv2)) * 2.0d)) goto L13;
        return true;
    }

    public static final boolean isCircle(RoundRect $this$isCircle) {
        if ($this$isCircle.getWidth() != $this$isCircle.getHeight()) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L11;
        if (isEllipse($this$isCircle) == false) goto L11;
        return true;
    L11:
        return false;
    L5:
        r0 = false;
        goto L6
    }

    public static final float getMinDimension(RoundRect $this$minDimension) {
        return Math.min(Math.abs($this$minDimension.getWidth()), Math.abs($this$minDimension.getHeight()));
    }

    public static final float getMaxDimension(RoundRect $this$maxDimension) {
        return Math.max(Math.abs($this$maxDimension.getWidth()), Math.abs($this$maxDimension.getHeight()));
    }

    public static final long getCenter(RoundRect $this$center) {
        float x$iv = $this$center.getLeft() + ($this$center.getWidth() / 2.0f);
        float y$iv = $this$center.getTop() + ($this$center.getHeight() / 2.0f);
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    public static final boolean isSimple(RoundRect $this$isSimple) {
        long arg0$iv = $this$isSimple.m4175getTopLeftCornerRadiuskKHJgLs();
        if ((arg0$iv >>> 32) != (4294967295L & arg0$iv)) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L15;
        if ($this$isSimple.m4175getTopLeftCornerRadiuskKHJgLs() != $this$isSimple.m4176getTopRightCornerRadiuskKHJgLs()) goto L15;
        if ($this$isSimple.m4175getTopLeftCornerRadiuskKHJgLs() != $this$isSimple.m4174getBottomRightCornerRadiuskKHJgLs()) goto L15;
        if ($this$isSimple.m4175getTopLeftCornerRadiuskKHJgLs() != $this$isSimple.m4173getBottomLeftCornerRadiuskKHJgLs()) goto L15;
        return true;
    L15:
        return false;
    L5:
        r0 = false;
        goto L6
    }

    public static final RoundRect lerp(RoundRect start, RoundRect stop, float fraction) {
        return new RoundRect(MathHelpersKt.lerp(start.getLeft(), stop.getLeft(), fraction), MathHelpersKt.lerp(start.getTop(), stop.getTop(), fraction), MathHelpersKt.lerp(start.getRight(), stop.getRight(), fraction), MathHelpersKt.lerp(start.getBottom(), stop.getBottom(), fraction), CornerRadiusKt.m4098lerp3Ry4LBc(start.m4175getTopLeftCornerRadiuskKHJgLs(), stop.m4175getTopLeftCornerRadiuskKHJgLs(), fraction), CornerRadiusKt.m4098lerp3Ry4LBc(start.m4176getTopRightCornerRadiuskKHJgLs(), stop.m4176getTopRightCornerRadiuskKHJgLs(), fraction), CornerRadiusKt.m4098lerp3Ry4LBc(start.m4174getBottomRightCornerRadiuskKHJgLs(), stop.m4174getBottomRightCornerRadiuskKHJgLs(), fraction), CornerRadiusKt.m4098lerp3Ry4LBc(start.m4173getBottomLeftCornerRadiuskKHJgLs(), stop.m4173getBottomLeftCornerRadiuskKHJgLs(), fraction), null);
    }
}
