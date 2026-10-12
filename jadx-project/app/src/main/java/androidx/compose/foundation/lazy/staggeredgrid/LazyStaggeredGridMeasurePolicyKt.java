package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: LazyStaggeredGridMeasurePolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u007f\u0010\u0000\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\b\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a)\u0010\u001c\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002¢\u0006\u0002\u0010\u001f\u001a)\u0010 \u001a\u00020\u0012*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002¢\u0006\u0002\u0010\u001f\u001a!\u0010!\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0002¢\u0006\u0002\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"rememberStaggeredGridMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "Lkotlin/ExtensionFunctionType;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacing", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "slots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "rememberStaggeredGridMeasurePolicy-qKj4JfE", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;FFLkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "afterPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/unit/LayoutDirection;)F", "beforePadding", "startPadding", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/unit/LayoutDirection;)F", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyStaggeredGridMeasurePolicyKt {

    /* JADX INFO: compiled from: LazyStaggeredGridMeasurePolicy.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[Orientation.values().length];
            r0[Orientation.Vertical.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L11:
            r0[Orientation.Horizontal.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L9:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public static final /* synthetic */ float access$afterPadding(PaddingValues $receiver, Orientation orientation, boolean reverseLayout, LayoutDirection layoutDirection) {
        return afterPadding($receiver, orientation, reverseLayout, layoutDirection);
    }

    public static final /* synthetic */ float access$beforePadding(PaddingValues $receiver, Orientation orientation, boolean reverseLayout, LayoutDirection layoutDirection) {
        return beforePadding($receiver, orientation, reverseLayout, layoutDirection);
    }

    public static final /* synthetic */ float access$startPadding(PaddingValues $receiver, Orientation orientation, LayoutDirection layoutDirection) {
        return startPadding($receiver, orientation, layoutDirection);
    }

    /* JADX INFO: renamed from: rememberStaggeredGridMeasurePolicy-qKj4JfE, reason: not valid java name */
    public static final Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> m944rememberStaggeredGridMeasurePolicyqKj4JfE(LazyStaggeredGridState state, Function0<? extends LazyStaggeredGridItemProvider> r20, PaddingValues contentPadding, boolean reverseLayout, Orientation orientation, float mainAxisSpacing, float crossAxisSpacing, final CoroutineScope coroutineScope, final LazyGridStaggeredGridSlotsProvider slots, final GraphicsContext graphicsContext, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1630140849, "C(rememberStaggeredGridMeasurePolicy)P(9,4!1,7,6,5:c#ui.unit.Dp,2:c#ui.unit.Dp!1,8)51@2177L3700:LazyStaggeredGridMeasurePolicy.kt#fzvcnm");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1630140849, $changed, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridMeasurePolicy (LazyStaggeredGridMeasurePolicy.kt:51)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, -1650675013, "CC(remember):LazyStaggeredGridMeasurePolicy.kt#9igjgp");
        boolean r4 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L10;
        final LazyStaggeredGridState r7 = state;
        if ($composer.changed(r7) == false) goto L12;
    L13:
        boolean r2 = true;
    L16:
        if ((($changed & 112) ^ 48) <= 32) goto L20;
        final Function0<? extends LazyStaggeredGridItemProvider> r10 = r20;
        if ($composer.changed(r10) == false) goto L22;
    L23:
        boolean r3 = true;
    L25:
        boolean r5 = r2 | r3;
        if ((($changed & 896) ^ 384) <= 256) goto L30;
        final PaddingValues r11 = contentPadding;
        if ($composer.changed(r11) == false) goto L32;
    L33:
        boolean r6 = true;
    L35:
        boolean r8 = r5 | r6;
        if ((($changed & 7168) ^ 3072) <= 2048) goto L40;
        final boolean r12 = reverseLayout;
        if ($composer.changed(r12) == false) goto L42;
    L43:
        boolean r9 = true;
    L45:
        boolean r13 = r8 | r9;
        if (((57344 & $changed) ^ 24576) <= 16384) goto L50;
        final Orientation r14 = orientation;
        if ($composer.changed(r14) == false) goto L52;
    L53:
        boolean r15 = true;
    L55:
        boolean r16 = r13 | r15;
        if (((458752 & $changed) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) goto L60;
        final float r17 = mainAxisSpacing;
        if ($composer.changed(r17) == false) goto L62;
    L63:
        boolean r18 = true;
    L65:
        boolean r19 = r16 | r18;
        if (((3670016 & $changed) ^ 1572864) <= 1048576) goto L72;
        if ($composer.changed(crossAxisSpacing) == false) goto L72;
    L73:
        boolean r21 = true;
    L75:
        boolean r22 = r19 | r21;
        if (((234881024 & $changed) ^ 100663296) <= 67108864) goto L82;
        if ($composer.changed(slots) == false) goto L82;
    L83:
        r4 = true;
    L84:
        boolean invalid$iv = (r22 | r4) | $composer.changed(graphicsContext);
        Object value$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L87;
    L90:
        value$iv = new LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1(r7, r14, slots, r10, r11, r12, r17, coroutineScope, graphicsContext);
        $composer.updateRememberedValue(value$iv);
    L91:
        Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> r23 = (Function2) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L94;
        ComposerKt.traceEventEnd();
    L94:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r23;
    L87:
        if (value$iv != Composer.Companion.getEmpty()) goto L91;
    L82:
        if ((100663296 & $changed) != 67108864) goto L84;
    L72:
        if ((1572864 & $changed) == 1048576) goto L73;
        r21 = false;
    L62:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) goto L63;
        r18 = false;
        goto L65
    L60:
        r17 = mainAxisSpacing;
    L52:
        if (($changed & 24576) == 16384) goto L53;
        r15 = false;
        goto L55
    L50:
        r14 = orientation;
    L42:
        if (($changed & 3072) == 2048) goto L43;
        r9 = false;
        goto L45
    L40:
        r12 = reverseLayout;
    L32:
        if (($changed & 384) == 256) goto L33;
        r6 = false;
        goto L35
    L30:
        r11 = contentPadding;
    L22:
        if (($changed & 48) == 32) goto L23;
        r3 = false;
        goto L25
    L20:
        r10 = r20;
    L12:
        if (($changed & 6) == 4) goto L13;
        r2 = false;
        goto L16
    L10:
        r7 = state;
        goto L12
    }

    private static final float startPadding(PaddingValues $this$startPadding, Orientation orientation, LayoutDirection layoutDirection) {
        switch(WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()]) {
            case 1: goto L8;
            case 2: goto L9;
            default: goto L5;
        };
    L5:
        throw new NoWhenBranchMatchedException();
    L9:
        return $this$startPadding.mo677calculateTopPaddingD9Ej5fM();
    L8:
        return PaddingKt.calculateStartPadding($this$startPadding, layoutDirection);
    }

    private static final float beforePadding(PaddingValues $this$beforePadding, Orientation orientation, boolean reverseLayout, LayoutDirection layoutDirection) {
        switch(WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()]) {
            case 1: goto L9;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        if (reverseLayout == false) goto L14;
        return PaddingKt.calculateEndPadding($this$beforePadding, layoutDirection);
    L14:
        return PaddingKt.calculateStartPadding($this$beforePadding, layoutDirection);
    L9:
        if (reverseLayout == false) goto L12;
        return $this$beforePadding.mo674calculateBottomPaddingD9Ej5fM();
    L12:
        return $this$beforePadding.mo677calculateTopPaddingD9Ej5fM();
    L5:
        throw new NoWhenBranchMatchedException();
    }

    private static final float afterPadding(PaddingValues $this$afterPadding, Orientation orientation, boolean reverseLayout, LayoutDirection layoutDirection) {
        switch(WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()]) {
            case 1: goto L9;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        if (reverseLayout == false) goto L14;
        return PaddingKt.calculateStartPadding($this$afterPadding, layoutDirection);
    L14:
        return PaddingKt.calculateEndPadding($this$afterPadding, layoutDirection);
    L9:
        if (reverseLayout == false) goto L12;
        return $this$afterPadding.mo677calculateTopPaddingD9Ej5fM();
    L12:
        return $this$afterPadding.mo674calculateBottomPaddingD9Ej5fM();
    L5:
        throw new NoWhenBranchMatchedException();
    }
}
