package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: compiled from: AbstractTimeSource.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\t\u0010\u0002\u001a\u00020\u0003H\u0081\b\u001a\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0080\b\u001a\t\u0010\u0007\u001a\u00020\u0003H\u0081\b\u001a\u0019\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0081\b\u001a\t\u0010\f\u001a\u00020\u0005H\u0081\b\u001a\t\u0010\r\u001a\u00020\u0005H\u0081\b\u001a\t\u0010\u000e\u001a\u00020\u0005H\u0081\b\u001a\u0011\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0081\b\u001a\t\u0010\u0012\u001a\u00020\u0005H\u0081\b\u001a\u0019\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0081\b\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"timeSource", "Lkotlinx/coroutines/AbstractTimeSource;", "currentTimeMillis", "", "mockTimeSource", "", "source", "nanoTime", "parkNanos", "blocker", "", "nanos", "registerTimeLoopThread", "trackTask", "unTrackTask", "unpark", "thread", "Ljava/lang/Thread;", "unregisterTimeLoopThread", "wrapTask", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AbstractTimeSourceKt {
    private static AbstractTimeSource timeSource;

    static {
    }

    public static final /* synthetic */ AbstractTimeSource access$getTimeSource$p() {
        return timeSource;
    }

    public static final /* synthetic */ void access$setTimeSource$p(AbstractTimeSource r0) {
        timeSource = r0;
    }

    public static final void mockTimeSource(AbstractTimeSource source) {
        access$setTimeSource$p(source);
    }

    private static final long currentTimeMillis() {
        AbstractTimeSource r0 = access$getTimeSource$p();
        if (r0 == null) goto L6;
        return r0.currentTimeMillis();
    L6:
        return System.currentTimeMillis();
    }

    private static final long nanoTime() {
        AbstractTimeSource r0 = access$getTimeSource$p();
        if (r0 == null) goto L6;
        return r0.nanoTime();
    L6:
        return System.nanoTime();
    }

    private static final Runnable wrapTask(Runnable block) {
        AbstractTimeSource r0 = access$getTimeSource$p();
        if (r0 == null) goto L7;
        Runnable r1 = r0.wrapTask(block);
        if (r1 == null) goto L7;
        return r1;
    L7:
        return block;
    }

    private static final void trackTask() {
        AbstractTimeSource r0 = access$getTimeSource$p();
        if (r0 == null) goto L6;
        r0.trackTask();
        return;
    }

    private static final void unTrackTask() {
        AbstractTimeSource r0 = access$getTimeSource$p();
        if (r0 == null) goto L6;
        r0.unTrackTask();
        return;
    }

    private static final void registerTimeLoopThread() {
        AbstractTimeSource r0 = access$getTimeSource$p();
        if (r0 == null) goto L6;
        r0.registerTimeLoopThread();
        return;
    }

    private static final void unregisterTimeLoopThread() {
        AbstractTimeSource r0 = access$getTimeSource$p();
        if (r0 == null) goto L6;
        r0.unregisterTimeLoopThread();
        return;
    }

    private static final void parkNanos(Object blocker, long nanos) {
        AbstractTimeSource r0 = access$getTimeSource$p();
        if (r0 == null) goto L5;
        r0.parkNanos(blocker, nanos);
        Unit r1 = Unit.INSTANCE;
    L6:
        if (r1 != null) goto L9;
        LockSupport.parkNanos(blocker, nanos);
        return;
    L9:
        return;
    L5:
        r1 = null;
        goto L6
    }

    private static final void unpark(Thread thread) {
        AbstractTimeSource r0 = access$getTimeSource$p();
        if (r0 == null) goto L5;
        r0.unpark(thread);
        Unit r1 = Unit.INSTANCE;
    L6:
        if (r1 != null) goto L9;
        LockSupport.unpark(thread);
        return;
    L9:
        return;
    L5:
        r1 = null;
        goto L6
    }
}
