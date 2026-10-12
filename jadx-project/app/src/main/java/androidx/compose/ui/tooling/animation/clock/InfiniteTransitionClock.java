package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.tooling.animation.InfiniteTransitionComposeAnimation;
import androidx.compose.ui.tooling.animation.states.ComposeAnimationState;
import androidx.compose.ui.tooling.animation.states.TargetState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InfiniteTransitionClock.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00122\u0006\u0010\u0018\u001a\u00020\bH\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\bH\u0016J\u001a\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u0016J,\u0010\u001f\u001a\u00020\b\"\u0004\b\u0000\u0010 \"\b\b\u0001\u0010!*\u00020\"*\u0012\u0012\u0004\u0012\u0002H \u0012\u0004\u0012\u0002H!0#R\u00020$H\u0002R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006%"}, d2 = {"Landroidx/compose/ui/tooling/animation/clock/InfiniteTransitionClock;", "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "Landroidx/compose/ui/tooling/animation/states/TargetState;", "", "animation", "maxDuration", "Lkotlin/Function0;", "", "(Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;Lkotlin/jvm/functions/Function0;)V", "getAnimation", "()Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "state", "getState", "()Landroidx/compose/ui/tooling/animation/states/TargetState;", "setState", "(Landroidx/compose/ui/tooling/animation/states/TargetState;)V", "getAnimatedProperties", "", "Landroidx/compose/animation/tooling/ComposeAnimatedProperty;", "getMaxDuration", "getMaxDurationPerIteration", "getTransitions", "Landroidx/compose/animation/tooling/TransitionInfo;", "stepMillis", "setClockTime", "", "animationTimeNanos", "setStateParameters", "par1", "par2", "getIterationDuration", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", "Landroidx/compose/animation/core/InfiniteTransition;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InfiniteTransitionClock implements ComposeAnimationClock<InfiniteTransitionComposeAnimation, TargetState<Object>> {
    public static final int $stable = 0;
    private final InfiniteTransitionComposeAnimation animation;
    private final Function0<Long> maxDuration;
    private TargetState<Object> state;

    static {
        $stable = 8;
    }

    public InfiniteTransitionClock(InfiniteTransitionComposeAnimation animation, Function0<Long> r4) {
        this.animation = animation;
        this.maxDuration = r4;
        this.state = new TargetState(0, 0);
    }

    public /* synthetic */ InfiniteTransitionClock(InfiniteTransitionComposeAnimation r1, AnonymousClass1 r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = AnonymousClass1.INSTANCE;
    L5:
        this(r1, r2);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public /* bridge */ /* synthetic */ ComposeAnimation getAnimation() {
        return getAnimation();
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public /* bridge */ /* synthetic */ ComposeAnimationState getState() {
        return getState();
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public /* bridge */ /* synthetic */ void setState(ComposeAnimationState r2) {
        setState((TargetState) r2);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public InfiniteTransitionComposeAnimation getAnimation() {
        return this.animation;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public TargetState<Object> getState() {
        return this.state;
    }

    public void setState(TargetState<Object> r1) {
        this.state = r1;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setStateParameters(Object par1, Object par2) {
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public List<ComposeAnimatedProperty> getAnimatedProperties() {
        Iterable $this$mapNotNull$iv = getAnimation().getAnimationObject().getAnimations();
        Collection destination$iv$iv = new ArrayList();
        Iterator r7 = $this$mapNotNull$iv.iterator();
    L4:
        if (r7.hasNext() == false) goto L12;
        Object element$iv$iv$iv = r7.next();
        InfiniteTransition.TransitionAnimationState it = (InfiniteTransition.TransitionAnimationState) element$iv$iv$iv;
        Object value = it.getValue();
        if (value != null) goto L8;
        ComposeAnimatedProperty r14 = null;
    L9:
        if (r14 == null) goto L4;
        destination$iv$iv.add(r14);
        goto L4
    L8:
        r14 = new ComposeAnimatedProperty(it.getLabel(), value);
        goto L9
    L12:
        Iterable $this$filter$iv = (List) destination$iv$iv;
        Collection destination$iv$iv2 = new ArrayList();
        Iterator r5 = $this$filter$iv.iterator();
    L14:
        if (r5.hasNext() == false) goto L19;
        Object element$iv$iv = r5.next();
        if (Utils_androidKt.getIGNORE_TRANSITIONS().contains(((ComposeAnimatedProperty) element$iv$iv).getLabel()) == true) goto L14;
        destination$iv$iv2.add(element$iv$iv);
        goto L14
    L19:
        return (List) destination$iv$iv2;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDurationPerIteration() {
        Iterator<T> r0 = getAnimation().getAnimationObject().getAnimations().iterator();
        if (r0.hasNext() == true) goto L5;
        Long r1 = null;
    L12:
        Long r2 = r1;
        if (r2 == null) goto L15;
        long r3 = r2.longValue();
    L17:
        return Utils_androidKt.nanosToMillis(r3);
    L15:
        r3 = 0;
        goto L17
    L5:
        InfiniteTransition.TransitionAnimationState it = (InfiniteTransition.TransitionAnimationState) r0.next();
        Long r4 = Long.valueOf(getIterationDuration(it));
    L7:
        if (r0.hasNext() == false) goto L11;
        InfiniteTransition.TransitionAnimationState it2 = (InfiniteTransition.TransitionAnimationState) r0.next();
        Long r5 = Long.valueOf(getIterationDuration(it2));
        if (r4.compareTo(r5) >= 0) goto L7;
        r4 = r5;
        goto L7
    L11:
        r1 = r4;
        goto L12
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDuration() {
        return Math.max(getMaxDurationPerIteration(), this.maxDuration.invoke().longValue());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public List<TransitionInfo> getTransitions(long stepMillis) {
        InfiniteTransition transition = getAnimation().getAnimationObject();
        Iterable $this$map$iv = transition.getAnimations();
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator r6 = $this$map$iv.iterator();
    L4:
        if (r6.hasNext() == false) goto L6;
        Object item$iv$iv = r6.next();
        InfiniteTransition.TransitionAnimationState it = (InfiniteTransition.TransitionAnimationState) item$iv$iv;
        destination$iv$iv.add(Utils_androidKt.createTransitionInfo(it, stepMillis, getMaxDuration()));
        goto L4
    L6:
        Iterable $this$filter$iv = (List) destination$iv$iv;
        Collection destination$iv$iv2 = new ArrayList();
        Iterator r7 = $this$filter$iv.iterator();
    L8:
        if (r7.hasNext() == false) goto L13;
        Object element$iv$iv = r7.next();
        TransitionInfo it2 = (TransitionInfo) element$iv$iv;
        if (Utils_androidKt.getIGNORE_TRANSITIONS().contains(it2.getLabel()) == true) goto L8;
        destination$iv$iv2.add(element$iv$iv);
        goto L8
    L13:
        return CollectionsKt.toList((List) destination$iv$iv2);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setClockTime(long animationTimeNanos) {
        getAnimation().setTimeNanos(animationTimeNanos);
    }

    private final <T, V extends AnimationVector> long getIterationDuration(InfiniteTransition.TransitionAnimationState<T, V> r8) {
        AnimationSpec<T> r0 = r8.getAnimationSpec();
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.animation.core.InfiniteRepeatableSpec<T of androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock.getIterationDuration>");
        InfiniteRepeatableSpec repeatableSpec = (InfiniteRepeatableSpec) r0;
        if (repeatableSpec.getRepeatMode() != RepeatMode.Reverse) goto L5;
        int repeats = 2;
    L6:
        VectorizedDurationBasedAnimationSpec<V> r2 = repeatableSpec.getAnimation().vectorize(r8.getTypeConverter());
        return Utils_androidKt.millisToNanos(((long) r2.getDelayMillis()) + ((long) (r2.getDurationMillis() * repeats)));
    L5:
        repeats = 1;
        goto L6
    }
}
