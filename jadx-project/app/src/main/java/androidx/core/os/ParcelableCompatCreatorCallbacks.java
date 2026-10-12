package androidx.core.os;

import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface ParcelableCompatCreatorCallbacks<T> {
    T createFromParcel(Parcel r1, ClassLoader r2);

    T[] newArray(int r1);
}
