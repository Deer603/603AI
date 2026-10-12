package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: TransitionComposeAnimation.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0002H\u0000¨\u0006\u0003"}, d2 = {"parse", "Landroidx/compose/ui/tooling/animation/TransitionComposeAnimation;", "Landroidx/compose/animation/core/Transition;", "ui-tooling_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TransitionComposeAnimation_androidKt {
    public static final TransitionComposeAnimation<?> parse(Transition<?> r5) {
        Object state = r5.getCurrentState();
        if (state == null) goto L13;
        Object[] r2 = state.getClass().getEnumConstants();
        if (r2 == null) goto L8;
        Set states = ArraysKt.toSet(r2);
        if (states == null) goto L8;
    L9:
        String r4 = r5.getLabel();
        if (r4 != null) goto L15;
        r4 = Reflection.getOrCreateKotlinClass(state.getClass()).getSimpleName();
    L15:
        return new TransitionComposeAnimation(r5, states, r4);
    L8:
        states = SetsKt.setOf(state);
        goto L9
    L13:
        return null;
    }
}
