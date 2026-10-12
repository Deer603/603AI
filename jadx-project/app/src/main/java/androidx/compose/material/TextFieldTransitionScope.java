package androidx.compose.material;

import androidx.autofill.HintConstants;
import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J²\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\f2\u0006\u0010\r\u001a\u00020\u000e2e\u0010\u000f\u001aa\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0002\b\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a²\u0006\n\u0010\u0014\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\bX\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\bX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/TextFieldTransitionScope;", "", "()V", "Transition", "", "inputState", "Landroidx/compose/material/InputPhase;", "focusedTextStyleColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextStyleColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "showLabel", "", "content", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "Transition-DTcfvLk", "(Landroidx/compose/material/InputPhase;JJLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function6;Landroidx/compose/runtime/Composer;I)V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class TextFieldTransitionScope {
    public static final TextFieldTransitionScope INSTANCE = null;

    /* JADX INFO: compiled from: TextFieldImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[InputPhase.values().length];
            r0[InputPhase.Focused.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L14:
            r0[InputPhase.UnfocusedEmpty.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L16:
            r0[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L12:
            $EnumSwitchMapping$0 = r0;
        }
    }

    static {
        INSTANCE = new TextFieldTransitionScope();
    }

    private TextFieldTransitionScope() {
    }

    /* JADX INFO: renamed from: Transition-DTcfvLk, reason: not valid java name */
    public final void m1841TransitionDTcfvLk(final InputPhase inputState, final long focusedTextStyleColor, final long unfocusedTextStyleColor, final Function3<? super InputPhase, ? super Composer, ? super Integer, Color> r42, final boolean showLabel, final Function6<? super Float, ? super Color, ? super Color, ? super Float, ? super Composer, ? super Integer, Unit> r44, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1988729962);
        ComposerKt.sourceInformation($composer2, "C(Transition)P(3,2:c#ui.graphics.Color,5:c#ui.graphics.Color,1,4)287@11604L59,290@11717L361,302@12137L1234,332@13431L331,343@13820L202,349@14032L82:TextFieldImpl.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(inputState) == false) goto L7;
        int r4 = 4;
    L8:
        $dirty = $dirty | r4;
        goto L10
    L7:
        r4 = 2;
    L10:
        if (($changed & 48) != 0) goto L18;
        if ($composer2.changed(focusedTextStyleColor) == false) goto L14;
        int r6 = 32;
    L15:
        $dirty = $dirty | r6;
        goto L18
    L14:
        r6 = 16;
    L18:
        if (($changed & 384) != 0) goto L26;
        if ($composer2.changed(unfocusedTextStyleColor) == false) goto L22;
        int r7 = 256;
    L23:
        $dirty = $dirty | r7;
        goto L26
    L22:
        r7 = 128;
    L26:
        if (($changed & 3072) != 0) goto L33;
        if ($composer2.changedInstance(r42) == false) goto L30;
        int r8 = 2048;
    L31:
        $dirty = $dirty | r8;
        goto L33
    L30:
        r8 = 1024;
    L33:
        if (($changed & 24576) != 0) goto L40;
        if ($composer2.changed(showLabel) == false) goto L37;
        int r9 = 16384;
    L38:
        $dirty = $dirty | r9;
        goto L40
    L37:
        r9 = 8192;
    L40:
        if ((196608 & $changed) != 0) goto L46;
        Function6<? super Float, ? super Color, ? super Color, ? super Float, ? super Composer, ? super Integer, Unit> r10 = r44;
        if ($composer2.changedInstance(r10) == false) goto L44;
        int r11 = 131072;
    L45:
        $dirty = $dirty | r11;
    L48:
        if ((74899 & $dirty) == 74898) goto L50;
        boolean r12 = true;
    L52:
        if ($composer2.shouldExecute(r12, $dirty & 1) == true) goto L54;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L168:
        ScopeUpdateScope r13 = $composer3.endRestartGroup();
        if (r13 == null) goto L172;
        r13.updateScope(new TextFieldTransitionScope$Transition$1(this, inputState, focusedTextStyleColor, unfocusedTextStyleColor, r42, showLabel, r44, $changed));
        return;
    L172:
        return;
    L54:
        if (ComposerKt.isTraceInProgress() == false) goto L56;
        ComposerKt.traceEventStart(1988729962, $dirty, -1, "androidx.compose.material.TextFieldTransitionScope.Transition (TextFieldImpl.kt:283)");
    L56:
        Transition transition = TransitionKt.updateTransition(inputState, "TextFieldInputState", $composer2, ($dirty & 14) | 48, 0);
        Function3 transitionSpec$iv = TextFieldTransitionScope$Transition$labelProgress$2.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1338768149, "CC(animateFloat)P(2)1968@80576L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> r15 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int r14 = (384 << 3) & 896;
        int $changed$iv$iv = ((r14 | (384 & 14)) | ((384 << 3) & 7168)) | ((384 << 3) & 57344);
        ComposerKt.sourceInformationMarkerStart($composer2, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
        int $changed2 = ($changed$iv$iv >> 9) & 112;
        InputPhase it = (InputPhase) transition.getCurrentState();
        $composer2.startReplaceGroup(-1158004136);
        ComposerKt.sourceInformation($composer2, "C:TextFieldImpl.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L61;
        ComposerKt.traceEventStart(-1158004136, $changed2, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:294)");
    L61:
        switch(WhenMappings.$EnumSwitchMapping$0[it.ordinal()]) {
            case 1: goto L66;
            case 2: goto L65;
            case 3: goto L64;
            default: goto L63;
        };
    L64:
        float r2 = 1.0f;
    L68:
        if (ComposerKt.isTraceInProgress() == false) goto L70;
        ComposerKt.traceEventEnd();
    L70:
        $composer2.endReplaceGroup();
        Object initialValue$iv$iv = Float.valueOf(r2);
        int $changed3 = ($changed$iv$iv >> 9) & 112;
        InputPhase r3 = (InputPhase) transition.getTargetState();
        $composer2.startReplaceGroup(-1158004136);
        ComposerKt.sourceInformation($composer2, "C:TextFieldImpl.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L73;
        byte r5 = -1;
        ComposerKt.traceEventStart(-1158004136, $changed3, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:294)");
    L75:
        switch(WhenMappings.$EnumSwitchMapping$0[r3.ordinal()]) {
            case 1: goto L80;
            case 2: goto L79;
            case 3: goto L78;
            default: goto L77;
        };
    L78:
        float r16 = 1.0f;
    L82:
        if (ComposerKt.isTraceInProgress() == false) goto L84;
        ComposerKt.traceEventEnd();
    L84:
        $composer2.endReplaceGroup();
        Object targetValue$iv$iv = Float.valueOf(r16);
        State r18 = TransitionKt.createTransitionAnimation(transition, initialValue$iv$iv, targetValue$iv$iv, transitionSpec$iv.invoke(transition.getSegment(), $composer2, Integer.valueOf(($changed$iv$iv >> 3) & 112)), r15, "LabelProgress", $composer2, (($changed$iv$iv & 14) | (($changed$iv$iv << 9) & 57344)) | (($changed$iv$iv << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Function3 transitionSpec$iv2 = TextFieldTransitionScope$Transition$placeholderOpacity$2.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1338768149, "CC(animateFloat)P(2)1968@80576L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> r17 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int $changed$iv$iv2 = (((384 & 14) | ((384 << 3) & 896)) | ((384 << 3) & 7168)) | ((384 << 3) & 57344);
        ComposerKt.sourceInformationMarkerStart($composer2, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
        int $changed4 = ($changed$iv$iv2 >> 9) & 112;
        InputPhase it2 = (InputPhase) transition.getCurrentState();
        $composer2.startReplaceGroup(-1376159017);
        ComposerKt.sourceInformation($composer2, "C:TextFieldImpl.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L89;
        ComposerKt.traceEventStart(-1376159017, $changed4, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:324)");
    L89:
        switch(WhenMappings.$EnumSwitchMapping$0[it2.ordinal()]) {
            case 1: goto L96;
            case 2: goto L93;
            case 3: goto L92;
            default: goto L91;
        };
    L92:
        float r19 = 0.0f;
    L98:
        if (ComposerKt.isTraceInProgress() == false) goto L100;
        ComposerKt.traceEventEnd();
    L100:
        $composer2.endReplaceGroup();
        Object initialValue$iv$iv2 = Float.valueOf(r19);
        int $changed5 = ($changed$iv$iv2 >> 9) & 112;
        InputPhase r20 = (InputPhase) transition.getTargetState();
        $composer2.startReplaceGroup(-1376159017);
        ComposerKt.sourceInformation($composer2, "C:TextFieldImpl.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L105;
        ComposerKt.traceEventStart(-1376159017, $changed5, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:324)");
    L105:
        switch(WhenMappings.$EnumSwitchMapping$0[r20.ordinal()]) {
            case 1: goto L112;
            case 2: goto L109;
            case 3: goto L108;
            default: goto L107;
        };
    L108:
        float r21 = 0.0f;
    L114:
        if (ComposerKt.isTraceInProgress() == false) goto L116;
        ComposerKt.traceEventEnd();
    L116:
        $composer2.endReplaceGroup();
        Object targetValue$iv$iv2 = Float.valueOf(r21);
        State r22 = TransitionKt.createTransitionAnimation(transition, initialValue$iv$iv2, targetValue$iv$iv2, transitionSpec$iv2.invoke(transition.getSegment(), $composer2, Integer.valueOf(($changed$iv$iv2 >> 3) & 112)), r17, "PlaceholderOpacity", $composer2, (($changed$iv$iv2 & 14) | (($changed$iv$iv2 << 9) & 57344)) | (($changed$iv$iv2 << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Function3 transitionSpec$iv3 = TextFieldTransitionScope$Transition$labelTextStyleColor$2.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
        int $changed6 = (384 >> 6) & 112;
        InputPhase it3 = (InputPhase) transition.getTargetState();
        $composer2.startReplaceGroup(-1490209928);
        ComposerKt.sourceInformation($composer2, "C:TextFieldImpl.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L121;
        ComposerKt.traceEventStart(-1490209928, $changed6, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:336)");
    L121:
        if (WhenMappings.$EnumSwitchMapping$0[it3.ordinal()] != 1) goto L123;
        long r24 = focusedTextStyleColor;
    L125:
        if (ComposerKt.isTraceInProgress() == false) goto L127;
        ComposerKt.traceEventEnd();
    L127:
        $composer2.endReplaceGroup();
        ColorSpace colorSpace$iv = Color.m4370getColorSpaceimpl(r24);
        ComposerKt.sourceInformationMarkerStart($composer2, 1918408083, "CC(remember):Transition.kt#9igjgp");
        boolean invalid$iv$iv = $composer2.changed(colorSpace$iv);
        Object it$iv$iv = $composer2.rememberedValue();
        if (invalid$iv$iv == true) goto L134;
        if (it$iv$iv == Composer.Companion.getEmpty()) goto L134;
        Object value$iv$iv = it$iv$iv;
    L135:
        TwoWayConverter typeConverter$iv = (TwoWayConverter) value$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        int $changed$iv$iv3 = (((384 & 14) | ((384 << 3) & 896)) | ((384 << 3) & 7168)) | ((384 << 3) & 57344);
        ComposerKt.sourceInformationMarkerStart($composer2, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
        int $changed7 = ($changed$iv$iv3 >> 9) & 112;
        InputPhase it4 = (InputPhase) transition.getCurrentState();
        $composer2.startReplaceGroup(-1490209928);
        ComposerKt.sourceInformation($composer2, "C:TextFieldImpl.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L140;
        ComposerKt.traceEventStart(-1490209928, $changed7, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:336)");
    L140:
        if (WhenMappings.$EnumSwitchMapping$0[it4.ordinal()] != 1) goto L142;
        long r33 = focusedTextStyleColor;
    L144:
        if (ComposerKt.isTraceInProgress() == false) goto L146;
        ComposerKt.traceEventEnd();
    L146:
        $composer2.endReplaceGroup();
        Object initialValue$iv$iv3 = Color.m4356boximpl(r33);
        int $changed8 = ($changed$iv$iv3 >> 9) & 112;
        InputPhase it5 = (InputPhase) transition.getTargetState();
        $composer2.startReplaceGroup(-1490209928);
        ComposerKt.sourceInformation($composer2, "C:TextFieldImpl.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress() == false) goto L150;
        ComposerKt.traceEventStart(-1490209928, $changed8, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:336)");
    L150:
        if (WhenMappings.$EnumSwitchMapping$0[it5.ordinal()] != 1) goto L152;
        long r34 = focusedTextStyleColor;
    L154:
        if (ComposerKt.isTraceInProgress() == false) goto L156;
        ComposerKt.traceEventEnd();
    L156:
        $composer2.endReplaceGroup();
        Object targetValue$iv$iv3 = Color.m4356boximpl(r34);
        State labelTextStyleColor$delegate = TransitionKt.createTransitionAnimation(transition, initialValue$iv$iv3, targetValue$iv$iv3, transitionSpec$iv3.invoke(transition.getSegment(), $composer2, Integer.valueOf(($changed$iv$iv3 >> 3) & 112)), typeConverter$iv, "LabelTextStyleColor", $composer2, (($changed$iv$iv3 & 14) | (($changed$iv$iv3 << 9) & 57344)) | (($changed$iv$iv3 << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Function3 transitionSpec$iv4 = TextFieldTransitionScope$Transition$labelContentColor$2.INSTANCE;
        int $changed$iv = ($dirty & 7168) | 384;
        ComposerKt.sourceInformationMarkerStart($composer2, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
        ColorSpace colorSpace$iv2 = Color.m4370getColorSpaceimpl(r42.invoke(transition.getTargetState(), $composer2, Integer.valueOf(($changed$iv >> 6) & 112)).m4376unboximpl());
        ComposerKt.sourceInformationMarkerStart($composer2, 1918408083, "CC(remember):Transition.kt#9igjgp");
        boolean invalid$iv$iv2 = $composer2.changed(colorSpace$iv2);
        Object it$iv$iv2 = $composer2.rememberedValue();
        if (invalid$iv$iv2 == true) goto L162;
        State labelTextStyleColor$delegate2 = labelTextStyleColor$delegate;
        if (it$iv$iv2 == Composer.Companion.getEmpty()) goto L163;
        Object value$iv$iv2 = it$iv$iv2;
    L164:
        TwoWayConverter typeConverter$iv2 = (TwoWayConverter) value$iv$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        int $changed$iv$iv4 = ((($changed$iv & 14) | (($changed$iv << 3) & 896)) | (($changed$iv << 3) & 7168)) | (($changed$iv << 3) & 57344);
        ComposerKt.sourceInformationMarkerStart($composer2, -142660079, "CC(animateValue)P(3,2)1885@77139L32,1886@77194L31,1887@77250L23,1889@77286L89:Transition.kt#pdpnli");
        Object initialValue$iv$iv4 = r42.invoke(transition.getCurrentState(), $composer2, Integer.valueOf(($changed$iv$iv4 >> 9) & 112));
        Object targetValue$iv$iv4 = r42.invoke(transition.getTargetState(), $composer2, Integer.valueOf(($changed$iv$iv4 >> 9) & 112));
        State labelContentColor$delegate = TransitionKt.createTransitionAnimation(transition, initialValue$iv$iv4, targetValue$iv$iv4, transitionSpec$iv4.invoke(transition.getSegment(), $composer2, Integer.valueOf(($changed$iv$iv4 >> 3) & 112)), typeConverter$iv2, "LabelContentColor", $composer2, (($changed$iv$iv4 & 14) | (($changed$iv$iv4 << 9) & 57344)) | (($changed$iv$iv4 << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Function6<? super Float, ? super Color, ? super Color, ? super Float, ? super Composer, ? super Integer, Unit> r110 = r10;
        r110.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(r18)), Color.m4356boximpl(Transition_DTcfvLk$lambda$5(labelTextStyleColor$delegate2)), Color.m4356boximpl(Transition_DTcfvLk$lambda$6(labelContentColor$delegate)), Float.valueOf(Transition_DTcfvLk$lambda$3(r22)), $composer2, Integer.valueOf(($dirty >> 3) & 57344));
        $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L168;
        ComposerKt.traceEventEnd();
    L163:
        value$iv$iv2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpace$iv2);
        $composer2.updateRememberedValue(value$iv$iv2);
        goto L164
    L162:
        labelTextStyleColor$delegate2 = labelTextStyleColor$delegate;
        goto L163
    L152:
        r34 = unfocusedTextStyleColor;
        goto L154
    L142:
        r33 = unfocusedTextStyleColor;
    L134:
        value$iv$iv = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpace$iv);
        $composer2.updateRememberedValue(value$iv$iv);
        goto L135
    L123:
        r24 = unfocusedTextStyleColor;
        goto L125
    L109:
        if (showLabel == false) goto L111;
        r21 = 0.0f;
        goto L114
    L111:
        r21 = 1.0f;
        goto L114
    L112:
        r21 = 1.0f;
        goto L114
    L107:
        throw new NoWhenBranchMatchedException();
    L93:
        if (showLabel == false) goto L95;
        r19 = 0.0f;
        goto L98
    L95:
        r19 = 1.0f;
        goto L98
    L96:
        r19 = 1.0f;
        goto L98
    L91:
        throw new NoWhenBranchMatchedException();
    L79:
        r16 = 0.0f;
        goto L82
    L80:
        r16 = 1.0f;
        goto L82
    L77:
        throw new NoWhenBranchMatchedException();
    L73:
        r5 = -1;
        goto L75
    L65:
        r2 = 0.0f;
        goto L68
    L66:
        r2 = 1.0f;
        goto L68
    L63:
        throw new NoWhenBranchMatchedException();
    L50:
        r12 = false;
        goto L52
    L44:
        r11 = 65536;
        goto L45
    L46:
        r10 = r44;
        goto L48
    }

    private static final float Transition_DTcfvLk$lambda$1(State<Float> r4) {
        return r4.getValue().floatValue();
    }

    private static final float Transition_DTcfvLk$lambda$3(State<Float> r4) {
        return r4.getValue().floatValue();
    }

    private static final long Transition_DTcfvLk$lambda$5(State<Color> r4) {
        return r4.getValue().m4376unboximpl();
    }

    private static final long Transition_DTcfvLk$lambda$6(State<Color> r4) {
        return r4.getValue().m4376unboximpl();
    }
}
