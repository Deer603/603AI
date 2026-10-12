package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyItemScopeImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ<\u0010\u000b\u001a\u00020\f*\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0016J\u0014\u0010\u0013\u001a\u00020\f*\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0014\u0010\u0015\u001a\u00020\f*\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0014\u0010\u0016\u001a\u00020\f*\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "()V", "maxHeightState", "Landroidx/compose/runtime/MutableIntState;", "maxWidthState", "setMaxSize", "", "width", "", "height", "animateItem", "Landroidx/compose/ui/Modifier;", "fadeInSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "placementSpec", "Landroidx/compose/ui/unit/IntOffset;", "fadeOutSpec", "fillParentMaxHeight", "fraction", "fillParentMaxSize", "fillParentMaxWidth", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LazyItemScopeImpl implements LazyItemScope {
    public static final int $stable = 0;
    private MutableIntState maxHeightState;
    private MutableIntState maxWidthState;

    static {
    }

    public LazyItemScopeImpl() {
        this.maxWidthState = SnapshotIntStateKt.mutableIntStateOf(Integer.MAX_VALUE);
        this.maxHeightState = SnapshotIntStateKt.mutableIntStateOf(Integer.MAX_VALUE);
    }

    public final void setMaxSize(int width, int height) {
        this.maxWidthState.setIntValue(width);
        this.maxHeightState.setIntValue(height);
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    public Modifier fillParentMaxSize(Modifier $this$fillParentMaxSize, float fraction) {
        MutableIntState r0 = this.maxWidthState;
        return $this$fillParentMaxSize.then(new ParentSizeElement(fraction, r0, this.maxHeightState, "fillParentMaxSize"));
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    public Modifier fillParentMaxWidth(Modifier $this$fillParentMaxWidth, float fraction) {
        State r4 = null;
        String r5 = "fillParentMaxWidth";
        return $this$fillParentMaxWidth.then(new ParentSizeElement(fraction, this.maxWidthState, r4, r5, 4, null));
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    public Modifier fillParentMaxHeight(Modifier $this$fillParentMaxHeight, float fraction) {
        State r3 = null;
        String r5 = "fillParentMaxHeight";
        return $this$fillParentMaxHeight.then(new ParentSizeElement(fraction, r3, this.maxHeightState, r5, 2, null));
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    public Modifier animateItem(Modifier $this$animateItem, FiniteAnimationSpec<Float> r3, FiniteAnimationSpec<IntOffset> r4, FiniteAnimationSpec<Float> r5) {
        if (r3 != null) goto L7;
        if (r4 != null) goto L7;
        if (r5 != null) goto L7;
        return $this$animateItem;
    L7:
        return $this$animateItem.then(new LazyLayoutAnimateItemElement(r3, r4, r5));
    }
}
