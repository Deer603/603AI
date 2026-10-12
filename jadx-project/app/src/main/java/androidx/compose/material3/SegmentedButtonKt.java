package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
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

/* JADX INFO: compiled from: SegmentedButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aD\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\u0011\u001a\u00020\u00062\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\r2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\rH\u0003¢\u0006\u0002\u0010\u0014\u001aD\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0010\u001a\u0091\u0001\u0010\u0018\u001a\u00020\u0006*\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\u001a2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\u0013\b\u0002\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\r2\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010&\u001a\u008b\u0001\u0010\u0018\u001a\u00020\u0006*\u00020\u00162\u0006\u0010'\u001a\u00020\u001a2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\u001a2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\u0013\b\u0002\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\r2\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010)\u001a\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+*\u00020-H\u0003¢\u0006\u0002\u0010.\u001a\"\u0010/\u001a\u00020\b*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001a2\f\u00100\u001a\b\u0012\u0004\u0012\u00020,0+H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"CheckedZIndexFactor", "", "IconSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "MultiChoiceSegmentedButtonRow", "", "modifier", "Landroidx/compose/ui/Modifier;", "space", "content", "Lkotlin/Function1;", "Landroidx/compose/material3/MultiChoiceSegmentedButtonRowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "MultiChoiceSegmentedButtonRow-uFdPcIQ", "(Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "SegmentedButtonContent", "icon", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SingleChoiceSegmentedButtonRow", "Landroidx/compose/material3/SingleChoiceSegmentedButtonRowScope;", "SingleChoiceSegmentedButtonRow-uFdPcIQ", "SegmentedButton", "checked", "", "onCheckedChange", "shape", "Landroidx/compose/ui/graphics/Shape;", "enabled", "colors", "Landroidx/compose/material3/SegmentedButtonColors;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "label", "(Landroidx/compose/material3/MultiChoiceSegmentedButtonRowScope;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SegmentedButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "selected", "onClick", "(Landroidx/compose/material3/SingleChoiceSegmentedButtonRowScope;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SegmentedButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "interactionCountAsState", "Landroidx/compose/runtime/State;", "", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "interactionZIndex", "interactionCount", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SegmentedButtonKt {
    private static final float CheckedZIndexFactor = 5.0f;
    private static final float IconSpacing = 0.0f;

    public static final /* synthetic */ void access$SegmentedButtonContent(Function2 icon, Function2 content, Composer $composer, int $changed) {
        SegmentedButtonContent(icon, content, $composer, $changed);
    }

    public static final /* synthetic */ float access$getIconSpacing$p() {
        return IconSpacing;
    }

    public static final void SegmentedButton(final MultiChoiceSegmentedButtonRowScope $this$SegmentedButton, final boolean checked, final Function1<? super Boolean, Unit> r29, final Shape shape, Modifier modifier, boolean enabled, SegmentedButtonColors colors, BorderStroke border, MutableInteractionSource interactionSource, Function2<? super Composer, ? super Integer, Unit> r36, final Function2<? super Composer, ? super Integer, Unit> r37, Composer $composer, final int $changed, final int $changed1, final int r41) {
        Composer $composer2 = $composer.startRestartGroup(-1596038053);
        ComposerKt.sourceInformation($composer2, "C(SegmentedButton)P(1,8,9,7,3,2!1,5)133@6692L8,137@6905L41,144@7279L25,163@7880L51,146@7310L621:SegmentedButton.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((Integer.MIN_VALUE & r41) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r41 & 1) == 0) goto L16;
        $dirty = $dirty | 48;
    L23:
        if ((r41 & 2) == 0) goto L26;
        $dirty = $dirty | 384;
    L34:
        if ((r41 & 4) == 0) goto L37;
        $dirty = $dirty | 3072;
    L44:
        int r13 = r41 & 8;
        if (r13 == 0) goto L48;
        $dirty = $dirty | 24576;
        Modifier r14 = modifier;
    L55:
        int r15 = r41 & 16;
        if (r15 == 0) goto L59;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        boolean enabled2 = enabled;
    L67:
        if (($changed & 1572864) == 0) goto L69;
        SegmentedButtonColors colors2 = colors;
    L78:
        if (($changed & 12582912) == 0) goto L80;
        BorderStroke border2 = border;
    L88:
        int $dirty2 = r41 & 128;
        if ($dirty2 == 0) goto L92;
        $dirty = $dirty | 100663296;
    L99:
        int $dirty3 = r41 & 256;
        if ($dirty3 == 0) goto L103;
        $dirty = $dirty | 805306368;
    L111:
        if ((r41 & 512) == 0) goto L114;
        $dirty1 = $dirty1 | 6;
    L120:
        int $dirty4 = $dirty1;
        if ((306783379 & $dirty) == 306783378) goto L123;
    L128:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L131;
    L140:
        if (r13 == 0) goto L142;
        Modifier.Companion modifier2 = Modifier.Companion;
    L143:
        if (r15 == 0) goto L146;
        enabled2 = true;
    L146:
        if ((r41 & 32) == 0) goto L149;
        colors2 = SegmentedButtonDefaults.INSTANCE.colors($composer2, 6);
        $dirty = $dirty & (-3670017);
    L149:
        if ((r41 & 64) == 0) goto L151;
        border2 = SegmentedButtonDefaults.m2577borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, colors2.m2561borderColorWaAFU9c$material3_release(enabled2, checked), 0.0f, 2, null);
        $dirty = $dirty & (-29360129);
    L151:
        if ($dirty2 == 0) goto L153;
        MutableInteractionSource interactionSource2 = null;
    L154:
        if ($dirty3 == 0) goto L156;
        Modifier modifier3 = modifier2;
        int r18 = $dirty;
        final Function2<? super Composer, ? super Integer, Unit> r7 = ComposableLambdaKt.rememberComposableLambda(970447394, true, new AnonymousClass1(checked), $composer2, 54);
        SegmentedButtonColors colors3 = colors2;
        boolean enabled3 = enabled2;
        int $dirty5 = r18;
        Modifier modifier4 = modifier3;
        MutableInteractionSource interactionSource3 = interactionSource2;
        BorderStroke border3 = border2;
    L157:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L160;
        ComposerKt.traceEventStart(-1596038053, $dirty5, $dirty4, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:139)");
    L160:
        $composer2.startReplaceGroup(1788099965);
        ComposerKt.sourceInformation($composer2, "141@7068L39");
        if (interactionSource3 != null) goto L167;
        ComposerKt.sourceInformationMarkerStart($composer2, 1788100616, "CC(remember):SegmentedButton.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L165;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
    L166:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        MutableInteractionSource interactionSource4 = (MutableInteractionSource) value$iv;
    L168:
        $composer2.endReplaceGroup();
        long containerColor = colors3.m2562containerColorWaAFU9c$material3_release(enabled3, checked);
        int $dirty6 = $dirty5;
        long contentColor = colors3.m2563contentColorWaAFU9c$material3_release(enabled3, checked);
        State<Integer> r8 = interactionCountAsState(interactionSource4, $composer2, 0);
        Modifier modifier5 = modifier4;
        SegmentedButtonColors colors4 = colors3;
        Composer $composer3 = $composer2;
        Function2<? super Composer, ? super Integer, Unit> r22 = r7;
        SurfaceKt.m2672Surfaced85dljk(checked, r29, SizeKt.m756defaultMinSizeVpY3zN4(interactionZIndex(RowScope.weight$default($this$SegmentedButton, modifier4, 1.0f, false, 2, null), checked, r8), ButtonDefaults.INSTANCE.m1945getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1944getMinHeightD9Ej5fM()), enabled3, shape, containerColor, contentColor, 0.0f, 0.0f, border3, interactionSource4, ComposableLambdaKt.rememberComposableLambda(1635710341, true, new AnonymousClass2(r7, r37), $composer2, 54), $composer3, ((((($dirty6 >> 3) & 14) | (($dirty6 >> 3) & 112)) | (($dirty6 >> 6) & 7168)) | (57344 & ($dirty6 << 3))) | (($dirty6 << 6) & 1879048192), 48, 384);
        if (ComposerKt.isTraceInProgress() == false) goto L171;
        ComposerKt.traceEventEnd();
    L171:
        int $dirty7 = $dirty6;
        final boolean enabled4 = enabled3;
        final BorderStroke border4 = border3;
        final Modifier modifier6 = modifier5;
        final SegmentedButtonColors colors5 = colors4;
        final Function2<? super Composer, ? super Integer, Unit> r10 = r22;
        final MutableInteractionSource interactionSource5 = interactionSource3;
    L172:
        ScopeUpdateScope r0 = $composer3.endRestartGroup();
        if (r0 == null) goto L176;
        r0.updateScope(new AnonymousClass3($this$SegmentedButton, checked, r29, shape, modifier6, enabled4, colors5, border4, interactionSource5, r10, r37, $changed, $changed1, r41));
        return;
    L176:
        return;
    L165:
        value$iv = it$iv;
        goto L166
    L167:
        interactionSource4 = interactionSource3;
        goto L168
    L156:
        modifier4 = modifier2;
        colors3 = colors2;
        enabled3 = enabled2;
        interactionSource3 = interactionSource2;
        $dirty5 = $dirty;
        border3 = border2;
        r7 = r36;
        goto L157
    L153:
        interactionSource2 = interactionSource;
        goto L154
    L142:
        modifier2 = r14;
        goto L143
    L131:
        if ($composer2.getDefaultsInvalid() == true) goto L140;
        $composer2.skipToGroupEnd();
        if ((r41 & 32) == 0) goto L137;
        $dirty = $dirty & (-3670017);
    L137:
        if ((r41 & 64) == 0) goto L139;
        int r3 = $dirty & (-29360129);
        boolean r9 = enabled2;
        $dirty5 = r3;
        colors3 = colors2;
        enabled3 = r9;
        interactionSource3 = interactionSource;
        r7 = r36;
        border3 = border2;
        modifier4 = r14;
        goto L157
    L139:
        interactionSource3 = interactionSource;
        colors3 = colors2;
        enabled3 = enabled2;
        border3 = border2;
        modifier4 = r14;
        $dirty5 = $dirty;
        r7 = r36;
        goto L157
    L123:
        if (($dirty4 & 3) != 2) goto L128;
        if ($composer2.getSkipping() == false) goto L128;
        $composer2.skipToGroupEnd();
        interactionSource5 = interactionSource;
        $composer3 = $composer2;
        $dirty7 = $dirty;
        enabled4 = enabled2;
        border4 = border2;
        r10 = r36;
        colors5 = colors2;
        modifier6 = r14;
        goto L172
    L114:
        if (($changed1 & 6) != 0) goto L120;
        if ($composer2.changedInstance(r37) == false) goto L118;
        int r1 = 4;
    L119:
        $dirty1 = $dirty1 | r1;
        goto L120
    L118:
        r1 = 2;
        goto L119
    L103:
        if (($changed & 805306368) != 0) goto L111;
        if ($composer2.changedInstance(r36) == false) goto L107;
        int r20 = 536870912;
    L108:
        $dirty = $dirty | r20;
        goto L111
    L107:
        r20 = 268435456;
        goto L108
    L92:
        if (($changed & 100663296) != 0) goto L99;
        if ($composer2.changed(interactionSource) == false) goto L96;
        int r19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L97:
        $dirty = $dirty | r19;
        goto L99
    L96:
        r19 = 33554432;
        goto L97
    L80:
        if ((r41 & 64) != 0) goto L84;
        border2 = border;
        if ($composer2.changed(border2) == false) goto L85;
        int r110 = 8388608;
    L86:
        $dirty = $dirty | r110;
    L85:
        r110 = 4194304;
        goto L86
    L84:
        border2 = border;
        goto L85
    L69:
        if ((r41 & 32) != 0) goto L73;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L74;
        int r17 = 1048576;
    L75:
        $dirty = $dirty | r17;
    L74:
        r17 = 524288;
        goto L75
    L73:
        colors2 = colors;
        goto L74
    L59:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L65;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L63;
        int r16 = 131072;
    L64:
        $dirty = $dirty | r16;
        goto L67
    L63:
        r16 = 65536;
        goto L64
    L65:
        enabled2 = enabled;
        goto L67
    L48:
        if (($changed & 24576) != 0) goto L54;
        r14 = modifier;
        if ($composer2.changed(r14) == false) goto L52;
        int r111 = 16384;
    L53:
        $dirty = $dirty | r111;
        goto L55
    L52:
        r111 = 8192;
        goto L53
    L54:
        r14 = modifier;
        goto L55
    L37:
        if (($changed & 3072) != 0) goto L44;
        if ($composer2.changed(shape) == false) goto L41;
        int r112 = 2048;
    L42:
        $dirty = $dirty | r112;
        goto L44
    L41:
        r112 = 1024;
        goto L42
    L26:
        if (($changed & 384) != 0) goto L34;
        if ($composer2.changedInstance(r29) == false) goto L30;
        int r12 = 256;
    L31:
        $dirty = $dirty | r12;
        goto L34
    L30:
        r12 = 128;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changed(checked) == false) goto L20;
        int r11 = 32;
    L21:
        $dirty = $dirty | r11;
        goto L23
    L20:
        r11 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed($this$SegmentedButton) == false) goto L10;
        int r21 = 4;
    L11:
        $dirty = $dirty | r21;
        goto L13
    L10:
        r21 = 2;
        goto L11
    }

    public static final void SegmentedButton(final SingleChoiceSegmentedButtonRowScope $this$SegmentedButton, final boolean selected, final Function0<Unit> r31, final Shape shape, Modifier modifier, boolean enabled, SegmentedButtonColors colors, BorderStroke border, MutableInteractionSource interactionSource, Function2<? super Composer, ? super Integer, Unit> r38, final Function2<? super Composer, ? super Integer, Unit> r39, Composer $composer, final int $changed, final int $changed1, final int r43) {
        Composer $composer2 = $composer.startRestartGroup(-1016574361);
        ComposerKt.sourceInformation($composer2, "C(SegmentedButton)P(8,7,9,6,2,1!1,4)211@10255L8,215@10469L42,222@10846L25,242@11489L51,224@10877L663:SegmentedButton.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((Integer.MIN_VALUE & r43) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r43 & 1) == 0) goto L16;
        $dirty = $dirty | 48;
    L23:
        if ((r43 & 2) == 0) goto L26;
        $dirty = $dirty | 384;
    L34:
        if ((r43 & 4) == 0) goto L37;
        $dirty = $dirty | 3072;
    L44:
        int r13 = r43 & 8;
        if (r13 == 0) goto L48;
        $dirty = $dirty | 24576;
        Modifier r14 = modifier;
    L55:
        int r15 = r43 & 16;
        if (r15 == 0) goto L59;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        boolean enabled2 = enabled;
    L67:
        if (($changed & 1572864) == 0) goto L69;
        SegmentedButtonColors colors2 = colors;
    L78:
        if (($changed & 12582912) == 0) goto L80;
        BorderStroke border2 = border;
    L88:
        int $dirty2 = r43 & 128;
        if ($dirty2 == 0) goto L92;
        $dirty = $dirty | 100663296;
    L99:
        int $dirty3 = r43 & 256;
        if ($dirty3 == 0) goto L103;
        $dirty = $dirty | 805306368;
    L111:
        if ((r43 & 512) == 0) goto L114;
        $dirty1 = $dirty1 | 6;
    L120:
        int $dirty4 = $dirty1;
        if ((306783379 & $dirty) == 306783378) goto L123;
    L128:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L131;
    L140:
        if (r13 == 0) goto L142;
        Modifier.Companion modifier2 = Modifier.Companion;
    L143:
        if (r15 == 0) goto L146;
        enabled2 = true;
    L146:
        if ((r43 & 32) == 0) goto L149;
        colors2 = SegmentedButtonDefaults.INSTANCE.colors($composer2, 6);
        $dirty = $dirty & (-3670017);
    L149:
        if ((r43 & 64) == 0) goto L151;
        border2 = SegmentedButtonDefaults.m2577borderStrokel07J4OM$default(SegmentedButtonDefaults.INSTANCE, colors2.m2561borderColorWaAFU9c$material3_release(enabled2, selected), 0.0f, 2, null);
        $dirty = $dirty & (-29360129);
    L151:
        if ($dirty2 == 0) goto L153;
        MutableInteractionSource interactionSource2 = null;
    L154:
        if ($dirty3 == 0) goto L156;
        Modifier modifier3 = modifier2;
        int r18 = $dirty;
        final Function2<? super Composer, ? super Integer, Unit> r7 = ComposableLambdaKt.rememberComposableLambda(1235063168, true, new AnonymousClass4(selected), $composer2, 54);
        SegmentedButtonColors colors3 = colors2;
        boolean enabled3 = enabled2;
        int $dirty5 = r18;
        Modifier modifier4 = modifier3;
        MutableInteractionSource interactionSource3 = interactionSource2;
        BorderStroke border3 = border2;
    L157:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L160;
        ComposerKt.traceEventStart(-1016574361, $dirty5, $dirty4, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:217)");
    L160:
        $composer2.startReplaceGroup(1788214045);
        ComposerKt.sourceInformation($composer2, "219@10633L39");
        if (interactionSource3 != null) goto L167;
        ComposerKt.sourceInformationMarkerStart($composer2, 1788214696, "CC(remember):SegmentedButton.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L165;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
    L166:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        MutableInteractionSource interactionSource4 = (MutableInteractionSource) value$iv;
    L168:
        $composer2.endReplaceGroup();
        long containerColor = colors3.m2562containerColorWaAFU9c$material3_release(enabled3, selected);
        int $dirty6 = $dirty5;
        long contentColor = colors3.m2563contentColorWaAFU9c$material3_release(enabled3, selected);
        State<Integer> r8 = interactionCountAsState(interactionSource4, $composer2, 0);
        Modifier modifier5 = modifier4;
        SegmentedButtonColors colors4 = colors3;
        Composer $composer3 = $composer2;
        Function2<? super Composer, ? super Integer, Unit> r25 = r7;
        SurfaceKt.m2671Surfaced85dljk(selected, r31, SemanticsModifierKt.semantics$default(SizeKt.m756defaultMinSizeVpY3zN4(interactionZIndex(RowScope.weight$default($this$SegmentedButton, modifier4, 1.0f, false, 2, null), selected, r8), ButtonDefaults.INSTANCE.m1945getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1944getMinHeightD9Ej5fM()), false, AnonymousClass5.INSTANCE, 1, null), enabled3, shape, containerColor, contentColor, 0.0f, 0.0f, border3, interactionSource4, ComposableLambdaKt.rememberComposableLambda(383378045, true, new AnonymousClass6(r7, r39), $composer2, 54), $composer3, ((((($dirty6 >> 3) & 14) | (($dirty6 >> 3) & 112)) | (($dirty6 >> 6) & 7168)) | (57344 & ($dirty6 << 3))) | (($dirty6 << 6) & 1879048192), 48, 384);
        if (ComposerKt.isTraceInProgress() == false) goto L171;
        ComposerKt.traceEventEnd();
    L171:
        int $dirty7 = $dirty6;
        final boolean enabled4 = enabled3;
        final BorderStroke border4 = border3;
        final Modifier modifier6 = modifier5;
        final SegmentedButtonColors colors5 = colors4;
        final MutableInteractionSource interactionSource5 = interactionSource3;
        final Function2<? super Composer, ? super Integer, Unit> r10 = r25;
    L172:
        ScopeUpdateScope r1 = $composer3.endRestartGroup();
        if (r1 == null) goto L176;
        r1.updateScope(new AnonymousClass7($this$SegmentedButton, selected, r31, shape, modifier6, enabled4, colors5, border4, interactionSource5, r10, r39, $changed, $changed1, r43));
        return;
    L176:
        return;
    L165:
        value$iv = it$iv;
        goto L166
    L167:
        interactionSource4 = interactionSource3;
        goto L168
    L156:
        modifier4 = modifier2;
        colors3 = colors2;
        enabled3 = enabled2;
        interactionSource3 = interactionSource2;
        $dirty5 = $dirty;
        border3 = border2;
        r7 = r38;
        goto L157
    L153:
        interactionSource2 = interactionSource;
        goto L154
    L142:
        modifier2 = r14;
        goto L143
    L131:
        if ($composer2.getDefaultsInvalid() == true) goto L140;
        $composer2.skipToGroupEnd();
        if ((r43 & 32) == 0) goto L137;
        $dirty = $dirty & (-3670017);
    L137:
        if ((r43 & 64) == 0) goto L139;
        int r3 = $dirty & (-29360129);
        boolean r9 = enabled2;
        $dirty5 = r3;
        colors3 = colors2;
        enabled3 = r9;
        interactionSource3 = interactionSource;
        r7 = r38;
        border3 = border2;
        modifier4 = r14;
        goto L157
    L139:
        interactionSource3 = interactionSource;
        colors3 = colors2;
        enabled3 = enabled2;
        border3 = border2;
        modifier4 = r14;
        $dirty5 = $dirty;
        r7 = r38;
        goto L157
    L123:
        if (($dirty4 & 3) != 2) goto L128;
        if ($composer2.getSkipping() == false) goto L128;
        $composer2.skipToGroupEnd();
        interactionSource5 = interactionSource;
        $composer3 = $composer2;
        $dirty7 = $dirty;
        enabled4 = enabled2;
        border4 = border2;
        r10 = r38;
        colors5 = colors2;
        modifier6 = r14;
        goto L172
    L114:
        if (($changed1 & 6) != 0) goto L120;
        if ($composer2.changedInstance(r39) == false) goto L118;
        int r2 = 4;
    L119:
        $dirty1 = $dirty1 | r2;
        goto L120
    L118:
        r2 = 2;
        goto L119
    L103:
        if (($changed & 805306368) != 0) goto L111;
        if ($composer2.changedInstance(r38) == false) goto L107;
        int r20 = 536870912;
    L108:
        $dirty = $dirty | r20;
        goto L111
    L107:
        r20 = 268435456;
        goto L108
    L92:
        if (($changed & 100663296) != 0) goto L99;
        if ($composer2.changed(interactionSource) == false) goto L96;
        int r19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L97:
        $dirty = $dirty | r19;
        goto L99
    L96:
        r19 = 33554432;
        goto L97
    L80:
        if ((r43 & 64) != 0) goto L84;
        border2 = border;
        if ($composer2.changed(border2) == false) goto L85;
        int r110 = 8388608;
    L86:
        $dirty = $dirty | r110;
    L85:
        r110 = 4194304;
        goto L86
    L84:
        border2 = border;
        goto L85
    L69:
        if ((r43 & 32) != 0) goto L73;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L74;
        int r17 = 1048576;
    L75:
        $dirty = $dirty | r17;
    L74:
        r17 = 524288;
        goto L75
    L73:
        colors2 = colors;
        goto L74
    L59:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L65;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L63;
        int r16 = 131072;
    L64:
        $dirty = $dirty | r16;
        goto L67
    L63:
        r16 = 65536;
        goto L64
    L65:
        enabled2 = enabled;
        goto L67
    L48:
        if (($changed & 24576) != 0) goto L54;
        r14 = modifier;
        if ($composer2.changed(r14) == false) goto L52;
        int r111 = 16384;
    L53:
        $dirty = $dirty | r111;
        goto L55
    L52:
        r111 = 8192;
        goto L53
    L54:
        r14 = modifier;
        goto L55
    L37:
        if (($changed & 3072) != 0) goto L44;
        if ($composer2.changed(shape) == false) goto L41;
        int r112 = 2048;
    L42:
        $dirty = $dirty | r112;
        goto L44
    L41:
        r112 = 1024;
        goto L42
    L26:
        if (($changed & 384) != 0) goto L34;
        if ($composer2.changedInstance(r31) == false) goto L30;
        int r12 = 256;
    L31:
        $dirty = $dirty | r12;
        goto L34
    L30:
        r12 = 128;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changed(selected) == false) goto L20;
        int r11 = 32;
    L21:
        $dirty = $dirty | r11;
        goto L23
    L20:
        r11 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed($this$SegmentedButton) == false) goto L10;
        int r21 = 4;
    L11:
        $dirty = $dirty | r21;
        goto L13
    L10:
        r21 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: SingleChoiceSegmentedButtonRow-uFdPcIQ, reason: not valid java name */
    public static final void m2583SingleChoiceSegmentedButtonRowuFdPcIQ(Modifier modifier, float space, final Function3<? super SingleChoiceSegmentedButtonRowScope, ? super Composer, ? super Integer, Unit> r32, Composer $composer, final int $changed, final int r35) {
        Composer $composer2 = $composer.startRestartGroup(-1520863498);
        ComposerKt.sourceInformation($composer2, "C(SingleChoiceSegmentedButtonRow)P(1,2:c#ui.unit.Dp)269@12565L447:SegmentedButton.kt#uh7d8r");
        int $dirty = $changed;
        int r2 = r35 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r5 = modifier;
    L13:
        int r7 = r35 & 2;
        if (r7 == 0) goto L17;
        $dirty = $dirty | 48;
        float r8 = space;
    L25:
        if ((r35 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
    L34:
        int $dirty2 = $dirty;
        if (($dirty2 & 147) == 146) goto L37;
    L40:
        if (r2 == 0) goto L42;
        Modifier.Companion modifier2 = Modifier.Companion;
    L43:
        if (r7 == 0) goto L45;
        float space2 = SegmentedButtonDefaults.INSTANCE.m2580getBorderWidthD9Ej5fM();
    L47:
        if (ComposerKt.isTraceInProgress() == false) goto L49;
        ComposerKt.traceEventStart(-1520863498, $dirty2, -1, "androidx.compose.material3.SingleChoiceSegmentedButtonRow (SegmentedButton.kt:268)");
    L49:
        Modifier modifier$iv = IntrinsicKt.width(SizeKt.m757defaultMinSizeVpY3zN4$default(SelectableGroupKt.selectableGroup(modifier2), 0.0f, OutlinedSegmentedButtonTokens.INSTANCE.m3483getContainerHeightD9Ej5fM(), 1, null), IntrinsicSize.Min);
        Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(-space2));
        Alignment.Vertical verticalAlignment$iv = Alignment.Companion.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
        int $changed$iv$iv = (384 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier modifier3 = modifier2;
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r16 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        float space3 = space2;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L52;
        ComposablesKt.invalidApplier();
    L52:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L55;
        Function0<ComposeUiNode> r0 = r16;
        $composer2.createNode(r0);
    L56:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r1 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L63;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L63;
    L64:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r3 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
        int r6 = ((384 >> 6) & 112) | 6;
        RowScope $this$SingleChoiceSegmentedButtonRow_uFdPcIQ_u24lambda_u243 = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, 1586778660, "C278@12924L58,279@12997L9:SegmentedButton.kt#uh7d8r");
        ComposerKt.sourceInformationMarkerStart($composer2, -1334286565, "CC(remember):SegmentedButton.kt#9igjgp");
        Object value$iv = $composer2.rememberedValue();
        if (value$iv != Composer.Companion.getEmpty()) goto L68;
        value$iv = new SingleChoiceSegmentedButtonScopeWrapper($this$SingleChoiceSegmentedButtonRow_uFdPcIQ_u24lambda_u243);
        $composer2.updateRememberedValue(value$iv);
    L68:
        SingleChoiceSegmentedButtonScopeWrapper scope = (SingleChoiceSegmentedButtonScopeWrapper) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        r32.invoke(scope, $composer2, Integer.valueOf((($dirty2 >> 3) & 112) | 6));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L71;
        ComposerKt.traceEventEnd();
    L71:
        final Modifier modifier4 = modifier3;
        final float space4 = space3;
    L72:
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L76;
        r9.updateScope(new SegmentedButtonKt$SingleChoiceSegmentedButtonRow$2(modifier4, space4, r32, $changed, r35));
        return;
    L76:
        return;
    L63:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r1);
        goto L64
    L55:
        r0 = r16;
        $composer2.useNode();
        goto L56
    L45:
        space2 = r8;
        goto L47
    L42:
        modifier2 = r5;
        goto L43
    L37:
        if ($composer2.getSkipping() == false) goto L40;
        $composer2.skipToGroupEnd();
        modifier4 = r5;
        space4 = r8;
        goto L72
    L28:
        if (($changed & 384) != 0) goto L34;
        if ($composer2.changedInstance(r32) == false) goto L32;
        int r10 = 256;
    L33:
        $dirty = $dirty | r10;
        goto L34
    L32:
        r10 = 128;
        goto L33
    L17:
        if (($changed & 48) != 0) goto L23;
        r8 = space;
        if ($composer2.changed(r8) == false) goto L21;
        int r11 = 32;
    L22:
        $dirty = $dirty | r11;
        goto L25
    L21:
        r11 = 16;
        goto L22
    L23:
        r8 = space;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r5 = modifier;
        if ($composer2.changed(r5) == false) goto L10;
        int r12 = 4;
    L11:
        $dirty = $dirty | r12;
        goto L13
    L10:
        r12 = 2;
        goto L11
    L12:
        r5 = modifier;
        goto L13
    }

    /* JADX INFO: renamed from: MultiChoiceSegmentedButtonRow-uFdPcIQ, reason: not valid java name */
    public static final void m2582MultiChoiceSegmentedButtonRowuFdPcIQ(Modifier modifier, float space, final Function3<? super MultiChoiceSegmentedButtonRowScope, ? super Composer, ? super Integer, Unit> r32, Composer $composer, final int $changed, final int r35) {
        Composer $composer2 = $composer.startRestartGroup(155922315);
        ComposerKt.sourceInformation($composer2, "C(MultiChoiceSegmentedButtonRow)P(1,2:c#ui.unit.Dp)307@14058L411:SegmentedButton.kt#uh7d8r");
        int $dirty = $changed;
        int r2 = r35 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r5 = modifier;
    L13:
        int r7 = r35 & 2;
        if (r7 == 0) goto L17;
        $dirty = $dirty | 48;
        float r8 = space;
    L25:
        if ((r35 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
    L34:
        int $dirty2 = $dirty;
        if (($dirty2 & 147) == 146) goto L37;
    L40:
        if (r2 == 0) goto L42;
        Modifier.Companion modifier2 = Modifier.Companion;
    L43:
        if (r7 == 0) goto L45;
        float space2 = SegmentedButtonDefaults.INSTANCE.m2580getBorderWidthD9Ej5fM();
    L47:
        if (ComposerKt.isTraceInProgress() == false) goto L49;
        ComposerKt.traceEventStart(155922315, $dirty2, -1, "androidx.compose.material3.MultiChoiceSegmentedButtonRow (SegmentedButton.kt:306)");
    L49:
        Modifier modifier$iv = IntrinsicKt.width(SizeKt.m757defaultMinSizeVpY3zN4$default(modifier2, 0.0f, OutlinedSegmentedButtonTokens.INSTANCE.m3483getContainerHeightD9Ej5fM(), 1, null), IntrinsicSize.Min);
        Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(-space2));
        Alignment.Vertical verticalAlignment$iv = Alignment.Companion.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
        int $changed$iv$iv = (384 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier modifier3 = modifier2;
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r16 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        float space3 = space2;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L52;
        ComposablesKt.invalidApplier();
    L52:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L55;
        Function0<ComposeUiNode> r0 = r16;
        $composer2.createNode(r0);
    L56:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r1 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L63;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L63;
    L64:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r3 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
        int r6 = ((384 >> 6) & 112) | 6;
        RowScope $this$MultiChoiceSegmentedButtonRow_uFdPcIQ_u24lambda_u245 = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, 1297400858, "C315@14382L57,316@14454L9:SegmentedButton.kt#uh7d8r");
        ComposerKt.sourceInformationMarkerStart($composer2, 596041317, "CC(remember):SegmentedButton.kt#9igjgp");
        Object value$iv = $composer2.rememberedValue();
        if (value$iv != Composer.Companion.getEmpty()) goto L68;
        value$iv = new MultiChoiceSegmentedButtonScopeWrapper($this$MultiChoiceSegmentedButtonRow_uFdPcIQ_u24lambda_u245);
        $composer2.updateRememberedValue(value$iv);
    L68:
        MultiChoiceSegmentedButtonScopeWrapper scope = (MultiChoiceSegmentedButtonScopeWrapper) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        r32.invoke(scope, $composer2, Integer.valueOf((($dirty2 >> 3) & 112) | 6));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L71;
        ComposerKt.traceEventEnd();
    L71:
        final Modifier modifier4 = modifier3;
        final float space4 = space3;
    L72:
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L76;
        r9.updateScope(new SegmentedButtonKt$MultiChoiceSegmentedButtonRow$2(modifier4, space4, r32, $changed, r35));
        return;
    L76:
        return;
    L63:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r1);
        goto L64
    L55:
        r0 = r16;
        $composer2.useNode();
        goto L56
    L45:
        space2 = r8;
        goto L47
    L42:
        modifier2 = r5;
        goto L43
    L37:
        if ($composer2.getSkipping() == false) goto L40;
        $composer2.skipToGroupEnd();
        modifier4 = r5;
        space4 = r8;
        goto L72
    L28:
        if (($changed & 384) != 0) goto L34;
        if ($composer2.changedInstance(r32) == false) goto L32;
        int r10 = 256;
    L33:
        $dirty = $dirty | r10;
        goto L34
    L32:
        r10 = 128;
        goto L33
    L17:
        if (($changed & 48) != 0) goto L23;
        r8 = space;
        if ($composer2.changed(r8) == false) goto L21;
        int r11 = 32;
    L22:
        $dirty = $dirty | r11;
        goto L25
    L21:
        r11 = 16;
        goto L22
    L23:
        r8 = space;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r5 = modifier;
        if ($composer2.changed(r5) == false) goto L10;
        int r12 = 4;
    L11:
        $dirty = $dirty | r12;
        goto L13
    L10:
        r12 = 2;
        goto L11
    L12:
        r5 = modifier;
        goto L13
    }

    private static final void SegmentedButtonContent(final Function2<? super Composer, ? super Integer, Unit> r29, final Function2<? super Composer, ? super Integer, Unit> r30, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1464121570);
        ComposerKt.sourceInformation($composer2, "C(SegmentedButtonContent)P(1)325@14600L595:SegmentedButton.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r29) == false) goto L7;
        int r6 = 4;
    L8:
        $dirty = $dirty | r6;
        goto L10
    L7:
        r6 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r30) == false) goto L14;
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
    L43:
        ScopeUpdateScope r3 = $composer3.endRestartGroup();
        if (r3 == null) goto L47;
        r3.updateScope(new C05522(r29, r30, $changed));
        return;
    L47:
        return;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(1464121570, $dirty, -1, "androidx.compose.material3.SegmentedButtonContent (SegmentedButton.kt:324)");
    L25:
        Alignment r4 = Alignment.Companion.getCenter();
        Modifier r8 = PaddingKt.padding(Modifier.Companion, ButtonDefaults.INSTANCE.getTextButtonContentPadding());
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(r4, false);
        int $changed$iv$iv = (54 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, r8);
        Function0<ComposeUiNode> r15 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L28;
        ComposablesKt.invalidApplier();
    L28:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L31;
        $composer2.createNode(r15);
    L32:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        $composer3 = $composer2;
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L39;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L39;
    L40:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r9 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r10 = BoxScopeInstance.INSTANCE;
        int r11 = ((54 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, 1425737070, "C329@14804L5,330@14847L342,330@14818L371:SegmentedButton.kt#uh7d8r");
        TextStyle typography = TypographyKt.getValue(OutlinedSegmentedButtonTokens.INSTANCE.getLabelTextFont(), $composer3, 6);
        TextKt.ProvideTextStyle(typography, ComposableLambdaKt.rememberComposableLambda(1420592651, true, new SegmentedButtonKt$SegmentedButtonContent$1$1(r29, r30), $composer3, 54), $composer3, 48);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L43;
        ComposerKt.traceEventEnd();
    L39:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r5);
        goto L40
    L31:
        $composer2.useNode();
        goto L32
    }

    private static final State<Integer> interactionCountAsState(InteractionSource $this$interactionCountAsState, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 281890131, "C(interactionCountAsState)397@17381L33,398@17440L499,398@17419L520:SegmentedButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(281890131, $changed, -1, "androidx.compose.material3.interactionCountAsState (SegmentedButton.kt:396)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 408875648, "CC(remember):SegmentedButton.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        boolean invalid$iv = false;
        if (it$iv != Composer.Companion.getEmpty()) goto L8;
        Object value$iv = SnapshotIntStateKt.mutableIntStateOf(0);
        $composer.updateRememberedValue(value$iv);
    L9:
        MutableIntState interactionCount = (MutableIntState) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 408878002, "CC(remember):SegmentedButton.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L14;
        if ($composer.changed($this$interactionCountAsState) == false) goto L14;
    L15:
        invalid$iv = true;
    L16:
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv == false) goto L19;
    L22:
        SegmentedButtonKt$interactionCountAsState$1$1 value$iv2 = new SegmentedButtonKt$interactionCountAsState$1$1($this$interactionCountAsState, interactionCount, null);
        $composer.updateRememberedValue(value$iv2);
    L23:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect($this$interactionCountAsState, (Function2) value$iv2, $composer, $changed & 14);
        if (ComposerKt.isTraceInProgress() == false) goto L26;
        ComposerKt.traceEventEnd();
    L26:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return interactionCount;
    L19:
        if (it$iv2 == Composer.Companion.getEmpty()) goto L22;
        value$iv2 = it$iv2;
    L14:
        if (($changed & 6) != 4) goto L16;
    L8:
        value$iv = it$iv;
        goto L9
    }

    private static final Modifier interactionZIndex(Modifier $this$interactionZIndex, final boolean checked, final State<Integer> r3) {
        return LayoutModifierKt.layout($this$interactionZIndex, new C05531(r3, checked));
    }

    static {
        IconSpacing = Dp.m6973constructorimpl(8);
    }
}
