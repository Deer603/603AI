package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: PagerState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000m\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\r\u001a(\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0003\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0015H\u0082\b\u001a/\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\n2\b\b\u0003\u0010\u001c\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0015H\u0007¢\u0006\u0002\u0010\u001d\u001aO\u0010\u001e\u001a\u00020\u0017*\u00020\u001f2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00132\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130#2\u001d\u0010$\u001a\u0019\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00170%¢\u0006\u0002\b'H\u0082@¢\u0006\u0002\u0010(\u001a\u0012\u0010)\u001a\u00020\u0017*\u00020\u0010H\u0080@¢\u0006\u0002\u0010*\u001a\u0012\u0010+\u001a\u00020\u0017*\u00020\u0010H\u0080@¢\u0006\u0002\u0010*\u001a\u0014\u0010,\u001a\u00020-*\u00020.2\u0006\u0010\u0014\u001a\u00020\nH\u0000\u001a\u0014\u0010/\u001a\u00020-*\u00020\u00062\u0006\u0010\u0014\u001a\u00020\nH\u0002\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u00060"}, d2 = {"DefaultPositionThreshold", "Landroidx/compose/ui/unit/Dp;", "getDefaultPositionThreshold", "()F", "F", "EmptyLayoutInfo", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "getEmptyLayoutInfo", "()Landroidx/compose/foundation/pager/PagerMeasureResult;", "MaxPagesForAnimateScroll", "", "PagesToPrefetch", "UnitDensity", "androidx/compose/foundation/pager/PagerStateKt$UnitDensity$1", "Landroidx/compose/foundation/pager/PagerStateKt$UnitDensity$1;", "PagerState", "Landroidx/compose/foundation/pager/PagerState;", "currentPage", "currentPageOffsetFraction", "", "pageCount", "Lkotlin/Function0;", "debugLog", "", "generateMsg", "", "rememberPagerState", "initialPage", "initialPageOffsetFraction", "(IFLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/pager/PagerState;", "animateScrollToPage", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "targetPage", "targetPageOffsetToSnappedPosition", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "updateTargetPage", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;IFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToNextPage", "(Landroidx/compose/foundation/pager/PagerState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToPreviousPage", "calculateNewMaxScrollOffset", "", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "calculateNewMinScrollOffset", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PagerStateKt {
    private static final float DefaultPositionThreshold = 0.0f;
    private static final PagerMeasureResult EmptyLayoutInfo = null;
    private static final int MaxPagesForAnimateScroll = 3;
    public static final int PagesToPrefetch = 1;
    private static final PagerStateKt$UnitDensity$1 UnitDensity = null;

    public static final /* synthetic */ Object access$animateScrollToPage(LazyLayoutScrollScope $receiver, int targetPage, float targetPageOffsetToSnappedPosition, AnimationSpec animationSpec, Function2 updateTargetPage, Continuation $completion) {
        return animateScrollToPage($receiver, targetPage, targetPageOffsetToSnappedPosition, animationSpec, updateTargetPage, $completion);
    }

    public static final /* synthetic */ long access$calculateNewMinScrollOffset(PagerMeasureResult $receiver, int pageCount) {
        return calculateNewMinScrollOffset($receiver, pageCount);
    }

    public static final /* synthetic */ PagerStateKt$UnitDensity$1 access$getUnitDensity$p() {
        return UnitDensity;
    }

    public static final PagerState rememberPagerState(final int initialPage, final float initialPageOffsetFraction, final Function0<Integer> r10, Composer $composer, int $changed, int r13) {
        ComposerKt.sourceInformationMarkerStart($composer, -1210768637, "C(rememberPagerState)*88@4038L92,88@3988L142:PagerState.kt#g6yjnt");
        if ((r13 & 1) == 0) goto L6;
        initialPage = 0;
    L6:
        if ((r13 & 2) == 0) goto L9;
        initialPageOffsetFraction = 0.0f;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-1210768637, $changed, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:87)");
    L11:
        boolean r14 = false;
        Object[] r0 = new Object[0];
        Saver<DefaultPagerState, ?> r1 = DefaultPagerState.Companion.getSaver();
        ComposerKt.sourceInformationMarkerStart($composer, 17134108, "CC(remember):PagerState.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L16;
        if ($composer.changed(initialPage) == false) goto L16;
    L17:
        boolean r2 = true;
    L20:
        if ((($changed & 112) ^ 48) <= 32) goto L24;
        if ($composer.changed(initialPageOffsetFraction) == false) goto L24;
    L25:
        boolean r3 = true;
    L27:
        boolean r4 = r2 | r3;
        if ((($changed & 896) ^ 384) <= 256) goto L32;
        if ($composer.changed(r10) == false) goto L32;
    L33:
        r14 = true;
    L34:
        boolean invalid$iv = r14 | r4;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L37;
    L40:
        Object value$iv = (Function0) new PagerStateKt$rememberPagerState$1$1(initialPage, initialPageOffsetFraction, r10);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L41:
        ComposerKt.sourceInformationMarkerEnd($composer);
        Object r11 = RememberSaveableKt.m3923rememberSaveable(r0, r1, null, (Function0) it$iv, $composer, 0, 4);
        DefaultPagerState $this$rememberPagerState_u24lambda_u241 = (DefaultPagerState) r11;
        $this$rememberPagerState_u24lambda_u241.getPageCountState().setValue(r10);
        DefaultPagerState r12 = (DefaultPagerState) r11;
        if (ComposerKt.isTraceInProgress() == false) goto L44;
        ComposerKt.traceEventEnd();
    L44:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r12;
    L37:
        if (it$iv != Composer.Companion.getEmpty()) goto L41;
    L32:
        if (($changed & 384) != 256) goto L34;
    L24:
        if (($changed & 48) == 32) goto L25;
        r3 = false;
    L16:
        if (($changed & 6) == 4) goto L17;
        r2 = false;
        goto L20
    }

    public static /* synthetic */ PagerState PagerState$default(int r0, float r1, Function0 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r0 = 0;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r1 = 0.0f;
    L9:
        return PagerState(r0, r1, r2);
    }

    public static final PagerState PagerState(int currentPage, float currentPageOffsetFraction, Function0<Integer> r3) {
        return new DefaultPagerState(currentPage, currentPageOffsetFraction, r3);
    }

    public static final Object animateToNextPage(PagerState $this$animateToNextPage, Continuation<? super Unit> r9) {
        if (($this$animateToNextPage.getCurrentPage() + 1) >= $this$animateToNextPage.getPageCount()) goto L10;
        Object r8 = PagerState.animateScrollToPage$default($this$animateToNextPage, $this$animateToNextPage.getCurrentPage() + 1, 0.0f, null, r9, 6, null);
        if (r8 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L8;
        return r8;
    L8:
        return Unit.INSTANCE;
    L10:
        return Unit.INSTANCE;
    }

    public static final Object animateToPreviousPage(PagerState $this$animateToPreviousPage, Continuation<? super Unit> r9) {
        if (($this$animateToPreviousPage.getCurrentPage() - 1) < 0) goto L10;
        Object r8 = PagerState.animateScrollToPage$default($this$animateToPreviousPage, $this$animateToPreviousPage.getCurrentPage() - 1, 0.0f, null, r9, 6, null);
        if (r8 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L8;
        return r8;
    L8:
        return Unit.INSTANCE;
    L10:
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1] */
    static {
        DefaultPositionThreshold = Dp.m6973constructorimpl(56);
        List r2 = CollectionsKt.emptyList();
        Orientation r6 = Orientation.Horizontal;
        SnapPosition.Start r0 = SnapPosition.Start.INSTANCE;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r7 = 0;
        int r8 = 0;
        boolean r9 = false;
        int r10 = 0;
        MeasuredPage r11 = null;
        MeasuredPage r12 = null;
        float r13 = 0.0f;
        int r14 = 0;
        boolean r15 = false;
        EmptyLayoutInfo = new PagerMeasureResult(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, new PagerStateKt$EmptyLayoutInfo$1(), false, null, null, CoroutineScopeKt.CoroutineScope(EmptyCoroutineContext.INSTANCE), 393216, null);
        UnitDensity = new PagerStateKt$UnitDensity$1();
    }

    public static final float getDefaultPositionThreshold() {
        return DefaultPositionThreshold;
    }

    public static final PagerMeasureResult getEmptyLayoutInfo() {
        return EmptyLayoutInfo;
    }

    private static final void debugLog(Function0<String> r1) {
    }

    public static final long calculateNewMaxScrollOffset(PagerLayoutInfo $this$calculateNewMaxScrollOffset, int pageCount) {
        int pageSizeWithSpacing = $this$calculateNewMaxScrollOffset.getPageSpacing() + $this$calculateNewMaxScrollOffset.getPageSize();
        long maxScrollPossible = (((((long) pageCount) * ((long) pageSizeWithSpacing)) + ((long) $this$calculateNewMaxScrollOffset.getBeforeContentPadding())) + ((long) $this$calculateNewMaxScrollOffset.getAfterContentPadding())) - ((long) $this$calculateNewMaxScrollOffset.getPageSpacing());
        if ($this$calculateNewMaxScrollOffset.getOrientation() != Orientation.Horizontal) goto L5;
        long arg0$iv = $this$calculateNewMaxScrollOffset.mo973getViewportSizeYbymL2g();
        int r6 = (int) (arg0$iv >> 32);
    L6:
        int layoutSize = r6;
        int snapPositionDiscount = layoutSize - RangesKt.coerceIn($this$calculateNewMaxScrollOffset.getSnapPosition().position(layoutSize, $this$calculateNewMaxScrollOffset.getPageSize(), $this$calculateNewMaxScrollOffset.getBeforeContentPadding(), $this$calculateNewMaxScrollOffset.getAfterContentPadding(), pageCount - 1, pageCount), 0, layoutSize);
        return RangesKt.coerceAtLeast(maxScrollPossible - ((long) snapPositionDiscount), 0);
    L5:
        long arg0$iv2 = $this$calculateNewMaxScrollOffset.mo973getViewportSizeYbymL2g();
        r6 = (int) (4294967295L & arg0$iv2);
        goto L6
    }

    private static final long calculateNewMinScrollOffset(PagerMeasureResult $this$calculateNewMinScrollOffset, int pageCount) {
        if ($this$calculateNewMinScrollOffset.getOrientation() != Orientation.Horizontal) goto L5;
        long arg0$iv = $this$calculateNewMinScrollOffset.mo973getViewportSizeYbymL2g();
        int r3 = (int) (arg0$iv >> 32);
    L6:
        int layoutSize = r3;
        return RangesKt.coerceIn($this$calculateNewMinScrollOffset.getSnapPosition().position(layoutSize, $this$calculateNewMinScrollOffset.getPageSize(), $this$calculateNewMinScrollOffset.getBeforeContentPadding(), $this$calculateNewMinScrollOffset.getAfterContentPadding(), 0, pageCount), 0, layoutSize);
    L5:
        long arg0$iv2 = $this$calculateNewMinScrollOffset.mo973getViewportSizeYbymL2g();
        r3 = (int) (4294967295L & arg0$iv2);
        goto L6
    }

    private static final Object animateScrollToPage(final LazyLayoutScrollScope $this$animateScrollToPage, int targetPage, float targetPageOffsetToSnappedPosition, AnimationSpec<Float> r16, Function2<? super ScrollScope, ? super Integer, Unit> r17, Continuation<? super Unit> r18) {
        r17.invoke($this$animateScrollToPage, Boxing.boxInt(targetPage));
        if (targetPage <= $this$animateScrollToPage.getFirstVisibleItemIndex()) goto L5;
        boolean forward = true;
    L6:
        int visiblePages = ($this$animateScrollToPage.getLastVisibleItemIndex() - $this$animateScrollToPage.getFirstVisibleItemIndex()) + 1;
        if (forward == true) goto L9;
    L10:
        if (forward == false) goto L12;
    L19:
        float displacement = LazyLayoutScrollScope.calculateDistanceTo$default($this$animateScrollToPage, targetPage, 0, 2, null) + targetPageOffsetToSnappedPosition;
        final Ref.FloatRef previousValue = new Ref.FloatRef();
        Object r3 = SuspendAnimationKt.animate$default(0.0f, displacement, 0.0f, r16, new AnonymousClass4(previousValue, $this$animateScrollToPage), r18, 4, null);
        if (r3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L23;
        return r3;
    L23:
        return Unit.INSTANCE;
    L12:
        if (targetPage >= $this$animateScrollToPage.getFirstVisibleItemIndex()) goto L19;
    L14:
        if (Math.abs(targetPage - $this$animateScrollToPage.getFirstVisibleItemIndex()) < 3) goto L19;
        if (forward == false) goto L17;
        int preJumpPosition = RangesKt.coerceAtLeast(targetPage - visiblePages, $this$animateScrollToPage.getFirstVisibleItemIndex());
    L18:
        $this$animateScrollToPage.snapToItem(preJumpPosition, 0);
        goto L19
    L17:
        preJumpPosition = RangesKt.coerceAtMost(targetPage + visiblePages, $this$animateScrollToPage.getFirstVisibleItemIndex());
        goto L18
    L9:
        if (targetPage > $this$animateScrollToPage.getLastVisibleItemIndex()) goto L14;
    L5:
        forward = false;
        goto L6
    }
}
