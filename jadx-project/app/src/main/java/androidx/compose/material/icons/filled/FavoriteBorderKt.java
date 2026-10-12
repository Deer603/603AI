package androidx.compose.material.icons.filled;

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

/* JADX INFO: compiled from: FavoriteBorder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_favoriteBorder", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FavoriteBorder", "Landroidx/compose/material/icons/Icons$Filled;", "getFavoriteBorder", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FavoriteBorderKt {
    private static ImageVector _favoriteBorder;

    static {
    }

    public static final ImageVector getFavoriteBorder(Icons.Filled $this$FavoriteBorder) {
        if (_favoriteBorder == null) goto L6;
        ImageVector r0 = _favoriteBorder;
        Intrinsics.checkNotNull(r0);
        return r0;
    L6:
        float $this$dp$iv$iv = Dp.m6973constructorimpl(24.0f);
        float $this$dp$iv$iv2 = Dp.m6973constructorimpl(24.0f);
        ImageVector.Builder $this$_get_FavoriteBorder__u24lambda_u241 = new ImageVector.Builder("Filled.FavoriteBorder", $this$dp$iv$iv, $this$dp$iv$iv2, 24.0f, 24.0f, 0, 0, false, 96, null);
        int pathFillType$iv = VectorKt.getDefaultFillType();
        Brush fill$iv$iv = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv = StrokeCap.Companion.m4719getButtKaPHkGw();
        int strokeLineJoin$iv$iv = StrokeJoin.Companion.m4729getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(16.5f, 3.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-1.74f, 0.0f, -3.41f, 0.81f, -4.5f, 2.09f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(10.91f, 3.81f, 9.24f, 3.0f, 7.5f, 3.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(4.42f, 3.0f, 2.0f, 5.42f, 2.0f, 8.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.0f, 3.78f, 3.4f, 6.86f, 8.55f, 11.54f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(12.0f, 21.35f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(1.45f, -1.32f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(18.6f, 15.36f, 22.0f, 12.28f, 22.0f, 8.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(22.0f, 5.42f, 19.58f, 3.0f, 16.5f, 3.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(12.1f, 18.55f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-0.1f, 0.1f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-0.1f, -0.1f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(7.14f, 14.24f, 4.0f, 11.39f, 4.0f, 8.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(4.0f, 6.5f, 5.5f, 5.0f, 7.5f, 5.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(1.54f, 0.0f, 3.04f, 0.99f, 3.57f, 2.36f);
        $this$PathData_u24lambda_u240$iv$iv$iv.horizontalLineToRelative(1.87f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(13.46f, 5.99f, 14.96f, 5.0f, 16.5f, 5.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(2.0f, 0.0f, 3.5f, 1.5f, 3.5f, 3.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.0f, 2.89f, -3.14f, 5.74f, -7.9f, 10.05f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        _favoriteBorder = ImageVector.Builder.m5051addPathoIyEayM$default($this$_get_FavoriteBorder__u24lambda_u241, $this$PathData_u24lambda_u240$iv$iv$iv.getNodes(), pathFillType$iv, "", fill$iv$iv, 1.0f, null, 1.0f, 1.0f, strokeLineCap$iv$iv, strokeLineJoin$iv$iv, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        ImageVector r1 = _favoriteBorder;
        Intrinsics.checkNotNull(r1);
        return r1;
    }
}
