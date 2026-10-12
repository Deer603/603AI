package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyItemScope.kt */
/* JADX INFO: loaded from: classes.dex */
@LazyScopeMarker
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001JB\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0016J\u0016\u0010\n\u001a\u00020\u0003*\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u0006H&J\u0016\u0010\f\u001a\u00020\u0003*\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u0006H&J\u0016\u0010\r\u001a\u00020\u0003*\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyItemScope;", "", "animateItem", "Landroidx/compose/ui/Modifier;", "fadeInSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "placementSpec", "Landroidx/compose/ui/unit/IntOffset;", "fadeOutSpec", "fillParentMaxHeight", "fraction", "fillParentMaxSize", "fillParentMaxWidth", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LazyItemScope {

    /* JADX INFO: compiled from: LazyItemScope.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Modifier fillParentMaxSize$default(LazyItemScope r0, Modifier r1, float r2, int r3, Object r4) {
            return LazyItemScope.fillParentMaxSize$default(r0, r1, r2, r3, r4);
        }

        public static /* synthetic */ Modifier fillParentMaxWidth$default(LazyItemScope r0, Modifier r1, float r2, int r3, Object r4) {
            return LazyItemScope.fillParentMaxWidth$default(r0, r1, r2, r3, r4);
        }

        public static /* synthetic */ Modifier fillParentMaxHeight$default(LazyItemScope r0, Modifier r1, float r2, int r3, Object r4) {
            return LazyItemScope.fillParentMaxHeight$default(r0, r1, r2, r3, r4);
        }

        @Deprecated
        public static Modifier animateItem(LazyItemScope $this, Modifier $receiver, FiniteAnimationSpec<Float> r3, FiniteAnimationSpec<IntOffset> r4, FiniteAnimationSpec<Float> r5) {
            return LazyItemScope.access$animateItem$jd($this, $receiver, r3, r4, r5);
        }

        public static /* synthetic */ Modifier animateItem$default(LazyItemScope r0, Modifier r1, FiniteAnimationSpec r2, FiniteAnimationSpec r3, FiniteAnimationSpec r4, int r5, Object r6) {
            return LazyItemScope.animateItem$default(r0, r1, r2, r3, r4, r5, r6);
        }
    }

    Modifier fillParentMaxHeight(Modifier r1, float r2);

    Modifier fillParentMaxSize(Modifier r1, float r2);

    Modifier fillParentMaxWidth(Modifier r1, float r2);

    static /* synthetic */ Modifier access$animateItem$jd(LazyItemScope $this, Modifier $receiver, FiniteAnimationSpec fadeInSpec, FiniteAnimationSpec placementSpec, FiniteAnimationSpec fadeOutSpec) {
        return super.animateItem($receiver, fadeInSpec, placementSpec, fadeOutSpec);
    }

    static /* synthetic */ Modifier fillParentMaxSize$default(LazyItemScope r0, Modifier r1, float r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 1) == 0) goto L7;
        r2 = 1.0f;
    L7:
        return r0.fillParentMaxSize(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxSize");
    }

    static /* synthetic */ Modifier fillParentMaxWidth$default(LazyItemScope r0, Modifier r1, float r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 1) == 0) goto L7;
        r2 = 1.0f;
    L7:
        return r0.fillParentMaxWidth(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
    }

    static /* synthetic */ Modifier fillParentMaxHeight$default(LazyItemScope r0, Modifier r1, float r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 1) == 0) goto L7;
        r2 = 1.0f;
    L7:
        return r0.fillParentMaxHeight(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxHeight");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Modifier animateItem$default(LazyItemScope r6, Modifier r7, SpringSpec r8, SpringSpec r9, SpringSpec r10, int r11, Object r12) {
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

    default Modifier animateItem(Modifier $this$animateItem, FiniteAnimationSpec<Float> r2, FiniteAnimationSpec<IntOffset> r3, FiniteAnimationSpec<Float> r4) {
        return $this$animateItem;
    }
}
