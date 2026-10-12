package androidx.compose.foundation.pager;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.ScrollingContainerKt;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.internal.InlineClassHelperKt;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasureResult;
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
import kotlin.jvm.functions.Function4;
import kotlin.reflect.KProperty0;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: LazyLayoutPager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aè\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182#\u0010\u0019\u001a\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001a2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$21\u0010%\u001a-\u0012\u0004\u0012\u00020'\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00010&¢\u0006\u0002\b)¢\u0006\u0002\b*H\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a\u0081\u0001\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u0010\u0004\u001a\u00020\u000521\u0010%\u001a-\u0012\u0004\u0012\u00020'\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00010&¢\u0006\u0002\b)¢\u0006\u0002\b*2#\u0010\u0019\u001a\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001a2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00120.H\u0003¢\u0006\u0002\u00101\u001a\u0014\u00102\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"Pager", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/pager/PagerState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "flingBehavior", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "userScrollEnabled", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "beyondViewportPageCount", "", "pageSpacing", "Landroidx/compose/ui/unit/Dp;", "pageSize", "Landroidx/compose/foundation/pager/PageSize;", "pageNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "key", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "pageContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", "page", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "Pager-eLwUrMk", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "rememberPagerItemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "pageCount", "(Landroidx/compose/foundation/pager/PagerState;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "dragDirectionDetector", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyLayoutPagerKt {
    /* JADX INFO: renamed from: Pager-eLwUrMk, reason: not valid java name */
    public static final void m965PagereLwUrMk(final Modifier modifier, final PagerState state, final PaddingValues contentPadding, final boolean reverseLayout, final Orientation orientation, final TargetedFlingBehavior flingBehavior, final boolean userScrollEnabled, final OverscrollEffect overscrollEffect, int beyondViewportPageCount, float pageSpacing, final PageSize pageSize, NestedScrollConnection pageNestedScrollConnection, final Function1<? super Integer, ? extends Object> r40, final Alignment.Horizontal horizontalAlignment, final Alignment.Vertical verticalAlignment, final SnapPosition snapPosition, final Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> r44, Composer $composer, final int $changed, final int $changed1, final int $dirty) {
        NestedScrollConnection r11 = pageNestedScrollConnection;
        Composer $composer2 = $composer.startRestartGroup(1125194810);
        ComposerKt.sourceInformation($composer2, "C(Pager)P(5,14,1,12,6,2,15,7!1,11:c#ui.unit.Dp,10,9,4!1,16,13)110@5371L39,110@5286L124,114@5437L24,130@6080L19,117@5495L614,133@6135L70,136@6247L82,138@6389L7,140@6438L121,165@7275L301,160@7106L1506:LazyLayoutPager.kt#g6yjnt");
        int $dirty2 = $changed;
        int $dirty1 = $changed1;
        if (($dirty & 1) == 0) goto L6;
        $dirty2 = $dirty2 | 6;
    L12:
        int r16 = 16;
        if (($dirty & 2) == 0) goto L16;
        $dirty2 = $dirty2 | 48;
    L22:
        int r17 = 256;
        if (($dirty & 4) == 0) goto L26;
        $dirty2 = $dirty2 | 384;
    L33:
        int r20 = 2048;
        if (($dirty & 8) == 0) goto L37;
        $dirty2 = $dirty2 | 3072;
    L44:
        if (($dirty & 16) == 0) goto L47;
        $dirty2 = $dirty2 | 24576;
    L54:
        if (($dirty & 32) == 0) goto L57;
        $dirty2 = $dirty2 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L64:
        if (($dirty & 64) == 0) goto L67;
        $dirty2 = $dirty2 | 1572864;
    L74:
        if (($dirty & 128) == 0) goto L77;
        $dirty2 = $dirty2 | 12582912;
    L84:
        int r7 = $dirty & 256;
        if (r7 == 0) goto L88;
        $dirty2 = $dirty2 | 100663296;
    L95:
        int beyondViewportPageCount2 = $dirty & 512;
        if (beyondViewportPageCount2 == 0) goto L99;
        $dirty2 = $dirty2 | 805306368;
    L107:
        if (($dirty & 1024) == 0) goto L110;
        $dirty1 = $dirty1 | 6;
    L118:
        if (($dirty & 2048) == 0) goto L121;
        $dirty1 = $dirty1 | 48;
    L127:
        if (($dirty & 4096) == 0) goto L130;
        $dirty1 = $dirty1 | 384;
    L138:
        if (($dirty & 8192) == 0) goto L141;
        $dirty1 = $dirty1 | 3072;
    L149:
        if (($dirty & 16384) == 0) goto L152;
        $dirty1 = $dirty1 | 24576;
    L160:
        if (($dirty & 32768) == 0) goto L163;
        $dirty1 = $dirty1 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L171:
        if (($dirty & 65536) == 0) goto L174;
        $dirty1 = $dirty1 | 1572864;
    L182:
        if (($dirty2 & 306783379) == 306783378) goto L184;
    L187:
        boolean r0 = true;
    L189:
        if ($composer2.shouldExecute(r0, $dirty2 & 1) == false) goto L277;
        if (r7 == 0) goto L192;
        int beyondViewportPageCount3 = 0;
    L193:
        if (beyondViewportPageCount2 == 0) goto L195;
        float pageSpacing2 = Dp.m6973constructorimpl(0);
    L197:
        if (ComposerKt.isTraceInProgress() == false) goto L199;
        ComposerKt.traceEventStart(1125194810, $dirty2, $dirty1, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:103)");
    L199:
        if (beyondViewportPageCount3 < 0) goto L201;
        boolean value$iv = true;
    L203:
        if (value$iv == true) goto L206;
        InlineClassHelperKt.throwIllegalArgumentException("beyondViewportPageCount should be greater than or equal to 0, you selected " + beyondViewportPageCount3);
    L206:
        ComposerKt.sourceInformationMarkerStart($composer2, 1863505797, "CC(remember):LazyLayoutPager.kt#9igjgp");
        if (($dirty2 & 112) != 32) goto L209;
        boolean invalid$iv = true;
    L210:
        int beyondViewportPageCount4 = beyondViewportPageCount3;
        Object value$iv2 = $composer2.rememberedValue();
        if (invalid$iv == true) goto L217;
        if (value$iv2 == Composer.Companion.getEmpty()) goto L217;
    L218:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        int $dirty3 = $dirty2;
        int $dirty4 = $dirty1;
        Function0<PagerLazyLayoutItemProvider> r5 = rememberPagerItemProviderLambda(state, r44, r40, (Function0) value$iv2, $composer2, ((($dirty2 >> 3) & 14) | (($dirty1 >> 15) & 112)) | ($dirty1 & 896));
        ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart($composer2, -954203484, "CC(remember):Effects.kt#9igjgp");
        Object value$iv$iv = $composer2.rememberedValue();
        if (value$iv$iv != Composer.Companion.getEmpty()) goto L222;
        value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2);
        $composer2.updateRememberedValue(value$iv$iv);
    L222:
        CoroutineScope coroutineScope = (CoroutineScope) value$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 1863528465, "CC(remember):LazyLayoutPager.kt#9igjgp");
        if (($dirty3 & 112) != 32) goto L225;
        boolean invalid$iv2 = true;
    L226:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L232;
        CoroutineScope coroutineScope2 = coroutineScope;
        if (it$iv != Composer.Companion.getEmpty()) goto L234;
    L233:
        Object value$iv3 = (Function0) new LazyLayoutPagerKt$Pager$measurePolicy$1$1(state);
        $composer2.updateRememberedValue(value$iv3);
        it$iv = value$iv3;
    L234:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CoroutineScope coroutineScope3 = coroutineScope2;
        int $dirty5 = $dirty3;
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> r14 = PagerMeasurePolicyKt.m977rememberPagerMeasurePolicy8u0NR3k(r5, state, contentPadding, reverseLayout, orientation, beyondViewportPageCount4, pageSpacing2, pageSize, horizontalAlignment, verticalAlignment, snapPosition, coroutineScope3, (Function0) it$iv, $composer2, (((((((($dirty3 & 112) | ($dirty3 & 896)) | ($dirty3 & 7168)) | (57344 & $dirty3)) | (($dirty3 >> 9) & 458752)) | (($dirty3 >> 9) & 3670016)) | (($dirty4 << 21) & 29360128)) | (($dirty4 << 15) & 234881024)) | (($dirty4 << 15) & 1879048192), ($dirty4 >> 15) & 14);
        PagerState r12 = state;
        float pageSpacing3 = pageSpacing2;
        if (orientation != Orientation.Vertical) goto L237;
        boolean r3 = true;
    L238:
        LazyLayoutSemanticState semanticState = PagerSemanticsKt.rememberPagerSemanticState(r12, r3, $composer2, ($dirty5 >> 3) & 14);
        ComposerKt.sourceInformationMarkerStart($composer2, 1863533872, "CC(remember):LazyLayoutPager.kt#9igjgp");
        if (($dirty5 & 112) != 32) goto L241;
        boolean r6 = true;
    L243:
        if (($dirty5 & 458752) != 131072) goto L245;
        boolean r8 = true;
    L246:
        boolean invalid$iv3 = r6 | r8;
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv3 == true) goto L252;
        Function0<PagerLazyLayoutItemProvider> r37 = r5;
        if (it$iv2 != Composer.Companion.getEmpty()) goto L254;
    L253:
        Object value$iv4 = new PagerWrapperFlingBehavior(flingBehavior, r12);
        $composer2.updateRememberedValue(value$iv4);
        it$iv2 = value$iv4;
    L254:
        PagerWrapperFlingBehavior resolvedFlingBehavior = (PagerWrapperFlingBehavior) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ProvidableCompositionLocal<BringIntoViewSpec> r2 = BringIntoViewSpec_androidKt.getLocalBringIntoViewSpec();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r9 = $composer2.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        BringIntoViewSpec defaultBringIntoViewSpec = (BringIntoViewSpec) r9;
        ComposerKt.sourceInformationMarkerStart($composer2, 1863540023, "CC(remember):LazyLayoutPager.kt#9igjgp");
        if (($dirty5 & 112) != 32) goto L257;
        boolean r1 = true;
    L258:
        boolean invalid$iv4 = r1 | $composer2.changed(defaultBringIntoViewSpec);
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv4 == false) goto L261;
    L264:
        Object value$iv5 = new PagerBringIntoViewSpec(r12, defaultBringIntoViewSpec);
        $composer2.updateRememberedValue(value$iv5);
        it$iv3 = value$iv5;
    L265:
        PagerBringIntoViewSpec pagerBringIntoViewSpec = (PagerBringIntoViewSpec) it$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (userScrollEnabled == false) goto L268;
        $composer2.startReplaceGroup(1935359245);
        ComposerKt.sourceInformation($composer2, "148@6722L166");
        Modifier.Companion beyondBoundsModifier = LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(Modifier.Companion, PagerBeyondBoundsModifierKt.rememberPagerBeyondBoundsState(r12, beyondViewportPageCount4, $composer2, (($dirty5 >> 3) & 14) | (($dirty5 >> 21) & 112)), r12.getBeyondBoundsInfo$foundation_release(), reverseLayout, orientation);
        $composer2.endReplaceGroup();
    L269:
        Function0<PagerLazyLayoutItemProvider> r4 = r37;
        Modifier r10 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(r12.getRemeasurementModifier$foundation_release()).then(r12.getAwaitLayoutModifier$foundation_release()), r4, semanticState, orientation, userScrollEnabled, reverseLayout, $composer2, ((($dirty5 >> 3) & 7168) | (($dirty5 >> 6) & 57344)) | (458752 & ($dirty5 << 6)));
        if (orientation != Orientation.Vertical) goto L272;
        boolean r13 = true;
    L273:
        r11 = pageNestedScrollConnection;
        LazyLayoutKt.LazyLayout(r4, NestedScrollModifierKt.nestedScroll$default(dragDirectionDetector(ScrollingContainerKt.scrollingContainer(PagerKt.pagerSemantics(r10, r12, r13, coroutineScope3, userScrollEnabled).then(beyondBoundsModifier), r12, orientation, userScrollEnabled, reverseLayout, resolvedFlingBehavior, r12.getInternalInteractionSource$foundation_release(), false, overscrollEffect, pagerBringIntoViewSpec), r12), r11, null, 2, null), r12.getPrefetchState$foundation_release(), r14, $composer2, 0, 0);
        Composer $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L276;
        ComposerKt.traceEventEnd();
    L276:
        final int beyondViewportPageCount5 = beyondViewportPageCount4;
        final float pageSpacing4 = pageSpacing3;
    L278:
        ScopeUpdateScope r15 = $composer3.endRestartGroup();
        if (r15 == null) goto L282;
        final PagerState r18 = r12;
        final NestedScrollConnection r19 = r11;
        r15.updateScope(new LazyLayoutPagerKt$Pager$2(modifier, r18, contentPadding, reverseLayout, orientation, flingBehavior, userScrollEnabled, overscrollEffect, beyondViewportPageCount5, pageSpacing4, pageSize, r19, r40, horizontalAlignment, verticalAlignment, snapPosition, r44, $changed, $changed1, $dirty));
        return;
    L282:
        return;
    L272:
        r13 = false;
        goto L273
    L268:
        $composer2.startReplaceGroup(1935788068);
        $composer2.endReplaceGroup();
        beyondBoundsModifier = Modifier.Companion;
        goto L269
    L261:
        if (it$iv3 != Composer.Companion.getEmpty()) goto L265;
    L257:
        r1 = false;
        goto L258
    L252:
        r37 = r5;
        goto L253
    L245:
        r8 = false;
        goto L246
    L241:
        r6 = false;
        goto L243
    L237:
        r3 = false;
        goto L238
    L232:
        coroutineScope2 = coroutineScope;
        goto L233
    L225:
        invalid$iv2 = false;
    L217:
        value$iv2 = (Function0) new LazyLayoutPagerKt$Pager$pagerItemProvider$1$1(state);
        $composer2.updateRememberedValue(value$iv2);
        goto L218
    L209:
        invalid$iv = false;
        goto L210
    L201:
        value$iv = false;
        goto L203
    L195:
        pageSpacing2 = pageSpacing;
        goto L197
    L192:
        beyondViewportPageCount3 = beyondViewportPageCount;
        goto L193
    L277:
        r12 = state;
        $dirty5 = $dirty2;
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        beyondViewportPageCount5 = beyondViewportPageCount;
        pageSpacing4 = pageSpacing;
        goto L278
    L184:
        if ((599187 & $dirty1) != 599186) goto L187;
        r0 = false;
        goto L189
    L174:
        if (($changed1 & 1572864) != 0) goto L182;
        if ($composer2.changedInstance(r44) == false) goto L178;
        int r110 = 1048576;
    L179:
        $dirty1 = $dirty1 | r110;
        goto L182
    L178:
        r110 = 524288;
        goto L179
    L163:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L171;
        if ($composer2.changed(snapPosition) == false) goto L167;
        int r111 = 131072;
    L168:
        $dirty1 = $dirty1 | r111;
        goto L171
    L167:
        r111 = 65536;
        goto L168
    L152:
        if (($changed1 & 24576) != 0) goto L160;
        if ($composer2.changed(verticalAlignment) == false) goto L156;
        int r112 = 16384;
    L157:
        $dirty1 = $dirty1 | r112;
        goto L160
    L156:
        r112 = 8192;
        goto L157
    L141:
        if (($changed1 & 3072) != 0) goto L149;
        if ($composer2.changed(horizontalAlignment) == true) goto L146;
        r20 = 1024;
    L146:
        $dirty1 = $dirty1 | r20;
        goto L149
    L130:
        if (($changed1 & 384) != 0) goto L138;
        if ($composer2.changedInstance(r40) == true) goto L135;
        r17 = 128;
    L135:
        $dirty1 = $dirty1 | r17;
        goto L138
    L121:
        if (($changed1 & 48) != 0) goto L127;
        if ($composer2.changedInstance(r11) == false) goto L125;
        r16 = 32;
    L125:
        $dirty1 = $dirty1 | r16;
        goto L127
    L110:
        if (($changed1 & 6) != 0) goto L118;
        if ($composer2.changed(pageSize) == false) goto L114;
        int r26 = 4;
    L115:
        $dirty1 = $dirty1 | r26;
        goto L118
    L114:
        r26 = 2;
        goto L115
    L99:
        if (($changed & 805306368) != 0) goto L107;
        if ($composer2.changed(pageSpacing) == false) goto L103;
        int r27 = 536870912;
    L104:
        $dirty2 = $dirty2 | r27;
        goto L107
    L103:
        r27 = 268435456;
        goto L104
    L88:
        if (($changed & 100663296) != 0) goto L95;
        if ($composer2.changed(beyondViewportPageCount) == false) goto L92;
        int r25 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L93:
        $dirty2 = $dirty2 | r25;
        goto L95
    L92:
        r25 = 33554432;
        goto L93
    L77:
        if ((12582912 & $changed) != 0) goto L84;
        if ($composer2.changed(overscrollEffect) == false) goto L81;
        int r23 = 8388608;
    L82:
        $dirty2 = $dirty2 | r23;
        goto L84
    L81:
        r23 = 4194304;
        goto L82
    L67:
        if (($changed & 1572864) != 0) goto L74;
        if ($composer2.changed(userScrollEnabled) == false) goto L71;
        int r21 = 1048576;
    L72:
        $dirty2 = $dirty2 | r21;
        goto L74
    L71:
        r21 = 524288;
        goto L72
    L57:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L64;
        if ($composer2.changed(flingBehavior) == false) goto L61;
        int r22 = 131072;
    L62:
        $dirty2 = $dirty2 | r22;
        goto L64
    L61:
        r22 = 65536;
        goto L62
    L47:
        if (($changed & 24576) != 0) goto L54;
        if ($composer2.changed(orientation) == false) goto L51;
        int r24 = 16384;
    L52:
        $dirty2 = $dirty2 | r24;
        goto L54
    L51:
        r24 = 8192;
        goto L52
    L37:
        if (($changed & 3072) != 0) goto L44;
        if ($composer2.changed(reverseLayout) == false) goto L41;
        int r28 = 2048;
    L42:
        $dirty2 = $dirty2 | r28;
        goto L44
    L41:
        r28 = 1024;
        goto L42
    L26:
        if (($changed & 384) != 0) goto L33;
        if ($composer2.changed(contentPadding) == false) goto L30;
        int r113 = 256;
    L31:
        $dirty2 = $dirty2 | r113;
        goto L33
    L30:
        r113 = 128;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        if ($composer2.changed(state) == false) goto L20;
        int r29 = 32;
    L21:
        $dirty2 = $dirty2 | r29;
        goto L22
    L20:
        r29 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(modifier) == false) goto L10;
        int r30 = 4;
    L11:
        $dirty2 = $dirty2 | r30;
        goto L12
    L10:
        r30 = 2;
        goto L11
    }

    private static final Function0<PagerLazyLayoutItemProvider> rememberPagerItemProviderLambda(final PagerState state, Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> r17, Function1<? super Integer, ? extends Object> r18, final Function0<Integer> r19, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1372505274, "C(rememberPagerItemProviderLambda)P(3,1)260@10823L33,261@10877L25,262@10914L741:LazyLayoutPager.kt#g6yjnt");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1372505274, $changed, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:259)");
    L5:
        final State latestContent = SnapshotStateKt.rememberUpdatedState(r17, $composer, ($changed >> 3) & 14);
        final State latestKey = SnapshotStateKt.rememberUpdatedState(r18, $composer, ($changed >> 6) & 14);
        ComposerKt.sourceInformationMarkerStart($composer, 1578874657, "CC(remember):LazyLayoutPager.kt#9igjgp");
        boolean r9 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L10;
        if ($composer.changed(state) == false) goto L10;
    L11:
        boolean r8 = true;
    L13:
        boolean r10 = (r8 | $composer.changed(latestContent)) | $composer.changed(latestKey);
        if ((($changed & 7168) ^ 3072) <= 2048) goto L18;
        if ($composer.changed(r19) == false) goto L18;
    L19:
        r9 = true;
    L20:
        boolean invalid$iv = r10 | r9;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L23;
    L26:
        final State intervalContentState = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1(latestContent, latestKey, r19));
        final State itemProviderState = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$itemProviderState$1(intervalContentState, state));
        Object value$iv = (KProperty0) new LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$1(itemProviderState);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L27:
        KProperty0 r11 = (KProperty0) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventEnd();
    L30:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r11;
    L23:
        if (it$iv != Composer.Companion.getEmpty()) goto L27;
    L18:
        if (($changed & 3072) != 2048) goto L20;
    L10:
        if (($changed & 6) == 4) goto L11;
        r8 = false;
        goto L13
    }

    private static final Modifier dragDirectionDetector(Modifier $this$dragDirectionDetector, final PagerState state) {
        return $this$dragDirectionDetector.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, state, new AnonymousClass1(state)));
    }
}
