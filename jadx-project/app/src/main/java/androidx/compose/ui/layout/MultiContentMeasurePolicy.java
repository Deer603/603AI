package androidx.compose.ui.layout;

import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: MultiContentMeasurePolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bç\u0080\u0001\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J(\u0010\t\u001a\u00020\u0003*\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0016J2\u0010\u000b\u001a\u00020\f*\u00020\r2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00060\u00062\u0006\u0010\u000f\u001a\u00020\u0010H&ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0013\u001a\u00020\u0003*\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J(\u0010\u0014\u001a\u00020\u0003*\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0016ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface MultiContentMeasurePolicy {
    /* JADX INFO: renamed from: measure-3p2s80s */
    MeasureResult mo672measure3p2s80s(MeasureScope r1, List<? extends List<? extends Measurable>> r2, long r3);

    default int minIntrinsicWidth(IntrinsicMeasureScope $this$minIntrinsicWidth, List<? extends List<? extends IntrinsicMeasurable>> r31, int height) {
        List<? extends List<? extends IntrinsicMeasurable>> r0 = r31;
        int $i$f$fastMap = 0;
        ArrayList target$iv = new ArrayList(r0.size());
        List<? extends List<? extends IntrinsicMeasurable>> r3 = r0;
        int $i$f$fastForEach = 0;
        int index$iv$iv = 0;
        int r6 = r3.size();
    L3:
        if (index$iv$iv >= r6) goto L8;
        Object item$iv$iv = r3.get(index$iv$iv);
        ArrayList r10 = target$iv;
        List<? extends IntrinsicMeasurable> r11 = (List) item$iv$iv;
        List<? extends List<? extends IntrinsicMeasurable>> r16 = r0;
        ArrayList target$iv2 = new ArrayList(r11.size());
        List<? extends IntrinsicMeasurable> r1 = r11;
        int $i$f$fastMap2 = $i$f$fastMap;
        int $i$f$fastMap3 = r1.size();
        ArrayList target$iv3 = target$iv;
        int index$iv$iv2 = 0;
    L5:
        if (index$iv$iv2 >= $i$f$fastMap3) goto L7;
        Object item$iv$iv2 = r1.get(index$iv$iv2);
        int r24 = $i$f$fastMap3;
        IntrinsicMeasurable it = (IntrinsicMeasurable) item$iv$iv2;
        target$iv2.add(new DefaultIntrinsicMeasurable(it, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        index$iv$iv2 = index$iv$iv2 + 1;
        r1 = r1;
        $i$f$fastMap3 = r24;
        r3 = r3;
        $i$f$fastForEach = $i$f$fastForEach;
        goto L5
    L7:
        r10.add(target$iv2);
        index$iv$iv = index$iv$iv + 1;
        r0 = r16;
        target$iv = target$iv3;
        $i$f$fastMap = $i$f$fastMap2;
        goto L3
    L8:
        ArrayList mapped = target$iv;
        long constraints = ConstraintsKt.Constraints$default(0, 0, 0, height, 7, null);
        IntrinsicsMeasureScope layoutReceiver = new IntrinsicsMeasureScope($this$minIntrinsicWidth, $this$minIntrinsicWidth.getLayoutDirection());
        MeasureResult layoutResult = mo672measure3p2s80s(layoutReceiver, mapped, constraints);
        return layoutResult.getWidth();
    }

    default int minIntrinsicHeight(IntrinsicMeasureScope $this$minIntrinsicHeight, List<? extends List<? extends IntrinsicMeasurable>> r31, int width) {
        List<? extends List<? extends IntrinsicMeasurable>> r0 = r31;
        int $i$f$fastMap = 0;
        ArrayList target$iv = new ArrayList(r0.size());
        List<? extends List<? extends IntrinsicMeasurable>> r3 = r0;
        int $i$f$fastForEach = 0;
        int index$iv$iv = 0;
        int r6 = r3.size();
    L3:
        if (index$iv$iv >= r6) goto L8;
        Object item$iv$iv = r3.get(index$iv$iv);
        ArrayList r10 = target$iv;
        List<? extends IntrinsicMeasurable> r11 = (List) item$iv$iv;
        List<? extends List<? extends IntrinsicMeasurable>> r16 = r0;
        ArrayList target$iv2 = new ArrayList(r11.size());
        List<? extends IntrinsicMeasurable> r1 = r11;
        int $i$f$fastMap2 = $i$f$fastMap;
        int $i$f$fastMap3 = r1.size();
        ArrayList target$iv3 = target$iv;
        int index$iv$iv2 = 0;
    L5:
        if (index$iv$iv2 >= $i$f$fastMap3) goto L7;
        Object item$iv$iv2 = r1.get(index$iv$iv2);
        int r24 = $i$f$fastMap3;
        IntrinsicMeasurable it = (IntrinsicMeasurable) item$iv$iv2;
        target$iv2.add(new DefaultIntrinsicMeasurable(it, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        index$iv$iv2 = index$iv$iv2 + 1;
        r1 = r1;
        $i$f$fastMap3 = r24;
        r3 = r3;
        $i$f$fastForEach = $i$f$fastForEach;
        goto L5
    L7:
        r10.add(target$iv2);
        index$iv$iv = index$iv$iv + 1;
        r0 = r16;
        target$iv = target$iv3;
        $i$f$fastMap = $i$f$fastMap2;
        goto L3
    L8:
        ArrayList mapped = target$iv;
        long constraints = ConstraintsKt.Constraints$default(0, width, 0, 0, 13, null);
        IntrinsicsMeasureScope layoutReceiver = new IntrinsicsMeasureScope($this$minIntrinsicHeight, $this$minIntrinsicHeight.getLayoutDirection());
        MeasureResult layoutResult = mo672measure3p2s80s(layoutReceiver, mapped, constraints);
        return layoutResult.getHeight();
    }

    default int maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, List<? extends List<? extends IntrinsicMeasurable>> r31, int height) {
        List<? extends List<? extends IntrinsicMeasurable>> r0 = r31;
        int $i$f$fastMap = 0;
        ArrayList target$iv = new ArrayList(r0.size());
        List<? extends List<? extends IntrinsicMeasurable>> r3 = r0;
        int $i$f$fastForEach = 0;
        int index$iv$iv = 0;
        int r6 = r3.size();
    L3:
        if (index$iv$iv >= r6) goto L8;
        Object item$iv$iv = r3.get(index$iv$iv);
        ArrayList r10 = target$iv;
        List<? extends IntrinsicMeasurable> r11 = (List) item$iv$iv;
        List<? extends List<? extends IntrinsicMeasurable>> r16 = r0;
        ArrayList target$iv2 = new ArrayList(r11.size());
        List<? extends IntrinsicMeasurable> r1 = r11;
        int $i$f$fastMap2 = $i$f$fastMap;
        int $i$f$fastMap3 = r1.size();
        ArrayList target$iv3 = target$iv;
        int index$iv$iv2 = 0;
    L5:
        if (index$iv$iv2 >= $i$f$fastMap3) goto L7;
        Object item$iv$iv2 = r1.get(index$iv$iv2);
        int r24 = $i$f$fastMap3;
        IntrinsicMeasurable it = (IntrinsicMeasurable) item$iv$iv2;
        target$iv2.add(new DefaultIntrinsicMeasurable(it, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        index$iv$iv2 = index$iv$iv2 + 1;
        r1 = r1;
        $i$f$fastMap3 = r24;
        r3 = r3;
        $i$f$fastForEach = $i$f$fastForEach;
        goto L5
    L7:
        r10.add(target$iv2);
        index$iv$iv = index$iv$iv + 1;
        r0 = r16;
        target$iv = target$iv3;
        $i$f$fastMap = $i$f$fastMap2;
        goto L3
    L8:
        ArrayList mapped = target$iv;
        long constraints = ConstraintsKt.Constraints$default(0, 0, 0, height, 7, null);
        IntrinsicsMeasureScope layoutReceiver = new IntrinsicsMeasureScope($this$maxIntrinsicWidth, $this$maxIntrinsicWidth.getLayoutDirection());
        MeasureResult layoutResult = mo672measure3p2s80s(layoutReceiver, mapped, constraints);
        return layoutResult.getWidth();
    }

    default int maxIntrinsicHeight(IntrinsicMeasureScope $this$maxIntrinsicHeight, List<? extends List<? extends IntrinsicMeasurable>> r31, int width) {
        List<? extends List<? extends IntrinsicMeasurable>> r0 = r31;
        int $i$f$fastMap = 0;
        ArrayList target$iv = new ArrayList(r0.size());
        List<? extends List<? extends IntrinsicMeasurable>> r3 = r0;
        int $i$f$fastForEach = 0;
        int index$iv$iv = 0;
        int r6 = r3.size();
    L3:
        if (index$iv$iv >= r6) goto L8;
        Object item$iv$iv = r3.get(index$iv$iv);
        ArrayList r10 = target$iv;
        List<? extends IntrinsicMeasurable> r11 = (List) item$iv$iv;
        List<? extends List<? extends IntrinsicMeasurable>> r16 = r0;
        ArrayList target$iv2 = new ArrayList(r11.size());
        List<? extends IntrinsicMeasurable> r1 = r11;
        int $i$f$fastMap2 = $i$f$fastMap;
        int $i$f$fastMap3 = r1.size();
        ArrayList target$iv3 = target$iv;
        int index$iv$iv2 = 0;
    L5:
        if (index$iv$iv2 >= $i$f$fastMap3) goto L7;
        Object item$iv$iv2 = r1.get(index$iv$iv2);
        int r24 = $i$f$fastMap3;
        IntrinsicMeasurable it = (IntrinsicMeasurable) item$iv$iv2;
        target$iv2.add(new DefaultIntrinsicMeasurable(it, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        index$iv$iv2 = index$iv$iv2 + 1;
        r1 = r1;
        $i$f$fastMap3 = r24;
        r3 = r3;
        $i$f$fastForEach = $i$f$fastForEach;
        goto L5
    L7:
        r10.add(target$iv2);
        index$iv$iv = index$iv$iv + 1;
        r0 = r16;
        target$iv = target$iv3;
        $i$f$fastMap = $i$f$fastMap2;
        goto L3
    L8:
        ArrayList mapped = target$iv;
        long constraints = ConstraintsKt.Constraints$default(0, width, 0, 0, 13, null);
        IntrinsicsMeasureScope layoutReceiver = new IntrinsicsMeasureScope($this$maxIntrinsicHeight, $this$maxIntrinsicHeight.getLayoutDirection());
        MeasureResult layoutResult = mo672measure3p2s80s(layoutReceiver, mapped, constraints);
        return layoutResult.getHeight();
    }
}
