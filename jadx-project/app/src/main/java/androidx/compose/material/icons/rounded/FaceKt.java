package androidx.compose.material.icons.rounded;

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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_face", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Face", "Landroidx/compose/material/icons/Icons$Rounded;", "getFace", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FaceKt {
    private static ImageVector _face;

    static {
    }

    public static final ImageVector getFace(Icons.Rounded $this$Face) {
        if (_face == null) goto L6;
        ImageVector r0 = _face;
        Intrinsics.checkNotNull(r0);
        return r0;
    L6:
        float $this$dp$iv$iv = Dp.m6973constructorimpl(24.0f);
        float $this$dp$iv$iv2 = Dp.m6973constructorimpl(24.0f);
        ImageVector.Builder $this$_get_Face__u24lambda_u241 = new ImageVector.Builder("Rounded.Face", $this$dp$iv$iv, $this$dp$iv$iv2, 24.0f, 24.0f, 0, 0, false, 96, null);
        int pathFillType$iv = VectorKt.getDefaultFillType();
        Brush fill$iv$iv = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv = StrokeCap.Companion.m4719getButtKaPHkGw();
        int strokeLineJoin$iv$iv = StrokeJoin.Companion.m4729getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(10.25f, 13.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveTo(7.75f, 13.69f, 7.75f, 13.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveTo(8.31f, 11.75f, 9.0f, 11.75f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveTo(10.25f, 12.31f, 10.25f, 13.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(15.0f, 11.75f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveTo(15.69f, 11.75f, 15.0f, 11.75f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(22.0f, 12.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.0f, 5.52f, -4.48f, 10.0f, -10.0f, 10.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveTo(2.0f, 17.52f, 2.0f, 12.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveTo(6.48f, 2.0f, 12.0f, 2.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveTo(22.0f, 6.48f, 22.0f, 12.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(20.0f, 12.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.0f, -0.78f, -0.12f, -1.53f, -0.33f, -2.24f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(18.97f, 9.91f, 18.25f, 10.0f, 17.5f, 10.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-3.13f, 0.0f, -5.92f, -1.44f, -7.76f, -3.69f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(8.69f, 8.87f, 6.6f, 10.88f, 4.0f, 11.86f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(4.01f, 11.9f, 4.0f, 11.95f, 4.0f, 12.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.0f, 4.41f, 3.59f, 8.0f, 8.0f, 8.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveTo(20.0f, 16.41f, 20.0f, 12.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        _face = ImageVector.Builder.m5051addPathoIyEayM$default($this$_get_Face__u24lambda_u241, $this$PathData_u24lambda_u240$iv$iv$iv.getNodes(), pathFillType$iv, "", fill$iv$iv, 1.0f, null, 1.0f, 1.0f, strokeLineCap$iv$iv, strokeLineJoin$iv$iv, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        ImageVector r1 = _face;
        Intrinsics.checkNotNull(r1);
        return r1;
    }
}
