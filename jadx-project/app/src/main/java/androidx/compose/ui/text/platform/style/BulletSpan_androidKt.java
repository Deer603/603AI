package androidx.compose.ui.text.platform.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPathEffect_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BulletSpan.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a>\u0010\f\u001a\u00020\u0001*\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"draw", "", "Landroidx/compose/ui/graphics/Outline;", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", "xStart", "", "yCenter", "dir", "", "setBrushAndDraw", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "size", "Landroidx/compose/ui/geometry/Size;", "Lkotlin/Function0;", "setBrushAndDraw-yzxVdVo", "(Landroid/graphics/Paint;Landroidx/compose/ui/graphics/Brush;FJLkotlin/jvm/functions/Function0;)V", "setDrawStyle", "value", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BulletSpan_androidKt {
    public static final /* synthetic */ void access$draw(Outline $receiver, Canvas canvas, Paint paint, float xStart, float yCenter, int dir) {
        draw($receiver, canvas, paint, xStart, yCenter, dir);
    }

    /* JADX INFO: renamed from: access$setBrushAndDraw-yzxVdVo, reason: not valid java name */
    public static final /* synthetic */ void m6701access$setBrushAndDrawyzxVdVo(Paint $receiver, Brush brush, float alpha, long size, Function0 draw) {
        m6702setBrushAndDrawyzxVdVo($receiver, brush, alpha, size, draw);
    }

    public static final /* synthetic */ void access$setDrawStyle(Paint $receiver, DrawStyle value) {
        setDrawStyle($receiver, value);
    }

    private static final void setDrawStyle(Paint $this$setDrawStyle, DrawStyle value) {
        if (Intrinsics.areEqual(value, Fill.INSTANCE) == false) goto L6;
        $this$setDrawStyle.setStyle(Paint.Style.FILL);
        return;
    L6:
        if ((value instanceof Stroke) == false) goto L14;
        $this$setDrawStyle.setStyle(Paint.Style.STROKE);
        $this$setDrawStyle.setStrokeWidth(((Stroke) value).getWidth());
        $this$setDrawStyle.setStrokeMiter(((Stroke) value).getMiter());
        $this$setDrawStyle.setStrokeCap(DrawStyleSpan_androidKt.m6703toAndroidCapBeK7IIE(((Stroke) value).m4986getCapKaPHkGw()));
        $this$setDrawStyle.setStrokeJoin(DrawStyleSpan_androidKt.m6704toAndroidJoinWw9F2mQ(((Stroke) value).m4987getJoinLxFBmk8()));
        PathEffect r0 = ((Stroke) value).getPathEffect();
        if (r0 == null) goto L10;
        android.graphics.PathEffect r1 = AndroidPathEffect_androidKt.asAndroidPathEffect(r0);
    L11:
        $this$setDrawStyle.setPathEffect(r1);
        return;
    L10:
        r1 = null;
        goto L11
    }

    private static final void draw(Outline $this$draw, Canvas canvas, Paint paint, float xStart, float yCenter, int dir) {
        if (($this$draw instanceof Outline.Generic) == false) goto L10;
        canvas.save();
        Rect this_$iv = $this$draw.getBounds();
        canvas.translate(xStart, yCenter - ((this_$iv.getBottom() - this_$iv.getTop()) / 2.0f));
        Path $this$asAndroidPath$iv = ((Outline.Generic) $this$draw).getPath();
        if (($this$asAndroidPath$iv instanceof AndroidPath) == false) goto L8;
        canvas.drawPath(((AndroidPath) $this$asAndroidPath$iv).getInternalPath(), paint);
        canvas.restore();
        return;
    L8:
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    L10:
        if (($this$draw instanceof Outline.Rounded) == false) goto L20;
        if (RoundRectKt.isSimple(((Outline.Rounded) $this$draw).getRoundRect()) == true) goto L18;
        Path $this$draw_u24lambda_u240 = AndroidPath_androidKt.Path();
        Path.addRoundRect$default($this$draw_u24lambda_u240, ((Outline.Rounded) $this$draw).getRoundRect(), null, 2, null);
        canvas.save();
        canvas.translate(xStart, yCenter - (((Outline.Rounded) $this$draw).getRoundRect().getHeight() / 2.0f));
        if (($this$draw_u24lambda_u240 instanceof AndroidPath) == false) goto L17;
        canvas.drawPath(((AndroidPath) $this$draw_u24lambda_u240).getInternalPath(), paint);
        canvas.restore();
        return;
    L17:
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    L18:
        long arg0$iv = ((Outline.Rounded) $this$draw).getRoundRect().m4175getTopLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        float xRadius = Float.intBitsToFloat(bits$iv$iv$iv);
        canvas.drawRoundRect(xStart, yCenter - (((Outline.Rounded) $this$draw).getRoundRect().getHeight() / 2.0f), (dir * ((Outline.Rounded) $this$draw).getRoundRect().getWidth()) + xStart, (((Outline.Rounded) $this$draw).getRoundRect().getHeight() / 2.0f) + yCenter, xRadius, xRadius, paint);
        return;
    L20:
        if (($this$draw instanceof Outline.Rectangle) == false) goto L26;
        Rect this_$iv2 = ((Outline.Rectangle) $this$draw).getRect();
        float r2 = yCenter - ((this_$iv2.getBottom() - this_$iv2.getTop()) / 2.0f);
        Rect this_$iv3 = ((Outline.Rectangle) $this$draw).getRect();
        float r0 = (dir * (this_$iv3.getRight() - this_$iv3.getLeft())) + xStart;
        Rect this_$iv4 = ((Outline.Rectangle) $this$draw).getRect();
        canvas.drawRect(xStart, r2, r0, yCenter + ((this_$iv4.getBottom() - this_$iv4.getTop()) / 2.0f), paint);
        return;
    }

    /* JADX INFO: renamed from: setBrushAndDraw-yzxVdVo, reason: not valid java name */
    private static final void m6702setBrushAndDrawyzxVdVo(Paint $this$setBrushAndDraw_u2dyzxVdVo, Brush brush, float alpha, long size, Function0<Unit> r12) {
        Integer currentAlpha = null;
        if (brush != null) goto L13;
        if (Float.isNaN(alpha) == true) goto L8;
        currentAlpha = Integer.valueOf($this$setBrushAndDraw_u2dyzxVdVo.getAlpha());
        currentAlpha.intValue();
        $this$setBrushAndDraw_u2dyzxVdVo.setAlpha((int) Math.rint(255.0f * alpha));
    L8:
        r12.invoke();
        if (currentAlpha == null) goto L36;
        int it = currentAlpha.intValue();
        $this$setBrushAndDraw_u2dyzxVdVo.setAlpha(it);
        return;
    L36:
        return;
    L13:
        if ((brush instanceof SolidColor) == false) goto L23;
        int currentColor = $this$setBrushAndDraw_u2dyzxVdVo.getColor();
        if (Float.isNaN(alpha) == true) goto L18;
        currentAlpha = Integer.valueOf($this$setBrushAndDraw_u2dyzxVdVo.getAlpha());
        currentAlpha.intValue();
        $this$setBrushAndDraw_u2dyzxVdVo.setAlpha((int) Math.rint(255.0f * alpha));
    L18:
        $this$setBrushAndDraw_u2dyzxVdVo.setColor(ColorKt.m4420toArgb8_81llA(((SolidColor) brush).m4701getValue0d7_KjU()));
        r12.invoke();
        $this$setBrushAndDraw_u2dyzxVdVo.setColor(currentColor);
        if (currentAlpha == null) goto L37;
        int it2 = currentAlpha.intValue();
        $this$setBrushAndDraw_u2dyzxVdVo.setAlpha(it2);
        return;
    L37:
        return;
    L23:
        if ((brush instanceof ShaderBrush) == false) goto L34;
        Shader currentShader = $this$setBrushAndDraw_u2dyzxVdVo.getShader();
        if (Float.isNaN(alpha) == true) goto L28;
        currentAlpha = Integer.valueOf($this$setBrushAndDraw_u2dyzxVdVo.getAlpha());
        currentAlpha.intValue();
        $this$setBrushAndDraw_u2dyzxVdVo.setAlpha((int) Math.rint(255.0f * alpha));
    L28:
        $this$setBrushAndDraw_u2dyzxVdVo.setShader(((ShaderBrush) brush).mo4335createShaderuvyYCjk(size));
        r12.invoke();
        $this$setBrushAndDraw_u2dyzxVdVo.setShader(currentShader);
        if (currentAlpha == null) goto L35;
        int it3 = currentAlpha.intValue();
        $this$setBrushAndDraw_u2dyzxVdVo.setAlpha(it3);
        return;
    L35:
        return;
    }
}
