package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\u001a0\u0010\u0005\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000e\u001a:\u0010\u0005\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u0010\u001aD\u0010\u0005\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u0012\u001a>\u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\u0014\"\u0004\u0018\u00010\r2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u0015\u001aT\u0010\u0016\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0018¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u001b\u001aJ\u0010\u0016\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0018¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u001c\u001a@\u0010\u0016\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0018¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u001d\u001aN\u0010\u0016\u001a\u00020\u00062\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\u0014\"\u0004\u0018\u00010\r2'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0018¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u001e\u001a6\u0010\u0016\u001a\u00020\u00062'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0018¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u001f\u001a\u001b\u0010 \u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060!H\u0007¢\u0006\u0002\u0010\"\u001a\u0018\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0001\u001a#\u0010(\u001a\u00020\u00192\u0013\b\u0006\u0010)\u001a\r\u0012\u0004\u0012\u00020%0!¢\u0006\u0002\b*H\u0087\b¢\u0006\u0002\u0010+\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"DisposableEffectNoParamError", "", "InternalDisposableEffectScope", "Landroidx/compose/runtime/DisposableEffectScope;", "LaunchedEffectNoParamError", "DisposableEffect", "", "effect", "Lkotlin/Function1;", "Landroidx/compose/runtime/DisposableEffectResult;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "key1", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "keys", "", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "LaunchedEffect", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SideEffect", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "createCompositionCoroutineScope", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "composer", "Landroidx/compose/runtime/Composer;", "rememberCoroutineScope", "getContext", "Landroidx/compose/runtime/DisallowComposableCalls;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlinx/coroutines/CoroutineScope;", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class EffectsKt {
    private static final String DisposableEffectNoParamError = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.";
    private static final DisposableEffectScope InternalDisposableEffectScope = null;
    private static final String LaunchedEffectNoParamError = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    public static final /* synthetic */ DisposableEffectScope access$getInternalDisposableEffectScope$p() {
        return InternalDisposableEffectScope;
    }

    public static final void SideEffect(Function0<Unit> r3, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1288466761, "C(SideEffect):Effects.kt#9igjgp");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1288466761, $changed, -1, "androidx.compose.runtime.SideEffect (Effects.kt:49)");
    L5:
        $composer.recordSideEffect(r3);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
    }

    static {
        InternalDisposableEffectScope = new DisposableEffectScope();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = DisposableEffectNoParamError)
    public static final void DisposableEffect(Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> r3, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -904483903, "C(DisposableEffect):Effects.kt#9igjgp");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(-904483903, $changed, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:118)");
    L6:
        throw new IllegalStateException(DisposableEffectNoParamError.toString());
    }

    public static final void DisposableEffect(Object key1, Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> r8, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1371986847, "C(DisposableEffect)P(1)149@6436L47:Effects.kt#9igjgp");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1371986847, $changed, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:148)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 1176211319, "CC(remember):Effects.kt#9igjgp");
        boolean invalid$iv = $composer.changed(key1);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L8;
    L11:
        Object value$iv = new DisposableEffectImpl(r8);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L12:
        DisposableEffectImpl r3 = (DisposableEffectImpl) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventEnd();
    L15:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L8:
        if (it$iv != Composer.Companion.getEmpty()) goto L12;
        goto L11
    }

    public static final void DisposableEffect(Object key1, Object key2, Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> r9, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1429097729, "C(DisposableEffect)P(1,2)186@8313L53:Effects.kt#9igjgp");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1429097729, $changed, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:185)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 1176271389, "CC(remember):Effects.kt#9igjgp");
        boolean invalid$iv = $composer.changed(key1) | $composer.changed(key2);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L8;
    L11:
        Object value$iv = new DisposableEffectImpl(r9);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L12:
        DisposableEffectImpl r3 = (DisposableEffectImpl) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventEnd();
    L15:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L8:
        if (it$iv != Composer.Companion.getEmpty()) goto L12;
        goto L11
    }

    public static final void DisposableEffect(Object key1, Object key2, Object key3, Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> r10, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1239538271, "C(DisposableEffect)P(1,2,3)224@10228L59:Effects.kt#9igjgp");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1239538271, $changed, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:223)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 1176332675, "CC(remember):Effects.kt#9igjgp");
        boolean invalid$iv = ($composer.changed(key1) | $composer.changed(key2)) | $composer.changed(key3);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L8;
    L11:
        Object value$iv = new DisposableEffectImpl(r10);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L12:
        DisposableEffectImpl r3 = (DisposableEffectImpl) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventEnd();
    L15:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L8:
        if (it$iv != Composer.Companion.getEmpty()) goto L12;
        goto L11
    }

    public static final void DisposableEffect(Object[] keys, Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> r11, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1307627122, "C(DisposableEffect)P(1)260@12112L48:Effects.kt#9igjgp");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1307627122, $changed, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:259)");
    L5:
        Object[] keys$iv = Arrays.copyOf(keys, keys.length);
        ComposerKt.sourceInformationMarkerStart($composer, -568225417, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean invalid$iv = false;
        int r4 = keys$iv.length;
        int r5 = 0;
    L6:
        if (r5 >= r4) goto L8;
        Object key$iv = keys$iv[r5];
        invalid$iv = invalid$iv | $composer.changed(key$iv);
        r5 = r5 + 1;
        goto L6
    L8:
        Object it$iv$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L11;
    L14:
        Object value$iv$iv = new DisposableEffectImpl(r11);
        $composer.updateRememberedValue(value$iv$iv);
    L15:
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventEnd();
    L18:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L11:
        if (it$iv$iv != Composer.Companion.getEmpty()) goto L15;
        goto L14
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = LaunchedEffectNoParamError)
    public static final void LaunchedEffect(final Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> r3, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-805415771);
        ComposerKt.sourceInformation($composer2, "C(LaunchedEffect):Effects.kt#9igjgp");
        if (($changed & 1) == 0) goto L5;
        boolean r1 = true;
    L7:
        if ($composer2.shouldExecute(r1, $changed & 1) == true) goto L9;
        $composer2.skipToGroupEnd();
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L17;
        r0.updateScope(new AnonymousClass1(r3, $changed));
        return;
    L17:
        return;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L12;
        ComposerKt.traceEventStart(-805415771, $changed, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:300)");
    L12:
        throw new IllegalStateException(LaunchedEffectNoParamError.toString());
    L5:
        r1 = false;
        goto L7
    }

    public static final void LaunchedEffect(Object key1, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> r9, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1179185413, "C(LaunchedEffect)P(1)318@14464L58:Effects.kt#9igjgp");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1179185413, $changed, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:316)");
    L5:
        CoroutineContext applyContext = $composer.getApplyCoroutineContext();
        ComposerKt.sourceInformationMarkerStart($composer, 2064968948, "CC(remember):Effects.kt#9igjgp");
        boolean invalid$iv = $composer.changed(key1);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L8;
    L11:
        Object value$iv = new LaunchedEffectImpl(applyContext, r9);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L12:
        LaunchedEffectImpl r4 = (LaunchedEffectImpl) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventEnd();
    L15:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L8:
        if (it$iv != Composer.Companion.getEmpty()) goto L12;
        goto L11
    }

    public static final void LaunchedEffect(Object key1, Object key2, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> r10, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 590241125, "C(LaunchedEffect)P(1,2)337@15458L64:Effects.kt#9igjgp");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(590241125, $changed, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:335)");
    L5:
        CoroutineContext applyContext = $composer.getApplyCoroutineContext();
        ComposerKt.sourceInformationMarkerStart($composer, 2065000762, "CC(remember):Effects.kt#9igjgp");
        boolean invalid$iv = $composer.changed(key1) | $composer.changed(key2);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L8;
    L11:
        Object value$iv = new LaunchedEffectImpl(applyContext, r10);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L12:
        LaunchedEffectImpl r4 = (LaunchedEffectImpl) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventEnd();
    L15:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L8:
        if (it$iv != Composer.Companion.getEmpty()) goto L12;
        goto L11
    }

    public static final void LaunchedEffect(Object key1, Object key2, Object key3, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> r11, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -54093371, "C(LaunchedEffect)P(1,2,3)356@16478L70:Effects.kt#9igjgp");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-54093371, $changed, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:354)");
    L5:
        CoroutineContext applyContext = $composer.getApplyCoroutineContext();
        ComposerKt.sourceInformationMarkerStart($composer, 2065033408, "CC(remember):Effects.kt#9igjgp");
        boolean invalid$iv = ($composer.changed(key1) | $composer.changed(key2)) | $composer.changed(key3);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L8;
    L11:
        Object value$iv = new LaunchedEffectImpl(applyContext, r11);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L12:
        LaunchedEffectImpl r4 = (LaunchedEffectImpl) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventEnd();
    L15:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L8:
        if (it$iv != Composer.Companion.getEmpty()) goto L12;
        goto L11
    }

    public static final void LaunchedEffect(Object[] keys, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> r12, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -139560008, "C(LaunchedEffect)P(1)379@17637L59:Effects.kt#9igjgp");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-139560008, $changed, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:377)");
    L5:
        CoroutineContext applyContext = $composer.getApplyCoroutineContext();
        Object[] keys$iv = Arrays.copyOf(keys, keys.length);
        ComposerKt.sourceInformationMarkerStart($composer, -568225417, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean invalid$iv = false;
        int r5 = keys$iv.length;
        int r6 = 0;
    L6:
        if (r6 >= r5) goto L8;
        Object key$iv = keys$iv[r6];
        invalid$iv = invalid$iv | $composer.changed(key$iv);
        r6 = r6 + 1;
        goto L6
    L8:
        Object it$iv$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L11;
    L14:
        Object value$iv$iv = new LaunchedEffectImpl(applyContext, r12);
        $composer.updateRememberedValue(value$iv$iv);
    L15:
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventEnd();
    L18:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L11:
        if (it$iv$iv != Composer.Companion.getEmpty()) goto L15;
        goto L14
    }

    public static final CoroutineScope createCompositionCoroutineScope(CoroutineContext coroutineContext, Composer composer) {
        if (coroutineContext.get(Job.Key) == null) goto L5;
        CompletableJob $this$createCompositionCoroutineScope_u24lambda_u248 = JobKt.Job$default(null, 1, null);
        $this$createCompositionCoroutineScope_u24lambda_u248.completeExceptionally(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return CoroutineScopeKt.CoroutineScope($this$createCompositionCoroutineScope_u24lambda_u248);
    L5:
        CoroutineContext applyContext = composer.getApplyCoroutineContext();
        return new RememberedCoroutineScope(applyContext, coroutineContext);
    }

    public static final CoroutineScope rememberCoroutineScope(Function0 r8, Composer $composer, int $changed, int r11) {
        ComposerKt.sourceInformationMarkerStart($composer, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        if ((r11 & 1) == 0) goto L5;
        Function0 getContext = C06091.INSTANCE;
        r8 = getContext;
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, -954203484, "CC(remember):Effects.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L9;
        Object value$iv = createCompositionCoroutineScope(r8.invoke(), $composer);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L9:
        CoroutineScope r4 = (CoroutineScope) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r4;
    }
}
