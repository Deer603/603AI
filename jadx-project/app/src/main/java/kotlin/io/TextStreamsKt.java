package kotlin.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: ReadWrite.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u001e\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n\u001a\u0010\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r*\u00020\u0002\u001aB\u0010\u000e\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f*\u00020\u00022\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0011\u0012\u0004\u0012\u0002H\u000f0\nH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0014*\u00020\u000bH\u0087\b\u001a\u0010\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011*\u00020\u0001\u001a\n\u0010\u0016\u001a\u00020\u000b*\u00020\u0002\u001a\u001c\u0010\u0017\u001a\u00020\u0018*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u0017\u0010\u0016\u001a\u00020\u000b*\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0087\b\u001a\n\u0010\u001d\u001a\u00020\u001e*\u00020\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"buffered", "Ljava/io/BufferedReader;", "Ljava/io/Reader;", "bufferSize", "", "Ljava/io/BufferedWriter;", "Ljava/io/Writer;", "forEachLine", "", "action", "Lkotlin/Function1;", "", "readLines", "", "useLines", "T", "block", "Lkotlin/sequences/Sequence;", "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "reader", "Ljava/io/StringReader;", "lineSequence", "readText", "copyTo", "", "out", "Ljava/net/URL;", "charset", "Ljava/nio/charset/Charset;", "readBytes", "", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class TextStreamsKt {
    static /* synthetic */ BufferedReader buffered$default(Reader $this$buffered_u24default, int bufferSize, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        bufferSize = 8192;
    L5:
        Intrinsics.checkNotNullParameter($this$buffered_u24default, "<this>");
        if (($this$buffered_u24default instanceof BufferedReader) == false) goto L9;
        return (BufferedReader) $this$buffered_u24default;
    L9:
        return new BufferedReader($this$buffered_u24default, bufferSize);
    }

    private static final BufferedReader buffered(Reader $this$buffered, int bufferSize) {
        Intrinsics.checkNotNullParameter($this$buffered, "<this>");
        if (($this$buffered instanceof BufferedReader) == false) goto L6;
        return (BufferedReader) $this$buffered;
    L6:
        return new BufferedReader($this$buffered, bufferSize);
    }

    static /* synthetic */ BufferedWriter buffered$default(Writer $this$buffered_u24default, int bufferSize, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        bufferSize = 8192;
    L5:
        Intrinsics.checkNotNullParameter($this$buffered_u24default, "<this>");
        if (($this$buffered_u24default instanceof BufferedWriter) == false) goto L9;
        return (BufferedWriter) $this$buffered_u24default;
    L9:
        return new BufferedWriter($this$buffered_u24default, bufferSize);
    }

    private static final BufferedWriter buffered(Writer $this$buffered, int bufferSize) {
        Intrinsics.checkNotNullParameter($this$buffered, "<this>");
        if (($this$buffered instanceof BufferedWriter) == false) goto L6;
        return (BufferedWriter) $this$buffered;
    L6:
        return new BufferedWriter($this$buffered, bufferSize);
    }

    public static final void forEachLine(Reader $this$forEachLine, Function1<? super String, Unit> r12) {
        Intrinsics.checkNotNullParameter($this$forEachLine, "<this>");
        Intrinsics.checkNotNullParameter(r12, "action");
        if (($this$forEachLine instanceof BufferedReader) == false) goto L5;
        BufferedReader r2 = (BufferedReader) $this$forEachLine;
    L6:
        BufferedReader r3 = r2;
        BufferedReader it$iv = r3;     // Catch: Throwable -> L14
        Iterator<String> r9 = lineSequence(it$iv).iterator();     // Catch: Throwable -> L14
    L9:
        if (r9.hasNext() == false) goto L11;
        Object element$iv = r9.next();     // Catch: Throwable -> L14
        r12.invoke(element$iv);     // Catch: Throwable -> L14
        goto L9
    L11:
        Unit r5 = Unit.INSTANCE;     // Catch: Throwable -> L14
        CloseableKt.closeFinally(r3, null);
        return;
    L14:
        th = move-exception;
        throw th;     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        CloseableKt.closeFinally(r3, th);
        throw th;
    L5:
        r2 = new BufferedReader($this$forEachLine, 8192);
        goto L6
    }

    public static final List<String> readLines(Reader $this$readLines) {
        Intrinsics.checkNotNullParameter($this$readLines, "<this>");
        final ArrayList result = new ArrayList();
        forEachLine($this$readLines, new TextStreamsKt$$ExternalSyntheticLambda0(result));
        return result;
    }

    static final Unit readLines$lambda$1(ArrayList $result, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $result.add(it);
        return Unit.INSTANCE;
    }

    public static final <T> T useLines(Reader $this$useLines, Function1<? super Sequence<String>, ? extends T> r6) {
        Intrinsics.checkNotNullParameter($this$useLines, "<this>");
        Intrinsics.checkNotNullParameter(r6, "block");
        if (($this$useLines instanceof BufferedReader) == false) goto L5;
        BufferedReader r1 = (BufferedReader) $this$useLines;
    L6:
        BufferedReader r2 = r1;
        BufferedReader it = r2;     // Catch: Throwable -> L10
        T r4 = r6.invoke(lineSequence(it));     // Catch: Throwable -> L10
        CloseableKt.closeFinally(r2, null);
        return r4;
    L10:
        th = move-exception;
        throw th;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        CloseableKt.closeFinally(r2, th);
        throw th;
    L5:
        r1 = new BufferedReader($this$useLines, 8192);
        goto L6
    }

    private static final StringReader reader(String $this$reader) {
        Intrinsics.checkNotNullParameter($this$reader, "<this>");
        return new StringReader($this$reader);
    }

    public static final Sequence<String> lineSequence(BufferedReader $this$lineSequence) {
        Intrinsics.checkNotNullParameter($this$lineSequence, "<this>");
        return SequencesKt.constrainOnce(new LinesSequence($this$lineSequence));
    }

    public static final String readText(Reader $this$readText) {
        Intrinsics.checkNotNullParameter($this$readText, "<this>");
        StringWriter buffer = new StringWriter();
        copyTo$default($this$readText, buffer, 0, 2, null);
        String r1 = buffer.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    }

    public static /* synthetic */ long copyTo$default(Reader r0, Writer r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = 8192;
    L6:
        return copyTo(r0, r1, r2);
    }

    public static final long copyTo(Reader $this$copyTo, Writer out, int bufferSize) {
        Intrinsics.checkNotNullParameter($this$copyTo, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        long charsCopied = 0;
        char[] buffer = new char[bufferSize];
        int chars = $this$copyTo.read(buffer);
    L3:
        if (chars < 0) goto L5;
        out.write(buffer, 0, chars);
        charsCopied = charsCopied + ((long) chars);
        chars = $this$copyTo.read(buffer);
        goto L3
    L5:
        return charsCopied;
    }

    static /* synthetic */ String readText$default(URL $this$readText_u24default, Charset charset, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        charset = Charsets.UTF_8;
    L5:
        Intrinsics.checkNotNullParameter($this$readText_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(readBytes($this$readText_u24default), charset);
    }

    private static final String readText(URL $this$readText, Charset charset) {
        Intrinsics.checkNotNullParameter($this$readText, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(readBytes($this$readText), charset);
    }

    public static final byte[] readBytes(URL $this$readBytes) {
        Intrinsics.checkNotNullParameter($this$readBytes, "<this>");
        InputStream r0 = $this$readBytes.openStream();
        InputStream it = r0;     // Catch: Throwable -> L6
        Intrinsics.checkNotNull(it);     // Catch: Throwable -> L6
        byte[] r3 = ByteStreamsKt.readBytes(it);     // Catch: Throwable -> L6
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
}
