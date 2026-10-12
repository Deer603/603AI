package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: compiled from: ElevationOverlay.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0017ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/material/DefaultElevationOverlay;", "Landroidx/compose/material/ElevationOverlay;", "()V", "apply", "Landroidx/compose/ui/graphics/Color;", "color", "elevation", "Landroidx/compose/ui/unit/Dp;", "apply-7g2Lkgo", "(JFLandroidx/compose/runtime/Composer;I)J", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultElevationOverlay implements ElevationOverlay {
    public static final DefaultElevationOverlay INSTANCE = null;

    static {
        INSTANCE = new DefaultElevationOverlay();
    }

    private DefaultElevationOverlay() {
    }

    @Override // androidx.compose.material.ElevationOverlay
    /* JADX INFO: renamed from: apply-7g2Lkgo, reason: not valid java name */
    public long mo1639apply7g2Lkgo(long color, float elevation, Composer $composer, int $changed) {
        $composer.startReplaceGroup(-1687113661);
        ComposerKt.sourceInformation($composer, "C(apply)P(0:c#ui.graphics.Color,1:c#ui.unit.Dp)68@2746L6:ElevationOverlay.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1687113661, $changed, -1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:67)");
    L5:
        Colors colors = MaterialTheme.INSTANCE.getColors($composer, 6);
        int $this$dp$iv = Dp.m6972compareTo0680j_4(elevation, Dp.m6973constructorimpl(0));
        if ($this$dp$iv > 0) goto L8;
    L10:
        $composer.startReplaceGroup(1169156439);
        $composer.endReplaceGroup();
        long foregroundColor = color;
    L12:
        if (ComposerKt.isTraceInProgress() == false) goto L14;
        ComposerKt.traceEventEnd();
    L14:
        $composer.endReplaceGroup();
        return foregroundColor;
    L8:
        if (colors.isLight() == true) goto L10;
        $composer.startReplaceGroup(1169017931);
        ComposerKt.sourceInformation($composer, "70@2845L42");
        long foregroundColor2 = ElevationOverlayKt.m1664access$calculateForegroundColorCLU3JFs(color, elevation, $composer, ($changed & 14) | ($changed & 112));
        foregroundColor = ColorKt.m4411compositeOverOWjLjI(foregroundColor2, color);
        $composer.endReplaceGroup();
        goto L12
    }
}
