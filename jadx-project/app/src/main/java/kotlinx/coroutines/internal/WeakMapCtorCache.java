package kotlinx.coroutines.internal;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: ExceptionsConstructor.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\tj\u0002`\n2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u0005\u001a(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\tj\u0002`\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/internal/WeakMapCtorCache;", "Lkotlinx/coroutines/internal/CtorCache;", "()V", "cacheLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "exceptionCtors", "Ljava/util/WeakHashMap;", "Ljava/lang/Class;", "", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "get", "key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class WeakMapCtorCache extends CtorCache {
    public static final WeakMapCtorCache INSTANCE = null;
    private static final ReentrantReadWriteLock cacheLock = null;
    private static final WeakHashMap<Class<? extends Throwable>, Function1<Throwable, Throwable>> exceptionCtors = null;

    private WeakMapCtorCache() {
    }

    static {
        INSTANCE = new WeakMapCtorCache();
        cacheLock = new ReentrantReadWriteLock();
        exceptionCtors = new WeakHashMap();
    }

    @Override // kotlinx.coroutines.internal.CtorCache
    public Function1<Throwable, Throwable> get(Class<? extends Throwable> r10) {
        ReentrantReadWriteLock.ReadLock r0 = cacheLock.readLock();
        r0.lock();
        Function1<Throwable, Throwable> r2 = exceptionCtors.get(r10);     // Catch: Throwable -> L32
        if (r2 == null) goto L7;
        r0.unlock();
        return r2;
    L7:
        r0.unlock();
        ReentrantReadWriteLock r1 = cacheLock;
        ReentrantReadWriteLock.ReadLock r3 = r1.readLock();
        int r4 = 0;
        if (r1.getWriteHoldCount() != 0) goto L10;
        int r5 = r1.getReadHoldCount();
    L11:
        int r6 = 0;
    L12:
        if (r6 >= r5) goto L14;
        r3.unlock();
        r6 = r6 + 1;
        goto L12
    L14:
        ReentrantReadWriteLock.WriteLock r7 = r1.writeLock();
        r7.lock();
        Function1<Throwable, Throwable> r8 = exceptionCtors.get(r10);     // Catch: Throwable -> L27
        if (r8 != null) goto L18;
        Function1<Throwable, Throwable> r9 = ExceptionsConstructorKt.access$createConstructor(r10);     // Catch: Throwable -> L27
        exceptionCtors.put(r10, r9);     // Catch: Throwable -> L27
    L23:
        if (r4 >= r5) goto L25;
        r3.lock();
        r4 = r4 + 1;
        goto L23
    L25:
        r7.unlock();
        return r9;
    L18:
        if (r4 >= r5) goto L20;
        r3.lock();
        r4 = r4 + 1;
        goto L18
    L20:
        r7.unlock();
        return r8;
    L27:
        th = move-exception;
    L28:
        if (r4 >= r5) goto L30;
        r3.lock();
        r4 = r4 + 1;
        goto L28
    L30:
        r7.unlock();
        throw th;
    L10:
        r5 = 0;
    L32:
        th = move-exception;
        r0.unlock();
        throw th;
    }
}
