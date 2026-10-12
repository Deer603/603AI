package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;

/* JADX INFO: compiled from: FocusEventModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0000¨\u0006\u0005"}, d2 = {"getFocusState", "Landroidx/compose/ui/focus/FocusState;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "invalidateFocusEvent", "", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FocusEventModifierNodeKt {

    /* JADX INFO: compiled from: FocusEventModifierNode.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[FocusStateImpl.values().length];
            r0[FocusStateImpl.Active.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L17:
            r0[FocusStateImpl.ActiveParent.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L19:
            r0[FocusStateImpl.Captured.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L23:
            r0[FocusStateImpl.Inactive.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L15:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public static final void invalidateFocusEvent(FocusEventModifierNode $this$invalidateFocusEvent) {
        DelegatableNodeKt.requireOwner($this$invalidateFocusEvent).getFocusOwner().scheduleInvalidation($this$invalidateFocusEvent);
    }

    public static final FocusState getFocusState(FocusEventModifierNode $this$getFocusState) {
        FocusEventModifierNode $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$getFocusState;
        int type$iv = NodeKind.m5976constructorimpl(1024);
        boolean zOrder$iv = false;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv.getNode();
        MutableVector r6 = null;
        Modifier.Node r7 = $this$dispatchForKind_u2d6rFNWt0$iv$iv;
    L3:
        int count$iv$iv = 0;
        int r9 = 1;
        if (r7 == null) goto L48;
        if ((r7 instanceof FocusTargetNode) == true) goto L7;
        Modifier.Node this_$iv$iv$iv = r7;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L17;
        boolean r10 = true;
    L18:
        if (r10 == false) goto L46;
        if ((r7 instanceof DelegatingNode) == false) goto L46;
        int count$iv$iv2 = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r7;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L22:
        if (node$iv$iv$iv == null) goto L43;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L26;
        int r16 = r9;
    L27:
        if (r16 == 0) goto L41;
        count$iv$iv2 = count$iv$iv2 + 1;
        if (count$iv$iv2 != r9) goto L31;
        r7 = next$iv$iv;
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
    L42:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        r9 = 1;
        goto L22
    L31:
        if (r6 != null) goto L33;
        MutableVector r0 = new MutableVector(new Modifier.Node[16], 0);
    L34:
        r6 = r0;
        Modifier.Node theNode$iv$iv = r7;
        if (theNode$iv$iv == null) goto L39;
        if (r6 == null) goto L38;
        r6.add(theNode$iv$iv);
    L38:
        r7 = null;
    L39:
        if (r6 == null) goto L42;
        r6.add(next$iv$iv);
        goto L42
    L33:
        r0 = r6;
        goto L34
    L41:
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        goto L42
    L26:
        r16 = 0;
        goto L27
    L43:
        DelegatableNode $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        int type$iv2 = type$iv;
        if (count$iv$iv2 != 1) goto L47;
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
    L47:
        r7 = DelegatableNodeKt.access$pop(r6);
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
    L46:
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        goto L47
    L17:
        r10 = false;
        goto L18
    L7:
        FocusTargetNode it = (FocusTargetNode) r7;
        FocusStateImpl focusState = it.getFocusState();
        switch(WhenMappings.$EnumSwitchMapping$0[focusState.ordinal()]) {
            case 1: goto L12;
            case 2: goto L12;
            case 3: goto L12;
            case 4: goto L13;
            default: goto L13;
        };
    L13:
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        goto L47
    L12:
        return focusState;
    L48:
        DelegatableNode $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv3 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        int type$iv3 = type$iv;
        int mask$iv$iv = type$iv3;
        DelegatableNode $this$visitChildren$iv$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv3;
        boolean value$iv$iv$iv = $this$visitChildren$iv$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L51;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L51:
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv = $this$visitChildren$iv$iv.getNode().getChild$ui_release();
        if (child$iv$iv != null) goto L54;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, $this$visitChildren$iv$iv.getNode(), false);
    L56:
        if (branches$iv$iv.getSize() == 0) goto L58;
        int r8 = 1;
    L59:
        if (r8 == 0) goto L117;
        Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(branches$iv$iv.getSize() - 1);
        if ((branch$iv$iv.getAggregateChildKindSet$ui_release() & mask$iv$iv) == 0) goto L62;
        Modifier.Node node$iv$iv = branch$iv$iv;
    L64:
        if (node$iv$iv == null) goto L115;
        if ((node$iv$iv.getKindSet$ui_release() & mask$iv$iv) != 0) goto L67;
        node$iv$iv = node$iv$iv.getChild$ui_release();
        mask$iv$iv = mask$iv$iv;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        goto L64
    L67:
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r14 = null;
        Modifier.Node r15 = it$iv;
    L68:
        if (r15 == null) goto L113;
        if ((r15 instanceof FocusTargetNode) == true) goto L71;
        Modifier.Node this_$iv$iv$iv3 = r15;
        if ((this_$iv$iv$iv3.getKindSet$ui_release() & type$iv3) == 0) goto L81;
        boolean r11 = true;
    L82:
        if (r11 == false) goto L111;
        if ((r15 instanceof DelegatingNode) == false) goto L111;
        int count$iv$iv3 = 0;
        DelegatingNode this_$iv$iv$iv4 = (DelegatingNode) r15;
        Modifier.Node node$iv$iv$iv2 = this_$iv$iv$iv4.getDelegate$ui_release();
    L86:
        if (node$iv$iv$iv2 == null) goto L108;
        Modifier.Node next$iv$iv2 = node$iv$iv$iv2;
        if ((next$iv$iv2.getKindSet$ui_release() & type$iv3) == 0) goto L90;
        boolean r25 = true;
    L91:
        if (r25 == false) goto L106;
        count$iv$iv3 = count$iv$iv3 + 1;
        int mask$iv$iv2 = mask$iv$iv;
        if (count$iv$iv3 != 1) goto L95;
        r15 = next$iv$iv2;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        zOrder$iv = zOrder$iv;
    L107:
        node$iv$iv$iv2 = node$iv$iv$iv2.getChild$ui_release();
        mask$iv$iv = mask$iv$iv2;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        zOrder$iv = zOrder$iv;
        goto L86
    L95:
        if (r14 != null) goto L97;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L98:
        r14 = r1;
        Modifier.Node theNode$iv$iv2 = r15;
        if (theNode$iv$iv2 == null) goto L103;
        if (r14 == null) goto L102;
        r14.add(theNode$iv$iv2);
    L102:
        r15 = null;
    L103:
        if (r14 == null) goto L107;
        r14.add(next$iv$iv2);
        goto L107
    L97:
        r1 = r14;
        goto L98
    L106:
        mask$iv$iv2 = mask$iv$iv;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        zOrder$iv = zOrder$iv;
        goto L107
    L90:
        r25 = false;
        goto L91
    L108:
        int mask$iv$iv3 = mask$iv$iv;
        DelegatableNode $this$visitChildren$iv$iv2 = $this$visitChildren$iv$iv;
        boolean zOrder$iv2 = zOrder$iv;
        int mask$iv$iv4 = 0;
        if (count$iv$iv3 != 1) goto L112;
        count$iv$iv = 0;
        mask$iv$iv = mask$iv$iv3;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv2;
        zOrder$iv = zOrder$iv2;
    L112:
        r15 = DelegatableNodeKt.access$pop(r14);
        count$iv$iv = mask$iv$iv4;
        mask$iv$iv = mask$iv$iv3;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv2;
        zOrder$iv = zOrder$iv2;
    L111:
        mask$iv$iv3 = mask$iv$iv;
        $this$visitChildren$iv$iv2 = $this$visitChildren$iv$iv;
        zOrder$iv2 = zOrder$iv;
        mask$iv$iv4 = 0;
        goto L112
    L81:
        r11 = false;
        goto L82
    L71:
        FocusTargetNode it2 = (FocusTargetNode) r15;
        FocusStateImpl focusState2 = it2.getFocusState();
        switch(WhenMappings.$EnumSwitchMapping$0[focusState2.ordinal()]) {
            case 1: goto L76;
            case 2: goto L76;
            case 3: goto L76;
            case 4: goto L77;
            default: goto L77;
        };
    L77:
        mask$iv$iv3 = mask$iv$iv;
        $this$visitChildren$iv$iv2 = $this$visitChildren$iv$iv;
        zOrder$iv2 = zOrder$iv;
        mask$iv$iv4 = 0;
        goto L112
    L76:
        return focusState2;
    L113:
        mask$iv$iv = mask$iv$iv;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        goto L56
    L115:
        mask$iv$iv = mask$iv$iv;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        goto L56
    L62:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, branch$iv$iv, zOrder$iv);
        goto L56
    L117:
        return FocusStateImpl.Inactive;
    L58:
        r8 = count$iv$iv;
        goto L59
    L54:
        branches$iv$iv.add(child$iv$iv);
        goto L56
    }
}
