package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: SingleValueAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a$\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aH\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aR\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"colorDefaultSpring", "Landroidx/compose/animation/core/SpringSpec;", "Landroidx/compose/ui/graphics/Color;", "Animatable", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector4D;", "initialValue", "Animatable-8_81llA", "(J)Landroidx/compose/animation/core/Animatable;", "animateColorAsState", "Landroidx/compose/runtime/State;", "targetValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "finishedListener", "Lkotlin/Function1;", "", "animateColorAsState-KTwxG1Y", "(JLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "label", "", "animateColorAsState-euL9pac", "(JLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SingleValueAnimationKt {
    private static final SpringSpec<Color> colorDefaultSpring = null;

    /* JADX INFO: renamed from: animateColorAsState-euL9pac, reason: not valid java name */
    public static final State<Color> m112animateColorAsStateeuL9pac(long targetValue, AnimationSpec<Color> r14, String label, Function1<? super Color, Unit> r16, Composer $composer, int $changed, int r19) {
        ComposerKt.sourceInformationMarkerStart($composer, -451899108, "C(animateColorAsState)P(3:c#ui.graphics.Color!1,2)62@2840L84,63@2936L156:SingleValueAnimation.kt#xbi5r1");
        if ((r19 & 2) == 0) goto L5;
        AnimationSpec animationSpec = colorDefaultSpring;
        AnimationSpec<Color> r2 = animationSpec;
    L7:
        if ((r19 & 4) == 0) goto L9;
        String label2 = "ColorAnimation";
    L11:
        if ((r19 & 8) == 0) goto L13;
        Function1<? super Color, Unit> r5 = null;
    L15:
        if (ComposerKt.isTraceInProgress() == false) goto L17;
        ComposerKt.traceEventStart(-451899108, $changed, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:60)");
    L17:
        ColorSpace r15 = Color.m4370getColorSpaceimpl(targetValue);
        ComposerKt.sourceInformationMarkerStart($composer, -1018619930, "CC(remember):SingleValueAnimation.kt#9igjgp");
        boolean invalid$iv = $composer.changed(r15);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L20;
    L23:
        Object value$iv = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m4370getColorSpaceimpl(targetValue));
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L24:
        TwoWayConverter converter = (TwoWayConverter) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        State<Color> r17 = AnimateAsStateKt.animateValueAsState(Color.m4356boximpl(targetValue), converter, r2, null, label2, r5, $composer, ((($changed & 14) | (($changed << 3) & 896)) | (($changed << 6) & 57344)) | (458752 & ($changed << 6)), 8);
        if (ComposerKt.isTraceInProgress() == false) goto L27;
        ComposerKt.traceEventEnd();
    L27:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r17;
    L20:
        if (it$iv != Composer.Companion.getEmpty()) goto L24;
    L13:
        r5 = r16;
        goto L15
    L9:
        label2 = label;
        goto L11
    L5:
        r2 = r14;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* JADX INFO: renamed from: animateColorAsState-KTwxG1Y, reason: not valid java name */
    public static final /* synthetic */ State m111animateColorAsStateKTwxG1Y(long targetValue, AnimationSpec animationSpec, Function1 finishedListener, Composer $composer, int $changed, int r15) {
        ComposerKt.sourceInformationMarkerStart($composer, -1942442407, "C(animateColorAsState)P(2:c#ui.graphics.Color)82@3420L84:SingleValueAnimation.kt#xbi5r1");
        if ((r15 & 2) == 0) goto L5;
        AnimationSpec animationSpec2 = colorDefaultSpring;
        AnimationSpec animationSpec3 = animationSpec2;
    L7:
        if ((r15 & 4) == 0) goto L9;
        Function1 finishedListener2 = null;
    L11:
        if (ComposerKt.isTraceInProgress() == false) goto L13;
        ComposerKt.traceEventStart(-1942442407, $changed, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:81)");
    L13:
        State<Color> r9 = m112animateColorAsStateeuL9pac(targetValue, animationSpec3, null, finishedListener2, $composer, (($changed & 14) | ($changed & 112)) | (($changed << 3) & 7168), 4);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r9;
    L9:
        finishedListener2 = finishedListener;
        goto L11
    L5:
        animationSpec3 = animationSpec;
        goto L7
    }

    static {
        colorDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
    }

    /* JADX INFO: renamed from: Animatable-8_81llA, reason: not valid java name */
    public static final Animatable<Color, AnimationVector4D> m110Animatable8_81llA(long initialValue) {
        return new Animatable(Color.m4356boximpl(initialValue), ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m4370getColorSpaceimpl(initialValue)), null, null, 12, null);
    }
}
