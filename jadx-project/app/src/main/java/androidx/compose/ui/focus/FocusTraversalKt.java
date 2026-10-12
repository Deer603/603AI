package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FocusTraversal.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0007\u001a\u00020\b*\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0000\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0002\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0001H\u0000\u001aF\u0010\u0013\u001a\u0004\u0018\u00010\u0005*\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0016H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"activeChild", "Landroidx/compose/ui/focus/FocusTargetNode;", "getActiveChild", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "isEligibleForFocusSearch", "", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "customFocusSearch", "Landroidx/compose/ui/focus/FocusRequester;", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "customFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;", "findActiveFocusNode", "findNonDeactivatedParent", "focusRect", "Landroidx/compose/ui/geometry/Rect;", "focusSearch", "previouslyFocusedRect", "onFound", "Lkotlin/Function1;", "focusSearch-0X8WOeE", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FocusTraversalKt {

    /* JADX INFO: compiled from: FocusTraversal.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = null;

        static {
            int[] r0 = new int[LayoutDirection.values().length];
            r0[LayoutDirection.Ltr.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L25:
            r0[LayoutDirection.Rtl.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
        L10:
            $EnumSwitchMapping$0 = r0;
            int[] r1 = new int[FocusStateImpl.values().length];
            r1[FocusStateImpl.Active.ordinal()] = 1;     // Catch: NoSuchFieldError -> L13
        L31:
            r1[FocusStateImpl.ActiveParent.ordinal()] = 2;     // Catch: NoSuchFieldError -> L16
        L33:
            r1[FocusStateImpl.Captured.ordinal()] = 3;     // Catch: NoSuchFieldError -> L19
        L27:
            r1[FocusStateImpl.Inactive.ordinal()] = 4;     // Catch: NoSuchFieldError -> L22
        L23:
            $EnumSwitchMapping$1 = r1;
        }
    }

    /* JADX INFO: renamed from: customFocusSearch--OM-vw8, reason: not valid java name */
    public static final FocusRequester m4051customFocusSearchOMvw8(FocusTargetNode $this$customFocusSearch_u2d_u2dOM_u2dvw8, int focusDirection, LayoutDirection layoutDirection) {
        FocusProperties focusProperties = $this$customFocusSearch_u2d_u2dOM_u2dvw8.fetchFocusProperties$ui_release();
        if (FocusDirection.m4009equalsimpl0(focusDirection, FocusDirection.Companion.m4017getNextdhqQ8s()) == false) goto L6;
        return focusProperties.getNext();
    L6:
        if (FocusDirection.m4009equalsimpl0(focusDirection, FocusDirection.Companion.m4018getPreviousdhqQ8s()) == false) goto L9;
        return focusProperties.getPrevious();
    L9:
        if (FocusDirection.m4009equalsimpl0(focusDirection, FocusDirection.Companion.m4020getUpdhqQ8s()) == false) goto L12;
        return focusProperties.getUp();
    L12:
        if (FocusDirection.m4009equalsimpl0(focusDirection, FocusDirection.Companion.m4013getDowndhqQ8s()) == true) goto L81;
        boolean r3 = true;
        int generationAfter = 0;
        if (FocusDirection.m4009equalsimpl0(focusDirection, FocusDirection.Companion.m4016getLeftdhqQ8s()) == false) goto L32;
        switch(WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()]) {
            case 1: goto L21;
            case 2: goto L20;
            default: goto L19;
        };
    L20:
        FocusRequester r1 = focusProperties.getEnd();
    L22:
        FocusRequester it = r1;
        if (it == FocusRequester.Companion.getDefault()) goto L26;
        r3 = false;
    L26:
        if (r3 == false) goto L29;
        r1 = null;
    L29:
        if (r1 == null) goto L83;
        return r1;
    L83:
        return focusProperties.getLeft();
    L21:
        r1 = focusProperties.getStart();
        goto L22
    L19:
        throw new NoWhenBranchMatchedException();
    L32:
        if (FocusDirection.m4009equalsimpl0(focusDirection, FocusDirection.Companion.m4019getRightdhqQ8s()) == false) goto L49;
        switch(WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()]) {
            case 1: goto L38;
            case 2: goto L37;
            default: goto L36;
        };
    L37:
        FocusRequester r2 = focusProperties.getStart();
    L39:
        FocusRequester it2 = r2;
        if (it2 == FocusRequester.Companion.getDefault()) goto L43;
        r3 = false;
    L43:
        if (r3 == false) goto L46;
        r2 = null;
    L46:
        if (r2 == null) goto L85;
        return r2;
    L85:
        return focusProperties.getRight();
    L38:
        r2 = focusProperties.getEnd();
        goto L39
    L36:
        throw new NoWhenBranchMatchedException();
    L49:
        if (FocusDirection.m4009equalsimpl0(focusDirection, FocusDirection.Companion.m4014getEnterdhqQ8s()) == true) goto L52;
        r3 = FocusDirection.m4009equalsimpl0(focusDirection, FocusDirection.Companion.m4015getExitdhqQ8s());
    L52:
        if (r3 == false) goto L77;
        CancelIndicatingFocusBoundaryScope scope = new CancelIndicatingFocusBoundaryScope(focusDirection, null);
        FocusTransactionManager focusTransactionManager = FocusTargetNodeKt.getFocusTransactionManager($this$customFocusSearch_u2d_u2dOM_u2dvw8);
        if (focusTransactionManager == null) goto L56;
        int generationBefore = focusTransactionManager.getGeneration();
    L57:
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner($this$customFocusSearch_u2d_u2dOM_u2dvw8).getFocusOwner();
        FocusTargetNode activeNodeBefore = focusOwner.getActiveFocusTargetNode();
        if (FocusDirection.m4009equalsimpl0(focusDirection, FocusDirection.Companion.m4014getEnterdhqQ8s()) == false) goto L60;
        focusProperties.getOnEnter().invoke(scope);
    L61:
        if (focusTransactionManager == null) goto L64;
        generationAfter = focusTransactionManager.getGeneration();
    L64:
        if (scope.isCanceled() == false) goto L66;
        FocusRequester r9 = FocusRequester.Companion.getCancel();
    L75:
        return r9;
    L66:
        if (generationBefore == generationAfter) goto L68;
    L73:
        r9 = FocusRequester.Companion.getRedirect$ui_release();
        goto L75
    L68:
        if (ComposeUiFlags.isTrackFocusEnabled == true) goto L70;
    L72:
        r9 = FocusRequester.Companion.getDefault();
        goto L75
    L70:
        if (activeNodeBefore == focusOwner.getActiveFocusTargetNode()) goto L72;
    L60:
        focusProperties.getOnExit().invoke(scope);
        goto L61
    L56:
        generationBefore = 0;
        goto L57
    L77:
        throw new IllegalStateException("invalid FocusDirection".toString());
    L81:
        return focusProperties.getDown();
    }

    /* JADX INFO: renamed from: focusSearch-0X8WOeE, reason: not valid java name */
    public static final Boolean m4052focusSearch0X8WOeE(FocusTargetNode $this$focusSearch_u2d0X8WOeE, int focusDirection, LayoutDirection layoutDirection, Rect previouslyFocusedRect, Function1<? super FocusTargetNode, Boolean> r7) {
        boolean r1 = true;
        if (FocusDirection.m4009equalsimpl0(focusDirection, FocusDirection.Companion.m4017getNextdhqQ8s()) == false) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L9;
        return Boolean.valueOf(OneDimensionalFocusSearchKt.m4066oneDimensionalFocusSearchOMvw8($this$focusSearch_u2d0X8WOeE, focusDirection, r7));
    L9:
        if (FocusDirection.m4009equalsimpl0(focusDirection, FocusDirection.Companion.m4016getLeftdhqQ8s()) == false) goto L11;
        boolean r2 = true;
    L12:
        if (r2 == false) goto L14;
        boolean r3 = true;
    L15:
        if (r3 == true) goto L18;
        r1 = FocusDirection.m4009equalsimpl0(focusDirection, FocusDirection.Companion.m4013getDowndhqQ8s());
    L18:
        if (r1 == true) goto L49;
        FocusTargetNode it = null;
        if (FocusDirection.m4009equalsimpl0(focusDirection, FocusDirection.Companion.m4014getEnterdhqQ8s()) == false) goto L33;
        switch(WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()]) {
            case 1: goto L27;
            case 2: goto L26;
            default: goto L25;
        };
    L26:
        int direction = FocusDirection.Companion.m4016getLeftdhqQ8s();
    L28:
        FocusTargetNode r4 = findActiveFocusNode($this$focusSearch_u2d0X8WOeE);
        if (r4 == null) goto L51;
        return TwoDimensionalFocusSearchKt.m4075twoDimensionalFocusSearchsMXa3k8(r4, direction, previouslyFocusedRect, r7);
    L51:
        return null;
    L27:
        direction = FocusDirection.Companion.m4019getRightdhqQ8s();
        goto L28
    L25:
        throw new NoWhenBranchMatchedException();
    L33:
        if (FocusDirection.m4009equalsimpl0(focusDirection, FocusDirection.Companion.m4015getExitdhqQ8s()) == false) goto L47;
        FocusTargetNode r5 = findActiveFocusNode($this$focusSearch_u2d0X8WOeE);
        if (r5 == null) goto L38;
        it = findNonDeactivatedParent(r5);
    L38:
        if (it != null) goto L40;
    L43:
        boolean r6 = false;
    L45:
        return Boolean.valueOf(r6);
    L40:
        if (Intrinsics.areEqual(it, $this$focusSearch_u2d0X8WOeE) == true) goto L43;
        r6 = r7.invoke(it).booleanValue();
        goto L45
    L47:
        throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + FocusDirection.m4011toStringimpl(focusDirection)).toString());
    L49:
        return TwoDimensionalFocusSearchKt.m4075twoDimensionalFocusSearchsMXa3k8($this$focusSearch_u2d0X8WOeE, focusDirection, previouslyFocusedRect, r7);
    L14:
        r3 = FocusDirection.m4009equalsimpl0(focusDirection, FocusDirection.Companion.m4020getUpdhqQ8s());
        goto L15
    L11:
        r2 = FocusDirection.m4009equalsimpl0(focusDirection, FocusDirection.Companion.m4019getRightdhqQ8s());
        goto L12
    L5:
        r0 = FocusDirection.m4009equalsimpl0(focusDirection, FocusDirection.Companion.m4018getPreviousdhqQ8s());
        goto L6
    }

    public static final Rect focusRect(FocusTargetNode $this$focusRect) {
        NodeCoordinator it = $this$focusRect.getCoordinator$ui_release();
        if (it == null) goto L7;
        Rect r0 = LayoutCoordinatesKt.findRootCoordinates(it).localBoundingBoxOf(it, false);
        if (r0 == null) goto L7;
        return r0;
    L7:
        return Rect.Companion.getZero();
    }

    public static final boolean isEligibleForFocusSearch(FocusTargetNode $this$isEligibleForFocusSearch) {
        NodeCoordinator r0 = $this$isEligibleForFocusSearch.getCoordinator$ui_release();
        if (r0 == null) goto L9;
        LayoutNode r1 = r0.getLayoutNode();
        if (r1 == null) goto L9;
        if (r1.isPlaced() != true) goto L9;
        boolean r2 = true;
    L10:
        if (r2 == false) goto L22;
        NodeCoordinator r3 = $this$isEligibleForFocusSearch.getCoordinator$ui_release();
        if (r3 == null) goto L18;
        LayoutNode r4 = r3.getLayoutNode();
        if (r4 == null) goto L18;
        if (r4.isAttached() != true) goto L18;
        boolean r5 = true;
    L19:
        if (r5 == false) goto L22;
        return true;
    L18:
        r5 = false;
    L22:
        return false;
    L9:
        r2 = false;
        goto L10
    }

    public static final FocusTargetNode getActiveChild(FocusTargetNode $this$activeChild) {
        FocusTargetNode r1 = null;
        if ($this$activeChild.getNode().isAttached() == true) goto L5;
        return null;
    L5:
        FocusTargetNode $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$activeChild;
        int type$iv = NodeKind.m5976constructorimpl(1024);
        boolean value$iv$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L8;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L8:
        int count$iv$iv = 0;
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode().getChild$ui_release();
        if (child$iv$iv != null) goto L11;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode(), false);
    L12:
        int r14 = 1;
        if (branches$iv$iv.getSize() == 0) goto L15;
        int r9 = 1;
    L16:
        if (r9 == 0) goto L77;
        Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(branches$iv$iv.getSize() - 1);
        if ((branch$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L19;
        Modifier.Node node$iv$iv = branch$iv$iv;
    L21:
        if (node$iv$iv == null) goto L75;
        if ((node$iv$iv.getKindSet$ui_release() & type$iv) != 0) goto L24;
        node$iv$iv = node$iv$iv.getChild$ui_release();
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        goto L21
    L24:
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r18 = null;
        FocusTargetNode r19 = r1;
        Modifier.Node r2 = it$iv;
    L25:
        if (r2 == null) goto L73;
        if ((r2 instanceof FocusTargetNode) == true) goto L28;
        Modifier.Node this_$iv$iv$iv = r2;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L39;
        int r13 = r14;
    L40:
        if (r13 == 0) goto L71;
        if ((r2 instanceof DelegatingNode) == false) goto L71;
        int count$iv$iv2 = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r2;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L44:
        if (node$iv$iv$iv == null) goto L67;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L48;
        int r25 = r14;
    L49:
        if (r25 == 0) goto L65;
        count$iv$iv2 = count$iv$iv2 + 1;
        if (count$iv$iv2 != r14) goto L53;
        r2 = next$iv$iv;
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
    L66:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        r14 = 1;
        goto L44
    L53:
        if (r18 != null) goto L55;
        MutableVector r0 = new MutableVector(new Modifier.Node[16], 0);
    L56:
        Modifier.Node theNode$iv$iv = r2;
        if (theNode$iv$iv == null) goto L61;
        if (r0 == null) goto L60;
        r0.add(theNode$iv$iv);
    L60:
        r2 = null;
    L61:
        if (r0 == null) goto L64;
        r0.add(next$iv$iv);
    L64:
        r18 = r0;
        r2 = r2;
        goto L66
    L55:
        r0 = r18;
        goto L56
    L65:
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        goto L66
    L48:
        r25 = 0;
        goto L49
    L67:
        DelegatableNode $this$visitChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        Modifier.Node r29 = r2;
        int type$iv2 = type$iv;
        int type$iv3 = 0;
        int r3 = 1;
        if (count$iv$iv2 != 1) goto L72;
        r14 = 1;
        count$iv$iv = 0;
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv2;
        r2 = r29;
        type$iv = type$iv2;
    L72:
        r2 = DelegatableNodeKt.access$pop(r18);
        r14 = r3;
        count$iv$iv = type$iv3;
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
    L71:
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        r3 = r14;
        type$iv3 = 0;
        goto L72
    L39:
        r13 = 0;
        goto L40
    L28:
        FocusTargetNode it = (FocusTargetNode) r2;
        if (it.getNode().isAttached() == true) goto L31;
    L35:
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        r3 = r14;
        type$iv3 = 0;
        goto L72
    L31:
        switch(WhenMappings.$EnumSwitchMapping$1[it.getFocusState().ordinal()]) {
            case 1: goto L34;
            case 2: goto L34;
            case 3: goto L34;
            case 4: goto L35;
            default: goto L35;
        };
    L34:
        return it;
    L73:
        r1 = r19;
        type$iv = type$iv;
        goto L12
    L75:
        type$iv = type$iv;
        goto L12
    L19:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, branch$iv$iv, false);
        goto L12
    L77:
        return r1;
    L15:
        r9 = count$iv$iv;
        goto L16
    L11:
        branches$iv$iv.add(child$iv$iv);
        goto L12
    }

    public static final FocusTargetNode findActiveFocusNode(FocusTargetNode $this$findActiveFocusNode) {
        FocusTargetNode r1 = null;
        if (ComposeUiFlags.isTrackFocusEnabled == false) goto L11;
        FocusTargetNode activeNode = DelegatableNodeKt.requireOwner($this$findActiveFocusNode).getFocusOwner().getActiveFocusTargetNode();
        if (activeNode != null) goto L7;
        return null;
    L7:
        if (activeNode.isAttached() == true) goto L9;
        return null;
    L9:
        return activeNode;
    L11:
        switch(WhenMappings.$EnumSwitchMapping$1[$this$findActiveFocusNode.getFocusState().ordinal()]) {
            case 1: goto L85;
            case 2: goto L15;
            case 3: goto L85;
            case 4: goto L14;
            default: goto L13;
        };
    L14:
        return null;
    L15:
        FocusTargetNode $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$findActiveFocusNode;
        int type$iv = NodeKind.m5976constructorimpl(1024);
        boolean value$iv$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L18;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L18:
        int count$iv$iv = 0;
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode().getChild$ui_release();
        if (child$iv$iv != null) goto L21;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode(), false);
    L22:
        int r14 = 1;
        if (branches$iv$iv.getSize() == 0) goto L25;
        int r9 = 1;
    L26:
        if (r9 == 0) goto L84;
        Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(branches$iv$iv.getSize() - 1);
        if ((branch$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L29;
        Modifier.Node node$iv$iv = branch$iv$iv;
    L31:
        if (node$iv$iv == null) goto L82;
        if ((node$iv$iv.getKindSet$ui_release() & type$iv) != 0) goto L34;
        node$iv$iv = node$iv$iv.getChild$ui_release();
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        goto L31
    L34:
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r18 = null;
        FocusTargetNode r19 = r1;
        Modifier.Node r2 = it$iv;
    L35:
        if (r2 == null) goto L80;
        if ((r2 instanceof FocusTargetNode) == true) goto L38;
        Modifier.Node this_$iv$iv$iv = r2;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L46;
        int r13 = r14;
    L47:
        if (r13 == 0) goto L78;
        if ((r2 instanceof DelegatingNode) == false) goto L78;
        int count$iv$iv2 = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r2;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L51:
        if (node$iv$iv$iv == null) goto L74;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L55;
        int r25 = r14;
    L56:
        if (r25 == 0) goto L72;
        count$iv$iv2 = count$iv$iv2 + 1;
        if (count$iv$iv2 != r14) goto L60;
        r2 = next$iv$iv;
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
    L73:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        r14 = 1;
        goto L51
    L60:
        if (r18 != null) goto L62;
        MutableVector r0 = new MutableVector(new Modifier.Node[16], 0);
    L63:
        Modifier.Node theNode$iv$iv = r2;
        if (theNode$iv$iv == null) goto L68;
        if (r0 == null) goto L67;
        r0.add(theNode$iv$iv);
    L67:
        r2 = null;
    L68:
        if (r0 == null) goto L71;
        r0.add(next$iv$iv);
    L71:
        r18 = r0;
        r2 = r2;
        goto L73
    L62:
        r0 = r18;
        goto L63
    L72:
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        goto L73
    L55:
        r25 = 0;
        goto L56
    L74:
        DelegatableNode $this$visitChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        Modifier.Node r29 = r2;
        int type$iv2 = type$iv;
        int type$iv3 = 0;
        int r3 = 1;
        if (count$iv$iv2 != 1) goto L79;
        r14 = 1;
        count$iv$iv = 0;
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv2;
        r2 = r29;
        type$iv = type$iv2;
    L79:
        r2 = DelegatableNodeKt.access$pop(r18);
        r14 = r3;
        count$iv$iv = type$iv3;
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv2;
    L78:
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        r3 = r14;
        type$iv3 = 0;
        goto L79
    L46:
        r13 = 0;
        goto L47
    L38:
        FocusTargetNode node = (FocusTargetNode) r2;
        FocusTargetNode it = findActiveFocusNode(node);
        if (it != null) goto L41;
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        r3 = r14;
        type$iv3 = 0;
        goto L79
    L41:
        return it;
    L80:
        r1 = r19;
        type$iv = type$iv;
        goto L22
    L82:
        type$iv = type$iv;
        goto L22
    L29:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, branch$iv$iv, false);
        goto L22
    L84:
        return r1;
    L25:
        r9 = count$iv$iv;
        goto L26
    L21:
        branches$iv$iv.add(child$iv$iv);
        goto L22
    L85:
        return $this$findActiveFocusNode;
    L13:
        throw new NoWhenBranchMatchedException();
    }

    private static final FocusTargetNode findNonDeactivatedParent(FocusTargetNode $this$findNonDeactivatedParent) {
        FocusTargetNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$findNonDeactivatedParent;
        int type$iv = NodeKind.m5976constructorimpl(1024);
        boolean includeSelf$iv = false;
        int r3 = 0;
        boolean value$iv$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L5:
        Modifier.Node node$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv.getNode().getParent$ui_release();
        LayoutNode layout$iv$iv = DelegatableNodeKt.requireLayoutNode($this$visitAncestors_u2dY_u2dYKmho_u24default$iv);
    L6:
        if (layout$iv$iv == null) goto L68;
        Modifier.Node head$iv$iv = layout$iv$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L60;
    L9:
        if (node$iv$iv == null) goto L59;
        if ((node$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L57;
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r15 = null;
        Modifier.Node r9 = it$iv;
    L13:
        if (r9 == null) goto L56;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        if ((r9 instanceof FocusTargetNode) == true) goto L16;
        Modifier.Node this_$iv$iv$iv = r9;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L23;
        int r18 = 1;
    L24:
        if (r18 == 0) goto L54;
        if ((r9 instanceof DelegatingNode) == false) goto L54;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r9;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L28:
        if (node$iv$iv$iv == null) goto L51;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L32;
        boolean r24 = true;
    L33:
        if (r24 == false) goto L49;
        count$iv$iv = count$iv$iv + 1;
        int type$iv2 = type$iv;
        if (count$iv$iv != 1) goto L37;
        r9 = next$iv$iv;
        includeSelf$iv = includeSelf$iv;
        r3 = r3;
    L50:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        type$iv = type$iv2;
        includeSelf$iv = includeSelf$iv;
        r3 = r3;
        goto L28
    L37:
        if (r15 != null) goto L39;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L40:
        r15 = r1;
        Modifier.Node theNode$iv$iv = r9;
        if (theNode$iv$iv == null) goto L45;
        if (r15 == null) goto L44;
        r15.add(theNode$iv$iv);
    L44:
        r9 = null;
    L45:
        if (r15 == null) goto L48;
        r15.add(next$iv$iv);
    L48:
        count$iv$iv = count$iv$iv;
        goto L50
    L39:
        r1 = r15;
        goto L40
    L49:
        type$iv2 = type$iv;
        includeSelf$iv = includeSelf$iv;
        r3 = r3;
        goto L50
    L32:
        r24 = false;
        goto L33
    L51:
        int type$iv3 = type$iv;
        boolean includeSelf$iv2 = includeSelf$iv;
        int r29 = r3;
        if (count$iv$iv != 1) goto L55;
        type$iv = type$iv3;
        includeSelf$iv = includeSelf$iv2;
        r3 = r29;
    L55:
        r9 = DelegatableNodeKt.access$pop(r15);
        type$iv = type$iv3;
        includeSelf$iv = includeSelf$iv2;
        r3 = r29;
    L54:
        type$iv3 = type$iv;
        includeSelf$iv2 = includeSelf$iv;
        r29 = r3;
        goto L55
    L23:
        r18 = 0;
        goto L24
    L16:
        FocusTargetNode it = (FocusTargetNode) r9;
        if (it.fetchFocusProperties$ui_release().getCanFocus() == true) goto L18;
        type$iv3 = type$iv;
        includeSelf$iv2 = includeSelf$iv;
        r29 = r3;
        goto L55
    L18:
        return it;
    L56:
        DelegatableNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        int type$iv4 = type$iv;
        boolean includeSelf$iv3 = includeSelf$iv;
        int r210 = r3;
    L58:
        node$iv$iv = node$iv$iv.getParent$ui_release();
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv4;
        includeSelf$iv = includeSelf$iv3;
        r3 = r210;
        goto L9
    L57:
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        type$iv4 = type$iv;
        includeSelf$iv3 = includeSelf$iv;
        r210 = r3;
        goto L58
    L59:
        DelegatableNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv3 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        int type$iv5 = type$iv;
        boolean includeSelf$iv4 = includeSelf$iv;
        int r211 = r3;
        Modifier.Node r16 = null;
    L61:
        layout$iv$iv = layout$iv$iv.getParent$ui_release();
        if (layout$iv$iv == null) goto L66;
        NodeChain r0 = layout$iv$iv.getNodes$ui_release();
        if (r0 == null) goto L66;
        Modifier.Node r10 = r0.getTail$ui_release();
    L67:
        node$iv$iv = r10;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv3;
        type$iv = type$iv5;
        includeSelf$iv = includeSelf$iv4;
        r3 = r211;
    L66:
        r10 = r16;
        goto L67
    L60:
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv3 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        type$iv5 = type$iv;
        includeSelf$iv4 = includeSelf$iv;
        r211 = r3;
        r16 = null;
        goto L61
    L68:
        return null;
    }
}
