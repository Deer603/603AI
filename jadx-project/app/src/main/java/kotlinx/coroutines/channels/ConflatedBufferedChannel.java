package kotlinx.coroutines.channels;

import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: compiled from: ConflatedBufferedChannel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\"\b\u0002\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n¢\u0006\u0002\u0010\u000bJ\u001e\u0010\u000f\u001a\u00020\t2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0016\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00028\u0000H\u0090@¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00020\rH\u0010¢\u0006\u0002\b\u0019J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u001b2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001b2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J+\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u001b2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010!R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBufferedChannel;", "E", "Lkotlinx/coroutines/channels/BufferedChannel;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;)V", "isConflatedDropOldest", "", "()Z", "registerSelectForSend", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "element", "", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendBroadcast", "sendBroadcast$kotlinx_coroutines_core", "shouldSendSuspend", "shouldSendSuspend$kotlinx_coroutines_core", "trySend", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySendDropLatest", "isSendOp", "trySendDropLatest-Mj0NB7M", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "trySendImpl", "trySendImpl-Mj0NB7M", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class ConflatedBufferedChannel<E> extends BufferedChannel<E> {
    private final int capacity;
    private final BufferOverflow onBufferOverflow;

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public Object send(E r2, Continuation<? super Unit> r3) {
        return send$suspendImpl(this, r2, r3);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public Object sendBroadcast$kotlinx_coroutines_core(E r2, Continuation<? super Boolean> r3) {
        return sendBroadcast$suspendImpl(this, r2, r3);
    }

    public /* synthetic */ ConflatedBufferedChannel(int r1, BufferOverflow r2, Function1 r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = null;
    L5:
        this(r1, r2, r3);
    }

    public ConflatedBufferedChannel(int capacity, BufferOverflow onBufferOverflow, Function1<? super E, Unit> r7) {
        super(capacity, r7);
        this.capacity = capacity;
        this.onBufferOverflow = onBufferOverflow;
        boolean r2 = false;
        if (this.onBufferOverflow == BufferOverflow.SUSPEND) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L15;
        if (this.capacity < 1) goto L10;
        r2 = true;
    L10:
        if (r2 == false) goto L13;
        return;
    L13:
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + this.capacity + " was specified").toString());
    L15:
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Reflection.getOrCreateKotlinClass(BufferedChannel.class).getSimpleName() + " instead").toString());
    L5:
        r0 = false;
        goto L6
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected boolean isConflatedDropOldest() {
        if (this.onBufferOverflow != BufferOverflow.DROP_OLDEST) goto L5;
        return true;
    L5:
        return false;
    }

    static /* synthetic */ <E> Object send$suspendImpl(ConflatedBufferedChannel<E> r8, E r9, Continuation<? super Unit> r10) {
        Object $this$onClosed_u2dWpGqRn0$iv = r8.m8943trySendImplMj0NB7M(r9, true);
        if (($this$onClosed_u2dWpGqRn0$iv instanceof ChannelResult.Closed) == false) goto L13;
        ChannelResult.m8930exceptionOrNullimpl($this$onClosed_u2dWpGqRn0$iv);
        Function1<E, Unit> r4 = r8.onUndeliveredElement;
        if (r4 == null) goto L11;
        UndeliveredElementException it = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(r4, r9, null, 2, null);
        if (it == null) goto L11;
        ExceptionsKt.addSuppressed(it, r8.getSendException());
        throw it;
    L11:
        throw r8.getSendException();
    L13:
        return Unit.INSTANCE;
    }

    static /* synthetic */ <E> Object sendBroadcast$suspendImpl(ConflatedBufferedChannel<E> r5, E r6, Continuation<? super Boolean> r7) {
        Object $this$onSuccess_u2dWpGqRn0$iv = r5.m8943trySendImplMj0NB7M(r6, true);
        if (($this$onSuccess_u2dWpGqRn0$iv instanceof ChannelResult.Failed) == true) goto L7;
        Unit r3 = (Unit) $this$onSuccess_u2dWpGqRn0$iv;
        return Boxing.boxBoolean(true);
    L7:
        return Boxing.boxBoolean(false);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo8915trySendJP2dKIU(E r2) {
        return m8943trySendImplMj0NB7M(r2, false);
    }

    /* JADX INFO: renamed from: trySendImpl-Mj0NB7M, reason: not valid java name */
    private final Object m8943trySendImplMj0NB7M(E r3, boolean isSendOp) {
        if (this.onBufferOverflow != BufferOverflow.DROP_LATEST) goto L6;
        return m8942trySendDropLatestMj0NB7M(r3, isSendOp);
    L6:
        return m8921trySendDropOldestJP2dKIU(r3);
    }

    /* JADX INFO: renamed from: trySendDropLatest-Mj0NB7M, reason: not valid java name */
    private final Object m8942trySendDropLatestMj0NB7M(E r5, boolean isSendOp) {
        Object result = super.mo8915trySendJP2dKIU(r5);
        if (ChannelResult.m8936isSuccessimpl(result) == false) goto L5;
    L17:
        return result;
    L5:
        if (ChannelResult.m8934isClosedimpl(result) == true) goto L17;
        if (isSendOp == false) goto L16;
        Function1<E, Unit> r1 = this.onUndeliveredElement;
        if (r1 == null) goto L16;
        UndeliveredElementException it = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(r1, r5, null, 2, null);
        if (it == null) goto L16;
        throw it;
    L16:
        return ChannelResult.Companion.m8941successJP2dKIU(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected void registerSelectForSend(SelectInstance<?> r8, Object r9) {
        Object it = mo8915trySendJP2dKIU(r9);
        if ((it instanceof ChannelResult.Failed) == true) goto L7;
        Unit r4 = (Unit) it;
        r8.selectInRegistrationPhase(Unit.INSTANCE);
        return;
    L7:
        if ((it instanceof ChannelResult.Closed) == false) goto L11;
        ChannelResult.m8930exceptionOrNullimpl(it);
        r8.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
        return;
    L11:
        throw new IllegalStateException("unreachable".toString());
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return false;
    }
}
