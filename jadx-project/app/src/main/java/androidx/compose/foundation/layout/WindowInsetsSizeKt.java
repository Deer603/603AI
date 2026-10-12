package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: WindowInsetsSize.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0007"}, d2 = {"windowInsetsBottomHeight", "Landroidx/compose/ui/Modifier;", "insets", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsetsEndWidth", "windowInsetsStartWidth", "windowInsetsTopHeight", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class WindowInsetsSizeKt {
    public static final Modifier windowInsetsStartWidth(Modifier $this$windowInsetsStartWidth, final WindowInsets insets) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new WindowInsetsSizeKt$windowInsetsStartWidth$$inlined$debugInspectorInfo$1(insets);
    L7:
        return $this$windowInsetsStartWidth.then(new DerivedWidthModifier(insets, r2, C02922.INSTANCE));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    public static final Modifier windowInsetsEndWidth(Modifier $this$windowInsetsEndWidth, final WindowInsets insets) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new WindowInsetsSizeKt$windowInsetsEndWidth$$inlined$debugInspectorInfo$1(insets);
    L7:
        return $this$windowInsetsEndWidth.then(new DerivedWidthModifier(insets, r2, C02912.INSTANCE));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    public static final Modifier windowInsetsTopHeight(Modifier $this$windowInsetsTopHeight, final WindowInsets insets) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new WindowInsetsSizeKt$windowInsetsTopHeight$$inlined$debugInspectorInfo$1(insets);
    L7:
        return $this$windowInsetsTopHeight.then(new DerivedHeightModifier(insets, r2, C02932.INSTANCE));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    public static final Modifier windowInsetsBottomHeight(Modifier $this$windowInsetsBottomHeight, final WindowInsets insets) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new WindowInsetsSizeKt$windowInsetsBottomHeight$$inlined$debugInspectorInfo$1(insets);
    L7:
        return $this$windowInsetsBottomHeight.then(new DerivedHeightModifier(insets, r2, AnonymousClass2.INSTANCE));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }
}
