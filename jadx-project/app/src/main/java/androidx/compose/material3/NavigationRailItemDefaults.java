package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;

/* JADX INFO: compiled from: NavigationRail.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\tJD\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JX\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/NavigationRailItemDefaults;", "", "()V", "defaultNavigationRailItemColors", "Landroidx/compose/material3/NavigationRailItemColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultNavigationRailItemColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/NavigationRailItemColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/NavigationRailItemColors;", "selectedIconColor", "Landroidx/compose/ui/graphics/Color;", "selectedTextColor", "indicatorColor", "unselectedIconColor", "unselectedTextColor", "colors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationRailItemColors;", "disabledIconColor", "disabledTextColor", "colors-69fazGs", "(JJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationRailItemColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NavigationRailItemDefaults {
    public static final int $stable = 0;
    public static final NavigationRailItemDefaults INSTANCE = null;

    static {
        INSTANCE = new NavigationRailItemDefaults();
    }

    private NavigationRailItemDefaults() {
    }

    public final NavigationRailItemColors colors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -2014332261, "C(colors)308@13112L11:NavigationRail.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-2014332261, $changed, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:308)");
    L5:
        NavigationRailItemColors r0 = getDefaultNavigationRailItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: colors-69fazGs, reason: not valid java name */
    public final NavigationRailItemColors m2460colors69fazGs(long selectedIconColor, long selectedTextColor, long indicatorColor, long unselectedIconColor, long unselectedTextColor, long disabledIconColor, long disabledTextColor, Composer $composer, int $changed, int r38) {
        ComposerKt.sourceInformationMarkerStart($composer, -2104358508, "C(colors)P(3:c#ui.graphics.Color,4:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color)325@14138L5,326@14222L5,327@14303L5,328@14386L5,329@14474L5,333@14705L11:NavigationRail.kt#uh7d8r");
        if ((r38 & 1) == 0) goto L5;
        long selectedIconColor2 = ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveIconColor(), $composer, 6);
    L7:
        if ((r38 & 2) == 0) goto L9;
        long selectedTextColor2 = ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveLabelTextColor(), $composer, 6);
    L11:
        if ((r38 & 4) == 0) goto L13;
        long indicatorColor2 = ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveIndicatorColor(), $composer, 6);
    L15:
        if ((r38 & 8) == 0) goto L17;
        long unselectedIconColor2 = ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getInactiveIconColor(), $composer, 6);
    L19:
        if ((r38 & 16) == 0) goto L21;
        long unselectedTextColor2 = ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getInactiveLabelTextColor(), $composer, 6);
    L23:
        if ((r38 & 32) == 0) goto L25;
        long disabledIconColor2 = Color.m4365copywmQWz5c$default(unselectedIconColor2, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
    L27:
        if ((r38 & 64) == 0) goto L29;
        long disabledTextColor2 = Color.m4365copywmQWz5c$default(unselectedTextColor2, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
    L31:
        if (ComposerKt.isTraceInProgress() == false) goto L34;
        ComposerKt.traceEventStart(-2104358508, $changed, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:333)");
    L34:
        NavigationRailItemColors r1 = getDefaultNavigationRailItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m2449copy4JmcsL4(selectedIconColor2, selectedTextColor2, indicatorColor2, unselectedIconColor2, unselectedTextColor2, disabledIconColor2, disabledTextColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L37;
        ComposerKt.traceEventEnd();
    L37:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L29:
        disabledTextColor2 = disabledTextColor;
        goto L31
    L25:
        disabledIconColor2 = disabledIconColor;
        goto L27
    L21:
        unselectedTextColor2 = unselectedTextColor;
        goto L23
    L17:
        unselectedIconColor2 = unselectedIconColor;
        goto L19
    L13:
        indicatorColor2 = indicatorColor;
        goto L15
    L9:
        selectedTextColor2 = selectedTextColor;
        goto L11
    L5:
        selectedIconColor2 = selectedIconColor;
        goto L7
    }

    public final NavigationRailItemColors getDefaultNavigationRailItemColors$material3_release(ColorScheme $this$defaultNavigationRailItemColors) {
        NavigationRailItemColors it = $this$defaultNavigationRailItemColors.getDefaultNavigationRailItemColorsCached$material3_release();
        if (it != null) goto L6;
        NavigationRailItemColors it2 = new NavigationRailItemColors(ColorSchemeKt.fromToken($this$defaultNavigationRailItemColors, NavigationRailTokens.INSTANCE.getActiveIconColor()), ColorSchemeKt.fromToken($this$defaultNavigationRailItemColors, NavigationRailTokens.INSTANCE.getActiveLabelTextColor()), ColorSchemeKt.fromToken($this$defaultNavigationRailItemColors, NavigationRailTokens.INSTANCE.getActiveIndicatorColor()), ColorSchemeKt.fromToken($this$defaultNavigationRailItemColors, NavigationRailTokens.INSTANCE.getInactiveIconColor()), ColorSchemeKt.fromToken($this$defaultNavigationRailItemColors, NavigationRailTokens.INSTANCE.getInactiveLabelTextColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultNavigationRailItemColors, NavigationRailTokens.INSTANCE.getInactiveIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultNavigationRailItemColors, NavigationRailTokens.INSTANCE.getInactiveLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        $this$defaultNavigationRailItemColors.setDefaultNavigationRailItemColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use overload with disabledIconColor and disabledTextColor")
    /* JADX INFO: renamed from: colors-zjMxDiM, reason: not valid java name */
    public final /* synthetic */ NavigationRailItemColors m2461colorszjMxDiM(long selectedIconColor, long selectedTextColor, long indicatorColor, long unselectedIconColor, long unselectedTextColor, Composer $composer, int $changed, int r35) {
        ComposerKt.sourceInformationMarkerStart($composer, 1621601574, "C(colors)P(1:c#ui.graphics.Color,2:c#ui.graphics.Color,0:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color)370@16602L5,371@16686L5,372@16767L5,373@16850L5,374@16938L5:NavigationRail.kt#uh7d8r");
        if ((r35 & 1) == 0) goto L5;
        long selectedIconColor2 = ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveIconColor(), $composer, 6);
    L7:
        if ((r35 & 2) == 0) goto L9;
        long selectedTextColor2 = ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveLabelTextColor(), $composer, 6);
    L11:
        if ((r35 & 4) == 0) goto L13;
        long indicatorColor2 = ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveIndicatorColor(), $composer, 6);
    L15:
        if ((r35 & 8) == 0) goto L17;
        long unselectedIconColor2 = ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getInactiveIconColor(), $composer, 6);
    L19:
        if ((r35 & 16) == 0) goto L21;
        long unselectedTextColor2 = ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getInactiveLabelTextColor(), $composer, 6);
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L26;
        ComposerKt.traceEventStart(1621601574, $changed, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:376)");
    L26:
        NavigationRailItemColors r6 = new NavigationRailItemColors(selectedIconColor2, selectedTextColor2, indicatorColor2, unselectedIconColor2, unselectedTextColor2, Color.m4365copywmQWz5c$default(unselectedIconColor2, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(unselectedTextColor2, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (ComposerKt.isTraceInProgress() == false) goto L29;
        ComposerKt.traceEventEnd();
    L29:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r6;
    L21:
        unselectedTextColor2 = unselectedTextColor;
        goto L23
    L17:
        unselectedIconColor2 = unselectedIconColor;
        goto L19
    L13:
        indicatorColor2 = indicatorColor;
        goto L15
    L9:
        selectedTextColor2 = selectedTextColor;
        goto L11
    L5:
        selectedIconColor2 = selectedIconColor;
        goto L7
    }
}
