package kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: compiled from: UnsignedJVM.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0001¢\u0006\u0004\b\r\u0010\u000b\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0001\u001a\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0011H\u0001\u001a\u0016\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000fH\u0081\b¢\u0006\u0002\u0010\u0014\u001a\u0011\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000fH\u0081\b\u001a\u0011\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u000fH\u0081\b\u001a\u0016\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0017H\u0081\b¢\u0006\u0002\u0010\u0019\u001a\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u000fH\u0001\u001a\u0015\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u001bH\u0001¢\u0006\u0002\u0010\u001d\u001a\u0011\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0011H\u0081\b\u001a\u0016\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0017H\u0081\b¢\u0006\u0002\u0010 \u001a\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0011H\u0001\u001a\u0015\u0010\"\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u001bH\u0001¢\u0006\u0002\u0010#\u001a\u0011\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u000fH\u0081\b\u001a\u0019\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000fH\u0081\b\u001a\u0011\u0010'\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0011H\u0081\b\u001a\u0018\u0010'\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u000fH\u0000¨\u0006("}, d2 = {"uintRemainder", "Lkotlin/UInt;", "v1", "v2", "uintRemainder-J1ME1BU", "(II)I", "uintDivide", "uintDivide-J1ME1BU", "ulongDivide", "Lkotlin/ULong;", "ulongDivide-eb3DHEI", "(JJ)J", "ulongRemainder", "ulongRemainder-eb3DHEI", "uintCompare", "", "ulongCompare", "", "uintToULong", "value", "(I)J", "uintToLong", "uintToFloat", "", "floatToUInt", "(F)I", "uintToDouble", "", "doubleToUInt", "(D)I", "ulongToFloat", "floatToULong", "(F)J", "ulongToDouble", "doubleToULong", "(D)J", "uintToString", "", "base", "ulongToString", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class UnsignedKt {
    /* JADX INFO: renamed from: uintRemainder-J1ME1BU, reason: not valid java name */
    public static final int m7777uintRemainderJ1ME1BU(int v1, int v2) {
        return UInt.m7520constructorimpl((int) ((((long) v1) & 4294967295L) % (4294967295L & ((long) v2))));
    }

    /* JADX INFO: renamed from: uintDivide-J1ME1BU, reason: not valid java name */
    public static final int m7776uintDivideJ1ME1BU(int v1, int v2) {
        return UInt.m7520constructorimpl((int) ((((long) v1) & 4294967295L) / (4294967295L & ((long) v2))));
    }

    /* JADX INFO: renamed from: ulongDivide-eb3DHEI, reason: not valid java name */
    public static final long m7778ulongDivideeb3DHEI(long v1, long v2) {
        long r4 = 0;
        if (v2 >= 0) goto L11;
        if (Long.compareUnsigned(v1, v2) < 0) goto L9;
        r4 = 1;
    L9:
        return ULong.m7599constructorimpl(r4);
    L11:
        if (v1 >= 0) goto L13;
        int r5 = 1;
        long quotient = ((v1 >>> 1) / v2) << 1;
        long rem = v1 - (quotient * v2);
        if (Long.compareUnsigned(ULong.m7599constructorimpl(rem), ULong.m7599constructorimpl(v2)) >= 0) goto L19;
        r5 = 0;
    L19:
        return ULong.m7599constructorimpl(((long) r5) + quotient);
    L13:
        return ULong.m7599constructorimpl(v1 / v2);
    }

    /* JADX INFO: renamed from: ulongRemainder-eb3DHEI, reason: not valid java name */
    public static final long m7779ulongRemaindereb3DHEI(long v1, long v2) {
        long r4 = 0;
        if (v2 >= 0) goto L10;
        if (Long.compareUnsigned(v1, v2) >= 0) goto L8;
        return v1;
    L8:
        return ULong.m7599constructorimpl(v1 - v2);
    L10:
        if (v1 >= 0) goto L12;
        long quotient = ((v1 >>> 1) / v2) << 1;
        long rem = v1 - (quotient * v2);
        if (Long.compareUnsigned(ULong.m7599constructorimpl(rem), ULong.m7599constructorimpl(v2)) < 0) goto L17;
        r4 = v2;
    L17:
        return ULong.m7599constructorimpl(rem - r4);
    L12:
        return ULong.m7599constructorimpl(v1 % v2);
    }

    public static final int uintCompare(int v1, int v2) {
        return Intrinsics.compare(v1 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ v2);
    }

    public static final int ulongCompare(long v1, long v2) {
        return Intrinsics.compare(v1 ^ Long.MIN_VALUE, Long.MIN_VALUE ^ v2);
    }

    private static final long uintToULong(int value) {
        return ULong.m7599constructorimpl(((long) value) & 4294967295L);
    }

    private static final long uintToLong(int value) {
        return ((long) value) & 4294967295L;
    }

    private static final float uintToFloat(int value) {
        return (float) uintToDouble(value);
    }

    private static final int floatToUInt(float value) {
        return doubleToUInt(value);
    }

    public static final double uintToDouble(int value) {
        return ((double) (Integer.MAX_VALUE & value)) + (((double) ((value >>> 31) << 30)) * 2.0d);
    }

    public static final int doubleToUInt(double value) {
        if (Double.isNaN(value) == false) goto L6;
        return 0;
    L6:
        if (value > uintToDouble(0)) goto L9;
        return 0;
    L9:
        if (value < uintToDouble(-1)) goto L12;
        return -1;
    L12:
        if (value > 2.147483647E9d) goto L15;
        return UInt.m7520constructorimpl((int) value);
    L15:
        return UInt.m7520constructorimpl(UInt.m7520constructorimpl((int) (value - 2.147483647E9d)) + UInt.m7520constructorimpl(Integer.MAX_VALUE));
    }

    private static final float ulongToFloat(long value) {
        return (float) ulongToDouble(value);
    }

    private static final long floatToULong(float value) {
        return doubleToULong(value);
    }

    public static final double ulongToDouble(long value) {
        return ((value >>> 11) * 2048.0d) + (2047 & value);
    }

    public static final long doubleToULong(double value) {
        if (Double.isNaN(value) == false) goto L6;
        return 0;
    L6:
        if (value > ulongToDouble(0)) goto L9;
        return 0;
    L9:
        if (value < ulongToDouble(-1)) goto L12;
        return -1;
    L12:
        if (value >= 9.223372036854776E18d) goto L15;
        return ULong.m7599constructorimpl((long) value);
    L15:
        return ULong.m7599constructorimpl(ULong.m7599constructorimpl((long) (value - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    private static final String uintToString(int value) {
        return String.valueOf(((long) value) & 4294967295L);
    }

    private static final String uintToString(int value, int base) {
        return ulongToString(((long) value) & 4294967295L, base);
    }

    private static final String ulongToString(long value) {
        return ulongToString(value, 10);
    }

    public static final String ulongToString(long value, int base) {
        if (value < 0) goto L6;
        String r0 = Long.toString(value, CharsKt.checkRadix(base));
        Intrinsics.checkNotNullExpressionValue(r0, "toString(...)");
        return r0;
    L6:
        long quotient = ((value >>> 1) / ((long) base)) << 1;
        long rem = value - (((long) base) * quotient);
        if (rem < base) goto L9;
        rem = rem - ((long) base);
        quotient = quotient + 1;
    L9:
        StringBuilder r1 = new StringBuilder();
        String r6 = Long.toString(quotient, CharsKt.checkRadix(base));
        Intrinsics.checkNotNullExpressionValue(r6, "toString(...)");
        StringBuilder r2 = r1.append(r6);
        String r7 = Long.toString(rem, CharsKt.checkRadix(base));
        Intrinsics.checkNotNullExpressionValue(r7, "toString(...)");
        return r2.append(r7).toString();
    }
}
