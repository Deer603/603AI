package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntOffset;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidCanvas.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J:\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\b\u0010#\u001a\u00020\u000fH\u0016JH\u0010$\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J*\u0010+\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*H\u0016ø\u0001\u0000¢\u0006\u0004\b/\u00100J*\u00101\u001a\u00020\u000f2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020-2\u0006\u0010)\u001a\u00020*H\u0016ø\u0001\u0000¢\u0006\u0004\b5\u00106JB\u00107\u001a\u00020\u000f2\u0006\u00102\u001a\u0002032\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u0002092\u0006\u0010=\u001a\u00020;2\u0006\u0010)\u001a\u00020*H\u0016ø\u0001\u0000¢\u0006\u0004\b>\u0010?J*\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020-2\u0006\u0010B\u001a\u00020-2\u0006\u0010)\u001a\u00020*H\u0016ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ&\u0010E\u001a\u00020\u000f2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020-0G2\u0006\u0010)\u001a\u00020*2\u0006\u0010H\u001a\u00020IH\u0002J0\u0010J\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*H\u0016J\u0018\u0010K\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010)\u001a\u00020*H\u0016J0\u0010L\u001a\u00020\u000f2\u0006\u0010M\u001a\u00020N2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020-0G2\u0006\u0010)\u001a\u00020*H\u0016ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\u001e\u0010L\u001a\u00020\u000f2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020-0G2\u0006\u0010)\u001a\u00020*H\u0002J \u0010Q\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020R2\u0006\u0010)\u001a\u00020*2\u0006\u0010H\u001a\u00020IH\u0002J*\u0010S\u001a\u00020\u000f2\u0006\u0010M\u001a\u00020N2\u0006\u0010F\u001a\u00020R2\u0006\u0010)\u001a\u00020*H\u0016ø\u0001\u0000¢\u0006\u0004\bT\u0010UJ \u0010S\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020R2\u0006\u0010)\u001a\u00020*2\u0006\u0010H\u001a\u00020IH\u0002J0\u0010V\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*H\u0016J@\u0010W\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010X\u001a\u00020\u00182\u0006\u0010Y\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*H\u0016J*\u0010Z\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^2\u0006\u0010)\u001a\u00020*H\u0016ø\u0001\u0000¢\u0006\u0004\b_\u0010`J\b\u0010a\u001a\u00020\u000fH\u0016J\b\u0010b\u001a\u00020\u000fH\u0016J\u0010\u0010c\u001a\u00020\u000f2\u0006\u0010d\u001a\u00020\u0018H\u0016J\b\u0010e\u001a\u00020\u000fH\u0016J\u0018\u0010f\u001a\u00020\u000f2\u0006\u0010g\u001a\u00020h2\u0006\u0010)\u001a\u00020*H\u0016J\u0018\u0010i\u001a\u00020\u000f2\u0006\u0010j\u001a\u00020\u00182\u0006\u0010k\u001a\u00020\u0018H\u0016J\u0018\u0010l\u001a\u00020\u000f2\u0006\u0010j\u001a\u00020\u00182\u0006\u0010k\u001a\u00020\u0018H\u0016J\u0018\u0010m\u001a\u00020\u000f2\u0006\u0010n\u001a\u00020\u00182\u0006\u0010o\u001a\u00020\u0018H\u0016J\u0014\u0010p\u001a\u00020q*\u00020\u0013ø\u0001\u0000¢\u0006\u0004\br\u0010sR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0005\u001a\u00060\u0006j\u0002`\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006t"}, d2 = {"Landroidx/compose/ui/graphics/AndroidCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "()V", "dstRect", "Landroid/graphics/Rect;", "internalCanvas", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "getInternalCanvas$annotations", "getInternalCanvas", "()Landroid/graphics/Canvas;", "setInternalCanvas", "(Landroid/graphics/Canvas;)V", "srcRect", "clipPath", "", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipRect", "left", "", "top", "right", "bottom", "clipRect-N_I0leg", "(FFFFI)V", "concat", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "concat-58bKbWc", "([F)V", "disableZ", "drawArc", "startAngle", "sweepAngle", "useCenter", "", "paint", "Landroidx/compose/ui/graphics/Paint;", "drawCircle", "center", "Landroidx/compose/ui/geometry/Offset;", "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawLines", "points", "", "stepBy", "", "drawOval", "drawPath", "drawPoints", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawRawLines", "", "drawRawPoints", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "drawRect", "drawRoundRect", "radiusX", "radiusY", "drawVertices", "vertices", "Landroidx/compose/ui/graphics/Vertices;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "enableZ", "restore", "rotate", "degrees", "save", "saveLayer", "bounds", "Landroidx/compose/ui/geometry/Rect;", "scale", "sx", "sy", "skew", "translate", "dx", "dy", "toRegionOp", "Landroid/graphics/Region$Op;", "toRegionOp--7u2Bmg", "(I)Landroid/graphics/Region$Op;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidCanvas implements Canvas {
    private Rect dstRect;
    private android.graphics.Canvas internalCanvas;
    private Rect srcRect;

    public static /* synthetic */ void getInternalCanvas$annotations() {
    }

    public AndroidCanvas() {
        this.internalCanvas = AndroidCanvas_androidKt.access$getEmptyCanvas$p();
    }

    public final android.graphics.Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    public final void setInternalCanvas(android.graphics.Canvas r1) {
        this.internalCanvas = r1;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void save() {
        this.internalCanvas.save();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void restore() {
        this.internalCanvas.restore();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void saveLayer(androidx.compose.ui.geometry.Rect bounds, Paint paint) {
        this.internalCanvas.saveLayer(bounds.getLeft(), bounds.getTop(), bounds.getRight(), bounds.getBottom(), paint.asFrameworkPaint(), 31);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void translate(float dx, float dy) {
        this.internalCanvas.translate(dx, dy);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void scale(float sx, float sy) {
        this.internalCanvas.scale(sx, sy);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void rotate(float degrees) {
        this.internalCanvas.rotate(degrees);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void skew(float sx, float sy) {
        this.internalCanvas.skew(sx, sy);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: concat-58bKbWc, reason: not valid java name */
    public void mo4221concat58bKbWc(float[] matrix) {
        if (MatrixKt.m4621isIdentity58bKbWc(matrix) == true) goto L6;
        android.graphics.Matrix frameworkMatrix = new android.graphics.Matrix();
        AndroidMatrixConversions_androidKt.m4236setFromEL8BTi8(frameworkMatrix, matrix);
        this.internalCanvas.concat(frameworkMatrix);
        return;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: clipRect-N_I0leg, reason: not valid java name */
    public void mo4220clipRectN_I0leg(float left, float top, float right, float bottom, int clipOp) {
        this.internalCanvas.clipRect(left, top, right, bottom, m4229toRegionOp7u2Bmg(clipOp));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: clipPath-mtrdD-E, reason: not valid java name */
    public void mo4219clipPathmtrdDE(Path path, int clipOp) {
        android.graphics.Canvas r0 = this.internalCanvas;
        if ((path instanceof AndroidPath) == false) goto L7;
        r0.clipPath(((AndroidPath) path).getInternalPath(), m4229toRegionOp7u2Bmg(clipOp));
        return;
    L7:
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* JADX INFO: renamed from: toRegionOp--7u2Bmg, reason: not valid java name */
    public final Region.Op m4229toRegionOp7u2Bmg(int $this$toRegionOp_u2d_u2d7u2Bmg) {
        if (ClipOp.m4350equalsimpl0($this$toRegionOp_u2d_u2d7u2Bmg, ClipOp.Companion.m4354getDifferencertfAjoo()) == false) goto L6;
        return Region.Op.DIFFERENCE;
    L6:
        return Region.Op.INTERSECT;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawLine-Wko1d7g, reason: not valid java name */
    public void mo4225drawLineWko1d7g(long p1, long p2, Paint paint) {
        int bits$iv$iv$iv = (int) (p1 >> 32);
        int bits$iv$iv$iv2 = (int) (p1 & 4294967295L);
        int bits$iv$iv$iv3 = (int) (p2 >> 32);
        int bits$iv$iv$iv4 = (int) (4294967295L & p2);
        this.internalCanvas.drawLine(Float.intBitsToFloat(bits$iv$iv$iv), Float.intBitsToFloat(bits$iv$iv$iv2), Float.intBitsToFloat(bits$iv$iv$iv3), Float.intBitsToFloat(bits$iv$iv$iv4), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRect(float left, float top, float right, float bottom, Paint paint) {
        this.internalCanvas.drawRect(left, top, right, bottom, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRoundRect(float left, float top, float right, float bottom, float radiusX, float radiusY, Paint paint) {
        this.internalCanvas.drawRoundRect(left, top, right, bottom, radiusX, radiusY, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawOval(float left, float top, float right, float bottom, Paint paint) {
        this.internalCanvas.drawOval(left, top, right, bottom, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawCircle-9KIMszo, reason: not valid java name */
    public void mo4222drawCircle9KIMszo(long center, float radius, Paint paint) {
        int bits$iv$iv$iv = (int) (center >> 32);
        int bits$iv$iv$iv2 = (int) (4294967295L & center);
        this.internalCanvas.drawCircle(Float.intBitsToFloat(bits$iv$iv$iv), Float.intBitsToFloat(bits$iv$iv$iv2), radius, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArc(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, Paint paint) {
        this.internalCanvas.drawArc(left, top, right, bottom, startAngle, sweepAngle, useCenter, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        android.graphics.Canvas r0 = this.internalCanvas;
        if ((path instanceof AndroidPath) == false) goto L7;
        r0.drawPath(((AndroidPath) path).getInternalPath(), paint.asFrameworkPaint());
        return;
    L7:
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawImage-d-4ec7I, reason: not valid java name */
    public void mo4223drawImaged4ec7I(ImageBitmap image, long topLeftOffset, Paint paint) {
        int bits$iv$iv$iv = (int) (topLeftOffset >> 32);
        int bits$iv$iv$iv2 = (int) (4294967295L & topLeftOffset);
        this.internalCanvas.drawBitmap(AndroidImageBitmap_androidKt.asAndroidBitmap(image), Float.intBitsToFloat(bits$iv$iv$iv), Float.intBitsToFloat(bits$iv$iv$iv2), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawImageRect-HPBpro0, reason: not valid java name */
    public void mo4224drawImageRectHPBpro0(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, Paint paint) {
        if (this.srcRect != null) goto L5;
        this.srcRect = new Rect();
        this.dstRect = new Rect();
    L5:
        android.graphics.Canvas r1 = this.internalCanvas;
        Bitmap r2 = AndroidImageBitmap_androidKt.asAndroidBitmap(image);
        Rect $this$drawImageRect_HPBpro0_u24lambda_u240 = this.srcRect;
        Intrinsics.checkNotNull($this$drawImageRect_HPBpro0_u24lambda_u240);
        $this$drawImageRect_HPBpro0_u24lambda_u240.left = IntOffset.m7101getXimpl(srcOffset);
        $this$drawImageRect_HPBpro0_u24lambda_u240.top = IntOffset.m7102getYimpl(srcOffset);
        $this$drawImageRect_HPBpro0_u24lambda_u240.right = IntOffset.m7101getXimpl(srcOffset) + ((int) (srcSize >> 32));
        $this$drawImageRect_HPBpro0_u24lambda_u240.bottom = IntOffset.m7102getYimpl(srcOffset) + ((int) (srcSize & 4294967295L));
        Unit r4 = Unit.INSTANCE;
        Rect $this$drawImageRect_HPBpro0_u24lambda_u241 = this.dstRect;
        Intrinsics.checkNotNull($this$drawImageRect_HPBpro0_u24lambda_u241);
        $this$drawImageRect_HPBpro0_u24lambda_u241.left = IntOffset.m7101getXimpl(dstOffset);
        $this$drawImageRect_HPBpro0_u24lambda_u241.top = IntOffset.m7102getYimpl(dstOffset);
        $this$drawImageRect_HPBpro0_u24lambda_u241.right = IntOffset.m7101getXimpl(dstOffset) + ((int) (dstSize >> 32));
        $this$drawImageRect_HPBpro0_u24lambda_u241.bottom = IntOffset.m7102getYimpl(dstOffset) + ((int) (dstSize & 4294967295L));
        Unit r5 = Unit.INSTANCE;
        r1.drawBitmap(r2, $this$drawImageRect_HPBpro0_u24lambda_u240, $this$drawImageRect_HPBpro0_u24lambda_u241, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawPoints-O7TthRY, reason: not valid java name */
    public void mo4226drawPointsO7TthRY(int pointMode, List<Offset> r3, Paint paint) {
        if (PointMode.m4667equalsimpl0(pointMode, PointMode.Companion.m4671getLinesr_lszbg()) == false) goto L6;
        drawLines(r3, paint, 2);
        return;
    L6:
        if (PointMode.m4667equalsimpl0(pointMode, PointMode.Companion.m4673getPolygonr_lszbg()) == false) goto L9;
        drawLines(r3, paint, 1);
        return;
    L9:
        if (PointMode.m4667equalsimpl0(pointMode, PointMode.Companion.m4672getPointsr_lszbg()) == false) goto L14;
        drawPoints(r3, paint);
        return;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void enableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, true);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void disableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, false);
    }

    private final void drawPoints(List<Offset> r20, Paint paint) {
        List<Offset> r0 = r20;
        int $i$f$fastForEach = 0;
        int index$iv = 0;
        int r3 = r0.size();
    L3:
        if (index$iv >= r3) goto L6;
        Object item$iv = r0.get(index$iv);
        long point = ((Offset) item$iv).m4135unboximpl();
        int bits$iv$iv$iv = (int) (point >> 32);
        List<Offset> r17 = r0;
        int $i$f$fastForEach2 = $i$f$fastForEach;
        int bits$iv$iv$iv2 = (int) (point & 4294967295L);
        this.internalCanvas.drawPoint(Float.intBitsToFloat(bits$iv$iv$iv), Float.intBitsToFloat(bits$iv$iv$iv2), paint.asFrameworkPaint());
        index$iv = index$iv + 1;
        r0 = r17;
        $i$f$fastForEach = $i$f$fastForEach2;
        goto L3
    }

    private final void drawLines(List<Offset> r20, Paint paint, int stepBy) {
        List<Offset> r0 = r20;
        if (r0.size() < 2) goto L10;
        android.graphics.Paint frameworkPaint = paint.asFrameworkPaint();
        int i = 0;
    L6:
        if (i >= (r0.size() - 1)) goto L12;
        long p1 = r0.get(i).m4135unboximpl();
        long p2 = r0.get(i + 1).m4135unboximpl();
        android.graphics.Canvas r3 = this.internalCanvas;
        int bits$iv$iv$iv = (int) (p1 >> 32);
        float r14 = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (p1 & 4294967295L);
        float r13 = Float.intBitsToFloat(bits$iv$iv$iv2);
        int bits$iv$iv$iv3 = (int) (p2 >> 32);
        float r1 = Float.intBitsToFloat(bits$iv$iv$iv3);
        int bits$iv$iv$iv4 = (int) (p2 & 4294967295L);
        r3.drawLine(r14, r13, r1, Float.intBitsToFloat(bits$iv$iv$iv4), frameworkPaint);
        i = i + stepBy;
        r0 = r20;
        goto L6
    L12:
        return;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawRawPoints-O7TthRY, reason: not valid java name */
    public void mo4227drawRawPointsO7TthRY(int pointMode, float[] points, Paint paint) {
        if ((points.length % 2) != 0) goto L15;
        if (PointMode.m4667equalsimpl0(pointMode, PointMode.Companion.m4671getLinesr_lszbg()) == false) goto L8;
        drawRawLines(points, paint, 2);
        return;
    L8:
        if (PointMode.m4667equalsimpl0(pointMode, PointMode.Companion.m4673getPolygonr_lszbg()) == false) goto L11;
        drawRawLines(points, paint, 1);
        return;
    L11:
        if (PointMode.m4667equalsimpl0(pointMode, PointMode.Companion.m4672getPointsr_lszbg()) == false) goto L18;
        drawRawPoints(points, paint, 2);
        return;
    L18:
        return;
    L15:
        throw new IllegalArgumentException("points must have an even number of values");
    }

    private final void drawRawPoints(float[] points, Paint paint, int stepBy) {
        if ((points.length % 2) != 0) goto L8;
        android.graphics.Paint frameworkPaint = paint.asFrameworkPaint();
        int i = 0;
    L6:
        if (i >= (points.length - 1)) goto L10;
        float x = points[i];
        float y = points[i + 1];
        this.internalCanvas.drawPoint(x, y, frameworkPaint);
        i = i + stepBy;
        goto L6
    L10:
        return;
    }

    private final void drawRawLines(float[] points, Paint paint, int stepBy) {
        if (points.length >= 4) goto L5;
        return;
    L5:
        if ((points.length % 2) != 0) goto L12;
        android.graphics.Paint frameworkPaint = paint.asFrameworkPaint();
        int i = 0;
    L8:
        if (i >= (points.length - 3)) goto L13;
        float x1 = points[i];
        float y1 = points[i + 1];
        float x2 = points[i + 2];
        float y2 = points[i + 3];
        this.internalCanvas.drawLine(x1, y1, x2, y2, frameworkPaint);
        i = i + (stepBy * 2);
        goto L8
    L13:
        return;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawVertices-TPEHhCM, reason: not valid java name */
    public void mo4228drawVerticesTPEHhCM(Vertices vertices, int blendMode, Paint paint) {
        this.internalCanvas.drawVertices(AndroidVertexMode_androidKt.m4272toAndroidVertexModeJOOmi9M(vertices.m4768getVertexModec2xauaI()), vertices.getPositions().length, vertices.getPositions(), 0, vertices.getTextureCoordinates(), 0, vertices.getColors(), 0, vertices.getIndices(), 0, vertices.getIndices().length, paint.asFrameworkPaint());
    }
}
