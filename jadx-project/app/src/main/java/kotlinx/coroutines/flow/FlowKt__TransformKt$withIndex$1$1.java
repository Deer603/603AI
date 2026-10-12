package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Transform.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class FlowKt__TransformKt$withIndex$1$1<T> implements FlowCollector {
    final /* synthetic */ Ref.IntRef $index;
    final /* synthetic */ FlowCollector<IndexedValue<? extends T>> $this_unsafeFlow;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__TransformKt$withIndex$1$1(FlowCollector<? super IndexedValue<? extends T>> r1, Ref.IntRef r2) {
        this.$this_unsafeFlow = r1;
        this.$index = r2;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(T r9, Continuation<? super Unit> r10) {
        if ((r10 instanceof FlowKt__TransformKt$withIndex$1$1$emit$1) == false) goto L7;
        FlowKt__TransformKt$withIndex$1$1$emit$1 r0 = (FlowKt__TransformKt$withIndex$1$1$emit$1) r10;
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
    L19:
        return Unit.INSTANCE;
    L13:
        ResultKt.throwOnFailure($result);
        FlowCollector<IndexedValue<? extends T>> r3 = this.$this_unsafeFlow;
        int index$iv = this.$index.element;
        this.$index.element = index$iv + 1;
        if (index$iv < 0) goto L21;
        IndexedValue<? extends T> r4 = new IndexedValue(index$iv, r9);
        r0.label = 1;
        Object value = r3.emit(r4, r0);
        if (value != r1) goto L19;
        return r1;
    L21:
        throw new ArithmeticException("Index overflow has happened");
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new FlowKt__TransformKt$withIndex$1$1$emit$1(this, r10);
        goto L8
    }
}
