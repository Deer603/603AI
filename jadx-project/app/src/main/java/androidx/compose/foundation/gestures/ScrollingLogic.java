package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0089\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001a*\u0001\u0018\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0002\u0010\u0010J\u001a\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u001eH\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0086@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0006\u0010.\u001a\u00020\u000bJ#\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020*2\u0006\u00102\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0018\u00105\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u001eø\u0001\u0000¢\u0006\u0004\b6\u0010(JA\u0010&\u001a\u0002002\b\b\u0002\u00107\u001a\u0002082'\u00109\u001a#\b\u0001\u0012\u0004\u0012\u00020;\u0012\n\u0012\b\u0012\u0004\u0012\u0002000<\u0012\u0006\u0012\u0004\u0018\u00010\u00010:¢\u0006\u0002\b=H\u0086@¢\u0006\u0002\u0010>J\u0010\u0010?\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020AH\u0002J\u0006\u0010B\u001a\u00020\u000bJ8\u0010C\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rJ&\u0010D\u001a\u00020\u001e*\u00020\u001b2\u0006\u0010E\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u0014\u0010I\u001a\u00020\u001e*\u00020\u001eø\u0001\u0000¢\u0006\u0004\bJ\u0010(J\n\u0010I\u001a\u00020A*\u00020AJ\u0014\u0010K\u001a\u00020\u001e*\u00020\u001eø\u0001\u0000¢\u0006\u0004\bL\u0010(J\u0016\u0010M\u001a\u00020**\u00020*H\u0002ø\u0001\u0000¢\u0006\u0004\bN\u0010(J\u0014\u0010O\u001a\u00020A*\u00020\u001eø\u0001\u0000¢\u0006\u0004\bP\u0010QJ\u0016\u0010O\u001a\u00020A*\u00020*H\u0002ø\u0001\u0000¢\u0006\u0004\bR\u0010QJ\u0017\u0010S\u001a\u00020\u001e*\u00020Aø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00020**\u00020Aø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bW\u0010UJ\u001e\u0010C\u001a\u00020**\u00020*2\u0006\u0010X\u001a\u00020AH\u0002ø\u0001\u0000¢\u0006\u0004\bY\u0010ZR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u00020\u0015X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0019R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006["}, d2 = {"Landroidx/compose/foundation/gestures/ScrollingLogic;", "", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "reverseDirection", "", "nestedScrollDispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "isScrollableNodeAttached", "Lkotlin/Function0;", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Lkotlin/jvm/functions/Function0;)V", "<set-?>", "isFlinging", "()Z", "latestScrollSource", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "I", "nestedScrollScope", "androidx/compose/foundation/gestures/ScrollingLogic$nestedScrollScope$1", "Landroidx/compose/foundation/gestures/ScrollingLogic$nestedScrollScope$1;", "outerStateScope", "Landroidx/compose/foundation/gestures/ScrollScope;", "performScrollForOverscroll", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "getScrollableState", "()Landroidx/compose/foundation/gestures/ScrollableState;", "setScrollableState", "(Landroidx/compose/foundation/gestures/ScrollableState;)V", "shouldDispatchOverscroll", "getShouldDispatchOverscroll", "dispatchRawDelta", "scroll", "dispatchRawDelta-MK-Hz9U", "(J)J", "doFlingAnimation", "Landroidx/compose/ui/unit/Velocity;", "available", "doFlingAnimation-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isVertical", "onScrollStopped", "", "initialVelocity", "isMouseWheel", "onScrollStopped-BMRW4eQ", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performRawScroll", "performRawScroll-MK-Hz9U", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/NestedScrollScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldCancelFling", "pixels", "", "shouldScrollImmediately", "update", "performScroll", "delta", "source", "performScroll-3eAAhYA", "(Landroidx/compose/foundation/gestures/ScrollScope;JI)J", "reverseIfNeeded", "reverseIfNeeded-MK-Hz9U", "singleAxisOffset", "singleAxisOffset-MK-Hz9U", "singleAxisVelocity", "singleAxisVelocity-AH228Gc", "toFloat", "toFloat-k-4lQ0M", "(J)F", "toFloat-TH1AsA0", "toOffset", "toOffset-tuRUvjQ", "(F)J", "toVelocity", "toVelocity-adjELrA", "newValue", "update-QWom1Mo", "(JF)J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ScrollingLogic {
    public static final int $stable = 0;
    private FlingBehavior flingBehavior;
    private boolean isFlinging;
    private final Function0<Boolean> isScrollableNodeAttached;
    private int latestScrollSource;
    private NestedScrollDispatcher nestedScrollDispatcher;
    private final ScrollingLogic$nestedScrollScope$1 nestedScrollScope;
    private Orientation orientation;
    private ScrollScope outerStateScope;
    private OverscrollEffect overscrollEffect;
    private final Function1<Offset, Offset> performScrollForOverscroll;
    private boolean reverseDirection;
    private ScrollableState scrollableState;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollingLogic$scroll$2, reason: invalid class name */
    /* JADX INFO: compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", f = "Scrollable.kt", i = {}, l = {834}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<NestedScrollScope, Continuation<? super Unit>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ScrollingLogic this$0;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(ScrollingLogic r2, Function2<? super NestedScrollScope, ? super Continuation<? super Unit>, ? extends Object> r3, Continuation<? super AnonymousClass2> r4) {
            this.this$0 = r2;
            this.$block = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            AnonymousClass2 r0 = new AnonymousClass2(this.this$0, this.$block, r5);
            r0.L$0 = r4;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(ScrollScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ScrollScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L11:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            ScrollScope $this$scroll = (ScrollScope) this.L$0;
            ScrollingLogic.access$setOuterStateScope$p(this.this$0, $this$scroll);
            Function2<NestedScrollScope, Continuation<? super Unit>, Object> r1 = this.$block;
            ScrollingLogic$nestedScrollScope$1 r2 = ScrollingLogic.access$getNestedScrollScope$p(this.this$0);
            this.label = 1;
            if (r1.invoke(r2, this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        $stable = 8;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1] */
    public ScrollingLogic(ScrollableState scrollableState, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, Orientation orientation, boolean reverseDirection, NestedScrollDispatcher nestedScrollDispatcher, Function0<Boolean> r8) {
        this.scrollableState = scrollableState;
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        this.orientation = orientation;
        this.reverseDirection = reverseDirection;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.isScrollableNodeAttached = r8;
        this.latestScrollSource = NestedScrollSource.Companion.m5482getUserInputWNlRxjI();
        this.outerStateScope = ScrollableKt.access$getNoOpScrollScope$p();
        this.nestedScrollScope = new ScrollingLogic$nestedScrollScope$1(this);
        this.performScrollForOverscroll = new ScrollingLogic$performScrollForOverscroll$1(this);
    }

    public static final /* synthetic */ FlingBehavior access$getFlingBehavior$p(ScrollingLogic $this) {
        return $this.flingBehavior;
    }

    public static final /* synthetic */ int access$getLatestScrollSource$p(ScrollingLogic $this) {
        return $this.latestScrollSource;
    }

    public static final /* synthetic */ NestedScrollDispatcher access$getNestedScrollDispatcher$p(ScrollingLogic $this) {
        return $this.nestedScrollDispatcher;
    }

    public static final /* synthetic */ ScrollingLogic$nestedScrollScope$1 access$getNestedScrollScope$p(ScrollingLogic $this) {
        return $this.nestedScrollScope;
    }

    public static final /* synthetic */ ScrollScope access$getOuterStateScope$p(ScrollingLogic $this) {
        return $this.outerStateScope;
    }

    public static final /* synthetic */ OverscrollEffect access$getOverscrollEffect$p(ScrollingLogic $this) {
        return $this.overscrollEffect;
    }

    public static final /* synthetic */ Function1 access$getPerformScrollForOverscroll$p(ScrollingLogic $this) {
        return $this.performScrollForOverscroll;
    }

    public static final /* synthetic */ boolean access$getShouldDispatchOverscroll(ScrollingLogic $this) {
        return $this.getShouldDispatchOverscroll();
    }

    /* JADX INFO: renamed from: access$performScroll-3eAAhYA, reason: not valid java name */
    public static final /* synthetic */ long m501access$performScroll3eAAhYA(ScrollingLogic $this, ScrollScope $receiver, long delta, int source) {
        return $this.m505performScroll3eAAhYA($receiver, delta, source);
    }

    public static final /* synthetic */ void access$setLatestScrollSource$p(ScrollingLogic $this, int r1) {
        $this.latestScrollSource = r1;
    }

    public static final /* synthetic */ void access$setOuterStateScope$p(ScrollingLogic $this, ScrollScope r1) {
        $this.outerStateScope = r1;
    }

    public static final /* synthetic */ boolean access$shouldCancelFling(ScrollingLogic $this, float pixels) {
        return $this.shouldCancelFling(pixels);
    }

    /* JADX INFO: renamed from: access$toFloat-TH1AsA0, reason: not valid java name */
    public static final /* synthetic */ float m502access$toFloatTH1AsA0(ScrollingLogic $this, long $receiver) {
        return $this.m507toFloatTH1AsA0($receiver);
    }

    /* JADX INFO: renamed from: access$update-QWom1Mo, reason: not valid java name */
    public static final /* synthetic */ long m503access$updateQWom1Mo(ScrollingLogic $this, long $receiver, float newValue) {
        return $this.m508updateQWom1Mo($receiver, newValue);
    }

    public final ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    public final void setScrollableState(ScrollableState r1) {
        this.scrollableState = r1;
    }

    public final boolean isFlinging() {
        return this.isFlinging;
    }

    /* JADX INFO: renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m515toOffsettuRUvjQ(float $this$toOffset_u2dtuRUvjQ) {
        if ($this$toOffset_u2dtuRUvjQ != 0.0f) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L9;
        return Offset.Companion.m4141getZeroF1C5BW0();
    L9:
        if (this.orientation != Orientation.Horizontal) goto L11;
        long v1$iv$iv = Float.floatToRawIntBits($this$toOffset_u2dtuRUvjQ);
        long v2$iv$iv = Float.floatToRawIntBits(0.0f);
        return Offset.m4117constructorimpl((4294967295L & v2$iv$iv) | (v1$iv$iv << 32));
    L11:
        long v1$iv$iv2 = Float.floatToRawIntBits(0.0f);
        long v2$iv$iv2 = Float.floatToRawIntBits($this$toOffset_u2dtuRUvjQ);
        return Offset.m4117constructorimpl((4294967295L & v2$iv$iv2) | (v1$iv$iv2 << 32));
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: singleAxisOffset-MK-Hz9U, reason: not valid java name */
    public final long m513singleAxisOffsetMKHz9U(long $this$singleAxisOffset_u2dMK_u2dHz9U) {
        if (this.orientation != Orientation.Horizontal) goto L6;
        return Offset.m4119copydBAh8RU$default($this$singleAxisOffset_u2dMK_u2dHz9U, 0.0f, 0.0f, 1, null);
    L6:
        return Offset.m4119copydBAh8RU$default($this$singleAxisOffset_u2dMK_u2dHz9U, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m514toFloatk4lQ0M(long $this$toFloat_u2dk_u2d4lQ0M) {
        if (this.orientation != Orientation.Horizontal) goto L5;
        int bits$iv$iv$iv = (int) ($this$toFloat_u2dk_u2d4lQ0M >> 32);
        return Float.intBitsToFloat(bits$iv$iv$iv);
    L5:
        int bits$iv$iv$iv2 = (int) (4294967295L & $this$toFloat_u2dk_u2d4lQ0M);
        return Float.intBitsToFloat(bits$iv$iv$iv2);
    }

    /* JADX INFO: renamed from: toVelocity-adjELrA, reason: not valid java name */
    public final long m516toVelocityadjELrA(float $this$toVelocity_u2dadjELrA) {
        if ($this$toVelocity_u2dadjELrA != 0.0f) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L9;
        return Velocity.Companion.m7222getZero9UxMQ8M();
    L9:
        if (this.orientation != Orientation.Horizontal) goto L12;
        return VelocityKt.Velocity($this$toVelocity_u2dadjELrA, 0.0f);
    L12:
        return VelocityKt.Velocity(0.0f, $this$toVelocity_u2dadjELrA);
    L5:
        r1 = false;
        goto L6
    }

    /* JADX INFO: renamed from: toFloat-TH1AsA0, reason: not valid java name */
    private final float m507toFloatTH1AsA0(long $this$toFloat_u2dTH1AsA0) {
        if (this.orientation != Orientation.Horizontal) goto L6;
        return Velocity.m7211getXimpl($this$toFloat_u2dTH1AsA0);
    L6:
        return Velocity.m7212getYimpl($this$toFloat_u2dTH1AsA0);
    }

    /* JADX INFO: renamed from: singleAxisVelocity-AH228Gc, reason: not valid java name */
    private final long m506singleAxisVelocityAH228Gc(long $this$singleAxisVelocity_u2dAH228Gc) {
        if (this.orientation != Orientation.Horizontal) goto L6;
        return Velocity.m7207copyOhffZ5M$default($this$singleAxisVelocity_u2dAH228Gc, 0.0f, 0.0f, 1, null);
    L6:
        return Velocity.m7207copyOhffZ5M$default($this$singleAxisVelocity_u2dAH228Gc, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: renamed from: update-QWom1Mo, reason: not valid java name */
    private final long m508updateQWom1Mo(long $this$update_u2dQWom1Mo, float newValue) {
        if (this.orientation != Orientation.Horizontal) goto L6;
        return Velocity.m7207copyOhffZ5M$default($this$update_u2dQWom1Mo, newValue, 0.0f, 2, null);
    L6:
        return Velocity.m7207copyOhffZ5M$default($this$update_u2dQWom1Mo, 0.0f, newValue, 1, null);
    }

    public final float reverseIfNeeded(float $this$reverseIfNeeded) {
        if (this.reverseDirection == false) goto L6;
        return (-1.0f) * $this$reverseIfNeeded;
    L6:
        return $this$reverseIfNeeded;
    }

    /* JADX INFO: renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m512reverseIfNeededMKHz9U(long $this$reverseIfNeeded_u2dMK_u2dHz9U) {
        if (this.reverseDirection == false) goto L6;
        return Offset.m4132timestuRUvjQ($this$reverseIfNeeded_u2dMK_u2dHz9U, -1.0f);
    L6:
        return $this$reverseIfNeeded_u2dMK_u2dHz9U;
    }

    /* JADX INFO: renamed from: performScroll-3eAAhYA, reason: not valid java name */
    private final long m505performScroll3eAAhYA(ScrollScope $this$performScroll_u2d3eAAhYA, long delta, int source) {
        long consumedByPreScroll = this.nestedScrollDispatcher.m5466dispatchPreScrollOzD1aCk(delta, source);
        long scrollAvailableAfterPreScroll = Offset.m4129minusMKHz9U(delta, consumedByPreScroll);
        float singleAxisDeltaForSelfScroll = m514toFloatk4lQ0M(m512reverseIfNeededMKHz9U(m513singleAxisOffsetMKHz9U(scrollAvailableAfterPreScroll)));
        long consumedBySelfScroll = m512reverseIfNeededMKHz9U(m515toOffsettuRUvjQ($this$performScroll_u2d3eAAhYA.scrollBy(singleAxisDeltaForSelfScroll)));
        long deltaAvailableAfterScroll = Offset.m4129minusMKHz9U(scrollAvailableAfterPreScroll, consumedBySelfScroll);
        long consumedByPostScroll = this.nestedScrollDispatcher.m5464dispatchPostScrollDzOQY0M(consumedBySelfScroll, deltaAvailableAfterScroll, source);
        return Offset.m4130plusMKHz9U(Offset.m4130plusMKHz9U(consumedByPreScroll, consumedBySelfScroll), consumedByPostScroll);
    }

    private final boolean getShouldDispatchOverscroll() {
        if (this.scrollableState.getCanScrollForward() == false) goto L5;
    L8:
        return true;
    L5:
        if (this.scrollableState.getCanScrollBackward() == true) goto L8;
        return false;
    }

    /* JADX INFO: renamed from: performRawScroll-MK-Hz9U, reason: not valid java name */
    public final long m511performRawScrollMKHz9U(long scroll) {
        if (this.scrollableState.isScrollInProgress() == false) goto L6;
        return Offset.Companion.m4141getZeroF1C5BW0();
    L6:
        return m504dispatchRawDeltaMKHz9U(scroll);
    }

    /* JADX INFO: renamed from: dispatchRawDelta-MK-Hz9U, reason: not valid java name */
    private final long m504dispatchRawDeltaMKHz9U(long scroll) {
        return m515toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m514toFloatk4lQ0M(scroll)))));
    }

    /* JADX INFO: renamed from: onScrollStopped-BMRW4eQ, reason: not valid java name */
    public final Object m510onScrollStoppedBMRW4eQ(long initialVelocity, boolean isMouseWheel, Continuation<? super Unit> r10) {
        if (isMouseWheel == true) goto L4;
    L7:
        long availableVelocity = m506singleAxisVelocityAH228Gc(initialVelocity);
        Function2 performFling = new ScrollingLogic$onScrollStopped$performFling$1(this, null);
        OverscrollEffect overscroll = this.overscrollEffect;
        if (overscroll != null) goto L10;
    L16:
        Object r4 = performFling.invoke(Velocity.m7202boximpl(availableVelocity), r10);
        if (r4 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L20;
        return r4;
    L20:
        return Unit.INSTANCE;
    L10:
        if (getShouldDispatchOverscroll() == false) goto L16;
        Object r5 = overscroll.mo212applyToFlingBMRW4eQ(availableVelocity, performFling, r10);
        if (r5 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L15;
        return r5;
    L15:
        return Unit.INSTANCE;
    L4:
        if (ScrollableKt.access$getShouldBeTriggeredByMouseWheel(this.flingBehavior) == true) goto L7;
        return Unit.INSTANCE;
    }

    private final boolean shouldCancelFling(float pixels) {
        if (pixels <= 0.0f) goto L7;
        if (this.scrollableState.getCanScrollForward() == true) goto L7;
    L12:
        return true;
    L7:
        if (pixels >= 0.0f) goto L11;
        if (this.scrollableState.getCanScrollBackward() == false) goto L12;
    L11:
        if (this.isScrollableNodeAttached.invoke().booleanValue() == false) goto L12;
        return false;
    }

    /* JADX INFO: renamed from: doFlingAnimation-QWom1Mo, reason: not valid java name */
    public final Object m509doFlingAnimationQWom1Mo(long available, Continuation<? super Velocity> r12) {
        if ((r12 instanceof ScrollingLogic$doFlingAnimation$1) == false) goto L7;
        ScrollingLogic$doFlingAnimation$1 r0 = (ScrollingLogic$doFlingAnimation$1) r12;
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
        Ref.LongRef result = (Ref.LongRef) r0.L$1;
        ScrollingLogic r11 = (ScrollingLogic) r0.L$0;
        ResultKt.throwOnFailure($result);
    L17:
        r11.isFlinging = false;
        return Velocity.m7202boximpl(result.element);
    L13:
        ResultKt.throwOnFailure($result);
        Ref.LongRef result2 = new Ref.LongRef();
        result2.element = available;
        this.isFlinging = true;
        MutatePriority r13 = MutatePriority.Default;
        ScrollingLogic$doFlingAnimation$2 r3 = new ScrollingLogic$doFlingAnimation$2(this, result2, available, null);
        r0.L$0 = this;
        r0.L$1 = result2;
        r0.label = 1;
        if (scroll(r13, r3, r0) != r2) goto L16;
        return r2;
    L16:
        r11 = this;
        result = result2;
        goto L17
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new ScrollingLogic$doFlingAnimation$1(this, r12);
        goto L8
    }

    public final boolean shouldScrollImmediately() {
        if (this.scrollableState.isScrollInProgress() == true) goto L9;
        OverscrollEffect r0 = this.overscrollEffect;
        if (r0 == null) goto L7;
        boolean r1 = r0.isInProgress();
    L8:
        if (r1 == true) goto L9;
        return false;
    L7:
        r1 = false;
    L9:
        return true;
    }

    public static /* synthetic */ Object scroll$default(ScrollingLogic r0, MutatePriority r1, Function2 r2, Continuation r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = MutatePriority.Default;
    L6:
        return r0.scroll(r1, r2, r3);
    }

    public final Object scroll(MutatePriority scrollPriority, Function2<? super NestedScrollScope, ? super Continuation<? super Unit>, ? extends Object> r5, Continuation<? super Unit> r6) {
        Object r0 = this.scrollableState.scroll(scrollPriority, new AnonymousClass2(this, r5, null), r6);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    public final boolean update(ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean reverseDirection, FlingBehavior flingBehavior, NestedScrollDispatcher nestedScrollDispatcher) {
        boolean resetPointerInputHandling = false;
        if (Intrinsics.areEqual(this.scrollableState, scrollableState) == true) goto L5;
        this.scrollableState = scrollableState;
        resetPointerInputHandling = true;
    L5:
        this.overscrollEffect = overscrollEffect;
        if (this.orientation == orientation) goto L9;
        this.orientation = orientation;
        resetPointerInputHandling = true;
    L9:
        if (this.reverseDirection == reverseDirection) goto L11;
        this.reverseDirection = reverseDirection;
        resetPointerInputHandling = true;
    L11:
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        return resetPointerInputHandling;
    }

    public final boolean isVertical() {
        if (this.orientation != Orientation.Vertical) goto L5;
        return true;
    L5:
        return false;
    }
}
