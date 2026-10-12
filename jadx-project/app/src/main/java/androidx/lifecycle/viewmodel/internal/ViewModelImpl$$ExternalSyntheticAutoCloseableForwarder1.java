package androidx.lifecycle.viewmodel.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewModelImpl$$ExternalSyntheticAutoCloseableForwarder1 {
    public static /* synthetic */ void m(ExecutorService r5) {
        if (r5 != ForkJoinPool.commonPool()) goto L5;
        return;
    L5:
        boolean r0 = r5.isTerminated();
        if (r0 == true) goto L25;
        r5.shutdown();
        boolean r1 = false;
    L8:
        if (r0 == true) goto L14;
        r0 = r5.awaitTermination(1, TimeUnit.DAYS);     // Catch: InterruptedException -> L11
    L12:
        if (r1 == true) goto L8;
        r5.shutdownNow();
        r1 = true;
        goto L8
    L14:
        if (r1 == false) goto L26;
        Thread.currentThread().interrupt();
        return;
    L26:
        return;
    }
}
