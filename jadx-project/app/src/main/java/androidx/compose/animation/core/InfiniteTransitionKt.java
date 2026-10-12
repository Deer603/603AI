package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: compiled from: InfiniteTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a5\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0007¢\u0006\u0002\u0010\r\u001a?\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u000e\u001aY\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0007\"\u0004\b\u0000\u0010\u0010\"\b\b\u0001\u0010\u0011*\u00020\u0012*\u00020\u00012\u0006\u0010\t\u001a\u0002H\u00102\u0006\u0010\n\u001a\u0002H\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u00110\u00142\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00100\fH\u0007¢\u0006\u0002\u0010\u0015\u001ac\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0007\"\u0004\b\u0000\u0010\u0010\"\b\b\u0001\u0010\u0011*\u00020\u0012*\u00020\u00012\u0006\u0010\t\u001a\u0002H\u00102\u0006\u0010\n\u001a\u0002H\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u00110\u00142\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00100\f2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"rememberInfiniteTransition", "Landroidx/compose/animation/core/InfiniteTransition;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/InfiniteTransition;", "label", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/InfiniteTransition;", "animateFloat", "Landroidx/compose/runtime/State;", "", "initialValue", "targetValue", "animationSpec", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateValue", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class InfiniteTransitionKt {
    public static final InfiniteTransition rememberInfiniteTransition(String label, Composer $composer, int $changed, int r9) {
        ComposerKt.sourceInformationMarkerStart($composer, 1013651573, "C(rememberInfiniteTransition)45@1988L38,46@2050L5:InfiniteTransition.kt#pdpnli");
        if ((r9 & 1) == 0) goto L6;
        label = "InfiniteTransition";
    L6:
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventStart(1013651573, $changed, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
    L8:
        ComposerKt.sourceInformationMarkerStart($composer, -1916602560, "CC(remember):InfiniteTransition.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L12;
        Object value$iv = new InfiniteTransition(label);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L12:
        InfiniteTransition infiniteTransition = (InfiniteTransition) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        infiniteTransition.run$animation_core_release($composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventEnd();
    L15:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return infiniteTransition;
    }

    public static final <T, V extends AnimationVector> State<T> animateValue(InfiniteTransition $this$animateValue, T r18, T r19, TwoWayConverter<T, V> r20, final InfiniteRepeatableSpec<T> r21, String label, Composer $composer, int $changed, int r25) {
        ComposerKt.sourceInformationMarkerStart($composer, -1062847727, "C(animateValue)P(1,3,4)246@10572L113,250@10702L363,250@10691L374,263@11109L108,263@11071L146:InfiniteTransition.kt#pdpnli");
        if ((r25 & 16) == 0) goto L5;
        String label2 = "ValueAnimation";
    L7:
        if (ComposerKt.isTraceInProgress() == false) goto L9;
        ComposerKt.traceEventStart(-1062847727, $changed, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:245)");
    L9:
        ComposerKt.sourceInformationMarkerStart($composer, 1444218917, "CC(remember):InfiniteTransition.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L12;
        final InfiniteTransition r1 = $this$animateValue;
        final Object r2 = r18;
        final Object r3 = r19;
        Object value$iv = new InfiniteTransition.TransitionAnimationState(r1, r2, r3, r20, r21, label2);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L13:
        final InfiniteTransition.TransitionAnimationState transitionAnimation = (InfiniteTransition.TransitionAnimationState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 1444223327, "CC(remember):InfiniteTransition.kt#9igjgp");
        boolean r11 = true;
        if ((($changed & 112) ^ 48) <= 32) goto L18;
        if ($composer.changedInstance(r2) == false) goto L18;
    L19:
        boolean r4 = true;
    L22:
        if ((($changed & 896) ^ 384) <= 256) goto L26;
        if ($composer.changedInstance(r3) == false) goto L26;
    L27:
        boolean r5 = true;
    L29:
        boolean r6 = r4 | r5;
        if (((57344 & $changed) ^ 24576) <= 16384) goto L34;
        if ($composer.changedInstance(r21) == false) goto L34;
    L37:
        boolean invalid$iv = r6 | r11;
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv == false) goto L40;
    L43:
        Object value$iv2 = (Function0) new InfiniteTransitionKt$animateValue$1$1(r2, transitionAnimation, r3, r21);
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L44:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.SideEffect((Function0) it$iv2, $composer, 0);
        ComposerKt.sourceInformationMarkerStart($composer, 1444236096, "CC(remember):InfiniteTransition.kt#9igjgp");
        boolean invalid$iv2 = $composer.changedInstance(r1);
        Object it$iv3 = $composer.rememberedValue();
        if (invalid$iv2 == false) goto L47;
    L50:
        Object value$iv3 = (Function1) new InfiniteTransitionKt$animateValue$2$1(r1, transitionAnimation);
        $composer.updateRememberedValue(value$iv3);
        it$iv3 = value$iv3;
    L51:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.DisposableEffect(transitionAnimation, (Function1) it$iv3, $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L54;
        ComposerKt.traceEventEnd();
    L54:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return transitionAnimation;
    L47:
        if (it$iv3 != Composer.Companion.getEmpty()) goto L51;
    L40:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L44;
    L34:
        if (($changed & 24576) == 16384) goto L37;
        r11 = false;
    L26:
        if (($changed & 384) == 256) goto L27;
        r5 = false;
    L18:
        if (($changed & 48) == 32) goto L19;
        r4 = false;
        goto L22
    L12:
        r1 = $this$animateValue;
        r2 = r18;
        r3 = r19;
        goto L13
    L5:
        label2 = label;
        goto L7
    }

    public static final State<Float> animateFloat(InfiniteTransition $this$animateFloat, float initialValue, float targetValue, InfiniteRepeatableSpec<Float> r15, String label, Composer $composer, int $changed, int r19) {
        ComposerKt.sourceInformationMarkerStart($composer, -644770905, "C(animateFloat)P(1,3)296@12380L84:InfiniteTransition.kt#pdpnli");
        if ((r19 & 8) == 0) goto L5;
        String label2 = "FloatAnimation";
    L7:
        if (ComposerKt.isTraceInProgress() == false) goto L9;
        ComposerKt.traceEventStart(-644770905, $changed, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:296)");
    L9:
        State<Float> r1 = animateValue($this$animateFloat, Float.valueOf(initialValue), Float.valueOf(targetValue), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), r15, label2, $composer, (((($changed & 14) | ($changed & 112)) | ($changed & 896)) | (($changed << 3) & 57344)) | (458752 & ($changed << 3)), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L12;
        ComposerKt.traceEventEnd();
    L12:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L5:
        label2 = label;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "rememberInfiniteTransition APIs now have a new label parameter added.")
    public static final /* synthetic */ InfiniteTransition rememberInfiniteTransition(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -840193660, "C(rememberInfiniteTransition)304@12679L48:InfiniteTransition.kt#pdpnli");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-840193660, $changed, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:303)");
    L5:
        InfiniteTransition r0 = rememberInfiniteTransition("InfiniteTransition", $composer, 6, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animateValue APIs now have a new label parameter added.")
    public static final /* synthetic */ State animateValue(InfiniteTransition $this$animateValue, Object initialValue, Object targetValue, TwoWayConverter typeConverter, InfiniteRepeatableSpec animationSpec, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1695411770, "C(animateValue)P(1,2,3)318@13080L202:InfiniteTransition.kt#pdpnli");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1695411770, $changed, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:317)");
    L5:
        State r1 = animateValue($this$animateValue, initialValue, targetValue, typeConverter, animationSpec, "ValueAnimation", $composer, ((((((($changed & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((($changed >> 3) & 8) << 3)) | ($changed & 112)) | ((($changed >> 3) & 8) << 6)) | ($changed & 896)) | ($changed & 7168)) | (57344 & $changed), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animateFloat APIs now have a new label parameter added.")
    public static final /* synthetic */ State animateFloat(InfiniteTransition $this$animateFloat, float initialValue, float targetValue, InfiniteRepeatableSpec animationSpec, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 469472752, "C(animateFloat)P(1,2)337@13583L163:InfiniteTransition.kt#pdpnli");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(469472752, $changed, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:336)");
    L5:
        State<Float> r10 = animateFloat($this$animateFloat, initialValue, targetValue, animationSpec, "FloatAnimation", $composer, (((($changed & 14) | 24576) | ($changed & 112)) | ($changed & 896)) | ($changed & 7168), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r10;
    }
}
