package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 176)
public final class FlowKt__LimitKt$collectWhile$collector$1<T> implements FlowCollector<T> {
    final /* synthetic */ Function2<T, Continuation<? super Boolean>, Object> $predicate;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$collectWhile$collector$1(Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> r1) {
        this.$predicate = r1;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T r6, Continuation<? super Unit> r7) {
        if ((r7 instanceof FlowKt__LimitKt$collectWhile$collector$1$emit$1) == false) goto L7;
        FlowKt__LimitKt$collectWhile$collector$1$emit$1 r0 = (FlowKt__LimitKt$collectWhile$collector$1$emit$1) r7;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        FlowKt__LimitKt$collectWhile$collector$1<T> r8 = (FlowKt__LimitKt$collectWhile$collector$1) r0.L$0;
        ResultKt.throwOnFailure($result);
        FlowKt__LimitKt$collectWhile$collector$1<T> r2 = r8;
        Object value = $result;
    L17:
        if (((Boolean) value).booleanValue() == false) goto L21;
        return Unit.INSTANCE;
    L21:
        throw new AbortFlowException(r2);
    L13:
        ResultKt.throwOnFailure($result);
        r2 = this;
        Function2<T, Continuation<? super Boolean>, Object> r3 = r2.$predicate;
        r0.L$0 = r2;
        r0.label = 1;
        value = r3.invoke(r6, r0);
        if (value != r1) goto L17;
        return r1;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, r7);
        goto L8
    }

    public Object emit$$forInline(T r2, Continuation<? super Unit> r3) {
        new FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, r3);
        if (((Boolean) this.$predicate.invoke(r2, r3)).booleanValue() == false) goto L7;
        return Unit.INSTANCE;
    L7:
        throw new AbortFlowException(this);
    }
}
