package androidx.core.provider;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class SelfDestructiveThread {
    private static final int MSG_DESTRUCTION = 0;
    private static final int MSG_INVOKE_RUNNABLE = 1;
    private Handler.Callback mCallback;
    private final int mDestructAfterMillisec;
    private int mGeneration;
    private Handler mHandler;
    private final Object mLock;
    private final int mPriority;
    private HandlerThread mThread;
    private final String mThreadName;

    public interface ReplyCallback<T> {
        void onReply(T r1);
    }

    public SelfDestructiveThread(String threadName, int priority, int destructAfterMillisec) {
        this.mLock = new Object();
        this.mCallback = new AnonymousClass1(this);
        this.mThreadName = threadName;
        this.mPriority = priority;
        this.mDestructAfterMillisec = destructAfterMillisec;
        this.mGeneration = 0;
    }

    public boolean isRunning() {
        Object r0 = this.mLock;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.mThread == null) goto L7;
        boolean r1 = true;
    L8:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r1;
    L7:
        r1 = false;
        goto L8
    }

    public int getGeneration() {
        Object r0 = this.mLock;
        monitor-enter(r0);
        int r1 = this.mGeneration;     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    private void post(Runnable runnable) {
        Object r0 = this.mLock;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.mThread != null) goto L7;
        this.mThread = new HandlerThread(this.mThreadName, this.mPriority);     // Catch: Throwable -> L10
        this.mThread.start();     // Catch: Throwable -> L10
        this.mHandler = new Handler(this.mThread.getLooper(), this.mCallback);     // Catch: Throwable -> L10
        this.mGeneration++;     // Catch: Throwable -> L10
    L7:
        this.mHandler.removeMessages(0);     // Catch: Throwable -> L10
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, runnable));     // Catch: Throwable -> L10
        monitor-exit(r0);     // Catch: Throwable -> L10
    }

    public <T> void postAndReply(final Callable<T> callable, final ReplyCallback<T> reply) {
        final Handler calleeHandler = CalleeHandler.create();
        post(new AnonymousClass2(this, callable, calleeHandler, reply));
    }

    public <T> T postAndWait(final Callable<T> callable, int timeoutMillis) throws InterruptedException {
        final ReentrantLock lock = new ReentrantLock();
        final Condition cond = lock.newCondition();
        final AtomicReference<T> holder = new AtomicReference();
        final AtomicBoolean running = new AtomicBoolean(true);
        post(new AnonymousClass3(this, holder, callable, lock, running, cond));
        lock.lock();
    L23:
        th = move-exception;
        lock.unlock();
        throw th;
    L4:
        if (running.get() == true) goto L9;
        T r11 = holder.get();     // Catch: Throwable -> L23
        lock.unlock();
        return r11;
    L9:
        long remaining = TimeUnit.MILLISECONDS.toNanos(timeoutMillis);     // Catch: Throwable -> L23
    L26:
        remaining = cond.awaitNanos(remaining);     // Catch: InterruptedException -> L12 Throwable -> L23
    L14:
        if (running.get() == false) goto L15;
        if (remaining > 0) goto L26;
        throw new InterruptedException("timeout");     // Catch: Throwable -> L23
    L15:
        T r12 = holder.get();     // Catch: Throwable -> L23
        lock.unlock();
        return r12;
    }

    void onInvokeRunnable(Runnable runnable) {
        runnable.run();
        Object r0 = this.mLock;
        monitor-enter(r0);
        this.mHandler.removeMessages(0);     // Catch: Throwable -> L7
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(0), this.mDestructAfterMillisec);     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    void onDestruction() {
        Object r0 = this.mLock;
        monitor-enter(r0);
    L11:
        th = move-exception;
        throw th;
    L5:
        if (this.mHandler.hasMessages(1) == false) goto L8;
        monitor-exit(r0);     // Catch: Throwable -> L11
        return;
    L8:
        this.mThread.quit();     // Catch: Throwable -> L11
        this.mThread = null;     // Catch: Throwable -> L11
        this.mHandler = null;     // Catch: Throwable -> L11
        monitor-exit(r0);     // Catch: Throwable -> L11
    }
}
