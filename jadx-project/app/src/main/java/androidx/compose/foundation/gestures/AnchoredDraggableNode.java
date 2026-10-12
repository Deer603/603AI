package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BU\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011JM\u0010\u001c\u001a\u00020\u001d2=\u0010\u001e\u001a9\b\u0001\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u001d0 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0%\u0012\u0006\u0012\u0004\u0018\u00010&0\u001fH\u0096@¢\u0006\u0002\u0010'J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0082@¢\u0006\u0002\u0010+J\b\u0010,\u001a\u00020\u001dH\u0016J\b\u0010-\u001a\u00020\u001dH\u0016J\u001a\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u000200H\u0016ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u001a\u00103\u001a\u00020\u001d2\u0006\u0010*\u001a\u000204H\u0016ø\u0001\u0000¢\u0006\u0004\b5\u00102J\b\u0010\u000e\u001a\u00020\bH\u0016J[\u00106\u001a\u00020\u001d2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\b\u00107\u001a\u00020\u001dH\u0002J\u0012\u00108\u001a\u00020\u001d2\b\u00109\u001a\u0004\u0018\u00010\u0010H\u0002J\u0016\u0010:\u001a\u000200*\u000200H\u0002ø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u0016\u0010:\u001a\u000204*\u000204H\u0002ø\u0001\u0000¢\u0006\u0004\b=\u0010<J\u0016\u0010>\u001a\u00020)*\u000200H\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\u0016\u0010>\u001a\u00020)*\u000204H\u0002ø\u0001\u0000¢\u0006\u0004\bA\u0010@J\u0019\u0010B\u001a\u000200*\u00020)H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ\u0019\u0010E\u001a\u000204*\u00020)H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010DR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0010X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0012\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001bR\u0012\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006G"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableNode;", "T", "Landroidx/compose/foundation/gestures/DragGestureNode;", "state", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "enabled", "", "reverseDirection", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "startDragImmediately", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLjava/lang/Boolean;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/OverscrollEffect;Ljava/lang/Boolean;Landroidx/compose/foundation/gestures/FlingBehavior;)V", "density", "Landroidx/compose/ui/unit/Density;", "isReverseDirection", "()Z", "resolvedFlingBehavior", "getResolvedFlingBehavior", "()Landroidx/compose/foundation/gestures/FlingBehavior;", "setResolvedFlingBehavior", "(Landroidx/compose/foundation/gestures/FlingBehavior;)V", "Ljava/lang/Boolean;", "drag", "", "forEachDelta", "Lkotlin/Function2;", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "dragDelta", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fling", "", "velocity", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAttach", "onDensityChange", "onDragStarted", "startedPosition", "Landroidx/compose/ui/geometry/Offset;", "onDragStarted-k-4lQ0M", "(J)V", "onDragStopped", "Landroidx/compose/ui/unit/Velocity;", "onDragStopped-TH1AsA0", "update", "updateDensity", "updateFlingBehavior", "newFlingBehavior", "reverseIfNeeded", "reverseIfNeeded-MK-Hz9U", "(J)J", "reverseIfNeeded-AH228Gc", "toFloat", "toFloat-k-4lQ0M", "(J)F", "toFloat-TH1AsA0", "toOffset", "toOffset-tuRUvjQ", "(F)J", "toVelocity", "toVelocity-adjELrA", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AnchoredDraggableNode<T> extends DragGestureNode {
    private Density density;
    private FlingBehavior flingBehavior;
    private Orientation orientation;
    private OverscrollEffect overscrollEffect;
    public FlingBehavior resolvedFlingBehavior;
    private Boolean reverseDirection;
    private Boolean startDragImmediately;
    private AnchoredDraggableState<T> state;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2, reason: invalid class name */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "it", "Landroidx/compose/foundation/gestures/DraggableAnchors;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", f = "AnchoredDraggable.kt", i = {}, l = {408}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<Function1<? super DragEvent.DragDelta, Unit>, Continuation<? super Unit>, Object> $forEachDelta;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super Function1<? super DragEvent.DragDelta, Unit>, ? super Continuation<? super Unit>, ? extends Object> r2, AnchoredDraggableNode<T> r3, Continuation<? super AnonymousClass2> r4) {
            this.$forEachDelta = r2;
            this.this$0 = r3;
            super(3, r4);
        }

        public final Object invoke(AnchoredDragScope r4, DraggableAnchors<T> r5, Continuation<? super Unit> r6) {
            AnonymousClass2 r0 = new AnonymousClass2(this.$forEachDelta, this.this$0, r6);
            r0.L$0 = r4;
            return r0.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope r2, Object r3, Continuation<? super Unit> r4) {
            return invoke(r2, (DraggableAnchors) r3, r4);
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
            final AnchoredDragScope $this$anchoredDrag = (AnchoredDragScope) this.L$0;
            Function2<Function1<? super DragEvent.DragDelta, Unit>, Continuation<? super Unit>, Object> r2 = this.$forEachDelta;
            final AnchoredDraggableNode<T> r4 = this.this$0;
            Function1<DragEvent.DragDelta, Unit> r3 = new AnonymousClass1(r4, $this$anchoredDrag);
            this.label = 1;
            if (r2.invoke(r3, this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1, reason: invalid class name */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode", f = "AnchoredDraggable.kt", i = {1}, l = {455, 458}, m = "fling", n = {"leftoverVelocity"}, s = {"L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        AnonymousClass1(AnchoredDraggableNode<T> r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return AnchoredDraggableNode.access$fling(this.this$0, 0.0f, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "it", "Landroidx/compose/foundation/gestures/DraggableAnchors;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2", f = "AnchoredDraggable.kt", i = {}, l = {469}, m = "invokeSuspend", n = {}, s = {})
    static final class C02322 extends SuspendLambda implements Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.FloatRef $leftoverVelocity;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        C02322(AnchoredDraggableNode<T> r2, Ref.FloatRef r3, float r4, Continuation<? super C02322> r5) {
            this.this$0 = r2;
            this.$leftoverVelocity = r3;
            this.$velocity = r4;
            super(3, r5);
        }

        public final Object invoke(AnchoredDragScope r5, DraggableAnchors<T> r6, Continuation<? super Unit> r7) {
            C02322 r0 = new C02322(this.this$0, this.$leftoverVelocity, this.$velocity, r7);
            r0.L$0 = r5;
            return r0.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope r2, Object r3, Continuation<? super Unit> r4) {
            return invoke(r2, (DraggableAnchors) r3, r4);
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
            Ref.FloatRef r1 = (Ref.FloatRef) this.L$0;
            ResultKt.throwOnFailure($result);
        L11:
            r1.element = ((Number) $result).floatValue();
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            final AnchoredDragScope $this$anchoredDrag = (AnchoredDragScope) this.L$0;
            final AnchoredDraggableNode<T> r3 = this.this$0;
            ScrollScope r2 = new AnchoredDraggableNode$fling$2$scrollScope$1(r3, $this$anchoredDrag);
            FlingBehavior $this$invokeSuspend_u24lambda_u240 = this.this$0.getResolvedFlingBehavior();
            Ref.FloatRef r4 = this.$leftoverVelocity;
            float r5 = this.$velocity;
            this.L$0 = r4;
            this.label = 1;
            Object r6 = $this$invokeSuspend_u24lambda_u240.performFling(r2, r5, this);
            if (r6 != r0) goto L10;
            return r0;
        L10:
            $result = r6;
            r1 = r4;
            goto L11
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final /* synthetic */ Object access$fling(AnchoredDraggableNode $this, float velocity, Continuation $completion) {
        return $this.fling(velocity, $completion);
    }

    public static final /* synthetic */ OverscrollEffect access$getOverscrollEffect$p(AnchoredDraggableNode $this) {
        return $this.overscrollEffect;
    }

    public static final /* synthetic */ AnchoredDraggableState access$getState$p(AnchoredDraggableNode $this) {
        return $this.state;
    }

    /* JADX INFO: renamed from: access$reverseIfNeeded-AH228Gc, reason: not valid java name */
    public static final /* synthetic */ long m382access$reverseIfNeededAH228Gc(AnchoredDraggableNode $this, long $receiver) {
        return $this.m388reverseIfNeededAH228Gc($receiver);
    }

    /* JADX INFO: renamed from: access$reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public static final /* synthetic */ long m383access$reverseIfNeededMKHz9U(AnchoredDraggableNode $this, long $receiver) {
        return $this.m389reverseIfNeededMKHz9U($receiver);
    }

    /* JADX INFO: renamed from: access$toFloat-TH1AsA0, reason: not valid java name */
    public static final /* synthetic */ float m384access$toFloatTH1AsA0(AnchoredDraggableNode $this, long $receiver) {
        return $this.m390toFloatTH1AsA0($receiver);
    }

    /* JADX INFO: renamed from: access$toFloat-k-4lQ0M, reason: not valid java name */
    public static final /* synthetic */ float m385access$toFloatk4lQ0M(AnchoredDraggableNode $this, long $receiver) {
        return $this.m391toFloatk4lQ0M($receiver);
    }

    /* JADX INFO: renamed from: access$toOffset-tuRUvjQ, reason: not valid java name */
    public static final /* synthetic */ long m386access$toOffsettuRUvjQ(AnchoredDraggableNode $this, float $receiver) {
        return $this.m392toOffsettuRUvjQ($receiver);
    }

    /* JADX INFO: renamed from: access$toVelocity-adjELrA, reason: not valid java name */
    public static final /* synthetic */ long m387access$toVelocityadjELrA(AnchoredDraggableNode $this, float $receiver) {
        return $this.m393toVelocityadjELrA($receiver);
    }

    public AnchoredDraggableNode(AnchoredDraggableState<T> r2, Orientation orientation, boolean enabled, Boolean reverseDirection, MutableInteractionSource interactionSource, OverscrollEffect overscrollEffect, Boolean startDragImmediately, FlingBehavior flingBehavior) {
        super(AnchoredDraggableKt.access$getAlwaysDrag$p(), enabled, interactionSource, orientation);
        this.state = r2;
        this.orientation = orientation;
        this.reverseDirection = reverseDirection;
        this.overscrollEffect = overscrollEffect;
        this.startDragImmediately = startDragImmediately;
        this.flingBehavior = flingBehavior;
    }

    public final FlingBehavior getResolvedFlingBehavior() {
        FlingBehavior r0 = this.resolvedFlingBehavior;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.throwUninitializedPropertyAccessException("resolvedFlingBehavior");
        return null;
    }

    public final void setResolvedFlingBehavior(FlingBehavior r1) {
        this.resolvedFlingBehavior = r1;
    }

    private final boolean isReverseDirection() {
        if (this.reverseDirection == null) goto L5;
        Boolean r0 = this.reverseDirection;
        Intrinsics.checkNotNull(r0);
        return r0.booleanValue();
    L5:
        if (DelegatableNodeKt.requireLayoutDirection(this) == LayoutDirection.Rtl) goto L7;
    L9:
        return false;
    L7:
        if (this.orientation != Orientation.Horizontal) goto L9;
        return true;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateFlingBehavior(this.flingBehavior);
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        onCancelPointerInput();
        if (isAttached() == false) goto L6;
        updateDensity();
        return;
    }

    private final void updateDensity() {
        Density newDensity = DelegatableNodeKt.requireDensity(this);
        if (this.density != null) goto L5;
    L6:
        this.density = newDensity;
        updateFlingBehavior(this.flingBehavior);
        return;
    L5:
        if (Intrinsics.areEqual(this.density, newDensity) == false) goto L6;
    }

    private final void updateFlingBehavior(FlingBehavior newFlingBehavior) {
        if (newFlingBehavior != null) goto L4;
        AnimationSpec<Float> r0 = AnchoredDraggableDefaults.INSTANCE.getSnapAnimationSpec();
        Function1<Float, Float> r1 = AnchoredDraggableDefaults.INSTANCE.getPositionalThreshold();
        Density it = DelegatableNodeKt.requireDensity(this);
        this.density = it;
        TargetedFlingBehavior r2 = AnchoredDraggableKt.anchoredDraggableFlingBehavior(this.state, it, r1, r0);
    L5:
        setResolvedFlingBehavior(r2);
        return;
    L4:
        r2 = newFlingBehavior;
        goto L5
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public Object drag(Function2<? super Function1<? super DragEvent.DragDelta, Unit>, ? super Continuation<? super Unit>, ? extends Object> r7, Continuation<? super Unit> r8) {
        Object r9 = AnchoredDraggableState.anchoredDrag$default(this.state, null, new AnonymousClass2(r7, this, null), r8, 1, null);
        if (r9 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r9;
    L6:
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* JADX INFO: renamed from: onDragStarted-k-4lQ0M, reason: not valid java name */
    public void mo394onDragStartedk4lQ0M(long startedPosition) {
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* JADX INFO: renamed from: onDragStopped-TH1AsA0, reason: not valid java name */
    public void mo395onDragStoppedTH1AsA0(long velocity) {
        if (isAttached() == true) goto L5;
        return;
    L5:
        BuildersKt.launch$default(getCoroutineScope(), null, null, new AnchoredDraggableNode$onDragStopped$1(this, velocity, null), 3, null);
    }

    private final Object fling(float velocity, Continuation<? super Float> r12) {
        if ((r12 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r12;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        AnonymousClass1 r4 = r0;
        Object $result = r4.result;
        Object r7 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r4.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        Ref.FloatRef leftoverVelocity = (Ref.FloatRef) r4.L$0;
        ResultKt.throwOnFailure($result);
    L25:
        return Boxing.boxFloat(leftoverVelocity.element);
    L13:
        ResultKt.throwOnFailure($result);
        return $result;
    L14:
        ResultKt.throwOnFailure($result);
        if (this.state.getUsePreModifierChangeBehavior$foundation_release() == false) goto L20;
        AnchoredDraggableState<T> r1 = this.state;
        r4.label = 1;
        Object r11 = r1.settle(velocity, r4);
        if (r11 != r7) goto L26;
        return r7;
    L26:
        return r11;
    L20:
        Ref.FloatRef leftoverVelocity2 = new Ref.FloatRef();
        leftoverVelocity2.element = velocity;
        AnchoredDraggableState<T> r2 = this.state;
        C02322 r3 = new C02322(this, leftoverVelocity2, velocity, null);
        r4.L$0 = leftoverVelocity2;
        r4.label = 2;
        if (AnchoredDraggableState.anchoredDrag$default(r2, null, r3, r4, 1, null) != r7) goto L23;
        return r7;
    L23:
        leftoverVelocity = leftoverVelocity2;
        goto L25
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(this, r12);
        goto L8
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        Boolean r0 = this.startDragImmediately;
        if (r0 == null) goto L6;
        return r0.booleanValue();
    L6:
        return this.state.isAnimationRunning();
    }

    public final void update(AnchoredDraggableState<T> r13, Orientation orientation, boolean enabled, Boolean reverseDirection, MutableInteractionSource interactionSource, OverscrollEffect overscrollEffect, Boolean startDragImmediately, FlingBehavior flingBehavior) {
        this.flingBehavior = flingBehavior;
        boolean resetPointerInputHandling = false;
        if (Intrinsics.areEqual(this.state, r13) == true) goto L6;
        this.state = r13;
        updateFlingBehavior(flingBehavior);
        resetPointerInputHandling = true;
    L6:
        if (this.orientation == orientation) goto L9;
        this.orientation = orientation;
        resetPointerInputHandling = true;
    L9:
        if (Intrinsics.areEqual(this.reverseDirection, reverseDirection) == true) goto L11;
        this.reverseDirection = reverseDirection;
        boolean resetPointerInputHandling2 = true;
    L12:
        this.startDragImmediately = startDragImmediately;
        this.overscrollEffect = overscrollEffect;
        DragGestureNode.update$default(this, null, enabled, interactionSource, orientation, resetPointerInputHandling2, 1, null);
        return;
    L11:
        resetPointerInputHandling2 = resetPointerInputHandling;
        goto L12
    }

    /* JADX INFO: renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    private final long m392toOffsettuRUvjQ(float $this$toOffset_u2dtuRUvjQ) {
        float y$iv = 0.0f;
        if (this.orientation != Orientation.Horizontal) goto L5;
        float x$iv = $this$toOffset_u2dtuRUvjQ;
    L7:
        if (this.orientation != Orientation.Vertical) goto L9;
        y$iv = $this$toOffset_u2dtuRUvjQ;
    L9:
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    L5:
        x$iv = 0.0f;
        goto L7
    }

    /* JADX INFO: renamed from: toVelocity-adjELrA, reason: not valid java name */
    private final long m393toVelocityadjELrA(float $this$toVelocity_u2dadjELrA) {
        float r2 = 0.0f;
        if (this.orientation != Orientation.Horizontal) goto L5;
        float r0 = $this$toVelocity_u2dadjELrA;
    L7:
        if (this.orientation != Orientation.Vertical) goto L10;
        r2 = $this$toVelocity_u2dadjELrA;
    L10:
        return VelocityKt.Velocity(r0, r2);
    L5:
        r0 = 0.0f;
        goto L7
    }

    /* JADX INFO: renamed from: toFloat-TH1AsA0, reason: not valid java name */
    private final float m390toFloatTH1AsA0(long $this$toFloat_u2dTH1AsA0) {
        if (this.orientation != Orientation.Vertical) goto L6;
        return Velocity.m7212getYimpl($this$toFloat_u2dTH1AsA0);
    L6:
        return Velocity.m7211getXimpl($this$toFloat_u2dTH1AsA0);
    }

    /* JADX INFO: renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    private final float m391toFloatk4lQ0M(long $this$toFloat_u2dk_u2d4lQ0M) {
        if (this.orientation != Orientation.Vertical) goto L5;
        int bits$iv$iv$iv = (int) (4294967295L & $this$toFloat_u2dk_u2d4lQ0M);
        return Float.intBitsToFloat(bits$iv$iv$iv);
    L5:
        int bits$iv$iv$iv2 = (int) ($this$toFloat_u2dk_u2d4lQ0M >> 32);
        return Float.intBitsToFloat(bits$iv$iv$iv2);
    }

    /* JADX INFO: renamed from: reverseIfNeeded-AH228Gc, reason: not valid java name */
    private final long m388reverseIfNeededAH228Gc(long $this$reverseIfNeeded_u2dAH228Gc) {
        if (isReverseDirection() == false) goto L5;
        float r0 = -1.0f;
    L7:
        return Velocity.m7217timesadjELrA($this$reverseIfNeeded_u2dAH228Gc, r0);
    L5:
        r0 = 1.0f;
        goto L7
    }

    /* JADX INFO: renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    private final long m389reverseIfNeededMKHz9U(long $this$reverseIfNeeded_u2dMK_u2dHz9U) {
        if (isReverseDirection() == false) goto L5;
        float r0 = -1.0f;
    L7:
        return Offset.m4132timestuRUvjQ($this$reverseIfNeeded_u2dMK_u2dHz9U, r0);
    L5:
        r0 = 1.0f;
        goto L7
    }
}
