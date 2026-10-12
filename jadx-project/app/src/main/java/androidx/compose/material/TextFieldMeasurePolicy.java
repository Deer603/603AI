package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.layout.AlignmentLineKt;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ8\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J<\u0010\u0011\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J\"\u0010\u0014\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\"\u0010\u0015\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016J,\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\"\u0010\u001f\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/material/TextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "singleLine", "", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "intrinsicWidth", "", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "width", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public MeasureResult mo32measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, List<? extends Measurable> r38, long constraints) {
        final TextFieldMeasurePolicy r10 = this;
        final MeasureScope r13 = $this$measure_u2d3p2s80s;
        final int topPaddingValue = r13.mo370roundToPx0680j_4(r10.paddingValues.mo677calculateTopPaddingD9Ej5fM());
        int bottomPaddingValue = r13.mo370roundToPx0680j_4(r10.paddingValues.mo674calculateBottomPaddingD9Ej5fM());
        final int topPadding = r13.mo370roundToPx0680j_4(TextFieldKt.getTextFieldTopPadding());
        int occupiedSpaceHorizontally = 0;
        long looseConstraints = Constraints.m6916copyZbe2FdA$default(constraints, 0, 0, 0, 0, 10, null);
        int index$iv$iv = 0;
        int r9 = r38.size();
    L3:
        if (index$iv$iv >= r9) goto L8;
        Object it$iv = r38.get(index$iv$iv);
        Measurable it = (Measurable) it$iv;
        int occupiedSpaceHorizontally2 = occupiedSpaceHorizontally;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it), "Leading") == true) goto L9;
        index$iv$iv = index$iv$iv + 1;
        occupiedSpaceHorizontally = occupiedSpaceHorizontally2;
    L9:
        Measurable r0 = (Measurable) it$iv;
        if (r0 == null) goto L12;
        Placeable r8 = r0.mo5714measureBRTryo0(looseConstraints);
    L13:
        Placeable leadingPlaceable = r8;
        int occupiedSpaceHorizontally3 = occupiedSpaceHorizontally2 + TextFieldImplKt.widthOrZero(leadingPlaceable);
        int index$iv$iv2 = 0;
        int r11 = r38.size();
    L14:
        if (index$iv$iv2 >= r11) goto L19;
        Object it$iv2 = r38.get(index$iv$iv2);
        Measurable it2 = (Measurable) it$iv2;
        Placeable leadingPlaceable2 = leadingPlaceable;
        long looseConstraints2 = looseConstraints;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it2), "Trailing") == true) goto L20;
        index$iv$iv2 = index$iv$iv2 + 1;
        looseConstraints = looseConstraints2;
        leadingPlaceable = leadingPlaceable2;
    L20:
        Measurable r1 = (Measurable) it$iv2;
        if (r1 == null) goto L23;
        long looseConstraints3 = looseConstraints2;
        final Placeable leadingPlaceable3 = r1.mo5714measureBRTryo0(ConstraintsKt.m6946offsetNN6EwU$default(looseConstraints3, -occupiedSpaceHorizontally3, 0, 2, null));
    L24:
        int occupiedSpaceHorizontally4 = TextFieldImplKt.widthOrZero(leadingPlaceable3) + occupiedSpaceHorizontally3;
        int occupiedSpaceHorizontally5 = -bottomPaddingValue;
        long labelConstraints = ConstraintsKt.m6945offsetNN6EwU(looseConstraints3, -occupiedSpaceHorizontally4, occupiedSpaceHorizontally5);
        int index$iv$iv3 = 0;
        int r2 = r38.size();
    L25:
        if (index$iv$iv3 >= r2) goto L30;
        Object it$iv3 = r38.get(index$iv$iv3);
        Measurable it3 = (Measurable) it$iv3;
        int r22 = r2;
        long looseConstraints4 = looseConstraints3;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it3), "Label") == true) goto L31;
        index$iv$iv3 = index$iv$iv3 + 1;
        r2 = r22;
        looseConstraints3 = looseConstraints4;
    L31:
        Measurable r3 = (Measurable) it$iv3;
        if (r3 == null) goto L34;
        Placeable labelPlaceable = r3.mo5714measureBRTryo0(labelConstraints);
    L36:
        if (labelPlaceable == null) goto L42;
        int it4 = labelPlaceable.get(AlignmentLineKt.getLastBaseline());
        if (it4 != Integer.MIN_VALUE) goto L43;
        it4 = labelPlaceable.getHeight();
    L43:
        final int effectiveLabelBaseline = Math.max(it4, topPaddingValue);
        if (labelPlaceable == null) goto L46;
        int topPaddingValue2 = ((-bottomPaddingValue) - topPadding) - effectiveLabelBaseline;
    L47:
        final int lastBaseline = it4;
        long textFieldConstraints = ConstraintsKt.m6945offsetNN6EwU(Constraints.m6916copyZbe2FdA$default(constraints, 0, 0, 0, 0, 11, null), -occupiedSpaceHorizontally4, topPaddingValue2);
        List<? extends Measurable> r17 = r38;
        int r12 = r17.size();
        int occupiedSpaceHorizontally6 = 0;
    L48:
        if (occupiedSpaceHorizontally6 >= r12) goto L70;
        final Placeable labelPlaceable2 = labelPlaceable;
        List<? extends Measurable> r4 = r17;
        Object item$iv$iv = r4.get(occupiedSpaceHorizontally6);
        Measurable it5 = (Measurable) item$iv$iv;
        int index$iv$iv4 = occupiedSpaceHorizontally6;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it5), "TextField") == true) goto L51;
        Placeable trailingPlaceable = leadingPlaceable3;
        Placeable trailingPlaceable2 = leadingPlaceable2;
        int verticalConstraintOffset = topPaddingValue2;
        occupiedSpaceHorizontally6 = index$iv$iv4 + 1;
        r13 = $this$measure_u2d3p2s80s;
        topPaddingValue2 = verticalConstraintOffset;
        labelPlaceable = labelPlaceable2;
        r17 = r4;
        leadingPlaceable2 = trailingPlaceable2;
        leadingPlaceable3 = trailingPlaceable;
        r10 = this;
        goto L48
    L51:
        final Placeable textFieldPlaceable = ((Measurable) item$iv$iv).mo5714measureBRTryo0(textFieldConstraints);
        long placeholderConstraints = Constraints.m6916copyZbe2FdA$default(textFieldConstraints, 0, 0, 0, 0, 14, null);
        int r5 = r38.size();
        int index$iv$iv5 = 0;
    L52:
        if (index$iv$iv5 >= r5) goto L57;
        Object it$iv4 = r38.get(index$iv$iv5);
        Measurable it6 = (Measurable) it$iv4;
        int r32 = r5;
        int index$iv$iv6 = index$iv$iv5;
        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(it6), "Hint") == true) goto L58;
        index$iv$iv5 = index$iv$iv6 + 1;
        r5 = r32;
    L58:
        Measurable r6 = (Measurable) it$iv4;
        if (r6 == null) goto L61;
        Placeable placeholderPlaceable = r6.mo5714measureBRTryo0(placeholderConstraints);
    L62:
        final int width = TextFieldKt.m1838access$calculateWidthVsPV1Ek(TextFieldImplKt.widthOrZero(leadingPlaceable2), TextFieldImplKt.widthOrZero(leadingPlaceable3), textFieldPlaceable.getWidth(), TextFieldImplKt.widthOrZero(labelPlaceable2), TextFieldImplKt.widthOrZero(placeholderPlaceable), constraints);
        int r15 = textFieldPlaceable.getHeight();
        if (labelPlaceable2 == null) goto L65;
        boolean r16 = true;
    L66:
        final int height = TextFieldKt.m1837access$calculateHeightO3s9Psw(r15, r16, effectiveLabelBaseline, TextFieldImplKt.heightOrZero(leadingPlaceable2), TextFieldImplKt.heightOrZero(leadingPlaceable3), TextFieldImplKt.heightOrZero(placeholderPlaceable), constraints, r13.getDensity(), r10.paddingValues);
        final Placeable placeholderPlaceable2 = placeholderPlaceable;
        final Placeable leadingPlaceable4 = leadingPlaceable2;
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, width, height, null, new TextFieldMeasurePolicy$measure$1(labelPlaceable2, topPaddingValue, lastBaseline, width, height, textFieldPlaceable, placeholderPlaceable2, leadingPlaceable4, leadingPlaceable3, r10, effectiveLabelBaseline, topPadding, r13), 4, null);
    L65:
        r16 = false;
        goto L66
    L61:
        placeholderPlaceable = null;
        goto L62
    L57:
        it$iv4 = null;
        goto L58
    L70:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    L46:
        topPaddingValue2 = (-topPaddingValue) - bottomPaddingValue;
        goto L47
    L42:
        it4 = 0;
        goto L43
    L34:
        labelPlaceable = null;
        goto L36
    L30:
        it$iv3 = null;
        goto L31
    L23:
        looseConstraints3 = looseConstraints2;
        leadingPlaceable3 = null;
        goto L24
    L19:
        leadingPlaceable2 = leadingPlaceable;
        looseConstraints2 = looseConstraints;
        it$iv2 = null;
        goto L20
    L12:
        r8 = null;
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
        return intrinsicHeight($this$minIntrinsicHeight, r3, width, C04621.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, List<? extends IntrinsicMeasurable> r3, int height) {
        return intrinsicWidth(r3, height, C04611.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope $this$minIntrinsicWidth, List<? extends IntrinsicMeasurable> r3, int height) {
        return intrinsicWidth(r3, height, C04631.INSTANCE);
    }

    private final int intrinsicWidth(List<? extends IntrinsicMeasurable> r19, int height, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> r21) {
        int index$iv$iv = 0;
        int r6 = r19.size();
    L3:
        if (index$iv$iv >= r6) goto L54;
        Object item$iv$iv = r19.get(index$iv$iv);
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) item$iv$iv), "TextField") == true) goto L6;
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L6:
        int textFieldWidth = r21.invoke(item$iv$iv, Integer.valueOf(height)).intValue();
        int index$iv$iv2 = 0;
        int r7 = r19.size();
    L7:
        if (index$iv$iv2 >= r7) goto L12;
        Object it$iv = r19.get(index$iv$iv2);
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv), "Label") == true) goto L13;
        index$iv$iv2 = index$iv$iv2 + 1;
    L13:
        IntrinsicMeasurable it = (IntrinsicMeasurable) it$iv;
        if (it == null) goto L16;
        int labelWidth = r21.invoke(it, Integer.valueOf(height)).intValue();
    L17:
        int index$iv$iv3 = 0;
        int r10 = r19.size();
    L18:
        if (index$iv$iv3 >= r10) goto L23;
        Object it$iv2 = r19.get(index$iv$iv3);
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv2), "Trailing") == true) goto L24;
        index$iv$iv3 = index$iv$iv3 + 1;
    L24:
        IntrinsicMeasurable it2 = (IntrinsicMeasurable) it$iv2;
        if (it2 == null) goto L27;
        int trailingWidth = r21.invoke(it2, Integer.valueOf(height)).intValue();
    L28:
        List<? extends IntrinsicMeasurable> r1 = r19;
        int index$iv$iv4 = 0;
        int r9 = r1.size();
    L29:
        if (index$iv$iv4 >= r9) goto L34;
        Object it$iv3 = r1.get(index$iv$iv4);
        List<? extends IntrinsicMeasurable> r16 = r1;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv3), "Leading") == true) goto L35;
        index$iv$iv4 = index$iv$iv4 + 1;
        r1 = r16;
    L35:
        IntrinsicMeasurable it3 = (IntrinsicMeasurable) it$iv3;
        if (it3 == null) goto L38;
        int leadingWidth = r21.invoke(it3, Integer.valueOf(height)).intValue();
    L39:
        List<? extends IntrinsicMeasurable> r2 = r19;
        int index$iv$iv5 = 0;
        int r11 = r2.size();
    L40:
        if (index$iv$iv5 >= r11) goto L45;
        Object item$iv$iv2 = r2.get(index$iv$iv5);
        List<? extends IntrinsicMeasurable> r17 = r2;
        int leadingWidth2 = leadingWidth;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) item$iv$iv2), "Hint") == true) goto L43;
        index$iv$iv5 = index$iv$iv5 + 1;
        r2 = r17;
        leadingWidth = leadingWidth2;
        goto L40
    L43:
        Object r8 = item$iv$iv2;
    L46:
        IntrinsicMeasurable it4 = (IntrinsicMeasurable) r8;
        if (it4 == null) goto L49;
        int placeholderWidth = r21.invoke(it4, Integer.valueOf(height)).intValue();
    L50:
        int leadingWidth3 = leadingWidth2;
        return TextFieldKt.m1838access$calculateWidthVsPV1Ek(leadingWidth3, trailingWidth, textFieldWidth, labelWidth, placeholderWidth, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
    L49:
        placeholderWidth = 0;
        goto L50
    L45:
        leadingWidth2 = leadingWidth;
        r8 = null;
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

    private final int intrinsicHeight(IntrinsicMeasureScope $this$intrinsicHeight, List<? extends IntrinsicMeasurable> r23, int width, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> r25) {
        int remainingWidth = width;
        int index$iv$iv = 0;
        int r7 = r23.size();
    L3:
        if (index$iv$iv >= r7) goto L8;
        Object it$iv = r23.get(index$iv$iv);
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv), "Leading") == true) goto L9;
        index$iv$iv = index$iv$iv + 1;
    L9:
        IntrinsicMeasurable it = (IntrinsicMeasurable) it$iv;
        if (it == null) goto L12;
        remainingWidth = TextFieldKt.access$substractConstraintSafely(remainingWidth, it.maxIntrinsicWidth(Integer.MAX_VALUE));
        int r4 = r25.invoke(it, Integer.valueOf(width)).intValue();
    L13:
        int leadingHeight = r4;
        int index$iv$iv2 = 0;
        int r10 = r23.size();
    L14:
        if (index$iv$iv2 >= r10) goto L19;
        Object it$iv2 = r23.get(index$iv$iv2);
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv2), "Trailing") == true) goto L20;
        index$iv$iv2 = index$iv$iv2 + 1;
    L20:
        IntrinsicMeasurable it2 = (IntrinsicMeasurable) it$iv2;
        if (it2 == null) goto L23;
        remainingWidth = TextFieldKt.access$substractConstraintSafely(remainingWidth, it2.maxIntrinsicWidth(Integer.MAX_VALUE));
        int trailingHeight = r25.invoke(it2, Integer.valueOf(width)).intValue();
    L24:
        int index$iv$iv3 = 0;
        int r8 = r23.size();
    L25:
        if (index$iv$iv3 >= r8) goto L30;
        Object it$iv3 = r23.get(index$iv$iv3);
        int remainingWidth2 = remainingWidth;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv3), "Label") == true) goto L31;
        index$iv$iv3 = index$iv$iv3 + 1;
        remainingWidth = remainingWidth2;
    L31:
        IntrinsicMeasurable it3 = (IntrinsicMeasurable) it$iv3;
        if (it3 == null) goto L34;
        int labelHeight = r25.invoke(it3, Integer.valueOf(remainingWidth2)).intValue();
    L35:
        List<? extends IntrinsicMeasurable> r1 = r23;
        int index$iv$iv4 = 0;
        int r6 = r1.size();
    L36:
        if (index$iv$iv4 >= r6) goto L58;
        Object item$iv$iv = r1.get(index$iv$iv4);
        List<? extends IntrinsicMeasurable> r16 = r1;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) item$iv$iv), "TextField") == true) goto L39;
        index$iv$iv4 = index$iv$iv4 + 1;
        r1 = r16;
        goto L36
    L39:
        int textFieldHeight = r25.invoke(item$iv$iv, Integer.valueOf(remainingWidth2)).intValue();
        List<? extends IntrinsicMeasurable> r2 = r23;
        int $i$f$fastFirstOrNull = 0;
        int index$iv$iv5 = 0;
        int r9 = r2.size();
    L40:
        if (index$iv$iv5 >= r9) goto L45;
        Object it$iv4 = r2.get(index$iv$iv5);
        List<? extends IntrinsicMeasurable> r17 = r2;
        int $i$f$fastFirstOrNull2 = $i$f$fastFirstOrNull;
        if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) it$iv4), "Hint") == true) goto L46;
        index$iv$iv5 = index$iv$iv5 + 1;
        r2 = r17;
        $i$f$fastFirstOrNull = $i$f$fastFirstOrNull2;
    L46:
        IntrinsicMeasurable it4 = (IntrinsicMeasurable) it$iv4;
        if (it4 == null) goto L49;
        int placeholderHeight = r25.invoke(it4, Integer.valueOf(remainingWidth2)).intValue();
    L51:
        if (labelHeight <= 0) goto L53;
        boolean r11 = true;
    L55:
        return TextFieldKt.m1837access$calculateHeightO3s9Psw(textFieldHeight, r11, labelHeight, leadingHeight, trailingHeight, placeholderHeight, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), $this$intrinsicHeight.getDensity(), this.paddingValues);
    L53:
        r11 = false;
        goto L55
    L49:
        placeholderHeight = 0;
        goto L51
    L45:
        it$iv4 = null;
        goto L46
    L58:
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    L34:
        labelHeight = 0;
        goto L35
    L30:
        remainingWidth2 = remainingWidth;
        it$iv3 = null;
        goto L31
    L23:
        trailingHeight = 0;
        goto L24
    L19:
        it$iv2 = null;
        goto L20
    L12:
        r4 = 0;
        goto L13
    L8:
        it$iv = null;
        goto L9
    }
}
