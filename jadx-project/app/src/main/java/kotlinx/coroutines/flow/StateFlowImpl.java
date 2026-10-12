package kotlinx.coroutines.flow;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001c\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096@¢\u0006\u0002\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u0003H\u0014J\u001d\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\"2\u0006\u0010#\u001a\u00020\u0011H\u0014¢\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020&2\u0006\u0010\u0012\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010'J&\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020&H\u0016J\u0015\u00100\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\u001a\u00102\u001a\u00020\u001c2\b\u00103\u001a\u0004\u0018\u00010\b2\u0006\u00104\u001a\u00020\bH\u0002R\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bX\u0082\u0004R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\t¨\u00065"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowImpl;", "T", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/StateFlowSlot;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "initialState", "", "(Ljava/lang/Object;)V", "_state", "Lkotlinx/atomicfu/AtomicRef;", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "sequence", "", "value", "getValue", "()Ljava/lang/Object;", "setValue", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "compareAndSet", "", "expect", "update", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "createSlot", "createSlotArray", "", "size", "(I)[Lkotlinx/coroutines/flow/StateFlowSlot;", "emit", "", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fuse", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "resetReplayCache", "tryEmit", "(Ljava/lang/Object;)Z", "updateState", "expectedState", "newState", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class StateFlowImpl<T> extends AbstractSharedFlow<StateFlowSlot> implements MutableStateFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _state$volatile$FU = null;
    private volatile /* synthetic */ Object _state$volatile;
    private int sequence;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StateFlowImpl$collect$1, reason: invalid class name */
    /* JADX INFO: compiled from: StateFlow.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {384, 396, 401}, m = "collect", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ StateFlowImpl<T> this$0;

        AnonymousClass1(StateFlowImpl<T> r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    static {
        _state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(StateFlowImpl.class, Object.class, "_state$volatile");
    }

    private final /* synthetic */ Object get_state$volatile() {
        return this._state$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater get_state$volatile$FU() {
        return _state$volatile$FU;
    }

    private final /* synthetic */ void set_state$volatile(Object r1) {
        this._state$volatile = r1;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public /* bridge */ /* synthetic */ AbstractSharedFlowSlot createSlot() {
        return createSlot();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public /* bridge */ /* synthetic */ AbstractSharedFlowSlot[] createSlotArray(int size) {
        return createSlotArray(size);
    }

    public StateFlowImpl(Object initialState) {
        this._state$volatile = initialState;
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.StateFlow
    public T getValue() {
        Symbol r0 = NullSurrogateKt.NULL;
        T r1 = (T) get_state$volatile$FU().get(this);
        if (r1 == r0) goto L5;
        return r1;
    L5:
        return null;
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public void setValue(T r3) {
        if (r3 != null) goto L4;
        Object r0 = NullSurrogateKt.NULL;
    L5:
        updateState(null, r0);
        return;
    L4:
        r0 = r3;
        goto L5
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public boolean compareAndSet(T r3, T r4) {
        if (r3 != null) goto L4;
        Object r0 = NullSurrogateKt.NULL;
    L5:
        if (r4 != null) goto L7;
        Object r1 = NullSurrogateKt.NULL;
    L9:
        return updateState(r0, r1);
    L7:
        r1 = r4;
        goto L9
    L4:
        r0 = r3;
        goto L5
    }

    private final boolean updateState(Object expectedState, Object newState) {
        monitor-enter(this);
        Object oldState = get_state$volatile$FU().get(this);     // Catch: Throwable -> L47
        if (expectedState == null) goto L13;
        if (Intrinsics.areEqual(oldState, expectedState) == true) goto L13;
        monitor-exit(this);
        return false;
    L13:
        if (Intrinsics.areEqual(oldState, newState) == false) goto L16;
        monitor-exit(this);
        return true;
    L16:
        get_state$volatile$FU().set(this, newState);     // Catch: Throwable -> L47
        int curSequence = this.sequence;     // Catch: Throwable -> L47
        if ((curSequence & 1) != 0) goto L44;
        int curSequence2 = curSequence + 1;     // Catch: Throwable -> L47
        this.sequence = curSequence2;     // Catch: Throwable -> L47
        Object curSlots = getSlots();     // Catch: Throwable -> L47
        Unit r4 = Unit.INSTANCE;     // Catch: Throwable -> L47
        monitor-exit(this);
    L20:
        StateFlowSlot[] r2 = (StateFlowSlot[]) curSlots;
        if (r2 == null) goto L30;
        int r5 = r2.length;
        int r6 = 0;
    L23:
        if (r6 >= r5) goto L30;
        StateFlowSlot r7 = r2[r6];
        if (r7 == null) goto L27;
        r7.makePending();
    L27:
        r6 = r6 + 1;
    L30:
        monitor-enter(this);
    L40:
        th = move-exception;
        throw th;
    L33:
        if (this.sequence == curSequence2) goto L34;
        curSequence2 = this.sequence;     // Catch: Throwable -> L40
        curSlots = getSlots();     // Catch: Throwable -> L40
        Unit r8 = Unit.INSTANCE;     // Catch: Throwable -> L40
        monitor-exit(this);
        goto L20
    L34:
        this.sequence = curSequence2 + 1;     // Catch: Throwable -> L40
        monitor-exit(this);
        return true;
    L44:
        this.sequence = curSequence + 2;     // Catch: Throwable -> L47
        monitor-exit(this);
        return true;
    L47:
        th = move-exception;
        throw th;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        return CollectionsKt.listOf(getValue());
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T r2) {
        setValue(r2);
        return true;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public Object emit(T r2, Continuation<? super Unit> r3) {
        setValue(r2);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00dd -> B:29:0x00a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00f0 -> B:29:0x00a3). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> r11, Continuation<?> r12) {
        if ((r12 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r12;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L21;
            case 1: goto L18;
            case 2: goto L15;
            case 3: goto L12;
            default: goto L11;
        };
    L12:
        Object oldState = r0.L$4;
        Job collectorJob = (Job) r0.L$3;
        StateFlowSlot slot = (StateFlowSlot) r0.L$2;
        FlowCollector<? super T> r4 = (FlowCollector) r0.L$1;
        StateFlowImpl<T> r5 = (StateFlowImpl) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L50
        Object oldState2 = oldState;
        r11 = r4;
    L29:
        Object newState = get_state$volatile$FU().get(r5);     // Catch: Throwable -> L50
        if (collectorJob == null) goto L32;
        JobKt.ensureActive(collectorJob);     // Catch: Throwable -> L50
    L32:
        if (oldState2 != null) goto L34;
    L35:
        Object oldState3 = NullSurrogateKt.NULL;     // Catch: Throwable -> L50
        if (newState != oldState3) goto L38;
        Object r8 = null;
    L39:
        r0.L$0 = r5;     // Catch: Throwable -> L50
        r0.L$1 = r11;     // Catch: Throwable -> L50
        r0.L$2 = slot;     // Catch: Throwable -> L50
        r0.L$3 = collectorJob;     // Catch: Throwable -> L50
        r0.L$4 = newState;     // Catch: Throwable -> L50
        r0.label = 2;     // Catch: Throwable -> L50
        if (r11.emit(r8, r0) != r1) goto L42;
        return r1;
    L42:
        FlowCollector<? super T> r6 = r11;
        Object newState2 = newState;
    L43:
        Object newState3 = newState2;
        r11 = r6;
        oldState2 = newState3;
    L45:
        if (slot.takePending() == true) goto L29;
        r0.L$0 = r5;     // Catch: Throwable -> L50
        r0.L$1 = r11;     // Catch: Throwable -> L50
        r0.L$2 = slot;     // Catch: Throwable -> L50
        r0.L$3 = collectorJob;     // Catch: Throwable -> L50
        r0.L$4 = oldState2;     // Catch: Throwable -> L50
        r0.label = 3;     // Catch: Throwable -> L50
        if (slot.awaitPending(r0) != r1) goto L29;
        return r1;
    L38:
        r8 = newState;
        goto L39
    L34:
        if (Intrinsics.areEqual(oldState2, newState) == true) goto L45;
    L15:
        newState2 = r0.L$4;
        collectorJob = (Job) r0.L$3;
        slot = (StateFlowSlot) r0.L$2;
        r6 = (FlowCollector) r0.L$1;
        r5 = (StateFlowImpl) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L50
        goto L43
    L18:
        Object newState4 = r0.L$2;
        slot = (StateFlowSlot) newState4;
        r11 = (FlowCollector) r0.L$1;
        r5 = (StateFlowImpl) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L50
    L28:
        collectorJob = (Job) r0.getContext().get(Job.Key);     // Catch: Throwable -> L50
        oldState2 = null;
        goto L29
    L21:
        ResultKt.throwOnFailure($result);
        r5 = this;
        slot = r5.allocateSlot();
        if ((r11 instanceof SubscribedFlowCollector) == false) goto L28;
        r0.L$0 = r5;     // Catch: Throwable -> L50
        r0.L$1 = r11;     // Catch: Throwable -> L50
        r0.L$2 = slot;     // Catch: Throwable -> L50
        r0.label = 1;     // Catch: Throwable -> L50
        if (((SubscribedFlowCollector) r11).onSubscription(r0) != r1) goto L28;
        return r1;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L50:
        th = move-exception;
        r5.freeSlot(slot);
        throw th;
    L7:
        r0 = new AnonymousClass1(this, r12);
        goto L8
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    protected StateFlowSlot createSlot() {
        return new StateFlowSlot();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    protected StateFlowSlot[] createSlotArray(int size) {
        return new StateFlowSlot[size];
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow<T> fuse(CoroutineContext context, int capacity, BufferOverflow onBufferOverflow) {
        return StateFlowKt.fuseStateFlow(this, context, capacity, onBufferOverflow);
    }
}
