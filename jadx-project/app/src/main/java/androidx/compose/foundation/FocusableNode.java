package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.ui.focus.Focusability;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.relocation.BringIntoViewModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: Focusable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u00019B1\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0002\u0010\u000fJ\b\u0010%\u001a\u00020\u000eH\u0002J\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\rH\u0002J\b\u0010(\u001a\u00020\u000eH\u0002J\u0018\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0002J\u0010\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u0019H\u0016J\b\u0010/\u001a\u00020\u000eH\u0016J\b\u00100\u001a\u00020\u000eH\u0016J\n\u00101\u001a\u0004\u0018\u000102H\u0002J\u0010\u00103\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\f\u00104\u001a\u00020\u000e*\u000205H\u0016J\u0014\u00106\u001a\u00020\u000e*\u00020\b2\u0006\u00107\u001a\u000208H\u0002R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006:"}, d2 = {"Landroidx/compose/foundation/FocusableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/node/TraversableNode;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "focusability", "Landroidx/compose/ui/focus/Focusability;", "onFocusChange", "Lkotlin/Function1;", "", "", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "focusTargetNode", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "focusedBoundsObserver", "Landroidx/compose/foundation/FocusedBoundsObserverNode;", "getFocusedBoundsObserver", "()Landroidx/compose/foundation/FocusedBoundsObserverNode;", "focusedInteraction", "Landroidx/compose/foundation/interaction/FocusInteraction$Focus;", "globalLayoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "pinnedHandle", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "requestFocus", "Lkotlin/Function0;", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "traverseKey", "", "getTraverseKey", "()Ljava/lang/Object;", "disposeInteractionSource", "emitInteraction", "isFocused", "notifyObserverWhenAttached", "onFocusStateChange", "previousState", "Landroidx/compose/ui/focus/FocusState;", "currentState", "onGloballyPositioned", "coordinates", "onObservedReadsChanged", "onReset", "retrievePinnableContainer", "Landroidx/compose/ui/layout/PinnableContainer;", "update", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "emitWithFallback", "interaction", "Landroidx/compose/foundation/interaction/Interaction;", "TraverseKey", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FocusableNode extends DelegatingNode implements SemanticsModifierNode, GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode, ObserverModifierNode, TraversableNode {
    public static final int $stable = 0;
    private static final TraverseKey TraverseKey = null;
    private final FocusTargetModifierNode focusTargetNode;
    private FocusInteraction.Focus focusedInteraction;
    private LayoutCoordinates globalLayoutCoordinates;
    private MutableInteractionSource interactionSource;
    private final Function1<Boolean, Unit> onFocusChange;
    private PinnableContainer.PinnedHandle pinnedHandle;
    private Function0<Boolean> requestFocus;
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: compiled from: Focusable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/FocusableNode$TraverseKey;", "", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class TraverseKey {
        public /* synthetic */ TraverseKey(DefaultConstructorMarker r1) {
            this();
        }

        private TraverseKey() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.FocusableNode$emitWithFallback$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Focusable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.FocusableNode$emitWithFallback$1", f = "Focusable.kt", i = {}, l = {314}, m = "invokeSuspend", n = {}, s = {})
    static final class C02141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DisposableHandle $handler;
        final /* synthetic */ Interaction $interaction;
        final /* synthetic */ MutableInteractionSource $this_emitWithFallback;
        int label;

        C02141(MutableInteractionSource r2, Interaction r3, DisposableHandle r4, Continuation<? super C02141> r5) {
            this.$this_emitWithFallback = r2;
            this.$interaction = r3;
            this.$handler = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            return new C02141(this.$this_emitWithFallback, this.$interaction, this.$handler, r6);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((C02141) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L10:
            DisposableHandle r1 = this.$handler;
            if (r1 == null) goto L14;
            r1.dispose();
        L14:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            this.label = 1;
            if (this.$this_emitWithFallback.emit(this.$interaction, this) != r0) goto L10;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.FocusableNode$onFocusStateChange$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Focusable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.FocusableNode$onFocusStateChange$1", f = "Focusable.kt", i = {}, l = {214}, m = "invokeSuspend", n = {}, s = {})
    static final class C02151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ FocusableNode this$0;

        C02151(FocusableNode r2, Continuation<? super C02151> r3) {
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new C02151(this.this$0, r4);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((C02151) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L11:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            this.label = 1;
            if (BringIntoViewModifierNodeKt.bringIntoView$default(this.this$0, null, this, 1, null) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        TraverseKey = new TraverseKey(null);
        $stable = 8;
    }

    public /* synthetic */ FocusableNode(MutableInteractionSource r1, int r2, Function1 r3, DefaultConstructorMarker r4) {
        this(r1, r2, r3);
    }

    public /* synthetic */ FocusableNode(MutableInteractionSource r1, int r2, Function1 r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L5;
        r2 = Focusability.Companion.m4061getAlwaysLCbbffg();
    L5:
        DefaultConstructorMarker r6 = null;
        if ((r4 & 4) == 0) goto L8;
        r3 = null;
    L8:
        this(r1, r2, r3, r6);
    }

    public static final /* synthetic */ FocusTargetModifierNode access$getFocusTargetNode$p(FocusableNode $this) {
        return $this.focusTargetNode;
    }

    public static final /* synthetic */ void access$onFocusStateChange(FocusableNode $this, FocusState previousState, FocusState currentState) {
        $this.onFocusStateChange(previousState, currentState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FocusableNode(MutableInteractionSource interactionSource, int focusability, Function1<? super Boolean, Unit> r4) {
        this.interactionSource = interactionSource;
        this.onFocusChange = r4;
        this.focusTargetNode = (FocusTargetModifierNode) delegate(FocusTargetModifierNodeKt.m4042FocusTargetModifierNodePYyLHbc(focusability, new FocusableNode$focusTargetNode$1(this)));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return TraverseKey;
    }

    private final FocusedBoundsObserverNode getFocusedBoundsObserver() {
        if (isAttached() == false) goto L10;
        TraversableNode r0 = TraversableNodeKt.findNearestAncestor(this, FocusedBoundsObserverNode.TraverseKey);
        if ((r0 instanceof FocusedBoundsObserverNode) == true) goto L9;
        return null;
    L9:
        return (FocusedBoundsObserverNode) r0;
    L10:
        return null;
    }

    public final void update(MutableInteractionSource interactionSource) {
        if (Intrinsics.areEqual(this.interactionSource, interactionSource) == true) goto L6;
        disposeInteractionSource();
        this.interactionSource = interactionSource;
        return;
    }

    private final void onFocusStateChange(FocusState previousState, FocusState currentState) {
        if (isAttached() == true) goto L5;
        return;
    L5:
        boolean isFocused = currentState.isFocused();
        boolean wasFocused = previousState.isFocused();
        if (isFocused != wasFocused) goto L8;
        return;
    L8:
        Function1<Boolean, Unit> r2 = this.onFocusChange;
        if (r2 == null) goto L11;
        r2.invoke(Boolean.valueOf(isFocused));
    L11:
        PinnableContainer.PinnedHandle r3 = null;
        if (isFocused == false) goto L17;
        BuildersKt.launch$default(getCoroutineScope(), null, null, new C02151(this, null), 3, null);
        PinnableContainer pinnableContainer = retrievePinnableContainer();
        if (pinnableContainer == null) goto L16;
        r3 = pinnableContainer.pin();
    L16:
        this.pinnedHandle = r3;
        notifyObserverWhenAttached();
    L23:
        SemanticsModifierNodeKt.invalidateSemantics(this);
        emitInteraction(isFocused);
        return;
    L17:
        PinnableContainer.PinnedHandle r4 = this.pinnedHandle;
        if (r4 == null) goto L20;
        r4.release();
    L20:
        this.pinnedHandle = null;
        FocusedBoundsObserverNode r5 = getFocusedBoundsObserver();
        if (r5 == null) goto L23;
        r5.onFocusBoundsChanged(null);
        goto L23
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver $this$applySemantics) {
        SemanticsPropertiesKt.setFocused($this$applySemantics, this.focusTargetNode.getFocusState().isFocused());
        if (this.requestFocus != null) goto L5;
        this.requestFocus = new AnonymousClass1(this);
    L5:
        SemanticsPropertiesKt.requestFocus$default($this$applySemantics, null, this.requestFocus, 1, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        PinnableContainer.PinnedHandle r0 = this.pinnedHandle;
        if (r0 == null) goto L5;
        r0.release();
    L5:
        this.pinnedHandle = null;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        PinnableContainer pinnableContainer = retrievePinnableContainer();
        if (this.focusTargetNode.getFocusState().isFocused() == false) goto L12;
        PinnableContainer.PinnedHandle r1 = this.pinnedHandle;
        if (r1 == null) goto L7;
        r1.release();
    L7:
        if (pinnableContainer == null) goto L9;
        PinnableContainer.PinnedHandle r2 = pinnableContainer.pin();
    L10:
        this.pinnedHandle = r2;
        return;
    L9:
        r2 = null;
        goto L10
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        this.globalLayoutCoordinates = coordinates;
        if (this.focusTargetNode.getFocusState().isFocused() == true) goto L6;
        return;
    L6:
        if (coordinates.isAttached() == false) goto L8;
        notifyObserverWhenAttached();
        return;
    L8:
        FocusedBoundsObserverNode r0 = getFocusedBoundsObserver();
        if (r0 == null) goto L13;
        r0.onFocusBoundsChanged(null);
        return;
    }

    private final PinnableContainer retrievePinnableContainer() {
        final Ref.ObjectRef container = new Ref.ObjectRef();
        ObserverModifierNodeKt.observeReads(this, new C02161(container, this));
        return (PinnableContainer) container.element;
    }

    private final void notifyObserverWhenAttached() {
        if (this.globalLayoutCoordinates == null) goto L10;
        LayoutCoordinates r0 = this.globalLayoutCoordinates;
        Intrinsics.checkNotNull(r0);
        if (r0.isAttached() == false) goto L11;
        FocusedBoundsObserverNode r1 = getFocusedBoundsObserver();
        if (r1 == null) goto L12;
        r1.onFocusBoundsChanged(this.globalLayoutCoordinates);
        return;
    L12:
        return;
    L11:
        return;
    }

    private final void emitInteraction(boolean isFocused) {
        MutableInteractionSource interactionSource = this.interactionSource;
        if (interactionSource == null) goto L12;
        FocusInteraction.Focus oldValue = this.focusedInteraction;
        if (isFocused == false) goto L9;
        if (oldValue == null) goto L8;
        FocusInteraction.Unfocus interaction = new FocusInteraction.Unfocus(oldValue);
        emitWithFallback(interactionSource, interaction);
        this.focusedInteraction = null;
    L8:
        FocusInteraction.Focus interaction2 = new FocusInteraction.Focus();
        emitWithFallback(interactionSource, interaction2);
        this.focusedInteraction = interaction2;
        return;
    L9:
        if (oldValue == null) goto L15;
        emitWithFallback(interactionSource, new FocusInteraction.Unfocus(oldValue));
        this.focusedInteraction = null;
        return;
    L15:
        return;
    }

    private final void disposeInteractionSource() {
        MutableInteractionSource interactionSource = this.interactionSource;
        if (interactionSource == null) goto L8;
        FocusInteraction.Focus oldValue = this.focusedInteraction;
        if (oldValue == null) goto L8;
        FocusInteraction.Unfocus interaction = new FocusInteraction.Unfocus(oldValue);
        interactionSource.tryEmit(interaction);
    L8:
        this.focusedInteraction = null;
    }

    private final void emitWithFallback(final MutableInteractionSource $this$emitWithFallback, final Interaction interaction) {
        if (isAttached() == false) goto L9;
        Job r0 = (Job) getCoroutineScope().getCoroutineContext().get(Job.Key);
        if (r0 == null) goto L7;
        DisposableHandle handler = r0.invokeOnCompletion(new FocusableNode$emitWithFallback$handler$1($this$emitWithFallback, interaction));
    L8:
        BuildersKt.launch$default(getCoroutineScope(), null, null, new C02141($this$emitWithFallback, interaction, handler, null), 3, null);
        return;
    L7:
        handler = null;
        goto L8
    L9:
        $this$emitWithFallback.tryEmit(interaction);
    }
}
