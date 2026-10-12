package androidx.compose.material;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Tab.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0082\u0001\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00122\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u008a\u0001\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00122\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001az\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00122\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u001c\u0010%\u001a\u0018\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00100&¢\u0006\u0002\b\u0016¢\u0006\u0002\b(H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a7\u0010+\u001a\u00020\u00102\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u0016H\u0003¢\u0006\u0002\u0010,\u001a=\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u00122\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u0016H\u0003ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001aD\u00102\u001a\u00020\u0010*\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000bH\u0002\u001a\u001c\u0010=\u001a\u00020\u0010*\u0002032\u0006\u0010>\u001a\u0002072\u0006\u0010:\u001a\u00020\u000bH\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u000e\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006?²\u0006\n\u0010@\u001a\u00020\u001eX\u008a\u0084\u0002"}, d2 = {"DoubleLineTextBaselineWithIcon", "Landroidx/compose/ui/unit/Dp;", "F", "HorizontalTextPadding", "IconDistanceFromBaseline", "Landroidx/compose/ui/unit/TextUnit;", "J", "LargeTabHeight", "SingleLineTextBaselineWithIcon", "SmallTabHeight", "TabFadeInAnimationDelay", "", "TabFadeInAnimationDuration", "TabFadeOutAnimationDuration", "TextDistanceFromLeadingIcon", "LeadingIconTab", "", "selected", "", "onClick", "Lkotlin/Function0;", "text", "Landroidx/compose/runtime/Composable;", "icon", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "selectedContentColor", "Landroidx/compose/ui/graphics/Color;", "unselectedContentColor", "LeadingIconTab-0nD-MI0", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "Tab", "Tab-0nD-MI0", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "Tab-EVJuX4I", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TabBaselineLayout", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TabTransition", "activeColor", "inactiveColor", "TabTransition-Klgx-Pg", "(JJZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "placeTextAndIcon", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "density", "Landroidx/compose/ui/unit/Density;", "textPlaceable", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "tabWidth", "tabHeight", "firstBaseline", "lastBaseline", "placeTextOrIcon", "textOrIconPlaceable", "material_release", "color"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TabKt {
    private static final float DoubleLineTextBaselineWithIcon = 0.0f;
    private static final float HorizontalTextPadding = 0.0f;
    private static final long IconDistanceFromBaseline = 0;
    private static final float LargeTabHeight = 0.0f;
    private static final float SingleLineTextBaselineWithIcon = 0.0f;
    private static final float SmallTabHeight = 0.0f;
    private static final int TabFadeInAnimationDelay = 100;
    private static final int TabFadeInAnimationDuration = 150;
    private static final int TabFadeOutAnimationDuration = 100;
    private static final float TextDistanceFromLeadingIcon = 0.0f;

    public static final /* synthetic */ void access$TabBaselineLayout(Function2 text, Function2 icon, Composer $composer, int $changed) {
        TabBaselineLayout(text, icon, $composer, $changed);
    }

    /* JADX INFO: renamed from: access$TabTransition-Klgx-Pg, reason: not valid java name */
    public static final /* synthetic */ void m1802access$TabTransitionKlgxPg(long activeColor, long inactiveColor, boolean selected, Function2 content, Composer $composer, int $changed) {
        m1801TabTransitionKlgxPg(activeColor, inactiveColor, selected, content, $composer, $changed);
    }

    public static final /* synthetic */ float access$getHorizontalTextPadding$p() {
        return HorizontalTextPadding;
    }

    public static final /* synthetic */ float access$getLargeTabHeight$p() {
        return LargeTabHeight;
    }

    public static final /* synthetic */ float access$getSmallTabHeight$p() {
        return SmallTabHeight;
    }

    public static final /* synthetic */ float access$getTextDistanceFromLeadingIcon$p() {
        return TextDistanceFromLeadingIcon;
    }

    public static final /* synthetic */ void access$placeTextAndIcon(Placeable.PlacementScope $receiver, Density density, Placeable textPlaceable, Placeable iconPlaceable, int tabWidth, int tabHeight, int firstBaseline, int lastBaseline) {
        placeTextAndIcon($receiver, density, textPlaceable, iconPlaceable, tabWidth, tabHeight, firstBaseline, lastBaseline);
    }

    public static final /* synthetic */ void access$placeTextOrIcon(Placeable.PlacementScope $receiver, Placeable textOrIconPlaceable, int tabHeight) {
        placeTextOrIcon($receiver, textOrIconPlaceable, tabHeight);
    }

    /* JADX INFO: renamed from: Tab-0nD-MI0, reason: not valid java name */
    public static final void m1799Tab0nDMI0(final boolean selected, final Function0<Unit> r33, Modifier modifier, boolean enabled, Function2<? super Composer, ? super Integer, Unit> r36, Function2<? super Composer, ? super Integer, Unit> r37, MutableInteractionSource interactionSource, long selectedContentColor, long unselectedContentColor, Composer $composer, final int $changed, final int r45) {
        Composer $composer2 = $composer.startRestartGroup(-1486097588);
        ComposerKt.sourceInformation($composer2, "C(Tab)P(5,4,3!1,7!2,6:c#ui.graphics.Color,8:c#ui.graphics.Color)114@4898L65,106@4729L234:Tab.kt#jmzs0o");
        int $dirty = $changed;
        if ((r45 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        boolean r14 = selected;
    L14:
        if ((r45 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function0<Unit> r15 = r33;
    L24:
        int r3 = r45 & 4;
        if (r3 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L35:
        int r5 = r45 & 8;
        if (r5 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L46:
        int r7 = r45 & 16;
        if (r7 == 0) goto L50;
        $dirty = $dirty | 24576;
        final Function2<? super Composer, ? super Integer, Unit> r8 = r36;
    L57:
        int r9 = r45 & 32;
        if (r9 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        final Function2<? super Composer, ? super Integer, Unit> r10 = r37;
    L68:
        int r11 = r45 & 64;
        if (r11 == 0) goto L72;
        $dirty = $dirty | 1572864;
    L80:
        if (($changed & 12582912) == 0) goto L82;
        int $dirty2 = $dirty;
        int r43 = r3;
    L91:
        if (($changed & 100663296) != 0) goto L101;
        int $dirty3 = $dirty2;
        if ((r45 & 256) != 0) goto L98;
        if ($composer2.changed(unselectedContentColor) == false) goto L98;
        int r0 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty2 = $dirty3 | r0;
    L98:
        r0 = 33554432;
    L101:
        int $dirty4 = $dirty2;
        if (($dirty4 & 38347923) == 38347922) goto L104;
        boolean r1 = true;
    L106:
        if ($composer2.shouldExecute(r1, $dirty4 & 1) == false) goto L150;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "96@4352L7,97@4444L6");
        if (($changed & 1) != 0) goto L110;
    L120:
        if (r43 == 0) goto L122;
        modifier2 = Modifier.Companion;
    L122:
        if (r5 == 0) goto L124;
        enabled2 = true;
    L124:
        if (r7 == 0) goto L126;
        r8 = null;
    L126:
        if (r9 == 0) goto L128;
        r10 = null;
    L128:
        if (r11 == 0) goto L130;
        MutableInteractionSource interactionSource2 = null;
    L132:
        if ((r45 & 128) == 0) goto L134;
        ProvidableCompositionLocal<Color> r6 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r2 = $composer2.consume(r6);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        long selectedContentColor2 = ((Color) r2).m4376unboximpl();
        int $dirty5 = $dirty4 & (-29360129);
        long selectedContentColor3 = selectedContentColor2;
    L136:
        if ((r45 & 256) == 0) goto L138;
        long unselectedContentColor2 = Color.m4365copywmQWz5c$default(selectedContentColor3, ContentAlpha.INSTANCE.getMedium($composer2, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long selectedContentColor4 = selectedContentColor3;
        MutableInteractionSource interactionSource3 = interactionSource2;
        int $dirty6 = $dirty5 & (-234881025);
        boolean enabled3 = enabled2;
    L139:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L143;
        ComposerKt.traceEventStart(-1486097588, $dirty6, -1, "androidx.compose.material.Tab (Tab.kt:98)");
    L143:
        if (r8 != null) goto L145;
        $composer2.startReplaceGroup(1041219556);
        $composer2.endReplaceGroup();
        final Function2 styledText = null;
    L146:
        Composer $composer3 = $composer2;
        Modifier modifier3 = modifier2;
        m1800TabEVJuX4I(r14, r15, modifier3, enabled3, interactionSource3, selectedContentColor4, unselectedContentColor2, ComposableLambdaKt.rememberComposableLambda(-178151495, true, new TabKt$Tab$1(styledText, r10), $composer2, 54), $composer3, ((((((12582912 | ($dirty6 & 14)) | ($dirty6 & 112)) | ($dirty6 & 896)) | ($dirty6 & 7168)) | (($dirty6 >> 6) & 57344)) | (($dirty6 >> 6) & 458752)) | (($dirty6 >> 6) & 3670016), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L149;
        ComposerKt.traceEventEnd();
    L149:
        final Function2<? super Composer, ? super Integer, Unit> r12 = r8;
        final Function2<? super Composer, ? super Integer, Unit> r13 = r10;
        final Modifier modifier4 = modifier3;
        final boolean enabled4 = enabled3;
        final MutableInteractionSource interactionSource4 = interactionSource3;
        final long selectedContentColor5 = selectedContentColor4;
        final long unselectedContentColor3 = unselectedContentColor2;
    L151:
        ScopeUpdateScope r16 = $composer3.endRestartGroup();
        if (r16 == null) goto L155;
        r16.updateScope(new TabKt$Tab$2(selected, r33, modifier4, enabled4, r12, r13, interactionSource4, selectedContentColor5, unselectedContentColor3, $changed, r45));
        return;
    L155:
        return;
    L145:
        $composer2.startReplaceGroup(1041219557);
        ComposerKt.sourceInformation($composer2, "*101@4548L166");
        Function2 r17 = ComposableLambdaKt.rememberComposableLambda(-1729014781, true, new TabKt$Tab$styledText$1$1(r8), $composer2, 54);
        $composer2.endReplaceGroup();
        styledText = r17;
        goto L146
    L138:
        interactionSource3 = interactionSource2;
        $dirty6 = $dirty5;
        selectedContentColor4 = selectedContentColor3;
        unselectedContentColor2 = unselectedContentColor;
        enabled3 = enabled2;
        goto L139
    L134:
        selectedContentColor3 = selectedContentColor;
        $dirty5 = $dirty4;
        goto L136
    L130:
        interactionSource2 = interactionSource;
        goto L132
    L110:
        if ($composer2.getDefaultsInvalid() == true) goto L120;
        $composer2.skipToGroupEnd();
        if ((r45 & 128) == 0) goto L115;
        $dirty6 = $dirty4 & (-29360129);
    L117:
        if ((r45 & 256) == 0) goto L119;
        $dirty6 = $dirty6 & (-234881025);
        interactionSource3 = interactionSource;
        selectedContentColor4 = selectedContentColor;
        unselectedContentColor2 = unselectedContentColor;
        enabled3 = enabled2;
        goto L139
    L119:
        interactionSource3 = interactionSource;
        selectedContentColor4 = selectedContentColor;
        unselectedContentColor2 = unselectedContentColor;
        enabled3 = enabled2;
        goto L139
    L115:
        $dirty6 = $dirty4;
        goto L117
    L150:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        interactionSource4 = interactionSource;
        modifier4 = modifier2;
        enabled4 = enabled2;
        r12 = r8;
        r13 = r10;
        selectedContentColor5 = selectedContentColor;
        unselectedContentColor3 = unselectedContentColor;
        goto L151
    L104:
        r1 = false;
        goto L106
    L82:
        if ((r45 & 128) != 0) goto L86;
        int $dirty7 = $dirty;
        r43 = r3;
        if ($composer2.changed(selectedContentColor) == false) goto L87;
        int r18 = 8388608;
    L88:
        $dirty2 = $dirty7 | r18;
    L87:
        r18 = 4194304;
        goto L88
    L86:
        $dirty7 = $dirty;
        r43 = r3;
        goto L87
    L72:
        if (($changed & 1572864) != 0) goto L80;
        if ($composer2.changed(interactionSource) == false) goto L76;
        int r19 = 1048576;
    L77:
        $dirty = $dirty | r19;
        goto L80
    L76:
        r19 = 524288;
        goto L77
    L61:
        if ((196608 & $changed) != 0) goto L67;
        r10 = r37;
        if ($composer2.changedInstance(r10) == false) goto L65;
        int r110 = 131072;
    L66:
        $dirty = $dirty | r110;
        goto L68
    L65:
        r110 = 65536;
        goto L66
    L67:
        r10 = r37;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L56;
        r8 = r36;
        if ($composer2.changedInstance(r8) == false) goto L54;
        int r20 = 16384;
    L55:
        $dirty = $dirty | r20;
        goto L57
    L54:
        r20 = 8192;
        goto L55
    L56:
        r8 = r36;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L43;
        int r21 = 2048;
    L44:
        $dirty = $dirty | r21;
        goto L46
    L43:
        r21 = 1024;
        goto L44
    L45:
        enabled2 = enabled;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L32;
        int r22 = 256;
    L33:
        $dirty = $dirty | r22;
        goto L35
    L32:
        r22 = 128;
        goto L33
    L34:
        modifier2 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r15 = r33;
        if ($composer2.changedInstance(r15) == false) goto L21;
        int r4 = 32;
    L22:
        $dirty = $dirty | r4;
        goto L24
    L21:
        r4 = 16;
        goto L22
    L23:
        r15 = r33;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r14 = selected;
        if ($composer2.changed(r14) == false) goto L10;
        int r23 = 4;
    L11:
        $dirty = $dirty | r23;
        goto L14
    L10:
        r23 = 2;
        goto L11
    L12:
        r14 = selected;
        goto L14
    }

    /* JADX INFO: renamed from: LeadingIconTab-0nD-MI0, reason: not valid java name */
    public static final void m1798LeadingIconTab0nDMI0(final boolean selected, final Function0<Unit> r29, final Function2<? super Composer, ? super Integer, Unit> r30, final Function2<? super Composer, ? super Integer, Unit> r31, Modifier modifier, boolean enabled, MutableInteractionSource interactionSource, long selectedContentColor, long unselectedContentColor, Composer $composer, final int $changed, final int r41) {
        Composer $composer2 = $composer.startRestartGroup(-1499861761);
        ComposerKt.sourceInformation($composer2, "C(LeadingIconTab)P(5,4,7,1,3!2,6:c#ui.graphics.Color,8:c#ui.graphics.Color)167@7368L919,167@7298L989:Tab.kt#jmzs0o");
        int $dirty = $changed;
        if ((r41 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r41 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function0<Unit> r4 = r29;
    L25:
        if ((r41 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
        Function2<? super Composer, ? super Integer, Unit> r5 = r30;
    L36:
        if ((r41 & 8) == 0) goto L39;
        $dirty = $dirty | 3072;
        Function2<? super Composer, ? super Integer, Unit> r6 = r31;
    L46:
        int r7 = r41 & 16;
        if (r7 == 0) goto L50;
        $dirty = $dirty | 24576;
        Modifier modifier2 = modifier;
    L57:
        int r9 = r41 & 32;
        if (r9 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        boolean enabled2 = enabled;
    L68:
        int r11 = r41 & 64;
        if (r11 == 0) goto L72;
        $dirty = $dirty | 1572864;
        MutableInteractionSource interactionSource2 = interactionSource;
    L80:
        if ((12582912 & $changed) == 0) goto L82;
        int $dirty2 = $dirty;
    L91:
        if (($changed & 100663296) != 0) goto L102;
        if ((r41 & 256) != 0) goto L98;
        if ($composer2.changed(unselectedContentColor) == false) goto L98;
        int r0 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty2 = $dirty2 | r0;
    L98:
        r0 = 33554432;
    L102:
        if ((38347923 & $dirty2) == 38347922) goto L104;
        boolean r1 = true;
    L106:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == false) goto L140;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "159@6900L7,160@6992L6");
        if (($changed & 1) != 0) goto L110;
    L119:
        if (r7 == 0) goto L121;
        modifier2 = Modifier.Companion;
    L121:
        if (r9 == 0) goto L123;
        enabled2 = true;
    L123:
        if (r11 == 0) goto L126;
        interactionSource2 = null;
    L126:
        if ((r41 & 128) == 0) goto L128;
        ProvidableCompositionLocal<Color> r2 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r3 = $composer2.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $dirty2 = $dirty2 & (-29360129);
        long selectedContentColor2 = ((Color) r3).m4376unboximpl();
    L130:
        if ((r41 & 256) == 0) goto L132;
        int $dirty3 = $dirty2 & (-234881025);
        final Modifier modifier3 = modifier2;
        final boolean enabled3 = enabled2;
        long unselectedContentColor2 = Color.m4365copywmQWz5c$default(selectedContentColor2, ContentAlpha.INSTANCE.getMedium($composer2, 6), 0.0f, 0.0f, 0.0f, 14, null);
        final MutableInteractionSource interactionSource3 = interactionSource2;
    L133:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L136;
        ComposerKt.traceEventStart(-1499861761, $dirty3, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:161)");
    L136:
        long selectedContentColor3 = selectedContentColor2;
        final IndicationNodeFactory ripple = RippleKt.m1746rippleH2RKhps$default(true, 0.0f, selectedContentColor3, 2, null);
        final Function0<Unit> r20 = r4;
        final Function2<? super Composer, ? super Integer, Unit> r22 = r5;
        final Function2<? super Composer, ? super Integer, Unit> r21 = r6;
        long unselectedContentColor3 = unselectedContentColor2;
        m1801TabTransitionKlgxPg(selectedContentColor3, unselectedContentColor3, selected, ComposableLambdaKt.rememberComposableLambda(866677691, true, new TabKt$LeadingIconTab$1(modifier3, selected, interactionSource3, ripple, enabled3, r20, r21, r22), $composer2, 54), $composer2, (((($dirty3 >> 21) & 14) | 3072) | (($dirty3 >> 21) & 112)) | (($dirty3 << 6) & 896));
        Composer $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L139;
        ComposerKt.traceEventEnd();
    L139:
        final long selectedContentColor4 = selectedContentColor3;
        final Modifier modifier4 = modifier3;
        final MutableInteractionSource interactionSource4 = interactionSource3;
        final boolean enabled4 = enabled3;
        final long unselectedContentColor4 = unselectedContentColor3;
    L141:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L145;
        r14.updateScope(new TabKt$LeadingIconTab$2(selected, r29, r30, r31, modifier4, enabled4, interactionSource4, selectedContentColor4, unselectedContentColor4, $changed, r41));
        return;
    L145:
        return;
    L132:
        enabled3 = enabled2;
        interactionSource3 = interactionSource2;
        $dirty3 = $dirty2;
        modifier3 = modifier2;
        unselectedContentColor2 = unselectedContentColor;
        goto L133
    L128:
        selectedContentColor2 = selectedContentColor;
        goto L130
    L110:
        if ($composer2.getDefaultsInvalid() == true) goto L119;
        $composer2.skipToGroupEnd();
        if ((r41 & 128) == 0) goto L116;
        $dirty2 = $dirty2 & (-29360129);
    L116:
        if ((r41 & 256) == 0) goto L118;
        $dirty3 = $dirty2 & (-234881025);
        selectedContentColor2 = selectedContentColor;
        modifier3 = modifier2;
        enabled3 = enabled2;
        interactionSource3 = interactionSource2;
        unselectedContentColor2 = unselectedContentColor;
        goto L133
    L118:
        selectedContentColor2 = selectedContentColor;
        enabled3 = enabled2;
        interactionSource3 = interactionSource2;
        $dirty3 = $dirty2;
        modifier3 = modifier2;
        unselectedContentColor2 = unselectedContentColor;
        goto L133
    L140:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier4 = modifier2;
        enabled4 = enabled2;
        interactionSource4 = interactionSource2;
        selectedContentColor4 = selectedContentColor;
        unselectedContentColor4 = unselectedContentColor;
        goto L141
    L104:
        r1 = false;
        goto L106
    L82:
        if ((r41 & 128) != 0) goto L86;
        int $dirty4 = $dirty;
        if ($composer2.changed(selectedContentColor) == false) goto L87;
        int r15 = 8388608;
    L88:
        $dirty2 = $dirty4 | r15;
    L87:
        r15 = 4194304;
        goto L88
    L86:
        $dirty4 = $dirty;
        goto L87
    L72:
        if ((1572864 & $changed) != 0) goto L78;
        interactionSource2 = interactionSource;
        if ($composer2.changed(interactionSource2) == false) goto L76;
        int r16 = 1048576;
    L77:
        $dirty = $dirty | r16;
        goto L80
    L76:
        r16 = 524288;
        goto L77
    L78:
        interactionSource2 = interactionSource;
        goto L80
    L61:
        if ((196608 & $changed) != 0) goto L67;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L65;
        int r12 = 131072;
    L66:
        $dirty = $dirty | r12;
        goto L68
    L65:
        r12 = 65536;
        goto L66
    L67:
        enabled2 = enabled;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L56;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L54;
        int r10 = 16384;
    L55:
        $dirty = $dirty | r10;
        goto L57
    L54:
        r10 = 8192;
        goto L55
    L56:
        modifier2 = modifier;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        r6 = r31;
        if ($composer2.changedInstance(r6) == false) goto L43;
        int r8 = 2048;
    L44:
        $dirty = $dirty | r8;
        goto L46
    L43:
        r8 = 1024;
        goto L44
    L45:
        r6 = r31;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r5 = r30;
        if ($composer2.changedInstance(r5) == false) goto L32;
        int r13 = 256;
    L33:
        $dirty = $dirty | r13;
        goto L36
    L32:
        r13 = 128;
        goto L33
    L34:
        r5 = r30;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = r29;
        if ($composer2.changedInstance(r4) == false) goto L21;
        int r17 = 32;
    L22:
        $dirty = $dirty | r17;
        goto L25
    L21:
        r17 = 16;
        goto L22
    L23:
        r4 = r29;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changed(selected) == false) goto L10;
        int r18 = 4;
    L11:
        $dirty = $dirty | r18;
        goto L14
    L10:
        r18 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: Tab-EVJuX4I, reason: not valid java name */
    public static final void m1800TabEVJuX4I(final boolean selected, final Function0<Unit> r30, Modifier modifier, boolean enabled, MutableInteractionSource interactionSource, long selectedContentColor, long unselectedContentColor, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r38, Composer $composer, final int $changed, final int r41) {
        Composer $composer2 = $composer.startRestartGroup(713679175);
        ComposerKt.sourceInformation($composer2, "C(Tab)P(5,4,3,1,2,6:c#ui.graphics.Color,7:c#ui.graphics.Color)238@10598L600,238@10528L670:Tab.kt#jmzs0o");
        int $dirty = $changed;
        if ((r41 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        boolean r5 = selected;
    L14:
        if ((r41 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        int r3 = r41 & 4;
        if (r3 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L35:
        int r6 = r41 & 8;
        if (r6 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L46:
        int r9 = r41 & 16;
        if (r9 == 0) goto L50;
        $dirty = $dirty | 24576;
        MutableInteractionSource interactionSource2 = interactionSource;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        long r13 = selectedContentColor;
    L69:
        if ((1572864 & $changed) == 0) goto L71;
        int $dirty2 = $dirty;
    L80:
        if ((r41 & 128) == 0) goto L83;
        $dirty2 = $dirty2 | 12582912;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r15 = r38;
    L91:
        if (($dirty2 & 4793491) == 4793490) goto L93;
        boolean r0 = true;
    L95:
        if ($composer2.shouldExecute(r0, $dirty2 & 1) == false) goto L129;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "229@10084L7,230@10176L6");
        if (($changed & 1) != 0) goto L99;
    L108:
        if (r3 == 0) goto L110;
        modifier2 = Modifier.Companion;
    L110:
        if (r6 == 0) goto L112;
        enabled2 = true;
    L112:
        if (r9 == 0) goto L115;
        interactionSource2 = null;
    L115:
        if ((r41 & 32) == 0) goto L117;
        ProvidableCompositionLocal<Color> r1 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r2 = $composer2.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $dirty2 = $dirty2 & (-458753);
        long selectedContentColor2 = ((Color) r2).m4376unboximpl();
    L119:
        if ((r41 & 64) == 0) goto L121;
        int r4 = $dirty2 & (-3670017);
        final Modifier modifier3 = modifier2;
        final boolean enabled3 = enabled2;
        final MutableInteractionSource interactionSource3 = interactionSource2;
        int $dirty3 = r4;
        long unselectedContentColor2 = Color.m4365copywmQWz5c$default(selectedContentColor2, ContentAlpha.INSTANCE.getMedium($composer2, 6), 0.0f, 0.0f, 0.0f, 14, null);
    L122:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L125;
        ComposerKt.traceEventStart(713679175, $dirty3, -1, "androidx.compose.material.Tab (Tab.kt:232)");
    L125:
        long selectedContentColor3 = selectedContentColor2;
        final IndicationNodeFactory ripple = RippleKt.m1746rippleH2RKhps$default(true, 0.0f, selectedContentColor3, 2, null);
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r20 = r15;
        final boolean r16 = r5;
        m1801TabTransitionKlgxPg(selectedContentColor3, unselectedContentColor2, selected, ComposableLambdaKt.rememberComposableLambda(-1237246709, true, new TabKt$Tab$3(modifier3, r16, interactionSource3, ripple, enabled3, r30, r20), $composer2, 54), $composer2, (((($dirty3 >> 15) & 14) | 3072) | (($dirty3 >> 15) & 112)) | (($dirty3 << 6) & 896));
        Composer $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L128;
        ComposerKt.traceEventEnd();
    L128:
        final long selectedContentColor4 = selectedContentColor3;
        final MutableInteractionSource interactionSource4 = interactionSource3;
        final long selectedContentColor5 = unselectedContentColor2;
        final Modifier modifier4 = modifier3;
        final boolean enabled4 = enabled3;
    L130:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L134;
        r14.updateScope(new TabKt$Tab$4(selected, r30, modifier4, enabled4, interactionSource4, selectedContentColor4, selectedContentColor5, r38, $changed, r41));
        return;
    L134:
        return;
    L121:
        modifier3 = modifier2;
        enabled3 = enabled2;
        $dirty3 = $dirty2;
        unselectedContentColor2 = unselectedContentColor;
        interactionSource3 = interactionSource2;
        goto L122
    L117:
        selectedContentColor2 = r13;
        goto L119
    L99:
        if ($composer2.getDefaultsInvalid() == true) goto L108;
        $composer2.skipToGroupEnd();
        if ((r41 & 32) == 0) goto L105;
        $dirty2 = $dirty2 & (-458753);
    L105:
        if ((r41 & 64) == 0) goto L107;
        $dirty3 = $dirty2 & (-3670017);
        enabled3 = enabled2;
        interactionSource3 = interactionSource2;
        selectedContentColor2 = r13;
        modifier3 = modifier2;
        unselectedContentColor2 = unselectedContentColor;
        goto L122
    L107:
        enabled3 = enabled2;
        selectedContentColor2 = r13;
        $dirty3 = $dirty2;
        modifier3 = modifier2;
        interactionSource3 = interactionSource2;
        unselectedContentColor2 = unselectedContentColor;
        goto L122
    L129:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier4 = modifier2;
        enabled4 = enabled2;
        interactionSource4 = interactionSource2;
        selectedContentColor4 = r13;
        selectedContentColor5 = unselectedContentColor;
        goto L130
    L93:
        r0 = false;
        goto L95
    L83:
        if (($changed & 12582912) != 0) goto L89;
        r15 = r38;
        if ($composer2.changedInstance(r15) == false) goto L87;
        int r17 = 8388608;
    L88:
        $dirty2 = $dirty2 | r17;
        goto L91
    L87:
        r17 = 4194304;
        goto L88
    L89:
        r15 = r38;
        goto L91
    L71:
        if ((r41 & 64) != 0) goto L75;
        int $dirty4 = $dirty;
        if ($composer2.changed(unselectedContentColor) == false) goto L76;
        int r18 = 1048576;
    L77:
        $dirty2 = $dirty4 | r18;
    L76:
        r18 = 524288;
        goto L77
    L75:
        $dirty4 = $dirty;
        goto L76
    L60:
        if ((r41 & 32) != 0) goto L64;
        r13 = selectedContentColor;
        if ($composer2.changed(r13) == false) goto L65;
        int r19 = 131072;
    L66:
        $dirty = $dirty | r19;
    L65:
        r19 = 65536;
        goto L66
    L64:
        r13 = selectedContentColor;
        goto L65
    L50:
        if (($changed & 24576) != 0) goto L56;
        interactionSource2 = interactionSource;
        if ($composer2.changed(interactionSource2) == false) goto L54;
        int r110 = 16384;
    L55:
        $dirty = $dirty | r110;
        goto L58
    L54:
        r110 = 8192;
        goto L55
    L56:
        interactionSource2 = interactionSource;
        goto L58
    L39:
        if (($changed & 3072) != 0) goto L45;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L43;
        int r10 = 2048;
    L44:
        $dirty = $dirty | r10;
        goto L46
    L43:
        r10 = 1024;
        goto L44
    L45:
        enabled2 = enabled;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L32;
        int r7 = 256;
    L33:
        $dirty = $dirty | r7;
        goto L35
    L32:
        r7 = 128;
        goto L33
    L34:
        modifier2 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changedInstance(r30) == false) goto L21;
        int r8 = 32;
    L22:
        $dirty = $dirty | r8;
        goto L24
    L21:
        r8 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r5 = selected;
        if ($composer2.changed(r5) == false) goto L10;
        int r11 = 4;
    L11:
        $dirty = $dirty | r11;
        goto L14
    L10:
        r11 = 2;
        goto L11
    L12:
        r5 = selected;
        goto L14
    }

    /* JADX INFO: renamed from: TabTransition-Klgx-Pg, reason: not valid java name */
    private static final void m1801TabTransitionKlgxPg(long activeColor, final long inactiveColor, final boolean selected, final Function2<? super Composer, ? super Integer, Unit> r38, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-405571117);
        ComposerKt.sourceInformation($composer2, "C(TabTransition)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color,3)270@11629L26,272@11692L548,287@12245L164:Tab.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L9;
        long r4 = activeColor;
        if ($composer2.changed(r4) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
    L11:
        if (($changed & 48) != 0) goto L17;
        long r8 = inactiveColor;
        if ($composer2.changed(r8) == false) goto L15;
        int r3 = 32;
    L16:
        $dirty = $dirty | r3;
    L19:
        if (($changed & 384) != 0) goto L25;
        boolean r5 = selected;
        if ($composer2.changed(r5) == false) goto L23;
        int r10 = 256;
    L24:
        $dirty = $dirty | r10;
    L27:
        if (($changed & 3072) != 0) goto L34;
        if ($composer2.changedInstance(r38) == false) goto L31;
        int r11 = 2048;
    L32:
        $dirty = $dirty | r11;
        goto L34
    L31:
        r11 = 1024;
    L34:
        if (($dirty & 1171) == 1170) goto L36;
        boolean r12 = true;
    L38:
        if ($composer2.shouldExecute(r12, $dirty & 1) == true) goto L40;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L83:
        ScopeUpdateScope r9 = $composer3.endRestartGroup();
        if (r9 == null) goto L87;
        final long r1 = r4;
        r9.updateScope(new TabKt$TabTransition$1(r1, inactiveColor, selected, r38, $changed));
        return;
    L87:
        return;
    L40:
        if (ComposerKt.isTraceInProgress() == false) goto L42;
        ComposerKt.traceEventStart(-405571117, $dirty, -1, "androidx.compose.material.TabTransition (Tab.kt:269)");
    L42:
        Transition transition = TransitionKt.updateTransition(Boolean.valueOf(r5), null, $composer2, ($dirty >> 6) & 14, 2);
        Function3 transitionSpec$iv = TabKt$TabTransition$color$2.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
        int $changed2 = (0 >> 6) & 112;
        boolean it = ((Boolean) transition.getTargetState()).booleanValue();
        $composer2.startReplaceGroup(1445938070);
        ComposerKt.sourceInformation($composer2, "C:Tab.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L46;
        ComposerKt.traceEventStart(1445938070, $changed2, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:285)");
    L46:
        if (it == false) goto L48;
        long r6 = r4;
    L50:
        if (ComposerKt.isTraceInProgress() == false) goto L52;
        ComposerKt.traceEventEnd();
    L52:
        $composer2.endReplaceGroup();
        ColorSpace colorSpace$iv = Color.m4370getColorSpaceimpl(r6);
        ComposerKt.sourceInformationMarkerStart($composer2, 1918408083, "CC(remember):Transition.kt#9igjgp");
        boolean invalid$iv$iv = $composer2.changed(colorSpace$iv);
        Object it$iv$iv = $composer2.rememberedValue();
        if (invalid$iv$iv == true) goto L59;
        if (it$iv$iv == Composer.Companion.getEmpty()) goto L59;
        Object value$iv$iv = it$iv$iv;
    L60:
        TwoWayConverter typeConverter$iv = (TwoWayConverter) value$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        int $changed$iv$iv = (((0 & 14) | ((0 << 3) & 896)) | ((0 << 3) & 7168)) | ((0 << 3) & 57344);
        ComposerKt.sourceInformationMarkerStart($composer2, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
        int $changed3 = ($changed$iv$iv >> 9) & 112;
        boolean it2 = ((Boolean) transition.getCurrentState()).booleanValue();
        $composer2.startReplaceGroup(1445938070);
        ComposerKt.sourceInformation($composer2, "C:Tab.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L64;
        ComposerKt.traceEventStart(1445938070, $changed3, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:285)");
    L64:
        if (it2 == false) goto L66;
        long r7 = r4;
    L68:
        if (ComposerKt.isTraceInProgress() == false) goto L70;
        ComposerKt.traceEventEnd();
    L70:
        $composer2.endReplaceGroup();
        Object initialValue$iv$iv = Color.m4356boximpl(r7);
        int $changed4 = ($changed$iv$iv >> 9) & 112;
        boolean it3 = ((Boolean) transition.getTargetState()).booleanValue();
        $composer2.startReplaceGroup(1445938070);
        ComposerKt.sourceInformation($composer2, "C:Tab.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L73;
        ComposerKt.traceEventStart(1445938070, $changed4, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:285)");
    L73:
        if (it3 == false) goto L75;
        long r0 = r4;
    L77:
        if (ComposerKt.isTraceInProgress() == false) goto L79;
        ComposerKt.traceEventEnd();
    L79:
        $composer2.endReplaceGroup();
        Object targetValue$iv$iv = Color.m4356boximpl(r0);
        State color$delegate = TransitionKt.createTransitionAnimation(transition, initialValue$iv$iv, targetValue$iv$iv, transitionSpec$iv.invoke(transition.getSegment(), $composer2, Integer.valueOf(($changed$iv$iv >> 3) & 112)), typeConverter$iv, "ColorAnimation", $composer2, (($changed$iv$iv & 14) | (($changed$iv$iv << 9) & 57344)) | (($changed$iv$iv << 6) & 458752));
        $composer3 = $composer2;
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4356boximpl(Color.m4365copywmQWz5c$default(TabTransition_Klgx_Pg$lambda$2(color$delegate), 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m4368getAlphaimpl(TabTransition_Klgx_Pg$lambda$2(color$delegate))))}, r38, $composer3, ProvidedValue.$stable | (($dirty >> 6) & 112));
        if (ComposerKt.isTraceInProgress() == false) goto L83;
        ComposerKt.traceEventEnd();
        goto L83
    L75:
        r0 = inactiveColor;
        goto L77
    L66:
        r7 = inactiveColor;
    L59:
        value$iv$iv = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpace$iv);
        $composer2.updateRememberedValue(value$iv$iv);
        goto L60
    L48:
        r6 = r8;
        goto L50
    L36:
        r12 = false;
        goto L38
    L23:
        r10 = 128;
        goto L24
    L25:
        r5 = selected;
        goto L27
    L15:
        r3 = 16;
        goto L16
    L17:
        r8 = inactiveColor;
        goto L19
    L7:
        r2 = 2;
        goto L8
    L9:
        r4 = activeColor;
        goto L11
    }

    private static final long TabTransition_Klgx_Pg$lambda$2(State<Color> r4) {
        return r4.getValue().m4376unboximpl();
    }

    private static final void TabBaselineLayout(final Function2<? super Composer, ? super Integer, Unit> r50, final Function2<? super Composer, ? super Integer, Unit> r51, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1249848471);
        ComposerKt.sourceInformation($composer2, "C(TabBaselineLayout)P(1)308@13051L1802,301@12807L2046:Tab.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r50) == false) goto L7;
        int r6 = 4;
    L8:
        $dirty = $dirty | r6;
        goto L10
    L7:
        r6 = 2;
    L10:
        if (($changed & 48) == 0) goto L12;
    L16:
        boolean r11 = true;
        if (($dirty & 19) == 18) goto L19;
        boolean r7 = true;
    L21:
        if ($composer2.shouldExecute(r7, $dirty & 1) == true) goto L23;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L96:
        ScopeUpdateScope r3 = $composer3.endRestartGroup();
        if (r3 == null) goto L100;
        r3.updateScope(new AnonymousClass3(r50, r51, $changed));
        return;
    L100:
        return;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(1249848471, $dirty, -1, "androidx.compose.material.TabBaselineLayout (Tab.kt:300)");
    L25:
        ComposerKt.sourceInformationMarkerStart($composer2, 1014676616, "CC(remember):Tab.kt#9igjgp");
        if (($dirty & 14) != 4) goto L28;
        boolean r4 = true;
    L30:
        if (($dirty & 112) == 32) goto L33;
        r11 = false;
    L33:
        boolean invalid$iv = r4 | r11;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L36;
    L39:
        Object value$iv = (MeasurePolicy) new TabKt$TabBaselineLayout$2$1(r50, r51);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L40:
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
        if (($composer2.getApplier() instanceof Applier) == true) goto L43;
        ComposablesKt.invalidApplier();
    L43:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L46;
        Function0<ComposeUiNode> r8 = r16;
        $composer2.createNode(r8);
    L47:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer2);
        $composer3 = $composer2;
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L53;
        int $dirty2 = $dirty;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == true) goto L55;
    L54:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r5);
    L55:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        int r9 = ($changed$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -238665717, "C:Tab.kt#jmzs0o");
        if (r50 == null) goto L73;
        $composer3.startReplaceGroup(-238651272);
        ComposerKt.sourceInformation($composer3, "303@12856L85");
        Modifier modifier$iv2 = PaddingKt.m727paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "text"), HorizontalTextPadding, 0.0f, 2, null);
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
        if (($composer3.getApplier() instanceof Applier) == true) goto L60;
        ComposablesKt.invalidApplier();
    L60:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L63;
        Function0<ComposeUiNode> r10 = r37;
        $composer3.createNode(r10);
    L64:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r12 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L71;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L71;
    L72:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r13 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r14 = BoxScopeInstance.INSTANCE;
        int r41 = ((6 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, 138878465, "C303@12933L6:Tab.kt#jmzs0o");
        r50.invoke($composer3, Integer.valueOf($dirty2 & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endReplaceGroup();
    L74:
        if (r51 == null) goto L91;
        $composer3.startReplaceGroup(-238517724);
        ComposerKt.sourceInformation($composer3, "306@12992L41");
        Modifier modifier$iv3 = LayoutIdKt.layoutId(Modifier.Companion, "icon");
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv2 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
        int $changed$iv$iv3 = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer3, modifier$iv3);
        Function0<ComposeUiNode> r18 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv3 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L78;
        ComposablesKt.invalidApplier();
    L78:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L81;
        Function0<ComposeUiNode> r15 = r18;
        $composer3.createNode(r15);
    L82:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r17 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L88;
        int $changed$iv = 6;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == true) goto L90;
    L89:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r17);
    L90:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r19 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r20 = BoxScopeInstance.INSTANCE;
        int r21 = (($changed$iv >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, 138969729, "C306@13025L6:Tab.kt#jmzs0o");
        r51.invoke($composer3, Integer.valueOf(($dirty2 >> 3) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endReplaceGroup();
    L92:
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L96;
        ComposerKt.traceEventEnd();
        goto L96
    L88:
        $changed$iv = 6;
        goto L89
    L81:
        r15 = r18;
        $composer3.useNode();
        goto L82
    L91:
        $composer3.startReplaceGroup(-238455259);
        $composer3.endReplaceGroup();
    L71:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r12);
        goto L72
    L63:
        r10 = r37;
        $composer3.useNode();
        goto L64
    L73:
        $composer3.startReplaceGroup(-238546523);
        $composer3.endReplaceGroup();
        goto L74
    L53:
        $dirty2 = $dirty;
        goto L54
    L46:
        r8 = r16;
        $composer2.useNode();
        goto L47
    L36:
        if (it$iv != Composer.Companion.getEmpty()) goto L40;
    L28:
        r4 = false;
        goto L30
    L19:
        r7 = false;
        goto L21
    L12:
        if ($composer2.changedInstance(r51) == false) goto L14;
        int r22 = 32;
    L15:
        $dirty = $dirty | r22;
        goto L16
    L14:
        r22 = 16;
        goto L15
    }

    private static final void placeTextOrIcon(Placeable.PlacementScope $this$placeTextOrIcon, Placeable textOrIconPlaceable, int tabHeight) {
        int contentY = (tabHeight - textOrIconPlaceable.getHeight()) / 2;
        Placeable.PlacementScope.placeRelative$default($this$placeTextOrIcon, textOrIconPlaceable, 0, contentY, 0.0f, 4, null);
    }

    private static final void placeTextAndIcon(Placeable.PlacementScope $this$placeTextAndIcon, Density density, Placeable textPlaceable, Placeable iconPlaceable, int tabWidth, int tabHeight, int firstBaseline, int lastBaseline) {
        if (firstBaseline != lastBaseline) goto L5;
        float baselineOffset = SingleLineTextBaselineWithIcon;
    L6:
        int textOffset = density.mo370roundToPx0680j_4(baselineOffset) + density.mo370roundToPx0680j_4(TabRowDefaults.INSTANCE.m1809getIndicatorHeightD9Ej5fM());
        int iconOffset = (iconPlaceable.getHeight() + density.mo369roundToPxR2X_6o(IconDistanceFromBaseline)) - firstBaseline;
        int textPlaceableX = (tabWidth - textPlaceable.getWidth()) / 2;
        int textPlaceableY = (tabHeight - lastBaseline) - textOffset;
        Placeable.PlacementScope.placeRelative$default($this$placeTextAndIcon, textPlaceable, textPlaceableX, textPlaceableY, 0.0f, 4, null);
        int iconPlaceableX = (tabWidth - iconPlaceable.getWidth()) / 2;
        int iconPlaceableY = textPlaceableY - iconOffset;
        Placeable.PlacementScope.placeRelative$default($this$placeTextAndIcon, iconPlaceable, iconPlaceableX, iconPlaceableY, 0.0f, 4, null);
        return;
    L5:
        baselineOffset = DoubleLineTextBaselineWithIcon;
        goto L6
    }

    static {
        SmallTabHeight = Dp.m6973constructorimpl(48);
        LargeTabHeight = Dp.m6973constructorimpl(72);
        HorizontalTextPadding = Dp.m6973constructorimpl(16);
        SingleLineTextBaselineWithIcon = Dp.m6973constructorimpl(14);
        DoubleLineTextBaselineWithIcon = Dp.m6973constructorimpl(6);
        IconDistanceFromBaseline = TextUnitKt.getSp(20);
        TextDistanceFromLeadingIcon = Dp.m6973constructorimpl(8);
    }
}
