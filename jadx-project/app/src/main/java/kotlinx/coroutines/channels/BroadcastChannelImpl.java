package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.TrySelectDetailedResult;

/* JADX INFO: compiled from: BroadcastChannel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u000245B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0017\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010!H\u0010¢\u0006\u0002\b\"J\u0012\u0010#\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016J\u001e\u0010&\u001a\u00020'2\n\u0010(\u001a\u0006\u0012\u0002\b\u00030\u00132\b\u0010)\u001a\u0004\u0018\u00010\rH\u0014J\u0016\u0010*\u001a\u00020'2\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0002J\u0016\u0010,\u001a\u00020'2\u0006\u0010)\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020/H\u0016J#\u00100\u001a\b\u0012\u0004\u0012\u00020'012\u0006\u0010)\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R6\u0010\u0011\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0012j\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0012\u0006\u0012\u0004\u0018\u00010\r`\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001c\u001a\u0004\u0018\u00018\u00008F¢\u0006\f\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl;", "E", "Lkotlinx/coroutines/channels/BufferedChannel;", "Lkotlinx/coroutines/channels/BroadcastChannel;", "capacity", "", "(I)V", "getCapacity", "()I", "isClosedForSend", "", "()Z", "lastConflatedElement", "", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "onSendInternalResult", "Ljava/util/HashMap;", "Lkotlinx/coroutines/selects/SelectInstance;", "Lkotlin/collections/HashMap;", "subscribers", "", "value", "getValue$annotations", "()V", "getValue", "()Ljava/lang/Object;", "valueOrNull", "getValueOrNull$annotations", "getValueOrNull", "cancelImpl", "cause", "", "cancelImpl$kotlinx_coroutines_core", "close", "openSubscription", "Lkotlinx/coroutines/channels/ReceiveChannel;", "registerSelectForSend", "", "select", "element", "removeSubscriber", "s", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toString", "", "trySend", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "SubscriberBuffered", "SubscriberConflated", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BroadcastChannelImpl<E> extends BufferedChannel<E> implements BroadcastChannel<E> {
    private final int capacity;
    private Object lastConflatedElement;
    private final ReentrantLock lock;
    private final HashMap<SelectInstance<?>, Object> onSendInternalResult;
    private List<? extends BufferedChannel<E>> subscribers;

    /* JADX INFO: compiled from: BroadcastChannel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered;", "Lkotlinx/coroutines/channels/BufferedChannel;", "(Lkotlinx/coroutines/channels/BroadcastChannelImpl;)V", "cancelImpl", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class SubscriberBuffered extends BufferedChannel<E> {
        final /* synthetic */ BroadcastChannelImpl<E> this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public SubscriberBuffered(BroadcastChannelImpl r4) {
            this.this$0 = r4;
            super(r4.getCapacity(), null, 2, 0 == true ? 1 : 0);
        }

        @Override // kotlinx.coroutines.channels.BufferedChannel
        public /* bridge */ /* synthetic */ boolean cancelImpl$kotlinx_coroutines_core(Throwable cause) {
            return cancelImpl(cause);
        }

        public boolean cancelImpl(Throwable cause) {
            ReentrantLock $this$withLock$iv = BroadcastChannelImpl.access$getLock$p(this.this$0);
            BroadcastChannelImpl<E> r1 = this.this$0;
            ReentrantLock r3 = $this$withLock$iv;
            r3.lock();
            BroadcastChannelImpl.access$removeSubscriber(r1, this);     // Catch: Throwable -> L6
            boolean r2 = super.cancelImpl$kotlinx_coroutines_core(cause);     // Catch: Throwable -> L6
            r3.unlock();
            return r2;
        L6:
            th = move-exception;
            r3.unlock();
            throw th;
        }
    }

    /* JADX INFO: compiled from: BroadcastChannel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberConflated;", "Lkotlinx/coroutines/channels/ConflatedBufferedChannel;", "(Lkotlinx/coroutines/channels/BroadcastChannelImpl;)V", "cancelImpl", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class SubscriberConflated extends ConflatedBufferedChannel<E> {
        final /* synthetic */ BroadcastChannelImpl<E> this$0;

        public SubscriberConflated(BroadcastChannelImpl this$0) {
            this.this$0 = this$0;
            int r1 = 1;
            Function1 r3 = null;
            super(r1, BufferOverflow.DROP_OLDEST, r3, 4, null);
        }

        @Override // kotlinx.coroutines.channels.BufferedChannel
        public /* bridge */ /* synthetic */ boolean cancelImpl$kotlinx_coroutines_core(Throwable cause) {
            return cancelImpl(cause);
        }

        public boolean cancelImpl(Throwable cause) {
            BroadcastChannelImpl.access$removeSubscriber(this.this$0, this);
            return super.cancelImpl$kotlinx_coroutines_core(cause);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2, reason: invalid class name */
    /* JADX INFO: compiled from: BroadcastChannel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2", f = "BroadcastChannel.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Object $element;
        final /* synthetic */ SelectInstance<?> $select;
        int label;
        final /* synthetic */ BroadcastChannelImpl<E> this$0;

        AnonymousClass2(BroadcastChannelImpl<E> r2, Object r3, SelectInstance<?> r4, Continuation<? super AnonymousClass2> r5) {
            this.this$0 = r2;
            this.$element = r3;
            this.$select = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            return new AnonymousClass2(this.this$0, this.$element, this.$select, r6);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r13) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            boolean r2 = false;
            switch(this.label) {
                case 0: goto L11;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            AnonymousClass2 r1 = this;
            ResultKt.throwOnFailure(r13);     // Catch: Throwable -> L9
        L16:
            boolean r3 = true;
        L26:
            ReentrantLock r4 = BroadcastChannelImpl.access$getLock$p(r1.this$0);
            BroadcastChannelImpl<E> r5 = r1.this$0;
            SelectInstance<?> r6 = r1.$select;
            ReentrantLock r8 = r4;
            r8.lock();
        L46:
            th = move-exception;
            r8.unlock();
            throw th;
        L28:
            if (DebugKt.getASSERTIONS_ENABLED() == true) goto L30;
        L36:
            HashMap r7 = BroadcastChannelImpl.access$getOnSendInternalResult$p(r5);     // Catch: Throwable -> L46
            if (r3 == false) goto L39;
            Object r9 = Unit.INSTANCE;     // Catch: Throwable -> L46
        L40:
            r7.put(r6, r9);     // Catch: Throwable -> L46
            Intrinsics.checkNotNull(r6, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");     // Catch: Throwable -> L46
            SelectImplementation r10 = (SelectImplementation) r6;     // Catch: Throwable -> L46
            if (((SelectImplementation) r6).trySelectDetailed(r5, Unit.INSTANCE) == TrySelectDetailedResult.REREGISTER) goto L43;
            BroadcastChannelImpl.access$getOnSendInternalResult$p(r5).remove(r6);     // Catch: Throwable -> L46
        L43:
            Unit r11 = Unit.INSTANCE;     // Catch: Throwable -> L46
            r8.unlock();
            return Unit.INSTANCE;
        L39:
            r9 = BufferedChannelKt.getCHANNEL_CLOSED();     // Catch: Throwable -> L46
            goto L40
        L30:
            if (BroadcastChannelImpl.access$getOnSendInternalResult$p(r5).get(r6) != null) goto L32;
            r2 = true;
        L32:
            if (r2 == true) goto L36;
            throw new AssertionError();     // Catch: Throwable -> L46
        L9:
            Throwable th = th;
        L20:
            if (r1.this$0.isClosedForSend() == true) goto L22;
        L49:
            throw th;
        L22:
            if ((th instanceof ClosedSendChannelException) == false) goto L24;
        L25:
            r3 = false;
            goto L26
        L24:
            if (r1.this$0.getSendException() != th) goto L49;
        L11:
            ResultKt.throwOnFailure(r13);
            BroadcastChannelImpl<E> r12 = this.this$0;     // Catch: Throwable -> L17
            Object r14 = this.$element;     // Catch: Throwable -> L17
            this.label = 1;     // Catch: Throwable -> L17
            if (r12.send((E) r14, this) != r0) goto L15;
            return r0;
        L15:
            r1 = this;
        L17:
            th = move-exception;
            th = th;
            r1 = this;
            goto L20
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BroadcastChannelImpl$send$1, reason: invalid class name */
    /* JADX INFO: compiled from: BroadcastChannel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastChannelImpl", f = "BroadcastChannel.kt", i = {0, 0}, l = {227}, m = "send", n = {"this", "element"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BroadcastChannelImpl<E> this$0;

        AnonymousClass1(BroadcastChannelImpl<E> r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.send(null, this);
        }
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    public static /* synthetic */ void getValueOrNull$annotations() {
    }

    public static final /* synthetic */ ReentrantLock access$getLock$p(BroadcastChannelImpl $this) {
        return $this.lock;
    }

    public static final /* synthetic */ HashMap access$getOnSendInternalResult$p(BroadcastChannelImpl $this) {
        return $this.onSendInternalResult;
    }

    public static final /* synthetic */ void access$removeSubscriber(BroadcastChannelImpl $this, ReceiveChannel s) {
        $this.removeSubscriber(s);
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public BroadcastChannelImpl(int capacity) {
        boolean r1 = false;
        super(0, null);
        this.capacity = capacity;
        if (this.capacity < 1) goto L5;
    L6:
        r1 = true;
    L7:
        if (r1 == false) goto L11;
        this.lock = new ReentrantLock();
        this.subscribers = CollectionsKt.emptyList();
        this.lastConflatedElement = BroadcastChannelKt.access$getNO_ELEMENT$p();
        this.onSendInternalResult = new HashMap();
        return;
    L11:
        throw new IllegalArgumentException(("BroadcastChannel capacity must be positive or Channel.CONFLATED, but " + this.capacity + " was specified").toString());
    L5:
        if (this.capacity != (-1)) goto L7;
        goto L6
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public ReceiveChannel<E> openSubscription() {
        ReentrantLock $this$withLock$iv = this.lock;
        ReentrantLock r2 = $this$withLock$iv;
        r2.lock();
    L20:
        th = move-exception;
        r2.unlock();
        throw th;
    L4:
        if (this.capacity != (-1)) goto L6;
        BufferedChannel r4 = new SubscriberConflated(this);     // Catch: Throwable -> L20
    L7:
        BufferedChannel s = r4;     // Catch: Throwable -> L20
        if (isClosedForSend() == false) goto L15;
        if (this.lastConflatedElement != BroadcastChannelKt.access$getNO_ELEMENT$p()) goto L15;
        s.close(getCloseCause());     // Catch: Throwable -> L20
        BufferedChannel r5 = s;     // Catch: Throwable -> L20
        r2.unlock();
        return r5;
    L15:
        if (this.lastConflatedElement == BroadcastChannelKt.access$getNO_ELEMENT$p()) goto L17;
        s.mo8915trySendJP2dKIU(getValue());     // Catch: Throwable -> L20
    L17:
        this.subscribers = CollectionsKt.plus(this.subscribers, s);     // Catch: Throwable -> L20
        r2.unlock();
        return s;
    L6:
        r4 = new SubscriberBuffered(this);     // Catch: Throwable -> L20
        goto L7
    }

    private final void removeSubscriber(ReceiveChannel<? extends E> r15) {
        ReentrantLock $this$withLock$iv = this.lock;
        ReentrantLock r2 = $this$withLock$iv;
        r2.lock();
        Iterable $this$filter$iv = this.subscribers;     // Catch: Throwable -> L15
        ArrayList r6 = new ArrayList();     // Catch: Throwable -> L15
        Iterator r9 = $this$filter$iv.iterator();     // Catch: Throwable -> L15
    L5:
        if (r9.hasNext() == false) goto L12;
        Object element$iv$iv = r9.next();     // Catch: Throwable -> L15
        BufferedChannel it = (BufferedChannel) element$iv$iv;     // Catch: Throwable -> L15
        if (it == r15) goto L9;
        boolean r13 = true;
    L10:
        if (r13 == false) goto L5;
        r6.add(element$iv$iv);     // Catch: Throwable -> L15
        goto L5
    L9:
        r13 = false;
        goto L10
    L12:
        this.subscribers = r6;     // Catch: Throwable -> L15
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L15
        r2.unlock();
        return;
    L15:
        th = move-exception;
        r2.unlock();
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008b -> B:27:0x0090). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public Object send(E r10, Continuation<? super Unit> r11) {
        if ((r11 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r11;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        Iterator r3 = (Iterator) r0.L$2;
        Object element = r0.L$1;
        BroadcastChannelImpl<E> r5 = (BroadcastChannelImpl) r0.L$0;
        ResultKt.throwOnFailure($result);
        Object r2 = r1;
        AnonymousClass1 r4 = r0;
        Object $result2 = $result;
    L27:
        boolean success = ((Boolean) $result).booleanValue();
        if (success == false) goto L30;
    L34:
        $result = $result2;
        r0 = r4;
        r1 = r2;
    L22:
        if (r3.hasNext() == false) goto L36;
        Object element$iv = r3.next();
        r0.L$0 = r5;
        r0.L$1 = element;
        r0.L$2 = r3;
        r0.label = 1;
        Object r6 = ((BufferedChannel) element$iv).sendBroadcast$kotlinx_coroutines_core(element, r0);
        if (r6 != r1) goto L26;
        return r1;
    L26:
        AnonymousClass1 r8 = r0;
        $result2 = $result;
        $result = r6;
        r2 = r1;
        r4 = r8;
        goto L27
    L36:
        return Unit.INSTANCE;
    L30:
        if (r5.isClosedForSend() == false) goto L34;
        throw r5.getSendException();
    L13:
        ResultKt.throwOnFailure($result);
        ReentrantLock $this$withLock$iv = this.lock;
        ReentrantLock r7 = $this$withLock$iv;
        r7.lock();
    L39:
        th = move-exception;
        r7.unlock();
        throw th;
    L15:
        if (isClosedForSend() == true) goto L38;
        if (this.capacity != (-1)) goto L19;
        this.lastConflatedElement = r10;     // Catch: Throwable -> L39
    L19:
        Iterable r9 = this.subscribers;     // Catch: Throwable -> L39
        r7.unlock();
        Iterable $this$forEach$iv = r9;
        element = r10;
        r3 = $this$forEach$iv.iterator();
        r5 = this;
        goto L22
    L38:
        throw getSendException();     // Catch: Throwable -> L39
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(this, r11);
        goto L8
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU, reason: not valid java name */
    public Object mo8915trySendJP2dKIU(E r13) {
        ReentrantLock $this$withLock$iv = this.lock;
        ReentrantLock r2 = $this$withLock$iv;
        r2.lock();
    L35:
        th = move-exception;
        r2.unlock();
        throw th;
    L4:
        if (isClosedForSend() == false) goto L8;
        Object r4 = super.mo8915trySendJP2dKIU(r13);     // Catch: Throwable -> L35
        r2.unlock();
        return r4;
    L8:
        Iterable $this$any$iv = this.subscribers;     // Catch: Throwable -> L35
        boolean shouldSuspend = false;
        if (($this$any$iv instanceof Collection) == true) goto L11;
    L13:
        Iterator r6 = $this$any$iv.iterator();     // Catch: Throwable -> L35
    L15:
        if (r6.hasNext() == false) goto L21;
        Object element$iv = r6.next();     // Catch: Throwable -> L35
        BufferedChannel it = (BufferedChannel) element$iv;     // Catch: Throwable -> L35
        if (it.shouldSendSuspend$kotlinx_coroutines_core() == false) goto L15;
        shouldSuspend = true;
    L21:
        if (shouldSuspend == false) goto L26;
        Object r5 = ChannelResult.Companion.m8940failurePtdJZtk();     // Catch: Throwable -> L35
        r2.unlock();
        return r5;
    L26:
        if (this.capacity != (-1)) goto L28;
        this.lastConflatedElement = r13;     // Catch: Throwable -> L35
    L28:
        Iterable $this$forEach$iv = this.subscribers;     // Catch: Throwable -> L35
        Iterator r7 = $this$forEach$iv.iterator();     // Catch: Throwable -> L35
    L30:
        if (r7.hasNext() == false) goto L32;
        Object element$iv2 = r7.next();     // Catch: Throwable -> L35
        BufferedChannel it2 = (BufferedChannel) element$iv2;     // Catch: Throwable -> L35
        it2.mo8915trySendJP2dKIU(r13);     // Catch: Throwable -> L35
        goto L30
    L32:
        Object r8 = ChannelResult.Companion.m8941successJP2dKIU(Unit.INSTANCE);     // Catch: Throwable -> L35
        r2.unlock();
        return r8;
    L11:
        if (((Collection) $this$any$iv).isEmpty() == false) goto L13;
        goto L13
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected void registerSelectForSend(SelectInstance<?> r8, Object element) {
        ReentrantLock $this$withLock$iv = this.lock;
        ReentrantLock r3 = $this$withLock$iv;
        r3.lock();
        Object result = this.onSendInternalResult.remove(r8);     // Catch: Throwable -> L12
        if (result == null) goto L9;
        r8.selectInRegistrationPhase(result);     // Catch: Throwable -> L12
        r3.unlock();
        return;
    L9:
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L12
        r3.unlock();
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(r8.getContext()), null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(this, element, r8, null), 1, null);
        return;
    L12:
        th = move-exception;
        r3.unlock();
        throw th;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable cause) {
        ReentrantLock $this$withLock$iv = this.lock;
        ReentrantLock r2 = $this$withLock$iv;
        r2.lock();
        Iterable $this$forEach$iv = this.subscribers;     // Catch: Throwable -> L16
        Iterator r6 = $this$forEach$iv.iterator();     // Catch: Throwable -> L16
    L5:
        if (r6.hasNext() == false) goto L7;
        Object element$iv = r6.next();     // Catch: Throwable -> L16
        BufferedChannel it = (BufferedChannel) element$iv;     // Catch: Throwable -> L16
        it.close(cause);     // Catch: Throwable -> L16
        goto L5
    L7:
        Iterable $this$forEach$iv2 = this.subscribers;     // Catch: Throwable -> L16
        Iterable $this$filter$iv = $this$forEach$iv2;     // Catch: Throwable -> L16
        ArrayList r7 = new ArrayList();     // Catch: Throwable -> L16
        Iterator r9 = $this$filter$iv.iterator();     // Catch: Throwable -> L16
    L9:
        if (r9.hasNext() == false) goto L13;
        Object element$iv$iv = r9.next();     // Catch: Throwable -> L16
        BufferedChannel it2 = (BufferedChannel) element$iv$iv;     // Catch: Throwable -> L16
        if (it2.hasElements$kotlinx_coroutines_core() == false) goto L9;
        r7.add(element$iv$iv);     // Catch: Throwable -> L16
        goto L9
    L13:
        this.subscribers = r7;     // Catch: Throwable -> L16
        boolean r4 = super.close(cause);     // Catch: Throwable -> L16
        r2.unlock();
        return r4;
    L16:
        th = move-exception;
        r2.unlock();
        throw th;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean cancelImpl$kotlinx_coroutines_core(Throwable cause) {
        ReentrantLock $this$withLock$iv = this.lock;
        ReentrantLock r2 = $this$withLock$iv;
        r2.lock();
        Iterable $this$forEach$iv = this.subscribers;     // Catch: Throwable -> L10
        Iterator r6 = $this$forEach$iv.iterator();     // Catch: Throwable -> L10
    L5:
        if (r6.hasNext() == false) goto L7;
        Object element$iv = r6.next();     // Catch: Throwable -> L10
        BufferedChannel it = (BufferedChannel) element$iv;     // Catch: Throwable -> L10
        it.cancelImpl$kotlinx_coroutines_core(cause);     // Catch: Throwable -> L10
        goto L5
    L7:
        this.lastConflatedElement = BroadcastChannelKt.access$getNO_ELEMENT$p();     // Catch: Throwable -> L10
        boolean r4 = super.cancelImpl$kotlinx_coroutines_core(cause);     // Catch: Throwable -> L10
        r2.unlock();
        return r4;
    L10:
        th = move-exception;
        r2.unlock();
        throw th;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        ReentrantLock $this$withLock$iv = this.lock;
        ReentrantLock r2 = $this$withLock$iv;
        r2.lock();
        boolean r4 = super.isClosedForSend();     // Catch: Throwable -> L6
        r2.unlock();
        return r4;
    L6:
        th = move-exception;
        r2.unlock();
        throw th;
    }

    public final E getValue() {
        ReentrantLock r2 = this.lock;
        r2.lock();
    L16:
        th = move-exception;
        r2.unlock();
        throw th;
    L4:
        if (isClosedForSend() == false) goto L10;
        Throwable r4 = getCloseCause();     // Catch: Throwable -> L16
        if (r4 == null) goto L8;
        throw r4;     // Catch: Throwable -> L16
    L8:
        throw new IllegalStateException("This broadcast channel is closed");     // Catch: Throwable -> L16
    L10:
        if (this.lastConflatedElement == BroadcastChannelKt.access$getNO_ELEMENT$p()) goto L15;
        E r5 = (E) this.lastConflatedElement;
        r2.unlock();
        return r5;
    L15:
        throw new IllegalStateException("No value".toString());     // Catch: Throwable -> L16
    }

    public final E getValueOrNull() {
        ReentrantLock r2 = this.lock;
        r2.lock();
        E r5 = null;
        if (isClosedForReceive() == false) goto L7;
    L10:
        r2.unlock();
        return r5;
    L7:
        if (this.lastConflatedElement == BroadcastChannelKt.access$getNO_ELEMENT$p()) goto L10;
        r5 = (E) this.lastConflatedElement;
    L12:
        th = move-exception;
        r2.unlock();
        throw th;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public String toString() {
        StringBuilder r0 = new StringBuilder();
        if (this.lastConflatedElement == BroadcastChannelKt.access$getNO_ELEMENT$p()) goto L5;
        String r1 = "CONFLATED_ELEMENT=" + this.lastConflatedElement + "; ";
    L7:
        return r0.append(r1).append("BROADCAST=<").append(super.toString()).append(">; SUBSCRIBERS=").append(CollectionsKt.joinToString$default(this.subscribers, ";", "<", ">", 0, null, null, 56, null)).toString();
    L5:
        r1 = "";
        goto L7
    }
}
