package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyGridSnapLayoutInfoProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n\u001a\u001f\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\r\u001a\u0014\u0010\u000e\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u001a\u0014\u0010\u0012\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0013"}, d2 = {"singleAxisViewportSize", "", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "getSingleAxisViewportSize", "(Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)I", "SnapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "lazyGridState", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "rememberSnapFlingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/FlingBehavior;", "offsetOnMainAxis", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "sizeOnMainAxis", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyGridSnapLayoutInfoProviderKt {
    public static /* synthetic */ SnapLayoutInfoProvider SnapLayoutInfoProvider$default(LazyGridState r0, SnapPosition.Center r1, int r2, Object r3) {
        if ((r2 & 2) == 0) goto L6;
        r1 = SnapPosition.Center.INSTANCE;
    L6:
        return SnapLayoutInfoProvider(r0, r1);
    }

    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(final LazyGridState lazyGridState, final SnapPosition snapPosition) {
        return new AnonymousClass1(lazyGridState, snapPosition);
    }

    public static final FlingBehavior rememberSnapFlingBehavior(LazyGridState lazyGridState, SnapPosition snapPosition, Composer $composer, int $changed, int r10) {
        ComposerKt.sourceInformationMarkerStart($composer, -234434234, "C(rememberSnapFlingBehavior)116@4907L79,117@4998L41:LazyGridSnapLayoutInfoProvider.kt#ppz6w6");
        if ((r10 & 2) == 0) goto L6;
        SnapPosition snapPosition2 = SnapPosition.Center.INSTANCE;
        snapPosition = snapPosition2;
    L6:
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventStart(-234434234, $changed, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyGridSnapLayoutInfoProvider.kt:114)");
    L8:
        ComposerKt.sourceInformationMarkerStart($composer, 962537918, "CC(remember):LazyGridSnapLayoutInfoProvider.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L13;
        if ($composer.changed(lazyGridState) == false) goto L13;
    L14:
        boolean invalid$iv = true;
    L16:
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L19;
    L22:
        Object value$iv = SnapLayoutInfoProvider(lazyGridState, snapPosition);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L23:
        SnapLayoutInfoProvider snappingLayout = (SnapLayoutInfoProvider) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        TargetedFlingBehavior r11 = SnapFlingBehaviorKt.rememberSnapFlingBehavior(snappingLayout, $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L26;
        ComposerKt.traceEventEnd();
    L26:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r11;
    L19:
        if (it$iv != Composer.Companion.getEmpty()) goto L23;
    L13:
        if (($changed & 6) == 4) goto L14;
        invalid$iv = false;
        goto L16
    }

    public static final int getSingleAxisViewportSize(LazyGridLayoutInfo $this$singleAxisViewportSize) {
        if ($this$singleAxisViewportSize.getOrientation() != Orientation.Vertical) goto L5;
        long arg0$iv = $this$singleAxisViewportSize.mo868getViewportSizeYbymL2g();
        return (int) (4294967295L & arg0$iv);
    L5:
        long arg0$iv2 = $this$singleAxisViewportSize.mo868getViewportSizeYbymL2g();
        return (int) (arg0$iv2 >> 32);
    }

    public static final int sizeOnMainAxis(LazyGridItemInfo $this$sizeOnMainAxis, Orientation orientation) {
        if (orientation != Orientation.Vertical) goto L5;
        long arg0$iv = $this$sizeOnMainAxis.mo865getSizeYbymL2g();
        return (int) (4294967295L & arg0$iv);
    L5:
        long arg0$iv2 = $this$sizeOnMainAxis.mo865getSizeYbymL2g();
        return (int) (arg0$iv2 >> 32);
    }

    public static final int offsetOnMainAxis(LazyGridItemInfo $this$offsetOnMainAxis, Orientation orientation) {
        if (orientation != Orientation.Vertical) goto L6;
        return IntOffset.m7102getYimpl($this$offsetOnMainAxis.mo864getOffsetnOccac());
    L6:
        return IntOffset.m7101getXimpl($this$offsetOnMainAxis.mo864getOffsetnOccac());
    }
}
