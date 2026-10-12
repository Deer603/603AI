package kotlinx.coroutines.internal;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Concurrent.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0080\b\u001a\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000\u001a*\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f*\u00060\rj\u0002`\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\f0\u0010H\u0080\b¢\u0006\u0002\u0010\u0011\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000*\f\b\u0000\u0010\u0012\"\u00020\r2\u00020\r*\u001e\b\u0000\u0010\u0013\u001a\u0004\b\u0000\u0010\f\"\b\u0012\u0004\u0012\u0002H\f0\u00142\b\u0012\u0004\u0012\u0002H\f0\u0014¨\u0006\u0015"}, d2 = {"REMOVE_FUTURE_ON_CANCEL", "Ljava/lang/reflect/Method;", "identitySet", "", "E", "expectedSize", "", "removeFutureOnCancel", "", "executor", "Ljava/util/concurrent/Executor;", "withLock", "T", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "action", "Lkotlin/Function0;", "(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ReentrantLock", "WorkaroundAtomicReference", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ConcurrentKt {
    private static final Method REMOVE_FUTURE_ON_CANCEL = null;

    public static /* synthetic */ void ReentrantLock$annotations() {
    }

    public static /* synthetic */ void WorkaroundAtomicReference$annotations() {
    }

    public static final <T> T withLock(ReentrantLock $this$withLock, Function0<? extends T> r4) {
        ReentrantLock r1 = $this$withLock;
        r1.lock();
        T r2 = r4.invoke();     // Catch: Throwable -> L6
        r1.unlock();
        return r2;
    L6:
        th = move-exception;
        r1.unlock();
        throw th;
    }

    public static final <E> Set<E> identitySet(int expectedSize) {
        return Collections.newSetFromMap(new IdentityHashMap(expectedSize));
    }

    static {
        Method r0 = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE});     // Catch: Throwable -> L4
    L6:
        REMOVE_FUTURE_ON_CANCEL = r0;
        return;
    L5:
        r0 = null;
        goto L6
    }

    public static final boolean removeFutureOnCancel(Executor executor) {
        if ((executor instanceof ScheduledThreadPoolExecutor) == false) goto L6;
        ScheduledThreadPoolExecutor executor2 = (ScheduledThreadPoolExecutor) executor;     // Catch: Throwable -> L14
    L7:
        if (executor2 != null) goto L9;
        return false;
    L9:
        Method r2 = REMOVE_FUTURE_ON_CANCEL;     // Catch: Throwable -> L14
        if (r2 != null) goto L12;
        return false;
    L12:
        r2.invoke(executor2, new Object[]{true});     // Catch: Throwable -> L14
        return true;
    L6:
        executor2 = null;
    L15:
        return false;
    }
}
