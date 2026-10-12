package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: ExpressiveNavigationBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/material3/CenteredContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "()V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class CenteredContentMeasurePolicy implements MeasurePolicy {
    public CenteredContentMeasurePolicy() {
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo32measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, List<? extends Measurable> r29, long constraints) {
        int width = Constraints.m6926getMaxWidthimpl(constraints);
        int itemHeight = Constraints.m6927getMinHeightimpl(constraints);
        int itemsCount = r29.size();
        if (itemsCount < 1) goto L5;
        final Ref.IntRef barHorizontalPadding = new Ref.IntRef();
        List itemsPlaceables = null;
        if (Constraints.m6922getHasBoundedWidthimpl(constraints) == true) goto L12;
        List<? extends Measurable> r5 = r29;
        int $i$f$fastMap = 0;
        ArrayList target$iv = new ArrayList(r5.size());
        int index$iv$iv = 0;
        int r13 = r5.size();
    L9:
        if (index$iv$iv >= r13) goto L11;
        Object item$iv$iv = r5.get(index$iv$iv);
        List itemsPlaceables2 = itemsPlaceables;
        ArrayList itemsPlaceables3 = target$iv;
        itemsPlaceables3.add(((Measurable) item$iv$iv).mo5714measureBRTryo0(ConstraintsKt.m6941constrainN9IONVI(constraints, Constraints.Companion.m6937fixedHeightOenEA2s(itemHeight))));
        index$iv$iv = index$iv$iv + 1;
        itemsPlaceables = itemsPlaceables2;
        r5 = r5;
        $i$f$fastMap = $i$f$fastMap;
        target$iv = target$iv;
        goto L9
    L11:
        int width2 = width;
        final List itemsPlaceables4 = target$iv;
    L27:
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, width2, itemHeight, null, new CenteredContentMeasurePolicy$measure$5(barHorizontalPadding, itemsPlaceables4), 4, null);
    L12:
        int itemMaxWidth = width / itemsCount;
        barHorizontalPadding.element = ExpressiveNavigationBarKt.access$calculateCenteredContentHorizontalPadding(itemsCount, width);
        int itemMinWidth = (width - (barHorizontalPadding.element * 2)) / itemsCount;
        int index$iv = 0;
        int r11 = r29.size();
    L13:
        if (index$iv >= r11) goto L19;
        Object item$iv = r29.get(index$iv);
        int measurableHeight = ((Measurable) item$iv).maxIntrinsicHeight(itemMinWidth);
        if (itemHeight >= measurableHeight) goto L18;
        itemHeight = RangesKt.coerceAtMost(measurableHeight, Constraints.m6925getMaxHeightimpl(constraints));
    L18:
        index$iv = index$iv + 1;
        width = width;
        goto L13
    L19:
        width2 = width;
        List<? extends Measurable> r3 = r29;
        int $i$f$fastMap2 = 0;
        ArrayList target$iv2 = new ArrayList(r3.size());
        List<? extends Measurable> r8 = r3;
        int index$iv$iv2 = 0;
        int r14 = r8.size();
    L20:
        if (index$iv$iv2 >= r14) goto L25;
        Object item$iv$iv2 = r8.get(index$iv$iv2);
        List<? extends Measurable> r19 = r3;
        ArrayList $this$fastMap$iv = target$iv2;
        ArrayList r4 = $this$fastMap$iv;
        int itemMinWidth2 = itemMinWidth;
        Measurable it = (Measurable) item$iv$iv2;
        int $i$f$fastMap3 = $i$f$fastMap2;
        int $i$f$fastMap4 = Constraints.m6927getMinHeightimpl(constraints);
        int measurableWidth = it.maxIntrinsicWidth($i$f$fastMap4);
        ArrayList target$iv3 = target$iv2;
        int currentItemWidth = itemMinWidth2;
        if (currentItemWidth >= measurableWidth) goto L24;
        int currentItemWidth2 = RangesKt.coerceAtMost(measurableWidth, itemMaxWidth);
        barHorizontalPadding.element -= (currentItemWidth2 - itemMinWidth2) / 2;
        currentItemWidth = currentItemWidth2;
    L24:
        r4.add(it.mo5714measureBRTryo0(ConstraintsKt.m6941constrainN9IONVI(constraints, Constraints.Companion.m6936fixedJhjzzOo(currentItemWidth, itemHeight))));
        index$iv$iv2 = index$iv$iv2 + 1;
        r3 = r19;
        itemMinWidth = itemMinWidth2;
        itemMaxWidth = itemMaxWidth;
        $i$f$fastMap2 = $i$f$fastMap3;
        target$iv2 = target$iv3;
        itemsCount = itemsCount;
        r8 = r8;
        goto L20
    L25:
        itemsPlaceables4 = target$iv2;
        goto L27
    L5:
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, width, itemHeight, null, CenteredContentMeasurePolicy$measure$1.INSTANCE, 4, null);
    }
}
