package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Canvas.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\"\u0010\u0004\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007\u001a&\u0010\n\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007\u001a,\u0010\f\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007\u001a\u001b\u0010\u000f\u001a\u00020\u0005*\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0086\b\u001a+\u0010\u0012\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0086\b¨\u0006\u0017"}, d2 = {"Canvas", "Landroidx/compose/ui/graphics/Canvas;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "rotate", "", "degrees", "", "pivotX", "pivotY", "rotateRad", "radians", "scale", "sx", "sy", "withSave", "block", "Lkotlin/Function0;", "withSaveLayer", "bounds", "Landroidx/compose/ui/geometry/Rect;", "paint", "Landroidx/compose/ui/graphics/Paint;", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CanvasKt {
    public static final Canvas Canvas(ImageBitmap image) {
        return AndroidCanvas_androidKt.ActualCanvas(image);
    }

    public static final void withSave(Canvas $this$withSave, Function0<Unit> r3) {
        $this$withSave.save();     // Catch: Throwable -> L6
        r3.invoke();     // Catch: Throwable -> L6
        $this$withSave.restore();
        return;
    L6:
        th = move-exception;
        $this$withSave.restore();
        throw th;
    }

    public static final void withSaveLayer(Canvas $this$withSaveLayer, Rect bounds, Paint paint, Function0<Unit> r5) {
        $this$withSaveLayer.saveLayer(bounds, paint);     // Catch: Throwable -> L6
        r5.invoke();     // Catch: Throwable -> L6
        $this$withSaveLayer.restore();
        return;
    L6:
        th = move-exception;
        $this$withSaveLayer.restore();
        throw th;
    }

    public static final void rotate(Canvas $this$rotate, float degrees, float pivotX, float pivotY) {
        if (degrees != 0.0f) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L8;
        return;
    L8:
        $this$rotate.translate(pivotX, pivotY);
        $this$rotate.rotate(degrees);
        $this$rotate.translate(-pivotX, -pivotY);
        return;
    L5:
        r0 = false;
        goto L6
    }

    public static /* synthetic */ void rotateRad$default(Canvas r1, float r2, float r3, float r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r3 = 0.0f;
    L6:
        if ((r5 & 4) == 0) goto L8;
        r4 = 0.0f;
    L8:
        rotateRad(r1, r2, r3, r4);
    }

    public static final void rotateRad(Canvas $this$rotateRad, float radians, float pivotX, float pivotY) {
        rotate($this$rotateRad, DegreesKt.degrees(radians), pivotX, pivotY);
    }

    public static /* synthetic */ void scale$default(Canvas r0, float r1, float r2, float r3, float r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L5;
        r2 = r1;
    L5:
        scale(r0, r1, r2, r3, r4);
    }

    public static final void scale(Canvas $this$scale, float sx, float sy, float pivotX, float pivotY) {
        boolean r2 = true;
        if (sx != 1.0f) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == true) goto L8;
    L13:
        $this$scale.translate(pivotX, pivotY);
        $this$scale.scale(sx, sy);
        $this$scale.translate(-pivotX, -pivotY);
        return;
    L8:
        if (sy == 1.0f) goto L11;
        r2 = false;
    L11:
        if (r2 == false) goto L13;
        return;
    L5:
        r1 = false;
        goto L6
    }
}
