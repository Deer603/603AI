package androidx.compose.ui.text.platform;

import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidTextPaint.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u00109\u001a\u00020:H\u0002J,\u0010;\u001a\u00020:2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010<\u001a\u00020\u001b2\b\b\u0002\u0010=\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u00020:2\u0006\u0010A\u001a\u00020'ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020:2\b\u0010$\u001a\u0004\u0018\u00010%J\u0010\u0010E\u001a\u00020:2\b\u00100\u001a\u0004\u0018\u000101J\u0010\u0010F\u001a\u00020:2\b\u00107\u001a\u0004\u0018\u000108R\u0016\u0010\u0007\u001a\u00020\bX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b8F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R,\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0000@\u0000X\u0081\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R*\u0010(\u001a\u0012\u0012\f\u0012\n\u0018\u00010*j\u0004\u0018\u0001`+\u0018\u00010)X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00100\u001a\u0002018\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b2\u0010\u0015\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u000e\u00107\u001a\u000208X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006G"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTextPaint;", "Landroid/text/TextPaint;", "flags", "", "density", "", "(IF)V", "backingBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "I", "backingComposePaint", "Landroidx/compose/ui/graphics/Paint;", "value", "blendMode", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "brush", "Landroidx/compose/ui/graphics/Brush;", "getBrush$ui_text_release$annotations", "()V", "getBrush$ui_text_release", "()Landroidx/compose/ui/graphics/Brush;", "setBrush$ui_text_release", "(Landroidx/compose/ui/graphics/Brush;)V", "brushSize", "Landroidx/compose/ui/geometry/Size;", "getBrushSize-VsRJwc0$ui_text_release$annotations", "getBrushSize-VsRJwc0$ui_text_release", "()Landroidx/compose/ui/geometry/Size;", "setBrushSize-iaC8Vc4$ui_text_release", "(Landroidx/compose/ui/geometry/Size;)V", "composePaint", "getComposePaint", "()Landroidx/compose/ui/graphics/Paint;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "lastColor", "Landroidx/compose/ui/graphics/Color;", "shaderState", "Landroidx/compose/runtime/State;", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "getShaderState$ui_text_release", "()Landroidx/compose/runtime/State;", "setShaderState$ui_text_release", "(Landroidx/compose/runtime/State;)V", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "getShadow$ui_text_release$annotations", "getShadow$ui_text_release", "()Landroidx/compose/ui/graphics/Shadow;", "setShadow$ui_text_release", "(Landroidx/compose/ui/graphics/Shadow;)V", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "clearShader", "", "setBrush", "size", "alpha", "setBrush-12SF9DM", "(Landroidx/compose/ui/graphics/Brush;JF)V", "setColor", "color", "setColor-8_81llA", "(J)V", "setDrawStyle", "setShadow", "setTextDecoration", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidTextPaint extends TextPaint {
    public static final int $stable = 0;
    private int backingBlendMode;
    private Paint backingComposePaint;
    private Brush brush;
    private Size brushSize;
    private DrawStyle drawStyle;
    private Color lastColor;
    private State<? extends Shader> shaderState;
    private Shadow shadow;
    private TextDecoration textDecoration;

    static {
        $stable = 8;
    }

    public static /* synthetic */ void getBrush$ui_text_release$annotations() {
    }

    /* JADX INFO: renamed from: getBrushSize-VsRJwc0$ui_text_release$annotations, reason: not valid java name */
    public static /* synthetic */ void m6678getBrushSizeVsRJwc0$ui_text_release$annotations() {
    }

    public static /* synthetic */ void getShadow$ui_text_release$annotations() {
    }

    public AndroidTextPaint(int flags, float density) {
        super(flags);
        this.density = density;
        this.textDecoration = TextDecoration.Companion.getNone();
        this.backingBlendMode = DrawScope.Companion.m4919getDefaultBlendMode0nO6VwU();
        this.shadow = Shadow.Companion.getNone();
    }

    private final Paint getComposePaint() {
        Paint finalBackingComposePaint = this.backingComposePaint;
        if (finalBackingComposePaint == null) goto L5;
        return finalBackingComposePaint;
    L5:
        Paint it = AndroidPaint_androidKt.asComposePaint(this);
        this.backingComposePaint = it;
        return it;
    }

    public final Shadow getShadow$ui_text_release() {
        return this.shadow;
    }

    public final void setShadow$ui_text_release(Shadow r1) {
        this.shadow = r1;
    }

    public final Brush getBrush$ui_text_release() {
        return this.brush;
    }

    public final void setBrush$ui_text_release(Brush r1) {
        this.brush = r1;
    }

    public final State<Shader> getShaderState$ui_text_release() {
        return this.shaderState;
    }

    public final void setShaderState$ui_text_release(State<? extends Shader> r1) {
        this.shaderState = r1;
    }

    /* JADX INFO: renamed from: getBrushSize-VsRJwc0$ui_text_release, reason: not valid java name */
    public final Size m6681getBrushSizeVsRJwc0$ui_text_release() {
        return this.brushSize;
    }

    /* JADX INFO: renamed from: setBrushSize-iaC8Vc4$ui_text_release, reason: not valid java name */
    public final void m6684setBrushSizeiaC8Vc4$ui_text_release(Size r1) {
        this.brushSize = r1;
    }

    public final void setTextDecoration(TextDecoration textDecoration) {
        if (textDecoration != null) goto L5;
        return;
    L5:
        if (Intrinsics.areEqual(this.textDecoration, textDecoration) == true) goto L8;
        this.textDecoration = textDecoration;
        setUnderlineText(this.textDecoration.contains(TextDecoration.Companion.getUnderline()));
        setStrikeThruText(this.textDecoration.contains(TextDecoration.Companion.getLineThrough()));
        return;
    }

    public final void setShadow(Shadow shadow) {
        if (shadow != null) goto L5;
        return;
    L5:
        if (Intrinsics.areEqual(this.shadow, shadow) == true) goto L11;
        this.shadow = shadow;
        if (Intrinsics.areEqual(this.shadow, Shadow.Companion.getNone()) == false) goto L9;
        clearShadowLayer();
        return;
    L9:
        float r0 = TextPaintExtensions_androidKt.correctBlurRadius(this.shadow.getBlurRadius());
        long arg0$iv = this.shadow.m4692getOffsetF1C5BW0();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        float r7 = Float.intBitsToFloat(bits$iv$iv$iv);
        long arg0$iv2 = this.shadow.m4692getOffsetF1C5BW0();
        int bits$iv$iv$iv2 = (int) (4294967295L & arg0$iv2);
        setShadowLayer(r0, r7, Float.intBitsToFloat(bits$iv$iv$iv2), ColorKt.m4420toArgb8_81llA(this.shadow.m4691getColor0d7_KjU()));
        return;
    }

    /* JADX INFO: renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m6685setColor8_81llA(long color) {
        Color r0 = this.lastColor;
        boolean r1 = false;
        if (r0 != null) goto L5;
        boolean r2 = false;
    L6:
        if (r2 == false) goto L8;
        return;
    L8:
        if (color == 16) goto L10;
        r1 = true;
    L10:
        if (r1 == false) goto L14;
        this.lastColor = Color.m4356boximpl(color);
        setColor(ColorKt.m4420toArgb8_81llA(color));
        clearShader();
        return;
    L14:
        return;
    L5:
        r2 = Color.m4367equalsimpl0(r0.m4376unboximpl(), color);
        goto L6
    }

    /* JADX INFO: renamed from: setBrush-12SF9DM$default, reason: not valid java name */
    public static /* synthetic */ void m6679setBrush12SF9DM$default(AndroidTextPaint r0, Brush r1, long r2, float r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L5;
        r4 = Float.NaN;
    L5:
        r0.m6683setBrush12SF9DM(r1, r2, r4);
    }

    /* JADX INFO: renamed from: setBrush-12SF9DM, reason: not valid java name */
    public final void m6683setBrush12SF9DM(final Brush brush, final long size, float alpha) {
        if (brush != null) goto L5;
        clearShader();
        return;
    L5:
        if ((brush instanceof SolidColor) == false) goto L8;
        m6685setColor8_81llA(TextDrawStyleKt.m6855modulateDxMtmZc(((SolidColor) brush).m4701getValue0d7_KjU(), alpha));
        return;
    L8:
        if ((brush instanceof ShaderBrush) == false) goto L29;
        boolean r1 = false;
        if (Intrinsics.areEqual(this.brush, brush) == false) goto L17;
        Size r0 = this.brushSize;
        if (r0 != null) goto L14;
        boolean r2 = false;
    L15:
        if (r2 == false) goto L17;
    L21:
        Paint r3 = getComposePaint();
        State<? extends Shader> r4 = this.shaderState;
        if (r4 == null) goto L24;
        Shader r5 = r4.getValue();
    L25:
        r3.setShader(r5);
        this.lastColor = null;
        AndroidTextPaint_androidKt.setAlpha(this, alpha);
        return;
    L24:
        r5 = null;
        goto L25
    L14:
        r2 = Size.m4190equalsimpl0(r0.m4199unboximpl(), size);
    L17:
        if (size == InlineClassHelperKt.UnspecifiedPackedFloats) goto L19;
        r1 = true;
    L19:
        if (r1 == false) goto L21;
        this.brush = brush;
        this.brushSize = Size.m4182boximpl(size);
        this.shaderState = SnapshotStateKt.derivedStateOf(new AndroidTextPaint$setBrush$1(brush, size));
        goto L21
    }

    public final void setDrawStyle(DrawStyle drawStyle) {
        if (drawStyle != null) goto L5;
        return;
    L5:
        if (Intrinsics.areEqual(this.drawStyle, drawStyle) == true) goto L13;
        this.drawStyle = drawStyle;
        if (Intrinsics.areEqual(drawStyle, Fill.INSTANCE) == false) goto L10;
        setStyle(android.graphics.Paint.Style.FILL);
        return;
    L10:
        if ((drawStyle instanceof Stroke) == false) goto L15;
        getComposePaint().mo4249setStylek9PVt8s(PaintingStyle.Companion.m4634getStrokeTiuSbCo());
        getComposePaint().setStrokeWidth(((Stroke) drawStyle).getWidth());
        getComposePaint().setStrokeMiterLimit(((Stroke) drawStyle).getMiter());
        getComposePaint().mo4248setStrokeJoinWw9F2mQ(((Stroke) drawStyle).m4987getJoinLxFBmk8());
        getComposePaint().mo4247setStrokeCapBeK7IIE(((Stroke) drawStyle).m4986getCapKaPHkGw());
        getComposePaint().setPathEffect(((Stroke) drawStyle).getPathEffect());
        return;
    L15:
        return;
    }

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m6680getBlendMode0nO6VwU() {
        return this.backingBlendMode;
    }

    /* JADX INFO: renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m6682setBlendModes9anfk8(int value) {
        if (BlendMode.m4277equalsimpl0(value, this.backingBlendMode) == false) goto L5;
        return;
    L5:
        getComposePaint().mo4244setBlendModes9anfk8(value);
        this.backingBlendMode = value;
    }

    private final void clearShader() {
        this.shaderState = null;
        this.brush = null;
        this.brushSize = null;
        setShader(null);
    }
}
