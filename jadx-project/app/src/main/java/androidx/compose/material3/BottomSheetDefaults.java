package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.ScrimTokens;
import androidx.compose.material3.tokens.SheetBottomTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: SheetDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JD\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\r2\b\b\u0002\u0010#\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006R\u0019\u0010\u0014\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0016\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0017\u0010\nR\u0011\u0010\u0018\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/material3/BottomSheetDefaults;", "", "()V", "ContainerColor", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "Elevation", "Landroidx/compose/ui/unit/Dp;", "getElevation-D9Ej5fM", "()F", "F", "ExpandedShape", "Landroidx/compose/ui/graphics/Shape;", "getExpandedShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "HiddenShape", "getHiddenShape", "ScrimColor", "getScrimColor", "SheetMaxWidth", "getSheetMaxWidth-D9Ej5fM", "SheetPeekHeight", "getSheetPeekHeight-D9Ej5fM", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "DragHandle", "", "modifier", "Landroidx/compose/ui/Modifier;", "width", "height", "shape", "color", "DragHandle-lgZ2HuY", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;JLandroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BottomSheetDefaults {
    public static final int $stable = 0;
    private static final float Elevation = 0.0f;
    public static final BottomSheetDefaults INSTANCE = null;
    private static final float SheetMaxWidth = 0.0f;
    private static final float SheetPeekHeight = 0.0f;

    private BottomSheetDefaults() {
    }

    public final Shape getHiddenShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1971658024, "C291@11425L5:SheetDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1971658024, $changed, -1, "androidx.compose.material3.BottomSheetDefaults.<get-HiddenShape> (SheetDefaults.kt:291)");
    L5:
        Shape r0 = ShapesKt.getValue(SheetBottomTokens.INSTANCE.getDockedMinimizedContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final Shape getExpandedShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1683783414, "C295@11623L5:SheetDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1683783414, $changed, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ExpandedShape> (SheetDefaults.kt:295)");
    L5:
        Shape r0 = ShapesKt.getValue(SheetBottomTokens.INSTANCE.getDockedContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final long getContainerColor(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 433375448, "C299@11786L5:SheetDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(433375448, $changed, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ContainerColor> (SheetDefaults.kt:299)");
    L5:
        long r0 = ColorSchemeKt.getValue(SheetBottomTokens.INSTANCE.getDockedContainerColor(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    static {
        INSTANCE = new BottomSheetDefaults();
        Elevation = SheetBottomTokens.INSTANCE.m3610getDockedModalContainerElevationD9Ej5fM();
        SheetPeekHeight = Dp.m6973constructorimpl(56);
        SheetMaxWidth = Dp.m6973constructorimpl(640);
    }

    /* JADX INFO: renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m1919getElevationD9Ej5fM() {
        return Elevation;
    }

    public final long getScrimColor(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -2040719176, "C306@12070L5:SheetDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-2040719176, $changed, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ScrimColor> (SheetDefaults.kt:306)");
    L5:
        long r0 = Color.m4365copywmQWz5c$default(ColorSchemeKt.getValue(ScrimTokens.INSTANCE.getContainerColor(), $composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: getSheetPeekHeight-D9Ej5fM, reason: not valid java name */
    public final float m1921getSheetPeekHeightD9Ej5fM() {
        return SheetPeekHeight;
    }

    /* JADX INFO: renamed from: getSheetMaxWidth-D9Ej5fM, reason: not valid java name */
    public final float m1920getSheetMaxWidthD9Ej5fM() {
        return SheetMaxWidth;
    }

    public final WindowInsets getWindowInsets(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -511309409, "C316@12492L11:SheetDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-511309409, $changed, -1, "androidx.compose.material3.BottomSheetDefaults.<get-windowInsets> (SheetDefaults.kt:316)");
    L5:
        WindowInsets r0 = WindowInsetsKt.m798onlybOOhFvg(WindowInsets_androidKt.getSafeDrawing(WindowInsets.Companion, $composer, 6), WindowInsetsSides.Companion.m818getBottomJoeWqyM());
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: DragHandle-lgZ2HuY, reason: not valid java name */
    public final void m1918DragHandlelgZ2HuY(Modifier modifier, float width, float height, Shape shape, long color, Composer $composer, final int $changed, final int r31) {
        Composer $composer2 = $composer.startRestartGroup(-1364277227);
        ComposerKt.sourceInformation($composer2, "C(DragHandle)P(2,4:c#ui.unit.Dp,1:c#ui.unit.Dp,3,0:c#ui.graphics.Color)324@12873L6,325@12955L5,327@13006L51,330@13179L82,335@13326L74,328@13066L334:SheetDefaults.kt#uh7d8r");
        int $dirty = $changed;
        int r3 = r31 & 1;
        if (r3 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r4 = modifier;
    L13:
        int r5 = r31 & 2;
        if (r5 == 0) goto L17;
        $dirty = $dirty | 48;
        final float width2 = width;
    L24:
        int r7 = r31 & 4;
        if (r7 == 0) goto L28;
        $dirty = $dirty | 384;
        float height2 = height;
    L36:
        if (($changed & 3072) == 0) goto L38;
        Shape shape2 = shape;
    L47:
        if (($changed & 24576) == 0) goto L49;
        long color2 = color;
    L58:
        if (($dirty & 9363) == 9362) goto L60;
    L63:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L66;
    L75:
        if (r3 == 0) goto L77;
        Modifier.Companion modifier2 = Modifier.Companion;
    L78:
        if (r5 == 0) goto L80;
        width2 = SheetBottomTokens.INSTANCE.m3609getDockedDragHandleWidthD9Ej5fM();
    L80:
        if (r7 == 0) goto L83;
        height2 = SheetBottomTokens.INSTANCE.m3608getDockedDragHandleHeightD9Ej5fM();
    L83:
        if ((r31 & 8) == 0) goto L86;
        $dirty = $dirty & (-7169);
        shape2 = MaterialTheme.INSTANCE.getShapes($composer2, 6).getExtraLarge();
    L86:
        if ((r31 & 16) == 0) goto L88;
        color2 = ColorSchemeKt.getValue(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), $composer2, 6);
        int $dirty2 = $dirty & (-57345);
        final float height3 = height2;
    L89:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L92;
        ComposerKt.traceEventStart(-1364277227, $dirty2, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:326)");
    L92:
        Strings.Companion r0 = Strings.Companion;
        final String dragHandleDescription = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_bottom_sheet_drag_handle_description), $composer2, 0);
        Modifier r8 = PaddingKt.m727paddingVpY3zN4$default(modifier2, 0.0f, SheetDefaultsKt.access$getDragHandleVerticalPadding$p(), 1, null);
        ComposerKt.sourceInformationMarkerStart($composer2, 1620989881, "CC(remember):SheetDefaults.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(dragHandleDescription);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L95;
    L98:
        Object value$iv = (Function1) new BottomSheetDefaults$DragHandle$1$1(dragHandleDescription);
        $composer2.updateRememberedValue(value$iv);
    L99:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Composer $composer3 = $composer2;
        SurfaceKt.m2670SurfaceT9BRK9s(SemanticsModifierKt.semantics$default(r8, false, (Function1) value$iv, 1, null), shape2, color2, 0, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1039573072, true, new BottomSheetDefaults$DragHandle$2(width2, height3), $composer2, 54), $composer3, ((($dirty2 >> 6) & 112) | 12582912) | (($dirty2 >> 6) & 896), 120);
        if (ComposerKt.isTraceInProgress() == false) goto L102;
        ComposerKt.traceEventEnd();
    L102:
        final Shape shape3 = shape2;
        final float height4 = height3;
        final Modifier modifier3 = modifier2;
        final float width3 = width2;
        final long color3 = color2;
    L103:
        ScopeUpdateScope r11 = $composer3.endRestartGroup();
        if (r11 == null) goto L107;
        r11.updateScope(new BottomSheetDefaults$DragHandle$3(this, modifier3, width3, height4, shape3, color3, $changed, r31));
        return;
    L107:
        return;
    L95:
        if (it$iv == Composer.Companion.getEmpty()) goto L98;
        value$iv = it$iv;
        goto L99
    L88:
        $dirty2 = $dirty;
        height3 = height2;
        goto L89
    L77:
        modifier2 = r4;
        goto L78
    L66:
        if ($composer2.getDefaultsInvalid() == true) goto L75;
        $composer2.skipToGroupEnd();
        if ((r31 & 8) == 0) goto L72;
        $dirty = $dirty & (-7169);
    L72:
        if ((r31 & 16) == 0) goto L74;
        modifier2 = r4;
        $dirty2 = $dirty & (-57345);
        height3 = height2;
        goto L89
    L74:
        modifier2 = r4;
        $dirty2 = $dirty;
        height3 = height2;
        goto L89
    L60:
        if ($composer2.getSkipping() == false) goto L63;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        shape3 = shape2;
        modifier3 = r4;
        height4 = height2;
        width3 = width2;
        color3 = color2;
        goto L103
    L49:
        if ((r31 & 16) != 0) goto L53;
        color2 = color;
        if ($composer2.changed(color2) == false) goto L54;
        int r13 = 16384;
    L55:
        $dirty = $dirty | r13;
    L54:
        r13 = 8192;
        goto L55
    L53:
        color2 = color;
        goto L54
    L38:
        if ((r31 & 8) != 0) goto L42;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L43;
        int r12 = 2048;
    L44:
        $dirty = $dirty | r12;
    L43:
        r12 = 1024;
        goto L44
    L42:
        shape2 = shape;
        goto L43
    L28:
        if (($changed & 384) != 0) goto L34;
        height2 = height;
        if ($composer2.changed(height2) == false) goto L32;
        int r10 = 256;
    L33:
        $dirty = $dirty | r10;
        goto L36
    L32:
        r10 = 128;
        goto L33
    L34:
        height2 = height;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        width2 = width;
        if ($composer2.changed(width2) == false) goto L21;
        int r9 = 32;
    L22:
        $dirty = $dirty | r9;
        goto L24
    L21:
        r9 = 16;
        goto L22
    L23:
        width2 = width;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L10;
        int r6 = 4;
    L11:
        $dirty = $dirty | r6;
        goto L13
    L10:
        r6 = 2;
        goto L11
    L12:
        r4 = modifier;
        goto L13
    }
}
