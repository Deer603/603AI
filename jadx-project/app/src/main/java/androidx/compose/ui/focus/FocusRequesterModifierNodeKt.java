package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;

/* JADX INFO: compiled from: FocusRequesterModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0002H\u0000\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0002¨\u0006\t"}, d2 = {"captureFocus", "", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "freeFocus", "pinFocusedChild", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "requestFocus", "restoreFocusedChild", "saveFocusedChild", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FocusRequesterModifierNodeKt {
    public static final boolean requestFocus(FocusRequesterModifierNode $this$requestFocus) {
        FocusRequesterModifierNode $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$requestFocus;
        int type$iv = NodeKind.m5976constructorimpl(1024);
        boolean zOrder$iv = false;
        int r3 = 0;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv.getNode();
        MutableVector r6 = null;
        Modifier.Node r7 = $this$dispatchForKind_u2d6rFNWt0$iv$iv;
    L3:
        boolean r9 = false;
        int r10 = 1;
        if (r7 == null) goto L46;
        if ((r7 instanceof FocusTargetNode) == true) goto L7;
        Modifier.Node this_$iv$iv$iv = r7;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L15;
        boolean r8 = true;
    L16:
        if (r8 == false) goto L44;
        if ((r7 instanceof DelegatingNode) == false) goto L44;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r7;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L20:
        if (node$iv$iv$iv == null) goto L41;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L24;
        int r16 = r10;
    L25:
        if (r16 == 0) goto L39;
        count$iv$iv = count$iv$iv + 1;
        if (count$iv$iv != r10) goto L29;
        r7 = next$iv$iv;
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
    L40:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        r10 = 1;
        goto L20
    L29:
        if (r6 != null) goto L31;
        MutableVector r0 = new MutableVector(new Modifier.Node[16], 0);
    L32:
        r6 = r0;
        Modifier.Node theNode$iv$iv = r7;
        if (theNode$iv$iv == null) goto L37;
        if (r6 == null) goto L36;
        r6.add(theNode$iv$iv);
    L36:
        r7 = null;
    L37:
        if (r6 == null) goto L40;
        r6.add(next$iv$iv);
        goto L40
    L31:
        r0 = r6;
        goto L32
    L39:
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        goto L40
    L24:
        r16 = 0;
        goto L25
    L41:
        DelegatableNode $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        int type$iv2 = type$iv;
        if (count$iv$iv == 1) goto L43;
    L45:
        r7 = DelegatableNodeKt.access$pop(r6);
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
        goto L3
    L43:
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
    L44:
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        goto L45
    L15:
        r8 = false;
        goto L16
    L7:
        FocusTargetNode focusTarget = (FocusTargetNode) r7;
        if (focusTarget.fetchFocusProperties$ui_release().getCanFocus() == false) goto L11;
        return FocusTargetModifierNode.m4038requestFocus3ESFkO8$default(focusTarget, 0, 1, null);
    L11:
        return TwoDimensionalFocusSearchKt.m4071findChildCorrespondingToFocusEnterOMvw8(focusTarget, FocusDirection.Companion.m4014getEnterdhqQ8s(), FocusRequesterModifierNodeKt$requestFocus$1$1.INSTANCE);
    L46:
        DelegatableNode $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv3 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        int type$iv3 = type$iv;
        int mask$iv$iv = type$iv3;
        DelegatableNode $this$visitChildren$iv$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv3;
        boolean value$iv$iv$iv = $this$visitChildren$iv$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L49;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L49:
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv = $this$visitChildren$iv$iv.getNode().getChild$ui_release();
        if (child$iv$iv != null) goto L52;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, $this$visitChildren$iv$iv.getNode(), false);
    L54:
        if (branches$iv$iv.getSize() == 0) goto L56;
        boolean r11 = true;
    L57:
        if (r11 == false) goto L113;
        Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(branches$iv$iv.getSize() - 1);
        if ((branch$iv$iv.getAggregateChildKindSet$ui_release() & mask$iv$iv) == 0) goto L60;
        Modifier.Node node$iv$iv = branch$iv$iv;
    L62:
        if (node$iv$iv == null) goto L112;
        if ((node$iv$iv.getKindSet$ui_release() & mask$iv$iv) != 0) goto L65;
        node$iv$iv = node$iv$iv.getChild$ui_release();
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        goto L62
    L65:
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r15 = null;
        Modifier.Node this_$iv$iv$iv3 = it$iv;
    L66:
        if (this_$iv$iv$iv3 == null) goto L110;
        if ((this_$iv$iv$iv3 instanceof FocusTargetNode) == true) goto L69;
        mask$iv$iv = mask$iv$iv;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        zOrder$iv = zOrder$iv;
        r3 = r3;
        if ((this_$iv$iv$iv3.getKindSet$ui_release() & type$iv3) == 0) goto L77;
        boolean r1 = true;
    L78:
        if (r1 == false) goto L109;
        if ((this_$iv$iv$iv3 instanceof DelegatingNode) == false) goto L109;
        int count$iv$iv2 = 0;
        DelegatingNode this_$iv$iv$iv4 = (DelegatingNode) this_$iv$iv$iv3;
        Modifier.Node node$iv$iv$iv2 = this_$iv$iv$iv4.getDelegate$ui_release();
    L82:
        if (node$iv$iv$iv2 == null) goto L106;
        Modifier.Node next$iv$iv2 = node$iv$iv$iv2;
        if ((next$iv$iv2.getKindSet$ui_release() & type$iv3) == 0) goto L86;
        boolean r26 = true;
    L87:
        if (r26 == false) goto L103;
        count$iv$iv2 = count$iv$iv2 + 1;
        if (count$iv$iv2 != 1) goto L91;
        this_$iv$iv$iv3 = next$iv$iv2;
        this_$iv$iv$iv4 = this_$iv$iv$iv4;
    L104:
        node$iv$iv$iv2 = node$iv$iv$iv2.getChild$ui_release();
        this_$iv$iv$iv4 = this_$iv$iv$iv4;
        goto L82
    L91:
        if (r15 != null) goto L93;
        MutableVector r2 = new MutableVector(new Modifier.Node[16], 0);
    L94:
        r15 = r2;
        Modifier.Node theNode$iv$iv2 = this_$iv$iv$iv3;
        if (theNode$iv$iv2 == null) goto L99;
        if (r15 == null) goto L98;
        r15.add(theNode$iv$iv2);
    L98:
        this_$iv$iv$iv3 = null;
    L99:
        if (r15 == null) goto L102;
        r15.add(next$iv$iv2);
    L102:
        count$iv$iv2 = count$iv$iv2;
        goto L104
    L93:
        r2 = r15;
        goto L94
    L103:
        this_$iv$iv$iv4 = this_$iv$iv$iv4;
        goto L104
    L86:
        r26 = false;
        goto L87
    L106:
        if (count$iv$iv2 == 1) goto L66;
    L109:
        this_$iv$iv$iv3 = DelegatableNodeKt.access$pop(r15);
        goto L66
    L77:
        r1 = false;
        goto L78
    L69:
        FocusTargetNode focusTarget2 = (FocusTargetNode) this_$iv$iv$iv3;
        if (focusTarget2.fetchFocusProperties$ui_release().getCanFocus() == false) goto L73;
        return FocusTargetModifierNode.m4038requestFocus3ESFkO8$default(focusTarget2, 0, 1, null);
    L73:
        return TwoDimensionalFocusSearchKt.m4071findChildCorrespondingToFocusEnterOMvw8(focusTarget2, FocusDirection.Companion.m4014getEnterdhqQ8s(), FocusRequesterModifierNodeKt$requestFocus$1$1.INSTANCE);
    L110:
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        r9 = false;
        goto L54
    L112:
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        r9 = false;
        goto L54
    L60:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, branch$iv$iv, zOrder$iv);
        goto L54
    L113:
        return false;
    L56:
        r11 = r9;
        goto L57
    L52:
        branches$iv$iv.add(child$iv$iv);
        goto L54
    }

    public static final boolean captureFocus(FocusRequesterModifierNode $this$captureFocus) {
        FocusRequesterModifierNode $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$captureFocus;
        int type$iv = NodeKind.m5976constructorimpl(1024);
        boolean zOrder$iv = false;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv.getNode();
        MutableVector r6 = null;
        Modifier.Node r7 = $this$dispatchForKind_u2d6rFNWt0$iv$iv;
    L3:
        boolean r8 = false;
        int r9 = 1;
        if (r7 == null) goto L45;
        if ((r7 instanceof FocusTargetNode) == true) goto L7;
        Modifier.Node this_$iv$iv$iv = r7;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L14;
        boolean r10 = true;
    L15:
        if (r10 == false) goto L43;
        if ((r7 instanceof DelegatingNode) == false) goto L43;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r7;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L19:
        if (node$iv$iv$iv == null) goto L40;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L23;
        int r16 = r9;
    L24:
        if (r16 == 0) goto L38;
        count$iv$iv = count$iv$iv + 1;
        if (count$iv$iv != r9) goto L28;
        r7 = next$iv$iv;
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
    L39:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        r9 = 1;
        goto L19
    L28:
        if (r6 != null) goto L30;
        MutableVector r0 = new MutableVector(new Modifier.Node[16], 0);
    L31:
        r6 = r0;
        Modifier.Node theNode$iv$iv = r7;
        if (theNode$iv$iv == null) goto L36;
        if (r6 == null) goto L35;
        r6.add(theNode$iv$iv);
    L35:
        r7 = null;
    L36:
        if (r6 == null) goto L39;
        r6.add(next$iv$iv);
        goto L39
    L30:
        r0 = r6;
        goto L31
    L38:
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        goto L39
    L23:
        r16 = 0;
        goto L24
    L40:
        DelegatableNode $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        int type$iv2 = type$iv;
        if (count$iv$iv != 1) goto L44;
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
    L44:
        r7 = DelegatableNodeKt.access$pop(r6);
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
    L43:
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        goto L44
    L14:
        r10 = false;
        goto L15
    L7:
        FocusTargetNode it = (FocusTargetNode) r7;
        if (FocusTransactionsKt.captureFocus(it) == true) goto L9;
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        goto L44
    L9:
        return true;
    L45:
        DelegatableNode $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv3 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        int type$iv3 = type$iv;
        int mask$iv$iv = type$iv3;
        DelegatableNode $this$visitChildren$iv$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv3;
        boolean value$iv$iv$iv = $this$visitChildren$iv$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L48;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L48:
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv = $this$visitChildren$iv$iv.getNode().getChild$ui_release();
        if (child$iv$iv != null) goto L51;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, $this$visitChildren$iv$iv.getNode(), false);
    L53:
        if (branches$iv$iv.getSize() == 0) goto L55;
        boolean r11 = true;
    L56:
        if (r11 == false) goto L111;
        Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(branches$iv$iv.getSize() - 1);
        if ((branch$iv$iv.getAggregateChildKindSet$ui_release() & mask$iv$iv) == 0) goto L59;
        Modifier.Node node$iv$iv = branch$iv$iv;
    L61:
        if (node$iv$iv == null) goto L110;
        if ((node$iv$iv.getKindSet$ui_release() & mask$iv$iv) != 0) goto L64;
        node$iv$iv = node$iv$iv.getChild$ui_release();
        mask$iv$iv = mask$iv$iv;
        goto L61
    L64:
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r14 = null;
        Modifier.Node r15 = it$iv;
    L65:
        if (r15 == null) goto L108;
        if ((r15 instanceof FocusTargetNode) == true) goto L68;
        Modifier.Node this_$iv$iv$iv3 = r15;
        if ((this_$iv$iv$iv3.getKindSet$ui_release() & type$iv3) == 0) goto L76;
        boolean r12 = true;
    L77:
        if (r12 == false) goto L106;
        if ((r15 instanceof DelegatingNode) == false) goto L106;
        int count$iv$iv2 = 0;
        DelegatingNode this_$iv$iv$iv4 = (DelegatingNode) r15;
        Modifier.Node node$iv$iv$iv2 = this_$iv$iv$iv4.getDelegate$ui_release();
    L81:
        if (node$iv$iv$iv2 == null) goto L103;
        Modifier.Node next$iv$iv2 = node$iv$iv$iv2;
        if ((next$iv$iv2.getKindSet$ui_release() & type$iv3) == 0) goto L85;
        boolean r25 = true;
    L86:
        if (r25 == false) goto L101;
        count$iv$iv2 = count$iv$iv2 + 1;
        int mask$iv$iv2 = mask$iv$iv;
        if (count$iv$iv2 != 1) goto L90;
        r15 = next$iv$iv2;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        zOrder$iv = zOrder$iv;
    L102:
        node$iv$iv$iv2 = node$iv$iv$iv2.getChild$ui_release();
        mask$iv$iv = mask$iv$iv2;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        zOrder$iv = zOrder$iv;
        goto L81
    L90:
        if (r14 != null) goto L92;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L93:
        r14 = r1;
        Modifier.Node theNode$iv$iv2 = r15;
        if (theNode$iv$iv2 == null) goto L98;
        if (r14 == null) goto L97;
        r14.add(theNode$iv$iv2);
    L97:
        r15 = null;
    L98:
        if (r14 == null) goto L102;
        r14.add(next$iv$iv2);
        goto L102
    L92:
        r1 = r14;
        goto L93
    L101:
        mask$iv$iv2 = mask$iv$iv;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        zOrder$iv = zOrder$iv;
        goto L102
    L85:
        r25 = false;
        goto L86
    L103:
        int mask$iv$iv3 = mask$iv$iv;
        DelegatableNode $this$visitChildren$iv$iv2 = $this$visitChildren$iv$iv;
        boolean zOrder$iv2 = zOrder$iv;
        if (count$iv$iv2 != 1) goto L107;
        mask$iv$iv = mask$iv$iv3;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv2;
        zOrder$iv = zOrder$iv2;
    L107:
        r15 = DelegatableNodeKt.access$pop(r14);
        mask$iv$iv = mask$iv$iv3;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv2;
        zOrder$iv = zOrder$iv2;
    L106:
        mask$iv$iv3 = mask$iv$iv;
        $this$visitChildren$iv$iv2 = $this$visitChildren$iv$iv;
        zOrder$iv2 = zOrder$iv;
        goto L107
    L76:
        r12 = false;
        goto L77
    L68:
        FocusTargetNode it2 = (FocusTargetNode) r15;
        if (FocusTransactionsKt.captureFocus(it2) == true) goto L70;
        mask$iv$iv3 = mask$iv$iv;
        $this$visitChildren$iv$iv2 = $this$visitChildren$iv$iv;
        zOrder$iv2 = zOrder$iv;
        goto L107
    L70:
        return true;
    L108:
        mask$iv$iv = mask$iv$iv;
        r8 = false;
        goto L53
    L110:
        mask$iv$iv = mask$iv$iv;
        r8 = false;
        goto L53
    L59:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, branch$iv$iv, zOrder$iv);
        goto L53
    L111:
        return false;
    L55:
        r11 = r8;
        goto L56
    L51:
        branches$iv$iv.add(child$iv$iv);
        goto L53
    }

    public static final boolean freeFocus(FocusRequesterModifierNode $this$freeFocus) {
        FocusRequesterModifierNode $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$freeFocus;
        int type$iv = NodeKind.m5976constructorimpl(1024);
        boolean zOrder$iv = false;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv.getNode();
        MutableVector r6 = null;
        Modifier.Node r7 = $this$dispatchForKind_u2d6rFNWt0$iv$iv;
    L3:
        boolean r8 = false;
        int r9 = 1;
        if (r7 == null) goto L45;
        if ((r7 instanceof FocusTargetNode) == true) goto L7;
        Modifier.Node this_$iv$iv$iv = r7;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L14;
        boolean r10 = true;
    L15:
        if (r10 == false) goto L43;
        if ((r7 instanceof DelegatingNode) == false) goto L43;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r7;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L19:
        if (node$iv$iv$iv == null) goto L40;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L23;
        int r16 = r9;
    L24:
        if (r16 == 0) goto L38;
        count$iv$iv = count$iv$iv + 1;
        if (count$iv$iv != r9) goto L28;
        r7 = next$iv$iv;
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
    L39:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        r9 = 1;
        goto L19
    L28:
        if (r6 != null) goto L30;
        MutableVector r0 = new MutableVector(new Modifier.Node[16], 0);
    L31:
        r6 = r0;
        Modifier.Node theNode$iv$iv = r7;
        if (theNode$iv$iv == null) goto L36;
        if (r6 == null) goto L35;
        r6.add(theNode$iv$iv);
    L35:
        r7 = null;
    L36:
        if (r6 == null) goto L39;
        r6.add(next$iv$iv);
        goto L39
    L30:
        r0 = r6;
        goto L31
    L38:
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        goto L39
    L23:
        r16 = 0;
        goto L24
    L40:
        DelegatableNode $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        int type$iv2 = type$iv;
        if (count$iv$iv != 1) goto L44;
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
    L44:
        r7 = DelegatableNodeKt.access$pop(r6);
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
    L43:
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        goto L44
    L14:
        r10 = false;
        goto L15
    L7:
        FocusTargetNode it = (FocusTargetNode) r7;
        if (FocusTransactionsKt.freeFocus(it) == true) goto L9;
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        goto L44
    L9:
        return true;
    L45:
        DelegatableNode $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv3 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        int type$iv3 = type$iv;
        int mask$iv$iv = type$iv3;
        DelegatableNode $this$visitChildren$iv$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv3;
        boolean value$iv$iv$iv = $this$visitChildren$iv$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L48;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L48:
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv = $this$visitChildren$iv$iv.getNode().getChild$ui_release();
        if (child$iv$iv != null) goto L51;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, $this$visitChildren$iv$iv.getNode(), false);
    L53:
        if (branches$iv$iv.getSize() == 0) goto L55;
        boolean r11 = true;
    L56:
        if (r11 == false) goto L111;
        Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(branches$iv$iv.getSize() - 1);
        if ((branch$iv$iv.getAggregateChildKindSet$ui_release() & mask$iv$iv) == 0) goto L59;
        Modifier.Node node$iv$iv = branch$iv$iv;
    L61:
        if (node$iv$iv == null) goto L110;
        if ((node$iv$iv.getKindSet$ui_release() & mask$iv$iv) != 0) goto L64;
        node$iv$iv = node$iv$iv.getChild$ui_release();
        mask$iv$iv = mask$iv$iv;
        goto L61
    L64:
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r14 = null;
        Modifier.Node r15 = it$iv;
    L65:
        if (r15 == null) goto L108;
        if ((r15 instanceof FocusTargetNode) == true) goto L68;
        Modifier.Node this_$iv$iv$iv3 = r15;
        if ((this_$iv$iv$iv3.getKindSet$ui_release() & type$iv3) == 0) goto L76;
        boolean r12 = true;
    L77:
        if (r12 == false) goto L106;
        if ((r15 instanceof DelegatingNode) == false) goto L106;
        int count$iv$iv2 = 0;
        DelegatingNode this_$iv$iv$iv4 = (DelegatingNode) r15;
        Modifier.Node node$iv$iv$iv2 = this_$iv$iv$iv4.getDelegate$ui_release();
    L81:
        if (node$iv$iv$iv2 == null) goto L103;
        Modifier.Node next$iv$iv2 = node$iv$iv$iv2;
        if ((next$iv$iv2.getKindSet$ui_release() & type$iv3) == 0) goto L85;
        boolean r25 = true;
    L86:
        if (r25 == false) goto L101;
        count$iv$iv2 = count$iv$iv2 + 1;
        int mask$iv$iv2 = mask$iv$iv;
        if (count$iv$iv2 != 1) goto L90;
        r15 = next$iv$iv2;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        zOrder$iv = zOrder$iv;
    L102:
        node$iv$iv$iv2 = node$iv$iv$iv2.getChild$ui_release();
        mask$iv$iv = mask$iv$iv2;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        zOrder$iv = zOrder$iv;
        goto L81
    L90:
        if (r14 != null) goto L92;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L93:
        r14 = r1;
        Modifier.Node theNode$iv$iv2 = r15;
        if (theNode$iv$iv2 == null) goto L98;
        if (r14 == null) goto L97;
        r14.add(theNode$iv$iv2);
    L97:
        r15 = null;
    L98:
        if (r14 == null) goto L102;
        r14.add(next$iv$iv2);
        goto L102
    L92:
        r1 = r14;
        goto L93
    L101:
        mask$iv$iv2 = mask$iv$iv;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        zOrder$iv = zOrder$iv;
        goto L102
    L85:
        r25 = false;
        goto L86
    L103:
        int mask$iv$iv3 = mask$iv$iv;
        DelegatableNode $this$visitChildren$iv$iv2 = $this$visitChildren$iv$iv;
        boolean zOrder$iv2 = zOrder$iv;
        if (count$iv$iv2 != 1) goto L107;
        mask$iv$iv = mask$iv$iv3;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv2;
        zOrder$iv = zOrder$iv2;
    L107:
        r15 = DelegatableNodeKt.access$pop(r14);
        mask$iv$iv = mask$iv$iv3;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv2;
        zOrder$iv = zOrder$iv2;
    L106:
        mask$iv$iv3 = mask$iv$iv;
        $this$visitChildren$iv$iv2 = $this$visitChildren$iv$iv;
        zOrder$iv2 = zOrder$iv;
        goto L107
    L76:
        r12 = false;
        goto L77
    L68:
        FocusTargetNode it2 = (FocusTargetNode) r15;
        if (FocusTransactionsKt.freeFocus(it2) == true) goto L70;
        mask$iv$iv3 = mask$iv$iv;
        $this$visitChildren$iv$iv2 = $this$visitChildren$iv$iv;
        zOrder$iv2 = zOrder$iv;
        goto L107
    L70:
        return true;
    L108:
        mask$iv$iv = mask$iv$iv;
        r8 = false;
        goto L53
    L110:
        mask$iv$iv = mask$iv$iv;
        r8 = false;
        goto L53
    L59:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, branch$iv$iv, zOrder$iv);
        goto L53
    L111:
        return false;
    L55:
        r11 = r8;
        goto L56
    L51:
        branches$iv$iv.add(child$iv$iv);
        goto L53
    }

    public static final boolean saveFocusedChild(FocusRequesterModifierNode $this$saveFocusedChild) {
        FocusRequesterModifierNode $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$saveFocusedChild;
        int type$iv = NodeKind.m5976constructorimpl(1024);
        boolean zOrder$iv = false;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv.getNode();
        MutableVector r6 = null;
        Modifier.Node r7 = $this$dispatchForKind_u2d6rFNWt0$iv$iv;
    L3:
        boolean r8 = false;
        int r9 = 1;
        if (r7 == null) goto L45;
        if ((r7 instanceof FocusTargetNode) == true) goto L7;
        Modifier.Node this_$iv$iv$iv = r7;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L14;
        boolean r10 = true;
    L15:
        if (r10 == false) goto L43;
        if ((r7 instanceof DelegatingNode) == false) goto L43;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r7;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L19:
        if (node$iv$iv$iv == null) goto L40;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L23;
        int r16 = r9;
    L24:
        if (r16 == 0) goto L38;
        count$iv$iv = count$iv$iv + 1;
        if (count$iv$iv != r9) goto L28;
        r7 = next$iv$iv;
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
    L39:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        r9 = 1;
        goto L19
    L28:
        if (r6 != null) goto L30;
        MutableVector r0 = new MutableVector(new Modifier.Node[16], 0);
    L31:
        r6 = r0;
        Modifier.Node theNode$iv$iv = r7;
        if (theNode$iv$iv == null) goto L36;
        if (r6 == null) goto L35;
        r6.add(theNode$iv$iv);
    L35:
        r7 = null;
    L36:
        if (r6 == null) goto L39;
        r6.add(next$iv$iv);
        goto L39
    L30:
        r0 = r6;
        goto L31
    L38:
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        goto L39
    L23:
        r16 = 0;
        goto L24
    L40:
        DelegatableNode $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        int type$iv2 = type$iv;
        if (count$iv$iv != 1) goto L44;
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
    L44:
        r7 = DelegatableNodeKt.access$pop(r6);
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
    L43:
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        goto L44
    L14:
        r10 = false;
        goto L15
    L7:
        FocusTargetNode it = (FocusTargetNode) r7;
        if (FocusRestorerKt.saveFocusedChild(it) == true) goto L9;
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        goto L44
    L9:
        return true;
    L45:
        DelegatableNode $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv3 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        int type$iv3 = type$iv;
        int mask$iv$iv = type$iv3;
        DelegatableNode $this$visitChildren$iv$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv3;
        boolean value$iv$iv$iv = $this$visitChildren$iv$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L48;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L48:
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv = $this$visitChildren$iv$iv.getNode().getChild$ui_release();
        if (child$iv$iv != null) goto L51;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, $this$visitChildren$iv$iv.getNode(), false);
    L53:
        if (branches$iv$iv.getSize() == 0) goto L55;
        boolean r11 = true;
    L56:
        if (r11 == false) goto L111;
        Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(branches$iv$iv.getSize() - 1);
        if ((branch$iv$iv.getAggregateChildKindSet$ui_release() & mask$iv$iv) == 0) goto L59;
        Modifier.Node node$iv$iv = branch$iv$iv;
    L61:
        if (node$iv$iv == null) goto L110;
        if ((node$iv$iv.getKindSet$ui_release() & mask$iv$iv) != 0) goto L64;
        node$iv$iv = node$iv$iv.getChild$ui_release();
        mask$iv$iv = mask$iv$iv;
        goto L61
    L64:
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r14 = null;
        Modifier.Node r15 = it$iv;
    L65:
        if (r15 == null) goto L108;
        if ((r15 instanceof FocusTargetNode) == true) goto L68;
        Modifier.Node this_$iv$iv$iv3 = r15;
        if ((this_$iv$iv$iv3.getKindSet$ui_release() & type$iv3) == 0) goto L76;
        boolean r12 = true;
    L77:
        if (r12 == false) goto L106;
        if ((r15 instanceof DelegatingNode) == false) goto L106;
        int count$iv$iv2 = 0;
        DelegatingNode this_$iv$iv$iv4 = (DelegatingNode) r15;
        Modifier.Node node$iv$iv$iv2 = this_$iv$iv$iv4.getDelegate$ui_release();
    L81:
        if (node$iv$iv$iv2 == null) goto L103;
        Modifier.Node next$iv$iv2 = node$iv$iv$iv2;
        if ((next$iv$iv2.getKindSet$ui_release() & type$iv3) == 0) goto L85;
        boolean r25 = true;
    L86:
        if (r25 == false) goto L101;
        count$iv$iv2 = count$iv$iv2 + 1;
        int mask$iv$iv2 = mask$iv$iv;
        if (count$iv$iv2 != 1) goto L90;
        r15 = next$iv$iv2;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        zOrder$iv = zOrder$iv;
    L102:
        node$iv$iv$iv2 = node$iv$iv$iv2.getChild$ui_release();
        mask$iv$iv = mask$iv$iv2;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        zOrder$iv = zOrder$iv;
        goto L81
    L90:
        if (r14 != null) goto L92;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L93:
        r14 = r1;
        Modifier.Node theNode$iv$iv2 = r15;
        if (theNode$iv$iv2 == null) goto L98;
        if (r14 == null) goto L97;
        r14.add(theNode$iv$iv2);
    L97:
        r15 = null;
    L98:
        if (r14 == null) goto L102;
        r14.add(next$iv$iv2);
        goto L102
    L92:
        r1 = r14;
        goto L93
    L101:
        mask$iv$iv2 = mask$iv$iv;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        zOrder$iv = zOrder$iv;
        goto L102
    L85:
        r25 = false;
        goto L86
    L103:
        int mask$iv$iv3 = mask$iv$iv;
        DelegatableNode $this$visitChildren$iv$iv2 = $this$visitChildren$iv$iv;
        boolean zOrder$iv2 = zOrder$iv;
        if (count$iv$iv2 != 1) goto L107;
        mask$iv$iv = mask$iv$iv3;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv2;
        zOrder$iv = zOrder$iv2;
    L107:
        r15 = DelegatableNodeKt.access$pop(r14);
        mask$iv$iv = mask$iv$iv3;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv2;
        zOrder$iv = zOrder$iv2;
    L106:
        mask$iv$iv3 = mask$iv$iv;
        $this$visitChildren$iv$iv2 = $this$visitChildren$iv$iv;
        zOrder$iv2 = zOrder$iv;
        goto L107
    L76:
        r12 = false;
        goto L77
    L68:
        FocusTargetNode it2 = (FocusTargetNode) r15;
        if (FocusRestorerKt.saveFocusedChild(it2) == true) goto L70;
        mask$iv$iv3 = mask$iv$iv;
        $this$visitChildren$iv$iv2 = $this$visitChildren$iv$iv;
        zOrder$iv2 = zOrder$iv;
        goto L107
    L70:
        return true;
    L108:
        mask$iv$iv = mask$iv$iv;
        r8 = false;
        goto L53
    L110:
        mask$iv$iv = mask$iv$iv;
        r8 = false;
        goto L53
    L59:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, branch$iv$iv, zOrder$iv);
        goto L53
    L111:
        return false;
    L55:
        r11 = r8;
        goto L56
    L51:
        branches$iv$iv.add(child$iv$iv);
        goto L53
    }

    public static final boolean restoreFocusedChild(FocusRequesterModifierNode $this$restoreFocusedChild) {
        FocusRequesterModifierNode $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$restoreFocusedChild;
        int type$iv = NodeKind.m5976constructorimpl(1024);
        boolean zOrder$iv = false;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv.getNode();
        MutableVector r6 = null;
        Modifier.Node r7 = $this$dispatchForKind_u2d6rFNWt0$iv$iv;
    L3:
        boolean r8 = false;
        int r9 = 1;
        if (r7 == null) goto L45;
        if ((r7 instanceof FocusTargetNode) == true) goto L7;
        Modifier.Node this_$iv$iv$iv = r7;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L14;
        boolean r10 = true;
    L15:
        if (r10 == false) goto L43;
        if ((r7 instanceof DelegatingNode) == false) goto L43;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r7;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L19:
        if (node$iv$iv$iv == null) goto L40;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L23;
        int r16 = r9;
    L24:
        if (r16 == 0) goto L38;
        count$iv$iv = count$iv$iv + 1;
        if (count$iv$iv != r9) goto L28;
        r7 = next$iv$iv;
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
    L39:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        r9 = 1;
        goto L19
    L28:
        if (r6 != null) goto L30;
        MutableVector r0 = new MutableVector(new Modifier.Node[16], 0);
    L31:
        r6 = r0;
        Modifier.Node theNode$iv$iv = r7;
        if (theNode$iv$iv == null) goto L36;
        if (r6 == null) goto L35;
        r6.add(theNode$iv$iv);
    L35:
        r7 = null;
    L36:
        if (r6 == null) goto L39;
        r6.add(next$iv$iv);
        goto L39
    L30:
        r0 = r6;
        goto L31
    L38:
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        goto L39
    L23:
        r16 = 0;
        goto L24
    L40:
        DelegatableNode $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        int type$iv2 = type$iv;
        if (count$iv$iv != 1) goto L44;
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
    L44:
        r7 = DelegatableNodeKt.access$pop(r6);
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
    L43:
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        goto L44
    L14:
        r10 = false;
        goto L15
    L7:
        FocusTargetNode it = (FocusTargetNode) r7;
        if (FocusRestorerKt.restoreFocusedChild(it) == true) goto L9;
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        goto L44
    L9:
        return true;
    L45:
        DelegatableNode $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv3 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        int type$iv3 = type$iv;
        int mask$iv$iv = type$iv3;
        DelegatableNode $this$visitChildren$iv$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv3;
        boolean value$iv$iv$iv = $this$visitChildren$iv$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L48;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L48:
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv = $this$visitChildren$iv$iv.getNode().getChild$ui_release();
        if (child$iv$iv != null) goto L51;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, $this$visitChildren$iv$iv.getNode(), false);
    L53:
        if (branches$iv$iv.getSize() == 0) goto L55;
        boolean r11 = true;
    L56:
        if (r11 == false) goto L111;
        Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(branches$iv$iv.getSize() - 1);
        if ((branch$iv$iv.getAggregateChildKindSet$ui_release() & mask$iv$iv) == 0) goto L59;
        Modifier.Node node$iv$iv = branch$iv$iv;
    L61:
        if (node$iv$iv == null) goto L110;
        if ((node$iv$iv.getKindSet$ui_release() & mask$iv$iv) != 0) goto L64;
        node$iv$iv = node$iv$iv.getChild$ui_release();
        mask$iv$iv = mask$iv$iv;
        goto L61
    L64:
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r14 = null;
        Modifier.Node r15 = it$iv;
    L65:
        if (r15 == null) goto L108;
        if ((r15 instanceof FocusTargetNode) == true) goto L68;
        Modifier.Node this_$iv$iv$iv3 = r15;
        if ((this_$iv$iv$iv3.getKindSet$ui_release() & type$iv3) == 0) goto L76;
        boolean r12 = true;
    L77:
        if (r12 == false) goto L106;
        if ((r15 instanceof DelegatingNode) == false) goto L106;
        int count$iv$iv2 = 0;
        DelegatingNode this_$iv$iv$iv4 = (DelegatingNode) r15;
        Modifier.Node node$iv$iv$iv2 = this_$iv$iv$iv4.getDelegate$ui_release();
    L81:
        if (node$iv$iv$iv2 == null) goto L103;
        Modifier.Node next$iv$iv2 = node$iv$iv$iv2;
        if ((next$iv$iv2.getKindSet$ui_release() & type$iv3) == 0) goto L85;
        boolean r25 = true;
    L86:
        if (r25 == false) goto L101;
        count$iv$iv2 = count$iv$iv2 + 1;
        int mask$iv$iv2 = mask$iv$iv;
        if (count$iv$iv2 != 1) goto L90;
        r15 = next$iv$iv2;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        zOrder$iv = zOrder$iv;
    L102:
        node$iv$iv$iv2 = node$iv$iv$iv2.getChild$ui_release();
        mask$iv$iv = mask$iv$iv2;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        zOrder$iv = zOrder$iv;
        goto L81
    L90:
        if (r14 != null) goto L92;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L93:
        r14 = r1;
        Modifier.Node theNode$iv$iv2 = r15;
        if (theNode$iv$iv2 == null) goto L98;
        if (r14 == null) goto L97;
        r14.add(theNode$iv$iv2);
    L97:
        r15 = null;
    L98:
        if (r14 == null) goto L102;
        r14.add(next$iv$iv2);
        goto L102
    L92:
        r1 = r14;
        goto L93
    L101:
        mask$iv$iv2 = mask$iv$iv;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        zOrder$iv = zOrder$iv;
        goto L102
    L85:
        r25 = false;
        goto L86
    L103:
        int mask$iv$iv3 = mask$iv$iv;
        DelegatableNode $this$visitChildren$iv$iv2 = $this$visitChildren$iv$iv;
        boolean zOrder$iv2 = zOrder$iv;
        if (count$iv$iv2 != 1) goto L107;
        mask$iv$iv = mask$iv$iv3;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv2;
        zOrder$iv = zOrder$iv2;
    L107:
        r15 = DelegatableNodeKt.access$pop(r14);
        mask$iv$iv = mask$iv$iv3;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv2;
        zOrder$iv = zOrder$iv2;
    L106:
        mask$iv$iv3 = mask$iv$iv;
        $this$visitChildren$iv$iv2 = $this$visitChildren$iv$iv;
        zOrder$iv2 = zOrder$iv;
        goto L107
    L76:
        r12 = false;
        goto L77
    L68:
        FocusTargetNode it2 = (FocusTargetNode) r15;
        if (FocusRestorerKt.restoreFocusedChild(it2) == true) goto L70;
        mask$iv$iv3 = mask$iv$iv;
        $this$visitChildren$iv$iv2 = $this$visitChildren$iv$iv;
        zOrder$iv2 = zOrder$iv;
        goto L107
    L70:
        return true;
    L108:
        mask$iv$iv = mask$iv$iv;
        r8 = false;
        goto L53
    L110:
        mask$iv$iv = mask$iv$iv;
        r8 = false;
        goto L53
    L59:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, branch$iv$iv, zOrder$iv);
        goto L53
    L111:
        return false;
    L55:
        r11 = r8;
        goto L56
    L51:
        branches$iv$iv.add(child$iv$iv);
        goto L53
    }

    public static final PinnableContainer.PinnedHandle pinFocusedChild(FocusRequesterModifierNode $this$pinFocusedChild) {
        FocusRequesterModifierNode $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$pinFocusedChild;
        int type$iv = NodeKind.m5976constructorimpl(1024);
        boolean zOrder$iv = false;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv.getNode();
        MutableVector r6 = null;
        Modifier.Node r7 = $this$dispatchForKind_u2d6rFNWt0$iv$iv;
    L3:
        int count$iv$iv = 0;
        int r9 = 1;
        if (r7 == null) goto L46;
        if ((r7 instanceof FocusTargetNode) == true) goto L7;
        Modifier.Node this_$iv$iv$iv = r7;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L15;
        boolean r10 = true;
    L16:
        if (r10 == false) goto L44;
        if ((r7 instanceof DelegatingNode) == false) goto L44;
        int count$iv$iv2 = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r7;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L20:
        if (node$iv$iv$iv == null) goto L41;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L24;
        int r16 = r9;
    L25:
        if (r16 == 0) goto L39;
        count$iv$iv2 = count$iv$iv2 + 1;
        if (count$iv$iv2 != r9) goto L29;
        r7 = next$iv$iv;
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
    L40:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        r9 = 1;
        goto L20
    L29:
        if (r6 != null) goto L31;
        MutableVector r0 = new MutableVector(new Modifier.Node[16], 0);
    L32:
        r6 = r0;
        Modifier.Node theNode$iv$iv = r7;
        if (theNode$iv$iv == null) goto L37;
        if (r6 == null) goto L36;
        r6.add(theNode$iv$iv);
    L36:
        r7 = null;
    L37:
        if (r6 == null) goto L40;
        r6.add(next$iv$iv);
        goto L40
    L31:
        r0 = r6;
        goto L32
    L39:
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        goto L40
    L24:
        r16 = 0;
        goto L25
    L41:
        DelegatableNode $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        int type$iv2 = type$iv;
        if (count$iv$iv2 != 1) goto L45;
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
    L45:
        r7 = DelegatableNodeKt.access$pop(r6);
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
    L44:
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        goto L45
    L15:
        r10 = false;
        goto L16
    L7:
        PinnableContainer.PinnedHandle it = FocusRestorerKt.pinFocusedChild((FocusTargetNode) r7);
        if (it != null) goto L10;
        $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        goto L45
    L10:
        return it;
    L46:
        DelegatableNode $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv3 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv;
        int type$iv3 = type$iv;
        int mask$iv$iv = type$iv3;
        DelegatableNode $this$visitChildren$iv$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv3;
        boolean value$iv$iv$iv = $this$visitChildren$iv$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L49;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L49:
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv = $this$visitChildren$iv$iv.getNode().getChild$ui_release();
        if (child$iv$iv != null) goto L52;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, $this$visitChildren$iv$iv.getNode(), false);
    L54:
        if (branches$iv$iv.getSize() == 0) goto L56;
        int r8 = 1;
    L57:
        if (r8 == 0) goto L113;
        Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(branches$iv$iv.getSize() - 1);
        if ((branch$iv$iv.getAggregateChildKindSet$ui_release() & mask$iv$iv) == 0) goto L60;
        Modifier.Node node$iv$iv = branch$iv$iv;
    L62:
        if (node$iv$iv == null) goto L111;
        if ((node$iv$iv.getKindSet$ui_release() & mask$iv$iv) != 0) goto L65;
        node$iv$iv = node$iv$iv.getChild$ui_release();
        mask$iv$iv = mask$iv$iv;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        goto L62
    L65:
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r14 = null;
        Modifier.Node r15 = it$iv;
    L66:
        if (r15 == null) goto L109;
        if ((r15 instanceof FocusTargetNode) == true) goto L69;
        Modifier.Node this_$iv$iv$iv3 = r15;
        if ((this_$iv$iv$iv3.getKindSet$ui_release() & type$iv3) == 0) goto L77;
        boolean r11 = true;
    L78:
        if (r11 == false) goto L107;
        if ((r15 instanceof DelegatingNode) == false) goto L107;
        int count$iv$iv3 = 0;
        DelegatingNode this_$iv$iv$iv4 = (DelegatingNode) r15;
        Modifier.Node node$iv$iv$iv2 = this_$iv$iv$iv4.getDelegate$ui_release();
    L82:
        if (node$iv$iv$iv2 == null) goto L104;
        Modifier.Node next$iv$iv2 = node$iv$iv$iv2;
        if ((next$iv$iv2.getKindSet$ui_release() & type$iv3) == 0) goto L86;
        boolean r25 = true;
    L87:
        if (r25 == false) goto L102;
        count$iv$iv3 = count$iv$iv3 + 1;
        int mask$iv$iv2 = mask$iv$iv;
        if (count$iv$iv3 != 1) goto L91;
        r15 = next$iv$iv2;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        zOrder$iv = zOrder$iv;
    L103:
        node$iv$iv$iv2 = node$iv$iv$iv2.getChild$ui_release();
        mask$iv$iv = mask$iv$iv2;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        zOrder$iv = zOrder$iv;
        goto L82
    L91:
        if (r14 != null) goto L93;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L94:
        r14 = r1;
        Modifier.Node theNode$iv$iv2 = r15;
        if (theNode$iv$iv2 == null) goto L99;
        if (r14 == null) goto L98;
        r14.add(theNode$iv$iv2);
    L98:
        r15 = null;
    L99:
        if (r14 == null) goto L103;
        r14.add(next$iv$iv2);
        goto L103
    L93:
        r1 = r14;
        goto L94
    L102:
        mask$iv$iv2 = mask$iv$iv;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        zOrder$iv = zOrder$iv;
        goto L103
    L86:
        r25 = false;
        goto L87
    L104:
        int mask$iv$iv3 = mask$iv$iv;
        DelegatableNode $this$visitChildren$iv$iv2 = $this$visitChildren$iv$iv;
        boolean zOrder$iv2 = zOrder$iv;
        int mask$iv$iv4 = 0;
        if (count$iv$iv3 != 1) goto L108;
        count$iv$iv = 0;
        mask$iv$iv = mask$iv$iv3;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv2;
        zOrder$iv = zOrder$iv2;
    L108:
        r15 = DelegatableNodeKt.access$pop(r14);
        count$iv$iv = mask$iv$iv4;
        mask$iv$iv = mask$iv$iv3;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv2;
        zOrder$iv = zOrder$iv2;
    L107:
        mask$iv$iv3 = mask$iv$iv;
        $this$visitChildren$iv$iv2 = $this$visitChildren$iv$iv;
        zOrder$iv2 = zOrder$iv;
        mask$iv$iv4 = 0;
        goto L108
    L77:
        r11 = false;
        goto L78
    L69:
        PinnableContainer.PinnedHandle it2 = FocusRestorerKt.pinFocusedChild((FocusTargetNode) r15);
        if (it2 != null) goto L72;
        mask$iv$iv3 = mask$iv$iv;
        $this$visitChildren$iv$iv2 = $this$visitChildren$iv$iv;
        zOrder$iv2 = zOrder$iv;
        mask$iv$iv4 = 0;
        goto L108
    L72:
        return it2;
    L109:
        mask$iv$iv = mask$iv$iv;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        goto L54
    L111:
        mask$iv$iv = mask$iv$iv;
        $this$visitChildren$iv$iv = $this$visitChildren$iv$iv;
        goto L54
    L60:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, branch$iv$iv, zOrder$iv);
        goto L54
    L113:
        return null;
    L56:
        r8 = count$iv$iv;
        goto L57
    L52:
        branches$iv$iv.add(child$iv$iv);
        goto L54
    }
}
