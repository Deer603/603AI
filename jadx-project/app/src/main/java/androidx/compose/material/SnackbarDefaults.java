package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: Snackbar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\u00020\u00068Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/material/SnackbarDefaults;", "", "()V", "SnackbarOverlayAlpha", "", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "getBackgroundColor", "(Landroidx/compose/runtime/Composer;I)J", "primaryActionColor", "getPrimaryActionColor", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SnackbarDefaults {
    public static final int $stable = 0;
    public static final SnackbarDefaults INSTANCE = null;
    private static final float SnackbarOverlayAlpha = 0.8f;

    static {
        INSTANCE = new SnackbarDefaults();
    }

    private SnackbarDefaults() {
    }

    public final long getBackgroundColor(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1630911716, "C(<get-backgroundColor>)203@8668L6,205@8782L6:Snackbar.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1630911716, $changed, -1, "androidx.compose.material.SnackbarDefaults.<get-backgroundColor> (Snackbar.kt:203)");
    L5:
        long r0 = ColorKt.m4411compositeOverOWjLjI(Color.m4365copywmQWz5c$default(MaterialTheme.INSTANCE.getColors($composer, 6).m1597getOnSurface0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors($composer, 6).m1602getSurface0d7_KjU());
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final long getPrimaryActionColor(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -810329402, "C(<get-primaryActionColor>)224@9730L6:Snackbar.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-810329402, $changed, -1, "androidx.compose.material.SnackbarDefaults.<get-primaryActionColor> (Snackbar.kt:223)");
    L5:
        Colors colors = MaterialTheme.INSTANCE.getColors($composer, 6);
        if (colors.isLight() == false) goto L8;
        long primary = colors.m1598getPrimary0d7_KjU();
        long overlayColor = Color.m4365copywmQWz5c$default(colors.m1602getSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
        long primary2 = ColorKt.m4411compositeOverOWjLjI(overlayColor, primary);
    L10:
        if (ComposerKt.isTraceInProgress() == false) goto L12;
        ComposerKt.traceEventEnd();
    L12:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return primary2;
    L8:
        primary2 = colors.m1599getPrimaryVariant0d7_KjU();
        goto L10
    }
}
