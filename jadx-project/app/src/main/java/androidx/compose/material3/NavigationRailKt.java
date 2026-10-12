package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.internal.MappedInteractionSource;
import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
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

/* JADX INFO: compiled from: NavigationRail.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001az\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2 \b\u0002\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001e¢\u0006\u0002\b ¢\u0006\u0002\b!2\b\b\u0002\u0010\"\u001a\u00020#2\u001c\u0010$\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00170\u001e¢\u0006\u0002\b ¢\u0006\u0002\b!H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\u0081\u0001\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00170+2\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00170+¢\u0006\u0002\b 2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010-\u001a\u00020)2\u0015\b\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010+¢\u0006\u0002\b 2\b\b\u0002\u0010/\u001a\u00020)2\b\b\u0002\u00100\u001a\u0002012\n\b\u0002\u00102\u001a\u0004\u0018\u000103H\u0007¢\u0006\u0002\u00104\u001aq\u00105\u001a\u00020\u00172\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\u00170+¢\u0006\u0002\b 2\u0011\u00107\u001a\r\u0012\u0004\u0012\u00020\u00170+¢\u0006\u0002\b 2\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00170+¢\u0006\u0002\b 2\u0013\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010+¢\u0006\u0002\b 2\u0006\u0010/\u001a\u00020)2\f\u00108\u001a\b\u0012\u0004\u0012\u0002090+H\u0003¢\u0006\u0002\u0010:\u001a8\u0010;\u001a\u00020<*\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?2\b\u0010A\u001a\u0004\u0018\u00010?2\u0006\u0010B\u001a\u00020CH\u0002ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001aP\u0010F\u001a\u00020<*\u00020=2\u0006\u0010G\u001a\u00020?2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?2\b\u0010A\u001a\u0004\u0018\u00010?2\u0006\u0010B\u001a\u00020C2\u0006\u0010/\u001a\u00020)2\u0006\u00108\u001a\u000209H\u0002ø\u0001\u0000¢\u0006\u0004\bH\u0010I\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0016\u0010\r\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u000e\u0010\u000f\"\u0016\u0010\u0010\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0011\u0010\u000f\"\u0016\u0010\u0012\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0013\u0010\u000f\"\u0016\u0010\u0014\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0015\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006J²\u0006\n\u0010K\u001a\u00020\u001bX\u008a\u0084\u0002²\u0006\n\u0010L\u001a\u00020\u001bX\u008a\u0084\u0002"}, d2 = {"IconLayoutIdTag", "", "IndicatorHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "IndicatorLayoutIdTag", "IndicatorRippleLayoutIdTag", "IndicatorVerticalPaddingNoLabel", "IndicatorVerticalPaddingWithLabel", "ItemAnimationDurationMillis", "", "LabelLayoutIdTag", "NavigationRailHeaderPadding", "NavigationRailItemHeight", "getNavigationRailItemHeight", "()F", "NavigationRailItemVerticalPadding", "getNavigationRailItemVerticalPadding", "NavigationRailItemWidth", "getNavigationRailItemWidth", "NavigationRailVerticalPadding", "getNavigationRailVerticalPadding", "NavigationRail", "", "modifier", "Landroidx/compose/ui/Modifier;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "header", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "content", "NavigationRail-qi6gXK8", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationRailItem", "selected", "", "onClick", "Lkotlin/Function0;", NavigationRailKt.IconLayoutIdTag, "enabled", NavigationRailKt.LabelLayoutIdTag, "alwaysShowLabel", "colors", "Landroidx/compose/material3/NavigationRailItemColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationRailItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "NavigationRailItemLayout", NavigationRailKt.IndicatorRippleLayoutIdTag, NavigationRailKt.IndicatorLayoutIdTag, "animationProgress", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "placeIcon", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "iconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "indicatorRipplePlaceable", "indicatorPlaceable", "constraints", "Landroidx/compose/ui/unit/Constraints;", "placeIcon-X9ElhV4", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "labelPlaceable", "placeLabelAndIcon-zUg2_y0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;", "material3_release", "iconColor", "textColor"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class NavigationRailKt {
    private static final String IconLayoutIdTag = "icon";
    private static final float IndicatorHorizontalPadding = 0.0f;
    private static final String IndicatorLayoutIdTag = "indicator";
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final float IndicatorVerticalPaddingNoLabel = 0.0f;
    private static final float IndicatorVerticalPaddingWithLabel = 0.0f;
    private static final int ItemAnimationDurationMillis = 150;
    private static final String LabelLayoutIdTag = "label";
    private static final float NavigationRailHeaderPadding = 0.0f;
    private static final float NavigationRailItemHeight = 0.0f;
    private static final float NavigationRailItemVerticalPadding = 0.0f;
    private static final float NavigationRailItemWidth = 0.0f;
    private static final float NavigationRailVerticalPadding = 0.0f;

    public static final /* synthetic */ void access$NavigationRailItemLayout(Function2 indicatorRipple, Function2 indicator, Function2 icon, Function2 label, boolean alwaysShowLabel, Function0 animationProgress, Composer $composer, int $changed) {
        NavigationRailItemLayout(indicatorRipple, indicator, icon, label, alwaysShowLabel, animationProgress, $composer, $changed);
    }

    public static final /* synthetic */ float access$getIndicatorHorizontalPadding$p() {
        return IndicatorHorizontalPadding;
    }

    public static final /* synthetic */ float access$getIndicatorVerticalPaddingNoLabel$p() {
        return IndicatorVerticalPaddingNoLabel;
    }

    public static final /* synthetic */ float access$getIndicatorVerticalPaddingWithLabel$p() {
        return IndicatorVerticalPaddingWithLabel;
    }

    public static final /* synthetic */ float access$getNavigationRailHeaderPadding$p() {
        return NavigationRailHeaderPadding;
    }

    /* JADX INFO: renamed from: access$placeIcon-X9ElhV4, reason: not valid java name */
    public static final /* synthetic */ MeasureResult m2463access$placeIconX9ElhV4(MeasureScope $receiver, Placeable iconPlaceable, Placeable indicatorRipplePlaceable, Placeable indicatorPlaceable, long constraints) {
        return m2465placeIconX9ElhV4($receiver, iconPlaceable, indicatorRipplePlaceable, indicatorPlaceable, constraints);
    }

    /* JADX INFO: renamed from: access$placeLabelAndIcon-zUg2_y0, reason: not valid java name */
    public static final /* synthetic */ MeasureResult m2464access$placeLabelAndIconzUg2_y0(MeasureScope $receiver, Placeable labelPlaceable, Placeable iconPlaceable, Placeable indicatorRipplePlaceable, Placeable indicatorPlaceable, long constraints, boolean alwaysShowLabel, float animationProgress) {
        return m2466placeLabelAndIconzUg2_y0($receiver, labelPlaceable, iconPlaceable, indicatorRipplePlaceable, indicatorPlaceable, constraints, alwaysShowLabel, animationProgress);
    }

    /* JADX INFO: renamed from: NavigationRail-qi6gXK8, reason: not valid java name */
    public static final void m2462NavigationRailqi6gXK8(Modifier modifier, long containerColor, long contentColor, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r30, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r32, Composer $composer, final int $changed, final int r35) {
        Composer $composer2 = $composer.startRestartGroup(118552648);
        ComposerKt.sourceInformation($composer2, "C(NavigationRail)P(4,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3,5)113@5242L14,114@5284L31,116@5431L12,123@5614L618,119@5501L731:NavigationRail.kt#uh7d8r");
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
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r12 = r30;
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
        containerColor2 = NavigationRailDefaults.INSTANCE.getContainerColor($composer2, 6);
    L95:
        if ((r35 & 4) == 0) goto L97;
        contentColor2 = ColorSchemeKt.m2057contentColorForek8zF_U(containerColor2, $composer2, ($dirty >> 3) & 14);
        $dirty = $dirty & (-897);
    L97:
        if (r7 == 0) goto L100;
        r12 = null;
    L100:
        if ((r35 & 16) == 0) goto L102;
        final WindowInsets windowInsets2 = NavigationRailDefaults.INSTANCE.getWindowInsets($composer2, 6);
        long contentColor3 = contentColor2;
        Modifier modifier3 = modifier2;
        int $dirty2 = $dirty & (-57345);
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r2 = r12;
        long containerColor3 = containerColor2;
    L103:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L106;
        ComposerKt.traceEventStart(118552648, $dirty2, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:118)");
    L106:
        Composer $composer3 = $composer2;
        SurfaceKt.m2670SurfaceT9BRK9s(modifier3, null, containerColor3, contentColor3, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-2092683357, true, new NavigationRailKt$NavigationRail$1(windowInsets2, r2, r32), $composer2, 54), $composer3, ((($dirty2 & 14) | 12582912) | (($dirty2 << 3) & 896)) | (($dirty2 << 3) & 7168), 114);
        if (ComposerKt.isTraceInProgress() == false) goto L109;
        ComposerKt.traceEventEnd();
    L109:
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r6 = r2;
        final WindowInsets windowInsets3 = windowInsets2;
        final Modifier modifier4 = modifier3;
        final long containerColor4 = containerColor3;
        final long contentColor4 = contentColor3;
    L110:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L114;
        r14.updateScope(new NavigationRailKt$NavigationRail$2(modifier4, containerColor4, contentColor4, r6, windowInsets3, r32, $changed, r35));
        return;
    L114:
        return;
    L102:
        contentColor3 = contentColor2;
        windowInsets2 = r13;
        modifier3 = modifier2;
        $dirty2 = $dirty;
        r2 = r12;
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
        $dirty2 = $dirty & (-57345);
        contentColor3 = contentColor2;
        r2 = r12;
        modifier3 = r4;
        windowInsets2 = r13;
        containerColor3 = containerColor2;
        goto L103
    L87:
        $dirty2 = $dirty;
        contentColor3 = contentColor2;
        r2 = r12;
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
        r6 = r12;
        goto L110
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L68;
        if ($composer2.changedInstance(r32) == false) goto L65;
        int r15 = 131072;
    L66:
        $dirty = $dirty | r15;
        goto L68
    L65:
        r15 = 65536;
        goto L66
    L49:
        if ((r35 & 16) != 0) goto L53;
        r13 = windowInsets;
        if ($composer2.changed(r13) == false) goto L54;
        int r16 = 16384;
    L55:
        $dirty = $dirty | r16;
    L54:
        r16 = 8192;
        goto L55
    L53:
        r13 = windowInsets;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        r12 = r30;
        if ($composer2.changedInstance(r12) == false) goto L43;
        int r17 = 2048;
    L44:
        $dirty = $dirty | r17;
        goto L47
    L43:
        r17 = 1024;
        goto L44
    L45:
        r12 = r30;
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

    public static final void NavigationRailItem(final boolean selected, final Function0<Unit> r49, final Function2<? super Composer, ? super Integer, Unit> r50, Modifier modifier, boolean enabled, Function2<? super Composer, ? super Integer, Unit> r53, boolean alwaysShowLabel, NavigationRailItemColors colors, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int r59) {
        Composer $composer2 = $composer.startRestartGroup(-1533971045);
        ComposerKt.sourceInformation($composer2, "C(NavigationRailItem)P(8,7,3,6,2,5)179@8055L8,185@8288L633,215@9569L2776:NavigationRail.kt#uh7d8r");
        int $dirty = $changed;
        if ((r59 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r59 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
        Function0<Unit> r3 = r49;
    L24:
        if ((r59 & 4) == 0) goto L27;
        $dirty = $dirty | 384;
        Function2<? super Composer, ? super Integer, Unit> r5 = r50;
    L34:
        int r6 = r59 & 8;
        if (r6 == 0) goto L38;
        $dirty = $dirty | 3072;
        Modifier modifier2 = modifier;
    L45:
        int r8 = r59 & 16;
        if (r8 == 0) goto L49;
        $dirty = $dirty | 24576;
        final boolean enabled2 = enabled;
    L56:
        int r13 = r59 & 32;
        if (r13 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        final Function2<? super Composer, ? super Integer, Unit> r14 = r53;
    L67:
        int r15 = r59 & 64;
        if (r15 == 0) goto L71;
        $dirty = $dirty | 1572864;
        boolean alwaysShowLabel2 = alwaysShowLabel;
    L79:
        if (($changed & 12582912) != 0) goto L89;
        if ((r59 & 128) != 0) goto L86;
        if ($composer2.changed(colors) == false) goto L86;
        int r18 = 8388608;
    L87:
        $dirty = $dirty | r18;
    L86:
        r18 = 4194304;
    L89:
        int r0 = r59 & 256;
        if (r0 == 0) goto L93;
        $dirty = $dirty | 100663296;
    L101:
        if (($dirty & 38347923) == 38347922) goto L103;
    L106:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L109;
    L115:
        if (r6 == 0) goto L117;
        modifier2 = Modifier.Companion;
    L117:
        if (r8 == 0) goto L119;
        enabled2 = true;
    L119:
        if (r13 == 0) goto L121;
        r14 = null;
    L121:
        if (r15 == 0) goto L124;
        alwaysShowLabel2 = true;
    L124:
        if ((r59 & 128) == 0) goto L126;
        final NavigationRailItemColors colors2 = NavigationRailItemDefaults.INSTANCE.colors($composer2, 6);
        $dirty = $dirty & (-29360129);
    L127:
        if (r0 == 0) goto L129;
        MutableInteractionSource interactionSource2 = null;
        boolean alwaysShowLabel3 = alwaysShowLabel2;
    L130:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L133;
        ComposerKt.traceEventStart(-1533971045, $dirty, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:181)");
    L133:
        $composer2.startReplaceGroup(-782588008);
        ComposerKt.sourceInformation($composer2, "183@8207L39");
        if (interactionSource2 != null) goto L140;
        ComposerKt.sourceInformationMarkerStart($composer2, -782587357, "CC(remember):NavigationRail.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L138;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
    L139:
        MutableInteractionSource interactionSource3 = (MutableInteractionSource) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
    L141:
        $composer2.endReplaceGroup();
        final Function2<? super Composer, ? super Integer, Unit> r57 = r5;
        final boolean enabled3 = enabled2;
        final Function2<? super Composer, ? super Integer, Unit> r55 = r14;
        final boolean alwaysShowLabel4 = alwaysShowLabel3;
        final NavigationRailItemColors colors3 = colors2;
        MutableInteractionSource interactionSource4 = interactionSource3;
        Function2 styledIcon = ComposableLambdaKt.rememberComposableLambda(-1023357515, true, new NavigationRailKt$NavigationRailItem$styledIcon$1(colors2, selected, enabled3, r55, alwaysShowLabel4, r57), $composer2, 54);
        $composer2.startReplaceGroup(-782561860);
        ComposerKt.sourceInformation($composer2, "*200@9017L536");
        if (r14 != null) goto L144;
        Function2 styledLabel = null;
    L145:
        $composer2.endReplaceGroup();
        Modifier modifier$iv = SizeKt.m779widthInVpY3zN4$default(SizeKt.m757defaultMinSizeVpY3zN4$default(SelectableKt.m986selectableO2vRcR0(modifier2, selected, interactionSource4, null, enabled2, Role.m6174boximpl(Role.Companion.m6188getTabo7Vup1c()), r3), 0.0f, NavigationRailItemHeight, 1, null), NavigationRailItemWidth, 0.0f, 2, null);
        Alignment contentAlignment$iv = Alignment.Companion.getCenter();
        int $dirty2 = $dirty;
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, true);
        int $changed$iv$iv = (432 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r19 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        MutableInteractionSource interactionSource5 = interactionSource2;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L148;
        ComposablesKt.invalidApplier();
    L148:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L151;
        Function0<ComposeUiNode> r1 = r19;
        $composer2.createNode(r1);
    L152:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L159;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L159;
    L160:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r4 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r7 = BoxScopeInstance.INSTANCE;
        int r9 = ((432 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 584386773, "C231@10130L157,*240@10571L7,246@10874L128,260@11450L261,268@11760L280,282@12301L27,276@12050L289:NavigationRail.kt#uh7d8r");
        if (selected == false) goto L163;
        float r35 = 1.0f;
    L164:
        final State<Float> r10 = AnimateAsStateKt.animateFloatAsState(r35, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, $composer2, 48, 28);
        ProvidableCompositionLocal<Density> r11 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r12 = $composer2.consume(r11);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Density $this$NavigationRailItem_u24lambda_u245_u24lambda_u242 = (Density) r12;
        int itemWidth = $this$NavigationRailItem_u24lambda_u245_u24lambda_u242.mo370roundToPx0680j_4(NavigationRailItemWidth);
        int indicatorWidth = $this$NavigationRailItem_u24lambda_u245_u24lambda_u242.mo370roundToPx0680j_4(NavigationRailTokens.INSTANCE.m3456getActiveIndicatorWidthD9Ej5fM());
        long deltaOffset = OffsetKt.Offset((itemWidth - indicatorWidth) / 2.0f, 0.0f);
        Unit r16 = Unit.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -119672869, "CC(remember):NavigationRail.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(interactionSource4) | $composer2.changed(deltaOffset);
        Object value$iv2 = $composer2.rememberedValue();
        if (invalid$iv == true) goto L171;
        if (value$iv2 == Composer.Companion.getEmpty()) goto L171;
    L172:
        final MappedInteractionSource offsetInteractionSource = (MappedInteractionSource) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (r14 == null) goto L175;
        $composer2.startReplaceGroup(585295320);
        ComposerKt.sourceInformation($composer2, "252@11124L5");
        final Shape indicatorShape = ShapesKt.getValue(NavigationRailTokens.INSTANCE.getActiveIndicatorShape(), $composer2, 6);
        $composer2.endReplaceGroup();
    L176:
        Function2 indicatorRipple = ComposableLambdaKt.rememberComposableLambda(211026382, true, new NavigationRailKt$NavigationRailItem$1$indicatorRipple$1(indicatorShape, offsetInteractionSource), $composer2, 54);
        Function2 indicator = ComposableLambdaKt.rememberComposableLambda(-1862011490, true, new NavigationRailKt$NavigationRailItem$1$indicator$1(r10, colors3, indicatorShape), $composer2, 54);
        ComposerKt.sourceInformationMarkerStart($composer2, -119627306, "CC(remember):NavigationRail.kt#9igjgp");
        boolean invalid$iv2 = $composer2.changed(r10);
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L183;
        if (it$iv2 == Composer.Companion.getEmpty()) goto L183;
        Object value$iv3 = it$iv2;
    L184:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        NavigationRailItemLayout(indicatorRipple, indicator, styledIcon, styledLabel, alwaysShowLabel3, (Function0) value$iv3, $composer2, (($dirty2 >> 6) & 57344) | 438);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L187;
        ComposerKt.traceEventEnd();
    L187:
        final boolean enabled4 = enabled2;
        final boolean alwaysShowLabel5 = alwaysShowLabel3;
        final MutableInteractionSource interactionSource6 = interactionSource5;
        final Modifier modifier3 = modifier2;
        final Function2<? super Composer, ? super Integer, Unit> r17 = r14;
    L188:
        ScopeUpdateScope r110 = $composer2.endRestartGroup();
        if (r110 == null) goto L192;
        r110.updateScope(new AnonymousClass2(selected, r49, r50, modifier3, enabled4, r17, alwaysShowLabel5, colors3, interactionSource6, $changed, r59));
        return;
    L192:
        return;
    L183:
        value$iv3 = (Function0) new NavigationRailKt$NavigationRailItem$1$2$1(r10);
        $composer2.updateRememberedValue(value$iv3);
        goto L184
    L175:
        $composer2.startReplaceGroup(585379857);
        ComposerKt.sourceInformation($composer2, "254@11216L5");
        indicatorShape = ShapesKt.getValue(NavigationRailTokens.INSTANCE.getNoLabelActiveIndicatorShape(), $composer2, 6);
        $composer2.endReplaceGroup();
    L171:
        value$iv2 = new MappedInteractionSource(interactionSource4, deltaOffset, null);
        $composer2.updateRememberedValue(value$iv2);
        goto L172
    L163:
        r35 = 0.0f;
    L159:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r2);
        goto L160
    L151:
        r1 = r19;
        $composer2.useNode();
        goto L152
    L144:
        styledLabel = ComposableLambdaKt.rememberComposableLambda(-105269599, true, new NavigationRailKt$NavigationRailItem$styledLabel$1$1(colors3, selected, enabled2, r14), $composer2, 54);
        goto L145
    L138:
        value$iv = it$iv;
        goto L139
    L140:
        interactionSource3 = interactionSource2;
        goto L141
    L129:
        interactionSource2 = interactionSource;
        alwaysShowLabel3 = alwaysShowLabel2;
        goto L130
    L126:
        colors2 = colors;
        goto L127
    L109:
        if ($composer2.getDefaultsInvalid() == true) goto L115;
        $composer2.skipToGroupEnd();
        if ((r59 & 128) == 0) goto L114;
        $dirty = $dirty & (-29360129);
    L114:
        colors2 = colors;
        interactionSource2 = interactionSource;
        alwaysShowLabel3 = alwaysShowLabel2;
        goto L130
    L103:
        if ($composer2.getSkipping() == false) goto L106;
        $composer2.skipToGroupEnd();
        Modifier r20 = modifier2;
        alwaysShowLabel5 = alwaysShowLabel2;
        modifier3 = r20;
        colors3 = colors;
        enabled4 = enabled2;
        interactionSource6 = interactionSource;
        r17 = r14;
        goto L188
    L93:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changed(interactionSource) == false) goto L97;
        int r111 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty = $dirty | r111;
        goto L101
    L97:
        r111 = 33554432;
        goto L98
    L71:
        if (($changed & 1572864) != 0) goto L77;
        alwaysShowLabel2 = alwaysShowLabel;
        if ($composer2.changed(alwaysShowLabel2) == false) goto L75;
        int r112 = 1048576;
    L76:
        $dirty = $dirty | r112;
        goto L79
    L75:
        r112 = 524288;
        goto L76
    L77:
        alwaysShowLabel2 = alwaysShowLabel;
        goto L79
    L60:
        if ((196608 & $changed) != 0) goto L66;
        r14 = r53;
        if ($composer2.changedInstance(r14) == false) goto L64;
        int r113 = 131072;
    L65:
        $dirty = $dirty | r113;
        goto L67
    L64:
        r113 = 65536;
        goto L65
    L66:
        r14 = r53;
        goto L67
    L49:
        if (($changed & 24576) != 0) goto L55;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L53;
        int r114 = 16384;
    L54:
        $dirty = $dirty | r114;
        goto L56
    L53:
        r114 = 8192;
        goto L54
    L55:
        enabled2 = enabled;
        goto L56
    L38:
        if (($changed & 3072) != 0) goto L44;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L42;
        int r21 = 2048;
    L43:
        $dirty = $dirty | r21;
        goto L45
    L42:
        r21 = 1024;
        goto L43
    L44:
        modifier2 = modifier;
        goto L45
    L27:
        if (($changed & 384) != 0) goto L33;
        r5 = r50;
        if ($composer2.changedInstance(r5) == false) goto L31;
        int r22 = 256;
    L32:
        $dirty = $dirty | r22;
        goto L34
    L31:
        r22 = 128;
        goto L32
    L33:
        r5 = r50;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L22;
        r3 = r49;
        if ($composer2.changedInstance(r3) == false) goto L20;
        int r23 = 32;
    L21:
        $dirty = $dirty | r23;
        goto L24
    L20:
        r23 = 16;
        goto L21
    L22:
        r3 = r49;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(selected) == false) goto L10;
        int r24 = 4;
    L11:
        $dirty = $dirty | r24;
        goto L13
    L10:
        r24 = 2;
        goto L11
    }

    private static final void NavigationRailItemLayout(final Function2<? super Composer, ? super Integer, Unit> r56, final Function2<? super Composer, ? super Integer, Unit> r57, final Function2<? super Composer, ? super Integer, Unit> r58, final Function2<? super Composer, ? super Integer, Unit> r59, final boolean alwaysShowLabel, final Function0<Float> r61, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1498399348);
        ComposerKt.sourceInformation($composer2, "C(NavigationRailItemLayout)P(4,3,2,5)530@23300L1924,515@22904L2320:NavigationRail.kt#uh7d8r");
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
        r8.updateScope(new AnonymousClass3(r56, r57, r58, r59, alwaysShowLabel, r61, $changed));
        return;
    L142:
        return;
    L51:
        if (ComposerKt.isTraceInProgress() == false) goto L53;
        ComposerKt.traceEventStart(1498399348, $dirty, -1, "androidx.compose.material3.NavigationRailItemLayout (NavigationRail.kt:514)");
    L53:
        ComposerKt.sourceInformationMarkerStart($composer2, -1881815062, "CC(remember):NavigationRail.kt#9igjgp");
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
        MeasurePolicy value$iv = new NavigationRailKt$NavigationRailItemLayout$2$1(r61, r59, alwaysShowLabel);
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
        ComposerKt.sourceInformationMarkerStart($composer3, 2082816907, "C516@22921L17,517@22947L11,519@22968L50:NavigationRail.kt#uh7d8r");
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
        ComposerKt.sourceInformationMarkerStart($composer3, 402566553, "C519@23010L6:NavigationRail.kt#uh7d8r");
        r58.invoke($composer3, Integer.valueOf(($dirty2 >> 6) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.startReplaceGroup(2145400941);
        ComposerKt.sourceInformation($composer3, "523@23132L96,522@23061L221");
        if (r59 == null) goto L135;
        Modifier r3 = LayoutIdKt.layoutId(Modifier.Companion, LabelLayoutIdTag);
        ComposerKt.sourceInformationMarkerStart($composer3, 2145404101, "CC(remember):NavigationRail.kt#9igjgp");
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
        Object value$iv2 = (Function1) new NavigationRailKt$NavigationRailItemLayout$1$2$1(alwaysShowLabel, r61);
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
        ComposerKt.sourceInformationMarkerStart($composer3, 402815576, "C527@23261L7:NavigationRail.kt#uh7d8r");
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
    private static final MeasureResult m2465placeIconX9ElhV4(MeasureScope $this$placeIcon_u2dX9ElhV4, final Placeable iconPlaceable, final Placeable indicatorRipplePlaceable, final Placeable indicatorPlaceable, long constraints) {
        int r2 = iconPlaceable.getWidth();
        int r3 = indicatorRipplePlaceable.getWidth();
        if (indicatorPlaceable == null) goto L5;
        int r4 = indicatorPlaceable.getWidth();
    L6:
        final int width = ConstraintsKt.m6943constrainWidthK40F9xA(constraints, Math.max(r2, Math.max(r3, r4)));
        final int height = ConstraintsKt.m6942constrainHeightK40F9xA(constraints, $this$placeIcon_u2dX9ElhV4.mo370roundToPx0680j_4(NavigationRailItemHeight));
        final int iconX = (width - iconPlaceable.getWidth()) / 2;
        final int iconY = (height - iconPlaceable.getHeight()) / 2;
        final int rippleX = (width - indicatorRipplePlaceable.getWidth()) / 2;
        final int rippleY = (height - indicatorRipplePlaceable.getHeight()) / 2;
        return MeasureScope.layout$default($this$placeIcon_u2dX9ElhV4, width, height, null, new NavigationRailKt$placeIcon$1(indicatorPlaceable, iconPlaceable, iconX, iconY, indicatorRipplePlaceable, rippleX, rippleY, width, height), 4, null);
    L5:
        r4 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: placeLabelAndIcon-zUg2_y0, reason: not valid java name */
    private static final MeasureResult m2466placeLabelAndIconzUg2_y0(final MeasureScope $this$placeLabelAndIcon_u2dzUg2_y0, final Placeable labelPlaceable, final Placeable iconPlaceable, final Placeable indicatorRipplePlaceable, final Placeable indicatorPlaceable, long constraints, final boolean alwaysShowLabel, final float animationProgress) {
        float contentHeight = ((iconPlaceable.getHeight() + $this$placeLabelAndIcon_u2dzUg2_y0.mo376toPx0680j_4(IndicatorVerticalPaddingWithLabel)) + $this$placeLabelAndIcon_u2dzUg2_y0.mo376toPx0680j_4(NavigationRailItemVerticalPadding)) + labelPlaceable.getHeight();
        final float contentVerticalPadding = RangesKt.coerceAtLeast((Constraints.m6927getMinHeightimpl(constraints) - contentHeight) / 2.0f, $this$placeLabelAndIcon_u2dzUg2_y0.mo376toPx0680j_4(IndicatorVerticalPaddingWithLabel));
        float height = contentHeight + (contentVerticalPadding * 2.0f);
        if (alwaysShowLabel == false) goto L5;
        float r0 = contentVerticalPadding;
    L6:
        float unselectedIconY = r0;
        float iconDistance = unselectedIconY - contentVerticalPadding;
        final float offset = iconDistance * (1.0f - animationProgress);
        final float labelY = ((iconPlaceable.getHeight() + contentVerticalPadding) + $this$placeLabelAndIcon_u2dzUg2_y0.mo376toPx0680j_4(IndicatorVerticalPaddingWithLabel)) + $this$placeLabelAndIcon_u2dzUg2_y0.mo376toPx0680j_4(NavigationRailItemVerticalPadding);
        int r1 = iconPlaceable.getWidth();
        int r2 = labelPlaceable.getWidth();
        if (indicatorPlaceable == null) goto L9;
        int r3 = indicatorPlaceable.getWidth();
    L10:
        final int width = ConstraintsKt.m6943constrainWidthK40F9xA(constraints, Math.max(r1, Math.max(r2, r3)));
        final int labelX = (width - labelPlaceable.getWidth()) / 2;
        final int iconX = (width - iconPlaceable.getWidth()) / 2;
        final int rippleX = (width - indicatorRipplePlaceable.getWidth()) / 2;
        final float rippleY = contentVerticalPadding - $this$placeLabelAndIcon_u2dzUg2_y0.mo376toPx0680j_4(IndicatorVerticalPaddingWithLabel);
        return MeasureScope.layout$default($this$placeLabelAndIcon_u2dzUg2_y0, width, MathKt.roundToInt(height), null, new NavigationRailKt$placeLabelAndIcon$1(indicatorPlaceable, alwaysShowLabel, animationProgress, labelPlaceable, labelX, labelY, offset, iconPlaceable, iconX, contentVerticalPadding, indicatorRipplePlaceable, rippleX, rippleY, width, $this$placeLabelAndIcon_u2dzUg2_y0), 4, null);
    L9:
        r3 = 0;
        goto L10
    L5:
        r0 = (height - iconPlaceable.getHeight()) / 2.0f;
        goto L6
    }

    static {
        NavigationRailVerticalPadding = Dp.m6973constructorimpl(4);
        NavigationRailHeaderPadding = Dp.m6973constructorimpl(8);
        NavigationRailItemWidth = NavigationRailTokens.INSTANCE.m3458getContainerWidthD9Ej5fM();
        NavigationRailItemHeight = NavigationRailTokens.INSTANCE.m3461getNoLabelActiveIndicatorHeightD9Ej5fM();
        NavigationRailItemVerticalPadding = Dp.m6973constructorimpl(4);
        float arg0$iv = NavigationRailTokens.INSTANCE.m3456getActiveIndicatorWidthD9Ej5fM();
        float other$iv = NavigationRailTokens.INSTANCE.m3459getIconSizeD9Ej5fM();
        IndicatorHorizontalPadding = Dp.m6973constructorimpl(Dp.m6973constructorimpl(arg0$iv - other$iv) / 2);
        float arg0$iv2 = NavigationRailTokens.INSTANCE.m3455getActiveIndicatorHeightD9Ej5fM();
        float other$iv2 = NavigationRailTokens.INSTANCE.m3459getIconSizeD9Ej5fM();
        IndicatorVerticalPaddingWithLabel = Dp.m6973constructorimpl(Dp.m6973constructorimpl(arg0$iv2 - other$iv2) / 2);
        float arg0$iv3 = NavigationRailTokens.INSTANCE.m3461getNoLabelActiveIndicatorHeightD9Ej5fM();
        float other$iv3 = NavigationRailTokens.INSTANCE.m3459getIconSizeD9Ej5fM();
        IndicatorVerticalPaddingNoLabel = Dp.m6973constructorimpl(Dp.m6973constructorimpl(arg0$iv3 - other$iv3) / 2);
    }

    public static final float getNavigationRailVerticalPadding() {
        return NavigationRailVerticalPadding;
    }

    public static final float getNavigationRailItemWidth() {
        return NavigationRailItemWidth;
    }

    public static final float getNavigationRailItemHeight() {
        return NavigationRailItemHeight;
    }

    public static final float getNavigationRailItemVerticalPadding() {
        return NavigationRailItemVerticalPadding;
    }
}
