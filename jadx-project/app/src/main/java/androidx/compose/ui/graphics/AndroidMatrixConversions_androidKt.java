package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidMatrixConversions.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"setFrom", "", "Landroid/graphics/Matrix;", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "setFrom-EL8BTi8", "(Landroid/graphics/Matrix;[F)V", "setFrom-tU-YjHk", "([FLandroid/graphics/Matrix;)V", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidMatrixConversions_androidKt {
    /* JADX INFO: renamed from: setFrom-tU-YjHk, reason: not valid java name */
    public static final void m4237setFromtUYjHk(float[] $this$setFrom_u2dtU_u2dYjHk, android.graphics.Matrix matrix) {
        matrix.getValues($this$setFrom_u2dtU_u2dYjHk);
        float scaleX = $this$setFrom_u2dtU_u2dYjHk[0];
        float skewX = $this$setFrom_u2dtU_u2dYjHk[1];
        float translateX = $this$setFrom_u2dtU_u2dYjHk[2];
        float skewY = $this$setFrom_u2dtU_u2dYjHk[3];
        float scaleY = $this$setFrom_u2dtU_u2dYjHk[4];
        float translateY = $this$setFrom_u2dtU_u2dYjHk[5];
        float persp0 = $this$setFrom_u2dtU_u2dYjHk[6];
        float persp1 = $this$setFrom_u2dtU_u2dYjHk[7];
        float persp2 = $this$setFrom_u2dtU_u2dYjHk[8];
        $this$setFrom_u2dtU_u2dYjHk[0] = scaleX;
        $this$setFrom_u2dtU_u2dYjHk[1] = skewY;
        $this$setFrom_u2dtU_u2dYjHk[2] = 0.0f;
        $this$setFrom_u2dtU_u2dYjHk[3] = persp0;
        $this$setFrom_u2dtU_u2dYjHk[4] = skewX;
        $this$setFrom_u2dtU_u2dYjHk[5] = scaleY;
        $this$setFrom_u2dtU_u2dYjHk[6] = 0.0f;
        $this$setFrom_u2dtU_u2dYjHk[7] = persp1;
        $this$setFrom_u2dtU_u2dYjHk[8] = 0.0f;
        $this$setFrom_u2dtU_u2dYjHk[9] = 0.0f;
        $this$setFrom_u2dtU_u2dYjHk[10] = 1.0f;
        $this$setFrom_u2dtU_u2dYjHk[11] = 0.0f;
        $this$setFrom_u2dtU_u2dYjHk[12] = translateX;
        $this$setFrom_u2dtU_u2dYjHk[13] = translateY;
        $this$setFrom_u2dtU_u2dYjHk[14] = 0.0f;
        $this$setFrom_u2dtU_u2dYjHk[15] = persp2;
    }

    /* JADX INFO: renamed from: setFrom-EL8BTi8, reason: not valid java name */
    public static final void m4236setFromEL8BTi8(android.graphics.Matrix $this$setFrom_u2dEL8BTi8, float[] matrix) {
        float scaleX = matrix[0];
        float skewY = matrix[1];
        float v2 = matrix[2];
        float persp0 = matrix[3];
        float skewX = matrix[4];
        float scaleY = matrix[5];
        float v6 = matrix[6];
        float persp1 = matrix[7];
        float v8 = matrix[8];
        float translateX = matrix[12];
        float translateY = matrix[13];
        float persp2 = matrix[15];
        matrix[0] = scaleX;
        matrix[1] = skewX;
        matrix[2] = translateX;
        matrix[3] = skewY;
        matrix[4] = scaleY;
        matrix[5] = translateY;
        matrix[6] = persp0;
        matrix[7] = persp1;
        matrix[8] = persp2;
        $this$setFrom_u2dEL8BTi8.setValues(matrix);
        matrix[0] = scaleX;
        matrix[1] = skewY;
        matrix[2] = v2;
        matrix[3] = persp0;
        matrix[4] = skewX;
        matrix[5] = scaleY;
        matrix[6] = v6;
        matrix[7] = persp1;
        matrix[8] = v8;
    }
}
