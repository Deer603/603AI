package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: PathParser.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002\u001aX\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u001a\u001a\u0010\u001a\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u0007\u001a\r\u0010\u001e\u001a\u00020\t*\u00020\tH\u0082\b\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u001f"}, d2 = {"EmptyArray", "", "getEmptyArray", "()[F", "arcToBezier", "", "p", "Landroidx/compose/ui/graphics/Path;", "cx", "", "cy", "a", "b", "e1x", "e1y", "theta", "start", "sweep", "drawArc", "x0", "y0", "x1", "y1", "isMoreThanHalf", "", "isPositiveArc", "toPath", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "target", "toRadians", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PathParserKt {
    private static final float[] EmptyArray = null;

    static {
        EmptyArray = new float[0];
    }

    public static final float[] getEmptyArray() {
        return EmptyArray;
    }

    public static /* synthetic */ Path toPath$default(List r0, Path r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = AndroidPath_androidKt.Path();
    L6:
        return toPath(r0, r1);
    }

    public static final Path toPath(List<? extends PathNode> r41, Path target) {
        Path r0 = target;
        int fillType = r0.mo4257getFillTypeRgk1Os();
        r0.rewind();
        r0.mo4259setFillTypeoQ8Xj4U(fillType);
        if (r41.isEmpty() == false) goto L5;
        PathNode r11 = PathNode.Close.INSTANCE;
    L6:
        List<? extends PathNode> r10 = r41;
        int r14 = r10.size();
        float ctrlX = 0.0f;
        float ctrlY = 0.0f;
        float segmentX = 0.0f;
        float segmentY = 0.0f;
        PathNode r24 = r11;
        int index$iv = 0;
        float currentX = 0.0f;
        float currentY = 0.0f;
    L7:
        if (index$iv >= r14) goto L84;
        Object item$iv = r10.get(index$iv);
        PathNode node = (PathNode) item$iv;
        if ((node instanceof PathNode.Close) == false) goto L12;
        float currentX2 = segmentX;
        float currentY2 = segmentY;
        float ctrlX2 = segmentX;
        float ctrlY2 = segmentY;
        r0.close();
        currentX = currentX2;
        currentY = currentY2;
        ctrlX = ctrlX2;
        ctrlY = ctrlY2;
        int fillType2 = fillType;
        List<? extends PathNode> r28 = r10;
        int index$iv2 = index$iv;
        PathNode node2 = node;
        int r29 = r14;
    L82:
        r24 = node2;
        index$iv = index$iv2 + 1;
        r0 = target;
        fillType = fillType2;
        r10 = r28;
        r14 = r29;
        goto L7
    L12:
        if ((node instanceof PathNode.RelativeMoveTo) == false) goto L15;
        currentX = currentX + ((PathNode.RelativeMoveTo) node).getDx();
        currentY = currentY + ((PathNode.RelativeMoveTo) node).getDy();
        r0.relativeMoveTo(((PathNode.RelativeMoveTo) node).getDx(), ((PathNode.RelativeMoveTo) node).getDy());
        segmentX = currentX;
        segmentY = currentY;
        fillType2 = fillType;
        r28 = r10;
        index$iv2 = index$iv;
        node2 = node;
        r29 = r14;
        goto L82
    L15:
        if ((node instanceof PathNode.MoveTo) == false) goto L18;
        float currentX3 = ((PathNode.MoveTo) node).getX();
        float currentY3 = ((PathNode.MoveTo) node).getY();
        r0.moveTo(((PathNode.MoveTo) node).getX(), ((PathNode.MoveTo) node).getY());
        currentX = currentX3;
        currentY = currentY3;
        segmentX = currentX3;
        segmentY = currentY3;
        fillType2 = fillType;
        r28 = r10;
        index$iv2 = index$iv;
        node2 = node;
        r29 = r14;
        goto L82
    L18:
        if ((node instanceof PathNode.RelativeLineTo) == false) goto L21;
        r0.relativeLineTo(((PathNode.RelativeLineTo) node).getDx(), ((PathNode.RelativeLineTo) node).getDy());
        currentX = currentX + ((PathNode.RelativeLineTo) node).getDx();
        currentY = currentY + ((PathNode.RelativeLineTo) node).getDy();
        fillType2 = fillType;
        r28 = r10;
        index$iv2 = index$iv;
        node2 = node;
        r29 = r14;
        goto L82
    L21:
        if ((node instanceof PathNode.LineTo) == false) goto L24;
        r0.lineTo(((PathNode.LineTo) node).getX(), ((PathNode.LineTo) node).getY());
        float currentX4 = ((PathNode.LineTo) node).getX();
        currentX = currentX4;
        currentY = ((PathNode.LineTo) node).getY();
        fillType2 = fillType;
        r28 = r10;
        index$iv2 = index$iv;
        node2 = node;
        r29 = r14;
        goto L82
    L24:
        if ((node instanceof PathNode.RelativeHorizontalTo) == false) goto L27;
        r0.relativeLineTo(((PathNode.RelativeHorizontalTo) node).getDx(), 0.0f);
        currentX = currentX + ((PathNode.RelativeHorizontalTo) node).getDx();
        fillType2 = fillType;
        r28 = r10;
        index$iv2 = index$iv;
        node2 = node;
        r29 = r14;
        goto L82
    L27:
        if ((node instanceof PathNode.HorizontalTo) == false) goto L30;
        r0.lineTo(((PathNode.HorizontalTo) node).getX(), currentY);
        currentX = ((PathNode.HorizontalTo) node).getX();
        fillType2 = fillType;
        r28 = r10;
        index$iv2 = index$iv;
        node2 = node;
        r29 = r14;
        goto L82
    L30:
        if ((node instanceof PathNode.RelativeVerticalTo) == false) goto L33;
        r0.relativeLineTo(0.0f, ((PathNode.RelativeVerticalTo) node).getDy());
        currentY = currentY + ((PathNode.RelativeVerticalTo) node).getDy();
        fillType2 = fillType;
        r28 = r10;
        index$iv2 = index$iv;
        node2 = node;
        r29 = r14;
        goto L82
    L33:
        if ((node instanceof PathNode.VerticalTo) == false) goto L36;
        r0.lineTo(currentX, ((PathNode.VerticalTo) node).getY());
        currentY = ((PathNode.VerticalTo) node).getY();
        fillType2 = fillType;
        r28 = r10;
        index$iv2 = index$iv;
        node2 = node;
        r29 = r14;
        goto L82
    L36:
        if ((node instanceof PathNode.RelativeCurveTo) == false) goto L39;
        r0.relativeCubicTo(((PathNode.RelativeCurveTo) node).getDx1(), ((PathNode.RelativeCurveTo) node).getDy1(), ((PathNode.RelativeCurveTo) node).getDx2(), ((PathNode.RelativeCurveTo) node).getDy2(), ((PathNode.RelativeCurveTo) node).getDx3(), ((PathNode.RelativeCurveTo) node).getDy3());
        float ctrlX3 = ((PathNode.RelativeCurveTo) node).getDx2() + currentX;
        float ctrlY3 = ((PathNode.RelativeCurveTo) node).getDy2() + currentY;
        currentX = currentX + ((PathNode.RelativeCurveTo) node).getDx3();
        currentY = currentY + ((PathNode.RelativeCurveTo) node).getDy3();
        ctrlX = ctrlX3;
        ctrlY = ctrlY3;
        fillType2 = fillType;
        r28 = r10;
        index$iv2 = index$iv;
        node2 = node;
        r29 = r14;
        goto L82
    L39:
        if ((node instanceof PathNode.CurveTo) == false) goto L42;
        target.cubicTo(((PathNode.CurveTo) node).getX1(), ((PathNode.CurveTo) node).getY1(), ((PathNode.CurveTo) node).getX2(), ((PathNode.CurveTo) node).getY2(), ((PathNode.CurveTo) node).getX3(), ((PathNode.CurveTo) node).getY3());
        float ctrlX4 = ((PathNode.CurveTo) node).getX2();
        float ctrlY4 = ((PathNode.CurveTo) node).getY2();
        float currentX5 = ((PathNode.CurveTo) node).getX3();
        ctrlX = ctrlX4;
        ctrlY = ctrlY4;
        currentX = currentX5;
        currentY = ((PathNode.CurveTo) node).getY3();
        fillType2 = fillType;
        r28 = r10;
        index$iv2 = index$iv;
        node2 = node;
        r29 = r14;
        goto L82
    L42:
        if ((node instanceof PathNode.RelativeReflectiveCurveTo) == false) goto L49;
        if (r24.isCurve() == false) goto L46;
        float reflectiveCtrlX = currentX - ctrlX;
        float reflectiveCtrlY = currentY - ctrlY;
        float reflectiveCtrlX2 = reflectiveCtrlX;
    L47:
        target.relativeCubicTo(reflectiveCtrlX2, reflectiveCtrlY, ((PathNode.RelativeReflectiveCurveTo) node).getDx1(), ((PathNode.RelativeReflectiveCurveTo) node).getDy1(), ((PathNode.RelativeReflectiveCurveTo) node).getDx2(), ((PathNode.RelativeReflectiveCurveTo) node).getDy2());
        float ctrlX5 = ((PathNode.RelativeReflectiveCurveTo) node).getDx1() + currentX;
        float ctrlY5 = ((PathNode.RelativeReflectiveCurveTo) node).getDy1() + currentY;
        currentX = currentX + ((PathNode.RelativeReflectiveCurveTo) node).getDx2();
        currentY = currentY + ((PathNode.RelativeReflectiveCurveTo) node).getDy2();
        ctrlX = ctrlX5;
        ctrlY = ctrlY5;
        fillType2 = fillType;
        r28 = r10;
        index$iv2 = index$iv;
        node2 = node;
        r29 = r14;
        goto L82
    L46:
        reflectiveCtrlY = 0.0f;
        reflectiveCtrlX2 = 0.0f;
        goto L47
    L49:
        if ((node instanceof PathNode.ReflectiveCurveTo) == false) goto L56;
        if (r24.isCurve() == false) goto L53;
        float reflectiveCtrlX3 = (2.0f * currentX) - ctrlX;
        float reflectiveCtrlY2 = (2.0f * currentY) - ctrlY;
        float reflectiveCtrlX4 = reflectiveCtrlX3;
    L54:
        target.cubicTo(reflectiveCtrlX4, reflectiveCtrlY2, ((PathNode.ReflectiveCurveTo) node).getX1(), ((PathNode.ReflectiveCurveTo) node).getY1(), ((PathNode.ReflectiveCurveTo) node).getX2(), ((PathNode.ReflectiveCurveTo) node).getY2());
        float ctrlX6 = ((PathNode.ReflectiveCurveTo) node).getX1();
        float ctrlY6 = ((PathNode.ReflectiveCurveTo) node).getY1();
        float currentX6 = ((PathNode.ReflectiveCurveTo) node).getX2();
        ctrlX = ctrlX6;
        ctrlY = ctrlY6;
        currentX = currentX6;
        currentY = ((PathNode.ReflectiveCurveTo) node).getY2();
        fillType2 = fillType;
        r28 = r10;
        index$iv2 = index$iv;
        node2 = node;
        r29 = r14;
        goto L82
    L53:
        float reflectiveCtrlX5 = currentX;
        reflectiveCtrlY2 = currentY;
        reflectiveCtrlX4 = reflectiveCtrlX5;
        goto L54
    L56:
        if ((node instanceof PathNode.RelativeQuadTo) == false) goto L59;
        target.relativeQuadraticTo(((PathNode.RelativeQuadTo) node).getDx1(), ((PathNode.RelativeQuadTo) node).getDy1(), ((PathNode.RelativeQuadTo) node).getDx2(), ((PathNode.RelativeQuadTo) node).getDy2());
        float ctrlX7 = ((PathNode.RelativeQuadTo) node).getDx1() + currentX;
        float ctrlY7 = ((PathNode.RelativeQuadTo) node).getDy1() + currentY;
        currentX = currentX + ((PathNode.RelativeQuadTo) node).getDx2();
        currentY = currentY + ((PathNode.RelativeQuadTo) node).getDy2();
        ctrlX = ctrlX7;
        ctrlY = ctrlY7;
        fillType2 = fillType;
        r28 = r10;
        index$iv2 = index$iv;
        node2 = node;
        r29 = r14;
        goto L82
    L59:
        if ((node instanceof PathNode.QuadTo) == false) goto L62;
        target.quadraticTo(((PathNode.QuadTo) node).getX1(), ((PathNode.QuadTo) node).getY1(), ((PathNode.QuadTo) node).getX2(), ((PathNode.QuadTo) node).getY2());
        float ctrlX8 = ((PathNode.QuadTo) node).getX1();
        float ctrlY8 = ((PathNode.QuadTo) node).getY1();
        float currentX7 = ((PathNode.QuadTo) node).getX2();
        ctrlX = ctrlX8;
        ctrlY = ctrlY8;
        currentX = currentX7;
        currentY = ((PathNode.QuadTo) node).getY2();
        fillType2 = fillType;
        r28 = r10;
        index$iv2 = index$iv;
        node2 = node;
        r29 = r14;
        goto L82
    L62:
        if ((node instanceof PathNode.RelativeReflectiveQuadTo) == false) goto L69;
        if (r24.isQuad() == false) goto L66;
        float reflectiveCtrlX6 = currentX - ctrlX;
        float reflectiveCtrlY3 = currentY - ctrlY;
    L67:
        target.relativeQuadraticTo(reflectiveCtrlX6, reflectiveCtrlY3, ((PathNode.RelativeReflectiveQuadTo) node).getDx(), ((PathNode.RelativeReflectiveQuadTo) node).getDy());
        float ctrlX9 = currentX + reflectiveCtrlX6;
        float ctrlY9 = currentY + reflectiveCtrlY3;
        currentX = currentX + ((PathNode.RelativeReflectiveQuadTo) node).getDx();
        currentY = currentY + ((PathNode.RelativeReflectiveQuadTo) node).getDy();
        ctrlX = ctrlX9;
        ctrlY = ctrlY9;
        fillType2 = fillType;
        r28 = r10;
        index$iv2 = index$iv;
        node2 = node;
        r29 = r14;
        goto L82
    L66:
        reflectiveCtrlX6 = 0.0f;
        reflectiveCtrlY3 = 0.0f;
        goto L67
    L69:
        if ((node instanceof PathNode.ReflectiveQuadTo) == false) goto L76;
        if (r24.isQuad() == false) goto L73;
        float reflectiveCtrlX7 = (2.0f * currentX) - ctrlX;
        float reflectiveCtrlY4 = (2.0f * currentY) - ctrlY;
    L74:
        target.quadraticTo(reflectiveCtrlX7, reflectiveCtrlY4, ((PathNode.ReflectiveQuadTo) node).getX(), ((PathNode.ReflectiveQuadTo) node).getY());
        float ctrlX10 = reflectiveCtrlX7;
        float ctrlY10 = reflectiveCtrlY4;
        float currentX8 = ((PathNode.ReflectiveQuadTo) node).getX();
        ctrlX = ctrlX10;
        ctrlY = ctrlY10;
        currentX = currentX8;
        currentY = ((PathNode.ReflectiveQuadTo) node).getY();
        fillType2 = fillType;
        r28 = r10;
        index$iv2 = index$iv;
        node2 = node;
        r29 = r14;
        goto L82
    L73:
        reflectiveCtrlX7 = currentX;
        reflectiveCtrlY4 = currentY;
        goto L74
    L76:
        if ((node instanceof PathNode.RelativeArcTo) == false) goto L78;
        float arcStartX = ((PathNode.RelativeArcTo) node).getArcStartDx() + currentX;
        float arcStartY = ((PathNode.RelativeArcTo) node).getArcStartDy() + currentY;
        fillType2 = fillType;
        node2 = node;
        r28 = r10;
        r29 = r14;
        index$iv2 = index$iv;
        drawArc(target, currentX, currentY, arcStartX, arcStartY, ((PathNode.RelativeArcTo) node).getHorizontalEllipseRadius(), ((PathNode.RelativeArcTo) node).getVerticalEllipseRadius(), ((PathNode.RelativeArcTo) node).getTheta(), ((PathNode.RelativeArcTo) node).isMoreThanHalf(), ((PathNode.RelativeArcTo) node).isPositiveArc());
        currentX = arcStartX;
        currentY = arcStartY;
        ctrlX = arcStartX;
        ctrlY = arcStartY;
        goto L82
    L78:
        fillType2 = fillType;
        float currentX9 = currentX;
        float currentY4 = currentY;
        r28 = r10;
        index$iv2 = index$iv;
        r29 = r14;
        if ((node instanceof PathNode.ArcTo) == false) goto L81;
        node2 = node;
        drawArc(target, currentX9, currentY4, ((PathNode.ArcTo) node).getArcStartX(), ((PathNode.ArcTo) node).getArcStartY(), ((PathNode.ArcTo) node).getHorizontalEllipseRadius(), ((PathNode.ArcTo) node).getVerticalEllipseRadius(), ((PathNode.ArcTo) node).getTheta(), ((PathNode.ArcTo) node2).isMoreThanHalf(), ((PathNode.ArcTo) node2).isPositiveArc());
        float currentX10 = ((PathNode.ArcTo) node2).getArcStartX();
        float currentY5 = ((PathNode.ArcTo) node2).getArcStartY();
        currentX = currentX10;
        currentY = currentY5;
        ctrlX = currentX10;
        ctrlY = currentY5;
        goto L82
    L81:
        node2 = node;
        currentY = currentY4;
        currentX = currentX9;
        goto L82
    L84:
        return target;
    L5:
        r11 = r41.get(0);
        goto L6
    }

    private static final void drawArc(Path p, double x0, double y0, double x1, double y1, double a, double b, double theta, boolean isMoreThanHalf, boolean isPositiveArc) {
        double thetaD = (theta / 180.0d) * 3.141592653589793d;
        double cosTheta = Math.cos(thetaD);
        double sinTheta = Math.sin(thetaD);
        double x0p = ((x0 * cosTheta) + (y0 * sinTheta)) / a;
        double y0p = (((-x0) * sinTheta) + (y0 * cosTheta)) / b;
        double x1p = ((x1 * cosTheta) + (y1 * sinTheta)) / a;
        double y1p = (((-x1) * sinTheta) + (y1 * cosTheta)) / b;
        double dx = x0p - x1p;
        double dy = y0p - y1p;
        double xm = (x0p + x1p) / 2.0d;
        double ym = (y0p + y1p) / 2.0d;
        double dsq = (dx * dx) + (dy * dy);
        boolean r7 = true;
        if (dsq != 0.0d) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L8;
        return;
    L8:
        double disc = (1.0d / dsq) - 0.25d;
        if (disc >= 0.0d) goto L12;
        float adjust = (float) (Math.sqrt(dsq) / 1.99999d);
        drawArc(p, x0, y0, x1, y1, a * ((double) adjust), b * ((double) adjust), theta, isMoreThanHalf, isPositiveArc);
        return;
    L12:
        double s = Math.sqrt(disc);
        double sdx = s * dx;
        double sdy = s * dy;
        if (isMoreThanHalf != isPositiveArc) goto L15;
        double cx = xm - sdy;
        double cy = ym + sdx;
    L16:
        double eta0 = Math.atan2(y0p - cy, x0p - cx);
        double eta1 = Math.atan2(y1p - cy, x1p - cx);
        double sweep = eta1 - eta0;
        if (sweep >= 0.0d) goto L20;
        r7 = false;
    L20:
        if (isPositiveArc != r7) goto L22;
    L25:
        double cx2 = cx * a;
        double cy2 = cy * b;
        arcToBezier(p, (cx2 * cosTheta) - (cy2 * sinTheta), (cx2 * sinTheta) + (cy2 * cosTheta), a, b, x0, y0, thetaD, eta0, sweep);
        return;
    L22:
        if (sweep <= 0.0d) goto L24;
        sweep = sweep - 6.283185307179586d;
        goto L25
    L24:
        sweep = sweep + 6.283185307179586d;
        goto L25
    L15:
        cx = xm + sdy;
        cy = ym - sdx;
        goto L16
    L5:
        r0 = false;
        goto L6
    }

    private static final void arcToBezier(Path p, double cx, double cy, double a, double b, double e1x, double e1y, double theta, double start, double sweep) {
        double eta1 = a;
        double eta1y = e1y;
        int numSegments = (int) Math.ceil(Math.abs((sweep * 4.0d) / 3.141592653589793d));
        double eta2 = start;
        double cosTheta = Math.cos(theta);
        double sinTheta = Math.sin(theta);
        double cosEta1 = Math.cos(eta2);
        double sinEta1 = Math.sin(eta2);
        double ep1x = (((-eta1) * cosTheta) * sinEta1) - ((b * sinTheta) * cosEta1);
        double eta1x = e1x;
        double eta1x2 = -eta1;
        double ep1y = ((eta1x2 * sinTheta) * sinEta1) + ((b * cosTheta) * cosEta1);
        double ep1y2 = ep1y;
        double ep1y3 = numSegments;
        double anglePerSegment = sweep / ep1y3;
        int i = 0;
    L3:
        if (i >= numSegments) goto L5;
        double eta3 = eta2 + anglePerSegment;
        double sinEta2 = Math.sin(eta3);
        double cosEta2 = Math.cos(eta3);
        int i2 = i;
        double e2x = (cx + ((eta1 * cosTheta) * cosEta2)) - ((b * sinTheta) * sinEta2);
        double eta1y2 = eta1y;
        eta1y = (cy + ((eta1 * sinTheta) * cosEta2)) + ((b * cosTheta) * sinEta2);
        double ep1x2 = ep1x;
        double ep1x3 = -eta1;
        double ep2x = ((ep1x3 * cosTheta) * sinEta2) - ((b * sinTheta) * cosEta2);
        double ep2y = (((-eta1) * sinTheta) * sinEta2) + ((b * cosTheta) * cosEta2);
        double tanDiff2 = Math.tan((eta3 - eta2) / 2.0d);
        double alpha = (Math.sin(eta3 - eta2) * (Math.sqrt(4.0d + ((tanDiff2 * 3.0d) * tanDiff2)) - 1.0d)) / 3.0d;
        double q1x = eta1x + (alpha * ep1x2);
        int numSegments2 = numSegments;
        double q2x = e2x - (alpha * ep2x);
        double q2y = eta1y - (alpha * ep2y);
        p.cubicTo((float) q1x, (float) (eta1y2 + (alpha * ep1y2)), (float) q2x, (float) q2y, (float) e2x, (float) eta1y);
        eta1x = e2x;
        ep1y2 = ep2y;
        i = i2 + 1;
        eta2 = eta3;
        ep1x = ep2x;
        numSegments = numSegments2;
        cosTheta = cosTheta;
        eta1 = a;
        goto L3
    }

    private static final double toRadians(double $this$toRadians) {
        return ($this$toRadians / 180.0d) * 3.141592653589793d;
    }
}
