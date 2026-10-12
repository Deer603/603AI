package androidx.compose.material3;

import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: NavigationItem.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\"\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0012H\u0016J\"\u0010\u0018\u001a\u00020\u0012*\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u0012H\u0016J,\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00152\u0006\u0010\u001e\u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\b\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/material3/StartIconMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "animationProgress", "Lkotlin/Function0;", "", "indicatorHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "indicatorVerticalPadding", "startIconToLabelHorizontalPadding", "(Lkotlin/jvm/functions/Function0;FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnimationProgress", "()Lkotlin/jvm/functions/Function0;", "getIndicatorHorizontalPadding-D9Ej5fM", "()F", "F", "getIndicatorVerticalPadding-D9Ej5fM", "getStartIconToLabelHorizontalPadding-D9Ej5fM", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class StartIconMeasurePolicy implements MeasurePolicy {
    private final Function0<Float> animationProgress;
    private final float indicatorHorizontalPadding;
    private final float indicatorVerticalPadding;
    private final float startIconToLabelHorizontalPadding;

    public /* synthetic */ StartIconMeasurePolicy(Function0 r1, float r2, float r3, float r4, DefaultConstructorMarker r5) {
        this(r1, r2, r3, r4);
    }

    private StartIconMeasurePolicy(Function0<Float> r1, float indicatorHorizontalPadding, float indicatorVerticalPadding, float startIconToLabelHorizontalPadding) {
        this.animationProgress = r1;
        this.indicatorHorizontalPadding = indicatorHorizontalPadding;
        this.indicatorVerticalPadding = indicatorVerticalPadding;
        this.startIconToLabelHorizontalPadding = startIconToLabelHorizontalPadding;
    }

    public final Function0<Float> getAnimationProgress() {
        return this.animationProgress;
    }

    /* JADX INFO: renamed from: getIndicatorHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m2659getIndicatorHorizontalPaddingD9Ej5fM() {
        return this.indicatorHorizontalPadding;
    }

    /* JADX INFO: renamed from: getIndicatorVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m2660getIndicatorVerticalPaddingD9Ej5fM() {
        return this.indicatorVerticalPadding;
    }

    /* JADX INFO: renamed from: getStartIconToLabelHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m2661getStartIconToLabelHorizontalPaddingD9Ej5fM() {
        return this.startIconToLabelHorizontalPadding;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo32measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, List<? extends Measurable> r28, long constraints) {
        MeasureScope r1 = $this$measure_u2d3p2s80s;
        float animationProgress = this.animationProgress.invoke().floatValue();
        long looseConstraints = Constraints.m6916copyZbe2FdA$default(constraints, 0, 0, 0, 0, 10, null);
        float arg0$iv = this.indicatorHorizontalPadding;
        int r2 = -r1.mo370roundToPx0680j_4(Dp.m6973constructorimpl(2 * arg0$iv));
        float arg0$iv2 = this.indicatorVerticalPadding;
        long iconConstraints = ConstraintsKt.m6945offsetNN6EwU(looseConstraints, r2, -r1.mo370roundToPx0680j_4(Dp.m6973constructorimpl(2 * arg0$iv2)));
        List<? extends Measurable> r3 = r28;
        int $i$f$fastFirst = 0;
        int index$iv$iv = 0;
        int r7 = r3.size();
    L4:
        if (index$iv$iv >= r7) goto L32;
        Object item$iv$iv = r3.get(index$iv$iv);
        Measurable it = (Measurable) item$iv$iv;
        List<? extends Measurable> r19 = r3;
        int $i$f$fastFirst2 = $i$f$fastFirst;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it), "icon") == true) goto L7;
        index$iv$iv = index$iv$iv + 1;
        r1 = $this$measure_u2d3p2s80s;
        r3 = r19;
        $i$f$fastFirst = $i$f$fastFirst2;
        goto L4
    L7:
        Placeable iconPlaceable = ((Measurable) item$iv$iv).mo5714measureBRTryo0(iconConstraints);
        List<? extends Measurable> r4 = r28;
        int index$iv$iv2 = 0;
        int r10 = r4.size();
    L8:
        if (index$iv$iv2 >= r10) goto L29;
        Object item$iv$iv2 = r4.get(index$iv$iv2);
        Measurable it2 = (Measurable) item$iv$iv2;
        List<? extends Measurable> r20 = r4;
        Placeable iconPlaceable2 = iconPlaceable;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it2), "label") == true) goto L11;
        iconPlaceable = iconPlaceable2;
        index$iv$iv2 = index$iv$iv2 + 1;
        r1 = $this$measure_u2d3p2s80s;
        r4 = r20;
        goto L8
    L11:
        Placeable labelPlaceable = ((Measurable) item$iv$iv2).mo5714measureBRTryo0(ConstraintsKt.m6946offsetNN6EwU$default(iconConstraints, -(iconPlaceable2.getWidth() + r1.mo370roundToPx0680j_4(this.startIconToLabelHorizontalPadding)), 0, 2, null));
        int r5 = iconPlaceable2.getWidth() + labelPlaceable.getWidth();
        float arg0$iv3 = this.startIconToLabelHorizontalPadding;
        float arg0$iv4 = this.indicatorHorizontalPadding;
        int totalIndicatorWidth = r5 + r1.mo370roundToPx0680j_4(Dp.m6973constructorimpl(arg0$iv3 + Dp.m6973constructorimpl(2 * arg0$iv4)));
        int r6 = Math.max(iconPlaceable2.getHeight(), labelPlaceable.getHeight());
        float arg0$iv5 = this.indicatorVerticalPadding;
        int indicatorHeight = r6 + r1.mo370roundToPx0680j_4(Dp.m6973constructorimpl(2 * arg0$iv5));
        int animatedIndicatorWidth = MathKt.roundToInt(totalIndicatorWidth * animationProgress);
        int r8 = r28.size();
        Placeable labelPlaceable2 = labelPlaceable;
        int index$iv$iv3 = 0;
    L12:
        if (index$iv$iv3 >= r8) goto L26;
        Object item$iv$iv3 = r28.get(index$iv$iv3);
        Measurable it3 = (Measurable) item$iv$iv3;
        int r23 = r8;
        int index$iv$iv4 = index$iv$iv3;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it3), "indicatorRipple") == true) goto L15;
        animatedIndicatorWidth = animatedIndicatorWidth;
        labelPlaceable2 = labelPlaceable2;
        index$iv$iv3 = index$iv$iv4 + 1;
        r8 = r23;
        goto L12
    L15:
        Placeable indicatorRipplePlaceable = ((Measurable) item$iv$iv3).mo5714measureBRTryo0(ConstraintsKt.m6941constrainN9IONVI(looseConstraints, Constraints.Companion.m6936fixedJhjzzOo(totalIndicatorWidth, indicatorHeight)));
        int $i$f$fastFirst3 = 0;
        int index$iv$iv5 = 0;
        int r9 = r28.size();
    L16:
        if (index$iv$iv5 >= r9) goto L23;
        Object item$iv$iv4 = r28.get(index$iv$iv5);
        Measurable it4 = (Measurable) item$iv$iv4;
        int r24 = r9;
        int $i$f$fastFirst4 = $i$f$fastFirst3;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it4), "indicator") == true) goto L19;
        index$iv$iv5 = index$iv$iv5 + 1;
        animatedIndicatorWidth = animatedIndicatorWidth;
        r9 = r24;
        labelPlaceable2 = labelPlaceable2;
        $i$f$fastFirst3 = $i$f$fastFirst4;
        goto L16
    L19:
        Placeable indicatorPlaceable = ((Measurable) item$iv$iv4).mo5714measureBRTryo0(ConstraintsKt.m6941constrainN9IONVI(looseConstraints, Constraints.Companion.m6936fixedJhjzzOo(animatedIndicatorWidth, indicatorHeight)));
        return NavigationItemKt.m2442access$placeLabelAndStartIconnru01g4($this$measure_u2d3p2s80s, labelPlaceable2, iconPlaceable2, indicatorRipplePlaceable, indicatorPlaceable, constraints, this.startIconToLabelHorizontalPadding);
    L23:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    L26:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    L29:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    L32:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, List<? extends IntrinsicMeasurable> r19, int height) {
        int index$iv$iv = 0;
        int r7 = r19.size();
    L4:
        if (index$iv$iv >= r7) goto L18;
        Object item$iv$iv = r19.get(index$iv$iv);
        IntrinsicMeasurable it = (IntrinsicMeasurable) item$iv$iv;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(it), "icon") == true) goto L7;
        index$iv$iv = index$iv$iv + 1;
        goto L4
    L7:
        int iconWidth = ((IntrinsicMeasurable) item$iv$iv).maxIntrinsicWidth(height);
        int index$iv$iv2 = 0;
        int r9 = r19.size();
    L8:
        if (index$iv$iv2 >= r9) goto L15;
        Object item$iv$iv2 = r19.get(index$iv$iv2);
        IntrinsicMeasurable it2 = (IntrinsicMeasurable) item$iv$iv2;
        int iconWidth2 = iconWidth;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(it2), "label") == true) goto L11;
        index$iv$iv2 = index$iv$iv2 + 1;
        iconWidth = iconWidth2;
        goto L8
    L11:
        int labelWidth = ((IntrinsicMeasurable) item$iv$iv2).maxIntrinsicWidth(height);
        float arg0$iv = this.indicatorHorizontalPadding;
        float arg0$iv2 = Dp.m6973constructorimpl(2 * arg0$iv);
        float other$iv = this.startIconToLabelHorizontalPadding;
        int paddings = $this$maxIntrinsicWidth.mo370roundToPx0680j_4(Dp.m6973constructorimpl(arg0$iv2 + other$iv));
        return (iconWidth2 + labelWidth) + paddings;
    L15:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    L18:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope $this$maxIntrinsicHeight, List<? extends IntrinsicMeasurable> r18, int width) {
        int index$iv$iv = 0;
        int r6 = r18.size();
    L4:
        if (index$iv$iv >= r6) goto L18;
        Object item$iv$iv = r18.get(index$iv$iv);
        IntrinsicMeasurable it = (IntrinsicMeasurable) item$iv$iv;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(it), "icon") == true) goto L7;
        index$iv$iv = index$iv$iv + 1;
        goto L4
    L7:
        int iconHeight = ((IntrinsicMeasurable) item$iv$iv).maxIntrinsicHeight(width);
        int index$iv$iv2 = 0;
        int r8 = r18.size();
    L8:
        if (index$iv$iv2 >= r8) goto L15;
        Object item$iv$iv2 = r18.get(index$iv$iv2);
        IntrinsicMeasurable it2 = (IntrinsicMeasurable) item$iv$iv2;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(it2), "label") == true) goto L11;
        index$iv$iv2 = index$iv$iv2 + 1;
        goto L8
    L11:
        int labelHeight = ((IntrinsicMeasurable) item$iv$iv2).maxIntrinsicHeight(width);
        float arg0$iv = this.indicatorVerticalPadding;
        int paddings = $this$maxIntrinsicHeight.mo370roundToPx0680j_4(Dp.m6973constructorimpl(2 * arg0$iv));
        return Math.max(iconHeight, labelHeight) + paddings;
    L15:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    L18:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
