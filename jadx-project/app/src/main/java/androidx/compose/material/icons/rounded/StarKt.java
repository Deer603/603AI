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

/* JADX INFO: compiled from: Star.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_star", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Star", "Landroidx/compose/material/icons/Icons$Rounded;", "getStar", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StarKt {
    private static ImageVector _star;

    static {
    }

    public static final ImageVector getStar(Icons.Rounded $this$Star) {
        if (_star == null) goto L6;
        ImageVector r0 = _star;
        Intrinsics.checkNotNull(r0);
        return r0;
    L6:
        float $this$dp$iv$iv = Dp.m6973constructorimpl(24.0f);
        float $this$dp$iv$iv2 = Dp.m6973constructorimpl(24.0f);
        ImageVector.Builder $this$_get_Star__u24lambda_u241 = new ImageVector.Builder("Rounded.Star", $this$dp$iv$iv, $this$dp$iv$iv2, 24.0f, 24.0f, 0, 0, false, 96, null);
        int pathFillType$iv = VectorKt.getDefaultFillType();
        Brush fill$iv$iv = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv = StrokeCap.Companion.m4719getButtKaPHkGw();
        int strokeLineJoin$iv$iv = StrokeJoin.Companion.m4729getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(12.0f, 17.27f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(4.15f, 2.51f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.76f, 0.46f, 1.69f, -0.22f, 1.49f, -1.08f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-1.1f, -4.72f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(3.67f, -3.18f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.67f, -0.58f, 0.31f, -1.68f, -0.57f, -1.75f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-4.83f, -0.41f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-1.89f, -4.46f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-0.34f, -0.81f, -1.5f, -0.81f, -1.84f, 0.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(9.19f, 8.63f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(4.36f, 9.04f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-0.88f, 0.07f, -1.24f, 1.17f, -0.57f, 1.75f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(3.67f, 3.18f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-1.1f, 4.72f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-0.2f, 0.86f, 0.73f, 1.54f, 1.49f, 1.08f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(12.0f, 17.27f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        _star = ImageVector.Builder.m5051addPathoIyEayM$default($this$_get_Star__u24lambda_u241, $this$PathData_u24lambda_u240$iv$iv$iv.getNodes(), pathFillType$iv, "", fill$iv$iv, 1.0f, null, 1.0f, 1.0f, strokeLineCap$iv$iv, strokeLineJoin$iv$iv, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        ImageVector r1 = _star;
        Intrinsics.checkNotNull(r1);
        return r1;
    }
}
