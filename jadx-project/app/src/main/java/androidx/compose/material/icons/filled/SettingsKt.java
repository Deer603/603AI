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

/* JADX INFO: compiled from: Settings.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_settings", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Settings", "Landroidx/compose/material/icons/Icons$Filled;", "getSettings", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SettingsKt {
    private static ImageVector _settings;

    static {
    }

    public static final ImageVector getSettings(Icons.Filled $this$Settings) {
        if (_settings == null) goto L6;
        ImageVector r0 = _settings;
        Intrinsics.checkNotNull(r0);
        return r0;
    L6:
        float $this$dp$iv$iv = Dp.m6973constructorimpl(24.0f);
        float $this$dp$iv$iv2 = Dp.m6973constructorimpl(24.0f);
        ImageVector.Builder $this$_get_Settings__u24lambda_u241 = new ImageVector.Builder("Filled.Settings", $this$dp$iv$iv, $this$dp$iv$iv2, 24.0f, 24.0f, 0, 0, false, 96, null);
        int pathFillType$iv = VectorKt.getDefaultFillType();
        Brush fill$iv$iv = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv = StrokeCap.Companion.m4719getButtKaPHkGw();
        int strokeLineJoin$iv$iv = StrokeJoin.Companion.m4729getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(19.14f, 12.94f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.0f, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(2.03f, -1.58f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-1.92f, -3.32f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-2.39f, 0.96f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(14.4f, 2.81f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
        $this$PathData_u24lambda_u240$iv$iv$iv.horizontalLineToRelative(-3.84f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-0.24f, 0.0f, -0.43f, 0.17f, -0.47f, 0.41f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(9.25f, 5.35f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(5.24f, 5.33f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-0.22f, -0.08f, -0.47f, 0.0f, -0.59f, 0.22f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(2.74f, 8.87f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(2.03f, 1.58f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveToRelative(0.02f, 0.64f, 0.07f, 0.94f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-2.03f, 1.58f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(1.92f, 3.32f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(2.39f, -0.96f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(0.36f, 2.54f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
        $this$PathData_u24lambda_u240$iv$iv$iv.horizontalLineToRelative(3.84f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.24f, 0.0f, 0.44f, -0.17f, 0.47f, -0.41f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(0.36f, -2.54f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(2.39f, 0.96f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.22f, 0.08f, 0.47f, 0.0f, 0.59f, -0.22f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(1.92f, -3.32f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(19.14f, 12.94f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(12.0f, 15.6f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-1.98f, 0.0f, -3.6f, -1.62f, -3.6f, -3.6f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveToRelative(1.62f, -3.6f, 3.6f, -3.6f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveToRelative(3.6f, 1.62f, 3.6f, 3.6f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveTo(13.98f, 15.6f, 12.0f, 15.6f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        _settings = ImageVector.Builder.m5051addPathoIyEayM$default($this$_get_Settings__u24lambda_u241, $this$PathData_u24lambda_u240$iv$iv$iv.getNodes(), pathFillType$iv, "", fill$iv$iv, 1.0f, null, 1.0f, 1.0f, strokeLineCap$iv$iv, strokeLineJoin$iv$iv, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        ImageVector r1 = _settings;
        Intrinsics.checkNotNull(r1);
        return r1;
    }
}
