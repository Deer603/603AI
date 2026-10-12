package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
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
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ8\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J<\u0010\u0011\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J\"\u0010\u0014\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\"\u0010\u0015\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016J,\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\"\u0010\u001f\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/material3/TextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "singleLine", "", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "intrinsicWidth", "", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "width", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class TextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    public TextFieldMeasurePolicy(boolean singleLine, float animationProgress, PaddingValues paddingValues) {
        this.singleLine = singleLine;
        this.animationProgress = animationProgress;
        this.paddingValues = paddingValues;
    }

    public static final /* synthetic */ float access$getAnimationProgress$p(TextFieldMeasurePolicy $this) {
        return $this.animationProgress;
    }

    public static final /* synthetic */ PaddingValues access$getPaddingValues$p(TextFieldMeasurePolicy $this) {
        return $this.paddingValues;
    }

    public static final /* synthetic */ boolean access$getSingleLine$p(TextFieldMeasurePolicy $this) {
        return $this.singleLine;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo32measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, List<? extends Measurable> r49, long constraints) {
        final TextFieldMeasurePolicy r12 = this;
        final MeasureScope r14 = $this$measure_u2d3p2s80s;
        final int topPaddingValue = r14.mo370roundToPx0680j_4(r12.paddingValues.mo677calculateTopPaddingD9Ej5fM());
        int bottomPaddingValue = r14.mo370roundToPx0680j_4(r12.paddingValues.mo674calculateBottomPaddingD9Ej5fM());
        int occupiedSpaceHorizontally = 0;
        long looseConstraints = Constraints.m6916copyZbe2FdA$default(constraints, 0, 0, 0, 0, 10, null);
        int index$iv$iv = 0;
        int r9 = r49.size();
    L3:
        if (index$iv$iv >= r9) goto L8;
        Object it$iv = r49.get(index$iv$iv);
        Measurable it = (Measurable) it$iv;
        int occupiedSpaceHorizontally2 = occupiedSpaceHorizontally;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it), "Leading") == true) goto L9;
        index$iv$iv = index$iv$iv + 1;
        occupiedSpaceHorizontally = occupiedSpaceHorizontally2;
    L9:
        Measurable r0 = (Measurable) it$iv;
        if (r0 == null) goto L12;
        Placeable leadingPlaceable = r0.mo5714measureBRTryo0(looseConstraints);
    L13:
        int occupiedSpaceHorizontally3 = occupiedSpaceHorizontally2 + TextFieldImplKt.widthOrZero(leadingPlaceable);
        int occupiedSpaceVertically = Math.max(0, TextFieldImplKt.heightOrZero(leadingPlaceable));
        List<? extends Measurable> r2 = r49;
        int $i$f$fastFirstOrNull = 0;
        int index$iv$iv2 = 0;
        int r10 = r2.size();
    L14:
        if (index$iv$iv2 >= r10) goto L19;
        Object it$iv2 = r2.get(index$iv$iv2);
        Measurable it2 = (Measurable) it$iv2;
        List<? extends Measurable> r20 = r2;
        int $i$f$fastFirstOrNull2 = $i$f$fastFirstOrNull;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it2), "Trailing") == true) goto L20;
        index$iv$iv2 = index$iv$iv2 + 1;
        r2 = r20;
        $i$f$fastFirstOrNull = $i$f$fastFirstOrNull2;
    L20:
        Measurable r3 = (Measurable) it$iv2;
        if (r3 == null) goto L23;
        long looseConstraints2 = looseConstraints;
        final Placeable trailingPlaceable = r3.mo5714measureBRTryo0(ConstraintsKt.m6946offsetNN6EwU$default(looseConstraints2, -occupiedSpaceHorizontally3, 0, 2, null));
    L24:
        int occupiedSpaceHorizontally4 = occupiedSpaceHorizontally3 + TextFieldImplKt.widthOrZero(trailingPlaceable);
        int occupiedSpaceVertically2 = Math.max(occupiedSpaceVertically, TextFieldImplKt.heightOrZero(trailingPlaceable));
        List<? extends Measurable> r4 = r49;
        int $i$f$fastFirstOrNull3 = 0;
        int index$iv$iv3 = 0;
        int r11 = r4.size();
    L25:
        if (index$iv$iv3 >= r11) goto L30;
        Object it$iv3 = r4.get(index$iv$iv3);
        Measurable it3 = (Measurable) it$iv3;
        List<? extends Measurable> r21 = r4;
        int $i$f$fastFirstOrNull4 = $i$f$fastFirstOrNull3;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it3), TextFieldImplKt.PrefixId) == true) goto L31;
        index$iv$iv3 = index$iv$iv3 + 1;
        r4 = r21;
        $i$f$fastFirstOrNull3 = $i$f$fastFirstOrNull4;
    L31:
        Measurable r13 = (Measurable) it$iv3;
        if (r13 == null) goto L34;
        final Placeable prefixPlaceable = r13.mo5714measureBRTryo0(ConstraintsKt.m6946offsetNN6EwU$default(looseConstraints2, -occupiedSpaceHorizontally4, 0, 2, null));
    L35:
        int occupiedSpaceHorizontally5 = occupiedSpaceHorizontally4 + TextFieldImplKt.widthOrZero(prefixPlaceable);
        int occupiedSpaceVertically3 = Math.max(occupiedSpaceVertically2, TextFieldImplKt.heightOrZero(prefixPlaceable));
        List<? extends Measurable> r5 = r49;
        int $i$f$fastFirstOrNull5 = 0;
        int index$iv$iv4 = 0;
        int r15 = r5.size();
    L36:
        if (index$iv$iv4 >= r15) goto L41;
        Object it$iv4 = r5.get(index$iv$iv4);
        Measurable it4 = (Measurable) it$iv4;
        List<? extends Measurable> r22 = r5;
        int $i$f$fastFirstOrNull6 = $i$f$fastFirstOrNull5;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it4), TextFieldImplKt.SuffixId) == true) goto L42;
        index$iv$iv4 = index$iv$iv4 + 1;
        r5 = r22;
        $i$f$fastFirstOrNull5 = $i$f$fastFirstOrNull6;
    L42:
        Measurable r6 = (Measurable) it$iv4;
        if (r6 == null) goto L45;
        Placeable suffixPlaceable = r6.mo5714measureBRTryo0(ConstraintsKt.m6946offsetNN6EwU$default(looseConstraints2, -occupiedSpaceHorizontally5, 0, 2, null));
    L46:
        int occupiedSpaceHorizontally6 = occupiedSpaceHorizontally5 + TextFieldImplKt.widthOrZero(suffixPlaceable);
        int occupiedSpaceVertically4 = Math.max(occupiedSpaceVertically3, TextFieldImplKt.heightOrZero(suffixPlaceable));
        long labelConstraints = ConstraintsKt.m6945offsetNN6EwU(looseConstraints2, -occupiedSpaceHorizontally6, -bottomPaddingValue);
        List<? extends Measurable> r16 = r49;
        final Placeable suffixPlaceable2 = suffixPlaceable;
        int r7 = r16.size();
        int index$iv$iv5 = 0;
    L47:
        if (index$iv$iv5 >= r7) goto L52;
        int r18 = r7;
        List<? extends Measurable> r8 = r16;
        Object it$iv5 = r8.get(index$iv$iv5);
        Measurable it5 = (Measurable) it$iv5;
        int index$iv$iv6 = index$iv$iv5;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it5), "Label") == true) goto L53;
        index$iv$iv5 = index$iv$iv6 + 1;
        r7 = r18;
        r16 = r8;
    L53:
        Measurable r17 = (Measurable) it$iv5;
        if (r17 == null) goto L56;
        Placeable labelPlaceable = r17.mo5714measureBRTryo0(labelConstraints);
    L57:
        List<? extends Measurable> r19 = r49;
        final Placeable labelPlaceable2 = labelPlaceable;
        int r23 = r19.size();
        int index$iv$iv7 = 0;
    L58:
        if (index$iv$iv7 >= r23) goto L63;
        List<? extends Measurable> r24 = r19;
        Object it$iv6 = r24.get(index$iv$iv7);
        Measurable it6 = (Measurable) it$iv6;
        int r25 = r23;
        int index$iv$iv8 = index$iv$iv7;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it6), TextFieldImplKt.SupportingId) == true) goto L64;
        index$iv$iv7 = index$iv$iv8 + 1;
        r19 = r24;
        r23 = r25;
    L64:
        Measurable supportingMeasurable = (Measurable) it$iv6;
        if (supportingMeasurable == null) goto L67;
        int r26 = supportingMeasurable.minIntrinsicHeight(Constraints.m6928getMinWidthimpl(constraints));
    L68:
        int supportingIntrinsicHeight = r26;
        int effectiveTopOffset = TextFieldImplKt.heightOrZero(labelPlaceable2) + topPaddingValue;
        final Placeable leadingPlaceable2 = leadingPlaceable;
        long textFieldConstraints = ConstraintsKt.m6945offsetNN6EwU(Constraints.m6916copyZbe2FdA$default(constraints, 0, 0, 0, 0, 11, null), -occupiedSpaceHorizontally6, ((-effectiveTopOffset) - bottomPaddingValue) - supportingIntrinsicHeight);
        int $i$f$fastFirst = 0;
        List<? extends Measurable> r110 = r49;
        int occupiedSpaceHorizontally7 = r110.size();
        int index$iv$iv9 = 0;
    L69:
        int index$iv$iv10 = $i$f$fastFirst;
        if (index$iv$iv9 >= occupiedSpaceHorizontally7) goto L107;
        int r27 = occupiedSpaceHorizontally7;
        List<? extends Measurable> r1 = r110;
        Object item$iv$iv = r1.get(index$iv$iv9);
        Measurable it7 = (Measurable) item$iv$iv;
        int index$iv$iv11 = index$iv$iv9;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it7), "TextField") == true) goto L73;
        index$iv$iv9 = index$iv$iv11 + 1;
        r12 = this;
        r14 = $this$measure_u2d3p2s80s;
        $i$f$fastFirst = index$iv$iv10;
        occupiedSpaceHorizontally7 = r27;
        r110 = r1;
        goto L69
    L73:
        final Placeable textFieldPlaceable = ((Measurable) item$iv$iv).mo5714measureBRTryo0(textFieldConstraints);
        long placeholderConstraints = Constraints.m6916copyZbe2FdA$default(textFieldConstraints, 0, 0, 0, 0, 14, null);
        List<? extends Measurable> r111 = r49;
        int r28 = r111.size();
        int index$iv$iv12 = 0;
    L74:
        if (index$iv$iv12 >= r28) goto L79;
        int r112 = r28;
        List<? extends Measurable> r29 = r111;
        Object it$iv7 = r29.get(index$iv$iv12);
        Measurable it8 = (Measurable) it$iv7;
        int index$iv$iv13 = index$iv$iv12;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it8), "Hint") == true) goto L80;
        index$iv$iv12 = index$iv$iv13 + 1;
        r28 = r112;
        r111 = r29;
    L80:
        Measurable r30 = (Measurable) it$iv7;
        if (r30 == null) goto L83;
        final Placeable placeholderPlaceable = r30.mo5714measureBRTryo0(placeholderConstraints);
    L84:
        int occupiedSpaceVertically5 = Math.max(occupiedSpaceVertically4, (Math.max(TextFieldImplKt.heightOrZero(textFieldPlaceable), TextFieldImplKt.heightOrZero(placeholderPlaceable)) + effectiveTopOffset) + bottomPaddingValue);
        final int width = TextFieldKt.m2816access$calculateWidthyeHjK3Y(TextFieldImplKt.widthOrZero(leadingPlaceable2), TextFieldImplKt.widthOrZero(trailingPlaceable), TextFieldImplKt.widthOrZero(prefixPlaceable), TextFieldImplKt.widthOrZero(suffixPlaceable2), textFieldPlaceable.getWidth(), TextFieldImplKt.widthOrZero(labelPlaceable2), TextFieldImplKt.widthOrZero(placeholderPlaceable), constraints);
        long supportingConstraints = Constraints.m6916copyZbe2FdA$default(ConstraintsKt.m6946offsetNN6EwU$default(looseConstraints2, 0, -occupiedSpaceVertically5, 1, null), 0, width, 0, 0, 9, null);
        if (supportingMeasurable == null) goto L87;
        Placeable supportingPlaceable = supportingMeasurable.mo5714measureBRTryo0(supportingConstraints);
    L88:
        int supportingHeight = TextFieldImplKt.heightOrZero(supportingPlaceable);
        int totalHeight = TextFieldKt.m2815access$calculateHeightmKXJcVc(textFieldPlaceable.getHeight(), TextFieldImplKt.heightOrZero(labelPlaceable2), TextFieldImplKt.heightOrZero(leadingPlaceable2), TextFieldImplKt.heightOrZero(trailingPlaceable), TextFieldImplKt.heightOrZero(prefixPlaceable), TextFieldImplKt.heightOrZero(suffixPlaceable2), TextFieldImplKt.heightOrZero(placeholderPlaceable), TextFieldImplKt.heightOrZero(supportingPlaceable), r12.animationProgress, constraints, r14.getDensity(), r12.paddingValues);
        int height = totalHeight - supportingHeight;
        List<? extends Measurable> r113 = r49;
        int height2 = totalHeight;
        int totalHeight2 = r113.size();
        int totalHeight3 = 0;
    L89:
        if (totalHeight3 >= totalHeight2) goto L104;
        int r210 = totalHeight2;
        List<? extends Measurable> r31 = r113;
        Object item$iv$iv2 = r31.get(totalHeight3);
        Measurable it9 = (Measurable) item$iv$iv2;
        int index$iv$iv14 = totalHeight3;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it9), TextFieldImplKt.ContainerId) == true) goto L92;
        r12 = this;
        r14 = $this$measure_u2d3p2s80s;
        height = height;
        r113 = r31;
        height2 = height2;
        totalHeight3 = index$iv$iv14 + 1;
        totalHeight2 = r210;
        goto L89
    L92:
        Measurable r32 = (Measurable) item$iv$iv2;
        if (width == Integer.MAX_VALUE) goto L95;
        int r33 = width;
    L97:
        if (height == Integer.MAX_VALUE) goto L99;
        int r34 = height;
    L100:
        final Placeable containerPlaceable = r32.mo5714measureBRTryo0(ConstraintsKt.Constraints(r33, width, r34, height));
        final Placeable leadingPlaceable3 = supportingPlaceable;
        final int totalHeight4 = height2;
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, width, totalHeight4, null, new TextFieldMeasurePolicy$measure$1(labelPlaceable2, width, totalHeight4, textFieldPlaceable, placeholderPlaceable, leadingPlaceable2, trailingPlaceable, prefixPlaceable, suffixPlaceable2, containerPlaceable, leadingPlaceable3, r12, topPaddingValue, r14), 4, null);
    L99:
        r34 = 0;
        goto L100
    L95:
        r33 = 0;
        goto L97
    L104:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    L87:
        supportingPlaceable = null;
        goto L88
    L83:
        placeholderPlaceable = null;
        goto L84
    L79:
        it$iv7 = null;
        goto L80
    L107:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    L67:
        r26 = 0;
        goto L68
    L63:
        it$iv6 = null;
        goto L64
    L56:
        labelPlaceable = null;
        goto L57
    L52:
        it$iv5 = null;
        goto L53
    L45:
        suffixPlaceable = null;
        goto L46
    L41:
        it$iv4 = null;
        goto L42
    L34:
        prefixPlaceable = null;
        goto L35
    L30:
        it$iv3 = null;
        goto L31
    L23:
        looseConstraints2 = looseConstraints;
        trailingPlaceable = null;
        goto L24
    L19:
        it$iv2 = null;
        goto L20
    L12:
        leadingPlaceable = null;
        goto L13
    L8:
        occupiedSpaceHorizontally2 = occupiedSpaceHorizontally;
        it$iv = null;
        goto L9
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope $this$maxIntrinsicHeight, List<? extends IntrinsicMeasurable> r3, int width) {
        return intrinsicHeight($this$maxIntrinsicHeight, r3, width, AnonymousClass1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope $this$minIntrinsicHeight, List<? extends IntrinsicMeasurable> r3, int width) {
        return intrinsicHeight($this$minIntrinsicHeight, r3, width, C05721.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, List<? extends IntrinsicMeasurable> r3, int height) {
        return intrinsicWidth(r3, height, C05711.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope $this$minIntrinsicWidth, List<? extends IntrinsicMeasurable> r3, int height) {
        return intrinsicWidth(r3, height, C05731.INSTANCE);
    }

    private final int intrinsicWidth(List<? extends IntrinsicMeasurable> r21, int height, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> r23) {
        int index$iv$iv = 0;
        int r6 = r21.size();
    L3:
        if (index$iv$iv >= r6) goto L76;
        Object item$iv$iv = r21.get(index$iv$iv);
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) item$iv$iv), "TextField") == true) goto L6;
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L6:
        int textFieldWidth = r23.invoke(item$iv$iv, Integer.valueOf(height)).intValue();
        int index$iv$iv2 = 0;
        int r7 = r21.size();
    L7:
        if (index$iv$iv2 >= r7) goto L12;
        Object it$iv = r21.get(index$iv$iv2);
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv), "Label") == true) goto L13;
        index$iv$iv2 = index$iv$iv2 + 1;
    L13:
        IntrinsicMeasurable it = (IntrinsicMeasurable) it$iv;
        if (it == null) goto L16;
        int labelWidth = r23.invoke(it, Integer.valueOf(height)).intValue();
    L17:
        int index$iv$iv3 = 0;
        int r10 = r21.size();
    L18:
        if (index$iv$iv3 >= r10) goto L23;
        Object it$iv2 = r21.get(index$iv$iv3);
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv2), "Trailing") == true) goto L24;
        index$iv$iv3 = index$iv$iv3 + 1;
    L24:
        IntrinsicMeasurable it2 = (IntrinsicMeasurable) it$iv2;
        if (it2 == null) goto L27;
        int trailingWidth = r23.invoke(it2, Integer.valueOf(height)).intValue();
    L28:
        List<? extends IntrinsicMeasurable> r1 = r21;
        int index$iv$iv4 = 0;
        int r9 = r1.size();
    L29:
        if (index$iv$iv4 >= r9) goto L34;
        Object it$iv3 = r1.get(index$iv$iv4);
        List<? extends IntrinsicMeasurable> r16 = r1;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv3), TextFieldImplKt.PrefixId) == true) goto L35;
        index$iv$iv4 = index$iv$iv4 + 1;
        r1 = r16;
    L35:
        IntrinsicMeasurable it3 = (IntrinsicMeasurable) it$iv3;
        if (it3 == null) goto L38;
        int prefixWidth = r23.invoke(it3, Integer.valueOf(height)).intValue();
    L39:
        List<? extends IntrinsicMeasurable> r2 = r21;
        int $i$f$fastFirstOrNull = 0;
        int index$iv$iv5 = 0;
        int r11 = r2.size();
    L40:
        if (index$iv$iv5 >= r11) goto L45;
        Object it$iv4 = r2.get(index$iv$iv5);
        List<? extends IntrinsicMeasurable> r17 = r2;
        int $i$f$fastFirstOrNull2 = $i$f$fastFirstOrNull;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv4), TextFieldImplKt.SuffixId) == true) goto L46;
        index$iv$iv5 = index$iv$iv5 + 1;
        r2 = r17;
        $i$f$fastFirstOrNull = $i$f$fastFirstOrNull2;
    L46:
        IntrinsicMeasurable it4 = (IntrinsicMeasurable) it$iv4;
        if (it4 == null) goto L49;
        int suffixWidth = r23.invoke(it4, Integer.valueOf(height)).intValue();
    L50:
        List<? extends IntrinsicMeasurable> r3 = r21;
        int $i$f$fastFirstOrNull3 = 0;
        int index$iv$iv6 = 0;
        int r12 = r3.size();
    L51:
        if (index$iv$iv6 >= r12) goto L56;
        Object it$iv5 = r3.get(index$iv$iv6);
        List<? extends IntrinsicMeasurable> r18 = r3;
        int $i$f$fastFirstOrNull4 = $i$f$fastFirstOrNull3;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv5), "Leading") == true) goto L57;
        index$iv$iv6 = index$iv$iv6 + 1;
        r3 = r18;
        $i$f$fastFirstOrNull3 = $i$f$fastFirstOrNull4;
    L57:
        IntrinsicMeasurable it5 = (IntrinsicMeasurable) it$iv5;
        if (it5 == null) goto L60;
        int leadingWidth = r23.invoke(it5, Integer.valueOf(height)).intValue();
    L61:
        List<? extends IntrinsicMeasurable> r4 = r21;
        int index$iv$iv7 = 0;
        int r13 = r4.size();
    L62:
        if (index$iv$iv7 >= r13) goto L67;
        Object item$iv$iv2 = r4.get(index$iv$iv7);
        List<? extends IntrinsicMeasurable> r19 = r4;
        int leadingWidth2 = leadingWidth;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) item$iv$iv2), "Hint") == true) goto L65;
        index$iv$iv7 = index$iv$iv7 + 1;
        r4 = r19;
        leadingWidth = leadingWidth2;
        goto L62
    L65:
        Object r8 = item$iv$iv2;
    L68:
        IntrinsicMeasurable it6 = (IntrinsicMeasurable) r8;
        if (it6 == null) goto L71;
        int placeholderWidth = r23.invoke(it6, Integer.valueOf(height)).intValue();
    L72:
        int leadingWidth3 = leadingWidth2;
        return TextFieldKt.m2816access$calculateWidthyeHjK3Y(leadingWidth3, trailingWidth, prefixWidth, suffixWidth, textFieldWidth, labelWidth, placeholderWidth, TextFieldImplKt.getZeroConstraints());
    L71:
        placeholderWidth = 0;
        goto L72
    L67:
        leadingWidth2 = leadingWidth;
        r8 = null;
        goto L68
    L60:
        leadingWidth = 0;
        goto L61
    L56:
        it$iv5 = null;
        goto L57
    L49:
        suffixWidth = 0;
        goto L50
    L45:
        it$iv4 = null;
        goto L46
    L38:
        prefixWidth = 0;
        goto L39
    L34:
        it$iv3 = null;
        goto L35
    L27:
        trailingWidth = 0;
        goto L28
    L23:
        it$iv2 = null;
        goto L24
    L16:
        labelWidth = 0;
        goto L17
    L12:
        it$iv = null;
        goto L13
    L76:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int intrinsicHeight(IntrinsicMeasureScope $this$intrinsicHeight, List<? extends IntrinsicMeasurable> r32, int width, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> r34) {
        int remainingWidth = width;
        int index$iv$iv = 0;
        int r8 = r32.size();
    L3:
        if (index$iv$iv >= r8) goto L8;
        Object it$iv = r32.get(index$iv$iv);
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv), "Leading") == true) goto L9;
        index$iv$iv = index$iv$iv + 1;
    L9:
        IntrinsicMeasurable it = (IntrinsicMeasurable) it$iv;
        if (it == null) goto L12;
        remainingWidth = TextFieldKt.access$substractConstraintSafely(remainingWidth, it.maxIntrinsicWidth(Integer.MAX_VALUE));
        int r5 = r34.invoke(it, Integer.valueOf(width)).intValue();
    L13:
        int leadingHeight = r5;
        int index$iv$iv2 = 0;
        int r10 = r32.size();
    L14:
        if (index$iv$iv2 >= r10) goto L19;
        Object it$iv2 = r32.get(index$iv$iv2);
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv2), "Trailing") == true) goto L20;
        index$iv$iv2 = index$iv$iv2 + 1;
    L20:
        IntrinsicMeasurable it2 = (IntrinsicMeasurable) it$iv2;
        if (it2 == null) goto L23;
        remainingWidth = TextFieldKt.access$substractConstraintSafely(remainingWidth, it2.maxIntrinsicWidth(Integer.MAX_VALUE));
        int trailingHeight = r34.invoke(it2, Integer.valueOf(width)).intValue();
    L24:
        int index$iv$iv3 = 0;
        int r9 = r32.size();
    L25:
        if (index$iv$iv3 >= r9) goto L30;
        Object it$iv3 = r32.get(index$iv$iv3);
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv3), "Label") == true) goto L31;
        index$iv$iv3 = index$iv$iv3 + 1;
    L31:
        IntrinsicMeasurable it3 = (IntrinsicMeasurable) it$iv3;
        if (it3 == null) goto L34;
        int labelHeight = r34.invoke(it3, Integer.valueOf(remainingWidth)).intValue();
    L35:
        int index$iv$iv4 = 0;
        int r11 = r32.size();
    L36:
        if (index$iv$iv4 >= r11) goto L41;
        Object it$iv4 = r32.get(index$iv$iv4);
        int labelHeight2 = labelHeight;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv4), TextFieldImplKt.PrefixId) == true) goto L42;
        index$iv$iv4 = index$iv$iv4 + 1;
        labelHeight = labelHeight2;
    L42:
        IntrinsicMeasurable it4 = (IntrinsicMeasurable) it$iv4;
        if (it4 == null) goto L45;
        int prefixHeight = r34.invoke(it4, Integer.valueOf(remainingWidth)).intValue();
        remainingWidth = TextFieldKt.access$substractConstraintSafely(remainingWidth, it4.maxIntrinsicWidth(Integer.MAX_VALUE));
    L46:
        List<? extends IntrinsicMeasurable> r3 = r32;
        int index$iv$iv5 = 0;
        int r12 = r3.size();
    L47:
        if (index$iv$iv5 >= r12) goto L52;
        Object it$iv5 = r3.get(index$iv$iv5);
        List<? extends IntrinsicMeasurable> r21 = r3;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv5), TextFieldImplKt.SuffixId) == true) goto L53;
        index$iv$iv5 = index$iv$iv5 + 1;
        r3 = r21;
    L53:
        IntrinsicMeasurable it5 = (IntrinsicMeasurable) it$iv5;
        if (it5 == null) goto L56;
        int r6 = r34.invoke(it5, Integer.valueOf(remainingWidth)).intValue();
        remainingWidth = TextFieldKt.access$substractConstraintSafely(remainingWidth, it5.maxIntrinsicWidth(Integer.MAX_VALUE));
        int suffixHeight = r6;
    L57:
        int index$iv$iv6 = 0;
        int r13 = r32.size();
    L58:
        if (index$iv$iv6 >= r13) goto L87;
        Object item$iv$iv = r32.get(index$iv$iv6);
        int remainingWidth2 = remainingWidth;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) item$iv$iv), "TextField") == true) goto L61;
        index$iv$iv6 = index$iv$iv6 + 1;
        remainingWidth = remainingWidth2;
        labelHeight2 = labelHeight2;
        goto L58
    L61:
        int textFieldHeight = r34.invoke(item$iv$iv, Integer.valueOf(remainingWidth2)).intValue();
        int index$iv$iv7 = 0;
        int r14 = r32.size();
    L62:
        if (index$iv$iv7 >= r14) goto L67;
        Object it$iv6 = r32.get(index$iv$iv7);
        int textFieldHeight2 = textFieldHeight;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv6), "Hint") == true) goto L68;
        index$iv$iv7 = index$iv$iv7 + 1;
        textFieldHeight = textFieldHeight2;
    L68:
        IntrinsicMeasurable it6 = (IntrinsicMeasurable) it$iv6;
        if (it6 == null) goto L71;
        int placeholderHeight = r34.invoke(it6, Integer.valueOf(remainingWidth2)).intValue();
    L72:
        int index$iv$iv8 = 0;
        int r15 = r32.size();
    L73:
        if (index$iv$iv8 >= r15) goto L78;
        Object item$iv$iv2 = r32.get(index$iv$iv8);
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) item$iv$iv2), TextFieldImplKt.SupportingId) == true) goto L76;
        index$iv$iv8 = index$iv$iv8 + 1;
        goto L73
    L76:
        Object item$iv$iv3 = item$iv$iv2;
    L79:
        IntrinsicMeasurable it7 = (IntrinsicMeasurable) item$iv$iv3;
        if (it7 == null) goto L82;
        int supportingHeight = r34.invoke(it7, Integer.valueOf(width)).intValue();
    L83:
        int textFieldHeight3 = textFieldHeight2;
        int textFieldHeight4 = labelHeight2;
        int labelHeight3 = prefixHeight;
        return TextFieldKt.m2815access$calculateHeightmKXJcVc(textFieldHeight3, textFieldHeight4, leadingHeight, trailingHeight, labelHeight3, suffixHeight, placeholderHeight, supportingHeight, this.animationProgress, TextFieldImplKt.getZeroConstraints(), $this$intrinsicHeight.getDensity(), this.paddingValues);
    L82:
        supportingHeight = 0;
        goto L83
    L78:
        item$iv$iv3 = null;
        goto L79
    L71:
        placeholderHeight = 0;
        goto L72
    L67:
        textFieldHeight2 = textFieldHeight;
        it$iv6 = null;
        goto L68
    L87:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    L56:
        suffixHeight = 0;
        goto L57
    L52:
        it$iv5 = null;
        goto L53
    L45:
        prefixHeight = 0;
        goto L46
    L41:
        labelHeight2 = labelHeight;
        it$iv4 = null;
        goto L42
    L34:
        labelHeight = 0;
        goto L35
    L30:
        it$iv3 = null;
        goto L31
    L23:
        trailingHeight = 0;
        goto L24
    L19:
        it$iv2 = null;
        goto L20
    L12:
        r5 = 0;
        goto L13
    L8:
        it$iv = null;
        goto L9
    }
}
