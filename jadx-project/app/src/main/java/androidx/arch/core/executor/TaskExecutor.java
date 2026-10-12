package androidx.arch.core.executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class TaskExecutor {
    public abstract void executeOnDiskIO(Runnable r1);

    public abstract boolean isMainThread();

    public abstract void postToMainThread(Runnable r1);

    public TaskExecutor() {
    }

    public void executeOnMainThread(Runnable runnable) {
        if (isMainThread() == false) goto L5;
        runnable.run();
        return;
    L5:
        postToMainThread(runnable);
    }
}
