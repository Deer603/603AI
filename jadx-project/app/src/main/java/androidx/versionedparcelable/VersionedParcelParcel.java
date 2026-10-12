package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.collection.ArrayMap;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
class VersionedParcelParcel extends VersionedParcel {
    private static final boolean DEBUG = false;
    private static final String TAG = "VersionedParcelParcel";
    private int mCurrentField;
    private final int mEnd;
    private int mFieldId;
    private int mNextRead;
    private final int mOffset;
    private final Parcel mParcel;
    private final SparseIntArray mPositionLookup;
    private final String mPrefix;

    VersionedParcelParcel(Parcel p) {
        this(p, p.dataPosition(), p.dataSize(), "", new ArrayMap(), new ArrayMap(), new ArrayMap());
    }

    private VersionedParcelParcel(Parcel p, int offset, int end, String prefix, ArrayMap<String, Method> readCache, ArrayMap<String, Method> writeCache, ArrayMap<String, Class> parcelizerCache) {
        super(readCache, writeCache, parcelizerCache);
        this.mPositionLookup = new SparseIntArray();
        this.mCurrentField = -1;
        this.mNextRead = 0;
        this.mFieldId = -1;
        this.mParcel = p;
        this.mOffset = offset;
        this.mEnd = end;
        this.mNextRead = this.mOffset;
        this.mPrefix = prefix;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readField(int fieldId) {
    L2:
        int r0 = this.mNextRead;
        int r1 = this.mEnd;
        int r2 = this.mFieldId;
        if (r0 >= r1) goto L10;
        if (r2 == fieldId) goto L5;
        if (String.valueOf(this.mFieldId).compareTo(String.valueOf(fieldId)) > 0) goto L8;
        this.mParcel.setDataPosition(this.mNextRead);
        int size = this.mParcel.readInt();
        this.mFieldId = this.mParcel.readInt();
        this.mNextRead += size;
        goto L2
    L8:
        return false;
    L5:
        return true;
    L10:
        if (r2 != fieldId) goto L13;
        return true;
    L13:
        return false;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void setOutputField(int fieldId) {
        closeField();
        this.mCurrentField = fieldId;
        this.mPositionLookup.put(fieldId, this.mParcel.dataPosition());
        writeInt(0);
        writeInt(fieldId);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void closeField() {
        if (this.mCurrentField < 0) goto L6;
        int currentFieldPosition = this.mPositionLookup.get(this.mCurrentField);
        int position = this.mParcel.dataPosition();
        int size = position - currentFieldPosition;
        this.mParcel.setDataPosition(currentFieldPosition);
        this.mParcel.writeInt(size);
        this.mParcel.setDataPosition(position);
        return;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel createSubParcel() {
        Parcel r1 = this.mParcel;
        int r2 = this.mParcel.dataPosition();
        if (this.mNextRead != this.mOffset) goto L5;
        int r3 = this.mEnd;
    L7:
        return new VersionedParcelParcel(r1, r2, r3, this.mPrefix + "  ", this.mReadCache, this.mWriteCache, this.mParcelizerCache);
    L5:
        r3 = this.mNextRead;
        goto L7
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] b) {
        Parcel r0 = this.mParcel;
        if (b == null) goto L5;
        r0.writeInt(b.length);
        this.mParcel.writeByteArray(b);
        return;
    L5:
        r0.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] b, int offset, int len) {
        Parcel r0 = this.mParcel;
        if (b == null) goto L5;
        r0.writeInt(b.length);
        this.mParcel.writeByteArray(b, offset, len);
        return;
    L5:
        r0.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeInt(int val) {
        this.mParcel.writeInt(val);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeLong(long val) {
        this.mParcel.writeLong(val);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeFloat(float val) {
        this.mParcel.writeFloat(val);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeDouble(double val) {
        this.mParcel.writeDouble(val);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeString(String val) {
        this.mParcel.writeString(val);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeStrongBinder(IBinder val) {
        this.mParcel.writeStrongBinder(val);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeParcelable(Parcelable p) {
        this.mParcel.writeParcelable(p, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBoolean(boolean r2) {
        this.mParcel.writeInt(r2 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeStrongInterface(IInterface val) {
        this.mParcel.writeStrongInterface(val);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBundle(Bundle val) {
        this.mParcel.writeBundle(val);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void writeCharSequence(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.mParcel, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected CharSequence readCharSequence() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.mParcel);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int readInt() {
        return this.mParcel.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public long readLong() {
        return this.mParcel.readLong();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public float readFloat() {
        return this.mParcel.readFloat();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public double readDouble() {
        return this.mParcel.readDouble();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String readString() {
        return this.mParcel.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public IBinder readStrongBinder() {
        return this.mParcel.readStrongBinder();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] readByteArray() {
        int len = this.mParcel.readInt();
        if (len >= 0) goto L6;
        return null;
    L6:
        byte[] bytes = new byte[len];
        this.mParcel.readByteArray(bytes);
        return bytes;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T readParcelable() {
        return (T) this.mParcel.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Bundle readBundle() {
        return this.mParcel.readBundle(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readBoolean() {
        if (this.mParcel.readInt() == 0) goto L5;
        return true;
    L5:
        return false;
    }
}
