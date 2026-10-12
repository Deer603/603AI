package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextLayoutHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ar\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0014\u0010\u001a\u001a\u00020\u001b*\u00020\u00022\u0006\u0010\u001c\u001a\u00020\fH\u0000\u001a(\u0010\u001d\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0000ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"canReuse", "", "Landroidx/compose/ui/text/TextLayoutResult;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "maxLines", "", "softWrap", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "canReuse-7_7YC6M", "(Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;J)Z", "getLineHeight", "", "offset", "isPositionInsideSelection", "position", "Landroidx/compose/ui/geometry/Offset;", "selectionRange", "Landroidx/compose/ui/text/TextRange;", "isPositionInsideSelection-uaM50fQ", "(Landroidx/compose/ui/text/TextLayoutResult;JLandroidx/compose/ui/text/TextRange;)Z", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextLayoutHelperKt {
    /* JADX INFO: renamed from: canReuse-7_7YC6M, reason: not valid java name */
    public static final boolean m1161canReuse7_7YC6M(TextLayoutResult $this$canReuse_u2d7_7YC6M, AnnotatedString text, TextStyle style, List<AnnotatedString.Range<Placeholder>> r18, int maxLines, boolean softWrap, int overflow, Density density, LayoutDirection layoutDirection, FontFamily.Resolver fontFamilyResolver, long constraints) {
        TextLayoutInput layoutInput = $this$canReuse_u2d7_7YC6M.getLayoutInput();
        if ($this$canReuse_u2d7_7YC6M.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() == false) goto L6;
        return false;
    L6:
        if (Intrinsics.areEqual(layoutInput.getText(), text) == false) goto L47;
        if (layoutInput.getStyle().hasSameLayoutAffectingAttributes(style) == false) goto L47;
        if (Intrinsics.areEqual(layoutInput.getPlaceholders(), r18) == false) goto L47;
        if (layoutInput.getMaxLines() != maxLines) goto L47;
        if (layoutInput.getSoftWrap() != softWrap) goto L47;
        if (TextOverflow.m6877equalsimpl0(layoutInput.m6384getOverflowgIe3tQ8(), overflow) == false) goto L47;
        if (Intrinsics.areEqual(layoutInput.getDensity(), density) == false) goto L47;
        if (layoutInput.getLayoutDirection() != layoutDirection) goto L47;
        if (Intrinsics.areEqual(layoutInput.getFontFamilyResolver(), fontFamilyResolver) == false) goto L47;
        if (Constraints.m6928getMinWidthimpl(constraints) == Constraints.m6928getMinWidthimpl(layoutInput.m6383getConstraintsmsEJaDk())) goto L28;
        return false;
    L28:
        if (softWrap == true) goto L33;
        if (TextOverflow.m6877equalsimpl0(overflow, TextOverflow.Companion.m6887getEllipsisgIe3tQ8()) == true) goto L33;
        return true;
    L33:
        if (Constraints.m6926getMaxWidthimpl(constraints) == Constraints.m6926getMaxWidthimpl(layoutInput.m6383getConstraintsmsEJaDk())) goto L35;
        return false;
    L35:
        if (Constraints.m6925getMaxHeightimpl(constraints) == Constraints.m6925getMaxHeightimpl(layoutInput.m6383getConstraintsmsEJaDk())) goto L38;
        return false;
    L38:
        return true;
    L47:
        return false;
    }

    /* JADX INFO: renamed from: isPositionInsideSelection-uaM50fQ, reason: not valid java name */
    public static final boolean m1162isPositionInsideSelectionuaM50fQ(TextLayoutResult $this$isPositionInsideSelection_u2duaM50fQ, long position, TextRange selectionRange) {
        if (selectionRange != null) goto L5;
    L13:
        return false;
    L5:
        if (TextRange.m6411getCollapsedimpl(selectionRange.m6421unboximpl()) == true) goto L13;
        int offset = $this$isPositionInsideSelection_u2duaM50fQ.m6387getOffsetForPositionk4lQ0M(position);
        if (isPositionInsideSelection_uaM50fQ$isOffsetSelectedAndContainsPosition(selectionRange, $this$isPositionInsideSelection_u2duaM50fQ, position, offset) == false) goto L10;
    L11:
        return true;
    L10:
        if (isPositionInsideSelection_uaM50fQ$isOffsetSelectedAndContainsPosition(selectionRange, $this$isPositionInsideSelection_u2duaM50fQ, position, offset - 1) == true) goto L11;
        return false;
    }

    private static final boolean isPositionInsideSelection_uaM50fQ$isOffsetSelectedAndContainsPosition(TextRange $selectionRange, TextLayoutResult $this_isPositionInsideSelection, long $position, int offset) {
        if (TextRange.m6408containsimpl($selectionRange.m6421unboximpl(), offset) == true) goto L5;
    L7:
        return false;
    L5:
        if ($this_isPositionInsideSelection.getBoundingBox(offset).m4151containsk4lQ0M($position) == false) goto L7;
        return true;
    }

    public static final float getLineHeight(TextLayoutResult $this$getLineHeight, int offset) {
        if (offset >= 0) goto L5;
    L15:
        return 0.0f;
    L5:
        if ($this$getLineHeight.getLayoutInput().getText().length() != 0) goto L7;
        boolean r1 = true;
    L8:
        if (r1 == true) goto L15;
        int line = Math.min($this$getLineHeight.getMultiParagraph().getLineForOffset(offset), Math.min($this$getLineHeight.getMultiParagraph().getMaxLines() - 1, $this$getLineHeight.getMultiParagraph().getLineCount() - 1));
        int lineEnd = MultiParagraph.getLineEnd$default($this$getLineHeight.getMultiParagraph(), line, false, 2, null);
        if (offset <= lineEnd) goto L14;
        return 0.0f;
    L14:
        return $this$getLineHeight.getMultiParagraph().getLineHeight(line);
    L7:
        r1 = false;
        goto L8
    }
}
