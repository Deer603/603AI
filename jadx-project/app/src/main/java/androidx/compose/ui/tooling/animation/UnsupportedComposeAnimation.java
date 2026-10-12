package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnsupportedComposeAnimation.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation;", "Landroidx/compose/animation/tooling/ComposeAnimation;", "label", "", "(Ljava/lang/String;)V", "animationObject", "", "getAnimationObject", "()Ljava/lang/Object;", "getLabel", "()Ljava/lang/String;", "states", "", "", "getStates", "()Ljava/util/Set;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "Companion", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UnsupportedComposeAnimation implements ComposeAnimation {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static boolean apiAvailable;
    private final Object animationObject;
    private final String label;
    private final Set<Integer> states;
    private final ComposeAnimationType type;

    /* JADX INFO: compiled from: UnsupportedComposeAnimation.android.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation$Companion;", "", "()V", "<set-?>", "", "apiAvailable", "getApiAvailable", "()Z", "create", "Landroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation;", "label", "", "testOverrideAvailability", "", "override", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final boolean getApiAvailable() {
            return UnsupportedComposeAnimation.access$getApiAvailable$cp();
        }

        public final UnsupportedComposeAnimation create(String label) {
            DefaultConstructorMarker r1 = null;
            if (getApiAvailable() == true) goto L5;
            return null;
        L5:
            return new UnsupportedComposeAnimation(label, r1);
        }

        public final void testOverrideAvailability(boolean override) {
            UnsupportedComposeAnimation.access$setApiAvailable$cp(override);
        }
    }

    public /* synthetic */ UnsupportedComposeAnimation(String r1, DefaultConstructorMarker r2) {
        this(r1);
    }

    private UnsupportedComposeAnimation(String label) {
        this.label = label;
        this.type = ComposeAnimationType.UNSUPPORTED;
        this.animationObject = 0;
        this.states = SetsKt.emptySet();
    }

    public static final /* synthetic */ boolean access$getApiAvailable$cp() {
        return apiAvailable;
    }

    public static final /* synthetic */ void access$setApiAvailable$cp(boolean r0) {
        apiAvailable = r0;
    }

    public String getLabel() {
        return this.label;
    }

    public ComposeAnimationType getType() {
        return this.type;
    }

    public Object getAnimationObject() {
        return this.animationObject;
    }

    public Set<Integer> getStates() {
        return this.states;
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
        if (Intrinsics.areEqual(r0[r4].name(), "UNSUPPORTED") == true) goto L6;
        r4 = r4 + 1;
        goto L3
    L6:
        r3 = true;
    L9:
        apiAvailable = r3;
    }
}
