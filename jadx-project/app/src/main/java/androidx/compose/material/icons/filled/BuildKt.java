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

/* JADX INFO: compiled from: Build.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_build", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Build", "Landroidx/compose/material/icons/Icons$Filled;", "getBuild", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BuildKt {
    private static ImageVector _build;

    static {
    }

    public static final ImageVector getBuild(Icons.Filled $this$Build) {
        if (_build == null) goto L6;
        ImageVector r0 = _build;
        Intrinsics.checkNotNull(r0);
        return r0;
    L6:
        float $this$dp$iv$iv = Dp.m6973constructorimpl(24.0f);
        float $this$dp$iv$iv2 = Dp.m6973constructorimpl(24.0f);
        ImageVector.Builder $this$_get_Build__u24lambda_u241 = new ImageVector.Builder("Filled.Build", $this$dp$iv$iv, $this$dp$iv$iv2, 24.0f, 24.0f, 0, 0, false, 96, null);
        int pathFillType$iv = VectorKt.getDefaultFillType();
        Brush fill$iv$iv = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv = StrokeCap.Companion.m4719getButtKaPHkGw();
        int strokeLineJoin$iv$iv = StrokeJoin.Companion.m4729getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(22.7f, 19.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-9.1f, -9.1f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.9f, -2.3f, 0.4f, -5.0f, -1.5f, -6.9f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-2.0f, -2.0f, -5.0f, -2.4f, -7.4f, -1.3f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(9.0f, 6.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(6.0f, 9.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(1.6f, 4.7f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(0.4f, 7.1f, 0.9f, 10.1f, 2.9f, 12.1f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(1.9f, 1.9f, 4.6f, 2.4f, 6.9f, 1.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(9.1f, 9.1f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.4f, 0.4f, 1.0f, 0.4f, 1.4f, 0.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(2.3f, -2.3f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.5f, -0.4f, 0.5f, -1.1f, 0.1f, -1.4f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        _build = ImageVector.Builder.m5051addPathoIyEayM$default($this$_get_Build__u24lambda_u241, $this$PathData_u24lambda_u240$iv$iv$iv.getNodes(), pathFillType$iv, "", fill$iv$iv, 1.0f, null, 1.0f, 1.0f, strokeLineCap$iv$iv, strokeLineJoin$iv$iv, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        ImageVector r1 = _build;
        Intrinsics.checkNotNull(r1);
        return r1;
    }
}
