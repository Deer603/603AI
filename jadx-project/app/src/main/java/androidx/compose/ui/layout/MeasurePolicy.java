package androidx.compose.ui.layout;

import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: MeasurePolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\"\u0010\t\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0016J%\u0010\u000b\u001a\u00020\f*\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u000f\u001a\u00020\u0010H&ø\u0001\u0000J\"\u0010\u0011\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\"\u0010\u0012\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0016ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/MeasurePolicy;", "", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface MeasurePolicy {

    /* JADX INFO: compiled from: MeasurePolicy.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static int minIntrinsicWidth(MeasurePolicy $this, IntrinsicMeasureScope $receiver, List<? extends IntrinsicMeasurable> r3, int height) {
            return MeasurePolicy.access$minIntrinsicWidth$jd($this, $receiver, r3, height);
        }

        @Deprecated
        public static int minIntrinsicHeight(MeasurePolicy $this, IntrinsicMeasureScope $receiver, List<? extends IntrinsicMeasurable> r3, int width) {
            return MeasurePolicy.access$minIntrinsicHeight$jd($this, $receiver, r3, width);
        }

        @Deprecated
        public static int maxIntrinsicWidth(MeasurePolicy $this, IntrinsicMeasureScope $receiver, List<? extends IntrinsicMeasurable> r3, int height) {
            return MeasurePolicy.access$maxIntrinsicWidth$jd($this, $receiver, r3, height);
        }

        @Deprecated
        public static int maxIntrinsicHeight(MeasurePolicy $this, IntrinsicMeasureScope $receiver, List<? extends IntrinsicMeasurable> r3, int width) {
            return MeasurePolicy.access$maxIntrinsicHeight$jd($this, $receiver, r3, width);
        }
    }

    /* JADX INFO: renamed from: measure-3p2s80s */
    MeasureResult mo32measure3p2s80s(MeasureScope r1, List<? extends Measurable> r2, long r3);

    static /* synthetic */ int access$maxIntrinsicHeight$jd(MeasurePolicy $this, IntrinsicMeasureScope $receiver, List measurables, int width) {
        return super.maxIntrinsicHeight($receiver, measurables, width);
    }

    static /* synthetic */ int access$maxIntrinsicWidth$jd(MeasurePolicy $this, IntrinsicMeasureScope $receiver, List measurables, int height) {
        return super.maxIntrinsicWidth($receiver, measurables, height);
    }

    static /* synthetic */ int access$minIntrinsicHeight$jd(MeasurePolicy $this, IntrinsicMeasureScope $receiver, List measurables, int width) {
        return super.minIntrinsicHeight($receiver, measurables, width);
    }

    static /* synthetic */ int access$minIntrinsicWidth$jd(MeasurePolicy $this, IntrinsicMeasureScope $receiver, List measurables, int height) {
        return super.minIntrinsicWidth($receiver, measurables, height);
    }

    default int minIntrinsicWidth(IntrinsicMeasureScope $this$minIntrinsicWidth, List<? extends IntrinsicMeasurable> r18, int height) {
        List target$iv = new ArrayList(r18.size());
        int index$iv$iv = 0;
        int r6 = r18.size();
    L3:
        if (index$iv$iv >= r6) goto L5;
        Object item$iv$iv = r18.get(index$iv$iv);
        IntrinsicMeasurable it = (IntrinsicMeasurable) item$iv$iv;
        target$iv.add(new DefaultIntrinsicMeasurable(it, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L5:
        List mapped = target$iv;
        long constraints = ConstraintsKt.Constraints$default(0, 0, 0, height, 7, null);
        IntrinsicsMeasureScope layoutReceiver = new IntrinsicsMeasureScope($this$minIntrinsicWidth, $this$minIntrinsicWidth.getLayoutDirection());
        MeasureResult layoutResult = mo32measure3p2s80s(layoutReceiver, mapped, constraints);
        return layoutResult.getWidth();
    }

    default int minIntrinsicHeight(IntrinsicMeasureScope $this$minIntrinsicHeight, List<? extends IntrinsicMeasurable> r18, int width) {
        List target$iv = new ArrayList(r18.size());
        int index$iv$iv = 0;
        int r6 = r18.size();
    L3:
        if (index$iv$iv >= r6) goto L5;
        Object item$iv$iv = r18.get(index$iv$iv);
        IntrinsicMeasurable it = (IntrinsicMeasurable) item$iv$iv;
        target$iv.add(new DefaultIntrinsicMeasurable(it, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L5:
        List mapped = target$iv;
        long constraints = ConstraintsKt.Constraints$default(0, width, 0, 0, 13, null);
        IntrinsicsMeasureScope layoutReceiver = new IntrinsicsMeasureScope($this$minIntrinsicHeight, $this$minIntrinsicHeight.getLayoutDirection());
        MeasureResult layoutResult = mo32measure3p2s80s(layoutReceiver, mapped, constraints);
        return layoutResult.getHeight();
    }

    default int maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, List<? extends IntrinsicMeasurable> r18, int height) {
        List target$iv = new ArrayList(r18.size());
        int index$iv$iv = 0;
        int r6 = r18.size();
    L3:
        if (index$iv$iv >= r6) goto L5;
        Object item$iv$iv = r18.get(index$iv$iv);
        IntrinsicMeasurable it = (IntrinsicMeasurable) item$iv$iv;
        target$iv.add(new DefaultIntrinsicMeasurable(it, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L5:
        List mapped = target$iv;
        long constraints = ConstraintsKt.Constraints$default(0, 0, 0, height, 7, null);
        IntrinsicsMeasureScope layoutReceiver = new IntrinsicsMeasureScope($this$maxIntrinsicWidth, $this$maxIntrinsicWidth.getLayoutDirection());
        MeasureResult layoutResult = mo32measure3p2s80s(layoutReceiver, mapped, constraints);
        return layoutResult.getWidth();
    }

    default int maxIntrinsicHeight(IntrinsicMeasureScope $this$maxIntrinsicHeight, List<? extends IntrinsicMeasurable> r18, int width) {
        List target$iv = new ArrayList(r18.size());
        int index$iv$iv = 0;
        int r6 = r18.size();
    L3:
        if (index$iv$iv >= r6) goto L5;
        Object item$iv$iv = r18.get(index$iv$iv);
        IntrinsicMeasurable it = (IntrinsicMeasurable) item$iv$iv;
        target$iv.add(new DefaultIntrinsicMeasurable(it, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L5:
        List mapped = target$iv;
        long constraints = ConstraintsKt.Constraints$default(0, width, 0, 0, 13, null);
        IntrinsicsMeasureScope layoutReceiver = new IntrinsicsMeasureScope($this$maxIntrinsicHeight, $this$maxIntrinsicHeight.getLayoutDirection());
        MeasureResult layoutResult = mo32measure3p2s80s(layoutReceiver, mapped, constraints);
        return layoutResult.getHeight();
    }
}
