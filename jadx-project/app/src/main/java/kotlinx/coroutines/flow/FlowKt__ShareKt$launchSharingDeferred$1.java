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
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
final class FlowKt__ShareKt$launchSharingDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CompletableDeferred<StateFlow<T>> $result;
    final /* synthetic */ Flow<T> $upstream;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__ShareKt$launchSharingDeferred$1(Flow<? extends T> r2, CompletableDeferred<StateFlow<T>> r3, Continuation<? super FlowKt__ShareKt$launchSharingDeferred$1> r4) {
        this.$upstream = r2;
        this.$result = r3;
        super(2, r4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        FlowKt__ShareKt$launchSharingDeferred$1 r0 = new FlowKt__ShareKt$launchSharingDeferred$1(this.$upstream, this.$result, r5);
        r0.L$0 = r4;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((FlowKt__ShareKt$launchSharingDeferred$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r10) {
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L11;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        FlowKt__ShareKt$launchSharingDeferred$1 r1 = this;
        ResultKt.throwOnFailure(r10);     // Catch: Throwable -> L9
    L17:
        return Unit.INSTANCE;
    L9:
        Throwable th = th;
    L20:
        r1.$result.completeExceptionally(th);
        throw th;
    L11:
        ResultKt.throwOnFailure(r10);
        final CoroutineScope r2 = (CoroutineScope) this.L$0;
        final Ref.ObjectRef r3 = new Ref.ObjectRef();     // Catch: Throwable -> L18
        Flow<T> r4 = this.$upstream;     // Catch: Throwable -> L18
        final CompletableDeferred<StateFlow<T>> r6 = this.$result;     // Catch: Throwable -> L18
        FlowCollector r5 = new AnonymousClass1(r3, r2, r6);     // Catch: Throwable -> L18
        this.label = 1;     // Catch: Throwable -> L18
        if (r4.collect((FlowCollector<? super T>) r5, this) != r0) goto L17;
        return r0;
    L18:
        th = move-exception;
        th = th;
        r1 = this;
        goto L20
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
