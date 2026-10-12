package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.ScrollingContainerKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
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

/* JADX INFO: compiled from: LazyStaggeredGrid.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0093\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0002\b\u0019H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"LazyStaggeredGrid", "", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "slots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "modifier", "Landroidx/compose/ui/Modifier;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacing", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Lkotlin/ExtensionFunctionType;", "LazyStaggeredGrid-w41Enmo", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;FFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyStaggeredGridKt {
    /* JADX INFO: renamed from: LazyStaggeredGrid-w41Enmo, reason: not valid java name */
    public static final void m933LazyStaggeredGridw41Enmo(final LazyStaggeredGridState state, final Orientation orientation, final LazyGridStaggeredGridSlotsProvider slots, Modifier modifier, PaddingValues contentPadding, boolean reverseLayout, FlingBehavior flingBehavior, boolean userScrollEnabled, final OverscrollEffect overscrollEffect, float mainAxisSpacing, float crossAxisSpacing, final Function1<? super LazyStaggeredGridScope, Unit> r40, Composer $composer, final int $changed, final int $changed1, final int r44) {
        Composer $composer2 = $composer.startRestartGroup(-1904835166);
        ComposerKt.sourceInformation($composer2, "C(LazyStaggeredGrid)P(10,6,9,5,1,8,3,11,7,4:c#ui.unit.Dp,2:c#ui.unit.Dp)63@2871L55,64@2952L24,65@3024L7,67@3064L310,79@3399L60,98@4046L302,93@3877L1173:LazyStaggeredGrid.kt#fzvcnm");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r44 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r44 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L23:
        if ((r44 & 4) == 0) goto L26;
        $dirty = $dirty | 384;
    L35:
        int r7 = r44 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
        Modifier modifier2 = modifier;
    L46:
        int r16 = r44 & 16;
        if (r16 == 0) goto L50;
        $dirty = $dirty | 24576;
        PaddingValues r8 = contentPadding;
    L57:
        int r17 = r44 & 32;
        if (r17 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        boolean r9 = reverseLayout;
    L69:
        if (($changed & 1572864) == 0) goto L71;
        FlingBehavior r10 = flingBehavior;
    L79:
        int r11 = r44 & 128;
        if (r11 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L91:
        if ((r44 & 256) == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int $dirty2 = r44 & 512;
        if ($dirty2 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        int $dirty3 = r44 & 1024;
        if ($dirty3 == 0) goto L116;
        $dirty1 = $dirty1 | 6;
    L124:
        if ((r44 & 2048) == 0) goto L127;
        $dirty1 = $dirty1 | 48;
    L133:
        int $dirty4 = $dirty1;
        if ((306783379 & $dirty) == 306783378) goto L136;
    L139:
        boolean r2 = true;
    L141:
        if ($composer2.shouldExecute(r2, $dirty & 1) == false) goto L188;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "51@2365L15");
        if (($changed & 1) != 0) goto L145;
    L151:
        if (r7 == 0) goto L153;
        Modifier.Companion modifier3 = Modifier.Companion;
    L154:
        if (r16 == 0) goto L156;
        PaddingValues contentPadding2 = PaddingKt.m718PaddingValues0680j_4(Dp.m6973constructorimpl(0));
    L157:
        if (r17 == 0) goto L159;
        boolean reverseLayout2 = false;
    L161:
        if ((r44 & 64) == 0) goto L163;
        FlingBehavior flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior($composer2, 6);
        $dirty = $dirty & (-3670017);
    L164:
        if (r11 == 0) goto L166;
        boolean userScrollEnabled2 = true;
    L167:
        if ($dirty2 == 0) goto L169;
        float mainAxisSpacing2 = Dp.m6973constructorimpl(0);
    L170:
        if ($dirty3 == 0) goto L172;
        modifier2 = modifier3;
        FlingBehavior flingBehavior3 = flingBehavior2;
        boolean userScrollEnabled3 = userScrollEnabled2;
        int $dirty5 = $dirty;
        boolean reverseLayout3 = reverseLayout2;
        float crossAxisSpacing2 = Dp.m6973constructorimpl(0);
        PaddingValues contentPadding3 = contentPadding2;
        float mainAxisSpacing3 = mainAxisSpacing2;
    L173:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L176;
        ComposerKt.traceEventStart(-1904835166, $dirty5, $dirty4, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
    L176:
        Function0<LazyStaggeredGridItemProvider> r12 = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda(state, r40, $composer2, ($dirty5 & 14) | ($dirty4 & 112));
        ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        PaddingValues contentPadding4 = contentPadding3;
        ComposerKt.sourceInformationMarkerStart($composer2, -954203484, "CC(remember):Effects.kt#9igjgp");
        Object value$iv$iv = $composer2.rememberedValue();
        if (value$iv$iv != Composer.Companion.getEmpty()) goto L180;
        value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2);
        $composer2.updateRememberedValue(value$iv$iv);
    L180:
        CoroutineScope coroutineScope = (CoroutineScope) value$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ProvidableCompositionLocal<GraphicsContext> r0 = CompositionLocalsKt.getLocalGraphicsContext();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r13 = $composer2.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        GraphicsContext graphicsContext = (GraphicsContext) r13;
        boolean reverseLayout4 = reverseLayout3;
        float crossAxisSpacing3 = crossAxisSpacing2;
        int $dirty6 = $dirty5;
        Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> r14 = LazyStaggeredGridMeasurePolicyKt.m944rememberStaggeredGridMeasurePolicyqKj4JfE(state, r12, contentPadding4, reverseLayout4, orientation, mainAxisSpacing3, crossAxisSpacing3, coroutineScope, slots, graphicsContext, $composer2, (((((($dirty5 & 14) | (($dirty5 >> 6) & 896)) | (($dirty5 >> 6) & 7168)) | (($dirty5 << 9) & 57344)) | (($dirty5 >> 12) & 458752)) | (($dirty4 << 18) & 3670016)) | (($dirty5 << 18) & 234881024));
        float mainAxisSpacing4 = mainAxisSpacing3;
        LazyLayoutSemanticState semanticState = LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(state, reverseLayout4, $composer2, ($dirty6 & 14) | (($dirty6 >> 12) & 112));
        if (userScrollEnabled3 == false) goto L183;
        $composer2.startReplaceGroup(1913386186);
        ComposerKt.sourceInformation($composer2, "84@3602L57");
        Modifier.Companion r4 = LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(Modifier.Companion, LazyStaggeredGridBeyondBoundsModifierKt.rememberLazyStaggeredGridBeyondBoundsState(state, $composer2, $dirty6 & 14), state.getBeyondBoundsInfo$foundation_release(), reverseLayout4, orientation);
        $composer2.endReplaceGroup();
    L184:
        Modifier beyondBoundsModifier = r4;
        boolean userScrollEnabled4 = userScrollEnabled3;
        Composer $composer3 = $composer2;
        FlingBehavior flingBehavior4 = flingBehavior3;
        LazyLayoutKt.LazyLayout(r12, ScrollingContainerKt.scrollingContainer$default(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier2.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier$foundation_release()), r12, semanticState, orientation, userScrollEnabled4, reverseLayout4, $composer2, ($dirty6 & 458752) | ((($dirty6 << 6) & 7168) | (($dirty6 >> 9) & 57344))).then(beyondBoundsModifier).then(state.getItemAnimator$foundation_release().getModifier()), state, orientation, userScrollEnabled4, reverseLayout4, flingBehavior4, state.getMutableInteractionSource$foundation_release(), false, overscrollEffect, null, 256, null), state.getPrefetchState$foundation_release(), r14, $composer3, 0, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L187;
        ComposerKt.traceEventEnd();
    L187:
        final boolean userScrollEnabled5 = userScrollEnabled4;
        final FlingBehavior flingBehavior5 = flingBehavior4;
        final PaddingValues contentPadding5 = contentPadding4;
        final float mainAxisSpacing5 = mainAxisSpacing4;
        final float crossAxisSpacing4 = crossAxisSpacing3;
        final boolean reverseLayout5 = reverseLayout4;
        final Modifier modifier4 = modifier2;
    L189:
        ScopeUpdateScope r1 = $composer3.endRestartGroup();
        if (r1 == null) goto L193;
        r1.updateScope(new LazyStaggeredGridKt$LazyStaggeredGrid$1(state, orientation, slots, modifier4, contentPadding5, reverseLayout5, flingBehavior5, userScrollEnabled5, overscrollEffect, mainAxisSpacing5, crossAxisSpacing4, r40, $changed, $changed1, r44));
        return;
    L193:
        return;
    L183:
        $composer2.startReplaceGroup(1913691040);
        $composer2.endReplaceGroup();
        r4 = Modifier.Companion;
        goto L184
    L172:
        modifier2 = modifier3;
        contentPadding3 = contentPadding2;
        flingBehavior3 = flingBehavior2;
        userScrollEnabled3 = userScrollEnabled2;
        mainAxisSpacing3 = mainAxisSpacing2;
        $dirty5 = $dirty;
        reverseLayout3 = reverseLayout2;
        crossAxisSpacing2 = crossAxisSpacing;
        goto L173
    L169:
        mainAxisSpacing2 = mainAxisSpacing;
        goto L170
    L166:
        userScrollEnabled2 = userScrollEnabled;
        goto L167
    L163:
        flingBehavior2 = r10;
        goto L164
    L159:
        reverseLayout2 = r9;
        goto L161
    L156:
        contentPadding2 = r8;
        goto L157
    L153:
        modifier3 = modifier2;
        goto L154
    L145:
        if ($composer2.getDefaultsInvalid() == true) goto L151;
        $composer2.skipToGroupEnd();
        if ((r44 & 64) == 0) goto L150;
        $dirty = $dirty & (-3670017);
    L150:
        userScrollEnabled3 = userScrollEnabled;
        mainAxisSpacing3 = mainAxisSpacing;
        crossAxisSpacing2 = crossAxisSpacing;
        contentPadding3 = r8;
        flingBehavior3 = r10;
        $dirty5 = $dirty;
        reverseLayout3 = r9;
        goto L173
    L188:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        crossAxisSpacing4 = crossAxisSpacing;
        contentPadding5 = r8;
        flingBehavior5 = r10;
        userScrollEnabled5 = userScrollEnabled;
        mainAxisSpacing5 = mainAxisSpacing;
        reverseLayout5 = r9;
        modifier4 = modifier2;
        goto L189
    L136:
        if (($dirty4 & 19) != 18) goto L139;
        r2 = false;
        goto L141
    L127:
        if (($changed1 & 48) != 0) goto L133;
        if ($composer2.changedInstance(r40) == false) goto L131;
        int r19 = 32;
    L132:
        $dirty1 = $dirty1 | r19;
        goto L133
    L131:
        r19 = 16;
        goto L132
    L116:
        if (($changed1 & 6) != 0) goto L124;
        if ($composer2.changed(crossAxisSpacing) == false) goto L120;
        int r18 = 4;
    L121:
        $dirty1 = $dirty1 | r18;
        goto L124
    L120:
        r18 = 2;
        goto L121
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changed(mainAxisSpacing) == false) goto L109;
        int r23 = 536870912;
    L110:
        $dirty = $dirty | r23;
        goto L112
    L109:
        r23 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changed(overscrollEffect) == false) goto L98;
        int r22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r22;
        goto L101
    L98:
        r22 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L91;
        if ($composer2.changed(userScrollEnabled) == false) goto L87;
        int r24 = 8388608;
    L88:
        $dirty = $dirty | r24;
        goto L91
    L87:
        r24 = 4194304;
        goto L88
    L71:
        if ((r44 & 64) != 0) goto L75;
        r10 = flingBehavior;
        if ($composer2.changed(r10) == false) goto L76;
        int r20 = 1048576;
    L77:
        $dirty = $dirty | r20;
    L76:
        r20 = 524288;
        goto L77
    L75:
        r10 = flingBehavior;
        goto L76
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r9 = reverseLayout;
        if ($composer2.changed(r9) == false) goto L65;
        int r110 = 131072;
    L66:
        $dirty = $dirty | r110;
        goto L69
    L65:
        r110 = 65536;
        goto L66
    L67:
        r9 = reverseLayout;
        goto L69
    L50:
        if (($changed & 24576) != 0) goto L56;
        r8 = contentPadding;
        if ($composer2.changed(r8) == false) goto L54;
        int r111 = 16384;
    L55:
        $dirty = $dirty | r111;
        goto L57
    L54:
        r111 = 8192;
        goto L55
    L56:
        r8 = contentPadding;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L43;
        int r112 = 2048;
    L44:
        $dirty = $dirty | r112;
        goto L46
    L43:
        r112 = 1024;
        goto L44
    L45:
        modifier2 = modifier;
        goto L46
    L26:
        if (($changed & 384) != 0) goto L35;
        if (($changed & 512) != 0) goto L30;
        boolean r15 = $composer2.changed(slots);
    L31:
        if (r15 == false) goto L33;
        int r21 = 256;
    L34:
        $dirty = $dirty | r21;
        goto L35
    L33:
        r21 = 128;
        goto L34
    L30:
        r15 = $composer2.changedInstance(slots);
        goto L31
    L16:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changed(orientation) == false) goto L20;
        int r25 = 32;
    L21:
        $dirty = $dirty | r25;
        goto L23
    L20:
        r25 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(state) == false) goto L10;
        int r26 = 4;
    L11:
        $dirty = $dirty | r26;
        goto L13
    L10:
        r26 = 2;
        goto L11
    }
}
