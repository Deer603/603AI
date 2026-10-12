package androidx.compose.ui.graphics;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PathGeometry.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006\u001a \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b*\u00020\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u001a\u0014\u0010\n\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006¨\u0006\f"}, d2 = {"floatCountForType", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/graphics/PathSegment$Type;", "computeDirection", "Landroidx/compose/ui/graphics/Path$Direction;", "Landroidx/compose/ui/graphics/Path;", "divide", "", "contours", "reverse", "destination", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PathGeometryKt {

    /* JADX INFO: compiled from: PathGeometry.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[PathSegment.Type.values().length];
            r0[PathSegment.Type.Move.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L26:
            r0[PathSegment.Type.Line.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L32:
            r0[PathSegment.Type.Quadratic.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L36:
            r0[PathSegment.Type.Conic.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L28:
            r0[PathSegment.Type.Cubic.ordinal()] = 5;     // Catch: NoSuchFieldError -> L17
        L30:
            r0[PathSegment.Type.Close.ordinal()] = 6;     // Catch: NoSuchFieldError -> L20
        L38:
            r0[PathSegment.Type.Done.ordinal()] = 7;     // Catch: NoSuchFieldError -> L23
        L24:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public static final Path.Direction computeDirection(Path $this$computeDirection) {
        boolean first = true;
        PathIterator iterator = $this$computeDirection.iterator();
        float[] points = new float[8];
        float area = 0.0f;
        float startX = 0.0f;
        float startY = 0.0f;
        float endY = 0.0f;
        PathSegment.Type type = PathIterator.next$default(iterator, points, 0, 2, null);
        float endX = 0.0f;
    L4:
        if (type == PathSegment.Type.Done) goto L29;
        boolean r14 = true;
        switch(WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1: goto L24;
            case 2: goto L23;
            case 3: goto L22;
            case 4: goto L4;
            case 5: goto L20;
            case 6: goto L9;
            case 7: goto L29;
            default: goto L27;
        };
    L9:
        float $this$closeTo$iv = endX;
        if (Math.abs($this$closeTo$iv - startX) >= 1.05E-6f) goto L12;
        boolean r5 = true;
    L13:
        if (r5 == false) goto L19;
        float $this$closeTo$iv2 = endY;
        if (Math.abs($this$closeTo$iv2 - startY) < 1.05E-6f) goto L18;
        r14 = false;
    L18:
        if (r14 == true) goto L27;
    L19:
        area = area + BezierKt.cubicArea(endX, endY, endX, endY, startX, startY, startX, startY);
        float endX2 = startX;
        endX = endX2;
        endY = startY;
        goto L27
    L12:
        r5 = false;
        goto L13
    L20:
        area = area + BezierKt.cubicArea(points[0], points[1], points[2], points[3], points[4], points[5], points[6], points[7]);
        float endX3 = points[6];
        endX = endX3;
        endY = points[7];
        goto L27
    L22:
        float x0 = points[0];
        float y0 = points[1];
        float x1 = points[2];
        float y1 = points[3];
        float x2 = points[4];
        float y2 = points[5];
        float c1x = x0 + ((x1 - x0) * 0.6666667f);
        float c1y = y0 + ((y1 - y0) * 0.6666667f);
        float c2x = x2 + ((x1 - x2) * 0.6666667f);
        float c2y = y2 + ((y1 - y2) * 0.6666667f);
        area = area + BezierKt.cubicArea(x0, y0, c1x, c1y, c2x, c2y, x2, y2);
        endX = x2;
        endY = y2;
        goto L27
    L23:
        float x3 = points[0];
        float y3 = points[1];
        float x4 = points[2];
        float y4 = points[3];
        area = area + BezierKt.cubicArea(x3, y3, x3, y3, x4, y4, x4, y4);
        endX = x4;
        endY = y4;
        goto L27
    L24:
        if (first == false) goto L29;
        first = false;
        float startX2 = points[0];
        startX = startX2;
        startY = points[1];
    L27:
        type = PathIterator.next$default(iterator, points, 0, 2, null);
    L29:
        if (area < 0.0f) goto L32;
        return Path.Direction.Clockwise;
    L32:
        return Path.Direction.CounterClockwise;
    }

    public static /* synthetic */ List divide$default(Path r0, ArrayList r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = new ArrayList();
    L6:
        return divide(r0, r1);
    }

    public static final List<Path> divide(Path $this$divide, List<Path> r18) {
        Path path = AndroidPath_androidKt.Path();
        boolean first = true;
        boolean isEmpty = true;
        PathIterator iterator = $this$divide.iterator();
        float[] points = new float[8];
        PathSegment.Type type = PathIterator.next$default(iterator, points, 0, 2, null);
        Path path2 = path;
    L4:
        if (type == PathSegment.Type.Done) goto L19;
        switch(WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1: goto L14;
            case 2: goto L13;
            case 3: goto L12;
            case 4: goto L4;
            case 5: goto L10;
            case 6: goto L9;
            case 7: goto L4;
            default: goto L18;
        };
    L9:
        path2.close();
        goto L18
    L10:
        path2.cubicTo(points[2], points[3], points[4], points[5], points[6], points[7]);
        isEmpty = false;
        goto L18
    L12:
        path2.quadraticTo(points[2], points[3], points[4], points[5]);
        isEmpty = false;
        goto L18
    L13:
        path2.lineTo(points[2], points[3]);
        isEmpty = false;
        goto L18
    L14:
        if (first == true) goto L17;
        if (isEmpty == true) goto L17;
        r18.add(path2);
        path2 = AndroidPath_androidKt.Path();
    L17:
        path2.moveTo(points[0], points[1]);
        isEmpty = true;
        first = false;
    L18:
        type = PathIterator.next$default(iterator, points, 0, 2, null);
        goto L4
    L19:
        if (first == true) goto L22;
        if (isEmpty == true) goto L22;
        r18.add(path2);
    L22:
        return r18;
    }

    public static /* synthetic */ Path reverse$default(Path r0, Path r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = AndroidPath_androidKt.Path();
    L6:
        return reverse(r0, r1);
    }

    public static final Path reverse(Path $this$reverse, Path destination) {
        PathIterator iterator = $this$reverse.iterator();
        float[] points = null;
        int count = iterator.calculateSize(false);
        ArrayList segments = new ArrayList(count);
        ArrayList data = new ArrayList(count);
        float[] points2 = new float[8];
        PathSegment.Type type = PathIterator.next$default(iterator, points2, 0, 2, null);
    L4:
        if (type == PathSegment.Type.Done) goto L9;
        segments.add(type);
        if (type == PathSegment.Type.Close) goto L8;
        float[] r3 = Arrays.copyOf(points2, floatCountForType(type));
        Intrinsics.checkNotNullExpressionValue(r3, "copyOf(...)");
        data.add(r3);
    L8:
        type = PathIterator.next$default(iterator, points2, 0, 2, null);
        goto L4
    L9:
        boolean insertMove = true;
        int dataIndex = data.size();
        boolean insertClose = false;
        int i = segments.size() - 1;
    L11:
        if ((-1) >= i) goto L30;
        if (insertMove == false) goto L14;
        int dataIndex2 = dataIndex - 1;
        float[] points3 = (float[]) data.get(dataIndex2);
        int offset = ArraysKt.getLastIndex(points3);
        destination.moveTo(points3[offset - 1], points3[offset]);
        float[] points4 = points3;
        boolean insertMove2 = false;
        int dataIndex3 = dataIndex2;
    L16:
        switch(WhenMappings.$EnumSwitchMapping$0[((PathSegment.Type) segments.get(i)).ordinal()]) {
            case 1: goto L23;
            case 2: goto L22;
            case 3: goto L21;
            case 4: goto L27;
            case 5: goto L19;
            case 6: goto L18;
            default: goto L27;
        };
    L18:
        insertClose = true;
        i = i;
        insertMove = insertMove2;
    L28:
        dataIndex = dataIndex3;
        i = i - 1;
        points = points;
        goto L11
    L19:
        i = i;
        destination.cubicTo(points4[4], points4[5], points4[2], points4[3], points4[points], points4[1]);
        dataIndex3 = dataIndex3 - 1;
        insertMove = insertMove2;
        goto L28
    L21:
        i = i;
        destination.quadraticTo(points4[2], points4[3], points4[points], points4[1]);
        dataIndex3 = dataIndex3 - 1;
        insertMove = insertMove2;
        goto L28
    L22:
        i = i;
        destination.lineTo(points4[points], points4[1]);
        dataIndex3 = dataIndex3 - 1;
        insertMove = insertMove2;
        goto L28
    L23:
        i = i;
        if (insertClose == false) goto L26;
        destination.close();
        insertClose = false;
    L26:
        insertMove = true;
        goto L28
    L27:
        insertMove = insertMove2;
        goto L28
    L14:
        float[] points5 = (float[]) data.get(dataIndex);
        points4 = points5;
        insertMove2 = insertMove;
        dataIndex3 = dataIndex;
        goto L16
    L30:
        if (insertClose == false) goto L32;
        destination.close();
    L32:
        return destination;
    }

    private static final int floatCountForType(PathSegment.Type type) {
        switch(WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1: goto L12;
            case 2: goto L11;
            case 3: goto L10;
            case 4: goto L15;
            case 5: goto L14;
            case 6: goto L18;
            case 7: goto L18;
            default: goto L5;
        };
    L10:
        return 6;
    L11:
        return 4;
    L12:
        return 2;
    L18:
        return 0;
    L5:
        throw new NoWhenBranchMatchedException();
    L14:
        return 8;
    L15:
        return 8;
    }
}
