package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.PagerSnapDistance;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: PagerSnapLayoutInfoProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000\u001a8\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0000\u001a\u0017\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082\b\u001a\f\u0010\u0014\u001a\u00020\b*\u00020\u0003H\u0002\u001a\u0014\u0010\u0015\u001a\u00020\u0016*\u00020\u00032\u0006\u0010\u0017\u001a\u00020\bH\u0002¨\u0006\u0018"}, d2 = {"SnapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "pagerState", "Landroidx/compose/foundation/pager/PagerState;", "pagerSnapDistance", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "calculateFinalSnappingBound", "Lkotlin/Function3;", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "snapPositionalThreshold", "flingVelocity", "lowerBoundOffset", "upperBoundOffset", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "dragGestureDelta", "isScrollingForward", "", "velocity", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PagerSnapLayoutInfoProviderKt {
    public static final /* synthetic */ boolean access$isScrollingForward(PagerState $receiver, float velocity) {
        return isScrollingForward($receiver, velocity);
    }

    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(final PagerState pagerState, final PagerSnapDistance pagerSnapDistance, final Function3<? super Float, ? super Float, ? super Float, Float> r3) {
        return new AnonymousClass1(pagerState, r3, pagerSnapDistance);
    }

    private static final boolean isScrollingForward(PagerState $this$isScrollingForward, float velocity) {
        boolean reverseScrollDirection = $this$isScrollingForward.getLayoutInfo().getReverseLayout();
        if ($this$isScrollingForward.isNotGestureAction$foundation_release() == false) goto L5;
        float r1 = -velocity;
    L7:
        if (r1 <= 0.0f) goto L9;
        boolean isForward = true;
    L11:
        if (isForward == false) goto L13;
        if (reverseScrollDirection == false) goto L13;
        return true;
    L13:
        if (isForward == true) goto L17;
        if (reverseScrollDirection == true) goto L17;
        return true;
    L17:
        return false;
    L9:
        isForward = false;
        goto L11
    L5:
        r1 = dragGestureDelta($this$isScrollingForward);
        goto L7
    }

    private static final float dragGestureDelta(PagerState $this$dragGestureDelta) {
        if ($this$dragGestureDelta.getLayoutInfo().getOrientation() != Orientation.Horizontal) goto L5;
        long arg0$iv = $this$dragGestureDelta.m982getUpDownDifferenceF1C5BW0$foundation_release();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        return Float.intBitsToFloat(bits$iv$iv$iv);
    L5:
        long arg0$iv2 = $this$dragGestureDelta.m982getUpDownDifferenceF1C5BW0$foundation_release();
        int bits$iv$iv$iv2 = (int) (4294967295L & arg0$iv2);
        return Float.intBitsToFloat(bits$iv$iv$iv2);
    }

    private static final void debugLog(Function0<String> r1) {
    }

    public static final float calculateFinalSnappingBound(PagerState pagerState, LayoutDirection layoutDirection, float snapPositionalThreshold, float flingVelocity, float lowerBoundOffset, float upperBoundOffset) {
        boolean isScrollingForward = isScrollingForward(pagerState, flingVelocity);
        if (pagerState.getLayoutInfo().getOrientation() != Orientation.Vertical) goto L6;
    L7:
        boolean isForward = isScrollingForward;
    L11:
        int pageSize = pagerState.getLayoutInfo().getPageSize();
        if (pageSize != 0) goto L14;
        float offsetFromSnappedPosition = 0.0f;
    L15:
        float offsetFromSnappedPositionOverflow = offsetFromSnappedPosition - ((int) offsetFromSnappedPosition);
        Density $this$calculateFinalSnappingBound_u24lambda_u241 = pagerState.getDensity$foundation_release();
        int finalSnappingItem = LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem($this$calculateFinalSnappingBound_u24lambda_u241, flingVelocity);
        if (FinalSnappingItem.m539equalsimpl0(finalSnappingItem, FinalSnappingItem.Companion.m543getClosestItembbeMdSM()) == false) goto L32;
        if (Math.abs(offsetFromSnappedPositionOverflow) <= snapPositionalThreshold) goto L23;
        if (isForward == true) goto L38;
    L39:
        return lowerBoundOffset;
    L38:
        return upperBoundOffset;
    L23:
        if (Math.abs(offsetFromSnappedPosition) < Math.abs(pagerState.getPositionThresholdFraction$foundation_release())) goto L28;
        if (isForward == false) goto L38;
    L28:
        if (Math.abs(lowerBoundOffset) >= Math.abs(upperBoundOffset)) goto L38;
    L32:
        if (FinalSnappingItem.m539equalsimpl0(finalSnappingItem, FinalSnappingItem.Companion.m544getNextItembbeMdSM()) == true) goto L38;
        if (FinalSnappingItem.m539equalsimpl0(finalSnappingItem, FinalSnappingItem.Companion.m545getPreviousItembbeMdSM()) == true) goto L39;
        return 0.0f;
    L14:
        offsetFromSnappedPosition = dragGestureDelta(pagerState) / pageSize;
        goto L15
    L6:
        if (layoutDirection == LayoutDirection.Ltr) goto L7;
        if (isScrollingForward == true) goto L10;
        isForward = true;
        goto L11
    L10:
        isForward = false;
        goto L11
    }
}
