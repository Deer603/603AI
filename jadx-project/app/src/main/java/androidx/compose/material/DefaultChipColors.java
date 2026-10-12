package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\f\u001a\u00020\rH\u0017¢\u0006\u0002\u0010\u000eJ\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\f\u001a\u00020\rH\u0017¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\f\u001a\u00020\rH\u0017¢\u0006\u0002\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/material/DefaultChipColors;", "Landroidx/compose/material/ChipColors;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "leadingIconContentColor", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconContentColor", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "Landroidx/compose/runtime/State;", "enabled", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "equals", "other", "", "hashCode", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultChipColors implements ChipColors {
    private final long backgroundColor;
    private final long contentColor;
    private final long disabledBackgroundColor;
    private final long disabledContentColor;
    private final long disabledLeadingIconContentColor;
    private final long leadingIconContentColor;

    public /* synthetic */ DefaultChipColors(long r1, long r3, long r5, long r7, long r9, long r11, DefaultConstructorMarker r13) {
        this(r1, r3, r5, r7, r9, r11);
    }

    private DefaultChipColors(long backgroundColor, long contentColor, long leadingIconContentColor, long disabledBackgroundColor, long disabledContentColor, long disabledLeadingIconContentColor) {
        this.backgroundColor = backgroundColor;
        this.contentColor = contentColor;
        this.leadingIconContentColor = leadingIconContentColor;
        this.disabledBackgroundColor = disabledBackgroundColor;
        this.disabledContentColor = disabledContentColor;
        this.disabledLeadingIconContentColor = disabledLeadingIconContentColor;
    }

    @Override // androidx.compose.material.ChipColors
    public State<Color> backgroundColor(boolean enabled, Composer $composer, int $changed) {
        $composer.startReplaceGroup(-1593588247);
        ComposerKt.sourceInformation($composer, "C(backgroundColor)579@27004L79:Chip.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1593588247, $changed, -1, "androidx.compose.material.DefaultChipColors.backgroundColor (Chip.kt:578)");
    L5:
        if (enabled == false) goto L7;
        long r0 = this.backgroundColor;
    L8:
        State<Color> r1 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(r0), $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventEnd();
    L11:
        $composer.endReplaceGroup();
        return r1;
    L7:
        r0 = this.disabledBackgroundColor;
        goto L8
    }

    @Override // androidx.compose.material.ChipColors
    public State<Color> contentColor(boolean enabled, Composer $composer, int $changed) {
        $composer.startReplaceGroup(483145880);
        ComposerKt.sourceInformation($composer, "C(contentColor)584@27186L73:Chip.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(483145880, $changed, -1, "androidx.compose.material.DefaultChipColors.contentColor (Chip.kt:583)");
    L5:
        if (enabled == false) goto L7;
        long r0 = this.contentColor;
    L8:
        State<Color> r1 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(r0), $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventEnd();
    L11:
        $composer.endReplaceGroup();
        return r1;
    L7:
        r0 = this.disabledContentColor;
        goto L8
    }

    @Override // androidx.compose.material.ChipColors
    public State<Color> leadingIconContentColor(boolean enabled, Composer $composer, int $changed) {
        $composer.startReplaceGroup(1955749013);
        ComposerKt.sourceInformation($composer, "C(leadingIconContentColor)589@27373L117:Chip.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1955749013, $changed, -1, "androidx.compose.material.DefaultChipColors.leadingIconContentColor (Chip.kt:588)");
    L5:
        if (enabled == false) goto L7;
        long r0 = this.leadingIconContentColor;
    L8:
        State<Color> r1 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(r0), $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventEnd();
    L11:
        $composer.endReplaceGroup();
        return r1;
    L7:
        r0 = this.disabledLeadingIconContentColor;
        goto L8
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L29:
        return false;
    L8:
        if (getClass() != other.getClass()) goto L29;
        DefaultChipColors r2 = (DefaultChipColors) other;
        if (Color.m4367equalsimpl0(this.backgroundColor, ((DefaultChipColors) other).backgroundColor) == true) goto L14;
        return false;
    L14:
        if (Color.m4367equalsimpl0(this.contentColor, ((DefaultChipColors) other).contentColor) == true) goto L17;
        return false;
    L17:
        if (Color.m4367equalsimpl0(this.leadingIconContentColor, ((DefaultChipColors) other).leadingIconContentColor) == true) goto L20;
        return false;
    L20:
        if (Color.m4367equalsimpl0(this.disabledBackgroundColor, ((DefaultChipColors) other).disabledBackgroundColor) == true) goto L23;
        return false;
    L23:
        if (Color.m4367equalsimpl0(this.disabledContentColor, ((DefaultChipColors) other).disabledContentColor) == true) goto L26;
        return false;
    L26:
        if (Color.m4367equalsimpl0(this.disabledLeadingIconContentColor, ((DefaultChipColors) other).disabledLeadingIconContentColor) == true) goto L28;
        return false;
    L28:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.backgroundColor);
        int result2 = (result * 31) + Color.m4373hashCodeimpl(this.contentColor);
        return (((((((result2 * 31) + Color.m4373hashCodeimpl(this.leadingIconContentColor)) * 31) + Color.m4373hashCodeimpl(this.disabledBackgroundColor)) * 31) + Color.m4373hashCodeimpl(this.disabledContentColor)) * 31) + Color.m4373hashCodeimpl(this.disabledLeadingIconContentColor);
    }
}
