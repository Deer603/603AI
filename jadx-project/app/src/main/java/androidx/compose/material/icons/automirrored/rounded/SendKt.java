package androidx.compose.material.icons.automirrored.rounded;

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

/* JADX INFO: compiled from: Send.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_send", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Send", "Landroidx/compose/material/icons/Icons$AutoMirrored$Rounded;", "getSend", "(Landroidx/compose/material/icons/Icons$AutoMirrored$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SendKt {
    private static ImageVector _send;

    static {
    }

    public static final ImageVector getSend(Icons.AutoMirrored.Rounded $this$Send) {
        if (_send == null) goto L6;
        ImageVector r0 = _send;
        Intrinsics.checkNotNull(r0);
        return r0;
    L6:
        float $this$dp$iv$iv = Dp.m6973constructorimpl(24.0f);
        float $this$dp$iv$iv2 = Dp.m6973constructorimpl(24.0f);
        ImageVector.Builder $this$_get_Send__u24lambda_u241 = new ImageVector.Builder("AutoMirrored.Rounded.Send", $this$dp$iv$iv, $this$dp$iv$iv2, 24.0f, 24.0f, 0, 0, true, 96, null);
        int pathFillType$iv = VectorKt.getDefaultFillType();
        Brush fill$iv$iv = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv = StrokeCap.Companion.m4719getButtKaPHkGw();
        int strokeLineJoin$iv$iv = StrokeJoin.Companion.m4729getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(3.4f, 20.4f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(17.45f, -7.48f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.81f, -0.35f, 0.81f, -1.49f, 0.0f, -1.84f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(3.4f, 3.6f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-0.66f, -0.29f, -1.39f, 0.2f, -1.39f, 0.91f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(2.0f, 9.12f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.0f, 0.5f, 0.37f, 0.93f, 0.87f, 0.99f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(17.0f, 12.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(2.87f, 13.88f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-0.5f, 0.07f, -0.87f, 0.5f, -0.87f, 1.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(0.01f, 4.61f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.0f, 0.71f, 0.73f, 1.2f, 1.39f, 0.91f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        _send = ImageVector.Builder.m5051addPathoIyEayM$default($this$_get_Send__u24lambda_u241, $this$PathData_u24lambda_u240$iv$iv$iv.getNodes(), pathFillType$iv, "", fill$iv$iv, 1.0f, null, 1.0f, 1.0f, strokeLineCap$iv$iv, strokeLineJoin$iv$iv, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        ImageVector r1 = _send;
        Intrinsics.checkNotNull(r1);
        return r1;
    }
}
