package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.tokens.RadioButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: RadioButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aO\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006\u0015"}, d2 = {"RadioAnimationDuration", "", "RadioButtonDotSize", "Landroidx/compose/ui/unit/Dp;", "F", "RadioButtonPadding", "RadioStrokeWidth", "RadioButton", "", "selected", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "colors", "Landroidx/compose/material3/RadioButtonColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/RadioButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RadioButtonKt {
    private static final int RadioAnimationDuration = 100;
    private static final float RadioButtonDotSize = 0.0f;
    private static final float RadioButtonPadding = 0.0f;
    private static final float RadioStrokeWidth = 0.0f;

    public static final /* synthetic */ float access$getRadioStrokeWidth$p() {
        return RadioStrokeWidth;
    }

    public static final void RadioButton(final boolean selected, final Function0<Unit> r25, Modifier modifier, boolean enabled, RadioButtonColors colors, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int r32) {
        Composer $composer2 = $composer.startRestartGroup(408580840);
        ComposerKt.sourceInformation($composer2, "C(RadioButton)P(5,4,3,1)80@3770L8,84@3868L176,88@4073L29,119@5097L415,106@4679L833:RadioButton.kt#uh7d8r");
        int $dirty = $changed;
        if ((r32 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r32 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L22:
        int r4 = r32 & 4;
        if (r4 == 0) goto L26;
        $dirty = $dirty | 384;
        Modifier r5 = modifier;
    L33:
        int r6 = r32 & 8;
        if (r6 == 0) goto L37;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L45:
        if (($changed & 24576) == 0) goto L47;
        RadioButtonColors colors2 = colors;
    L55:
        int r10 = r32 & 32;
        if (r10 == 0) goto L59;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        MutableInteractionSource r11 = interactionSource;
    L67:
        if ((74899 & $dirty) == 74898) goto L69;
    L72:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L75;
    L81:
        if (r4 == 0) goto L83;
        Modifier.Companion modifier2 = Modifier.Companion;
    L84:
        if (r6 == 0) goto L87;
        enabled2 = true;
    L87:
        if ((r32 & 16) == 0) goto L89;
        $dirty = $dirty & (-57345);
        colors2 = RadioButtonDefaults.INSTANCE.colors($composer2, 6);
    L89:
        if (r10 == 0) goto L91;
        int $dirty2 = $dirty;
        MutableInteractionSource interactionSource2 = null;
        boolean enabled3 = enabled2;
        RadioButtonColors colors3 = colors2;
    L92:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L95;
        ComposerKt.traceEventStart(408580840, $dirty2, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:82)");
    L95:
        if (selected == false) goto L97;
        float arg0$iv = RadioButtonDotSize;
        float r8 = Dp.m6973constructorimpl(arg0$iv / 2);
    L98:
        State<Dp> r9 = AnimateAsStateKt.m124animateDpAsStateAjpBEmI(r8, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, $composer2, 48, 12);
        State<Color> r12 = colors3.radioColor$material3_release(enabled3, selected, $composer2, ((($dirty2 >> 9) & 14) | (($dirty2 << 3) & 112)) | (($dirty2 >> 6) & 896));
        $composer2.startReplaceGroup(1327106656);
        ComposerKt.sourceInformation($composer2, "98@4448L164");
        if (r25 == null) goto L101;
        Modifier.Companion r17 = Modifier.Companion;
        int r18 = Role.Companion.m6186getRadioButtono7Vup1c();
        float arg0$iv2 = RadioButtonTokens.INSTANCE.m3596getStateLayerSizeD9Ej5fM();
        State<Dp> r21 = r9;
        State<Color> r22 = r12;
        Modifier.Companion r19 = r17;
        final boolean enabled4 = enabled3;
        Modifier.Companion selectableModifier = SelectableKt.m986selectableO2vRcR0(r19, selected, interactionSource2, RippleKt.m2534rippleOrFallbackImplementation9IZ8Weo(false, Dp.m6973constructorimpl(arg0$iv2 / 2), 0, $composer2, 54, 4), enabled4, Role.m6174boximpl(r18), r25);
    L102:
        $composer2.endReplaceGroup();
        if (r25 == null) goto L105;
        Modifier.Companion r1 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.Companion);
    L106:
        Modifier r2 = SizeKt.m764requiredSize3ABfNKs(PaddingKt.m725padding3ABfNKs(SizeKt.wrapContentSize$default(modifier2.then(r1).then(selectableModifier), Alignment.Companion.getCenter(), false, 2, 0), RadioButtonPadding), RadioButtonTokens.INSTANCE.m3595getIconSizeD9Ej5fM());
        ComposerKt.sourceInformationMarkerStart($composer2, 1327137161, "CC(remember):RadioButton.kt#9igjgp");
        final State<Color> r14 = r22;
        final State<Dp> r13 = r21;
        boolean invalid$iv = $composer2.changed(r14) | $composer2.changed(r13);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L109;
    L112:
        Object value$iv = (Function1) new RadioButtonKt$RadioButton$1$1(r14, r13);
        $composer2.updateRememberedValue(value$iv);
    L113:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CanvasKt.Canvas(r2, (Function1) value$iv, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L116;
        ComposerKt.traceEventEnd();
    L116:
        final MutableInteractionSource interactionSource3 = interactionSource2;
        final RadioButtonColors colors4 = colors3;
        final Modifier modifier3 = modifier2;
    L117:
        ScopeUpdateScope r15 = $composer2.endRestartGroup();
        if (r15 == null) goto L121;
        r15.updateScope(new AnonymousClass2(selected, r25, modifier3, enabled4, colors4, interactionSource3, $changed, r32));
        return;
    L121:
        return;
    L109:
        if (it$iv == Composer.Companion.getEmpty()) goto L112;
        value$iv = it$iv;
        goto L113
    L105:
        r1 = Modifier.Companion;
        goto L106
    L101:
        r21 = r9;
        r22 = r12;
        enabled4 = enabled3;
        selectableModifier = Modifier.Companion;
        goto L102
    L97:
        r8 = Dp.m6973constructorimpl(0);
        goto L98
    L91:
        $dirty2 = $dirty;
        enabled3 = enabled2;
        colors3 = colors2;
        interactionSource2 = r11;
        goto L92
    L83:
        modifier2 = r5;
        goto L84
    L75:
        if ($composer2.getDefaultsInvalid() == true) goto L81;
        $composer2.skipToGroupEnd();
        if ((r32 & 16) == 0) goto L80;
        $dirty = $dirty & (-57345);
    L80:
        $dirty2 = $dirty;
        modifier2 = r5;
        enabled3 = enabled2;
        colors3 = colors2;
        interactionSource2 = r11;
        goto L92
    L69:
        if ($composer2.getSkipping() == false) goto L72;
        $composer2.skipToGroupEnd();
        modifier3 = r5;
        colors4 = colors2;
        enabled4 = enabled2;
        interactionSource3 = r11;
        goto L117
    L59:
        if ((196608 & $changed) != 0) goto L65;
        r11 = interactionSource;
        if ($composer2.changed(r11) == false) goto L63;
        int r16 = 131072;
    L64:
        $dirty = $dirty | r16;
        goto L67
    L63:
        r16 = 65536;
        goto L64
    L65:
        r11 = interactionSource;
        goto L67
    L47:
        if ((r32 & 16) != 0) goto L51;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L52;
        int r110 = 16384;
    L53:
        $dirty = $dirty | r110;
    L52:
        r110 = 8192;
        goto L53
    L51:
        colors2 = colors;
        goto L52
    L37:
        if (($changed & 3072) != 0) goto L43;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L41;
        int r20 = 2048;
    L42:
        $dirty = $dirty | r20;
        goto L45
    L41:
        r20 = 1024;
        goto L42
    L43:
        enabled2 = enabled;
        goto L45
    L26:
        if (($changed & 384) != 0) goto L32;
        r5 = modifier;
        if ($composer2.changed(r5) == false) goto L30;
        int r7 = 256;
    L31:
        $dirty = $dirty | r7;
        goto L33
    L30:
        r7 = 128;
        goto L31
    L32:
        r5 = modifier;
        goto L33
    L16:
        if (($changed & 48) != 0) goto L22;
        if ($composer2.changedInstance(r25) == false) goto L20;
        int r23 = 32;
    L21:
        $dirty = $dirty | r23;
        goto L22
    L20:
        r23 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(selected) == false) goto L10;
        int r24 = 4;
    L11:
        $dirty = $dirty | r24;
        goto L13
    L10:
        r24 = 2;
        goto L11
    }

    static {
        RadioButtonPadding = Dp.m6973constructorimpl(2);
        RadioButtonDotSize = Dp.m6973constructorimpl(12);
        RadioStrokeWidth = Dp.m6973constructorimpl(2);
    }
}
