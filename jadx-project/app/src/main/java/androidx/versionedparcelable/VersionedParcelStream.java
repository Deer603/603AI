package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import androidx.collection.ArrayMap;
import androidx.core.internal.view.SupportMenu;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
class VersionedParcelStream extends VersionedParcel {
    private static final int TYPE_BOOLEAN = 5;
    private static final int TYPE_BOOLEAN_ARRAY = 6;
    private static final int TYPE_DOUBLE = 7;
    private static final int TYPE_DOUBLE_ARRAY = 8;
    private static final int TYPE_FLOAT = 13;
    private static final int TYPE_FLOAT_ARRAY = 14;
    private static final int TYPE_INT = 9;
    private static final int TYPE_INT_ARRAY = 10;
    private static final int TYPE_LONG = 11;
    private static final int TYPE_LONG_ARRAY = 12;
    private static final int TYPE_NULL = 0;
    private static final int TYPE_STRING = 3;
    private static final int TYPE_STRING_ARRAY = 4;
    private static final int TYPE_SUB_BUNDLE = 1;
    private static final int TYPE_SUB_PERSISTABLE_BUNDLE = 2;
    private static final Charset UTF_16 = null;
    int mCount;
    private DataInputStream mCurrentInput;
    private DataOutputStream mCurrentOutput;
    private FieldBuffer mFieldBuffer;
    private int mFieldId;
    int mFieldSize;
    private boolean mIgnoreParcelables;
    private final DataInputStream mMasterInput;
    private final DataOutputStream mMasterOutput;

    private static class FieldBuffer {
        final DataOutputStream mDataStream;
        private final int mFieldId;
        final ByteArrayOutputStream mOutput;
        private final DataOutputStream mTarget;

        FieldBuffer(int fieldId, DataOutputStream target) {
            this.mOutput = new ByteArrayOutputStream();
            this.mDataStream = new DataOutputStream(this.mOutput);
            this.mFieldId = fieldId;
            this.mTarget = target;
        }

        void flushField() throws IOException {
            this.mDataStream.flush();
            int size = this.mOutput.size();
            int r1 = this.mFieldId << 16;
            if (size < 65535) goto L5;
            int r3 = 65535;
        L6:
            int fieldInfo = r1 | r3;
            this.mTarget.writeInt(fieldInfo);
            if (size < 65535) goto L9;
            this.mTarget.writeInt(size);
        L9:
            this.mOutput.writeTo(this.mTarget);
            return;
        L5:
            r3 = size;
            goto L6
        }
    }

    static {
        UTF_16 = Charset.forName("UTF-16");
    }

    public VersionedParcelStream(InputStream input, OutputStream output) {
        this(input, output, new ArrayMap(), new ArrayMap(), new ArrayMap());
    }

