package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: SelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a*\u0010\u000f\u001a\u00020\u00012\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0001\u001a\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014H\u0000\u001a\u001e\u0010\u001a\u001a\u00020\u001b*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H 0\u0011\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u0011H\u0002\u001a\f\u0010!\u001a\u00020\u0001*\u00020\u0016H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"invertedInfiniteRect", "Landroidx/compose/ui/geometry/Rect;", "calculateSelectionMagnifierCenterAndroid", "Landroidx/compose/ui/geometry/Offset;", "manager", "Landroidx/compose/foundation/text/selection/SelectionManager;", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;", "calculateSelectionMagnifierCenterAndroid-O0kMr_c", "(Landroidx/compose/foundation/text/selection/SelectionManager;J)J", "getMagnifierCenter", "anchor", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "getMagnifierCenter-JVtK1S4", "(Landroidx/compose/foundation/text/selection/SelectionManager;JLandroidx/compose/foundation/text/selection/Selection$AnchorInfo;)J", "getSelectedRegionRect", "selectableSubSelectionPairs", "", "Lkotlin/Pair;", "Landroidx/compose/foundation/text/selection/Selectable;", "Landroidx/compose/foundation/text/selection/Selection;", "containerCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "merge", "lhs", "rhs", "containsInclusive", "", "offset", "containsInclusive-Uv8p0NA", "(Landroidx/compose/ui/geometry/Rect;J)Z", "firstAndLast", "T", "visibleBounds", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SelectionManagerKt {
    private static final Rect invertedInfiniteRect = null;

    /* JADX INFO: compiled from: SelectionManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[Handle.values().length];
            r0[Handle.SelectionStart.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L14:
            r0[Handle.SelectionEnd.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L16:
            r0[Handle.Cursor.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L12:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public static final /* synthetic */ List access$firstAndLast(List $receiver) {
        return firstAndLast($receiver);
    }

    public static final /* synthetic */ Rect access$getInvertedInfiniteRect$p() {
        return invertedInfiniteRect;
    }

    public static final Selection merge(Selection lhs, Selection rhs) {
        if (lhs == null) goto L6;
        Selection r0 = lhs.merge(rhs);
        if (r0 == null) goto L6;
        return r0;
    L6:
        return rhs;
    }

    static {
        invertedInfiniteRect = new Rect(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> List<T> firstAndLast(List<? extends T> r2) {
        switch(r2.size()) {
            case 0: goto L6;
            case 1: goto L6;
            default: goto L7;
        };
    L7:
        return CollectionsKt.listOf(new Object[]{CollectionsKt.first(r2), CollectionsKt.last(r2)});
    L6:
        return r2;
    }

    public static final Rect getSelectedRegionRect(List<? extends Pair<? extends Selectable, Selection>> r41, LayoutCoordinates containerCoordinates) {
        if (r41.isEmpty() == true) goto L5;
        Rect r1 = invertedInfiniteRect;
        float containerLeft = r1.component1();
        float containerTop = r1.component2();
        float containerRight = r1.component3();
        float containerBottom = r1.component4();
        List<? extends Pair<? extends Selectable, Selection>> r5 = r41;
        int $i$f$fastForEach = 0;
        int index$iv = 0;
        int r8 = r5.size();
    L7:
        if (index$iv >= r8) goto L24;
        Object item$iv = r5.get(index$iv);
        Pair<? extends Selectable, Selection> r10 = (Pair) item$iv;
        Selectable selectable = r10.component1();
        Selection subSelection = r10.component2();
        int startOffset = subSelection.getStart().getOffset();
        int endOffset = subSelection.getEnd().getOffset();
        if (startOffset == endOffset) goto L22;
        LayoutCoordinates localCoordinates = selectable.getLayoutCoordinates();
        if (localCoordinates == null) goto L22;
        int minOffset = Math.min(startOffset, endOffset);
        int maxOffset = Math.max(startOffset, endOffset);
        int $i$f$fastForEach2 = maxOffset - 1;
        if (minOffset != $i$f$fastForEach2) goto L16;
        int[] offsets = {minOffset};
    L17:
        Rect r7 = invertedInfiniteRect;
        float left = r7.component1();
        float top = r7.component2();
        float right = r7.component3();
        float bottom = r7.component4();
        int minOffset2 = offsets.length;
        int[] offsets2 = offsets;
        int r6 = 0;
        float left2 = left;
        float top2 = top;
        float right2 = right;
    L18:
        if (r6 >= minOffset2) goto L20;
        int r25 = minOffset2;
        int i = offsets2[r6];
        Rect rect = selectable.getBoundingBox(i);
        left2 = Math.min(left2, rect.getLeft());
        top2 = Math.min(top2, rect.getTop());
        right2 = Math.max(right2, rect.getRight());
        bottom = Math.max(bottom, rect.getBottom());
        r6 = r6 + 1;
        minOffset2 = r25;
        goto L18
    L20:
        int $i$f$Offset = Float.floatToRawIntBits(left2);
        long v1$iv$iv = $i$f$Offset;
        long v2$iv$iv = Float.floatToRawIntBits(top2);
        long localTopLeft = Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
        float bottom2 = bottom;
        long v1$iv$iv2 = Float.floatToRawIntBits(right2);
        long v2$iv$iv2 = Float.floatToRawIntBits(bottom2);
        long localBottomRight = Offset.m4117constructorimpl((v1$iv$iv2 << 32) | (v2$iv$iv2 & 4294967295L));
        long containerTopLeft = containerCoordinates.mo5723localPositionOfR5De75A(localCoordinates, localTopLeft);
        long containerBottomRight = containerCoordinates.mo5723localPositionOfR5De75A(localCoordinates, localBottomRight);
        long localTopLeft2 = containerTopLeft >> 32;
        int bits$iv$iv$iv = (int) localTopLeft2;
        float containerLeft2 = Math.min(containerLeft, Float.intBitsToFloat(bits$iv$iv$iv));
        int bits$iv$iv$iv2 = (int) (containerTopLeft & 4294967295L);
        float containerTop2 = Math.min(containerTop, Float.intBitsToFloat(bits$iv$iv$iv2));
        int bits$iv$iv$iv3 = (int) (containerBottomRight >> 32);
        float containerRight2 = Math.max(containerRight, Float.intBitsToFloat(bits$iv$iv$iv3));
        int bits$iv$iv$iv4 = (int) (containerBottomRight & 4294967295L);
        containerBottom = Math.max(containerBottom, Float.intBitsToFloat(bits$iv$iv$iv4));
        containerRight = containerRight2;
        containerLeft = containerLeft2;
        containerTop = containerTop2;
        goto L22
    L16:
        offsets = new int[]{minOffset, maxOffset - 1};
    L22:
        index$iv = index$iv + 1;
        r5 = r5;
        $i$f$fastForEach = $i$f$fastForEach;
        r8 = r8;
        goto L7
    L24:
        return new Rect(containerLeft, containerTop, containerRight, containerBottom);
    L5:
        return invertedInfiniteRect;
    }

    /* JADX INFO: renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m1482calculateSelectionMagnifierCenterAndroidO0kMr_c(SelectionManager manager, long magnifierSize) {
        Selection selection = manager.getSelection();
        if (selection == null) goto L5;
        Handle r1 = manager.getDraggingHandle();
        if (r1 != null) goto L9;
        int r2 = -1;
    L10:
        switch(r2) {
            case -1: goto L19;
            case 0: goto L12;
            case 1: goto L17;
            case 2: goto L20;
            case 3: goto L14;
            default: goto L12;
        };
    L12:
        throw new NoWhenBranchMatchedException();
    L14:
        throw new IllegalStateException("SelectionContainer does not support cursor".toString());
    L20:
        return m1484getMagnifierCenterJVtK1S4(manager, magnifierSize, selection.getEnd());
    L17:
        return m1484getMagnifierCenterJVtK1S4(manager, magnifierSize, selection.getStart());
    L19:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    L9:
        r2 = WhenMappings.$EnumSwitchMapping$0[r1.ordinal()];
        goto L10
    L5:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    }

    /* JADX INFO: renamed from: getMagnifierCenter-JVtK1S4, reason: not valid java name */
    private static final long m1484getMagnifierCenterJVtK1S4(SelectionManager manager, long magnifierSize, Selection.AnchorInfo anchor) {
        Selectable selectable = manager.getAnchorSelectable$foundation_release(anchor);
        if (selectable == null) goto L5;
        LayoutCoordinates containerCoordinates = manager.getContainerLayoutCoordinates();
        if (containerCoordinates == null) goto L9;
        LayoutCoordinates selectableCoordinates = selectable.getLayoutCoordinates();
        if (selectableCoordinates == null) goto L13;
        int offset = anchor.getOffset();
        if (offset > selectable.getLastVisibleOffset()) goto L17;
        Offset r6 = manager.m1471getCurrentDragPosition_m7T9E();
        Intrinsics.checkNotNull(r6);
        long localDragPosition = selectableCoordinates.mo5723localPositionOfR5De75A(containerCoordinates, r6.m4135unboximpl());
        int bits$iv$iv$iv = (int) (localDragPosition >> 32);
        float dragX = Float.intBitsToFloat(bits$iv$iv$iv);
        long lineRange = selectable.mo1434getRangeOfLineContainingjx7JFs(offset);
        if (TextRange.m6411getCollapsedimpl(lineRange) == false) goto L21;
        float lineStartX = selectable.getLineLeft(offset);
    L23:
        if (lineStartX != (-1.0f)) goto L25;
        boolean r14 = true;
    L26:
        if (r14 == false) goto L30;
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    L30:
        if (IntSize.m7142equalsimpl0(magnifierSize, IntSize.Companion.m7149getZeroYbymL2g()) == false) goto L32;
    L35:
        float lineCenterY = selectable.getCenterYForOffset(offset);
        if (lineCenterY != (-1.0f)) goto L38;
        boolean r11 = true;
    L39:
        if (r11 == true) goto L41;
        long v1$iv$iv = Float.floatToRawIntBits(lineStartX);
        long v2$iv$iv = Float.floatToRawIntBits(lineCenterY);
        return containerCoordinates.mo5723localPositionOfR5De75A(selectableCoordinates, Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L)));
    L41:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    L38:
        r11 = false;
        goto L39
    L32:
        if (Math.abs(dragX - lineStartX) <= (((int) (magnifierSize >> 32)) / 2)) goto L35;
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    L25:
        r14 = false;
        goto L26
    L21:
        float lineStartX2 = selectable.getLineLeft(TextRange.m6417getStartimpl(lineRange));
        float lineEndX = selectable.getLineRight(TextRange.m6412getEndimpl(lineRange) - 1);
        float minX = Math.min(lineStartX2, lineEndX);
        float maxX = Math.max(lineStartX2, lineEndX);
        lineStartX = RangesKt.coerceIn(dragX, minX, maxX);
        goto L23
    L17:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    L13:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    L9:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    L5:
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    }

    public static final Rect visibleBounds(LayoutCoordinates $this$visibleBounds) {
        Rect boundsInWindow = LayoutCoordinatesKt.boundsInWindow($this$visibleBounds);
        return RectKt.m4163Rect0a9Yr6o($this$visibleBounds.mo5731windowToLocalMKHz9U(boundsInWindow.m4160getTopLeftF1C5BW0()), $this$visibleBounds.mo5731windowToLocalMKHz9U(boundsInWindow.m4154getBottomRightF1C5BW0()));
    }

    /* JADX INFO: renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    public static final boolean m1483containsInclusiveUv8p0NA(Rect $this$containsInclusive_u2dUv8p0NA, long offset) {
        float r0 = $this$containsInclusive_u2dUv8p0NA.getLeft();
        float r1 = $this$containsInclusive_u2dUv8p0NA.getRight();
        int bits$iv$iv$iv = (int) (offset >> 32);
        float r6 = Float.intBitsToFloat(bits$iv$iv$iv);
        if (r0 <= r6) goto L5;
    L7:
        boolean r2 = false;
    L8:
        if (r2 == false) goto L18;
        float r3 = $this$containsInclusive_u2dUv8p0NA.getTop();
        float r4 = $this$containsInclusive_u2dUv8p0NA.getBottom();
        int bits$iv$iv$iv2 = (int) (4294967295L & offset);
        float r8 = Float.intBitsToFloat(bits$iv$iv$iv2);
        if (r3 <= r8) goto L12;
    L14:
        boolean r5 = false;
    L15:
        if (r5 == false) goto L18;
        return true;
    L12:
        if (r8 > r4) goto L14;
        r5 = true;
    L18:
        return false;
    L5:
        if (r6 > r1) goto L7;
        r2 = true;
        goto L8
    }
}
