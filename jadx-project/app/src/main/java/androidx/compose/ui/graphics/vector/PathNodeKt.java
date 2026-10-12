package androidx.compose.ui.graphics.vector;

import androidx.autofill.HintConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: PathNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\bH\u0002\u001ai\u0010'\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b28\b\u0004\u0010)\u001a2\u0012\u0013\u0012\u00110%¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110\b¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020#0*H\u0082\b\u001a&\u0010/\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\bH\u0002\u001a4\u00100\u001a\u00020 *\u00020\u00012\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020#01j\b\u0012\u0004\u0012\u00020#`22\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"ArcToKey", "", "CloseKey", "CurveToKey", "HorizontalToKey", "LineToKey", "MoveToKey", "NUM_ARC_TO_ARGS", "", "NUM_CURVE_TO_ARGS", "NUM_HORIZONTAL_TO_ARGS", "NUM_LINE_TO_ARGS", "NUM_MOVE_TO_ARGS", "NUM_QUAD_TO_ARGS", "NUM_REFLECTIVE_CURVE_TO_ARGS", "NUM_REFLECTIVE_QUAD_TO_ARGS", "NUM_VERTICAL_TO_ARGS", "QuadToKey", "ReflectiveCurveToKey", "ReflectiveQuadToKey", "RelativeArcToKey", "RelativeCloseKey", "RelativeCurveToKey", "RelativeHorizontalToKey", "RelativeLineToKey", "RelativeMoveToKey", "RelativeQuadToKey", "RelativeReflectiveCurveToKey", "RelativeReflectiveQuadToKey", "RelativeVerticalToKey", "VerticalToKey", "pathMoveNodeFromArgs", "", "nodes", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "args", "", "count", "pathNodesFromArgs", "numArgs", "nodeFor", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "subArray", "start", "pathRelativeMoveNodeFromArgs", "addPathNodes", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PathNodeKt {
    private static final char ArcToKey = 'A';
    private static final char CloseKey = 'Z';
    private static final char CurveToKey = 'C';
    private static final char HorizontalToKey = 'H';
    private static final char LineToKey = 'L';
    private static final char MoveToKey = 'M';
    private static final int NUM_ARC_TO_ARGS = 7;
    private static final int NUM_CURVE_TO_ARGS = 6;
    private static final int NUM_HORIZONTAL_TO_ARGS = 1;
    private static final int NUM_LINE_TO_ARGS = 2;
    private static final int NUM_MOVE_TO_ARGS = 2;
    private static final int NUM_QUAD_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_CURVE_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_QUAD_TO_ARGS = 2;
    private static final int NUM_VERTICAL_TO_ARGS = 1;
    private static final char QuadToKey = 'Q';
    private static final char ReflectiveCurveToKey = 'S';
    private static final char ReflectiveQuadToKey = 'T';
    private static final char RelativeArcToKey = 'a';
    private static final char RelativeCloseKey = 'z';
    private static final char RelativeCurveToKey = 'c';
    private static final char RelativeHorizontalToKey = 'h';
    private static final char RelativeLineToKey = 'l';
    private static final char RelativeMoveToKey = 'm';
    private static final char RelativeQuadToKey = 'q';
    private static final char RelativeReflectiveCurveToKey = 's';
    private static final char RelativeReflectiveQuadToKey = 't';
    private static final char RelativeVerticalToKey = 'v';
    private static final char VerticalToKey = 'V';

    public static final void addPathNodes(char $this$addPathNodes, ArrayList<PathNode> r24, float[] args, int count) {
        ArrayList<PathNode> r1 = r24;
        switch($this$addPathNodes) {
            case 65: goto L77;
            case 67: goto L73;
            case 72: goto L69;
            case 76: goto L65;
            case 77: goto L64;
            case 81: goto L60;
            case 83: goto L56;
            case 84: goto L52;
            case 86: goto L48;
            case 90: goto L47;
            case 97: goto L35;
            case 99: goto L31;
            case 104: goto L27;
            case 108: goto L23;
            case 109: goto L22;
            case 113: goto L18;
            case 115: goto L14;
            case 116: goto L10;
            case 118: goto L6;
            case 122: goto L47;
            default: goto L5;
        };
    L6:
        int end$iv = count - 1;
        int index$iv = 0;
    L7:
        if (index$iv > end$iv) goto L114;
        r1.add(new PathNode.RelativeVerticalTo(args[index$iv]));
        index$iv = index$iv + 1;
        goto L7
    L114:
        return;
    L10:
        int end$iv2 = count - 2;
        int index$iv2 = 0;
    L11:
        if (index$iv2 > end$iv2) goto L115;
        int start = index$iv2;
        r1.add(new PathNode.RelativeReflectiveQuadTo(args[start], args[start + 1]));
        index$iv2 = index$iv2 + 2;
        goto L11
    L115:
        return;
    L14:
        int numArgs$iv = 4;
        int end$iv3 = count - 4;
        int index$iv3 = 0;
    L15:
        if (index$iv3 > end$iv3) goto L89;
        int start2 = index$iv3;
        int numArgs$iv2 = numArgs$iv;
        r1.add(new PathNode.RelativeReflectiveCurveTo(args[start2], args[start2 + 1], args[start2 + 2], args[start2 + 3]));
        index$iv3 = index$iv3 + numArgs$iv2;
        numArgs$iv = numArgs$iv2;
        goto L15
    L89:
        return;
    L18:
        int numArgs$iv3 = 4;
        int end$iv4 = count - 4;
        int index$iv4 = 0;
    L19:
        if (index$iv4 > end$iv4) goto L110;
        int start3 = index$iv4;
        int numArgs$iv4 = numArgs$iv3;
        r1.add(new PathNode.RelativeQuadTo(args[start3], args[start3 + 1], args[start3 + 2], args[start3 + 3]));
        index$iv4 = index$iv4 + numArgs$iv4;
        numArgs$iv3 = numArgs$iv4;
        goto L19
    L110:
        return;
    L22:
        pathRelativeMoveNodeFromArgs(r1, args, count);
        return;
    L23:
        int end$iv5 = count - 2;
        int index$iv5 = 0;
    L24:
        if (index$iv5 > end$iv5) goto L116;
        int start4 = index$iv5;
        r1.add(new PathNode.RelativeLineTo(args[start4], args[start4 + 1]));
        index$iv5 = index$iv5 + 2;
        goto L24
    L116:
        return;
    L27:
        int end$iv6 = count - 1;
        int index$iv6 = 0;
    L28:
        if (index$iv6 > end$iv6) goto L117;
        r1.add(new PathNode.RelativeHorizontalTo(args[index$iv6]));
        index$iv6 = index$iv6 + 1;
        goto L28
    L117:
        return;
    L31:
        int end$iv7 = count - 6;
        int index$iv7 = 0;
    L32:
        if (index$iv7 > end$iv7) goto L118;
        int start5 = index$iv7;
        r1.add(new PathNode.RelativeCurveTo(args[start5], args[start5 + 1], args[start5 + 2], args[start5 + 3], args[start5 + 4], args[start5 + 5]));
        index$iv7 = index$iv7 + 6;
        goto L32
    L118:
        return;
    L35:
        int end$iv8 = count - 7;
        int index$iv8 = 0;
    L36:
        if (index$iv8 > end$iv8) goto L119;
        ArrayList<PathNode> r11 = r1;
        int start6 = index$iv8;
        float r16 = args[start6];
        float r17 = args[start6 + 1];
        float r18 = args[start6 + 2];
        if (Float.compare(args[start6 + 3], 0.0f) == 0) goto L40;
        boolean r19 = true;
    L42:
        if (Float.compare(args[start6 + 4], 0.0f) == 0) goto L44;
        boolean r20 = true;
    L45:
        r11.add(new PathNode.RelativeArcTo(r16, r17, r18, r19, r20, args[start6 + 5], args[start6 + 6]));
        index$iv8 = index$iv8 + 7;
        goto L36
    L44:
        r20 = false;
        goto L45
    L40:
        r19 = false;
        goto L42
    L119:
        return;
    L47:
        r1.add(PathNode.Close.INSTANCE);
        return;
    L48:
        int end$iv9 = count - 1;
        int index$iv9 = 0;
    L49:
        if (index$iv9 > end$iv9) goto L120;
        r1.add(new PathNode.VerticalTo(args[index$iv9]));
        index$iv9 = index$iv9 + 1;
        goto L49
    L120:
        return;
    L52:
        int end$iv10 = count - 2;
        int index$iv10 = 0;
    L53:
        if (index$iv10 > end$iv10) goto L121;
        int start7 = index$iv10;
        r1.add(new PathNode.ReflectiveQuadTo(args[start7], args[start7 + 1]));
        index$iv10 = index$iv10 + 2;
        goto L53
    L121:
        return;
    L56:
        int end$iv11 = count - 4;
        int index$iv11 = 0;
    L57:
        if (index$iv11 > end$iv11) goto L122;
        int start8 = index$iv11;
        r1.add(new PathNode.ReflectiveCurveTo(args[start8], args[start8 + 1], args[start8 + 2], args[start8 + 3]));
        index$iv11 = index$iv11 + 4;
        r1 = r24;
        goto L57
    L122:
        return;
    L60:
        int end$iv12 = count - 4;
        int index$iv12 = 0;
    L61:
        if (index$iv12 > end$iv12) goto L123;
        int start9 = index$iv12;
        r24.add(new PathNode.QuadTo(args[start9], args[start9 + 1], args[start9 + 2], args[start9 + 3]));
        index$iv12 = index$iv12 + 4;
        goto L61
    L123:
        return;
    L64:
        pathMoveNodeFromArgs(r24, args, count);
        return;
    L65:
        int end$iv13 = count - 2;
        int index$iv13 = 0;
    L66:
        if (index$iv13 > end$iv13) goto L124;
        int start10 = index$iv13;
        r24.add(new PathNode.LineTo(args[start10], args[start10 + 1]));
        index$iv13 = index$iv13 + 2;
        goto L66
    L124:
        return;
    L69:
        int end$iv14 = count - 1;
        int index$iv14 = 0;
    L70:
        if (index$iv14 > end$iv14) goto L125;
        r24.add(new PathNode.HorizontalTo(args[index$iv14]));
        index$iv14 = index$iv14 + 1;
        goto L70
    L125:
        return;
    L73:
        int end$iv15 = count - 6;
        int index$iv15 = 0;
    L74:
        if (index$iv15 > end$iv15) goto L126;
        int start11 = index$iv15;
        r24.add(new PathNode.CurveTo(args[start11], args[start11 + 1], args[start11 + 2], args[start11 + 3], args[start11 + 4], args[start11 + 5]));
        index$iv15 = index$iv15 + 6;
        goto L74
    L126:
        return;
    L77:
        int end$iv16 = count - 7;
        int index$iv16 = 0;
    L78:
        if (index$iv16 > end$iv16) goto L127;
        ArrayList<PathNode> r9 = r24;
        int start12 = index$iv16;
        float r14 = args[start12];
        float r15 = args[start12 + 1];
        float r110 = args[start12 + 2];
        if (Float.compare(args[start12 + 3], 0.0f) == 0) goto L82;
        boolean r111 = true;
    L84:
        if (Float.compare(args[start12 + 4], 0.0f) == 0) goto L86;
        boolean r112 = true;
    L87:
        r9.add(new PathNode.ArcTo(r14, r15, r110, r111, r112, args[start12 + 5], args[start12 + 6]));
        index$iv16 = index$iv16 + 7;
        goto L78
    L86:
        r112 = false;
        goto L87
    L82:
        r111 = false;
        goto L84
    L127:
        return;
    L5:
        throw new IllegalArgumentException("Unknown command for: " + $this$addPathNodes);
    }

    private static final void pathNodesFromArgs(List<PathNode> r4, float[] args, int count, int numArgs, Function2<? super float[], ? super Integer, ? extends PathNode> r8) {
        int end = count - numArgs;
        int index = 0;
    L3:
        if (index > end) goto L5;
        r4.add(r8.invoke(args, Integer.valueOf(index)));
        index = index + numArgs;
        goto L3
    }

    private static final void pathMoveNodeFromArgs(List<PathNode> r5, float[] args, int count) {
        int end = count - 2;
        if (end < 0) goto L7;
        r5.add(new PathNode.MoveTo(args[0], args[1]));
        int index = 2;
    L5:
        if (index > end) goto L9;
        r5.add(new PathNode.LineTo(args[index], args[index + 1]));
        index = index + 2;
        goto L5
    L9:
        return;
    }

    private static final void pathRelativeMoveNodeFromArgs(List<PathNode> r5, float[] args, int count) {
        int end = count - 2;
        if (end < 0) goto L7;
        r5.add(new PathNode.RelativeMoveTo(args[0], args[1]));
        int index = 2;
    L5:
        if (index > end) goto L9;
        r5.add(new PathNode.RelativeLineTo(args[index], args[index + 1]));
        index = index + 2;
        goto L5
    L9:
        return;
    }
}
