package androidx.emoji2.text;

import android.content.res.AssetManager;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
class MetadataListReader {
    private static final int EMJI_TAG = 1164798569;
    private static final int EMJI_TAG_DEPRECATED = 1701669481;
    private static final int META_TABLE_NAME = 1835365473;

    private static class ByteBufferReader implements OpenTypeReader {
        private final ByteBuffer mByteBuffer;

        ByteBufferReader(ByteBuffer byteBuffer) {
            this.mByteBuffer = byteBuffer;
            this.mByteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int readUnsignedShort() throws IOException {
            return MetadataListReader.toUnsignedShort(this.mByteBuffer.getShort());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long readUnsignedInt() throws IOException {
            return MetadataListReader.toUnsignedInt(this.mByteBuffer.getInt());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int readTag() throws IOException {
            return this.mByteBuffer.getInt();
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public void skip(int numOfBytes) throws IOException {
            this.mByteBuffer.position(this.mByteBuffer.position() + numOfBytes);
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long getPosition() {
            return this.mByteBuffer.position();
        }
    }

    private static class InputStreamOpenTypeReader implements OpenTypeReader {
        private final byte[] mByteArray;
        private final ByteBuffer mByteBuffer;
        private final InputStream mInputStream;
        private long mPosition;

        InputStreamOpenTypeReader(InputStream inputStream) {
            this.mPosition = 0;
            this.mInputStream = inputStream;
            this.mByteArray = new byte[4];
            this.mByteBuffer = ByteBuffer.wrap(this.mByteArray);
            this.mByteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int readUnsignedShort() throws IOException {
            this.mByteBuffer.position(0);
            read(2);
            return MetadataListReader.toUnsignedShort(this.mByteBuffer.getShort());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long readUnsignedInt() throws IOException {
            this.mByteBuffer.position(0);
            read(4);
            return MetadataListReader.toUnsignedInt(this.mByteBuffer.getInt());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int readTag() throws IOException {
            this.mByteBuffer.position(0);
            read(4);
            return this.mByteBuffer.getInt();
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public void skip(int numOfBytes) throws IOException {
        L2:
            if (numOfBytes <= 0) goto L8;
            int skipped = (int) this.mInputStream.skip(numOfBytes);
            if (skipped < 1) goto L7;
            numOfBytes = numOfBytes - skipped;
            this.mPosition += (long) skipped;
            goto L2
        L7:
            throw new IOException("Skip didn't move at least 1 byte forward");
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long getPosition() {
            return this.mPosition;
        }

        private void read(int numOfBytes) throws IOException {
            if (this.mInputStream.read(this.mByteArray, 0, numOfBytes) != numOfBytes) goto L7;
            this.mPosition += (long) numOfBytes;
            return;
        L7:
            throw new IOException("read failed");
        }
    }

    private static class OffsetInfo {
        private final long mLength;
        private final long mStartOffset;

        OffsetInfo(long startOffset, long length) {
            this.mStartOffset = startOffset;
            this.mLength = length;
        }

        long getStartOffset() {
            return this.mStartOffset;
        }

        long getLength() {
            return this.mLength;
        }
    }

    private interface OpenTypeReader {
        public static final int UINT16_BYTE_COUNT = 2;
        public static final int UINT32_BYTE_COUNT = 4;

        long getPosition();

        int readTag() throws IOException;

        long readUnsignedInt() throws IOException;

        int readUnsignedShort() throws IOException;

        void skip(int r1) throws IOException;
    }

    static MetadataList read(InputStream inputStream) throws IOException {
        OpenTypeReader openTypeReader = new InputStreamOpenTypeReader(inputStream);
        OffsetInfo offsetInfo = findOffsetInfo(openTypeReader);
        openTypeReader.skip((int) (offsetInfo.getStartOffset() - openTypeReader.getPosition()));
        ByteBuffer buffer = ByteBuffer.allocate((int) offsetInfo.getLength());
        int numRead = inputStream.read(buffer.array());
        if (numRead != offsetInfo.getLength()) goto L7;
        return MetadataList.getRootAsMetadataList(buffer);
    L7:
        throw new IOException("Needed " + offsetInfo.getLength() + " bytes, got " + numRead);
    }

    static MetadataList read(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer newBuffer = byteBuffer.duplicate();
        OpenTypeReader reader = new ByteBufferReader(newBuffer);
        OffsetInfo offsetInfo = findOffsetInfo(reader);
        newBuffer.position((int) offsetInfo.getStartOffset());
        return MetadataList.getRootAsMetadataList(newBuffer);
    }

    static MetadataList read(AssetManager assetManager, String assetPath) throws IOException {
        InputStream inputStream = assetManager.open(assetPath);
        MetadataList r1 = read(inputStream);     // Catch: Throwable -> L7
        if (inputStream == null) goto L6;
        inputStream.close();
    L6:
        return r1;
    L7:
        th = move-exception;
        if (inputStream != null) goto L14;
    L13:
        throw th;
    L14:
        inputStream.close();     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        th.addSuppressed(th);
        goto L13
    }

    private static OffsetInfo findOffsetInfo(OpenTypeReader reader) throws IOException {
        reader.skip(4);
        int tableCount = reader.readUnsignedShort();
        if (tableCount > 100) goto L26;
        reader.skip(6);
        long metaOffset = -1;
        int i = 0;
    L5:
        if (i >= tableCount) goto L11;
        int tag = reader.readTag();
        reader.skip(4);
        long offset = reader.readUnsignedInt();
        reader.skip(4);
        if (META_TABLE_NAME == tag) goto L8;
        i = i + 1;
        goto L5
    L8:
        metaOffset = offset;
    L11:
        if (metaOffset == (-1)) goto L24;
        reader.skip((int) (metaOffset - reader.getPosition()));
        reader.skip(12);
        long mapsCount = reader.readUnsignedInt();
        int i2 = 0;
    L14:
        if (i2 >= mapsCount) goto L24;
        int tag2 = reader.readTag();
        long dataOffset = reader.readUnsignedInt();
        long dataLength = reader.readUnsignedInt();
        if (EMJI_TAG == tag2) goto L22;
        if (EMJI_TAG_DEPRECATED == tag2) goto L22;
        i2 = i2 + 1;
    L22:
        return new OffsetInfo(dataOffset + metaOffset, dataLength);
    L24:
        throw new IOException("Cannot read metadata.");
    L26:
        throw new IOException("Cannot read metadata.");
    }

    static int toUnsignedShort(short value) {
        return 65535 & value;
    }

    static long toUnsignedInt(int value) {
        return ((long) value) & 4294967295L;
    }

    private MetadataListReader() {
    }
}
