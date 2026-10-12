package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: LazyLayoutScrollScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082\b\u001a2\u0010\f\u001a\u00020\b*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0080@¢\u0006\u0002\u0010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0004*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u0016"}, d2 = {"BoundDistance", "Landroidx/compose/ui/unit/Dp;", "F", "DEBUG", "", "MinimumDistance", "TargetDistance", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "animateScrollToItem", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "index", "", "scrollOffset", "numOfItemsForTeleport", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;IIILandroidx/compose/ui/unit/Density;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isItemVisible", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyLayoutScrollScopeKt {
    private static final float BoundDistance = 0.0f;
    private static final boolean DEBUG = false;
    private static final float MinimumDistance = 0.0f;
    private static final float TargetDistance = 0.0f;

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt$animateScrollToItem$1, reason: invalid class name */
    /* JADX INFO: compiled from: LazyLayoutScrollScope.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt", f = "LazyLayoutScrollScope.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {177, 264}, m = "animateScrollToItem", n = {"$this$animateScrollToItem", "loop", "anim", "loops", "index", "scrollOffset", "numOfItemsForTeleport", "targetDistancePx", "boundDistancePx", "minDistancePx", "forward", "$this$animateScrollToItem", "index", "scrollOffset"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "F$0", "F$1", "F$2", "I$3", "L$0", "I$0", "I$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r8) {
            this.result = r8;
            this.label |= Integer.MIN_VALUE;
            return LazyLayoutScrollScopeKt.animateScrollToItem(null, 0, 0, 0, null, this);
        }
    }

    public static final /* synthetic */ boolean access$animateScrollToItem$isOvershot(boolean forward, LazyLayoutScrollScope $this_animateScrollToItem, int $index, int $scrollOffset) {
        return animateScrollToItem$isOvershot(forward, $this_animateScrollToItem, $index, $scrollOffset);
    }

    static {
        TargetDistance = Dp.m6973constructorimpl(2500);
        BoundDistance = Dp.m6973constructorimpl(1500);
        MinimumDistance = Dp.m6973constructorimpl(50);
    }

    private static final void debugLog(Function0<String> r1) {
    }

    public static final boolean isItemVisible(LazyLayoutScrollScope $this$isItemVisible, int index) {
        int r0 = $this$isItemVisible.getFirstVisibleItemIndex();
        if (index > $this$isItemVisible.getLastVisibleItemIndex()) goto L7;
        if (r0 > index) goto L8;
        return true;
    L8:
        return false;
    L7:
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Type inference failed for: r8v22, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01cd -> B:107:0x01dc). Please report as a decompilation issue!!! */
    public static final Object animateScrollToItem(LazyLayoutScrollScope r39, int r40, int r41, int numOfItemsForTeleport, Density density, Continuation<? super Unit> r44) {
        Continuation<? super Unit> r1 = r44;
        if ((r1 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r1;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        AnonymousClass1 r2 = r0;
        Object $result = r2.result;
        Object r4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean r9 = true;
        switch(r2.label) {
            case 0: goto L18;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        int scrollOffset = r2.I$1;
        int index = r2.I$0;
        LazyLayoutScrollScope $this$animateScrollToItem = (LazyLayoutScrollScope) r2.L$0;
        ResultKt.throwOnFailure($result);
    L104:
        $this$animateScrollToItem.snapToItem(index, scrollOffset);
    L106:
        return Unit.INSTANCE;
    L13:
        int scrollOffset2 = r2.I$3;
        float minDistancePx = r2.F$2;
        float boundDistancePx = r2.F$1;
        float targetDistancePx = r2.F$0;
        int numOfItemsForTeleport2 = r2.I$2;
        int scrollOffset3 = r2.I$1;
        int index2 = r2.I$0;
        float r16 = 0.0f;
        Ref.IntRef loops = (Ref.IntRef) r2.L$3;
        Ref.ObjectRef anim = (Ref.ObjectRef) r2.L$2;
        Ref.BooleanRef loop = (Ref.BooleanRef) r2.L$1;
        LazyLayoutScrollScope $this$animateScrollToItem2 = (LazyLayoutScrollScope) r2.L$0;
        ResultKt.throwOnFailure($result);     // Catch: ItemFoundInScroll -> L16
        Ref.ObjectRef anim2 = anim;
        LazyLayoutScrollScope $this$animateScrollToItem3 = $this$animateScrollToItem2;
        Ref.IntRef loops2 = loops;
        final float boundDistancePx2 = boundDistancePx;
        final int numOfItemsForTeleport3 = numOfItemsForTeleport2;
        final int scrollOffset4 = scrollOffset3;
        int scrollOffset5 = scrollOffset2;
        Ref.BooleanRef loop2 = loop;
        int index3 = index2;
    L107:
        int numOfItemsForTeleport4 = loops2.element;     // Catch: ItemFoundInScroll -> L74
        loops2.element = numOfItemsForTeleport4 + 1;     // Catch: ItemFoundInScroll -> L74
        final Ref.IntRef loops3 = loops2;
        r9 = true;
    L109:
    L85:
        itemFound = e;
        final LazyLayoutScrollScope $this$animateScrollToItem4 = $this$animateScrollToItem3;
        int scrollOffset6 = scrollOffset4;
        boolean r13 = false;
        index = index3;
    L96:
        AnimationState anim3 = AnimationStateKt.copy$default(itemFound.getPreviousAnimation(), 0.0f, 0.0f, 0, 0, false, 30, null);
        final float target = itemFound.getItemOffset() + scrollOffset6;
        final Ref.FloatRef prevValue = new Ref.FloatRef();
        Float r18 = Boxing.boxFloat(target);
        if (((Number) anim3.getVelocity()).floatValue() != r16) goto L99;
        boolean r8 = true;
    L100:
        boolean r20 = !r8;
        Function1<AnimationScope<Float, AnimationVector1D>, Unit> r21 = new AnonymousClass6(target, prevValue, $this$animateScrollToItem4);
        r2.L$0 = $this$animateScrollToItem4;
        r2.L$1 = null;
        r2.L$2 = null;
        r2.L$3 = null;
        r2.I$0 = index;
        r2.I$1 = scrollOffset6;
        r2.label = 2;
        Continuation $continuation = r2;
        if (SuspendAnimationKt.animateTo$default(anim3, r18, null, r20, r21, $continuation, 2, null) != r4) goto L103;
        return r4;
    L103:
        scrollOffset = scrollOffset6;
        $this$animateScrollToItem = $this$animateScrollToItem4;
        goto L104
    L99:
        r8 = r13;
        goto L100
    L35:
        if (loop2.element == false) goto L106;
        if ($this$animateScrollToItem3.getItemCount() <= 0) goto L106;
        int expectedDistance = LazyLayoutScrollScope.calculateDistanceTo$default($this$animateScrollToItem3, index3, 0, 2, null) + scrollOffset4;     // Catch: ItemFoundInScroll -> L85
        if (Math.abs(expectedDistance) < targetDistancePx) goto L42;
        if (scrollOffset5 == 0) goto L48;
        final float target2 = targetDistancePx;
    L50:
        anim2.element = AnimationStateKt.copy$default((AnimationState) anim2.element, 0.0f, 0.0f, 0, 0, false, 30, null);     // Catch: ItemFoundInScroll -> L85
        final Ref.FloatRef prevValue2 = new Ref.FloatRef();     // Catch: ItemFoundInScroll -> L85
        AnimationState r10 = (AnimationState) anim2.element;     // Catch: ItemFoundInScroll -> L85
        Float r11 = Boxing.boxFloat(target2);     // Catch: ItemFoundInScroll -> L85
        if (((Number) ((AnimationState) anim2.element).getVelocity()).floatValue() != r16) goto L53;
        boolean r14 = r9;
    L54:
        if (r14 == true) goto L56;
        boolean r15 = r9;
    L57:
        if (scrollOffset5 == 0) goto L60;
        final boolean r24 = r9;
    L61:
        final Ref.BooleanRef loop3 = loop2;
        final LazyLayoutScrollScope $this$animateScrollToItem5 = $this$animateScrollToItem3;
        final Ref.ObjectRef anim4 = anim2;
        final int index4 = index3;
        Continuation<? super Unit> r310 = r1;
        Object $result2 = $result;
        $this$animateScrollToItem4 = $this$animateScrollToItem5;
        float boundDistancePx3 = boundDistancePx2;
        Ref.IntRef loops4 = loops3;
        int numOfItemsForTeleport5 = numOfItemsForTeleport3;
        int scrollOffset7 = scrollOffset4;
        Function1<AnimationScope<Float, AnimationVector1D>, Unit> r22 = new AnonymousClass4($this$animateScrollToItem5, index4, target2, prevValue2, loop3, r24, boundDistancePx2, loops3, numOfItemsForTeleport3, scrollOffset4, anim4);     // Catch: ItemFoundInScroll -> L82
        r2.L$0 = $this$animateScrollToItem4;     // Catch: ItemFoundInScroll -> L80
        r2.L$1 = loop3;     // Catch: ItemFoundInScroll -> L80
        r2.L$2 = anim4;     // Catch: ItemFoundInScroll -> L80
        r2.L$3 = loops4;     // Catch: ItemFoundInScroll -> L80
        r2.I$0 = index4;     // Catch: ItemFoundInScroll -> L80
        r2.I$1 = scrollOffset7;     // Catch: ItemFoundInScroll -> L80
        r2.I$2 = numOfItemsForTeleport5;     // Catch: ItemFoundInScroll -> L80
        r2.F$0 = targetDistancePx;     // Catch: ItemFoundInScroll -> L80
        r2.F$1 = boundDistancePx3;     // Catch: ItemFoundInScroll -> L80
        r2.F$2 = minDistancePx;     // Catch: ItemFoundInScroll -> L80
        r2.I$3 = scrollOffset5;     // Catch: ItemFoundInScroll -> L80
        scrollOffset4 = scrollOffset7;
        r2.label = 1;     // Catch: ItemFoundInScroll -> L78
        AnonymousClass1 r23 = r2;
        if (SuspendAnimationKt.animateTo$default(r10, r11, null, r15, r22, r23, 2, null) != r4) goto L71;
        return r4;
    L71:
        r1 = r310;
        boundDistancePx2 = boundDistancePx3;
        loops2 = loops4;
        loop2 = loop3;
        numOfItemsForTeleport3 = numOfItemsForTeleport5;
        r2 = r23;
        index3 = index4;
        anim2 = anim4;
        $this$animateScrollToItem3 = $this$animateScrollToItem4;
        $result = $result2;
    L76:
        itemFound = e;
        r2 = r23;
        scrollOffset6 = scrollOffset4;
        r13 = false;
        index = index4;
    L78:
        itemFound = e;
        scrollOffset6 = scrollOffset4;
        r13 = false;
        index = index4;
    L80:
        itemFound = e;
        scrollOffset6 = scrollOffset7;
        r13 = false;
        index = index4;
    L82:
        itemFound = e;
        $this$animateScrollToItem4 = $this$animateScrollToItem5;
        scrollOffset6 = scrollOffset4;
        r13 = false;
        index = index4;
        goto L96
    L60:
        r24 = false;
        goto L61
    L56:
        r15 = false;
        goto L57
    L53:
        r14 = false;
        goto L54
    L48:
        target2 = -targetDistancePx;
        goto L50
    L42:
        float absTargetPx = Math.max(Math.abs(expectedDistance), minDistancePx);     // Catch: ItemFoundInScroll -> L74
        if (scrollOffset5 == 0) goto L45;
        target2 = absTargetPx;
        goto L50
    L45:
        target2 = -absTargetPx;
    L74:
        itemFound = e;
        $this$animateScrollToItem4 = $this$animateScrollToItem3;
        scrollOffset6 = scrollOffset4;
        r13 = false;
        index = index3;
    L16:
        itemFound = e;
        scrollOffset6 = scrollOffset3;
        index = index2;
        r13 = false;
        $this$animateScrollToItem4 = $this$animateScrollToItem2;
        goto L96
    L18:
        r16 = 0.0f;
        ResultKt.throwOnFailure($result);
        $this$animateScrollToItem3 = r39;
        scrollOffset6 = r41;
        index3 = r40;
        if (index3 < 0.0f) goto L21;
        boolean value$iv = true;
    L23:
        if (value$iv == true) goto L111;
        InlineClassHelperKt.throwIllegalArgumentException("Index should be non-negative");
    L111:
        targetDistancePx = density.mo376toPx0680j_4(TargetDistance);     // Catch: ItemFoundInScroll -> L94
        float boundDistancePx4 = density.mo376toPx0680j_4(BoundDistance);     // Catch: ItemFoundInScroll -> L94
        float minDistancePx2 = density.mo376toPx0680j_4(MinimumDistance);     // Catch: ItemFoundInScroll -> L94
        loop2 = new Ref.BooleanRef();     // Catch: ItemFoundInScroll -> L94
        loop2.element = true;     // Catch: ItemFoundInScroll -> L94
        Ref.ObjectRef anim5 = new Ref.ObjectRef();     // Catch: ItemFoundInScroll -> L94
        anim5.element = AnimationStateKt.AnimationState$default(0.0f, 0.0f, 0, 0, false, 30, null);     // Catch: ItemFoundInScroll -> L94
        if (isItemVisible($this$animateScrollToItem3, index3) == false) goto L117;
        r13 = false;
        int targetItemInitialOffset = LazyLayoutScrollScope.calculateDistanceTo$default($this$animateScrollToItem3, index3, 0, 2, null);     // Catch: ItemFoundInScroll -> L92
        throw new ItemFoundInScroll(targetItemInitialOffset, (AnimationState) anim5.element);     // Catch: ItemFoundInScroll -> L92
    L92:
        itemFound = e;
        $this$animateScrollToItem4 = $this$animateScrollToItem3;
        index = index3;
        goto L96
    L117:
    L87:
        itemFound = e;
        $this$animateScrollToItem4 = $this$animateScrollToItem3;
        r13 = false;
        index = index3;
        goto L96
    L29:
        if (index3 <= $this$animateScrollToItem3.getFirstVisibleItemIndex()) goto L31;
        scrollOffset5 = 1;
    L32:
        Ref.IntRef loops5 = new Ref.IntRef();     // Catch: ItemFoundInScroll -> L87
        loops5.element = 1;     // Catch: ItemFoundInScroll -> L87
        scrollOffset4 = scrollOffset6;
        numOfItemsForTeleport3 = numOfItemsForTeleport;
        anim2 = anim5;
        minDistancePx = minDistancePx2;
        boundDistancePx2 = boundDistancePx4;
        loops3 = loops5;
        goto L109
    L31:
        scrollOffset5 = 0;
    L94:
        itemFound = e;
        r13 = false;
        $this$animateScrollToItem4 = $this$animateScrollToItem3;
        index = index3;
        goto L96
    L21:
        value$iv = false;
        goto L23
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(r1);
        goto L8
    }

    private static final boolean animateScrollToItem$isOvershot(boolean forward, LazyLayoutScrollScope $this_animateScrollToItem, int $index, int $scrollOffset) {
        if (forward == false) goto L14;
        if ($this_animateScrollToItem.getFirstVisibleItemIndex() <= $index) goto L8;
        return true;
    L8:
        if ($this_animateScrollToItem.getFirstVisibleItemIndex() == $index) goto L10;
        return false;
    L10:
        if ($this_animateScrollToItem.getFirstVisibleItemScrollOffset() > $scrollOffset) goto L23;
        return false;
    L23:
        return true;
    L14:
        if ($this_animateScrollToItem.getFirstVisibleItemIndex() >= $index) goto L17;
        return true;
    L17:
        if ($this_animateScrollToItem.getFirstVisibleItemIndex() == $index) goto L19;
        return false;
    L19:
        if ($this_animateScrollToItem.getFirstVisibleItemScrollOffset() < $scrollOffset) goto L25;
        return false;
    L25:
        return true;
    }
}
