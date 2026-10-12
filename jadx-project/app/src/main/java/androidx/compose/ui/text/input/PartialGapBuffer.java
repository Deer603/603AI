package androidx.compose.ui.text.input;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: GapBuffer.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0086\u0002J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0004¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/input/PartialGapBuffer;", "", "text", "", "(Ljava/lang/String;)V", "bufEnd", "", "bufStart", "buffer", "Landroidx/compose/ui/text/input/GapBuffer;", "length", "getLength", "()I", "getText", "()Ljava/lang/String;", "setText", "get", "", "index", "replace", "", "start", "end", "toString", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PartialGapBuffer {
    public static final int $stable = 0;
    public static final int BUF_SIZE = 255;
    public static final Companion Companion = null;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;
    private int bufEnd;
    private int bufStart;
    private GapBuffer buffer;
    private String text;

    /* JADX INFO: compiled from: GapBuffer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/input/PartialGapBuffer$Companion;", "", "()V", "BUF_SIZE", "", "NOWHERE", "SURROUNDING_SIZE", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
    }

    public PartialGapBuffer(String text) {
        this.text = text;
        this.bufStart = -1;
        this.bufEnd = -1;
    }

    public final String getText() {
        return this.text;
    }

    public final void setText(String r1) {
        this.text = r1;
    }

    public final int getLength() {
        GapBuffer buffer = this.buffer;
        String r1 = this.text;
        if (buffer != null) goto L7;
        return r1.length();
    L7:
        return (r1.length() - (this.bufEnd - this.bufStart)) + buffer.length();
    }

    public final void replace(int start, int end, String text) {
        boolean value$iv = true;
        if (start > end) goto L5;
        boolean value$iv2 = true;
    L7:
        if (value$iv2 == true) goto L10;
        InlineClassHelperKt.throwIllegalArgumentException("start index must be less than or equal to end index: " + start + " > " + end);
    L10:
        if (start >= 0) goto L14;
        value$iv = false;
    L14:
        if (value$iv == true) goto L16;
        InlineClassHelperKt.throwIllegalArgumentException("start must be non-negative, but was " + start);
    L16:
        GapBuffer buffer = this.buffer;
        if (buffer != null) goto L20;
        char[] charArray = new char[Math.max(255, text.length() + 128)];
        int leftCopyCount = Math.min(start, 64);
        int rightCopyCount = Math.min(this.text.length() - end, 64);
        GapBuffer_jvmKt.toCharArray(this.text, charArray, 0, start - leftCopyCount, start);
        GapBuffer_jvmKt.toCharArray(this.text, charArray, charArray.length - rightCopyCount, end, end + rightCopyCount);
        GapBufferKt.access$toCharArray(text, charArray, leftCopyCount);
        this.buffer = new GapBuffer(charArray, text.length() + leftCopyCount, charArray.length - rightCopyCount);
        this.bufStart = start - leftCopyCount;
        this.bufEnd = end + rightCopyCount;
        return;
    L20:
        int bufferStart = start - this.bufStart;
        int bufferEnd = end - this.bufStart;
        if (bufferStart >= 0) goto L23;
    L27:
        this.text = toString();
        this.buffer = null;
        this.bufStart = -1;
        this.bufEnd = -1;
        replace(start, end, text);
        return;
    L23:
        if (bufferEnd > buffer.length()) goto L27;
        buffer.replace(bufferStart, bufferEnd, text);
        return;
    L5:
        value$iv2 = false;
        goto L7
    }

    public final char get(int index) {
        GapBuffer buffer = this.buffer;
        if (buffer != null) goto L7;
        return this.text.charAt(index);
    L7:
        if (index < this.bufStart) goto L9;
        int gapBufLength = buffer.length();
        if (index >= (this.bufStart + gapBufLength)) goto L15;
        return buffer.get(index - this.bufStart);
    L15:
        return this.text.charAt(index - ((gapBufLength - this.bufEnd) + this.bufStart));
    L9:
        return this.text.charAt(index);
    }

    public String toString() {
        GapBuffer b = this.buffer;
        if (b == null) goto L5;
        StringBuilder sb = new StringBuilder();
        sb.append(this.text, 0, this.bufStart);
        b.append(sb);
        sb.append(this.text, this.bufEnd, this.text.length());
        return sb.toString();
    L5:
        return this.text;
    }
}
