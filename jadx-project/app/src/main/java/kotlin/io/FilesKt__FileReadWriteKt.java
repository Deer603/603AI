package kotlin.io;

import androidx.autofill.HintConstants;
import androidx.collection.SieveCacheKt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: FileReadWrite.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a!\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0087\b\u001a\u0017\u0010\t\u001a\u00020\n*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a!\u0010\u000b\u001a\u00020\f*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0087\b\u001a\u0017\u0010\r\u001a\u00020\u000e*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\n\u0010\u000f\u001a\u00020\u0010*\u00020\u0002\u001a\u0012\u0010\u0011\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0010\u001a\u0012\u0010\u0014\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0010\u001a\u0014\u0010\u0015\u001a\u00020\u0016*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0017\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0019\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u001a\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u001c\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d*\u00020\u0004H\u0000\u001a\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u001dH\u0000\u001aB\u0010#\u001a\u00020\u0012*\u00020\u000226\u0010$\u001a2\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0013\u0012\u00110\b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00120%\u001aJ\u0010#\u001a\u00020\u0012*\u00020\u00022\u0006\u0010*\u001a\u00020\b26\u0010$\u001a2\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0013\u0012\u00110\b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00120%\u001a7\u0010+\u001a\u00020\u0012*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u00120,\u001a\r\u0010.\u001a\u00020/*\u00020\u0002H\u0087\b\u001a\r\u00100\u001a\u000201*\u00020\u0002H\u0087\b\u001a\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u001603*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001aL\u00104\u001a\u0002H5\"\u0004\b\u0000\u00105*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0018\u00106\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001607\u0012\u0004\u0012\u0002H50,H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u00108\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00069"}, d2 = {"reader", "Ljava/io/InputStreamReader;", "Ljava/io/File;", "charset", "Ljava/nio/charset/Charset;", "bufferedReader", "Ljava/io/BufferedReader;", "bufferSize", "", "writer", "Ljava/io/OutputStreamWriter;", "bufferedWriter", "Ljava/io/BufferedWriter;", "printWriter", "Ljava/io/PrintWriter;", "readBytes", "", "writeBytes", "", "array", "appendBytes", "readText", "", "writeText", "text", "appendText", "writeTextImpl", "Ljava/io/OutputStream;", "newReplaceEncoder", "Ljava/nio/charset/CharsetEncoder;", "kotlin.jvm.PlatformType", "byteBufferForEncoding", "Ljava/nio/ByteBuffer;", "chunkSize", "encoder", "forEachBlock", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "buffer", "bytesRead", "blockSize", "forEachLine", "Lkotlin/Function1;", "line", "inputStream", "Ljava/io/FileInputStream;", "outputStream", "Ljava/io/FileOutputStream;", "readLines", "", "useLines", "T", "block", "Lkotlin/sequences/Sequence;", "(Ljava/io/File;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/io/FilesKt")
class FilesKt__FileReadWriteKt extends FilesKt__FilePathComponentsKt {
    public static /* synthetic */ Unit $r8$lambda$4EcuRhbBdJT1OYuEKwTrZ40dPsY(ArrayList r0, String r1) {
        return readLines$lambda$9$FilesKt__FileReadWriteKt(r0, r1);
    }

    public FilesKt__FileReadWriteKt() {
    }

