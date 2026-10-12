package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class Table {
    protected ByteBuffer bb;
    protected int bb_pos;
    Utf8 utf8;
    private int vtable_size;
    private int vtable_start;

    public Table() {
        this.utf8 = Utf8.getDefault();
    }

    public ByteBuffer getByteBuffer() {
        return this.bb;
    }

    protected int __offset(int vtable_offset) {
        if (vtable_offset < this.vtable_size) goto L7;
        return 0;
    L7:
        return this.bb.getShort(this.vtable_start + vtable_offset);
    }

    protected static int __offset(int vtable_offset, int offset, ByteBuffer bb) {
        int vtable = bb.capacity() - offset;
        return bb.getShort((vtable + vtable_offset) - bb.getInt(vtable)) + vtable;
    }

    protected int __indirect(int offset) {
        return this.bb.getInt(offset) + offset;
    }

    protected static int __indirect(int offset, ByteBuffer bb) {
        return bb.getInt(offset) + offset;
    }

    protected String __string(int offset) {
        return __string(offset, this.bb, this.utf8);
    }

    protected static String __string(int offset, ByteBuffer bb, Utf8 utf8) {
        int offset2 = offset + bb.getInt(offset);
        int length = bb.getInt(offset2);
        return utf8.decodeUtf8(bb, offset2 + 4, length);
    }

    protected int __vector_len(int offset) {
        int offset2 = offset + this.bb_pos;
        int offset3 = offset2 + this.bb.getInt(offset2);
        return this.bb.getInt(offset3);
    }

    protected int __vector(int offset) {
        int offset2 = offset + this.bb_pos;
        return (this.bb.getInt(offset2) + offset2) + 4;
    }

    protected ByteBuffer __vector_as_bytebuffer(int vector_offset, int elem_size) {
        int o = __offset(vector_offset);
        if (o != 0) goto L6;
        return null;
    L6:
        ByteBuffer bb = this.bb.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int vectorstart = __vector(o);
        bb.position(vectorstart);
        bb.limit((__vector_len(o) * elem_size) + vectorstart);
        return bb;
    }

    protected ByteBuffer __vector_in_bytebuffer(ByteBuffer bb, int vector_offset, int elem_size) {
        int o = __offset(vector_offset);
        if (o != 0) goto L6;
        return null;
    L6:
        int vectorstart = __vector(o);
        bb.rewind();
        bb.limit((__vector_len(o) * elem_size) + vectorstart);
        bb.position(vectorstart);
        return bb;
    }

    protected Table __union(Table t, int offset) {
        return __union(t, offset, this.bb);
    }

    protected static Table __union(Table t, int offset, ByteBuffer bb) {
        t.__reset(__indirect(offset, bb), bb);
        return t;
    }

    protected static boolean __has_identifier(ByteBuffer bb, String ident) {
        if (ident.length() != 4) goto L14;
        int i = 0;
    L5:
        if (i >= 4) goto L11;
        if (ident.charAt(i) != ((char) bb.get((bb.position() + 4) + i))) goto L8;
        i = i + 1;
        goto L5
    L8:
        return false;
    L11:
        return true;
    L14:
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    protected void sortTables(int[] offsets, final ByteBuffer bb) {
        Integer[] off = new Integer[offsets.length];
        int i = 0;
    L4:
        if (i >= offsets.length) goto L6;
        off[i] = Integer.valueOf(offsets[i]);
        i = i + 1;
        goto L4
    L6:
        Arrays.sort(off, new AnonymousClass1(this, bb));
        int i2 = 0;
    L8:
        if (i2 >= offsets.length) goto L10;
        offsets[i2] = off[i2].intValue();
        i2 = i2 + 1;
        goto L8
    }

    protected int keysCompare(Integer o1, Integer o2, ByteBuffer bb) {
        return 0;
    }

    protected static int compareStrings(int offset_1, int offset_2, ByteBuffer bb) {
        int offset_3 = offset_1 + bb.getInt(offset_1);
        int offset_4 = offset_2 + bb.getInt(offset_2);
        int len_1 = bb.getInt(offset_3);
        int len_2 = bb.getInt(offset_4);
        int startPos_1 = offset_3 + 4;
        int startPos_2 = offset_4 + 4;
        int len = Math.min(len_1, len_2);
        int i = 0;
    L3:
        if (i >= len) goto L9;
        if (bb.get(i + startPos_1) != bb.get(i + startPos_2)) goto L7;
        i = i + 1;
        goto L3
    L7:
        return bb.get(i + startPos_1) - bb.get(i + startPos_2);
    L9:
        int i2 = len_1 - len_2;
        return i2;
    }

    protected static int compareStrings(int offset_1, byte[] key, ByteBuffer bb) {
        int offset_2 = offset_1 + bb.getInt(offset_1);
        int len_1 = bb.getInt(offset_2);
        int len_2 = key.length;
        int startPos_1 = offset_2 + 4;
        int len = Math.min(len_1, len_2);
        int i = 0;
    L3:
        if (i >= len) goto L9;
        if (bb.get(i + startPos_1) != key[i]) goto L7;
        i = i + 1;
        goto L3
    L7:
        return bb.get(i + startPos_1) - key[i];
    L9:
        int i2 = len_1 - len_2;
        return i2;
    }

    protected void __reset(int _i, ByteBuffer _bb) {
        this.bb = _bb;
        if (this.bb == null) goto L5;
        this.bb_pos = _i;
        this.vtable_start = this.bb_pos - this.bb.getInt(this.bb_pos);
        this.vtable_size = this.bb.getShort(this.vtable_start);
        return;
    L5:
        this.bb_pos = 0;
        this.vtable_start = 0;
        this.vtable_size = 0;
    }

    public void __reset() {
        __reset(0, null);
    }
}
