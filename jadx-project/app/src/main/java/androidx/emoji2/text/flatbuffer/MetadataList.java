package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public final class MetadataList extends Table {

    public static final class Vector extends BaseVector {
        public Vector() {
        }

        public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) {
            __reset(_vector, _element_size, _bb);
            return this;
        }

        public MetadataList get(int j) {
            return get(new MetadataList(), j);
        }

        public MetadataList get(MetadataList obj, int j) {
            return obj.__assign(MetadataList.access$000(__element(j), this.bb), this.bb);
        }
    }

    public MetadataList() {
    }

    static /* synthetic */ int access$000(int x0, ByteBuffer x1) {
        return __indirect(x0, x1);
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_1_12_0();
    }

    public static MetadataList getRootAsMetadataList(ByteBuffer _bb) {
        return getRootAsMetadataList(_bb, new MetadataList());
    }

    public static MetadataList getRootAsMetadataList(ByteBuffer _bb, MetadataList obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb);
    }

    public void __init(int _i, ByteBuffer _bb) {
        __reset(_i, _bb);
    }

    public MetadataList __assign(int _i, ByteBuffer _bb) {
        __init(_i, _bb);
        return this;
    }

    public int version() {
        int o = __offset(4);
        if (o != 0) goto L7;
        return 0;
    L7:
        return this.bb.getInt(this.bb_pos + o);
    }

    public MetadataItem list(int j) {
        return list(new MetadataItem(), j);
    }

    public MetadataItem list(MetadataItem obj, int j) {
        int o = __offset(6);
        if (o != 0) goto L7;
        return null;
    L7:
        return obj.__assign(__indirect(__vector(o) + (j * 4)), this.bb);
    }

    public int listLength() {
        int o = __offset(6);
        if (o != 0) goto L7;
        return 0;
    L7:
        return __vector_len(o);
    }

    public MetadataItem.Vector listVector() {
        return listVector(new MetadataItem.Vector());
    }

    public MetadataItem.Vector listVector(MetadataItem.Vector obj) {
        int o = __offset(6);
        if (o != 0) goto L7;
        return null;
    L7:
        return obj.__assign(__vector(o), 4, this.bb);
    }

    public String sourceSha() {
        int o = __offset(8);
        if (o != 0) goto L7;
        return null;
    L7:
        return __string(this.bb_pos + o);
    }

    public ByteBuffer sourceShaAsByteBuffer() {
        return __vector_as_bytebuffer(8, 1);
    }

    public ByteBuffer sourceShaInByteBuffer(ByteBuffer _bb) {
        return __vector_in_bytebuffer(_bb, 8, 1);
    }

    public static int createMetadataList(FlatBufferBuilder builder, int version, int listOffset, int sourceShaOffset) {
        builder.startTable(3);
        addSourceSha(builder, sourceShaOffset);
        addList(builder, listOffset);
        addVersion(builder, version);
        return endMetadataList(builder);
    }

    public static void startMetadataList(FlatBufferBuilder builder) {
        builder.startTable(3);
    }

    public static void addVersion(FlatBufferBuilder builder, int version) {
        builder.addInt(0, version, 0);
    }

    public static void addList(FlatBufferBuilder builder, int listOffset) {
        builder.addOffset(1, listOffset, 0);
    }

    public static int createListVector(FlatBufferBuilder builder, int[] data) {
        builder.startVector(4, data.length, 4);
        int i = data.length - 1;
    L3:
        if (i < 0) goto L5;
        builder.addOffset(data[i]);
        i = i - 1;
        goto L3
    L5:
        int i2 = builder.endVector();
        return i2;
    }

    public static void startListVector(FlatBufferBuilder builder, int numElems) {
        builder.startVector(4, numElems, 4);
    }

    public static void addSourceSha(FlatBufferBuilder builder, int sourceShaOffset) {
        builder.addOffset(2, sourceShaOffset, 0);
    }

    public static int endMetadataList(FlatBufferBuilder builder) {
        int o = builder.endTable();
        return o;
    }

    public static void finishMetadataListBuffer(FlatBufferBuilder builder, int offset) {
        builder.finish(offset);
    }

    public static void finishSizePrefixedMetadataListBuffer(FlatBufferBuilder builder, int offset) {
        builder.finishSizePrefixed(offset);
    }
}
