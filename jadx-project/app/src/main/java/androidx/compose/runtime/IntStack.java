package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Stack.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004J\t\u0010\u000e\u001a\u00020\u000fH\u0086\bJ\t\u0010\u0010\u001a\u00020\u000fH\u0086\bJ\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004J\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004J\b\u0010\u0018\u001a\u00020\bH\u0002R\u0012\u0010\u0003\u001a\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/IntStack;", "", "()V", "size", "", "getSize", "()I", "slots", "", "tos", "clear", "", "indexOf", "value", "isEmpty", "", "isNotEmpty", "peek", "index", "peek2", "peekOr", "default", "pop", "push", "resize", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IntStack {
    public static final int $stable = 0;
    public int[] slots;
    public int tos;

    static {
        $stable = 8;
    }

    public IntStack() {
        this.slots = new int[10];
    }

    public final int getSize() {
        return this.tos;
    }

    private final int[] resize() {
        int[] copy = Arrays.copyOf(this.slots, this.slots.length * 2);
        Intrinsics.checkNotNullExpressionValue(copy, "copyOf(...)");
        this.slots = copy;
        return copy;
    }

    public final void push(int value) {
        int[] slots = this.slots;
        if (this.tos < slots.length) goto L5;
        slots = resize();
    L5:
        int r1 = this.tos;
        this.tos = r1 + 1;
        slots[r1] = value;
    }

    public final int pop() {
        int[] r0 = this.slots;
        this.tos--;
        return r0[this.tos];
    }

    public final int peekOr(int r3) {
        int index = this.tos - 1;
        if (index < 0) goto L6;
        return this.slots[index];
    L6:
        return r3;
    }

    public final int peek() {
        return this.slots[this.tos - 1];
    }

    public final int peek2() {
        return this.slots[this.tos - 2];
    }

    public final int peek(int index) {
        return this.slots[index];
    }

    public final boolean isEmpty() {
        if (this.tos != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean isNotEmpty() {
        if (this.tos == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final void clear() {
        this.tos = 0;
    }

    public final int indexOf(int value) {
        int[] slots = this.slots;
        int end = Math.min(slots.length, this.tos);
        int i = 0;
    L3:
        if (i >= end) goto L8;
        if (slots[i] == value) goto L6;
        i = i + 1;
        goto L3
    L6:
        return i;
    L8:
        return -1;
    }
}
