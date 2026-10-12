package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.ScrollingContainerKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.foundation.lazy.layout.StickyItemsPlacement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: LazyGrid.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0088\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0002\b\u0019H\u0001¢\u0006\u0002\u0010\u001a\u001a\u0088\u0001\u0010\u001b\u001a\u0019\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001c¢\u0006\u0002\b\u00192\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0003¢\u0006\u0002\u0010)¨\u0006*"}, d2 = {"LazyGrid", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "slots", "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "rememberLazyGridMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "stickyItemsScrollBehavior", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyGridKt {
    public static final void LazyGrid(Modifier modifier, LazyGridState state, final LazyGridSlotsProvider slots, PaddingValues contentPadding, boolean reverseLayout, final boolean isVertical, FlingBehavior flingBehavior, final boolean userScrollEnabled, final OverscrollEffect overscrollEffect, final Arrangement.Vertical verticalArrangement, final Arrangement.Horizontal horizontalArrangement, final Function1<? super LazyGridScope, Unit> r38, Composer $composer, final int $changed, final int $changed1, final int r42) {
        Composer $composer2 = $composer.startRestartGroup(708740370);
        ComposerKt.sourceInformation($composer2, "C(LazyGrid)P(5,9,8,1,7,4,2,10,6,11,3)83@3963L50,85@4039L51,87@4117L24,88@4189L7,89@4258L7,92@4299L403,125@5367L302,120@5198L1174:LazyGrid.kt#7791vq");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        int r9 = r42 & 1;
        if (r9 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r12 = modifier;
    L13:
        int r16 = 32;
        if ((r42 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        if ((r42 & 4) == 0) goto L27;
        $dirty = $dirty | 384;
    L36:
        int r13 = r42 & 8;
        if (r13 == 0) goto L40;
        $dirty = $dirty | 3072;
        PaddingValues r10 = contentPadding;
    L47:
        int r18 = r42 & 16;
        if (r18 == 0) goto L51;
        $dirty = $dirty | 24576;
        boolean r11 = reverseLayout;
    L59:
        if ((r42 & 32) == 0) goto L62;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L69:
        if (($changed & 1572864) == 0) goto L71;
        FlingBehavior flingBehavior2 = flingBehavior;
    L80:
        if ((r42 & 128) == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        if ((r42 & 256) == 0) goto L93;
        $dirty = $dirty | 100663296;
    L101:
        if ((r42 & 512) == 0) goto L104;
        $dirty = $dirty | 805306368;
    L112:
        if ((r42 & 1024) == 0) goto L115;
        $dirty1 = $dirty1 | 6;
    L123:
        if ((r42 & 2048) == 0) goto L126;
        $dirty1 = $dirty1 | 48;
    L132:
        int $dirty2 = $dirty1;
        if ((306783379 & $dirty) == 306783378) goto L135;
    L138:
        boolean r2 = true;
    L140:
        if ($composer2.shouldExecute(r2, $dirty & 1) == false) goto L186;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "71@3432L15");
        if (($changed & 1) != 0) goto L144;
    L150:
        if (r9 == 0) goto L152;
        Modifier.Companion modifier2 = Modifier.Companion;
    L153:
        if (r13 == 0) goto L155;
        PaddingValues contentPadding2 = PaddingKt.m718PaddingValues0680j_4(Dp.m6973constructorimpl(0));
    L156:
        if (r18 == 0) goto L158;
        boolean reverseLayout2 = false;
    L160:
        if ((r42 & 64) == 0) goto L162;
        $dirty = $dirty & (-3670017);
        FlingBehavior flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior($composer2, 6);
        PaddingValues contentPadding3 = contentPadding2;
        boolean reverseLayout3 = reverseLayout2;
    L163:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L166;
        ComposerKt.traceEventStart(708740370, $dirty, $dirty2, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:82)");
    L166:
        Function0<LazyGridItemProvider> r8 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(state, r38, $composer2, (($dirty >> 3) & 14) | ($dirty2 & 112));
        LazyLayoutSemanticState semanticState = LazySemanticsKt.rememberLazyGridSemanticState(state, reverseLayout3, $composer2, (($dirty >> 3) & 14) | (($dirty >> 9) & 112));
        ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart($composer2, -954203484, "CC(remember):Effects.kt#9igjgp");
        Object value$iv$iv = $composer2.rememberedValue();
        if (value$iv$iv != Composer.Companion.getEmpty()) goto L170;
        value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2);
        $composer2.updateRememberedValue(value$iv$iv);
    L170:
        CoroutineScope coroutineScope = (CoroutineScope) value$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ProvidableCompositionLocal<GraphicsContext> r1 = CompositionLocalsKt.getLocalGraphicsContext();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r14 = $composer2.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        GraphicsContext graphicsContext = (GraphicsContext) r14;
        CompositionLocal<Boolean> r3 = CompositionLocalsKt.getLocalScrollCaptureInProgress();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r15 = $composer2.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        boolean stickyHeadersEnabled = !((Boolean) r15).booleanValue();
        if (stickyHeadersEnabled == false) goto L173;
        StickyItemsPlacement r4 = StickyItemsPlacement.Companion.getStickToTopPlacement();
    L174:
        Modifier modifier3 = modifier2;
        int $dirty3 = $dirty;
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> r17 = rememberLazyGridMeasurePolicy(r8, state, slots, contentPadding3, reverseLayout3, isVertical, horizontalArrangement, verticalArrangement, coroutineScope, graphicsContext, r4, $composer2, (((((($dirty & 112) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (($dirty2 << 18) & 3670016)) | (($dirty >> 6) & 29360128), 0);
        LazyGridState r19 = state;
        PaddingValues contentPadding4 = contentPadding3;
        if (isVertical == false) goto L177;
        Orientation r5 = Orientation.Vertical;
    L178:
        Orientation orientation = r5;
        if (userScrollEnabled == false) goto L181;
        $composer2.startReplaceGroup(-1614890700);
        ComposerKt.sourceInformation($composer2, "111@4933L48");
        Modifier.Companion r6 = LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(Modifier.Companion, LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(r19, $composer2, ($dirty3 >> 3) & 14), r19.getBeyondBoundsInfo$foundation_release(), reverseLayout3, orientation);
        $composer2.endReplaceGroup();
    L182:
        Modifier beyondBoundsModifier = r6;
        boolean reverseLayout4 = reverseLayout3;
        Modifier r0 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(r19.getRemeasurementModifier$foundation_release()).then(r19.getAwaitLayoutModifier$foundation_release()), r8, semanticState, orientation, userScrollEnabled, reverseLayout4, $composer2, (($dirty3 >> 9) & 57344) | (458752 & ($dirty3 << 3)));
        Composer $composer3 = $composer2;
        FlingBehavior flingBehavior4 = flingBehavior3;
        LazyLayoutKt.LazyLayout(r8, ScrollingContainerKt.scrollingContainer$default(r0.then(beyondBoundsModifier).then(r19.getItemAnimator$foundation_release().getModifier()), r19, orientation, userScrollEnabled, reverseLayout4, flingBehavior4, r19.getInternalInteractionSource$foundation_release(), false, overscrollEffect, null, 256, null), r19.getPrefetchState$foundation_release(), r17, $composer3, 0, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L185;
        ComposerKt.traceEventEnd();
    L185:
        final FlingBehavior flingBehavior5 = flingBehavior4;
        final boolean reverseLayout5 = reverseLayout4;
        final Modifier modifier4 = modifier3;
        final PaddingValues contentPadding5 = contentPadding4;
    L187:
        ScopeUpdateScope r7 = $composer3.endRestartGroup();
        if (r7 == null) goto L191;
        final LazyGridState r20 = r19;
        r7.updateScope(new AnonymousClass1(modifier4, r20, slots, contentPadding5, reverseLayout5, isVertical, flingBehavior5, userScrollEnabled, overscrollEffect, verticalArrangement, horizontalArrangement, r38, $changed, $changed1, r42));
        return;
    L191:
        return;
    L181:
        $composer2.startReplaceGroup(-1614595456);
        $composer2.endReplaceGroup();
        r6 = Modifier.Companion;
        goto L182
    L177:
        r5 = Orientation.Horizontal;
        goto L178
    L173:
        r4 = null;
        goto L174
    L162:
        flingBehavior3 = flingBehavior2;
        contentPadding3 = contentPadding2;
        reverseLayout3 = reverseLayout2;
        goto L163
    L158:
        reverseLayout2 = r11;
        goto L160
    L155:
        contentPadding2 = r10;
        goto L156
    L152:
        modifier2 = r12;
        goto L153
    L144:
        if ($composer2.getDefaultsInvalid() == true) goto L150;
        $composer2.skipToGroupEnd();
        if ((r42 & 64) == 0) goto L149;
        $dirty = $dirty & (-3670017);
    L149:
        flingBehavior3 = flingBehavior2;
        contentPadding3 = r10;
        reverseLayout3 = r11;
        modifier2 = r12;
        goto L163
    L186:
        r19 = state;
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        reverseLayout5 = r11;
        modifier4 = r12;
        flingBehavior5 = flingBehavior2;
        contentPadding5 = r10;
        goto L187
    L135:
        if (($dirty2 & 19) != 18) goto L138;
        r2 = false;
        goto L140
    L126:
        if (($changed1 & 48) != 0) goto L132;
        if ($composer2.changedInstance(r38) == true) goto L131;
        r16 = 16;
    L131:
        $dirty1 = $dirty1 | r16;
        goto L132
    L115:
        if (($changed1 & 6) != 0) goto L123;
        if ($composer2.changed(horizontalArrangement) == false) goto L119;
        int r110 = 4;
    L120:
        $dirty1 = $dirty1 | r110;
        goto L123
    L119:
        r110 = 2;
        goto L120
    L104:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changed(verticalArrangement) == false) goto L108;
        int r21 = 536870912;
    L109:
        $dirty = $dirty | r21;
        goto L112
    L108:
        r21 = 268435456;
        goto L109
    L93:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changed(overscrollEffect) == false) goto L97;
        int r22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty = $dirty | r22;
        goto L101
    L97:
        r22 = 33554432;
        goto L98
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changed(userScrollEnabled) == false) goto L87;
        int r23 = 8388608;
    L88:
        $dirty = $dirty | r23;
        goto L90
    L87:
        r23 = 4194304;
        goto L88
    L71:
        if ((r42 & 64) != 0) goto L75;
        flingBehavior2 = flingBehavior;
        if ($composer2.changed(flingBehavior2) == false) goto L76;
        int r24 = 1048576;
    L77:
        $dirty = $dirty | r24;
    L76:
        r24 = 524288;
        goto L77
    L75:
        flingBehavior2 = flingBehavior;
        goto L76
    L62:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L69;
        if ($composer2.changed(isVertical) == false) goto L66;
        int r25 = 131072;
    L67:
        $dirty = $dirty | r25;
        goto L69
    L66:
        r25 = 65536;
        goto L67
    L51:
        if (($changed & 24576) != 0) goto L57;
        r11 = reverseLayout;
        if ($composer2.changed(r11) == false) goto L55;
        int r26 = 16384;
    L56:
        $dirty = $dirty | r26;
        goto L59
    L55:
        r26 = 8192;
        goto L56
    L57:
        r11 = reverseLayout;
        goto L59
    L40:
        if (($changed & 3072) != 0) goto L46;
        r10 = contentPadding;
        if ($composer2.changed(r10) == false) goto L44;
        int r111 = 2048;
    L45:
        $dirty = $dirty | r111;
        goto L47
    L44:
        r111 = 1024;
        goto L45
    L46:
        r10 = contentPadding;
        goto L47
    L27:
        if (($changed & 384) != 0) goto L36;
        if (($changed & 512) != 0) goto L31;
        boolean r112 = $composer2.changed(slots);
    L32:
        if (r112 == false) goto L34;
        int r113 = 256;
    L35:
        $dirty = $dirty | r113;
        goto L36
    L34:
        r113 = 128;
        goto L35
    L31:
        r112 = $composer2.changedInstance(slots);
        goto L32
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changed(state) == false) goto L21;
        int r114 = 32;
    L22:
        $dirty = $dirty | r114;
        goto L24
    L21:
        r114 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r12 = modifier;
        if ($composer2.changed(r12) == false) goto L10;
        int r115 = 4;
    L11:
        $dirty = $dirty | r115;
        goto L13
    L10:
        r115 = 2;
        goto L11
    L12:
        r12 = modifier;
        goto L13
    }

    private static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy(final Function0<? extends LazyGridItemProvider> r22, LazyGridState state, LazyGridSlotsProvider slots, PaddingValues contentPadding, boolean reverseLayout, boolean isVertical, Arrangement.Horizontal horizontalArrangement, Arrangement.Vertical verticalArrangement, final CoroutineScope coroutineScope, final GraphicsContext graphicsContext, final StickyItemsPlacement stickyItemsScrollBehavior, Composer $composer, int $changed, int $changed1) {
        ComposerKt.sourceInformationMarkerStart($composer, -2025385037, "C(rememberLazyGridMeasurePolicy)P(5,8,7!1,6,4,3,10)179@7592L11578:LazyGrid.kt#7791vq");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(-2025385037, $changed, $changed1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:179)");
    L6:
        ComposerKt.sourceInformationMarkerStart($composer, 1026611131, "CC(remember):LazyGrid.kt#9igjgp");
        boolean r5 = false;
        if ((($changed & 112) ^ 48) <= 32) goto L11;
        final LazyGridState r8 = state;
        if ($composer.changed(r8) == false) goto L13;
    L14:
        boolean r2 = true;
    L17:
        if ((($changed & 896) ^ 384) <= 256) goto L21;
        final LazyGridSlotsProvider r13 = slots;
        if ($composer.changed(r13) == false) goto L23;
    L24:
        boolean r3 = true;
    L26:
        boolean r4 = r2 | r3;
        if ((($changed & 7168) ^ 3072) <= 2048) goto L31;
        final PaddingValues r10 = contentPadding;
        if ($composer.changed(r10) == false) goto L33;
    L34:
        boolean r6 = true;
    L36:
        boolean r7 = r4 | r6;
        if (((57344 & $changed) ^ 24576) <= 16384) goto L41;
        final boolean r11 = reverseLayout;
        if ($composer.changed(r11) == false) goto L43;
    L44:
        boolean r9 = true;
    L46:
        boolean r12 = r7 | r9;
        if (((458752 & $changed) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) goto L51;
        boolean r14 = isVertical;
        if ($composer.changed(r14) == false) goto L53;
    L54:
        boolean r15 = true;
    L56:
        boolean r16 = r12 | r15;
        if (((3670016 & $changed) ^ 1572864) <= 1048576) goto L61;
        final Arrangement.Horizontal r17 = horizontalArrangement;
        if ($composer.changed(r17) == false) goto L63;
    L64:
        boolean r18 = true;
    L66:
        boolean r19 = r16 | r18;
        if (((29360128 & $changed) ^ 12582912) <= 8388608) goto L71;
        final Arrangement.Vertical r110 = verticalArrangement;
        if ($composer.changed(r110) == false) goto L73;
    L74:
        r5 = true;
    L75:
        boolean invalid$iv = (r19 | r5) | $composer.changed(graphicsContext);
        Object value$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L78;
    L81:
        final boolean r20 = r14;
        value$iv = (Function2) new LazyGridKt$rememberLazyGridMeasurePolicy$1$1(r8, r20, r10, r11, r22, r13, r110, r17, coroutineScope, graphicsContext, stickyItemsScrollBehavior);
        $composer.updateRememberedValue(value$iv);
    L82:
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> r21 = (Function2) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L85;
        ComposerKt.traceEventEnd();
    L85:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r21;
    L78:
        if (value$iv != Composer.Companion.getEmpty()) goto L82;
    L73:
        if (($changed & 12582912) != 8388608) goto L75;
    L71:
        r110 = verticalArrangement;
    L63:
        if (($changed & 1572864) == 1048576) goto L64;
        r18 = false;
        goto L66
    L61:
        r17 = horizontalArrangement;
    L53:
        if ((196608 & $changed) == 131072) goto L54;
        r15 = false;
        goto L56
    L51:
        r14 = isVertical;
    L43:
        if (($changed & 24576) == 16384) goto L44;
        r9 = false;
        goto L46
    L41:
        r11 = reverseLayout;
    L33:
        if (($changed & 3072) == 2048) goto L34;
        r6 = false;
        goto L36
    L31:
        r10 = contentPadding;
    L23:
        if (($changed & 384) == 256) goto L24;
        r3 = false;
        goto L26
    L21:
        r13 = slots;
    L13:
        if (($changed & 48) == 32) goto L14;
        r2 = false;
        goto L17
    L11:
        r8 = state;
        goto L13
    }
}
