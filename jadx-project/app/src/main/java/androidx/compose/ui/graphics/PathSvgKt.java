package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.vector.PathParser;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PathSvg.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"command", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/graphics/PathSegment$Type;", "lastType", "addSvg", "", "Landroidx/compose/ui/graphics/Path;", "pathData", "toSvg", "asDocument", "", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PathSvgKt {

    /* JADX INFO: compiled from: PathSvg.kt */
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

    public static final void addSvg(Path $this$addSvg, String pathData) {
        new PathParser().parsePathString(pathData).toPath($this$addSvg);
    }

    public static final String toSvg(Path $this$toSvg, boolean asDocument) {
        StringBuilder $this$toSvg_u24lambda_u240 = new StringBuilder();
        Rect bounds = $this$toSvg.getBounds();
        if (asDocument == false) goto L5;
        $this$toSvg_u24lambda_u240.append("<svg xmlns=\"http://www.w3.org/2000/svg\" ");
        StringBuilder r7 = $this$toSvg_u24lambda_u240.append("viewBox=\"" + bounds.getLeft() + ' ' + bounds.getTop() + ' ' + (bounds.getRight() - bounds.getLeft()) + ' ' + (bounds.getBottom() - bounds.getTop()) + "\">");
        Intrinsics.checkNotNullExpressionValue(r7, "append(...)");
        Intrinsics.checkNotNullExpressionValue(r7.append('\n'), "append(...)");
    L5:
        PathIterator iterator = $this$toSvg.iterator();
        float[] points = new float[8];
        PathSegment.Type lastType = PathSegment.Type.Done;
        if (iterator.hasNext() == false) goto L27;
        if (asDocument == false) goto L13;
        if (PathFillType.m4644equalsimpl0($this$toSvg.mo4257getFillTypeRgk1Os(), PathFillType.Companion.m4648getEvenOddRgk1Os()) == false) goto L11;
        $this$toSvg_u24lambda_u240.append("  <path fill-rule=\"evenodd\" d=\"");
        goto L13
    L11:
        $this$toSvg_u24lambda_u240.append("  <path d=\"");
    L13:
        if (iterator.hasNext() == false) goto L25;
        PathSegment.Type type = PathIterator.next$default(iterator, points, 0, 2, null);
        switch(WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1: goto L23;
            case 2: goto L22;
            case 3: goto L21;
            case 4: goto L13;
            case 5: goto L19;
            case 6: goto L18;
            case 7: goto L13;
            default: goto L24;
        };
    L18:
        $this$toSvg_u24lambda_u240.append(command(PathSegment.Type.Close, lastType));
        goto L24
    L19:
        $this$toSvg_u24lambda_u240.append(command(PathSegment.Type.Cubic, lastType));
        $this$toSvg_u24lambda_u240.append(new StringBuilder().append(points[2]).append(' ').append(points[3]).append(' ').toString());
        $this$toSvg_u24lambda_u240.append(new StringBuilder().append(points[4]).append(' ').append(points[5]).append(' ').toString());
        $this$toSvg_u24lambda_u240.append(new StringBuilder().append(points[6]).append(' ').append(points[7]).toString());
        goto L24
    L21:
        $this$toSvg_u24lambda_u240.append(command(PathSegment.Type.Quadratic, lastType));
        $this$toSvg_u24lambda_u240.append(new StringBuilder().append(points[2]).append(' ').append(points[3]).append(' ').append(points[4]).append(' ').append(points[5]).toString());
        goto L24
    L22:
        $this$toSvg_u24lambda_u240.append(command(PathSegment.Type.Line, lastType) + points[2] + ' ' + points[3]);
        goto L24
    L23:
        $this$toSvg_u24lambda_u240.append(command(PathSegment.Type.Move, lastType) + points[0] + ' ' + points[1]);
    L24:
        lastType = type;
        goto L13
    L25:
        if (asDocument == false) goto L27;
        StringBuilder r6 = $this$toSvg_u24lambda_u240.append("\"/>");
        Intrinsics.checkNotNullExpressionValue(r6, "append(...)");
        Intrinsics.checkNotNullExpressionValue(r6.append('\n'), "append(...)");
    L27:
        if (asDocument == false) goto L29;
        StringBuilder r8 = $this$toSvg_u24lambda_u240.append("</svg>");
        Intrinsics.checkNotNullExpressionValue(r8, "append(...)");
        Intrinsics.checkNotNullExpressionValue(r8.append('\n'), "append(...)");
    L29:
        String r0 = $this$toSvg_u24lambda_u240.toString();
        Intrinsics.checkNotNullExpressionValue(r0, "toString(...)");
        return r0;
    }

    public static /* synthetic */ String toSvg$default(Path r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = false;
    L6:
        return toSvg(r0, r1);
    }

    private static final String command(PathSegment.Type type, PathSegment.Type lastType) {
        if (type != lastType) goto L4;
        return " ";
    L4:
        switch(WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1: goto L10;
            case 2: goto L9;
            case 3: goto L8;
            case 4: goto L5;
            case 5: goto L7;
            case 6: goto L6;
            default: goto L5;
        };
    L5:
        return "";
    L6:
        return "Z";
    L7:
        return "C";
    L8:
        return "Q";
    L9:
        return "L";
    L10:
        return "M";
    }
}
