package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TwoDimensionalFocusSearch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a2\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a2\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\f\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0013H\u0002\u001a\f\u0010\u0014\u001a\u00020\u0006*\u00020\u0006H\u0002\u001a\u001a\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0019H\u0002\u001a.\u0010\u001a\u001a\u0004\u0018\u00010\u0013*\b\u0012\u0004\u0012\u00020\u00130\u00192\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a2\u0010\u001e\u001a\u00020\u0004*\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040 H\u0000ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a:\u0010#\u001a\u00020\u0004*\u00020\u00132\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040 H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a:\u0010'\u001a\u00020\u0004*\u00020\u00132\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040 H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010&\u001a\f\u0010)\u001a\u00020\u0006*\u00020\u0006H\u0002\u001a>\u0010*\u001a\u0004\u0018\u00010\u0004*\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040 H\u0000ø\u0001\u0000¢\u0006\u0004\b,\u0010-\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"InvalidFocusDirection", "", "NoActiveChild", "beamBeats", "", "source", "Landroidx/compose/ui/geometry/Rect;", "rect1", "rect2", "direction", "Landroidx/compose/ui/focus/FocusDirection;", "beamBeats-I7lrPNg", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;I)Z", "isBetterCandidate", "proposedCandidate", "currentCandidate", "focusedRect", "isBetterCandidate-I7lrPNg", "activeNode", "Landroidx/compose/ui/focus/FocusTargetNode;", "bottomRight", "collectAccessibleChildren", "", "Landroidx/compose/ui/node/DelegatableNode;", "accessibleChildren", "Landroidx/compose/runtime/collection/MutableVector;", "findBestCandidate", "focusRect", "findBestCandidate-4WY_MpI", "(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/geometry/Rect;I)Landroidx/compose/ui/focus/FocusTargetNode;", "findChildCorrespondingToFocusEnter", "onFound", "Lkotlin/Function1;", "findChildCorrespondingToFocusEnter--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "generateAndSearchChildren", "focusedItem", "generateAndSearchChildren-4C6V_qg", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/geometry/Rect;ILkotlin/jvm/functions/Function1;)Z", "searchChildren", "searchChildren-4C6V_qg", "topLeft", "twoDimensionalFocusSearch", "previouslyFocusedRect", "twoDimensionalFocusSearch-sMXa3k8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TwoDimensionalFocusSearchKt {
    private static final String InvalidFocusDirection = "This function should only be used for 2-D focus search";
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    /* JADX INFO: compiled from: TwoDimensionalFocusSearch.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[FocusStateImpl.values().length];
            r0[FocusStateImpl.ActiveParent.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L17:
            r0[FocusStateImpl.Active.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L19:
            r0[FocusStateImpl.Captured.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L23:
            r0[FocusStateImpl.Inactive.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L15:
            $EnumSwitchMapping$0 = r0;
        }
    }

    /* JADX INFO: renamed from: access$searchChildren-4C6V_qg, reason: not valid java name */
    public static final /* synthetic */ boolean m4068access$searchChildren4C6V_qg(FocusTargetNode $receiver, Rect focusedItem, int direction, Function1 onFound) {
        return m4074searchChildren4C6V_qg($receiver, focusedItem, direction, onFound);
    }

    /* JADX INFO: renamed from: twoDimensionalFocusSearch-sMXa3k8, reason: not valid java name */
    public static final Boolean m4075twoDimensionalFocusSearchsMXa3k8(FocusTargetNode $this$twoDimensionalFocusSearch_u2dsMXa3k8, int direction, Rect previouslyFocusedRect, Function1<? super FocusTargetNode, Boolean> r7) {
        FocusStateImpl r0 = $this$twoDimensionalFocusSearch_u2dsMXa3k8.getFocusState();
        switch(WhenMappings.$EnumSwitchMapping$0[r0.ordinal()]) {
            case 1: goto L15;
            case 2: goto L14;
            case 3: goto L14;
            case 4: goto L7;
            default: goto L5;
        };
    L15:
        FocusTargetNode focusedChild = FocusTraversalKt.getActiveChild($this$twoDimensionalFocusSearch_u2dsMXa3k8);
        if (focusedChild == null) goto L39;
        FocusStateImpl r2 = focusedChild.getFocusState();
        switch(WhenMappings.$EnumSwitchMapping$0[r2.ordinal()]) {
            case 1: goto L29;
            case 2: goto L24;
            case 3: goto L24;
            case 4: goto L22;
            default: goto L20;
        };
    L29:
        Boolean found = m4075twoDimensionalFocusSearchsMXa3k8(focusedChild, direction, previouslyFocusedRect, r7);
        if (Intrinsics.areEqual(found, false) == true) goto L33;
        return found;
    L33:
        if (previouslyFocusedRect != null) goto L35;
        Rect r3 = FocusTraversalKt.focusRect(activeNode(focusedChild));
    L37:
        return Boolean.valueOf(m4072generateAndSearchChildren4C6V_qg($this$twoDimensionalFocusSearch_u2dsMXa3k8, r3, direction, r7));
    L35:
        r3 = previouslyFocusedRect;
        goto L37
    L24:
        if (previouslyFocusedRect != null) goto L26;
        Rect r1 = FocusTraversalKt.focusRect(focusedChild);
    L28:
        return Boolean.valueOf(m4072generateAndSearchChildren4C6V_qg($this$twoDimensionalFocusSearch_u2dsMXa3k8, r1, direction, r7));
    L26:
        r1 = previouslyFocusedRect;
        goto L28
    L20:
        throw new NoWhenBranchMatchedException();
    L22:
        throw new IllegalStateException(NoActiveChild.toString());
    L39:
        throw new IllegalStateException(NoActiveChild.toString());
    L5:
        throw new NoWhenBranchMatchedException();
    L7:
        if ($this$twoDimensionalFocusSearch_u2dsMXa3k8.fetchFocusProperties$ui_release().getCanFocus() == true) goto L40;
        if (previouslyFocusedRect != null) goto L12;
        return Boolean.valueOf(m4071findChildCorrespondingToFocusEnterOMvw8($this$twoDimensionalFocusSearch_u2dsMXa3k8, direction, r7));
    L12:
        return Boolean.valueOf(m4074searchChildren4C6V_qg($this$twoDimensionalFocusSearch_u2dsMXa3k8, previouslyFocusedRect, direction, r7));
    L40:
        return r7.invoke($this$twoDimensionalFocusSearch_u2dsMXa3k8);
    L14:
        return Boolean.valueOf(m4071findChildCorrespondingToFocusEnterOMvw8($this$twoDimensionalFocusSearch_u2dsMXa3k8, direction, r7));
    }

    /* JADX INFO: renamed from: findChildCorrespondingToFocusEnter--OM-vw8, reason: not valid java name */
    public static final boolean m4071findChildCorrespondingToFocusEnterOMvw8(FocusTargetNode $this$findChildCorrespondingToFocusEnter_u2d_u2dOM_u2dvw8, int direction, Function1<? super FocusTargetNode, Boolean> r10) {
        MutableVector focusableChildren = new MutableVector(new FocusTargetNode[16], 0);
        collectAccessibleChildren($this$findChildCorrespondingToFocusEnter_u2d_u2dOM_u2dvw8, focusableChildren);
        boolean r1 = true;
        if (focusableChildren.getSize() > 1) goto L16;
        if (focusableChildren.getSize() == 0) goto L8;
        r1 = false;
    L8:
        if (r1 == false) goto L10;
        Object r2 = null;
    L11:
        FocusTargetNode it = (FocusTargetNode) r2;
        if (it != null) goto L14;
        return false;
    L14:
        return r10.invoke(it).booleanValue();
    L10:
        r2 = focusableChildren.content[0];
        goto L11
    L16:
        if (FocusDirection.m4009equalsimpl0(direction, FocusDirection.Companion.m4014getEnterdhqQ8s()) == false) goto L18;
        int requestedDirection = FocusDirection.Companion.m4019getRightdhqQ8s();
    L20:
        if (FocusDirection.m4009equalsimpl0(requestedDirection, FocusDirection.Companion.m4019getRightdhqQ8s()) == false) goto L22;
        boolean r3 = true;
    L23:
        if (r3 == false) goto L26;
        Rect initialFocusRect = topLeft(FocusTraversalKt.focusRect($this$findChildCorrespondingToFocusEnter_u2d_u2dOM_u2dvw8));
    L31:
        FocusTargetNode nextCandidate = m4070findBestCandidate4WY_MpI(focusableChildren, initialFocusRect, requestedDirection);
        if (nextCandidate != null) goto L34;
        return false;
    L34:
        return r10.invoke(nextCandidate).booleanValue();
    L26:
        if (FocusDirection.m4009equalsimpl0(requestedDirection, FocusDirection.Companion.m4016getLeftdhqQ8s()) == true) goto L29;
        r1 = FocusDirection.m4009equalsimpl0(requestedDirection, FocusDirection.Companion.m4020getUpdhqQ8s());
    L29:
        if (r1 == false) goto L36;
        initialFocusRect = bottomRight(FocusTraversalKt.focusRect($this$findChildCorrespondingToFocusEnter_u2d_u2dOM_u2dvw8));
        goto L31
    L36:
        throw new IllegalStateException(InvalidFocusDirection.toString());
    L22:
        r3 = FocusDirection.m4009equalsimpl0(requestedDirection, FocusDirection.Companion.m4013getDowndhqQ8s());
        goto L23
    L18:
        requestedDirection = direction;
        goto L20
    }

    /* JADX INFO: renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m4072generateAndSearchChildren4C6V_qg(final FocusTargetNode $this$generateAndSearchChildren_u2d4C6V_qg, final Rect focusedItem, final int direction, final Function1<? super FocusTargetNode, Boolean> r12) {
        if (m4074searchChildren4C6V_qg($this$generateAndSearchChildren_u2d4C6V_qg, focusedItem, direction, r12) == false) goto L6;
        return true;
    L6:
        final FocusTransactionManager focusTransactionManager = FocusTargetNodeKt.requireTransactionManager($this$generateAndSearchChildren_u2d4C6V_qg);
        final int generationBeforeSearch = focusTransactionManager.getGeneration();
        final FocusTargetNode activeNodeBeforeSearch = DelegatableNodeKt.requireOwner($this$generateAndSearchChildren_u2d4C6V_qg).getFocusOwner().getActiveFocusTargetNode();
        Boolean r9 = (Boolean) BeyondBoundsLayoutKt.m4004searchBeyondBoundsOMvw8($this$generateAndSearchChildren_u2d4C6V_qg, direction, new TwoDimensionalFocusSearchKt$generateAndSearchChildren$1(generationBeforeSearch, focusTransactionManager, activeNodeBeforeSearch, $this$generateAndSearchChildren_u2d4C6V_qg, focusedItem, direction, r12));
        if (r9 != null) goto L11;
        return false;
    L11:
        return r9.booleanValue();
    }

    /* JADX INFO: renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m4074searchChildren4C6V_qg(FocusTargetNode $this$searchChildren_u2d4C6V_qg, Rect focusedItem, int direction, Function1<? super FocusTargetNode, Boolean> r40) {
        MutableVector children = new MutableVector(new FocusTargetNode[16], 0);
        MutableVector $this$searchChildren_4C6V_qg_u24lambda_u243 = children;
        FocusTargetNode $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$searchChildren_u2d4C6V_qg;
        int r8 = NodeKind.m5976constructorimpl(1024);
        boolean value$iv$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L5:
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode().getChild$ui_release();
        if (child$iv$iv != null) goto L8;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode(), false);
    L9:
        MutableVector this_$iv$iv$iv = branches$iv$iv;
        if (this_$iv$iv$iv.getSize() == 0) goto L12;
        boolean r14 = true;
    L13:
        if (r14 == false) goto L70;
        MutableVector this_$iv$iv$iv2 = branches$iv$iv;
        Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(this_$iv$iv$iv2.getSize() - 1);
        if ((branch$iv$iv.getAggregateChildKindSet$ui_release() & r8) == 0) goto L16;
        Modifier.Node node$iv$iv = branch$iv$iv;
    L18:
        if (node$iv$iv == null) goto L9;
        if ((node$iv$iv.getKindSet$ui_release() & r8) != 0) goto L21;
        node$iv$iv = node$iv$iv.getChild$ui_release();
        goto L18
    L21:
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r23 = null;
        Modifier.Node r7 = it$iv;
    L22:
        if (r7 == null) goto L9;
        branches$iv$iv = branches$iv$iv;
        if ((r7 instanceof FocusTargetNode) == true) goto L25;
        Modifier.Node this_$iv$iv$iv3 = r7;
        if ((this_$iv$iv$iv3.getKindSet$ui_release() & r8) == 0) goto L32;
        boolean r4 = true;
    L33:
        if (r4 == false) goto L63;
        if ((r7 instanceof DelegatingNode) == false) goto L63;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv4 = (DelegatingNode) r7;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv4.getDelegate$ui_release();
    L37:
        if (node$iv$iv$iv == null) goto L60;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & r8) == 0) goto L41;
        boolean r31 = true;
    L42:
        if (r31 == false) goto L58;
        count$iv$iv = count$iv$iv + 1;
        MutableVector $this$searchChildren_4C6V_qg_u24lambda_u244 = $this$searchChildren_4C6V_qg_u24lambda_u243;
        if (count$iv$iv != 1) goto L46;
        r7 = next$iv$iv;
        child$iv$iv = child$iv$iv;
    L59:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        $this$searchChildren_4C6V_qg_u24lambda_u243 = $this$searchChildren_4C6V_qg_u24lambda_u244;
        child$iv$iv = child$iv$iv;
        goto L37
    L46:
        if (r23 != null) goto L48;
        MutableVector r5 = new MutableVector(new Modifier.Node[16], 0);
    L49:
        Modifier.Node theNode$iv$iv = r7;
        if (theNode$iv$iv == null) goto L54;
        if (r5 == null) goto L53;
        r5.add(theNode$iv$iv);
    L53:
        r7 = null;
    L54:
        if (r5 == null) goto L57;
        r5.add(next$iv$iv);
    L57:
        r23 = r5;
        count$iv$iv = count$iv$iv;
        goto L59
    L48:
        r5 = r23;
        goto L49
    L58:
        $this$searchChildren_4C6V_qg_u24lambda_u244 = $this$searchChildren_4C6V_qg_u24lambda_u243;
        child$iv$iv = child$iv$iv;
        goto L59
    L41:
        r31 = false;
        goto L42
    L60:
        MutableVector $this$searchChildren_4C6V_qg_u24lambda_u245 = $this$searchChildren_4C6V_qg_u24lambda_u243;
        Modifier.Node child$iv$iv2 = child$iv$iv;
        if (count$iv$iv != 1) goto L64;
        $this$searchChildren_4C6V_qg_u24lambda_u243 = $this$searchChildren_4C6V_qg_u24lambda_u245;
        child$iv$iv = child$iv$iv2;
    L64:
        r7 = DelegatableNodeKt.access$pop(r23);
        $this$searchChildren_4C6V_qg_u24lambda_u243 = $this$searchChildren_4C6V_qg_u24lambda_u245;
        child$iv$iv = child$iv$iv2;
    L63:
        $this$searchChildren_4C6V_qg_u24lambda_u245 = $this$searchChildren_4C6V_qg_u24lambda_u243;
        child$iv$iv2 = child$iv$iv;
        goto L64
    L32:
        r4 = false;
        goto L33
    L25:
        FocusTargetNode it = (FocusTargetNode) r7;
        if (it.isAttached() == false) goto L28;
        $this$searchChildren_4C6V_qg_u24lambda_u243.add(it);
    L28:
        $this$searchChildren_4C6V_qg_u24lambda_u245 = $this$searchChildren_4C6V_qg_u24lambda_u243;
        child$iv$iv2 = child$iv$iv;
        goto L64
    L16:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, branch$iv$iv, false);
    L70:
        if (children.getSize() == 0) goto L72;
        boolean r6 = true;
    L73:
        if (r6 == false) goto L87;
        FocusTargetNode nextItem = m4070findBestCandidate4WY_MpI(children, focusedItem, direction);
        if (nextItem == null) goto L76;
        if (nextItem.fetchFocusProperties$ui_release().getCanFocus() == true) goto L81;
        if (m4072generateAndSearchChildren4C6V_qg(nextItem, focusedItem, direction, r40) == true) goto L84;
        children.remove(nextItem);
        goto L70
    L84:
        return true;
    L81:
        return r40.invoke(nextItem).booleanValue();
    L76:
        return false;
    L87:
        return false;
    L72:
        r6 = false;
        goto L73
    L12:
        r14 = false;
        goto L13
    L8:
        branches$iv$iv.add(child$iv$iv);
        goto L9
    }

    private static final void collectAccessibleChildren(DelegatableNode $this$collectAccessibleChildren, MutableVector<FocusTargetNode> r31) {
        r31 = r31;
        int count$iv$iv = NodeKind.m5976constructorimpl(1024);
        DelegatableNode $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$collectAccessibleChildren;
        boolean value$iv$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L5:
        boolean r13 = false;
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode().getChild$ui_release();
        if (child$iv$iv != null) goto L8;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode(), false);
    L10:
        if (branches$iv$iv.getSize() == 0) goto L12;
        boolean r9 = true;
    L13:
        if (r9 == false) goto L77;
        Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(branches$iv$iv.getSize() - 1);
        if ((branch$iv$iv.getAggregateChildKindSet$ui_release() & count$iv$iv) == 0) goto L16;
        Modifier.Node node$iv$iv = branch$iv$iv;
    L18:
        if (node$iv$iv == null) goto L75;
        if ((node$iv$iv.getKindSet$ui_release() & count$iv$iv) != 0) goto L21;
        node$iv$iv = node$iv$iv.getChild$ui_release();
        r31 = r31;
        goto L18
    L21:
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r18 = null;
        Modifier.Node r14 = it$iv;
    L22:
        if (r14 == null) goto L73;
        if ((r14 instanceof FocusTargetNode) == true) goto L25;
        count$iv$iv = count$iv$iv;
        Modifier.Node this_$iv$iv$iv = r14;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & count$iv$iv) == 0) goto L40;
        boolean r1 = true;
    L41:
        if (r1 == false) goto L71;
        if ((r14 instanceof DelegatingNode) == false) goto L71;
        int count$iv$iv2 = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r14;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L45:
        if (node$iv$iv$iv == null) goto L68;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & count$iv$iv) == 0) goto L49;
        boolean r25 = true;
    L50:
        if (r25 == false) goto L66;
        count$iv$iv2 = count$iv$iv2 + 1;
        if (count$iv$iv2 != 1) goto L54;
        r14 = next$iv$iv;
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
    L67:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        goto L45
    L54:
        if (r18 != null) goto L56;
        MutableVector r2 = new MutableVector(new Modifier.Node[16], 0);
    L57:
        Modifier.Node theNode$iv$iv = r14;
        if (theNode$iv$iv == null) goto L62;
        if (r2 == null) goto L61;
        r2.add(theNode$iv$iv);
    L61:
        r14 = null;
    L62:
        if (r2 == null) goto L65;
        r2.add(next$iv$iv);
    L65:
        r18 = r2;
        count$iv$iv2 = count$iv$iv2;
        goto L67
    L56:
        r2 = r18;
        goto L57
    L66:
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        goto L67
    L49:
        r25 = false;
        goto L50
    L68:
        DelegatableNode $this$visitChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        boolean r0 = true;
        if (count$iv$iv2 != 1) goto L72;
        count$iv$iv = count$iv$iv;
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv2;
    L72:
        r14 = DelegatableNodeKt.access$pop(r18);
        count$iv$iv = count$iv$iv;
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv2;
    L71:
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        r0 = true;
        goto L72
    L40:
        r1 = false;
        goto L41
    L25:
        FocusTargetNode it = (FocusTargetNode) r14;
        if (it.isAttached() == false) goto L36;
        if (DelegatableNodeKt.requireLayoutNode(it).isDeactivated() == true) goto L36;
        if (it.fetchFocusProperties$ui_release().getCanFocus() == false) goto L33;
        r31.add(it);
        goto L36
    L33:
        collectAccessibleChildren(it, r31);
    L36:
        $this$visitChildren_u2dY_u2dYKmho_u24default$iv2 = $this$visitChildren_u2dY_u2dYKmho_u24default$iv;
        r0 = true;
        goto L72
    L73:
        r31 = r31;
        r13 = false;
        goto L10
    L75:
        r31 = r31;
        r13 = false;
        goto L10
    L16:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, branch$iv$iv, false);
        goto L10
    L77:
        return;
    L12:
        r9 = r13;
        goto L13
    L8:
        branches$iv$iv.add(child$iv$iv);
        goto L10
    }

    /* JADX INFO: renamed from: findBestCandidate-4WY_MpI, reason: not valid java name */
    private static final FocusTargetNode m4070findBestCandidate4WY_MpI(MutableVector<FocusTargetNode> r11, Rect focusRect, int direction) {
        if (FocusDirection.m4009equalsimpl0(direction, FocusDirection.Companion.m4016getLeftdhqQ8s()) == false) goto L6;
        Rect r1 = focusRect.translate((focusRect.getRight() - focusRect.getLeft()) + 1.0f, 0.0f);
    L14:
        FocusTargetNode r0 = null;
        int i$iv = 0;
        Object[] content$iv = r11.content;
        int size$iv = r11.getSize();
    L15:
        if (i$iv >= size$iv) goto L23;
        FocusTargetNode candidateNode = (FocusTargetNode) content$iv[i$iv];
        if (FocusTraversalKt.isEligibleForFocusSearch(candidateNode) == false) goto L21;
        Rect candidateRect = FocusTraversalKt.focusRect(candidateNode);
        if (m4073isBetterCandidateI7lrPNg(candidateRect, r1, focusRect, direction) == false) goto L21;
        r1 = candidateRect;
        r0 = candidateNode;
    L21:
        i$iv = i$iv + 1;
        goto L15
    L23:
        return r0;
    L6:
        if (FocusDirection.m4009equalsimpl0(direction, FocusDirection.Companion.m4019getRightdhqQ8s()) == false) goto L9;
        r1 = focusRect.translate(-((focusRect.getRight() - focusRect.getLeft()) + 1.0f), 0.0f);
        goto L14
    L9:
        if (FocusDirection.m4009equalsimpl0(direction, FocusDirection.Companion.m4020getUpdhqQ8s()) == false) goto L12;
        r1 = focusRect.translate(0.0f, (focusRect.getBottom() - focusRect.getTop()) + 1.0f);
        goto L14
    L12:
        if (FocusDirection.m4009equalsimpl0(direction, FocusDirection.Companion.m4013getDowndhqQ8s()) == false) goto L25;
        r1 = focusRect.translate(0.0f, -((focusRect.getBottom() - focusRect.getTop()) + 1.0f));
        goto L14
    L25:
        throw new IllegalStateException(InvalidFocusDirection.toString());
    }

    private static final boolean isBetterCandidate_I7lrPNg$isCandidate(Rect $this$isBetterCandidate_I7lrPNg_u24isCandidate, int $direction, Rect $focusedRect) {
        if (FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4016getLeftdhqQ8s()) == false) goto L13;
        if ($focusedRect.getRight() > $this$isBetterCandidate_I7lrPNg_u24isCandidate.getRight()) goto L9;
        if ($focusedRect.getLeft() >= $this$isBetterCandidate_I7lrPNg_u24isCandidate.getRight()) goto L9;
    L45:
        return false;
    L9:
        if ($focusedRect.getLeft() <= $this$isBetterCandidate_I7lrPNg_u24isCandidate.getLeft()) goto L45;
        return true;
    L13:
        if (FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4019getRightdhqQ8s()) == false) goto L23;
        if ($focusedRect.getLeft() < $this$isBetterCandidate_I7lrPNg_u24isCandidate.getLeft()) goto L19;
        if ($focusedRect.getRight() <= $this$isBetterCandidate_I7lrPNg_u24isCandidate.getLeft()) goto L19;
    L46:
        return false;
    L19:
        if ($focusedRect.getRight() >= $this$isBetterCandidate_I7lrPNg_u24isCandidate.getRight()) goto L46;
        return true;
    L23:
        if (FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4020getUpdhqQ8s()) == false) goto L33;
        if ($focusedRect.getBottom() > $this$isBetterCandidate_I7lrPNg_u24isCandidate.getBottom()) goto L29;
        if ($focusedRect.getTop() >= $this$isBetterCandidate_I7lrPNg_u24isCandidate.getBottom()) goto L29;
    L47:
        return false;
    L29:
        if ($focusedRect.getTop() <= $this$isBetterCandidate_I7lrPNg_u24isCandidate.getTop()) goto L47;
        return true;
    L33:
        if (FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4013getDowndhqQ8s()) == false) goto L44;
        if ($focusedRect.getTop() < $this$isBetterCandidate_I7lrPNg_u24isCandidate.getTop()) goto L39;
        if ($focusedRect.getBottom() <= $this$isBetterCandidate_I7lrPNg_u24isCandidate.getTop()) goto L39;
    L42:
        return false;
    L39:
        if ($focusedRect.getBottom() >= $this$isBetterCandidate_I7lrPNg_u24isCandidate.getBottom()) goto L42;
        return true;
    L44:
        throw new IllegalStateException(InvalidFocusDirection.toString());
    }

    private static final float isBetterCandidate_I7lrPNg$majorAxisDistance(Rect $this$isBetterCandidate_I7lrPNg_u24majorAxisDistance, int $direction, Rect $focusedRect) {
        if (FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4016getLeftdhqQ8s()) == false) goto L6;
        float majorAxisDistance = $focusedRect.getLeft() - $this$isBetterCandidate_I7lrPNg_u24majorAxisDistance.getRight();
    L14:
        float $this$fastCoerceAtLeast$iv = majorAxisDistance;
        if ($this$fastCoerceAtLeast$iv < 0.0f) goto L17;
        return $this$fastCoerceAtLeast$iv;
    L17:
        return 0.0f;
    L6:
        if (FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4019getRightdhqQ8s()) == false) goto L9;
        majorAxisDistance = $this$isBetterCandidate_I7lrPNg_u24majorAxisDistance.getLeft() - $focusedRect.getRight();
        goto L14
    L9:
        if (FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4020getUpdhqQ8s()) == false) goto L12;
        majorAxisDistance = $focusedRect.getTop() - $this$isBetterCandidate_I7lrPNg_u24majorAxisDistance.getBottom();
        goto L14
    L12:
        if (FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4013getDowndhqQ8s()) == false) goto L19;
        majorAxisDistance = $this$isBetterCandidate_I7lrPNg_u24majorAxisDistance.getTop() - $focusedRect.getBottom();
        goto L14
    L19:
        throw new IllegalStateException(InvalidFocusDirection.toString());
    }

    private static final float isBetterCandidate_I7lrPNg$minorAxisDistance(Rect $this$isBetterCandidate_I7lrPNg_u24minorAxisDistance, int $direction, Rect $focusedRect) {
        boolean r1 = true;
        if (FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4016getLeftdhqQ8s()) == false) goto L5;
        boolean r0 = true;
    L7:
        if (r0 == false) goto L10;
        return ($focusedRect.getTop() + (($focusedRect.getBottom() - $focusedRect.getTop()) / 2.0f)) - ($this$isBetterCandidate_I7lrPNg_u24minorAxisDistance.getTop() + (($this$isBetterCandidate_I7lrPNg_u24minorAxisDistance.getBottom() - $this$isBetterCandidate_I7lrPNg_u24minorAxisDistance.getTop()) / 2.0f));
    L10:
        if (FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4020getUpdhqQ8s()) == true) goto L13;
        r1 = FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4013getDowndhqQ8s());
    L13:
        if (r1 == false) goto L17;
        return ($focusedRect.getLeft() + (($focusedRect.getRight() - $focusedRect.getLeft()) / 2.0f)) - ($this$isBetterCandidate_I7lrPNg_u24minorAxisDistance.getLeft() + (($this$isBetterCandidate_I7lrPNg_u24minorAxisDistance.getRight() - $this$isBetterCandidate_I7lrPNg_u24minorAxisDistance.getLeft()) / 2.0f));
    L17:
        throw new IllegalStateException(InvalidFocusDirection.toString());
    L5:
        r0 = FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4019getRightdhqQ8s());
        goto L7
    }

    private static final long isBetterCandidate_I7lrPNg$weightedDistance(int $direction, Rect $focusedRect, Rect candidate) {
        long majorAxisDistance = (long) isBetterCandidate_I7lrPNg$majorAxisDistance(candidate, $direction, $focusedRect);
        long minorAxisDistance = (long) isBetterCandidate_I7lrPNg$minorAxisDistance(candidate, $direction, $focusedRect);
        return ((13 * majorAxisDistance) * majorAxisDistance) + (minorAxisDistance * minorAxisDistance);
    }

    /* JADX INFO: renamed from: isBetterCandidate-I7lrPNg, reason: not valid java name */
    public static final boolean m4073isBetterCandidateI7lrPNg(Rect proposedCandidate, Rect currentCandidate, Rect focusedRect, int direction) {
        if (isBetterCandidate_I7lrPNg$isCandidate(proposedCandidate, direction, focusedRect) == true) goto L6;
        return false;
    L6:
        if (isBetterCandidate_I7lrPNg$isCandidate(currentCandidate, direction, focusedRect) == true) goto L9;
        return true;
    L9:
        if (m4069beamBeatsI7lrPNg(focusedRect, proposedCandidate, currentCandidate, direction) == false) goto L12;
        return true;
    L12:
        if (m4069beamBeatsI7lrPNg(focusedRect, currentCandidate, proposedCandidate, direction) == false) goto L15;
        return false;
    L15:
        if (isBetterCandidate_I7lrPNg$weightedDistance(direction, focusedRect, proposedCandidate) < isBetterCandidate_I7lrPNg$weightedDistance(direction, focusedRect, currentCandidate)) goto L17;
        return false;
    L17:
        return true;
    }

    private static final boolean beamBeats_I7lrPNg$inSourceBeam(Rect $this$beamBeats_I7lrPNg_u24inSourceBeam, int $direction, Rect $source) {
        if (FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4016getLeftdhqQ8s()) == false) goto L5;
        boolean r0 = true;
    L7:
        if (r0 == false) goto L15;
        if ($this$beamBeats_I7lrPNg_u24inSourceBeam.getBottom() <= $source.getTop()) goto L28;
        if ($this$beamBeats_I7lrPNg_u24inSourceBeam.getTop() >= $source.getBottom()) goto L28;
        return true;
    L28:
        return false;
    L15:
        if (FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4020getUpdhqQ8s()) == false) goto L17;
        boolean r1 = true;
    L18:
        if (r1 == false) goto L27;
        if ($this$beamBeats_I7lrPNg_u24inSourceBeam.getRight() <= $source.getLeft()) goto L25;
        if ($this$beamBeats_I7lrPNg_u24inSourceBeam.getLeft() >= $source.getRight()) goto L25;
        return true;
    L25:
        return false;
    L27:
        throw new IllegalStateException(InvalidFocusDirection.toString());
    L17:
        r1 = FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4013getDowndhqQ8s());
        goto L18
    L5:
        r0 = FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4019getRightdhqQ8s());
        goto L7
    }

    private static final boolean beamBeats_I7lrPNg$isInDirectionOfSearch(Rect $this$beamBeats_I7lrPNg_u24isInDirectionOfSearch, int $direction, Rect $source) {
        if (FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4016getLeftdhqQ8s()) == false) goto L9;
        if ($source.getLeft() < $this$beamBeats_I7lrPNg_u24isInDirectionOfSearch.getRight()) goto L29;
        return true;
    L29:
        return false;
    L9:
        if (FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4019getRightdhqQ8s()) == false) goto L15;
        if ($source.getRight() > $this$beamBeats_I7lrPNg_u24isInDirectionOfSearch.getLeft()) goto L30;
        return true;
    L30:
        return false;
    L15:
        if (FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4020getUpdhqQ8s()) == false) goto L21;
        if ($source.getTop() < $this$beamBeats_I7lrPNg_u24isInDirectionOfSearch.getBottom()) goto L31;
        return true;
    L31:
        return false;
    L21:
        if (FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4013getDowndhqQ8s()) == false) goto L28;
        if ($source.getBottom() > $this$beamBeats_I7lrPNg_u24isInDirectionOfSearch.getTop()) goto L26;
        return true;
    L26:
        return false;
    L28:
        throw new IllegalStateException(InvalidFocusDirection.toString());
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistance$6(Rect $this$beamBeats_I7lrPNg_u24majorAxisDistance_u246, int $direction, Rect $source) {
        if (FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4016getLeftdhqQ8s()) == false) goto L6;
        float majorAxisDistance = $source.getLeft() - $this$beamBeats_I7lrPNg_u24majorAxisDistance_u246.getRight();
    L14:
        float $this$fastCoerceAtLeast$iv = majorAxisDistance;
        if ($this$fastCoerceAtLeast$iv < 0.0f) goto L17;
        return $this$fastCoerceAtLeast$iv;
    L17:
        return 0.0f;
    L6:
        if (FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4019getRightdhqQ8s()) == false) goto L9;
        majorAxisDistance = $this$beamBeats_I7lrPNg_u24majorAxisDistance_u246.getLeft() - $source.getRight();
        goto L14
    L9:
        if (FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4020getUpdhqQ8s()) == false) goto L12;
        majorAxisDistance = $source.getTop() - $this$beamBeats_I7lrPNg_u24majorAxisDistance_u246.getBottom();
        goto L14
    L12:
        if (FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4013getDowndhqQ8s()) == false) goto L19;
        majorAxisDistance = $this$beamBeats_I7lrPNg_u24majorAxisDistance_u246.getTop() - $source.getBottom();
        goto L14
    L19:
        throw new IllegalStateException(InvalidFocusDirection.toString());
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(Rect $this$beamBeats_I7lrPNg_u24majorAxisDistanceToFarEdge, int $direction, Rect $source) {
        if (FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4016getLeftdhqQ8s()) == false) goto L6;
        float majorAxisDistance = $source.getLeft() - $this$beamBeats_I7lrPNg_u24majorAxisDistanceToFarEdge.getLeft();
    L14:
        float $this$fastCoerceAtLeast$iv = majorAxisDistance;
        if ($this$fastCoerceAtLeast$iv < 1.0f) goto L17;
        return $this$fastCoerceAtLeast$iv;
    L17:
        return 1.0f;
    L6:
        if (FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4019getRightdhqQ8s()) == false) goto L9;
        majorAxisDistance = $this$beamBeats_I7lrPNg_u24majorAxisDistanceToFarEdge.getRight() - $source.getRight();
        goto L14
    L9:
        if (FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4020getUpdhqQ8s()) == false) goto L12;
        majorAxisDistance = $source.getTop() - $this$beamBeats_I7lrPNg_u24majorAxisDistanceToFarEdge.getTop();
        goto L14
    L12:
        if (FocusDirection.m4009equalsimpl0($direction, FocusDirection.Companion.m4013getDowndhqQ8s()) == false) goto L19;
        majorAxisDistance = $this$beamBeats_I7lrPNg_u24majorAxisDistanceToFarEdge.getBottom() - $source.getBottom();
        goto L14
    L19:
        throw new IllegalStateException(InvalidFocusDirection.toString());
    }

    /* JADX INFO: renamed from: beamBeats-I7lrPNg, reason: not valid java name */
    private static final boolean m4069beamBeatsI7lrPNg(Rect source, Rect rect1, Rect rect2, int direction) {
        if (beamBeats_I7lrPNg$inSourceBeam(rect2, direction, source) == false) goto L5;
        return false;
    L5:
        if (beamBeats_I7lrPNg$inSourceBeam(rect1, direction, source) == true) goto L8;
        return false;
    L8:
        if (beamBeats_I7lrPNg$isInDirectionOfSearch(rect2, direction, source) == true) goto L11;
        return true;
    L11:
        if (FocusDirection.m4009equalsimpl0(direction, FocusDirection.Companion.m4016getLeftdhqQ8s()) == true) goto L19;
        if (FocusDirection.m4009equalsimpl0(direction, FocusDirection.Companion.m4019getRightdhqQ8s()) == true) goto L19;
        if (beamBeats_I7lrPNg$majorAxisDistance$6(rect1, direction, source) < beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(rect2, direction, source)) goto L23;
        return false;
    L23:
        return true;
    L19:
        return true;
    }

    private static final Rect topLeft(Rect $this$topLeft) {
        return new Rect($this$topLeft.getLeft(), $this$topLeft.getTop(), $this$topLeft.getLeft(), $this$topLeft.getTop());
    }

    private static final Rect bottomRight(Rect $this$bottomRight) {
        return new Rect($this$bottomRight.getRight(), $this$bottomRight.getBottom(), $this$bottomRight.getRight(), $this$bottomRight.getBottom());
    }

    private static final FocusTargetNode activeNode(FocusTargetNode $this$activeNode) {
        if ($this$activeNode.getFocusState() != FocusStateImpl.ActiveParent) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L13;
        FocusTargetNode r1 = FocusTraversalKt.findActiveFocusNode($this$activeNode);
        if (r1 == null) goto L11;
        return r1;
    L11:
        throw new IllegalStateException(NoActiveChild.toString());
    L13:
        throw new IllegalStateException("Searching for active node in inactive hierarchy".toString());
    L5:
        r0 = false;
        goto L6
    }
}
