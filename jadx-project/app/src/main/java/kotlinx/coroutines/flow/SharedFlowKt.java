package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a0\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t\u001a6\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00040\u000b\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0000\u001a#\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¢\u0006\u0002\u0010\u0015\u001a+\u0010\u0016\u001a\u00020\u0017*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0002\u0010\u0019\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"NO_VALUE", "Lkotlinx/coroutines/internal/Symbol;", "MutableSharedFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "T", "replay", "", "extraBufferCapacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "fuseSharedFlow", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/SharedFlow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "getBufferAt", "", "", "index", "", "([Ljava/lang/Object;J)Ljava/lang/Object;", "setBufferAt", "", "item", "([Ljava/lang/Object;JLjava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SharedFlowKt {
    public static final Symbol NO_VALUE = null;

    public static final /* synthetic */ Object access$getBufferAt(Object[] $receiver, long index) {
        return getBufferAt($receiver, index);
    }

    public static final /* synthetic */ void access$setBufferAt(Object[] $receiver, long index, Object item) {
        setBufferAt($receiver, index, item);
    }

    public static /* synthetic */ MutableSharedFlow MutableSharedFlow$default(int r1, int r2, BufferOverflow r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = 0;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = BufferOverflow.SUSPEND;
    L12:
        return MutableSharedFlow(r1, r2, r3);
    }

    public static final <T> MutableSharedFlow<T> MutableSharedFlow(int replay, int extraBufferCapacity, BufferOverflow onBufferOverflow) {
        boolean r0 = true;
        if (replay < 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L29;
        if (extraBufferCapacity < 0) goto L9;
        boolean r3 = true;
    L10:
        if (r3 == false) goto L27;
        if (replay > 0) goto L17;
        if (extraBufferCapacity > 0) goto L17;
        if (onBufferOverflow == BufferOverflow.SUSPEND) goto L17;
        r0 = false;
    L17:
        if (r0 == false) goto L25;
        int bufferCapacity0 = replay + extraBufferCapacity;
        if (bufferCapacity0 >= 0) goto L21;
        int bufferCapacity = Integer.MAX_VALUE;
    L23:
        return new SharedFlowImpl(replay, bufferCapacity, onBufferOverflow);
    L21:
        bufferCapacity = bufferCapacity0;
        goto L23
    L25:
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + onBufferOverflow).toString());
    L27:
        throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + extraBufferCapacity).toString());
    L9:
        r3 = false;
        goto L10
    L29:
        throw new IllegalArgumentException(("replay cannot be negative, but was " + replay).toString());
    L5:
        r2 = false;
        goto L6
    }

    static {
        NO_VALUE = new Symbol("NO_VALUE");
    }

    private static final Object getBufferAt(Object[] $this$getBufferAt, long index) {
        return $this$getBufferAt[((int) index) & ($this$getBufferAt.length - 1)];
    }

    private static final void setBufferAt(Object[] $this$setBufferAt, long index, Object item) {
        $this$setBufferAt[((int) index) & ($this$setBufferAt.length - 1)] = item;
    }

    public static final <T> Flow<T> fuseSharedFlow(SharedFlow<? extends T> r2, CoroutineContext context, int capacity, BufferOverflow onBufferOverflow) {
        if (capacity == 0) goto L6;
        if (capacity == (-3)) goto L6;
    L10:
        return new ChannelFlowOperatorImpl(r2, context, capacity, onBufferOverflow);
    L6:
        if (onBufferOverflow != BufferOverflow.SUSPEND) goto L10;
        return r2;
    }
}
