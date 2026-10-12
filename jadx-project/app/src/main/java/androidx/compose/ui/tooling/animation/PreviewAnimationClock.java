package androidx.compose.ui.tooling.animation;

import android.util.Log;
import androidx.compose.animation.core.DecayAnimation;
import androidx.compose.animation.core.TargetBasedAnimation;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.tooling.animation.clock.AnimateXAsStateClock;
import androidx.compose.ui.tooling.animation.clock.AnimatedVisibilityClock;
import androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock;
import androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock;
import androidx.compose.ui.tooling.animation.clock.TransitionClock;
import androidx.compose.ui.tooling.animation.clock.Utils_androidKt;
import androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: PreviewAnimationClock.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0010\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0012\u00105\u001a\u00020\u00042\b\u00106\u001a\u0004\u0018\u00010\tH\u0002J\u0006\u00107\u001a\u00020\u0004J\u001a\u00108\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\f2\u0006\u00109\u001a\u00020:H\u0002J\u0014\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u000b2\u0006\u00109\u001a\u00020:J\u001b\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020:ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010AJ\u0006\u0010B\u001a\u00020CJ\u0006\u0010D\u001a\u00020CJ\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u000b2\u0006\u00109\u001a\u00020:2\u0006\u0010G\u001a\u00020CJ\u0010\u0010H\u001a\u00020\u00042\u0006\u00109\u001a\u00020:H\u0015J\u0010\u0010I\u001a\u00020\u00042\u0006\u00109\u001a\u00020:H\u0015J\u000e\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020CJ\u001a\u0010L\u001a\u00020\u00042\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020C0MJ\u000e\u0010N\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0001J\u0016\u0010O\u001a\u00020\u00042\u000e\u00109\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030PJ\u0012\u0010Q\u001a\u00020\u00042\n\u00109\u001a\u0006\u0012\u0002\b\u00030RJ\"\u0010S\u001a\u00020\u00042\n\u00109\u001a\u0006\u0012\u0002\b\u00030R2\u000e\b\u0002\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J$\u0010U\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u00012\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040WH\u0002J\u0016\u0010X\u001a\u00020\u00042\u000e\u00109\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030YJ\u000e\u0010Z\u001a\u00020\u00042\u0006\u00109\u001a\u00020[J\u0016\u0010\\\u001a\u00020\u00042\u000e\u00109\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030]J\u0012\u0010^\u001a\u00020\u00042\n\u00109\u001a\u0006\u0012\u0002\b\u00030RJ\u0018\u0010_\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u00012\u0006\u00106\u001a\u00020\tH\u0002J\u0016\u0010`\u001a\u00020\u00042\u0006\u0010?\u001a\u00020:2\u0006\u0010a\u001a\u00020\u0001J\u001e\u0010b\u001a\u00020\u00042\u0006\u0010?\u001a\u00020:2\u0006\u0010c\u001a\u00020\u00012\u0006\u0010d\u001a\u00020\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f0\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f0\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR8\u0010\u0011\u001a\u001e\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0013\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00140\u00128\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R0\u0010\u0019\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u00128\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R(\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u00128\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018R(\u0010#\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\u00128\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010\u0018R\u000e\u0010(\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u00010*j\b\u0012\u0004\u0012\u00020\u0001`+X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010,\u001a\u0012\u0012\u0004\u0012\u00020-0*j\b\u0012\u0004\u0012\u00020-`+8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u0016\u001a\u0004\b/\u00100R0\u00101\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u000302\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u00128\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\u0016\u001a\u0004\b4\u0010\u0018\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006e"}, d2 = {"Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "", "setAnimationsTimeCallback", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "DEBUG", "", "TAG", "", "allClocks", "", "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "getAllClocks", "()Ljava/util/List;", "allClocksExceptInfinite", "getAllClocksExceptInfinite", "animateXAsStateClocks", "", "Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "Landroidx/compose/ui/tooling/animation/clock/AnimateXAsStateClock;", "getAnimateXAsStateClocks$ui_tooling_release$annotations", "()V", "getAnimateXAsStateClocks$ui_tooling_release", "()Ljava/util/Map;", "animatedContentClocks", "Landroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation;", "Landroidx/compose/ui/tooling/animation/clock/TransitionClock;", "getAnimatedContentClocks$ui_tooling_release$annotations", "getAnimatedContentClocks$ui_tooling_release", "animatedVisibilityClocks", "Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "Landroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock;", "getAnimatedVisibilityClocks$ui_tooling_release$annotations", "getAnimatedVisibilityClocks$ui_tooling_release", "infiniteTransitionClocks", "Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "Landroidx/compose/ui/tooling/animation/clock/InfiniteTransitionClock;", "getInfiniteTransitionClocks$ui_tooling_release$annotations", "getInfiniteTransitionClocks$ui_tooling_release", "lock", "trackedAnimations", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "trackedUnsupportedAnimations", "Landroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation;", "getTrackedUnsupportedAnimations$annotations", "getTrackedUnsupportedAnimations", "()Ljava/util/LinkedHashSet;", "transitionClocks", "Landroidx/compose/ui/tooling/animation/TransitionComposeAnimation;", "getTransitionClocks$ui_tooling_release$annotations", "getTransitionClocks$ui_tooling_release", "createUnsupported", "label", "dispose", "findClock", "animation", "Landroidx/compose/animation/tooling/ComposeAnimation;", "getAnimatedProperties", "Landroidx/compose/animation/tooling/ComposeAnimatedProperty;", "getAnimatedVisibilityState", "Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "composeAnimation", "getAnimatedVisibilityState-cc2g1to", "(Landroidx/compose/animation/tooling/ComposeAnimation;)Ljava/lang/String;", "getMaxDuration", "", "getMaxDurationPerIteration", "getTransitions", "Landroidx/compose/animation/tooling/TransitionInfo;", "stepMillis", "notifySubscribe", "notifyUnsubscribe", "setClockTime", "animationTimeMillis", "setClockTimes", "", "trackAnimateContentSize", "trackAnimateXAsState", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", "trackAnimatedContent", "Landroidx/compose/animation/core/Transition;", "trackAnimatedVisibility", "onSeek", "trackAnimation", "createClockAndSubscribe", "Lkotlin/Function1;", "trackDecayAnimations", "Landroidx/compose/animation/core/DecayAnimation;", "trackInfiniteTransition", "Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "trackTargetBasedAnimations", "Landroidx/compose/animation/core/TargetBasedAnimation;", "trackTransition", "trackUnsupported", "updateAnimatedVisibilityState", "state", "updateFromAndToStates", "fromState", "toState", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class PreviewAnimationClock {
    public static final int $stable = 0;
    private final boolean DEBUG;
    private final String TAG;
    private final Map<AnimateXAsStateComposeAnimation<?, ?>, AnimateXAsStateClock<?, ?>> animateXAsStateClocks;
    private final Map<AnimatedContentComposeAnimation<?>, TransitionClock<?>> animatedContentClocks;
    private final Map<AnimatedVisibilityComposeAnimation, AnimatedVisibilityClock> animatedVisibilityClocks;
    private final Map<InfiniteTransitionComposeAnimation, InfiniteTransitionClock> infiniteTransitionClocks;
    private final Object lock;
    private final Function0<Unit> setAnimationsTimeCallback;
    private final LinkedHashSet<Object> trackedAnimations;
    private final LinkedHashSet<UnsupportedComposeAnimation> trackedUnsupportedAnimations;
    private final Map<TransitionComposeAnimation<?>, TransitionClock<?>> transitionClocks;

    static {
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PreviewAnimationClock() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void getAnimateXAsStateClocks$ui_tooling_release$annotations() {
    }

    public static /* synthetic */ void getAnimatedContentClocks$ui_tooling_release$annotations() {
    }

    public static /* synthetic */ void getAnimatedVisibilityClocks$ui_tooling_release$annotations() {
    }

    public static /* synthetic */ void getInfiniteTransitionClocks$ui_tooling_release$annotations() {
    }

    public static /* synthetic */ void getTrackedUnsupportedAnimations$annotations() {
    }

    public static /* synthetic */ void getTransitionClocks$ui_tooling_release$annotations() {
    }

    public PreviewAnimationClock(Function0<Unit> r2) {
        this.setAnimationsTimeCallback = r2;
        this.TAG = "PreviewAnimationClock";
        this.transitionClocks = new LinkedHashMap();
        this.animatedVisibilityClocks = new LinkedHashMap();
        this.animateXAsStateClocks = new LinkedHashMap();
        this.infiniteTransitionClocks = new LinkedHashMap();
        this.animatedContentClocks = new LinkedHashMap();
        this.trackedUnsupportedAnimations = new LinkedHashSet();
        this.trackedAnimations = new LinkedHashSet();
        this.lock = new Object();
    }

    public /* synthetic */ PreviewAnimationClock(AnonymousClass1 r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = AnonymousClass1.INSTANCE;
    L5:
        this(r1);
    }

    public static final /* synthetic */ void access$createUnsupported(PreviewAnimationClock $this, String label) {
        $this.createUnsupported(label);
    }

    public static final /* synthetic */ List access$getAllClocksExceptInfinite(PreviewAnimationClock $this) {
        return $this.getAllClocksExceptInfinite();
    }

    public final Map<TransitionComposeAnimation<?>, TransitionClock<?>> getTransitionClocks$ui_tooling_release() {
        return this.transitionClocks;
    }

    public final Map<AnimatedVisibilityComposeAnimation, AnimatedVisibilityClock> getAnimatedVisibilityClocks$ui_tooling_release() {
        return this.animatedVisibilityClocks;
    }

    public final Map<AnimateXAsStateComposeAnimation<?, ?>, AnimateXAsStateClock<?, ?>> getAnimateXAsStateClocks$ui_tooling_release() {
        return this.animateXAsStateClocks;
    }

    public final Map<InfiniteTransitionComposeAnimation, InfiniteTransitionClock> getInfiniteTransitionClocks$ui_tooling_release() {
        return this.infiniteTransitionClocks;
    }

    public final Map<AnimatedContentComposeAnimation<?>, TransitionClock<?>> getAnimatedContentClocks$ui_tooling_release() {
        return this.animatedContentClocks;
    }

    private final List<ComposeAnimationClock<?, ?>> getAllClocksExceptInfinite() {
        return CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.plus(this.transitionClocks.values(), this.animatedVisibilityClocks.values()), this.animateXAsStateClocks.values()), this.animatedContentClocks.values());
    }

    private final List<ComposeAnimationClock<?, ?>> getAllClocks() {
        return CollectionsKt.plus(getAllClocksExceptInfinite(), this.infiniteTransitionClocks.values());
    }

    private final ComposeAnimationClock<?, ?> findClock(ComposeAnimation animation) {
        InfiniteTransitionClock r0 = (TransitionClock) this.transitionClocks.get(animation);
        if (r0 != null) goto L16;
        r0 = this.animatedVisibilityClocks.get(animation);
        if (r0 != null) goto L16;
        r0 = (AnimateXAsStateClock) this.animateXAsStateClocks.get(animation);
        if (r0 != null) goto L16;
        r0 = this.infiniteTransitionClocks.get(animation);
        if (r0 != null) goto L16;
        return this.animatedContentClocks.get(animation);
    L16:
        return r0;
    }

    public final void trackTransition(final Transition<?> r2) {
        trackAnimation(r2, new C06751(r2, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackAnimatedVisibility$default(PreviewAnimationClock r0, Transition r1, C06731 r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = C06731.INSTANCE;
    L6:
        r0.trackAnimatedVisibility(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackAnimatedVisibility");
    }

    public final void trackAnimatedVisibility(final Transition<?> r2, final Function0<Unit> r3) {
        if ((r2.getCurrentState() instanceof Boolean) == true) goto L5;
        return;
    L5:
        trackAnimation(r2, new AnonymousClass2(r2, r3, this));
    }

    public final void trackAnimateXAsState(final AnimationSearch.AnimateXAsStateSearchInfo<?, ?> r3) {
        trackAnimation(r3.getAnimatable(), new C06711(r3, this));
    }

    public final void trackAnimateContentSize(Object animation) {
        trackUnsupported(animation, "animateContentSize");
    }

    public final void trackTargetBasedAnimations(TargetBasedAnimation<?, ?> r2) {
        trackUnsupported(r2, "TargetBasedAnimation");
    }

    public final void trackDecayAnimations(DecayAnimation<?, ?> r2) {
        trackUnsupported(r2, "DecayAnimation");
    }

    public final void trackAnimatedContent(final Transition<?> r2) {
        trackAnimation(r2, new C06721(r2, this));
    }

    public final void trackInfiniteTransition(final AnimationSearch.InfiniteTransitionSearchInfo animation) {
        trackAnimation(animation.getInfiniteTransition(), new C06741(animation, this));
    }

    public final LinkedHashSet<UnsupportedComposeAnimation> getTrackedUnsupportedAnimations() {
        return this.trackedUnsupportedAnimations;
    }

    private final void trackUnsupported(Object animation, final String label) {
        trackAnimation(animation, new C06761(this, label));
    }

    private final void createUnsupported(String label) {
        UnsupportedComposeAnimation it = UnsupportedComposeAnimation.Companion.create(label);
        if (it == null) goto L6;
        this.trackedUnsupportedAnimations.add(it);
        notifySubscribe(it);
        return;
    }

    private final boolean trackAnimation(Object animation, Function1<Object, Unit> r7) {
        Object r0 = this.lock;
        monitor-enter(r0);
    L21:
        th = move-exception;
        throw th;
    L6:
        if (this.trackedAnimations.contains(animation) == true) goto L8;
        this.trackedAnimations.add(animation);     // Catch: Throwable -> L21
        monitor-exit(r0);
        r7.invoke(animation);
        if (this.DEBUG == false) goto L25;
        Log.d(this.TAG, "Animation " + animation + " is now tracked");
        return true;
    L25:
        return true;
    L8:
        if (this.DEBUG == false) goto L11;
        Log.d(this.TAG, "Animation " + animation + " is already being tracked");     // Catch: Throwable -> L21
    L11:
        monitor-exit(r0);
        return false;
    }

    protected void notifySubscribe(ComposeAnimation animation) {
    }

    protected void notifyUnsubscribe(ComposeAnimation animation) {
    }

    public final void updateFromAndToStates(ComposeAnimation composeAnimation, Object fromState, Object toState) {
        ComposeAnimationClock<?, ?> r0 = findClock(composeAnimation);
        if (r0 == null) goto L6;
        r0.setStateParameters(fromState, toState);
        return;
    }

    public final void updateAnimatedVisibilityState(ComposeAnimation composeAnimation, Object state) {
        AnimatedVisibilityClock r0 = this.animatedVisibilityClocks.get(composeAnimation);
        if (r0 == null) goto L6;
        ComposeAnimationClock.setStateParameters$default(r0, state, null, 2, null);
        return;
    }

    /* JADX INFO: renamed from: getAnimatedVisibilityState-cc2g1to, reason: not valid java name */
    public final String m6899getAnimatedVisibilityStatecc2g1to(ComposeAnimation composeAnimation) {
        AnimatedVisibilityClock r0 = this.animatedVisibilityClocks.get(composeAnimation);
        if (r0 == null) goto L6;
        return r0.m6902getStatejXw82LU();
    L6:
        return AnimatedVisibilityState.Companion.m6911getEnterjXw82LU();
    }

    public final long getMaxDuration() {
        Iterator<T> r0 = getAllClocks().iterator();
        if (r0.hasNext() == true) goto L5;
        Long r1 = null;
    L12:
        Long r2 = r1;
        if (r2 != null) goto L22;
        return 0;
    L22:
        return r2.longValue();
    L5:
        ComposeAnimationClock it = (ComposeAnimationClock) r0.next();
        Long r3 = Long.valueOf(it.getMaxDuration());
    L7:
        if (r0.hasNext() == false) goto L11;
        ComposeAnimationClock it2 = (ComposeAnimationClock) r0.next();
        Long r4 = Long.valueOf(it2.getMaxDuration());
        if (r3.compareTo(r4) >= 0) goto L7;
        r3 = r4;
        goto L7
    L11:
        r1 = r3;
        goto L12
    }

    public final long getMaxDurationPerIteration() {
        Iterator<T> r0 = getAllClocks().iterator();
        if (r0.hasNext() == true) goto L5;
        Long r1 = null;
    L12:
        Long r2 = r1;
        if (r2 != null) goto L22;
        return 0;
    L22:
        return r2.longValue();
    L5:
        ComposeAnimationClock it = (ComposeAnimationClock) r0.next();
        Long r3 = Long.valueOf(it.getMaxDurationPerIteration());
    L7:
        if (r0.hasNext() == false) goto L11;
        ComposeAnimationClock it2 = (ComposeAnimationClock) r0.next();
        Long r4 = Long.valueOf(it2.getMaxDurationPerIteration());
        if (r3.compareTo(r4) >= 0) goto L7;
        r3 = r4;
        goto L7
    L11:
        r1 = r3;
        goto L12
    }

    public final List<ComposeAnimatedProperty> getAnimatedProperties(ComposeAnimation animation) {
        ComposeAnimationClock<?, ?> r0 = findClock(animation);
        if (r0 == null) goto L7;
        List<ComposeAnimatedProperty> r1 = r0.getAnimatedProperties();
        if (r1 == null) goto L7;
        return r1;
    L7:
        return CollectionsKt.emptyList();
    }

    public final List<TransitionInfo> getTransitions(ComposeAnimation animation, long stepMillis) {
        ComposeAnimationClock<?, ?> r0 = findClock(animation);
        if (r0 == null) goto L7;
        List<TransitionInfo> r1 = r0.getTransitions(stepMillis);
        if (r1 == null) goto L7;
        return r1;
    L7:
        return CollectionsKt.emptyList();
    }

    public final void setClockTime(long animationTimeMillis) {
        long timeNanos = Utils_androidKt.millisToNanos(animationTimeMillis);
        Iterable $this$forEach$iv = getAllClocks();
        Iterator r4 = $this$forEach$iv.iterator();
    L4:
        if (r4.hasNext() == false) goto L6;
        Object element$iv = r4.next();
        ComposeAnimationClock it = (ComposeAnimationClock) element$iv;
        it.setClockTime(timeNanos);
        goto L4
    L6:
        this.setAnimationsTimeCallback.invoke();
    }

    public final void setClockTimes(Map<ComposeAnimation, Long> r12) {
        Iterator<Map.Entry<ComposeAnimation, Long>> r2 = r12.entrySet().iterator();
    L4:
        if (r2.hasNext() == false) goto L9;
        Map.Entry<ComposeAnimation, Long> r3 = r2.next();
        ComposeAnimation composeAnimation = r3.getKey();
        long millis = r3.getValue().longValue();
        ComposeAnimationClock<?, ?> r8 = findClock(composeAnimation);
        if (r8 == null) goto L4;
        r8.setClockTime(Utils_androidKt.millisToNanos(millis));
        goto L4
    L9:
        this.setAnimationsTimeCallback.invoke();
    }

    public final void dispose() {
        Iterable $this$forEach$iv = getAllClocks();
        Iterator r2 = $this$forEach$iv.iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        Object element$iv = r2.next();
        ComposeAnimationClock it = (ComposeAnimationClock) element$iv;
        notifyUnsubscribe(it.getAnimation());
        goto L4
    L6:
        Iterable $this$forEach$iv2 = this.trackedUnsupportedAnimations;
        Iterator r3 = $this$forEach$iv2.iterator();
    L8:
        if (r3.hasNext() == false) goto L10;
        Object element$iv2 = r3.next();
        UnsupportedComposeAnimation it2 = (UnsupportedComposeAnimation) element$iv2;
        notifyUnsubscribe(it2);
        goto L8
    L10:
        this.trackedUnsupportedAnimations.clear();
        this.transitionClocks.clear();
        this.animatedVisibilityClocks.clear();
        this.trackedAnimations.clear();
    }
}
