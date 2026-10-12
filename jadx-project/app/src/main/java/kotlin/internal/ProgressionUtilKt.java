package kotlin.internal;

import kotlin.Metadata;

/* JADX INFO: compiled from: progressionUtil.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a \u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u001a \u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0001\u001a \u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0001¨\u0006\u000b"}, d2 = {"mod", "", "a", "b", "", "differenceModulo", "c", "getProgressionLastElement", "start", "end", "step", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ProgressionUtilKt {
    private static final int mod(int a, int b) {
        int mod = a % b;
        if (mod < 0) goto L6;
        return mod;
    L6:
        return mod + b;
    }

    private static final long mod(long a, long b) {
        long mod = a % b;
        if (mod < 0) goto L6;
        return mod;
    L6:
        return mod + b;
    }

    private static final int differenceModulo(int a, int b, int c) {
        return mod(mod(a, c) - mod(b, c), c);
    }

    private static final long differenceModulo(long a, long b, long c) {
        return mod(mod(a, c) - mod(b, c), c);
    }

    public static final int getProgressionLastElement(int start, int end, int step) {
        if (step <= 0) goto L6;
        if (start >= end) goto L14;
        return end - differenceModulo(end, start, step);
    L14:
        return end;
    L6:
        if (step >= 0) goto L12;
        if (start <= end) goto L14;
        return differenceModulo(start, end, -step) + end;
    L12:
        throw new IllegalArgumentException("Step is zero.");
    }

    public static final long getProgressionLastElement(long start, long end, long step) {
        if (step <= 0) goto L9;
        if (start < end) goto L17;
    L18:
        return end;
    L17:
        return end - differenceModulo(end, start, step);
    L9:
        if (step >= 0) goto L16;
        if (start <= end) goto L18;
        return differenceModulo(start, end, -step) + end;
    L16:
        throw new IllegalArgumentException("Step is zero.");
    }
}
