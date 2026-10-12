package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: AnimatedContentComposeAnimation.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u0016*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0016B-\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation;", "T", "Landroidx/compose/animation/tooling/ComposeAnimation;", "Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;", "animationObject", "Landroidx/compose/animation/core/Transition;", "states", "", "", "label", "", "(Landroidx/compose/animation/core/Transition;Ljava/util/Set;Ljava/lang/String;)V", "getAnimationObject", "()Landroidx/compose/animation/core/Transition;", "getLabel", "()Ljava/lang/String;", "getStates", "()Ljava/util/Set;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "Companion", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AnimatedContentComposeAnimation<T> implements ComposeAnimation, TransitionBasedAnimation<T> {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static boolean apiAvailable;
    private final Transition<T> animationObject;
    private final String label;
    private final Set<Object> states;
    private final ComposeAnimationType type;

    /* JADX INFO: compiled from: AnimatedContentComposeAnimation.android.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0014\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f*\u0006\u0012\u0002\b\u00030\rR\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation$Companion;", "", "()V", "<set-?>", "", "apiAvailable", "getApiAvailable", "()Z", "testOverrideAvailability", "", "override", "parseAnimatedContent", "Landroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation;", "Landroidx/compose/animation/core/Transition;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final boolean getApiAvailable() {
            return AnimatedContentComposeAnimation.access$getApiAvailable$cp();
        }

        public final AnimatedContentComposeAnimation<?> parseAnimatedContent(Transition<?> r7) {
            DefaultConstructorMarker r1 = null;
            if (getApiAvailable() == true) goto L5;
            return null;
        L5:
            Object state = r7.getCurrentState();
            if (state == null) goto L17;
            Object[] r3 = state.getClass().getEnumConstants();
            if (r3 == null) goto L11;
            Set states = ArraysKt.toSet(r3);
            if (states == null) goto L11;
        L12:
            String r5 = r7.getLabel();
            if (r5 != null) goto L16;
            r5 = Reflection.getOrCreateKotlinClass(state.getClass()).getSimpleName();
        L16:
            return new AnimatedContentComposeAnimation(r7, states, r5, r1);
        L11:
            states = SetsKt.setOf(state);
            goto L12
        L17:
            return null;
        }

        public final void testOverrideAvailability(boolean override) {
            AnimatedContentComposeAnimation.access$setApiAvailable$cp(override);
        }
    }

    public /* synthetic */ AnimatedContentComposeAnimation(Transition r1, Set r2, String r3, DefaultConstructorMarker r4) {
        this(r1, r2, r3);
    }

    private AnimatedContentComposeAnimation(Transition<T> r2, Set<? extends Object> r3, String label) {
        this.animationObject = r2;
        this.states = r3;
        this.label = label;
        this.type = ComposeAnimationType.ANIMATED_CONTENT;
    }

    public static final /* synthetic */ boolean access$getApiAvailable$cp() {
        return apiAvailable;
    }

    public static final /* synthetic */ void access$setApiAvailable$cp(boolean r0) {
        apiAvailable = r0;
    }

    /* JADX INFO: renamed from: getAnimationObject, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m6896getAnimationObject() {
        return getAnimationObject();
    }

    @Override // androidx.compose.ui.tooling.animation.TransitionBasedAnimation
    public Transition<T> getAnimationObject() {
        return this.animationObject;
    }

    public Set<Object> getStates() {
        return this.states;
    }

    public String getLabel() {
        return this.label;
    }

    public ComposeAnimationType getType() {
        return this.type;
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
        if (Intrinsics.areEqual(r0[r4].name(), "ANIMATED_CONTENT") == true) goto L6;
        r4 = r4 + 1;
        goto L3
    L6:
        r3 = true;
    L9:
        apiAvailable = r3;
    }
}
