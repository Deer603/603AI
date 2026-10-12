package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: SelectionLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aJ\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0000\u001a\u0014\u0010\u0014\u001a\u00020\u0015*\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\u0017\u001a\u00020\f*\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\u0014\u0010\u001a\u001a\u00020\f*\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"UNASSIGNED_SLOT", "", "getTextFieldSelectionLayout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "layoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "rawStartHandleOffset", "rawEndHandleOffset", "rawPreviousHandleOffset", "previousSelectionRange", "Landroidx/compose/ui/text/TextRange;", "isStartOfSelection", "", "isStartHandle", "getTextFieldSelectionLayout-RcvT-LA", "(Landroidx/compose/ui/text/TextLayoutResult;IIIJZZ)Landroidx/compose/foundation/text/selection/SelectionLayout;", "resolve2dDirection", "Landroidx/compose/foundation/text/selection/Direction;", "x", "y", "getTextDirectionForOffset", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "offset", "isCollapsed", "Landroidx/compose/foundation/text/selection/Selection;", "layout", "isOffsetAnEmptyLine", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SelectionLayoutKt {
    public static final int UNASSIGNED_SLOT = -1;

    /* JADX INFO: compiled from: SelectionLayout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[Direction.values().length];
            r0[Direction.BEFORE.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L14:
            r0[Direction.ON.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L16:
            r0[Direction.AFTER.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L12:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public static final /* synthetic */ ResolvedTextDirection access$getTextDirectionForOffset(TextLayoutResult $receiver, int offset) {
        return getTextDirectionForOffset($receiver, offset);
    }

    /* JADX INFO: renamed from: getTextFieldSelectionLayout-RcvT-LA, reason: not valid java name */
    public static final SelectionLayout m1450getTextFieldSelectionLayoutRcvTLA(TextLayoutResult layoutResult, int rawStartHandleOffset, int rawEndHandleOffset, int rawPreviousHandleOffset, long previousSelectionRange, boolean isStartOfSelection, boolean isStartHandle) {
        if (isStartOfSelection == false) goto L5;
        Selection r9 = null;
    L7:
        return new SingleSelectionLayout(isStartHandle, 1, 1, r9, new SelectableInfo(1, 1, rawStartHandleOffset, rawEndHandleOffset, rawPreviousHandleOffset, layoutResult));
    L5:
        r9 = new Selection(new Selection.AnchorInfo(getTextDirectionForOffset(layoutResult, TextRange.m6417getStartimpl(previousSelectionRange)), TextRange.m6417getStartimpl(previousSelectionRange), 1), new Selection.AnchorInfo(getTextDirectionForOffset(layoutResult, TextRange.m6412getEndimpl(previousSelectionRange)), TextRange.m6412getEndimpl(previousSelectionRange), 1), TextRange.m6416getReversedimpl(previousSelectionRange));
        goto L7
    }

    public static final Direction resolve2dDirection(Direction x, Direction y) {
        switch(WhenMappings.$EnumSwitchMapping$0[y.ordinal()]) {
            case 1: goto L15;
            case 2: goto L8;
            case 3: goto L16;
            default: goto L5;
        };
    L5:
        throw new NoWhenBranchMatchedException();
    L16:
        return Direction.AFTER;
    L8:
        switch(WhenMappings.$EnumSwitchMapping$0[x.ordinal()]) {
            case 1: goto L19;
            case 2: goto L18;
            case 3: goto L17;
            default: goto L10;
        };
    L10:
        throw new NoWhenBranchMatchedException();
    L17:
        return Direction.AFTER;
    L18:
        return Direction.ON;
    L19:
        return Direction.BEFORE;
    L15:
        return Direction.BEFORE;
    }

    private static final ResolvedTextDirection getTextDirectionForOffset(TextLayoutResult $this$getTextDirectionForOffset, int offset) {
        if (isOffsetAnEmptyLine($this$getTextDirectionForOffset, offset) == false) goto L6;
        return $this$getTextDirectionForOffset.getParagraphDirection(offset);
    L6:
        return $this$getTextDirectionForOffset.getBidiRunDirection(offset);
    }

    private static final boolean isOffsetAnEmptyLine(TextLayoutResult $this$isOffsetAnEmptyLine, int offset) {
        if ($this$isOffsetAnEmptyLine.getLayoutInput().getText().length() != 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L20;
        int currentLine = $this$isOffsetAnEmptyLine.getLineForOffset(offset);
        if (offset == 0) goto L12;
        if (currentLine != $this$isOffsetAnEmptyLine.getLineForOffset(offset - 1)) goto L12;
    L16:
        int currentLine2 = 0;
    L18:
        if (currentLine2 != 0) goto L20;
        return false;
    L12:
        if (offset != $this$isOffsetAnEmptyLine.getLayoutInput().getText().length()) goto L14;
    L17:
        currentLine2 = 1;
        goto L18
    L14:
        if (currentLine == $this$isOffsetAnEmptyLine.getLineForOffset(offset + 1)) goto L16;
    L20:
        return true;
    L5:
        r0 = false;
        goto L6
    }

    public static final boolean isCollapsed(Selection $this$isCollapsed, SelectionLayout layout) {
        if ($this$isCollapsed != null) goto L5;
        return true;
    L5:
        if (layout != null) goto L8;
        return true;
    L8:
        if ($this$isCollapsed.getStart().getSelectableId() != $this$isCollapsed.getEnd().getSelectableId()) goto L15;
        if ($this$isCollapsed.getStart().getOffset() != $this$isCollapsed.getEnd().getOffset()) goto L13;
        return true;
    L13:
        return false;
    L15:
        if ($this$isCollapsed.getHandlesCrossed() == false) goto L17;
        Selection.AnchorInfo maxAnchor = $this$isCollapsed.getStart();
    L19:
        if (maxAnchor.getOffset() == 0) goto L22;
        return false;
    L22:
        if ($this$isCollapsed.getHandlesCrossed() == false) goto L24;
        Selection.AnchorInfo minAnchor = $this$isCollapsed.getEnd();
    L26:
        if (layout.getFirstInfo().getTextLength() == minAnchor.getOffset()) goto L28;
        return false;
    L28:
        final Ref.BooleanRef allTextsEmpty = new Ref.BooleanRef();
        allTextsEmpty.element = true;
        layout.forEachMiddleInfo(new AnonymousClass1(allTextsEmpty));
        return allTextsEmpty.element;
    L24:
        minAnchor = $this$isCollapsed.getStart();
        goto L26
    L17:
        maxAnchor = $this$isCollapsed.getEnd();
        goto L19
    }
}
