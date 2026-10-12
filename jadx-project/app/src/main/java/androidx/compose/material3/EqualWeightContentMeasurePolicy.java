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
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: ExpressiveNavigationBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/material3/EqualWeightContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "()V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class EqualWeightContentMeasurePolicy implements MeasurePolicy {
    public EqualWeightContentMeasurePolicy() {
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo32measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, List<? extends Measurable> r24, long constraints) {
        int width = Constraints.m6926getMaxWidthimpl(constraints);
        int itemHeight = Constraints.m6927getMinHeightimpl(constraints);
        int itemsCount = r24.size();
        if (itemsCount < 1) goto L5;
        List itemsPlaceables = null;
        if (Constraints.m6922getHasBoundedWidthimpl(constraints) == true) goto L12;
        List<? extends Measurable> r5 = r24;
        int $i$f$fastMap = 0;
        ArrayList target$iv = new ArrayList(r5.size());
        int index$iv$iv = 0;
        int r12 = r5.size();
    L9:
        if (index$iv$iv >= r12) goto L11;
        Object item$iv$iv = r5.get(index$iv$iv);
        List itemsPlaceables2 = itemsPlaceables;
        int width2 = width;
        Measurable it = (Measurable) item$iv$iv;
        List<? extends Measurable> r19 = r5;
        target$iv.add(it.mo5714measureBRTryo0(ConstraintsKt.m6941constrainN9IONVI(constraints, Constraints.Companion.m6937fixedHeightOenEA2s(itemHeight))));
        index$iv$iv = index$iv$iv + 1;
        itemsPlaceables = itemsPlaceables2;
        width = width2;
        r5 = r19;
        $i$f$fastMap = $i$f$fastMap;
        goto L9
    L11:
        int width3 = width;
        final List itemsPlaceables3 = target$iv;
    L22:
        int width4 = width3;
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, width4, itemHeight, null, new EqualWeightContentMeasurePolicy$measure$5(itemsPlaceables3), 4, null);
    L12:
        width3 = width;
        int width5 = width3 / itemsCount;
        int index$iv = 0;
        int r7 = r24.size();
    L13:
        if (index$iv >= r7) goto L18;
        Object item$iv = r24.get(index$iv);
        Measurable it2 = (Measurable) item$iv;
        int measurableHeight = it2.maxIntrinsicHeight(width5);
        if (itemHeight >= measurableHeight) goto L17;
        itemHeight = RangesKt.coerceAtMost(measurableHeight, Constraints.m6925getMaxHeightimpl(constraints));
    L17:
        index$iv = index$iv + 1;
        goto L13
    L18:
        List<? extends Measurable> r2 = r24;
        int $i$f$fastMap2 = 0;
        ArrayList target$iv2 = new ArrayList(r2.size());
        int index$iv$iv2 = 0;
        int r11 = r2.size();
    L19:
        if (index$iv$iv2 >= r11) goto L21;
        Object item$iv$iv2 = r2.get(index$iv$iv2);
        List<? extends Measurable> r18 = r2;
        Measurable it3 = (Measurable) item$iv$iv2;
        int $i$f$fastMap3 = $i$f$fastMap2;
        target$iv2.add(it3.mo5714measureBRTryo0(ConstraintsKt.m6941constrainN9IONVI(constraints, Constraints.Companion.m6936fixedJhjzzOo(width5, itemHeight))));
        index$iv$iv2 = index$iv$iv2 + 1;
        r2 = r18;
        $i$f$fastMap2 = $i$f$fastMap3;
        target$iv2 = target$iv2;
        goto L19
    L21:
        itemsPlaceables3 = target$iv2;
        goto L22
    L5:
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, width, itemHeight, null, EqualWeightContentMeasurePolicy$measure$1.INSTANCE, 4, null);
    }
}
