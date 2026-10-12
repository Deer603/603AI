package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.selects.OnTimeoutKt;
import kotlinx.coroutines.selects.SelectImplementation;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "downStream", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", i = {0, 0}, l = {416}, m = "invokeSuspend", n = {"downStream", "values"}, s = {"L$0", "L$1"})
final class FlowKt__DelayKt$timeoutInternal$1<T> extends SuspendLambda implements Function3<CoroutineScope, FlowCollector<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<T> $this_timeoutInternal;
    final /* synthetic */ long $timeout;
    long J$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__DelayKt$timeoutInternal$1(long r2, Flow<? extends T> r4, Continuation<? super FlowKt__DelayKt$timeoutInternal$1> r5) {
        this.$timeout = r2;
        this.$this_timeoutInternal = r4;
        super(3, r5);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Object r3, Continuation<? super Unit> r4) {
        return invoke(r2, (FlowCollector) r3, r4);
    }

    public final Object invoke(CoroutineScope r5, FlowCollector<? super T> r6, Continuation<? super Unit> r7) {
        FlowKt__DelayKt$timeoutInternal$1 r0 = new FlowKt__DelayKt$timeoutInternal$1(this.$timeout, this.$this_timeoutInternal, r7);
        r0.L$0 = r5;
        r0.L$1 = r6;
        return r0.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0095 -> B:14:0x0099). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r17) {
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L7;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        FlowKt__DelayKt$timeoutInternal$1<T> r2 = this;
        Object $result = r17;
        long r8 = r2.J$0;
        ReceiveChannel values = (ReceiveChannel) r2.L$1;
        FlowCollector downStream = (FlowCollector) r2.L$0;
        ResultKt.throwOnFailure($result);
        Object $result2 = $result;
    L15:
        if (((Boolean) $result).booleanValue() == false) goto L17;
        Object $result3 = $result2;
    L10:
        SelectImplementation $this$select_u24lambda_u241$iv$iv = new SelectImplementation(r2.getContext());
        SelectImplementation $this$invokeSuspend_u24lambda_u240 = $this$select_u24lambda_u241$iv$iv;
        $this$invokeSuspend_u24lambda_u240.invoke(values.getOnReceiveCatching(), new FlowKt__DelayKt$timeoutInternal$1$1$1(downStream, null));
        OnTimeoutKt.m8982onTimeout8Mi8wO0($this$invokeSuspend_u24lambda_u240, r8, new FlowKt__DelayKt$timeoutInternal$1$1$2(r8, null));
        r2.L$0 = downStream;
        r2.L$1 = values;
        r2.J$0 = r8;
        r2.label = 1;
        Object r1 = $this$select_u24lambda_u241$iv$iv.doSelect(r2);
        if (r1 != r0) goto L13;
        return r0;
    L13:
        Object r7 = $result3;
        $result = r1;
        $result2 = r7;
        goto L15
    L17:
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure(r17);
        r2 = this;
        $result3 = r17;
        CoroutineScope $this$scopedFlow = (CoroutineScope) r2.L$0;
        FlowCollector downStream2 = (FlowCollector) r2.L$1;
        if (Duration.m8763compareToLRDsOJo(r2.$timeout, Duration.Companion.m8855getZEROUwyO8pc()) <= 0) goto L20;
        ReceiveChannel values2 = FlowKt.produceIn(FlowKt.buffer$default(r2.$this_timeoutInternal, 0, null, 2, null), $this$scopedFlow);
        values = values2;
        downStream = downStream2;
        r8 = r2.$timeout;
        goto L10
    L20:
        throw new TimeoutCancellationException("Timed out immediately");
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
