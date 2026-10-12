package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
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
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ<\u0010\r\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000e2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002J<\u0010\u0016\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u000e2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002J\"\u0010\u0018\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\"\u0010\u0019\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J,\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J\"\u0010\"\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\"\u0010#\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u000eH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "onLabelMeasured", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Size;", "", "singleLine", "", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Lkotlin/jvm/functions/Function1;ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "intrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicWidth", "height", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public MeasureResult mo32measure3p2s80s(final MeasureScope $this$measure_u2d3p2s80s, List<? extends Measurable> r42, long constraints) {
        final OutlinedTextFieldMeasurePolicy r9 = this;
        int occupiedSpaceHorizontally = 0;
        int bottomPadding = $this$measure_u2d3p2s80s.mo370roundToPx0680j_4(r9.paddingValues.mo674calculateBottomPaddingD9Ej5fM());
        long relaxedConstraints = Constraints.m6916copyZbe2FdA$default(constraints, 0, 0, 0, 0, 10, null);
        int index$iv$iv = 0;
        int r10 = r42.size();
    L3:
        if (index$iv$iv >= r10) goto L8;
        Object it$iv = r42.get(index$iv$iv);
        Measurable it = (Measurable) it$iv;
        int occupiedSpaceHorizontally2 = occupiedSpaceHorizontally;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it), "Leading") == true) goto L9;
        index$iv$iv = index$iv$iv + 1;
        occupiedSpaceHorizontally = occupiedSpaceHorizontally2;
    L9:
        Measurable r14 = (Measurable) it$iv;
        if (r14 == null) goto L12;
        Placeable leadingPlaceable = r14.mo5714measureBRTryo0(relaxedConstraints);
    L13:
        int occupiedSpaceHorizontally3 = occupiedSpaceHorizontally2 + TextFieldImplKt.widthOrZero(leadingPlaceable);
        int index$iv$iv2 = 0;
        int r12 = r42.size();
    L14:
        if (index$iv$iv2 >= r12) goto L19;
        Object it$iv2 = r42.get(index$iv$iv2);
        Measurable it2 = (Measurable) it$iv2;
        Placeable leadingPlaceable2 = leadingPlaceable;
        long relaxedConstraints2 = relaxedConstraints;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it2), "Trailing") == true) goto L20;
        index$iv$iv2 = index$iv$iv2 + 1;
        relaxedConstraints = relaxedConstraints2;
        leadingPlaceable = leadingPlaceable2;
    L20:
        Measurable r15 = (Measurable) it$iv2;
        if (r15 == null) goto L23;
        long relaxedConstraints3 = relaxedConstraints2;
        long relaxedConstraints4 = relaxedConstraints3;
        final Placeable trailingPlaceable = r15.mo5714measureBRTryo0(ConstraintsKt.m6946offsetNN6EwU$default(relaxedConstraints3, -occupiedSpaceHorizontally3, 0, 2, null));
    L24:
        int occupiedSpaceHorizontally4 = TextFieldImplKt.widthOrZero(trailingPlaceable) + occupiedSpaceHorizontally3;
        int labelHorizontalPaddingOffset = $this$measure_u2d3p2s80s.mo370roundToPx0680j_4(r9.paddingValues.mo675calculateLeftPaddingu2uoSUM($this$measure_u2d3p2s80s.getLayoutDirection())) + $this$measure_u2d3p2s80s.mo370roundToPx0680j_4(r9.paddingValues.mo676calculateRightPaddingu2uoSUM($this$measure_u2d3p2s80s.getLayoutDirection()));
        long labelConstraints = ConstraintsKt.m6945offsetNN6EwU(relaxedConstraints4, MathHelpersKt.lerp((-occupiedSpaceHorizontally4) - labelHorizontalPaddingOffset, -labelHorizontalPaddingOffset, r9.animationProgress), -bottomPadding);
        int index$iv$iv3 = 0;
        int r16 = r42.size();
    L25:
        if (index$iv$iv3 >= r16) goto L30;
        Object it$iv3 = r42.get(index$iv$iv3);
        Measurable it3 = (Measurable) it$iv3;
        long relaxedConstraints5 = relaxedConstraints4;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it3), "Label") == true) goto L31;
        index$iv$iv3 = index$iv$iv3 + 1;
        relaxedConstraints4 = relaxedConstraints5;
    L31:
        Measurable r1 = (Measurable) it$iv3;
        if (r1 == null) goto L34;
        Placeable labelPlaceable = r1.mo5714measureBRTryo0(labelConstraints);
    L36:
        if (labelPlaceable == null) goto L38;
        Placeable it4 = labelPlaceable;
        long r13 = SizeKt.Size(it4.getWidth(), it4.getHeight());
    L39:
        long labelSize = r13;
        r9.onLabelMeasured.invoke(Size.m4182boximpl(labelSize));
        int topPadding = Math.max(TextFieldImplKt.heightOrZero(labelPlaceable) / 2, $this$measure_u2d3p2s80s.mo370roundToPx0680j_4(r9.paddingValues.mo677calculateTopPaddingD9Ej5fM()));
        long textConstraints = Constraints.m6916copyZbe2FdA$default(ConstraintsKt.m6945offsetNN6EwU(constraints, -occupiedSpaceHorizontally4, (-bottomPadding) - topPadding), 0, 0, 0, 0, 11, null);
        List<? extends Measurable> r2 = r42;
        int r0 = r2.size();
        Placeable labelPlaceable2 = labelPlaceable;
        int index$iv$iv4 = 0;
    L40:
        List<? extends Measurable> r17 = r2;
        if (index$iv$iv4 >= r0) goto L73;
        Object item$iv$iv = r2.get(index$iv$iv4);
        Measurable it5 = (Measurable) item$iv$iv;
        int r30 = r0;
        int index$iv$iv5 = index$iv$iv4;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it5), "TextField") == true) goto L44;
        index$iv$iv4 = index$iv$iv5 + 1;
        r2 = r17;
        r0 = r30;
        r9 = this;
        leadingPlaceable2 = leadingPlaceable2;
        labelConstraints = labelConstraints;
        labelPlaceable2 = labelPlaceable2;
        goto L40
    L44:
        final Placeable textFieldPlaceable = ((Measurable) item$iv$iv).mo5714measureBRTryo0(textConstraints);
        long placeholderConstraints = Constraints.m6916copyZbe2FdA$default(textConstraints, 0, 0, 0, 0, 14, null);
        int r3 = r42.size();
        int index$iv$iv6 = 0;
    L45:
        if (index$iv$iv6 >= r3) goto L50;
        Object it$iv4 = r42.get(index$iv$iv6);
        Measurable it6 = (Measurable) it$iv4;
        int r33 = r3;
        int index$iv$iv7 = index$iv$iv6;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it6), "Hint") == true) goto L51;
        index$iv$iv6 = index$iv$iv7 + 1;
        r3 = r33;
    L51:
        Measurable r4 = (Measurable) it$iv4;
        if (r4 == null) goto L54;
        Placeable placeholderPlaceable = r4.mo5714measureBRTryo0(placeholderConstraints);
    L55:
        final int width = OutlinedTextFieldKt.m1716access$calculateWidthO3s9Psw(TextFieldImplKt.widthOrZero(leadingPlaceable2), TextFieldImplKt.widthOrZero(trailingPlaceable), textFieldPlaceable.getWidth(), TextFieldImplKt.widthOrZero(labelPlaceable2), TextFieldImplKt.widthOrZero(placeholderPlaceable), r9.animationProgress, constraints, $this$measure_u2d3p2s80s.getDensity(), r9.paddingValues);
        final int height = OutlinedTextFieldKt.m1715access$calculateHeightO3s9Psw(TextFieldImplKt.heightOrZero(leadingPlaceable2), TextFieldImplKt.heightOrZero(trailingPlaceable), textFieldPlaceable.getHeight(), TextFieldImplKt.heightOrZero(labelPlaceable2), TextFieldImplKt.heightOrZero(placeholderPlaceable), r9.animationProgress, constraints, $this$measure_u2d3p2s80s.getDensity(), r9.paddingValues);
        int index$iv$iv8 = 0;
        final Placeable placeholderPlaceable2 = placeholderPlaceable;
        int height2 = r42.size();
    L56:
        if (index$iv$iv8 >= height2) goto L70;
        Object item$iv$iv2 = r42.get(index$iv$iv8);
        Measurable it7 = (Measurable) item$iv$iv2;
        int r34 = height2;
        int occupiedSpaceHorizontally5 = occupiedSpaceHorizontally4;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it7), OutlinedTextFieldKt.BorderId) == true) goto L59;
        index$iv$iv8 = index$iv$iv8 + 1;
        height2 = r34;
        occupiedSpaceHorizontally4 = occupiedSpaceHorizontally5;
        r9 = this;
        leadingPlaceable2 = leadingPlaceable2;
        labelConstraints = labelConstraints;
        labelPlaceable2 = labelPlaceable2;
        goto L56
    L59:
        Measurable r5 = (Measurable) item$iv$iv2;
        int r6 = 0;
        if (width == Integer.MAX_VALUE) goto L62;
        int r11 = width;
    L64:
        if (height == Integer.MAX_VALUE) goto L66;
        r6 = height;
    L66:
        final Placeable borderPlaceable = r5.mo5714measureBRTryo0(ConstraintsKt.Constraints(r11, width, r6, height));
        final Placeable labelPlaceable3 = labelPlaceable2;
        final Placeable leadingPlaceable3 = leadingPlaceable2;
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, width, height, null, new OutlinedTextFieldMeasurePolicy$measure$1(height, width, leadingPlaceable3, trailingPlaceable, textFieldPlaceable, labelPlaceable3, placeholderPlaceable2, borderPlaceable, r9, $this$measure_u2d3p2s80s), 4, null);
    L62:
        r11 = 0;
        goto L64
    L70:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    L54:
        placeholderPlaceable = null;
        goto L55
    L50:
        it$iv4 = null;
        goto L51
    L73:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    L38:
        r13 = Size.Companion.m4203getZeroNHjbRc();
        goto L39
    L34:
        labelPlaceable = null;
        goto L36
    L30:
        it$iv3 = null;
        goto L31
    L23:
        relaxedConstraints4 = relaxedConstraints2;
        trailingPlaceable = null;
        goto L24
    L19:
        leadingPlaceable2 = leadingPlaceable;
        relaxedConstraints2 = relaxedConstraints;
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
        return intrinsicHeight($this$minIntrinsicHeight, r3, width, C04371.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, List<? extends IntrinsicMeasurable> r3, int height) {
        return intrinsicWidth($this$maxIntrinsicWidth, r3, height, C04361.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope $this$minIntrinsicWidth, List<? extends IntrinsicMeasurable> r3, int height) {
        return intrinsicWidth($this$minIntrinsicWidth, r3, height, C04381.INSTANCE);
    }

    private final int intrinsicWidth(IntrinsicMeasureScope $this$intrinsicWidth, List<? extends IntrinsicMeasurable> r21, int height, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> r23) {
        int index$iv$iv = 0;
        int r7 = r21.size();
    L3:
        if (index$iv$iv >= r7) goto L54;
        Object item$iv$iv = r21.get(index$iv$iv);
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) item$iv$iv), "TextField") == true) goto L6;
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L6:
        int textFieldWidth = r23.invoke(item$iv$iv, Integer.valueOf(height)).intValue();
        int index$iv$iv2 = 0;
        int r8 = r21.size();
    L7:
        if (index$iv$iv2 >= r8) goto L12;
        Object it$iv = r21.get(index$iv$iv2);
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv), "Label") == true) goto L13;
        index$iv$iv2 = index$iv$iv2 + 1;
    L13:
        IntrinsicMeasurable it = (IntrinsicMeasurable) it$iv;
        if (it == null) goto L16;
        int labelWidth = r23.invoke(it, Integer.valueOf(height)).intValue();
    L17:
        List<? extends IntrinsicMeasurable> r3 = r21;
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
        int trailingWidth = r23.invoke(it2, Integer.valueOf(height)).intValue();
    L28:
        List<? extends IntrinsicMeasurable> r2 = r21;
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
        int leadingWidth = r23.invoke(it3, Integer.valueOf(height)).intValue();
    L39:
        List<? extends IntrinsicMeasurable> r4 = r21;
        int index$iv$iv5 = 0;
        int r12 = r4.size();
    L40:
        if (index$iv$iv5 >= r12) goto L45;
        Object item$iv$iv2 = r4.get(index$iv$iv5);
        List<? extends IntrinsicMeasurable> r18 = r4;
        int leadingWidth2 = leadingWidth;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) item$iv$iv2), "Hint") == true) goto L43;
        index$iv$iv5 = index$iv$iv5 + 1;
        r4 = r18;
        leadingWidth = leadingWidth2;
        goto L40
    L43:
        Object r9 = item$iv$iv2;
    L46:
        IntrinsicMeasurable it4 = (IntrinsicMeasurable) r9;
        if (it4 == null) goto L49;
        int placeholderWidth = r23.invoke(it4, Integer.valueOf(height)).intValue();
    L50:
        int leadingWidth3 = leadingWidth2;
        return OutlinedTextFieldKt.m1716access$calculateWidthO3s9Psw(leadingWidth3, trailingWidth, textFieldWidth, labelWidth, placeholderWidth, this.animationProgress, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), $this$intrinsicWidth.getDensity(), this.paddingValues);
    L49:
        placeholderWidth = 0;
        goto L50
    L45:
        leadingWidth2 = leadingWidth;
        r9 = null;
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
    L54:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int intrinsicHeight(IntrinsicMeasureScope $this$intrinsicHeight, List<? extends IntrinsicMeasurable> r24, int width, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> r26) {
        int remainingWidth = width;
        int index$iv$iv = 0;
        int r8 = r24.size();
    L3:
        if (index$iv$iv >= r8) goto L8;
        Object it$iv = r24.get(index$iv$iv);
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv), "Leading") == true) goto L9;
        index$iv$iv = index$iv$iv + 1;
    L9:
        IntrinsicMeasurable it = (IntrinsicMeasurable) it$iv;
        if (it == null) goto L12;
        remainingWidth = OutlinedTextFieldKt.access$substractConstraintSafely(remainingWidth, it.maxIntrinsicWidth(Integer.MAX_VALUE));
        int r5 = r26.invoke(it, Integer.valueOf(width)).intValue();
    L13:
        int leadingHeight = r5;
        int index$iv$iv2 = 0;
        int r11 = r24.size();
    L14:
        if (index$iv$iv2 >= r11) goto L19;
        Object it$iv2 = r24.get(index$iv$iv2);
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv2), "Trailing") == true) goto L20;
        index$iv$iv2 = index$iv$iv2 + 1;
    L20:
        IntrinsicMeasurable it2 = (IntrinsicMeasurable) it$iv2;
        if (it2 == null) goto L23;
        remainingWidth = OutlinedTextFieldKt.access$substractConstraintSafely(remainingWidth, it2.maxIntrinsicWidth(Integer.MAX_VALUE));
        int trailingHeight = r26.invoke(it2, Integer.valueOf(width)).intValue();
    L24:
        List<? extends IntrinsicMeasurable> r3 = r24;
        int $i$f$fastFirstOrNull = 0;
        int index$iv$iv3 = 0;
        int r10 = r3.size();
    L25:
        if (index$iv$iv3 >= r10) goto L30;
        Object it$iv3 = r3.get(index$iv$iv3);
        List<? extends IntrinsicMeasurable> r17 = r3;
        int $i$f$fastFirstOrNull2 = $i$f$fastFirstOrNull;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv3), "Label") == true) goto L31;
        index$iv$iv3 = index$iv$iv3 + 1;
        r3 = r17;
        $i$f$fastFirstOrNull = $i$f$fastFirstOrNull2;
    L31:
        IntrinsicMeasurable it3 = (IntrinsicMeasurable) it$iv3;
        if (it3 == null) goto L34;
        int labelHeight = r26.invoke(it3, Integer.valueOf(MathHelpersKt.lerp(remainingWidth, width, this.animationProgress))).intValue();
    L35:
        List<? extends IntrinsicMeasurable> r4 = r24;
        int index$iv$iv4 = 0;
        int r12 = r4.size();
    L36:
        if (index$iv$iv4 >= r12) goto L54;
        Object item$iv$iv = r4.get(index$iv$iv4);
        int remainingWidth2 = remainingWidth;
        List<? extends IntrinsicMeasurable> r20 = r4;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) item$iv$iv), "TextField") == true) goto L39;
        index$iv$iv4 = index$iv$iv4 + 1;
        remainingWidth = remainingWidth2;
        r4 = r20;
        goto L36
    L39:
        int textFieldHeight = r26.invoke(item$iv$iv, Integer.valueOf(remainingWidth2)).intValue();
        List<? extends IntrinsicMeasurable> r2 = r24;
        int $i$f$fastFirstOrNull3 = 0;
        int index$iv$iv5 = 0;
        int r13 = r2.size();
    L40:
        if (index$iv$iv5 >= r13) goto L45;
        Object it$iv4 = r2.get(index$iv$iv5);
        List<? extends IntrinsicMeasurable> r21 = r2;
        int $i$f$fastFirstOrNull4 = $i$f$fastFirstOrNull3;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv4), "Hint") == true) goto L46;
        index$iv$iv5 = index$iv$iv5 + 1;
        r2 = r21;
        $i$f$fastFirstOrNull3 = $i$f$fastFirstOrNull4;
    L46:
        IntrinsicMeasurable it4 = (IntrinsicMeasurable) it$iv4;
        if (it4 == null) goto L49;
        int placeholderHeight = r26.invoke(it4, Integer.valueOf(remainingWidth2)).intValue();
    L51:
        return OutlinedTextFieldKt.m1715access$calculateHeightO3s9Psw(leadingHeight, trailingHeight, textFieldHeight, labelHeight, placeholderHeight, this.animationProgress, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), $this$intrinsicHeight.getDensity(), this.paddingValues);
    L49:
        placeholderHeight = 0;
        goto L51
    L45:
        it$iv4 = null;
        goto L46
    L54:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
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
