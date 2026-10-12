package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ChannelResult;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "value", "Lkotlinx/coroutines/channels/ChannelResult;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", i = {0}, l = {395}, m = "invokeSuspend", n = {"$this$onSuccess_u2dWpGqRn0$iv"}, s = {"L$0"})
final class FlowKt__DelayKt$timeoutInternal$1$1$1<T> extends SuspendLambda implements Function2<ChannelResult<? extends T>, Continuation<? super Boolean>, Object> {
    final /* synthetic */ FlowCollector<T> $downStream;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__DelayKt$timeoutInternal$1$1$1(FlowCollector<? super T> r2, Continuation<? super FlowKt__DelayKt$timeoutInternal$1$1$1> r3) {
        this.$downStream = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        FlowKt__DelayKt$timeoutInternal$1$1$1 r0 = new FlowKt__DelayKt$timeoutInternal$1$1$1(this.$downStream, r4);
        r0.L$0 = r3;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object r3, Continuation<? super Boolean> r4) {
        return m8954invokeWpGqRn0(((ChannelResult) r3).m8938unboximpl(), r4);
    }

    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m8954invokeWpGqRn0(Object r3, Continuation<? super Boolean> r4) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$1) create(ChannelResult.m8926boximpl(r3), r4)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1<T> for r8v1 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int r1 = r8.label;
        switch(r1) {
            case 0: goto L7;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw r9;
    L6:
        kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1<T> r0 = r8;
        kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1 r1 = null;
        java.lang.Object r4 = r0.L$0;
        kotlin.ResultKt.throwOnFailure(r9);
    L13:
        kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1 r5 = r1;
        java.lang.Object r3 = r4;
        kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1<T> r1 = r0;
    L14:
        boolean r4 = r3 instanceof kotlinx.coroutines.channels.ChannelResult.Closed;
        if (r4 == false) goto L22;
        java.lang.Throwable r2 = kotlinx.coroutines.channels.ChannelResult.m8930exceptionOrNullimpl(r3);
        if (r2 != null) goto L21;
        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        return r5;
    L21:
        throw r2;
    L22:
        java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
        return r0;
    L7:
        kotlin.ResultKt.throwOnFailure(r9);
        java.lang.Object r3 = r8.L$0;
        kotlinx.coroutines.channels.ChannelResult r3 = (kotlinx.coroutines.channels.ChannelResult) r3;
        r3 = r3.m8938unboximpl();
        kotlinx.coroutines.flow.FlowCollector<T> r4 = r8.$downStream;
        boolean r6 = r3 instanceof kotlinx.coroutines.channels.ChannelResult.Failed;
        if (r6 == true) goto L14;
        r8.L$0 = r3;
        r8.label = 1;
        T r3 = (T) r3;
        kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation<? super kotlin.Unit>) r8;
        java.lang.Object r4 = r4.emit(r3, r8);
        if (r4 != r0) goto L12;
        return r0;
    L12:
        r0 = r8;
        r4 = r3;
        r1 = null;
        goto L13
    }
}
