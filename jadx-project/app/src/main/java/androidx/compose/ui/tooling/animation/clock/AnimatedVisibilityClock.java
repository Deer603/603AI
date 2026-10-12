package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.tooling.animation.AnimatedVisibilityComposeAnimation;
import androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState;
import androidx.compose.ui.tooling.animation.states.ComposeAnimationState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnimatedVisibilityClock.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00102\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u001a\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\"\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0 *\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R,\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock;", "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "animation", "(Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;)V", "getAnimation", "()Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "value", "state", "getState-jXw82LU", "()Ljava/lang/String;", "setState-7IW2chM", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getAnimatedProperties", "", "Landroidx/compose/animation/tooling/ComposeAnimatedProperty;", "getMaxDuration", "", "getMaxDurationPerIteration", "getTransitions", "Landroidx/compose/animation/tooling/TransitionInfo;", "stepMillis", "setClockTime", "", "animationTimeNanos", "setStateParameters", "par1", "", "par2", "toCurrentTargetPair", "Lkotlin/Pair;", "", "toCurrentTargetPair-7IW2chM", "(Ljava/lang/String;)Lkotlin/Pair;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AnimatedVisibilityClock implements ComposeAnimationClock<AnimatedVisibilityComposeAnimation, AnimatedVisibilityState> {
    public static final int $stable = 0;
    private final AnimatedVisibilityComposeAnimation animation;
    private String state;

    static {
        $stable = 8;
    }

    public AnimatedVisibilityClock(AnimatedVisibilityComposeAnimation animation) {
        this.animation = animation;
        if (getAnimation().getAnimationObject().getCurrentState().booleanValue() == false) goto L5;
        String r0 = AnimatedVisibilityState.Companion.m6912getExitjXw82LU();
    L6:
        this.state = r0;
        return;
    L5:
        r0 = AnimatedVisibilityState.Companion.m6911getEnterjXw82LU();
        goto L6
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public /* bridge */ /* synthetic */ ComposeAnimation getAnimation() {
        return getAnimation();
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public AnimatedVisibilityComposeAnimation getAnimation() {
        return this.animation;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public /* bridge */ /* synthetic */ ComposeAnimationState getState() {
        return AnimatedVisibilityState.m6904boximpl(m6902getStatejXw82LU());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public /* bridge */ /* synthetic */ void setState(ComposeAnimationState r2) {
        m6903setState7IW2chM(((AnimatedVisibilityState) r2).m6910unboximpl());
    }

    /* JADX INFO: renamed from: getState-jXw82LU, reason: not valid java name */
    public String m6902getStatejXw82LU() {
        return this.state;
    }

    /* JADX INFO: renamed from: setState-7IW2chM, reason: not valid java name */
    public void m6903setState7IW2chM(String value) {
        this.state = value;
        setClockTime(0);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setStateParameters(Object par1, Object par2) {
        Intrinsics.checkNotNull(par1, "null cannot be cast to non-null type androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState");
        m6903setState7IW2chM(((AnimatedVisibilityState) par1).m6910unboximpl());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDurationPerIteration() {
        Transition<Object> r0 = getAnimation().getChildTransition();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return Utils_androidKt.nanosToMillis(r0.getTotalDurationNanos());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDuration() {
        Transition<Object> r0 = getAnimation().getChildTransition();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return Utils_androidKt.nanosToMillis(r0.getTotalDurationNanos());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setClockTime(long animationTimeNanos) {
        Transition<Boolean> r0 = getAnimation().getAnimationObject();
        Pair<Boolean, Boolean> r2 = m6901toCurrentTargetPair7IW2chM(m6902getStatejXw82LU());
        boolean current = r2.component1().booleanValue();
        boolean target = r2.component2().booleanValue();
        r0.seek(Boolean.valueOf(current), Boolean.valueOf(target), animationTimeNanos);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public List<TransitionInfo> getTransitions(long stepMillis) {
        Transition<Object> r0 = getAnimation().getChildTransition();
        if (r0 == null) goto L17;
        Iterable $this$map$iv = Utils_androidKt.allAnimations(r0);
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator r7 = $this$map$iv.iterator();
    L6:
        if (r7.hasNext() == false) goto L8;
        Object item$iv$iv = r7.next();
        Transition.TransitionAnimationState it = (Transition.TransitionAnimationState) item$iv$iv;
        destination$iv$iv.add(Utils_androidKt.createTransitionInfo(it, stepMillis));
        goto L6
    L8:
        Iterable $this$sortedBy$iv = (List) destination$iv$iv;
        Iterable $this$filter$iv = CollectionsKt.sortedWith($this$sortedBy$iv, new AnimatedVisibilityClock$getTransitions$lambda$4$$inlined$sortedBy$1());
        Collection destination$iv$iv2 = new ArrayList();
        Iterator r8 = $this$filter$iv.iterator();
    L10:
        if (r8.hasNext() == false) goto L15;
        Object element$iv$iv = r8.next();
        TransitionInfo it2 = (TransitionInfo) element$iv$iv;
        if (Utils_androidKt.getIGNORE_TRANSITIONS().contains(it2.getLabel()) == true) goto L10;
        destination$iv$iv2.add(element$iv$iv);
        goto L10
    L15:
        return (List) destination$iv$iv2;
    L17:
        return CollectionsKt.emptyList();
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public List<ComposeAnimatedProperty> getAnimatedProperties() {
        Transition<Object> r0 = getAnimation().getChildTransition();
        if (r0 == null) goto L23;
        int r1 = 0;
        Iterable $this$mapNotNull$iv = Utils_androidKt.allAnimations(r0);
        Collection destination$iv$iv = new ArrayList();
        Iterator r9 = $this$mapNotNull$iv.iterator();
    L6:
        if (r9.hasNext() == false) goto L14;
        Object element$iv$iv$iv = r9.next();
        Transition.TransitionAnimationState it = (Transition.TransitionAnimationState) element$iv$iv$iv;
        String r15 = it.getLabel();
        Transition<Object> r16 = r0;
        Object r2 = it.getValue();
        if (r2 != null) goto L10;
        ComposeAnimatedProperty r3 = null;
    L11:
        if (r3 == null) goto L13;
        destination$iv$iv.add(r3);
    L13:
        r0 = r16;
        r1 = r1;
        goto L6
    L10:
        r3 = new ComposeAnimatedProperty(r15, r2);
        goto L11
    L14:
        Iterable $this$sortedBy$iv = (List) destination$iv$iv;
        Iterable $this$filter$iv = CollectionsKt.sortedWith($this$sortedBy$iv, new AnimatedVisibilityClock$getAnimatedProperties$lambda$8$$inlined$sortedBy$1());
        Collection destination$iv$iv2 = new ArrayList();
        Iterator r5 = $this$filter$iv.iterator();
    L16:
        if (r5.hasNext() == false) goto L21;
        Object element$iv$iv = r5.next();
        if (Utils_androidKt.getIGNORE_TRANSITIONS().contains(((ComposeAnimatedProperty) element$iv$iv).getLabel()) == true) goto L16;
        destination$iv$iv2.add(element$iv$iv);
        goto L16
    L21:
        return (List) destination$iv$iv2;
    L23:
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: toCurrentTargetPair-7IW2chM, reason: not valid java name */
    private final Pair<Boolean, Boolean> m6901toCurrentTargetPair7IW2chM(String $this$toCurrentTargetPair_u2d7IW2chM) {
        if (AnimatedVisibilityState.m6907equalsimpl0($this$toCurrentTargetPair_u2d7IW2chM, AnimatedVisibilityState.Companion.m6911getEnterjXw82LU()) == false) goto L6;
        return TuplesKt.to(false, true);
    L6:
        return TuplesKt.to(true, false);
    }
}
