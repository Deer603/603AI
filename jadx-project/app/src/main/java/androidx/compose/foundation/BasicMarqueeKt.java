package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

/* JADX INFO: compiled from: BasicMarquee.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aH\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00142\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0002\u001aR\u0010\u0015\u001a\u00020\u0016*\u00020\u00162\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"MarqueeSpacing", "Landroidx/compose/foundation/MarqueeSpacing;", "spacing", "Landroidx/compose/ui/unit/Dp;", "MarqueeSpacing-0680j_4", "(F)Landroidx/compose/foundation/MarqueeSpacing;", "createMarqueeAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "iterations", "", "targetValue", "initialDelayMillis", "delayMillis", "velocity", "density", "Landroidx/compose/ui/unit/Density;", "createMarqueeAnimationSpec-Z4HSEVQ", "(IFIIFLandroidx/compose/ui/unit/Density;)Landroidx/compose/animation/core/AnimationSpec;", "velocityBasedTween", "Landroidx/compose/animation/core/TweenSpec;", "basicMarquee", "Landroidx/compose/ui/Modifier;", "animationMode", "Landroidx/compose/foundation/MarqueeAnimationMode;", "repeatDelayMillis", "basicMarquee-1Mj1MLw", "(Landroidx/compose/ui/Modifier;IIIILandroidx/compose/foundation/MarqueeSpacing;F)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BasicMarqueeKt {
    /* JADX INFO: renamed from: access$createMarqueeAnimationSpec-Z4HSEVQ, reason: not valid java name */
    public static final /* synthetic */ AnimationSpec m238access$createMarqueeAnimationSpecZ4HSEVQ(int iterations, float targetValue, int initialDelayMillis, int delayMillis, float velocity, Density density) {
        return m241createMarqueeAnimationSpecZ4HSEVQ(iterations, targetValue, initialDelayMillis, delayMillis, velocity, density);
    }

    /* JADX INFO: renamed from: basicMarquee-1Mj1MLw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m240basicMarquee1Mj1MLw$default(Modifier r0, int r1, int r2, int r3, int r4, MarqueeSpacing r5, float r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = MarqueeDefaults.INSTANCE.getIterations();
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = MarqueeAnimationMode.Companion.m313getImmediatelyZbEOnfQ();
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = MarqueeDefaults.INSTANCE.getRepeatDelayMillis();
    L12:
        if ((r7 & 8) == 0) goto L18;
        if (MarqueeAnimationMode.m309equalsimpl0(r2, MarqueeAnimationMode.Companion.m313getImmediatelyZbEOnfQ()) == false) goto L16;
        r4 = r3;
        goto L18
    L16:
        r4 = 0;
    L18:
        if ((r7 & 16) == 0) goto L21;
        r5 = MarqueeDefaults.INSTANCE.getSpacing();
    L21:
        if ((r7 & 32) == 0) goto L23;
        float r9 = MarqueeDefaults.INSTANCE.m315getVelocityD9Ej5fM();
    L24:
        int r10 = r4;
        MarqueeSpacing r11 = r5;
        int r12 = r3;
        int r13 = r1;
        return m239basicMarquee1Mj1MLw(r0, r13, r2, r12, r10, r11, r9);
    L23:
        r9 = r6;
        goto L24
    }

    /* JADX INFO: renamed from: basicMarquee-1Mj1MLw, reason: not valid java name */
    public static final Modifier m239basicMarquee1Mj1MLw(Modifier $this$basicMarquee_u2d1Mj1MLw, int iterations, int animationMode, int repeatDelayMillis, int initialDelayMillis, MarqueeSpacing spacing, float velocity) {
        return $this$basicMarquee_u2d1Mj1MLw.then(new MarqueeModifierElement(iterations, animationMode, repeatDelayMillis, initialDelayMillis, spacing, velocity, null));
    }

    /* JADX INFO: renamed from: createMarqueeAnimationSpec-Z4HSEVQ, reason: not valid java name */
    private static final AnimationSpec<Float> m241createMarqueeAnimationSpecZ4HSEVQ(int iterations, float targetValue, int initialDelayMillis, int delayMillis, float velocity, Density density) {
        float pxPerSec = density.mo376toPx0680j_4(velocity);
        TweenSpec<Float> r2 = velocityBasedTween(Math.abs(pxPerSec), targetValue, delayMillis);
        long startOffset = StartOffset.m167constructorimpl$default((-delayMillis) + initialDelayMillis, 0, 2, null);
        if (iterations != Integer.MAX_VALUE) goto L6;
        return AnimationSpecKt.m135infiniteRepeatable9IiC70o$default(r2, null, startOffset, 2, null);
    L6:
        return AnimationSpecKt.m137repeatable91I0pcU$default(iterations, r2, null, startOffset, 4, null);
    }

    private static final TweenSpec<Float> velocityBasedTween(float velocity, float targetValue, int delayMillis) {
        float pxPerMilli = velocity / 1000.0f;
        return AnimationSpecKt.tween((int) Math.ceil(targetValue / pxPerMilli), delayMillis, EasingKt.getLinearEasing());
    }

    /* JADX INFO: renamed from: MarqueeSpacing-0680j_4, reason: not valid java name */
    public static final MarqueeSpacing m237MarqueeSpacing0680j_4(final float spacing) {
        return new BasicMarqueeKt$$ExternalSyntheticLambda0(spacing);
    }

    static final int MarqueeSpacing_0680j_4$lambda$1(float $spacing, Density $this$MarqueeSpacing, int r2, int r3) {
        return $this$MarqueeSpacing.mo370roundToPx0680j_4($spacing);
    }
}
