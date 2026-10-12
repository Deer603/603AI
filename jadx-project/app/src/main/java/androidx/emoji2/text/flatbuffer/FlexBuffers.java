package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import kotlin.UByte;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public class FlexBuffers {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final ReadBuf EMPTY_BB = null;
    public static final int FBT_BLOB = 25;
    public static final int FBT_BOOL = 26;
    public static final int FBT_FLOAT = 3;
    public static final int FBT_INDIRECT_FLOAT = 8;
    public static final int FBT_INDIRECT_INT = 6;
    public static final int FBT_INDIRECT_UINT = 7;
    public static final int FBT_INT = 1;
    public static final int FBT_KEY = 4;
    public static final int FBT_MAP = 9;
    public static final int FBT_NULL = 0;
    public static final int FBT_STRING = 5;
    public static final int FBT_UINT = 2;
    public static final int FBT_VECTOR = 10;
    public static final int FBT_VECTOR_BOOL = 36;
    public static final int FBT_VECTOR_FLOAT = 13;
    public static final int FBT_VECTOR_FLOAT2 = 18;
    public static final int FBT_VECTOR_FLOAT3 = 21;
    public static final int FBT_VECTOR_FLOAT4 = 24;
    public static final int FBT_VECTOR_INT = 11;
    public static final int FBT_VECTOR_INT2 = 16;
    public static final int FBT_VECTOR_INT3 = 19;
    public static final int FBT_VECTOR_INT4 = 22;
    public static final int FBT_VECTOR_KEY = 14;
    public static final int FBT_VECTOR_STRING_DEPRECATED = 15;
    public static final int FBT_VECTOR_UINT = 12;
    public static final int FBT_VECTOR_UINT2 = 17;
    public static final int FBT_VECTOR_UINT3 = 20;
    public static final int FBT_VECTOR_UINT4 = 23;

    public static class Blob extends Sized {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final Blob EMPTY = null;

        static {
            EMPTY = new Blob(FlexBuffers.access$000(), 1, 1);
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        Blob(ReadBuf buff, int end, int byteWidth) {
            super(buff, end, byteWidth);
        }

        public static Blob empty() {
            return EMPTY;
        }

        public ByteBuffer data() {
            ByteBuffer dup = ByteBuffer.wrap(this.bb.data());
            dup.position(this.end);
            dup.limit(this.end + size());
            return dup.asReadOnlyBuffer().slice();
        }

        public byte[] getBytes() {
            int size = size();
            byte[] result = new byte[size];
            int i = 0;
        L3:
            if (i >= size) goto L5;
            result[i] = this.bb.get(this.end + i);
            i = i + 1;
            goto L3
        L5:
            return result;
        }

        public byte get(int pos) {
            if (pos < 0) goto L8;
            if (pos > size()) goto L8;
            return this.bb.get(this.end + pos);
        L8:
            throw new AssertionError();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public String toString() {
            return this.bb.getString(this.end, size());
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append(Typography.quote);
            sb.append(this.bb.getString(this.end, size()));
            return sb.append(Typography.quote);
        }
    }

    public static class FlexBufferException extends RuntimeException {
        FlexBufferException(String msg) {
            super(msg);
        }
    }

    public static class Key extends Object {
        private static final Key EMPTY = null;

        static /* synthetic */ Key access$700() {
            return EMPTY;
        }

        static {
            EMPTY = new Key(FlexBuffers.access$000(), 0, 0);
        }

        Key(ReadBuf buff, int end, int byteWidth) {
            super(buff, end, byteWidth);
        }

        public static Key empty() {
            return EMPTY;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            return sb.append(toString());
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public String toString() {
            int i = this.end;
        L4:
            if (this.bb.get(i) == 0) goto L5;
            i = i + 1;
            goto L4
        L5:
            int size = i - this.end;
            return this.bb.getString(this.end, size);
        }

        int compareTo(byte[] other) {
            int ia = this.end;
            int io = 0;
        L3:
            byte c1 = this.bb.get(ia);
            byte c2 = other[io];
            if (c1 == 0) goto L6;
            ia = ia + 1;
            io = io + 1;
            if (io == other.length) goto L10;
            if (c1 == c2) goto L3;
            return c1 - c2;
        L10:
            return c1 - c2;
        L6:
            return c1 - c2;
        }

        public boolean equals(java.lang.Object obj) {
            if ((obj instanceof Key) == true) goto L6;
            return false;
        L6:
            if (((Key) obj).end == this.end) goto L8;
            return false;
        L8:
            if (((Key) obj).byteWidth != this.byteWidth) goto L12;
            return true;
        L12:
            return false;
        }

        public int hashCode() {
            return this.end ^ this.byteWidth;
        }
    }

    public static class KeyVector {
        private final TypedVector vec;

        KeyVector(TypedVector vec) {
            this.vec = vec;
        }

        public Key get(int pos) {
            int len = size();
            if (pos >= len) goto L5;
            int childPos = this.vec.end + (this.vec.byteWidth * pos);
            return new Key(this.vec.bb, FlexBuffers.access$200(this.vec.bb, childPos, this.vec.byteWidth), 1);
        L5:
            return Key.access$700();
        }

        public int size() {
            return this.vec.size();
        }

        public String toString() {
            StringBuilder b = new StringBuilder();
            b.append('[');
            int i = 0;
        L4:
            if (i >= this.vec.size()) goto L10;
            this.vec.get(i).toString(b);
            if (i == (this.vec.size() - 1)) goto L8;
            b.append(", ");
        L8:
            i = i + 1;
            goto L4
        L10:
            return b.append("]").toString();
        }
    }

    public static class Map extends Vector {
        private static final Map EMPTY_MAP = null;

        static {
            EMPTY_MAP = new Map(FlexBuffers.access$000(), 1, 1);
        }

        Map(ReadBuf bb, int end, int byteWidth) {
            super(bb, end, byteWidth);
        }

        public static Map empty() {
            return EMPTY_MAP;
        }

        public Reference get(String key) {
            return get(key.getBytes(StandardCharsets.UTF_8));
        }

        public Reference get(byte[] key) {
            KeyVector keys = keys();
            int size = keys.size();
            int index = binarySearch(keys, key);
            if (index < 0) goto L8;
            if (index >= size) goto L8;
            return get(index);
        L8:
            return Reference.access$600();
        }

        public KeyVector keys() {
            int keysOffset = this.end - (this.byteWidth * 3);
            return new KeyVector(new TypedVector(this.bb, FlexBuffers.access$200(this.bb, keysOffset, this.byteWidth), FlexBuffers.access$100(this.bb, this.byteWidth + keysOffset, this.byteWidth), 4));
        }

        public Vector values() {
            return new Vector(this.bb, this.end, this.byteWidth);
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector, androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder builder) {
            builder.append("{ ");
            KeyVector keys = keys();
            int size = size();
            Vector vals = values();
            int i = 0;
        L3:
            if (i >= size) goto L8;
            builder.append(Typography.quote).append(keys.get(i).toString()).append("\" : ");
            builder.append(vals.get(i).toString());
            if (i == (size - 1)) goto L7;
            builder.append(", ");
        L7:
            i = i + 1;
            goto L3
        L8:
            builder.append(" }");
            return builder;
        }

        private int binarySearch(KeyVector keys, byte[] searchedKey) {
            int low = 0;
            int high = keys.size() - 1;
        L3:
            if (low > high) goto L12;
            int mid = (low + high) >>> 1;
            Key k = keys.get(mid);
            int cmp = k.compareTo(searchedKey);
            if (cmp < 0) goto L6;
            if (cmp <= 0) goto L10;
            high = mid - 1;
            goto L3
        L10:
            return mid;
        L6:
            low = mid + 1;
            goto L3
        L12:
            return -(low + 1);
        }
    }

    private static abstract class Object {
        ReadBuf bb;
        int byteWidth;
        int end;

        public abstract StringBuilder toString(StringBuilder r1);

        Object(ReadBuf buff, int end, int byteWidth) {
            this.bb = buff;
            this.end = end;
            this.byteWidth = byteWidth;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }
    }

    public static class Reference {
        private static final Reference NULL_REFERENCE = null;
        private ReadBuf bb;
        private int byteWidth;
        private int end;
        private int parentWidth;
        private int type;

        static /* synthetic */ Reference access$600() {
            return NULL_REFERENCE;
        }

        static {
            NULL_REFERENCE = new Reference(FlexBuffers.access$000(), 0, 1, 0);
        }

        Reference(ReadBuf bb, int end, int parentWidth, int packedType) {
            this(bb, end, parentWidth, 1 << (packedType & 3), packedType >> 2);
        }

        Reference(ReadBuf bb, int end, int parentWidth, int byteWidth, int type) {
            this.bb = bb;
            this.end = end;
            this.parentWidth = parentWidth;
            this.byteWidth = byteWidth;
            this.type = type;
        }

        public int getType() {
            return this.type;
        }

        public boolean isNull() {
            if (this.type != 0) goto L5;
            return true;
        L5:
            return false;
        }

        public boolean isBoolean() {
            if (this.type != 26) goto L5;
            return true;
        L5:
            return false;
        }

        public boolean isNumeric() {
            if (isIntOrUInt() == false) goto L5;
        L8:
            return true;
        L5:
            if (isFloat() == true) goto L8;
            return false;
        }

        public boolean isIntOrUInt() {
            if (isInt() == false) goto L5;
        L8:
            return true;
        L5:
            if (isUInt() == true) goto L8;
            return false;
        }

        public boolean isFloat() {
            if (this.type != 3) goto L5;
        L8:
            return true;
        L5:
            if (this.type == 8) goto L8;
            return false;
        }

        public boolean isInt() {
            if (this.type != 1) goto L5;
            return true;
        L5:
            if (this.type == 6) goto L10;
            return false;
        L10:
            return true;
        }

        public boolean isUInt() {
            if (this.type != 2) goto L5;
        L8:
            return true;
        L5:
            if (this.type == 7) goto L8;
            return false;
        }

        public boolean isString() {
            if (this.type != 5) goto L5;
            return true;
        L5:
            return false;
        }

        public boolean isKey() {
            if (this.type != 4) goto L5;
            return true;
        L5:
            return false;
        }

        public boolean isVector() {
            if (this.type != 10) goto L5;
        L8:
            return true;
        L5:
            if (this.type == 9) goto L8;
            return false;
        }

        public boolean isTypedVector() {
            return FlexBuffers.isTypedVector(this.type);
        }

        public boolean isMap() {
            if (this.type != 9) goto L5;
            return true;
        L5:
            return false;
        }

        public boolean isBlob() {
            if (this.type != 25) goto L5;
            return true;
        L5:
            return false;
        }

        public int asInt() {
            if (this.type != 1) goto L7;
            return FlexBuffers.access$100(this.bb, this.end, this.parentWidth);
        L7:
            switch(this.type) {
                case 0: goto L25;
                case 2: goto L24;
                case 3: goto L22;
                case 5: goto L20;
                case 6: goto L18;
                case 7: goto L16;
                case 8: goto L14;
                case 10: goto L12;
                case 26: goto L10;
                default: goto L8;
            };
        L8:
            return 0;
        L25:
            return 0;
        L10:
            return FlexBuffers.access$100(this.bb, this.end, this.parentWidth);
        L12:
            return asVector().size();
        L14:
            return (int) FlexBuffers.access$400(this.bb, FlexBuffers.access$200(this.bb, this.end, this.parentWidth), this.byteWidth);
        L16:
            return (int) FlexBuffers.access$300(this.bb, FlexBuffers.access$200(this.bb, this.end, this.parentWidth), this.parentWidth);
        L18:
            return FlexBuffers.access$100(this.bb, FlexBuffers.access$200(this.bb, this.end, this.parentWidth), this.byteWidth);
        L20:
            return Integer.parseInt(asString());
        L22:
            return (int) FlexBuffers.access$400(this.bb, this.end, this.parentWidth);
        L24:
            return (int) FlexBuffers.access$300(this.bb, this.end, this.parentWidth);
        }

        public long asUInt() {
            if (this.type != 2) goto L7;
            return FlexBuffers.access$300(this.bb, this.end, this.parentWidth);
        L7:
            switch(this.type) {
                case 0: goto L25;
                case 1: goto L24;
                case 3: goto L22;
                case 5: goto L20;
                case 6: goto L18;
                case 7: goto L16;
                case 8: goto L14;
                case 10: goto L12;
                case 26: goto L10;
                default: goto L8;
            };
        L8:
            return 0;
        L25:
            return 0;
        L10:
            return FlexBuffers.access$100(this.bb, this.end, this.parentWidth);
        L12:
            return asVector().size();
        L14:
            return (long) FlexBuffers.access$400(this.bb, FlexBuffers.access$200(this.bb, this.end, this.parentWidth), this.parentWidth);
        L16:
            return FlexBuffers.access$300(this.bb, FlexBuffers.access$200(this.bb, this.end, this.parentWidth), this.byteWidth);
        L18:
            return FlexBuffers.access$500(this.bb, FlexBuffers.access$200(this.bb, this.end, this.parentWidth), this.byteWidth);
        L20:
            return Long.parseLong(asString());
        L22:
            return (long) FlexBuffers.access$400(this.bb, this.end, this.parentWidth);
        L24:
            return FlexBuffers.access$500(this.bb, this.end, this.parentWidth);
        }

        public long asLong() {
            if (this.type != 1) goto L7;
            return FlexBuffers.access$500(this.bb, this.end, this.parentWidth);
        L7:
            switch(this.type) {
                case 0: goto L27;
                case 2: goto L26;
                case 3: goto L24;
                case 5: goto L28;
                case 6: goto L18;
                case 7: goto L16;
                case 8: goto L14;
                case 10: goto L12;
                case 26: goto L10;
                default: goto L8;
            };
        L8:
            return 0;
        L27:
            return 0;
        L28:
            return Long.parseLong(asString());
        L22:
            return 0;
        L10:
            return FlexBuffers.access$100(this.bb, this.end, this.parentWidth);
        L12:
            return asVector().size();
        L14:
            return (long) FlexBuffers.access$400(this.bb, FlexBuffers.access$200(this.bb, this.end, this.parentWidth), this.byteWidth);
        L16:
            return FlexBuffers.access$300(this.bb, FlexBuffers.access$200(this.bb, this.end, this.parentWidth), this.parentWidth);
        L18:
            return FlexBuffers.access$500(this.bb, FlexBuffers.access$200(this.bb, this.end, this.parentWidth), this.byteWidth);
        L24:
            return (long) FlexBuffers.access$400(this.bb, this.end, this.parentWidth);
        L26:
            return FlexBuffers.access$300(this.bb, this.end, this.parentWidth);
        }

        public double asFloat() {
            if (this.type != 3) goto L7;
            return FlexBuffers.access$400(this.bb, this.end, this.parentWidth);
        L7:
            switch(this.type) {
                case 0: goto L23;
                case 1: goto L22;
                case 2: goto L20;
                case 5: goto L18;
                case 6: goto L16;
                case 7: goto L14;
                case 8: goto L12;
                case 10: goto L10;
                case 26: goto L20;
                default: goto L8;
            };
        L8:
            return 0.0d;
        L23:
            return 0.0d;
        L10:
            return asVector().size();
        L12:
            return FlexBuffers.access$400(this.bb, FlexBuffers.access$200(this.bb, this.end, this.parentWidth), this.byteWidth);
        L14:
            return FlexBuffers.access$300(this.bb, FlexBuffers.access$200(this.bb, this.end, this.parentWidth), this.byteWidth);
        L16:
            return FlexBuffers.access$100(this.bb, FlexBuffers.access$200(this.bb, this.end, this.parentWidth), this.byteWidth);
        L18:
            return Double.parseDouble(asString());
        L20:
            return FlexBuffers.access$300(this.bb, this.end, this.parentWidth);
        L22:
            return FlexBuffers.access$100(this.bb, this.end, this.parentWidth);
        }

        public Key asKey() {
            if (isKey() == false) goto L7;
            return new Key(this.bb, FlexBuffers.access$200(this.bb, this.end, this.parentWidth), this.byteWidth);
        L7:
            return Key.empty();
        }

        public String asString() {
            if (isString() == false) goto L7;
            int start = FlexBuffers.access$200(this.bb, this.end, this.parentWidth);
            int size = (int) FlexBuffers.access$300(this.bb, start - this.byteWidth, this.byteWidth);
            return this.bb.getString(start, size);
        L7:
            if (isKey() == false) goto L14;
            int start2 = FlexBuffers.access$200(this.bb, this.end, this.byteWidth);
            int i = start2;
        L10:
            if (this.bb.get(i) == 0) goto L12;
            i = i + 1;
            goto L10
        L12:
            return this.bb.getString(start2, i - start2);
        L14:
            return "";
        }

        public Map asMap() {
            if (isMap() == false) goto L7;
            return new Map(this.bb, FlexBuffers.access$200(this.bb, this.end, this.parentWidth), this.byteWidth);
        L7:
            return Map.empty();
        }

        public Vector asVector() {
            if (isVector() == false) goto L7;
            return new Vector(this.bb, FlexBuffers.access$200(this.bb, this.end, this.parentWidth), this.byteWidth);
        L7:
            if (this.type != 15) goto L11;
            return new TypedVector(this.bb, FlexBuffers.access$200(this.bb, this.end, this.parentWidth), this.byteWidth, 4);
        L11:
            if (FlexBuffers.isTypedVector(this.type) == false) goto L15;
            return new TypedVector(this.bb, FlexBuffers.access$200(this.bb, this.end, this.parentWidth), this.byteWidth, FlexBuffers.toTypedVectorElementType(this.type));
        L15:
            return Vector.empty();
        }

        public Blob asBlob() {
            if (isBlob() == true) goto L10;
            if (isString() == true) goto L10;
            return Blob.empty();
        L10:
            return new Blob(this.bb, FlexBuffers.access$200(this.bb, this.end, this.parentWidth), this.byteWidth);
        }

        public boolean asBoolean() {
            if (isBoolean() == false) goto L10;
            if (this.bb.get(this.end) == 0) goto L8;
            return true;
        L8:
            return false;
        L10:
            if (asUInt() == 0) goto L13;
            return true;
        L13:
            return false;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }

        StringBuilder toString(StringBuilder sb) {
            switch(this.type) {
                case 0: goto L28;
                case 1: goto L26;
                case 2: goto L24;
                case 3: goto L22;
                case 4: goto L20;
                case 5: goto L18;
                case 6: goto L26;
                case 7: goto L24;
                case 8: goto L22;
                case 9: goto L16;
                case 10: goto L14;
                case 11: goto L12;
                case 12: goto L12;
                case 13: goto L12;
                case 14: goto L12;
                case 15: goto L12;
                case 16: goto L10;
                case 17: goto L10;
                case 18: goto L10;
                case 19: goto L10;
                case 20: goto L10;
                case 21: goto L10;
                case 22: goto L10;
                case 23: goto L10;
                case 24: goto L10;
                case 25: goto L8;
                case 26: goto L6;
                case 27: goto L4;
                case 28: goto L4;
                case 29: goto L4;
                case 30: goto L4;
                case 31: goto L4;
                case 32: goto L4;
                case 33: goto L4;
                case 34: goto L4;
                case 35: goto L4;
                case 36: goto L12;
                default: goto L4;
            };
        L4:
            return sb;
        L6:
            return sb.append(asBoolean());
        L8:
            return asBlob().toString(sb);
        L10:
            throw new FlexBufferException("not_implemented:" + this.type);
        L12:
            return sb.append(asVector());
        L14:
            return asVector().toString(sb);
        L16:
            return asMap().toString(sb);
        L18:
            return sb.append(Typography.quote).append(asString()).append(Typography.quote);
        L20:
            return asKey().toString(sb.append(Typography.quote)).append(Typography.quote);
        L22:
            return sb.append(asFloat());
        L24:
            return sb.append(asUInt());
        L26:
            return sb.append(asLong());
        L28:
            return sb.append("null");
        }
    }

    private static abstract class Sized extends Object {
        protected final int size;

        Sized(ReadBuf buff, int end, int byteWidth) {
            super(buff, end, byteWidth);
            this.size = FlexBuffers.access$100(this.bb, end - byteWidth, byteWidth);
        }

        public int size() {
            return this.size;
        }
    }

    public static class TypedVector extends Vector {
        private static final TypedVector EMPTY_VECTOR = null;
        private final int elemType;

        static {
            EMPTY_VECTOR = new TypedVector(FlexBuffers.access$000(), 1, 1, 1);
        }

        TypedVector(ReadBuf bb, int end, int byteWidth, int elemType) {
            super(bb, end, byteWidth);
            this.elemType = elemType;
        }

        public static TypedVector empty() {
            return EMPTY_VECTOR;
        }

        public boolean isEmptyVector() {
            if (this != EMPTY_VECTOR) goto L5;
            return true;
        L5:
            return false;
        }

        public int getElemType() {
            return this.elemType;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector
        public Reference get(int pos) {
            int len = size();
            if (pos >= len) goto L5;
            int childPos = this.end + (this.byteWidth * pos);
            return new Reference(this.bb, childPos, this.byteWidth, 1, this.elemType);
        L5:
            return Reference.access$600();
        }
    }

    static class Unsigned {
        Unsigned() {
        }

        static int byteToUnsignedInt(byte x) {
            return x & UByte.MAX_VALUE;
        }

        static int shortToUnsignedInt(short x) {
            return 65535 & x;
        }

        static long intToUnsignedLong(int x) {
            return ((long) x) & 4294967295L;
        }
    }

    public static class Vector extends Sized {
        private static final Vector EMPTY_VECTOR = null;

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        static {
            EMPTY_VECTOR = new Vector(FlexBuffers.access$000(), 1, 1);
        }

        Vector(ReadBuf bb, int end, int byteWidth) {
            super(bb, end, byteWidth);
        }

        public static Vector empty() {
            return EMPTY_VECTOR;
        }

        public boolean isEmpty() {
            if (this != EMPTY_VECTOR) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append("[ ");
            int size = size();
            int i = 0;
        L3:
            if (i >= size) goto L8;
            get(i).toString(sb);
            if (i == (size - 1)) goto L7;
            sb.append(", ");
        L7:
            i = i + 1;
            goto L3
        L8:
            sb.append(" ]");
            return sb;
        }

        public Reference get(int index) {
            long len = size();
            if (index >= len) goto L5;
            int packedType = Unsigned.byteToUnsignedInt(this.bb.get((int) ((((long) this.end) + (((long) this.byteWidth) * len)) + ((long) index))));
            int obj_end = this.end + (this.byteWidth * index);
            return new Reference(this.bb, obj_end, this.byteWidth, packedType);
        L5:
            return Reference.access$600();
        }
    }

    static {
        EMPTY_BB = new ArrayReadWriteBuf(new byte[]{0}, 1);
    }

    public FlexBuffers() {
    }

    static /* synthetic */ ReadBuf access$000() {
        return EMPTY_BB;
    }

    static /* synthetic */ int access$100(ReadBuf x0, int x1, int x2) {
        return readInt(x0, x1, x2);
    }

    static /* synthetic */ int access$200(ReadBuf x0, int x1, int x2) {
        return indirect(x0, x1, x2);
    }

    static /* synthetic */ long access$300(ReadBuf x0, int x1, int x2) {
        return readUInt(x0, x1, x2);
    }

    static /* synthetic */ double access$400(ReadBuf x0, int x1, int x2) {
        return readDouble(x0, x1, x2);
    }

    static /* synthetic */ long access$500(ReadBuf x0, int x1, int x2) {
        return readLong(x0, x1, x2);
    }

    static boolean isTypedVector(int type) {
        if (type < 11) goto L7;
        if (type > 15) goto L7;
    L8:
        return true;
    L7:
        if (type == 36) goto L8;
        return false;
    }

    static boolean isTypeInline(int type) {
        if (type > 3) goto L5;
    L8:
        return true;
    L5:
        if (type == 26) goto L8;
        return false;
    }

    static int toTypedVectorElementType(int original_type) {
        return (original_type - 11) + 1;
    }

    static int toTypedVector(int type, int fixedLength) {
        if (isTypedVectorElementType(type) == false) goto L17;
        switch(fixedLength) {
            case 0: goto L13;
            case 1: goto L15;
            case 2: goto L11;
            case 3: goto L9;
            case 4: goto L7;
            default: goto L15;
        };
    L7:
        return (type - 1) + 22;
    L9:
        return (type - 1) + 19;
    L11:
        return (type - 1) + 16;
    L13:
        return (type - 1) + 11;
    L15:
        throw new AssertionError();
    L17:
        throw new AssertionError();
    }

    static boolean isTypedVectorElementType(int type) {
        if (type < 1) goto L7;
        if (type > 4) goto L7;
        return true;
    L7:
        if (type == 26) goto L12;
        return false;
    L12:
        return true;
    }

    private static int indirect(ReadBuf bb, int offset, int byteWidth) {
        return (int) (((long) offset) - readUInt(bb, offset, byteWidth));
    }

    private static long readUInt(ReadBuf buff, int end, int byteWidth) {
        switch(byteWidth) {
            case 1: goto L12;
            case 2: goto L10;
            case 4: goto L8;
            case 8: goto L6;
            default: goto L3;
        };
    L3:
        return -1;
    L6:
        return buff.getLong(end);
    L8:
        return Unsigned.intToUnsignedLong(buff.getInt(end));
    L10:
        return Unsigned.shortToUnsignedInt(buff.getShort(end));
    L12:
        return Unsigned.byteToUnsignedInt(buff.get(end));
    }

    private static int readInt(ReadBuf buff, int end, int byteWidth) {
        return (int) readLong(buff, end, byteWidth);
    }

    private static long readLong(ReadBuf buff, int end, int byteWidth) {
        switch(byteWidth) {
            case 1: goto L12;
            case 2: goto L10;
            case 4: goto L8;
            case 8: goto L6;
            default: goto L3;
        };
    L3:
        return -1;
    L6:
        return buff.getLong(end);
    L8:
        return buff.getInt(end);
    L10:
        return buff.getShort(end);
    L12:
        return buff.get(end);
    }

    private static double readDouble(ReadBuf buff, int end, int byteWidth) {
        switch(byteWidth) {
            case 4: goto L8;
            case 8: goto L6;
            default: goto L3;
        };
    L3:
        return -1.0d;
    L6:
        return buff.getDouble(end);
    L8:
        return buff.getFloat(end);
    }

    @Deprecated
    public static Reference getRoot(ByteBuffer buffer) {
        if (buffer.hasArray() == false) goto L5;
        ReadBuf r0 = new ArrayReadWriteBuf(buffer.array(), buffer.limit());
    L7:
        return getRoot(r0);
    L5:
        r0 = new ByteBufferReadWriteBuf(buffer);
        goto L7
    }

    public static Reference getRoot(ReadBuf buffer) {
        int end = buffer.limit() - 1;
        int byteWidth = buffer.get(end);
        int end2 = end - 1;
        int packetType = Unsigned.byteToUnsignedInt(buffer.get(end2));
        return new Reference(buffer, end2 - byteWidth, byteWidth, packetType);
    }
}
