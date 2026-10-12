package kotlin.random;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongRange;

/* JADX INFO: compiled from: Random.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u0014\u0010\b\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\tH\u0007\u001a\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0015H\u0000¨\u0006\u0016"}, d2 = {"Random", "Lkotlin/random/Random;", "seed", "", "", "nextInt", "range", "Lkotlin/ranges/IntRange;", "nextLong", "Lkotlin/ranges/LongRange;", "fastLog2", "value", "takeUpperBits", "bitCount", "checkRangeBounds", "", "from", "until", "", "boundsErrorMessage", "", "", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class RandomKt {
    public static final Random Random(int seed) {
        return new XorWowRandom(seed, seed >> 31);
    }

    public static final Random Random(long seed) {
        return new XorWowRandom((int) seed, (int) (seed >> 32));
    }

    public static final int nextInt(Random $this$nextInt, IntRange range) {
        Intrinsics.checkNotNullParameter($this$nextInt, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range.isEmpty() == true) goto L13;
        if (range.getLast() >= Integer.MAX_VALUE) goto L8;
        return $this$nextInt.nextInt(range.getFirst(), range.getLast() + 1);
    L8:
        if (range.getFirst() <= Integer.MIN_VALUE) goto L11;
        return $this$nextInt.nextInt(range.getFirst() - 1, range.getLast()) + 1;
    L11:
        return $this$nextInt.nextInt();
    L13:
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final long nextLong(Random $this$nextLong, LongRange range) {
        Intrinsics.checkNotNullParameter($this$nextLong, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range.isEmpty() == true) goto L13;
        if (range.getLast() >= Long.MAX_VALUE) goto L8;
        return $this$nextLong.nextLong(range.getFirst(), range.getLast() + 1);
    L8:
        if (range.getFirst() <= Long.MIN_VALUE) goto L11;
        return $this$nextLong.nextLong(range.getFirst() - 1, range.getLast()) + 1;
    L11:
        return $this$nextLong.nextLong();
    L13:
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final int fastLog2(int value) {
        return 31 - Integer.numberOfLeadingZeros(value);
    }

    public static final int takeUpperBits(int $this$takeUpperBits, int bitCount) {
        return ($this$takeUpperBits >>> (32 - bitCount)) & ((-bitCount) >> 31);
    }

    public static final void checkRangeBounds(int from, int until) {
        if (until <= from) goto L4;
        boolean r0 = true;
    L5:
        if (r0 == false) goto L8;
        return;
    L8:
        throw new IllegalArgumentException(boundsErrorMessage(Integer.valueOf(from), Integer.valueOf(until)).toString());
    L4:
        r0 = false;
        goto L5
    }

    public static final void checkRangeBounds(long from, long until) {
        if (until <= from) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L9;
        return;
    L9:
        throw new IllegalArgumentException(boundsErrorMessage(Long.valueOf(from), Long.valueOf(until)).toString());
    L5:
        r0 = false;
        goto L6
    }

    public static final void checkRangeBounds(double from, double until) {
        if (until <= from) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L9;
        return;
    L9:
        throw new IllegalArgumentException(boundsErrorMessage(Double.valueOf(from), Double.valueOf(until)).toString());
    L5:
        r0 = false;
        goto L6
    }

    public static final String boundsErrorMessage(Object from, Object until) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }
}
