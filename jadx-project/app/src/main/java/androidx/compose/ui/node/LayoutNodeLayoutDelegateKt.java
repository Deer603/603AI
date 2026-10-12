package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.Measurable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0006\u001a\u00020\u0007\"\b\b\u0000\u0010\b*\u00020\t*\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\b0\rH\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000e"}, d2 = {"MeasuredTwiceErrorMessage", "", "isOutMostLookaheadRoot", "", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)Z", "updateChildMeasurables", "", "T", "Landroidx/compose/ui/layout/Measurable;", "destination", "Landroidx/compose/runtime/collection/MutableVector;", "transform", "Lkotlin/Function1;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LayoutNodeLayoutDelegateKt {
    public static final String MeasuredTwiceErrorMessage = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()";

    public static final boolean isOutMostLookaheadRoot(LayoutNode $this$isOutMostLookaheadRoot) {
        if ($this$isOutMostLookaheadRoot.getLookaheadRoot$ui_release() == null) goto L12;
        LayoutNode r0 = $this$isOutMostLookaheadRoot.getParent$ui_release();
        if (r0 == null) goto L7;
        LayoutNode r1 = r0.getLookaheadRoot$ui_release();
    L8:
        if (r1 != null) goto L10;
    L11:
        return true;
    L10:
        if ($this$isOutMostLookaheadRoot.getLayoutDelegate$ui_release().getDetachedFromParentLookaheadPass$ui_release() == false) goto L12;
    L7:
        r1 = null;
    L12:
        return false;
    }

    public static final <T extends Measurable> void updateChildMeasurables(LayoutNode $this$updateChildMeasurables, MutableVector<T> r13, Function1<? super LayoutNode, ? extends T> r14) {
        MutableVector<LayoutNode> r3 = $this$updateChildMeasurables.get_children$ui_release();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r3.content;
        int size$iv$iv = r3.getSize();
    L3:
        if (i$iv$iv >= size$iv$iv) goto L9;
        LayoutNode layoutNode = (LayoutNode) content$iv$iv[i$iv$iv];
        int i = i$iv$iv;
        if (r13.getSize() > i) goto L7;
        r13.add(r14.invoke(layoutNode));
    L8:
        i$iv$iv = i$iv$iv + 1;
        goto L3
    L7:
        r13.set(i, r14.invoke(layoutNode));
        goto L8
    L9:
        r13.removeRange($this$updateChildMeasurables.getChildren$ui_release().size(), r13.getSize());
    }
}
