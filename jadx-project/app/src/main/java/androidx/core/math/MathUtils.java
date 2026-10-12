package androidx.core.math;

import androidx.collection.SieveCacheKt;

/* JADX INFO: loaded from: classes4.dex */
public class MathUtils {
    private MathUtils() {
    }

    public static int addExact(int x, int y) {
        int sum = x + y;
        boolean r1 = true;
        if (x < 0) goto L5;
        boolean r3 = true;
    L6:
        if (y < 0) goto L8;
        boolean r4 = true;
    L9:
        if (r3 != r4) goto L20;
        if (x < 0) goto L12;
        boolean r5 = true;
    L13:
        if (sum >= 0) goto L16;
        r1 = false;
    L16:
        if (r5 == r1) goto L20;
        throw new ArithmeticException("integer overflow");
    L12:
        r5 = false;
    L20:
        return sum;
    L8:
        r4 = false;
        goto L9
    L5:
        r3 = false;
        goto L6
    }

    public static long addExact(long x, long y) {
        long sum = x + y;
        boolean r5 = true;
        if (x < 0) goto L5;
        boolean r4 = true;
    L7:
        if (y < 0) goto L9;
        boolean r7 = true;
    L10:
        if (r4 == r7) goto L12;
    L23:
        return sum;
    L12:
        if (x < 0) goto L14;
        boolean r6 = true;
    L16:
        if (sum >= 0) goto L19;
        r5 = false;
    L19:
        if (r6 == r5) goto L23;
        throw new ArithmeticException("integer overflow");
    L14:
        r6 = false;
        goto L16
    L9:
        r7 = false;
        goto L10
    L5:
        r4 = false;
        goto L7
    }

    public static int subtractExact(int x, int y) {
        int difference = x - y;
        boolean r1 = true;
        if (x >= 0) goto L5;
        boolean r3 = true;
    L6:
        if (y >= 0) goto L8;
        boolean r4 = true;
    L9:
        if (r3 == r4) goto L20;
        if (x >= 0) goto L12;
        boolean r5 = true;
    L13:
        if (difference < 0) goto L16;
        r1 = false;
    L16:
        if (r5 == r1) goto L20;
        throw new ArithmeticException("integer overflow");
    L12:
        r5 = false;
    L20:
        return difference;
    L8:
        r4 = false;
        goto L9
    L5:
        r3 = false;
        goto L6
    }

    public static long subtractExact(long x, long y) {
        long difference = x - y;
        boolean r5 = true;
        if (x >= 0) goto L5;
        boolean r4 = true;
    L7:
        if (y >= 0) goto L9;
        boolean r7 = true;
    L10:
        if (r4 != r7) goto L12;
    L23:
        return difference;
    L12:
        if (x >= 0) goto L14;
        boolean r6 = true;
    L16:
        if (difference < 0) goto L19;
        r5 = false;
    L19:
        if (r6 == r5) goto L23;
        throw new ArithmeticException("integer overflow");
    L14:
        r6 = false;
        goto L16
    L9:
        r7 = false;
        goto L10
    L5:
        r4 = false;
        goto L7
    }

    public static int multiplyExact(int x, int y) {
        int product = x * y;
        if (x == 0) goto L12;
        if (y == 0) goto L12;
        if ((product / x) != y) goto L11;
        if ((product / y) == x) goto L12;
    L11:
        throw new ArithmeticException("integer overflow");
    L12:
        return product;
    }

    public static long multiplyExact(long x, long y) {
        long product = x * y;
        if (x != 0) goto L5;
    L13:
        return product;
    L5:
        if (y == 0) goto L13;
        if ((product / x) != y) goto L12;
        if ((product / y) == x) goto L13;
    L12:
        throw new ArithmeticException("integer overflow");
    }

    public static int incrementExact(int a) {
        if (a == Integer.MAX_VALUE) goto L7;
        return a + 1;
    L7:
        throw new ArithmeticException("integer overflow");
    }

    public static long incrementExact(long a) {
        if (a == Long.MAX_VALUE) goto L7;
        return 1 + a;
    L7:
        throw new ArithmeticException("integer overflow");
    }

    public static int decrementExact(int a) {
        if (a == Integer.MIN_VALUE) goto L7;
        return a - 1;
    L7:
        throw new ArithmeticException("integer overflow");
    }

    public static long decrementExact(long a) {
        if (a == Long.MIN_VALUE) goto L7;
        return a - 1;
    L7:
        throw new ArithmeticException("integer overflow");
    }

    public static int negateExact(int a) {
        if (a == Integer.MIN_VALUE) goto L7;
        return -a;
    L7:
        throw new ArithmeticException("integer overflow");
    }

    public static long negateExact(long a) {
        if (a == Long.MIN_VALUE) goto L7;
        return -a;
    L7:
        throw new ArithmeticException("integer overflow");
    }

    public static int toIntExact(long value) {
        if (value > SieveCacheKt.NodeLinkMask) goto L9;
        if (value < SieveCacheKt.NodeMetaAndPreviousMask) goto L9;
        return (int) value;
    L9:
        throw new ArithmeticException("integer overflow");
    }

    public static float clamp(float value, float min, float max) {
        if (value >= min) goto L6;
        return min;
    L6:
        if (value <= max) goto L8;
        return max;
    L8:
        return value;
    }

    public static double clamp(double value, double min, double max) {
        if (value >= min) goto L6;
        return min;
    L6:
        if (value <= max) goto L8;
        return max;
    L8:
        return value;
    }

    public static int clamp(int value, int min, int max) {
        if (value >= min) goto L4;
        return min;
    L4:
        if (value <= max) goto L6;
        return max;
    L6:
        return value;
    }

    public static long clamp(long value, long min, long max) {
        if (value >= min) goto L6;
        return min;
    L6:
        if (value <= max) goto L8;
        return max;
    L8:
        return value;
    }
}
