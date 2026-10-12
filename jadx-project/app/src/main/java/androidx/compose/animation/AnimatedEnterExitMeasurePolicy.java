package androidx.compose.animation;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: AnimatedVisibility.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\r\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\"\u0010\u0014\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J,\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00190\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\"\u0010\u001f\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u000eH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/animation/AnimatedEnterExitMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "scope", "Landroidx/compose/animation/AnimatedVisibilityScopeImpl;", "(Landroidx/compose/animation/AnimatedVisibilityScopeImpl;)V", "hasLookaheadOccurred", "", "getHasLookaheadOccurred", "()Z", "setHasLookaheadOccurred", "(Z)V", "getScope", "()Landroidx/compose/animation/AnimatedVisibilityScopeImpl;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AnimatedEnterExitMeasurePolicy implements MeasurePolicy {
    private boolean hasLookaheadOccurred;
    private final AnimatedVisibilityScopeImpl scope;

    public AnimatedEnterExitMeasurePolicy(AnimatedVisibilityScopeImpl scope) {
        this.scope = scope;
    }

    public final AnimatedVisibilityScopeImpl getScope() {
        return this.scope;
    }

    public final boolean getHasLookaheadOccurred() {
        return this.hasLookaheadOccurred;
    }

    public final void setHasLookaheadOccurred(boolean r1) {
        this.hasLookaheadOccurred = r1;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo32measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, List<? extends Measurable> r23, long constraints) {
        List<? extends Measurable> r3 = r23;
        List target$iv = new ArrayList(r3.size());
        int index$iv$iv = 0;
        int r9 = r3.size();
        int maxWidth = 0;
        int maxHeight = 0;
    L3:
        if (index$iv$iv >= r9) goto L5;
        Object item$iv$iv = r3.get(index$iv$iv);
        Measurable it = (Measurable) item$iv$iv;
        List<? extends Measurable> r18 = r3;
        Placeable $this$measure_3p2s80s_u24lambda_u241_u24lambda_u240 = it.mo5714measureBRTryo0(constraints);
        maxWidth = Math.max(maxWidth, $this$measure_3p2s80s_u24lambda_u241_u24lambda_u240.getWidth());
        maxHeight = Math.max(maxHeight, $this$measure_3p2s80s_u24lambda_u241_u24lambda_u240.getHeight());
        target$iv.add($this$measure_3p2s80s_u24lambda_u241_u24lambda_u240);
        index$iv$iv = index$iv$iv + 1;
        r3 = r18;
        goto L3
    L5:
        final List placeables = target$iv;
        if ($this$measure_u2d3p2s80s.isLookingAhead() == false) goto L9;
        this.hasLookaheadOccurred = true;
        int height$iv = maxHeight;
        int width$iv = maxWidth;
        this.scope.getTargetSize$animation_release().setValue(IntSize.m7136boximpl(IntSize.m7139constructorimpl((((long) height$iv) & 4294967295L) | (((long) width$iv) << 32))));
    L12:
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, maxWidth, maxHeight, null, new AnimatedEnterExitMeasurePolicy$measure$1(placeables), 4, null);
    L9:
        if (this.hasLookaheadOccurred == true) goto L12;
        int height$iv2 = maxHeight;
        int width$iv2 = maxWidth;
        this.scope.getTargetSize$animation_release().setValue(IntSize.m7136boximpl(IntSize.m7139constructorimpl((((long) width$iv2) << 32) | (((long) height$iv2) & 4294967295L))));
        goto L12
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope $this$minIntrinsicWidth, List<? extends IntrinsicMeasurable> r10, int height) {
        if (r10.isEmpty() == true) goto L15;
        IntrinsicMeasurable it = r10.get(0);
        int maxValue$iv = it.minIntrinsicWidth(height);
        int i$iv = 1;
        int r5 = CollectionsKt.getLastIndex(r10);
        if (1 > r5) goto L12;
    L7:
        IntrinsicMeasurable it2 = r10.get(i$iv);
        int v$iv = it2.minIntrinsicWidth(height);
        if (v$iv <= maxValue$iv) goto L10;
        maxValue$iv = v$iv;
    L10:
        if (i$iv == r5) goto L12;
        i$iv = i$iv + 1;
    L12:
        int defaultValue$iv = maxValue$iv;
        return defaultValue$iv;
    L15:
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope $this$minIntrinsicHeight, List<? extends IntrinsicMeasurable> r10, int width) {
        if (r10.isEmpty() == true) goto L15;
        IntrinsicMeasurable it = r10.get(0);
        int maxValue$iv = it.minIntrinsicHeight(width);
        int i$iv = 1;
        int r5 = CollectionsKt.getLastIndex(r10);
        if (1 > r5) goto L12;
    L7:
        IntrinsicMeasurable it2 = r10.get(i$iv);
        int v$iv = it2.minIntrinsicHeight(width);
        if (v$iv <= maxValue$iv) goto L10;
        maxValue$iv = v$iv;
    L10:
        if (i$iv == r5) goto L12;
        i$iv = i$iv + 1;
    L12:
        int defaultValue$iv = maxValue$iv;
        return defaultValue$iv;
    L15:
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, List<? extends IntrinsicMeasurable> r10, int height) {
        if (r10.isEmpty() == true) goto L15;
        IntrinsicMeasurable it = r10.get(0);
        int maxValue$iv = it.maxIntrinsicWidth(height);
        int i$iv = 1;
        int r5 = CollectionsKt.getLastIndex(r10);
        if (1 > r5) goto L12;
    L7:
        IntrinsicMeasurable it2 = r10.get(i$iv);
        int v$iv = it2.maxIntrinsicWidth(height);
        if (v$iv <= maxValue$iv) goto L10;
        maxValue$iv = v$iv;
    L10:
        if (i$iv == r5) goto L12;
        i$iv = i$iv + 1;
    L12:
        int defaultValue$iv = maxValue$iv;
        return defaultValue$iv;
    L15:
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope $this$maxIntrinsicHeight, List<? extends IntrinsicMeasurable> r10, int width) {
        if (r10.isEmpty() == true) goto L15;
        IntrinsicMeasurable it = r10.get(0);
        int maxValue$iv = it.maxIntrinsicHeight(width);
        int i$iv = 1;
        int r5 = CollectionsKt.getLastIndex(r10);
        if (1 > r5) goto L12;
    L7:
        IntrinsicMeasurable it2 = r10.get(i$iv);
        int v$iv = it2.maxIntrinsicHeight(width);
        if (v$iv <= maxValue$iv) goto L10;
        maxValue$iv = v$iv;
    L10:
        if (i$iv == r5) goto L12;
        i$iv = i$iv + 1;
    L12:
        int defaultValue$iv = maxValue$iv;
        return defaultValue$iv;
    L15:
        return 0;
    }
}
