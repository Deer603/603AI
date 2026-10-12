package androidx.compose.foundation.gestures;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.AndroidOverscroll_androidKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableDefaults;", "", "()V", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;", "reverseDirection", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "reverseScrolling", "NoOpOverscrollEffect", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ScrollableDefaults {
    public static final int $stable = 0;
    public static final ScrollableDefaults INSTANCE = null;

    /* JADX INFO: compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J?\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J6\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableDefaults$NoOpOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "()V", "isInProgress", "", "()Z", "node", "Landroidx/compose/ui/node/DelegatableNode;", "getNode", "()Landroidx/compose/ui/node/DelegatableNode;", "applyToFling", "", "velocity", "Landroidx/compose/ui/unit/Velocity;", "performFling", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "applyToFling-BMRW4eQ", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyToScroll", "Landroidx/compose/ui/geometry/Offset;", "delta", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "performScroll", "Lkotlin/Function1;", "applyToScroll-Rhakbz0", "(JILkotlin/jvm/functions/Function1;)J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class NoOpOverscrollEffect implements OverscrollEffect {
        public static final NoOpOverscrollEffect INSTANCE = null;

        static {
            INSTANCE = new NoOpOverscrollEffect();
        }

        private NoOpOverscrollEffect() {
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        /* JADX INFO: renamed from: applyToScroll-Rhakbz0 */
        public long mo213applyToScrollRhakbz0(long delta, int source, Function1<? super Offset, Offset> r6) {
            return r6.invoke(Offset.m4114boximpl(delta)).m4135unboximpl();
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        /* JADX INFO: renamed from: applyToFling-BMRW4eQ */
        public Object mo212applyToFlingBMRW4eQ(long velocity, Function2<? super Velocity, ? super Continuation<? super Velocity>, ? extends Object> r5, Continuation<? super Unit> r6) {
            Object r0 = r5.invoke(Velocity.m7202boximpl(velocity), r6);
            if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
            return r0;
        L6:
            return Unit.INSTANCE;
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        public boolean isInProgress() {
            return false;
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        public DelegatableNode getNode() {
            return new ScrollableDefaults$NoOpOverscrollEffect$node$1();
        }
    }

    static {
        INSTANCE = new ScrollableDefaults();
    }

    private ScrollableDefaults() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FlingBehavior flingBehavior(Composer r11, int r12) {
        ComposerKt.sourceInformationMarkerStart(r11, 1107739818, "C(flingBehavior)537@21565L33,538@21614L55:Scrollable.kt#8bwon0");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1107739818, r12, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:536)");
    L5:
        DecayAnimationSpec r0 = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(r11, 0);
        ComposerKt.sourceInformationMarkerStart(r11, -480400006, "CC(remember):Scrollable.kt#9igjgp");
        boolean r1 = r11.changed(r0);
        Object r4 = r11.rememberedValue();
        if (r1 == false) goto L8;
    L11:
        MotionDurationScale r9 = null;
        DefaultFlingBehavior r7 = new DefaultFlingBehavior(r0, r9, 2, 0 == true ? 1 : 0);
        r11.updateRememberedValue(r7);
        r4 = r7;
    L12:
        DefaultFlingBehavior r5 = (DefaultFlingBehavior) r4;
        ComposerKt.sourceInformationMarkerEnd(r11);
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventEnd();
    L15:
        ComposerKt.sourceInformationMarkerEnd(r11);
        return r5;
    L8:
        if (r4 != Composer.Companion.getEmpty()) goto L12;
        goto L11
    }

    @Deprecated(message = "This API has been replaced with rememberOverscrollEffect, which queries theme provided OverscrollFactory values instead of the 'platform default' without customization.", replaceWith = @ReplaceWith(expression = "rememberOverscrollEffect()", imports = {"androidx.compose.foundation.rememberOverscrollEffect"}))
    public final OverscrollEffect overscrollEffect(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1809802212, "C(overscrollEffect)557@22356L34:Scrollable.kt#8bwon0");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1809802212, $changed, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:556)");
    L5:
        NoOpOverscrollEffect r0 = AndroidOverscroll_androidKt.rememberPlatformOverscrollEffect($composer, 0);
        if (r0 != null) goto L9;
        r0 = NoOpOverscrollEffect.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventEnd();
    L11:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final boolean reverseDirection(LayoutDirection layoutDirection, Orientation orientation, boolean reverseScrolling) {
        boolean reverseDirection = !reverseScrolling;
        boolean reverseDirection2 = false;
        if (layoutDirection != LayoutDirection.Rtl) goto L5;
        boolean isRtl = true;
    L6:
        if (isRtl == true) goto L8;
        return reverseDirection;
    L8:
        if (orientation == Orientation.Vertical) goto L14;
        if (reverseDirection == true) goto L12;
        reverseDirection2 = true;
    L12:
        return reverseDirection2;
    L14:
        return reverseDirection;
    L5:
        isRtl = false;
        goto L6
    }
}
