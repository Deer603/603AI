package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: FlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u0016\u0010\u001f\u001a\u00020\nHÂ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\t\u0010\"\u001a\u00020\fHÆ\u0003J\u0016\u0010#\u001a\u00020\nHÂ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010!J\t\u0010%\u001a\u00020\u000fHÂ\u0003J\t\u0010&\u001a\u00020\u000fHÂ\u0003J\t\u0010'\u001a\u00020\u0012HÂ\u0003Jm\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0013\u0010+\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u000fHÖ\u0001JD\u0010/\u001a\u00020\u000f2\f\u00100\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00103\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J$\u00105\u001a\u00020\u000f2\f\u00100\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00106\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u000fJD\u00108\u001a\u00020\u000f2\f\u00100\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00109\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010:\u001a\u00020;HÖ\u0001J(\u0010<\u001a\u00020\u000f*\u00020=2\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020201012\u0006\u0010>\u001a\u00020\u000fH\u0016J(\u0010?\u001a\u00020\u000f*\u00020=2\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020201012\u0006\u00106\u001a\u00020\u000fH\u0016J\u0012\u0010@\u001a\u00020\u000f*\u0002022\u0006\u0010A\u001a\u00020\u000fJ2\u0010B\u001a\u00020C*\u00020D2\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E01012\u0006\u0010F\u001a\u00020GH\u0016ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u00020\u000f*\u0002022\u0006\u0010A\u001a\u00020\u000fJ(\u0010K\u001a\u00020\u000f*\u00020=2\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020201012\u0006\u0010>\u001a\u00020\u000fH\u0016J(\u0010L\u001a\u00020\u000f*\u00020=2\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020201012\u0006\u00106\u001a\u00020\u000fH\u0016J\u0012\u0010M\u001a\u00020\u000f*\u0002022\u0006\u0010A\u001a\u00020\u000fR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\r\u001a\u00020\nX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0019R\u0016\u0010\t\u001a\u00020\nX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006N"}, d2 = {"Landroidx/compose/foundation/layout/FlowMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "isHorizontal", "", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisArrangementSpacing", "maxItemsInMainAxis", "", "maxLines", "overflow", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "F", "getHorizontalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "()Z", "getVerticalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "component1", "component2", "component3", "component4", "component4-D9Ej5fM", "()F", "component5", "component6", "component6-D9Ej5fM", "component7", "component8", "component9", "copy", "copy-QuyCDyQ", "(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)Landroidx/compose/foundation/layout/FlowMeasurePolicy;", "equals", "other", "", "hashCode", "intrinsicCrossAxisSize", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "mainAxisAvailable", "crossAxisSpacing", "maxIntrinsicMainAxisSize", "height", "arrangementSpacing", "minIntrinsicMainAxisSize", "crossAxisAvailable", "toString", "", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "width", "maxIntrinsicWidth", "maxMainAxisIntrinsicItemSize", "size", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minCrossAxisIntrinsicItemSize", "minIntrinsicHeight", "minIntrinsicWidth", "minMainAxisIntrinsicItemSize", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class FlowMeasurePolicy implements MultiContentMeasurePolicy, FlowLineMeasurePolicy {
    private final CrossAxisAlignment crossAxisAlignment;
    private final float crossAxisArrangementSpacing;
    private final Arrangement.Horizontal horizontalArrangement;
    private final boolean isHorizontal;
    private final float mainAxisSpacing;
    private final int maxItemsInMainAxis;
    private final int maxLines;
    private final FlowLayoutOverflowState overflow;
    private final Arrangement.Vertical verticalArrangement;

    public /* synthetic */ FlowMeasurePolicy(boolean r1, Arrangement.Horizontal r2, Arrangement.Vertical r3, float r4, CrossAxisAlignment r5, float r6, int r7, int r8, FlowLayoutOverflowState r9, DefaultConstructorMarker r10) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9);
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name */
    private final float m668component4D9Ej5fM() {
        return this.mainAxisSpacing;
    }

    /* JADX INFO: renamed from: component6-D9Ej5fM, reason: not valid java name */
    private final float m669component6D9Ej5fM() {
        return this.crossAxisArrangementSpacing;
    }

    private final int component7() {
        return this.maxItemsInMainAxis;
    }

    private final int component8() {
        return this.maxLines;
    }

    private final FlowLayoutOverflowState component9() {
        return this.overflow;
    }

    /* JADX INFO: renamed from: copy-QuyCDyQ$default, reason: not valid java name */
    public static /* synthetic */ FlowMeasurePolicy m670copyQuyCDyQ$default(FlowMeasurePolicy r0, boolean r1, Arrangement.Horizontal r2, Arrangement.Vertical r3, float r4, CrossAxisAlignment r5, float r6, int r7, int r8, FlowLayoutOverflowState r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r0.isHorizontal;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r0.horizontalArrangement;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r0.verticalArrangement;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r4 = r0.mainAxisSpacing;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r5 = r0.crossAxisAlignment;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r6 = r0.crossAxisArrangementSpacing;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r7 = r0.maxItemsInMainAxis;
    L24:
        if ((r10 & 128) == 0) goto L27;
        r8 = r0.maxLines;
    L27:
        if ((r10 & 256) == 0) goto L29;
        r9 = r0.overflow;
    L29:
        int r12 = r8;
        FlowLayoutOverflowState r13 = r9;
        float r14 = r6;
        int r15 = r7;
        float r16 = r4;
        CrossAxisAlignment r17 = r5;
        Arrangement.Vertical r18 = r3;
        boolean r19 = r1;
        return r0.m671copyQuyCDyQ(r19, r2, r18, r16, r17, r14, r15, r12, r13);
    }

    public final boolean component1() {
        return this.isHorizontal;
    }

    public final Arrangement.Horizontal component2() {
        return this.horizontalArrangement;
    }

    public final Arrangement.Vertical component3() {
        return this.verticalArrangement;
    }

    public final CrossAxisAlignment component5() {
        return this.crossAxisAlignment;
    }

    /* JADX INFO: renamed from: copy-QuyCDyQ, reason: not valid java name */
    public final FlowMeasurePolicy m671copyQuyCDyQ(boolean r12, Arrangement.Horizontal r13, Arrangement.Vertical r14, float r15, CrossAxisAlignment r16, float r17, int r18, int r19, FlowLayoutOverflowState r20) {
        return new FlowMeasurePolicy(r12, r13, r14, r15, r16, r17, r18, r19, r20, null);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof FlowMeasurePolicy) == true) goto L8;
        return false;
    L8:
        FlowMeasurePolicy r1 = (FlowMeasurePolicy) r6;
        if (this.isHorizontal == r1.isHorizontal) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.horizontalArrangement, r1.horizontalArrangement) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.verticalArrangement, r1.verticalArrangement) == true) goto L18;
        return false;
    L18:
        if (Dp.m6978equalsimpl0(this.mainAxisSpacing, r1.mainAxisSpacing) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.areEqual(this.crossAxisAlignment, r1.crossAxisAlignment) == true) goto L24;
        return false;
    L24:
        if (Dp.m6978equalsimpl0(this.crossAxisArrangementSpacing, r1.crossAxisArrangementSpacing) == true) goto L27;
        return false;
    L27:
        if (this.maxItemsInMainAxis == r1.maxItemsInMainAxis) goto L30;
        return false;
    L30:
        if (this.maxLines == r1.maxLines) goto L33;
        return false;
    L33:
        if (Intrinsics.areEqual(this.overflow, r1.overflow) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.isHorizontal) * 31) + this.horizontalArrangement.hashCode()) * 31) + this.verticalArrangement.hashCode()) * 31) + Dp.m6979hashCodeimpl(this.mainAxisSpacing)) * 31) + this.crossAxisAlignment.hashCode()) * 31) + Dp.m6979hashCodeimpl(this.crossAxisArrangementSpacing)) * 31) + Integer.hashCode(this.maxItemsInMainAxis)) * 31) + Integer.hashCode(this.maxLines)) * 31) + this.overflow.hashCode();
    }

    public String toString() {
        return "FlowMeasurePolicy(isHorizontal=" + this.isHorizontal + ", horizontalArrangement=" + this.horizontalArrangement + ", verticalArrangement=" + this.verticalArrangement + ", mainAxisSpacing=" + Dp.m6984toStringimpl(this.mainAxisSpacing) + ", crossAxisAlignment=" + this.crossAxisAlignment + ", crossAxisArrangementSpacing=" + Dp.m6984toStringimpl(this.crossAxisArrangementSpacing) + ", maxItemsInMainAxis=" + this.maxItemsInMainAxis + ", maxLines=" + this.maxLines + ", overflow=" + this.overflow + ')';
    }

    private FlowMeasurePolicy(boolean isHorizontal, Arrangement.Horizontal horizontalArrangement, Arrangement.Vertical verticalArrangement, float mainAxisSpacing, CrossAxisAlignment crossAxisAlignment, float crossAxisArrangementSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) {
        this.isHorizontal = isHorizontal;
        this.horizontalArrangement = horizontalArrangement;
        this.verticalArrangement = verticalArrangement;
        this.mainAxisSpacing = mainAxisSpacing;
        this.crossAxisAlignment = crossAxisAlignment;
        this.crossAxisArrangementSpacing = crossAxisArrangementSpacing;
        this.maxItemsInMainAxis = maxItemsInMainAxis;
        this.maxLines = maxLines;
        this.overflow = overflow;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public boolean isHorizontal() {
        return this.isHorizontal;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo672measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, List<? extends List<? extends Measurable>> r16, long constraints) {
        if (this.maxLines == 0) goto L31;
        if (this.maxItemsInMainAxis == 0) goto L31;
        if (r16.isEmpty() == true) goto L31;
        if (Constraints.m6925getMaxHeightimpl(constraints) == 0) goto L11;
    L13:
        List list = (List) CollectionsKt.first(r16);
        if (list.isEmpty() == true) goto L16;
        List r2 = (List) CollectionsKt.getOrNull(r16, 1);
        Measurable r3 = null;
        if (r2 == null) goto L20;
        Measurable r4 = (Measurable) CollectionsKt.firstOrNull(r2);
    L21:
        Measurable seeMoreMeasurable = r4;
        List r5 = (List) CollectionsKt.getOrNull(r16, 2);
        if (r5 == null) goto L24;
        r3 = (Measurable) CollectionsKt.firstOrNull(r5);
    L24:
        Measurable collapseMeasurable = r3;
        this.overflow.setItemCount$foundation_layout_release(list.size());
        this.overflow.m653setOverflowMeasurableshBUhpc$foundation_layout_release(this, seeMoreMeasurable, collapseMeasurable, constraints);
        FlowMeasurePolicy r6 = this;
        Iterator r7 = list.iterator();
        float r8 = this.mainAxisSpacing;
        float r9 = this.crossAxisArrangementSpacing;
        if (isHorizontal() == false) goto L27;
        LayoutOrientation r10 = LayoutOrientation.Horizontal;
    L29:
        return FlowLayoutKt.m649breakDownItemsdi9J0FM($this$measure_u2d3p2s80s, r6, r7, r8, r9, OrientationIndependentConstraints.m694constructorimpl(constraints, r10), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    L27:
        r10 = LayoutOrientation.Vertical;
        goto L29
    L20:
        r4 = null;
        goto L21
    L16:
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, 0, 0, null, FlowMeasurePolicy$measure$2.INSTANCE, 4, null);
    L11:
        if (this.overflow.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.Visible) goto L13;
    L31:
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, 0, 0, null, FlowMeasurePolicy$measure$1.INSTANCE, 4, null);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope $this$minIntrinsicWidth, List<? extends List<? extends IntrinsicMeasurable>> r18, int height) {
        FlowLayoutOverflowState r1 = this.overflow;
        List r2 = (List) CollectionsKt.getOrNull(r18, 1);
        IntrinsicMeasurable r3 = null;
        if (r2 == null) goto L5;
        IntrinsicMeasurable r4 = (IntrinsicMeasurable) CollectionsKt.firstOrNull(r2);
    L6:
        List r5 = (List) CollectionsKt.getOrNull(r18, 2);
        if (r5 == null) goto L9;
        r3 = (IntrinsicMeasurable) CollectionsKt.firstOrNull(r5);
    L9:
        r1.m654setOverflowMeasurableshBUhpc$foundation_layout_release(r4, r3, isHorizontal(), ConstraintsKt.Constraints$default(0, 0, 0, height, 7, null));
        if (isHorizontal() == false) goto L15;
        List<? extends IntrinsicMeasurable> r6 = (List) CollectionsKt.firstOrNull(r18);
        if (r6 != null) goto L20;
        r6 = CollectionsKt.emptyList();
    L20:
        return minIntrinsicMainAxisSize(r6, height, $this$minIntrinsicWidth.mo370roundToPx0680j_4(this.mainAxisSpacing), $this$minIntrinsicWidth.mo370roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    L15:
        List<? extends IntrinsicMeasurable> r7 = (List) CollectionsKt.firstOrNull(r18);
        if (r7 != null) goto L19;
        r7 = CollectionsKt.emptyList();
    L19:
        return intrinsicCrossAxisSize(r7, height, $this$minIntrinsicWidth.mo370roundToPx0680j_4(this.mainAxisSpacing), $this$minIntrinsicWidth.mo370roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    L5:
        r4 = null;
        goto L6
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope $this$minIntrinsicHeight, List<? extends List<? extends IntrinsicMeasurable>> r18, int width) {
        FlowLayoutOverflowState r1 = this.overflow;
        List r2 = (List) CollectionsKt.getOrNull(r18, 1);
        IntrinsicMeasurable r3 = null;
        if (r2 == null) goto L5;
        IntrinsicMeasurable r4 = (IntrinsicMeasurable) CollectionsKt.firstOrNull(r2);
    L6:
        List r5 = (List) CollectionsKt.getOrNull(r18, 2);
        if (r5 == null) goto L9;
        r3 = (IntrinsicMeasurable) CollectionsKt.firstOrNull(r5);
    L9:
        r1.m654setOverflowMeasurableshBUhpc$foundation_layout_release(r4, r3, isHorizontal(), ConstraintsKt.Constraints$default(0, width, 0, 0, 13, null));
        if (isHorizontal() == false) goto L15;
        List<? extends IntrinsicMeasurable> r6 = (List) CollectionsKt.firstOrNull(r18);
        if (r6 != null) goto L20;
        r6 = CollectionsKt.emptyList();
    L20:
        return intrinsicCrossAxisSize(r6, width, $this$minIntrinsicHeight.mo370roundToPx0680j_4(this.mainAxisSpacing), $this$minIntrinsicHeight.mo370roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    L15:
        List<? extends IntrinsicMeasurable> r7 = (List) CollectionsKt.firstOrNull(r18);
        if (r7 != null) goto L19;
        r7 = CollectionsKt.emptyList();
    L19:
        return minIntrinsicMainAxisSize(r7, width, $this$minIntrinsicHeight.mo370roundToPx0680j_4(this.mainAxisSpacing), $this$minIntrinsicHeight.mo370roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    L5:
        r4 = null;
        goto L6
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope $this$maxIntrinsicHeight, List<? extends List<? extends IntrinsicMeasurable>> r18, int width) {
        FlowLayoutOverflowState r1 = this.overflow;
        List r2 = (List) CollectionsKt.getOrNull(r18, 1);
        IntrinsicMeasurable r3 = null;
        if (r2 == null) goto L5;
        IntrinsicMeasurable r4 = (IntrinsicMeasurable) CollectionsKt.firstOrNull(r2);
    L6:
        List r5 = (List) CollectionsKt.getOrNull(r18, 2);
        if (r5 == null) goto L9;
        r3 = (IntrinsicMeasurable) CollectionsKt.firstOrNull(r5);
    L9:
        r1.m654setOverflowMeasurableshBUhpc$foundation_layout_release(r4, r3, isHorizontal(), ConstraintsKt.Constraints$default(0, width, 0, 0, 13, null));
        if (isHorizontal() == false) goto L15;
        List<? extends IntrinsicMeasurable> r6 = (List) CollectionsKt.firstOrNull(r18);
        if (r6 != null) goto L20;
        r6 = CollectionsKt.emptyList();
    L20:
        return intrinsicCrossAxisSize(r6, width, $this$maxIntrinsicHeight.mo370roundToPx0680j_4(this.mainAxisSpacing), $this$maxIntrinsicHeight.mo370roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    L15:
        List<? extends IntrinsicMeasurable> r7 = (List) CollectionsKt.firstOrNull(r18);
        if (r7 != null) goto L19;
        r7 = CollectionsKt.emptyList();
    L19:
        return maxIntrinsicMainAxisSize(r7, width, $this$maxIntrinsicHeight.mo370roundToPx0680j_4(this.mainAxisSpacing));
    L5:
        r4 = null;
        goto L6
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, List<? extends List<? extends IntrinsicMeasurable>> r18, int height) {
        FlowLayoutOverflowState r1 = this.overflow;
        List r2 = (List) CollectionsKt.getOrNull(r18, 1);
        IntrinsicMeasurable r3 = null;
        if (r2 == null) goto L5;
        IntrinsicMeasurable r4 = (IntrinsicMeasurable) CollectionsKt.firstOrNull(r2);
    L6:
        List r5 = (List) CollectionsKt.getOrNull(r18, 2);
        if (r5 == null) goto L9;
        r3 = (IntrinsicMeasurable) CollectionsKt.firstOrNull(r5);
    L9:
        r1.m654setOverflowMeasurableshBUhpc$foundation_layout_release(r4, r3, isHorizontal(), ConstraintsKt.Constraints$default(0, 0, 0, height, 7, null));
        if (isHorizontal() == false) goto L15;
        List<? extends IntrinsicMeasurable> r6 = (List) CollectionsKt.firstOrNull(r18);
        if (r6 != null) goto L20;
        r6 = CollectionsKt.emptyList();
    L20:
        return maxIntrinsicMainAxisSize(r6, height, $this$maxIntrinsicWidth.mo370roundToPx0680j_4(this.mainAxisSpacing));
    L15:
        List<? extends IntrinsicMeasurable> r7 = (List) CollectionsKt.firstOrNull(r18);
        if (r7 != null) goto L19;
        r7 = CollectionsKt.emptyList();
    L19:
        return intrinsicCrossAxisSize(r7, height, $this$maxIntrinsicWidth.mo370roundToPx0680j_4(this.mainAxisSpacing), $this$maxIntrinsicWidth.mo370roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    L5:
        r4 = null;
        goto L6
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.collections.IntIterator] */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.collections.IntIterator] */
    public final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> r23, int crossAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) {
        r23 = r23;
        maxItemsInMainAxis = maxItemsInMainAxis;
        maxLines = maxLines;
        if (r23.isEmpty() == true) goto L99;
        int[] mainAxisSizes$iv = new int[r23.size()];
        int[] crossAxisSizes$iv = new int[r23.size()];
        int index$iv = 0;
        int r6 = r23.size();
    L6:
        if (index$iv >= r6) goto L8;
        IntrinsicMeasurable child$iv = r23.get(index$iv);
        int mainAxisItemSize$iv = minMainAxisIntrinsicItemSize(child$iv, crossAxisAvailable);
        mainAxisSizes$iv[index$iv] = mainAxisItemSize$iv;
        crossAxisSizes$iv[index$iv] = minCrossAxisIntrinsicItemSize(child$iv, mainAxisItemSize$iv);
        index$iv = index$iv + 1;
        goto L6
    L8:
        int maxItemsThatCanBeShown$iv = Integer.MAX_VALUE;
        if (maxLines == Integer.MAX_VALUE) goto L14;
        if (maxItemsInMainAxis == Integer.MAX_VALUE) goto L14;
        maxItemsThatCanBeShown$iv = maxItemsInMainAxis * maxLines;
    L14:
        if (maxItemsThatCanBeShown$iv >= r23.size()) goto L21;
        if (overflow.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.ExpandIndicator) goto L18;
    L19:
        boolean r7 = true;
    L28:
        boolean mustHaveEllipsis$iv = r7;
        if (mustHaveEllipsis$iv == false) goto L31;
        int r8 = 1;
    L32:
        int maxItemsThatCanBeShown$iv2 = Math.min(maxItemsThatCanBeShown$iv - r8, r23.size());
        int $this$minIntrinsicMainAxisSize_u24lambda_u249$iv = ArraysKt.sum(mainAxisSizes$iv);
        int maxMainAxisSize$iv = ((r23.size() - 1) * mainAxisSpacing) + $this$minIntrinsicMainAxisSize_u24lambda_u249$iv;
        if (crossAxisSizes$iv.length != 0) goto L35;
        boolean r9 = true;
    L36:
        if (r9 == true) goto L75;
        int crossAxisUsed$iv = crossAxisSizes$iv[0];
        ?? r3 = new IntRange(1, ArraysKt.getLastIndex(crossAxisSizes$iv)).iterator();
    L39:
        if (r3.hasNext() == false) goto L44;
        int it$iv = crossAxisSizes$iv[r3.nextInt()];
        if (crossAxisUsed$iv >= it$iv) goto L39;
        crossAxisUsed$iv = it$iv;
        goto L39
    L44:
        if (mainAxisSizes$iv.length != 0) goto L46;
        boolean r4 = true;
    L47:
        if (r4 == true) goto L73;
        int low$iv = mainAxisSizes$iv[0];
        ?? r0 = new IntRange(1, ArraysKt.getLastIndex(mainAxisSizes$iv)).iterator();
    L50:
        if (r0.hasNext() == false) goto L54;
        int it$iv2 = mainAxisSizes$iv[r0.nextInt()];
        if (low$iv >= it$iv2) goto L50;
        low$iv = it$iv2;
        goto L50
    L54:
        int minimumItemSize$iv = low$iv;
        int low$iv2 = low$iv;
        int low$iv3 = maxMainAxisSize$iv;
        int crossAxisUsed$iv2 = crossAxisUsed$iv;
        int crossAxisUsed$iv3 = maxMainAxisSize$iv;
    L55:
        if (low$iv2 > crossAxisUsed$iv3) goto L70;
        if (crossAxisUsed$iv2 == crossAxisAvailable) goto L70;
        int mid$iv = (low$iv2 + crossAxisUsed$iv3) / 2;
        crossAxisSizes$iv = crossAxisSizes$iv;
        minimumItemSize$iv = minimumItemSize$iv;
        int minimumItemSize$iv2 = crossAxisUsed$iv3;
        long pair$iv = FlowLayoutKt.access$intrinsicCrossAxisSize(r23, mainAxisSizes$iv, crossAxisSizes$iv, mid$iv, mainAxisSpacing, crossAxisSpacing, maxItemsInMainAxis, maxLines, overflow);
        crossAxisUsed$iv2 = IntIntPair.m20getFirstimpl(pair$iv);
        int itemShown$iv = IntIntPair.m21getSecondimpl(pair$iv);
        if (crossAxisUsed$iv2 > crossAxisAvailable) goto L65;
        if (itemShown$iv < maxItemsThatCanBeShown$iv2) goto L65;
        if (crossAxisUsed$iv2 >= crossAxisAvailable) goto L97;
        crossAxisUsed$iv3 = mid$iv - 1;
        low$iv3 = mid$iv;
        goto L55
    L97:
        return mid$iv;
    L65:
        low$iv2 = mid$iv + 1;
        if (low$iv2 > minimumItemSize$iv2) goto L98;
        low$iv3 = mid$iv;
        crossAxisUsed$iv3 = minimumItemSize$iv2;
        goto L55
    L98:
        return low$iv2;
    L70:
        int mainAxisUsed$iv = low$iv3;
        return mainAxisUsed$iv;
    L73:
        throw new NoSuchElementException();
    L46:
        r4 = false;
        goto L47
    L75:
        throw new NoSuchElementException();
    L35:
        r9 = false;
        goto L36
    L31:
        r8 = 0;
        goto L32
    L18:
        if (overflow.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator) goto L19;
    L21:
        if (maxItemsThatCanBeShown$iv >= r23.size()) goto L23;
    L27:
        r7 = false;
        goto L28
    L23:
        if (maxLines < overflow.getMinLinesToShowCollapse$foundation_layout_release()) goto L27;
        if (overflow.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator) goto L27;
        r7 = true;
        goto L28
    L99:
        return 0;
    }

    public final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> r18, int height, int arrangementSpacing) {
        FlowMeasurePolicy r0 = this;
        int maxItemsInMainAxis$iv = r0.maxItemsInMainAxis;
        int fixedSpace$iv = 0;
        int currentFixedSpace$iv = 0;
        int lastBreak$iv = 0;
        int index$iv$iv = 0;
        int r9 = r18.size();
    L3:
        if (index$iv$iv >= r9) goto L13;
        Object item$iv$iv = r18.get(index$iv$iv);
        IntrinsicMeasurable child$iv = (IntrinsicMeasurable) item$iv$iv;
        int index$iv = index$iv$iv;
        int size$iv = r0.maxMainAxisIntrinsicItemSize(child$iv, height) + arrangementSpacing;
        if (((index$iv + 1) - lastBreak$iv) != maxItemsInMainAxis$iv) goto L7;
    L10:
        fixedSpace$iv = Math.max(fixedSpace$iv, (currentFixedSpace$iv + size$iv) - arrangementSpacing);
        currentFixedSpace$iv = 0;
        lastBreak$iv = index$iv;
    L11:
        index$iv$iv = index$iv$iv + 1;
        r0 = this;
        goto L3
    L7:
        if ((index$iv + 1) == r18.size()) goto L10;
        currentFixedSpace$iv = currentFixedSpace$iv + size$iv;
        goto L11
    L13:
        return fixedSpace$iv;
    }

    public final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> r31, int mainAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) {
        FlowMeasurePolicy r0 = this;
        List<? extends IntrinsicMeasurable> r1 = r31;
        int size$iv = 0;
        if (r1.isEmpty() == false) goto L5;
        long r3 = IntIntPair.m16constructorimpl(0, 0);
    L66:
        return IntIntPair.m20getFirstimpl(r3);
    L5:
        FlowLayoutBuildingBlocks buildingBlocks$iv = new FlowLayoutBuildingBlocks(maxItemsInMainAxis, overflow, OrientationIndependentConstraints.m692constructorimpl(0, mainAxisAvailable, 0, Integer.MAX_VALUE), maxLines, mainAxisSpacing, crossAxisSpacing, null);
        IntrinsicMeasurable nextChild$iv = (IntrinsicMeasurable) CollectionsKt.getOrNull(r1, 0);
        if (nextChild$iv == null) goto L8;
        int nextCrossAxisSize$iv = r0.minCrossAxisIntrinsicItemSize(nextChild$iv, mainAxisAvailable);
    L9:
        if (nextChild$iv == null) goto L11;
        int size = nextCrossAxisSize$iv;
        int nextMainAxisSize$iv = r0.minMainAxisIntrinsicItemSize(nextChild$iv, size);
    L13:
        if (r1.size() <= 1) goto L15;
        boolean r11 = true;
    L16:
        boolean r17 = r11;
        long r10 = IntIntPair.m16constructorimpl(mainAxisAvailable, Integer.MAX_VALUE);
        if (nextChild$iv != null) goto L19;
        IntIntPair r20 = null;
    L20:
        int childCrossAxisSize$iv = nextMainAxisSize$iv;
        int nextCrossAxisSize$iv2 = nextCrossAxisSize$iv;
        if (buildingBlocks$iv.m647getWrapInfoOpUlnko(r17, 0, r10, r20, 0, 0, 0, false, false).isLastItemInContainer() == false) goto L29;
        if (nextChild$iv == null) goto L24;
        boolean r12 = true;
    L25:
        IntIntPair r4 = overflow.m652ellipsisSizeF35zmw$foundation_layout_release(r12, 0, 0);
        if (r4 == null) goto L28;
        size$iv = IntIntPair.m21getSecondimpl(r4.m24unboximpl());
    L28:
        r3 = IntIntPair.m16constructorimpl(size$iv, 0);
        goto L66
    L24:
        r12 = false;
        goto L25
    L29:
        int r13 = r1.size();
        int nextCrossAxisSize$iv3 = nextCrossAxisSize$iv2;
        int lastBreak$iv = 0;
        int nextMainAxisSize$iv2 = 0;
        int currentCrossAxisSize$iv = 0;
        int totalCrossAxisSize$iv = 0;
        int lineIndex$iv = 0;
        int noOfItemsShown$iv = 0;
        int currentCrossAxisSize$iv2 = mainAxisAvailable;
    L30:
        if (lineIndex$iv >= r13) goto L64;
        int childCrossAxisSize$iv2 = nextCrossAxisSize$iv3;
        int childMainAxisSize$iv = childCrossAxisSize$iv;
        int remaining$iv = currentCrossAxisSize$iv2 - childMainAxisSize$iv;
        int noOfItemsShown$iv2 = lineIndex$iv + 1;
        int index$iv = lineIndex$iv;
        int index$iv2 = totalCrossAxisSize$iv;
        int lineIndex$iv2 = currentCrossAxisSize$iv;
        int currentCrossAxisSize$iv3 = Math.max(nextMainAxisSize$iv2, childCrossAxisSize$iv2);
        int currentCrossAxisSize$iv4 = index$iv + 1;
        IntrinsicMeasurable nextChild$iv2 = (IntrinsicMeasurable) CollectionsKt.getOrNull(r1, currentCrossAxisSize$iv4);
        if (nextChild$iv2 == null) goto L34;
        int size2 = r0.minCrossAxisIntrinsicItemSize(nextChild$iv2, mainAxisAvailable);
    L35:
        if (nextChild$iv2 == null) goto L37;
        int nextMainAxisSize$iv3 = r0.minMainAxisIntrinsicItemSize(nextChild$iv2, size2) + mainAxisSpacing;
    L39:
        if ((index$iv + 2) >= r1.size()) goto L41;
        boolean r8 = true;
    L42:
        int r2 = (index$iv + 1) - lastBreak$iv;
        long r14 = IntIntPair.m16constructorimpl(remaining$iv, Integer.MAX_VALUE);
        if (nextChild$iv2 != null) goto L45;
        IntIntPair r24 = null;
    L46:
        int remaining$iv2 = r13;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfo$iv = buildingBlocks$iv.m647getWrapInfoOpUlnko(r8, r2, r14, r24, index$iv2, lineIndex$iv2, currentCrossAxisSize$iv3, false, false);
        if (wrapInfo$iv.isLastItemInLine() == false) goto L61;
        int totalCrossAxisSize$iv2 = lineIndex$iv2 + (currentCrossAxisSize$iv3 + crossAxisSpacing);
        if (nextChild$iv2 == null) goto L51;
        boolean r9 = true;
    L52:
        int lineIndex$iv3 = (index$iv + 1) - lastBreak$iv;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo ellipsisWrapInfo$iv = buildingBlocks$iv.getWrapEllipsisInfo(wrapInfo$iv, r9, index$iv2, totalCrossAxisSize$iv2, remaining$iv, lineIndex$iv3);
        lastBreak$iv = index$iv + 1;
        int nextMainAxisSize$iv4 = nextMainAxisSize$iv3 - mainAxisSpacing;
        totalCrossAxisSize$iv = index$iv2 + 1;
        if (wrapInfo$iv.isLastItemInContainer() == true) goto L54;
        childCrossAxisSize$iv = nextMainAxisSize$iv4;
        nextMainAxisSize$iv2 = 0;
        currentCrossAxisSize$iv = totalCrossAxisSize$iv2;
        currentCrossAxisSize$iv2 = mainAxisAvailable;
    L62:
        lineIndex$iv = index$iv + 1;
        r13 = remaining$iv2;
        noOfItemsShown$iv = noOfItemsShown$iv2;
        r1 = r31;
        nextCrossAxisSize$iv3 = size2;
        r0 = this;
        goto L30
    L54:
        if (ellipsisWrapInfo$iv == null) goto L59;
        long it$iv = ellipsisWrapInfo$iv.m648getEllipsisSizeOO21N7I();
        if (ellipsisWrapInfo$iv.getPlaceEllipsisOnLastContentLine() == true) goto L59;
        totalCrossAxisSize$iv2 = totalCrossAxisSize$iv2 + (IntIntPair.m21getSecondimpl(it$iv) + crossAxisSpacing);
    L59:
        currentCrossAxisSize$iv = totalCrossAxisSize$iv2;
        noOfItemsShown$iv = noOfItemsShown$iv2;
        goto L64
    L51:
        r9 = false;
        goto L52
    L61:
        childCrossAxisSize$iv = nextMainAxisSize$iv3;
        nextMainAxisSize$iv2 = currentCrossAxisSize$iv3;
        currentCrossAxisSize$iv2 = remaining$iv;
        currentCrossAxisSize$iv = lineIndex$iv2;
        totalCrossAxisSize$iv = index$iv2;
        goto L62
    L45:
        r24 = IntIntPair.m13boximpl(IntIntPair.m16constructorimpl(nextMainAxisSize$iv3, size2));
        goto L46
    L41:
        r8 = false;
        goto L42
    L37:
        nextMainAxisSize$iv3 = 0;
        goto L39
    L34:
        size2 = 0;
    L64:
        int totalCrossAxisSize$iv3 = currentCrossAxisSize$iv - crossAxisSpacing;
        r3 = IntIntPair.m16constructorimpl(totalCrossAxisSize$iv3, noOfItemsShown$iv);
        goto L66
    L19:
        r20 = IntIntPair.m13boximpl(IntIntPair.m16constructorimpl(nextMainAxisSize$iv, nextCrossAxisSize$iv));
        goto L20
    L15:
        r11 = false;
        goto L16
    L11:
        nextMainAxisSize$iv = 0;
        goto L13
    L8:
        nextCrossAxisSize$iv = 0;
        goto L9
    }

    public final int maxMainAxisIntrinsicItemSize(IntrinsicMeasurable $this$maxMainAxisIntrinsicItemSize, int size) {
        if (isHorizontal() == false) goto L6;
        return $this$maxMainAxisIntrinsicItemSize.maxIntrinsicWidth(size);
    L6:
        return $this$maxMainAxisIntrinsicItemSize.maxIntrinsicHeight(size);
    }

    public final int minCrossAxisIntrinsicItemSize(IntrinsicMeasurable $this$minCrossAxisIntrinsicItemSize, int size) {
        if (isHorizontal() == false) goto L6;
        return $this$minCrossAxisIntrinsicItemSize.minIntrinsicHeight(size);
    L6:
        return $this$minCrossAxisIntrinsicItemSize.minIntrinsicWidth(size);
    }

    public final int minMainAxisIntrinsicItemSize(IntrinsicMeasurable $this$minMainAxisIntrinsicItemSize, int size) {
        if (isHorizontal() == false) goto L6;
        return $this$minMainAxisIntrinsicItemSize.minIntrinsicWidth(size);
    L6:
        return $this$minMainAxisIntrinsicItemSize.minIntrinsicHeight(size);
    }
}
