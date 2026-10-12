package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes4.dex */
public class IconCompatParcelizer {
    public IconCompatParcelizer() {
    }

    public static IconCompat read(VersionedParcel parcel) {
        IconCompat obj = new IconCompat();
        obj.mType = parcel.readInt(obj.mType, 1);
        obj.mData = parcel.readByteArray(obj.mData, 2);
        obj.mParcelable = parcel.readParcelable(obj.mParcelable, 3);
        obj.mInt1 = parcel.readInt(obj.mInt1, 4);
        obj.mInt2 = parcel.readInt(obj.mInt2, 5);
        obj.mTintList = (ColorStateList) parcel.readParcelable(obj.mTintList, 6);
        obj.mTintModeStr = parcel.readString(obj.mTintModeStr, 7);
        obj.mString1 = parcel.readString(obj.mString1, 8);
        obj.onPostParceling();
        return obj;
    }

    public static void write(IconCompat obj, VersionedParcel parcel) {
        parcel.setSerializationFlags(true, true);
        obj.onPreParceling(parcel.isStream());
        if ((-1) == obj.mType) goto L6;
        parcel.writeInt(obj.mType, 1);
    L6:
        if (obj.mData == null) goto L9;
        parcel.writeByteArray(obj.mData, 2);
    L9:
        if (obj.mParcelable == null) goto L12;
        parcel.writeParcelable(obj.mParcelable, 3);
    L12:
        if (obj.mInt1 == 0) goto L15;
        parcel.writeInt(obj.mInt1, 4);
    L15:
        if (obj.mInt2 == 0) goto L18;
        parcel.writeInt(obj.mInt2, 5);
    L18:
        if (obj.mTintList == null) goto L21;
        parcel.writeParcelable(obj.mTintList, 6);
    L21:
        if (obj.mTintModeStr == null) goto L24;
        parcel.writeString(obj.mTintModeStr, 7);
    L24:
        if (obj.mString1 == null) goto L27;
        parcel.writeString(obj.mString1, 8);
        return;
    }
}
