package androidx.arch.core.executor;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class ArchTaskExecutor extends TaskExecutor {
    private static final Executor sIOThreadExecutor = null;
    private static volatile ArchTaskExecutor sInstance;
    private static final Executor sMainThreadExecutor = null;
    private final TaskExecutor mDefaultTaskExecutor;
    private TaskExecutor mDelegate;

    static {
        sMainThreadExecutor = new ArchTaskExecutor$$ExternalSyntheticLambda0();
        sIOThreadExecutor = new ArchTaskExecutor$$ExternalSyntheticLambda1();
    }

    static /* synthetic */ void lambda$static$0(Runnable command) {
        getInstance().postToMainThread(command);
    }

    static /* synthetic */ void lambda$static$1(Runnable command) {
        getInstance().executeOnDiskIO(command);
    }

    private ArchTaskExecutor() {
        this.mDefaultTaskExecutor = new DefaultTaskExecutor();
        this.mDelegate = this.mDefaultTaskExecutor;
    }

    public static ArchTaskExecutor getInstance() {
        if (sInstance == null) goto L7;
        return sInstance;
    L7:
        monitor-enter(ArchTaskExecutor.class);
    L14:
        th = move-exception;
        throw th;
    L9:
        if (sInstance != null) goto L11;
        sInstance = new ArchTaskExecutor();     // Catch: Throwable -> L14
    L11:
        monitor-exit(ArchTaskExecutor.class);     // Catch: Throwable -> L14
        return sInstance;
    }

    public void setDelegate(TaskExecutor taskExecutor) {
        if (taskExecutor != null) goto L4;
        TaskExecutor r0 = this.mDefaultTaskExecutor;
    L5:
        this.mDelegate = r0;
        return;
    L4:
        r0 = taskExecutor;
        goto L5
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void executeOnDiskIO(Runnable runnable) {
        this.mDelegate.executeOnDiskIO(runnable);
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void postToMainThread(Runnable runnable) {
        this.mDelegate.postToMainThread(runnable);
    }

    public static Executor getMainThreadExecutor() {
        return sMainThreadExecutor;
    }

    public static Executor getIOThreadExecutor() {
        return sIOThreadExecutor;
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public boolean isMainThread() {
        return this.mDelegate.isMainThread();
    }
}
