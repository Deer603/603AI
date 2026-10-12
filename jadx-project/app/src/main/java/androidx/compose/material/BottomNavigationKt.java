package androidx.compose.material;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationConstants;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: BottomNavigation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a`\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00042\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001aX\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00042\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a?\u0010\u001c\u001a\u00020\u000b2\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u000b0\u001e¢\u0006\u0002\b\u00162\u0013\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001e¢\u0006\u0002\b\u00162\b\b\u0001\u0010 \u001a\u00020\u0002H\u0003¢\u0006\u0002\u0010!\u001aR\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020&2&\u0010\u0013\u001a\"\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0002\b\u0016H\u0003ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a\u0094\u0001\u0010,\u001a\u00020\u000b*\u00020\u00152\u0006\u0010%\u001a\u00020&2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001e2\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u000b0\u001e¢\u0006\u0002\b\u00162\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010.\u001a\u00020&2\u0015\b\u0002\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001e¢\u0006\u0002\b\u00162\b\b\u0002\u0010/\u001a\u00020&2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u00020\u00102\b\b\u0002\u00103\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a&\u00106\u001a\u000207*\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0002ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a8\u0010?\u001a\u000207*\u0002082\u0006\u0010@\u001a\u00020:2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\b\b\u0001\u0010 \u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\bA\u0010B\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C²\u0006\n\u0010)\u001a\u00020\u0002X\u008a\u0084\u0002"}, d2 = {"BottomNavigationAnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "BottomNavigationHeight", "Landroidx/compose/ui/unit/Dp;", "F", "BottomNavigationItemHorizontalPadding", "CombinedItemTextBaseline", "ZeroInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "BottomNavigation", "", "windowInsets", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "BottomNavigation-_UMDTes", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomNavigation-PEIptTM", "(Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomNavigationItemBaselineLayout", "icon", "Lkotlin/Function0;", "label", "iconPositionAnimationProgress", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLandroidx/compose/runtime/Composer;I)V", "BottomNavigationTransition", "activeColor", "inactiveColor", "selected", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "animationProgress", "BottomNavigationTransition-Klgx-Pg", "(JJZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "BottomNavigationItem", "onClick", "enabled", "alwaysShowLabel", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "selectedContentColor", "unselectedContentColor", "BottomNavigationItem-jY6E1Zs", "(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;III)V", "placeIcon", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "iconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "placeIcon-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "labelPlaceable", "placeLabelAndIcon-DIyivk0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BottomNavigationKt {
    private static final TweenSpec<Float> BottomNavigationAnimationSpec = null;
    private static final float BottomNavigationHeight = 0.0f;
    private static final float BottomNavigationItemHorizontalPadding = 0.0f;
    private static final float CombinedItemTextBaseline = 0.0f;
    private static final WindowInsets ZeroInsets = null;

    public static final /* synthetic */ void access$BottomNavigationItemBaselineLayout(Function2 icon, Function2 label, float iconPositionAnimationProgress, Composer $composer, int $changed) {
        BottomNavigationItemBaselineLayout(icon, label, iconPositionAnimationProgress, $composer, $changed);
    }

    /* JADX INFO: renamed from: access$BottomNavigationTransition-Klgx-Pg, reason: not valid java name */
    public static final /* synthetic */ void m1551access$BottomNavigationTransitionKlgxPg(long activeColor, long inactiveColor, boolean selected, Function3 content, Composer $composer, int $changed) {
        m1550BottomNavigationTransitionKlgxPg(activeColor, inactiveColor, selected, content, $composer, $changed);
    }

    public static final /* synthetic */ float access$BottomNavigationTransition_Klgx_Pg$lambda$2(State $animationProgress$delegate) {
        return BottomNavigationTransition_Klgx_Pg$lambda$2($animationProgress$delegate);
    }

    public static final /* synthetic */ float access$getBottomNavigationHeight$p() {
        return BottomNavigationHeight;
    }

    /* JADX INFO: renamed from: access$placeIcon-3p2s80s, reason: not valid java name */
    public static final /* synthetic */ MeasureResult m1552access$placeIcon3p2s80s(MeasureScope $receiver, Placeable iconPlaceable, long constraints) {
        return m1554placeIcon3p2s80s($receiver, iconPlaceable, constraints);
    }

    /* JADX INFO: renamed from: access$placeLabelAndIcon-DIyivk0, reason: not valid java name */
    public static final /* synthetic */ MeasureResult m1553access$placeLabelAndIconDIyivk0(MeasureScope $receiver, Placeable labelPlaceable, Placeable iconPlaceable, long constraints, float iconPositionAnimationProgress) {
        return m1555placeLabelAndIconDIyivk0($receiver, labelPlaceable, iconPlaceable, constraints, iconPositionAnimationProgress);
    }

    /* JADX INFO: renamed from: BottomNavigation-_UMDTes, reason: not valid java name */
    public static final void m1548BottomNavigation_UMDTes(final WindowInsets windowInsets, Modifier modifier, long backgroundColor, long contentColor, float elevation, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r31, Composer $composer, final int $changed, final int r34) {
        Composer $composer2 = $composer.startRestartGroup(-1278406810);
        ComposerKt.sourceInformation($composer2, "C(BottomNavigation)P(5,4,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.unit.Dp)113@4973L313,108@4829L457:BottomNavigation.kt#jmzs0o");
        int $dirty = $changed;
        if ((r34 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r4 = r34 & 2;
        if (r4 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        if (($changed & 384) == 0) goto L26;
        long backgroundColor2 = backgroundColor;
    L35:
        if (($changed & 3072) == 0) goto L37;
        long contentColor2 = contentColor;
    L45:
        int r12 = r34 & 16;
        if (r12 == 0) goto L49;
        $dirty = $dirty | 24576;
        float r13 = elevation;
    L57:
        if ((r34 & 32) == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L67:
        if ((74899 & $dirty) == 74898) goto L69;
        boolean r14 = true;
    L71:
        if ($composer2.shouldExecute(r14, $dirty & 1) == false) goto L102;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "103@4637L6,104@4686L32");
        if (($changed & 1) != 0) goto L75;
    L84:
        if (r4 == 0) goto L87;
        modifier2 = Modifier.Companion;
    L87:
        if ((r34 & 4) == 0) goto L90;
        backgroundColor2 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors($composer2, 6));
        $dirty = $dirty & (-897);
    L90:
        if ((r34 & 8) == 0) goto L92;
        contentColor2 = ColorsKt.m1616contentColorForek8zF_U(backgroundColor2, $composer2, ($dirty >> 6) & 14);
        $dirty = $dirty & (-7169);
    L92:
        if (r12 == 0) goto L94;
        float elevation2 = BottomNavigationDefaults.INSTANCE.m1546getElevationD9Ej5fM();
        long backgroundColor3 = backgroundColor2;
        long contentColor3 = contentColor2;
        Modifier modifier3 = modifier2;
    L95:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L98;
        ComposerKt.traceEventStart(-1278406810, $dirty, -1, "androidx.compose.material.BottomNavigation (BottomNavigation.kt:107)");
    L98:
        Composer $composer3 = $composer2;
        SurfaceKt.m1782SurfaceFjzlyU(modifier3, null, backgroundColor3, contentColor3, null, elevation2, ComposableLambdaKt.rememberComposableLambda(-352628062, true, new BottomNavigationKt$BottomNavigation$1(windowInsets, r31), $composer2, 54), $composer3, ((((($dirty >> 3) & 14) | 1572864) | ($dirty & 896)) | ($dirty & 7168)) | (458752 & ($dirty << 3)), 18);
        if (ComposerKt.isTraceInProgress() == false) goto L101;
        ComposerKt.traceEventEnd();
    L101:
        final Modifier modifier4 = modifier3;
        final long backgroundColor4 = backgroundColor3;
        final long contentColor4 = contentColor3;
        final float elevation3 = elevation2;
    L103:
        ScopeUpdateScope r15 = $composer3.endRestartGroup();
        if (r15 == null) goto L107;
        r15.updateScope(new BottomNavigationKt$BottomNavigation$2(windowInsets, modifier4, backgroundColor4, contentColor4, elevation3, r31, $changed, r34));
        return;
    L107:
        return;
    L94:
        contentColor3 = contentColor2;
        elevation2 = r13;
        modifier3 = modifier2;
        backgroundColor3 = backgroundColor2;
        goto L95
    L75:
        if ($composer2.getDefaultsInvalid() == true) goto L84;
        $composer2.skipToGroupEnd();
        if ((r34 & 4) == 0) goto L81;
        $dirty = $dirty & (-897);
    L81:
        if ((r34 & 8) == 0) goto L83;
        $dirty = $dirty & (-7169);
    L83:
        contentColor3 = contentColor2;
        elevation2 = r13;
        modifier3 = modifier2;
        backgroundColor3 = backgroundColor2;
        goto L95
    L102:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier4 = modifier2;
        backgroundColor4 = backgroundColor2;
        contentColor4 = contentColor2;
        elevation3 = r13;
        goto L103
    L69:
        r14 = false;
        goto L71
    L60:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        if ($composer2.changedInstance(r31) == false) goto L64;
        int r16 = 131072;
    L65:
        $dirty = $dirty | r16;
        goto L67
    L64:
        r16 = 65536;
        goto L65
    L49:
        if (($changed & 24576) != 0) goto L55;
        r13 = elevation;
        if ($composer2.changed(r13) == false) goto L53;
        int r17 = 16384;
    L54:
        $dirty = $dirty | r17;
        goto L57
    L53:
        r17 = 8192;
        goto L54
    L55:
        r13 = elevation;
        goto L57
    L37:
        if ((r34 & 8) != 0) goto L41;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L42;
        int r18 = 2048;
    L43:
        $dirty = $dirty | r18;
    L42:
        r18 = 1024;
        goto L43
    L41:
        contentColor2 = contentColor;
        goto L42
    L26:
        if ((r34 & 4) != 0) goto L30;
        backgroundColor2 = backgroundColor;
        if ($composer2.changed(backgroundColor2) == false) goto L31;
        int r10 = 256;
    L32:
        $dirty = $dirty | r10;
    L31:
        r10 = 128;
        goto L32
    L30:
        backgroundColor2 = backgroundColor;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r6 = 32;
    L21:
        $dirty = $dirty | r6;
        goto L24
    L20:
        r6 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(windowInsets) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L12
    L10:
        r5 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: BottomNavigation-PEIptTM, reason: not valid java name */
    public static final void m1547BottomNavigationPEIptTM(Modifier modifier, long backgroundColor, long contentColor, float elevation, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r28, Composer $composer, final int $changed, final int r31) {
        Composer $composer2 = $composer.startRestartGroup(456489494);
        ComposerKt.sourceInformation($composer2, "C(BottomNavigation)P(4,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.unit.Dp)164@7026L89:BottomNavigation.kt#jmzs0o");
        int $dirty = $changed;
        int r3 = r31 & 1;
        if (r3 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r4 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        long r5 = backgroundColor;
    L25:
        if (($changed & 384) == 0) goto L27;
        long contentColor2 = contentColor;
    L35:
        int r7 = r31 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
        float r11 = elevation;
    L47:
        if ((r31 & 16) == 0) goto L50;
        $dirty = $dirty | 24576;
    L58:
        if (($dirty & 9363) == 9362) goto L60;
        boolean r13 = true;
    L62:
        if ($composer2.shouldExecute(r13, $dirty & 1) == false) goto L95;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "159@6834L6,160@6883L32");
        if (($changed & 1) != 0) goto L66;
    L75:
        if (r3 == 0) goto L77;
        Modifier.Companion modifier2 = Modifier.Companion;
    L79:
        if ((r31 & 2) == 0) goto L81;
        long backgroundColor2 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors($composer2, 6));
        $dirty = $dirty & (-113);
    L83:
        if ((r31 & 4) == 0) goto L85;
        contentColor2 = ColorsKt.m1616contentColorForek8zF_U(backgroundColor2, $composer2, ($dirty >> 3) & 14);
        $dirty = $dirty & (-897);
    L85:
        if (r7 == 0) goto L87;
        Modifier modifier3 = modifier2;
        long contentColor3 = contentColor2;
        long backgroundColor3 = backgroundColor2;
        float elevation2 = BottomNavigationDefaults.INSTANCE.m1546getElevationD9Ej5fM();
    L88:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L91;
        ComposerKt.traceEventStart(456489494, $dirty, -1, "androidx.compose.material.BottomNavigation (BottomNavigation.kt:163)");
    L91:
        Composer $composer3 = $composer2;
        m1548BottomNavigation_UMDTes(ZeroInsets, modifier3, backgroundColor3, contentColor3, elevation2, r28, $composer3, (((((($dirty << 3) & 112) | 6) | (($dirty << 3) & 896)) | (($dirty << 3) & 7168)) | (($dirty << 3) & 57344)) | (458752 & ($dirty << 3)), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L94;
        ComposerKt.traceEventEnd();
    L94:
        final Modifier modifier4 = modifier3;
        final long contentColor4 = contentColor3;
        final float elevation3 = elevation2;
        final long backgroundColor4 = backgroundColor3;
    L96:
        ScopeUpdateScope r12 = $composer3.endRestartGroup();
        if (r12 == null) goto L100;
        r12.updateScope(new BottomNavigationKt$BottomNavigation$3(modifier4, backgroundColor4, contentColor4, elevation3, r28, $changed, r31));
        return;
    L100:
        return;
    L87:
        modifier3 = modifier2;
        contentColor3 = contentColor2;
        elevation2 = r11;
        backgroundColor3 = backgroundColor2;
        goto L88
    L81:
        backgroundColor2 = r5;
        goto L83
    L77:
        modifier2 = r4;
        goto L79
    L66:
        if ($composer2.getDefaultsInvalid() == true) goto L75;
        $composer2.skipToGroupEnd();
        if ((r31 & 2) == 0) goto L72;
        $dirty = $dirty & (-113);
    L72:
        if ((r31 & 4) == 0) goto L74;
        $dirty = $dirty & (-897);
    L74:
        elevation2 = r11;
        backgroundColor3 = r5;
        contentColor3 = contentColor2;
        modifier3 = r4;
        goto L88
    L95:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier4 = r4;
        backgroundColor4 = r5;
        contentColor4 = contentColor2;
        elevation3 = r11;
        goto L96
    L60:
        r13 = false;
        goto L62
    L50:
        if (($changed & 24576) != 0) goto L58;
        if ($composer2.changedInstance(r28) == false) goto L54;
        int r14 = 16384;
    L55:
        $dirty = $dirty | r14;
        goto L58
    L54:
        r14 = 8192;
        goto L55
    L39:
        if (($changed & 3072) != 0) goto L45;
        r11 = elevation;
        if ($composer2.changed(r11) == false) goto L43;
        int r15 = 2048;
    L44:
        $dirty = $dirty | r15;
        goto L47
    L43:
        r15 = 1024;
        goto L44
    L45:
        r11 = elevation;
        goto L47
    L27:
        if ((r31 & 4) != 0) goto L31;
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
        if ((r31 & 2) != 0) goto L20;
        r5 = backgroundColor;
        if ($composer2.changed(r5) == false) goto L21;
        int r9 = 32;
    L22:
        $dirty = $dirty | r9;
    L21:
        r9 = 16;
        goto L22
    L20:
        r5 = backgroundColor;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L10;
        int r6 = 4;
    L11:
        $dirty = $dirty | r6;
        goto L14
    L10:
        r6 = 2;
        goto L11
    L12:
        r4 = modifier;
        goto L14
    }

    /* JADX INFO: renamed from: BottomNavigationItem-jY6E1Zs, reason: not valid java name */
    public static final void m1549BottomNavigationItemjY6E1Zs(final RowScope $this$BottomNavigationItem_u2djY6E1Zs, final boolean selected, final Function0<Unit> r40, final Function2<? super Composer, ? super Integer, Unit> r41, Modifier modifier, boolean enabled, Function2<? super Composer, ? super Integer, Unit> r44, boolean alwaysShowLabel, MutableInteractionSource interactionSource, long selectedContentColor, long unselectedContentColor, Composer $composer, final int $changed, final int $changed1, final int r54) {
        Composer $composer2 = $composer.startRestartGroup(-1473735525);
        ComposerKt.sourceInformation($composer2, "C(BottomNavigationItem)P(7,6,2,5,1,4!2,8:c#ui.graphics.Color,9:c#ui.graphics.Color)224@10152L770:BottomNavigation.kt#jmzs0o");
        int $dirty = $changed;
        if ((Integer.MIN_VALUE & r54) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r54 & 1) == 0) goto L17;
        $dirty = $dirty | 48;
        boolean r9 = selected;
    L25:
        if ((r54 & 2) == 0) goto L28;
        $dirty = $dirty | 384;
        Function0<Unit> r10 = r40;
    L36:
        if ((r54 & 4) == 0) goto L39;
        $dirty = $dirty | 3072;
    L45:
        int r11 = r54 & 8;
        if (r11 == 0) goto L49;
        $dirty = $dirty | 24576;
        Modifier r12 = modifier;
    L56:
        int r13 = r54 & 16;
        if (r13 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        boolean enabled2 = enabled;
    L67:
        int r16 = r54 & 32;
        if (r16 == 0) goto L71;
        $dirty = $dirty | 1572864;
        final Function2<? super Composer, ? super Integer, Unit> r7 = r44;
    L78:
        int r17 = r54 & 64;
        if (r17 == 0) goto L82;
        $dirty = $dirty | 12582912;
    L89:
        int r8 = r54 & 128;
        if (r8 == 0) goto L93;
        $dirty = $dirty | 100663296;
    L101:
        if (($changed & 805306368) == 0) goto L103;
        int $dirty1 = $changed1;
    L112:
        if (($changed1 & 6) != 0) goto L122;
        int $dirty2 = $dirty1;
        int $dirty3 = r54 & 512;
        if ($dirty3 != 0) goto L119;
        if ($composer2.changed(unselectedContentColor) == false) goto L119;
        int r1 = 4;
    L120:
        $dirty1 = $dirty2 | r1;
    L119:
        r1 = 2;
    L122:
        int $dirty4 = $dirty1;
        int $dirty5 = $dirty & 306783379;
        int $dirty6 = $dirty;
        if ($dirty5 == 306783378) goto L125;
    L128:
        boolean r2 = true;
    L130:
        if ($composer2.shouldExecute(r2, $dirty6 & 1) == false) goto L191;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "209@9470L7,210@9562L6");
        if (($changed & 1) != 0) goto L134;
    L144:
        if (r11 == 0) goto L146;
        Modifier.Companion modifier2 = Modifier.Companion;
    L147:
        if (r13 == 0) goto L149;
        enabled2 = true;
    L149:
        if (r16 == 0) goto L151;
        r7 = null;
    L151:
        if (r17 == 0) goto L153;
        final boolean alwaysShowLabel2 = true;
    L154:
        if (r8 == 0) goto L156;
        MutableInteractionSource interactionSource2 = null;
    L158:
        if ((r54 & 256) == 0) goto L160;
        ProvidableCompositionLocal<Color> r14 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r5 = $composer2.consume(r14);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        long selectedContentColor2 = ((Color) r5).m4376unboximpl();
        $dirty6 = $dirty6 & (-1879048193);
    L162:
        if ((r54 & 512) == 0) goto L164;
        long unselectedContentColor2 = Color.m4365copywmQWz5c$default(selectedContentColor2, ContentAlpha.INSTANCE.getMedium($composer2, 6), 0.0f, 0.0f, 0.0f, 14, null);
        int $dirty7 = $dirty4 & (-15);
        int $dirty8 = $dirty6;
    L165:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L169;
        ComposerKt.traceEventStart(-1473735525, $dirty8, $dirty7, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:211)");
    L169:
        if (r7 != null) goto L171;
        $composer2.startReplaceGroup(399132217);
        $composer2.endReplaceGroup();
        final Function2 styledLabel = null;
    L172:
        IndicationNodeFactory ripple = RippleKt.m1746rippleH2RKhps$default(false, 0.0f, selectedContentColor2, 2, null);
        Modifier modifier3 = modifier2;
        boolean r43 = r9;
        Modifier modifier$iv = RowScope.weight$default($this$BottomNavigationItem_u2djY6E1Zs, SelectableKt.m986selectableO2vRcR0(modifier3, r43, interactionSource2, ripple, enabled2, Role.m6174boximpl(Role.Companion.m6188getTabo7Vup1c()), r10), 1.0f, false, 2, null);
        Alignment contentAlignment$iv = Alignment.Companion.getCenter();
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = (48 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r25 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        Function2<? super Composer, ? super Integer, Unit> r29 = r7;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L175;
        ComposablesKt.invalidApplier();
    L175:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L178;
        Function0<ComposeUiNode> r3 = r25;
        $composer2.createNode(r3);
    L179:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Composer $composer3 = $composer2;
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L186;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L186;
    L187:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r6 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r15 = BoxScopeInstance.INSTANCE;
        int r18 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, 240020073, "C237@10612L304,237@10529L387:BottomNavigation.kt#jmzs0o");
        long unselectedContentColor3 = unselectedContentColor2;
        m1550BottomNavigationTransitionKlgxPg(selectedContentColor2, unselectedContentColor3, selected, ComposableLambdaKt.rememberComposableLambda(-1411872801, true, new BottomNavigationKt$BottomNavigationItem$1$1(alwaysShowLabel2, r41, styledLabel), $composer3, 54), $composer3, (((($dirty8 >> 27) & 14) | 3072) | (($dirty7 << 3) & 112)) | (($dirty8 << 3) & 896));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L190;
        ComposerKt.traceEventEnd();
    L190:
        final MutableInteractionSource interactionSource3 = interactionSource2;
        final boolean alwaysShowLabel3 = alwaysShowLabel2;
        final Modifier modifier4 = modifier3;
        final long selectedContentColor3 = selectedContentColor2;
        r7 = r29;
        final long unselectedContentColor4 = unselectedContentColor3;
        final boolean enabled3 = enabled2;
    L192:
        ScopeUpdateScope r0 = $composer3.endRestartGroup();
        if (r0 == null) goto L196;
        r0.updateScope(new BottomNavigationKt$BottomNavigationItem$2($this$BottomNavigationItem_u2djY6E1Zs, selected, r40, r41, modifier4, enabled3, r7, alwaysShowLabel3, interactionSource3, selectedContentColor3, unselectedContentColor4, $changed, $changed1, r54));
        return;
    L196:
        return;
    L186:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r4);
        goto L187
    L178:
        r3 = r25;
        $composer2.useNode();
        goto L179
    L171:
        $composer2.startReplaceGroup(399132218);
        ComposerKt.sourceInformation($composer2, "*214@9668L168");
        styledLabel = ComposableLambdaKt.rememberComposableLambda(1343298261, true, new BottomNavigationKt$BottomNavigationItem$styledLabel$1$1(r7), $composer2, 54);
        $composer2.endReplaceGroup();
        goto L172
    L164:
        unselectedContentColor2 = unselectedContentColor;
        $dirty7 = $dirty4;
        $dirty8 = $dirty6;
        goto L165
    L160:
        selectedContentColor2 = selectedContentColor;
        goto L162
    L156:
        interactionSource2 = interactionSource;
        goto L158
    L153:
        alwaysShowLabel2 = alwaysShowLabel;
        goto L154
    L146:
        modifier2 = r12;
        goto L147
    L134:
        if ($composer2.getDefaultsInvalid() == true) goto L144;
        $composer2.skipToGroupEnd();
        if ((r54 & 256) == 0) goto L139;
        int $dirty9 = $dirty6 & (-1879048193);
    L141:
        if ((r54 & 512) == 0) goto L143;
        alwaysShowLabel2 = alwaysShowLabel;
        selectedContentColor2 = selectedContentColor;
        unselectedContentColor2 = unselectedContentColor;
        $dirty8 = $dirty9;
        modifier2 = r12;
        $dirty7 = $dirty4 & (-15);
        interactionSource2 = interactionSource;
        goto L165
    L143:
        alwaysShowLabel2 = alwaysShowLabel;
        interactionSource2 = interactionSource;
        selectedContentColor2 = selectedContentColor;
        unselectedContentColor2 = unselectedContentColor;
        $dirty8 = $dirty9;
        modifier2 = r12;
        $dirty7 = $dirty4;
        goto L165
    L139:
        $dirty9 = $dirty6;
        goto L141
    L191:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        alwaysShowLabel3 = alwaysShowLabel;
        interactionSource3 = interactionSource;
        selectedContentColor3 = selectedContentColor;
        modifier4 = r12;
        unselectedContentColor4 = unselectedContentColor;
        enabled3 = enabled2;
        goto L192
    L125:
        if (($dirty4 & 3) != 2) goto L128;
        r2 = false;
        goto L130
    L103:
        if ((r54 & 256) != 0) goto L107;
        $dirty1 = $changed1;
        if ($composer2.changed(selectedContentColor) == false) goto L108;
        int r20 = 536870912;
    L109:
        $dirty = $dirty | r20;
    L108:
        r20 = 268435456;
        goto L109
    L107:
        $dirty1 = $changed1;
        goto L108
    L93:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changed(interactionSource) == false) goto L97;
        int r21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty = $dirty | r21;
        goto L101
    L97:
        r21 = 33554432;
        goto L98
    L82:
        if (($changed & 12582912) != 0) goto L89;
        if ($composer2.changed(alwaysShowLabel) == false) goto L86;
        int r19 = 8388608;
    L87:
        $dirty = $dirty | r19;
        goto L89
    L86:
        r19 = 4194304;
        goto L87
    L71:
        if (($changed & 1572864) != 0) goto L77;
        r7 = r44;
        if ($composer2.changedInstance(r7) == false) goto L75;
        int r110 = 1048576;
    L76:
        $dirty = $dirty | r110;
        goto L78
    L75:
        r110 = 524288;
        goto L76
    L77:
        r7 = r44;
        goto L78
    L60:
        if ((196608 & $changed) != 0) goto L66;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L64;
        int r111 = 131072;
    L65:
        $dirty = $dirty | r111;
        goto L67
    L64:
        r111 = 65536;
        goto L65
    L66:
        enabled2 = enabled;
        goto L67
    L49:
        if (($changed & 24576) != 0) goto L55;
        r12 = modifier;
        if ($composer2.changed(r12) == false) goto L53;
        int r112 = 16384;
    L54:
        $dirty = $dirty | r112;
        goto L56
    L53:
        r112 = 8192;
        goto L54
    L55:
        r12 = modifier;
        goto L56
    L39:
        if (($changed & 3072) != 0) goto L45;
        if ($composer2.changedInstance(r41) == false) goto L43;
        int r113 = 2048;
    L44:
        $dirty = $dirty | r113;
        goto L45
    L43:
        r113 = 1024;
        goto L44
    L28:
        if (($changed & 384) != 0) goto L34;
        r10 = r40;
        if ($composer2.changedInstance(r10) == false) goto L32;
        int r114 = 256;
    L33:
        $dirty = $dirty | r114;
        goto L36
    L32:
        r114 = 128;
        goto L33
    L34:
        r10 = r40;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        r9 = selected;
        if ($composer2.changed(r9) == false) goto L21;
        int r115 = 32;
    L22:
        $dirty = $dirty | r115;
        goto L25
    L21:
        r115 = 16;
        goto L22
    L23:
        r9 = selected;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changed($this$BottomNavigationItem_u2djY6E1Zs) == false) goto L10;
        int r22 = 4;
    L11:
        $dirty = $dirty | r22;
        goto L14
    L10:
        r22 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: BottomNavigationTransition-Klgx-Pg, reason: not valid java name */
    private static final void m1550BottomNavigationTransitionKlgxPg(final long activeColor, final long inactiveColor, final boolean selected, final Function3<? super Float, ? super Composer, ? super Integer, Unit> r33, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-985175058);
        ComposerKt.sourceInformation($composer2, "C(BottomNavigationTransition)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color,3)284@12335L140,294@12689L42,291@12550L181:BottomNavigation.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(activeColor) == false) goto L7;
        int r9 = 4;
    L8:
        $dirty = $dirty | r9;
        goto L10
    L7:
        r9 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(inactiveColor) == false) goto L14;
        int r10 = 32;
    L15:
        $dirty = $dirty | r10;
        goto L17
    L14:
        r10 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changed(selected) == false) goto L21;
        int r11 = 256;
    L22:
        $dirty = $dirty | r11;
        goto L24
    L21:
        r11 = 128;
    L24:
        if (($changed & 3072) != 0) goto L31;
        if ($composer2.changedInstance(r33) == false) goto L28;
        int r12 = 2048;
    L29:
        $dirty = $dirty | r12;
        goto L31
    L28:
        r12 = 1024;
    L31:
        if (($dirty & 1171) == 1170) goto L33;
        boolean r13 = true;
    L35:
        if ($composer2.shouldExecute(r13, $dirty & 1) == true) goto L37;
        $composer2.skipToGroupEnd();
    L46:
        ScopeUpdateScope r8 = $composer2.endRestartGroup();
        if (r8 == null) goto L50;
        r8.updateScope(new BottomNavigationKt$BottomNavigationTransition$2(activeColor, inactiveColor, selected, r33, $changed));
        return;
    L50:
        return;
    L37:
        if (ComposerKt.isTraceInProgress() == false) goto L39;
        ComposerKt.traceEventStart(-985175058, $dirty, -1, "androidx.compose.material.BottomNavigationTransition (BottomNavigation.kt:282)");
    L39:
        if (selected == false) goto L41;
        int $dirty2 = 1065353216;
    L42:
        final State<Float> r14 = AnimateAsStateKt.animateFloatAsState($dirty2, BottomNavigationAnimationSpec, 0.0f, null, null, $composer2, 48, 28);
        long color = ColorKt.m4417lerpjxsXWHM(inactiveColor, activeColor, BottomNavigationTransition_Klgx_Pg$lambda$2(r14));
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4356boximpl(Color.m4365copywmQWz5c$default(color, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m4368getAlphaimpl(color)))}, ComposableLambdaKt.rememberComposableLambda(-138092754, true, new BottomNavigationKt$BottomNavigationTransition$1(r33, r14), $composer2, 54), $composer2, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress() == false) goto L46;
        ComposerKt.traceEventEnd();
        goto L46
    L41:
        $dirty2 = 0;
        goto L42
    L33:
        r13 = false;
        goto L35
    }

    private static final float BottomNavigationTransition_Klgx_Pg$lambda$2(State<Float> r4) {
        return r4.getValue().floatValue();
    }

    private static final void BottomNavigationItemBaselineLayout(final Function2<? super Composer, ? super Integer, Unit> r51, final Function2<? super Composer, ? super Integer, Unit> r52, final float iconPositionAnimationProgress, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1162995092);
        ComposerKt.sourceInformation($composer2, "C(BottomNavigationItemBaselineLayout)P(!1,2)326@13760L927,315@13402L1285:BottomNavigation.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r51) == false) goto L7;
        int r7 = 4;
    L8:
        $dirty = $dirty | r7;
        goto L10
    L7:
        r7 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r52) == false) goto L14;
        int r8 = 32;
    L15:
        $dirty = $dirty | r8;
        goto L17
    L14:
        r8 = 16;
    L17:
        if (($changed & 384) == 0) goto L19;
    L23:
        boolean r12 = true;
        if (($dirty & 147) == 146) goto L26;
        boolean r9 = true;
    L28:
        if ($composer2.shouldExecute(r9, $dirty & 1) == true) goto L30;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L100:
        ScopeUpdateScope r4 = $composer3.endRestartGroup();
        if (r4 == null) goto L104;
        r4.updateScope(new AnonymousClass3(r51, r52, iconPositionAnimationProgress, $changed));
        return;
    L104:
        return;
    L30:
        if (ComposerKt.isTraceInProgress() == false) goto L32;
        ComposerKt.traceEventStart(-1162995092, $dirty, -1, "androidx.compose.material.BottomNavigationItemBaselineLayout (BottomNavigation.kt:314)");
    L32:
        ComposerKt.sourceInformationMarkerStart($composer2, 1507125510, "CC(remember):BottomNavigation.kt#9igjgp");
        if (($dirty & 112) != 32) goto L35;
        boolean r5 = true;
    L37:
        if (($dirty & 896) == 256) goto L40;
        r12 = false;
    L40:
        boolean invalid$iv = r5 | r12;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L43;
    L46:
        Object value$iv = (MeasurePolicy) new BottomNavigationKt$BottomNavigationItemBaselineLayout$2$1(r52, iconPositionAnimationProgress);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L47:
        MeasurePolicy measurePolicy$iv = (MeasurePolicy) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        Modifier modifier$iv = Modifier.Companion;
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r16 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = ((0 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L50;
        ComposablesKt.invalidApplier();
    L50:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L53;
        Function0<ComposeUiNode> r10 = r16;
        $composer2.createNode(r10);
    L54:
        $composer3 = $composer2;
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer3);
        int $dirty2 = $dirty;
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r6 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L61;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == false) goto L61;
    L62:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        int r11 = ($changed$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -1180084528, "C316@13419L41:BottomNavigation.kt#jmzs0o");
        Modifier modifier$iv2 = LayoutIdKt.layoutId(Modifier.Companion, "icon");
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer3, modifier$iv2);
        Function0<ComposeUiNode> r37 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L65;
        ComposablesKt.invalidApplier();
    L65:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L68;
        Function0<ComposeUiNode> r13 = r37;
        $composer3.createNode(r13);
    L69:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r14 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L76;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L76;
    L77:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r15 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r42 = BoxScopeInstance.INSTANCE;
        int r44 = ((6 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, 2094904824, "C316@13452L6:BottomNavigation.kt#jmzs0o");
        r51.invoke($composer3, Integer.valueOf($dirty2 & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (r52 == null) goto L95;
        $composer3.startReplaceGroup(-1180018220);
        ComposerKt.sourceInformation($composer3, "318@13502L240");
        Modifier modifier$iv3 = PaddingKt.m727paddingVpY3zN4$default(AlphaKt.alpha(LayoutIdKt.layoutId(Modifier.Companion, "label"), iconPositionAnimationProgress), BottomNavigationItemHorizontalPadding, 0.0f, 2, null);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv2 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
        int $changed$iv$iv3 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer3, modifier$iv3);
        Function0<ComposeUiNode> r19 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv3 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L82;
        ComposablesKt.invalidApplier();
    L82:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L85;
        Function0<ComposeUiNode> r17 = r19;
        $composer3.createNode(r17);
    L86:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r18 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L92;
        int $changed$iv = 0;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == true) goto L94;
    L93:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r18);
    L94:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r20 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r21 = BoxScopeInstance.INSTANCE;
        int r110 = (($changed$iv >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, 2095171703, "C323@13721L7:BottomNavigation.kt#jmzs0o");
        r52.invoke($composer3, Integer.valueOf(($dirty2 >> 3) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endReplaceGroup();
    L96:
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L100;
        ComposerKt.traceEventEnd();
        goto L100
    L92:
        $changed$iv = 0;
        goto L93
    L85:
        r17 = r19;
        $composer3.useNode();
        goto L86
    L95:
        $composer3.startReplaceGroup(-1179764516);
        $composer3.endReplaceGroup();
    L76:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r14);
        goto L77
    L68:
        r13 = r37;
        $composer3.useNode();
    L61:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r6);
        goto L62
    L53:
        r10 = r16;
        $composer2.useNode();
        goto L54
    L43:
        if (it$iv != Composer.Companion.getEmpty()) goto L47;
    L35:
        r5 = false;
        goto L37
    L26:
        r9 = false;
        goto L28
    L19:
        if ($composer2.changed(iconPositionAnimationProgress) == false) goto L21;
        int r22 = 256;
    L22:
        $dirty = $dirty | r22;
        goto L23
    L21:
        r22 = 128;
        goto L22
    }

    /* JADX INFO: renamed from: placeIcon-3p2s80s, reason: not valid java name */
    private static final MeasureResult m1554placeIcon3p2s80s(MeasureScope $this$placeIcon_u2d3p2s80s, final Placeable iconPlaceable, long constraints) {
        int height = ConstraintsKt.m6942constrainHeightK40F9xA(constraints, $this$placeIcon_u2d3p2s80s.mo370roundToPx0680j_4(BottomNavigationHeight));
        final int iconY = (height - iconPlaceable.getHeight()) / 2;
        return MeasureScope.layout$default($this$placeIcon_u2d3p2s80s, iconPlaceable.getWidth(), height, null, new BottomNavigationKt$placeIcon$1(iconPlaceable, iconY), 4, null);
    }

    /* JADX INFO: renamed from: placeLabelAndIcon-DIyivk0, reason: not valid java name */
    private static final MeasureResult m1555placeLabelAndIconDIyivk0(MeasureScope $this$placeLabelAndIcon_u2dDIyivk0, final Placeable labelPlaceable, final Placeable iconPlaceable, long constraints, final float iconPositionAnimationProgress) {
        int firstBaseline = labelPlaceable.get(AlignmentLineKt.getFirstBaseline());
        int baselineOffset = $this$placeLabelAndIcon_u2dDIyivk0.mo370roundToPx0680j_4(CombinedItemTextBaseline);
        int netBaselineAdjustment = baselineOffset - firstBaseline;
        int contentHeight = (iconPlaceable.getHeight() + labelPlaceable.getHeight()) + netBaselineAdjustment;
        int height = ConstraintsKt.m6942constrainHeightK40F9xA(constraints, Math.max(contentHeight, $this$placeLabelAndIcon_u2dDIyivk0.mo370roundToPx0680j_4(BottomNavigationHeight)));
        final int contentVerticalPadding = RangesKt.coerceAtLeast((height - contentHeight) / 2, 0);
        int unselectedIconY = (height - iconPlaceable.getHeight()) / 2;
        final int labelY = (iconPlaceable.getHeight() + contentVerticalPadding) + netBaselineAdjustment;
        int containerWidth = Math.max(labelPlaceable.getWidth(), iconPlaceable.getWidth());
        final int labelX = (containerWidth - labelPlaceable.getWidth()) / 2;
        final int iconX = (containerWidth - iconPlaceable.getWidth()) / 2;
        int iconDistance = unselectedIconY - contentVerticalPadding;
        final int offset = MathKt.roundToInt(iconDistance * (1.0f - iconPositionAnimationProgress));
        return MeasureScope.layout$default($this$placeLabelAndIcon_u2dDIyivk0, containerWidth, height, null, new BottomNavigationKt$placeLabelAndIcon$1(iconPositionAnimationProgress, labelPlaceable, labelX, labelY, offset, iconPlaceable, iconX, contentVerticalPadding), 4, null);
    }

    static {
        BottomNavigationAnimationSpec = new TweenSpec(AnimationConstants.DefaultDurationMillis, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
        BottomNavigationHeight = Dp.m6973constructorimpl(56);
        BottomNavigationItemHorizontalPadding = Dp.m6973constructorimpl(12);
        CombinedItemTextBaseline = Dp.m6973constructorimpl(12);
        ZeroInsets = WindowInsetsKt.m796WindowInsetsa9UjIt4(Dp.m6973constructorimpl(0), Dp.m6973constructorimpl(0), Dp.m6973constructorimpl(0), Dp.m6973constructorimpl(0));
    }
}
