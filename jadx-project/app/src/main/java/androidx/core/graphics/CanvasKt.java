package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Canvas.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\n2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001aF\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001aF\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001a0\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001aD\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001a&\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001aN\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001a:\u0010\u001c\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001a:\u0010\u001d\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b¨\u0006\u001e"}, d2 = {"withClip", "", "Landroid/graphics/Canvas;", "clipPath", "Landroid/graphics/Path;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "clipRect", "Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "left", "", "top", "right", "bottom", "", "withMatrix", "matrix", "Landroid/graphics/Matrix;", "withRotation", "degrees", "pivotX", "pivotY", "withSave", "withScale", "x", "y", "withSkew", "withTranslation", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CanvasKt {
    public static final void withSave(Canvas $this$withSave, Function1<? super Canvas, Unit> r4) {
        int checkpoint = $this$withSave.save();
        r4.invoke($this$withSave);     // Catch: Throwable -> L6
        $this$withSave.restoreToCount(checkpoint);
        return;
    L6:
        th = move-exception;
        $this$withSave.restoreToCount(checkpoint);
        throw th;
    }

    public static /* synthetic */ void withTranslation$default(Canvas $this$withTranslation_u24default, float x, float y, Function1 block, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        x = 0.0f;
    L6:
        if ((r5 & 2) == 0) goto L8;
        y = 0.0f;
    L8:
        int checkpoint = $this$withTranslation_u24default.save();
        $this$withTranslation_u24default.translate(x, y);
        block.invoke($this$withTranslation_u24default);     // Catch: Throwable -> L12
        $this$withTranslation_u24default.restoreToCount(checkpoint);
        return;
    L12:
        th = move-exception;
        $this$withTranslation_u24default.restoreToCount(checkpoint);
        throw th;
    }

    public static final void withTranslation(Canvas $this$withTranslation, float x, float y, Function1<? super Canvas, Unit> r6) {
        int checkpoint = $this$withTranslation.save();
        $this$withTranslation.translate(x, y);
        r6.invoke($this$withTranslation);     // Catch: Throwable -> L6
        $this$withTranslation.restoreToCount(checkpoint);
        return;
    L6:
        th = move-exception;
        $this$withTranslation.restoreToCount(checkpoint);
        throw th;
    }

    public static /* synthetic */ void withRotation$default(Canvas $this$withRotation_u24default, float degrees, float pivotX, float pivotY, Function1 block, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        degrees = 0.0f;
    L6:
        if ((r6 & 2) == 0) goto L9;
        pivotX = 0.0f;
    L9:
        if ((r6 & 4) == 0) goto L11;
        pivotY = 0.0f;
    L11:
        int checkpoint = $this$withRotation_u24default.save();
        $this$withRotation_u24default.rotate(degrees, pivotX, pivotY);
        block.invoke($this$withRotation_u24default);     // Catch: Throwable -> L15
        $this$withRotation_u24default.restoreToCount(checkpoint);
        return;
    L15:
        th = move-exception;
        $this$withRotation_u24default.restoreToCount(checkpoint);
        throw th;
    }

    public static final void withRotation(Canvas $this$withRotation, float degrees, float pivotX, float pivotY, Function1<? super Canvas, Unit> r7) {
        int checkpoint = $this$withRotation.save();
        $this$withRotation.rotate(degrees, pivotX, pivotY);
        r7.invoke($this$withRotation);     // Catch: Throwable -> L6
        $this$withRotation.restoreToCount(checkpoint);
        return;
    L6:
        th = move-exception;
        $this$withRotation.restoreToCount(checkpoint);
        throw th;
    }

    public static /* synthetic */ void withScale$default(Canvas $this$withScale_u24default, float x, float y, float pivotX, float pivotY, Function1 block, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        x = 1.0f;
    L6:
        if ((r7 & 2) == 0) goto L9;
        y = 1.0f;
    L9:
        if ((r7 & 4) == 0) goto L12;
        pivotX = 0.0f;
    L12:
        if ((r7 & 8) == 0) goto L14;
        pivotY = 0.0f;
    L14:
        int checkpoint = $this$withScale_u24default.save();
        $this$withScale_u24default.scale(x, y, pivotX, pivotY);
        block.invoke($this$withScale_u24default);     // Catch: Throwable -> L18
        $this$withScale_u24default.restoreToCount(checkpoint);
        return;
    L18:
        th = move-exception;
        $this$withScale_u24default.restoreToCount(checkpoint);
        throw th;
    }

    public static final void withScale(Canvas $this$withScale, float x, float y, float pivotX, float pivotY, Function1<? super Canvas, Unit> r8) {
        int checkpoint = $this$withScale.save();
        $this$withScale.scale(x, y, pivotX, pivotY);
        r8.invoke($this$withScale);     // Catch: Throwable -> L6
        $this$withScale.restoreToCount(checkpoint);
        return;
    L6:
        th = move-exception;
        $this$withScale.restoreToCount(checkpoint);
        throw th;
    }

    public static /* synthetic */ void withSkew$default(Canvas $this$withSkew_u24default, float x, float y, Function1 block, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        x = 0.0f;
    L6:
        if ((r5 & 2) == 0) goto L8;
        y = 0.0f;
    L8:
        int checkpoint = $this$withSkew_u24default.save();
        $this$withSkew_u24default.skew(x, y);
        block.invoke($this$withSkew_u24default);     // Catch: Throwable -> L12
        $this$withSkew_u24default.restoreToCount(checkpoint);
        return;
    L12:
        th = move-exception;
        $this$withSkew_u24default.restoreToCount(checkpoint);
        throw th;
    }

    public static final void withSkew(Canvas $this$withSkew, float x, float y, Function1<? super Canvas, Unit> r6) {
        int checkpoint = $this$withSkew.save();
        $this$withSkew.skew(x, y);
        r6.invoke($this$withSkew);     // Catch: Throwable -> L6
        $this$withSkew.restoreToCount(checkpoint);
        return;
    L6:
        th = move-exception;
        $this$withSkew.restoreToCount(checkpoint);
        throw th;
    }

    public static /* synthetic */ void withMatrix$default(Canvas $this$withMatrix_u24default, Matrix matrix, Function1 block, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L5;
        matrix = new Matrix();
    L5:
        int checkpoint = $this$withMatrix_u24default.save();
        $this$withMatrix_u24default.concat(matrix);
        block.invoke($this$withMatrix_u24default);     // Catch: Throwable -> L9
        $this$withMatrix_u24default.restoreToCount(checkpoint);
        return;
    L9:
        th = move-exception;
        $this$withMatrix_u24default.restoreToCount(checkpoint);
        throw th;
    }

    public static final void withMatrix(Canvas $this$withMatrix, Matrix matrix, Function1<? super Canvas, Unit> r5) {
        int checkpoint = $this$withMatrix.save();
        $this$withMatrix.concat(matrix);
        r5.invoke($this$withMatrix);     // Catch: Throwable -> L6
        $this$withMatrix.restoreToCount(checkpoint);
        return;
    L6:
        th = move-exception;
        $this$withMatrix.restoreToCount(checkpoint);
        throw th;
    }

    public static final void withClip(Canvas $this$withClip, Rect clipRect, Function1<? super Canvas, Unit> r5) {
        int checkpoint = $this$withClip.save();
        $this$withClip.clipRect(clipRect);
        r5.invoke($this$withClip);     // Catch: Throwable -> L6
        $this$withClip.restoreToCount(checkpoint);
        return;
    L6:
        th = move-exception;
        $this$withClip.restoreToCount(checkpoint);
        throw th;
    }

    public static final void withClip(Canvas $this$withClip, RectF clipRect, Function1<? super Canvas, Unit> r5) {
        int checkpoint = $this$withClip.save();
        $this$withClip.clipRect(clipRect);
        r5.invoke($this$withClip);     // Catch: Throwable -> L6
        $this$withClip.restoreToCount(checkpoint);
        return;
    L6:
        th = move-exception;
        $this$withClip.restoreToCount(checkpoint);
        throw th;
    }

    public static final void withClip(Canvas $this$withClip, int left, int top, int right, int bottom, Function1<? super Canvas, Unit> r8) {
        int checkpoint = $this$withClip.save();
        $this$withClip.clipRect(left, top, right, bottom);
        r8.invoke($this$withClip);     // Catch: Throwable -> L6
        $this$withClip.restoreToCount(checkpoint);
        return;
    L6:
        th = move-exception;
        $this$withClip.restoreToCount(checkpoint);
        throw th;
    }

    public static final void withClip(Canvas $this$withClip, float left, float top, float right, float bottom, Function1<? super Canvas, Unit> r8) {
        int checkpoint = $this$withClip.save();
        $this$withClip.clipRect(left, top, right, bottom);
        r8.invoke($this$withClip);     // Catch: Throwable -> L6
        $this$withClip.restoreToCount(checkpoint);
        return;
    L6:
        th = move-exception;
        $this$withClip.restoreToCount(checkpoint);
        throw th;
    }

    public static final void withClip(Canvas $this$withClip, Path clipPath, Function1<? super Canvas, Unit> r5) {
        int checkpoint = $this$withClip.save();
        $this$withClip.clipPath(clipPath);
        r5.invoke($this$withClip);     // Catch: Throwable -> L6
        $this$withClip.restoreToCount(checkpoint);
        return;
    L6:
        th = move-exception;
        $this$withClip.restoreToCount(checkpoint);
        throw th;
    }
}
