package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TransferParameters.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006'"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "", "gamma", "", "a", "b", "c", "d", "e", "f", "(DDDDDDD)V", "getA", "()D", "getB", "getC", "getD", "getE", "getF", "getGamma", "isHLGish", "", "isHLGish$ui_graphics_release", "()Z", "isPQish", "isPQish$ui_graphics_release", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TransferParameters {
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;
    private final double f;
    private final double gamma;

    public static /* synthetic */ TransferParameters copy$default(TransferParameters r14, double r15, double r17, double r19, double r21, double r23, double r25, double r27, int r29, Object r30) {
        if ((r29 & 1) == 0) goto L5;
        double r0 = r14.gamma;
    L7:
        if ((r29 & 2) == 0) goto L9;
        double r2 = r14.a;
    L11:
        if ((r29 & 4) == 0) goto L13;
        double r4 = r14.b;
    L15:
        if ((r29 & 8) == 0) goto L17;
        double r6 = r14.c;
    L19:
        if ((r29 & 16) == 0) goto L21;
        double r8 = r14.d;
    L23:
        if ((r29 & 32) == 0) goto L25;
        double r10 = r14.e;
    L27:
        if ((r29 & 64) == 0) goto L29;
        double r28 = r14.f;
    L31:
        return r14.copy(r0, r2, r4, r6, r8, r10, r28);
    L29:
        r28 = r27;
        goto L31
    L25:
        r10 = r25;
        goto L27
    L21:
        r8 = r23;
        goto L23
    L17:
        r6 = r21;
        goto L19
    L13:
        r4 = r19;
        goto L15
    L9:
        r2 = r17;
        goto L11
    L5:
        r0 = r15;
        goto L7
    }

    public final double component1() {
        return this.gamma;
    }

    public final double component2() {
        return this.a;
    }

    public final double component3() {
        return this.b;
    }

    public final double component4() {
        return this.c;
    }

    public final double component5() {
        return this.d;
    }

    public final double component6() {
        return this.e;
    }

    public final double component7() {
        return this.f;
    }

    public final TransferParameters copy(double r16, double r18, double r20, double r22, double r24, double r26, double r28) {
        return new TransferParameters(r16, r18, r20, r22, r24, r26, r28);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof TransferParameters) == true) goto L8;
        return false;
    L8:
        TransferParameters r1 = (TransferParameters) r8;
        if (Double.compare(this.gamma, r1.gamma) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.a, r1.a) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.b, r1.b) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.c, r1.c) == 0) goto L21;
        return false;
    L21:
        if (Double.compare(this.d, r1.d) == 0) goto L24;
        return false;
    L24:
        if (Double.compare(this.e, r1.e) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f, r1.f) == 0) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.gamma) * 31) + Double.hashCode(this.a)) * 31) + Double.hashCode(this.b)) * 31) + Double.hashCode(this.c)) * 31) + Double.hashCode(this.d)) * 31) + Double.hashCode(this.e)) * 31) + Double.hashCode(this.f);
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.gamma + ", a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ", e=" + this.e + ", f=" + this.f + ')';
    }

    public TransferParameters(double gamma, double a, double b, double c, double d, double e, double f) {
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        if (Double.isNaN(this.a) == true) goto L83;
        if (Double.isNaN(this.b) == true) goto L83;
        if (Double.isNaN(this.c) == true) goto L83;
        if (Double.isNaN(this.d) == true) goto L83;
        if (Double.isNaN(this.e) == true) goto L83;
        if (Double.isNaN(this.f) == true) goto L83;
        if (Double.isNaN(this.gamma) == true) goto L83;
        if (TransferParametersKt.access$isSpecialG(this.gamma) == false) goto L19;
        return;
    L19:
        if (this.d < 0.0d) goto L79;
        if (this.d > 1.0d) goto L79;
        if (this.d != 0.0d) goto L25;
        boolean r1 = true;
    L26:
        if (r1 == false) goto L41;
        if (this.a != 0.0d) goto L30;
        boolean r2 = true;
    L31:
        if (r2 == true) goto L39;
        if (this.gamma != 0.0d) goto L35;
        boolean r3 = true;
    L36:
        if (r3 == true) goto L39;
    L35:
        r3 = false;
    L39:
        throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
    L30:
        r2 = false;
    L41:
        if (this.d < 1.0d) goto L51;
        if (this.c != 0.0d) goto L45;
        boolean r4 = true;
    L46:
        if (r4 == false) goto L51;
        throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
    L45:
        r4 = false;
    L51:
        if (this.a != 0.0d) goto L53;
        boolean r5 = true;
    L54:
        if (r5 == true) goto L61;
        if (this.gamma != 0.0d) goto L58;
        boolean r6 = true;
    L59:
        if (r6 == true) goto L61;
    L66:
        if (this.c < 0.0d) goto L75;
        if (this.a < 0.0d) goto L73;
        if (this.gamma < 0.0d) goto L73;
        return;
    L73:
        throw new IllegalArgumentException("The transfer function must be positive or increasing");
    L75:
        throw new IllegalArgumentException("The transfer function must be increasing");
    L58:
        r6 = false;
    L61:
        if (this.c != 0.0d) goto L63;
        boolean r7 = true;
    L64:
        if (r7 == false) goto L66;
        throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
    L63:
        r7 = false;
        goto L64
    L53:
        r5 = false;
        goto L54
    L25:
        r1 = false;
    L79:
        throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + this.d);
    L83:
        throw new IllegalArgumentException("Parameters cannot be NaN");
    }

    public /* synthetic */ TransferParameters(double r19, double r21, double r23, double r25, double r27, double r29, double r31, int r33, DefaultConstructorMarker r34) {
        if ((r33 & 32) == 0) goto L5;
        double r14 = 0.0d;
    L7:
        if ((r33 & 64) == 0) goto L9;
        double r16 = 0.0d;
    L10:
        this(r19, r21, r23, r25, r27, r14, r16);
        return;
    L9:
        r16 = r31;
        goto L10
    L5:
        r14 = r29;
        goto L7
    }

    public final double getGamma() {
        return this.gamma;
    }

    public final double getA() {
        return this.a;
    }

    public final double getB() {
        return this.b;
    }

    public final double getC() {
        return this.c;
    }

    public final double getD() {
        return this.d;
    }

    public final double getE() {
        return this.e;
    }

    public final double getF() {
        return this.f;
    }

    public final boolean isHLGish$ui_graphics_release() {
        if (this.gamma != (-3.0d)) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean isPQish$ui_graphics_release() {
        if (this.gamma != (-2.0d)) goto L5;
        return true;
    L5:
        return false;
    }
}
