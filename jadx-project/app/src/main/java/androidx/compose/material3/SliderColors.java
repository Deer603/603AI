package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJt\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\u001d\u0010\u0002\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u001eH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$J%\u0010%\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u001eH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(J%\u0010)\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u001eH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010(R\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0019\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0019\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u0019\u0010\f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0014\u0010\u000fR\u0019\u0010\u000b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0015\u0010\u000fR\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0019\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/material3/SliderColors;", "", "thumbColor", "Landroidx/compose/ui/graphics/Color;", "activeTrackColor", "activeTickColor", "inactiveTrackColor", "inactiveTickColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "(JJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getActiveTickColor-0d7_KjU", "()J", "J", "getActiveTrackColor-0d7_KjU", "getDisabledActiveTickColor-0d7_KjU", "getDisabledActiveTrackColor-0d7_KjU", "getDisabledInactiveTickColor-0d7_KjU", "getDisabledInactiveTrackColor-0d7_KjU", "getDisabledThumbColor-0d7_KjU", "getInactiveTickColor-0d7_KjU", "getInactiveTrackColor-0d7_KjU", "getThumbColor-0d7_KjU", "copy", "copy--K518z4", "(JJJJJJJJJJ)Landroidx/compose/material3/SliderColors;", "equals", "", "other", "hashCode", "", "enabled", "thumbColor-vNxB06k$material3_release", "(Z)J", "tickColor", "active", "tickColor-WaAFU9c$material3_release", "(ZZ)J", "trackColor", "trackColor-WaAFU9c$material3_release", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SliderColors {
    public static final int $stable = 0;
    private final long activeTickColor;
    private final long activeTrackColor;
    private final long disabledActiveTickColor;
    private final long disabledActiveTrackColor;
    private final long disabledInactiveTickColor;
    private final long disabledInactiveTrackColor;
    private final long disabledThumbColor;
    private final long inactiveTickColor;
    private final long inactiveTrackColor;
    private final long thumbColor;

    static {
    }

    public /* synthetic */ SliderColors(long r1, long r3, long r5, long r7, long r9, long r11, long r13, long r15, long r17, long r19, DefaultConstructorMarker r21) {
        this(r1, r3, r5, r7, r9, r11, r13, r15, r17, r19);
    }

    private SliderColors(long thumbColor, long activeTrackColor, long activeTickColor, long inactiveTrackColor, long inactiveTickColor, long disabledThumbColor, long disabledActiveTrackColor, long disabledActiveTickColor, long disabledInactiveTrackColor, long disabledInactiveTickColor) {
        this.thumbColor = thumbColor;
        this.activeTrackColor = activeTrackColor;
        this.activeTickColor = activeTickColor;
        this.inactiveTrackColor = inactiveTrackColor;
        this.inactiveTickColor = inactiveTickColor;
        this.disabledThumbColor = disabledThumbColor;
        this.disabledActiveTrackColor = disabledActiveTrackColor;
        this.disabledActiveTickColor = disabledActiveTickColor;
        this.disabledInactiveTrackColor = disabledInactiveTrackColor;
        this.disabledInactiveTickColor = disabledInactiveTickColor;
    }

    /* JADX INFO: renamed from: getThumbColor-0d7_KjU, reason: not valid java name */
    public final long m2610getThumbColor0d7_KjU() {
        return this.thumbColor;
    }

    /* JADX INFO: renamed from: getActiveTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2602getActiveTrackColor0d7_KjU() {
        return this.activeTrackColor;
    }

    /* JADX INFO: renamed from: getActiveTickColor-0d7_KjU, reason: not valid java name */
    public final long m2601getActiveTickColor0d7_KjU() {
        return this.activeTickColor;
    }

    /* JADX INFO: renamed from: getInactiveTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2609getInactiveTrackColor0d7_KjU() {
        return this.inactiveTrackColor;
    }

    /* JADX INFO: renamed from: getInactiveTickColor-0d7_KjU, reason: not valid java name */
    public final long m2608getInactiveTickColor0d7_KjU() {
        return this.inactiveTickColor;
    }

    /* JADX INFO: renamed from: getDisabledThumbColor-0d7_KjU, reason: not valid java name */
    public final long m2607getDisabledThumbColor0d7_KjU() {
        return this.disabledThumbColor;
    }

    /* JADX INFO: renamed from: getDisabledActiveTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2604getDisabledActiveTrackColor0d7_KjU() {
        return this.disabledActiveTrackColor;
    }

    /* JADX INFO: renamed from: getDisabledActiveTickColor-0d7_KjU, reason: not valid java name */
    public final long m2603getDisabledActiveTickColor0d7_KjU() {
        return this.disabledActiveTickColor;
    }

    /* JADX INFO: renamed from: getDisabledInactiveTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2606getDisabledInactiveTrackColor0d7_KjU() {
        return this.disabledInactiveTrackColor;
    }

    /* JADX INFO: renamed from: getDisabledInactiveTickColor-0d7_KjU, reason: not valid java name */
    public final long m2605getDisabledInactiveTickColor0d7_KjU() {
        return this.disabledInactiveTickColor;
    }

    /* JADX INFO: renamed from: copy--K518z4$default, reason: not valid java name */
    public static /* synthetic */ SliderColors m2599copyK518z4$default(SliderColors r18, long r19, long r21, long r23, long r25, long r27, long r29, long r31, long r33, long r35, long r37, int r39, Object r40) {
        if ((r39 & 1) == 0) goto L5;
        long r2 = r18.thumbColor;
    L7:
        if ((r39 & 2) == 0) goto L9;
        long r4 = r18.activeTrackColor;
    L11:
        if ((r39 & 4) == 0) goto L13;
        long r6 = r18.activeTickColor;
    L15:
        if ((r39 & 8) == 0) goto L17;
        long r8 = r18.inactiveTrackColor;
    L19:
        if ((r39 & 16) == 0) goto L21;
        long r10 = r18.inactiveTickColor;
    L23:
        if ((r39 & 32) == 0) goto L25;
        long r12 = r18.disabledThumbColor;
    L27:
        if ((r39 & 64) == 0) goto L29;
        long r14 = r18.disabledActiveTrackColor;
    L30:
        long r16 = r2;
        if ((r39 & 128) == 0) goto L33;
        long r3 = r18.disabledActiveTickColor;
    L34:
        long r110 = r3;
        if ((r39 & 256) == 0) goto L37;
        long r5 = r18.disabledInactiveTrackColor;
    L39:
        if ((r39 & 512) == 0) goto L41;
        long r1 = r18.disabledInactiveTickColor;
    L42:
        long r22 = r4;
        long r24 = r6;
        long r26 = r8;
        long r28 = r10;
        long r30 = r12;
        long r32 = r14;
        return r18.m2600copyK518z4(r16, r22, r24, r26, r28, r30, r32, r110, r5, r1);
    L41:
        r1 = r37;
        goto L42
    L37:
        r5 = r35;
        goto L39
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

    /* JADX INFO: renamed from: copy--K518z4, reason: not valid java name */
    public final SliderColors m2600copyK518z4(long thumbColor, long activeTrackColor, long activeTickColor, long inactiveTrackColor, long inactiveTickColor, long disabledThumbColor, long disabledActiveTrackColor, long disabledActiveTickColor, long disabledInactiveTrackColor, long disabledInactiveTickColor) {
        boolean r10 = true;
        if (thumbColor == 16) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L8;
        long r13 = thumbColor;
    L10:
        if (activeTrackColor == 16) goto L12;
        boolean r5 = true;
    L13:
        if (r5 == false) goto L15;
        long r15 = activeTrackColor;
    L17:
        if (activeTickColor == 16) goto L19;
        boolean r6 = true;
    L20:
        if (r6 == false) goto L22;
        long r17 = activeTickColor;
    L24:
        if (inactiveTrackColor == 16) goto L26;
        boolean r7 = true;
    L27:
        if (r7 == false) goto L29;
        long r19 = inactiveTrackColor;
    L31:
        if (inactiveTickColor == 16) goto L33;
        boolean r8 = true;
    L34:
        if (r8 == false) goto L36;
        long r21 = inactiveTickColor;
    L38:
        if (disabledThumbColor == 16) goto L40;
        boolean r9 = true;
    L41:
        if (r9 == false) goto L43;
        long r23 = disabledThumbColor;
    L45:
        if (disabledActiveTrackColor == 16) goto L47;
        boolean r11 = true;
    L48:
        if (r11 == false) goto L50;
        long r25 = disabledActiveTrackColor;
    L52:
        if (disabledActiveTickColor == 16) goto L54;
        boolean r12 = true;
    L55:
        if (r12 == false) goto L57;
        long r27 = disabledActiveTickColor;
    L59:
        if (disabledInactiveTrackColor == 16) goto L61;
        boolean r14 = true;
    L62:
        if (r14 == false) goto L64;
        long r29 = disabledInactiveTrackColor;
    L66:
        if (disabledInactiveTickColor != 16) goto L69;
        r10 = false;
    L69:
        if (r10 == false) goto L71;
        long r31 = disabledInactiveTickColor;
    L73:
        return new SliderColors(r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, null);
    L71:
        r31 = this.disabledInactiveTickColor;
        goto L73
    L64:
        r29 = this.disabledInactiveTrackColor;
        goto L66
    L61:
        r14 = false;
        goto L62
    L57:
        r27 = this.disabledActiveTickColor;
        goto L59
    L54:
        r12 = false;
        goto L55
    L50:
        r25 = this.disabledActiveTrackColor;
        goto L52
    L47:
        r11 = false;
        goto L48
    L43:
        r23 = this.disabledThumbColor;
        goto L45
    L40:
        r9 = false;
        goto L41
    L36:
        r21 = this.inactiveTickColor;
        goto L38
    L33:
        r8 = false;
        goto L34
    L29:
        r19 = this.inactiveTrackColor;
        goto L31
    L26:
        r7 = false;
        goto L27
    L22:
        r17 = this.activeTickColor;
        goto L24
    L19:
        r6 = false;
        goto L20
    L15:
        r15 = this.activeTrackColor;
        goto L17
    L12:
        r5 = false;
        goto L13
    L8:
        r13 = this.thumbColor;
        goto L10
    L5:
        r4 = false;
        goto L6
    }

    /* JADX INFO: renamed from: thumbColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2611thumbColorvNxB06k$material3_release(boolean enabled) {
        if (enabled == false) goto L5;
        return this.thumbColor;
    L5:
        return this.disabledThumbColor;
    }

    /* JADX INFO: renamed from: trackColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2613trackColorWaAFU9c$material3_release(boolean enabled, boolean active) {
        if (enabled == false) goto L6;
        if (active == false) goto L11;
        return this.activeTrackColor;
    L11:
        return this.inactiveTrackColor;
    L6:
        if (active == false) goto L9;
        return this.disabledActiveTrackColor;
    L9:
        return this.disabledInactiveTrackColor;
    }

    /* JADX INFO: renamed from: tickColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2612tickColorWaAFU9c$material3_release(boolean enabled, boolean active) {
        if (enabled == false) goto L6;
        if (active == false) goto L11;
        return this.activeTickColor;
    L11:
        return this.inactiveTickColor;
    L6:
        if (active == false) goto L9;
        return this.disabledActiveTickColor;
    L9:
        return this.disabledInactiveTickColor;
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L41:
        return false;
    L8:
        if ((other instanceof SliderColors) == false) goto L41;
        if (Color.m4367equalsimpl0(this.thumbColor, ((SliderColors) other).thumbColor) == true) goto L14;
        return false;
    L14:
        if (Color.m4367equalsimpl0(this.activeTrackColor, ((SliderColors) other).activeTrackColor) == true) goto L17;
        return false;
    L17:
        if (Color.m4367equalsimpl0(this.activeTickColor, ((SliderColors) other).activeTickColor) == true) goto L20;
        return false;
    L20:
        if (Color.m4367equalsimpl0(this.inactiveTrackColor, ((SliderColors) other).inactiveTrackColor) == true) goto L23;
        return false;
    L23:
        if (Color.m4367equalsimpl0(this.inactiveTickColor, ((SliderColors) other).inactiveTickColor) == true) goto L26;
        return false;
    L26:
        if (Color.m4367equalsimpl0(this.disabledThumbColor, ((SliderColors) other).disabledThumbColor) == true) goto L29;
        return false;
    L29:
        if (Color.m4367equalsimpl0(this.disabledActiveTrackColor, ((SliderColors) other).disabledActiveTrackColor) == true) goto L32;
        return false;
    L32:
        if (Color.m4367equalsimpl0(this.disabledActiveTickColor, ((SliderColors) other).disabledActiveTickColor) == true) goto L35;
        return false;
    L35:
        if (Color.m4367equalsimpl0(this.disabledInactiveTrackColor, ((SliderColors) other).disabledInactiveTrackColor) == true) goto L38;
        return false;
    L38:
        if (Color.m4367equalsimpl0(this.disabledInactiveTickColor, ((SliderColors) other).disabledInactiveTickColor) == true) goto L40;
        return false;
    L40:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.thumbColor);
        int result2 = (result * 31) + Color.m4373hashCodeimpl(this.activeTrackColor);
        return (((((((((((((((result2 * 31) + Color.m4373hashCodeimpl(this.activeTickColor)) * 31) + Color.m4373hashCodeimpl(this.inactiveTrackColor)) * 31) + Color.m4373hashCodeimpl(this.inactiveTickColor)) * 31) + Color.m4373hashCodeimpl(this.disabledThumbColor)) * 31) + Color.m4373hashCodeimpl(this.disabledActiveTrackColor)) * 31) + Color.m4373hashCodeimpl(this.disabledActiveTickColor)) * 31) + Color.m4373hashCodeimpl(this.disabledInactiveTrackColor)) * 31) + Color.m4373hashCodeimpl(this.disabledInactiveTickColor);
    }
}
