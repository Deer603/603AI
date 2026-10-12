package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Interruptible.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\rR\t\u0010\u0005\u001a\u00020\u0006X\u0082\u0004R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/ThreadState;", "Lkotlinx/coroutines/InternalCompletionHandler;", "job", "Lkotlinx/coroutines/Job;", "(Lkotlinx/coroutines/Job;)V", "_state", "Lkotlinx/atomicfu/AtomicInt;", "cancelHandle", "Lkotlinx/coroutines/DisposableHandle;", "targetThread", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "clearInterrupt", "", "invalidState", "", "state", "", "invoke", "cause", "", "setup", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ThreadState implements InternalCompletionHandler {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _state$volatile$FU = null;
    private volatile /* synthetic */ int _state$volatile;
    private DisposableHandle cancelHandle;
    private final Job job;
    private final Thread targetThread;

    static {
        _state$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(ThreadState.class, "_state$volatile");
    }

    private final /* synthetic */ int get_state$volatile() {
        return this._state$volatile;
    }

    private static final /* synthetic */ AtomicIntegerFieldUpdater get_state$volatile$FU() {
        return _state$volatile$FU;
    }

    private final /* synthetic */ void loop$atomicfu(Object r2, AtomicIntegerFieldUpdater r3, Function1<? super Integer, Unit> r4) {
    L2:
        r4.invoke(Integer.valueOf(r3.get(r2)));
        goto L2
    }

    private final /* synthetic */ void set_state$volatile(int r1) {
        this._state$volatile = r1;
    }

    public ThreadState(Job job) {
        this.job = job;
        this.targetThread = Thread.currentThread();
    }

    public final void setup() {
        this.cancelHandle = JobKt.invokeOnCompletion(this.job, true, true, this);
        AtomicIntegerFieldUpdater handler$atomicfu$iv = get_state$volatile$FU();
    L3:
        int state = handler$atomicfu$iv.get(this);
        switch(state) {
            case 0: goto L9;
            case 1: goto L5;
            case 2: goto L7;
            case 3: goto L7;
            default: goto L5;
        };
    L9:
        if (get_state$volatile$FU().compareAndSet(this, state, 0) == false) goto L3;
        return;
    L5:
        invalidState(state);
        throw new KotlinNothingValueException();
    }

    public final void clearInterrupt() {
        AtomicIntegerFieldUpdater handler$atomicfu$iv = get_state$volatile$FU();
    L3:
        int state = handler$atomicfu$iv.get(this);
        switch(state) {
            case 0: goto L11;
            case 1: goto L5;
            case 2: goto L3;
            case 3: goto L7;
            default: goto L5;
        };
    L5:
        invalidState(state);
        throw new KotlinNothingValueException();
    L7:
        Thread.interrupted();
        return;
    L11:
        if (get_state$volatile$FU().compareAndSet(this, state, 1) == false) goto L3;
        DisposableHandle r4 = this.cancelHandle;
        if (r4 == null) goto L24;
        r4.dispose();
        return;
    }

    @Override // kotlinx.coroutines.InternalCompletionHandler
    public void invoke(Throwable cause) {
        AtomicIntegerFieldUpdater handler$atomicfu$iv = get_state$volatile$FU();
    L3:
        int state = handler$atomicfu$iv.get(this);
        switch(state) {
            case 0: goto L9;
            case 1: goto L7;
            case 2: goto L7;
            case 3: goto L7;
            default: goto L5;
        };
    L9:
        if (get_state$volatile$FU().compareAndSet(this, state, 2) == false) goto L3;
        this.targetThread.interrupt();
        get_state$volatile$FU().set(this, 3);
        return;
    L5:
        invalidState(state);
        throw new KotlinNothingValueException();
    }

    private final Void invalidState(int state) {
        throw new IllegalStateException(("Illegal state " + state).toString());
    }
}
