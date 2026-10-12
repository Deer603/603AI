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

/* JADX INFO: compiled from: Star.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_star", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Star", "Landroidx/compose/material/icons/Icons$TwoTone;", "getStar", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StarKt {
    private static ImageVector _star;

    static {
    }

    public static final ImageVector getStar(Icons.TwoTone $this$Star) {
        if (_star == null) goto L6;
        ImageVector r0 = _star;
        Intrinsics.checkNotNull(r0);
        return r0;
    L6:
        float $this$dp$iv$iv = Dp.m6973constructorimpl(24.0f);
        float $this$dp$iv$iv2 = Dp.m6973constructorimpl(24.0f);
        ImageVector.Builder $this$_get_Star__u24lambda_u242 = new ImageVector.Builder("TwoTone.Star", $this$dp$iv$iv, $this$dp$iv$iv2, 24.0f, 24.0f, 0, 0, false, 96, null);
        int pathFillType$iv = VectorKt.getDefaultFillType();
        Brush fill$iv$iv = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv = StrokeCap.Companion.m4719getButtKaPHkGw();
        int strokeLineJoin$iv$iv = StrokeJoin.Companion.m4729getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(12.0f, 15.4f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-3.76f, 2.27f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(1.0f, -4.28f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-3.32f, -2.88f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(4.38f, -0.38f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(1.7f, -4.03f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(1.71f, 4.04f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(4.38f, 0.38f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-3.32f, 2.88f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(1.0f, 4.28f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        ImageVector.Builder.m5051addPathoIyEayM$default($this$_get_Star__u24lambda_u242, $this$PathData_u24lambda_u240$iv$iv$iv.getNodes(), pathFillType$iv, "", fill$iv$iv, 0.3f, null, 0.3f, 1.0f, strokeLineCap$iv$iv, strokeLineJoin$iv$iv, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int pathFillType$iv2 = VectorKt.getDefaultFillType();
        Brush fill$iv$iv2 = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv2 = StrokeCap.Companion.m4719getButtKaPHkGw();
        int strokeLineJoin$iv$iv2 = StrokeJoin.Companion.m4729getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv2 = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv2.moveTo(22.0f, 9.24f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.lineToRelative(-7.19f, -0.62f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.lineTo(12.0f, 2.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.lineTo(9.19f, 8.63f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.lineTo(2.0f, 9.24f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.lineToRelative(5.46f, 4.73f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.lineTo(5.82f, 21.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.lineTo(12.0f, 17.27f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.lineTo(18.18f, 21.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.lineToRelative(-1.63f, -7.03f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.lineTo(22.0f, 9.24f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.close();
        $this$PathData_u24lambda_u240$iv$iv$iv2.moveTo(12.0f, 15.4f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.lineToRelative(-3.76f, 2.27f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.lineToRelative(1.0f, -4.28f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.lineToRelative(-3.32f, -2.88f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.lineToRelative(4.38f, -0.38f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.lineTo(12.0f, 6.1f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.lineToRelative(1.71f, 4.04f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.lineToRelative(4.38f, 0.38f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.lineToRelative(-3.32f, 2.88f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.lineToRelative(1.0f, 4.28f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.lineTo(12.0f, 15.4f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.close();
        _star = ImageVector.Builder.m5051addPathoIyEayM$default($this$_get_Star__u24lambda_u242, $this$PathData_u24lambda_u240$iv$iv$iv2.getNodes(), pathFillType$iv2, "", fill$iv$iv2, 1.0f, null, 1.0f, 1.0f, strokeLineCap$iv$iv2, strokeLineJoin$iv$iv2, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        ImageVector r1 = _star;
        Intrinsics.checkNotNull(r1);
        return r1;
    }
}
