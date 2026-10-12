package androidx.core.os;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class CancellationSignal {
    private boolean mCancelInProgress;
    private Object mCancellationSignalObj;
    private boolean mIsCanceled;
    private OnCancelListener mOnCancelListener;

    public interface OnCancelListener {
        void onCancel();
    }

    public CancellationSignal() {
    }

    public boolean isCanceled() {
        monitor-enter(this);
        boolean r0 = this.mIsCanceled;     // Catch: Throwable -> L6
        monitor-exit(this);     // Catch: Throwable -> L6
        return r0;
    L6:
        th = move-exception;
        throw th;
    }

    public void throwIfCanceled() {
        if (isCanceled() == true) goto L6;
        return;
    L6:
        throw new OperationCanceledException();
    }

    public void cancel() {
        monitor-enter(this);
    L31:
        th = move-exception;
        throw th;
    L4:
        if (this.mIsCanceled == false) goto L7;
        monitor-exit(this);     // Catch: Throwable -> L31
        return;
    L7:
        this.mIsCanceled = true;     // Catch: Throwable -> L31
        this.mCancelInProgress = true;     // Catch: Throwable -> L31
        OnCancelListener listener = this.mOnCancelListener;     // Catch: Throwable -> L31
        Object obj = this.mCancellationSignalObj;     // Catch: Throwable -> L31
        monitor-exit(this);     // Catch: Throwable -> L31
        if (listener != null) goto L36;
    L14:
        if (obj == null) goto L24;
        ((android.os.CancellationSignal) obj).cancel();     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        monitor-enter(this);
        this.mCancelInProgress = false;     // Catch: Throwable -> L21
        notifyAll();     // Catch: Throwable -> L21
        throw th;
    L21:
        th = move-exception;
        throw th;
    L24:
        monitor-enter(this);
        this.mCancelInProgress = false;     // Catch: Throwable -> L28
        notifyAll();     // Catch: Throwable -> L28
        monitor-exit(this);     // Catch: Throwable -> L28
        return;
    L28:
        th = move-exception;
        throw th;
    L36:
        listener.onCancel();     // Catch: Throwable -> L12
        goto L14
    }

    public void setOnCancelListener(OnCancelListener listener) {
        monitor-enter(this);
        waitForCancelFinishedLocked();     // Catch: Throwable -> L16
        if (this.mOnCancelListener != listener) goto L7;
        monitor-exit(this);     // Catch: Throwable -> L16
        return;
    L7:
        this.mOnCancelListener = listener;     // Catch: Throwable -> L16
        if (this.mIsCanceled == false) goto L14;
        if (listener == null) goto L14;
        monitor-exit(this);     // Catch: Throwable -> L16
        listener.onCancel();
        return;
    L14:
        monitor-exit(this);     // Catch: Throwable -> L16
        return;
    L16:
        th = move-exception;
        throw th;
    }

    public Object getCancellationSignalObject() {
        monitor-enter(this);
    L11:
        th = move-exception;
        throw th;
    L4:
        if (this.mCancellationSignalObj != null) goto L8;
        this.mCancellationSignalObj = new android.os.CancellationSignal();     // Catch: Throwable -> L11
        if (this.mIsCanceled == false) goto L8;
        ((android.os.CancellationSignal) this.mCancellationSignalObj).cancel();     // Catch: Throwable -> L11
    L8:
        Object r0 = this.mCancellationSignalObj;     // Catch: Throwable -> L11
        monitor-exit(this);     // Catch: Throwable -> L11
        return r0;
    }

    private void waitForCancelFinishedLocked() {
    L3:
        if (this.mCancelInProgress == false) goto L8;
        wait();     // Catch: InterruptedException -> L6
        goto L3
    }
}
