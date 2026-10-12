package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MeasureAndLayoutDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0000\u0018\u00002\u00020\u0001:\u0001XB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010-\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020\bJ\"\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00032\b\u00103\u001a\u0004\u0018\u00010!H\u0002ø\u0001\u0000¢\u0006\u0002\b4J\"\u00105\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00032\b\u00103\u001a\u0004\u0018\u00010!H\u0002ø\u0001\u0000¢\u0006\u0002\b6J\b\u00107\u001a\u00020.H\u0002J\u0010\u00108\u001a\u00020.2\u0006\u00102\u001a\u00020\u0003H\u0002J\u0016\u00109\u001a\u00020.2\u0006\u00102\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\bJ\u0018\u0010;\u001a\u00020.2\u0006\u00102\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\bH\u0002J\u0018\u0010<\u001a\u00020\b2\u0010\b\u0002\u0010=\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010>J \u0010<\u001a\u00020.2\u0006\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\u0006\u0010A\u001a\u00020.J\u000e\u0010B\u001a\u00020.2\u0006\u0010C\u001a\u00020\u0003J\u0018\u0010D\u001a\u00020.2\u0006\u0010C\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\bH\u0002J\u001f\u0010E\u001a\u00020.2\u0006\u0010F\u001a\u00020\b2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020.0>H\u0082\bJ\u000e\u0010H\u001a\u00020.2\u0006\u0010I\u001a\u00020\u0019J$\u0010J\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00032\b\b\u0002\u0010:\u001a\u00020\b2\b\b\u0002\u0010K\u001a\u00020\bH\u0002J\u0010\u0010L\u001a\u00020.2\u0006\u00102\u001a\u00020\u0003H\u0002J\u0018\u0010M\u001a\u00020.2\u0006\u00102\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\bH\u0002J\u0018\u0010N\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00032\b\b\u0002\u0010O\u001a\u00020\bJ\u0018\u0010P\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00032\b\b\u0002\u0010O\u001a\u00020\bJ\u000e\u0010Q\u001a\u00020.2\u0006\u00102\u001a\u00020\u0003J\u0018\u0010R\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00032\b\b\u0002\u0010O\u001a\u00020\bJ\u0018\u0010S\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00032\b\b\u0002\u0010O\u001a\u00020\bJ\u0018\u0010T\u001a\u00020.2\u0006\u00103\u001a\u00020!ø\u0001\u0000¢\u0006\u0004\bU\u0010VJ\u0014\u0010W\u001a\u00020\b*\u00020\u00032\u0006\u0010:\u001a\u00020\bH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u0018\u0010\"\u001a\u00020\b*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0018\u0010%\u001a\u00020\b*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0018\u0010'\u001a\u00020\b*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010$R\u0018\u0010)\u001a\u00020\b*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010$R\u0018\u0010+\u001a\u00020\b*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "", "root", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "consistencyChecker", "Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "duringFullMeasureLayoutPass", "", "duringMeasureLayout", "getDuringMeasureLayout$ui_release", "()Z", "setDuringMeasureLayout$ui_release", "(Z)V", "hasPendingMeasureOrLayout", "getHasPendingMeasureOrLayout", "hasPendingOnPositionedCallbacks", "getHasPendingOnPositionedCallbacks", "<set-?>", "", "measureIteration", "getMeasureIteration", "()J", "onLayoutCompletedListeners", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "onPositionedDispatcher", "Landroidx/compose/ui/node/OnPositionedDispatcher;", "postponedMeasureRequests", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "relayoutNodes", "Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "rootConstraints", "Landroidx/compose/ui/unit/Constraints;", "canAffectParentInLookahead", "getCanAffectParentInLookahead", "(Landroidx/compose/ui/node/LayoutNode;)Z", "canAffectPlacedParent", "getCanAffectPlacedParent", "measureAffectsParent", "getMeasureAffectsParent", "measureAffectsParentLookahead", "getMeasureAffectsParentLookahead", "measureAffectsPlacedParent", "getMeasureAffectsPlacedParent", "callOnLayoutCompletedListeners", "", "dispatchOnPositionedCallbacks", "forceDispatch", "doLookaheadRemeasure", "layoutNode", "constraints", "doLookaheadRemeasure-sdFAvZA", "doRemeasure", "doRemeasure-sdFAvZA", "drainPostponedMeasureRequests", "ensureSubtreeLookaheadReplaced", "forceMeasureTheSubtree", "affectsLookahead", "forceMeasureTheSubtreeInternal", "measureAndLayout", "onLayout", "Lkotlin/Function0;", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "measureOnly", "onNodeDetached", "node", "onlyRemeasureIfPending", "performMeasureAndLayout", "fullPass", "block", "registerOnLayoutCompletedListener", "listener", "remeasureAndRelayoutIfNeeded", "relayoutNeeded", "remeasureLookaheadRootsInSubtree", "remeasureOnly", "requestLookaheadRelayout", "forced", "requestLookaheadRemeasure", "requestOnPositionedCallback", "requestRelayout", "requestRemeasure", "updateRootConstraints", "updateRootConstraints-BRTryo0", "(J)V", "measurePending", "PostponedRequest", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MeasureAndLayoutDelegate {
    public static final int $stable = 0;
    private final LayoutTreeConsistencyChecker consistencyChecker;
    private boolean duringFullMeasureLayoutPass;
    private boolean duringMeasureLayout;
    private long measureIteration;
    private final MutableVector<Owner.OnLayoutCompletedListener> onLayoutCompletedListeners;
    private final OnPositionedDispatcher onPositionedDispatcher;
    private final MutableVector<PostponedRequest> postponedMeasureRequests;
    private final DepthSortedSetsForDifferentPasses relayoutNodes;
    private final LayoutNode root;
    private Constraints rootConstraints;

    /* JADX INFO: compiled from: MeasureAndLayoutDelegate.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "", "node", "Landroidx/compose/ui/node/LayoutNode;", "isLookahead", "", "isForced", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "()Z", "getNode", "()Landroidx/compose/ui/node/LayoutNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PostponedRequest {
        public static final int $stable = 0;
        private final boolean isForced;
        private final boolean isLookahead;
        private final LayoutNode node;

        static {
            $stable = 8;
        }

        public PostponedRequest(LayoutNode node, boolean isLookahead, boolean isForced) {
            this.node = node;
            this.isLookahead = isLookahead;
            this.isForced = isForced;
        }

        public final LayoutNode getNode() {
            return this.node;
        }

        public final boolean isForced() {
            return this.isForced;
        }

        public final boolean isLookahead() {
            return this.isLookahead;
        }
    }

    /* JADX INFO: compiled from: MeasureAndLayoutDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[LayoutNode.LayoutState.values().length];
            r0[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L20:
            r0[LayoutNode.LayoutState.Measuring.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L24:
            r0[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L28:
            r0[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L22:
            r0[LayoutNode.LayoutState.Idle.ordinal()] = 5;     // Catch: NoSuchFieldError -> L17
        L18:
            $EnumSwitchMapping$0 = r0;
        }
    }

    static {
        $stable = 8;
    }

    public MeasureAndLayoutDelegate(LayoutNode root) {
        this.root = root;
        this.relayoutNodes = new DepthSortedSetsForDifferentPasses(Owner.Companion.getEnableExtraAssertions());
        this.onPositionedDispatcher = new OnPositionedDispatcher();
        this.onLayoutCompletedListeners = new MutableVector(new Owner.OnLayoutCompletedListener[16], 0);
        this.measureIteration = 1;
        this.postponedMeasureRequests = new MutableVector(new PostponedRequest[16], 0);
        if (Owner.Companion.getEnableExtraAssertions() == false) goto L5;
        LayoutTreeConsistencyChecker r0 = new LayoutTreeConsistencyChecker(this.root, this.relayoutNodes, this.postponedMeasureRequests.asMutableList());
    L6:
        this.consistencyChecker = r0;
        return;
    L5:
        r0 = null;
        goto L6
    }

    public static final /* synthetic */ LayoutNode access$getRoot$p(MeasureAndLayoutDelegate $this) {
        return $this.root;
    }

    public final boolean getHasPendingMeasureOrLayout() {
        return this.relayoutNodes.isNotEmpty();
    }

    public final boolean getHasPendingOnPositionedCallbacks() {
        return this.onPositionedDispatcher.isNotEmpty();
    }

    public final boolean getDuringMeasureLayout$ui_release() {
        return this.duringMeasureLayout;
    }

    public final void setDuringMeasureLayout$ui_release(boolean r1) {
        this.duringMeasureLayout = r1;
    }

    public final long getMeasureIteration() {
        boolean value$iv = this.duringMeasureLayout;
        if (value$iv == true) goto L6;
        InlineClassHelperKt.throwIllegalArgumentException("measureIteration should be only used during the measure/layout pass");
    L6:
        return this.measureIteration;
    }

    /* JADX INFO: renamed from: updateRootConstraints-BRTryo0, reason: not valid java name */
    public final void m5925updateRootConstraintsBRTryo0(long constraints) {
        Constraints r0 = this.rootConstraints;
        boolean r1 = false;
        if (r0 != null) goto L5;
        boolean r2 = false;
    L6:
        if (r2 == true) goto L18;
        boolean value$iv = !this.duringMeasureLayout;
        if (value$iv == true) goto L10;
        InlineClassHelperKt.throwIllegalArgumentException("updateRootConstraints called while measuring");
    L10:
        this.rootConstraints = Constraints.m6913boximpl(constraints);
        if (this.root.getLookaheadRoot$ui_release() == null) goto L13;
        this.root.markLookaheadMeasurePending$ui_release();
    L13:
        this.root.markMeasurePending$ui_release();
        DepthSortedSetsForDifferentPasses r3 = this.relayoutNodes;
        LayoutNode r4 = this.root;
        if (this.root.getLookaheadRoot$ui_release() == null) goto L16;
        r1 = true;
    L16:
        r3.add(r4, r1);
        return;
    L18:
        return;
    L5:
        r2 = Constraints.m6919equalsimpl0(r0.m6932unboximpl(), constraints);
        goto L6
    }

    public static /* synthetic */ boolean requestLookaheadRemeasure$default(MeasureAndLayoutDelegate r0, LayoutNode r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return r0.requestLookaheadRemeasure(r1, r2);
    }

    public final boolean requestLookaheadRemeasure(LayoutNode layoutNode, boolean forced) {
        if (layoutNode.getLookaheadRoot$ui_release() == null) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L10;
        InlineClassHelperKt.throwIllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
    L10:
        switch(WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()]) {
            case 1: goto L53;
            case 2: goto L48;
            case 3: goto L48;
            case 4: goto L48;
            case 5: goto L14;
            default: goto L12;
        };
    L48:
        this.postponedMeasureRequests.add(new PostponedRequest(layoutNode, true, forced));
        LayoutTreeConsistencyChecker r0 = this.consistencyChecker;
        if (r0 == null) goto L57;
        r0.assertConsistent();
    L57:
        return false;
    L12:
        throw new NoWhenBranchMatchedException();
    L14:
        if (layoutNode.getLookaheadMeasurePending$ui_release() == false) goto L17;
        if (forced == true) goto L17;
        return false;
    L17:
        layoutNode.markLookaheadMeasurePending$ui_release();
        layoutNode.markMeasurePending$ui_release();
        if (layoutNode.isDeactivated() == false) goto L21;
        return false;
    L21:
        if (Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), true) == false) goto L23;
    L24:
        LayoutNode r1 = layoutNode.getParent$ui_release();
        if (r1 != null) goto L27;
    L29:
        boolean r2 = false;
    L30:
        if (r2 == true) goto L33;
        this.relayoutNodes.add(layoutNode, true);
    L45:
        if (this.duringFullMeasureLayoutPass == true) goto L56;
        return true;
    L56:
        return false;
    L33:
        if (layoutNode.isPlaced() == false) goto L35;
    L36:
        LayoutNode r3 = layoutNode.getParent$ui_release();
        if (r3 != null) goto L39;
    L41:
        boolean r4 = false;
    L42:
        if (r4 == true) goto L45;
        this.relayoutNodes.add(layoutNode, false);
        goto L45
    L39:
        if (r3.getMeasurePending$ui_release() != true) goto L41;
        r4 = true;
        goto L42
    L35:
        if (getCanAffectPlacedParent(layoutNode) == false) goto L45;
    L27:
        if (r1.getLookaheadMeasurePending$ui_release() != true) goto L29;
        r2 = true;
        goto L30
    L23:
        if (getCanAffectParentInLookahead(layoutNode) == false) goto L33;
    L53:
        return false;
    L5:
        value$iv = false;
        goto L7
    }

    public static /* synthetic */ boolean requestRemeasure$default(MeasureAndLayoutDelegate r0, LayoutNode r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return r0.requestRemeasure(r1, r2);
    }

    public final boolean requestRemeasure(LayoutNode layoutNode, boolean forced) {
        switch(WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()]) {
            case 1: goto L42;
            case 2: goto L42;
            case 3: goto L30;
            case 4: goto L30;
            case 5: goto L7;
            default: goto L5;
        };
    L30:
        this.postponedMeasureRequests.add(new PostponedRequest(layoutNode, false, forced));
        LayoutTreeConsistencyChecker r0 = this.consistencyChecker;
        if (r0 == null) goto L41;
        r0.assertConsistent();
        return false;
    L41:
        return false;
    L42:
        return false;
    L5:
        throw new NoWhenBranchMatchedException();
    L7:
        if (layoutNode.getMeasurePending$ui_release() == false) goto L10;
        if (forced == true) goto L10;
        return false;
    L10:
        layoutNode.markMeasurePending$ui_release();
        if (layoutNode.isDeactivated() == false) goto L14;
        return false;
    L14:
        if (layoutNode.isPlaced() == false) goto L16;
    L19:
        LayoutNode r1 = layoutNode.getParent$ui_release();
        if (r1 != null) goto L22;
    L24:
        boolean r2 = false;
    L25:
        if (r2 == true) goto L28;
        this.relayoutNodes.add(layoutNode, false);
    L28:
        if (this.duringFullMeasureLayoutPass == false) goto L36;
        return false;
    L36:
        return true;
    L22:
        if (r1.getMeasurePending$ui_release() != true) goto L24;
        r2 = true;
        goto L25
    L16:
        if (getCanAffectPlacedParent(layoutNode) == true) goto L19;
        return false;
    }

    public static /* synthetic */ boolean requestLookaheadRelayout$default(MeasureAndLayoutDelegate r0, LayoutNode r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return r0.requestLookaheadRelayout(r1, r2);
    }

    public final boolean requestLookaheadRelayout(LayoutNode layoutNode, boolean forced) {
        switch(WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()]) {
            case 1: goto L52;
            case 2: goto L7;
            case 3: goto L52;
            case 4: goto L7;
            case 5: goto L7;
            default: goto L5;
        };
    L52:
        LayoutTreeConsistencyChecker r0 = this.consistencyChecker;
        if (r0 == null) goto L62;
        r0.assertConsistent();
        return false;
    L62:
        return false;
    L5:
        throw new NoWhenBranchMatchedException();
    L7:
        if (layoutNode.getLookaheadMeasurePending$ui_release() == false) goto L9;
    L10:
        if (forced == true) goto L15;
        LayoutTreeConsistencyChecker r1 = this.consistencyChecker;
        if (r1 == null) goto L58;
        r1.assertConsistent();
        return false;
    L58:
        return false;
    L15:
        layoutNode.markLookaheadLayoutPending$ui_release();
        layoutNode.markLayoutPending$ui_release();
        if (layoutNode.isDeactivated() == true) goto L59;
        LayoutNode parent = layoutNode.getParent$ui_release();
        if (Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), true) == false) goto L34;
        if (parent != null) goto L22;
    L24:
        boolean r2 = false;
    L25:
        if (r2 == true) goto L34;
        if (parent != null) goto L28;
    L30:
        boolean r3 = false;
    L31:
        if (r3 == true) goto L34;
        this.relayoutNodes.add(layoutNode, true);
    L49:
        if (this.duringFullMeasureLayoutPass == false) goto L56;
        return false;
    L56:
        return true;
    L28:
        if (parent.getLookaheadLayoutPending$ui_release() != true) goto L30;
        r3 = true;
        goto L31
    L22:
        if (parent.getLookaheadMeasurePending$ui_release() != true) goto L24;
        r2 = true;
    L34:
        if (layoutNode.isPlaced() == false) goto L49;
        if (parent != null) goto L37;
    L39:
        boolean r4 = false;
    L40:
        if (r4 == true) goto L49;
        if (parent != null) goto L43;
    L45:
        boolean r5 = false;
    L46:
        if (r5 == true) goto L49;
        this.relayoutNodes.add(layoutNode, false);
        goto L49
    L43:
        if (parent.getMeasurePending$ui_release() != true) goto L45;
        r5 = true;
        goto L46
    L37:
        if (parent.getLayoutPending$ui_release() != true) goto L39;
        r4 = true;
        goto L40
    L59:
        return false;
    L9:
        if (layoutNode.getLookaheadLayoutPending$ui_release() == false) goto L15;
        goto L10
    }

    public static /* synthetic */ boolean requestRelayout$default(MeasureAndLayoutDelegate r0, LayoutNode r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return r0.requestRelayout(r1, r2);
    }

    public final boolean requestRelayout(LayoutNode layoutNode, boolean forced) {
        switch(WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()]) {
            case 1: goto L50;
            case 2: goto L50;
            case 3: goto L50;
            case 4: goto L50;
            case 5: goto L6;
            default: goto L5;
        };
    L6:
        LayoutNode parent = layoutNode.getParent$ui_release();
        if (parent != null) goto L9;
    L12:
        boolean parentIsPlaced = true;
    L14:
        if (forced == false) goto L16;
    L27:
        layoutNode.markLayoutPending$ui_release();
        if (layoutNode.isDeactivated() == false) goto L31;
        return false;
    L31:
        if (layoutNode.isPlacedByParent() == false) goto L59;
        if (parentIsPlaced == false) goto L60;
        if (parent != null) goto L35;
    L37:
        boolean r4 = false;
    L38:
        if (r4 == true) goto L47;
        if (parent != null) goto L41;
    L43:
        boolean r5 = false;
    L44:
        if (r5 == true) goto L47;
        this.relayoutNodes.add(layoutNode, false);
        goto L47
    L41:
        if (parent.getMeasurePending$ui_release() != true) goto L43;
        r5 = true;
    L47:
        if (this.duringFullMeasureLayoutPass == false) goto L55;
        return false;
    L55:
        return true;
    L35:
        if (parent.getLayoutPending$ui_release() != true) goto L37;
        r4 = true;
        goto L38
    L60:
        return false;
    L59:
        return false;
    L16:
        if (layoutNode.getMeasurePending$ui_release() == false) goto L18;
    L23:
        LayoutTreeConsistencyChecker r2 = this.consistencyChecker;
        if (r2 == null) goto L57;
        r2.assertConsistent();
        return false;
    L57:
        return false;
    L18:
        if (layoutNode.getLayoutPending$ui_release() == false) goto L27;
        if (layoutNode.isPlaced() != parentIsPlaced) goto L27;
        if (layoutNode.isPlaced() != layoutNode.isPlacedByParent()) goto L27;
    L9:
        if (parent.isPlaced() == true) goto L12;
        parentIsPlaced = false;
        goto L14
    L50:
        LayoutTreeConsistencyChecker r0 = this.consistencyChecker;
        if (r0 == null) goto L62;
        r0.assertConsistent();
        return false;
    L62:
        return false;
    L5:
        throw new NoWhenBranchMatchedException();
    }

    public final void requestOnPositionedCallback(LayoutNode layoutNode) {
        this.onPositionedDispatcher.onNodePositioned(layoutNode);
    }

    /* JADX INFO: renamed from: doLookaheadRemeasure-sdFAvZA, reason: not valid java name */
    private final boolean m5922doLookaheadRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        if (layoutNode.getLookaheadRoot$ui_release() != null) goto L6;
        return false;
    L6:
        if (constraints == null) goto L8;
        boolean lookaheadSizeChanged = layoutNode.m5893lookaheadRemeasure_Sx5XlM$ui_release(constraints);
    L9:
        LayoutNode parent = layoutNode.getParent$ui_release();
        if (lookaheadSizeChanged == false) goto L21;
        if (parent == null) goto L21;
        if (parent.getLookaheadRoot$ui_release() != null) goto L16;
        LayoutNode.requestRemeasure$ui_release$default(parent, false, false, false, 3, null);
        goto L21
    L16:
        if (layoutNode.getMeasuredByParentInLookahead$ui_release() != LayoutNode.UsageByParent.InMeasureBlock) goto L19;
        LayoutNode.requestLookaheadRemeasure$ui_release$default(parent, false, false, false, 3, null);
        goto L21
    L19:
        if (layoutNode.getMeasuredByParentInLookahead$ui_release() != LayoutNode.UsageByParent.InLayoutBlock) goto L21;
        LayoutNode.requestLookaheadRelayout$ui_release$default(parent, false, 1, null);
    L21:
        return lookaheadSizeChanged;
    L8:
        lookaheadSizeChanged = LayoutNode.m5886lookaheadRemeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        goto L9
    }

    /* JADX INFO: renamed from: doRemeasure-sdFAvZA, reason: not valid java name */
    private final boolean m5923doRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        if (constraints == null) goto L5;
        boolean sizeChanged = layoutNode.m5894remeasure_Sx5XlM$ui_release(constraints);
    L6:
        LayoutNode parent = layoutNode.getParent$ui_release();
        if (sizeChanged == false) goto L15;
        if (parent == null) goto L15;
        if (layoutNode.getMeasuredByParent$ui_release() != LayoutNode.UsageByParent.InMeasureBlock) goto L13;
        LayoutNode.requestRemeasure$ui_release$default(parent, false, false, false, 3, null);
        goto L15
    L13:
        if (layoutNode.getMeasuredByParent$ui_release() != LayoutNode.UsageByParent.InLayoutBlock) goto L15;
        LayoutNode.requestRelayout$ui_release$default(parent, false, 1, null);
    L15:
        return sizeChanged;
    L5:
        sizeChanged = LayoutNode.m5887remeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean measureAndLayout$default(MeasureAndLayoutDelegate r0, Function0 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = null;
    L6:
        return r0.measureAndLayout(r1);
    }

    public final boolean measureAndLayout(Function0<Unit> r19) {
        MeasureAndLayoutDelegate r1 = this;
        boolean rootNodeResized = false;
        boolean value$iv$iv = this.root.isAttached();
        if (value$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
    L5:
        boolean value$iv$iv2 = this.root.isPlaced();
        if (value$iv$iv2 == true) goto L8;
        InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
    L8:
        boolean value$iv$iv3 = this.duringMeasureLayout;
        if ((!value$iv$iv3) == true) goto L12;
        InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
    L12:
        if (this.rootConstraints == null) goto L41;
        this.duringMeasureLayout = true;
        this.duringFullMeasureLayoutPass = true;
    L38:
        th = th;
    L39:
        this.duringMeasureLayout = false;
        this.duringFullMeasureLayoutPass = false;
        throw th;
    L15:
        if (r1.relayoutNodes.isNotEmpty() == false) goto L35;
        DepthSortedSetsForDifferentPasses this_$iv = r1.relayoutNodes;     // Catch: Throwable -> L38
        boolean rootNodeResized2 = false;
    L43:
    L33:
        th = th;
        goto L39
    L19:
        if (this_$iv.isNotEmpty() == false) goto L30;
        DepthSortedSet this_$iv$iv = DepthSortedSetsForDifferentPasses.access$getLookaheadSet$p(this_$iv);     // Catch: Throwable -> L33
        boolean affectsLookahead$iv = !this_$iv$iv.isEmpty();     // Catch: Throwable -> L33
        if (affectsLookahead$iv == false) goto L23;
        DepthSortedSet r2 = DepthSortedSetsForDifferentPasses.access$getLookaheadSet$p(this_$iv);     // Catch: Throwable -> L33
    L24:
        LayoutNode layoutNode = r2.pop();     // Catch: Throwable -> L33
        boolean sizeChanged = remeasureAndRelayoutIfNeeded$default(r1, layoutNode, affectsLookahead$iv, false, 4, null);     // Catch: Throwable -> L33
        if (layoutNode != access$getRoot$p(this)) goto L28;
        if (sizeChanged == false) goto L28;
        rootNodeResized2 = true;
    L28:
        r1 = this;
        goto L43
    L23:
        r2 = DepthSortedSetsForDifferentPasses.access$getSet$p(this_$iv);     // Catch: Throwable -> L33
        goto L24
    L30:
        if (r19 == null) goto L32;
        r19.invoke();     // Catch: Throwable -> L33
    L32:
        rootNodeResized = rootNodeResized2;
    L35:
        this.duringMeasureLayout = false;
        this.duringFullMeasureLayoutPass = false;
        LayoutTreeConsistencyChecker r0 = this.consistencyChecker;
        if (r0 == null) goto L41;
        r0.assertConsistent();
    L41:
        callOnLayoutCompletedListeners();
        return rootNodeResized;
    }

    public final void measureOnly() {
        if (this.relayoutNodes.isNotEmpty() == false) goto L31;
        boolean value$iv$iv = this.root.isAttached();
        if (value$iv$iv == true) goto L7;
        InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
    L7:
        boolean value$iv$iv2 = this.root.isPlaced();
        if (value$iv$iv2 == true) goto L10;
        InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
    L10:
        boolean value$iv$iv3 = this.duringMeasureLayout;
        if ((!value$iv$iv3) == true) goto L14;
        InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
    L14:
        if (this.rootConstraints == null) goto L34;
        this.duringMeasureLayout = true;
        this.duringFullMeasureLayoutPass = false;
    L27:
        th = move-exception;
        this.duringMeasureLayout = false;
        this.duringFullMeasureLayoutPass = false;
        throw th;
    L17:
        if (this.relayoutNodes.isEmpty(true) == true) goto L23;
        LayoutNode r6 = this.root.getLookaheadRoot$ui_release();     // Catch: Throwable -> L27
        LayoutNode r7 = this.root;
        if (r6 == null) goto L22;
        remeasureOnly(r7, true);     // Catch: Throwable -> L27
        goto L23
    L22:
        remeasureLookaheadRootsInSubtree(r7);     // Catch: Throwable -> L27
    L23:
        remeasureOnly(this.root, false);     // Catch: Throwable -> L27
        this.duringMeasureLayout = false;
        this.duringFullMeasureLayoutPass = false;
        LayoutTreeConsistencyChecker r3 = this.consistencyChecker;
        if (r3 == null) goto L35;
        r3.assertConsistent();
        return;
    L35:
        return;
    L34:
        return;
    }

    private final void remeasureLookaheadRootsInSubtree(LayoutNode layoutNode) {
        MutableVector<LayoutNode> r2 = layoutNode.get_children$ui_release();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r2.content;
        int size$iv$iv = r2.getSize();
    L3:
        if (i$iv$iv >= size$iv$iv) goto L12;
        LayoutNode it = (LayoutNode) content$iv$iv[i$iv$iv];
        if (getMeasureAffectsParent(it) == false) goto L10;
        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(it) == false) goto L9;
        remeasureOnly(it, true);
        goto L10
    L9:
        remeasureLookaheadRootsInSubtree(it);
    L10:
        i$iv$iv = i$iv$iv + 1;
        goto L3
    }

    /* JADX INFO: renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    public final void m5924measureAndLayout0kLqBqw(LayoutNode layoutNode, long constraints) {
        if (layoutNode.isDeactivated() == false) goto L5;
        return;
    L5:
        boolean value$iv = !Intrinsics.areEqual(layoutNode, this.root);
        if (value$iv == true) goto L8;
        InlineClassHelperKt.throwIllegalArgumentException("measureAndLayout called on root");
    L8:
        boolean value$iv$iv = this.root.isAttached();
        if (value$iv$iv == true) goto L11;
        InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
    L11:
        boolean value$iv$iv2 = this.root.isPlaced();
        if (value$iv$iv2 == true) goto L14;
        InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
    L14:
        boolean value$iv$iv3 = this.duringMeasureLayout;
        if ((!value$iv$iv3) == true) goto L18;
        InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
    L18:
        if (this.rootConstraints == null) goto L39;
        this.duringMeasureLayout = true;
        this.duringFullMeasureLayoutPass = false;
        this.relayoutNodes.remove(layoutNode);     // Catch: Throwable -> L36
        boolean lookaheadSizeChanged = m5922doLookaheadRemeasuresdFAvZA(layoutNode, Constraints.m6913boximpl(constraints));     // Catch: Throwable -> L36
        if (lookaheadSizeChanged == true) goto L25;
        if (layoutNode.getLookaheadLayoutPending$ui_release() == true) goto L25;
    L27:
        ensureSubtreeLookaheadReplaced(layoutNode);     // Catch: Throwable -> L36
        m5923doRemeasuresdFAvZA(layoutNode, Constraints.m6913boximpl(constraints));     // Catch: Throwable -> L36
        if (layoutNode.getLayoutPending$ui_release() == true) goto L30;
    L32:
        drainPostponedMeasureRequests();     // Catch: Throwable -> L36
        this.duringMeasureLayout = false;
        this.duringFullMeasureLayoutPass = false;
        LayoutTreeConsistencyChecker r1 = this.consistencyChecker;
        if (r1 == null) goto L39;
        r1.assertConsistent();
        goto L39
    L30:
        if (layoutNode.isPlaced() == false) goto L32;
        layoutNode.replace$ui_release();     // Catch: Throwable -> L36
        this.onPositionedDispatcher.onNodePositioned(layoutNode);     // Catch: Throwable -> L36
    L25:
        if (Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), true) == false) goto L27;
        layoutNode.lookaheadReplace$ui_release();     // Catch: Throwable -> L36
    L36:
        th = move-exception;
        this.duringMeasureLayout = false;
        this.duringFullMeasureLayoutPass = false;
        throw th;
    L39:
        callOnLayoutCompletedListeners();
    }

    private final void ensureSubtreeLookaheadReplaced(LayoutNode layoutNode) {
        MutableVector<LayoutNode> r2 = layoutNode.get_children$ui_release();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r2.content;
        int size$iv$iv = r2.getSize();
    L3:
        if (i$iv$iv >= size$iv$iv) goto L14;
        LayoutNode it = (LayoutNode) content$iv$iv[i$iv$iv];
        if (Intrinsics.areEqual(it.isPlacedInLookahead(), true) == false) goto L12;
        if (it.isDeactivated() == true) goto L12;
        if (this.relayoutNodes.contains(it, true) == false) goto L11;
        it.lookaheadReplace$ui_release();
    L11:
        ensureSubtreeLookaheadReplaced(it);
    L12:
        i$iv$iv = i$iv$iv + 1;
        goto L3
    }

    private final void performMeasureAndLayout(boolean fullPass, Function0<Unit> r7) {
        boolean value$iv = this.root.isAttached();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
    L5:
        boolean value$iv2 = this.root.isPlaced();
        if (value$iv2 == true) goto L8;
        InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
    L8:
        boolean value$iv3 = this.duringMeasureLayout;
        if ((!value$iv3) == true) goto L12;
        InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
    L12:
        if (this.rootConstraints == null) goto L21;
        this.duringMeasureLayout = true;
        this.duringFullMeasureLayoutPass = fullPass;
        r7.invoke();     // Catch: Throwable -> L18
        this.duringMeasureLayout = false;
        this.duringFullMeasureLayoutPass = false;
        LayoutTreeConsistencyChecker r1 = this.consistencyChecker;
        if (r1 == null) goto L24;
        r1.assertConsistent();
        return;
    L24:
        return;
    L18:
        th = move-exception;
        this.duringMeasureLayout = false;
        this.duringFullMeasureLayoutPass = false;
        throw th;
    }

    public final void registerOnLayoutCompletedListener(Owner.OnLayoutCompletedListener listener) {
        this.onLayoutCompletedListeners.add(listener);
    }

    private final void callOnLayoutCompletedListeners() {
        MutableVector<Owner.OnLayoutCompletedListener> r0 = this.onLayoutCompletedListeners;
        int i$iv = 0;
        Object[] content$iv = r0.content;
        int size$iv = r0.getSize();
    L3:
        if (i$iv >= size$iv) goto L5;
        Owner.OnLayoutCompletedListener it = (Owner.OnLayoutCompletedListener) content$iv[i$iv];
        it.onLayoutComplete();
        i$iv = i$iv + 1;
        goto L3
    L5:
        this.onLayoutCompletedListeners.clear();
    }

    static /* synthetic */ boolean remeasureAndRelayoutIfNeeded$default(MeasureAndLayoutDelegate r1, LayoutNode r2, boolean r3, boolean r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r3 = true;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r4 = true;
    L9:
        return r1.remeasureAndRelayoutIfNeeded(r2, r3, r4);
    }

    private final boolean remeasureAndRelayoutIfNeeded(LayoutNode layoutNode, boolean affectsLookahead, boolean relayoutNeeded) {
        boolean sizeChanged = false;
        if (layoutNode.isDeactivated() == false) goto L5;
        return false;
    L5:
        boolean isPlacedByPlacedParent = true;
        if (layoutNode.isPlaced() == true) goto L18;
        if (layoutNode.isPlacedByParent() == true) goto L18;
        if (getCanAffectPlacedParent(layoutNode) == true) goto L18;
        if (Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), true) == true) goto L18;
        if (getCanAffectParentInLookahead(layoutNode) == true) goto L18;
        if (layoutNode.getAlignmentLinesRequired$ui_release() == true) goto L18;
    L62:
        return sizeChanged;
    L18:
        if (layoutNode != this.root) goto L20;
        Constraints constraints = this.rootConstraints;
        Intrinsics.checkNotNull(constraints);
    L21:
        if (affectsLookahead == false) goto L33;
        if (layoutNode.getLookaheadMeasurePending$ui_release() == false) goto L25;
        sizeChanged = m5922doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
    L25:
        if (relayoutNeeded == false) goto L61;
        if (sizeChanged == true) goto L30;
        if (layoutNode.getLookaheadLayoutPending$ui_release() == false) goto L61;
    L30:
        if (Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), true) == false) goto L61;
        layoutNode.lookaheadReplace$ui_release();
    L61:
        drainPostponedMeasureRequests();
        goto L62
    L33:
        if (layoutNode.getMeasurePending$ui_release() == false) goto L35;
        sizeChanged = m5923doRemeasuresdFAvZA(layoutNode, constraints);
    L35:
        if (relayoutNeeded == false) goto L61;
        if (layoutNode.getLayoutPending$ui_release() == false) goto L61;
        if (layoutNode == this.root) goto L53;
        LayoutNode r4 = layoutNode.getParent$ui_release();
        if (r4 != null) goto L43;
    L45:
        boolean r5 = false;
    L46:
        if (r5 == true) goto L48;
    L50:
        isPlacedByPlacedParent = false;
        goto L53
    L48:
        if (layoutNode.isPlacedByParent() == false) goto L50;
    L43:
        if (r4.isPlaced() != true) goto L45;
        r5 = true;
    L53:
        if (isPlacedByPlacedParent == false) goto L61;
        if (layoutNode != this.root) goto L57;
        layoutNode.place$ui_release(0, 0);
    L58:
        this.onPositionedDispatcher.onNodePositioned(layoutNode);
        LayoutNodeKt.requireOwner(layoutNode).getRectManager().invalidateCallbacksFor(layoutNode);
        LayoutTreeConsistencyChecker r2 = this.consistencyChecker;
        if (r2 == null) goto L61;
        r2.assertConsistent();
        goto L61
    L57:
        layoutNode.replace$ui_release();
        goto L58
    L20:
        constraints = null;
        goto L21
    }

    private final void drainPostponedMeasureRequests() {
        if (this.postponedMeasureRequests.getSize() == 0) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == false) goto L22;
        MutableVector<PostponedRequest> r1 = this.postponedMeasureRequests;
        int i$iv = 0;
        Object[] content$iv = r1.content;
        int size$iv = r1.getSize();
    L8:
        if (i$iv >= size$iv) goto L16;
        PostponedRequest request = (PostponedRequest) content$iv[i$iv];
        if (request.getNode().isAttached() == false) goto L15;
        if (request.isLookahead() == true) goto L14;
        LayoutNode.requestRemeasure$ui_release$default(request.getNode(), request.isForced(), false, false, 2, null);
        goto L15
    L14:
        LayoutNode.requestLookaheadRemeasure$ui_release$default(request.getNode(), request.isForced(), false, false, 2, null);
    L15:
        i$iv = i$iv + 1;
        goto L8
    L16:
        this.postponedMeasureRequests.clear();
        return;
    L22:
        return;
    L5:
        r3 = false;
        goto L6
    }

    private final void remeasureOnly(LayoutNode layoutNode, boolean affectsLookahead) {
        if (layoutNode.isDeactivated() == false) goto L6;
        return;
    L6:
        if (layoutNode != this.root) goto L8;
        Constraints constraints = this.rootConstraints;
        Intrinsics.checkNotNull(constraints);
    L9:
        if (affectsLookahead == false) goto L11;
        m5922doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
        return;
    L11:
        m5923doRemeasuresdFAvZA(layoutNode, constraints);
        return;
    L8:
        constraints = null;
        goto L9
    }

    public final void forceMeasureTheSubtree(LayoutNode layoutNode, boolean affectsLookahead) {
        boolean value$iv = this.duringMeasureLayout;
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
    L5:
        boolean value$iv2 = measurePending(layoutNode, affectsLookahead);
        if ((!value$iv2) == true) goto L8;
        InlineClassHelperKt.throwIllegalArgumentException("node not yet measured");
    L8:
        forceMeasureTheSubtreeInternal(layoutNode, affectsLookahead);
    }

    private final void onlyRemeasureIfPending(LayoutNode node, boolean affectsLookahead) {
        if (measurePending(node, affectsLookahead) == false) goto L6;
        remeasureAndRelayoutIfNeeded(node, affectsLookahead, false);
        return;
    }

    private final void forceMeasureTheSubtreeInternal(LayoutNode layoutNode, boolean affectsLookahead) {
        MutableVector<LayoutNode> r2 = layoutNode.get_children$ui_release();
        int i$iv$iv = 0;
        Object[] content$iv$iv = r2.content;
        int size$iv$iv = r2.getSize();
    L3:
        if (i$iv$iv >= size$iv$iv) goto L24;
        LayoutNode child = (LayoutNode) content$iv$iv[i$iv$iv];
        if (affectsLookahead == false) goto L7;
    L8:
        if (affectsLookahead == false) goto L23;
        if (getMeasureAffectsParentLookahead(child) == false) goto L23;
    L12:
        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(child) == false) goto L20;
        if (affectsLookahead == true) goto L20;
        if (child.getLookaheadMeasurePending$ui_release() == true) goto L17;
    L19:
        forceMeasureTheSubtree(child, true);
        goto L20
    L17:
        if (this.relayoutNodes.contains(child, true) == false) goto L19;
        remeasureAndRelayoutIfNeeded(child, true, false);
    L20:
        onlyRemeasureIfPending(child, affectsLookahead);
        if (measurePending(child, affectsLookahead) == true) goto L23;
        forceMeasureTheSubtreeInternal(child, affectsLookahead);
    L23:
        i$iv$iv = i$iv$iv + 1;
        goto L3
    L7:
        if (getMeasureAffectsParent(child) == true) goto L12;
    L24:
        onlyRemeasureIfPending(layoutNode, affectsLookahead);
    }

    public static /* synthetic */ void dispatchOnPositionedCallbacks$default(MeasureAndLayoutDelegate r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = false;
    L5:
        r0.dispatchOnPositionedCallbacks(r1);
    }

    public final void dispatchOnPositionedCallbacks(boolean forceDispatch) {
        if (forceDispatch == false) goto L4;
        this.onPositionedDispatcher.onRootNodePositioned(this.root);
    L4:
        this.onPositionedDispatcher.dispatch();
    }

    public final void onNodeDetached(LayoutNode node) {
        this.relayoutNodes.remove(node);
        this.onPositionedDispatcher.remove(node);
    }

    private final boolean getMeasureAffectsParent(LayoutNode $this$measureAffectsParent) {
        if ($this$measureAffectsParent.getMeasuredByParent$ui_release() != LayoutNode.UsageByParent.InMeasureBlock) goto L5;
    L8:
        return true;
    L5:
        if ($this$measureAffectsParent.getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release() == true) goto L8;
        return false;
    }

    private final boolean getMeasureAffectsPlacedParent(LayoutNode $this$measureAffectsPlacedParent) {
        LayoutNode node = $this$measureAffectsPlacedParent;
    L4:
        if (getMeasureAffectsParent(node) == true) goto L13;
        LayoutNode r1 = node.getParent$ui_release();
        if (r1 == null) goto L8;
        LayoutNode.LayoutState r2 = r1.getLayoutState$ui_release();
    L10:
        if (r2 == LayoutNode.LayoutState.Measuring) goto L13;
        return false;
    L8:
        r2 = null;
    L13:
        LayoutNode parent = node.getParent$ui_release();
        if (parent == null) goto L15;
        if (parent.isPlaced() == true) goto L18;
        node = parent;
        goto L4
    L18:
        return true;
    L15:
        return false;
    }

    private final boolean getCanAffectPlacedParent(LayoutNode $this$canAffectPlacedParent) {
        if ($this$canAffectPlacedParent.getMeasurePending$ui_release() == true) goto L5;
    L7:
        return false;
    L5:
        if (getMeasureAffectsPlacedParent($this$canAffectPlacedParent) == false) goto L7;
        return true;
    }

    private final boolean getCanAffectParentInLookahead(LayoutNode $this$canAffectParentInLookahead) {
        if ($this$canAffectParentInLookahead.getLookaheadMeasurePending$ui_release() == true) goto L5;
    L7:
        return false;
    L5:
        if (getMeasureAffectsParentLookahead($this$canAffectParentInLookahead) == false) goto L7;
        return true;
    }

    private final boolean getMeasureAffectsParentLookahead(LayoutNode $this$measureAffectsParentLookahead) {
        if ($this$measureAffectsParentLookahead.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) goto L17;
        AlignmentLinesOwner r0 = $this$measureAffectsParentLookahead.getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
        if (r0 == null) goto L11;
        AlignmentLines r1 = r0.getAlignmentLines();
        if (r1 == null) goto L11;
        if (r1.getRequired$ui_release() != true) goto L11;
        boolean r2 = true;
    L12:
        if (r2 == false) goto L16;
        return true;
    L16:
        return false;
    L11:
        r2 = false;
        goto L12
    L17:
        return true;
    }

    private final boolean measurePending(LayoutNode $this$measurePending, boolean affectsLookahead) {
        if (affectsLookahead == false) goto L5;
        return $this$measurePending.getLookaheadMeasurePending$ui_release();
    L5:
        return $this$measurePending.getMeasurePending$ui_release();
    }
}
