package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FocusTransactions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a \u0010\u0003\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u001e\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001e\u0010\u000f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u001e\u0010\u0011\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000e\u001a\u001e\u0010\u0013\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000e\u001a\f\u0010\u0015\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0016\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0017\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0014\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002\u001a\f\u0010\u001a\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u001b\u001a\u00020\u0002*\u00020\u0002H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"captureFocus", "", "Landroidx/compose/ui/focus/FocusTargetNode;", "clearChildFocus", "forced", "refreshFocusEvents", "clearFocus", "freeFocus", "grantFocus", "performCustomClearFocus", "Landroidx/compose/ui/focus/CustomDestinationResult;", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "performCustomClearFocus-Mxy_nc0", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;", "performCustomEnter", "performCustomEnter-Mxy_nc0", "performCustomExit", "performCustomExit-Mxy_nc0", "performCustomRequestFocus", "performCustomRequestFocus-Mxy_nc0", "performRequestFocus", "performRequestFocusLegacy", "performRequestFocusOptimized", "requestFocusForChild", "childNode", "requestFocusForOwner", "requireActiveChild", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FocusTransactionsKt {

    /* JADX INFO: compiled from: FocusTransactions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[FocusStateImpl.values().length];
            r0[FocusStateImpl.Active.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L17:
            r0[FocusStateImpl.Captured.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L19:
            r0[FocusStateImpl.ActiveParent.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L23:
            r0[FocusStateImpl.Inactive.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L15:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public static final boolean performRequestFocus(FocusTargetNode $this$performRequestFocus) {
        if (ComposeUiFlags.isTrackFocusEnabled == false) goto L6;
        return performRequestFocusOptimized($this$performRequestFocus);
    L6:
        return performRequestFocusLegacy($this$performRequestFocus);
    }

    private static final boolean performRequestFocusOptimized(FocusTargetNode $this$performRequestFocusOptimized) {
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner($this$performRequestFocusOptimized).getFocusOwner();
        FocusTargetNode previousActiveNode = focusOwner.getActiveFocusTargetNode();
        FocusStateImpl previousFocusState = $this$performRequestFocusOptimized.getFocusState();
        int r4 = 1;
        if (previousActiveNode != $this$performRequestFocusOptimized) goto L7;
        $this$performRequestFocusOptimized.dispatchFocusCallbacks$ui_release(previousFocusState, previousFocusState);
        return true;
    L7:
        if (previousActiveNode == null) goto L9;
    L11:
        MutableVector r6 = null;
        int r8 = 1024;
        if (previousActiveNode == null) goto L77;
        r6 = new MutableVector(new FocusTargetNode[16], 0);
        FocusTargetNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = previousActiveNode;
        int r11 = NodeKind.m5976constructorimpl(1024);
        boolean value$iv$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L16;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L16:
        Modifier.Node node$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv.getNode().getParent$ui_release();
        LayoutNode layout$iv$iv = DelegatableNodeKt.requireLayoutNode($this$visitAncestors_u2dY_u2dYKmho_u24default$iv);
    L17:
        if (layout$iv$iv == null) goto L76;
        Modifier.Node head$iv$iv = layout$iv$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv$iv.getAggregateChildKindSet$ui_release() & r11) == 0) goto L68;
    L20:
        if (node$iv$iv == null) goto L67;
        if ((node$iv$iv.getKindSet$ui_release() & r11) == 0) goto L65;
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r24 = null;
        Modifier.Node r9 = it$iv;
    L24:
        if (r9 == null) goto L64;
        if ((r9 instanceof FocusTargetNode) == true) goto L27;
        Modifier.Node this_$iv$iv$iv = r9;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & r11) == 0) goto L31;
        int r10 = r4;
    L32:
        if (r10 == 0) goto L62;
        if ((r9 instanceof DelegatingNode) == false) goto L62;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r9;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L36:
        if (node$iv$iv$iv == null) goto L59;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & r11) == 0) goto L40;
        int r31 = r4;
    L41:
        if (r31 == 0) goto L57;
        count$iv$iv = count$iv$iv + 1;
        if (count$iv$iv != r4) goto L45;
        r9 = next$iv$iv;
        focusOwner = focusOwner;
        previousFocusState = previousFocusState;
    L58:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        focusOwner = focusOwner;
        previousFocusState = previousFocusState;
        r4 = 1;
        goto L36
    L45:
        if (r24 != null) goto L47;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L48:
        Modifier.Node theNode$iv$iv = r9;
        if (theNode$iv$iv == null) goto L53;
        if (r1 == null) goto L52;
        r1.add(theNode$iv$iv);
    L52:
        r9 = null;
    L53:
        if (r1 == null) goto L56;
        r1.add(next$iv$iv);
    L56:
        r24 = r1;
        goto L58
    L47:
        r1 = r24;
        goto L48
    L57:
        focusOwner = focusOwner;
        previousFocusState = previousFocusState;
        goto L58
    L40:
        r31 = 0;
        goto L41
    L59:
        FocusOwner focusOwner2 = focusOwner;
        FocusStateImpl previousFocusState2 = previousFocusState;
        if (count$iv$iv != 1) goto L63;
        focusOwner = focusOwner2;
        previousFocusState = previousFocusState2;
        r4 = 1;
    L63:
        r9 = DelegatableNodeKt.access$pop(r24);
        focusOwner = focusOwner2;
        previousFocusState = previousFocusState2;
        r4 = 1;
    L62:
        focusOwner2 = focusOwner;
        previousFocusState2 = previousFocusState;
        goto L63
    L31:
        r10 = 0;
        goto L32
    L27:
        r6.add((FocusTargetNode) r9);
        focusOwner2 = focusOwner;
        previousFocusState2 = previousFocusState;
        goto L63
    L64:
        FocusOwner focusOwner3 = focusOwner;
        FocusStateImpl previousFocusState3 = previousFocusState;
    L66:
        node$iv$iv = node$iv$iv.getParent$ui_release();
        r8 = r8;
        focusOwner = focusOwner3;
        previousFocusState = previousFocusState3;
        r4 = 1;
        goto L20
    L65:
        focusOwner3 = focusOwner;
        previousFocusState3 = previousFocusState;
        goto L66
    L67:
        FocusOwner focusOwner4 = focusOwner;
        FocusStateImpl previousFocusState4 = previousFocusState;
        int r25 = r8;
    L69:
        layout$iv$iv = layout$iv$iv.getParent$ui_release();
        if (layout$iv$iv == null) goto L74;
        NodeChain r2 = layout$iv$iv.getNodes$ui_release();
        if (r2 == null) goto L74;
        Modifier.Node r3 = r2.getTail$ui_release();
    L75:
        node$iv$iv = r3;
        r8 = r25;
        focusOwner = focusOwner4;
        previousFocusState = previousFocusState4;
        r4 = 1;
    L74:
        r3 = null;
        goto L75
    L68:
        focusOwner4 = focusOwner;
        previousFocusState4 = previousFocusState;
        r25 = r8;
        goto L69
    L76:
        FocusOwner focusOwner5 = focusOwner;
        FocusStateImpl previousFocusState5 = previousFocusState;
        int r26 = r8;
    L78:
        boolean shouldClearFocusFromPreviousActiveNode = true;
        MutableVector ancestorTargetNodes = new MutableVector(new FocusTargetNode[16], 0);
        FocusTargetNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2 = $this$performRequestFocusOptimized;
        int type$iv = NodeKind.m5976constructorimpl(r26);
        boolean value$iv$iv$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2.getNode().isAttached();
        if (value$iv$iv$iv2 == true) goto L81;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L81:
        Modifier.Node node$iv$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2.getNode().getParent$ui_release();
        LayoutNode layout$iv$iv2 = DelegatableNodeKt.requireLayoutNode($this$visitAncestors_u2dY_u2dYKmho_u24default$iv2);
    L82:
        if (layout$iv$iv2 == null) goto L153;
        Modifier.Node head$iv$iv2 = layout$iv$iv2.getNodes$ui_release().getHead$ui_release();
        if ((head$iv$iv2.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L144;
    L85:
        if (node$iv$iv2 == null) goto L143;
        if ((node$iv$iv2.getKindSet$ui_release() & type$iv) == 0) goto L142;
        Modifier.Node it$iv2 = node$iv$iv2;
        MutableVector r20 = null;
        Modifier.Node r5 = it$iv2;
    L89:
        if (r5 == null) goto L142;
        boolean shouldClearFocusFromPreviousActiveNode2 = shouldClearFocusFromPreviousActiveNode;
        boolean shouldClearFocusFromPreviousActiveNode3 = r5 instanceof FocusTargetNode;
        if (shouldClearFocusFromPreviousActiveNode3 == true) goto L92;
        Modifier.Node this_$iv$iv$iv3 = r5;
        if ((this_$iv$iv$iv3.getKindSet$ui_release() & type$iv) == 0) goto L106;
        boolean r7 = true;
    L107:
        if (r7 == false) goto L138;
        if ((r5 instanceof DelegatingNode) == false) goto L138;
        int count$iv$iv2 = 0;
        DelegatingNode this_$iv$iv$iv4 = (DelegatingNode) r5;
        Modifier.Node node$iv$iv$iv2 = this_$iv$iv$iv4.getDelegate$ui_release();
    L111:
        if (node$iv$iv$iv2 == null) goto L134;
        Modifier.Node next$iv$iv2 = node$iv$iv$iv2;
        if ((next$iv$iv2.getKindSet$ui_release() & type$iv) == 0) goto L115;
        boolean r28 = true;
    L116:
        if (r28 == false) goto L132;
        count$iv$iv2 = count$iv$iv2 + 1;
        DelegatableNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv3 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2;
        if (count$iv$iv2 != 1) goto L120;
        r5 = next$iv$iv2;
        type$iv = type$iv;
    L133:
        node$iv$iv$iv2 = node$iv$iv$iv2.getChild$ui_release();
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv3;
        type$iv = type$iv;
        goto L111
    L120:
        if (r20 != null) goto L122;
        MutableVector r12 = new MutableVector(new Modifier.Node[16], 0);
    L123:
        Modifier.Node theNode$iv$iv2 = r5;
        if (theNode$iv$iv2 == null) goto L128;
        if (r12 == null) goto L127;
        r12.add(theNode$iv$iv2);
    L127:
        r5 = null;
    L128:
        if (r12 == null) goto L131;
        r12.add(next$iv$iv2);
    L131:
        r20 = r12;
        count$iv$iv2 = count$iv$iv2;
        goto L133
    L122:
        r12 = r20;
        goto L123
    L132:
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv3 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv;
        goto L133
    L115:
        r28 = false;
        goto L116
    L134:
        DelegatableNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv4 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2;
        int type$iv2 = type$iv;
        if (count$iv$iv2 != 1) goto L139;
        shouldClearFocusFromPreviousActiveNode = shouldClearFocusFromPreviousActiveNode2;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv4;
        type$iv = type$iv2;
    L139:
        shouldClearFocusFromPreviousActiveNode = shouldClearFocusFromPreviousActiveNode2;
        r5 = DelegatableNodeKt.access$pop(r20);
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv4;
        type$iv = type$iv2;
    L138:
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv4 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2;
        type$iv2 = type$iv;
        goto L139
    L106:
        r7 = false;
        goto L107
    L92:
        FocusTargetNode it = (FocusTargetNode) r5;
        if (r6 == null) goto L95;
        Boolean removed = Boolean.valueOf(r6.remove(it));
    L96:
        if (removed != null) goto L98;
    L99:
        ancestorTargetNodes.add(it);
    L100:
        if (it != previousActiveNode) goto L102;
        shouldClearFocusFromPreviousActiveNode2 = false;
    L102:
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv4 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2;
        type$iv2 = type$iv;
        goto L139
    L98:
        if (removed.booleanValue() == true) goto L100;
    L95:
        removed = null;
    L142:
        node$iv$iv2 = node$iv$iv2.getParent$ui_release();
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv;
        goto L85
    L143:
        DelegatableNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv5 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2;
        int type$iv3 = type$iv;
    L145:
        layout$iv$iv2 = layout$iv$iv2.getParent$ui_release();
        if (layout$iv$iv2 == null) goto L150;
        NodeChain r13 = layout$iv$iv2.getNodes$ui_release();
        if (r13 == null) goto L150;
        Modifier.Node r14 = r13.getTail$ui_release();
    L151:
        node$iv$iv2 = r14;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv5;
        type$iv = type$iv3;
    L150:
        r14 = null;
        goto L151
    L144:
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv5 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2;
        type$iv3 = type$iv;
        goto L145
    L153:
        if (shouldClearFocusFromPreviousActiveNode == false) goto L162;
        if (previousActiveNode == null) goto L158;
        boolean r15 = false;
        if (clearFocus$default(previousActiveNode, false, true, 1, null) == true) goto L159;
        boolean r16 = true;
    L160:
        if (r16 == false) goto L162;
        return r15;
    L159:
        r16 = r15;
        goto L160
    L158:
        r15 = false;
    L162:
        grantFocus($this$performRequestFocusOptimized);
        if (r6 == null) goto L173;
        MutableVector this_$iv = r6;
        int i$iv = this_$iv.getSize() - 1;
        Object[] content$iv = this_$iv.content;
        if (i$iv >= content$iv.length) goto L173;
    L166:
        if (i$iv < 0) goto L173;
        FocusTargetNode it2 = (FocusTargetNode) content$iv[i$iv];
        if (focusOwner5.getActiveFocusTargetNode() != $this$performRequestFocusOptimized) goto L169;
        it2.dispatchFocusCallbacks$ui_release(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
        i$iv = i$iv - 1;
        goto L166
    L169:
        return false;
    L173:
        int i$iv2 = ancestorTargetNodes.getSize() - 1;
        Object[] content$iv2 = ancestorTargetNodes.content;
        if (i$iv2 >= content$iv2.length) goto L187;
    L175:
        if (i$iv2 < 0) goto L187;
        FocusTargetNode it3 = (FocusTargetNode) content$iv2[i$iv2];
        if (focusOwner5.getActiveFocusTargetNode() != $this$performRequestFocusOptimized) goto L178;
        if (it3 != previousActiveNode) goto L183;
        FocusStateImpl r17 = FocusStateImpl.Active;
    L184:
        it3.dispatchFocusCallbacks$ui_release(r17, FocusStateImpl.ActiveParent);
        i$iv2 = i$iv2 - 1;
        goto L175
    L183:
        r17 = FocusStateImpl.Inactive;
        goto L184
    L178:
        return false;
    L187:
        if (focusOwner5.getActiveFocusTargetNode() == $this$performRequestFocusOptimized) goto L190;
        return false;
    L190:
        $this$performRequestFocusOptimized.dispatchFocusCallbacks$ui_release(previousFocusState5, FocusStateImpl.Active);
        if (focusOwner5.getActiveFocusTargetNode() == $this$performRequestFocusOptimized) goto L194;
        return false;
    L194:
        if (ComposeUiFlags.isViewFocusFixEnabled == true) goto L196;
        return true;
    L196:
        if (DelegatableNodeKt.requireLayoutNode($this$performRequestFocusOptimized).getInteropView() != null) goto L245;
        DelegatableNodeKt.requireOwner($this$performRequestFocusOptimized).getFocusOwner().mo4028requestFocusForOwner7o62pno(FocusDirection.m4006boximpl(FocusDirection.Companion.m4017getNextdhqQ8s()), null);
        return true;
    L245:
        return true;
    L77:
        focusOwner5 = focusOwner;
        previousFocusState5 = previousFocusState;
        r26 = 1024;
        goto L78
    L9:
        if (requestFocusForOwner($this$performRequestFocusOptimized) == true) goto L11;
        return false;
    }

    private static final boolean performRequestFocusLegacy(FocusTargetNode $this$performRequestFocusLegacy) {
        boolean r4 = true;
        switch(WhenMappings.$EnumSwitchMapping$0[$this$performRequestFocusLegacy.getFocusState().ordinal()]) {
            case 1: goto L91;
            case 2: goto L91;
            case 3: goto L86;
            case 4: goto L6;
            default: goto L5;
        };
    L6:
        FocusTargetNode $this$nearestAncestor_u2d64DMado$iv = $this$performRequestFocusLegacy;
        int r5 = NodeKind.m5976constructorimpl(1024);
        boolean value$iv$iv$iv$iv = $this$nearestAncestor_u2d64DMado$iv.getNode().isAttached();
        if (value$iv$iv$iv$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L9:
        Modifier.Node node$iv$iv$iv = $this$nearestAncestor_u2d64DMado$iv.getNode().getParent$ui_release();
        LayoutNode layout$iv$iv$iv = DelegatableNodeKt.requireLayoutNode($this$nearestAncestor_u2d64DMado$iv);
    L10:
        if (layout$iv$iv$iv == null) goto L70;
        Modifier.Node head$iv$iv$iv = layout$iv$iv$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv$iv$iv.getAggregateChildKindSet$ui_release() & r5) == 0) goto L62;
    L13:
        if (node$iv$iv$iv == null) goto L61;
        if ((node$iv$iv$iv.getKindSet$ui_release() & r5) == 0) goto L60;
        Modifier.Node it$iv$iv = node$iv$iv$iv;
        MutableVector r20 = null;
        Modifier.Node r2 = it$iv$iv;
    L17:
        if (r2 == null) goto L60;
        if ((r2 instanceof FocusTargetNode) == true) goto L20;
        Modifier.Node this_$iv$iv$iv$iv = r2;
        if ((this_$iv$iv$iv$iv.getKindSet$ui_release() & r5) == 0) goto L24;
        boolean r3 = r4;
    L25:
        if (r3 == false) goto L56;
        if ((r2 instanceof DelegatingNode) == false) goto L56;
        int count$iv$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv$iv2 = (DelegatingNode) r2;
        Modifier.Node node$iv$iv$iv$iv = this_$iv$iv$iv$iv2.getDelegate$ui_release();
    L29:
        if (node$iv$iv$iv$iv == null) goto L52;
        Modifier.Node next$iv$iv$iv = node$iv$iv$iv$iv;
        if ((next$iv$iv$iv.getKindSet$ui_release() & r5) == 0) goto L33;
        boolean r27 = r4;
    L34:
        if (r27 == false) goto L50;
        count$iv$iv$iv = count$iv$iv$iv + 1;
        if (count$iv$iv$iv != r4) goto L38;
        r2 = next$iv$iv$iv;
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv;
    L51:
        node$iv$iv$iv$iv = node$iv$iv$iv$iv.getChild$ui_release();
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv;
        r4 = true;
        goto L29
    L38:
        if (r20 != null) goto L40;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L41:
        Modifier.Node theNode$iv$iv$iv = r2;
        if (theNode$iv$iv$iv == null) goto L46;
        if (r1 == null) goto L45;
        r1.add(theNode$iv$iv$iv);
    L45:
        r2 = null;
    L46:
        if (r1 == null) goto L49;
        r1.add(next$iv$iv$iv);
    L49:
        r20 = r1;
        r2 = r2;
        count$iv$iv$iv = count$iv$iv$iv;
        goto L51
    L40:
        r1 = r20;
        goto L41
    L50:
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv;
        goto L51
    L33:
        r27 = false;
        goto L34
    L52:
        DelegatableNode $this$nearestAncestor_u2d64DMado$iv2 = $this$nearestAncestor_u2d64DMado$iv;
        Modifier.Node r31 = r2;
        boolean r6 = true;
        if (count$iv$iv$iv == 1) goto L54;
    L57:
        r2 = DelegatableNodeKt.access$pop(r20);
        r4 = r6;
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv2;
        goto L17
    L54:
        r4 = true;
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv2;
        r2 = r31;
    L56:
        $this$nearestAncestor_u2d64DMado$iv2 = $this$nearestAncestor_u2d64DMado$iv;
        r6 = r4;
        goto L57
    L24:
        r3 = false;
        goto L25
    L20:
        Modifier.Node r7 = r2;
        boolean r8 = r4;
    L71:
        FocusTargetNode parent = (FocusTargetNode) r7;
        if (parent == null) goto L80;
        FocusStateImpl prevState = parent.getFocusState();
        boolean success = requestFocusForChild(parent, $this$performRequestFocusLegacy);
        if (success == true) goto L76;
    L93:
        if (success == true) goto L95;
    L100:
        return success;
    L95:
        if (ComposeUiFlags.isViewFocusFixEnabled == true) goto L97;
    L99:
        $this$performRequestFocusLegacy.dispatchFocusCallbacks$ui_release();
        goto L100
    L97:
        if (DelegatableNodeKt.requireLayoutNode($this$performRequestFocusLegacy).getInteropView() != null) goto L99;
        DelegatableNodeKt.requireOwner($this$performRequestFocusLegacy).getFocusOwner().mo4028requestFocusForOwner7o62pno(FocusDirection.m4006boximpl(FocusDirection.Companion.m4017getNextdhqQ8s()), null);
        goto L99
    L76:
        if (prevState == parent.getFocusState()) goto L93;
        parent.dispatchFocusCallbacks$ui_release();
        goto L93
    L80:
        if (requestFocusForOwner($this$performRequestFocusLegacy) == true) goto L82;
    L84:
        success = false;
        goto L93
    L82:
        if (grantFocus($this$performRequestFocusLegacy) == false) goto L84;
        success = r8;
    L60:
        node$iv$iv$iv = node$iv$iv$iv.getParent$ui_release();
        r4 = r4;
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv;
        goto L13
    L61:
        DelegatableNode $this$nearestAncestor_u2d64DMado$iv3 = $this$nearestAncestor_u2d64DMado$iv;
        boolean r9 = r4;
    L63:
        layout$iv$iv$iv = layout$iv$iv$iv.getParent$ui_release();
        if (layout$iv$iv$iv == null) goto L68;
        NodeChain r10 = layout$iv$iv$iv.getNodes$ui_release();
        if (r10 == null) goto L68;
        Modifier.Node r11 = r10.getTail$ui_release();
    L69:
        node$iv$iv$iv = r11;
        r4 = r9;
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv3;
    L68:
        r11 = null;
        goto L69
    L62:
        $this$nearestAncestor_u2d64DMado$iv3 = $this$nearestAncestor_u2d64DMado$iv;
        r9 = r4;
        goto L63
    L70:
        r8 = r4;
        r7 = null;
        goto L71
    L91:
        success = true;
        goto L93
    L5:
        throw new NoWhenBranchMatchedException();
    L86:
        if (clearChildFocus$default($this$performRequestFocusLegacy, false, false, 3, null) == true) goto L88;
    L90:
        success = false;
        goto L93
    L88:
        if (grantFocus($this$performRequestFocusLegacy) == false) goto L90;
        success = true;
        goto L93
    }

    public static final boolean captureFocus(FocusTargetNode $this$captureFocus) {
        boolean r1 = false;
        if (ComposeUiFlags.isTrackFocusEnabled == true) goto L5;
        FocusTransactionManager $this$iv = FocusTargetNodeKt.requireTransactionManager($this$captureFocus);
    L26:
        th = move-exception;
        FocusTransactionManager.access$commitTransaction($this$iv);
        throw th;
    L13:
        if ($this$iv.getOngoingTransaction() == false) goto L15;
        FocusTransactionManager.access$cancelTransaction($this$iv);     // Catch: Throwable -> L26
    L15:
        FocusTransactionManager.access$beginTransaction($this$iv);     // Catch: Throwable -> L26
        switch(WhenMappings.$EnumSwitchMapping$0[$this$captureFocus.getFocusState().ordinal()]) {
            case 1: goto L20;
            case 2: goto L19;
            case 3: goto L22;
            case 4: goto L22;
            default: goto L25;
        };     // Catch: Throwable -> L26
    L19:
        r1 = true;
        goto L22
    L20:
        $this$captureFocus.setFocusState(FocusStateImpl.Captured);     // Catch: Throwable -> L26
        $this$captureFocus.dispatchFocusCallbacks$ui_release();     // Catch: Throwable -> L26
        r1 = true;
        goto L22
    L25:
        throw new NoWhenBranchMatchedException();     // Catch: Throwable -> L26
    L22:
        FocusTransactionManager.access$commitTransaction($this$iv);
        return r1;
    L5:
        switch(WhenMappings.$EnumSwitchMapping$0[$this$captureFocus.getFocusState().ordinal()]) {
            case 1: goto L10;
            case 2: goto L30;
            case 3: goto L32;
            case 4: goto L32;
            default: goto L7;
        };
    L10:
        DelegatableNodeKt.requireOwner($this$captureFocus).getFocusOwner().setFocusCaptured(true);
        $this$captureFocus.dispatchFocusCallbacks$ui_release(FocusStateImpl.Active, FocusStateImpl.Captured);
        return true;
    L32:
        return false;
    L7:
        throw new NoWhenBranchMatchedException();
    L30:
        return true;
    }

    public static final boolean freeFocus(FocusTargetNode $this$freeFocus) {
        boolean r1 = false;
        if (ComposeUiFlags.isTrackFocusEnabled == true) goto L5;
        FocusTransactionManager $this$iv = FocusTargetNodeKt.requireTransactionManager($this$freeFocus);
    L26:
        th = move-exception;
        FocusTransactionManager.access$commitTransaction($this$iv);
        throw th;
    L13:
        if ($this$iv.getOngoingTransaction() == false) goto L15;
        FocusTransactionManager.access$cancelTransaction($this$iv);     // Catch: Throwable -> L26
    L15:
        FocusTransactionManager.access$beginTransaction($this$iv);     // Catch: Throwable -> L26
        switch(WhenMappings.$EnumSwitchMapping$0[$this$freeFocus.getFocusState().ordinal()]) {
            case 1: goto L21;
            case 2: goto L19;
            case 3: goto L22;
            case 4: goto L22;
            default: goto L25;
        };     // Catch: Throwable -> L26
    L19:
        $this$freeFocus.setFocusState(FocusStateImpl.Active);     // Catch: Throwable -> L26
        $this$freeFocus.dispatchFocusCallbacks$ui_release();     // Catch: Throwable -> L26
        r1 = true;
        goto L22
    L21:
        r1 = true;
        goto L22
    L25:
        throw new NoWhenBranchMatchedException();     // Catch: Throwable -> L26
    L22:
        FocusTransactionManager.access$commitTransaction($this$iv);
        return r1;
    L5:
        switch(WhenMappings.$EnumSwitchMapping$0[$this$freeFocus.getFocusState().ordinal()]) {
            case 1: goto L31;
            case 2: goto L9;
            case 3: goto L32;
            case 4: goto L32;
            default: goto L7;
        };
    L9:
        DelegatableNodeKt.requireOwner($this$freeFocus).getFocusOwner().setFocusCaptured(false);
        $this$freeFocus.dispatchFocusCallbacks$ui_release(FocusStateImpl.Captured, FocusStateImpl.Active);
        return true;
    L32:
        return false;
    L7:
        throw new NoWhenBranchMatchedException();
    L31:
        return true;
    }

    public static /* synthetic */ boolean clearFocus$default(FocusTargetNode r0, boolean r1, boolean r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = false;
    L6:
        return clearFocus(r0, r1, r2);
    }

    public static final boolean clearFocus(FocusTargetNode $this$clearFocus, boolean forced, boolean refreshFocusEvents) {
        FocusStateImpl r0 = $this$clearFocus.getFocusState();
        switch(WhenMappings.$EnumSwitchMapping$0[r0.ordinal()]) {
            case 1: goto L29;
            case 2: goto L18;
            case 3: goto L8;
            case 4: goto L39;
            default: goto L5;
        };
    L18:
        if (forced == false) goto L38;
        if (ComposeUiFlags.isTrackFocusEnabled == false) goto L24;
        DelegatableNodeKt.requireOwner($this$clearFocus).getFocusOwner().setActiveFocusTargetNode(null);
        if (refreshFocusEvents == false) goto L38;
        $this$clearFocus.dispatchFocusCallbacks$ui_release(FocusStateImpl.Captured, FocusStateImpl.Inactive);
        goto L38
    L24:
        $this$clearFocus.setFocusState(FocusStateImpl.Inactive);
        if (refreshFocusEvents == false) goto L38;
        $this$clearFocus.dispatchFocusCallbacks$ui_release();
    L38:
        return forced;
    L39:
        return true;
    L5:
        throw new NoWhenBranchMatchedException();
    L8:
        if (clearChildFocus($this$clearFocus, forced, refreshFocusEvents) == true) goto L10;
        return false;
    L10:
        if (ComposeUiFlags.isTrackFocusEnabled == false) goto L13;
        if (refreshFocusEvents == false) goto L41;
        $this$clearFocus.dispatchFocusCallbacks$ui_release(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
        return true;
    L41:
        return true;
    L13:
        $this$clearFocus.setFocusState(FocusStateImpl.Inactive);
        if (refreshFocusEvents == false) goto L43;
        $this$clearFocus.dispatchFocusCallbacks$ui_release();
        return true;
    L43:
        return true;
    L29:
        if (ComposeUiFlags.isTrackFocusEnabled == false) goto L33;
        DelegatableNodeKt.requireOwner($this$clearFocus).getFocusOwner().setActiveFocusTargetNode(null);
        if (refreshFocusEvents == false) goto L45;
        $this$clearFocus.dispatchFocusCallbacks$ui_release(FocusStateImpl.Active, FocusStateImpl.Inactive);
        return true;
    L45:
        return true;
    L33:
        $this$clearFocus.setFocusState(FocusStateImpl.Inactive);
        if (refreshFocusEvents == false) goto L47;
        $this$clearFocus.dispatchFocusCallbacks$ui_release();
        return true;
    L47:
        return true;
    }

    private static final boolean grantFocus(final FocusTargetNode $this$grantFocus) {
        ObserverModifierNodeKt.observeReads($this$grantFocus, new AnonymousClass1($this$grantFocus));
        FocusStateImpl r0 = $this$grantFocus.getFocusState();
        switch(WhenMappings.$EnumSwitchMapping$0[r0.ordinal()]) {
            case 3: goto L6;
            case 4: goto L6;
            default: goto L12;
        };
    L12:
        return true;
    L6:
        if (ComposeUiFlags.isTrackFocusEnabled == false) goto L8;
        DelegatableNodeKt.requireOwner($this$grantFocus).getFocusOwner().setActiveFocusTargetNode($this$grantFocus);
        return true;
    L8:
        $this$grantFocus.setFocusState(FocusStateImpl.Active);
        return true;
    }

    static /* synthetic */ boolean clearChildFocus$default(FocusTargetNode r0, boolean r1, boolean r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = false;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = true;
    L9:
        return clearChildFocus(r0, r1, r2);
    }

    private static final boolean clearChildFocus(FocusTargetNode $this$clearChildFocus, boolean forced, boolean refreshFocusEvents) {
        FocusTargetNode r0 = FocusTraversalKt.getActiveChild($this$clearChildFocus);
        if (r0 != null) goto L7;
        return true;
    L7:
        return clearFocus(r0, forced, refreshFocusEvents);
    }

    private static final boolean requestFocusForChild(FocusTargetNode $this$requestFocusForChild, FocusTargetNode childNode) {
        FocusTargetNode $this$nearestAncestor_u2d64DMado$iv = childNode;
        int r3 = 1024;
        int type$iv = NodeKind.m5976constructorimpl(1024);
        boolean value$iv$iv$iv$iv = $this$nearestAncestor_u2d64DMado$iv.getNode().isAttached();
        if (value$iv$iv$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L5:
        Modifier.Node node$iv$iv$iv = $this$nearestAncestor_u2d64DMado$iv.getNode().getParent$ui_release();
        LayoutNode layout$iv$iv$iv = DelegatableNodeKt.requireLayoutNode($this$nearestAncestor_u2d64DMado$iv);
    L6:
        int r15 = 1;
        int r16 = r3;
        if (layout$iv$iv$iv == null) goto L66;
        Modifier.Node head$iv$iv$iv = layout$iv$iv$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L58;
    L10:
        if (node$iv$iv$iv == null) goto L57;
        if ((node$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L56;
        Modifier.Node it$iv$iv = node$iv$iv$iv;
        MutableVector r22 = null;
        Modifier.Node r14 = it$iv$iv;
    L14:
        if (r14 == null) goto L56;
        if ((r14 instanceof FocusTargetNode) == true) goto L17;
        Modifier.Node this_$iv$iv$iv$iv = r14;
        if ((this_$iv$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L21;
        int r4 = r15;
    L22:
        if (r4 == 0) goto L52;
        if ((r14 instanceof DelegatingNode) == false) goto L52;
        int count$iv$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv$iv2 = (DelegatingNode) r14;
        Modifier.Node node$iv$iv$iv$iv = this_$iv$iv$iv$iv2.getDelegate$ui_release();
    L26:
        if (node$iv$iv$iv$iv == null) goto L49;
        Modifier.Node next$iv$iv$iv = node$iv$iv$iv$iv;
        if ((next$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L30;
        int r29 = r15;
    L31:
        if (r29 == 0) goto L47;
        count$iv$iv$iv = count$iv$iv$iv + 1;
        if (count$iv$iv$iv != r15) goto L35;
        r14 = next$iv$iv$iv;
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv;
        type$iv = type$iv;
    L48:
        node$iv$iv$iv$iv = node$iv$iv$iv$iv.getChild$ui_release();
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv;
        type$iv = type$iv;
        r15 = 1;
        goto L26
    L35:
        if (r22 != null) goto L37;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L38:
        Modifier.Node theNode$iv$iv$iv = r14;
        if (theNode$iv$iv$iv == null) goto L43;
        if (r1 == null) goto L42;
        r1.add(theNode$iv$iv$iv);
    L42:
        r14 = null;
    L43:
        if (r1 == null) goto L46;
        r1.add(next$iv$iv$iv);
    L46:
        r22 = r1;
        count$iv$iv$iv = count$iv$iv$iv;
        goto L48
    L37:
        r1 = r22;
        goto L38
    L47:
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv;
        type$iv = type$iv;
        goto L48
    L30:
        r29 = 0;
        goto L31
    L49:
        DelegatableNode $this$nearestAncestor_u2d64DMado$iv2 = $this$nearestAncestor_u2d64DMado$iv;
        int type$iv2 = type$iv;
        if (count$iv$iv$iv == 1) goto L51;
    L53:
        r14 = DelegatableNodeKt.access$pop(r22);
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv2;
        type$iv = type$iv2;
        r15 = 1;
        goto L14
    L51:
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv2;
        type$iv = type$iv2;
        r15 = 1;
    L52:
        $this$nearestAncestor_u2d64DMado$iv2 = $this$nearestAncestor_u2d64DMado$iv;
        type$iv2 = type$iv;
        goto L53
    L21:
        r4 = 0;
        goto L22
    L17:
        Modifier.Node r5 = r14;
    L68:
        if (Intrinsics.areEqual(r5, $this$requestFocusForChild) == false) goto L173;
        switch(WhenMappings.$EnumSwitchMapping$0[$this$requestFocusForChild.getFocusState().ordinal()]) {
            case 1: goto L168;
            case 2: goto L214;
            case 3: goto L161;
            case 4: goto L73;
            default: goto L72;
        };
    L73:
        FocusTargetNode $this$nearestAncestor_u2d64DMado$iv3 = $this$requestFocusForChild;
        int type$iv3 = NodeKind.m5976constructorimpl(r16);
        int r6 = 0;
        boolean value$iv$iv$iv$iv2 = $this$nearestAncestor_u2d64DMado$iv3.getNode().isAttached();
        if (value$iv$iv$iv$iv2 == true) goto L76;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L76:
        Modifier.Node node$iv$iv$iv2 = $this$nearestAncestor_u2d64DMado$iv3.getNode().getParent$ui_release();
        LayoutNode layout$iv$iv$iv2 = DelegatableNodeKt.requireLayoutNode($this$nearestAncestor_u2d64DMado$iv3);
    L77:
        if (layout$iv$iv$iv2 == null) goto L138;
        Modifier.Node head$iv$iv$iv2 = layout$iv$iv$iv2.getNodes$ui_release().getHead$ui_release();
        if ((head$iv$iv$iv2.getAggregateChildKindSet$ui_release() & type$iv3) == 0) goto L130;
    L80:
        if (node$iv$iv$iv2 == null) goto L129;
        if ((node$iv$iv$iv2.getKindSet$ui_release() & type$iv3) == 0) goto L128;
        Modifier.Node it$iv$iv2 = node$iv$iv$iv2;
        MutableVector r17 = null;
        Modifier.Node r2 = it$iv$iv2;
    L84:
        if (r2 == null) goto L128;
        type$iv3 = type$iv3;
        if ((r2 instanceof FocusTargetNode) == true) goto L87;
        Modifier.Node this_$iv$iv$iv$iv3 = r2;
        if ((this_$iv$iv$iv$iv3.getKindSet$ui_release() & type$iv3) == 0) goto L91;
        boolean r7 = true;
    L92:
        if (r7 == false) goto L124;
        if ((r2 instanceof DelegatingNode) == false) goto L124;
        int count$iv$iv$iv2 = 0;
        DelegatingNode this_$iv$iv$iv$iv4 = (DelegatingNode) r2;
        Modifier.Node node$iv$iv$iv$iv2 = this_$iv$iv$iv$iv4.getDelegate$ui_release();
    L96:
        if (node$iv$iv$iv$iv2 == null) goto L120;
        Modifier.Node next$iv$iv$iv2 = node$iv$iv$iv$iv2;
        if ((next$iv$iv$iv2.getKindSet$ui_release() & type$iv3) == 0) goto L100;
        boolean r26 = true;
    L101:
        if (r26 == false) goto L118;
        count$iv$iv$iv2 = count$iv$iv$iv2 + 1;
        Modifier.Node r27 = r2;
        if (count$iv$iv$iv2 != 1) goto L105;
        r6 = r6;
        Modifier.Node r8 = next$iv$iv$iv2;
    L119:
        node$iv$iv$iv$iv2 = node$iv$iv$iv$iv2.getChild$ui_release();
        r2 = r8;
        r6 = r6;
        goto L96
    L105:
        if (r17 != null) goto L107;
        MutableVector r9 = new MutableVector(new Modifier.Node[16], 0);
    L109:
        if (r27 == null) goto L113;
        if (r9 == null) goto L112;
        r9.add(r27);
    L112:
        r8 = null;
    L114:
        if (r9 == null) goto L117;
        r9.add(next$iv$iv$iv2);
    L117:
        r17 = r9;
        count$iv$iv$iv2 = count$iv$iv$iv2;
        goto L119
    L113:
        r8 = r27;
        goto L114
    L107:
        r9 = r17;
        goto L109
    L118:
        r6 = r6;
        r8 = r2;
        goto L119
    L100:
        r26 = false;
        goto L101
    L120:
        Modifier.Node r28 = r2;
        int r31 = r6;
        if (count$iv$iv$iv2 == 1) goto L122;
    L125:
        r2 = DelegatableNodeKt.access$pop(r17);
        r6 = r31;
        goto L84
    L122:
        r2 = r28;
        r6 = r31;
    L124:
        r31 = r6;
        goto L125
    L91:
        r7 = false;
        goto L92
    L87:
        Object it$iv = r2;
        Object r18 = it$iv;
        int r10 = 1;
    L139:
        FocusTargetNode focusParent = (FocusTargetNode) r18;
        if (focusParent == null) goto L142;
    L147:
        if (focusParent != null) goto L149;
    L160:
        return false;
    L149:
        if (requestFocusForChild(focusParent, $this$requestFocusForChild) == false) goto L160;
        boolean success = requestFocusForChild($this$requestFocusForChild, childNode);
        if ($this$requestFocusForChild.getFocusState() != FocusStateImpl.ActiveParent) goto L153;
        int r19 = r10;
    L154:
        if (r19 == 0) goto L159;
        if (success == false) goto L210;
        focusParent.dispatchFocusCallbacks$ui_release();
    L210:
        return success;
    L159:
        throw new IllegalStateException("Deactivated node is focused".toString());
    L153:
        r19 = 0;
        goto L154
    L142:
        if (requestFocusForOwner($this$requestFocusForChild) == false) goto L147;
        boolean success2 = grantFocus(childNode);
        if (success2 == false) goto L217;
        $this$requestFocusForChild.setFocusState(FocusStateImpl.ActiveParent);
        return success2;
    L217:
        return success2;
    L128:
        node$iv$iv$iv2 = node$iv$iv$iv2.getParent$ui_release();
        $this$nearestAncestor_u2d64DMado$iv3 = $this$nearestAncestor_u2d64DMado$iv3;
        type$iv3 = type$iv3;
        r6 = r6;
        goto L80
    L129:
        DelegatableNode $this$nearestAncestor_u2d64DMado$iv4 = $this$nearestAncestor_u2d64DMado$iv3;
        int type$iv4 = type$iv3;
        int r32 = r6;
    L131:
        layout$iv$iv$iv2 = layout$iv$iv$iv2.getParent$ui_release();
        if (layout$iv$iv$iv2 == null) goto L136;
        NodeChain r11 = layout$iv$iv$iv2.getNodes$ui_release();
        if (r11 == null) goto L136;
        Modifier.Node r12 = r11.getTail$ui_release();
    L137:
        node$iv$iv$iv2 = r12;
        $this$nearestAncestor_u2d64DMado$iv3 = $this$nearestAncestor_u2d64DMado$iv4;
        type$iv3 = type$iv4;
        r6 = r32;
    L136:
        r12 = null;
        goto L137
    L130:
        $this$nearestAncestor_u2d64DMado$iv4 = $this$nearestAncestor_u2d64DMado$iv3;
        type$iv4 = type$iv3;
        r32 = r6;
        goto L131
    L138:
        r10 = 1;
        r18 = null;
        goto L139
    L161:
        requireActiveChild($this$requestFocusForChild);
        if (clearChildFocus$default($this$requestFocusForChild, false, false, 3, null) == false) goto L213;
        if (grantFocus(childNode) == false) goto L213;
        return true;
    L213:
        return false;
    L168:
        boolean success3 = grantFocus(childNode);
        if (success3 == false) goto L215;
        $this$requestFocusForChild.setFocusState(FocusStateImpl.ActiveParent);
        return success3;
    L215:
        return success3;
    L72:
        throw new NoWhenBranchMatchedException();
    L214:
        return false;
    L173:
        throw new IllegalStateException("Non child node cannot request focus.".toString());
    L56:
        node$iv$iv$iv = node$iv$iv$iv.getParent$ui_release();
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv;
        type$iv = type$iv;
        r15 = 1;
        goto L10
    L57:
        DelegatableNode $this$nearestAncestor_u2d64DMado$iv5 = $this$nearestAncestor_u2d64DMado$iv;
        int type$iv5 = type$iv;
    L59:
        layout$iv$iv$iv = layout$iv$iv$iv.getParent$ui_release();
        if (layout$iv$iv$iv == null) goto L64;
        NodeChain r13 = layout$iv$iv$iv.getNodes$ui_release();
        if (r13 == null) goto L64;
        Modifier.Node r110 = r13.getTail$ui_release();
    L65:
        node$iv$iv$iv = r110;
        r3 = r16;
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv5;
        type$iv = type$iv5;
    L64:
        r110 = null;
        goto L65
    L58:
        $this$nearestAncestor_u2d64DMado$iv5 = $this$nearestAncestor_u2d64DMado$iv;
        type$iv5 = type$iv;
        goto L59
    L66:
        r5 = null;
        goto L68
    }

    private static final boolean requestFocusForOwner(FocusTargetNode $this$requestFocusForOwner) {
        return DelegatableNodeKt.requireOwner($this$requestFocusForOwner).getFocusOwner().mo4028requestFocusForOwner7o62pno(null, null);
    }

    private static final FocusTargetNode requireActiveChild(FocusTargetNode $this$requireActiveChild) {
        FocusTargetNode r0 = FocusTraversalKt.getActiveChild($this$requireActiveChild);
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IllegalArgumentException("ActiveParent with no focused child".toString());
    }

    /* JADX INFO: renamed from: performCustomRequestFocus-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m4050performCustomRequestFocusMxy_nc0(FocusTargetNode $this$performCustomRequestFocus_u2dMxy_nc0, int focusDirection) {
        switch(WhenMappings.$EnumSwitchMapping$0[$this$performCustomRequestFocus_u2dMxy_nc0.getFocusState().ordinal()]) {
            case 1: goto L95;
            case 2: goto L95;
            case 3: goto L93;
            case 4: goto L6;
            default: goto L5;
        };
    L6:
        FocusTargetNode $this$nearestAncestor_u2d64DMado$iv = $this$performCustomRequestFocus_u2dMxy_nc0;
        int type$iv = NodeKind.m5976constructorimpl(1024);
        int r3 = 0;
        boolean value$iv$iv$iv$iv = $this$nearestAncestor_u2d64DMado$iv.getNode().isAttached();
        if (value$iv$iv$iv$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L9:
        Modifier.Node node$iv$iv$iv = $this$nearestAncestor_u2d64DMado$iv.getNode().getParent$ui_release();
        LayoutNode layout$iv$iv$iv = DelegatableNodeKt.requireLayoutNode($this$nearestAncestor_u2d64DMado$iv);
    L10:
        int r14 = 1;
        if (layout$iv$iv$iv == null) goto L70;
        Modifier.Node head$iv$iv$iv = layout$iv$iv$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L62;
    L14:
        if (node$iv$iv$iv == null) goto L61;
        if ((node$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L60;
        Modifier.Node it$iv$iv = node$iv$iv$iv;
        MutableVector r20 = null;
        Modifier.Node r12 = it$iv$iv;
    L18:
        if (r12 == null) goto L60;
        if ((r12 instanceof FocusTargetNode) == true) goto L21;
        Modifier.Node this_$iv$iv$iv$iv = r12;
        if ((this_$iv$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L25;
        int r13 = r14;
    L26:
        if (r13 == 0) goto L56;
        if ((r12 instanceof DelegatingNode) == false) goto L56;
        int count$iv$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv$iv2 = (DelegatingNode) r12;
        Modifier.Node node$iv$iv$iv$iv = this_$iv$iv$iv$iv2.getDelegate$ui_release();
    L30:
        if (node$iv$iv$iv$iv == null) goto L53;
        Modifier.Node next$iv$iv$iv = node$iv$iv$iv$iv;
        if ((next$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L34;
        int r27 = r14;
    L35:
        if (r27 == 0) goto L51;
        count$iv$iv$iv = count$iv$iv$iv + 1;
        if (count$iv$iv$iv != r14) goto L39;
        r12 = next$iv$iv$iv;
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv;
        type$iv = type$iv;
        r3 = r3;
    L52:
        node$iv$iv$iv$iv = node$iv$iv$iv$iv.getChild$ui_release();
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv;
        type$iv = type$iv;
        r3 = r3;
        r14 = 1;
        goto L30
    L39:
        if (r20 != null) goto L41;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L42:
        Modifier.Node theNode$iv$iv$iv = r12;
        if (theNode$iv$iv$iv == null) goto L47;
        if (r1 == null) goto L46;
        r1.add(theNode$iv$iv$iv);
    L46:
        r12 = null;
    L47:
        if (r1 == null) goto L50;
        r1.add(next$iv$iv$iv);
    L50:
        r20 = r1;
        goto L52
    L41:
        r1 = r20;
        goto L42
    L51:
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv;
        type$iv = type$iv;
        r3 = r3;
        goto L52
    L34:
        r27 = 0;
        goto L35
    L53:
        DelegatableNode $this$nearestAncestor_u2d64DMado$iv2 = $this$nearestAncestor_u2d64DMado$iv;
        int type$iv2 = type$iv;
        int r32 = r3;
        int r2 = 1;
        if (count$iv$iv$iv == 1) goto L55;
    L57:
        r12 = DelegatableNodeKt.access$pop(r20);
        r14 = r2;
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv2;
        type$iv = type$iv2;
        r3 = r32;
        goto L18
    L55:
        r14 = 1;
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv2;
        type$iv = type$iv2;
        r3 = r32;
    L56:
        $this$nearestAncestor_u2d64DMado$iv2 = $this$nearestAncestor_u2d64DMado$iv;
        type$iv2 = type$iv;
        r32 = r3;
        r2 = r14;
        goto L57
    L25:
        r13 = 0;
        goto L26
    L21:
        Modifier.Node r15 = r12;
        int r4 = r14;
        int r5 = 0;
    L71:
        FocusTargetNode focusParent = (FocusTargetNode) r15;
        if (focusParent != null) goto L76;
        return CustomDestinationResult.None;
    L76:
        switch(WhenMappings.$EnumSwitchMapping$0[focusParent.getFocusState().ordinal()]) {
            case 1: goto L91;
            case 2: goto L117;
            case 3: goto L116;
            case 4: goto L79;
            default: goto L78;
        };
    L79:
        CustomDestinationResult it = m4050performCustomRequestFocusMxy_nc0(focusParent, focusDirection);
        if (it == CustomDestinationResult.None) goto L83;
        r4 = r5;
    L83:
        if (r4 != 0) goto L85;
        CustomDestinationResult r16 = it;
    L86:
        if (r16 == null) goto L115;
        return r16;
    L115:
        return m4048performCustomEnterMxy_nc0(focusParent, focusDirection);
    L85:
        r16 = null;
        goto L86
    L78:
        throw new NoWhenBranchMatchedException();
    L116:
        return m4050performCustomRequestFocusMxy_nc0(focusParent, focusDirection);
    L117:
        return CustomDestinationResult.Cancelled;
    L91:
        return m4048performCustomEnterMxy_nc0(focusParent, focusDirection);
    L60:
        node$iv$iv$iv = node$iv$iv$iv.getParent$ui_release();
        r14 = r14;
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv;
        type$iv = type$iv;
        r3 = r3;
        goto L14
    L61:
        DelegatableNode $this$nearestAncestor_u2d64DMado$iv3 = $this$nearestAncestor_u2d64DMado$iv;
        int type$iv3 = type$iv;
        int r33 = r3;
    L63:
        layout$iv$iv$iv = layout$iv$iv$iv.getParent$ui_release();
        if (layout$iv$iv$iv == null) goto L68;
        NodeChain r6 = layout$iv$iv$iv.getNodes$ui_release();
        if (r6 == null) goto L68;
        Modifier.Node r17 = r6.getTail$ui_release();
    L69:
        node$iv$iv$iv = r17;
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv3;
        type$iv = type$iv3;
        r3 = r33;
    L68:
        r17 = null;
        goto L69
    L62:
        $this$nearestAncestor_u2d64DMado$iv3 = $this$nearestAncestor_u2d64DMado$iv;
        type$iv3 = type$iv;
        r33 = r3;
        goto L63
    L70:
        r4 = 1;
        r5 = 0;
        r15 = null;
        goto L71
    L5:
        throw new NoWhenBranchMatchedException();
    L93:
        return m4047performCustomClearFocusMxy_nc0(requireActiveChild($this$performCustomRequestFocus_u2dMxy_nc0), focusDirection);
    L95:
        return CustomDestinationResult.None;
    }

    /* JADX INFO: renamed from: performCustomClearFocus-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m4047performCustomClearFocusMxy_nc0(FocusTargetNode $this$performCustomClearFocus_u2dMxy_nc0, int focusDirection) {
        FocusStateImpl r0 = $this$performCustomClearFocus_u2dMxy_nc0.getFocusState();
        switch(WhenMappings.$EnumSwitchMapping$0[r0.ordinal()]) {
            case 1: goto L17;
            case 2: goto L20;
            case 3: goto L6;
            case 4: goto L17;
            default: goto L5;
        };
    L6:
        CustomDestinationResult it = m4047performCustomClearFocusMxy_nc0(requireActiveChild($this$performCustomClearFocus_u2dMxy_nc0), focusDirection);
        if (it != CustomDestinationResult.None) goto L9;
        boolean r3 = true;
    L10:
        if (r3 == false) goto L13;
        it = null;
    L13:
        if (it == null) goto L19;
        return it;
    L19:
        return m4049performCustomExitMxy_nc0($this$performCustomClearFocus_u2dMxy_nc0, focusDirection);
    L9:
        r3 = false;
        goto L10
    L5:
        throw new NoWhenBranchMatchedException();
    L20:
        return CustomDestinationResult.Cancelled;
    L17:
        return CustomDestinationResult.None;
    }

    /* JADX INFO: renamed from: performCustomEnter-Mxy_nc0, reason: not valid java name */
    private static final CustomDestinationResult m4048performCustomEnterMxy_nc0(FocusTargetNode $this$performCustomEnter_u2dMxy_nc0, int focusDirection) {
        if (FocusTargetNode.access$isProcessingCustomEnter$p($this$performCustomEnter_u2dMxy_nc0) == true) goto L70;
        FocusTargetNode.access$setProcessingCustomEnter$p($this$performCustomEnter_u2dMxy_nc0, true);
        FocusProperties focusProperties$iv$iv = $this$performCustomEnter_u2dMxy_nc0.fetchFocusProperties$ui_release();     // Catch: Throwable -> L63
        CancelIndicatingFocusBoundaryScope scope$iv$iv = new CancelIndicatingFocusBoundaryScope(focusDirection, null);     // Catch: Throwable -> L61
        FocusTransactionManager focusTransactionManager$iv$iv = FocusTargetNodeKt.getFocusTransactionManager($this$performCustomEnter_u2dMxy_nc0);     // Catch: Throwable -> L61
        if (focusTransactionManager$iv$iv != null) goto L72;
        int generationBefore$iv$iv = 0;
    L14:
        FocusOwner focusOwner$iv$iv = DelegatableNodeKt.requireOwner($this$performCustomEnter_u2dMxy_nc0).getFocusOwner();     // Catch: Throwable -> L61
        FocusTargetNode activeNodeBefore$iv$iv = focusOwner$iv$iv.getActiveFocusTargetNode();     // Catch: Throwable -> L61
        CancelIndicatingFocusBoundaryScope it$iv = scope$iv$iv;     // Catch: Throwable -> L61
        focusProperties$iv$iv.getOnEnter().invoke(it$iv);     // Catch: Throwable -> L61
        if (focusTransactionManager$iv$iv == null) goto L18;
        int generationAfter$iv$iv = focusTransactionManager$iv$iv.getGeneration();     // Catch: Throwable -> L11
    L19:
        FocusTargetNode activeNodeAfter$iv$iv = focusOwner$iv$iv.getActiveFocusTargetNode();     // Catch: Throwable -> L61
        if (scope$iv$iv.isCanceled() == false) goto L38;
        FocusRequester it = FocusRequester.Companion.getCancel();     // Catch: Throwable -> L61
        if (it != FocusRequester.Companion.getCancel()) goto L26;
        CustomDestinationResult r8 = CustomDestinationResult.Cancelled;     // Catch: Throwable -> L11
    L24:
        FocusTargetNode.access$setProcessingCustomEnter$p($this$performCustomEnter_u2dMxy_nc0, false);
        return r8;
    L26:
        if (it != FocusRequester.Companion.getRedirect$ui_release()) goto L32;
        r8 = CustomDestinationResult.Redirected;     // Catch: Throwable -> L11
        goto L24
    L32:
        if (FocusRequester.m4036requestFocus3ESFkO8$default(it, 0, 1, null) == false) goto L34;
        CustomDestinationResult r2 = CustomDestinationResult.Redirected;     // Catch: Throwable -> L59
    L35:
        FocusTargetNode.access$setProcessingCustomEnter$p($this$performCustomEnter_u2dMxy_nc0, false);
        return r2;
    L34:
        r2 = CustomDestinationResult.RedirectCancelled;     // Catch: Throwable -> L59
        goto L35
    L38:
        if (generationBefore$iv$iv == generationAfter$iv$iv) goto L40;
    L45:
        FocusRequester it2 = FocusRequester.Companion.getRedirect$ui_release();     // Catch: Throwable -> L59
        if (it2 != FocusRequester.Companion.getCancel()) goto L51;
        CustomDestinationResult r15 = CustomDestinationResult.Cancelled;     // Catch: Throwable -> L59
    L48:
        FocusTargetNode.access$setProcessingCustomEnter$p($this$performCustomEnter_u2dMxy_nc0, false);
        return r15;
    L51:
        if (it2 != FocusRequester.Companion.getRedirect$ui_release()) goto L54;
        r15 = CustomDestinationResult.Redirected;     // Catch: Throwable -> L59
        goto L48
    L54:
        if (FocusRequester.m4036requestFocus3ESFkO8$default(it2, 0, 1, null) == false) goto L56;
        CustomDestinationResult r0 = CustomDestinationResult.Redirected;     // Catch: Throwable -> L59
    L57:
        FocusTargetNode.access$setProcessingCustomEnter$p($this$performCustomEnter_u2dMxy_nc0, false);
        return r0;
    L56:
        r0 = CustomDestinationResult.RedirectCancelled;     // Catch: Throwable -> L59
        goto L57
    L40:
        if (ComposeUiFlags.isTrackFocusEnabled == false) goto L44;
        if (activeNodeBefore$iv$iv == activeNodeAfter$iv$iv) goto L44;
        if (activeNodeAfter$iv$iv != null) goto L45;
    L44:
        FocusTargetNode.access$setProcessingCustomEnter$p($this$performCustomEnter_u2dMxy_nc0, false);
    L59:
        th = th;
    L66:
        FocusTargetNode.access$setProcessingCustomEnter$p($this$performCustomEnter_u2dMxy_nc0, false);
        throw th;
    L18:
        generationAfter$iv$iv = 0;
        goto L19
    L72:
        generationBefore$iv$iv = focusTransactionManager$iv$iv.getGeneration();     // Catch: Throwable -> L11
    L11:
        th = th;
    L61:
        th = th;
    L63:
        th = th;
    L70:
        return CustomDestinationResult.None;
    }

    /* JADX INFO: renamed from: performCustomExit-Mxy_nc0, reason: not valid java name */
    private static final CustomDestinationResult m4049performCustomExitMxy_nc0(FocusTargetNode $this$performCustomExit_u2dMxy_nc0, int focusDirection) {
        if (FocusTargetNode.access$isProcessingCustomExit$p($this$performCustomExit_u2dMxy_nc0) == true) goto L70;
        FocusTargetNode.access$setProcessingCustomExit$p($this$performCustomExit_u2dMxy_nc0, true);
        FocusProperties focusProperties$iv$iv = $this$performCustomExit_u2dMxy_nc0.fetchFocusProperties$ui_release();     // Catch: Throwable -> L63
        CancelIndicatingFocusBoundaryScope scope$iv$iv = new CancelIndicatingFocusBoundaryScope(focusDirection, null);     // Catch: Throwable -> L61
        FocusTransactionManager focusTransactionManager$iv$iv = FocusTargetNodeKt.getFocusTransactionManager($this$performCustomExit_u2dMxy_nc0);     // Catch: Throwable -> L61
        if (focusTransactionManager$iv$iv != null) goto L72;
        int generationBefore$iv$iv = 0;
    L14:
        FocusOwner focusOwner$iv$iv = DelegatableNodeKt.requireOwner($this$performCustomExit_u2dMxy_nc0).getFocusOwner();     // Catch: Throwable -> L61
        FocusTargetNode activeNodeBefore$iv$iv = focusOwner$iv$iv.getActiveFocusTargetNode();     // Catch: Throwable -> L61
        CancelIndicatingFocusBoundaryScope it$iv = scope$iv$iv;     // Catch: Throwable -> L61
        focusProperties$iv$iv.getOnExit().invoke(it$iv);     // Catch: Throwable -> L61
        if (focusTransactionManager$iv$iv == null) goto L18;
        int generationAfter$iv$iv = focusTransactionManager$iv$iv.getGeneration();     // Catch: Throwable -> L11
    L19:
        FocusTargetNode activeNodeAfter$iv$iv = focusOwner$iv$iv.getActiveFocusTargetNode();     // Catch: Throwable -> L61
        if (scope$iv$iv.isCanceled() == false) goto L38;
        FocusRequester it = FocusRequester.Companion.getCancel();     // Catch: Throwable -> L61
        if (it != FocusRequester.Companion.getCancel()) goto L26;
        CustomDestinationResult r8 = CustomDestinationResult.Cancelled;     // Catch: Throwable -> L11
    L24:
        FocusTargetNode.access$setProcessingCustomExit$p($this$performCustomExit_u2dMxy_nc0, false);
        return r8;
    L26:
        if (it != FocusRequester.Companion.getRedirect$ui_release()) goto L32;
        r8 = CustomDestinationResult.Redirected;     // Catch: Throwable -> L11
        goto L24
    L32:
        if (FocusRequester.m4036requestFocus3ESFkO8$default(it, 0, 1, null) == false) goto L34;
        CustomDestinationResult r2 = CustomDestinationResult.Redirected;     // Catch: Throwable -> L59
    L35:
        FocusTargetNode.access$setProcessingCustomExit$p($this$performCustomExit_u2dMxy_nc0, false);
        return r2;
    L34:
        r2 = CustomDestinationResult.RedirectCancelled;     // Catch: Throwable -> L59
        goto L35
    L38:
        if (generationBefore$iv$iv == generationAfter$iv$iv) goto L40;
    L45:
        FocusRequester it2 = FocusRequester.Companion.getRedirect$ui_release();     // Catch: Throwable -> L59
        if (it2 != FocusRequester.Companion.getCancel()) goto L51;
        CustomDestinationResult r15 = CustomDestinationResult.Cancelled;     // Catch: Throwable -> L59
    L48:
        FocusTargetNode.access$setProcessingCustomExit$p($this$performCustomExit_u2dMxy_nc0, false);
        return r15;
    L51:
        if (it2 != FocusRequester.Companion.getRedirect$ui_release()) goto L54;
        r15 = CustomDestinationResult.Redirected;     // Catch: Throwable -> L59
        goto L48
    L54:
        if (FocusRequester.m4036requestFocus3ESFkO8$default(it2, 0, 1, null) == false) goto L56;
        CustomDestinationResult r0 = CustomDestinationResult.Redirected;     // Catch: Throwable -> L59
    L57:
        FocusTargetNode.access$setProcessingCustomExit$p($this$performCustomExit_u2dMxy_nc0, false);
        return r0;
    L56:
        r0 = CustomDestinationResult.RedirectCancelled;     // Catch: Throwable -> L59
        goto L57
    L40:
        if (ComposeUiFlags.isTrackFocusEnabled == false) goto L44;
        if (activeNodeBefore$iv$iv == activeNodeAfter$iv$iv) goto L44;
        if (activeNodeAfter$iv$iv != null) goto L45;
    L44:
        FocusTargetNode.access$setProcessingCustomExit$p($this$performCustomExit_u2dMxy_nc0, false);
    L59:
        th = th;
    L66:
        FocusTargetNode.access$setProcessingCustomExit$p($this$performCustomExit_u2dMxy_nc0, false);
        throw th;
    L18:
        generationAfter$iv$iv = 0;
        goto L19
    L72:
        generationBefore$iv$iv = focusTransactionManager$iv$iv.getGeneration();     // Catch: Throwable -> L11
    L11:
        th = th;
    L61:
        th = th;
    L63:
        th = th;
    L70:
        return CustomDestinationResult.None;
    }
}
