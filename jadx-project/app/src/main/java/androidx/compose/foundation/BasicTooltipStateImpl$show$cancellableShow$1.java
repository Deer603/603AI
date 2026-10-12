package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: BasicTooltip.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.BasicTooltipStateImpl$show$cancellableShow$1", f = "BasicTooltip.kt", i = {}, l = {391}, m = "invokeSuspend", n = {}, s = {})
final class BasicTooltipStateImpl$show$cancellableShow$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ BasicTooltipStateImpl this$0;

    BasicTooltipStateImpl$show$cancellableShow$1(BasicTooltipStateImpl r2, Continuation<? super BasicTooltipStateImpl$show$cancellableShow$1> r3) {
        this.this$0 = r2;
        super(1, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> r3) {
        return new BasicTooltipStateImpl$show$cancellableShow$1(this.this$0, r3);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Unit> r2) {
        return invoke2(r2);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super Unit> r3) {
        return ((BasicTooltipStateImpl$show$cancellableShow$1) create(r3)).invokeSuspend(Unit.INSTANCE);
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
        BasicTooltipStateImpl r1 = (BasicTooltipStateImpl) this.L$0;
        ResultKt.throwOnFailure($result);
    L14:
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
        BasicTooltipStateImpl r2 = this.this$0;
        this.L$0 = r2;
        this.label = 1;
        BasicTooltipStateImpl$show$cancellableShow$1 uCont$iv = this;
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(uCont$iv), 1);
        cancellable$iv.initCancellability();
        CancellableContinuationImpl continuation = cancellable$iv;
        r2.setVisible(true);
        BasicTooltipStateImpl.access$setJob$p(r2, continuation);
        Object r3 = cancellable$iv.getResult();
        if (r3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        DebugProbesKt.probeCoroutineSuspended(this);
    L10:
        if (r3 != r0) goto L14;
        return r0;
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
