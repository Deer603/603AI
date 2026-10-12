package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InfiniteTransitionComposeAnimation.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001d\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "Landroidx/compose/animation/tooling/ComposeAnimation;", "toolingState", "Landroidx/compose/ui/tooling/animation/ToolingState;", "", "animationObject", "Landroidx/compose/animation/core/InfiniteTransition;", "(Landroidx/compose/ui/tooling/animation/ToolingState;Landroidx/compose/animation/core/InfiniteTransition;)V", "getAnimationObject", "()Landroidx/compose/animation/core/InfiniteTransition;", "label", "", "getLabel", "()Ljava/lang/String;", "states", "", "", "getStates", "()Ljava/util/Set;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "setTimeNanos", "", "playTimeNanos", "Companion", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InfiniteTransitionComposeAnimation implements ComposeAnimation {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static boolean apiAvailable;
    private final InfiniteTransition animationObject;
    private final String label;
    private final Set<Object> states;
    private final ToolingState<Long> toolingState;
    private final ComposeAnimationType type;

    /* JADX INFO: compiled from: InfiniteTransitionComposeAnimation.android.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\rH\u0000¢\u0006\u0002\b\u000eR\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation$Companion;", "", "()V", "<set-?>", "", "apiAvailable", "getApiAvailable", "()Z", "testOverrideAvailability", "", "override", "parse", "Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "parse$ui_tooling_release", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final boolean getApiAvailable() {
            return InfiniteTransitionComposeAnimation.access$getApiAvailable$cp();
        }

        public final InfiniteTransitionComposeAnimation parse$ui_tooling_release(AnimationSearch.InfiniteTransitionSearchInfo $this$parse) {
            DefaultConstructorMarker r1 = null;
            if (getApiAvailable() == true) goto L6;
            return null;
        L6:
            return new InfiniteTransitionComposeAnimation($this$parse.getToolingState(), $this$parse.getInfiniteTransition(), r1);
        }

        public final void testOverrideAvailability(boolean override) {
            InfiniteTransitionComposeAnimation.access$setApiAvailable$cp(override);
        }
    }

    public /* synthetic */ InfiniteTransitionComposeAnimation(ToolingState r1, InfiniteTransition r2, DefaultConstructorMarker r3) {
        this(r1, r2);
    }

    private InfiniteTransitionComposeAnimation(ToolingState<Long> r2, InfiniteTransition animationObject) {
        this.toolingState = r2;
        this.animationObject = animationObject;
        this.type = ComposeAnimationType.INFINITE_TRANSITION;
        this.states = SetsKt.setOf(0);
        this.label = getAnimationObject().getLabel();
    }

    public static final /* synthetic */ boolean access$getApiAvailable$cp() {
        return apiAvailable;
    }

    public static final /* synthetic */ void access$setApiAvailable$cp(boolean r0) {
        apiAvailable = r0;
    }

    /* JADX INFO: renamed from: getAnimationObject, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m6898getAnimationObject() {
        return getAnimationObject();
    }

    public InfiniteTransition getAnimationObject() {
        return this.animationObject;
    }

    public ComposeAnimationType getType() {
        return this.type;
    }

    public Set<Object> getStates() {
        return this.states;
    }

    public String getLabel() {
        return this.label;
    }

    public final void setTimeNanos(long playTimeNanos) {
        this.toolingState.setValue(Long.valueOf(playTimeNanos));
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        ComposeAnimationType[] r0 = ComposeAnimationType.values();
        int r2 = r0.length;
        boolean r3 = false;
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L9;
        if (Intrinsics.areEqual(r0[r4].name(), "INFINITE_TRANSITION") == true) goto L6;
        r4 = r4 + 1;
        goto L3
    L6:
        r3 = true;
    L9:
        apiAvailable = r3;
    }
}
