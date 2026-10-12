package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: compiled from: FloatFloatPair.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0010\u0010\r\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0010\u0010\u000bJ\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0012\u0010\u0002\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\f\u0010\u000b\u0088\u0001\u0007¨\u0006\u001e"}, d2 = {"Landroidx/collection/FloatFloatPair;", "", "first", "", "second", "constructor-impl", "(FF)J", "packedValue", "", "(J)J", "getFirst-impl", "(J)F", "getSecond-impl", "component1", "component1-impl", "component2", "component2-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class FloatFloatPair {
    public final long packedValue;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FloatFloatPair m1boximpl(long r1) {
        return new FloatFloatPair(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m5constructorimpl(long r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m6equalsimpl(long r4, Object r6) {
        if ((r6 instanceof FloatFloatPair) == true) goto L6;
        return false;
    L6:
        if (r4 == ((FloatFloatPair) r6).m12unboximpl()) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7equalsimpl0(long r1, long r3) {
        if (r1 != r3) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m10hashCodeimpl(long r1) {
        return Long.hashCode(r1);
    }

    public boolean equals(Object r3) {
        return m6equalsimpl(this.packedValue, r3);
    }

    public int hashCode() {
        return m10hashCodeimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m12unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ FloatFloatPair(long packedValue) {
        this.packedValue = packedValue;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m4constructorimpl(float first, float second) {
        long v1$iv = Float.floatToRawIntBits(first);
        long v2$iv = Float.floatToRawIntBits(second);
        return m5constructorimpl((v1$iv << 32) | (4294967295L & v2$iv));
    }

    /* JADX INFO: renamed from: getFirst-impl, reason: not valid java name */
    public static final float m8getFirstimpl(long arg0) {
        int bits$iv = (int) (arg0 >> 32);
        return Float.intBitsToFloat(bits$iv);
    }

    /* JADX INFO: renamed from: getSecond-impl, reason: not valid java name */
    public static final float m9getSecondimpl(long arg0) {
        int bits$iv = (int) (4294967295L & arg0);
        return Float.intBitsToFloat(bits$iv);
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m2component1impl(long arg0) {
        int bits$iv = (int) (arg0 >> 32);
        return Float.intBitsToFloat(bits$iv);
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m3component2impl(long arg0) {
        int bits$iv = (int) (4294967295L & arg0);
        return Float.intBitsToFloat(bits$iv);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m11toStringimpl(long arg0) {
        int bits$iv$iv = (int) (arg0 >> 32);
        StringBuilder r0 = new StringBuilder().append('(').append(Float.intBitsToFloat(bits$iv$iv)).append(", ");
        int bits$iv$iv2 = (int) (4294967295L & arg0);
        return r0.append(Float.intBitsToFloat(bits$iv$iv2)).append(')').toString();
    }

    public String toString() {
        return m11toStringimpl(this.packedValue);
    }
}
