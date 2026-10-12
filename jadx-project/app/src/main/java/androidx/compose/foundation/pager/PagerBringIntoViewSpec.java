package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: LazyLayoutPager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/pager/PagerBringIntoViewSpec;", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "pagerState", "Landroidx/compose/foundation/pager/PagerState;", "defaultBringIntoViewSpec", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "getDefaultBringIntoViewSpec", "()Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "getPagerState", "()Landroidx/compose/foundation/pager/PagerState;", "calculateScrollDistance", "", "offset", "size", "containerSize", "overrideProposedOffsetMove", "proposedOffsetMove", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class PagerBringIntoViewSpec implements BringIntoViewSpec {
    private final BringIntoViewSpec defaultBringIntoViewSpec;
    private final PagerState pagerState;

    public PagerBringIntoViewSpec(PagerState pagerState, BringIntoViewSpec defaultBringIntoViewSpec) {
        this.pagerState = pagerState;
        this.defaultBringIntoViewSpec = defaultBringIntoViewSpec;
    }

    public final PagerState getPagerState() {
        return this.pagerState;
    }

    public final BringIntoViewSpec getDefaultBringIntoViewSpec() {
        return this.defaultBringIntoViewSpec;
    }

    @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
    public float calculateScrollDistance(float offset, float size, float containerSize) {
        float proposedOffsetMove = this.defaultBringIntoViewSpec.calculateScrollDistance(offset, size, containerSize);
        boolean r3 = true;
        if (offset <= 0.0f) goto L9;
        if ((offset + size) <= containerSize) goto L7;
        boolean isItemOutView = true;
    L13:
        if (Math.abs(proposedOffsetMove) == 0.0f) goto L16;
        r3 = false;
    L16:
        if (r3 == true) goto L20;
        if (isItemOutView == false) goto L20;
        float finalOffset = overrideProposedOffsetMove(proposedOffsetMove);
        return finalOffset;
    L20:
        if (Math.abs(this.pagerState.getFirstVisiblePageOffset$foundation_release()) < 1.0E-6d) goto L30;
        float reversedFirstPageScroll = this.pagerState.getFirstVisiblePageOffset$foundation_release() * (-1.0f);
        if (this.pagerState.getLastScrolledForward() == false) goto L25;
        float r4 = this.pagerState.getPageSizeWithSpacing$foundation_release() + reversedFirstPageScroll;
    L26:
        float finalOffset2 = RangesKt.coerceIn(r4, -containerSize, containerSize);
        return finalOffset2;
    L25:
        r4 = reversedFirstPageScroll;
        goto L26
    L30:
        return 0.0f;
    L7:
        isItemOutView = false;
        goto L13
    L9:
        if ((offset + size) > 0.0f) goto L11;
        isItemOutView = true;
        goto L13
    L11:
        isItemOutView = false;
        goto L13
    }

    private final float overrideProposedOffsetMove(float proposedOffsetMove) {
        float correctedOffset = this.pagerState.getFirstVisiblePageOffset$foundation_release() * (-1.0f);
    L4:
        if (proposedOffsetMove <= 0.0f) goto L9;
        if (correctedOffset >= proposedOffsetMove) goto L9;
        correctedOffset = correctedOffset + this.pagerState.getPageSizeWithSpacing$foundation_release();
    L9:
        if (proposedOffsetMove >= 0.0f) goto L13;
        if (correctedOffset <= proposedOffsetMove) goto L13;
        correctedOffset = correctedOffset - this.pagerState.getPageSizeWithSpacing$foundation_release();
    L13:
        return correctedOffset;
    }
}
