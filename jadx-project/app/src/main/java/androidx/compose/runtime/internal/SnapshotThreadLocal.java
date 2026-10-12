package androidx.compose.runtime.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: compiled from: SnapshotThreadLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\r\u0010\f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0011R\u0012\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R.\u0010\u0006\u001a\"\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007j\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "T", "", "()V", "mainThreadValue", "Ljava/lang/Object;", "map", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/ThreadMap;", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/internal/AtomicReference;", "writeMutex", "get", "()Ljava/lang/Object;", "set", "", "value", "(Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SnapshotThreadLocal<T> {
    public static final int $stable = 0;
    private T mainThreadValue;
    private final AtomicReference<ThreadMap> map;
    private final Object writeMutex;

    static {
        $stable = 8;
    }

    public SnapshotThreadLocal() {
        this.map = new AtomicReference(SnapshotThreadLocalKt.access$getEmptyThreadMap$p());
        this.writeMutex = new Object();
    }

    public final T get() {
        long r0 = Thread_jvmKt.currentThreadId();
        if (r0 != Thread_androidKt.getMainThreadId()) goto L6;
        return this.mainThreadValue;
    L6:
        return (T) this.map.get().get(r0);
    }

    public final void set(T r9) {
        long key = Thread_jvmKt.currentThreadId();
        if (key != Thread_androidKt.getMainThreadId()) goto L5;
        this.mainThreadValue = r9;
        return;
    L5:
        Object lock$iv = this.writeMutex;
        monitor-enter(lock$iv);
        ThreadMap current = this.map.get();     // Catch: Throwable -> L15
        if (current.trySet(key, r9) == false) goto L12;
        monitor-exit(lock$iv);
        return;
    L12:
        this.map.set(current.newWith(key, r9));     // Catch: Throwable -> L15
        Unit r4 = Unit.INSTANCE;     // Catch: Throwable -> L15
        monitor-exit(lock$iv);
        return;
    L15:
        th = move-exception;
        throw th;
    }
}
