package androidx.profileinstaller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.UByte;

/* JADX INFO: loaded from: classes4.dex */
class Encoding {
    static final int SIZEOF_BYTE = 8;
    static final int UINT_16_SIZE = 2;
    static final int UINT_32_SIZE = 4;
    static final int UINT_8_SIZE = 1;

    private Encoding() {
    }

    static int utf8Length(String s) {
        return s.getBytes(StandardCharsets.UTF_8).length;
    }

    static void writeUInt(OutputStream os, long value, int numberOfBytes) throws IOException {
        byte[] buffer = new byte[numberOfBytes];
        int i = 0;
    L3:
        if (i >= numberOfBytes) goto L5;
        buffer[i] = (byte) ((value >> (i * 8)) & 255);
        i = i + 1;
        goto L3
    L5:
        os.write(buffer);
    }

    static void writeUInt8(OutputStream os, int value) throws IOException {
        writeUInt(os, value, 1);
    }

    static void writeUInt16(OutputStream os, int value) throws IOException {
        writeUInt(os, value, 2);
    }

    static void writeUInt32(OutputStream os, long value) throws IOException {
        writeUInt(os, value, 4);
    }

    static void writeString(OutputStream os, String s) throws IOException {
        os.write(s.getBytes(StandardCharsets.UTF_8));
    }

    static int bitsToBytes(int numberOfBits) {
        return (((numberOfBits + 8) - 1) & (-8)) / 8;
    }

    static byte[] read(InputStream is, int length) throws IOException {
        byte[] buffer = new byte[length];
        int offset = 0;
    L3:
        if (offset >= length) goto L9;
        int result = is.read(buffer, offset, length - offset);
        if (result < 0) goto L8;
        offset = offset + result;
        goto L3
    L8:
        throw error("Not enough bytes to read: " + length);
    L9:
        return buffer;
    }

    static long readUInt(InputStream is, int numberOfBytes) throws IOException {
        byte[] buffer = read(is, numberOfBytes);
        long value = 0;
        int i = 0;
    L3:
        if (i >= numberOfBytes) goto L5;
        long next = buffer[i] & UByte.MAX_VALUE;
        value = value + (next << (i * 8));
        i = i + 1;
        goto L3
    L5:
        return value;
    }

    static int readUInt8(InputStream is) throws IOException {
        return (int) readUInt(is, 1);
    }

    static int readUInt16(InputStream is) throws IOException {
        return (int) readUInt(is, 2);
    }

    static long readUInt32(InputStream is) throws IOException {
        return readUInt(is, 4);
    }

    static String readString(InputStream is, int size) throws IOException {
        return new String(read(is, size), StandardCharsets.UTF_8);
    }

    static byte[] readCompressed(InputStream is, int compressedDataSize, int uncompressedDataSize) throws IOException {
        Inflater inf = new Inflater();
        byte[] result = new byte[uncompressedDataSize];     // Catch: Throwable -> L29
        int totalBytesRead = 0;
        int totalBytesInflated = 0;
        byte[] input = new byte[2048];     // Catch: Throwable -> L29
    L5:
        if (inf.finished() == true) goto L20;
        if (inf.needsDictionary() == true) goto L20;
        if (totalBytesRead >= compressedDataSize) goto L20;
        int bytesRead = is.read(input);     // Catch: Throwable -> L29
        if (bytesRead < 0) goto L19;
        inf.setInput(input, 0, bytesRead);     // Catch: Throwable -> L29
        totalBytesInflated = totalBytesInflated + inf.inflate(result, totalBytesInflated, uncompressedDataSize - totalBytesInflated);
        totalBytesRead = totalBytesRead + bytesRead;
        goto L5
    L15:
        e = move-exception;
        throw error(e.getMessage());     // Catch: Throwable -> L29
    L19:
        throw error("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + compressedDataSize + " bytes");     // Catch: Throwable -> L29
    L20:
        if (totalBytesRead != compressedDataSize) goto L28;
        if (inf.finished() == false) goto L26;
        inf.end();
        return result;
    L26:
        throw error("Inflater did not finish");     // Catch: Throwable -> L29
    L28:
        throw error("Didn't read enough bytes during decompression. expected=" + compressedDataSize + " actual=" + totalBytesRead);     // Catch: Throwable -> L29
    L29:
        th = move-exception;
        inf.end();
        throw th;
    }

    static void writeCompressed(OutputStream os, byte[] data) throws IOException {
        writeUInt32(os, data.length);
        byte[] outputData = compress(data);
        writeUInt32(os, outputData.length);
        os.write(outputData);
    }

    static byte[] compress(byte[] data) throws IOException {
        Deflater compressor = new Deflater(1);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DeflaterOutputStream deflater = new DeflaterOutputStream(out, compressor);     // Catch: Throwable -> L14
        deflater.write(data);     // Catch: Throwable -> L8
        deflater.close();     // Catch: Throwable -> L14
        compressor.end();
        return out.toByteArray();
    L8:
        th = move-exception;
        deflater.close();     // Catch: Throwable -> L11
    L13:
        throw th;     // Catch: Throwable -> L14
    L11:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        compressor.end();
        throw th;
    }

    static void writeAll(InputStream is, OutputStream os, FileLock lock) throws IOException {
        if (lock != null) goto L5;
    L7:
        boolean isValid = false;
    L8:
        if (isValid == false) goto L15;
        byte[] buf = new byte[512];
    L10:
        int length = is.read(buf);
        if (length <= 0) goto L13;
        os.write(buf, 0, length);
        goto L10
    L13:
        return;
    L15:
        throw new IOException("Unable to acquire a lock on the underlying file channel.");
    L5:
        if (lock.isValid() == false) goto L7;
        isValid = true;
        goto L8
    }

    static RuntimeException error(String message) {
        return new IllegalStateException(message);
    }
}
