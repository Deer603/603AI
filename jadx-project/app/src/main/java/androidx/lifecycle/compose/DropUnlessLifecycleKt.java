package androidx.lifecycle.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: DropUnlessLifecycle.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a3\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0003¢\u0006\u0002\u0010\b\u001a+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007¢\u0006\u0002\u0010\n\u001a+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007¢\u0006\u0002\u0010\n¨\u0006\f"}, d2 = {"dropUnlessStateIsAtLeast", "Lkotlin/Function0;", "", "state", "Landroidx/lifecycle/Lifecycle$State;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "block", "(Landroidx/lifecycle/Lifecycle$State;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function0;", "dropUnlessStarted", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function0;", "dropUnlessResumed", "lifecycle-runtime-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DropUnlessLifecycleKt {
    private static final Function0<Unit> dropUnlessStateIsAtLeast(final Lifecycle.State state, final LifecycleOwner lifecycleOwner, final Function0<Unit> r8, Composer $composer, int $changed, int r11) {
        ComposerKt.sourceInformationMarkerStart($composer, -2057956404, "C(dropUnlessStateIsAtLeast)P(2,1)45@1919L7,53@2217L107:DropUnlessLifecycle.kt#2vxrgp");
        if ((r11 & 2) == 0) goto L6;
        ProvidableCompositionLocal<LifecycleOwner> r12 = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r12);
        ComposerKt.sourceInformationMarkerEnd($composer);
        lifecycleOwner = (LifecycleOwner) r3;
    L6:
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventStart(-2057956404, $changed, -1, "androidx.lifecycle.compose.dropUnlessStateIsAtLeast (DropUnlessLifecycle.kt:47)");
    L8:
        boolean r0 = true;
        if (state == Lifecycle.State.DESTROYED) goto L11;
        boolean r13 = true;
    L12:
        if (r13 == false) goto L42;
        ComposerKt.sourceInformationMarkerStart($composer, -2011134025, "CC(remember):DropUnlessLifecycle.kt#9igjgp");
        boolean r14 = $composer.changedInstance(lifecycleOwner);
        if ((($changed & 14) ^ 6) <= 4) goto L18;
        if ($composer.changed(state.ordinal()) == false) goto L18;
    L19:
        boolean r2 = true;
    L21:
        boolean r15 = r14 | r2;
        if ((($changed & 896) ^ 384) <= 256) goto L26;
        if ($composer.changed(r8) == false) goto L26;
    L29:
        boolean invalid$iv = r15 | r0;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L32;
    L35:
        Object value$iv = new DropUnlessLifecycleKt$$ExternalSyntheticLambda0(lifecycleOwner, state, r8);
        $composer.updateRememberedValue(value$iv);
    L36:
        Function0<Unit> r5 = (Function0) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L39;
        ComposerKt.traceEventEnd();
    L39:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r5;
    L32:
        if (it$iv == Composer.Companion.getEmpty()) goto L35;
        value$iv = it$iv;
    L26:
        if (($changed & 384) == 256) goto L29;
        r0 = false;
    L18:
        if (($changed & 6) == 4) goto L19;
        r2 = false;
        goto L21
    L42:
        throw new IllegalArgumentException("Target state is not allowed to be `Lifecycle.State.DESTROYED` because Compose disposes of the composition before `Lifecycle.Event.ON_DESTROY` observers are invoked.".toString());
    L11:
        r13 = false;
        goto L12
    }

    static final Unit dropUnlessStateIsAtLeast$lambda$2$lambda$1(LifecycleOwner $lifecycleOwner, Lifecycle.State $state, Function0 $block) {
        if ($lifecycleOwner.getLifecycle().getCurrentState().isAtLeast($state) == false) goto L6;
        $block.invoke();
    L6:
        return Unit.INSTANCE;
    }

    public static final Function0<Unit> dropUnlessStarted(LifecycleOwner lifecycleOwner, Function0<Unit> r8, Composer $composer, int $changed, int r11) {
        ComposerKt.sourceInformationMarkerStart($composer, 1207869935, "C(dropUnlessStarted)P(1)75@3053L7,77@3101L62:DropUnlessLifecycle.kt#2vxrgp");
        if ((r11 & 1) == 0) goto L5;
        ProvidableCompositionLocal<LifecycleOwner> r12 = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r12);
        ComposerKt.sourceInformationMarkerEnd($composer);
        LifecycleOwner lifecycleOwner2 = (LifecycleOwner) r3;
        LifecycleOwner lifecycleOwner3 = lifecycleOwner2;
    L7:
        if (ComposerKt.isTraceInProgress() == false) goto L9;
        ComposerKt.traceEventStart(1207869935, $changed, -1, "androidx.lifecycle.compose.dropUnlessStarted (DropUnlessLifecycle.kt:77)");
    L9:
        Function0<Unit> r7 = dropUnlessStateIsAtLeast(Lifecycle.State.STARTED, lifecycleOwner3, r8, $composer, ((($changed << 3) & 112) | 6) | (($changed << 3) & 896), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L12;
        ComposerKt.traceEventEnd();
    L12:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r7;
    L5:
        lifecycleOwner3 = lifecycleOwner;
        goto L7
    }

    public static final Function0<Unit> dropUnlessResumed(LifecycleOwner lifecycleOwner, Function0<Unit> r8, Composer $composer, int $changed, int r11) {
        ComposerKt.sourceInformationMarkerStart($composer, 1331131589, "C(dropUnlessResumed)P(1)97@4047L7,99@4095L62:DropUnlessLifecycle.kt#2vxrgp");
        if ((r11 & 1) == 0) goto L5;
        ProvidableCompositionLocal<LifecycleOwner> r12 = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r12);
        ComposerKt.sourceInformationMarkerEnd($composer);
        LifecycleOwner lifecycleOwner2 = (LifecycleOwner) r3;
        LifecycleOwner lifecycleOwner3 = lifecycleOwner2;
    L7:
        if (ComposerKt.isTraceInProgress() == false) goto L9;
        ComposerKt.traceEventStart(1331131589, $changed, -1, "androidx.lifecycle.compose.dropUnlessResumed (DropUnlessLifecycle.kt:99)");
    L9:
        Function0<Unit> r7 = dropUnlessStateIsAtLeast(Lifecycle.State.RESUMED, lifecycleOwner3, r8, $composer, ((($changed << 3) & 112) | 6) | (($changed << 3) & 896), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L12;
        ComposerKt.traceEventEnd();
    L12:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r7;
    L5:
        lifecycleOwner3 = lifecycleOwner;
        goto L7
    }
}
