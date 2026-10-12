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

/* JADX INFO: compiled from: Phone.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_phone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Phone", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPhone", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PhoneKt {
    private static ImageVector _phone;

    static {
    }

    public static final ImageVector getPhone(Icons.TwoTone $this$Phone) {
        if (_phone == null) goto L6;
        ImageVector r0 = _phone;
        Intrinsics.checkNotNull(r0);
        return r0;
    L6:
        float $this$dp$iv$iv = Dp.m6973constructorimpl(24.0f);
        float $this$dp$iv$iv2 = Dp.m6973constructorimpl(24.0f);
        ImageVector.Builder $this$_get_Phone__u24lambda_u242 = new ImageVector.Builder("TwoTone.Phone", $this$dp$iv$iv, $this$dp$iv$iv2, 24.0f, 24.0f, 0, 0, false, 96, null);
        int pathFillType$iv = VectorKt.getDefaultFillType();
        Brush fill$iv$iv = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv = StrokeCap.Companion.m4719getButtKaPHkGw();
        int strokeLineJoin$iv$iv = StrokeJoin.Companion.m4729getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(19.0f, 17.47f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-0.88f, -0.07f, -1.75f, -0.22f, -2.6f, -0.45f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-1.19f, 1.19f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(1.2f, 0.41f, 2.48f, 0.67f, 3.8f, 0.75f);
        $this$PathData_u24lambda_u240$iv$iv$iv.verticalLineToRelative(-1.49f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(5.03f, 5.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.09f, 1.32f, 0.35f, 2.59f, 0.75f, 3.8f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(1.2f, -1.2f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-0.23f, -0.84f, -0.38f, -1.71f, -0.44f, -2.6f);
        $this$PathData_u24lambda_u240$iv$iv$iv.horizontalLineTo(5.03f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        ImageVector.Builder.m5051addPathoIyEayM$default($this$_get_Phone__u24lambda_u242, $this$PathData_u24lambda_u240$iv$iv$iv.getNodes(), pathFillType$iv, "", fill$iv$iv, 0.3f, null, 0.3f, 1.0f, strokeLineCap$iv$iv, strokeLineJoin$iv$iv, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int pathFillType$iv2 = VectorKt.getDefaultFillType();
        Brush fill$iv$iv2 = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv2 = StrokeCap.Companion.m4719getButtKaPHkGw();
        int strokeLineJoin$iv$iv2 = StrokeJoin.Companion.m4729getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv2 = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv2.moveTo(9.07f, 7.57f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.lineTo(4.0f, 3.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(0.0f, 9.39f, 7.61f, 17.0f, 17.0f, 17.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.verticalLineToRelative(-3.49f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(-1.24f, 0.0f, -2.45f, -0.2f, -3.57f, -0.57f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(-0.1f, -0.04f, -0.21f, -0.05f, -0.31f, -0.05f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(-0.26f, 0.0f, -0.51f, 0.1f, -0.71f, 0.29f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.lineToRelative(-2.2f, 2.2f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(-2.83f, -1.45f, -5.15f, -3.76f, -6.59f, -6.59f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.lineToRelative(2.2f, -2.2f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(0.28f, -0.28f, 0.36f, -0.67f, 0.25f, -1.02f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.close();
        $this$PathData_u24lambda_u240$iv$iv$iv2.moveTo(16.4f, 17.02f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(0.85f, 0.24f, 1.72f, 0.39f, 2.6f, 0.45f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.verticalLineToRelative(1.49f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(-1.32f, -0.09f, -2.59f, -0.35f, -3.8f, -0.75f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.lineToRelative(1.2f, -1.19f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.close();
        $this$PathData_u24lambda_u240$iv$iv$iv2.moveTo(5.79f, 8.8f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(-0.41f, -1.21f, -0.67f, -2.48f, -0.76f, -3.8f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.horizontalLineToRelative(1.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(0.07f, 0.89f, 0.22f, 1.76f, 0.46f, 2.59f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.lineTo(5.79f, 8.8f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.close();
        _phone = ImageVector.Builder.m5051addPathoIyEayM$default($this$_get_Phone__u24lambda_u242, $this$PathData_u24lambda_u240$iv$iv$iv2.getNodes(), pathFillType$iv2, "", fill$iv$iv2, 1.0f, null, 1.0f, 1.0f, strokeLineCap$iv$iv2, strokeLineJoin$iv$iv2, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        ImageVector r1 = _phone;
        Intrinsics.checkNotNull(r1);
        return r1;
    }
}
