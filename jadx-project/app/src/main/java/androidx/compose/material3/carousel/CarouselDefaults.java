package androidx.compose.material3.carousel;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.pager.PagerDefaults;
import androidx.compose.foundation.pager.PagerSnapDistance;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: compiled from: Carousel.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J5\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015H\u0007¢\u0006\u0002\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0018J%\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015H\u0007¢\u0006\u0002\u0010\u001aR\u001c\u0010\u0003\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u000e\u0010\n\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/carousel/CarouselDefaults;", "", "()V", "AnchorSize", "Landroidx/compose/ui/unit/Dp;", "getAnchorSize-D9Ej5fM$material3_release", "()F", "F", "MaxSmallItemSize", "getMaxSmallItemSize-D9Ej5fM$material3_release", "MediumLargeItemDiffThreshold", "", "MinSmallItemSize", "getMinSmallItemSize-D9Ej5fM$material3_release", "multiBrowseFlingBehavior", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "state", "Landroidx/compose/material3/carousel/CarouselState;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "noSnapFlingBehavior", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "singleAdvanceFlingBehavior", "(Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CarouselDefaults {
    public static final int $stable = 0;
    private static final float AnchorSize = 0.0f;
    public static final CarouselDefaults INSTANCE = null;
    private static final float MaxSmallItemSize = 0.0f;
    public static final float MediumLargeItemDiffThreshold = 0.85f;
    private static final float MinSmallItemSize = 0.0f;

    private CarouselDefaults() {
    }

    public final TargetedFlingBehavior singleAdvanceFlingBehavior(CarouselState state, AnimationSpec<Float> r12, Composer $composer, int $changed, int r15) {
        ComposerKt.sourceInformationMarkerStart($composer, 1701587199, "C(singleAdvanceFlingBehavior)P(1)612@27409L174:Carousel.kt#dcf9yb");
        if ((r15 & 2) == 0) goto L5;
        AnimationSpec snapAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        AnimationSpec<Float> r5 = snapAnimationSpec;
    L7:
        if (ComposerKt.isTraceInProgress() == false) goto L9;
        ComposerKt.traceEventStart(1701587199, $changed, -1, "androidx.compose.material3.carousel.CarouselDefaults.singleAdvanceFlingBehavior (Carousel.kt:611)");
    L9:
        TargetedFlingBehavior r13 = PagerDefaults.INSTANCE.flingBehavior(state.getPagerState$material3_release(), PagerSnapDistance.Companion.atMost(1), null, r5, 0.0f, $composer, (($changed << 6) & 7168) | (PagerDefaults.$stable << 15), 20);
        if (ComposerKt.isTraceInProgress() == false) goto L12;
        ComposerKt.traceEventEnd();
    L12:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r13;
    L5:
        r5 = r12;
        goto L7
    }

    public final TargetedFlingBehavior multiBrowseFlingBehavior(CarouselState state, DecayAnimationSpec<Float> r13, AnimationSpec<Float> r14, Composer $composer, int $changed, int r17) {
        ComposerKt.sourceInformationMarkerStart($composer, -1105043293, "C(multiBrowseFlingBehavior)P(2)642@29119L26,657@29722L217:Carousel.kt#dcf9yb");
        if ((r17 & 2) == 0) goto L5;
        DecayAnimationSpec<Float> r5 = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay($composer, 0);
    L7:
        if ((r17 & 4) == 0) goto L9;
        AnimationSpec snapAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        AnimationSpec<Float> r6 = snapAnimationSpec;
    L11:
        if (ComposerKt.isTraceInProgress() == false) goto L13;
        ComposerKt.traceEventStart(-1105043293, $changed, -1, "androidx.compose.material3.carousel.CarouselDefaults.multiBrowseFlingBehavior (Carousel.kt:644)");
    L13:
        PagerSnapDistance r15 = new CarouselDefaults$multiBrowseFlingBehavior$pagerSnapDistance$1();
        TargetedFlingBehavior r16 = PagerDefaults.INSTANCE.flingBehavior(state.getPagerState$material3_release(), r15, r5, r6, 0.0f, $composer, ((($changed << 3) & 896) | (($changed << 3) & 7168)) | (PagerDefaults.$stable << 15), 16);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r16;
    L9:
        r6 = r14;
        goto L11
    L5:
        r5 = r13;
        goto L7
    }

    public final TargetedFlingBehavior noSnapFlingBehavior(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -418415756, "C(noSnapFlingBehavior)674@30353L158,680@30528L75:Carousel.kt#dcf9yb");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-418415756, $changed, -1, "androidx.compose.material3.carousel.CarouselDefaults.noSnapFlingBehavior (Carousel.kt:673)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 1269150096, "CC(remember):Carousel.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L8;
        Object value$iv = new CarouselDefaults$noSnapFlingBehavior$decayLayoutInfoProvider$1$1();
        $composer.updateRememberedValue(value$iv);
    L9:
        CarouselDefaults$noSnapFlingBehavior$decayLayoutInfoProvider$1$1 decayLayoutInfoProvider = (CarouselDefaults$noSnapFlingBehavior$decayLayoutInfoProvider$1$1) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        TargetedFlingBehavior r1 = SnapFlingBehaviorKt.rememberSnapFlingBehavior(decayLayoutInfoProvider, $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L12;
        ComposerKt.traceEventEnd();
    L12:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L8:
        value$iv = it$iv;
        goto L9
    }

    static {
        INSTANCE = new CarouselDefaults();
        MinSmallItemSize = Dp.m6973constructorimpl(40);
        MaxSmallItemSize = Dp.m6973constructorimpl(56);
        AnchorSize = Dp.m6973constructorimpl(10);
    }

    /* JADX INFO: renamed from: getMinSmallItemSize-D9Ej5fM$material3_release, reason: not valid java name */
    public final float m3008getMinSmallItemSizeD9Ej5fM$material3_release() {
        return MinSmallItemSize;
    }

    /* JADX INFO: renamed from: getMaxSmallItemSize-D9Ej5fM$material3_release, reason: not valid java name */
    public final float m3007getMaxSmallItemSizeD9Ej5fM$material3_release() {
        return MaxSmallItemSize;
    }

    /* JADX INFO: renamed from: getAnchorSize-D9Ej5fM$material3_release, reason: not valid java name */
    public final float m3006getAnchorSizeD9Ej5fM$material3_release() {
        return AnchorSize;
    }
}
