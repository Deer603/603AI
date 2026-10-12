package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.internal.MappedInteractionSource;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: NavigationBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001ab\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00140\u001e¢\u0006\u0002\b ¢\u0006\u0002\b!H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001aq\u0010$\u001a\u00020\u00142\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\u00140&¢\u0006\u0002\b 2\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020\u00140&¢\u0006\u0002\b 2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00140&¢\u0006\u0002\b 2\u0013\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010&¢\u0006\u0002\b 2\u0006\u0010*\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0&H\u0003¢\u0006\u0002\u0010.\u001a\u0085\u0001\u0010/\u001a\u00020\u0014*\u00020\u001f2\u0006\u00100\u001a\u00020+2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00140&2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00140&¢\u0006\u0002\b 2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u00102\u001a\u00020+2\u0015\b\u0002\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010&¢\u0006\u0002\b 2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u00103\u001a\u0002042\n\b\u0002\u00105\u001a\u0004\u0018\u000106H\u0007¢\u0006\u0002\u00107\u001a8\u00108\u001a\u000209*\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020<2\b\u0010>\u001a\u0004\u0018\u00010<2\u0006\u0010?\u001a\u00020@H\u0002ø\u0001\u0000¢\u0006\u0004\bA\u0010B\u001aP\u0010C\u001a\u000209*\u00020:2\u0006\u0010D\u001a\u00020<2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020<2\b\u0010>\u001a\u0004\u0018\u00010<2\u0006\u0010?\u001a\u00020@2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010F\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0016\u0010\b\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0016\u0010\u000f\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0010\u0010\n\"\u0016\u0010\u0011\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0012\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006G²\u0006\n\u0010H\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u0010I\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u0010J\u001a\u00020\fX\u008a\u008e\u0002"}, d2 = {"IconLayoutIdTag", "", "IndicatorHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "IndicatorLayoutIdTag", "IndicatorRippleLayoutIdTag", "IndicatorVerticalOffset", "IndicatorVerticalPadding", "getIndicatorVerticalPadding", "()F", "ItemAnimationDurationMillis", "", "LabelLayoutIdTag", "NavigationBarHeight", "NavigationBarIndicatorToLabelPadding", "getNavigationBarIndicatorToLabelPadding", "NavigationBarItemHorizontalPadding", "getNavigationBarItemHorizontalPadding", "NavigationBar", "", "modifier", "Landroidx/compose/ui/Modifier;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "NavigationBar-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationBarItemLayout", NavigationBarKt.IndicatorRippleLayoutIdTag, "Lkotlin/Function0;", NavigationBarKt.IndicatorLayoutIdTag, NavigationBarKt.IconLayoutIdTag, NavigationBarKt.LabelLayoutIdTag, "alwaysShowLabel", "", "animationProgress", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "NavigationBarItem", "selected", "onClick", "enabled", "colors", "Landroidx/compose/material3/NavigationBarItemColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationBarItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "placeIcon", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "iconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "indicatorRipplePlaceable", "indicatorPlaceable", "constraints", "Landroidx/compose/ui/unit/Constraints;", "placeIcon-X9ElhV4", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "labelPlaceable", "placeLabelAndIcon-zUg2_y0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;", "material3_release", "iconColor", "textColor", "itemWidth"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class NavigationBarKt {
    private static final String IconLayoutIdTag = "icon";
    private static final float IndicatorHorizontalPadding = 0.0f;
    private static final String IndicatorLayoutIdTag = "indicator";
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final float IndicatorVerticalOffset = 0.0f;
    private static final float IndicatorVerticalPadding = 0.0f;
    private static final int ItemAnimationDurationMillis = 100;
    private static final String LabelLayoutIdTag = "label";
    private static final float NavigationBarHeight = 0.0f;
    private static final float NavigationBarIndicatorToLabelPadding = 0.0f;
    private static final float NavigationBarItemHorizontalPadding = 0.0f;

    public static final /* synthetic */ void access$NavigationBarItem$lambda$4(MutableIntState $itemWidth$delegate, int value) {
        NavigationBarItem$lambda$4($itemWidth$delegate, value);
    }

    public static final /* synthetic */ void access$NavigationBarItemLayout(Function2 indicatorRipple, Function2 indicator, Function2 icon, Function2 label, boolean alwaysShowLabel, Function0 animationProgress, Composer $composer, int $changed) {
        NavigationBarItemLayout(indicatorRipple, indicator, icon, label, alwaysShowLabel, animationProgress, $composer, $changed);
    }

    public static final /* synthetic */ float access$getIndicatorHorizontalPadding$p() {
        return IndicatorHorizontalPadding;
    }

    public static final /* synthetic */ float access$getNavigationBarHeight$p() {
        return NavigationBarHeight;
    }

    /* JADX INFO: renamed from: access$placeIcon-X9ElhV4, reason: not valid java name */
    public static final /* synthetic */ MeasureResult m2401access$placeIconX9ElhV4(MeasureScope $receiver, Placeable iconPlaceable, Placeable indicatorRipplePlaceable, Placeable indicatorPlaceable, long constraints) {
        return m2403placeIconX9ElhV4($receiver, iconPlaceable, indicatorRipplePlaceable, indicatorPlaceable, constraints);
    }

    /* JADX INFO: renamed from: access$placeLabelAndIcon-zUg2_y0, reason: not valid java name */
    public static final /* synthetic */ MeasureResult m2402access$placeLabelAndIconzUg2_y0(MeasureScope $receiver, Placeable labelPlaceable, Placeable iconPlaceable, Placeable indicatorRipplePlaceable, Placeable indicatorPlaceable, long constraints, boolean alwaysShowLabel, float animationProgress) {
        return m2404placeLabelAndIconzUg2_y0($receiver, labelPlaceable, iconPlaceable, indicatorRipplePlaceable, indicatorPlaceable, constraints, alwaysShowLabel, animationProgress);
    }

    /* JADX INFO: renamed from: NavigationBar-HsRjFd4, reason: not valid java name */
    public static final void m2400NavigationBarHsRjFd4(Modifier modifier, long containerColor, long contentColor, float tonalElevation, WindowInsets windowInsets, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r32, Composer $composer, final int $changed, final int r35) {
        Composer $composer2 = $composer.startRestartGroup(1596802123);
        ComposerKt.sourceInformation($composer2, "C(NavigationBar)P(3,0:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.unit.Dp,5)110@5148L14,111@5204L11,113@5362L12,121@5582L441,116@5429L594:NavigationBar.kt#uh7d8r");
        int $dirty = $changed;
        int r3 = r35 & 1;
        if (r3 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r4 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        long containerColor2 = containerColor;
    L25:
        if (($changed & 384) == 0) goto L27;
        long contentColor2 = contentColor;
    L35:
        int r7 = r35 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
        float tonalElevation2 = tonalElevation;
    L47:
        if (($changed & 24576) == 0) goto L49;
        WindowInsets r13 = windowInsets;
    L58:
        if ((r35 & 32) == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L68:
        if ((74899 & $dirty) == 74898) goto L70;
    L73:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L76;
    L88:
        if (r3 == 0) goto L90;
        Modifier.Companion modifier2 = Modifier.Companion;
    L92:
        if ((r35 & 2) == 0) goto L95;
        $dirty = $dirty & (-113);
        containerColor2 = NavigationBarDefaults.INSTANCE.getContainerColor($composer2, 6);
    L95:
        if ((r35 & 4) == 0) goto L97;
        contentColor2 = ColorSchemeKt.m2056contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme($composer2, 6), containerColor2);
        $dirty = $dirty & (-897);
    L97:
        if (r7 == 0) goto L100;
        tonalElevation2 = NavigationBarDefaults.INSTANCE.m2385getElevationD9Ej5fM();
    L100:
        if ((r35 & 16) == 0) goto L102;
        final WindowInsets windowInsets2 = NavigationBarDefaults.INSTANCE.getWindowInsets($composer2, 6);
        $dirty = $dirty & (-57345);
        long contentColor3 = contentColor2;
        float tonalElevation3 = tonalElevation2;
        Modifier modifier3 = modifier2;
        long containerColor3 = containerColor2;
    L103:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L106;
        ComposerKt.traceEventStart(1596802123, $dirty, -1, "androidx.compose.material3.NavigationBar (NavigationBar.kt:115)");
    L106:
        Composer $composer3 = $composer2;
        SurfaceKt.m2670SurfaceT9BRK9s(modifier3, null, containerColor3, contentColor3, tonalElevation3, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(105663120, true, new NavigationBarKt$NavigationBar$1(windowInsets2, r32), $composer2, 54), $composer3, (((($dirty & 14) | 12582912) | (($dirty << 3) & 896)) | (($dirty << 3) & 7168)) | (57344 & ($dirty << 3)), 98);
        if (ComposerKt.isTraceInProgress() == false) goto L109;
        ComposerKt.traceEventEnd();
    L109:
        final WindowInsets windowInsets3 = windowInsets2;
        final Modifier modifier4 = modifier3;
        final long containerColor4 = containerColor3;
        final long contentColor4 = contentColor3;
        final float tonalElevation4 = tonalElevation3;
    L110:
        ScopeUpdateScope r12 = $composer3.endRestartGroup();
        if (r12 == null) goto L114;
        r12.updateScope(new NavigationBarKt$NavigationBar$2(modifier4, containerColor4, contentColor4, tonalElevation4, windowInsets3, r32, $changed, r35));
        return;
    L114:
        return;
    L102:
        contentColor3 = contentColor2;
        tonalElevation3 = tonalElevation2;
        windowInsets2 = r13;
        modifier3 = modifier2;
        containerColor3 = containerColor2;
        goto L103
    L90:
        modifier2 = r4;
        goto L92
    L76:
        if ($composer2.getDefaultsInvalid() == true) goto L88;
        $composer2.skipToGroupEnd();
        if ((r35 & 2) == 0) goto L82;
        $dirty = $dirty & (-113);
    L82:
        if ((r35 & 4) == 0) goto L85;
        $dirty = $dirty & (-897);
    L85:
        if ((r35 & 16) == 0) goto L87;
        $dirty = $dirty & (-57345);
        contentColor3 = contentColor2;
        tonalElevation3 = tonalElevation2;
        modifier3 = r4;
        windowInsets2 = r13;
        containerColor3 = containerColor2;
        goto L103
    L87:
        contentColor3 = contentColor2;
        tonalElevation3 = tonalElevation2;
        modifier3 = r4;
        windowInsets2 = r13;
        containerColor3 = containerColor2;
        goto L103
    L70:
        if ($composer2.getSkipping() == false) goto L73;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier4 = r4;
        windowInsets3 = r13;
        containerColor4 = containerColor2;
        contentColor4 = contentColor2;
        tonalElevation4 = tonalElevation2;
        goto L110
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L68;
        if ($composer2.changedInstance(r32) == false) goto L65;
        int r14 = 131072;
    L66:
        $dirty = $dirty | r14;
        goto L68
    L65:
        r14 = 65536;
        goto L66
    L49:
        if ((r35 & 16) != 0) goto L53;
        r13 = windowInsets;
        if ($composer2.changed(r13) == false) goto L54;
        int r15 = 16384;
    L55:
        $dirty = $dirty | r15;
    L54:
        r15 = 8192;
        goto L55
    L53:
        r13 = windowInsets;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        tonalElevation2 = tonalElevation;
        if ($composer2.changed(tonalElevation2) == false) goto L43;
        int r16 = 2048;
    L44:
        $dirty = $dirty | r16;
        goto L47
    L43:
        r16 = 1024;
        goto L44
    L45:
        tonalElevation2 = tonalElevation;
        goto L47
    L27:
        if ((r35 & 4) != 0) goto L31;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L32;
        int r8 = 256;
    L33:
        $dirty = $dirty | r8;
    L32:
        r8 = 128;
        goto L33
    L31:
        contentColor2 = contentColor;
        goto L32
    L16:
        if ((r35 & 2) != 0) goto L20;
        containerColor2 = containerColor;
        if ($composer2.changed(containerColor2) == false) goto L21;
        int r9 = 32;
    L22:
        $dirty = $dirty | r9;
    L21:
        r9 = 16;
        goto L22
    L20:
        containerColor2 = containerColor;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L14
    L10:
        r5 = 2;
        goto L11
    L12:
        r4 = modifier;
        goto L14
    }

    public static final void NavigationBarItem(final RowScope $this$NavigationBarItem, final boolean selected, final Function0<Unit> r48, final Function2<? super Composer, ? super Integer, Unit> r49, Modifier modifier, boolean enabled, Function2<? super Composer, ? super Integer, Unit> r52, boolean alwaysShowLabel, NavigationBarItemColors colors, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int r58) {
        Composer $composer2 = $composer.startRestartGroup(-663510974);
        ComposerKt.sourceInformation($composer2, "C(NavigationBarItem)P(8,7,3,6,2,5)178@8294L8,184@8526L633,214@9823L33,228@10265L24,216@9862L2687:NavigationBar.kt#uh7d8r");
        int $dirty = $changed;
        if ((Integer.MIN_VALUE & r58) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r58 & 1) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        if ((r58 & 2) == 0) goto L27;
        $dirty = $dirty | 384;
        Function0<Unit> r4 = r48;
    L35:
        if ((r58 & 4) == 0) goto L38;
        $dirty = $dirty | 3072;
        Function2<? super Composer, ? super Integer, Unit> r5 = r49;
    L45:
        int r6 = r58 & 8;
        if (r6 == 0) goto L49;
        $dirty = $dirty | 24576;
        Modifier modifier2 = modifier;
    L56:
        int r8 = r58 & 16;
        if (r8 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        final boolean enabled2 = enabled;
    L67:
        int r10 = r58 & 32;
        if (r10 == 0) goto L71;
        $dirty = $dirty | 1572864;
        final Function2<? super Composer, ? super Integer, Unit> r14 = r52;
    L78:
        int r15 = r58 & 64;
        if (r15 == 0) goto L82;
        $dirty = $dirty | 12582912;
    L90:
        if (($changed & 100663296) != 0) goto L100;
        if ((r58 & 128) != 0) goto L97;
        if ($composer2.changed(colors) == false) goto L97;
        int r17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty = $dirty | r17;
    L97:
        r17 = 33554432;
    L100:
        int r0 = r58 & 256;
        if (r0 == 0) goto L104;
        $dirty = $dirty | 805306368;
    L111:
        int $dirty2 = $dirty;
        if (($dirty & 306783379) == 306783378) goto L114;
    L117:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L120;
    L126:
        if (r6 == 0) goto L128;
        modifier2 = Modifier.Companion;
    L128:
        if (r8 == 0) goto L130;
        enabled2 = true;
    L130:
        if (r10 == 0) goto L132;
        r14 = null;
    L132:
        if (r15 == 0) goto L134;
        boolean alwaysShowLabel2 = true;
    L136:
        if ((r58 & 128) == 0) goto L138;
        final NavigationBarItemColors colors2 = NavigationBarItemDefaults.INSTANCE.colors($composer2, 6);
        int $dirty3 = $dirty2 & (-234881025);
    L139:
        if (r0 == 0) goto L141;
        final MutableInteractionSource interactionSource2 = null;
        boolean alwaysShowLabel3 = alwaysShowLabel2;
    L142:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L146;
        ComposerKt.traceEventStart(-663510974, $dirty3, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:180)");
    L146:
        $composer2.startReplaceGroup(-103236853);
        ComposerKt.sourceInformation($composer2, "182@8445L39");
        if (interactionSource2 != null) goto L153;
        ComposerKt.sourceInformationMarkerStart($composer2, -103236202, "CC(remember):NavigationBar.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L151;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
    L152:
        MutableInteractionSource interactionSource3 = (MutableInteractionSource) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
    L154:
        $composer2.endReplaceGroup();
        final Function2<? super Composer, ? super Integer, Unit> r56 = r5;
        final NavigationBarItemColors colors3 = colors2;
        final boolean enabled3 = enabled2;
        final Function2<? super Composer, ? super Integer, Unit> r54 = r14;
        final boolean alwaysShowLabel4 = alwaysShowLabel3;
        MutableInteractionSource interactionSource4 = interactionSource3;
        Function2 styledIcon = ComposableLambdaKt.rememberComposableLambda(-1419576100, true, new NavigationBarKt$NavigationBarItem$styledIcon$1(colors3, selected, enabled3, r54, alwaysShowLabel4, r56), $composer2, 54);
        $composer2.startReplaceGroup(-103210706);
        ComposerKt.sourceInformation($composer2, "*199@9255L535");
        if (r14 != null) goto L157;
        Function2 styledLabel = null;
    L158:
        $composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerStart($composer2, -103192112, "CC(remember):NavigationBar.kt#9igjgp");
        Object it$iv2 = $composer2.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L161;
        Object value$iv2 = SnapshotIntStateKt.mutableIntStateOf(0);
        $composer2.updateRememberedValue(value$iv2);
    L162:
        final MutableIntState itemWidth$delegate = (MutableIntState) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier modifier3 = modifier2;
        Modifier r1 = RowScope.weight$default($this$NavigationBarItem, SizeKt.m757defaultMinSizeVpY3zN4$default(SelectableKt.m986selectableO2vRcR0(modifier2, selected, interactionSource4, null, enabled2, Role.m6174boximpl(Role.Companion.m6188getTabo7Vup1c()), r4), 0.0f, NavigationBarHeight, 1, null), 1.0f, false, 2, null);
        ComposerKt.sourceInformationMarkerStart($composer2, -103177977, "CC(remember):NavigationBar.kt#9igjgp");
        Object it$iv3 = $composer2.rememberedValue();
        if (it$iv3 != Composer.Companion.getEmpty()) goto L165;
        Object value$iv3 = (Function1) new NavigationBarKt$NavigationBarItem$1$1(itemWidth$delegate);
        $composer2.updateRememberedValue(value$iv3);
    L166:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier modifier$iv = OnRemeasuredModifierKt.onSizeChanged(r1, (Function1) value$iv3);
        Alignment contentAlignment$iv = Alignment.Companion.getCenter();
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, true);
        int $changed$iv$iv = (432 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r22 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L169;
        ComposablesKt.invalidApplier();
    L169:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L172;
        Function0<ComposeUiNode> r2 = r22;
        $composer2.createNode(r2);
    L173:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L180;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L180;
    L181:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r7 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r9 = BoxScopeInstance.INSTANCE;
        int r11 = ((432 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -1652172306, "C233@10442L157,*242@10883L7,248@11165L128,255@11508L293,263@11850L395,280@12505L27,274@12255L288:NavigationBar.kt#uh7d8r");
        if (selected == false) goto L184;
        float r12 = 1.0f;
    L185:
        final State<Float> r13 = AnimateAsStateKt.animateFloatAsState(r12, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, $composer2, 48, 28);
        ProvidableCompositionLocal<Density> r16 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r18 = $composer2.consume(r16);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Density $this$NavigationBarItem_u24lambda_u249_u24lambda_u246 = (Density) r18;
        int indicatorWidth = $this$NavigationBarItem_u24lambda_u249_u24lambda_u246.mo370roundToPx0680j_4(NavigationBarTokens.INSTANCE.m3445getActiveIndicatorWidthD9Ej5fM());
        long deltaOffset = OffsetKt.Offset((NavigationBarItem$lambda$3(itemWidth$delegate) - indicatorWidth) / 2.0f, $this$NavigationBarItem_u24lambda_u249_u24lambda_u246.mo376toPx0680j_4(IndicatorVerticalOffset));
        Unit r19 = Unit.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, 2024936814, "CC(remember):NavigationBar.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(interactionSource4) | $composer2.changed(deltaOffset);
        Object value$iv4 = $composer2.rememberedValue();
        if (invalid$iv == true) goto L192;
        if (value$iv4 == Composer.Companion.getEmpty()) goto L192;
    L193:
        final MappedInteractionSource offsetInteractionSource = (MappedInteractionSource) value$iv4;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Function2 indicatorRipple = ComposableLambdaKt.rememberComposableLambda(691730997, true, new NavigationBarKt$NavigationBarItem$2$indicatorRipple$1(offsetInteractionSource), $composer2, 54);
        Function2 indicator = ComposableLambdaKt.rememberComposableLambda(-474426875, true, new NavigationBarKt$NavigationBarItem$2$indicator$1(r13, colors2), $composer2, 54);
        ComposerKt.sourceInformationMarkerStart($composer2, 2024979593, "CC(remember):NavigationBar.kt#9igjgp");
        boolean invalid$iv2 = $composer2.changed(r13);
        Object it$iv4 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L196;
    L199:
        Object value$iv5 = (Function0) new NavigationBarKt$NavigationBarItem$2$2$1(r13);
        $composer2.updateRememberedValue(value$iv5);
    L200:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        NavigationBarItemLayout(indicatorRipple, indicator, styledIcon, styledLabel, alwaysShowLabel3, (Function0) value$iv5, $composer2, (($dirty3 >> 9) & 57344) | 438);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L203;
        ComposerKt.traceEventEnd();
    L203:
        boolean r20 = enabled2;
        final NavigationBarItemColors colors4 = colors2;
        final boolean enabled4 = r20;
        final boolean alwaysShowLabel5 = alwaysShowLabel3;
        final Modifier modifier4 = modifier3;
        final Function2<? super Composer, ? super Integer, Unit> r21 = r14;
    L204:
        ScopeUpdateScope r110 = $composer2.endRestartGroup();
        if (r110 == null) goto L208;
        r110.updateScope(new AnonymousClass3($this$NavigationBarItem, selected, r48, r49, modifier4, enabled4, r21, alwaysShowLabel5, colors4, interactionSource2, $changed, r58));
        return;
    L208:
        return;
    L196:
        if (it$iv4 == Composer.Companion.getEmpty()) goto L199;
        value$iv5 = it$iv4;
    L192:
        value$iv4 = new MappedInteractionSource(interactionSource4, deltaOffset, null);
        $composer2.updateRememberedValue(value$iv4);
        goto L193
    L184:
        r12 = 0.0f;
    L180:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r3);
        goto L181
    L172:
        r2 = r22;
        $composer2.useNode();
        goto L173
    L165:
        value$iv3 = it$iv3;
        goto L166
    L161:
        value$iv2 = it$iv2;
        goto L162
    L157:
        styledLabel = ComposableLambdaKt.rememberComposableLambda(1644987592, true, new NavigationBarKt$NavigationBarItem$styledLabel$1$1(colors2, selected, enabled2, r14), $composer2, 54);
        goto L158
    L151:
        value$iv = it$iv;
        goto L152
    L153:
        interactionSource3 = interactionSource2;
        goto L154
    L141:
        interactionSource2 = interactionSource;
        alwaysShowLabel3 = alwaysShowLabel2;
        goto L142
    L138:
        colors2 = colors;
        $dirty3 = $dirty2;
        goto L139
    L134:
        alwaysShowLabel2 = alwaysShowLabel;
        goto L136
    L120:
        if ($composer2.getDefaultsInvalid() == true) goto L126;
        $composer2.skipToGroupEnd();
        if ((r58 & 128) == 0) goto L125;
        alwaysShowLabel3 = alwaysShowLabel;
        colors2 = colors;
        interactionSource2 = interactionSource;
        $dirty3 = $dirty2 & (-234881025);
        goto L142
    L125:
        alwaysShowLabel3 = alwaysShowLabel;
        colors2 = colors;
        interactionSource2 = interactionSource;
        $dirty3 = $dirty2;
        goto L142
    L114:
        if ($composer2.getSkipping() == false) goto L117;
        $composer2.skipToGroupEnd();
        alwaysShowLabel5 = alwaysShowLabel;
        interactionSource2 = interactionSource;
        modifier4 = modifier2;
        enabled4 = enabled2;
        colors4 = colors;
        r21 = r14;
        goto L204
    L104:
        if (($changed & 805306368) != 0) goto L111;
        if ($composer2.changed(interactionSource) == false) goto L108;
        int r111 = 536870912;
    L109:
        $dirty = $dirty | r111;
        goto L111
    L108:
        r111 = 268435456;
        goto L109
    L82:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changed(alwaysShowLabel) == false) goto L86;
        int r112 = 8388608;
    L87:
        $dirty = $dirty | r112;
        goto L90
    L86:
        r112 = 4194304;
        goto L87
    L71:
        if ((1572864 & $changed) != 0) goto L77;
        r14 = r52;
        if ($composer2.changedInstance(r14) == false) goto L75;
        int r113 = 1048576;
    L76:
        $dirty = $dirty | r113;
        goto L78
    L75:
        r113 = 524288;
        goto L76
    L77:
        r14 = r52;
        goto L78
    L60:
        if ((196608 & $changed) != 0) goto L66;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L64;
        int r114 = 131072;
    L65:
        $dirty = $dirty | r114;
        goto L67
    L64:
        r114 = 65536;
        goto L65
    L66:
        enabled2 = enabled;
        goto L67
    L49:
        if (($changed & 24576) != 0) goto L55;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L53;
        int r23 = 16384;
    L54:
        $dirty = $dirty | r23;
        goto L56
    L53:
        r23 = 8192;
        goto L54
    L55:
        modifier2 = modifier;
        goto L56
    L38:
        if (($changed & 3072) != 0) goto L44;
        r5 = r49;
        if ($composer2.changedInstance(r5) == false) goto L42;
        int r24 = 2048;
    L43:
        $dirty = $dirty | r24;
        goto L45
    L42:
        r24 = 1024;
        goto L43
    L44:
        r5 = r49;
        goto L45
    L27:
        if (($changed & 384) != 0) goto L33;
        r4 = r48;
        if ($composer2.changedInstance(r4) == false) goto L31;
        int r25 = 256;
    L32:
        $dirty = $dirty | r25;
        goto L35
    L31:
        r25 = 128;
        goto L32
    L33:
        r4 = r48;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changed(selected) == false) goto L21;
        int r26 = 32;
    L22:
        $dirty = $dirty | r26;
        goto L24
    L21:
        r26 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changed($this$NavigationBarItem) == false) goto L10;
        int r27 = 4;
    L11:
        $dirty = $dirty | r27;
        goto L14
    L10:
        r27 = 2;
        goto L11
    }

    private static final int NavigationBarItem$lambda$3(MutableIntState $itemWidth$delegate) {
        MutableIntState $this$getValue$iv = $itemWidth$delegate;
        return $this$getValue$iv.getIntValue();
    }

    private static final void NavigationBarItem$lambda$4(MutableIntState $itemWidth$delegate, int value) {
        $itemWidth$delegate.setIntValue(value);
    }

    private static final void NavigationBarItemLayout(final Function2<? super Composer, ? super Integer, Unit> r56, final Function2<? super Composer, ? super Integer, Unit> r57, final Function2<? super Composer, ? super Integer, Unit> r58, final Function2<? super Composer, ? super Integer, Unit> r59, final boolean alwaysShowLabel, final Function0<Float> r61, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1427075886);
        ComposerKt.sourceInformation($composer2, "C(NavigationBarItemLayout)P(4,3,2,5)531@23350L1717,516@22954L2113:NavigationBar.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r56) == false) goto L7;
        int r10 = 4;
    L8:
        $dirty = $dirty | r10;
        goto L10
    L7:
        r10 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r57) == false) goto L14;
        int r11 = 32;
    L15:
        $dirty = $dirty | r11;
        goto L17
    L14:
        r11 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changedInstance(r58) == false) goto L21;
        int r12 = 256;
    L22:
        $dirty = $dirty | r12;
        goto L24
    L21:
        r12 = 128;
    L24:
        if (($changed & 3072) != 0) goto L31;
        if ($composer2.changedInstance(r59) == false) goto L28;
        int r13 = 2048;
    L29:
        $dirty = $dirty | r13;
        goto L31
    L28:
        r13 = 1024;
    L31:
        if (($changed & 24576) != 0) goto L38;
        if ($composer2.changed(alwaysShowLabel) == false) goto L35;
        int r14 = 16384;
    L36:
        $dirty = $dirty | r14;
        goto L38
    L35:
        r14 = 8192;
    L38:
        if ((196608 & $changed) != 0) goto L45;
        if ($composer2.changedInstance(r61) == false) goto L42;
        int r15 = 131072;
    L43:
        $dirty = $dirty | r15;
        goto L45
    L42:
        r15 = 65536;
    L45:
        if ((74899 & $dirty) != 74898) goto L51;
        if ($composer2.getSkipping() == false) goto L51;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L138:
        ScopeUpdateScope r8 = $composer3.endRestartGroup();
        if (r8 == null) goto L142;
        r8.updateScope(new C05403(r56, r57, r58, r59, alwaysShowLabel, r61, $changed));
        return;
    L142:
        return;
    L51:
        if (ComposerKt.isTraceInProgress() == false) goto L53;
        ComposerKt.traceEventStart(-1427075886, $dirty, -1, "androidx.compose.material3.NavigationBarItemLayout (NavigationBar.kt:515)");
    L53:
        ComposerKt.sourceInformationMarkerStart($composer2, -96243506, "CC(remember):NavigationBar.kt#9igjgp");
        if (($dirty & 458752) != 131072) goto L56;
        boolean r16 = true;
    L58:
        if (($dirty & 7168) != 2048) goto L60;
        boolean r17 = true;
    L61:
        boolean r18 = r17 | r16;
        if (($dirty & 57344) != 16384) goto L64;
        boolean r19 = true;
    L65:
        boolean invalid$iv = r18 | r19;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L68;
    L71:
        MeasurePolicy value$iv = new NavigationBarKt$NavigationBarItemLayout$2$1(r61, r59, alwaysShowLabel);
        $composer2.updateRememberedValue(value$iv);
    L72:
        MeasurePolicy measurePolicy$iv = (MeasurePolicy) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        Modifier modifier$iv = Modifier.Companion;
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r23 = ComposeUiNode.Companion.getConstructor();
        int $dirty2 = $dirty;
        int $changed$iv$iv = ((0 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L75;
        ComposablesKt.invalidApplier();
    L75:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L78;
        Function0<ComposeUiNode> r9 = r23;
        $composer2.createNode(r9);
    L79:
        $composer3 = $composer2;
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r20 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L86;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == false) goto L86;
    L87:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        int r0 = ($changed$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -656747336, "C517@22971L17,518@22997L11,520@23018L50:NavigationBar.kt#uh7d8r");
        r56.invoke($composer3, Integer.valueOf($dirty2 & 14));
        r57.invoke($composer3, Integer.valueOf(($dirty2 >> 3) & 14));
        Modifier modifier$iv2 = LayoutIdKt.layoutId(Modifier.Companion, IconLayoutIdTag);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer3, modifier$iv2);
        Function0<ComposeUiNode> r42 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L90;
        ComposablesKt.invalidApplier();
    L90:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L93;
        Function0<ComposeUiNode> r1 = r42;
        $composer3.createNode(r1);
    L94:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r110 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L101;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L101;
    L102:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r2 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r47 = BoxScopeInstance.INSTANCE;
        int r49 = ((6 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -2034269370, "C520@23060L6:NavigationBar.kt#uh7d8r");
        r58.invoke($composer3, Integer.valueOf(($dirty2 >> 6) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.startReplaceGroup(1087196576);
        ComposerKt.sourceInformation($composer3, "524@23182L96,523@23111L221");
        if (r59 == null) goto L135;
        Modifier r3 = LayoutIdKt.layoutId(Modifier.Companion, LabelLayoutIdTag);
        ComposerKt.sourceInformationMarkerStart($composer3, 1087199736, "CC(remember):NavigationBar.kt#9igjgp");
        if (($dirty2 & 57344) != 16384) goto L107;
        boolean r7 = true;
    L109:
        if (($dirty2 & 458752) != 131072) goto L111;
        boolean r111 = true;
    L112:
        boolean invalid$iv2 = r7 | r111;
        Object it$iv2 = $composer3.rememberedValue();
        if (invalid$iv2 == false) goto L115;
    L118:
        Object value$iv2 = (Function1) new NavigationBarKt$NavigationBarItemLayout$1$2$1(alwaysShowLabel, r61);
        $composer3.updateRememberedValue(value$iv2);
    L119:
        ComposerKt.sourceInformationMarkerEnd($composer3);
        Modifier modifier$iv3 = GraphicsLayerModifierKt.graphicsLayer(r3, (Function1) value$iv2);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv2 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
        int $changed$iv$iv3 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer3, modifier$iv3);
        Function0<ComposeUiNode> r112 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv3 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L122;
        ComposablesKt.invalidApplier();
    L122:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L125;
        Function0<ComposeUiNode> r4 = r112;
        $composer3.createNode(r4);
    L126:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L132;
        int $changed$iv = 0;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == true) goto L134;
    L133:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r5);
    L134:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r6 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r21 = BoxScopeInstance.INSTANCE;
        int r113 = (($changed$iv >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -2034020347, "C528@23311L7:NavigationBar.kt#uh7d8r");
        r59.invoke($composer3, Integer.valueOf(($dirty2 >> 9) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        goto L135
    L132:
        $changed$iv = 0;
        goto L133
    L125:
        r4 = r112;
        $composer3.useNode();
        goto L126
    L115:
        if (it$iv2 == Composer.Companion.getEmpty()) goto L118;
        value$iv2 = it$iv2;
        goto L119
    L111:
        r111 = false;
        goto L112
    L107:
        r7 = false;
    L135:
        $composer3.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L138;
        ComposerKt.traceEventEnd();
    L101:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r110);
        goto L102
    L93:
        r1 = r42;
        $composer3.useNode();
    L86:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r20);
        goto L87
    L78:
        r9 = r23;
        $composer2.useNode();
        goto L79
    L68:
        if (it$iv == Composer.Companion.getEmpty()) goto L71;
        value$iv = it$iv;
        goto L72
    L64:
        r19 = false;
        goto L65
    L60:
        r17 = false;
        goto L61
    L56:
        r16 = false;
        goto L58
    }

    /* JADX INFO: renamed from: placeIcon-X9ElhV4, reason: not valid java name */
    private static final MeasureResult m2403placeIconX9ElhV4(MeasureScope $this$placeIcon_u2dX9ElhV4, final Placeable iconPlaceable, final Placeable indicatorRipplePlaceable, final Placeable indicatorPlaceable, long constraints) {
        final int width = Constraints.m6926getMaxWidthimpl(constraints);
        final int height = ConstraintsKt.m6942constrainHeightK40F9xA(constraints, $this$placeIcon_u2dX9ElhV4.mo370roundToPx0680j_4(NavigationBarHeight));
        final int iconX = (width - iconPlaceable.getWidth()) / 2;
        final int iconY = (height - iconPlaceable.getHeight()) / 2;
        final int rippleX = (width - indicatorRipplePlaceable.getWidth()) / 2;
        final int rippleY = (height - indicatorRipplePlaceable.getHeight()) / 2;
        return MeasureScope.layout$default($this$placeIcon_u2dX9ElhV4, width, height, null, new NavigationBarKt$placeIcon$1(indicatorPlaceable, iconPlaceable, iconX, iconY, indicatorRipplePlaceable, rippleX, rippleY, width, height), 4, null);
    }

    /* JADX INFO: renamed from: placeLabelAndIcon-zUg2_y0, reason: not valid java name */
    private static final MeasureResult m2404placeLabelAndIconzUg2_y0(final MeasureScope $this$placeLabelAndIcon_u2dzUg2_y0, final Placeable labelPlaceable, final Placeable iconPlaceable, final Placeable indicatorRipplePlaceable, final Placeable indicatorPlaceable, long constraints, final boolean alwaysShowLabel, final float animationProgress) {
        float contentHeight = ((iconPlaceable.getHeight() + $this$placeLabelAndIcon_u2dzUg2_y0.mo376toPx0680j_4(IndicatorVerticalPadding)) + $this$placeLabelAndIcon_u2dzUg2_y0.mo376toPx0680j_4(NavigationBarIndicatorToLabelPadding)) + labelPlaceable.getHeight();
        final float contentVerticalPadding = RangesKt.coerceAtLeast((Constraints.m6927getMinHeightimpl(constraints) - contentHeight) / 2.0f, $this$placeLabelAndIcon_u2dzUg2_y0.mo376toPx0680j_4(IndicatorVerticalPadding));
        float height = contentHeight + (contentVerticalPadding * 2.0f);
        if (alwaysShowLabel == false) goto L5;
        float r0 = contentVerticalPadding;
    L6:
        float unselectedIconY = r0;
        float iconDistance = unselectedIconY - contentVerticalPadding;
        final float offset = iconDistance * (1.0f - animationProgress);
        final float labelY = ((iconPlaceable.getHeight() + contentVerticalPadding) + $this$placeLabelAndIcon_u2dzUg2_y0.mo376toPx0680j_4(IndicatorVerticalPadding)) + $this$placeLabelAndIcon_u2dzUg2_y0.mo376toPx0680j_4(NavigationBarIndicatorToLabelPadding);
        final int containerWidth = Constraints.m6926getMaxWidthimpl(constraints);
        final int labelX = (containerWidth - labelPlaceable.getWidth()) / 2;
        final int iconX = (containerWidth - iconPlaceable.getWidth()) / 2;
        final int rippleX = (containerWidth - indicatorRipplePlaceable.getWidth()) / 2;
        final float rippleY = contentVerticalPadding - $this$placeLabelAndIcon_u2dzUg2_y0.mo376toPx0680j_4(IndicatorVerticalPadding);
        return MeasureScope.layout$default($this$placeLabelAndIcon_u2dzUg2_y0, containerWidth, MathKt.roundToInt(height), null, new NavigationBarKt$placeLabelAndIcon$1(indicatorPlaceable, alwaysShowLabel, animationProgress, labelPlaceable, labelX, labelY, offset, iconPlaceable, iconX, contentVerticalPadding, indicatorRipplePlaceable, rippleX, rippleY, containerWidth, $this$placeLabelAndIcon_u2dzUg2_y0), 4, null);
    L5:
        r0 = (height - iconPlaceable.getHeight()) / 2.0f;
        goto L6
    }

    static {
        NavigationBarHeight = NavigationBarTokens.INSTANCE.m3447getContainerHeightD9Ej5fM();
        NavigationBarItemHorizontalPadding = Dp.m6973constructorimpl(8);
        NavigationBarIndicatorToLabelPadding = Dp.m6973constructorimpl(4);
        float arg0$iv = NavigationBarTokens.INSTANCE.m3445getActiveIndicatorWidthD9Ej5fM();
        float other$iv = NavigationBarTokens.INSTANCE.m3448getIconSizeD9Ej5fM();
        IndicatorHorizontalPadding = Dp.m6973constructorimpl(Dp.m6973constructorimpl(arg0$iv - other$iv) / 2);
        float arg0$iv2 = NavigationBarTokens.INSTANCE.m3444getActiveIndicatorHeightD9Ej5fM();
        float other$iv2 = NavigationBarTokens.INSTANCE.m3448getIconSizeD9Ej5fM();
        IndicatorVerticalPadding = Dp.m6973constructorimpl(Dp.m6973constructorimpl(arg0$iv2 - other$iv2) / 2);
        IndicatorVerticalOffset = Dp.m6973constructorimpl(12);
    }

    public static final float getNavigationBarItemHorizontalPadding() {
        return NavigationBarItemHorizontalPadding;
    }

    public static final float getNavigationBarIndicatorToLabelPadding() {
        return NavigationBarIndicatorToLabelPadding;
    }

    public static final float getIndicatorVerticalPadding() {
        return IndicatorVerticalPadding;
    }
}
