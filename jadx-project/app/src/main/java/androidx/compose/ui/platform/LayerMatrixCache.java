package androidx.compose.ui.platform;

import android.graphics.Matrix;
import androidx.autofill.HintConstants;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.MatrixKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: LayerMatrixCache.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B=\u00126\u0010\u0003\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0002\u0010\u000bJ\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00028\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00028\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018J\u0006\u0010\u001b\u001a\u00020\nJ\u001b\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0002\u0010\u001fJ \u0010\u001c\u001a\u00020 2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010!\u001a\u00020 ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001b\u0010$\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0002\u0010\u001fJ \u0010$\u001a\u00020 2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010!\u001a\u00020 ø\u0001\u0000¢\u0006\u0004\b%\u0010#J\u0006\u0010&\u001a\u00020\nR\u0010\u0010\f\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R>\u0010\u0003\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u00020\u000eX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u00020\u000eX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/ui/platform/LayerMatrixCache;", "T", "", "getMatrix", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "target", "Landroid/graphics/Matrix;", "matrix", "", "(Lkotlin/jvm/functions/Function2;)V", "androidMatrixCache", "inverseMatrixCache", "Landroidx/compose/ui/graphics/Matrix;", "[F", "isDirty", "", "isIdentity", "isInverseDirty", "isInverseValid", "matrixCache", "calculateInverseMatrix", "calculateInverseMatrix-bWbORWo", "(Ljava/lang/Object;)[F", "calculateMatrix", "calculateMatrix-GrdbGEg", "invalidate", "map", "rect", "Landroidx/compose/ui/geometry/MutableRect;", "(Ljava/lang/Object;Landroidx/compose/ui/geometry/MutableRect;)V", "Landroidx/compose/ui/geometry/Offset;", "offset", "map-R5De75A", "(Ljava/lang/Object;J)J", "mapInverse", "mapInverse-R5De75A", "reset", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LayerMatrixCache<T> {
    public static final int $stable = 0;
    private Matrix androidMatrixCache;
    private final Function2<T, Matrix, Unit> getMatrix;
    private float[] inverseMatrixCache;
    private boolean isDirty;
    private boolean isIdentity;
    private boolean isInverseDirty;
    private boolean isInverseValid;
    private float[] matrixCache;

    static {
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayerMatrixCache(Function2<? super T, ? super Matrix, Unit> r4) {
        this.getMatrix = r4;
        this.matrixCache = androidx.compose.ui.graphics.Matrix.m4596constructorimpl$default(null, 1, null);
        this.inverseMatrixCache = androidx.compose.ui.graphics.Matrix.m4596constructorimpl$default(null, 1, null);
        this.isInverseValid = true;
        this.isIdentity = true;
    }

    public final void reset() {
        this.isDirty = false;
        this.isInverseDirty = false;
        this.isIdentity = true;
        this.isInverseValid = true;
        androidx.compose.ui.graphics.Matrix.m4605resetimpl(this.matrixCache);
        androidx.compose.ui.graphics.Matrix.m4605resetimpl(this.inverseMatrixCache);
    }

    public final void invalidate() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }

    /* JADX INFO: renamed from: calculateMatrix-GrdbGEg, reason: not valid java name */
    public final float[] m6128calculateMatrixGrdbGEg(T r5) {
        float[] matrix = this.matrixCache;
        if (this.isDirty == true) goto L5;
        return matrix;
    L5:
        Matrix it = this.androidMatrixCache;
        if (it != null) goto L8;
        it = new Matrix();
        this.androidMatrixCache = it;
    L8:
        this.getMatrix.invoke(r5, it);
        AndroidMatrixConversions_androidKt.m4237setFromtUYjHk(matrix, it);
        this.isDirty = false;
        this.isIdentity = MatrixKt.m4621isIdentity58bKbWc(matrix);
        return matrix;
    }

    /* JADX INFO: renamed from: calculateInverseMatrix-bWbORWo, reason: not valid java name */
    public final float[] m6127calculateInverseMatrixbWbORWo(T r4) {
        float[] matrix = this.inverseMatrixCache;
        if (this.isInverseDirty == false) goto L6;
        float[] normalMatrix = m6128calculateMatrixGrdbGEg(r4);
        this.isInverseValid = InvertMatrixKt.m6125invertToJiSxe2E(normalMatrix, matrix);
        this.isInverseDirty = false;
    L6:
        if (this.isInverseValid == true) goto L10;
        return null;
    L10:
        return matrix;
    }

    public final void map(T r3, MutableRect rect) {
        float[] matrix = m6128calculateMatrixGrdbGEg(r3);
        if (this.isIdentity == true) goto L6;
        androidx.compose.ui.graphics.Matrix.m4604mapimpl(matrix, rect);
        return;
    }

    public final void mapInverse(T r3, MutableRect rect) {
        float[] matrix = m6127calculateInverseMatrixbWbORWo(r3);
        if (matrix != null) goto L6;
        rect.set(0.0f, 0.0f, 0.0f, 0.0f);
        return;
    L6:
        if (this.isIdentity == true) goto L10;
        androidx.compose.ui.graphics.Matrix.m4604mapimpl(matrix, rect);
        return;
    }

    /* JADX INFO: renamed from: map-R5De75A, reason: not valid java name */
    public final long m6129mapR5De75A(T r4, long offset) {
        float[] matrix = m6128calculateMatrixGrdbGEg(r4);
        if (this.isIdentity == true) goto L6;
        return androidx.compose.ui.graphics.Matrix.m4602mapMKHz9U(matrix, offset);
    L6:
        return offset;
    }

    /* JADX INFO: renamed from: mapInverse-R5De75A, reason: not valid java name */
    public final long m6130mapInverseR5De75A(T r4, long offset) {
        float[] matrix = m6127calculateInverseMatrixbWbORWo(r4);
        if (matrix != null) goto L6;
        return Offset.Companion.m4139getInfiniteF1C5BW0();
    L6:
        if (this.isIdentity == true) goto L9;
        return androidx.compose.ui.graphics.Matrix.m4602mapMKHz9U(matrix, offset);
    L9:
        return offset;
    }
}
