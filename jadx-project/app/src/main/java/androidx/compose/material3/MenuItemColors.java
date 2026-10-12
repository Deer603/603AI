package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001d\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0016H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0016H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\u001d\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0016H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000bR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/material3/MenuItemColors;", "", "textColor", "Landroidx/compose/ui/graphics/Color;", "leadingIconColor", "trailingIconColor", "disabledTextColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDisabledLeadingIconColor-0d7_KjU", "()J", "J", "getDisabledTextColor-0d7_KjU", "getDisabledTrailingIconColor-0d7_KjU", "getLeadingIconColor-0d7_KjU", "getTextColor-0d7_KjU", "getTrailingIconColor-0d7_KjU", "copy", "copy-tNS2XkQ", "(JJJJJJ)Landroidx/compose/material3/MenuItemColors;", "equals", "", "other", "hashCode", "", "enabled", "leadingIconColor-vNxB06k$material3_release", "(Z)J", "textColor-vNxB06k$material3_release", "trailingIconColor-vNxB06k$material3_release", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MenuItemColors {
    public static final int $stable = 0;
    private final long disabledLeadingIconColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long leadingIconColor;
    private final long textColor;
    private final long trailingIconColor;

    static {
    }

    public /* synthetic */ MenuItemColors(long r1, long r3, long r5, long r7, long r9, long r11, DefaultConstructorMarker r13) {
        this(r1, r3, r5, r7, r9, r11);
    }

    private MenuItemColors(long textColor, long leadingIconColor, long trailingIconColor, long disabledTextColor, long disabledLeadingIconColor, long disabledTrailingIconColor) {
        this.textColor = textColor;
        this.leadingIconColor = leadingIconColor;
        this.trailingIconColor = trailingIconColor;
        this.disabledTextColor = disabledTextColor;
        this.disabledLeadingIconColor = disabledLeadingIconColor;
        this.disabledTrailingIconColor = disabledTrailingIconColor;
    }

    /* JADX INFO: renamed from: getTextColor-0d7_KjU, reason: not valid java name */
    public final long m2363getTextColor0d7_KjU() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: getLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2362getLeadingIconColor0d7_KjU() {
        return this.leadingIconColor;
    }

    /* JADX INFO: renamed from: getTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2364getTrailingIconColor0d7_KjU() {
        return this.trailingIconColor;
    }

    /* JADX INFO: renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m2360getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* JADX INFO: renamed from: getDisabledLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2359getDisabledLeadingIconColor0d7_KjU() {
        return this.disabledLeadingIconColor;
    }

    /* JADX INFO: renamed from: getDisabledTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2361getDisabledTrailingIconColor0d7_KjU() {
        return this.disabledTrailingIconColor;
    }

    /* JADX INFO: renamed from: copy-tNS2XkQ$default, reason: not valid java name */
    public static /* synthetic */ MenuItemColors m2357copytNS2XkQ$default(MenuItemColors r13, long r14, long r16, long r18, long r20, long r22, long r24, int r26, Object r27) {
        if ((r26 & 1) == 0) goto L5;
        long r1 = r13.textColor;
    L7:
        if ((r26 & 2) == 0) goto L9;
        long r3 = r13.leadingIconColor;
    L11:
        if ((r26 & 4) == 0) goto L13;
        long r5 = r13.trailingIconColor;
    L15:
        if ((r26 & 8) == 0) goto L17;
        long r7 = r13.disabledTextColor;
    L19:
        if ((r26 & 16) == 0) goto L21;
        long r9 = r13.disabledLeadingIconColor;
    L23:
        if ((r26 & 32) == 0) goto L25;
        long r11 = r13.disabledTrailingIconColor;
    L27:
        return r13.m2358copytNS2XkQ(r1, r3, r5, r7, r9, r11);
    L25:
        r11 = r24;
        goto L27
    L21:
        r9 = r22;
        goto L23
    L17:
        r7 = r20;
        goto L19
    L13:
        r5 = r18;
        goto L15
    L9:
        r3 = r16;
        goto L11
    L5:
        r1 = r14;
        goto L7
    }

    /* JADX INFO: renamed from: copy-tNS2XkQ, reason: not valid java name */
    public final MenuItemColors m2358copytNS2XkQ(long textColor, long leadingIconColor, long trailingIconColor, long disabledTextColor, long disabledLeadingIconColor, long disabledTrailingIconColor) {
        boolean r10 = true;
        if (textColor == 16) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L8;
        long r13 = textColor;
    L10:
        if (leadingIconColor == 16) goto L12;
        boolean r5 = true;
    L13:
        if (r5 == false) goto L15;
        long r15 = leadingIconColor;
    L17:
        if (trailingIconColor == 16) goto L19;
        boolean r6 = true;
    L20:
        if (r6 == false) goto L22;
        long r17 = trailingIconColor;
    L24:
        if (disabledTextColor == 16) goto L26;
        boolean r7 = true;
    L27:
        if (r7 == false) goto L29;
        long r19 = disabledTextColor;
    L31:
        if (disabledLeadingIconColor == 16) goto L33;
        boolean r8 = true;
    L34:
        if (r8 == false) goto L36;
        long r21 = disabledLeadingIconColor;
    L38:
        if (disabledTrailingIconColor != 16) goto L41;
        r10 = false;
    L41:
        if (r10 == false) goto L43;
        long r23 = disabledTrailingIconColor;
    L45:
        return new MenuItemColors(r13, r15, r17, r19, r21, r23, null);
    L43:
        r23 = this.disabledTrailingIconColor;
        goto L45
    L36:
        r21 = this.disabledLeadingIconColor;
        goto L38
    L33:
        r8 = false;
        goto L34
    L29:
        r19 = this.disabledTextColor;
        goto L31
    L26:
        r7 = false;
        goto L27
    L22:
        r17 = this.trailingIconColor;
        goto L24
    L19:
        r6 = false;
        goto L20
    L15:
        r15 = this.leadingIconColor;
        goto L17
    L12:
        r5 = false;
        goto L13
    L8:
        r13 = this.textColor;
        goto L10
    L5:
        r4 = false;
        goto L6
    }

    /* JADX INFO: renamed from: textColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2366textColorvNxB06k$material3_release(boolean enabled) {
        if (enabled == false) goto L5;
        return this.textColor;
    L5:
        return this.disabledTextColor;
    }

    /* JADX INFO: renamed from: leadingIconColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2365leadingIconColorvNxB06k$material3_release(boolean enabled) {
        if (enabled == false) goto L5;
        return this.leadingIconColor;
    L5:
        return this.disabledLeadingIconColor;
    }

    /* JADX INFO: renamed from: trailingIconColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2367trailingIconColorvNxB06k$material3_release(boolean enabled) {
        if (enabled == false) goto L5;
        return this.trailingIconColor;
    L5:
        return this.disabledTrailingIconColor;
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L29:
        return false;
    L8:
        if ((other instanceof MenuItemColors) == false) goto L29;
        if (Color.m4367equalsimpl0(this.textColor, ((MenuItemColors) other).textColor) == true) goto L14;
        return false;
    L14:
        if (Color.m4367equalsimpl0(this.leadingIconColor, ((MenuItemColors) other).leadingIconColor) == true) goto L17;
        return false;
    L17:
        if (Color.m4367equalsimpl0(this.trailingIconColor, ((MenuItemColors) other).trailingIconColor) == true) goto L20;
        return false;
    L20:
        if (Color.m4367equalsimpl0(this.disabledTextColor, ((MenuItemColors) other).disabledTextColor) == true) goto L23;
        return false;
    L23:
        if (Color.m4367equalsimpl0(this.disabledLeadingIconColor, ((MenuItemColors) other).disabledLeadingIconColor) == true) goto L26;
        return false;
    L26:
        if (Color.m4367equalsimpl0(this.disabledTrailingIconColor, ((MenuItemColors) other).disabledTrailingIconColor) == true) goto L28;
        return false;
    L28:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.textColor);
        int result2 = (result * 31) + Color.m4373hashCodeimpl(this.leadingIconColor);
        return (((((((result2 * 31) + Color.m4373hashCodeimpl(this.trailingIconColor)) * 31) + Color.m4373hashCodeimpl(this.disabledTextColor)) * 31) + Color.m4373hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m4373hashCodeimpl(this.disabledTrailingIconColor);
    }
}
