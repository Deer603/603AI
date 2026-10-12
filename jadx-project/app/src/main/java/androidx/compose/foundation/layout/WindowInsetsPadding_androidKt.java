package androidx.compose.foundation.layout;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: WindowInsetsPadding.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u000b\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\f\u001a\u00020\u0001*\u00020\u0001\u001aC\u0010\r\u001a\u00020\u0001*\u00020\u00012\u0019\b\b\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\b\u00122\u0019\b\u0004\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u000f¢\u0006\u0002\b\u0012H\u0083\b¨\u0006\u0016"}, d2 = {"captionBarPadding", "Landroidx/compose/ui/Modifier;", "displayCutoutPadding", "imePadding", "mandatorySystemGesturesPadding", "navigationBarsPadding", "safeContentPadding", "safeDrawingPadding", "safeGesturesPadding", "statusBarsPadding", "systemBarsPadding", "systemGesturesPadding", "waterfallPadding", "windowInsetsPadding", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "insetsCalculation", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "Landroidx/compose/foundation/layout/WindowInsets;", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class WindowInsetsPadding_androidKt {
    public static final Modifier safeDrawingPadding(Modifier $this$safeDrawingPadding) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new WindowInsetsPadding_androidKt$safeDrawingPadding$$inlined$debugInspectorInfo$1();
    L7:
        return ComposedModifierKt.composed($this$safeDrawingPadding, r1, new WindowInsetsPadding_androidKt$safeDrawingPadding$$inlined$windowInsetsPadding$1());
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    public static final Modifier safeGesturesPadding(Modifier $this$safeGesturesPadding) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new WindowInsetsPadding_androidKt$safeGesturesPadding$$inlined$debugInspectorInfo$1();
    L7:
        return ComposedModifierKt.composed($this$safeGesturesPadding, r1, new WindowInsetsPadding_androidKt$safeGesturesPadding$$inlined$windowInsetsPadding$1());
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    public static final Modifier safeContentPadding(Modifier $this$safeContentPadding) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new WindowInsetsPadding_androidKt$safeContentPadding$$inlined$debugInspectorInfo$1();
    L7:
        return ComposedModifierKt.composed($this$safeContentPadding, r1, new WindowInsetsPadding_androidKt$safeContentPadding$$inlined$windowInsetsPadding$1());
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    public static final Modifier systemBarsPadding(Modifier $this$systemBarsPadding) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new WindowInsetsPadding_androidKt$systemBarsPadding$$inlined$debugInspectorInfo$1();
    L7:
        return ComposedModifierKt.composed($this$systemBarsPadding, r1, new WindowInsetsPadding_androidKt$systemBarsPadding$$inlined$windowInsetsPadding$1());
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    public static final Modifier displayCutoutPadding(Modifier $this$displayCutoutPadding) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$debugInspectorInfo$1();
    L7:
        return ComposedModifierKt.composed($this$displayCutoutPadding, r1, new WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$windowInsetsPadding$1());
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    public static final Modifier statusBarsPadding(Modifier $this$statusBarsPadding) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$debugInspectorInfo$1();
    L7:
        return ComposedModifierKt.composed($this$statusBarsPadding, r1, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1());
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    public static final Modifier imePadding(Modifier $this$imePadding) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new WindowInsetsPadding_androidKt$imePadding$$inlined$debugInspectorInfo$1();
    L7:
        return ComposedModifierKt.composed($this$imePadding, r1, new WindowInsetsPadding_androidKt$imePadding$$inlined$windowInsetsPadding$1());
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    public static final Modifier navigationBarsPadding(Modifier $this$navigationBarsPadding) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$debugInspectorInfo$1();
    L7:
        return ComposedModifierKt.composed($this$navigationBarsPadding, r1, new WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$windowInsetsPadding$1());
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    public static final Modifier captionBarPadding(Modifier $this$captionBarPadding) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new WindowInsetsPadding_androidKt$captionBarPadding$$inlined$debugInspectorInfo$1();
    L7:
        return ComposedModifierKt.composed($this$captionBarPadding, r1, new WindowInsetsPadding_androidKt$captionBarPadding$$inlined$windowInsetsPadding$1());
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    public static final Modifier waterfallPadding(Modifier $this$waterfallPadding) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new WindowInsetsPadding_androidKt$waterfallPadding$$inlined$debugInspectorInfo$1();
    L7:
        return ComposedModifierKt.composed($this$waterfallPadding, r1, new WindowInsetsPadding_androidKt$waterfallPadding$$inlined$windowInsetsPadding$1());
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    public static final Modifier systemGesturesPadding(Modifier $this$systemGesturesPadding) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new WindowInsetsPadding_androidKt$systemGesturesPadding$$inlined$debugInspectorInfo$1();
    L7:
        return ComposedModifierKt.composed($this$systemGesturesPadding, r1, new WindowInsetsPadding_androidKt$systemGesturesPadding$$inlined$windowInsetsPadding$1());
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    public static final Modifier mandatorySystemGesturesPadding(Modifier $this$mandatorySystemGesturesPadding) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new WindowInsetsPadding_androidKt$mandatorySystemGesturesPadding$$inlined$debugInspectorInfo$1();
    L7:
        return ComposedModifierKt.composed($this$mandatorySystemGesturesPadding, r1, new WindowInsetsPadding_androidKt$mandatorySystemGesturesPadding$$inlined$windowInsetsPadding$1());
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    private static final Modifier windowInsetsPadding(Modifier $this$windowInsetsPadding, Function1<? super InspectorInfo, Unit> r3, final Function1<? super WindowInsetsHolder, ? extends WindowInsets> r4) {
        return ComposedModifierKt.composed($this$windowInsetsPadding, r3, new AnonymousClass1(r4));
    }
}
