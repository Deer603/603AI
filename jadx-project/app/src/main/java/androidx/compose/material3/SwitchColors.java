package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0013J%\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+J°\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0013\u0010/\u001a\u00020(2\b\u00100\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00101\u001a\u000202H\u0016J%\u00103\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u0010+J%\u00105\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u0010+J%\u00107\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u0010+R\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015R\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0019\u0010\u0015R\u0019\u0010\r\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001a\u0010\u0015R\u0019\u0010\u000e\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001b\u0010\u0015R\u0019\u0010\u000b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001c\u0010\u0015R\u0019\u0010\f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001d\u0010\u0015R\u0019\u0010\u0011\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001e\u0010\u0015R\u0019\u0010\u0012\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\u000f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b \u0010\u0015R\u0019\u0010\u0010\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b!\u0010\u0015R\u0019\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\"\u0010\u0015R\u0019\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b#\u0010\u0015R\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b$\u0010\u0015R\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b%\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/material3/SwitchColors;", "", "checkedThumbColor", "Landroidx/compose/ui/graphics/Color;", "checkedTrackColor", "checkedBorderColor", "checkedIconColor", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedBorderColor", "uncheckedIconColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledCheckedBorderColor", "disabledCheckedIconColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "disabledUncheckedBorderColor", "disabledUncheckedIconColor", "(JJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCheckedBorderColor-0d7_KjU", "()J", "J", "getCheckedIconColor-0d7_KjU", "getCheckedThumbColor-0d7_KjU", "getCheckedTrackColor-0d7_KjU", "getDisabledCheckedBorderColor-0d7_KjU", "getDisabledCheckedIconColor-0d7_KjU", "getDisabledCheckedThumbColor-0d7_KjU", "getDisabledCheckedTrackColor-0d7_KjU", "getDisabledUncheckedBorderColor-0d7_KjU", "getDisabledUncheckedIconColor-0d7_KjU", "getDisabledUncheckedThumbColor-0d7_KjU", "getDisabledUncheckedTrackColor-0d7_KjU", "getUncheckedBorderColor-0d7_KjU", "getUncheckedIconColor-0d7_KjU", "getUncheckedThumbColor-0d7_KjU", "getUncheckedTrackColor-0d7_KjU", "borderColor", "enabled", "", "checked", "borderColor-WaAFU9c$material3_release", "(ZZ)J", "copy", "copy-Q_H9qLU", "(JJJJJJJJJJJJJJJJ)Landroidx/compose/material3/SwitchColors;", "equals", "other", "hashCode", "", "iconColor", "iconColor-WaAFU9c$material3_release", "thumbColor", "thumbColor-WaAFU9c$material3_release", "trackColor", "trackColor-WaAFU9c$material3_release", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SwitchColors {
    public static final int $stable = 0;
    private final long checkedBorderColor;
    private final long checkedIconColor;
    private final long checkedThumbColor;
    private final long checkedTrackColor;
    private final long disabledCheckedBorderColor;
    private final long disabledCheckedIconColor;
    private final long disabledCheckedThumbColor;
    private final long disabledCheckedTrackColor;
    private final long disabledUncheckedBorderColor;
    private final long disabledUncheckedIconColor;
    private final long disabledUncheckedThumbColor;
    private final long disabledUncheckedTrackColor;
    private final long uncheckedBorderColor;
    private final long uncheckedIconColor;
    private final long uncheckedThumbColor;
    private final long uncheckedTrackColor;

    static {
    }

    public /* synthetic */ SwitchColors(long r1, long r3, long r5, long r7, long r9, long r11, long r13, long r15, long r17, long r19, long r21, long r23, long r25, long r27, long r29, long r31, DefaultConstructorMarker r33) {
        this(r1, r3, r5, r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31);
    }

    private SwitchColors(long checkedThumbColor, long checkedTrackColor, long checkedBorderColor, long checkedIconColor, long uncheckedThumbColor, long uncheckedTrackColor, long uncheckedBorderColor, long uncheckedIconColor, long disabledCheckedThumbColor, long disabledCheckedTrackColor, long disabledCheckedBorderColor, long disabledCheckedIconColor, long disabledUncheckedThumbColor, long disabledUncheckedTrackColor, long disabledUncheckedBorderColor, long disabledUncheckedIconColor) {
        this.checkedThumbColor = checkedThumbColor;
        this.checkedTrackColor = checkedTrackColor;
        this.checkedBorderColor = checkedBorderColor;
        this.checkedIconColor = checkedIconColor;
        this.uncheckedThumbColor = uncheckedThumbColor;
        this.uncheckedTrackColor = uncheckedTrackColor;
        this.uncheckedBorderColor = uncheckedBorderColor;
        this.uncheckedIconColor = uncheckedIconColor;
        this.disabledCheckedThumbColor = disabledCheckedThumbColor;
        this.disabledCheckedTrackColor = disabledCheckedTrackColor;
        this.disabledCheckedBorderColor = disabledCheckedBorderColor;
        this.disabledCheckedIconColor = disabledCheckedIconColor;
        this.disabledUncheckedThumbColor = disabledUncheckedThumbColor;
        this.disabledUncheckedTrackColor = disabledUncheckedTrackColor;
        this.disabledUncheckedBorderColor = disabledUncheckedBorderColor;
        this.disabledUncheckedIconColor = disabledUncheckedIconColor;
    }

    /* JADX INFO: renamed from: getCheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m2685getCheckedThumbColor0d7_KjU() {
        return this.checkedThumbColor;
    }

    /* JADX INFO: renamed from: getCheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2686getCheckedTrackColor0d7_KjU() {
        return this.checkedTrackColor;
    }

    /* JADX INFO: renamed from: getCheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2683getCheckedBorderColor0d7_KjU() {
        return this.checkedBorderColor;
    }

    /* JADX INFO: renamed from: getCheckedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2684getCheckedIconColor0d7_KjU() {
        return this.checkedIconColor;
    }

    /* JADX INFO: renamed from: getUncheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m2697getUncheckedThumbColor0d7_KjU() {
        return this.uncheckedThumbColor;
    }

    /* JADX INFO: renamed from: getUncheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2698getUncheckedTrackColor0d7_KjU() {
        return this.uncheckedTrackColor;
    }

    /* JADX INFO: renamed from: getUncheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2695getUncheckedBorderColor0d7_KjU() {
        return this.uncheckedBorderColor;
    }

    /* JADX INFO: renamed from: getUncheckedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2696getUncheckedIconColor0d7_KjU() {
        return this.uncheckedIconColor;
    }

    /* JADX INFO: renamed from: getDisabledCheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m2689getDisabledCheckedThumbColor0d7_KjU() {
        return this.disabledCheckedThumbColor;
    }

    /* JADX INFO: renamed from: getDisabledCheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2690getDisabledCheckedTrackColor0d7_KjU() {
        return this.disabledCheckedTrackColor;
    }

    /* JADX INFO: renamed from: getDisabledCheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2687getDisabledCheckedBorderColor0d7_KjU() {
        return this.disabledCheckedBorderColor;
    }

    /* JADX INFO: renamed from: getDisabledCheckedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2688getDisabledCheckedIconColor0d7_KjU() {
        return this.disabledCheckedIconColor;
    }

    /* JADX INFO: renamed from: getDisabledUncheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m2693getDisabledUncheckedThumbColor0d7_KjU() {
        return this.disabledUncheckedThumbColor;
    }

    /* JADX INFO: renamed from: getDisabledUncheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m2694getDisabledUncheckedTrackColor0d7_KjU() {
        return this.disabledUncheckedTrackColor;
    }

    /* JADX INFO: renamed from: getDisabledUncheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2691getDisabledUncheckedBorderColor0d7_KjU() {
        return this.disabledUncheckedBorderColor;
    }

    /* JADX INFO: renamed from: getDisabledUncheckedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2692getDisabledUncheckedIconColor0d7_KjU() {
        return this.disabledUncheckedIconColor;
    }

    /* JADX INFO: renamed from: copy-Q_H9qLU$default, reason: not valid java name */
    public static /* synthetic */ SwitchColors m2680copyQ_H9qLU$default(SwitchColors r19, long r20, long r22, long r24, long r26, long r28, long r30, long r32, long r34, long r36, long r38, long r40, long r42, long r44, long r46, long r48, long r50, int r52, Object r53) {
        if ((r52 & 1) == 0) goto L5;
        long r2 = r19.checkedThumbColor;
    L7:
        if ((r52 & 2) == 0) goto L9;
        long r4 = r19.checkedTrackColor;
    L11:
        if ((r52 & 4) == 0) goto L13;
        long r6 = r19.checkedBorderColor;
    L15:
        if ((r52 & 8) == 0) goto L17;
        long r8 = r19.checkedIconColor;
    L19:
        if ((r52 & 16) == 0) goto L21;
        long r10 = r19.uncheckedThumbColor;
    L23:
        if ((r52 & 32) == 0) goto L25;
        long r12 = r19.uncheckedTrackColor;
    L27:
        if ((r52 & 64) == 0) goto L29;
        long r14 = r19.uncheckedBorderColor;
    L30:
        long r16 = r2;
        if ((r52 & 128) == 0) goto L33;
        long r3 = r19.uncheckedIconColor;
    L34:
        long r21 = r3;
        if ((r52 & 256) == 0) goto L37;
        long r5 = r19.disabledCheckedThumbColor;
    L38:
        long r23 = r5;
        if ((r52 & 512) == 0) goto L41;
        long r7 = r19.disabledCheckedTrackColor;
    L42:
        long r25 = r7;
        if ((r52 & 1024) == 0) goto L45;
        long r9 = r19.disabledCheckedBorderColor;
    L46:
        long r27 = r9;
        if ((r52 & 2048) == 0) goto L49;
        long r11 = r19.disabledCheckedIconColor;
    L50:
        long r29 = r11;
        if ((r52 & 4096) == 0) goto L53;
        long r13 = r19.disabledUncheckedThumbColor;
    L54:
        long r31 = r13;
        if ((r52 & 8192) == 0) goto L57;
        long r15 = r19.disabledUncheckedTrackColor;
    L58:
        long r33 = r15;
        if ((r52 & 16384) == 0) goto L61;
        long r17 = r19.disabledUncheckedBorderColor;
    L63:
        if ((r52 & 32768) == 0) goto L65;
        long r1 = r19.disabledUncheckedIconColor;
    L66:
        long r210 = r4;
        long r211 = r6;
        long r212 = r8;
        long r213 = r10;
        long r35 = r12;
        long r37 = r14;
        return r19.m2682copyQ_H9qLU(r16, r210, r211, r212, r213, r35, r37, r21, r23, r25, r27, r29, r31, r33, r17, r1);
    L65:
        r1 = r50;
        goto L66
    L61:
        r17 = r48;
        goto L63
    L57:
        r15 = r46;
        goto L58
    L53:
        r13 = r44;
        goto L54
    L49:
        r11 = r42;
        goto L50
    L45:
        r9 = r40;
        goto L46
    L41:
        r7 = r38;
        goto L42
    L37:
        r5 = r36;
        goto L38
    L33:
        r3 = r34;
        goto L34
    L29:
        r14 = r32;
        goto L30
    L25:
        r12 = r30;
        goto L27
    L21:
        r10 = r28;
        goto L23
    L17:
        r8 = r26;
        goto L19
    L13:
        r6 = r24;
        goto L15
    L9:
        r4 = r22;
        goto L11
    L5:
        r2 = r20;
        goto L7
    }

    /* JADX INFO: renamed from: copy-Q_H9qLU, reason: not valid java name */
    public final SwitchColors m2682copyQ_H9qLU(long checkedThumbColor, long checkedTrackColor, long checkedBorderColor, long checkedIconColor, long uncheckedThumbColor, long uncheckedTrackColor, long uncheckedBorderColor, long uncheckedIconColor, long disabledCheckedThumbColor, long disabledCheckedTrackColor, long disabledCheckedBorderColor, long disabledCheckedIconColor, long disabledUncheckedThumbColor, long disabledUncheckedTrackColor, long disabledUncheckedBorderColor, long disabledUncheckedIconColor) {
        boolean r10 = true;
        if (checkedThumbColor == 16) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L8;
        long r13 = checkedThumbColor;
    L10:
        if (checkedTrackColor == 16) goto L12;
        boolean r5 = true;
    L13:
        if (r5 == false) goto L15;
        long r15 = checkedTrackColor;
    L17:
        if (checkedBorderColor == 16) goto L19;
        boolean r6 = true;
    L20:
        if (r6 == false) goto L22;
        long r17 = checkedBorderColor;
    L24:
        if (checkedIconColor == 16) goto L26;
        boolean r7 = true;
    L27:
        if (r7 == false) goto L29;
        long r19 = checkedIconColor;
    L31:
        if (uncheckedThumbColor == 16) goto L33;
        boolean r8 = true;
    L34:
        if (r8 == false) goto L36;
        long r21 = uncheckedThumbColor;
    L38:
        if (uncheckedTrackColor == 16) goto L40;
        boolean r9 = true;
    L41:
        if (r9 == false) goto L43;
        long r23 = uncheckedTrackColor;
    L45:
        if (uncheckedBorderColor == 16) goto L47;
        boolean r11 = true;
    L48:
        if (r11 == false) goto L50;
        long r25 = uncheckedBorderColor;
    L52:
        if (uncheckedIconColor == 16) goto L54;
        boolean r12 = true;
    L55:
        if (r12 == false) goto L57;
        long r27 = uncheckedIconColor;
    L59:
        if (disabledCheckedThumbColor == 16) goto L61;
        boolean r14 = true;
    L62:
        if (r14 == false) goto L64;
        long r29 = disabledCheckedThumbColor;
    L66:
        if (disabledCheckedTrackColor == 16) goto L68;
        boolean r16 = true;
    L69:
        if (r16 == false) goto L71;
        long r31 = disabledCheckedTrackColor;
    L73:
        if (disabledCheckedBorderColor == 16) goto L75;
        boolean r18 = true;
    L76:
        if (r18 == false) goto L78;
        long r33 = disabledCheckedBorderColor;
    L80:
        if (disabledCheckedIconColor == 16) goto L82;
        boolean r20 = true;
    L83:
        if (r20 == false) goto L85;
        long r35 = disabledCheckedIconColor;
    L87:
        if (disabledUncheckedThumbColor == 16) goto L89;
        boolean r22 = true;
    L90:
        if (r22 == false) goto L92;
        long r37 = disabledUncheckedThumbColor;
    L94:
        if (disabledUncheckedTrackColor == 16) goto L96;
        boolean r24 = true;
    L97:
        if (r24 == false) goto L99;
        long r39 = disabledUncheckedTrackColor;
    L101:
        if (disabledUncheckedBorderColor == 16) goto L103;
        boolean r26 = true;
    L104:
        if (r26 == false) goto L106;
        long r41 = disabledUncheckedBorderColor;
    L108:
        if (disabledUncheckedIconColor != 16) goto L111;
        r10 = false;
    L111:
        if (r10 == false) goto L113;
        long r43 = disabledUncheckedIconColor;
    L115:
        return new SwitchColors(r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, null);
    L113:
        r43 = this.disabledUncheckedIconColor;
        goto L115
    L106:
        r41 = this.disabledUncheckedBorderColor;
        goto L108
    L103:
        r26 = false;
        goto L104
    L99:
        r39 = this.disabledUncheckedTrackColor;
        goto L101
    L96:
        r24 = false;
        goto L97
    L92:
        r37 = this.disabledUncheckedThumbColor;
        goto L94
    L89:
        r22 = false;
        goto L90
    L85:
        r35 = this.disabledCheckedIconColor;
        goto L87
    L82:
        r20 = false;
        goto L83
    L78:
        r33 = this.disabledCheckedBorderColor;
        goto L80
    L75:
        r18 = false;
        goto L76
    L71:
        r31 = this.disabledCheckedTrackColor;
        goto L73
    L68:
        r16 = false;
        goto L69
    L64:
        r29 = this.disabledCheckedThumbColor;
        goto L66
    L61:
        r14 = false;
        goto L62
    L57:
        r27 = this.uncheckedIconColor;
        goto L59
    L54:
        r12 = false;
        goto L55
    L50:
        r25 = this.uncheckedBorderColor;
        goto L52
    L47:
        r11 = false;
        goto L48
    L43:
        r23 = this.uncheckedTrackColor;
        goto L45
    L40:
        r9 = false;
        goto L41
    L36:
        r21 = this.uncheckedThumbColor;
        goto L38
    L33:
        r8 = false;
        goto L34
    L29:
        r19 = this.checkedIconColor;
        goto L31
    L26:
        r7 = false;
        goto L27
    L22:
        r17 = this.checkedBorderColor;
        goto L24
    L19:
        r6 = false;
        goto L20
    L15:
        r15 = this.checkedTrackColor;
        goto L17
    L12:
        r5 = false;
        goto L13
    L8:
        r13 = this.checkedThumbColor;
        goto L10
    L5:
        r4 = false;
        goto L6
    }

    /* JADX INFO: renamed from: thumbColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2700thumbColorWaAFU9c$material3_release(boolean enabled, boolean checked) {
        if (enabled == false) goto L6;
        if (checked == false) goto L11;
        return this.checkedThumbColor;
    L11:
        return this.uncheckedThumbColor;
    L6:
        if (checked == false) goto L9;
        return this.disabledCheckedThumbColor;
    L9:
        return this.disabledUncheckedThumbColor;
    }

    /* JADX INFO: renamed from: trackColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2701trackColorWaAFU9c$material3_release(boolean enabled, boolean checked) {
        if (enabled == false) goto L6;
        if (checked == false) goto L11;
        return this.checkedTrackColor;
    L11:
        return this.uncheckedTrackColor;
    L6:
        if (checked == false) goto L9;
        return this.disabledCheckedTrackColor;
    L9:
        return this.disabledUncheckedTrackColor;
    }

    /* JADX INFO: renamed from: borderColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2681borderColorWaAFU9c$material3_release(boolean enabled, boolean checked) {
        if (enabled == false) goto L6;
        if (checked == false) goto L11;
        return this.checkedBorderColor;
    L11:
        return this.uncheckedBorderColor;
    L6:
        if (checked == false) goto L9;
        return this.disabledCheckedBorderColor;
    L9:
        return this.disabledUncheckedBorderColor;
    }

    /* JADX INFO: renamed from: iconColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2699iconColorWaAFU9c$material3_release(boolean enabled, boolean checked) {
        if (enabled == false) goto L6;
        if (checked == false) goto L11;
        return this.checkedIconColor;
    L11:
        return this.uncheckedIconColor;
    L6:
        if (checked == false) goto L9;
        return this.disabledCheckedIconColor;
    L9:
        return this.disabledUncheckedIconColor;
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L59:
        return false;
    L8:
        if ((other instanceof SwitchColors) == false) goto L59;
        if (Color.m4367equalsimpl0(this.checkedThumbColor, ((SwitchColors) other).checkedThumbColor) == true) goto L14;
        return false;
    L14:
        if (Color.m4367equalsimpl0(this.checkedTrackColor, ((SwitchColors) other).checkedTrackColor) == true) goto L17;
        return false;
    L17:
        if (Color.m4367equalsimpl0(this.checkedBorderColor, ((SwitchColors) other).checkedBorderColor) == true) goto L20;
        return false;
    L20:
        if (Color.m4367equalsimpl0(this.checkedIconColor, ((SwitchColors) other).checkedIconColor) == true) goto L23;
        return false;
    L23:
        if (Color.m4367equalsimpl0(this.uncheckedThumbColor, ((SwitchColors) other).uncheckedThumbColor) == true) goto L26;
        return false;
    L26:
        if (Color.m4367equalsimpl0(this.uncheckedTrackColor, ((SwitchColors) other).uncheckedTrackColor) == true) goto L29;
        return false;
    L29:
        if (Color.m4367equalsimpl0(this.uncheckedBorderColor, ((SwitchColors) other).uncheckedBorderColor) == true) goto L32;
        return false;
    L32:
        if (Color.m4367equalsimpl0(this.uncheckedIconColor, ((SwitchColors) other).uncheckedIconColor) == true) goto L35;
        return false;
    L35:
        if (Color.m4367equalsimpl0(this.disabledCheckedThumbColor, ((SwitchColors) other).disabledCheckedThumbColor) == true) goto L38;
        return false;
    L38:
        if (Color.m4367equalsimpl0(this.disabledCheckedTrackColor, ((SwitchColors) other).disabledCheckedTrackColor) == true) goto L41;
        return false;
    L41:
        if (Color.m4367equalsimpl0(this.disabledCheckedBorderColor, ((SwitchColors) other).disabledCheckedBorderColor) == true) goto L44;
        return false;
    L44:
        if (Color.m4367equalsimpl0(this.disabledCheckedIconColor, ((SwitchColors) other).disabledCheckedIconColor) == true) goto L47;
        return false;
    L47:
        if (Color.m4367equalsimpl0(this.disabledUncheckedThumbColor, ((SwitchColors) other).disabledUncheckedThumbColor) == true) goto L50;
        return false;
    L50:
        if (Color.m4367equalsimpl0(this.disabledUncheckedTrackColor, ((SwitchColors) other).disabledUncheckedTrackColor) == true) goto L53;
        return false;
    L53:
        if (Color.m4367equalsimpl0(this.disabledUncheckedBorderColor, ((SwitchColors) other).disabledUncheckedBorderColor) == true) goto L56;
        return false;
    L56:
        if (Color.m4367equalsimpl0(this.disabledUncheckedIconColor, ((SwitchColors) other).disabledUncheckedIconColor) == true) goto L58;
        return false;
    L58:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.checkedThumbColor);
        int result2 = (result * 31) + Color.m4373hashCodeimpl(this.checkedTrackColor);
        return (((((((((((((((((((((((((((result2 * 31) + Color.m4373hashCodeimpl(this.checkedBorderColor)) * 31) + Color.m4373hashCodeimpl(this.checkedIconColor)) * 31) + Color.m4373hashCodeimpl(this.uncheckedThumbColor)) * 31) + Color.m4373hashCodeimpl(this.uncheckedTrackColor)) * 31) + Color.m4373hashCodeimpl(this.uncheckedBorderColor)) * 31) + Color.m4373hashCodeimpl(this.uncheckedIconColor)) * 31) + Color.m4373hashCodeimpl(this.disabledCheckedThumbColor)) * 31) + Color.m4373hashCodeimpl(this.disabledCheckedTrackColor)) * 31) + Color.m4373hashCodeimpl(this.disabledCheckedBorderColor)) * 31) + Color.m4373hashCodeimpl(this.disabledCheckedIconColor)) * 31) + Color.m4373hashCodeimpl(this.disabledUncheckedThumbColor)) * 31) + Color.m4373hashCodeimpl(this.disabledUncheckedTrackColor)) * 31) + Color.m4373hashCodeimpl(this.disabledUncheckedBorderColor)) * 31) + Color.m4373hashCodeimpl(this.disabledUncheckedIconColor);
    }
}
