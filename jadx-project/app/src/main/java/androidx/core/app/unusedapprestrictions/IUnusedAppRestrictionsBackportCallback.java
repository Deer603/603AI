package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public interface IUnusedAppRestrictionsBackportCallback extends IInterface {
    public static final String DESCRIPTOR = null;

    public static class Default implements IUnusedAppRestrictionsBackportCallback {
        public Default() {
        }

        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
        public void onIsPermissionRevocationEnabledForAppResult(boolean success, boolean isEnabled) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IUnusedAppRestrictionsBackportCallback {
        static final int TRANSACTION_onIsPermissionRevocationEnabledForAppResult = 1;

        private static class Proxy implements IUnusedAppRestrictionsBackportCallback {
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

            @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
            public void onIsPermissionRevocationEnabledForAppResult(boolean success, boolean isEnabled) throws RemoteException {
                Parcel _data = Parcel.obtain();
                _data.writeInterfaceToken(DESCRIPTOR);     // Catch: Throwable -> L13
                int r1 = 0;
                if (success == false) goto L6;
                int r3 = 1;
            L7:
                _data.writeInt(r3);     // Catch: Throwable -> L13
                if (isEnabled == false) goto L10;
                r1 = 1;
            L10:
                _data.writeInt(r1);     // Catch: Throwable -> L13
                this.mRemote.transact(1, _data, null, 1);     // Catch: Throwable -> L13
                _data.recycle();
                return;
            L6:
                r3 = 0;
            L13:
                th = move-exception;
                _data.recycle();
                throw th;
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IUnusedAppRestrictionsBackportCallback asInterface(IBinder obj) {
            if (obj != null) goto L5;
            return null;
        L5:
            IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (iin == null) goto L12;
            if ((iin instanceof IUnusedAppRestrictionsBackportCallback) == false) goto L12;
            return (IUnusedAppRestrictionsBackportCallback) iin;
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
            boolean _arg1 = false;
            if (data.readInt() == 0) goto L17;
            boolean _arg0 = true;
        L19:
            if (data.readInt() == 0) goto L21;
            _arg1 = true;
        L21:
            onIsPermissionRevocationEnabledForAppResult(_arg0, _arg1);
            return true;
        L17:
            _arg0 = false;
            goto L19
        L13:
            return super.onTransact(code, data, reply, flags);
        }
    }

    void onIsPermissionRevocationEnabledForAppResult(boolean r1, boolean r2) throws RemoteException;

    static {
        DESCRIPTOR = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback".replace(Typography.dollar, '.');
    }
}
