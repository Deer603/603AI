package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: NavigationBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJV\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J%\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001aH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J%\u0010#\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001aH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010\"R\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00038@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0011\u0010\fR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\fR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0013\u0010\fR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0015\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/material3/NavigationBarItemColors;", "", "selectedIconColor", "Landroidx/compose/ui/graphics/Color;", "selectedTextColor", "selectedIndicatorColor", "unselectedIconColor", "unselectedTextColor", "disabledIconColor", "disabledTextColor", "(JJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDisabledIconColor-0d7_KjU", "()J", "J", "getDisabledTextColor-0d7_KjU", "indicatorColor", "getIndicatorColor-0d7_KjU$material3_release", "getSelectedIconColor-0d7_KjU", "getSelectedIndicatorColor-0d7_KjU", "getSelectedTextColor-0d7_KjU", "getUnselectedIconColor-0d7_KjU", "getUnselectedTextColor-0d7_KjU", "copy", "copy-4JmcsL4", "(JJJJJJJ)Landroidx/compose/material3/NavigationBarItemColors;", "equals", "", "other", "hashCode", "", "iconColor", "selected", "enabled", "iconColor-WaAFU9c$material3_release", "(ZZ)J", "textColor", "textColor-WaAFU9c$material3_release", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NavigationBarItemColors {
    public static final int $stable = 0;
    private final long disabledIconColor;
    private final long disabledTextColor;
    private final long selectedIconColor;
    private final long selectedIndicatorColor;
    private final long selectedTextColor;
    private final long unselectedIconColor;
    private final long unselectedTextColor;

    static {
    }

    public /* synthetic */ NavigationBarItemColors(long r1, long r3, long r5, long r7, long r9, long r11, long r13, DefaultConstructorMarker r15) {
        this(r1, r3, r5, r7, r9, r11, r13);
    }

    private NavigationBarItemColors(long selectedIconColor, long selectedTextColor, long selectedIndicatorColor, long unselectedIconColor, long unselectedTextColor, long disabledIconColor, long disabledTextColor) {
        this.selectedIconColor = selectedIconColor;
        this.selectedTextColor = selectedTextColor;
        this.selectedIndicatorColor = selectedIndicatorColor;
        this.unselectedIconColor = unselectedIconColor;
        this.unselectedTextColor = unselectedTextColor;
        this.disabledIconColor = disabledIconColor;
        this.disabledTextColor = disabledTextColor;
    }

    /* JADX INFO: renamed from: getSelectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2391getSelectedIconColor0d7_KjU() {
        return this.selectedIconColor;
    }

    /* JADX INFO: renamed from: getSelectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m2393getSelectedTextColor0d7_KjU() {
        return this.selectedTextColor;
    }

    /* JADX INFO: renamed from: getSelectedIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m2392getSelectedIndicatorColor0d7_KjU() {
        return this.selectedIndicatorColor;
    }

    /* JADX INFO: renamed from: getUnselectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2394getUnselectedIconColor0d7_KjU() {
        return this.unselectedIconColor;
    }

    /* JADX INFO: renamed from: getUnselectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m2395getUnselectedTextColor0d7_KjU() {
        return this.unselectedTextColor;
    }

    /* JADX INFO: renamed from: getDisabledIconColor-0d7_KjU, reason: not valid java name */
    public final long m2388getDisabledIconColor0d7_KjU() {
        return this.disabledIconColor;
    }

    /* JADX INFO: renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m2389getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* JADX INFO: renamed from: copy-4JmcsL4$default, reason: not valid java name */
    public static /* synthetic */ NavigationBarItemColors m2386copy4JmcsL4$default(NavigationBarItemColors r14, long r15, long r17, long r19, long r21, long r23, long r25, long r27, int r29, Object r30) {
        if ((r29 & 1) == 0) goto L5;
        long r0 = r14.selectedIconColor;
    L7:
        if ((r29 & 2) == 0) goto L9;
        long r2 = r14.selectedTextColor;
    L11:
        if ((r29 & 4) == 0) goto L13;
        long r4 = r14.selectedIndicatorColor;
    L15:
        if ((r29 & 8) == 0) goto L17;
        long r6 = r14.unselectedIconColor;
    L19:
        if ((r29 & 16) == 0) goto L21;
        long r8 = r14.unselectedTextColor;
    L23:
        if ((r29 & 32) == 0) goto L25;
        long r10 = r14.disabledIconColor;
    L27:
        if ((r29 & 64) == 0) goto L29;
        long r12 = r14.disabledTextColor;
    L31:
        return r14.m2387copy4JmcsL4(r0, r2, r4, r6, r8, r10, r12);
    L29:
        r12 = r27;
        goto L31
    L25:
        r10 = r25;
        goto L27
    L21:
        r8 = r23;
        goto L23
    L17:
        r6 = r21;
        goto L19
    L13:
        r4 = r19;
        goto L15
    L9:
        r2 = r17;
        goto L11
    L5:
        r0 = r15;
        goto L7
    }

    /* JADX INFO: renamed from: copy-4JmcsL4, reason: not valid java name */
    public final NavigationBarItemColors m2387copy4JmcsL4(long selectedIconColor, long selectedTextColor, long selectedIndicatorColor, long unselectedIconColor, long unselectedTextColor, long disabledIconColor, long disabledTextColor) {
        boolean r10 = true;
        if (selectedIconColor == 16) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L8;
        long r13 = selectedIconColor;
    L10:
        if (selectedTextColor == 16) goto L12;
        boolean r5 = true;
    L13:
        if (r5 == false) goto L15;
        long r15 = selectedTextColor;
    L17:
        if (selectedIndicatorColor == 16) goto L19;
        boolean r6 = true;
    L20:
        if (r6 == false) goto L22;
        long r17 = selectedIndicatorColor;
    L24:
        if (unselectedIconColor == 16) goto L26;
        boolean r7 = true;
    L27:
        if (r7 == false) goto L29;
        long r19 = unselectedIconColor;
    L31:
        if (unselectedTextColor == 16) goto L33;
        boolean r8 = true;
    L34:
        if (r8 == false) goto L36;
        long r21 = unselectedTextColor;
    L38:
        if (disabledIconColor == 16) goto L40;
        boolean r9 = true;
    L41:
        if (r9 == false) goto L43;
        long r23 = disabledIconColor;
    L45:
        if (disabledTextColor != 16) goto L48;
        r10 = false;
    L48:
        if (r10 == false) goto L50;
        long r25 = disabledTextColor;
    L52:
        return new NavigationBarItemColors(r13, r15, r17, r19, r21, r23, r25, null);
    L50:
        r25 = this.disabledTextColor;
        goto L52
    L43:
        r23 = this.disabledIconColor;
        goto L45
    L40:
        r9 = false;
        goto L41
    L36:
        r21 = this.unselectedTextColor;
        goto L38
    L33:
        r8 = false;
        goto L34
    L29:
        r19 = this.unselectedIconColor;
        goto L31
    L26:
        r7 = false;
        goto L27
    L22:
        r17 = this.selectedIndicatorColor;
        goto L24
    L19:
        r6 = false;
        goto L20
    L15:
        r15 = this.selectedTextColor;
        goto L17
    L12:
        r5 = false;
        goto L13
    L8:
        r13 = this.selectedIconColor;
        goto L10
    L5:
        r4 = false;
        goto L6
    }

    /* JADX INFO: renamed from: iconColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2396iconColorWaAFU9c$material3_release(boolean selected, boolean enabled) {
        if (enabled == false) goto L8;
        if (selected == false) goto L7;
        return this.selectedIconColor;
    L7:
        return this.unselectedIconColor;
    L8:
        return this.disabledIconColor;
    }

    /* JADX INFO: renamed from: textColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2397textColorWaAFU9c$material3_release(boolean selected, boolean enabled) {
        if (enabled == false) goto L8;
        if (selected == false) goto L7;
        return this.selectedTextColor;
    L7:
        return this.unselectedTextColor;
    L8:
        return this.disabledTextColor;
    }

    /* JADX INFO: renamed from: getIndicatorColor-0d7_KjU$material3_release, reason: not valid java name */
    public final long m2390getIndicatorColor0d7_KjU$material3_release() {
        return this.selectedIndicatorColor;
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L32:
        return false;
    L8:
        if ((other instanceof NavigationBarItemColors) == false) goto L32;
        if (Color.m4367equalsimpl0(this.selectedIconColor, ((NavigationBarItemColors) other).selectedIconColor) == true) goto L14;
        return false;
    L14:
        if (Color.m4367equalsimpl0(this.unselectedIconColor, ((NavigationBarItemColors) other).unselectedIconColor) == true) goto L17;
        return false;
    L17:
        if (Color.m4367equalsimpl0(this.selectedTextColor, ((NavigationBarItemColors) other).selectedTextColor) == true) goto L20;
        return false;
    L20:
        if (Color.m4367equalsimpl0(this.unselectedTextColor, ((NavigationBarItemColors) other).unselectedTextColor) == true) goto L23;
        return false;
    L23:
        if (Color.m4367equalsimpl0(this.selectedIndicatorColor, ((NavigationBarItemColors) other).selectedIndicatorColor) == true) goto L26;
        return false;
    L26:
        if (Color.m4367equalsimpl0(this.disabledIconColor, ((NavigationBarItemColors) other).disabledIconColor) == true) goto L29;
        return false;
    L29:
        if (Color.m4367equalsimpl0(this.disabledTextColor, ((NavigationBarItemColors) other).disabledTextColor) == true) goto L31;
        return false;
    L31:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.selectedIconColor);
        int result2 = (result * 31) + Color.m4373hashCodeimpl(this.unselectedIconColor);
        return (((((((((result2 * 31) + Color.m4373hashCodeimpl(this.selectedTextColor)) * 31) + Color.m4373hashCodeimpl(this.unselectedTextColor)) * 31) + Color.m4373hashCodeimpl(this.selectedIndicatorColor)) * 31) + Color.m4373hashCodeimpl(this.disabledIconColor)) * 31) + Color.m4373hashCodeimpl(this.disabledTextColor);
    }
}
