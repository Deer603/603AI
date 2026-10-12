package androidx.compose.runtime;

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

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ControlledComposition $composition;
    int label;
    final /* synthetic */ Recomposer this$0;

    Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2(Recomposer r2, ControlledComposition r3, Continuation<? super Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2> r4) {
        this.this$0 = r2;
        this.$composition = r3;
        super(2, r4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        return new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2(this.this$0, this.$composition, r5);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r8) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        ResultKt.throwOnFailure(r8);
        ControlledComposition changedComposition = Recomposer.access$performRecompose(this.this$0, this.$composition, null);
        Object lock$iv = Recomposer.access$getStateLock$p(this.this$0);
        Recomposer r2 = this.this$0;
        monitor-enter(lock$iv);
        if (changedComposition != null) goto L22;
    L14:
        Recomposer.access$setConcurrentCompositionsOutstanding$p(r2, Recomposer.access$getConcurrentCompositionsOutstanding$p(r2) - 1);     // Catch: Throwable -> L12
        CancellableContinuation r0 = Recomposer.access$deriveStateLocked(r2);     // Catch: Throwable -> L12
        monitor-exit(lock$iv);
        if (r0 == null) goto L19;
        Result.Companion r1 = Result.Companion;
        r0.resumeWith(Result.m7425constructorimpl(Unit.INSTANCE));
    L19:
        return Unit.INSTANCE;
    L12:
        th = move-exception;
        throw th;
    L22:
        Recomposer.access$getCompositionsAwaitingApply$p(r2).add(changedComposition);     // Catch: Throwable -> L12
        goto L14
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
