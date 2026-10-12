package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public interface IResultReceiver extends IInterface {
    public static final String DESCRIPTOR = null;

    public static class Default implements IResultReceiver {
        public Default() {
        }

        @Override // android.support.v4.os.IResultReceiver
        public void send(int resultCode, Bundle resultData) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IResultReceiver {
        static final int TRANSACTION_send = 1;

        private static class Proxy implements IResultReceiver {
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

            @Override // android.support.v4.os.IResultReceiver
            public void send(int resultCode, Bundle resultData) throws RemoteException {
                Parcel _data = Parcel.obtain();
                _data.writeInterfaceToken(DESCRIPTOR);     // Catch: Throwable -> L6
                _data.writeInt(resultCode);     // Catch: Throwable -> L6
                _Parcel.access$100(_data, resultData, 0);     // Catch: Throwable -> L6
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

        public static IResultReceiver asInterface(IBinder obj) {
            if (obj != null) goto L5;
            return null;
        L5:
            IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (iin == null) goto L12;
            if ((iin instanceof IResultReceiver) == false) goto L12;
            return (IResultReceiver) iin;
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
            int _arg0 = data.readInt();
            Bundle _arg1 = (Bundle) _Parcel.access$000(data, Bundle.CREATOR);
            send(_arg0, _arg1);
            return true;
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

    void send(int r1, Bundle r2) throws RemoteException;

    static {
        DESCRIPTOR = "android$support$v4$os$IResultReceiver".replace(Typography.dollar, '.');
    }
}
