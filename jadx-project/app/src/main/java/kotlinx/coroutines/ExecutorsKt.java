package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0002\b\u0003\u001a\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0001*\u0010\b\u0007\u0010\u0007\"\u00020\u00042\u00020\u0004B\u0002\b\b¨\u0006\t"}, d2 = {"asCoroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "from", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Ljava/util/concurrent/ExecutorService;", "asExecutor", "CloseableCoroutineDispatcher", "Lkotlinx/coroutines/ExperimentalCoroutinesApi;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ExecutorsKt {
    public static /* synthetic */ void CloseableCoroutineDispatcher$annotations() {
    }

    public static final ExecutorCoroutineDispatcher from(ExecutorService $this$asCoroutineDispatcher) {
        return new ExecutorCoroutineDispatcherImpl($this$asCoroutineDispatcher);
    }

    public static final CoroutineDispatcher from(Executor $this$asCoroutineDispatcher) {
        if (($this$asCoroutineDispatcher instanceof DispatcherExecutor) == false) goto L5;
        DispatcherExecutor r0 = (DispatcherExecutor) $this$asCoroutineDispatcher;
    L6:
        if (r0 == null) goto L10;
        CoroutineDispatcher r1 = r0.dispatcher;
        if (r1 == null) goto L10;
        return r1;
    L10:
        return new ExecutorCoroutineDispatcherImpl($this$asCoroutineDispatcher);
    L5:
        r0 = null;
        goto L6
    }

    public static final Executor asExecutor(CoroutineDispatcher $this$asExecutor) {
        if (($this$asExecutor instanceof ExecutorCoroutineDispatcher) == false) goto L5;
        ExecutorCoroutineDispatcher r0 = (ExecutorCoroutineDispatcher) $this$asExecutor;
    L6:
        if (r0 == null) goto L10;
        Executor r1 = r0.getExecutor();
        if (r1 == null) goto L10;
        return r1;
    L10:
        return new DispatcherExecutor($this$asExecutor);
    L5:
        r0 = null;
        goto L6
    }
}
