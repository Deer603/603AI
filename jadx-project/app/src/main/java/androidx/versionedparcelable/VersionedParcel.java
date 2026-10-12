package androidx.versionedparcelable;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VersionedParcel {
    private static final int EX_BAD_PARCELABLE = -2;
    private static final int EX_ILLEGAL_ARGUMENT = -3;
    private static final int EX_ILLEGAL_STATE = -5;
    private static final int EX_NETWORK_MAIN_THREAD = -6;
    private static final int EX_NULL_POINTER = -4;
    private static final int EX_PARCELABLE = -9;
    private static final int EX_SECURITY = -1;
    private static final int EX_UNSUPPORTED_OPERATION = -7;
    private static final String TAG = "VersionedParcel";
    private static final int TYPE_BINDER = 5;
    private static final int TYPE_FLOAT = 8;
    private static final int TYPE_INTEGER = 7;
    private static final int TYPE_PARCELABLE = 2;
    private static final int TYPE_SERIALIZABLE = 3;
    private static final int TYPE_STRING = 4;
    private static final int TYPE_VERSIONED_PARCELABLE = 1;
    protected final ArrayMap<String, Class> mParcelizerCache;
    protected final ArrayMap<String, Method> mReadCache;
    protected final ArrayMap<String, Method> mWriteCache;

    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable source) {
            super(source);
        }
    }

    protected abstract void closeField();

    protected abstract VersionedParcel createSubParcel();

    protected abstract boolean readBoolean();

    protected abstract Bundle readBundle();

    protected abstract byte[] readByteArray();

    protected abstract CharSequence readCharSequence();

    protected abstract double readDouble();

    protected abstract boolean readField(int r1);

    protected abstract float readFloat();

    protected abstract int readInt();

    protected abstract long readLong();

    protected abstract <T extends Parcelable> T readParcelable();

    protected abstract String readString();

    protected abstract IBinder readStrongBinder();

    protected abstract void setOutputField(int r1);

    protected abstract void writeBoolean(boolean r1);

    protected abstract void writeBundle(Bundle r1);

    protected abstract void writeByteArray(byte[] r1);

    protected abstract void writeByteArray(byte[] r1, int r2, int r3);

    protected abstract void writeCharSequence(CharSequence r1);

    protected abstract void writeDouble(double r1);

    protected abstract void writeFloat(float r1);

    protected abstract void writeInt(int r1);

    protected abstract void writeLong(long r1);

    protected abstract void writeParcelable(Parcelable r1);

    protected abstract void writeString(String r1);

    protected abstract void writeStrongBinder(IBinder r1);

    protected abstract void writeStrongInterface(IInterface r1);

    public VersionedParcel(ArrayMap<String, Method> readCache, ArrayMap<String, Method> writeCache, ArrayMap<String, Class> parcelizerCache) {
        this.mReadCache = readCache;
        this.mWriteCache = writeCache;
        this.mParcelizerCache = parcelizerCache;
    }

    public boolean isStream() {
        return false;
    }

    public void setSerializationFlags(boolean allowSerialization, boolean ignoreParcelables) {
    }

    public void writeStrongInterface(IInterface val, int fieldId) {
        setOutputField(fieldId);
        writeStrongInterface(val);
    }

    public void writeBundle(Bundle val, int fieldId) {
        setOutputField(fieldId);
        writeBundle(val);
    }

    public void writeBoolean(boolean val, int fieldId) {
        setOutputField(fieldId);
        writeBoolean(val);
    }

    public void writeByteArray(byte[] b, int fieldId) {
        setOutputField(fieldId);
        writeByteArray(b);
    }

    public void writeByteArray(byte[] b, int offset, int len, int fieldId) {
        setOutputField(fieldId);
        writeByteArray(b, offset, len);
    }

    public void writeCharSequence(CharSequence val, int fieldId) {
        setOutputField(fieldId);
        writeCharSequence(val);
    }

    public void writeInt(int val, int fieldId) {
        setOutputField(fieldId);
        writeInt(val);
    }

    public void writeLong(long val, int fieldId) {
        setOutputField(fieldId);
        writeLong(val);
    }

    public void writeFloat(float val, int fieldId) {
        setOutputField(fieldId);
        writeFloat(val);
    }

    public void writeDouble(double val, int fieldId) {
        setOutputField(fieldId);
        writeDouble(val);
    }

    public void writeString(String val, int fieldId) {
        setOutputField(fieldId);
        writeString(val);
    }

    public void writeStrongBinder(IBinder val, int fieldId) {
        setOutputField(fieldId);
        writeStrongBinder(val);
    }

    public void writeParcelable(Parcelable p, int fieldId) {
        setOutputField(fieldId);
        writeParcelable(p);
    }

    public boolean readBoolean(boolean def, int fieldId) {
        if (readField(fieldId) == true) goto L6;
        return def;
    L6:
        return readBoolean();
    }

    public int readInt(int def, int fieldId) {
        if (readField(fieldId) == true) goto L6;
        return def;
    L6:
        return readInt();
    }

    public long readLong(long def, int fieldId) {
        if (readField(fieldId) == true) goto L6;
        return def;
    L6:
        return readLong();
    }

    public float readFloat(float def, int fieldId) {
        if (readField(fieldId) == true) goto L6;
        return def;
    L6:
        return readFloat();
    }

    public double readDouble(double def, int fieldId) {
        if (readField(fieldId) == true) goto L6;
        return def;
    L6:
        return readDouble();
    }

    public String readString(String def, int fieldId) {
        if (readField(fieldId) == true) goto L6;
        return def;
    L6:
        return readString();
    }

    public IBinder readStrongBinder(IBinder def, int fieldId) {
        if (readField(fieldId) == true) goto L6;
        return def;
    L6:
        return readStrongBinder();
    }

    public byte[] readByteArray(byte[] def, int fieldId) {
        if (readField(fieldId) == true) goto L6;
        return def;
    L6:
        return readByteArray();
    }

    public <T extends Parcelable> T readParcelable(T r2, int r3) {
        if (readField(r3) == true) goto L6;
        return r2;
    L6:
        return (T) readParcelable();
    }

    public Bundle readBundle(Bundle def, int fieldId) {
        if (readField(fieldId) == true) goto L6;
        return def;
    L6:
        return readBundle();
    }

    public void writeByte(byte val, int fieldId) {
        setOutputField(fieldId);
        writeInt(val);
    }

    public void writeSize(Size val, int fieldId) {
        setOutputField(fieldId);
        if (val == null) goto L5;
        boolean r0 = true;
    L6:
        writeBoolean(r0);
        if (val == null) goto L10;
        writeInt(val.getWidth());
        writeInt(val.getHeight());
        return;
    L10:
        return;
    L5:
        r0 = false;
        goto L6
    }

    public void writeSizeF(SizeF val, int fieldId) {
        setOutputField(fieldId);
        if (val == null) goto L5;
        boolean r0 = true;
    L6:
        writeBoolean(r0);
        if (val == null) goto L10;
        writeFloat(val.getWidth());
        writeFloat(val.getHeight());
        return;
    L10:
        return;
    L5:
        r0 = false;
        goto L6
    }

    public void writeSparseBooleanArray(SparseBooleanArray val, int fieldId) {
        setOutputField(fieldId);
        if (val != null) goto L6;
        writeInt(-1);
        return;
    L6:
        int n = val.size();
        writeInt(n);
        int i = 0;
    L7:
        if (i >= n) goto L9;
        writeInt(val.keyAt(i));
        writeBoolean(val.valueAt(i));
        i = i + 1;
        goto L7
    }

    public void writeBooleanArray(boolean[] val, int fieldId) {
        setOutputField(fieldId);
        writeBooleanArray(val);
    }

    protected void writeBooleanArray(boolean[] r4) {
        if (r4 == null) goto L7;
        int r0 = r4.length;
        writeInt(r0);
        int r1 = 0;
    L4:
        if (r1 >= r0) goto L10;
        writeInt(r4[r1] ? 1 : 0);
        r1 = r1 + 1;
        goto L4
    L10:
        return;
    L7:
        writeInt(-1);
    }

    public boolean[] readBooleanArray(boolean[] def, int fieldId) {
        if (readField(fieldId) == true) goto L6;
        return def;
    L6:
        return readBooleanArray();
    }

    protected boolean[] readBooleanArray() {
        int n = readInt();
        if (n >= 0) goto L6;
        return null;
    L6:
        boolean[] val = new boolean[n];
        int i = 0;
    L7:
        if (i >= n) goto L13;
        if (readInt() == 0) goto L11;
        boolean r3 = true;
    L12:
        val[i] = r3;
        i = i + 1;
        goto L7
    L11:
        r3 = false;
        goto L12
    L13:
        return val;
    }

    public void writeCharArray(char[] val, int fieldId) {
        setOutputField(fieldId);
        if (val == null) goto L8;
        int n = val.length;
        writeInt(n);
        int i = 0;
    L5:
        if (i >= n) goto L11;
        writeInt(val[i]);
        i = i + 1;
        goto L5
    L11:
        return;
    L8:
        writeInt(-1);
    }

    public CharSequence readCharSequence(CharSequence def, int fieldId) {
        if (readField(fieldId) == true) goto L6;
        return def;
    L6:
        return readCharSequence();
    }

    public char[] readCharArray(char[] def, int fieldId) {
        if (readField(fieldId) == true) goto L5;
        return def;
    L5:
        int n = readInt();
        if (n >= 0) goto L9;
        return null;
    L9:
        char[] val = new char[n];
        int i = 0;
    L10:
        if (i >= n) goto L12;
        val[i] = (char) readInt();
        i = i + 1;
        goto L10
    L12:
        return val;
    }

    public void writeIntArray(int[] val, int fieldId) {
        setOutputField(fieldId);
        writeIntArray(val);
    }

    protected void writeIntArray(int[] val) {
        if (val == null) goto L7;
        int n = val.length;
        writeInt(n);
        int i = 0;
    L4:
        if (i >= n) goto L10;
        writeInt(val[i]);
        i = i + 1;
        goto L4
    L10:
        return;
    L7:
        writeInt(-1);
    }

    public int[] readIntArray(int[] def, int fieldId) {
        if (readField(fieldId) == true) goto L6;
        return def;
    L6:
        return readIntArray();
    }

    protected int[] readIntArray() {
        int n = readInt();
        if (n >= 0) goto L6;
        return null;
    L6:
        int[] val = new int[n];
        int i = 0;
    L7:
        if (i >= n) goto L9;
        val[i] = readInt();
        i = i + 1;
        goto L7
    L9:
        return val;
    }

    public void writeLongArray(long[] val, int fieldId) {
        setOutputField(fieldId);
        writeLongArray(val);
    }

    protected void writeLongArray(long[] val) {
        if (val == null) goto L7;
        int n = val.length;
        writeInt(n);
        int i = 0;
    L4:
        if (i >= n) goto L10;
        writeLong(val[i]);
        i = i + 1;
        goto L4
    L10:
        return;
    L7:
        writeInt(-1);
    }

    public long[] readLongArray(long[] def, int fieldId) {
        if (readField(fieldId) == true) goto L6;
        return def;
    L6:
        return readLongArray();
    }

    protected long[] readLongArray() {
        int n = readInt();
        if (n >= 0) goto L6;
        return null;
    L6:
        long[] val = new long[n];
        int i = 0;
    L7:
        if (i >= n) goto L9;
        val[i] = readLong();
        i = i + 1;
        goto L7
    L9:
        return val;
    }

    public void writeFloatArray(float[] val, int fieldId) {
        setOutputField(fieldId);
        writeFloatArray(val);
    }

    protected void writeFloatArray(float[] val) {
        if (val == null) goto L7;
        int n = val.length;
        writeInt(n);
        int i = 0;
    L4:
        if (i >= n) goto L10;
        writeFloat(val[i]);
        i = i + 1;
        goto L4
    L10:
        return;
    L7:
        writeInt(-1);
    }

    public float[] readFloatArray(float[] def, int fieldId) {
        if (readField(fieldId) == true) goto L6;
        return def;
    L6:
        return readFloatArray();
    }

    protected float[] readFloatArray() {
        int n = readInt();
        if (n >= 0) goto L6;
        return null;
    L6:
        float[] val = new float[n];
        int i = 0;
    L7:
        if (i >= n) goto L9;
        val[i] = readFloat();
        i = i + 1;
        goto L7
    L9:
        return val;
    }

    public void writeDoubleArray(double[] val, int fieldId) {
        setOutputField(fieldId);
        writeDoubleArray(val);
    }

    protected void writeDoubleArray(double[] val) {
        if (val == null) goto L7;
        int n = val.length;
        writeInt(n);
        int i = 0;
    L4:
        if (i >= n) goto L10;
        writeDouble(val[i]);
        i = i + 1;
        goto L4
    L10:
        return;
    L7:
        writeInt(-1);
    }

    public double[] readDoubleArray(double[] def, int fieldId) {
        if (readField(fieldId) == true) goto L6;
        return def;
    L6:
        return readDoubleArray();
    }

    protected double[] readDoubleArray() {
        int n = readInt();
        if (n >= 0) goto L6;
        return null;
    L6:
        double[] val = new double[n];
        int i = 0;
    L7:
        if (i >= n) goto L9;
        val[i] = readDouble();
        i = i + 1;
        goto L7
    L9:
        return val;
    }

    public <T> void writeSet(Set<T> val, int fieldId) {
        writeCollection(val, fieldId);
    }

    public <T> void writeList(List<T> val, int fieldId) {
        writeCollection(val, fieldId);
    }

    public <K, V> void writeMap(Map<K, V> val, int fieldId) {
        setOutputField(fieldId);
        if (val != null) goto L6;
        writeInt(-1);
        return;
    L6:
        int size = val.size();
        writeInt(size);
        if (size != 0) goto L9;
        return;
    L9:
        ArrayList r1 = new ArrayList();
        ArrayList r2 = new ArrayList();
        Iterator<Map.Entry<K, V>> r3 = val.entrySet().iterator();
    L11:
        if (r3.hasNext() == false) goto L13;
        Map.Entry<K, V> entry = r3.next();
        r1.add(entry.getKey());
        r2.add(entry.getValue());
        goto L11
    L13:
        writeCollection(r1);
        writeCollection(r2);
    }

    private <T> void writeCollection(Collection<T> val, int fieldId) {
        setOutputField(fieldId);
        writeCollection(val);
    }

    private <T> void writeCollection(Collection<T> r6) {
        if (r6 != null) goto L5;
        writeInt(-1);
        return;
    L5:
        int r0 = r6.size();
        writeInt(r0);
        if (r0 <= 0) goto L44;
        int r1 = getType(r6.iterator().next());
        writeInt(r1);
        switch(r1) {
            case 1: goto L39;
            case 2: goto L34;
            case 3: goto L29;
            case 4: goto L24;
            case 5: goto L19;
            case 6: goto L52;
            case 7: goto L14;
            case 8: goto L10;
            default: goto L52;
        };
    L10:
        Iterator<T> r2 = r6.iterator();
    L12:
        if (r2.hasNext() == false) goto L53;
        writeFloat(((Float) r2.next()).floatValue());
        goto L12
    L53:
        return;
    L14:
        Iterator<T> r3 = r6.iterator();
    L16:
        if (r3.hasNext() == false) goto L54;
        writeInt(((Integer) r3.next()).intValue());
        goto L16
    L54:
        return;
    L19:
        Iterator<T> r4 = r6.iterator();
    L21:
        if (r4.hasNext() == false) goto L55;
        writeStrongBinder((IBinder) r4.next());
        goto L21
    L55:
        return;
    L24:
        Iterator<T> r5 = r6.iterator();
    L26:
        if (r5.hasNext() == false) goto L56;
        writeString((String) r5.next());
        goto L26
    L56:
        return;
    L29:
        Iterator<T> r7 = r6.iterator();
    L31:
        if (r7.hasNext() == false) goto L57;
        writeSerializable((Serializable) r7.next());
        goto L31
    L57:
        return;
    L34:
        Iterator<T> r8 = r6.iterator();
    L36:
        if (r8.hasNext() == false) goto L58;
        writeParcelable((Parcelable) r8.next());
        goto L36
    L58:
        return;
    L39:
        Iterator<T> r9 = r6.iterator();
    L41:
        if (r9.hasNext() == false) goto L59;
        writeVersionedParcelable((VersionedParcelable) r9.next());
        goto L41
    L59:
        return;
    L52:
        return;
    }

    public <T> void writeArray(T[] val, int fieldId) {
        setOutputField(fieldId);
        writeArray(val);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected <T> void writeArray(T[] r5) {
        if (r5 != 0) goto L5;
        writeInt(-1);
        return;
    L5:
        int n = r5.length;
        int i = 0;
        writeInt(n);
        if (n <= 0) goto L20;
        int type = getType(r5[0]);
        writeInt(type);
        switch(type) {
            case 1: goto L18;
            case 2: goto L16;
            case 3: goto L14;
            case 4: goto L12;
            case 5: goto L10;
            default: goto L26;
        };
    L10:
        if (i >= n) goto L27;
        writeStrongBinder((IBinder) r5[i]);
        i = i + 1;
        goto L10
    L27:
        return;
    L12:
        if (i >= n) goto L28;
        writeString((String) r5[i]);
        i = i + 1;
        goto L12
    L28:
        return;
    L14:
        if (i >= n) goto L29;
        writeSerializable((Serializable) r5[i]);
        i = i + 1;
        goto L14
    L29:
        return;
    L16:
        if (i >= n) goto L30;
        writeParcelable((Parcelable) r5[i]);
        i = i + 1;
        goto L16
    L30:
        return;
    L18:
        if (i >= n) goto L31;
        writeVersionedParcelable((VersionedParcelable) r5[i]);
        i = i + 1;
        goto L18
    L31:
        return;
    L26:
        return;
    }

    private <T> int getType(T t) {
        if ((t instanceof String) == false) goto L7;
        return 4;
    L7:
        if ((t instanceof Parcelable) == false) goto L11;
        return 2;
    L11:
        if ((t instanceof VersionedParcelable) == false) goto L15;
        return 1;
    L15:
        if ((t instanceof Serializable) == false) goto L19;
        return 3;
    L19:
        if ((t instanceof IBinder) == false) goto L23;
        return 5;
    L23:
        if ((t instanceof Integer) == false) goto L27;
        return 7;
    L27:
        if ((t instanceof Float) == false) goto L31;
        return 8;
    L31:
        throw new IllegalArgumentException(t.getClass().getName() + " cannot be VersionedParcelled");
    }

    public void writeVersionedParcelable(VersionedParcelable p, int fieldId) {
        setOutputField(fieldId);
        writeVersionedParcelable(p);
    }

    protected void writeVersionedParcelable(VersionedParcelable p) {
        if (p != null) goto L5;
        writeString(null);
        return;
    L5:
        writeVersionedParcelableCreator(p);
        VersionedParcel subParcel = createSubParcel();
        writeToParcel(p, subParcel);
        subParcel.closeField();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void writeVersionedParcelableCreator(VersionedParcelable p) {
        Class name = findParcelClass(p.getClass());     // Catch: ClassNotFoundException -> L6
        writeString(name.getName());
        return;
    L6:
        e = move-exception;
        throw new RuntimeException(p.getClass().getSimpleName() + " does not have a Parcelizer", e);
    }

    public void writeSerializable(Serializable s, int fieldId) {
        setOutputField(fieldId);
        writeSerializable(s);
    }

    private void writeSerializable(Serializable s) {
        if (s != null) goto L5;
        writeString(null);
        return;
    L5:
        String name = s.getClass().getName();
        writeString(name);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);     // Catch: IOException -> L8
        oos.writeObject(s);     // Catch: IOException -> L8
        oos.close();     // Catch: IOException -> L8
        writeByteArray(baos.toByteArray());     // Catch: IOException -> L8
        return;
    L8:
        ioe = move-exception;
        throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + ")", ioe);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeException(Exception r4, int fieldId) {
        setOutputField(fieldId);
        if (r4 != 0) goto L6;
        writeNoException();
        return;
    L6:
        int code = 0;
        if ((r4 instanceof Parcelable) == false) goto L12;
        if (r4.getClass().getClassLoader() != Parcelable.class.getClassLoader()) goto L12;
        code = EX_PARCELABLE;
    L32:
        writeInt(code);
        if (code == 0) goto L35;
        writeString(r4.getMessage());
        switch(code) {
            case -9: goto L43;
            default: goto L45;
        };
    L43:
        writeParcelable((Parcelable) r4);
        return;
    L45:
        return;
    L35:
        if ((r4 instanceof RuntimeException) == false) goto L39;
        throw ((RuntimeException) r4);
    L39:
        throw new RuntimeException(r4);
    L12:
        if ((r4 instanceof SecurityException) == false) goto L15;
        code = -1;
        goto L32
    L15:
        if ((r4 instanceof BadParcelableException) == false) goto L18;
        code = -2;
        goto L32
    L18:
        if ((r4 instanceof IllegalArgumentException) == false) goto L21;
        code = -3;
        goto L32
    L21:
        if ((r4 instanceof NullPointerException) == false) goto L24;
        code = -4;
        goto L32
    L24:
        if ((r4 instanceof IllegalStateException) == false) goto L27;
        code = EX_ILLEGAL_STATE;
        goto L32
    L27:
        if ((r4 instanceof NetworkOnMainThreadException) == false) goto L30;
        code = EX_NETWORK_MAIN_THREAD;
        goto L32
    L30:
        if ((r4 instanceof UnsupportedOperationException) == false) goto L32;
        code = EX_UNSUPPORTED_OPERATION;
        goto L32
    }

    protected void writeNoException() {
        writeInt(0);
    }

    public Exception readException(Exception def, int fieldId) {
        if (readField(fieldId) == true) goto L5;
        return def;
    L5:
        int code = readExceptionCode();
        if (code == 0) goto L9;
        String msg = readString();
        return readException(code, msg);
    L9:
        return def;
    }

    private int readExceptionCode() {
        int code = readInt();
        return code;
    }

    private Exception readException(int code, String msg) {
        Exception e = createException(code, msg);
        return e;
    }

    protected static Throwable getRootCause(Throwable t) {
    L3:
        if (t.getCause() == null) goto L5;
        t = t.getCause();
        goto L3
    L5:
        return t;
    }

    private Exception createException(int code, String msg) {
        switch(code) {
            case -9: goto L20;
            case -8: goto L4;
            case -7: goto L18;
            case -6: goto L16;
            case -5: goto L14;
            case -4: goto L12;
            case -3: goto L10;
            case -2: goto L8;
            case -1: goto L6;
            default: goto L4;
        };
    L4:
        return new RuntimeException("Unknown exception code: " + code + " msg " + msg);
    L6:
        return new SecurityException(msg);
    L8:
        return new BadParcelableException(msg);
    L10:
        return new IllegalArgumentException(msg);
    L12:
        return new NullPointerException(msg);
    L14:
        return new IllegalStateException(msg);
    L16:
        return new NetworkOnMainThreadException();
    L18:
        return new UnsupportedOperationException(msg);
    L20:
        return (Exception) readParcelable();
    }

    public byte readByte(byte def, int fieldId) {
        if (readField(fieldId) == true) goto L6;
        return def;
    L6:
        return (byte) (readInt() & 255);
    }

    public Size readSize(Size def, int fieldId) {
        if (readField(fieldId) == true) goto L6;
        return def;
    L6:
        if (readBoolean() == false) goto L9;
        int width = readInt();
        int height = readInt();
        return new Size(width, height);
    L9:
        return null;
    }

    public SizeF readSizeF(SizeF def, int fieldId) {
        if (readField(fieldId) == true) goto L6;
        return def;
    L6:
        if (readBoolean() == false) goto L9;
        float width = readFloat();
        float height = readFloat();
        return new SizeF(width, height);
    L9:
        return null;
    }

    public SparseBooleanArray readSparseBooleanArray(SparseBooleanArray def, int fieldId) {
        if (readField(fieldId) == true) goto L5;
        return def;
    L5:
        int n = readInt();
        if (n >= 0) goto L9;
        return null;
    L9:
        SparseBooleanArray sa = new SparseBooleanArray(n);
        int i = 0;
    L10:
        if (i >= n) goto L12;
        sa.put(readInt(), readBoolean());
        i = i + 1;
        goto L10
    L12:
        return sa;
    }

    public <T> Set<T> readSet(Set<T> def, int fieldId) {
        if (readField(fieldId) == true) goto L6;
        return def;
    L6:
        return (Set) readCollection(new ArraySet());
    }

    public <T> List<T> readList(List<T> def, int fieldId) {
        if (readField(fieldId) == true) goto L6;
        return def;
    L6:
        return (List) readCollection(new ArrayList());
    }

    private <T, S extends Collection<T>> S readCollection(S list) {
        int n = readInt();
        if (n >= 0) goto L5;
        return null;
    L5:
        if (n == 0) goto L21;
        int type = readInt();
        if (n >= 0) goto L9;
        return null;
    L9:
        switch(type) {
            case 1: goto L19;
            case 2: goto L17;
            case 3: goto L15;
            case 4: goto L13;
            case 5: goto L11;
            default: goto L21;
        };
    L11:
        if (n <= 0) goto L21;
        list.add(readStrongBinder());
        n = n - 1;
    L13:
        if (n <= 0) goto L21;
        list.add(readString());
        n = n - 1;
    L15:
        if (n <= 0) goto L21;
        list.add(readSerializable());
        n = n - 1;
    L17:
        if (n <= 0) goto L21;
        list.add(readParcelable());
        n = n - 1;
    L19:
        if (n <= 0) goto L21;
        list.add(readVersionedParcelable());
        n = n - 1;
    L21:
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K, V> Map<K, V> readMap(Map<K, V> r8, int r9) {
        if (readField(r9) == true) goto L5;
        return r8;
    L5:
        int r0 = readInt();
        if (r0 >= 0) goto L9;
        return null;
    L9:
        ArrayMap r1 = new ArrayMap();
        if (r0 != 0) goto L12;
        return r1;
    L12:
        ArrayList r2 = new ArrayList();
        ArrayList r3 = new ArrayList();
        readCollection(r2);
        readCollection(r3);
        int r4 = 0;
    L13:
        if (r4 >= r0) goto L15;
        r1.put(r2.get(r4), r3.get(r4));
        r4 = r4 + 1;
        goto L13
    L15:
        return r1;
    }

    public <T> T[] readArray(T[] r2, int r3) {
        if (readField(r3) == true) goto L6;
        return r2;
    L6:
        return (T[]) readArray(r2);
    }

    protected <T> T[] readArray(T[] r5) {
        int r0 = readInt();
        if (r0 >= 0) goto L5;
        return null;
    L5:
        ArrayList r2 = new ArrayList(r0);
        if (r0 == 0) goto L23;
        int r3 = readInt();
        if (r0 >= 0) goto L10;
        return null;
    L10:
        switch(r3) {
            case 1: goto L20;
            case 2: goto L18;
            case 3: goto L16;
            case 4: goto L14;
            case 5: goto L12;
            default: goto L23;
        };
    L12:
        if (r0 <= 0) goto L23;
        r2.add(readStrongBinder());
        r0 = r0 - 1;
    L14:
        if (r0 <= 0) goto L23;
        r2.add(readString());
        r0 = r0 - 1;
    L16:
        if (r0 <= 0) goto L23;
        r2.add(readSerializable());
        r0 = r0 - 1;
    L18:
        if (r0 <= 0) goto L23;
        r2.add(readParcelable());
        r0 = r0 - 1;
    L20:
        if (r0 <= 0) goto L23;
        r2.add(readVersionedParcelable());
        r0 = r0 - 1;
    L23:
        return (T[]) r2.toArray(r5);
    }

    public <T extends VersionedParcelable> T readVersionedParcelable(T r2, int r3) {
        if (readField(r3) == true) goto L6;
        return r2;
    L6:
        return (T) readVersionedParcelable();
    }

    protected <T extends VersionedParcelable> T readVersionedParcelable() {
        String r0 = readString();
        if (r0 != null) goto L7;
        return null;
    L7:
        return (T) readFromParcel(r0, createSubParcel());
    }

    protected Serializable readSerializable() {
        String name = readString();
        if (name != null) goto L6;
        return null;
    L6:
        byte[] serializedData = readByteArray();
        final ByteArrayInputStream bais = new ByteArrayInputStream(serializedData);
        ObjectInputStream ois = new AnonymousClass1(this, bais);     // Catch: ClassNotFoundException -> L9 IOException -> L12
        return (Serializable) ois.readObject();
    L12:
        ioe = move-exception;
        throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + name + ")", ioe);
    L9:
        cnfe = move-exception;
        throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + name + ")", cnfe);
    }

    protected <T extends VersionedParcelable> T readFromParcel(String parcelCls, VersionedParcel versionedParcel) {
        Method m = getReadMethod(parcelCls);     // Catch: ClassNotFoundException -> L4 NoSuchMethodException -> L7 InvocationTargetException -> L10 IllegalAccessException -> L17
        return (T) m.invoke(null, new Object[]{versionedParcel});
    L4:
        e = move-exception;
        throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
    L17:
        e = move-exception;
        throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
    L7:
        e = move-exception;
        throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e);
    L10:
        e = move-exception;
        if ((e.getCause() instanceof RuntimeException) == false) goto L16;
        throw ((RuntimeException) e.getCause());
    L16:
        throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e);
    }

    protected <T extends VersionedParcelable> void writeToParcel(T val, VersionedParcel versionedParcel) {
        Method m = getWriteMethod(val.getClass());     // Catch: ClassNotFoundException -> L4 NoSuchMethodException -> L7 InvocationTargetException -> L10 IllegalAccessException -> L17
        m.invoke(null, new Object[]{val, versionedParcel});     // Catch: ClassNotFoundException -> L4 NoSuchMethodException -> L7 InvocationTargetException -> L10 IllegalAccessException -> L17
        return;
    L4:
        e = move-exception;
        throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
    L17:
        e = move-exception;
        throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
    L7:
        e = move-exception;
        throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e);
    L10:
        e = move-exception;
        if ((e.getCause() instanceof RuntimeException) == false) goto L16;
        throw ((RuntimeException) e.getCause());
    L16:
        throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e);
    }

    private Method getReadMethod(String parcelCls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method m = this.mReadCache.get(parcelCls);
        if (m != null) goto L6;
        System.currentTimeMillis();
        Method m2 = Class.forName(parcelCls, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", new Class[]{VersionedParcel.class});
        this.mReadCache.put(parcelCls, m2);
        return m2;
    L6:
        return m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Method getWriteMethod(Class baseCls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method m = this.mWriteCache.get(baseCls.getName());
        if (m != null) goto L6;
        Class r1 = findParcelClass(baseCls);
        System.currentTimeMillis();
        Method m2 = r1.getDeclaredMethod("write", new Class[]{baseCls, VersionedParcel.class});
        this.mWriteCache.put(baseCls.getName(), m2);
        return m2;
    L6:
        return m;
    }

    private Class findParcelClass(Class<? extends VersionedParcelable> cls) throws ClassNotFoundException {
        Class ret = this.mParcelizerCache.get(cls.getName());
        if (ret != null) goto L6;
        String pkg = cls.getPackage().getName();
        String c = String.format("%s.%sParcelizer", new Object[]{pkg, cls.getSimpleName()});
        Class<?> r0 = Class.forName(c, false, cls.getClassLoader());
        this.mParcelizerCache.put(cls.getName(), r0);
        return r0;
    L6:
        return ret;
    }
}
