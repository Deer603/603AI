package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JV\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00142#\b\u0002\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00050\t2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0007¢\u0006\u0002\u0010\u001aR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableDefaults;", "", "()V", "DecayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "getDecayAnimationSpec", "()Landroidx/compose/animation/core/DecayAnimationSpec;", "PositionalThreshold", "Lkotlin/Function1;", "getPositionalThreshold", "()Lkotlin/jvm/functions/Function1;", "SnapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getSnapAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "flingBehavior", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "T", "state", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "positionalThreshold", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "totalDistance", "animationSpec", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AnchoredDraggableDefaults {
    public static final int $stable = 0;
    private static final DecayAnimationSpec<Float> DecayAnimationSpec = null;
    public static final AnchoredDraggableDefaults INSTANCE = null;
    private static final Function1<Float, Float> PositionalThreshold = null;
    private static final AnimationSpec<Float> SnapAnimationSpec = null;

    private AnchoredDraggableDefaults() {
    }

    static {
        INSTANCE = new AnchoredDraggableDefaults();
        SnapAnimationSpec = AnimationSpecKt.tween$default(0, 0, null, 7, null);
        PositionalThreshold = AnchoredDraggableDefaults$PositionalThreshold$1.INSTANCE;
        DecayAnimationSpec = DecayAnimationSpecKt.exponentialDecay$default(0.0f, 0.0f, 3, null);
        $stable = 8;
    }

    public final AnimationSpec<Float> getSnapAnimationSpec() {
        return SnapAnimationSpec;
    }

    public final Function1<Float, Float> getPositionalThreshold() {
        return PositionalThreshold;
    }

    public final DecayAnimationSpec<Float> getDecayAnimationSpec() {
        return DecayAnimationSpec;
    }

    public final <T> TargetedFlingBehavior flingBehavior(AnchoredDraggableState<T> r8, Function1<? super Float, Float> r9, AnimationSpec<Float> r10, Composer $composer, int $changed, int r13) {
        ComposerKt.sourceInformationMarkerStart($composer, -952742024, "C(flingBehavior)P(2,1)1521@67102L7,1522@67125L305:AnchoredDraggable.kt#8bwon0");
        if ((r13 & 2) == 0) goto L6;
        r9 = PositionalThreshold;
    L6:
        if ((r13 & 4) == 0) goto L9;
        r10 = SnapAnimationSpec;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-952742024, $changed, -1, "androidx.compose.foundation.gestures.AnchoredDraggableDefaults.flingBehavior (AnchoredDraggable.kt:1520)");
    L11:
        ProvidableCompositionLocal<Density> r14 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r14);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Density density = (Density) r3;
        ComposerKt.sourceInformationMarkerStart($composer, 1865838130, "CC(remember):AnchoredDraggable.kt#9igjgp");
        boolean r0 = $composer.changed(density);
        boolean r4 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L16;
        if ($composer.changed(r8) == false) goto L16;
    L17:
        boolean r1 = true;
    L19:
        boolean r2 = r0 | r1;
        if ((($changed & 112) ^ 48) <= 32) goto L24;
        if ($composer.changed(r9) == false) goto L24;
    L25:
        r4 = true;
    L26:
        boolean invalid$iv = (r2 | r4) | $composer.changed(r10);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L29;
    L32:
        Object value$iv = AnchoredDraggableKt.anchoredDraggableFlingBehavior(r8, density, r9, r10);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L33:
        TargetedFlingBehavior r5 = (TargetedFlingBehavior) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L36;
        ComposerKt.traceEventEnd();
    L36:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r5;
    L29:
        if (it$iv != Composer.Companion.getEmpty()) goto L33;
    L24:
        if (($changed & 48) != 32) goto L26;
    L16:
        if (($changed & 6) == 4) goto L17;
        r1 = false;
        goto L19
    }
}
