package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutModifierNodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"calculateAlignmentAndPlaceChildAsNeeded", "", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LayoutModifierNodeCoordinatorKt {
    public static final /* synthetic */ int access$calculateAlignmentAndPlaceChildAsNeeded(LookaheadCapablePlaceable $receiver, AlignmentLine alignmentLine) {
        return calculateAlignmentAndPlaceChildAsNeeded($receiver, alignmentLine);
    }

    private static final int calculateAlignmentAndPlaceChildAsNeeded(LookaheadCapablePlaceable $this$calculateAlignmentAndPlaceChildAsNeeded, AlignmentLine alignmentLine) {
        LookaheadCapablePlaceable child = $this$calculateAlignmentAndPlaceChildAsNeeded.getChild();
        if (child == null) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L10;
        InlineClassHelperKt.throwIllegalStateException("Child of " + $this$calculateAlignmentAndPlaceChildAsNeeded + " cannot be null when calculating alignment line");
    L10:
        if ($this$calculateAlignmentAndPlaceChildAsNeeded.getMeasureResult$ui_release().getAlignmentLines().containsKey(alignmentLine) == false) goto L15;
        Integer r1 = $this$calculateAlignmentAndPlaceChildAsNeeded.getMeasureResult$ui_release().getAlignmentLines().get(alignmentLine);
        if (r1 != null) goto L14;
        return Integer.MIN_VALUE;
    L14:
        return r1.intValue();
    L15:
        int positionInWrapped = child.get(alignmentLine);
        if (positionInWrapped != Integer.MIN_VALUE) goto L18;
        return Integer.MIN_VALUE;
    L18:
        child.setShallowPlacing$ui_release(true);
        $this$calculateAlignmentAndPlaceChildAsNeeded.setPlacingForAlignment$ui_release(true);
        $this$calculateAlignmentAndPlaceChildAsNeeded.replace$ui_release();
        child.setShallowPlacing$ui_release(false);
        $this$calculateAlignmentAndPlaceChildAsNeeded.setPlacingForAlignment$ui_release(false);
        if ((alignmentLine instanceof HorizontalAlignmentLine) == false) goto L22;
        return IntOffset.m7102getYimpl(child.mo5909getPositionnOccac()) + positionInWrapped;
    L22:
        return IntOffset.m7101getXimpl(child.mo5909getPositionnOccac()) + positionInWrapped;
    L5:
        value$iv = false;
        goto L7
    }
}
