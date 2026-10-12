package kotlin.io.encoding;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Base64IOStream.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0014\u001a\u00020\u000fH\u0016J \u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J(\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J \u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002J\b\u0010 \u001a\u00020\u0019H\u0002J\b\u0010!\u001a\u00020\u0019H\u0002J\u0010\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J\b\u0010#\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, d2 = {"Lkotlin/io/encoding/DecodeInputStream;", "Ljava/io/InputStream;", "input", "base64", "Lkotlin/io/encoding/Base64;", "<init>", "(Ljava/io/InputStream;Lkotlin/io/encoding/Base64;)V", "isClosed", "", "isEOF", "singleByteBuffer", "", "symbolBuffer", "byteBuffer", "byteBufferStartIndex", "", "byteBufferEndIndex", "byteBufferLength", "getByteBufferLength", "()I", "read", "destination", "offset", "length", "close", "", "decodeSymbolBufferInto", "dst", "dstOffset", "dstEndIndex", "symbolBufferLength", "copyByteBufferInto", "resetByteBufferIfEmpty", "shiftByteBufferToStartIfNeeded", "handlePaddingSymbol", "readNextSymbol", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class DecodeInputStream extends InputStream {
    private final Base64 base64;
    private final byte[] byteBuffer;
    private int byteBufferEndIndex;
    private int byteBufferStartIndex;
    private final InputStream input;
    private boolean isClosed;
    private boolean isEOF;
    private final byte[] singleByteBuffer;
    private final byte[] symbolBuffer;

    public DecodeInputStream(InputStream input, Base64 base64) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(base64, "base64");
        this.input = input;
        this.base64 = base64;
        this.singleByteBuffer = new byte[1];
        this.symbolBuffer = new byte[1024];
        this.byteBuffer = new byte[1024];
    }

    private final int getByteBufferLength() {
        return this.byteBufferEndIndex - this.byteBufferStartIndex;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.byteBufferStartIndex >= this.byteBufferEndIndex) goto L7;
        int r0 = this.byteBuffer[this.byteBufferStartIndex] & UByte.MAX_VALUE;
        this.byteBufferStartIndex++;
        resetByteBufferIfEmpty();
        return r0;
    L7:
        switch(read(this.singleByteBuffer, 0, 1)) {
            case -1: goto L11;
            case 0: goto L9;
            case 1: goto L13;
            default: goto L9;
        };
    L11:
        return -1;
    L9:
        throw new IllegalStateException("Unreachable".toString());
    L13:
        return this.singleByteBuffer[0] & UByte.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public int read(byte[] destination, int offset, int length) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (offset < 0) goto L51;
        if (length < 0) goto L51;
        if ((offset + length) > destination.length) goto L51;
        if (this.isClosed == true) goto L49;
        if (this.isEOF == false) goto L13;
        return -1;
    L13:
        if (length != 0) goto L16;
        return 0;
    L16:
        if (getByteBufferLength() < length) goto L19;
        copyByteBufferInto(destination, offset, length);
        return length;
    L19:
        int bytesNeeded = length - getByteBufferLength();
        int groupsNeeded = ((bytesNeeded + 3) - 1) / 3;
        int symbolsNeeded = groupsNeeded * 4;
        int dstOffset = offset;
    L21:
        if (this.isEOF == true) goto L42;
        if (symbolsNeeded <= 0) goto L42;
        int symbolBufferLength = 0;
        int symbolsToRead = Math.min(this.symbolBuffer.length, symbolsNeeded);
    L25:
        if (this.isEOF == true) goto L33;
        if (symbolBufferLength >= symbolsToRead) goto L33;
        int symbol = readNextSymbol();
        switch(symbol) {
            case -1: goto L31;
            case 61: goto L30;
            default: goto L29;
        };
    L30:
        symbolBufferLength = handlePaddingSymbol(symbolBufferLength);
        this.isEOF = true;
        goto L25
    L31:
        this.isEOF = true;
        goto L25
    L29:
        this.symbolBuffer[symbolBufferLength] = (byte) symbol;
        symbolBufferLength = symbolBufferLength + 1;
    L33:
        if (this.isEOF == true) goto L37;
        if (symbolBufferLength == symbolsToRead) goto L37;
        boolean r9 = false;
    L38:
        if (r9 == false) goto L41;
        symbolsNeeded = symbolsNeeded - symbolBufferLength;
        dstOffset = dstOffset + decodeSymbolBufferInto(destination, dstOffset, length + offset, symbolBufferLength);
        goto L21
    L41:
        throw new IllegalStateException("Check failed.");
    L37:
        r9 = true;
    L42:
        if (dstOffset != offset) goto L47;
        if (this.isEOF == false) goto L47;
        return -1;
    L47:
        return dstOffset - offset;
    L49:
        throw new IOException("The input stream is closed.");
    L51:
        throw new IndexOutOfBoundsException("offset: " + offset + ", length: " + length + ", buffer size: " + destination.length);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.isClosed == true) goto L6;
        this.isClosed = true;
        this.input.close();
        return;
    }

    private final int decodeSymbolBufferInto(byte[] dst, int dstOffset, int dstEndIndex, int symbolBufferLength) {
        this.byteBufferEndIndex += this.base64.decodeIntoByteArray(this.symbolBuffer, this.byteBuffer, this.byteBufferEndIndex, 0, symbolBufferLength);
        int bytesToCopy = Math.min(getByteBufferLength(), dstEndIndex - dstOffset);
        copyByteBufferInto(dst, dstOffset, bytesToCopy);
        shiftByteBufferToStartIfNeeded();
        return bytesToCopy;
    }

    private final void copyByteBufferInto(byte[] dst, int dstOffset, int length) {
        ArraysKt.copyInto(this.byteBuffer, dst, dstOffset, this.byteBufferStartIndex, this.byteBufferStartIndex + length);
        this.byteBufferStartIndex += length;
        resetByteBufferIfEmpty();
    }

    private final void resetByteBufferIfEmpty() {
        if (this.byteBufferStartIndex != this.byteBufferEndIndex) goto L6;
        this.byteBufferStartIndex = 0;
        this.byteBufferEndIndex = 0;
        return;
    }

    private final void shiftByteBufferToStartIfNeeded() {
        int byteBufferCapacity = this.byteBuffer.length - this.byteBufferEndIndex;
        int symbolBufferCapacity = (this.symbolBuffer.length / 4) * 3;
        if (symbolBufferCapacity <= byteBufferCapacity) goto L6;
        ArraysKt.copyInto(this.byteBuffer, this.byteBuffer, 0, this.byteBufferStartIndex, this.byteBufferEndIndex);
        this.byteBufferEndIndex -= this.byteBufferStartIndex;
        this.byteBufferStartIndex = 0;
        return;
    }

    private final int handlePaddingSymbol(int symbolBufferLength) {
        this.symbolBuffer[symbolBufferLength] = Base64.padSymbol;
        if ((symbolBufferLength & 3) != 2) goto L9;
        int secondPad = readNextSymbol();
        if (secondPad < 0) goto L10;
        this.symbolBuffer[symbolBufferLength + 1] = (byte) secondPad;
    L10:
        return symbolBufferLength + 2;
    L9:
        return symbolBufferLength + 1;
    }

    private final int readNextSymbol() {
        if (this.base64.isMimeScheme$kotlin_stdlib() == true) goto L7;
        return this.input.read();
    L7:
        int read = this.input.read();
        if (read == (-1)) goto L11;
        if (Base64Kt.isInMimeAlphabet(read) == false) goto L7;
    L11:
        return read;
    }
}
