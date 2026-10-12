package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.OnTimeoutKt;
import kotlinx.coroutines.selects.SelectImplementation;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "downstream", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {215, 418}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
final class FlowKt__DelayKt$debounceInternal$1<T> extends SuspendLambda implements Function3<CoroutineScope, FlowCollector<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<T> $this_debounceInternal;
    final /* synthetic */ Function1<T, Long> $timeoutMillisSelector;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__DelayKt$debounceInternal$1(Function1<? super T, Long> r2, Flow<? extends T> r3, Continuation<? super FlowKt__DelayKt$debounceInternal$1> r4) {
        this.$timeoutMillisSelector = r2;
        this.$this_debounceInternal = r3;
        super(3, r4);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Object r3, Continuation<? super Unit> r4) {
        return invoke(r2, (FlowCollector) r3, r4);
    }

    public final Object invoke(CoroutineScope r4, FlowCollector<? super T> r5, Continuation<? super Unit> r6) {
        FlowKt__DelayKt$debounceInternal$1 r0 = new FlowKt__DelayKt$debounceInternal$1(this.$timeoutMillisSelector, this.$this_debounceInternal, r6);
        r0.L$0 = r4;
        r0.L$1 = r5;
        return r0.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x013f -> B:53:0x0141). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        long r4 = 0;
        int r6 = 1;
        switch(this.label) {
            case 0: goto L8;
            case 1: goto L7;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        FlowKt__DelayKt$debounceInternal$1<T> r2 = this;
        Ref.ObjectRef lastValue = (Ref.ObjectRef) r2.L$2;
        ReceiveChannel values = (ReceiveChannel) r2.L$1;
        FlowCollector downstream = (FlowCollector) r2.L$0;
        ResultKt.throwOnFailure($result);
    L53:
        Ref.ObjectRef lastValue2 = lastValue;
        ReceiveChannel values2 = values;
        FlowCollector downstream2 = downstream;
        r4 = 0;
        r6 = 1;
    L10:
        if (lastValue2.element == NullSurrogateKt.DONE) goto L55;
        Ref.LongRef timeoutMillis = new Ref.LongRef();
        if (lastValue2.element == null) goto L32;
        Function1<T, Long> r13 = r2.$timeoutMillisSelector;
        Symbol this_$iv = NullSurrogateKt.NULL;
        T r15 = lastValue2.element;
        if (r15 != this_$iv) goto L16;
        r15 = null;
    L16:
        timeoutMillis.element = r13.invoke(r15).longValue();
        if (timeoutMillis.element < r4) goto L19;
        int r14 = r6;
    L20:
        if (r14 == 0) goto L31;
        if (timeoutMillis.element != r4) goto L32;
        Symbol this_$iv2 = NullSurrogateKt.NULL;
        T r16 = lastValue2.element;
        if (r16 != this_$iv2) goto L26;
        r16 = null;
    L26:
        r2.L$0 = downstream2;
        r2.L$1 = values2;
        r2.L$2 = lastValue2;
        r2.L$3 = timeoutMillis;
        r2.label = r6;
        if (downstream2.emit(r16, r2) != r0) goto L29;
        return r0;
    L29:
        lastValue2.element = null;
        downstream = downstream2;
        values = values2;
        lastValue = lastValue2;
    L34:
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L36;
    L46:
        SelectImplementation $this$select_u24lambda_u241$iv = new SelectImplementation(r2.getContext());
        SelectImplementation $this$invokeSuspend_u24lambda_u242 = $this$select_u24lambda_u241$iv;
        if (lastValue.element == null) goto L49;
        OnTimeoutKt.onTimeout($this$invokeSuspend_u24lambda_u242, timeoutMillis.element, new FlowKt__DelayKt$debounceInternal$1$3$1(downstream, lastValue, null));
    L49:
        $this$invokeSuspend_u24lambda_u242.invoke(values.getOnReceiveCatching(), new FlowKt__DelayKt$debounceInternal$1$3$2(lastValue, downstream, null));
        r2.L$0 = downstream;
        r2.L$1 = values;
        r2.L$2 = lastValue;
        r2.L$3 = null;
        r2.label = 2;
        if ($this$select_u24lambda_u241$iv.doSelect(r2) != r0) goto L53;
        return r0;
    L36:
        if (lastValue.element != null) goto L38;
    L41:
        int r10 = r6;
    L42:
        if (r10 != 0) goto L46;
        throw new AssertionError();
    L38:
        if (timeoutMillis.element > r4) goto L41;
        r10 = 0;
        goto L42
    L31:
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    L19:
        r14 = 0;
    L32:
        downstream = downstream2;
        values = values2;
        lastValue = lastValue2;
        goto L34
    L55:
        return Unit.INSTANCE;
    L7:
        r2 = this;
        timeoutMillis = (Ref.LongRef) r2.L$3;
        lastValue2 = (Ref.ObjectRef) r2.L$2;
        values2 = (ReceiveChannel) r2.L$1;
        downstream2 = (FlowCollector) r2.L$0;
        ResultKt.throwOnFailure($result);
        goto L29
    L8:
        ResultKt.throwOnFailure($result);
        r2 = this;
        CoroutineScope $this$scopedFlow = (CoroutineScope) r2.L$0;
        FlowCollector downstream3 = (FlowCollector) r2.L$1;
        ReceiveChannel values3 = ProduceKt.produce$default($this$scopedFlow, null, 0, new FlowKt__DelayKt$debounceInternal$1$values$1(r2.$this_debounceInternal, null), 3, null);
        values2 = values3;
        lastValue2 = new Ref.ObjectRef();
        downstream2 = downstream3;
        goto L10
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
