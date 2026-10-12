package androidx.compose.foundation.layout;

import androidx.autofill.HintConstants;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: WindowInsetsPadding.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0007\u001a/\u0010\n\u001a\u00020\u0006*\u00020\u00062!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\fH\u0007\u001a\n\u0010\u0011\u001a\u00020\u0006*\u00020\u0006\u001a\u0014\u0010\u0012\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0007\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0013"}, d2 = {"ModifierLocalConsumedWindowInsets", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "Landroidx/compose/foundation/layout/WindowInsets;", "getModifierLocalConsumedWindowInsets", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "consumeWindowInsets", "Landroidx/compose/ui/Modifier;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "insets", "onConsumedWindowInsetsChanged", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "consumedWindowInsets", "", "recalculateWindowInsets", "windowInsetsPadding", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class WindowInsetsPaddingKt {
    private static final ProvidableModifierLocal<WindowInsets> ModifierLocalConsumedWindowInsets = null;

    public static final Modifier windowInsetsPadding(Modifier $this$windowInsetsPadding, final WindowInsets insets) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new WindowInsetsPaddingKt$windowInsetsPadding$$inlined$debugInspectorInfo$1(insets);
    L7:
        return ComposedModifierKt.composed($this$windowInsetsPadding, r1, new C02902(insets));
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    public static final Modifier consumeWindowInsets(Modifier $this$consumeWindowInsets, final WindowInsets insets) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new WindowInsetsPaddingKt$consumeWindowInsets$$inlined$debugInspectorInfo$1(insets);
    L7:
        return ComposedModifierKt.composed($this$consumeWindowInsets, r1, new AnonymousClass2(insets));
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    public static final Modifier consumeWindowInsets(Modifier $this$consumeWindowInsets, final PaddingValues paddingValues) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new WindowInsetsPaddingKt$consumeWindowInsets$$inlined$debugInspectorInfo$2(paddingValues);
    L7:
        return ComposedModifierKt.composed($this$consumeWindowInsets, r1, new AnonymousClass4(paddingValues));
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    public static final Modifier onConsumedWindowInsetsChanged(Modifier $this$onConsumedWindowInsetsChanged, final Function1<? super WindowInsets, Unit> r3) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$$inlined$debugInspectorInfo$1(r3);
    L7:
        return ComposedModifierKt.composed($this$onConsumedWindowInsetsChanged, r1, new C02892(r3));
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    public static final Modifier recalculateWindowInsets(Modifier $this$recalculateWindowInsets) {
        return $this$recalculateWindowInsets.then(RecalculateWindowInsetsModifierElement.INSTANCE);
    }

    static {
        ModifierLocalConsumedWindowInsets = ModifierLocalKt.modifierLocalOf(WindowInsetsPaddingKt$ModifierLocalConsumedWindowInsets$1.INSTANCE);
    }

    public static final ProvidableModifierLocal<WindowInsets> getModifierLocalConsumedWindowInsets() {
        return ModifierLocalConsumedWindowInsets;
    }
}
