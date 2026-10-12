package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyListSnapLayoutInfoProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n\u001a\u001f\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\r\u001a\u0019\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\u0010\u0013\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0014"}, d2 = {"singleAxisViewportSize", "", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "getSingleAxisViewportSize", "(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;)I", "SnapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "rememberSnapFlingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/FlingBehavior;", "calculateFinalSnappingItem", "Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem;", "Landroidx/compose/ui/unit/Density;", "velocity", "", "(Landroidx/compose/ui/unit/Density;F)I", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyListSnapLayoutInfoProviderKt {
    public static /* synthetic */ SnapLayoutInfoProvider SnapLayoutInfoProvider$default(LazyListState r0, SnapPosition.Center r1, int r2, Object r3) {
        if ((r2 & 2) == 0) goto L6;
        r1 = SnapPosition.Center.INSTANCE;
    L6:
        return SnapLayoutInfoProvider(r0, r1);
    }

    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(final LazyListState lazyListState, final SnapPosition snapPosition) {
        return new AnonymousClass1(lazyListState, snapPosition);
    }

    public static final FlingBehavior rememberSnapFlingBehavior(LazyListState lazyListState, SnapPosition snapPosition, Composer $composer, int $changed, int r10) {
        ComposerKt.sourceInformationMarkerStart($composer, -338621290, "C(rememberSnapFlingBehavior)117@4790L79,118@4881L41:LazyListSnapLayoutInfoProvider.kt#ppz6w6");
        if ((r10 & 2) == 0) goto L6;
        SnapPosition snapPosition2 = SnapPosition.Center.INSTANCE;
        snapPosition = snapPosition2;
    L6:
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventStart(-338621290, $changed, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:115)");
    L8:
        ComposerKt.sourceInformationMarkerStart($composer, 962534174, "CC(remember):LazyListSnapLayoutInfoProvider.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L13;
        if ($composer.changed(lazyListState) == false) goto L13;
    L14:
        boolean invalid$iv = true;
    L16:
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L19;
    L22:
        Object value$iv = SnapLayoutInfoProvider(lazyListState, snapPosition);
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

    public static final int getSingleAxisViewportSize(LazyListLayoutInfo $this$singleAxisViewportSize) {
        if ($this$singleAxisViewportSize.getOrientation() != Orientation.Vertical) goto L5;
        long arg0$iv = $this$singleAxisViewportSize.mo832getViewportSizeYbymL2g();
        return (int) (4294967295L & arg0$iv);
    L5:
        long arg0$iv2 = $this$singleAxisViewportSize.mo832getViewportSizeYbymL2g();
        return (int) (arg0$iv2 >> 32);
    }

    public static final int calculateFinalSnappingItem(Density $this$calculateFinalSnappingItem, float velocity) {
        if (Math.abs(velocity) >= $this$calculateFinalSnappingItem.mo376toPx0680j_4(SnapFlingBehaviorKt.getMinFlingVelocityDp())) goto L6;
        return FinalSnappingItem.Companion.m543getClosestItembbeMdSM();
    L6:
        if (velocity <= 0.0f) goto L9;
        return FinalSnappingItem.Companion.m544getNextItembbeMdSM();
    L9:
        return FinalSnappingItem.Companion.m545getPreviousItembbeMdSM();
    }
}
