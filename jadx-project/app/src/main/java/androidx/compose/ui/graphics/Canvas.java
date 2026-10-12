package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: Canvas.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ<\u0010\n\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H&ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0003H&J0\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016JH\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H&J0\u0010#\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J*\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H&ø\u0001\u0000¢\u0006\u0004\b*\u0010+J*\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020(2\u0006\u0010!\u001a\u00020\"H&ø\u0001\u0000¢\u0006\u0004\b0\u00101JJ\u00102\u001a\u00020\u00032\u0006\u0010-\u001a\u00020.2\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002042\b\b\u0002\u00108\u001a\u0002062\u0006\u0010!\u001a\u00020\"H&ø\u0001\u0000¢\u0006\u0004\b9\u0010:J*\u0010;\u001a\u00020\u00032\u0006\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020(2\u0006\u0010!\u001a\u00020\"H&ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010!\u001a\u00020\"H\u0016J0\u0010@\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H&J\u0018\u0010A\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"H&J0\u0010B\u001a\u00020\u00032\u0006\u0010C\u001a\u00020D2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020(0F2\u0006\u0010!\u001a\u00020\"H&ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ*\u0010I\u001a\u00020\u00032\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020J2\u0006\u0010!\u001a\u00020\"H&ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\u0018\u0010M\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010!\u001a\u00020\"H\u0016J0\u0010M\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H&J@\u0010N\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010O\u001a\u00020\u00102\u0006\u0010P\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H&J*\u0010Q\u001a\u00020\u00032\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010!\u001a\u00020\"H&ø\u0001\u0000¢\u0006\u0004\bV\u0010WJ\b\u0010X\u001a\u00020\u0003H&J\b\u0010Y\u001a\u00020\u0003H&J\u0010\u0010Z\u001a\u00020\u00032\u0006\u0010[\u001a\u00020\u0010H&J\b\u0010\\\u001a\u00020\u0003H&J\u0018\u0010]\u001a\u00020\u00032\u0006\u0010^\u001a\u00020\f2\u0006\u0010!\u001a\u00020\"H&J\u001a\u0010_\u001a\u00020\u00032\u0006\u0010`\u001a\u00020\u00102\b\b\u0002\u0010a\u001a\u00020\u0010H&J\u0018\u0010b\u001a\u00020\u00032\u0006\u0010`\u001a\u00020\u00102\u0006\u0010a\u001a\u00020\u0010H&J\u0018\u0010c\u001a\u00020\u00032\u0006\u0010d\u001a\u00020\u00102\u0006\u0010e\u001a\u00020\u0010H\u0016J\u0018\u0010f\u001a\u00020\u00032\u0006\u0010g\u001a\u00020\u00102\u0006\u0010h\u001a\u00020\u0010H&ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006iÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/Canvas;", "", "clipPath", "", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipRect", "rect", "Landroidx/compose/ui/geometry/Rect;", "clipRect-mtrdD-E", "(Landroidx/compose/ui/geometry/Rect;I)V", "left", "", "top", "right", "bottom", "clipRect-N_I0leg", "(FFFFI)V", "concat", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "concat-58bKbWc", "([F)V", "disableZ", "drawArc", "startAngle", "sweepAngle", "useCenter", "", "paint", "Landroidx/compose/ui/graphics/Paint;", "drawArcRad", "startAngleRad", "sweepAngleRad", "drawCircle", "center", "Landroidx/compose/ui/geometry/Offset;", "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawOval", "drawPath", "drawPoints", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "points", "", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawRawPoints", "", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "drawRect", "drawRoundRect", "radiusX", "radiusY", "drawVertices", "vertices", "Landroidx/compose/ui/graphics/Vertices;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "enableZ", "restore", "rotate", "degrees", "save", "saveLayer", "bounds", "scale", "sx", "sy", "skew", "skewRad", "sxRad", "syRad", "translate", "dx", "dy", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Canvas {

    /* JADX INFO: compiled from: Canvas.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void scale$default(Canvas r0, float r1, float r2, int r3, Object r4) {
            Canvas.scale$default(r0, r1, r2, r3, r4);
        }

        @Deprecated
        public static void skewRad(Canvas $this, float sxRad, float syRad) {
            Canvas.access$skewRad$jd($this, sxRad, syRad);
        }

        @Deprecated
        /* JADX INFO: renamed from: clipRect-mtrdD-E, reason: not valid java name */
        public static void m4344clipRectmtrdDE(Canvas $this, Rect rect, int clipOp) {
            Canvas.m4336access$clipRectmtrdDE$jd($this, rect, clipOp);
        }

        /* JADX INFO: renamed from: clipRect-mtrdD-E$default, reason: not valid java name */
        public static /* synthetic */ void m4345clipRectmtrdDE$default(Canvas r0, Rect r1, int r2, int r3, Object r4) {
            Canvas.m4339clipRectmtrdDE$default(r0, r1, r2, r3, r4);
        }

        /* JADX INFO: renamed from: clipRect-N_I0leg$default, reason: not valid java name */
        public static /* synthetic */ void m4343clipRectN_I0leg$default(Canvas r0, float r1, float r2, float r3, float r4, int r5, int r6, Object r7) {
            Canvas.m4338clipRectN_I0leg$default(r0, r1, r2, r3, r4, r5, r6, r7);
        }

        /* JADX INFO: renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
        public static /* synthetic */ void m4342clipPathmtrdDE$default(Canvas r0, Path r1, int r2, int r3, Object r4) {
            Canvas.m4337clipPathmtrdDE$default(r0, r1, r2, r3, r4);
        }

        @Deprecated
        public static void drawRect(Canvas $this, Rect rect, Paint paint) {
            Canvas.access$drawRect$jd($this, rect, paint);
        }

        @Deprecated
        public static void drawOval(Canvas $this, Rect rect, Paint paint) {
            Canvas.access$drawOval$jd($this, rect, paint);
        }

        @Deprecated
        public static void drawArc(Canvas $this, Rect rect, float startAngle, float sweepAngle, boolean useCenter, Paint paint) {
            Canvas.access$drawArc$jd($this, rect, startAngle, sweepAngle, useCenter, paint);
        }

        @Deprecated
        public static void drawArcRad(Canvas $this, Rect rect, float startAngleRad, float sweepAngleRad, boolean useCenter, Paint paint) {
            Canvas.access$drawArcRad$jd($this, rect, startAngleRad, sweepAngleRad, useCenter, paint);
        }

        /* JADX INFO: renamed from: drawImageRect-HPBpro0$default, reason: not valid java name */
        public static /* synthetic */ void m4346drawImageRectHPBpro0$default(Canvas r0, ImageBitmap r1, long r2, long r4, long r6, long r8, Paint r10, int r11, Object r12) {
            Canvas.m4340drawImageRectHPBpro0$default(r0, r1, r2, r4, r6, r8, r10, r11, r12);
        }
    }

    /* JADX INFO: renamed from: clipPath-mtrdD-E */
    void mo4219clipPathmtrdDE(Path r1, int r2);

    /* JADX INFO: renamed from: clipRect-N_I0leg */
    void mo4220clipRectN_I0leg(float r1, float r2, float r3, float r4, int r5);

    /* JADX INFO: renamed from: concat-58bKbWc */
    void mo4221concat58bKbWc(float[] r1);

    void disableZ();

    void drawArc(float r1, float r2, float r3, float r4, float r5, float r6, boolean r7, Paint r8);

    /* JADX INFO: renamed from: drawCircle-9KIMszo */
    void mo4222drawCircle9KIMszo(long r1, float r3, Paint r4);

    /* JADX INFO: renamed from: drawImage-d-4ec7I */
    void mo4223drawImaged4ec7I(ImageBitmap r1, long r2, Paint r4);

    /* JADX INFO: renamed from: drawImageRect-HPBpro0 */
    void mo4224drawImageRectHPBpro0(ImageBitmap r1, long r2, long r4, long r6, long r8, Paint r10);

    /* JADX INFO: renamed from: drawLine-Wko1d7g */
    void mo4225drawLineWko1d7g(long r1, long r3, Paint r5);

    void drawOval(float r1, float r2, float r3, float r4, Paint r5);

    void drawPath(Path r1, Paint r2);

    /* JADX INFO: renamed from: drawPoints-O7TthRY */
    void mo4226drawPointsO7TthRY(int r1, List<Offset> r2, Paint r3);

    /* JADX INFO: renamed from: drawRawPoints-O7TthRY */
    void mo4227drawRawPointsO7TthRY(int r1, float[] r2, Paint r3);

    void drawRect(float r1, float r2, float r3, float r4, Paint r5);

    void drawRoundRect(float r1, float r2, float r3, float r4, float r5, float r6, Paint r7);

    /* JADX INFO: renamed from: drawVertices-TPEHhCM */
    void mo4228drawVerticesTPEHhCM(Vertices r1, int r2, Paint r3);

    void enableZ();

    void restore();

    void rotate(float r1);

    void save();

    void saveLayer(Rect r1, Paint r2);

    void scale(float r1, float r2);

    void skew(float r1, float r2);

    void translate(float r1, float r2);

    /* JADX INFO: renamed from: access$clipRect-mtrdD-E$jd, reason: not valid java name */
    static /* synthetic */ void m4336access$clipRectmtrdDE$jd(Canvas $this, Rect rect, int clipOp) {
        super.m4341clipRectmtrdDE(rect, clipOp);
    }

    static /* synthetic */ void access$drawArc$jd(Canvas $this, Rect rect, float startAngle, float sweepAngle, boolean useCenter, Paint paint) {
        super.drawArc(rect, startAngle, sweepAngle, useCenter, paint);
    }

    static /* synthetic */ void access$drawArcRad$jd(Canvas $this, Rect rect, float startAngleRad, float sweepAngleRad, boolean useCenter, Paint paint) {
        super.drawArcRad(rect, startAngleRad, sweepAngleRad, useCenter, paint);
    }

    static /* synthetic */ void access$drawOval$jd(Canvas $this, Rect rect, Paint paint) {
        super.drawOval(rect, paint);
    }

    static /* synthetic */ void access$drawRect$jd(Canvas $this, Rect rect, Paint paint) {
        super.drawRect(rect, paint);
    }

    static /* synthetic */ void access$skewRad$jd(Canvas $this, float sxRad, float syRad) {
        super.skewRad(sxRad, syRad);
    }

    static /* synthetic */ void scale$default(Canvas r0, float r1, float r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = r1;
    L6:
        r0.scale(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
    }

    default void skewRad(float sxRad, float syRad) {
        skew(DegreesKt.degrees(sxRad), DegreesKt.degrees(syRad));
    }

    /* JADX INFO: renamed from: clipRect-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m4339clipRectmtrdDE$default(Canvas r0, Rect r1, int r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = ClipOp.Companion.m4355getIntersectrtfAjoo();
    L6:
        r0.m4341clipRectmtrdDE(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
    }

    /* JADX INFO: renamed from: clipRect-mtrdD-E, reason: not valid java name */
    default void m4341clipRectmtrdDE(Rect rect, int clipOp) {
        mo4220clipRectN_I0leg(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), clipOp);
    }

    /* JADX INFO: renamed from: clipRect-N_I0leg$default, reason: not valid java name */
    static /* synthetic */ void m4338clipRectN_I0leg$default(Canvas r6, float r7, float r8, float r9, float r10, int r11, int r12, Object r13) {
        if (r13 != null) goto L10;
        if ((r12 & 16) == 0) goto L6;
        int r5 = ClipOp.Companion.m4355getIntersectrtfAjoo();
    L7:
        r6.mo4220clipRectN_I0leg(r7, r8, r9, r10, r5);
        return;
    L6:
        r5 = r11;
        goto L7
    L10:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
    }

    /* JADX INFO: renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m4337clipPathmtrdDE$default(Canvas r0, Path r1, int r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = ClipOp.Companion.m4355getIntersectrtfAjoo();
    L6:
        r0.mo4219clipPathmtrdDE(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
    }

    default void drawRect(Rect rect, Paint paint) {
        drawRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    default void drawOval(Rect rect, Paint paint) {
        drawOval(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    default void drawArc(Rect rect, float startAngle, float sweepAngle, boolean useCenter, Paint paint) {
        drawArc(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), startAngle, sweepAngle, useCenter, paint);
    }

    default void drawArcRad(Rect rect, float startAngleRad, float sweepAngleRad, boolean useCenter, Paint paint) {
        drawArc(rect, DegreesKt.degrees(startAngleRad), DegreesKt.degrees(sweepAngleRad), useCenter, paint);
    }

    /* JADX INFO: renamed from: drawImageRect-HPBpro0$default, reason: not valid java name */
    static /* synthetic */ void m4340drawImageRectHPBpro0$default(Canvas r13, ImageBitmap r14, long r15, long r17, long r19, long r21, Paint r23, int r24, Object r25) {
        if (r25 != null) goto L22;
        if ((r24 & 2) == 0) goto L6;
        long r4 = IntOffset.Companion.m7112getZeronOccac();
    L8:
        if ((r24 & 4) == 0) goto L10;
        int width$iv = r14.getWidth();
        int height$iv = r14.getHeight();
        long r6 = IntSize.m7139constructorimpl((((long) width$iv) << 32) | (((long) height$iv) & 4294967295L));
    L12:
        if ((r24 & 8) == 0) goto L14;
        long r8 = IntOffset.Companion.m7112getZeronOccac();
    L16:
        if ((r24 & 16) == 0) goto L18;
        long r10 = r6;
    L19:
        r13.mo4224drawImageRectHPBpro0(r14, r4, r6, r8, r10, r23);
        return;
    L18:
        r10 = r21;
        goto L19
    L14:
        r8 = r19;
        goto L16
    L10:
        r6 = r17;
        goto L12
    L6:
        r4 = r15;
        goto L8
    L22:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
    }
}
