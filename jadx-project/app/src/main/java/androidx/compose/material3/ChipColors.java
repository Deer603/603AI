package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u001d\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J`\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u001d\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0019J\u001d\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0019J\u001d\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\u0019R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0012\u0010\rR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0013\u0010\rR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0014\u0010\rR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0015\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/material3/ChipColors;", "", "containerColor", "Landroidx/compose/ui/graphics/Color;", "labelColor", "leadingIconContentColor", "trailingIconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconContentColor", "disabledTrailingIconContentColor", "(JJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContainerColor-0d7_KjU", "()J", "J", "getDisabledContainerColor-0d7_KjU", "getDisabledLabelColor-0d7_KjU", "getDisabledLeadingIconContentColor-0d7_KjU", "getDisabledTrailingIconContentColor-0d7_KjU", "getLabelColor-0d7_KjU", "getLeadingIconContentColor-0d7_KjU", "getTrailingIconContentColor-0d7_KjU", "enabled", "", "containerColor-vNxB06k$material3_release", "(Z)J", "copy", "copy-FD3wquc", "(JJJJJJJJ)Landroidx/compose/material3/ChipColors;", "equals", "other", "hashCode", "", "labelColor-vNxB06k$material3_release", "leadingIconContentColor-vNxB06k$material3_release", "trailingIconContentColor-vNxB06k$material3_release", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ChipColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long disabledContainerColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconContentColor;
    private final long disabledTrailingIconContentColor;
    private final long labelColor;
    private final long leadingIconContentColor;
    private final long trailingIconContentColor;

    static {
    }

    public /* synthetic */ ChipColors(long r1, long r3, long r5, long r7, long r9, long r11, long r13, long r15, DefaultConstructorMarker r17) {
        this(r1, r3, r5, r7, r9, r11, r13, r15);
    }

    private ChipColors(long containerColor, long labelColor, long leadingIconContentColor, long trailingIconContentColor, long disabledContainerColor, long disabledLabelColor, long disabledLeadingIconContentColor, long disabledTrailingIconContentColor) {
        this.containerColor = containerColor;
        this.labelColor = labelColor;
        this.leadingIconContentColor = leadingIconContentColor;
        this.trailingIconContentColor = trailingIconContentColor;
        this.disabledContainerColor = disabledContainerColor;
        this.disabledLabelColor = disabledLabelColor;
        this.disabledLeadingIconContentColor = disabledLeadingIconContentColor;
        this.disabledTrailingIconContentColor = disabledTrailingIconContentColor;
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1984getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getLabelColor-0d7_KjU, reason: not valid java name */
    public final long m1989getLabelColor0d7_KjU() {
        return this.labelColor;
    }

    /* JADX INFO: renamed from: getLeadingIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m1990getLeadingIconContentColor0d7_KjU() {
        return this.leadingIconContentColor;
    }

    /* JADX INFO: renamed from: getTrailingIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m1991getTrailingIconContentColor0d7_KjU() {
        return this.trailingIconContentColor;
    }

    /* JADX INFO: renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1985getDisabledContainerColor0d7_KjU() {
        return this.disabledContainerColor;
    }

    /* JADX INFO: renamed from: getDisabledLabelColor-0d7_KjU, reason: not valid java name */
    public final long m1986getDisabledLabelColor0d7_KjU() {
        return this.disabledLabelColor;
    }

    /* JADX INFO: renamed from: getDisabledLeadingIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m1987getDisabledLeadingIconContentColor0d7_KjU() {
        return this.disabledLeadingIconContentColor;
    }

    /* JADX INFO: renamed from: getDisabledTrailingIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m1988getDisabledTrailingIconContentColor0d7_KjU() {
        return this.disabledTrailingIconContentColor;
    }

    /* JADX INFO: renamed from: copy-FD3wquc$default, reason: not valid java name */
    public static /* synthetic */ ChipColors m1981copyFD3wquc$default(ChipColors r18, long r19, long r21, long r23, long r25, long r27, long r29, long r31, long r33, int r35, Object r36) {
        if ((r35 & 1) == 0) goto L5;
        long r2 = r18.containerColor;
    L7:
        if ((r35 & 2) == 0) goto L9;
        long r4 = r18.labelColor;
    L11:
        if ((r35 & 4) == 0) goto L13;
        long r6 = r18.leadingIconContentColor;
    L15:
        if ((r35 & 8) == 0) goto L17;
        long r8 = r18.trailingIconContentColor;
    L19:
        if ((r35 & 16) == 0) goto L21;
        long r10 = r18.disabledContainerColor;
    L23:
        if ((r35 & 32) == 0) goto L25;
        long r12 = r18.disabledLabelColor;
    L27:
        if ((r35 & 64) == 0) goto L29;
        long r14 = r18.disabledLeadingIconContentColor;
    L31:
        if ((r35 & 128) == 0) goto L33;
        long r1 = r18.disabledTrailingIconContentColor;
    L34:
        long r22 = r4;
        long r24 = r6;
        long r26 = r8;
        long r28 = r10;
        long r30 = r12;
        long r32 = r14;
        long r20 = r2;
        return r18.m1983copyFD3wquc(r20, r22, r24, r26, r28, r30, r32, r1);
    L33:
        r1 = r33;
        goto L34
    L29:
        r14 = r31;
        goto L31
    L25:
        r12 = r29;
        goto L27
    L21:
        r10 = r27;
        goto L23
    L17:
        r8 = r25;
        goto L19
    L13:
        r6 = r23;
        goto L15
    L9:
        r4 = r21;
        goto L11
    L5:
        r2 = r19;
        goto L7
    }

    /* JADX INFO: renamed from: copy-FD3wquc, reason: not valid java name */
    public final ChipColors m1983copyFD3wquc(long containerColor, long labelColor, long leadingIconContentColor, long trailingIconContentColor, long disabledContainerColor, long disabledLabelColor, long disabledLeadingIconContentColor, long disabledTrailingIconContentColor) {
        boolean r10 = true;
        if (containerColor == 16) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L8;
        long r13 = containerColor;
    L10:
        if (labelColor == 16) goto L12;
        boolean r5 = true;
    L13:
        if (r5 == false) goto L15;
        long r15 = labelColor;
    L17:
        if (leadingIconContentColor == 16) goto L19;
        boolean r6 = true;
    L20:
        if (r6 == false) goto L22;
        long r17 = leadingIconContentColor;
    L24:
        if (trailingIconContentColor == 16) goto L26;
        boolean r7 = true;
    L27:
        if (r7 == false) goto L29;
        long r19 = trailingIconContentColor;
    L31:
        if (disabledContainerColor == 16) goto L33;
        boolean r8 = true;
    L34:
        if (r8 == false) goto L36;
        long r21 = disabledContainerColor;
    L38:
        if (disabledLabelColor == 16) goto L40;
        boolean r9 = true;
    L41:
        if (r9 == false) goto L43;
        long r23 = disabledLabelColor;
    L45:
        if (disabledLeadingIconContentColor == 16) goto L47;
        boolean r11 = true;
    L48:
        if (r11 == false) goto L50;
        long r25 = disabledLeadingIconContentColor;
    L52:
        if (disabledTrailingIconContentColor != 16) goto L55;
        r10 = false;
    L55:
        if (r10 == false) goto L57;
        long r27 = disabledTrailingIconContentColor;
    L59:
        return new ChipColors(r13, r15, r17, r19, r21, r23, r25, r27, null);
    L57:
        r27 = this.disabledTrailingIconContentColor;
        goto L59
    L50:
        r25 = this.disabledLeadingIconContentColor;
        goto L52
    L47:
        r11 = false;
        goto L48
    L43:
        r23 = this.disabledLabelColor;
        goto L45
    L40:
        r9 = false;
        goto L41
    L36:
        r21 = this.disabledContainerColor;
        goto L38
    L33:
        r8 = false;
        goto L34
    L29:
        r19 = this.trailingIconContentColor;
        goto L31
    L26:
        r7 = false;
        goto L27
    L22:
        r17 = this.leadingIconContentColor;
        goto L24
    L19:
        r6 = false;
        goto L20
    L15:
        r15 = this.labelColor;
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
    public final long m1982containerColorvNxB06k$material3_release(boolean enabled) {
        if (enabled == false) goto L5;
        return this.containerColor;
    L5:
        return this.disabledContainerColor;
    }

    /* JADX INFO: renamed from: labelColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m1992labelColorvNxB06k$material3_release(boolean enabled) {
        if (enabled == false) goto L5;
        return this.labelColor;
    L5:
        return this.disabledLabelColor;
    }

    /* JADX INFO: renamed from: leadingIconContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m1993leadingIconContentColorvNxB06k$material3_release(boolean enabled) {
        if (enabled == false) goto L5;
        return this.leadingIconContentColor;
    L5:
        return this.disabledLeadingIconContentColor;
    }

    /* JADX INFO: renamed from: trailingIconContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m1994trailingIconContentColorvNxB06k$material3_release(boolean enabled) {
        if (enabled == false) goto L5;
        return this.trailingIconContentColor;
    L5:
        return this.disabledTrailingIconContentColor;
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L35:
        return false;
    L8:
        if ((other instanceof ChipColors) == false) goto L35;
        if (Color.m4367equalsimpl0(this.containerColor, ((ChipColors) other).containerColor) == true) goto L14;
        return false;
    L14:
        if (Color.m4367equalsimpl0(this.labelColor, ((ChipColors) other).labelColor) == true) goto L17;
        return false;
    L17:
        if (Color.m4367equalsimpl0(this.leadingIconContentColor, ((ChipColors) other).leadingIconContentColor) == true) goto L20;
        return false;
    L20:
        if (Color.m4367equalsimpl0(this.trailingIconContentColor, ((ChipColors) other).trailingIconContentColor) == true) goto L23;
        return false;
    L23:
        if (Color.m4367equalsimpl0(this.disabledContainerColor, ((ChipColors) other).disabledContainerColor) == true) goto L26;
        return false;
    L26:
        if (Color.m4367equalsimpl0(this.disabledLabelColor, ((ChipColors) other).disabledLabelColor) == true) goto L29;
        return false;
    L29:
        if (Color.m4367equalsimpl0(this.disabledLeadingIconContentColor, ((ChipColors) other).disabledLeadingIconContentColor) == true) goto L32;
        return false;
    L32:
        if (Color.m4367equalsimpl0(this.disabledTrailingIconContentColor, ((ChipColors) other).disabledTrailingIconContentColor) == true) goto L34;
        return false;
    L34:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.containerColor);
        int result2 = (result * 31) + Color.m4373hashCodeimpl(this.labelColor);
        return (((((((((((result2 * 31) + Color.m4373hashCodeimpl(this.leadingIconContentColor)) * 31) + Color.m4373hashCodeimpl(this.trailingIconContentColor)) * 31) + Color.m4373hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m4373hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m4373hashCodeimpl(this.disabledLeadingIconContentColor)) * 31) + Color.m4373hashCodeimpl(this.disabledTrailingIconContentColor);
    }
}
