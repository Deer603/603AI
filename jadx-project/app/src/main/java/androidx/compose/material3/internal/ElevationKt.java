package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: compiled from: Elevation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\u0007\u001a\u00020\b*\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\t2\u0006\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"DefaultIncomingSpec", "Landroidx/compose/animation/core/TweenSpec;", "Landroidx/compose/ui/unit/Dp;", "DefaultOutgoingSpec", "HoveredOutgoingSpec", "OutgoingSpecEasing", "Landroidx/compose/animation/core/Easing;", "animateElevation", "", "Landroidx/compose/animation/core/Animatable;", "target", "from", "Landroidx/compose/foundation/interaction/Interaction;", "to", "animateElevation-rAjV9yQ", "(Landroidx/compose/animation/core/Animatable;FLandroidx/compose/foundation/interaction/Interaction;Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ElevationKt {
    private static final TweenSpec<Dp> DefaultIncomingSpec = null;
    private static final TweenSpec<Dp> DefaultOutgoingSpec = null;
    private static final TweenSpec<Dp> HoveredOutgoingSpec = null;
    private static final Easing OutgoingSpecEasing = null;

    public static final /* synthetic */ TweenSpec access$getDefaultIncomingSpec$p() {
        return DefaultIncomingSpec;
    }

    public static final /* synthetic */ TweenSpec access$getDefaultOutgoingSpec$p() {
        return DefaultOutgoingSpec;
    }

    public static final /* synthetic */ TweenSpec access$getHoveredOutgoingSpec$p() {
        return HoveredOutgoingSpec;
    }

    /* JADX INFO: renamed from: animateElevation-rAjV9yQ$default, reason: not valid java name */
    public static /* synthetic */ Object m3028animateElevationrAjV9yQ$default(Animatable r1, float r2, Interaction r3, Interaction r4, Continuation r5, int r6, Object r7) {
        if ((r6 & 2) == 0) goto L6;
        r3 = null;
    L6:
        if ((r6 & 4) == 0) goto L9;
        r4 = null;
    L9:
        return m3027animateElevationrAjV9yQ(r1, r2, r3, r4, r5);
    }

    /* JADX INFO: renamed from: animateElevation-rAjV9yQ, reason: not valid java name */
    public static final Object m3027animateElevationrAjV9yQ(Animatable<Dp, ?> r9, float target, Interaction from, Interaction to, Continuation<? super Unit> r13) {
        if (to == null) goto L4;
        AnimationSpec<Dp> r0 = ElevationDefaults.INSTANCE.incomingAnimationSpecForInteraction(to);
    L7:
        AnimationSpec<Dp> r3 = r0;
        if (r3 == null) goto L14;
        Object r10 = Animatable.animateTo$default(r9, Dp.m6971boximpl(target), r3, null, null, r13, 12, null);
        if (r10 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L13;
        return r10;
    L13:
        return Unit.INSTANCE;
    L14:
        Object r11 = r9.snapTo(Dp.m6971boximpl(target), r13);
        if (r11 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L18;
        return r11;
    L18:
        return Unit.INSTANCE;
    L4:
        if (from == null) goto L6;
        r0 = ElevationDefaults.INSTANCE.outgoingAnimationSpecForInteraction(from);
        goto L7
    L6:
        r0 = null;
        goto L7
    }

    static {
        OutgoingSpecEasing = new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f);
        DefaultIncomingSpec = new TweenSpec(120, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
        DefaultOutgoingSpec = new TweenSpec(150, 0, OutgoingSpecEasing, 2, null);
        HoveredOutgoingSpec = new TweenSpec(120, 0, OutgoingSpecEasing, 2, null);
    }
}
