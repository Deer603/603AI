package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
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
import androidx.compose.ui.util.MathHelpersKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OutlinedTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ<\u0010\r\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000e2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002J<\u0010\u0016\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u000e2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002J\"\u0010\u0018\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\"\u0010\u0019\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J,\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J\"\u0010\"\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\"\u0010#\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u000eH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "onLabelMeasured", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Size;", "", "singleLine", "", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Lkotlin/jvm/functions/Function1;ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "intrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicWidth", "height", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;
    private final Function1<Size, Unit> onLabelMeasured;
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    /* JADX WARN: Multi-variable type inference failed */
    public OutlinedTextFieldMeasurePolicy(Function1<? super Size, Unit> r1, boolean singleLine, float animationProgress, PaddingValues paddingValues) {
        this.onLabelMeasured = r1;
        this.singleLine = singleLine;
        this.animationProgress = animationProgress;
        this.paddingValues = paddingValues;
    }

    public static final /* synthetic */ float access$getAnimationProgress$p(OutlinedTextFieldMeasurePolicy $this) {
        return $this.animationProgress;
    }

    public static final /* synthetic */ PaddingValues access$getPaddingValues$p(OutlinedTextFieldMeasurePolicy $this) {
        return $this.paddingValues;
    }

    public static final /* synthetic */ boolean access$getSingleLine$p(OutlinedTextFieldMeasurePolicy $this) {
        return $this.singleLine;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo32measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, List<? extends Measurable> r51, long constraints) {
        final OutlinedTextFieldMeasurePolicy r12 = this;
        final MeasureScope r13 = $this$measure_u2d3p2s80s;
        int occupiedSpaceHorizontally = 0;
        int bottomPadding = r13.mo370roundToPx0680j_4(r12.paddingValues.mo674calculateBottomPaddingD9Ej5fM());
        long relaxedConstraints = Constraints.m6916copyZbe2FdA$default(constraints, 0, 0, 0, 0, 10, null);
        int index$iv$iv = 0;
        int r9 = r51.size();
    L3:
        if (index$iv$iv >= r9) goto L8;
        Object it$iv = r51.get(index$iv$iv);
        Measurable it = (Measurable) it$iv;
        int occupiedSpaceHorizontally2 = occupiedSpaceHorizontally;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it), "Leading") == true) goto L9;
        index$iv$iv = index$iv$iv + 1;
        occupiedSpaceHorizontally = occupiedSpaceHorizontally2;
    L9:
        Measurable r15 = (Measurable) it$iv;
        if (r15 == null) goto L12;
        Placeable leadingPlaceable = r15.mo5714measureBRTryo0(relaxedConstraints);
    L13:
        int occupiedSpaceHorizontally3 = occupiedSpaceHorizontally2 + TextFieldImplKt.widthOrZero(leadingPlaceable);
        int occupiedSpaceVertically = Math.max(0, TextFieldImplKt.heightOrZero(leadingPlaceable));
        List<? extends Measurable> r2 = r51;
        int index$iv$iv2 = 0;
        int r10 = r2.size();
    L14:
        if (index$iv$iv2 >= r10) goto L19;
        Object it$iv2 = r2.get(index$iv$iv2);
        Measurable it2 = (Measurable) it$iv2;
        List<? extends Measurable> r19 = r2;
        Placeable leadingPlaceable2 = leadingPlaceable;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it2), "Trailing") == true) goto L20;
        index$iv$iv2 = index$iv$iv2 + 1;
        r2 = r19;
        leadingPlaceable = leadingPlaceable2;
    L20:
        Measurable r3 = (Measurable) it$iv2;
        if (r3 == null) goto L23;
        long relaxedConstraints2 = relaxedConstraints;
        Placeable trailingPlaceable = r3.mo5714measureBRTryo0(ConstraintsKt.m6946offsetNN6EwU$default(relaxedConstraints2, -occupiedSpaceHorizontally3, 0, 2, null));
    L24:
        int occupiedSpaceHorizontally4 = occupiedSpaceHorizontally3 + TextFieldImplKt.widthOrZero(trailingPlaceable);
        int occupiedSpaceVertically2 = Math.max(occupiedSpaceVertically, TextFieldImplKt.heightOrZero(trailingPlaceable));
        List<? extends Measurable> r4 = r51;
        int $i$f$fastFirstOrNull = 0;
        int index$iv$iv3 = 0;
        int r8 = r4.size();
    L25:
        if (index$iv$iv3 >= r8) goto L30;
        Object it$iv3 = r4.get(index$iv$iv3);
        Measurable it3 = (Measurable) it$iv3;
        List<? extends Measurable> r110 = r4;
        int $i$f$fastFirstOrNull2 = $i$f$fastFirstOrNull;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it3), TextFieldImplKt.PrefixId) == true) goto L31;
        index$iv$iv3 = index$iv$iv3 + 1;
        r4 = r110;
        $i$f$fastFirstOrNull = $i$f$fastFirstOrNull2;
    L31:
        Measurable r11 = (Measurable) it$iv3;
        if (r11 == null) goto L34;
        final Placeable prefixPlaceable = r11.mo5714measureBRTryo0(ConstraintsKt.m6946offsetNN6EwU$default(relaxedConstraints2, -occupiedSpaceHorizontally4, 0, 2, null));
    L35:
        int occupiedSpaceHorizontally5 = occupiedSpaceHorizontally4 + TextFieldImplKt.widthOrZero(prefixPlaceable);
        int occupiedSpaceVertically3 = Math.max(occupiedSpaceVertically2, TextFieldImplKt.heightOrZero(prefixPlaceable));
        List<? extends Measurable> r5 = r51;
        int $i$f$fastFirstOrNull3 = 0;
        int index$iv$iv4 = 0;
        int r14 = r5.size();
    L36:
        if (index$iv$iv4 >= r14) goto L41;
        Object it$iv4 = r5.get(index$iv$iv4);
        Measurable it4 = (Measurable) it$iv4;
        List<? extends Measurable> r20 = r5;
        int $i$f$fastFirstOrNull4 = $i$f$fastFirstOrNull3;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it4), TextFieldImplKt.SuffixId) == true) goto L42;
        index$iv$iv4 = index$iv$iv4 + 1;
        r5 = r20;
        $i$f$fastFirstOrNull3 = $i$f$fastFirstOrNull4;
    L42:
        Measurable r16 = (Measurable) it$iv4;
        if (r16 == null) goto L45;
        Placeable suffixPlaceable = r16.mo5714measureBRTryo0(ConstraintsKt.m6946offsetNN6EwU$default(relaxedConstraints2, -occupiedSpaceHorizontally5, 0, 2, null));
    L46:
        int occupiedSpaceHorizontally6 = occupiedSpaceHorizontally5 + TextFieldImplKt.widthOrZero(suffixPlaceable);
        int occupiedSpaceVertically4 = Math.max(occupiedSpaceVertically3, TextFieldImplKt.heightOrZero(suffixPlaceable));
        int labelHorizontalPaddingOffset = r13.mo370roundToPx0680j_4(r12.paddingValues.mo675calculateLeftPaddingu2uoSUM(r13.getLayoutDirection())) + r13.mo370roundToPx0680j_4(r12.paddingValues.mo676calculateRightPaddingu2uoSUM(r13.getLayoutDirection()));
        long labelConstraints = ConstraintsKt.m6945offsetNN6EwU(relaxedConstraints2, MathHelpersKt.lerp((-occupiedSpaceHorizontally6) - labelHorizontalPaddingOffset, -labelHorizontalPaddingOffset, r12.animationProgress), -bottomPadding);
        Placeable suffixPlaceable2 = suffixPlaceable;
        int r6 = r51.size();
        int labelHorizontalPaddingOffset2 = 0;
    L47:
        if (labelHorizontalPaddingOffset2 >= r6) goto L52;
        Object it$iv5 = r51.get(labelHorizontalPaddingOffset2);
        Measurable it5 = (Measurable) it$iv5;
        int r22 = r6;
        int index$iv$iv5 = labelHorizontalPaddingOffset2;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it5), "Label") == true) goto L53;
        labelHorizontalPaddingOffset2 = index$iv$iv5 + 1;
        r6 = r22;
    L53:
        Measurable r7 = (Measurable) it$iv5;
        if (r7 == null) goto L56;
        Placeable labelPlaceable = r7.mo5714measureBRTryo0(labelConstraints);
    L58:
        if (labelPlaceable == null) goto L60;
        Placeable it6 = labelPlaceable;
        long r17 = SizeKt.Size(it6.getWidth(), it6.getHeight());
    L61:
        long labelSize = r17;
        r12.onLabelMeasured.invoke(Size.m4182boximpl(labelSize));
        final Placeable labelPlaceable2 = labelPlaceable;
        int r18 = r51.size();
        int index$iv$iv6 = 0;
    L62:
        if (index$iv$iv6 >= r18) goto L67;
        Object it$iv6 = r51.get(index$iv$iv6);
        Measurable it7 = (Measurable) it$iv6;
        int r23 = r18;
        int index$iv$iv7 = index$iv$iv6;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it7), TextFieldImplKt.SupportingId) == true) goto L68;
        index$iv$iv6 = index$iv$iv7 + 1;
        r18 = r23;
    L68:
        Measurable supportingMeasurable = (Measurable) it$iv6;
        if (supportingMeasurable == null) goto L71;
        int r111 = supportingMeasurable.minIntrinsicHeight(Constraints.m6928getMinWidthimpl(constraints));
    L72:
        int supportingIntrinsicHeight = r111;
        int topPadding = Math.max(TextFieldImplKt.heightOrZero(labelPlaceable2) / 2, r13.mo370roundToPx0680j_4(r12.paddingValues.mo677calculateTopPaddingD9Ej5fM()));
        final Placeable trailingPlaceable2 = trailingPlaceable;
        long textConstraints = Constraints.m6916copyZbe2FdA$default(ConstraintsKt.m6945offsetNN6EwU(constraints, -occupiedSpaceHorizontally6, ((-bottomPadding) - topPadding) - supportingIntrinsicHeight), 0, 0, 0, 0, 11, null);
        List<? extends Measurable> r112 = r51;
        int occupiedSpaceHorizontally7 = r112.size();
        int index$iv$iv8 = 0;
    L74:
        if (index$iv$iv8 >= occupiedSpaceHorizontally7) goto L111;
        int r113 = occupiedSpaceHorizontally7;
        List<? extends Measurable> r0 = r112;
        Object item$iv$iv = r0.get(index$iv$iv8);
        Measurable it8 = (Measurable) item$iv$iv;
        int index$iv$iv9 = index$iv$iv8;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it8), "TextField") == true) goto L77;
        index$iv$iv8 = index$iv$iv9 + 1;
        r12 = this;
        r13 = $this$measure_u2d3p2s80s;
        occupiedSpaceHorizontally7 = r113;
        r112 = r0;
        leadingPlaceable2 = leadingPlaceable2;
        suffixPlaceable2 = suffixPlaceable2;
        labelConstraints = labelConstraints;
        relaxedConstraints2 = relaxedConstraints2;
        goto L74
    L77:
        Placeable textFieldPlaceable = ((Measurable) item$iv$iv).mo5714measureBRTryo0(textConstraints);
        long placeholderConstraints = Constraints.m6916copyZbe2FdA$default(textConstraints, 0, 0, 0, 0, 14, null);
        List<? extends Measurable> r114 = r51;
        Placeable textFieldPlaceable2 = textFieldPlaceable;
        int r1 = r114.size();
        int index$iv$iv10 = 0;
    L78:
        if (index$iv$iv10 >= r1) goto L83;
        int r115 = r1;
        List<? extends Measurable> r21 = r114;
        Object it$iv7 = r21.get(index$iv$iv10);
        Measurable it9 = (Measurable) it$iv7;
        int index$iv$iv11 = index$iv$iv10;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it9), "Hint") == true) goto L84;
        index$iv$iv10 = index$iv$iv11 + 1;
        r1 = r115;
        r114 = r21;
    L84:
        Measurable r24 = (Measurable) it$iv7;
        if (r24 == null) goto L87;
        Placeable placeholderPlaceable = r24.mo5714measureBRTryo0(placeholderConstraints);
    L88:
        int occupiedSpaceVertically5 = Math.max(occupiedSpaceVertically4, (Math.max(TextFieldImplKt.heightOrZero(textFieldPlaceable2), TextFieldImplKt.heightOrZero(placeholderPlaceable)) + topPadding) + bottomPadding);
        Placeable placeholderPlaceable2 = placeholderPlaceable;
        final int width = OutlinedTextFieldKt.m2477access$calculateWidthDHJA7U0(TextFieldImplKt.widthOrZero(leadingPlaceable2), TextFieldImplKt.widthOrZero(trailingPlaceable2), TextFieldImplKt.widthOrZero(prefixPlaceable), TextFieldImplKt.widthOrZero(suffixPlaceable2), textFieldPlaceable2.getWidth(), TextFieldImplKt.widthOrZero(labelPlaceable2), TextFieldImplKt.widthOrZero(placeholderPlaceable), r12.animationProgress, constraints, r13.getDensity(), r12.paddingValues);
        long supportingConstraints = Constraints.m6916copyZbe2FdA$default(ConstraintsKt.m6946offsetNN6EwU$default(relaxedConstraints2, 0, -occupiedSpaceVertically5, 1, null), 0, width, 0, 0, 9, null);
        if (supportingMeasurable == null) goto L91;
        Placeable r27 = supportingMeasurable.mo5714measureBRTryo0(supportingConstraints);
    L92:
        final Placeable supportingPlaceable = r27;
        int supportingHeight = TextFieldImplKt.heightOrZero(supportingPlaceable);
        final int totalHeight = OutlinedTextFieldKt.m2476access$calculateHeightmKXJcVc(TextFieldImplKt.heightOrZero(leadingPlaceable2), TextFieldImplKt.heightOrZero(trailingPlaceable2), TextFieldImplKt.heightOrZero(prefixPlaceable), TextFieldImplKt.heightOrZero(suffixPlaceable2), textFieldPlaceable2.getHeight(), TextFieldImplKt.heightOrZero(labelPlaceable2), TextFieldImplKt.heightOrZero(placeholderPlaceable2), TextFieldImplKt.heightOrZero(supportingPlaceable), r12.animationProgress, constraints, r13.getDensity(), r12.paddingValues);
        int height = totalHeight - supportingHeight;
        List<? extends Measurable> r116 = r51;
        int totalHeight2 = r116.size();
        int index$iv$iv12 = 0;
    L93:
        if (index$iv$iv12 >= totalHeight2) goto L108;
        int r25 = totalHeight2;
        List<? extends Measurable> r26 = r116;
        Object item$iv$iv2 = r26.get(index$iv$iv12);
        Measurable it10 = (Measurable) item$iv$iv2;
        int index$iv$iv13 = index$iv$iv12;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it10), TextFieldImplKt.ContainerId) == true) goto L96;
        long placeholderConstraints2 = placeholderConstraints;
        index$iv$iv12 = index$iv$iv13 + 1;
        r13 = $this$measure_u2d3p2s80s;
        totalHeight2 = r25;
        r116 = r26;
        r12 = this;
        leadingPlaceable2 = leadingPlaceable2;
        suffixPlaceable2 = suffixPlaceable2;
        labelConstraints = labelConstraints;
        supportingConstraints = supportingConstraints;
        textFieldPlaceable2 = textFieldPlaceable2;
        placeholderPlaceable2 = placeholderPlaceable2;
        placeholderConstraints = placeholderConstraints2;
        goto L93
    L96:
        Measurable r28 = (Measurable) item$iv$iv2;
        if (width == Integer.MAX_VALUE) goto L99;
        int r29 = width;
    L101:
        if (height == Integer.MAX_VALUE) goto L103;
        int r30 = height;
    L104:
        final Placeable containerPlaceable = r28.mo5714measureBRTryo0(ConstraintsKt.Constraints(r29, width, r30, height));
        final Placeable leadingPlaceable3 = leadingPlaceable2;
        final Placeable suffixPlaceable3 = suffixPlaceable2;
        final Placeable textFieldPlaceable3 = textFieldPlaceable2;
        final Placeable placeholderPlaceable3 = placeholderPlaceable2;
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, width, totalHeight, null, new OutlinedTextFieldMeasurePolicy$measure$1(totalHeight, width, leadingPlaceable3, trailingPlaceable2, prefixPlaceable, suffixPlaceable3, textFieldPlaceable3, labelPlaceable2, placeholderPlaceable3, containerPlaceable, supportingPlaceable, r12, r13), 4, null);
    L103:
        r30 = 0;
        goto L104
    L99:
        r29 = 0;
        goto L101
    L108:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    L91:
        r27 = null;
        goto L92
    L87:
        placeholderPlaceable = null;
        goto L88
    L83:
        it$iv7 = null;
        goto L84
    L111:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    L71:
        r111 = 0;
        goto L72
    L67:
        it$iv6 = null;
        goto L68
    L60:
        r17 = Size.Companion.m4203getZeroNHjbRc();
        goto L61
    L56:
        labelPlaceable = null;
        goto L58
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
        relaxedConstraints2 = relaxedConstraints;
        trailingPlaceable = null;
        goto L24
    L19:
        leadingPlaceable2 = leadingPlaceable;
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
        return intrinsicHeight($this$minIntrinsicHeight, r3, width, C05491.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, List<? extends IntrinsicMeasurable> r3, int height) {
        return intrinsicWidth($this$maxIntrinsicWidth, r3, height, C05481.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope $this$minIntrinsicWidth, List<? extends IntrinsicMeasurable> r3, int height) {
        return intrinsicWidth($this$minIntrinsicWidth, r3, height, C05501.INSTANCE);
    }

    private final int intrinsicWidth(IntrinsicMeasureScope $this$intrinsicWidth, List<? extends IntrinsicMeasurable> r23, int height, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> r25) {
        int index$iv$iv = 0;
        int r7 = r23.size();
    L3:
        if (index$iv$iv >= r7) goto L76;
        Object item$iv$iv = r23.get(index$iv$iv);
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) item$iv$iv), "TextField") == true) goto L6;
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L6:
        int textFieldWidth = r25.invoke(item$iv$iv, Integer.valueOf(height)).intValue();
        int index$iv$iv2 = 0;
        int r8 = r23.size();
    L7:
        if (index$iv$iv2 >= r8) goto L12;
        Object it$iv = r23.get(index$iv$iv2);
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv), "Label") == true) goto L13;
        index$iv$iv2 = index$iv$iv2 + 1;
    L13:
        IntrinsicMeasurable it = (IntrinsicMeasurable) it$iv;
        if (it == null) goto L16;
        int labelWidth = r25.invoke(it, Integer.valueOf(height)).intValue();
    L17:
        List<? extends IntrinsicMeasurable> r3 = r23;
        int index$iv$iv3 = 0;
        int r10 = r3.size();
    L18:
        if (index$iv$iv3 >= r10) goto L23;
        Object it$iv2 = r3.get(index$iv$iv3);
        List<? extends IntrinsicMeasurable> r16 = r3;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv2), "Trailing") == true) goto L24;
        index$iv$iv3 = index$iv$iv3 + 1;
        r3 = r16;
    L24:
        IntrinsicMeasurable it2 = (IntrinsicMeasurable) it$iv2;
        if (it2 == null) goto L27;
        int trailingWidth = r25.invoke(it2, Integer.valueOf(height)).intValue();
    L28:
        List<? extends IntrinsicMeasurable> r2 = r23;
        int $i$f$fastFirstOrNull = 0;
        int index$iv$iv4 = 0;
        int r11 = r2.size();
    L29:
        if (index$iv$iv4 >= r11) goto L34;
        Object it$iv3 = r2.get(index$iv$iv4);
        List<? extends IntrinsicMeasurable> r17 = r2;
        int $i$f$fastFirstOrNull2 = $i$f$fastFirstOrNull;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv3), "Leading") == true) goto L35;
        index$iv$iv4 = index$iv$iv4 + 1;
        r2 = r17;
        $i$f$fastFirstOrNull = $i$f$fastFirstOrNull2;
    L35:
        IntrinsicMeasurable it3 = (IntrinsicMeasurable) it$iv3;
        if (it3 == null) goto L38;
        int leadingWidth = r25.invoke(it3, Integer.valueOf(height)).intValue();
    L39:
        List<? extends IntrinsicMeasurable> r4 = r23;
        int index$iv$iv5 = 0;
        int r12 = r4.size();
    L40:
        if (index$iv$iv5 >= r12) goto L45;
        Object it$iv4 = r4.get(index$iv$iv5);
        List<? extends IntrinsicMeasurable> r18 = r4;
        int leadingWidth2 = leadingWidth;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv4), TextFieldImplKt.PrefixId) == true) goto L46;
        index$iv$iv5 = index$iv$iv5 + 1;
        r4 = r18;
        leadingWidth = leadingWidth2;
    L46:
        IntrinsicMeasurable it4 = (IntrinsicMeasurable) it$iv4;
        if (it4 == null) goto L49;
        int prefixWidth = r25.invoke(it4, Integer.valueOf(height)).intValue();
    L50:
        List<? extends IntrinsicMeasurable> r5 = r23;
        int $i$f$fastFirstOrNull3 = 0;
        int index$iv$iv6 = 0;
        int r13 = r5.size();
    L51:
        if (index$iv$iv6 >= r13) goto L56;
        Object it$iv5 = r5.get(index$iv$iv6);
        List<? extends IntrinsicMeasurable> r19 = r5;
        int $i$f$fastFirstOrNull4 = $i$f$fastFirstOrNull3;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv5), TextFieldImplKt.SuffixId) == true) goto L57;
        index$iv$iv6 = index$iv$iv6 + 1;
        r5 = r19;
        $i$f$fastFirstOrNull3 = $i$f$fastFirstOrNull4;
    L57:
        IntrinsicMeasurable it5 = (IntrinsicMeasurable) it$iv5;
        if (it5 == null) goto L60;
        int suffixWidth = r25.invoke(it5, Integer.valueOf(height)).intValue();
    L61:
        List<? extends IntrinsicMeasurable> r6 = r23;
        int $i$f$fastFirstOrNull5 = 0;
        int index$iv$iv7 = 0;
        int r14 = r6.size();
    L62:
        if (index$iv$iv7 >= r14) goto L67;
        Object item$iv$iv2 = r6.get(index$iv$iv7);
        List<? extends IntrinsicMeasurable> r110 = r6;
        int $i$f$fastFirstOrNull6 = $i$f$fastFirstOrNull5;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) item$iv$iv2), "Hint") == true) goto L65;
        index$iv$iv7 = index$iv$iv7 + 1;
        r6 = r110;
        $i$f$fastFirstOrNull5 = $i$f$fastFirstOrNull6;
        goto L62
    L65:
        Object r9 = item$iv$iv2;
    L68:
        IntrinsicMeasurable it6 = (IntrinsicMeasurable) r9;
        if (it6 == null) goto L71;
        int placeholderWidth = r25.invoke(it6, Integer.valueOf(height)).intValue();
    L72:
        int leadingWidth3 = leadingWidth2;
        return OutlinedTextFieldKt.m2477access$calculateWidthDHJA7U0(leadingWidth3, trailingWidth, prefixWidth, suffixWidth, textFieldWidth, labelWidth, placeholderWidth, this.animationProgress, TextFieldImplKt.getZeroConstraints(), $this$intrinsicWidth.getDensity(), this.paddingValues);
    L71:
        placeholderWidth = 0;
        goto L72
    L67:
        r9 = null;
        goto L68
    L60:
        suffixWidth = 0;
        goto L61
    L56:
        it$iv5 = null;
        goto L57
    L49:
        prefixWidth = 0;
        goto L50
    L45:
        leadingWidth2 = leadingWidth;
        it$iv4 = null;
        goto L46
    L38:
        leadingWidth = 0;
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
        remainingWidth = OutlinedTextFieldKt.access$substractConstraintSafely(remainingWidth, it.maxIntrinsicWidth(Integer.MAX_VALUE));
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
        remainingWidth = OutlinedTextFieldKt.access$substractConstraintSafely(remainingWidth, it2.maxIntrinsicWidth(Integer.MAX_VALUE));
        int trailingHeight = r34.invoke(it2, Integer.valueOf(width)).intValue();
    L24:
        int index$iv$iv3 = 0;
        int r9 = r32.size();
    L25:
        if (index$iv$iv3 >= r9) goto L30;
        Object it$iv3 = r32.get(index$iv$iv3);
        int trailingHeight2 = trailingHeight;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv3), "Label") == true) goto L31;
        index$iv$iv3 = index$iv$iv3 + 1;
        trailingHeight = trailingHeight2;
    L31:
        IntrinsicMeasurable it3 = (IntrinsicMeasurable) it$iv3;
        if (it3 == null) goto L34;
        int r6 = width;
        int labelHeight = r34.invoke(it3, Integer.valueOf(MathHelpersKt.lerp(remainingWidth, r6, this.animationProgress))).intValue();
    L35:
        List<? extends IntrinsicMeasurable> r3 = r32;
        int index$iv$iv4 = 0;
        int r11 = r3.size();
    L36:
        if (index$iv$iv4 >= r11) goto L41;
        Object it$iv4 = r3.get(index$iv$iv4);
        List<? extends IntrinsicMeasurable> r20 = r3;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv4), TextFieldImplKt.PrefixId) == true) goto L42;
        index$iv$iv4 = index$iv$iv4 + 1;
        r3 = r20;
    L42:
        IntrinsicMeasurable it4 = (IntrinsicMeasurable) it$iv4;
        if (it4 == null) goto L45;
        int prefixHeight = r34.invoke(it4, Integer.valueOf(remainingWidth)).intValue();
        remainingWidth = OutlinedTextFieldKt.access$substractConstraintSafely(remainingWidth, it4.maxIntrinsicWidth(Integer.MAX_VALUE));
    L46:
        List<? extends IntrinsicMeasurable> r4 = r32;
        int index$iv$iv5 = 0;
        int r12 = r4.size();
    L47:
        if (index$iv$iv5 >= r12) goto L52;
        Object it$iv5 = r4.get(index$iv$iv5);
        List<? extends IntrinsicMeasurable> r21 = r4;
        int prefixHeight2 = prefixHeight;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv5), TextFieldImplKt.SuffixId) == true) goto L53;
        index$iv$iv5 = index$iv$iv5 + 1;
        r4 = r21;
        prefixHeight = prefixHeight2;
    L53:
        IntrinsicMeasurable it5 = (IntrinsicMeasurable) it$iv5;
        if (it5 == null) goto L56;
        int suffixHeight = r34.invoke(it5, Integer.valueOf(remainingWidth)).intValue();
        remainingWidth = OutlinedTextFieldKt.access$substractConstraintSafely(remainingWidth, it5.maxIntrinsicWidth(Integer.MAX_VALUE));
    L57:
        List<? extends IntrinsicMeasurable> r7 = r32;
        int index$iv$iv6 = 0;
        int r13 = r7.size();
    L58:
        if (index$iv$iv6 >= r13) goto L87;
        Object item$iv$iv = r7.get(index$iv$iv6);
        int remainingWidth2 = remainingWidth;
        List<? extends IntrinsicMeasurable> r18 = r7;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) item$iv$iv), "TextField") == true) goto L61;
        index$iv$iv6 = index$iv$iv6 + 1;
        r7 = r18;
        remainingWidth = remainingWidth2;
        goto L58
    L61:
        int textFieldHeight = r34.invoke(item$iv$iv, Integer.valueOf(remainingWidth2)).intValue();
        List<? extends IntrinsicMeasurable> r2 = r32;
        int index$iv$iv7 = 0;
        int r14 = r2.size();
    L62:
        if (index$iv$iv7 >= r14) goto L67;
        Object it$iv6 = r2.get(index$iv$iv7);
        List<? extends IntrinsicMeasurable> r19 = r2;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv6), "Hint") == true) goto L68;
        index$iv$iv7 = index$iv$iv7 + 1;
        r2 = r19;
    L68:
        IntrinsicMeasurable it6 = (IntrinsicMeasurable) it$iv6;
        if (it6 == null) goto L71;
        int placeholderHeight = r34.invoke(it6, Integer.valueOf(remainingWidth2)).intValue();
    L72:
        List<? extends IntrinsicMeasurable> r15 = r32;
        int index$iv$iv8 = 0;
        int r16 = r15.size();
    L73:
        if (index$iv$iv8 >= r16) goto L78;
        Object item$iv$iv2 = r15.get(index$iv$iv8);
        int placeholderHeight2 = placeholderHeight;
        List<? extends IntrinsicMeasurable> r23 = r15;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) item$iv$iv2), TextFieldImplKt.SupportingId) == true) goto L76;
        index$iv$iv8 = index$iv$iv8 + 1;
        placeholderHeight = placeholderHeight2;
        r15 = r23;
        goto L73
    L76:
        Object r17 = item$iv$iv2;
    L79:
        IntrinsicMeasurable it7 = (IntrinsicMeasurable) r17;
        if (it7 == null) goto L82;
        int supportingHeight = r34.invoke(it7, Integer.valueOf(r6)).intValue();
    L83:
        int prefixHeight3 = prefixHeight2;
        int prefixHeight4 = placeholderHeight2;
        int trailingHeight3 = trailingHeight2;
        int trailingHeight4 = suffixHeight;
        return OutlinedTextFieldKt.m2476access$calculateHeightmKXJcVc(leadingHeight, trailingHeight3, prefixHeight3, trailingHeight4, textFieldHeight, labelHeight, prefixHeight4, supportingHeight, this.animationProgress, TextFieldImplKt.getZeroConstraints(), $this$intrinsicHeight.getDensity(), this.paddingValues);
    L82:
        supportingHeight = 0;
        goto L83
    L78:
        placeholderHeight2 = placeholderHeight;
        r17 = null;
        goto L79
    L71:
        placeholderHeight = 0;
        goto L72
    L67:
        it$iv6 = null;
        goto L68
    L87:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    L56:
        suffixHeight = 0;
        goto L57
    L52:
        prefixHeight2 = prefixHeight;
        it$iv5 = null;
        goto L53
    L45:
        prefixHeight = 0;
        goto L46
    L41:
        it$iv4 = null;
        goto L42
    L34:
        r6 = width;
        labelHeight = 0;
        goto L35
    L30:
        trailingHeight2 = trailingHeight;
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
