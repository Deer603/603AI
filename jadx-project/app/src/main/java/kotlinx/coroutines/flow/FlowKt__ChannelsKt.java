package kotlinx.coroutines.flow;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BroadcastChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChannelFlowKt;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a,\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0086@¢\u0006\u0002\u0010\n\u001a6\u0010\u000b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u000e\u0010\u000f\u001a$\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005¨\u0006\u0014"}, d2 = {"asFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "Lkotlinx/coroutines/channels/BroadcastChannel;", "consumeAsFlow", "Lkotlinx/coroutines/channels/ReceiveChannel;", "emitAll", "", "Lkotlinx/coroutines/flow/FlowCollector;", "channel", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitAllImpl", "consume", "", "emitAllImpl$FlowKt__ChannelsKt", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produceIn", "scope", "Lkotlinx/coroutines/CoroutineScope;", "receiveAsFlow", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__ChannelsKt {
    public static final /* synthetic */ Object access$emitAllImpl$FlowKt__ChannelsKt(FlowCollector $receiver, ReceiveChannel channel, boolean consume, Continuation $completion) {
        return emitAllImpl$FlowKt__ChannelsKt($receiver, channel, consume, $completion);
    }

    public static final <T> Object emitAll(FlowCollector<? super T> r2, ReceiveChannel<? extends T> r3, Continuation<? super Unit> r4) {
        Object r0 = emitAllImpl$FlowKt__ChannelsKt(r2, r3, true, r4);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.flow.FlowCollector, kotlinx.coroutines.flow.FlowCollector<? super T>] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a7 -> B:22:0x006d). Please report as a decompilation issue!!! */
    private static final <T> Object emitAllImpl$FlowKt__ChannelsKt(FlowCollector<? super T> r7, ReceiveChannel<? extends T> r8, boolean r9, Continuation<? super Unit> r10) {
        if ((r10 instanceof FlowKt__ChannelsKt$emitAllImpl$1) == false) goto L7;
        FlowKt__ChannelsKt$emitAllImpl$1 r0 = (FlowKt__ChannelsKt$emitAllImpl$1) r10;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object r11 = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = r0.label;
        switch(r2) {
            case 0: goto L20;
            case 1: goto L15;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        boolean r12 = r0.Z$0;
        ChannelIterator r13 = (ChannelIterator) r0.L$2;
        ReceiveChannel r3 = (ReceiveChannel) r0.L$1;
        FlowCollector r4 = (FlowCollector) r0.L$0;
        ResultKt.throwOnFailure(r11);     // Catch: Throwable -> L18
        r9 = r12;
        boolean r14 = (FlowCollector<? super T>) r4;
        ChannelIterator r5 = r13;
        Throwable r15 = null;
        r2 = r3;
        ?? r16 = r14;
    L22:
        r0.L$0 = r16;     // Catch: Throwable -> L39
        r0.L$1 = r2;     // Catch: Throwable -> L39
        r0.L$2 = r5;     // Catch: Throwable -> L39
        r0.Z$0 = r9;     // Catch: Throwable -> L39
        r0.label = 1;     // Catch: Throwable -> L39
        Object r6 = r5.hasNext(r0);     // Catch: Throwable -> L39
        if (r6 != r1) goto L25;
        return r1;
    L25:
        ?? r17 = r16;
        boolean r18 = (FlowCollector<? super T>) (r9 ? 1 : 0);
        Throwable r19 = r15;
        ChannelIterator r20 = r5;
        ?? r21 = r2;
        Object r22 = r1;
        FlowKt__ChannelsKt$emitAllImpl$1 r23 = r0;
        Object r24 = r11;
        r11 = r6;
        r7 = r18;
    L49:
    L37:
        th = th;
        r2 = r21;
    L41:
        Throwable r25 = th;
        throw th;     // Catch: Throwable -> L43
    L43:
        th = move-exception;
        if (r7 == 0) goto L46;
        ChannelsKt.cancelConsumed(r2, r25);
    L46:
        throw th;
    L27:
        if (((Boolean) r11).booleanValue() == false) goto L33;
        Object r110 = r20.next();     // Catch: Throwable -> L37
        r23.L$0 = r17;     // Catch: Throwable -> L37
        r23.L$1 = r21;     // Catch: Throwable -> L37
        r23.L$2 = r20;     // Catch: Throwable -> L37
        r23.Z$0 = (boolean) r7;     // Catch: Throwable -> L37
        r23.label = 2;     // Catch: Throwable -> L37
        if (r17.emit(r110, r23) != r22) goto L31;
        return r22;
    L31:
        r11 = r24;
        r0 = r23;
        r1 = r22;
        r2 = r21;
        r5 = r20;
        r15 = r19;
        r9 = (??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) r7;
        r16 = (FlowCollector<? super T>) r17;
        goto L22
    L33:
        if (r7 == 0) goto L36;
        ChannelsKt.cancelConsumed(r21, r19);
    L36:
        return Unit.INSTANCE;
    L39:
        th = move-exception;
        th = th;
        r7 = (FlowCollector<? super T>) (r9 ? 1 : 0);
        goto L41
    L15:
        boolean r26 = r0.Z$0;
        r20 = (ChannelIterator) r0.L$2;
        r19 = null;
        ReceiveChannel r27 = (ReceiveChannel) r0.L$1;
        FlowCollector r28 = (FlowCollector) r0.L$0;
        ResultKt.throwOnFailure(r11);     // Catch: Throwable -> L18
        r17 = r28;
        r21 = r27;
        r22 = r1;
        r23 = r0;
        r24 = r11;
        r7 = r26;
        goto L49
    L20:
        ResultKt.throwOnFailure(r11);
        r2 = r8;
        FlowKt.ensureActive(r7);
        r15 = null;
        r5 = r2.iterator();     // Catch: Throwable -> L39
        r2 = r2;
        r16 = r7;
        goto L22
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L18:
        th = th;
    L7:
        r0 = new FlowKt__ChannelsKt$emitAllImpl$1(r10);
        goto L8
    }

    public static final <T> Flow<T> receiveAsFlow(ReceiveChannel<? extends T> r8) {
        boolean r2 = false;
        CoroutineContext r3 = null;
        int r4 = 0;
        BufferOverflow r5 = null;
        return new ChannelAsFlow(r8, r2, r3, r4, r5, 28, null);
    }

    public static final <T> Flow<T> consumeAsFlow(ReceiveChannel<? extends T> r8) {
        boolean r2 = true;
        CoroutineContext r3 = null;
        int r4 = 0;
        BufferOverflow r5 = null;
        return new ChannelAsFlow(r8, r2, r3, r4, r5, 28, null);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    public static final <T> Flow<T> asFlow(final BroadcastChannel<T> r2) {
        return new FlowKt__ChannelsKt$asFlow$$inlined$unsafeFlow$1(r2);
    }

    public static final <T> ReceiveChannel<T> produceIn(Flow<? extends T> r1, CoroutineScope scope) {
        return ChannelFlowKt.asChannelFlow(r1).produceImpl(scope);
    }
}
