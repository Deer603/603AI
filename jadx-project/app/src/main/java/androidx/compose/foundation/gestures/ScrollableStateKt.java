package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: ScrollableState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u001a!\u0010\u0005\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"ScrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "consumeScrollDelta", "Lkotlin/Function1;", "", "rememberScrollableState", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/ScrollableState;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ScrollableStateKt {
    public static final ScrollableState ScrollableState(Function1<? super Float, Float> r1) {
        return new DefaultScrollableState(r1);
    }

    public static final ScrollableState rememberScrollableState(Function1<? super Float, Float> r8, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -180460798, "C(rememberScrollableState)160@7608L40,161@7660L61:ScrollableState.kt#8bwon0");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-180460798, $changed, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:159)");
    L5:
        final State lambdaState = SnapshotStateKt.rememberUpdatedState(r8, $composer, $changed & 14);
        ComposerKt.sourceInformationMarkerStart($composer, 2119060016, "CC(remember):ScrollableState.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L9;
        Object value$iv = ScrollableState(new ScrollableStateKt$rememberScrollableState$1$1(lambdaState));
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L9:
        ScrollableState r4 = (ScrollableState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L12;
        ComposerKt.traceEventEnd();
    L12:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r4;
    }
}
