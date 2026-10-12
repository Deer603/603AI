package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty0;

/* JADX INFO: compiled from: LazyGridItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"rememberLazyGridItemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyGridItemProviderKt {
    public static final Function0<LazyGridItemProvider> rememberLazyGridItemProviderLambda(final LazyGridState state, Function1<? super LazyGridScope, Unit> r11, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1898306282, "C(rememberLazyGridItemProviderLambda)P(1)43@1740L29,44@1781L668:LazyGridItemProvider.kt#7791vq");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1898306282, $changed, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProviderLambda (LazyGridItemProvider.kt:42)");
    L5:
        final State latestContent = SnapshotStateKt.rememberUpdatedState(r11, $composer, ($changed >> 3) & 14);
        ComposerKt.sourceInformationMarkerStart($composer, -598236458, "CC(remember):LazyGridItemProvider.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L10;
        if ($composer.changed(state) == false) goto L10;
    L11:
        boolean invalid$iv = true;
    L13:
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L16;
    L19:
        final State intervalContentState = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$intervalContentState$1(latestContent));
        final State itemProviderState = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$itemProviderState$1(intervalContentState, state));
        Object value$iv = (KProperty0) new LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$1(itemProviderState);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L20:
        KProperty0 r4 = (KProperty0) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L23;
        ComposerKt.traceEventEnd();
    L23:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r4;
    L16:
        if (it$iv != Composer.Companion.getEmpty()) goto L20;
    L10:
        if (($changed & 6) == 4) goto L11;
        invalid$iv = false;
        goto L13
    }
}
