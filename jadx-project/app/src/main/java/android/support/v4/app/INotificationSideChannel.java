package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public interface INotificationSideChannel extends IInterface {
    public static final String DESCRIPTOR = null;

    public static class Default implements INotificationSideChannel {
        public Default() {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void notify(String packageName, int id, String tag, Notification notification) throws RemoteException {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancel(String packageName, int id, String tag) throws RemoteException {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancelAll(String packageName) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements INotificationSideChannel {
        static final int TRANSACTION_cancel = 2;
        static final int TRANSACTION_cancelAll = 3;
        static final int TRANSACTION_notify = 1;

        private static class Proxy implements INotificationSideChannel {
            private IBinder mRemote;

            Proxy(IBinder remote) {
                this.mRemote = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return DESCRIPTOR;
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void notify(String packageName, int id, String tag, Notification notification) throws RemoteException {
                Parcel _data = Parcel.obtain();
                _data.writeInterfaceToken(DESCRIPTOR);     // Catch: Throwable -> L6
                _data.writeString(packageName);     // Catch: Throwable -> L6
                _data.writeInt(id);     // Catch: Throwable -> L6
                _data.writeString(tag);     // Catch: Throwable -> L6
                _Parcel.access$100(_data, notification, 0);     // Catch: Throwable -> L6
                this.mRemote.transact(1, _data, null, 1);     // Catch: Throwable -> L6
                _data.recycle();
                return;
            L6:
                th = move-exception;
                _data.recycle();
                throw th;
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void cancel(String packageName, int id, String tag) throws RemoteException {
                Parcel _data = Parcel.obtain();
                _data.writeInterfaceToken(DESCRIPTOR);     // Catch: Throwable -> L6
                _data.writeString(packageName);     // Catch: Throwable -> L6
                _data.writeInt(id);     // Catch: Throwable -> L6
                _data.writeString(tag);     // Catch: Throwable -> L6
                this.mRemote.transact(2, _data, null, 1);     // Catch: Throwable -> L6
                _data.recycle();
                return;
            L6:
                th = move-exception;
                _data.recycle();
                throw th;
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void cancelAll(String packageName) throws RemoteException {
                Parcel _data = Parcel.obtain();
                _data.writeInterfaceToken(DESCRIPTOR);     // Catch: Throwable -> L6
                _data.writeString(packageName);     // Catch: Throwable -> L6
                this.mRemote.transact(3, _data, null, 1);     // Catch: Throwable -> L6
                _data.recycle();
                return;
            L6:
                th = move-exception;
                _data.recycle();
                throw th;
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static INotificationSideChannel asInterface(IBinder obj) {
            if (obj != null) goto L5;
            return null;
        L5:
            IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (iin == null) goto L12;
            if ((iin instanceof INotificationSideChannel) == false) goto L12;
            return (INotificationSideChannel) iin;
        L12:
            return new Proxy(obj);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            String descriptor = DESCRIPTOR;
            if (code < 1) goto L8;
            if (code > 16777215) goto L8;
            data.enforceInterface(descriptor);
        L8:
            if (code != 1598968902) goto L11;
            reply.writeString(descriptor);
            return true;
        L11:
            switch(code) {
                case 1: goto L16;
                case 2: goto L15;
                case 3: goto L14;
                default: goto L13;
            };
        L14:
            String _arg0 = data.readString();
            cancelAll(_arg0);
        L17:
            return true;
        L15:
            String _arg1 = data.readString();
            int _arg2 = data.readInt();
            String _arg3 = data.readString();
            cancel(_arg1, _arg2, _arg3);
            goto L17
        L16:
            String _arg4 = data.readString();
            int _arg5 = data.readInt();
            String _arg6 = data.readString();
            Notification _arg7 = (Notification) _Parcel.access$000(data, Notification.CREATOR);
            notify(_arg4, _arg5, _arg6, _arg7);
            goto L17
        L13:
            return super.onTransact(code, data, reply, flags);
        }
    }

    public static class _Parcel {
        public _Parcel() {
        }

        static /* synthetic */ Object access$000(Parcel x0, Parcelable.Creator x1) {
            return readTypedObject(x0, x1);
        }

        static /* synthetic */ void access$100(Parcel x0, Parcelable x1, int x2) {
            writeTypedObject(x0, x1, x2);
        }

        private static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> c) {
            if (parcel.readInt() != 0) goto L5;
            return null;
        L5:
            return c.createFromParcel(parcel);
        }

        private static <T extends Parcelable> void writeTypedObject(Parcel parcel, T value, int parcelableFlags) {
            if (value == null) goto L4;
            parcel.writeInt(1);
            value.writeToParcel(parcel, parcelableFlags);
            return;
        L4:
            parcel.writeInt(0);
        }
    }

    void cancel(String r1, int r2, String r3) throws RemoteException;

    void cancelAll(String r1) throws RemoteException;

    void notify(String r1, int r2, String r3, Notification r4) throws RemoteException;

    static {
        DESCRIPTOR = "android$support$v4$app$INotificationSideChannel".replace(Typography.dollar, '.');
    }
}
