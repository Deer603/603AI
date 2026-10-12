package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyListSemantics.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"rememberLazyListSemanticState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "isVertical", "", "(Landroidx/compose/foundation/lazy/LazyListState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyListSemanticsKt {
    public static final LazyLayoutSemanticState rememberLazyListSemanticState(LazyListState state, boolean isVertical, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 596174919, "C(rememberLazyListSemanticState)P(1)27@961L107:LazyListSemantics.kt#428nma");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(596174919, $changed, -1, "androidx.compose.foundation.lazy.rememberLazyListSemanticState (LazyListSemantics.kt:26)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 43267287, "CC(remember):LazyListSemantics.kt#9igjgp");
        boolean r1 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L10;
        if ($composer.changed(state) == false) goto L10;
    L11:
        boolean r0 = true;
    L14:
        if ((($changed & 112) ^ 48) <= 32) goto L18;
        if ($composer.changed(isVertical) == false) goto L18;
    L19:
        r1 = true;
    L20:
        boolean invalid$iv = r0 | r1;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L23;
    L26:
        Object value$iv = LazyLayoutSemanticStateKt.LazyLayoutSemanticState(state, isVertical);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L27:
        LazyLayoutSemanticState r3 = (LazyLayoutSemanticState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventEnd();
    L30:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r3;
    L23:
        if (it$iv != Composer.Companion.getEmpty()) goto L27;
    L18:
        if (($changed & 48) != 32) goto L20;
    L10:
        if (($changed & 6) == 4) goto L11;
        r0 = false;
        goto L14
    }
}
