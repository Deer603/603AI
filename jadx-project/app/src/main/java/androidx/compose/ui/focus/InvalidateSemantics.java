package androidx.compose.ui.focus;

import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: FocusTargetModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/focus/InvalidateSemantics;", "", "()V", "onDispatchEventsCompleted", "", "focusTargetNode", "Landroidx/compose/ui/focus/FocusTargetNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class InvalidateSemantics {
    public static final InvalidateSemantics INSTANCE = null;

    static {
        INSTANCE = new InvalidateSemantics();
    }

    private InvalidateSemantics() {
    }

    public final void onDispatchEventsCompleted(FocusTargetNode focusTargetNode) {
        Object r0 = focusTargetNode.getNode();
        if ((r0 instanceof SemanticsModifierNode) == false) goto L5;
        SemanticsModifierNode r1 = (SemanticsModifierNode) r0;
    L6:
        if (r1 == null) goto L9;
        SemanticsModifierNodeKt.invalidateSemantics(r1);
        return;
    L9:
        return;
    L5:
        r1 = null;
        goto L6
    }
}
