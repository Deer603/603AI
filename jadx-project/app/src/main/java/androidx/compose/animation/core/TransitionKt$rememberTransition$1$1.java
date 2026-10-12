package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1", f = "Transition.kt", i = {0}, l = {2147}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
final class TransitionKt$rememberTransition$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TransitionState<T> $transitionState;
    Object L$0;
    Object L$1;
    int label;

    TransitionKt$rememberTransition$1$1(TransitionState<T> r2, Continuation<? super TransitionKt$rememberTransition$1$1> r3) {
        this.$transitionState = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        return new TransitionKt$rememberTransition$1$1(this.$transitionState, r4);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((TransitionKt$rememberTransition$1$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
        TransitionState r1 = (TransitionState) this.L$1;
        Object owner$iv = null;
        Mutex $this$withLock_u24default$iv = (Mutex) this.L$0;
        ResultKt.throwOnFailure($result);
    L21:
        ((SeekableTransitionState) r1).setComposedTargetState$animation_core_release(r1.getTargetState());     // Catch: Throwable -> L18
        CancellableContinuation r5 = ((SeekableTransitionState) r1).getCompositionContinuation$animation_core_release();     // Catch: Throwable -> L18
        if (r5 == null) goto L15;
        Result.Companion r6 = Result.Companion;     // Catch: Throwable -> L18
        r5.resumeWith(Result.m7425constructorimpl(r1.getTargetState()));     // Catch: Throwable -> L18
    L15:
        ((SeekableTransitionState) r1).setCompositionContinuation$animation_core_release(null);     // Catch: Throwable -> L18
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L18
        $this$withLock_u24default$iv.unlock(owner$iv);
        return Unit.INSTANCE;
    L18:
        th = move-exception;
        $this$withLock_u24default$iv.unlock(owner$iv);
        throw th;
    L7:
        ResultKt.throwOnFailure($result);
        ((SeekableTransitionState) this.$transitionState).observeTotalDuration$animation_core_release();
        $this$withLock_u24default$iv = ((SeekableTransitionState) this.$transitionState).getCompositionContinuationMutex$animation_core_release();
        r1 = this.$transitionState;
        owner$iv = null;
        this.L$0 = $this$withLock_u24default$iv;
        this.L$1 = r1;
        this.label = 1;
        if ($this$withLock_u24default$iv.lock(null, this) != r0) goto L21;
        return r0;
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
