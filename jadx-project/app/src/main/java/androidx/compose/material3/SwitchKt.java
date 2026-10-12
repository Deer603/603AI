package androidx.compose.material3;

import androidx.compose.animation.core.SnapSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001al\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0018¢\u0006\u0002\b\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0002\u0010\u001f\u001aR\u0010 \u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0006\u0010\u001d\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0003¢\u0006\u0002\u0010$\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007\"\u0010\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007\"\u0016\u0010\t\u001a\u00020\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\n\u0010\u000b\"\u0010\u0010\f\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007\"\u0016\u0010\r\u001a\u00020\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000e\u0010\u000b¨\u0006%"}, d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "SnapSpec", "Landroidx/compose/animation/core/SnapSpec;", "SwitchHeight", "Landroidx/compose/ui/unit/Dp;", "F", "SwitchWidth", "ThumbDiameter", "getThumbDiameter", "()F", "ThumbPadding", "UncheckedThumbDiameter", "getUncheckedThumbDiameter", "Switch", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "thumbContent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "enabled", "colors", "Landroidx/compose/material3/SwitchColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/SwitchColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "SwitchImpl", "Landroidx/compose/foundation/interaction/InteractionSource;", "thumbShape", "Landroidx/compose/ui/graphics/Shape;", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/material3/SwitchColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SwitchKt {
    private static final TweenSpec<Float> AnimationSpec = null;
    private static final SnapSpec<Float> SnapSpec = null;
    private static final float SwitchHeight = 0.0f;
    private static final float SwitchWidth = 0.0f;
    private static final float ThumbDiameter = 0.0f;
    private static final float ThumbPadding = 0.0f;
    private static final float UncheckedThumbDiameter = 0.0f;

    public static final /* synthetic */ void access$SwitchImpl(Modifier modifier, boolean checked, boolean enabled, SwitchColors colors, Function2 thumbContent, InteractionSource interactionSource, Shape thumbShape, Composer $composer, int $changed) {
        SwitchImpl(modifier, checked, enabled, colors, thumbContent, interactionSource, thumbShape, $composer, $changed);
    }

    public static final /* synthetic */ TweenSpec access$getAnimationSpec$p() {
        return AnimationSpec;
    }

    public static final /* synthetic */ SnapSpec access$getSnapSpec$p() {
        return SnapSpec;
    }

    public static final /* synthetic */ float access$getSwitchHeight$p() {
        return SwitchHeight;
    }

    public static final /* synthetic */ float access$getSwitchWidth$p() {
        return SwitchWidth;
    }

    public static final /* synthetic */ float access$getThumbPadding$p() {
        return ThumbPadding;
    }

    public static final void Switch(final boolean checked, final Function1<? super Boolean, Unit> r20, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r22, boolean enabled, SwitchColors colors, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int r28) {
        Composer $composer2 = $composer.startRestartGroup(1580463220);
        ComposerKt.sourceInformation($composer2, "C(Switch)P(!1,5,4,6,2)97@4514L8,129@5619L5,119@5244L424:Switch.kt#uh7d8r");
        int $dirty = $changed;
        if ((r28 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        boolean r10 = checked;
    L14:
        if ((r28 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L23:
        int r2 = r28 & 4;
        if (r2 == 0) goto L27;
        $dirty = $dirty | 384;
        final Modifier modifier2 = modifier;
    L34:
        int r4 = r28 & 8;
        if (r4 == 0) goto L38;
        $dirty = $dirty | 3072;
        Function2<? super Composer, ? super Integer, Unit> r5 = r22;
    L45:
        int r11 = r28 & 16;
        if (r11 == 0) goto L49;
        $dirty = $dirty | 24576;
        boolean enabled2 = enabled;
    L57:
        if ((196608 & $changed) == 0) goto L59;
        SwitchColors colors2 = colors;
    L67:
        int r14 = r28 & 64;
        if (r14 == 0) goto L71;
        $dirty = $dirty | 1572864;
        MutableInteractionSource r15 = interactionSource;
    L79:
        if (($dirty & 599187) == 599186) goto L81;
    L84:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L87;
    L93:
        if (r2 == 0) goto L95;
        Modifier.Companion modifier3 = Modifier.Companion;
    L96:
        if (r4 == 0) goto L98;
        Function2<? super Composer, ? super Integer, Unit> r3 = null;
    L99:
        if (r11 == 0) goto L102;
        enabled2 = true;
    L102:
        if ((r28 & 32) == 0) goto L104;
        $dirty = $dirty & (-458753);
        colors2 = SwitchDefaults.INSTANCE.colors($composer2, 6);
    L104:
        if (r14 == 0) goto L106;
        Modifier modifier4 = modifier3;
        int $dirty2 = $dirty;
        MutableInteractionSource interactionSource2 = null;
        boolean enabled3 = enabled2;
        SwitchColors colors3 = colors2;
        Function2<? super Composer, ? super Integer, Unit> r13 = r3;
    L107:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L110;
        ComposerKt.traceEventStart(1580463220, $dirty2, -1, "androidx.compose.material3.Switch (Switch.kt:99)");
    L110:
        $composer2.startReplaceGroup(783532531);
        ComposerKt.sourceInformation($composer2, "101@4666L39");
        if (interactionSource2 != null) goto L117;
        ComposerKt.sourceInformationMarkerStart($composer2, 783533182, "CC(remember):Switch.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L115;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
    L116:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        MutableInteractionSource interactionSource3 = (MutableInteractionSource) value$iv;
    L118:
        $composer2.endReplaceGroup();
        if (r20 == null) goto L121;
        Modifier.Companion toggleableModifier = ToggleableKt.m991toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.Companion), r10, interactionSource3, null, enabled3, Role.m6174boximpl(Role.Companion.m6187getSwitcho7Vup1c()), r20);
    L122:
        int $dirty3 = $dirty2;
        Composer $composer3 = $composer2;
        Modifier modifier5 = modifier4;
        boolean enabled4 = enabled3;
        SwitchImpl(SizeKt.m766requiredSizeVpY3zN4(SizeKt.wrapContentSize$default(modifier4.then(toggleableModifier), Alignment.Companion.getCenter(), false, 2, null), SwitchWidth, SwitchHeight), checked, enabled4, colors3, r13, interactionSource3, ShapesKt.getValue(SwitchTokens.INSTANCE.getHandleShape(), $composer2, 6), $composer3, (((($dirty3 << 3) & 112) | (($dirty3 >> 6) & 896)) | (($dirty3 >> 6) & 7168)) | (57344 & ($dirty3 << 3)));
        if (ComposerKt.isTraceInProgress() == false) goto L125;
        ComposerKt.traceEventEnd();
    L125:
        final boolean enabled5 = enabled3;
        final SwitchColors colors4 = colors3;
        final Function2<? super Composer, ? super Integer, Unit> r6 = r13;
        final MutableInteractionSource interactionSource4 = interactionSource2;
        modifier2 = modifier5;
    L126:
        ScopeUpdateScope r12 = $composer3.endRestartGroup();
        if (r12 == null) goto L130;
        r12.updateScope(new AnonymousClass1(checked, r20, modifier2, r6, enabled5, colors4, interactionSource4, $changed, r28));
        return;
    L130:
        return;
    L121:
        toggleableModifier = Modifier.Companion;
        goto L122
    L115:
        value$iv = it$iv;
        goto L116
    L117:
        interactionSource3 = interactionSource2;
        goto L118
    L106:
        modifier4 = modifier3;
        $dirty2 = $dirty;
        enabled3 = enabled2;
        colors3 = colors2;
        interactionSource2 = r15;
        r13 = r3;
        goto L107
    L98:
        r3 = r5;
        goto L99
    L95:
        modifier3 = modifier2;
        goto L96
    L87:
        if ($composer2.getDefaultsInvalid() == true) goto L93;
        $composer2.skipToGroupEnd();
        if ((r28 & 32) == 0) goto L92;
        $dirty = $dirty & (-458753);
    L92:
        $dirty2 = $dirty;
        modifier4 = modifier2;
        enabled3 = enabled2;
        colors3 = colors2;
        interactionSource2 = r15;
        r13 = r5;
        goto L107
    L81:
        if ($composer2.getSkipping() == false) goto L84;
        $composer2.skipToGroupEnd();
        r6 = r5;
        $composer3 = $composer2;
        enabled5 = enabled2;
        colors4 = colors2;
        interactionSource4 = r15;
        goto L126
    L71:
        if ((1572864 & $changed) != 0) goto L77;
        r15 = interactionSource;
        if ($composer2.changed(r15) == false) goto L75;
        int r16 = 1048576;
    L76:
        $dirty = $dirty | r16;
        goto L79
    L75:
        r16 = 524288;
        goto L76
    L77:
        r15 = interactionSource;
        goto L79
    L59:
        if ((r28 & 32) != 0) goto L63;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L64;
        int r17 = 131072;
    L65:
        $dirty = $dirty | r17;
    L64:
        r17 = 65536;
        goto L65
    L63:
        colors2 = colors;
        goto L64
    L49:
        if (($changed & 24576) != 0) goto L55;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L53;
        int r18 = 16384;
    L54:
        $dirty = $dirty | r18;
        goto L57
    L53:
        r18 = 8192;
        goto L54
    L55:
        enabled2 = enabled;
        goto L57
    L38:
        if (($changed & 3072) != 0) goto L44;
        r5 = r22;
        if ($composer2.changedInstance(r5) == false) goto L42;
        int r19 = 2048;
    L43:
        $dirty = $dirty | r19;
        goto L45
    L42:
        r19 = 1024;
        goto L43
    L44:
        r5 = r22;
        goto L45
    L27:
        if (($changed & 384) != 0) goto L33;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L31;
        int r7 = 256;
    L32:
        $dirty = $dirty | r7;
        goto L34
    L31:
        r7 = 128;
        goto L32
    L33:
        modifier2 = modifier;
        goto L34
    L17:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changedInstance(r20) == false) goto L21;
        int r8 = 32;
    L22:
        $dirty = $dirty | r8;
        goto L23
    L21:
        r8 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r10 = checked;
        if ($composer2.changed(r10) == false) goto L10;
        int r9 = 4;
    L11:
        $dirty = $dirty | r9;
        goto L14
    L10:
        r9 = 2;
        goto L11
    L12:
        r10 = checked;
        goto L14
    }

    private static final void SwitchImpl(final Modifier modifier, final boolean checked, final boolean enabled, final SwitchColors colors, final Function2<? super Composer, ? super Integer, Unit> r62, final InteractionSource interactionSource, final Shape thumbShape, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1594099146);
        ComposerKt.sourceInformation($composer2, "C(SwitchImpl)P(4!1,2!1,5)147@6165L5,149@6176L1114:Switch.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(modifier) == false) goto L7;
        int r11 = 4;
    L8:
        $dirty = $dirty | r11;
        goto L10
    L7:
        r11 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(checked) == false) goto L14;
        int r12 = 32;
    L15:
        $dirty = $dirty | r12;
        goto L17
    L14:
        r12 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changed(enabled) == false) goto L21;
        int r13 = 256;
    L22:
        $dirty = $dirty | r13;
        goto L24
    L21:
        r13 = 128;
    L24:
        if (($changed & 3072) != 0) goto L31;
        if ($composer2.changed(colors) == false) goto L28;
        int r14 = 2048;
    L29:
        $dirty = $dirty | r14;
        goto L31
    L28:
        r14 = 1024;
    L31:
        if (($changed & 24576) != 0) goto L38;
        if ($composer2.changedInstance(r62) == false) goto L35;
        int r15 = 16384;
    L36:
        $dirty = $dirty | r15;
        goto L38
    L35:
        r15 = 8192;
    L38:
        if ((196608 & $changed) != 0) goto L45;
        if ($composer2.changed(interactionSource) == false) goto L42;
        int r16 = 131072;
    L43:
        $dirty = $dirty | r16;
        goto L45
    L42:
        r16 = 65536;
    L45:
        if ((1572864 & $changed) != 0) goto L52;
        if ($composer2.changed(thumbShape) == false) goto L49;
        int r17 = 1048576;
    L50:
        $dirty = $dirty | r17;
        goto L52
    L49:
        r17 = 524288;
    L52:
        if ((599187 & $dirty) != 599186) goto L58;
        if ($composer2.getSkipping() == false) goto L58;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L96:
        ScopeUpdateScope r9 = $composer3.endRestartGroup();
        if (r9 == null) goto L100;
        r9.updateScope(new AnonymousClass2(modifier, checked, enabled, colors, r62, interactionSource, thumbShape, $changed));
        return;
    L100:
        return;
    L58:
        if (ComposerKt.isTraceInProgress() == false) goto L60;
        ComposerKt.traceEventStart(-1594099146, $dirty, -1, "androidx.compose.material3.SwitchImpl (Switch.kt:144)");
    L60:
        long trackColor = colors.m2701trackColorWaAFU9c$material3_release(enabled, checked);
        long resolvedThumbColor = colors.m2700thumbColorWaAFU9c$material3_release(enabled, checked);
        Shape trackShape = ShapesKt.getValue(SwitchTokens.INSTANCE.getTrackShape(), $composer2, 6);
        Modifier modifier$iv = BackgroundKt.m233backgroundbw27NRU(BorderKt.m245borderxT4_qwU(modifier, SwitchTokens.INSTANCE.m3651getTrackOutlineWidthD9Ej5fM(), colors.m2681borderColorWaAFU9c$material3_release(enabled, checked), trackShape), trackColor, trackShape);
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        int $dirty2 = $dirty;
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r18 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L63;
        ComposablesKt.invalidApplier();
    L63:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L66;
        $composer2.createNode(r18);
    L67:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        $composer3 = $composer2;
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r10 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L74;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L74;
    L75:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r1 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        int r37 = ((0 >> 6) & 112) | 6;
        BoxScope $this$SwitchImpl_u24lambda_u242 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer3, -249502072, "C161@6662L183,154@6351L933:Switch.kt#uh7d8r");
        Modifier r7 = $this$SwitchImpl_u24lambda_u242.align(Modifier.Companion, Alignment.Companion.getCenterStart()).then(new ThumbElement(interactionSource, checked));
        float arg0$iv = SwitchTokens.INSTANCE.m3649getStateLayerSizeD9Ej5fM();
        float arg0$iv2 = 2;
        Modifier modifier$iv2 = BackgroundKt.m233backgroundbw27NRU(IndicationKt.indication(r7, interactionSource, RippleKt.m2534rippleOrFallbackImplementation9IZ8Weo(false, Dp.m6973constructorimpl(arg0$iv / arg0$iv2), 0, $composer3, 54, 4)), resolvedThumbColor, thumbShape);
        Alignment contentAlignment$iv2 = Alignment.Companion.getCenter();
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
        int $changed$iv$iv2 = (48 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer3, modifier$iv2);
        Function0<ComposeUiNode> r25 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L78;
        ComposablesKt.invalidApplier();
    L78:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L81;
        Function0<ComposeUiNode> r6 = r25;
        $composer3.createNode(r6);
    L82:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r8 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L89;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == false) goto L89;
    L90:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r19 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r2 = BoxScopeInstance.INSTANCE;
        int r110 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, 1707453249, "C:Switch.kt#uh7d8r");
        $composer3.startReplaceGroup(1163457794);
        ComposerKt.sourceInformation($composer3, "171@7116L144");
        if (r62 == null) goto L93;
        long iconColor = colors.m2699iconColorWaAFU9c$material3_release(enabled, checked);
        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4356boximpl(iconColor)), r62, $composer3, ProvidedValue.$stable | (($dirty2 >> 9) & 112));
    L93:
        $composer3.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L96;
        ComposerKt.traceEventEnd();
    L89:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r8);
        goto L90
    L81:
        r6 = r25;
        $composer3.useNode();
    L74:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r10);
        goto L75
    L66:
        $composer2.useNode();
        goto L67
    }

    static {
        ThumbDiameter = SwitchTokens.INSTANCE.m3647getSelectedHandleWidthD9Ej5fM();
        UncheckedThumbDiameter = SwitchTokens.INSTANCE.m3654getUnselectedHandleWidthD9Ej5fM();
        SwitchWidth = SwitchTokens.INSTANCE.m3652getTrackWidthD9Ej5fM();
        SwitchHeight = SwitchTokens.INSTANCE.m3650getTrackHeightD9Ej5fM();
        float arg0$iv = SwitchHeight;
        float other$iv = ThumbDiameter;
        ThumbPadding = Dp.m6973constructorimpl(Dp.m6973constructorimpl(arg0$iv - other$iv) / 2);
        SnapSpec = new SnapSpec(0, 1, null);
        AnimationSpec = new TweenSpec(100, 0, null, 6, null);
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    public static final float getUncheckedThumbDiameter() {
        return UncheckedThumbDiameter;
    }
}
