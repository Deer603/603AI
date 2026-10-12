package androidx.activity.compose;

import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: BackHandler.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\u0010\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u008a\u0084\u0002"}, d2 = {"BackHandler", "", "enabled", "", "onBack", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "activity-compose_release", "currentOnBack"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BackHandlerKt {
    public static final /* synthetic */ Function0 access$BackHandler$lambda$0(State $currentOnBack$delegate) {
        return BackHandler$lambda$0($currentOnBack$delegate);
    }

    public static final void BackHandler(boolean enabled, final Function0<Unit> r17, Composer $composer, final int $changed, final int r20) {
        Composer $composer2 = $composer.startRestartGroup(-361453782);
        ComposerKt.sourceInformation($composer2, "C(BackHandler)83@3466L28,85@3596L171,93@3868L36,93@3857L47,*95@3985L7,100@4279L7,101@4340L233,101@4291L282:BackHandler.kt#q1dkbc");
        int $dirty = $changed;
        int r6 = r20 & 1;
        if (r6 == 0) goto L6;
        $dirty = $dirty | 6;
        boolean r8 = enabled;
    L14:
        if ((r20 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        if (($dirty & 19) == 18) goto L26;
    L29:
        if (r6 == 0) goto L31;
        final boolean enabled2 = true;
    L33:
        if (ComposerKt.isTraceInProgress() == false) goto L35;
        ComposerKt.traceEventStart(-361453782, $dirty, -1, "androidx.activity.compose.BackHandler (BackHandler.kt:81)");
    L35:
        final State currentOnBack$delegate = SnapshotStateKt.rememberUpdatedState(r17, $composer2, ($dirty >> 3) & 14);
        ComposerKt.sourceInformationMarkerStart($composer2, -41177256, "CC(remember):BackHandler.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L38;
        Object value$iv = new BackHandlerKt$BackHandler$backCallback$1$1(enabled2, currentOnBack$delegate);
        $composer2.updateRememberedValue(value$iv);
    L39:
        final BackHandlerKt$BackHandler$backCallback$1$1 backCallback = (BackHandlerKt$BackHandler$backCallback$1$1) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -41168687, "CC(remember):BackHandler.kt#9igjgp");
        if (($dirty & 14) != 4) goto L42;
        boolean invalid$iv = true;
    L43:
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv == false) goto L46;
    L49:
        Object value$iv2 = (Function0) new BackHandlerKt$BackHandler$1$1(backCallback, enabled2);
        $composer2.updateRememberedValue(value$iv2);
    L50:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.SideEffect((Function0) value$iv2, $composer2, 0);
        OnBackPressedDispatcherOwner r7 = LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent($composer2, 6);
        if (r7 == null) goto L67;
        final OnBackPressedDispatcher backDispatcher = r7.getOnBackPressedDispatcher();
        ProvidableCompositionLocal<LifecycleOwner> r10 = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r13 = $composer2.consume(r10);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final LifecycleOwner lifecycleOwner = (LifecycleOwner) r13;
        ComposerKt.sourceInformationMarkerStart($composer2, -41153386, "CC(remember):BackHandler.kt#9igjgp");
        boolean invalid$iv2 = $composer2.changedInstance(backDispatcher) | $composer2.changedInstance(lifecycleOwner);
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L55;
    L58:
        Object value$iv3 = (Function1) new BackHandlerKt$BackHandler$2$1(backDispatcher, lifecycleOwner, backCallback);
        $composer2.updateRememberedValue(value$iv3);
    L59:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.DisposableEffect(lifecycleOwner, backDispatcher, (Function1) value$iv3, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L62;
        ComposerKt.traceEventEnd();
    L62:
        ScopeUpdateScope r3 = $composer2.endRestartGroup();
        if (r3 == null) goto L68;
        r3.updateScope(new AnonymousClass3(enabled2, r17, $changed, r20));
        return;
    L68:
        return;
    L55:
        if (it$iv3 == Composer.Companion.getEmpty()) goto L58;
        value$iv3 = it$iv3;
        goto L59
    L67:
        throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
    L46:
        if (it$iv2 == Composer.Companion.getEmpty()) goto L49;
        value$iv2 = it$iv2;
        goto L50
    L42:
        invalid$iv = false;
        goto L43
    L38:
        value$iv = it$iv;
        goto L39
    L31:
        enabled2 = r8;
        goto L33
    L26:
        if ($composer2.getSkipping() == false) goto L29;
        $composer2.skipToGroupEnd();
        enabled2 = r8;
        goto L62
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changedInstance(r17) == false) goto L21;
        int r9 = 32;
    L22:
        $dirty = $dirty | r9;
        goto L24
    L21:
        r9 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r8 = enabled;
        if ($composer2.changed(r8) == false) goto L10;
        int r11 = 4;
    L11:
        $dirty = $dirty | r11;
        goto L14
    L10:
        r11 = 2;
        goto L11
    L12:
        r8 = enabled;
        goto L14
    }

    private static final Function0<Unit> BackHandler$lambda$0(State<? extends Function0<Unit>> r4) {
        Object thisObj$iv = r4.getValue();
        return (Function0) thisObj$iv;
    }
}
