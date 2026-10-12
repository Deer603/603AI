package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.app.INotificationSideChannel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class NotificationCompatSideChannelService extends Service {

    private class NotificationSideChannelStub extends INotificationSideChannel.Stub {
        final /* synthetic */ NotificationCompatSideChannelService this$0;

        NotificationSideChannelStub(NotificationCompatSideChannelService r1) {
            this.this$0 = r1;
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void notify(String packageName, int id, String tag, Notification notification) throws RemoteException {
            this.this$0.checkPermission(getCallingUid(), packageName);
            long idToken = clearCallingIdentity();
            this.this$0.notify(packageName, id, tag, notification);     // Catch: Throwable -> L6
            restoreCallingIdentity(idToken);
            return;
        L6:
            th = move-exception;
            restoreCallingIdentity(idToken);
            throw th;
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancel(String packageName, int id, String tag) throws RemoteException {
            this.this$0.checkPermission(getCallingUid(), packageName);
            long idToken = clearCallingIdentity();
            this.this$0.cancel(packageName, id, tag);     // Catch: Throwable -> L6
            restoreCallingIdentity(idToken);
            return;
        L6:
            th = move-exception;
            restoreCallingIdentity(idToken);
            throw th;
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancelAll(String packageName) {
            this.this$0.checkPermission(getCallingUid(), packageName);
            long idToken = clearCallingIdentity();
            this.this$0.cancelAll(packageName);     // Catch: Throwable -> L6
            restoreCallingIdentity(idToken);
            return;
        L6:
            th = move-exception;
            restoreCallingIdentity(idToken);
            throw th;
        }
    }

    public abstract void cancel(String r1, int r2, String r3);

    public abstract void cancelAll(String r1);

    public abstract void notify(String r1, int r2, String r3, Notification r4);

    public NotificationCompatSideChannelService() {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent.getAction().equals(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL) == false) goto L5;
        return null;
    L5:
        return null;
    }

    void checkPermission(int callingUid, String packageName) {
        String[] r0 = getPackageManager().getPackagesForUid(callingUid);
        int r1 = r0.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L9;
        String validPackage = r0[r2];
        if (validPackage.equals(packageName) == true) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return;
    L9:
        throw new SecurityException("NotificationSideChannelService: Uid " + callingUid + " is not authorized for package " + packageName);
    }
}
