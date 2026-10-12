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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010\u0012J#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u000b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/material/DefaultSelectableChipColors;", "Landroidx/compose/material/SelectableChipColors;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "leadingIconColor", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconColor", "selectedBackgroundColor", "selectedContentColor", "selectedLeadingIconColor", "(JJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "Landroidx/compose/runtime/State;", "enabled", "", "selected", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "equals", "other", "", "hashCode", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultSelectableChipColors implements SelectableChipColors {
    private final long backgroundColor;
    private final long contentColor;
    private final long disabledBackgroundColor;
    private final long disabledContentColor;
    private final long disabledLeadingIconColor;
    private final long leadingIconColor;
    private final long selectedBackgroundColor;
    private final long selectedContentColor;
    private final long selectedLeadingIconColor;

    public /* synthetic */ DefaultSelectableChipColors(long r1, long r3, long r5, long r7, long r9, long r11, long r13, long r15, long r17, DefaultConstructorMarker r19) {
        this(r1, r3, r5, r7, r9, r11, r13, r15, r17);
    }

    private DefaultSelectableChipColors(long backgroundColor, long contentColor, long leadingIconColor, long disabledBackgroundColor, long disabledContentColor, long disabledLeadingIconColor, long selectedBackgroundColor, long selectedContentColor, long selectedLeadingIconColor) {
        this.backgroundColor = backgroundColor;
        this.contentColor = contentColor;
        this.leadingIconColor = leadingIconColor;
        this.disabledBackgroundColor = disabledBackgroundColor;
        this.disabledContentColor = disabledContentColor;
        this.disabledLeadingIconColor = disabledLeadingIconColor;
        this.selectedBackgroundColor = selectedBackgroundColor;
        this.selectedContentColor = selectedContentColor;
        this.selectedLeadingIconColor = selectedLeadingIconColor;
    }

    @Override // androidx.compose.material.SelectableChipColors
    public State<Color> backgroundColor(boolean enabled, boolean selected, Composer $composer, int $changed) {
        $composer.startReplaceGroup(-403836585);
        ComposerKt.sourceInformation($composer, "C(backgroundColor)645@29575L28:Chip.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(-403836585, $changed, -1, "androidx.compose.material.DefaultSelectableChipColors.backgroundColor (Chip.kt:638)");
    L6:
        if (enabled == true) goto L8;
        long target = this.disabledBackgroundColor;
    L11:
        State<Color> r2 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(target), $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L14;
        ComposerKt.traceEventEnd();
    L14:
        $composer.endReplaceGroup();
        return r2;
    L8:
        if (selected == true) goto L10;
        target = this.backgroundColor;
        goto L11
    L10:
        target = this.selectedBackgroundColor;
        goto L11
    }

    @Override // androidx.compose.material.SelectableChipColors
    public State<Color> contentColor(boolean enabled, boolean selected, Composer $composer, int $changed) {
        $composer.startReplaceGroup(2025240134);
        ComposerKt.sourceInformation($composer, "C(contentColor)656@29915L28:Chip.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(2025240134, $changed, -1, "androidx.compose.material.DefaultSelectableChipColors.contentColor (Chip.kt:649)");
    L6:
        if (enabled == true) goto L8;
        long target = this.disabledContentColor;
    L11:
        State<Color> r2 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(target), $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L14;
        ComposerKt.traceEventEnd();
    L14:
        $composer.endReplaceGroup();
        return r2;
    L8:
        if (selected == true) goto L10;
        target = this.contentColor;
        goto L11
    L10:
        target = this.selectedContentColor;
        goto L11
    }

    @Override // androidx.compose.material.SelectableChipColors
    public State<Color> leadingIconColor(boolean enabled, boolean selected, Composer $composer, int $changed) {
        $composer.startReplaceGroup(189838188);
        ComposerKt.sourceInformation($composer, "C(leadingIconColor)667@30271L28:Chip.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(189838188, $changed, -1, "androidx.compose.material.DefaultSelectableChipColors.leadingIconColor (Chip.kt:660)");
    L6:
        if (enabled == true) goto L8;
        long target = this.disabledLeadingIconColor;
    L11:
        State<Color> r2 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(target), $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L14;
        ComposerKt.traceEventEnd();
    L14:
        $composer.endReplaceGroup();
        return r2;
    L8:
        if (selected == true) goto L10;
        target = this.leadingIconColor;
        goto L11
    L10:
        target = this.selectedLeadingIconColor;
        goto L11
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L38:
        return false;
    L8:
        if (getClass() != other.getClass()) goto L38;
        DefaultSelectableChipColors r2 = (DefaultSelectableChipColors) other;
        if (Color.m4367equalsimpl0(this.backgroundColor, ((DefaultSelectableChipColors) other).backgroundColor) == true) goto L14;
        return false;
    L14:
        if (Color.m4367equalsimpl0(this.contentColor, ((DefaultSelectableChipColors) other).contentColor) == true) goto L17;
        return false;
    L17:
        if (Color.m4367equalsimpl0(this.leadingIconColor, ((DefaultSelectableChipColors) other).leadingIconColor) == true) goto L20;
        return false;
    L20:
        if (Color.m4367equalsimpl0(this.disabledBackgroundColor, ((DefaultSelectableChipColors) other).disabledBackgroundColor) == true) goto L23;
        return false;
    L23:
        if (Color.m4367equalsimpl0(this.disabledContentColor, ((DefaultSelectableChipColors) other).disabledContentColor) == true) goto L26;
        return false;
    L26:
        if (Color.m4367equalsimpl0(this.disabledLeadingIconColor, ((DefaultSelectableChipColors) other).disabledLeadingIconColor) == true) goto L29;
        return false;
    L29:
        if (Color.m4367equalsimpl0(this.selectedBackgroundColor, ((DefaultSelectableChipColors) other).selectedBackgroundColor) == true) goto L32;
        return false;
    L32:
        if (Color.m4367equalsimpl0(this.selectedContentColor, ((DefaultSelectableChipColors) other).selectedContentColor) == true) goto L35;
        return false;
    L35:
        if (Color.m4367equalsimpl0(this.selectedLeadingIconColor, ((DefaultSelectableChipColors) other).selectedLeadingIconColor) == true) goto L37;
        return false;
    L37:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.backgroundColor);
        int result2 = (result * 31) + Color.m4373hashCodeimpl(this.contentColor);
        return (((((((((((((result2 * 31) + Color.m4373hashCodeimpl(this.leadingIconColor)) * 31) + Color.m4373hashCodeimpl(this.disabledBackgroundColor)) * 31) + Color.m4373hashCodeimpl(this.disabledContentColor)) * 31) + Color.m4373hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m4373hashCodeimpl(this.selectedBackgroundColor)) * 31) + Color.m4373hashCodeimpl(this.selectedContentColor)) * 31) + Color.m4373hashCodeimpl(this.selectedLeadingIconColor);
    }
}
