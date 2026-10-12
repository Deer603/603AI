package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Constraints;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: PagerMeasurePolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a¡\u0001\u0010\u0000\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\b\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"rememberPagerMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "state", "Landroidx/compose/foundation/pager/PagerState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "beyondViewportPageCount", "", "pageSpacing", "Landroidx/compose/ui/unit/Dp;", "pageSize", "Landroidx/compose/foundation/pager/PageSize;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "pageCount", "rememberPagerMeasurePolicy-8u0NR3k", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PagerMeasurePolicyKt {
    /* JADX INFO: renamed from: rememberPagerMeasurePolicy-8u0NR3k, reason: not valid java name */
    public static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> m977rememberPagerMeasurePolicy8u0NR3k(final Function0<PagerLazyLayoutItemProvider> r24, PagerState state, PaddingValues contentPadding, boolean reverseLayout, Orientation orientation, int beyondViewportPageCount, float pageSpacing, PageSize pageSize, Alignment.Horizontal horizontalAlignment, Alignment.Vertical verticalAlignment, SnapPosition snapPosition, final CoroutineScope coroutineScope, Function0<Integer> r36, Composer $composer, int $changed, int $changed1) {
        ComposerKt.sourceInformationMarkerStart($composer, 1391419623, "C(rememberPagerMeasurePolicy)P(4,11,1,9,5!1,8:c#ui.unit.Dp,7,3,12,10)57@2305L7411:PagerMeasurePolicy.kt#g6yjnt");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1391419623, $changed, $changed1, "androidx.compose.foundation.pager.rememberPagerMeasurePolicy (PagerMeasurePolicy.kt:57)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 35233522, "CC(remember):PagerMeasurePolicy.kt#9igjgp");
        if ((($changed & 112) ^ 48) <= 32) goto L10;
        final PagerState r8 = state;
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
        Orientation r9 = orientation;
        if ($composer.changed(r9) == false) goto L42;
    L43:
        boolean r12 = true;
    L45:
        boolean r13 = r7 | r12;
        if (((234881024 & $changed) ^ 100663296) <= 67108864) goto L50;
        Alignment.Horizontal r14 = horizontalAlignment;
        if ($composer.changed(r14) == false) goto L52;
    L53:
        boolean r15 = true;
    L55:
        boolean r16 = r13 | r15;
        if (((1879048192 & $changed) ^ 805306368) <= 536870912) goto L60;
        Alignment.Vertical r17 = verticalAlignment;
        if ($composer.changed(r17) == false) goto L62;
    L63:
        boolean r18 = true;
    L65:
        boolean r19 = r16 | r18;
        if (((3670016 & $changed) ^ 1572864) <= 1048576) goto L70;
        float r110 = pageSpacing;
        if ($composer.changed(r110) == false) goto L72;
    L73:
        boolean r111 = true;
    L75:
        boolean r20 = r19 | r111;
        if (((29360128 & $changed) ^ 12582912) <= 8388608) goto L80;
        PageSize r112 = pageSize;
        if ($composer.changed(r112) == false) goto L82;
    L83:
        boolean r21 = true;
    L85:
        boolean r22 = r20 | r21;
        if ((($changed1 & 14) ^ 6) <= 4) goto L90;
        SnapPosition r23 = snapPosition;
        if ($composer.changed(r23) == false) goto L92;
    L93:
        boolean r25 = true;
    L95:
        boolean r26 = r22 | r25;
        if ((($changed1 & 896) ^ 384) <= 256) goto L100;
        final Function0<Integer> r113 = r36;
        if ($composer.changed(r113) == false) goto L102;
    L103:
        boolean r27 = true;
    L105:
        boolean r28 = r26 | r27;
        if (((458752 & $changed) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) goto L110;
        int r29 = beyondViewportPageCount;
        if ($composer.changed(r29) == false) goto L112;
    L113:
        boolean r114 = true;
    L115:
        boolean invalid$iv = (r28 | r114) | $composer.changed(coroutineScope);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == true) goto L122;
        if (it$iv == Composer.Companion.getEmpty()) goto L122;
    L123:
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> r0 = (Function2) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L126;
        ComposerKt.traceEventEnd();
    L126:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    L122:
        final SnapPosition r115 = r23;
        final int r116 = r29;
        final Alignment.Horizontal r117 = r14;
        final Orientation r30 = r9;
        final Alignment.Vertical r118 = r17;
        final float r119 = r110;
        final PageSize r120 = r112;
        Object value$iv = (Function2) new PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(r8, r30, r10, r11, r119, r120, r24, r113, r118, r117, r116, r115, coroutineScope);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L112:
        if ((196608 & $changed) == 131072) goto L113;
        r114 = false;
        goto L115
    L110:
        r29 = beyondViewportPageCount;
    L102:
        if (($changed1 & 384) == 256) goto L103;
        r27 = false;
        goto L105
    L100:
        r113 = r36;
    L92:
        if (($changed1 & 6) == 4) goto L93;
        r25 = false;
        goto L95
    L90:
        r23 = snapPosition;
    L82:
        if ((12582912 & $changed) == 8388608) goto L83;
        r21 = false;
        goto L85
    L80:
        r112 = pageSize;
    L72:
        if ((1572864 & $changed) == 1048576) goto L73;
        r111 = false;
        goto L75
    L70:
        r110 = pageSpacing;
    L62:
        if ((805306368 & $changed) == 536870912) goto L63;
        r18 = false;
        goto L65
    L60:
        r17 = verticalAlignment;
    L52:
        if ((100663296 & $changed) == 67108864) goto L53;
        r15 = false;
        goto L55
    L50:
        r14 = horizontalAlignment;
    L42:
        if (($changed & 24576) == 16384) goto L43;
        r12 = false;
        goto L45
    L40:
        r9 = orientation;
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
