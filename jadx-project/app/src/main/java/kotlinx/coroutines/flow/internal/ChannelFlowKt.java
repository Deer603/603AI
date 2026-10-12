package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aX\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00072\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\tH\u0080@¢\u0006\u0002\u0010\u000b\u001a\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00010\r\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u000eH\u0000\u001a&\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0010\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¨\u0006\u0012"}, d2 = {"withContextUndispatched", "T", "V", "newContext", "Lkotlin/coroutines/CoroutineContext;", "value", "countOrElement", "", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "asChannelFlow", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/coroutines/flow/Flow;", "withUndispatchedContextCollector", "Lkotlinx/coroutines/flow/FlowCollector;", "emitContext", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ChannelFlowKt {
    public static final /* synthetic */ FlowCollector access$withUndispatchedContextCollector(FlowCollector $receiver, CoroutineContext emitContext) {
        return withUndispatchedContextCollector($receiver, emitContext);
    }

    public static final <T> ChannelFlow<T> asChannelFlow(Flow<? extends T> r8) {
        if ((r8 instanceof ChannelFlow) == false) goto L5;
        ChannelFlow<T> r0 = (ChannelFlow) r8;
    L6:
        if (r0 != null) goto L9;
        return new ChannelFlowOperatorImpl(r8, null, 0, null, 14, null);
    L9:
        return r0;
    L5:
        r0 = null;
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> FlowCollector<T> withUndispatchedContextCollector(FlowCollector<? super T> r1, CoroutineContext emitContext) {
        if ((r1 instanceof SendingCollector) == false) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L9;
        return r1;
    L9:
        return new UndispatchedContextCollector(r1, emitContext);
    L5:
        r0 = r1 instanceof NopCollector;
        goto L6
    }

    public static /* synthetic */ Object withContextUndispatched$default(CoroutineContext r0, Object r1, Object r2, Function2 r3, Continuation r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r2 = ThreadContextKt.threadContextElements(r0);
    L6:
        return withContextUndispatched(r0, r1, r2, r3, r4);
    }

    public static final <T, V> Object withContextUndispatched(CoroutineContext newContext, V r8, Object countOrElement, Function2<? super V, ? super Continuation<? super T>, ? extends Object> r10, Continuation<? super T> r11) {
        Object oldValue$iv = ThreadContextKt.updateThreadContext(newContext, countOrElement);
        StackFrameContinuation r5 = new StackFrameContinuation(r11, newContext);     // Catch: Throwable -> L11
        if ((r10 instanceof BaseContinuationImpl) == true) goto L6;
        Object r6 = IntrinsicsKt.wrapWithContinuationImpl(r10, r8, r5);     // Catch: Throwable -> L11
    L7:
        ThreadContextKt.restoreThreadContext(newContext, oldValue$iv);
        if (r6 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        DebugProbesKt.probeCoroutineSuspended(r11);
    L10:
        return r6;
    L6:
        r6 = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r10, 2)).invoke(r8, r5);     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        ThreadContextKt.restoreThreadContext(newContext, oldValue$iv);
        throw th;
    }
}
