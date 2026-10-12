package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0017¢\u0006\u0002\u0010\u0017J#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0017¢\u0006\u0002\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/material/DefaultSwitchColors;", "Landroidx/compose/material/SwitchColors;", "checkedThumbColor", "Landroidx/compose/ui/graphics/Color;", "checkedTrackColor", "uncheckedThumbColor", "uncheckedTrackColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "(JJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "equals", "", "other", "", "hashCode", "", "thumbColor", "Landroidx/compose/runtime/State;", "enabled", "checked", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "trackColor", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultSwitchColors implements SwitchColors {
    private final long checkedThumbColor;
    private final long checkedTrackColor;
    private final long disabledCheckedThumbColor;
    private final long disabledCheckedTrackColor;
    private final long disabledUncheckedThumbColor;
    private final long disabledUncheckedTrackColor;
    private final long uncheckedThumbColor;
    private final long uncheckedTrackColor;

    public /* synthetic */ DefaultSwitchColors(long r1, long r3, long r5, long r7, long r9, long r11, long r13, long r15, DefaultConstructorMarker r17) {
        this(r1, r3, r5, r7, r9, r11, r13, r15);
    }

    private DefaultSwitchColors(long checkedThumbColor, long checkedTrackColor, long uncheckedThumbColor, long uncheckedTrackColor, long disabledCheckedThumbColor, long disabledCheckedTrackColor, long disabledUncheckedThumbColor, long disabledUncheckedTrackColor) {
        this.checkedThumbColor = checkedThumbColor;
        this.checkedTrackColor = checkedTrackColor;
        this.uncheckedThumbColor = uncheckedThumbColor;
        this.uncheckedTrackColor = uncheckedTrackColor;
        this.disabledCheckedThumbColor = disabledCheckedThumbColor;
        this.disabledCheckedTrackColor = disabledCheckedTrackColor;
        this.disabledUncheckedThumbColor = disabledUncheckedThumbColor;
        this.disabledUncheckedTrackColor = disabledUncheckedTrackColor;
    }

    @Override // androidx.compose.material.SwitchColors
    public State<Color> thumbColor(boolean enabled, boolean checked, Composer $composer, int $changed) {
        $composer.startReplaceGroup(-66424183);
        ComposerKt.sourceInformation($composer, "C(thumbColor)P(1)369@15562L253:Switch.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-66424183, $changed, -1, "androidx.compose.material.DefaultSwitchColors.thumbColor (Switch.kt:368)");
    L5:
        if (enabled == false) goto L9;
        if (checked == false) goto L8;
        long r0 = this.checkedThumbColor;
    L12:
        State<Color> r1 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(r0), $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventEnd();
    L15:
        $composer.endReplaceGroup();
        return r1;
    L8:
        r0 = this.uncheckedThumbColor;
        goto L12
    L9:
        if (checked == false) goto L11;
        r0 = this.disabledCheckedThumbColor;
        goto L12
    L11:
        r0 = this.disabledUncheckedThumbColor;
        goto L12
    }

    @Override // androidx.compose.material.SwitchColors
    public State<Color> trackColor(boolean enabled, boolean checked, Composer $composer, int $changed) {
        $composer.startReplaceGroup(-1176343362);
        ComposerKt.sourceInformation($composer, "C(trackColor)P(1)380@15934L253:Switch.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1176343362, $changed, -1, "androidx.compose.material.DefaultSwitchColors.trackColor (Switch.kt:379)");
    L5:
        if (enabled == false) goto L9;
        if (checked == false) goto L8;
        long r0 = this.checkedTrackColor;
    L12:
        State<Color> r1 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(r0), $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventEnd();
    L15:
        $composer.endReplaceGroup();
        return r1;
    L8:
        r0 = this.uncheckedTrackColor;
        goto L12
    L9:
        if (checked == false) goto L11;
        r0 = this.disabledCheckedTrackColor;
        goto L12
    L11:
        r0 = this.disabledUncheckedTrackColor;
        goto L12
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L35:
        return false;
    L8:
        if (getClass() != other.getClass()) goto L35;
        DefaultSwitchColors r2 = (DefaultSwitchColors) other;
        if (Color.m4367equalsimpl0(this.checkedThumbColor, ((DefaultSwitchColors) other).checkedThumbColor) == true) goto L14;
        return false;
    L14:
        if (Color.m4367equalsimpl0(this.checkedTrackColor, ((DefaultSwitchColors) other).checkedTrackColor) == true) goto L17;
        return false;
    L17:
        if (Color.m4367equalsimpl0(this.uncheckedThumbColor, ((DefaultSwitchColors) other).uncheckedThumbColor) == true) goto L20;
        return false;
    L20:
        if (Color.m4367equalsimpl0(this.uncheckedTrackColor, ((DefaultSwitchColors) other).uncheckedTrackColor) == true) goto L23;
        return false;
    L23:
        if (Color.m4367equalsimpl0(this.disabledCheckedThumbColor, ((DefaultSwitchColors) other).disabledCheckedThumbColor) == true) goto L26;
        return false;
    L26:
        if (Color.m4367equalsimpl0(this.disabledCheckedTrackColor, ((DefaultSwitchColors) other).disabledCheckedTrackColor) == true) goto L29;
        return false;
    L29:
        if (Color.m4367equalsimpl0(this.disabledUncheckedThumbColor, ((DefaultSwitchColors) other).disabledUncheckedThumbColor) == true) goto L32;
        return false;
    L32:
        if (Color.m4367equalsimpl0(this.disabledUncheckedTrackColor, ((DefaultSwitchColors) other).disabledUncheckedTrackColor) == true) goto L34;
        return false;
    L34:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.checkedThumbColor);
        int result2 = (result * 31) + Color.m4373hashCodeimpl(this.checkedTrackColor);
        return (((((((((((result2 * 31) + Color.m4373hashCodeimpl(this.uncheckedThumbColor)) * 31) + Color.m4373hashCodeimpl(this.uncheckedTrackColor)) * 31) + Color.m4373hashCodeimpl(this.disabledCheckedThumbColor)) * 31) + Color.m4373hashCodeimpl(this.disabledCheckedTrackColor)) * 31) + Color.m4373hashCodeimpl(this.disabledUncheckedThumbColor)) * 31) + Color.m4373hashCodeimpl(this.disabledUncheckedTrackColor);
    }
}
