package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MyersDiff.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0011\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0086\u0002J\u0006\u0010\u0011\u001a\u00020\fJ \u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u0006\u0010\u0016\u001a\u00020\u0003J\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003J&\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003J \u0010 \u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u0010\u0010!\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010\"\u001a\u00020\u0018J\u0018\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\u0002R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Landroidx/compose/ui/node/IntStack;", "", "initialCapacity", "", "(I)V", "lastIndex", "size", "getSize", "()I", "stack", "", "compareDiagonal", "", "a", "b", "get", "index", "isNotEmpty", "partition", "start", "end", "elSize", "pop", "pushDiagonal", "", "x", "y", "pushRange", "oldStart", "oldEnd", "newStart", "newEnd", "quickSort", "resizeStack", "sortDiagonals", "swapDiagonal", "i", "j", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class IntStack {
    private int lastIndex;
    private int[] stack;

    public IntStack(int initialCapacity) {
        this.stack = new int[initialCapacity];
    }

    public final int get(int index) {
        return this.stack[index];
    }

    public final int getSize() {
        return this.lastIndex;
    }

    private final int[] resizeStack(int[] stack) {
        int[] copy = Arrays.copyOf(stack, stack.length * 2);
        Intrinsics.checkNotNullExpressionValue(copy, "copyOf(...)");
        this.stack = copy;
        return copy;
    }

    public final void pushRange(int oldStart, int oldEnd, int newStart, int newEnd) {
        int i = this.lastIndex;
        int[] stack = this.stack;
        if ((i + 4) < stack.length) goto L5;
        stack = resizeStack(stack);
    L5:
        stack[i + 0] = oldStart;
        stack[i + 1] = oldEnd;
        stack[i + 2] = newStart;
        stack[i + 3] = newEnd;
        this.lastIndex = i + 4;
    }

    public final void pushDiagonal(int x, int y, int size) {
        int i = this.lastIndex;
        int[] stack = this.stack;
        if ((i + 3) < stack.length) goto L5;
        stack = resizeStack(stack);
    L5:
        stack[i + 0] = x + size;
        stack[i + 1] = y + size;
        stack[i + 2] = size;
        this.lastIndex = i + 3;
    }

    public final int pop() {
        int[] r0 = this.stack;
        this.lastIndex--;
        return r0[this.lastIndex];
    }

    public final boolean isNotEmpty() {
        if (this.lastIndex == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final void sortDiagonals() {
        int i = this.lastIndex;
        if ((i % 3) != 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L10;
        InlineClassHelperKt.throwIllegalStateException("Array size not a multiple of 3");
    L10:
        if (i <= 3) goto L13;
        quickSort(0, i - 3, 3);
        return;
    L13:
        return;
    L5:
        value$iv = false;
        goto L7
    }

    private final void quickSort(int start, int end, int elSize) {
        if (start >= end) goto L5;
        int i = partition(start, end, elSize);
        quickSort(start, i - elSize, elSize);
        quickSort(i + elSize, end, elSize);
        return;
    }

    private final int partition(int start, int end, int elSize) {
        int i = start - elSize;
        int j = start;
    L3:
        if (j >= end) goto L8;
        if (compareDiagonal(j, end) == false) goto L7;
        i = i + elSize;
        swapDiagonal(i, j);
    L7:
        j = j + elSize;
        goto L3
    L8:
        swapDiagonal(i + elSize, end);
        return i + elSize;
    }

    private final void swapDiagonal(int i, int j) {
        int[] stack = this.stack;
        MyersDiffKt.access$swap(stack, i, j);
        MyersDiffKt.access$swap(stack, i + 1, j + 1);
        MyersDiffKt.access$swap(stack, i + 2, j + 2);
    }

    private final boolean compareDiagonal(int a, int b) {
        int[] stack = this.stack;
        int a0 = stack[a];
        int b0 = stack[b];
        if (a0 < b0) goto L9;
        if (a0 == b0) goto L6;
    L8:
        return false;
    L6:
        if (stack[a + 1] > stack[b + 1]) goto L8;
    L9:
        return true;
    }
}
