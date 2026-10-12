package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.ChannelResult;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "value", "Lkotlinx/coroutines/channels/ChannelResult;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {236}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements Function2<ChannelResult<? extends Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ FlowCollector<T> $downstream;
    final /* synthetic */ Ref.ObjectRef<Object> $lastValue;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__DelayKt$debounceInternal$1$3$2(Ref.ObjectRef<Object> r2, FlowCollector<? super T> r3, Continuation<? super FlowKt__DelayKt$debounceInternal$1$3$2> r4) {
        this.$lastValue = r2;
        this.$downstream = r3;
        super(2, r4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        FlowKt__DelayKt$debounceInternal$1$3$2 r0 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.$lastValue, this.$downstream, r5);
        r0.L$0 = r4;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ChannelResult<? extends Object> r3, Continuation<? super Unit> r4) {
        return m8952invokeWpGqRn0(r3.m8938unboximpl(), r4);
    }

    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m8952invokeWpGqRn0(Object r3, Continuation<? super Unit> r4) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) create(ChannelResult.m8926boximpl(r3), r4)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2 for r11v1 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int r1 = r11.label;
        switch(r1) {
            case 0: goto L7;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        java.lang.IllegalStateException r12 = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw r12;
    L6:
        kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2 r0 = r11;
        kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2 r1 = null;
        int r2 = 0;
        java.lang.Object r3 = r0.L$1;
        kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3;
        java.lang.Object r4 = r0.L$0;
        kotlin.ResultKt.throwOnFailure(r12);
    L23:
        kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2 r5 = r1;
        int r7 = r2;
        kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2 r1 = r0;
    L24:
        kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE;
        r3.element = r0;
    L27:
        kotlin.Unit r0 = kotlin.Unit.INSTANCE;
        return r0;
    L7:
        kotlin.ResultKt.throwOnFailure(r12);
        java.lang.Object r2 = r11.L$0;
        kotlinx.coroutines.channels.ChannelResult r2 = (kotlinx.coroutines.channels.ChannelResult) r2;
        ?? r2 = r2.m8938unboximpl();
        kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> r3 = r11.$lastValue;
        boolean r5 = r2 instanceof kotlinx.coroutines.channels.ChannelResult.Failed;
        if (r5 == true) goto L10;
        r3.element = r2;
    L10:
        r3 = r11.$lastValue;
        kotlinx.coroutines.flow.FlowCollector<T> r2 = r11.$downstream;
        boolean r6 = r2 instanceof kotlinx.coroutines.channels.ChannelResult.Failed;
        if (r6 == false) goto L27;
        java.lang.Throwable r6 = kotlinx.coroutines.channels.ChannelResult.m8930exceptionOrNullimpl(r2);
        if (r6 != null) goto L26;
        java.lang.Object r6 = r3.element;
        if (r6 == null) goto L24;
        kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
        java.lang.Object r8 = r3.element;
        if (r8 != r6) goto L19;
        r8 = null;
    L19:
        r11.L$0 = r2;
        r11.L$1 = r3;
        r11.label = 1;
        T r8 = (T) r8;
        kotlin.coroutines.Continuation r11 = (kotlin.coroutines.Continuation<? super kotlin.Unit>) r11;
        java.lang.Object r2 = r2.emit(r8, r11);
        if (r2 != r0) goto L22;
        return r0;
    L22:
        r0 = r11;
        r1 = null;
        r2 = 0;
        goto L23
    L26:
        throw r6;
    }
}
