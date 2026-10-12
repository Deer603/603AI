package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import kotlin.Metadata;

/* JADX INFO: compiled from: AnimatedVisibilityComposeAnimation.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¨\u0006\u0004"}, d2 = {"parseAnimatedVisibility", "Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "Landroidx/compose/animation/core/Transition;", "", "ui-tooling_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AnimatedVisibilityComposeAnimation_androidKt {
    public static final AnimatedVisibilityComposeAnimation parseAnimatedVisibility(Transition<Boolean> r2) {
        String r1 = r2.getLabel();
        if (r1 != null) goto L6;
        r1 = "AnimatedVisibility";
    L6:
        return new AnimatedVisibilityComposeAnimation(r2, r1);
    }
}
