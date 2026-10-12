package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* JADX INFO: compiled from: Transform.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class FlowKt__TransformKt$runningReduce$1$1<T> implements FlowCollector {
    final /* synthetic */ Ref.ObjectRef<Object> $accumulator;
    final /* synthetic */ Function3<T, T, Continuation<? super T>, Object> $operation;
    final /* synthetic */ FlowCollector<T> $this_unsafeFlow;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__TransformKt$runningReduce$1$1(Ref.ObjectRef<Object> r1, Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> r2, FlowCollector<? super T> r3) {
        this.$accumulator = r1;
        this.$operation = r2;
        this.$this_unsafeFlow = r3;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(T r9, Continuation<? super Unit> r10) {
        if ((r10 instanceof FlowKt__TransformKt$runningReduce$1$1$emit$1) == false) goto L7;
        FlowKt__TransformKt$runningReduce$1$1$emit$1 r0 = (FlowKt__TransformKt$runningReduce$1$1$emit$1) r10;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object r11 = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        ResultKt.throwOnFailure(r11);
    L26:
        return Unit.INSTANCE;
    L13:
        Ref.ObjectRef<Object> r12 = (Ref.ObjectRef) r0.L$1;
        FlowKt__TransformKt$runningReduce$1$1<T> r2 = (FlowKt__TransformKt$runningReduce$1$1) r0.L$0;
        ResultKt.throwOnFailure(r11);
        FlowKt__TransformKt$runningReduce$1$1<T> r3 = r2;
        Object r4 = r11;
    L21:
        FlowKt__TransformKt$runningReduce$1$1<T> r7 = r3;
        Ref.ObjectRef<Object> r5 = r12;
        r9 = (T) r4;
        FlowKt__TransformKt$runningReduce$1$1<T> r6 = r7;
    L22:
        r5.element = r9;
        FlowCollector<T> r13 = r6.$this_unsafeFlow;
        T r8 = r6.$accumulator.element;
        r0.L$0 = null;
        r0.L$1 = null;
        r0.label = 2;
        if (r13.emit(r8, r0) != r1) goto L26;
        return r1;
    L14:
        ResultKt.throwOnFailure(r11);
        r6 = this;
        r5 = r6.$accumulator;
        if (r6.$accumulator.element == NullSurrogateKt.NULL) goto L22;
        Function3<T, T, Continuation<? super T>, Object> r14 = r6.$operation;
        T r15 = r6.$accumulator.element;
        r0.L$0 = r6;
        r0.L$1 = r5;
        r0.label = 1;
        Object r16 = r14.invoke(r15, r9, r0);
        if (r16 != r1) goto L20;
        return r1;
    L20:
        r4 = r16;
        r12 = r5;
        r3 = r6;
        goto L21
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new FlowKt__TransformKt$runningReduce$1$1$emit$1(this, r10);
        goto L8
    }
}
