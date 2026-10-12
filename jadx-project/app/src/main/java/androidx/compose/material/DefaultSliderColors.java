package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010\u0017J#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010\u001aJ#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010\u001aR\u0016\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\u000b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/material/DefaultSliderColors;", "Landroidx/compose/material/SliderColors;", "thumbColor", "Landroidx/compose/ui/graphics/Color;", "disabledThumbColor", "activeTrackColor", "inactiveTrackColor", "disabledActiveTrackColor", "disabledInactiveTrackColor", "activeTickColor", "inactiveTickColor", "disabledActiveTickColor", "disabledInactiveTickColor", "(JJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "equals", "", "other", "", "hashCode", "", "Landroidx/compose/runtime/State;", "enabled", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "tickColor", "active", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "trackColor", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultSliderColors implements SliderColors {
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

    public /* synthetic */ DefaultSliderColors(long r1, long r3, long r5, long r7, long r9, long r11, long r13, long r15, long r17, long r19, DefaultConstructorMarker r21) {
        this(r1, r3, r5, r7, r9, r11, r13, r15, r17, r19);
    }

    private DefaultSliderColors(long thumbColor, long disabledThumbColor, long activeTrackColor, long inactiveTrackColor, long disabledActiveTrackColor, long disabledInactiveTrackColor, long activeTickColor, long inactiveTickColor, long disabledActiveTickColor, long disabledInactiveTickColor) {
        this.thumbColor = thumbColor;
        this.disabledThumbColor = disabledThumbColor;
        this.activeTrackColor = activeTrackColor;
        this.inactiveTrackColor = inactiveTrackColor;
        this.disabledActiveTrackColor = disabledActiveTrackColor;
        this.disabledInactiveTrackColor = disabledInactiveTrackColor;
        this.activeTickColor = activeTickColor;
        this.inactiveTickColor = inactiveTickColor;
        this.disabledActiveTickColor = disabledActiveTickColor;
        this.disabledInactiveTickColor = disabledInactiveTickColor;
    }

    @Override // androidx.compose.material.SliderColors
    public State<Color> thumbColor(boolean enabled, Composer $composer, int $changed) {
        $composer.startReplaceGroup(-1733795637);
        ComposerKt.sourceInformation($composer, "C(thumbColor)1189@48196L69:Slider.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1733795637, $changed, -1, "androidx.compose.material.DefaultSliderColors.thumbColor (Slider.kt:1188)");
    L5:
        if (enabled == false) goto L7;
        long r0 = this.thumbColor;
    L8:
        State<Color> r1 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(r0), $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventEnd();
    L11:
        $composer.endReplaceGroup();
        return r1;
    L7:
        r0 = this.disabledThumbColor;
        goto L8
    }

    @Override // androidx.compose.material.SliderColors
    public State<Color> trackColor(boolean enabled, boolean active, Composer $composer, int $changed) {
        $composer.startReplaceGroup(1575395620);
        ComposerKt.sourceInformation($composer, "C(trackColor)P(1)1194@48383L247:Slider.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1575395620, $changed, -1, "androidx.compose.material.DefaultSliderColors.trackColor (Slider.kt:1193)");
    L5:
        if (enabled == false) goto L9;
        if (active == false) goto L8;
        long r0 = this.activeTrackColor;
    L12:
        State<Color> r1 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(r0), $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventEnd();
    L15:
        $composer.endReplaceGroup();
        return r1;
    L8:
        r0 = this.inactiveTrackColor;
        goto L12
    L9:
        if (active == false) goto L11;
        r0 = this.disabledActiveTrackColor;
        goto L12
    L11:
        r0 = this.disabledInactiveTrackColor;
        goto L12
    }

    @Override // androidx.compose.material.SliderColors
    public State<Color> tickColor(boolean enabled, boolean active, Composer $composer, int $changed) {
        $composer.startReplaceGroup(-1491563694);
        ComposerKt.sourceInformation($composer, "C(tickColor)P(1)1205@48747L243:Slider.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1491563694, $changed, -1, "androidx.compose.material.DefaultSliderColors.tickColor (Slider.kt:1204)");
    L5:
        if (enabled == false) goto L9;
        if (active == false) goto L8;
        long r0 = this.activeTickColor;
    L12:
        State<Color> r1 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(r0), $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventEnd();
    L15:
        $composer.endReplaceGroup();
        return r1;
    L8:
        r0 = this.inactiveTickColor;
        goto L12
    L9:
        if (active == false) goto L11;
        r0 = this.disabledActiveTickColor;
        goto L12
    L11:
        r0 = this.disabledInactiveTickColor;
        goto L12
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L41:
        return false;
    L8:
        if (getClass() != other.getClass()) goto L41;
        DefaultSliderColors r2 = (DefaultSliderColors) other;
        if (Color.m4367equalsimpl0(this.thumbColor, ((DefaultSliderColors) other).thumbColor) == true) goto L14;
        return false;
    L14:
        if (Color.m4367equalsimpl0(this.disabledThumbColor, ((DefaultSliderColors) other).disabledThumbColor) == true) goto L17;
        return false;
    L17:
        if (Color.m4367equalsimpl0(this.activeTrackColor, ((DefaultSliderColors) other).activeTrackColor) == true) goto L20;
        return false;
    L20:
        if (Color.m4367equalsimpl0(this.inactiveTrackColor, ((DefaultSliderColors) other).inactiveTrackColor) == true) goto L23;
        return false;
    L23:
        if (Color.m4367equalsimpl0(this.disabledActiveTrackColor, ((DefaultSliderColors) other).disabledActiveTrackColor) == true) goto L26;
        return false;
    L26:
        if (Color.m4367equalsimpl0(this.disabledInactiveTrackColor, ((DefaultSliderColors) other).disabledInactiveTrackColor) == true) goto L29;
        return false;
    L29:
        if (Color.m4367equalsimpl0(this.activeTickColor, ((DefaultSliderColors) other).activeTickColor) == true) goto L32;
        return false;
    L32:
        if (Color.m4367equalsimpl0(this.inactiveTickColor, ((DefaultSliderColors) other).inactiveTickColor) == true) goto L35;
        return false;
    L35:
        if (Color.m4367equalsimpl0(this.disabledActiveTickColor, ((DefaultSliderColors) other).disabledActiveTickColor) == true) goto L38;
        return false;
    L38:
        if (Color.m4367equalsimpl0(this.disabledInactiveTickColor, ((DefaultSliderColors) other).disabledInactiveTickColor) == true) goto L40;
        return false;
    L40:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.thumbColor);
        int result2 = (result * 31) + Color.m4373hashCodeimpl(this.disabledThumbColor);
        return (((((((((((((((result2 * 31) + Color.m4373hashCodeimpl(this.activeTrackColor)) * 31) + Color.m4373hashCodeimpl(this.inactiveTrackColor)) * 31) + Color.m4373hashCodeimpl(this.disabledActiveTrackColor)) * 31) + Color.m4373hashCodeimpl(this.disabledInactiveTrackColor)) * 31) + Color.m4373hashCodeimpl(this.activeTickColor)) * 31) + Color.m4373hashCodeimpl(this.inactiveTickColor)) * 31) + Color.m4373hashCodeimpl(this.disabledActiveTickColor)) * 31) + Color.m4373hashCodeimpl(this.disabledInactiveTickColor);
    }
}
