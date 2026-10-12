package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LookaheadScope;
import kotlin.Metadata;

/* JADX INFO: compiled from: AnimateBoundsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a2\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006\f"}, d2 = {"DefaultBoundsTransform", "Landroidx/compose/animation/BoundsTransform;", "getDefaultBoundsTransform$annotations", "()V", "animateBounds", "Landroidx/compose/ui/Modifier;", "lookaheadScope", "Landroidx/compose/ui/layout/LookaheadScope;", "modifier", "boundsTransform", "animateMotionFrameOfReference", "", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AnimateBoundsModifierKt {
    private static final BoundsTransform DefaultBoundsTransform = null;

    private static /* synthetic */ void getDefaultBoundsTransform$annotations() {
    }

    public static /* synthetic */ Modifier animateBounds$default(Modifier r0, LookaheadScope r1, Modifier.Companion r2, BoundsTransform r3, boolean r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = Modifier.Companion;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r3 = DefaultBoundsTransform;
    L9:
        if ((r5 & 8) == 0) goto L12;
        r4 = false;
    L12:
        return animateBounds(r0, r1, r2, r3, r4);
    }

    public static final Modifier animateBounds(Modifier $this$animateBounds, LookaheadScope lookaheadScope, Modifier modifier, BoundsTransform boundsTransform, boolean animateMotionFrameOfReference) {
        return $this$animateBounds.then(new BoundsAnimationElement(lookaheadScope, boundsTransform, AnonymousClass1.INSTANCE, animateMotionFrameOfReference)).then(modifier).then(new BoundsAnimationElement(lookaheadScope, boundsTransform, AnonymousClass2.INSTANCE, animateMotionFrameOfReference));
    }

    static {
        DefaultBoundsTransform = new AnimateBoundsModifierKt$$ExternalSyntheticLambda0();
    }

    static final FiniteAnimationSpec DefaultBoundsTransform$lambda$0(Rect r1, Rect r2) {
        return AnimationSpecKt.spring(1.0f, 400.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion));
    }
}
