package androidx.compose.material3.internal;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccessibilityServiceStateProvider.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a;\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0003¢\u0006\u0002\u0010\u000b\u001a'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"SwitchAccessActivityName", "", "ObserveState", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "handleEvent", "Lkotlin/Function1;", "Landroidx/lifecycle/Lifecycle$Event;", "onDispose", "Lkotlin/Function0;", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "rememberAccessibilityServiceState", "Landroidx/compose/runtime/State;", "", "listenToTouchExplorationState", "listenToSwitchAccessState", "(ZZLandroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AccessibilityServiceStateProvider_androidKt {
    private static final String SwitchAccessActivityName = "SwitchAccess";

    public static final /* synthetic */ void access$ObserveState(LifecycleOwner lifecycleOwner, Function1 handleEvent, Function0 onDispose, Composer $composer, int $changed, int $default) {
        ObserveState(lifecycleOwner, handleEvent, onDispose, $composer, $changed, $default);
    }

    public static final State<Boolean> rememberAccessibilityServiceState(boolean listenToTouchExplorationState, boolean listenToSwitchAccessState, Composer $composer, int $changed, int r20) {
        ComposerKt.sourceInformationMarkerStart($composer, -1771705152, "C(rememberAccessibilityServiceState)P(1)47@1997L7,52@2152L157,57@2374L7,58@2405L144,63@2571L45,56@2315L307:AccessibilityServiceStateProvider.android.kt#mqatfk");
        if ((r20 & 1) == 0) goto L5;
        boolean listenToTouchExplorationState2 = true;
    L7:
        if ((r20 & 2) == 0) goto L9;
        boolean listenToSwitchAccessState2 = true;
    L11:
        if (ComposerKt.isTraceInProgress() == false) goto L13;
        ComposerKt.traceEventStart(-1771705152, $changed, -1, "androidx.compose.material3.internal.rememberAccessibilityServiceState (AccessibilityServiceStateProvider.android.kt:46)");
    L13:
        ProvidableCompositionLocal<Context> r0 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r9 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Context context = (Context) r9;
        Object r1 = context.getSystemService("accessibility");
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        final AccessibilityManager accessibilityManager = (AccessibilityManager) r1;
        ComposerKt.sourceInformationMarkerStart($composer, 18334252, "CC(remember):AccessibilityServiceStateProvider.android.kt#9igjgp");
        boolean r2 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L18;
        if ($composer.changed(listenToTouchExplorationState2) == false) goto L18;
    L19:
        boolean r3 = true;
    L22:
        if ((($changed & 112) ^ 48) <= 32) goto L26;
        if ($composer.changed(listenToSwitchAccessState2) == false) goto L26;
    L27:
        r2 = true;
    L28:
        boolean invalid$iv = r3 | r2;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L31;
    L34:
        Object value$iv = new Listener(listenToTouchExplorationState2, listenToSwitchAccessState2);
        $composer.updateRememberedValue(value$iv);
    L35:
        final Listener listener = (Listener) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ProvidableCompositionLocal<LifecycleOwner> r4 = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r5 = $composer.consume(r4);
        ComposerKt.sourceInformationMarkerEnd($composer);
        LifecycleOwner r6 = (LifecycleOwner) r5;
        ComposerKt.sourceInformationMarkerStart($composer, 18342335, "CC(remember):AccessibilityServiceStateProvider.android.kt#9igjgp");
        boolean invalid$iv2 = $composer.changed(listener) | $composer.changedInstance(accessibilityManager);
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv2 == false) goto L38;
    L41:
        Object value$iv2 = (Function1) new AccessibilityServiceStateProvider_androidKt$rememberAccessibilityServiceState$1$1(listener, accessibilityManager);
        $composer.updateRememberedValue(value$iv2);
    L42:
        Function1 r14 = (Function1) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 18347548, "CC(remember):AccessibilityServiceStateProvider.android.kt#9igjgp");
        boolean invalid$iv3 = $composer.changed(listener) | $composer.changedInstance(accessibilityManager);
        Object it$iv3 = $composer.rememberedValue();
        if (invalid$iv3 == false) goto L45;
    L48:
        Object value$iv3 = (Function0) new AccessibilityServiceStateProvider_androidKt$rememberAccessibilityServiceState$2$1(listener, accessibilityManager);
        $composer.updateRememberedValue(value$iv3);
    L49:
        ComposerKt.sourceInformationMarkerEnd($composer);
        ObserveState(r6, r14, (Function0) value$iv3, $composer, 0, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L52;
        ComposerKt.traceEventEnd();
    L52:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return listener;
    L45:
        if (it$iv3 == Composer.Companion.getEmpty()) goto L48;
        value$iv3 = it$iv3;
        goto L49
    L38:
        if (it$iv2 == Composer.Companion.getEmpty()) goto L41;
        value$iv2 = it$iv2;
        goto L42
    L31:
        if (it$iv == Composer.Companion.getEmpty()) goto L34;
        value$iv = it$iv;
    L26:
        if (($changed & 48) != 32) goto L28;
    L18:
        if (($changed & 6) == 4) goto L19;
        r3 = false;
        goto L22
    L9:
        listenToSwitchAccessState2 = listenToSwitchAccessState;
        goto L11
    L5:
        listenToTouchExplorationState2 = listenToTouchExplorationState;
        goto L7
    }

    private static final void ObserveState(final LifecycleOwner lifecycleOwner, Function1 r9, Function0 r10, Composer $composer, final int $changed, final int r13) {
        Composer $composer2 = $composer.startRestartGroup(-1868327245);
        ComposerKt.sourceInformation($composer2, "C(ObserveState)P(1)75@2842L259,75@2809L292:AccessibilityServiceStateProvider.android.kt#mqatfk");
        int $dirty = $changed;
        if ((r13 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r2 = r13 & 2;
        if (r2 == 0) goto L16;
        $dirty = $dirty | 48;
    L22:
        int r4 = r13 & 4;
        if (r4 == 0) goto L26;
        $dirty = $dirty | 384;
    L33:
        if (($dirty & 147) == 146) goto L35;
    L39:
        if (r2 == 0) goto L41;
        Function1 handleEvent = AnonymousClass1.INSTANCE;
        r9 = handleEvent;
    L41:
        if (r4 == 0) goto L44;
        Function0 onDispose = AnonymousClass2.INSTANCE;
        r10 = onDispose;
    L44:
        if (ComposerKt.isTraceInProgress() == false) goto L46;
        ComposerKt.traceEventStart(-1868327245, $dirty, -1, "androidx.compose.material3.internal.ObserveState (AccessibilityServiceStateProvider.android.kt:74)");
    L46:
        ComposerKt.sourceInformationMarkerStart($composer2, 1591666214, "CC(remember):AccessibilityServiceStateProvider.android.kt#9igjgp");
        boolean r3 = false;
        if (($dirty & 112) != 32) goto L49;
        boolean r0 = true;
    L50:
        boolean r1 = r0 | $composer2.changedInstance(lifecycleOwner);
        if (($dirty & 896) != 256) goto L53;
        r3 = true;
    L53:
        boolean invalid$iv = r1 | r3;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L56;
    L59:
        AccessibilityServiceStateProvider_androidKt$ObserveState$3$1 value$iv = new AccessibilityServiceStateProvider_androidKt$ObserveState$3$1(lifecycleOwner, r9, r10);
        $composer2.updateRememberedValue(value$iv);
    L60:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.DisposableEffect(lifecycleOwner, (Function1) value$iv, $composer2, $dirty & 14);
        if (ComposerKt.isTraceInProgress() == true) goto L62;
    L38:
        final Function1<? super Lifecycle.Event, Unit> r5 = r9;
        final Function0<Unit> r6 = r10;
        ScopeUpdateScope r11 = $composer2.endRestartGroup();
        if (r11 == null) goto L67;
        r11.updateScope(new AnonymousClass4(lifecycleOwner, r5, r6, $changed, r13));
        return;
    L67:
        return;
    L62:
        ComposerKt.traceEventEnd();
        goto L38
    L56:
        if (it$iv == Composer.Companion.getEmpty()) goto L59;
        value$iv = it$iv;
        goto L60
    L49:
        r0 = false;
        goto L50
    L35:
        if ($composer2.getSkipping() == false) goto L39;
        $composer2.skipToGroupEnd();
        goto L38
    L26:
        if (($changed & 384) != 0) goto L33;
        if ($composer2.changedInstance(r10) == false) goto L30;
        int r7 = 256;
    L31:
        $dirty = $dirty | r7;
        goto L33
    L30:
        r7 = 128;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        if ($composer2.changedInstance(r9) == false) goto L20;
        int r8 = 32;
    L21:
        $dirty = $dirty | r8;
        goto L22
    L20:
        r8 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changedInstance(lifecycleOwner) == false) goto L10;
        int r12 = 4;
    L11:
        $dirty = $dirty | r12;
        goto L12
    L10:
        r12 = 2;
        goto L11
    }
}
