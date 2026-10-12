package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.Comparator;
import kotlin.Metadata;

/* JADX INFO: compiled from: MultiWidgetSelectionDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\"\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\"\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\r\u001a\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002\u001a6\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001c\u0010\u001d\u001a\u00020\t*\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001aH\u0002\u001a4\u0010 \u001a\u00020\u0001*\u00020!2\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u001a0#j\b\u0012\u0004\u0012\u00020\u001a`$2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u0001H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"getOffsetForPosition", "", "position", "Landroidx/compose/ui/geometry/Offset;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "getOffsetForPosition-3MmeM6k", "(JLandroidx/compose/ui/text/TextLayoutResult;)I", "getXDirection", "Landroidx/compose/foundation/text/selection/Direction;", "bounds", "Landroidx/compose/ui/geometry/Rect;", "getXDirection-3MmeM6k", "(JLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/foundation/text/selection/Direction;", "getYDirection", "getYDirection-3MmeM6k", "isSelected", "", "currentDirection", "otherDirection", "appendSelectableInfo", "", "Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "localPosition", "previousHandlePosition", "selectableId", "", "appendSelectableInfo-Parwq6A", "(Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;Landroidx/compose/ui/text/TextLayoutResult;JJJ)V", "getDirectionById", "anchorSelectableId", "currentSelectableId", "getPreviousAdjustedOffset", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "selectableIdOrderingComparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "currentTextLength", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MultiWidgetSelectionDelegateKt {
    /* JADX INFO: renamed from: appendSelectableInfo-Parwq6A, reason: not valid java name */
    public static final void m1435appendSelectableInfoParwq6A(SelectionLayoutBuilder $this$appendSelectableInfo_u2dParwq6A, TextLayoutResult textLayoutResult, long localPosition, long previousHandlePosition, long selectableId) {
        long arg0$iv = textLayoutResult.m6388getSizeYbymL2g();
        long arg0$iv2 = textLayoutResult.m6388getSizeYbymL2g();
        Rect bounds = new Rect(0.0f, 0.0f, (int) (arg0$iv >> 32), (int) (4294967295L & arg0$iv2));
        Direction currentXDirection = m1437getXDirection3MmeM6k(localPosition, bounds);
        Direction currentYDirection = m1438getYDirection3MmeM6k(localPosition, bounds);
        Selection.AnchorInfo r3 = null;
        if ($this$appendSelectableInfo_u2dParwq6A.isStartHandle() == false) goto L8;
        Selection r2 = $this$appendSelectableInfo_u2dParwq6A.getPreviousSelection();
        if (r2 == null) goto L7;
        r3 = r2.getEnd();
    L7:
        Direction otherDirection = appendSelectableInfo_Parwq6A$otherDirection(currentXDirection, currentYDirection, $this$appendSelectableInfo_u2dParwq6A, selectableId, r3);
        Direction startXHandleDirection = currentXDirection;
        Direction currentXDirection2 = currentXDirection;
        Direction currentXDirection3 = currentYDirection;
        Direction endXHandleDirection = otherDirection;
        Direction endYHandleDirection = otherDirection;
        Direction endYHandleDirection2 = otherDirection;
        Direction otherDirection2 = currentYDirection;
        long r4 = selectableId;
    L12:
        Direction startYHandleDirection = SelectionLayoutKt.resolve2dDirection(currentXDirection2, currentXDirection3);
        if (isSelected(startYHandleDirection, endYHandleDirection) == true) goto L15;
        return;
    L15:
        int textLength = textLayoutResult.getLayoutInput().getText().length();
        if ($this$appendSelectableInfo_u2dParwq6A.isStartHandle() == false) goto L26;
        int rawStartHandleOffset = m1436getOffsetForPosition3MmeM6k(localPosition, textLayoutResult);
        Selection r16 = $this$appendSelectableInfo_u2dParwq6A.getPreviousSelection();
        if (r16 == null) goto L24;
        Selection.AnchorInfo r0 = r16.getEnd();
        if (r0 == null) goto L24;
        startXHandleDirection = startXHandleDirection;
        int r1 = getPreviousAdjustedOffset(r0, $this$appendSelectableInfo_u2dParwq6A.getSelectableIdOrderingComparator(), r4, textLength);
    L25:
        int rawStartHandleOffset2 = rawStartHandleOffset;
        int rawStartHandleOffset3 = r1;
    L34:
        if ((previousHandlePosition & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) goto L36;
        boolean r5 = true;
    L37:
        if (r5 == false) goto L39;
        int rawPreviousHandleOffset = -1;
    L40:
        $this$appendSelectableInfo_u2dParwq6A.appendInfo(selectableId, rawStartHandleOffset2, startXHandleDirection, otherDirection2, rawStartHandleOffset3, endXHandleDirection, endYHandleDirection2, rawPreviousHandleOffset, textLayoutResult);
        return;
    L39:
        rawPreviousHandleOffset = m1436getOffsetForPosition3MmeM6k(previousHandlePosition, textLayoutResult);
        goto L40
    L36:
        r5 = false;
    L24:
        r1 = rawStartHandleOffset;
        goto L25
    L26:
        startXHandleDirection = startXHandleDirection;
        int rawEndHandleOffset = m1436getOffsetForPosition3MmeM6k(localPosition, textLayoutResult);
        Selection r6 = $this$appendSelectableInfo_u2dParwq6A.getPreviousSelection();
        if (r6 == null) goto L31;
        Selection.AnchorInfo r7 = r6.getStart();
        if (r7 == null) goto L31;
        int r8 = getPreviousAdjustedOffset(r7, $this$appendSelectableInfo_u2dParwq6A.getSelectableIdOrderingComparator(), r4, textLength);
    L32:
        int rawStartHandleOffset4 = r8;
        rawStartHandleOffset2 = rawStartHandleOffset4;
        rawStartHandleOffset3 = rawEndHandleOffset;
    L31:
        r8 = rawEndHandleOffset;
        goto L32
    L8:
        Selection r9 = $this$appendSelectableInfo_u2dParwq6A.getPreviousSelection();
        if (r9 == null) goto L11;
        r3 = r9.getStart();
    L11:
        Selection.AnchorInfo r10 = r3;
        r4 = selectableId;
        otherDirection2 = appendSelectableInfo_Parwq6A$otherDirection(currentXDirection, currentYDirection, $this$appendSelectableInfo_u2dParwq6A, r4, r10);
        currentXDirection2 = currentXDirection;
        currentXDirection3 = currentYDirection;
        startXHandleDirection = otherDirection2;
        endYHandleDirection = otherDirection2;
        endYHandleDirection2 = currentXDirection3;
        endXHandleDirection = currentXDirection2;
        goto L12
    }

    private static final Direction appendSelectableInfo_Parwq6A$otherDirection(Direction currentXDirection, Direction currentYDirection, SelectionLayoutBuilder $this_appendSelectableInfo, long $selectableId, Selection.AnchorInfo anchor) {
        if (anchor == null) goto L6;
        Direction r0 = getDirectionById($this_appendSelectableInfo, anchor.getSelectableId(), $selectableId);
        if (r0 == null) goto L6;
        return r0;
    L6:
        return SelectionLayoutKt.resolve2dDirection(currentXDirection, currentYDirection);
    }

    private static final int getPreviousAdjustedOffset(Selection.AnchorInfo $this$getPreviousAdjustedOffset, Comparator<Long> r3, long currentSelectableId, int currentTextLength) {
        int compareResult = r3.compare(Long.valueOf($this$getPreviousAdjustedOffset.getSelectableId()), Long.valueOf(currentSelectableId));
        if (compareResult >= 0) goto L5;
        return 0;
    L5:
        if (compareResult <= 0) goto L8;
        return currentTextLength;
    L8:
        return $this$getPreviousAdjustedOffset.getOffset();
    }

    /* JADX INFO: renamed from: getXDirection-3MmeM6k, reason: not valid java name */
    private static final Direction m1437getXDirection3MmeM6k(long position, Rect bounds) {
        int bits$iv$iv$iv = (int) (position >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv) < bounds.getLeft()) goto L10;
        int bits$iv$iv$iv2 = (int) (position >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv2) <= bounds.getRight()) goto L9;
        return Direction.AFTER;
    L9:
        return Direction.ON;
    L10:
        return Direction.BEFORE;
    }

    /* JADX INFO: renamed from: getYDirection-3MmeM6k, reason: not valid java name */
    private static final Direction m1438getYDirection3MmeM6k(long position, Rect bounds) {
        int bits$iv$iv$iv = (int) (position & 4294967295L);
        if (Float.intBitsToFloat(bits$iv$iv$iv) < bounds.getTop()) goto L10;
        int bits$iv$iv$iv2 = (int) (4294967295L & position);
        if (Float.intBitsToFloat(bits$iv$iv$iv2) <= bounds.getBottom()) goto L9;
        return Direction.AFTER;
    L9:
        return Direction.ON;
    L10:
        return Direction.BEFORE;
    }

    private static final Direction getDirectionById(SelectionLayoutBuilder $this$getDirectionById, long anchorSelectableId, long currentSelectableId) {
        int compareResult = $this$getDirectionById.getSelectableIdOrderingComparator().compare(Long.valueOf(anchorSelectableId), Long.valueOf(currentSelectableId));
        if (compareResult < 0) goto L9;
        if (compareResult <= 0) goto L8;
        return Direction.AFTER;
    L8:
        return Direction.ON;
    L9:
        return Direction.BEFORE;
    }

    private static final boolean isSelected(Direction currentDirection, Direction otherDirection) {
        if (currentDirection == Direction.ON) goto L7;
        if (currentDirection != otherDirection) goto L7;
        return false;
    L7:
        return true;
    }

    /* JADX INFO: renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    private static final int m1436getOffsetForPosition3MmeM6k(long position, TextLayoutResult textLayoutResult) {
        int bits$iv$iv$iv = (int) (position & 4294967295L);
        if (Float.intBitsToFloat(bits$iv$iv$iv) > 0.0f) goto L5;
        return 0;
    L5:
        int bits$iv$iv$iv2 = (int) (4294967295L & position);
        if (Float.intBitsToFloat(bits$iv$iv$iv2) < textLayoutResult.getMultiParagraph().getHeight()) goto L9;
        return textLayoutResult.getLayoutInput().getText().length();
    L9:
        return textLayoutResult.m6387getOffsetForPositionk4lQ0M(position);
    }
}
