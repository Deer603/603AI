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

/* JADX INFO: compiled from: AccountCircle.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_accountCircle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AccountCircle", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAccountCircle", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AccountCircleKt {
    private static ImageVector _accountCircle;

    static {
    }

    public static final ImageVector getAccountCircle(Icons.TwoTone $this$AccountCircle) {
        if (_accountCircle == null) goto L6;
        ImageVector r0 = _accountCircle;
        Intrinsics.checkNotNull(r0);
        return r0;
    L6:
        float $this$dp$iv$iv = Dp.m6973constructorimpl(24.0f);
        float $this$dp$iv$iv2 = Dp.m6973constructorimpl(24.0f);
        ImageVector.Builder $this$_get_AccountCircle__u24lambda_u243 = new ImageVector.Builder("TwoTone.AccountCircle", $this$dp$iv$iv, $this$dp$iv$iv2, 24.0f, 24.0f, 0, 0, false, 96, null);
        int pathFillType$iv = VectorKt.getDefaultFillType();
        Brush fill$iv$iv = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv = StrokeCap.Companion.m4719getButtKaPHkGw();
        int strokeLineJoin$iv$iv = StrokeJoin.Companion.m4729getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(12.0f, 4.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.0f, 1.95f, 0.7f, 3.73f, 1.86f, 5.12f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(7.55f, 15.8f, 9.68f, 15.0f, 12.0f, 15.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveToRelative(4.45f, 0.8f, 6.14f, 2.12f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(19.3f, 15.73f, 20.0f, 13.95f, 20.0f, 12.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(20.0f, 7.58f, 16.42f, 4.0f, 12.0f, 4.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(12.0f, 13.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(8.5f, 7.57f, 10.07f, 6.0f, 12.0f, 6.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(15.5f, 11.43f, 13.93f, 13.0f, 12.0f, 13.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        ImageVector.Builder.m5051addPathoIyEayM$default($this$_get_AccountCircle__u24lambda_u243, $this$PathData_u24lambda_u240$iv$iv$iv.getNodes(), pathFillType$iv, "", fill$iv$iv, 0.3f, null, 0.3f, 1.0f, strokeLineCap$iv$iv, strokeLineJoin$iv$iv, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int pathFillType$iv2 = VectorKt.getDefaultFillType();
        Brush fill$iv$iv2 = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv2 = StrokeCap.Companion.m4719getButtKaPHkGw();
        int strokeLineJoin$iv$iv2 = StrokeJoin.Companion.m4729getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv2 = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv2.moveTo(12.0f, 2.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.close();
        $this$PathData_u24lambda_u240$iv$iv$iv2.moveTo(12.0f, 20.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(-1.74f, 0.0f, -3.34f, -0.56f, -4.65f, -1.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveTo(8.66f, 17.56f, 10.26f, 17.0f, 12.0f, 17.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.reflectiveCurveToRelative(3.34f, 0.56f, 4.65f, 1.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveTo(15.34f, 19.44f, 13.74f, 20.0f, 12.0f, 20.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.close();
        $this$PathData_u24lambda_u240$iv$iv$iv2.moveTo(18.14f, 17.12f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveTo(16.45f, 15.8f, 14.32f, 15.0f, 12.0f, 15.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.reflectiveCurveToRelative(-4.45f, 0.8f, -6.14f, 2.12f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveTo(4.7f, 15.73f, 4.0f, 13.95f, 4.0f, 12.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveTo(20.0f, 13.95f, 19.3f, 15.73f, 18.14f, 17.12f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.close();
        ImageVector.Builder.m5051addPathoIyEayM$default($this$_get_AccountCircle__u24lambda_u243, $this$PathData_u24lambda_u240$iv$iv$iv2.getNodes(), pathFillType$iv2, "", fill$iv$iv2, 1.0f, null, 1.0f, 1.0f, strokeLineCap$iv$iv2, strokeLineJoin$iv$iv2, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int pathFillType$iv3 = VectorKt.getDefaultFillType();
        Brush fill$iv$iv3 = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv3 = StrokeCap.Companion.m4719getButtKaPHkGw();
        int strokeLineJoin$iv$iv3 = StrokeJoin.Companion.m4729getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv3 = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv3.moveTo(12.0f, 5.93f);
        $this$PathData_u24lambda_u240$iv$iv$iv3.curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv3.curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv3.reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv3.curveTo(15.5f, 7.5f, 13.93f, 5.93f, 12.0f, 5.93f);
        $this$PathData_u24lambda_u240$iv$iv$iv3.close();
        $this$PathData_u24lambda_u240$iv$iv$iv3.moveTo(12.0f, 10.93f);
        $this$PathData_u24lambda_u240$iv$iv$iv3.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv3.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv3.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv3.reflectiveCurveTo(12.83f, 10.93f, 12.0f, 10.93f);
        $this$PathData_u24lambda_u240$iv$iv$iv3.close();
        _accountCircle = ImageVector.Builder.m5051addPathoIyEayM$default($this$_get_AccountCircle__u24lambda_u243, $this$PathData_u24lambda_u240$iv$iv$iv3.getNodes(), pathFillType$iv3, "", fill$iv$iv3, 1.0f, null, 1.0f, 1.0f, strokeLineCap$iv$iv3, strokeLineJoin$iv$iv3, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        ImageVector r1 = _accountCircle;
        Intrinsics.checkNotNull(r1);
        return r1;
    }
}
