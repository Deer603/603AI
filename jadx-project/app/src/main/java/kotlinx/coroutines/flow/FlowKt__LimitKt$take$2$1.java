package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class FlowKt__LimitKt$take$2$1<T> implements FlowCollector {
    final /* synthetic */ Ref.IntRef $consumed;
    final /* synthetic */ int $count;
    final /* synthetic */ Object $ownershipMarker;
    final /* synthetic */ FlowCollector<T> $this_unsafeFlow;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__LimitKt$take$2$1(Ref.IntRef r1, int r2, FlowCollector<? super T> r3, Object r4) {
        this.$consumed = r1;
        this.$count = r2;
        this.$this_unsafeFlow = r3;
        this.$ownershipMarker = r4;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(T r8, Continuation<? super Unit> r9) {
        if ((r9 instanceof FlowKt__LimitKt$take$2$1$emit$1) == false) goto L7;
        FlowKt__LimitKt$take$2$1$emit$1 r0 = (FlowKt__LimitKt$take$2$1$emit$1) r9;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        ResultKt.throwOnFailure($result);
    L19:
        return Unit.INSTANCE;
    L13:
        ResultKt.throwOnFailure($result);
        this.$consumed.element = this.$consumed.element + 1;
        int r3 = this.$consumed.element;
        int r4 = this.$count;
        FlowCollector<T> r6 = this.$this_unsafeFlow;
        if (r3 >= r4) goto L20;
        r0.label = 1;
        Object value = r6.emit(r8, r0);
        if (value != r1) goto L19;
        return r1;
    L20:
        Object r5 = this.$ownershipMarker;
        r0.label = 2;
        Object value2 = FlowKt__LimitKt.access$emitAbort$FlowKt__LimitKt(r6, r8, r5, r0);
        if (value2 != r1) goto L19;
        return r1;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new FlowKt__LimitKt$take$2$1$emit$1(this, r9);
        goto L8
    }
}
