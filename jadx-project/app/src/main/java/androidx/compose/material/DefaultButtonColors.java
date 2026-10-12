package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fJ\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/material/DefaultButtonColors;", "Landroidx/compose/material/ButtonColors;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledBackgroundColor", "disabledContentColor", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "Landroidx/compose/runtime/State;", "enabled", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "equals", "other", "", "hashCode", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultButtonColors implements ButtonColors {
    private final long backgroundColor;
    private final long contentColor;
    private final long disabledBackgroundColor;
    private final long disabledContentColor;

    public /* synthetic */ DefaultButtonColors(long r1, long r3, long r5, long r7, DefaultConstructorMarker r9) {
        this(r1, r3, r5, r7);
    }

    private DefaultButtonColors(long backgroundColor, long contentColor, long disabledBackgroundColor, long disabledContentColor) {
        this.backgroundColor = backgroundColor;
        this.contentColor = contentColor;
        this.disabledBackgroundColor = disabledBackgroundColor;
        this.disabledContentColor = disabledContentColor;
    }

    @Override // androidx.compose.material.ButtonColors
    public State<Color> backgroundColor(boolean enabled, Composer $composer, int $changed) {
        $composer.startReplaceGroup(-655254499);
        ComposerKt.sourceInformation($composer, "C(backgroundColor)585@24107L79:Button.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-655254499, $changed, -1, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:584)");
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

    @Override // androidx.compose.material.ButtonColors
    public State<Color> contentColor(boolean enabled, Composer $composer, int $changed) {
        $composer.startReplaceGroup(-2133647540);
        ComposerKt.sourceInformation($composer, "C(contentColor)590@24289L73:Button.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-2133647540, $changed, -1, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:589)");
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

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L23:
        return false;
    L8:
        if (getClass() != other.getClass()) goto L23;
        DefaultButtonColors r2 = (DefaultButtonColors) other;
        if (Color.m4367equalsimpl0(this.backgroundColor, ((DefaultButtonColors) other).backgroundColor) == true) goto L14;
        return false;
    L14:
        if (Color.m4367equalsimpl0(this.contentColor, ((DefaultButtonColors) other).contentColor) == true) goto L17;
        return false;
    L17:
        if (Color.m4367equalsimpl0(this.disabledBackgroundColor, ((DefaultButtonColors) other).disabledBackgroundColor) == true) goto L20;
        return false;
    L20:
        if (Color.m4367equalsimpl0(this.disabledContentColor, ((DefaultButtonColors) other).disabledContentColor) == true) goto L22;
        return false;
    L22:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.backgroundColor);
        int result2 = (result * 31) + Color.m4373hashCodeimpl(this.contentColor);
        return (((result2 * 31) + Color.m4373hashCodeimpl(this.disabledBackgroundColor)) * 31) + Color.m4373hashCodeimpl(this.disabledContentColor);
    }
}
