package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class PathParser {
    private static final String LOGTAG = "PathParser";

    private static class ExtractFloatResult {
        int mEndPosition;
        boolean mEndWithNegOrDot;

        ExtractFloatResult() {
        }
    }

    public static class PathDataNode {
        private final float[] mParams;
        private char mType;

        static /* synthetic */ char access$000(PathDataNode x0) {
            return x0.mType;
        }

        static /* synthetic */ char access$002(PathDataNode x0, char x1) {
            x0.mType = x1;
            return x1;
        }

        static /* synthetic */ float[] access$100(PathDataNode x0) {
            return x0.mParams;
        }

        static /* synthetic */ void access$200(Path x0, float[] x1, char x2, char x3, float[] x4) {
            addCommand(x0, x1, x2, x3, x4);
        }

        public char getType() {
            return this.mType;
        }

        public float[] getParams() {
            return this.mParams;
        }

        PathDataNode(char type, float[] params) {
            this.mType = type;
            this.mParams = params;
        }

        PathDataNode(PathDataNode n) {
            this.mType = n.mType;
            this.mParams = PathParser.copyOfRange(n.mParams, 0, n.mParams.length);
        }

        @Deprecated
        public static void nodesToPath(PathDataNode[] node, Path path) {
            PathParser.nodesToPath(node, path);
        }

        public void interpolatePathDataNode(PathDataNode nodeFrom, PathDataNode nodeTo, float fraction) {
            this.mType = nodeFrom.mType;
            int i = 0;
        L4:
            if (i >= nodeFrom.mParams.length) goto L6;
            this.mParams[i] = (nodeFrom.mParams[i] * (1.0f - fraction)) + (nodeTo.mParams[i] * fraction);
            i = i + 1;
            goto L4
        }

        private static void addCommand(Path r27, float[] r28, char r29, char r30, float[] r31) {
            Path r0 = r27;
            boolean r11 = false;
            float r2 = r28[0];
            boolean r12 = true;
            float r3 = r28[1];
            char r13 = 2;
            float r4 = r28[2];
            float r5 = r28[3];
            float r6 = r28[4];
            float r7 = r28[5];
            switch(r30) {
                case 65: goto L10;
                case 67: goto L9;
                case 72: goto L8;
                case 76: goto L7;
                case 77: goto L7;
                case 81: goto L6;
                case 83: goto L6;
                case 84: goto L7;
                case 86: goto L8;
                case 90: goto L5;
                case 97: goto L10;
                case 99: goto L9;
                case 104: goto L8;
                case 108: goto L7;
                case 109: goto L7;
                case 113: goto L6;
                case 115: goto L6;
                case 116: goto L7;
                case 118: goto L8;
                case 122: goto L5;
                default: goto L4;
            };
        L4:
            int r17 = 2;
        L11:
            int r8 = 0;
            float r9 = r2;
            float r18 = r3;
            float r19 = r4;
            float r20 = r5;
            float r21 = r6;
            float r22 = r7;
            char r10 = r29;
        L13:
            if (r8 >= r31.length) goto L86;
            boolean r23 = r11;
            boolean r24 = r12;
            char r26 = r13;
            switch(r30) {
                case 65: goto L76;
                case 67: goto L75;
                case 72: goto L74;
                case 76: goto L73;
                case 77: goto L69;
                case 81: goto L68;
                case 83: goto L59;
                case 84: goto L52;
                case 86: goto L51;
                case 97: goto L42;
                case 99: goto L41;
                case 104: goto L40;
                case 108: goto L39;
                case 109: goto L35;
                case 113: goto L34;
                case 115: goto L25;
                case 116: goto L18;
                case 118: goto L17;
                default: goto L16;
            };
        L16:
            float r14 = r18;
            int r110 = r8;
            float r1 = r14;
        L85:
            r10 = r30;
            r8 = r110 + r17;
            r0 = r27;
            r18 = r1;
            r11 = r23;
            r12 = r24;
            r13 = r26;
            goto L13
        L17:
            r0.rLineTo(0.0f, r31[r8 + 0]);
            r1 = r18 + r31[r8 + 0];
            r110 = r8;
            goto L85
        L18:
            float r15 = 0.0f;
            float r16 = 0.0f;
            if (r10 == 'q') goto L23;
            if (r10 == 't') goto L23;
            if (r10 == 'Q') goto L23;
            if (r10 == 'T') goto L23;
        L24:
            r0.rQuadTo(r15, r16, r31[r8 + 0], r31[r8 + 1]);
            float r25 = r9 + r15;
            r9 = r9 + r31[r8 + 0];
            r19 = r25;
            r20 = r18 + r16;
            r1 = r18 + r31[r8 + 1];
            r110 = r8;
        L23:
            r15 = r9 - r19;
            r16 = r18 - r20;
            goto L24
        L25:
            float r32 = 0.0f;
            if (r10 == 'c') goto L32;
            if (r10 == 's') goto L32;
            if (r10 == 'C') goto L32;
            if (r10 == 'S') goto L32;
            float r33 = 0.0f;
        L33:
            r0.rCubicTo(r32, r33, r31[r8 + 0], r31[r8 + 1], r31[r8 + 2], r31[r8 + 3]);
            float r34 = r31[r8 + 0] + r9;
            float r35 = r18 + r31[r8 + 1];
            r9 = r9 + r31[r8 + 2];
            r19 = r34;
            r20 = r35;
            r1 = r18 + r31[r8 + 3];
            r110 = r8;
        L32:
            r32 = r9 - r19;
            r33 = r18 - r20;
            goto L33
        L34:
            r0.rQuadTo(r31[r8 + 0], r31[r8 + 1], r31[r8 + 2], r31[r8 + 3]);
            float r36 = r31[r8 + 0] + r9;
            float r37 = r18 + r31[r8 + 1];
            r9 = r9 + r31[r8 + 2];
            r19 = r36;
            r20 = r37;
            r1 = r18 + r31[r8 + 3];
            r110 = r8;
            goto L85
        L35:
            r9 = r9 + r31[r8 + 0];
            float r111 = r18 + r31[r8 + 1];
            if (r8 <= 0) goto L38;
            r0.rLineTo(r31[r8 + 0], r31[r8 + 1]);
            r1 = r111;
            r110 = r8;
            goto L85
        L38:
            r0.rMoveTo(r31[r8 + 0], r31[r8 + 1]);
            r21 = r9;
            r22 = r111;
            r1 = r111;
            r110 = r8;
            goto L85
        L39:
            r0.rLineTo(r31[r8 + 0], r31[r8 + 1]);
            r9 = r9 + r31[r8 + 0];
            r1 = r18 + r31[r8 + 1];
            r110 = r8;
            goto L85
        L40:
            r0.rLineTo(r31[r8 + 0], 0.0f);
            r9 = r9 + r31[r8 + 0];
            r1 = r18;
            r110 = r8;
            goto L85
        L41:
            r0.rCubicTo(r31[r8 + 0], r31[r8 + 1], r31[r8 + 2], r31[r8 + 3], r31[r8 + 4], r31[r8 + 5]);
            float r38 = r31[r8 + 2] + r9;
            float r39 = r18 + r31[r8 + 3];
            r9 = r9 + r31[r8 + 4];
            r19 = r38;
            r20 = r39;
            r1 = r18 + r31[r8 + 5];
            r110 = r8;
            goto L85
        L42:
            float r40 = r31[r8 + 5] + r9;
            float r41 = r31[r8 + 6] + r18;
            float r42 = r31[r8 + 0];
            float r43 = r31[r8 + 1];
            float r44 = r31[r8 + 2];
            if (r31[r8 + 3] == 0.0f) goto L45;
            boolean r45 = r24;
        L47:
            if (r31[r8 + 4] == 0.0f) goto L49;
            boolean r46 = r24;
        L50:
            float r112 = r18;
            r110 = r8;
            drawArc(r27, r9, r112, r40, r41, r42, r43, r44, r45, r46);
            r9 = r9 + r31[r110 + 5];
            r1 = r31[r110 + 6] + r112;
            r19 = r9;
            r20 = r1;
            goto L85
        L49:
            r46 = r23;
            goto L50
        L45:
            r45 = r23;
            goto L47
        L51:
            r110 = r8;
            r0.lineTo(r9, r31[r110 + 0]);
            r1 = r31[r110 + 0];
            goto L85
        L52:
            float r113 = r18;
            r110 = r8;
            char r114 = r10;
            float r47 = r9;
            float r48 = r47;
            float r49 = r113;
            if (r114 == 'q') goto L57;
            if (r114 == 't') goto L57;
            if (r114 == 'Q') goto L57;
            if (r114 == 'T') goto L57;
        L58:
            r0.quadTo(r48, r49, r31[r110 + 0], r31[r110 + 1]);
            r19 = r48;
            r20 = r49;
            r9 = r31[r110 + 0];
            r1 = r31[r110 + 1];
        L57:
            r48 = (r47 * 2.0f) - r19;
            r49 = (r113 * 2.0f) - r20;
            goto L58
        L59:
            float r115 = r18;
            r110 = r8;
            char r116 = r10;
            float r50 = r9;
            float r51 = r50;
            if (r116 == 'c') goto L66;
            if (r116 == 's') goto L66;
            if (r116 == 'C') goto L66;
            if (r116 == 'S') goto L66;
            float r52 = r115;
        L67:
            r0.cubicTo(r51, r52, r31[r110 + 0], r31[r110 + 1], r31[r110 + 2], r31[r110 + 3]);
            float r53 = r31[r110 + 0];
            float r54 = r31[r110 + 1];
            r19 = r53;
            r20 = r54;
            r9 = r31[r110 + 2];
            r1 = r31[r110 + 3];
        L66:
            r51 = (r50 * 2.0f) - r19;
            r52 = (r115 * 2.0f) - r20;
            goto L67
        L68:
            r110 = r8;
            r0.quadTo(r31[r110 + 0], r31[r110 + 1], r31[r110 + 2], r31[r110 + 3]);
            float r55 = r31[r110 + 0];
            float r56 = r31[r110 + 1];
            r19 = r55;
            r20 = r56;
            r9 = r31[r110 + 2];
            r1 = r31[r110 + 3];
            goto L85
        L69:
            r110 = r8;
            float r57 = r31[r110 + 0];
            float r58 = r31[r110 + 1];
            if (r110 <= 0) goto L72;
            r0.lineTo(r31[r110 + 0], r31[r110 + 1]);
            r9 = r57;
            r1 = r58;
            goto L85
        L72:
            r0.moveTo(r31[r110 + 0], r31[r110 + 1]);
            r9 = r57;
            r1 = r58;
            r21 = r57;
            r22 = r58;
            goto L85
        L73:
            r110 = r8;
            r0.lineTo(r31[r110 + 0], r31[r110 + 1]);
            r9 = r31[r110 + 0];
            r1 = r31[r110 + 1];
            goto L85
        L74:
            float r117 = r18;
            r110 = r8;
            r0.lineTo(r31[r110 + 0], r117);
            r9 = r31[r110 + 0];
            r1 = r117;
            goto L85
        L75:
            r110 = r8;
            r0.cubicTo(r31[r110 + 0], r31[r110 + 1], r31[r110 + 2], r31[r110 + 3], r31[r110 + 4], r31[r110 + 5]);
            float r59 = r31[r110 + 4];
            r1 = r31[r110 + 5];
            r9 = r59;
            r19 = r31[r110 + 2];
            r20 = r31[r110 + 3];
            goto L85
        L76:
            float r118 = r18;
            r110 = r8;
            float r60 = r9;
            float r61 = r31[r110 + 5];
            float r62 = r31[r110 + 6];
            float r63 = r31[r110 + 0];
            float r64 = r31[r110 + 1];
            float r65 = r31[r110 + 2];
            if (r31[r110 + 3] == 0.0f) goto L79;
            boolean r66 = r24;
        L81:
            if (r31[r110 + 4] == 0.0f) goto L83;
            boolean r67 = r24;
        L84:
            drawArc(r27, r60, r118, r61, r62, r63, r64, r65, r66, r67);
            float r68 = r31[r110 + 5];
            r1 = r31[r110 + 6];
            r9 = r68;
            r19 = r68;
            r20 = r1;
            goto L85
        L83:
            r67 = r23;
            goto L84
        L79:
            r66 = r23;
            goto L81
        L86:
            r28[r11 ? 1 : 0] = r9;
            r28[r12 ? 1 : 0] = r18;
            r28[r13] = r19;
            r28[3] = r20;
            r28[4] = r21;
            r28[5] = r22;
            return;
        L5:
            r0.close();
            r2 = r6;
            r3 = r7;
            r4 = r6;
            r5 = r7;
            r0.moveTo(r2, r3);
            r17 = 2;
            goto L11
        L6:
            r17 = 4;
            goto L11
        L7:
            r17 = 2;
            goto L11
        L8:
            r17 = 1;
            goto L11
        L9:
            r17 = 6;
            goto L11
        L10:
            r17 = 7;
            goto L11
        }

        private static void drawArc(Path p, float x0, float y0, float x1, float y1, float a, float b, float theta, boolean isMoreThanHalf, boolean isPositiveArc) {
            double thetaD = Math.toRadians(theta);
            double cosTheta = Math.cos(thetaD);
            double sinTheta = Math.sin(thetaD);
            double x0p = ((((double) x0) * cosTheta) + (((double) y0) * sinTheta)) / ((double) a);
            double y0p = ((((double) (-x0)) * sinTheta) + (((double) y0) * cosTheta)) / ((double) b);
            double x1p = ((((double) x1) * cosTheta) + (((double) y1) * sinTheta)) / ((double) a);
            double y1p = ((((double) (-x1)) * sinTheta) + (((double) y1) * cosTheta)) / ((double) b);
            double dx = x0p - x1p;
            double dy = y0p - y1p;
            double xm = (x0p + x1p) / 2.0d;
            double ym = (y0p + y1p) / 2.0d;
            double dsq = (dx * dx) + (dy * dy);
            if (dsq != 0.0d) goto L6;
            Log.w(PathParser.LOGTAG, " Points are coincident");
            return;
        L6:
            double disc = (1.0d / dsq) - 0.25d;
            if (disc >= 0.0d) goto L10;
            Log.w(PathParser.LOGTAG, "Points are too far apart " + dsq);
            float adjust = (float) (Math.sqrt(dsq) / 1.99999d);
            drawArc(p, x0, y0, x1, y1, a * adjust, b * adjust, theta, isMoreThanHalf, isPositiveArc);
            return;
        L10:
            double s = Math.sqrt(disc);
            double sdx = s * dx;
            double sdy = s * dy;
            if (isMoreThanHalf != isPositiveArc) goto L13;
            double cx = xm - sdy;
            double cy = ym + sdx;
        L14:
            double eta0 = Math.atan2(y0p - cy, x0p - cx);
            double eta1 = Math.atan2(y1p - cy, x1p - cx);
            double sweep = eta1 - eta0;
            if (sweep < 0.0d) goto L17;
            boolean r20 = true;
        L19:
            if (isPositiveArc != r20) goto L21;
            double sweep2 = sweep;
        L25:
            double cx2 = cx * ((double) a);
            double cy2 = cy * ((double) b);
            double eta2 = a;
            arcToBezier(p, (cx2 * cosTheta) - (cy2 * sinTheta), (cx2 * sinTheta) + (cy2 * cosTheta), eta2, b, x0, y0, thetaD, eta0, sweep2);
            return;
        L21:
            if (sweep <= 0.0d) goto L23;
            sweep2 = sweep - 6.283185307179586d;
            goto L25
        L23:
            sweep2 = sweep + 6.283185307179586d;
            goto L25
        L17:
            r20 = false;
            goto L19
        L13:
            cx = xm + sdy;
            cy = ym - sdx;
            goto L14
        }

        private static void arcToBezier(Path p, double cx, double cy, double a, double b, double e1x, double e1y, double theta, double start, double sweep) {
            double e1x2 = a;
            int numSegments = (int) Math.ceil(Math.abs((sweep * 4.0d) / 3.141592653589793d));
            double cosTheta = Math.cos(theta);
            double sinTheta = Math.sin(theta);
            double cosEta1 = Math.cos(start);
            double sinEta1 = Math.sin(start);
            double ep1x = (((-e1x2) * cosTheta) * sinEta1) - ((b * sinTheta) * cosEta1);
            double ep1x2 = -e1x2;
            double ep1y = ((ep1x2 * sinTheta) * sinEta1) + ((b * cosTheta) * cosEta1);
            double ep1y2 = ep1y;
            double ep1y3 = numSegments;
            double anglePerSegment = sweep / ep1y3;
            double eta1 = start;
            int i = 0;
            double eta2 = e1x;
            double ep1x3 = ep1x;
            double e1y2 = e1y;
        L3:
            if (i >= numSegments) goto L5;
            double eta3 = eta1 + anglePerSegment;
            double sinEta2 = Math.sin(eta3);
            double cosEta2 = Math.cos(eta3);
            double anglePerSegment2 = anglePerSegment;
            double anglePerSegment3 = (cx + ((e1x2 * cosTheta) * cosEta2)) - ((b * sinTheta) * sinEta2);
            int numSegments2 = numSegments;
            double e1x3 = eta2;
            double e2y = (cy + ((e1x2 * sinTheta) * cosEta2)) + ((b * cosTheta) * sinEta2);
            double cosTheta2 = cosTheta;
            double ep2x = (((-e1x2) * cosTheta2) * sinEta2) - ((b * sinTheta) * cosEta2);
            double ep2y = (((-e1x2) * sinTheta) * sinEta2) + ((b * cosTheta2) * cosEta2);
            double tanDiff2 = Math.tan((eta3 - eta1) / 2.0d);
            double alpha = (Math.sin(eta3 - eta1) * (Math.sqrt(((tanDiff2 * 3.0d) * tanDiff2) + 4.0d) - 1.0d)) / 3.0d;
            double q1x = e1x3 + (alpha * ep1x3);
            double q2x = anglePerSegment3 - (alpha * ep2x);
            double q2y = e2y - (alpha * ep2y);
            p.rLineTo(0.0f, 0.0f);
            p.cubicTo((float) q1x, (float) (e1y2 + (alpha * ep1y2)), (float) q2x, (float) q2y, (float) anglePerSegment3, (float) e2y);
            eta1 = eta3;
            e1y2 = e2y;
            ep1x3 = ep2x;
            ep1y2 = ep2y;
            i = i + 1;
            eta2 = anglePerSegment3;
            numSegments = numSegments2;
            cosTheta = cosTheta2;
            anglePerSegment = anglePerSegment2;
            sinEta1 = sinEta1;
            sinTheta = sinTheta;
            cosEta1 = cosEta1;
            e1x2 = a;
            goto L3
        }
    }

    static float[] copyOfRange(float[] original, int start, int end) {
        if (start > end) goto L11;
        int originalLength = original.length;
        if (start < 0) goto L9;
        if (start > originalLength) goto L9;
        int resultLength = end - start;
        int copyLength = Math.min(resultLength, originalLength - start);
        float[] result = new float[resultLength];
        System.arraycopy(original, start, result, 0, copyLength);
        return result;
    L9:
        throw new ArrayIndexOutOfBoundsException();
    L11:
        throw new IllegalArgumentException();
    }

    public static Path createPathFromPathData(String pathData) {
        Path path = new Path();
        PathDataNode[] nodes = createNodesFromPathData(pathData);
        PathDataNode.nodesToPath(nodes, path);     // Catch: RuntimeException -> L5
        return path;
    L5:
        e = move-exception;
        throw new RuntimeException("Error in parsing " + pathData, e);
    }

    public static PathDataNode[] createNodesFromPathData(String pathData) {
        int start = 0;
        int end = 1;
        ArrayList<PathDataNode> list = new ArrayList();
    L4:
        if (end >= pathData.length()) goto L10;
        int end2 = nextStart(pathData, end);
        String s = pathData.substring(start, end2).trim();
        if (s.isEmpty() == true) goto L8;
        float[] val = getFloats(s);
        addNode(list, s.charAt(0), val);
    L8:
        start = end2;
        end = end2 + 1;
        goto L4
    L10:
        if ((end - start) != 1) goto L15;
        if (start >= pathData.length()) goto L15;
        addNode(list, pathData.charAt(start), new float[0]);
    L15:
        return (PathDataNode[]) list.toArray(new PathDataNode[0]);
    }

    public static PathDataNode[] deepCopyNodes(PathDataNode[] source) {
        PathDataNode[] copy = new PathDataNode[source.length];
        int i = 0;
    L4:
        if (i >= source.length) goto L6;
        copy[i] = new PathDataNode(source[i]);
        i = i + 1;
        goto L4
    L6:
        return copy;
    }

    public static boolean canMorph(PathDataNode[] nodesFrom, PathDataNode[] nodesTo) {
        if (nodesFrom == null) goto L21;
        if (nodesTo == null) goto L21;
        if (nodesFrom.length == nodesTo.length) goto L9;
        return false;
    L9:
        int i = 0;
    L11:
        if (i >= nodesFrom.length) goto L19;
        if (PathDataNode.access$000(nodesFrom[i]) != PathDataNode.access$000(nodesTo[i])) goto L18;
        if (PathDataNode.access$100(nodesFrom[i]).length != PathDataNode.access$100(nodesTo[i]).length) goto L18;
        i = i + 1;
    L18:
        return false;
    L19:
        return true;
    L21:
        return false;
    }

    public static void updateNodes(PathDataNode[] target, PathDataNode[] source) {
        int i = 0;
    L4:
        if (i >= source.length) goto L10;
        PathDataNode.access$002(target[i], PathDataNode.access$000(source[i]));
        int j = 0;
    L7:
        if (j >= PathDataNode.access$100(source[i]).length) goto L9;
        PathDataNode.access$100(target[i])[j] = PathDataNode.access$100(source[i])[j];
        j = j + 1;
        goto L7
    L9:
        i = i + 1;
        goto L4
    }

    private static int nextStart(String s, int end) {
    L3:
        if (end >= s.length()) goto L14;
        char c = s.charAt(end);
        if (((c - 'A') * (c - 'Z')) <= 0) goto L9;
        if (((c - 'a') * (c - 'z')) <= 0) goto L9;
    L13:
        end = end + 1;
    L9:
        if (c == 'e') goto L13;
        if (c == 'E') goto L13;
        return end;
    L14:
        return end;
    }

    private static void addNode(ArrayList<PathDataNode> list, char cmd, float[] val) {
        list.add(new PathDataNode(cmd, val));
    }

    private static float[] getFloats(String s) {
        if (s.charAt(0) == 'z') goto L22;
        if (s.charAt(0) == 'Z') goto L22;
        float[] results = new float[s.length()];     // Catch: NumberFormatException -> L18
        int count = 0;
        int startPosition = 1;
        ExtractFloatResult result = new ExtractFloatResult();     // Catch: NumberFormatException -> L18
        int totalLength = s.length();     // Catch: NumberFormatException -> L18
    L8:
        if (startPosition >= totalLength) goto L16;
        extract(s, startPosition, result);     // Catch: NumberFormatException -> L18
        int endPosition = result.mEndPosition;     // Catch: NumberFormatException -> L18
        if (startPosition >= endPosition) goto L13;
        results[count] = Float.parseFloat(s.substring(startPosition, endPosition));     // Catch: NumberFormatException -> L18
        count = count + 1;     // Catch: NumberFormatException -> L18
    L13:
        if (result.mEndWithNegOrDot == true) goto L14;
        startPosition = endPosition + 1;     // Catch: NumberFormatException -> L18
        goto L8
    L14:
        startPosition = endPosition;
        goto L8
    L16:
        return copyOfRange(results, 0, count);
    L18:
        e = move-exception;
        throw new RuntimeException("error in parsing \"" + s + "\"", e);
    L22:
        return new float[0];
    }

    private static void extract(String s, int start, ExtractFloatResult result) {
        int currentIndex = start;
        boolean foundSeparator = false;
        result.mEndWithNegOrDot = false;
        boolean secondDot = false;
        boolean isExponential = false;
    L4:
        if (currentIndex >= s.length()) goto L19;
        boolean isPrevExponential = isExponential;
        isExponential = false;
        char currentChar = s.charAt(currentIndex);
        switch(currentChar) {
            case 32: goto L15;
            case 44: goto L15;
            case 45: goto L12;
            case 46: goto L9;
            case 69: goto L8;
            case 101: goto L8;
            default: goto L16;
        };
    L8:
        isExponential = true;
        goto L16
    L9:
        if (secondDot == true) goto L11;
        secondDot = true;
        goto L16
    L11:
        foundSeparator = true;
        result.mEndWithNegOrDot = true;
        goto L16
    L12:
        if (currentIndex == start) goto L16;
        if (isPrevExponential == true) goto L16;
        foundSeparator = true;
        result.mEndWithNegOrDot = true;
        goto L16
    L15:
        foundSeparator = true;
    L16:
        if (foundSeparator == true) goto L19;
        currentIndex = currentIndex + 1;
    L19:
        result.mEndPosition = currentIndex;
    }

    public static void interpolatePathDataNodes(PathDataNode[] target, float fraction, PathDataNode[] from, PathDataNode[] to) {
        if (interpolatePathDataNodes(target, from, to, fraction) == false) goto L6;
        return;
    L6:
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }

    @Deprecated
    public static boolean interpolatePathDataNodes(PathDataNode[] target, PathDataNode[] from, PathDataNode[] to, float fraction) {
        if (target.length != from.length) goto L17;
        if (from.length != to.length) goto L17;
        if (canMorph(from, to) == true) goto L10;
        return false;
    L10:
        int i = 0;
    L12:
        if (i >= target.length) goto L14;
        target[i].interpolatePathDataNode(from[i], to[i], fraction);
        i = i + 1;
        goto L12
    L14:
        return true;
    L17:
        throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
    }

    public static void nodesToPath(PathDataNode[] node, Path path) {
        float[] current = new float[6];
        char previousCommand = 'm';
        int r2 = node.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L5;
        PathDataNode pathDataNode = node[r3];
        PathDataNode.access$200(path, current, previousCommand, PathDataNode.access$000(pathDataNode), PathDataNode.access$100(pathDataNode));
        previousCommand = PathDataNode.access$000(pathDataNode);
        r3 = r3 + 1;
        goto L3
    }

    private PathParser() {
    }
}
