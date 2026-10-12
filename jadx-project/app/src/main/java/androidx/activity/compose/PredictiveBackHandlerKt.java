package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: PredictiveBackHandler.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aZ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032A\u0010\u0004\u001a=\b\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b0\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0005H\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006E\u0010\u0010\u001a=\b\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b0\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0005X\u008a\u0084\u0002"}, d2 = {"PredictiveBackHandler", "", "enabled", "", "onBack", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/activity/BackEventCompat;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, NotificationCompat.CATEGORY_PROGRESS, "Lkotlin/coroutines/Continuation;", "", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "activity-compose_release", "currentOnBack"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PredictiveBackHandlerKt {
    public static final void PredictiveBackHandler(boolean enabled, final Function2<Flow<BackEventCompat>, ? super Continuation<Unit>, ? extends Object> r19, Composer $composer, final int $changed, final int r22) {
        Composer $composer2 = $composer.startRestartGroup(-642000585);
        ComposerKt.sourceInformation($composer2, "C(PredictiveBackHandler)78@3130L28,79@3181L24,81@3230L91,86@3419L142,91@3591L38,91@3567L62,*94@3711L7,100@4006L7,102@4068L117,102@4019L166:PredictiveBackHandler.kt#q1dkbc");
        int $dirty = $changed;
        int r6 = r22 & 1;
        if (r6 == 0) goto L6;
        $dirty = $dirty | 6;
        boolean r8 = enabled;
    L14:
        if ((r22 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        if (($dirty & 19) == 18) goto L26;
    L29:
        if (r6 == 0) goto L31;
        final boolean enabled2 = true;
    L33:
        if (ComposerKt.isTraceInProgress() == false) goto L35;
        ComposerKt.traceEventStart(-642000585, $dirty, -1, "androidx.activity.compose.PredictiveBackHandler (PredictiveBackHandler.kt:76)");
    L35:
        State r3 = SnapshotStateKt.rememberUpdatedState(r19, $composer2, ($dirty >> 3) & 14);
        ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart($composer2, -954367824, "CC(remember):Effects.kt#9igjgp");
        Object it$iv$iv = $composer2.rememberedValue();
        if (it$iv$iv != Composer.Companion.getEmpty()) goto L38;
        Object value$iv$iv = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2));
        $composer2.updateRememberedValue(value$iv$iv);
    L39:
        CompositionScopedCoroutineScopeCanceller wrapper$iv = (CompositionScopedCoroutineScopeCanceller) value$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CoroutineScope onBackScope = wrapper$iv.getCoroutineScope();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 1140798889, "CC(remember):PredictiveBackHandler.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L42;
        Object value$iv = new PredictiveBackHandlerCallback(enabled2, onBackScope, PredictiveBackHandler$lambda$0(r3));
        $composer2.updateRememberedValue(value$iv);
    L43:
        final PredictiveBackHandlerCallback backCallBack = (PredictiveBackHandlerCallback) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Object r9 = PredictiveBackHandler$lambda$0(r3);
        ComposerKt.sourceInformationMarkerStart($composer2, 1140804988, "CC(remember):PredictiveBackHandler.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(r9) | $composer2.changed(onBackScope);
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv == false) goto L46;
    L49:
        backCallBack.setCurrentOnBack(PredictiveBackHandler$lambda$0(r3));
        backCallBack.setOnBackScope(onBackScope);
        Object value$iv2 = Unit.INSTANCE;
        $composer2.updateRememberedValue(value$iv2);
    L50:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Boolean r10 = Boolean.valueOf(enabled2);
        ComposerKt.sourceInformationMarkerStart($composer2, 1140810388, "CC(remember):PredictiveBackHandler.kt#9igjgp");
        boolean r11 = $composer2.changedInstance(backCallBack);
        if (($dirty & 14) != 4) goto L53;
        boolean r12 = true;
    L54:
        boolean invalid$iv2 = r11 | r12;
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L57;
    L60:
        PredictiveBackHandlerKt$PredictiveBackHandler$2$1 value$iv3 = new PredictiveBackHandlerKt$PredictiveBackHandler$2$1(backCallBack, enabled2, null);
        $composer2.updateRememberedValue(value$iv3);
    L61:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.LaunchedEffect(r10, (Function2) value$iv3, $composer2, $dirty & 14);
        OnBackPressedDispatcherOwner r5 = LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent($composer2, 6);
        if (r5 == null) goto L78;
        final OnBackPressedDispatcher backDispatcher = r5.getOnBackPressedDispatcher();
        ProvidableCompositionLocal<LifecycleOwner> r7 = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r13 = $composer2.consume(r7);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final LifecycleOwner lifecycleOwner = (LifecycleOwner) r13;
        ComposerKt.sourceInformationMarkerStart($composer2, 1140825731, "CC(remember):PredictiveBackHandler.kt#9igjgp");
        boolean invalid$iv3 = ($composer2.changedInstance(backDispatcher) | $composer2.changedInstance(lifecycleOwner)) | $composer2.changedInstance(backCallBack);
        Object it$iv4 = $composer2.rememberedValue();
        if (invalid$iv3 == false) goto L66;
    L69:
        Object value$iv4 = (Function1) new PredictiveBackHandlerKt$PredictiveBackHandler$3$1(backDispatcher, lifecycleOwner, backCallBack);
        $composer2.updateRememberedValue(value$iv4);
    L70:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.DisposableEffect(lifecycleOwner, backDispatcher, (Function1) value$iv4, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L73;
        ComposerKt.traceEventEnd();
    L73:
        ScopeUpdateScope r4 = $composer2.endRestartGroup();
        if (r4 == null) goto L79;
        r4.updateScope(new AnonymousClass4(enabled2, r19, $changed, r22));
        return;
    L79:
        return;
    L66:
        if (it$iv4 == Composer.Companion.getEmpty()) goto L69;
        value$iv4 = it$iv4;
        goto L70
    L78:
        throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
    L57:
        if (it$iv3 == Composer.Companion.getEmpty()) goto L60;
        value$iv3 = it$iv3;
        goto L61
    L53:
        r12 = false;
        goto L54
    L46:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L50;
    L42:
        value$iv = it$iv;
        goto L43
    L38:
        value$iv$iv = it$iv$iv;
        goto L39
    L31:
        enabled2 = r8;
        goto L33
    L26:
        if ($composer2.getSkipping() == false) goto L29;
        $composer2.skipToGroupEnd();
        enabled2 = r8;
        goto L73
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changedInstance(r19) == false) goto L21;
        int r14 = 32;
    L22:
        $dirty = $dirty | r14;
        goto L24
    L21:
        r14 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r8 = enabled;
        if ($composer2.changed(r8) == false) goto L10;
        int r15 = 4;
    L11:
        $dirty = $dirty | r15;
        goto L14
    L10:
        r15 = 2;
        goto L11
    L12:
        r8 = enabled;
        goto L14
    }

    private static final Function2<Flow<BackEventCompat>, Continuation<Unit>, Object> PredictiveBackHandler$lambda$0(State<? extends Function2<Flow<BackEventCompat>, ? super Continuation<Unit>, ? extends Object>> r4) {
        Object thisObj$iv = r4.getValue();
        return (Function2) thisObj$iv;
    }
}
