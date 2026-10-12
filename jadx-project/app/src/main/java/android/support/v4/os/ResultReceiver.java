package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = null;
    final Handler mHandler;
    final boolean mLocal;
    IResultReceiver mReceiver;

    class MyResultReceiver extends IResultReceiver.Stub {
        final /* synthetic */ ResultReceiver this$0;

        MyResultReceiver(ResultReceiver this$0) {
            this.this$0 = this$0;
        }

        @Override // android.support.v4.os.IResultReceiver
        public void send(int resultCode, Bundle resultData) {
            Handler r0 = this.this$0.mHandler;
            ResultReceiver r1 = this.this$0;
            if (r0 == null) goto L5;
            r1.mHandler.post(new MyRunnable(this.this$0, resultCode, resultData));
            return;
        L5:
            r1.onReceiveResult(resultCode, resultData);
        }
    }

    class MyRunnable implements Runnable {
        final int mResultCode;
        final Bundle mResultData;
        final /* synthetic */ ResultReceiver this$0;

        MyRunnable(ResultReceiver this$0, int resultCode, Bundle resultData) {
            this.this$0 = this$0;
            this.mResultCode = resultCode;
            this.mResultData = resultData;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.this$0.onReceiveResult(this.mResultCode, this.mResultData);
        }
    }

    public ResultReceiver(Handler handler) {
        this.mLocal = true;
        this.mHandler = handler;
    }

    public void send(int resultCode, Bundle resultData) {
        if (this.mLocal == false) goto L10;
        if (this.mHandler == null) goto L7;
        this.mHandler.post(new MyRunnable(this, resultCode, resultData));
        return;
    L7:
        onReceiveResult(resultCode, resultData);
        return;
    L10:
        if (this.mReceiver == null) goto L18;
        this.mReceiver.send(resultCode, resultData);     // Catch: RemoteException -> L13
        return;
    L14:
        return;
    }

    protected void onReceiveResult(int resultCode, Bundle resultData) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        monitor-enter(this);
    L9:
        th = move-exception;
        throw th;
    L4:
        if (this.mReceiver != null) goto L6;
        this.mReceiver = new MyResultReceiver(this);     // Catch: Throwable -> L9
    L6:
        out.writeStrongBinder(this.mReceiver.asBinder());     // Catch: Throwable -> L9
        monitor-exit(this);     // Catch: Throwable -> L9
    }

    ResultReceiver(Parcel in) {
        this.mLocal = false;
        this.mHandler = null;
        this.mReceiver = IResultReceiver.Stub.asInterface(in.readStrongBinder());
    }

    static {
        CREATOR = new AnonymousClass1();
    }
}
