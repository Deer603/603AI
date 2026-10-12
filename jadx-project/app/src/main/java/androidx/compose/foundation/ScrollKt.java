package androidx.compose.foundation;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Scroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a<\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u001a2\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u001aJ\u0010\u000f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0002\u001a<\u0010\u0013\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u001a2\u0010\u0013\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b¨\u0006\u0014"}, d2 = {"rememberScrollState", "Landroidx/compose/foundation/ScrollState;", "initial", "", "(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;", "horizontalScroll", "Landroidx/compose/ui/Modifier;", "state", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "enabled", "", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "reverseScrolling", "scroll", "isScrollable", "isVertical", "useLocalOverscrollFactory", "verticalScroll", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ScrollKt {
    public static final ScrollState rememberScrollState(final int initial, Composer $composer, int $changed, int r12) {
        ComposerKt.sourceInformationMarkerStart($composer, -1464256199, "C(rememberScrollState)69@3216L34,69@3172L78:Scroll.kt#71ulvw");
        boolean invalid$iv = true;
        if ((r12 & 1) == 0) goto L6;
        initial = 0;
    L6:
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventStart(-1464256199, $changed, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:68)");
    L8:
        Object[] r2 = new Object[0];
        Saver<ScrollState, ?> r3 = ScrollState.Companion.getSaver();
        ComposerKt.sourceInformationMarkerStart($composer, -506671201, "CC(remember):Scroll.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L13;
        if ($composer.changed(initial) == false) goto L13;
    L16:
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L19;
    L22:
        Object value$iv = (Function0) new ScrollKt$rememberScrollState$1$1(initial);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L23:
        ComposerKt.sourceInformationMarkerEnd($composer);
        ScrollState r10 = (ScrollState) RememberSaveableKt.m3923rememberSaveable(r2, r3, null, (Function0) it$iv, $composer, 0, 4);
        if (ComposerKt.isTraceInProgress() == false) goto L26;
        ComposerKt.traceEventEnd();
    L26:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r10;
    L19:
        if (it$iv != Composer.Companion.getEmpty()) goto L23;
    L13:
        if (($changed & 6) == 4) goto L16;
        invalid$iv = false;
        goto L16
    }

    public static /* synthetic */ Modifier verticalScroll$default(Modifier r0, ScrollState r1, boolean r2, FlingBehavior r3, boolean r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = true;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r3 = null;
    L9:
        if ((r5 & 8) == 0) goto L12;
        r4 = false;
    L12:
        return verticalScroll(r0, r1, r2, r3, r4);
    }

    public static final Modifier verticalScroll(Modifier $this$verticalScroll, ScrollState state, boolean enabled, FlingBehavior flingBehavior, boolean reverseScrolling) {
        return scroll$default($this$verticalScroll, state, reverseScrolling, flingBehavior, enabled, true, true, null, 64, null);
    }

    public static /* synthetic */ Modifier verticalScroll$default(Modifier r6, ScrollState r7, OverscrollEffect r8, boolean r9, FlingBehavior r10, boolean r11, int r12, Object r13) {
        if ((r12 & 4) == 0) goto L5;
        boolean r3 = true;
    L7:
        if ((r12 & 8) == 0) goto L9;
        FlingBehavior r4 = null;
    L11:
        if ((r12 & 16) == 0) goto L13;
        boolean r5 = false;
    L15:
        return verticalScroll(r6, r7, r8, r3, r4, r5);
    L13:
        r5 = r11;
        goto L15
    L9:
        r4 = r10;
        goto L11
    L5:
        r3 = r9;
        goto L7
    }

    public static final Modifier verticalScroll(Modifier $this$verticalScroll, ScrollState state, OverscrollEffect overscrollEffect, boolean enabled, FlingBehavior flingBehavior, boolean reverseScrolling) {
        return scroll($this$verticalScroll, state, reverseScrolling, flingBehavior, enabled, true, false, overscrollEffect);
    }

    public static /* synthetic */ Modifier horizontalScroll$default(Modifier r0, ScrollState r1, boolean r2, FlingBehavior r3, boolean r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = true;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r3 = null;
    L9:
        if ((r5 & 8) == 0) goto L12;
        r4 = false;
    L12:
        return horizontalScroll(r0, r1, r2, r3, r4);
    }

    public static final Modifier horizontalScroll(Modifier $this$horizontalScroll, ScrollState state, boolean enabled, FlingBehavior flingBehavior, boolean reverseScrolling) {
        return scroll$default($this$horizontalScroll, state, reverseScrolling, flingBehavior, enabled, false, true, null, 64, null);
    }

    public static /* synthetic */ Modifier horizontalScroll$default(Modifier r6, ScrollState r7, OverscrollEffect r8, boolean r9, FlingBehavior r10, boolean r11, int r12, Object r13) {
        if ((r12 & 4) == 0) goto L5;
        boolean r3 = true;
    L7:
        if ((r12 & 8) == 0) goto L9;
        FlingBehavior r4 = null;
    L11:
        if ((r12 & 16) == 0) goto L13;
        boolean r5 = false;
    L15:
        return horizontalScroll(r6, r7, r8, r3, r4, r5);
    L13:
        r5 = r11;
        goto L15
    L9:
        r4 = r10;
        goto L11
    L5:
        r3 = r9;
        goto L7
    }

    public static final Modifier horizontalScroll(Modifier $this$horizontalScroll, ScrollState state, OverscrollEffect overscrollEffect, boolean enabled, FlingBehavior flingBehavior, boolean reverseScrolling) {
        return scroll($this$horizontalScroll, state, reverseScrolling, flingBehavior, enabled, false, false, overscrollEffect);
    }

    static /* synthetic */ Modifier scroll$default(Modifier r9, ScrollState r10, boolean r11, FlingBehavior r12, boolean r13, boolean r14, boolean r15, OverscrollEffect r16, int r17, Object r18) {
        if ((r17 & 64) == 0) goto L5;
        OverscrollEffect r8 = null;
    L7:
        return scroll(r9, r10, r11, r12, r13, r14, r15, r8);
    L5:
        r8 = r16;
        goto L7
    }

    private static final Modifier scroll(Modifier $this$scroll, ScrollState state, boolean reverseScrolling, FlingBehavior flingBehavior, boolean isScrollable, boolean isVertical, boolean useLocalOverscrollFactory, OverscrollEffect overscrollEffect) {
        if (isVertical == false) goto L5;
        Orientation r2 = Orientation.Vertical;
    L6:
        Orientation orientation = r2;
        return ScrollingContainerKt.scrollingContainer$default($this$scroll, state, orientation, isScrollable, reverseScrolling, flingBehavior, state.getInternalInteractionSource$foundation_release(), useLocalOverscrollFactory, overscrollEffect, null, 256, null).then(new ScrollingLayoutElement(state, reverseScrolling, isVertical));
    L5:
        r2 = Orientation.Horizontal;
        goto L6
    }
}
