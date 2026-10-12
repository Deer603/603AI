package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BoundsAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bR\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\tJ,\u00106\u001a\u0002032\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bR\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000b\u001a\u00020\fRW\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bR\b\u0012\u0004\u0012\u00020\u00060\u00052\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bR\b\u0012\u0004\u0012\u00020\u00060\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR;\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0014\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0014\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0011\u0010'\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010/\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00067"}, d2 = {"Landroidx/compose/animation/BoundsAnimation;", "", "transitionScope", "Landroidx/compose/animation/SharedTransitionScope;", "transition", "Landroidx/compose/animation/core/Transition;", "", "animation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/animation/core/AnimationVector4D;", "boundsTransform", "Landroidx/compose/animation/BoundsTransform;", "(Landroidx/compose/animation/SharedTransitionScope;Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/BoundsTransform;)V", "<set-?>", "getAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "setAnimation", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", "animation$delegate", "Landroidx/compose/runtime/MutableState;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "setAnimationSpec", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "Landroidx/compose/runtime/State;", "animationState", "getAnimationState", "()Landroidx/compose/runtime/State;", "setAnimationState", "(Landroidx/compose/runtime/State;)V", "animationState$delegate", "getBoundsTransform", "()Landroidx/compose/animation/BoundsTransform;", "setBoundsTransform", "(Landroidx/compose/animation/BoundsTransform;)V", "boundsTransform$delegate", "isRunning", "()Z", "target", "getTarget", "getTransition", "()Landroidx/compose/animation/core/Transition;", "getTransitionScope", "()Landroidx/compose/animation/SharedTransitionScope;", "value", "getValue", "()Landroidx/compose/ui/geometry/Rect;", "animate", "", "currentBounds", "targetBounds", "updateAnimation", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BoundsAnimation {
    public static final int $stable = 0;
    private final MutableState animation$delegate;
    private FiniteAnimationSpec<Rect> animationSpec;
    private final MutableState animationState$delegate;
    private final MutableState boundsTransform$delegate;
    private final Transition<Boolean> transition;
    private final SharedTransitionScope transitionScope;

    static {
        $stable = 8;
    }

    public BoundsAnimation(SharedTransitionScope transitionScope, Transition<Boolean> r5, Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> r6, BoundsTransform boundsTransform) {
        this.transitionScope = transitionScope;
        this.transition = r5;
        this.animation$delegate = SnapshotStateKt.mutableStateOf$default(r6, null, 2, null);
        this.boundsTransform$delegate = SnapshotStateKt.mutableStateOf$default(boundsTransform, null, 2, null);
        this.animationSpec = BoundsAnimationKt.access$getDefaultBoundsAnimation$p();
        this.animationState$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public final SharedTransitionScope getTransitionScope() {
        return this.transitionScope;
    }

    public final Transition<Boolean> getTransition() {
        return this.transition;
    }

    private final void setAnimation(Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> r4) {
        MutableState $this$setValue$iv = this.animation$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> getAnimation() {
        State $this$getValue$iv = this.animation$delegate;
        return (Transition.DeferredAnimation) $this$getValue$iv.getValue();
    }

    public final void updateAnimation(Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> r2, BoundsTransform boundsTransform) {
        if (Intrinsics.areEqual(getAnimation(), r2) == true) goto L5;
        setAnimation(r2);
        setAnimationState(null);
        this.animationSpec = BoundsAnimationKt.access$getDefaultBoundsAnimation$p();
    L5:
        setBoundsTransform(boundsTransform);
    }

    private final BoundsTransform getBoundsTransform() {
        State $this$getValue$iv = this.boundsTransform$delegate;
        return (BoundsTransform) $this$getValue$iv.getValue();
    }

    private final void setBoundsTransform(BoundsTransform r4) {
        MutableState $this$setValue$iv = this.boundsTransform$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final boolean isRunning() {
        Transition<?> r0 = this.transition;
    L4:
        if (r0.getParentTransition() == null) goto L7;
        Transition<?> r1 = r0.getParentTransition();
        Intrinsics.checkNotNull(r1);
        r0 = r1;
        goto L4
    L7:
        return !Intrinsics.areEqual(r0.getCurrentState(), r0.getTargetState());
    }

    public final FiniteAnimationSpec<Rect> getAnimationSpec() {
        return this.animationSpec;
    }

    public final void setAnimationSpec(FiniteAnimationSpec<Rect> r1) {
        this.animationSpec = r1;
    }

    public final State<Rect> getAnimationState() {
        State $this$getValue$iv = this.animationState$delegate;
        return (State) $this$getValue$iv.getValue();
    }

    public final void setAnimationState(State<Rect> r4) {
        MutableState $this$setValue$iv = this.animationState$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final Rect getValue() {
        if (this.transitionScope.isTransitionActive() == false) goto L10;
        State<Rect> r0 = getAnimationState();
        if (r0 != null) goto L9;
        return null;
    L9:
        return r0.getValue();
    L10:
        return null;
    }

    public final void animate(final Rect currentBounds, final Rect targetBounds) {
        if (this.transitionScope.isTransitionActive() == true) goto L5;
        return;
    L5:
        if (getAnimationState() != null) goto L7;
        this.animationSpec = getBoundsTransform().transform(currentBounds, targetBounds);
    L7:
        setAnimationState(getAnimation().animate(new AnonymousClass1(this), new AnonymousClass2(this, targetBounds, currentBounds)));
    }

    public final boolean getTarget() {
        return this.transition.getTargetState().booleanValue();
    }
}
