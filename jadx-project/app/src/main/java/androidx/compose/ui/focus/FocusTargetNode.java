package androidx.compose.ui.focus;

import android.os.Trace;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: FocusTargetNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001SBc\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012:\b\u0002\u0010\b\u001a4\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\r\u0010.\u001a\u00020\u000fH\u0000¢\u0006\u0002\b/J\r\u00100\u001a\u00020\u000fH\u0000¢\u0006\u0002\b1J\u001d\u00100\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\nH\u0000¢\u0006\u0002\b1J/\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u0002062\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u000f0\u0011H\u0080\bø\u0001\u0000¢\u0006\u0004\b9\u0010:JN\u0010;\u001a\u00020\u000f2\u0006\u00105\u001a\u0002062\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u000f0\u00112\u001d\u0010<\u001a\u0019\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\u0002\b?H\u0082\bø\u0001\u0000¢\u0006\u0004\b@\u0010AJ/\u0010B\u001a\u00020\u000f2\u0006\u00105\u001a\u0002062\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u000f0\u0011H\u0080\bø\u0001\u0000¢\u0006\u0004\bC\u0010:J\r\u0010D\u001a\u00020=H\u0000¢\u0006\u0002\bEJ\u0019\u0010F\u001a\u00020\u000f2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0002\bHJ\r\u0010I\u001a\u00020\u000fH\u0000¢\u0006\u0002\bJJ\r\u0010K\u001a\u00020%H\u0000¢\u0006\u0002\bLJ\b\u0010M\u001a\u00020\u000fH\u0016J\b\u0010N\u001a\u00020\u000fH\u0016J\b\u0010O\u001a\u00020\u000fH\u0016J\b\u0010P\u001a\u00020%H\u0017J\u001a\u0010P\u001a\u00020%2\u0006\u00105\u001a\u000206H\u0016ø\u0001\u0000¢\u0006\u0004\bQ\u0010RR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR,\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R@\u0010\b\u001a4\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\u0014\u0010+\u001a\u00020%X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006T"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "focusability", "Landroidx/compose/ui/focus/Focusability;", "onFocusChange", "Lkotlin/Function2;", "Landroidx/compose/ui/focus/FocusState;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "previous", "current", "", "onDispatchEventsCompleted", "Lkotlin/Function1;", "(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "beyondBoundsLayoutParent", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "getBeyondBoundsLayoutParent", "()Landroidx/compose/ui/layout/BeyondBoundsLayout;", "committedFocusState", "Landroidx/compose/ui/focus/FocusStateImpl;", "value", "focusState", "getFocusState", "()Landroidx/compose/ui/focus/FocusStateImpl;", "setFocusState", "(Landroidx/compose/ui/focus/FocusStateImpl;)V", "getFocusability-LCbbffg", "()I", "setFocusability-josRg5g", "(I)V", "I", "isProcessingCustomEnter", "", "isProcessingCustomExit", "previouslyFocusedChildHash", "", "getPreviouslyFocusedChildHash", "setPreviouslyFocusedChildHash", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "commitFocusState", "commitFocusState$ui_release", "dispatchFocusCallbacks", "dispatchFocusCallbacks$ui_release", "previousState", "newState", "fetchCustomEnter", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "block", "Landroidx/compose/ui/focus/FocusRequester;", "fetchCustomEnter-aToIllA$ui_release", "(ILkotlin/jvm/functions/Function1;)V", "fetchCustomEnterOrExit", "enterOrExit", "Landroidx/compose/ui/focus/FocusProperties;", "Landroidx/compose/ui/focus/FocusEnterExitScope;", "Lkotlin/ExtensionFunctionType;", "fetchCustomEnterOrExit-ULY8qGw", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "fetchCustomExit", "fetchCustomExit-aToIllA$ui_release", "fetchFocusProperties", "fetchFocusProperties$ui_release", "initializeFocusState", "initialFocusState", "initializeFocusState$ui_release", "invalidateFocus", "invalidateFocus$ui_release", "isInitialized", "isInitialized$ui_release", "onAttach", "onDetach", "onObservedReadsChanged", "requestFocus", "requestFocus-3ESFkO8", "(I)Z", "FocusTargetElement", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FocusTargetNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, FocusTargetModifierNode, ObserverModifierNode, ModifierLocalModifierNode {
    public static final int $stable = 0;
    private FocusStateImpl committedFocusState;
    private int focusability;
    private boolean isProcessingCustomEnter;
    private boolean isProcessingCustomExit;
    private final Function1<FocusTargetNode, Unit> onDispatchEventsCompleted;
    private final Function2<FocusState, FocusState, Unit> onFocusChange;
    private int previouslyFocusedChildHash;
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: compiled from: FocusTargetNode.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\f\u0010\u000e\u001a\u00020\f*\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusTargetNode;", "()V", "create", "equals", "", "other", "", "hashCode", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FocusTargetElement extends ModifierNodeElement<FocusTargetNode> {
        public static final int $stable = 0;
        public static final FocusTargetElement INSTANCE = null;

        static {
            INSTANCE = new FocusTargetElement();
        }

        private FocusTargetElement() {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public /* bridge */ /* synthetic */ Modifier.Node create() {
            return create();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public /* bridge */ /* synthetic */ void update(Modifier.Node node) {
            update((FocusTargetNode) node);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public FocusTargetNode create() {
            int r1 = 0;
            Function2 r2 = null;
            Function1 r3 = null;
            return new FocusTargetNode(r1, r2, r3, 7, null);
        }

        public void update(FocusTargetNode node) {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo $this$inspectableProperties) {
            $this$inspectableProperties.setName("focusTarget");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return "focusTarget".hashCode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object other) {
            if (other != this) goto L4;
            return true;
        L4:
            return false;
        }
    }

    /* JADX INFO: compiled from: FocusTargetNode.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = null;

        static {
            int[] r0 = new int[CustomDestinationResult.values().length];
            r0[CustomDestinationResult.None.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L33:
            r0[CustomDestinationResult.Redirected.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
        L41:
            r0[CustomDestinationResult.Cancelled.ordinal()] = 3;     // Catch: NoSuchFieldError -> L13
        L45:
            r0[CustomDestinationResult.RedirectCancelled.ordinal()] = 4;     // Catch: NoSuchFieldError -> L17
        L18:
            $EnumSwitchMapping$0 = r0;
            int[] r1 = new int[FocusStateImpl.values().length];
            r1[FocusStateImpl.Active.ordinal()] = 1;     // Catch: NoSuchFieldError -> L21
        L35:
            r1[FocusStateImpl.Captured.ordinal()] = 2;     // Catch: NoSuchFieldError -> L24
        L37:
            r1[FocusStateImpl.ActiveParent.ordinal()] = 3;     // Catch: NoSuchFieldError -> L27
        L47:
            r1[FocusStateImpl.Inactive.ordinal()] = 4;     // Catch: NoSuchFieldError -> L30
        L31:
            $EnumSwitchMapping$1 = r1;
        }
    }

    static {
        $stable = 8;
    }

    public /* synthetic */ FocusTargetNode(int r1, Function2 r2, Function1 r3, DefaultConstructorMarker r4) {
        this(r1, r2, r3);
    }

    public /* synthetic */ FocusTargetNode(int r2, Function2 r3, Function1 r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L5;
        r2 = Focusability.Companion.m4061getAlwaysLCbbffg();
    L5:
        DefaultConstructorMarker r0 = null;
        if ((r5 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = null;
    L11:
        this(r2, r3, r4, r0);
    }

    public static final /* synthetic */ boolean access$isProcessingCustomEnter$p(FocusTargetNode $this) {
        return $this.isProcessingCustomEnter;
    }

    public static final /* synthetic */ boolean access$isProcessingCustomExit$p(FocusTargetNode $this) {
        return $this.isProcessingCustomExit;
    }

    public static final /* synthetic */ void access$setProcessingCustomEnter$p(FocusTargetNode $this, boolean r1) {
        $this.isProcessingCustomEnter = r1;
    }

    public static final /* synthetic */ void access$setProcessingCustomExit$p(FocusTargetNode $this, boolean r1) {
        $this.isProcessingCustomExit = r1;
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    public /* bridge */ /* synthetic */ FocusState getFocusState() {
        return getFocusState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FocusTargetNode(int focusability, Function2<? super FocusState, ? super FocusState, Unit> r2, Function1<? super FocusTargetNode, Unit> r3) {
        this.onFocusChange = r2;
        this.onDispatchEventsCompleted = r3;
        this.focusability = focusability;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    public FocusStateImpl getFocusState() {
        if (ComposeUiFlags.isTrackFocusEnabled == true) goto L5;
        FocusTransactionManager $this$_get_focusState__u24lambda_u241 = FocusTargetNodeKt.getFocusTransactionManager(this);
        if ($this$_get_focusState__u24lambda_u241 == null) goto L97;
        FocusStateImpl r1 = $this$_get_focusState__u24lambda_u241.getUncommittedFocusState(this);
        if (r1 == null) goto L97;
        return r1;
    L97:
        FocusStateImpl r2 = this.committedFocusState;
        if (r2 == null) goto L100;
        return r2;
    L100:
        return FocusStateImpl.Inactive;
    L5:
        if (isAttached() == false) goto L7;
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
        FocusTargetNode activeNode = focusOwner.getActiveFocusTargetNode();
        if (activeNode == null) goto L11;
        if (this != activeNode) goto L19;
        if (focusOwner.isFocusCaptured() == false) goto L16;
        FocusStateImpl r3 = FocusStateImpl.Captured;
    L120:
        return r3;
    L16:
        r3 = FocusStateImpl.Active;
        goto L120
    L19:
        if (activeNode.isAttached() == false) goto L92;
        FocusTargetNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = activeNode;
        int r4 = NodeKind.m5976constructorimpl(1024);
        boolean value$iv$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L23;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L23:
        Modifier.Node node$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv.getNode().getParent$ui_release();
        LayoutNode layout$iv$iv = DelegatableNodeKt.requireLayoutNode($this$visitAncestors_u2dY_u2dYKmho_u24default$iv);
    L24:
        if (layout$iv$iv == null) goto L92;
        Modifier.Node head$iv$iv = layout$iv$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv$iv.getAggregateChildKindSet$ui_release() & r4) == 0) goto L81;
    L27:
        if (node$iv$iv == null) goto L80;
        if ((node$iv$iv.getKindSet$ui_release() & r4) == 0) goto L79;
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r17 = null;
        Modifier.Node r5 = it$iv;
    L31:
        if (r5 == null) goto L79;
        activeNode = activeNode;
        if ((r5 instanceof FocusTargetNode) == true) goto L34;
        Modifier.Node this_$iv$iv$iv = r5;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & r4) == 0) goto L42;
        int r20 = 1;
    L43:
        if (r20 == 0) goto L75;
        if ((r5 instanceof DelegatingNode) == false) goto L75;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r5;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L47:
        if (node$iv$iv$iv == null) goto L71;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & r4) == 0) goto L51;
        boolean r26 = true;
    L52:
        if (r26 == false) goto L69;
        count$iv$iv = count$iv$iv + 1;
        Modifier.Node r27 = r5;
        if (count$iv$iv != 1) goto L56;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        MutableVector r6 = r17;
        Modifier.Node r18 = next$iv$iv;
    L70:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        r5 = r18;
        r17 = r6;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        goto L47
    L56:
        if (r17 != null) goto L58;
        MutableVector r7 = new MutableVector(new Modifier.Node[16], 0);
    L60:
        if (r27 == null) goto L64;
        if (r7 == null) goto L63;
        r7.add(r27);
    L63:
        r18 = null;
    L65:
        if (r7 == null) goto L68;
        r7.add(next$iv$iv);
    L68:
        r6 = r7;
        count$iv$iv = count$iv$iv;
        goto L70
    L64:
        r18 = r27;
        goto L65
    L58:
        r7 = r17;
        goto L60
    L69:
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        r6 = r17;
        r18 = r5;
        goto L70
    L51:
        r26 = false;
        goto L52
    L71:
        Modifier.Node r28 = r5;
        DelegatableNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        if (count$iv$iv != 1) goto L76;
        r5 = r28;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2;
    L76:
        r5 = DelegatableNodeKt.access$pop(r17);
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2;
    L75:
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        goto L76
    L42:
        r20 = 0;
        goto L43
    L34:
        FocusTargetNode it = (FocusTargetNode) r5;
        if (this == it) goto L37;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        goto L76
    L37:
        return FocusStateImpl.ActiveParent;
    L79:
        node$iv$iv = node$iv$iv.getParent$ui_release();
        focusOwner = focusOwner;
        activeNode = activeNode;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        goto L27
    L80:
        FocusOwner focusOwner2 = focusOwner;
        FocusTargetNode activeNode2 = activeNode;
        DelegatableNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv3 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
    L82:
        layout$iv$iv = layout$iv$iv.getParent$ui_release();
        if (layout$iv$iv == null) goto L87;
        NodeChain r8 = layout$iv$iv.getNodes$ui_release();
        if (r8 == null) goto L87;
        Modifier.Node r9 = r8.getTail$ui_release();
    L88:
        node$iv$iv = r9;
        focusOwner = focusOwner2;
        activeNode = activeNode2;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv3;
    L87:
        r9 = null;
        goto L88
    L81:
        focusOwner2 = focusOwner;
        activeNode2 = activeNode;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv3 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
    L92:
        return FocusStateImpl.Inactive;
    L11:
        return FocusStateImpl.Inactive;
    L7:
        return FocusStateImpl.Inactive;
    }

    public void setFocusState(FocusStateImpl value) {
        if (ComposeUiFlags.isTrackFocusEnabled == true) goto L6;
        FocusTransactionManager $this$_set_focusState__u24lambda_u242 = FocusTargetNodeKt.requireTransactionManager(this);
        $this$_set_focusState__u24lambda_u242.setUncommittedFocusState(this, value);
        return;
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the version accepting FocusDirection", replaceWith = @ReplaceWith(expression = "this.requestFocus()", imports = {}))
    public /* synthetic */ boolean requestFocus() {
        return mo4040requestFocus3ESFkO8(FocusDirection.Companion.m4014getEnterdhqQ8s());
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    /* JADX INFO: renamed from: requestFocus-3ESFkO8 */
    public boolean mo4040requestFocus3ESFkO8(int focusDirection) {
        Trace.beginSection("FocusTransactions:requestFocus");
    L37:
        th = move-exception;
        Trace.endSection();
        throw th;
    L4:
        boolean r4 = false;
        if (fetchFocusProperties$ui_release().getCanFocus() == true) goto L9;
    L6:
        Trace.endSection();
        return r4;
    L9:
        if (ComposeUiFlags.isTrackFocusEnabled == true) goto L11;
        FocusTransactionManager this_$iv = FocusTargetNodeKt.requireTransactionManager(this);     // Catch: Throwable -> L37
        Function0<Unit> r6 = new FocusTargetNode$requestFocus$1$1(this);     // Catch: Throwable -> L37
    L34:
        th = move-exception;
        FocusTransactionManager.access$commitTransaction(this_$iv);     // Catch: Throwable -> L37
        throw th;     // Catch: Throwable -> L37
    L21:
        if (this_$iv.getOngoingTransaction() == false) goto L23;
        FocusTransactionManager.access$cancelTransaction(this_$iv);     // Catch: Throwable -> L34
    L23:
        FocusTransactionManager.access$beginTransaction(this_$iv);     // Catch: Throwable -> L34
        MutableVector this_$iv$iv = FocusTransactionManager.access$getCancellationListener$p(this_$iv);     // Catch: Throwable -> L34
        this_$iv$iv.add(r6);     // Catch: Throwable -> L34
        switch(WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m4050performCustomRequestFocusMxy_nc0(this, focusDirection).ordinal()]) {
            case 1: goto L28;
            case 2: goto L27;
            case 3: goto L30;
            case 4: goto L30;
            default: goto L33;
        };     // Catch: Throwable -> L34
    L27:
        r4 = true;
        goto L30
    L28:
        r4 = FocusTransactionsKt.performRequestFocus(this);     // Catch: Throwable -> L34
        goto L30
    L33:
        throw new NoWhenBranchMatchedException();     // Catch: Throwable -> L34
    L30:
        FocusTransactionManager.access$commitTransaction(this_$iv);     // Catch: Throwable -> L37
        goto L6
    L11:
        switch(WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m4050performCustomRequestFocusMxy_nc0(this, focusDirection).ordinal()]) {
            case 1: goto L15;
            case 2: goto L14;
            case 3: goto L6;
            case 4: goto L6;
            default: goto L17;
        };     // Catch: Throwable -> L37
    L14:
        r4 = true;
        goto L6
    L15:
        r4 = FocusTransactionsKt.performRequestFocus(this);     // Catch: Throwable -> L37
        goto L6
    L17:
        throw new NoWhenBranchMatchedException();     // Catch: Throwable -> L37
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    /* JADX INFO: renamed from: getFocusability-LCbbffg */
    public int mo4039getFocusabilityLCbbffg() {
        return this.focusability;
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    /* JADX INFO: renamed from: setFocusability-josRg5g */
    public void mo4041setFocusabilityjosRg5g(int value) {
        if (Focusability.m4057equalsimpl0(this.focusability, value) == true) goto L19;
        this.focusability = value;
        if (ComposeUiFlags.isTrackFocusEnabled == false) goto L14;
        if (isAttached() == true) goto L9;
        return;
    L9:
        if (this == DelegatableNodeKt.requireOwner(this).getFocusOwner().getActiveFocusTargetNode()) goto L11;
        return;
    L11:
        if (Focusability.m4054canFocusimpl$ui_release(this.focusability, this) == true) goto L22;
        FocusTransactionsKt.clearFocus(this, true, true);
        return;
    L22:
        return;
    L14:
        if (isAttached() == true) goto L16;
        return;
    L16:
        if (isInitialized$ui_release() == false) goto L25;
        onObservedReadsChanged();
        return;
    L25:
        return;
    }

    public final int getPreviouslyFocusedChildHash() {
        return this.previouslyFocusedChildHash;
    }

    public final void setPreviouslyFocusedChildHash(int r1) {
        this.previouslyFocusedChildHash = r1;
    }

    public final BeyondBoundsLayout getBeyondBoundsLayoutParent() {
        return (BeyondBoundsLayout) getCurrent(androidx.compose.ui.layout.BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout());
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        if (ComposeUiFlags.isTrackFocusEnabled == false) goto L5;
        invalidateFocus$ui_release();
        return;
    L5:
        FocusStateImpl previousFocusState = getFocusState();
        invalidateFocus$ui_release();
        if (previousFocusState == getFocusState()) goto L10;
        dispatchFocusCallbacks$ui_release();
        return;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        if (ComposeUiFlags.isTrackFocusEnabled == false) goto L5;
        return;
    L5:
        FocusTargetNodeKt.invalidateFocusTarget(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        FocusStateImpl r0 = getFocusState();
        switch(WhenMappings.$EnumSwitchMapping$1[r0.ordinal()]) {
            case 1: goto L16;
            case 2: goto L16;
            case 3: goto L6;
            default: goto L20;
        };
    L16:
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
        focusOwner.mo4024clearFocusI7lrPNg(true, true, false, FocusDirection.Companion.m4015getExitdhqQ8s());
        if (ComposeUiFlags.isTrackFocusEnabled == false) goto L19;
        focusOwner.scheduleInvalidationForOwner();
        goto L20
    L19:
        FocusTargetNodeKt.invalidateFocusTarget(this);
    L20:
        this.committedFocusState = null;
        return;
    L6:
        if (ComposeUiFlags.isTrackFocusEnabled == true) goto L20;
        FocusTransactionManager $this$iv = FocusTargetNodeKt.requireTransactionManager(this);
    L13:
        th = move-exception;
        FocusTransactionManager.access$commitTransaction($this$iv);
        throw th;
    L9:
        if ($this$iv.getOngoingTransaction() == false) goto L11;
        FocusTransactionManager.access$cancelTransaction($this$iv);     // Catch: Throwable -> L13
    L11:
        FocusTransactionManager.access$beginTransaction($this$iv);     // Catch: Throwable -> L13
        setFocusState(FocusStateImpl.Inactive);     // Catch: Throwable -> L13
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L13
        FocusTransactionManager.access$commitTransaction($this$iv);
        goto L20
    }

    public final FocusProperties fetchFocusProperties$ui_release() {
        FocusPropertiesImpl properties = new FocusPropertiesImpl();
        properties.setCanFocus(Focusability.m4054canFocusimpl$ui_release(mo4039getFocusabilityLCbbffg(), this));
        FocusTargetNode $this$visitSelfAndAncestors_u2d5BbP62I$iv = this;
        int type$iv = NodeKind.m5976constructorimpl(2048);
        int untilType$iv = NodeKind.m5976constructorimpl(1024);
        Modifier.Node self$iv = $this$visitSelfAndAncestors_u2d5BbP62I$iv.getNode();
        int mask$iv$iv = type$iv | untilType$iv;
        boolean value$iv$iv$iv = $this$visitSelfAndAncestors_u2d5BbP62I$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L5:
        Modifier.Node node$iv$iv = $this$visitSelfAndAncestors_u2d5BbP62I$iv.getNode();
        LayoutNode layout$iv$iv = DelegatableNodeKt.requireLayoutNode($this$visitSelfAndAncestors_u2d5BbP62I$iv);
    L6:
        if (layout$iv$iv == null) goto L81;
        Modifier.Node head$iv$iv = layout$iv$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv$iv.getAggregateChildKindSet$ui_release() & mask$iv$iv) == 0) goto L73;
    L9:
        if (node$iv$iv == null) goto L72;
        if ((node$iv$iv.getKindSet$ui_release() & mask$iv$iv) == 0) goto L71;
        Modifier.Node it$iv = node$iv$iv;
        if (it$iv == self$iv) goto L22;
        if ((it$iv.getKindSet$ui_release() & untilType$iv) == 0) goto L17;
        boolean r16 = true;
    L18:
        if (r16 == false) goto L22;
        FocusPropertiesImpl properties2 = properties;
    L83:
        return properties2;
    L17:
        r16 = false;
    L22:
        if ((it$iv.getKindSet$ui_release() & type$iv) == 0) goto L24;
        boolean r17 = true;
    L25:
        if (r17 == false) goto L71;
        MutableVector r18 = null;
        Modifier.Node this_$iv$iv$iv = it$iv;
    L27:
        if (this_$iv$iv$iv == null) goto L71;
        properties = properties;
        if ((this_$iv$iv$iv instanceof FocusPropertiesModifierNode) == true) goto L30;
        DelegatableNode $this$visitSelfAndAncestors_u2d5BbP62I$iv2 = $this$visitSelfAndAncestors_u2d5BbP62I$iv;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L34;
        boolean r0 = true;
    L35:
        if (r0 == false) goto L65;
        if ((this_$iv$iv$iv instanceof DelegatingNode) == false) goto L65;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) this_$iv$iv$iv;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L39:
        if (node$iv$iv$iv == null) goto L62;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L43;
        boolean r26 = true;
    L44:
        if (r26 == false) goto L60;
        count$iv$iv = count$iv$iv + 1;
        DelegatingNode this_$iv$iv$iv3 = this_$iv$iv$iv2;
        if (count$iv$iv != 1) goto L48;
        this_$iv$iv$iv = next$iv$iv;
        type$iv = type$iv;
        untilType$iv = untilType$iv;
    L61:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        this_$iv$iv$iv2 = this_$iv$iv$iv3;
        type$iv = type$iv;
        untilType$iv = untilType$iv;
        goto L39
    L48:
        if (r18 != null) goto L50;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L51:
        Modifier.Node theNode$iv$iv = this_$iv$iv$iv;
        if (theNode$iv$iv == null) goto L56;
        if (r1 == null) goto L55;
        r1.add(theNode$iv$iv);
    L55:
        this_$iv$iv$iv = null;
    L56:
        if (r1 == null) goto L59;
        r1.add(next$iv$iv);
    L59:
        r18 = r1;
        count$iv$iv = count$iv$iv;
        goto L61
    L50:
        r1 = r18;
        goto L51
    L60:
        this_$iv$iv$iv3 = this_$iv$iv$iv2;
        type$iv = type$iv;
        untilType$iv = untilType$iv;
        goto L61
    L43:
        r26 = false;
        goto L44
    L62:
        int type$iv2 = type$iv;
        int untilType$iv2 = untilType$iv;
        if (count$iv$iv != 1) goto L66;
        $this$visitSelfAndAncestors_u2d5BbP62I$iv = $this$visitSelfAndAncestors_u2d5BbP62I$iv2;
        type$iv = type$iv2;
        untilType$iv = untilType$iv2;
    L66:
        this_$iv$iv$iv = DelegatableNodeKt.access$pop(r18);
        $this$visitSelfAndAncestors_u2d5BbP62I$iv = $this$visitSelfAndAncestors_u2d5BbP62I$iv2;
        type$iv = type$iv2;
        untilType$iv = untilType$iv2;
    L65:
        type$iv2 = type$iv;
        untilType$iv2 = untilType$iv;
        goto L66
    L34:
        r0 = false;
        goto L35
    L30:
        FocusPropertiesModifierNode it = (FocusPropertiesModifierNode) this_$iv$iv$iv;
        $this$visitSelfAndAncestors_u2d5BbP62I$iv2 = $this$visitSelfAndAncestors_u2d5BbP62I$iv;
        it.applyFocusProperties(properties);
        type$iv2 = type$iv;
        untilType$iv2 = untilType$iv;
        goto L66
    L24:
        r17 = false;
    L71:
        node$iv$iv = node$iv$iv.getParent$ui_release();
        properties = properties;
        $this$visitSelfAndAncestors_u2d5BbP62I$iv = $this$visitSelfAndAncestors_u2d5BbP62I$iv;
        type$iv = type$iv;
        untilType$iv = untilType$iv;
        goto L9
    L72:
        FocusPropertiesImpl properties3 = properties;
        DelegatableNode $this$visitSelfAndAncestors_u2d5BbP62I$iv3 = $this$visitSelfAndAncestors_u2d5BbP62I$iv;
        int type$iv3 = type$iv;
        int untilType$iv3 = untilType$iv;
    L74:
        layout$iv$iv = layout$iv$iv.getParent$ui_release();
        if (layout$iv$iv == null) goto L79;
        NodeChain r2 = layout$iv$iv.getNodes$ui_release();
        if (r2 == null) goto L79;
        Modifier.Node r3 = r2.getTail$ui_release();
    L80:
        node$iv$iv = r3;
        properties = properties3;
        $this$visitSelfAndAncestors_u2d5BbP62I$iv = $this$visitSelfAndAncestors_u2d5BbP62I$iv3;
        type$iv = type$iv3;
        untilType$iv = untilType$iv3;
    L79:
        r3 = null;
        goto L80
    L73:
        properties3 = properties;
        $this$visitSelfAndAncestors_u2d5BbP62I$iv3 = $this$visitSelfAndAncestors_u2d5BbP62I$iv;
        type$iv3 = type$iv;
        untilType$iv3 = untilType$iv;
        goto L74
    L81:
        properties2 = properties;
        goto L83
    }

    /* JADX INFO: renamed from: fetchCustomEnterOrExit-ULY8qGw, reason: not valid java name */
    private final void m4044fetchCustomEnterOrExitULY8qGw(int focusDirection, Function1<? super FocusRequester, Unit> r12, Function2<? super FocusProperties, ? super FocusEnterExitScope, Unit> r13) {
        FocusProperties focusProperties = fetchFocusProperties$ui_release();
        CancelIndicatingFocusBoundaryScope scope = new CancelIndicatingFocusBoundaryScope(focusDirection, null);
        FocusTransactionManager focusTransactionManager = FocusTargetNodeKt.getFocusTransactionManager(this);
        int generationAfter = 0;
        if (focusTransactionManager == null) goto L5;
        int generationBefore = focusTransactionManager.getGeneration();
    L6:
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
        FocusTargetNode activeNodeBefore = focusOwner.getActiveFocusTargetNode();
        r13.invoke(focusProperties, scope);
        if (focusTransactionManager == null) goto L9;
        generationAfter = focusTransactionManager.getGeneration();
    L9:
        FocusTargetNode activeNodeAfter = focusOwner.getActiveFocusTargetNode();
        if (scope.isCanceled() == false) goto L12;
        r12.invoke(FocusRequester.Companion.getCancel());
        return;
    L12:
        if (generationBefore == generationAfter) goto L14;
    L17:
        r12.invoke(FocusRequester.Companion.getRedirect$ui_release());
        return;
    L14:
        if (ComposeUiFlags.isTrackFocusEnabled == false) goto L20;
        if (activeNodeBefore == activeNodeAfter) goto L21;
        if (activeNodeAfter != null) goto L17;
        return;
    L21:
        return;
    L20:
        return;
    L5:
        generationBefore = 0;
        goto L6
    }

    /* JADX INFO: renamed from: fetchCustomEnter-aToIllA$ui_release, reason: not valid java name */
    public final void m4045fetchCustomEnteraToIllA$ui_release(int focusDirection, Function1<? super FocusRequester, Unit> r18) {
        if (access$isProcessingCustomEnter$p(this) == true) goto L32;
        access$setProcessingCustomEnter$p(this, true);
        FocusProperties focusProperties$iv = fetchFocusProperties$ui_release();     // Catch: Throwable -> L27
        CancelIndicatingFocusBoundaryScope scope$iv = new CancelIndicatingFocusBoundaryScope(focusDirection, null);     // Catch: Throwable -> L25
        FocusTransactionManager focusTransactionManager$iv = FocusTargetNodeKt.getFocusTransactionManager(this);     // Catch: Throwable -> L25
        if (focusTransactionManager$iv == null) goto L10;
        int generationBefore$iv = focusTransactionManager$iv.getGeneration();     // Catch: Throwable -> L25
    L11:
        FocusOwner focusOwner$iv = DelegatableNodeKt.requireOwner(this).getFocusOwner();     // Catch: Throwable -> L25
        FocusTargetNode activeNodeBefore$iv = focusOwner$iv.getActiveFocusTargetNode();     // Catch: Throwable -> L25
        CancelIndicatingFocusBoundaryScope it = scope$iv;     // Catch: Throwable -> L25
        focusProperties$iv.getOnEnter().invoke(it);     // Catch: Throwable -> L25
        if (focusTransactionManager$iv == null) goto L14;
        int generationAfter$iv = focusTransactionManager$iv.getGeneration();     // Catch: Throwable -> L25
    L15:
        FocusTargetNode activeNodeAfter$iv = focusOwner$iv.getActiveFocusTargetNode();     // Catch: Throwable -> L25
        if (scope$iv.isCanceled() == false) goto L18;
        r18.invoke(FocusRequester.Companion.getCancel());     // Catch: Throwable -> L25
    L24:
        access$setProcessingCustomEnter$p(this, false);
        return;
    L18:
        if (generationBefore$iv == generationAfter$iv) goto L20;
    L23:
        r18.invoke(FocusRequester.Companion.getRedirect$ui_release());     // Catch: Throwable -> L25
        goto L24
    L20:
        if (ComposeUiFlags.isTrackFocusEnabled == false) goto L24;
        if (activeNodeBefore$iv == activeNodeAfter$iv) goto L24;
        if (activeNodeAfter$iv == null) goto L24;
    L14:
        generationAfter$iv = 0;
        goto L15
    L10:
        generationBefore$iv = 0;
    L25:
        th = th;
    L29:
        access$setProcessingCustomEnter$p(this, false);
        throw th;
    L27:
        th = th;
        goto L29
    }

    /* JADX INFO: renamed from: fetchCustomExit-aToIllA$ui_release, reason: not valid java name */
    public final void m4046fetchCustomExitaToIllA$ui_release(int focusDirection, Function1<? super FocusRequester, Unit> r18) {
        if (access$isProcessingCustomExit$p(this) == true) goto L32;
        access$setProcessingCustomExit$p(this, true);
        FocusProperties focusProperties$iv = fetchFocusProperties$ui_release();     // Catch: Throwable -> L27
        CancelIndicatingFocusBoundaryScope scope$iv = new CancelIndicatingFocusBoundaryScope(focusDirection, null);     // Catch: Throwable -> L25
        FocusTransactionManager focusTransactionManager$iv = FocusTargetNodeKt.getFocusTransactionManager(this);     // Catch: Throwable -> L25
        if (focusTransactionManager$iv == null) goto L10;
        int generationBefore$iv = focusTransactionManager$iv.getGeneration();     // Catch: Throwable -> L25
    L11:
        FocusOwner focusOwner$iv = DelegatableNodeKt.requireOwner(this).getFocusOwner();     // Catch: Throwable -> L25
        FocusTargetNode activeNodeBefore$iv = focusOwner$iv.getActiveFocusTargetNode();     // Catch: Throwable -> L25
        CancelIndicatingFocusBoundaryScope it = scope$iv;     // Catch: Throwable -> L25
        focusProperties$iv.getOnExit().invoke(it);     // Catch: Throwable -> L25
        if (focusTransactionManager$iv == null) goto L14;
        int generationAfter$iv = focusTransactionManager$iv.getGeneration();     // Catch: Throwable -> L25
    L15:
        FocusTargetNode activeNodeAfter$iv = focusOwner$iv.getActiveFocusTargetNode();     // Catch: Throwable -> L25
        if (scope$iv.isCanceled() == false) goto L18;
        r18.invoke(FocusRequester.Companion.getCancel());     // Catch: Throwable -> L25
    L24:
        access$setProcessingCustomExit$p(this, false);
        return;
    L18:
        if (generationBefore$iv == generationAfter$iv) goto L20;
    L23:
        r18.invoke(FocusRequester.Companion.getRedirect$ui_release());     // Catch: Throwable -> L25
        goto L24
    L20:
        if (ComposeUiFlags.isTrackFocusEnabled == false) goto L24;
        if (activeNodeBefore$iv == activeNodeAfter$iv) goto L24;
        if (activeNodeAfter$iv == null) goto L24;
    L14:
        generationAfter$iv = 0;
        goto L15
    L10:
        generationBefore$iv = 0;
    L25:
        th = th;
    L29:
        access$setProcessingCustomExit$p(this, false);
        throw th;
    L27:
        th = th;
        goto L29
    }

    public final void commitFocusState$ui_release() {
        FocusTransactionManager $this$commitFocusState_u24lambda_u2410 = FocusTargetNodeKt.requireTransactionManager(this);
        FocusStateImpl r2 = $this$commitFocusState_u24lambda_u2410.getUncommittedFocusState(this);
        if (r2 == null) goto L6;
        this.committedFocusState = r2;
        return;
    L6:
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("committing a node that was not updated in the current transaction");
        throw new KotlinNothingValueException();
    }

    public final void invalidateFocus$ui_release() {
        FocusProperties r2 = null;
        if (isInitialized$ui_release() == true) goto L5;
        initializeFocusState$ui_release$default(this, null, 1, null);
    L5:
        FocusStateImpl r0 = getFocusState();
        switch(WhenMappings.$EnumSwitchMapping$1[r0.ordinal()]) {
            case 1: goto L8;
            case 2: goto L8;
            default: goto L17;
        };
    L8:
        final Ref.ObjectRef focusProperties = new Ref.ObjectRef();
        ObserverModifierNodeKt.observeReads(this, new FocusTargetNode$invalidateFocus$1(focusProperties, this));
        if (focusProperties.element != 0) goto L11;
        Intrinsics.throwUninitializedPropertyAccessException("focusProperties");
    L13:
        if (r2.getCanFocus() == true) goto L16;
        DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
        return;
    L16:
        return;
    L11:
        r2 = (FocusProperties) focusProperties.element;
        goto L13
    }

    public final void dispatchFocusCallbacks$ui_release() {
        FocusStateImpl previousOrInactive = this.committedFocusState;
        if (previousOrInactive != null) goto L5;
        previousOrInactive = FocusStateImpl.Inactive;
    L5:
        FocusStateImpl focusState = getFocusState();
        if (previousOrInactive == focusState) goto L10;
        Function2<FocusState, FocusState, Unit> r3 = this.onFocusChange;
        if (r3 == null) goto L10;
        r3.invoke(previousOrInactive, focusState);
    L10:
        FocusTargetNode $this$visitSelfAndAncestors_u2d5BbP62I$iv = this;
        int r4 = NodeKind.m5976constructorimpl(4096);
        int r5 = NodeKind.m5976constructorimpl(1024);
        Modifier.Node self$iv = $this$visitSelfAndAncestors_u2d5BbP62I$iv.getNode();
        int mask$iv$iv = r4 | r5;
        boolean value$iv$iv$iv = $this$visitSelfAndAncestors_u2d5BbP62I$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L13;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L13:
        Modifier.Node node$iv$iv = $this$visitSelfAndAncestors_u2d5BbP62I$iv.getNode();
        LayoutNode layout$iv$iv = DelegatableNodeKt.requireLayoutNode($this$visitSelfAndAncestors_u2d5BbP62I$iv);
    L14:
        if (layout$iv$iv == null) goto L92;
        Modifier.Node head$iv$iv = layout$iv$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv$iv.getAggregateChildKindSet$ui_release() & mask$iv$iv) == 0) goto L83;
    L17:
        if (node$iv$iv == null) goto L82;
        if ((node$iv$iv.getKindSet$ui_release() & mask$iv$iv) == 0) goto L80;
        Modifier.Node it$iv = node$iv$iv;
        FocusStateImpl previousOrInactive2 = previousOrInactive;
        if (it$iv == self$iv) goto L30;
        if ((it$iv.getKindSet$ui_release() & r5) == 0) goto L25;
        boolean r19 = true;
    L26:
        if (r19 == true) goto L92;
    L25:
        r19 = false;
    L30:
        if ((it$iv.getKindSet$ui_release() & r4) == 0) goto L32;
        boolean r110 = true;
    L33:
        if (r110 == false) goto L81;
        MutableVector r21 = null;
        Modifier.Node this_$iv$iv$iv = it$iv;
    L35:
        if (this_$iv$iv$iv == null) goto L81;
        focusState = focusState;
        if ((this_$iv$iv$iv instanceof FocusEventModifierNode) == true) goto L38;
        DelegatableNode $this$visitSelfAndAncestors_u2d5BbP62I$iv2 = $this$visitSelfAndAncestors_u2d5BbP62I$iv;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & r4) == 0) goto L42;
        boolean r2 = true;
    L43:
        if (r2 == false) goto L76;
        if ((this_$iv$iv$iv instanceof DelegatingNode) == false) goto L76;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) this_$iv$iv$iv;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L47:
        if (node$iv$iv$iv == null) goto L71;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & r4) == 0) goto L51;
        boolean r29 = true;
    L52:
        if (r29 == false) goto L69;
        count$iv$iv = count$iv$iv + 1;
        Modifier.Node r210 = this_$iv$iv$iv;
        if (count$iv$iv != 1) goto L56;
        Modifier.Node r18 = next$iv$iv;
        this_$iv$iv$iv2 = this_$iv$iv$iv2;
    L70:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        this_$iv$iv$iv = r18;
        this_$iv$iv$iv2 = this_$iv$iv$iv2;
        goto L47
    L56:
        if (r21 != null) goto L58;
        MutableVector r6 = new MutableVector(new Modifier.Node[16], 0);
    L60:
        if (r210 == null) goto L64;
        if (r6 == null) goto L63;
        r6.add(r210);
    L63:
        r18 = null;
    L65:
        if (r6 == null) goto L68;
        r6.add(next$iv$iv);
    L68:
        r21 = r6;
        count$iv$iv = count$iv$iv;
        goto L70
    L64:
        r18 = r210;
        goto L65
    L58:
        r6 = r21;
        goto L60
    L69:
        this_$iv$iv$iv2 = this_$iv$iv$iv2;
        r18 = this_$iv$iv$iv;
        goto L70
    L51:
        r29 = false;
        goto L52
    L71:
        Modifier.Node r211 = this_$iv$iv$iv;
        if (count$iv$iv != 1) goto L76;
        $this$visitSelfAndAncestors_u2d5BbP62I$iv = $this$visitSelfAndAncestors_u2d5BbP62I$iv2;
        this_$iv$iv$iv = r211;
    L76:
        this_$iv$iv$iv = DelegatableNodeKt.access$pop(r21);
        $this$visitSelfAndAncestors_u2d5BbP62I$iv = $this$visitSelfAndAncestors_u2d5BbP62I$iv2;
        goto L35
    L42:
        r2 = false;
        goto L43
    L38:
        FocusEventModifierNode it = (FocusEventModifierNode) this_$iv$iv$iv;
        $this$visitSelfAndAncestors_u2d5BbP62I$iv2 = $this$visitSelfAndAncestors_u2d5BbP62I$iv;
        it.onFocusEvent(FocusEventModifierNodeKt.getFocusState(it));
    L81:
        node$iv$iv = node$iv$iv.getParent$ui_release();
        previousOrInactive = previousOrInactive2;
        focusState = focusState;
        $this$visitSelfAndAncestors_u2d5BbP62I$iv = $this$visitSelfAndAncestors_u2d5BbP62I$iv;
        goto L17
    L32:
        r110 = false;
        goto L33
    L80:
        previousOrInactive2 = previousOrInactive;
        goto L81
    L82:
        FocusStateImpl previousOrInactive3 = previousOrInactive;
        FocusStateImpl focusState2 = focusState;
        DelegatableNode $this$visitSelfAndAncestors_u2d5BbP62I$iv3 = $this$visitSelfAndAncestors_u2d5BbP62I$iv;
    L84:
        layout$iv$iv = layout$iv$iv.getParent$ui_release();
        if (layout$iv$iv == null) goto L89;
        NodeChain r1 = layout$iv$iv.getNodes$ui_release();
        if (r1 == null) goto L89;
        Modifier.Node r7 = r1.getTail$ui_release();
    L90:
        node$iv$iv = r7;
        previousOrInactive = previousOrInactive3;
        focusState = focusState2;
        $this$visitSelfAndAncestors_u2d5BbP62I$iv = $this$visitSelfAndAncestors_u2d5BbP62I$iv3;
    L89:
        r7 = null;
        goto L90
    L83:
        previousOrInactive3 = previousOrInactive;
        focusState2 = focusState;
        $this$visitSelfAndAncestors_u2d5BbP62I$iv3 = $this$visitSelfAndAncestors_u2d5BbP62I$iv;
    L92:
        Function1<FocusTargetNode, Unit> r8 = this.onDispatchEventsCompleted;
        if (r8 == null) goto L117;
        r8.invoke(this);
        return;
    }

    public final void dispatchFocusCallbacks$ui_release(FocusState previousState, FocusState newState) {
        newState = newState;
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
        FocusTargetNode activeNode = focusOwner.getActiveFocusTargetNode();
        if (Intrinsics.areEqual(previousState, newState) == true) goto L8;
        Function2<FocusState, FocusState, Unit> r4 = this.onFocusChange;
        if (r4 == null) goto L8;
        r4.invoke(previousState, newState);
    L8:
        FocusTargetNode $this$visitSelfAndAncestors_u2d5BbP62I$iv = this;
        int r6 = NodeKind.m5976constructorimpl(4096);
        int r7 = NodeKind.m5976constructorimpl(1024);
        Modifier.Node self$iv = $this$visitSelfAndAncestors_u2d5BbP62I$iv.getNode();
        int mask$iv$iv = r6 | r7;
        boolean value$iv$iv$iv = $this$visitSelfAndAncestors_u2d5BbP62I$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L11;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L11:
        Modifier.Node node$iv$iv = $this$visitSelfAndAncestors_u2d5BbP62I$iv.getNode();
        LayoutNode layout$iv$iv = DelegatableNodeKt.requireLayoutNode($this$visitSelfAndAncestors_u2d5BbP62I$iv);
    L12:
        if (layout$iv$iv == null) goto L93;
        Modifier.Node head$iv$iv = layout$iv$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv$iv.getAggregateChildKindSet$ui_release() & mask$iv$iv) == 0) goto L84;
    L15:
        if (node$iv$iv == null) goto L83;
        if ((node$iv$iv.getKindSet$ui_release() & mask$iv$iv) == 0) goto L81;
        Modifier.Node it$iv = node$iv$iv;
        FocusOwner focusOwner2 = focusOwner;
        if (it$iv == self$iv) goto L28;
        if ((it$iv.getKindSet$ui_release() & r7) == 0) goto L23;
        boolean r17 = true;
    L24:
        if (r17 == true) goto L93;
    L23:
        r17 = false;
    L28:
        if ((it$iv.getKindSet$ui_release() & r6) == 0) goto L30;
        boolean r18 = true;
    L31:
        if (r18 == false) goto L82;
        MutableVector r22 = null;
        Modifier.Node it$iv2 = it$iv;
    L33:
        if (it$iv2 == null) goto L82;
        $this$visitSelfAndAncestors_u2d5BbP62I$iv = $this$visitSelfAndAncestors_u2d5BbP62I$iv;
        if ((it$iv2 instanceof FocusEventModifierNode) == true) goto L36;
        Modifier.Node this_$iv$iv$iv = it$iv2;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & r6) == 0) goto L44;
        boolean r5 = true;
    L45:
        if (r5 == false) goto L76;
        if ((it$iv2 instanceof DelegatingNode) == false) goto L76;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) it$iv2;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L49:
        if (node$iv$iv$iv == null) goto L72;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & r6) == 0) goto L53;
        boolean r29 = true;
    L54:
        if (r29 == false) goto L70;
        count$iv$iv = count$iv$iv + 1;
        if (count$iv$iv != 1) goto L58;
        it$iv2 = next$iv$iv;
        activeNode = activeNode;
    L71:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        activeNode = activeNode;
        goto L49
    L58:
        if (r22 != null) goto L60;
        MutableVector r2 = new MutableVector(new Modifier.Node[16], 0);
    L61:
        Modifier.Node theNode$iv$iv = it$iv2;
        if (theNode$iv$iv == null) goto L66;
        if (r2 == null) goto L65;
        r2.add(theNode$iv$iv);
    L65:
        it$iv2 = null;
    L66:
        if (r2 == null) goto L69;
        r2.add(next$iv$iv);
    L69:
        r22 = r2;
        it$iv2 = it$iv2;
        goto L71
    L60:
        r2 = r22;
        goto L61
    L70:
        activeNode = activeNode;
        goto L71
    L53:
        r29 = false;
        goto L54
    L72:
        Modifier.Node r31 = it$iv2;
        FocusTargetNode activeNode2 = activeNode;
        if (count$iv$iv != 1) goto L77;
        it$iv2 = r31;
        activeNode = activeNode2;
    L77:
        it$iv2 = DelegatableNodeKt.access$pop(r22);
        activeNode = activeNode2;
    L76:
        activeNode2 = activeNode;
        goto L77
    L44:
        r5 = false;
        goto L45
    L36:
        FocusEventModifierNode it = (FocusEventModifierNode) it$iv2;
        if (activeNode != focusOwner2.getActiveFocusTargetNode()) goto L40;
        it.onFocusEvent(newState);
    L40:
        activeNode2 = activeNode;
    L82:
        node$iv$iv = node$iv$iv.getParent$ui_release();
        newState = newState;
        focusOwner = focusOwner2;
        $this$visitSelfAndAncestors_u2d5BbP62I$iv = $this$visitSelfAndAncestors_u2d5BbP62I$iv;
        activeNode = activeNode;
        goto L15
    L30:
        r18 = false;
        goto L31
    L81:
        focusOwner2 = focusOwner;
        goto L82
    L83:
        FocusOwner focusOwner3 = focusOwner;
        FocusTargetNode activeNode3 = activeNode;
        DelegatableNode $this$visitSelfAndAncestors_u2d5BbP62I$iv2 = $this$visitSelfAndAncestors_u2d5BbP62I$iv;
    L85:
        layout$iv$iv = layout$iv$iv.getParent$ui_release();
        if (layout$iv$iv == null) goto L90;
        NodeChain r1 = layout$iv$iv.getNodes$ui_release();
        if (r1 == null) goto L90;
        Modifier.Node r3 = r1.getTail$ui_release();
    L91:
        node$iv$iv = r3;
        newState = newState;
        focusOwner = focusOwner3;
        $this$visitSelfAndAncestors_u2d5BbP62I$iv = $this$visitSelfAndAncestors_u2d5BbP62I$iv2;
        activeNode = activeNode3;
    L90:
        r3 = null;
        goto L91
    L84:
        focusOwner3 = focusOwner;
        activeNode3 = activeNode;
        $this$visitSelfAndAncestors_u2d5BbP62I$iv2 = $this$visitSelfAndAncestors_u2d5BbP62I$iv;
    L93:
        Function1<FocusTargetNode, Unit> r8 = this.onDispatchEventsCompleted;
        if (r8 == null) goto L117;
        r8.invoke(this);
        return;
    }

    public final boolean isInitialized$ui_release() {
        if (ComposeUiFlags.isTrackFocusEnabled == false) goto L6;
        return true;
    L6:
        if (this.committedFocusState != null) goto L11;
        return false;
    L11:
        return true;
    }

    public static /* synthetic */ void initializeFocusState$ui_release$default(FocusTargetNode r0, FocusStateImpl r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        r0.initializeFocusState$ui_release(r1);
    }

    private static final boolean initializeFocusState$isInActiveSubTree(FocusTargetNode this$0) {
        FocusTargetNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = this$0;
        int type$iv = NodeKind.m5976constructorimpl(1024);
        boolean includeSelf$iv = false;
        boolean value$iv$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
    L5:
        Modifier.Node node$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv.getNode().getParent$ui_release();
        LayoutNode layout$iv$iv = DelegatableNodeKt.requireLayoutNode($this$visitAncestors_u2dY_u2dYKmho_u24default$iv);
    L6:
        if (layout$iv$iv == null) goto L74;
        Modifier.Node head$iv$iv = layout$iv$iv.getNodes$ui_release().getHead$ui_release();
        if ((head$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L66;
    L9:
        if (node$iv$iv == null) goto L65;
        if ((node$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L64;
        Modifier.Node it$iv = node$iv$iv;
        MutableVector r15 = null;
        Modifier.Node r9 = it$iv;
    L13:
        if (r9 == null) goto L64;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        if ((r9 instanceof FocusTargetNode) == true) goto L16;
        Modifier.Node this_$iv$iv$iv = r9;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L29;
        boolean r18 = true;
    L30:
        if (r18 == false) goto L60;
        if ((r9 instanceof DelegatingNode) == false) goto L60;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r9;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L34:
        if (node$iv$iv$iv == null) goto L57;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L38;
        boolean r24 = true;
    L39:
        if (r24 == false) goto L55;
        count$iv$iv = count$iv$iv + 1;
        int type$iv2 = type$iv;
        if (count$iv$iv != 1) goto L43;
        r9 = next$iv$iv;
        includeSelf$iv = includeSelf$iv;
    L56:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        type$iv = type$iv2;
        includeSelf$iv = includeSelf$iv;
        goto L34
    L43:
        if (r15 != null) goto L45;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L46:
        r15 = r1;
        Modifier.Node theNode$iv$iv = r9;
        if (theNode$iv$iv == null) goto L51;
        if (r15 == null) goto L50;
        r15.add(theNode$iv$iv);
    L50:
        r9 = null;
    L51:
        if (r15 == null) goto L54;
        r15.add(next$iv$iv);
    L54:
        count$iv$iv = count$iv$iv;
        goto L56
    L45:
        r1 = r15;
        goto L46
    L55:
        type$iv2 = type$iv;
        includeSelf$iv = includeSelf$iv;
        goto L56
    L38:
        r24 = false;
        goto L39
    L57:
        int type$iv3 = type$iv;
        boolean includeSelf$iv2 = includeSelf$iv;
        if (count$iv$iv != 1) goto L61;
        type$iv = type$iv3;
        includeSelf$iv = includeSelf$iv2;
    L61:
        r9 = DelegatableNodeKt.access$pop(r15);
        type$iv = type$iv3;
        includeSelf$iv = includeSelf$iv2;
    L60:
        type$iv3 = type$iv;
        includeSelf$iv2 = includeSelf$iv;
        goto L61
    L29:
        r18 = false;
        goto L30
    L16:
        FocusTargetNode it = (FocusTargetNode) r9;
        if (it.isInitialized$ui_release() == true) goto L19;
        type$iv3 = type$iv;
        includeSelf$iv2 = includeSelf$iv;
        goto L61
    L19:
        switch(WhenMappings.$EnumSwitchMapping$1[it.getFocusState().ordinal()]) {
            case 1: goto L23;
            case 2: goto L23;
            case 3: goto L22;
            case 4: goto L23;
            default: goto L21;
        };
    L22:
        return true;
    L23:
        return false;
    L21:
        throw new NoWhenBranchMatchedException();
    L64:
        node$iv$iv = node$iv$iv.getParent$ui_release();
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        includeSelf$iv = includeSelf$iv;
        goto L9
    L65:
        DelegatableNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        int type$iv4 = type$iv;
        boolean includeSelf$iv3 = includeSelf$iv;
    L67:
        layout$iv$iv = layout$iv$iv.getParent$ui_release();
        if (layout$iv$iv == null) goto L72;
        NodeChain r0 = layout$iv$iv.getNodes$ui_release();
        if (r0 == null) goto L72;
        Modifier.Node r2 = r0.getTail$ui_release();
    L73:
        node$iv$iv = r2;
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv4;
        includeSelf$iv = includeSelf$iv3;
    L72:
        r2 = null;
        goto L73
    L66:
        $this$visitAncestors_u2dY_u2dYKmho_u24default$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv;
        type$iv4 = type$iv;
        includeSelf$iv3 = includeSelf$iv;
        goto L67
    L74:
        return false;
    }

    private static final boolean initializeFocusState$hasActiveChild(FocusTargetNode this$0) {
        FocusTargetNode $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv = this$0;
        int type$iv = NodeKind.m5976constructorimpl(1024);
        int r3 = 0;
        boolean value$iv$iv$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv.getNode().isAttached();
        if (value$iv$iv$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
    L5:
        boolean r12 = false;
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv.getNode().getChild$ui_release();
        if (child$iv$iv != null) goto L8;
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv.getNode(), false);
    L9:
        boolean r13 = true;
        if (branches$iv$iv.getSize() == 0) goto L12;
        boolean r8 = true;
    L13:
        if (r8 == false) goto L82;
        Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(branches$iv$iv.getSize() - 1);
        if ((branch$iv$iv.getAggregateChildKindSet$ui_release() & type$iv) == 0) goto L81;
        Modifier.Node node$iv$iv = branch$iv$iv;
    L17:
        if (node$iv$iv == null) goto L81;
        if ((node$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L77;
        Modifier.Node node$iv = node$iv$iv;
        MutableVector r17 = null;
        Modifier.Node r14 = node$iv;
    L21:
        if (r14 == null) goto L72;
        boolean r19 = r13;
        if ((r14 instanceof FocusTargetNode) == true) goto L24;
        Modifier.Node this_$iv$iv$iv = r14;
        if ((this_$iv$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L39;
        boolean r15 = r19;
    L40:
        if (r15 == false) goto L70;
        if ((r14 instanceof DelegatingNode) == false) goto L70;
        int count$iv$iv = 0;
        DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) r14;
        Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate$ui_release();
    L44:
        if (node$iv$iv$iv == null) goto L67;
        Modifier.Node next$iv$iv = node$iv$iv$iv;
        if ((next$iv$iv.getKindSet$ui_release() & type$iv) == 0) goto L48;
        boolean r25 = r19;
    L49:
        if (r25 == false) goto L65;
        count$iv$iv = count$iv$iv + 1;
        DelegatableNode $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2 = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv;
        if (count$iv$iv != r19) goto L53;
        r14 = next$iv$iv;
        type$iv = type$iv;
        r3 = r3;
    L66:
        node$iv$iv$iv = node$iv$iv$iv.getChild$ui_release();
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2;
        type$iv = type$iv;
        r3 = r3;
        r19 = true;
        goto L44
    L53:
        if (r17 != null) goto L55;
        MutableVector r1 = new MutableVector(new Modifier.Node[16], 0);
    L56:
        Modifier.Node theNode$iv$iv = r14;
        if (theNode$iv$iv == null) goto L61;
        if (r1 == null) goto L60;
        r1.add(theNode$iv$iv);
    L60:
        r14 = null;
    L61:
        if (r1 == null) goto L64;
        r1.add(next$iv$iv);
    L64:
        r17 = r1;
        goto L66
    L55:
        r1 = r17;
        goto L56
    L65:
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv2 = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        r3 = r3;
        goto L66
    L48:
        r25 = false;
        goto L49
    L67:
        DelegatableNode $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv3 = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv;
        int type$iv2 = type$iv;
        int r29 = r3;
        boolean r0 = true;
        if (count$iv$iv != 1) goto L71;
        r13 = true;
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv3;
        type$iv = type$iv2;
        r3 = r29;
    L71:
        r14 = DelegatableNodeKt.access$pop(r17);
        r13 = r0;
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv3;
        type$iv = type$iv2;
        r3 = r29;
    L70:
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv3 = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        r29 = r3;
        r0 = r19;
        goto L71
    L39:
        r15 = false;
        goto L40
    L24:
        Object it$iv = r14;
        FocusTargetNode it = (FocusTargetNode) it$iv;
        if (it.isInitialized$ui_release() == true) goto L28;
        boolean r21 = r19;
    L32:
        if (r21 == false) goto L33;
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv3 = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv;
        type$iv2 = type$iv;
        r29 = r3;
        r0 = r19;
        goto L71
    L33:
        boolean r2 = r19;
        boolean diveDeeper$iv$iv = false;
    L74:
        if (diveDeeper$iv$iv == true) goto L78;
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        r3 = r3;
        r12 = false;
    L78:
        node$iv$iv = node$iv$iv.getChild$ui_release();
        r13 = r2;
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        r3 = r3;
        goto L17
    L28:
        switch(WhenMappings.$EnumSwitchMapping$1[it.getFocusState().ordinal()]) {
            case 1: goto L35;
            case 2: goto L35;
            case 3: goto L35;
            case 4: goto L31;
            default: goto L30;
        };
    L31:
        r21 = false;
        goto L32
    L30:
        throw new NoWhenBranchMatchedException();
    L35:
        return r19;
    L72:
        r2 = r13;
        diveDeeper$iv$iv = r2;
        goto L74
    L77:
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        r3 = r3;
        r2 = r13;
    L81:
        DelegatableNodeKt.access$addLayoutNodeChildren(branches$iv$iv, branch$iv$iv, false);
        $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default$iv;
        type$iv = type$iv;
        r3 = r3;
        r12 = false;
        goto L9
    L82:
        return false;
    L12:
        r8 = r12;
        goto L13
    L8:
        branches$iv$iv.add(child$iv$iv);
        goto L9
    }

    public final void initializeFocusState$ui_release(FocusStateImpl initialFocusState) {
        if (isInitialized$ui_release() == true) goto L26;
        if (ComposeUiFlags.isTrackFocusEnabled == true) goto L24;
        FocusTransactionManager $this$iv = FocusTargetNodeKt.requireTransactionManager(this);
    L21:
        th = move-exception;
        FocusTransactionManager.access$commitTransaction($this$iv);
        throw th;
    L8:
        if ($this$iv.getOngoingTransaction() == false) goto L10;
        FocusTransactionManager.access$cancelTransaction($this$iv);     // Catch: Throwable -> L21
    L10:
        FocusTransactionManager.access$beginTransaction($this$iv);     // Catch: Throwable -> L21
        if (initialFocusState == null) goto L13;
        FocusStateImpl r4 = initialFocusState;
    L19:
        setFocusState(r4);     // Catch: Throwable -> L21
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L21
        FocusTransactionManager.access$commitTransaction($this$iv);
        return;
    L13:
        if (initializeFocusState$isInActiveSubTree(this) == true) goto L15;
    L17:
        r4 = FocusStateImpl.Inactive;     // Catch: Throwable -> L21
        goto L19
    L15:
        if (initializeFocusState$hasActiveChild(this) == false) goto L17;
        r4 = FocusStateImpl.ActiveParent;     // Catch: Throwable -> L21
        goto L19
    L24:
        return;
    L26:
        throw new IllegalStateException("Re-initializing focus target node.".toString());
    }
}
