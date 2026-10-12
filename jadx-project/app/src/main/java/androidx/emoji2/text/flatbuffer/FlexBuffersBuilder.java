package androidx.emoji2.text.flatbuffer;

import androidx.collection.SieveCacheKt;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class FlexBuffersBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int BUILDER_FLAG_NONE = 0;
    public static final int BUILDER_FLAG_SHARE_ALL = 7;
    public static final int BUILDER_FLAG_SHARE_KEYS = 1;
    public static final int BUILDER_FLAG_SHARE_KEYS_AND_STRINGS = 3;
    public static final int BUILDER_FLAG_SHARE_KEY_VECTORS = 4;
    public static final int BUILDER_FLAG_SHARE_STRINGS = 2;
    private static final int WIDTH_16 = 1;
    private static final int WIDTH_32 = 2;
    private static final int WIDTH_64 = 3;
    private static final int WIDTH_8 = 0;
    private final ReadWriteBuf bb;
    private boolean finished;
    private final int flags;
    private Comparator<Value> keyComparator;
    private final HashMap<String, Integer> keyPool;
    private final ArrayList<Value> stack;
    private final HashMap<String, Integer> stringPool;

    private static class Value {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        final double dValue;
        long iValue;
        int key;
        final int minBitWidth;
        final int type;

        static {
        }

        static /* synthetic */ int access$100(int x0, int x1) {
            return paddingBytes(x0, x1);
        }

        static /* synthetic */ int access$200(Value x0, int x1, int x2) {
            return x0.elemWidth(x1, x2);
        }

        static /* synthetic */ byte access$300(Value x0) {
            return x0.storedPackedType();
        }

        static /* synthetic */ byte access$400(Value x0, int x1) {
            return x0.storedPackedType(x1);
        }

        static /* synthetic */ int access$500(int x0, int x1, long x2, int x3, int x4) {
            return elemWidth(x0, x1, x2, x3, x4);
        }

        Value(int key, int type, int bitWidth, long iValue) {
            this.key = key;
            this.type = type;
            this.minBitWidth = bitWidth;
            this.iValue = iValue;
            this.dValue = Double.MIN_VALUE;
        }

        Value(int key, int type, int bitWidth, double dValue) {
            this.key = key;
            this.type = type;
            this.minBitWidth = bitWidth;
            this.dValue = dValue;
            this.iValue = Long.MIN_VALUE;
        }

        static Value bool(int key, boolean b) {
            if (b == false) goto L5;
            long r1 = 1;
        L7:
            return new Value(key, 26, 0, r1);
        L5:
            r1 = 0;
            goto L7
        }

        static Value blob(int key, int position, int type, int bitWidth) {
            return new Value(key, type, bitWidth, position);
        }

        static Value int8(int key, int value) {
            return new Value(key, 1, 0, value);
        }

        static Value int16(int key, int value) {
            return new Value(key, 1, 1, value);
        }

        static Value int32(int key, int value) {
            return new Value(key, 1, 2, value);
        }

        static Value int64(int key, long value) {
            return new Value(key, 1, 3, value);
        }

        static Value uInt8(int key, int value) {
            return new Value(key, 2, 0, value);
        }

        static Value uInt16(int key, int value) {
            return new Value(key, 2, 1, value);
        }

        static Value uInt32(int key, int value) {
            return new Value(key, 2, 2, value);
        }

        static Value uInt64(int key, long value) {
            return new Value(key, 2, 3, value);
        }

        static Value float32(int key, float value) {
            return new Value(key, 3, 2, value);
        }

        static Value float64(int key, double value) {
            return new Value(key, 3, 3, value);
        }

        private byte storedPackedType() {
            return storedPackedType(0);
        }

        private byte storedPackedType(int parentBitWidth) {
            return packedType(storedWidth(parentBitWidth), this.type);
        }

        private static byte packedType(int bitWidth, int type) {
            return (byte) ((type << 2) | bitWidth);
        }

        private int storedWidth(int parentBitWidth) {
            boolean r0 = FlexBuffers.isTypeInline(this.type);
            int r1 = this.minBitWidth;
            if (r0 == true) goto L5;
            return r1;
        L5:
            return Math.max(r1, parentBitWidth);
        }

        private int elemWidth(int bufSize, int elemIndex) {
            return elemWidth(this.type, this.minBitWidth, this.iValue, bufSize, elemIndex);
        }

        private static int elemWidth(int type, int minBitWidth, long iValue, int bufSize, int elemIndex) {
            if (FlexBuffers.isTypeInline(type) == false) goto L5;
            return minBitWidth;
        L5:
            int byteWidth = 1;
        L7:
            if (byteWidth > 32) goto L13;
            int offsetLoc = (paddingBytes(bufSize, byteWidth) + bufSize) + (elemIndex * byteWidth);
            long offset = ((long) offsetLoc) - iValue;
            int bitWidth = FlexBuffersBuilder.widthUInBits((int) offset);
            if ((1 << bitWidth) == byteWidth) goto L10;
            byteWidth = byteWidth * 2;
            goto L7
        L10:
            return bitWidth;
        L13:
            throw new AssertionError();
        }

        private static int paddingBytes(int bufSize, int scalarSize) {
            return ((~bufSize) + 1) & (scalarSize - 1);
        }
    }

    static {
    }

    static /* synthetic */ ReadWriteBuf access$000(FlexBuffersBuilder x0) {
        return x0.bb;
    }

    public FlexBuffersBuilder(int bufSize) {
        this(new ArrayReadWriteBuf(bufSize), 1);
    }

    public FlexBuffersBuilder() {
        this(256);
    }

    @Deprecated
    public FlexBuffersBuilder(ByteBuffer bb, int flags) {
        this(new ArrayReadWriteBuf(bb.array()), flags);
    }

    public FlexBuffersBuilder(ReadWriteBuf bb, int flags) {
        this.stack = new ArrayList();
        this.keyPool = new HashMap();
        this.stringPool = new HashMap();
        this.finished = false;
        this.keyComparator = new AnonymousClass1(this);
        this.bb = bb;
        this.flags = flags;
    }

    public FlexBuffersBuilder(ByteBuffer bb) {
        this(bb, 1);
    }

    public ReadWriteBuf getBuffer() {
        if (this.finished == false) goto L7;
        return this.bb;
    L7:
        throw new AssertionError();
    }

    public void putBoolean(boolean val) {
        putBoolean(null, val);
    }

    public void putBoolean(String key, boolean val) {
        this.stack.add(Value.bool(putKey(key), val));
    }

    private int putKey(String key) {
        if (key != null) goto L5;
        return -1;
    L5:
        int pos = this.bb.writePosition();
        if ((this.flags & 1) == 0) goto L12;
        Integer keyFromPool = this.keyPool.get(key);
        if (keyFromPool != null) goto L14;
        byte[] keyBytes = key.getBytes(StandardCharsets.UTF_8);
        this.bb.put(keyBytes, 0, keyBytes.length);
        this.bb.put((byte) 0);
        this.keyPool.put(key, Integer.valueOf(pos));
        return pos;
    L14:
        return keyFromPool.intValue();
    L12:
        byte[] keyBytes2 = key.getBytes(StandardCharsets.UTF_8);
        this.bb.put(keyBytes2, 0, keyBytes2.length);
        this.bb.put((byte) 0);
        this.keyPool.put(key, Integer.valueOf(pos));
        return pos;
    }

    public void putInt(int val) {
        putInt(null, val);
    }

    public void putInt(String key, int val) {
        putInt(key, val);
    }

    public void putInt(String key, long val) {
        int iKey = putKey(key);
        if ((-128) > val) goto L8;
        if (val > 127) goto L8;
        this.stack.add(Value.int8(iKey, (int) val));
        return;
    L8:
        if ((-32768) > val) goto L13;
        if (val > 32767) goto L13;
        this.stack.add(Value.int16(iKey, (int) val));
        return;
    L13:
        if (SieveCacheKt.NodeMetaAndPreviousMask <= val) goto L15;
    L17:
        this.stack.add(Value.int64(iKey, val));
        return;
    L15:
        if (val > SieveCacheKt.NodeLinkMask) goto L17;
        this.stack.add(Value.int32(iKey, (int) val));
    }

    public void putInt(long value) {
        putInt(null, value);
    }

    public void putUInt(int value) {
        putUInt(null, value);
    }

    public void putUInt(long value) {
        putUInt(null, value);
    }

    public void putUInt64(BigInteger value) {
        putUInt64(null, value.longValue());
    }

    private void putUInt64(String key, long value) {
        this.stack.add(Value.uInt64(putKey(key), value));
    }

    private void putUInt(String key, long value) {
        int iKey = putKey(key);
        int width = widthUInBits(value);
        if (width != 0) goto L6;
        Value vVal = Value.uInt8(iKey, (int) value);
    L12:
        this.stack.add(vVal);
        return;
    L6:
        if (width != 1) goto L9;
        vVal = Value.uInt16(iKey, (int) value);
        goto L12
    L9:
        if (width != 2) goto L11;
        vVal = Value.uInt32(iKey, (int) value);
        goto L12
    L11:
        vVal = Value.uInt64(iKey, value);
        goto L12
    }

    public void putFloat(float value) {
        putFloat(null, value);
    }

    public void putFloat(String key, float val) {
        this.stack.add(Value.float32(putKey(key), val));
    }

    public void putFloat(double value) {
        putFloat(null, value);
    }

    public void putFloat(String key, double val) {
        this.stack.add(Value.float64(putKey(key), val));
    }

    public int putString(String value) {
        return putString(null, value);
    }

    public int putString(String key, String val) {
        int iKey = putKey(key);
        if ((this.flags & 2) == 0) goto L10;
        Integer i = this.stringPool.get(val);
        if (i != null) goto L8;
        Value value = writeString(iKey, val);
        this.stringPool.put(val, Integer.valueOf((int) value.iValue));
        this.stack.add(value);
        return (int) value.iValue;
    L8:
        int bitWidth = widthUInBits(val.length());
        this.stack.add(Value.blob(iKey, i.intValue(), 5, bitWidth));
        return i.intValue();
    L10:
        Value value2 = writeString(iKey, val);
        this.stack.add(value2);
        return (int) value2.iValue;
    }

    private Value writeString(int key, String s) {
        return writeBlob(key, s.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    static int widthUInBits(long len) {
        if (len > FlexBuffers.Unsigned.byteToUnsignedInt((byte) -1)) goto L7;
        return 0;
    L7:
        if (len > FlexBuffers.Unsigned.shortToUnsignedInt(-1)) goto L11;
        return 1;
    L11:
        if (len > FlexBuffers.Unsigned.intToUnsignedLong(-1)) goto L14;
        return 2;
    L14:
        return 3;
    }

    private Value writeBlob(int key, byte[] blob, int type, boolean trailing) {
        int bitWidth = widthUInBits(blob.length);
        int byteWidth = align(bitWidth);
        writeInt(blob.length, byteWidth);
        int sloc = this.bb.writePosition();
        this.bb.put(blob, 0, blob.length);
        if (trailing == false) goto L6;
        this.bb.put((byte) 0);
    L6:
        return Value.blob(key, sloc, type, bitWidth);
    }

    private int align(int alignment) {
        int byteWidth = 1 << alignment;
        int padBytes = Value.access$100(this.bb.writePosition(), byteWidth);
    L3:
        int padBytes2 = padBytes - 1;
        if (padBytes == 0) goto L6;
        this.bb.put((byte) 0);
        padBytes = padBytes2;
        goto L3
    L6:
        return byteWidth;
    }

    private void writeInt(long value, int byteWidth) {
        switch(byteWidth) {
            case 1: goto L7;
            case 2: goto L6;
            case 4: goto L5;
            case 8: goto L4;
            default: goto L12;
        };
    L4:
        this.bb.putLong(value);
        return;
    L5:
        this.bb.putInt((int) value);
        return;
    L6:
        this.bb.putShort((short) value);
        return;
    L7:
        this.bb.put((byte) value);
        return;
    }

    public int putBlob(byte[] value) {
        return putBlob(null, value);
    }

    public int putBlob(String key, byte[] val) {
        int iKey = putKey(key);
        Value value = writeBlob(iKey, val, 25, false);
        this.stack.add(value);
        return (int) value.iValue;
    }

    public int startVector() {
        return this.stack.size();
    }

    public int endVector(String key, int start, boolean typed, boolean fixed) {
        int iKey = putKey(key);
        Value vec = createVector(iKey, start, this.stack.size() - start, typed, fixed, null);
    L3:
        int r10 = this.stack.size();
        ArrayList<Value> r11 = this.stack;
        if (r10 <= start) goto L6;
        r11.remove(this.stack.size() - 1);
        goto L3
    L6:
        r11.add(vec);
        return (int) vec.iValue;
    }

    public ByteBuffer finish() {
        if (this.stack.size() != 1) goto L7;
        int byteWidth = align(Value.access$200(this.stack.get(0), this.bb.writePosition(), 0));
        writeAny(this.stack.get(0), byteWidth);
        this.bb.put(Value.access$300(this.stack.get(0)));
        this.bb.put((byte) byteWidth);
        this.finished = true;
        return ByteBuffer.wrap(this.bb.data(), 0, this.bb.writePosition());
    L7:
        throw new AssertionError();
    }

    private Value createVector(int key, int start, int length, boolean typed, boolean fixed, Value keys) {
        if (fixed == false) goto L8;
        if (typed == true) goto L8;
        throw new AssertionError();
    L8:
        int r3 = 0;
        int bitWidth = Math.max(0, widthUInBits(length));
        int prefixElems = 1;
        if (keys == null) goto L11;
        bitWidth = Math.max(bitWidth, Value.access$200(keys, this.bb.writePosition(), 0));
        prefixElems = 1 + 2;
    L11:
        int vectorType = 4;
        int i = start;
        int bitWidth2 = bitWidth;
    L13:
        if (i >= this.stack.size()) goto L31;
        int elemWidth = Value.access$200(this.stack.get(i), this.bb.writePosition(), i + prefixElems);
        bitWidth2 = Math.max(bitWidth2, elemWidth);
        if (typed == false) goto L29;
        if (i != start) goto L24;
        vectorType = this.stack.get(i).type;
        if (FlexBuffers.isTypedVectorElementType(vectorType) == true) goto L29;
        throw new FlexBuffers.FlexBufferException("TypedVector does not support this element type");
    L24:
        if (vectorType == this.stack.get(i).type) goto L29;
        throw new AssertionError();
    L29:
        i = i + 1;
        goto L13
    L31:
        if (fixed == true) goto L33;
    L37:
        int byteWidth = align(bitWidth2);
        if (keys == null) goto L40;
        writeOffset(keys.iValue, byteWidth);
        writeInt(1 << keys.minBitWidth, byteWidth);
    L40:
        if (fixed == true) goto L42;
        writeInt(length, byteWidth);
    L42:
        int vloc = this.bb.writePosition();
        int i2 = start;
    L44:
        if (i2 >= this.stack.size()) goto L46;
        writeAny(this.stack.get(i2), byteWidth);
        i2 = i2 + 1;
        goto L44
    L46:
        if (typed == true) goto L52;
        int i3 = start;
    L49:
        if (i3 >= this.stack.size()) goto L52;
        this.bb.put(Value.access$400(this.stack.get(i3), bitWidth2));
        i3 = i3 + 1;
    L52:
        if (keys == null) goto L54;
        int r9 = 9;
    L61:
        return new Value(key, r9, bitWidth2, vloc);
    L54:
        if (typed == false) goto L58;
        if (fixed == false) goto L57;
        r3 = length;
    L57:
        int r4 = FlexBuffers.toTypedVector(vectorType, r3);
    L59:
        r9 = r4;
        goto L61
    L58:
        r4 = 10;
        goto L59
    L33:
        if (FlexBuffers.isTypedVectorElementType(vectorType) == true) goto L37;
        throw new AssertionError();
    }

    private void writeOffset(long val, int byteWidth) {
        int reloff = (int) (((long) this.bb.writePosition()) - val);
        if (byteWidth != 8) goto L5;
    L9:
        writeInt(reloff, byteWidth);
        return;
    L5:
        if (reloff < (1 << (byteWidth * 8))) goto L9;
        throw new AssertionError();
    }

    private void writeAny(Value val, int byteWidth) {
        switch(val.type) {
            case 0: goto L6;
            case 1: goto L6;
            case 2: goto L6;
            case 3: goto L5;
            case 26: goto L6;
            default: goto L4;
        };
    L4:
        writeOffset(val.iValue, byteWidth);
        return;
    L5:
        writeDouble(val.dValue, byteWidth);
        return;
    L6:
        writeInt(val.iValue, byteWidth);
    }

    private void writeDouble(double val, int byteWidth) {
        if (byteWidth != 4) goto L6;
        this.bb.putFloat((float) val);
        return;
    L6:
        if (byteWidth != 8) goto L10;
        this.bb.putDouble(val);
        return;
    }

    public int startMap() {
        return this.stack.size();
    }

    public int endMap(String key, int start) {
        int iKey = putKey(key);
        Collections.sort(this.stack.subList(start, this.stack.size()), this.keyComparator);
        Value keys = createKeyVector(start, this.stack.size() - start);
        Value vec = createVector(iKey, start, this.stack.size() - start, false, false, keys);
    L3:
        int r0 = this.stack.size();
        ArrayList<Value> r3 = this.stack;
        if (r0 <= start) goto L6;
        r3.remove(this.stack.size() - 1);
        goto L3
    L6:
        r3.add(vec);
        return (int) vec.iValue;
    }

    private Value createKeyVector(int start, int length) {
        int bitWidth = Math.max(0, widthUInBits(length));
        int i = start;
        int bitWidth2 = bitWidth;
    L4:
        if (i >= this.stack.size()) goto L6;
        int elemWidth = Value.access$500(4, 0, this.stack.get(i).key, this.bb.writePosition(), i + 1);
        bitWidth2 = Math.max(bitWidth2, elemWidth);
        i = i + 1;
        goto L4
    L6:
        int byteWidth = align(bitWidth2);
        writeInt(length, byteWidth);
        int vloc = this.bb.writePosition();
        int i2 = start;
    L8:
        if (i2 >= this.stack.size()) goto L15;
        int pos = this.stack.get(i2).key;
        if (pos == (-1)) goto L13;
        writeOffset(this.stack.get(i2).key, byteWidth);
        i2 = i2 + 1;
        goto L8
    L13:
        throw new AssertionError();
    L15:
        return new Value(-1, FlexBuffers.toTypedVector(4, 0), bitWidth2, vloc);
    }
}
