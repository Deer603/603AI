package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: SegmentedButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J2\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/SegmentedButtonContentMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "animatable", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "getAnimatable", "()Landroidx/compose/animation/core/Animatable;", "setAnimatable", "(Landroidx/compose/animation/core/Animatable;)V", "initialOffset", "Ljava/lang/Integer;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SegmentedButtonContentMeasurePolicy implements MultiContentMeasurePolicy {
    public static final int $stable = 0;
    private Animatable<Integer, AnimationVector1D> animatable;
    private Integer initialOffset;
    private final CoroutineScope scope;

    static {
    }

    public SegmentedButtonContentMeasurePolicy(CoroutineScope scope) {
        this.scope = scope;
    }

    public final CoroutineScope getScope() {
        return this.scope;
    }

    public final Animatable<Integer, AnimationVector1D> getAnimatable() {
        return this.animatable;
    }

    public final void setAnimatable(Animatable<Integer, AnimationVector1D> r1) {
        this.animatable = r1;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo672measure3p2s80s(final MeasureScope $this$measure_u2d3p2s80s, List<? extends List<? extends Measurable>> r30, long constraints) {
        List<? extends Measurable> r10 = r30.get(0);
        List<? extends Measurable> r11 = r30.get(1);
        List<? extends Measurable> r2 = r10;
        List target$iv = new ArrayList(r2.size());
        int index$iv$iv = 0;
        int r14 = r2.size();
    L3:
        if (index$iv$iv >= r14) goto L5;
        Object item$iv$iv = r2.get(index$iv$iv);
        List<? extends Measurable> r18 = r2;
        Measurable it = (Measurable) item$iv$iv;
        target$iv.add(it.mo5714measureBRTryo0(constraints));
        index$iv$iv = index$iv$iv + 1;
        r2 = r18;
        goto L3
    L5:
        List iconPlaceables = target$iv;
        if (iconPlaceables.isEmpty() == false) goto L8;
        Object maxElem$iv = null;
    L16:
        Placeable r12 = (Placeable) maxElem$iv;
        if (r12 == null) goto L19;
        int r3 = r12.getWidth();
    L20:
        int iconWidth = r3;
        List<? extends Measurable> r4 = r11;
        List target$iv2 = new ArrayList(r4.size());
        int index$iv$iv2 = 0;
        int r15 = r4.size();
    L21:
        if (index$iv$iv2 >= r15) goto L23;
        Object item$iv$iv2 = r4.get(index$iv$iv2);
        List iconPlaceables2 = iconPlaceables;
        List<? extends Measurable> r21 = r4;
        Measurable it2 = (Measurable) item$iv$iv2;
        target$iv2.add(it2.mo5714measureBRTryo0(constraints));
        index$iv$iv2 = index$iv$iv2 + 1;
        iconPlaceables = iconPlaceables2;
        r4 = r21;
        goto L21
    L23:
        final List iconPlaceables3 = iconPlaceables;
        final List contentPlaceables = target$iv2;
        List $this$fastMaxBy$iv = contentPlaceables;
        if ($this$fastMaxBy$iv.isEmpty() == false) goto L26;
        Object maxElem$iv2 = null;
    L35:
        Placeable r6 = (Placeable) maxElem$iv2;
        if (r6 == null) goto L38;
        Integer r1 = Integer.valueOf(r6.getWidth());
    L39:
        Integer contentWidth = r1;
        List $this$fastMaxBy$iv2 = contentPlaceables;
        if ($this$fastMaxBy$iv2.isEmpty() == false) goto L42;
        Object maxElem$iv3 = null;
    L51:
        Placeable r7 = (Placeable) maxElem$iv3;
        if (r7 == null) goto L54;
        int height = r7.getHeight();
    L55:
        int r5 = Math.max($this$measure_u2d3p2s80s.mo370roundToPx0680j_4(SegmentedButtonDefaults.INSTANCE.m2581getIconSizeD9Ej5fM()), iconWidth) + $this$measure_u2d3p2s80s.mo370roundToPx0680j_4(SegmentedButtonKt.access$getIconSpacing$p());
        if (contentWidth == null) goto L58;
        int r8 = contentWidth.intValue();
    L59:
        int width = r5 + r8;
        if (iconWidth != 0) goto L62;
        final int offsetX = (-($this$measure_u2d3p2s80s.mo370roundToPx0680j_4(SegmentedButtonDefaults.INSTANCE.m2581getIconSizeD9Ej5fM()) + $this$measure_u2d3p2s80s.mo370roundToPx0680j_4(SegmentedButtonKt.access$getIconSpacing$p()))) / 2;
    L64:
        if (this.initialOffset != null) goto L66;
        this.initialOffset = Integer.valueOf(offsetX);
    L72:
        final int height2 = height;
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, width, height2, null, new SegmentedButtonContentMeasurePolicy$measure$2(iconPlaceables3, $this$measure_u2d3p2s80s, this, offsetX, contentPlaceables, height2), 4, null);
    L66:
        Animatable<Integer, AnimationVector1D> r9 = this.animatable;
        if (r9 != null) goto L70;
        Integer r13 = this.initialOffset;
        Intrinsics.checkNotNull(r13);
        r9 = new Animatable(r13, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), null, null, 12, null);
        this.animatable = r9;
    L70:
        if (r9.getTargetValue().intValue() == offsetX) goto L72;
        BuildersKt.launch$default(this.scope, null, null, new SegmentedButtonContentMeasurePolicy$measure$1(r9, offsetX, null), 3, null);
        goto L72
    L62:
        offsetX = 0;
        goto L64
    L58:
        r8 = 0;
        goto L59
    L54:
        height = 0;
        goto L55
    L42:
        maxElem$iv3 = $this$fastMaxBy$iv2.get(0);
        Placeable it3 = (Placeable) maxElem$iv3;
        int maxValue$iv = it3.getHeight();
        int i$iv = 1;
        int r16 = CollectionsKt.getLastIndex($this$fastMaxBy$iv2);
        if (1 > r16) goto L51;
    L44:
        Object e$iv = $this$fastMaxBy$iv2.get(i$iv);
        Placeable it4 = (Placeable) e$iv;
        int r19 = it4.getHeight();
        List $this$fastMaxBy$iv3 = $this$fastMaxBy$iv2;
        if (maxValue$iv >= r19) goto L47;
        maxElem$iv3 = e$iv;
        maxValue$iv = r19;
    L47:
        if (i$iv == r16) goto L51;
        i$iv = i$iv + 1;
        $this$fastMaxBy$iv2 = $this$fastMaxBy$iv3;
        goto L44
    L38:
        r1 = null;
        goto L39
    L26:
        maxElem$iv2 = $this$fastMaxBy$iv.get(0);
        Placeable it5 = (Placeable) maxElem$iv2;
        int maxValue$iv2 = it5.getWidth();
        int i$iv2 = 1;
        int r17 = CollectionsKt.getLastIndex($this$fastMaxBy$iv);
        if (1 > r17) goto L35;
    L28:
        Object e$iv2 = $this$fastMaxBy$iv.get(i$iv2);
        Placeable it6 = (Placeable) e$iv2;
        int r110 = it6.getWidth();
        List $this$fastMaxBy$iv4 = $this$fastMaxBy$iv;
        if (maxValue$iv2 >= r110) goto L31;
        maxElem$iv2 = e$iv2;
        maxValue$iv2 = r110;
    L31:
        if (i$iv2 == r17) goto L35;
        i$iv2 = i$iv2 + 1;
        $this$fastMaxBy$iv = $this$fastMaxBy$iv4;
        goto L28
    L19:
        r3 = 0;
        goto L20
    L8:
        maxElem$iv = iconPlaceables.get(0);
        Placeable it7 = (Placeable) maxElem$iv;
        int maxValue$iv3 = it7.getWidth();
        int i$iv3 = 1;
        int r111 = CollectionsKt.getLastIndex(iconPlaceables);
        if (1 > r111) goto L16;
    L10:
        Object e$iv3 = iconPlaceables.get(i$iv3);
        Placeable it8 = (Placeable) e$iv3;
        int r112 = it8.getWidth();
        if (maxValue$iv3 >= r112) goto L13;
        maxElem$iv = e$iv3;
        maxValue$iv3 = r112;
    L13:
        if (i$iv3 == r111) goto L16;
        i$iv3 = i$iv3 + 1;
        goto L10
    }
}
