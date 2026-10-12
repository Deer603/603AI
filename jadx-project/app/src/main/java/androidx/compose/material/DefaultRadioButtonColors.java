package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: RadioButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0017¢\u0006\u0002\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/DefaultRadioButtonColors;", "Landroidx/compose/material/RadioButtonColors;", "selectedColor", "Landroidx/compose/ui/graphics/Color;", "unselectedColor", "disabledColor", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "equals", "", "other", "", "hashCode", "", "radioColor", "Landroidx/compose/runtime/State;", "enabled", "selected", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultRadioButtonColors implements RadioButtonColors {
    private final long disabledColor;
    private final long selectedColor;
    private final long unselectedColor;

    public /* synthetic */ DefaultRadioButtonColors(long r1, long r3, long r5, DefaultConstructorMarker r7) {
        this(r1, r3, r5);
    }

    private DefaultRadioButtonColors(long selectedColor, long unselectedColor, long disabledColor) {
        this.selectedColor = selectedColor;
        this.unselectedColor = unselectedColor;
        this.disabledColor = disabledColor;
    }

    @Override // androidx.compose.material.RadioButtonColors
    public State<Color> radioColor(boolean enabled, boolean selected, Composer $composer, int $changed) {
        $composer.startReplaceGroup(1243421834);
        ComposerKt.sourceInformation($composer, "C(radioColor):RadioButton.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(1243421834, $changed, -1, "androidx.compose.material.DefaultRadioButtonColors.radioColor (RadioButton.kt:177)");
    L6:
        if (enabled == true) goto L8;
        long r0 = this.disabledColor;
    L11:
        long target = r0;
        if (enabled == false) goto L14;
        $composer.startReplaceGroup(1872435883);
        ComposerKt.sourceInformation($composer, "188@7564L75");
        Composer $composer2 = $composer;
        State<Color> r13 = SingleValueAnimationKt.m112animateColorAsStateeuL9pac(target, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, $composer2, 48, 12);
        $composer2.endReplaceGroup();
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventEnd();
    L18:
        $composer2.endReplaceGroup();
        return r13;
    L14:
        $composer2 = $composer;
        $composer2.startReplaceGroup(1872538586);
        ComposerKt.sourceInformation($composer2, "190@7669L28");
        r13 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(target), $composer2, 0);
        $composer2.endReplaceGroup();
        goto L16
    L8:
        if (selected == true) goto L10;
        r0 = this.unselectedColor;
        goto L11
    L10:
        r0 = this.selectedColor;
        goto L11
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L20:
        return false;
    L8:
        if (getClass() != other.getClass()) goto L20;
        DefaultRadioButtonColors r2 = (DefaultRadioButtonColors) other;
        if (Color.m4367equalsimpl0(this.selectedColor, ((DefaultRadioButtonColors) other).selectedColor) == true) goto L14;
        return false;
    L14:
        if (Color.m4367equalsimpl0(this.unselectedColor, ((DefaultRadioButtonColors) other).unselectedColor) == true) goto L17;
        return false;
    L17:
        if (Color.m4367equalsimpl0(this.disabledColor, ((DefaultRadioButtonColors) other).disabledColor) == true) goto L19;
        return false;
    L19:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.selectedColor);
        int result2 = (result * 31) + Color.m4373hashCodeimpl(this.unselectedColor);
        return (result2 * 31) + Color.m4373hashCodeimpl(this.disabledColor);
    }
}
