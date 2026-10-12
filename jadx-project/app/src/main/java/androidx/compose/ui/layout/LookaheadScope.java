package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;

/* JADX INFO: compiled from: LookaheadScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J2\u0010\u0007\u001a\u00020\b*\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u000f\u001a\u00020\u0003*\u00020\u0003H&R\u0016\u0010\u0002\u001a\u00020\u0003*\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/LookaheadScope;", "", "lookaheadScopeCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getLookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "localLookaheadPositionOf", "Landroidx/compose/ui/geometry/Offset;", "sourceCoordinates", "relativeToSource", "includeMotionFrameOfReference", "", "localLookaheadPositionOf-au-aQtc", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "toLookaheadCoordinates", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LookaheadScope {
    LayoutCoordinates getLookaheadScopeCoordinates(Placeable.PlacementScope r1);

    LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates r1);

    /* JADX INFO: renamed from: localLookaheadPositionOf-au-aQtc$default, reason: not valid java name */
    static /* synthetic */ long m5742localLookaheadPositionOfauaQtc$default(LookaheadScope r6, LayoutCoordinates r7, LayoutCoordinates r8, long r9, boolean r11, int r12, Object r13) {
        if (r13 != null) goto L14;
        if ((r12 & 2) == 0) goto L6;
        long r3 = Offset.Companion.m4141getZeroF1C5BW0();
    L8:
        if ((r12 & 4) == 0) goto L10;
        boolean r5 = true;
    L12:
        return r6.mo108localLookaheadPositionOfauaQtc(r7, r8, r3, r5);
    L10:
        r5 = r11;
        goto L12
    L6:
        r3 = r9;
        goto L8
    L14:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localLookaheadPositionOf-au-aQtc");
    }

    /* JADX INFO: renamed from: localLookaheadPositionOf-au-aQtc */
    default long mo108localLookaheadPositionOfauaQtc(LayoutCoordinates $this$localLookaheadPositionOf_u2dau_u2daQtc, LayoutCoordinates sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        return LookaheadScopeKt.m5743localLookaheadPositionOfFgt4K4Q(this, $this$localLookaheadPositionOf_u2dau_u2daQtc, sourceCoordinates, relativeToSource, includeMotionFrameOfReference);
    }
}
