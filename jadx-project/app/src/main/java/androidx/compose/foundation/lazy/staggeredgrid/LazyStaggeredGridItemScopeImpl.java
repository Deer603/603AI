package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyStaggeredGridItemScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u00020\u0004*\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScopeImpl;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "()V", "animateItem", "Landroidx/compose/ui/Modifier;", "fadeInSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "placementSpec", "Landroidx/compose/ui/unit/IntOffset;", "fadeOutSpec", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LazyStaggeredGridItemScopeImpl implements LazyStaggeredGridItemScope {
    public static final int $stable = 0;
    public static final LazyStaggeredGridItemScopeImpl INSTANCE = null;

    static {
        INSTANCE = new LazyStaggeredGridItemScopeImpl();
    }

    private LazyStaggeredGridItemScopeImpl() {
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope
    public Modifier animateItem(Modifier $this$animateItem, FiniteAnimationSpec<Float> r3, FiniteAnimationSpec<IntOffset> r4, FiniteAnimationSpec<Float> r5) {
        if (r3 != null) goto L7;
        if (r4 != null) goto L7;
        if (r5 != null) goto L7;
        return $this$animateItem;
    L7:
        return $this$animateItem.then(new LazyLayoutAnimateItemElement(r3, r4, r5));
    }
}
