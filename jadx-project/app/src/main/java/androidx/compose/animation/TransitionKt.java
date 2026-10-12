package androidx.compose.animation;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a:\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aD\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0082\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2*\b\n\u0010\u0010\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\n\u001a\u00020\u000b2&\u0010\u0016\u001a\"\u0012\u0013\u0012\u0011H\u000e¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00020\u0011¢\u0006\u0002\b\u0014H\u0087\b¢\u0006\u0002\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"animateColor", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/InfiniteTransition;", "initialValue", "targetValue", "animationSpec", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "animateColor-RIQooxk", "(Landroidx/compose/animation/core/InfiniteTransition;JJLandroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "label", "", "animateColor-DTcfvLk", "(Landroidx/compose/animation/core/InfiniteTransition;JJLandroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "S", "Landroidx/compose/animation/core/Transition;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "targetValueByState", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "state", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TransitionKt {
    public static final <S> State<Color> animateColor(Transition<S> r19, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Color>> r20, String label, Function3<? super S, ? super Composer, ? super Integer, Color> r22, Composer $composer, int $changed, int r25) {
        ComposerKt.sourceInformationMarkerStart($composer, -1939694975, "CC(animateColor)P(2)67@3229L31,68@3296L58,70@3367L70:Transition.kt#xbi5r1");
        if ((r25 & 1) == 0) goto L5;
        Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Color>> r10 = AnonymousClass1.INSTANCE;
    L7:
        if ((r25 & 2) == 0) goto L9;
        String label2 = "ColorAnimation";
    L10:
        ColorSpace colorSpace = Color.m4370getColorSpaceimpl(r22.invoke(r19.getTargetState(), $composer, Integer.valueOf(($changed >> 6) & 112)).m4376unboximpl());
        ComposerKt.sourceInformationMarkerStart($composer, 1918408359, "CC(remember):Transition.kt#9igjgp");
        boolean invalid$iv = $composer.changed(colorSpace);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L13;
    L16:
        Object value$iv = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpace);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L17:
        TwoWayConverter typeConverter = (TwoWayConverter) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        int $changed$iv = ((($changed & 14) | (($changed << 3) & 896)) | (($changed << 3) & 7168)) | (($changed << 3) & 57344);
        String label$iv = label2;
        ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
        Object initialValue$iv = r22.invoke(r19.getCurrentState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        Object targetValue$iv = r22.invoke(r19.getTargetState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        State<Color> r8 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r19, initialValue$iv, targetValue$iv, r10.invoke(r19.getSegment(), $composer, Integer.valueOf(($changed$iv >> 3) & 112)), typeConverter, label$iv, $composer, (($changed$iv & 14) | (($changed$iv << 9) & 57344)) | (($changed$iv << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r8;
    L13:
        if (it$iv != Composer.Companion.getEmpty()) goto L17;
    L9:
        label2 = label;
        goto L10
    L5:
        r10 = r20;
        goto L7
    }

    /* JADX INFO: renamed from: animateColor-DTcfvLk, reason: not valid java name */
    public static final State<Color> m122animateColorDTcfvLk(InfiniteTransition $this$animateColor_u2dDTcfvLk, long initialValue, long targetValue, InfiniteRepeatableSpec<Color> r16, String label, Composer $composer, int $changed, int r20) {
        ComposerKt.sourceInformationMarkerStart($composer, 1901963533, "C(animateColor)P(1:c#ui.graphics.Color,3:c#ui.graphics.Color)98@4597L60,99@4669L72:Transition.kt#xbi5r1");
        if ((r20 & 8) == 0) goto L5;
        String label2 = "ColorAnimation";
    L7:
        if (ComposerKt.isTraceInProgress() == false) goto L9;
        ComposerKt.traceEventStart(1901963533, $changed, -1, "androidx.compose.animation.animateColor (Transition.kt:97)");
    L9:
        ComposerKt.sourceInformationMarkerStart($composer, 1918449993, "CC(remember):Transition.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L13;
        Object value$iv = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m4370getColorSpaceimpl(targetValue));
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L13:
        TwoWayConverter converter = (TwoWayConverter) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        State<Color> r1 = InfiniteTransitionKt.animateValue($this$animateColor_u2dDTcfvLk, Color.m4356boximpl(initialValue), Color.m4356boximpl(targetValue), converter, r16, label2, $composer, (((((InfiniteTransition.$stable | ($changed & 14)) | ($changed & 112)) | ($changed & 896)) | (InfiniteRepeatableSpec.$stable << 12)) | (($changed << 3) & 57344)) | (458752 & ($changed << 3)), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L5:
        label2 = label;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animateColor APIs now have a new label parameter added.")
    /* JADX INFO: renamed from: animateColor-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ State m123animateColorRIQooxk(InfiniteTransition $this$animateColor_u2dRIQooxk, long initialValue, long targetValue, InfiniteRepeatableSpec animationSpec, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1400583834, "C(animateColor)P(1:c#ui.graphics.Color,2:c#ui.graphics.Color)112@5040L163:Transition.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1400583834, $changed, -1, "androidx.compose.animation.animateColor (Transition.kt:112)");
    L5:
        State<Color> r1 = m122animateColorDTcfvLk($this$animateColor_u2dRIQooxk, initialValue, targetValue, animationSpec, "ColorAnimation", $composer, (((((InfiniteTransition.$stable | 24576) | ($changed & 14)) | ($changed & 112)) | ($changed & 896)) | (InfiniteRepeatableSpec.$stable << 9)) | ($changed & 7168), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    }
}
