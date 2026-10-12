package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public interface IUnusedAppRestrictionsBackportService extends IInterface {
    public static final String DESCRIPTOR = null;

    public static class Default implements IUnusedAppRestrictionsBackportService {
        public Default() {
        }

        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
        public void isPermissionRevocationEnabledForApp(IUnusedAppRestrictionsBackportCallback callback) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IUnusedAppRestrictionsBackportService {
        static final int TRANSACTION_isPermissionRevocationEnabledForApp = 1;

        private static class Proxy implements IUnusedAppRestrictionsBackportService {
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

            @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
            public void isPermissionRevocationEnabledForApp(IUnusedAppRestrictionsBackportCallback callback) throws RemoteException {
                Parcel _data = Parcel.obtain();
                _data.writeInterfaceToken(DESCRIPTOR);     // Catch: Throwable -> L6
                _data.writeStrongInterface(callback);     // Catch: Throwable -> L6
                this.mRemote.transact(1, _data, null, 1);     // Catch: Throwable -> L6
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

        public static IUnusedAppRestrictionsBackportService asInterface(IBinder obj) {
            if (obj != null) goto L5;
            return null;
        L5:
            IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (iin == null) goto L12;
            if ((iin instanceof IUnusedAppRestrictionsBackportService) == false) goto L12;
            return (IUnusedAppRestrictionsBackportService) iin;
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
                case 1: goto L14;
                default: goto L13;
            };
        L14:
            IUnusedAppRestrictionsBackportCallback _arg0 = IUnusedAppRestrictionsBackportCallback.Stub.asInterface(data.readStrongBinder());
            isPermissionRevocationEnabledForApp(_arg0);
            return true;
        L13:
            return super.onTransact(code, data, reply, flags);
        }
    }

    void isPermissionRevocationEnabledForApp(IUnusedAppRestrictionsBackportCallback r1) throws RemoteException;

    static {
        DESCRIPTOR = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace(Typography.dollar, '.');
    }
}
