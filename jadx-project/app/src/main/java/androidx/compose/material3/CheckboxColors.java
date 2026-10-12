package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Checkbox.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0004\b$\u0010%J%\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0004\b'\u0010%J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0004\b)\u0010*J\u0088\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00100\u001a\u000201H\u0016R\u0019\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0019\u0010\f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0011R\u0019\u0010\u000e\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u0011R\u0019\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0018\u0010\u0011R\u0019\u0010\r\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001a\u0010\u0011R\u0019\u0010\u000b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001b\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001c\u0010\u0011R\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001d\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Landroidx/compose/material3/CheckboxColors;", "", "checkedCheckmarkColor", "Landroidx/compose/ui/graphics/Color;", "uncheckedCheckmarkColor", "checkedBoxColor", "uncheckedBoxColor", "disabledCheckedBoxColor", "disabledUncheckedBoxColor", "disabledIndeterminateBoxColor", "checkedBorderColor", "uncheckedBorderColor", "disabledBorderColor", "disabledUncheckedBorderColor", "disabledIndeterminateBorderColor", "(JJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCheckedBorderColor-0d7_KjU", "()J", "J", "getCheckedBoxColor-0d7_KjU", "getCheckedCheckmarkColor-0d7_KjU", "getDisabledBorderColor-0d7_KjU", "getDisabledCheckedBoxColor-0d7_KjU", "getDisabledIndeterminateBorderColor-0d7_KjU", "getDisabledIndeterminateBoxColor-0d7_KjU", "getDisabledUncheckedBorderColor-0d7_KjU", "getDisabledUncheckedBoxColor-0d7_KjU", "getUncheckedBorderColor-0d7_KjU", "getUncheckedBoxColor-0d7_KjU", "getUncheckedCheckmarkColor-0d7_KjU", "borderColor", "Landroidx/compose/runtime/State;", "enabled", "", "state", "Landroidx/compose/ui/state/ToggleableState;", "borderColor$material3_release", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "boxColor", "boxColor$material3_release", "checkmarkColor", "checkmarkColor$material3_release", "(Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "copy", "copy-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material3/CheckboxColors;", "equals", "other", "hashCode", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CheckboxColors {
    public static final int $stable = 0;
    private final long checkedBorderColor;
    private final long checkedBoxColor;
    private final long checkedCheckmarkColor;
    private final long disabledBorderColor;
    private final long disabledCheckedBoxColor;
    private final long disabledIndeterminateBorderColor;
    private final long disabledIndeterminateBoxColor;
    private final long disabledUncheckedBorderColor;
    private final long disabledUncheckedBoxColor;
    private final long uncheckedBorderColor;
    private final long uncheckedBoxColor;
    private final long uncheckedCheckmarkColor;

    /* JADX INFO: compiled from: Checkbox.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[ToggleableState.values().length];
            r0[ToggleableState.On.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L14:
            r0[ToggleableState.Indeterminate.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L16:
            r0[ToggleableState.Off.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L12:
            $EnumSwitchMapping$0 = r0;
        }
    }

    static {
    }

    public /* synthetic */ CheckboxColors(long r1, long r3, long r5, long r7, long r9, long r11, long r13, long r15, long r17, long r19, long r21, long r23, DefaultConstructorMarker r25) {
        this(r1, r3, r5, r7, r9, r11, r13, r15, r17, r19, r21, r23);
    }

    private CheckboxColors(long checkedCheckmarkColor, long uncheckedCheckmarkColor, long checkedBoxColor, long uncheckedBoxColor, long disabledCheckedBoxColor, long disabledUncheckedBoxColor, long disabledIndeterminateBoxColor, long checkedBorderColor, long uncheckedBorderColor, long disabledBorderColor, long disabledUncheckedBorderColor, long disabledIndeterminateBorderColor) {
        this.checkedCheckmarkColor = checkedCheckmarkColor;
        this.uncheckedCheckmarkColor = uncheckedCheckmarkColor;
        this.checkedBoxColor = checkedBoxColor;
        this.uncheckedBoxColor = uncheckedBoxColor;
        this.disabledCheckedBoxColor = disabledCheckedBoxColor;
        this.disabledUncheckedBoxColor = disabledUncheckedBoxColor;
        this.disabledIndeterminateBoxColor = disabledIndeterminateBoxColor;
        this.checkedBorderColor = checkedBorderColor;
        this.uncheckedBorderColor = uncheckedBorderColor;
        this.disabledBorderColor = disabledBorderColor;
        this.disabledUncheckedBorderColor = disabledUncheckedBorderColor;
        this.disabledIndeterminateBorderColor = disabledIndeterminateBorderColor;
    }

    /* JADX INFO: renamed from: getCheckedCheckmarkColor-0d7_KjU, reason: not valid java name */
    public final long m1966getCheckedCheckmarkColor0d7_KjU() {
        return this.checkedCheckmarkColor;
    }

    /* JADX INFO: renamed from: getUncheckedCheckmarkColor-0d7_KjU, reason: not valid java name */
    public final long m1975getUncheckedCheckmarkColor0d7_KjU() {
        return this.uncheckedCheckmarkColor;
    }

    /* JADX INFO: renamed from: getCheckedBoxColor-0d7_KjU, reason: not valid java name */
    public final long m1965getCheckedBoxColor0d7_KjU() {
        return this.checkedBoxColor;
    }

    /* JADX INFO: renamed from: getUncheckedBoxColor-0d7_KjU, reason: not valid java name */
    public final long m1974getUncheckedBoxColor0d7_KjU() {
        return this.uncheckedBoxColor;
    }

    /* JADX INFO: renamed from: getDisabledCheckedBoxColor-0d7_KjU, reason: not valid java name */
    public final long m1968getDisabledCheckedBoxColor0d7_KjU() {
        return this.disabledCheckedBoxColor;
    }

    /* JADX INFO: renamed from: getDisabledUncheckedBoxColor-0d7_KjU, reason: not valid java name */
    public final long m1972getDisabledUncheckedBoxColor0d7_KjU() {
        return this.disabledUncheckedBoxColor;
    }

    /* JADX INFO: renamed from: getDisabledIndeterminateBoxColor-0d7_KjU, reason: not valid java name */
    public final long m1970getDisabledIndeterminateBoxColor0d7_KjU() {
        return this.disabledIndeterminateBoxColor;
    }

    /* JADX INFO: renamed from: getCheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m1964getCheckedBorderColor0d7_KjU() {
        return this.checkedBorderColor;
    }

    /* JADX INFO: renamed from: getUncheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m1973getUncheckedBorderColor0d7_KjU() {
        return this.uncheckedBorderColor;
    }

    /* JADX INFO: renamed from: getDisabledBorderColor-0d7_KjU, reason: not valid java name */
    public final long m1967getDisabledBorderColor0d7_KjU() {
        return this.disabledBorderColor;
    }

    /* JADX INFO: renamed from: getDisabledUncheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m1971getDisabledUncheckedBorderColor0d7_KjU() {
        return this.disabledUncheckedBorderColor;
    }

    /* JADX INFO: renamed from: getDisabledIndeterminateBorderColor-0d7_KjU, reason: not valid java name */
    public final long m1969getDisabledIndeterminateBorderColor0d7_KjU() {
        return this.disabledIndeterminateBorderColor;
    }

    /* JADX INFO: renamed from: copy-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ CheckboxColors m1962copy2qZNXz8$default(CheckboxColors r18, long r19, long r21, long r23, long r25, long r27, long r29, long r31, long r33, long r35, long r37, long r39, long r41, int r43, Object r44) {
        if ((r43 & 1) == 0) goto L5;
        long r2 = r18.checkedCheckmarkColor;
    L7:
        if ((r43 & 2) == 0) goto L9;
        long r4 = r18.uncheckedCheckmarkColor;
    L11:
        if ((r43 & 4) == 0) goto L13;
        long r6 = r18.checkedBoxColor;
    L15:
        if ((r43 & 8) == 0) goto L17;
        long r8 = r18.uncheckedBoxColor;
    L19:
        if ((r43 & 16) == 0) goto L21;
        long r10 = r18.disabledCheckedBoxColor;
    L23:
        if ((r43 & 32) == 0) goto L25;
        long r12 = r18.disabledUncheckedBoxColor;
    L27:
        if ((r43 & 64) == 0) goto L29;
        long r14 = r18.disabledIndeterminateBoxColor;
    L30:
        long r16 = r2;
        if ((r43 & 128) == 0) goto L33;
        long r3 = r18.checkedBorderColor;
    L34:
        long r110 = r3;
        if ((r43 & 256) == 0) goto L37;
        long r5 = r18.uncheckedBorderColor;
    L38:
        long r22 = r5;
        if ((r43 & 512) == 0) goto L41;
        long r7 = r18.disabledBorderColor;
    L42:
        long r24 = r7;
        if ((r43 & 1024) == 0) goto L45;
        long r9 = r18.disabledUncheckedBorderColor;
    L47:
        if ((r43 & 2048) == 0) goto L49;
        long r1 = r18.disabledIndeterminateBorderColor;
    L50:
        long r26 = r4;
        long r28 = r6;
        long r210 = r8;
        long r211 = r10;
        long r30 = r12;
        long r32 = r14;
        return r18.m1963copy2qZNXz8(r16, r26, r28, r210, r211, r30, r32, r110, r22, r24, r9, r1);
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
    public final CheckboxColors m1963copy2qZNXz8(long checkedCheckmarkColor, long uncheckedCheckmarkColor, long checkedBoxColor, long uncheckedBoxColor, long disabledCheckedBoxColor, long disabledUncheckedBoxColor, long disabledIndeterminateBoxColor, long checkedBorderColor, long uncheckedBorderColor, long disabledBorderColor, long disabledUncheckedBorderColor, long disabledIndeterminateBorderColor) {
        boolean r10 = true;
        if (checkedCheckmarkColor == 16) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L8;
        long r13 = checkedCheckmarkColor;
    L10:
        if (uncheckedCheckmarkColor == 16) goto L12;
        boolean r5 = true;
    L13:
        if (r5 == false) goto L15;
        long r15 = uncheckedCheckmarkColor;
    L17:
        if (checkedBoxColor == 16) goto L19;
        boolean r6 = true;
    L20:
        if (r6 == false) goto L22;
        long r17 = checkedBoxColor;
    L24:
        if (uncheckedBoxColor == 16) goto L26;
        boolean r7 = true;
    L27:
        if (r7 == false) goto L29;
        long r19 = uncheckedBoxColor;
    L31:
        if (disabledCheckedBoxColor == 16) goto L33;
        boolean r8 = true;
    L34:
        if (r8 == false) goto L36;
        long r21 = disabledCheckedBoxColor;
    L38:
        if (disabledUncheckedBoxColor == 16) goto L40;
        boolean r9 = true;
    L41:
        if (r9 == false) goto L43;
        long r23 = disabledUncheckedBoxColor;
    L45:
        if (disabledIndeterminateBoxColor == 16) goto L47;
        boolean r11 = true;
    L48:
        if (r11 == false) goto L50;
        long r25 = disabledIndeterminateBoxColor;
    L52:
        if (checkedBorderColor == 16) goto L54;
        boolean r12 = true;
    L55:
        if (r12 == false) goto L57;
        long r27 = checkedBorderColor;
    L59:
        if (uncheckedBorderColor == 16) goto L61;
        boolean r14 = true;
    L62:
        if (r14 == false) goto L64;
        long r29 = uncheckedBorderColor;
    L66:
        if (disabledBorderColor == 16) goto L68;
        boolean r16 = true;
    L69:
        if (r16 == false) goto L71;
        long r31 = disabledBorderColor;
    L73:
        if (disabledUncheckedBorderColor == 16) goto L75;
        boolean r18 = true;
    L76:
        if (r18 == false) goto L78;
        long r33 = disabledUncheckedBorderColor;
    L80:
        if (disabledIndeterminateBorderColor != 16) goto L83;
        r10 = false;
    L83:
        if (r10 == false) goto L85;
        long r35 = disabledIndeterminateBorderColor;
    L87:
        return new CheckboxColors(r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, null);
    L85:
        r35 = this.disabledIndeterminateBorderColor;
        goto L87
    L78:
        r33 = this.disabledUncheckedBorderColor;
        goto L80
    L75:
        r18 = false;
        goto L76
    L71:
        r31 = this.disabledBorderColor;
        goto L73
    L68:
        r16 = false;
        goto L69
    L64:
        r29 = this.uncheckedBorderColor;
        goto L66
    L61:
        r14 = false;
        goto L62
    L57:
        r27 = this.checkedBorderColor;
        goto L59
    L54:
        r12 = false;
        goto L55
    L50:
        r25 = this.disabledIndeterminateBoxColor;
        goto L52
    L47:
        r11 = false;
        goto L48
    L43:
        r23 = this.disabledUncheckedBoxColor;
        goto L45
    L40:
        r9 = false;
        goto L41
    L36:
        r21 = this.disabledCheckedBoxColor;
        goto L38
    L33:
        r8 = false;
        goto L34
    L29:
        r19 = this.uncheckedBoxColor;
        goto L31
    L26:
        r7 = false;
        goto L27
    L22:
        r17 = this.checkedBoxColor;
        goto L24
    L19:
        r6 = false;
        goto L20
    L15:
        r15 = this.uncheckedCheckmarkColor;
        goto L17
    L12:
        r5 = false;
        goto L13
    L8:
        r13 = this.checkedCheckmarkColor;
        goto L10
    L5:
        r4 = false;
        goto L6
    }

    public final State<Color> checkmarkColor$material3_release(ToggleableState state, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -507585681, "C(checkmarkColor)490@21677L61:Checkbox.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(-507585681, $changed, -1, "androidx.compose.material3.CheckboxColors.checkmarkColor (Checkbox.kt:481)");
    L6:
        if (state != ToggleableState.Off) goto L8;
        long r0 = this.uncheckedCheckmarkColor;
    L9:
        long target = r0;
        if (state != ToggleableState.Off) goto L12;
        int duration = 100;
    L13:
        State<Color> r12 = SingleValueAnimationKt.m112animateColorAsStateeuL9pac(target, AnimationSpecKt.tween$default(duration, 0, null, 6, null), null, null, $composer, 0, 12);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r12;
    L12:
        duration = 50;
        goto L13
    L8:
        r0 = this.checkedCheckmarkColor;
        goto L9
    }

    public final State<Color> boxColor$material3_release(boolean enabled, ToggleableState state, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 360729865, "C(boxColor):Checkbox.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(360729865, $changed, -1, "androidx.compose.material3.CheckboxColors.boxColor (Checkbox.kt:501)");
    L5:
        if (enabled == false) goto L13;
        switch(WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1: goto L11;
            case 2: goto L11;
            case 3: goto L10;
            default: goto L9;
        };
    L10:
        long r0 = this.uncheckedBoxColor;
    L19:
        long target = r0;
        if (enabled == false) goto L26;
        $composer.startReplaceGroup(-392211906);
        ComposerKt.sourceInformation($composer, "521@22941L61");
        if (state != ToggleableState.Off) goto L24;
        int duration = 100;
    L25:
        Composer $composer2 = $composer;
        State<Color> r13 = SingleValueAnimationKt.m112animateColorAsStateeuL9pac(target, AnimationSpecKt.tween$default(duration, 0, null, 6, null), null, null, $composer2, 0, 12);
        $composer2.endReplaceGroup();
    L28:
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventEnd();
    L30:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        return r13;
    L24:
        duration = 50;
        goto L25
    L26:
        $composer2 = $composer;
        $composer2.startReplaceGroup(-392031362);
        ComposerKt.sourceInformation($composer2, "523@23032L28");
        r13 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(target), $composer2, 0);
        $composer2.endReplaceGroup();
        goto L28
    L11:
        r0 = this.checkedBoxColor;
        goto L19
    L9:
        throw new NoWhenBranchMatchedException();
    L13:
        switch(WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1: goto L18;
            case 2: goto L17;
            case 3: goto L16;
            default: goto L15;
        };
    L16:
        r0 = this.disabledUncheckedBoxColor;
        goto L19
    L17:
        r0 = this.disabledIndeterminateBoxColor;
        goto L19
    L18:
        r0 = this.disabledCheckedBoxColor;
        goto L19
    L15:
        throw new NoWhenBranchMatchedException();
    }

    public final State<Color> borderColor$material3_release(boolean enabled, ToggleableState state, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1009643462, "C(borderColor):Checkbox.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1009643462, $changed, -1, "androidx.compose.material3.CheckboxColors.borderColor (Checkbox.kt:534)");
    L5:
        if (enabled == false) goto L13;
        switch(WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1: goto L11;
            case 2: goto L11;
            case 3: goto L10;
            default: goto L9;
        };
    L10:
        long r0 = this.uncheckedBorderColor;
    L19:
        long target = r0;
        if (enabled == false) goto L26;
        $composer.startReplaceGroup(-1725816497);
        ComposerKt.sourceInformation($composer, "554@24267L61");
        if (state != ToggleableState.Off) goto L24;
        int duration = 100;
    L25:
        Composer $composer2 = $composer;
        State<Color> r13 = SingleValueAnimationKt.m112animateColorAsStateeuL9pac(target, AnimationSpecKt.tween$default(duration, 0, null, 6, null), null, null, $composer2, 0, 12);
        $composer2.endReplaceGroup();
    L28:
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventEnd();
    L30:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        return r13;
    L24:
        duration = 50;
        goto L25
    L26:
        $composer2 = $composer;
        $composer2.startReplaceGroup(-1725635953);
        ComposerKt.sourceInformation($composer2, "556@24358L28");
        r13 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(target), $composer2, 0);
        $composer2.endReplaceGroup();
        goto L28
    L11:
        r0 = this.checkedBorderColor;
        goto L19
    L9:
        throw new NoWhenBranchMatchedException();
    L13:
        switch(WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1: goto L18;
            case 2: goto L17;
            case 3: goto L16;
            default: goto L15;
        };
    L16:
        r0 = this.disabledUncheckedBorderColor;
        goto L19
    L17:
        r0 = this.disabledIndeterminateBorderColor;
        goto L19
    L18:
        r0 = this.disabledBorderColor;
        goto L19
    L15:
        throw new NoWhenBranchMatchedException();
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L47:
        return false;
    L8:
        if ((other instanceof CheckboxColors) == false) goto L47;
        if (Color.m4367equalsimpl0(this.checkedCheckmarkColor, ((CheckboxColors) other).checkedCheckmarkColor) == true) goto L14;
        return false;
    L14:
        if (Color.m4367equalsimpl0(this.uncheckedCheckmarkColor, ((CheckboxColors) other).uncheckedCheckmarkColor) == true) goto L17;
        return false;
    L17:
        if (Color.m4367equalsimpl0(this.checkedBoxColor, ((CheckboxColors) other).checkedBoxColor) == true) goto L20;
        return false;
    L20:
        if (Color.m4367equalsimpl0(this.uncheckedBoxColor, ((CheckboxColors) other).uncheckedBoxColor) == true) goto L23;
        return false;
    L23:
        if (Color.m4367equalsimpl0(this.disabledCheckedBoxColor, ((CheckboxColors) other).disabledCheckedBoxColor) == true) goto L26;
        return false;
    L26:
        if (Color.m4367equalsimpl0(this.disabledUncheckedBoxColor, ((CheckboxColors) other).disabledUncheckedBoxColor) == true) goto L29;
        return false;
    L29:
        if (Color.m4367equalsimpl0(this.disabledIndeterminateBoxColor, ((CheckboxColors) other).disabledIndeterminateBoxColor) == true) goto L32;
        return false;
    L32:
        if (Color.m4367equalsimpl0(this.checkedBorderColor, ((CheckboxColors) other).checkedBorderColor) == true) goto L35;
        return false;
    L35:
        if (Color.m4367equalsimpl0(this.uncheckedBorderColor, ((CheckboxColors) other).uncheckedBorderColor) == true) goto L38;
        return false;
    L38:
        if (Color.m4367equalsimpl0(this.disabledBorderColor, ((CheckboxColors) other).disabledBorderColor) == true) goto L41;
        return false;
    L41:
        if (Color.m4367equalsimpl0(this.disabledUncheckedBorderColor, ((CheckboxColors) other).disabledUncheckedBorderColor) == true) goto L44;
        return false;
    L44:
        if (Color.m4367equalsimpl0(this.disabledIndeterminateBorderColor, ((CheckboxColors) other).disabledIndeterminateBorderColor) == true) goto L46;
        return false;
    L46:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.checkedCheckmarkColor);
        int result2 = (result * 31) + Color.m4373hashCodeimpl(this.uncheckedCheckmarkColor);
        return (((((((((((((((((((result2 * 31) + Color.m4373hashCodeimpl(this.checkedBoxColor)) * 31) + Color.m4373hashCodeimpl(this.uncheckedBoxColor)) * 31) + Color.m4373hashCodeimpl(this.disabledCheckedBoxColor)) * 31) + Color.m4373hashCodeimpl(this.disabledUncheckedBoxColor)) * 31) + Color.m4373hashCodeimpl(this.disabledIndeterminateBoxColor)) * 31) + Color.m4373hashCodeimpl(this.checkedBorderColor)) * 31) + Color.m4373hashCodeimpl(this.uncheckedBorderColor)) * 31) + Color.m4373hashCodeimpl(this.disabledBorderColor)) * 31) + Color.m4373hashCodeimpl(this.disabledUncheckedBorderColor)) * 31) + Color.m4373hashCodeimpl(this.disabledIndeterminateBorderColor);
    }
}
