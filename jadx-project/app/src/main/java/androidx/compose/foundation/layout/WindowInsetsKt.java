package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a.\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\t\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001\u001a\f\u0010\f\u001a\u00020\u0001*\u00020\rH\u0000\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u000f\u001a\u0012\u0010\u000e\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u0012\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001\u001a\u001c\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0012\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"WindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "left", "Landroidx/compose/ui/unit/Dp;", "top", "right", "bottom", "WindowInsets-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/WindowInsets;", "", "add", "insets", "asInsets", "Landroidx/compose/foundation/layout/PaddingValues;", "asPaddingValues", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/PaddingValues;", "density", "Landroidx/compose/ui/unit/Density;", "exclude", "only", "sides", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "only-bOOhFvg", "(Landroidx/compose/foundation/layout/WindowInsets;I)Landroidx/compose/foundation/layout/WindowInsets;", "union", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class WindowInsetsKt {
    public static final WindowInsets union(WindowInsets $this$union, WindowInsets insets) {
        return new UnionInsets($this$union, insets);
    }

    public static final WindowInsets exclude(WindowInsets $this$exclude, WindowInsets insets) {
        return new ExcludeInsets($this$exclude, insets);
    }

    public static final WindowInsets add(WindowInsets $this$add, WindowInsets insets) {
        return new AddedInsets($this$add, insets);
    }

    /* JADX INFO: renamed from: only-bOOhFvg, reason: not valid java name */
    public static final WindowInsets m798onlybOOhFvg(WindowInsets $this$only_u2dbOOhFvg, int sides) {
        return new LimitInsets($this$only_u2dbOOhFvg, sides, null);
    }

    public static final PaddingValues asPaddingValues(WindowInsets $this$asPaddingValues, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1485016250, "C(asPaddingValues)220@9077L7:WindowInsets.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1485016250, $changed, -1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:220)");
    L5:
        ProvidableCompositionLocal<Density> r1 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r4 = $composer.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer);
        InsetsPaddingValues r0 = new InsetsPaddingValues($this$asPaddingValues, (Density) r4);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public static final PaddingValues asPaddingValues(WindowInsets $this$asPaddingValues, Density density) {
        return new InsetsPaddingValues($this$asPaddingValues, density);
    }

    public static final WindowInsets asInsets(PaddingValues $this$asInsets) {
        return new PaddingValuesInsets($this$asInsets);
    }

    public static /* synthetic */ WindowInsets WindowInsets$default(int r1, int r2, int r3, int r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = 0;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = 0;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = 0;
    L15:
        return WindowInsets(r1, r2, r3, r4);
    }

    public static final WindowInsets WindowInsets(int left, int top, int right, int bottom) {
        return new FixedIntInsets(left, top, right, bottom);
    }

    /* JADX INFO: renamed from: WindowInsets-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ WindowInsets m797WindowInsetsa9UjIt4$default(float r1, float r2, float r3, float r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L5;
        r1 = Dp.m6973constructorimpl(0);
    L5:
        int $i$f$getDp = r5 & 2;
        if ($i$f$getDp == 0) goto L8;
        r2 = Dp.m6973constructorimpl(0);
    L8:
        int $i$f$getDp2 = r5 & 4;
        if ($i$f$getDp2 == 0) goto L12;
        r3 = Dp.m6973constructorimpl(0);
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = Dp.m6973constructorimpl(0);
    L15:
        return m796WindowInsetsa9UjIt4(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: WindowInsets-a9UjIt4, reason: not valid java name */
    public static final WindowInsets m796WindowInsetsa9UjIt4(float left, float top, float right, float bottom) {
        return new FixedDpInsets(left, top, right, bottom, null);
    }
}
