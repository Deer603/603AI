package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;

/* JADX INFO: compiled from: ModifierUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"maxWidthForTextLayout", "", "Landroidx/compose/ui/unit/Constraints;", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "maxWidthForTextLayout-R2G3SPE", "(JZI)I", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ModifierUtilsKt {
    /* JADX INFO: renamed from: maxWidthForTextLayout-R2G3SPE, reason: not valid java name */
    public static final int m1400maxWidthForTextLayoutR2G3SPE(long $this$maxWidthForTextLayout_u2dR2G3SPE, boolean softWrap, int overflow) {
        if (softWrap == false) goto L4;
    L7:
        boolean widthMatters = true;
    L8:
        if (widthMatters == true) goto L10;
    L12:
        return Integer.MAX_VALUE;
    L10:
        if (Constraints.m6922getHasBoundedWidthimpl($this$maxWidthForTextLayout_u2dR2G3SPE) == false) goto L12;
        int maxWidth = Constraints.m6926getMaxWidthimpl($this$maxWidthForTextLayout_u2dR2G3SPE);
        return maxWidth;
    L4:
        if (TextOverflow.m6877equalsimpl0(overflow, TextOverflow.Companion.m6887getEllipsisgIe3tQ8()) == true) goto L7;
        widthMatters = false;
        goto L8
    }
}
