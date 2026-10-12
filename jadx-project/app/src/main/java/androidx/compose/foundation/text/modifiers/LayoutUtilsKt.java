package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: LayoutUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u001a2\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a2\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"isEllipsis", "", "Landroidx/compose/ui/text/style/TextOverflow;", "isEllipsis-MW5-ApA", "(I)Z", "finalConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "softWrap", "overflow", "maxIntrinsicWidth", "", "finalConstraints-tfFHcEY", "(JZIF)J", "finalMaxLines", "", "maxLinesIn", "finalMaxLines-xdlQI24", "(ZII)I", "finalMaxWidth", "finalMaxWidth-tfFHcEY", "(JZIF)I", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LayoutUtilsKt {
    /* JADX INFO: renamed from: finalConstraints-tfFHcEY, reason: not valid java name */
    public static final long m1395finalConstraintstfFHcEY(long constraints, boolean softWrap, int overflow, float maxIntrinsicWidth) {
        return Constraints.Companion.m6935fitPrioritizingWidthZbe2FdA(0, m1397finalMaxWidthtfFHcEY(constraints, softWrap, overflow, maxIntrinsicWidth), 0, Constraints.m6925getMaxHeightimpl(constraints));
    }

    /* JADX INFO: renamed from: finalMaxWidth-tfFHcEY, reason: not valid java name */
    public static final int m1397finalMaxWidthtfFHcEY(long constraints, boolean softWrap, int overflow, float maxIntrinsicWidth) {
        if (softWrap == false) goto L4;
    L7:
        boolean widthMatters = true;
    L8:
        if (widthMatters == true) goto L10;
    L12:
        int maxWidth = Integer.MAX_VALUE;
    L14:
        if (Constraints.m6928getMinWidthimpl(constraints) != maxWidth) goto L17;
        return maxWidth;
    L17:
        return RangesKt.coerceIn(TextDelegateKt.ceilToIntPx(maxIntrinsicWidth), Constraints.m6928getMinWidthimpl(constraints), maxWidth);
    L10:
        if (Constraints.m6922getHasBoundedWidthimpl(constraints) == false) goto L12;
        maxWidth = Constraints.m6926getMaxWidthimpl(constraints);
        goto L14
    L4:
        if (m1398isEllipsisMW5ApA(overflow) == true) goto L7;
        widthMatters = false;
        goto L8
    }

    /* JADX INFO: renamed from: finalMaxLines-xdlQI24, reason: not valid java name */
    public static final int m1396finalMaxLinesxdlQI24(boolean softWrap, int overflow, int maxLinesIn) {
        if (softWrap == false) goto L5;
    L7:
        boolean overwriteMaxLines = false;
    L8:
        if (overwriteMaxLines == false) goto L11;
        return 1;
    L11:
        return RangesKt.coerceAtLeast(maxLinesIn, 1);
    L5:
        if (m1398isEllipsisMW5ApA(overflow) == false) goto L7;
        overwriteMaxLines = true;
        goto L8
    }

    /* JADX INFO: renamed from: isEllipsis-MW5-ApA, reason: not valid java name */
    public static final boolean m1398isEllipsisMW5ApA(int $this$isEllipsis) {
        if (TextOverflow.m6877equalsimpl0($this$isEllipsis, TextOverflow.Companion.m6887getEllipsisgIe3tQ8()) == false) goto L5;
    L10:
        return true;
    L5:
        if (TextOverflow.m6877equalsimpl0($this$isEllipsis, TextOverflow.Companion.m6889getStartEllipsisgIe3tQ8()) == true) goto L10;
        if (TextOverflow.m6877equalsimpl0($this$isEllipsis, TextOverflow.Companion.m6888getMiddleEllipsisgIe3tQ8()) == true) goto L10;
        return false;
    }
}
