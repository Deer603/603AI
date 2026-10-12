package androidx.compose.ui.graphics;

import android.graphics.RectF;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidPath.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0016J \u0010!\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001fH\u0016J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010$\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&H\u0016J\"\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020*H\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u001dH\u0016J\u0018\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u000201H\u0016J\u0018\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u0002012\u0006\u0010%\u001a\u00020&H\u0016J(\u00102\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u00103\u001a\u00020\u000fH\u0016J\b\u00104\u001a\u00020\u001bH\u0016J8\u00105\u001a\u00020\u001b2\u0006\u00106\u001a\u00020\u001f2\u0006\u00107\u001a\u00020\u001f2\u0006\u00108\u001a\u00020\u001f2\u0006\u00109\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\u001fH\u0016J\b\u0010<\u001a\u00020\u001dH\u0016J\u0018\u0010=\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020\u001f2\u0006\u0010?\u001a\u00020\u001fH\u0016J\u0018\u0010@\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020\u001f2\u0006\u0010?\u001a\u00020\u001fH\u0016J*\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u00012\u0006\u0010C\u001a\u00020\u00012\u0006\u0010D\u001a\u00020EH\u0016ø\u0001\u0000¢\u0006\u0004\bF\u0010GJ(\u0010H\u001a\u00020\u001b2\u0006\u00106\u001a\u00020\u001f2\u0006\u00107\u001a\u00020\u001f2\u0006\u00108\u001a\u00020\u001f2\u0006\u00109\u001a\u00020\u001fH\u0016J(\u0010I\u001a\u00020\u001b2\u0006\u00106\u001a\u00020\u001f2\u0006\u00107\u001a\u00020\u001f2\u0006\u00108\u001a\u00020\u001f2\u0006\u00109\u001a\u00020\u001fH\u0016J8\u0010J\u001a\u00020\u001b2\u0006\u0010K\u001a\u00020\u001f2\u0006\u0010L\u001a\u00020\u001f2\u0006\u0010M\u001a\u00020\u001f2\u0006\u0010N\u001a\u00020\u001f2\u0006\u0010O\u001a\u00020\u001f2\u0006\u0010P\u001a\u00020\u001fH\u0016J\u0018\u0010Q\u001a\u00020\u001b2\u0006\u0010R\u001a\u00020\u001f2\u0006\u0010S\u001a\u00020\u001fH\u0016J\u0018\u0010T\u001a\u00020\u001b2\u0006\u0010R\u001a\u00020\u001f2\u0006\u0010S\u001a\u00020\u001fH\u0016J(\u0010U\u001a\u00020\u001b2\u0006\u0010K\u001a\u00020\u001f2\u0006\u0010L\u001a\u00020\u001f2\u0006\u0010M\u001a\u00020\u001f2\u0006\u0010N\u001a\u00020\u001fH\u0016J(\u0010V\u001a\u00020\u001b2\u0006\u0010K\u001a\u00020\u001f2\u0006\u0010L\u001a\u00020\u001f2\u0006\u0010M\u001a\u00020\u001f2\u0006\u0010N\u001a\u00020\u001fH\u0016J\b\u0010W\u001a\u00020\u001bH\u0016J\b\u0010X\u001a\u00020\u001bH\u0016J\u001a\u0010Y\u001a\u00020\u001b2\u0006\u0010Z\u001a\u00020[H\u0016ø\u0001\u0000¢\u0006\u0004\b\\\u0010]J\u001a\u0010^\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020*H\u0016ø\u0001\u0000¢\u0006\u0004\b_\u0010`J\u0010\u0010a\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u001dH\u0002R*\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006b"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPath;", "Landroidx/compose/ui/graphics/Path;", "internalPath", "Landroid/graphics/Path;", "(Landroid/graphics/Path;)V", "value", "Landroidx/compose/ui/graphics/PathFillType;", "fillType", "getFillType-Rg-k1Os", "()I", "setFillType-oQ8Xj4U", "(I)V", "getInternalPath", "()Landroid/graphics/Path;", "isConvex", "", "isConvex$annotations", "()V", "()Z", "isEmpty", "mMatrix", "Landroid/graphics/Matrix;", "radii", "", "rectF", "Landroid/graphics/RectF;", "addArc", "", "oval", "Landroidx/compose/ui/geometry/Rect;", "startAngleDegrees", "", "sweepAngleDegrees", "addArcRad", "startAngleRadians", "sweepAngleRadians", "addOval", "direction", "Landroidx/compose/ui/graphics/Path$Direction;", "addPath", "path", "offset", "Landroidx/compose/ui/geometry/Offset;", "addPath-Uv8p0NA", "(Landroidx/compose/ui/graphics/Path;J)V", "addRect", "rect", "addRoundRect", "roundRect", "Landroidx/compose/ui/geometry/RoundRect;", "arcTo", "forceMoveTo", "close", "cubicTo", "x1", "y1", "x2", "y2", "x3", "y3", "getBounds", "lineTo", "x", "y", "moveTo", "op", "path1", "path2", "operation", "Landroidx/compose/ui/graphics/PathOperation;", "op-N5in7k0", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "quadraticBezierTo", "quadraticTo", "relativeCubicTo", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "relativeLineTo", "dx", "dy", "relativeMoveTo", "relativeQuadraticBezierTo", "relativeQuadraticTo", "reset", "rewind", "transform", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "transform-58bKbWc", "([F)V", "translate", "translate-k-4lQ0M", "(J)V", "validateRectangle", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidPath implements Path {
    private final android.graphics.Path internalPath;
    private android.graphics.Matrix mMatrix;
    private float[] radii;
    private RectF rectF;

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidPath() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void isConvex$annotations() {
    }

    public AndroidPath(android.graphics.Path internalPath) {
        this.internalPath = internalPath;
    }

    public /* synthetic */ AndroidPath(android.graphics.Path r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = new android.graphics.Path();
    L5:
        this(r1);
    }

    public final android.graphics.Path getInternalPath() {
        return this.internalPath;
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: getFillType-Rg-k1Os, reason: not valid java name */
    public int mo4257getFillTypeRgk1Os() {
        if (this.internalPath.getFillType() != android.graphics.Path.FillType.EVEN_ODD) goto L6;
        return PathFillType.Companion.m4648getEvenOddRgk1Os();
    L6:
        return PathFillType.Companion.m4649getNonZeroRgk1Os();
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: setFillType-oQ8Xj4U, reason: not valid java name */
    public void mo4259setFillTypeoQ8Xj4U(int value) {
        android.graphics.Path r0 = this.internalPath;
        if (PathFillType.m4644equalsimpl0(value, PathFillType.Companion.m4648getEvenOddRgk1Os()) == false) goto L5;
        android.graphics.Path.FillType r1 = android.graphics.Path.FillType.EVEN_ODD;
    L6:
        r0.setFillType(r1);
        return;
    L5:
        r1 = android.graphics.Path.FillType.WINDING;
        goto L6
    }

    @Override // androidx.compose.ui.graphics.Path
    public void moveTo(float x, float y) {
        this.internalPath.moveTo(x, y);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeMoveTo(float dx, float dy) {
        this.internalPath.rMoveTo(dx, dy);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void lineTo(float x, float y) {
        this.internalPath.lineTo(x, y);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeLineTo(float dx, float dy) {
        this.internalPath.rLineTo(dx, dy);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void quadraticBezierTo(float x1, float y1, float x2, float y2) {
        this.internalPath.quadTo(x1, y1, x2, y2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void quadraticTo(float x1, float y1, float x2, float y2) {
        this.internalPath.quadTo(x1, y1, x2, y2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeQuadraticBezierTo(float dx1, float dy1, float dx2, float dy2) {
        this.internalPath.rQuadTo(dx1, dy1, dx2, dy2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeQuadraticTo(float dx1, float dy1, float dx2, float dy2) {
        this.internalPath.rQuadTo(dx1, dy1, dx2, dy2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void cubicTo(float x1, float y1, float x2, float y2, float x3, float y3) {
        this.internalPath.cubicTo(x1, y1, x2, y2, x3, y3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeCubicTo(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3) {
        this.internalPath.rCubicTo(dx1, dy1, dx2, dy2, dx3, dy3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void arcTo(Rect rect, float startAngleDegrees, float sweepAngleDegrees, boolean forceMoveTo) {
        float left = rect.getLeft();
        float top = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        if (this.rectF != null) goto L5;
        this.rectF = new RectF();
    L5:
        RectF r4 = this.rectF;
        Intrinsics.checkNotNull(r4);
        r4.set(left, top, right, bottom);
        android.graphics.Path r5 = this.internalPath;
        RectF r6 = this.rectF;
        Intrinsics.checkNotNull(r6);
        r5.arcTo(r6, startAngleDegrees, sweepAngleDegrees, forceMoveTo);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRect(Rect rect) {
        addRect(rect, Path.Direction.CounterClockwise);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRect(Rect rect, Path.Direction direction) {
        validateRectangle(rect);
        if (this.rectF != null) goto L5;
        this.rectF = new RectF();
    L5:
        RectF r0 = this.rectF;
        Intrinsics.checkNotNull(r0);
        r0.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        android.graphics.Path r1 = this.internalPath;
        RectF r2 = this.rectF;
        Intrinsics.checkNotNull(r2);
        r1.addRect(r2, AndroidPath_androidKt.access$toPlatformPathDirection(direction));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addOval(Rect oval) {
        addOval(oval, Path.Direction.CounterClockwise);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addOval(Rect oval, Path.Direction direction) {
        if (this.rectF != null) goto L5;
        this.rectF = new RectF();
    L5:
        RectF r0 = this.rectF;
        Intrinsics.checkNotNull(r0);
        r0.set(oval.getLeft(), oval.getTop(), oval.getRight(), oval.getBottom());
        android.graphics.Path r1 = this.internalPath;
        RectF r2 = this.rectF;
        Intrinsics.checkNotNull(r2);
        r1.addOval(r2, AndroidPath_androidKt.access$toPlatformPathDirection(direction));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRoundRect(RoundRect roundRect) {
        addRoundRect(roundRect, Path.Direction.CounterClockwise);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRoundRect(RoundRect roundRect, Path.Direction direction) {
        if (this.rectF != null) goto L5;
        this.rectF = new RectF();
    L5:
        RectF r0 = this.rectF;
        Intrinsics.checkNotNull(r0);
        r0.set(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
        if (this.radii != null) goto L8;
        this.radii = new float[8];
    L8:
        float[] $this$addRoundRect_u24lambda_u240 = this.radii;
        Intrinsics.checkNotNull($this$addRoundRect_u24lambda_u240);
        long arg0$iv = roundRect.m4175getTopLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        $this$addRoundRect_u24lambda_u240[0] = Float.intBitsToFloat(bits$iv$iv$iv);
        long arg0$iv2 = roundRect.m4175getTopLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv2 = (int) (arg0$iv2 & 4294967295L);
        $this$addRoundRect_u24lambda_u240[1] = Float.intBitsToFloat(bits$iv$iv$iv2);
        long arg0$iv3 = roundRect.m4176getTopRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv3 = (int) (arg0$iv3 >> 32);
        $this$addRoundRect_u24lambda_u240[2] = Float.intBitsToFloat(bits$iv$iv$iv3);
        long arg0$iv4 = roundRect.m4176getTopRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv4 = (int) (arg0$iv4 & 4294967295L);
        $this$addRoundRect_u24lambda_u240[3] = Float.intBitsToFloat(bits$iv$iv$iv4);
        long arg0$iv5 = roundRect.m4174getBottomRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv5 = (int) (arg0$iv5 >> 32);
        $this$addRoundRect_u24lambda_u240[4] = Float.intBitsToFloat(bits$iv$iv$iv5);
        long arg0$iv6 = roundRect.m4174getBottomRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv6 = (int) (arg0$iv6 & 4294967295L);
        $this$addRoundRect_u24lambda_u240[5] = Float.intBitsToFloat(bits$iv$iv$iv6);
        long arg0$iv7 = roundRect.m4173getBottomLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv7 = (int) (arg0$iv7 >> 32);
        $this$addRoundRect_u24lambda_u240[6] = Float.intBitsToFloat(bits$iv$iv$iv7);
        long arg0$iv8 = roundRect.m4173getBottomLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv8 = (int) (arg0$iv8 & 4294967295L);
        $this$addRoundRect_u24lambda_u240[7] = Float.intBitsToFloat(bits$iv$iv$iv8);
        android.graphics.Path r1 = this.internalPath;
        RectF r2 = this.rectF;
        Intrinsics.checkNotNull(r2);
        float[] r3 = this.radii;
        Intrinsics.checkNotNull(r3);
        r1.addRoundRect(r2, r3, AndroidPath_androidKt.access$toPlatformPathDirection(direction));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addArcRad(Rect oval, float startAngleRadians, float sweepAngleRadians) {
        addArc(oval, DegreesKt.degrees(startAngleRadians), DegreesKt.degrees(sweepAngleRadians));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addArc(Rect oval, float startAngleDegrees, float sweepAngleDegrees) {
        validateRectangle(oval);
        if (this.rectF != null) goto L5;
        this.rectF = new RectF();
    L5:
        RectF r0 = this.rectF;
        Intrinsics.checkNotNull(r0);
        r0.set(oval.getLeft(), oval.getTop(), oval.getRight(), oval.getBottom());
        android.graphics.Path r1 = this.internalPath;
        RectF r2 = this.rectF;
        Intrinsics.checkNotNull(r2);
        r1.addArc(r2, startAngleDegrees, sweepAngleDegrees);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: addPath-Uv8p0NA, reason: not valid java name */
    public void mo4256addPathUv8p0NA(Path path, long offset) {
        android.graphics.Path r0 = this.internalPath;
        if ((path instanceof AndroidPath) == false) goto L7;
        int bits$iv$iv$iv = (int) (offset >> 32);
        int bits$iv$iv$iv2 = (int) (4294967295L & offset);
        r0.addPath(((AndroidPath) path).getInternalPath(), Float.intBitsToFloat(bits$iv$iv$iv), Float.intBitsToFloat(bits$iv$iv$iv2));
        return;
    L7:
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Path
    public void close() {
        this.internalPath.close();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void reset() {
        this.internalPath.reset();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void rewind() {
        this.internalPath.rewind();
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: translate-k-4lQ0M, reason: not valid java name */
    public void mo4261translatek4lQ0M(long offset) {
        if (this.mMatrix != null) goto L5;
        this.mMatrix = new android.graphics.Matrix();
    L6:
        android.graphics.Matrix r0 = this.mMatrix;
        Intrinsics.checkNotNull(r0);
        int bits$iv$iv$iv = (int) (offset >> 32);
        int bits$iv$iv$iv2 = (int) (4294967295L & offset);
        r0.setTranslate(Float.intBitsToFloat(bits$iv$iv$iv), Float.intBitsToFloat(bits$iv$iv$iv2));
        android.graphics.Path r1 = this.internalPath;
        android.graphics.Matrix r2 = this.mMatrix;
        Intrinsics.checkNotNull(r2);
        r1.transform(r2);
        return;
    L5:
        android.graphics.Matrix r3 = this.mMatrix;
        Intrinsics.checkNotNull(r3);
        r3.reset();
        goto L6
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: transform-58bKbWc, reason: not valid java name */
    public void mo4260transform58bKbWc(float[] matrix) {
        if (this.mMatrix != null) goto L5;
        this.mMatrix = new android.graphics.Matrix();
    L5:
        android.graphics.Matrix r0 = this.mMatrix;
        Intrinsics.checkNotNull(r0);
        AndroidMatrixConversions_androidKt.m4236setFromEL8BTi8(r0, matrix);
        android.graphics.Path r1 = this.internalPath;
        android.graphics.Matrix r2 = this.mMatrix;
        Intrinsics.checkNotNull(r2);
        r1.transform(r2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public Rect getBounds() {
        if (this.rectF != null) goto L5;
        this.rectF = new RectF();
    L5:
        RectF $this$getBounds_u24lambda_u241 = this.rectF;
        Intrinsics.checkNotNull($this$getBounds_u24lambda_u241);
        this.internalPath.computeBounds($this$getBounds_u24lambda_u241, true);
        return new Rect($this$getBounds_u24lambda_u241.left, $this$getBounds_u24lambda_u241.top, $this$getBounds_u24lambda_u241.right, $this$getBounds_u24lambda_u241.bottom);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: op-N5in7k0, reason: not valid java name */
    public boolean mo4258opN5in7k0(Path path1, Path path2, int operation) {
        if (PathOperation.m4654equalsimpl0(operation, PathOperation.Companion.m4658getDifferenceb3I0S0c()) == false) goto L6;
        android.graphics.Path.Op op = android.graphics.Path.Op.DIFFERENCE;
    L15:
        android.graphics.Path r1 = this.internalPath;
        if ((path1 instanceof AndroidPath) == false) goto L24;
        android.graphics.Path r4 = ((AndroidPath) path1).getInternalPath();
        if ((path2 instanceof AndroidPath) == false) goto L22;
        return r1.op(r4, ((AndroidPath) path2).getInternalPath(), op);
    L22:
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    L24:
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    L6:
        if (PathOperation.m4654equalsimpl0(operation, PathOperation.Companion.m4659getIntersectb3I0S0c()) == false) goto L9;
        op = android.graphics.Path.Op.INTERSECT;
        goto L15
    L9:
        if (PathOperation.m4654equalsimpl0(operation, PathOperation.Companion.m4660getReverseDifferenceb3I0S0c()) == false) goto L12;
        op = android.graphics.Path.Op.REVERSE_DIFFERENCE;
        goto L15
    L12:
        if (PathOperation.m4654equalsimpl0(operation, PathOperation.Companion.m4661getUnionb3I0S0c()) == false) goto L14;
        op = android.graphics.Path.Op.UNION;
        goto L15
    L14:
        op = android.graphics.Path.Op.XOR;
        goto L15
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean isConvex() {
        return this.internalPath.isConvex();
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean isEmpty() {
        return this.internalPath.isEmpty();
    }

    private final void validateRectangle(Rect rect) {
        if (Float.isNaN(rect.getLeft()) == false) goto L5;
    L10:
        AndroidPath_androidKt.throwIllegalStateException("Invalid rectangle, make sure no value is NaN");
        return;
    L5:
        if (Float.isNaN(rect.getTop()) == true) goto L10;
        if (Float.isNaN(rect.getRight()) == true) goto L10;
        if (Float.isNaN(rect.getBottom()) == true) goto L10;
    }
}
