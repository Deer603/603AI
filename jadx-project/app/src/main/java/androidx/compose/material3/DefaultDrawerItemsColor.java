package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: NavigationDrawer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0017¢\u0006\u0002\u0010\u001aJ\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0017¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0017¢\u0006\u0002\u0010\u001aJ\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0017¢\u0006\u0002\u0010\u001aR\u0019\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0012\u0010\rR\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0013\u0010\rR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0014\u0010\rR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0015\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/material3/DefaultDrawerItemsColor;", "Landroidx/compose/material3/NavigationDrawerItemColors;", "selectedIconColor", "Landroidx/compose/ui/graphics/Color;", "unselectedIconColor", "selectedTextColor", "unselectedTextColor", "selectedContainerColor", "unselectedContainerColor", "selectedBadgeColor", "unselectedBadgeColor", "(JJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getSelectedBadgeColor-0d7_KjU", "()J", "J", "getSelectedContainerColor-0d7_KjU", "getSelectedIconColor-0d7_KjU", "getSelectedTextColor-0d7_KjU", "getUnselectedBadgeColor-0d7_KjU", "getUnselectedContainerColor-0d7_KjU", "getUnselectedIconColor-0d7_KjU", "getUnselectedTextColor-0d7_KjU", "badgeColor", "Landroidx/compose/runtime/State;", "selected", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "containerColor", "equals", "other", "", "hashCode", "", "iconColor", "textColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DefaultDrawerItemsColor implements NavigationDrawerItemColors {
    private final long selectedBadgeColor;
    private final long selectedContainerColor;
    private final long selectedIconColor;
    private final long selectedTextColor;
    private final long unselectedBadgeColor;
    private final long unselectedContainerColor;
    private final long unselectedIconColor;
    private final long unselectedTextColor;

    public /* synthetic */ DefaultDrawerItemsColor(long r1, long r3, long r5, long r7, long r9, long r11, long r13, long r15, DefaultConstructorMarker r17) {
        this(r1, r3, r5, r7, r9, r11, r13, r15);
    }

    private DefaultDrawerItemsColor(long selectedIconColor, long unselectedIconColor, long selectedTextColor, long unselectedTextColor, long selectedContainerColor, long unselectedContainerColor, long selectedBadgeColor, long unselectedBadgeColor) {
        this.selectedIconColor = selectedIconColor;
        this.unselectedIconColor = unselectedIconColor;
        this.selectedTextColor = selectedTextColor;
        this.unselectedTextColor = unselectedTextColor;
        this.selectedContainerColor = selectedContainerColor;
        this.unselectedContainerColor = unselectedContainerColor;
        this.selectedBadgeColor = selectedBadgeColor;
        this.unselectedBadgeColor = unselectedBadgeColor;
    }

    /* JADX INFO: renamed from: getSelectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2182getSelectedIconColor0d7_KjU() {
        return this.selectedIconColor;
    }

    /* JADX INFO: renamed from: getUnselectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2186getUnselectedIconColor0d7_KjU() {
        return this.unselectedIconColor;
    }

    /* JADX INFO: renamed from: getSelectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m2183getSelectedTextColor0d7_KjU() {
        return this.selectedTextColor;
    }

    /* JADX INFO: renamed from: getUnselectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m2187getUnselectedTextColor0d7_KjU() {
        return this.unselectedTextColor;
    }

    /* JADX INFO: renamed from: getSelectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2181getSelectedContainerColor0d7_KjU() {
        return this.selectedContainerColor;
    }

    /* JADX INFO: renamed from: getUnselectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2185getUnselectedContainerColor0d7_KjU() {
        return this.unselectedContainerColor;
    }

    /* JADX INFO: renamed from: getSelectedBadgeColor-0d7_KjU, reason: not valid java name */
    public final long m2180getSelectedBadgeColor0d7_KjU() {
        return this.selectedBadgeColor;
    }

    /* JADX INFO: renamed from: getUnselectedBadgeColor-0d7_KjU, reason: not valid java name */
    public final long m2184getUnselectedBadgeColor0d7_KjU() {
        return this.unselectedBadgeColor;
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    public State<Color> iconColor(boolean selected, Composer $composer, int $changed) {
        $composer.startReplaceGroup(1141354218);
        ComposerKt.sourceInformation($composer, "C(iconColor)1090@44743L78:NavigationDrawer.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1141354218, $changed, -1, "androidx.compose.material3.DefaultDrawerItemsColor.iconColor (NavigationDrawer.kt:1089)");
    L5:
        if (selected == false) goto L7;
        long r0 = this.selectedIconColor;
    L8:
        State<Color> r1 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(r0), $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventEnd();
    L11:
        $composer.endReplaceGroup();
        return r1;
    L7:
        r0 = this.unselectedIconColor;
        goto L8
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    public State<Color> textColor(boolean selected, Composer $composer, int $changed) {
        $composer.startReplaceGroup(1275109558);
        ComposerKt.sourceInformation($composer, "C(textColor)1095@44922L78:NavigationDrawer.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1275109558, $changed, -1, "androidx.compose.material3.DefaultDrawerItemsColor.textColor (NavigationDrawer.kt:1094)");
    L5:
        if (selected == false) goto L7;
        long r0 = this.selectedTextColor;
    L8:
        State<Color> r1 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(r0), $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventEnd();
    L11:
        $composer.endReplaceGroup();
        return r1;
    L7:
        r0 = this.unselectedTextColor;
        goto L8
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    public State<Color> containerColor(boolean selected, Composer $composer, int $changed) {
        $composer.startReplaceGroup(-433512770);
        ComposerKt.sourceInformation($composer, "C(containerColor)1100@45106L110:NavigationDrawer.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-433512770, $changed, -1, "androidx.compose.material3.DefaultDrawerItemsColor.containerColor (NavigationDrawer.kt:1099)");
    L5:
        if (selected == false) goto L7;
        long r0 = this.selectedContainerColor;
    L8:
        State<Color> r1 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(r0), $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventEnd();
    L11:
        $composer.endReplaceGroup();
        return r1;
    L7:
        r0 = this.unselectedContainerColor;
        goto L8
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    public State<Color> badgeColor(boolean selected, Composer $composer, int $changed) {
        $composer.startReplaceGroup(-561675044);
        ComposerKt.sourceInformation($composer, "C(badgeColor)1107@45318L80:NavigationDrawer.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-561675044, $changed, -1, "androidx.compose.material3.DefaultDrawerItemsColor.badgeColor (NavigationDrawer.kt:1106)");
    L5:
        if (selected == false) goto L7;
        long r0 = this.selectedBadgeColor;
    L8:
        State<Color> r1 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(r0), $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventEnd();
    L11:
        $composer.endReplaceGroup();
        return r1;
    L7:
        r0 = this.unselectedBadgeColor;
        goto L8
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof DefaultDrawerItemsColor) == true) goto L9;
        return false;
    L9:
        if (Color.m4367equalsimpl0(this.selectedIconColor, ((DefaultDrawerItemsColor) other).selectedIconColor) == true) goto L12;
        return false;
    L12:
        if (Color.m4367equalsimpl0(this.unselectedIconColor, ((DefaultDrawerItemsColor) other).unselectedIconColor) == true) goto L15;
        return false;
    L15:
        if (Color.m4367equalsimpl0(this.selectedTextColor, ((DefaultDrawerItemsColor) other).selectedTextColor) == true) goto L18;
        return false;
    L18:
        if (Color.m4367equalsimpl0(this.unselectedTextColor, ((DefaultDrawerItemsColor) other).unselectedTextColor) == true) goto L21;
        return false;
    L21:
        if (Color.m4367equalsimpl0(this.selectedContainerColor, ((DefaultDrawerItemsColor) other).selectedContainerColor) == true) goto L24;
        return false;
    L24:
        if (Color.m4367equalsimpl0(this.unselectedContainerColor, ((DefaultDrawerItemsColor) other).unselectedContainerColor) == true) goto L27;
        return false;
    L27:
        if (Color.m4367equalsimpl0(this.selectedBadgeColor, ((DefaultDrawerItemsColor) other).selectedBadgeColor) == true) goto L30;
        return false;
    L30:
        return Color.m4367equalsimpl0(this.unselectedBadgeColor, ((DefaultDrawerItemsColor) other).unselectedBadgeColor);
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.selectedIconColor);
        int result2 = (result * 31) + Color.m4373hashCodeimpl(this.unselectedIconColor);
        return (((((((((((result2 * 31) + Color.m4373hashCodeimpl(this.selectedTextColor)) * 31) + Color.m4373hashCodeimpl(this.unselectedTextColor)) * 31) + Color.m4373hashCodeimpl(this.selectedContainerColor)) * 31) + Color.m4373hashCodeimpl(this.unselectedContainerColor)) * 31) + Color.m4373hashCodeimpl(this.selectedBadgeColor)) * 31) + Color.m4373hashCodeimpl(this.unselectedBadgeColor);
    }
}
