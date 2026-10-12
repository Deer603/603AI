package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Painter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0004H\u0014J\u0012\u0010\u0017\u001a\u00020\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u0010\u001a\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0013H\u0002J\b\u0010\u001d\u001a\u00020\u0011H\u0002J2\u0010\u001e\u001a\u00020\n*\u00020\t2\u0006\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006ø\u0001\u0000¢\u0006\u0004\b \u0010!J\f\u0010\"\u001a\u00020\n*\u00020\tH$R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\u00020\rX¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/ui/graphics/painter/Painter;", "", "()V", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "drawLambda", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "layerPaint", "Landroidx/compose/ui/graphics/Paint;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "useLayer", "", "applyAlpha", "applyColorFilter", "applyLayoutDirection", "configureAlpha", "configureColorFilter", "configureLayoutDirection", "rtl", "obtainPaint", "draw", "size", "draw-x_KDEd0", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/ui/graphics/ColorFilter;)V", "onDraw", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Painter {
    private float alpha;
    private ColorFilter colorFilter;
    private final Function1<DrawScope, Unit> drawLambda;
    private Paint layerPaint;
    private LayoutDirection layoutDirection;
    private boolean useLayer;

    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public abstract long mo5037getIntrinsicSizeNHjbRc();

    protected abstract void onDraw(DrawScope r1);

    public Painter() {
        this.alpha = 1.0f;
        this.layoutDirection = LayoutDirection.Ltr;
        this.drawLambda = new Painter$drawLambda$1(this);
    }

    private final Paint obtainPaint() {
        Paint target = this.layerPaint;
        if (target != null) goto L6;
        Paint target2 = AndroidPaint_androidKt.Paint();
        this.layerPaint = target2;
        return target2;
    L6:
        return target;
    }

    private final void configureColorFilter(ColorFilter colorFilter) {
        if (Intrinsics.areEqual(this.colorFilter, colorFilter) == true) goto L15;
        boolean consumedColorFilter = applyColorFilter(colorFilter);
        if (consumedColorFilter == true) goto L13;
        if (colorFilter != null) goto L12;
        Paint r1 = this.layerPaint;
        if (r1 == null) goto L11;
        r1.setColorFilter(null);
    L11:
        this.useLayer = false;
        goto L13
    L12:
        obtainPaint().setColorFilter(colorFilter);
        this.useLayer = true;
    L13:
        this.colorFilter = colorFilter;
        return;
    }

    private final void configureAlpha(float alpha) {
        if (this.alpha != alpha) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L22;
        boolean consumed = applyAlpha(alpha);
        if (consumed == false) goto L10;
    L20:
        this.alpha = alpha;
        return;
    L10:
        if (alpha != 1.0f) goto L12;
        boolean r3 = true;
    L13:
        if (r3 == false) goto L19;
        Paint r1 = this.layerPaint;
        if (r1 == null) goto L18;
        r1.setAlpha(alpha);
    L18:
        this.useLayer = false;
        goto L20
    L19:
        obtainPaint().setAlpha(alpha);
        this.useLayer = true;
        goto L20
    L12:
        r3 = false;
        goto L13
    L22:
        return;
    L5:
        r0 = false;
        goto L6
    }

    private final void configureLayoutDirection(LayoutDirection rtl) {
        if (this.layoutDirection == rtl) goto L6;
        applyLayoutDirection(rtl);
        this.layoutDirection = rtl;
        return;
    }

    protected boolean applyAlpha(float alpha) {
        return false;
    }

    protected boolean applyColorFilter(ColorFilter colorFilter) {
        return false;
    }

    protected boolean applyLayoutDirection(LayoutDirection layoutDirection) {
        return false;
    }

    /* JADX INFO: renamed from: draw-x_KDEd0$default, reason: not valid java name */
    public static /* synthetic */ void m5042drawx_KDEd0$default(Painter r6, DrawScope r7, long r8, float r10, ColorFilter r11, int r12, Object r13) {
        if (r13 != null) goto L12;
        if ((r12 & 2) == 0) goto L6;
        r10 = 1.0f;
    L6:
        float r4 = r10;
        if ((r12 & 4) == 0) goto L9;
        r11 = null;
    L9:
        r6.m5043drawx_KDEd0(r7, r8, r4, r11);
        return;
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
    }

    /* JADX INFO: renamed from: draw-x_KDEd0, reason: not valid java name */
    public final void m5043drawx_KDEd0(DrawScope $this$draw_u2dx_KDEd0, long size, float alpha, ColorFilter colorFilter) {
        configureAlpha(alpha);
        configureColorFilter(colorFilter);
        configureLayoutDirection($this$draw_u2dx_KDEd0.getLayoutDirection());
        long arg0$iv = $this$draw_u2dx_KDEd0.mo4917getSizeNHjbRc();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        int bits$iv$iv$iv2 = (int) (size >> 32);
        float right$iv = Float.intBitsToFloat(bits$iv$iv$iv) - Float.intBitsToFloat(bits$iv$iv$iv2);
        long arg0$iv2 = $this$draw_u2dx_KDEd0.mo4917getSizeNHjbRc();
        int bits$iv$iv$iv3 = (int) (arg0$iv2 & 4294967295L);
        int bits$iv$iv$iv4 = (int) (size & 4294967295L);
        float bottom$iv = Float.intBitsToFloat(bits$iv$iv$iv3) - Float.intBitsToFloat(bits$iv$iv$iv4);
        $this$draw_u2dx_KDEd0.getDrawContext().getTransform().inset(0.0f, 0.0f, right$iv, bottom$iv);
        if (alpha <= 0.0f) goto L30;
        int bits$iv$iv$iv5 = (int) (size >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv5) <= 0.0f) goto L30;
        float right$iv2 = right$iv;
        int bits$iv$iv$iv6 = (int) (size & 4294967295L);
    L23:
        th = th;
    L28:
        $this$draw_u2dx_KDEd0.getDrawContext().getTransform().inset(-0.0f, -0.0f, -right$iv2, -bottom$iv);
        throw th;
    L10:
        if (Float.intBitsToFloat(bits$iv$iv$iv6) > 0.0f) goto L12;
        right$iv = right$iv2;
        goto L30
    L12:
        if (this.useLayer == false) goto L20;
        long r9 = Offset.Companion.m4141getZeroF1C5BW0();     // Catch: Throwable -> L23
        int bits$iv$iv$iv7 = (int) (size >> 32);     // Catch: Throwable -> L23
        float width$iv = Float.intBitsToFloat(bits$iv$iv$iv7);     // Catch: Throwable -> L23
        long value$iv$iv = size & 4294967295L;     // Catch: Throwable -> L23
        int bits$iv$iv$iv8 = (int) value$iv$iv;     // Catch: Throwable -> L23
        float height$iv = Float.intBitsToFloat(bits$iv$iv$iv8);     // Catch: Throwable -> L23
        long v1$iv$iv = Float.floatToRawIntBits(width$iv);     // Catch: Throwable -> L23
        long v1$iv$iv2 = Float.floatToRawIntBits(height$iv);     // Catch: Throwable -> L23
        long v2$iv$iv = (v1$iv$iv << 32) | (v1$iv$iv2 & 4294967295L);     // Catch: Throwable -> L23
        Rect layerRect = RectKt.m4165Recttz77jQw(r9, Size.m4185constructorimpl(v2$iv$iv));     // Catch: Throwable -> L23
        Canvas canvas = $this$draw_u2dx_KDEd0.getDrawContext().getCanvas();     // Catch: Throwable -> L23
        Paint paint$iv = obtainPaint();     // Catch: Throwable -> L23
        canvas.saveLayer(layerRect, paint$iv);     // Catch: Throwable -> L17
        onDraw($this$draw_u2dx_KDEd0);     // Catch: Throwable -> L17
        canvas.restore();     // Catch: Throwable -> L23
        right$iv = right$iv2;
        goto L30
    L17:
        th = move-exception;
        canvas.restore();     // Catch: Throwable -> L23
        throw th;     // Catch: Throwable -> L23
    L20:
        onDraw($this$draw_u2dx_KDEd0);     // Catch: Throwable -> L23
        right$iv = right$iv2;
    L26:
        th = th;
        right$iv2 = right$iv;
    L30:
        $this$draw_u2dx_KDEd0.getDrawContext().getTransform().inset(-0.0f, -0.0f, -right$iv, -bottom$iv);
    }
}
