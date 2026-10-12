package kotlin.io;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Console.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\tH\u0002J\b\u0010\u001d\u001a\u00020\u0005H\u0002J\u0018\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010#\u001a\u00020\"H\u0002J\b\u0010$\u001a\u00020\"H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00060\u0013j\u0002`\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lkotlin/io/LineReader;", "", "<init>", "()V", "BUFFER_SIZE", "", "decoder", "Ljava/nio/charset/CharsetDecoder;", "directEOL", "", "bytes", "", "chars", "", "byteBuf", "Ljava/nio/ByteBuffer;", "charBuf", "Ljava/nio/CharBuffer;", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "readLine", "", "inputStream", "Ljava/io/InputStream;", "charset", "Ljava/nio/charset/Charset;", "decode", "endOfInput", "compactBytes", "decodeEndOfInput", "nBytes", "nChars", "updateCharset", "", "resetAll", "trimStringBuilder", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LineReader {
    private static final int BUFFER_SIZE = 32;
    public static final LineReader INSTANCE = null;
    private static final ByteBuffer byteBuf = null;
    private static final byte[] bytes = null;
    private static final CharBuffer charBuf = null;
    private static final char[] chars = null;
    private static CharsetDecoder decoder;
    private static boolean directEOL;
    private static final StringBuilder sb = null;

    private LineReader() {
    }

    static {
        INSTANCE = new LineReader();
        bytes = new byte[32];
        chars = new char[32];
        ByteBuffer r0 = ByteBuffer.wrap(bytes);
        Intrinsics.checkNotNullExpressionValue(r0, "wrap(...)");
        byteBuf = r0;
        CharBuffer r1 = CharBuffer.wrap(chars);
        Intrinsics.checkNotNullExpressionValue(r1, "wrap(...)");
        charBuf = r1;
        sb = new StringBuilder();
    }

    public final synchronized String readLine(InputStream inputStream, Charset charset) {
        monitor-enter(this);
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");     // Catch: Throwable -> L59
        Intrinsics.checkNotNullParameter(charset, "charset");     // Catch: Throwable -> L59
        if (decoder == null) goto L10;
        CharsetDecoder r0 = decoder;     // Catch: Throwable -> L59
        if (r0 != null) goto L9;
        Intrinsics.throwUninitializedPropertyAccessException("decoder");     // Catch: Throwable -> L59
        r0 = null;
    L9:
        if (Intrinsics.areEqual(r0.charset(), charset) == false) goto L10;
    L11:
        int nBytes = 0;
        int nChars = 0;
    L12:
        int readByte = inputStream.read();     // Catch: Throwable -> L59
        boolean r7 = true;
        if (readByte == (-1)) goto L15;
        int nBytes2 = nBytes + 1;     // Catch: Throwable -> L59
        bytes[nBytes] = (byte) readByte;     // Catch: Throwable -> L59
        if (readByte == 10) goto L31;
        if (nBytes2 == 32) goto L31;
        if (directEOL == false) goto L31;
        nBytes = nBytes2;
    L31:
        byteBuf.limit(nBytes2);     // Catch: Throwable -> L59
        charBuf.position(nChars);     // Catch: Throwable -> L59
        nChars = decode(false);     // Catch: Throwable -> L59
        if (nChars > 0) goto L34;
    L58:
        nBytes = compactBytes();     // Catch: Throwable -> L59
        goto L12
    L34:
        if (chars[nChars - 1] != '\n') goto L58;
        byteBuf.position(0);     // Catch: Throwable -> L59
        int nChars2 = nChars;
    L36:
        if (nChars2 <= 0) goto L45;
        if (chars[nChars2 - 1] != '\n') goto L45;
        nChars2 = nChars2 - 1;     // Catch: Throwable -> L59
        if (nChars2 <= 0) goto L45;
        if (chars[nChars2 - 1] != '\r') goto L45;
        nChars2 = nChars2 - 1;     // Catch: Throwable -> L59
    L45:
        if (sb.length() == 0) goto L48;
        r7 = false;
    L48:
        if (r7 == false) goto L52;
        String r2 = new String(chars, 0, nChars2);     // Catch: Throwable -> L59
        monitor-exit(this);
        return r2;
    L52:
        sb.append(chars, 0, nChars2);     // Catch: Throwable -> L59
        String result = sb.toString();     // Catch: Throwable -> L59
        Intrinsics.checkNotNullExpressionValue(result, "toString(...)");     // Catch: Throwable -> L59
        if (sb.length() <= 32) goto L55;
        trimStringBuilder();     // Catch: Throwable -> L59
    L55:
        sb.setLength(0);     // Catch: Throwable -> L59
        monitor-exit(this);
        return result;
    L15:
        if (sb.length() != 0) goto L17;
        boolean r6 = true;
    L18:
        if (r6 == false) goto L23;
        if (nBytes != 0) goto L23;
        if (nChars != 0) goto L23;
        monitor-exit(this);
        return null;
    L23:
        nChars2 = decodeEndOfInput(nBytes, nChars);     // Catch: Throwable -> L59
        goto L36
    L17:
        r6 = false;
    L10:
        updateCharset(charset);     // Catch: Throwable -> L59
    L59:
        th = move-exception;
        throw th;
    }

    private final int decode(boolean endOfInput) {
    L2:
        CharsetDecoder r0 = decoder;
        if (r0 != null) goto L5;
        Intrinsics.throwUninitializedPropertyAccessException("decoder");
        r0 = null;
    L5:
        CoderResult coderResult = r0.decode(byteBuf, charBuf, endOfInput);
        Intrinsics.checkNotNullExpressionValue(coderResult, "decode(...)");
        if (coderResult.isError() == false) goto L8;
        resetAll();
        coderResult.throwException();
    L8:
        int nChars = charBuf.position();
        if (coderResult.isOverflow() == false) goto L10;
        sb.append(chars, 0, nChars - 1);
        charBuf.position(0);
        charBuf.limit(32);
        charBuf.put(chars[nChars - 1]);
        goto L2
    L10:
        return nChars;
    }

    private final int compactBytes() {
        ByteBuffer $this$compactBytes_u24lambda_u241 = byteBuf;
        $this$compactBytes_u24lambda_u241.compact();
        int r2 = $this$compactBytes_u24lambda_u241.position();
        $this$compactBytes_u24lambda_u241.position(0);
        return r2;
    }

    private final int decodeEndOfInput(int nBytes, int nChars) {
        byteBuf.limit(nBytes);
        charBuf.position(nChars);
        int r0 = decode(true);
        CharsetDecoder r3 = decoder;
        if (r3 != null) goto L5;
        Intrinsics.throwUninitializedPropertyAccessException("decoder");
        r3 = null;
    L5:
        r3.reset();
        byteBuf.position(0);
        return r0;
    }

    private final void updateCharset(Charset charset) {
        CharsetDecoder r0 = charset.newDecoder();
        Intrinsics.checkNotNullExpressionValue(r0, "newDecoder(...)");
        decoder = r0;
        byteBuf.clear();
        charBuf.clear();
        byteBuf.put((byte) 10);
        byteBuf.flip();
        CharsetDecoder r1 = decoder;
        if (r1 != null) goto L5;
        Intrinsics.throwUninitializedPropertyAccessException("decoder");
        r1 = null;
    L5:
        boolean r4 = false;
        r1.decode(byteBuf, charBuf, false);
        if (charBuf.position() == 1) goto L8;
    L10:
        directEOL = r4;
        resetAll();
        return;
    L8:
        if (charBuf.get(0) != '\n') goto L10;
        r4 = true;
        goto L10
    }

    private final void resetAll() {
        CharsetDecoder r0 = decoder;
        if (r0 != null) goto L5;
        Intrinsics.throwUninitializedPropertyAccessException("decoder");
        r0 = null;
    L5:
        r0.reset();
        byteBuf.position(0);
        sb.setLength(0);
    }

    private final void trimStringBuilder() {
        sb.setLength(32);
        sb.trimToSize();
    }
}
