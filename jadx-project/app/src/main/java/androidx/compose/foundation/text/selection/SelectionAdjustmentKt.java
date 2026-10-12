package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX INFO: compiled from: SelectionAdjustment.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a,\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u001c\u0010\u000e\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\rH\u0002\u001a\u0014\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u001c\u0010\u0013\u001a\u00020\n*\u00020\b2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u001a4\u0010\u0015\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u001c\u0010\u0019\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0007X\u008a\u0084\u0002"}, d2 = {"adjustToBoundaries", "Landroidx/compose/foundation/text/selection/Selection;", "layout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "boundaryFunction", "Landroidx/compose/foundation/text/selection/BoundaryFunction;", "anchorOnBoundary", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "crossed", "", "isStart", "slot", "", "changeOffset", "info", "newOffset", "ensureAtLeastOneChar", "expandOneChar", "isExpanding", "currentRawOffset", "snapToWordBoundary", "currentLine", "currentOffset", "otherOffset", "updateSelectionBoundary", "previousSelectionAnchor", "foundation_release", "currentRawLine", "anchorSnappedToWordBoundary"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SelectionAdjustmentKt {
    public static final /* synthetic */ Selection access$adjustToBoundaries(SelectionLayout layout, BoundaryFunction boundaryFunction) {
        return adjustToBoundaries(layout, boundaryFunction);
    }

    public static final /* synthetic */ Selection.AnchorInfo access$snapToWordBoundary(SelectableInfo $receiver, int currentLine, int currentOffset, int otherOffset, boolean isStart, boolean crossed) {
        return snapToWordBoundary($receiver, currentLine, currentOffset, otherOffset, isStart, crossed);
    }

    public static final /* synthetic */ Selection.AnchorInfo access$updateSelectionBoundary(SelectionLayout $receiver, SelectableInfo info, Selection.AnchorInfo previousSelectionAnchor) {
        return updateSelectionBoundary($receiver, info, previousSelectionAnchor);
    }

    public static final /* synthetic */ int access$updateSelectionBoundary$lambda$0(Lazy $currentRawLine$delegate) {
        return updateSelectionBoundary$lambda$0($currentRawLine$delegate);
    }

    private static final Selection.AnchorInfo updateSelectionBoundary(final SelectionLayout $this$updateSelectionBoundary, final SelectableInfo info, Selection.AnchorInfo previousSelectionAnchor) {
        if ($this$updateSelectionBoundary.isStartHandle() == false) goto L5;
        int r0 = info.getRawStartHandleOffset();
    L6:
        final int currentRawOffset = r0;
        if ($this$updateSelectionBoundary.isStartHandle() == false) goto L9;
        int currentSlot = $this$updateSelectionBoundary.getStartSlot();
    L11:
        if (currentSlot != info.getSlot()) goto L13;
        final Lazy currentRawLine$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new SelectionAdjustmentKt$updateSelectionBoundary$currentRawLine$2(info, currentRawOffset));
        if ($this$updateSelectionBoundary.isStartHandle() == false) goto L17;
        int r1 = info.getRawEndHandleOffset();
    L18:
        final int otherRawOffset = r1;
        Lazy anchorSnappedToWordBoundary$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new SelectionAdjustmentKt$updateSelectionBoundary$anchorSnappedToWordBoundary$2(info, currentRawOffset, otherRawOffset, $this$updateSelectionBoundary, currentRawLine$delegate));
        if (info.getSelectableId() != previousSelectionAnchor.getSelectableId()) goto L21;
        int rawPreviousHandleOffset = info.getRawPreviousHandleOffset();
        if (currentRawOffset != rawPreviousHandleOffset) goto L25;
        return previousSelectionAnchor;
    L25:
        int previousRawLine = info.getTextLayoutResult().getLineForOffset(rawPreviousHandleOffset);
        if (updateSelectionBoundary$lambda$0(currentRawLine$delegate) != previousRawLine) goto L28;
        int previousSelectionOffset = previousSelectionAnchor.getOffset();
        long previousSelectionWordBoundary = info.getTextLayoutResult().m6389getWordBoundaryjx7JFs(previousSelectionOffset);
        if (isExpanding(info, currentRawOffset, $this$updateSelectionBoundary.isStartHandle()) == true) goto L34;
        return info.anchorForOffset(currentRawOffset);
    L34:
        if (previousSelectionOffset == TextRange.m6417getStartimpl(previousSelectionWordBoundary)) goto L41;
        if (previousSelectionOffset == TextRange.m6412getEndimpl(previousSelectionWordBoundary)) goto L41;
        return info.anchorForOffset(currentRawOffset);
    L41:
        return updateSelectionBoundary$lambda$1(anchorSnappedToWordBoundary$delegate);
    L28:
        return updateSelectionBoundary$lambda$1(anchorSnappedToWordBoundary$delegate);
    L21:
        return updateSelectionBoundary$lambda$1(anchorSnappedToWordBoundary$delegate);
    L17:
        r1 = info.getRawStartHandleOffset();
        goto L18
    L13:
        return info.anchorForOffset(currentRawOffset);
    L9:
        currentSlot = $this$updateSelectionBoundary.getEndSlot();
        goto L11
    L5:
        r0 = info.getRawEndHandleOffset();
        goto L6
    }

    private static final int updateSelectionBoundary$lambda$0(Lazy<Integer> r1) {
        return r1.getValue().intValue();
    }

    private static final Selection.AnchorInfo updateSelectionBoundary$lambda$1(Lazy<Selection.AnchorInfo> r1) {
        return r1.getValue();
    }

    private static final boolean isExpanding(SelectableInfo $this$isExpanding, int currentRawOffset, boolean isStart) {
        if ($this$isExpanding.getRawPreviousHandleOffset() != (-1)) goto L6;
        return true;
    L6:
        if (currentRawOffset != $this$isExpanding.getRawPreviousHandleOffset()) goto L9;
        return false;
    L9:
        if ($this$isExpanding.getRawCrossStatus() != CrossStatus.CROSSED) goto L11;
        boolean crossed = true;
    L13:
        if ((isStart ^ crossed) == false) goto L19;
        if (currentRawOffset >= $this$isExpanding.getRawPreviousHandleOffset()) goto L23;
        return true;
    L23:
        return false;
    L19:
        if (currentRawOffset <= $this$isExpanding.getRawPreviousHandleOffset()) goto L22;
        return true;
    L22:
        return false;
    L11:
        crossed = false;
        goto L13
    }

    private static final Selection.AnchorInfo snapToWordBoundary(SelectableInfo $this$snapToWordBoundary, int currentLine, int currentOffset, int otherOffset, boolean isStart, boolean crossed) {
        long wordBoundary = $this$snapToWordBoundary.getTextLayoutResult().m6389getWordBoundaryjx7JFs(currentOffset);
        int wordStartLine = $this$snapToWordBoundary.getTextLayoutResult().getLineForOffset(TextRange.m6417getStartimpl(wordBoundary));
        if (wordStartLine != currentLine) goto L6;
        int start = TextRange.m6417getStartimpl(wordBoundary);
    L9:
        int wordEndLine = $this$snapToWordBoundary.getTextLayoutResult().getLineForOffset(TextRange.m6412getEndimpl(wordBoundary));
        if (wordEndLine != currentLine) goto L13;
        int end = TextRange.m6412getEndimpl(wordBoundary);
    L17:
        if (start == otherOffset) goto L19;
        if (end != otherOffset) goto L24;
        return $this$snapToWordBoundary.anchorForOffset(start);
    L24:
        if ((isStart ^ crossed) == false) goto L27;
        if (currentOffset <= end) goto L29;
    L28:
        int resultOffset = end;
    L31:
        return $this$snapToWordBoundary.anchorForOffset(resultOffset);
    L29:
        resultOffset = start;
        goto L31
    L27:
        if (currentOffset < start) goto L29;
    L19:
        return $this$snapToWordBoundary.anchorForOffset(end);
    L13:
        if (currentLine < $this$snapToWordBoundary.getTextLayoutResult().getLineCount()) goto L15;
        end = TextLayoutResult.getLineEnd$default($this$snapToWordBoundary.getTextLayoutResult(), $this$snapToWordBoundary.getTextLayoutResult().getLineCount() - 1, false, 2, null);
        goto L17
    L15:
        end = TextLayoutResult.getLineEnd$default($this$snapToWordBoundary.getTextLayoutResult(), currentLine, false, 2, null);
        goto L17
    L6:
        if (currentLine < $this$snapToWordBoundary.getTextLayoutResult().getLineCount()) goto L8;
        start = $this$snapToWordBoundary.getTextLayoutResult().getLineStart($this$snapToWordBoundary.getTextLayoutResult().getLineCount() - 1);
        goto L9
    L8:
        start = $this$snapToWordBoundary.getTextLayoutResult().getLineStart(currentLine);
        goto L9
    }

    private static final Selection adjustToBoundaries(SelectionLayout layout, BoundaryFunction boundaryFunction) {
        if (layout.getCrossStatus() != CrossStatus.CROSSED) goto L5;
        boolean crossed = true;
    L7:
        return new Selection(anchorOnBoundary(layout.getStartInfo(), crossed, true, layout.getStartSlot(), boundaryFunction), anchorOnBoundary(layout.getEndInfo(), crossed, false, layout.getEndSlot(), boundaryFunction), crossed);
    L5:
        crossed = false;
        goto L7
    }

    private static final Selection.AnchorInfo anchorOnBoundary(SelectableInfo $this$anchorOnBoundary, boolean crossed, boolean isStart, int slot, BoundaryFunction boundaryFunction) {
        if (isStart == false) goto L4;
        int offset = $this$anchorOnBoundary.getRawStartHandleOffset();
    L6:
        if (slot != $this$anchorOnBoundary.getSlot()) goto L8;
        long range = boundaryFunction.mo1432getBoundaryfzxv0v0($this$anchorOnBoundary, offset);
        if ((isStart ^ crossed) == false) goto L12;
        int r3 = TextRange.m6417getStartimpl(range);
    L14:
        return $this$anchorOnBoundary.anchorForOffset(r3);
    L12:
        r3 = TextRange.m6412getEndimpl(range);
        goto L14
    L8:
        return $this$anchorOnBoundary.anchorForOffset(offset);
    L4:
        offset = $this$anchorOnBoundary.getRawEndHandleOffset();
        goto L6
    }

    public static final Selection ensureAtLeastOneChar(Selection $this$ensureAtLeastOneChar, SelectionLayout layout) {
        if (SelectionLayoutKt.isCollapsed($this$ensureAtLeastOneChar, layout) == true) goto L5;
        return $this$ensureAtLeastOneChar;
    L5:
        String text = layout.getCurrentInfo().getInputText();
        boolean r2 = true;
        if (layout.getSize() <= 1) goto L8;
    L17:
        return $this$ensureAtLeastOneChar;
    L8:
        if (layout.getPreviousSelection() == null) goto L17;
        if (text.length() == 0) goto L13;
        r2 = false;
    L13:
        if (r2 == true) goto L17;
        return expandOneChar($this$ensureAtLeastOneChar, layout);
    }

    private static final Selection expandOneChar(Selection $this$expandOneChar, SelectionLayout layout) {
        SelectableInfo info = layout.getCurrentInfo();
        String text = info.getInputText();
        int offset = info.getRawStartHandleOffset();
        int lastOffset = text.length();
        if (offset != 0) goto L9;
        int followingBreak = StringHelpers_androidKt.findFollowingBreak(text, 0);
        if (layout.isStartHandle() == false) goto L30;
        return Selection.copy$default($this$expandOneChar, changeOffset($this$expandOneChar.getStart(), info, followingBreak), null, true, 2, null);
    L30:
        return Selection.copy$default($this$expandOneChar, null, changeOffset($this$expandOneChar.getEnd(), info, followingBreak), false, 1, null);
    L9:
        if (offset != lastOffset) goto L14;
        int precedingBreak = StringHelpers_androidKt.findPrecedingBreak(text, lastOffset);
        if (layout.isStartHandle() == false) goto L32;
        return Selection.copy$default($this$expandOneChar, changeOffset($this$expandOneChar.getStart(), info, precedingBreak), null, false, 2, null);
    L32:
        return Selection.copy$default($this$expandOneChar, null, changeOffset($this$expandOneChar.getEnd(), info, precedingBreak), true, 1, null);
    L14:
        Selection r12 = layout.getPreviousSelection();
        if (r12 != null) goto L17;
    L19:
        boolean crossed = false;
    L21:
        if ((layout.isStartHandle() ^ crossed) == false) goto L23;
        int newOffset = StringHelpers_androidKt.findPrecedingBreak(text, offset);
    L25:
        if (layout.isStartHandle() == false) goto L28;
        return Selection.copy$default($this$expandOneChar, changeOffset($this$expandOneChar.getStart(), info, newOffset), null, crossed, 2, null);
    L28:
        return Selection.copy$default($this$expandOneChar, null, changeOffset($this$expandOneChar.getEnd(), info, newOffset), crossed, 1, null);
    L23:
        newOffset = StringHelpers_androidKt.findFollowingBreak(text, offset);
        goto L25
    L17:
        if (r12.getHandlesCrossed() != true) goto L19;
        crossed = true;
        goto L21
    }

    private static final Selection.AnchorInfo changeOffset(Selection.AnchorInfo $this$changeOffset, SelectableInfo info, int newOffset) {
        return Selection.AnchorInfo.copy$default($this$changeOffset, info.getTextLayoutResult().getBidiRunDirection(newOffset), newOffset, 0, 4, null);
    }
}
