package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: ListItem.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JV\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\t\u001a\u00020\u00042,\u0010\n\u001a(\u0012\u0004\u0012\u00020\b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\b\u000eH\u0002JV\u0010\u000f\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\u0010\u001a\u00020\u00042,\u0010\n\u001a(\u0012\u0004\u0012\u00020\b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\b\u000eH\u0002J(\u0010\u0011\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J2\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00070\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001b\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016J(\u0010\u001c\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\u0010\u001a\u00020\u0004H\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/ListItemMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "()V", "calculateIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "intrinsicMeasure", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "Lkotlin/ExtensionFunctionType;", "calculateIntrinsicWidth", "height", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ListItemMeasurePolicy implements MultiContentMeasurePolicy {

    /* JADX INFO: renamed from: androidx.compose.material3.ListItemMeasurePolicy$maxIntrinsicHeight$1, reason: invalid class name */
    /* JADX INFO: compiled from: ListItem.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<IntrinsicMeasurable, Integer, Integer> {
        public static final AnonymousClass1 INSTANCE = null;

        static {
            INSTANCE = new AnonymousClass1();
        }

        AnonymousClass1() {
            super(2, IntrinsicMeasurable.class, "maxIntrinsicHeight", "maxIntrinsicHeight(I)I", 0);
        }

        public final Integer invoke(IntrinsicMeasurable p0, int p1) {
            return Integer.valueOf(p0.maxIntrinsicHeight(p1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable r3, Integer r4) {
            return invoke(r3, r4.intValue());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ListItemMeasurePolicy$maxIntrinsicWidth$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ListItem.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class C05351 extends FunctionReferenceImpl implements Function2<IntrinsicMeasurable, Integer, Integer> {
        public static final C05351 INSTANCE = null;

        static {
            INSTANCE = new C05351();
        }

        C05351() {
            super(2, IntrinsicMeasurable.class, "maxIntrinsicWidth", "maxIntrinsicWidth(I)I", 0);
        }

        public final Integer invoke(IntrinsicMeasurable p0, int p1) {
            return Integer.valueOf(p0.maxIntrinsicWidth(p1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable r3, Integer r4) {
            return invoke(r3, r4.intValue());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ListItemMeasurePolicy$minIntrinsicHeight$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ListItem.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class C05361 extends FunctionReferenceImpl implements Function2<IntrinsicMeasurable, Integer, Integer> {
        public static final C05361 INSTANCE = null;

        static {
            INSTANCE = new C05361();
        }

        C05361() {
            super(2, IntrinsicMeasurable.class, "minIntrinsicHeight", "minIntrinsicHeight(I)I", 0);
        }

        public final Integer invoke(IntrinsicMeasurable p0, int p1) {
            return Integer.valueOf(p0.minIntrinsicHeight(p1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable r3, Integer r4) {
            return invoke(r3, r4.intValue());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ListItemMeasurePolicy$minIntrinsicWidth$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ListItem.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class C05371 extends FunctionReferenceImpl implements Function2<IntrinsicMeasurable, Integer, Integer> {
        public static final C05371 INSTANCE = null;

        static {
            INSTANCE = new C05371();
        }

        C05371() {
            super(2, IntrinsicMeasurable.class, "minIntrinsicWidth", "minIntrinsicWidth(I)I", 0);
        }

        public final Integer invoke(IntrinsicMeasurable p0, int p1) {
            return Integer.valueOf(p0.minIntrinsicWidth(p1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable r3, Integer r4) {
            return invoke(r3, r4.intValue());
        }
    }

    public ListItemMeasurePolicy() {
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo672measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, List<? extends List<? extends Measurable>> r44, long constraints) {
        List<? extends Measurable> r2 = r44.get(0);
        boolean r3 = true;
        List<? extends Measurable> r4 = r44.get(1);
        List<? extends Measurable> r5 = r44.get(2);
        List<? extends Measurable> r6 = r44.get(3);
        List<? extends Measurable> r7 = r44.get(4);
        long looseConstraints = Constraints.m6916copyZbe2FdA$default(constraints, 0, 0, 0, 0, 10, null);
        float startPadding = ListItemKt.getListItemStartPadding();
        float endPadding = ListItemKt.getListItemEndPadding();
        int horizontalPadding = $this$measure_u2d3p2s80s.mo370roundToPx0680j_4(Dp.m6973constructorimpl(startPadding + endPadding));
        Measurable r9 = (Measurable) CollectionsKt.firstOrNull(r6);
        if (r9 == null) goto L5;
        int r10 = r9.minIntrinsicWidth(Constraints.m6925getMaxHeightimpl(constraints));
    L6:
        int intrinsicLeadingWidth = r10;
        Measurable r11 = (Measurable) CollectionsKt.firstOrNull(r7);
        if (r11 == null) goto L9;
        int r12 = r11.minIntrinsicWidth(Constraints.m6925getMaxHeightimpl(constraints));
    L10:
        int intrinsicTrailingWidth = r12;
        int intrinsicSupportingWidthConstraint = ListItemKt.access$subtractConstraintSafely(Constraints.m6926getMaxWidthimpl(looseConstraints), (intrinsicLeadingWidth + intrinsicTrailingWidth) + horizontalPadding);
        Measurable r13 = (Measurable) CollectionsKt.firstOrNull(r5);
        if (r13 == null) goto L13;
        int intrinsicSupportingHeight = r13.minIntrinsicHeight(intrinsicSupportingWidthConstraint);
    L14:
        boolean intrinsicIsSupportingMultiline = ListItemKt.access$isSupportingMultilineHeuristic($this$measure_u2d3p2s80s, intrinsicSupportingHeight);
        ListItemType.Companion r1 = ListItemType.Companion;
        if (CollectionsKt.firstOrNull(r4) != null) goto L19;
        r3 = false;
    L19:
        if (CollectionsKt.firstOrNull(r5) == null) goto L21;
        boolean r8 = true;
    L22:
        int intrinsicListItemType = r1.m2343invokeZLSjz4$material3_release(r3, r8, intrinsicIsSupportingMultiline);
        float arg0$iv = ListItemKt.m2327access$verticalPaddingyh95HIg(intrinsicListItemType);
        float arg0$iv2 = 2;
        int intrinsicVerticalPadding = $this$measure_u2d3p2s80s.mo370roundToPx0680j_4(Dp.m6973constructorimpl(arg0$iv2 * arg0$iv));
        long paddedLooseConstraints = ConstraintsKt.m6945offsetNN6EwU(looseConstraints, -horizontalPadding, -intrinsicVerticalPadding);
        Measurable r14 = (Measurable) CollectionsKt.firstOrNull(r6);
        Placeable r27 = null;
        if (r14 == null) goto L25;
        Placeable leadingPlaceable = r14.mo5714measureBRTryo0(paddedLooseConstraints);
    L26:
        Placeable leadingPlaceable2 = leadingPlaceable;
        int currentTotalWidth = 0 + TextFieldImplKt.widthOrZero(leadingPlaceable);
        Measurable r15 = (Measurable) CollectionsKt.firstOrNull(r7);
        if (r15 == null) goto L29;
        Placeable trailingPlaceable = r15.mo5714measureBRTryo0(ConstraintsKt.m6946offsetNN6EwU$default(paddedLooseConstraints, -currentTotalWidth, 0, 2, null));
    L30:
        int currentTotalWidth2 = currentTotalWidth + TextFieldImplKt.widthOrZero(trailingPlaceable);
        Measurable r16 = (Measurable) CollectionsKt.firstOrNull(r2);
        if (r16 == null) goto L33;
        Placeable headlinePlaceable = r16.mo5714measureBRTryo0(ConstraintsKt.m6946offsetNN6EwU$default(paddedLooseConstraints, -currentTotalWidth2, 0, 2, null));
    L34:
        int currentTotalHeight = 0 + TextFieldImplKt.heightOrZero(headlinePlaceable);
        Measurable r17 = (Measurable) CollectionsKt.firstOrNull(r5);
        if (r17 == null) goto L37;
        Placeable supportingPlaceable = r17.mo5714measureBRTryo0(ConstraintsKt.m6945offsetNN6EwU(paddedLooseConstraints, -currentTotalWidth2, -currentTotalHeight));
    L38:
        int currentTotalHeight2 = currentTotalHeight + TextFieldImplKt.heightOrZero(supportingPlaceable);
        if (supportingPlaceable != null) goto L41;
    L43:
        boolean isSupportingMultiline = false;
    L44:
        Measurable r18 = (Measurable) CollectionsKt.firstOrNull(r4);
        if (r18 == null) goto L48;
        r27 = r18.mo5714measureBRTryo0(ConstraintsKt.m6945offsetNN6EwU(r21, -currentTotalWidth2, -currentTotalHeight2));
    L48:
        Placeable overlinePlaceable = r27;
        ListItemType.Companion r19 = ListItemType.Companion;
        if (overlinePlaceable == null) goto L51;
        boolean r20 = true;
    L52:
        if (supportingPlaceable == 0) goto L54;
        boolean r21 = true;
    L55:
        int listItemType = r19.m2343invokeZLSjz4$material3_release(r20, r21, isSupportingMultiline);
        float topPadding = ListItemKt.m2327access$verticalPaddingyh95HIg(listItemType);
        float verticalPadding = Dp.m6973constructorimpl(2 * topPadding);
        int width = ListItemKt.m2326access$calculateWidthyeHjK3Y($this$measure_u2d3p2s80s, TextFieldImplKt.widthOrZero(leadingPlaceable2), TextFieldImplKt.widthOrZero(trailingPlaceable), TextFieldImplKt.widthOrZero(headlinePlaceable), TextFieldImplKt.widthOrZero(overlinePlaceable), TextFieldImplKt.widthOrZero(supportingPlaceable), horizontalPadding, constraints);
        int height = ListItemKt.m2325access$calculateHeightN4Jib3Y($this$measure_u2d3p2s80s, TextFieldImplKt.heightOrZero(leadingPlaceable2), TextFieldImplKt.heightOrZero(trailingPlaceable), TextFieldImplKt.heightOrZero(headlinePlaceable), TextFieldImplKt.heightOrZero(overlinePlaceable), TextFieldImplKt.heightOrZero(supportingPlaceable), listItemType, $this$measure_u2d3p2s80s.mo370roundToPx0680j_4(verticalPadding), constraints);
        boolean r110 = ListItemType.m2335equalsimpl0(listItemType, ListItemType.Companion.m2341getThreeLineAlXitO8());
        int intrinsicSupportingWidthConstraint2 = $this$measure_u2d3p2s80s.mo370roundToPx0680j_4(startPadding);
        int intrinsicSupportingHeight2 = $this$measure_u2d3p2s80s.mo370roundToPx0680j_4(endPadding);
        return ListItemKt.access$place($this$measure_u2d3p2s80s, width, height, leadingPlaceable2, trailingPlaceable, headlinePlaceable, overlinePlaceable, supportingPlaceable, r110, intrinsicSupportingWidthConstraint2, intrinsicSupportingHeight2, $this$measure_u2d3p2s80s.mo370roundToPx0680j_4(topPadding));
    L54:
        r21 = false;
        goto L55
    L51:
        r20 = false;
        goto L52
    L41:
        if (supportingPlaceable.get(AlignmentLineKt.getFirstBaseline()) == supportingPlaceable.get(AlignmentLineKt.getLastBaseline())) goto L43;
        isSupportingMultiline = true;
        goto L44
    L37:
        supportingPlaceable = null;
        goto L38
    L33:
        headlinePlaceable = null;
        goto L34
    L29:
        trailingPlaceable = null;
        goto L30
    L25:
        leadingPlaceable = null;
        goto L26
    L21:
        r8 = false;
        goto L22
    L13:
        intrinsicSupportingHeight = 0;
        goto L14
    L9:
        r12 = 0;
        goto L10
    L5:
        r10 = 0;
        goto L6
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope $this$maxIntrinsicHeight, List<? extends List<? extends IntrinsicMeasurable>> r3, int width) {
        return calculateIntrinsicHeight($this$maxIntrinsicHeight, r3, width, AnonymousClass1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, List<? extends List<? extends IntrinsicMeasurable>> r3, int height) {
        return calculateIntrinsicWidth($this$maxIntrinsicWidth, r3, height, C05351.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope $this$minIntrinsicHeight, List<? extends List<? extends IntrinsicMeasurable>> r3, int width) {
        return calculateIntrinsicHeight($this$minIntrinsicHeight, r3, width, C05361.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope $this$minIntrinsicWidth, List<? extends List<? extends IntrinsicMeasurable>> r3, int height) {
        return calculateIntrinsicWidth($this$minIntrinsicWidth, r3, height, C05371.INSTANCE);
    }

    private final int calculateIntrinsicWidth(IntrinsicMeasureScope $this$calculateIntrinsicWidth, List<? extends List<? extends IntrinsicMeasurable>> r24, int height, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> r26) {
        int r2 = 0;
        List<? extends IntrinsicMeasurable> r3 = r24.get(0);
        List<? extends IntrinsicMeasurable> r4 = r24.get(1);
        List<? extends IntrinsicMeasurable> r5 = r24.get(2);
        List<? extends IntrinsicMeasurable> r6 = r24.get(3);
        List<? extends IntrinsicMeasurable> r7 = r24.get(4);
        IntrinsicMeasurable r8 = (IntrinsicMeasurable) CollectionsKt.firstOrNull(r6);
        if (r8 == null) goto L5;
        int r10 = r26.invoke(r8, Integer.valueOf(height)).intValue();
    L6:
        IntrinsicMeasurable r9 = (IntrinsicMeasurable) CollectionsKt.firstOrNull(r7);
        if (r9 == null) goto L9;
        int r11 = r26.invoke(r9, Integer.valueOf(height)).intValue();
    L10:
        IntrinsicMeasurable r12 = (IntrinsicMeasurable) CollectionsKt.firstOrNull(r3);
        if (r12 == null) goto L13;
        int r13 = r26.invoke(r12, Integer.valueOf(height)).intValue();
    L14:
        IntrinsicMeasurable r14 = (IntrinsicMeasurable) CollectionsKt.firstOrNull(r4);
        if (r14 == null) goto L17;
        int r15 = r26.invoke(r14, Integer.valueOf(height)).intValue();
    L18:
        IntrinsicMeasurable r16 = (IntrinsicMeasurable) CollectionsKt.firstOrNull(r5);
        if (r16 == null) goto L21;
        r2 = r26.invoke(r16, Integer.valueOf(height)).intValue();
    L21:
        int r17 = r2;
        float arg0$iv = ListItemKt.getListItemStartPadding();
        float other$iv = ListItemKt.getListItemEndPadding();
        return ListItemKt.m2326access$calculateWidthyeHjK3Y($this$calculateIntrinsicWidth, r10, r11, r13, r15, r17, $this$calculateIntrinsicWidth.mo370roundToPx0680j_4(Dp.m6973constructorimpl(arg0$iv + other$iv)), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
    L17:
        r15 = 0;
        goto L18
    L13:
        r13 = 0;
        goto L14
    L9:
        r11 = 0;
        goto L10
    L5:
        r10 = 0;
        goto L6
    }

    private final int calculateIntrinsicHeight(IntrinsicMeasureScope $this$calculateIntrinsicHeight, List<? extends List<? extends IntrinsicMeasurable>> r31, int width, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> r33) {
        List<? extends IntrinsicMeasurable> r2 = r31.get(0);
        boolean r3 = true;
        List<? extends IntrinsicMeasurable> r4 = r31.get(1);
        List<? extends IntrinsicMeasurable> r5 = r31.get(2);
        List<? extends IntrinsicMeasurable> r6 = r31.get(3);
        List<? extends IntrinsicMeasurable> r7 = r31.get(4);
        float arg0$iv = ListItemKt.getListItemStartPadding();
        float other$iv = ListItemKt.getListItemEndPadding();
        int remainingWidth = ListItemKt.access$subtractConstraintSafely(width, $this$calculateIntrinsicHeight.mo370roundToPx0680j_4(Dp.m6973constructorimpl(arg0$iv + other$iv)));
        IntrinsicMeasurable it = (IntrinsicMeasurable) CollectionsKt.firstOrNull(r6);
        if (it == null) goto L5;
        int leadingHeight = r33.invoke(it, Integer.valueOf(remainingWidth)).intValue();
        remainingWidth = ListItemKt.access$subtractConstraintSafely(remainingWidth, it.maxIntrinsicWidth(Integer.MAX_VALUE));
    L6:
        IntrinsicMeasurable it2 = (IntrinsicMeasurable) CollectionsKt.firstOrNull(r7);
        if (it2 == null) goto L9;
        int trailingHeight = r33.invoke(it2, Integer.valueOf(remainingWidth)).intValue();
        int remainingWidth2 = ListItemKt.access$subtractConstraintSafely(remainingWidth, it2.maxIntrinsicWidth(Integer.MAX_VALUE));
    L10:
        IntrinsicMeasurable r8 = (IntrinsicMeasurable) CollectionsKt.firstOrNull(r4);
        if (r8 == null) goto L13;
        int overlineHeight = r33.invoke(r8, Integer.valueOf(remainingWidth2)).intValue();
    L14:
        IntrinsicMeasurable r9 = (IntrinsicMeasurable) CollectionsKt.firstOrNull(r2);
        if (r9 == null) goto L17;
        int headlineHeight = r33.invoke(r9, Integer.valueOf(remainingWidth2)).intValue();
    L18:
        IntrinsicMeasurable r10 = (IntrinsicMeasurable) CollectionsKt.firstOrNull(r5);
        if (r10 == null) goto L21;
        int supportingHeight = r33.invoke(r10, Integer.valueOf(remainingWidth2)).intValue();
    L22:
        boolean isSupportingMultiline = ListItemKt.access$isSupportingMultilineHeuristic($this$calculateIntrinsicHeight, supportingHeight);
        ListItemType.Companion r1 = ListItemType.Companion;
        if (overlineHeight > 0) goto L26;
        r3 = false;
    L26:
        int headlineHeight2 = headlineHeight;
        if (supportingHeight <= 0) goto L29;
        boolean r11 = true;
    L30:
        int listItemType = r1.m2343invokeZLSjz4$material3_release(r3, r11, isSupportingMultiline);
        float arg0$iv2 = ListItemKt.m2327access$verticalPaddingyh95HIg(listItemType);
        int leadingHeight2 = $this$calculateIntrinsicHeight.mo370roundToPx0680j_4(Dp.m6973constructorimpl(2 * arg0$iv2));
        return ListItemKt.m2325access$calculateHeightN4Jib3Y($this$calculateIntrinsicHeight, leadingHeight, trailingHeight, headlineHeight2, overlineHeight, supportingHeight, listItemType, leadingHeight2, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
    L29:
        r11 = false;
        goto L30
    L21:
        supportingHeight = 0;
        goto L22
    L17:
        headlineHeight = 0;
        goto L18
    L13:
        overlineHeight = 0;
        goto L14
    L9:
        trailingHeight = 0;
        remainingWidth2 = remainingWidth;
        goto L10
    L5:
        leadingHeight = 0;
        goto L6
    }
}
