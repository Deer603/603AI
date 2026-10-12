package androidx.compose.foundation.pager;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Pager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001aâ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e21\u0010\u001f\u001a-\u0012\u0004\u0012\u00020!\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00010 ¢\u0006\u0002\b#¢\u0006\u0002\b$H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001aî\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(21\u0010\u001f\u001a-\u0012\u0004\u0012\u00020!\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00010 ¢\u0006\u0002\b#¢\u0006\u0002\b$H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001aâ\u0001\u0010+\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e21\u0010\u001f\u001a-\u0012\u0004\u0012\u00020!\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00010 ¢\u0006\u0002\b#¢\u0006\u0002\b$H\u0007ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001aî\u0001\u0010+\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(21\u0010\u001f\u001a-\u0012\u0004\u0012\u00020!\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00010 ¢\u0006\u0002\b#¢\u0006\u0002\b$H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a\u0017\u00102\u001a\u00020\u00012\f\u00103\u001a\b\u0012\u0004\u0012\u00020504H\u0082\b\u001aL\u00106\u001a\u00020\u000b*\u00020\u001e2\u0006\u00107\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u000bH\u0000\u001a,\u0010?\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u00132\u0006\u0010A\u001a\u00020B2\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"HorizontalPager", "", "state", "Landroidx/compose/foundation/pager/PagerState;", "modifier", "Landroidx/compose/ui/Modifier;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "pageSize", "Landroidx/compose/foundation/pager/PageSize;", "beyondViewportPageCount", "", "pageSpacing", "Landroidx/compose/ui/unit/Dp;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "flingBehavior", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "userScrollEnabled", "", "reverseLayout", "key", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "", "pageNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "pageContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", "page", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "HorizontalPager-oI3XNZo", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "HorizontalPager--8jOkeI", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "VerticalPager", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "VerticalPager-oI3XNZo", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "VerticalPager--8jOkeI", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "debugLog", "generateMsg", "Lkotlin/Function0;", "", "currentPageOffset", "layoutSize", "spaceBetweenPages", "beforeContentPadding", "afterContentPadding", "currentPage", "currentPageOffsetFraction", "", "pageCount", "pagerSemantics", "isVertical", "scope", "Lkotlinx/coroutines/CoroutineScope;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PagerKt {
    public static final /* synthetic */ boolean access$pagerSemantics$performBackwardPaging(PagerState $state, CoroutineScope $scope) {
        return pagerSemantics$performBackwardPaging($state, $scope);
    }

    public static final /* synthetic */ boolean access$pagerSemantics$performForwardPaging(PagerState $state, CoroutineScope $scope) {
        return pagerSemantics$performForwardPaging($state, $scope);
    }

    /* JADX INFO: renamed from: HorizontalPager--8jOkeI, reason: not valid java name */
    public static final void m969HorizontalPager8jOkeI(final PagerState state, Modifier modifier, PaddingValues contentPadding, PageSize pageSize, int beyondViewportPageCount, float pageSpacing, Alignment.Vertical verticalAlignment, TargetedFlingBehavior flingBehavior, boolean userScrollEnabled, boolean reverseLayout, Function1<? super Integer, ? extends Object> r47, NestedScrollConnection pageNestedScrollConnection, SnapPosition snapPosition, OverscrollEffect overscrollEffect, final Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> r51, Composer $composer, final int $changed, final int $changed1, final int r55) {
        Composer $composer2 = $composer.startRestartGroup(-1372972868);
        ComposerKt.sourceInformation($composer2, "C(HorizontalPager)P(12,4,1,8!1,9:c#ui.unit.Dp,14!1,13,10!1,7,11)130@7467L706:Pager.kt#g6yjnt");
        int $dirty = $changed;
        if ((r55 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r3 = r55 & 2;
        if (r3 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L23:
        int r14 = r55 & 4;
        if (r14 == 0) goto L27;
        $dirty = $dirty | 384;
        PaddingValues r4 = contentPadding;
    L34:
        int r17 = r55 & 8;
        int r18 = 1024;
        if (r17 == 0) goto L38;
        $dirty = $dirty | 3072;
        PageSize r5 = pageSize;
    L45:
        int r21 = r55 & 16;
        int r22 = 16384;
        if (r21 == 0) goto L49;
        $dirty = $dirty | 24576;
        int r7 = beyondViewportPageCount;
    L56:
        int r25 = r55 & 32;
        if (r25 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        float r8 = pageSpacing;
    L67:
        int r28 = r55 & 64;
        if (r28 == 0) goto L71;
        $dirty = $dirty | 1572864;
        Alignment.Vertical verticalAlignment2 = verticalAlignment;
    L79:
        if (($changed & 12582912) == 0) goto L81;
        TargetedFlingBehavior r12 = flingBehavior;
    L89:
        int $dirty1 = r55 & 256;
        if ($dirty1 == 0) goto L93;
        $dirty = $dirty | 100663296;
    L100:
        int r2 = r55 & 512;
        if (r2 == 0) goto L104;
        int $dirty2 = $dirty | 805306368;
        r2 = r2;
    L112:
        int $dirty3 = r55 & 1024;
        if ($dirty3 == 0) goto L117;
        int $dirty4 = $changed1 | 6;
    L125:
        if (($changed1 & 48) != 0) goto L135;
        if ((r55 & 2048) != 0) goto L132;
        if ($composer2.changedInstance(pageNestedScrollConnection) == false) goto L132;
        int r24 = 32;
    L133:
        $dirty4 = $dirty4 | r24;
    L132:
        r24 = 16;
    L135:
        int $dirty5 = $dirty4;
        int r6 = r55 & 4096;
        if (r6 == 0) goto L139;
        int $dirty6 = $dirty5 | 384;
    L147:
        if (($changed1 & 3072) != 0) goto L156;
        if ((r55 & 8192) != 0) goto L154;
        if ($composer2.changed(overscrollEffect) == false) goto L154;
        r18 = 2048;
    L154:
        $dirty6 = $dirty6 | r18;
    L156:
        int $dirty7 = $dirty6;
        if ((r55 & 16384) == 0) goto L160;
        $dirty7 = $dirty7 | 24576;
    L168:
        if (($dirty2 & 306783379) == 306783378) goto L170;
    L173:
        boolean r1 = true;
    L175:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == false) goto L239;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "120@6993L28,125@7217L57,127@7371L26");
        if (($changed & 1) != 0) goto L179;
    L191:
        if (r3 == 0) goto L193;
        modifier2 = Modifier.Companion;
    L193:
        if (r14 == 0) goto L195;
        PaddingValues contentPadding2 = PaddingKt.m718PaddingValues0680j_4(Dp.m6973constructorimpl(0));
    L196:
        if (r17 == 0) goto L198;
        PageSize pageSize2 = PageSize.Fill.INSTANCE;
    L199:
        if (r21 == 0) goto L201;
        int beyondViewportPageCount2 = 0;
    L202:
        if (r25 == 0) goto L204;
        float pageSpacing2 = Dp.m6973constructorimpl(0);
    L205:
        if (r28 == 0) goto L208;
        verticalAlignment2 = Alignment.Companion.getCenterVertically();
    L208:
        if ((r55 & 128) == 0) goto L210;
        int $dirty8 = $dirty7;
        PagerState r9 = state;
        TargetedFlingBehavior flingBehavior2 = PagerDefaults.INSTANCE.flingBehavior(r9, null, null, null, 0.0f, $composer2, ($dirty2 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
        $dirty2 = $dirty2 & (-29360129);
    L211:
        if ($dirty1 == 0) goto L213;
        boolean userScrollEnabled2 = true;
    L214:
        if (r2 == 0) goto L216;
        boolean reverseLayout2 = false;
    L217:
        if ($dirty3 == 0) goto L219;
        Function1<? super Integer, ? extends Object> r10 = null;
    L221:
        if ((r55 & 2048) == 0) goto L223;
        NestedScrollConnection pageNestedScrollConnection2 = PagerDefaults.INSTANCE.pageNestedScrollConnection(r9, Orientation.Horizontal, $composer2, ($dirty2 & 14) | 432);
        int $dirty9 = $dirty8 & (-113);
    L224:
        if (r6 == 0) goto L226;
        SnapPosition.Start snapPosition2 = SnapPosition.Start.INSTANCE;
    L228:
        if ((r55 & 8192) == 0) goto L230;
        Function1<? super Integer, ? extends Object> r13 = r10;
        int $dirty10 = $dirty9 & (-7169);
        OverscrollEffect overscrollEffect2 = OverscrollKt.rememberOverscrollEffect($composer2, 0);
        NestedScrollConnection pageNestedScrollConnection3 = pageNestedScrollConnection2;
        PageSize pageSize3 = pageSize2;
        float pageSpacing3 = pageSpacing2;
        TargetedFlingBehavior flingBehavior3 = flingBehavior2;
        Modifier r0 = modifier2;
        int $dirty11 = $dirty2;
        boolean userScrollEnabled3 = userScrollEnabled2;
        PaddingValues contentPadding3 = contentPadding2;
        Alignment.Vertical verticalAlignment3 = verticalAlignment2;
        SnapPosition snapPosition3 = snapPosition2;
        int beyondViewportPageCount3 = beyondViewportPageCount2;
    L231:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L235;
        ComposerKt.traceEventStart(-1372972868, $dirty11, $dirty10, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:129)");
    L235:
        int $dirty12 = $dirty10;
        int r19 = (((((((((($dirty11 >> 3) & 14) | 24576) | (($dirty11 << 3) & 112)) | ($dirty11 & 896)) | (($dirty11 >> 18) & 7168)) | (($dirty11 >> 6) & 458752)) | (($dirty11 >> 6) & 3670016)) | (($dirty12 << 12) & 29360128)) | (($dirty11 << 12) & 234881024)) | (($dirty11 << 12) & 1879048192);
        int r110 = ((((((($dirty11 >> 9) & 14) | 3072) | ($dirty12 & 112)) | (($dirty12 << 6) & 896)) | (($dirty11 >> 6) & 57344)) | (($dirty12 << 9) & 458752)) | (($dirty12 << 6) & 3670016);
        Modifier modifier3 = r0;
        LazyLayoutPagerKt.m965PagereLwUrMk(modifier3, state, contentPadding3, reverseLayout2, Orientation.Horizontal, flingBehavior3, userScrollEnabled3, overscrollEffect2, beyondViewportPageCount3, pageSpacing3, pageSize3, pageNestedScrollConnection3, r13, Alignment.Companion.getCenterHorizontally(), verticalAlignment3, snapPosition3, r51, $composer2, r19, r110, 0);
        Composer $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L238;
        ComposerKt.traceEventEnd();
    L238:
        int r11 = beyondViewportPageCount3;
        final TargetedFlingBehavior flingBehavior4 = flingBehavior3;
        final int beyondViewportPageCount4 = r11;
        float r15 = pageSpacing3;
        final boolean userScrollEnabled4 = userScrollEnabled3;
        final float pageSpacing4 = r15;
        Alignment.Vertical r16 = verticalAlignment3;
        final OverscrollEffect overscrollEffect3 = overscrollEffect2;
        final Alignment.Vertical verticalAlignment4 = r16;
        Function1<? super Integer, ? extends Object> r20 = r13;
        final NestedScrollConnection pageNestedScrollConnection4 = pageNestedScrollConnection3;
        final Function1<? super Integer, ? extends Object> r111 = r20;
        final PageSize pageSize4 = pageSize3;
        final SnapPosition snapPosition4 = snapPosition3;
        final boolean reverseLayout3 = reverseLayout2;
        final PaddingValues contentPadding4 = contentPadding3;
        final Modifier modifier4 = modifier3;
    L240:
        ScopeUpdateScope r23 = $composer3.endRestartGroup();
        if (r23 == null) goto L244;
        r23.updateScope(new PagerKt$HorizontalPager$1(state, modifier4, contentPadding4, pageSize4, beyondViewportPageCount4, pageSpacing4, verticalAlignment4, flingBehavior4, userScrollEnabled4, reverseLayout3, r111, pageNestedScrollConnection4, snapPosition4, overscrollEffect3, r51, $changed, $changed1, r55));
        return;
    L244:
        return;
    L230:
        r13 = r10;
        pageNestedScrollConnection3 = pageNestedScrollConnection2;
        $dirty10 = $dirty9;
        pageSize3 = pageSize2;
        pageSpacing3 = pageSpacing2;
        overscrollEffect2 = overscrollEffect;
        flingBehavior3 = flingBehavior2;
        r0 = modifier2;
        $dirty11 = $dirty2;
        userScrollEnabled3 = userScrollEnabled2;
        contentPadding3 = contentPadding2;
        verticalAlignment3 = verticalAlignment2;
        snapPosition3 = snapPosition2;
        beyondViewportPageCount3 = beyondViewportPageCount2;
        goto L231
    L226:
        snapPosition2 = snapPosition;
        goto L228
    L223:
        pageNestedScrollConnection2 = pageNestedScrollConnection;
        $dirty9 = $dirty8;
        goto L224
    L219:
        r10 = r47;
        goto L221
    L216:
        reverseLayout2 = reverseLayout;
        goto L217
    L213:
        userScrollEnabled2 = userScrollEnabled;
        goto L214
    L210:
        r9 = state;
        $dirty8 = $dirty7;
        flingBehavior2 = r12;
        goto L211
    L204:
        pageSpacing2 = r8;
        goto L205
    L201:
        beyondViewportPageCount2 = r7;
        goto L202
    L198:
        pageSize2 = r5;
        goto L199
    L195:
        contentPadding2 = r4;
        goto L196
    L179:
        if ($composer2.getDefaultsInvalid() == true) goto L191;
        $composer2.skipToGroupEnd();
        if ((r55 & 128) == 0) goto L185;
        $dirty2 = $dirty2 & (-29360129);
    L185:
        if ((r55 & 2048) == 0) goto L188;
        $dirty7 = $dirty7 & (-113);
    L188:
        if ((r55 & 8192) == 0) goto L190;
        $dirty7 = $dirty7 & (-7169);
    L190:
        reverseLayout2 = reverseLayout;
        pageNestedScrollConnection3 = pageNestedScrollConnection;
        contentPadding3 = r4;
        pageSize3 = r5;
        pageSpacing3 = r8;
        flingBehavior3 = r12;
        verticalAlignment3 = verticalAlignment2;
        userScrollEnabled3 = userScrollEnabled;
        r13 = r47;
        snapPosition3 = snapPosition;
        $dirty10 = $dirty7;
        beyondViewportPageCount3 = r7;
        r0 = modifier2;
        $dirty11 = $dirty2;
        overscrollEffect2 = overscrollEffect;
        goto L231
    L239:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        userScrollEnabled4 = userScrollEnabled;
        reverseLayout3 = reverseLayout;
        r111 = r47;
        overscrollEffect3 = overscrollEffect;
        contentPadding4 = r4;
        pageSize4 = r5;
        beyondViewportPageCount4 = r7;
        pageSpacing4 = r8;
        flingBehavior4 = r12;
        modifier4 = modifier2;
        verticalAlignment4 = verticalAlignment2;
        pageNestedScrollConnection4 = pageNestedScrollConnection;
        snapPosition4 = snapPosition;
        goto L240
    L170:
        if (($dirty7 & 9363) != 9362) goto L173;
        r1 = false;
        goto L175
    L160:
        if (($changed1 & 24576) != 0) goto L168;
        if ($composer2.changedInstance(r51) == true) goto L165;
        r22 = 8192;
    L165:
        $dirty7 = $dirty7 | r22;
        goto L168
    L139:
        if (($changed1 & 384) == 0) goto L141;
        $dirty6 = $dirty5;
        goto L147
    L141:
        if ($composer2.changed(snapPosition) == false) goto L143;
        int r29 = 256;
    L144:
        $dirty6 = $dirty5 | r29;
        goto L147
    L143:
        r29 = 128;
        goto L144
    L117:
        if (($changed1 & 6) == 0) goto L119;
        $dirty4 = $changed1;
        goto L125
    L119:
        if ($composer2.changedInstance(r47) == false) goto L121;
        int r26 = 4;
    L122:
        $dirty4 = $changed1 | r26;
        goto L125
    L121:
        r26 = 2;
        goto L122
    L104:
        if (($changed & 805306368) != 0) goto L111;
        if ($composer2.changed(reverseLayout) == false) goto L108;
        int r34 = 536870912;
    L109:
        $dirty = $dirty | r34;
        goto L111
    L108:
        r34 = 268435456;
    L111:
        $dirty2 = $dirty;
        goto L112
    L93:
        if (($changed & 100663296) != 0) goto L100;
        if ($composer2.changed(userScrollEnabled) == false) goto L97;
        int r33 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty = $dirty | r33;
        goto L100
    L97:
        r33 = 33554432;
        goto L98
    L81:
        if ((r55 & 128) != 0) goto L85;
        r12 = flingBehavior;
        if ($composer2.changed(r12) == false) goto L86;
        int r31 = 8388608;
    L87:
        $dirty = $dirty | r31;
    L86:
        r31 = 4194304;
        goto L87
    L85:
        r12 = flingBehavior;
        goto L86
    L71:
        if (($changed & 1572864) != 0) goto L77;
        verticalAlignment2 = verticalAlignment;
        if ($composer2.changed(verticalAlignment2) == false) goto L75;
        int r30 = 1048576;
    L76:
        $dirty = $dirty | r30;
        goto L79
    L75:
        r30 = 524288;
        goto L76
    L77:
        verticalAlignment2 = verticalAlignment;
        goto L79
    L60:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L66;
        r8 = pageSpacing;
        if ($composer2.changed(r8) == false) goto L64;
        int r210 = 131072;
    L65:
        $dirty = $dirty | r210;
        goto L67
    L64:
        r210 = 65536;
        goto L65
    L66:
        r8 = pageSpacing;
        goto L67
    L49:
        if (($changed & 24576) != 0) goto L55;
        r7 = beyondViewportPageCount;
        if ($composer2.changed(r7) == false) goto L53;
        int r27 = 16384;
    L54:
        $dirty = $dirty | r27;
        goto L56
    L53:
        r27 = 8192;
        goto L54
    L55:
        r7 = beyondViewportPageCount;
        goto L56
    L38:
        if (($changed & 3072) != 0) goto L44;
        r5 = pageSize;
        if ($composer2.changed(r5) == false) goto L42;
        int r211 = 2048;
    L43:
        $dirty = $dirty | r211;
        goto L45
    L42:
        r211 = 1024;
        goto L43
    L44:
        r5 = pageSize;
        goto L45
    L27:
        if (($changed & 384) != 0) goto L33;
        r4 = contentPadding;
        if ($composer2.changed(r4) == false) goto L31;
        int r112 = 256;
    L32:
        $dirty = $dirty | r112;
        goto L34
    L31:
        r112 = 128;
        goto L32
    L33:
        r4 = contentPadding;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r113 = 32;
    L21:
        $dirty = $dirty | r113;
        goto L23
    L20:
        r113 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(state) == false) goto L10;
        int r32 = 4;
    L11:
        $dirty = $dirty | r32;
        goto L12
    L10:
        r32 = 2;
        goto L11
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /* JADX INFO: renamed from: HorizontalPager-oI3XNZo, reason: not valid java name */
    public static final /* synthetic */ void m970HorizontalPageroI3XNZo(final PagerState state, Modifier modifier, PaddingValues contentPadding, PageSize pageSize, int beyondViewportPageCount, float pageSpacing, Alignment.Vertical verticalAlignment, TargetedFlingBehavior flingBehavior, boolean userScrollEnabled, boolean reverseLayout, Function1 key, NestedScrollConnection pageNestedScrollConnection, SnapPosition snapPosition, final Function4 pageContent, Composer $composer, final int $changed, final int $changed1, final int r52) {
        Composer $composer2 = $composer.startRestartGroup(1870896258);
        ComposerKt.sourceInformation($composer2, "C(HorizontalPager)P(11,4,1,7!1,8:c#ui.unit.Dp,13!1,12,9!1,6,10)184@9633L26,170@9080L620:Pager.kt#g6yjnt");
        int $dirty = $changed;
        if ((r52 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r3 = r52 & 2;
        if (r3 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier r8 = modifier;
    L23:
        int r13 = r52 & 4;
        int r16 = 128;
        if (r13 == 0) goto L27;
        $dirty = $dirty | 384;
        PaddingValues r4 = contentPadding;
    L34:
        int r17 = r52 & 8;
        int r18 = 1024;
        if (r17 == 0) goto L38;
        $dirty = $dirty | 3072;
        PageSize r5 = pageSize;
    L45:
        int r21 = r52 & 16;
        if (r21 == 0) goto L49;
        $dirty = $dirty | 24576;
        int r6 = beyondViewportPageCount;
    L56:
        int r23 = r52 & 32;
        if (r23 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        float r7 = pageSpacing;
    L67:
        int r26 = r52 & 64;
        if (r26 == 0) goto L71;
        $dirty = $dirty | 1572864;
        Alignment.Vertical verticalAlignment2 = verticalAlignment;
    L79:
        if (($changed & 12582912) == 0) goto L81;
        TargetedFlingBehavior r12 = flingBehavior;
    L89:
        int $dirty1 = r52 & 256;
        if ($dirty1 == 0) goto L93;
        $dirty = $dirty | 100663296;
    L100:
        int r2 = r52 & 512;
        if (r2 == 0) goto L104;
        int $dirty2 = $dirty | 805306368;
        r2 = r2;
    L112:
        int $dirty3 = r52 & 1024;
        if ($dirty3 == 0) goto L117;
        int $dirty4 = $changed1 | 6;
    L125:
        if (($changed1 & 48) != 0) goto L135;
        if ((r52 & 2048) != 0) goto L132;
        if ($composer2.changedInstance(pageNestedScrollConnection) == false) goto L132;
        int r22 = 32;
    L133:
        $dirty4 = $dirty4 | r22;
    L132:
        r22 = 16;
    L135:
        int $dirty5 = $dirty4;
        int r9 = r52 & 4096;
        if (r9 == 0) goto L139;
        int $dirty6 = $dirty5 | 384;
    L146:
        if ((r52 & 8192) == 0) goto L149;
        $dirty6 = $dirty6 | 3072;
    L156:
        if (($dirty2 & 306783379) == 306783378) goto L158;
    L161:
        boolean r1 = true;
    L163:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == false) goto L221;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "161@8676L28,166@8900L57");
        if (($changed & 1) != 0) goto L167;
    L176:
        if (r3 == 0) goto L178;
        Modifier modifier2 = Modifier.Companion;
    L179:
        if (r13 == 0) goto L181;
        PaddingValues contentPadding2 = PaddingKt.m718PaddingValues0680j_4(Dp.m6973constructorimpl(0));
    L182:
        if (r17 == 0) goto L184;
        PageSize pageSize2 = PageSize.Fill.INSTANCE;
    L185:
        if (r21 == 0) goto L187;
        int beyondViewportPageCount2 = 0;
    L188:
        if (r23 == 0) goto L190;
        float pageSpacing2 = Dp.m6973constructorimpl(0);
    L191:
        if (r26 == 0) goto L194;
        verticalAlignment2 = Alignment.Companion.getCenterVertically();
    L194:
        if ((r52 & 128) == 0) goto L196;
        Composer $composer3 = $composer2;
        int $dirty7 = $dirty6;
        PagerState r10 = state;
        TargetedFlingBehavior flingBehavior2 = PagerDefaults.INSTANCE.flingBehavior(r10, null, null, null, 0.0f, $composer3, ($dirty2 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
        $dirty2 = $dirty2 & (-29360129);
    L197:
        if ($dirty1 == 0) goto L199;
        boolean userScrollEnabled2 = true;
    L200:
        if (r2 == 0) goto L202;
        boolean reverseLayout2 = false;
    L203:
        if ($dirty3 == 0) goto L205;
        Function1 key2 = null;
    L207:
        if ((r52 & 2048) == 0) goto L209;
        NestedScrollConnection pageNestedScrollConnection2 = PagerDefaults.INSTANCE.pageNestedScrollConnection(r10, Orientation.Horizontal, $composer3, ($dirty2 & 14) | 432);
        $dirty7 = $dirty7 & (-113);
    L210:
        if (r9 == 0) goto L212;
        boolean userScrollEnabled3 = userScrollEnabled2;
        Function1 key3 = key2;
        NestedScrollConnection pageNestedScrollConnection3 = pageNestedScrollConnection2;
        SnapPosition snapPosition2 = SnapPosition.Start.INSTANCE;
        PaddingValues contentPadding3 = contentPadding2;
        int $dirty8 = $dirty7;
        int beyondViewportPageCount3 = beyondViewportPageCount2;
        float pageSpacing3 = pageSpacing2;
        int $dirty9 = $dirty2;
        TargetedFlingBehavior flingBehavior3 = flingBehavior2;
        boolean r0 = reverseLayout2;
        PageSize pageSize3 = pageSize2;
    L213:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L217;
        ComposerKt.traceEventStart(1870896258, $dirty9, $dirty8, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:169)");
    L217:
        Modifier modifier3 = modifier2;
        boolean reverseLayout3 = r0;
        Composer $composer4 = $composer3;
        Alignment.Vertical verticalAlignment3 = verticalAlignment2;
        m969HorizontalPager8jOkeI(state, modifier3, contentPadding3, pageSize3, beyondViewportPageCount3, pageSpacing3, verticalAlignment3, flingBehavior3, userScrollEnabled3, reverseLayout3, key3, pageNestedScrollConnection3, snapPosition2, OverscrollKt.rememberOverscrollEffect($composer3, 0), pageContent, $composer4, (((((((($dirty9 & 896) | (($dirty9 & 14) | ($dirty9 & 112))) | ($dirty9 & 7168)) | (57344 & $dirty9)) | (458752 & $dirty9)) | (3670016 & $dirty9)) | (29360128 & $dirty9)) | (234881024 & $dirty9)) | (1879048192 & $dirty9), ((($dirty8 & 14) | ($dirty8 & 112)) | ($dirty8 & 896)) | (($dirty8 << 3) & 57344), 0);
        Composer $composer5 = $composer4;
        if (ComposerKt.isTraceInProgress() == false) goto L220;
        ComposerKt.traceEventEnd();
    L220:
        final SnapPosition snapPosition3 = snapPosition2;
        final NestedScrollConnection pageNestedScrollConnection4 = pageNestedScrollConnection3;
        final Function1 key4 = key3;
        final boolean reverseLayout4 = reverseLayout3;
        final boolean reverseLayout5 = userScrollEnabled3;
        final TargetedFlingBehavior flingBehavior4 = flingBehavior3;
        final Alignment.Vertical verticalAlignment4 = verticalAlignment3;
        final float pageSpacing4 = pageSpacing3;
        final int beyondViewportPageCount4 = beyondViewportPageCount3;
        final PageSize pageSize4 = pageSize3;
        final PaddingValues contentPadding4 = contentPadding3;
        final Modifier modifier4 = modifier3;
    L222:
        ScopeUpdateScope r11 = $composer5.endRestartGroup();
        if (r11 == null) goto L226;
        r11.updateScope(new PagerKt$HorizontalPager$2(state, modifier4, contentPadding4, pageSize4, beyondViewportPageCount4, pageSpacing4, verticalAlignment4, flingBehavior4, reverseLayout5, reverseLayout4, key4, pageNestedScrollConnection4, snapPosition3, pageContent, $changed, $changed1, r52));
        return;
    L226:
        return;
    L212:
        snapPosition2 = snapPosition;
        flingBehavior3 = flingBehavior2;
        userScrollEnabled3 = userScrollEnabled2;
        r0 = reverseLayout2;
        key3 = key2;
        pageNestedScrollConnection3 = pageNestedScrollConnection2;
        contentPadding3 = contentPadding2;
        $dirty8 = $dirty7;
        pageSize3 = pageSize2;
        beyondViewportPageCount3 = beyondViewportPageCount2;
        pageSpacing3 = pageSpacing2;
        $dirty9 = $dirty2;
        goto L213
    L209:
        pageNestedScrollConnection2 = pageNestedScrollConnection;
        goto L210
    L205:
        key2 = key;
        goto L207
    L202:
        reverseLayout2 = reverseLayout;
        goto L203
    L199:
        userScrollEnabled2 = userScrollEnabled;
        goto L200
    L196:
        r10 = state;
        $composer3 = $composer2;
        $dirty7 = $dirty6;
        flingBehavior2 = r12;
        goto L197
    L190:
        pageSpacing2 = r7;
        goto L191
    L187:
        beyondViewportPageCount2 = r6;
        goto L188
    L184:
        pageSize2 = r5;
        goto L185
    L181:
        contentPadding2 = r4;
        goto L182
    L178:
        modifier2 = r8;
        goto L179
    L167:
        if ($composer2.getDefaultsInvalid() == true) goto L176;
        $composer2.skipToGroupEnd();
        if ((r52 & 128) == 0) goto L173;
        $dirty2 = $dirty2 & (-29360129);
    L173:
        if ((r52 & 2048) == 0) goto L175;
        $dirty6 = $dirty6 & (-113);
    L175:
        key3 = key;
        pageNestedScrollConnection3 = pageNestedScrollConnection;
        $dirty8 = $dirty6;
        contentPadding3 = r4;
        pageSize3 = r5;
        beyondViewportPageCount3 = r6;
        pageSpacing3 = r7;
        modifier2 = r8;
        flingBehavior3 = r12;
        $composer3 = $composer2;
        $dirty9 = $dirty2;
        userScrollEnabled3 = userScrollEnabled;
        r0 = reverseLayout;
        snapPosition2 = snapPosition;
        goto L213
    L221:
        $composer5 = $composer2;
        $composer5.skipToGroupEnd();
        reverseLayout5 = userScrollEnabled;
        reverseLayout4 = reverseLayout;
        key4 = key;
        snapPosition3 = snapPosition;
        contentPadding4 = r4;
        pageSize4 = r5;
        beyondViewportPageCount4 = r6;
        pageSpacing4 = r7;
        modifier4 = r8;
        flingBehavior4 = r12;
        verticalAlignment4 = verticalAlignment2;
        pageNestedScrollConnection4 = pageNestedScrollConnection;
        goto L222
    L158:
        if (($dirty6 & 1171) != 1170) goto L161;
        r1 = false;
        goto L163
    L149:
        if (($changed1 & 3072) != 0) goto L156;
        if ($composer2.changedInstance(pageContent) == false) goto L153;
        r18 = 2048;
    L153:
        $dirty6 = $dirty6 | r18;
        goto L156
    L139:
        if (($changed1 & 384) == 0) goto L141;
        $dirty6 = $dirty5;
        goto L146
    L141:
        if ($composer2.changed(snapPosition) == false) goto L143;
        r16 = 256;
    L143:
        $dirty6 = $dirty5 | r16;
        goto L146
    L117:
        if (($changed1 & 6) == 0) goto L119;
        $dirty4 = $changed1;
        goto L125
    L119:
        if ($composer2.changedInstance(key) == false) goto L121;
        int r20 = 4;
    L122:
        $dirty4 = $changed1 | r20;
        goto L125
    L121:
        r20 = 2;
        goto L122
    L104:
        if (($changed & 805306368) != 0) goto L111;
        if ($composer2.changed(reverseLayout) == false) goto L108;
        int r32 = 536870912;
    L109:
        $dirty = $dirty | r32;
        goto L111
    L108:
        r32 = 268435456;
    L111:
        $dirty2 = $dirty;
        goto L112
    L93:
        if (($changed & 100663296) != 0) goto L100;
        if ($composer2.changed(userScrollEnabled) == false) goto L97;
        int r31 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty = $dirty | r31;
        goto L100
    L97:
        r31 = 33554432;
        goto L98
    L81:
        if ((r52 & 128) != 0) goto L85;
        r12 = flingBehavior;
        if ($composer2.changed(r12) == false) goto L86;
        int r29 = 8388608;
    L87:
        $dirty = $dirty | r29;
    L86:
        r29 = 4194304;
        goto L87
    L85:
        r12 = flingBehavior;
        goto L86
    L71:
        if (($changed & 1572864) != 0) goto L77;
        verticalAlignment2 = verticalAlignment;
        if ($composer2.changed(verticalAlignment2) == false) goto L75;
        int r28 = 1048576;
    L76:
        $dirty = $dirty | r28;
        goto L79
    L75:
        r28 = 524288;
        goto L76
    L77:
        verticalAlignment2 = verticalAlignment;
        goto L79
    L60:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L66;
        r7 = pageSpacing;
        if ($composer2.changed(r7) == false) goto L64;
        int r27 = 131072;
    L65:
        $dirty = $dirty | r27;
        goto L67
    L64:
        r27 = 65536;
        goto L65
    L66:
        r7 = pageSpacing;
        goto L67
    L49:
        if (($changed & 24576) != 0) goto L55;
        r6 = beyondViewportPageCount;
        if ($composer2.changed(r6) == false) goto L53;
        int r24 = 16384;
    L54:
        $dirty = $dirty | r24;
        goto L56
    L53:
        r24 = 8192;
        goto L54
    L55:
        r6 = beyondViewportPageCount;
        goto L56
    L38:
        if (($changed & 3072) != 0) goto L44;
        r5 = pageSize;
        if ($composer2.changed(r5) == false) goto L42;
        int r25 = 2048;
    L43:
        $dirty = $dirty | r25;
        goto L45
    L42:
        r25 = 1024;
        goto L43
    L44:
        r5 = pageSize;
        goto L45
    L27:
        if (($changed & 384) != 0) goto L33;
        r4 = contentPadding;
        if ($composer2.changed(r4) == false) goto L31;
        int r19 = 256;
    L32:
        $dirty = $dirty | r19;
        goto L34
    L31:
        r19 = 128;
        goto L32
    L33:
        r4 = contentPadding;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L22;
        r8 = modifier;
        if ($composer2.changed(r8) == false) goto L20;
        int r14 = 32;
    L21:
        $dirty = $dirty | r14;
        goto L23
    L20:
        r14 = 16;
        goto L21
    L22:
        r8 = modifier;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(state) == false) goto L10;
        int r15 = 4;
    L11:
        $dirty = $dirty | r15;
        goto L12
    L10:
        r15 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: VerticalPager--8jOkeI, reason: not valid java name */
    public static final void m971VerticalPager8jOkeI(final PagerState state, Modifier modifier, PaddingValues contentPadding, PageSize pageSize, int beyondViewportPageCount, float pageSpacing, Alignment.Horizontal horizontalAlignment, TargetedFlingBehavior flingBehavior, boolean userScrollEnabled, boolean reverseLayout, Function1<? super Integer, ? extends Object> r47, NestedScrollConnection pageNestedScrollConnection, SnapPosition snapPosition, OverscrollEffect overscrollEffect, final Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> r51, Composer $composer, final int $changed, final int $changed1, final int r55) {
        Composer $composer2 = $composer.startRestartGroup(632853564);
        ComposerKt.sourceInformation($composer2, "C(VerticalPager)P(13,5,1,9!1,10:c#ui.unit.Dp,3!1,14,11!1,8,12)260@14392L704:Pager.kt#g6yjnt");
        int $dirty = $changed;
        if ((r55 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r3 = r55 & 2;
        if (r3 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L23:
        int r14 = r55 & 4;
        if (r14 == 0) goto L27;
        $dirty = $dirty | 384;
        PaddingValues r4 = contentPadding;
    L34:
        int r17 = r55 & 8;
        int r18 = 1024;
        if (r17 == 0) goto L38;
        $dirty = $dirty | 3072;
        PageSize r5 = pageSize;
    L45:
        int r21 = r55 & 16;
        int r22 = 16384;
        if (r21 == 0) goto L49;
        $dirty = $dirty | 24576;
        int r7 = beyondViewportPageCount;
    L56:
        int r25 = r55 & 32;
        if (r25 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        float r8 = pageSpacing;
    L67:
        int r28 = r55 & 64;
        if (r28 == 0) goto L71;
        $dirty = $dirty | 1572864;
        Alignment.Horizontal horizontalAlignment2 = horizontalAlignment;
    L79:
        if (($changed & 12582912) == 0) goto L81;
        TargetedFlingBehavior r12 = flingBehavior;
    L89:
        int $dirty1 = r55 & 256;
        if ($dirty1 == 0) goto L93;
        $dirty = $dirty | 100663296;
    L100:
        int r2 = r55 & 512;
        if (r2 == 0) goto L104;
        int $dirty2 = $dirty | 805306368;
        r2 = r2;
    L112:
        int $dirty3 = r55 & 1024;
        if ($dirty3 == 0) goto L117;
        int $dirty4 = $changed1 | 6;
    L125:
        if (($changed1 & 48) != 0) goto L135;
        if ((r55 & 2048) != 0) goto L132;
        if ($composer2.changedInstance(pageNestedScrollConnection) == false) goto L132;
        int r24 = 32;
    L133:
        $dirty4 = $dirty4 | r24;
    L132:
        r24 = 16;
    L135:
        int $dirty5 = $dirty4;
        int r6 = r55 & 4096;
        if (r6 == 0) goto L139;
        int $dirty6 = $dirty5 | 384;
    L147:
        if (($changed1 & 3072) != 0) goto L156;
        if ((r55 & 8192) != 0) goto L154;
        if ($composer2.changed(overscrollEffect) == false) goto L154;
        r18 = 2048;
    L154:
        $dirty6 = $dirty6 | r18;
    L156:
        int $dirty7 = $dirty6;
        if ((r55 & 16384) == 0) goto L160;
        $dirty7 = $dirty7 | 24576;
    L168:
        if (($dirty2 & 306783379) == 306783378) goto L170;
    L173:
        boolean r1 = true;
    L175:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == false) goto L239;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "250@13920L28,255@14144L55,257@14296L26");
        if (($changed & 1) != 0) goto L179;
    L191:
        if (r3 == 0) goto L193;
        modifier2 = Modifier.Companion;
    L193:
        if (r14 == 0) goto L195;
        PaddingValues contentPadding2 = PaddingKt.m718PaddingValues0680j_4(Dp.m6973constructorimpl(0));
    L196:
        if (r17 == 0) goto L198;
        PageSize pageSize2 = PageSize.Fill.INSTANCE;
    L199:
        if (r21 == 0) goto L201;
        int beyondViewportPageCount2 = 0;
    L202:
        if (r25 == 0) goto L204;
        float pageSpacing2 = Dp.m6973constructorimpl(0);
    L205:
        if (r28 == 0) goto L208;
        horizontalAlignment2 = Alignment.Companion.getCenterHorizontally();
    L208:
        if ((r55 & 128) == 0) goto L210;
        int $dirty8 = $dirty7;
        PagerState r9 = state;
        TargetedFlingBehavior flingBehavior2 = PagerDefaults.INSTANCE.flingBehavior(r9, null, null, null, 0.0f, $composer2, ($dirty2 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
        $dirty2 = $dirty2 & (-29360129);
    L211:
        if ($dirty1 == 0) goto L213;
        boolean userScrollEnabled2 = true;
    L214:
        if (r2 == 0) goto L216;
        boolean reverseLayout2 = false;
    L217:
        if ($dirty3 == 0) goto L219;
        Function1<? super Integer, ? extends Object> r10 = null;
    L221:
        if ((r55 & 2048) == 0) goto L223;
        NestedScrollConnection pageNestedScrollConnection2 = PagerDefaults.INSTANCE.pageNestedScrollConnection(r9, Orientation.Vertical, $composer2, ($dirty2 & 14) | 432);
        int $dirty9 = $dirty8 & (-113);
    L224:
        if (r6 == 0) goto L226;
        SnapPosition.Start snapPosition2 = SnapPosition.Start.INSTANCE;
    L228:
        if ((r55 & 8192) == 0) goto L230;
        Function1<? super Integer, ? extends Object> r13 = r10;
        int $dirty10 = $dirty9 & (-7169);
        OverscrollEffect overscrollEffect2 = OverscrollKt.rememberOverscrollEffect($composer2, 0);
        NestedScrollConnection pageNestedScrollConnection3 = pageNestedScrollConnection2;
        PageSize pageSize3 = pageSize2;
        float pageSpacing3 = pageSpacing2;
        TargetedFlingBehavior flingBehavior3 = flingBehavior2;
        Modifier r0 = modifier2;
        Alignment.Horizontal horizontalAlignment3 = horizontalAlignment2;
        boolean userScrollEnabled3 = userScrollEnabled2;
        SnapPosition snapPosition3 = snapPosition2;
        PaddingValues contentPadding3 = contentPadding2;
        int beyondViewportPageCount3 = beyondViewportPageCount2;
        int $dirty11 = $dirty2;
    L231:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L235;
        ComposerKt.traceEventStart(632853564, $dirty11, $dirty10, "androidx.compose.foundation.pager.VerticalPager (Pager.kt:259)");
    L235:
        int $dirty12 = $dirty10;
        int r19 = (((((((((($dirty11 >> 3) & 14) | 24576) | (($dirty11 << 3) & 112)) | ($dirty11 & 896)) | (($dirty11 >> 18) & 7168)) | (($dirty11 >> 6) & 458752)) | (($dirty11 >> 6) & 3670016)) | (($dirty12 << 12) & 29360128)) | (($dirty11 << 12) & 234881024)) | (($dirty11 << 12) & 1879048192);
        int r110 = ((((((($dirty11 >> 9) & 14) | 24576) | ($dirty12 & 112)) | (($dirty12 << 6) & 896)) | (($dirty11 >> 9) & 7168)) | (($dirty12 << 9) & 458752)) | (($dirty12 << 6) & 3670016);
        Modifier modifier3 = r0;
        LazyLayoutPagerKt.m965PagereLwUrMk(modifier3, state, contentPadding3, reverseLayout2, Orientation.Vertical, flingBehavior3, userScrollEnabled3, overscrollEffect2, beyondViewportPageCount3, pageSpacing3, pageSize3, pageNestedScrollConnection3, r13, horizontalAlignment3, Alignment.Companion.getCenterVertically(), snapPosition3, r51, $composer2, r19, r110, 0);
        Composer $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L238;
        ComposerKt.traceEventEnd();
    L238:
        int r11 = beyondViewportPageCount3;
        final TargetedFlingBehavior flingBehavior4 = flingBehavior3;
        final int beyondViewportPageCount4 = r11;
        float r15 = pageSpacing3;
        final boolean userScrollEnabled4 = userScrollEnabled3;
        final float pageSpacing4 = r15;
        Function1<? super Integer, ? extends Object> r16 = r13;
        final NestedScrollConnection pageNestedScrollConnection4 = pageNestedScrollConnection3;
        final Function1<? super Integer, ? extends Object> r111 = r16;
        final OverscrollEffect overscrollEffect3 = overscrollEffect2;
        final PageSize pageSize4 = pageSize3;
        final Alignment.Horizontal horizontalAlignment4 = horizontalAlignment3;
        final SnapPosition snapPosition4 = snapPosition3;
        final boolean reverseLayout3 = reverseLayout2;
        final PaddingValues contentPadding4 = contentPadding3;
        final Modifier modifier4 = modifier3;
    L240:
        ScopeUpdateScope r20 = $composer3.endRestartGroup();
        if (r20 == null) goto L244;
        r20.updateScope(new PagerKt$VerticalPager$1(state, modifier4, contentPadding4, pageSize4, beyondViewportPageCount4, pageSpacing4, horizontalAlignment4, flingBehavior4, userScrollEnabled4, reverseLayout3, r111, pageNestedScrollConnection4, snapPosition4, overscrollEffect3, r51, $changed, $changed1, r55));
        return;
    L244:
        return;
    L230:
        r13 = r10;
        pageNestedScrollConnection3 = pageNestedScrollConnection2;
        $dirty10 = $dirty9;
        pageSize3 = pageSize2;
        pageSpacing3 = pageSpacing2;
        overscrollEffect2 = overscrollEffect;
        flingBehavior3 = flingBehavior2;
        r0 = modifier2;
        horizontalAlignment3 = horizontalAlignment2;
        userScrollEnabled3 = userScrollEnabled2;
        snapPosition3 = snapPosition2;
        contentPadding3 = contentPadding2;
        beyondViewportPageCount3 = beyondViewportPageCount2;
        $dirty11 = $dirty2;
        goto L231
    L226:
        snapPosition2 = snapPosition;
        goto L228
    L223:
        pageNestedScrollConnection2 = pageNestedScrollConnection;
        $dirty9 = $dirty8;
        goto L224
    L219:
        r10 = r47;
        goto L221
    L216:
        reverseLayout2 = reverseLayout;
        goto L217
    L213:
        userScrollEnabled2 = userScrollEnabled;
        goto L214
    L210:
        r9 = state;
        $dirty8 = $dirty7;
        flingBehavior2 = r12;
        goto L211
    L204:
        pageSpacing2 = r8;
        goto L205
    L201:
        beyondViewportPageCount2 = r7;
        goto L202
    L198:
        pageSize2 = r5;
        goto L199
    L195:
        contentPadding2 = r4;
        goto L196
    L179:
        if ($composer2.getDefaultsInvalid() == true) goto L191;
        $composer2.skipToGroupEnd();
        if ((r55 & 128) == 0) goto L185;
        $dirty2 = $dirty2 & (-29360129);
    L185:
        if ((r55 & 2048) == 0) goto L188;
        $dirty7 = $dirty7 & (-113);
    L188:
        if ((r55 & 8192) == 0) goto L190;
        $dirty7 = $dirty7 & (-7169);
    L190:
        reverseLayout2 = reverseLayout;
        pageNestedScrollConnection3 = pageNestedScrollConnection;
        contentPadding3 = r4;
        pageSize3 = r5;
        pageSpacing3 = r8;
        flingBehavior3 = r12;
        $dirty11 = $dirty2;
        userScrollEnabled3 = userScrollEnabled;
        r13 = r47;
        $dirty10 = $dirty7;
        beyondViewportPageCount3 = r7;
        r0 = modifier2;
        horizontalAlignment3 = horizontalAlignment2;
        snapPosition3 = snapPosition;
        overscrollEffect2 = overscrollEffect;
        goto L231
    L239:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        userScrollEnabled4 = userScrollEnabled;
        reverseLayout3 = reverseLayout;
        r111 = r47;
        overscrollEffect3 = overscrollEffect;
        contentPadding4 = r4;
        pageSize4 = r5;
        beyondViewportPageCount4 = r7;
        pageSpacing4 = r8;
        flingBehavior4 = r12;
        modifier4 = modifier2;
        horizontalAlignment4 = horizontalAlignment2;
        pageNestedScrollConnection4 = pageNestedScrollConnection;
        snapPosition4 = snapPosition;
        goto L240
    L170:
        if (($dirty7 & 9363) != 9362) goto L173;
        r1 = false;
        goto L175
    L160:
        if (($changed1 & 24576) != 0) goto L168;
        if ($composer2.changedInstance(r51) == true) goto L165;
        r22 = 8192;
    L165:
        $dirty7 = $dirty7 | r22;
        goto L168
    L139:
        if (($changed1 & 384) == 0) goto L141;
        $dirty6 = $dirty5;
        goto L147
    L141:
        if ($composer2.changed(snapPosition) == false) goto L143;
        int r29 = 256;
    L144:
        $dirty6 = $dirty5 | r29;
        goto L147
    L143:
        r29 = 128;
        goto L144
    L117:
        if (($changed1 & 6) == 0) goto L119;
        $dirty4 = $changed1;
        goto L125
    L119:
        if ($composer2.changedInstance(r47) == false) goto L121;
        int r23 = 4;
    L122:
        $dirty4 = $changed1 | r23;
        goto L125
    L121:
        r23 = 2;
        goto L122
    L104:
        if (($changed & 805306368) != 0) goto L111;
        if ($composer2.changed(reverseLayout) == false) goto L108;
        int r34 = 536870912;
    L109:
        $dirty = $dirty | r34;
        goto L111
    L108:
        r34 = 268435456;
    L111:
        $dirty2 = $dirty;
        goto L112
    L93:
        if (($changed & 100663296) != 0) goto L100;
        if ($composer2.changed(userScrollEnabled) == false) goto L97;
        int r33 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty = $dirty | r33;
        goto L100
    L97:
        r33 = 33554432;
        goto L98
    L81:
        if ((r55 & 128) != 0) goto L85;
        r12 = flingBehavior;
        if ($composer2.changed(r12) == false) goto L86;
        int r31 = 8388608;
    L87:
        $dirty = $dirty | r31;
    L86:
        r31 = 4194304;
        goto L87
    L85:
        r12 = flingBehavior;
        goto L86
    L71:
        if (($changed & 1572864) != 0) goto L77;
        horizontalAlignment2 = horizontalAlignment;
        if ($composer2.changed(horizontalAlignment2) == false) goto L75;
        int r30 = 1048576;
    L76:
        $dirty = $dirty | r30;
        goto L79
    L75:
        r30 = 524288;
        goto L76
    L77:
        horizontalAlignment2 = horizontalAlignment;
        goto L79
    L60:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L66;
        r8 = pageSpacing;
        if ($composer2.changed(r8) == false) goto L64;
        int r210 = 131072;
    L65:
        $dirty = $dirty | r210;
        goto L67
    L64:
        r210 = 65536;
        goto L65
    L66:
        r8 = pageSpacing;
        goto L67
    L49:
        if (($changed & 24576) != 0) goto L55;
        r7 = beyondViewportPageCount;
        if ($composer2.changed(r7) == false) goto L53;
        int r26 = 16384;
    L54:
        $dirty = $dirty | r26;
        goto L56
    L53:
        r26 = 8192;
        goto L54
    L55:
        r7 = beyondViewportPageCount;
        goto L56
    L38:
        if (($changed & 3072) != 0) goto L44;
        r5 = pageSize;
        if ($composer2.changed(r5) == false) goto L42;
        int r27 = 2048;
    L43:
        $dirty = $dirty | r27;
        goto L45
    L42:
        r27 = 1024;
        goto L43
    L44:
        r5 = pageSize;
        goto L45
    L27:
        if (($changed & 384) != 0) goto L33;
        r4 = contentPadding;
        if ($composer2.changed(r4) == false) goto L31;
        int r112 = 256;
    L32:
        $dirty = $dirty | r112;
        goto L34
    L31:
        r112 = 128;
        goto L32
    L33:
        r4 = contentPadding;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r113 = 32;
    L21:
        $dirty = $dirty | r113;
        goto L23
    L20:
        r113 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(state) == false) goto L10;
        int r32 = 4;
    L11:
        $dirty = $dirty | r32;
        goto L12
    L10:
        r32 = 2;
        goto L11
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /* JADX INFO: renamed from: VerticalPager-oI3XNZo, reason: not valid java name */
    public static final /* synthetic */ void m972VerticalPageroI3XNZo(final PagerState state, Modifier modifier, PaddingValues contentPadding, PageSize pageSize, int beyondViewportPageCount, float pageSpacing, Alignment.Horizontal horizontalAlignment, TargetedFlingBehavior flingBehavior, boolean userScrollEnabled, boolean reverseLayout, Function1 key, NestedScrollConnection pageNestedScrollConnection, SnapPosition snapPosition, final Function4 pageContent, Composer $composer, final int $changed, final int $changed1, final int r52) {
        Composer $composer2 = $composer.startRestartGroup(909160706);
        ComposerKt.sourceInformation($composer2, "C(VerticalPager)P(12,5,1,8!1,9:c#ui.unit.Dp,3!1,13,10!1,7,11)314@16560L26,300@16005L622:Pager.kt#g6yjnt");
        int $dirty = $changed;
        if ((r52 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r3 = r52 & 2;
        if (r3 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier r8 = modifier;
    L23:
        int r13 = r52 & 4;
        int r16 = 128;
        if (r13 == 0) goto L27;
        $dirty = $dirty | 384;
        PaddingValues r4 = contentPadding;
    L34:
        int r17 = r52 & 8;
        int r18 = 1024;
        if (r17 == 0) goto L38;
        $dirty = $dirty | 3072;
        PageSize r5 = pageSize;
    L45:
        int r21 = r52 & 16;
        if (r21 == 0) goto L49;
        $dirty = $dirty | 24576;
        int r6 = beyondViewportPageCount;
    L56:
        int r23 = r52 & 32;
        if (r23 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        float r7 = pageSpacing;
    L67:
        int r26 = r52 & 64;
        if (r26 == 0) goto L71;
        $dirty = $dirty | 1572864;
        Alignment.Horizontal horizontalAlignment2 = horizontalAlignment;
    L79:
        if (($changed & 12582912) == 0) goto L81;
        TargetedFlingBehavior r12 = flingBehavior;
    L89:
        int $dirty1 = r52 & 256;
        if ($dirty1 == 0) goto L93;
        $dirty = $dirty | 100663296;
    L100:
        int r2 = r52 & 512;
        if (r2 == 0) goto L104;
        int $dirty2 = $dirty | 805306368;
        r2 = r2;
    L112:
        int $dirty3 = r52 & 1024;
        if ($dirty3 == 0) goto L117;
        int $dirty4 = $changed1 | 6;
    L125:
        if (($changed1 & 48) != 0) goto L135;
        if ((r52 & 2048) != 0) goto L132;
        if ($composer2.changedInstance(pageNestedScrollConnection) == false) goto L132;
        int r22 = 32;
    L133:
        $dirty4 = $dirty4 | r22;
    L132:
        r22 = 16;
    L135:
        int $dirty5 = $dirty4;
        int r9 = r52 & 4096;
        if (r9 == 0) goto L139;
        int $dirty6 = $dirty5 | 384;
    L146:
        if ((r52 & 8192) == 0) goto L149;
        $dirty6 = $dirty6 | 3072;
    L156:
        if (($dirty2 & 306783379) == 306783378) goto L158;
    L161:
        boolean r1 = true;
    L163:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == false) goto L221;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "291@15603L28,296@15827L55");
        if (($changed & 1) != 0) goto L167;
    L176:
        if (r3 == 0) goto L178;
        Modifier modifier2 = Modifier.Companion;
    L179:
        if (r13 == 0) goto L181;
        PaddingValues contentPadding2 = PaddingKt.m718PaddingValues0680j_4(Dp.m6973constructorimpl(0));
    L182:
        if (r17 == 0) goto L184;
        PageSize pageSize2 = PageSize.Fill.INSTANCE;
    L185:
        if (r21 == 0) goto L187;
        int beyondViewportPageCount2 = 0;
    L188:
        if (r23 == 0) goto L190;
        float pageSpacing2 = Dp.m6973constructorimpl(0);
    L191:
        if (r26 == 0) goto L194;
        horizontalAlignment2 = Alignment.Companion.getCenterHorizontally();
    L194:
        if ((r52 & 128) == 0) goto L196;
        Composer $composer3 = $composer2;
        int $dirty7 = $dirty6;
        PagerState r10 = state;
        TargetedFlingBehavior flingBehavior2 = PagerDefaults.INSTANCE.flingBehavior(r10, null, null, null, 0.0f, $composer3, ($dirty2 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
        $dirty2 = $dirty2 & (-29360129);
    L197:
        if ($dirty1 == 0) goto L199;
        boolean userScrollEnabled2 = true;
    L200:
        if (r2 == 0) goto L202;
        boolean reverseLayout2 = false;
    L203:
        if ($dirty3 == 0) goto L205;
        Function1 key2 = null;
    L207:
        if ((r52 & 2048) == 0) goto L209;
        NestedScrollConnection pageNestedScrollConnection2 = PagerDefaults.INSTANCE.pageNestedScrollConnection(r10, Orientation.Vertical, $composer3, ($dirty2 & 14) | 432);
        $dirty7 = $dirty7 & (-113);
    L210:
        if (r9 == 0) goto L212;
        boolean userScrollEnabled3 = userScrollEnabled2;
        Function1 key3 = key2;
        NestedScrollConnection pageNestedScrollConnection3 = pageNestedScrollConnection2;
        SnapPosition snapPosition2 = SnapPosition.Start.INSTANCE;
        PaddingValues contentPadding3 = contentPadding2;
        int $dirty8 = $dirty7;
        int beyondViewportPageCount3 = beyondViewportPageCount2;
        float pageSpacing3 = pageSpacing2;
        int $dirty9 = $dirty2;
        TargetedFlingBehavior flingBehavior3 = flingBehavior2;
        boolean r0 = reverseLayout2;
        PageSize pageSize3 = pageSize2;
    L213:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L217;
        ComposerKt.traceEventStart(909160706, $dirty9, $dirty8, "androidx.compose.foundation.pager.VerticalPager (Pager.kt:299)");
    L217:
        Modifier modifier3 = modifier2;
        boolean reverseLayout3 = r0;
        Composer $composer4 = $composer3;
        Alignment.Horizontal horizontalAlignment3 = horizontalAlignment2;
        m971VerticalPager8jOkeI(state, modifier3, contentPadding3, pageSize3, beyondViewportPageCount3, pageSpacing3, horizontalAlignment3, flingBehavior3, userScrollEnabled3, reverseLayout3, key3, pageNestedScrollConnection3, snapPosition2, OverscrollKt.rememberOverscrollEffect($composer3, 0), pageContent, $composer4, (((((((($dirty9 & 896) | (($dirty9 & 14) | ($dirty9 & 112))) | ($dirty9 & 7168)) | (57344 & $dirty9)) | (458752 & $dirty9)) | (3670016 & $dirty9)) | (29360128 & $dirty9)) | (234881024 & $dirty9)) | (1879048192 & $dirty9), ((($dirty8 & 14) | ($dirty8 & 112)) | ($dirty8 & 896)) | (($dirty8 << 3) & 57344), 0);
        Composer $composer5 = $composer4;
        if (ComposerKt.isTraceInProgress() == false) goto L220;
        ComposerKt.traceEventEnd();
    L220:
        final SnapPosition snapPosition3 = snapPosition2;
        final NestedScrollConnection pageNestedScrollConnection4 = pageNestedScrollConnection3;
        final Function1 key4 = key3;
        final boolean reverseLayout4 = reverseLayout3;
        final boolean reverseLayout5 = userScrollEnabled3;
        final TargetedFlingBehavior flingBehavior4 = flingBehavior3;
        final Alignment.Horizontal horizontalAlignment4 = horizontalAlignment3;
        final float pageSpacing4 = pageSpacing3;
        final int beyondViewportPageCount4 = beyondViewportPageCount3;
        final PageSize pageSize4 = pageSize3;
        final PaddingValues contentPadding4 = contentPadding3;
        final Modifier modifier4 = modifier3;
    L222:
        ScopeUpdateScope r11 = $composer5.endRestartGroup();
        if (r11 == null) goto L226;
        r11.updateScope(new PagerKt$VerticalPager$2(state, modifier4, contentPadding4, pageSize4, beyondViewportPageCount4, pageSpacing4, horizontalAlignment4, flingBehavior4, reverseLayout5, reverseLayout4, key4, pageNestedScrollConnection4, snapPosition3, pageContent, $changed, $changed1, r52));
        return;
    L226:
        return;
    L212:
        snapPosition2 = snapPosition;
        flingBehavior3 = flingBehavior2;
        userScrollEnabled3 = userScrollEnabled2;
        r0 = reverseLayout2;
        key3 = key2;
        pageNestedScrollConnection3 = pageNestedScrollConnection2;
        contentPadding3 = contentPadding2;
        $dirty8 = $dirty7;
        pageSize3 = pageSize2;
        beyondViewportPageCount3 = beyondViewportPageCount2;
        pageSpacing3 = pageSpacing2;
        $dirty9 = $dirty2;
        goto L213
    L209:
        pageNestedScrollConnection2 = pageNestedScrollConnection;
        goto L210
    L205:
        key2 = key;
        goto L207
    L202:
        reverseLayout2 = reverseLayout;
        goto L203
    L199:
        userScrollEnabled2 = userScrollEnabled;
        goto L200
    L196:
        r10 = state;
        $composer3 = $composer2;
        $dirty7 = $dirty6;
        flingBehavior2 = r12;
        goto L197
    L190:
        pageSpacing2 = r7;
        goto L191
    L187:
        beyondViewportPageCount2 = r6;
        goto L188
    L184:
        pageSize2 = r5;
        goto L185
    L181:
        contentPadding2 = r4;
        goto L182
    L178:
        modifier2 = r8;
        goto L179
    L167:
        if ($composer2.getDefaultsInvalid() == true) goto L176;
        $composer2.skipToGroupEnd();
        if ((r52 & 128) == 0) goto L173;
        $dirty2 = $dirty2 & (-29360129);
    L173:
        if ((r52 & 2048) == 0) goto L175;
        $dirty6 = $dirty6 & (-113);
    L175:
        key3 = key;
        pageNestedScrollConnection3 = pageNestedScrollConnection;
        $dirty8 = $dirty6;
        contentPadding3 = r4;
        pageSize3 = r5;
        beyondViewportPageCount3 = r6;
        pageSpacing3 = r7;
        modifier2 = r8;
        flingBehavior3 = r12;
        $composer3 = $composer2;
        $dirty9 = $dirty2;
        userScrollEnabled3 = userScrollEnabled;
        r0 = reverseLayout;
        snapPosition2 = snapPosition;
        goto L213
    L221:
        $composer5 = $composer2;
        $composer5.skipToGroupEnd();
        reverseLayout5 = userScrollEnabled;
        reverseLayout4 = reverseLayout;
        key4 = key;
        snapPosition3 = snapPosition;
        contentPadding4 = r4;
        pageSize4 = r5;
        beyondViewportPageCount4 = r6;
        pageSpacing4 = r7;
        modifier4 = r8;
        flingBehavior4 = r12;
        horizontalAlignment4 = horizontalAlignment2;
        pageNestedScrollConnection4 = pageNestedScrollConnection;
        goto L222
    L158:
        if (($dirty6 & 1171) != 1170) goto L161;
        r1 = false;
        goto L163
    L149:
        if (($changed1 & 3072) != 0) goto L156;
        if ($composer2.changedInstance(pageContent) == false) goto L153;
        r18 = 2048;
    L153:
        $dirty6 = $dirty6 | r18;
        goto L156
    L139:
        if (($changed1 & 384) == 0) goto L141;
        $dirty6 = $dirty5;
        goto L146
    L141:
        if ($composer2.changed(snapPosition) == false) goto L143;
        r16 = 256;
    L143:
        $dirty6 = $dirty5 | r16;
        goto L146
    L117:
        if (($changed1 & 6) == 0) goto L119;
        $dirty4 = $changed1;
        goto L125
    L119:
        if ($composer2.changedInstance(key) == false) goto L121;
        int r20 = 4;
    L122:
        $dirty4 = $changed1 | r20;
        goto L125
    L121:
        r20 = 2;
        goto L122
    L104:
        if (($changed & 805306368) != 0) goto L111;
        if ($composer2.changed(reverseLayout) == false) goto L108;
        int r32 = 536870912;
    L109:
        $dirty = $dirty | r32;
        goto L111
    L108:
        r32 = 268435456;
    L111:
        $dirty2 = $dirty;
        goto L112
    L93:
        if (($changed & 100663296) != 0) goto L100;
        if ($composer2.changed(userScrollEnabled) == false) goto L97;
        int r31 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty = $dirty | r31;
        goto L100
    L97:
        r31 = 33554432;
        goto L98
    L81:
        if ((r52 & 128) != 0) goto L85;
        r12 = flingBehavior;
        if ($composer2.changed(r12) == false) goto L86;
        int r29 = 8388608;
    L87:
        $dirty = $dirty | r29;
    L86:
        r29 = 4194304;
        goto L87
    L85:
        r12 = flingBehavior;
        goto L86
    L71:
        if (($changed & 1572864) != 0) goto L77;
        horizontalAlignment2 = horizontalAlignment;
        if ($composer2.changed(horizontalAlignment2) == false) goto L75;
        int r28 = 1048576;
    L76:
        $dirty = $dirty | r28;
        goto L79
    L75:
        r28 = 524288;
        goto L76
    L77:
        horizontalAlignment2 = horizontalAlignment;
        goto L79
    L60:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L66;
        r7 = pageSpacing;
        if ($composer2.changed(r7) == false) goto L64;
        int r27 = 131072;
    L65:
        $dirty = $dirty | r27;
        goto L67
    L64:
        r27 = 65536;
        goto L65
    L66:
        r7 = pageSpacing;
        goto L67
    L49:
        if (($changed & 24576) != 0) goto L55;
        r6 = beyondViewportPageCount;
        if ($composer2.changed(r6) == false) goto L53;
        int r24 = 16384;
    L54:
        $dirty = $dirty | r24;
        goto L56
    L53:
        r24 = 8192;
        goto L54
    L55:
        r6 = beyondViewportPageCount;
        goto L56
    L38:
        if (($changed & 3072) != 0) goto L44;
        r5 = pageSize;
        if ($composer2.changed(r5) == false) goto L42;
        int r25 = 2048;
    L43:
        $dirty = $dirty | r25;
        goto L45
    L42:
        r25 = 1024;
        goto L43
    L44:
        r5 = pageSize;
        goto L45
    L27:
        if (($changed & 384) != 0) goto L33;
        r4 = contentPadding;
        if ($composer2.changed(r4) == false) goto L31;
        int r19 = 256;
    L32:
        $dirty = $dirty | r19;
        goto L34
    L31:
        r19 = 128;
        goto L32
    L33:
        r4 = contentPadding;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L22;
        r8 = modifier;
        if ($composer2.changed(r8) == false) goto L20;
        int r14 = 32;
    L21:
        $dirty = $dirty | r14;
        goto L23
    L20:
        r14 = 16;
        goto L21
    L22:
        r8 = modifier;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(state) == false) goto L10;
        int r15 = 4;
    L11:
        $dirty = $dirty | r15;
        goto L12
    L10:
        r15 = 2;
        goto L11
    }

    public static final int currentPageOffset(SnapPosition $this$currentPageOffset, int layoutSize, int pageSize, int spaceBetweenPages, int beforeContentPadding, int afterContentPadding, int currentPage, float currentPageOffsetFraction, int pageCount) {
        int snapOffset = $this$currentPageOffset.position(layoutSize, pageSize, beforeContentPadding, afterContentPadding, currentPage, pageCount);
        return MathKt.roundToInt(snapOffset - ((pageSize + spaceBetweenPages) * currentPageOffsetFraction));
    }

    private static final boolean pagerSemantics$performForwardPaging(PagerState $state, CoroutineScope $scope) {
        if ($state.getCanScrollForward() == false) goto L6;
        BuildersKt.launch$default($scope, null, null, new PagerKt$pagerSemantics$performForwardPaging$1($state, null), 3, null);
        return true;
    L6:
        return false;
    }

    private static final boolean pagerSemantics$performBackwardPaging(PagerState $state, CoroutineScope $scope) {
        if ($state.getCanScrollBackward() == false) goto L6;
        BuildersKt.launch$default($scope, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1($state, null), 3, null);
        return true;
    L6:
        return false;
    }

    public static final Modifier pagerSemantics(Modifier $this$pagerSemantics, final PagerState state, final boolean isVertical, final CoroutineScope scope, boolean userScrollEnabled) {
        if (userScrollEnabled == false) goto L5;
        return $this$pagerSemantics.then(SemanticsModifierKt.semantics$default(Modifier.Companion, false, new AnonymousClass1(isVertical, state, scope), 1, null));
    L5:
        return $this$pagerSemantics.then(Modifier.Companion);
    }

    private static final void debugLog(Function0<String> r1) {
    }
}
