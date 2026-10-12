package androidx.compose.foundation.lazy;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.ScrollingContainerKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: LazyList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a¢\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u001b¢\u0006\u0002\b\u001dH\u0001¢\u0006\u0002\u0010\u001e\u001a\u009c\u0001\u0010\u001f\u001a\u0019\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0 ¢\u0006\u0002\b\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0003¢\u0006\u0002\u0010-¨\u0006."}, d2 = {"LazyList", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "beyondBoundsItemCount", "", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;ILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "rememberLazyListMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "stickyItemsPlacement", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyListKt {
    public static final void LazyList(final Modifier modifier, LazyListState state, final PaddingValues contentPadding, final boolean reverseLayout, final boolean isVertical, final FlingBehavior flingBehavior, final boolean userScrollEnabled, final OverscrollEffect overscrollEffect, int beyondBoundsItemCount, Alignment.Horizontal horizontalAlignment, Arrangement.Vertical verticalArrangement, Alignment.Vertical verticalAlignment, Arrangement.Horizontal horizontalArrangement, final Function1<? super LazyListScope, Unit> r43, Composer $composer, final int $changed, final int $changed1, final int r47) {
        Composer $composer2 = $composer.startRestartGroup(924924659);
        ComposerKt.sourceInformation($composer2, "C(LazyList)P(7,10,2,9,6,3,11,8!1,4,13,12,5)85@4100L50,87@4176L48,88@4250L24,89@4322L7,90@4391L7,93@4432L483,132@5717L302,127@5548L1174:LazyList.kt#428nma");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r47 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r16 = 32;
        if ((r47 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L22:
        int r18 = 256;
        if ((r47 & 4) == 0) goto L26;
        $dirty = $dirty | 384;
        PaddingValues r12 = contentPadding;
    L33:
        int r21 = 2048;
        if ((r47 & 8) == 0) goto L37;
        $dirty = $dirty | 3072;
    L44:
        if ((r47 & 16) == 0) goto L47;
        $dirty = $dirty | 24576;
    L54:
        if ((r47 & 32) == 0) goto L57;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L65:
        if ((r47 & 64) == 0) goto L68;
        $dirty = $dirty | 1572864;
    L75:
        if ((r47 & 128) == 0) goto L78;
        $dirty = $dirty | 12582912;
    L85:
        int r9 = r47 & 256;
        if (r9 == 0) goto L89;
        $dirty = $dirty | 100663296;
    L96:
        int $dirty2 = r47 & 512;
        if ($dirty2 == 0) goto L100;
        $dirty = $dirty | 805306368;
    L107:
        int $dirty3 = r47 & 1024;
        if ($dirty3 == 0) goto L111;
        $dirty1 = $dirty1 | 6;
    L118:
        int $dirty4 = r47 & 2048;
        if ($dirty4 == 0) goto L122;
        $dirty1 = $dirty1 | 48;
    L129:
        int r0 = r47 & 4096;
        if (r0 == 0) goto L132;
        $dirty1 = $dirty1 | 384;
        int r17 = r0;
    L141:
        if ((r47 & 8192) == 0) goto L144;
        $dirty1 = $dirty1 | 3072;
    L150:
        int $dirty5 = $dirty1;
        if ((306783379 & $dirty) == 306783378) goto L153;
    L156:
        boolean r4 = true;
    L158:
        if ($composer2.shouldExecute(r4, $dirty & 1) == false) goto L198;
        if (r9 == 0) goto L161;
        int beyondBoundsItemCount2 = 0;
    L162:
        if ($dirty2 == 0) goto L164;
        Alignment.Horizontal horizontalAlignment2 = null;
    L165:
        if ($dirty3 == 0) goto L167;
        Arrangement.Vertical verticalArrangement2 = null;
    L168:
        if ($dirty4 == 0) goto L170;
        Alignment.Vertical verticalAlignment2 = null;
    L171:
        if (r17 == 0) goto L173;
        Arrangement.Horizontal horizontalArrangement2 = null;
    L175:
        if (ComposerKt.isTraceInProgress() == false) goto L178;
        ComposerKt.traceEventStart(924924659, $dirty, $dirty5, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:84)");
    L178:
        Function0<LazyListItemProvider> r5 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(state, r43, $composer2, (($dirty >> 3) & 14) | (($dirty5 >> 6) & 112));
        LazyLayoutSemanticState semanticState = LazyListSemanticsKt.rememberLazyListSemanticState(state, isVertical, $composer2, (($dirty >> 3) & 14) | (($dirty >> 9) & 112));
        ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart($composer2, -954203484, "CC(remember):Effects.kt#9igjgp");
        Object value$iv$iv = $composer2.rememberedValue();
        if (value$iv$iv != Composer.Companion.getEmpty()) goto L182;
        value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2);
        $composer2.updateRememberedValue(value$iv$iv);
    L182:
        CoroutineScope coroutineScope = (CoroutineScope) value$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ProvidableCompositionLocal<GraphicsContext> r1 = CompositionLocalsKt.getLocalGraphicsContext();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r2 = $composer2.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        GraphicsContext graphicsContext = (GraphicsContext) r2;
        CompositionLocal<Boolean> r3 = CompositionLocalsKt.getLocalScrollCaptureInProgress();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r6 = $composer2.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        boolean stickyHeadersEnabled = !((Boolean) r6).booleanValue();
        if (stickyHeadersEnabled == false) goto L185;
        StickyItemsPlacement r7 = StickyItemsPlacement.Companion.getStickToTopPlacement();
    L186:
        int r19 = (((((((($dirty & 112) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (($dirty >> 9) & 458752)) | (3670016 & ($dirty >> 9))) | (($dirty5 << 18) & 29360128)) | (($dirty5 << 18) & 234881024)) | (($dirty5 << 27) & 1879048192);
        int $dirty6 = $dirty;
        Arrangement.Horizontal horizontalArrangement3 = horizontalArrangement2;
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> r14 = rememberLazyListMeasurePolicy(r5, state, r12, reverseLayout, isVertical, beyondBoundsItemCount2, horizontalAlignment2, verticalAlignment2, horizontalArrangement3, verticalArrangement2, coroutineScope, graphicsContext, r7, $composer2, r19, 0);
        Alignment.Horizontal horizontalAlignment3 = horizontalAlignment2;
        Alignment.Vertical verticalAlignment3 = verticalAlignment2;
        Arrangement.Vertical verticalArrangement3 = verticalArrangement2;
        LazyListState r15 = state;
        int beyondBoundsItemCount3 = beyondBoundsItemCount2;
        if (isVertical == false) goto L189;
        Orientation r8 = Orientation.Vertical;
    L190:
        Orientation orientation = r8;
        if (userScrollEnabled == false) goto L193;
        $composer2.startReplaceGroup(-1513147781);
        ComposerKt.sourceInformation($composer2, "115@5166L165");
        Modifier.Companion r10 = LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(Modifier.Companion, LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(r15, beyondBoundsItemCount3, $composer2, (($dirty6 >> 3) & 14) | (($dirty6 >> 21) & 112)), r15.getBeyondBoundsInfo$foundation_release(), reverseLayout, orientation);
        $composer2.endReplaceGroup();
    L194:
        Modifier beyondBoundsModifier = r10;
        Modifier r11 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(r15.getRemeasurementModifier$foundation_release()).then(r15.getAwaitLayoutModifier$foundation_release()), r5, semanticState, orientation, userScrollEnabled, reverseLayout, $composer2, (($dirty6 >> 6) & 57344) | (458752 & ($dirty6 << 6)));
        Composer $composer3 = $composer2;
        LazyLayoutKt.LazyLayout(r5, ScrollingContainerKt.scrollingContainer$default(r11.then(beyondBoundsModifier).then(r15.getItemAnimator$foundation_release().getModifier()), r15, orientation, userScrollEnabled, reverseLayout, flingBehavior, r15.getInternalInteractionSource$foundation_release(), false, overscrollEffect, null, 256, null), r15.getPrefetchState$foundation_release(), r14, $composer3, 0, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L197;
        ComposerKt.traceEventEnd();
    L197:
        final Alignment.Horizontal horizontalAlignment4 = horizontalAlignment3;
        final Alignment.Vertical verticalAlignment4 = verticalAlignment3;
        final Arrangement.Horizontal horizontalArrangement4 = horizontalArrangement3;
        final Arrangement.Vertical verticalArrangement4 = verticalArrangement3;
        final int beyondBoundsItemCount4 = beyondBoundsItemCount3;
    L199:
        ScopeUpdateScope r13 = $composer3.endRestartGroup();
        if (r13 == null) goto L203;
        final LazyListState r20 = r15;
        r13.updateScope(new AnonymousClass1(modifier, r20, contentPadding, reverseLayout, isVertical, flingBehavior, userScrollEnabled, overscrollEffect, beyondBoundsItemCount4, horizontalAlignment4, verticalArrangement4, verticalAlignment4, horizontalArrangement4, r43, $changed, $changed1, r47));
        return;
    L203:
        return;
    L193:
        $composer2.startReplaceGroup(-1512720880);
        $composer2.endReplaceGroup();
        r10 = Modifier.Companion;
        goto L194
    L189:
        r8 = Orientation.Horizontal;
        goto L190
    L185:
        r7 = null;
        goto L186
    L173:
        horizontalArrangement2 = horizontalArrangement;
        goto L175
    L170:
        verticalAlignment2 = verticalAlignment;
        goto L171
    L167:
        verticalArrangement2 = verticalArrangement;
        goto L168
    L164:
        horizontalAlignment2 = horizontalAlignment;
        goto L165
    L161:
        beyondBoundsItemCount2 = beyondBoundsItemCount;
        goto L162
    L198:
        $composer3 = $composer2;
        r15 = state;
        $composer3.skipToGroupEnd();
        beyondBoundsItemCount4 = beyondBoundsItemCount;
        horizontalAlignment4 = horizontalAlignment;
        verticalArrangement4 = verticalArrangement;
        verticalAlignment4 = verticalAlignment;
        horizontalArrangement4 = horizontalArrangement;
        goto L199
    L153:
        if (($dirty5 & 1171) != 1170) goto L156;
        r4 = false;
        goto L158
    L144:
        if (($changed1 & 3072) != 0) goto L150;
        if ($composer2.changedInstance(r43) == true) goto L149;
        r21 = 1024;
    L149:
        $dirty1 = $dirty1 | r21;
        goto L150
    L132:
        r17 = r0;
        if (($changed1 & 384) != 0) goto L141;
        if ($composer2.changed(horizontalArrangement) == true) goto L138;
        r18 = 128;
    L138:
        $dirty1 = $dirty1 | r18;
        goto L141
    L122:
        if (($changed1 & 48) != 0) goto L129;
        if ($composer2.changed(verticalAlignment) == true) goto L127;
        r16 = 16;
    L127:
        $dirty1 = $dirty1 | r16;
        goto L129
    L111:
        if (($changed1 & 6) != 0) goto L118;
        if ($composer2.changed(verticalArrangement) == false) goto L115;
        int r22 = 4;
    L116:
        $dirty1 = $dirty1 | r22;
        goto L118
    L115:
        r22 = 2;
        goto L116
    L100:
        if (($changed & 805306368) != 0) goto L107;
        if ($composer2.changed(horizontalAlignment) == false) goto L104;
        int r25 = 536870912;
    L105:
        $dirty = $dirty | r25;
        goto L107
    L104:
        r25 = 268435456;
        goto L105
    L89:
        if (($changed & 100663296) != 0) goto L96;
        if ($composer2.changed(beyondBoundsItemCount) == false) goto L93;
        int r24 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L94:
        $dirty = $dirty | r24;
        goto L96
    L93:
        r24 = 33554432;
        goto L94
    L78:
        if ((12582912 & $changed) != 0) goto L85;
        if ($composer2.changed(overscrollEffect) == false) goto L82;
        int r23 = 8388608;
    L83:
        $dirty = $dirty | r23;
        goto L85
    L82:
        r23 = 4194304;
        goto L83
    L68:
        if (($changed & 1572864) != 0) goto L75;
        if ($composer2.changed(userScrollEnabled) == false) goto L72;
        int r26 = 1048576;
    L73:
        $dirty = $dirty | r26;
        goto L75
    L72:
        r26 = 524288;
        goto L73
    L57:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L65;
        if ($composer2.changed(flingBehavior) == false) goto L61;
        int r27 = 131072;
    L62:
        $dirty = $dirty | r27;
        goto L65
    L61:
        r27 = 65536;
        goto L62
    L47:
        if (($changed & 24576) != 0) goto L54;
        if ($composer2.changed(isVertical) == false) goto L51;
        int r110 = 16384;
    L52:
        $dirty = $dirty | r110;
        goto L54
    L51:
        r110 = 8192;
        goto L52
    L37:
        if (($changed & 3072) != 0) goto L44;
        if ($composer2.changed(reverseLayout) == false) goto L41;
        int r111 = 2048;
    L42:
        $dirty = $dirty | r111;
        goto L44
    L41:
        r111 = 1024;
        goto L42
    L26:
        if (($changed & 384) != 0) goto L32;
        r12 = contentPadding;
        if ($composer2.changed(r12) == false) goto L30;
        int r28 = 256;
    L31:
        $dirty = $dirty | r28;
        goto L33
    L30:
        r28 = 128;
        goto L31
    L32:
        r12 = contentPadding;
        goto L33
    L16:
        if (($changed & 48) != 0) goto L22;
        if ($composer2.changed(state) == false) goto L20;
        int r112 = 32;
    L21:
        $dirty = $dirty | r112;
        goto L22
    L20:
        r112 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(modifier) == false) goto L10;
        int r113 = 4;
    L11:
        $dirty = $dirty | r113;
        goto L12
    L10:
        r113 = 2;
        goto L11
    }

    private static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy(final Function0<? extends LazyListItemProvider> r23, LazyListState state, PaddingValues contentPadding, boolean reverseLayout, boolean isVertical, final int beyondBoundsItemCount, Alignment.Horizontal horizontalAlignment, Alignment.Vertical verticalAlignment, Arrangement.Horizontal horizontalArrangement, Arrangement.Vertical verticalArrangement, final CoroutineScope coroutineScope, final GraphicsContext graphicsContext, StickyItemsPlacement stickyItemsPlacement, Composer $composer, int $changed, int $changed1) {
        ComposerKt.sourceInformationMarkerStart($composer, -739270660, "C(rememberLazyListMeasurePolicy)P(7,9,1,8,6!1,4,11,5,12)187@7988L9562:LazyList.kt#428nma");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-739270660, $changed, $changed1, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:187)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 581144747, "CC(remember):LazyList.kt#9igjgp");
        if ((($changed & 112) ^ 48) <= 32) goto L10;
        final LazyListState r8 = state;
        if ($composer.changed(r8) == false) goto L12;
    L13:
        boolean r3 = true;
    L16:
        if ((($changed & 896) ^ 384) <= 256) goto L20;
        final PaddingValues r10 = contentPadding;
        if ($composer.changed(r10) == false) goto L22;
    L23:
        boolean r4 = true;
    L25:
        boolean r5 = r3 | r4;
        if ((($changed & 7168) ^ 3072) <= 2048) goto L30;
        final boolean r11 = reverseLayout;
        if ($composer.changed(r11) == false) goto L32;
    L33:
        boolean r6 = true;
    L35:
        boolean r7 = r5 | r6;
        if (((57344 & $changed) ^ 24576) <= 16384) goto L40;
        boolean r9 = isVertical;
        if ($composer.changed(r9) == false) goto L42;
    L43:
        boolean r12 = true;
    L45:
        boolean r13 = r7 | r12;
        if (((3670016 & $changed) ^ 1572864) <= 1048576) goto L50;
        Alignment.Horizontal r14 = horizontalAlignment;
        if ($composer.changed(r14) == false) goto L52;
    L53:
        boolean r15 = true;
    L55:
        boolean r16 = r13 | r15;
        if (((29360128 & $changed) ^ 12582912) <= 8388608) goto L60;
        Alignment.Vertical r17 = verticalAlignment;
        if ($composer.changed(r17) == false) goto L62;
    L63:
        boolean r18 = true;
    L65:
        boolean r19 = r16 | r18;
        if (((234881024 & $changed) ^ 100663296) <= 67108864) goto L70;
        Arrangement.Horizontal r110 = horizontalArrangement;
        if ($composer.changed(r110) == false) goto L72;
    L73:
        boolean r111 = true;
    L75:
        boolean r20 = r19 | r111;
        if (((1879048192 & $changed) ^ 805306368) <= 536870912) goto L80;
        Arrangement.Vertical r112 = verticalArrangement;
        if ($composer.changed(r112) == false) goto L82;
    L83:
        boolean r21 = true;
    L85:
        boolean r22 = (r20 | r21) | $composer.changed(graphicsContext);
        if ((($changed1 & 896) ^ 384) <= 256) goto L90;
        StickyItemsPlacement r113 = stickyItemsPlacement;
        if ($composer.changed(r113) == false) goto L92;
    L93:
        boolean r114 = true;
    L95:
        boolean invalid$iv = r22 | r114;
        Object value$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L98;
    L101:
        final Arrangement.Vertical r115 = r112;
        final Arrangement.Horizontal r116 = r110;
        final Alignment.Horizontal r117 = r14;
        final Alignment.Vertical r24 = r17;
        final StickyItemsPlacement r118 = r113;
        final boolean r25 = r9;
        value$iv = (Function2) new LazyListKt$rememberLazyListMeasurePolicy$1$1(r8, r25, r10, r11, r23, r115, r116, beyondBoundsItemCount, coroutineScope, graphicsContext, r118, r117, r24);
        $composer.updateRememberedValue(value$iv);
    L102:
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> r26 = (Function2) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L105;
        ComposerKt.traceEventEnd();
    L105:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r26;
    L98:
        if (value$iv != Composer.Companion.getEmpty()) goto L102;
    L92:
        if (($changed1 & 384) == 256) goto L93;
        r114 = false;
        goto L95
    L90:
        r113 = stickyItemsPlacement;
    L82:
        if ((805306368 & $changed) == 536870912) goto L83;
        r21 = false;
        goto L85
    L80:
        r112 = verticalArrangement;
    L72:
        if ((100663296 & $changed) == 67108864) goto L73;
        r111 = false;
        goto L75
    L70:
        r110 = horizontalArrangement;
    L62:
        if ((12582912 & $changed) == 8388608) goto L63;
        r18 = false;
        goto L65
    L60:
        r17 = verticalAlignment;
    L52:
        if ((1572864 & $changed) == 1048576) goto L53;
        r15 = false;
        goto L55
    L50:
        r14 = horizontalAlignment;
    L42:
        if (($changed & 24576) == 16384) goto L43;
        r12 = false;
        goto L45
    L40:
        r9 = isVertical;
    L32:
        if (($changed & 3072) == 2048) goto L33;
        r6 = false;
        goto L35
    L30:
        r11 = reverseLayout;
    L22:
        if (($changed & 384) == 256) goto L23;
        r4 = false;
        goto L25
    L20:
        r10 = contentPadding;
    L12:
        if (($changed & 48) == 32) goto L13;
        r3 = false;
        goto L16
    L10:
        r8 = state;
        goto L12
    }
}
