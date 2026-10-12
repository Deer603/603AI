package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\u001e\u0010\u0011\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0016\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/platform/CalculateMatrixToWindowApi21;", "Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "tmpMatrix", "Landroidx/compose/ui/graphics/Matrix;", "([FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "tmpLocation", "", "[F", "calculateMatrixToWindow", "", "view", "Landroid/view/View;", "matrix", "calculateMatrixToWindow-EL8BTi8", "(Landroid/view/View;[F)V", "transformMatrixToWindow", "transformMatrixToWindow-EL8BTi8", "preConcat", "other", "Landroid/graphics/Matrix;", "preConcat-tU-YjHk", "([FLandroid/graphics/Matrix;)V", "preTranslate", "x", "", "y", "preTranslate-3XD1CNM", "([FFF)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class CalculateMatrixToWindowApi21 implements CalculateMatrixToWindow {
    private final int[] tmpLocation;
    private final float[] tmpMatrix;

    public /* synthetic */ CalculateMatrixToWindowApi21(float[] r1, DefaultConstructorMarker r2) {
        this(r1);
    }

    private CalculateMatrixToWindowApi21(float[] tmpMatrix) {
        this.tmpMatrix = tmpMatrix;
        this.tmpLocation = new int[2];
    }

    @Override // androidx.compose.ui.platform.CalculateMatrixToWindow
    /* JADX INFO: renamed from: calculateMatrixToWindow-EL8BTi8 */
    public void mo6099calculateMatrixToWindowEL8BTi8(View view, float[] matrix) {
        Matrix.m4605resetimpl(matrix);
        m6102transformMatrixToWindowEL8BTi8(view, matrix);
    }

    /* JADX INFO: renamed from: transformMatrixToWindow-EL8BTi8, reason: not valid java name */
    private final void m6102transformMatrixToWindowEL8BTi8(View view, float[] matrix) {
        Object r0 = view.getParent();
        if ((r0 instanceof View) == false) goto L5;
        m6102transformMatrixToWindowEL8BTi8((View) r0, matrix);
        m6101preTranslate3XD1CNM(matrix, -view.getScrollX(), -view.getScrollY());
        m6101preTranslate3XD1CNM(matrix, view.getLeft(), view.getTop());
    L6:
        android.graphics.Matrix viewMatrix = view.getMatrix();
        if (viewMatrix.isIdentity() == true) goto L10;
        m6100preConcattUYjHk(matrix, viewMatrix);
        return;
    L10:
        return;
    L5:
        int[] pos = this.tmpLocation;
        view.getLocationInWindow(pos);
        m6101preTranslate3XD1CNM(matrix, -view.getScrollX(), -view.getScrollY());
        m6101preTranslate3XD1CNM(matrix, pos[0], pos[1]);
        goto L6
    }

    /* JADX INFO: renamed from: preConcat-tU-YjHk, reason: not valid java name */
    private final void m6100preConcattUYjHk(float[] $this$preConcat_u2dtU_u2dYjHk, android.graphics.Matrix other) {
        AndroidMatrixConversions_androidKt.m4237setFromtUYjHk(this.tmpMatrix, other);
        AndroidComposeView_androidKt.m6094access$preTransformJiSxe2E($this$preConcat_u2dtU_u2dYjHk, this.tmpMatrix);
    }

    /* JADX INFO: renamed from: preTranslate-3XD1CNM, reason: not valid java name */
    private final void m6101preTranslate3XD1CNM(float[] $this$preTranslate_u2d3XD1CNM, float x, float y) {
        AndroidComposeView_androidKt.m6095access$preTranslatecG2Xzmc($this$preTranslate_u2d3XD1CNM, x, y, this.tmpMatrix);
    }
}
