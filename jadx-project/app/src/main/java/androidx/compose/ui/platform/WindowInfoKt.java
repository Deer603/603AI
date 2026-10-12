package androidx.compose.ui.platform;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: WindowInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"WindowFocusObserver", "", "onWindowFocusChanged", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "isWindowFocused", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class WindowInfoKt {
    public static final void WindowFocusObserver(final Function1<? super Boolean, Unit> r12, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(127829799);
        ComposerKt.sourceInformation($composer2, "C(WindowFocusObserver)59@2485L7,60@2512L42,61@2586L90,61@2559L117:WindowInfo.kt#itgzvw");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r12) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($dirty & 3) == 2) goto L12;
        boolean r3 = true;
    L14:
        if ($composer2.shouldExecute(r3, $dirty & 1) == true) goto L16;
        $composer2.skipToGroupEnd();
    L29:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L33;
        r0.updateScope(new AnonymousClass2(r12, $changed));
        return;
    L33:
        return;
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(127829799, $dirty, -1, "androidx.compose.ui.platform.WindowFocusObserver (WindowInfo.kt:58)");
    L18:
        ProvidableCompositionLocal<WindowInfo> r1 = CompositionLocalsKt.getLocalWindowInfo();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r5 = $composer2.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        WindowInfo windowInfo = (WindowInfo) r5;
        State callback = SnapshotStateKt.rememberUpdatedState(r12, $composer2, $dirty & 14);
        ComposerKt.sourceInformationMarkerStart($composer2, -1536563210, "CC(remember):WindowInfo.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(windowInfo) | $composer2.changed(callback);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L21;
    L24:
        Object value$iv = (Function2) new WindowInfoKt$WindowFocusObserver$1$1(windowInfo, callback, null);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L25:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.LaunchedEffect(windowInfo, (Function2) it$iv, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L29;
        ComposerKt.traceEventEnd();
        goto L29
    L21:
        if (it$iv != Composer.Companion.getEmpty()) goto L25;
    L12:
        r3 = false;
        goto L14
    }
}
