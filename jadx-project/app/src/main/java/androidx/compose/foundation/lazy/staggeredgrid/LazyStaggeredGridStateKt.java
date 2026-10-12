package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: LazyStaggeredGridState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"rememberLazyStaggeredGridState", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "initialFirstVisibleItemIndex", "", "initialFirstVisibleItemScrollOffset", "(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyStaggeredGridStateKt {
    public static final LazyStaggeredGridState rememberLazyStaggeredGridState(final int initialFirstVisibleItemIndex, final int initialFirstVisibleItemScrollOffset, Composer $composer, int $changed, int r12) {
        ComposerKt.sourceInformationMarkerStart($composer, 161145796, "C(rememberLazyStaggeredGridState)76@3826L105,76@3771L160:LazyStaggeredGridState.kt#fzvcnm");
        if ((r12 & 1) == 0) goto L6;
        initialFirstVisibleItemIndex = 0;
    L6:
        if ((r12 & 2) == 0) goto L9;
        initialFirstVisibleItemScrollOffset = 0;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(161145796, $changed, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState (LazyStaggeredGridState.kt:76)");
    L11:
        boolean r13 = false;
        Object[] r0 = new Object[0];
        Saver<LazyStaggeredGridState, Object> r1 = LazyStaggeredGridState.Companion.getSaver();
        ComposerKt.sourceInformationMarkerStart($composer, -1334916347, "CC(remember):LazyStaggeredGridState.kt#9igjgp");
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
        Object value$iv = (Function0) new LazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$1(initialFirstVisibleItemIndex, initialFirstVisibleItemScrollOffset);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L33:
        ComposerKt.sourceInformationMarkerEnd($composer);
        LazyStaggeredGridState r10 = (LazyStaggeredGridState) RememberSaveableKt.m3923rememberSaveable(r0, r1, null, (Function0) it$iv, $composer, 0, 4);
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
}
