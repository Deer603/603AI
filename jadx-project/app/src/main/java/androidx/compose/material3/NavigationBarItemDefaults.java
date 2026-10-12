package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;

/* JADX INFO: compiled from: NavigationBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\tJD\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JX\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/NavigationBarItemDefaults;", "", "()V", "defaultNavigationBarItemColors", "Landroidx/compose/material3/NavigationBarItemColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultNavigationBarItemColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/NavigationBarItemColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/NavigationBarItemColors;", "selectedIconColor", "Landroidx/compose/ui/graphics/Color;", "selectedTextColor", "indicatorColor", "unselectedIconColor", "unselectedTextColor", "colors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationBarItemColors;", "disabledIconColor", "disabledTextColor", "colors-69fazGs", "(JJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationBarItemColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NavigationBarItemDefaults {
    public static final int $stable = 0;
    public static final NavigationBarItemDefaults INSTANCE = null;

    static {
        INSTANCE = new NavigationBarItemDefaults();
    }

    private NavigationBarItemDefaults() {
    }

    public final NavigationBarItemColors colors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1018883954, "C(colors)310@13425L11:NavigationBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1018883954, $changed, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:310)");
    L5:
        NavigationBarItemColors r0 = getDefaultNavigationBarItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: colors-69fazGs, reason: not valid java name */
    public final NavigationBarItemColors m2398colors69fazGs(long selectedIconColor, long selectedTextColor, long indicatorColor, long unselectedIconColor, long unselectedTextColor, long disabledIconColor, long disabledTextColor, Composer $composer, int $changed, int r36) {
        ComposerKt.sourceInformationMarkerStart($composer, -1618564327, "C(colors)P(3:c#ui.graphics.Color,4:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color)335@14809L11:NavigationBar.kt#uh7d8r");
        if ((r36 & 1) == 0) goto L5;
        long selectedIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r36 & 2) == 0) goto L9;
        long selectedTextColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L11:
        if ((r36 & 4) == 0) goto L13;
        long indicatorColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r36 & 8) == 0) goto L17;
        long unselectedIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if ((r36 & 16) == 0) goto L21;
        long unselectedTextColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L23:
        if ((r36 & 32) == 0) goto L25;
        long disabledIconColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L27:
        if ((r36 & 64) == 0) goto L29;
        long disabledTextColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L31:
        if (ComposerKt.isTraceInProgress() == false) goto L34;
        ComposerKt.traceEventStart(-1618564327, $changed, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:335)");
    L34:
        NavigationBarItemColors r1 = getDefaultNavigationBarItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m2387copy4JmcsL4(selectedIconColor2, selectedTextColor2, indicatorColor2, unselectedIconColor2, unselectedTextColor2, disabledIconColor2, disabledTextColor2);
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

    public final NavigationBarItemColors getDefaultNavigationBarItemColors$material3_release(ColorScheme $this$defaultNavigationBarItemColors) {
        NavigationBarItemColors it = $this$defaultNavigationBarItemColors.getDefaultNavigationBarItemColorsCached$material3_release();
        if (it != null) goto L6;
        NavigationBarItemColors it2 = new NavigationBarItemColors(ColorSchemeKt.fromToken($this$defaultNavigationBarItemColors, NavigationBarTokens.INSTANCE.getActiveIconColor()), ColorSchemeKt.fromToken($this$defaultNavigationBarItemColors, NavigationBarTokens.INSTANCE.getActiveLabelTextColor()), ColorSchemeKt.fromToken($this$defaultNavigationBarItemColors, NavigationBarTokens.INSTANCE.getActiveIndicatorColor()), ColorSchemeKt.fromToken($this$defaultNavigationBarItemColors, NavigationBarTokens.INSTANCE.getInactiveIconColor()), ColorSchemeKt.fromToken($this$defaultNavigationBarItemColors, NavigationBarTokens.INSTANCE.getInactiveLabelTextColor()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultNavigationBarItemColors, NavigationBarTokens.INSTANCE.getInactiveIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultNavigationBarItemColors, NavigationBarTokens.INSTANCE.getInactiveLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        $this$defaultNavigationBarItemColors.setDefaultNavigationBarItemColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use overload with disabledIconColor and disabledTextColor")
    /* JADX INFO: renamed from: colors-zjMxDiM, reason: not valid java name */
    public final /* synthetic */ NavigationBarItemColors m2399colorszjMxDiM(long selectedIconColor, long selectedTextColor, long indicatorColor, long unselectedIconColor, long unselectedTextColor, Composer $composer, int $changed, int r35) {
        ComposerKt.sourceInformationMarkerStart($composer, -213647161, "C(colors)P(1:c#ui.graphics.Color,2:c#ui.graphics.Color,0:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color)371@16664L5,372@16747L5,373@16827L5,374@16909L5,375@16996L5:NavigationBar.kt#uh7d8r");
        if ((r35 & 1) == 0) goto L5;
        long selectedIconColor2 = ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getActiveIconColor(), $composer, 6);
    L7:
        if ((r35 & 2) == 0) goto L9;
        long selectedTextColor2 = ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getActiveLabelTextColor(), $composer, 6);
    L11:
        if ((r35 & 4) == 0) goto L13;
        long indicatorColor2 = ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getActiveIndicatorColor(), $composer, 6);
    L15:
        if ((r35 & 8) == 0) goto L17;
        long unselectedIconColor2 = ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getInactiveIconColor(), $composer, 6);
    L19:
        if ((r35 & 16) == 0) goto L21;
        long unselectedTextColor2 = ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getInactiveLabelTextColor(), $composer, 6);
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L26;
        ComposerKt.traceEventStart(-213647161, $changed, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:377)");
    L26:
        NavigationBarItemColors r6 = new NavigationBarItemColors(selectedIconColor2, selectedTextColor2, indicatorColor2, unselectedIconColor2, unselectedTextColor2, Color.m4365copywmQWz5c$default(unselectedIconColor2, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(unselectedTextColor2, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
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
