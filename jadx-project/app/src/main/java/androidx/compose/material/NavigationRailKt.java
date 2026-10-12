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
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.unit.Constraints;
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

/* JADX INFO: compiled from: NavigationRail.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0082\u0001\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00012 \b\u0002\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001a2\u001c\u0010\u001b\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001az\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00012 \b\u0002\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001a2\u001c\u0010\u001b\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0090\u0001\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0$2\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\u000e0$¢\u0006\u0002\b\u00192\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010&\u001a\u00020\"2\u0015\b\u0002\u0010'\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010$¢\u0006\u0002\b\u00192\b\b\u0002\u0010(\u001a\u00020\"2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010+\u001a\u00020\u00132\b\b\u0002\u0010,\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a?\u0010/\u001a\u00020\u000e2\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\u000e0$¢\u0006\u0002\b\u00192\u0013\u0010'\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010$¢\u0006\u0002\b\u00192\b\b\u0001\u00100\u001a\u00020\u0007H\u0003¢\u0006\u0002\u00101\u001aR\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u00132\u0006\u00104\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"2&\u0010\u001b\u001a\"\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020\u000e0\u0017¢\u0006\u0002\b\u0019H\u0003ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a&\u0010:\u001a\u00020;*\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0002ø\u0001\u0000¢\u0006\u0004\bA\u0010B\u001a8\u0010C\u001a\u00020;*\u00020<2\u0006\u0010D\u001a\u00020>2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\b\b\u0001\u00100\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010F\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006G²\u0006\n\u00107\u001a\u00020\u0007X\u008a\u0084\u0002"}, d2 = {"HeaderPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ItemIconTopOffset", "ItemLabelBaselineBottomOffset", "NavigationRailAnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "NavigationRailItemCompactSize", "NavigationRailItemSize", "NavigationRailPadding", "ZeroInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "NavigationRail", "", "windowInsets", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "header", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "NavigationRail-afqeVBk", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationRail-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationRailItem", "selected", "", "onClick", "Lkotlin/Function0;", "icon", "enabled", "label", "alwaysShowLabel", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "selectedContentColor", "unselectedContentColor", "NavigationRailItem-0S3VyRs", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "NavigationRailItemBaselineLayout", "iconPositionAnimationProgress", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLandroidx/compose/runtime/Composer;I)V", "NavigationRailTransition", "activeColor", "inactiveColor", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "animationProgress", "NavigationRailTransition-Klgx-Pg", "(JJZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "placeIcon", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "iconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "placeIcon-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "labelPlaceable", "placeLabelAndIcon-DIyivk0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class NavigationRailKt {
    private static final float HeaderPadding = 0.0f;
    private static final float ItemIconTopOffset = 0.0f;
    private static final float ItemLabelBaselineBottomOffset = 0.0f;
    private static final TweenSpec<Float> NavigationRailAnimationSpec = null;
    private static final float NavigationRailItemCompactSize = 0.0f;
    private static final float NavigationRailItemSize = 0.0f;
    private static final float NavigationRailPadding = 0.0f;
    private static final WindowInsets ZeroInsets = null;

    public static final /* synthetic */ void access$NavigationRailItemBaselineLayout(Function2 icon, Function2 label, float iconPositionAnimationProgress, Composer $composer, int $changed) {
        NavigationRailItemBaselineLayout(icon, label, iconPositionAnimationProgress, $composer, $changed);
    }

    /* JADX INFO: renamed from: access$NavigationRailTransition-Klgx-Pg, reason: not valid java name */
    public static final /* synthetic */ void m1710access$NavigationRailTransitionKlgxPg(long activeColor, long inactiveColor, boolean selected, Function3 content, Composer $composer, int $changed) {
        m1709NavigationRailTransitionKlgxPg(activeColor, inactiveColor, selected, content, $composer, $changed);
    }

    public static final /* synthetic */ float access$NavigationRailTransition_Klgx_Pg$lambda$2(State $animationProgress$delegate) {
        return NavigationRailTransition_Klgx_Pg$lambda$2($animationProgress$delegate);
    }

    public static final /* synthetic */ float access$getHeaderPadding$p() {
        return HeaderPadding;
    }

    public static final /* synthetic */ float access$getNavigationRailPadding$p() {
        return NavigationRailPadding;
    }

    /* JADX INFO: renamed from: access$placeIcon-3p2s80s, reason: not valid java name */
    public static final /* synthetic */ MeasureResult m1711access$placeIcon3p2s80s(MeasureScope $receiver, Placeable iconPlaceable, long constraints) {
        return m1713placeIcon3p2s80s($receiver, iconPlaceable, constraints);
    }

    /* JADX INFO: renamed from: access$placeLabelAndIcon-DIyivk0, reason: not valid java name */
    public static final /* synthetic */ MeasureResult m1712access$placeLabelAndIconDIyivk0(MeasureScope $receiver, Placeable labelPlaceable, Placeable iconPlaceable, long constraints, float iconPositionAnimationProgress) {
        return m1714placeLabelAndIconDIyivk0($receiver, labelPlaceable, iconPlaceable, constraints, iconPositionAnimationProgress);
    }

    /* JADX INFO: renamed from: NavigationRail-afqeVBk, reason: not valid java name */
    public static final void m1707NavigationRailafqeVBk(final WindowInsets windowInsets, Modifier modifier, long backgroundColor, long contentColor, float elevation, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r32, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r33, Composer $composer, final int $changed, final int r36) {
        Composer $composer2 = $composer.startRestartGroup(-1389243291);
        ComposerKt.sourceInformation($composer2, "C(NavigationRail)P(6,5,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.unit.Dp,4)115@5194L442,110@5050L586:NavigationRail.kt#jmzs0o");
        int $dirty = $changed;
        if ((r36 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r4 = r36 & 2;
        if (r4 == 0) goto L16;
        $dirty = $dirty | 48;
    L24:
        if (($changed & 384) == 0) goto L26;
        long r6 = backgroundColor;
    L35:
        if (($changed & 3072) == 0) goto L37;
        long r11 = contentColor;
    L45:
        int r8 = r36 & 16;
        if (r8 == 0) goto L49;
        $dirty = $dirty | 24576;
        float r13 = elevation;
    L56:
        int r14 = r36 & 32;
        if (r14 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r15 = r32;
    L68:
        if ((r36 & 64) == 0) goto L71;
        $dirty = $dirty | 1572864;
    L78:
        if (($dirty & 599187) == 599186) goto L80;
        boolean r0 = true;
    L82:
        if ($composer2.shouldExecute(r0, $dirty & 1) == false) goto L119;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "104@4806L6,105@4848L32");
        if (($changed & 1) != 0) goto L86;
    L95:
        if (r4 == 0) goto L97;
        Modifier.Companion modifier2 = Modifier.Companion;
    L99:
        if ((r36 & 4) == 0) goto L101;
        long backgroundColor2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1602getSurface0d7_KjU();
        $dirty = $dirty & (-897);
    L103:
        if ((r36 & 8) == 0) goto L105;
        long contentColor2 = ColorsKt.m1616contentColorForek8zF_U(backgroundColor2, $composer2, ($dirty >> 6) & 14);
        $dirty = $dirty & (-7169);
    L106:
        if (r8 == 0) goto L108;
        float elevation2 = NavigationRailDefaults.INSTANCE.m1705getElevationD9Ej5fM();
    L109:
        if (r14 == 0) goto L111;
        Modifier modifier3 = modifier2;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r1 = null;
        long backgroundColor3 = backgroundColor2;
        long contentColor3 = contentColor2;
        float elevation3 = elevation2;
        int r5 = -1389243291;
    L112:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L115;
        ComposerKt.traceEventStart(r5, $dirty, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:109)");
    L115:
        Composer $composer3 = $composer2;
        SurfaceKt.m1782SurfaceFjzlyU(modifier3, null, backgroundColor3, contentColor3, null, elevation3, ComposableLambdaKt.rememberComposableLambda(-245908831, true, new NavigationRailKt$NavigationRail$1(windowInsets, r1, r33), $composer2, 54), $composer3, ((((($dirty >> 3) & 14) | 1572864) | ($dirty & 896)) | ($dirty & 7168)) | (458752 & ($dirty << 3)), 18);
        if (ComposerKt.isTraceInProgress() == false) goto L118;
        ComposerKt.traceEventEnd();
    L118:
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r9 = r1;
        final Modifier modifier4 = modifier3;
        final long backgroundColor4 = backgroundColor3;
        final long contentColor4 = contentColor3;
        final float elevation4 = elevation3;
    L120:
        ScopeUpdateScope r16 = $composer3.endRestartGroup();
        if (r16 == null) goto L124;
        r16.updateScope(new NavigationRailKt$NavigationRail$2(windowInsets, modifier4, backgroundColor4, contentColor4, elevation4, r9, r33, $changed, r36));
        return;
    L124:
        return;
    L111:
        modifier3 = modifier2;
        backgroundColor3 = backgroundColor2;
        elevation3 = elevation2;
        r1 = r15;
        r5 = -1389243291;
        contentColor3 = contentColor2;
        goto L112
    L108:
        elevation2 = r13;
        goto L109
    L105:
        contentColor2 = r11;
        goto L106
    L101:
        backgroundColor2 = r6;
        goto L103
    L97:
        modifier2 = modifier;
        goto L99
    L86:
        if ($composer2.getDefaultsInvalid() == true) goto L95;
        $composer2.skipToGroupEnd();
        if ((r36 & 4) == 0) goto L92;
        $dirty = $dirty & (-897);
    L92:
        if ((r36 & 8) == 0) goto L94;
        $dirty = $dirty & (-7169);
        elevation3 = r13;
        r1 = r15;
        r5 = -1389243291;
        backgroundColor3 = r6;
        contentColor3 = r11;
        modifier3 = modifier;
        goto L112
    L94:
        elevation3 = r13;
        r1 = r15;
        r5 = -1389243291;
        backgroundColor3 = r6;
        contentColor3 = r11;
        modifier3 = modifier;
        goto L112
    L119:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        backgroundColor4 = r6;
        contentColor4 = r11;
        modifier4 = modifier;
        elevation4 = r13;
        r9 = r15;
        goto L120
    L80:
        r0 = false;
        goto L82
    L71:
        if (($changed & 1572864) != 0) goto L78;
        if ($composer2.changedInstance(r33) == false) goto L75;
        int r17 = 1048576;
    L76:
        $dirty = $dirty | r17;
        goto L78
    L75:
        r17 = 524288;
        goto L76
    L60:
        if ((196608 & $changed) != 0) goto L66;
        r15 = r32;
        if ($composer2.changedInstance(r15) == false) goto L64;
        int r18 = 131072;
    L65:
        $dirty = $dirty | r18;
        goto L68
    L64:
        r18 = 65536;
        goto L65
    L66:
        r15 = r32;
        goto L68
    L49:
        if (($changed & 24576) != 0) goto L55;
        r13 = elevation;
        if ($composer2.changed(r13) == false) goto L53;
        int r19 = 16384;
    L54:
        $dirty = $dirty | r19;
        goto L56
    L53:
        r19 = 8192;
        goto L54
    L55:
        r13 = elevation;
        goto L56
    L37:
        if ((r36 & 8) != 0) goto L41;
        r11 = contentColor;
        if ($composer2.changed(r11) == false) goto L42;
        int r10 = 2048;
    L43:
        $dirty = $dirty | r10;
    L42:
        r10 = 1024;
        goto L43
    L41:
        r11 = contentColor;
        goto L42
    L26:
        if ((r36 & 4) != 0) goto L30;
        r6 = backgroundColor;
        if ($composer2.changed(r6) == false) goto L31;
        int r12 = 256;
    L32:
        $dirty = $dirty | r12;
    L31:
        r12 = 128;
        goto L32
    L30:
        r6 = backgroundColor;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changed(modifier) == false) goto L20;
        int r7 = 32;
    L21:
        $dirty = $dirty | r7;
        goto L24
    L20:
        r7 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(windowInsets) == false) goto L10;
        int r20 = 4;
    L11:
        $dirty = $dirty | r20;
        goto L12
    L10:
        r20 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: NavigationRail-HsRjFd4, reason: not valid java name */
    public static final void m1706NavigationRailHsRjFd4(Modifier modifier, long backgroundColor, long contentColor, float elevation, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r28, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r29, Composer $composer, final int $changed, final int r32) {
        Composer $composer2 = $composer.startRestartGroup(1790971523);
        ComposerKt.sourceInformation($composer2, "C(NavigationRail)P(5,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.unit.Dp,4)175@7737L95:NavigationRail.kt#jmzs0o");
        int $dirty = $changed;
        int r3 = r32 & 1;
        if (r3 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r4 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        long backgroundColor2 = backgroundColor;
    L25:
        if (($changed & 384) == 0) goto L27;
        long contentColor2 = contentColor;
    L35:
        int r10 = r32 & 8;
        if (r10 == 0) goto L39;
        $dirty = $dirty | 3072;
        float elevation2 = elevation;
    L46:
        int r12 = r32 & 16;
        if (r12 == 0) goto L50;
        $dirty = $dirty | 24576;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r13 = r28;
    L58:
        if ((r32 & 32) == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L69:
        if ((74899 & $dirty) == 74898) goto L71;
        boolean r0 = true;
    L73:
        if ($composer2.shouldExecute(r0, $dirty & 1) == false) goto L107;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "169@7493L6,170@7535L32");
        if (($changed & 1) != 0) goto L77;
    L86:
        if (r3 == 0) goto L88;
        Modifier.Companion modifier2 = Modifier.Companion;
    L90:
        if ((r32 & 2) == 0) goto L93;
        $dirty = $dirty & (-113);
        backgroundColor2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1602getSurface0d7_KjU();
    L93:
        if ((r32 & 4) == 0) goto L95;
        long contentColor3 = ColorsKt.m1616contentColorForek8zF_U(backgroundColor2, $composer2, ($dirty >> 3) & 14);
        $dirty = $dirty & (-897);
        contentColor2 = contentColor3;
    L95:
        if (r10 == 0) goto L97;
        elevation2 = NavigationRailDefaults.INSTANCE.m1705getElevationD9Ej5fM();
    L97:
        if (r12 == 0) goto L99;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r17 = null;
        long backgroundColor3 = backgroundColor2;
        float elevation3 = elevation2;
        int r5 = 1790971523;
        Modifier modifier3 = modifier2;
        long contentColor4 = contentColor2;
    L100:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L103;
        ComposerKt.traceEventStart(r5, $dirty, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:174)");
    L103:
        Composer $composer3 = $composer2;
        m1707NavigationRailafqeVBk(ZeroInsets, modifier3, backgroundColor3, contentColor4, elevation3, r17, r29, $composer3, (((((6 | (($dirty << 3) & 112)) | (($dirty << 3) & 896)) | (($dirty << 3) & 7168)) | (($dirty << 3) & 57344)) | (($dirty << 3) & 458752)) | (3670016 & ($dirty << 3)), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L106;
        ComposerKt.traceEventEnd();
    L106:
        final Modifier modifier4 = modifier3;
        final long contentColor5 = contentColor4;
        final float elevation4 = elevation3;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r7 = r17;
        final long backgroundColor4 = backgroundColor3;
    L108:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L112;
        r14.updateScope(new NavigationRailKt$NavigationRail$3(modifier4, backgroundColor4, contentColor5, elevation4, r7, r29, $changed, r32));
        return;
    L112:
        return;
    L99:
        elevation3 = elevation2;
        r17 = r13;
        r5 = 1790971523;
        modifier3 = modifier2;
        backgroundColor3 = backgroundColor2;
        contentColor4 = contentColor2;
        goto L100
    L88:
        modifier2 = r4;
        goto L90
    L77:
        if ($composer2.getDefaultsInvalid() == true) goto L86;
        $composer2.skipToGroupEnd();
        if ((r32 & 2) == 0) goto L83;
        $dirty = $dirty & (-113);
    L83:
        if ((r32 & 4) == 0) goto L85;
        $dirty = $dirty & (-897);
        elevation3 = elevation2;
        r17 = r13;
        r5 = 1790971523;
        modifier3 = r4;
        backgroundColor3 = backgroundColor2;
        contentColor4 = contentColor2;
        goto L100
    L85:
        elevation3 = elevation2;
        r17 = r13;
        r5 = 1790971523;
        modifier3 = r4;
        backgroundColor3 = backgroundColor2;
        contentColor4 = contentColor2;
        goto L100
    L107:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        backgroundColor4 = backgroundColor2;
        elevation4 = elevation2;
        modifier4 = r4;
        contentColor5 = contentColor2;
        r7 = r13;
        goto L108
    L71:
        r0 = false;
        goto L73
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L69;
        if ($composer2.changedInstance(r29) == false) goto L65;
        int r15 = 131072;
    L66:
        $dirty = $dirty | r15;
        goto L69
    L65:
        r15 = 65536;
        goto L66
    L50:
        if (($changed & 24576) != 0) goto L56;
        r13 = r28;
        if ($composer2.changedInstance(r13) == false) goto L54;
        int r16 = 16384;
    L55:
        $dirty = $dirty | r16;
        goto L58
    L54:
        r16 = 8192;
        goto L55
    L56:
        r13 = r28;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        elevation2 = elevation;
        if ($composer2.changed(elevation2) == false) goto L43;
        int r18 = 2048;
    L44:
        $dirty = $dirty | r18;
        goto L46
    L43:
        r18 = 1024;
        goto L44
    L45:
        elevation2 = elevation;
        goto L46
    L27:
        if ((r32 & 4) != 0) goto L31;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L32;
        int r11 = 256;
    L33:
        $dirty = $dirty | r11;
    L32:
        r11 = 128;
        goto L33
    L31:
        contentColor2 = contentColor;
        goto L32
    L16:
        if ((r32 & 2) != 0) goto L20;
        backgroundColor2 = backgroundColor;
        if ($composer2.changed(backgroundColor2) == false) goto L21;
        int r8 = 32;
    L22:
        $dirty = $dirty | r8;
    L21:
        r8 = 16;
        goto L22
    L20:
        backgroundColor2 = backgroundColor;
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

    /* JADX INFO: renamed from: NavigationRailItem-0S3VyRs, reason: not valid java name */
    public static final void m1708NavigationRailItem0S3VyRs(final boolean selected, final Function0<Unit> r40, final Function2<? super Composer, ? super Integer, Unit> r41, Modifier modifier, boolean enabled, Function2<? super Composer, ? super Integer, Unit> r44, boolean alwaysShowLabel, MutableInteractionSource interactionSource, long selectedContentColor, long unselectedContentColor, Composer $composer, final int $changed, final int r53) {
        Composer $composer2 = $composer.startRestartGroup(-1813548445);
        ComposerKt.sourceInformation($composer2, "C(NavigationRailItem)P(7,6,2,5,1,4!2,8:c#ui.graphics.Color,9:c#ui.graphics.Color)230@10652L770:NavigationRail.kt#jmzs0o");
        int $dirty = $changed;
        if ((r53 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r53 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function0<Unit> r4 = r40;
    L25:
        if ((r53 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
    L34:
        int r5 = r53 & 8;
        if (r5 == 0) goto L38;
        $dirty = $dirty | 3072;
        Modifier modifier2 = modifier;
    L45:
        int r7 = r53 & 16;
        if (r7 == 0) goto L49;
        $dirty = $dirty | 24576;
        boolean enabled2 = enabled;
    L56:
        int r9 = r53 & 32;
        if (r9 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        final Function2<? super Composer, ? super Integer, Unit> r10 = r44;
    L67:
        int r11 = r53 & 64;
        if (r11 == 0) goto L71;
        $dirty = $dirty | 1572864;
        final boolean alwaysShowLabel2 = alwaysShowLabel;
    L78:
        int r0 = r53 & 128;
        if (r0 == 0) goto L82;
        $dirty = $dirty | 12582912;
    L90:
        if (($changed & 100663296) == 0) goto L92;
        int $dirty2 = $dirty;
    L101:
        if (($changed & 805306368) != 0) goto L112;
        if ((r53 & 512) != 0) goto L108;
        if ($composer2.changed(unselectedContentColor) == false) goto L108;
        int r19 = 536870912;
    L109:
        $dirty2 = $dirty2 | r19;
    L108:
        r19 = 268435456;
    L112:
        if (($dirty2 & 306783379) == 306783378) goto L114;
        boolean r1 = true;
    L116:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == false) goto L178;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "212@9664L6,213@9734L7,213@9768L6");
        if (($changed & 1) != 0) goto L120;
    L129:
        if (r5 == 0) goto L131;
        modifier2 = Modifier.Companion;
    L131:
        if (r7 == 0) goto L133;
        enabled2 = true;
    L133:
        if (r9 == 0) goto L135;
        r10 = null;
    L135:
        if (r11 == 0) goto L137;
        alwaysShowLabel2 = true;
    L137:
        if (r0 == 0) goto L139;
        MutableInteractionSource interactionSource2 = null;
    L141:
        if ((r53 & 256) == 0) goto L143;
        long selectedContentColor2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1598getPrimary0d7_KjU();
        $dirty2 = $dirty2 & (-234881025);
    L145:
        if ((r53 & 512) == 0) goto L147;
        ProvidableCompositionLocal<Color> r6 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r2 = $composer2.consume(r6);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        long unselectedContentColor2 = Color.m4365copywmQWz5c$default(((Color) r2).m4376unboximpl(), ContentAlpha.INSTANCE.getMedium($composer2, 6), 0.0f, 0.0f, 0.0f, 14, null);
        int $dirty3 = $dirty2 & (-1879048193);
    L148:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L152;
        ComposerKt.traceEventStart(-1813548445, $dirty3, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:214)");
    L152:
        if (r10 != null) goto L154;
        $composer2.startReplaceGroup(1653280754);
        $composer2.endReplaceGroup();
        final Function2 styledLabel = null;
    L156:
        if (r10 != null) goto L158;
        float itemSize = NavigationRailItemCompactSize;
    L159:
        IndicationNodeFactory ripple = RippleKt.m1746rippleH2RKhps$default(false, 0.0f, selectedContentColor2, 2, null);
        MutableInteractionSource interactionSource3 = interactionSource2;
        boolean enabled3 = enabled2;
        final MutableInteractionSource interactionSource4 = interactionSource3;
        Modifier modifier$iv = SizeKt.m772size3ABfNKs(SelectableKt.m986selectableO2vRcR0(modifier2, selected, interactionSource3, ripple, enabled3, Role.m6174boximpl(Role.Companion.m6188getTabo7Vup1c()), r4), itemSize);
        Alignment contentAlignment$iv = Alignment.Companion.getCenter();
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = (48 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r28 = ComposeUiNode.Companion.getConstructor();
        int $dirty4 = $dirty3;
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L162;
        ComposablesKt.invalidApplier();
    L162:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L165;
        Function0<ComposeUiNode> r3 = r28;
        $composer2.createNode(r3);
    L166:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r8 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L173;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L173;
    L174:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r12 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r13 = BoxScopeInstance.INSTANCE;
        int r14 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 1725516006, "C243@11114L302,243@11033L383:NavigationRail.kt#jmzs0o");
        m1709NavigationRailTransitionKlgxPg(selectedContentColor2, unselectedContentColor2, selected, ComposableLambdaKt.rememberComposableLambda(670576792, true, new NavigationRailKt$NavigationRailItem$1$1(alwaysShowLabel2, r41, styledLabel), $composer2, 54), $composer2, (((($dirty4 >> 24) & 14) | 3072) | (($dirty4 >> 24) & 112)) | (($dirty4 << 6) & 896));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L177;
        ComposerKt.traceEventEnd();
    L177:
        final Modifier modifier3 = modifier2;
        final boolean enabled4 = enabled3;
        final Function2<? super Composer, ? super Integer, Unit> r15 = r10;
        final boolean alwaysShowLabel3 = alwaysShowLabel2;
        final long selectedContentColor3 = selectedContentColor2;
        final long unselectedContentColor3 = unselectedContentColor2;
    L179:
        ScopeUpdateScope r16 = $composer2.endRestartGroup();
        if (r16 == null) goto L183;
        r16.updateScope(new NavigationRailKt$NavigationRailItem$2(selected, r40, r41, modifier3, enabled4, r15, alwaysShowLabel3, interactionSource4, selectedContentColor3, unselectedContentColor3, $changed, r53));
        return;
    L183:
        return;
    L173:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r8);
        goto L174
    L165:
        r3 = r28;
        $composer2.useNode();
        goto L166
    L158:
        itemSize = NavigationRailItemSize;
        goto L159
    L154:
        $composer2.startReplaceGroup(1653280755);
        ComposerKt.sourceInformation($composer2, "*217@9874L168");
        Function2 r17 = ComposableLambdaKt.rememberComposableLambda(-180398615, true, new NavigationRailKt$NavigationRailItem$styledLabel$1$1(r10), $composer2, 54);
        $composer2.endReplaceGroup();
        styledLabel = r17;
        goto L156
    L147:
        unselectedContentColor2 = unselectedContentColor;
        $dirty3 = $dirty2;
        goto L148
    L143:
        selectedContentColor2 = selectedContentColor;
        goto L145
    L139:
        interactionSource2 = interactionSource;
        goto L141
    L120:
        if ($composer2.getDefaultsInvalid() == true) goto L129;
        $composer2.skipToGroupEnd();
        if ((r53 & 256) == 0) goto L126;
        $dirty2 = $dirty2 & (-234881025);
    L126:
        if ((r53 & 512) == 0) goto L128;
        selectedContentColor2 = selectedContentColor;
        unselectedContentColor2 = unselectedContentColor;
        $dirty3 = $dirty2 & (-1879048193);
        interactionSource2 = interactionSource;
        goto L148
    L128:
        interactionSource2 = interactionSource;
        selectedContentColor2 = selectedContentColor;
        unselectedContentColor2 = unselectedContentColor;
        $dirty3 = $dirty2;
        goto L148
    L178:
        $composer2.skipToGroupEnd();
        modifier3 = modifier2;
        enabled4 = enabled2;
        r15 = r10;
        alwaysShowLabel3 = alwaysShowLabel2;
        interactionSource4 = interactionSource;
        selectedContentColor3 = selectedContentColor;
        unselectedContentColor3 = unselectedContentColor;
        goto L179
    L114:
        r1 = false;
        goto L116
    L92:
        if ((r53 & 256) != 0) goto L96;
        int $dirty5 = $dirty;
        if ($composer2.changed(selectedContentColor) == false) goto L97;
        int r18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty2 = $dirty5 | r18;
    L97:
        r18 = 33554432;
        goto L98
    L96:
        $dirty5 = $dirty;
        goto L97
    L82:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changed(interactionSource) == false) goto L86;
        int r110 = 8388608;
    L87:
        $dirty = $dirty | r110;
        goto L90
    L86:
        r110 = 4194304;
        goto L87
    L71:
        if ((1572864 & $changed) != 0) goto L77;
        alwaysShowLabel2 = alwaysShowLabel;
        if ($composer2.changed(alwaysShowLabel2) == false) goto L75;
        int r111 = 1048576;
    L76:
        $dirty = $dirty | r111;
        goto L78
    L75:
        r111 = 524288;
        goto L76
    L77:
        alwaysShowLabel2 = alwaysShowLabel;
        goto L78
    L60:
        if ((196608 & $changed) != 0) goto L66;
        r10 = r44;
        if ($composer2.changedInstance(r10) == false) goto L64;
        int r112 = 131072;
    L65:
        $dirty = $dirty | r112;
        goto L67
    L64:
        r112 = 65536;
        goto L65
    L66:
        r10 = r44;
        goto L67
    L49:
        if (($changed & 24576) != 0) goto L55;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L53;
        int r20 = 16384;
    L54:
        $dirty = $dirty | r20;
        goto L56
    L53:
        r20 = 8192;
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
    L28:
        if (($changed & 384) != 0) goto L34;
        if ($composer2.changedInstance(r41) == false) goto L32;
        int r22 = 256;
    L33:
        $dirty = $dirty | r22;
        goto L34
    L32:
        r22 = 128;
        goto L33
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = r40;
        if ($composer2.changedInstance(r4) == false) goto L21;
        int r23 = 32;
    L22:
        $dirty = $dirty | r23;
        goto L25
    L21:
        r23 = 16;
        goto L22
    L23:
        r4 = r40;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changed(selected) == false) goto L10;
        int r24 = 4;
    L11:
        $dirty = $dirty | r24;
        goto L14
    L10:
        r24 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: NavigationRailTransition-Klgx-Pg, reason: not valid java name */
    private static final void m1709NavigationRailTransitionKlgxPg(final long activeColor, final long inactiveColor, final boolean selected, final Function3<? super Float, ? super Composer, ? super Integer, Unit> r33, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-207161906);
        ComposerKt.sourceInformation($composer2, "C(NavigationRailTransition)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color,3)290@12798L138,300@13150L42,297@13011L181:NavigationRail.kt#jmzs0o");
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
        r8.updateScope(new NavigationRailKt$NavigationRailTransition$2(activeColor, inactiveColor, selected, r33, $changed));
        return;
    L50:
        return;
    L37:
        if (ComposerKt.isTraceInProgress() == false) goto L39;
        ComposerKt.traceEventStart(-207161906, $dirty, -1, "androidx.compose.material.NavigationRailTransition (NavigationRail.kt:288)");
    L39:
        if (selected == false) goto L41;
        int $dirty2 = 1065353216;
    L42:
        final State<Float> r14 = AnimateAsStateKt.animateFloatAsState($dirty2, NavigationRailAnimationSpec, 0.0f, null, null, $composer2, 48, 28);
        long color = ColorKt.m4417lerpjxsXWHM(inactiveColor, activeColor, NavigationRailTransition_Klgx_Pg$lambda$2(r14));
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4356boximpl(Color.m4365copywmQWz5c$default(color, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m4368getAlphaimpl(color)))}, ComposableLambdaKt.rememberComposableLambda(-1688205042, true, new NavigationRailKt$NavigationRailTransition$1(r33, r14), $composer2, 54), $composer2, ProvidedValue.$stable | 48);
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

    private static final float NavigationRailTransition_Klgx_Pg$lambda$2(State<Float> r4) {
        return r4.getValue().floatValue();
    }

    private static final void NavigationRailItemBaselineLayout(final Function2<? super Composer, ? super Integer, Unit> r50, final Function2<? super Composer, ? super Integer, Unit> r51, final float iconPositionAnimationProgress, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1903861684);
        ComposerKt.sourceInformation($composer2, "C(NavigationRailItemBaselineLayout)P(!1,2)326@14057L927,321@13859L1125:NavigationRail.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r50) == false) goto L7;
        int r7 = 4;
    L8:
        $dirty = $dirty | r7;
        goto L10
    L7:
        r7 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r51) == false) goto L14;
        int r8 = 32;
    L15:
        $dirty = $dirty | r8;
        goto L17
    L14:
        r8 = 16;
    L17:
        if (($changed & 384) == 0) goto L19;
    L23:
        boolean r11 = true;
        if (($dirty & 147) == 146) goto L26;
        boolean r9 = true;
    L28:
        if ($composer2.shouldExecute(r9, $dirty & 1) == true) goto L30;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L100:
        ScopeUpdateScope r4 = $composer3.endRestartGroup();
        if (r4 == null) goto L104;
        r4.updateScope(new AnonymousClass3(r50, r51, iconPositionAnimationProgress, $changed));
        return;
    L104:
        return;
    L30:
        if (ComposerKt.isTraceInProgress() == false) goto L32;
        ComposerKt.traceEventStart(-1903861684, $dirty, -1, "androidx.compose.material.NavigationRailItemBaselineLayout (NavigationRail.kt:320)");
    L32:
        ComposerKt.sourceInformationMarkerStart($composer2, 297373517, "CC(remember):NavigationRail.kt#9igjgp");
        if (($dirty & 112) != 32) goto L35;
        boolean r5 = true;
    L37:
        if (($dirty & 896) == 256) goto L40;
        r11 = false;
    L40:
        boolean invalid$iv = r5 | r11;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L43;
    L46:
        Object value$iv = (MeasurePolicy) new NavigationRailKt$NavigationRailItemBaselineLayout$2$1(r51, iconPositionAnimationProgress);
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
        int r12 = ($changed$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, 531563657, "C322@13876L41:NavigationRail.kt#jmzs0o");
        Modifier modifier$iv2 = LayoutIdKt.layoutId(Modifier.Companion, "icon");
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer3, modifier$iv2);
        Function0<ComposeUiNode> r36 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L65;
        ComposablesKt.invalidApplier();
    L65:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L68;
        Function0<ComposeUiNode> r13 = r36;
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
        BoxScopeInstance r41 = BoxScopeInstance.INSTANCE;
        int r43 = ((6 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, 2021583249, "C322@13909L6:NavigationRail.kt#jmzs0o");
        r50.invoke($composer3, Integer.valueOf($dirty2 & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (r51 == null) goto L95;
        $composer3.startReplaceGroup(531629965);
        ComposerKt.sourceInformation($composer3, "324@13959L80");
        Modifier modifier$iv3 = AlphaKt.alpha(LayoutIdKt.layoutId(Modifier.Companion, "label"), iconPositionAnimationProgress);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv2 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
        int $changed$iv$iv3 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer3, modifier$iv3);
        Function0<ComposeUiNode> r18 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv3 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L82;
        ComposablesKt.invalidApplier();
    L82:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L85;
        Function0<ComposeUiNode> r17 = r18;
        $composer3.createNode(r17);
    L86:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r19 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L93;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == false) goto L93;
    L94:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r20 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r21 = BoxScopeInstance.INSTANCE;
        int r110 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, 2021703312, "C324@14030L7:NavigationRail.kt#jmzs0o");
        r51.invoke($composer3, Integer.valueOf(($dirty2 >> 3) & 14));
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
    L93:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r19);
        goto L94
    L85:
        r17 = r18;
        $composer3.useNode();
        goto L86
    L95:
        $composer3.startReplaceGroup(531729909);
        $composer3.endReplaceGroup();
    L76:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r14);
        goto L77
    L68:
        r13 = r36;
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
    private static final MeasureResult m1713placeIcon3p2s80s(MeasureScope $this$placeIcon_u2d3p2s80s, final Placeable iconPlaceable, long constraints) {
        final int iconX = Math.max(0, (Constraints.m6926getMaxWidthimpl(constraints) - iconPlaceable.getWidth()) / 2);
        final int iconY = Math.max(0, (Constraints.m6925getMaxHeightimpl(constraints) - iconPlaceable.getHeight()) / 2);
        return MeasureScope.layout$default($this$placeIcon_u2d3p2s80s, Constraints.m6926getMaxWidthimpl(constraints), Constraints.m6925getMaxHeightimpl(constraints), null, new NavigationRailKt$placeIcon$1(iconPlaceable, iconX, iconY), 4, null);
    }

    /* JADX INFO: renamed from: placeLabelAndIcon-DIyivk0, reason: not valid java name */
    private static final MeasureResult m1714placeLabelAndIconDIyivk0(MeasureScope $this$placeLabelAndIcon_u2dDIyivk0, final Placeable labelPlaceable, final Placeable iconPlaceable, long constraints, final float iconPositionAnimationProgress) {
        int baseline = labelPlaceable.get(AlignmentLineKt.getLastBaseline());
        int labelBaselineOffset = $this$placeLabelAndIcon_u2dDIyivk0.mo370roundToPx0680j_4(ItemLabelBaselineBottomOffset);
        final int labelY = (Constraints.m6925getMaxHeightimpl(constraints) - baseline) - labelBaselineOffset;
        final int labelX = (Constraints.m6926getMaxWidthimpl(constraints) - labelPlaceable.getWidth()) / 2;
        final int selectedIconY = $this$placeLabelAndIcon_u2dDIyivk0.mo370roundToPx0680j_4(ItemIconTopOffset);
        int unselectedIconY = (Constraints.m6925getMaxHeightimpl(constraints) - iconPlaceable.getHeight()) / 2;
        final int iconX = (Constraints.m6926getMaxWidthimpl(constraints) - iconPlaceable.getWidth()) / 2;
        int iconDistance = unselectedIconY - selectedIconY;
        final int offset = MathKt.roundToInt(iconDistance * (1.0f - iconPositionAnimationProgress));
        return MeasureScope.layout$default($this$placeLabelAndIcon_u2dDIyivk0, Constraints.m6926getMaxWidthimpl(constraints), Constraints.m6925getMaxHeightimpl(constraints), null, new NavigationRailKt$placeLabelAndIcon$1(iconPositionAnimationProgress, labelPlaceable, labelX, labelY, offset, iconPlaceable, iconX, selectedIconY), 4, null);
    }

    static {
        NavigationRailAnimationSpec = new TweenSpec(AnimationConstants.DefaultDurationMillis, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
        NavigationRailItemSize = Dp.m6973constructorimpl(72);
        NavigationRailItemCompactSize = Dp.m6973constructorimpl(56);
        NavigationRailPadding = Dp.m6973constructorimpl(8);
        HeaderPadding = Dp.m6973constructorimpl(8);
        ItemLabelBaselineBottomOffset = Dp.m6973constructorimpl(16);
        ItemIconTopOffset = Dp.m6973constructorimpl(14);
        ZeroInsets = WindowInsetsKt.m797WindowInsetsa9UjIt4$default(Dp.m6973constructorimpl(0), 0.0f, 0.0f, 0.0f, 14, null);
    }
}
