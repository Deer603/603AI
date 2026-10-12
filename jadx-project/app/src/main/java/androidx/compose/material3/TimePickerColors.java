package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\u001d\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u009c\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0013\u0010*\u001a\u00020$2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010,\u001a\u00020-H\u0016J\u001d\u0010.\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010&J\u001d\u00100\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010&J\u001d\u00102\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u0010&J\u001d\u00104\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u0010&R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0013R\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0017\u0010\u0013R\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0018\u0010\u0013R\u0019\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0019\u0010\u0013R\u0019\u0010\u000b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001a\u0010\u0013R\u0019\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001b\u0010\u0013R\u0019\u0010\f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001c\u0010\u0013R\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001d\u0010\u0013R\u0019\u0010\r\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001e\u0010\u0013R\u0019\u0010\u000f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001f\u0010\u0013R\u0019\u0010\u000e\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b \u0010\u0013R\u0019\u0010\u0010\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b!\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Landroidx/compose/material3/TimePickerColors;", "", "clockDialColor", "Landroidx/compose/ui/graphics/Color;", "selectorColor", "containerColor", "periodSelectorBorderColor", "clockDialSelectedContentColor", "clockDialUnselectedContentColor", "periodSelectorSelectedContainerColor", "periodSelectorUnselectedContainerColor", "periodSelectorSelectedContentColor", "periodSelectorUnselectedContentColor", "timeSelectorSelectedContainerColor", "timeSelectorUnselectedContainerColor", "timeSelectorSelectedContentColor", "timeSelectorUnselectedContentColor", "(JJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getClockDialColor-0d7_KjU", "()J", "J", "getClockDialSelectedContentColor-0d7_KjU", "getClockDialUnselectedContentColor-0d7_KjU", "getContainerColor-0d7_KjU", "getPeriodSelectorBorderColor-0d7_KjU", "getPeriodSelectorSelectedContainerColor-0d7_KjU", "getPeriodSelectorSelectedContentColor-0d7_KjU", "getPeriodSelectorUnselectedContainerColor-0d7_KjU", "getPeriodSelectorUnselectedContentColor-0d7_KjU", "getSelectorColor-0d7_KjU", "getTimeSelectorSelectedContainerColor-0d7_KjU", "getTimeSelectorSelectedContentColor-0d7_KjU", "getTimeSelectorUnselectedContainerColor-0d7_KjU", "getTimeSelectorUnselectedContentColor-0d7_KjU", "clockDialContentColor", "selected", "", "clockDialContentColor-vNxB06k$material3_release", "(Z)J", "copy", "copy-dVHXu7A", "(JJJJJJJJJJJJJJ)Landroidx/compose/material3/TimePickerColors;", "equals", "other", "hashCode", "", "periodSelectorContainerColor", "periodSelectorContainerColor-vNxB06k$material3_release", "periodSelectorContentColor", "periodSelectorContentColor-vNxB06k$material3_release", "timeSelectorContainerColor", "timeSelectorContainerColor-vNxB06k$material3_release", "timeSelectorContentColor", "timeSelectorContentColor-vNxB06k$material3_release", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TimePickerColors {
    public static final int $stable = 0;
    private final long clockDialColor;
    private final long clockDialSelectedContentColor;
    private final long clockDialUnselectedContentColor;
    private final long containerColor;
    private final long periodSelectorBorderColor;
    private final long periodSelectorSelectedContainerColor;
    private final long periodSelectorSelectedContentColor;
    private final long periodSelectorUnselectedContainerColor;
    private final long periodSelectorUnselectedContentColor;
    private final long selectorColor;
    private final long timeSelectorSelectedContainerColor;
    private final long timeSelectorSelectedContentColor;
    private final long timeSelectorUnselectedContainerColor;
    private final long timeSelectorUnselectedContentColor;

    static {
    }

    public /* synthetic */ TimePickerColors(long r1, long r3, long r5, long r7, long r9, long r11, long r13, long r15, long r17, long r19, long r21, long r23, long r25, long r27, DefaultConstructorMarker r29) {
        this(r1, r3, r5, r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27);
    }

    private TimePickerColors(long clockDialColor, long selectorColor, long containerColor, long periodSelectorBorderColor, long clockDialSelectedContentColor, long clockDialUnselectedContentColor, long periodSelectorSelectedContainerColor, long periodSelectorUnselectedContainerColor, long periodSelectorSelectedContentColor, long periodSelectorUnselectedContentColor, long timeSelectorSelectedContainerColor, long timeSelectorUnselectedContainerColor, long timeSelectorSelectedContentColor, long timeSelectorUnselectedContentColor) {
        this.clockDialColor = clockDialColor;
        this.selectorColor = selectorColor;
        this.containerColor = containerColor;
        this.periodSelectorBorderColor = periodSelectorBorderColor;
        this.clockDialSelectedContentColor = clockDialSelectedContentColor;
        this.clockDialUnselectedContentColor = clockDialUnselectedContentColor;
        this.periodSelectorSelectedContainerColor = periodSelectorSelectedContainerColor;
        this.periodSelectorUnselectedContainerColor = periodSelectorUnselectedContainerColor;
        this.periodSelectorSelectedContentColor = periodSelectorSelectedContentColor;
        this.periodSelectorUnselectedContentColor = periodSelectorUnselectedContentColor;
        this.timeSelectorSelectedContainerColor = timeSelectorSelectedContainerColor;
        this.timeSelectorUnselectedContainerColor = timeSelectorUnselectedContainerColor;
        this.timeSelectorSelectedContentColor = timeSelectorSelectedContentColor;
        this.timeSelectorUnselectedContentColor = timeSelectorUnselectedContentColor;
    }

    /* JADX INFO: renamed from: getClockDialColor-0d7_KjU, reason: not valid java name */
    public final long m2826getClockDialColor0d7_KjU() {
        return this.clockDialColor;
    }

    /* JADX INFO: renamed from: getSelectorColor-0d7_KjU, reason: not valid java name */
    public final long m2835getSelectorColor0d7_KjU() {
        return this.selectorColor;
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2829getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getPeriodSelectorBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2830getPeriodSelectorBorderColor0d7_KjU() {
        return this.periodSelectorBorderColor;
    }

    /* JADX INFO: renamed from: getClockDialSelectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2827getClockDialSelectedContentColor0d7_KjU() {
        return this.clockDialSelectedContentColor;
    }

    /* JADX INFO: renamed from: getClockDialUnselectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2828getClockDialUnselectedContentColor0d7_KjU() {
        return this.clockDialUnselectedContentColor;
    }

    /* JADX INFO: renamed from: getPeriodSelectorSelectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2831getPeriodSelectorSelectedContainerColor0d7_KjU() {
        return this.periodSelectorSelectedContainerColor;
    }

    /* JADX INFO: renamed from: getPeriodSelectorUnselectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2833getPeriodSelectorUnselectedContainerColor0d7_KjU() {
        return this.periodSelectorUnselectedContainerColor;
    }

    /* JADX INFO: renamed from: getPeriodSelectorSelectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2832getPeriodSelectorSelectedContentColor0d7_KjU() {
        return this.periodSelectorSelectedContentColor;
    }

    /* JADX INFO: renamed from: getPeriodSelectorUnselectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2834getPeriodSelectorUnselectedContentColor0d7_KjU() {
        return this.periodSelectorUnselectedContentColor;
    }

    /* JADX INFO: renamed from: getTimeSelectorSelectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2836getTimeSelectorSelectedContainerColor0d7_KjU() {
        return this.timeSelectorSelectedContainerColor;
    }

    /* JADX INFO: renamed from: getTimeSelectorUnselectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2838getTimeSelectorUnselectedContainerColor0d7_KjU() {
        return this.timeSelectorUnselectedContainerColor;
    }

    /* JADX INFO: renamed from: getTimeSelectorSelectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2837getTimeSelectorSelectedContentColor0d7_KjU() {
        return this.timeSelectorSelectedContentColor;
    }

    /* JADX INFO: renamed from: getTimeSelectorUnselectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2839getTimeSelectorUnselectedContentColor0d7_KjU() {
        return this.timeSelectorUnselectedContentColor;
    }

    /* JADX INFO: renamed from: copy-dVHXu7A$default, reason: not valid java name */
    public static /* synthetic */ TimePickerColors m2823copydVHXu7A$default(TimePickerColors r18, long r19, long r21, long r23, long r25, long r27, long r29, long r31, long r33, long r35, long r37, long r39, long r41, long r43, long r45, int r47, Object r48) {
        if ((r47 & 1) == 0) goto L5;
        long r2 = r18.containerColor;
    L7:
        if ((r47 & 2) == 0) goto L9;
        long r4 = r18.selectorColor;
    L11:
        if ((r47 & 4) == 0) goto L13;
        long r6 = r18.containerColor;
    L15:
        if ((r47 & 8) == 0) goto L17;
        long r8 = r18.periodSelectorBorderColor;
    L19:
        if ((r47 & 16) == 0) goto L21;
        long r10 = r18.clockDialSelectedContentColor;
    L23:
        if ((r47 & 32) == 0) goto L25;
        long r12 = r18.clockDialUnselectedContentColor;
    L27:
        if ((r47 & 64) == 0) goto L29;
        long r14 = r18.periodSelectorSelectedContainerColor;
    L30:
        long r16 = r2;
        if ((r47 & 128) == 0) goto L33;
        long r3 = r18.periodSelectorUnselectedContainerColor;
    L34:
        long r110 = r3;
        if ((r47 & 256) == 0) goto L37;
        long r5 = r18.periodSelectorSelectedContentColor;
    L38:
        long r22 = r5;
        if ((r47 & 512) == 0) goto L41;
        long r7 = r18.periodSelectorUnselectedContentColor;
    L42:
        long r24 = r7;
        if ((r47 & 1024) == 0) goto L45;
        long r9 = r18.timeSelectorSelectedContainerColor;
    L46:
        long r26 = r9;
        if ((r47 & 2048) == 0) goto L49;
        long r11 = r18.timeSelectorUnselectedContainerColor;
    L50:
        long r28 = r11;
        if ((r47 & 4096) == 0) goto L53;
        long r13 = r18.timeSelectorSelectedContentColor;
    L55:
        if ((r47 & 8192) == 0) goto L57;
        long r1 = r18.timeSelectorUnselectedContentColor;
    L58:
        long r210 = r4;
        long r211 = r6;
        long r212 = r8;
        long r213 = r10;
        long r30 = r12;
        long r32 = r14;
        return r18.m2825copydVHXu7A(r16, r210, r211, r212, r213, r30, r32, r110, r22, r24, r26, r28, r13, r1);
    L57:
        r1 = r45;
        goto L58
    L53:
        r13 = r43;
        goto L55
    L49:
        r11 = r41;
        goto L50
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

    /* JADX INFO: renamed from: copy-dVHXu7A, reason: not valid java name */
    public final TimePickerColors m2825copydVHXu7A(long clockDialColor, long selectorColor, long containerColor, long periodSelectorBorderColor, long clockDialSelectedContentColor, long clockDialUnselectedContentColor, long periodSelectorSelectedContainerColor, long periodSelectorUnselectedContainerColor, long periodSelectorSelectedContentColor, long periodSelectorUnselectedContentColor, long timeSelectorSelectedContainerColor, long timeSelectorUnselectedContainerColor, long timeSelectorSelectedContentColor, long timeSelectorUnselectedContentColor) {
        boolean r10 = true;
        if (clockDialColor == 16) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L8;
        long r13 = clockDialColor;
    L10:
        if (selectorColor == 16) goto L12;
        boolean r5 = true;
    L13:
        if (r5 == false) goto L15;
        long r15 = selectorColor;
    L17:
        if (containerColor == 16) goto L19;
        boolean r6 = true;
    L20:
        if (r6 == false) goto L22;
        long r17 = containerColor;
    L24:
        if (periodSelectorBorderColor == 16) goto L26;
        boolean r7 = true;
    L27:
        if (r7 == false) goto L29;
        long r19 = periodSelectorBorderColor;
    L31:
        if (clockDialSelectedContentColor == 16) goto L33;
        boolean r8 = true;
    L34:
        if (r8 == false) goto L36;
        long r21 = clockDialSelectedContentColor;
    L38:
        if (clockDialUnselectedContentColor == 16) goto L40;
        boolean r9 = true;
    L41:
        if (r9 == false) goto L43;
        long r23 = clockDialUnselectedContentColor;
    L45:
        if (periodSelectorSelectedContainerColor == 16) goto L47;
        boolean r11 = true;
    L48:
        if (r11 == false) goto L50;
        long r25 = periodSelectorSelectedContainerColor;
    L52:
        if (periodSelectorUnselectedContainerColor == 16) goto L54;
        boolean r12 = true;
    L55:
        if (r12 == false) goto L57;
        long r27 = periodSelectorUnselectedContainerColor;
    L59:
        if (periodSelectorSelectedContentColor == 16) goto L61;
        boolean r14 = true;
    L62:
        if (r14 == false) goto L64;
        long r29 = periodSelectorSelectedContentColor;
    L66:
        if (periodSelectorUnselectedContentColor == 16) goto L68;
        boolean r16 = true;
    L69:
        if (r16 == false) goto L71;
        long r31 = periodSelectorUnselectedContentColor;
    L73:
        if (timeSelectorSelectedContainerColor == 16) goto L75;
        boolean r18 = true;
    L76:
        if (r18 == false) goto L78;
        long r33 = timeSelectorSelectedContainerColor;
    L80:
        if (timeSelectorUnselectedContainerColor == 16) goto L82;
        boolean r20 = true;
    L83:
        if (r20 == false) goto L85;
        long r35 = timeSelectorUnselectedContainerColor;
    L87:
        if (timeSelectorSelectedContentColor == 16) goto L89;
        boolean r22 = true;
    L90:
        if (r22 == false) goto L92;
        long r37 = timeSelectorSelectedContentColor;
    L94:
        if (timeSelectorUnselectedContentColor != 16) goto L97;
        r10 = false;
    L97:
        if (r10 == false) goto L99;
        long r39 = timeSelectorUnselectedContentColor;
    L101:
        return new TimePickerColors(r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, null);
    L99:
        r39 = this.timeSelectorUnselectedContentColor;
        goto L101
    L92:
        r37 = this.timeSelectorSelectedContentColor;
        goto L94
    L89:
        r22 = false;
        goto L90
    L85:
        r35 = this.timeSelectorUnselectedContainerColor;
        goto L87
    L82:
        r20 = false;
        goto L83
    L78:
        r33 = this.timeSelectorSelectedContainerColor;
        goto L80
    L75:
        r18 = false;
        goto L76
    L71:
        r31 = this.periodSelectorUnselectedContentColor;
        goto L73
    L68:
        r16 = false;
        goto L69
    L64:
        r29 = this.periodSelectorSelectedContentColor;
        goto L66
    L61:
        r14 = false;
        goto L62
    L57:
        r27 = this.periodSelectorUnselectedContainerColor;
        goto L59
    L54:
        r12 = false;
        goto L55
    L50:
        r25 = this.periodSelectorSelectedContainerColor;
        goto L52
    L47:
        r11 = false;
        goto L48
    L43:
        r23 = this.clockDialUnselectedContentColor;
        goto L45
    L40:
        r9 = false;
        goto L41
    L36:
        r21 = this.clockDialSelectedContentColor;
        goto L38
    L33:
        r8 = false;
        goto L34
    L29:
        r19 = this.periodSelectorBorderColor;
        goto L31
    L26:
        r7 = false;
        goto L27
    L22:
        r17 = this.containerColor;
        goto L24
    L19:
        r6 = false;
        goto L20
    L15:
        r15 = this.selectorColor;
        goto L17
    L12:
        r5 = false;
        goto L13
    L8:
        r13 = this.clockDialColor;
        goto L10
    L5:
        r4 = false;
        goto L6
    }

    /* JADX INFO: renamed from: periodSelectorContainerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2840periodSelectorContainerColorvNxB06k$material3_release(boolean selected) {
        if (selected == false) goto L5;
        return this.periodSelectorSelectedContainerColor;
    L5:
        return this.periodSelectorUnselectedContainerColor;
    }

    /* JADX INFO: renamed from: periodSelectorContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2841periodSelectorContentColorvNxB06k$material3_release(boolean selected) {
        if (selected == false) goto L5;
        return this.periodSelectorSelectedContentColor;
    L5:
        return this.periodSelectorUnselectedContentColor;
    }

    /* JADX INFO: renamed from: timeSelectorContainerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2842timeSelectorContainerColorvNxB06k$material3_release(boolean selected) {
        if (selected == false) goto L5;
        return this.timeSelectorSelectedContainerColor;
    L5:
        return this.timeSelectorUnselectedContainerColor;
    }

    /* JADX INFO: renamed from: timeSelectorContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2843timeSelectorContentColorvNxB06k$material3_release(boolean selected) {
        if (selected == false) goto L5;
        return this.timeSelectorSelectedContentColor;
    L5:
        return this.timeSelectorUnselectedContentColor;
    }

    /* JADX INFO: renamed from: clockDialContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2824clockDialContentColorvNxB06k$material3_release(boolean selected) {
        if (selected == false) goto L5;
        return this.clockDialSelectedContentColor;
    L5:
        return this.clockDialUnselectedContentColor;
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
        TimePickerColors r2 = (TimePickerColors) other;
        if (Color.m4367equalsimpl0(this.clockDialColor, ((TimePickerColors) other).clockDialColor) == true) goto L15;
        return false;
    L15:
        if (Color.m4367equalsimpl0(this.selectorColor, ((TimePickerColors) other).selectorColor) == true) goto L18;
        return false;
    L18:
        if (Color.m4367equalsimpl0(this.containerColor, ((TimePickerColors) other).containerColor) == true) goto L21;
        return false;
    L21:
        if (Color.m4367equalsimpl0(this.periodSelectorBorderColor, ((TimePickerColors) other).periodSelectorBorderColor) == true) goto L24;
        return false;
    L24:
        if (Color.m4367equalsimpl0(this.periodSelectorSelectedContainerColor, ((TimePickerColors) other).periodSelectorSelectedContainerColor) == true) goto L27;
        return false;
    L27:
        if (Color.m4367equalsimpl0(this.periodSelectorUnselectedContainerColor, ((TimePickerColors) other).periodSelectorUnselectedContainerColor) == true) goto L30;
        return false;
    L30:
        if (Color.m4367equalsimpl0(this.periodSelectorSelectedContentColor, ((TimePickerColors) other).periodSelectorSelectedContentColor) == true) goto L33;
        return false;
    L33:
        if (Color.m4367equalsimpl0(this.periodSelectorUnselectedContentColor, ((TimePickerColors) other).periodSelectorUnselectedContentColor) == true) goto L36;
        return false;
    L36:
        if (Color.m4367equalsimpl0(this.timeSelectorSelectedContainerColor, ((TimePickerColors) other).timeSelectorSelectedContainerColor) == true) goto L39;
        return false;
    L39:
        if (Color.m4367equalsimpl0(this.timeSelectorUnselectedContainerColor, ((TimePickerColors) other).timeSelectorUnselectedContainerColor) == true) goto L42;
        return false;
    L42:
        if (Color.m4367equalsimpl0(this.timeSelectorSelectedContentColor, ((TimePickerColors) other).timeSelectorSelectedContentColor) == true) goto L45;
        return false;
    L45:
        if (Color.m4367equalsimpl0(this.timeSelectorUnselectedContentColor, ((TimePickerColors) other).timeSelectorUnselectedContentColor) == true) goto L47;
        return false;
    L47:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.clockDialColor);
        int result2 = (result * 31) + Color.m4373hashCodeimpl(this.selectorColor);
        return (((((((((((((((((((result2 * 31) + Color.m4373hashCodeimpl(this.containerColor)) * 31) + Color.m4373hashCodeimpl(this.periodSelectorBorderColor)) * 31) + Color.m4373hashCodeimpl(this.periodSelectorSelectedContainerColor)) * 31) + Color.m4373hashCodeimpl(this.periodSelectorUnselectedContainerColor)) * 31) + Color.m4373hashCodeimpl(this.periodSelectorSelectedContentColor)) * 31) + Color.m4373hashCodeimpl(this.periodSelectorUnselectedContentColor)) * 31) + Color.m4373hashCodeimpl(this.timeSelectorSelectedContainerColor)) * 31) + Color.m4373hashCodeimpl(this.timeSelectorUnselectedContainerColor)) * 31) + Color.m4373hashCodeimpl(this.timeSelectorSelectedContentColor)) * 31) + Color.m4373hashCodeimpl(this.timeSelectorUnselectedContentColor);
    }
}
