package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: SheetDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\rH\u0000\u001aA\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00140\r2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0014H\u0001¢\u0006\u0002\u0010\u0019\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u001a"}, d2 = {"BottomSheetAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "DragHandleVerticalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "sheetState", "Landroidx/compose/material3/SheetState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "onFling", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "velocity", "", "rememberSheetState", "skipPartiallyExpanded", "", "confirmValueChange", "Landroidx/compose/material3/SheetValue;", "initialValue", "skipHiddenState", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/material3/SheetValue;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SheetDefaultsKt {
    private static final AnimationSpec<Float> BottomSheetAnimationSpec = null;
    private static final float DragHandleVerticalPadding = 0.0f;

    public static final /* synthetic */ AnimationSpec access$getBottomSheetAnimationSpec$p() {
        return BottomSheetAnimationSpec;
    }

    public static final /* synthetic */ float access$getDragHandleVerticalPadding$p() {
        return DragHandleVerticalPadding;
    }

    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(final SheetState sheetState, final Orientation orientation, final Function1<? super Float, Unit> r3) {
        return new AnonymousClass1(sheetState, r3, orientation);
    }

    public static final SheetState rememberSheetState(boolean skipPartiallyExpanded, Function1<? super SheetValue, Boolean> r17, SheetValue initialValue, boolean skipHiddenState, Composer $composer, int $changed, int r22) {
        ComposerKt.sourceInformationMarkerStart($composer, 1032784200, "C(rememberSheetState)P(3)408@15981L7,420@16374L180,409@16000L554:SheetDefaults.kt#uh7d8r");
        if ((r22 & 1) == 0) goto L5;
        final boolean skipPartiallyExpanded2 = false;
    L7:
        if ((r22 & 2) == 0) goto L9;
        final Function1<? super SheetValue, Boolean> r12 = C05541.INSTANCE;
    L11:
        if ((r22 & 4) == 0) goto L13;
        final SheetValue initialValue2 = SheetValue.Hidden;
    L15:
        if ((r22 & 8) == 0) goto L17;
        final boolean skipHiddenState2 = false;
    L19:
        if (ComposerKt.isTraceInProgress() == false) goto L21;
        ComposerKt.traceEventStart(1032784200, $changed, -1, "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:407)");
    L21:
        ProvidableCompositionLocal<Density> r0 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        final Density density = (Density) r3;
        Object[] r1 = {Boolean.valueOf(skipPartiallyExpanded2), r12, Boolean.valueOf(skipHiddenState2)};
        Saver<SheetState, SheetValue> r2 = SheetState.Companion.Saver(skipPartiallyExpanded2, r12, density, skipHiddenState2);
        ComposerKt.sourceInformationMarkerStart($composer, -349419818, "CC(remember):SheetDefaults.kt#9igjgp");
        boolean r5 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L26;
        if ($composer.changed(skipPartiallyExpanded2) == false) goto L26;
    L27:
        boolean r4 = true;
    L29:
        boolean r6 = r4 | $composer.changed(density);
        if ((($changed & 896) ^ 384) <= 256) goto L34;
        if ($composer.changed(initialValue2) == false) goto L34;
    L35:
        boolean r7 = true;
    L37:
        boolean r8 = r6 | r7;
        if ((($changed & 112) ^ 48) <= 32) goto L42;
        if ($composer.changed(r12) == false) goto L42;
    L43:
        boolean r9 = true;
    L45:
        boolean r10 = r8 | r9;
        if ((($changed & 7168) ^ 3072) <= 2048) goto L50;
        if ($composer.changed(skipHiddenState2) == false) goto L50;
    L51:
        r5 = true;
    L52:
        boolean invalid$iv = r10 | r5;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L55;
    L58:
        Object value$iv = (Function0) new SheetDefaultsKt$rememberSheetState$2$1(skipPartiallyExpanded2, density, initialValue2, r12, skipHiddenState2);
        $composer.updateRememberedValue(value$iv);
    L59:
        ComposerKt.sourceInformationMarkerEnd($composer);
        SheetState r11 = (SheetState) RememberSaveableKt.m3923rememberSaveable(r1, r2, null, (Function0) value$iv, $composer, 0, 4);
        if (ComposerKt.isTraceInProgress() == false) goto L62;
        ComposerKt.traceEventEnd();
    L62:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r11;
    L55:
        if (it$iv == Composer.Companion.getEmpty()) goto L58;
        value$iv = it$iv;
    L50:
        if (($changed & 3072) != 2048) goto L52;
    L42:
        if (($changed & 48) == 32) goto L43;
        r9 = false;
    L34:
        if (($changed & 384) == 256) goto L35;
        r7 = false;
    L26:
        if (($changed & 6) == 4) goto L27;
        r4 = false;
        goto L29
    L17:
        skipHiddenState2 = skipHiddenState;
        goto L19
    L13:
        initialValue2 = initialValue;
        goto L15
    L9:
        r12 = r17;
        goto L11
    L5:
        skipPartiallyExpanded2 = skipPartiallyExpanded;
        goto L7
    }

    static {
        DragHandleVerticalPadding = Dp.m6973constructorimpl(22);
        BottomSheetAnimationSpec = AnimationSpecKt.tween$default(AnimationConstants.DefaultDurationMillis, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    }
}
