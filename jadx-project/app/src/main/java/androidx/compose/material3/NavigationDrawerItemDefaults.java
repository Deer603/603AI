package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: compiled from: NavigationDrawer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jb\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/material3/NavigationDrawerItemDefaults;", "", "()V", "ItemPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getItemPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "colors", "Landroidx/compose/material3/NavigationDrawerItemColors;", "selectedContainerColor", "Landroidx/compose/ui/graphics/Color;", "unselectedContainerColor", "selectedIconColor", "unselectedIconColor", "selectedTextColor", "unselectedTextColor", "selectedBadgeColor", "unselectedBadgeColor", "colors-oq7We08", "(JJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationDrawerItemColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NavigationDrawerItemDefaults {
    public static final int $stable = 0;
    public static final NavigationDrawerItemDefaults INSTANCE = null;
    private static final PaddingValues ItemPadding = null;

    private NavigationDrawerItemDefaults() {
    }

    /* JADX INFO: renamed from: colors-oq7We08, reason: not valid java name */
    public final NavigationDrawerItemColors m2406colorsoq7We08(long selectedContainerColor, long unselectedContainerColor, long selectedIconColor, long unselectedIconColor, long selectedTextColor, long unselectedTextColor, long selectedBadgeColor, long unselectedBadgeColor, Composer $composer, int $changed, int r44) {
        ComposerKt.sourceInformationMarkerStart($composer, -1574983348, "C(colors)P(1:c#ui.graphics.Color,5:c#ui.graphics.Color,2:c#ui.graphics.Color,6:c#ui.graphics.Color,3:c#ui.graphics.Color,7:c#ui.graphics.Color,0:c#ui.graphics.Color,4:c#ui.graphics.Color)1020@42373L5,1022@42515L5,1023@42600L5,1024@42686L5,1025@42776L5:NavigationDrawer.kt#uh7d8r");
        if ((r44 & 1) == 0) goto L5;
        long selectedContainerColor2 = ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getActiveIndicatorColor(), $composer, 6);
    L7:
        if ((r44 & 2) == 0) goto L9;
        long unselectedContainerColor2 = Color.Companion.m4401getTransparent0d7_KjU();
    L11:
        if ((r44 & 4) == 0) goto L13;
        long selectedIconColor2 = ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getActiveIconColor(), $composer, 6);
    L15:
        if ((r44 & 8) == 0) goto L17;
        long unselectedIconColor2 = ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getInactiveIconColor(), $composer, 6);
    L19:
        if ((r44 & 16) == 0) goto L21;
        long selectedTextColor2 = ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getActiveLabelTextColor(), $composer, 6);
    L23:
        if ((r44 & 32) == 0) goto L25;
        long unselectedTextColor2 = ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getInactiveLabelTextColor(), $composer, 6);
    L27:
        if ((r44 & 64) == 0) goto L29;
        long selectedBadgeColor2 = selectedTextColor2;
    L31:
        if ((r44 & 128) == 0) goto L33;
        long unselectedBadgeColor2 = unselectedTextColor2;
    L35:
        if (ComposerKt.isTraceInProgress() == false) goto L38;
        ComposerKt.traceEventStart(-1574983348, $changed, -1, "androidx.compose.material3.NavigationDrawerItemDefaults.colors (NavigationDrawer.kt:1029)");
    L38:
        DefaultDrawerItemsColor r7 = new DefaultDrawerItemsColor(selectedIconColor2, unselectedIconColor2, selectedTextColor2, unselectedTextColor2, selectedContainerColor2, unselectedContainerColor2, selectedBadgeColor2, unselectedBadgeColor2, null);
        if (ComposerKt.isTraceInProgress() == false) goto L41;
        ComposerKt.traceEventEnd();
    L41:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r7;
    L33:
        unselectedBadgeColor2 = unselectedBadgeColor;
        goto L35
    L29:
        selectedBadgeColor2 = selectedBadgeColor;
        goto L31
    L25:
        unselectedTextColor2 = unselectedTextColor;
        goto L27
    L21:
        selectedTextColor2 = selectedTextColor;
        goto L23
    L17:
        unselectedIconColor2 = unselectedIconColor;
        goto L19
    L13:
        selectedIconColor2 = selectedIconColor;
        goto L15
    L9:
        unselectedContainerColor2 = unselectedContainerColor;
        goto L11
    L5:
        selectedContainerColor2 = selectedContainerColor;
        goto L7
    }

    static {
        INSTANCE = new NavigationDrawerItemDefaults();
        ItemPadding = PaddingKt.m720PaddingValuesYgX7TsA$default(Dp.m6973constructorimpl(12), 0.0f, 2, null);
    }

    public final PaddingValues getItemPadding() {
        return ItemPadding;
    }
}
