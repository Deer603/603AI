package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: LazyLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aP\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u001d\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"MaxItemsToRetainForReuse", "", "LazyLayout", "", "itemProvider", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "modifier", "Landroidx/compose/ui/Modifier;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "measurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyLayoutKt {
    private static final int MaxItemsToRetainForReuse = 7;

    public static final void LazyLayout(final Function0<? extends LazyLayoutItemProvider> r10, final Modifier modifier, final LazyLayoutPrefetchState prefetchState, final Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> r13, Composer $composer, final int $changed, final int r16) {
        Composer $composer2 = $composer.startRestartGroup(2002163445);
        ComposerKt.sourceInformation($composer2, "C(LazyLayout)P(!1,2,3)53@2280L34,55@2352L1209,55@2320L1241:LazyLayout.kt#wow0x6");
        int $dirty = $changed;
        if ((r16 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r2 = r16 & 2;
        if (r2 == 0) goto L16;
        $dirty = $dirty | 48;
    L22:
        int r3 = r16 & 4;
        if (r3 == 0) goto L26;
        $dirty = $dirty | 384;
    L33:
        if ((r16 & 8) == 0) goto L36;
        $dirty = $dirty | 3072;
    L42:
        int $dirty2 = $dirty;
        if (($dirty2 & 1171) == 1170) goto L45;
        boolean r1 = true;
    L47:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == false) goto L58;
        if (r2 == 0) goto L50;
        modifier = Modifier.Companion;
    L50:
        if (r3 == 0) goto L53;
        prefetchState = null;
    L53:
        if (ComposerKt.isTraceInProgress() == false) goto L55;
        ComposerKt.traceEventStart(2002163445, $dirty2, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:52)");
    L55:
        final State currentItemProvider = SnapshotStateKt.rememberUpdatedState(r10, $composer2, $dirty2 & 14);
        LazySaveableStateHolderKt.LazySaveableStateHolderProvider(ComposableLambdaKt.rememberComposableLambda(-1488997347, true, new AnonymousClass1(prefetchState, modifier, r13, currentItemProvider), $composer2, 54), $composer2, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L59;
        ComposerKt.traceEventEnd();
    L59:
        final Modifier modifier2 = modifier;
        final LazyLayoutPrefetchState prefetchState2 = prefetchState;
        ScopeUpdateScope r11 = $composer2.endRestartGroup();
        if (r11 == null) goto L63;
        r11.updateScope(new AnonymousClass2(r10, modifier2, prefetchState2, r13, $changed, r16));
        return;
    L63:
        return;
    L58:
        $composer2.skipToGroupEnd();
        goto L59
    L45:
        r1 = false;
        goto L47
    L36:
        if (($changed & 3072) != 0) goto L42;
        if ($composer2.changedInstance(r13) == false) goto L40;
        int r6 = 2048;
    L41:
        $dirty = $dirty | r6;
        goto L42
    L40:
        r6 = 1024;
        goto L41
    L26:
        if (($changed & 384) != 0) goto L33;
        if ($composer2.changed(prefetchState) == false) goto L30;
        int r7 = 256;
    L31:
        $dirty = $dirty | r7;
        goto L33
    L30:
        r7 = 128;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        if ($composer2.changed(modifier) == false) goto L20;
        int r4 = 32;
    L21:
        $dirty = $dirty | r4;
        goto L22
    L20:
        r4 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changedInstance(r10) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L12
    L10:
        r5 = 2;
        goto L11
    }
}
