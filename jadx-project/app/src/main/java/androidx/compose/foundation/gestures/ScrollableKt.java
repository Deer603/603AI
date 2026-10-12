package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\r\u001a^\u0010\u0013\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!H\u0007\u001aH\u0010\u0013\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007\u001a\u001f\u0010\"\u001a\u00020#*\u00020$2\u0006\u0010%\u001a\u00020#H\u0082@ø\u0001\u0000¢\u0006\u0004\b&\u0010'\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000e\"\u0018\u0010\u000f\u001a\u00020\u0003*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"CanDragCalculation", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "DefaultScrollMotionDurationScale", "Landroidx/compose/ui/MotionDurationScale;", "getDefaultScrollMotionDurationScale", "()Landroidx/compose/ui/MotionDurationScale;", "DefaultScrollMotionDurationScaleFactor", "", "NoOpScrollScope", "Landroidx/compose/foundation/gestures/ScrollScope;", "UnityDensity", "androidx/compose/foundation/gestures/ScrollableKt$UnityDensity$1", "Landroidx/compose/foundation/gestures/ScrollableKt$UnityDensity$1;", "shouldBeTriggeredByMouseWheel", "Landroidx/compose/foundation/gestures/FlingBehavior;", "getShouldBeTriggeredByMouseWheel", "(Landroidx/compose/foundation/gestures/FlingBehavior;)Z", "scrollable", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/gestures/ScrollableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "enabled", "reverseDirection", "flingBehavior", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "bringIntoViewSpec", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "semanticsScrollBy", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "offset", "semanticsScrollBy-d-4ec7I", "(Landroidx/compose/foundation/gestures/ScrollingLogic;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ScrollableKt {
    private static final Function1<PointerInputChange, Boolean> CanDragCalculation = null;
    private static final MotionDurationScale DefaultScrollMotionDurationScale = null;
    private static final float DefaultScrollMotionDurationScaleFactor = 1.0f;
    private static final ScrollScope NoOpScrollScope = null;
    private static final ScrollableKt$UnityDensity$1 UnityDensity = null;

    public static final /* synthetic */ Function1 access$getCanDragCalculation$p() {
        return CanDragCalculation;
    }

    public static final /* synthetic */ ScrollScope access$getNoOpScrollScope$p() {
        return NoOpScrollScope;
    }

    public static final /* synthetic */ boolean access$getShouldBeTriggeredByMouseWheel(FlingBehavior $receiver) {
        return getShouldBeTriggeredByMouseWheel($receiver);
    }

    public static final /* synthetic */ ScrollableKt$UnityDensity$1 access$getUnityDensity$p() {
        return UnityDensity;
    }

    /* JADX INFO: renamed from: access$semanticsScrollBy-d-4ec7I, reason: not valid java name */
    public static final /* synthetic */ Object m494access$semanticsScrollByd4ec7I(ScrollingLogic $receiver, long offset, Continuation $completion) {
        return m495semanticsScrollByd4ec7I($receiver, offset, $completion);
    }

    public static /* synthetic */ Modifier scrollable$default(Modifier r7, ScrollableState r8, Orientation r9, boolean r10, boolean r11, FlingBehavior r12, MutableInteractionSource r13, int r14, Object r15) {
        if ((r14 & 4) == 0) goto L5;
        boolean r3 = true;
    L7:
        if ((r14 & 8) == 0) goto L9;
        boolean r4 = false;
    L11:
        if ((r14 & 16) == 0) goto L13;
        FlingBehavior r5 = null;
    L15:
        if ((r14 & 32) == 0) goto L17;
        MutableInteractionSource r6 = null;
    L19:
        return scrollable(r7, r8, r9, r3, r4, r5, r6);
    L17:
        r6 = r13;
        goto L19
    L13:
        r5 = r12;
        goto L15
    L9:
        r4 = r11;
        goto L11
    L5:
        r3 = r10;
        goto L7
    }

    public static final Modifier scrollable(Modifier $this$scrollable, ScrollableState state, Orientation orientation, boolean enabled, boolean reverseDirection, FlingBehavior flingBehavior, MutableInteractionSource interactionSource) {
        return scrollable$default($this$scrollable, state, orientation, null, enabled, reverseDirection, flingBehavior, interactionSource, null, 128, null);
    }

    public static /* synthetic */ Modifier scrollable$default(Modifier r9, ScrollableState r10, Orientation r11, OverscrollEffect r12, boolean r13, boolean r14, FlingBehavior r15, MutableInteractionSource r16, BringIntoViewSpec r17, int r18, Object r19) {
        if ((r18 & 8) == 0) goto L5;
        boolean r4 = true;
    L7:
        if ((r18 & 16) == 0) goto L9;
        boolean r5 = false;
    L11:
        if ((r18 & 32) == 0) goto L13;
        FlingBehavior r6 = null;
    L15:
        if ((r18 & 64) == 0) goto L17;
        MutableInteractionSource r7 = null;
    L19:
        if ((r18 & 128) == 0) goto L21;
        BringIntoViewSpec r8 = null;
    L23:
        return scrollable(r9, r10, r11, r12, r4, r5, r6, r7, r8);
    L21:
        r8 = r17;
        goto L23
    L17:
        r7 = r16;
        goto L19
    L13:
        r6 = r15;
        goto L15
    L9:
        r5 = r14;
        goto L11
    L5:
        r4 = r13;
        goto L7
    }

    public static final Modifier scrollable(Modifier $this$scrollable, ScrollableState state, Orientation orientation, OverscrollEffect overscrollEffect, boolean enabled, boolean reverseDirection, FlingBehavior flingBehavior, MutableInteractionSource interactionSource, BringIntoViewSpec bringIntoViewSpec) {
        return $this$scrollable.then(new ScrollableElement(state, orientation, overscrollEffect, enabled, reverseDirection, flingBehavior, interactionSource, bringIntoViewSpec));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.foundation.gestures.ScrollableKt$UnityDensity$1] */
    static {
        CanDragCalculation = ScrollableKt$CanDragCalculation$1.INSTANCE;
        NoOpScrollScope = new ScrollableKt$NoOpScrollScope$1();
        DefaultScrollMotionDurationScale = new ScrollableKt$DefaultScrollMotionDurationScale$1();
        UnityDensity = new ScrollableKt$UnityDensity$1();
    }

    private static final boolean getShouldBeTriggeredByMouseWheel(FlingBehavior $this$shouldBeTriggeredByMouseWheel) {
        return false;
    }

    public static final MotionDurationScale getDefaultScrollMotionDurationScale() {
        return DefaultScrollMotionDurationScale;
    }

    /* JADX INFO: renamed from: semanticsScrollBy-d-4ec7I, reason: not valid java name */
    private static final Object m495semanticsScrollByd4ec7I(ScrollingLogic $this$semanticsScrollBy_u2dd_u2d4ec7I, long offset, Continuation<? super Offset> r12) {
        if ((r12 instanceof ScrollableKt$semanticsScrollBy$1) == false) goto L7;
        ScrollableKt$semanticsScrollBy$1 r0 = (ScrollableKt$semanticsScrollBy$1) r12;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        Ref.FloatRef previousValue = (Ref.FloatRef) r0.L$1;
        ScrollingLogic $this$semanticsScrollBy_u2dd_u2d4ec7I2 = (ScrollingLogic) r0.L$0;
        ResultKt.throwOnFailure($result);
    L18:
        return Offset.m4114boximpl($this$semanticsScrollBy_u2dd_u2d4ec7I2.m515toOffsettuRUvjQ(previousValue.element));
    L13:
        ResultKt.throwOnFailure($result);
        Ref.FloatRef previousValue2 = new Ref.FloatRef();
        MutatePriority r9 = MutatePriority.Default;
        ScrollableKt$semanticsScrollBy$2 r3 = new ScrollableKt$semanticsScrollBy$2($this$semanticsScrollBy_u2dd_u2d4ec7I, offset, previousValue2, null);
        r0.L$0 = $this$semanticsScrollBy_u2dd_u2d4ec7I;
        r0.L$1 = previousValue2;
        r0.label = 1;
        if ($this$semanticsScrollBy_u2dd_u2d4ec7I.scroll(r9, r3, r0) != r2) goto L16;
        return r2;
    L16:
        $this$semanticsScrollBy_u2dd_u2d4ec7I2 = $this$semanticsScrollBy_u2dd_u2d4ec7I;
        previousValue = previousValue2;
        goto L18
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new ScrollableKt$semanticsScrollBy$1(r12);
        goto L8
    }
}