    static /* synthetic */ InputStreamReader reader$default(File $this$reader_u24default, Charset charset, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        charset = Charsets.UTF_8;
    L5:
        Intrinsics.checkNotNullParameter($this$reader_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new InputStreamReader(new FileInputStream($this$reader_u24default), charset);
    }

    private static final InputStreamReader reader(File $this$reader, Charset charset) {
        Intrinsics.checkNotNullParameter($this$reader, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new InputStreamReader(new FileInputStream($this$reader), charset);
    }

    static /* synthetic */ BufferedReader bufferedReader$default(File $this$bufferedReader_u24default, Charset charset, int bufferSize, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        charset = Charsets.UTF_8;
    L6:
        if ((r3 & 2) == 0) goto L8;
        bufferSize = 8192;
    L8:
        Intrinsics.checkNotNullParameter($this$bufferedReader_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Reader r5 = new InputStreamReader(new FileInputStream($this$bufferedReader_u24default), charset);
        if ((r5 instanceof BufferedReader) == false) goto L12;
        return (BufferedReader) r5;
    L12:
        return new BufferedReader(r5, bufferSize);
    }

    private static final BufferedReader bufferedReader(File $this$bufferedReader, Charset charset, int bufferSize) {
        Intrinsics.checkNotNullParameter($this$bufferedReader, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Reader r0 = new InputStreamReader(new FileInputStream($this$bufferedReader), charset);
        if ((r0 instanceof BufferedReader) == false) goto L6;
        return (BufferedReader) r0;
    L6:
        return new BufferedReader(r0, bufferSize);
    }

    static /* synthetic */ OutputStreamWriter writer$default(File $this$writer_u24default, Charset charset, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        charset = Charsets.UTF_8;
    L5:
        Intrinsics.checkNotNullParameter($this$writer_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream($this$writer_u24default), charset);
    }

    private static final OutputStreamWriter writer(File $this$writer, Charset charset) {
        Intrinsics.checkNotNullParameter($this$writer, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream($this$writer), charset);
    }

    static /* synthetic */ BufferedWriter bufferedWriter$default(File $this$bufferedWriter_u24default, Charset charset, int bufferSize, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        charset = Charsets.UTF_8;
    L6:
        if ((r3 & 2) == 0) goto L8;
        bufferSize = 8192;
    L8:
        Intrinsics.checkNotNullParameter($this$bufferedWriter_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Writer r5 = new OutputStreamWriter(new FileOutputStream($this$bufferedWriter_u24default), charset);
        if ((r5 instanceof BufferedWriter) == false) goto L12;
        return (BufferedWriter) r5;
    L12:
        return new BufferedWriter(r5, bufferSize);
    }

    private static final BufferedWriter bufferedWriter(File $this$bufferedWriter, Charset charset, int bufferSize) {
        Intrinsics.checkNotNullParameter($this$bufferedWriter, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Writer r0 = new OutputStreamWriter(new FileOutputStream($this$bufferedWriter), charset);
        if ((r0 instanceof BufferedWriter) == false) goto L6;
        return (BufferedWriter) r0;
    L6:
        return new BufferedWriter(r0, bufferSize);
    }

    static /* synthetic */ PrintWriter printWriter$default(File $this$printWriter_u24default, Charset charset, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L5;
        charset = Charsets.UTF_8;
    L5:
        Intrinsics.checkNotNullParameter($this$printWriter_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Writer r6 = new OutputStreamWriter(new FileOutputStream($this$printWriter_u24default), charset);
        if ((r6 instanceof BufferedWriter) == false) goto L8;
        BufferedWriter r7 = (BufferedWriter) r6;
    L10:
        return new PrintWriter(r7);
    L8:
        r7 = new BufferedWriter(r6, 8192);
        goto L10
    }

    private static final PrintWriter printWriter(File $this$printWriter, Charset charset) {
        Intrinsics.checkNotNullParameter($this$printWriter, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Writer r1 = new OutputStreamWriter(new FileOutputStream($this$printWriter), charset);
        if ((r1 instanceof BufferedWriter) == false) goto L5;
        BufferedWriter r2 = (BufferedWriter) r1;
    L7:
        return new PrintWriter(r2);
    L5:
        r2 = new BufferedWriter(r1, 8192);
        goto L7
    }

    public static final byte[] readBytes(File $this$readBytes) {
        Intrinsics.checkNotNullParameter($this$readBytes, "<this>");
        FileInputStream r0 = new FileInputStream($this$readBytes);
        FileInputStream input = r0;     // Catch: Throwable -> L28
        int offset = 0;
        long length = $this$readBytes.length();     // Catch: Throwable -> L28
        if (length > SieveCacheKt.NodeLinkMask) goto L27;
        int remaining = (int) length;
        byte[] result = new byte[remaining];     // Catch: Throwable -> L28
    L8:
        if (remaining <= 0) goto L13;
        int read = input.read(result, offset, remaining);     // Catch: Throwable -> L28
        if (read < 0) goto L13;
        remaining = remaining - read;
        offset = offset + read;
    L13:
        if (remaining <= 0) goto L15;
        byte[] r8 = Arrays.copyOf(result, offset);     // Catch: Throwable -> L28
        Intrinsics.checkNotNullExpressionValue(r8, "copyOf(...)");     // Catch: Throwable -> L28
        result = r8;
    L22:
        CloseableKt.closeFinally(r0, null);
        return result;
    L15:
        int extraByte = input.read();     // Catch: Throwable -> L28
        if (extraByte == (-1)) goto L22;
        ExposingBufferByteArrayOutputStream extra = new ExposingBufferByteArrayOutputStream(8193);     // Catch: Throwable -> L28
        extra.write(extraByte);     // Catch: Throwable -> L28
        ByteStreamsKt.copyTo$default(input, extra, 0, 2, null);     // Catch: Throwable -> L28
        int resultingSize = result.length + extra.size();     // Catch: Throwable -> L28
        if (resultingSize < 0) goto L25;
        byte[] r10 = extra.getBuffer();     // Catch: Throwable -> L28
        byte[] r12 = Arrays.copyOf(result, resultingSize);     // Catch: Throwable -> L28
        Intrinsics.checkNotNullExpressionValue(r12, "copyOf(...)");     // Catch: Throwable -> L28
        result = ArraysKt.copyInto(r10, r12, result.length, 0, extra.size());     // Catch: Throwable -> L28
        goto L22
    L25:
        throw new OutOfMemoryError("File " + $this$readBytes + " is too big to fit in memory.");     // Catch: Throwable -> L28
    L27:
        throw new OutOfMemoryError("File " + $this$readBytes + " is too big (" + length + " bytes) to fit in memory.");     // Catch: Throwable -> L28
    L28:
        th = move-exception;
        throw th;     // Catch: Throwable -> L30
    L30:
        th = move-exception;
        CloseableKt.closeFinally(r0, th);
        throw th;
    }

    public static final void writeBytes(File $this$writeBytes, byte[] array) {
        Intrinsics.checkNotNullParameter($this$writeBytes, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        FileOutputStream r0 = new FileOutputStream($this$writeBytes);
        FileOutputStream it = r0;     // Catch: Throwable -> L6
        it.write(array);     // Catch: Throwable -> L6
        Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L6
        CloseableKt.closeFinally(r0, null);
        return;
    L6:
        th = move-exception;
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        CloseableKt.closeFinally(r0, th);
        throw th;
    }

    public static final void appendBytes(File $this$appendBytes, byte[] array) {
        Intrinsics.checkNotNullParameter($this$appendBytes, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        FileOutputStream r0 = new FileOutputStream($this$appendBytes, true);
        FileOutputStream it = r0;     // Catch: Throwable -> L6
        it.write(array);     // Catch: Throwable -> L6
        Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L6
        CloseableKt.closeFinally(r0, null);
        return;
    L6:
        th = move-exception;
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        CloseableKt.closeFinally(r0, th);
        throw th;
    }

    public static final String readText(File $this$readText, Charset charset) {
        Intrinsics.checkNotNullParameter($this$readText, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        InputStreamReader r0 = new InputStreamReader(new FileInputStream($this$readText), charset);
        InputStreamReader it = r0;     // Catch: Throwable -> L6
        String r3 = TextStreamsKt.readText(it);     // Catch: Throwable -> L6
        CloseableKt.closeFinally(r0, null);
        return r3;
    L6:
        th = move-exception;
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        CloseableKt.closeFinally(r0, th);
        throw th;
    }

    public static /* synthetic */ String readText$default(File r0, Charset r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = Charsets.UTF_8;
    L6:
        return FilesKt.readText(r0, r1);
    }

    public static /* synthetic */ void writeText$default(File r0, String r1, Charset r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = Charsets.UTF_8;
    L5:
        FilesKt.writeText(r0, r1, r2);
    }

    public static final void writeText(File $this$writeText, String text, Charset charset) {
        Intrinsics.checkNotNullParameter($this$writeText, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        FileOutputStream r0 = new FileOutputStream($this$writeText);
        FileOutputStream it = r0;     // Catch: Throwable -> L6
        FilesKt.writeTextImpl(it, text, charset);     // Catch: Throwable -> L6
        Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L6
        CloseableKt.closeFinally(r0, null);
        return;
    L6:
        th = move-exception;
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        CloseableKt.closeFinally(r0, th);
        throw th;
    }

    public static /* synthetic */ void appendText$default(File r0, String r1, Charset r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = Charsets.UTF_8;
    L5:
        FilesKt.appendText(r0, r1, r2);
    }

    public static final void appendText(File $this$appendText, String text, Charset charset) {
        Intrinsics.checkNotNullParameter($this$appendText, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        FileOutputStream r0 = new FileOutputStream($this$appendText, true);
        FileOutputStream it = r0;     // Catch: Throwable -> L6
        FilesKt.writeTextImpl(it, text, charset);     // Catch: Throwable -> L6
        Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L6
        CloseableKt.closeFinally(r0, null);
        return;
    L6:
        th = move-exception;
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        CloseableKt.closeFinally(r0, th);
        throw th;
    }

    public static final void writeTextImpl(OutputStream $this$writeTextImpl, String text, Charset charset) {
        Intrinsics.checkNotNullParameter($this$writeTextImpl, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (text.length() >= (8192 * 2)) goto L6;
        byte[] r1 = text.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(r1, "getBytes(...)");
        $this$writeTextImpl.write(r1);
        return;
    L6:
        CharsetEncoder encoder = FilesKt.newReplaceEncoder(charset);
        CharBuffer charBuffer = CharBuffer.allocate(8192);
        Intrinsics.checkNotNull(encoder);
        ByteBuffer byteBuffer = FilesKt.byteBufferForEncoding(8192, encoder);
        int startIndex = 0;
        int leftover = 0;
    L8:
        if (startIndex >= text.length()) goto L22;
        int copyLength = Math.min(8192 - leftover, text.length() - startIndex);
        int endIndex = startIndex + copyLength;
        char[] r8 = charBuffer.array();
        Intrinsics.checkNotNullExpressionValue(r8, "array(...)");
        text.getChars(startIndex, endIndex, r8, leftover);
        charBuffer.limit(copyLength + leftover);
        if (endIndex != text.length()) goto L12;
        boolean r9 = true;
    L13:
        CoderResult it = encoder.encode(charBuffer, byteBuffer, r9);
        if (it.isUnderflow() == false) goto L21;
        $this$writeTextImpl.write(byteBuffer.array(), 0, byteBuffer.position());
        if (charBuffer.position() == charBuffer.limit()) goto L18;
        charBuffer.put(0, charBuffer.get());
        leftover = 1;
    L19:
        charBuffer.clear();
        byteBuffer.clear();
        startIndex = endIndex;
        goto L8
    L18:
        leftover = 0;
        goto L19
    L21:
        throw new IllegalStateException("Check failed.");
    L12:
        r9 = false;
        goto L13
    }

    public static final CharsetEncoder newReplaceEncoder(Charset $this$newReplaceEncoder) {
        Intrinsics.checkNotNullParameter($this$newReplaceEncoder, "<this>");
        return $this$newReplaceEncoder.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
    }

    public static final ByteBuffer byteBufferForEncoding(int chunkSize, CharsetEncoder encoder) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int maxBytesPerChar = (int) Math.ceil(encoder.maxBytesPerChar());
        ByteBuffer r1 = ByteBuffer.allocate(chunkSize * maxBytesPerChar);
        Intrinsics.checkNotNullExpressionValue(r1, "allocate(...)");
        return r1;
    }

    public static final void forEachBlock(File $this$forEachBlock, Function2<? super byte[], ? super Integer, Unit> r2) {
        Intrinsics.checkNotNullParameter($this$forEachBlock, "<this>");
        Intrinsics.checkNotNullParameter(r2, "action");
        FilesKt.forEachBlock($this$forEachBlock, 4096, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [byte[], java.lang.Object] */
    public static final void forEachBlock(File $this$forEachBlock, int blockSize, Function2<? super byte[], ? super Integer, Unit> r8) {
        Intrinsics.checkNotNullParameter($this$forEachBlock, "<this>");
        Intrinsics.checkNotNullParameter(r8, "action");
        ?? r0 = new byte[RangesKt.coerceAtLeast(blockSize, 512)];
        FileInputStream r1 = new FileInputStream($this$forEachBlock);
        FileInputStream r2 = r1;     // Catch: Throwable -> L11
    L4:
        int size = r2.read(r0);     // Catch: Throwable -> L11
        if (size <= 0) goto L6;
        r8.invoke(r0, Integer.valueOf(size));     // Catch: Throwable -> L11
        goto L4
    L6:
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L11
        CloseableKt.closeFinally(r1, null);
        return;
    L11:
        th = move-exception;
        throw th;     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        CloseableKt.closeFinally(r1, th);
        throw th;
    }

    public static /* synthetic */ void forEachLine$default(File r0, Charset r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = Charsets.UTF_8;
    L5:
        FilesKt.forEachLine(r0, r1, r2);
    }

    public static final void forEachLine(File $this$forEachLine, Charset charset, Function1<? super String, Unit> r5) {
        Intrinsics.checkNotNullParameter($this$forEachLine, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(r5, "action");
        TextStreamsKt.forEachLine(new BufferedReader(new InputStreamReader(new FileInputStream($this$forEachLine), charset)), r5);
    }

    private static final FileInputStream inputStream(File $this$inputStream) {
        Intrinsics.checkNotNullParameter($this$inputStream, "<this>");
        return new FileInputStream($this$inputStream);
    }

    private static final FileOutputStream outputStream(File $this$outputStream) {
        Intrinsics.checkNotNullParameter($this$outputStream, "<this>");
        return new FileOutputStream($this$outputStream);
    }

    public static /* synthetic */ List readLines$default(File r0, Charset r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = Charsets.UTF_8;
    L6:
        return FilesKt.readLines(r0, r1);
    }

    public static final List<String> readLines(File $this$readLines, Charset charset) {
        Intrinsics.checkNotNullParameter($this$readLines, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        final ArrayList result = new ArrayList();
        FilesKt.forEachLine($this$readLines, charset, new FilesKt__FileReadWriteKt$$ExternalSyntheticLambda0(result));
        return result;
    }

    private static final Unit readLines$lambda$9$FilesKt__FileReadWriteKt(ArrayList $result, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $result.add(it);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object useLines$default(File $this$useLines_u24default, Charset charset, Function1 block, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L5;
        charset = Charsets.UTF_8;
    L5:
        Intrinsics.checkNotNullParameter($this$useLines_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(block, "block");
        Reader r8 = new InputStreamReader(new FileInputStream($this$useLines_u24default), charset);
        if ((r8 instanceof BufferedReader) == false) goto L8;
        BufferedReader r9 = (BufferedReader) r8;
    L9:
        BufferedReader r10 = r9;
        BufferedReader it = r10;     // Catch: Throwable -> L13
        Object r2 = block.invoke(TextStreamsKt.lineSequence(it));     // Catch: Throwable -> L13
        CloseableKt.closeFinally(r10, null);
        return r2;
    L13:
        th = move-exception;
        throw th;     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        CloseableKt.closeFinally(r10, th);
        throw th;
    L8:
        r9 = new BufferedReader(r8, 8192);
        goto L9
    }

    public static final <T> T useLines(File $this$useLines, Charset charset, Function1<? super Sequence<String>, ? extends T> r7) {
        Intrinsics.checkNotNullParameter($this$useLines, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(r7, "block");
        Reader r1 = new InputStreamReader(new FileInputStream($this$useLines), charset);
        if ((r1 instanceof BufferedReader) == false) goto L5;
        BufferedReader r2 = (BufferedReader) r1;
    L6:
        BufferedReader r3 = r2;
        BufferedReader it = r3;     // Catch: Throwable -> L10
        T r4 = r7.invoke(TextStreamsKt.lineSequence(it));     // Catch: Throwable -> L10
        CloseableKt.closeFinally(r3, null);
        return r4;
    L10:
        th = move-exception;
        throw th;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        CloseableKt.closeFinally(r3, th);
        throw th;
    L5:
        r2 = new BufferedReader(r1, 8192);
        goto L6
    }
}
