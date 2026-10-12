package kotlin.io.encoding;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Base64IOStream.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0016J \u0010\u0017\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0002J \u0010\u001b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0002J\b\u0010\u001c\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlin/io/encoding/EncodeOutputStream;", "Ljava/io/OutputStream;", "output", "base64", "Lkotlin/io/encoding/Base64;", "<init>", "(Ljava/io/OutputStream;Lkotlin/io/encoding/Base64;)V", "isClosed", "", "lineLength", "", "symbolBuffer", "", "byteBuffer", "byteBufferLength", "write", "", "b", "source", "offset", "length", "flush", "close", "copyIntoByteBuffer", "startIndex", "endIndex", "encodeByteBufferIntoOutput", "encodeIntoOutput", "checkOpen", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class EncodeOutputStream extends OutputStream {
    private final Base64 base64;
    private final byte[] byteBuffer;
    private int byteBufferLength;
    private boolean isClosed;
    private int lineLength;
    private final OutputStream output;
    private final byte[] symbolBuffer;

    public EncodeOutputStream(OutputStream output, Base64 base64) {
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(base64, "base64");
        this.output = output;
        this.base64 = base64;
        if (this.base64.isMimeScheme$kotlin_stdlib() == false) goto L5;
        int r0 = this.base64.getMimeLineLength$kotlin_stdlib();
    L6:
        this.lineLength = r0;
        this.symbolBuffer = new byte[1024];
        this.byteBuffer = new byte[3];
        return;
    L5:
        r0 = -1;
        goto L6
    }

    @Override // java.io.OutputStream
    public void write(int b) {
        checkOpen();
        byte[] r0 = this.byteBuffer;
        int r1 = this.byteBufferLength;
        this.byteBufferLength = r1 + 1;
        r0[r1] = (byte) b;
        if (this.byteBufferLength != 3) goto L6;
        encodeByteBufferIntoOutput();
        return;
    }

    @Override // java.io.OutputStream
    public void write(byte[] source, int offset, int length) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkOpen();
        if (offset < 0) goto L39;
        if (length < 0) goto L39;
        if ((offset + length) > source.length) goto L39;
        if (length != 0) goto L10;
        return;
    L10:
        if (this.byteBufferLength >= 3) goto L12;
        boolean r0 = true;
    L14:
        if (r0 == false) goto L37;
        int startIndex = offset;
        int endIndex = startIndex + length;
        if (this.byteBufferLength == 0) goto L21;
        startIndex = startIndex + copyIntoByteBuffer(source, startIndex, endIndex);
        if (this.byteBufferLength == 0) goto L21;
        return;
    L21:
        if ((startIndex + 3) > endIndex) goto L34;
        if (this.base64.isMimeScheme$kotlin_stdlib() == false) goto L25;
        int r6 = this.lineLength;
    L26:
        int groupCapacity = r6 / 4;
        int groupsToEncode = Math.min(groupCapacity, (endIndex - startIndex) / 3);
        int bytesToEncode = groupsToEncode * 3;
        int symbolsEncoded = encodeIntoOutput(source, startIndex, startIndex + bytesToEncode);
        if (symbolsEncoded != (groupsToEncode * 4)) goto L29;
        boolean r10 = true;
    L30:
        if (r10 == false) goto L33;
        startIndex = startIndex + bytesToEncode;
        goto L21
    L33:
        throw new IllegalStateException("Check failed.");
    L29:
        r10 = false;
        goto L30
    L25:
        r6 = this.symbolBuffer.length;
        goto L26
    L34:
        ArraysKt.copyInto(source, this.byteBuffer, 0, startIndex, endIndex);
        this.byteBufferLength = endIndex - startIndex;
        return;
    L37:
        throw new IllegalStateException("Check failed.");
    L12:
        r0 = false;
    L39:
        throw new IndexOutOfBoundsException("offset: " + offset + ", length: " + length + ", source size: " + source.length);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        checkOpen();
        this.output.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.isClosed == true) goto L9;
        this.isClosed = true;
        if (this.byteBufferLength == 0) goto L7;
        encodeByteBufferIntoOutput();
    L7:
        this.output.close();
        return;
    }

    private final int copyIntoByteBuffer(byte[] source, int startIndex, int endIndex) {
        int bytesToCopy = Math.min(3 - this.byteBufferLength, endIndex - startIndex);
        ArraysKt.copyInto(source, this.byteBuffer, this.byteBufferLength, startIndex, startIndex + bytesToCopy);
        this.byteBufferLength += bytesToCopy;
        if (this.byteBufferLength != 3) goto L5;
        encodeByteBufferIntoOutput();
    L5:
        return bytesToCopy;
    }

    private final void encodeByteBufferIntoOutput() {
        int symbolsEncoded = encodeIntoOutput(this.byteBuffer, 0, this.byteBufferLength);
        if (symbolsEncoded != 4) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L10;
        this.byteBufferLength = 0;
        return;
    L10:
        throw new IllegalStateException("Check failed.");
    L5:
        r1 = false;
        goto L6
    }

    private final int encodeIntoOutput(byte[] source, int startIndex, int endIndex) {
        int symbolsEncoded = this.base64.encodeIntoByteArray(source, this.symbolBuffer, 0, startIndex, endIndex);
        if (this.lineLength != 0) goto L12;
        this.output.write(Base64.Default.getMimeLineSeparatorSymbols$kotlin_stdlib());
        this.lineLength = this.base64.getMimeLineLength$kotlin_stdlib();
        if (symbolsEncoded > this.base64.getMimeLineLength$kotlin_stdlib()) goto L7;
        boolean r8 = true;
    L8:
        if (r8 == true) goto L12;
        throw new IllegalStateException("Check failed.");
    L7:
        r8 = false;
    L12:
        this.output.write(this.symbolBuffer, 0, symbolsEncoded);
        this.lineLength -= symbolsEncoded;
        return symbolsEncoded;
    }

    private final void checkOpen() {
        if (this.isClosed == true) goto L6;
        return;
    L6:
        throw new IOException("The output stream is closed.");
    }
}
