package androidx.compose.material;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
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
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aU\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001a-\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010\u001c\u001aO\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001b2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010 2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010!\u001a6\u0010\"\u001a\u00020\f*\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0002ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a>\u0010,\u001a\u00020\f*\u00020#2\u0006\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020(2\u0006\u00101\u001a\u000202H\u0002ø\u0001\u0000¢\u0006\u0004\b3\u00104\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065²\u0006\n\u00106\u001a\u00020(X\u008a\u0084\u0002²\u0006\n\u00107\u001a\u00020(X\u008a\u0084\u0002²\u0006\n\u0010-\u001a\u00020%X\u008a\u0084\u0002²\u0006\n\u0010$\u001a\u00020%X\u008a\u0084\u0002²\u0006\n\u0010&\u001a\u00020%X\u008a\u0084\u0002"}, d2 = {"BoxInDuration", "", "BoxOutDuration", "CheckAnimationDuration", "CheckboxDefaultPadding", "Landroidx/compose/ui/unit/Dp;", "F", "CheckboxRippleRadius", "CheckboxSize", "RadiusSize", "StrokeWidth", "Checkbox", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/CheckboxColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "CheckboxImpl", "value", "Landroidx/compose/ui/state/ToggleableState;", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;I)V", "TriStateCheckbox", "state", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "drawBox", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "boxColor", "Landroidx/compose/ui/graphics/Color;", "borderColor", "radius", "", "strokeWidth", "drawBox-1wkBAMs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFF)V", "drawCheck", "checkColor", "checkFraction", "crossCenterGravitation", "strokeWidthPx", "drawingCache", "Landroidx/compose/material/CheckDrawingCache;", "drawCheck-3IgeMak", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFFLandroidx/compose/material/CheckDrawingCache;)V", "material_release", "checkDrawFraction", "checkCenterGravitationShiftFraction"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CheckboxKt {
    private static final int BoxInDuration = 50;
    private static final int BoxOutDuration = 100;
    private static final int CheckAnimationDuration = 100;
    private static final float CheckboxDefaultPadding = 0.0f;
    private static final float CheckboxRippleRadius = 0.0f;
    private static final float CheckboxSize = 0.0f;
    private static final float RadiusSize = 0.0f;
    private static final float StrokeWidth = 0.0f;

    /* JADX INFO: compiled from: Checkbox.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
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

    public static final /* synthetic */ float access$CheckboxImpl$lambda$2(State $checkDrawFraction$delegate) {
        return CheckboxImpl$lambda$2($checkDrawFraction$delegate);
    }

    public static final /* synthetic */ float access$CheckboxImpl$lambda$4(State $checkCenterGravitationShiftFraction$delegate) {
        return CheckboxImpl$lambda$4($checkCenterGravitationShiftFraction$delegate);
    }

    public static final /* synthetic */ long access$CheckboxImpl$lambda$6(State $checkColor$delegate) {
        return CheckboxImpl$lambda$6($checkColor$delegate);
    }

    public static final /* synthetic */ long access$CheckboxImpl$lambda$7(State $boxColor$delegate) {
        return CheckboxImpl$lambda$7($boxColor$delegate);
    }

    public static final /* synthetic */ long access$CheckboxImpl$lambda$8(State $borderColor$delegate) {
        return CheckboxImpl$lambda$8($borderColor$delegate);
    }

    /* JADX INFO: renamed from: access$drawBox-1wkBAMs, reason: not valid java name */
    public static final /* synthetic */ void m1577access$drawBox1wkBAMs(DrawScope $receiver, long boxColor, long borderColor, float radius, float strokeWidth) {
        m1579drawBox1wkBAMs($receiver, boxColor, borderColor, radius, strokeWidth);
    }

    /* JADX INFO: renamed from: access$drawCheck-3IgeMak, reason: not valid java name */
    public static final /* synthetic */ void m1578access$drawCheck3IgeMak(DrawScope $receiver, long checkColor, float checkFraction, float crossCenterGravitation, float strokeWidthPx, CheckDrawingCache drawingCache) {
        m1580drawCheck3IgeMak($receiver, checkColor, checkFraction, crossCenterGravitation, strokeWidthPx, drawingCache);
    }

    public static final /* synthetic */ float access$getRadiusSize$p() {
        return RadiusSize;
    }

    public static final /* synthetic */ float access$getStrokeWidth$p() {
        return StrokeWidth;
    }

    public static final void Checkbox(final boolean checked, final Function1<? super Boolean, Unit> r27, Modifier modifier, boolean enabled, MutableInteractionSource interactionSource, CheckboxColors colors, Composer $composer, final int $changed, final int r34) {
        Composer $composer2 = $composer.startRestartGroup(-2118660998);
        ComposerKt.sourceInformation($composer2, "C(Checkbox)P(!1,5,4,2,3)92@4173L324:Checkbox.kt#jmzs0o");
        int $dirty = $changed;
        if ((r34 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r34 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L22:
        int r4 = r34 & 4;
        if (r4 == 0) goto L26;
        $dirty = $dirty | 384;
        Modifier r8 = modifier;
    L33:
        int r9 = r34 & 8;
        if (r9 == 0) goto L37;
        $dirty = $dirty | 3072;
        boolean r10 = enabled;
    L44:
        int r11 = r34 & 16;
        if (r11 == 0) goto L48;
        $dirty = $dirty | 24576;
        MutableInteractionSource interactionSource2 = interactionSource;
    L56:
        if ((196608 & $changed) == 0) goto L58;
        CheckboxColors colors2 = colors;
    L66:
        boolean r22 = false;
        if ((74899 & $dirty) == 74898) goto L69;
        boolean r5 = true;
    L71:
        if ($composer2.shouldExecute(r5, $dirty & 1) == false) goto L119;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "90@4156L8");
        if (($changed & 1) != 0) goto L75;
    L81:
        if (r4 == 0) goto L83;
        Modifier.Companion modifier2 = Modifier.Companion;
    L84:
        if (r9 == 0) goto L86;
        boolean enabled2 = true;
    L87:
        if (r11 == 0) goto L89;
        MutableInteractionSource interactionSource3 = null;
    L91:
        if ((r34 & 32) == 0) goto L93;
        CheckboxColors colors3 = CheckboxDefaults.INSTANCE.m1576colorszjMxDiM(0, 0, 0, 0, 0, $composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
        $composer2 = $composer2;
        $dirty = $dirty & (-458753);
        Modifier modifier3 = modifier2;
        boolean enabled3 = enabled2;
        colors2 = colors3;
        interactionSource2 = interactionSource3;
    L94:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L97;
        ComposerKt.traceEventStart(-2118660998, $dirty, -1, "androidx.compose.material.Checkbox (Checkbox.kt:91)");
    L97:
        ToggleableState r12 = ToggleableStateKt.ToggleableState(checked);
        if (r27 == null) goto L114;
        $composer2.startReplaceGroup(-1450332004);
        ComposerKt.sourceInformation($composer2, "96@4310L29");
        ComposerKt.sourceInformationMarkerStart($composer2, 1477236294, "CC(remember):Checkbox.kt#9igjgp");
        if (($dirty & 112) != 32) goto L102;
        boolean r0 = true;
    L104:
        if (($dirty & 14) != 4) goto L106;
        r22 = true;
    L106:
        boolean invalid$iv = r0 | r22;
        Composer $this$cache$iv = $composer2;
        Object it$iv = $this$cache$iv.rememberedValue();
        if (invalid$iv == false) goto L109;
    L112:
        Object value$iv = (Function0) new CheckboxKt$Checkbox$1$1(r27, checked);
        $this$cache$iv.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L113:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endReplaceGroup();
        Function0 r13 = (Function0) it$iv;
    L115:
        TriStateCheckbox(r12, r13, modifier3, enabled3, interactionSource2, colors2, $composer2, ((($dirty & 896) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L118;
        ComposerKt.traceEventEnd();
    L118:
        final Modifier modifier4 = modifier3;
        final boolean enabled4 = enabled3;
        final CheckboxColors colors4 = colors2;
        final MutableInteractionSource interactionSource4 = interactionSource2;
    L120:
        ScopeUpdateScope r14 = $composer2.endRestartGroup();
        if (r14 == null) goto L124;
        r14.updateScope(new AnonymousClass2(checked, r27, modifier4, enabled4, interactionSource4, colors4, $changed, r34));
        return;
    L124:
        return;
    L109:
        if (it$iv != Composer.Companion.getEmpty()) goto L113;
    L102:
        r0 = false;
        goto L104
    L114:
        $composer2.startReplaceGroup(-1450267308);
        $composer2.endReplaceGroup();
        r13 = null;
        goto L115
    L93:
        colors2 = colors;
        modifier3 = modifier2;
        enabled3 = enabled2;
        interactionSource2 = interactionSource3;
        goto L94
    L89:
        interactionSource3 = interactionSource2;
        goto L91
    L86:
        enabled2 = r10;
        goto L87
    L83:
        modifier2 = r8;
        goto L84
    L75:
        if ($composer2.getDefaultsInvalid() == true) goto L81;
        $composer2.skipToGroupEnd();
        if ((r34 & 32) == 0) goto L80;
        $dirty = $dirty & (-458753);
    L80:
        enabled3 = r10;
        modifier3 = r8;
        goto L94
    L119:
        $composer2.skipToGroupEnd();
        colors4 = colors;
        modifier4 = r8;
        enabled4 = r10;
        interactionSource4 = interactionSource2;
        goto L120
    L69:
        r5 = false;
        goto L71
    L58:
        if ((r34 & 32) != 0) goto L62;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L63;
        int r15 = 131072;
    L64:
        $dirty = $dirty | r15;
    L63:
        r15 = 65536;
        goto L64
    L62:
        colors2 = colors;
        goto L63
    L48:
        if (($changed & 24576) != 0) goto L54;
        interactionSource2 = interactionSource;
        if ($composer2.changed(interactionSource2) == false) goto L52;
        int r16 = 16384;
    L53:
        $dirty = $dirty | r16;
        goto L56
    L52:
        r16 = 8192;
        goto L53
    L54:
        interactionSource2 = interactionSource;
        goto L56
    L37:
        if (($changed & 3072) != 0) goto L43;
        r10 = enabled;
        if ($composer2.changed(r10) == false) goto L41;
        int r17 = 2048;
    L42:
        $dirty = $dirty | r17;
        goto L44
    L41:
        r17 = 1024;
        goto L42
    L43:
        r10 = enabled;
        goto L44
    L26:
        if (($changed & 384) != 0) goto L32;
        r8 = modifier;
        if ($composer2.changed(r8) == false) goto L30;
        int r18 = 256;
    L31:
        $dirty = $dirty | r18;
        goto L33
    L30:
        r18 = 128;
        goto L31
    L32:
        r8 = modifier;
        goto L33
    L16:
        if (($changed & 48) != 0) goto L22;
        if ($composer2.changedInstance(r27) == false) goto L20;
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

    public static final void TriStateCheckbox(final ToggleableState state, final Function0<Unit> r25, Modifier modifier, boolean enabled, MutableInteractionSource interactionSource, CheckboxColors colors, Composer $composer, final int $changed, final int r32) {
        Composer $composer2 = $composer.startRestartGroup(2031255194);
        ComposerKt.sourceInformation($composer2, "C(TriStateCheckbox)P(5,4,3,1,2)154@6914L460:Checkbox.kt#jmzs0o");
        int $dirty = $changed;
        if ((r32 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        ToggleableState r3 = state;
    L14:
        if ((r32 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L23:
        int r4 = r32 & 4;
        if (r4 == 0) goto L27;
        $dirty = $dirty | 384;
        Modifier r6 = modifier;
    L34:
        int r8 = r32 & 8;
        if (r8 == 0) goto L38;
        $dirty = $dirty | 3072;
        boolean r9 = enabled;
    L45:
        int r10 = r32 & 16;
        if (r10 == 0) goto L49;
        $dirty = $dirty | 24576;
        MutableInteractionSource r11 = interactionSource;
    L57:
        if ((196608 & $changed) == 0) goto L59;
        CheckboxColors colors2 = colors;
    L68:
        if ((74899 & $dirty) == 74898) goto L70;
        boolean r13 = true;
    L72:
        if ($composer2.shouldExecute(r13, $dirty & 1) == false) goto L109;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "139@6456L8");
        if (($changed & 1) != 0) goto L76;
    L82:
        if (r4 == 0) goto L84;
        Modifier.Companion modifier2 = Modifier.Companion;
    L85:
        if (r8 == 0) goto L87;
        boolean enabled2 = true;
    L88:
        if (r10 == 0) goto L90;
        MutableInteractionSource interactionSource2 = null;
    L92:
        if ((r32 & 32) == 0) goto L94;
        Composer $composer3 = $composer2;
        int $dirty2 = $dirty & (-458753);
        Modifier modifier3 = modifier2;
        colors2 = CheckboxDefaults.INSTANCE.m1576colorszjMxDiM(0, 0, 0, 0, 0, $composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
        boolean enabled3 = enabled2;
        MutableInteractionSource interactionSource3 = interactionSource2;
    L95:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L98;
        ComposerKt.traceEventStart(2031255194, $dirty2, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:140)");
    L98:
        if (r25 == null) goto L100;
        Modifier.Companion r0 = Modifier.Companion;
        int r5 = Role.Companion.m6183getCheckboxo7Vup1c();
        IndicationNodeFactory r7 = RippleKt.m1746rippleH2RKhps$default(false, CheckboxRippleRadius, 0, 4, null);
        Role r12 = Role.m6174boximpl(r5);
        boolean enabled4 = enabled3;
        Modifier.Companion toggleableModifier = ToggleableKt.m995triStateToggleableO2vRcR0(r0, r3, interactionSource3, r7, enabled4, r12, r25);
        enabled3 = enabled4;
    L102:
        if (r25 == null) goto L104;
        Modifier.Companion r2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.Companion);
    L105:
        CheckboxColors colors3 = colors2;
        CheckboxImpl(enabled3, state, PaddingKt.m725padding3ABfNKs(modifier3.then(r2).then(toggleableModifier), CheckboxDefaultPadding), colors3, $composer3, ((($dirty2 >> 9) & 14) | (($dirty2 << 3) & 112)) | (($dirty2 >> 6) & 7168));
        if (ComposerKt.isTraceInProgress() == false) goto L108;
        ComposerKt.traceEventEnd();
    L108:
        final CheckboxColors colors4 = colors3;
        final Modifier modifier4 = modifier3;
        final MutableInteractionSource interactionSource4 = interactionSource3;
        final boolean enabled5 = enabled3;
    L110:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L114;
        r14.updateScope(new AnonymousClass1(state, r25, modifier4, enabled5, interactionSource4, colors4, $changed, r32));
        return;
    L114:
        return;
    L104:
        r2 = Modifier.Companion;
        goto L105
    L100:
        toggleableModifier = Modifier.Companion;
        goto L102
    L94:
        $composer3 = $composer2;
        colors2 = colors;
        $dirty2 = $dirty;
        modifier3 = modifier2;
        enabled3 = enabled2;
        interactionSource3 = interactionSource2;
        goto L95
    L90:
        interactionSource2 = r11;
        goto L92
    L87:
        enabled2 = r9;
        goto L88
    L84:
        modifier2 = r6;
        goto L85
    L76:
        if ($composer2.getDefaultsInvalid() == true) goto L82;
        $composer2.skipToGroupEnd();
        if ((r32 & 32) == 0) goto L81;
        $dirty = $dirty & (-458753);
    L81:
        boolean r15 = r9;
        $dirty2 = $dirty;
        enabled3 = r15;
        $composer3 = $composer2;
        modifier3 = r6;
        interactionSource3 = r11;
        goto L95
    L109:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier4 = r6;
        enabled5 = r9;
        interactionSource4 = r11;
        colors4 = colors;
        goto L110
    L70:
        r13 = false;
        goto L72
    L59:
        if ((r32 & 32) != 0) goto L63;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L64;
        int r16 = 131072;
    L65:
        $dirty = $dirty | r16;
    L64:
        r16 = 65536;
        goto L65
    L63:
        colors2 = colors;
        goto L64
    L49:
        if (($changed & 24576) != 0) goto L55;
        r11 = interactionSource;
        if ($composer2.changed(r11) == false) goto L53;
        int r17 = 16384;
    L54:
        $dirty = $dirty | r17;
        goto L57
    L53:
        r17 = 8192;
        goto L54
    L55:
        r11 = interactionSource;
        goto L57
    L38:
        if (($changed & 3072) != 0) goto L44;
        r9 = enabled;
        if ($composer2.changed(r9) == false) goto L42;
        int r18 = 2048;
    L43:
        $dirty = $dirty | r18;
        goto L45
    L42:
        r18 = 1024;
        goto L43
    L44:
        r9 = enabled;
        goto L45
    L27:
        if (($changed & 384) != 0) goto L33;
        r6 = modifier;
        if ($composer2.changed(r6) == false) goto L31;
        int r19 = 256;
    L32:
        $dirty = $dirty | r19;
        goto L34
    L31:
        r19 = 128;
        goto L32
    L33:
        r6 = modifier;
        goto L34
    L17:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changedInstance(r25) == false) goto L21;
        int r20 = 32;
    L22:
        $dirty = $dirty | r20;
        goto L23
    L21:
        r20 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r3 = state;
        if ($composer2.changed(r3) == false) goto L10;
        int r21 = 4;
    L11:
        $dirty = $dirty | r21;
        goto L14
    L10:
        r21 = 2;
        goto L11
    L12:
        r3 = state;
        goto L14
    }

    private static final void CheckboxImpl(final boolean enabled, final ToggleableState value, final Modifier modifier, final CheckboxColors colors, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-2118895727);
        ComposerKt.sourceInformation($composer2, "C(CheckboxImpl)P(1,3,2)259@10945L23,261@11017L499,278@11584L514,293@12120L32,294@12182L21,295@12231L24,296@12286L27,297@12396L508,297@12318L586:Checkbox.kt#jmzs0o");
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
        if (($dirty2 & 1171) == 1170) goto L33;
        boolean r6 = true;
    L35:
        if ($composer2.shouldExecute(r6, $dirty2 & 1) == true) goto L37;
        $composer2.skipToGroupEnd();
    L110:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L114;
        r10.updateScope(new C04232(enabled, value, modifier, colors, $changed));
        return;
    L114:
        return;
    L37:
        if (ComposerKt.isTraceInProgress() == false) goto L39;
        ComposerKt.traceEventStart(-2118895727, $dirty2, -1, "androidx.compose.material.CheckboxImpl (Checkbox.kt:258)");
    L39:
        Transition transition = TransitionKt.updateTransition(value, null, $composer2, ($dirty2 >> 3) & 14, 2);
        Function3 transitionSpec$iv = CheckboxKt$CheckboxImpl$checkDrawFraction$2.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1338768149, "CC(animateFloat)P(2)1968@80576L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> r19 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int $changed$iv$iv = (((0 & 14) | ((0 << 3) & 896)) | ((0 << 3) & 7168)) | ((0 << 3) & 57344);
        ComposerKt.sourceInformationMarkerStart($composer2, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
        int $changed2 = ($changed$iv$iv >> 9) & 112;
        ToggleableState it = (ToggleableState) transition.getCurrentState();
        $composer2.startReplaceGroup(-1798345588);
        ComposerKt.sourceInformation($composer2, "C:Checkbox.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L44;
        ComposerKt.traceEventStart(-1798345588, $changed2, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:270)");
    L44:
        switch(WhenMappings.$EnumSwitchMapping$0[it.ordinal()]) {
            case 1: goto L49;
            case 2: goto L48;
            case 3: goto L47;
            default: goto L46;
        };
    L47:
        float r0 = 1.0f;
    L51:
        if (ComposerKt.isTraceInProgress() == false) goto L53;
        ComposerKt.traceEventEnd();
    L53:
        $composer2.endReplaceGroup();
        Object initialValue$iv$iv = Float.valueOf(r0);
        Object r1 = r6.getTargetState();
        int $changed3 = ($changed$iv$iv >> 9) & 112;
        ToggleableState r2 = (ToggleableState) r1;
        $composer2.startReplaceGroup(-1798345588);
        ComposerKt.sourceInformation($composer2, "C:Checkbox.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L58;
        ComposerKt.traceEventStart(-1798345588, $changed3, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:270)");
    L58:
        switch(WhenMappings.$EnumSwitchMapping$0[r2.ordinal()]) {
            case 1: goto L63;
            case 2: goto L62;
            case 3: goto L61;
            default: goto L60;
        };
    L61:
        float r3 = 1.0f;
    L65:
        if (ComposerKt.isTraceInProgress() == false) goto L67;
        ComposerKt.traceEventEnd();
    L67:
        $composer2.endReplaceGroup();
        Object targetValue$iv$iv = Float.valueOf(r3);
        final State checkDrawFraction$delegate = TransitionKt.createTransitionAnimation(transition, initialValue$iv$iv, targetValue$iv$iv, transitionSpec$iv.invoke(r6.getSegment(), $composer2, Integer.valueOf(($changed$iv$iv >> 3) & 112)), r19, "FloatAnimation", $composer2, (($changed$iv$iv & 14) | (($changed$iv$iv << 9) & 57344)) | (($changed$iv$iv << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Function3 transitionSpec$iv2 = CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1338768149, "CC(animateFloat)P(2)1968@80576L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> r11 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int $changed$iv$iv2 = (((0 & 14) | ((0 << 3) & 896)) | ((0 << 3) & 7168)) | ((0 << 3) & 57344);
        ComposerKt.sourceInformationMarkerStart($composer2, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
        int $changed4 = ($changed$iv$iv2 >> 9) & 112;
        ToggleableState r12 = (ToggleableState) transition.getCurrentState();
        $composer2.startReplaceGroup(-2098942571);
        ComposerKt.sourceInformation($composer2, "C:Checkbox.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L70;
        int r13 = -1;
        ComposerKt.traceEventStart(-2098942571, $changed4, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:287)");
    L72:
        switch(WhenMappings.$EnumSwitchMapping$0[r12.ordinal()]) {
            case 1: goto L77;
            case 2: goto L76;
            case 3: goto L75;
            default: goto L74;
        };
    L75:
        float r5 = 1.0f;
    L79:
        if (ComposerKt.isTraceInProgress() == false) goto L81;
        ComposerKt.traceEventEnd();
    L81:
        $composer2.endReplaceGroup();
        Object initialValue$iv$iv2 = Float.valueOf(r5);
        int $changed5 = ($changed$iv$iv2 >> 9) & 112;
        ToggleableState it2 = (ToggleableState) r5.getTargetState();
        $composer2.startReplaceGroup(-2098942571);
        ComposerKt.sourceInformation($composer2, "C:Checkbox.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L85;
        ComposerKt.traceEventStart(-2098942571, $changed5, r13, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:287)");
    L85:
        switch(WhenMappings.$EnumSwitchMapping$0[it2.ordinal()]) {
            case 1: goto L90;
            case 2: goto L89;
            case 3: goto L88;
            default: goto L87;
        };
    L88:
        float r29 = 1.0f;
    L92:
        if (ComposerKt.isTraceInProgress() == false) goto L94;
        ComposerKt.traceEventEnd();
    L94:
        $composer2.endReplaceGroup();
        Object targetValue$iv$iv2 = Float.valueOf(r29);
        final State checkCenterGravitationShiftFraction$delegate = TransitionKt.createTransitionAnimation(transition, initialValue$iv$iv2, targetValue$iv$iv2, transitionSpec$iv2.invoke(r5.getSegment(), $composer2, Integer.valueOf(($changed$iv$iv2 >> 3) & 112)), r11, "FloatAnimation", $composer2, (($changed$iv$iv2 & 14) | (($changed$iv$iv2 << 9) & 57344)) | (($changed$iv$iv2 << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 382275657, "CC(remember):Checkbox.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L98;
        Object value$iv = new CheckDrawingCache(null, null, null, 7, null);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L98:
        final CheckDrawingCache checkCache = (CheckDrawingCache) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final State<Color> r14 = colors.checkmarkColor(value, $composer2, (($dirty2 >> 3) & 14) | (($dirty2 >> 6) & 112));
        final State<Color> r15 = colors.boxColor(enabled, value, $composer2, (($dirty2 & 14) | ($dirty2 & 112)) | (($dirty2 >> 3) & 896));
        final State<Color> r16 = colors.borderColor(enabled, value, $composer2, (($dirty2 & 14) | ($dirty2 & 112)) | (($dirty2 >> 3) & 896));
        Modifier r17 = SizeKt.m764requiredSize3ABfNKs(SizeKt.wrapContentSize$default(modifier, Alignment.Companion.getCenter(), false, 2, null), CheckboxSize);
        ComposerKt.sourceInformationMarkerStart($composer2, 382284965, "CC(remember):Checkbox.kt#9igjgp");
        boolean invalid$iv = ((($composer2.changed(r15) | $composer2.changed(r16)) | $composer2.changed(r14)) | $composer2.changed(checkDrawFraction$delegate)) | $composer2.changed(checkCenterGravitationShiftFraction$delegate);
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv == true) goto L105;
        if (it$iv2 == Composer.Companion.getEmpty()) goto L105;
    L106:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CanvasKt.Canvas(r17, (Function1) it$iv2, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L110;
        ComposerKt.traceEventEnd();
    L105:
        Object value$iv2 = (Function1) new CheckboxKt$CheckboxImpl$1$1(checkCache, r15, r16, r14, checkDrawFraction$delegate, checkCenterGravitationShiftFraction$delegate);
        $composer2.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
        goto L106
    L89:
        r29 = 0.0f;
        goto L92
    L90:
        r29 = 0.0f;
        goto L92
    L87:
        throw new NoWhenBranchMatchedException();
    L76:
        r5 = 0.0f;
        goto L79
    L77:
        r5 = 0.0f;
        goto L79
    L74:
        throw new NoWhenBranchMatchedException();
    L70:
        r13 = -1;
        goto L72
    L62:
        r3 = 0.0f;
        goto L65
    L63:
        r3 = 1.0f;
        goto L65
    L60:
        throw new NoWhenBranchMatchedException();
    L48:
        r0 = 0.0f;
        goto L51
    L49:
        r0 = 1.0f;
        goto L51
    L46:
        throw new NoWhenBranchMatchedException();
    L33:
        r6 = false;
        goto L35
    L26:
        if ($composer2.changed(colors) == false) goto L28;
        int r18 = 2048;
    L29:
        $dirty = $dirty | r18;
        goto L30
    L28:
        r18 = 1024;
        goto L29
    }

    private static final float CheckboxImpl$lambda$2(State<Float> r4) {
        return r4.getValue().floatValue();
    }

    private static final float CheckboxImpl$lambda$4(State<Float> r4) {
        return r4.getValue().floatValue();
    }

    private static final long CheckboxImpl$lambda$6(State<Color> r4) {
        Object thisObj$iv = r4.getValue();
        return ((Color) thisObj$iv).m4376unboximpl();
    }

    private static final long CheckboxImpl$lambda$7(State<Color> r4) {
        Object thisObj$iv = r4.getValue();
        return ((Color) thisObj$iv).m4376unboximpl();
    }

    private static final long CheckboxImpl$lambda$8(State<Color> r4) {
        Object thisObj$iv = r4.getValue();
        return ((Color) thisObj$iv).m4376unboximpl();
    }

    /* JADX INFO: renamed from: drawBox-1wkBAMs, reason: not valid java name */
    private static final void m1579drawBox1wkBAMs(DrawScope $this$drawBox_u2d1wkBAMs, long boxColor, long borderColor, float radius, float strokeWidth) {
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
    private static final void m1580drawCheck3IgeMak(DrawScope $this$drawCheck_u2d3IgeMak, long checkColor, float checkFraction, float crossCenterGravitation, float strokeWidthPx, CheckDrawingCache drawingCache) {
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
        CheckboxRippleRadius = Dp.m6973constructorimpl(24);
        CheckboxDefaultPadding = Dp.m6973constructorimpl(2);
        CheckboxSize = Dp.m6973constructorimpl(20);
        StrokeWidth = Dp.m6973constructorimpl(2);
        RadiusSize = Dp.m6973constructorimpl(2);
    }
}
