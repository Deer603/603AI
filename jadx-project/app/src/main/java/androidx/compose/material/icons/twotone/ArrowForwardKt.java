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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ArrowForward.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"_arrowForward", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ArrowForward", "Landroidx/compose/material/icons/Icons$TwoTone;", "getArrowForward$annotations", "(Landroidx/compose/material/icons/Icons$TwoTone;)V", "getArrowForward", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ArrowForwardKt {
    private static ImageVector _arrowForward;

    static {
    }

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.TwoTone.ArrowForward", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.TwoTone.ArrowForward", imports = {"androidx.compose.material.icons.automirrored.twotone.ArrowForward"}))
    public static /* synthetic */ void getArrowForward$annotations(Icons.TwoTone r0) {
    }

    public static final ImageVector getArrowForward(Icons.TwoTone $this$ArrowForward) {
        if (_arrowForward == null) goto L6;
        ImageVector r0 = _arrowForward;
        Intrinsics.checkNotNull(r0);
        return r0;
    L6:
        float $this$dp$iv$iv = Dp.m6973constructorimpl(24.0f);
        float $this$dp$iv$iv2 = Dp.m6973constructorimpl(24.0f);
        ImageVector.Builder $this$_get_ArrowForward__u24lambda_u241 = new ImageVector.Builder("TwoTone.ArrowForward", $this$dp$iv$iv, $this$dp$iv$iv2, 24.0f, 24.0f, 0, 0, false, 96, null);
        int pathFillType$iv = VectorKt.getDefaultFillType();
        Brush fill$iv$iv = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv = StrokeCap.Companion.m4719getButtKaPHkGw();
        int strokeLineJoin$iv$iv = StrokeJoin.Companion.m4729getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(12.0f, 4.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-1.41f, 1.41f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(16.17f, 11.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.horizontalLineTo(4.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.verticalLineToRelative(2.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.horizontalLineToRelative(12.17f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-5.58f, 5.59f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(12.0f, 20.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(8.0f, -8.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-8.0f, -8.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        _arrowForward = ImageVector.Builder.m5051addPathoIyEayM$default($this$_get_ArrowForward__u24lambda_u241, $this$PathData_u24lambda_u240$iv$iv$iv.getNodes(), pathFillType$iv, "", fill$iv$iv, 1.0f, null, 1.0f, 1.0f, strokeLineCap$iv$iv, strokeLineJoin$iv$iv, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        ImageVector r1 = _arrowForward;
        Intrinsics.checkNotNull(r1);
        return r1;
    }
}
