package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Transform.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class FlowKt__TransformKt$runningFold$1$1<T> implements FlowCollector {
    final /* synthetic */ Ref.ObjectRef<R> $accumulator;
    final /* synthetic */ Function3<R, T, Continuation<? super R>, Object> $operation;
    final /* synthetic */ FlowCollector<R> $this_unsafeFlow;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__TransformKt$runningFold$1$1(Ref.ObjectRef<R> r1, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> r2, FlowCollector<? super R> r3) {
        this.$accumulator = r1;
        this.$operation = r2;
        this.$this_unsafeFlow = r3;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(T r9, Continuation<? super Unit> r10) {
        if ((r10 instanceof FlowKt__TransformKt$runningFold$1$1$emit$1) == false) goto L7;
        FlowKt__TransformKt$runningFold$1$1$emit$1 r0 = (FlowKt__TransformKt$runningFold$1$1$emit$1) r10;
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
    L22:
        return Unit.INSTANCE;
    L13:
        Ref.ObjectRef r12 = (Ref.ObjectRef) r0.L$1;
        FlowKt__TransformKt$runningFold$1$1<T> r2 = (FlowKt__TransformKt$runningFold$1$1) r0.L$0;
        ResultKt.throwOnFailure(r11);
        FlowKt__TransformKt$runningFold$1$1<T> r3 = r2;
        T r4 = (T) r11;
    L18:
        r12.element = r4;
        FlowCollector<R> r13 = r3.$this_unsafeFlow;
        T r5 = r3.$accumulator.element;
        r0.L$0 = null;
        r0.L$1 = null;
        r0.label = 2;
        if (r13.emit((R) r5, r0) != r1) goto L22;
        return r1;
    L14:
        ResultKt.throwOnFailure(r11);
        Ref.ObjectRef r6 = this.$accumulator;
        Function3<R, T, Continuation<? super R>, Object> r7 = this.$operation;
        T r8 = this.$accumulator.element;
        r0.L$0 = this;
        r0.L$1 = r6;
        r0.label = 1;
        Object r14 = r7.invoke((R) r8, r9, r0);
        if (r14 != r1) goto L17;
        return r1;
    L17:
        r4 = (T) r14;
        r12 = r6;
        r3 = this;
        goto L18
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new FlowKt__TransformKt$runningFold$1$1$emit$1(this, r10);
        goto L8
    }
}
