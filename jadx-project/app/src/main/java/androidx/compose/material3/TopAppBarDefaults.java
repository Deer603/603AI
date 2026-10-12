package androidx.compose.material3;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.TopAppBarLargeTokens;
import androidx.compose.material3.tokens.TopAppBarMediumTokens;
import androidx.compose.material3.tokens.TopAppBarSmallCenteredTokens;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u001f\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010 JD\u0010\u001f\u001a\u00020\u00152\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(JK\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u000202\u0018\u0001012\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u000202\u0018\u000104H\u0007¢\u0006\u0002\u00105JK\u00106\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u000202\u0018\u0001012\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u000202\u0018\u000104H\u0007¢\u0006\u0002\u00105J\r\u00107\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010 JD\u00107\u001a\u00020\u00152\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b8\u0010(J\r\u00109\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010 JD\u00109\u001a\u00020\u00152\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b:\u0010(J'\u0010;\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.H\u0007¢\u0006\u0002\u0010<J\r\u0010=\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010 JD\u0010=\u001a\u00020\u00152\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010(R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u0011\u0010\u0010\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u00020\u0015*\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u00020\u0015*\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0018\u0010\u001b\u001a\u00020\u0015*\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u0018\u0010\u001d\u001a\u00020\u0015*\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, d2 = {"Landroidx/compose/material3/TopAppBarDefaults;", "", "()V", "LargeAppBarCollapsedHeight", "Landroidx/compose/ui/unit/Dp;", "getLargeAppBarCollapsedHeight-D9Ej5fM", "()F", "F", "LargeAppBarExpandedHeight", "getLargeAppBarExpandedHeight-D9Ej5fM", "MediumAppBarCollapsedHeight", "getMediumAppBarCollapsedHeight-D9Ej5fM", "MediumAppBarExpandedHeight", "getMediumAppBarExpandedHeight-D9Ej5fM", "TopAppBarExpandedHeight", "getTopAppBarExpandedHeight-D9Ej5fM", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "defaultCenterAlignedTopAppBarColors", "Landroidx/compose/material3/TopAppBarColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultCenterAlignedTopAppBarColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/TopAppBarColors;", "defaultLargeTopAppBarColors", "getDefaultLargeTopAppBarColors$material3_release", "defaultMediumTopAppBarColors", "getDefaultMediumTopAppBarColors$material3_release", "defaultTopAppBarColors", "getDefaultTopAppBarColors$material3_release", "centerAlignedTopAppBarColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TopAppBarColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "scrolledContainerColor", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "centerAlignedTopAppBarColors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarColors;", "enterAlwaysScrollBehavior", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "state", "Landroidx/compose/material3/TopAppBarState;", "canScroll", "Lkotlin/Function0;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "flingAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "(Landroidx/compose/material3/TopAppBarState;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarScrollBehavior;", "exitUntilCollapsedScrollBehavior", "largeTopAppBarColors", "largeTopAppBarColors-zjMxDiM", "mediumTopAppBarColors", "mediumTopAppBarColors-zjMxDiM", "pinnedScrollBehavior", "(Landroidx/compose/material3/TopAppBarState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarScrollBehavior;", "topAppBarColors", "topAppBarColors-zjMxDiM", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TopAppBarDefaults {
    public static final int $stable = 0;
    public static final TopAppBarDefaults INSTANCE = null;
    private static final float LargeAppBarCollapsedHeight = 0.0f;
    private static final float LargeAppBarExpandedHeight = 0.0f;
    private static final float MediumAppBarCollapsedHeight = 0.0f;
    private static final float MediumAppBarExpandedHeight = 0.0f;
    private static final float TopAppBarExpandedHeight = 0.0f;

    private TopAppBarDefaults() {
    }

    public final TopAppBarColors topAppBarColors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1388520854, "C(topAppBarColors)977@47193L11:AppBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1388520854, $changed, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:977)");
    L5:
        TopAppBarColors r0 = getDefaultTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: topAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m2991topAppBarColorszjMxDiM(long containerColor, long scrolledContainerColor, long navigationIconContentColor, long titleContentColor, long actionIconContentColor, Composer $composer, int $changed, int r29) {
        ComposerKt.sourceInformationMarkerStart($composer, 2142919275, "C(topAppBarColors)P(1:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.graphics.Color,0:c#ui.graphics.Color)998@48245L11:AppBar.kt#uh7d8r");
        if ((r29 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r29 & 2) == 0) goto L9;
        long scrolledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L11:
        if ((r29 & 4) == 0) goto L13;
        long navigationIconContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r29 & 8) == 0) goto L17;
        long titleContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if ((r29 & 16) == 0) goto L21;
        long actionIconContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L26;
        ComposerKt.traceEventStart(2142919275, $changed, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:998)");
    L26:
        TopAppBarColors r1 = getDefaultTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m2977copyt635Npw(containerColor2, scrolledContainerColor2, navigationIconContentColor2, titleContentColor2, actionIconContentColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L29;
        ComposerKt.traceEventEnd();
    L29:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L21:
        actionIconContentColor2 = actionIconContentColor;
        goto L23
    L17:
        titleContentColor2 = titleContentColor;
        goto L19
    L13:
        navigationIconContentColor2 = navigationIconContentColor;
        goto L15
    L9:
        scrolledContainerColor2 = scrolledContainerColor;
        goto L11
    L5:
        containerColor2 = containerColor;
        goto L7
    }

    public final TopAppBarColors getDefaultTopAppBarColors$material3_release(ColorScheme $this$defaultTopAppBarColors) {
        TopAppBarColors it = $this$defaultTopAppBarColors.getDefaultTopAppBarColorsCached$material3_release();
        if (it != null) goto L6;
        TopAppBarColors it2 = new TopAppBarColors(ColorSchemeKt.fromToken($this$defaultTopAppBarColors, TopAppBarSmallTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken($this$defaultTopAppBarColors, TopAppBarSmallTokens.INSTANCE.getOnScrollContainerColor()), ColorSchemeKt.fromToken($this$defaultTopAppBarColors, TopAppBarSmallTokens.INSTANCE.getLeadingIconColor()), ColorSchemeKt.fromToken($this$defaultTopAppBarColors, TopAppBarSmallTokens.INSTANCE.getHeadlineColor()), ColorSchemeKt.fromToken($this$defaultTopAppBarColors, TopAppBarSmallTokens.INSTANCE.getTrailingIconColor()), null);
        $this$defaultTopAppBarColors.setDefaultTopAppBarColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    public final WindowInsets getWindowInsets(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 2143182847, "C1025@49443L29:AppBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(2143182847, $changed, -1, "androidx.compose.material3.TopAppBarDefaults.<get-windowInsets> (AppBar.kt:1025)");
    L5:
        WindowInsets r0 = WindowInsetsKt.m798onlybOOhFvg(SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, $composer, 6), WindowInsetsSides.m810plusgK_yJZ4(WindowInsetsSides.Companion.m820getHorizontalJoeWqyM(), WindowInsetsSides.Companion.m824getTopJoeWqyM()));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final TopAppBarColors centerAlignedTopAppBarColors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 513940029, "C(centerAlignedTopAppBarColors)1035@49843L11:AppBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(513940029, $changed, -1, "androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors (AppBar.kt:1035)");
    L5:
        TopAppBarColors r0 = getDefaultCenterAlignedTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: centerAlignedTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m2983centerAlignedTopAppBarColorszjMxDiM(long containerColor, long scrolledContainerColor, long navigationIconContentColor, long titleContentColor, long actionIconContentColor, Composer $composer, int $changed, int r29) {
        ComposerKt.sourceInformationMarkerStart($composer, 1896017784, "C(centerAlignedTopAppBarColors)P(1:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.graphics.Color,0:c#ui.graphics.Color)1056@50929L11:AppBar.kt#uh7d8r");
        if ((r29 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r29 & 2) == 0) goto L9;
        long scrolledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L11:
        if ((r29 & 4) == 0) goto L13;
        long navigationIconContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r29 & 8) == 0) goto L17;
        long titleContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if ((r29 & 16) == 0) goto L21;
        long actionIconContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L26;
        ComposerKt.traceEventStart(1896017784, $changed, -1, "androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors (AppBar.kt:1056)");
    L26:
        TopAppBarColors r1 = getDefaultCenterAlignedTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m2977copyt635Npw(containerColor2, scrolledContainerColor2, navigationIconContentColor2, titleContentColor2, actionIconContentColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L29;
        ComposerKt.traceEventEnd();
    L29:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L21:
        actionIconContentColor2 = actionIconContentColor;
        goto L23
    L17:
        titleContentColor2 = titleContentColor;
        goto L19
    L13:
        navigationIconContentColor2 = navigationIconContentColor;
        goto L15
    L9:
        scrolledContainerColor2 = scrolledContainerColor;
        goto L11
    L5:
        containerColor2 = containerColor;
        goto L7
    }

    public final TopAppBarColors getDefaultCenterAlignedTopAppBarColors$material3_release(ColorScheme $this$defaultCenterAlignedTopAppBarColors) {
        TopAppBarColors it = $this$defaultCenterAlignedTopAppBarColors.getDefaultCenterAlignedTopAppBarColorsCached$material3_release();
        if (it != null) goto L6;
        TopAppBarColors it2 = new TopAppBarColors(ColorSchemeKt.fromToken($this$defaultCenterAlignedTopAppBarColors, TopAppBarSmallCenteredTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken($this$defaultCenterAlignedTopAppBarColors, TopAppBarSmallCenteredTokens.INSTANCE.getOnScrollContainerColor()), ColorSchemeKt.fromToken($this$defaultCenterAlignedTopAppBarColors, TopAppBarSmallCenteredTokens.INSTANCE.getLeadingIconColor()), ColorSchemeKt.fromToken($this$defaultCenterAlignedTopAppBarColors, TopAppBarSmallCenteredTokens.INSTANCE.getHeadlineColor()), ColorSchemeKt.fromToken($this$defaultCenterAlignedTopAppBarColors, TopAppBarSmallCenteredTokens.INSTANCE.getTrailingIconColor()), null);
        $this$defaultCenterAlignedTopAppBarColors.setDefaultCenterAlignedTopAppBarColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    public final TopAppBarColors mediumTopAppBarColors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1268886463, "C(mediumTopAppBarColors)1085@52373L11:AppBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1268886463, $changed, -1, "androidx.compose.material3.TopAppBarDefaults.mediumTopAppBarColors (AppBar.kt:1085)");
    L5:
        TopAppBarColors r0 = getDefaultMediumTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: mediumTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m2990mediumTopAppBarColorszjMxDiM(long containerColor, long scrolledContainerColor, long navigationIconContentColor, long titleContentColor, long actionIconContentColor, Composer $composer, int $changed, int r29) {
        ComposerKt.sourceInformationMarkerStart($composer, -582474442, "C(mediumTopAppBarColors)P(1:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.graphics.Color,0:c#ui.graphics.Color)1107@53476L11:AppBar.kt#uh7d8r");
        if ((r29 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r29 & 2) == 0) goto L9;
        long scrolledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L11:
        if ((r29 & 4) == 0) goto L13;
        long navigationIconContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r29 & 8) == 0) goto L17;
        long titleContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if ((r29 & 16) == 0) goto L21;
        long actionIconContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L26;
        ComposerKt.traceEventStart(-582474442, $changed, -1, "androidx.compose.material3.TopAppBarDefaults.mediumTopAppBarColors (AppBar.kt:1107)");
    L26:
        TopAppBarColors r1 = getDefaultMediumTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m2977copyt635Npw(containerColor2, scrolledContainerColor2, navigationIconContentColor2, titleContentColor2, actionIconContentColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L29;
        ComposerKt.traceEventEnd();
    L29:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L21:
        actionIconContentColor2 = actionIconContentColor;
        goto L23
    L17:
        titleContentColor2 = titleContentColor;
        goto L19
    L13:
        navigationIconContentColor2 = navigationIconContentColor;
        goto L15
    L9:
        scrolledContainerColor2 = scrolledContainerColor;
        goto L11
    L5:
        containerColor2 = containerColor;
        goto L7
    }

    public final TopAppBarColors getDefaultMediumTopAppBarColors$material3_release(ColorScheme $this$defaultMediumTopAppBarColors) {
        TopAppBarColors it = $this$defaultMediumTopAppBarColors.getDefaultMediumTopAppBarColorsCached$material3_release();
        if (it != null) goto L6;
        TopAppBarColors it2 = new TopAppBarColors(ColorSchemeKt.fromToken($this$defaultMediumTopAppBarColors, TopAppBarMediumTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken($this$defaultMediumTopAppBarColors, TopAppBarSmallTokens.INSTANCE.getOnScrollContainerColor()), ColorSchemeKt.fromToken($this$defaultMediumTopAppBarColors, TopAppBarMediumTokens.INSTANCE.getLeadingIconColor()), ColorSchemeKt.fromToken($this$defaultMediumTopAppBarColors, TopAppBarMediumTokens.INSTANCE.getHeadlineColor()), ColorSchemeKt.fromToken($this$defaultMediumTopAppBarColors, TopAppBarMediumTokens.INSTANCE.getTrailingIconColor()), null);
        $this$defaultMediumTopAppBarColors.setDefaultMediumTopAppBarColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    public final TopAppBarColors largeTopAppBarColors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1744932393, "C(largeTopAppBarColors)1135@54826L11:AppBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1744932393, $changed, -1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:1135)");
    L5:
        TopAppBarColors r0 = getDefaultLargeTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6));
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    /* JADX INFO: renamed from: largeTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m2989largeTopAppBarColorszjMxDiM(long containerColor, long scrolledContainerColor, long navigationIconContentColor, long titleContentColor, long actionIconContentColor, Composer $composer, int $changed, int r29) {
        ComposerKt.sourceInformationMarkerStart($composer, -1471507700, "C(largeTopAppBarColors)P(1:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.graphics.Color,0:c#ui.graphics.Color)1157@55926L11:AppBar.kt#uh7d8r");
        if ((r29 & 1) == 0) goto L5;
        long containerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r29 & 2) == 0) goto L9;
        long scrolledContainerColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L11:
        if ((r29 & 4) == 0) goto L13;
        long navigationIconContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L15:
        if ((r29 & 8) == 0) goto L17;
        long titleContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L19:
        if ((r29 & 16) == 0) goto L21;
        long actionIconContentColor2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L26;
        ComposerKt.traceEventStart(-1471507700, $changed, -1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:1157)");
    L26:
        TopAppBarColors r1 = getDefaultLargeTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme($composer, 6)).m2977copyt635Npw(containerColor2, scrolledContainerColor2, navigationIconContentColor2, titleContentColor2, actionIconContentColor2);
        if (ComposerKt.isTraceInProgress() == false) goto L29;
        ComposerKt.traceEventEnd();
    L29:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L21:
        actionIconContentColor2 = actionIconContentColor;
        goto L23
    L17:
        titleContentColor2 = titleContentColor;
        goto L19
    L13:
        navigationIconContentColor2 = navigationIconContentColor;
        goto L15
    L9:
        scrolledContainerColor2 = scrolledContainerColor;
        goto L11
    L5:
        containerColor2 = containerColor;
        goto L7
    }

    public final TopAppBarColors getDefaultLargeTopAppBarColors$material3_release(ColorScheme $this$defaultLargeTopAppBarColors) {
        TopAppBarColors it = $this$defaultLargeTopAppBarColors.getDefaultLargeTopAppBarColorsCached$material3_release();
        if (it != null) goto L6;
        TopAppBarColors it2 = new TopAppBarColors(ColorSchemeKt.fromToken($this$defaultLargeTopAppBarColors, TopAppBarLargeTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken($this$defaultLargeTopAppBarColors, TopAppBarSmallTokens.INSTANCE.getOnScrollContainerColor()), ColorSchemeKt.fromToken($this$defaultLargeTopAppBarColors, TopAppBarLargeTokens.INSTANCE.getLeadingIconColor()), ColorSchemeKt.fromToken($this$defaultLargeTopAppBarColors, TopAppBarLargeTokens.INSTANCE.getHeadlineColor()), ColorSchemeKt.fromToken($this$defaultLargeTopAppBarColors, TopAppBarLargeTokens.INSTANCE.getTrailingIconColor()), null);
        $this$defaultLargeTopAppBarColors.setDefaultLargeTopAppBarColorsCached$material3_release(it2);
        return it2;
    L6:
        return it;
    }

    public final TopAppBarScrollBehavior pinnedScrollBehavior(TopAppBarState state, Function0 r10, Composer $composer, int $changed, int r13) {
        ComposerKt.sourceInformationMarkerStart($composer, 286497075, "C(pinnedScrollBehavior)P(1)1192@57597L24:AppBar.kt#uh7d8r");
        if ((r13 & 1) == 0) goto L5;
        Composer $composer2 = $composer;
        state = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, $composer2, 0, 7);
    L7:
        if ((r13 & 2) == 0) goto L10;
        Function0 canScroll = C05911.INSTANCE;
        r10 = canScroll;
    L10:
        if (ComposerKt.isTraceInProgress() == false) goto L12;
        ComposerKt.traceEventStart(286497075, $changed, -1, "androidx.compose.material3.TopAppBarDefaults.pinnedScrollBehavior (AppBar.kt:1194)");
    L12:
        PinnedScrollBehavior r11 = new PinnedScrollBehavior(state, r10);
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventEnd();
    L15:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        return r11;
    L5:
        $composer2 = $composer;
        goto L7
    }

    public final TopAppBarScrollBehavior enterAlwaysScrollBehavior(TopAppBarState state, Function0 r10, AnimationSpec r11, DecayAnimationSpec<Float> r12, Composer $composer, int $changed, int r15) {
        ComposerKt.sourceInformationMarkerStart($composer, 959086674, "C(enterAlwaysScrollBehavior)P(3!1,2)1214@58881L24,1217@59107L26:AppBar.kt#uh7d8r");
        if ((r15 & 1) == 0) goto L5;
        Composer $composer2 = $composer;
        state = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, $composer2, 0, 7);
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
        ComposerKt.traceEventStart(959086674, $changed, -1, "androidx.compose.material3.TopAppBarDefaults.enterAlwaysScrollBehavior (AppBar.kt:1219)");
    L18:
        EnterAlwaysScrollBehavior r13 = new EnterAlwaysScrollBehavior(state, r11, r12, r10);
        if (ComposerKt.isTraceInProgress() == false) goto L21;
        ComposerKt.traceEventEnd();
    L21:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        return r13;
    L5:
        $composer2 = $composer;
        goto L7
    }

    public final TopAppBarScrollBehavior exitUntilCollapsedScrollBehavior(TopAppBarState state, Function0 r10, AnimationSpec r11, DecayAnimationSpec<Float> r12, Composer $composer, int $changed, int r15) {
        ComposerKt.sourceInformationMarkerStart($composer, -1757023234, "C(exitUntilCollapsedScrollBehavior)P(3!1,2)1247@60644L24,1250@60870L26:AppBar.kt#uh7d8r");
        if ((r15 & 1) == 0) goto L5;
        Composer $composer2 = $composer;
        state = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, $composer2, 0, 7);
    L7:
        if ((r15 & 2) == 0) goto L10;
        Function0 canScroll = C05901.INSTANCE;
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
        ComposerKt.traceEventStart(-1757023234, $changed, -1, "androidx.compose.material3.TopAppBarDefaults.exitUntilCollapsedScrollBehavior (AppBar.kt:1252)");
    L18:
        ExitUntilCollapsedScrollBehavior r13 = new ExitUntilCollapsedScrollBehavior(state, r11, r12, r10);
        if (ComposerKt.isTraceInProgress() == false) goto L21;
        ComposerKt.traceEventEnd();
    L21:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        return r13;
    L5:
        $composer2 = $composer;
        goto L7
    }

    static {
        INSTANCE = new TopAppBarDefaults();
        TopAppBarExpandedHeight = TopAppBarSmallTokens.INSTANCE.m3693getContainerHeightD9Ej5fM();
        MediumAppBarCollapsedHeight = TopAppBarSmallTokens.INSTANCE.m3693getContainerHeightD9Ej5fM();
        MediumAppBarExpandedHeight = TopAppBarMediumTokens.INSTANCE.m3683getContainerHeightD9Ej5fM();
        LargeAppBarCollapsedHeight = TopAppBarSmallTokens.INSTANCE.m3693getContainerHeightD9Ej5fM();
        LargeAppBarExpandedHeight = TopAppBarLargeTokens.INSTANCE.m3679getContainerHeightD9Ej5fM();
    }

    /* JADX INFO: renamed from: getTopAppBarExpandedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2988getTopAppBarExpandedHeightD9Ej5fM() {
        return TopAppBarExpandedHeight;
    }

    /* JADX INFO: renamed from: getMediumAppBarCollapsedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2986getMediumAppBarCollapsedHeightD9Ej5fM() {
        return MediumAppBarCollapsedHeight;
    }

    /* JADX INFO: renamed from: getMediumAppBarExpandedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2987getMediumAppBarExpandedHeightD9Ej5fM() {
        return MediumAppBarExpandedHeight;
    }

    /* JADX INFO: renamed from: getLargeAppBarCollapsedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2984getLargeAppBarCollapsedHeightD9Ej5fM() {
        return LargeAppBarCollapsedHeight;
    }

    /* JADX INFO: renamed from: getLargeAppBarExpandedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2985getLargeAppBarExpandedHeightD9Ej5fM() {
        return LargeAppBarExpandedHeight;
    }
}
