package kotlin.concurrent.internal;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AtomicIntrinsics.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0001\u001a\u001c\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a\u001c\u0010\u0000\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0001\u001a-\u0010\u0000\u001a\u0002H\t\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\n2\u0006\u0010\u0003\u001a\u0002H\t2\u0006\u0010\u0004\u001a\u0002H\tH\u0001¢\u0006\u0002\u0010\u000b\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0001\u001a$\u0010\u0000\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a5\u0010\u0000\u001a\u0002H\t\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\u000f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\t2\u0006\u0010\u0004\u001a\u0002H\tH\u0001¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"compareAndExchange", "", "Ljava/util/concurrent/atomic/AtomicInteger;", "expected", "newValue", "", "Ljava/util/concurrent/atomic/AtomicLong;", "", "Ljava/util/concurrent/atomic/AtomicBoolean;", "T", "Ljava/util/concurrent/atomic/AtomicReference;", "(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicIntegerArray;", "index", "Ljava/util/concurrent/atomic/AtomicLongArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class AtomicIntrinsicsKt {
    public static final int compareAndExchange(AtomicInteger $this$compareAndExchange, int expected, int newValue) {
        Intrinsics.checkNotNullParameter($this$compareAndExchange, "<this>");
    L3:
        int currentValue = $this$compareAndExchange.get();
        if (expected != currentValue) goto L8;
        if ($this$compareAndExchange.compareAndSet(expected, newValue) == false) goto L3;
        return expected;
    L8:
        return currentValue;
    }

    public static final long compareAndExchange(AtomicLong $this$compareAndExchange, long expected, long newValue) {
        Intrinsics.checkNotNullParameter($this$compareAndExchange, "<this>");
    L3:
        long currentValue = $this$compareAndExchange.get();
        if (expected != currentValue) goto L8;
        if ($this$compareAndExchange.compareAndSet(expected, newValue) == false) goto L3;
        return expected;
    L8:
        return currentValue;
    }

    public static final boolean compareAndExchange(AtomicBoolean $this$compareAndExchange, boolean expected, boolean newValue) {
        Intrinsics.checkNotNullParameter($this$compareAndExchange, "<this>");
    L3:
        boolean currentValue = $this$compareAndExchange.get();
        if (expected != currentValue) goto L8;
        if ($this$compareAndExchange.compareAndSet(expected, newValue) == false) goto L3;
        return expected;
    L8:
        return currentValue;
    }

    public static final <T> T compareAndExchange(AtomicReference<T> r2, T r3, T r4) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
    L3:
        T r0 = r2.get();
        if (r3 != r0) goto L8;
        if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(r2, r3, r4) == false) goto L3;
        return r3;
    L8:
        return r0;
    }

    public static final int compareAndExchange(AtomicIntegerArray $this$compareAndExchange, int index, int expected, int newValue) {
        Intrinsics.checkNotNullParameter($this$compareAndExchange, "<this>");
    L3:
        int currentValue = $this$compareAndExchange.get(index);
        if (expected != currentValue) goto L8;
        if ($this$compareAndExchange.compareAndSet(index, expected, newValue) == false) goto L3;
        return expected;
    L8:
        return currentValue;
    }

    public static final long compareAndExchange(AtomicLongArray $this$compareAndExchange, int index, long expected, long newValue) {
        Intrinsics.checkNotNullParameter($this$compareAndExchange, "<this>");
    L3:
        long currentValue = $this$compareAndExchange.get(index);
        if (expected != currentValue) goto L8;
        if ($this$compareAndExchange.compareAndSet(index, expected, newValue) == false) goto L3;
        return expected;
    L8:
        return currentValue;
    }

    public static final <T> T compareAndExchange(AtomicReferenceArray<T> r2, int index, T r4, T r5) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
    L3:
        T r0 = r2.get(index);
        if (r4 != r0) goto L8;
        if (AtomicIntrinsicsKt$$ExternalSyntheticBackportWithForwarding0.m(r2, index, r4, r5) == false) goto L3;
        return r4;
    L8:
        return r0;
    }
}
