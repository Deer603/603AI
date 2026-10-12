package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FlowLayoutBuildingBlocks.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0002\"#B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ8\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003JZ\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b \u0010!R\u0016\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;", "", "maxItemsInMainAxis", "", "overflow", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "constraints", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "maxLines", "mainAxisSpacing", "crossAxisSpacing", "(ILandroidx/compose/foundation/layout/FlowLayoutOverflowState;JIIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "getWrapEllipsisInfo", "Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", "wrapInfo", "Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;", "hasNext", "", "lastContentLineIndex", "totalCrossAxisSize", "leftOverMainAxis", "nextIndexInLine", "getWrapInfo", "nextItemHasNext", "leftOver", "Landroidx/collection/IntIntPair;", "nextSize", "lineIndex", "currentLineCrossAxisSize", "isWrappingRound", "isEllipsisWrap", "getWrapInfo-OpUlnko", "(ZIJLandroidx/collection/IntIntPair;IIIZZ)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;", "WrapEllipsisInfo", "WrapInfo", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FlowLayoutBuildingBlocks {
    public static final int $stable = 0;
    private final long constraints;
    private final int crossAxisSpacing;
    private final int mainAxisSpacing;
    private final int maxItemsInMainAxis;
    private final int maxLines;
    private final FlowLayoutOverflowState overflow;

    /* JADX INFO: compiled from: FlowLayoutBuildingBlocks.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", "", "ellipsis", "Landroidx/compose/ui/layout/Measurable;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "ellipsisSize", "Landroidx/collection/IntIntPair;", "placeEllipsisOnLastContentLine", "", "(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/ui/layout/Placeable;JZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEllipsis", "()Landroidx/compose/ui/layout/Measurable;", "getEllipsisSize-OO21N7I", "()J", "J", "getPlaceEllipsisOnLastContentLine", "()Z", "setPlaceEllipsisOnLastContentLine", "(Z)V", "getPlaceable", "()Landroidx/compose/ui/layout/Placeable;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WrapEllipsisInfo {
        public static final int $stable = 0;
        private final Measurable ellipsis;
        private final long ellipsisSize;
        private boolean placeEllipsisOnLastContentLine;
        private final Placeable placeable;

        static {
            $stable = 8;
        }

        public /* synthetic */ WrapEllipsisInfo(Measurable r1, Placeable r2, long r3, boolean r5, DefaultConstructorMarker r6) {
            this(r1, r2, r3, r5);
        }

        private WrapEllipsisInfo(Measurable ellipsis, Placeable placeable, long ellipsisSize, boolean placeEllipsisOnLastContentLine) {
            this.ellipsis = ellipsis;
            this.placeable = placeable;
            this.ellipsisSize = ellipsisSize;
            this.placeEllipsisOnLastContentLine = placeEllipsisOnLastContentLine;
        }

        public /* synthetic */ WrapEllipsisInfo(Measurable r8, Placeable r9, long r10, boolean r12, int r13, DefaultConstructorMarker r14) {
            if ((r13 & 8) == 0) goto L5;
            boolean r5 = true;
        L6:
            this(r8, r9, r10, r5, null);
            return;
        L5:
            r5 = r12;
            goto L6
        }

        public final Measurable getEllipsis() {
            return this.ellipsis;
        }

        public final Placeable getPlaceable() {
            return this.placeable;
        }

        /* JADX INFO: renamed from: getEllipsisSize-OO21N7I, reason: not valid java name */
        public final long m648getEllipsisSizeOO21N7I() {
            return this.ellipsisSize;
        }

        public final boolean getPlaceEllipsisOnLastContentLine() {
            return this.placeEllipsisOnLastContentLine;
        }

        public final void setPlaceEllipsisOnLastContentLine(boolean r1) {
            this.placeEllipsisOnLastContentLine = r1;
        }
    }

    /* JADX INFO: compiled from: FlowLayoutBuildingBlocks.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;", "", "isLastItemInLine", "", "isLastItemInContainer", "(ZZ)V", "()Z", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WrapInfo {
        public static final int $stable = 0;
        private final boolean isLastItemInContainer;
        private final boolean isLastItemInLine;

        static {
        }

        public WrapInfo() {
            boolean r2 = false;
            this(r2, r2, 3, null);
        }

        public WrapInfo(boolean isLastItemInLine, boolean isLastItemInContainer) {
            this.isLastItemInLine = isLastItemInLine;
            this.isLastItemInContainer = isLastItemInContainer;
        }

        public /* synthetic */ WrapInfo(boolean r2, boolean r3, int r4, DefaultConstructorMarker r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = false;
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = false;
        L8:
            this(r2, r3);
        }

        public final boolean isLastItemInLine() {
            return this.isLastItemInLine;
        }

        public final boolean isLastItemInContainer() {
            return this.isLastItemInContainer;
        }
    }

    static {
        $stable = 8;
    }

    public /* synthetic */ FlowLayoutBuildingBlocks(int r1, FlowLayoutOverflowState r2, long r3, int r5, int r6, int r7, DefaultConstructorMarker r8) {
        this(r1, r2, r3, r5, r6, r7);
    }

    private FlowLayoutBuildingBlocks(int maxItemsInMainAxis, FlowLayoutOverflowState overflow, long constraints, int maxLines, int mainAxisSpacing, int crossAxisSpacing) {
        this.maxItemsInMainAxis = maxItemsInMainAxis;
        this.overflow = overflow;
        this.constraints = constraints;
        this.maxLines = maxLines;
        this.mainAxisSpacing = mainAxisSpacing;
        this.crossAxisSpacing = crossAxisSpacing;
    }

    public final WrapEllipsisInfo getWrapEllipsisInfo(WrapInfo wrapInfo, boolean hasNext, int lastContentLineIndex, int totalCrossAxisSize, int leftOverMainAxis, int nextIndexInLine) {
        if (wrapInfo.isLastItemInContainer() == true) goto L5;
        return null;
    L5:
        WrapEllipsisInfo ellipsisInfo = this.overflow.ellipsisInfo$foundation_layout_release(hasNext, lastContentLineIndex, totalCrossAxisSize);
        if (ellipsisInfo != null) goto L9;
        return null;
    L9:
        if (lastContentLineIndex < 0) goto L16;
        if (nextIndexInLine != 0) goto L12;
    L15:
        boolean canFitLine = true;
    L17:
        ellipsisInfo.setPlaceEllipsisOnLastContentLine(canFitLine);
        return ellipsisInfo;
    L12:
        if ((leftOverMainAxis - IntIntPair.m20getFirstimpl(ellipsisInfo.m648getEllipsisSizeOO21N7I())) < 0) goto L16;
        if (nextIndexInLine < this.maxItemsInMainAxis) goto L15;
    L16:
        canFitLine = false;
        goto L17
    }

    /* JADX INFO: renamed from: getWrapInfo-OpUlnko, reason: not valid java name */
    public final WrapInfo m647getWrapInfoOpUlnko(boolean nextItemHasNext, int nextIndexInLine, long leftOver, IntIntPair nextSize, int lineIndex, int totalCrossAxisSize, int currentLineCrossAxisSize, boolean isWrappingRound, boolean isEllipsisWrap) {
        int totalContainerCrossAxisSize = totalCrossAxisSize + currentLineCrossAxisSize;
        if (nextSize != null) goto L7;
        return new WrapInfo(true, true);
    L7:
        if (this.overflow.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.Visible) goto L10;
        boolean r1 = false;
    L16:
        boolean willOverflowCrossAxis = r1;
        if (willOverflowCrossAxis == true) goto L19;
        if (nextIndexInLine != 0) goto L24;
        boolean r2 = false;
    L30:
        boolean shouldWrapItem = r2;
        if (shouldWrapItem == false) goto L37;
        if (isWrappingRound == true) goto L34;
        long arg0$iv = this.constraints;
        return new WrapInfo(true, m647getWrapInfoOpUlnko(nextItemHasNext, 0, IntIntPair.m16constructorimpl(Constraints.m6926getMaxWidthimpl(arg0$iv), (IntIntPair.m21getSecondimpl(leftOver) - this.crossAxisSpacing) - currentLineCrossAxisSize), IntIntPair.m13boximpl(IntIntPair.m16constructorimpl(IntIntPair.m20getFirstimpl(nextSize.m24unboximpl()) - this.mainAxisSpacing, IntIntPair.m21getSecondimpl(nextSize.m24unboximpl()))), lineIndex + 1, totalContainerCrossAxisSize, 0, true, false).isLastItemInContainer());
    L34:
        return new WrapInfo(true, true);
    L37:
        int totalContainerCrossAxisSize2 = totalCrossAxisSize + Math.max(currentLineCrossAxisSize, IntIntPair.m21getSecondimpl(nextSize.m24unboximpl()));
        if (isEllipsisWrap == false) goto L40;
        IntIntPair ellipsis = null;
    L42:
        if (ellipsis == null) goto L51;
        ellipsis.m24unboximpl();
        if ((nextIndexInLine + 1) < this.maxItemsInMainAxis) goto L47;
        boolean r4 = true;
    L52:
        boolean shouldWrapEllipsis = r4;
        if (shouldWrapEllipsis == false) goto L60;
        if (isEllipsisWrap == true) goto L56;
        long arg0$iv2 = this.constraints;
        WrapInfo wrapInfo = m647getWrapInfoOpUlnko(false, 0, IntIntPair.m16constructorimpl(Constraints.m6926getMaxWidthimpl(arg0$iv2), (IntIntPair.m21getSecondimpl(leftOver) - this.crossAxisSpacing) - Math.max(currentLineCrossAxisSize, IntIntPair.m21getSecondimpl(nextSize.m24unboximpl()))), ellipsis, lineIndex + 1, totalContainerCrossAxisSize2, 0, true, true);
        return new WrapInfo(wrapInfo.isLastItemInContainer(), wrapInfo.isLastItemInContainer());
    L56:
        return new WrapInfo(true, true);
    L60:
        return new WrapInfo(false, false);
    L47:
        if ((((IntIntPair.m20getFirstimpl(leftOver) - IntIntPair.m20getFirstimpl(nextSize.m24unboximpl())) - this.mainAxisSpacing) - IntIntPair.m20getFirstimpl(ellipsis.m24unboximpl())) >= 0) goto L49;
        r4 = true;
        goto L52
    L49:
        r4 = false;
        goto L52
    L51:
        r4 = false;
        goto L52
    L40:
        ellipsis = this.overflow.m652ellipsisSizeF35zmw$foundation_layout_release(nextItemHasNext, lineIndex, totalContainerCrossAxisSize2);
        goto L42
    L24:
        if (nextIndexInLine < this.maxItemsInMainAxis) goto L27;
        r2 = true;
        goto L30
    L27:
        if ((IntIntPair.m20getFirstimpl(leftOver) - IntIntPair.m20getFirstimpl(nextSize.m24unboximpl())) >= 0) goto L29;
        r2 = true;
        goto L30
    L29:
        r2 = false;
        goto L30
    L19:
        return new WrapInfo(true, true);
    L10:
        if (lineIndex < this.maxLines) goto L13;
        r1 = true;
        goto L16
    L13:
        if ((IntIntPair.m21getSecondimpl(leftOver) - IntIntPair.m21getSecondimpl(nextSize.m24unboximpl())) >= 0) goto L15;
        r1 = true;
        goto L16
    L15:
        r1 = false;
        goto L16
    }
}
