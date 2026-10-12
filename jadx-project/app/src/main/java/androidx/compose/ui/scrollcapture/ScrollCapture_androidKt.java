package androidx.compose.ui.scrollcapture;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.SemanticsUtils_androidKt;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ScrollCapture.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a.\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00100\u0015H\u0002\u001a\u0012\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018*\u00020\u0002H\u0002\u001a!\u0010\u0019\u001a\u00020\u0010*\u00020\u00022\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0015H\u0082\b\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"E\u0010\u0005\u001a/\b\u0001\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0006*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"canScrollVertically", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "getCanScrollVertically", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "scrollCaptureScrollByAction", "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "offset", "Lkotlin/coroutines/Continuation;", "", "getScrollCaptureScrollByAction", "(Landroidx/compose/ui/semantics/SemanticsNode;)Lkotlin/jvm/functions/Function2;", "visitScrollCaptureCandidates", "", "fromNode", "depth", "", "onCandidate", "Lkotlin/Function1;", "Landroidx/compose/ui/scrollcapture/ScrollCaptureCandidate;", "getChildrenForSearch", "", "visitDescendants", "onNode", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ScrollCapture_androidKt {
    static /* synthetic */ void visitScrollCaptureCandidates$default(SemanticsNode r0, int r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r1 = 0;
    L5:
        visitScrollCaptureCandidates(r0, r1, r2);
    }

    private static final void visitScrollCaptureCandidates(SemanticsNode fromNode, int depth, Function1<? super ScrollCaptureCandidate, Unit> r13) {
        MutableVector nodes$iv = new MutableVector(new SemanticsNode[16], 0);
        nodes$iv.addAll(nodes$iv.getSize(), getChildrenForSearch(fromNode));
    L3:
        boolean visitChildren$iv = true;
        if (nodes$iv.getSize() == 0) goto L6;
        boolean r2 = true;
    L7:
        if (r2 == false) goto L29;
        SemanticsNode node$iv = (SemanticsNode) nodes$iv.removeAt(nodes$iv.getSize() - 1);
        if (SemanticsUtils_androidKt.isHidden(node$iv) == false) goto L11;
    L24:
        visitChildren$iv = false;
    L26:
        if (visitChildren$iv == false) goto L3;
        nodes$iv.addAll(nodes$iv.getSize(), getChildrenForSearch(node$iv));
        goto L3
    L11:
        if (node$iv.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getDisabled()) == true) goto L24;
        NodeCoordinator r8 = node$iv.findCoordinatorToGetBounds$ui_release();
        if (r8 == null) goto L22;
        LayoutCoordinates nodeCoordinates = r8.getCoordinates();
        IntRect viewportBoundsInWindow = IntRectKt.roundToIntRect(LayoutCoordinatesKt.boundsInWindow(nodeCoordinates));
        if (viewportBoundsInWindow.isEmpty() == false) goto L19;
        visitChildren$iv = false;
        goto L26
    L19:
        if (getCanScrollVertically(node$iv) == false) goto L26;
        int candidateDepth = depth + 1;
        r13.invoke(new ScrollCaptureCandidate(node$iv, candidateDepth, viewportBoundsInWindow, nodeCoordinates));
        visitScrollCaptureCandidates(node$iv, candidateDepth, r13);
        visitChildren$iv = false;
        goto L26
    L22:
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Expected semantics node to have a coordinator.");
        throw new KotlinNothingValueException();
    L29:
        return;
    L6:
        r2 = false;
        goto L7
    }

    public static final Function2<Offset, Continuation<? super Offset>, Object> getScrollCaptureScrollByAction(SemanticsNode $this$scrollCaptureScrollByAction) {
        return (Function2) SemanticsConfigurationKt.getOrNull($this$scrollCaptureScrollByAction.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getScrollByOffset());
    }

    private static final boolean getCanScrollVertically(SemanticsNode $this$canScrollVertically) {
        Function2<Offset, Continuation<? super Offset>, Object> r0 = getScrollCaptureScrollByAction($this$canScrollVertically);
        ScrollAxisRange verticalScrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull($this$canScrollVertically.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
        if (r0 == null) goto L8;
        if (verticalScrollAxisRange == null) goto L8;
        if (verticalScrollAxisRange.getMaxValue().invoke().floatValue() <= 0.0f) goto L8;
        return true;
    L8:
        return false;
    }

    private static final void visitDescendants(SemanticsNode $this$visitDescendants, Function1<? super SemanticsNode, Boolean> r10) {
        MutableVector nodes = new MutableVector(new SemanticsNode[16], 0);
        nodes.addAll(nodes.getSize(), getChildrenForSearch($this$visitDescendants));
    L4:
        if (nodes.getSize() == 0) goto L6;
        boolean r1 = true;
    L7:
        if (r1 == false) goto L11;
        SemanticsNode node = (SemanticsNode) nodes.removeAt(nodes.getSize() - 1);
        boolean visitChildren = r10.invoke(node).booleanValue();
        if (visitChildren == false) goto L4;
        nodes.addAll(nodes.getSize(), getChildrenForSearch(node));
        goto L4
    L11:
        return;
    L6:
        r1 = false;
        goto L7
    }

    private static final List<SemanticsNode> getChildrenForSearch(SemanticsNode $this$getChildrenForSearch) {
        return $this$getChildrenForSearch.getChildren$ui_release(false, false, false);
    }
}
