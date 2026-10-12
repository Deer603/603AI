package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: OneDimensionalFocusSearch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a \u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00070\nH\u0002\u001aE\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u000e2\u0006\u0010\u000f\u001a\u0002H\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\f0\nH\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010\u0011\u001aE\u0010\u0012\u001a\u00020\f\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u000e2\u0006\u0010\u000f\u001a\u0002H\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\f0\nH\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010\u0011\u001a \u0010\u0013\u001a\u00020\u0007*\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00070\nH\u0002\u001a:\u0010\u0014\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00070\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u0007*\u00020\bH\u0002\u001a2\u0010\u001b\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00070\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a \u0010\u001e\u001a\u00020\u0007*\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00070\nH\u0002\u001a \u0010\u001f\u001a\u00020\u0007*\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00070\nH\u0002\u001a:\u0010 \u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00070\nH\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0019\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"InvalidFocusDirection", "", "getInvalidFocusDirection$annotations", "()V", "NoActiveChild", "getNoActiveChild$annotations", "backwardFocusSearch", "", "Landroidx/compose/ui/focus/FocusTargetNode;", "onFound", "Lkotlin/Function1;", "forEachItemAfter", "", "T", "Landroidx/compose/runtime/collection/MutableVector;", "item", "action", "(Landroidx/compose/runtime/collection/MutableVector;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "forEachItemBefore", "forwardFocusSearch", "generateAndSearchChildren", "focusedItem", "direction", "Landroidx/compose/ui/focus/FocusDirection;", "generateAndSearchChildren-4C6V_qg", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "isRoot", "oneDimensionalFocusSearch", "oneDimensionalFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "pickChildForBackwardSearch", "pickChildForForwardSearch", "searchChildren", "searchChildren-4C6V_qg", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class OneDimensionalFocusSearchKt {
    private static final String InvalidFocusDirection = "This function should only be used for 1-D focus search";
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    /* JADX INFO: compiled from: OneDimensionalFocusSearch.kt */
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
    public static final /* synthetic */ boolean m4064access$searchChildren4C6V_qg(FocusTargetNode $receiver, FocusTargetNode focusedItem, int direction, Function1 onFound) {
        return m4067searchChildren4C6V_qg($receiver, focusedItem, direction, onFound);
    }

    private static /* synthetic */ void getInvalidFocusDirection$annotations() {
    }

    private static /* synthetic */ void getNoActiveChild$annotations() {
    }

    /* JADX INFO: renamed from: oneDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final boolean m4066oneDimensionalFocusSearchOMvw8(FocusTargetNode $this$oneDimensionalFocusSearch_u2d_u2dOM_u2dvw8, int direction, Function1<? super FocusTargetNode, Boolean> r4) {
        if (FocusDirection.m4009equalsimpl0(direction, FocusDirection.Companion.m4017getNextdhqQ8s()) == false) goto L6;
        return forwardFocusSearch($this$oneDimensionalFocusSearch_u2d_u2dOM_u2dvw8, r4);
    L6:
        if (FocusDirection.m4009equalsimpl0(direction, FocusDirection.Companion.m4018getPreviousdhqQ8s()) == false) goto L10;
        return backwardFocusSearch($this$oneDimensionalFocusSearch_u2d_u2dOM_u2dvw8, r4);
    L10:
        throw new IllegalStateException(InvalidFocusDirection.toString());
    }

    private static final boolean forwardFocusSearch(FocusTargetNode $this$forwardFocusSearch, Function1<? super FocusTargetNode, Boolean> r3) {
        FocusStateImpl r0 = $this$forwardFocusSearch.getFocusState();
        switch(WhenMappings.$EnumSwitchMapping$0[r0.ordinal()]) {
            case 1: goto L11;
            case 2: goto L25;
            case 3: goto L25;
            case 4: goto L7;
            default: goto L5;
        };
    L11:
        FocusTargetNode focusedChild = FocusTraversalKt.getActiveChild($this$forwardFocusSearch);
        if (focusedChild == null) goto L22;
        if (forwardFocusSearch(focusedChild, r3) == true) goto L20;
        if (m4065generateAndSearchChildren4C6V_qg($this$forwardFocusSearch, focusedChild, FocusDirection.Companion.m4017getNextdhqQ8s(), r3) == true) goto L20;
        return false;
    L20:
        return true;
    L22:
        throw new IllegalStateException(NoActiveChild.toString());
    L5:
        throw new NoWhenBranchMatchedException();
    L7:
        if ($this$forwardFocusSearch.fetchFocusProperties$ui_release().getCanFocus() == false) goto L24;
        return r3.invoke($this$forwardFocusSearch).booleanValue();
    L24:
        return pickChildForForwardSearch($this$forwardFocusSearch, r3);
    L25:
        return pickChildForForwardSearch($this$forwardFocusSearch, r3);
    }

    private static final boolean backwardFocusSearch(FocusTargetNode $this$backwardFocusSearch, Function1<? super FocusTargetNode, Boolean> r7) {
        switch(WhenMappings.$EnumSwitchMapping$0[$this$backwardFocusSearch.getFocusState().ordinal()]) {
            case 1: goto L17;
            case 2: goto L40;
            case 3: goto L40;
            case 4: goto L7;
            default: goto L5;
        };
    L17:
        FocusTargetNode focusedChild = FocusTraversalKt.getActiveChild($this$backwardFocusSearch);
        if (focusedChild == null) goto L39;
        switch(WhenMappings.$EnumSwitchMapping$0[focusedChild.getFocusState().ordinal()]) {
            case 1: goto L27;
            case 2: goto L41;
            case 3: goto L41;
            case 4: goto L24;
            default: goto L22;
        };
    L22:
        throw new NoWhenBranchMatchedException();
    L24:
        throw new IllegalStateException(NoActiveChild.toString());
    L41:
        return m4065generateAndSearchChildren4C6V_qg($this$backwardFocusSearch, focusedChild, FocusDirection.Companion.m4018getPreviousdhqQ8s(), r7);
    L27:
        if (backwardFocusSearch(focusedChild, r7) == false) goto L29;
        return true;
    L29:
        if (m4065generateAndSearchChildren4C6V_qg($this$backwardFocusSearch, focusedChild, FocusDirection.Companion.m4018getPreviousdhqQ8s(), r7) == false) goto L31;
        return true;
    L31:
        if (focusedChild.fetchFocusProperties$ui_release().getCanFocus() == false) goto L42;
        if (r7.invoke(focusedChild).booleanValue() == false) goto L42;
        return true;
    L42:
        return false;
    L39:
        throw new IllegalStateException(NoActiveChild.toString());
    L5:
        throw new NoWhenBranchMatchedException();
    L7:
        if (pickChildForBackwardSearch($this$backwardFocusSearch, r7) == false) goto L9;
        return true;
    L9:
        if ($this$backwardFocusSearch.fetchFocusProperties$ui_release().getCanFocus() == false) goto L11;
        boolean r0 = r7.invoke($this$backwardFocusSearch).booleanValue();
    L12:
        if (r0 == false) goto L37;
        return true;
    L37:
        return false;
    L11:
        r0 = false;
        goto L12
    L40:
        return pickChildForBackwardSearch($this$backwardFocusSearch, r7);
    }

    /* JADX INFO: renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m4065generateAndSearchChildren4C6V_qg(final FocusTargetNode $this$generateAndSearchChildren_u2d4C6V_qg, final FocusTargetNode focusedItem, final int direction, final Function1<? super FocusTargetNode, Boolean> r12) {
        if (m4067searchChildren4C6V_qg($this$generateAndSearchChildren_u2d4C6V_qg, focusedItem, direction, r12) == false) goto L6;
        return true;
    L6:
        final FocusTransactionManager focusTransactionManager = FocusTargetNodeKt.requireTransactionManager($this$generateAndSearchChildren_u2d4C6V_qg);
        final int generationBeforeSearch = focusTransactionManager.getGeneration();
        final FocusTargetNode activeNodeBeforeSearch = DelegatableNodeKt.requireOwner($this$generateAndSearchChildren_u2d4C6V_qg).getFocusOwner().getActiveFocusTargetNode();
        Boolean r9 = (Boolean) BeyondBoundsLayoutKt.m4004searchBeyondBoundsOMvw8($this$generateAndSearchChildren_u2d4C6V_qg, direction, new OneDimensionalFocusSearchKt$generateAndSearchChildren$1(generationBeforeSearch, focusTransactionManager, activeNodeBeforeSearch, $this$generateAndSearchChildren_u2d4C6V_qg, focusedItem, direction, r12));
        if (r9 != null) goto L11;
        return false;
    L11:
        return r9.booleanValue();
    }

    /* JADX INFO: renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m4067searchChildren4C6V_qg(FocusTargetNode $this$searchChildren_u2d4C6V_qg, FocusTargetNode focusedItem, int direction, Function1<? super FocusTargetNode, Boolean> r41) {
        int r6 = 0;
        if ($this$searchChildren_u2d4C6V_qg.getFocusState() != FocusStateImpl.ActiveParent) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L123;
        MutableVector children = new MutableVector(new FocusTargetNode[16], 0);
        MutableVector $this$searchChildren_4C6V_qg_u24lambda_u242 = children;
        FocusTargetNode $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$searchChildren_u2d4C6V_qg;
        int r10 = NodeKind.m5976constructorimpl(1024);
        boolean value$iv$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L10;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L10:
        int r17 = 1;
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode().getChild$ui_release();
        if (child$iv$iv != null) goto L13;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode(), false);
    L14:
        MutableVector this_$iv$iv$iv = branches$iv$iv;
        if (this_$iv$iv$iv.getSize() == 0) goto L17;
        int r8 = r17;
    L18:
        if (r8 == 0) goto L72;
        MutableVector this_$iv$iv$iv2 = branches$iv$iv;
        Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(this_$iv$iv$iv2.getSize() - 1);
        if ((branch$iv$iv.getAggregateChildKindSet$ui_release() & r10) == 0) goto L21;
        Modifier.Node node$iv$iv = branch$iv$iv;
    L23:
        if (node$iv$iv == null) goto L71;
        if ((node$iv$iv.getKindSet$ui_release() & r10) != 0) goto L26;
        node$iv$iv = node$iv$iv.getChild$ui_release();
        r17 = 1;
        goto L23
    L26:
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r24 = null;
        Modifier.Node r7 = it$iv;
    L27:
        if (r7 == null) goto L69;
        branches$iv$iv = branches$iv$iv;
        if ((r7 instanceof FocusTargetNode) == true) goto L30;
        Modifier.Node this_$iv$iv$iv3 = r7;
        if ((this_$iv$iv$iv3.getKindSet$ui_release() & r10) == 0) goto L34;
        int r5 = r17;
    L35:
        if (r5 == 0) goto L67;
        if ((r7 instanceof DelegatingNode) == false) goto L67;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv4 = (DelegatingNode) r7;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv4.getDelegate$ui_release();
    L39:
        if (node$iv$iv$iv == null) goto L63;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & r10) == 0) goto L43;
        int r32 = r17;
    L44:
        if (r32 == 0) goto L61;
        count$iv$iv = count$iv$iv + 1;
        MutableVector $this$searchChildren_4C6V_qg_u24lambda_u243 = $this$searchChildren_4C6V_qg_u24lambda_u242;
        if (count$iv$iv != r17) goto L48;
        r7 = next$iv$iv;
    L62:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        $this$searchChildren_4C6V_qg_u24lambda_u242 = $this$searchChildren_4C6V_qg_u24lambda_u243;
        r17 = 1;
        goto L39
    L48:
        if (r24 != null) goto L50;
        MutableVector r9 = new MutableVector(new Modifier.Node[16], 0);
    L51:
        Modifier.Node theNode$iv$iv = r7;
        if (theNode$iv$iv == null) goto L56;
        if (r9 == null) goto L55;
        r9.add(theNode$iv$iv);
    L55:
        r7 = null;
    L57:
        if (r9 == null) goto L60;
        r9.add(next$iv$iv);
    L60:
        r24 = r9;
        count$iv$iv = count$iv$iv;
        goto L62
    L56:
        r7 = r7;
        goto L57
    L50:
        r9 = r24;
        goto L51
    L61:
        $this$searchChildren_4C6V_qg_u24lambda_u243 = $this$searchChildren_4C6V_qg_u24lambda_u242;
        goto L62
    L43:
        r32 = 0;
        goto L44
    L63:
        MutableVector $this$searchChildren_4C6V_qg_u24lambda_u244 = $this$searchChildren_4C6V_qg_u24lambda_u242;
        Modifier.Node r36 = r7;
        if (count$iv$iv != 1) goto L68;
        $this$searchChildren_4C6V_qg_u24lambda_u242 = $this$searchChildren_4C6V_qg_u24lambda_u244;
        r7 = r36;
        r17 = 1;
    L68:
        r7 = DelegatableNodeKt.access$pop(r24);
        $this$searchChildren_4C6V_qg_u24lambda_u242 = $this$searchChildren_4C6V_qg_u24lambda_u244;
        r17 = 1;
    L67:
        $this$searchChildren_4C6V_qg_u24lambda_u244 = $this$searchChildren_4C6V_qg_u24lambda_u242;
        goto L68
    L34:
        r5 = 0;
        goto L35
    L30:
        FocusTargetNode it = (FocusTargetNode) r7;
        $this$searchChildren_4C6V_qg_u24lambda_u242.add(it);
        $this$searchChildren_4C6V_qg_u24lambda_u244 = $this$searchChildren_4C6V_qg_u24lambda_u242;
        goto L68
    L69:
        r6 = 0;
        r17 = 1;
        goto L14
    L71:
        r6 = 0;
        r17 = 1;
        goto L14
    L21:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, branch$iv$iv, false);
        goto L14
    L72:
        children.sortWith(FocusableChildrenComparator.INSTANCE);
        if (FocusDirection.m4009equalsimpl0(direction, FocusDirection.Companion.m4017getNextdhqQ8s()) == false) goto L91;
        boolean itemFound$iv = false;
        IntRange r11 = RangesKt.until(0, children.getSize());
        int index$iv = r11.getFirst();
        int r12 = r11.getLast();
        if (index$iv > r12) goto L110;
    L76:
        if (itemFound$iv == false) goto L85;
        FocusTargetNode child = (FocusTargetNode) children.content[index$iv];
        if (FocusTraversalKt.isEligibleForFocusSearch(child) == false) goto L85;
        if (forwardFocusSearch(child, r41) == false) goto L85;
        return true;
    L85:
        if (Intrinsics.areEqual(children.content[index$iv], focusedItem) == false) goto L87;
        itemFound$iv = true;
    L87:
        if (index$iv == r12) goto L110;
        index$iv = index$iv + 1;
    L110:
        if (FocusDirection.m4009equalsimpl0(direction, FocusDirection.Companion.m4017getNextdhqQ8s()) == false) goto L112;
        return false;
    L112:
        if ($this$searchChildren_u2d4C6V_qg.fetchFocusProperties$ui_release().getCanFocus() == true) goto L114;
        return false;
    L114:
        if (isRoot($this$searchChildren_u2d4C6V_qg) == false) goto L117;
        return false;
    L117:
        return r41.invoke($this$searchChildren_u2d4C6V_qg).booleanValue();
    L91:
        if (FocusDirection.m4009equalsimpl0(direction, FocusDirection.Companion.m4018getPreviousdhqQ8s()) == false) goto L121;
        boolean itemFound$iv2 = false;
        IntRange r13 = RangesKt.until(0, children.getSize());
        int $i$f$getIndices = r13.getFirst();
        int index$iv2 = r13.getLast();
        if ($i$f$getIndices > index$iv2) goto L110;
    L94:
        if (itemFound$iv2 == false) goto L104;
        FocusTargetNode child2 = (FocusTargetNode) children.content[index$iv2];
        if (FocusTraversalKt.isEligibleForFocusSearch(child2) == false) goto L104;
        if (backwardFocusSearch(child2, r41) == false) goto L104;
        return true;
    L104:
        if (Intrinsics.areEqual(children.content[index$iv2], focusedItem) == false) goto L106;
        itemFound$iv2 = true;
    L106:
        if (index$iv2 == $i$f$getIndices) goto L110;
        index$iv2 = index$iv2 - 1;
        goto L94
    L121:
        throw new IllegalStateException(InvalidFocusDirection.toString());
    L17:
        r8 = r6;
        goto L18
    L13:
        branches$iv$iv.add(child$iv$iv);
        goto L14
    L123:
        throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
    L5:
        r4 = false;
        goto L6
    }

    private static final boolean pickChildForForwardSearch(FocusTargetNode $this$pickChildForForwardSearch, Function1<? super FocusTargetNode, Boolean> r34) {
        MutableVector r2 = new MutableVector(new FocusTargetNode[16], 0);
        MutableVector $this$pickChildForForwardSearch_u24lambda_u246 = r2;
        int r1 = 0;
        FocusTargetNode $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$pickChildForForwardSearch;
        int r5 = NodeKind.m5976constructorimpl(1024);
        boolean value$iv$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L5:
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode().getChild$ui_release();
        if (child$iv$iv != null) goto L8;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode(), false);
    L10:
        if (branches$iv$iv.getSize() == 0) goto L12;
        boolean r12 = true;
    L13:
        if (r12 == false) goto L65;
        Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(branches$iv$iv.getSize() - 1);
        if ((branch$iv$iv.getAggregateChildKindSet$ui_release() & r5) == 0) goto L16;
        Modifier.Node node$iv$iv = branch$iv$iv;
    L18:
        if (node$iv$iv == null) goto L10;
        if ((node$iv$iv.getKindSet$ui_release() & r5) != 0) goto L21;
        node$iv$iv = node$iv$iv.getChild$ui_release();
        $this$pickChildForForwardSearch_u24lambda_u246 = $this$pickChildForForwardSearch_u24lambda_u246;
        goto L18
    L21:
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r19 = null;
        Modifier.Node r4 = it$iv;
    L22:
        if (r4 == null) goto L10;
        r1 = r1;
        if ((r4 instanceof FocusTargetNode) == true) goto L25;
        Modifier.Node this_$iv$iv$iv = r4;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & r5) == 0) goto L29;
        boolean r3 = true;
    L30:
        if (r3 == false) goto L60;
        if ((r4 instanceof DelegatingNode) == false) goto L60;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r4;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L34:
        if (node$iv$iv$iv == null) goto L57;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & r5) == 0) goto L38;
        boolean r27 = true;
    L39:
        if (r27 == false) goto L55;
        count$iv$iv = count$iv$iv + 1;
        MutableVector $this$pickChildForForwardSearch_u24lambda_u247 = $this$pickChildForForwardSearch_u24lambda_u246;
        if (count$iv$iv != 1) goto L43;
        r4 = next$iv$iv;
        r2 = r2;
    L56:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        $this$pickChildForForwardSearch_u24lambda_u246 = $this$pickChildForForwardSearch_u24lambda_u247;
        r2 = r2;
        goto L34
    L43:
        if (r19 != null) goto L45;
        MutableVector r6 = new MutableVector(new Modifier.Node[16], 0);
    L46:
        Modifier.Node theNode$iv$iv = r4;
        if (theNode$iv$iv == null) goto L51;
        if (r6 == null) goto L50;
        r6.add(theNode$iv$iv);
    L50:
        r4 = null;
    L51:
        if (r6 == null) goto L54;
        r6.add(next$iv$iv);
    L54:
        r19 = r6;
        count$iv$iv = count$iv$iv;
        goto L56
    L45:
        r6 = r19;
        goto L46
    L55:
        $this$pickChildForForwardSearch_u24lambda_u247 = $this$pickChildForForwardSearch_u24lambda_u246;
        r2 = r2;
        goto L56
    L38:
        r27 = false;
        goto L39
    L57:
        MutableVector $this$pickChildForForwardSearch_u24lambda_u248 = $this$pickChildForForwardSearch_u24lambda_u246;
        MutableVector r31 = r2;
        if (count$iv$iv != 1) goto L61;
        $this$pickChildForForwardSearch_u24lambda_u246 = $this$pickChildForForwardSearch_u24lambda_u248;
        r2 = r31;
    L61:
        r4 = DelegatableNodeKt.access$pop(r19);
        $this$pickChildForForwardSearch_u24lambda_u246 = $this$pickChildForForwardSearch_u24lambda_u248;
        r2 = r31;
    L60:
        $this$pickChildForForwardSearch_u24lambda_u248 = $this$pickChildForForwardSearch_u24lambda_u246;
        r31 = r2;
        goto L61
    L29:
        r3 = false;
        goto L30
    L25:
        $this$pickChildForForwardSearch_u24lambda_u246.add((FocusTargetNode) r4);
        $this$pickChildForForwardSearch_u24lambda_u248 = $this$pickChildForForwardSearch_u24lambda_u246;
        r31 = r2;
        goto L61
    L16:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, branch$iv$iv, false);
        goto L10
    L65:
        MutableVector children = r2;
        children.sortWith(FocusableChildrenComparator.INSTANCE);
        Object[] content$iv = children.content;
        int size$iv = children.getSize();
        int i$iv = 0;
    L66:
        if (i$iv >= size$iv) goto L78;
        FocusTargetNode it = (FocusTargetNode) content$iv[i$iv];
        if (FocusTraversalKt.isEligibleForFocusSearch(it) == false) goto L73;
        if (forwardFocusSearch(it, r34) == false) goto L73;
        boolean r7 = true;
    L74:
        if (r7 == true) goto L104;
        i$iv = i$iv + 1;
        goto L66
    L104:
        return true;
    L73:
        r7 = false;
        goto L74
    L78:
        return false;
    L12:
        r12 = false;
        goto L13
    L8:
        branches$iv$iv.add(child$iv$iv);
        goto L10
    }

    private static final boolean pickChildForBackwardSearch(FocusTargetNode $this$pickChildForBackwardSearch, Function1<? super FocusTargetNode, Boolean> r35) {
        MutableVector r2 = new MutableVector(new FocusTargetNode[16], 0);
        MutableVector $this$pickChildForBackwardSearch_u24lambda_u249 = r2;
        int r1 = 0;
        FocusTargetNode $this$visitChildren_u2dY_u2dYKmho_u24default$iv = $this$pickChildForBackwardSearch;
        int r5 = NodeKind.m5976constructorimpl(1024);
        boolean value$iv$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L5:
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv = $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode().getChild$ui_release();
        if (child$iv$iv != null) goto L8;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, $this$visitChildren_u2dY_u2dYKmho_u24default$iv.getNode(), false);
    L10:
        if (branches$iv$iv.getSize() == 0) goto L12;
        boolean r12 = true;
    L13:
        if (r12 == false) goto L65;
        Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(branches$iv$iv.getSize() - 1);
        if ((branch$iv$iv.getAggregateChildKindSet$ui_release() & r5) == 0) goto L16;
        Modifier.Node node$iv$iv = branch$iv$iv;
    L18:
        if (node$iv$iv == null) goto L10;
        if ((node$iv$iv.getKindSet$ui_release() & r5) != 0) goto L21;
        node$iv$iv = node$iv$iv.getChild$ui_release();
        goto L18
    L21:
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r20 = null;
        Modifier.Node r4 = it$iv;
    L22:
        if (r4 == null) goto L10;
        r1 = r1;
        if ((r4 instanceof FocusTargetNode) == true) goto L25;
        Modifier.Node this_$iv$iv$iv = r4;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & r5) == 0) goto L29;
        boolean r3 = true;
    L30:
        if (r3 == false) goto L60;
        if ((r4 instanceof DelegatingNode) == false) goto L60;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r4;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L34:
        if (node$iv$iv$iv == null) goto L57;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & r5) == 0) goto L38;
        boolean r28 = true;
    L39:
        if (r28 == false) goto L55;
        count$iv$iv = count$iv$iv + 1;
        MutableVector $this$pickChildForBackwardSearch_u24lambda_u2410 = $this$pickChildForBackwardSearch_u24lambda_u249;
        if (count$iv$iv != 1) goto L43;
        r4 = next$iv$iv;
        r2 = r2;
    L56:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        $this$pickChildForBackwardSearch_u24lambda_u249 = $this$pickChildForBackwardSearch_u24lambda_u2410;
        r2 = r2;
        goto L34
    L43:
        if (r20 != null) goto L45;
        MutableVector r6 = new MutableVector(new Modifier.Node[16], 0);
    L46:
        Modifier.Node theNode$iv$iv = r4;
        if (theNode$iv$iv == null) goto L51;
        if (r6 == null) goto L50;
        r6.add(theNode$iv$iv);
    L50:
        r4 = null;
    L51:
        if (r6 == null) goto L54;
        r6.add(next$iv$iv);
    L54:
        r20 = r6;
        count$iv$iv = count$iv$iv;
        goto L56
    L45:
        r6 = r20;
        goto L46
    L55:
        $this$pickChildForBackwardSearch_u24lambda_u2410 = $this$pickChildForBackwardSearch_u24lambda_u249;
        r2 = r2;
        goto L56
    L38:
        r28 = false;
        goto L39
    L57:
        MutableVector $this$pickChildForBackwardSearch_u24lambda_u2411 = $this$pickChildForBackwardSearch_u24lambda_u249;
        MutableVector r32 = r2;
        if (count$iv$iv != 1) goto L61;
        $this$pickChildForBackwardSearch_u24lambda_u249 = $this$pickChildForBackwardSearch_u24lambda_u2411;
        r2 = r32;
    L61:
        r4 = DelegatableNodeKt.access$pop(r20);
        $this$pickChildForBackwardSearch_u24lambda_u249 = $this$pickChildForBackwardSearch_u24lambda_u2411;
        r2 = r32;
    L60:
        $this$pickChildForBackwardSearch_u24lambda_u2411 = $this$pickChildForBackwardSearch_u24lambda_u249;
        r32 = r2;
        goto L61
    L29:
        r3 = false;
        goto L30
    L25:
        $this$pickChildForBackwardSearch_u24lambda_u249.add((FocusTargetNode) r4);
        $this$pickChildForBackwardSearch_u24lambda_u2411 = $this$pickChildForBackwardSearch_u24lambda_u249;
        r32 = r2;
        goto L61
    L16:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, branch$iv$iv, false);
        goto L10
    L65:
        MutableVector children = r2;
        children.sortWith(FocusableChildrenComparator.INSTANCE);
        int i$iv = children.getSize() - 1;
        Object[] content$iv = children.content;
        if (i$iv >= content$iv.length) goto L78;
    L67:
        if (i$iv < 0) goto L107;
        FocusTargetNode it = (FocusTargetNode) content$iv[i$iv];
        if (FocusTraversalKt.isEligibleForFocusSearch(it) == false) goto L75;
        if (backwardFocusSearch(it, r35) == false) goto L75;
        return true;
    L75:
        i$iv = i$iv - 1;
        goto L67
    L107:
        return false;
    L78:
        return false;
    L12:
        r12 = false;
        goto L13
    L8:
        branches$iv$iv.add(child$iv$iv);
        goto L10
    }

    private static final boolean isRoot(FocusTargetNode $this$isRoot) {
        FocusTargetNode $this$nearestAncestor_u2d64DMado$iv = $this$isRoot;
        int type$iv = NodeKind.m5976constructorimpl(1024);
        int r2 = 0;
        boolean value$iv$iv$iv$iv = $this$nearestAncestor_u2d64DMado$iv.getNode().isAttached();
        if (value$iv$iv$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L5:
        Modifier.Node node$iv$iv$iv = $this$nearestAncestor_u2d64DMado$iv.getNode().getParent$ui_release();
        LayoutNode layout$iv$iv$iv = DelegatableNodeKt.requireLayoutNode($this$nearestAncestor_u2d64DMado$iv);
    L6:
        boolean r13 = true;
        if (layout$iv$iv$iv == null) goto L66;
        Modifier.Node head$iv$iv$iv = layout$iv$iv$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L58;
    L10:
        if (node$iv$iv$iv == null) goto L57;
        if ((node$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L56;
        Modifier.Node it$iv$iv = node$iv$iv$iv;
        MutableVector r19 = null;
        Modifier.Node r11 = it$iv$iv;
    L14:
        if (r11 == null) goto L56;
        if ((r11 instanceof FocusTargetNode) == true) goto L17;
        Modifier.Node this_$iv$iv$iv$iv = r11;
        if ((this_$iv$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L21;
        boolean r12 = r13;
    L22:
        if (r12 == false) goto L52;
        if ((r11 instanceof DelegatingNode) == false) goto L52;
        int count$iv$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv$iv2 = (DelegatingNode) r11;
        Modifier.Node node$iv$iv$iv$iv = this_$iv$iv$iv$iv2.getDelegate$ui_release();
    L26:
        if (node$iv$iv$iv$iv == null) goto L49;
        Modifier.Node next$iv$iv$iv = node$iv$iv$iv$iv;
        if ((next$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L30;
        boolean r26 = r13;
    L31:
        if (r26 == false) goto L47;
        count$iv$iv$iv = count$iv$iv$iv + 1;
        if (count$iv$iv$iv != r13) goto L35;
        r11 = next$iv$iv$iv;
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv;
        type$iv = type$iv;
        r2 = r2;
    L48:
        node$iv$iv$iv$iv = node$iv$iv$iv$iv.getChild$ui_release();
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv;
        type$iv = type$iv;
        r2 = r2;
        r13 = true;
        goto L26
    L35:
        if (r19 != null) goto L37;
        MutableVector r0 = new MutableVector(new Modifier.Node[16], 0);
    L38:
        Modifier.Node theNode$iv$iv$iv = r11;
        if (theNode$iv$iv$iv == null) goto L43;
        if (r0 == null) goto L42;
        r0.add(theNode$iv$iv$iv);
    L42:
        r11 = null;
    L43:
        if (r0 == null) goto L46;
        r0.add(next$iv$iv$iv);
    L46:
        r19 = r0;
        goto L48
    L37:
        r0 = r19;
        goto L38
    L47:
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv;
        type$iv = type$iv;
        r2 = r2;
        goto L48
    L30:
        r26 = false;
        goto L31
    L49:
        DelegatableNode $this$nearestAncestor_u2d64DMado$iv2 = $this$nearestAncestor_u2d64DMado$iv;
        int type$iv2 = type$iv;
        int r31 = r2;
        boolean r1 = true;
        if (count$iv$iv$iv == 1) goto L51;
    L53:
        r11 = DelegatableNodeKt.access$pop(r19);
        r13 = r1;
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv2;
        type$iv = type$iv2;
        r2 = r31;
        goto L14
    L51:
        r13 = true;
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv2;
        type$iv = type$iv2;
        r2 = r31;
    L52:
        $this$nearestAncestor_u2d64DMado$iv2 = $this$nearestAncestor_u2d64DMado$iv;
        type$iv2 = type$iv;
        r31 = r2;
        r1 = r13;
        goto L53
    L21:
        r12 = false;
        goto L22
    L17:
        boolean r3 = r13;
        boolean r4 = false;
    L67:
        if (r11 != null) goto L70;
        return r3;
    L70:
        return r4;
    L56:
        node$iv$iv$iv = node$iv$iv$iv.getParent$ui_release();
        r13 = r13;
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv;
        type$iv = type$iv;
        r2 = r2;
        goto L10
    L57:
        DelegatableNode $this$nearestAncestor_u2d64DMado$iv3 = $this$nearestAncestor_u2d64DMado$iv;
        int type$iv3 = type$iv;
        int r32 = r2;
    L59:
        layout$iv$iv$iv = layout$iv$iv$iv.getParent$ui_release();
        if (layout$iv$iv$iv == null) goto L64;
        NodeChain r5 = layout$iv$iv$iv.getNodes$ui_release();
        if (r5 == null) goto L64;
        Modifier.Node r14 = r5.getTail$ui_release();
    L65:
        node$iv$iv$iv = r14;
        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv3;
        type$iv = type$iv3;
        r2 = r32;
    L64:
        r14 = null;
        goto L65
    L58:
        $this$nearestAncestor_u2d64DMado$iv3 = $this$nearestAncestor_u2d64DMado$iv;
        type$iv3 = type$iv;
        r32 = r2;
        goto L59
    L66:
        r3 = true;
        r4 = false;
        r11 = null;
        goto L67
    }

    private static final <T> void forEachItemAfter(MutableVector<T> r7, T r8, Function1<? super T, Unit> r9) {
        boolean r1 = false;
        IntRange r2 = RangesKt.until(0, r7.getSize());
        int r3 = r2.getFirst();
        int r4 = r2.getLast();
        if (r3 > r4) goto L11;
    L4:
        if (r1 == false) goto L7;
        r9.invoke(r7.content[r3]);
    L7:
        if (Intrinsics.areEqual(r7.content[r3], r8) == false) goto L9;
        r1 = true;
    L9:
        if (r3 == r4) goto L13;
        r3 = r3 + 1;
        goto L4
    L13:
        return;
    }

    private static final <T> void forEachItemBefore(MutableVector<T> r7, T r8, Function1<? super T, Unit> r9) {
        boolean r1 = false;
        IntRange r2 = RangesKt.until(0, r7.getSize());
        int r3 = r2.getFirst();
        int r4 = r2.getLast();
        if (r3 > r4) goto L11;
    L4:
        if (r1 == false) goto L7;
        r9.invoke(r7.content[r4]);
    L7:
        if (Intrinsics.areEqual(r7.content[r4], r8) == false) goto L9;
        r1 = true;
    L9:
        if (r4 == r3) goto L13;
        r4 = r4 - 1;
        goto L4
    L13:
        return;
    }
}
