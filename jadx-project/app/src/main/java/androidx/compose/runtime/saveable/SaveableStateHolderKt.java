package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;

/* JADX INFO: compiled from: SaveableStateHolder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"rememberSaveableStateHolder", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/saveable/SaveableStateHolder;", "runtime-saveable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SaveableStateHolderKt {
    public static final SaveableStateHolder rememberSaveableStateHolder(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 15454635, "C(rememberSaveableStateHolder):SaveableStateHolder.kt#r2ddri");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(15454635, $changed, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:56)");
    L5:
        $composer.startReplaceGroup(-796079677);
        ComposerKt.sourceInformation($composer, "*56@2463L85,57@2623L7");
        Object r8 = RememberSaveableKt.m3923rememberSaveable(new Object[0], SaveableStateHolderImpl.Companion.getSaver(), null, AnonymousClass1.INSTANCE, $composer, 3072, 4);
        SaveableStateHolderImpl $this$rememberSaveableStateHolder_u24lambda_u240 = (SaveableStateHolderImpl) r8;
        ProvidableCompositionLocal<SaveableStateRegistry> r2 = SaveableStateRegistryKt.getLocalSaveableStateRegistry();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r6 = $composer.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $this$rememberSaveableStateHolder_u24lambda_u240.setParentSaveableStateRegistry((SaveableStateRegistry) r6);
        SaveableStateHolderImpl r9 = (SaveableStateHolderImpl) r8;
        $composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r9;
    }
}
