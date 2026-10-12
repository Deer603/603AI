package androidx.compose.ui.graphics;

import androidx.autofill.HintConstants;
import androidx.core.text.util.LocalePreferences;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ColorMatrix.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0086\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tH\u0086\b¢\u0006\u0004\b\u001e\u0010\u000bJP\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001426\u0010!\u001a2\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\t0\"H\u0082\b¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b+\u0010,J(\u0010)\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0014H\u0086\n¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0014¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0014¢\u0006\u0004\b4\u00102J\u0015\u00105\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0014¢\u0006\u0004\b6\u00102J\u0015\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\u0014¢\u0006\u0004\b9\u00102J-\u0010:\u001a\u00020\t2\u0006\u0010;\u001a\u00020\u00142\u0006\u0010<\u001a\u00020\u00142\u0006\u0010=\u001a\u00020\u00142\u0006\u0010>\u001a\u00020\u0014¢\u0006\u0004\b?\u0010@J\u001b\u0010A\u001a\u00020\t2\u0006\u0010B\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bC\u0010,J\u0010\u0010D\u001a\u00020EHÖ\u0001¢\u0006\u0004\bF\u0010GR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006H"}, d2 = {"Landroidx/compose/ui/graphics/ColorMatrix;", "", "values", "", "constructor-impl", "([F)[F", "getValues", "()[F", "convertRgbToYuv", "", "convertRgbToYuv-impl", "([F)V", "convertYuvToRgb", "convertYuvToRgb-impl", "equals", "", "other", "equals-impl", "([FLjava/lang/Object;)Z", "get", "", "row", "", "column", "get-impl", "([FII)F", "hashCode", "hashCode-impl", "([F)I", "reset", "reset-impl", "rotateInternal", "degrees", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "cosine", "sine", "rotateInternal-impl", "([FFLkotlin/jvm/functions/Function2;)V", "set", "src", "set-jHG-Opc", "([F[F)V", "v", "set-impl", "([FIIF)V", "setToRotateBlue", "setToRotateBlue-impl", "([FF)V", "setToRotateGreen", "setToRotateGreen-impl", "setToRotateRed", "setToRotateRed-impl", "setToSaturation", LocalePreferences.FirstDayOfWeek.SATURDAY, "setToSaturation-impl", "setToScale", "redScale", "greenScale", "blueScale", "alphaScale", "setToScale-impl", "([FFFFF)V", "timesAssign", "colorMatrix", "timesAssign-jHG-Opc", "toString", "", "toString-impl", "([F)Ljava/lang/String;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class ColorMatrix {
    private final float[] values;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ColorMatrix m4421boximpl(float[] r1) {
        return new ColorMatrix(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static float[] m4422constructorimpl(float[] r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4426equalsimpl(float[] r2, Object r3) {
        if ((r3 instanceof ColorMatrix) == true) goto L6;
        return false;
    L6:
        if (Intrinsics.areEqual(r2, ((ColorMatrix) r3).m4441unboximpl()) == true) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4427equalsimpl0(float[] r1, float[] r2) {
        return Intrinsics.areEqual(r1, r2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4429hashCodeimpl(float[] r1) {
        return Arrays.hashCode(r1);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4440toStringimpl(float[] r2) {
        return "ColorMatrix(values=" + Arrays.toString(r2) + ')';
    }

    public boolean equals(Object r2) {
        return m4426equalsimpl(this.values, r2);
    }

    public int hashCode() {
        return m4429hashCodeimpl(this.values);
    }

    public String toString() {
        return m4440toStringimpl(this.values);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m4441unboximpl() {
        return this.values;
    }

    private /* synthetic */ ColorMatrix(float[] values) {
        this.values = values;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m4423constructorimpl$default(float[] r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    L6:
        return m4422constructorimpl(r1);
    }

    public final float[] getValues() {
        return this.values;
    }

    /* JADX INFO: renamed from: get-impl, reason: not valid java name */
    public static final float m4428getimpl(float[] arg0, int row, int column) {
        return arg0[(row * 5) + column];
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m4432setimpl(float[] arg0, int row, int column, float v) {
        arg0[(row * 5) + column] = v;
    }

    /* JADX INFO: renamed from: reset-impl, reason: not valid java name */
    public static final void m4430resetimpl(float[] arg0) {
        arg0[(0 * 5) + 0] = 1.0f;
        arg0[(0 * 5) + 1] = 0.0f;
        arg0[(0 * 5) + 2] = 0.0f;
        arg0[(0 * 5) + 3] = 0.0f;
        arg0[(0 * 5) + 4] = 0.0f;
        arg0[(1 * 5) + 0] = 0.0f;
        arg0[(1 * 5) + 1] = 1.0f;
        arg0[(1 * 5) + 2] = 0.0f;
        arg0[(1 * 5) + 3] = 0.0f;
        arg0[(1 * 5) + 4] = 0.0f;
        arg0[(2 * 5) + 0] = 0.0f;
        arg0[(2 * 5) + 1] = 0.0f;
        arg0[(2 * 5) + 2] = 1.0f;
        arg0[(2 * 5) + 3] = 0.0f;
        arg0[(2 * 5) + 4] = 0.0f;
        arg0[(3 * 5) + 0] = 0.0f;
        arg0[(3 * 5) + 1] = 0.0f;
        arg0[(3 * 5) + 2] = 0.0f;
        arg0[(3 * 5) + 3] = 1.0f;
        arg0[(3 * 5) + 4] = 0.0f;
    }

    /* JADX INFO: renamed from: set-jHG-Opc, reason: not valid java name */
    public static final void m4433setjHGOpc(float[] arg0, float[] src) {
        if (arg0.length >= 20) goto L6;
        return;
    L6:
        if (src.length >= 20) goto L8;
        return;
    L8:
        arg0[0] = src[0];
        arg0[1] = src[1];
        arg0[2] = src[2];
        arg0[3] = src[3];
        arg0[4] = src[4];
        arg0[5] = src[5];
        arg0[6] = src[6];
        arg0[7] = src[7];
        arg0[8] = src[8];
        arg0[9] = src[9];
        arg0[10] = src[10];
        arg0[11] = src[11];
        arg0[12] = src[12];
        arg0[13] = src[13];
        arg0[14] = src[14];
        arg0[15] = src[15];
        arg0[16] = src[16];
        arg0[17] = src[17];
        arg0[18] = src[18];
        arg0[19] = src[19];
    }

    /* JADX INFO: renamed from: rotateInternal-impl, reason: not valid java name */
    private static final void m4431rotateInternalimpl(float[] arg0, float degrees, Function2<? super Float, ? super Float, Unit> r17) {
        arg0[(0 * 5) + 0] = 1.0f;
        arg0[(0 * 5) + 1] = 0.0f;
        arg0[(0 * 5) + 2] = 0.0f;
        arg0[(0 * 5) + 3] = 0.0f;
        arg0[(0 * 5) + 4] = 0.0f;
        arg0[(1 * 5) + 0] = 0.0f;
        arg0[(1 * 5) + 1] = 1.0f;
        arg0[(1 * 5) + 2] = 0.0f;
        arg0[(1 * 5) + 3] = 0.0f;
        arg0[(1 * 5) + 4] = 0.0f;
        arg0[(2 * 5) + 0] = 0.0f;
        arg0[(2 * 5) + 1] = 0.0f;
        arg0[(2 * 5) + 2] = 1.0f;
        arg0[(2 * 5) + 3] = 0.0f;
        arg0[(2 * 5) + 4] = 0.0f;
        arg0[(3 * 5) + 0] = 0.0f;
        arg0[(3 * 5) + 1] = 0.0f;
        arg0[(3 * 5) + 2] = 0.0f;
        arg0[(3 * 5) + 3] = 1.0f;
        arg0[(3 * 5) + 4] = 0.0f;
        float normalizedAngle = 0.0027777778f * degrees;
        float normalizedDegrees$iv$iv = 0.25f + normalizedAngle;
        float degrees$iv$iv = normalizedDegrees$iv$iv - ((float) Math.floor(normalizedDegrees$iv$iv + 0.5f));
        float x$iv$iv = Math.abs(degrees$iv$iv) * 2.0f;
        float a$iv$iv = 1.0f - x$iv$iv;
        float cosine = ((degrees$iv$iv * 8.0f) * a$iv$iv) / (1.25f - (x$iv$iv * a$iv$iv));
        float degrees$iv = normalizedAngle - ((float) Math.floor(0.5f + normalizedAngle));
        float x$iv = Math.abs(degrees$iv) * 2.0f;
        float a$iv = 1.0f - x$iv;
        float sine = ((8.0f * degrees$iv) * a$iv) / (1.25f - (x$iv * a$iv));
        r17.invoke(Float.valueOf(cosine), Float.valueOf(sine));
    }

    /* JADX INFO: renamed from: timesAssign-jHG-Opc, reason: not valid java name */
    public static final void m4439timesAssignjHGOpc(float[] arg0, float[] colorMatrix) {
        if (arg0.length >= 20) goto L5;
        return;
    L5:
        float v00 = (((arg0[(0 * 5) + 0] * colorMatrix[(0 * 5) + 0]) + (arg0[(0 * 5) + 1] * colorMatrix[(1 * 5) + 0])) + (arg0[(0 * 5) + 2] * colorMatrix[(2 * 5) + 0])) + (arg0[(0 * 5) + 3] * colorMatrix[(3 * 5) + 0]);
        float v01 = (((arg0[(0 * 5) + 0] * colorMatrix[(0 * 5) + 1]) + (arg0[(0 * 5) + 1] * colorMatrix[(1 * 5) + 1])) + (arg0[(0 * 5) + 2] * colorMatrix[(2 * 5) + 1])) + (arg0[(0 * 5) + 3] * colorMatrix[(3 * 5) + 1]);
        float v02 = (((arg0[(0 * 5) + 0] * colorMatrix[(0 * 5) + 2]) + (arg0[(0 * 5) + 1] * colorMatrix[(1 * 5) + 2])) + (arg0[(0 * 5) + 2] * colorMatrix[(2 * 5) + 2])) + (arg0[(0 * 5) + 3] * colorMatrix[(3 * 5) + 2]);
        float v03 = (((arg0[(0 * 5) + 0] * colorMatrix[(0 * 5) + 3]) + (arg0[(0 * 5) + 1] * colorMatrix[(1 * 5) + 3])) + (arg0[(0 * 5) + 2] * colorMatrix[(2 * 5) + 3])) + (arg0[(0 * 5) + 3] * colorMatrix[(3 * 5) + 3]);
        float v04 = ((((arg0[(0 * 5) + 0] * colorMatrix[(0 * 5) + 4]) + (arg0[(0 * 5) + 1] * colorMatrix[(1 * 5) + 4])) + (arg0[(0 * 5) + 2] * colorMatrix[(2 * 5) + 4])) + (arg0[(0 * 5) + 3] * colorMatrix[(3 * 5) + 4])) + arg0[(0 * 5) + 4];
        float v10 = (((arg0[(1 * 5) + 0] * colorMatrix[(0 * 5) + 0]) + (arg0[(1 * 5) + 1] * colorMatrix[(1 * 5) + 0])) + (arg0[(1 * 5) + 2] * colorMatrix[(2 * 5) + 0])) + (arg0[(1 * 5) + 3] * colorMatrix[(3 * 5) + 0]);
        float v11 = (((arg0[(1 * 5) + 0] * colorMatrix[(0 * 5) + 1]) + (arg0[(1 * 5) + 1] * colorMatrix[(1 * 5) + 1])) + (arg0[(1 * 5) + 2] * colorMatrix[(2 * 5) + 1])) + (arg0[(1 * 5) + 3] * colorMatrix[(3 * 5) + 1]);
        float v12 = (((arg0[(1 * 5) + 0] * colorMatrix[(0 * 5) + 2]) + (arg0[(1 * 5) + 1] * colorMatrix[(1 * 5) + 2])) + (arg0[(1 * 5) + 2] * colorMatrix[(2 * 5) + 2])) + (arg0[(1 * 5) + 3] * colorMatrix[(3 * 5) + 2]);
        float v13 = (((arg0[(1 * 5) + 0] * colorMatrix[(0 * 5) + 3]) + (arg0[(1 * 5) + 1] * colorMatrix[(1 * 5) + 3])) + (arg0[(1 * 5) + 2] * colorMatrix[(2 * 5) + 3])) + (arg0[(1 * 5) + 3] * colorMatrix[(3 * 5) + 3]);
        float v14 = ((((arg0[(1 * 5) + 0] * colorMatrix[(0 * 5) + 4]) + (arg0[(1 * 5) + 1] * colorMatrix[(1 * 5) + 4])) + (arg0[(1 * 5) + 2] * colorMatrix[(2 * 5) + 4])) + (arg0[(1 * 5) + 3] * colorMatrix[(3 * 5) + 4])) + arg0[(1 * 5) + 4];
        float v20 = (((arg0[(2 * 5) + 0] * colorMatrix[(0 * 5) + 0]) + (arg0[(2 * 5) + 1] * colorMatrix[(1 * 5) + 0])) + (arg0[(2 * 5) + 2] * colorMatrix[(2 * 5) + 0])) + (arg0[(2 * 5) + 3] * colorMatrix[(3 * 5) + 0]);
        float v21 = (((arg0[(2 * 5) + 0] * colorMatrix[(0 * 5) + 1]) + (arg0[(2 * 5) + 1] * colorMatrix[(1 * 5) + 1])) + (arg0[(2 * 5) + 2] * colorMatrix[(2 * 5) + 1])) + (arg0[(2 * 5) + 3] * colorMatrix[(3 * 5) + 1]);
        float v22 = (((arg0[(2 * 5) + 0] * colorMatrix[(0 * 5) + 2]) + (arg0[(2 * 5) + 1] * colorMatrix[(1 * 5) + 2])) + (arg0[(2 * 5) + 2] * colorMatrix[(2 * 5) + 2])) + (arg0[(2 * 5) + 3] * colorMatrix[(3 * 5) + 2]);
        float v23 = (((arg0[(2 * 5) + 0] * colorMatrix[(0 * 5) + 3]) + (arg0[(2 * 5) + 1] * colorMatrix[(1 * 5) + 3])) + (arg0[(2 * 5) + 2] * colorMatrix[(2 * 5) + 3])) + (arg0[(2 * 5) + 3] * colorMatrix[(3 * 5) + 3]);
        float v24 = ((((arg0[(2 * 5) + 0] * colorMatrix[(0 * 5) + 4]) + (arg0[(2 * 5) + 1] * colorMatrix[(1 * 5) + 4])) + (arg0[(2 * 5) + 2] * colorMatrix[(2 * 5) + 4])) + (arg0[(2 * 5) + 3] * colorMatrix[(3 * 5) + 4])) + arg0[(2 * 5) + 4];
        float v30 = (((arg0[(3 * 5) + 0] * colorMatrix[(0 * 5) + 0]) + (arg0[(3 * 5) + 1] * colorMatrix[(1 * 5) + 0])) + (arg0[(3 * 5) + 2] * colorMatrix[(2 * 5) + 0])) + (arg0[(3 * 5) + 3] * colorMatrix[(3 * 5) + 0]);
        float v31 = (((arg0[(3 * 5) + 0] * colorMatrix[(0 * 5) + 1]) + (arg0[(3 * 5) + 1] * colorMatrix[(1 * 5) + 1])) + (arg0[(3 * 5) + 2] * colorMatrix[(2 * 5) + 1])) + (arg0[(3 * 5) + 3] * colorMatrix[(3 * 5) + 1]);
        float v32 = (((arg0[(3 * 5) + 0] * colorMatrix[(0 * 5) + 2]) + (arg0[(3 * 5) + 1] * colorMatrix[(1 * 5) + 2])) + (arg0[(3 * 5) + 2] * colorMatrix[(2 * 5) + 2])) + (arg0[(3 * 5) + 3] * colorMatrix[(3 * 5) + 2]);
        float v33 = (((arg0[(3 * 5) + 0] * colorMatrix[(0 * 5) + 3]) + (arg0[(3 * 5) + 1] * colorMatrix[(1 * 5) + 3])) + (arg0[(3 * 5) + 2] * colorMatrix[(2 * 5) + 3])) + (arg0[(3 * 5) + 3] * colorMatrix[(3 * 5) + 3]);
        float v34 = ((((arg0[(3 * 5) + 0] * colorMatrix[(0 * 5) + 4]) + (arg0[(3 * 5) + 1] * colorMatrix[(1 * 5) + 4])) + (arg0[(3 * 5) + 2] * colorMatrix[(2 * 5) + 4])) + (arg0[(3 * 5) + 3] * colorMatrix[(3 * 5) + 4])) + arg0[(3 * 5) + 4];
        arg0[(0 * 5) + 0] = v00;
        arg0[(0 * 5) + 1] = v01;
        arg0[(0 * 5) + 2] = v02;
        arg0[(0 * 5) + 3] = v03;
        arg0[(0 * 5) + 4] = v04;
        arg0[(1 * 5) + 0] = v10;
        arg0[(1 * 5) + 1] = v11;
        arg0[(1 * 5) + 2] = v12;
        arg0[(1 * 5) + 3] = v13;
        arg0[(1 * 5) + 4] = v14;
        arg0[(2 * 5) + 0] = v20;
        arg0[(2 * 5) + 1] = v21;
        arg0[(2 * 5) + 2] = v22;
        arg0[(2 * 5) + 3] = v23;
        arg0[(2 * 5) + 4] = v24;
        arg0[(3 * 5) + 0] = v30;
        arg0[(3 * 5) + 1] = v31;
        arg0[(3 * 5) + 2] = v32;
        arg0[(3 * 5) + 3] = v33;
        arg0[(3 * 5) + 4] = v34;
    }

    /* JADX INFO: renamed from: setToSaturation-impl, reason: not valid java name */
    public static final void m4437setToSaturationimpl(float[] arg0, float sat) {
        if (arg0.length >= 20) goto L5;
        return;
    L5:
        arg0[(0 * 5) + 0] = 1.0f;
        arg0[(0 * 5) + 1] = 0.0f;
        arg0[(0 * 5) + 2] = 0.0f;
        arg0[(0 * 5) + 3] = 0.0f;
        arg0[(0 * 5) + 4] = 0.0f;
        arg0[(1 * 5) + 0] = 0.0f;
        arg0[(1 * 5) + 1] = 1.0f;
        arg0[(1 * 5) + 2] = 0.0f;
        arg0[(1 * 5) + 3] = 0.0f;
        arg0[(1 * 5) + 4] = 0.0f;
        arg0[(2 * 5) + 0] = 0.0f;
        arg0[(2 * 5) + 1] = 0.0f;
        arg0[(2 * 5) + 2] = 1.0f;
        arg0[(2 * 5) + 3] = 0.0f;
        arg0[(2 * 5) + 4] = 0.0f;
        arg0[(3 * 5) + 0] = 0.0f;
        arg0[(3 * 5) + 1] = 0.0f;
        arg0[(3 * 5) + 2] = 0.0f;
        arg0[(3 * 5) + 3] = 1.0f;
        arg0[(3 * 5) + 4] = 0.0f;
        float invSat = 1.0f - sat;
        float r = 0.213f * invSat;
        float g = 0.715f * invSat;
        float b = 0.072f * invSat;
        float v$iv = r + sat;
        arg0[(0 * 5) + 0] = v$iv;
        arg0[(0 * 5) + 1] = g;
        arg0[(0 * 5) + 2] = b;
        arg0[(1 * 5) + 0] = r;
        float v$iv2 = g + sat;
        arg0[(1 * 5) + 1] = v$iv2;
        arg0[(1 * 5) + 2] = b;
        arg0[(2 * 5) + 0] = r;
        arg0[(2 * 5) + 1] = g;
        float v$iv3 = b + sat;
        arg0[(2 * 5) + 2] = v$iv3;
    }

    /* JADX INFO: renamed from: setToScale-impl, reason: not valid java name */
    public static final void m4438setToScaleimpl(float[] arg0, float redScale, float greenScale, float blueScale, float alphaScale) {
        if (arg0.length >= 20) goto L5;
        return;
    L5:
        arg0[(0 * 5) + 0] = 1.0f;
        arg0[(0 * 5) + 1] = 0.0f;
        arg0[(0 * 5) + 2] = 0.0f;
        arg0[(0 * 5) + 3] = 0.0f;
        arg0[(0 * 5) + 4] = 0.0f;
        arg0[(1 * 5) + 0] = 0.0f;
        arg0[(1 * 5) + 1] = 1.0f;
        arg0[(1 * 5) + 2] = 0.0f;
        arg0[(1 * 5) + 3] = 0.0f;
        arg0[(1 * 5) + 4] = 0.0f;
        arg0[(2 * 5) + 0] = 0.0f;
        arg0[(2 * 5) + 1] = 0.0f;
        arg0[(2 * 5) + 2] = 1.0f;
        arg0[(2 * 5) + 3] = 0.0f;
        arg0[(2 * 5) + 4] = 0.0f;
        arg0[(3 * 5) + 0] = 0.0f;
        arg0[(3 * 5) + 1] = 0.0f;
        arg0[(3 * 5) + 2] = 0.0f;
        arg0[(3 * 5) + 3] = 1.0f;
        arg0[(3 * 5) + 4] = 0.0f;
        arg0[(0 * 5) + 0] = redScale;
        arg0[(1 * 5) + 1] = greenScale;
        arg0[(2 * 5) + 2] = blueScale;
        arg0[(3 * 5) + 3] = alphaScale;
    }

    /* JADX INFO: renamed from: setToRotateRed-impl, reason: not valid java name */
    public static final void m4436setToRotateRedimpl(float[] arg0, float degrees) {
        if (arg0.length >= 20) goto L5;
        return;
    L5:
        arg0[(0 * 5) + 0] = 1.0f;
        arg0[(0 * 5) + 1] = 0.0f;
        arg0[(0 * 5) + 2] = 0.0f;
        arg0[(0 * 5) + 3] = 0.0f;
        arg0[(0 * 5) + 4] = 0.0f;
        arg0[(1 * 5) + 0] = 0.0f;
        arg0[(1 * 5) + 1] = 1.0f;
        arg0[(1 * 5) + 2] = 0.0f;
        arg0[(1 * 5) + 3] = 0.0f;
        arg0[(1 * 5) + 4] = 0.0f;
        arg0[(2 * 5) + 0] = 0.0f;
        arg0[(2 * 5) + 1] = 0.0f;
        arg0[(2 * 5) + 2] = 1.0f;
        arg0[(2 * 5) + 3] = 0.0f;
        arg0[(2 * 5) + 4] = 0.0f;
        arg0[(3 * 5) + 0] = 0.0f;
        arg0[(3 * 5) + 1] = 0.0f;
        arg0[(3 * 5) + 2] = 0.0f;
        arg0[(3 * 5) + 3] = 1.0f;
        arg0[(3 * 5) + 4] = 0.0f;
        float normalizedAngle$iv = 0.0027777778f * degrees;
        float normalizedDegrees$iv$iv$iv = 0.25f + normalizedAngle$iv;
        float degrees$iv$iv$iv = normalizedDegrees$iv$iv$iv - ((float) Math.floor(normalizedDegrees$iv$iv$iv + 0.5f));
        float x$iv$iv$iv = Math.abs(degrees$iv$iv$iv) * 2.0f;
        float a$iv$iv$iv = 1.0f - x$iv$iv$iv;
        float cosine$iv = ((degrees$iv$iv$iv * 8.0f) * a$iv$iv$iv) / (1.25f - (x$iv$iv$iv * a$iv$iv$iv));
        float degrees$iv$iv = normalizedAngle$iv - ((float) Math.floor(0.5f + normalizedAngle$iv));
        float x$iv$iv = Math.abs(degrees$iv$iv) * 2.0f;
        float a$iv$iv = 1.0f - x$iv$iv;
        float sine$iv = ((8.0f * degrees$iv$iv) * a$iv$iv) / (1.25f - (x$iv$iv * a$iv$iv));
        arg0[(1 * 5) + 1] = cosine$iv;
        arg0[(1 * 5) + 2] = sine$iv;
        float v$iv = -sine$iv;
        arg0[(2 * 5) + 1] = v$iv;
        arg0[(2 * 5) + 2] = cosine$iv;
    }

    /* JADX INFO: renamed from: setToRotateGreen-impl, reason: not valid java name */
    public static final void m4435setToRotateGreenimpl(float[] arg0, float degrees) {
        if (arg0.length >= 20) goto L5;
        return;
    L5:
        arg0[(0 * 5) + 0] = 1.0f;
        arg0[(0 * 5) + 1] = 0.0f;
        arg0[(0 * 5) + 2] = 0.0f;
        arg0[(0 * 5) + 3] = 0.0f;
        arg0[(0 * 5) + 4] = 0.0f;
        arg0[(1 * 5) + 0] = 0.0f;
        arg0[(1 * 5) + 1] = 1.0f;
        arg0[(1 * 5) + 2] = 0.0f;
        arg0[(1 * 5) + 3] = 0.0f;
        arg0[(1 * 5) + 4] = 0.0f;
        arg0[(2 * 5) + 0] = 0.0f;
        arg0[(2 * 5) + 1] = 0.0f;
        arg0[(2 * 5) + 2] = 1.0f;
        arg0[(2 * 5) + 3] = 0.0f;
        arg0[(2 * 5) + 4] = 0.0f;
        arg0[(3 * 5) + 0] = 0.0f;
        arg0[(3 * 5) + 1] = 0.0f;
        arg0[(3 * 5) + 2] = 0.0f;
        arg0[(3 * 5) + 3] = 1.0f;
        arg0[(3 * 5) + 4] = 0.0f;
        float normalizedAngle$iv = 0.0027777778f * degrees;
        float normalizedDegrees$iv$iv$iv = 0.25f + normalizedAngle$iv;
        float degrees$iv$iv$iv = normalizedDegrees$iv$iv$iv - ((float) Math.floor(normalizedDegrees$iv$iv$iv + 0.5f));
        float x$iv$iv$iv = Math.abs(degrees$iv$iv$iv) * 2.0f;
        float a$iv$iv$iv = 1.0f - x$iv$iv$iv;
        float cosine$iv = ((degrees$iv$iv$iv * 8.0f) * a$iv$iv$iv) / (1.25f - (x$iv$iv$iv * a$iv$iv$iv));
        float degrees$iv$iv = normalizedAngle$iv - ((float) Math.floor(0.5f + normalizedAngle$iv));
        float x$iv$iv = Math.abs(degrees$iv$iv) * 2.0f;
        float a$iv$iv = 1.0f - x$iv$iv;
        float sine$iv = ((8.0f * degrees$iv$iv) * a$iv$iv) / (1.25f - (x$iv$iv * a$iv$iv));
        arg0[(0 * 5) + 0] = cosine$iv;
        float v$iv = -sine$iv;
        arg0[(0 * 5) + 2] = v$iv;
        arg0[(2 * 5) + 0] = sine$iv;
        arg0[(2 * 5) + 2] = cosine$iv;
    }

    /* JADX INFO: renamed from: setToRotateBlue-impl, reason: not valid java name */
    public static final void m4434setToRotateBlueimpl(float[] arg0, float degrees) {
        if (arg0.length >= 20) goto L5;
        return;
    L5:
        arg0[(0 * 5) + 0] = 1.0f;
        arg0[(0 * 5) + 1] = 0.0f;
        arg0[(0 * 5) + 2] = 0.0f;
        arg0[(0 * 5) + 3] = 0.0f;
        arg0[(0 * 5) + 4] = 0.0f;
        arg0[(1 * 5) + 0] = 0.0f;
        arg0[(1 * 5) + 1] = 1.0f;
        arg0[(1 * 5) + 2] = 0.0f;
        arg0[(1 * 5) + 3] = 0.0f;
        arg0[(1 * 5) + 4] = 0.0f;
        arg0[(2 * 5) + 0] = 0.0f;
        arg0[(2 * 5) + 1] = 0.0f;
        arg0[(2 * 5) + 2] = 1.0f;
        arg0[(2 * 5) + 3] = 0.0f;
        arg0[(2 * 5) + 4] = 0.0f;
        arg0[(3 * 5) + 0] = 0.0f;
        arg0[(3 * 5) + 1] = 0.0f;
        arg0[(3 * 5) + 2] = 0.0f;
        arg0[(3 * 5) + 3] = 1.0f;
        arg0[(3 * 5) + 4] = 0.0f;
        float normalizedAngle$iv = 0.0027777778f * degrees;
        float normalizedDegrees$iv$iv$iv = 0.25f + normalizedAngle$iv;
        float degrees$iv$iv$iv = normalizedDegrees$iv$iv$iv - ((float) Math.floor(normalizedDegrees$iv$iv$iv + 0.5f));
        float x$iv$iv$iv = Math.abs(degrees$iv$iv$iv) * 2.0f;
        float a$iv$iv$iv = 1.0f - x$iv$iv$iv;
        float cosine$iv = ((degrees$iv$iv$iv * 8.0f) * a$iv$iv$iv) / (1.25f - (x$iv$iv$iv * a$iv$iv$iv));
        float degrees$iv$iv = normalizedAngle$iv - ((float) Math.floor(0.5f + normalizedAngle$iv));
        float x$iv$iv = Math.abs(degrees$iv$iv) * 2.0f;
        float a$iv$iv = 1.0f - x$iv$iv;
        float sine$iv = ((8.0f * degrees$iv$iv) * a$iv$iv) / (1.25f - (x$iv$iv * a$iv$iv));
        arg0[(0 * 5) + 0] = cosine$iv;
        arg0[(0 * 5) + 1] = sine$iv;
        float v$iv = -sine$iv;
        arg0[(1 * 5) + 0] = v$iv;
        arg0[(1 * 5) + 1] = cosine$iv;
    }

    /* JADX INFO: renamed from: convertRgbToYuv-impl, reason: not valid java name */
    public static final void m4424convertRgbToYuvimpl(float[] arg0) {
        if (arg0.length >= 20) goto L5;
        return;
    L5:
        arg0[(0 * 5) + 0] = 1.0f;
        arg0[(0 * 5) + 1] = 0.0f;
        arg0[(0 * 5) + 2] = 0.0f;
        arg0[(0 * 5) + 3] = 0.0f;
        arg0[(0 * 5) + 4] = 0.0f;
        arg0[(1 * 5) + 0] = 0.0f;
        arg0[(1 * 5) + 1] = 1.0f;
        arg0[(1 * 5) + 2] = 0.0f;
        arg0[(1 * 5) + 3] = 0.0f;
        arg0[(1 * 5) + 4] = 0.0f;
        arg0[(2 * 5) + 0] = 0.0f;
        arg0[(2 * 5) + 1] = 0.0f;
        arg0[(2 * 5) + 2] = 1.0f;
        arg0[(2 * 5) + 3] = 0.0f;
        arg0[(2 * 5) + 4] = 0.0f;
        arg0[(3 * 5) + 0] = 0.0f;
        arg0[(3 * 5) + 1] = 0.0f;
        arg0[(3 * 5) + 2] = 0.0f;
        arg0[(3 * 5) + 3] = 1.0f;
        arg0[(3 * 5) + 4] = 0.0f;
        arg0[(0 * 5) + 0] = 0.299f;
        arg0[(0 * 5) + 1] = 0.587f;
        arg0[(0 * 5) + 2] = 0.114f;
        arg0[(1 * 5) + 0] = -0.16874f;
        arg0[(1 * 5) + 1] = -0.33126f;
        arg0[(1 * 5) + 2] = 0.5f;
        arg0[(2 * 5) + 0] = 0.5f;
        arg0[(2 * 5) + 1] = -0.41869f;
        arg0[(2 * 5) + 2] = -0.08131f;
    }

    /* JADX INFO: renamed from: convertYuvToRgb-impl, reason: not valid java name */
    public static final void m4425convertYuvToRgbimpl(float[] arg0) {
        if (arg0.length >= 20) goto L5;
        return;
    L5:
        arg0[(0 * 5) + 0] = 1.0f;
        arg0[(0 * 5) + 1] = 0.0f;
        arg0[(0 * 5) + 2] = 0.0f;
        arg0[(0 * 5) + 3] = 0.0f;
        arg0[(0 * 5) + 4] = 0.0f;
        arg0[(1 * 5) + 0] = 0.0f;
        arg0[(1 * 5) + 1] = 1.0f;
        arg0[(1 * 5) + 2] = 0.0f;
        arg0[(1 * 5) + 3] = 0.0f;
        arg0[(1 * 5) + 4] = 0.0f;
        arg0[(2 * 5) + 0] = 0.0f;
        arg0[(2 * 5) + 1] = 0.0f;
        arg0[(2 * 5) + 2] = 1.0f;
        arg0[(2 * 5) + 3] = 0.0f;
        arg0[(2 * 5) + 4] = 0.0f;
        arg0[(3 * 5) + 0] = 0.0f;
        arg0[(3 * 5) + 1] = 0.0f;
        arg0[(3 * 5) + 2] = 0.0f;
        arg0[(3 * 5) + 3] = 1.0f;
        arg0[(3 * 5) + 4] = 0.0f;
        arg0[(0 * 5) + 2] = 1.402f;
        arg0[(1 * 5) + 0] = 1.0f;
        arg0[(1 * 5) + 1] = -0.34414f;
        arg0[(1 * 5) + 2] = -0.71414f;
        arg0[(2 * 5) + 0] = 1.0f;
        arg0[(2 * 5) + 1] = 1.772f;
        arg0[(2 * 5) + 2] = 0.0f;
    }
}
