package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: ExpressiveNavigationBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001aW\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020!0,¢\u0006\u0002\b-H\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a\u009d\u0001\u00100\u001a\u00020!2\u0006\u00101\u001a\u0002022\f\u00103\u001a\b\u0012\u0004\u0012\u00020!0,2\u0011\u00104\u001a\r\u0012\u0004\u0012\u00020!0,¢\u0006\u0002\b-2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u00105\u001a\u0002022\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020!\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020!\u0018\u00010,¢\u0006\u0002\b-2\b\b\u0002\u00108\u001a\u0002092\b\b\u0002\u0010:\u001a\u00020;2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=H\u0001ø\u0001\u0000¢\u0006\u0004\b>\u0010?\u001a\u0018\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020AH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b\"\u000e\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b\"\u0016\u0010\u000e\u001a\u00020\u0007X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000f\u0010\u0010\"\u0016\u0010\u0011\u001a\u00020\u0007X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0012\u0010\u0010\"\u0010\u0010\u0013\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b\"\u0016\u0010\u0014\u001a\u00020\u0007X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0015\u0010\u0010\"\u0016\u0010\u0016\u001a\u00020\u0007X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0017\u0010\u0010\"\u0016\u0010\u0018\u001a\u00020\u0007X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0019\u0010\u0010\"\u0016\u0010\u001a\u001a\u00020\u0007X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001b\u0010\u0010\"\u0010\u0010\u001c\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b\"\u0010\u0010\u001d\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b\"\u0016\u0010\u001e\u001a\u00020\u0007X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"ActiveIconColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveIndicatorColor", "ActiveIndicatorShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ActiveLabelTextColor", "IconSize", "Landroidx/compose/ui/unit/Dp;", "F", "InactiveIconColor", "InactiveLabelTextColor", "LabelTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "NavigationBarHeight", "StartIconIndicatorHorizontalPadding", "getStartIconIndicatorHorizontalPadding", "()F", "StartIconIndicatorVerticalPadding", "getStartIconIndicatorVerticalPadding", "StartIconItemActiveIndicatorHeight", "StartIconToLabelPadding", "getStartIconToLabelPadding", "TopIconIndicatorHorizontalPadding", "getTopIconIndicatorHorizontalPadding", "TopIconIndicatorToLabelPadding", "getTopIconIndicatorToLabelPadding", "TopIconIndicatorVerticalPadding", "getTopIconIndicatorVerticalPadding", "TopIconItemActiveIndicatorHeight", "TopIconItemActiveIndicatorWidth", "TopIconItemVerticalPadding", "getTopIconItemVerticalPadding", "ExpressiveNavigationBar", "", "modifier", "Landroidx/compose/ui/Modifier;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "arrangement", "Landroidx/compose/material3/NavigationBarArrangement;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "ExpressiveNavigationBar-NiJtXQ4", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/foundation/layout/WindowInsets;ILkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ExpressiveNavigationBarItem", "selected", "", "onClick", "icon", "enabled", "label", "badge", "iconPosition", "Landroidx/compose/material3/NavigationItemIconPosition;", "colors", "Landroidx/compose/material3/NavigationItemColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "ExpressiveNavigationBarItem-pli-t6k", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILandroidx/compose/material3/NavigationItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "calculateCenteredContentHorizontalPadding", "", "itemsCount", "barWidth", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ExpressiveNavigationBarKt {
    private static final ColorSchemeKeyTokens ActiveIconColor = null;
    private static final ColorSchemeKeyTokens ActiveIndicatorColor = null;
    private static final ShapeKeyTokens ActiveIndicatorShape = null;
    private static final ColorSchemeKeyTokens ActiveLabelTextColor = null;
    private static final float IconSize = 0.0f;
    private static final ColorSchemeKeyTokens InactiveIconColor = null;
    private static final ColorSchemeKeyTokens InactiveLabelTextColor = null;
    private static final TypographyKeyTokens LabelTextFont = null;
    private static final float NavigationBarHeight = 0.0f;
    private static final float StartIconIndicatorHorizontalPadding = 0.0f;
    private static final float StartIconIndicatorVerticalPadding = 0.0f;
    private static final float StartIconItemActiveIndicatorHeight = 0.0f;
    private static final float StartIconToLabelPadding = 0.0f;
    private static final float TopIconIndicatorHorizontalPadding = 0.0f;
    private static final float TopIconIndicatorToLabelPadding = 0.0f;
    private static final float TopIconIndicatorVerticalPadding = 0.0f;
    private static final float TopIconItemActiveIndicatorHeight = 0.0f;
    private static final float TopIconItemActiveIndicatorWidth = 0.0f;
    private static final float TopIconItemVerticalPadding = 0.0f;

    public static final /* synthetic */ int access$calculateCenteredContentHorizontalPadding(int itemsCount, int barWidth) {
        return calculateCenteredContentHorizontalPadding(itemsCount, barWidth);
    }

    public static final /* synthetic */ ColorSchemeKeyTokens access$getActiveIconColor$p() {
        return ActiveIconColor;
    }

    public static final /* synthetic */ ColorSchemeKeyTokens access$getActiveIndicatorColor$p() {
        return ActiveIndicatorColor;
    }

    public static final /* synthetic */ ColorSchemeKeyTokens access$getActiveLabelTextColor$p() {
        return ActiveLabelTextColor;
    }

    public static final /* synthetic */ ColorSchemeKeyTokens access$getInactiveIconColor$p() {
        return InactiveIconColor;
    }

    public static final /* synthetic */ ColorSchemeKeyTokens access$getInactiveLabelTextColor$p() {
        return InactiveLabelTextColor;
    }

    public static final /* synthetic */ float access$getNavigationBarHeight$p() {
        return NavigationBarHeight;
    }

    /* JADX INFO: renamed from: ExpressiveNavigationBar-NiJtXQ4, reason: not valid java name */
    public static final void m2222ExpressiveNavigationBarNiJtXQ4(Modifier modifier, long containerColor, long contentColor, WindowInsets windowInsets, int arrangement, final Function2<? super Composer, ? super Integer, Unit> r32, Composer $composer, final int $changed, final int r35) {
        Composer $composer2 = $composer.startRestartGroup(-1171105467);
        ComposerKt.sourceInformation($composer2, "C(ExpressiveNavigationBar)P(4,1:c#ui.graphics.Color,3:c#ui.graphics.Color,5,0:c#material3.NavigationBarArrangement)83@3944L14,84@4018L12,85@4097L12,92@4328L779,89@4244L863:ExpressiveNavigationBar.kt#uh7d8r");
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
    L36:
        if (($changed & 3072) == 0) goto L38;
        final WindowInsets windowInsets2 = windowInsets;
    L47:
        if (($changed & 24576) == 0) goto L49;
        int r12 = arrangement;
    L58:
        if ((r35 & 32) == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L68:
        if ((74899 & $dirty) == 74898) goto L70;
    L73:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L76;
    L91:
        if (r3 == 0) goto L93;
        final Modifier.Companion modifier2 = Modifier.Companion;
    L95:
        if ((r35 & 2) == 0) goto L98;
        $dirty = $dirty & (-113);
        containerColor2 = ExpressiveNavigationBarDefaults.INSTANCE.getContainerColor($composer2, 6);
    L98:
        if ((r35 & 4) == 0) goto L101;
        contentColor2 = ExpressiveNavigationBarDefaults.INSTANCE.getContentColor($composer2, 6);
        $dirty = $dirty & (-897);
    L101:
        if ((r35 & 8) == 0) goto L104;
        $dirty = $dirty & (-7169);
        windowInsets2 = ExpressiveNavigationBarDefaults.INSTANCE.getWindowInsets($composer2, 6);
    L104:
        if ((r35 & 16) == 0) goto L106;
        final int arrangement2 = ExpressiveNavigationBarDefaults.INSTANCE.m2221getArrangementEbr7WPU();
        $dirty = $dirty & (-57345);
        long containerColor3 = containerColor2;
        long contentColor3 = contentColor2;
    L107:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L110;
        ComposerKt.traceEventStart(-1171105467, $dirty, -1, "androidx.compose.material3.ExpressiveNavigationBar (ExpressiveNavigationBar.kt:88)");
    L110:
        Composer $composer3 = $composer2;
        SurfaceKt.m2670SurfaceT9BRK9s(null, null, containerColor3, contentColor3, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1573697866, true, new ExpressiveNavigationBarKt$ExpressiveNavigationBar$1(modifier2, windowInsets2, arrangement2, r32), $composer2, 54), $composer3, ((($dirty << 3) & 896) | 12582912) | (($dirty << 3) & 7168), 115);
        if (ComposerKt.isTraceInProgress() == false) goto L113;
        ComposerKt.traceEventEnd();
    L113:
        final Modifier modifier3 = modifier2;
        final WindowInsets windowInsets3 = windowInsets2;
        final long containerColor4 = containerColor3;
        final int arrangement3 = arrangement2;
        final long contentColor4 = contentColor3;
    L114:
        ScopeUpdateScope r13 = $composer3.endRestartGroup();
        if (r13 == null) goto L118;
        r13.updateScope(new ExpressiveNavigationBarKt$ExpressiveNavigationBar$2(modifier3, containerColor4, contentColor4, windowInsets3, arrangement3, r32, $changed, r35));
        return;
    L118:
        return;
    L106:
        contentColor3 = contentColor2;
        arrangement2 = r12;
        containerColor3 = containerColor2;
        goto L107
    L93:
        modifier2 = r4;
        goto L95
    L76:
        if ($composer2.getDefaultsInvalid() == true) goto L91;
        $composer2.skipToGroupEnd();
        if ((r35 & 2) == 0) goto L82;
        $dirty = $dirty & (-113);
    L82:
        if ((r35 & 4) == 0) goto L85;
        $dirty = $dirty & (-897);
    L85:
        if ((r35 & 8) == 0) goto L88;
        $dirty = $dirty & (-7169);
    L88:
        if ((r35 & 16) == 0) goto L90;
        $dirty = $dirty & (-57345);
    L90:
        modifier2 = r4;
        contentColor3 = contentColor2;
        arrangement2 = r12;
        containerColor3 = containerColor2;
        goto L107
    L70:
        if ($composer2.getSkipping() == false) goto L73;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier3 = r4;
        containerColor4 = containerColor2;
        windowInsets3 = windowInsets2;
        contentColor4 = contentColor2;
        arrangement3 = r12;
        goto L114
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
        r12 = arrangement;
        if ($composer2.changed(r12) == false) goto L54;
        int r15 = 16384;
    L55:
        $dirty = $dirty | r15;
    L54:
        r15 = 8192;
        goto L55
    L53:
        r12 = arrangement;
        goto L54
    L38:
        if ((r35 & 8) != 0) goto L42;
        windowInsets2 = windowInsets;
        if ($composer2.changed(windowInsets2) == false) goto L43;
        int r16 = 2048;
    L44:
        $dirty = $dirty | r16;
    L43:
        r16 = 1024;
        goto L44
    L42:
        windowInsets2 = windowInsets;
        goto L43
    L27:
        if ((r35 & 4) != 0) goto L31;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L32;
        int r7 = 256;
    L33:
        $dirty = $dirty | r7;
    L32:
        r7 = 128;
        goto L33
    L31:
        contentColor2 = contentColor;
        goto L32
    L16:
        if ((r35 & 2) != 0) goto L20;
        containerColor2 = containerColor;
        if ($composer2.changed(containerColor2) == false) goto L21;
        int r8 = 32;
    L22:
        $dirty = $dirty | r8;
    L21:
        r8 = 16;
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

    /* JADX INFO: renamed from: ExpressiveNavigationBarItem-pli-t6k, reason: not valid java name */
    public static final void m2223ExpressiveNavigationBarItemplit6k(final boolean selected, final Function0<Unit> r35, final Function2<? super Composer, ? super Integer, Unit> r36, Modifier modifier, boolean enabled, Function2<? super Composer, ? super Integer, Unit> r39, Function2<? super Composer, ? super Integer, Unit> r40, int iconPosition, NavigationItemColors colors, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int r46) {
        Composer $composer2 = $composer.startRestartGroup(1250474866);
        ComposerKt.sourceInformation($composer2, "C(ExpressiveNavigationBarItem)P(9,8,3,7,2,6!1,4:c#material3.NavigationItemIconPosition)195@8610L8,219@9391L5,220@9444L5,215@9259L800:ExpressiveNavigationBar.kt#uh7d8r");
        int $dirty = $changed;
        if ((r46 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        boolean r13 = selected;
    L14:
        if ((r46 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function0<Unit> r14 = r35;
    L25:
        if ((r46 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
        Function2<? super Composer, ? super Integer, Unit> r3 = r36;
    L35:
        int r4 = r46 & 8;
        if (r4 == 0) goto L39;
        $dirty = $dirty | 3072;
        Modifier modifier2 = modifier;
    L46:
        int r6 = r46 & 16;
        if (r6 == 0) goto L50;
        $dirty = $dirty | 24576;
        boolean enabled2 = enabled;
    L57:
        int r8 = r46 & 32;
        if (r8 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function2<? super Composer, ? super Integer, Unit> r9 = r39;
    L68:
        int r10 = r46 & 64;
        if (r10 == 0) goto L72;
        $dirty = $dirty | 1572864;
        Function2<? super Composer, ? super Integer, Unit> r15 = r40;
    L79:
        int r0 = r46 & 128;
        if (r0 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L91:
        if (($changed & 100663296) != 0) goto L101;
        if ((r46 & 256) != 0) goto L98;
        if ($composer2.changed(colors) == false) goto L98;
        int r18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r18;
    L98:
        r18 = 33554432;
    L101:
        int iconPosition2 = r46 & 512;
        if (iconPosition2 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L112:
        int $dirty2 = $dirty;
        if (($dirty & 306783379) == 306783378) goto L115;
    L118:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L121;
    L127:
        if (r4 == 0) goto L129;
        modifier2 = Modifier.Companion;
    L129:
        if (r6 == 0) goto L131;
        enabled2 = true;
    L131:
        if (r8 == 0) goto L133;
        r9 = null;
    L133:
        if (r10 == 0) goto L135;
        r15 = null;
    L135:
        if (r0 == 0) goto L137;
        int iconPosition3 = NavigationItemIconPosition.Companion.m2437getTopxw1Ddg();
    L139:
        if ((r46 & 256) == 0) goto L141;
        NavigationItemColors colors2 = ExpressiveNavigationBarItemDefaults.INSTANCE.colors($composer2, 6);
        int $dirty3 = $dirty2 & (-234881025);
    L142:
        if (iconPosition2 == 0) goto L144;
        MutableInteractionSource interactionSource2 = null;
        NavigationItemColors colors3 = colors2;
        Modifier modifier3 = modifier2;
        boolean enabled3 = enabled2;
        Function2<? super Composer, ? super Integer, Unit> r27 = r9;
        Function2<? super Composer, ? super Integer, Unit> r28 = r15;
    L145:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L148;
        ComposerKt.traceEventStart(1250474866, $dirty3, -1, "androidx.compose.material3.ExpressiveNavigationBarItem (ExpressiveNavigationBar.kt:197)");
    L148:
        $composer2.startReplaceGroup(-986536477);
        ComposerKt.sourceInformation($composer2, "199@8762L39");
        if (interactionSource2 != null) goto L155;
        ComposerKt.sourceInformationMarkerStart($composer2, -986535826, "CC(remember):ExpressiveNavigationBar.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L153;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
    L154:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        MutableInteractionSource interactionSource3 = (MutableInteractionSource) value$iv;
    L156:
        $composer2.endReplaceGroup();
        boolean isIconPositionTop = NavigationItemIconPosition.m2432equalsimpl0(iconPosition3, NavigationItemIconPosition.Companion.m2437getTopxw1Ddg());
        if (isIconPositionTop == false) goto L159;
        float indicatorHorizontalPadding = TopIconIndicatorHorizontalPadding;
    L161:
        if (isIconPositionTop == false) goto L163;
        float indicatorVerticalPadding = TopIconIndicatorVerticalPadding;
    L164:
        int iconPosition4 = iconPosition3;
        Composer $composer3 = $composer2;
        NavigationItemKt.m2438NavigationItemSHbi2eg(r13, r14, r3, TypographyKt.getValue(LabelTextFont, $composer2, 6), ShapesKt.getValue(ActiveIndicatorShape, $composer2, 6), TopIconItemActiveIndicatorWidth, indicatorHorizontalPadding, indicatorVerticalPadding, TopIconIndicatorToLabelPadding, StartIconToLabelPadding, TopIconItemVerticalPadding, colors3, modifier3, enabled3, r27, r28, iconPosition4, interactionSource3, $composer3, ((($dirty3 & 14) | 906166272) | ($dirty3 & 112)) | ($dirty3 & 896), (((((6 | (($dirty3 >> 21) & 112)) | (($dirty3 >> 3) & 896)) | (($dirty3 >> 3) & 7168)) | (($dirty3 >> 3) & 57344)) | (($dirty3 >> 3) & 458752)) | (3670016 & ($dirty3 >> 3)));
        if (ComposerKt.isTraceInProgress() == false) goto L167;
        ComposerKt.traceEventEnd();
    L167:
        final MutableInteractionSource interactionSource4 = interactionSource2;
        final NavigationItemColors colors4 = colors3;
        final Modifier modifier4 = modifier3;
        final boolean enabled4 = enabled3;
        final Function2<? super Composer, ? super Integer, Unit> r7 = r27;
        final Function2<? super Composer, ? super Integer, Unit> r11 = r28;
        final int iconPosition5 = iconPosition4;
    L168:
        ScopeUpdateScope r16 = $composer3.endRestartGroup();
        if (r16 == null) goto L172;
        r16.updateScope(new ExpressiveNavigationBarKt$ExpressiveNavigationBarItem$1(selected, r35, r36, modifier4, enabled4, r7, r11, iconPosition5, colors4, interactionSource4, $changed, r46));
        return;
    L172:
        return;
    L163:
        indicatorVerticalPadding = StartIconIndicatorVerticalPadding;
        goto L164
    L159:
        indicatorHorizontalPadding = StartIconIndicatorHorizontalPadding;
        goto L161
    L153:
        value$iv = it$iv;
        goto L154
    L155:
        interactionSource3 = interactionSource2;
        goto L156
    L144:
        interactionSource2 = interactionSource;
        colors3 = colors2;
        modifier3 = modifier2;
        enabled3 = enabled2;
        r27 = r9;
        r28 = r15;
        goto L145
    L141:
        colors2 = colors;
        $dirty3 = $dirty2;
        goto L142
    L137:
        iconPosition3 = iconPosition;
        goto L139
    L121:
        if ($composer2.getDefaultsInvalid() == true) goto L127;
        $composer2.skipToGroupEnd();
        if ((r46 & 256) == 0) goto L126;
        colors3 = colors;
        interactionSource2 = interactionSource;
        $dirty3 = $dirty2 & (-234881025);
        modifier3 = modifier2;
        enabled3 = enabled2;
        r27 = r9;
        r28 = r15;
        iconPosition3 = iconPosition;
        goto L145
    L126:
        iconPosition3 = iconPosition;
        colors3 = colors;
        interactionSource2 = interactionSource;
        $dirty3 = $dirty2;
        modifier3 = modifier2;
        enabled3 = enabled2;
        r27 = r9;
        r28 = r15;
        goto L145
    L115:
        if ($composer2.getSkipping() == false) goto L118;
        $composer2.skipToGroupEnd();
        iconPosition5 = iconPosition;
        interactionSource4 = interactionSource;
        $composer3 = $composer2;
        modifier4 = modifier2;
        enabled4 = enabled2;
        r7 = r9;
        r11 = r15;
        colors4 = colors;
        goto L168
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changed(interactionSource) == false) goto L109;
        int r19 = 536870912;
    L110:
        $dirty = $dirty | r19;
        goto L112
    L109:
        r19 = 268435456;
        goto L110
    L83:
        if (($changed & 12582912) != 0) goto L91;
        if ($composer2.changed(iconPosition) == false) goto L87;
        int r110 = 8388608;
    L88:
        $dirty = $dirty | r110;
        goto L91
    L87:
        r110 = 4194304;
        goto L88
    L72:
        if ((1572864 & $changed) != 0) goto L78;
        r15 = r40;
        if ($composer2.changedInstance(r15) == false) goto L76;
        int r17 = 1048576;
    L77:
        $dirty = $dirty | r17;
        goto L79
    L76:
        r17 = 524288;
        goto L77
    L78:
        r15 = r40;
        goto L79
    L61:
        if ((196608 & $changed) != 0) goto L67;
        r9 = r39;
        if ($composer2.changedInstance(r9) == false) goto L65;
        int r12 = 131072;
    L66:
        $dirty = $dirty | r12;
        goto L68
    L65:
        r12 = 65536;
        goto L66
    L67:
        r9 = r39;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L56;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L54;
        int r20 = 16384;
    L55:
        $dirty = $dirty | r20;
        goto L57
    L54:
        r20 = 8192;
        goto L55
    L56:
        enabled2 = enabled;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L43;
        int r21 = 2048;
    L44:
        $dirty = $dirty | r21;
        goto L46
    L43:
        r21 = 1024;
        goto L44
    L45:
        modifier2 = modifier;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r3 = r36;
        if ($composer2.changedInstance(r3) == false) goto L32;
        int r5 = 256;
    L33:
        $dirty = $dirty | r5;
        goto L35
    L32:
        r5 = 128;
        goto L33
    L34:
        r3 = r36;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r14 = r35;
        if ($composer2.changedInstance(r14) == false) goto L21;
        int r22 = 32;
    L22:
        $dirty = $dirty | r22;
        goto L25
    L21:
        r22 = 16;
        goto L22
    L23:
        r14 = r35;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r13 = selected;
        if ($composer2.changed(r13) == false) goto L10;
        int r23 = 4;
    L11:
        $dirty = $dirty | r23;
        goto L14
    L10:
        r23 = 2;
        goto L11
    L12:
        r13 = selected;
        goto L14
    }

    private static final int calculateCenteredContentHorizontalPadding(int itemsCount, int barWidth) {
        if (itemsCount <= 6) goto L6;
        return 0;
    L6:
        float paddingPercentage = ((100 - ((itemsCount + 3) * 10)) / 2.0f) / 100.0f;
        return MathKt.roundToInt(barWidth * paddingPercentage);
    }

    static {
        IconSize = Dp.m6973constructorimpl((float) 24.0d);
        TopIconItemActiveIndicatorWidth = Dp.m6973constructorimpl(56);
        TopIconItemActiveIndicatorHeight = Dp.m6973constructorimpl(32);
        StartIconItemActiveIndicatorHeight = Dp.m6973constructorimpl(40);
        LabelTextFont = TypographyKeyTokens.LabelMedium;
        ActiveIndicatorShape = ShapeKeyTokens.CornerFull;
        ActiveIconColor = ColorSchemeKeyTokens.Secondary;
        ActiveLabelTextColor = ColorSchemeKeyTokens.Secondary;
        ActiveIndicatorColor = ColorSchemeKeyTokens.SecondaryContainer;
        InactiveIconColor = ColorSchemeKeyTokens.OnSurfaceVariant;
        InactiveLabelTextColor = ColorSchemeKeyTokens.OnSurfaceVariant;
        NavigationBarHeight = Dp.m6973constructorimpl(64);
        TopIconItemVerticalPadding = Dp.m6973constructorimpl(6);
        float arg0$iv = TopIconItemActiveIndicatorHeight;
        float other$iv = IconSize;
        TopIconIndicatorVerticalPadding = Dp.m6973constructorimpl(Dp.m6973constructorimpl(arg0$iv - other$iv) / 2);
        float arg0$iv2 = TopIconItemActiveIndicatorWidth;
        float other$iv2 = IconSize;
        TopIconIndicatorHorizontalPadding = Dp.m6973constructorimpl(Dp.m6973constructorimpl(arg0$iv2 - other$iv2) / 2);
        float arg0$iv3 = StartIconItemActiveIndicatorHeight;
        float other$iv3 = IconSize;
        StartIconIndicatorVerticalPadding = Dp.m6973constructorimpl(Dp.m6973constructorimpl(arg0$iv3 - other$iv3) / 2);
        TopIconIndicatorToLabelPadding = Dp.m6973constructorimpl(4);
        StartIconIndicatorHorizontalPadding = Dp.m6973constructorimpl(16);
        StartIconToLabelPadding = Dp.m6973constructorimpl(4);
    }

    public static final float getTopIconItemVerticalPadding() {
        return TopIconItemVerticalPadding;
    }

    public static final float getTopIconIndicatorVerticalPadding() {
        return TopIconIndicatorVerticalPadding;
    }

    public static final float getTopIconIndicatorHorizontalPadding() {
        return TopIconIndicatorHorizontalPadding;
    }

    public static final float getStartIconIndicatorVerticalPadding() {
        return StartIconIndicatorVerticalPadding;
    }

    public static final float getTopIconIndicatorToLabelPadding() {
        return TopIconIndicatorToLabelPadding;
    }

    public static final float getStartIconIndicatorHorizontalPadding() {
        return StartIconIndicatorHorizontalPadding;
    }

    public static final float getStartIconToLabelPadding() {
        return StartIconToLabelPadding;
    }
}
