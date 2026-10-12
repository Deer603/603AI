package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.DensityKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: LazyListState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\b\u001a+\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"EmptyLazyListMeasureResult", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "NumberOfItemsToTeleport", "", "rememberLazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "initialFirstVisibleItemIndex", "initialFirstVisibleItemScrollOffset", "(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/LazyListState;", "prefetchStrategy", "Landroidx/compose/foundation/lazy/LazyListPrefetchStrategy;", "(IILandroidx/compose/foundation/lazy/LazyListPrefetchStrategy;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/LazyListState;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyListStateKt {
    private static final LazyListMeasureResult EmptyLazyListMeasureResult = null;
    private static final int NumberOfItemsToTeleport = 100;

    public static final /* synthetic */ LazyListMeasureResult access$getEmptyLazyListMeasureResult$p() {
        return EmptyLazyListMeasureResult;
    }

    public static final LazyListState rememberLazyListState(final int initialFirstVisibleItemIndex, final int initialFirstVisibleItemScrollOffset, Composer $composer, int $changed, int r12) {
        ComposerKt.sourceInformationMarkerStart($composer, 1470655220, "C(rememberLazyListState)75@3518L96,75@3472L142:LazyListState.kt#428nma");
        if ((r12 & 1) == 0) goto L6;
        initialFirstVisibleItemIndex = 0;
    L6:
        if ((r12 & 2) == 0) goto L9;
        initialFirstVisibleItemScrollOffset = 0;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(1470655220, $changed, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:74)");
    L11:
        boolean r13 = false;
        Object[] r0 = new Object[0];
        Saver<LazyListState, ?> r1 = LazyListState.Companion.getSaver();
        ComposerKt.sourceInformationMarkerStart($composer, -61905390, "CC(remember):LazyListState.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L16;
        if ($composer.changed(initialFirstVisibleItemIndex) == false) goto L16;
    L17:
        boolean r2 = true;
    L20:
        if ((($changed & 112) ^ 48) <= 32) goto L24;
        if ($composer.changed(initialFirstVisibleItemScrollOffset) == false) goto L24;
    L25:
        r13 = true;
    L26:
        boolean invalid$iv = r13 | r2;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L29;
    L32:
        Object value$iv = (Function0) new LazyListStateKt$rememberLazyListState$1$1(initialFirstVisibleItemIndex, initialFirstVisibleItemScrollOffset);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L33:
        ComposerKt.sourceInformationMarkerEnd($composer);
        LazyListState r10 = (LazyListState) RememberSaveableKt.m3923rememberSaveable(r0, r1, null, (Function0) it$iv, $composer, 0, 4);
        if (ComposerKt.isTraceInProgress() == false) goto L36;
        ComposerKt.traceEventEnd();
    L36:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r10;
    L29:
        if (it$iv != Composer.Companion.getEmpty()) goto L33;
    L24:
        if (($changed & 48) != 32) goto L26;
    L16:
        if (($changed & 6) == 4) goto L17;
        r2 = false;
        goto L20
    }

    public static final LazyListState rememberLazyListState(int initialFirstVisibleItemIndex, int initialFirstVisibleItemScrollOffset, LazyListPrefetchStrategy prefetchStrategy, Composer $composer, int $changed, int r21) {
        ComposerKt.sourceInformationMarkerStart($composer, 1287535208, "C(rememberLazyListState)97@4381L39,99@4534L160,99@4452L242:LazyListState.kt#428nma");
        if ((r21 & 1) == 0) goto L5;
        final int initialFirstVisibleItemIndex2 = 0;
    L7:
        if ((r21 & 2) == 0) goto L9;
        final int initialFirstVisibleItemScrollOffset2 = 0;
    L10:
        boolean r5 = false;
        if ((r21 & 4) == 0) goto L17;
        ComposerKt.sourceInformationMarkerStart($composer, -61877831, "CC(remember):LazyListState.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L16;
        Object value$iv = LazyListPrefetchStrategyKt.LazyListPrefetchStrategy$default(0, 1, null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L16:
        LazyListPrefetchStrategy prefetchStrategy2 = (LazyListPrefetchStrategy) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        final LazyListPrefetchStrategy prefetchStrategy3 = prefetchStrategy2;
    L19:
        if (ComposerKt.isTraceInProgress() == false) goto L21;
        ComposerKt.traceEventStart(1287535208, $changed, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:98)");
    L21:
        Object[] r0 = {prefetchStrategy3};
        Saver<LazyListState, ?> r2 = LazyListState.Companion.saver$foundation_release(prefetchStrategy3);
        ComposerKt.sourceInformationMarkerStart($composer, -61872814, "CC(remember):LazyListState.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L26;
        if ($composer.changed(initialFirstVisibleItemIndex2) == false) goto L26;
    L27:
        boolean r1 = true;
    L30:
        if ((($changed & 112) ^ 48) <= 32) goto L34;
        if ($composer.changed(initialFirstVisibleItemScrollOffset2) == false) goto L34;
    L35:
        boolean r3 = true;
    L37:
        boolean r4 = r1 | r3;
        if ((($changed & 896) ^ 384) <= 256) goto L42;
        if ($composer.changedInstance(prefetchStrategy3) == false) goto L42;
    L43:
        r5 = true;
    L44:
        boolean invalid$iv = r4 | r5;
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv == false) goto L47;
    L50:
        Object value$iv2 = (Function0) new LazyListStateKt$rememberLazyListState$3$1(initialFirstVisibleItemIndex2, initialFirstVisibleItemScrollOffset2, prefetchStrategy3);
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L51:
        ComposerKt.sourceInformationMarkerEnd($composer);
        LazyListState r6 = (LazyListState) RememberSaveableKt.m3923rememberSaveable(r0, r2, null, (Function0) it$iv2, $composer, 0, 4);
        if (ComposerKt.isTraceInProgress() == false) goto L54;
        ComposerKt.traceEventEnd();
    L54:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r6;
    L47:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L51;
    L42:
        if (($changed & 384) != 256) goto L44;
    L34:
        if (($changed & 48) == 32) goto L35;
        r3 = false;
    L26:
        if (($changed & 6) == 4) goto L27;
        r1 = false;
        goto L30
    L17:
        prefetchStrategy3 = prefetchStrategy;
        goto L19
    L9:
        initialFirstVisibleItemScrollOffset2 = initialFirstVisibleItemScrollOffset;
        goto L10
    L5:
        initialFirstVisibleItemIndex2 = initialFirstVisibleItemIndex;
        goto L7
    }

    static {
        MeasureResult r0 = new LazyListStateKt$EmptyLazyListMeasureResult$1();
        List r13 = CollectionsKt.emptyList();
        Orientation r18 = Orientation.Vertical;
        MeasureResult r6 = r0;
        EmptyLazyListMeasureResult = new LazyListMeasureResult(null, 0, false, 0.0f, r6, 0.0f, false, CoroutineScopeKt.CoroutineScope(EmptyCoroutineContext.INSTANCE), DensityKt.Density$default(1.0f, 0.0f, 2, null), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), r13, 0, 0, 0, false, r18, 0, 0, null);
    }
}
