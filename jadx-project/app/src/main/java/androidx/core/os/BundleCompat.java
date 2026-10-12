package androidx.core.os;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.ReplaceWith;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class BundleCompat {

    static class Api33Impl {
        private Api33Impl() {
        }

        static <T> T getParcelable(Bundle r1, String r2, Class<T> r3) {
            return (T) r1.getParcelable(r2, r3);
        }

        static <T> T[] getParcelableArray(Bundle r1, String r2, Class<T> r3) {
            return (T[]) r1.getParcelableArray(r2, r3);
        }

        static <T> ArrayList<T> getParcelableArrayList(Bundle in, String key, Class<? extends T> clazz) {
            return in.getParcelableArrayList(key, clazz);
        }

        static <T> SparseArray<T> getSparseParcelableArray(Bundle in, String key, Class<? extends T> clazz) {
            return in.getSparseParcelableArray(key, clazz);
        }

        static <T extends Serializable> T getSerializable(Bundle r1, String r2, Class<T> r3) {
            return (T) r1.getSerializable(r2, r3);
        }
    }

    private BundleCompat() {
    }

    public static <T> T getParcelable(Bundle r2, String r3, Class<T> r4) {
        if (Build.VERSION.SDK_INT >= 34) goto L5;
        T r0 = (T) r2.getParcelable(r3);
        if (r4.isInstance(r0) == true) goto L11;
        return null;
    L11:
        return r0;
    L5:
        return (T) Api33Impl.getParcelable(r2, r3, r4);
    }

    public static Parcelable[] getParcelableArray(Bundle in, String key, Class<? extends Parcelable> clazz) {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return (Parcelable[]) Api33Impl.getParcelableArray(in, key, clazz);
    L7:
        return in.getParcelableArray(key);
    }

    public static <T> ArrayList<T> getParcelableArrayList(Bundle in, String key, Class<? extends T> clazz) {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return Api33Impl.getParcelableArrayList(in, key, clazz);
    L7:
        return in.getParcelableArrayList(key);
    }

    public static <T> SparseArray<T> getSparseParcelableArray(Bundle in, String key, Class<? extends T> clazz) {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return Api33Impl.getSparseParcelableArray(in, key, clazz);
    L7:
        return in.getSparseParcelableArray(key);
    }

    @ReplaceWith(expression = "bundle.getBinder(key)")
    @Deprecated
    public static IBinder getBinder(Bundle bundle, String key) {
        return bundle.getBinder(key);
    }

    @ReplaceWith(expression = "bundle.putBinder(key, binder)")
    @Deprecated
    public static void putBinder(Bundle bundle, String key, IBinder binder) {
        bundle.putBinder(key, binder);
    }

    public static <T extends Serializable> T getSerializable(Bundle r2, String r3, Class<T> r4) {
        if (Build.VERSION.SDK_INT >= 34) goto L5;
        T r0 = (T) r2.getSerializable(r3);
        if (r4.isInstance(r0) == true) goto L11;
        return null;
    L11:
        return r0;
    L5:
        return (T) Api33Impl.getSerializable(r2, r3, r4);
    }
}
