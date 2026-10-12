package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;

/* JADX INFO: compiled from: MaterialTheme.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/material3/MaterialTheme;", "", "()V", "colorScheme", "Landroidx/compose/material3/ColorScheme;", "getColorScheme", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;", "shapes", "Landroidx/compose/material3/Shapes;", "getShapes", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Shapes;", "typography", "Landroidx/compose/material3/Typography;", "getTypography", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MaterialTheme {
    public static final int $stable = 0;
    public static final MaterialTheme INSTANCE = null;

    static {
        INSTANCE = new MaterialTheme();
    }

    private MaterialTheme() {
    }

    public final ColorScheme getColorScheme(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -561618718, "C83@3609L7:MaterialTheme.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-561618718, $changed, -1, "androidx.compose.material3.MaterialTheme.<get-colorScheme> (MaterialTheme.kt:83)");
    L5:
        ProvidableCompositionLocal<ColorScheme> r0 = ColorSchemeKt.getLocalColorScheme();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ColorScheme r4 = (ColorScheme) r3;
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r4;
    }

    public final Typography getTypography(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -942794935, "C91@3895L7:MaterialTheme.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-942794935, $changed, -1, "androidx.compose.material3.MaterialTheme.<get-typography> (MaterialTheme.kt:91)");
    L5:
        ProvidableCompositionLocal<Typography> r0 = TypographyKt.getLocalTypography();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Typography r4 = (Typography) r3;
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r4;
    }

    public final Shapes getShapes(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 419509830, "C99@4161L7:MaterialTheme.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(419509830, $changed, -1, "androidx.compose.material3.MaterialTheme.<get-shapes> (MaterialTheme.kt:99)");
    L5:
        ProvidableCompositionLocal<Shapes> r0 = ShapesKt.getLocalShapes();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Shapes r4 = (Shapes) r3;
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r4;
    }
}
