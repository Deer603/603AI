package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: LazyLayoutScrollDeltaBetweenPasses.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;", "", "()V", "_scrollDeltaBetweenPasses", "Landroidx/compose/animation/core/AnimationState;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "scrollDeltaBetweenPasses", "getScrollDeltaBetweenPasses$foundation_release", "()F", "updateScrollDeltaForApproach", "", "delta", "density", "Landroidx/compose/ui/unit/Density;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "updateScrollDeltaForApproach$foundation_release", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LazyLayoutScrollDeltaBetweenPasses {
    public static final int $stable = 0;
    private AnimationState<Float, AnimationVector1D> _scrollDeltaBetweenPasses;

    static {
        $stable = 8;
    }

    public LazyLayoutScrollDeltaBetweenPasses() {
        TwoWayConverter<Float, AnimationVector1D> r1 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        Float r2 = Float.valueOf(0.0f);
        this._scrollDeltaBetweenPasses = AnimationStateKt.AnimationState$default(r1, r2, r2, 0, 0, false, 56, null);
    }

    public static final /* synthetic */ AnimationState access$get_scrollDeltaBetweenPasses$p(LazyLayoutScrollDeltaBetweenPasses $this) {
        return $this._scrollDeltaBetweenPasses;
    }

    public final float getScrollDeltaBetweenPasses$foundation_release() {
        return this._scrollDeltaBetweenPasses.getValue().floatValue();
    }

    public final void updateScrollDeltaForApproach$foundation_release(float delta, Density density, CoroutineScope coroutineScope) {
        if (delta > density.mo376toPx0680j_4(LazyLayoutScrollDeltaBetweenPassesKt.access$getDeltaThresholdForScrollAnimation$p())) goto L5;
        return;
    L5:
        Snapshot.Companion this_$iv = Snapshot.Companion;
        Snapshot previousSnapshot$iv = this_$iv.getCurrentThreadSnapshot();
        if (previousSnapshot$iv == null) goto L8;
        Function1<Object, Unit> r6 = previousSnapshot$iv.getReadObserver();
    L9:
        Snapshot newSnapshot$iv = this_$iv.makeCurrentNonObservable(previousSnapshot$iv);
        float currentDelta = this._scrollDeltaBetweenPasses.getValue().floatValue();     // Catch: Throwable -> L16
        if (this._scrollDeltaBetweenPasses.isRunning() == false) goto L13;
        this._scrollDeltaBetweenPasses = AnimationStateKt.copy$default(this._scrollDeltaBetweenPasses, currentDelta - delta, 0.0f, 0, 0, false, 30, null);     // Catch: Throwable -> L16
        BuildersKt.launch$default(coroutineScope, null, null, new LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1(this, null), 3, null);     // Catch: Throwable -> L16
    L14:
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r6);
        return;
    L13:
        this._scrollDeltaBetweenPasses = new AnimationState(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), Float.valueOf(-delta), null, 0, 0, false, 60, null);     // Catch: Throwable -> L16
        BuildersKt.launch$default(coroutineScope, null, null, new LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$2(this, null), 3, null);     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, r6);
        throw th;
    L8:
        r6 = null;
        goto L9
    }
}
