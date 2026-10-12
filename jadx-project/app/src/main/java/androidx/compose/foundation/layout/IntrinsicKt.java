package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Intrinsic.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0007"}, d2 = {"height", "Landroidx/compose/ui/Modifier;", "intrinsicSize", "Landroidx/compose/foundation/layout/IntrinsicSize;", "requiredHeight", "requiredWidth", "width", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class IntrinsicKt {
    public static final Modifier width(Modifier $this$width, final IntrinsicSize intrinsicSize) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new IntrinsicKt$width$$inlined$debugInspectorInfo$1(intrinsicSize);
    L7:
        return $this$width.then(new IntrinsicWidthElement(intrinsicSize, true, r2));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    public static final Modifier height(Modifier $this$height, final IntrinsicSize intrinsicSize) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new IntrinsicKt$height$$inlined$debugInspectorInfo$1(intrinsicSize);
    L7:
        return $this$height.then(new IntrinsicHeightElement(intrinsicSize, true, r2));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    public static final Modifier requiredWidth(Modifier $this$requiredWidth, final IntrinsicSize intrinsicSize) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new IntrinsicKt$requiredWidth$$inlined$debugInspectorInfo$1(intrinsicSize);
    L7:
        return $this$requiredWidth.then(new IntrinsicWidthElement(intrinsicSize, false, r2));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    public static final Modifier requiredHeight(Modifier $this$requiredHeight, final IntrinsicSize intrinsicSize) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new IntrinsicKt$requiredHeight$$inlined$debugInspectorInfo$1(intrinsicSize);
    L7:
        return $this$requiredHeight.then(new IntrinsicHeightElement(intrinsicSize, false, r2));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }
}
