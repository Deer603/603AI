package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: AspectRatio.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a&\u0010\u0006\u001a\u00020\u0005*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"aspectRatio", "Landroidx/compose/ui/Modifier;", "ratio", "", "matchHeightConstraintsFirst", "", "isSatisfiedBy", "Landroidx/compose/ui/unit/Constraints;", "width", "", "height", "isSatisfiedBy-NN6Ew-U", "(JII)Z", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AspectRatioKt {
    public static /* synthetic */ Modifier aspectRatio$default(Modifier r0, float r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return aspectRatio(r0, r1, r2);
    }

    public static final Modifier aspectRatio(Modifier $this$aspectRatio, final float ratio, final boolean matchHeightConstraintsFirst) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new AspectRatioKt$aspectRatio$$inlined$debugInspectorInfo$1(ratio, matchHeightConstraintsFirst);
    L7:
        return $this$aspectRatio.then(new AspectRatioElement(ratio, matchHeightConstraintsFirst, r2));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    /* JADX INFO: renamed from: isSatisfiedBy-NN6Ew-U, reason: not valid java name */
    public static final boolean m623isSatisfiedByNN6EwU(long $this$isSatisfiedBy_u2dNN6Ew_u2dU, int width, int height) {
        int r0 = Constraints.m6928getMinWidthimpl($this$isSatisfiedBy_u2dNN6Ew_u2dU);
        if (width > Constraints.m6926getMaxWidthimpl($this$isSatisfiedBy_u2dNN6Ew_u2dU)) goto L6;
        if (r0 > width) goto L6;
        boolean r1 = true;
    L7:
        if (r1 == false) goto L16;
        int r2 = Constraints.m6927getMinHeightimpl($this$isSatisfiedBy_u2dNN6Ew_u2dU);
        if (height > Constraints.m6925getMaxHeightimpl($this$isSatisfiedBy_u2dNN6Ew_u2dU)) goto L12;
        if (r2 > height) goto L12;
        boolean r3 = true;
    L13:
        if (r3 == false) goto L16;
        return true;
    L12:
        r3 = false;
    L16:
        return false;
    L6:
        r1 = false;
        goto L7
    }
}
