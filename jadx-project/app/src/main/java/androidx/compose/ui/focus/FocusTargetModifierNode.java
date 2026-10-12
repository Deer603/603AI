package androidx.compose.ui.focus;

import androidx.compose.ui.node.DelegatableNode;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* JADX INFO: compiled from: FocusTargetModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\b\u0010\f\u001a\u00020\rH'J\u001c\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH&ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\u00020\u0007X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u0082\u0001\u0001\u0012ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "focusState", "Landroidx/compose/ui/focus/FocusState;", "getFocusState", "()Landroidx/compose/ui/focus/FocusState;", "focusability", "Landroidx/compose/ui/focus/Focusability;", "getFocusability-LCbbffg", "()I", "setFocusability-josRg5g", "(I)V", "requestFocus", "", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "requestFocus-3ESFkO8", "(I)Z", "Landroidx/compose/ui/focus/FocusTargetNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface FocusTargetModifierNode extends DelegatableNode {
    FocusState getFocusState();

    /* JADX INFO: renamed from: getFocusability-LCbbffg, reason: not valid java name */
    int mo4039getFocusabilityLCbbffg();

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the version accepting FocusDirection", replaceWith = @ReplaceWith(expression = "this.requestFocus()", imports = {}))
    /* synthetic */ boolean requestFocus();

    /* JADX INFO: renamed from: requestFocus-3ESFkO8, reason: not valid java name */
    boolean mo4040requestFocus3ESFkO8(int r1);

    /* JADX INFO: renamed from: setFocusability-josRg5g, reason: not valid java name */
    void mo4041setFocusabilityjosRg5g(int r1);

    /* JADX INFO: renamed from: requestFocus-3ESFkO8$default, reason: not valid java name */
    static /* synthetic */ boolean m4038requestFocus3ESFkO8$default(FocusTargetModifierNode r0, int r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L7;
        r1 = FocusDirection.Companion.m4014getEnterdhqQ8s();
    L7:
        return r0.mo4040requestFocus3ESFkO8(r1);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestFocus-3ESFkO8");
    }
}
