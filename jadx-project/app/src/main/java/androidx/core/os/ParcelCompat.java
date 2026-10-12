package androidx.core.os;

import android.os.BadParcelableException;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ParcelCompat {

    static class Api29Impl {
        private Api29Impl() {
        }

        static <T extends Parcelable> List<T> readParcelableList(Parcel in, List<T> list, ClassLoader cl) {
            return in.readParcelableList(list, cl);
        }

        static void writeBoolean(Parcel parcel, boolean val) {
            parcel.writeBoolean(val);
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static Parcelable.Creator<?> readParcelableCreator(Parcel in, ClassLoader loader) {
            return in.readParcelableCreator(loader);
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static <T extends Serializable> T readSerializable(Parcel in, ClassLoader loader, Class<T> clazz) {
            return (T) in.readSerializable(loader, clazz);
        }

        static <T extends Parcelable> T readParcelable(Parcel in, ClassLoader loader, Class<T> clazz) {
            return (T) in.readParcelable(loader, clazz);
        }

        static <T> Parcelable.Creator<T> readParcelableCreator(Parcel in, ClassLoader loader, Class<T> clazz) {
            return in.readParcelableCreator(loader, clazz);
        }

        static <T> T[] readParcelableArray(Parcel r1, ClassLoader r2, Class<T> r3) {
            return (T[]) r1.readParcelableArray(r2, r3);
        }

        static <T> List<T> readParcelableList(Parcel in, List<T> list, ClassLoader cl, Class<T> clazz) {
            return in.readParcelableList(list, cl, clazz);
        }

        static <T> void readList(Parcel in, List<? super T> outVal, ClassLoader loader, Class<T> clazz) {
            in.readList(outVal, loader, clazz);
        }

        static <T> ArrayList<T> readArrayList(Parcel in, ClassLoader loader, Class<? extends T> clazz) {
            return in.readArrayList(loader, clazz);
        }

        static <T> T[] readArray(Parcel r1, ClassLoader r2, Class<T> r3) {
            return (T[]) r1.readArray(r2, r3);
        }

        static <T> SparseArray<T> readSparseArray(Parcel in, ClassLoader loader, Class<? extends T> clazz) {
            return in.readSparseArray(loader, clazz);
        }

        static <K, V> void readMap(Parcel in, Map<? super K, ? super V> outVal, ClassLoader loader, Class<K> clazzKey, Class<V> clazzValue) {
            in.readMap(outVal, loader, clazzKey, clazzValue);
        }

        static <V, K> HashMap<K, V> readHashMap(Parcel in, ClassLoader loader, Class<? extends K> clazzKey, Class<? extends V> clazzValue) {
            return in.readHashMap(loader, clazzKey, clazzValue);
        }
    }

    public static boolean readBoolean(Parcel in) {
        if (in.readInt() == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static void writeBoolean(Parcel r2, boolean r3) {
        if (Build.VERSION.SDK_INT < 29) goto L5;
        Api29Impl.writeBoolean(r2, r3);
        return;
    L5:
        r2.writeInt(r3 ? 1 : 0);
    }

    public static <T> void readList(Parcel in, List<? super T> outVal, ClassLoader loader, Class<T> clazz) {
        if (Build.VERSION.SDK_INT < 34) goto L5;
        Api33Impl.readList(in, outVal, loader, clazz);
        return;
    L5:
        in.readList(outVal, loader);
    }

    public static <T> ArrayList<T> readArrayList(Parcel in, ClassLoader loader, Class<? extends T> clazz) {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return Api33Impl.readArrayList(in, loader, clazz);
    L7:
        return in.readArrayList(loader);
    }

    public static <T> Object[] readArray(Parcel in, ClassLoader loader, Class<T> clazz) {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return Api33Impl.readArray(in, loader, clazz);
    L7:
        return in.readArray(loader);
    }

    public static <T> SparseArray<T> readSparseArray(Parcel in, ClassLoader loader, Class<? extends T> clazz) {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return Api33Impl.readSparseArray(in, loader, clazz);
    L7:
        return in.readSparseArray(loader);
    }

    public static <K, V> void readMap(Parcel in, Map<? super K, ? super V> outVal, ClassLoader loader, Class<K> clazzKey, Class<V> clazzValue) {
        if (Build.VERSION.SDK_INT < 34) goto L5;
        Api33Impl.readMap(in, outVal, loader, clazzKey, clazzValue);
        return;
    L5:
        in.readMap(outVal, loader);
    }

    public static <K, V> HashMap<K, V> readHashMap(Parcel in, ClassLoader loader, Class<? extends K> clazzKey, Class<? extends V> clazzValue) {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return Api33Impl.readHashMap(in, loader, clazzKey, clazzValue);
    L7:
        return in.readHashMap(loader);
    }

    public static <T extends Parcelable> T readParcelable(Parcel r4, ClassLoader r5, Class<T> r6) {
        if (Build.VERSION.SDK_INT >= 34) goto L5;
        T r0 = (T) r4.readParcelable(r5);
        if (r0 != null) goto L9;
    L13:
        return r0;
    L9:
        if (r6.isInstance(r0) == true) goto L13;
        throw new BadParcelableException("Parcelable " + r0.getClass() + " is not a subclass of required class " + r6.getName() + " provided in the parameter");
    L5:
        return (T) Api33Impl.readParcelable(r4, r5, r6);
    }

    public static <T> Parcelable.Creator<T> readParcelableCreator(Parcel r2, ClassLoader r3, Class<T> r4) {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return Api33Impl.readParcelableCreator(r2, r3, r4);
    L7:
        return (Parcelable.Creator<T>) Api30Impl.readParcelableCreator(r2, r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public static <T> T[] readParcelableArray(Parcel r7, ClassLoader r8, Class<T> r9) {
        if (Build.VERSION.SDK_INT >= 34) goto L5;
        Parcelable[] r0 = r7.readParcelableArray(r8);
        if (r9.isAssignableFrom(Parcelable.class) == true) goto L9;
        T[] r1 = (T[]) ((Object[]) Array.newInstance(r9, r0.length));
        int r2 = 0;
    L12:
        if (r2 >= r0.length) goto L18;
        r1[r2] = r9.cast(r0[r2]);     // Catch: ClassCastException -> L15
        r2 = r2 + 1;
    L17:
        throw new BadParcelableException("Parcelable at index " + r2 + " is not a subclass of required class " + r9.getName() + " provided in the parameter");
    L18:
        return r1;
    L9:
        return (T[]) r0;
    L5:
        return (T[]) Api33Impl.readParcelableArray(r7, r8, r9);
    }

    public static <T> Parcelable[] readParcelableArrayTyped(Parcel in, ClassLoader loader, Class<T> clazz) {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return (Parcelable[]) Api33Impl.readParcelableArray(in, loader, clazz);
    L7:
        return in.readParcelableArray(loader);
    }

    public static <T> List<T> readParcelableList(Parcel in, List<T> list, ClassLoader cl, Class<T> clazz) {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return Api33Impl.readParcelableList(in, list, cl, clazz);
    L7:
        return Api29Impl.readParcelableList(in, list, cl);
    }

    public static <T extends Serializable> T readSerializable(Parcel r2, ClassLoader r3, Class<T> r4) {
        if (Build.VERSION.SDK_INT < 33) goto L7;
        return (T) Api33Impl.readSerializable(r2, r3, r4);
    L7:
        return (T) r2.readSerializable();
    }

    private ParcelCompat() {
    }
}
