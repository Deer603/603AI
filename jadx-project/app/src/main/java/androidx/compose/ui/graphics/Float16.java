package androidx.compose.ui.graphics;

import androidx.core.internal.view.SupportMenu;
import kotlin.Metadata;
import kotlin.UShort;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: Float16.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\b\u0081@\u0018\u0000 R2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001RB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007B\u000f\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\nJ\u0013\u0010\u0015\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\nJ\u0013\u0010\u0017\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\nJ\u001b\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\nJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010\u000eJ\r\u0010&\u001a\u00020\u001e¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u001e¢\u0006\u0004\b*\u0010(J\r\u0010+\u001a\u00020\u001e¢\u0006\u0004\b,\u0010(J\r\u0010-\u001a\u00020\u001e¢\u0006\u0004\b.\u0010(J\u0013\u0010/\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010\nJ\r\u00101\u001a\u00020\f¢\u0006\u0004\b2\u0010\u000eJ\r\u00103\u001a\u000204¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0006¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u0003¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020>¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\f¢\u0006\u0004\bB\u0010\u000eJ\r\u0010C\u001a\u00020D¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\f¢\u0006\u0004\bH\u0010\u000eJ\r\u0010I\u001a\u00020\t¢\u0006\u0004\bJ\u0010\nJ\u000f\u0010K\u001a\u00020>H\u0016¢\u0006\u0004\bL\u0010@J\u0013\u0010M\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bN\u0010\nJ\u0018\u0010O\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\bP\u0010QR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00008Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e\u0088\u0001\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006S"}, d2 = {"Landroidx/compose/ui/graphics/Float16;", "", "value", "", "constructor-impl", "(F)S", "", "(D)S", "halfValue", "", "(S)S", "exponent", "", "getExponent-impl", "(S)I", "getHalfValue", "()S", "sign", "getSign-slo4al4", "significand", "getSignificand-impl", "absoluteValue", "absoluteValue-slo4al4", "ceil", "ceil-slo4al4", "compareTo", "other", "compareTo-41bOqos", "(SS)I", "equals", "", "", "equals-impl", "(SLjava/lang/Object;)Z", "floor", "floor-slo4al4", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(S)Z", "isInfinite", "isInfinite-impl", "isNaN", "isNaN-impl", "isNormalized", "isNormalized-impl", "round", "round-slo4al4", "toBits", "toBits-impl", "toByte", "", "toByte-impl", "(S)B", "toDouble", "toDouble-impl", "(S)D", "toFloat", "toFloat-impl", "(S)F", "toHexString", "", "toHexString-impl", "(S)Ljava/lang/String;", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(S)J", "toRawBits", "toRawBits-impl", "toShort", "toShort-impl", "toString", "toString-impl", "trunc", "trunc-slo4al4", "withSign", "withSign-qCeQghg", "(SS)S", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class Float16 implements Comparable<Float16> {
    public static final Companion Companion = null;
    private static final short Epsilon = 0;
    private static final short LowestValue = 0;
    public static final int MaxExponent = 15;
    private static final short MaxValue = 0;
    public static final int MinExponent = -14;
    private static final short MinNormal = 0;
    private static final short MinValue = 0;
    private static final short NaN = 0;
    private static final short NegativeInfinity = 0;
    private static final short NegativeZero = 0;
    private static final short PositiveInfinity = 0;
    private static final short PositiveZero = 0;
    public static final int Size = 16;
    private final short halfValue;

    /* JADX INFO: compiled from: Float16.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0010\u0010\u0006R\u0019\u0010\u0011\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0012\u0010\u0006R\u0019\u0010\u0013\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0014\u0010\u0006R\u0019\u0010\u0015\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0016\u0010\u0006R\u0019\u0010\u0017\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0018\u0010\u0006R\u0019\u0010\u0019\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001a\u0010\u0006R\u0019\u0010\u001b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001c\u0010\u0006R\u000e\u0010\u001d\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/graphics/Float16$Companion;", "", "()V", "Epsilon", "Landroidx/compose/ui/graphics/Float16;", "getEpsilon-slo4al4", "()S", "S", "LowestValue", "getLowestValue-slo4al4", "MaxExponent", "", "MaxValue", "getMaxValue-slo4al4", "MinExponent", "MinNormal", "getMinNormal-slo4al4", "MinValue", "getMinValue-slo4al4", "NaN", "getNaN-slo4al4", "NegativeInfinity", "getNegativeInfinity-slo4al4", "NegativeZero", "getNegativeZero-slo4al4", "PositiveInfinity", "getPositiveInfinity-slo4al4", "PositiveZero", "getPositiveZero-slo4al4", "Size", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getEpsilon-slo4al4, reason: not valid java name */
        public final short m4501getEpsilonslo4al4() {
            return Float16.access$getEpsilon$cp();
        }

        /* JADX INFO: renamed from: getLowestValue-slo4al4, reason: not valid java name */
        public final short m4502getLowestValueslo4al4() {
            return Float16.access$getLowestValue$cp();
        }

        /* JADX INFO: renamed from: getMaxValue-slo4al4, reason: not valid java name */
        public final short m4503getMaxValueslo4al4() {
            return Float16.access$getMaxValue$cp();
        }

        /* JADX INFO: renamed from: getMinNormal-slo4al4, reason: not valid java name */
        public final short m4504getMinNormalslo4al4() {
            return Float16.access$getMinNormal$cp();
        }

        /* JADX INFO: renamed from: getMinValue-slo4al4, reason: not valid java name */
        public final short m4505getMinValueslo4al4() {
            return Float16.access$getMinValue$cp();
        }

        /* JADX INFO: renamed from: getNaN-slo4al4, reason: not valid java name */
        public final short m4506getNaNslo4al4() {
            return Float16.access$getNaN$cp();
        }

        /* JADX INFO: renamed from: getNegativeInfinity-slo4al4, reason: not valid java name */
        public final short m4507getNegativeInfinityslo4al4() {
            return Float16.access$getNegativeInfinity$cp();
        }

        /* JADX INFO: renamed from: getNegativeZero-slo4al4, reason: not valid java name */
        public final short m4508getNegativeZeroslo4al4() {
            return Float16.access$getNegativeZero$cp();
        }

        /* JADX INFO: renamed from: getPositiveInfinity-slo4al4, reason: not valid java name */
        public final short m4509getPositiveInfinityslo4al4() {
            return Float16.access$getPositiveInfinity$cp();
        }

        /* JADX INFO: renamed from: getPositiveZero-slo4al4, reason: not valid java name */
        public final short m4510getPositiveZeroslo4al4() {
            return Float16.access$getPositiveZero$cp();
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Float16 m4469boximpl(short r1) {
        return new Float16(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m4474constructorimpl(short r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4475equalsimpl(short r2, Object r3) {
        if ((r3 instanceof Float16) == true) goto L6;
        return false;
    L6:
        if (r2 == ((Float16) r3).m4500unboximpl()) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4476equalsimpl0(short r1, short r2) {
        if (r1 != r2) goto L4;
        return true;
    L4:
        return false;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4481hashCodeimpl(short r1) {
        return Short.hashCode(r1);
    }

    public boolean equals(Object r2) {
        return m4475equalsimpl(this.halfValue, r2);
    }

    public int hashCode() {
        return m4481hashCodeimpl(this.halfValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m4500unboximpl() {
        return this.halfValue;
    }

    public static final /* synthetic */ short access$getEpsilon$cp() {
        return Epsilon;
    }

    public static final /* synthetic */ short access$getLowestValue$cp() {
        return LowestValue;
    }

    public static final /* synthetic */ short access$getMaxValue$cp() {
        return MaxValue;
    }

    public static final /* synthetic */ short access$getMinNormal$cp() {
        return MinNormal;
    }

    public static final /* synthetic */ short access$getMinValue$cp() {
        return MinValue;
    }

    public static final /* synthetic */ short access$getNaN$cp() {
        return NaN;
    }

    public static final /* synthetic */ short access$getNegativeInfinity$cp() {
        return NegativeInfinity;
    }

    public static final /* synthetic */ short access$getNegativeZero$cp() {
        return NegativeZero;
    }

    public static final /* synthetic */ short access$getPositiveInfinity$cp() {
        return PositiveInfinity;
    }

    public static final /* synthetic */ short access$getPositiveZero$cp() {
        return PositiveZero;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Float16 r2) {
        return m4499compareTo41bOqos(r2.m4500unboximpl());
    }

    private /* synthetic */ Float16(short halfValue) {
        this.halfValue = halfValue;
    }

    public final short getHalfValue() {
        return this.halfValue;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m4473constructorimpl(float value) {
        int bits$iv = Float.floatToRawIntBits(value);
        int s$iv = bits$iv >>> 31;
        int e$iv = (bits$iv >>> 23) & 255;
        int m$iv = 8388607 & bits$iv;
        int outE$iv = 0;
        int outM$iv = 0;
        if (e$iv != 255) goto L9;
        outE$iv = 31;
        if (m$iv == 0) goto L7;
        int r4 = 512;
    L8:
        outM$iv = r4;
    L22:
        int out$iv = s$iv << 15;
        short r8 = (short) ((out$iv | (outE$iv << 10)) | outM$iv);
    L24:
        return m4474constructorimpl(r8);
    L7:
        r4 = 0;
        goto L8
    L9:
        int e$iv2 = (e$iv - 127) + 15;
        if (e$iv2 < 31) goto L12;
        outE$iv = 49;
        goto L22
    L12:
        if (e$iv2 <= 0) goto L14;
        outE$iv = e$iv2;
        outM$iv = m$iv >> 13;
        if ((m$iv & 4096) == 0) goto L22;
        int out$iv2 = (outE$iv << 10) | outM$iv;
        r8 = (short) ((s$iv << 15) | (out$iv2 + 1));
        goto L24
    L14:
        if (e$iv2 < (-10)) goto L22;
        int m$iv2 = (8388608 | m$iv) >> (1 - e$iv2);
        if ((m$iv2 & 4096) == 0) goto L18;
        m$iv2 = m$iv2 + 8192;
    L18:
        outM$iv = m$iv2 >> 13;
        goto L22
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m4472constructorimpl(double value) {
        return m4473constructorimpl((float) value);
    }

    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    public static final byte m4488toByteimpl(short arg0) {
        return (byte) m4490toFloatimpl(arg0);
    }

    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    public static final short m4495toShortimpl(short arg0) {
        return (short) m4490toFloatimpl(arg0);
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    public static final int m4492toIntimpl(short arg0) {
        return (int) m4490toFloatimpl(arg0);
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    public static final long m4493toLongimpl(short arg0) {
        return (long) m4490toFloatimpl(arg0);
    }

    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    public static final float m4490toFloatimpl(short arg0) {
        int bits$iv = 65535 & arg0;
        int s$iv = 32768 & bits$iv;
        int e$iv = (bits$iv >>> 10) & 31;
        int m$iv = bits$iv & 1023;
        int outE$iv = 0;
        int outM$iv = 0;
        if (e$iv != 0) goto L9;
        if (m$iv == 0) goto L15;
        int bits$iv$iv = 1056964608 + m$iv;
        float o$iv = Float.intBitsToFloat(bits$iv$iv) - Float16Kt.access$getFp32DenormalFloat$p();
        if (s$iv != 0) goto L17;
        return o$iv;
    L17:
        return -o$iv;
    L15:
        int out$iv = ((s$iv << 16) | (outE$iv << 23)) | outM$iv;
        return Float.intBitsToFloat(out$iv);
    L9:
        outM$iv = m$iv << 13;
        if (e$iv != 31) goto L14;
        outE$iv = 255;
        if (outM$iv == 0) goto L15;
        outM$iv = outM$iv | 4194304;
        goto L15
    L14:
        outE$iv = (e$iv - 15) + WorkQueueKt.MASK;
        goto L15
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    public static final double m4489toDoubleimpl(short arg0) {
        return m4490toFloatimpl(arg0);
    }

    /* JADX INFO: renamed from: toBits-impl, reason: not valid java name */
    public static final int m4487toBitsimpl(short arg0) {
        if (m4484isNaNimpl(arg0) == false) goto L6;
        return 32256;
    L6:
        return 65535 & arg0;
    }

    /* JADX INFO: renamed from: toRawBits-impl, reason: not valid java name */
    public static final int m4494toRawBitsimpl(short arg0) {
        return 65535 & arg0;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4496toStringimpl(short arg0) {
        return String.valueOf(m4490toFloatimpl(arg0));
    }

    public String toString() {
        return m4496toStringimpl(this.halfValue);
    }

    /* JADX INFO: renamed from: compareTo-41bOqos, reason: not valid java name */
    public int m4499compareTo41bOqos(short other) {
        return m4471compareTo41bOqos(this.halfValue, other);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: compareTo-41bOqos, reason: not valid java name */
    public static int m4471compareTo41bOqos(short r6, short r7) {
        if (m4484isNaNimpl(r6) == false) goto L7;
        return !m4484isNaNimpl(r7) ? 1 : 0;
    L7:
        if (m4484isNaNimpl(r7) == false) goto L11;
        return -1;
    L11:
        if ((r6 & ShortCompanionObject.MIN_VALUE) == 0) goto L13;
        int r3 = 32768 - (r6 & UShort.MAX_VALUE);
    L15:
        if ((r7 & ShortCompanionObject.MIN_VALUE) == 0) goto L17;
        int r2 = 32768 - (65535 & r7);
    L19:
        return Intrinsics.compare(r3, r2);
    L17:
        r2 = r7 & UShort.MAX_VALUE;
        goto L19
    L13:
        r3 = r6 & UShort.MAX_VALUE;
        goto L15
    }

    /* JADX INFO: renamed from: getSign-slo4al4, reason: not valid java name */
    public static final short m4479getSignslo4al4(short arg0) {
        int v = arg0 & ShortCompanionObject.MAX_VALUE;
        boolean r2 = true;
        if (v <= 31744) goto L5;
        boolean r1 = true;
    L6:
        if (v == 0) goto L10;
        r2 = false;
    L10:
        if ((r1 | r2) == false) goto L12;
        int u = v;
    L14:
        return m4474constructorimpl((short) u);
    L12:
        u = (Short.MIN_VALUE & arg0) | 15360;
        goto L14
    L5:
        r1 = false;
        goto L6
    }

    /* JADX INFO: renamed from: withSign-qCeQghg, reason: not valid java name */
    public static final short m4498withSignqCeQghg(short arg0, short sign) {
        return m4474constructorimpl((short) ((Short.MIN_VALUE & sign) | (arg0 & ShortCompanionObject.MAX_VALUE)));
    }

    /* JADX INFO: renamed from: absoluteValue-slo4al4, reason: not valid java name */
    public static final short m4468absoluteValueslo4al4(short arg0) {
        return m4474constructorimpl((short) (arg0 & ShortCompanionObject.MAX_VALUE));
    }

    /* JADX INFO: renamed from: round-slo4al4, reason: not valid java name */
    public static final short m4486roundslo4al4(short arg0) {
        int r0 = SupportMenu.USER_MASK;
        int bits = arg0 & UShort.MAX_VALUE;
        int e = bits & 32767;
        int result = bits;
        if (e >= 15360) goto L10;
        int result2 = result & 32768;
        if (e >= 14336) goto L8;
        r0 = 0;
    L8:
        result = result2 | (r0 & 15360);
    L13:
        return m4474constructorimpl((short) result);
    L10:
        if (e >= 25600) goto L13;
        int e2 = 25 - (e >> 10);
        int mask = (1 << e2) - 1;
        result = (result + (1 << (e2 - 1))) & (~mask);
        goto L13
    }

    /* JADX INFO: renamed from: ceil-slo4al4, reason: not valid java name */
    public static final short m4470ceilslo4al4(short arg0) {
        int bits = 65535 & arg0;
        int e = bits & 32767;
        int result = bits;
        int r3 = 1;
        if (e >= 15360) goto L10;
        int result2 = result & 32768;
        int r5 = ~(bits >> 15);
        if (e != 0) goto L8;
        r3 = 0;
    L8:
        result = result2 | ((-(r3 & r5)) & 15360);
    L13:
        return m4474constructorimpl((short) result);
    L10:
        if (e >= 25600) goto L13;
        int mask = (1 << (25 - (e >> 10))) - 1;
        result = (result + (mask & ((bits >> 15) - 1))) & (~mask);
        goto L13
    }

    /* JADX INFO: renamed from: floor-slo4al4, reason: not valid java name */
    public static final short m4477floorslo4al4(short arg0) {
        int r0 = SupportMenu.USER_MASK;
        int bits = arg0 & UShort.MAX_VALUE;
        int e = bits & 32767;
        int result = bits;
        if (e >= 15360) goto L10;
        int result2 = result & 32768;
        if (bits > 32768) goto L8;
        r0 = 0;
    L8:
        result = result2 | (r0 & 15360);
    L13:
        return m4474constructorimpl((short) result);
    L10:
        if (e >= 25600) goto L13;
        int mask = (1 << (25 - (e >> 10))) - 1;
        result = (result + ((-(bits >> 15)) & mask)) & (~mask);
        goto L13
    }

    /* JADX INFO: renamed from: trunc-slo4al4, reason: not valid java name */
    public static final short m4497truncslo4al4(short arg0) {
        int bits = 65535 & arg0;
        int e = bits & 32767;
        int result = bits;
        if (e >= 15360) goto L6;
        result = result & 32768;
    L9:
        return m4474constructorimpl((short) result);
    L6:
        if (e >= 25600) goto L9;
        int mask = (1 << (25 - (e >> 10))) - 1;
        result = result & (~mask);
        goto L9
    }

    /* JADX INFO: renamed from: getExponent-impl, reason: not valid java name */
    public static final int m4478getExponentimpl(short arg0) {
        return ((arg0 >>> 10) & 31) - 15;
    }

    /* JADX INFO: renamed from: getSignificand-impl, reason: not valid java name */
    public static final int m4480getSignificandimpl(short arg0) {
        return arg0 & 1023;
    }

    /* JADX INFO: renamed from: isNaN-impl, reason: not valid java name */
    public static final boolean m4484isNaNimpl(short arg0) {
        if ((arg0 & ShortCompanionObject.MAX_VALUE) <= 31744) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m4483isInfiniteimpl(short arg0) {
        if ((arg0 & ShortCompanionObject.MAX_VALUE) != 31744) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m4482isFiniteimpl(short arg0) {
        if ((arg0 & ShortCompanionObject.MAX_VALUE) == 31744) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: isNormalized-impl, reason: not valid java name */
    public static final boolean m4485isNormalizedimpl(short arg0) {
        int v = arg0 & 31744;
        boolean r1 = true;
        if (v == 0) goto L5;
        boolean r3 = true;
    L7:
        if (v != 31744) goto L11;
        r1 = false;
    L11:
        return r1 & r3;
    L5:
        r3 = false;
        goto L7
    }

    /* JADX INFO: renamed from: toHexString-impl, reason: not valid java name */
    public static final String m4491toHexStringimpl(short arg0) {
        StringBuilder o = new StringBuilder();
        int bits = 65535 & arg0;
        int s = bits >>> 15;
        int e = (bits >>> 10) & 31;
        int m = bits & 1023;
        if (e != 31) goto L10;
        if (m != 0) goto L8;
        if (s == 0) goto L7;
        o.append('-');
    L7:
        o.append("Infinity");
    L19:
        return o.toString();
    L8:
        o.append("NaN");
        goto L19
    L10:
        if (s != 1) goto L13;
        o.append('-');
    L13:
        if (e != 0) goto L17;
        if (m != 0) goto L16;
        o.append("0x0.0p0");
        goto L19
    L16:
        o.append("0x0.");
        String significand = Integer.toString(m, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(significand, "toString(...)");
        o.append(new Regex("0{2,}$").replaceFirst(significand, ""));
        o.append("p-14");
        goto L19
    L17:
        o.append("0x1.");
        String significand2 = Integer.toString(m, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(significand2, "toString(...)");
        o.append(new Regex("0{2,}$").replaceFirst(significand2, ""));
        o.append('p');
        o.append(String.valueOf(e - 15));
        goto L19
    }

    static {
        Companion = new Companion(null);
        Epsilon = m4474constructorimpl(5120);
        LowestValue = m4474constructorimpl(-1025);
        MaxValue = m4474constructorimpl(31743);
        MinNormal = m4474constructorimpl(1024);
        MinValue = m4474constructorimpl(1);
        NaN = m4474constructorimpl(32256);
        NegativeInfinity = m4474constructorimpl(-1024);
        NegativeZero = m4474constructorimpl(ShortCompanionObject.MIN_VALUE);
        PositiveInfinity = m4474constructorimpl(31744);
        PositiveZero = m4474constructorimpl(0);
    }
}
