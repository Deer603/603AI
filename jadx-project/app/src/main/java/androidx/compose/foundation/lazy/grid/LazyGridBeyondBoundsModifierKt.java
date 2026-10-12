package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyGridBeyondBoundsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"rememberLazyGridBeyondBoundsState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyGridBeyondBoundsModifierKt {
    public static final LazyLayoutBeyondBoundsState rememberLazyGridBeyondBoundsState(LazyGridState state, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 2004349821, "C(rememberLazyGridBeyondBoundsState)25@1023L52:LazyGridBeyondBoundsModifier.kt#7791vq");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(2004349821, $changed, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridBeyondBoundsState (LazyGridBeyondBoundsModifier.kt:24)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, -242329870, "CC(remember):LazyGridBeyondBoundsModifier.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L10;
        if ($composer.changed(state) == false) goto L10;
    L11:
        boolean invalid$iv = true;
    L13:
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L16;
    L19:
        Object value$iv = new LazyGridBeyondBoundsState(state);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L20:
        LazyGridBeyondBoundsState r3 = (LazyGridBeyondBoundsState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L23;
        ComposerKt.traceEventEnd();
    L23:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r3;
    L16:
        if (it$iv != Composer.Companion.getEmpty()) goto L20;
    L10:
        if (($changed & 6) == 4) goto L11;
        invalid$iv = false;
        goto L13
    }
}
