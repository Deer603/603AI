package androidx.emoji2.text.flatbuffer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: loaded from: classes4.dex */
public class FlatBufferBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    ByteBuffer bb;
    ByteBufferFactory bb_factory;
    boolean finished;
    boolean force_defaults;
    int minalign;
    boolean nested;
    int num_vtables;
    int object_start;
    int space;
    final Utf8 utf8;
    int vector_num_elems;
    int[] vtable;
    int vtable_in_use;
    int[] vtables;

    static class ByteBufferBackedInputStream extends InputStream {
        ByteBuffer buf;

        public ByteBufferBackedInputStream(ByteBuffer buf) {
            this.buf = buf;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            return this.buf.get() & UByte.MAX_VALUE;
        L6:
            return -1;
        }
    }

    public static abstract class ByteBufferFactory {
        public abstract ByteBuffer newByteBuffer(int r1);

        public ByteBufferFactory() {
        }

        public void releaseByteBuffer(ByteBuffer bb) {
        }
    }

    public static final class HeapByteBufferFactory extends ByteBufferFactory {
        public static final HeapByteBufferFactory INSTANCE = null;

        public HeapByteBufferFactory() {
        }

        static {
            INSTANCE = new HeapByteBufferFactory();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory
        public ByteBuffer newByteBuffer(int capacity) {
            return ByteBuffer.allocate(capacity).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    static {
    }

    public FlatBufferBuilder(int initial_size, ByteBufferFactory bb_factory) {
        this(initial_size, bb_factory, null, Utf8.getDefault());
    }

    public FlatBufferBuilder(int initial_size, ByteBufferFactory bb_factory, ByteBuffer existing_bb, Utf8 utf8) {
        this.minalign = 1;
        this.vtable = null;
        this.vtable_in_use = 0;
        this.nested = false;
        this.finished = false;
        this.vtables = new int[16];
        this.num_vtables = 0;
        this.vector_num_elems = 0;
        this.force_defaults = false;
        if (initial_size > 0) goto L5;
        initial_size = 1;
    L5:
        this.bb_factory = bb_factory;
        if (existing_bb == null) goto L8;
        this.bb = existing_bb;
        this.bb.clear();
        this.bb.order(ByteOrder.LITTLE_ENDIAN);
    L9:
        this.utf8 = utf8;
        this.space = this.bb.capacity();
        return;
    L8:
        this.bb = bb_factory.newByteBuffer(initial_size);
        goto L9
    }

    public FlatBufferBuilder(int initial_size) {
        this(initial_size, HeapByteBufferFactory.INSTANCE, null, Utf8.getDefault());
    }

    public FlatBufferBuilder() {
        this(1024);
    }

    public FlatBufferBuilder(ByteBuffer existing_bb, ByteBufferFactory bb_factory) {
        this(existing_bb.capacity(), bb_factory, existing_bb, Utf8.getDefault());
    }

    public FlatBufferBuilder(ByteBuffer existing_bb) {
        this(existing_bb, new HeapByteBufferFactory());
    }

    public FlatBufferBuilder init(ByteBuffer existing_bb, ByteBufferFactory bb_factory) {
        this.bb_factory = bb_factory;
        this.bb = existing_bb;
        this.bb.clear();
        this.bb.order(ByteOrder.LITTLE_ENDIAN);
        this.minalign = 1;
        this.space = this.bb.capacity();
        this.vtable_in_use = 0;
        this.nested = false;
        this.finished = false;
        this.object_start = 0;
        this.num_vtables = 0;
        this.vector_num_elems = 0;
        return this;
    }

    public static boolean isFieldPresent(Table table, int offset) {
        if (table.__offset(offset) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public void clear() {
        this.space = this.bb.capacity();
        this.bb.clear();
        this.minalign = 1;
    L4:
        if (this.vtable_in_use <= 0) goto L6;
        int[] r1 = this.vtable;
        int r3 = this.vtable_in_use - 1;
        this.vtable_in_use = r3;
        r1[r3] = 0;
        goto L4
    L6:
        this.vtable_in_use = 0;
        this.nested = false;
        this.finished = false;
        this.object_start = 0;
        this.num_vtables = 0;
        this.vector_num_elems = 0;
    }

    static ByteBuffer growByteBuffer(ByteBuffer bb, ByteBufferFactory bb_factory) {
        int old_buf_size = bb.capacity();
        if (((-1073741824) & old_buf_size) != 0) goto L10;
        if (old_buf_size != 0) goto L6;
        int new_buf_size = 1;
    L7:
        bb.position(0);
        ByteBuffer nbb = bb_factory.newByteBuffer(new_buf_size);
        int new_buf_size2 = nbb.clear().capacity();
        nbb.position(new_buf_size2 - old_buf_size);
        nbb.put(bb);
        return nbb;
    L6:
        new_buf_size = old_buf_size << 1;
        goto L7
    L10:
        throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
    }

    public int offset() {
        return this.bb.capacity() - this.space;
    }

    public void pad(int byte_size) {
        int i = 0;
    L3:
        if (i >= byte_size) goto L5;
        ByteBuffer r1 = this.bb;
        int r2 = this.space - 1;
        this.space = r2;
        r1.put(r2, (byte) 0);
        i = i + 1;
        goto L3
    }

    public void prep(int size, int additional_bytes) {
        if (size <= this.minalign) goto L5;
        this.minalign = size;
    L5:
        int align_size = ((~((this.bb.capacity() - this.space) + additional_bytes)) + 1) & (size - 1);
    L7:
        if (this.space >= ((align_size + size) + additional_bytes)) goto L12;
        int old_buf_size = this.bb.capacity();
        ByteBuffer old = this.bb;
        this.bb = growByteBuffer(old, this.bb_factory);
        if (old == this.bb) goto L11;
        this.bb_factory.releaseByteBuffer(old);
    L11:
        this.space += this.bb.capacity() - old_buf_size;
        goto L7
    L12:
        pad(align_size);
    }

    public void putBoolean(boolean r4) {
        ByteBuffer r0 = this.bb;
        int r1 = this.space - 1;
        this.space = r1;
        r0.put(r1, r4 ? 1 : 0);
    }

    public void putByte(byte x) {
        ByteBuffer r0 = this.bb;
        int r1 = this.space - 1;
        this.space = r1;
        r0.put(r1, x);
    }

    public void putShort(short x) {
        ByteBuffer r0 = this.bb;
        int r1 = this.space - 2;
        this.space = r1;
        r0.putShort(r1, x);
    }

    public void putInt(int x) {
        ByteBuffer r0 = this.bb;
        int r1 = this.space - 4;
        this.space = r1;
        r0.putInt(r1, x);
    }

    public void putLong(long x) {
        ByteBuffer r0 = this.bb;
        int r1 = this.space - 8;
        this.space = r1;
        r0.putLong(r1, x);
    }

    public void putFloat(float x) {
        ByteBuffer r0 = this.bb;
        int r1 = this.space - 4;
        this.space = r1;
        r0.putFloat(r1, x);
    }

    public void putDouble(double x) {
        ByteBuffer r0 = this.bb;
        int r1 = this.space - 8;
        this.space = r1;
        r0.putDouble(r1, x);
    }

    public void addBoolean(boolean x) {
        prep(1, 0);
        putBoolean(x);
    }

    public void addByte(byte x) {
        prep(1, 0);
        putByte(x);
    }

    public void addShort(short x) {
        prep(2, 0);
        putShort(x);
    }

    public void addInt(int x) {
        prep(4, 0);
        putInt(x);
    }

    public void addLong(long x) {
        prep(8, 0);
        putLong(x);
    }

    public void addFloat(float x) {
        prep(4, 0);
        putFloat(x);
    }

    public void addDouble(double x) {
        prep(8, 0);
        putDouble(x);
    }

    public void addOffset(int off) {
        prep(4, 0);
        if (off > offset()) goto L7;
        putInt((offset() - off) + 4);
        return;
    L7:
        throw new AssertionError();
    }

    public void startVector(int elem_size, int num_elems, int alignment) {
        notNested();
        this.vector_num_elems = num_elems;
        prep(4, elem_size * num_elems);
        prep(alignment, elem_size * num_elems);
        this.nested = true;
    }

    public int endVector() {
        if (this.nested == false) goto L7;
        this.nested = false;
        putInt(this.vector_num_elems);
        return offset();
    L7:
        throw new AssertionError("FlatBuffers: endVector called without startVector");
    }

    public ByteBuffer createUnintializedVector(int elem_size, int num_elems, int alignment) {
        int length = elem_size * num_elems;
        startVector(elem_size, num_elems, alignment);
        ByteBuffer r1 = this.bb;
        int r2 = this.space - length;
        this.space = r2;
        r1.position(r2);
        ByteBuffer copy = this.bb.slice().order(ByteOrder.LITTLE_ENDIAN);
        copy.limit(length);
        return copy;
    }

    public int createVectorOfTables(int[] offsets) {
        notNested();
        startVector(4, offsets.length, 4);
        int i = offsets.length - 1;
    L3:
        if (i < 0) goto L5;
        addOffset(offsets[i]);
        i = i - 1;
        goto L3
    L5:
        int i2 = endVector();
        return i2;
    }

    public <T extends Table> int createSortedVectorOfTables(T obj, int[] offsets) {
        obj.sortTables(offsets, this.bb);
        return createVectorOfTables(offsets);
    }

    public int createString(CharSequence s) {
        int length = this.utf8.encodedLength(s);
        addByte((byte) 0);
        startVector(1, length, 1);
        ByteBuffer r1 = this.bb;
        int r2 = this.space - length;
        this.space = r2;
        r1.position(r2);
        this.utf8.encodeUtf8(s, this.bb);
        return endVector();
    }

    public int createString(ByteBuffer s) {
        int length = s.remaining();
        addByte((byte) 0);
        startVector(1, length, 1);
        ByteBuffer r1 = this.bb;
        int r2 = this.space - length;
        this.space = r2;
        r1.position(r2);
        this.bb.put(s);
        return endVector();
    }

    public int createByteVector(byte[] arr) {
        int length = arr.length;
        startVector(1, length, 1);
        ByteBuffer r1 = this.bb;
        int r2 = this.space - length;
        this.space = r2;
        r1.position(r2);
        this.bb.put(arr);
        return endVector();
    }

    public int createByteVector(byte[] arr, int offset, int length) {
        startVector(1, length, 1);
        ByteBuffer r0 = this.bb;
        int r1 = this.space - length;
        this.space = r1;
        r0.position(r1);
        this.bb.put(arr, offset, length);
        return endVector();
    }

    public int createByteVector(ByteBuffer byteBuffer) {
        int length = byteBuffer.remaining();
        startVector(1, length, 1);
        ByteBuffer r1 = this.bb;
        int r2 = this.space - length;
        this.space = r2;
        r1.position(r2);
        this.bb.put(byteBuffer);
        return endVector();
    }

    public void finished() {
        if (this.finished == false) goto L6;
        return;
    L6:
        throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
    }

    public void notNested() {
        if (this.nested == true) goto L6;
        return;
    L6:
        throw new AssertionError("FlatBuffers: object serialization must not be nested.");
    }

    public void Nested(int obj) {
        if (obj != offset()) goto L6;
        return;
    L6:
        throw new AssertionError("FlatBuffers: struct must be serialized inline.");
    }

    public void startTable(int numfields) {
        notNested();
        if (this.vtable != null) goto L5;
    L6:
        this.vtable = new int[numfields];
    L7:
        this.vtable_in_use = numfields;
        Arrays.fill(this.vtable, 0, this.vtable_in_use, 0);
        this.nested = true;
        this.object_start = offset();
        return;
    L5:
        if (this.vtable.length >= numfields) goto L7;
        goto L6
    }

    public void addBoolean(int o, boolean x, boolean d) {
        if (this.force_defaults == true) goto L5;
        if (x != d) goto L5;
        return;
    L5:
        addBoolean(x);
        slot(o);
    }

    public void addByte(int o, byte x, int d) {
        if (this.force_defaults == true) goto L5;
        if (x != d) goto L5;
        return;
    L5:
        addByte(x);
        slot(o);
    }

    public void addShort(int o, short x, int d) {
        if (this.force_defaults == true) goto L5;
        if (x != d) goto L5;
        return;
    L5:
        addShort(x);
        slot(o);
    }

    public void addInt(int o, int x, int d) {
        if (this.force_defaults == true) goto L5;
        if (x != d) goto L5;
        return;
    L5:
        addInt(x);
        slot(o);
    }

    public void addLong(int o, long x, long d) {
        if (this.force_defaults == false) goto L5;
    L6:
        addLong(x);
        slot(o);
        return;
    L5:
        if (x != d) goto L6;
    }

    public void addFloat(int o, float x, double d) {
        if (this.force_defaults == false) goto L5;
    L6:
        addFloat(x);
        slot(o);
        return;
    L5:
        if (x != d) goto L6;
    }

    public void addDouble(int o, double x, double d) {
        if (this.force_defaults == false) goto L5;
    L6:
        addDouble(x);
        slot(o);
        return;
    L5:
        if (x != d) goto L6;
    }

    public void addOffset(int o, int x, int d) {
        if (this.force_defaults == true) goto L5;
        if (x != d) goto L5;
        return;
    L5:
        addOffset(x);
        slot(o);
    }

    public void addStruct(int voffset, int x, int d) {
        if (x == d) goto L5;
        Nested(x);
        slot(voffset);
        return;
    }

    public void slot(int voffset) {
        this.vtable[voffset] = offset();
    }

    public int endTable() {
        if (this.vtable == null) goto L40;
        if (this.nested == false) goto L40;
        addInt(0);
        int vtableloc = offset();
        int i = this.vtable_in_use - 1;
    L7:
        if (i < 0) goto L11;
        if (this.vtable[i] != 0) goto L11;
        i = i - 1;
    L11:
        int trimmed_size = i + 1;
    L12:
        if (i < 0) goto L18;
        if (this.vtable[i] == 0) goto L16;
        int r4 = vtableloc - this.vtable[i];
    L17:
        short off = (short) r4;
        addShort(off);
        i = i - 1;
        goto L12
    L16:
        r4 = 0;
        goto L17
    L18:
        addShort((short) (vtableloc - this.object_start));
        addShort((short) ((trimmed_size + 2) * 2));
        int existing_vtable = 0;
        int i2 = 0;
    L20:
        if (i2 >= this.num_vtables) goto L31;
        int vt1 = this.bb.capacity() - this.vtables[i2];
        int vt2 = this.space;
        short len = this.bb.getShort(vt1);
        if (len != this.bb.getShort(vt2)) goto L30;
        int j = 2;
    L24:
        if (j >= len) goto L29;
        if (this.bb.getShort(vt1 + j) != this.bb.getShort(vt2 + j)) goto L30;
        j = j + 2;
        goto L24
    L29:
        existing_vtable = this.vtables[i2];
    L30:
        i2 = i2 + 1;
    L31:
        if (existing_vtable == 0) goto L34;
        this.space = this.bb.capacity() - vtableloc;
        this.bb.putInt(this.space, existing_vtable - vtableloc);
    L37:
        this.nested = false;
        return vtableloc;
    L34:
        if (this.num_vtables != this.vtables.length) goto L36;
        this.vtables = Arrays.copyOf(this.vtables, this.num_vtables * 2);
    L36:
        int[] r6 = this.vtables;
        int r7 = this.num_vtables;
        this.num_vtables = r7 + 1;
        r6[r7] = offset();
        this.bb.putInt(this.bb.capacity() - vtableloc, offset() - vtableloc);
    L40:
        throw new AssertionError("FlatBuffers: endTable called without startTable");
    }

    public void required(int table, int field) {
        int table_start = this.bb.capacity() - table;
        int vtable_start = table_start - this.bb.getInt(table_start);
        if (this.bb.getShort(vtable_start + field) == 0) goto L5;
        boolean ok = true;
    L6:
        if (ok == false) goto L9;
        return;
    L9:
        throw new AssertionError("FlatBuffers: field " + field + " must be set");
    L5:
        ok = false;
        goto L6
    }

    protected void finish(int root_table, boolean size_prefix) {
        int r0 = this.minalign;
        if (size_prefix == false) goto L5;
        int r2 = 4;
    L6:
        prep(r0, r2 + 4);
        addOffset(root_table);
        if (size_prefix == false) goto L9;
        addInt(this.bb.capacity() - this.space);
    L9:
        this.bb.position(this.space);
        this.finished = true;
        return;
    L5:
        r2 = 0;
        goto L6
    }

    public void finish(int root_table) {
        finish(root_table, false);
    }

    public void finishSizePrefixed(int root_table) {
        finish(root_table, true);
    }

    protected void finish(int root_table, String file_identifier, boolean size_prefix) {
        int r0 = this.minalign;
        if (size_prefix == false) goto L5;
        int r2 = 4;
    L6:
        prep(r0, r2 + 8);
        if (file_identifier.length() != 4) goto L14;
        int i = 3;
    L9:
        if (i < 0) goto L11;
        addByte((byte) file_identifier.charAt(i));
        i = i - 1;
        goto L9
    L11:
        finish(root_table, size_prefix);
        return;
    L14:
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    L5:
        r2 = 0;
        goto L6
    }

    public void finish(int root_table, String file_identifier) {
        finish(root_table, file_identifier, false);
    }

    public void finishSizePrefixed(int root_table, String file_identifier) {
        finish(root_table, file_identifier, true);
    }

    public FlatBufferBuilder forceDefaults(boolean forceDefaults) {
        this.force_defaults = forceDefaults;
        return this;
    }

    public ByteBuffer dataBuffer() {
        finished();
        return this.bb;
    }

    @Deprecated
    private int dataStart() {
        finished();
        return this.space;
    }

    public byte[] sizedByteArray(int start, int length) {
        finished();
        byte[] array = new byte[length];
        this.bb.position(start);
        this.bb.get(array);
        return array;
    }

    public byte[] sizedByteArray() {
        return sizedByteArray(this.space, this.bb.capacity() - this.space);
    }

    public InputStream sizedInputStream() {
        finished();
        ByteBuffer duplicate = this.bb.duplicate();
        duplicate.position(this.space);
        duplicate.limit(this.bb.capacity());
        return new ByteBufferBackedInputStream(duplicate);
    }
}
