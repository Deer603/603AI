package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnimateXAsStateComposeAnimation.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \"*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004:\u0001\"B7\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/tooling/ComposeAnimation;", "toolingState", "Landroidx/compose/ui/tooling/animation/ToolingState;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "animationObject", "Landroidx/compose/animation/core/Animatable;", "(Landroidx/compose/ui/tooling/animation/ToolingState;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/Animatable;)V", "getAnimationObject", "()Landroidx/compose/animation/core/Animatable;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "label", "", "getLabel", "()Ljava/lang/String;", "states", "", "", "getStates", "()Ljava/util/Set;", "getToolingState", "()Landroidx/compose/ui/tooling/animation/ToolingState;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "setState", "", "value", "Companion", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AnimateXAsStateComposeAnimation<T, V extends AnimationVector> implements ComposeAnimation {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static boolean apiAvailable;
    private final Animatable<T, V> animationObject;
    private final AnimationSpec<T> animationSpec;
    private final String label;
    private final Set<Object> states;
    private final ToolingState<T> toolingState;
    private final ComposeAnimationType type;

    /* JADX INFO: compiled from: AnimateXAsStateComposeAnimation.android.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0007J7\u0010\u000b\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\f\"\u0004\b\u0002\u0010\r\"\b\b\u0003\u0010\u000e*\u00020\u000f*\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e0\u0010H\u0000¢\u0006\u0002\b\u0011R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation$Companion;", "", "()V", "<set-?>", "", "apiAvailable", "getApiAvailable", "()Z", "testOverrideAvailability", "", "override", "parse", "Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", "parse$ui_tooling_release", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final boolean getApiAvailable() {
            return AnimateXAsStateComposeAnimation.access$getApiAvailable$cp();
        }

        public final <T, V extends AnimationVector> AnimateXAsStateComposeAnimation<?, ?> parse$ui_tooling_release(AnimationSearch.AnimateXAsStateSearchInfo<T, V> r6) {
            DefaultConstructorMarker r1 = null;
            if (getApiAvailable() == true) goto L6;
            return null;
        L6:
            if (r6.getAnimatable().getValue() != null) goto L9;
            return null;
        L9:
            return new AnimateXAsStateComposeAnimation(r6.getToolingState(), r6.getAnimationSpec(), r6.getAnimatable(), r1);
        }

        public final void testOverrideAvailability(boolean override) {
            AnimateXAsStateComposeAnimation.access$setApiAvailable$cp(override);
        }
    }

    public /* synthetic */ AnimateXAsStateComposeAnimation(ToolingState r1, AnimationSpec r2, Animatable r3, DefaultConstructorMarker r4) {
        this(r1, r2, r3);
    }

    private AnimateXAsStateComposeAnimation(ToolingState<T> r4, AnimationSpec<T> r5, Animatable<T, V> r6) {
        this.toolingState = r4;
        this.animationSpec = r5;
        this.animationObject = r6;
        this.type = ComposeAnimationType.ANIMATE_X_AS_STATE;
        Object it = getAnimationObject().getValue();
        Intrinsics.checkNotNull(it, "null cannot be cast to non-null type kotlin.Any");
        Object[] r2 = it.getClass().getEnumConstants();
        if (r2 == null) goto L6;
        Set<Object> r3 = ArraysKt.toSet(r2);
        if (r3 == null) goto L6;
    L7:
        this.states = r3;
        this.label = getAnimationObject().getLabel();
        return;
    L6:
        r3 = SetsKt.setOf(it);
        goto L7
    }

    public static final /* synthetic */ boolean access$getApiAvailable$cp() {
        return apiAvailable;
    }

    public static final /* synthetic */ void access$setApiAvailable$cp(boolean r0) {
        apiAvailable = r0;
    }

    /* JADX INFO: renamed from: getAnimationObject, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m6895getAnimationObject() {
        return getAnimationObject();
    }

    public final ToolingState<T> getToolingState() {
        return this.toolingState;
    }

    public final AnimationSpec<T> getAnimationSpec() {
        return this.animationSpec;
    }

    public Animatable<T, V> getAnimationObject() {
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

    public final void setState(Object value) {
        this.toolingState.setValue(value);
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
        if (Intrinsics.areEqual(r0[r4].name(), "ANIMATE_X_AS_STATE") == true) goto L6;
        r4 = r4 + 1;
        goto L3
    L6:
        r3 = true;
    L9:
        apiAvailable = r3;
    }
}
