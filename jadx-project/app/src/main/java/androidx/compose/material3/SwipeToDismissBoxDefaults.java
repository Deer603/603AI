package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: SwipeToDismissBox.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R,\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00048G¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/material3/SwipeToDismissBoxDefaults;", "", "()V", "positionalThreshold", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "totalDistance", "getPositionalThreshold", "(Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function1;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SwipeToDismissBoxDefaults {
    public static final int $stable = 0;
    public static final SwipeToDismissBoxDefaults INSTANCE = null;

    static {
        INSTANCE = new SwipeToDismissBoxDefaults();
    }

    private SwipeToDismissBoxDefaults() {
    }

    public final Function1<Float, Float> getPositionalThreshold(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1545861529, "C:SwipeToDismissBox.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1545861529, $changed, -1, "androidx.compose.material3.SwipeToDismissBoxDefaults.<get-positionalThreshold> (SwipeToDismissBox.kt:261)");
    L5:
        $composer.startReplaceGroup(-1853326336);
        ComposerKt.sourceInformation($composer, "*261@10762L7,261@10773L16");
        ProvidableCompositionLocal<Density> r0 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        final Density $this$_get_positionalThreshold__u24lambda_u241 = (Density) r3;
        ComposerKt.sourceInformationMarkerStart($composer, 963645440, "CC(remember):SwipeToDismissBox.kt#9igjgp");
        boolean invalid$iv = $composer.changed($this$_get_positionalThreshold__u24lambda_u241);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L8;
    L11:
        Object value$iv = (Function1) new SwipeToDismissBoxDefaults$positionalThreshold$1$1$1($this$_get_positionalThreshold__u24lambda_u241);
        $composer.updateRememberedValue(value$iv);
    L12:
        Function1<Float, Float> r8 = (Function1) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventEnd();
    L15:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r8;
    L8:
        if (it$iv == Composer.Companion.getEmpty()) goto L11;
        value$iv = it$iv;
        goto L12
    }
}
