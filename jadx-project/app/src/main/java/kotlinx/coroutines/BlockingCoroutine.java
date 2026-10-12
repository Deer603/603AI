package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u000b\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\f¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/BlockingCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "blockedThread", "Ljava/lang/Thread;", "eventLoop", "Lkotlinx/coroutines/EventLoop;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lkotlinx/coroutines/EventLoop;)V", "isScopedCoroutine", "", "()Z", "afterCompletion", "", "state", "", "joinBlocking", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class BlockingCoroutine<T> extends AbstractCoroutine<T> {
    private final Thread blockedThread;
    private final EventLoop eventLoop;

    public BlockingCoroutine(CoroutineContext parentContext, Thread blockedThread, EventLoop eventLoop) {
        super(parentContext, true, true);
        this.blockedThread = blockedThread;
        this.eventLoop = eventLoop;
    }

    @Override // kotlinx.coroutines.JobSupport
    protected boolean isScopedCoroutine() {
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void afterCompletion(Object state) {
        if (Intrinsics.areEqual(Thread.currentThread(), this.blockedThread) == true) goto L11;
        Thread r0 = this.blockedThread;
        AbstractTimeSource r1 = AbstractTimeSourceKt.access$getTimeSource$p();
        if (r1 == null) goto L7;
        r1.unpark(r0);
        Unit r2 = Unit.INSTANCE;
    L8:
        if (r2 != null) goto L12;
        LockSupport.unpark(r0);
        return;
    L12:
        return;
    L7:
        r2 = null;
        goto L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T joinBlocking() {
        AbstractTimeSource r0 = AbstractTimeSourceKt.access$getTimeSource$p();
        if (r0 == null) goto L51;
        r0.registerTimeLoopThread();
    L51:
        EventLoop r1 = this.eventLoop;     // Catch: Throwable -> L46
        CompletedExceptionally r3 = null;
        if (r1 == null) goto L52;
        EventLoop.incrementUseCount$default(r1, false, 1, null);     // Catch: Throwable -> L46
    L52:
    L41:
        th = move-exception;
        EventLoop r4 = this.eventLoop;     // Catch: Throwable -> L46
        if (r4 == null) goto L45;
        EventLoop.decrementUseCount$default(r4, false, 1, null);     // Catch: Throwable -> L46
    L45:
        throw th;     // Catch: Throwable -> L46
    L12:
        if (Thread.interrupted() == true) goto L39;
        EventLoop r2 = this.eventLoop;     // Catch: Throwable -> L41
        if (r2 == null) goto L16;
        long r5 = r2.processNextEvent();     // Catch: Throwable -> L41
    L18:
        if (isCompleted() == true) goto L26;
        AbstractTimeSource r6 = AbstractTimeSourceKt.access$getTimeSource$p();     // Catch: Throwable -> L41
        if (r6 == null) goto L22;
        r6.parkNanos(this, r5);     // Catch: Throwable -> L41
        Unit r7 = Unit.INSTANCE;     // Catch: Throwable -> L41
    L23:
        if (r7 != null) goto L52;
        LockSupport.parkNanos(this, r5);     // Catch: Throwable -> L41
        goto L52
    L22:
        r7 = null;
        goto L23
    L26:
        EventLoop r8 = this.eventLoop;     // Catch: Throwable -> L46
        if (r8 == null) goto L29;
        EventLoop.decrementUseCount$default(r8, false, 1, null);     // Catch: Throwable -> L46
    L29:
        AbstractTimeSource r9 = AbstractTimeSourceKt.access$getTimeSource$p();
        if (r9 == null) goto L32;
        r9.unregisterTimeLoopThread();
    L32:
        T r10 = (T) JobSupportKt.unboxState(getState$kotlinx_coroutines_core());
        if ((r10 instanceof CompletedExceptionally) == false) goto L35;
        r3 = (CompletedExceptionally) r10;
    L35:
        if (r3 != null) goto L38;
        return r10;
    L38:
        throw r3.cause;
    L16:
        r5 = Long.MAX_VALUE;
        goto L18
    L39:
        InterruptedException r11 = new InterruptedException();     // Catch: Throwable -> L41
        cancelCoroutine(r11);     // Catch: Throwable -> L41
        throw r11;     // Catch: Throwable -> L41
    L46:
        th = move-exception;
        AbstractTimeSource r12 = AbstractTimeSourceKt.access$getTimeSource$p();
        if (r12 == null) goto L50;
        r12.unregisterTimeLoopThread();
    L50:
        throw th;
    }
}
