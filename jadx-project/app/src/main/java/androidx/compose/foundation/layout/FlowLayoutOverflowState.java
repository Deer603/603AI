package androidx.compose.foundation.layout;

import androidx.autofill.HintConstants;
import androidx.collection.IntIntPair;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FlowLayoutOverflow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u000e\u0010*\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b+J\u000e\u0010,\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b-J\u000e\u0010.\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b/J'\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J'\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005H\u0000¢\u0006\u0002\b6J-\u00107\u001a\u0004\u0018\u00010\r2\u0006\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b8J\u0013\u00109\u001a\u00020\u00102\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0005HÖ\u0001J6\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\b\u0010\u001f\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010@\u001a\u00020AH\u0000ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\\\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A28\u0010\u000e\u001a4\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(D\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ6\u0010<\u001a\u00020=2\b\u0010\u001f\u001a\u0004\u0018\u00010G2\b\u0010\b\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020\u00102\u0006\u0010@\u001a\u00020AH\u0000ø\u0001\u0000¢\u0006\u0004\bB\u0010IJ\t\u0010J\u001a\u00020%HÖ\u0001R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000RB\u0010\u000e\u001a6\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\u0004\u0018\u00010\rX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0017R\u0014\u0010$\u001a\u00020%X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006K"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "minLinesToShowCollapse", "", "minCrossAxisSizeToShowCollapse", "(Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;II)V", "collapseMeasurable", "Landroidx/compose/ui/layout/Measurable;", "collapsePlaceable", "Landroidx/compose/ui/layout/Placeable;", "collapseSize", "Landroidx/collection/IntIntPair;", "getOverflowMeasurable", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "isExpandable", "noOfItemsShown", "itemCount", "getItemCount$foundation_layout_release", "()I", "setItemCount$foundation_layout_release", "(I)V", "itemShown", "getItemShown$foundation_layout_release", "setItemShown$foundation_layout_release", "getMinCrossAxisSizeToShowCollapse$foundation_layout_release", "getMinLinesToShowCollapse$foundation_layout_release", "seeMoreMeasurable", "seeMorePlaceable", "seeMoreSize", "shownItemCount", "getShownItemCount$foundation_layout_release", "shownItemLazyErrorMessage", "", "getShownItemLazyErrorMessage$foundation_layout_release", "()Ljava/lang/String;", "getType$foundation_layout_release", "()Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "component1", "component1$foundation_layout_release", "component2", "component2$foundation_layout_release", "component3", "component3$foundation_layout_release", "copy", "ellipsisInfo", "Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", "hasNext", "lineIndex", "totalCrossAxisSize", "ellipsisInfo$foundation_layout_release", "ellipsisSize", "ellipsisSize-F35zm-w$foundation_layout_release", "equals", "other", "hashCode", "setOverflowMeasurables", "", "measurePolicy", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "setOverflowMeasurables--hBUhpc$foundation_layout_release", "(Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;Landroidx/compose/ui/layout/Measurable;Landroidx/compose/ui/layout/Measurable;J)V", "numberOfItemsShown", "setOverflowMeasurables-VKLhPVY$foundation_layout_release", "(Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "isHorizontal", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/layout/IntrinsicMeasurable;ZJ)V", "toString", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FlowLayoutOverflowState {
    public static final int $stable = 0;
    private Measurable collapseMeasurable;
    private Placeable collapsePlaceable;
    private IntIntPair collapseSize;
    private Function2<? super Boolean, ? super Integer, ? extends Measurable> getOverflowMeasurable;
    private int itemCount;
    private int itemShown;
    private final int minCrossAxisSizeToShowCollapse;
    private final int minLinesToShowCollapse;
    private Measurable seeMoreMeasurable;
    private Placeable seeMorePlaceable;
    private IntIntPair seeMoreSize;
    private final String shownItemLazyErrorMessage;
    private final FlowLayoutOverflow.OverflowType type;

    /* JADX INFO: compiled from: FlowLayoutOverflow.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[FlowLayoutOverflow.OverflowType.values().length];
            r0[FlowLayoutOverflow.OverflowType.Visible.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L17:
            r0[FlowLayoutOverflow.OverflowType.Clip.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L19:
            r0[FlowLayoutOverflow.OverflowType.ExpandIndicator.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L23:
            r0[FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L15:
            $EnumSwitchMapping$0 = r0;
        }
    }

    static {
        $stable = 8;
    }

    public static /* synthetic */ FlowLayoutOverflowState copy$default(FlowLayoutOverflowState r0, FlowLayoutOverflow.OverflowType r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.type;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.minLinesToShowCollapse;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.minCrossAxisSizeToShowCollapse;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final FlowLayoutOverflow.OverflowType component1$foundation_layout_release() {
        return this.type;
    }

    public final int component2$foundation_layout_release() {
        return this.minLinesToShowCollapse;
    }

    public final int component3$foundation_layout_release() {
        return this.minCrossAxisSizeToShowCollapse;
    }

    public final FlowLayoutOverflowState copy(FlowLayoutOverflow.OverflowType r2, int r3, int r4) {
        return new FlowLayoutOverflowState(r2, r3, r4);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof FlowLayoutOverflowState) == true) goto L8;
        return false;
    L8:
        FlowLayoutOverflowState r1 = (FlowLayoutOverflowState) r6;
        if (this.type == r1.type) goto L12;
        return false;
    L12:
        if (this.minLinesToShowCollapse == r1.minLinesToShowCollapse) goto L15;
        return false;
    L15:
        if (this.minCrossAxisSizeToShowCollapse == r1.minCrossAxisSizeToShowCollapse) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + Integer.hashCode(this.minLinesToShowCollapse)) * 31) + Integer.hashCode(this.minCrossAxisSizeToShowCollapse);
    }

    public String toString() {
        return "FlowLayoutOverflowState(type=" + this.type + ", minLinesToShowCollapse=" + this.minLinesToShowCollapse + ", minCrossAxisSizeToShowCollapse=" + this.minCrossAxisSizeToShowCollapse + ')';
    }

    public FlowLayoutOverflowState(FlowLayoutOverflow.OverflowType type, int minLinesToShowCollapse, int minCrossAxisSizeToShowCollapse) {
        this.type = type;
        this.minLinesToShowCollapse = minLinesToShowCollapse;
        this.minCrossAxisSizeToShowCollapse = minCrossAxisSizeToShowCollapse;
        this.shownItemLazyErrorMessage = "Accessing shownItemCount before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase.";
        this.itemShown = -1;
    }

    public static final /* synthetic */ void access$setCollapsePlaceable$p(FlowLayoutOverflowState $this, Placeable r1) {
        $this.collapsePlaceable = r1;
    }

    public static final /* synthetic */ void access$setCollapseSize$p(FlowLayoutOverflowState $this, IntIntPair r1) {
        $this.collapseSize = r1;
    }

    public static final /* synthetic */ void access$setSeeMorePlaceable$p(FlowLayoutOverflowState $this, Placeable r1) {
        $this.seeMorePlaceable = r1;
    }

    public static final /* synthetic */ void access$setSeeMoreSize$p(FlowLayoutOverflowState $this, IntIntPair r1) {
        $this.seeMoreSize = r1;
    }

    public final FlowLayoutOverflow.OverflowType getType$foundation_layout_release() {
        return this.type;
    }

    public final int getMinLinesToShowCollapse$foundation_layout_release() {
        return this.minLinesToShowCollapse;
    }

    public final int getMinCrossAxisSizeToShowCollapse$foundation_layout_release() {
        return this.minCrossAxisSizeToShowCollapse;
    }

    public final int getShownItemCount$foundation_layout_release() {
        if (this.itemShown == (-1)) goto L7;
        return this.itemShown;
    L7:
        throw new IllegalStateException(this.shownItemLazyErrorMessage);
    }

    public final String getShownItemLazyErrorMessage$foundation_layout_release() {
        return this.shownItemLazyErrorMessage;
    }

    public final int getItemShown$foundation_layout_release() {
        return this.itemShown;
    }

    public final void setItemShown$foundation_layout_release(int r1) {
        this.itemShown = r1;
    }

    public final int getItemCount$foundation_layout_release() {
        return this.itemCount;
    }

    public final void setItemCount$foundation_layout_release(int r1) {
        this.itemCount = r1;
    }

    /* JADX INFO: renamed from: ellipsisSize-F35zm-w$foundation_layout_release, reason: not valid java name */
    public final IntIntPair m652ellipsisSizeF35zmw$foundation_layout_release(boolean hasNext, int lineIndex, int totalCrossAxisSize) {
        FlowLayoutOverflow.OverflowType r0 = this.type;
        switch(WhenMappings.$EnumSwitchMapping$0[r0.ordinal()]) {
            case 1: goto L25;
            case 2: goto L25;
            case 3: goto L14;
            case 4: goto L6;
            default: goto L5;
        };
    L6:
        if (hasNext == false) goto L9;
        return this.seeMoreSize;
    L9:
        if ((lineIndex + 1) >= this.minLinesToShowCollapse) goto L11;
        return null;
    L11:
        if (totalCrossAxisSize >= this.minCrossAxisSizeToShowCollapse) goto L20;
        return null;
    L20:
        return this.collapseSize;
    L14:
        if (hasNext == true) goto L21;
        return null;
    L21:
        return this.seeMoreSize;
    L25:
        return null;
    L5:
        throw new NoWhenBranchMatchedException();
    }

    public final FlowLayoutBuildingBlocks.WrapEllipsisInfo ellipsisInfo$foundation_layout_release(boolean hasNext, int lineIndex, int totalCrossAxisSize) {
        switch(WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()]) {
            case 1: goto L37;
            case 2: goto L37;
            case 3: goto L6;
            case 4: goto L6;
            default: goto L5;
        };
    L6:
        Measurable measurable = null;
        if (hasNext == false) goto L18;
        Function2<? super Boolean, ? super Integer, ? extends Measurable> r5 = this.getOverflowMeasurable;
        if (r5 == null) goto L12;
        Measurable measurable2 = r5.invoke(true, Integer.valueOf(getShownItemCount$foundation_layout_release()));
        if (measurable2 == null) goto L12;
    L13:
        IntIntPair ellipsisSize = this.seeMoreSize;
        if (this.getOverflowMeasurable != null) goto L16;
        Placeable placeable = this.seeMorePlaceable;
        Measurable measurable3 = measurable2;
        Placeable placeable2 = placeable;
    L31:
        if (measurable3 != null) goto L33;
        return null;
    L33:
        Intrinsics.checkNotNull(ellipsisSize);
        return new FlowLayoutBuildingBlocks.WrapEllipsisInfo(measurable3, placeable2, ellipsisSize.m24unboximpl(), false, 8, null);
    L16:
        measurable3 = measurable2;
        placeable2 = null;
    L12:
        measurable2 = this.seeMoreMeasurable;
        goto L13
    L18:
        if (lineIndex >= (this.minLinesToShowCollapse - 1)) goto L20;
    L27:
        IntIntPair ellipsisSize2 = this.collapseSize;
        if (this.getOverflowMeasurable != null) goto L30;
        Placeable placeable3 = this.collapsePlaceable;
        measurable3 = measurable;
        ellipsisSize = ellipsisSize2;
        placeable2 = placeable3;
        goto L31
    L30:
        measurable3 = measurable;
        ellipsisSize = ellipsisSize2;
        placeable2 = null;
        goto L31
    L20:
        if (totalCrossAxisSize < this.minCrossAxisSizeToShowCollapse) goto L27;
        Function2<? super Boolean, ? super Integer, ? extends Measurable> r4 = this.getOverflowMeasurable;
        if (r4 == null) goto L25;
        Measurable r6 = r4.invoke(false, Integer.valueOf(getShownItemCount$foundation_layout_release()));
        if (r6 == null) goto L25;
    L26:
        measurable = r6;
    L25:
        r6 = this.collapseMeasurable;
        goto L26
    L37:
        return null;
    L5:
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: setOverflowMeasurables--hBUhpc$foundation_layout_release, reason: not valid java name */
    public final void m654setOverflowMeasurableshBUhpc$foundation_layout_release(IntrinsicMeasurable seeMoreMeasurable, IntrinsicMeasurable collapseMeasurable, boolean isHorizontal, long constraints) {
        if (isHorizontal == false) goto L4;
        LayoutOrientation orientation = LayoutOrientation.Horizontal;
    L5:
        long orientationIndependentConstraints = OrientationIndependentConstraints.m694constructorimpl(constraints, orientation);
        if (seeMoreMeasurable == null) goto L12;
        int mainAxisSize = FlowLayoutKt.mainAxisMin(seeMoreMeasurable, isHorizontal, Constraints.m6925getMaxHeightimpl(orientationIndependentConstraints));
        int crossAxisSize = FlowLayoutKt.crossAxisMin(seeMoreMeasurable, isHorizontal, mainAxisSize);
        this.seeMoreSize = IntIntPair.m13boximpl(IntIntPair.m16constructorimpl(mainAxisSize, crossAxisSize));
        if ((seeMoreMeasurable instanceof Measurable) == false) goto L10;
        Measurable r8 = (Measurable) seeMoreMeasurable;
    L11:
        this.seeMoreMeasurable = r8;
        this.seeMorePlaceable = null;
        goto L12
    L10:
        r8 = null;
    L12:
        if (collapseMeasurable == null) goto L19;
        int mainAxisSize2 = FlowLayoutKt.mainAxisMin(collapseMeasurable, isHorizontal, Constraints.m6925getMaxHeightimpl(orientationIndependentConstraints));
        int crossAxisSize2 = FlowLayoutKt.crossAxisMin(collapseMeasurable, isHorizontal, mainAxisSize2);
        this.collapseSize = IntIntPair.m13boximpl(IntIntPair.m16constructorimpl(mainAxisSize2, crossAxisSize2));
        if ((collapseMeasurable instanceof Measurable) == false) goto L16;
        Measurable r9 = (Measurable) collapseMeasurable;
    L17:
        this.collapseMeasurable = r9;
        this.collapsePlaceable = null;
        return;
    L16:
        r9 = null;
        goto L17
    L19:
        return;
    L4:
        orientation = LayoutOrientation.Vertical;
        goto L5
    }

    /* JADX INFO: renamed from: setOverflowMeasurables--hBUhpc$foundation_layout_release, reason: not valid java name */
    public final void m653setOverflowMeasurableshBUhpc$foundation_layout_release(final FlowLineMeasurePolicy measurePolicy, Measurable seeMoreMeasurable, Measurable collapseMeasurable, long constraints) {
        boolean isHorizontal = measurePolicy.isHorizontal();
        if (isHorizontal == false) goto L5;
        LayoutOrientation orientation = LayoutOrientation.Horizontal;
    L6:
        long orientationIndependentConstraints = OrientationIndependentConstraints.m696copyyUG9Ft0$default(OrientationIndependentConstraints.m694constructorimpl(constraints, orientation), 0, 0, 0, 0, 10, null);
        long finalConstraints = OrientationIndependentConstraints.m707toBoxConstraintsOenEA2s(orientationIndependentConstraints, orientation);
        if (seeMoreMeasurable == null) goto L9;
        FlowLayoutKt.m650measureAndCacherqJ1uqs(seeMoreMeasurable, measurePolicy, finalConstraints, new FlowLayoutOverflowState$setOverflowMeasurables$3$1(this, measurePolicy));
        this.seeMoreMeasurable = seeMoreMeasurable;
    L9:
        if (collapseMeasurable == null) goto L12;
        FlowLayoutKt.m650measureAndCacherqJ1uqs(collapseMeasurable, measurePolicy, finalConstraints, new FlowLayoutOverflowState$setOverflowMeasurables$4$1(this, measurePolicy));
        this.collapseMeasurable = collapseMeasurable;
        return;
    L12:
        return;
    L5:
        orientation = LayoutOrientation.Vertical;
        goto L6
    }

    /* JADX INFO: renamed from: setOverflowMeasurables-VKLhPVY$foundation_layout_release, reason: not valid java name */
    public final void m655setOverflowMeasurablesVKLhPVY$foundation_layout_release(FlowLineMeasurePolicy measurePolicy, long constraints, Function2<? super Boolean, ? super Integer, ? extends Measurable> r13) {
        this.itemShown = 0;
        this.getOverflowMeasurable = r13;
        Measurable seeMoreMeasurable = r13.invoke(true, 0);
        Measurable collapseMeasurable = r13.invoke(false, 0);
        m653setOverflowMeasurableshBUhpc$foundation_layout_release(measurePolicy, seeMoreMeasurable, collapseMeasurable, constraints);
    }
}
