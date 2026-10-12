package androidx.compose.ui.node;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MeasureScopeWithLayoutNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"getChildrenOfVirtualChildren", "", "Landroidx/compose/ui/layout/Measurable;", "scope", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "isInLookaheadPass", "", "Landroidx/compose/ui/node/LayoutNode;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MeasureScopeWithLayoutNodeKt {

    /* JADX INFO: compiled from: MeasureScopeWithLayoutNode.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[LayoutNode.LayoutState.values().length];
            r0[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L20:
            r0[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L24:
            r0[LayoutNode.LayoutState.Measuring.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L28:
            r0[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L22:
            r0[LayoutNode.LayoutState.Idle.ordinal()] = 5;     // Catch: NoSuchFieldError -> L17
        L18:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public static final List<List<Measurable>> getChildrenOfVirtualChildren(IntrinsicMeasureScope scope) {
        Intrinsics.checkNotNull(scope, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        LayoutNode layoutNode = ((MeasureScopeWithLayoutNode) scope).getLayoutNode();
        boolean lookahead = isInLookaheadPass(layoutNode);
        List<LayoutNode> r3 = layoutNode.getFoldedChildren$ui_release();
        List target$iv = new ArrayList(r3.size());
        int index$iv$iv = 0;
        int r9 = r3.size();
    L3:
        if (index$iv$iv >= r9) goto L9;
        Object item$iv$iv = r3.get(index$iv$iv);
        List r13 = target$iv;
        LayoutNode it = (LayoutNode) item$iv$iv;
        if (lookahead == false) goto L7;
        List<Measurable> r16 = it.getChildLookaheadMeasurables$ui_release();
    L8:
        r13.add(r16);
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L7:
        r16 = it.getChildMeasurables$ui_release();
        goto L8
    L9:
        List $this$fastMap$iv = target$iv;
        return $this$fastMap$iv;
    }

    private static final boolean isInLookaheadPass(LayoutNode $this$isInLookaheadPass) {
        LayoutNode.LayoutState r0 = $this$isInLookaheadPass.getLayoutState$ui_release();
        switch(WhenMappings.$EnumSwitchMapping$0[r0.ordinal()]) {
            case 1: goto L12;
            case 2: goto L12;
            case 3: goto L11;
            case 4: goto L11;
            case 5: goto L6;
            default: goto L5;
        };
    L6:
        LayoutNode r1 = $this$isInLookaheadPass.getParent$ui_release();
        if (r1 == null) goto L10;
        return isInLookaheadPass(r1);
    L10:
        throw new IllegalArgumentException("no parent for idle node".toString());
    L11:
        return false;
    L12:
        return true;
    L5:
        throw new NoWhenBranchMatchedException();
    }
}
