package androidx.compose.foundation;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Metadata;

/* JADX INFO: compiled from: Border.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u001e\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u000b\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u001a.\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a0\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u001cH\u0002\u001a>\u0010\u001d\u001a\u00020\u001b*\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010%\u001a\u00020&*\u00020&2\u0006\u0010'\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"createInsetRoundedRect", "Landroidx/compose/ui/geometry/RoundRect;", "widthPx", "", "roundedRect", "createRoundRectPath", "Landroidx/compose/ui/graphics/Path;", "targetPath", "strokeWidth", "fillArea", "", OutlinedTextFieldKt.BorderId, "Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/BorderStroke;", "shape", "Landroidx/compose/ui/graphics/Shape;", "width", "Landroidx/compose/ui/unit/Dp;", "brush", "Landroidx/compose/ui/graphics/Brush;", "border-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "border-xT4_qwU", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "drawContentWithoutBorder", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "drawRectBorder", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "borderSize", "Landroidx/compose/ui/geometry/Size;", "strokeWidthPx", "drawRectBorder-NsqcLGU", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;JJZF)Landroidx/compose/ui/draw/DrawResult;", "shrink", "Landroidx/compose/ui/geometry/CornerRadius;", "value", "shrink-Kibmq7A", "(JF)J", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BorderKt {
    public static final /* synthetic */ Path access$createRoundRectPath(Path targetPath, RoundRect roundedRect, float strokeWidth, boolean fillArea) {
        return createRoundRectPath(targetPath, roundedRect, strokeWidth, fillArea);
    }

    public static final /* synthetic */ DrawResult access$drawContentWithoutBorder(CacheDrawScope $receiver) {
        return drawContentWithoutBorder($receiver);
    }

    /* JADX INFO: renamed from: access$drawRectBorder-NsqcLGU, reason: not valid java name */
    public static final /* synthetic */ DrawResult m243access$drawRectBorderNsqcLGU(CacheDrawScope $receiver, Brush brush, long topLeft, long borderSize, boolean fillArea, float strokeWidthPx) {
        return m248drawRectBorderNsqcLGU($receiver, brush, topLeft, borderSize, fillArea, strokeWidthPx);
    }

    /* JADX INFO: renamed from: access$shrink-Kibmq7A, reason: not valid java name */
    public static final /* synthetic */ long m244access$shrinkKibmq7A(long $receiver, float value) {
        return m249shrinkKibmq7A($receiver, value);
    }

    public static /* synthetic */ Modifier border$default(Modifier r0, BorderStroke r1, Shape r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = RectangleShapeKt.getRectangleShape();
    L6:
        return border(r0, r1, r2);
    }

    public static final Modifier border(Modifier $this$border, BorderStroke border, Shape shape) {
        return m247borderziNgDLE($this$border, border.m260getWidthD9Ej5fM(), border.getBrush(), shape);
    }

    /* JADX INFO: renamed from: border-xT4_qwU$default, reason: not valid java name */
    public static /* synthetic */ Modifier m246borderxT4_qwU$default(Modifier r0, float r1, long r2, Shape r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r4 = RectangleShapeKt.getRectangleShape();
    L6:
        return m245borderxT4_qwU(r0, r1, r2, r4);
    }

    /* JADX INFO: renamed from: border-xT4_qwU, reason: not valid java name */
    public static final Modifier m245borderxT4_qwU(Modifier $this$border_u2dxT4_qwU, float width, long color, Shape shape) {
        return m247borderziNgDLE($this$border_u2dxT4_qwU, width, new SolidColor(color, null), shape);
    }

    /* JADX INFO: renamed from: border-ziNgDLE, reason: not valid java name */
    public static final Modifier m247borderziNgDLE(Modifier $this$border_u2dziNgDLE, float width, Brush brush, Shape shape) {
        return $this$border_u2dziNgDLE.then(new BorderModifierNodeElement(width, brush, shape, null));
    }

    private static final DrawResult drawContentWithoutBorder(CacheDrawScope $this$drawContentWithoutBorder) {
        return $this$drawContentWithoutBorder.onDrawWithContent(AnonymousClass1.INSTANCE);
    }

    /* JADX INFO: renamed from: drawRectBorder-NsqcLGU, reason: not valid java name */
    private static final DrawResult m248drawRectBorderNsqcLGU(CacheDrawScope $this$drawRectBorder_u2dNsqcLGU, final Brush brush, long topLeft, long borderSize, boolean fillArea, float strokeWidthPx) {
        if (fillArea == false) goto L4;
        long r0 = Offset.Companion.m4141getZeroF1C5BW0();
    L5:
        final long rectTopLeft = r0;
        if (fillArea == false) goto L8;
        final long size = $this$drawRectBorder_u2dNsqcLGU.m3986getSizeNHjbRc();
    L9:
        if (fillArea == false) goto L11;
        Stroke r1 = Fill.INSTANCE;
    L12:
        final DrawStyle style = r1;
        return $this$drawRectBorder_u2dNsqcLGU.onDrawWithContent(new BorderKt$drawRectBorder$1(brush, rectTopLeft, size, style));
    L11:
        r1 = new Stroke(strokeWidthPx, 0.0f, 0, 0, null, 30, null);
        goto L12
    L8:
        size = borderSize;
        goto L9
    L4:
        r0 = topLeft;
        goto L5
    }

    private static final Path createRoundRectPath(Path targetPath, RoundRect roundedRect, float strokeWidth, boolean fillArea) {
        targetPath.reset();
        Path.addRoundRect$default(targetPath, roundedRect, null, 2, null);
        if (fillArea == true) goto L6;
        Path insetPath = AndroidPath_androidKt.Path();
        Path.addRoundRect$default(insetPath, createInsetRoundedRect(strokeWidth, roundedRect), null, 2, null);
        targetPath.mo4258opN5in7k0(targetPath, insetPath, PathOperation.Companion.m4658getDifferenceb3I0S0c());
    L6:
        return targetPath;
    }

    private static final RoundRect createInsetRoundedRect(float widthPx, RoundRect roundedRect) {
        float r3 = roundedRect.getWidth() - widthPx;
        float r4 = roundedRect.getHeight() - widthPx;
        long r5 = m249shrinkKibmq7A(roundedRect.m4175getTopLeftCornerRadiuskKHJgLs(), widthPx);
        long r7 = m249shrinkKibmq7A(roundedRect.m4176getTopRightCornerRadiuskKHJgLs(), widthPx);
        long r11 = m249shrinkKibmq7A(roundedRect.m4173getBottomLeftCornerRadiuskKHJgLs(), widthPx);
        return new RoundRect(widthPx, widthPx, r3, r4, r5, r7, m249shrinkKibmq7A(roundedRect.m4174getBottomRightCornerRadiuskKHJgLs(), widthPx), r11, null);
    }

    /* JADX INFO: renamed from: shrink-Kibmq7A, reason: not valid java name */
    private static final long m249shrinkKibmq7A(long $this$shrink_u2dKibmq7A, float value) {
        int bits$iv$iv$iv = (int) ($this$shrink_u2dKibmq7A >> 32);
        float x$iv = Math.max(0.0f, Float.intBitsToFloat(bits$iv$iv$iv) - value);
        int bits$iv$iv$iv2 = (int) ($this$shrink_u2dKibmq7A & 4294967295L);
        float y$iv = Math.max(0.0f, Float.intBitsToFloat(bits$iv$iv$iv2) - value);
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return CornerRadius.m4079constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }
}
