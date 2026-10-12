package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Tooltip.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\tR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\r\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/RichTooltipColors;", "", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "titleContentColor", "actionContentColor", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getActionContentColor-0d7_KjU", "()J", "J", "getContainerColor-0d7_KjU", "getContentColor-0d7_KjU", "getTitleContentColor-0d7_KjU", "copy", "copy-jRlVdoo", "(JJJJ)Landroidx/compose/material3/RichTooltipColors;", "equals", "", "other", "hashCode", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RichTooltipColors {
    public static final int $stable = 0;
    private final long actionContentColor;
    private final long containerColor;
    private final long contentColor;
    private final long titleContentColor;

    static {
    }

    public /* synthetic */ RichTooltipColors(long r1, long r3, long r5, long r7, DefaultConstructorMarker r9) {
        this(r1, r3, r5, r7);
    }

    private RichTooltipColors(long containerColor, long contentColor, long titleContentColor, long actionContentColor) {
        this.containerColor = containerColor;
        this.contentColor = contentColor;
        this.titleContentColor = titleContentColor;
        this.actionContentColor = actionContentColor;
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2526getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m2527getContentColor0d7_KjU() {
        return this.contentColor;
    }

    /* JADX INFO: renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name */
    public final long m2528getTitleContentColor0d7_KjU() {
        return this.titleContentColor;
    }

    /* JADX INFO: renamed from: getActionContentColor-0d7_KjU, reason: not valid java name */
    public final long m2525getActionContentColor0d7_KjU() {
        return this.actionContentColor;
    }

    /* JADX INFO: renamed from: copy-jRlVdoo$default, reason: not valid java name */
    public static /* synthetic */ RichTooltipColors m2523copyjRlVdoo$default(RichTooltipColors r9, long r10, long r12, long r14, long r16, int r18, Object r19) {
        if ((r18 & 1) == 0) goto L5;
        long r1 = r9.containerColor;
    L7:
        if ((r18 & 2) == 0) goto L9;
        long r3 = r9.contentColor;
    L11:
        if ((r18 & 4) == 0) goto L13;
        long r5 = r9.titleContentColor;
    L15:
        if ((r18 & 8) == 0) goto L17;
        long r7 = r9.actionContentColor;
    L19:
        return r9.m2524copyjRlVdoo(r1, r3, r5, r7);
    L17:
        r7 = r16;
        goto L19
    L13:
        r5 = r14;
        goto L15
    L9:
        r3 = r12;
        goto L11
    L5:
        r1 = r10;
        goto L7
    }

    /* JADX INFO: renamed from: copy-jRlVdoo, reason: not valid java name */
    public final RichTooltipColors m2524copyjRlVdoo(long containerColor, long contentColor, long titleContentColor, long actionContentColor) {
        boolean r10 = true;
        if (containerColor == 16) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L8;
        long r13 = containerColor;
    L10:
        if (contentColor == 16) goto L12;
        boolean r5 = true;
    L13:
        if (r5 == false) goto L15;
        long r15 = contentColor;
    L17:
        if (titleContentColor == 16) goto L19;
        boolean r6 = true;
    L20:
        if (r6 == false) goto L22;
        long r17 = titleContentColor;
    L24:
        if (actionContentColor != 16) goto L27;
        r10 = false;
    L27:
        if (r10 == false) goto L29;
        long r19 = actionContentColor;
    L31:
        return new RichTooltipColors(r13, r15, r17, r19, null);
    L29:
        r19 = this.actionContentColor;
        goto L31
    L22:
        r17 = this.titleContentColor;
        goto L24
    L19:
        r6 = false;
        goto L20
    L15:
        r15 = this.contentColor;
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

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof RichTooltipColors) == true) goto L9;
        return false;
    L9:
        if (Color.m4367equalsimpl0(this.containerColor, ((RichTooltipColors) other).containerColor) == true) goto L12;
        return false;
    L12:
        if (Color.m4367equalsimpl0(this.contentColor, ((RichTooltipColors) other).contentColor) == true) goto L15;
        return false;
    L15:
        if (Color.m4367equalsimpl0(this.titleContentColor, ((RichTooltipColors) other).titleContentColor) == true) goto L18;
        return false;
    L18:
        if (Color.m4367equalsimpl0(this.actionContentColor, ((RichTooltipColors) other).actionContentColor) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.containerColor);
        int result2 = (result * 31) + Color.m4373hashCodeimpl(this.contentColor);
        return (((result2 * 31) + Color.m4373hashCodeimpl(this.titleContentColor)) * 31) + Color.m4373hashCodeimpl(this.actionContentColor);
    }
}
