package kotlinx.coroutines.channels;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: Produce.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0086@¢\u0006\u0002\u0010\u0005\u001a\u009b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2-\b\u0002\u0010\u0010\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011j\u0004\u0018\u0001`\u00162/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017¢\u0006\u0002\b\u001aH\u0007¢\u0006\u0002\u0010\u001b\u001a¥\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2-\b\u0002\u0010\u0010\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011j\u0004\u0018\u0001`\u00162/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017¢\u0006\u0002\b\u001aH\u0000¢\u0006\u0002\u0010\u001e\u001ab\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017¢\u0006\u0002\b\u001aH\u0007¢\u0006\u0002\u0010\u001f¨\u0006 "}, d2 = {"awaitClose", "", "Lkotlinx/coroutines/channels/ProducerScope;", "block", "Lkotlin/Function0;", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produce", "Lkotlinx/coroutines/channels/ReceiveChannel;", "E", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "start", "Lkotlinx/coroutines/CoroutineStart;", "onCompletion", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "cause", "Lkotlinx/coroutines/CompletionHandler;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ProduceKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ProduceKt$awaitClose$1, reason: invalid class name */
    /* JADX INFO: compiled from: Produce.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", i = {0, 0}, l = {150}, m = "awaitClose", n = {"$this$awaitClose", "block"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ProduceKt.awaitClose(null, null, this);
        }
    }

    public static final Object awaitClose(ProducerScope<?> r9, Function0<Unit> r10, Continuation<? super Unit> r11) {
        if ((r11 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r11;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        r10 = (Function0) r0.L$1;
        ProducerScope r2 = (ProducerScope) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
    L29:
        r10.invoke();
        return Unit.INSTANCE;
    L17:
        ResultKt.throwOnFailure($result);
        if (r0.getContext().get(Job.Key) != r9) goto L20;
        boolean r3 = true;
    L21:
        if (r3 == false) goto L34;
        r0.L$0 = r9;     // Catch: Throwable -> L15
        r0.L$1 = r10;     // Catch: Throwable -> L15
        r0.label = 1;     // Catch: Throwable -> L15
        Continuation uCont$iv = r0;     // Catch: Throwable -> L15
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(uCont$iv), 1);     // Catch: Throwable -> L15
        cancellable$iv.initCancellability();     // Catch: Throwable -> L15
        final CancellableContinuationImpl cont = cancellable$iv;     // Catch: Throwable -> L15
        r9.invokeOnClose(new ProduceKt$awaitClose$4$1(cont));     // Catch: Throwable -> L15
        Object r12 = cancellable$iv.getResult();     // Catch: Throwable -> L15
        if (r12 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L26;
        DebugProbesKt.probeCoroutineSuspended(r0);     // Catch: Throwable -> L15
    L26:
        if (r12 != r1) goto L29;
        return r1;
    L34:
        throw new IllegalStateException("awaitClose() can only be invoked from the producer context".toString());
    L20:
        r3 = false;
        goto L21
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L15:
        th = move-exception;
        r10.invoke();
        throw th;
    L7:
        r0 = new AnonymousClass1(r11);
        goto L8
    }

    public static /* synthetic */ Object awaitClose$default(ProducerScope r0, AnonymousClass2 r1, Continuation r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = AnonymousClass2.INSTANCE;
    L6:
        return awaitClose(r0, r1, r2);
    }

    public static /* synthetic */ ReceiveChannel produce$default(CoroutineScope r0, EmptyCoroutineContext r1, int r2, Function2 r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = EmptyCoroutineContext.INSTANCE;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = 0;
    L9:
        return produce(r0, r1, r2, r3);
    }

    public static final <E> ReceiveChannel<E> produce(CoroutineScope $this$produce, CoroutineContext context, int capacity, Function2<? super ProducerScope<? super E>, ? super Continuation<? super Unit>, ? extends Object> r10) {
        return produce($this$produce, context, capacity, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, null, r10);
    }

    public static /* synthetic */ ReceiveChannel produce$default(CoroutineScope r0, EmptyCoroutineContext r1, int r2, CoroutineStart r3, Function1 r4, Function2 r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = EmptyCoroutineContext.INSTANCE;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = CoroutineStart.DEFAULT;
    L12:
        if ((r6 & 8) == 0) goto L14;
        Function1 r8 = null;
    L15:
        CoroutineStart r9 = r3;
        return produce(r0, r1, r2, r9, r8, r5);
    L14:
        r8 = r4;
        goto L15
    }

    public static final <E> ReceiveChannel<E> produce(CoroutineScope $this$produce, CoroutineContext context, int capacity, CoroutineStart start, Function1<? super Throwable, Unit> r11, Function2<? super ProducerScope<? super E>, ? super Continuation<? super Unit>, ? extends Object> r12) {
        return produce($this$produce, context, capacity, BufferOverflow.SUSPEND, start, r11, r12);
    }

    public static /* synthetic */ ReceiveChannel produce$default(CoroutineScope r0, EmptyCoroutineContext r1, int r2, BufferOverflow r3, CoroutineStart r4, Function1 r5, Function2 r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = EmptyCoroutineContext.INSTANCE;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = 0;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = BufferOverflow.SUSPEND;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = CoroutineStart.DEFAULT;
    L15:
        if ((r7 & 16) == 0) goto L17;
        Function1 r9 = null;
    L19:
        return produce(r0, r1, r2, r3, r4, r9, r6);
    L17:
        r9 = r5;
        goto L19
    }

    public static final <E> ReceiveChannel<E> produce(CoroutineScope $this$produce, CoroutineContext context, int capacity, BufferOverflow onBufferOverflow, CoroutineStart start, Function1<? super Throwable, Unit> r9, Function2<? super ProducerScope<? super E>, ? super Continuation<? super Unit>, ? extends Object> r10) {
        Channel channel = ChannelKt.Channel$default(capacity, onBufferOverflow, null, 4, null);
        CoroutineContext newContext = CoroutineContextKt.newCoroutineContext($this$produce, context);
        ProducerCoroutine coroutine = new ProducerCoroutine(newContext, channel);
        if (r9 == null) goto L5;
        coroutine.invokeOnCompletion(r9);
    L5:
        coroutine.start(start, coroutine, r10);
        return coroutine;
    }
}
