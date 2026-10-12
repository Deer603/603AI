package androidx.compose.material.icons;

import androidx.autofill.HintConstants;
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
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Icons.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0087\b\u001a4\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0086\b\u001aN\u0010\u000e\u001a\u00020\n*\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\t¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"MaterialIconDimension", "", "getMaterialIconDimension$annotations", "()V", "materialIcon", "Landroidx/compose/ui/graphics/vector/ImageVector;", HintConstants.AUTOFILL_HINT_NAME, "", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "Lkotlin/ExtensionFunctionType;", "autoMirror", "", "materialPath", "fillAlpha", "strokeAlpha", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "pathBuilder", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "materialPath-YwgOQQI", "(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;FFILkotlin/jvm/functions/Function1;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IconsKt {
    public static final float MaterialIconDimension = 24.0f;

    public static /* synthetic */ void getMaterialIconDimension$annotations() {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with autoMirror instead.")
    public static final /* synthetic */ ImageVector materialIcon(String name, Function1<? super ImageVector.Builder, ImageVector.Builder> r15) {
        return r15.invoke(new ImageVector.Builder(name, Dp.m6973constructorimpl(24.0f), Dp.m6973constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, 96, null)).build();
    }

    public static /* synthetic */ ImageVector materialIcon$default(String name, boolean autoMirror, Function1 block, int r15, Object r16) {
        if ((r15 & 2) == 0) goto L5;
        boolean autoMirror2 = false;
    L7:
        return ((ImageVector.Builder) block.invoke(new ImageVector.Builder(name, Dp.m6973constructorimpl(24.0f), Dp.m6973constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, autoMirror2, 96, null))).build();
    L5:
        autoMirror2 = autoMirror;
        goto L7
    }

    public static final ImageVector materialIcon(String name, boolean autoMirror, Function1<? super ImageVector.Builder, ImageVector.Builder> r15) {
        return r15.invoke(new ImageVector.Builder(name, Dp.m6973constructorimpl(24.0f), Dp.m6973constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, autoMirror, 96, null)).build();
    }

    /* JADX INFO: renamed from: materialPath-YwgOQQI$default, reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m1847materialPathYwgOQQI$default(ImageVector.Builder $this$materialPath_u2dYwgOQQI_u24default, float fillAlpha, float strokeAlpha, int pathFillType, Function1 pathBuilder, int r24, Object r25) {
        if ((r24 & 1) == 0) goto L5;
        float fillAlpha2 = 1.0f;
    L7:
        if ((r24 & 2) == 0) goto L9;
        float strokeAlpha2 = 1.0f;
    L11:
        if ((r24 & 4) == 0) goto L13;
        int pathFillType2 = VectorKt.getDefaultFillType();
    L14:
        Brush fill$iv = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
        int strokeLineCap$iv = StrokeCap.Companion.m4719getButtKaPHkGw();
        int strokeLineJoin$iv = StrokeJoin.Companion.m4729getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv = new PathBuilder();
        pathBuilder.invoke($this$PathData_u24lambda_u240$iv$iv);
        return ImageVector.Builder.m5051addPathoIyEayM$default($this$materialPath_u2dYwgOQQI_u24default, $this$PathData_u24lambda_u240$iv$iv.getNodes(), pathFillType2, "", fill$iv, fillAlpha2, null, strokeAlpha2, 1.0f, strokeLineCap$iv, strokeLineJoin$iv, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    L13:
        pathFillType2 = pathFillType;
        goto L14
    L9:
        strokeAlpha2 = strokeAlpha;
        goto L11
    L5:
        fillAlpha2 = fillAlpha;
        goto L7
    }

    /* JADX INFO: renamed from: materialPath-YwgOQQI, reason: not valid java name */
    public static final ImageVector.Builder m1846materialPathYwgOQQI(ImageVector.Builder $this$materialPath_u2dYwgOQQI, float fillAlpha, float strokeAlpha, int pathFillType, Function1<? super PathBuilder, Unit> r26) {
        Brush fill$iv = new SolidColor(Color.Companion.m4392getBlack0d7_KjU(), null);
        int strokeLineCap$iv = StrokeCap.Companion.m4719getButtKaPHkGw();
        int strokeLineJoin$iv = StrokeJoin.Companion.m4729getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv = new PathBuilder();
        r26.invoke($this$PathData_u24lambda_u240$iv$iv);
        return ImageVector.Builder.m5051addPathoIyEayM$default($this$materialPath_u2dYwgOQQI, $this$PathData_u24lambda_u240$iv$iv.getNodes(), pathFillType, "", fill$iv, fillAlpha, null, strokeAlpha, 1.0f, strokeLineCap$iv, strokeLineJoin$iv, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    }
}
