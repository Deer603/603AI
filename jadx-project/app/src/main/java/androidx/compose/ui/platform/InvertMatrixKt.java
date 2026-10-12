package androidx.compose.ui.platform;

import kotlin.Metadata;

/* JADX INFO: compiled from: InvertMatrix.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"invertTo", "", "Landroidx/compose/ui/graphics/Matrix;", "other", "invertTo-JiSxe2E", "([F[F)Z", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class InvertMatrixKt {
    /* JADX INFO: renamed from: invertTo-JiSxe2E, reason: not valid java name */
    public static final boolean m6125invertToJiSxe2E(float[] $this$invertTo_u2dJiSxe2E, float[] other) {
        if ($this$invertTo_u2dJiSxe2E.length >= 16) goto L5;
        return false;
    L5:
        if (other.length >= 16) goto L7;
        return false;
    L7:
        float a00 = $this$invertTo_u2dJiSxe2E[(0 * 4) + 0];
        float a01 = $this$invertTo_u2dJiSxe2E[(0 * 4) + 1];
        float a02 = $this$invertTo_u2dJiSxe2E[(0 * 4) + 2];
        float a03 = $this$invertTo_u2dJiSxe2E[(0 * 4) + 3];
        float a10 = $this$invertTo_u2dJiSxe2E[(1 * 4) + 0];
        float a11 = $this$invertTo_u2dJiSxe2E[(1 * 4) + 1];
        float a12 = $this$invertTo_u2dJiSxe2E[(1 * 4) + 2];
        float a13 = $this$invertTo_u2dJiSxe2E[(1 * 4) + 3];
        float a20 = $this$invertTo_u2dJiSxe2E[(2 * 4) + 0];
        float a21 = $this$invertTo_u2dJiSxe2E[(2 * 4) + 1];
        float a22 = $this$invertTo_u2dJiSxe2E[(2 * 4) + 2];
        float a23 = $this$invertTo_u2dJiSxe2E[(2 * 4) + 3];
        float a30 = $this$invertTo_u2dJiSxe2E[(3 * 4) + 0];
        float a31 = $this$invertTo_u2dJiSxe2E[(3 * 4) + 1];
        float a32 = $this$invertTo_u2dJiSxe2E[(3 * 4) + 2];
        float a33 = $this$invertTo_u2dJiSxe2E[(3 * 4) + 3];
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
        if (det != 0.0f) goto L10;
        boolean r33 = true;
    L11:
        if (r33 == true) goto L13;
        float invDet = 1.0f / det;
        float v$iv = (((a11 * b11) - (a12 * b10)) + (a13 * b09)) * invDet;
        other[(0 * 4) + 0] = v$iv;
        boolean r37 = false;
        float v$iv2 = ((((-a01) * b11) + (a02 * b10)) - (a03 * b09)) * invDet;
        other[(0 * 4) + 1] = v$iv2;
        float v$iv3 = (((a31 * b05) - (a32 * b04)) + (a33 * b03)) * invDet;
        other[(0 * 4) + 2] = v$iv3;
        float v$iv4 = ((((-a21) * b05) + (a22 * b04)) - (a23 * b03)) * invDet;
        other[(0 * 4) + 3] = v$iv4;
        float v$iv5 = ((((-a10) * b11) + (a12 * b08)) - (a13 * b07)) * invDet;
        other[(1 * 4) + 0] = v$iv5;
        float v$iv6 = (((a00 * b11) - (a02 * b08)) + (a03 * b07)) * invDet;
        other[(1 * 4) + 1] = v$iv6;
        float v$iv7 = ((((-a30) * b05) + (a32 * b02)) - (a33 * b01)) * invDet;
        other[(1 * 4) + 2] = v$iv7;
        float v$iv8 = (((a20 * b05) - (a22 * b02)) + (a23 * b01)) * invDet;
        other[(1 * 4) + 3] = v$iv8;
        float v$iv9 = (((a10 * b10) - (a11 * b08)) + (a13 * b06)) * invDet;
        other[(2 * 4) + 0] = v$iv9;
        float v$iv10 = ((((-a00) * b10) + (a01 * b08)) - (a03 * b06)) * invDet;
        other[(2 * 4) + 1] = v$iv10;
        float v$iv11 = (((a30 * b04) - (a31 * b02)) + (a33 * b00)) * invDet;
        other[(2 * 4) + 2] = v$iv11;
        float v$iv12 = ((((-a20) * b04) + (a21 * b02)) - (a23 * b00)) * invDet;
        other[(2 * 4) + 3] = v$iv12;
        float v$iv13 = ((((-a10) * b09) + (a11 * b07)) - (a12 * b06)) * invDet;
        other[(3 * 4) + 0] = v$iv13;
        float v$iv14 = (((a00 * b09) - (a01 * b07)) + (a02 * b06)) * invDet;
        other[(3 * 4) + 1] = v$iv14;
        float v$iv15 = ((((-a30) * b03) + (a31 * b01)) - (a32 * b00)) * invDet;
        other[(3 * 4) + 2] = v$iv15;
        float v$iv16 = (((a20 * b03) - (a21 * b01)) + (a22 * b00)) * invDet;
        other[(3 * 4) + 3] = v$iv16;
    L15:
        if (det != 0.0f) goto L17;
        boolean r3 = true;
    L19:
        return !r3;
    L17:
        r3 = r37;
        goto L19
    L13:
        r37 = false;
        goto L15
    L10:
        r33 = false;
        goto L11
    }
}
