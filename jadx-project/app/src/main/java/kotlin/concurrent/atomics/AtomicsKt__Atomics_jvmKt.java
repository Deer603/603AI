package kotlin.concurrent.atomics;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Atomics.jvm.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0002*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0011\u0010\u0004\u001a\u00020\u0006*\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0011\u0010\u0000\u001a\u00020\b*\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a\u0011\u0010\u0004\u001a\u00020\t*\u00020\bH\u0007¢\u0006\u0002\u0010\n\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\rH\u0007¢\u0006\u0002\u0010\u000e\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\f0\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u000bH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"asJavaAtomic", "Ljava/util/concurrent/atomic/AtomicInteger;", "Lkotlin/concurrent/atomics/AtomicInt;", "(Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/concurrent/atomic/AtomicInteger;", "asKotlinAtomic", "Ljava/util/concurrent/atomic/AtomicLong;", "Lkotlin/concurrent/atomics/AtomicLong;", "(Ljava/util/concurrent/atomic/AtomicLong;)Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlin/concurrent/atomics/AtomicBoolean;", "(Ljava/util/concurrent/atomic/AtomicBoolean;)Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicReference;", "T", "Lkotlin/concurrent/atomics/AtomicReference;", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/concurrent/atomic/AtomicReference;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/concurrent/atomics/AtomicsKt")
class AtomicsKt__Atomics_jvmKt extends AtomicsKt__Atomics_commonKt {
    public AtomicsKt__Atomics_jvmKt() {
    }

    public static final AtomicInteger asJavaAtomic(AtomicInteger $this$asJavaAtomic) {
        Intrinsics.checkNotNullParameter($this$asJavaAtomic, "<this>");
        return $this$asJavaAtomic;
    }

    public static final AtomicInteger asKotlinAtomic(AtomicInteger $this$asKotlinAtomic) {
        Intrinsics.checkNotNullParameter($this$asKotlinAtomic, "<this>");
        return $this$asKotlinAtomic;
    }

    public static final AtomicLong asJavaAtomic(AtomicLong $this$asJavaAtomic) {
        Intrinsics.checkNotNullParameter($this$asJavaAtomic, "<this>");
        return $this$asJavaAtomic;
    }

    public static final AtomicLong asKotlinAtomic(AtomicLong $this$asKotlinAtomic) {
        Intrinsics.checkNotNullParameter($this$asKotlinAtomic, "<this>");
        return $this$asKotlinAtomic;
    }

    public static final AtomicBoolean asJavaAtomic(AtomicBoolean $this$asJavaAtomic) {
        Intrinsics.checkNotNullParameter($this$asJavaAtomic, "<this>");
        return $this$asJavaAtomic;
    }

    public static final AtomicBoolean asKotlinAtomic(AtomicBoolean $this$asKotlinAtomic) {
        Intrinsics.checkNotNullParameter($this$asKotlinAtomic, "<this>");
        return $this$asKotlinAtomic;
    }

    public static final <T> AtomicReference<T> asJavaAtomic(AtomicReference<T> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return r1;
    }

    public static final <T> AtomicReference<T> asKotlinAtomic(AtomicReference<T> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return r1;
    }
}
