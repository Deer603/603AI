package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: AnimateBoundsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J \u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u001a\u00101\u001a\u00020,2\u0006\u00102\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b3\u0010\u001aJ6\u00104\u001a\u00020,2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u0010'\u001a\u00020(2\u0006\u00109\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*J\u0018\u0010;\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b<\u0010\u001aR\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R/\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0016\u0010\u0014\u001a\u00020\u0004X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\"\u0010\u0015\u001a\u00020\u0016X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0005\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010 R\u000e\u0010!\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\u00020\u0004X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010#\u001a\u00020\u0016X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0013\u0010$\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006="}, d2 = {"Landroidx/compose/animation/BoundsTransformDeferredAnimation;", "", "()V", "additionalOffset", "Landroidx/compose/ui/geometry/Offset;", "J", "animatable", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/animation/core/AnimationVector4D;", "<set-?>", "animatedValue", "getAnimatedValue", "()Landroidx/compose/ui/geometry/Rect;", "setAnimatedValue", "(Landroidx/compose/ui/geometry/Rect;)V", "animatedValue$delegate", "Landroidx/compose/runtime/MutableState;", "currentBounds", "getCurrentBounds", "currentPosition", "currentSize", "Landroidx/compose/ui/geometry/Size;", "getCurrentSize-NH-jbRc", "()J", "setCurrentSize-uvyYCjk", "(J)V", "directManipulationParents", "", "Landroidx/compose/ui/layout/LayoutCoordinates;", "isIdle", "", "()Z", "isPending", "targetOffset", "targetSize", "value", "getValue", "animate", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "boundsTransform", "Landroidx/compose/animation/BoundsTransform;", "updateCurrentBounds", "", "position", "size", "updateCurrentBounds-tz77jQw", "(JJ)V", "updateTargetOffset", "offset", "updateTargetOffset-k-4lQ0M", "updateTargetOffsetAndAnimate", "lookaheadScope", "Landroidx/compose/ui/layout/LookaheadScope;", "placementScope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "directManipulationParentsDirty", "includeMotionFrameOfReference", "updateTargetSize", "updateTargetSize-uvyYCjk", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BoundsTransformDeferredAnimation {
    public static final int $stable = 0;
    private long additionalOffset;
    private Animatable<Rect, AnimationVector4D> animatable;
    private final MutableState animatedValue$delegate;
    private long currentPosition;
    private long currentSize;
    private List<LayoutCoordinates> directManipulationParents;
    private boolean isPending;
    private long targetOffset;
    private long targetSize;

    /* JADX INFO: renamed from: androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1, reason: invalid class name */
    /* JADX INFO: compiled from: AnimateBoundsModifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1", f = "AnimateBoundsModifier.kt", i = {}, l = {428}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Animatable<Rect, AnimationVector4D> $anim;
        final /* synthetic */ BoundsTransform $boundsTransform;
        final /* synthetic */ Rect $target;
        int label;
        final /* synthetic */ BoundsTransformDeferredAnimation this$0;

        AnonymousClass1(Animatable<Rect, AnimationVector4D> r2, Rect r3, BoundsTransform r4, BoundsTransformDeferredAnimation r5, Continuation<? super AnonymousClass1> r6) {
            this.$anim = r2;
            this.$target = r3;
            this.$boundsTransform = r4;
            this.this$0 = r5;
            super(2, r6);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
            return new AnonymousClass1(this.$anim, this.$target, this.$boundsTransform, this.this$0, r8);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
            Animatable<Rect, AnimationVector4D> r1 = this.$anim;
            Rect r2 = this.$target;
            BoundsTransform r3 = this.$boundsTransform;
            Rect r4 = this.this$0.getCurrentBounds();
            Intrinsics.checkNotNull(r4);
            this.label = 1;
            if (Animatable.animateTo$default(r1, r2, r3.transform(r4, this.$target), null, null, this, 12, null) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        $stable = 8;
    }

    public BoundsTransformDeferredAnimation() {
        this.targetSize = Size.Companion.m4202getUnspecifiedNHjbRc();
        this.targetOffset = Offset.Companion.m4140getUnspecifiedF1C5BW0();
        this.currentPosition = Offset.Companion.m4140getUnspecifiedF1C5BW0();
        this.currentSize = Size.Companion.m4202getUnspecifiedNHjbRc();
        this.animatedValue$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.additionalOffset = Offset.Companion.m4141getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: updateTargetSize-uvyYCjk, reason: not valid java name */
    public final void m71updateTargetSizeuvyYCjk(long size) {
        long $this$isSpecified$iv = this.targetSize;
        boolean r6 = false;
        if ($this$isSpecified$iv == InlineClassHelperKt.UnspecifiedPackedFloats) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L8;
    L10:
        this.targetSize = size;
        long $this$isUnspecified$iv = this.currentSize;
        if ($this$isUnspecified$iv != InlineClassHelperKt.UnspecifiedPackedFloats) goto L13;
        r6 = true;
    L13:
        if (r6 == false) goto L16;
        this.currentSize = size;
        return;
    L16:
        return;
    L8:
        if (IntSize.m7142equalsimpl0(IntSizeKt.m7152roundToIntSizeuvyYCjk(size), IntSizeKt.m7152roundToIntSizeuvyYCjk(this.targetSize)) == true) goto L10;
        this.isPending = true;
        goto L10
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: updateTargetOffset-k-4lQ0M, reason: not valid java name */
    private final void m67updateTargetOffsetk4lQ0M(long offset) {
        long $this$isSpecified$iv = this.targetOffset;
        boolean r6 = false;
        if (($this$isSpecified$iv & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L8;
    L10:
        this.targetOffset = offset;
        long $this$isUnspecified$iv = this.currentPosition;
        if ((9223372034707292159L & $this$isUnspecified$iv) != InlineClassHelperKt.UnspecifiedPackedFloats) goto L13;
        r6 = true;
    L13:
        if (r6 == false) goto L16;
        this.currentPosition = offset;
        return;
    L16:
        return;
    L8:
        if (IntOffset.m7100equalsimpl0(IntOffsetKt.m7118roundk4lQ0M(offset), IntOffsetKt.m7118roundk4lQ0M(this.targetOffset)) == true) goto L10;
        this.isPending = true;
        goto L10
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: getCurrentSize-NH-jbRc, reason: not valid java name */
    public final long m68getCurrentSizeNHjbRc() {
        return this.currentSize;
    }

    /* JADX INFO: renamed from: setCurrentSize-uvyYCjk, reason: not valid java name */
    public final void m69setCurrentSizeuvyYCjk(long r1) {
        this.currentSize = r1;
    }

    public final Rect getCurrentBounds() {
        long size = this.currentSize;
        long position = this.currentPosition;
        boolean r8 = true;
        if ((9223372034707292159L & position) == InlineClassHelperKt.UnspecifiedPackedFloats) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == true) goto L8;
    L13:
        return null;
    L8:
        if (size != InlineClassHelperKt.UnspecifiedPackedFloats) goto L11;
        r8 = false;
    L11:
        if (r8 == false) goto L13;
        return RectKt.m4165Recttz77jQw(position, size);
    L5:
        r4 = false;
        goto L6
    }

    /* JADX INFO: renamed from: updateCurrentBounds-tz77jQw, reason: not valid java name */
    public final void m70updateCurrentBoundstz77jQw(long position, long size) {
        this.currentPosition = position;
        this.currentSize = size;
    }

    public final boolean isIdle() {
        if (this.isPending == true) goto L13;
        Animatable<Rect, AnimationVector4D> r0 = this.animatable;
        if (r0 != null) goto L7;
    L9:
        boolean r1 = false;
    L10:
        if (r1 == false) goto L12;
        return false;
    L12:
        return true;
    L7:
        if (r0.isRunning() != true) goto L9;
        r1 = true;
        goto L10
    L13:
        return false;
    }

    private final Rect getAnimatedValue() {
        State $this$getValue$iv = this.animatedValue$delegate;
        return (Rect) $this$getValue$iv.getValue();
    }

    private final void setAnimatedValue(Rect r4) {
        MutableState $this$setValue$iv = this.animatedValue$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final Rect getValue() {
        if (isIdle() == false) goto L6;
        return null;
    L6:
        return getAnimatedValue();
    }

    public final void updateTargetOffsetAndAnimate(LookaheadScope lookaheadScope, Placeable.PlacementScope placementScope, CoroutineScope coroutineScope, boolean directManipulationParentsDirty, boolean includeMotionFrameOfReference, BoundsTransform boundsTransform) {
        LayoutCoordinates coordinates = placementScope.getCoordinates();
        if (coordinates == null) goto L36;
        LayoutCoordinates lookaheadScopeCoordinates = lookaheadScope.getLookaheadScopeCoordinates(placementScope);
        long delta = Offset.Companion.m4141getZeroF1C5BW0();
        if (includeMotionFrameOfReference == true) goto L32;
        if (directManipulationParentsDirty == false) goto L32;
        ArrayList r7 = this.directManipulationParents;
        if (r7 != null) goto L10;
        r7 = new ArrayList();
    L10:
        LayoutCoordinates currentCoords = coordinates;
        int index = 0;
    L12:
        if (Intrinsics.areEqual(lookaheadScope.toLookaheadCoordinates(currentCoords), lookaheadScopeCoordinates) == true) goto L26;
        if (currentCoords.getIntroducesMotionFrameOfReference() == true) goto L16;
    L22:
        LayoutCoordinates r12 = currentCoords.getParentCoordinates();
        if (r12 == null) goto L26;
        currentCoords = r12;
        goto L12
    L16:
        if (r7.size() != index) goto L19;
        r7.add(currentCoords);
        delta = Offset.m4130plusMKHz9U(delta, LayoutCoordinatesKt.positionInParent(currentCoords));
    L21:
        index = index + 1;
        goto L22
    L19:
        if (Intrinsics.areEqual(r7.get(index), currentCoords) == true) goto L21;
        long delta2 = Offset.m4129minusMKHz9U(delta, LayoutCoordinatesKt.positionInParent(r7.get(index)));
        r7.set(index, currentCoords);
        delta = Offset.m4130plusMKHz9U(delta2, LayoutCoordinatesKt.positionInParent(currentCoords));
    L26:
        int i = r7.size() - 1;
        if (index > i) goto L31;
    L28:
        delta = Offset.m4129minusMKHz9U(delta, LayoutCoordinatesKt.positionInParent(r7.get(i)));
        r7.remove(r7.size() - 1);
        if (i == index) goto L31;
        i = i - 1;
    L31:
        this.directManipulationParents = r7;
        long delta3 = delta;
    L33:
        this.additionalOffset = Offset.m4130plusMKHz9U(this.additionalOffset, delta3);
        long targetOffset = LookaheadScope.m5742localLookaheadPositionOfauaQtc$default(lookaheadScope, lookaheadScopeCoordinates, coordinates, 0, includeMotionFrameOfReference, 2, null);
        m67updateTargetOffsetk4lQ0M(Offset.m4130plusMKHz9U(targetOffset, this.additionalOffset));
        Rect r9 = animate(coroutineScope, boundsTransform);
        long arg0$iv = this.additionalOffset;
        setAnimatedValue(r9.m4162translatek4lQ0M(Offset.m4117constructorimpl(arg0$iv ^ (-9223372034707292160L))));
        return;
    L32:
        delta3 = delta;
        goto L33
    }

    private final Rect animate(CoroutineScope coroutineScope, BoundsTransform boundsTransform) {
        long $this$isSpecified$iv = this.targetOffset;
        boolean r5 = true;
        if ((9223372034707292159L & $this$isSpecified$iv) == InlineClassHelperKt.UnspecifiedPackedFloats) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L19;
        long $this$isSpecified$iv2 = this.targetSize;
        if ($this$isSpecified$iv2 != InlineClassHelperKt.UnspecifiedPackedFloats) goto L11;
        r5 = false;
    L11:
        if (r5 == false) goto L19;
        Rect target = RectKt.m4165Recttz77jQw(this.targetOffset, this.targetSize);
        Animatable<Rect, AnimationVector4D> r1 = this.animatable;
        if (r1 != null) goto L15;
        Animatable<Rect, AnimationVector4D> r2 = new Animatable(target, VectorConvertersKt.getVectorConverter(Rect.Companion), null, null, 12, null);
    L16:
        this.animatable = r2;
        if (this.isPending == false) goto L19;
        this.isPending = false;
        BuildersKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(r2, target, boundsTransform, this, null), 1, null);
        goto L19
    L15:
        r2 = r1;
    L19:
        Animatable<Rect, AnimationVector4D> r3 = this.animatable;
        if (r3 == null) goto L24;
        Rect r4 = r3.getValue();
        if (r4 == null) goto L24;
        return r4;
    L24:
        return Rect.Companion.getZero();
    L5:
        r0 = false;
        goto L6
    }
}
