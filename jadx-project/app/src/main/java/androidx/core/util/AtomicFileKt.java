package androidx.core.util;

import androidx.autofill.HintConstants;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: AtomicFile.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\b\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a0\u0010\u0007\u001a\u00020\b*\u00020\u00022!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\b0\nH\u0086\b\u001a\u0012\u0010\u000f\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0001\u001a\u001c\u0010\u0011\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0013"}, d2 = {"readBytes", "", "Landroid/util/AtomicFile;", "readText", "", "charset", "Ljava/nio/charset/Charset;", "tryWrite", "", "block", "Lkotlin/Function1;", "Ljava/io/FileOutputStream;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "out", "writeBytes", "array", "writeText", "text", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AtomicFileKt {
    public static final void tryWrite(android.util.AtomicFile $this$tryWrite, Function1<? super FileOutputStream, Unit> r5) {
        FileOutputStream stream = $this$tryWrite.startWrite();
        r5.invoke(stream);     // Catch: Throwable -> L6
        $this$tryWrite.finishWrite(stream);
        return;
    L6:
        th = move-exception;
        $this$tryWrite.failWrite(stream);
        throw th;
    }

    public static final void writeBytes(android.util.AtomicFile $this$writeBytes, byte[] array) {
        FileOutputStream stream$iv = $this$writeBytes.startWrite();
        stream$iv.write(array);     // Catch: Throwable -> L6
        $this$writeBytes.finishWrite(stream$iv);
        return;
    L6:
        th = move-exception;
        $this$writeBytes.failWrite(stream$iv);
        throw th;
    }

    public static /* synthetic */ void writeText$default(android.util.AtomicFile r0, String r1, Charset r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = Charsets.UTF_8;
    L5:
        writeText(r0, r1, r2);
    }

    public static final void writeText(android.util.AtomicFile $this$writeText, String text, Charset charset) {
        byte[] r0 = text.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(r0, "this as java.lang.String).getBytes(charset)");
        writeBytes($this$writeText, r0);
    }

    public static final byte[] readBytes(android.util.AtomicFile $this$readBytes) {
        return $this$readBytes.readFully();
    }

    public static /* synthetic */ String readText$default(android.util.AtomicFile r0, Charset r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = Charsets.UTF_8;
    L6:
        return readText(r0, r1);
    }

    public static final String readText(android.util.AtomicFile $this$readText, Charset charset) {
        return new String($this$readText.readFully(), charset);
    }
}
