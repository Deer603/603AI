package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.tooling.animation.TransitionBasedAnimation;
import androidx.compose.ui.tooling.animation.states.ComposeAnimationState;
import androidx.compose.ui.tooling.animation.states.TargetState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: TransitionClock.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0002B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00102\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u001a\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR0\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/tooling/animation/clock/TransitionClock;", "T", "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;", "Landroidx/compose/ui/tooling/animation/states/TargetState;", "animation", "(Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;)V", "getAnimation", "()Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;", "value", "state", "getState", "()Landroidx/compose/ui/tooling/animation/states/TargetState;", "setState", "(Landroidx/compose/ui/tooling/animation/states/TargetState;)V", "getAnimatedProperties", "", "Landroidx/compose/animation/tooling/ComposeAnimatedProperty;", "getMaxDuration", "", "getMaxDurationPerIteration", "getTransitions", "Landroidx/compose/animation/tooling/TransitionInfo;", "stepMillis", "setClockTime", "", "animationTimeNanos", "setStateParameters", "par1", "", "par2", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TransitionClock<T> implements ComposeAnimationClock<TransitionBasedAnimation<T>, TargetState<T>> {
    public static final int $stable = 0;
    private final TransitionBasedAnimation<T> animation;
    private TargetState<T> state;

    static {
        $stable = 8;
    }

    public TransitionClock(TransitionBasedAnimation<T> r4) {
        this.animation = r4;
        this.state = new TargetState(getAnimation().getAnimationObject().getCurrentState(), getAnimation().getAnimationObject().getTargetState());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public /* bridge */ /* synthetic */ ComposeAnimation getAnimation() {
        return getAnimation();
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public TransitionBasedAnimation<T> getAnimation() {
        return this.animation;
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
    public TargetState<T> getState() {
        return this.state;
    }

    public void setState(TargetState<T> r3) {
        this.state = r3;
        setClockTime(0);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setStateParameters(Object par1, Object par2) {
        TargetState<T> r0 = Utils_androidKt.parseParametersToValue(getState().getInitial(), par1, par2);
        if (r0 == null) goto L6;
        setState(r0);
        return;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public List<ComposeAnimatedProperty> getAnimatedProperties() {
        Iterable $this$mapNotNull$iv = Utils_androidKt.allAnimations(getAnimation().getAnimationObject());
        Collection destination$iv$iv = new ArrayList();
        Iterator<T> r7 = $this$mapNotNull$iv.iterator();
    L4:
        if (r7.hasNext() == false) goto L12;
        Object element$iv$iv$iv = r7.next();
        Transition.TransitionAnimationState it = (Transition.TransitionAnimationState) element$iv$iv$iv;
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
        Iterator<T> r5 = $this$filter$iv.iterator();
    L14:
        if (r5.hasNext() == false) goto L19;
        T r6 = r5.next();
        if (Utils_androidKt.getIGNORE_TRANSITIONS().contains(((ComposeAnimatedProperty) r6).getLabel()) == true) goto L14;
        destination$iv$iv2.add(r6);
        goto L14
    L19:
        return (List) destination$iv$iv2;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDurationPerIteration() {
        return Utils_androidKt.nanosToMillis(getAnimation().getAnimationObject().getTotalDurationNanos());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDuration() {
        return Utils_androidKt.nanosToMillis(getAnimation().getAnimationObject().getTotalDurationNanos());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public List<TransitionInfo> getTransitions(long stepMillis) {
        Iterable $this$map$iv = Utils_androidKt.allAnimations(getAnimation().getAnimationObject());
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator<T> r6 = $this$map$iv.iterator();
    L4:
        if (r6.hasNext() == false) goto L6;
        Object item$iv$iv = r6.next();
        Transition.TransitionAnimationState it = (Transition.TransitionAnimationState) item$iv$iv;
        destination$iv$iv.add(Utils_androidKt.createTransitionInfo(it, stepMillis));
        goto L4
    L6:
        Iterable $this$filter$iv = (List) destination$iv$iv;
        Collection destination$iv$iv2 = new ArrayList();
        Iterator<T> r7 = $this$filter$iv.iterator();
    L8:
        if (r7.hasNext() == false) goto L13;
        T r8 = r7.next();
        TransitionInfo it2 = (TransitionInfo) r8;
        if (Utils_androidKt.getIGNORE_TRANSITIONS().contains(it2.getLabel()) == true) goto L8;
        destination$iv$iv2.add(r8);
        goto L8
    L13:
        return (List) destination$iv$iv2;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setClockTime(long animationTimeNanos) {
        getAnimation().getAnimationObject().seek(getState().getInitial(), getState().getTarget(), animationTimeNanos);
    }
}
