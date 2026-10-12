package kotlinx.coroutines;

import androidx.autofill.HintConstants;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* JADX INFO: compiled from: ThreadPoolDispatcher.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"newFixedThreadPoolContext", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "nThreads", "", HintConstants.AUTOFILL_HINT_NAME, "", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/ThreadPoolDispatcherKt")
final /* synthetic */ class ThreadPoolDispatcherKt__ThreadPoolDispatcherKt {
    public static /* synthetic */ Thread $r8$lambda$XFVhsA28fmYUFDEvkT7eVQ1JeFw(int r0, String r1, AtomicInteger r2, Runnable r3) {
        return newFixedThreadPoolContext$lambda$1$ThreadPoolDispatcherKt__ThreadPoolDispatcherKt(r0, r1, r2, r3);
    }

    public static final ExecutorCoroutineDispatcher newFixedThreadPoolContext(final int nThreads, final String name) {
        boolean r0 = true;
        if (nThreads >= 1) goto L6;
        r0 = false;
    L6:
        if (r0 == false) goto L10;
        final AtomicInteger threadNo = new AtomicInteger();
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(nThreads, new ThreadPoolDispatcherKt__ThreadPoolDispatcherKt$$ExternalSyntheticLambda0(nThreads, name, threadNo));
        return ExecutorsKt.from(executor);
    L10:
        throw new IllegalArgumentException(("Expected at least one thread, but " + nThreads + " specified").toString());
    }

    private static final Thread newFixedThreadPoolContext$lambda$1$ThreadPoolDispatcherKt__ThreadPoolDispatcherKt(int $nThreads, String $name, AtomicInteger $threadNo, Runnable runnable) {
        if ($nThreads != 1) goto L5;
        String r2 = $name;
    L6:
        Thread t = new Thread(runnable, r2);
        t.setDaemon(true);
        return t;
    L5:
        r2 = $name + '-' + $threadNo.incrementAndGet();
        goto L6
    }
}
