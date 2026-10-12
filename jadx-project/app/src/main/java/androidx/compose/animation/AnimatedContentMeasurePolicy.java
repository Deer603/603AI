package androidx.compose.animation;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\"\u0010\u000e\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J,\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u0018\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\"\u0010\u0019\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/AnimatedContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "rootScope", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", "getRootScope", "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AnimatedContentMeasurePolicy implements MeasurePolicy {
    private final AnimatedContentTransitionScopeImpl<?> rootScope;

    public AnimatedContentMeasurePolicy(AnimatedContentTransitionScopeImpl<?> r1) {
        this.rootScope = r1;
    }

    public final AnimatedContentTransitionScopeImpl<?> getRootScope() {
        return this.rootScope;
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [kotlin.collections.IntIterator] */
    /* JADX WARN: Type inference failed for: r8v7, types: [kotlin.collections.IntIterator] */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo32measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, List<? extends Measurable> r35, long constraints) {
        final Placeable[] placeables = new Placeable[r35.size()];
        long targetSize = IntSize.Companion.m7149getZeroYbymL2g();
        List<? extends Measurable> r6 = r35;
        int index$iv = 0;
        int r9 = r6.size();
    L3:
        boolean r14 = true;
        int r15 = 0;
        if (index$iv >= r9) goto L19;
        Object item$iv = r6.get(index$iv);
        Measurable measurable = (Measurable) item$iv;
        int index = index$iv;
        Object r12 = measurable.getParentData();
        if ((r12 instanceof AnimatedContentTransitionScopeImpl.ChildData) == false) goto L8;
        AnimatedContentTransitionScopeImpl.ChildData r13 = (AnimatedContentTransitionScopeImpl.ChildData) r12;
    L9:
        if (r13 != null) goto L11;
    L14:
        r14 = false;
    L15:
        if (r14 == false) goto L18;
        Placeable it = measurable.mo5714measureBRTryo0(constraints);
        int width$iv = it.getWidth();
        int height$iv = it.getHeight();
        long targetSize2 = width$iv;
        targetSize = IntSize.m7139constructorimpl((targetSize2 << 32) | (((long) height$iv) & 4294967295L));
        Unit r7 = Unit.INSTANCE;
        placeables[index] = it;
    L18:
        index$iv = index$iv + 1;
        r6 = r6;
        goto L3
    L11:
        if (r13.isTarget() != true) goto L14;
    L8:
        r13 = null;
        goto L9
    L19:
        long targetSize3 = targetSize;
        int index$iv2 = 0;
        int r8 = r35.size();
    L20:
        if (index$iv2 >= r8) goto L26;
        Object item$iv2 = r35.get(index$iv2);
        Measurable measurable2 = (Measurable) item$iv2;
        int index2 = index$iv2;
        if (placeables[index2] != null) goto L24;
        placeables[index2] = measurable2.mo5714measureBRTryo0(constraints);
    L24:
        index$iv2 = index$iv2 + 1;
        goto L20
    L26:
        if ($this$measure_u2d3p2s80s.isLookingAhead() == false) goto L29;
        final int maxWidth = (int) (targetSize3 >> 32);
    L56:
        if ($this$measure_u2d3p2s80s.isLookingAhead() == false) goto L59;
        int r28 = (int) (targetSize3 & 4294967295L);
    L85:
        final int maxHeight = r28;
        if ($this$measure_u2d3p2s80s.isLookingAhead() == true) goto L89;
        this.rootScope.m57setMeasuredSizeozmzZPI$animation_release(IntSize.m7139constructorimpl((((long) maxWidth) << 32) | (((long) maxHeight) & 4294967295L)));
    L89:
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, maxWidth, maxHeight, null, new AnimatedContentMeasurePolicy$measure$3(placeables, this, maxWidth, maxHeight), 4, null);
    L59:
        if (placeables.length != 0) goto L61;
        boolean r10 = true;
    L62:
        if (r10 == false) goto L64;
        Placeable r16 = null;
    L82:
        if (r16 == null) goto L84;
        r15 = r16.getHeight();
    L84:
        r28 = r15;
        goto L85
    L64:
        r16 = placeables[0];
        int lastIndex$iv = ArraysKt.getLastIndex(placeables);
        if (lastIndex$iv == 0) goto L82;
        if (r16 == null) goto L70;
        int maxValue$iv = r16.getHeight();
    L71:
        ?? r11 = new IntRange(1, lastIndex$iv).iterator();
    L73:
        if (r11.hasNext() == false) goto L82;
        int i$iv = r11.nextInt();
        Placeable r17 = placeables[i$iv];
        if (r17 == null) goto L77;
        int r18 = r17.getHeight();
    L78:
        int v$iv = r18;
        if (maxValue$iv >= v$iv) goto L73;
        r16 = r17;
        maxValue$iv = v$iv;
        goto L73
    L77:
        r18 = 0;
        goto L78
    L70:
        maxValue$iv = 0;
        goto L71
    L61:
        r10 = false;
        goto L62
    L29:
        if (placeables.length != 0) goto L31;
        boolean r19 = true;
    L32:
        if (r19 == false) goto L34;
        Placeable r20 = null;
    L52:
        if (r20 == null) goto L54;
        maxWidth = r20.getWidth();
        goto L56
    L54:
        maxWidth = 0;
        goto L56
    L34:
        r20 = placeables[0];
        int lastIndex$iv2 = ArraysKt.getLastIndex(placeables);
        if (lastIndex$iv2 == 0) goto L52;
        if (r20 == null) goto L40;
        int maxValue$iv2 = r20.getWidth();
    L41:
        ?? r21 = new IntRange(1, lastIndex$iv2).iterator();
    L43:
        if (r21.hasNext() == false) goto L52;
        int i$iv2 = r21.nextInt();
        Placeable r110 = placeables[i$iv2];
        if (r110 == null) goto L47;
        int r111 = r110.getWidth();
    L48:
        int v$iv2 = r111;
        if (maxValue$iv2 >= v$iv2) goto L43;
        r20 = r110;
        maxValue$iv2 = v$iv2;
        goto L43
    L47:
        r111 = 0;
        goto L48
    L40:
        maxValue$iv2 = 0;
        goto L41
    L31:
        r19 = false;
        goto L32
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope $this$minIntrinsicWidth, List<? extends IntrinsicMeasurable> r10, int height) {
        if (r10.isEmpty() == false) goto L5;
        Integer r2 = null;
    L13:
        Integer r3 = r2;
        if (r3 != null) goto L16;
        return 0;
    L16:
        return r3.intValue();
    L5:
        IntrinsicMeasurable it = r10.get(0);
        r2 = Integer.valueOf(it.minIntrinsicWidth(height));
        int i$iv = 1;
        int r5 = CollectionsKt.getLastIndex(r10);
        if (1 > r5) goto L13;
    L7:
        IntrinsicMeasurable it2 = r10.get(i$iv);
        Integer r6 = Integer.valueOf(it2.minIntrinsicWidth(height));
        if (r6.compareTo(r2) <= 0) goto L10;
        r2 = r6;
    L10:
        if (i$iv == r5) goto L13;
        i$iv = i$iv + 1;
        goto L7
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope $this$minIntrinsicHeight, List<? extends IntrinsicMeasurable> r10, int width) {
        if (r10.isEmpty() == false) goto L5;
        Integer r2 = null;
    L13:
        Integer r3 = r2;
        if (r3 != null) goto L16;
        return 0;
    L16:
        return r3.intValue();
    L5:
        IntrinsicMeasurable it = r10.get(0);
        r2 = Integer.valueOf(it.minIntrinsicHeight(width));
        int i$iv = 1;
        int r5 = CollectionsKt.getLastIndex(r10);
        if (1 > r5) goto L13;
    L7:
        IntrinsicMeasurable it2 = r10.get(i$iv);
        Integer r6 = Integer.valueOf(it2.minIntrinsicHeight(width));
        if (r6.compareTo(r2) <= 0) goto L10;
        r2 = r6;
    L10:
        if (i$iv == r5) goto L13;
        i$iv = i$iv + 1;
        goto L7
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, List<? extends IntrinsicMeasurable> r10, int height) {
        if (r10.isEmpty() == false) goto L5;
        Integer r2 = null;
    L13:
        Integer r3 = r2;
        if (r3 != null) goto L16;
        return 0;
    L16:
        return r3.intValue();
    L5:
        IntrinsicMeasurable it = r10.get(0);
        r2 = Integer.valueOf(it.maxIntrinsicWidth(height));
        int i$iv = 1;
        int r5 = CollectionsKt.getLastIndex(r10);
        if (1 > r5) goto L13;
    L7:
        IntrinsicMeasurable it2 = r10.get(i$iv);
        Integer r6 = Integer.valueOf(it2.maxIntrinsicWidth(height));
        if (r6.compareTo(r2) <= 0) goto L10;
        r2 = r6;
    L10:
        if (i$iv == r5) goto L13;
        i$iv = i$iv + 1;
        goto L7
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope $this$maxIntrinsicHeight, List<? extends IntrinsicMeasurable> r10, int width) {
        if (r10.isEmpty() == false) goto L5;
        Integer r2 = null;
    L13:
        Integer r3 = r2;
        if (r3 != null) goto L16;
        return 0;
    L16:
        return r3.intValue();
    L5:
        IntrinsicMeasurable it = r10.get(0);
        r2 = Integer.valueOf(it.maxIntrinsicHeight(width));
        int i$iv = 1;
        int r5 = CollectionsKt.getLastIndex(r10);
        if (1 > r5) goto L13;
    L7:
        IntrinsicMeasurable it2 = r10.get(i$iv);
        Integer r6 = Integer.valueOf(it2.maxIntrinsicHeight(width));
        if (r6.compareTo(r2) <= 0) goto L10;
        r2 = r6;
    L10:
        if (i$iv == r5) goto L13;
        i$iv = i$iv + 1;
        goto L7
    }
}
