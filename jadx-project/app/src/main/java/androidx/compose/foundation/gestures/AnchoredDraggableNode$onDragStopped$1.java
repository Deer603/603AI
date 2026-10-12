package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", f = "AnchoredDraggable.kt", i = {}, l = {434, 436}, m = "invokeSuspend", n = {}, s = {})
final class AnchoredDraggableNode$onDragStopped$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $velocity;
    int label;
    final /* synthetic */ AnchoredDraggableNode<T> this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Velocity;", "T", "availableVelocity"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1", f = "AnchoredDraggable.kt", i = {0}, l = {438}, m = "invokeSuspend", n = {"availableVelocity"}, s = {"J$0"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<Velocity, Continuation<? super Velocity>, Object> {
        /* synthetic */ long J$0;
        int label;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        AnonymousClass1(AnchoredDraggableNode<T> r2, Continuation<? super AnonymousClass1> r3) {
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            AnonymousClass1 r0 = new AnonymousClass1(this.this$0, r5);
            r0.J$0 = ((Velocity) r4).m7220unboximpl();
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Velocity r4, Continuation<? super Velocity> r5) {
            return m397invokesFctU(r4.m7220unboximpl(), r5);
        }

        /* JADX INFO: renamed from: invoke-sF-c-tU, reason: not valid java name */
        public final Object m397invokesFctU(long r3, Continuation<? super Velocity> r5) {
            return ((AnonymousClass1) create(Velocity.m7202boximpl(r3), r5)).invokeSuspend(Unit.INSTANCE);
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
            long availableVelocity = this.J$0;
            ResultKt.throwOnFailure($result);
            long availableVelocity2 = availableVelocity;
        L11:
            float consumed = ((Number) $result).floatValue();
            float currentOffset = AnchoredDraggableNode.access$getState$p(this.this$0).requireOffset();
            float minAnchor = AnchoredDraggableNode.access$getState$p(this.this$0).getAnchors().minPosition();
            float maxAnchor = AnchoredDraggableNode.access$getState$p(this.this$0).getAnchors().maxPosition();
            if (currentOffset < maxAnchor) goto L14;
        L17:
            availableVelocity2 = AnchoredDraggableNode.m387access$toVelocityadjELrA(this.this$0, consumed);
        L19:
            return Velocity.m7202boximpl(availableVelocity2);
        L14:
            if (currentOffset > minAnchor) goto L19;
        L7:
            ResultKt.throwOnFailure($result);
            availableVelocity2 = this.J$0;
            this.J$0 = availableVelocity2;
            this.label = 1;
            Object r3 = AnchoredDraggableNode.access$fling(this.this$0, AnchoredDraggableNode.m384access$toFloatTH1AsA0(this.this$0, availableVelocity2), this);
            if (r3 != r0) goto L10;
            return r0;
        L10:
            $result = r3;
            goto L11
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    AnchoredDraggableNode$onDragStopped$1(AnchoredDraggableNode<T> r2, long r3, Continuation<? super AnchoredDraggableNode$onDragStopped$1> r5) {
        this.this$0 = r2;
        this.$velocity = r3;
        super(2, r5);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
        return new AnchoredDraggableNode$onDragStopped$1(this.this$0, this.$velocity, r6);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((AnchoredDraggableNode$onDragStopped$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L8;
            case 1: goto L7;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        ResultKt.throwOnFailure($result);
    L19:
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
        goto L19
    L8:
        ResultKt.throwOnFailure($result);
        float oneDirectionalVelocity = AnchoredDraggableNode.m384access$toFloatTH1AsA0(this.this$0, AnchoredDraggableNode.m382access$reverseIfNeededAH228Gc(this.this$0, this.$velocity));
        OverscrollEffect r2 = AnchoredDraggableNode.access$getOverscrollEffect$p(this.this$0);
        AnchoredDraggableNode<T> r3 = this.this$0;
        if (r2 != null) goto L14;
        this.label = 1;
        if (AnchoredDraggableNode.access$fling(r3, oneDirectionalVelocity, this) != r0) goto L19;
        return r0;
    L14:
        OverscrollEffect r4 = AnchoredDraggableNode.access$getOverscrollEffect$p(r3);
        Intrinsics.checkNotNull(r4);
        this.label = 2;
        if (r4.mo212applyToFlingBMRW4eQ(AnchoredDraggableNode.m387access$toVelocityadjELrA(this.this$0, oneDirectionalVelocity), new AnonymousClass1(this.this$0, null), this) != r0) goto L19;
        return r0;
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
