package androidx.compose.material3;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u001d\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\nR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000f\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/TopAppBarColors;", "", "containerColor", "Landroidx/compose/ui/graphics/Color;", "scrolledContainerColor", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getActionIconContentColor-0d7_KjU", "()J", "J", "getContainerColor-0d7_KjU", "getNavigationIconContentColor-0d7_KjU", "getScrolledContainerColor-0d7_KjU", "getTitleContentColor-0d7_KjU", "colorTransitionFraction", "", "containerColor-vNxB06k$material3_release", "(F)J", "copy", "copy-t635Npw", "(JJJJJ)Landroidx/compose/material3/TopAppBarColors;", "equals", "", "other", "hashCode", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TopAppBarColors {
    public static final int $stable = 0;
    private final long actionIconContentColor;
    private final long containerColor;
    private final long navigationIconContentColor;
    private final long scrolledContainerColor;
    private final long titleContentColor;

    static {
    }

    public /* synthetic */ TopAppBarColors(long r1, long r3, long r5, long r7, long r9, DefaultConstructorMarker r11) {
        this(r1, r3, r5, r7, r9);
    }

    private TopAppBarColors(long containerColor, long scrolledContainerColor, long navigationIconContentColor, long titleContentColor, long actionIconContentColor) {
        this.containerColor = containerColor;
        this.scrolledContainerColor = scrolledContainerColor;
        this.navigationIconContentColor = navigationIconContentColor;
        this.titleContentColor = titleContentColor;
        this.actionIconContentColor = actionIconContentColor;
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2979getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getScrolledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2981getScrolledContainerColor0d7_KjU() {
        return this.scrolledContainerColor;
    }

    /* JADX INFO: renamed from: getNavigationIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m2980getNavigationIconContentColor0d7_KjU() {
        return this.navigationIconContentColor;
    }

    /* JADX INFO: renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name */
    public final long m2982getTitleContentColor0d7_KjU() {
        return this.titleContentColor;
    }

    /* JADX INFO: renamed from: getActionIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m2978getActionIconContentColor0d7_KjU() {
        return this.actionIconContentColor;
    }

    /* JADX INFO: renamed from: copy-t635Npw$default, reason: not valid java name */
    public static /* synthetic */ TopAppBarColors m2975copyt635Npw$default(TopAppBarColors r11, long r12, long r14, long r16, long r18, long r20, int r22, Object r23) {
        if ((r22 & 1) == 0) goto L5;
        long r1 = r11.containerColor;
    L7:
        if ((r22 & 2) == 0) goto L9;
        long r3 = r11.scrolledContainerColor;
    L11:
        if ((r22 & 4) == 0) goto L13;
        long r5 = r11.navigationIconContentColor;
    L15:
        if ((r22 & 8) == 0) goto L17;
        long r7 = r11.titleContentColor;
    L19:
        if ((r22 & 16) == 0) goto L21;
        long r9 = r11.actionIconContentColor;
    L23:
        return r11.m2977copyt635Npw(r1, r3, r5, r7, r9);
    L21:
        r9 = r20;
        goto L23
    L17:
        r7 = r18;
        goto L19
    L13:
        r5 = r16;
        goto L15
    L9:
        r3 = r14;
        goto L11
    L5:
        r1 = r12;
        goto L7
    }

    /* JADX INFO: renamed from: copy-t635Npw, reason: not valid java name */
    public final TopAppBarColors m2977copyt635Npw(long containerColor, long scrolledContainerColor, long navigationIconContentColor, long titleContentColor, long actionIconContentColor) {
        boolean r10 = true;
        if (containerColor == 16) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L8;
        long r13 = containerColor;
    L10:
        if (scrolledContainerColor == 16) goto L12;
        boolean r5 = true;
    L13:
        if (r5 == false) goto L15;
        long r15 = scrolledContainerColor;
    L17:
        if (navigationIconContentColor == 16) goto L19;
        boolean r6 = true;
    L20:
        if (r6 == false) goto L22;
        long r17 = navigationIconContentColor;
    L24:
        if (titleContentColor == 16) goto L26;
        boolean r7 = true;
    L27:
        if (r7 == false) goto L29;
        long r19 = titleContentColor;
    L31:
        if (actionIconContentColor != 16) goto L34;
        r10 = false;
    L34:
        if (r10 == false) goto L36;
        long r21 = actionIconContentColor;
    L38:
        return new TopAppBarColors(r13, r15, r17, r19, r21, null);
    L36:
        r21 = this.actionIconContentColor;
        goto L38
    L29:
        r19 = this.titleContentColor;
        goto L31
    L26:
        r7 = false;
        goto L27
    L22:
        r17 = this.navigationIconContentColor;
        goto L24
    L19:
        r6 = false;
        goto L20
    L15:
        r15 = this.scrolledContainerColor;
        goto L17
    L12:
        r5 = false;
        goto L13
    L8:
        r13 = this.containerColor;
        goto L10
    L5:
        r4 = false;
        goto L6
    }

    /* JADX INFO: renamed from: containerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2976containerColorvNxB06k$material3_release(float colorTransitionFraction) {
        return ColorKt.m4417lerpjxsXWHM(this.containerColor, this.scrolledContainerColor, EasingKt.getFastOutLinearInEasing().transform(colorTransitionFraction));
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L26:
        return false;
    L8:
        if ((other instanceof TopAppBarColors) == false) goto L26;
        if (Color.m4367equalsimpl0(this.containerColor, ((TopAppBarColors) other).containerColor) == true) goto L14;
        return false;
    L14:
        if (Color.m4367equalsimpl0(this.scrolledContainerColor, ((TopAppBarColors) other).scrolledContainerColor) == true) goto L17;
        return false;
    L17:
        if (Color.m4367equalsimpl0(this.navigationIconContentColor, ((TopAppBarColors) other).navigationIconContentColor) == true) goto L20;
        return false;
    L20:
        if (Color.m4367equalsimpl0(this.titleContentColor, ((TopAppBarColors) other).titleContentColor) == true) goto L23;
        return false;
    L23:
        if (Color.m4367equalsimpl0(this.actionIconContentColor, ((TopAppBarColors) other).actionIconContentColor) == true) goto L25;
        return false;
    L25:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.containerColor);
        int result2 = (result * 31) + Color.m4373hashCodeimpl(this.scrolledContainerColor);
        return (((((result2 * 31) + Color.m4373hashCodeimpl(this.navigationIconContentColor)) * 31) + Color.m4373hashCodeimpl(this.titleContentColor)) * 31) + Color.m4373hashCodeimpl(this.actionIconContentColor);
    }
}
