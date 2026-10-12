package androidx.lifecycle.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SpreadBuilder;

/* JADX INFO: compiled from: LifecycleEffect.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001a:\u0010\t\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001aD\u0010\t\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0013\u001aN\u0010\t\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0015\u001aH\u0010\t\u001a\u00020\u00012\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u0017\"\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0018\u001a0\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u001b\u001a6\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u000e2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0003¢\u0006\u0002\u0010\u001e\u001a:\u0010\u001f\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001aD\u0010\u001f\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0013\u001aN\u0010\u001f\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0015\u001aH\u0010\u001f\u001a\u00020\u00012\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u0017\"\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0018\u001a0\u0010\u001f\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\r¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u001b\u001a6\u0010#\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020 2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\r¢\u0006\u0002\b\u0010H\u0003¢\u0006\u0002\u0010$\"\u000e\u0010\u0019\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000¨\u0006%²\u0006\u0010\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007X\u008a\u0084\u0002"}, d2 = {"LifecycleEventEffect", "", NotificationCompat.CATEGORY_EVENT, "Landroidx/lifecycle/Lifecycle$Event;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onEvent", "Lkotlin/Function0;", "(Landroidx/lifecycle/Lifecycle$Event;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "LifecycleStartEffect", "key1", "", "effects", "Lkotlin/Function1;", "Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;", "Landroidx/lifecycle/compose/LifecycleStopOrDisposeEffectResult;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "keys", "", "([Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LifecycleStartEffectNoParamError", "", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LifecycleStartEffectImpl", "scope", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "LifecycleResumeEffect", "Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;", "Landroidx/lifecycle/compose/LifecyclePauseOrDisposeEffectResult;", "LifecycleResumeEffectNoParamError", "LifecycleResumeEffectImpl", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "lifecycle-runtime-compose_release", "currentOnEvent"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LifecycleEffectKt {
    private static final String LifecycleResumeEffectNoParamError = "LifecycleResumeEffect must provide one or more 'key' parameters that define the identity of the LifecycleResumeEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";
    private static final String LifecycleStartEffectNoParamError = "LifecycleStartEffect must provide one or more 'key' parameters that define the identity of the LifecycleStartEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    /* JADX INFO: compiled from: LifecycleEffect.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[Lifecycle.Event.values().length];
            r0[Lifecycle.Event.ON_START.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L17:
            r0[Lifecycle.Event.ON_STOP.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L19:
            r0[Lifecycle.Event.ON_RESUME.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L23:
            r0[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L15:
            $EnumSwitchMapping$0 = r0;
        }
    }

    static final Unit LifecycleEventEffect$lambda$5(Lifecycle.Event r7, LifecycleOwner r8, Function0 r9, int r10, int r11, Composer r12, int r13) {
        LifecycleEventEffect(r7, r8, r9, r12, RecomposeScopeImplKt.updateChangedFlags(r10 | 1), r11);
        return Unit.INSTANCE;
    }

    static final Unit LifecycleResumeEffect$lambda$22(Object r7, LifecycleOwner r8, Function1 r9, int r10, int r11, Composer r12, int r13) {
        LifecycleResumeEffect(r7, r8, r9, r12, RecomposeScopeImplKt.updateChangedFlags(r10 | 1), r11);
        return Unit.INSTANCE;
    }

    static final Unit LifecycleResumeEffect$lambda$24(Object r8, Object r9, LifecycleOwner r10, Function1 r11, int r12, int r13, Composer r14, int r15) {
        LifecycleResumeEffect(r8, r9, r10, r11, r14, RecomposeScopeImplKt.updateChangedFlags(r12 | 1), r13);
        return Unit.INSTANCE;
    }

    static final Unit LifecycleResumeEffect$lambda$26(Object r9, Object r10, Object r11, LifecycleOwner r12, Function1 r13, int r14, int r15, Composer r16, int r17) {
        LifecycleResumeEffect(r9, r10, r11, r12, r13, r16, RecomposeScopeImplKt.updateChangedFlags(r14 | 1), r15);
        return Unit.INSTANCE;
    }

    static final Unit LifecycleResumeEffect$lambda$28(Object[] r7, LifecycleOwner r8, Function1 r9, int r10, int r11, Composer r12, int r13) {
        LifecycleResumeEffect(r7, r8, r9, r12, RecomposeScopeImplKt.updateChangedFlags(r10 | 1), r11);
        return Unit.INSTANCE;
    }

    static final Unit LifecycleResumeEffect$lambda$29(LifecycleOwner r1, Function1 r2, int r3, int r4, Composer r5, int r6) {
        LifecycleResumeEffect(r1, r2, r5, RecomposeScopeImplKt.updateChangedFlags(r3 | 1), r4);
        return Unit.INSTANCE;
    }

    static final Unit LifecycleResumeEffectImpl$lambda$35(LifecycleOwner r1, LifecycleResumePauseEffectScope r2, Function1 r3, int r4, Composer r5, int r6) {
        LifecycleResumeEffectImpl(r1, r2, r3, r5, RecomposeScopeImplKt.updateChangedFlags(r4 | 1));
        return Unit.INSTANCE;
    }

    static final Unit LifecycleStartEffect$lambda$11(Object r9, Object r10, Object r11, LifecycleOwner r12, Function1 r13, int r14, int r15, Composer r16, int r17) {
        LifecycleStartEffect(r9, r10, r11, r12, r13, r16, RecomposeScopeImplKt.updateChangedFlags(r14 | 1), r15);
        return Unit.INSTANCE;
    }

    static final Unit LifecycleStartEffect$lambda$13(Object[] r7, LifecycleOwner r8, Function1 r9, int r10, int r11, Composer r12, int r13) {
        LifecycleStartEffect(r7, r8, r9, r12, RecomposeScopeImplKt.updateChangedFlags(r10 | 1), r11);
        return Unit.INSTANCE;
    }

    static final Unit LifecycleStartEffect$lambda$14(LifecycleOwner r1, Function1 r2, int r3, int r4, Composer r5, int r6) {
        LifecycleStartEffect(r1, r2, r5, RecomposeScopeImplKt.updateChangedFlags(r3 | 1), r4);
        return Unit.INSTANCE;
    }

    static final Unit LifecycleStartEffect$lambda$7(Object r7, LifecycleOwner r8, Function1 r9, int r10, int r11, Composer r12, int r13) {
        LifecycleStartEffect(r7, r8, r9, r12, RecomposeScopeImplKt.updateChangedFlags(r10 | 1), r11);
        return Unit.INSTANCE;
    }

    static final Unit LifecycleStartEffect$lambda$9(Object r8, Object r9, LifecycleOwner r10, Function1 r11, int r12, int r13, Composer r14, int r15) {
        LifecycleStartEffect(r8, r9, r10, r11, r14, RecomposeScopeImplKt.updateChangedFlags(r12 | 1), r13);
        return Unit.INSTANCE;
    }

    static final Unit LifecycleStartEffectImpl$lambda$20(LifecycleOwner r1, LifecycleStartStopEffectScope r2, Function1 r3, int r4, Composer r5, int r6) {
        LifecycleStartEffectImpl(r1, r2, r3, r5, RecomposeScopeImplKt.updateChangedFlags(r4 | 1));
        return Unit.INSTANCE;
    }

    public static final void LifecycleEventEffect(final Lifecycle.Event event, final LifecycleOwner lifecycleOwner, final Function0<Unit> r11, Composer $composer, final int $changed, final int r14) {
        Composer $composer2 = $composer.startRestartGroup(-709389590);
        ComposerKt.sourceInformation($composer2, "C(LifecycleEventEffect)65@2872L29,66@2939L279,66@2906L312:LifecycleEffect.kt#2vxrgp");
        int $dirty = $changed;
        if ((r14 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if (($changed & 48) != 0) goto L22;
        if ((r14 & 2) == 0) goto L17;
    L19:
        int r2 = 16;
    L20:
        $dirty = $dirty | r2;
        goto L22
    L17:
        if ($composer2.changedInstance(lifecycleOwner) == false) goto L19;
        r2 = 32;
    L22:
        if ((r14 & 4) == 0) goto L25;
        $dirty = $dirty | 384;
    L32:
        if (($dirty & 147) == 146) goto L34;
    L38:
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "53@2411L7");
        if (($changed & 1) == 0) goto L47;
        if ($composer2.getDefaultsInvalid() == true) goto L47;
        $composer2.skipToGroupEnd();
        if ((r14 & 2) != 0) goto L49;
    L50:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L54;
        ComposerKt.traceEventStart(-709389590, $dirty, -1, "androidx.lifecycle.compose.LifecycleEventEffect (LifecycleEffect.kt:55)");
    L54:
        if (event == Lifecycle.Event.ON_DESTROY) goto L75;
        final State currentOnEvent$delegate = SnapshotStateKt.rememberUpdatedState(r11, $composer2, ($dirty >> 6) & 14);
        ComposerKt.sourceInformationMarkerStart($composer2, 1176425409, "CC(remember):LifecycleEffect.kt#9igjgp");
        if (($dirty & 14) != 4) goto L58;
        boolean r3 = true;
    L59:
        boolean invalid$iv = (r3 | $composer2.changed(currentOnEvent$delegate)) | $composer2.changedInstance(lifecycleOwner);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L62;
    L65:
        Object value$iv = new LifecycleEffectKt$$ExternalSyntheticLambda12(lifecycleOwner, event, currentOnEvent$delegate);
        $composer2.updateRememberedValue(value$iv);
    L66:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.DisposableEffect(lifecycleOwner, (Function1) value$iv, $composer2, ($dirty >> 3) & 14);
        if (ComposerKt.isTraceInProgress() == true) goto L68;
    L37:
        final LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L73;
        r10.updateScope(new LifecycleEffectKt$$ExternalSyntheticLambda13(event, lifecycleOwner2, r11, $changed, r14));
        return;
    L73:
        return;
    L68:
        ComposerKt.traceEventEnd();
        goto L37
    L62:
        if (it$iv == Composer.Companion.getEmpty()) goto L65;
        value$iv = it$iv;
        goto L66
    L58:
        r3 = false;
        goto L59
    L75:
        throw new IllegalArgumentException("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
    L49:
        $dirty = $dirty & (-113);
    L47:
        if ((r14 & 2) == 0) goto L50;
        ProvidableCompositionLocal<LifecycleOwner> r4 = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r6 = $composer2.consume(r4);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        lifecycleOwner = (LifecycleOwner) r6;
        goto L49
    L34:
        if ($composer2.getSkipping() == false) goto L38;
        $composer2.skipToGroupEnd();
        goto L37
    L25:
        if (($changed & 384) != 0) goto L32;
        if ($composer2.changedInstance(r11) == false) goto L29;
        int r5 = 256;
    L30:
        $dirty = $dirty | r5;
        goto L32
    L29:
        r5 = 128;
        goto L30
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(event.ordinal()) == false) goto L10;
        int r7 = 4;
    L11:
        $dirty = $dirty | r7;
        goto L13
    L10:
        r7 = 2;
        goto L11
    }

    private static final Function0<Unit> LifecycleEventEffect$lambda$0(State<? extends Function0<Unit>> r4) {
        Object thisObj$iv = r4.getValue();
        return (Function0) thisObj$iv;
    }

    static final DisposableEffectResult LifecycleEventEffect$lambda$4$lambda$3(final LifecycleOwner $lifecycleOwner, final Lifecycle.Event $event, final State $currentOnEvent$delegate, DisposableEffectScope $this$DisposableEffect) {
        final LifecycleEventObserver observer = new LifecycleEffectKt$$ExternalSyntheticLambda16($event, $currentOnEvent$delegate);
        $lifecycleOwner.getLifecycle().addObserver(observer);
        return new LifecycleEffectKt$LifecycleEventEffect$lambda$4$lambda$3$$inlined$onDispose$1($lifecycleOwner, observer);
    }

    static final void LifecycleEventEffect$lambda$4$lambda$3$lambda$1(Lifecycle.Event $event, State $currentOnEvent$delegate, LifecycleOwner r2, Lifecycle.Event e) {
        if (e != $event) goto L5;
        LifecycleEventEffect$lambda$0($currentOnEvent$delegate).invoke();
        return;
    }

    public static final void LifecycleStartEffect(final Object key1, LifecycleOwner lifecycleOwner, final Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> r14, Composer $composer, final int $changed, final int r17) {
        Composer $composer2 = $composer.startRestartGroup(-1408314671);
        ComposerKt.sourceInformation($composer2, "C(LifecycleStartEffect)P(1,2)131@5981L90,132@6076L80:LifecycleEffect.kt#2vxrgp");
        int $dirty = $changed;
        if ((r17 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if (($changed & 48) != 0) goto L22;
        if ((r17 & 2) == 0) goto L17;
    L19:
        int r2 = 16;
    L20:
        $dirty = $dirty | r2;
        goto L22
    L17:
        if ($composer2.changedInstance(lifecycleOwner) == false) goto L19;
        r2 = 32;
    L22:
        if ((r17 & 4) == 0) goto L25;
        $dirty = $dirty | 384;
    L32:
        if (($dirty & 147) == 146) goto L34;
    L38:
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "127@5836L7");
        if (($changed & 1) == 0) goto L47;
        if ($composer2.getDefaultsInvalid() == true) goto L47;
        $composer2.skipToGroupEnd();
        if ((r17 & 2) != 0) goto L49;
    L50:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L53;
        ComposerKt.traceEventStart(-1408314671, $dirty, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:129)");
    L53:
        ComposerKt.sourceInformationMarkerStart($composer2, -475692085, "CC(remember):LifecycleEffect.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(key1) | $composer2.changed(lifecycleOwner);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L56;
    L59:
        Object value$iv = new LifecycleStartStopEffectScope(lifecycleOwner.getLifecycle());
        $composer2.updateRememberedValue(value$iv);
    L60:
        LifecycleStartStopEffectScope lifecycleStartStopEffectScope = (LifecycleStartStopEffectScope) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        LifecycleStartEffectImpl(lifecycleOwner, lifecycleStartStopEffectScope, r14, $composer2, (($dirty >> 3) & 14) | ($dirty & 896));
        if (ComposerKt.isTraceInProgress() == true) goto L62;
    L37:
        final LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        ScopeUpdateScope r7 = $composer2.endRestartGroup();
        if (r7 == null) goto L67;
        r7.updateScope(new LifecycleEffectKt$$ExternalSyntheticLambda0(key1, lifecycleOwner2, r14, $changed, r17));
        return;
    L67:
        return;
    L62:
        ComposerKt.traceEventEnd();
        goto L37
    L56:
        if (it$iv == Composer.Companion.getEmpty()) goto L59;
        value$iv = it$iv;
    L49:
        $dirty = $dirty & (-113);
    L47:
        if ((r17 & 2) == 0) goto L50;
        ProvidableCompositionLocal<LifecycleOwner> r3 = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r8 = $composer2.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        lifecycleOwner = (LifecycleOwner) r8;
        goto L49
    L34:
        if ($composer2.getSkipping() == false) goto L38;
        $composer2.skipToGroupEnd();
        goto L37
    L25:
        if (($changed & 384) != 0) goto L32;
        if ($composer2.changedInstance(r14) == false) goto L29;
        int r4 = 256;
    L30:
        $dirty = $dirty | r4;
        goto L32
    L29:
        r4 = 128;
        goto L30
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changedInstance(key1) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L13
    L10:
        r5 = 2;
        goto L11
    }

    public static final void LifecycleStartEffect(final Object key1, final Object key2, LifecycleOwner lifecycleOwner, final Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> r17, Composer $composer, final int $changed, final int r20) {
        Composer $composer2 = $composer.startRestartGroup(696924721);
        ComposerKt.sourceInformation($composer2, "C(LifecycleStartEffect)P(1,2,3)189@9008L116,192@9129L80:LifecycleEffect.kt#2vxrgp");
        int $dirty = $changed;
        if ((r20 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r20 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L23:
        if (($changed & 384) == 0) goto L25;
        final LifecycleOwner lifecycleOwner2 = lifecycleOwner;
    L34:
        if ((r20 & 8) == 0) goto L37;
        $dirty = $dirty | 3072;
    L44:
        if (($dirty & 1171) == 1170) goto L46;
    L49:
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "185@8863L7");
        if (($changed & 1) == 0) goto L58;
        if ($composer2.getDefaultsInvalid() == true) goto L58;
        $composer2.skipToGroupEnd();
        if ((r20 & 4) == 0) goto L60;
        $dirty = $dirty & (-897);
    L60:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L63;
        ComposerKt.traceEventStart(696924721, $dirty, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:187)");
    L63:
        ComposerKt.sourceInformationMarkerStart($composer2, -270232251, "CC(remember):LifecycleEffect.kt#9igjgp");
        boolean invalid$iv = ($composer2.changed(key1) | $composer2.changed(key2)) | $composer2.changed(lifecycleOwner2);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L66;
    L69:
        Object value$iv = new LifecycleStartStopEffectScope(lifecycleOwner2.getLifecycle());
        $composer2.updateRememberedValue(value$iv);
    L70:
        LifecycleStartStopEffectScope lifecycleStartStopEffectScope = (LifecycleStartStopEffectScope) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        LifecycleStartEffectImpl(lifecycleOwner2, lifecycleStartStopEffectScope, r17, $composer2, (($dirty >> 6) & 14) | (($dirty >> 3) & 896));
        if (ComposerKt.isTraceInProgress() == false) goto L74;
        ComposerKt.traceEventEnd();
    L74:
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L78;
        r9.updateScope(new LifecycleEffectKt$$ExternalSyntheticLambda1(key1, key2, lifecycleOwner2, r17, $changed, r20));
        return;
    L78:
        return;
    L66:
        if (it$iv == Composer.Companion.getEmpty()) goto L69;
        value$iv = it$iv;
    L58:
        if ((r20 & 4) == 0) goto L60;
        ProvidableCompositionLocal<LifecycleOwner> r6 = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r10 = $composer2.consume(r6);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        lifecycleOwner2 = (LifecycleOwner) r10;
        $dirty = $dirty & (-897);
        goto L60
    L46:
        if ($composer2.getSkipping() == false) goto L49;
        $composer2.skipToGroupEnd();
        goto L74
    L37:
        if (($changed & 3072) != 0) goto L44;
        if ($composer2.changedInstance(r17) == false) goto L41;
        int r7 = 2048;
    L42:
        $dirty = $dirty | r7;
        goto L44
    L41:
        r7 = 1024;
        goto L42
    L25:
        if ((r20 & 4) != 0) goto L29;
        lifecycleOwner2 = lifecycleOwner;
        if ($composer2.changedInstance(lifecycleOwner2) == false) goto L30;
        int r8 = 256;
    L31:
        $dirty = $dirty | r8;
    L30:
        r8 = 128;
        goto L31
    L29:
        lifecycleOwner2 = lifecycleOwner;
        goto L30
    L16:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changedInstance(key2) == false) goto L20;
        int r3 = 32;
    L21:
        $dirty = $dirty | r3;
        goto L23
    L20:
        r3 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changedInstance(key1) == false) goto L10;
        int r4 = 4;
    L11:
        $dirty = $dirty | r4;
        goto L13
    L10:
        r4 = 2;
        goto L11
    }

    public static final void LifecycleStartEffect(final Object key1, final Object key2, final Object key3, LifecycleOwner lifecycleOwner, final Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> r20, Composer $composer, final int $changed, final int r23) {
        Composer $composer2 = $composer.startRestartGroup(574812561);
        ComposerKt.sourceInformation($composer2, "C(LifecycleStartEffect)P(1,2,3,4)252@12163L122,255@12290L80:LifecycleEffect.kt#2vxrgp");
        int $dirty = $changed;
        if ((r23 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r23 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L23:
        if ((r23 & 4) == 0) goto L26;
        $dirty = $dirty | 384;
    L33:
        if (($changed & 3072) == 0) goto L35;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
    L44:
        if ((r23 & 16) == 0) goto L47;
        $dirty = $dirty | 24576;
    L54:
        if (($dirty & 9363) == 9362) goto L56;
    L59:
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "248@12018L7");
        if (($changed & 1) == 0) goto L68;
        if ($composer2.getDefaultsInvalid() == true) goto L68;
        $composer2.skipToGroupEnd();
        if ((r23 & 8) == 0) goto L70;
        $dirty = $dirty & (-7169);
    L70:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L73;
        ComposerKt.traceEventStart(574812561, $dirty, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:250)");
    L73:
        ComposerKt.sourceInformationMarkerStart($composer2, -1655900501, "CC(remember):LifecycleEffect.kt#9igjgp");
        boolean invalid$iv = (($composer2.changed(key1) | $composer2.changed(key2)) | $composer2.changed(key3)) | $composer2.changed(lifecycleOwner2);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L76;
    L79:
        Object value$iv = new LifecycleStartStopEffectScope(lifecycleOwner2.getLifecycle());
        $composer2.updateRememberedValue(value$iv);
    L80:
        LifecycleStartStopEffectScope lifecycleStartStopEffectScope = (LifecycleStartStopEffectScope) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        LifecycleStartEffectImpl(lifecycleOwner2, lifecycleStartStopEffectScope, r20, $composer2, (($dirty >> 9) & 14) | (($dirty >> 6) & 896));
        if (ComposerKt.isTraceInProgress() == false) goto L83;
        ComposerKt.traceEventEnd();
    L83:
        final LifecycleOwner lifecycleOwner3 = lifecycleOwner2;
    L84:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L88;
        r10.updateScope(new LifecycleEffectKt$$ExternalSyntheticLambda6(key1, key2, key3, lifecycleOwner3, r20, $changed, r23));
        return;
    L88:
        return;
    L76:
        if (it$iv == Composer.Companion.getEmpty()) goto L79;
        value$iv = it$iv;
    L68:
        if ((r23 & 8) == 0) goto L70;
        ProvidableCompositionLocal<LifecycleOwner> r9 = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r12 = $composer2.consume(r9);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        lifecycleOwner2 = (LifecycleOwner) r12;
        $dirty = $dirty & (-7169);
        goto L70
    L56:
        if ($composer2.getSkipping() == false) goto L59;
        $composer2.skipToGroupEnd();
        lifecycleOwner3 = lifecycleOwner2;
        goto L84
    L47:
        if (($changed & 24576) != 0) goto L54;
        if ($composer2.changedInstance(r20) == false) goto L51;
        int r11 = 16384;
    L52:
        $dirty = $dirty | r11;
        goto L54
    L51:
        r11 = 8192;
        goto L52
    L35:
        if ((r23 & 8) != 0) goto L39;
        lifecycleOwner2 = lifecycleOwner;
        if ($composer2.changedInstance(lifecycleOwner2) == false) goto L40;
        int r13 = 2048;
    L41:
        $dirty = $dirty | r13;
    L40:
        r13 = 1024;
        goto L41
    L39:
        lifecycleOwner2 = lifecycleOwner;
        goto L40
    L26:
        if (($changed & 384) != 0) goto L33;
        if ($composer2.changedInstance(key3) == false) goto L30;
        int r7 = 256;
    L31:
        $dirty = $dirty | r7;
        goto L33
    L30:
        r7 = 128;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changedInstance(key2) == false) goto L20;
        int r8 = 32;
    L21:
        $dirty = $dirty | r8;
        goto L23
    L20:
        r8 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changedInstance(key1) == false) goto L10;
        int r14 = 4;
    L11:
        $dirty = $dirty | r14;
        goto L13
    L10:
        r14 = 2;
        goto L11
    }

    public static final void LifecycleStartEffect(final Object[] keys, LifecycleOwner lifecycleOwner, final Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> r18, Composer $composer, final int $changed, final int r21) {
        Composer $composer2 = $composer.startRestartGroup(-1510305724);
        ComposerKt.sourceInformation($composer2, "C(LifecycleStartEffect)P(1,2)310@15140L91,311@15236L80:LifecycleEffect.kt#2vxrgp");
        int $dirty = $changed;
        if (($changed & 48) == 0) goto L5;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
    L14:
        if ((r21 & 4) == 0) goto L17;
        $dirty = $dirty | 384;
    L23:
        $composer2.startMovableGroup(295146869, Integer.valueOf(keys.length));
        ComposerKt.sourceInformation($composer2, "306@14995L7");
        int r9 = 0;
        if ($composer2.changed(keys.length) == false) goto L26;
        int r7 = 4;
    L27:
        int $dirty2 = $dirty | r7;
        int r8 = keys.length;
        int r10 = 0;
    L28:
        if (r10 >= r8) goto L34;
        Object value = keys[r10];
        if ($composer2.changedInstance(value) == false) goto L32;
        int r12 = 4;
    L33:
        $dirty2 = $dirty2 | r12;
        r10 = r10 + 1;
        goto L28
    L32:
        r12 = 0;
        goto L33
    L34:
        $composer2.endMovableGroup();
        if (($dirty2 & 14) != 0) goto L38;
        $dirty2 = $dirty2 | 2;
    L38:
        if (($dirty2 & 147) == 146) goto L40;
    L43:
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "");
        if (($changed & 1) == 0) goto L52;
        if ($composer2.getDefaultsInvalid() == true) goto L52;
        $composer2.skipToGroupEnd();
        if ((r21 & 2) == 0) goto L54;
        $dirty2 = $dirty2 & (-113);
    L54:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L57;
        ComposerKt.traceEventStart(-1510305724, $dirty2, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:308)");
    L57:
        SpreadBuilder r0 = new SpreadBuilder(2);
        r0.addSpread(keys);
        r0.add(lifecycleOwner2);
        Object[] keys$iv = r0.toArray(new Object[r0.size()]);
        ComposerKt.sourceInformationMarkerStart($composer2, -568225417, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean invalid$iv = false;
        int r11 = keys$iv.length;
    L58:
        if (r9 >= r11) goto L60;
        Object key$iv = keys$iv[r9];
        invalid$iv = invalid$iv | $composer2.changed(key$iv);
        r9 = r9 + 1;
        goto L58
    L60:
        Object it$iv$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L63;
    L66:
        Object value$iv$iv = new LifecycleStartStopEffectScope(lifecycleOwner2.getLifecycle());
        $composer2.updateRememberedValue(value$iv$iv);
    L67:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        LifecycleStartStopEffectScope lifecycleStartStopEffectScope = (LifecycleStartStopEffectScope) value$iv$iv;
        LifecycleStartEffectImpl(lifecycleOwner2, lifecycleStartStopEffectScope, r18, $composer2, (($dirty2 >> 3) & 14) | ($dirty2 & 896));
        if (ComposerKt.isTraceInProgress() == false) goto L70;
        ComposerKt.traceEventEnd();
    L70:
        final LifecycleOwner lifecycleOwner3 = lifecycleOwner2;
    L71:
        ScopeUpdateScope r13 = $composer2.endRestartGroup();
        if (r13 == null) goto L79;
        r13.updateScope(new LifecycleEffectKt$$ExternalSyntheticLambda7(keys, lifecycleOwner3, r18, $changed, r21));
        return;
    L79:
        return;
    L63:
        if (it$iv$iv == Composer.Companion.getEmpty()) goto L66;
        value$iv$iv = it$iv$iv;
    L52:
        if ((r21 & 2) == 0) goto L54;
        ProvidableCompositionLocal<LifecycleOwner> r14 = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r15 = $composer2.consume(r14);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        lifecycleOwner2 = (LifecycleOwner) r15;
        $dirty2 = $dirty2 & (-113);
        goto L54
    L40:
        if ($composer2.getSkipping() == false) goto L43;
        $composer2.skipToGroupEnd();
        lifecycleOwner3 = lifecycleOwner2;
        goto L71
    L26:
        r7 = 0;
        goto L27
    L17:
        if (($changed & 384) != 0) goto L23;
        if ($composer2.changedInstance(r18) == false) goto L21;
        int r16 = 256;
    L22:
        $dirty = $dirty | r16;
        goto L23
    L21:
        r16 = 128;
        goto L22
    L5:
        if ((r21 & 2) != 0) goto L9;
        lifecycleOwner2 = lifecycleOwner;
        if ($composer2.changedInstance(lifecycleOwner2) == false) goto L10;
        int r17 = 32;
    L11:
        $dirty = $dirty | r17;
    L10:
        r17 = 16;
        goto L11
    L9:
        lifecycleOwner2 = lifecycleOwner;
        goto L10
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = LifecycleStartEffectNoParamError)
    public static final void LifecycleStartEffect(final LifecycleOwner lifecycleOwner, final Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> r7, Composer $composer, final int $changed, final int r10) {
        Composer $composer2 = $composer.startRestartGroup(-50807951);
        ComposerKt.sourceInformation($composer2, "C(LifecycleStartEffect)P(1):LifecycleEffect.kt#2vxrgp");
        int $dirty = $changed;
        if (($dirty & 1) == 0) goto L5;
    L11:
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "331@16104L7");
        if (($changed & 1) == 0) goto L20;
        if ($composer2.getDefaultsInvalid() == true) goto L20;
        $composer2.skipToGroupEnd();
        if ((r10 & 1) != 0) goto L22;
    L23:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L27;
        ComposerKt.traceEventStart(-50807951, $dirty, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:333)");
    L27:
        throw new IllegalStateException(LifecycleStartEffectNoParamError.toString());
    L22:
        $dirty = $dirty & (-15);
    L20:
        if ((r10 & 1) == 0) goto L23;
        ProvidableCompositionLocal<LifecycleOwner> r11 = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r4 = $composer2.consume(r11);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        LifecycleOwner r6 = (LifecycleOwner) r4;
        goto L22
    L5:
        if ($composer2.getSkipping() == false) goto L11;
        $composer2.skipToGroupEnd();
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L28;
        r0.updateScope(new LifecycleEffectKt$$ExternalSyntheticLambda10(lifecycleOwner, r7, $changed, r10));
        return;
    }

    private static final void LifecycleStartEffectImpl(final LifecycleOwner lifecycleOwner, final LifecycleStartStopEffectScope scope, final Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> r10, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(228371534);
        ComposerKt.sourceInformation($composer2, "C(LifecycleStartEffectImpl)P(1,2)341@16508L661,341@16468L701:LifecycleEffect.kt#2vxrgp");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(lifecycleOwner) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(scope) == false) goto L14;
        int r3 = 32;
    L15:
        $dirty = $dirty | r3;
        goto L17
    L14:
        r3 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changedInstance(r10) == false) goto L21;
        int r4 = 256;
    L22:
        $dirty = $dirty | r4;
        goto L24
    L21:
        r4 = 128;
    L24:
        if (($dirty & 147) != 146) goto L30;
        if ($composer2.getSkipping() == false) goto L30;
        $composer2.skipToGroupEnd();
    L46:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L50;
        r0.updateScope(new LifecycleEffectKt$$ExternalSyntheticLambda18(lifecycleOwner, scope, r10, $changed));
        return;
    L50:
        return;
    L30:
        if (ComposerKt.isTraceInProgress() == false) goto L32;
        ComposerKt.traceEventStart(228371534, $dirty, -1, "androidx.lifecycle.compose.LifecycleStartEffectImpl (LifecycleEffect.kt:340)");
    L32:
        ComposerKt.sourceInformationMarkerStart($composer2, 421721059, "CC(remember):LifecycleEffect.kt#9igjgp");
        boolean r1 = $composer2.changedInstance(scope);
        if (($dirty & 896) != 256) goto L35;
        boolean r5 = true;
    L36:
        boolean invalid$iv = (r1 | r5) | $composer2.changedInstance(lifecycleOwner);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L39;
    L42:
        Object value$iv = new LifecycleEffectKt$$ExternalSyntheticLambda17(lifecycleOwner, scope, r10);
        $composer2.updateRememberedValue(value$iv);
    L43:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.DisposableEffect(lifecycleOwner, scope, (Function1) value$iv, $composer2, ($dirty & 14) | ($dirty & 112));
        if (ComposerKt.isTraceInProgress() == false) goto L46;
        ComposerKt.traceEventEnd();
        goto L46
    L39:
        if (it$iv == Composer.Companion.getEmpty()) goto L42;
        value$iv = it$iv;
        goto L43
    L35:
        r5 = false;
        goto L36
    }

    static final DisposableEffectResult LifecycleStartEffectImpl$lambda$19$lambda$18(final LifecycleOwner $lifecycleOwner, final LifecycleStartStopEffectScope $scope, final Function1 $effects, DisposableEffectScope $this$DisposableEffect) {
        final Ref.ObjectRef effectResult = new Ref.ObjectRef();
        final LifecycleEventObserver observer = new LifecycleEffectKt$$ExternalSyntheticLambda14($scope, effectResult, $effects);
        $lifecycleOwner.getLifecycle().addObserver(observer);
        return new LifecycleEffectKt$LifecycleStartEffectImpl$lambda$19$lambda$18$$inlined$onDispose$1($lifecycleOwner, observer, effectResult);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
    static final void LifecycleStartEffectImpl$lambda$19$lambda$18$lambda$16(LifecycleStartStopEffectScope $scope, Ref.ObjectRef $effectResult, Function1 $effects, LifecycleOwner r5, Lifecycle.Event event) {
        switch(WhenMappings.$EnumSwitchMapping$0[event.ordinal()]) {
            case 1: goto L9;
            case 2: goto L5;
            default: goto L12;
        };
    L5:
        LifecycleStopOrDisposeEffectResult r6 = (LifecycleStopOrDisposeEffectResult) $effectResult.element;
        if (r6 == null) goto L8;
        r6.runStopOrDisposeEffect();
    L8:
        $effectResult.element = null;
        return;
    L9:
        $effectResult.element = $effects.invoke($scope);
        return;
    }

    public static final void LifecycleResumeEffect(final Object key1, LifecycleOwner lifecycleOwner, final Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> r14, Composer $composer, final int $changed, final int r17) {
        Composer $composer2 = $composer.startRestartGroup(1220373486);
        ComposerKt.sourceInformation($composer2, "C(LifecycleResumeEffect)P(1,2)449@21383L92,450@21480L83:LifecycleEffect.kt#2vxrgp");
        int $dirty = $changed;
        if ((r17 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if (($changed & 48) != 0) goto L22;
        if ((r17 & 2) == 0) goto L17;
    L19:
        int r2 = 16;
    L20:
        $dirty = $dirty | r2;
        goto L22
    L17:
        if ($composer2.changedInstance(lifecycleOwner) == false) goto L19;
        r2 = 32;
    L22:
        if ((r17 & 4) == 0) goto L25;
        $dirty = $dirty | 384;
    L32:
        if (($dirty & 147) == 146) goto L34;
    L38:
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "445@21233L7");
        if (($changed & 1) == 0) goto L47;
        if ($composer2.getDefaultsInvalid() == true) goto L47;
        $composer2.skipToGroupEnd();
        if ((r17 & 2) != 0) goto L49;
    L50:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L53;
        ComposerKt.traceEventStart(1220373486, $dirty, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:447)");
    L53:
        ComposerKt.sourceInformationMarkerStart($composer2, 252856938, "CC(remember):LifecycleEffect.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(key1) | $composer2.changed(lifecycleOwner);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L56;
    L59:
        Object value$iv = new LifecycleResumePauseEffectScope(lifecycleOwner.getLifecycle());
        $composer2.updateRememberedValue(value$iv);
    L60:
        LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope = (LifecycleResumePauseEffectScope) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        LifecycleResumeEffectImpl(lifecycleOwner, lifecycleResumePauseEffectScope, r14, $composer2, (($dirty >> 3) & 14) | ($dirty & 896));
        if (ComposerKt.isTraceInProgress() == true) goto L62;
    L37:
        final LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        ScopeUpdateScope r7 = $composer2.endRestartGroup();
        if (r7 == null) goto L67;
        r7.updateScope(new LifecycleEffectKt$$ExternalSyntheticLambda11(key1, lifecycleOwner2, r14, $changed, r17));
        return;
    L67:
        return;
    L62:
        ComposerKt.traceEventEnd();
        goto L37
    L56:
        if (it$iv == Composer.Companion.getEmpty()) goto L59;
        value$iv = it$iv;
    L49:
        $dirty = $dirty & (-113);
    L47:
        if ((r17 & 2) == 0) goto L50;
        ProvidableCompositionLocal<LifecycleOwner> r3 = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r8 = $composer2.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        lifecycleOwner = (LifecycleOwner) r8;
        goto L49
    L34:
        if ($composer2.getSkipping() == false) goto L38;
        $composer2.skipToGroupEnd();
        goto L37
    L25:
        if (($changed & 384) != 0) goto L32;
        if ($composer2.changedInstance(r14) == false) goto L29;
        int r4 = 256;
    L30:
        $dirty = $dirty | r4;
        goto L32
    L29:
        r4 = 128;
        goto L30
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changedInstance(key1) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L13
    L10:
        r5 = 2;
        goto L11
    }

    public static final void LifecycleResumeEffect(final Object key1, final Object key2, LifecycleOwner lifecycleOwner, final Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> r17, Composer $composer, final int $changed, final int r20) {
        Composer $composer2 = $composer.startRestartGroup(752680142);
        ComposerKt.sourceInformation($composer2, "C(LifecycleResumeEffect)P(1,2,3)508@24459L118,511@24582L83:LifecycleEffect.kt#2vxrgp");
        int $dirty = $changed;
        if ((r20 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r20 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L23:
        if (($changed & 384) == 0) goto L25;
        final LifecycleOwner lifecycleOwner2 = lifecycleOwner;
    L34:
        if ((r20 & 8) == 0) goto L37;
        $dirty = $dirty | 3072;
    L44:
        if (($dirty & 1171) == 1170) goto L46;
    L49:
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "504@24309L7");
        if (($changed & 1) == 0) goto L58;
        if ($composer2.getDefaultsInvalid() == true) goto L58;
        $composer2.skipToGroupEnd();
        if ((r20 & 4) == 0) goto L60;
        $dirty = $dirty & (-897);
    L60:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L63;
        ComposerKt.traceEventStart(752680142, $dirty, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:506)");
    L63:
        ComposerKt.sourceInformationMarkerStart($composer2, 1771119972, "CC(remember):LifecycleEffect.kt#9igjgp");
        boolean invalid$iv = ($composer2.changed(key1) | $composer2.changed(key2)) | $composer2.changed(lifecycleOwner2);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L66;
    L69:
        Object value$iv = new LifecycleResumePauseEffectScope(lifecycleOwner2.getLifecycle());
        $composer2.updateRememberedValue(value$iv);
    L70:
        LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope = (LifecycleResumePauseEffectScope) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        LifecycleResumeEffectImpl(lifecycleOwner2, lifecycleResumePauseEffectScope, r17, $composer2, (($dirty >> 6) & 14) | (($dirty >> 3) & 896));
        if (ComposerKt.isTraceInProgress() == false) goto L74;
        ComposerKt.traceEventEnd();
    L74:
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L78;
        r9.updateScope(new LifecycleEffectKt$$ExternalSyntheticLambda4(key1, key2, lifecycleOwner2, r17, $changed, r20));
        return;
    L78:
        return;
    L66:
        if (it$iv == Composer.Companion.getEmpty()) goto L69;
        value$iv = it$iv;
    L58:
        if ((r20 & 4) == 0) goto L60;
        ProvidableCompositionLocal<LifecycleOwner> r6 = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r10 = $composer2.consume(r6);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        lifecycleOwner2 = (LifecycleOwner) r10;
        $dirty = $dirty & (-897);
        goto L60
    L46:
        if ($composer2.getSkipping() == false) goto L49;
        $composer2.skipToGroupEnd();
        goto L74
    L37:
        if (($changed & 3072) != 0) goto L44;
        if ($composer2.changedInstance(r17) == false) goto L41;
        int r7 = 2048;
    L42:
        $dirty = $dirty | r7;
        goto L44
    L41:
        r7 = 1024;
        goto L42
    L25:
        if ((r20 & 4) != 0) goto L29;
        lifecycleOwner2 = lifecycleOwner;
        if ($composer2.changedInstance(lifecycleOwner2) == false) goto L30;
        int r8 = 256;
    L31:
        $dirty = $dirty | r8;
    L30:
        r8 = 128;
        goto L31
    L29:
        lifecycleOwner2 = lifecycleOwner;
        goto L30
    L16:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changedInstance(key2) == false) goto L20;
        int r3 = 32;
    L21:
        $dirty = $dirty | r3;
        goto L23
    L20:
        r3 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changedInstance(key1) == false) goto L10;
        int r4 = 4;
    L11:
        $dirty = $dirty | r4;
        goto L13
    L10:
        r4 = 2;
        goto L11
    }

    public static final void LifecycleResumeEffect(final Object key1, final Object key2, final Object key3, LifecycleOwner lifecycleOwner, final Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> r20, Composer $composer, final int $changed, final int r23) {
        Composer $composer2 = $composer.startRestartGroup(-485941842);
        ComposerKt.sourceInformation($composer2, "C(LifecycleResumeEffect)P(1,2,3,4)572@27657L124,575@27786L83:LifecycleEffect.kt#2vxrgp");
        int $dirty = $changed;
        if ((r23 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r23 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L23:
        if ((r23 & 4) == 0) goto L26;
        $dirty = $dirty | 384;
    L33:
        if (($changed & 3072) == 0) goto L35;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
    L44:
        if ((r23 & 16) == 0) goto L47;
        $dirty = $dirty | 24576;
    L54:
        if (($dirty & 9363) == 9362) goto L56;
    L59:
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "568@27507L7");
        if (($changed & 1) == 0) goto L68;
        if ($composer2.getDefaultsInvalid() == true) goto L68;
        $composer2.skipToGroupEnd();
        if ((r23 & 8) == 0) goto L70;
        $dirty = $dirty & (-7169);
    L70:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L73;
        ComposerKt.traceEventStart(-485941842, $dirty, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:570)");
    L73:
        ComposerKt.sourceInformationMarkerStart($composer2, 1161334858, "CC(remember):LifecycleEffect.kt#9igjgp");
        boolean invalid$iv = (($composer2.changed(key1) | $composer2.changed(key2)) | $composer2.changed(key3)) | $composer2.changed(lifecycleOwner2);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L76;
    L79:
        Object value$iv = new LifecycleResumePauseEffectScope(lifecycleOwner2.getLifecycle());
        $composer2.updateRememberedValue(value$iv);
    L80:
        LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope = (LifecycleResumePauseEffectScope) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        LifecycleResumeEffectImpl(lifecycleOwner2, lifecycleResumePauseEffectScope, r20, $composer2, (($dirty >> 9) & 14) | (($dirty >> 6) & 896));
        if (ComposerKt.isTraceInProgress() == false) goto L83;
        ComposerKt.traceEventEnd();
    L83:
        final LifecycleOwner lifecycleOwner3 = lifecycleOwner2;
    L84:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L88;
        r10.updateScope(new LifecycleEffectKt$$ExternalSyntheticLambda2(key1, key2, key3, lifecycleOwner3, r20, $changed, r23));
        return;
    L88:
        return;
    L76:
        if (it$iv == Composer.Companion.getEmpty()) goto L79;
        value$iv = it$iv;
    L68:
        if ((r23 & 8) == 0) goto L70;
        ProvidableCompositionLocal<LifecycleOwner> r9 = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r12 = $composer2.consume(r9);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        lifecycleOwner2 = (LifecycleOwner) r12;
        $dirty = $dirty & (-7169);
        goto L70
    L56:
        if ($composer2.getSkipping() == false) goto L59;
        $composer2.skipToGroupEnd();
        lifecycleOwner3 = lifecycleOwner2;
        goto L84
    L47:
        if (($changed & 24576) != 0) goto L54;
        if ($composer2.changedInstance(r20) == false) goto L51;
        int r11 = 16384;
    L52:
        $dirty = $dirty | r11;
        goto L54
    L51:
        r11 = 8192;
        goto L52
    L35:
        if ((r23 & 8) != 0) goto L39;
        lifecycleOwner2 = lifecycleOwner;
        if ($composer2.changedInstance(lifecycleOwner2) == false) goto L40;
        int r13 = 2048;
    L41:
        $dirty = $dirty | r13;
    L40:
        r13 = 1024;
        goto L41
    L39:
        lifecycleOwner2 = lifecycleOwner;
        goto L40
    L26:
        if (($changed & 384) != 0) goto L33;
        if ($composer2.changedInstance(key3) == false) goto L30;
        int r7 = 256;
    L31:
        $dirty = $dirty | r7;
        goto L33
    L30:
        r7 = 128;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changedInstance(key2) == false) goto L20;
        int r8 = 32;
    L21:
        $dirty = $dirty | r8;
        goto L23
    L20:
        r8 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changedInstance(key1) == false) goto L10;
        int r14 = 4;
    L11:
        $dirty = $dirty | r14;
        goto L13
    L10:
        r14 = 2;
        goto L11
    }

    public static final void LifecycleResumeEffect(final Object[] keys, LifecycleOwner lifecycleOwner, final Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> r18, Composer $composer, final int $changed, final int r21) {
        Composer $composer2 = $composer.startRestartGroup(-781756895);
        ComposerKt.sourceInformation($composer2, "C(LifecycleResumeEffect)P(1,2)631@30683L113,634@30801L83:LifecycleEffect.kt#2vxrgp");
        int $dirty = $changed;
        if (($changed & 48) == 0) goto L5;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
    L14:
        if ((r21 & 4) == 0) goto L17;
        $dirty = $dirty | 384;
    L23:
        $composer2.startMovableGroup(350902322, Integer.valueOf(keys.length));
        ComposerKt.sourceInformation($composer2, "627@30533L7");
        int r9 = 0;
        if ($composer2.changed(keys.length) == false) goto L26;
        int r7 = 4;
    L27:
        int $dirty2 = $dirty | r7;
        int r8 = keys.length;
        int r10 = 0;
    L28:
        if (r10 >= r8) goto L34;
        Object value = keys[r10];
        if ($composer2.changedInstance(value) == false) goto L32;
        int r12 = 4;
    L33:
        $dirty2 = $dirty2 | r12;
        r10 = r10 + 1;
        goto L28
    L32:
        r12 = 0;
        goto L33
    L34:
        $composer2.endMovableGroup();
        if (($dirty2 & 14) != 0) goto L38;
        $dirty2 = $dirty2 | 2;
    L38:
        if (($dirty2 & 147) == 146) goto L40;
    L43:
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "");
        if (($changed & 1) == 0) goto L52;
        if ($composer2.getDefaultsInvalid() == true) goto L52;
        $composer2.skipToGroupEnd();
        if ((r21 & 2) == 0) goto L54;
        $dirty2 = $dirty2 & (-113);
    L54:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L57;
        ComposerKt.traceEventStart(-781756895, $dirty2, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:629)");
    L57:
        SpreadBuilder r0 = new SpreadBuilder(2);
        r0.addSpread(keys);
        r0.add(lifecycleOwner2);
        Object[] keys$iv = r0.toArray(new Object[r0.size()]);
        ComposerKt.sourceInformationMarkerStart($composer2, -568225417, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean invalid$iv = false;
        int r11 = keys$iv.length;
    L58:
        if (r9 >= r11) goto L60;
        Object key$iv = keys$iv[r9];
        invalid$iv = invalid$iv | $composer2.changed(key$iv);
        r9 = r9 + 1;
        goto L58
    L60:
        Object it$iv$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L63;
    L66:
        Object value$iv$iv = new LifecycleResumePauseEffectScope(lifecycleOwner2.getLifecycle());
        $composer2.updateRememberedValue(value$iv$iv);
    L67:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope = (LifecycleResumePauseEffectScope) value$iv$iv;
        LifecycleResumeEffectImpl(lifecycleOwner2, lifecycleResumePauseEffectScope, r18, $composer2, (($dirty2 >> 3) & 14) | ($dirty2 & 896));
        if (ComposerKt.isTraceInProgress() == false) goto L70;
        ComposerKt.traceEventEnd();
    L70:
        final LifecycleOwner lifecycleOwner3 = lifecycleOwner2;
    L71:
        ScopeUpdateScope r13 = $composer2.endRestartGroup();
        if (r13 == null) goto L79;
        r13.updateScope(new LifecycleEffectKt$$ExternalSyntheticLambda15(keys, lifecycleOwner3, r18, $changed, r21));
        return;
    L79:
        return;
    L63:
        if (it$iv$iv == Composer.Companion.getEmpty()) goto L66;
        value$iv$iv = it$iv$iv;
    L52:
        if ((r21 & 2) == 0) goto L54;
        ProvidableCompositionLocal<LifecycleOwner> r14 = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r15 = $composer2.consume(r14);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        lifecycleOwner2 = (LifecycleOwner) r15;
        $dirty2 = $dirty2 & (-113);
        goto L54
    L40:
        if ($composer2.getSkipping() == false) goto L43;
        $composer2.skipToGroupEnd();
        lifecycleOwner3 = lifecycleOwner2;
        goto L71
    L26:
        r7 = 0;
        goto L27
    L17:
        if (($changed & 384) != 0) goto L23;
        if ($composer2.changedInstance(r18) == false) goto L21;
        int r16 = 256;
    L22:
        $dirty = $dirty | r16;
        goto L23
    L21:
        r16 = 128;
        goto L22
    L5:
        if ((r21 & 2) != 0) goto L9;
        lifecycleOwner2 = lifecycleOwner;
        if ($composer2.changedInstance(lifecycleOwner2) == false) goto L10;
        int r17 = 32;
    L11:
        $dirty = $dirty | r17;
    L10:
        r17 = 16;
        goto L11
    L9:
        lifecycleOwner2 = lifecycleOwner;
        goto L10
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = LifecycleResumeEffectNoParamError)
    public static final void LifecycleResumeEffect(final LifecycleOwner lifecycleOwner, final Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> r7, Composer $composer, final int $changed, final int r10) {
        Composer $composer2 = $composer.startRestartGroup(-747476210);
        ComposerKt.sourceInformation($composer2, "C(LifecycleResumeEffect)P(1):LifecycleEffect.kt#2vxrgp");
        int $dirty = $changed;
        if (($dirty & 1) == 0) goto L5;
    L11:
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "654@31678L7");
        if (($changed & 1) == 0) goto L20;
        if ($composer2.getDefaultsInvalid() == true) goto L20;
        $composer2.skipToGroupEnd();
        if ((r10 & 1) != 0) goto L22;
    L23:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L27;
        ComposerKt.traceEventStart(-747476210, $dirty, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:656)");
    L27:
        throw new IllegalStateException(LifecycleResumeEffectNoParamError.toString());
    L22:
        $dirty = $dirty & (-15);
    L20:
        if ((r10 & 1) == 0) goto L23;
        ProvidableCompositionLocal<LifecycleOwner> r11 = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r4 = $composer2.consume(r11);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        LifecycleOwner r6 = (LifecycleOwner) r4;
        goto L22
    L5:
        if ($composer2.getSkipping() == false) goto L11;
        $composer2.skipToGroupEnd();
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L28;
        r0.updateScope(new LifecycleEffectKt$$ExternalSyntheticLambda5(lifecycleOwner, r7, $changed, r10));
        return;
    }

    private static final void LifecycleResumeEffectImpl(final LifecycleOwner lifecycleOwner, final LifecycleResumePauseEffectScope scope, final Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> r10, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(912823238);
        ComposerKt.sourceInformation($composer2, "C(LifecycleResumeEffectImpl)P(1,2)664@32092L670,664@32052L710:LifecycleEffect.kt#2vxrgp");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(lifecycleOwner) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(scope) == false) goto L14;
        int r3 = 32;
    L15:
        $dirty = $dirty | r3;
        goto L17
    L14:
        r3 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changedInstance(r10) == false) goto L21;
        int r4 = 256;
    L22:
        $dirty = $dirty | r4;
        goto L24
    L21:
        r4 = 128;
    L24:
        if (($dirty & 147) != 146) goto L30;
        if ($composer2.getSkipping() == false) goto L30;
        $composer2.skipToGroupEnd();
    L46:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L50;
        r0.updateScope(new LifecycleEffectKt$$ExternalSyntheticLambda9(lifecycleOwner, scope, r10, $changed));
        return;
    L50:
        return;
    L30:
        if (ComposerKt.isTraceInProgress() == false) goto L32;
        ComposerKt.traceEventStart(912823238, $dirty, -1, "androidx.lifecycle.compose.LifecycleResumeEffectImpl (LifecycleEffect.kt:663)");
    L32:
        ComposerKt.sourceInformationMarkerStart($composer2, 1049812516, "CC(remember):LifecycleEffect.kt#9igjgp");
        boolean r1 = $composer2.changedInstance(scope);
        if (($dirty & 896) != 256) goto L35;
        boolean r5 = true;
    L36:
        boolean invalid$iv = (r1 | r5) | $composer2.changedInstance(lifecycleOwner);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L39;
    L42:
        Object value$iv = new LifecycleEffectKt$$ExternalSyntheticLambda8(lifecycleOwner, scope, r10);
        $composer2.updateRememberedValue(value$iv);
    L43:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.DisposableEffect(lifecycleOwner, scope, (Function1) value$iv, $composer2, ($dirty & 14) | ($dirty & 112));
        if (ComposerKt.isTraceInProgress() == false) goto L46;
        ComposerKt.traceEventEnd();
        goto L46
    L39:
        if (it$iv == Composer.Companion.getEmpty()) goto L42;
        value$iv = it$iv;
        goto L43
    L35:
        r5 = false;
        goto L36
    }

    static final DisposableEffectResult LifecycleResumeEffectImpl$lambda$34$lambda$33(final LifecycleOwner $lifecycleOwner, final LifecycleResumePauseEffectScope $scope, final Function1 $effects, DisposableEffectScope $this$DisposableEffect) {
        final Ref.ObjectRef effectResult = new Ref.ObjectRef();
        final LifecycleEventObserver observer = new LifecycleEffectKt$$ExternalSyntheticLambda3($scope, effectResult, $effects);
        $lifecycleOwner.getLifecycle().addObserver(observer);
        return new LifecycleEffectKt$LifecycleResumeEffectImpl$lambda$34$lambda$33$$inlined$onDispose$1($lifecycleOwner, observer, effectResult);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
    static final void LifecycleResumeEffectImpl$lambda$34$lambda$33$lambda$31(LifecycleResumePauseEffectScope $scope, Ref.ObjectRef $effectResult, Function1 $effects, LifecycleOwner r5, Lifecycle.Event event) {
        switch(WhenMappings.$EnumSwitchMapping$0[event.ordinal()]) {
            case 3: goto L9;
            case 4: goto L5;
            default: goto L12;
        };
    L5:
        LifecyclePauseOrDisposeEffectResult r6 = (LifecyclePauseOrDisposeEffectResult) $effectResult.element;
        if (r6 == null) goto L8;
        r6.runPauseOrOnDisposeEffect();
    L8:
        $effectResult.element = null;
        return;
    L9:
        $effectResult.element = $effects.invoke($scope);
        return;
    }
}
