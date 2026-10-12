package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.internal.MappedInteractionSource;
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
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: NavigationItem.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001aÍ\u0001\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00122\u0013\u0010&\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\u0013\u0010'\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a\u0090\u0001\u0010.\u001a\u00020\u00102\u0006\u0010*\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010\u0019\u001a\u00020\u001a2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u00162\u0006\u0010(\u001a\u00020)2\u0013\u0010&\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00142\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0003ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a6\u00106\u001a\u000207*\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:2\u0006\u0010=\u001a\u00020>H\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001aF\u0010A\u001a\u000207*\u0002082\u0006\u0010B\u001a\u00020:2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:2\u0006\u0010=\u001a\u00020>2\u0006\u0010\u001f\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001aV\u0010E\u001a\u000207*\u0002082\u0006\u0010B\u001a\u00020:2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:2\u0006\u0010=\u001a\u00020>2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\bF\u0010G\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\n\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u000b\u0010\f\"\u0016\u0010\r\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u000e\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006H²\u0006\n\u0010I\u001a\u00020\bX\u008a\u008e\u0002"}, d2 = {"IconLayoutIdTag", "", "IndicatorLayoutIdTag", "IndicatorRippleLayoutIdTag", "IndicatorVerticalOffset", "Landroidx/compose/ui/unit/Dp;", "F", "ItemAnimationDurationMillis", "", "LabelLayoutIdTag", "NavigationItemMinHeight", "getNavigationItemMinHeight", "()F", "NavigationItemMinWidth", "getNavigationItemMinWidth", "NavigationItem", "", "selected", "", "onClick", "Lkotlin/Function0;", NavigationItemKt.IconLayoutIdTag, "Landroidx/compose/runtime/Composable;", "labelTextStyle", "Landroidx/compose/ui/text/TextStyle;", "indicatorShape", "Landroidx/compose/ui/graphics/Shape;", "indicatorWidth", "indicatorHorizontalPadding", "indicatorVerticalPadding", "indicatorToLabelVerticalPadding", "startIconToLabelHorizontalPadding", "topIconItemVerticalPadding", "colors", "Landroidx/compose/material3/NavigationItemColors;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", NavigationItemKt.LabelLayoutIdTag, "badge", "iconPosition", "Landroidx/compose/material3/NavigationItemIconPosition;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "NavigationItem-SHbi2eg", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/graphics/Shape;FFFFFFLandroidx/compose/material3/NavigationItemColors;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "NavigationItemLayout", "Landroidx/compose/foundation/interaction/InteractionSource;", "indicatorColor", "Landroidx/compose/ui/graphics/Color;", "animationProgress", "", "NavigationItemLayout-KmRX-Dg", "(Landroidx/compose/foundation/interaction/InteractionSource;JLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function2;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;FFFFFLandroidx/compose/runtime/Composer;II)V", "placeIcon", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "iconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "indicatorRipplePlaceable", "indicatorPlaceable", "constraints", "Landroidx/compose/ui/unit/Constraints;", "placeIcon-X9ElhV4", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndStartIcon", "labelPlaceable", "placeLabelAndStartIcon-nru01g4", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndTopIcon", "placeLabelAndTopIcon-qoqLrGI", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JFFF)Landroidx/compose/ui/layout/MeasureResult;", "material3_release", "itemWidth"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class NavigationItemKt {
    private static final String IconLayoutIdTag = "icon";
    private static final String IndicatorLayoutIdTag = "indicator";
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final float IndicatorVerticalOffset = 0.0f;
    private static final int ItemAnimationDurationMillis = 100;
    private static final String LabelLayoutIdTag = "label";
    private static final float NavigationItemMinHeight = 0.0f;
    private static final float NavigationItemMinWidth = 0.0f;

    /* JADX INFO: renamed from: access$NavigationItemLayout-KmRX-Dg, reason: not valid java name */
    public static final /* synthetic */ void m2440access$NavigationItemLayoutKmRXDg(InteractionSource interactionSource, long indicatorColor, Shape indicatorShape, Function2 icon, int iconPosition, Function2 label, Function0 animationProgress, float indicatorHorizontalPadding, float indicatorVerticalPadding, float indicatorToLabelVerticalPadding, float startIconToLabelHorizontalPadding, float topIconItemVerticalPadding, Composer $composer, int $changed, int $changed1) {
        m2439NavigationItemLayoutKmRXDg(interactionSource, indicatorColor, indicatorShape, icon, iconPosition, label, animationProgress, indicatorHorizontalPadding, indicatorVerticalPadding, indicatorToLabelVerticalPadding, startIconToLabelHorizontalPadding, topIconItemVerticalPadding, $composer, $changed, $changed1);
    }

    public static final /* synthetic */ void access$NavigationItem_SHbi2eg$lambda$3(MutableIntState $itemWidth$delegate, int value) {
        NavigationItem_SHbi2eg$lambda$3($itemWidth$delegate, value);
    }

    /* JADX INFO: renamed from: access$placeIcon-X9ElhV4, reason: not valid java name */
    public static final /* synthetic */ MeasureResult m2441access$placeIconX9ElhV4(MeasureScope $receiver, Placeable iconPlaceable, Placeable indicatorRipplePlaceable, Placeable indicatorPlaceable, long constraints) {
        return m2444placeIconX9ElhV4($receiver, iconPlaceable, indicatorRipplePlaceable, indicatorPlaceable, constraints);
    }

    /* JADX INFO: renamed from: access$placeLabelAndStartIcon-nru01g4, reason: not valid java name */
    public static final /* synthetic */ MeasureResult m2442access$placeLabelAndStartIconnru01g4(MeasureScope $receiver, Placeable labelPlaceable, Placeable iconPlaceable, Placeable indicatorRipplePlaceable, Placeable indicatorPlaceable, long constraints, float startIconToLabelHorizontalPadding) {
        return m2445placeLabelAndStartIconnru01g4($receiver, labelPlaceable, iconPlaceable, indicatorRipplePlaceable, indicatorPlaceable, constraints, startIconToLabelHorizontalPadding);
    }

    /* JADX INFO: renamed from: access$placeLabelAndTopIcon-qoqLrGI, reason: not valid java name */
    public static final /* synthetic */ MeasureResult m2443access$placeLabelAndTopIconqoqLrGI(MeasureScope $receiver, Placeable labelPlaceable, Placeable iconPlaceable, Placeable indicatorRipplePlaceable, Placeable indicatorPlaceable, long constraints, float indicatorToLabelVerticalPadding, float indicatorVerticalPadding, float topIconItemVerticalPadding) {
        return m2446placeLabelAndTopIconqoqLrGI($receiver, labelPlaceable, iconPlaceable, indicatorRipplePlaceable, indicatorPlaceable, constraints, indicatorToLabelVerticalPadding, indicatorVerticalPadding, topIconItemVerticalPadding);
    }

    /* JADX INFO: renamed from: NavigationItem-SHbi2eg, reason: not valid java name */
    public static final void m2438NavigationItemSHbi2eg(final boolean selected, final Function0<Unit> r55, final Function2<? super Composer, ? super Integer, Unit> r56, final TextStyle labelTextStyle, final Shape indicatorShape, final float indicatorWidth, final float indicatorHorizontalPadding, final float indicatorVerticalPadding, final float indicatorToLabelVerticalPadding, final float startIconToLabelHorizontalPadding, final float topIconItemVerticalPadding, final NavigationItemColors colors, final Modifier modifier, final boolean enabled, final Function2<? super Composer, ? super Integer, Unit> r68, final Function2<? super Composer, ? super Integer, Unit> r69, final int iconPosition, final MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int $changed1) {
        Composer $composer2 = $composer.startRestartGroup(547979956);
        ComposerKt.sourceInformation($composer2, "C(NavigationItem)P(15,14,3,12,6,9:c#ui.unit.Dp,5:c#ui.unit.Dp,8:c#ui.unit.Dp,7:c#ui.unit.Dp,16:c#ui.unit.Dp,17:c#ui.unit.Dp,1,13,2,11!1,4:c#material3.NavigationItemIconPosition)254@10949L438,281@11981L33,294@12438L24,283@12020L2390:NavigationItem.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if (($changed & 6) == 0) goto L5;
    L9:
        int r16 = 16;
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r55) == false) goto L14;
        int r17 = 32;
    L15:
        $dirty = $dirty | r17;
        goto L17
    L14:
        r17 = 16;
    L17:
        int r18 = 256;
        if (($changed & 384) != 0) goto L24;
        final Function2<? super Composer, ? super Integer, Unit> r5 = r56;
        if ($composer2.changedInstance(r5) == false) goto L22;
        int r19 = 256;
    L23:
        $dirty = $dirty | r19;
    L25:
        int r20 = 1024;
        if (($changed & 3072) != 0) goto L32;
        TextStyle r12 = labelTextStyle;
        if ($composer2.changed(r12) == false) goto L30;
        int r21 = 2048;
    L31:
        $dirty = $dirty | r21;
    L34:
        if (($changed & 24576) != 0) goto L40;
        Shape r13 = indicatorShape;
        if ($composer2.changed(r13) == false) goto L38;
        int r22 = 16384;
    L39:
        $dirty = $dirty | r22;
    L42:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L49;
        if ($composer2.changed(indicatorWidth) == false) goto L46;
        int r23 = 131072;
    L47:
        $dirty = $dirty | r23;
        goto L49
    L46:
        r23 = 65536;
    L49:
        if (($changed & 1572864) != 0) goto L57;
        if ($composer2.changed(indicatorHorizontalPadding) == false) goto L53;
        int r24 = 1048576;
    L54:
        $dirty = $dirty | r24;
        goto L57
    L53:
        r24 = 524288;
    L57:
        if (($changed & 12582912) != 0) goto L65;
        if ($composer2.changed(indicatorVerticalPadding) == false) goto L61;
        int r25 = 8388608;
    L62:
        $dirty = $dirty | r25;
        goto L65
    L61:
        r25 = 4194304;
    L65:
        if (($changed & 100663296) != 0) goto L73;
        if ($composer2.changed(indicatorToLabelVerticalPadding) == false) goto L69;
        int r26 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L70:
        $dirty = $dirty | r26;
        goto L73
    L69:
        r26 = 33554432;
    L73:
        if (($changed & 805306368) != 0) goto L81;
        if ($composer2.changed(startIconToLabelHorizontalPadding) == false) goto L77;
        int r27 = 536870912;
    L78:
        $dirty = $dirty | r27;
        goto L81
    L77:
        r27 = 268435456;
    L81:
        if (($changed1 & 6) != 0) goto L87;
        float r9 = topIconItemVerticalPadding;
        if ($composer2.changed(r9) == false) goto L85;
        int r110 = 4;
    L86:
        $dirty1 = $dirty1 | r110;
    L89:
        if (($changed1 & 48) != 0) goto L96;
        if ($composer2.changed(colors) == false) goto L93;
        r16 = 32;
    L93:
        $dirty1 = $dirty1 | r16;
    L96:
        if (($changed1 & 384) != 0) goto L104;
        if ($composer2.changed(modifier) == true) goto L101;
        r18 = 128;
    L101:
        $dirty1 = $dirty1 | r18;
    L104:
        if (($changed1 & 3072) != 0) goto L111;
        if ($composer2.changed(enabled) == false) goto L108;
        r20 = 2048;
    L108:
        $dirty1 = $dirty1 | r20;
    L111:
        if (($changed1 & 24576) != 0) goto L118;
        if ($composer2.changedInstance(r68) == false) goto L115;
        int r0 = 16384;
    L116:
        $dirty1 = $dirty1 | r0;
        goto L118
    L115:
        r0 = 8192;
    L118:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L125;
        if ($composer2.changedInstance(r69) == false) goto L122;
        int r1 = 131072;
    L123:
        $dirty1 = $dirty1 | r1;
        goto L125
    L122:
        r1 = 65536;
    L125:
        if ((1572864 & $changed1) != 0) goto L132;
        if ($composer2.changed(iconPosition) == false) goto L129;
        int r2 = 1048576;
    L130:
        $dirty1 = $dirty1 | r2;
        goto L132
    L129:
        r2 = 524288;
    L132:
        if ((12582912 & $changed1) == 0) goto L134;
    L138:
        int $dirty2 = $dirty1;
        if ((306783379 & $dirty) != 306783378) goto L147;
        if ((4793491 & $dirty2) != 4793490) goto L147;
        if ($composer2.getSkipping() == false) goto L147;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L215:
        ScopeUpdateScope r3 = $composer3.endRestartGroup();
        if (r3 == null) goto L219;
        r3.updateScope(new NavigationItemKt$NavigationItem$3(selected, r55, r56, labelTextStyle, indicatorShape, indicatorWidth, indicatorHorizontalPadding, indicatorVerticalPadding, indicatorToLabelVerticalPadding, startIconToLabelHorizontalPadding, topIconItemVerticalPadding, colors, modifier, enabled, r68, r69, iconPosition, interactionSource, $changed, $changed1));
        return;
    L219:
        return;
    L147:
        if (ComposerKt.isTraceInProgress() == false) goto L149;
        ComposerKt.traceEventStart(547979956, $dirty, $dirty2, "androidx.compose.material3.NavigationItem (NavigationItem.kt:252)");
    L149:
        int $dirty3 = $dirty;
        final Function2 styledIcon = ComposableLambdaKt.rememberComposableLambda(-44329638, true, new NavigationItemKt$NavigationItem$styledIcon$1(colors, selected, enabled, r68, r5), $composer2, 54);
        $composer2.startReplaceGroup(-1735402128);
        ComposerKt.sourceInformation($composer2, "264@11453L51");
        if (r69 == null) goto L152;
        Function2 r4 = ComposableLambdaKt.rememberComposableLambda(1836184859, true, new NavigationItemKt$NavigationItem$iconWithBadge$1(r69, styledIcon), $composer2, 54);
    L153:
        $composer2.endReplaceGroup();
        Function2 iconWithBadge = r4;
        $composer2.startReplaceGroup(-1735395524);
        ComposerKt.sourceInformation($composer2, "*271@11650L298");
        Function2 r6 = null;
        if (r68 == null) goto L157;
        final TextStyle r7 = r12;
        r6 = ComposableLambdaKt.rememberComposableLambda(-254668050, true, new NavigationItemKt$NavigationItem$styledLabel$1$1(colors, selected, enabled, r7, r68), $composer2, 54);
    L157:
        $composer2.endReplaceGroup();
        Function2 styledLabel = r6;
        ComposerKt.sourceInformationMarkerStart($composer2, -1735384277, "CC(remember):NavigationItem.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L160;
        Object value$iv = SnapshotIntStateKt.mutableIntStateOf(0);
        $composer2.updateRememberedValue(value$iv);
    L161:
        final MutableIntState itemWidth$delegate = (MutableIntState) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r8 = SizeKt.m756defaultMinSizeVpY3zN4(SelectableKt.m986selectableO2vRcR0(modifier, selected, interactionSource, null, enabled, Role.m6174boximpl(Role.Companion.m6188getTabo7Vup1c()), r55), NavigationItemMinWidth, NavigationItemMinHeight);
        ComposerKt.sourceInformationMarkerStart($composer2, -1735369662, "CC(remember):NavigationItem.kt#9igjgp");
        Object it$iv2 = $composer2.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L164;
        Object value$iv2 = (Function1) new NavigationItemKt$NavigationItem$1$1(itemWidth$delegate);
        $composer2.updateRememberedValue(value$iv2);
    L165:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier modifier$iv = OnRemeasuredModifierKt.onSizeChanged(r8, (Function1) value$iv2);
        Alignment contentAlignment$iv = Alignment.Companion.getCenter();
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, true);
        int $changed$iv$iv = (432 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r111 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L168;
        ComposablesKt.invalidApplier();
    L168:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L171;
        Function0<ComposeUiNode> r10 = r111;
        $composer2.createNode(r10);
    L172:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r11 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L179;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L179;
    L180:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r14 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r15 = BoxScopeInstance.INSTANCE;
        int r28 = ((432 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 872931531, "C299@12615L157,330@14002L27,323@13657L747:NavigationItem.kt#uh7d8r");
        if (selected == false) goto L183;
        float r29 = 1.0f;
    L184:
        final State<Float> r30 = AnimateAsStateKt.animateFloatAsState(r29, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, $composer2, 48, 28);
        $composer2.startReplaceGroup(-1634400795);
        ComposerKt.sourceInformation($composer2, "*310@13207L7,318@13501L136");
        if (NavigationItemIconPosition.m2432equalsimpl0(iconPosition, NavigationItemIconPosition.Companion.m2437getTopxw1Ddg()) == false) goto L199;
        ProvidableCompositionLocal<Density> r31 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r32 = $composer2.consume(r31);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Density $this$NavigationItem_SHbi2eg_u24lambda_u248_u24lambda_u245 = (Density) r32;
        long deltaOffset = OffsetKt.Offset((NavigationItem_SHbi2eg$lambda$2(itemWidth$delegate) - $this$NavigationItem_SHbi2eg_u24lambda_u248_u24lambda_u245.mo370roundToPx0680j_4(indicatorWidth)) / 2.0f, $this$NavigationItem_SHbi2eg_u24lambda_u248_u24lambda_u245.mo376toPx0680j_4(IndicatorVerticalOffset));
        Unit r33 = Unit.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1634380655, "CC(remember):NavigationItem.kt#9igjgp");
        if (($dirty2 & 29360128) != 8388608) goto L189;
        boolean r112 = true;
    L190:
        boolean invalid$iv = r112 | $composer2.changed(deltaOffset);
        Object value$iv3 = $composer2.rememberedValue();
        if (invalid$iv == true) goto L197;
        if (value$iv3 == Composer.Companion.getEmpty()) goto L197;
    L198:
        MappedInteractionSource offsetInteractionSource = (MappedInteractionSource) value$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        MappedInteractionSource offsetInteractionSource2 = offsetInteractionSource;
    L200:
        $composer2.endReplaceGroup();
        if (offsetInteractionSource2 == null) goto L203;
        MutableInteractionSource r34 = offsetInteractionSource2;
    L204:
        long r113 = colors.m2423getSelectedIndicatorColor0d7_KjU();
        ComposerKt.sourceInformationMarkerStart($composer2, -1634364732, "CC(remember):NavigationItem.kt#9igjgp");
        boolean invalid$iv2 = $composer2.changed(r30);
        Object value$iv4 = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L210;
        InteractionSource r114 = r34;
        if (value$iv4 != Composer.Companion.getEmpty()) goto L212;
    L211:
        value$iv4 = (Function0) new NavigationItemKt$NavigationItem$2$3$1(r30);
        $composer2.updateRememberedValue(value$iv4);
    L212:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer3 = $composer2;
        float r210 = r9;
        InteractionSource r35 = r114;
        m2439NavigationItemLayoutKmRXDg(r35, r113, r13, iconWithBadge, iconPosition, styledLabel, (Function0) value$iv4, indicatorHorizontalPadding, indicatorVerticalPadding, indicatorToLabelVerticalPadding, startIconToLabelHorizontalPadding, r210, $composer2, ((((($dirty3 >> 6) & 896) | (($dirty2 >> 6) & 57344)) | (($dirty3 << 3) & 29360128)) | (($dirty3 << 3) & 234881024)) | (($dirty3 << 3) & 1879048192), (($dirty3 >> 27) & 14) | (($dirty2 << 3) & 112));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L215;
        ComposerKt.traceEventEnd();
        goto L215
    L210:
        r114 = r34;
        goto L211
    L203:
        r34 = interactionSource;
    L197:
        value$iv3 = new MappedInteractionSource(interactionSource, deltaOffset, null);
        $composer2.updateRememberedValue(value$iv3);
        goto L198
    L189:
        r112 = false;
        goto L190
    L199:
        offsetInteractionSource2 = null;
        goto L200
    L183:
        r29 = 0.0f;
    L179:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r11);
        goto L180
    L171:
        r10 = r111;
        $composer2.useNode();
        goto L172
    L164:
        value$iv2 = it$iv2;
        goto L165
    L160:
        value$iv = it$iv;
        goto L161
    L152:
        r4 = styledIcon;
        goto L153
    L134:
        if ($composer2.changed(interactionSource) == false) goto L136;
        int r36 = 8388608;
    L137:
        $dirty1 = $dirty1 | r36;
        goto L138
    L136:
        r36 = 4194304;
        goto L137
    L85:
        r110 = 2;
        goto L86
    L87:
        r9 = topIconItemVerticalPadding;
        goto L89
    L38:
        r22 = 8192;
        goto L39
    L40:
        r13 = indicatorShape;
        goto L42
    L30:
        r21 = 1024;
        goto L31
    L32:
        r12 = labelTextStyle;
        goto L34
    L22:
        r19 = 128;
        goto L23
    L24:
        r5 = r56;
        goto L25
    L5:
        if ($composer2.changed(selected) == false) goto L7;
        int r37 = 4;
    L8:
        $dirty = $dirty | r37;
        goto L9
    L7:
        r37 = 2;
        goto L8
    }

    private static final int NavigationItem_SHbi2eg$lambda$2(MutableIntState $itemWidth$delegate) {
        MutableIntState $this$getValue$iv = $itemWidth$delegate;
        return $this$getValue$iv.getIntValue();
    }

    private static final void NavigationItem_SHbi2eg$lambda$3(MutableIntState $itemWidth$delegate, int value) {
        $itemWidth$delegate.setIntValue(value);
    }

    /* JADX WARN: Failed to calculate best type for var: r9v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v14 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v14 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v15 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v18 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v14 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: NavigationItemLayout-KmRX-Dg, reason: not valid java name */
    private static final void m2439NavigationItemLayoutKmRXDg(androidx.compose.foundation.interaction.InteractionSource r51, long r52, androidx.compose.ui.graphics.Shape r54, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, int r56, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r57, kotlin.jvm.functions.Function0<java.lang.Float> r58, float r59, float r60, float r61, float r62, float r63, androidx.compose.runtime.Composer r64, int r65, int r66) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0177: CONST (r9v18 ?? I:??[boolean, int, float, short, byte, char]) = (1 ??[boolean, int, float, short, byte, char]) A[DECLARE_VAR] in method: androidx.compose.material3.NavigationItemKt.NavigationItemLayout-KmRX-Dg(androidx.compose.foundation.interaction.InteractionSource, long, androidx.compose.ui.graphics.Shape, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, int, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function0<java.lang.Float>, float, float, float, float, float, androidx.compose.runtime.Composer, int, int):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:348)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:316)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:279)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.ArgType.getPrimitiveType()" because "type" is null
            	at jadx.core.codegen.ClassGen.useType(ClassGen.java:564)
            	at jadx.core.codegen.InsnGen.useType(InsnGen.java:269)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:166)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:159)
            	at jadx.core.codegen.InsnGen.assignVar(InsnGen.java:152)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:299)
            	... 11 more
            */
        /*
            Method dump skipped, instruction units count: 1431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationItemKt.m2439NavigationItemLayoutKmRXDg(androidx.compose.foundation.interaction.InteractionSource, long, androidx.compose.ui.graphics.Shape, kotlin.jvm.functions.Function2, int, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, float, float, float, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: renamed from: placeIcon-X9ElhV4, reason: not valid java name */
    private static final MeasureResult m2444placeIconX9ElhV4(MeasureScope $this$placeIcon_u2dX9ElhV4, final Placeable iconPlaceable, final Placeable indicatorRipplePlaceable, final Placeable indicatorPlaceable, long constraints) {
        int width = ConstraintsKt.m6943constrainWidthK40F9xA(constraints, indicatorRipplePlaceable.getWidth());
        int height = ConstraintsKt.m6942constrainHeightK40F9xA(constraints, indicatorRipplePlaceable.getHeight());
        final int indicatorX = (width - indicatorPlaceable.getWidth()) / 2;
        final int indicatorY = (height - indicatorPlaceable.getHeight()) / 2;
        final int iconX = (width - iconPlaceable.getWidth()) / 2;
        final int iconY = (height - iconPlaceable.getHeight()) / 2;
        final int rippleX = (width - indicatorRipplePlaceable.getWidth()) / 2;
        final int rippleY = (height - indicatorRipplePlaceable.getHeight()) / 2;
        return MeasureScope.layout$default($this$placeIcon_u2dX9ElhV4, width, height, null, new NavigationItemKt$placeIcon$1(indicatorPlaceable, indicatorX, indicatorY, iconPlaceable, iconX, iconY, indicatorRipplePlaceable, rippleX, rippleY), 4, null);
    }

    /* JADX INFO: renamed from: placeLabelAndTopIcon-qoqLrGI, reason: not valid java name */
    private static final MeasureResult m2446placeLabelAndTopIconqoqLrGI(MeasureScope $this$placeLabelAndTopIcon_u2dqoqLrGI, final Placeable labelPlaceable, final Placeable iconPlaceable, final Placeable indicatorRipplePlaceable, final Placeable indicatorPlaceable, long constraints, float indicatorToLabelVerticalPadding, float indicatorVerticalPadding, float topIconItemVerticalPadding) {
        int width = ConstraintsKt.m6943constrainWidthK40F9xA(constraints, Math.max(labelPlaceable.getWidth(), indicatorRipplePlaceable.getWidth()));
        float contentHeight = (indicatorRipplePlaceable.getHeight() + $this$placeLabelAndTopIcon_u2dqoqLrGI.mo376toPx0680j_4(indicatorToLabelVerticalPadding)) + labelPlaceable.getHeight();
        int height = ConstraintsKt.m6942constrainHeightK40F9xA(constraints, MathKt.roundToInt(($this$placeLabelAndTopIcon_u2dqoqLrGI.mo376toPx0680j_4(topIconItemVerticalPadding) * 2.0f) + contentHeight));
        final int iconY = $this$placeLabelAndTopIcon_u2dqoqLrGI.mo370roundToPx0680j_4(Dp.m6973constructorimpl(topIconItemVerticalPadding + indicatorVerticalPadding));
        final int iconX = (width - iconPlaceable.getWidth()) / 2;
        final int indicatorX = (width - indicatorPlaceable.getWidth()) / 2;
        final int indicatorY = iconY - $this$placeLabelAndTopIcon_u2dqoqLrGI.mo370roundToPx0680j_4(indicatorVerticalPadding);
        final int labelX = (width - labelPlaceable.getWidth()) / 2;
        final int labelY = (iconY + iconPlaceable.getHeight()) + $this$placeLabelAndTopIcon_u2dqoqLrGI.mo370roundToPx0680j_4(Dp.m6973constructorimpl(indicatorVerticalPadding + indicatorToLabelVerticalPadding));
        final int rippleX = (width - indicatorRipplePlaceable.getWidth()) / 2;
        return MeasureScope.layout$default($this$placeLabelAndTopIcon_u2dqoqLrGI, width, height, null, new NavigationItemKt$placeLabelAndTopIcon$1(indicatorPlaceable, indicatorX, indicatorY, labelPlaceable, labelX, labelY, iconPlaceable, iconX, iconY, indicatorRipplePlaceable, rippleX, indicatorY), 4, null);
    }

    /* JADX INFO: renamed from: placeLabelAndStartIcon-nru01g4, reason: not valid java name */
    private static final MeasureResult m2445placeLabelAndStartIconnru01g4(MeasureScope $this$placeLabelAndStartIcon_u2dnru01g4, final Placeable labelPlaceable, final Placeable iconPlaceable, final Placeable indicatorRipplePlaceable, final Placeable indicatorPlaceable, long constraints, float startIconToLabelHorizontalPadding) {
        int width = ConstraintsKt.m6943constrainWidthK40F9xA(constraints, indicatorRipplePlaceable.getWidth());
        int height = ConstraintsKt.m6942constrainHeightK40F9xA(constraints, indicatorRipplePlaceable.getHeight());
        final int indicatorX = (width - indicatorPlaceable.getWidth()) / 2;
        final int indicatorY = (height - indicatorPlaceable.getHeight()) / 2;
        final int iconY = (height - iconPlaceable.getHeight()) / 2;
        final int labelY = (height - labelPlaceable.getHeight()) / 2;
        int itemContentWidth = (iconPlaceable.getWidth() + $this$placeLabelAndStartIcon_u2dnru01g4.mo370roundToPx0680j_4(startIconToLabelHorizontalPadding)) + labelPlaceable.getWidth();
        final int iconX = (width - itemContentWidth) / 2;
        final int labelX = (iconX + iconPlaceable.getWidth()) + $this$placeLabelAndStartIcon_u2dnru01g4.mo370roundToPx0680j_4(startIconToLabelHorizontalPadding);
        final int rippleX = (width - indicatorRipplePlaceable.getWidth()) / 2;
        final int rippleY = (height - indicatorRipplePlaceable.getHeight()) / 2;
        return MeasureScope.layout$default($this$placeLabelAndStartIcon_u2dnru01g4, width, height, null, new NavigationItemKt$placeLabelAndStartIcon$1(indicatorPlaceable, indicatorX, indicatorY, labelPlaceable, labelX, labelY, iconPlaceable, iconX, iconY, indicatorRipplePlaceable, rippleX, rippleY), 4, null);
    }

    static {
        NavigationItemMinWidth = NavigationRailKt.getNavigationRailItemWidth();
        NavigationItemMinHeight = NavigationRailKt.getNavigationRailItemHeight();
        IndicatorVerticalOffset = Dp.m6973constructorimpl(12);
    }

    public static final float getNavigationItemMinWidth() {
        return NavigationItemMinWidth;
    }

    public static final float getNavigationItemMinHeight() {
        return NavigationItemMinHeight;
    }
}
