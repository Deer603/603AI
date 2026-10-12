package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

/* JADX INFO: compiled from: ExpressiveNavigationBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\tR\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/material3/ExpressiveNavigationBarItemDefaults;", "", "()V", "defaultExpressiveNavigationBarItemColors", "Landroidx/compose/material3/NavigationItemColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultExpressiveNavigationBarItemColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/NavigationItemColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/NavigationItemColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExpressiveNavigationBarItemDefaults {
    public static final int $stable = 0;
    public static final ExpressiveNavigationBarItemDefaults INSTANCE = null;

    static {
        INSTANCE = new ExpressiveNavigationBarItemDefaults();
    }

    private ExpressiveNavigationBarItemDefaults() {
    }

    public final NavigationItemColors colors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1959617551, "C(colors)272@11438L11:ExpressiveNavigationBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1959617551, $changed, -1, "androidx.compose.material3.ExpressiveNavigationBarItemDefaults.colors (ExpressiveNavigationBar.kt:272)");
    L5:
        NavigationItemColors r0 = getDefaultExpressiveNavigationBarItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final NavigationItemColors getDefaultExpressiveNavigationBarItemColors$material3_release(ColorScheme $this$defaultExpressiveNavigationBarItemColors) {
        NavigationItemColors it = $this$defaultExpressiveNavigationBarItemColors.getDefaultExpressiveNavigationBarItemColorsCached$material3_release();
        if (it != null) goto L6;
        NavigationItemColors it2 = new NavigationItemColors(ColorSchemeKt.fromToken($this$defaultExpressiveNavigationBarItemColors, ExpressiveNavigationBarKt.access$getActiveIconColor$p()), ColorSchemeKt.fromToken($this$defaultExpressiveNavigationBarItemColors, ExpressiveNavigationBarKt.access$getActiveLabelTextColor$p()), ColorSchemeKt.fromToken($this$defaultExpressiveNavigationBarItemColors, ExpressiveNavigationBarKt.access$getActiveIndicatorColor$p()), ColorSchemeKt.fromToken($this$defaultExpressiveNavigationBarItemColors, ExpressiveNavigationBarKt.access$getInactiveIconColor$p()), ColorSchemeKt.fromToken($this$defaultExpressiveNavigationBarItemColors, ExpressiveNavigationBarKt.access$getInactiveLabelTextColor$p()), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultExpressiveNavigationBarItemColors, ExpressiveNavigationBarKt.access$getInactiveIconColor$p()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(ColorSchemeKt.fromToken($this$defaultExpressiveNavigationBarItemColors, ExpressiveNavigationBarKt.access$getInactiveLabelTextColor$p()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        $this$defaultExpressiveNavigationBarItemColors.setDefaultExpressiveNavigationBarItemColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }
}
