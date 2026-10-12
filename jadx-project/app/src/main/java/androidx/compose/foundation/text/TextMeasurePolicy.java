package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: BasicText.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u0003¢\u0006\u0002\u0010\bJ,\u0010\t\u001a\u00020\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/text/TextMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "shouldMeasureLinks", "Lkotlin/Function0;", "", "placements", "", "Landroidx/compose/ui/geometry/Rect;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class TextMeasurePolicy implements MeasurePolicy {
    private final Function0<List<Rect>> placements;
    private final Function0<Boolean> shouldMeasureLinks;

    /* JADX WARN: Multi-variable type inference failed */
    public TextMeasurePolicy(Function0<Boolean> r1, Function0<? extends List<Rect>> r2) {
        this.shouldMeasureLinks = r1;
        this.placements = r2;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo32measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, List<? extends Measurable> r33, long constraints) {
        List target$iv = new ArrayList(r33.size());
        int index$iv$iv = 0;
        int r7 = r33.size();
    L3:
        if (index$iv$iv >= r7) goto L8;
        Measurable r8 = r33.get(index$iv$iv);
        Measurable it = r8;
        if ((it.getParentData() instanceof TextRangeLayoutModifier) == true) goto L7;
        target$iv.add(r8);
    L7:
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L8:
        List inlineContentMeasurables = target$iv;
        List<Rect> r2 = this.placements.invoke();
        if (r2 == null) goto L21;
        int $i$f$fastMapIndexedNotNull = 0;
        ArrayList target$iv2 = new ArrayList(r2.size());
        List<Rect> r6 = r2;
        int index$iv$iv2 = 0;
        int r9 = r6.size();
    L11:
        if (index$iv$iv2 >= r9) goto L20;
        Object item$iv$iv = r6.get(index$iv$iv2);
        int index$iv = index$iv$iv2;
        Rect rect = (Rect) item$iv$iv;
        if (rect == null) goto L15;
        Placeable r1 = ((Measurable) inlineContentMeasurables.get(index$iv)).mo5714measureBRTryo0(ConstraintsKt.Constraints$default(0, (int) Math.floor(rect.getRight() - rect.getLeft()), 0, (int) Math.floor(rect.getBottom() - rect.getTop()), 5, null));
        float $this$fastRoundToInt$iv = rect.getLeft();
        int x$iv = Math.round($this$fastRoundToInt$iv);
        float $this$fastRoundToInt$iv2 = rect.getTop();
        int y$iv = Math.round($this$fastRoundToInt$iv2);
        Pair r3 = new Pair(r1, IntOffset.m7092boximpl(IntOffset.m7095constructorimpl((((long) x$iv) << 32) | (((long) y$iv) & 4294967295L))));
    L17:
        if (r3 == null) goto L19;
        target$iv2.add(r3);
    L19:
        index$iv$iv2 = index$iv$iv2 + 1;
        $i$f$fastMapIndexedNotNull = $i$f$fastMapIndexedNotNull;
        inlineContentMeasurables = inlineContentMeasurables;
        target$iv2 = target$iv2;
        r6 = r6;
        r2 = r2;
        goto L11
    L15:
        r3 = null;
        goto L17
    L20:
        final ArrayList inlineContentToPlace = target$iv2;
    L22:
        List target$iv3 = new ArrayList(r33.size());
        int index$iv$iv3 = 0;
        int r10 = r33.size();
    L23:
        if (index$iv$iv3 >= r10) goto L28;
        Measurable r11 = r33.get(index$iv$iv3);
        Measurable it2 = r11;
        if ((it2.getParentData() instanceof TextRangeLayoutModifier) == false) goto L27;
        target$iv3.add(r11);
    L27:
        index$iv$iv3 = index$iv$iv3 + 1;
        goto L23
    L28:
        List linksMeasurables = target$iv3;
        final List linksToPlace = BasicTextKt.access$measureWithTextRangeMeasureConstraints(linksMeasurables, this.shouldMeasureLinks);
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, Constraints.m6926getMaxWidthimpl(constraints), Constraints.m6925getMaxHeightimpl(constraints), null, new TextMeasurePolicy$measure$1(inlineContentToPlace, linksToPlace), 4, null);
    L21:
        inlineContentToPlace = null;
        goto L22
    }
}
