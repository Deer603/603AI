package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: AnimatedVisibility.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\u00020\b*\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0016R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/animation/AnimatedVisibilityScope;", "", "transition", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "getTransition", "()Landroidx/compose/animation/core/Transition;", "animateEnterExit", "Landroidx/compose/ui/Modifier;", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "label", "", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AnimatedVisibilityScope {

    /* JADX INFO: compiled from: AnimatedVisibility.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static Modifier animateEnterExit(AnimatedVisibilityScope $this, Modifier $receiver, EnterTransition enter, ExitTransition exit, String label) {
            return AnimatedVisibilityScope.access$animateEnterExit$jd($this, $receiver, enter, exit, label);
        }

        public static /* synthetic */ Modifier animateEnterExit$default(AnimatedVisibilityScope r0, Modifier r1, EnterTransition r2, ExitTransition r3, String r4, int r5, Object r6) {
            return AnimatedVisibilityScope.animateEnterExit$default(r0, r1, r2, r3, r4, r5, r6);
        }
    }

    Transition<EnterExitState> getTransition();

    static /* synthetic */ Modifier access$animateEnterExit$jd(AnimatedVisibilityScope $this, Modifier $receiver, EnterTransition enter, ExitTransition exit, String label) {
        return super.animateEnterExit($receiver, enter, exit, label);
    }

    static /* synthetic */ Modifier animateEnterExit$default(AnimatedVisibilityScope r3, Modifier r4, EnterTransition r5, ExitTransition r6, String r7, int r8, Object r9) {
        if (r9 != null) goto L15;
        if ((r8 & 1) == 0) goto L7;
        r5 = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
    L7:
        if ((r8 & 2) == 0) goto L10;
        r6 = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
    L10:
        if ((r8 & 4) == 0) goto L13;
        r7 = "animateEnterExit";
    L13:
        return r3.animateEnterExit(r4, r5, r6, r7);
    L15:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateEnterExit");
    }

    default Modifier animateEnterExit(Modifier $this$animateEnterExit, final EnterTransition enter, final ExitTransition exit, final String label) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new AnimatedVisibilityScope$animateEnterExit$$inlined$debugInspectorInfo$1(enter, exit, label);
    L7:
        return ComposedModifierKt.composed($this$animateEnterExit, r1, new AnonymousClass2(this, enter, exit, label));
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }
}
