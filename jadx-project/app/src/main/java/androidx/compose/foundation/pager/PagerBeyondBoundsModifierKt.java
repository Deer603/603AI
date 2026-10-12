package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: PagerBeyondBoundsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"rememberPagerBeyondBoundsState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "state", "Landroidx/compose/foundation/pager/PagerState;", "beyondViewportPageCount", "", "(Landroidx/compose/foundation/pager/PagerState;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PagerBeyondBoundsModifierKt {
    public static final LazyLayoutBeyondBoundsState rememberPagerBeyondBoundsState(PagerState state, int beyondViewportPageCount, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 373558254, "C(rememberPagerBeyondBoundsState)P(1)26@976L111:PagerBeyondBoundsModifier.kt#g6yjnt");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(373558254, $changed, -1, "androidx.compose.foundation.pager.rememberPagerBeyondBoundsState (PagerBeyondBoundsModifier.kt:25)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 1074814635, "CC(remember):PagerBeyondBoundsModifier.kt#9igjgp");
        boolean r1 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L10;
        if ($composer.changed(state) == false) goto L10;
    L11:
        boolean r0 = true;
    L14:
        if ((($changed & 112) ^ 48) <= 32) goto L18;
        if ($composer.changed(beyondViewportPageCount) == false) goto L18;
    L19:
        r1 = true;
    L20:
        boolean invalid$iv = r0 | r1;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L23;
    L26:
        Object value$iv = new PagerBeyondBoundsState(state, beyondViewportPageCount);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L27:
        PagerBeyondBoundsState r3 = (PagerBeyondBoundsState) it$iv;
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
