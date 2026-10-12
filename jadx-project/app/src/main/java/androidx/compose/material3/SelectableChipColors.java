package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J%\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0092\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J%\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0016J%\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0016J%\u0010!\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\r\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u000e\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u000f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/material3/SelectableChipColors;", "", "containerColor", "Landroidx/compose/ui/graphics/Color;", "labelColor", "leadingIconColor", "trailingIconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "(JJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "enabled", "", "selected", "containerColor-WaAFU9c$material3_release", "(ZZ)J", "copy", "copy-daRQuJA", "(JJJJJJJJJJJJJ)Landroidx/compose/material3/SelectableChipColors;", "equals", "other", "hashCode", "", "labelColor-WaAFU9c$material3_release", "leadingIconContentColor", "leadingIconContentColor-WaAFU9c$material3_release", "trailingIconContentColor", "trailingIconContentColor-WaAFU9c$material3_release", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SelectableChipColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long disabledContainerColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledSelectedContainerColor;
    private final long disabledTrailingIconColor;
    private final long labelColor;
    private final long leadingIconColor;
    private final long selectedContainerColor;
    private final long selectedLabelColor;
    private final long selectedLeadingIconColor;
    private final long selectedTrailingIconColor;
    private final long trailingIconColor;

    static {
    }

    public /* synthetic */ SelectableChipColors(long r1, long r3, long r5, long r7, long r9, long r11, long r13, long r15, long r17, long r19, long r21, long r23, long r25, DefaultConstructorMarker r27) {
        this(r1, r3, r5, r7, r9, r11, r13, r15, r17, r19, r21, r23, r25);
    }

    private SelectableChipColors(long containerColor, long labelColor, long leadingIconColor, long trailingIconColor, long disabledContainerColor, long disabledLabelColor, long disabledLeadingIconColor, long disabledTrailingIconColor, long selectedContainerColor, long disabledSelectedContainerColor, long selectedLabelColor, long selectedLeadingIconColor, long selectedTrailingIconColor) {
        this.containerColor = containerColor;
        this.labelColor = labelColor;
        this.leadingIconColor = leadingIconColor;
        this.trailingIconColor = trailingIconColor;
        this.disabledContainerColor = disabledContainerColor;
        this.disabledLabelColor = disabledLabelColor;
        this.disabledLeadingIconColor = disabledLeadingIconColor;
        this.disabledTrailingIconColor = disabledTrailingIconColor;
        this.selectedContainerColor = selectedContainerColor;
        this.disabledSelectedContainerColor = disabledSelectedContainerColor;
        this.selectedLabelColor = selectedLabelColor;
        this.selectedLeadingIconColor = selectedLeadingIconColor;
        this.selectedTrailingIconColor = selectedTrailingIconColor;
    }

    /* JADX INFO: renamed from: copy-daRQuJA$default, reason: not valid java name */
    public static /* synthetic */ SelectableChipColors m2585copydaRQuJA$default(SelectableChipColors r18, long r19, long r21, long r23, long r25, long r27, long r29, long r31, long r33, long r35, long r37, long r39, long r41, long r43, int r45, Object r46) {
        if ((r45 & 1) == 0) goto L5;
        long r2 = r18.containerColor;
    L7:
        if ((r45 & 2) == 0) goto L9;
        long r4 = r18.labelColor;
    L11:
        if ((r45 & 4) == 0) goto L13;
        long r6 = r18.leadingIconColor;
    L15:
        if ((r45 & 8) == 0) goto L17;
        long r8 = r18.trailingIconColor;
    L19:
        if ((r45 & 16) == 0) goto L21;
        long r10 = r18.disabledContainerColor;
    L23:
        if ((r45 & 32) == 0) goto L25;
        long r12 = r18.disabledLabelColor;
    L27:
        if ((r45 & 64) == 0) goto L29;
        long r14 = r18.disabledLeadingIconColor;
    L30:
        long r16 = r2;
        if ((r45 & 128) == 0) goto L33;
        long r3 = r18.disabledTrailingIconColor;
    L34:
        long r110 = r3;
        if ((r45 & 256) == 0) goto L37;
        long r5 = r18.selectedContainerColor;
    L38:
        long r22 = r5;
        if ((r45 & 512) == 0) goto L41;
        long r7 = r18.disabledSelectedContainerColor;
    L42:
        long r24 = r7;
        if ((r45 & 1024) == 0) goto L45;
        long r9 = r18.selectedLabelColor;
    L46:
        long r26 = r9;
        if ((r45 & 2048) == 0) goto L49;
        long r11 = r18.selectedLeadingIconColor;
    L51:
        if ((r45 & 4096) == 0) goto L53;
        long r1 = r18.selectedTrailingIconColor;
    L54:
        long r28 = r4;
        long r210 = r6;
        long r211 = r8;
        long r212 = r10;
        long r30 = r12;
        long r32 = r14;
        return r18.m2587copydaRQuJA(r16, r28, r210, r211, r212, r30, r32, r110, r22, r24, r26, r11, r1);
    L53:
        r1 = r43;
        goto L54
    L49:
        r11 = r41;
        goto L51
    L45:
        r9 = r39;
        goto L46
    L41:
        r7 = r37;
        goto L42
    L37:
        r5 = r35;
        goto L38
    L33:
        r3 = r33;
        goto L34
    L29:
        r14 = r31;
        goto L30
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

    /* JADX INFO: renamed from: copy-daRQuJA, reason: not valid java name */
    public final SelectableChipColors m2587copydaRQuJA(long containerColor, long labelColor, long leadingIconColor, long trailingIconColor, long disabledContainerColor, long disabledLabelColor, long disabledLeadingIconColor, long disabledTrailingIconColor, long selectedContainerColor, long disabledSelectedContainerColor, long selectedLabelColor, long selectedLeadingIconColor, long selectedTrailingIconColor) {
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
        if (leadingIconColor == 16) goto L19;
        boolean r6 = true;
    L20:
        if (r6 == false) goto L22;
        long r17 = leadingIconColor;
    L24:
        if (trailingIconColor == 16) goto L26;
        boolean r7 = true;
    L27:
        if (r7 == false) goto L29;
        long r19 = trailingIconColor;
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
        if (disabledLeadingIconColor == 16) goto L47;
        boolean r11 = true;
    L48:
        if (r11 == false) goto L50;
        long r25 = disabledLeadingIconColor;
    L52:
        if (disabledTrailingIconColor == 16) goto L54;
        boolean r12 = true;
    L55:
        if (r12 == false) goto L57;
        long r27 = disabledTrailingIconColor;
    L59:
        if (selectedContainerColor == 16) goto L61;
        boolean r14 = true;
    L62:
        if (r14 == false) goto L64;
        long r29 = selectedContainerColor;
    L66:
        if (disabledSelectedContainerColor == 16) goto L68;
        boolean r16 = true;
    L69:
        if (r16 == false) goto L71;
        long r31 = disabledSelectedContainerColor;
    L73:
        if (selectedLabelColor == 16) goto L75;
        boolean r18 = true;
    L76:
        if (r18 == false) goto L78;
        long r33 = selectedLabelColor;
    L80:
        if (selectedLeadingIconColor == 16) goto L82;
        boolean r20 = true;
    L83:
        if (r20 == false) goto L85;
        long r35 = selectedLeadingIconColor;
    L87:
        if (selectedTrailingIconColor != 16) goto L90;
        r10 = false;
    L90:
        if (r10 == false) goto L92;
        long r37 = selectedTrailingIconColor;
    L94:
        return new SelectableChipColors(r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, null);
    L92:
        r37 = this.selectedTrailingIconColor;
        goto L94
    L85:
        r35 = this.selectedLeadingIconColor;
        goto L87
    L82:
        r20 = false;
        goto L83
    L78:
        r33 = this.selectedLabelColor;
        goto L80
    L75:
        r18 = false;
        goto L76
    L71:
        r31 = this.disabledSelectedContainerColor;
        goto L73
    L68:
        r16 = false;
        goto L69
    L64:
        r29 = this.selectedContainerColor;
        goto L66
    L61:
        r14 = false;
        goto L62
    L57:
        r27 = this.disabledTrailingIconColor;
        goto L59
    L54:
        r12 = false;
        goto L55
    L50:
        r25 = this.disabledLeadingIconColor;
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
        r19 = this.trailingIconColor;
        goto L31
    L26:
        r7 = false;
        goto L27
    L22:
        r17 = this.leadingIconColor;
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

    /* JADX INFO: renamed from: containerColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2586containerColorWaAFU9c$material3_release(boolean enabled, boolean selected) {
        if (enabled == true) goto L6;
        if (selected == false) goto L11;
        return this.disabledSelectedContainerColor;
    L11:
        return this.disabledContainerColor;
    L6:
        if (selected == true) goto L9;
        return this.containerColor;
    L9:
        return this.selectedContainerColor;
    }

    /* JADX INFO: renamed from: labelColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2588labelColorWaAFU9c$material3_release(boolean enabled, boolean selected) {
        if (enabled == false) goto L8;
        if (selected == true) goto L7;
        return this.labelColor;
    L7:
        return this.selectedLabelColor;
    L8:
        return this.disabledLabelColor;
    }

    /* JADX INFO: renamed from: leadingIconContentColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2589leadingIconContentColorWaAFU9c$material3_release(boolean enabled, boolean selected) {
        if (enabled == false) goto L8;
        if (selected == true) goto L7;
        return this.leadingIconColor;
    L7:
        return this.selectedLeadingIconColor;
    L8:
        return this.disabledLeadingIconColor;
    }

    /* JADX INFO: renamed from: trailingIconContentColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2590trailingIconContentColorWaAFU9c$material3_release(boolean enabled, boolean selected) {
        if (enabled == false) goto L8;
        if (selected == true) goto L7;
        return this.trailingIconColor;
    L7:
        return this.selectedTrailingIconColor;
    L8:
        return this.disabledTrailingIconColor;
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L50:
        return false;
    L8:
        if ((other instanceof SelectableChipColors) == false) goto L50;
        if (Color.m4367equalsimpl0(this.containerColor, ((SelectableChipColors) other).containerColor) == true) goto L14;
        return false;
    L14:
        if (Color.m4367equalsimpl0(this.labelColor, ((SelectableChipColors) other).labelColor) == true) goto L17;
        return false;
    L17:
        if (Color.m4367equalsimpl0(this.leadingIconColor, ((SelectableChipColors) other).leadingIconColor) == true) goto L20;
        return false;
    L20:
        if (Color.m4367equalsimpl0(this.trailingIconColor, ((SelectableChipColors) other).trailingIconColor) == true) goto L23;
        return false;
    L23:
        if (Color.m4367equalsimpl0(this.disabledContainerColor, ((SelectableChipColors) other).disabledContainerColor) == true) goto L26;
        return false;
    L26:
        if (Color.m4367equalsimpl0(this.disabledLabelColor, ((SelectableChipColors) other).disabledLabelColor) == true) goto L29;
        return false;
    L29:
        if (Color.m4367equalsimpl0(this.disabledLeadingIconColor, ((SelectableChipColors) other).disabledLeadingIconColor) == true) goto L32;
        return false;
    L32:
        if (Color.m4367equalsimpl0(this.disabledTrailingIconColor, ((SelectableChipColors) other).disabledTrailingIconColor) == true) goto L35;
        return false;
    L35:
        if (Color.m4367equalsimpl0(this.selectedContainerColor, ((SelectableChipColors) other).selectedContainerColor) == true) goto L38;
        return false;
    L38:
        if (Color.m4367equalsimpl0(this.disabledSelectedContainerColor, ((SelectableChipColors) other).disabledSelectedContainerColor) == true) goto L41;
        return false;
    L41:
        if (Color.m4367equalsimpl0(this.selectedLabelColor, ((SelectableChipColors) other).selectedLabelColor) == true) goto L44;
        return false;
    L44:
        if (Color.m4367equalsimpl0(this.selectedLeadingIconColor, ((SelectableChipColors) other).selectedLeadingIconColor) == true) goto L47;
        return false;
    L47:
        if (Color.m4367equalsimpl0(this.selectedTrailingIconColor, ((SelectableChipColors) other).selectedTrailingIconColor) == true) goto L49;
        return false;
    L49:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.containerColor);
        int result2 = (result * 31) + Color.m4373hashCodeimpl(this.labelColor);
        return (((((((((((((((((((((result2 * 31) + Color.m4373hashCodeimpl(this.leadingIconColor)) * 31) + Color.m4373hashCodeimpl(this.trailingIconColor)) * 31) + Color.m4373hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m4373hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m4373hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m4373hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m4373hashCodeimpl(this.selectedContainerColor)) * 31) + Color.m4373hashCodeimpl(this.disabledSelectedContainerColor)) * 31) + Color.m4373hashCodeimpl(this.selectedLabelColor)) * 31) + Color.m4373hashCodeimpl(this.selectedLeadingIconColor)) * 31) + Color.m4373hashCodeimpl(this.selectedTrailingIconColor);
    }
}
