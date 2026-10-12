package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyStaggeredGridItemScope.kt */
/* JADX INFO: loaded from: classes.dex */
@LazyStaggeredGridScopeMarker
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001JB\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&\u0082\u0001\u0001\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "", "animateItem", "Landroidx/compose/ui/Modifier;", "fadeInSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "placementSpec", "Landroidx/compose/ui/unit/IntOffset;", "fadeOutSpec", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScopeImpl;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LazyStaggeredGridItemScope {
    Modifier animateItem(Modifier r1, FiniteAnimationSpec<Float> r2, FiniteAnimationSpec<IntOffset> r3, FiniteAnimationSpec<Float> r4);

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Modifier animateItem$default(LazyStaggeredGridItemScope r6, Modifier r7, SpringSpec r8, SpringSpec r9, SpringSpec r10, int r11, Object r12) {
        if (r12 != null) goto L15;
        if ((r11 & 1) == 0) goto L7;
        r8 = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
    L7:
        if ((r11 & 2) == 0) goto L10;
        r9 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m7092boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
    L10:
        if ((r11 & 4) == 0) goto L13;
        r10 = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
    L13:
        return r6.animateItem(r7, r8, r9, r10);
    L15:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItem");
    }
}
