package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: TransformableState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateBy$3", f = "TransformableState.kt", i = {}, l = {230}, m = "invokeSuspend", n = {}, s = {})
final class TransformableStateKt$animateBy$3 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DelegatingAnimationSpec $animationSpec;
    final /* synthetic */ Ref.ObjectRef<AnimationData> $previousState;
    final /* synthetic */ AnimationData $targetState;
    private /* synthetic */ Object L$0;
    int label;

    TransformableStateKt$animateBy$3(Ref.ObjectRef<AnimationData> r2, AnimationData r3, DelegatingAnimationSpec r4, Continuation<? super TransformableStateKt$animateBy$3> r5) {
        this.$previousState = r2;
        this.$targetState = r3;
        this.$animationSpec = r4;
        super(2, r5);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
        TransformableStateKt$animateBy$3 r0 = new TransformableStateKt$animateBy$3(this.$previousState, this.$targetState, this.$animationSpec, r6);
        r0.L$0 = r5;
        return r0;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(TransformScope r3, Continuation<? super Unit> r4) {
        return ((TransformableStateKt$animateBy$3) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(TransformScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L7;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        ResultKt.throwOnFailure($result);
    L12:
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
        final TransformScope $this$transform = (TransformScope) this.L$0;
        AnimationState r15 = AnimationStateKt.AnimationState$default(AnimationDataConverter.INSTANCE, this.$previousState.element, TransformableStateKt.access$getZeroAnimationVelocity$p(), 0, 0, false, 56, null);
        AnimationData r4 = this.$targetState;
        DelegatingAnimationSpec r17 = this.$animationSpec;
        final Ref.ObjectRef<AnimationData> r6 = this.$previousState;
        this.label = 1;
        if (SuspendAnimationKt.animateTo$default(r15, r4, r17, false, new AnonymousClass1(r6, $this$transform), this, 4, null) != r1) goto L12;
        return r1;
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
