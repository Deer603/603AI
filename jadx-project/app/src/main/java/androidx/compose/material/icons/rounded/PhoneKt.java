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

/* JADX INFO: compiled from: Phone.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_phone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Phone", "Landroidx/compose/material/icons/Icons$Rounded;", "getPhone", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PhoneKt {
    private static ImageVector _phone;

    static {
    }

    public static final ImageVector getPhone(Icons.Rounded $this$Phone) {
        if (_phone == null) goto L6;
        ImageVector r0 = _phone;
        Intrinsics.checkNotNull(r0);
        return r0;
    L6:
        float $this$dp$iv$iv = Dp.m6973constructorimpl(24.0f);
        float $this$dp$iv$iv2 = Dp.m6973constructorimpl(24.0f);
        ImageVector.Builder $this$_get_Phone__u24lambda_u241 = new ImageVector.Builder("Rounded.Phone", $this$dp$iv$iv, $this$dp$iv$iv2, 24.0f, 24.0f, 0, 0, false, 96, null);
        int pathFillType$iv = VectorKt.getDefaultFillType();
        Brush fill$iv$iv = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv = StrokeCap.Companion.m4719getButtKaPHkGw();
        int strokeLineJoin$iv$iv = StrokeJoin.Companion.m4729getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(19.23f, 15.26f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-2.54f, -0.29f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-0.61f, -0.07f, -1.21f, 0.14f, -1.64f, 0.57f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-1.84f, 1.84f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(1.85f, -1.85f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.43f, -0.43f, 0.64f, -1.03f, 0.57f, -1.64f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-0.29f, -2.52f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-0.12f, -1.01f, -0.97f, -1.77f, -1.99f, -1.77f);
        $this$PathData_u24lambda_u240$iv$iv$iv.horizontalLineTo(5.03f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-1.13f, 0.0f, -2.07f, 0.94f, -2.0f, 2.07f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.53f, 8.54f, 7.36f, 15.36f, 15.89f, 15.89f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(1.13f, 0.07f, 2.07f, -0.87f, 2.07f, -2.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.verticalLineToRelative(-1.73f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.01f, -1.01f, -0.75f, -1.86f, -1.76f, -1.98f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        _phone = ImageVector.Builder.m5051addPathoIyEayM$default($this$_get_Phone__u24lambda_u241, $this$PathData_u24lambda_u240$iv$iv$iv.getNodes(), pathFillType$iv, "", fill$iv$iv, 1.0f, null, 1.0f, 1.0f, strokeLineCap$iv$iv, strokeLineJoin$iv$iv, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        ImageVector r1 = _phone;
        Intrinsics.checkNotNull(r1);
        return r1;
    }
}