    private VersionedParcelStream(final InputStream input, OutputStream output, ArrayMap<String, Method> readCache, ArrayMap<String, Method> writeCache, ArrayMap<String, Class> parcelizerCache) {
        super(readCache, writeCache, parcelizerCache);
        this.mCount = 0;
        this.mFieldId = -1;
        this.mFieldSize = -1;
        DataOutputStream r0 = null;
        if (input == null) goto L5;
        DataInputStream r1 = new DataInputStream(new AnonymousClass1(this, input));
    L6:
        this.mMasterInput = r1;
        if (output == null) goto L9;
        r0 = new DataOutputStream(output);
    L9:
        this.mMasterOutput = r0;
        this.mCurrentInput = this.mMasterInput;
        this.mCurrentOutput = this.mMasterOutput;
        return;
    L5:
        r1 = null;
        goto L6
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean isStream() {
        return true;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void setSerializationFlags(boolean allowSerialization, boolean ignoreParcelables) {
        if (allowSerialization == false) goto L6;
        this.mIgnoreParcelables = ignoreParcelables;
        return;
    L6:
        throw new RuntimeException("Serialization of this object is not allowed");
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void closeField() {
        if (this.mFieldBuffer != null) goto L12;
        return;
    L12:
    L8:
        e = move-exception;
        throw new VersionedParcel.ParcelException(e);
    L5:
        if (this.mFieldBuffer.mOutput.size() == 0) goto L7;
        this.mFieldBuffer.flushField();     // Catch: IOException -> L8
    L7:
        this.mFieldBuffer = null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel createSubParcel() {
        return new VersionedParcelStream(this.mCurrentInput, this.mCurrentOutput, this.mReadCache, this.mWriteCache, this.mParcelizerCache);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readField(int fieldId) {
    L20:
        if (this.mFieldId == fieldId) goto L5;
        if (String.valueOf(this.mFieldId).compareTo(String.valueOf(fieldId)) > 0) goto L9;
        if (this.mCount >= this.mFieldSize) goto L13;
        this.mMasterInput.skip(this.mFieldSize - this.mCount);     // Catch: IOException -> L18
    L13:
        this.mFieldSize = -1;     // Catch: IOException -> L18
        int fieldInfo = this.mMasterInput.readInt();     // Catch: IOException -> L18
        this.mCount = 0;     // Catch: IOException -> L18
        int size = fieldInfo & SupportMenu.USER_MASK;     // Catch: IOException -> L18
        if (size != 65535) goto L16;
        size = this.mMasterInput.readInt();     // Catch: IOException -> L18
    L16:
        int id = 65535 & (fieldInfo >> 16);     // Catch: IOException -> L18
        this.mFieldId = id;     // Catch: IOException -> L18
        this.mFieldSize = size;     // Catch: IOException -> L18
        goto L20
    L9:
        return false;
    L5:
        return true;
    L19:
        return false;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void setOutputField(int fieldId) {
        closeField();
        this.mFieldBuffer = new FieldBuffer(fieldId, this.mMasterOutput);
        this.mCurrentOutput = this.mFieldBuffer.mDataStream;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] b) {
        DataOutputStream r0 = this.mCurrentOutput;
        if (b == null) goto L5;
        r0.writeInt(b.length);     // Catch: IOException -> L8
        this.mCurrentOutput.write(b);     // Catch: IOException -> L8
    L11:
        return;
    L5:
        r0.writeInt(-1);     // Catch: IOException -> L8
    L8:
        e = move-exception;
        throw new VersionedParcel.ParcelException(e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] b, int offset, int len) {
        DataOutputStream r0 = this.mCurrentOutput;
        if (b == null) goto L5;
        r0.writeInt(len);     // Catch: IOException -> L8
        this.mCurrentOutput.write(b, offset, len);     // Catch: IOException -> L8
    L11:
        return;
    L5:
        r0.writeInt(-1);     // Catch: IOException -> L8
    L8:
        e = move-exception;
        throw new VersionedParcel.ParcelException(e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void writeCharSequence(CharSequence charSequence) {
        if (this.mIgnoreParcelables == false) goto L6;
        return;
    L6:
        throw new RuntimeException("CharSequence cannot be written to an OutputStream");
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeInt(int val) {
        this.mCurrentOutput.writeInt(val);     // Catch: IOException -> L4
        return;
    L4:
        e = move-exception;
        throw new VersionedParcel.ParcelException(e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeLong(long val) {
        this.mCurrentOutput.writeLong(val);     // Catch: IOException -> L4
        return;
    L4:
        e = move-exception;
        throw new VersionedParcel.ParcelException(e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeFloat(float val) {
        this.mCurrentOutput.writeFloat(val);     // Catch: IOException -> L4
        return;
    L4:
        e = move-exception;
        throw new VersionedParcel.ParcelException(e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeDouble(double val) {
        this.mCurrentOutput.writeDouble(val);     // Catch: IOException -> L4
        return;
    L4:
        e = move-exception;
        throw new VersionedParcel.ParcelException(e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeString(String val) {
        if (val == null) goto L4;
        byte[] bytes = val.getBytes(UTF_16);     // Catch: IOException -> L7
        this.mCurrentOutput.writeInt(bytes.length);     // Catch: IOException -> L7
        this.mCurrentOutput.write(bytes);     // Catch: IOException -> L7
    L10:
        return;
    L4:
        this.mCurrentOutput.writeInt(-1);     // Catch: IOException -> L7
    L7:
        e = move-exception;
        throw new VersionedParcel.ParcelException(e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBoolean(boolean val) {
        this.mCurrentOutput.writeBoolean(val);     // Catch: IOException -> L4
        return;
    L4:
        e = move-exception;
        throw new VersionedParcel.ParcelException(e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeStrongBinder(IBinder val) {
        if (this.mIgnoreParcelables == false) goto L6;
        return;
    L6:
        throw new RuntimeException("Binders cannot be written to an OutputStream");
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeParcelable(Parcelable p) {
        if (this.mIgnoreParcelables == false) goto L6;
        return;
    L6:
        throw new RuntimeException("Parcelables cannot be written to an OutputStream");
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeStrongInterface(IInterface val) {
        if (this.mIgnoreParcelables == false) goto L6;
        return;
    L6:
        throw new RuntimeException("Binders cannot be written to an OutputStream");
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public IBinder readStrongBinder() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T readParcelable() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int readInt() {
        return this.mCurrentInput.readInt();
    L4:
        e = move-exception;
        throw new VersionedParcel.ParcelException(e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public long readLong() {
        return this.mCurrentInput.readLong();
    L4:
        e = move-exception;
        throw new VersionedParcel.ParcelException(e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public float readFloat() {
        return this.mCurrentInput.readFloat();
    L4:
        e = move-exception;
        throw new VersionedParcel.ParcelException(e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public double readDouble() {
        return this.mCurrentInput.readDouble();
    L4:
        e = move-exception;
        throw new VersionedParcel.ParcelException(e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String readString() {
        int len = this.mCurrentInput.readInt();     // Catch: IOException -> L8
        if (len <= 0) goto L6;
        byte[] bytes = new byte[len];     // Catch: IOException -> L8
        this.mCurrentInput.readFully(bytes);     // Catch: IOException -> L8
        return new String(bytes, UTF_16);
    L6:
        return null;
    L8:
        e = move-exception;
        throw new VersionedParcel.ParcelException(e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] readByteArray() {
        int len = this.mCurrentInput.readInt();     // Catch: IOException -> L8
        if (len <= 0) goto L6;
        byte[] bytes = new byte[len];     // Catch: IOException -> L8
        this.mCurrentInput.readFully(bytes);     // Catch: IOException -> L8
        return bytes;
    L6:
        return null;
    L8:
        e = move-exception;
        throw new VersionedParcel.ParcelException(e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected CharSequence readCharSequence() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readBoolean() {
        return this.mCurrentInput.readBoolean();
    L4:
        e = move-exception;
        throw new VersionedParcel.ParcelException(e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBundle(Bundle val) {
        if (val == null) goto L8;
        Set<String> keys = val.keySet();     // Catch: IOException -> L11
        this.mCurrentOutput.writeInt(keys.size());     // Catch: IOException -> L11
        Iterator<String> r1 = keys.iterator();     // Catch: IOException -> L11
    L5:
        if (r1.hasNext() == false) goto L16;
        String key = r1.next();     // Catch: IOException -> L11
        writeString(key);     // Catch: IOException -> L11
        Object o = val.get(key);     // Catch: IOException -> L11
        writeObject(o);     // Catch: IOException -> L11
        goto L5
    L16:
        return;
    L8:
        this.mCurrentOutput.writeInt(-1);     // Catch: IOException -> L11
        return;
    L11:
        e = move-exception;
        throw new VersionedParcel.ParcelException(e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Bundle readBundle() {
        int size = readInt();
        if (size >= 0) goto L6;
        return null;
    L6:
        Bundle b = new Bundle();
        int i = 0;
    L7:
        if (i >= size) goto L9;
        String key = readString();
        readObject(readInt(), key, b);
        i = i + 1;
        goto L7
    L9:
        return b;
    }

    private void writeObject(Object o) {
        if (o != null) goto L5;
        writeInt(0);
        return;
    L5:
        if ((o instanceof Bundle) == false) goto L8;
        writeInt(1);
        writeBundle((Bundle) o);
        return;
    L8:
        if ((o instanceof String) == false) goto L11;
        writeInt(3);
        writeString((String) o);
        return;
    L11:
        if ((o instanceof String[]) == false) goto L14;
        writeInt(4);
        writeArray((String[]) o);
        return;
    L14:
        if ((o instanceof Boolean) == false) goto L17;
        writeInt(5);
        writeBoolean(((Boolean) o).booleanValue());
        return;
    L17:
        if ((o instanceof boolean[]) == false) goto L20;
        writeInt(6);
        writeBooleanArray((boolean[]) o);
        return;
    L20:
        if ((o instanceof Double) == false) goto L23;
        writeInt(7);
        writeDouble(((Double) o).doubleValue());
        return;
    L23:
        if ((o instanceof double[]) == false) goto L26;
        writeInt(8);
        writeDoubleArray((double[]) o);
        return;
    L26:
        if ((o instanceof Integer) == false) goto L29;
        writeInt(9);
        writeInt(((Integer) o).intValue());
        return;
    L29:
        if ((o instanceof int[]) == false) goto L32;
        writeInt(10);
        writeIntArray((int[]) o);
        return;
    L32:
        if ((o instanceof Long) == false) goto L35;
        writeInt(11);
        writeLong(((Long) o).longValue());
        return;
    L35:
        if ((o instanceof long[]) == false) goto L38;
        writeInt(12);
        writeLongArray((long[]) o);
        return;
    L38:
        if ((o instanceof Float) == false) goto L41;
        writeInt(13);
        writeFloat(((Float) o).floatValue());
        return;
    L41:
        if ((o instanceof float[]) == false) goto L45;
        writeInt(14);
        writeFloatArray((float[]) o);
        return;
    L45:
        throw new IllegalArgumentException("Unsupported type " + o.getClass());
    }

    private void readObject(int type, String key, Bundle b) {
        switch(type) {
            case 0: goto L19;
            case 1: goto L18;
            case 2: goto L17;
            case 3: goto L16;
            case 4: goto L15;
            case 5: goto L14;
            case 6: goto L13;
            case 7: goto L12;
            case 8: goto L11;
            case 9: goto L10;
            case 10: goto L9;
            case 11: goto L8;
            case 12: goto L7;
            case 13: goto L6;
            case 14: goto L5;
            default: goto L4;
        };
    L5:
        b.putFloatArray(key, readFloatArray());
        return;
    L6:
        b.putFloat(key, readFloat());
        return;
    L7:
        b.putLongArray(key, readLongArray());
        return;
    L8:
        b.putLong(key, readLong());
        return;
    L9:
        b.putIntArray(key, readIntArray());
        return;
    L10:
        b.putInt(key, readInt());
        return;
    L11:
        b.putDoubleArray(key, readDoubleArray());
        return;
    L12:
        b.putDouble(key, readDouble());
        return;
    L13:
        b.putBooleanArray(key, readBooleanArray());
        return;
    L14:
        b.putBoolean(key, readBoolean());
        return;
    L15:
        b.putStringArray(key, (String[]) readArray(new String[0]));
        return;
    L16:
        b.putString(key, readString());
        return;
    L17:
        b.putBundle(key, readBundle());
        return;
    L18:
        b.putBundle(key, readBundle());
        return;
    L19:
        b.putParcelable(key, null);
        return;
    L4:
        throw new RuntimeException("Unknown type " + type);
    }
}
