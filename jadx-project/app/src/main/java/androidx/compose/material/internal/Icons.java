package androidx.compose.material.internal;

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

/* JADX INFO: compiled from: Icons.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/internal/Icons;", "", "()V", "Filled", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Icons {
    public static final int $stable = 0;
    public static final Icons INSTANCE = null;

    /* JADX INFO: compiled from: Icons.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/material/internal/Icons$Filled;", "", "()V", "ArrowDropDown", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getArrowDropDown$material_release", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "_arrowDropDown", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Filled {
        public static final int $stable = 0;
        public static final Filled INSTANCE = null;
        private static ImageVector _arrowDropDown;

        static {
            INSTANCE = new Filled();
            $stable = 8;
        }

        private Filled() {
        }

        public final ImageVector getArrowDropDown$material_release() {
            if (_arrowDropDown == null) goto L6;
            ImageVector r0 = _arrowDropDown;
            Intrinsics.checkNotNull(r0);
            return r0;
        L6:
            float $this$dp$iv$iv = Dp.m6973constructorimpl(24.0f);
            float $this$dp$iv$iv2 = Dp.m6973constructorimpl(24.0f);
            ImageVector.Builder $this$_get_ArrowDropDown__u24lambda_u241 = new ImageVector.Builder("Filled.ArrowDropDown", $this$dp$iv$iv, $this$dp$iv$iv2, 24.0f, 24.0f, 0, 0, false, 224, null);
            int pathFillType$iv = VectorKt.getDefaultFillType();
            Brush fill$iv$iv = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
            int strokeLineCap$iv$iv = StrokeCap.Companion.m4719getButtKaPHkGw();
            int strokeLineJoin$iv$iv = StrokeJoin.Companion.m4729getBevelLxFBmk8();
            PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv = new PathBuilder();
            $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(7.0f, 10.0f);
            $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(5.0f, 5.0f);
            $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(5.0f, -5.0f);
            $this$PathData_u24lambda_u240$iv$iv$iv.close();
            _arrowDropDown = ImageVector.Builder.m5051addPathoIyEayM$default($this$_get_ArrowDropDown__u24lambda_u241, $this$PathData_u24lambda_u240$iv$iv$iv.getNodes(), pathFillType$iv, "", fill$iv$iv, 1.0f, null, 1.0f, 1.0f, strokeLineCap$iv$iv, strokeLineJoin$iv$iv, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
            ImageVector r1 = _arrowDropDown;
            Intrinsics.checkNotNull(r1);
            return r1;
        }
    }

    static {
        INSTANCE = new Icons();
    }

    private Icons() {
    }
}
