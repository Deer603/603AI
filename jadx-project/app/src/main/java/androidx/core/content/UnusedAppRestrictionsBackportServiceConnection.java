package androidx.core.content;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;

/* JADX INFO: loaded from: classes4.dex */
class UnusedAppRestrictionsBackportServiceConnection implements ServiceConnection {
    private final Context mContext;
    private boolean mHasBoundService;
    ResolvableFuture<Integer> mResultFuture;
    IUnusedAppRestrictionsBackportService mUnusedAppRestrictionsService;

    UnusedAppRestrictionsBackportServiceConnection(Context context) {
        this.mUnusedAppRestrictionsService = null;
        this.mHasBoundService = false;
        this.mContext = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName name, IBinder service) {
        this.mUnusedAppRestrictionsService = IUnusedAppRestrictionsBackportService.Stub.asInterface(service);
        this.mUnusedAppRestrictionsService.isPermissionRevocationEnabledForApp(getBackportCallback());     // Catch: RemoteException -> L5
        return;
    L6:
        this.mResultFuture.set(0);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName name) {
        this.mUnusedAppRestrictionsService = null;
    }

    public void connectAndFetchResult(ResolvableFuture<Integer> resultFuture) {
        if (this.mHasBoundService == true) goto L7;
        this.mHasBoundService = true;
        this.mResultFuture = resultFuture;
        Intent intent = new Intent(UnusedAppRestrictionsBackportService.ACTION_UNUSED_APP_RESTRICTIONS_BACKPORT_CONNECTION).setPackage(PackageManagerCompat.getPermissionRevocationVerifierApp(this.mContext.getPackageManager()));
        this.mContext.bindService(intent, this, 1);
        return;
    L7:
        throw new IllegalStateException("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
    }

    public void disconnectFromService() {
        if (this.mHasBoundService == false) goto L7;
        this.mHasBoundService = false;
        this.mContext.unbindService(this);
        return;
    L7:
        throw new IllegalStateException("bindService must be called before unbind");
    }

    private IUnusedAppRestrictionsBackportCallback getBackportCallback() {
        return new AnonymousClass1(this);
    }
}
