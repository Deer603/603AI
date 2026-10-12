package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.selects.SelectImplementation;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a2\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u001a7\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u0004H\u0007¢\u0006\u0002\b\b\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0007\u001a0\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0002\b\r\u001a\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0000\u001a&\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0005H\u0007\u001a0\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\n\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\n\u001a0\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"debounce", "Lkotlinx/coroutines/flow/Flow;", "T", "timeoutMillis", "Lkotlin/Function1;", "", "timeout", "Lkotlin/time/Duration;", "debounceDuration", "debounce-HG0u8IE", "(Lkotlinx/coroutines/flow/Flow;J)Lkotlinx/coroutines/flow/Flow;", "debounceInternal", "timeoutMillisSelector", "debounceInternal$FlowKt__DelayKt", "fixedPeriodTicker", "Lkotlinx/coroutines/channels/ReceiveChannel;", "", "Lkotlinx/coroutines/CoroutineScope;", "delayMillis", "sample", "periodMillis", "period", "sample-HG0u8IE", "timeout-HG0u8IE", "timeoutInternal", "timeoutInternal-HG0u8IE$FlowKt__DelayKt", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__DelayKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1, reason: invalid class name */
    /* JADX INFO: compiled from: Delay.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1", f = "Delay.kt", i = {0, 1, 2}, l = {307, 309, 310}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<ProducerScope<? super Unit>, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $delayMillis;
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(long r2, Continuation<? super AnonymousClass1> r4) {
            this.$delayMillis = r2;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            AnonymousClass1 r0 = new AnonymousClass1(this.$delayMillis, r5);
            r0.L$0 = r4;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ProducerScope<? super Unit> r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(ProducerScope<? super Unit> r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0069 -> B:13:0x0046). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L9;
                case 1: goto L8;
                case 2: goto L7;
                case 3: goto L6;
                default: goto L5;
            };
        L6:
            AnonymousClass1 r1 = this;
            ProducerScope $this$produce = (ProducerScope) r1.L$0;
            ResultKt.throwOnFailure($result);
        L13:
            r1.L$0 = $this$produce;
            r1.label = 2;
            if ($this$produce.getChannel().send(Unit.INSTANCE, r1) != r0) goto L16;
            return r0;
        L16:
            r1.L$0 = $this$produce;
            r1.label = 3;
            if (DelayKt.delay(r1.$delayMillis, r1) != r0) goto L13;
            return r0;
        L7:
            r1 = this;
            $this$produce = (ProducerScope) r1.L$0;
            ResultKt.throwOnFailure($result);
            goto L16
        L8:
            r1 = this;
            $this$produce = (ProducerScope) r1.L$0;
            ResultKt.throwOnFailure($result);
            goto L13
        L9:
            ResultKt.throwOnFailure($result);
            r1 = this;
            $this$produce = (ProducerScope) r1.L$0;
            r1.L$0 = $this$produce;
            r1.label = 1;
            if (DelayKt.delay(r1.$delayMillis, r1) != r0) goto L13;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Delay.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "downstream", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {415}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "ticker"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class C07572<T> extends SuspendLambda implements Function3<CoroutineScope, FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $periodMillis;
        final /* synthetic */ Flow<T> $this_sample;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C07572(long r2, Flow<? extends T> r4, Continuation<? super C07572> r5) {
            this.$periodMillis = r2;
            this.$this_sample = r4;
            super(3, r5);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Object r3, Continuation<? super Unit> r4) {
            return invoke(r2, (FlowCollector) r3, r4);
        }

        public final Object invoke(CoroutineScope r5, FlowCollector<? super T> r6, Continuation<? super Unit> r7) {
            C07572 r0 = new C07572(this.$periodMillis, this.$this_sample, r7);
            r0.L$0 = r5;
            r0.L$1 = r6;
            return r0.invokeSuspend(Unit.INSTANCE);
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
            C07572<T> r1 = this;
            ReceiveChannel<Unit> r5 = (ReceiveChannel) r1.L$3;
            Ref.ObjectRef lastValue = (Ref.ObjectRef) r1.L$2;
            ReceiveChannel values = (ReceiveChannel) r1.L$1;
            FlowCollector downstream = (FlowCollector) r1.L$0;
            ResultKt.throwOnFailure($result);
        L9:
            if (lastValue.element == NullSurrogateKt.DONE) goto L16;
            SelectImplementation $this$select_u24lambda_u241$iv = new SelectImplementation(r1.getContext());
            SelectImplementation $this$invokeSuspend_u24lambda_u240 = $this$select_u24lambda_u241$iv;
            $this$invokeSuspend_u24lambda_u240.invoke(values.getOnReceiveCatching(), new FlowKt__DelayKt$sample$2$1$1(lastValue, r5, null));
            $this$invokeSuspend_u24lambda_u240.invoke(r5.getOnReceive(), new FlowKt__DelayKt$sample$2$1$2(lastValue, downstream, null));
            r1.L$0 = downstream;
            r1.L$1 = values;
            r1.L$2 = lastValue;
            r1.L$3 = r5;
            r1.label = 1;
            if ($this$select_u24lambda_u241$iv.doSelect(r1) != r0) goto L9;
            return r0;
        L16:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            r1 = this;
            CoroutineScope $this$scopedFlow = (CoroutineScope) r1.L$0;
            FlowCollector downstream2 = (FlowCollector) r1.L$1;
            ReceiveChannel values2 = ProduceKt.produce$default($this$scopedFlow, null, -1, new FlowKt__DelayKt$sample$2$values$1(r1.$this_sample, null), 1, null);
            lastValue = new Ref.ObjectRef();
            ReceiveChannel<Unit> r7 = FlowKt.fixedPeriodTicker($this$scopedFlow, r1.$periodMillis);
            values = values2;
            r5 = r7;
            downstream = downstream2;
            goto L9
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Flow<T> debounce(Flow<? extends T> r3, final long timeoutMillis) {
        if (timeoutMillis < 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L13;
        if (timeoutMillis != 0) goto L11;
        return r3;
    L11:
        return debounceInternal$FlowKt__DelayKt(r3, new AnonymousClass2(timeoutMillis));
    L13:
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    L5:
        r2 = false;
        goto L6
    }

    public static final <T> Flow<T> debounce(Flow<? extends T> r1, Function1<? super T, Long> r2) {
        return debounceInternal$FlowKt__DelayKt(r1, r2);
    }

    /* JADX INFO: renamed from: debounce-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m8948debounceHG0u8IE(Flow<? extends T> r2, long timeout) {
        return FlowKt.debounce(r2, DelayKt.m8905toDelayMillisLRDsOJo(timeout));
    }

    public static final <T> Flow<T> debounceDuration(Flow<? extends T> r1, final Function1<? super T, Duration> r2) {
        return debounceInternal$FlowKt__DelayKt(r1, new AnonymousClass3(r2));
    }

    private static final <T> Flow<T> debounceInternal$FlowKt__DelayKt(Flow<? extends T> r2, Function1<? super T, Long> r3) {
        return FlowCoroutineKt.scopedFlow(new FlowKt__DelayKt$debounceInternal$1(r3, r2, null));
    }

    public static final <T> Flow<T> sample(Flow<? extends T> r2, long periodMillis) {
        if (periodMillis <= 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L10;
        return FlowCoroutineKt.scopedFlow(new C07572(periodMillis, r2, null));
    L10:
        throw new IllegalArgumentException("Sample period should be positive".toString());
    L5:
        r0 = false;
        goto L6
    }

    public static final ReceiveChannel<Unit> fixedPeriodTicker(CoroutineScope $this$fixedPeriodTicker, long delayMillis) {
        return ProduceKt.produce$default($this$fixedPeriodTicker, null, 0, new AnonymousClass1(delayMillis, null), 1, null);
    }

    /* JADX INFO: renamed from: sample-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m8949sampleHG0u8IE(Flow<? extends T> r2, long period) {
        return FlowKt.sample(r2, DelayKt.m8905toDelayMillisLRDsOJo(period));
    }

    /* JADX INFO: renamed from: timeout-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m8950timeoutHG0u8IE(Flow<? extends T> r1, long timeout) {
        return m8951timeoutInternalHG0u8IE$FlowKt__DelayKt(r1, timeout);
    }

    /* JADX INFO: renamed from: timeoutInternal-HG0u8IE$FlowKt__DelayKt, reason: not valid java name */
    private static final <T> Flow<T> m8951timeoutInternalHG0u8IE$FlowKt__DelayKt(Flow<? extends T> r2, long timeout) {
        return FlowCoroutineKt.scopedFlow(new FlowKt__DelayKt$timeoutInternal$1(timeout, r2, null));
    }
}
