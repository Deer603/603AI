package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "result", "Lkotlinx/coroutines/channels/ChannelResult;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class FlowKt__DelayKt$sample$2$1$1 extends SuspendLambda implements Function2<ChannelResult<? extends Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<Object> $lastValue;
    final /* synthetic */ ReceiveChannel<Unit> $ticker;
    /* synthetic */ Object L$0;
    int label;

    FlowKt__DelayKt$sample$2$1$1(Ref.ObjectRef<Object> r2, ReceiveChannel<Unit> r3, Continuation<? super FlowKt__DelayKt$sample$2$1$1> r4) {
        this.$lastValue = r2;
        this.$ticker = r3;
        super(2, r4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        FlowKt__DelayKt$sample$2$1$1 r0 = new FlowKt__DelayKt$sample$2$1$1(this.$lastValue, this.$ticker, r5);
        r0.L$0 = r4;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ChannelResult<? extends Object> r3, Continuation<? super Unit> r4) {
        return m8953invokeWpGqRn0(r3.m8938unboximpl(), r4);
    }

    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m8953invokeWpGqRn0(Object r3, Continuation<? super Unit> r4) {
        return ((FlowKt__DelayKt$sample$2$1$1) create(ChannelResult.m8926boximpl(r3), r4)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, kotlinx.coroutines.internal.Symbol] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r9) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        ResultKt.throwOnFailure(r9);
        ?? r1 = ((ChannelResult) this.L$0).m8938unboximpl();
        Ref.ObjectRef<Object> r2 = this.$lastValue;
        if ((r1 instanceof ChannelResult.Failed) == true) goto L9;
        r2.element = r1;
    L9:
        ReceiveChannel<Unit> r3 = this.$ticker;
        Ref.ObjectRef<Object> r4 = this.$lastValue;
        if ((r1 instanceof ChannelResult.Failed) == false) goto L16;
        Throwable it = ChannelResult.m8930exceptionOrNullimpl(r1);
        if (it != null) goto L15;
        r3.cancel(new ChildCancelledException());
        r4.element = NullSurrogateKt.DONE;
        goto L16
    L15:
        throw it;
    L16:
        Object $this$onFailure_u2dWpGqRn0$iv = Unit.INSTANCE;
        return $this$onFailure_u2dWpGqRn0$iv;
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
