package androidx.compose.material3;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.BottomAppBarTokens;
import androidx.compose.material3.tokens.FabSecondaryTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JK\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010!H\u0007¢\u0006\u0002\u0010\"R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\r8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\r8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/material3/BottomAppBarDefaults;", "", "()V", "ContainerElevation", "Landroidx/compose/ui/unit/Dp;", "getContainerElevation-D9Ej5fM", "()F", "F", "ContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "bottomAppBarFabColor", "Landroidx/compose/ui/graphics/Color;", "getBottomAppBarFabColor", "(Landroidx/compose/runtime/Composer;I)J", "containerColor", "getContainerColor", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "exitAlwaysScrollBehavior", "Landroidx/compose/material3/BottomAppBarScrollBehavior;", "state", "Landroidx/compose/material3/BottomAppBarState;", "canScroll", "Lkotlin/Function0;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "flingAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "(Landroidx/compose/material3/BottomAppBarState;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomAppBarScrollBehavior;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BottomAppBarDefaults {
    public static final int $stable = 0;
    private static final float ContainerElevation = 0.0f;
    private static final PaddingValues ContentPadding = null;
    public static final BottomAppBarDefaults INSTANCE = null;

    private BottomAppBarDefaults() {
    }

    public final long getContainerColor(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -368340078, "C1534@72082L5:AppBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-368340078, $changed, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-containerColor> (AppBar.kt:1534)");
    L5:
        long r0 = ColorSchemeKt.getValue(BottomAppBarTokens.INSTANCE.getContainerColor(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    static {
        INSTANCE = new BottomAppBarDefaults();
        ContainerElevation = Dp.m6973constructorimpl(0);
        ContentPadding = PaddingKt.m722PaddingValuesa9UjIt4$default(AppBarKt.access$getBottomAppBarHorizontalPadding$p(), AppBarKt.getBottomAppBarVerticalPadding(), AppBarKt.access$getBottomAppBarHorizontalPadding$p(), 0.0f, 8, null);
    }

    /* JADX INFO: renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1917getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    public final WindowInsets getWindowInsets(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 688896409, "C1554@72738L29:AppBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(688896409, $changed, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-windowInsets> (AppBar.kt:1553)");
    L5:
        WindowInsets r0 = WindowInsetsKt.m798onlybOOhFvg(SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, $composer, 6), WindowInsetsSides.m810plusgK_yJZ4(WindowInsetsSides.Companion.m820getHorizontalJoeWqyM(), WindowInsetsSides.Companion.m818getBottomJoeWqyM()));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final long getBottomAppBarFabColor(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1464561486, "C1561@73035L5:AppBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1464561486, $changed, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-bottomAppBarFabColor> (AppBar.kt:1561)");
    L5:
        long r0 = ColorSchemeKt.getValue(FabSecondaryTokens.INSTANCE.getContainerColor(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final BottomAppBarScrollBehavior exitAlwaysScrollBehavior(BottomAppBarState state, Function0 r10, AnimationSpec r11, DecayAnimationSpec<Float> r12, Composer $composer, int $changed, int r15) {
        ComposerKt.sourceInformationMarkerStart($composer, 457144034, "C(exitAlwaysScrollBehavior)P(3!1,2)1581@74185L27,1584@74414L26:AppBar.kt#uh7d8r");
        if ((r15 & 1) == 0) goto L5;
        Composer $composer2 = $composer;
        state = AppBarKt.rememberBottomAppBarState(0.0f, 0.0f, 0.0f, $composer2, 0, 7);
    L7:
        if ((r15 & 2) == 0) goto L10;
        Function0 canScroll = AnonymousClass1.INSTANCE;
        r10 = canScroll;
    L10:
        if ((r15 & 4) == 0) goto L13;
        AnimationSpec snapAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        r11 = snapAnimationSpec;
    L13:
        if ((r15 & 8) == 0) goto L16;
        r12 = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay($composer2, 0);
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(457144034, $changed, -1, "androidx.compose.material3.BottomAppBarDefaults.exitAlwaysScrollBehavior (AppBar.kt:1586)");
    L18:
        ExitAlwaysScrollBehavior r13 = new ExitAlwaysScrollBehavior(state, r11, r12, r10);
        if (ComposerKt.isTraceInProgress() == false) goto L21;
        ComposerKt.traceEventEnd();
    L21:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        return r13;
    L5:
        $composer2 = $composer;
        goto L7
    }
}
