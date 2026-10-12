package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* JADX INFO: compiled from: ColorMatrix.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0082\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"dot", "", "m1", "Landroidx/compose/ui/graphics/ColorMatrix;", "row", "", "m2", "column", "dot-Me4OoYI", "([FI[FI)F", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ColorMatrixKt {
    /* JADX INFO: renamed from: dot-Me4OoYI, reason: not valid java name */
    private static final float m4446dotMe4OoYI(float[] m1, int row, float[] m2, int column) {
        return (((m1[(row * 5) + 0] * m2[(0 * 5) + column]) + (m1[(row * 5) + 1] * m2[(1 * 5) + column])) + (m1[(row * 5) + 2] * m2[(2 * 5) + column])) + (m1[(row * 5) + 3] * m2[(3 * 5) + column]);
    }
}
