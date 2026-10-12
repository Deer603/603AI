package androidx.compose.material3;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material3.tokens.CheckboxTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: compiled from: Checkbox.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aU\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a-\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\u001b\u001aO\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001a2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0002\u0010 \u001a6\u0010!\u001a\u00020\u000b*\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a>\u0010+\u001a\u00020\u000b*\u00020\"2\u0006\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020'2\u0006\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u00020'2\u0006\u00100\u001a\u000201H\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"BoxInDuration", "", "BoxOutDuration", "CheckAnimationDuration", "CheckboxDefaultPadding", "Landroidx/compose/ui/unit/Dp;", "F", "CheckboxSize", "RadiusSize", "StrokeWidth", "Checkbox", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "colors", "Landroidx/compose/material3/CheckboxColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/CheckboxColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "CheckboxImpl", "value", "Landroidx/compose/ui/state/ToggleableState;", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/CheckboxColors;Landroidx/compose/runtime/Composer;I)V", "TriStateCheckbox", "state", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/CheckboxColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "drawBox", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "boxColor", "Landroidx/compose/ui/graphics/Color;", "borderColor", "radius", "", "strokeWidth", "drawBox-1wkBAMs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFF)V", "drawCheck", "checkColor", "checkFraction", "crossCenterGravitation", "strokeWidthPx", "drawingCache", "Landroidx/compose/material3/CheckDrawingCache;", "drawCheck-3IgeMak", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFFLandroidx/compose/material3/CheckDrawingCache;)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CheckboxKt {
    private static final int BoxInDuration = 50;
    private static final int BoxOutDuration = 100;
    private static final int CheckAnimationDuration = 100;
    private static final float CheckboxDefaultPadding = 0.0f;
    private static final float CheckboxSize = 0.0f;
    private static final float RadiusSize = 0.0f;
    private static final float StrokeWidth = 0.0f;

    /* JADX INFO: compiled from: Checkbox.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[ToggleableState.values().length];
            r0[ToggleableState.On.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L14:
            r0[ToggleableState.Off.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L16:
            r0[ToggleableState.Indeterminate.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L12:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public static final /* synthetic */ void access$CheckboxImpl(boolean enabled, ToggleableState value, Modifier modifier, CheckboxColors colors, Composer $composer, int $changed) {
        CheckboxImpl(enabled, value, modifier, colors, $composer, $changed);
    }

    /* JADX INFO: renamed from: access$drawBox-1wkBAMs, reason: not valid java name */
    public static final /* synthetic */ void m1977access$drawBox1wkBAMs(DrawScope $receiver, long boxColor, long borderColor, float radius, float strokeWidth) {
        m1979drawBox1wkBAMs($receiver, boxColor, borderColor, radius, strokeWidth);
    }

    /* JADX INFO: renamed from: access$drawCheck-3IgeMak, reason: not valid java name */
    public static final /* synthetic */ void m1978access$drawCheck3IgeMak(DrawScope $receiver, long checkColor, float checkFraction, float crossCenterGravitation, float strokeWidthPx, CheckDrawingCache drawingCache) {
        m1980drawCheck3IgeMak($receiver, checkColor, checkFraction, crossCenterGravitation, strokeWidthPx, drawingCache);
    }

    public static final /* synthetic */ float access$getRadiusSize$p() {
        return RadiusSize;
    }

    public static final /* synthetic */ float access$getStrokeWidth$p() {
        return StrokeWidth;
    }

    public static final void Checkbox(final boolean checked, final Function1<? super Boolean, Unit> r18, Modifier modifier, boolean enabled, CheckboxColors colors, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int r25) {
        Composer $composer2 = $composer.startRestartGroup(-1406741137);
        ComposerKt.sourceInformation($composer2, "C(Checkbox)P(!1,5,4,2)96@4296L8,99@4370L356:Checkbox.kt#uh7d8r");
        int $dirty = $changed;
        if ((r25 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r25 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L22:
        int r4 = r25 & 4;
        if (r4 == 0) goto L26;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L33:
        int r9 = r25 & 8;
        if (r9 == 0) goto L37;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L45:
        if (($changed & 24576) == 0) goto L47;
        CheckboxColors colors2 = colors;
    L55:
        int r12 = r25 & 32;
        if (r12 == 0) goto L59;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        MutableInteractionSource interactionSource2 = interactionSource;
    L67:
        if ((74899 & $dirty) == 74898) goto L69;
    L72:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L75;
    L81:
        if (r4 == 0) goto L83;
        modifier2 = Modifier.Companion;
    L83:
        if (r9 == 0) goto L86;
        enabled2 = true;
    L86:
        if ((r25 & 16) == 0) goto L88;
        $dirty = $dirty & (-57345);
        colors2 = CheckboxDefaults.INSTANCE.colors($composer2, 6);
    L88:
        if (r12 == 0) goto L90;
        interactionSource2 = null;
        CheckboxColors colors3 = colors2;
        boolean enabled3 = enabled2;
        Modifier modifier3 = modifier2;
    L91:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L94;
        ComposerKt.traceEventStart(-1406741137, $dirty, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:98)");
    L94:
        ToggleableState r8 = ToggleableStateKt.ToggleableState(checked);
        $composer2.startReplaceGroup(1046936362);
        ComposerKt.sourceInformation($composer2, "103@4507L29");
        if (r18 == null) goto L111;
        ComposerKt.sourceInformationMarkerStart($composer2, 1046937763, "CC(remember):Checkbox.kt#9igjgp");
        boolean r5 = false;
        if (($dirty & 112) != 32) goto L99;
        boolean r0 = true;
    L101:
        if (($dirty & 14) != 4) goto L103;
        r5 = true;
    L103:
        boolean invalid$iv = r0 | r5;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L106;
    L109:
        Object value$iv = (Function0) new CheckboxKt$Checkbox$1$1(r18, checked);
        $composer2.updateRememberedValue(value$iv);
    L110:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Function0 r10 = (Function0) value$iv;
    L112:
        $composer2.endReplaceGroup();
        TriStateCheckbox(r8, r10, modifier3, enabled3, colors3, interactionSource2, $composer2, ((($dirty & 896) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L115;
        ComposerKt.traceEventEnd();
    L115:
        final Modifier modifier4 = modifier3;
        final boolean enabled4 = enabled3;
        final CheckboxColors colors4 = colors3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
    L116:
        ScopeUpdateScope r11 = $composer2.endRestartGroup();
        if (r11 == null) goto L120;
        r11.updateScope(new AnonymousClass2(checked, r18, modifier4, enabled4, colors4, interactionSource3, $changed, r25));
        return;
    L120:
        return;
    L106:
        if (it$iv == Composer.Companion.getEmpty()) goto L109;
        value$iv = it$iv;
        goto L110
    L99:
        r0 = false;
        goto L101
    L111:
        r10 = null;
        goto L112
    L90:
        colors3 = colors2;
        enabled3 = enabled2;
        modifier3 = modifier2;
        goto L91
    L75:
        if ($composer2.getDefaultsInvalid() == true) goto L81;
        $composer2.skipToGroupEnd();
        if ((r25 & 16) == 0) goto L80;
        $dirty = $dirty & (-57345);
    L80:
        colors3 = colors2;
        enabled3 = enabled2;
        modifier3 = modifier2;
        goto L91
    L69:
        if ($composer2.getSkipping() == false) goto L72;
        $composer2.skipToGroupEnd();
        modifier4 = modifier2;
        enabled4 = enabled2;
        colors4 = colors2;
        interactionSource3 = interactionSource2;
        goto L116
    L59:
        if ((196608 & $changed) != 0) goto L65;
        interactionSource2 = interactionSource;
        if ($composer2.changed(interactionSource2) == false) goto L63;
        int r15 = 131072;
    L64:
        $dirty = $dirty | r15;
        goto L67
    L63:
        r15 = 65536;
        goto L64
    L65:
        interactionSource2 = interactionSource;
        goto L67
    L47:
        if ((r25 & 16) != 0) goto L51;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L52;
        int r13 = 16384;
    L53:
        $dirty = $dirty | r13;
    L52:
        r13 = 8192;
        goto L53
    L51:
        colors2 = colors;
        goto L52
    L37:
        if (($changed & 3072) != 0) goto L43;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L41;
        int r14 = 2048;
    L42:
        $dirty = $dirty | r14;
        goto L45
    L41:
        r14 = 1024;
        goto L42
    L43:
        enabled2 = enabled;
        goto L45
    L26:
        if (($changed & 384) != 0) goto L32;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L30;
        int r16 = 256;
    L31:
        $dirty = $dirty | r16;
        goto L33
    L30:
        r16 = 128;
        goto L31
    L32:
        modifier2 = modifier;
        goto L33
    L16:
        if (($changed & 48) != 0) goto L22;
        if ($composer2.changedInstance(r18) == false) goto L20;
        int r6 = 32;
    L21:
        $dirty = $dirty | r6;
        goto L22
    L20:
        r6 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(checked) == false) goto L10;
        int r7 = 4;
    L11:
        $dirty = $dirty | r7;
        goto L13
    L10:
        r7 = 2;
        goto L11
    }

    public static final void TriStateCheckbox(final ToggleableState state, final Function0<Unit> r18, Modifier modifier, boolean enabled, CheckboxColors colors, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int r25) {
        Composer $composer2 = $composer.startRestartGroup(-1608358065);
        ComposerKt.sourceInformation($composer2, "C(TriStateCheckbox)P(5,4,3,1)149@6731L8,169@7373L460:Checkbox.kt#uh7d8r");
        int $dirty = $changed;
        if ((r25 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        ToggleableState r3 = state;
    L14:
        if ((r25 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L23:
        int r4 = r25 & 4;
        if (r4 == 0) goto L27;
        $dirty = $dirty | 384;
        Modifier r5 = modifier;
    L34:
        int r6 = r25 & 8;
        if (r6 == 0) goto L38;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L46:
        if (($changed & 24576) == 0) goto L48;
        CheckboxColors colors2 = colors;
    L56:
        int r10 = r25 & 32;
        if (r10 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        MutableInteractionSource r11 = interactionSource;
    L68:
        if ((74899 & $dirty) == 74898) goto L70;
    L73:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L76;
    L82:
        if (r4 == 0) goto L84;
        Modifier.Companion modifier2 = Modifier.Companion;
    L85:
        if (r6 == 0) goto L88;
        enabled2 = true;
    L88:
        if ((r25 & 16) == 0) goto L90;
        $dirty = $dirty & (-57345);
        colors2 = CheckboxDefaults.INSTANCE.colors($composer2, 6);
    L90:
        if (r10 == 0) goto L92;
        Modifier modifier3 = modifier2;
        MutableInteractionSource interactionSource2 = null;
        CheckboxColors colors3 = colors2;
        int $dirty2 = $dirty;
        boolean enabled3 = enabled2;
    L93:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L96;
        ComposerKt.traceEventStart(-1608358065, $dirty2, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:151)");
    L96:
        $composer2.startReplaceGroup(-97239746);
        ComposerKt.sourceInformation($composer2, "161@7145L161");
        if (r18 == null) goto L99;
        Modifier.Companion r0 = Modifier.Companion;
        int r7 = Role.Companion.m6183getCheckboxo7Vup1c();
        float arg0$iv = CheckboxTokens.INSTANCE.m3155getStateLayerSizeD9Ej5fM();
        boolean enabled4 = enabled3;
        Modifier.Companion toggleableModifier = ToggleableKt.m995triStateToggleableO2vRcR0(r0, r3, interactionSource2, RippleKt.m2534rippleOrFallbackImplementation9IZ8Weo(false, Dp.m6973constructorimpl(arg0$iv / 2), 0, $composer2, 54, 4), enabled4, Role.m6174boximpl(r7), r18);
        enabled3 = enabled4;
    L100:
        $composer2.endReplaceGroup();
        if (r18 == null) goto L103;
        Modifier.Companion r2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.Companion);
    L104:
        int r8 = ((($dirty2 >> 9) & 14) | (($dirty2 << 3) & 112)) | (($dirty2 >> 3) & 7168);
        CheckboxColors colors4 = colors3;
        CheckboxImpl(enabled3, state, PaddingKt.m725padding3ABfNKs(modifier3.then(r2).then(toggleableModifier), CheckboxDefaultPadding), colors4, $composer2, r8);
        if (ComposerKt.isTraceInProgress() == false) goto L107;
        ComposerKt.traceEventEnd();
    L107:
        final CheckboxColors colors5 = colors4;
        final Modifier modifier4 = modifier3;
        final boolean enabled5 = enabled3;
        final MutableInteractionSource interactionSource3 = interactionSource2;
    L108:
        ScopeUpdateScope r12 = $composer2.endRestartGroup();
        if (r12 == null) goto L112;
        r12.updateScope(new AnonymousClass1(state, r18, modifier4, enabled5, colors5, interactionSource3, $changed, r25));
        return;
    L112:
        return;
    L103:
        r2 = Modifier.Companion;
        goto L104
    L99:
        toggleableModifier = Modifier.Companion;
        goto L100
    L92:
        modifier3 = modifier2;
        colors3 = colors2;
        interactionSource2 = r11;
        $dirty2 = $dirty;
        enabled3 = enabled2;
        goto L93
    L84:
        modifier2 = r5;
        goto L85
    L76:
        if ($composer2.getDefaultsInvalid() == true) goto L82;
        $composer2.skipToGroupEnd();
        if ((r25 & 16) == 0) goto L81;
        $dirty = $dirty & (-57345);
    L81:
        $dirty2 = $dirty;
        modifier3 = r5;
        enabled3 = enabled2;
        colors3 = colors2;
        interactionSource2 = r11;
        goto L93
    L70:
        if ($composer2.getSkipping() == false) goto L73;
        $composer2.skipToGroupEnd();
        modifier4 = r5;
        enabled5 = enabled2;
        colors5 = colors2;
        interactionSource3 = r11;
        goto L108
    L60:
        if ((196608 & $changed) != 0) goto L66;
        r11 = interactionSource;
        if ($composer2.changed(r11) == false) goto L64;
        int r13 = 131072;
    L65:
        $dirty = $dirty | r13;
        goto L68
    L64:
        r13 = 65536;
        goto L65
    L66:
        r11 = interactionSource;
        goto L68
    L48:
        if ((r25 & 16) != 0) goto L52;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L53;
        int r14 = 16384;
    L54:
        $dirty = $dirty | r14;
    L53:
        r14 = 8192;
        goto L54
    L52:
        colors2 = colors;
        goto L53
    L38:
        if (($changed & 3072) != 0) goto L44;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L42;
        int r9 = 2048;
    L43:
        $dirty = $dirty | r9;
        goto L46
    L42:
        r9 = 1024;
        goto L43
    L44:
        enabled2 = enabled;
        goto L46
    L27:
        if (($changed & 384) != 0) goto L33;
        r5 = modifier;
        if ($composer2.changed(r5) == false) goto L31;
        int r15 = 256;
    L32:
        $dirty = $dirty | r15;
        goto L34
    L31:
        r15 = 128;
        goto L32
    L33:
        r5 = modifier;
        goto L34
    L17:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changedInstance(r18) == false) goto L21;
        int r16 = 32;
    L22:
        $dirty = $dirty | r16;
        goto L23
    L21:
        r16 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r3 = state;
        if ($composer2.changed(r3) == false) goto L10;
        int r17 = 4;
    L11:
        $dirty = $dirty | r17;
        goto L14
    L10:
        r17 = 2;
        goto L11
    L12:
        r3 = state;
        goto L14
    }

    private static final void CheckboxImpl(final boolean enabled, final ToggleableState value, final Modifier modifier, final CheckboxColors colors, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(2007131616);
        ComposerKt.sourceInformation($composer2, "C(CheckboxImpl)P(1,3,2)272@12420L23,274@12491L499,291@13057L514,306@13593L32,307@13654L21,308@13702L24,309@13756L27,310@13866L538,310@13788L616:Checkbox.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(enabled) == false) goto L7;
        int r7 = 4;
    L8:
        $dirty = $dirty | r7;
        goto L10
    L7:
        r7 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(value) == false) goto L14;
        int r8 = 32;
    L15:
        $dirty = $dirty | r8;
        goto L17
    L14:
        r8 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changed(modifier) == false) goto L21;
        int r9 = 256;
    L22:
        $dirty = $dirty | r9;
        goto L24
    L21:
        r9 = 128;
    L24:
        if (($changed & 3072) == 0) goto L26;
    L30:
        int $dirty2 = $dirty;
        if (($dirty2 & 1171) != 1170) goto L37;
        if ($composer2.getSkipping() == false) goto L37;
        $composer2.skipToGroupEnd();
    L110:
        ScopeUpdateScope r6 = $composer2.endRestartGroup();
        if (r6 == null) goto L114;
        r6.updateScope(new C04872(enabled, value, modifier, colors, $changed));
        return;
    L114:
        return;
    L37:
        if (ComposerKt.isTraceInProgress() == false) goto L39;
        ComposerKt.traceEventStart(2007131616, $dirty2, -1, "androidx.compose.material3.CheckboxImpl (Checkbox.kt:271)");
    L39:
        Transition transition = TransitionKt.updateTransition(value, null, $composer2, ($dirty2 >> 3) & 14, 2);
        Function3 transitionSpec$iv = CheckboxKt$CheckboxImpl$checkDrawFraction$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> r13 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int $changed$iv$iv = (((0 & 14) | ((0 << 3) & 896)) | ((0 << 3) & 7168)) | ((0 << 3) & 57344);
        ComposerKt.sourceInformationMarkerStart($composer2, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        int $changed2 = ($changed$iv$iv >> 9) & 112;
        ToggleableState it = (ToggleableState) transition.getCurrentState();
        $composer2.startReplaceGroup(1800065638);
        ComposerKt.sourceInformation($composer2, "C:Checkbox.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L43;
        ComposerKt.traceEventStart(1800065638, $changed2, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:283)");
    L43:
        float r29 = 0.0f;
        switch(WhenMappings.$EnumSwitchMapping$0[it.ordinal()]) {
            case 1: goto L49;
            case 2: goto L48;
            case 3: goto L47;
            default: goto L46;
        };
    L47:
        float r5 = 1.0f;
    L51:
        if (ComposerKt.isTraceInProgress() == false) goto L53;
        ComposerKt.traceEventEnd();
    L53:
        $composer2.endReplaceGroup();
        Object initialValue$iv$iv = Float.valueOf(r5);
        int $changed3 = ($changed$iv$iv >> 9) & 112;
        ToggleableState it2 = (ToggleableState) r6.getTargetState();
        $composer2.startReplaceGroup(1800065638);
        ComposerKt.sourceInformation($composer2, "C:Checkbox.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L58;
        ComposerKt.traceEventStart(1800065638, $changed3, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:283)");
    L58:
        switch(WhenMappings.$EnumSwitchMapping$0[it2.ordinal()]) {
            case 1: goto L63;
            case 2: goto L62;
            case 3: goto L61;
            default: goto L60;
        };
    L61:
        float r0 = 1.0f;
    L65:
        if (ComposerKt.isTraceInProgress() == false) goto L67;
        ComposerKt.traceEventEnd();
    L67:
        $composer2.endReplaceGroup();
        Object targetValue$iv$iv = Float.valueOf(r0);
        final State checkDrawFraction = TransitionKt.createTransitionAnimation(transition, initialValue$iv$iv, targetValue$iv$iv, transitionSpec$iv.invoke(r6.getSegment(), $composer2, Integer.valueOf(($changed$iv$iv >> 3) & 112)), r13, "FloatAnimation", $composer2, (($changed$iv$iv & 14) | (($changed$iv$iv << 9) & 57344)) | (($changed$iv$iv << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Function3 transitionSpec$iv2 = CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> r10 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int $changed$iv$iv2 = (((0 & 14) | ((0 << 3) & 896)) | ((0 << 3) & 7168)) | ((0 << 3) & 57344);
        ComposerKt.sourceInformationMarkerStart($composer2, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        int $changed4 = ($changed$iv$iv2 >> 9) & 112;
        ToggleableState r11 = (ToggleableState) transition.getCurrentState();
        $composer2.startReplaceGroup(-1426969489);
        ComposerKt.sourceInformation($composer2, "C:Checkbox.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L72;
        ComposerKt.traceEventStart(-1426969489, $changed4, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:300)");
    L72:
        switch(WhenMappings.$EnumSwitchMapping$0[r11.ordinal()]) {
            case 1: goto L77;
            case 2: goto L76;
            case 3: goto L75;
            default: goto L74;
        };
    L75:
        float r1 = 1.0f;
    L79:
        if (ComposerKt.isTraceInProgress() == false) goto L81;
        ComposerKt.traceEventEnd();
    L81:
        $composer2.endReplaceGroup();
        Object initialValue$iv$iv2 = Float.valueOf(r1);
        int $changed5 = ($changed$iv$iv2 >> 9) & 112;
        ToggleableState it3 = (ToggleableState) r5.getTargetState();
        $composer2.startReplaceGroup(-1426969489);
        ComposerKt.sourceInformation($composer2, "C:Checkbox.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L86;
        ComposerKt.traceEventStart(-1426969489, $changed5, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:300)");
    L86:
        switch(WhenMappings.$EnumSwitchMapping$0[it3.ordinal()]) {
            case 1: goto L93;
            case 2: goto L93;
            case 3: goto L89;
            default: goto L88;
        };
    L89:
        r29 = 1.0f;
        goto L93
    L88:
        throw new NoWhenBranchMatchedException();
    L93:
        if (ComposerKt.isTraceInProgress() == false) goto L95;
        ComposerKt.traceEventEnd();
    L95:
        $composer2.endReplaceGroup();
        Object targetValue$iv$iv2 = Float.valueOf(r29);
        final State checkCenterGravitationShiftFraction = TransitionKt.createTransitionAnimation(transition, initialValue$iv$iv2, targetValue$iv$iv2, transitionSpec$iv2.invoke(r5.getSegment(), $composer2, Integer.valueOf(($changed$iv$iv2 >> 3) & 112)), r10, "FloatAnimation", $composer2, (($changed$iv$iv2 & 14) | (($changed$iv$iv2 << 9) & 57344)) | (($changed$iv$iv2 << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 974828454, "CC(remember):Checkbox.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L98;
        Object value$iv = new CheckDrawingCache(null, null, null, 7, null);
        $composer2.updateRememberedValue(value$iv);
    L99:
        final CheckDrawingCache checkCache = (CheckDrawingCache) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final State<Color> r12 = colors.checkmarkColor$material3_release(value, $composer2, (($dirty2 >> 3) & 14) | (($dirty2 >> 6) & 112));
        final State<Color> r14 = colors.boxColor$material3_release(enabled, value, $composer2, (($dirty2 & 14) | ($dirty2 & 112)) | (($dirty2 >> 3) & 896));
        final State<Color> r15 = colors.borderColor$material3_release(enabled, value, $composer2, (($dirty2 & 14) | ($dirty2 & 112)) | (($dirty2 >> 3) & 896));
        Modifier r16 = SizeKt.m764requiredSize3ABfNKs(SizeKt.wrapContentSize$default(modifier, Alignment.Companion.getCenter(), false, 2, null), CheckboxSize);
        ComposerKt.sourceInformationMarkerStart($composer2, 974837696, "CC(remember):Checkbox.kt#9igjgp");
        boolean invalid$iv = ((($composer2.changed(r14) | $composer2.changed(r15)) | $composer2.changed(r12)) | $composer2.changed(checkDrawFraction)) | $composer2.changed(checkCenterGravitationShiftFraction);
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv == true) goto L106;
        if (it$iv2 == Composer.Companion.getEmpty()) goto L106;
        Object value$iv2 = it$iv2;
    L107:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CanvasKt.Canvas(r16, (Function1) value$iv2, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L110;
        ComposerKt.traceEventEnd();
    L106:
        value$iv2 = new CheckboxKt$CheckboxImpl$1$1(r14, r15, r12, checkDrawFraction, checkCenterGravitationShiftFraction, checkCache);
        $composer2.updateRememberedValue(value$iv2);
        goto L107
    L98:
        value$iv = it$iv;
        goto L99
    L76:
        r1 = 0.0f;
        goto L79
    L77:
        r1 = 0.0f;
        goto L79
    L74:
        throw new NoWhenBranchMatchedException();
    L62:
        r0 = 0.0f;
        goto L65
    L63:
        r0 = 1.0f;
        goto L65
    L60:
        throw new NoWhenBranchMatchedException();
    L48:
        r5 = 0.0f;
        goto L51
    L49:
        r5 = 1.0f;
        goto L51
    L46:
        throw new NoWhenBranchMatchedException();
    L26:
        if ($composer2.changed(colors) == false) goto L28;
        int r17 = 2048;
    L29:
        $dirty = $dirty | r17;
        goto L30
    L28:
        r17 = 1024;
        goto L29
    }

    /* JADX INFO: renamed from: drawBox-1wkBAMs, reason: not valid java name */
    private static final void m1979drawBox1wkBAMs(DrawScope $this$drawBox_u2d1wkBAMs, long boxColor, long borderColor, float radius, float strokeWidth) {
        float halfStrokeWidth = strokeWidth / 2.0f;
        Stroke stroke = new Stroke(strokeWidth, 0.0f, 0, 0, null, 30, null);
        float checkboxSize = Size.m4194getWidthimpl($this$drawBox_u2d1wkBAMs.mo4917getSizeNHjbRc());
        if (Color.m4367equalsimpl0(boxColor, borderColor) == false) goto L5;
        DrawScope.m4913drawRoundRectuAw5IA$default($this$drawBox_u2d1wkBAMs, boxColor, 0, androidx.compose.ui.geometry.SizeKt.Size(checkboxSize, checkboxSize), CornerRadiusKt.CornerRadius$default(radius, 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, 226, null);
        return;
    L5:
        DrawScope.m4913drawRoundRectuAw5IA$default($this$drawBox_u2d1wkBAMs, boxColor, OffsetKt.Offset(strokeWidth, strokeWidth), androidx.compose.ui.geometry.SizeKt.Size(checkboxSize - (strokeWidth * 2.0f), checkboxSize - (strokeWidth * 2.0f)), CornerRadiusKt.CornerRadius$default(Math.max(0.0f, radius - strokeWidth), 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, 224, null);
        DrawScope.m4913drawRoundRectuAw5IA$default($this$drawBox_u2d1wkBAMs, borderColor, OffsetKt.Offset(halfStrokeWidth, halfStrokeWidth), androidx.compose.ui.geometry.SizeKt.Size(checkboxSize - strokeWidth, checkboxSize - strokeWidth), CornerRadiusKt.CornerRadius$default(radius - halfStrokeWidth, 0.0f, 2, null), stroke, 0.0f, null, 0, 224, null);
    }

    /* JADX INFO: renamed from: drawCheck-3IgeMak, reason: not valid java name */
    private static final void m1980drawCheck3IgeMak(DrawScope $this$drawCheck_u2d3IgeMak, long checkColor, float checkFraction, float crossCenterGravitation, float strokeWidthPx, CheckDrawingCache drawingCache) {
        Stroke stroke = new Stroke(strokeWidthPx, 0.0f, StrokeCap.Companion.m4721getSquareKaPHkGw(), 0, null, 26, null);
        float width = Size.m4194getWidthimpl($this$drawCheck_u2d3IgeMak.mo4917getSizeNHjbRc());
        float gravitatedCrossX = MathHelpersKt.lerp(0.4f, 0.5f, crossCenterGravitation);
        float gravitatedCrossY = MathHelpersKt.lerp(0.7f, 0.5f, crossCenterGravitation);
        float gravitatedLeftY = MathHelpersKt.lerp(0.5f, 0.5f, crossCenterGravitation);
        float gravitatedRightY = MathHelpersKt.lerp(0.3f, 0.5f, crossCenterGravitation);
        drawingCache.getCheckPath().reset();
        drawingCache.getCheckPath().moveTo(width * 0.2f, width * gravitatedLeftY);
        drawingCache.getCheckPath().lineTo(width * gravitatedCrossX, width * gravitatedCrossY);
        drawingCache.getCheckPath().lineTo(width * 0.8f, width * gravitatedRightY);
        drawingCache.getPathMeasure().setPath(drawingCache.getCheckPath(), false);
        drawingCache.getPathToDraw().reset();
        drawingCache.getPathMeasure().getSegment(0.0f, drawingCache.getPathMeasure().getLength() * checkFraction, drawingCache.getPathToDraw(), true);
        DrawScope.m4907drawPathLG529CI$default($this$drawCheck_u2d3IgeMak, drawingCache.getPathToDraw(), checkColor, 0.0f, stroke, null, 0, 52, null);
    }

    static {
        CheckboxDefaultPadding = Dp.m6973constructorimpl(2);
        CheckboxSize = Dp.m6973constructorimpl(20);
        StrokeWidth = Dp.m6973constructorimpl(2);
        RadiusSize = Dp.m6973constructorimpl(2);
    }
}
