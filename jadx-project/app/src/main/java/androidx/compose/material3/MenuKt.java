package androidx.compose.material3;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntRect;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0086\u0001\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010&2\u001c\u0010'\u001a\u0018\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00140(¢\u0006\u0002\b*¢\u0006\u0002\b+H\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a\u0082\u0001\u0010.\u001a\u00020\u00142\u0011\u0010/\u001a\r\u0012\u0004\u0012\u00020\u001400¢\u0006\u0002\b*2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u0014002\u0006\u0010\u0015\u001a\u00020\u00162\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u000100¢\u0006\u0002\b*2\u0013\u00103\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u000100¢\u0006\u0002\b*2\u0006\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:H\u0001¢\u0006\u0002\u0010;\u001a\u001d\u0010<\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>H\u0000¢\u0006\u0002\u0010@\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0016\u0010\b\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000eX\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\u000f\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0016\u0010\u0010\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0011\u0010\n\"\u000e\u0010\u0012\u001a\u00020\u000eX\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A²\u0006\n\u0010B\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010C\u001a\u00020\u0001X\u008a\u0084\u0002"}, d2 = {"ClosedAlphaTarget", "", "ClosedScaleTarget", "DropdownMenuItemDefaultMaxWidth", "Landroidx/compose/ui/unit/Dp;", "F", "DropdownMenuItemDefaultMinWidth", "DropdownMenuItemHorizontalPadding", "DropdownMenuVerticalPadding", "getDropdownMenuVerticalPadding", "()F", "ExpandedAlphaTarget", "ExpandedScaleTarget", "InTransitionDuration", "", "MenuListItemContainerHeight", "MenuVerticalMargin", "getMenuVerticalMargin", "OutTransitionDuration", "DropdownMenuContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "expandedState", "Landroidx/compose/animation/core/MutableTransitionState;", "", "transformOriginState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/graphics/TransformOrigin;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "tonalElevation", "shadowElevation", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "DropdownMenuContent-Qj0Zi0g", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/graphics/Shape;JFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "DropdownMenuItemContent", "text", "Lkotlin/Function0;", "onClick", "leadingIcon", "trailingIcon", "enabled", "colors", "Landroidx/compose/material3/MenuItemColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;I)V", "calculateTransformOrigin", "anchorBounds", "Landroidx/compose/ui/unit/IntRect;", "menuBounds", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)J", "material3_release", "scale", "alpha"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MenuKt {
    public static final float ClosedAlphaTarget = 0.0f;
    public static final float ClosedScaleTarget = 0.8f;
    private static final float DropdownMenuItemDefaultMaxWidth = 0.0f;
    private static final float DropdownMenuItemDefaultMinWidth = 0.0f;
    private static final float DropdownMenuItemHorizontalPadding = 0.0f;
    private static final float DropdownMenuVerticalPadding = 0.0f;
    public static final float ExpandedAlphaTarget = 1.0f;
    public static final float ExpandedScaleTarget = 1.0f;
    public static final int InTransitionDuration = 120;
    private static final float MenuListItemContainerHeight = 0.0f;
    private static final float MenuVerticalMargin = 0.0f;
    public static final int OutTransitionDuration = 75;

    public static final /* synthetic */ float access$DropdownMenuContent_Qj0Zi0g$lambda$1(State $scale$delegate) {
        return DropdownMenuContent_Qj0Zi0g$lambda$1($scale$delegate);
    }

    public static final /* synthetic */ float access$DropdownMenuContent_Qj0Zi0g$lambda$3(State $alpha$delegate) {
        return DropdownMenuContent_Qj0Zi0g$lambda$3($alpha$delegate);
    }

    public static final /* synthetic */ float access$getDropdownMenuItemHorizontalPadding$p() {
        return DropdownMenuItemHorizontalPadding;
    }

    /* JADX INFO: renamed from: DropdownMenuContent-Qj0Zi0g, reason: not valid java name */
    public static final void m2368DropdownMenuContentQj0Zi0g(final Modifier modifier, final MutableTransitionState<Boolean> r35, final MutableState<TransformOrigin> r36, final ScrollState scrollState, final Shape shape, final long containerColor, final float tonalElevation, final float shadowElevation, final BorderStroke border, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r44, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-151448888);
        ComposerKt.sourceInformation($composer2, "C(DropdownMenuContent)P(4,3,9,5,7,1:c#ui.graphics.Color,8:c#ui.unit.Dp,6:c#ui.unit.Dp)376@17481L47,379@17566L531,394@18135L460,408@18640L7,411@18715L587,428@19474L276,409@18652L1098:Menu.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(modifier) == false) goto L7;
        int r6 = 4;
    L8:
        $dirty = $dirty | r6;
        goto L10
    L7:
        r6 = 2;
    L10:
        if (($changed & 48) != 0) goto L20;
        if (($changed & 64) != 0) goto L14;
        boolean r7 = $composer2.changed(r35);
    L15:
        if (r7 == false) goto L17;
        int r8 = 32;
    L18:
        $dirty = $dirty | r8;
        goto L20
    L17:
        r8 = 16;
        goto L18
    L14:
        r7 = $composer2.changedInstance(r35);
    L20:
        if (($changed & 384) != 0) goto L28;
        if ($composer2.changed(r36) == false) goto L24;
        int r9 = 256;
    L25:
        $dirty = $dirty | r9;
        goto L28
    L24:
        r9 = 128;
    L28:
        if (($changed & 3072) != 0) goto L35;
        if ($composer2.changed(scrollState) == false) goto L32;
        int r10 = 2048;
    L33:
        $dirty = $dirty | r10;
        goto L35
    L32:
        r10 = 1024;
    L35:
        if (($changed & 24576) != 0) goto L43;
        if ($composer2.changed(shape) == false) goto L39;
        int r11 = 16384;
    L40:
        $dirty = $dirty | r11;
        goto L43
    L39:
        r11 = 8192;
    L43:
        if ((196608 & $changed) != 0) goto L51;
        if ($composer2.changed(containerColor) == false) goto L47;
        int r12 = 131072;
    L48:
        $dirty = $dirty | r12;
        goto L51
    L47:
        r12 = 65536;
    L51:
        if ((1572864 & $changed) != 0) goto L59;
        if ($composer2.changed(tonalElevation) == false) goto L55;
        int r15 = 1048576;
    L56:
        $dirty = $dirty | r15;
        goto L59
    L55:
        r15 = 524288;
    L59:
        if (($changed & 12582912) != 0) goto L67;
        if ($composer2.changed(shadowElevation) == false) goto L63;
        int r16 = 8388608;
    L64:
        $dirty = $dirty | r16;
        goto L67
    L63:
        r16 = 4194304;
    L67:
        if (($changed & 100663296) != 0) goto L75;
        if ($composer2.changed(border) == false) goto L71;
        int r17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L72:
        $dirty = $dirty | r17;
        goto L75
    L71:
        r17 = 33554432;
    L75:
        if (($changed & 805306368) != 0) goto L82;
        if ($composer2.changedInstance(r44) == false) goto L79;
        int r18 = 536870912;
    L80:
        $dirty = $dirty | r18;
        goto L82
    L79:
        r18 = 268435456;
    L82:
        if (($dirty & 306783379) != 306783378) goto L88;
        if ($composer2.getSkipping() == false) goto L88;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L153:
        ScopeUpdateScope r13 = $composer3.endRestartGroup();
        if (r13 == null) goto L157;
        r13.updateScope(new MenuKt$DropdownMenuContent$3(modifier, r35, r36, scrollState, shape, containerColor, tonalElevation, shadowElevation, border, r44, $changed));
        return;
    L157:
        return;
    L88:
        if (ComposerKt.isTraceInProgress() == false) goto L90;
        ComposerKt.traceEventStart(-151448888, $dirty, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:374)");
    L90:
        Transition transition = TransitionKt.updateTransition(r35, "DropDownMenu", $composer2, (MutableTransitionState.$stable | 48) | (($dirty >> 3) & 14), 0);
        Function3 transitionSpec$iv = MenuKt$DropdownMenuContent$scale$2.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> r19 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int $changed$iv$iv = (((0 & 14) | ((0 << 3) & 896)) | ((0 << 3) & 7168)) | ((0 << 3) & 57344);
        ComposerKt.sourceInformationMarkerStart($composer2, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        int $changed2 = ($changed$iv$iv >> 9) & 112;
        boolean expanded = ((Boolean) transition.getCurrentState()).booleanValue();
        $composer2.startReplaceGroup(2139028452);
        ComposerKt.sourceInformation($composer2, "C:Menu.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L94;
        ComposerKt.traceEventStart(2139028452, $changed2, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:390)");
    L94:
        if (expanded == false) goto L96;
        float r14 = 1.0f;
    L98:
        if (ComposerKt.isTraceInProgress() == false) goto L100;
        ComposerKt.traceEventEnd();
    L100:
        $composer2.endReplaceGroup();
        Object initialValue$iv$iv = Float.valueOf(r14);
        int $changed3 = ($changed$iv$iv >> 9) & 112;
        boolean expanded2 = ((Boolean) transition.getTargetState()).booleanValue();
        $composer2.startReplaceGroup(2139028452);
        ComposerKt.sourceInformation($composer2, "C:Menu.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L104;
        ComposerKt.traceEventStart(2139028452, $changed3, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:390)");
    L104:
        if (expanded2 == false) goto L106;
        float r20 = 1.0f;
    L108:
        if (ComposerKt.isTraceInProgress() == false) goto L110;
        ComposerKt.traceEventEnd();
    L110:
        $composer2.endReplaceGroup();
        Object targetValue$iv$iv = Float.valueOf(r20);
        final State scale$delegate = TransitionKt.createTransitionAnimation(transition, initialValue$iv$iv, targetValue$iv$iv, transitionSpec$iv.invoke(transition.getSegment(), $composer2, Integer.valueOf(($changed$iv$iv >> 3) & 112)), r19, "FloatAnimation", $composer2, (($changed$iv$iv & 14) | (($changed$iv$iv << 9) & 57344)) | (($changed$iv$iv << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Function3 transitionSpec$iv2 = MenuKt$DropdownMenuContent$alpha$2.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> r110 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int $changed$iv$iv2 = (((0 & 14) | ((0 << 3) & 896)) | ((0 << 3) & 7168)) | ((0 << 3) & 57344);
        ComposerKt.sourceInformationMarkerStart($composer2, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        int $changed4 = ($changed$iv$iv2 >> 9) & 112;
        boolean expanded3 = ((Boolean) transition.getCurrentState()).booleanValue();
        $composer2.startReplaceGroup(-249413128);
        ComposerKt.sourceInformation($composer2, "C:Menu.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L114;
        ComposerKt.traceEventStart(-249413128, $changed4, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:405)");
    L114:
        if (expanded3 == false) goto L116;
        float r21 = 1.0f;
    L118:
        if (ComposerKt.isTraceInProgress() == false) goto L120;
        ComposerKt.traceEventEnd();
    L120:
        $composer2.endReplaceGroup();
        Object initialValue$iv$iv2 = Float.valueOf(r21);
        int $changed5 = ($changed$iv$iv2 >> 9) & 112;
        boolean expanded4 = ((Boolean) transition.getTargetState()).booleanValue();
        $composer2.startReplaceGroup(-249413128);
        ComposerKt.sourceInformation($composer2, "C:Menu.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L124;
        ComposerKt.traceEventStart(-249413128, $changed5, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:405)");
    L124:
        if (expanded4 == false) goto L126;
        float r22 = 1.0f;
    L128:
        if (ComposerKt.isTraceInProgress() == false) goto L130;
        ComposerKt.traceEventEnd();
    L130:
        $composer2.endReplaceGroup();
        Object targetValue$iv$iv2 = Float.valueOf(r22);
        final State alpha$delegate = TransitionKt.createTransitionAnimation(transition, initialValue$iv$iv2, targetValue$iv$iv2, transitionSpec$iv2.invoke(transition.getSegment(), $composer2, Integer.valueOf(($changed$iv$iv2 >> 3) & 112)), r110, "FloatAnimation", $composer2, (($changed$iv$iv2 & 14) | (($changed$iv$iv2 << 9) & 57344)) | (($changed$iv$iv2 << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ProvidableCompositionLocal<Boolean> r2 = InspectionModeKt.getLocalInspectionMode();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r111 = $composer2.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final boolean isInspecting = ((Boolean) r111).booleanValue();
        Modifier.Companion r23 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer2, 526637745, "CC(remember):Menu.kt#9igjgp");
        boolean r24 = $composer2.changed(isInspecting) | $composer2.changed(scale$delegate);
        if (($dirty & 112) != 32) goto L133;
    L138:
        boolean r112 = true;
    L139:
        boolean r25 = (r24 | r112) | $composer2.changed(alpha$delegate);
        if (($dirty & 896) != 256) goto L142;
        boolean r27 = true;
    L143:
        boolean invalid$iv = r25 | r27;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L146;
    L149:
        Object value$iv = (Function1) new MenuKt$DropdownMenuContent$1$1(isInspecting, r35, r36, scale$delegate, alpha$delegate);
        $composer2.updateRememberedValue(value$iv);
    L150:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        SurfaceKt.m2670SurfaceT9BRK9s(GraphicsLayerModifierKt.graphicsLayer(r23, (Function1) value$iv), shape, containerColor, 0, tonalElevation, shadowElevation, border, ComposableLambdaKt.rememberComposableLambda(1573559053, true, new MenuKt$DropdownMenuContent$2(modifier, scrollState, r44), $composer2, 54), $composer2, (((((($dirty >> 9) & 112) | 12582912) | (($dirty >> 9) & 896)) | (($dirty >> 6) & 57344)) | (($dirty >> 6) & 458752)) | (3670016 & ($dirty >> 6)), 8);
        $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L153;
        ComposerKt.traceEventEnd();
        goto L153
    L146:
        if (it$iv == Composer.Companion.getEmpty()) goto L149;
        value$iv = it$iv;
        goto L150
    L142:
        r27 = false;
        goto L143
    L133:
        if (($dirty & 64) != 0) goto L135;
    L137:
        r112 = false;
        goto L139
    L135:
        if ($composer2.changedInstance(r35) == false) goto L137;
    L126:
        r22 = 0.0f;
        goto L128
    L116:
        r21 = 0.0f;
        goto L118
    L106:
        r20 = 0.8f;
        goto L108
    L96:
        r14 = 0.8f;
        goto L98
    }

    private static final float DropdownMenuContent_Qj0Zi0g$lambda$1(State<Float> r4) {
        return r4.getValue().floatValue();
    }

    private static final float DropdownMenuContent_Qj0Zi0g$lambda$3(State<Float> r4) {
        return r4.getValue().floatValue();
    }

    public static final void DropdownMenuItemContent(final Function2<? super Composer, ? super Integer, Unit> r32, final Function0<Unit> r33, final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> r35, final Function2<? super Composer, ? super Integer, Unit> r36, final boolean enabled, final MenuItemColors colors, final PaddingValues contentPadding, final MutableInteractionSource interactionSource, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1564716777);
        ComposerKt.sourceInformation($composer2, "C(DropdownMenuItemContent)P(7,6,5,4,8,2)459@20361L36,452@20118L2520:Menu.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L9;
        Function2<? super Composer, ? super Integer, Unit> r9 = r32;
        if ($composer2.changedInstance(r9) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
    L11:
        if (($changed & 48) != 0) goto L17;
        Function0<Unit> r11 = r33;
        if ($composer2.changedInstance(r11) == false) goto L15;
        int r3 = 32;
    L16:
        $dirty = $dirty | r3;
    L19:
        if (($changed & 384) != 0) goto L25;
        Modifier r12 = modifier;
        if ($composer2.changed(r12) == false) goto L23;
        int r4 = 256;
    L24:
        $dirty = $dirty | r4;
    L27:
        if (($changed & 3072) != 0) goto L35;
        if ($composer2.changedInstance(r35) == false) goto L31;
        int r5 = 2048;
    L32:
        $dirty = $dirty | r5;
        goto L35
    L31:
        r5 = 1024;
    L35:
        if (($changed & 24576) != 0) goto L43;
        if ($composer2.changedInstance(r36) == false) goto L39;
        int r6 = 16384;
    L40:
        $dirty = $dirty | r6;
        goto L43
    L39:
        r6 = 8192;
    L43:
        if ((196608 & $changed) != 0) goto L51;
        if ($composer2.changed(enabled) == false) goto L47;
        int r7 = 131072;
    L48:
        $dirty = $dirty | r7;
        goto L51
    L47:
        r7 = 65536;
    L51:
        if ((1572864 & $changed) != 0) goto L59;
        if ($composer2.changed(colors) == false) goto L55;
        int r8 = 1048576;
    L56:
        $dirty = $dirty | r8;
        goto L59
    L55:
        r8 = 524288;
    L59:
        if ((12582912 & $changed) != 0) goto L66;
        if ($composer2.changed(contentPadding) == false) goto L63;
        int r10 = 8388608;
    L64:
        $dirty = $dirty | r10;
        goto L66
    L63:
        r10 = 4194304;
    L66:
        if ((100663296 & $changed) != 0) goto L74;
        if ($composer2.changed(interactionSource) == false) goto L70;
        int r13 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L71:
        $dirty = $dirty | r13;
        goto L74
    L70:
        r13 = 33554432;
    L74:
        if ((38347923 & $dirty) != 38347922) goto L80;
        if ($composer2.getSkipping() == false) goto L80;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L100:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L104;
        r14.updateScope(new AnonymousClass2(r32, r33, modifier, r35, r36, enabled, colors, contentPadding, interactionSource, $changed));
        return;
    L104:
        return;
    L80:
        if (ComposerKt.isTraceInProgress() == false) goto L82;
        ComposerKt.traceEventStart(-1564716777, $dirty, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:451)");
    L82:
        Function0<Unit> r17 = r11;
        Modifier r15 = r12;
        Modifier r16 = SizeKt.fillMaxWidth$default(ClickableKt.m266clickableO2vRcR0$default(r15, interactionSource, RippleKt.m2534rippleOrFallbackImplementation9IZ8Weo(true, 0.0f, 0, $composer2, 6, 6), enabled, null, null, r17, 24, null), 0.0f, 1, null);
        float r18 = DropdownMenuItemDefaultMinWidth;
        float r19 = DropdownMenuItemDefaultMaxWidth;
        Modifier modifier$iv = PaddingKt.padding(SizeKt.m776sizeInqDBjuR0$default(r16, r18, MenuListItemContainerHeight, r19, 0.0f, 8, null), contentPadding);
        Alignment.Vertical verticalAlignment$iv = Alignment.Companion.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
        Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
        MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
        int $changed$iv$iv = (384 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r110 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L85;
        ComposablesKt.invalidApplier();
    L85:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L88;
        $composer2.createNode(r110);
    L89:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r111 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L95;
        $composer3 = $composer2;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == true) goto L97;
    L96:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r111);
    L97:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r0 = ($changed$iv$iv$iv >> 6) & 14;
        Composer $composer$iv = $composer3;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -407918630, "C100@5047L9:Row.kt#2w3rfo");
        int r24 = ((384 >> 6) & 112) | 6;
        final RowScope $this$DropdownMenuItemContent_u24lambda_u245 = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer$iv, 1949444430, "C472@20996L10,472@21019L1613,472@20965L1667:Menu.kt#uh7d8r");
        final Function2<? super Composer, ? super Integer, Unit> r112 = r9;
        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography($composer$iv, 6).getLabelLarge(), ComposableLambdaKt.rememberComposableLambda(1065051884, true, new MenuKt$DropdownMenuItemContent$1$1(r35, colors, enabled, r36, $this$DropdownMenuItemContent_u24lambda_u245, r112), $composer$iv, 54), $composer$iv, 48);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L100;
        ComposerKt.traceEventEnd();
        goto L100
    L95:
        $composer3 = $composer2;
        goto L96
    L88:
        $composer2.useNode();
        goto L89
    L23:
        r4 = 128;
        goto L24
    L25:
        r12 = modifier;
        goto L27
    L15:
        r3 = 16;
        goto L16
    L17:
        r11 = r33;
        goto L19
    L7:
        r2 = 2;
        goto L8
    L9:
        r9 = r32;
        goto L11
    }

    public static final long calculateTransformOrigin(IntRect anchorBounds, IntRect menuBounds) {
        float pivotY = 1.0f;
        if (menuBounds.getLeft() < anchorBounds.getRight()) goto L6;
        float pivotX = 0.0f;
    L13:
        if (menuBounds.getTop() < anchorBounds.getBottom()) goto L16;
        pivotY = 0.0f;
    L23:
        return TransformOriginKt.TransformOrigin(pivotX, pivotY);
    L16:
        if (menuBounds.getBottom() <= anchorBounds.getTop()) goto L23;
        if (menuBounds.getHeight() != 0) goto L21;
        pivotY = 0.0f;
        goto L23
    L21:
        int intersectionCenter = (Math.max(anchorBounds.getTop(), menuBounds.getTop()) + Math.min(anchorBounds.getBottom(), menuBounds.getBottom())) / 2;
        pivotY = (intersectionCenter - menuBounds.getTop()) / menuBounds.getHeight();
        goto L23
    L6:
        if (menuBounds.getRight() > anchorBounds.getLeft()) goto L9;
        pivotX = 1.0f;
        goto L13
    L9:
        if (menuBounds.getWidth() != 0) goto L11;
        pivotX = 0.0f;
        goto L13
    L11:
        int intersectionCenter2 = (Math.max(anchorBounds.getLeft(), menuBounds.getLeft()) + Math.min(anchorBounds.getRight(), menuBounds.getRight())) / 2;
        pivotX = (intersectionCenter2 - menuBounds.getLeft()) / menuBounds.getWidth();
        goto L13
    }

    static {
        MenuVerticalMargin = Dp.m6973constructorimpl(48);
        MenuListItemContainerHeight = Dp.m6973constructorimpl(48);
        DropdownMenuItemHorizontalPadding = Dp.m6973constructorimpl(12);
        DropdownMenuVerticalPadding = Dp.m6973constructorimpl(8);
        DropdownMenuItemDefaultMinWidth = Dp.m6973constructorimpl(112);
        DropdownMenuItemDefaultMaxWidth = Dp.m6973constructorimpl(280);
    }

    public static final float getMenuVerticalMargin() {
        return MenuVerticalMargin;
    }

    public static final float getDropdownMenuVerticalPadding() {
        return DropdownMenuVerticalPadding;
    }
}
