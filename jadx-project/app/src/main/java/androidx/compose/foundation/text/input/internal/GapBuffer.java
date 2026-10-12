package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GapBuffer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\b\u0010\u0014\u001a\u00020\u0005H\u0002J\u0011\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0086\u0002J\u0006\u0010\u0018\u001a\u00020\u0005J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0005H\u0002J2\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u0005J\b\u0010 \u001a\u00020!H\u0016R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Landroidx/compose/foundation/text/input/internal/GapBuffer;", "", "initBuffer", "", "initGapStart", "", "initGapEnd", "([CII)V", "buffer", "capacity", "gapEnd", "gapStart", "append", "", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "delete", "start", "end", "gapLength", "get", "", "index", "length", "makeSureAvailableSpace", "requestSize", "replace", "text", "", "textStart", "textEnd", "toString", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class GapBuffer {
    private char[] buffer;
    private int capacity;
    private int gapEnd;
    private int gapStart;

    public GapBuffer(char[] initBuffer, int initGapStart, int initGapEnd) {
        this.capacity = initBuffer.length;
        this.buffer = initBuffer;
        this.gapStart = initGapStart;
        this.gapEnd = initGapEnd;
    }

    private final int gapLength() {
        return this.gapEnd - this.gapStart;
    }

    public final char get(int index) {
        int r0 = this.gapStart;
        char[] r1 = this.buffer;
        if (index >= r0) goto L7;
        return r1[index];
    L7:
        return r1[(index - this.gapStart) + this.gapEnd];
    }

    private final void makeSureAvailableSpace(int requestSize) {
        if (requestSize > gapLength()) goto L5;
        return;
    L5:
        int necessarySpace = requestSize - gapLength();
        int newCapacity = this.capacity;
    L6:
        newCapacity = newCapacity * 2;
        if ((newCapacity - this.capacity) < necessarySpace) goto L6;
        char[] newBuffer = new char[newCapacity];
        ArraysKt.copyInto(this.buffer, newBuffer, 0, 0, this.gapStart);
        int tailLength = this.capacity - this.gapEnd;
        int newEnd = newCapacity - tailLength;
        ArraysKt.copyInto(this.buffer, newBuffer, newEnd, this.gapEnd, this.gapEnd + tailLength);
        this.buffer = newBuffer;
        this.capacity = newCapacity;
        this.gapEnd = newEnd;
    }

    private final void delete(int start, int end) {
        if (start >= this.gapStart) goto L8;
        if (end > this.gapStart) goto L8;
        int copyLen = this.gapStart - end;
        ArraysKt.copyInto(this.buffer, this.buffer, this.gapEnd - copyLen, end, this.gapStart);
        this.gapStart = start;
        this.gapEnd -= copyLen;
        return;
    L8:
        if (start < this.gapStart) goto L10;
    L12:
        int startInBuffer = gapLength() + start;
        int endInBuffer = gapLength() + end;
        int copyLen2 = startInBuffer - this.gapEnd;
        ArraysKt.copyInto(this.buffer, this.buffer, this.gapStart, this.gapEnd, startInBuffer);
        this.gapStart += copyLen2;
        this.gapEnd = endInBuffer;
        return;
    L10:
        if (end < this.gapStart) goto L12;
        this.gapEnd = gapLength() + end;
        this.gapStart = start;
    }

    public static /* synthetic */ void replace$default(GapBuffer r6, int r7, int r8, CharSequence r9, int r10, int r11, int r12, Object r13) {
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
        int textLength = textEnd - textStart;
        makeSureAvailableSpace(textLength - (end - start));
        delete(start, end);
        ToCharArray_androidKt.toCharArray(text, this.buffer, this.gapStart, textStart, textEnd);
        this.gapStart += textLength;
    }

    public final void append(StringBuilder builder) {
        Intrinsics.checkNotNullExpressionValue(builder.append(this.buffer, 0, this.gapStart - 0), "append(...)");
        char[] r0 = this.buffer;
        int r2 = this.gapEnd;
        Intrinsics.checkNotNullExpressionValue(builder.append(r0, r2, this.capacity - r2), "append(...)");
    }

    public final int length() {
        return this.capacity - gapLength();
    }

    public String toString() {
        StringBuilder $this$toString_u24lambda_u240 = new StringBuilder();
        $this$toString_u24lambda_u240.append($this$toString_u24lambda_u240);
        return $this$toString_u24lambda_u240.toString();
    }
}
