package androidx.compose.material3;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
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
@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0082\u0001\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00120\u0016¢\u0006\u0002\b\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00120\u0016¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u008a\u0001\u0010$\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00142\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0016¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0016¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001az\u0010$\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\u001c\u0010'\u001a\u0018\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120(¢\u0006\u0002\b\u0018¢\u0006\u0002\b*H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a7\u0010-\u001a\u00020\u00122\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0016¢\u0006\u0002\b\u00182\u0013\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0016¢\u0006\u0002\b\u0018H\u0003¢\u0006\u0002\u0010.\u001a=\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u00142\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020\u00120\u0016¢\u0006\u0002\b\u0018H\u0003ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001aD\u00104\u001a\u00020\u0012*\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\r2\u0006\u0010<\u001a\u00020\r2\u0006\u0010=\u001a\u00020\r2\u0006\u0010>\u001a\u00020\rH\u0002\u001a\u001c\u0010?\u001a\u00020\u0012*\u0002052\u0006\u0010@\u001a\u0002092\u0006\u0010<\u001a\u00020\rH\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0016\u0010\u0003\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u0004\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b\"\u0010\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0010\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A²\u0006\n\u0010B\u001a\u00020\u001eX\u008a\u0084\u0002"}, d2 = {"DoubleLineTextBaselineWithIcon", "Landroidx/compose/ui/unit/Dp;", "F", "HorizontalTextPadding", "getHorizontalTextPadding", "()F", "IconDistanceFromBaseline", "Landroidx/compose/ui/unit/TextUnit;", "J", "LargeTabHeight", "SingleLineTextBaselineWithIcon", "SmallTabHeight", "TabFadeInAnimationDelay", "", "TabFadeInAnimationDuration", "TabFadeOutAnimationDuration", "TextDistanceFromLeadingIcon", "LeadingIconTab", "", "selected", "", "onClick", "Lkotlin/Function0;", "text", "Landroidx/compose/runtime/Composable;", "icon", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "selectedContentColor", "Landroidx/compose/ui/graphics/Color;", "unselectedContentColor", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "LeadingIconTab-wqdebIU", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Tab", "Tab-wqdebIU", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "Tab-bogVsAg", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TabBaselineLayout", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TabTransition", "activeColor", "inactiveColor", "TabTransition-Klgx-Pg", "(JJZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "placeTextAndIcon", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "density", "Landroidx/compose/ui/unit/Density;", "textPlaceable", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "tabWidth", "tabHeight", "firstBaseline", "lastBaseline", "placeTextOrIcon", "textOrIconPlaceable", "material3_release", "color"}, k = 2, mv = {1, 8, 0}, xi = 48)
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
    public static final /* synthetic */ void m2708access$TabTransitionKlgxPg(long activeColor, long inactiveColor, boolean selected, Function2 content, Composer $composer, int $changed) {
        m2707TabTransitionKlgxPg(activeColor, inactiveColor, selected, content, $composer, $changed);
    }

    public static final /* synthetic */ long access$getIconDistanceFromBaseline$p() {
        return IconDistanceFromBaseline;
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

    /* JADX INFO: renamed from: Tab-wqdebIU, reason: not valid java name */
    public static final void m2706TabwqdebIU(final boolean selected, final Function0<Unit> r28, Modifier modifier, boolean enabled, Function2<? super Composer, ? super Integer, Unit> r31, Function2<? super Composer, ? super Integer, Unit> r32, long selectedContentColor, long unselectedContentColor, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int r40) {
        Composer $composer2 = $composer.startRestartGroup(-350627181);
        ComposerKt.sourceInformation($composer2, "C(Tab)P(5,4,3!1,7!1,6:c#ui.graphics.Color,8:c#ui.graphics.Color)99@4483L7,121@5133L65,113@4964L234:Tab.kt#uh7d8r");
        int $dirty = $changed;
        if ((r40 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        boolean r14 = selected;
    L14:
        if ((r40 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function0<Unit> r15 = r28;
    L24:
        int r3 = r40 & 4;
        if (r3 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L35:
        int r5 = r40 & 8;
        if (r5 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L46:
        int r7 = r40 & 16;
        if (r7 == 0) goto L50;
        $dirty = $dirty | 24576;
        final Function2<? super Composer, ? super Integer, Unit> r8 = r31;
    L57:
        int r9 = r40 & 32;
        if (r9 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        final Function2<? super Composer, ? super Integer, Unit> r10 = r32;
    L69:
        if ((1572864 & $changed) == 0) goto L71;
        int $dirty2 = $dirty;
        int r38 = r3;
    L80:
        if (($changed & 12582912) != 0) goto L90;
        if ((r40 & 128) != 0) goto L87;
        if ($composer2.changed(unselectedContentColor) == false) goto L87;
        int r0 = 8388608;
    L88:
        $dirty2 = $dirty2 | r0;
    L87:
        r0 = 4194304;
    L90:
        int r1 = r40 & 256;
        if (r1 == 0) goto L94;
        $dirty2 = $dirty2 | 100663296;
    L102:
        if (($dirty2 & 38347923) == 38347922) goto L104;
    L107:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L110;
    L119:
        if (r38 == 0) goto L121;
        modifier2 = Modifier.Companion;
    L121:
        if (r5 == 0) goto L123;
        enabled2 = true;
    L123:
        if (r7 == 0) goto L125;
        r8 = null;
    L125:
        if (r9 == 0) goto L128;
        r10 = null;
    L128:
        if ((r40 & 64) == 0) goto L130;
        ProvidableCompositionLocal<Color> r2 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r4 = $composer2.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        long selectedContentColor2 = ((Color) r4).m4376unboximpl();
        $dirty2 = $dirty2 & (-3670017);
    L132:
        if ((r40 & 128) == 0) goto L134;
        long unselectedContentColor2 = selectedContentColor2;
        $dirty2 = $dirty2 & (-29360129);
    L135:
        if (r1 == 0) goto L137;
        MutableInteractionSource interactionSource2 = null;
        boolean enabled3 = enabled2;
        long selectedContentColor3 = selectedContentColor2;
        int r6 = -350627181;
        long unselectedContentColor3 = unselectedContentColor2;
    L138:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L141;
        ComposerKt.traceEventStart(r6, $dirty2, -1, "androidx.compose.material3.Tab (Tab.kt:102)");
    L141:
        $composer2.startReplaceGroup(79583089);
        ComposerKt.sourceInformation($composer2, "*105@4702L247");
        if (r8 != null) goto L144;
        final Function2 styledText = null;
    L145:
        $composer2.endReplaceGroup();
        Composer $composer3 = $composer2;
        Modifier modifier3 = modifier2;
        m2705TabbogVsAg(r14, r15, modifier3, enabled3, selectedContentColor3, unselectedContentColor3, interactionSource2, ComposableLambdaKt.rememberComposableLambda(1540996038, true, new TabKt$Tab$1(styledText, r10), $composer2, 54), $composer3, ((((((($dirty2 & 14) | 12582912) | ($dirty2 & 112)) | ($dirty2 & 896)) | ($dirty2 & 7168)) | (($dirty2 >> 6) & 57344)) | (($dirty2 >> 6) & 458752)) | (3670016 & ($dirty2 >> 6)), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L148;
        ComposerKt.traceEventEnd();
    L148:
        final Function2<? super Composer, ? super Integer, Unit> r11 = r8;
        final Function2<? super Composer, ? super Integer, Unit> r12 = r10;
        final Modifier modifier4 = modifier3;
        final boolean enabled4 = enabled3;
        final long selectedContentColor4 = selectedContentColor3;
        final long unselectedContentColor4 = unselectedContentColor3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
    L149:
        ScopeUpdateScope r16 = $composer3.endRestartGroup();
        if (r16 == null) goto L153;
        r16.updateScope(new TabKt$Tab$2(selected, r28, modifier4, enabled4, r11, r12, selectedContentColor4, unselectedContentColor4, interactionSource3, $changed, r40));
        return;
    L153:
        return;
    L144:
        Function2 it = ComposableLambdaKt.rememberComposableLambda(708874428, true, new TabKt$Tab$styledText$1$1(r8), $composer2, 54);
        styledText = it;
        goto L145
    L137:
        interactionSource2 = interactionSource;
        enabled3 = enabled2;
        selectedContentColor3 = selectedContentColor2;
        r6 = -350627181;
        unselectedContentColor3 = unselectedContentColor2;
        goto L138
    L134:
        unselectedContentColor2 = unselectedContentColor;
        goto L135
    L130:
        selectedContentColor2 = selectedContentColor;
        goto L132
    L110:
        if ($composer2.getDefaultsInvalid() == true) goto L119;
        $composer2.skipToGroupEnd();
        if ((r40 & 64) == 0) goto L116;
        $dirty2 = $dirty2 & (-3670017);
    L116:
        if ((r40 & 128) == 0) goto L118;
        selectedContentColor3 = selectedContentColor;
        unselectedContentColor3 = unselectedContentColor;
        interactionSource2 = interactionSource;
        $dirty2 = $dirty2 & (-29360129);
        enabled3 = enabled2;
        r6 = -350627181;
        goto L138
    L118:
        selectedContentColor3 = selectedContentColor;
        unselectedContentColor3 = unselectedContentColor;
        interactionSource2 = interactionSource;
        enabled3 = enabled2;
        r6 = -350627181;
        goto L138
    L104:
        if ($composer2.getSkipping() == false) goto L107;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier4 = modifier2;
        enabled4 = enabled2;
        r11 = r8;
        r12 = r10;
        selectedContentColor4 = selectedContentColor;
        unselectedContentColor4 = unselectedContentColor;
        interactionSource3 = interactionSource;
        goto L149
    L94:
        if (($changed & 100663296) != 0) goto L102;
        if ($composer2.changed(interactionSource) == false) goto L98;
        int r19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty2 = $dirty2 | r19;
        goto L102
    L98:
        r19 = 33554432;
        goto L99
    L71:
        if ((r40 & 64) != 0) goto L75;
        int $dirty3 = $dirty;
        r38 = r3;
        if ($composer2.changed(selectedContentColor) == false) goto L76;
        int r17 = 1048576;
    L77:
        $dirty2 = $dirty3 | r17;
    L76:
        r17 = 524288;
        goto L77
    L75:
        $dirty3 = $dirty;
        r38 = r3;
        goto L76
    L61:
        if ((196608 & $changed) != 0) goto L67;
        r10 = r32;
        if ($composer2.changedInstance(r10) == false) goto L65;
        int r13 = 131072;
    L66:
        $dirty = $dirty | r13;
        goto L69
    L65:
        r13 = 65536;
        goto L66
    L67:
        r10 = r32;
        goto L69
    L50:
        if (($changed & 24576) != 0) goto L56;
        r8 = r31;
        if ($composer2.changedInstance(r8) == false) goto L54;
        int r18 = 16384;
    L55:
        $dirty = $dirty | r18;
        goto L57
    L54:
        r18 = 8192;
        goto L55
    L56:
        r8 = r31;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L43;
        int r20 = 2048;
    L44:
        $dirty = $dirty | r20;
        goto L46
    L43:
        r20 = 1024;
        goto L44
    L45:
        enabled2 = enabled;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L32;
        int r21 = 256;
    L33:
        $dirty = $dirty | r21;
        goto L35
    L32:
        r21 = 128;
        goto L33
    L34:
        modifier2 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r15 = r28;
        if ($composer2.changedInstance(r15) == false) goto L21;
        int r22 = 32;
    L22:
        $dirty = $dirty | r22;
        goto L24
    L21:
        r22 = 16;
        goto L22
    L23:
        r15 = r28;
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

    /* JADX INFO: renamed from: LeadingIconTab-wqdebIU, reason: not valid java name */
    public static final void m2704LeadingIconTabwqdebIU(final boolean selected, final Function0<Unit> r26, final Function2<? super Composer, ? super Integer, Unit> r27, final Function2<? super Composer, ? super Integer, Unit> r28, Modifier modifier, boolean enabled, long selectedContentColor, long unselectedContentColor, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int r38) {
        Composer $composer2 = $composer.startRestartGroup(-777316544);
        ComposerKt.sourceInformation($composer2, "C(LeadingIconTab)P(5,4,7,1,3!1,6:c#ui.graphics.Color,8:c#ui.graphics.Color)164@7036L7,171@7399L76,173@7551L950,173@7481L1020:Tab.kt#uh7d8r");
        int $dirty = $changed;
        if ((r38 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r38 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function0<Unit> r4 = r26;
    L25:
        if ((r38 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
        Function2<? super Composer, ? super Integer, Unit> r5 = r27;
    L36:
        if ((r38 & 8) == 0) goto L39;
        $dirty = $dirty | 3072;
        Function2<? super Composer, ? super Integer, Unit> r6 = r28;
    L46:
        int r7 = r38 & 16;
        if (r7 == 0) goto L50;
        $dirty = $dirty | 24576;
        Modifier modifier2 = modifier;
    L57:
        int r9 = r38 & 32;
        if (r9 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        boolean enabled2 = enabled;
    L69:
        if ((1572864 & $changed) == 0) goto L71;
        long r14 = selectedContentColor;
    L80:
        if ((12582912 & $changed) == 0) goto L82;
        int $dirty2 = $dirty;
    L90:
        int r0 = r38 & 256;
        if (r0 == 0) goto L94;
        $dirty2 = $dirty2 | 100663296;
    L102:
        if (($dirty2 & 38347923) == 38347922) goto L104;
    L107:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L110;
    L119:
        if (r7 == 0) goto L121;
        modifier2 = Modifier.Companion;
    L121:
        if (r9 == 0) goto L124;
        enabled2 = true;
    L124:
        if ((r38 & 64) == 0) goto L126;
        ProvidableCompositionLocal<Color> r1 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r2 = $composer2.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        long selectedContentColor2 = ((Color) r2).m4376unboximpl();
        $dirty2 = $dirty2 & (-3670017);
    L128:
        if ((r38 & 128) == 0) goto L130;
        long unselectedContentColor2 = selectedContentColor2;
        $dirty2 = $dirty2 & (-29360129);
    L131:
        if (r0 == 0) goto L133;
        final Modifier modifier3 = modifier2;
        long unselectedContentColor3 = unselectedContentColor2;
        final MutableInteractionSource interactionSource2 = null;
        final boolean enabled3 = enabled2;
    L134:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L137;
        ComposerKt.traceEventStart(-777316544, $dirty2, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:167)");
    L137:
        final Indication ripple = RippleKt.m2534rippleOrFallbackImplementation9IZ8Weo(true, 0.0f, selectedContentColor2, $composer2, (($dirty2 >> 12) & 896) | 6, 2);
        final Function0<Unit> r20 = r4;
        final Function2<? super Composer, ? super Integer, Unit> r22 = r5;
        final Function2<? super Composer, ? super Integer, Unit> r21 = r6;
        long unselectedContentColor4 = unselectedContentColor3;
        m2707TabTransitionKlgxPg(selectedContentColor2, unselectedContentColor4, selected, ComposableLambdaKt.rememberComposableLambda(-429037564, true, new TabKt$LeadingIconTab$1(modifier3, selected, interactionSource2, ripple, enabled3, r20, r21, r22), $composer2, 54), $composer2, (((($dirty2 >> 18) & 14) | 3072) | (($dirty2 >> 18) & 112)) | (($dirty2 << 6) & 896));
        Composer $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L140;
        ComposerKt.traceEventEnd();
    L140:
        final long unselectedContentColor5 = unselectedContentColor4;
        final long selectedContentColor3 = selectedContentColor2;
        final Modifier modifier4 = modifier3;
        final boolean enabled4 = enabled3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
    L141:
        ScopeUpdateScope r3 = $composer3.endRestartGroup();
        if (r3 == null) goto L145;
        r3.updateScope(new TabKt$LeadingIconTab$2(selected, r26, r27, r28, modifier4, enabled4, selectedContentColor3, unselectedContentColor5, interactionSource3, $changed, r38));
        return;
    L145:
        return;
    L133:
        modifier3 = modifier2;
        unselectedContentColor3 = unselectedContentColor2;
        interactionSource2 = interactionSource;
        enabled3 = enabled2;
        goto L134
    L130:
        unselectedContentColor2 = unselectedContentColor;
        goto L131
    L126:
        selectedContentColor2 = r14;
        goto L128
    L110:
        if ($composer2.getDefaultsInvalid() == true) goto L119;
        $composer2.skipToGroupEnd();
        if ((r38 & 64) == 0) goto L116;
        $dirty2 = $dirty2 & (-3670017);
    L116:
        if ((r38 & 128) == 0) goto L118;
        interactionSource2 = interactionSource;
        $dirty2 = $dirty2 & (-29360129);
        enabled3 = enabled2;
        selectedContentColor2 = r14;
        modifier3 = modifier2;
        unselectedContentColor3 = unselectedContentColor;
        goto L134
    L118:
        interactionSource2 = interactionSource;
        enabled3 = enabled2;
        selectedContentColor2 = r14;
        modifier3 = modifier2;
        unselectedContentColor3 = unselectedContentColor;
        goto L134
    L104:
        if ($composer2.getSkipping() == false) goto L107;
        $composer2.skipToGroupEnd();
        modifier4 = modifier2;
        enabled4 = enabled2;
        selectedContentColor3 = r14;
        unselectedContentColor5 = unselectedContentColor;
        $composer3 = $composer2;
        interactionSource3 = interactionSource;
        goto L141
    L94:
        if (($changed & 100663296) != 0) goto L102;
        if ($composer2.changed(interactionSource) == false) goto L98;
        int r18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty2 = $dirty2 | r18;
        goto L102
    L98:
        r18 = 33554432;
        goto L99
    L82:
        if ((r38 & 128) != 0) goto L86;
        int $dirty3 = $dirty;
        if ($composer2.changed(unselectedContentColor) == false) goto L87;
        int r11 = 8388608;
    L88:
        $dirty2 = $dirty3 | r11;
    L87:
        r11 = 4194304;
        goto L88
    L86:
        $dirty3 = $dirty;
        goto L87
    L71:
        if ((r38 & 64) != 0) goto L75;
        r14 = selectedContentColor;
        if ($composer2.changed(r14) == false) goto L76;
        int r12 = 1048576;
    L77:
        $dirty = $dirty | r12;
    L76:
        r12 = 524288;
        goto L77
    L75:
        r14 = selectedContentColor;
        goto L76
    L61:
        if ((196608 & $changed) != 0) goto L67;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L65;
        int r13 = 131072;
    L66:
        $dirty = $dirty | r13;
        goto L69
    L65:
        r13 = 65536;
        goto L66
    L67:
        enabled2 = enabled;
        goto L69
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
        r6 = r28;
        if ($composer2.changedInstance(r6) == false) goto L43;
        int r8 = 2048;
    L44:
        $dirty = $dirty | r8;
        goto L46
    L43:
        r8 = 1024;
        goto L44
    L45:
        r6 = r28;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r5 = r27;
        if ($composer2.changedInstance(r5) == false) goto L32;
        int r15 = 256;
    L33:
        $dirty = $dirty | r15;
        goto L36
    L32:
        r15 = 128;
        goto L33
    L34:
        r5 = r27;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = r26;
        if ($composer2.changedInstance(r4) == false) goto L21;
        int r16 = 32;
    L22:
        $dirty = $dirty | r16;
        goto L25
    L21:
        r16 = 16;
        goto L22
    L23:
        r4 = r26;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changed(selected) == false) goto L10;
        int r17 = 4;
    L11:
        $dirty = $dirty | r17;
        goto L14
    L10:
        r17 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: Tab-bogVsAg, reason: not valid java name */
    public static final void m2705TabbogVsAg(final boolean selected, final Function0<Unit> r24, Modifier modifier, boolean enabled, long selectedContentColor, long unselectedContentColor, MutableInteractionSource interactionSource, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r32, Composer $composer, final int $changed, final int r35) {
        Composer $composer2 = $composer.startRestartGroup(-202735880);
        ComposerKt.sourceInformation($composer2, "C(Tab)P(5,4,3,1,6:c#ui.graphics.Color,7:c#ui.graphics.Color,2)238@10306L7,246@10715L76,248@10867L600,248@10797L670:Tab.kt#uh7d8r");
        int $dirty = $changed;
        if ((r35 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        boolean r5 = selected;
    L14:
        if ((r35 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        int r3 = r35 & 4;
        if (r3 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L35:
        int r6 = r35 & 8;
        if (r6 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L47:
        if (($changed & 24576) == 0) goto L49;
        long selectedContentColor2 = selectedContentColor;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        long unselectedContentColor2 = unselectedContentColor;
    L68:
        int r15 = r35 & 64;
        if (r15 == 0) goto L72;
        $dirty = $dirty | 1572864;
    L80:
        if ((r35 & 128) == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int $dirty2 = $dirty;
        if (($dirty & 4793491) == 4793490) goto L93;
    L96:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L99;
    L109:
        if (r3 == 0) goto L111;
        modifier2 = Modifier.Companion;
    L111:
        if (r6 == 0) goto L114;
        enabled2 = true;
    L114:
        if ((r35 & 16) == 0) goto L116;
        ProvidableCompositionLocal<Color> r0 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r1 = $composer2.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        selectedContentColor2 = ((Color) r1).m4376unboximpl();
        int $dirty3 = $dirty2 & (-57345);
    L118:
        if ((r35 & 32) == 0) goto L120;
        $dirty3 = $dirty3 & (-458753);
        unselectedContentColor2 = selectedContentColor2;
    L120:
        if (r15 == 0) goto L122;
        final Modifier modifier3 = modifier2;
        long unselectedContentColor3 = unselectedContentColor2;
        final MutableInteractionSource interactionSource2 = null;
        int $dirty4 = $dirty3;
        final boolean enabled3 = enabled2;
        long selectedContentColor3 = selectedContentColor2;
        int r7 = -202735880;
    L123:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L126;
        ComposerKt.traceEventStart(r7, $dirty4, -1, "androidx.compose.material3.Tab (Tab.kt:242)");
    L126:
        final Indication ripple = RippleKt.m2534rippleOrFallbackImplementation9IZ8Weo(true, 0.0f, selectedContentColor3, $composer2, (($dirty4 >> 6) & 896) | 6, 2);
        final boolean r16 = r5;
        m2707TabTransitionKlgxPg(selectedContentColor3, unselectedContentColor3, selected, ComposableLambdaKt.rememberComposableLambda(-551896140, true, new TabKt$Tab$3(modifier3, r16, interactionSource2, ripple, enabled3, r24, r32), $composer2, 54), $composer2, (($dirty4 << 6) & 896) | (((($dirty4 >> 12) & 14) | 3072) | (($dirty4 >> 12) & 112)));
        if (ComposerKt.isTraceInProgress() == false) goto L129;
        ComposerKt.traceEventEnd();
    L129:
        final long selectedContentColor4 = selectedContentColor3;
        final long unselectedContentColor4 = unselectedContentColor3;
        final Modifier modifier4 = modifier3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
        final boolean enabled4 = enabled3;
    L130:
        ScopeUpdateScope r17 = $composer2.endRestartGroup();
        if (r17 == null) goto L134;
        r17.updateScope(new TabKt$Tab$4(selected, r24, modifier4, enabled4, selectedContentColor4, unselectedContentColor4, interactionSource3, r32, $changed, r35));
        return;
    L134:
        return;
    L122:
        modifier3 = modifier2;
        unselectedContentColor3 = unselectedContentColor2;
        interactionSource2 = interactionSource;
        $dirty4 = $dirty3;
        enabled3 = enabled2;
        selectedContentColor3 = selectedContentColor2;
        r7 = -202735880;
        goto L123
    L116:
        $dirty3 = $dirty2;
        goto L118
    L99:
        if ($composer2.getDefaultsInvalid() == true) goto L109;
        $composer2.skipToGroupEnd();
        if ((r35 & 16) == 0) goto L104;
        $dirty4 = $dirty2 & (-57345);
    L106:
        if ((r35 & 32) == 0) goto L108;
        $dirty4 = $dirty4 & (-458753);
    L108:
        modifier3 = modifier2;
        unselectedContentColor3 = unselectedContentColor2;
        interactionSource2 = interactionSource;
        enabled3 = enabled2;
        selectedContentColor3 = selectedContentColor2;
        r7 = -202735880;
        goto L123
    L104:
        $dirty4 = $dirty2;
        goto L106
    L93:
        if ($composer2.getSkipping() == false) goto L96;
        $composer2.skipToGroupEnd();
        modifier4 = modifier2;
        enabled4 = enabled2;
        selectedContentColor4 = selectedContentColor2;
        interactionSource3 = interactionSource;
        unselectedContentColor4 = unselectedContentColor2;
        goto L130
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changedInstance(r32) == false) goto L87;
        int r18 = 8388608;
    L88:
        $dirty = $dirty | r18;
        goto L90
    L87:
        r18 = 4194304;
        goto L88
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
    L60:
        if ((r35 & 32) != 0) goto L64;
        unselectedContentColor2 = unselectedContentColor;
        if ($composer2.changed(unselectedContentColor2) == false) goto L65;
        int r110 = 131072;
    L66:
        $dirty = $dirty | r110;
    L65:
        r110 = 65536;
        goto L66
    L64:
        unselectedContentColor2 = unselectedContentColor;
        goto L65
    L49:
        if ((r35 & 16) != 0) goto L53;
        selectedContentColor2 = selectedContentColor;
        if ($composer2.changed(selectedContentColor2) == false) goto L54;
        int r13 = 16384;
    L55:
        $dirty = $dirty | r13;
    L54:
        r13 = 8192;
        goto L55
    L53:
        selectedContentColor2 = selectedContentColor;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L43;
        int r9 = 2048;
    L44:
        $dirty = $dirty | r9;
        goto L47
    L43:
        r9 = 1024;
        goto L44
    L45:
        enabled2 = enabled;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L32;
        int r8 = 256;
    L33:
        $dirty = $dirty | r8;
        goto L35
    L32:
        r8 = 128;
        goto L33
    L34:
        modifier2 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changedInstance(r24) == false) goto L21;
        int r4 = 32;
    L22:
        $dirty = $dirty | r4;
        goto L24
    L21:
        r4 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r5 = selected;
        if ($composer2.changed(r5) == false) goto L10;
        int r2 = 4;
    L11:
        $dirty = $dirty | r2;
        goto L14
    L10:
        r2 = 2;
        goto L11
    L12:
        r5 = selected;
        goto L14
    }

    /* JADX INFO: renamed from: TabTransition-Klgx-Pg, reason: not valid java name */
    private static final void m2707TabTransitionKlgxPg(long activeColor, final long inactiveColor, final boolean selected, final Function2<? super Composer, ? super Integer, Unit> r33, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(735731848);
        ComposerKt.sourceInformation($composer2, "C(TabTransition)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color,3)280@11898L26,282@11961L548,297@12514L77:Tab.kt#uh7d8r");
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
        if ($composer2.changedInstance(r33) == false) goto L31;
        int r11 = 2048;
    L32:
        $dirty = $dirty | r11;
        goto L34
    L31:
        r11 = 1024;
    L34:
        if (($dirty & 1171) != 1170) goto L40;
        if ($composer2.getSkipping() == false) goto L40;
        $composer2.skipToGroupEnd();
    L82:
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L86;
        final long r1 = r4;
        r9.updateScope(new TabKt$TabTransition$1(r1, inactiveColor, selected, r33, $changed));
        return;
    L86:
        return;
    L40:
        if (ComposerKt.isTraceInProgress() == false) goto L42;
        ComposerKt.traceEventStart(735731848, $dirty, -1, "androidx.compose.material3.TabTransition (Tab.kt:279)");
    L42:
        Transition transition = TransitionKt.updateTransition(Boolean.valueOf(r5), null, $composer2, ($dirty >> 6) & 14, 2);
        Function3 transitionSpec$iv = TabKt$TabTransition$color$2.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
        int $changed2 = (0 >> 6) & 112;
        boolean it = ((Boolean) transition.getTargetState()).booleanValue();
        $composer2.startReplaceGroup(-1997025499);
        ComposerKt.sourceInformation($composer2, "C:Tab.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L46;
        ComposerKt.traceEventStart(-1997025499, $changed2, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:295)");
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
        ComposerKt.sourceInformationMarkerStart($composer2, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        int $changed3 = ($changed$iv$iv >> 9) & 112;
        boolean it2 = ((Boolean) transition.getCurrentState()).booleanValue();
        $composer2.startReplaceGroup(-1997025499);
        ComposerKt.sourceInformation($composer2, "C:Tab.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L64;
        ComposerKt.traceEventStart(-1997025499, $changed3, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:295)");
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
        $composer2.startReplaceGroup(-1997025499);
        ComposerKt.sourceInformation($composer2, "C:Tab.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L73;
        ComposerKt.traceEventStart(-1997025499, $changed4, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:295)");
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
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4356boximpl(TabTransition_Klgx_Pg$lambda$2(color$delegate))), r33, $composer2, ProvidedValue.$stable | (($dirty >> 6) & 112));
        if (ComposerKt.isTraceInProgress() == false) goto L82;
        ComposerKt.traceEventEnd();
        goto L82
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
        Composer $composer2 = $composer.startRestartGroup(514131524);
        ComposerKt.sourceInformation($composer2, "C(TabBaselineLayout)P(1)314@13233L2042,307@12989L2286:Tab.kt#uh7d8r");
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
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r51) == false) goto L14;
        int r7 = 32;
    L15:
        $dirty = $dirty | r7;
        goto L17
    L14:
        r7 = 16;
    L17:
        if (($dirty & 19) != 18) goto L23;
        if ($composer2.getSkipping() == false) goto L23;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L96:
        ScopeUpdateScope r3 = $composer3.endRestartGroup();
        if (r3 == null) goto L100;
        r3.updateScope(new AnonymousClass3(r50, r51, $changed));
        return;
    L100:
        return;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(514131524, $dirty, -1, "androidx.compose.material3.TabBaselineLayout (Tab.kt:306)");
    L25:
        ComposerKt.sourceInformationMarkerStart($composer2, 370960155, "CC(remember):Tab.kt#9igjgp");
        boolean r8 = true;
        if (($dirty & 14) != 4) goto L28;
        boolean r4 = true;
    L30:
        if (($dirty & 112) == 32) goto L33;
        r8 = false;
    L33:
        boolean invalid$iv = r4 | r8;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L36;
    L39:
        MeasurePolicy value$iv = new TabKt$TabBaselineLayout$2$1(r50, r51);
        $composer2.updateRememberedValue(value$iv);
    L40:
        MeasurePolicy measurePolicy$iv = (MeasurePolicy) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
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
        Function0<ComposeUiNode> r9 = r16;
        $composer2.createNode(r9);
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
        int r10 = ($changed$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, 1248753480, "C:Tab.kt#uh7d8r");
        $composer3.startReplaceGroup(871566271);
        ComposerKt.sourceInformation($composer3, "309@13038L85");
        if (r50 == null) goto L74;
        Modifier modifier$iv2 = PaddingKt.m727paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "text"), HorizontalTextPadding, 0.0f, 2, null);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
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
        Function0<ComposeUiNode> r11 = r37;
        $composer3.createNode(r11);
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
        ComposerKt.sourceInformationMarkerStart($composer3, 719667646, "C309@13115L6:Tab.kt#uh7d8r");
        r50.invoke($composer3, Integer.valueOf($dirty2 & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
    L71:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r12);
        goto L72
    L63:
        r11 = r37;
        $composer3.useNode();
    L74:
        $composer3.endReplaceGroup();
        $composer3.startReplaceGroup(871570579);
        ComposerKt.sourceInformation($composer3, "312@13174L41");
        if (r51 == null) goto L92;
        Modifier modifier$iv3 = LayoutIdKt.layoutId(Modifier.Companion, "icon");
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv2 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
        int $changed$iv$iv3 = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer3, modifier$iv3);
        Function0<ComposeUiNode> r18 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv3 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L79;
        ComposablesKt.invalidApplier();
    L79:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L82;
        Function0<ComposeUiNode> r15 = r18;
        $composer3.createNode(r15);
    L83:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer3);
        Composer $composer4 = $composer3;
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r17 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L89;
        int $changed$iv = 6;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == true) goto L91;
    L90:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r17);
    L91:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r19 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r20 = BoxScopeInstance.INSTANCE;
        int r21 = (($changed$iv >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer4, 719758910, "C312@13207L6:Tab.kt#uh7d8r");
        r51.invoke($composer4, Integer.valueOf(($dirty2 >> 3) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        $composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
    L93:
        $composer4.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer4);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L96;
        ComposerKt.traceEventEnd();
        goto L96
    L89:
        $changed$iv = 6;
        goto L90
    L82:
        r15 = r18;
        $composer3.useNode();
        goto L83
    L92:
        $composer4 = $composer3;
        goto L93
    L53:
        $dirty2 = $dirty;
        goto L54
    L46:
        r9 = r16;
        $composer2.useNode();
        goto L47
    L36:
        if (it$iv == Composer.Companion.getEmpty()) goto L39;
        value$iv = it$iv;
        goto L40
    L28:
        r4 = false;
        goto L30
    }

    private static final void placeTextOrIcon(Placeable.PlacementScope $this$placeTextOrIcon, Placeable textOrIconPlaceable, int tabHeight) {
        int contentY = (tabHeight - textOrIconPlaceable.getHeight()) / 2;
        Placeable.PlacementScope.placeRelative$default($this$placeTextOrIcon, textOrIconPlaceable, 0, contentY, 0.0f, 4, null);
    }

    private static final void placeTextAndIcon(Placeable.PlacementScope $this$placeTextAndIcon, Density density, Placeable textPlaceable, Placeable iconPlaceable, int tabWidth, int tabHeight, int firstBaseline, int lastBaseline) {
        if (firstBaseline != lastBaseline) goto L5;
        float baselineOffset = SingleLineTextBaselineWithIcon;
    L6:
        int textOffset = density.mo370roundToPx0680j_4(baselineOffset) + density.mo370roundToPx0680j_4(PrimaryNavigationTabTokens.INSTANCE.m3584getActiveIndicatorHeightD9Ej5fM());
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
        SmallTabHeight = PrimaryNavigationTabTokens.INSTANCE.m3586getContainerHeightD9Ej5fM();
        LargeTabHeight = Dp.m6973constructorimpl(72);
        HorizontalTextPadding = Dp.m6973constructorimpl(16);
        SingleLineTextBaselineWithIcon = Dp.m6973constructorimpl(14);
        DoubleLineTextBaselineWithIcon = Dp.m6973constructorimpl(6);
        IconDistanceFromBaseline = TextUnitKt.getSp(20);
        TextDistanceFromLeadingIcon = Dp.m6973constructorimpl(8);
    }

    public static final float getHorizontalTextPadding() {
        return HorizontalTextPadding;
    }
}
