package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.UShort;
import kotlin.jvm.internal.ShortCompanionObject;

/* JADX INFO: compiled from: Float16.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0011\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH\u0080\b\u001a\u0011\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0015H\u0080\b\u001a\"\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\"\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010\u001e\u001a\u0011\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0015H\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Fp16Combined", "", "Fp16ExponentBias", "Fp16ExponentMask", "Fp16ExponentMax", "Fp16ExponentShift", "Fp16One", "Fp16SignMask", "Fp16SignShift", "Fp16SignificandMask", "Fp16TheNaN", "Fp32DenormalFloat", "", "Fp32DenormalMagic", "Fp32ExponentBias", "Fp32ExponentMask", "Fp32ExponentShift", "Fp32QNaNMask", "Fp32SignShift", "Fp32SignificandMask", "floatToHalf", "", "f", "halfToFloat", "h", "max", "Landroidx/compose/ui/graphics/Float16;", "x", "y", "max-AoSsdG0", "(SS)S", "min", "min-AoSsdG0", "toCompareValue", "value", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Float16Kt {
    private static final int Fp16Combined = 32767;
    private static final int Fp16ExponentBias = 15;
    private static final int Fp16ExponentMask = 31;
    private static final int Fp16ExponentMax = 31744;
    private static final int Fp16ExponentShift = 10;
    private static final int Fp16One = 15360;
    private static final int Fp16SignMask = 32768;
    private static final int Fp16SignShift = 15;
    private static final int Fp16SignificandMask = 1023;
    private static final int Fp16TheNaN = 32256;
    private static final float Fp32DenormalFloat = 0.0f;
    private static final int Fp32DenormalMagic = 1056964608;
    private static final int Fp32ExponentBias = 127;
    private static final int Fp32ExponentMask = 255;
    private static final int Fp32ExponentShift = 23;
    private static final int Fp32QNaNMask = 4194304;
    private static final int Fp32SignShift = 31;
    private static final int Fp32SignificandMask = 8388607;

    public static final /* synthetic */ float access$getFp32DenormalFloat$p() {
        return Fp32DenormalFloat;
    }

    static {
        Fp32DenormalFloat = Float.intBitsToFloat(Fp32DenormalMagic);
    }

    private static final int toCompareValue(short value) {
        if ((value & ShortCompanionObject.MIN_VALUE) == 0) goto L6;
        return 32768 - (value & UShort.MAX_VALUE);
    L6:
        return value & UShort.MAX_VALUE;
    }

    public static final short floatToHalf(float f) {
        int bits = Float.floatToRawIntBits(f);
        int s = bits >>> 31;
        int e = (bits >>> 23) & 255;
        int m = Fp32SignificandMask & bits;
        int outE = 0;
        int outM = 0;
        if (e != 255) goto L9;
        outE = 31;
        if (m == 0) goto L7;
        int r4 = 512;
    L8:
        outM = r4;
    L23:
        int out = s << 15;
        return (short) ((out | (outE << 10)) | outM);
    L7:
        r4 = 0;
        goto L8
    L9:
        int e2 = (e - 127) + 15;
        if (e2 < 31) goto L12;
        outE = 49;
        goto L23
    L12:
        if (e2 <= 0) goto L14;
        outE = e2;
        outM = m >> 13;
        if ((m & 4096) == 0) goto L23;
        int out2 = (outE << 10) | outM;
        return (short) ((s << 15) | (out2 + 1));
    L14:
        if (e2 < (-10)) goto L23;
        int m2 = (8388608 | m) >> (1 - e2);
        if ((m2 & 4096) == 0) goto L18;
        m2 = m2 + 8192;
    L18:
        outM = m2 >> 13;
        goto L23
    }

    public static final float halfToFloat(short h) {
        int bits = 65535 & h;
        int s = 32768 & bits;
        int e = (bits >>> 10) & 31;
        int m = bits & Fp16SignificandMask;
        int outE = 0;
        int outM = 0;
        if (e != 0) goto L10;
        if (m == 0) goto L16;
        int bits$iv = Fp32DenormalMagic + m;
        float o = Float.intBitsToFloat(bits$iv) - access$getFp32DenormalFloat$p();
        if (s != 0) goto L9;
        return o;
    L9:
        return -o;
    L16:
        int out = ((s << 16) | (outE << 23)) | outM;
        return Float.intBitsToFloat(out);
    L10:
        outM = m << 13;
        if (e != 31) goto L15;
        outE = 255;
        if (outM == 0) goto L16;
        outM = outM | 4194304;
        goto L16
    L15:
        outE = (e - 15) + 127;
        goto L16
    }

    /* JADX INFO: renamed from: min-AoSsdG0, reason: not valid java name */
    public static final short m4512minAoSsdG0(short x, short y) {
        if (Float16.m4484isNaNimpl(x) == true) goto L13;
        if (Float16.m4484isNaNimpl(y) == true) goto L13;
        if (Float16.m4471compareTo41bOqos(x, y) > 0) goto L11;
        return x;
    L11:
        return y;
    L13:
        return Float16.Companion.m4506getNaNslo4al4();
    }

    /* JADX INFO: renamed from: max-AoSsdG0, reason: not valid java name */
    public static final short m4511maxAoSsdG0(short x, short y) {
        if (Float16.m4484isNaNimpl(x) == true) goto L13;
        if (Float16.m4484isNaNimpl(y) == true) goto L13;
        if (Float16.m4471compareTo41bOqos(x, y) < 0) goto L11;
        return x;
    L11:
        return y;
    L13:
        return Float16.Companion.m4506getNaNslo4al4();
    }
}
