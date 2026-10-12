package androidx.compose.ui.graphics;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ColorFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001d\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0015\u0010\u0014\u001a\u00020\u0003H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/graphics/ColorMatrixColorFilter;", "Landroidx/compose/ui/graphics/ColorFilter;", "colorMatrix", "Landroidx/compose/ui/graphics/ColorMatrix;", "([FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "nativeColorFilter", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "([FLandroid/graphics/ColorFilter;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "[F", "copyColorMatrix", "targetColorMatrix", "copyColorMatrix-gBh15pI", "([F)[F", "equals", "", "other", "", "hashCode", "", "obtainColorMatrix", "obtainColorMatrix-p10-uLo", "()[F", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ColorMatrixColorFilter extends ColorFilter {
    private float[] colorMatrix;

    public /* synthetic */ ColorMatrixColorFilter(float[] r1, android.graphics.ColorFilter r2, DefaultConstructorMarker r3) {
        this(r1, r2);
    }

    public /* synthetic */ ColorMatrixColorFilter(float[] r1, DefaultConstructorMarker r2) {
        this(r1);
    }

    private ColorMatrixColorFilter(float[] colorMatrix, android.graphics.ColorFilter nativeColorFilter) {
        super(nativeColorFilter);
        this.colorMatrix = colorMatrix;
    }

    private ColorMatrixColorFilter(float[] colorMatrix) {
        this(colorMatrix, AndroidColorFilter_androidKt.m4230actualColorMatrixColorFilterjHGOpc(colorMatrix), null);
    }

    /* JADX INFO: renamed from: copyColorMatrix-gBh15pI$default, reason: not valid java name */
    public static /* synthetic */ float[] m4442copyColorMatrixgBh15pI$default(ColorMatrixColorFilter r0, float[] r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = ColorMatrix.m4423constructorimpl$default(null, 1, null);
    L6:
        return r0.m4444copyColorMatrixgBh15pI(r1);
    }

    /* JADX INFO: renamed from: copyColorMatrix-gBh15pI, reason: not valid java name */
    public final float[] m4444copyColorMatrixgBh15pI(float[] targetColorMatrix) {
        float[] curMatrix = m4443obtainColorMatrixp10uLo();
        ArraysKt.copyInto$default(curMatrix, targetColorMatrix, 0, 0, 0, 14, null);
        return targetColorMatrix;
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof ColorMatrixColorFilter) == true) goto L8;
        return false;
    L8:
        float[] colorMatrix = m4443obtainColorMatrixp10uLo();
        float[] otherColorMatrix = ((ColorMatrixColorFilter) other).m4443obtainColorMatrixp10uLo();
        if (Arrays.equals(colorMatrix, otherColorMatrix) == true) goto L11;
        return false;
    L11:
        return true;
    }

    /* JADX INFO: renamed from: obtainColorMatrix-p10-uLo, reason: not valid java name */
    private final float[] m4443obtainColorMatrixp10uLo() {
        float[] r0 = this.colorMatrix;
        if (r0 != null) goto L6;
        float[] it = AndroidColorFilter_androidKt.actualColorMatrixFromFilter(getNativeColorFilter$ui_graphics_release());
        this.colorMatrix = it;
        return it;
    L6:
        return r0;
    }

    public int hashCode() {
        float[] r0 = this.colorMatrix;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return ColorMatrix.m4429hashCodeimpl(r0);
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder().append("ColorMatrixColorFilter(colorMatrix=");
        float[] r1 = this.colorMatrix;
        if (r1 != null) goto L5;
        String r2 = "null";
    L7:
        return r0.append(r2).append(')').toString();
    L5:
        r2 = ColorMatrix.m4440toStringimpl(r1);
        goto L7
    }
}
