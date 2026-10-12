package androidx.compose.foundation.pager;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: compiled from: Pager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JI\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/pager/PagerDefaults;", "", "()V", "BeyondViewportPageCount", "", "flingBehavior", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "state", "Landroidx/compose/foundation/pager/PagerState;", "pagerSnapDistance", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "snapPositionalThreshold", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "pageNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PagerDefaults {
    public static final int $stable = 0;
    public static final int BeyondViewportPageCount = 0;
    public static final PagerDefaults INSTANCE = null;

    static {
        INSTANCE = new PagerDefaults();
    }

    private PagerDefaults() {
    }

    public final TargetedFlingBehavior flingBehavior(final PagerState state, PagerSnapDistance pagerSnapDistance, DecayAnimationSpec<Float> r20, AnimationSpec<Float> r21, float snapPositionalThreshold, Composer $composer, int $changed, int r25) {
        ComposerKt.sourceInformationMarkerStart($composer, 1559769181, "C(flingBehavior)P(4,1)376@20879L26,388@21477L7,389@21536L7,390@21559L1055:Pager.kt#g6yjnt");
        boolean r5 = true;
        if ((r25 & 2) == 0) goto L5;
        PagerSnapDistance pagerSnapDistance2 = PagerSnapDistance.Companion.atMost(1);
    L7:
        if ((r25 & 4) == 0) goto L9;
        DecayAnimationSpec<Float> r6 = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay($composer, 0);
    L11:
        if ((r25 & 8) == 0) goto L13;
        SpringSpec r8 = AnimationSpecKt.spring$default(0.0f, 400.0f, Float.valueOf(VisibilityThresholdsKt.getVisibilityThreshold(IntCompanionObject.INSTANCE)), 1, null);
    L15:
        if ((r25 & 16) == 0) goto L17;
        final float snapPositionalThreshold2 = 0.5f;
    L19:
        if (ComposerKt.isTraceInProgress() == false) goto L22;
        ComposerKt.traceEventStart(1559769181, $changed, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:383)");
    L22:
        if (0.0f <= snapPositionalThreshold2) goto L24;
    L26:
        boolean value$iv = false;
    L28:
        if (value$iv == true) goto L30;
        InlineClassHelperKt.throwIllegalArgumentException("snapPositionalThreshold should be a number between 0 and 1. You've specified " + snapPositionalThreshold2);
    L30:
        ProvidableCompositionLocal<Density> r3 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r14 = $composer.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Density density = (Density) r14;
        ProvidableCompositionLocal<LayoutDirection> r9 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r12 = $composer.consume(r9);
        ComposerKt.sourceInformationMarkerEnd($composer);
        final LayoutDirection layoutDirection = (LayoutDirection) r12;
        ComposerKt.sourceInformationMarkerStart($composer, -1107366577, "CC(remember):Pager.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L35;
        if ($composer.changed(state) == false) goto L35;
    L36:
        boolean r11 = true;
    L38:
        boolean r13 = (r11 | $composer.changed(r6)) | $composer.changed(r8);
        if ((($changed & 112) ^ 48) <= 32) goto L43;
        if ($composer.changed(pagerSnapDistance2) == false) goto L43;
    L46:
        boolean invalid$iv = ((r5 | r13) | $composer.changed(density)) | $composer.changed(layoutDirection);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L49;
    L52:
        SnapLayoutInfoProvider snapLayoutInfoProvider = PagerSnapLayoutInfoProviderKt.SnapLayoutInfoProvider(state, pagerSnapDistance2, new PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1(state, layoutDirection, snapPositionalThreshold2));
        Object value$iv2 = SnapFlingBehaviorKt.snapFlingBehavior(snapLayoutInfoProvider, r6, r8);
        $composer.updateRememberedValue(value$iv2);
        it$iv = value$iv2;
    L53:
        TargetedFlingBehavior r15 = (TargetedFlingBehavior) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L56;
        ComposerKt.traceEventEnd();
    L56:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r15;
    L49:
        if (it$iv != Composer.Companion.getEmpty()) goto L53;
    L43:
        if (($changed & 48) == 32) goto L46;
        r5 = false;
    L35:
        if (($changed & 6) == 4) goto L36;
        r11 = false;
        goto L38
    L24:
        if (snapPositionalThreshold2 > 1.0f) goto L26;
        value$iv = true;
        goto L28
    L17:
        snapPositionalThreshold2 = snapPositionalThreshold;
        goto L19
    L13:
        r8 = r21;
        goto L15
    L9:
        r6 = r20;
        goto L11
    L5:
        pagerSnapDistance2 = pagerSnapDistance;
        goto L7
    }

    public final NestedScrollConnection pageNestedScrollConnection(PagerState state, Orientation orientation, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 877583120, "C(pageNestedScrollConnection)P(1)433@23084L107:Pager.kt#g6yjnt");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(877583120, $changed, -1, "androidx.compose.foundation.pager.PagerDefaults.pageNestedScrollConnection (Pager.kt:432)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, -1511118598, "CC(remember):Pager.kt#9igjgp");
        boolean r1 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L10;
        if ($composer.changed(state) == false) goto L10;
    L11:
        boolean r0 = true;
    L14:
        if ((($changed & 112) ^ 48) <= 32) goto L18;
        if ($composer.changed(orientation) == false) goto L18;
    L19:
        r1 = true;
    L20:
        boolean invalid$iv = r0 | r1;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L23;
    L26:
        Object value$iv = new DefaultPagerNestedScrollConnection(state, orientation);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L27:
        DefaultPagerNestedScrollConnection r3 = (DefaultPagerNestedScrollConnection) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventEnd();
    L30:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r3;
    L23:
        if (it$iv != Composer.Companion.getEmpty()) goto L27;
    L18:
        if (($changed & 48) != 32) goto L20;
    L10:
        if (($changed & 6) == 4) goto L11;
        r0 = false;
        goto L14
    }
}
