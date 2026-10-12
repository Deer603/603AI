package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Landroidx/lifecycle/Lifecycle$Event;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.lifecycle.LifecycleKt$eventFlow$1", f = "Lifecycle.kt", i = {}, l = {373}, m = "invokeSuspend", n = {}, s = {})
final class LifecycleKt$eventFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super Lifecycle.Event>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Lifecycle $this_eventFlow;
    private /* synthetic */ Object L$0;
    int label;

    LifecycleKt$eventFlow$1(Lifecycle r2, Continuation<? super LifecycleKt$eventFlow$1> r3) {
        this.$this_eventFlow = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        LifecycleKt$eventFlow$1 r0 = new LifecycleKt$eventFlow$1(this.$this_eventFlow, r4);
        r0.L$0 = r3;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ProducerScope<? super Lifecycle.Event> r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(ProducerScope<? super Lifecycle.Event> r3, Continuation<? super Unit> r4) {
        return ((LifecycleKt$eventFlow$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
        ResultKt.throwOnFailure($result);
    L11:
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
        final ProducerScope $this$callbackFlow = (ProducerScope) this.L$0;
        final LifecycleEventObserver observer = new LifecycleKt$eventFlow$1$$ExternalSyntheticLambda0($this$callbackFlow);
        this.$this_eventFlow.addObserver(observer);
        final Lifecycle r3 = this.$this_eventFlow;
        this.label = 1;
        if (ProduceKt.awaitClose($this$callbackFlow, new LifecycleKt$eventFlow$1$$ExternalSyntheticLambda1(r3, observer), this) != r0) goto L11;
        return r0;
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    static final void invokeSuspend$lambda$0(ProducerScope $$this$callbackFlow, LifecycleOwner r3, Lifecycle.Event event) {
        $$this$callbackFlow.mo8915trySendJP2dKIU(event);
        if (event != Lifecycle.Event.ON_DESTROY) goto L6;
        SendChannel.DefaultImpls.close$default($$this$callbackFlow, null, 1, null);
        return;
    }

    static final Unit invokeSuspend$lambda$1(Lifecycle $this_eventFlow, LifecycleEventObserver $observer) {
        $this_eventFlow.removeObserver($observer);
        return Unit.INSTANCE;
    }
}
