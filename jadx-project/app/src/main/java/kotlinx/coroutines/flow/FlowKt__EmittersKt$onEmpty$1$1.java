package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Emitters.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class FlowKt__EmittersKt$onEmpty$1$1<T> implements FlowCollector {
    final /* synthetic */ Ref.BooleanRef $isEmpty;
    final /* synthetic */ FlowCollector<T> $this_unsafeFlow;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__EmittersKt$onEmpty$1$1(Ref.BooleanRef r1, FlowCollector<? super T> r2) {
        this.$isEmpty = r1;
        this.$this_unsafeFlow = r2;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(T r6, Continuation<? super Unit> r7) {
        if ((r7 instanceof FlowKt__EmittersKt$onEmpty$1$1$emit$1) == false) goto L7;
        FlowKt__EmittersKt$onEmpty$1$1$emit$1 r0 = (FlowKt__EmittersKt$onEmpty$1$1$emit$1) r7;
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
        ResultKt.throwOnFailure($result);
    L17:
        return Unit.INSTANCE;
    L13:
        ResultKt.throwOnFailure($result);
        this.$isEmpty.element = false;
        FlowCollector<T> r3 = this.$this_unsafeFlow;
        r0.label = 1;
        Object it = r3.emit(r6, r0);
        if (it != r1) goto L17;
        return r1;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new FlowKt__EmittersKt$onEmpty$1$1$emit$1(this, r7);
        goto L8
    }
}
