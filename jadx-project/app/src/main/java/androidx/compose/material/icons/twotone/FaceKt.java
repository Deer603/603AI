package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Face.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_face", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Face", "Landroidx/compose/material/icons/Icons$TwoTone;", "getFace", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FaceKt {
    private static ImageVector _face;

    static {
    }

    public static final ImageVector getFace(Icons.TwoTone $this$Face) {
        if (_face == null) goto L6;
        ImageVector r0 = _face;
        Intrinsics.checkNotNull(r0);
        return r0;
    L6:
        float $this$dp$iv$iv = Dp.m6973constructorimpl(24.0f);
        float $this$dp$iv$iv2 = Dp.m6973constructorimpl(24.0f);
        ImageVector.Builder $this$_get_Face__u24lambda_u244 = new ImageVector.Builder("TwoTone.Face", $this$dp$iv$iv, $this$dp$iv$iv2, 24.0f, 24.0f, 0, 0, false, 96, null);
        int pathFillType$iv = VectorKt.getDefaultFillType();
        Brush fill$iv$iv = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv = StrokeCap.Companion.m4719getButtKaPHkGw();
        int strokeLineJoin$iv$iv = StrokeJoin.Companion.m4729getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(17.5f, 8.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.46f, 0.0f, 0.91f, -0.05f, 1.34f, -0.12f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(17.44f, 5.56f, 14.9f, 4.0f, 12.0f, 4.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-0.46f, 0.0f, -0.91f, 0.05f, -1.34f, 0.12f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(12.06f, 6.44f, 14.6f, 8.0f, 17.5f, 8.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(8.08f, 5.03f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(6.37f, 6.0f, 5.05f, 7.58f, 4.42f, 9.47f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(1.71f, -0.97f, 3.03f, -2.55f, 3.66f, -4.44f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        ImageVector.Builder.m5051addPathoIyEayM$default($this$_get_Face__u24lambda_u244, $this$PathData_u24lambda_u240$iv$iv$iv.getNodes(), pathFillType$iv, "", fill$iv$iv, 0.3f, null, 0.3f, 1.0f, strokeLineCap$iv$iv, strokeLineJoin$iv$iv, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int pathFillType$iv2 = VectorKt.getDefaultFillType();
        Brush fill$iv$iv2 = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv2 = StrokeCap.Companion.m4719getButtKaPHkGw();
        int strokeLineJoin$iv$iv2 = StrokeJoin.Companion.m4729getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv2 = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv2.moveTo(12.0f, 2.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.close();
        $this$PathData_u24lambda_u240$iv$iv$iv2.moveTo(12.0f, 4.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(2.9f, 0.0f, 5.44f, 1.56f, 6.84f, 3.88f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(-0.43f, 0.07f, -0.88f, 0.12f, -1.34f, 0.12f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(-2.9f, 0.0f, -5.44f, -1.56f, -6.84f, -3.88f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(0.43f, -0.07f, 0.88f, -0.12f, 1.34f, -0.12f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.close();
        $this$PathData_u24lambda_u240$iv$iv$iv2.moveTo(8.08f, 5.03f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveTo(7.45f, 6.92f, 6.13f, 8.5f, 4.42f, 9.47f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveTo(5.05f, 7.58f, 6.37f, 6.0f, 8.08f, 5.03f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.close();
        $this$PathData_u24lambda_u240$iv$iv$iv2.moveTo(12.0f, 20.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(0.0f, -0.05f, 0.01f, -0.1f, 0.01f, -0.15f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(2.6f, -0.98f, 4.68f, -2.99f, 5.74f, -5.55f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(1.83f, 2.26f, 4.62f, 3.7f, 7.75f, 3.7f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(0.75f, 0.0f, 1.47f, -0.09f, 2.17f, -0.24f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(0.21f, 0.71f, 0.33f, 1.46f, 0.33f, 2.24f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(0.0f, 4.41f, -3.59f, 8.0f, -8.0f, 8.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.close();
        ImageVector.Builder.m5051addPathoIyEayM$default($this$_get_Face__u24lambda_u244, $this$PathData_u24lambda_u240$iv$iv$iv2.getNodes(), pathFillType$iv2, "", fill$iv$iv2, 1.0f, null, 1.0f, 1.0f, strokeLineCap$iv$iv2, strokeLineJoin$iv$iv2, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int pathFillType$iv3 = VectorKt.getDefaultFillType();
        Brush fill$iv$iv3 = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv3 = StrokeCap.Companion.m4719getButtKaPHkGw();
        int strokeLineJoin$iv$iv3 = StrokeJoin.Companion.m4729getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv3 = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv3.moveTo(9.0f, 13.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv3.moveToRelative(-1.25f, 0.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv3.arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv3.arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f);
        ImageVector.Builder.m5051addPathoIyEayM$default($this$_get_Face__u24lambda_u244, $this$PathData_u24lambda_u240$iv$iv$iv3.getNodes(), pathFillType$iv3, "", fill$iv$iv3, 1.0f, null, 1.0f, 1.0f, strokeLineCap$iv$iv3, strokeLineJoin$iv$iv3, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int pathFillType$iv4 = VectorKt.getDefaultFillType();
        Brush fill$iv$iv4 = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv4 = StrokeCap.Companion.m4719getButtKaPHkGw();
        int strokeLineJoin$iv$iv4 = StrokeJoin.Companion.m4729getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv4 = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv4.moveTo(15.0f, 13.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv4.moveToRelative(-1.25f, 0.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv4.arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv4.arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f);
        _face = ImageVector.Builder.m5051addPathoIyEayM$default($this$_get_Face__u24lambda_u244, $this$PathData_u24lambda_u240$iv$iv$iv4.getNodes(), pathFillType$iv4, "", fill$iv$iv4, 1.0f, null, 1.0f, 1.0f, strokeLineCap$iv$iv4, strokeLineJoin$iv$iv4, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        ImageVector r1 = _face;
        Intrinsics.checkNotNull(r1);
        return r1;
    }
}
