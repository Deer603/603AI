package kotlin.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.ByteIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: IOStreams.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0087\b\u001a\r\u0010\b\u001a\u00020\u0004*\u00020\tH\u0087\b\u001a\u001d\u0010\b\u001a\u00020\u0004*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0087\b\u001a\u0017\u0010\r\u001a\u00020\u0002*\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0087\b\u001a\u0017\u0010\u0010\u001a\u00020\u0011*\u00020\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0087\b\u001a\u0017\u0010\u0012\u001a\u00020\u0013*\u00020\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0087\b\u001a\u0017\u0010\r\u001a\u00020\u0014*\u00020\u00152\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0087\b\u001a\u0017\u0010\u0016\u001a\u00020\u0017*\u00020\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0087\b\u001a\u0017\u0010\u0018\u001a\u00020\u0019*\u00020\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0087\b\u001a\u001c\u0010\u001a\u001a\u00020\u001b*\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u001a\u0016\u0010\u001d\u001a\u00020\t*\u00020\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u000bH\u0007\u001a\f\u0010\u001d\u001a\u00020\t*\u00020\u000eH\u0007¨\u0006\u001f"}, d2 = {"iterator", "Lkotlin/collections/ByteIterator;", "Ljava/io/BufferedInputStream;", "byteInputStream", "Ljava/io/ByteArrayInputStream;", "", "charset", "Ljava/nio/charset/Charset;", "inputStream", "", "offset", "", "length", "buffered", "Ljava/io/InputStream;", "bufferSize", "reader", "Ljava/io/InputStreamReader;", "bufferedReader", "Ljava/io/BufferedReader;", "Ljava/io/BufferedOutputStream;", "Ljava/io/OutputStream;", "writer", "Ljava/io/OutputStreamWriter;", "bufferedWriter", "Ljava/io/BufferedWriter;", "copyTo", "", "out", "readBytes", "estimatedSize", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ByteStreamsKt {
    public static final ByteIterator iterator(final BufferedInputStream $this$iterator) {
        Intrinsics.checkNotNullParameter($this$iterator, "<this>");
        return new AnonymousClass1($this$iterator);
    }

    static /* synthetic */ ByteArrayInputStream byteInputStream$default(String $this$byteInputStream_u24default, Charset charset, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        charset = Charsets.UTF_8;
    L5:
        Intrinsics.checkNotNullParameter($this$byteInputStream_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] r5 = $this$byteInputStream_u24default.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(r5, "getBytes(...)");
        return new ByteArrayInputStream(r5);
    }

    private static final ByteArrayInputStream byteInputStream(String $this$byteInputStream, Charset charset) {
        Intrinsics.checkNotNullParameter($this$byteInputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] r1 = $this$byteInputStream.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(r1, "getBytes(...)");
        return new ByteArrayInputStream(r1);
    }

    private static final ByteArrayInputStream inputStream(byte[] $this$inputStream) {
        Intrinsics.checkNotNullParameter($this$inputStream, "<this>");
        return new ByteArrayInputStream($this$inputStream);
    }

    private static final ByteArrayInputStream inputStream(byte[] $this$inputStream, int offset, int length) {
        Intrinsics.checkNotNullParameter($this$inputStream, "<this>");
        return new ByteArrayInputStream($this$inputStream, offset, length);
    }

    static /* synthetic */ BufferedInputStream buffered$default(InputStream $this$buffered_u24default, int bufferSize, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        bufferSize = 8192;
    L5:
        Intrinsics.checkNotNullParameter($this$buffered_u24default, "<this>");
        if (($this$buffered_u24default instanceof BufferedInputStream) == false) goto L9;
        return (BufferedInputStream) $this$buffered_u24default;
    L9:
        return new BufferedInputStream($this$buffered_u24default, bufferSize);
    }

    private static final BufferedInputStream buffered(InputStream $this$buffered, int bufferSize) {
        Intrinsics.checkNotNullParameter($this$buffered, "<this>");
        if (($this$buffered instanceof BufferedInputStream) == false) goto L6;
        return (BufferedInputStream) $this$buffered;
    L6:
        return new BufferedInputStream($this$buffered, bufferSize);
    }

    static /* synthetic */ InputStreamReader reader$default(InputStream $this$reader_u24default, Charset charset, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        charset = Charsets.UTF_8;
    L5:
        Intrinsics.checkNotNullParameter($this$reader_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new InputStreamReader($this$reader_u24default, charset);
    }

    private static final InputStreamReader reader(InputStream $this$reader, Charset charset) {
        Intrinsics.checkNotNullParameter($this$reader, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new InputStreamReader($this$reader, charset);
    }

    static /* synthetic */ BufferedReader bufferedReader$default(InputStream $this$bufferedReader_u24default, Charset charset, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        charset = Charsets.UTF_8;
    L5:
        Intrinsics.checkNotNullParameter($this$bufferedReader_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Reader r5 = new InputStreamReader($this$bufferedReader_u24default, charset);
        if ((r5 instanceof BufferedReader) == false) goto L9;
        return (BufferedReader) r5;
    L9:
        return new BufferedReader(r5, 8192);
    }

    private static final BufferedReader bufferedReader(InputStream $this$bufferedReader, Charset charset) {
        Intrinsics.checkNotNullParameter($this$bufferedReader, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Reader r0 = new InputStreamReader($this$bufferedReader, charset);
        if ((r0 instanceof BufferedReader) == false) goto L6;
        return (BufferedReader) r0;
    L6:
        return new BufferedReader(r0, 8192);
    }

    static /* synthetic */ BufferedOutputStream buffered$default(OutputStream $this$buffered_u24default, int bufferSize, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        bufferSize = 8192;
    L5:
        Intrinsics.checkNotNullParameter($this$buffered_u24default, "<this>");
        if (($this$buffered_u24default instanceof BufferedOutputStream) == false) goto L9;
        return (BufferedOutputStream) $this$buffered_u24default;
    L9:
        return new BufferedOutputStream($this$buffered_u24default, bufferSize);
    }

    private static final BufferedOutputStream buffered(OutputStream $this$buffered, int bufferSize) {
        Intrinsics.checkNotNullParameter($this$buffered, "<this>");
        if (($this$buffered instanceof BufferedOutputStream) == false) goto L6;
        return (BufferedOutputStream) $this$buffered;
    L6:
        return new BufferedOutputStream($this$buffered, bufferSize);
    }

    static /* synthetic */ OutputStreamWriter writer$default(OutputStream $this$writer_u24default, Charset charset, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        charset = Charsets.UTF_8;
    L5:
        Intrinsics.checkNotNullParameter($this$writer_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter($this$writer_u24default, charset);
    }

    private static final OutputStreamWriter writer(OutputStream $this$writer, Charset charset) {
        Intrinsics.checkNotNullParameter($this$writer, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter($this$writer, charset);
    }

    static /* synthetic */ BufferedWriter bufferedWriter$default(OutputStream $this$bufferedWriter_u24default, Charset charset, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        charset = Charsets.UTF_8;
    L5:
        Intrinsics.checkNotNullParameter($this$bufferedWriter_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Writer r5 = new OutputStreamWriter($this$bufferedWriter_u24default, charset);
        if ((r5 instanceof BufferedWriter) == false) goto L9;
        return (BufferedWriter) r5;
    L9:
        return new BufferedWriter(r5, 8192);
    }

    private static final BufferedWriter bufferedWriter(OutputStream $this$bufferedWriter, Charset charset) {
        Intrinsics.checkNotNullParameter($this$bufferedWriter, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Writer r0 = new OutputStreamWriter($this$bufferedWriter, charset);
        if ((r0 instanceof BufferedWriter) == false) goto L6;
        return (BufferedWriter) r0;
    L6:
        return new BufferedWriter(r0, 8192);
    }

    public static /* synthetic */ long copyTo$default(InputStream r0, OutputStream r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = 8192;
    L6:
        return copyTo(r0, r1, r2);
    }

    public static final long copyTo(InputStream $this$copyTo, OutputStream out, int bufferSize) {
        Intrinsics.checkNotNullParameter($this$copyTo, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        long bytesCopied = 0;
        byte[] buffer = new byte[bufferSize];
        int bytes = $this$copyTo.read(buffer);
    L3:
        if (bytes < 0) goto L5;
        out.write(buffer, 0, bytes);
        bytesCopied = bytesCopied + ((long) bytes);
        bytes = $this$copyTo.read(buffer);
        goto L3
    L5:
        return bytesCopied;
    }

    public static /* synthetic */ byte[] readBytes$default(InputStream r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = 8192;
    L6:
        return readBytes(r0, r1);
    }

    @Deprecated(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @ReplaceWith(expression = "readBytes()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", warningSince = "1.3")
    public static final byte[] readBytes(InputStream $this$readBytes, int estimatedSize) {
        Intrinsics.checkNotNullParameter($this$readBytes, "<this>");
        ByteArrayOutputStream buffer = new ByteArrayOutputStream(Math.max(estimatedSize, $this$readBytes.available()));
        copyTo$default($this$readBytes, buffer, 0, 2, null);
        byte[] r1 = buffer.toByteArray();
        Intrinsics.checkNotNullExpressionValue(r1, "toByteArray(...)");
        return r1;
    }

    public static final byte[] readBytes(InputStream $this$readBytes) {
        Intrinsics.checkNotNullParameter($this$readBytes, "<this>");
        ByteArrayOutputStream buffer = new ByteArrayOutputStream(Math.max(8192, $this$readBytes.available()));
        copyTo$default($this$readBytes, buffer, 0, 2, null);
        byte[] r1 = buffer.toByteArray();
        Intrinsics.checkNotNullExpressionValue(r1, "toByteArray(...)");
        return r1;
    }
}
