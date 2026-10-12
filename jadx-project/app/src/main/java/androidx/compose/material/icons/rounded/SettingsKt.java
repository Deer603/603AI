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

/* JADX INFO: compiled from: Settings.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_settings", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Settings", "Landroidx/compose/material/icons/Icons$Rounded;", "getSettings", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SettingsKt {
    private static ImageVector _settings;

    static {
    }

    public static final ImageVector getSettings(Icons.Rounded $this$Settings) {
        if (_settings == null) goto L6;
        ImageVector r0 = _settings;
        Intrinsics.checkNotNull(r0);
        return r0;
    L6:
        float $this$dp$iv$iv = Dp.m6973constructorimpl(24.0f);
        float $this$dp$iv$iv2 = Dp.m6973constructorimpl(24.0f);
        ImageVector.Builder $this$_get_Settings__u24lambda_u241 = new ImageVector.Builder("Rounded.Settings", $this$dp$iv$iv, $this$dp$iv$iv2, 24.0f, 24.0f, 0, 0, false, 96, null);
        int pathFillType$iv = VectorKt.getDefaultFillType();
        Brush fill$iv$iv = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv = StrokeCap.Companion.m4719getButtKaPHkGw();
        int strokeLineJoin$iv$iv = StrokeJoin.Companion.m4729getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(19.5f, 12.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.0f, -0.23f, -0.01f, -0.45f, -0.03f, -0.68f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(1.86f, -1.41f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.4f, -0.3f, 0.51f, -0.86f, 0.26f, -1.3f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-1.87f, -3.23f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-0.25f, -0.44f, -0.79f, -0.62f, -1.25f, -0.42f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-2.15f, 0.91f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-0.37f, -0.26f, -0.76f, -0.49f, -1.17f, -0.68f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-0.29f, -2.31f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(14.8f, 2.38f, 14.37f, 2.0f, 13.87f, 2.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.horizontalLineToRelative(-3.73f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(9.63f, 2.0f, 9.2f, 2.38f, 9.14f, 2.88f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(8.85f, 5.19f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-0.41f, 0.19f, -0.8f, 0.42f, -1.17f, 0.68f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(5.53f, 4.96f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-0.46f, -0.2f, -1.0f, -0.02f, -1.25f, 0.42f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(2.41f, 8.62f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-0.25f, 0.44f, -0.14f, 0.99f, 0.26f, 1.3f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(1.86f, 1.41f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(4.51f, 11.55f, 4.5f, 11.77f, 4.5f, 12.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveToRelative(0.01f, 0.45f, 0.03f, 0.68f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-1.86f, 1.41f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-0.4f, 0.3f, -0.51f, 0.86f, -0.26f, 1.3f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(1.87f, 3.23f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.25f, 0.44f, 0.79f, 0.62f, 1.25f, 0.42f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(2.15f, -0.91f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.37f, 0.26f, 0.76f, 0.49f, 1.17f, 0.68f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(0.29f, 2.31f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(9.2f, 21.62f, 9.63f, 22.0f, 10.13f, 22.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.horizontalLineToRelative(3.73f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.5f, 0.0f, 0.93f, -0.38f, 0.99f, -0.88f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(0.29f, -2.31f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.41f, -0.19f, 0.8f, -0.42f, 1.17f, -0.68f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(2.15f, 0.91f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.46f, 0.2f, 1.0f, 0.02f, 1.25f, -0.42f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(1.87f, -3.23f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.25f, -0.44f, 0.14f, -0.99f, -0.26f, -1.3f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-1.86f, -1.41f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(19.49f, 12.45f, 19.5f, 12.23f, 19.5f, 12.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(12.04f, 15.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveTo(13.97f, 15.5f, 12.04f, 15.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        _settings = ImageVector.Builder.m5051addPathoIyEayM$default($this$_get_Settings__u24lambda_u241, $this$PathData_u24lambda_u240$iv$iv$iv.getNodes(), pathFillType$iv, "", fill$iv$iv, 1.0f, null, 1.0f, 1.0f, strokeLineCap$iv$iv, strokeLineJoin$iv$iv, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        ImageVector r1 = _settings;
        Intrinsics.checkNotNull(r1);
        return r1;
    }
}
