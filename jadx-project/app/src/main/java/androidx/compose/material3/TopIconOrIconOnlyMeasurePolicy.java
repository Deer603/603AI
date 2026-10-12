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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ\"\u0010\u0017\u001a\u00020\u0018*\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016J,\u0010\u001e\u001a\u00020\u001f*\u00020 2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020!0\u001b2\u0006\u0010\"\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\n\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0019\u0010\t\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0012R\u0019\u0010\u000b\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/material3/TopIconOrIconOnlyMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "hasLabel", "", "animationProgress", "Lkotlin/Function0;", "", "indicatorHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "indicatorVerticalPadding", "indicatorToLabelVerticalPadding", "topIconItemVerticalPadding", "(ZLkotlin/jvm/functions/Function0;FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnimationProgress", "()Lkotlin/jvm/functions/Function0;", "getHasLabel", "()Z", "getIndicatorHorizontalPadding-D9Ej5fM", "()F", "F", "getIndicatorToLabelVerticalPadding-D9Ej5fM", "getIndicatorVerticalPadding-D9Ej5fM", "getTopIconItemVerticalPadding-D9Ej5fM", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class TopIconOrIconOnlyMeasurePolicy implements MeasurePolicy {
    private final Function0<Float> animationProgress;
    private final boolean hasLabel;
    private final float indicatorHorizontalPadding;
    private final float indicatorToLabelVerticalPadding;
    private final float indicatorVerticalPadding;
    private final float topIconItemVerticalPadding;

    public /* synthetic */ TopIconOrIconOnlyMeasurePolicy(boolean r1, Function0 r2, float r3, float r4, float r5, float r6, DefaultConstructorMarker r7) {
        this(r1, r2, r3, r4, r5, r6);
    }

    private TopIconOrIconOnlyMeasurePolicy(boolean hasLabel, Function0<Float> r2, float indicatorHorizontalPadding, float indicatorVerticalPadding, float indicatorToLabelVerticalPadding, float topIconItemVerticalPadding) {
        this.hasLabel = hasLabel;
        this.animationProgress = r2;
        this.indicatorHorizontalPadding = indicatorHorizontalPadding;
        this.indicatorVerticalPadding = indicatorVerticalPadding;
        this.indicatorToLabelVerticalPadding = indicatorToLabelVerticalPadding;
        this.topIconItemVerticalPadding = topIconItemVerticalPadding;
    }

    public final boolean getHasLabel() {
        return this.hasLabel;
    }

    public final Function0<Float> getAnimationProgress() {
        return this.animationProgress;
    }

    /* JADX INFO: renamed from: getIndicatorHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m2992getIndicatorHorizontalPaddingD9Ej5fM() {
        return this.indicatorHorizontalPadding;
    }

    /* JADX INFO: renamed from: getIndicatorVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m2994getIndicatorVerticalPaddingD9Ej5fM() {
        return this.indicatorVerticalPadding;
    }

    /* JADX INFO: renamed from: getIndicatorToLabelVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m2993getIndicatorToLabelVerticalPaddingD9Ej5fM() {
        return this.indicatorToLabelVerticalPadding;
    }

    /* JADX INFO: renamed from: getTopIconItemVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m2995getTopIconItemVerticalPaddingD9Ej5fM() {
        return this.topIconItemVerticalPadding;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo32measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, List<? extends Measurable> r27, long constraints) {
        float animationProgress = this.animationProgress.invoke().floatValue();
        long looseConstraints = Constraints.m6916copyZbe2FdA$default(constraints, 0, 0, 0, 0, 10, null);
        List<? extends Measurable> r2 = r27;
        int $i$f$fastFirst = 0;
        int index$iv$iv = 0;
        int r7 = r2.size();
    L4:
        if (index$iv$iv >= r7) goto L35;
        Object item$iv$iv = r2.get(index$iv$iv);
        Measurable it = (Measurable) item$iv$iv;
        List<? extends Measurable> r17 = r2;
        int $i$f$fastFirst2 = $i$f$fastFirst;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it), "icon") == true) goto L7;
        index$iv$iv = index$iv$iv + 1;
        r2 = r17;
        $i$f$fastFirst = $i$f$fastFirst2;
        goto L4
    L7:
        float arg0$iv = this.indicatorHorizontalPadding;
        int r3 = -$this$measure_u2d3p2s80s.mo370roundToPx0680j_4(Dp.m6973constructorimpl(2 * arg0$iv));
        float arg0$iv2 = this.indicatorVerticalPadding;
        Placeable iconPlaceable = ((Measurable) item$iv$iv).mo5714measureBRTryo0(ConstraintsKt.m6945offsetNN6EwU(looseConstraints, r3, -$this$measure_u2d3p2s80s.mo370roundToPx0680j_4(Dp.m6973constructorimpl(2 * arg0$iv2))));
        int r4 = iconPlaceable.getWidth();
        float arg0$iv3 = this.indicatorHorizontalPadding;
        int totalIndicatorWidth = r4 + $this$measure_u2d3p2s80s.mo370roundToPx0680j_4(Dp.m6973constructorimpl(2 * arg0$iv3));
        int r5 = iconPlaceable.getHeight();
        float arg0$iv4 = this.indicatorVerticalPadding;
        int indicatorHeight = r5 + $this$measure_u2d3p2s80s.mo370roundToPx0680j_4(Dp.m6973constructorimpl(2 * arg0$iv4));
        int animatedIndicatorWidth = MathKt.roundToInt(totalIndicatorWidth * animationProgress);
        List<? extends Measurable> r6 = r27;
        int index$iv$iv2 = 0;
        int r15 = r6.size();
    L8:
        if (index$iv$iv2 >= r15) goto L32;
        Object item$iv$iv2 = r6.get(index$iv$iv2);
        Measurable it2 = (Measurable) item$iv$iv2;
        Placeable iconPlaceable2 = iconPlaceable;
        List<? extends Measurable> r22 = r6;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it2), "indicatorRipple") == true) goto L11;
        index$iv$iv2 = index$iv$iv2 + 1;
        $this$measure_u2d3p2s80s = $this$measure_u2d3p2s80s;
        iconPlaceable = iconPlaceable2;
        r6 = r22;
        totalIndicatorWidth = totalIndicatorWidth;
        goto L8
    L11:
        Placeable indicatorRipplePlaceable = ((Measurable) item$iv$iv2).mo5714measureBRTryo0(ConstraintsKt.m6941constrainN9IONVI(looseConstraints, Constraints.Companion.m6936fixedJhjzzOo(totalIndicatorWidth, indicatorHeight)));
        int index$iv$iv3 = 0;
        int r16 = r27.size();
    L12:
        if (index$iv$iv3 >= r16) goto L29;
        Object item$iv$iv3 = r27.get(index$iv$iv3);
        Measurable it3 = (Measurable) item$iv$iv3;
        Placeable indicatorRipplePlaceable2 = indicatorRipplePlaceable;
        int totalIndicatorWidth2 = totalIndicatorWidth;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it3), "indicator") == true) goto L15;
        index$iv$iv3 = index$iv$iv3 + 1;
        $this$measure_u2d3p2s80s = $this$measure_u2d3p2s80s;
        indicatorRipplePlaceable = indicatorRipplePlaceable2;
        indicatorHeight = indicatorHeight;
        totalIndicatorWidth = totalIndicatorWidth2;
        goto L12
    L15:
        Placeable indicatorPlaceable = ((Measurable) item$iv$iv3).mo5714measureBRTryo0(ConstraintsKt.m6941constrainN9IONVI(looseConstraints, Constraints.Companion.m6936fixedJhjzzOo(animatedIndicatorWidth, indicatorHeight)));
        if (this.hasLabel == false) goto L26;
        List<? extends Measurable> r8 = r27;
        int index$iv$iv4 = 0;
        int r14 = r8.size();
    L18:
        if (index$iv$iv4 >= r14) goto L24;
        Object item$iv$iv4 = r8.get(index$iv$iv4);
        Measurable it4 = (Measurable) item$iv$iv4;
        Placeable indicatorPlaceable2 = indicatorPlaceable;
        List<? extends Measurable> r24 = r8;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it4), "label") == true) goto L21;
        index$iv$iv4 = index$iv$iv4 + 1;
        $this$measure_u2d3p2s80s = $this$measure_u2d3p2s80s;
        indicatorPlaceable = indicatorPlaceable2;
        indicatorHeight = indicatorHeight;
        animatedIndicatorWidth = animatedIndicatorWidth;
        r8 = r24;
        goto L18
    L21:
        Placeable labelPlaceable = ((Measurable) item$iv$iv4).mo5714measureBRTryo0(ConstraintsKt.m6946offsetNN6EwU$default(looseConstraints, 0, -(indicatorPlaceable2.getHeight() + $this$measure_u2d3p2s80s.mo370roundToPx0680j_4(this.indicatorToLabelVerticalPadding)), 1, null));
        return NavigationItemKt.m2443access$placeLabelAndTopIconqoqLrGI($this$measure_u2d3p2s80s, labelPlaceable, iconPlaceable2, indicatorRipplePlaceable2, indicatorPlaceable2, constraints, this.indicatorToLabelVerticalPadding, this.indicatorVerticalPadding, this.topIconItemVerticalPadding);
    L24:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    L26:
        return NavigationItemKt.m2441access$placeIconX9ElhV4($this$measure_u2d3p2s80s, iconPlaceable2, indicatorRipplePlaceable2, indicatorPlaceable, constraints);
    L29:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    L32:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    L35:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope $this$maxIntrinsicHeight, List<? extends IntrinsicMeasurable> r18, int width) {
        int index$iv$iv = 0;
        int r7 = r18.size();
    L3:
        if (index$iv$iv >= r7) goto L21;
        Object item$iv$iv = r18.get(index$iv$iv);
        IntrinsicMeasurable it = (IntrinsicMeasurable) item$iv$iv;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(it), "icon") == true) goto L6;
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L6:
        int iconHeight = ((IntrinsicMeasurable) item$iv$iv).maxIntrinsicHeight(width);
        int index$iv$iv2 = 0;
        int r8 = r18.size();
    L7:
        if (index$iv$iv2 >= r8) goto L12;
        Object it$iv = r18.get(index$iv$iv2);
        IntrinsicMeasurable it2 = (IntrinsicMeasurable) it$iv;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(it2), "label") == true) goto L13;
        index$iv$iv2 = index$iv$iv2 + 1;
    L13:
        IntrinsicMeasurable r10 = (IntrinsicMeasurable) it$iv;
        if (r10 == null) goto L16;
        int labelHeight = r10.maxIntrinsicHeight(width);
    L17:
        float arg0$iv = this.topIconItemVerticalPadding;
        float arg0$iv2 = Dp.m6973constructorimpl(2 * arg0$iv);
        float arg0$iv3 = this.indicatorVerticalPadding;
        float arg0$iv4 = Dp.m6973constructorimpl(arg0$iv2 + Dp.m6973constructorimpl(2 * arg0$iv3));
        float other$iv = this.indicatorToLabelVerticalPadding;
        int paddings = $this$maxIntrinsicHeight.mo370roundToPx0680j_4(Dp.m6973constructorimpl(arg0$iv4 + other$iv));
        return (iconHeight + labelHeight) + paddings;
    L16:
        labelHeight = 0;
        goto L17
    L12:
        it$iv = null;
        goto L13
    L21:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
