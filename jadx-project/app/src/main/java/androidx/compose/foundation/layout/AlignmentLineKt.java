package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: AlignmentLine.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a>\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a*\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"horizontal", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getHorizontal", "(Landroidx/compose/ui/layout/AlignmentLine;)Z", "alignmentLineOffsetMeasure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "alignmentLine", "before", "Landroidx/compose/ui/unit/Dp;", "after", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "alignmentLineOffsetMeasure-tjqqzMA", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/AlignmentLine;FFLandroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "paddingFrom", "Landroidx/compose/ui/Modifier;", "paddingFrom-4j6BHR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;FF)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/TextUnit;", "paddingFrom-Y_r0B1c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;JJ)Landroidx/compose/ui/Modifier;", "paddingFromBaseline", "top", "bottom", "paddingFromBaseline-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "paddingFromBaseline-wCyjxdI", "(Landroidx/compose/ui/Modifier;JJ)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AlignmentLineKt {
    /* JADX INFO: renamed from: access$alignmentLineOffsetMeasure-tjqqzMA, reason: not valid java name */
    public static final /* synthetic */ MeasureResult m574access$alignmentLineOffsetMeasuretjqqzMA(MeasureScope $receiver, AlignmentLine alignmentLine, float before, float after, Measurable measurable, long constraints) {
        return m575alignmentLineOffsetMeasuretjqqzMA($receiver, alignmentLine, before, after, measurable, constraints);
    }

    public static final /* synthetic */ boolean access$getHorizontal(AlignmentLine $receiver) {
        return getHorizontal($receiver);
    }

    /* JADX INFO: renamed from: paddingFrom-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m577paddingFrom4j6BHR0$default(Modifier r0, AlignmentLine r1, float r2, float r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L9:
        return m576paddingFrom4j6BHR0(r0, r1, r2, r3);
    }

    /* JADX INFO: renamed from: paddingFrom-4j6BHR0, reason: not valid java name */
    public static final Modifier m576paddingFrom4j6BHR0(Modifier $this$paddingFrom_u2d4j6BHR0, final AlignmentLine alignmentLine, final float before, final float after) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new AlignmentLineKt$paddingFrom4j6BHR0$$inlined$debugInspectorInfo$1(alignmentLine, before, after);
    L7:
        return $this$paddingFrom_u2d4j6BHR0.then(new AlignmentLineOffsetDpElement(alignmentLine, before, after, r2, null));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    /* JADX INFO: renamed from: paddingFrom-Y_r0B1c$default, reason: not valid java name */
    public static /* synthetic */ Modifier m579paddingFromY_r0B1c$default(Modifier r6, AlignmentLine r7, long r8, long r10, int r12, Object r13) {
        if ((r12 & 2) == 0) goto L5;
        long r2 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L7:
        if ((r12 & 4) == 0) goto L9;
        long r4 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L11:
        return m578paddingFromY_r0B1c(r6, r7, r2, r4);
    L9:
        r4 = r10;
        goto L11
    L5:
        r2 = r8;
        goto L7
    }

    /* JADX INFO: renamed from: paddingFrom-Y_r0B1c, reason: not valid java name */
    public static final Modifier m578paddingFromY_r0B1c(Modifier $this$paddingFrom_u2dY_r0B1c, AlignmentLine alignmentLine, final long before, long after) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        final AlignmentLine alignmentLine2 = alignmentLine;
        final long after2 = after;
        long before2 = before;
        Function1<InspectorInfo, Unit> r10 = new AlignmentLineKt$paddingFromY_r0B1c$$inlined$debugInspectorInfo$1(alignmentLine2, before, after2);
    L6:
        AlignmentLine alignmentLine3 = alignmentLine2;
        long after3 = after2;
        return $this$paddingFrom_u2dY_r0B1c.then(new AlignmentLineOffsetTextUnitElement(alignmentLine3, before2, after3, r10, null));
    L5:
        alignmentLine2 = alignmentLine;
        before2 = before;
        after2 = after;
        r10 = InspectableValueKt.getNoInspectorInfo();
        goto L6
    }

    /* JADX INFO: renamed from: paddingFromBaseline-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m581paddingFromBaselineVpY3zN4$default(Modifier r0, float r1, float r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L9:
        return m580paddingFromBaselineVpY3zN4(r0, r1, r2);
    }

    /* JADX INFO: renamed from: paddingFromBaseline-VpY3zN4, reason: not valid java name */
    public static final Modifier m580paddingFromBaselineVpY3zN4(Modifier $this$paddingFromBaseline_u2dVpY3zN4, float top, float bottom) {
        if (Float.isNaN(top) == true) goto L5;
        Modifier.Companion r11 = m577paddingFrom4j6BHR0$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), top, 0.0f, 4, null);
    L6:
        Modifier r12 = $this$paddingFromBaseline_u2dVpY3zN4.then(r11);
        if (Float.isNaN(bottom) == true) goto L9;
        Modifier.Companion r13 = m577paddingFrom4j6BHR0$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, bottom, 2, null);
    L11:
        return r12.then(r13);
    L9:
        r13 = Modifier.Companion;
        goto L11
    L5:
        r11 = Modifier.Companion;
        goto L6
    }

    /* JADX INFO: renamed from: paddingFromBaseline-wCyjxdI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m583paddingFromBaselinewCyjxdI$default(Modifier r0, long r1, long r3, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L9:
        return m582paddingFromBaselinewCyjxdI(r0, r1, r3);
    }

    /* JADX INFO: renamed from: paddingFromBaseline-wCyjxdI, reason: not valid java name */
    public static final Modifier m582paddingFromBaselinewCyjxdI(Modifier $this$paddingFromBaseline_u2dwCyjxdI, long top, long bottom) {
        boolean r4 = true;
        if (TextUnit.m7165getRawTypeimpl(top) != 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L8;
        Modifier.Companion r1 = m579paddingFromY_r0B1c$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), top, 0, 4, null);
    L9:
        Modifier r2 = $this$paddingFromBaseline_u2dwCyjxdI.then(r1);
        if (TextUnit.m7165getRawTypeimpl(bottom) == 0) goto L13;
        r4 = false;
    L13:
        if (r4 == true) goto L15;
        Modifier.Companion r3 = m579paddingFromY_r0B1c$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0, bottom, 2, null);
    L17:
        return r2.then(r3);
    L15:
        r3 = Modifier.Companion;
        goto L17
    L8:
        r1 = Modifier.Companion;
        goto L9
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: alignmentLineOffsetMeasure-tjqqzMA, reason: not valid java name */
    private static final MeasureResult m575alignmentLineOffsetMeasuretjqqzMA(MeasureScope $this$alignmentLineOffsetMeasure_u2dtjqqzMA, final AlignmentLine alignmentLine, float before, float after, Measurable measurable, long constraints) {
        if (getHorizontal(alignmentLine) == false) goto L5;
        long r4 = Constraints.m6916copyZbe2FdA$default(constraints, 0, 0, 0, 0, 11, null);
    L6:
        final Placeable placeable = measurable.mo5714measureBRTryo0(r4);
        int it = placeable.get(alignmentLine);
        if (it != Integer.MIN_VALUE) goto L10;
        it = 0;
    L10:
        int linePosition = it;
        if (getHorizontal(alignmentLine) == false) goto L13;
        int r1 = placeable.getHeight();
    L14:
        int axis = r1;
        if (getHorizontal(alignmentLine) == false) goto L17;
        int r2 = Constraints.m6925getMaxHeightimpl(constraints);
    L18:
        int axisMax = r2;
        if (Float.isNaN(before) == true) goto L21;
        final float r10 = before;
        int r3 = $this$alignmentLineOffsetMeasure_u2dtjqqzMA.mo370roundToPx0680j_4(r10);
    L22:
        final int paddingBefore = RangesKt.coerceIn(r3 - linePosition, 0, axisMax - axis);
        if (Float.isNaN(after) == true) goto L25;
        int r5 = $this$alignmentLineOffsetMeasure_u2dtjqqzMA.mo370roundToPx0680j_4(after);
    L26:
        final int paddingAfter = RangesKt.coerceIn((r5 - axis) + linePosition, 0, (axisMax - axis) - paddingBefore);
        if (getHorizontal(alignmentLine) == false) goto L29;
        final int width = placeable.getWidth();
    L31:
        if (getHorizontal(alignmentLine) == false) goto L33;
        final int height = Math.max((placeable.getHeight() + paddingBefore) + paddingAfter, Constraints.m6927getMinHeightimpl(constraints));
    L35:
        return MeasureScope.layout$default($this$alignmentLineOffsetMeasure_u2dtjqqzMA, width, height, null, new AlignmentLineKt$alignmentLineOffsetMeasure$1(alignmentLine, r10, paddingBefore, width, paddingAfter, placeable, height), 4, null);
    L33:
        height = placeable.getHeight();
        goto L35
    L29:
        width = Math.max((placeable.getWidth() + paddingBefore) + paddingAfter, Constraints.m6928getMinWidthimpl(constraints));
        goto L31
    L25:
        r5 = 0;
        goto L26
    L21:
        r10 = before;
        r3 = 0;
        goto L22
    L17:
        r2 = Constraints.m6926getMaxWidthimpl(constraints);
        goto L18
    L13:
        r1 = placeable.getWidth();
        goto L14
    L5:
        r4 = Constraints.m6916copyZbe2FdA$default(constraints, 0, 0, 0, 0, 14, null);
        goto L6
    }

    private static final boolean getHorizontal(AlignmentLine $this$horizontal) {
        return $this$horizontal instanceof HorizontalAlignmentLine;
    }
}
