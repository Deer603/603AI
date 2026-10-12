package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: RadioButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aO\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006\u0018"}, d2 = {"RadioAnimationDuration", "", "RadioButtonDotSize", "Landroidx/compose/ui/unit/Dp;", "F", "RadioButtonPadding", "RadioButtonRippleRadius", "RadioButtonSize", "RadioRadius", "RadioStrokeWidth", "RadioButton", "", "selected", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/RadioButtonColors;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/RadioButtonColors;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RadioButtonKt {
    private static final int RadioAnimationDuration = 100;
    private static final float RadioButtonDotSize = 0.0f;
    private static final float RadioButtonPadding = 0.0f;
    private static final float RadioButtonRippleRadius = 0.0f;
    private static final float RadioButtonSize = 0.0f;
    private static final float RadioRadius = 0.0f;
    private static final float RadioStrokeWidth = 0.0f;

    public static final /* synthetic */ float access$getRadioRadius$p() {
        return RadioRadius;
    }

    public static final /* synthetic */ float access$getRadioStrokeWidth$p() {
        return RadioStrokeWidth;
    }

    public static final void RadioButton(final boolean selected, final Function0<Unit> r23, Modifier modifier, boolean enabled, MutableInteractionSource interactionSource, RadioButtonColors colors, Composer $composer, final int $changed, final int r30) {
        Composer $composer2 = $composer.startRestartGroup(1314435585);
        ComposerKt.sourceInformation($composer2, "C(RadioButton)P(5,4,3,1,2)83@3750L176,87@3955L29,114@4841L385,101@4434L792:RadioButton.kt#jmzs0o");
        int $dirty = $changed;
        if ((r30 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r30 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L22:
        int r4 = r30 & 4;
        if (r4 == 0) goto L26;
        $dirty = $dirty | 384;
        Modifier r6 = modifier;
    L33:
        int r8 = r30 & 8;
        if (r8 == 0) goto L37;
        $dirty = $dirty | 3072;
        boolean r9 = enabled;
    L44:
        int r10 = r30 & 16;
        if (r10 == 0) goto L48;
        $dirty = $dirty | 24576;
        MutableInteractionSource r11 = interactionSource;
    L56:
        if ((196608 & $changed) == 0) goto L58;
        RadioButtonColors r13 = colors;
    L67:
        if ((74899 & $dirty) == 74898) goto L69;
        boolean r14 = true;
    L71:
        if ($composer2.shouldExecute(r14, $dirty & 1) == false) goto L119;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "80@3709L8");
        if (($changed & 1) != 0) goto L75;
    L81:
        if (r4 == 0) goto L83;
        Modifier.Companion modifier2 = Modifier.Companion;
    L84:
        if (r8 == 0) goto L86;
        boolean enabled2 = true;
    L87:
        if (r10 == 0) goto L89;
        MutableInteractionSource interactionSource2 = null;
    L91:
        if ((r30 & 32) == 0) goto L93;
        Composer $composer3 = $composer2;
        int $dirty2 = $dirty & (-458753);
        RadioButtonColors colors2 = RadioButtonDefaults.INSTANCE.m1741colorsRGew2ao(0, 0, 0, $composer3, 3072, 7);
        MutableInteractionSource interactionSource3 = interactionSource2;
    L94:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L97;
        ComposerKt.traceEventStart(1314435585, $dirty2, -1, "androidx.compose.material.RadioButton (RadioButton.kt:81)");
    L97:
        if (selected == false) goto L99;
        float arg0$iv = RadioButtonDotSize;
        float arg0$iv2 = Dp.m6973constructorimpl(arg0$iv / 2);
    L100:
        int $dirty3 = $dirty2;
        $composer2 = $composer3;
        final State<Dp> r12 = AnimateAsStateKt.m124animateDpAsStateAjpBEmI(arg0$iv2, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, $composer2, 48, 12);
        final State<Color> r15 = colors2.radioColor(enabled2, selected, $composer2, ((($dirty3 >> 9) & 14) | (($dirty3 << 3) & 112)) | (($dirty3 >> 9) & 896));
        if (r23 == null) goto L103;
        final boolean enabled3 = enabled2;
        Modifier.Companion selectableModifier = SelectableKt.m986selectableO2vRcR0(Modifier.Companion, selected, interactionSource3, RippleKt.m1746rippleH2RKhps$default(false, RadioButtonRippleRadius, 0, 4, null), enabled3, Role.m6174boximpl(Role.Companion.m6186getRadioButtono7Vup1c()), r23);
    L105:
        if (r23 == null) goto L107;
        Modifier.Companion r1 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.Companion);
    L108:
        Modifier r2 = SizeKt.m764requiredSize3ABfNKs(PaddingKt.m725padding3ABfNKs(SizeKt.wrapContentSize$default(modifier2.then(r1).then(selectableModifier), Alignment.Companion.getCenter(), false, 2, null), RadioButtonPadding), RadioButtonSize);
        ComposerKt.sourceInformationMarkerStart($composer2, 61089864, "CC(remember):RadioButton.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(r15) | $composer2.changed(r12);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L111;
    L114:
        Object value$iv = (Function1) new RadioButtonKt$RadioButton$1$1(r15, r12);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L115:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CanvasKt.Canvas(r2, (Function1) it$iv, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L118;
        ComposerKt.traceEventEnd();
    L118:
        final MutableInteractionSource interactionSource4 = interactionSource3;
        final Modifier modifier3 = modifier2;
        final RadioButtonColors colors3 = colors2;
    L120:
        ScopeUpdateScope r16 = $composer2.endRestartGroup();
        if (r16 == null) goto L124;
        r16.updateScope(new AnonymousClass2(selected, r23, modifier3, enabled3, interactionSource4, colors3, $changed, r30));
        return;
    L124:
        return;
    L111:
        if (it$iv != Composer.Companion.getEmpty()) goto L115;
    L107:
        r1 = Modifier.Companion;
        goto L108
    L103:
        enabled3 = enabled2;
        selectableModifier = Modifier.Companion;
        goto L105
    L99:
        arg0$iv2 = Dp.m6973constructorimpl(0);
        goto L100
    L93:
        $composer3 = $composer2;
        $dirty2 = $dirty;
        interactionSource3 = interactionSource2;
        colors2 = colors;
        goto L94
    L89:
        interactionSource2 = r11;
        goto L91
    L86:
        enabled2 = r9;
        goto L87
    L83:
        modifier2 = r6;
        goto L84
    L75:
        if ($composer2.getDefaultsInvalid() == true) goto L81;
        $composer2.skipToGroupEnd();
        if ((r30 & 32) == 0) goto L80;
        $dirty = $dirty & (-458753);
    L80:
        $dirty2 = $dirty;
        modifier2 = r6;
        enabled2 = r9;
        interactionSource3 = r11;
        $composer3 = $composer2;
        colors2 = r13;
        goto L94
    L119:
        $composer2.skipToGroupEnd();
        modifier3 = r6;
        enabled3 = r9;
        interactionSource4 = r11;
        colors3 = colors;
        goto L120
    L69:
        r14 = false;
        goto L71
    L58:
        if ((r30 & 32) != 0) goto L62;
        r13 = colors;
        if ($composer2.changed(r13) == false) goto L63;
        int r17 = 131072;
    L64:
        $dirty = $dirty | r17;
    L63:
        r17 = 65536;
        goto L64
    L62:
        r13 = colors;
        goto L63
    L48:
        if (($changed & 24576) != 0) goto L54;
        r11 = interactionSource;
        if ($composer2.changed(r11) == false) goto L52;
        int r18 = 16384;
    L53:
        $dirty = $dirty | r18;
        goto L56
    L52:
        r18 = 8192;
        goto L53
    L54:
        r11 = interactionSource;
        goto L56
    L37:
        if (($changed & 3072) != 0) goto L43;
        r9 = enabled;
        if ($composer2.changed(r9) == false) goto L41;
        int r19 = 2048;
    L42:
        $dirty = $dirty | r19;
        goto L44
    L41:
        r19 = 1024;
        goto L42
    L43:
        r9 = enabled;
        goto L44
    L26:
        if (($changed & 384) != 0) goto L32;
        r6 = modifier;
        if ($composer2.changed(r6) == false) goto L30;
        int r20 = 256;
    L31:
        $dirty = $dirty | r20;
        goto L33
    L30:
        r20 = 128;
        goto L31
    L32:
        r6 = modifier;
        goto L33
    L16:
        if (($changed & 48) != 0) goto L22;
        if ($composer2.changedInstance(r23) == false) goto L20;
        int r5 = 32;
    L21:
        $dirty = $dirty | r5;
        goto L22
    L20:
        r5 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(selected) == false) goto L10;
        int r7 = 4;
    L11:
        $dirty = $dirty | r7;
        goto L13
    L10:
        r7 = 2;
        goto L11
    }

    static {
        RadioButtonRippleRadius = Dp.m6973constructorimpl(24);
        RadioButtonPadding = Dp.m6973constructorimpl(2);
        RadioButtonSize = Dp.m6973constructorimpl(20);
        float arg0$iv = RadioButtonSize;
        RadioRadius = Dp.m6973constructorimpl(arg0$iv / 2);
        RadioButtonDotSize = Dp.m6973constructorimpl(12);
        RadioStrokeWidth = Dp.m6973constructorimpl(2);
    }
}
