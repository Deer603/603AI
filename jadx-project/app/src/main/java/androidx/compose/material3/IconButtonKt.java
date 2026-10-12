package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IconButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ab\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001ap\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00152\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0016\u001ab\u0010\u0017\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001ap\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00152\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0016\u001aX\u0010\u0019\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u001a\u001af\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00152\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u001c\u001an\u0010\u001d\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010 \u001a|\u0010!\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00152\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\"¨\u0006#"}, d2 = {"FilledIconButton", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/IconButtonColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FilledIconToggleButton", "checked", "onCheckedChange", "Lkotlin/Function1;", "Landroidx/compose/material3/IconToggleButtonColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FilledTonalIconButton", "FilledTonalIconToggleButton", "IconButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "IconToggleButton", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "OutlinedIconButton", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "OutlinedIconToggleButton", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IconButtonKt {
    public static final void IconButton(final Function0<Unit> r30, Modifier modifier, boolean enabled, IconButtonColors colors, MutableInteractionSource interactionSource, final Function2<? super Composer, ? super Integer, Unit> r35, Composer $composer, final int $changed, final int r38) {
        Composer $composer2 = $composer.startRestartGroup(-1142896114);
        ComposerKt.sourceInformation($composer2, "C(IconButton)P(5,4,2!1,3)85@4039L18,94@4366L5,102@4703L175,89@4160L944:IconButton.kt#uh7d8r");
        int $dirty = $changed;
        if ((r38 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0<Unit> r2 = r30;
    L13:
        int r3 = r38 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r4 = modifier;
    L24:
        int r5 = r38 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        boolean enabled2 = enabled;
    L36:
        if (($changed & 3072) == 0) goto L38;
        IconButtonColors colors2 = colors;
    L46:
        int r10 = r38 & 16;
        if (r10 == 0) goto L50;
        $dirty = $dirty | 24576;
        MutableInteractionSource r11 = interactionSource;
    L58:
        if ((r38 & 32) == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L68:
        if ((74899 & $dirty) == 74898) goto L70;
    L73:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L76;
    L82:
        if (r3 == 0) goto L84;
        Modifier.Companion modifier2 = Modifier.Companion;
    L85:
        if (r5 == 0) goto L88;
        enabled2 = true;
    L88:
        if ((r38 & 8) == 0) goto L90;
        $dirty = $dirty & (-7169);
        colors2 = IconButtonDefaults.INSTANCE.iconButtonColors($composer2, 6);
    L90:
        if (r10 == 0) goto L92;
        boolean r6 = enabled2;
        int $dirty2 = $dirty;
        boolean enabled3 = r6;
        MutableInteractionSource interactionSource2 = null;
        final IconButtonColors colors3 = colors2;
    L93:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L96;
        ComposerKt.traceEventStart(-1142896114, $dirty2, -1, "androidx.compose.material3.IconButton (IconButton.kt:88)");
    L96:
        Modifier r0 = BackgroundKt.m234backgroundbw27NRU$default(ClipKt.clip(SizeKt.m772size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), IconButtonTokens.INSTANCE.m3417getStateLayerSizeD9Ej5fM()), ShapesKt.getValue(IconButtonTokens.INSTANCE.getStateLayerShape(), $composer2, 6)), colors3.m2256containerColorvNxB06k$material3_release(enabled3), null, 2, null);
        int r16 = Role.Companion.m6181getButtono7Vup1c();
        float arg0$iv = IconButtonTokens.INSTANCE.m3417getStateLayerSizeD9Ej5fM();
        int other$iv = $dirty2;
        Indication r8 = RippleKt.m2534rippleOrFallbackImplementation9IZ8Weo(false, Dp.m6973constructorimpl(arg0$iv / 2), 0, $composer2, 54, 4);
        Role r18 = Role.m6174boximpl(r16);
        boolean enabled4 = enabled3;
        MutableInteractionSource interactionSource3 = interactionSource2;
        Modifier modifier$iv = ClickableKt.m266clickableO2vRcR0$default(r0, interactionSource3, r8, enabled4, null, r18, r2, 8, null);
        Alignment contentAlignment$iv = Alignment.Companion.getCenter();
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = (48 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r17 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        Modifier modifier3 = modifier2;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L99;
        ComposablesKt.invalidApplier();
    L99:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L102;
        Function0<ComposeUiNode> r1 = r17;
        $composer2.createNode(r1);
    L103:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r7 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L109;
        int $changed$iv = 48;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == true) goto L111;
    L110:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r7);
    L111:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r9 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r12 = BoxScopeInstance.INSTANCE;
        int r13 = (($changed$iv >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 782643754, "C110@5014L84:IconButton.kt#uh7d8r");
        long contentColor = colors3.m2257contentColorvNxB06k$material3_release(enabled4);
        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4356boximpl(contentColor)), r35, $composer2, ProvidedValue.$stable | ((other$iv >> 12) & 112));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L114;
        ComposerKt.traceEventEnd();
    L114:
        final MutableInteractionSource interactionSource4 = interactionSource3;
        final Modifier modifier4 = modifier3;
        final boolean enabled5 = enabled4;
    L115:
        ScopeUpdateScope r14 = $composer2.endRestartGroup();
        if (r14 == null) goto L119;
        r14.updateScope(new C05242(r30, modifier4, enabled5, colors3, interactionSource4, r35, $changed, r38));
        return;
    L119:
        return;
    L109:
        $changed$iv = 48;
        goto L110
    L102:
        r1 = r17;
        $composer2.useNode();
        goto L103
    L92:
        boolean r15 = enabled2;
        $dirty2 = $dirty;
        enabled3 = r15;
        colors3 = colors2;
        interactionSource2 = r11;
        goto L93
    L84:
        modifier2 = r4;
        goto L85
    L76:
        if ($composer2.getDefaultsInvalid() == true) goto L82;
        $composer2.skipToGroupEnd();
        if ((r38 & 8) == 0) goto L81;
        $dirty = $dirty & (-7169);
    L81:
        boolean r19 = enabled2;
        $dirty2 = $dirty;
        enabled3 = r19;
        modifier2 = r4;
        colors3 = colors2;
        interactionSource2 = r11;
        goto L93
    L70:
        if ($composer2.getSkipping() == false) goto L73;
        $composer2.skipToGroupEnd();
        modifier4 = r4;
        colors3 = colors2;
        interactionSource4 = r11;
        enabled5 = enabled2;
        goto L115
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L68;
        if ($composer2.changedInstance(r35) == false) goto L65;
        int r110 = 131072;
    L66:
        $dirty = $dirty | r110;
        goto L68
    L65:
        r110 = 65536;
        goto L66
    L50:
        if (($changed & 24576) != 0) goto L56;
        r11 = interactionSource;
        if ($composer2.changed(r11) == false) goto L54;
        int r111 = 16384;
    L55:
        $dirty = $dirty | r111;
        goto L58
    L54:
        r111 = 8192;
        goto L55
    L56:
        r11 = interactionSource;
        goto L58
    L38:
        if ((r38 & 8) != 0) goto L42;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L43;
        int r112 = 2048;
    L44:
        $dirty = $dirty | r112;
    L43:
        r112 = 1024;
        goto L44
    L42:
        colors2 = colors;
        goto L43
    L28:
        if (($changed & 384) != 0) goto L34;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L32;
        int r20 = 256;
    L33:
        $dirty = $dirty | r20;
        goto L36
    L32:
        r20 = 128;
        goto L33
    L34:
        enabled2 = enabled;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L21;
        int r21 = 32;
    L22:
        $dirty = $dirty | r21;
        goto L24
    L21:
        r21 = 16;
        goto L22
    L23:
        r4 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r2 = r30;
        if ($composer2.changedInstance(r2) == false) goto L10;
        int r22 = 4;
    L11:
        $dirty = $dirty | r22;
        goto L13
    L10:
        r22 = 2;
        goto L11
    L12:
        r2 = r30;
        goto L13
    }

    public static final void IconToggleButton(final boolean checked, final Function1<? super Boolean, Unit> r32, Modifier modifier, boolean enabled, IconToggleButtonColors colors, MutableInteractionSource interactionSource, final Function2<? super Composer, ? super Integer, Unit> r37, Composer $composer, final int $changed, final int r40) {
        Composer $composer2 = $composer.startRestartGroup(692561811);
        ComposerKt.sourceInformation($composer2, "C(IconToggleButton)P(!1,6,5,3!1,4)150@7170L24,159@7503L5,160@7553L32,168@7909L175,154@7297L1028:IconButton.kt#uh7d8r");
        int $dirty = $changed;
        if ((r40 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r40 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
        Function1<? super Boolean, Unit> r6 = r32;
    L23:
        int r3 = r40 & 4;
        if (r3 == 0) goto L27;
        $dirty = $dirty | 384;
        Modifier r4 = modifier;
    L34:
        int r5 = r40 & 8;
        if (r5 == 0) goto L38;
        $dirty = $dirty | 3072;
        boolean r9 = enabled;
    L46:
        if (($changed & 24576) == 0) goto L48;
        IconToggleButtonColors colors2 = colors;
    L56:
        int r11 = r40 & 32;
        if (r11 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        MutableInteractionSource r12 = interactionSource;
    L68:
        if ((r40 & 64) == 0) goto L71;
        $dirty = $dirty | 1572864;
    L78:
        if ((599187 & $dirty) == 599186) goto L80;
    L83:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L86;
    L92:
        if (r3 == 0) goto L94;
        Modifier.Companion modifier2 = Modifier.Companion;
    L95:
        if (r5 == 0) goto L97;
        final boolean enabled2 = true;
    L99:
        if ((r40 & 16) == 0) goto L101;
        $dirty = $dirty & (-57345);
        colors2 = IconButtonDefaults.INSTANCE.iconToggleButtonColors($composer2, 6);
    L101:
        if (r11 == 0) goto L103;
        MutableInteractionSource interactionSource2 = null;
        Modifier modifier3 = modifier2;
        int $dirty2 = $dirty;
        IconToggleButtonColors colors3 = colors2;
    L104:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L107;
        ComposerKt.traceEventStart(692561811, $dirty2, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:153)");
    L107:
        Modifier r0 = BackgroundKt.m234backgroundbw27NRU$default(ClipKt.clip(SizeKt.m772size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), IconButtonTokens.INSTANCE.m3417getStateLayerSizeD9Ej5fM()), ShapesKt.getValue(IconButtonTokens.INSTANCE.getStateLayerShape(), $composer2, 6)), colors3.containerColor$material3_release(enabled2, checked, $composer2, ((($dirty2 >> 9) & 14) | (($dirty2 << 3) & 112)) | (($dirty2 >> 6) & 896)).getValue().m4376unboximpl(), null, 2, null);
        int r17 = Role.Companion.m6183getCheckboxo7Vup1c();
        float arg0$iv = IconButtonTokens.INSTANCE.m3417getStateLayerSizeD9Ej5fM();
        float arg0$iv2 = Dp.m6973constructorimpl(arg0$iv / 2);
        IconToggleButtonColors colors4 = colors3;
        MutableInteractionSource interactionSource3 = interactionSource2;
        int $dirty3 = $dirty2;
        Modifier modifier$iv = ToggleableKt.m991toggleableO2vRcR0(r0, checked, interactionSource3, RippleKt.m2534rippleOrFallbackImplementation9IZ8Weo(false, arg0$iv2, 0, $composer2, 54, 4), enabled2, Role.m6174boximpl(r17), r6);
        Alignment contentAlignment$iv = Alignment.Companion.getCenter();
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = (48 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r18 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L110;
        ComposablesKt.invalidApplier();
    L110:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L113;
        Function0<ComposeUiNode> r1 = r18;
        $composer2.createNode(r1);
    L114:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L121;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L121;
    L122:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r7 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r8 = BoxScopeInstance.INSTANCE;
        int r10 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -131204793, "C175@8190L30,176@8235L84:IconButton.kt#uh7d8r");
        long contentColor = colors4.contentColor$material3_release(enabled2, checked, $composer2, ((($dirty3 >> 9) & 14) | (($dirty3 << 3) & 112)) | (($dirty3 >> 6) & 896)).getValue().m4376unboximpl();
        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4356boximpl(contentColor)), r37, $composer2, ProvidedValue.$stable | (($dirty3 >> 15) & 112));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L125;
        ComposerKt.traceEventEnd();
    L125:
        final MutableInteractionSource interactionSource4 = interactionSource3;
        final IconToggleButtonColors colors5 = colors4;
        final Modifier modifier4 = modifier3;
    L126:
        ScopeUpdateScope r13 = $composer2.endRestartGroup();
        if (r13 == null) goto L130;
        r13.updateScope(new C05252(checked, r32, modifier4, enabled2, colors5, interactionSource4, r37, $changed, r40));
        return;
    L130:
        return;
    L121:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r2);
        goto L122
    L113:
        r1 = r18;
        $composer2.useNode();
        goto L114
    L103:
        modifier3 = modifier2;
        interactionSource2 = r12;
        $dirty2 = $dirty;
        colors3 = colors2;
        goto L104
    L97:
        enabled2 = enabled;
        goto L99
    L94:
        modifier2 = r4;
        goto L95
    L86:
        if ($composer2.getDefaultsInvalid() == true) goto L92;
        $composer2.skipToGroupEnd();
        if ((r40 & 16) == 0) goto L91;
        $dirty = $dirty & (-57345);
    L91:
        $dirty2 = $dirty;
        modifier3 = r4;
        colors3 = colors2;
        interactionSource2 = r12;
        enabled2 = enabled;
        goto L104
    L80:
        if ($composer2.getSkipping() == false) goto L83;
        $composer2.skipToGroupEnd();
        modifier4 = r4;
        enabled2 = r9;
        colors5 = colors2;
        interactionSource4 = r12;
        goto L126
    L71:
        if (($changed & 1572864) != 0) goto L78;
        if ($composer2.changedInstance(r37) == false) goto L75;
        int r14 = 1048576;
    L76:
        $dirty = $dirty | r14;
        goto L78
    L75:
        r14 = 524288;
        goto L76
    L60:
        if ((196608 & $changed) != 0) goto L66;
        r12 = interactionSource;
        if ($composer2.changed(r12) == false) goto L64;
        int r15 = 131072;
    L65:
        $dirty = $dirty | r15;
        goto L68
    L64:
        r15 = 65536;
        goto L65
    L66:
        r12 = interactionSource;
        goto L68
    L48:
        if ((r40 & 16) != 0) goto L52;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L53;
        int r16 = 16384;
    L54:
        $dirty = $dirty | r16;
    L53:
        r16 = 8192;
        goto L54
    L52:
        colors2 = colors;
        goto L53
    L38:
        if (($changed & 3072) != 0) goto L44;
        r9 = enabled;
        if ($composer2.changed(r9) == false) goto L42;
        int r19 = 2048;
    L43:
        $dirty = $dirty | r19;
        goto L46
    L42:
        r19 = 1024;
        goto L43
    L44:
        r9 = enabled;
        goto L46
    L27:
        if (($changed & 384) != 0) goto L33;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L31;
        int r20 = 256;
    L32:
        $dirty = $dirty | r20;
        goto L34
    L31:
        r20 = 128;
        goto L32
    L33:
        r4 = modifier;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L22;
        r6 = r32;
        if ($composer2.changedInstance(r6) == false) goto L20;
        int r21 = 32;
    L21:
        $dirty = $dirty | r21;
        goto L23
    L20:
        r21 = 16;
        goto L21
    L22:
        r6 = r32;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(checked) == false) goto L10;
        int r22 = 4;
    L11:
        $dirty = $dirty | r22;
        goto L13
    L10:
        r22 = 2;
        goto L11
    }

    public static final void FilledIconButton(final Function0<Unit> r26, Modifier modifier, boolean enabled, Shape shape, IconButtonColors colors, MutableInteractionSource interactionSource, final Function2<? super Composer, ? super Integer, Unit> r32, Composer $composer, final int $changed, final int r35) {
        Composer $composer2 = $composer.startRestartGroup(1594730011);
        ComposerKt.sourceInformation($composer2, "C(FilledIconButton)P(5,4,2,6!1,3)217@10330L11,218@10393L24,230@10821L320,222@10520L621:IconButton.kt#uh7d8r");
        int $dirty = $changed;
        if ((r35 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0<Unit> r9 = r26;
    L13:
        int r3 = r35 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r4 = modifier;
    L24:
        int r5 = r35 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        boolean enabled2 = enabled;
    L36:
        if (($changed & 3072) == 0) goto L38;
        Shape shape2 = shape;
    L47:
        if (($changed & 24576) == 0) goto L49;
        IconButtonColors colors2 = colors;
    L57:
        int r12 = r35 & 32;
        if (r12 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        MutableInteractionSource r13 = interactionSource;
    L69:
        if ((r35 & 64) == 0) goto L72;
        $dirty = $dirty | 1572864;
    L79:
        if ((599187 & $dirty) == 599186) goto L81;
    L84:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L87;
    L96:
        if (r3 == 0) goto L98;
        Modifier.Companion modifier2 = Modifier.Companion;
    L99:
        if (r5 == 0) goto L102;
        enabled2 = true;
    L102:
        if ((r35 & 8) == 0) goto L105;
        $dirty = $dirty & (-7169);
        shape2 = IconButtonDefaults.INSTANCE.getFilledShape($composer2, 6);
    L105:
        if ((r35 & 16) == 0) goto L107;
        $dirty = $dirty & (-57345);
        colors2 = IconButtonDefaults.INSTANCE.filledIconButtonColors($composer2, 6);
    L107:
        if (r12 == 0) goto L109;
        MutableInteractionSource interactionSource2 = null;
        Shape shape3 = shape2;
        int $dirty2 = $dirty;
        IconButtonColors colors3 = colors2;
        boolean enabled3 = enabled2;
    L110:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L113;
        ComposerKt.traceEventStart(1594730011, $dirty2, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:222)");
    L113:
        Composer $composer3 = $composer2;
        SurfaceKt.m2673Surfaceo_FOJdg(r9, SemanticsModifierKt.semantics$default(modifier2, false, AnonymousClass1.INSTANCE, 1, null), enabled3, shape3, colors3.m2256containerColorvNxB06k$material3_release(enabled3), colors3.m2257contentColorvNxB06k$material3_release(enabled3), 0.0f, 0.0f, null, interactionSource2, ComposableLambdaKt.rememberComposableLambda(-1560623888, true, new AnonymousClass2(r32), $composer2, 54), $composer3, ((($dirty2 & 14) | ($dirty2 & 896)) | ($dirty2 & 7168)) | (($dirty2 << 12) & 1879048192), 6, 448);
        if (ComposerKt.isTraceInProgress() == false) goto L116;
        ComposerKt.traceEventEnd();
    L116:
        final IconButtonColors colors4 = colors3;
        final Modifier modifier3 = modifier2;
        final boolean enabled4 = enabled3;
        final Shape shape4 = shape3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
    L117:
        ScopeUpdateScope r11 = $composer3.endRestartGroup();
        if (r11 == null) goto L121;
        r11.updateScope(new AnonymousClass3(r26, modifier3, enabled4, shape4, colors4, interactionSource3, r32, $changed, r35));
        return;
    L121:
        return;
    L109:
        $dirty2 = $dirty;
        shape3 = shape2;
        colors3 = colors2;
        interactionSource2 = r13;
        enabled3 = enabled2;
        goto L110
    L98:
        modifier2 = r4;
        goto L99
    L87:
        if ($composer2.getDefaultsInvalid() == true) goto L96;
        $composer2.skipToGroupEnd();
        if ((r35 & 8) == 0) goto L93;
        $dirty = $dirty & (-7169);
    L93:
        if ((r35 & 16) == 0) goto L95;
        $dirty = $dirty & (-57345);
    L95:
        modifier2 = r4;
        shape3 = shape2;
        interactionSource2 = r13;
        $dirty2 = $dirty;
        colors3 = colors2;
        enabled3 = enabled2;
        goto L110
    L81:
        if ($composer2.getSkipping() == false) goto L84;
        $composer2.skipToGroupEnd();
        modifier3 = r4;
        shape4 = shape2;
        $composer3 = $composer2;
        enabled4 = enabled2;
        colors4 = colors2;
        interactionSource3 = r13;
        goto L117
    L72:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changedInstance(r32) == false) goto L76;
        int r14 = 1048576;
    L77:
        $dirty = $dirty | r14;
        goto L79
    L76:
        r14 = 524288;
        goto L77
    L61:
        if ((196608 & $changed) != 0) goto L67;
        r13 = interactionSource;
        if ($composer2.changed(r13) == false) goto L65;
        int r15 = 131072;
    L66:
        $dirty = $dirty | r15;
        goto L69
    L65:
        r15 = 65536;
        goto L66
    L67:
        r13 = interactionSource;
        goto L69
    L49:
        if ((r35 & 16) != 0) goto L53;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L54;
        int r16 = 16384;
    L55:
        $dirty = $dirty | r16;
    L54:
        r16 = 8192;
        goto L55
    L53:
        colors2 = colors;
        goto L54
    L38:
        if ((r35 & 8) != 0) goto L42;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L43;
        int r17 = 2048;
    L44:
        $dirty = $dirty | r17;
    L43:
        r17 = 1024;
        goto L44
    L42:
        shape2 = shape;
        goto L43
    L28:
        if (($changed & 384) != 0) goto L34;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L32;
        int r10 = 256;
    L33:
        $dirty = $dirty | r10;
        goto L36
    L32:
        r10 = 128;
        goto L33
    L34:
        enabled2 = enabled;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L21;
        int r6 = 32;
    L22:
        $dirty = $dirty | r6;
        goto L24
    L21:
        r6 = 16;
        goto L22
    L23:
        r4 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r9 = r26;
        if ($composer2.changedInstance(r9) == false) goto L10;
        int r7 = 4;
    L11:
        $dirty = $dirty | r7;
        goto L13
    L10:
        r7 = 2;
        goto L11
    L12:
        r9 = r26;
        goto L13
    }

    public static final void FilledTonalIconButton(final Function0<Unit> r26, Modifier modifier, boolean enabled, Shape shape, IconButtonColors colors, MutableInteractionSource interactionSource, final Function2<? super Composer, ? super Integer, Unit> r32, Composer $composer, final int $changed, final int r35) {
        Composer $composer2 = $composer.startRestartGroup(-783937767);
        ComposerKt.sourceInformation($composer2, "C(FilledTonalIconButton)P(5,4,2,6!1,3)284@13478L11,285@13541L29,297@13974L330,289@13673L631:IconButton.kt#uh7d8r");
        int $dirty = $changed;
        if ((r35 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0<Unit> r9 = r26;
    L13:
        int r3 = r35 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r4 = modifier;
    L24:
        int r5 = r35 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        boolean enabled2 = enabled;
    L36:
        if (($changed & 3072) == 0) goto L38;
        Shape shape2 = shape;
    L47:
        if (($changed & 24576) == 0) goto L49;
        IconButtonColors colors2 = colors;
    L57:
        int r12 = r35 & 32;
        if (r12 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        MutableInteractionSource r13 = interactionSource;
    L69:
        if ((r35 & 64) == 0) goto L72;
        $dirty = $dirty | 1572864;
    L79:
        if ((599187 & $dirty) == 599186) goto L81;
    L84:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L87;
    L96:
        if (r3 == 0) goto L98;
        Modifier.Companion modifier2 = Modifier.Companion;
    L99:
        if (r5 == 0) goto L102;
        enabled2 = true;
    L102:
        if ((r35 & 8) == 0) goto L105;
        $dirty = $dirty & (-7169);
        shape2 = IconButtonDefaults.INSTANCE.getFilledShape($composer2, 6);
    L105:
        if ((r35 & 16) == 0) goto L107;
        $dirty = $dirty & (-57345);
        colors2 = IconButtonDefaults.INSTANCE.filledTonalIconButtonColors($composer2, 6);
    L107:
        if (r12 == 0) goto L109;
        MutableInteractionSource interactionSource2 = null;
        Shape shape3 = shape2;
        int $dirty2 = $dirty;
        IconButtonColors colors3 = colors2;
        boolean enabled3 = enabled2;
    L110:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L113;
        ComposerKt.traceEventStart(-783937767, $dirty2, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:289)");
    L113:
        Composer $composer3 = $composer2;
        SurfaceKt.m2673Surfaceo_FOJdg(r9, SemanticsModifierKt.semantics$default(modifier2, false, C05181.INSTANCE, 1, null), enabled3, shape3, colors3.m2256containerColorvNxB06k$material3_release(enabled3), colors3.m2257contentColorvNxB06k$material3_release(enabled3), 0.0f, 0.0f, null, interactionSource2, ComposableLambdaKt.rememberComposableLambda(-1772884636, true, new C05192(r32), $composer2, 54), $composer3, ((($dirty2 & 14) | ($dirty2 & 896)) | ($dirty2 & 7168)) | (($dirty2 << 12) & 1879048192), 6, 448);
        if (ComposerKt.isTraceInProgress() == false) goto L116;
        ComposerKt.traceEventEnd();
    L116:
        final IconButtonColors colors4 = colors3;
        final Modifier modifier3 = modifier2;
        final boolean enabled4 = enabled3;
        final Shape shape4 = shape3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
    L117:
        ScopeUpdateScope r11 = $composer3.endRestartGroup();
        if (r11 == null) goto L121;
        r11.updateScope(new C05203(r26, modifier3, enabled4, shape4, colors4, interactionSource3, r32, $changed, r35));
        return;
    L121:
        return;
    L109:
        $dirty2 = $dirty;
        shape3 = shape2;
        colors3 = colors2;
        interactionSource2 = r13;
        enabled3 = enabled2;
        goto L110
    L98:
        modifier2 = r4;
        goto L99
    L87:
        if ($composer2.getDefaultsInvalid() == true) goto L96;
        $composer2.skipToGroupEnd();
        if ((r35 & 8) == 0) goto L93;
        $dirty = $dirty & (-7169);
    L93:
        if ((r35 & 16) == 0) goto L95;
        $dirty = $dirty & (-57345);
    L95:
        modifier2 = r4;
        shape3 = shape2;
        interactionSource2 = r13;
        $dirty2 = $dirty;
        colors3 = colors2;
        enabled3 = enabled2;
        goto L110
    L81:
        if ($composer2.getSkipping() == false) goto L84;
        $composer2.skipToGroupEnd();
        modifier3 = r4;
        shape4 = shape2;
        $composer3 = $composer2;
        enabled4 = enabled2;
        colors4 = colors2;
        interactionSource3 = r13;
        goto L117
    L72:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changedInstance(r32) == false) goto L76;
        int r14 = 1048576;
    L77:
        $dirty = $dirty | r14;
        goto L79
    L76:
        r14 = 524288;
        goto L77
    L61:
        if ((196608 & $changed) != 0) goto L67;
        r13 = interactionSource;
        if ($composer2.changed(r13) == false) goto L65;
        int r15 = 131072;
    L66:
        $dirty = $dirty | r15;
        goto L69
    L65:
        r15 = 65536;
        goto L66
    L67:
        r13 = interactionSource;
        goto L69
    L49:
        if ((r35 & 16) != 0) goto L53;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L54;
        int r16 = 16384;
    L55:
        $dirty = $dirty | r16;
    L54:
        r16 = 8192;
        goto L55
    L53:
        colors2 = colors;
        goto L54
    L38:
        if ((r35 & 8) != 0) goto L42;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L43;
        int r17 = 2048;
    L44:
        $dirty = $dirty | r17;
    L43:
        r17 = 1024;
        goto L44
    L42:
        shape2 = shape;
        goto L43
    L28:
        if (($changed & 384) != 0) goto L34;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L32;
        int r10 = 256;
    L33:
        $dirty = $dirty | r10;
        goto L36
    L32:
        r10 = 128;
        goto L33
    L34:
        enabled2 = enabled;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L21;
        int r6 = 32;
    L22:
        $dirty = $dirty | r6;
        goto L24
    L21:
        r6 = 16;
        goto L22
    L23:
        r4 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r9 = r26;
        if ($composer2.changedInstance(r9) == false) goto L10;
        int r7 = 4;
    L11:
        $dirty = $dirty | r7;
        goto L13
    L10:
        r7 = 2;
        goto L11
    L12:
        r9 = r26;
        goto L13
    }

    public static final void FilledIconToggleButton(final boolean checked, final Function1<? super Boolean, Unit> r24, Modifier modifier, boolean enabled, Shape shape, IconToggleButtonColors colors, MutableInteractionSource interactionSource, final Function2<? super Composer, ? super Integer, Unit> r30, Composer $composer, final int $changed, final int r33) {
        Composer $composer2 = $composer.startRestartGroup(-1708189280);
        ComposerKt.sourceInformation($composer2, "C(FilledIconToggleButton)P(!1,6,5,3,7!1,4)349@16472L11,350@16541L30,360@16890L32,361@16960L30,363@17050L320,354@16674L696:IconButton.kt#uh7d8r");
        int $dirty = $changed;
        if ((r33 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r33 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L23:
        int r7 = r33 & 4;
        if (r7 == 0) goto L27;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L34:
        int r9 = r33 & 8;
        if (r9 == 0) goto L38;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L46:
        if (($changed & 24576) == 0) goto L48;
        Shape shape2 = shape;
    L57:
        if ((196608 & $changed) == 0) goto L59;
        IconToggleButtonColors colors2 = colors;
    L67:
        int r13 = r33 & 64;
        if (r13 == 0) goto L71;
        $dirty = $dirty | 1572864;
        MutableInteractionSource r15 = interactionSource;
    L79:
        if ((r33 & 128) == 0) goto L82;
        $dirty = $dirty | 12582912;
    L89:
        if ((4793491 & $dirty) == 4793490) goto L91;
    L94:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L97;
    L106:
        if (r7 == 0) goto L108;
        modifier2 = Modifier.Companion;
    L108:
        if (r9 == 0) goto L111;
        enabled2 = true;
    L111:
        if ((r33 & 16) == 0) goto L114;
        $dirty = $dirty & (-57345);
        shape2 = IconButtonDefaults.INSTANCE.getFilledShape($composer2, 6);
    L114:
        if ((r33 & 32) == 0) goto L116;
        $dirty = $dirty & (-458753);
        colors2 = IconButtonDefaults.INSTANCE.filledIconToggleButtonColors($composer2, 6);
    L116:
        if (r13 == 0) goto L118;
        int $dirty2 = $dirty;
        boolean enabled3 = enabled2;
        Shape shape3 = shape2;
        IconToggleButtonColors colors3 = colors2;
        MutableInteractionSource interactionSource2 = null;
        Modifier modifier3 = modifier2;
    L119:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L122;
        ComposerKt.traceEventStart(-1708189280, $dirty2, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:354)");
    L122:
        IconToggleButtonColors colors4 = colors3;
        Modifier modifier4 = modifier3;
        SurfaceKt.m2672Surfaced85dljk(checked, r24, SemanticsModifierKt.semantics$default(modifier3, false, C05151.INSTANCE, 1, null), enabled3, shape3, colors3.containerColor$material3_release(enabled3, checked, $composer2, ((($dirty2 >> 9) & 14) | (($dirty2 << 3) & 112)) | (($dirty2 >> 9) & 896)).getValue().m4376unboximpl(), colors3.contentColor$material3_release(enabled3, checked, $composer2, ((($dirty2 >> 9) & 14) | (($dirty2 << 3) & 112)) | (($dirty2 >> 9) & 896)).getValue().m4376unboximpl(), 0.0f, 0.0f, null, interactionSource2, ComposableLambdaKt.rememberComposableLambda(1235871670, true, new C05162(r30), $composer2, 54), $composer2, ((($dirty2 & 14) | ($dirty2 & 112)) | ($dirty2 & 7168)) | (57344 & $dirty2), (($dirty2 >> 18) & 14) | 48, 896);
        if (ComposerKt.isTraceInProgress() == false) goto L125;
        ComposerKt.traceEventEnd();
    L125:
        final Shape shape4 = shape3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
        final IconToggleButtonColors colors5 = colors4;
        final boolean enabled4 = enabled3;
        final Modifier modifier5 = modifier4;
    L126:
        ScopeUpdateScope r11 = $composer2.endRestartGroup();
        if (r11 == null) goto L130;
        r11.updateScope(new C05173(checked, r24, modifier5, enabled4, shape4, colors5, interactionSource3, r30, $changed, r33));
        return;
    L130:
        return;
    L118:
        $dirty2 = $dirty;
        modifier3 = modifier2;
        enabled3 = enabled2;
        shape3 = shape2;
        colors3 = colors2;
        interactionSource2 = r15;
        goto L119
    L97:
        if ($composer2.getDefaultsInvalid() == true) goto L106;
        $composer2.skipToGroupEnd();
        if ((r33 & 16) == 0) goto L103;
        $dirty = $dirty & (-57345);
    L103:
        if ((r33 & 32) == 0) goto L105;
        $dirty2 = $dirty & (-458753);
        modifier3 = modifier2;
        enabled3 = enabled2;
        shape3 = shape2;
        colors3 = colors2;
        interactionSource2 = r15;
        goto L119
    L105:
        $dirty2 = $dirty;
        modifier3 = modifier2;
        enabled3 = enabled2;
        shape3 = shape2;
        colors3 = colors2;
        interactionSource2 = r15;
        goto L119
    L91:
        if ($composer2.getSkipping() == false) goto L94;
        $composer2.skipToGroupEnd();
        modifier5 = modifier2;
        enabled4 = enabled2;
        shape4 = shape2;
        colors5 = colors2;
        interactionSource3 = r15;
        goto L126
    L82:
        if (($changed & 12582912) != 0) goto L89;
        if ($composer2.changedInstance(r30) == false) goto L86;
        int r4 = 8388608;
    L87:
        $dirty = $dirty | r4;
        goto L89
    L86:
        r4 = 4194304;
        goto L87
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
        if ((r33 & 32) != 0) goto L63;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L64;
        int r14 = 131072;
    L65:
        $dirty = $dirty | r14;
    L64:
        r14 = 65536;
        goto L65
    L63:
        colors2 = colors;
        goto L64
    L48:
        if ((r33 & 16) != 0) goto L52;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L53;
        int r12 = 16384;
    L54:
        $dirty = $dirty | r12;
    L53:
        r12 = 8192;
        goto L54
    L52:
        shape2 = shape;
        goto L53
    L38:
        if (($changed & 3072) != 0) goto L44;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L42;
        int r17 = 2048;
    L43:
        $dirty = $dirty | r17;
        goto L46
    L42:
        r17 = 1024;
        goto L43
    L44:
        enabled2 = enabled;
        goto L46
    L27:
        if (($changed & 384) != 0) goto L33;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L31;
        int r10 = 256;
    L32:
        $dirty = $dirty | r10;
        goto L34
    L31:
        r10 = 128;
        goto L32
    L33:
        modifier2 = modifier;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changedInstance(r24) == false) goto L20;
        int r8 = 32;
    L21:
        $dirty = $dirty | r8;
        goto L23
    L20:
        r8 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(checked) == false) goto L10;
        int r6 = 4;
    L11:
        $dirty = $dirty | r6;
        goto L13
    L10:
        r6 = 2;
        goto L11
    }

    public static final void FilledTonalIconToggleButton(final boolean checked, final Function1<? super Boolean, Unit> r24, Modifier modifier, boolean enabled, Shape shape, IconToggleButtonColors colors, MutableInteractionSource interactionSource, final Function2<? super Composer, ? super Integer, Unit> r30, Composer $composer, final int $changed, final int r33) {
        Composer $composer2 = $composer.startRestartGroup(1676089246);
        ComposerKt.sourceInformation($composer2, "C(FilledTonalIconToggleButton)P(!1,6,5,3,7!1,4)420@19894L11,421@19963L35,431@20317L32,432@20387L30,434@20477L330,425@20101L706:IconButton.kt#uh7d8r");
        int $dirty = $changed;
        if ((r33 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r33 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L23:
        int r7 = r33 & 4;
        if (r7 == 0) goto L27;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L34:
        int r9 = r33 & 8;
        if (r9 == 0) goto L38;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L46:
        if (($changed & 24576) == 0) goto L48;
        Shape shape2 = shape;
    L57:
        if ((196608 & $changed) == 0) goto L59;
        IconToggleButtonColors colors2 = colors;
    L67:
        int r13 = r33 & 64;
        if (r13 == 0) goto L71;
        $dirty = $dirty | 1572864;
        MutableInteractionSource r15 = interactionSource;
    L79:
        if ((r33 & 128) == 0) goto L82;
        $dirty = $dirty | 12582912;
    L89:
        if ((4793491 & $dirty) == 4793490) goto L91;
    L94:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L97;
    L106:
        if (r7 == 0) goto L108;
        modifier2 = Modifier.Companion;
    L108:
        if (r9 == 0) goto L111;
        enabled2 = true;
    L111:
        if ((r33 & 16) == 0) goto L114;
        $dirty = $dirty & (-57345);
        shape2 = IconButtonDefaults.INSTANCE.getFilledShape($composer2, 6);
    L114:
        if ((r33 & 32) == 0) goto L116;
        $dirty = $dirty & (-458753);
        colors2 = IconButtonDefaults.INSTANCE.filledTonalIconToggleButtonColors($composer2, 6);
    L116:
        if (r13 == 0) goto L118;
        int $dirty2 = $dirty;
        boolean enabled3 = enabled2;
        Shape shape3 = shape2;
        IconToggleButtonColors colors3 = colors2;
        MutableInteractionSource interactionSource2 = null;
        Modifier modifier3 = modifier2;
    L119:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L122;
        ComposerKt.traceEventStart(1676089246, $dirty2, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:425)");
    L122:
        IconToggleButtonColors colors4 = colors3;
        Modifier modifier4 = modifier3;
        SurfaceKt.m2672Surfaced85dljk(checked, r24, SemanticsModifierKt.semantics$default(modifier3, false, C05211.INSTANCE, 1, null), enabled3, shape3, colors3.containerColor$material3_release(enabled3, checked, $composer2, ((($dirty2 >> 9) & 14) | (($dirty2 << 3) & 112)) | (($dirty2 >> 9) & 896)).getValue().m4376unboximpl(), colors3.contentColor$material3_release(enabled3, checked, $composer2, ((($dirty2 >> 9) & 14) | (($dirty2 << 3) & 112)) | (($dirty2 >> 9) & 896)).getValue().m4376unboximpl(), 0.0f, 0.0f, null, interactionSource2, ComposableLambdaKt.rememberComposableLambda(-58218680, true, new C05222(r30), $composer2, 54), $composer2, ((($dirty2 & 14) | ($dirty2 & 112)) | ($dirty2 & 7168)) | (57344 & $dirty2), (($dirty2 >> 18) & 14) | 48, 896);
        if (ComposerKt.isTraceInProgress() == false) goto L125;
        ComposerKt.traceEventEnd();
    L125:
        final Shape shape4 = shape3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
        final IconToggleButtonColors colors5 = colors4;
        final boolean enabled4 = enabled3;
        final Modifier modifier5 = modifier4;
    L126:
        ScopeUpdateScope r11 = $composer2.endRestartGroup();
        if (r11 == null) goto L130;
        r11.updateScope(new C05233(checked, r24, modifier5, enabled4, shape4, colors5, interactionSource3, r30, $changed, r33));
        return;
    L130:
        return;
    L118:
        $dirty2 = $dirty;
        modifier3 = modifier2;
        enabled3 = enabled2;
        shape3 = shape2;
        colors3 = colors2;
        interactionSource2 = r15;
        goto L119
    L97:
        if ($composer2.getDefaultsInvalid() == true) goto L106;
        $composer2.skipToGroupEnd();
        if ((r33 & 16) == 0) goto L103;
        $dirty = $dirty & (-57345);
    L103:
        if ((r33 & 32) == 0) goto L105;
        $dirty2 = $dirty & (-458753);
        modifier3 = modifier2;
        enabled3 = enabled2;
        shape3 = shape2;
        colors3 = colors2;
        interactionSource2 = r15;
        goto L119
    L105:
        $dirty2 = $dirty;
        modifier3 = modifier2;
        enabled3 = enabled2;
        shape3 = shape2;
        colors3 = colors2;
        interactionSource2 = r15;
        goto L119
    L91:
        if ($composer2.getSkipping() == false) goto L94;
        $composer2.skipToGroupEnd();
        modifier5 = modifier2;
        enabled4 = enabled2;
        shape4 = shape2;
        colors5 = colors2;
        interactionSource3 = r15;
        goto L126
    L82:
        if (($changed & 12582912) != 0) goto L89;
        if ($composer2.changedInstance(r30) == false) goto L86;
        int r4 = 8388608;
    L87:
        $dirty = $dirty | r4;
        goto L89
    L86:
        r4 = 4194304;
        goto L87
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
        if ((r33 & 32) != 0) goto L63;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L64;
        int r14 = 131072;
    L65:
        $dirty = $dirty | r14;
    L64:
        r14 = 65536;
        goto L65
    L63:
        colors2 = colors;
        goto L64
    L48:
        if ((r33 & 16) != 0) goto L52;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L53;
        int r12 = 16384;
    L54:
        $dirty = $dirty | r12;
    L53:
        r12 = 8192;
        goto L54
    L52:
        shape2 = shape;
        goto L53
    L38:
        if (($changed & 3072) != 0) goto L44;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L42;
        int r17 = 2048;
    L43:
        $dirty = $dirty | r17;
        goto L46
    L42:
        r17 = 1024;
        goto L43
    L44:
        enabled2 = enabled;
        goto L46
    L27:
        if (($changed & 384) != 0) goto L33;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L31;
        int r10 = 256;
    L32:
        $dirty = $dirty | r10;
        goto L34
    L31:
        r10 = 128;
        goto L32
    L33:
        modifier2 = modifier;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changedInstance(r24) == false) goto L20;
        int r8 = 32;
    L21:
        $dirty = $dirty | r8;
        goto L23
    L20:
        r8 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(checked) == false) goto L10;
        int r6 = 4;
    L11:
        $dirty = $dirty | r6;
        goto L13
    L10:
        r6 = 2;
        goto L11
    }

    public static final void OutlinedIconButton(final Function0<Unit> r28, Modifier modifier, boolean enabled, Shape shape, IconButtonColors colors, BorderStroke border, MutableInteractionSource interactionSource, final Function2<? super Composer, ? super Integer, Unit> r35, Composer $composer, final int $changed, final int r38) {
        Composer $composer2 = $composer.startRestartGroup(-1746603025);
        ComposerKt.sourceInformation($composer2, "C(OutlinedIconButton)P(6,5,3,7,1!1,4)491@23280L13,492@23345L26,493@23420L33,506@23882L190,497@23556L516:IconButton.kt#uh7d8r");
        int $dirty = $changed;
        if ((r38 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0<Unit> r11 = r28;
    L13:
        int r3 = r38 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r4 = modifier;
    L24:
        int r5 = r38 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        boolean enabled2 = enabled;
    L36:
        if (($changed & 3072) == 0) goto L38;
        Shape shape2 = shape;
    L47:
        if (($changed & 24576) == 0) goto L49;
        IconButtonColors colors2 = colors;
    L58:
        if ((196608 & $changed) == 0) goto L60;
        BorderStroke border2 = border;
    L68:
        int r14 = r38 & 64;
        if (r14 == 0) goto L72;
        $dirty = $dirty | 1572864;
        MutableInteractionSource r15 = interactionSource;
    L80:
        if ((r38 & 128) == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        if ((4793491 & $dirty) == 4793490) goto L92;
    L95:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L98;
    L110:
        if (r3 == 0) goto L112;
        Modifier.Companion modifier2 = Modifier.Companion;
    L113:
        if (r5 == 0) goto L116;
        enabled2 = true;
    L116:
        if ((r38 & 8) == 0) goto L119;
        $dirty = $dirty & (-7169);
        shape2 = IconButtonDefaults.INSTANCE.getOutlinedShape($composer2, 6);
    L119:
        if ((r38 & 16) == 0) goto L122;
        $dirty = $dirty & (-57345);
        colors2 = IconButtonDefaults.INSTANCE.outlinedIconButtonColors($composer2, 6);
    L122:
        if ((r38 & 32) == 0) goto L124;
        BorderStroke border3 = IconButtonDefaults.INSTANCE.outlinedIconButtonBorder(enabled2, $composer2, (($dirty >> 6) & 14) | 48);
        $dirty = $dirty & (-458753);
        border2 = border3;
    L124:
        if (r14 == 0) goto L126;
        MutableInteractionSource interactionSource2 = null;
        Shape shape3 = shape2;
        BorderStroke border4 = border2;
        int $dirty2 = $dirty;
        boolean enabled3 = enabled2;
        IconButtonColors colors3 = colors2;
    L127:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L130;
        ComposerKt.traceEventStart(-1746603025, $dirty2, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:497)");
    L130:
        Composer $composer3 = $composer2;
        SurfaceKt.m2673Surfaceo_FOJdg(r11, SemanticsModifierKt.semantics$default(modifier2, false, C05261.INSTANCE, 1, null), enabled3, shape3, colors3.m2256containerColorvNxB06k$material3_release(enabled3), colors3.m2257contentColorvNxB06k$material3_release(enabled3), 0.0f, 0.0f, border4, interactionSource2, ComposableLambdaKt.rememberComposableLambda(582332538, true, new C05272(r35), $composer2, 54), $composer3, (((($dirty2 & 14) | ($dirty2 & 896)) | ($dirty2 & 7168)) | (($dirty2 << 9) & 234881024)) | (1879048192 & ($dirty2 << 9)), 6, 192);
        if (ComposerKt.isTraceInProgress() == false) goto L133;
        ComposerKt.traceEventEnd();
    L133:
        final IconButtonColors colors4 = colors3;
        final boolean enabled4 = enabled3;
        final Shape shape4 = shape3;
        final BorderStroke border5 = border4;
        final MutableInteractionSource interactionSource3 = interactionSource2;
        final Modifier modifier3 = modifier2;
    L134:
        ScopeUpdateScope r12 = $composer3.endRestartGroup();
        if (r12 == null) goto L138;
        r12.updateScope(new C05283(r28, modifier3, enabled4, shape4, colors4, border5, interactionSource3, r35, $changed, r38));
        return;
    L138:
        return;
    L126:
        $dirty2 = $dirty;
        shape3 = shape2;
        colors3 = colors2;
        border4 = border2;
        interactionSource2 = r15;
        enabled3 = enabled2;
        goto L127
    L112:
        modifier2 = r4;
        goto L113
    L98:
        if ($composer2.getDefaultsInvalid() == true) goto L110;
        $composer2.skipToGroupEnd();
        if ((r38 & 8) == 0) goto L104;
        $dirty = $dirty & (-7169);
    L104:
        if ((r38 & 16) == 0) goto L107;
        $dirty = $dirty & (-57345);
    L107:
        if ((r38 & 32) == 0) goto L109;
        $dirty2 = $dirty & (-458753);
        modifier2 = r4;
        shape3 = shape2;
        colors3 = colors2;
        border4 = border2;
        interactionSource2 = r15;
        enabled3 = enabled2;
        goto L127
    L109:
        $dirty2 = $dirty;
        modifier2 = r4;
        shape3 = shape2;
        colors3 = colors2;
        border4 = border2;
        interactionSource2 = r15;
        enabled3 = enabled2;
        goto L127
    L92:
        if ($composer2.getSkipping() == false) goto L95;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier3 = r4;
        enabled4 = enabled2;
        shape4 = shape2;
        colors4 = colors2;
        border5 = border2;
        interactionSource3 = r15;
        goto L134
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changedInstance(r35) == false) goto L87;
        int r0 = 8388608;
    L88:
        $dirty = $dirty | r0;
        goto L90
    L87:
        r0 = 4194304;
        goto L88
    L72:
        if ((1572864 & $changed) != 0) goto L78;
        r15 = interactionSource;
        if ($composer2.changed(r15) == false) goto L76;
        int r16 = 1048576;
    L77:
        $dirty = $dirty | r16;
        goto L80
    L76:
        r16 = 524288;
        goto L77
    L78:
        r15 = interactionSource;
        goto L80
    L60:
        if ((r38 & 32) != 0) goto L64;
        border2 = border;
        if ($composer2.changed(border2) == false) goto L65;
        int r17 = 131072;
    L66:
        $dirty = $dirty | r17;
    L65:
        r17 = 65536;
        goto L66
    L64:
        border2 = border;
        goto L65
    L49:
        if ((r38 & 16) != 0) goto L53;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L54;
        int r13 = 16384;
    L55:
        $dirty = $dirty | r13;
    L54:
        r13 = 8192;
        goto L55
    L53:
        colors2 = colors;
        goto L54
    L38:
        if ((r38 & 8) != 0) goto L42;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L43;
        int r18 = 2048;
    L44:
        $dirty = $dirty | r18;
    L43:
        r18 = 1024;
        goto L44
    L42:
        shape2 = shape;
        goto L43
    L28:
        if (($changed & 384) != 0) goto L34;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L32;
        int r7 = 256;
    L33:
        $dirty = $dirty | r7;
        goto L36
    L32:
        r7 = 128;
        goto L33
    L34:
        enabled2 = enabled;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L21;
        int r6 = 32;
    L22:
        $dirty = $dirty | r6;
        goto L24
    L21:
        r6 = 16;
        goto L22
    L23:
        r4 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r11 = r28;
        if ($composer2.changedInstance(r11) == false) goto L10;
        int r8 = 4;
    L11:
        $dirty = $dirty | r8;
        goto L13
    L10:
        r8 = 2;
        goto L11
    L12:
        r11 = r28;
        goto L13
    }

    public static final void OutlinedIconToggleButton(final boolean checked, final Function1<? super Boolean, Unit> r22, Modifier modifier, boolean enabled, Shape shape, IconToggleButtonColors colors, BorderStroke border, MutableInteractionSource interactionSource, final Function2<? super Composer, ? super Integer, Unit> r29, Composer $composer, final int $changed, final int r32) {
        Composer $composer2 = $composer.startRestartGroup(1470292106);
        ComposerKt.sourceInformation($composer2, "C(OutlinedIconToggleButton)P(1,7,6,4,8,2!1,5)555@26419L13,556@26490L32,557@26571L48,567@26938L32,568@27008L30,571@27123L190,561@26722L591:IconButton.kt#uh7d8r");
        int $dirty = $changed;
        if ((r32 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r32 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L23:
        int r7 = r32 & 4;
        if (r7 == 0) goto L27;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L34:
        int r9 = r32 & 8;
        if (r9 == 0) goto L38;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L46:
        if (($changed & 24576) == 0) goto L48;
        Shape shape2 = shape;
    L57:
        if ((196608 & $changed) == 0) goto L59;
        IconToggleButtonColors colors2 = colors;
    L68:
        if ((1572864 & $changed) == 0) goto L70;
        BorderStroke border2 = border;
    L78:
        int r15 = r32 & 128;
        if (r15 == 0) goto L82;
        $dirty = $dirty | 12582912;
        MutableInteractionSource r4 = interactionSource;
    L90:
        if ((r32 & 256) == 0) goto L93;
        $dirty = $dirty | 100663296;
    L100:
        if ((38347923 & $dirty) == 38347922) goto L102;
    L105:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L108;
    L120:
        if (r7 == 0) goto L122;
        modifier2 = Modifier.Companion;
    L122:
        if (r9 == 0) goto L125;
        enabled2 = true;
    L125:
        if ((r32 & 16) == 0) goto L128;
        $dirty = $dirty & (-57345);
        shape2 = IconButtonDefaults.INSTANCE.getOutlinedShape($composer2, 6);
    L128:
        if ((r32 & 32) == 0) goto L131;
        $dirty = $dirty & (-458753);
        colors2 = IconButtonDefaults.INSTANCE.outlinedIconToggleButtonColors($composer2, 6);
    L131:
        if ((r32 & 64) == 0) goto L133;
        BorderStroke border3 = IconButtonDefaults.INSTANCE.outlinedIconToggleButtonBorder(enabled2, checked, $composer2, ((($dirty >> 9) & 14) | 384) | (($dirty << 3) & 112));
        $dirty = $dirty & (-3670017);
        border2 = border3;
    L133:
        if (r15 == 0) goto L135;
        int $dirty2 = $dirty;
        boolean enabled3 = enabled2;
        Shape shape3 = shape2;
        IconToggleButtonColors colors3 = colors2;
        BorderStroke border4 = border2;
        MutableInteractionSource interactionSource2 = null;
        Modifier modifier3 = modifier2;
    L136:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L139;
        ComposerKt.traceEventStart(1470292106, $dirty2, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:561)");
    L139:
        Modifier modifier4 = modifier3;
        IconToggleButtonColors colors4 = colors3;
        SurfaceKt.m2672Surfaced85dljk(checked, r22, SemanticsModifierKt.semantics$default(modifier3, false, C05291.INSTANCE, 1, null), enabled3, shape3, colors3.containerColor$material3_release(enabled3, checked, $composer2, ((($dirty2 >> 9) & 14) | (($dirty2 << 3) & 112)) | (($dirty2 >> 9) & 896)).getValue().m4376unboximpl(), colors3.contentColor$material3_release(enabled3, checked, $composer2, (($dirty2 >> 9) & 896) | ((($dirty2 >> 9) & 14) | (($dirty2 << 3) & 112))).getValue().m4376unboximpl(), 0.0f, 0.0f, border4, interactionSource2, ComposableLambdaKt.rememberComposableLambda(1207657396, true, new C05302(r29), $composer2, 54), $composer2, (((($dirty2 & 14) | ($dirty2 & 112)) | ($dirty2 & 7168)) | (57344 & $dirty2)) | (1879048192 & ($dirty2 << 9)), (($dirty2 >> 21) & 14) | 48, 384);
        if (ComposerKt.isTraceInProgress() == false) goto L142;
        ComposerKt.traceEventEnd();
    L142:
        final Shape shape4 = shape3;
        final BorderStroke border5 = border4;
        final MutableInteractionSource interactionSource3 = interactionSource2;
        final IconToggleButtonColors colors5 = colors4;
        final boolean enabled4 = enabled3;
        final Modifier modifier5 = modifier4;
    L143:
        ScopeUpdateScope r12 = $composer2.endRestartGroup();
        if (r12 == null) goto L147;
        r12.updateScope(new C05313(checked, r22, modifier5, enabled4, shape4, colors5, border5, interactionSource3, r29, $changed, r32));
        return;
    L147:
        return;
    L135:
        $dirty2 = $dirty;
        modifier3 = modifier2;
        enabled3 = enabled2;
        colors3 = colors2;
        interactionSource2 = r4;
        shape3 = shape2;
        border4 = border2;
        goto L136
    L108:
        if ($composer2.getDefaultsInvalid() == true) goto L120;
        $composer2.skipToGroupEnd();
        if ((r32 & 16) == 0) goto L114;
        $dirty = $dirty & (-57345);
    L114:
        if ((r32 & 32) == 0) goto L117;
        $dirty = $dirty & (-458753);
    L117:
        if ((r32 & 64) == 0) goto L119;
        $dirty2 = $dirty & (-3670017);
        modifier3 = modifier2;
        enabled3 = enabled2;
        colors3 = colors2;
        interactionSource2 = r4;
        shape3 = shape2;
        border4 = border2;
        goto L136
    L119:
        $dirty2 = $dirty;
        modifier3 = modifier2;
        enabled3 = enabled2;
        colors3 = colors2;
        interactionSource2 = r4;
        shape3 = shape2;
        border4 = border2;
        goto L136
    L102:
        if ($composer2.getSkipping() == false) goto L105;
        $composer2.skipToGroupEnd();
        modifier5 = modifier2;
        shape4 = shape2;
        colors5 = colors2;
        border5 = border2;
        interactionSource3 = r4;
        enabled4 = enabled2;
        goto L143
    L93:
        if (($changed & 100663296) != 0) goto L100;
        if ($composer2.changedInstance(r29) == false) goto L97;
        int r2 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty = $dirty | r2;
        goto L100
    L97:
        r2 = 33554432;
        goto L98
    L82:
        if (($changed & 12582912) != 0) goto L88;
        r4 = interactionSource;
        if ($composer2.changed(r4) == false) goto L86;
        int r17 = 8388608;
    L87:
        $dirty = $dirty | r17;
        goto L90
    L86:
        r17 = 4194304;
        goto L87
    L88:
        r4 = interactionSource;
        goto L90
    L70:
        if ((r32 & 64) != 0) goto L74;
        border2 = border;
        if ($composer2.changed(border2) == false) goto L75;
        int r16 = 1048576;
    L76:
        $dirty = $dirty | r16;
    L75:
        r16 = 524288;
        goto L76
    L74:
        border2 = border;
        goto L75
    L59:
        if ((r32 & 32) != 0) goto L63;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L64;
        int r13 = 131072;
    L65:
        $dirty = $dirty | r13;
    L64:
        r13 = 65536;
        goto L65
    L63:
        colors2 = colors;
        goto L64
    L48:
        if ((r32 & 16) != 0) goto L52;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L53;
        int r14 = 16384;
    L54:
        $dirty = $dirty | r14;
    L53:
        r14 = 8192;
        goto L54
    L52:
        shape2 = shape;
        goto L53
    L38:
        if (($changed & 3072) != 0) goto L44;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L42;
        int r11 = 2048;
    L43:
        $dirty = $dirty | r11;
        goto L46
    L42:
        r11 = 1024;
        goto L43
    L44:
        enabled2 = enabled;
        goto L46
    L27:
        if (($changed & 384) != 0) goto L33;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L31;
        int r10 = 256;
    L32:
        $dirty = $dirty | r10;
        goto L34
    L31:
        r10 = 128;
        goto L32
    L33:
        modifier2 = modifier;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changedInstance(r22) == false) goto L20;
        int r8 = 32;
    L21:
        $dirty = $dirty | r8;
        goto L23
    L20:
        r8 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(checked) == false) goto L10;
        int r6 = 4;
    L11:
        $dirty = $dirty | r6;
        goto L13
    L10:
        r6 = 2;
        goto L11
    }
}
