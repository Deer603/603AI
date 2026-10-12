package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GapBuffer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0001J\u0011\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0096\u0002J2\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0005J\u0018\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/text/input/internal/PartialGapBuffer;", "", "text", "(Ljava/lang/CharSequence;)V", "bufEnd", "", "bufStart", "buffer", "Landroidx/compose/foundation/text/input/internal/GapBuffer;", "length", "getLength", "()I", "contentEquals", "", "other", "get", "", "index", "replace", "", "start", "end", "textStart", "textEnd", "subSequence", "startIndex", "endIndex", "toString", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PartialGapBuffer implements CharSequence {
    public static final int $stable = 0;
    public static final int BUF_SIZE = 255;
    public static final Companion Companion = null;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;
    private int bufEnd;
    private int bufStart;
    private GapBuffer buffer;
    private CharSequence text;

    /* JADX INFO: compiled from: GapBuffer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/input/internal/PartialGapBuffer$Companion;", "", "()V", "BUF_SIZE", "", "NOWHERE", "SURROUNDING_SIZE", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public PartialGapBuffer(CharSequence text) {
        this.text = text;
        this.bufStart = -1;
        this.bufEnd = -1;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int index) {
        return get(index);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public int getLength() {
        GapBuffer buffer = this.buffer;
        CharSequence r1 = this.text;
        if (buffer != null) goto L7;
        return r1.length();
    L7:
        return (r1.length() - (this.bufEnd - this.bufStart)) + buffer.length();
    }

    public static /* synthetic */ void replace$default(PartialGapBuffer r6, int r7, int r8, CharSequence r9, int r10, int r11, int r12, Object r13) {
        if ((r12 & 8) == 0) goto L5;
        int r4 = 0;
    L7:
        if ((r12 & 16) == 0) goto L9;
        int r5 = r9.length();
    L10:
        r6.replace(r7, r8, r9, r4, r5);
        return;
    L9:
        r5 = r11;
        goto L10
    L5:
        r4 = r10;
        goto L7
    }

    public final void replace(int start, int end, CharSequence text, int textStart, int textEnd) {
        boolean value$iv = true;
        if (start > end) goto L5;
        boolean value$iv2 = true;
    L7:
        if (value$iv2 == true) goto L10;
        InlineClassHelperKt.throwIllegalArgumentException("start=" + start + " > end=" + end);
    L10:
        if (textStart > textEnd) goto L12;
        boolean value$iv3 = true;
    L14:
        if (value$iv3 == true) goto L17;
        InlineClassHelperKt.throwIllegalArgumentException("textStart=" + textStart + " > textEnd=" + textEnd);
    L17:
        if (start < 0) goto L19;
        boolean value$iv4 = true;
    L21:
        if (value$iv4 == true) goto L24;
        InlineClassHelperKt.throwIllegalArgumentException("start must be non-negative, but was " + start);
    L24:
        if (textStart >= 0) goto L28;
        value$iv = false;
    L28:
        if (value$iv == true) goto L30;
        InlineClassHelperKt.throwIllegalArgumentException("textStart must be non-negative, but was " + textStart);
    L30:
        GapBuffer buffer = this.buffer;
        int textLength = textEnd - textStart;
        if (buffer != null) goto L34;
        char[] charArray = new char[Math.max(255, textLength + 128)];
        int leftCopyCount = Math.min(start, 64);
        int rightCopyCount = Math.min(this.text.length() - end, 64);
        ToCharArray_androidKt.toCharArray(this.text, charArray, 0, start - leftCopyCount, start);
        ToCharArray_androidKt.toCharArray(this.text, charArray, charArray.length - rightCopyCount, end, end + rightCopyCount);
        ToCharArray_androidKt.toCharArray(text, charArray, leftCopyCount, textStart, textEnd);
        this.buffer = new GapBuffer(charArray, leftCopyCount + textLength, charArray.length - rightCopyCount);
        this.bufStart = start - leftCopyCount;
        this.bufEnd = end + rightCopyCount;
        return;
    L34:
        int bufferStart = start - this.bufStart;
        int bufferEnd = end - this.bufStart;
        if (bufferStart >= 0) goto L37;
    L41:
        this.text = toString();
        this.buffer = null;
        this.bufStart = -1;
        this.bufEnd = -1;
        replace(start, end, text, textStart, textEnd);
        return;
    L37:
        if (bufferEnd > buffer.length()) goto L41;
        buffer.replace(bufferStart, bufferEnd, text, textStart, textEnd);
        return;
    L19:
        value$iv4 = false;
        goto L21
    L12:
        value$iv3 = false;
        goto L14
    L5:
        value$iv2 = false;
        goto L7
    }

    public char get(int index) {
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

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int startIndex, int endIndex) {
        return toString().subSequence(startIndex, endIndex);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        GapBuffer b = this.buffer;
        if (b == null) goto L5;
        StringBuilder sb = new StringBuilder();
        sb.append(this.text, 0, this.bufStart);
        b.append(sb);
        sb.append(this.text, this.bufEnd, this.text.length());
        return sb.toString();
    L5:
        return this.text.toString();
    }

    public final boolean contentEquals(CharSequence other) {
        return Intrinsics.areEqual(toString(), other.toString());
    }
}
