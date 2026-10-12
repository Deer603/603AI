package androidx.compose.ui.focus;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
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
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: FocusInvalidationManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0018\u001a\u00020\u0017J\b\u0010\u0019\u001a\u00020\u0005H\u0002J\b\u0010\u001a\u001a\u00020\u0005H\u0002J\b\u0010\u001b\u001a\u00020\u0005H\u0002J\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u000eJ\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0012J\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\nJ\u0006\u0010\u001e\u001a\u00020\u0005J\b\u0010\u001f\u001a\u00020\u0005H\u0002J%\u0010\u001c\u001a\u00020\u0005\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\r2\u0006\u0010\u001d\u001a\u0002H H\u0002¢\u0006\u0002\u0010!J%\u0010\"\u001a\u00020\u0005\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00102\u0006\u0010\u001d\u001a\u0002H H\u0002¢\u0006\u0002\u0010#R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Landroidx/compose/ui/focus/FocusInvalidationManager;", "", "onRequestApplyChangesListener", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "invalidateOwnerFocusState", "rootFocusStateFetcher", "Landroidx/compose/ui/focus/FocusState;", "activeFocusTargetNodeFetcher", "Landroidx/compose/ui/focus/FocusTargetNode;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "focusEventNodes", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "focusEventNodesLegacy", "", "focusPropertiesNodesLegacy", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "focusTargetNodes", "focusTargetNodesLegacy", "focusTargetsWithInvalidatedFocusEventsLegacy", "isInvalidationScheduled", "", "hasPendingInvalidation", "invalidateNodes", "invalidateNodesLegacy", "invalidateNodesOptimized", "scheduleInvalidation", "node", "scheduleInvalidationForOwner", "setUpOnRequestApplyChangesListener", "T", "(Landroidx/collection/MutableScatterSet;Ljava/lang/Object;)V", "scheduleInvalidationLegacy", "(Ljava/util/List;Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FocusInvalidationManager {
    public static final int $stable = 0;
    private final Function0<FocusTargetNode> activeFocusTargetNodeFetcher;
    private final MutableScatterSet<FocusEventModifierNode> focusEventNodes;
    private final List<FocusEventModifierNode> focusEventNodesLegacy;
    private final List<FocusPropertiesModifierNode> focusPropertiesNodesLegacy;
    private final MutableScatterSet<FocusTargetNode> focusTargetNodes;
    private final List<FocusTargetNode> focusTargetNodesLegacy;
    private final List<FocusTargetNode> focusTargetsWithInvalidatedFocusEventsLegacy;
    private final Function0<Unit> invalidateOwnerFocusState;
    private boolean isInvalidationScheduled;
    private final Function1<Function0<Unit>, Unit> onRequestApplyChangesListener;
    private final Function0<FocusState> rootFocusStateFetcher;

    /* JADX INFO: renamed from: androidx.compose.ui.focus.FocusInvalidationManager$scheduleInvalidationLegacy$1, reason: invalid class name */
    /* JADX INFO: compiled from: FocusInvalidationManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
        AnonymousClass1(Object r8) {
            super(0, r8, FocusInvalidationManager.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            FocusInvalidationManager.access$invalidateNodes((FocusInvalidationManager) this.receiver);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.focus.FocusInvalidationManager$setUpOnRequestApplyChangesListener$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FocusInvalidationManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class C06291 extends FunctionReferenceImpl implements Function0<Unit> {
        C06291(Object r8) {
            super(0, r8, FocusInvalidationManager.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            FocusInvalidationManager.access$invalidateNodes((FocusInvalidationManager) this.receiver);
        }
    }

    static {
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FocusInvalidationManager(Function1<? super Function0<Unit>, Unit> r2, Function0<Unit> r3, Function0<? extends FocusState> r4, Function0<FocusTargetNode> r5) {
        this.onRequestApplyChangesListener = r2;
        this.invalidateOwnerFocusState = r3;
        this.rootFocusStateFetcher = r4;
        this.activeFocusTargetNodeFetcher = r5;
        this.focusTargetNodes = ScatterSetKt.mutableScatterSetOf();
        this.focusEventNodes = ScatterSetKt.mutableScatterSetOf();
        this.focusTargetNodesLegacy = new ArrayList();
        this.focusEventNodesLegacy = new ArrayList();
        this.focusPropertiesNodesLegacy = new ArrayList();
        this.focusTargetsWithInvalidatedFocusEventsLegacy = new ArrayList();
    }

    public static final /* synthetic */ void access$invalidateNodes(FocusInvalidationManager $this) {
        $this.invalidateNodes();
    }

    public final void scheduleInvalidation(FocusTargetNode node) {
        if (ComposeUiFlags.isTrackFocusEnabled == false) goto L5;
        scheduleInvalidation(this.focusTargetNodes, node);
        return;
    L5:
        scheduleInvalidationLegacy(this.focusTargetNodesLegacy, node);
    }

    public final void scheduleInvalidation(FocusEventModifierNode node) {
        if (ComposeUiFlags.isTrackFocusEnabled == false) goto L5;
        scheduleInvalidation(this.focusEventNodes, node);
        return;
    L5:
        scheduleInvalidationLegacy(this.focusEventNodesLegacy, node);
    }

    public final void scheduleInvalidation(FocusPropertiesModifierNode node) {
        scheduleInvalidationLegacy(this.focusPropertiesNodesLegacy, node);
    }

    public final void scheduleInvalidationForOwner() {
        setUpOnRequestApplyChangesListener();
    }

    public final boolean hasPendingInvalidation() {
        if (ComposeUiFlags.isTrackFocusEnabled == false) goto L6;
        return this.isInvalidationScheduled;
    L6:
        if (this.focusTargetNodesLegacy.isEmpty() == true) goto L8;
    L13:
        return true;
    L8:
        if (this.focusPropertiesNodesLegacy.isEmpty() == false) goto L13;
        if (this.focusEventNodesLegacy.isEmpty() == false) goto L13;
        return false;
    }

    private final <T> void scheduleInvalidation(MutableScatterSet<T> r2, T r3) {
        if (r2.add(r3) == false) goto L6;
        setUpOnRequestApplyChangesListener();
        return;
    }

    private final void setUpOnRequestApplyChangesListener() {
        if (this.isInvalidationScheduled == true) goto L6;
        this.onRequestApplyChangesListener.invoke(new C06291(this));
        this.isInvalidationScheduled = true;
        return;
    }

    private final <T> void scheduleInvalidationLegacy(List<T> r3, T r4) {
        if (r3.add(r4) == true) goto L5;
        return;
    L5:
        if (((this.focusTargetNodesLegacy.size() + this.focusEventNodesLegacy.size()) + this.focusPropertiesNodesLegacy.size()) != 1) goto L9;
        this.onRequestApplyChangesListener.invoke(new AnonymousClass1(this));
        return;
    }

    private final void invalidateNodes() {
        if (ComposeUiFlags.isTrackFocusEnabled == false) goto L5;
        invalidateNodesOptimized();
        return;
    L5:
        invalidateNodesLegacy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void invalidateNodesOptimized() {
        FocusTargetNode activeFocusTargetNode = this.activeFocusTargetNodeFetcher.invoke();
        int r10 = 8;
        if (activeFocusTargetNode != null) goto L27;
        ScatterSet this_$iv = this.focusEventNodes;
        Object[] elements$iv = this_$iv.elements;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L93;
    L6:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int r8 = 1;
        ScatterSet this_$iv2 = this_$iv;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L22;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L9:
        if (j$iv$iv >= bitCount$iv$iv) goto L19;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L13;
        int $i$f$isFull = r8;
    L14:
        if ($i$f$isFull == 0) goto L17;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        FocusEventModifierNode it = (FocusEventModifierNode) elements$iv[index$iv$iv];
        it.onFocusEvent(FocusStateImpl.Inactive);
    L17:
        slot$iv$iv = slot$iv$iv >> 8;
        j$iv$iv = j$iv$iv + 1;
        r8 = r8;
        goto L9
    L13:
        $i$f$isFull = 0;
        goto L14
    L19:
        if (bitCount$iv$iv != 8) goto L93;
    L22:
        if (i$iv$iv == lastIndex$iv$iv) goto L93;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
    L93:
        this.invalidateOwnerFocusState.invoke();
        this.focusTargetNodes.clear();
        this.focusEventNodes.clear();
        this.isInvalidationScheduled = false;
        return;
    L27:
        int r28 = 1;
        if (activeFocusTargetNode.isAttached() == false) goto L93;
        if (this.focusTargetNodes.contains(activeFocusTargetNode) == false) goto L32;
        activeFocusTargetNode.invalidateFocus$ui_release();
    L32:
        FocusStateImpl activeFocusTargetNodeState = activeFocusTargetNode.getFocusState();
        int traversedFocusTargetCount = 0;
        FocusTargetNode $this$visitAncestors$iv = activeFocusTargetNode;
        int r6 = 1024;
        int mask$iv = NodeKind.m5976constructorimpl(1024) | NodeKind.m5976constructorimpl(4096);
        boolean value$iv$iv = $this$visitAncestors$iv.getNode().isAttached();
        if (value$iv$iv == true) goto L35;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L35:
        Modifier.Node node$iv = $this$visitAncestors$iv.getNode();
        LayoutNode layout$iv = DelegatableNodeKt.requireLayoutNode($this$visitAncestors$iv);
    L36:
        if (layout$iv == null) goto L68;
        Modifier.Node head$iv = layout$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv.getAggregateChildKindSet$ui_release() & mask$iv) == 0) goto L61;
    L39:
        if (node$iv == null) goto L61;
        if ((node$iv.getKindSet$ui_release() & mask$iv) == 0) goto L60;
        Modifier.Node r13 = node$iv;
        if ((r13.getKindSet$ui_release() & NodeKind.m5976constructorimpl(r6)) == 0) goto L45;
        int kind$iv = r28;
    L46:
        if (kind$iv == 0) goto L49;
        traversedFocusTargetCount = traversedFocusTargetCount + 1;
    L49:
        if ((r13 instanceof FocusEventModifierNode) == false) goto L60;
        if (this.focusEventNodes.contains(r13) == false) goto L60;
        if (traversedFocusTargetCount > r28) goto L56;
        ((FocusEventModifierNode) r13).onFocusEvent(activeFocusTargetNodeState);
    L57:
        this.focusEventNodes.remove(r13);
        goto L60
    L56:
        ((FocusEventModifierNode) r13).onFocusEvent(FocusStateImpl.ActiveParent);
        goto L57
    L45:
        kind$iv = 0;
    L60:
        node$iv = node$iv.getParent$ui_release();
        r6 = 1024;
        r28 = 1;
    L61:
        layout$iv = layout$iv.getParent$ui_release();
        if (layout$iv == null) goto L66;
        NodeChain r7 = layout$iv.getNodes$ui_release();
        if (r7 == null) goto L66;
        Modifier.Node r9 = r7.getTail$ui_release();
    L67:
        node$iv = r9;
        r6 = 1024;
        r28 = 1;
    L66:
        r9 = null;
        goto L67
    L68:
        ScatterSet this_$iv3 = this.focusEventNodes;
        Object[] elements$iv2 = this_$iv3.elements;
        long[] m$iv$iv2 = this_$iv3.metadata;
        int lastIndex$iv$iv2 = m$iv$iv2.length - 2;
        int i$iv$iv2 = 0;
        if (0 > lastIndex$iv$iv2) goto L93;
    L70:
        long slot$iv$iv2 = m$iv$iv2[i$iv$iv2];
        int r22 = r10;
        int lastIndex$iv$iv3 = lastIndex$iv$iv2;
        FocusTargetNode activeFocusTargetNode2 = activeFocusTargetNode;
        FocusStateImpl activeFocusTargetNodeState2 = activeFocusTargetNodeState;
        if (((((~slot$iv$iv2) << 7) & slot$iv$iv2) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L85;
        int bitCount$iv$iv2 = 8 - ((~(i$iv$iv2 - lastIndex$iv$iv3)) >>> 31);
        int j$iv$iv2 = 0;
    L73:
        if (j$iv$iv2 >= bitCount$iv$iv2) goto L82;
        long value$iv$iv$iv2 = slot$iv$iv2 & 255;
        if (value$iv$iv$iv2 >= 128) goto L77;
        int $i$f$isFull2 = 1;
    L78:
        if ($i$f$isFull2 == 0) goto L81;
        int index$iv$iv2 = (i$iv$iv2 << 3) + j$iv$iv2;
        FocusEventModifierNode it2 = (FocusEventModifierNode) elements$iv2[index$iv$iv2];
        it2.onFocusEvent(FocusStateImpl.Inactive);
    L81:
        slot$iv$iv2 = slot$iv$iv2 >> r22;
        j$iv$iv2 = j$iv$iv2 + 1;
        goto L73
    L77:
        $i$f$isFull2 = 0;
        goto L78
    L82:
        int j$iv$iv3 = r22;
        if (bitCount$iv$iv2 != j$iv$iv3) goto L93;
    L86:
        lastIndex$iv$iv2 = lastIndex$iv$iv3;
        if (i$iv$iv2 == lastIndex$iv$iv2) goto L93;
        i$iv$iv2 = i$iv$iv2 + 1;
        r10 = j$iv$iv3;
        activeFocusTargetNode = activeFocusTargetNode2;
        activeFocusTargetNodeState = activeFocusTargetNodeState2;
        goto L70
    L85:
        j$iv$iv3 = r22;
        goto L86
    }

    private final void invalidateNodesLegacy() {
        if (this.rootFocusStateFetcher.invoke().getHasFocus() == true) goto L17;
        List<FocusEventModifierNode> r1 = this.focusEventNodesLegacy;
        int index$iv = 0;
        int r4 = r1.size();
    L5:
        if (index$iv >= r4) goto L7;
        Object item$iv = r1.get(index$iv);
        ((FocusEventModifierNode) item$iv).onFocusEvent(FocusStateImpl.Inactive);
        index$iv = index$iv + 1;
        goto L5
    L7:
        List<FocusTargetNode> r2 = this.focusTargetNodesLegacy;
        int index$iv2 = 0;
        int r5 = r2.size();
    L8:
        if (index$iv2 >= r5) goto L15;
        Object item$iv2 = r2.get(index$iv2);
        FocusTargetNode node = (FocusTargetNode) item$iv2;
        if (node.isAttached() == false) goto L14;
        if (node.isInitialized$ui_release() == true) goto L14;
        node.initializeFocusState$ui_release(FocusStateImpl.Inactive);
    L14:
        index$iv2 = index$iv2 + 1;
        goto L8
    L15:
        this.focusTargetNodesLegacy.clear();
        this.focusEventNodesLegacy.clear();
        this.focusPropertiesNodesLegacy.clear();
        this.focusTargetsWithInvalidatedFocusEventsLegacy.clear();
        this.invalidateOwnerFocusState.invoke();
        return;
    L17:
        List<FocusPropertiesModifierNode> r3 = this.focusPropertiesNodesLegacy;
        int $i$f$fastForEach = 0;
        int index$iv3 = 0;
        int r6 = r3.size();
    L18:
        int r7 = 1024;
        if (index$iv3 >= r6) goto L129;
        DelegatableNode item$iv3 = r3.get(index$iv3);
        DelegatableNode it = (FocusPropertiesModifierNode) item$iv3;
        if (it.getNode().isAttached() == false) goto L127;
        DelegatableNode $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv = it;
        int type$iv = NodeKind.m5976constructorimpl(1024);
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv.getNode();
        MutableVector r17 = null;
        Modifier.Node r8 = $this$dispatchForKind_u2d6rFNWt0$iv$iv;
    L23:
        if (r8 == null) goto L63;
        if ((r8 instanceof FocusTargetNode) == true) goto L26;
        List<FocusPropertiesModifierNode> r21 = r3;
        Modifier.Node this_$iv$iv$iv = r8;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L30;
        boolean r9 = true;
    L31:
        if (r9 == false) goto L61;
        if ((r8 instanceof DelegatingNode) == false) goto L61;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r8;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L35:
        if (node$iv$iv$iv == null) goto L58;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L39;
        boolean r25 = true;
    L40:
        if (r25 == false) goto L56;
        count$iv$iv = count$iv$iv + 1;
        int $i$f$fastForEach2 = $i$f$fastForEach;
        if (count$iv$iv != 1) goto L44;
        r8 = next$iv$iv;
        index$iv3 = index$iv3;
    L57:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        $i$f$fastForEach = $i$f$fastForEach2;
        index$iv3 = index$iv3;
        goto L35
    L44:
        if (r17 != null) goto L46;
        MutableVector r10 = new MutableVector(new Modifier.Node[16], 0);
    L47:
        Modifier.Node theNode$iv$iv = r8;
        if (theNode$iv$iv == null) goto L52;
        if (r10 == null) goto L51;
        Boolean.valueOf(r10.add(theNode$iv$iv));
    L51:
        r8 = null;
    L52:
        if (r10 == null) goto L55;
        Boolean.valueOf(r10.add(next$iv$iv));
    L55:
        r17 = r10;
        count$iv$iv = count$iv$iv;
        goto L57
    L46:
        r10 = r17;
        goto L47
    L56:
        $i$f$fastForEach2 = $i$f$fastForEach;
        index$iv3 = index$iv3;
        goto L57
    L39:
        r25 = false;
        goto L40
    L58:
        int $i$f$fastForEach3 = $i$f$fastForEach;
        int index$iv4 = index$iv3;
        if (count$iv$iv != 1) goto L62;
        r3 = r21;
        $i$f$fastForEach = $i$f$fastForEach3;
        index$iv3 = index$iv4;
    L62:
        r8 = DelegatableNodeKt.access$pop(r17);
        r3 = r21;
        $i$f$fastForEach = $i$f$fastForEach3;
        index$iv3 = index$iv4;
    L61:
        $i$f$fastForEach3 = $i$f$fastForEach;
        index$iv4 = index$iv3;
        goto L62
    L30:
        r9 = false;
        goto L31
    L26:
        FocusTargetNode focusTarget = (FocusTargetNode) r8;
        r21 = r3;
        this.focusTargetNodesLegacy.add(focusTarget);
        $i$f$fastForEach3 = $i$f$fastForEach;
        index$iv4 = index$iv3;
        goto L62
    L63:
        List<FocusPropertiesModifierNode> r22 = r3;
        int $i$f$fastForEach4 = $i$f$fastForEach;
        int index$iv5 = index$iv3;
        int $i$f$visitChildren = 0;
        boolean value$iv$iv$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L66;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L66:
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv.getNode().getChild$ui_release();
        if (child$iv$iv != null) goto L69;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv.getNode(), false);
    L71:
        if (branches$iv$iv.getSize() == 0) goto L73;
        boolean r11 = true;
    L74:
        if (r11 == false) goto L128;
        Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(branches$iv$iv.getSize() - 1);
        if ((branch$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L77;
        Modifier.Node node$iv$iv = branch$iv$iv;
    L79:
        if (node$iv$iv == null) goto L71;
        if ((node$iv$iv.getKindSet$ui_release() & type$iv) != 0) goto L82;
        node$iv$iv = node$iv$iv.getChild$ui_release();
        goto L79
    L82:
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r23 = null;
        Modifier.Node child$iv$iv2 = child$iv$iv;
        Modifier.Node theNode$iv$iv2 = it$iv;
    L83:
        if (theNode$iv$iv2 == null) goto L123;
        branch$iv$iv = branch$iv$iv;
        if ((theNode$iv$iv2 instanceof FocusTargetNode) == true) goto L86;
        int $i$f$visitChildren2 = $i$f$visitChildren;
        Modifier.Node this_$iv$iv$iv3 = theNode$iv$iv2;
        if ((this_$iv$iv$iv3.getKindSet$ui_release() & type$iv) == 0) goto L90;
        boolean r12 = true;
    L91:
        if (r12 == false) goto L122;
        if ((theNode$iv$iv2 instanceof DelegatingNode) == false) goto L122;
        int count$iv$iv2 = 0;
        DelegatingNode this_$iv$iv$iv4 = (DelegatingNode) theNode$iv$iv2;
        Modifier.Node node$iv$iv$iv2 = this_$iv$iv$iv4.getDelegate$ui_release();
    L95:
        if (node$iv$iv$iv2 == null) goto L118;
        Modifier.Node next$iv$iv2 = node$iv$iv$iv2;
        if ((next$iv$iv2.getKindSet$ui_release() & type$iv) == 0) goto L99;
        boolean r33 = true;
    L100:
        if (r33 == false) goto L116;
        count$iv$iv2 = count$iv$iv2 + 1;
        Modifier.Node r34 = theNode$iv$iv2;
        if (count$iv$iv2 != 1) goto L104;
        theNode$iv$iv2 = next$iv$iv2;
        this_$iv$iv$iv4 = this_$iv$iv$iv4;
    L117:
        node$iv$iv$iv2 = node$iv$iv$iv2.getChild$ui_release();
        this_$iv$iv$iv4 = this_$iv$iv$iv4;
        goto L95
    L104:
        if (r23 != null) goto L106;
        MutableVector r13 = new MutableVector(new Modifier.Node[16], 0);
    L108:
        if (r34 == null) goto L112;
        if (r13 == null) goto L111;
        Boolean.valueOf(r13.add(r34));
    L111:
        r34 = null;
    L112:
        if (r13 == null) goto L115;
        Boolean.valueOf(r13.add(next$iv$iv2));
    L115:
        r23 = r13;
        theNode$iv$iv2 = r34;
        count$iv$iv2 = count$iv$iv2;
        goto L117
    L106:
        r13 = r23;
        goto L108
    L116:
        this_$iv$iv$iv4 = this_$iv$iv$iv4;
        goto L117
    L99:
        r33 = false;
        goto L100
    L118:
        Modifier.Node r35 = theNode$iv$iv2;
        if (count$iv$iv2 != 1) goto L122;
        $i$f$visitChildren = $i$f$visitChildren2;
        theNode$iv$iv2 = r35;
    L122:
        theNode$iv$iv2 = DelegatableNodeKt.access$pop(r23);
        $i$f$visitChildren = $i$f$visitChildren2;
        goto L83
    L90:
        r12 = false;
        goto L91
    L86:
        FocusTargetNode focusTarget2 = (FocusTargetNode) theNode$iv$iv2;
        $i$f$visitChildren2 = $i$f$visitChildren;
        this.focusTargetNodesLegacy.add(focusTarget2);
        goto L122
    L123:
        child$iv$iv = child$iv$iv2;
        goto L71
    L77:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, branch$iv$iv, false);
    L128:
        index$iv3 = index$iv5 + 1;
        r3 = r22;
        $i$f$fastForEach = $i$f$fastForEach4;
        goto L18
    L73:
        r11 = false;
        goto L74
    L69:
        branches$iv$iv.add(child$iv$iv);
        goto L71
    L127:
        r22 = r3;
        $i$f$fastForEach4 = $i$f$fastForEach;
        index$iv5 = index$iv3;
        goto L128
    L129:
        this.focusPropertiesNodesLegacy.clear();
        List<FocusEventModifierNode> r14 = this.focusEventNodesLegacy;
        int $i$f$fastForEach5 = 0;
        int index$iv6 = 0;
        int r15 = r14.size();
    L130:
        if (index$iv6 >= r15) goto L266;
        Object item$iv4 = r14.get(index$iv6);
        FocusEventModifierNode focusEventNode = (FocusEventModifierNode) item$iv4;
        if (focusEventNode.getNode().isAttached() == true) goto L134;
        focusEventNode.onFocusEvent(FocusStateImpl.Inactive);
        List<FocusEventModifierNode> r24 = r14;
        int $i$f$fastForEach6 = $i$f$fastForEach5;
        int index$iv7 = index$iv6;
    L265:
        index$iv6 = index$iv7 + 1;
        r14 = r24;
        $i$f$fastForEach5 = $i$f$fastForEach6;
        r7 = 1024;
        goto L130
    L134:
        boolean requiresUpdate = true;
        boolean aggregatedNode = false;
        FocusTargetNode r16 = null;
        FocusEventModifierNode $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2 = focusEventNode;
        int r18 = NodeKind.m5976constructorimpl(r7);
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv$iv2 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2.getNode();
        MutableVector r26 = null;
        Modifier.Node r19 = $this$dispatchForKind_u2d6rFNWt0$iv$iv2;
    L135:
        if (r19 == null) goto L182;
        r14 = r14;
        if ((r19 instanceof FocusTargetNode) == true) goto L138;
        int $i$f$fastForEach7 = $i$f$fastForEach5;
        Modifier.Node this_$iv$iv$iv5 = r19;
        if ((this_$iv$iv$iv5.getKindSet$ui_release() & r18) == 0) goto L149;
        boolean r20 = true;
    L150:
        if (r20 == false) goto L180;
        if ((r19 instanceof DelegatingNode) == false) goto L180;
        int count$iv$iv3 = 0;
        DelegatingNode this_$iv$iv$iv6 = (DelegatingNode) r19;
        Modifier.Node node$iv$iv$iv3 = this_$iv$iv$iv6.getDelegate$ui_release();
    L154:
        if (node$iv$iv$iv3 == null) goto L177;
        Modifier.Node next$iv$iv3 = node$iv$iv$iv3;
        if ((next$iv$iv3.getKindSet$ui_release() & r18) == 0) goto L158;
        boolean r29 = true;
    L159:
        if (r29 == false) goto L175;
        count$iv$iv3 = count$iv$iv3 + 1;
        DelegatingNode this_$iv$iv$iv7 = this_$iv$iv$iv6;
        if (count$iv$iv3 != 1) goto L163;
        r19 = next$iv$iv3;
        index$iv6 = index$iv6;
    L176:
        node$iv$iv$iv3 = node$iv$iv$iv3.getChild$ui_release();
        this_$iv$iv$iv6 = this_$iv$iv$iv7;
        index$iv6 = index$iv6;
        goto L154
    L163:
        if (r26 != null) goto L165;
        MutableVector r27 = new MutableVector(new Modifier.Node[16], 0);
    L166:
        Modifier.Node theNode$iv$iv3 = r19;
        if (theNode$iv$iv3 == null) goto L171;
        if (r27 == null) goto L170;
        Boolean.valueOf(r27.add(theNode$iv$iv3));
    L170:
        r19 = null;
    L171:
        if (r27 == null) goto L174;
        Boolean.valueOf(r27.add(next$iv$iv3));
    L174:
        r26 = r27;
        count$iv$iv3 = count$iv$iv3;
        goto L176
    L165:
        r27 = r26;
        goto L166
    L175:
        this_$iv$iv$iv7 = this_$iv$iv$iv6;
        index$iv6 = index$iv6;
        goto L176
    L158:
        r29 = false;
        goto L159
    L177:
        int index$iv8 = index$iv6;
        if (count$iv$iv3 != 1) goto L181;
        $i$f$fastForEach5 = $i$f$fastForEach7;
        index$iv6 = index$iv8;
    L181:
        r19 = DelegatableNodeKt.access$pop(r26);
        $i$f$fastForEach5 = $i$f$fastForEach7;
        index$iv6 = index$iv8;
    L180:
        index$iv8 = index$iv6;
        goto L181
    L149:
        r20 = false;
        goto L150
    L138:
        FocusTargetNode it2 = (FocusTargetNode) r19;
        if (r16 == null) goto L141;
        aggregatedNode = true;
    L141:
        r16 = it2;
        $i$f$fastForEach7 = $i$f$fastForEach5;
        if (this.focusTargetNodesLegacy.contains(it2) == false) goto L145;
        requiresUpdate = false;
        this.focusTargetsWithInvalidatedFocusEventsLegacy.add(it2);
    L145:
        index$iv8 = index$iv6;
        goto L181
    L182:
        r24 = r14;
        $i$f$fastForEach6 = $i$f$fastForEach5;
        index$iv7 = index$iv6;
        boolean value$iv$iv$iv2 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2.getNode().isAttached();
        if (value$iv$iv$iv2 == true) goto L185;
        InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
    L185:
        MutableVector branches$iv$iv2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv3 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2.getNode().getChild$ui_release();
        if (child$iv$iv3 != null) goto L188;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv2, $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default$iv2.getNode(), false);
    L189:
        MutableVector this_$iv$iv$iv8 = branches$iv$iv2;
        if (this_$iv$iv$iv8.getSize() == 0) goto L192;
        boolean r28 = true;
    L193:
        if (r28 == false) goto L255;
        MutableVector this_$iv$iv$iv9 = branches$iv$iv2;
        Modifier.Node branch$iv$iv2 = (Modifier.Node) branches$iv$iv2.removeAt(this_$iv$iv$iv9.getSize() - 1);
        if ((branch$iv$iv2.getAggregateChildKindSet$ui_release() & r18) == 0) goto L196;
        Modifier.Node node$iv$iv2 = branch$iv$iv2;
    L198:
        if (node$iv$iv2 == null) goto L252;
        if ((node$iv$iv2.getKindSet$ui_release() & r18) != 0) goto L201;
        node$iv$iv2 = node$iv$iv2.getChild$ui_release();
        child$iv$iv3 = child$iv$iv3;
        goto L198
    L201:
        Modifier.Node it$iv2 = node$iv$iv2;
        MutableVector r210 = null;
        Modifier.Node child$iv$iv4 = child$iv$iv3;
        Modifier.Node child$iv$iv5 = it$iv2;
    L202:
        if (child$iv$iv5 == null) goto L250;
        branches$iv$iv2 = branches$iv$iv2;
        if ((child$iv$iv5 instanceof FocusTargetNode) == true) goto L205;
        Modifier.Node branch$iv$iv3 = branch$iv$iv2;
        Modifier.Node this_$iv$iv$iv10 = child$iv$iv5;
        if ((this_$iv$iv$iv10.getKindSet$ui_release() & r18) == 0) goto L216;
        boolean r30 = true;
    L217:
        if (r30 == false) goto L249;
        if ((child$iv$iv5 instanceof DelegatingNode) == false) goto L249;
        int count$iv$iv4 = 0;
        DelegatingNode this_$iv$iv$iv11 = (DelegatingNode) child$iv$iv5;
        Modifier.Node node$iv$iv$iv4 = this_$iv$iv$iv11.getDelegate$ui_release();
    L221:
        if (node$iv$iv$iv4 == null) goto L245;
        Modifier.Node next$iv$iv4 = node$iv$iv$iv4;
        if ((next$iv$iv4.getKindSet$ui_release() & r18) == 0) goto L225;
        boolean r38 = true;
    L226:
        if (r38 == false) goto L243;
        count$iv$iv4 = count$iv$iv4 + 1;
        Modifier.Node r39 = child$iv$iv5;
        if (count$iv$iv4 != 1) goto L230;
        Modifier.Node r110 = next$iv$iv4;
        this_$iv$iv$iv11 = this_$iv$iv$iv11;
    L244:
        node$iv$iv$iv4 = node$iv$iv$iv4.getChild$ui_release();
        child$iv$iv5 = r110;
        this_$iv$iv$iv11 = this_$iv$iv$iv11;
        goto L221
    L230:
        if (r210 != null) goto L232;
        MutableVector r31 = new MutableVector(new Modifier.Node[16], 0);
    L234:
        if (r39 == null) goto L238;
        if (r31 == null) goto L237;
        Boolean.valueOf(r31.add(r39));
    L237:
        r110 = null;
    L239:
        if (r31 == null) goto L242;
        Boolean.valueOf(r31.add(next$iv$iv4));
    L242:
        r210 = r31;
        count$iv$iv4 = count$iv$iv4;
        goto L244
    L238:
        r110 = r39;
        goto L239
    L232:
        r31 = r210;
        goto L234
    L243:
        this_$iv$iv$iv11 = this_$iv$iv$iv11;
        r110 = child$iv$iv5;
        goto L244
    L225:
        r38 = false;
        goto L226
    L245:
        Modifier.Node r310 = child$iv$iv5;
        if (count$iv$iv4 != 1) goto L249;
        branch$iv$iv2 = branch$iv$iv3;
        child$iv$iv5 = r310;
    L249:
        child$iv$iv5 = DelegatableNodeKt.access$pop(r210);
        branch$iv$iv2 = branch$iv$iv3;
        goto L202
    L216:
        r30 = false;
        goto L217
    L205:
        FocusTargetNode it3 = (FocusTargetNode) child$iv$iv5;
        if (r16 == null) goto L208;
        aggregatedNode = true;
    L208:
        r16 = it3;
        branch$iv$iv3 = branch$iv$iv2;
        if (this.focusTargetNodesLegacy.contains(it3) == false) goto L249;
        requiresUpdate = false;
        this.focusTargetsWithInvalidatedFocusEventsLegacy.add(it3);
        goto L249
    L250:
        child$iv$iv3 = child$iv$iv4;
        goto L189
    L252:
        Modifier.Node child$iv$iv6 = child$iv$iv3;
    L253:
        child$iv$iv3 = child$iv$iv6;
        branches$iv$iv2 = branches$iv$iv2;
        goto L189
    L196:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv2, branch$iv$iv2, false);
        child$iv$iv6 = child$iv$iv3;
        goto L253
    L255:
        if (requiresUpdate == false) goto L265;
        if (aggregatedNode == false) goto L258;
        FocusStateImpl r32 = FocusEventModifierNodeKt.getFocusState(focusEventNode);
    L263:
        focusEventNode.onFocusEvent(r32);
        goto L265
    L258:
        if (r16 == null) goto L261;
        FocusStateImpl r36 = r16.getFocusState();
        if (r36 == null) goto L261;
    L262:
        r32 = r36;
    L261:
        r36 = FocusStateImpl.Inactive;
        goto L262
    L192:
        r28 = false;
        goto L193
    L188:
        branches$iv$iv2.add(child$iv$iv3);
        goto L189
    L266:
        this.focusEventNodesLegacy.clear();
        List<FocusTargetNode> r37 = this.focusTargetNodesLegacy;
        int index$iv9 = 0;
        int r40 = r37.size();
    L267:
        if (index$iv9 >= r40) goto L277;
        Object item$iv5 = r37.get(index$iv9);
        FocusTargetNode it4 = (FocusTargetNode) item$iv5;
        if (it4.isAttached() == false) goto L276;
        FocusStateImpl preInvalidationState = it4.getFocusState();
        it4.invalidateFocus$ui_release();
        if (preInvalidationState == it4.getFocusState()) goto L273;
    L274:
        it4.dispatchFocusCallbacks$ui_release();
        goto L276
    L273:
        if (this.focusTargetsWithInvalidatedFocusEventsLegacy.contains(it4) == true) goto L274;
    L276:
        index$iv9 = index$iv9 + 1;
        goto L267
    L277:
        this.focusTargetNodesLegacy.clear();
        this.focusTargetsWithInvalidatedFocusEventsLegacy.clear();
        this.invalidateOwnerFocusState.invoke();
        boolean value$iv = this.focusPropertiesNodesLegacy.isEmpty();
        if (value$iv == true) goto L280;
        InlineClassHelperKt.throwIllegalStateException("Unprocessed FocusProperties nodes");
    L280:
        boolean value$iv2 = this.focusEventNodesLegacy.isEmpty();
        if (value$iv2 == true) goto L283;
        InlineClassHelperKt.throwIllegalStateException("Unprocessed FocusEvent nodes");
    L283:
        boolean value$iv3 = this.focusTargetNodesLegacy.isEmpty();
        if (value$iv3 == true) goto L374;
        InlineClassHelperKt.throwIllegalStateException("Unprocessed FocusTarget nodes");
        return;
    }
}
