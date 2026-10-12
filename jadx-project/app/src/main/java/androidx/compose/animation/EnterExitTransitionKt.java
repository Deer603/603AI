package androidx.compose.animation;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001aQ\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122#\b\u0002\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00150\u0014H\u0007\u001aQ\u0010\u0019\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u001a2\b\b\u0002\u0010\u0011\u001a\u00020\u00122#\b\u0002\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00060\u0014H\u0007\u001aQ\u0010\u001d\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u001e2\b\b\u0002\u0010\u0011\u001a\u00020\u00122#\b\u0002\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00150\u0014H\u0007\u001a\"\u0010!\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\b\u0002\u0010\"\u001a\u00020\u0002H\u0007\u001a\"\u0010#\u001a\u00020$2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\b\u0002\u0010%\u001a\u00020\u0002H\u0007\u001a6\u0010&\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a6\u0010+\u001a\u00020$2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\b\u0002\u0010,\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001aQ\u0010/\u001a\u00020$2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\b\u0002\u00100\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122#\b\u0002\u00101\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00150\u0014H\u0007\u001aQ\u00102\u001a\u00020$2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\b\u0002\u00100\u001a\u00020\u001a2\b\b\u0002\u0010\u0011\u001a\u00020\u00122#\b\u0002\u00103\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00060\u0014H\u0007\u001aQ\u00104\u001a\u00020$2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\b\u0002\u00100\u001a\u00020\u001e2\b\b\u0002\u0010\u0011\u001a\u00020\u00122#\b\u0002\u00105\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00150\u0014H\u0007\u001a;\u00106\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2!\u00107\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00040\u0014H\u0007\u001a=\u00108\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2#\b\u0002\u00109\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00150\u0014H\u0007\u001a=\u0010:\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2#\b\u0002\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00150\u0014H\u0007\u001a;\u0010<\u001a\u00020$2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2!\u0010=\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00040\u0014H\u0007\u001a=\u0010>\u001a\u00020$2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2#\b\u0002\u0010?\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00150\u0014H\u0007\u001a=\u0010@\u001a\u00020$2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2#\b\u0002\u0010A\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00150\u0014H\u0007\u001a/\u0010B\u001a\u00020C*\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010F\u001a\u00020\f2\u0006\u0010G\u001a\u00020$2\u0006\u0010H\u001a\u00020IH\u0003¢\u0006\u0002\u0010J\u001a?\u0010K\u001a\u00020L*\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010F\u001a\u00020\f2\u0006\u0010G\u001a\u00020$2\u000e\b\u0002\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00120N2\u0006\u0010H\u001a\u00020IH\u0001¢\u0006\u0002\u0010O\u001a,\u0010P\u001a\u0004\u0018\u0001HQ\"\b\b\u0000\u0010Q*\u00020R*\u00020\f2\f\u0010S\u001a\b\u0012\u0004\u0012\u0002HQ0TH\u0080\u0002¢\u0006\u0002\u0010U\u001a,\u0010P\u001a\u0004\u0018\u0001HQ\"\b\b\u0000\u0010Q*\u00020R*\u00020$2\f\u0010S\u001a\b\u0012\u0004\u0012\u0002HQ0TH\u0080\u0002¢\u0006\u0002\u0010V\u001a\f\u0010W\u001a\u00020\u001a*\u00020\u0010H\u0002\u001a\f\u0010W\u001a\u00020\u001a*\u00020\u001eH\u0002\u001a\u001f\u0010X\u001a\u00020\f*\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010F\u001a\u00020\fH\u0001¢\u0006\u0002\u0010Y\u001a\u001f\u0010Z\u001a\u00020$*\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010G\u001a\u00020$H\u0001¢\u0006\u0002\u0010[\u001a\u0015\u0010\\\u001a\u00020\f*\u00020\f2\u0006\u0010]\u001a\u00020RH\u0080\u0004\u001a\u0015\u0010\\\u001a\u00020$*\u00020$2\u0006\u0010]\u001a\u00020RH\u0080\u0004\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006^²\u0006\n\u0010_\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010`\u001a\u00020$X\u008a\u008e\u0002"}, d2 = {"DefaultAlphaAndScaleSpring", "Landroidx/compose/animation/core/SpringSpec;", "", "DefaultOffsetAnimationSpec", "Landroidx/compose/ui/unit/IntOffset;", "DefaultSizeAnimationSpec", "Landroidx/compose/ui/unit/IntSize;", "TransformOriginVectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/graphics/TransformOrigin;", "Landroidx/compose/animation/core/AnimationVector2D;", "expandHorizontally", "Landroidx/compose/animation/EnterTransition;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "expandFrom", "Landroidx/compose/ui/Alignment$Horizontal;", "clip", "", "initialWidth", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "fullWidth", "expandIn", "Landroidx/compose/ui/Alignment;", "initialSize", "fullSize", "expandVertically", "Landroidx/compose/ui/Alignment$Vertical;", "initialHeight", "fullHeight", "fadeIn", "initialAlpha", "fadeOut", "Landroidx/compose/animation/ExitTransition;", "targetAlpha", "scaleIn", "initialScale", "transformOrigin", "scaleIn-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/EnterTransition;", "scaleOut", "targetScale", "scaleOut-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/ExitTransition;", "shrinkHorizontally", "shrinkTowards", "targetWidth", "shrinkOut", "targetSize", "shrinkVertically", "targetHeight", "slideIn", "initialOffset", "slideInHorizontally", "initialOffsetX", "slideInVertically", "initialOffsetY", "slideOut", "targetOffset", "slideOutHorizontally", "targetOffsetX", "slideOutVertically", "targetOffsetY", "createGraphicsLayerBlock", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "enter", "exit", "label", "", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "createModifier", "Landroidx/compose/ui/Modifier;", "isEnabled", "Lkotlin/Function0;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "get", "T", "Landroidx/compose/animation/TransitionEffect;", "key", "Landroidx/compose/animation/TransitionEffectKey;", "(Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/TransitionEffectKey;)Landroidx/compose/animation/TransitionEffect;", "(Landroidx/compose/animation/ExitTransition;Landroidx/compose/animation/TransitionEffectKey;)Landroidx/compose/animation/TransitionEffect;", "toAlignment", "trackActiveEnter", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterTransition;", "trackActiveExit", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/ExitTransition;", "withEffect", "effect", "animation_release", "activeEnter", "activeExit"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class EnterExitTransitionKt {
    private static final SpringSpec<Float> DefaultAlphaAndScaleSpring = null;
    private static final SpringSpec<IntOffset> DefaultOffsetAnimationSpec = null;
    private static final SpringSpec<IntSize> DefaultSizeAnimationSpec = null;
    private static final TwoWayConverter<TransformOrigin, AnimationVector2D> TransformOriginVectorConverter = null;

    public static final /* synthetic */ SpringSpec access$getDefaultAlphaAndScaleSpring$p() {
        return DefaultAlphaAndScaleSpring;
    }

    public static final /* synthetic */ SpringSpec access$getDefaultOffsetAnimationSpec$p() {
        return DefaultOffsetAnimationSpec;
    }

    public static final /* synthetic */ SpringSpec access$getDefaultSizeAnimationSpec$p() {
        return DefaultSizeAnimationSpec;
    }

    public static final EnterTransition withEffect(EnterTransition $this$withEffect, TransitionEffect effect) {
        Fade r2 = null;
        Slide r3 = null;
        ChangeSize r4 = null;
        Scale r5 = null;
        boolean r6 = false;
        return new EnterTransitionImpl(new TransitionData(r2, r3, r4, r5, r6, MapsKt.mapOf(TuplesKt.to(effect.getKey$animation_release(), effect)), 31, null));
    }

    public static final ExitTransition withEffect(ExitTransition $this$withEffect, TransitionEffect effect) {
        Fade r2 = null;
        Slide r3 = null;
        ChangeSize r4 = null;
        Scale r5 = null;
        boolean r6 = false;
        return new ExitTransitionImpl(new TransitionData(r2, r3, r4, r5, r6, MapsKt.mapOf(TuplesKt.to(effect.getKey$animation_release(), effect)), 31, null));
    }

    public static /* synthetic */ EnterTransition fadeIn$default(SpringSpec r2, float r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
    L6:
        if ((r4 & 2) == 0) goto L9;
        r3 = 0.0f;
    L9:
        return fadeIn(r2, r3);
    }

    public static final EnterTransition fadeIn(FiniteAnimationSpec<Float> r10, float initialAlpha) {
        Slide r3 = null;
        ChangeSize r4 = null;
        Scale r5 = null;
        boolean r6 = false;
        Map r7 = null;
        return new EnterTransitionImpl(new TransitionData(new Fade(initialAlpha, r10), r3, r4, r5, r6, r7, 62, null));
    }

    public static /* synthetic */ ExitTransition fadeOut$default(SpringSpec r2, float r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
    L6:
        if ((r4 & 2) == 0) goto L9;
        r3 = 0.0f;
    L9:
        return fadeOut(r2, r3);
    }

    public static final ExitTransition fadeOut(FiniteAnimationSpec<Float> r10, float targetAlpha) {
        Slide r3 = null;
        ChangeSize r4 = null;
        Scale r5 = null;
        boolean r6 = false;
        Map r7 = null;
        return new ExitTransitionImpl(new TransitionData(new Fade(targetAlpha, r10), r3, r4, r5, r6, r7, 62, null));
    }

    public static /* synthetic */ EnterTransition slideIn$default(SpringSpec r2, Function1 r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m7092boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
    L6:
        return slideIn(r2, r3);
    }

    public static final EnterTransition slideIn(FiniteAnimationSpec<IntOffset> r10, Function1<? super IntSize, IntOffset> r11) {
        Fade r2 = null;
        ChangeSize r4 = null;
        Scale r5 = null;
        boolean r6 = false;
        Map r7 = null;
        return new EnterTransitionImpl(new TransitionData(r2, new Slide(r11, r10), r4, r5, r6, r7, 61, null));
    }

    public static /* synthetic */ ExitTransition slideOut$default(SpringSpec r2, Function1 r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m7092boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
    L6:
        return slideOut(r2, r3);
    }

    public static final ExitTransition slideOut(FiniteAnimationSpec<IntOffset> r10, Function1<? super IntSize, IntOffset> r11) {
        Fade r2 = null;
        ChangeSize r4 = null;
        Scale r5 = null;
        boolean r6 = false;
        Map r7 = null;
        return new ExitTransitionImpl(new TransitionData(r2, new Slide(r11, r10), r4, r5, r6, r7, 61, null));
    }

    /* JADX INFO: renamed from: scaleIn-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ EnterTransition m76scaleInL8ZKhE$default(SpringSpec r2, float r3, long r4, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0.0f;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = TransformOrigin.Companion.m4757getCenterSzJe1aQ();
    L12:
        return m75scaleInL8ZKhE(r2, r3, r4);
    }

    /* JADX INFO: renamed from: scaleIn-L8ZKh-E, reason: not valid java name */
    public static final EnterTransition m75scaleInL8ZKhE(FiniteAnimationSpec<Float> r10, float initialScale, long transformOrigin) {
        Scale r2 = new Scale(initialScale, transformOrigin, r10, null);
        Fade r3 = null;
        Slide r4 = null;
        ChangeSize r5 = null;
        boolean r6 = false;
        return new EnterTransitionImpl(new TransitionData(r3, r4, r5, r2, r6, null, 55, null));
    }

    /* JADX INFO: renamed from: scaleOut-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ ExitTransition m78scaleOutL8ZKhE$default(SpringSpec r2, float r3, long r4, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0.0f;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = TransformOrigin.Companion.m4757getCenterSzJe1aQ();
    L12:
        return m77scaleOutL8ZKhE(r2, r3, r4);
    }

    /* JADX INFO: renamed from: scaleOut-L8ZKh-E, reason: not valid java name */
    public static final ExitTransition m77scaleOutL8ZKhE(FiniteAnimationSpec<Float> r10, float targetScale, long transformOrigin) {
        Scale r2 = new Scale(targetScale, transformOrigin, r10, null);
        Fade r3 = null;
        Slide r4 = null;
        ChangeSize r5 = null;
        boolean r6 = false;
        return new ExitTransitionImpl(new TransitionData(r3, r4, r5, r2, r6, null, 55, null));
    }

    public static /* synthetic */ EnterTransition expandIn$default(SpringSpec r3, Alignment r4, boolean r5, C01651 r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r3 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m7136boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
    L6:
        if ((r7 & 2) == 0) goto L9;
        r4 = Alignment.Companion.getBottomEnd();
    L9:
        if ((r7 & 4) == 0) goto L12;
        r5 = true;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r6 = C01651.INSTANCE;
    L15:
        return expandIn(r3, r4, r5, r6);
    }

    public static final EnterTransition expandIn(FiniteAnimationSpec<IntSize> r10, Alignment expandFrom, boolean clip, Function1<? super IntSize, IntSize> r13) {
        Fade r2 = null;
        Slide r3 = null;
        Scale r5 = null;
        boolean r6 = false;
        Map r7 = null;
        return new EnterTransitionImpl(new TransitionData(r2, r3, new ChangeSize(expandFrom, r13, r10, clip), r5, r6, r7, 59, null));
    }

    public static /* synthetic */ ExitTransition shrinkOut$default(SpringSpec r3, Alignment r4, boolean r5, C01701 r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r3 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m7136boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
    L6:
        if ((r7 & 2) == 0) goto L9;
        r4 = Alignment.Companion.getBottomEnd();
    L9:
        if ((r7 & 4) == 0) goto L12;
        r5 = true;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r6 = C01701.INSTANCE;
    L15:
        return shrinkOut(r3, r4, r5, r6);
    }

    public static final ExitTransition shrinkOut(FiniteAnimationSpec<IntSize> r10, Alignment shrinkTowards, boolean clip, Function1<? super IntSize, IntSize> r13) {
        Fade r2 = null;
        Slide r3 = null;
        Scale r5 = null;
        boolean r6 = false;
        Map r7 = null;
        return new ExitTransitionImpl(new TransitionData(r2, r3, new ChangeSize(shrinkTowards, r13, r10, clip), r5, r6, r7, 59, null));
    }

    public static /* synthetic */ EnterTransition expandHorizontally$default(SpringSpec r3, Alignment.Horizontal r4, boolean r5, C01641 r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r3 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m7136boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
    L6:
        if ((r7 & 2) == 0) goto L9;
        r4 = Alignment.Companion.getEnd();
    L9:
        if ((r7 & 4) == 0) goto L12;
        r5 = true;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r6 = C01641.INSTANCE;
    L15:
        return expandHorizontally(r3, r4, r5, r6);
    }

    public static final EnterTransition expandHorizontally(FiniteAnimationSpec<IntSize> r2, Alignment.Horizontal expandFrom, boolean clip, final Function1<? super Integer, Integer> r5) {
        return expandIn(r2, toAlignment(expandFrom), clip, new AnonymousClass2(r5));
    }

    public static /* synthetic */ EnterTransition expandVertically$default(SpringSpec r3, Alignment.Vertical r4, boolean r5, C01661 r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r3 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m7136boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
    L6:
        if ((r7 & 2) == 0) goto L9;
        r4 = Alignment.Companion.getBottom();
    L9:
        if ((r7 & 4) == 0) goto L12;
        r5 = true;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r6 = C01661.INSTANCE;
    L15:
        return expandVertically(r3, r4, r5, r6);
    }

    public static final EnterTransition expandVertically(FiniteAnimationSpec<IntSize> r2, Alignment.Vertical expandFrom, boolean clip, final Function1<? super Integer, Integer> r5) {
        return expandIn(r2, toAlignment(expandFrom), clip, new C01672(r5));
    }

    public static /* synthetic */ ExitTransition shrinkHorizontally$default(SpringSpec r3, Alignment.Horizontal r4, boolean r5, C01681 r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r3 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m7136boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
    L6:
        if ((r7 & 2) == 0) goto L9;
        r4 = Alignment.Companion.getEnd();
    L9:
        if ((r7 & 4) == 0) goto L12;
        r5 = true;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r6 = C01681.INSTANCE;
    L15:
        return shrinkHorizontally(r3, r4, r5, r6);
    }

    public static final ExitTransition shrinkHorizontally(FiniteAnimationSpec<IntSize> r2, Alignment.Horizontal shrinkTowards, boolean clip, final Function1<? super Integer, Integer> r5) {
        return shrinkOut(r2, toAlignment(shrinkTowards), clip, new C01692(r5));
    }

    public static /* synthetic */ ExitTransition shrinkVertically$default(SpringSpec r3, Alignment.Vertical r4, boolean r5, C01711 r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r3 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m7136boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
    L6:
        if ((r7 & 2) == 0) goto L9;
        r4 = Alignment.Companion.getBottom();
    L9:
        if ((r7 & 4) == 0) goto L12;
        r5 = true;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r6 = C01711.INSTANCE;
    L15:
        return shrinkVertically(r3, r4, r5, r6);
    }

    public static final ExitTransition shrinkVertically(FiniteAnimationSpec<IntSize> r2, Alignment.Vertical shrinkTowards, boolean clip, final Function1<? super Integer, Integer> r5) {
        return shrinkOut(r2, toAlignment(shrinkTowards), clip, new C01722(r5));
    }

    public static /* synthetic */ EnterTransition slideInHorizontally$default(SpringSpec r3, C01731 r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r3 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m7092boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
    L6:
        if ((r5 & 2) == 0) goto L9;
        r4 = C01731.INSTANCE;
    L9:
        return slideInHorizontally(r3, r4);
    }

    public static final EnterTransition slideInHorizontally(FiniteAnimationSpec<IntOffset> r1, final Function1<? super Integer, Integer> r2) {
        return slideIn(r1, new C01742(r2));
    }

    public static /* synthetic */ EnterTransition slideInVertically$default(SpringSpec r3, C01751 r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r3 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m7092boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
    L6:
        if ((r5 & 2) == 0) goto L9;
        r4 = C01751.INSTANCE;
    L9:
        return slideInVertically(r3, r4);
    }

    public static final EnterTransition slideInVertically(FiniteAnimationSpec<IntOffset> r1, final Function1<? super Integer, Integer> r2) {
        return slideIn(r1, new C01762(r2));
    }

    public static /* synthetic */ ExitTransition slideOutHorizontally$default(SpringSpec r3, C01771 r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r3 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m7092boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
    L6:
        if ((r5 & 2) == 0) goto L9;
        r4 = C01771.INSTANCE;
    L9:
        return slideOutHorizontally(r3, r4);
    }

    public static final ExitTransition slideOutHorizontally(FiniteAnimationSpec<IntOffset> r1, final Function1<? super Integer, Integer> r2) {
        return slideOut(r1, new C01782(r2));
    }

    public static /* synthetic */ ExitTransition slideOutVertically$default(SpringSpec r3, C01791 r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r3 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m7092boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
    L6:
        if ((r5 & 2) == 0) goto L9;
        r4 = C01791.INSTANCE;
    L9:
        return slideOutVertically(r3, r4);
    }

    public static final ExitTransition slideOutVertically(FiniteAnimationSpec<IntOffset> r1, final Function1<? super Integer, Integer> r2) {
        return slideOut(r1, new C01802(r2));
    }

    private static final Alignment toAlignment(Alignment.Horizontal $this$toAlignment) {
        if (Intrinsics.areEqual($this$toAlignment, Alignment.Companion.getStart()) == false) goto L6;
        return Alignment.Companion.getCenterStart();
    L6:
        if (Intrinsics.areEqual($this$toAlignment, Alignment.Companion.getEnd()) == false) goto L9;
        return Alignment.Companion.getCenterEnd();
    L9:
        return Alignment.Companion.getCenter();
    }

    private static final Alignment toAlignment(Alignment.Vertical $this$toAlignment) {
        if (Intrinsics.areEqual($this$toAlignment, Alignment.Companion.getTop()) == false) goto L6;
        return Alignment.Companion.getTopCenter();
    L6:
        if (Intrinsics.areEqual($this$toAlignment, Alignment.Companion.getBottom()) == false) goto L9;
        return Alignment.Companion.getBottomCenter();
    L9:
        return Alignment.Companion.getCenter();
    }

    public static final <T extends TransitionEffect> T get(EnterTransition $this$get, TransitionEffectKey<T> r3) {
        TransitionEffect r0 = $this$get.getData$animation_release().getEffectsMap().get(r3);
        if ((r0 instanceof TransitionEffect) == true) goto L7;
        return null;
    L7:
        return (T) r0;
    }

    public static final <T extends TransitionEffect> T get(ExitTransition $this$get, TransitionEffectKey<T> r3) {
        TransitionEffect r0 = $this$get.getData$animation_release().getEffectsMap().get(r3);
        if ((r0 instanceof TransitionEffect) == true) goto L7;
        return null;
    L7:
        return (T) r0;
    }

    public static final Modifier createModifier(Transition<EnterExitState> r22, EnterTransition enter, ExitTransition exit, Function0<Boolean> r25, String label, Composer $composer, int $changed, int r29) {
        ComposerKt.sourceInformationMarkerStart($composer, 28261782, "C(createModifier)861@38434L31,862@38487L28,891@39539L56,892@39630L38:EnterExitTransition.kt#xbi5r1");
        if ((r29 & 4) == 0) goto L5;
        final Function0<Boolean> r7 = AnonymousClass1.INSTANCE;
    L7:
        if (ComposerKt.isTraceInProgress() == false) goto L9;
        ComposerKt.traceEventStart(28261782, $changed, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:860)");
    L9:
        EnterTransition activeEnter = trackActiveEnter(r22, enter, $composer, ($changed & 14) | ($changed & 112));
        ExitTransition activeExit = trackActiveExit(r22, exit, $composer, ($changed & 14) | (($changed >> 3) & 112));
        if (activeEnter.getData$animation_release().getSlide() == null) goto L12;
    L15:
        boolean r1 = true;
    L16:
        boolean shouldAnimateSlide = r1;
        if (activeEnter.getData$animation_release().getChangeSize() == null) goto L19;
    L22:
        boolean r2 = true;
    L23:
        boolean shouldAnimateSizeChange = r2;
        Transition.DeferredAnimation offsetAnimation = null;
        if (shouldAnimateSlide == false) goto L30;
        $composer.startReplaceGroup(-821159459);
        ComposerKt.sourceInformation($composer, "870@38849L27,870@38798L79");
        TwoWayConverter<IntOffset, AnimationVector2D> r3 = VectorConvertersKt.getVectorConverter(IntOffset.Companion);
        ComposerKt.sourceInformationMarkerStart($composer, -165034343, "CC(remember):EnterExitTransition.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L29;
        Object value$iv = label + " slide";
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L29:
        ComposerKt.sourceInformationMarkerEnd($composer);
        Transition.DeferredAnimation r4 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(r22, r3, (String) it$iv, $composer, ($changed & 14) | 384, 0);
        $composer.endReplaceGroup();
        Transition.DeferredAnimation r5 = r4;
    L31:
        Transition.DeferredAnimation slideAnimation = r5;
        if (shouldAnimateSizeChange == false) goto L38;
        $composer.startReplaceGroup(-820961865);
        ComposerKt.sourceInformation($composer, "876@39046L35,876@38997L85");
        TwoWayConverter<IntSize, AnimationVector2D> r6 = VectorConvertersKt.getVectorConverter(IntSize.Companion);
        ComposerKt.sourceInformationMarkerStart($composer, -165028031, "CC(remember):EnterExitTransition.kt#9igjgp");
        Object it$iv2 = $composer.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L37;
        Object value$iv2 = label + " shrink/expand";
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L37:
        ComposerKt.sourceInformationMarkerEnd($composer);
        Transition.DeferredAnimation r8 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(r22, r6, (String) it$iv2, $composer, ($changed & 14) | 384, 0);
        $composer.endReplaceGroup();
        Transition.DeferredAnimation r9 = r8;
    L39:
        Transition.DeferredAnimation sizeAnimation = r9;
        if (shouldAnimateSizeChange == false) goto L46;
        $composer.startReplaceGroup(-820777446);
        ComposerKt.sourceInformation($composer, "883@39265L48,881@39181L146");
        TwoWayConverter<IntOffset, AnimationVector2D> r10 = VectorConvertersKt.getVectorConverter(IntOffset.Companion);
        ComposerKt.sourceInformationMarkerStart($composer, -165021010, r1);
        Object it$iv3 = $composer.rememberedValue();
        if (it$iv3 != Composer.Companion.getEmpty()) goto L45;
        Object value$iv3 = label + " InterruptionHandlingOffset";
        $composer.updateRememberedValue(value$iv3);
        it$iv3 = value$iv3;
    L45:
        ComposerKt.sourceInformationMarkerEnd($composer);
        offsetAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(r22, r10, (String) it$iv3, $composer, ($changed & 14) | 384, 0);
        $composer.endReplaceGroup();
    L47:
        ChangeSize r0 = activeEnter.getData$animation_release().getChangeSize();
        if (r0 != null) goto L50;
    L52:
        boolean r11 = false;
    L53:
        if (r11 == true) goto L64;
        ChangeSize r12 = activeExit.getData$animation_release().getChangeSize();
        if (r12 != null) goto L57;
    L59:
        boolean r13 = false;
    L60:
        if (r13 == true) goto L64;
        if (shouldAnimateSizeChange == false) goto L64;
        boolean disableClip = false;
    L65:
        final boolean disableClip2 = disableClip;
        GraphicsLayerBlockForEnterExit graphicsLayerBlock = createGraphicsLayerBlock(r22, activeEnter, activeExit, label, $composer, ($changed & 14) | (($changed >> 3) & 7168));
        Modifier.Companion r14 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer, -165009340, r1);
        boolean r15 = $composer.changed(disableClip2);
        if ((($changed & 7168) ^ 3072) <= 2048) goto L70;
        if ($composer.changed(r7) == false) goto L70;
    L71:
        boolean r16 = true;
    L73:
        boolean invalid$iv = r15 | r16;
        Object it$iv4 = $composer.rememberedValue();
        if (invalid$iv == false) goto L76;
    L79:
        Object value$iv4 = (Function1) new EnterExitTransitionKt$createModifier$2$1(disableClip2, r7);
        $composer.updateRememberedValue(value$iv4);
        it$iv4 = value$iv4;
    L80:
        ComposerKt.sourceInformationMarkerEnd($composer);
        Modifier r17 = GraphicsLayerModifierKt.graphicsLayer(r14, (Function1) it$iv4).then(new EnterExitTransitionElement(r22, sizeAnimation, offsetAnimation, slideAnimation, activeEnter, activeExit, r7, graphicsLayerBlock));
        if (ComposerKt.isTraceInProgress() == false) goto L83;
        ComposerKt.traceEventEnd();
    L83:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r17;
    L76:
        if (it$iv4 != Composer.Companion.getEmpty()) goto L80;
    L70:
        if (($changed & 3072) == 2048) goto L71;
        r16 = false;
        goto L73
    L57:
        if (r12.getClip() == true) goto L59;
        r13 = true;
    L64:
        disableClip = true;
        goto L65
    L50:
        if (r0.getClip() == true) goto L52;
        r11 = true;
        goto L53
    L46:
        $composer.startReplaceGroup(-820608001);
        $composer.endReplaceGroup();
        goto L47
    L38:
        $composer.startReplaceGroup(-820851041);
        $composer.endReplaceGroup();
        r9 = null;
        goto L39
    L30:
        $composer.startReplaceGroup(-821053656);
        $composer.endReplaceGroup();
        r5 = null;
        goto L31
    L19:
        if (activeExit.getData$animation_release().getChangeSize() != null) goto L22;
        r2 = false;
        goto L23
    L12:
        if (activeExit.getData$animation_release().getSlide() != null) goto L15;
        r1 = false;
        goto L16
    L5:
        r7 = r25;
        goto L7
    }

    public static final EnterTransition trackActiveEnter(Transition<EnterExitState> r8, EnterTransition enter, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 21614502, "C(trackActiveEnter)913@40506L40:EnterExitTransition.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(21614502, $changed, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:908)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, -1583267014, "CC(remember):EnterExitTransition.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L10;
        if ($composer.changed(r8) == false) goto L10;
    L11:
        boolean invalid$iv = true;
    L13:
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L16;
    L19:
        Object value$iv = SnapshotStateKt.mutableStateOf$default(enter, null, 2, null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L20:
        MutableState activeEnter$delegate = (MutableState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (r8.getCurrentState() != r8.getTargetState()) goto L29;
        if (r8.getCurrentState() != EnterExitState.Visible) goto L29;
        if (r8.isSeeking() == false) goto L27;
        trackActiveEnter$lambda$6(activeEnter$delegate, enter);
    L31:
        EnterTransition r1 = trackActiveEnter$lambda$5(activeEnter$delegate);
        if (ComposerKt.isTraceInProgress() == false) goto L34;
        ComposerKt.traceEventEnd();
    L34:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L27:
        trackActiveEnter$lambda$6(activeEnter$delegate, EnterTransition.Companion.getNone());
    L29:
        if (r8.getTargetState() != EnterExitState.Visible) goto L31;
        trackActiveEnter$lambda$6(activeEnter$delegate, trackActiveEnter$lambda$5(activeEnter$delegate).plus(enter));
        goto L31
    L16:
        if (it$iv != Composer.Companion.getEmpty()) goto L20;
    L10:
        if (($changed & 6) == 4) goto L11;
        invalid$iv = false;
        goto L13
    }

    private static final EnterTransition trackActiveEnter$lambda$5(MutableState<EnterTransition> r4) {
        MutableState<EnterTransition> $this$getValue$iv = r4;
        return $this$getValue$iv.getValue();
    }

    private static final void trackActiveEnter$lambda$6(MutableState<EnterTransition> r4, EnterTransition value) {
        r4.setValue(value);
    }

    public static final ExitTransition trackActiveExit(Transition<EnterExitState> r8, ExitTransition exit, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1363864804, "C(trackActiveExit)933@41487L39:EnterExitTransition.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1363864804, $changed, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:928)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 1483151723, "CC(remember):EnterExitTransition.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L10;
        if ($composer.changed(r8) == false) goto L10;
    L11:
        boolean invalid$iv = true;
    L13:
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L16;
    L19:
        Object value$iv = SnapshotStateKt.mutableStateOf$default(exit, null, 2, null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L20:
        MutableState activeExit$delegate = (MutableState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (r8.getCurrentState() != r8.getTargetState()) goto L29;
        if (r8.getCurrentState() != EnterExitState.Visible) goto L29;
        if (r8.isSeeking() == false) goto L27;
        trackActiveExit$lambda$9(activeExit$delegate, exit);
    L31:
        ExitTransition r1 = trackActiveExit$lambda$8(activeExit$delegate);
        if (ComposerKt.isTraceInProgress() == false) goto L34;
        ComposerKt.traceEventEnd();
    L34:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L27:
        trackActiveExit$lambda$9(activeExit$delegate, ExitTransition.Companion.getNone());
    L29:
        if (r8.getTargetState() == EnterExitState.Visible) goto L31;
        trackActiveExit$lambda$9(activeExit$delegate, trackActiveExit$lambda$8(activeExit$delegate).plus(exit));
        goto L31
    L16:
        if (it$iv != Composer.Companion.getEmpty()) goto L20;
    L10:
        if (($changed & 6) == 4) goto L11;
        invalid$iv = false;
        goto L13
    }

    private static final ExitTransition trackActiveExit$lambda$8(MutableState<ExitTransition> r4) {
        MutableState<ExitTransition> $this$getValue$iv = r4;
        return $this$getValue$iv.getValue();
    }

    private static final void trackActiveExit$lambda$9(MutableState<ExitTransition> r4, ExitTransition value) {
        r4.setValue(value);
    }

    private static final GraphicsLayerBlockForEnterExit createGraphicsLayerBlock(Transition<EnterExitState> r24, EnterTransition enter, ExitTransition exit, String label, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 642253525, "C(createGraphicsLayerBlock)988@43413L3044:EnterExitTransition.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(642253525, $changed, -1, "androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:956)");
    L6:
        if (enter.getData$animation_release().getFade() == null) goto L8;
    L11:
        boolean r1 = true;
    L12:
        boolean shouldAnimateAlpha = r1;
        if (enter.getData$animation_release().getScale() == null) goto L15;
    L18:
        boolean r2 = true;
    L19:
        boolean shouldAnimateScale = r2;
        if (shouldAnimateAlpha == false) goto L26;
        $composer.startReplaceGroup(-675026101);
        ComposerKt.sourceInformation($composer, "968@42850L27,966@42746L145");
        TwoWayConverter<Float, AnimationVector1D> r3 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        ComposerKt.sourceInformationMarkerStart($composer, -1545792055, "CC(remember):EnterExitTransition.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L25;
        Object value$iv = label + " alpha";
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L25:
        ComposerKt.sourceInformationMarkerEnd($composer);
        Transition.DeferredAnimation r4 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(r24, r3, (String) it$iv, $composer, ($changed & 14) | 384, 0);
        $composer.endReplaceGroup();
        Transition.DeferredAnimation r18 = r4;
    L27:
        final Transition.DeferredAnimation alphaAnimation = r18;
        if (shouldAnimateScale == false) goto L34;
        $composer.startReplaceGroup(-674790005);
        ComposerKt.sourceInformation($composer, "976@43088L27,974@42984L145");
        TwoWayConverter<Float, AnimationVector1D> r5 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        ComposerKt.sourceInformationMarkerStart($composer, -1545784439, "CC(remember):EnterExitTransition.kt#9igjgp");
        Object it$iv2 = $composer.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L33;
        Object value$iv2 = label + " scale";
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L33:
        ComposerKt.sourceInformationMarkerEnd($composer);
        Transition.DeferredAnimation r6 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(r24, r5, (String) it$iv2, $composer, ($changed & 14) | 384, 0);
        $composer.endReplaceGroup();
        Transition.DeferredAnimation r19 = r6;
    L35:
        final Transition.DeferredAnimation scaleAnimation = r19;
        if (shouldAnimateScale == false) goto L38;
        $composer.startReplaceGroup(-674543896);
        ComposerKt.sourceInformation($composer, "982@43232L148");
        Transition.DeferredAnimation r13 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(r24, TransformOriginVectorConverter, "TransformOriginInterruptionHandling", $composer, ($changed & 14) | 384, 0);
        $composer.endReplaceGroup();
        Transition.DeferredAnimation r23 = r13;
    L39:
        final Transition.DeferredAnimation transformOriginAnimation = r23;
        ComposerKt.sourceInformationMarkerStart($composer, -1545771022, "CC(remember):EnterExitTransition.kt#9igjgp");
        boolean r7 = $composer.changedInstance(alphaAnimation);
        if ((($changed & 112) ^ 48) <= 32) goto L44;
        EnterTransition r8 = enter;
        if ($composer.changed(r8) == false) goto L46;
    L47:
        boolean r9 = true;
    L49:
        boolean r10 = r7 | r9;
        if ((($changed & 896) ^ 384) <= 256) goto L54;
        ExitTransition r11 = exit;
        if ($composer.changed(r11) == false) goto L56;
    L57:
        boolean r12 = true;
    L59:
        boolean r14 = (r10 | r12) | $composer.changedInstance(scaleAnimation);
        if ((($changed & 14) ^ 6) <= 4) goto L64;
        Transition<EnterExitState> r15 = r24;
        if ($composer.changed(r15) == false) goto L66;
    L67:
        boolean r16 = true;
    L69:
        boolean invalid$iv = (r14 | r16) | $composer.changedInstance(transformOriginAnimation);
        Object it$iv3 = $composer.rememberedValue();
        if (invalid$iv == false) goto L72;
    L75:
        final EnterTransition r21 = r8;
        final ExitTransition r22 = r11;
        final Transition<EnterExitState> r20 = r15;
        Object value$iv3 = new EnterExitTransitionKt$$ExternalSyntheticLambda0(alphaAnimation, scaleAnimation, r20, r21, r22, transformOriginAnimation);
        $composer.updateRememberedValue(value$iv3);
        it$iv3 = value$iv3;
    L76:
        GraphicsLayerBlockForEnterExit r17 = (GraphicsLayerBlockForEnterExit) it$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L79;
        ComposerKt.traceEventEnd();
    L79:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r17;
    L72:
        if (it$iv3 != Composer.Companion.getEmpty()) goto L76;
    L66:
        if (($changed & 6) == 4) goto L67;
        r16 = false;
        goto L69
    L64:
        r15 = r24;
    L56:
        if (($changed & 384) == 256) goto L57;
        r12 = false;
        goto L59
    L54:
        r11 = exit;
    L46:
        if (($changed & 48) == 32) goto L47;
        r9 = false;
        goto L49
    L44:
        r8 = enter;
        goto L46
    L38:
        $composer.startReplaceGroup(-674372529);
        $composer.endReplaceGroup();
        r23 = null;
        goto L39
    L34:
        $composer.startReplaceGroup(-674621521);
        $composer.endReplaceGroup();
        r19 = null;
        goto L35
    L26:
        $composer.startReplaceGroup(-674857617);
        $composer.endReplaceGroup();
        r18 = null;
        goto L27
    L15:
        if (exit.getData$animation_release().getScale() != null) goto L18;
        r2 = false;
        goto L19
    L8:
        if (exit.getData$animation_release().getFade() != null) goto L11;
        r1 = false;
        goto L12
    }

    static final Function1 createGraphicsLayerBlock$lambda$13$lambda$12(Transition.DeferredAnimation $alphaAnimation, Transition.DeferredAnimation $scaleAnimation, Transition $this_createGraphicsLayerBlock, final EnterTransition $enter, final ExitTransition $exit, Transition.DeferredAnimation $transformOriginAnimation) {
        final State transformOrigin = null;
        if ($alphaAnimation == null) goto L5;
        final State alpha = $alphaAnimation.animate(new EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1($enter, $exit), new EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2($enter, $exit));
    L7:
        if ($scaleAnimation == null) goto L9;
        final State scale = $scaleAnimation.animate(new EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1($enter, $exit), new EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2($enter, $exit));
    L11:
        if ($this_createGraphicsLayerBlock.getCurrentState() != EnterExitState.PreEnter) goto L19;
        Scale r3 = $enter.getData$animation_release().getScale();
        if (r3 == null) goto L15;
    L14:
        final TransformOrigin transformOriginWhenVisible = TransformOrigin.m4744boximpl(r3.m103getTransformOriginSzJe1aQ());
    L27:
        if ($transformOriginAnimation == null) goto L30;
        transformOrigin = $transformOriginAnimation.animate(EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1.INSTANCE, new EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2(transformOriginWhenVisible, $enter, $exit));
    L30:
        return new EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1(alpha, scale, transformOrigin);
    L15:
        r3 = $exit.getData$animation_release().getScale();
        if (r3 != null) goto L14;
        transformOriginWhenVisible = null;
        goto L27
    L19:
        Scale r4 = $exit.getData$animation_release().getScale();
        if (r4 == null) goto L22;
    L21:
        transformOriginWhenVisible = TransformOrigin.m4744boximpl(r4.m103getTransformOriginSzJe1aQ());
        goto L27
    L22:
        r4 = $enter.getData$animation_release().getScale();
        if (r4 != null) goto L21;
        transformOriginWhenVisible = null;
        goto L27
    L9:
        scale = null;
        goto L11
    L5:
        alpha = null;
        goto L7
    }

    static {
        TransformOriginVectorConverter = VectorConvertersKt.TwoWayConverter(EnterExitTransitionKt$TransformOriginVectorConverter$1.INSTANCE, EnterExitTransitionKt$TransformOriginVectorConverter$2.INSTANCE);
        DefaultAlphaAndScaleSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        DefaultOffsetAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m7092boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        DefaultSizeAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m7136boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
    }
}
