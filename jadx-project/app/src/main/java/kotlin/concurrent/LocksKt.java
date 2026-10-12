package kotlin.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Locks.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0005\u001a6\u0010\u0006\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\b\u001a6\u0010\t\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"withLock", "T", "Ljava/util/concurrent/locks/Lock;", "action", "Lkotlin/Function0;", "(Ljava/util/concurrent/locks/Lock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "read", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "(Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "write", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class LocksKt {
    private static final <T> T withLock(Lock $this$withLock, Function0<? extends T> r2) {
        Intrinsics.checkNotNullParameter($this$withLock, "<this>");
        Intrinsics.checkNotNullParameter(r2, "action");
        $this$withLock.lock();
        T r0 = r2.invoke();     // Catch: Throwable -> L6
        $this$withLock.unlock();
        return r0;
    L6:
        th = move-exception;
        $this$withLock.unlock();
        throw th;
    }

    private static final <T> T read(ReentrantReadWriteLock $this$read, Function0<? extends T> r3) {
        Intrinsics.checkNotNullParameter($this$read, "<this>");
        Intrinsics.checkNotNullParameter(r3, "action");
        ReentrantReadWriteLock.ReadLock rl = $this$read.readLock();
        rl.lock();
        T r1 = r3.invoke();     // Catch: Throwable -> L6
        rl.unlock();
        return r1;
    L6:
        th = move-exception;
        rl.unlock();
        throw th;
    }

    private static final <T> T write(ReentrantReadWriteLock $this$write, Function0<? extends T> r8) {
        Intrinsics.checkNotNullParameter($this$write, "<this>");
        Intrinsics.checkNotNullParameter(r8, "action");
        ReentrantReadWriteLock.ReadLock rl = $this$write.readLock();
        int r2 = 0;
        if ($this$write.getWriteHoldCount() != 0) goto L5;
        int readCount = $this$write.getReadHoldCount();
    L6:
        int r3 = 0;
    L7:
        if (r3 >= readCount) goto L9;
        rl.unlock();
        r3 = r3 + 1;
        goto L7
    L9:
        ReentrantReadWriteLock.WriteLock wl = $this$write.writeLock();
        wl.lock();
        T r4 = r8.invoke();     // Catch: Throwable -> L15
    L11:
        if (r2 >= readCount) goto L13;
        rl.lock();
        r2 = r2 + 1;
        goto L11
    L13:
        wl.unlock();
        return r4;
    L15:
        th = move-exception;
    L16:
        if (r2 >= readCount) goto L18;
        rl.lock();
        r2 = r2 + 1;
        goto L16
    L18:
        wl.unlock();
        throw th;
    L5:
        readCount = 0;
        goto L6
    }
}
