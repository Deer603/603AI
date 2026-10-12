package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import androidx.compose.ui.node.TouchBoundsExpansionKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: StylusHandwriting.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a*\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\"\u0016\u0010\t\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007¨\u0006\u0013"}, d2 = {"HandwritingBoundsExpansion", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "getHandwritingBoundsExpansion", "()Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "HandwritingBoundsHorizontalOffset", "Landroidx/compose/ui/unit/Dp;", "getHandwritingBoundsHorizontalOffset", "()F", "F", "HandwritingBoundsVerticalOffset", "getHandwritingBoundsVerticalOffset", "stylusHandwriting", "Landroidx/compose/ui/Modifier;", "enabled", "", "showHoverIcon", "onHandwritingSlopExceeded", "Lkotlin/Function0;", "", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class StylusHandwritingKt {
    private static final DpTouchBoundsExpansion HandwritingBoundsExpansion = null;
    private static final float HandwritingBoundsHorizontalOffset = 0.0f;
    private static final float HandwritingBoundsVerticalOffset = 0.0f;

    public static final Modifier stylusHandwriting(Modifier $this$stylusHandwriting, boolean enabled, boolean showHoverIcon, Function0<Unit> r6) {
        if (enabled == false) goto L10;
        if (StylusHandwriting_androidKt.isStylusHandwritingSupported() == false) goto L10;
        if (showHoverIcon == false) goto L7;
        Modifier r0 = PointerIconKt.stylusHoverIcon($this$stylusHandwriting, TextPointerIcon_androidKt.getHandwritingPointerIcon(), false, HandwritingBoundsExpansion);
    L11:
        return r0.then(new StylusHandwritingElement(r6));
    L7:
        r0 = $this$stylusHandwriting;
    L10:
        return $this$stylusHandwriting;
    }

    static {
        HandwritingBoundsVerticalOffset = Dp.m6973constructorimpl(40);
        HandwritingBoundsHorizontalOffset = Dp.m6973constructorimpl(10);
        HandwritingBoundsExpansion = TouchBoundsExpansionKt.m6072DpTouchBoundsExpansiona9UjIt4(HandwritingBoundsHorizontalOffset, HandwritingBoundsVerticalOffset, HandwritingBoundsHorizontalOffset, HandwritingBoundsVerticalOffset);
    }

    public static final float getHandwritingBoundsVerticalOffset() {
        return HandwritingBoundsVerticalOffset;
    }

    public static final float getHandwritingBoundsHorizontalOffset() {
        return HandwritingBoundsHorizontalOffset;
    }

    public static final DpTouchBoundsExpansion getHandwritingBoundsExpansion() {
        return HandwritingBoundsExpansion;
    }
}
