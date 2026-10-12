package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: SegmentedButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ%\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J%\u0010$\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010#J%\u0010&\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010'\u001a\u00020 H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010#J\u0088\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0013\u0010,\u001a\u00020 2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010.\u001a\u00020/H\u0016R\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0019\u0010\u000b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011R\u0019\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0011R\u0019\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u0011R\u0019\u0010\u000e\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0018\u0010\u0011R\u0019\u0010\f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\r\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001a\u0010\u0011R\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001b\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001c\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001d\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Landroidx/compose/material3/SegmentedButtonColors;", "", "activeContainerColor", "Landroidx/compose/ui/graphics/Color;", "activeContentColor", "activeBorderColor", "inactiveContainerColor", "inactiveContentColor", "inactiveBorderColor", "disabledActiveContainerColor", "disabledActiveContentColor", "disabledActiveBorderColor", "disabledInactiveContainerColor", "disabledInactiveContentColor", "disabledInactiveBorderColor", "(JJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getActiveBorderColor-0d7_KjU", "()J", "J", "getActiveContainerColor-0d7_KjU", "getActiveContentColor-0d7_KjU", "getDisabledActiveBorderColor-0d7_KjU", "getDisabledActiveContainerColor-0d7_KjU", "getDisabledActiveContentColor-0d7_KjU", "getDisabledInactiveBorderColor-0d7_KjU", "getDisabledInactiveContainerColor-0d7_KjU", "getDisabledInactiveContentColor-0d7_KjU", "getInactiveBorderColor-0d7_KjU", "getInactiveContainerColor-0d7_KjU", "getInactiveContentColor-0d7_KjU", "borderColor", "enabled", "", "active", "borderColor-WaAFU9c$material3_release", "(ZZ)J", "containerColor", "containerColor-WaAFU9c$material3_release", "contentColor", "checked", "contentColor-WaAFU9c$material3_release", "copy", "copy-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material3/SegmentedButtonColors;", "equals", "other", "hashCode", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SegmentedButtonColors {
    public static final int $stable = 0;
    private final long activeBorderColor;
    private final long activeContainerColor;
    private final long activeContentColor;
    private final long disabledActiveBorderColor;
    private final long disabledActiveContainerColor;
    private final long disabledActiveContentColor;
    private final long disabledInactiveBorderColor;
    private final long disabledInactiveContainerColor;
    private final long disabledInactiveContentColor;
    private final long inactiveBorderColor;
    private final long inactiveContainerColor;
    private final long inactiveContentColor;

    static {
    }

    public /* synthetic */ SegmentedButtonColors(long r1, long r3, long r5, long r7, long r9, long r11, long r13, long r15, long r17, long r19, long r21, long r23, DefaultConstructorMarker r25) {
        this(r1, r3, r5, r7, r9, r11, r13, r15, r17, r19, r21, r23);
    }

    private SegmentedButtonColors(long activeContainerColor, long activeContentColor, long activeBorderColor, long inactiveContainerColor, long inactiveContentColor, long inactiveBorderColor, long disabledActiveContainerColor, long disabledActiveContentColor, long disabledActiveBorderColor, long disabledInactiveContainerColor, long disabledInactiveContentColor, long disabledInactiveBorderColor) {
        this.activeContainerColor = activeContainerColor;
        this.activeContentColor = activeContentColor;
        this.activeBorderColor = activeBorderColor;
        this.inactiveContainerColor = inactiveContainerColor;
        this.inactiveContentColor = inactiveContentColor;
        this.inactiveBorderColor = inactiveBorderColor;
        this.disabledActiveContainerColor = disabledActiveContainerColor;
        this.disabledActiveContentColor = disabledActiveContentColor;
        this.disabledActiveBorderColor = disabledActiveBorderColor;
        this.disabledInactiveContainerColor = disabledInactiveContainerColor;
        this.disabledInactiveContentColor = disabledInactiveContentColor;
        this.disabledInactiveBorderColor = disabledInactiveBorderColor;
    }

    /* JADX INFO: renamed from: getActiveContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2566getActiveContainerColor0d7_KjU() {
        return this.activeContainerColor;
    }

    /* JADX INFO: renamed from: getActiveContentColor-0d7_KjU, reason: not valid java name */
    public final long m2567getActiveContentColor0d7_KjU() {
        return this.activeContentColor;
    }

    /* JADX INFO: renamed from: getActiveBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2565getActiveBorderColor0d7_KjU() {
        return this.activeBorderColor;
    }

    /* JADX INFO: renamed from: getInactiveContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2575getInactiveContainerColor0d7_KjU() {
        return this.inactiveContainerColor;
    }

    /* JADX INFO: renamed from: getInactiveContentColor-0d7_KjU, reason: not valid java name */
    public final long m2576getInactiveContentColor0d7_KjU() {
        return this.inactiveContentColor;
    }

    /* JADX INFO: renamed from: getInactiveBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2574getInactiveBorderColor0d7_KjU() {
        return this.inactiveBorderColor;
    }

    /* JADX INFO: renamed from: getDisabledActiveContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2569getDisabledActiveContainerColor0d7_KjU() {
        return this.disabledActiveContainerColor;
    }

    /* JADX INFO: renamed from: getDisabledActiveContentColor-0d7_KjU, reason: not valid java name */
    public final long m2570getDisabledActiveContentColor0d7_KjU() {
        return this.disabledActiveContentColor;
    }

    /* JADX INFO: renamed from: getDisabledActiveBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2568getDisabledActiveBorderColor0d7_KjU() {
        return this.disabledActiveBorderColor;
    }

    /* JADX INFO: renamed from: getDisabledInactiveContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2572getDisabledInactiveContainerColor0d7_KjU() {
        return this.disabledInactiveContainerColor;
    }

    /* JADX INFO: renamed from: getDisabledInactiveContentColor-0d7_KjU, reason: not valid java name */
    public final long m2573getDisabledInactiveContentColor0d7_KjU() {
        return this.disabledInactiveContentColor;
    }

    /* JADX INFO: renamed from: getDisabledInactiveBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2571getDisabledInactiveBorderColor0d7_KjU() {
        return this.disabledInactiveBorderColor;
    }

    /* JADX INFO: renamed from: copy-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ SegmentedButtonColors m2560copy2qZNXz8$default(SegmentedButtonColors r18, long r19, long r21, long r23, long r25, long r27, long r29, long r31, long r33, long r35, long r37, long r39, long r41, int r43, Object r44) {
        if ((r43 & 1) == 0) goto L5;
        long r2 = r18.activeContainerColor;
    L7:
        if ((r43 & 2) == 0) goto L9;
        long r4 = r18.activeContentColor;
    L11:
        if ((r43 & 4) == 0) goto L13;
        long r6 = r18.activeBorderColor;
    L15:
        if ((r43 & 8) == 0) goto L17;
        long r8 = r18.inactiveContainerColor;
    L19:
        if ((r43 & 16) == 0) goto L21;
        long r10 = r18.inactiveContentColor;
    L23:
        if ((r43 & 32) == 0) goto L25;
        long r12 = r18.inactiveBorderColor;
    L27:
        if ((r43 & 64) == 0) goto L29;
        long r14 = r18.disabledActiveContainerColor;
    L30:
        long r16 = r2;
        if ((r43 & 128) == 0) goto L33;
        long r3 = r18.disabledActiveContentColor;
    L34:
        long r110 = r3;
        if ((r43 & 256) == 0) goto L37;
        long r5 = r18.disabledActiveBorderColor;
    L38:
        long r22 = r5;
        if ((r43 & 512) == 0) goto L41;
        long r7 = r18.disabledInactiveContainerColor;
    L42:
        long r24 = r7;
        if ((r43 & 1024) == 0) goto L45;
        long r9 = r18.disabledInactiveContentColor;
    L47:
        if ((r43 & 2048) == 0) goto L49;
        long r1 = r18.disabledInactiveBorderColor;
    L50:
        long r26 = r4;
        long r28 = r6;
        long r210 = r8;
        long r211 = r10;
        long r30 = r12;
        long r32 = r14;
        return r18.m2564copy2qZNXz8(r16, r26, r28, r210, r211, r30, r32, r110, r22, r24, r9, r1);
    L49:
        r1 = r41;
        goto L50
    L45:
        r9 = r39;
        goto L47
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

    /* JADX INFO: renamed from: copy-2qZNXz8, reason: not valid java name */
    public final SegmentedButtonColors m2564copy2qZNXz8(long activeContainerColor, long activeContentColor, long activeBorderColor, long inactiveContainerColor, long inactiveContentColor, long inactiveBorderColor, long disabledActiveContainerColor, long disabledActiveContentColor, long disabledActiveBorderColor, long disabledInactiveContainerColor, long disabledInactiveContentColor, long disabledInactiveBorderColor) {
        boolean r10 = true;
        if (activeContainerColor == 16) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L8;
        long r13 = activeContainerColor;
    L10:
        if (activeContentColor == 16) goto L12;
        boolean r5 = true;
    L13:
        if (r5 == false) goto L15;
        long r15 = activeContentColor;
    L17:
        if (activeBorderColor == 16) goto L19;
        boolean r6 = true;
    L20:
        if (r6 == false) goto L22;
        long r17 = activeBorderColor;
    L24:
        if (inactiveContainerColor == 16) goto L26;
        boolean r7 = true;
    L27:
        if (r7 == false) goto L29;
        long r19 = inactiveContainerColor;
    L31:
        if (inactiveContentColor == 16) goto L33;
        boolean r8 = true;
    L34:
        if (r8 == false) goto L36;
        long r21 = inactiveContentColor;
    L38:
        if (inactiveBorderColor == 16) goto L40;
        boolean r9 = true;
    L41:
        if (r9 == false) goto L43;
        long r23 = inactiveBorderColor;
    L45:
        if (disabledActiveContainerColor == 16) goto L47;
        boolean r11 = true;
    L48:
        if (r11 == false) goto L50;
        long r25 = disabledActiveContainerColor;
    L52:
        if (disabledActiveContentColor == 16) goto L54;
        boolean r12 = true;
    L55:
        if (r12 == false) goto L57;
        long r27 = disabledActiveContentColor;
    L59:
        if (disabledActiveBorderColor == 16) goto L61;
        boolean r14 = true;
    L62:
        if (r14 == false) goto L64;
        long r29 = disabledActiveBorderColor;
    L66:
        if (disabledInactiveContainerColor == 16) goto L68;
        boolean r16 = true;
    L69:
        if (r16 == false) goto L71;
        long r31 = disabledInactiveContainerColor;
    L73:
        if (disabledInactiveContentColor == 16) goto L75;
        boolean r18 = true;
    L76:
        if (r18 == false) goto L78;
        long r33 = disabledInactiveContentColor;
    L80:
        if (disabledInactiveBorderColor != 16) goto L83;
        r10 = false;
    L83:
        if (r10 == false) goto L85;
        long r35 = disabledInactiveBorderColor;
    L87:
        return new SegmentedButtonColors(r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, null);
    L85:
        r35 = this.disabledInactiveBorderColor;
        goto L87
    L78:
        r33 = this.disabledInactiveContentColor;
        goto L80
    L75:
        r18 = false;
        goto L76
    L71:
        r31 = this.disabledInactiveContainerColor;
        goto L73
    L68:
        r16 = false;
        goto L69
    L64:
        r29 = this.disabledActiveBorderColor;
        goto L66
    L61:
        r14 = false;
        goto L62
    L57:
        r27 = this.disabledActiveContentColor;
        goto L59
    L54:
        r12 = false;
        goto L55
    L50:
        r25 = this.disabledActiveContainerColor;
        goto L52
    L47:
        r11 = false;
        goto L48
    L43:
        r23 = this.inactiveBorderColor;
        goto L45
    L40:
        r9 = false;
        goto L41
    L36:
        r21 = this.inactiveContentColor;
        goto L38
    L33:
        r8 = false;
        goto L34
    L29:
        r19 = this.inactiveContainerColor;
        goto L31
    L26:
        r7 = false;
        goto L27
    L22:
        r17 = this.activeBorderColor;
        goto L24
    L19:
        r6 = false;
        goto L20
    L15:
        r15 = this.activeContentColor;
        goto L17
    L12:
        r5 = false;
        goto L13
    L8:
        r13 = this.activeContainerColor;
        goto L10
    L5:
        r4 = false;
        goto L6
    }

    /* JADX INFO: renamed from: borderColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2561borderColorWaAFU9c$material3_release(boolean enabled, boolean active) {
        if (enabled == false) goto L5;
        if (active == false) goto L5;
        return this.activeBorderColor;
    L5:
        if (enabled == false) goto L8;
        if (active == true) goto L8;
        return this.inactiveBorderColor;
    L8:
        if (enabled == true) goto L12;
        if (active == false) goto L12;
        return this.disabledActiveBorderColor;
    L12:
        return this.disabledInactiveBorderColor;
    }

    /* JADX INFO: renamed from: contentColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2563contentColorWaAFU9c$material3_release(boolean enabled, boolean checked) {
        if (enabled == false) goto L5;
        if (checked == false) goto L5;
        return this.activeContentColor;
    L5:
        if (enabled == false) goto L8;
        if (checked == true) goto L8;
        return this.inactiveContentColor;
    L8:
        if (enabled == true) goto L12;
        if (checked == false) goto L12;
        return this.disabledActiveContentColor;
    L12:
        return this.disabledInactiveContentColor;
    }

    /* JADX INFO: renamed from: containerColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2562containerColorWaAFU9c$material3_release(boolean enabled, boolean active) {
        if (enabled == false) goto L5;
        if (active == false) goto L5;
        return this.activeContainerColor;
    L5:
        if (enabled == false) goto L8;
        if (active == true) goto L8;
        return this.inactiveContainerColor;
    L8:
        if (enabled == true) goto L12;
        if (active == false) goto L12;
        return this.disabledActiveContainerColor;
    L12:
        return this.disabledInactiveContainerColor;
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L9;
        return false;
    L9:
        if (getClass() == other.getClass()) goto L11;
        return false;
    L11:
        SegmentedButtonColors r2 = (SegmentedButtonColors) other;
        if (Color.m4367equalsimpl0(this.activeBorderColor, ((SegmentedButtonColors) other).activeBorderColor) == true) goto L15;
        return false;
    L15:
        if (Color.m4367equalsimpl0(this.activeContentColor, ((SegmentedButtonColors) other).activeContentColor) == true) goto L18;
        return false;
    L18:
        if (Color.m4367equalsimpl0(this.activeContainerColor, ((SegmentedButtonColors) other).activeContainerColor) == true) goto L21;
        return false;
    L21:
        if (Color.m4367equalsimpl0(this.inactiveBorderColor, ((SegmentedButtonColors) other).inactiveBorderColor) == true) goto L24;
        return false;
    L24:
        if (Color.m4367equalsimpl0(this.inactiveContentColor, ((SegmentedButtonColors) other).inactiveContentColor) == true) goto L27;
        return false;
    L27:
        if (Color.m4367equalsimpl0(this.inactiveContainerColor, ((SegmentedButtonColors) other).inactiveContainerColor) == true) goto L30;
        return false;
    L30:
        if (Color.m4367equalsimpl0(this.disabledActiveBorderColor, ((SegmentedButtonColors) other).disabledActiveBorderColor) == true) goto L33;
        return false;
    L33:
        if (Color.m4367equalsimpl0(this.disabledActiveContentColor, ((SegmentedButtonColors) other).disabledActiveContentColor) == true) goto L36;
        return false;
    L36:
        if (Color.m4367equalsimpl0(this.disabledActiveContainerColor, ((SegmentedButtonColors) other).disabledActiveContainerColor) == true) goto L39;
        return false;
    L39:
        if (Color.m4367equalsimpl0(this.disabledInactiveBorderColor, ((SegmentedButtonColors) other).disabledInactiveBorderColor) == true) goto L42;
        return false;
    L42:
        if (Color.m4367equalsimpl0(this.disabledInactiveContentColor, ((SegmentedButtonColors) other).disabledInactiveContentColor) == true) goto L45;
        return false;
    L45:
        if (Color.m4367equalsimpl0(this.disabledInactiveContainerColor, ((SegmentedButtonColors) other).disabledInactiveContainerColor) == true) goto L47;
        return false;
    L47:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.activeBorderColor);
        int result2 = (result * 31) + Color.m4373hashCodeimpl(this.activeContentColor);
        return (((((((((((((((((((result2 * 31) + Color.m4373hashCodeimpl(this.activeContainerColor)) * 31) + Color.m4373hashCodeimpl(this.inactiveBorderColor)) * 31) + Color.m4373hashCodeimpl(this.inactiveContentColor)) * 31) + Color.m4373hashCodeimpl(this.inactiveContainerColor)) * 31) + Color.m4373hashCodeimpl(this.disabledActiveBorderColor)) * 31) + Color.m4373hashCodeimpl(this.disabledActiveContentColor)) * 31) + Color.m4373hashCodeimpl(this.disabledActiveContainerColor)) * 31) + Color.m4373hashCodeimpl(this.disabledInactiveBorderColor)) * 31) + Color.m4373hashCodeimpl(this.disabledInactiveContentColor)) * 31) + Color.m4373hashCodeimpl(this.disabledInactiveContainerColor);
    }
}
