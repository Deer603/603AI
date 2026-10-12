package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: LazySaveableStateHolder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"LazySaveableStateHolderProvider", "", "content", "Lkotlin/Function1;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazySaveableStateHolderKt {
    public static final void LazySaveableStateHolderProvider(final Function3<? super SaveableStateHolder, ? super Composer, ? super Integer, Unit> r13, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(674185128);
        ComposerKt.sourceInformation($composer2, "C(LazySaveableStateHolderProvider)40@2007L7,41@2039L29,46@2233L91,43@2094L230,49@2398L19,49@2329L88:LazySaveableStateHolder.kt#wow0x6");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r13) == false) goto L7;
        int r1 = 4;
    L8:
        $dirty = $dirty | r1;
        goto L10
    L7:
        r1 = 2;
    L10:
        if (($dirty & 3) == 2) goto L12;
        boolean r2 = true;
    L14:
        if ($composer2.shouldExecute(r2, $dirty & 1) == true) goto L16;
        $composer2.skipToGroupEnd();
    L29:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L33;
        r0.updateScope(new AnonymousClass2(r13, $changed));
        return;
    L33:
        return;
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(674185128, $dirty, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:39)");
    L18:
        ProvidableCompositionLocal<SaveableStateRegistry> r3 = SaveableStateRegistryKt.getLocalSaveableStateRegistry();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r4 = $composer2.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final SaveableStateRegistry currentRegistry = (SaveableStateRegistry) r4;
        final SaveableStateHolder wrappedHolder = SaveableStateHolderKt.rememberSaveableStateHolder($composer2, 0);
        Object[] r5 = {currentRegistry};
        Saver<LazySaveableStateHolder, Map<String, List<Object>>> r6 = LazySaveableStateHolder.Companion.saver(currentRegistry, wrappedHolder);
        ComposerKt.sourceInformationMarkerStart($composer2, -16182502, "CC(remember):LazySaveableStateHolder.kt#9igjgp");
        boolean invalid$iv = $composer2.changedInstance(currentRegistry) | $composer2.changedInstance(wrappedHolder);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L21;
    L24:
        Object value$iv = (Function0) new LazySaveableStateHolderKt$LazySaveableStateHolderProvider$holder$1$1(currentRegistry, wrappedHolder);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L25:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final LazySaveableStateHolder holder = (LazySaveableStateHolder) RememberSaveableKt.m3923rememberSaveable(r5, r6, null, (Function0) it$iv, $composer2, 0, 4);
        CompositionLocalKt.CompositionLocalProvider(SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(holder), ComposableLambdaKt.rememberComposableLambda(1863926504, true, new AnonymousClass1(r13, holder), $composer2, 54), $composer2, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress() == false) goto L29;
        ComposerKt.traceEventEnd();
        goto L29
    L21:
        if (it$iv != Composer.Companion.getEmpty()) goto L25;
    L12:
        r2 = false;
        goto L14
    }
}
