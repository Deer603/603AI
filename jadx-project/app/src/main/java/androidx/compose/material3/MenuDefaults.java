package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.MenuTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u001b\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010\u001cJN\u0010\u001b\u001a\u00020\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010 \u001a\u00020\u000f2\b\b\u0002\u0010!\u001a\u00020\u000f2\b\b\u0002\u0010\"\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0019\u0010\f\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0017\u0010\u000e\u001a\u00020\u000f8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u00020\u0017*\u00020\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/material3/MenuDefaults;", "", "()V", "DropdownMenuItemContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getDropdownMenuItemContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ShadowElevation", "Landroidx/compose/ui/unit/Dp;", "getShadowElevation-D9Ej5fM", "()F", "F", "TonalElevation", "getTonalElevation-D9Ej5fM", "containerColor", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "defaultMenuItemColors", "Landroidx/compose/material3/MenuItemColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultMenuItemColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/MenuItemColors;", "itemColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/MenuItemColors;", "textColor", "leadingIconColor", "trailingIconColor", "disabledTextColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "itemColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/MenuItemColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MenuDefaults {
    public static final int $stable = 0;
    private static final PaddingValues DropdownMenuItemContentPadding = null;
    public static final MenuDefaults INSTANCE = null;
    private static final float ShadowElevation = 0.0f;
    private static final float TonalElevation = 0.0f;

    private MenuDefaults() {
    }

    static {
        INSTANCE = new MenuDefaults();
        TonalElevation = ElevationTokens.INSTANCE.m3299getLevel0D9Ej5fM();
        ShadowElevation = MenuTokens.INSTANCE.m3443getContainerElevationD9Ej5fM();
        DropdownMenuItemContentPadding = PaddingKt.m719PaddingValuesYgX7TsA(MenuKt.access$getDropdownMenuItemHorizontalPadding$p(), Dp.m6973constructorimpl(0));
    }

    /* JADX INFO: renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name */
    public final float m2355getTonalElevationD9Ej5fM() {
        return TonalElevation;
    }

    /* JADX INFO: renamed from: getShadowElevation-D9Ej5fM, reason: not valid java name */
    public final float m2354getShadowElevationD9Ej5fM() {
        return ShadowElevation;
    }

    public final Shape getShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 218702739, "C194@9499L5:Menu.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(218702739, $changed, -1, "androidx.compose.material3.MenuDefaults.<get-shape> (Menu.kt:194)");
    L5:
        Shape r0 = ShapesKt.getValue(MenuTokens.INSTANCE.getContainerShape(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final long getContainerColor(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1787427929, "C198@9634L5:Menu.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1787427929, $changed, -1, "androidx.compose.material3.MenuDefaults.<get-containerColor> (Menu.kt:198)");
    L5:
        long r0 = ColorSchemeKt.getValue(MenuTokens.INSTANCE.getContainerColor(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final MenuItemColors itemColors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1326531516, "C(itemColors)204@9833L11:Menu.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1326531516, $changed, -1, "androidx.compose.material3.MenuDefaults.itemColors (Menu.kt:204)");
    L5:
        MenuItemColors r0 = getDefaultMenuItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: itemColors-5tl4gsc, reason: not valid java name */
    public final MenuItemColors m2356itemColors5tl4gsc(long textColor, long leadingIconColor, long trailingIconColor, long disabledTextColor, long disabledLeadingIconColor, long disabledTrailingIconColor, Composer $composer, int $changed, int r32) {
        ComposerKt.sourceInformationMarkerStart($composer, -1278543580, "C(itemColors)P(4:c#ui.graphics.Color,3:c#ui.graphics.Color,5:c#ui.graphics.Color,1:c#ui.graphics.Color,0:c#ui.graphics.Color,2:c#ui.graphics.Color)229@11073L11:Menu.kt#uh7d8r");
        if ((r32 & 1) == 0) goto L5;
        long textColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r32 & 2) == 0) goto L9;
        long leadingIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L11:
        if ((r32 & 4) == 0) goto L13;
        long trailingIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r32 & 8) == 0) goto L17;
        long disabledTextColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if ((r32 & 16) == 0) goto L21;
        long disabledLeadingIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L23:
        if ((r32 & 32) == 0) goto L25;
        long disabledTrailingIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L27:
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventStart(-1278543580, $changed, -1, "androidx.compose.material3.MenuDefaults.itemColors (Menu.kt:229)");
    L30:
        MenuItemColors r1 = getDefaultMenuItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m2358copytNS2XkQ(textColor2, leadingIconColor2, trailingIconColor2, disabledTextColor2, disabledLeadingIconColor2, disabledTrailingIconColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventEnd();
    L33:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L25:
        disabledTrailingIconColor2 = disabledTrailingIconColor;
        goto L27
    L21:
        disabledLeadingIconColor2 = disabledLeadingIconColor;
        goto L23
    L17:
        disabledTextColor2 = disabledTextColor;
        goto L19
    L13:
        trailingIconColor2 = trailingIconColor;
        goto L15
    L9:
        leadingIconColor2 = leadingIconColor;
        goto L11
    L5:
        textColor2 = textColor;
        goto L7
    }

    public final MenuItemColors getDefaultMenuItemColors$material3_release(ColorScheme $this$defaultMenuItemColors) {
        MenuItemColors it = $this$defaultMenuItemColors.getDefaultMenuItemColorsCached$material3_release();
        if (it != null) goto L6;
        MenuItemColors it2 = new MenuItemColors(ColorSchemeKt.fromToken($this$defaultMenuItemColors, ListTokens.INSTANCE.getListItemLabelTextColor()), ColorSchemeKt.fromToken($this$defaultMenuItemColors, ListTokens.INSTANCE.getListItemLeadingIconColor()), ColorSchemeKt.fromToken($this$defaultMenuItemColors, ListTokens.INSTANCE.getListItemTrailingIconColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultMenuItemColors, ListTokens.INSTANCE.getListItemDisabledLabelTextColor()), ListTokens.INSTANCE.getListItemDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultMenuItemColors, ListTokens.INSTANCE.getListItemDisabledLeadingIconColor()), ListTokens.INSTANCE.getListItemDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultMenuItemColors, ListTokens.INSTANCE.getListItemDisabledTrailingIconColor()), ListTokens.INSTANCE.getListItemDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        $this$defaultMenuItemColors.setDefaultMenuItemColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    public final PaddingValues getDropdownMenuItemContentPadding() {
        return DropdownMenuItemContentPadding;
    }
}
