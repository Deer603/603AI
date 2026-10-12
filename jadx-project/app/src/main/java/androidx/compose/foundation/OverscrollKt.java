package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;

/* JADX INFO: compiled from: Overscroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0014\u0010\b\u001a\u00020\t*\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u001a\f\u0010\u000b\u001a\u00020\u0006*\u00020\u0006H\u0007\u001a\f\u0010\f\u001a\u00020\u0006*\u00020\u0006H\u0007\"\u0019\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\r"}, d2 = {"LocalOverscrollFactory", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/foundation/OverscrollFactory;", "getLocalOverscrollFactory", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "rememberOverscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;", "overscroll", "Landroidx/compose/ui/Modifier;", "overscrollEffect", "withoutEventHandling", "withoutVisualEffect", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class OverscrollKt {
    private static final ProvidableCompositionLocal<OverscrollFactory> LocalOverscrollFactory = null;

    public static final OverscrollEffect withoutVisualEffect(OverscrollEffect $this$withoutVisualEffect) {
        return new WrappedOverscrollEffect(false, true, $this$withoutVisualEffect);
    }

    public static final OverscrollEffect withoutEventHandling(OverscrollEffect $this$withoutEventHandling) {
        return new WrappedOverscrollEffect(true, false, $this$withoutEventHandling);
    }

    public static final Modifier overscroll(Modifier $this$overscroll, OverscrollEffect overscrollEffect) {
        if (overscrollEffect == null) goto L5;
        Modifier.Companion effectModifier = overscrollEffect.getEffectModifier();
        if (effectModifier == null) goto L5;
    L7:
        if (effectModifier == Modifier.Companion) goto L9;
        OverscrollModifierElement modifier = effectModifier;
    L11:
        return $this$overscroll.then(modifier);
    L9:
        modifier = new OverscrollModifierElement(overscrollEffect);
    L5:
        effectModifier = Modifier.Companion;
        goto L7
    }

    public static final OverscrollEffect rememberOverscrollEffect(Composer $composer, int $changed) {
        $composer.startReplaceGroup(282942128);
        ComposerKt.sourceInformation($composer, "C(rememberOverscrollEffect)345@15312L7,346@15346L74:Overscroll.kt#71ulvw");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(282942128, $changed, -1, "androidx.compose.foundation.rememberOverscrollEffect (Overscroll.kt:344)");
    L5:
        ProvidableCompositionLocal<OverscrollFactory> r0 = LocalOverscrollFactory;
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        OverscrollFactory overscrollFactory = (OverscrollFactory) r3;
        if (overscrollFactory == null) goto L8;
        ComposerKt.sourceInformationMarkerStart($composer, 1852674691, "CC(remember):Overscroll.kt#9igjgp");
        boolean invalid$iv = $composer.changed(overscrollFactory);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L15;
    L18:
        Object value$iv = overscrollFactory.createOverscrollEffect();
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L19:
        OverscrollEffect r4 = (OverscrollEffect) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L22;
        ComposerKt.traceEventEnd();
    L22:
        $composer.endReplaceGroup();
        return r4;
    L15:
        if (it$iv != Composer.Companion.getEmpty()) goto L19;
    L8:
        if (ComposerKt.isTraceInProgress() == false) goto L10;
        ComposerKt.traceEventEnd();
    L10:
        $composer.endReplaceGroup();
        return null;
    }

    public static final ProvidableCompositionLocal<OverscrollFactory> getLocalOverscrollFactory() {
        return LocalOverscrollFactory;
    }

    static {
        LocalOverscrollFactory = CompositionLocalKt.compositionLocalWithComputedDefaultOf(OverscrollKt$LocalOverscrollFactory$1.INSTANCE);
    }
}
