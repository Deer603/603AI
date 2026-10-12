package kotlin.comparisons;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: _ComparisonsJvm.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0017\n\u0002\u0010\u0015\n\u0002\u0010\u0016\n\u0002\u0010\u0014\n\u0002\u0010\u0013\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0019\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0087\b\u001a\u0019\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0087\b\u001a\u0019\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\tH\u0087\b\u001a\u0019\u0010\u0000\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\nH\u0087\b\u001a\u0019\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0087\b\u001a5\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\f\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\r\u001a!\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0087\b\u001a!\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0087\b\u001a!\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0087\b\u001a!\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0087\b\u001a!\u0010\u0000\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0087\b\u001a!\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0087\b\u001a9\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\u000f\"\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0010\u001a\u001c\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\n\u0010\u000e\u001a\u00020\u0011\"\u00020\u0006H\u0007\u001a\u001c\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\n\u0010\u000e\u001a\u00020\u0012\"\u00020\u0007H\u0007\u001a\u001c\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\n\u0010\u000e\u001a\u00020\u0013\"\u00020\bH\u0007\u001a\u001c\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\n\u0010\u000e\u001a\u00020\u0014\"\u00020\tH\u0007\u001a\u001c\u0010\u0000\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\n\u0010\u000e\u001a\u00020\u0015\"\u00020\nH\u0007\u001a\u001c\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00020\u0016\"\u00020\u000bH\u0007\u001a-\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0019\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0087\b\u001a\u0019\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0087\b\u001a\u0019\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\tH\u0087\b\u001a\u0019\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\nH\u0087\b\u001a\u0019\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0087\b\u001a5\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\f\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\r\u001a!\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0087\b\u001a!\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0087\b\u001a!\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0087\b\u001a!\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0087\b\u001a!\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0087\b\u001a!\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0087\b\u001a9\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\u000f\"\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0010\u001a\u001c\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\n\u0010\u000e\u001a\u00020\u0011\"\u00020\u0006H\u0007\u001a\u001c\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\n\u0010\u000e\u001a\u00020\u0012\"\u00020\u0007H\u0007\u001a\u001c\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\n\u0010\u000e\u001a\u00020\u0013\"\u00020\bH\u0007\u001a\u001c\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\n\u0010\u000e\u001a\u00020\u0014\"\u00020\tH\u0007\u001a\u001c\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\n\u0010\u000e\u001a\u00020\u0015\"\u00020\nH\u0007\u001a\u001c\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00020\u0016\"\u00020\u000bH\u0007¨\u0006\u0018"}, d2 = {"maxOf", "T", "", "a", "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "c", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "other", "", "(Ljava/lang/Comparable;[Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "minOf", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
class ComparisonsKt___ComparisonsJvmKt extends ComparisonsKt__ComparisonsKt {
    public ComparisonsKt___ComparisonsJvmKt() {
    }

    public static final <T extends Comparable<? super T>> T maxOf(T r1, T r2) {
        Intrinsics.checkNotNullParameter(r1, "a");
        Intrinsics.checkNotNullParameter(r2, "b");
        if (r1.compareTo(r2) < 0) goto L6;
        return r1;
    L6:
        return r2;
    }

    private static final byte maxOf(byte a, byte b) {
        return (byte) Math.max(a, b);
    }

    private static final short maxOf(short a, short b) {
        return (short) Math.max(a, b);
    }

    private static final int maxOf(int a, int b) {
        return Math.max(a, b);
    }

    private static final long maxOf(long a, long b) {
        return Math.max(a, b);
    }

    private static final float maxOf(float a, float b) {
        return Math.max(a, b);
    }

    private static final double maxOf(double a, double b) {
        return Math.max(a, b);
    }

    public static final <T extends Comparable<? super T>> T maxOf(T r1, T r2, T r3) {
        Intrinsics.checkNotNullParameter(r1, "a");
        Intrinsics.checkNotNullParameter(r2, "b");
        Intrinsics.checkNotNullParameter(r3, "c");
        return (T) ComparisonsKt.maxOf(r1, ComparisonsKt.maxOf(r2, r3));
    }

    private static final byte maxOf(byte a, byte b, byte c) {
        return (byte) Math.max(a, Math.max(b, c));
    }

    private static final short maxOf(short a, short b, short c) {
        return (short) Math.max(a, Math.max(b, c));
    }

    private static final int maxOf(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    private static final long maxOf(long a, long b, long c) {
        return Math.max(a, Math.max(b, c));
    }

    private static final float maxOf(float a, float b, float c) {
        return Math.max(a, Math.max(b, c));
    }

    private static final double maxOf(double a, double b, double c) {
        return Math.max(a, Math.max(b, c));
    }

    public static final <T extends Comparable<? super T>> T maxOf(T r4, T... r5) {
        Intrinsics.checkNotNullParameter(r4, "a");
        Intrinsics.checkNotNullParameter(r5, "other");
        T r0 = r4;
        int r1 = r5.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        T r3 = r0;
        r0 = (T) ComparisonsKt.maxOf(r3, r5[r2]);
        r2 = r2 + 1;
        goto L3
    L5:
        return r0;
    }

    public static final byte maxOf(byte a, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        byte max = a;
        int r1 = other.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        byte e = other[r2];
        max = (byte) Math.max(max, e);
        r2 = r2 + 1;
        goto L3
    L5:
        return max;
    }

    public static final short maxOf(short a, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        short max = a;
        int r1 = other.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        short e = other[r2];
        max = (short) Math.max(max, e);
        r2 = r2 + 1;
        goto L3
    L5:
        return max;
    }

    public static final int maxOf(int a, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int max = a;
        int r1 = other.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        int e = other[r2];
        max = Math.max(max, e);
        r2 = r2 + 1;
        goto L3
    L5:
        return max;
    }

    public static final long maxOf(long a, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        long max = a;
        int r2 = other.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L5;
        long e = other[r3];
        max = Math.max(max, e);
        r3 = r3 + 1;
        goto L3
    L5:
        return max;
    }

    public static final float maxOf(float a, float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        float max = a;
        int r1 = other.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        float e = other[r2];
        max = Math.max(max, e);
        r2 = r2 + 1;
        goto L3
    L5:
        return max;
    }

    public static final double maxOf(double a, double... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        double max = a;
        int r2 = other.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L5;
        double e = other[r3];
        max = Math.max(max, e);
        r3 = r3 + 1;
        goto L3
    L5:
        return max;
    }

    public static final <T extends Comparable<? super T>> T minOf(T r1, T r2) {
        Intrinsics.checkNotNullParameter(r1, "a");
        Intrinsics.checkNotNullParameter(r2, "b");
        if (r1.compareTo(r2) > 0) goto L6;
        return r1;
    L6:
        return r2;
    }

    private static final byte minOf(byte a, byte b) {
        return (byte) Math.min(a, b);
    }

    private static final short minOf(short a, short b) {
        return (short) Math.min(a, b);
    }

    private static final int minOf(int a, int b) {
        return Math.min(a, b);
    }

    private static final long minOf(long a, long b) {
        return Math.min(a, b);
    }

    private static final float minOf(float a, float b) {
        return Math.min(a, b);
    }

    private static final double minOf(double a, double b) {
        return Math.min(a, b);
    }

    public static final <T extends Comparable<? super T>> T minOf(T r1, T r2, T r3) {
        Intrinsics.checkNotNullParameter(r1, "a");
        Intrinsics.checkNotNullParameter(r2, "b");
        Intrinsics.checkNotNullParameter(r3, "c");
        return (T) ComparisonsKt.minOf(r1, ComparisonsKt.minOf(r2, r3));
    }

    private static final byte minOf(byte a, byte b, byte c) {
        return (byte) Math.min(a, Math.min(b, c));
    }

    private static final short minOf(short a, short b, short c) {
        return (short) Math.min(a, Math.min(b, c));
    }

    private static final int minOf(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    private static final long minOf(long a, long b, long c) {
        return Math.min(a, Math.min(b, c));
    }

    private static final float minOf(float a, float b, float c) {
        return Math.min(a, Math.min(b, c));
    }

    private static final double minOf(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }

    public static final <T extends Comparable<? super T>> T minOf(T r4, T... r5) {
        Intrinsics.checkNotNullParameter(r4, "a");
        Intrinsics.checkNotNullParameter(r5, "other");
        T r0 = r4;
        int r1 = r5.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        T r3 = r0;
        r0 = (T) ComparisonsKt.minOf(r3, r5[r2]);
        r2 = r2 + 1;
        goto L3
    L5:
        return r0;
    }

    public static final byte minOf(byte a, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        byte min = a;
        int r1 = other.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        byte e = other[r2];
        min = (byte) Math.min(min, e);
        r2 = r2 + 1;
        goto L3
    L5:
        return min;
    }

    public static final short minOf(short a, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        short min = a;
        int r1 = other.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        short e = other[r2];
        min = (short) Math.min(min, e);
        r2 = r2 + 1;
        goto L3
    L5:
        return min;
    }

    public static final int minOf(int a, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int min = a;
        int r1 = other.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        int e = other[r2];
        min = Math.min(min, e);
        r2 = r2 + 1;
        goto L3
    L5:
        return min;
    }

    public static final long minOf(long a, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        long min = a;
        int r2 = other.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L5;
        long e = other[r3];
        min = Math.min(min, e);
        r3 = r3 + 1;
        goto L3
    L5:
        return min;
    }

    public static final float minOf(float a, float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        float min = a;
        int r1 = other.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        float e = other[r2];
        min = Math.min(min, e);
        r2 = r2 + 1;
        goto L3
    L5:
        return min;
    }

    public static final double minOf(double a, double... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        double min = a;
        int r2 = other.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L5;
        double e = other[r3];
        min = Math.min(min, e);
        r3 = r3 + 1;
        goto L3
    L5:
        return min;
    }
}
