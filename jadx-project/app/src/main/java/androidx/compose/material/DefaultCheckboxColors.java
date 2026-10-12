package androidx.compose.material;

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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0017¢\u0006\u0002\u0010\u0016J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0017¢\u0006\u0002\u0010\u0016J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0017¢\u0006\u0002\u0010\u0019R\u0016\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000fR\u0016\u0010\f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000fR\u0016\u0010\r\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000fR\u0016\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000fR\u0016\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/material/DefaultCheckboxColors;", "Landroidx/compose/material/CheckboxColors;", "checkedCheckmarkColor", "Landroidx/compose/ui/graphics/Color;", "uncheckedCheckmarkColor", "checkedBoxColor", "uncheckedBoxColor", "disabledCheckedBoxColor", "disabledUncheckedBoxColor", "disabledIndeterminateBoxColor", "checkedBorderColor", "uncheckedBorderColor", "disabledBorderColor", "disabledIndeterminateBorderColor", "(JJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "borderColor", "Landroidx/compose/runtime/State;", "enabled", "", "state", "Landroidx/compose/ui/state/ToggleableState;", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "boxColor", "checkmarkColor", "(Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultCheckboxColors implements CheckboxColors {
    private final long checkedBorderColor;
    private final long checkedBoxColor;
    private final long checkedCheckmarkColor;
    private final long disabledBorderColor;
    private final long disabledCheckedBoxColor;
    private final long disabledIndeterminateBorderColor;
    private final long disabledIndeterminateBoxColor;
    private final long disabledUncheckedBoxColor;
    private final long uncheckedBorderColor;
    private final long uncheckedBoxColor;
    private final long uncheckedCheckmarkColor;

    /* JADX INFO: compiled from: Checkbox.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
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

    public /* synthetic */ DefaultCheckboxColors(long r1, long r3, long r5, long r7, long r9, long r11, long r13, long r15, long r17, long r19, long r21, DefaultConstructorMarker r23) {
        this(r1, r3, r5, r7, r9, r11, r13, r15, r17, r19, r21);
    }

    private DefaultCheckboxColors(long checkedCheckmarkColor, long uncheckedCheckmarkColor, long checkedBoxColor, long uncheckedBoxColor, long disabledCheckedBoxColor, long disabledUncheckedBoxColor, long disabledIndeterminateBoxColor, long checkedBorderColor, long uncheckedBorderColor, long disabledBorderColor, long disabledIndeterminateBorderColor) {
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
        this.disabledIndeterminateBorderColor = disabledIndeterminateBorderColor;
    }

    @Override // androidx.compose.material.CheckboxColors
    public State<Color> checkmarkColor(ToggleableState state, Composer $composer, int $changed) {
        $composer.startReplaceGroup(544656267);
        ComposerKt.sourceInformation($composer, "C(checkmarkColor)416@16512L61:Checkbox.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(544656267, $changed, -1, "androidx.compose.material.DefaultCheckboxColors.checkmarkColor (Checkbox.kt:407)");
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
        $composer.endReplaceGroup();
        return r12;
    L12:
        duration = 50;
        goto L13
    L8:
        r0 = this.checkedCheckmarkColor;
        goto L9
    }

    @Override // androidx.compose.material.CheckboxColors
    public State<Color> boxColor(boolean enabled, ToggleableState state, Composer $composer, int $changed) {
        $composer.startReplaceGroup(840901029);
        ComposerKt.sourceInformation($composer, "C(boxColor):Checkbox.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(840901029, $changed, -1, "androidx.compose.material.DefaultCheckboxColors.boxColor (Checkbox.kt:420)");
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
        $composer.startReplaceGroup(507535414);
        ComposerKt.sourceInformation($composer, "440@17516L61");
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
        $composer2.endReplaceGroup();
        return r13;
    L24:
        duration = 50;
        goto L25
    L26:
        $composer2 = $composer;
        $composer2.startReplaceGroup(507715958);
        ComposerKt.sourceInformation($composer2, "442@17607L28");
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

    @Override // androidx.compose.material.CheckboxColors
    public State<Color> borderColor(boolean enabled, ToggleableState state, Composer $composer, int $changed) {
        $composer.startReplaceGroup(-1568341342);
        ComposerKt.sourceInformation($composer, "C(borderColor):Checkbox.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1568341342, $changed, -1, "androidx.compose.material.DefaultCheckboxColors.borderColor (Checkbox.kt:447)");
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
    L18:
        long target = r0;
        if (enabled == false) goto L25;
        $composer.startReplaceGroup(-840498473);
        ComposerKt.sourceInformation($composer, "467@18568L61");
        if (state != ToggleableState.Off) goto L23;
        int duration = 100;
    L24:
        Composer $composer2 = $composer;
        State<Color> r13 = SingleValueAnimationKt.m112animateColorAsStateeuL9pac(target, AnimationSpecKt.tween$default(duration, 0, null, 6, null), null, null, $composer2, 0, 12);
        $composer2.endReplaceGroup();
    L27:
        if (ComposerKt.isTraceInProgress() == false) goto L29;
        ComposerKt.traceEventEnd();
    L29:
        $composer2.endReplaceGroup();
        return r13;
    L23:
        duration = 50;
        goto L24
    L25:
        $composer2 = $composer;
        $composer2.startReplaceGroup(-840317929);
        ComposerKt.sourceInformation($composer2, "469@18659L28");
        r13 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(target), $composer2, 0);
        $composer2.endReplaceGroup();
        goto L27
    L11:
        r0 = this.checkedBorderColor;
        goto L18
    L9:
        throw new NoWhenBranchMatchedException();
    L13:
        switch(WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1: goto L17;
            case 2: goto L16;
            case 3: goto L17;
            default: goto L15;
        };
    L16:
        r0 = this.disabledIndeterminateBorderColor;
        goto L18
    L17:
        r0 = this.disabledBorderColor;
        goto L18
    L15:
        throw new NoWhenBranchMatchedException();
    }
}
