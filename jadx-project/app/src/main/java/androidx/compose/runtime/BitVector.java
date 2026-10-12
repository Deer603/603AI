package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0086\u0002J%\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0011H\u0082\bJ\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tJ\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tJ\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\rH\u0086\u0002J\u0016\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tJ\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/BitVector;", "", "()V", "first", "", "others", "", "second", "size", "", "getSize", "()I", "get", "", "index", "nextBit", "valueSelector", "Lkotlin/Function1;", "nextClear", "nextSet", "set", "", "value", "setRange", "start", "end", "toString", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BitVector {
    public static final int $stable = 0;
    private long first;
    private long[] others;
    private long second;

    static {
        $stable = 8;
    }

    public BitVector() {
        this.others = SlotTableKt.access$getEmptyLongArray$p();
    }

    public final int getSize() {
        return (this.others.length + 2) * 64;
    }

    public final boolean get(int index) {
        if (index >= 64) goto L10;
        if (((1 << index) & this.first) == 0) goto L8;
        return true;
    L8:
        return false;
    L10:
        if (index < 128) goto L12;
        long[] others = this.others;
        int size = others.length;
        if (size != 0) goto L19;
        return false;
    L19:
        int address = (index / 64) - 2;
        if (address < size) goto L22;
        return false;
    L22:
        int bit = index % 64;
        if (((1 << bit) & others[address]) == 0) goto L26;
        return true;
    L26:
        return false;
    L12:
        if (((1 << (index - 64)) & this.second) == 0) goto L15;
        return true;
    L15:
        return false;
    }

    public final void set(int index, boolean value) {
        int r1 = 0;
        if (index >= 64) goto L10;
        long mask = 1 << index;
        long r5 = this.first & (~mask);
        if (value == false) goto L7;
        r1 = 1;
    L7:
        this.first = (((long) r1) << index) | r5;
        return;
    L10:
        if (index >= 128) goto L16;
        long mask2 = 1 << (index - 64);
        long r6 = this.second & (~mask2);
        if (value == false) goto L14;
        r1 = 1;
    L14:
        this.second = (((long) r1) << index) | r6;
        return;
    L16:
        int address = (index / 64) - 2;
        int newIndex = index % 64;
        long mask3 = 1 << newIndex;
        long[] others = this.others;
        if (address < others.length) goto L19;
        long[] r7 = Arrays.copyOf(others, address + 1);
        Intrinsics.checkNotNullExpressionValue(r7, "copyOf(...)");
        others = r7;
        this.others = others;
    L19:
        long bits = others[address];
        long r9 = (~mask3) & bits;
        if (value == false) goto L22;
        r1 = 1;
    L22:
        others[address] = r9 | (((long) r1) << newIndex);
    }

    public final int nextSet(int index) {
        if (index >= 64) goto L8;
        long it = this.first;
        long $this$firstBitSet$iv$iv = (it >>> index) << index;
        int bit$iv = Long.numberOfTrailingZeros($this$firstBitSet$iv$iv);
        if (bit$iv >= 64) goto L8;
        return bit$iv;
    L8:
        if (index >= 128) goto L12;
        int index$iv = index - 64;
        long it2 = this.second;
        long $this$firstBitSet$iv$iv2 = (it2 >>> index$iv) << index$iv;
        int bit$iv2 = Long.numberOfTrailingZeros($this$firstBitSet$iv$iv2);
        if (bit$iv2 >= 64) goto L12;
        return bit$iv2 + 64;
    L12:
        int index$iv2 = Math.max(index, 128);
        int start$iv = (index$iv2 / 64) - 2;
        long[] others$iv = this.others;
        int i$iv = start$iv;
        int r9 = others$iv.length;
    L13:
        if (i$iv >= r9) goto L22;
        long value$iv = others$iv[i$iv];
        if (i$iv != start$iv) goto L17;
        int shift$iv = index$iv2 % 64;
        value$iv = (value$iv >>> shift$iv) << shift$iv;
    L17:
        long $this$firstBitSet$iv$iv3 = value$iv;
        int bit$iv3 = Long.numberOfTrailingZeros($this$firstBitSet$iv$iv3);
        if (bit$iv3 < 64) goto L26;
        i$iv = i$iv + 1;
        goto L13
    L26:
        return ((i$iv * 64) + 128) + bit$iv3;
    L22:
        return Integer.MAX_VALUE;
    }

    public final int nextClear(int index) {
        if (index >= 64) goto L8;
        long it = this.first;
        long $this$firstBitSet$iv$iv = ((~it) >>> index) << index;
        int bit$iv = Long.numberOfTrailingZeros($this$firstBitSet$iv$iv);
        if (bit$iv >= 64) goto L8;
        return bit$iv;
    L8:
        if (index >= 128) goto L12;
        int index$iv = index - 64;
        long it2 = this.second;
        long $this$firstBitSet$iv$iv2 = ((~it2) >>> index$iv) << index$iv;
        int bit$iv2 = Long.numberOfTrailingZeros($this$firstBitSet$iv$iv2);
        if (bit$iv2 >= 64) goto L12;
        return bit$iv2 + 64;
    L12:
        int index$iv2 = Math.max(index, 128);
        int start$iv = (index$iv2 / 64) - 2;
        long[] others$iv = this.others;
        int i$iv = start$iv;
        int r9 = others$iv.length;
    L13:
        if (i$iv >= r9) goto L22;
        long it3 = others$iv[i$iv];
        long value$iv = ~it3;
        if (i$iv != start$iv) goto L17;
        int shift$iv = index$iv2 % 64;
        value$iv = (value$iv >>> shift$iv) << shift$iv;
    L17:
        long $this$firstBitSet$iv$iv3 = value$iv;
        int bit$iv3 = Long.numberOfTrailingZeros($this$firstBitSet$iv$iv3);
        if (bit$iv3 < 64) goto L26;
        i$iv = i$iv + 1;
        goto L13
    L26:
        return ((i$iv * 64) + 128) + bit$iv3;
    L22:
        return Integer.MAX_VALUE;
    }

    private final int nextBit(int index, Function1<? super Long, Long> r19) {
        if (index >= 64) goto L8;
        long $this$firstBitSet$iv = (r19.invoke(Long.valueOf(this.first)).longValue() >>> index) << index;
        int bit = Long.numberOfTrailingZeros($this$firstBitSet$iv);
        if (bit >= 64) goto L8;
        return bit;
    L8:
        if (index >= 128) goto L13;
        int index2 = index - 64;
        long $this$firstBitSet$iv2 = (r19.invoke(Long.valueOf(this.second)).longValue() >>> index2) << index2;
        int bit2 = Long.numberOfTrailingZeros($this$firstBitSet$iv2);
        if (bit2 >= 64) goto L13;
        return bit2 + 64;
    L13:
        int index3 = Math.max(index, 128);
        int start = (index3 / 64) - 2;
        long[] others = this.others;
        int i = start;
        int r10 = others.length;
    L14:
        if (i >= r10) goto L23;
        long value = r19.invoke(Long.valueOf(others[i])).longValue();
        if (i != start) goto L18;
        int shift = index3 % 64;
        value = (value >>> shift) << shift;
    L18:
        long $this$firstBitSet$iv3 = value;
        int bit3 = Long.numberOfTrailingZeros($this$firstBitSet$iv3);
        if (bit3 < 64) goto L21;
        i = i + 1;
        goto L14
    L21:
        return ((i * 64) + 128) + bit3;
    L23:
        return Integer.MAX_VALUE;
    }

    public final void setRange(int start, int end) {
        if (start >= end) goto L5;
        long bits = -1;
    L6:
        int r5 = 0;
        if (start >= 64) goto L9;
        boolean $this$toBit$iv = true;
    L11:
        if ($this$toBit$iv == false) goto L13;
        int r8 = 1;
    L14:
        long selector = ((long) r8) * bits;
        long firstValue = (selector >>> (64 - (Math.min(64, end) - start))) << start;
        this.first |= firstValue;
        if (end <= 64) goto L30;
        int start2 = Math.max(start, 64);
        if (start2 >= 128) goto L19;
        boolean $this$toBit$iv2 = true;
    L21:
        if ($this$toBit$iv2 == false) goto L23;
        r5 = 1;
    L23:
        long selector2 = ((long) r5) * bits;
        long secondValue = (selector2 >>> (128 - (Math.min(128, end) - start2))) << start2;
        this.second |= secondValue;
        if (end <= 128) goto L29;
        int bit = Math.max(start2, 128);
    L26:
        if (bit >= end) goto L28;
        set(bit, true);
        bit = bit + 1;
        goto L26
    L28:
        return;
    L29:
        return;
    L19:
        $this$toBit$iv2 = false;
        goto L21
    L30:
        return;
    L13:
        r8 = 0;
        goto L14
    L9:
        $this$toBit$iv = false;
        goto L11
    L5:
        bits = 0;
        goto L6
    }

    public String toString() {
        StringBuilder $this$toString_u24lambda_u242 = new StringBuilder();
        boolean first = true;
        $this$toString_u24lambda_u242.append("BitVector [");
        int i = 0;
        int r5 = getSize();
    L3:
        if (i >= r5) goto L10;
        if (get(i) == false) goto L9;
        if (first == true) goto L8;
        $this$toString_u24lambda_u242.append(", ");
    L8:
        first = false;
        $this$toString_u24lambda_u242.append(i);
    L9:
        i = i + 1;
        goto L3
    L10:
        $this$toString_u24lambda_u242.append(']');
        String r0 = $this$toString_u24lambda_u242.toString();
        Intrinsics.checkNotNullExpressionValue(r0, "toString(...)");
        return r0;
    }
}
