package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Matrix.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 U2\u00020\u0001:\u0001UB\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0086\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u001b\u001a\u00020 2\u0006\u0010!\u001a\u00020 ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0015\u0010\u001b\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020$¢\u0006\u0004\b\u001e\u0010%J\r\u0010&\u001a\u00020\u0018¢\u0006\u0004\b'\u0010\u001aJ{\u0010(\u001a\u00020\u00182\b\b\u0002\u0010)\u001a\u00020\u000e2\b\b\u0002\u0010*\u001a\u00020\u000e2\b\b\u0002\u0010+\u001a\u00020\u000e2\b\b\u0002\u0010,\u001a\u00020\u000e2\b\b\u0002\u0010-\u001a\u00020\u000e2\b\b\u0002\u0010.\u001a\u00020\u000e2\b\b\u0002\u0010/\u001a\u00020\u000e2\b\b\u0002\u00100\u001a\u00020\u000e2\b\b\u0002\u00101\u001a\u00020\u000e2\b\b\u0002\u00102\u001a\u00020\u000e2\b\b\u0002\u00103\u001a\u00020\u000e¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u000e¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u000e¢\u0006\u0004\b;\u00109J\u0015\u0010<\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u000e¢\u0006\u0004\b=\u00109J+\u0010>\u001a\u00020\u00182\b\b\u0002\u0010?\u001a\u00020\u000e2\b\b\u0002\u0010@\u001a\u00020\u000e2\b\b\u0002\u0010A\u001a\u00020\u000e¢\u0006\u0004\bB\u0010CJ(\u0010D\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010E\u001a\u00020\u000eH\u0086\n¢\u0006\u0004\bF\u0010GJ\u0018\u0010H\u001a\u00020\u00182\u0006\u0010I\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ\u001b\u0010L\u001a\u00020\u00182\u0006\u0010M\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bN\u0010KJ\u000f\u0010O\u001a\u00020PH\u0016¢\u0006\u0004\bQ\u0010RJ+\u0010S\u001a\u00020\u00182\b\b\u0002\u0010?\u001a\u00020\u000e2\b\b\u0002\u0010@\u001a\u00020\u000e2\b\b\u0002\u0010A\u001a\u00020\u000e¢\u0006\u0004\bT\u0010CR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006V"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "values", "", "constructor-impl", "([F)[F", "getValues", "()[F", "equals", "", "other", "equals-impl", "([FLjava/lang/Object;)Z", "get", "", "row", "", "column", "get-impl", "([FII)F", "hashCode", "hashCode-impl", "([F)I", "invert", "", "invert-impl", "([F)V", "map", "rect", "Landroidx/compose/ui/geometry/MutableRect;", "map-impl", "([FLandroidx/compose/ui/geometry/MutableRect;)V", "Landroidx/compose/ui/geometry/Offset;", "point", "map-MK-Hz9U", "([FJ)J", "Landroidx/compose/ui/geometry/Rect;", "([FLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "reset", "reset-impl", "resetToPivotedTransform", "pivotX", "pivotY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "scaleZ", "resetToPivotedTransform-impl", "([FFFFFFFFFFFF)V", "rotateX", "degrees", "rotateX-impl", "([FF)V", "rotateY", "rotateY-impl", "rotateZ", "rotateZ-impl", "scale", "x", "y", "z", "scale-impl", "([FFFF)V", "set", "v", "set-impl", "([FIIF)V", "setFrom", "matrix", "setFrom-58bKbWc", "([F[F)V", "timesAssign", "m", "timesAssign-58bKbWc", "toString", "", "toString-impl", "([F)Ljava/lang/String;", "translate", "translate-impl", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class Matrix {
    public static final Companion Companion = null;
    public static final int Perspective0 = 3;
    public static final int Perspective1 = 7;
    public static final int Perspective2 = 15;
    public static final int ScaleX = 0;
    public static final int ScaleY = 5;
    public static final int ScaleZ = 10;
    public static final int SkewX = 4;
    public static final int SkewY = 1;
    public static final int TranslateX = 12;
    public static final int TranslateY = 13;
    public static final int TranslateZ = 14;
    private final float[] values;

    /* JADX INFO: compiled from: Matrix.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/graphics/Matrix$Companion;", "", "()V", "Perspective0", "", "Perspective1", "Perspective2", "ScaleX", "ScaleY", "ScaleZ", "SkewX", "SkewY", "TranslateX", "TranslateY", "TranslateZ", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Matrix m4594boximpl(float[] r1) {
        return new Matrix(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static float[] m4595constructorimpl(float[] r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4597equalsimpl(float[] r2, Object r3) {
        if ((r3 instanceof Matrix) == true) goto L6;
        return false;
    L6:
        if (Intrinsics.areEqual(r2, ((Matrix) r3).m4619unboximpl()) == true) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4598equalsimpl0(float[] r1, float[] r2) {
        return Intrinsics.areEqual(r1, r2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4600hashCodeimpl(float[] r1) {
        return Arrays.hashCode(r1);
    }

    public boolean equals(Object r2) {
        return m4597equalsimpl(this.values, r2);
    }

    public int hashCode() {
        return m4600hashCodeimpl(this.values);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m4619unboximpl() {
        return this.values;
    }

    private /* synthetic */ Matrix(float[] values) {
        this.values = values;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m4596constructorimpl$default(float[] r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    L6:
        return m4595constructorimpl(r1);
    }

    public final float[] getValues() {
        return this.values;
    }

    /* JADX INFO: renamed from: get-impl, reason: not valid java name */
    public static final float m4599getimpl(float[] arg0, int row, int column) {
        return arg0[(row * 4) + column];
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m4613setimpl(float[] arg0, int row, int column, float v) {
        arg0[(row * 4) + column] = v;
    }

    /* JADX INFO: renamed from: map-MK-Hz9U, reason: not valid java name */
    public static final long m4602mapMKHz9U(float[] arg0, long point) {
        if (arg0.length >= 16) goto L5;
        return point;
    L5:
        float v00 = arg0[(0 * 4) + 0];
        float v01 = arg0[(0 * 4) + 1];
        float v03 = arg0[(0 * 4) + 3];
        float v10 = arg0[(1 * 4) + 0];
        float v11 = arg0[(1 * 4) + 1];
        float v13 = arg0[(1 * 4) + 3];
        float v30 = arg0[(3 * 4) + 0];
        float v31 = arg0[(3 * 4) + 1];
        float v33 = arg0[(3 * 4) + 3];
        int bits$iv$iv$iv = (int) (point >> 32);
        float x = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (point & 4294967295L);
        float y = Float.intBitsToFloat(bits$iv$iv$iv2);
        float z = ((v03 * x) + (v13 * y)) + v33;
        float inverseZ = 1.0f / z;
        if ((Float.floatToRawIntBits(inverseZ) & Integer.MAX_VALUE) >= 2139095040) goto L8;
        boolean r0 = true;
    L9:
        if (r0 == false) goto L11;
        float pZ = inverseZ;
    L12:
        float x$iv = (((v00 * x) + (v10 * y)) + v30) * pZ;
        float y$iv = (((v01 * x) + (v11 * y)) + v31) * pZ;
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
    L11:
        pZ = 0.0f;
        goto L12
    L8:
        r0 = false;
        goto L9
    }

    /* JADX INFO: renamed from: map-impl, reason: not valid java name */
    public static final Rect m4603mapimpl(float[] arg0, Rect rect) {
        if (arg0.length >= 16) goto L5;
        return rect;
    L5:
        float v00 = arg0[(0 * 4) + 0];
        float v01 = arg0[(0 * 4) + 1];
        float v03 = arg0[(0 * 4) + 3];
        float v10 = arg0[(1 * 4) + 0];
        float v11 = arg0[(1 * 4) + 1];
        float v13 = arg0[(1 * 4) + 3];
        float v30 = arg0[(3 * 4) + 0];
        float v31 = arg0[(3 * 4) + 1];
        float v33 = arg0[(3 * 4) + 3];
        float l = rect.getLeft();
        float t = rect.getTop();
        float r = rect.getRight();
        float b = rect.getBottom();
        float inverseZ = 1.0f / (((v03 * l) + (v13 * t)) + v33);
        boolean r20 = true;
        if ((Float.floatToRawIntBits(inverseZ) & Integer.MAX_VALUE) >= 2139095040) goto L8;
        boolean r0 = true;
    L9:
        float pZ = 0.0f;
        if (r0 == false) goto L12;
        float pZ2 = inverseZ;
    L13:
        float x0 = pZ2 * (((v00 * l) + (v10 * t)) + v30);
        float pZ3 = pZ2 * (((v01 * l) + (v11 * t)) + v31);
        float inverseZ2 = 1.0f / (((v03 * l) + (v13 * b)) + v33);
        if ((Float.floatToRawIntBits(inverseZ2) & Integer.MAX_VALUE) >= 2139095040) goto L16;
        boolean r2 = true;
    L17:
        if (r2 == false) goto L19;
        float pZ4 = inverseZ2;
    L20:
        float x1 = (((v00 * l) + (v10 * b)) + v30) * pZ4;
        float pZ5 = pZ4 * (((v01 * l) + (v11 * b)) + v31);
        float inverseZ3 = 1.0f / (((v03 * r) + (v13 * t)) + v33);
        if ((Float.floatToRawIntBits(inverseZ3) & Integer.MAX_VALUE) >= 2139095040) goto L23;
        boolean r4 = true;
    L24:
        if (r4 == false) goto L26;
        float pZ6 = inverseZ3;
    L27:
        float x2 = (((v00 * r) + (v10 * t)) + v30) * pZ6;
        float pZ7 = pZ6 * (((v01 * r) + (v11 * t)) + v31);
        float inverseZ4 = 1.0f / (((v03 * r) + (v13 * b)) + v33);
        if ((Float.floatToRawIntBits(inverseZ4) & Integer.MAX_VALUE) < 2139095040) goto L31;
        r20 = false;
    L31:
        if (r20 == false) goto L33;
        pZ = inverseZ4;
    L33:
        float x3 = (((v00 * r) + (v10 * b)) + v30) * pZ;
        float y3 = (((v01 * r) + (v11 * b)) + v31) * pZ;
        return new Rect(Math.min(x0, Math.min(x1, Math.min(x2, x3))), Math.min(pZ3, Math.min(pZ5, Math.min(pZ7, y3))), Math.max(x0, Math.max(x1, Math.max(x2, x3))), Math.max(pZ3, Math.max(pZ5, Math.max(pZ7, y3))));
    L26:
        pZ6 = 0.0f;
        goto L27
    L23:
        r4 = false;
        goto L24
    L19:
        pZ4 = 0.0f;
        goto L20
    L16:
        r2 = false;
        goto L17
    L12:
        pZ2 = 0.0f;
        goto L13
    L8:
        r0 = false;
        goto L9
    }

    /* JADX INFO: renamed from: map-impl, reason: not valid java name */
    public static final void m4604mapimpl(float[] arg0, MutableRect rect) {
        if (arg0.length >= 16) goto L5;
        return;
    L5:
        float v00 = arg0[(0 * 4) + 0];
        float v01 = arg0[(0 * 4) + 1];
        float v03 = arg0[(0 * 4) + 3];
        float v10 = arg0[(1 * 4) + 0];
        float v11 = arg0[(1 * 4) + 1];
        float v13 = arg0[(1 * 4) + 3];
        float v30 = arg0[(3 * 4) + 0];
        float v31 = arg0[(3 * 4) + 1];
        float v33 = arg0[(3 * 4) + 3];
        float l = rect.getLeft();
        float t = rect.getTop();
        float r = rect.getRight();
        float b = rect.getBottom();
        float inverseZ = 1.0f / (((v03 * l) + (v13 * t)) + v33);
        boolean r21 = true;
        if ((Float.floatToRawIntBits(inverseZ) & Integer.MAX_VALUE) >= 2139095040) goto L8;
        boolean r0 = true;
    L9:
        float pZ = 0.0f;
        if (r0 == false) goto L12;
        float pZ2 = inverseZ;
    L13:
        float x0 = pZ2 * (((v00 * l) + (v10 * t)) + v30);
        float pZ3 = pZ2 * (((v01 * l) + (v11 * t)) + v31);
        float inverseZ2 = 1.0f / (((v03 * l) + (v13 * b)) + v33);
        if ((Float.floatToRawIntBits(inverseZ2) & Integer.MAX_VALUE) >= 2139095040) goto L16;
        boolean r3 = true;
    L17:
        if (r3 == false) goto L19;
        float pZ4 = inverseZ2;
    L20:
        float x1 = (((v00 * l) + (v10 * b)) + v30) * pZ4;
        float pZ5 = pZ4 * (((v01 * l) + (v11 * b)) + v31);
        float inverseZ3 = 1.0f / (((v03 * r) + (v13 * t)) + v33);
        if ((Float.floatToRawIntBits(inverseZ3) & Integer.MAX_VALUE) >= 2139095040) goto L23;
        boolean r5 = true;
    L24:
        if (r5 == false) goto L26;
        float pZ6 = inverseZ3;
    L27:
        float x2 = (((v00 * r) + (v10 * t)) + v30) * pZ6;
        float pZ7 = pZ6 * (((v01 * r) + (v11 * t)) + v31);
        float inverseZ4 = 1.0f / (((v03 * r) + (v13 * b)) + v33);
        if ((Float.floatToRawIntBits(inverseZ4) & Integer.MAX_VALUE) < 2139095040) goto L31;
        r21 = false;
    L31:
        if (r21 == false) goto L33;
        pZ = inverseZ4;
    L33:
        float x3 = (((v00 * r) + (v10 * b)) + v30) * pZ;
        float y3 = (((v01 * r) + (v11 * b)) + v31) * pZ;
        rect.setLeft(Math.min(x0, Math.min(x1, Math.min(x2, x3))));
        rect.setTop(Math.min(pZ3, Math.min(pZ5, Math.min(pZ7, y3))));
        rect.setRight(Math.max(x0, Math.max(x1, Math.max(x2, x3))));
        rect.setBottom(Math.max(pZ3, Math.max(pZ5, Math.max(pZ7, y3))));
        return;
    L26:
        pZ6 = 0.0f;
        goto L27
    L23:
        r5 = false;
        goto L24
    L19:
        pZ4 = 0.0f;
        goto L20
    L16:
        r3 = false;
        goto L17
    L12:
        pZ2 = 0.0f;
        goto L13
    L8:
        r0 = false;
        goto L9
    }

    /* JADX INFO: renamed from: timesAssign-58bKbWc, reason: not valid java name */
    public static final void m4615timesAssign58bKbWc(float[] arg0, float[] m) {
        if (arg0.length >= 16) goto L6;
        return;
    L6:
        if (m.length >= 16) goto L8;
        return;
    L8:
        float v00 = (((arg0[(0 * 4) + 0] * m[(0 * 4) + 0]) + (arg0[(0 * 4) + 1] * m[(1 * 4) + 0])) + (arg0[(0 * 4) + 2] * m[(2 * 4) + 0])) + (arg0[(0 * 4) + 3] * m[(3 * 4) + 0]);
        float v01 = (((arg0[(0 * 4) + 0] * m[(0 * 4) + 1]) + (arg0[(0 * 4) + 1] * m[(1 * 4) + 1])) + (arg0[(0 * 4) + 2] * m[(2 * 4) + 1])) + (arg0[(0 * 4) + 3] * m[(3 * 4) + 1]);
        float v02 = (((arg0[(0 * 4) + 0] * m[(0 * 4) + 2]) + (arg0[(0 * 4) + 1] * m[(1 * 4) + 2])) + (arg0[(0 * 4) + 2] * m[(2 * 4) + 2])) + (arg0[(0 * 4) + 3] * m[(3 * 4) + 2]);
        float v03 = (((arg0[(0 * 4) + 0] * m[(0 * 4) + 3]) + (arg0[(0 * 4) + 1] * m[(1 * 4) + 3])) + (arg0[(0 * 4) + 2] * m[(2 * 4) + 3])) + (arg0[(0 * 4) + 3] * m[(3 * 4) + 3]);
        float v10 = (((arg0[(1 * 4) + 0] * m[(0 * 4) + 0]) + (arg0[(1 * 4) + 1] * m[(1 * 4) + 0])) + (arg0[(1 * 4) + 2] * m[(2 * 4) + 0])) + (arg0[(1 * 4) + 3] * m[(3 * 4) + 0]);
        float v11 = (((arg0[(1 * 4) + 0] * m[(0 * 4) + 1]) + (arg0[(1 * 4) + 1] * m[(1 * 4) + 1])) + (arg0[(1 * 4) + 2] * m[(2 * 4) + 1])) + (arg0[(1 * 4) + 3] * m[(3 * 4) + 1]);
        float v12 = (((arg0[(1 * 4) + 0] * m[(0 * 4) + 2]) + (arg0[(1 * 4) + 1] * m[(1 * 4) + 2])) + (arg0[(1 * 4) + 2] * m[(2 * 4) + 2])) + (arg0[(1 * 4) + 3] * m[(3 * 4) + 2]);
        float v13 = (((arg0[(1 * 4) + 0] * m[(0 * 4) + 3]) + (arg0[(1 * 4) + 1] * m[(1 * 4) + 3])) + (arg0[(1 * 4) + 2] * m[(2 * 4) + 3])) + (arg0[(1 * 4) + 3] * m[(3 * 4) + 3]);
        float v20 = (((arg0[(2 * 4) + 0] * m[(0 * 4) + 0]) + (arg0[(2 * 4) + 1] * m[(1 * 4) + 0])) + (arg0[(2 * 4) + 2] * m[(2 * 4) + 0])) + (arg0[(2 * 4) + 3] * m[(3 * 4) + 0]);
        float v21 = (((arg0[(2 * 4) + 0] * m[(0 * 4) + 1]) + (arg0[(2 * 4) + 1] * m[(1 * 4) + 1])) + (arg0[(2 * 4) + 2] * m[(2 * 4) + 1])) + (arg0[(2 * 4) + 3] * m[(3 * 4) + 1]);
        float v22 = (((arg0[(2 * 4) + 0] * m[(0 * 4) + 2]) + (arg0[(2 * 4) + 1] * m[(1 * 4) + 2])) + (arg0[(2 * 4) + 2] * m[(2 * 4) + 2])) + (arg0[(2 * 4) + 3] * m[(3 * 4) + 2]);
        float v23 = (((arg0[(2 * 4) + 0] * m[(0 * 4) + 3]) + (arg0[(2 * 4) + 1] * m[(1 * 4) + 3])) + (arg0[(2 * 4) + 2] * m[(2 * 4) + 3])) + (arg0[(2 * 4) + 3] * m[(3 * 4) + 3]);
        float v30 = (((arg0[(3 * 4) + 0] * m[(0 * 4) + 0]) + (arg0[(3 * 4) + 1] * m[(1 * 4) + 0])) + (arg0[(3 * 4) + 2] * m[(2 * 4) + 0])) + (arg0[(3 * 4) + 3] * m[(3 * 4) + 0]);
        float v31 = (((arg0[(3 * 4) + 0] * m[(0 * 4) + 1]) + (arg0[(3 * 4) + 1] * m[(1 * 4) + 1])) + (arg0[(3 * 4) + 2] * m[(2 * 4) + 1])) + (arg0[(3 * 4) + 3] * m[(3 * 4) + 1]);
        float v32 = (((arg0[(3 * 4) + 0] * m[(0 * 4) + 2]) + (arg0[(3 * 4) + 1] * m[(1 * 4) + 2])) + (arg0[(3 * 4) + 2] * m[(2 * 4) + 2])) + (arg0[(3 * 4) + 3] * m[(3 * 4) + 2]);
        float v33 = (((arg0[(3 * 4) + 0] * m[(0 * 4) + 3]) + (arg0[(3 * 4) + 1] * m[(1 * 4) + 3])) + (arg0[(3 * 4) + 2] * m[(2 * 4) + 3])) + (arg0[(3 * 4) + 3] * m[(3 * 4) + 3]);
        arg0[0] = v00;
        arg0[1] = v01;
        arg0[2] = v02;
        arg0[3] = v03;
        arg0[4] = v10;
        arg0[5] = v11;
        arg0[6] = v12;
        arg0[7] = v13;
        arg0[8] = v20;
        arg0[9] = v21;
        arg0[10] = v22;
        arg0[11] = v23;
        arg0[12] = v30;
        arg0[13] = v31;
        arg0[14] = v32;
        arg0[15] = v33;
    }

    public String toString() {
        return m4616toStringimpl(this.values);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4616toStringimpl(float[] arg0) {
        StringBuilder r0 = new StringBuilder();
        r0.append("\n            |").append(arg0[(0 * 4) + 0]).append(' ').append(arg0[(0 * 4) + 1]).append(' ').append(arg0[(0 * 4) + 2]).append(' ').append(arg0[(0 * 4) + 3]).append("|\n            |").append(arg0[(1 * 4) + 0]).append(' ').append(arg0[(1 * 4) + 1]).append(' ').append(arg0[(1 * 4) + 2]).append(' ').append(arg0[(1 * 4) + 3]).append("|\n            |").append(arg0[(2 * 4) + 0]).append(' ').append(arg0[(2 * 4) + 1]).append(' ').append(arg0[(2 * 4) + 2]).append(' ');
        r0.append(arg0[(2 * 4) + 3]).append("|\n            |").append(arg0[(3 * 4) + 0]).append(' ').append(arg0[(3 * 4) + 1]).append(' ').append(arg0[(3 * 4) + 2]).append(' ').append(arg0[(3 * 4) + 3]).append("|\n        ");
        return StringsKt.trimIndent(r0.toString());
    }

    /* JADX INFO: renamed from: invert-impl, reason: not valid java name */
    public static final void m4601invertimpl(float[] arg0) {
        if (arg0.length >= 16) goto L5;
        return;
    L5:
        float a00 = arg0[(0 * 4) + 0];
        float a01 = arg0[(0 * 4) + 1];
        float a02 = arg0[(0 * 4) + 2];
        float a03 = arg0[(0 * 4) + 3];
        float a10 = arg0[(1 * 4) + 0];
        float a11 = arg0[(1 * 4) + 1];
        float a12 = arg0[(1 * 4) + 2];
        float a13 = arg0[(1 * 4) + 3];
        float a20 = arg0[(2 * 4) + 0];
        float a21 = arg0[(2 * 4) + 1];
        float a22 = arg0[(2 * 4) + 2];
        float a23 = arg0[(2 * 4) + 3];
        float a30 = arg0[(3 * 4) + 0];
        float a31 = arg0[(3 * 4) + 1];
        float a32 = arg0[(3 * 4) + 2];
        float a33 = arg0[(3 * 4) + 3];
        float b00 = (a00 * a11) - (a01 * a10);
        float b01 = (a00 * a12) - (a02 * a10);
        float b02 = (a00 * a13) - (a03 * a10);
        float b03 = (a01 * a12) - (a02 * a11);
        float b04 = (a01 * a13) - (a03 * a11);
        float b05 = (a02 * a13) - (a03 * a12);
        float b06 = (a20 * a31) - (a21 * a30);
        float b07 = (a20 * a32) - (a22 * a30);
        float b08 = (a20 * a33) - (a23 * a30);
        float b09 = (a21 * a32) - (a22 * a31);
        float b10 = (a21 * a33) - (a23 * a31);
        float b11 = (a22 * a33) - (a23 * a32);
        float det = (((((b00 * b11) - (b01 * b10)) + (b02 * b09)) + (b03 * b08)) - (b04 * b07)) + (b05 * b06);
        if (det != 0.0f) goto L8;
        boolean r30 = true;
    L9:
        if (r30 == false) goto L11;
        return;
    L11:
        float invDet = 1.0f / det;
        float v$iv = (((a11 * b11) - (a12 * b10)) + (a13 * b09)) * invDet;
        arg0[(0 * 4) + 0] = v$iv;
        float v$iv2 = ((((-a01) * b11) + (a02 * b10)) - (a03 * b09)) * invDet;
        arg0[(0 * 4) + 1] = v$iv2;
        float v$iv3 = (((a31 * b05) - (a32 * b04)) + (a33 * b03)) * invDet;
        arg0[(0 * 4) + 2] = v$iv3;
        float v$iv4 = ((((-a21) * b05) + (a22 * b04)) - (a23 * b03)) * invDet;
        arg0[(0 * 4) + 3] = v$iv4;
        float v$iv5 = ((((-a10) * b11) + (a12 * b08)) - (a13 * b07)) * invDet;
        arg0[(1 * 4) + 0] = v$iv5;
        float v$iv6 = (((a00 * b11) - (a02 * b08)) + (a03 * b07)) * invDet;
        arg0[(1 * 4) + 1] = v$iv6;
        float v$iv7 = ((((-a30) * b05) + (a32 * b02)) - (a33 * b01)) * invDet;
        arg0[(1 * 4) + 2] = v$iv7;
        float v$iv8 = (((a20 * b05) - (a22 * b02)) + (a23 * b01)) * invDet;
        arg0[(1 * 4) + 3] = v$iv8;
        float v$iv9 = (((a10 * b10) - (a11 * b08)) + (a13 * b06)) * invDet;
        arg0[(2 * 4) + 0] = v$iv9;
        float v$iv10 = ((((-a00) * b10) + (a01 * b08)) - (a03 * b06)) * invDet;
        arg0[(2 * 4) + 1] = v$iv10;
        float v$iv11 = (((a30 * b04) - (a31 * b02)) + (a33 * b00)) * invDet;
        arg0[(2 * 4) + 2] = v$iv11;
        float v$iv12 = ((((-a20) * b04) + (a21 * b02)) - (a23 * b00)) * invDet;
        arg0[(2 * 4) + 3] = v$iv12;
        float v$iv13 = ((((-a10) * b09) + (a11 * b07)) - (a12 * b06)) * invDet;
        arg0[(3 * 4) + 0] = v$iv13;
        float v$iv14 = (((a00 * b09) - (a01 * b07)) + (a02 * b06)) * invDet;
        arg0[(3 * 4) + 1] = v$iv14;
        float v$iv15 = ((((-a30) * b03) + (a31 * b01)) - (a32 * b00)) * invDet;
        arg0[(3 * 4) + 2] = v$iv15;
        float v$iv16 = (((a20 * b03) - (a21 * b01)) + (a22 * b00)) * invDet;
        arg0[(3 * 4) + 3] = v$iv16;
        return;
    L8:
        r30 = false;
        goto L9
    }

    /* JADX INFO: renamed from: reset-impl, reason: not valid java name */
    public static final void m4605resetimpl(float[] arg0) {
        if (arg0.length >= 16) goto L5;
        return;
    L5:
        arg0[0] = 1.0f;
        arg0[1] = 0.0f;
        arg0[2] = 0.0f;
        arg0[3] = 0.0f;
        arg0[4] = 0.0f;
        arg0[5] = 1.0f;
        arg0[6] = 0.0f;
        arg0[7] = 0.0f;
        arg0[8] = 0.0f;
        arg0[9] = 0.0f;
        arg0[10] = 1.0f;
        arg0[11] = 0.0f;
        arg0[12] = 0.0f;
        arg0[13] = 0.0f;
        arg0[14] = 0.0f;
        arg0[15] = 1.0f;
    }

    /* JADX INFO: renamed from: setFrom-58bKbWc, reason: not valid java name */
    public static final void m4614setFrom58bKbWc(float[] arg0, float[] matrix) {
        if (arg0.length >= 16) goto L6;
        return;
    L6:
        if (matrix.length >= 16) goto L8;
        return;
    L8:
        arg0[0] = matrix[0];
        arg0[1] = matrix[1];
        arg0[2] = matrix[2];
        arg0[3] = matrix[3];
        arg0[4] = matrix[4];
        arg0[5] = matrix[5];
        arg0[6] = matrix[6];
        arg0[7] = matrix[7];
        arg0[8] = matrix[8];
        arg0[9] = matrix[9];
        arg0[10] = matrix[10];
        arg0[11] = matrix[11];
        arg0[12] = matrix[12];
        arg0[13] = matrix[13];
        arg0[14] = matrix[14];
        arg0[15] = matrix[15];
    }

    /* JADX INFO: renamed from: rotateX-impl, reason: not valid java name */
    public static final void m4608rotateXimpl(float[] arg0, float degrees) {
        if (arg0.length >= 16) goto L5;
        return;
    L5:
        double r = ((double) degrees) * 0.017453292519943295d;
        float s = (float) Math.sin(r);
        float c = (float) Math.cos(r);
        float a01 = arg0[(0 * 4) + 1];
        float a02 = arg0[(0 * 4) + 2];
        float v01 = (a01 * c) - (a02 * s);
        float v02 = (a01 * s) + (a02 * c);
        float a11 = arg0[(1 * 4) + 1];
        float a12 = arg0[(1 * 4) + 2];
        float v11 = (a11 * c) - (a12 * s);
        float v12 = (a11 * s) + (a12 * c);
        float a21 = arg0[(2 * 4) + 1];
        float a22 = arg0[(2 * 4) + 2];
        float v21 = (a21 * c) - (a22 * s);
        float v22 = (a21 * s) + (a22 * c);
        float a31 = arg0[(3 * 4) + 1];
        float a32 = arg0[(3 * 4) + 2];
        float v31 = (a31 * c) - (a32 * s);
        float v32 = (a31 * s) + (a32 * c);
        arg0[(0 * 4) + 1] = v01;
        arg0[(0 * 4) + 2] = v02;
        arg0[(1 * 4) + 1] = v11;
        arg0[(1 * 4) + 2] = v12;
        arg0[(2 * 4) + 1] = v21;
        arg0[(2 * 4) + 2] = v22;
        arg0[(3 * 4) + 1] = v31;
        arg0[(3 * 4) + 2] = v32;
    }

    /* JADX INFO: renamed from: rotateY-impl, reason: not valid java name */
    public static final void m4609rotateYimpl(float[] arg0, float degrees) {
        if (arg0.length >= 16) goto L5;
        return;
    L5:
        double r = ((double) degrees) * 0.017453292519943295d;
        float s = (float) Math.sin(r);
        float c = (float) Math.cos(r);
        float a00 = arg0[(0 * 4) + 0];
        float a02 = arg0[(0 * 4) + 2];
        float v00 = (a00 * c) + (a02 * s);
        float v02 = ((-a00) * s) + (a02 * c);
        float a10 = arg0[(1 * 4) + 0];
        float a12 = arg0[(1 * 4) + 2];
        float v10 = (a10 * c) + (a12 * s);
        float v12 = ((-a10) * s) + (a12 * c);
        float a20 = arg0[(2 * 4) + 0];
        float a22 = arg0[(2 * 4) + 2];
        float v20 = (a20 * c) + (a22 * s);
        float v22 = ((-a20) * s) + (a22 * c);
        float r17 = arg0[(3 * 4) + 0];
        float a32 = arg0[(3 * 4) + 2];
        float v30 = (r17 * c) + (a32 * s);
        float v32 = ((-r17) * s) + (a32 * c);
        arg0[(0 * 4) + 0] = v00;
        arg0[(0 * 4) + 2] = v02;
        arg0[(1 * 4) + 0] = v10;
        arg0[(1 * 4) + 2] = v12;
        arg0[(2 * 4) + 0] = v20;
        arg0[(2 * 4) + 2] = v22;
        arg0[(3 * 4) + 0] = v30;
        arg0[(3 * 4) + 2] = v32;
    }

    /* JADX INFO: renamed from: rotateZ-impl, reason: not valid java name */
    public static final void m4610rotateZimpl(float[] arg0, float degrees) {
        if (arg0.length >= 16) goto L5;
        return;
    L5:
        double r = ((double) degrees) * 0.017453292519943295d;
        float s = (float) Math.sin(r);
        float c = (float) Math.cos(r);
        float a00 = arg0[(0 * 4) + 0];
        float a10 = arg0[(1 * 4) + 0];
        float v00 = (c * a00) + (s * a10);
        float v10 = ((-s) * a00) + (c * a10);
        float a01 = arg0[(0 * 4) + 1];
        float a11 = arg0[(1 * 4) + 1];
        float v01 = (c * a01) + (s * a11);
        float v11 = ((-s) * a01) + (c * a11);
        float a02 = arg0[(0 * 4) + 2];
        float a12 = arg0[(1 * 4) + 2];
        float v02 = (c * a02) + (s * a12);
        float v12 = ((-s) * a02) + (c * a12);
        float a03 = arg0[(0 * 4) + 3];
        float a13 = arg0[(1 * 4) + 3];
        float v03 = (c * a03) + (s * a13);
        float v13 = -s;
        float v14 = (v13 * a03) + (c * a13);
        arg0[(0 * 4) + 0] = v00;
        arg0[(0 * 4) + 1] = v01;
        arg0[(0 * 4) + 2] = v02;
        arg0[(0 * 4) + 3] = v03;
        arg0[(1 * 4) + 0] = v10;
        arg0[(1 * 4) + 1] = v11;
        arg0[(1 * 4) + 2] = v12;
        arg0[(1 * 4) + 3] = v14;
    }

    /* JADX INFO: renamed from: scale-impl$default, reason: not valid java name */
    public static /* synthetic */ void m4612scaleimpl$default(float[] r1, float r2, float r3, float r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 1.0f;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = 1.0f;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = 1.0f;
    L11:
        m4611scaleimpl(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: scale-impl, reason: not valid java name */
    public static final void m4611scaleimpl(float[] arg0, float x, float y, float z) {
        if (arg0.length >= 16) goto L5;
        return;
    L5:
        float v$iv = arg0[(0 * 4) + 0] * x;
        arg0[(0 * 4) + 0] = v$iv;
        float v$iv2 = arg0[(0 * 4) + 1] * x;
        arg0[(0 * 4) + 1] = v$iv2;
        float v$iv3 = arg0[(0 * 4) + 2] * x;
        arg0[(0 * 4) + 2] = v$iv3;
        float v$iv4 = arg0[(0 * 4) + 3] * x;
        arg0[(0 * 4) + 3] = v$iv4;
        float v$iv5 = arg0[(1 * 4) + 0] * y;
        arg0[(1 * 4) + 0] = v$iv5;
        float v$iv6 = arg0[(1 * 4) + 1] * y;
        arg0[(1 * 4) + 1] = v$iv6;
        float v$iv7 = arg0[(1 * 4) + 2] * y;
        arg0[(1 * 4) + 2] = v$iv7;
        float v$iv8 = arg0[(1 * 4) + 3] * y;
        arg0[(1 * 4) + 3] = v$iv8;
        float v$iv9 = arg0[(2 * 4) + 0] * z;
        arg0[(2 * 4) + 0] = v$iv9;
        float v$iv10 = arg0[(2 * 4) + 1] * z;
        arg0[(2 * 4) + 1] = v$iv10;
        float v$iv11 = arg0[(2 * 4) + 2] * z;
        arg0[(2 * 4) + 2] = v$iv11;
        float v$iv12 = arg0[(2 * 4) + 3] * z;
        arg0[(2 * 4) + 3] = v$iv12;
    }

    /* JADX INFO: renamed from: translate-impl$default, reason: not valid java name */
    public static /* synthetic */ void m4618translateimpl$default(float[] r1, float r2, float r3, float r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0.0f;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = 0.0f;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = 0.0f;
    L11:
        m4617translateimpl(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: translate-impl, reason: not valid java name */
    public static final void m4617translateimpl(float[] arg0, float x, float y, float z) {
        if (arg0.length >= 16) goto L5;
        return;
    L5:
        float t1 = (((arg0[(0 * 4) + 0] * x) + (arg0[(1 * 4) + 0] * y)) + (arg0[(2 * 4) + 0] * z)) + arg0[(3 * 4) + 0];
        float t2 = (((arg0[(0 * 4) + 1] * x) + (arg0[(1 * 4) + 1] * y)) + (arg0[(2 * 4) + 1] * z)) + arg0[(3 * 4) + 1];
        float t3 = (((arg0[(0 * 4) + 2] * x) + (arg0[(1 * 4) + 2] * y)) + (arg0[(2 * 4) + 2] * z)) + arg0[(3 * 4) + 2];
        float t4 = (((arg0[(0 * 4) + 3] * x) + (arg0[(1 * 4) + 3] * y)) + (arg0[(2 * 4) + 3] * z)) + arg0[(3 * 4) + 3];
        arg0[(3 * 4) + 0] = t1;
        arg0[(3 * 4) + 1] = t2;
        arg0[(3 * 4) + 2] = t3;
        arg0[(3 * 4) + 3] = t4;
    }

    /* JADX INFO: renamed from: resetToPivotedTransform-impl$default, reason: not valid java name */
    public static /* synthetic */ void m4607resetToPivotedTransformimpl$default(float[] r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8, float r9, float r10, float r11, float r12, int r13, Object r14) {
        if ((r13 & 1) == 0) goto L6;
        r2 = 0.0f;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r3 = 0.0f;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r4 = 0.0f;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r5 = 0.0f;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r6 = 0.0f;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r7 = 0.0f;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r8 = 0.0f;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r9 = 0.0f;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r10 = 1.0f;
    L30:
        if ((r13 & 512) == 0) goto L33;
        r11 = 1.0f;
    L33:
        if ((r13 & 1024) == 0) goto L35;
        r12 = 1.0f;
    L35:
        m4606resetToPivotedTransformimpl(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    }

    /* JADX INFO: renamed from: resetToPivotedTransform-impl, reason: not valid java name */
    public static final void m4606resetToPivotedTransformimpl(float[] arg0, float pivotX, float pivotY, float translationX, float translationY, float translationZ, float rotationX, float rotationY, float rotationZ, float scaleX, float scaleY, float scaleZ) {
        double rx = ((double) rotationX) * 0.017453292519943295d;
        float rsx = (float) Math.sin(rx);
        float rcx = (float) Math.cos(rx);
        float v21 = -rsx;
        float v31 = (translationY * rcx) - (translationZ * rsx);
        float v32 = (translationY * rsx) + (translationZ * rcx);
        double ry = ((double) rotationY) * 0.017453292519943295d;
        float rsy = (float) Math.sin(ry);
        float rcy = (float) Math.cos(ry);
        float v02 = -rsy;
        float v10 = rsx * rsy;
        float v12 = rsx * rcy;
        float v20 = rcx * rsy;
        float v22 = rcx * rcy;
        float v30 = (translationX * rcy) + (v32 * rsy);
        float v33 = ((-translationX) * rsy) + (v32 * rcy);
        double rz = ((double) rotationZ) * 0.017453292519943295d;
        float rsz = (float) Math.sin(rz);
        float rcz = (float) Math.cos(rz);
        float v11 = ((-rsz) * rcy) + (rcz * v10);
        float v00 = (rcz * rcy) + (rsz * v10);
        float v01 = rsz * rcx;
        float v13 = rcx * rcz;
        float v14 = ((-rsz) * v02) + (rcz * v12);
        float v03 = v00 * scaleX;
        float v04 = v01 * scaleX;
        float v05 = ((rcz * v02) + (rsz * v12)) * scaleX;
        float v15 = v11 * scaleY;
        float v16 = v13 * scaleY;
        float v17 = v14 * scaleY;
        float v23 = v20 * scaleZ;
        float v24 = v21 * scaleZ;
        float v25 = v22 * scaleZ;
        if (arg0.length >= 16) goto L5;
        return;
    L5:
        arg0[(0 * 4) + 0] = v03;
        arg0[(0 * 4) + 1] = v04;
        arg0[(0 * 4) + 2] = v05;
        arg0[(0 * 4) + 3] = 0.0f;
        arg0[(1 * 4) + 0] = v15;
        arg0[(1 * 4) + 1] = v16;
        arg0[(1 * 4) + 2] = v17;
        arg0[(1 * 4) + 3] = 0.0f;
        arg0[(2 * 4) + 0] = v23;
        arg0[(2 * 4) + 1] = v24;
        arg0[(2 * 4) + 2] = v25;
        arg0[(2 * 4) + 3] = 0.0f;
        float v$iv = ((((-pivotX) * v03) - (pivotY * v15)) + v30) + pivotX;
        arg0[(3 * 4) + 0] = v$iv;
        float v$iv2 = ((((-pivotX) * v04) - (pivotY * v16)) + v31) + pivotY;
        arg0[(3 * 4) + 1] = v$iv2;
        float v$iv3 = (((-pivotX) * v05) - (pivotY * v17)) + v33;
        arg0[(3 * 4) + 2] = v$iv3;
        arg0[(3 * 4) + 3] = 1.0f;
    }
}
