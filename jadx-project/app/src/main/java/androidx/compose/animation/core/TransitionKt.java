package androidx.compose.animation.core;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a-\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u001b\u001a\u0002H\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u001c\u001a3\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u001d2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0002\u0010\u001e\u001ai\u0010\u001f\u001a\u00020\u0011\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010\u0014\"\b\b\u0002\u0010!*\u00020\"*\b\u0012\u0004\u0012\u0002H 0\u00132\u001c\u0010#\u001a\u0018\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H!0$R\b\u0012\u0004\u0012\u0002H 0\u00132\u0006\u0010%\u001a\u0002H\u00142\u0006\u0010&\u001a\u0002H\u00142\f\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00140(H\u0003¢\u0006\u0002\u0010)\u001a\u0082\u0001\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00132*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020,0\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u00105\u001a\u0082\u0001\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030+\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00132*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u00105\u001a\u0082\u0001\u00107\u001a\b\u0012\u0004\u0012\u00020\u00010+\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00132*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u00105\u001a\u0082\u0001\u00108\u001a\b\u0012\u0004\u0012\u0002090+\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00132*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u0002090(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u0002090\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u00105\u001a\u0082\u0001\u0010:\u001a\b\u0012\u0004\u0012\u00020;0+\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00132*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020;0\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u00105\u001a\u0082\u0001\u0010<\u001a\b\u0012\u0004\u0012\u00020=0+\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00132*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020=0\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u00105\u001a\u0082\u0001\u0010>\u001a\b\u0012\u0004\u0012\u00020?0+\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00132*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020?0\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u00105\u001a\u0082\u0001\u0010@\u001a\b\u0012\u0004\u0012\u00020A0+\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00132*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020A0\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u00105\u001a¦\u0001\u0010B\u001a\b\u0012\u0004\u0012\u0002H\u00140+\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010\u0014\"\b\b\u0002\u0010!*\u00020\"*\b\u0012\u0004\u0012\u0002H 0\u00132\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H!0D2*\b\n\u0010-\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0.\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140(0\u000f¢\u0006\u0002\b/¢\u0006\u0002\b02\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u00101\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u0002H\u00140\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u0010E\u001a\\\u0010F\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010\u0014*\b\u0012\u0004\u0012\u0002H 0\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00182&\u0010G\u001a\"\u0012\u0013\u0012\u0011H ¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H\u00140\u000f¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\u0010I\u001aA\u0010J\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010\u0014*\b\u0012\u0004\u0012\u0002H 0\u00132\u0006\u0010K\u001a\u0002H\u00142\u0006\u0010\u001b\u001a\u0002H\u00142\u0006\u0010L\u001a\u00020\u0018H\u0001¢\u0006\u0002\u0010M\u001aa\u0010N\u001a\u0018\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H!0OR\b\u0012\u0004\u0012\u0002H 0\u0013\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010\u0014\"\b\b\u0002\u0010!*\u00020\"*\b\u0012\u0004\u0012\u0002H 0\u00132\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H!0D2\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010P\u001am\u0010Q\u001a\b\u0012\u0004\u0012\u0002H\u00140+\"\u0004\b\u0000\u0010 \"\u0004\b\u0001\u0010\u0014\"\b\b\u0002\u0010!*\u00020\"*\b\u0012\u0004\u0012\u0002H 0\u00132\u0006\u0010%\u001a\u0002H\u00142\u0006\u0010&\u001a\u0002H\u00142\f\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00140(2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H!0D2\u0006\u0010\u0017\u001a\u00020\u0018H\u0001¢\u0006\u0002\u0010R\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u001b\u0010\b\u001a\u00020\t8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\"\u001e\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006S"}, d2 = {"AnimationDebugDurationScale", "", "NoReset", "", "ResetAnimationSnap", "ResetAnimationSnapCurrent", "ResetAnimationSnapTarget", "ResetNoSnap", "SeekableStateObserver", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "getSeekableStateObserver", "()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "SeekableStateObserver$delegate", "Lkotlin/Lazy;", "SeekableTransitionStateTotalDurationChanged", "Lkotlin/Function1;", "Landroidx/compose/animation/core/SeekableTransitionState;", "", "rememberTransition", "Landroidx/compose/animation/core/Transition;", "T", "transitionState", "Landroidx/compose/animation/core/TransitionState;", "label", "", "(Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "updateTransition", "targetState", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/MutableTransitionState;", "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "UpdateInitialAndTargetValues", "S", "V", "Landroidx/compose/animation/core/AnimationVector;", "transitionAnimation", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "initialValue", "targetValue", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$TransitionAnimationState;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/runtime/Composer;I)V", "animateDp", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", "transitionSpec", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "targetValueByState", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "state", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateFloat", "animateInt", "animateIntOffset", "Landroidx/compose/ui/unit/IntOffset;", "animateIntSize", "Landroidx/compose/ui/unit/IntSize;", "animateOffset", "Landroidx/compose/ui/geometry/Offset;", "animateRect", "Landroidx/compose/ui/geometry/Rect;", "animateSize", "Landroidx/compose/ui/geometry/Size;", "animateValue", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "createChildTransition", "transformToChildState", "parentState", "(Landroidx/compose/animation/core/Transition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "createChildTransitionInternal", "initialState", "childLabel", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/Transition;", "createDeferredAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition$DeferredAnimation;", "createTransitionAnimation", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TransitionKt {
    public static final int AnimationDebugDurationScale = 1;
    private static final float NoReset = -1.0f;
    private static final float ResetAnimationSnap = -3.0f;
    private static final float ResetAnimationSnapCurrent = -4.0f;
    private static final float ResetAnimationSnapTarget = -5.0f;
    private static final float ResetNoSnap = -2.0f;
    private static final Lazy SeekableStateObserver$delegate = null;
    private static final Function1<SeekableTransitionState<?>, Unit> SeekableTransitionStateTotalDurationChanged = null;

    public static final /* synthetic */ void access$UpdateInitialAndTargetValues(Transition $receiver, Transition.TransitionAnimationState transitionAnimation, Object initialValue, Object targetValue, FiniteAnimationSpec animationSpec, Composer $composer, int $changed) {
        UpdateInitialAndTargetValues($receiver, transitionAnimation, initialValue, targetValue, animationSpec, $composer, $changed);
    }

    public static final /* synthetic */ Function1 access$getSeekableTransitionStateTotalDurationChanged$p() {
        return SeekableTransitionStateTotalDurationChanged;
    }

    public static final <T> Transition<T> updateTransition(T r7, String label, Composer $composer, int $changed, int r11) {
        ComposerKt.sourceInformationMarkerStart($composer, 2029166765, "C(updateTransition)P(1)87@3839L51,88@3906L22,89@3962L190,89@3933L219:Transition.kt#pdpnli");
        if ((r11 & 2) == 0) goto L6;
        label = null;
    L6:
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventStart(2029166765, $changed, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:86)");
    L8:
        ComposerKt.sourceInformationMarkerStart($composer, -659287883, "CC(remember):Transition.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L12;
        Object value$iv = new Transition(r7, label);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L12:
        final Transition<T> r12 = (Transition) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        r12.animateTo$animation_core_release(r7, $composer, (($changed & 8) | 48) | ($changed & 14));
        ComposerKt.sourceInformationMarkerStart($composer, -659283808, "CC(remember):Transition.kt#9igjgp");
        Object it$iv2 = $composer.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L16;
        Object value$iv2 = (Function1) new TransitionKt$updateTransition$1$1(r12);
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L16:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.DisposableEffect(r12, (Function1) it$iv2, $composer, 54);
        if (ComposerKt.isTraceInProgress() == false) goto L19;
        ComposerKt.traceEventEnd();
    L19:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r12;
    }

    static {
        SeekableTransitionStateTotalDurationChanged = TransitionKt$SeekableTransitionStateTotalDurationChanged$1.INSTANCE;
        SeekableStateObserver$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, TransitionKt$SeekableStateObserver$2.INSTANCE);
    }

    public static final SnapshotStateObserver getSeekableStateObserver() {
        return (SnapshotStateObserver) SeekableStateObserver$delegate.getValue();
    }

    public static final <T> Transition<T> rememberTransition(TransitionState<T> r16, String label, Composer $composer, int $changed, int r20) {
        ComposerKt.sourceInformationMarkerStart($composer, 1643203617, "C(rememberTransition)P(1)805@34726L82,818@35438L190,818@35409L219:Transition.kt#pdpnli");
        if ((r20 & 2) == 0) goto L5;
        String label2 = null;
    L7:
        if (ComposerKt.isTraceInProgress() == false) goto L9;
        ComposerKt.traceEventStart(1643203617, $changed, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:803)");
    L9:
        ComposerKt.sourceInformationMarkerStart($composer, 587437176, "CC(remember):Transition.kt#9igjgp");
        boolean invalid$iv = true;
        if ((($changed & 14) ^ 6) <= 4) goto L14;
        if ($composer.changed(r16) == false) goto L14;
    L15:
        boolean invalid$iv2 = true;
    L17:
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv2 == false) goto L20;
    L23:
        Object value$iv = new Transition(r16, label2);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L24:
        final Transition<T> r11 = (Transition) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if ((r16 instanceof SeekableTransitionState) == false) goto L42;
        $composer.startReplaceGroup(1030829284);
        ComposerKt.sourceInformation($composer, "807@34945L382,807@34871L456");
        T r3 = r16.getCurrentState();
        T r9 = r16.getTargetState();
        ComposerKt.sourceInformationMarkerStart($composer, 587444484, "CC(remember):Transition.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L31;
        if ($composer.changed(r16) == false) goto L31;
    L34:
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv == false) goto L37;
    L40:
        Object value$iv2 = (Function2) new TransitionKt$rememberTransition$1$1(r16, null);
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L41:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(r3, r9, (Function2) it$iv2, $composer, 0);
        $composer.endReplaceGroup();
    L43:
        ComposerKt.sourceInformationMarkerStart($composer, 587460068, "CC(remember):Transition.kt#9igjgp");
        boolean invalid$iv3 = $composer.changed(r11);
        Object it$iv3 = $composer.rememberedValue();
        if (invalid$iv3 == false) goto L46;
    L49:
        Object value$iv3 = (Function1) new TransitionKt$rememberTransition$2$1(r11);
        $composer.updateRememberedValue(value$iv3);
        it$iv3 = value$iv3;
    L50:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.DisposableEffect(r11, (Function1) it$iv3, $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L53;
        ComposerKt.traceEventEnd();
    L53:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r11;
    L46:
        if (it$iv3 != Composer.Companion.getEmpty()) goto L50;
    L37:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L41;
    L31:
        if (($changed & 6) == 4) goto L34;
        invalid$iv = false;
        goto L34
    L42:
        $composer.startReplaceGroup(1031290843);
        ComposerKt.sourceInformation($composer, "816@35360L38");
        r11.animateTo$animation_core_release(r16.getTargetState(), $composer, 0);
        $composer.endReplaceGroup();
        goto L43
    L20:
        if (it$iv != Composer.Companion.getEmpty()) goto L24;
    L14:
        if (($changed & 6) == 4) goto L15;
        invalid$iv2 = false;
        goto L17
    L5:
        label2 = label;
        goto L7
    }

    @Deprecated(message = "Use rememberTransition() instead", replaceWith = @ReplaceWith(expression = "rememberTransition(transitionState, label)", imports = {}))
    public static final <T> Transition<T> updateTransition(MutableTransitionState<T> r2, String label, Composer $composer, int $changed, int r6) {
        ComposerKt.sourceInformationMarkerStart($composer, 882913843, "C(updateTransition)P(1)858@37095L32:Transition.kt#pdpnli");
        if ((r6 & 2) == 0) goto L6;
        label = null;
    L6:
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventStart(882913843, $changed, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:856)");
    L8:
        MutableTransitionState<T> state = r2;
        Transition<T> r0 = rememberTransition(state, label, $composer, ($changed & 14) | ($changed & 112), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventEnd();
    L11:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public static final <S, T, V extends AnimationVector> Transition<S>.DeferredAnimation<T, V> createDeferredAnimation(final Transition<S> r10, TwoWayConverter<T, V> r11, String label, Composer $composer, int $changed, int r15) {
        ComposerKt.sourceInformationMarkerStart($composer, -1714122528, "C(createDeferredAnimation)P(1)1732@73286L58,1733@73376L43,1733@73349L70:Transition.kt#pdpnli");
        if ((r15 & 2) == 0) goto L6;
        label = "DeferredAnimation";
    L6:
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventStart(-1714122528, $changed, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1731)");
    L8:
        ComposerKt.sourceInformationMarkerStart($composer, -1378213409, "CC(remember):Transition.kt#9igjgp");
        boolean r1 = true;
        if ((($changed & 14) ^ 6) <= 4) goto L13;
        if ($composer.changed(r10) == false) goto L13;
    L14:
        boolean invalid$iv = true;
    L16:
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L19;
    L22:
        Object value$iv = new Transition.DeferredAnimation(r10, r11, label);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L23:
        final Transition<S>.DeferredAnimation<T, V> r16 = (Transition.DeferredAnimation) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, -1378210544, "CC(remember):Transition.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L28;
        if ($composer.changed(r10) == false) goto L28;
    L31:
        boolean invalid$iv2 = $composer.changedInstance(r16) | r1;
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv2 == false) goto L34;
    L37:
        Object value$iv2 = (Function1) new TransitionKt$createDeferredAnimation$1$1(r10, r16);
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L38:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.DisposableEffect(r16, (Function1) it$iv2, $composer, 0);
        if (r10.isSeeking() == false) goto L42;
        r16.setupSeeking$animation_core_release();
    L42:
        if (ComposerKt.isTraceInProgress() == false) goto L44;
        ComposerKt.traceEventEnd();
    L44:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r16;
    L34:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L38;
    L28:
        if (($changed & 6) == 4) goto L31;
        r1 = false;
        goto L31
    L19:
        if (it$iv != Composer.Companion.getEmpty()) goto L23;
    L13:
        if (($changed & 6) == 4) goto L14;
        invalid$iv = false;
        goto L16
    }

    public static final <S, T> Transition<T> createChildTransition(Transition<S> r8, String label, Function3<? super S, ? super Composer, ? super Integer, ? extends T> r10, Composer $composer, int $changed, int r13) {
        ComposerKt.sourceInformationMarkerStart($composer, 1215497572, "CC(createChildTransition)1761@74780L36,1762@74840L74,1763@74937L39,1764@74988L63:Transition.kt#pdpnli");
        boolean invalid$iv = true;
        if ((r13 & 1) == 0) goto L5;
        String label2 = "ChildTransition";
    L6:
        ComposerKt.sourceInformationMarkerStart($composer, 272047797, "CC(remember):Transition.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L11;
        if ($composer.changed(r8) == false) goto L11;
    L14:
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L17;
    L20:
        Object value$iv = r8.getCurrentState();
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L21:
        ComposerKt.sourceInformationMarkerEnd($composer);
        Object initialParentState = it$iv;
        if (r8.isSeeking() == false) goto L24;
        Object r14 = r8.getCurrentState();
    L25:
        Object initialState = r10.invoke(r14, $composer, Integer.valueOf(($changed >> 3) & 112));
        Object targetState = r10.invoke(r8.getTargetState(), $composer, Integer.valueOf(($changed >> 3) & 112));
        Transition<T> r9 = createChildTransitionInternal(r8, initialState, targetState, label2, $composer, ($changed & 14) | (($changed << 6) & 7168));
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r9;
    L24:
        r14 = initialParentState;
        goto L25
    L17:
        if (it$iv != Composer.Companion.getEmpty()) goto L21;
    L11:
        if (($changed & 6) == 4) goto L14;
        invalid$iv = false;
        goto L14
    L5:
        label2 = label;
        goto L6
    }

    public static final <S, T> Transition<T> createChildTransitionInternal(final Transition<S> r16, T r17, T r18, String childLabel, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -198307638, "C(createChildTransitionInternal)P(1,2)1775@75259L124,1779@75418L92,1779@75389L121:Transition.kt#pdpnli");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-198307638, $changed, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1773)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 1039311242, "CC(remember):Transition.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L10;
        if ($composer.changed(r16) == false) goto L10;
    L11:
        boolean invalid$iv = true;
    L13:
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L16;
    L19:
        Object value$iv = new Transition(new MutableTransitionState(r17), r16, r16.getLabel() + " > " + childLabel);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L20:
        final Transition<T> r12 = (Transition) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 1039316298, "CC(remember):Transition.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L25;
        if ($composer.changed(r16) == false) goto L25;
    L26:
        boolean r7 = true;
    L28:
        boolean invalid$iv2 = $composer.changed(r12) | r7;
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv2 == false) goto L31;
    L34:
        Object value$iv2 = (Function1) new TransitionKt$createChildTransitionInternal$1$1(r16, r12);
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L35:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.DisposableEffect(r12, (Function1) it$iv2, $composer, 0);
        if (r16.isSeeking() == false) goto L38;
        r12.seek(r17, r18, r16.getLastSeekedTimeNanos$animation_core_release());
    L40:
        if (ComposerKt.isTraceInProgress() == false) goto L42;
        ComposerKt.traceEventEnd();
    L42:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r12;
    L38:
        r12.updateTarget$animation_core_release(r18);
        r12.setSeeking$animation_core_release(false);
        goto L40
    L31:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L35;
    L25:
        if (($changed & 6) == 4) goto L26;
        r7 = false;
        goto L28
    L16:
        if (it$iv != Composer.Companion.getEmpty()) goto L20;
    L10:
        if (($changed & 6) == 4) goto L11;
        invalid$iv = false;
        goto L13
    }

    public static final <S, T, V extends AnimationVector> State<T> animateValue(Transition<S> r9, TwoWayConverter<T, V> r10, Function3 r11, String label, Function3<? super S, ? super Composer, ? super Integer, ? extends T> r13, Composer $composer, int $changed, int r16) {
        ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
        if ((r16 & 2) == 0) goto L6;
        Function3 transitionSpec = C02081.INSTANCE;
        r11 = transitionSpec;
    L6:
        if ((r16 & 4) == 0) goto L8;
        String label2 = "ValueAnimation";
    L9:
        Object initialValue = r13.invoke(r9.getCurrentState(), $composer, Integer.valueOf(($changed >> 9) & 112));
        Object targetValue = r13.invoke(r9.getTargetState(), $composer, Integer.valueOf(($changed >> 9) & 112));
        State<T> r12 = createTransitionAnimation(r9, initialValue, targetValue, r11.invoke(r9.getSegment(), $composer, Integer.valueOf(($changed >> 3) & 112)), r10, label2, $composer, (($changed & 14) | (57344 & ($changed << 9))) | (($changed << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r12;
    L8:
        label2 = label;
        goto L9
    }

    public static final <S, T, V extends AnimationVector> State<T> createTransitionAnimation(final Transition<S> r18, T r19, T r20, FiniteAnimationSpec<T> r21, TwoWayConverter<T, V> r22, String label, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -304821198, "C(createTransitionAnimation)P(1,3!1,4)1850@78332L543,1862@78880L91,1864@79015L108,1864@78977L146:Transition.kt#pdpnli");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-304821198, $changed, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1848)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 1397710670, "CC(remember):Transition.kt#9igjgp");
        boolean r9 = true;
        if ((($changed & 14) ^ 6) <= 4) goto L10;
        if ($composer.changed(r18) == false) goto L10;
    L11:
        boolean r1 = true;
    L13:
        boolean invalid$iv = r1;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L16;
    L19:
        Object value$iv = new Transition.TransitionAnimationState(r18, r19, AnimationStateKt.createZeroVectorFrom(r22, r20), r22, label);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L20:
        final Transition.TransitionAnimationState transitionAnimation = (Transition.TransitionAnimationState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        UpdateInitialAndTargetValues(r18, transitionAnimation, r19, r20, r21, $composer, ((((($changed & 14) | ((($changed >> 3) & 8) << 6)) | (($changed << 3) & 896)) | ((($changed >> 3) & 8) << 9)) | (($changed << 3) & 7168)) | (57344 & ($changed << 3)));
        ComposerKt.sourceInformationMarkerStart($composer, 1397732091, "CC(remember):Transition.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L25;
        if ($composer.changed(r18) == false) goto L25;
    L28:
        boolean invalid$iv2 = $composer.changed(transitionAnimation) | r9;
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv2 == false) goto L31;
    L34:
        Object value$iv2 = (Function1) new TransitionKt$createTransitionAnimation$1$1(r18, transitionAnimation);
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L35:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.DisposableEffect(transitionAnimation, (Function1) it$iv2, $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L38;
        ComposerKt.traceEventEnd();
    L38:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return transitionAnimation;
    L31:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L35;
    L25:
        if (($changed & 6) == 4) goto L28;
        r9 = false;
        goto L28
    L16:
        if (it$iv != Composer.Companion.getEmpty()) goto L20;
    L10:
        if (($changed & 6) == 4) goto L11;
        r1 = false;
        goto L13
    }

    private static final <S, T, V extends AnimationVector> void UpdateInitialAndTargetValues(final Transition<S> r9, final Transition<S>.TransitionAnimationState<T, V> r10, final T r11, final T r12, final FiniteAnimationSpec<T> r13, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(867041821);
        ComposerKt.sourceInformation($composer2, "C(UpdateInitialAndTargetValues)P(3,1,2):Transition.kt#pdpnli");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(r9) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(r10) == false) goto L14;
        int r3 = 32;
    L15:
        $dirty = $dirty | r3;
        goto L17
    L14:
        r3 = 16;
    L17:
        if (($changed & 384) != 0) goto L27;
        if (($changed & 512) != 0) goto L21;
        boolean r4 = $composer2.changed(r11);
    L22:
        if (r4 == false) goto L24;
        int r5 = 256;
    L25:
        $dirty = $dirty | r5;
        goto L27
    L24:
        r5 = 128;
        goto L25
    L21:
        r4 = $composer2.changedInstance(r11);
    L27:
        if (($changed & 3072) != 0) goto L37;
        if (($changed & 4096) != 0) goto L31;
        boolean r6 = $composer2.changed(r12);
    L32:
        if (r6 == false) goto L34;
        int r7 = 2048;
    L35:
        $dirty = $dirty | r7;
        goto L37
    L34:
        r7 = 1024;
        goto L35
    L31:
        r6 = $composer2.changedInstance(r12);
    L37:
        if (($changed & 24576) != 0) goto L47;
        if ((32768 & $changed) != 0) goto L41;
        boolean r8 = $composer2.changed(r13);
    L42:
        if (r8 == false) goto L44;
        int r14 = 16384;
    L45:
        $dirty = $dirty | r14;
        goto L47
    L44:
        r14 = 8192;
        goto L45
    L41:
        r8 = $composer2.changedInstance(r13);
    L47:
        if (($dirty & 9363) == 9362) goto L49;
        boolean r15 = true;
    L51:
        if ($composer2.shouldExecute(r15, $dirty & 1) == true) goto L53;
        $composer2.skipToGroupEnd();
    L63:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L67;
        r0.updateScope(new AnonymousClass1(r9, r10, r11, r12, r13, $changed));
        return;
    L67:
        return;
    L53:
        if (ComposerKt.isTraceInProgress() == false) goto L56;
        ComposerKt.traceEventStart(867041821, $dirty, -1, "androidx.compose.animation.core.UpdateInitialAndTargetValues (Transition.kt:1880)");
    L56:
        if (r9.isSeeking() == false) goto L58;
        r10.updateInitialAndTargetValue$animation_core_release(r11, r12, r13);
    L60:
        if (ComposerKt.isTraceInProgress() == false) goto L63;
        ComposerKt.traceEventEnd();
        goto L63
    L58:
        r10.updateTargetValue$animation_core_release(r12, r13);
        goto L60
    L49:
        r15 = false;
        goto L51
    }

    public static final <S> State<Float> animateFloat(Transition<S> r18, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Float>> r19, String label, Function3<? super S, ? super Composer, ? super Integer, Float> r21, Composer $composer, int $changed, int r24) {
        ComposerKt.sourceInformationMarkerStart($composer, -1338768149, "CC(animateFloat)P(2)1924@81822L78:Transition.kt#pdpnli");
        if ((r24 & 1) == 0) goto L5;
        Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Float>> r10 = C02011.INSTANCE;
    L7:
        if ((r24 & 2) == 0) goto L9;
        String label2 = "FloatAnimation";
    L10:
        TwoWayConverter<Float, AnimationVector1D> r5 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int $changed$iv = ((($changed & 14) | (($changed << 3) & 896)) | (($changed << 3) & 7168)) | (($changed << 3) & 57344);
        String label$iv = label2;
        ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
        Object initialValue$iv = r21.invoke(r18.getCurrentState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        Object targetValue$iv = r21.invoke(r18.getTargetState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        int r3 = ($changed$iv << 9) & 57344;
        State<Float> r8 = createTransitionAnimation(r18, initialValue$iv, targetValue$iv, r10.invoke(r18.getSegment(), $composer, Integer.valueOf(($changed$iv >> 3) & 112)), r5, label$iv, $composer, (r3 | ($changed$iv & 14)) | (($changed$iv << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r8;
    L9:
        label2 = label;
        goto L10
    L5:
        r10 = r19;
        goto L7
    }

    public static final <S> State<Dp> animateDp(Transition<S> r18, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Dp>> r19, String label, Function3<? super S, ? super Composer, ? super Integer, Dp> r21, Composer $composer, int $changed, int r24) {
        ComposerKt.sourceInformationMarkerStart($composer, 184732935, "CC(animateDp)P(2)1954@83539L75:Transition.kt#pdpnli");
        if ((r24 & 1) == 0) goto L5;
        Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Dp>> r10 = C02001.INSTANCE;
    L7:
        if ((r24 & 2) == 0) goto L9;
        String label2 = "DpAnimation";
    L10:
        TwoWayConverter<Dp, AnimationVector1D> r5 = VectorConvertersKt.getVectorConverter(Dp.Companion);
        int $changed$iv = ((($changed & 14) | (($changed << 3) & 896)) | (($changed << 3) & 7168)) | (($changed << 3) & 57344);
        String label$iv = label2;
        ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
        Object initialValue$iv = r21.invoke(r18.getCurrentState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        Object targetValue$iv = r21.invoke(r18.getTargetState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        int r3 = ($changed$iv << 9) & 57344;
        State<Dp> r8 = createTransitionAnimation(r18, initialValue$iv, targetValue$iv, r10.invoke(r18.getSegment(), $composer, Integer.valueOf(($changed$iv >> 3) & 112)), r5, label$iv, $composer, (r3 | ($changed$iv & 14)) | (($changed$iv << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r8;
    L9:
        label2 = label;
        goto L10
    L5:
        r10 = r19;
        goto L7
    }

    public static final <S> State<Offset> animateOffset(Transition<S> r18, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Offset>> r19, String label, Function3<? super S, ? super Composer, ? super Integer, Offset> r21, Composer $composer, int $changed, int r24) {
        ComposerKt.sourceInformationMarkerStart($composer, 2078477582, "CC(animateOffset)P(2)1984@85282L79:Transition.kt#pdpnli");
        if ((r24 & 1) == 0) goto L5;
        Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Offset>> r10 = C02051.INSTANCE;
    L7:
        if ((r24 & 2) == 0) goto L9;
        String label2 = "OffsetAnimation";
    L10:
        TwoWayConverter<Offset, AnimationVector2D> r5 = VectorConvertersKt.getVectorConverter(Offset.Companion);
        int $changed$iv = ((($changed & 14) | (($changed << 3) & 896)) | (($changed << 3) & 7168)) | (($changed << 3) & 57344);
        String label$iv = label2;
        ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
        Object initialValue$iv = r21.invoke(r18.getCurrentState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        Object targetValue$iv = r21.invoke(r18.getTargetState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        int r3 = ($changed$iv << 9) & 57344;
        State<Offset> r8 = createTransitionAnimation(r18, initialValue$iv, targetValue$iv, r10.invoke(r18.getSegment(), $composer, Integer.valueOf(($changed$iv >> 3) & 112)), r5, label$iv, $composer, (r3 | ($changed$iv & 14)) | (($changed$iv << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r8;
    L9:
        label2 = label;
        goto L10
    L5:
        r10 = r19;
        goto L7
    }

    public static final <S> State<Size> animateSize(Transition<S> r18, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Size>> r19, String label, Function3<? super S, ? super Composer, ? super Integer, Size> r21, Composer $composer, int $changed, int r24) {
        ComposerKt.sourceInformationMarkerStart($composer, -802210820, "CC(animateSize)P(2)2014@87014L77:Transition.kt#pdpnli");
        if ((r24 & 1) == 0) goto L5;
        Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Size>> r10 = C02071.INSTANCE;
    L7:
        if ((r24 & 2) == 0) goto L9;
        String label2 = "SizeAnimation";
    L10:
        TwoWayConverter<Size, AnimationVector2D> r5 = VectorConvertersKt.getVectorConverter(Size.Companion);
        int $changed$iv = ((($changed & 14) | (($changed << 3) & 896)) | (($changed << 3) & 7168)) | (($changed << 3) & 57344);
        String label$iv = label2;
        ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
        Object initialValue$iv = r21.invoke(r18.getCurrentState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        Object targetValue$iv = r21.invoke(r18.getTargetState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        int r3 = ($changed$iv << 9) & 57344;
        State<Size> r8 = createTransitionAnimation(r18, initialValue$iv, targetValue$iv, r10.invoke(r18.getSegment(), $composer, Integer.valueOf(($changed$iv >> 3) & 112)), r5, label$iv, $composer, (r3 | ($changed$iv & 14)) | (($changed$iv << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r8;
    L9:
        label2 = label;
        goto L10
    L5:
        r10 = r19;
        goto L7
    }

    public static final <S> State<IntOffset> animateIntOffset(Transition<S> r18, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<IntOffset>> r19, String label, Function3<? super S, ? super Composer, ? super Integer, IntOffset> r21, Composer $composer, int $changed, int r24) {
        ComposerKt.sourceInformationMarkerStart($composer, 776131825, "CC(animateIntOffset)P(2)2048@88801L82:Transition.kt#pdpnli");
        if ((r24 & 1) == 0) goto L5;
        Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<IntOffset>> r10 = C02031.INSTANCE;
    L7:
        if ((r24 & 2) == 0) goto L9;
        String label2 = "IntOffsetAnimation";
    L10:
        TwoWayConverter<IntOffset, AnimationVector2D> r5 = VectorConvertersKt.getVectorConverter(IntOffset.Companion);
        int $changed$iv = ((($changed & 14) | (($changed << 3) & 896)) | (($changed << 3) & 7168)) | (($changed << 3) & 57344);
        String label$iv = label2;
        ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
        Object initialValue$iv = r21.invoke(r18.getCurrentState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        Object targetValue$iv = r21.invoke(r18.getTargetState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        int r3 = ($changed$iv << 9) & 57344;
        State<IntOffset> r8 = createTransitionAnimation(r18, initialValue$iv, targetValue$iv, r10.invoke(r18.getSegment(), $composer, Integer.valueOf(($changed$iv >> 3) & 112)), r5, label$iv, $composer, (r3 | ($changed$iv & 14)) | (($changed$iv << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r8;
    L9:
        label2 = label;
        goto L10
    L5:
        r10 = r19;
        goto L7
    }

    public static final <S> State<Integer> animateInt(Transition<S> r18, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Integer>> r19, String label, Function3<? super S, ? super Composer, ? super Integer, Integer> r21, Composer $composer, int $changed, int r24) {
        ComposerKt.sourceInformationMarkerStart($composer, 1318902782, "CC(animateInt)P(2)2078@90507L76:Transition.kt#pdpnli");
        if ((r24 & 1) == 0) goto L5;
        Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Integer>> r10 = C02021.INSTANCE;
    L7:
        if ((r24 & 2) == 0) goto L9;
        String label2 = "IntAnimation";
    L10:
        TwoWayConverter<Integer, AnimationVector1D> r5 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
        int $changed$iv = ((($changed & 14) | (($changed << 3) & 896)) | (($changed << 3) & 7168)) | (($changed << 3) & 57344);
        String label$iv = label2;
        ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
        Object initialValue$iv = r21.invoke(r18.getCurrentState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        Object targetValue$iv = r21.invoke(r18.getTargetState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        int r3 = ($changed$iv << 9) & 57344;
        State<Integer> r8 = createTransitionAnimation(r18, initialValue$iv, targetValue$iv, r10.invoke(r18.getSegment(), $composer, Integer.valueOf(($changed$iv >> 3) & 112)), r5, label$iv, $composer, (r3 | ($changed$iv & 14)) | (($changed$iv << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r8;
    L9:
        label2 = label;
        goto L10
    L5:
        r10 = r19;
        goto L7
    }

    public static final <S> State<IntSize> animateIntSize(Transition<S> r18, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<IntSize>> r19, String label, Function3<? super S, ? super Composer, ? super Integer, IntSize> r21, Composer $composer, int $changed, int r24) {
        ComposerKt.sourceInformationMarkerStart($composer, -2104123233, "CC(animateIntSize)P(2)2109@92259L80:Transition.kt#pdpnli");
        if ((r24 & 1) == 0) goto L5;
        Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<IntSize>> r10 = C02041.INSTANCE;
    L7:
        if ((r24 & 2) == 0) goto L9;
        String label2 = "IntSizeAnimation";
    L10:
        TwoWayConverter<IntSize, AnimationVector2D> r5 = VectorConvertersKt.getVectorConverter(IntSize.Companion);
        int $changed$iv = ((($changed & 14) | (($changed << 3) & 896)) | (($changed << 3) & 7168)) | (($changed << 3) & 57344);
        String label$iv = label2;
        ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
        Object initialValue$iv = r21.invoke(r18.getCurrentState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        Object targetValue$iv = r21.invoke(r18.getTargetState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        int r3 = ($changed$iv << 9) & 57344;
        State<IntSize> r8 = createTransitionAnimation(r18, initialValue$iv, targetValue$iv, r10.invoke(r18.getSegment(), $composer, Integer.valueOf(($changed$iv >> 3) & 112)), r5, label$iv, $composer, (r3 | ($changed$iv & 14)) | (($changed$iv << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r8;
    L9:
        label2 = label;
        goto L10
    L5:
        r10 = r19;
        goto L7
    }

    public static final <S> State<Rect> animateRect(Transition<S> r18, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Rect>> r19, String label, Function3<? super S, ? super Composer, ? super Integer, Rect> r21, Composer $composer, int $changed, int r24) {
        ComposerKt.sourceInformationMarkerStart($composer, 1496278239, "CC(animateRect)P(2)2139@93992L77:Transition.kt#pdpnli");
        if ((r24 & 1) == 0) goto L5;
        Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Rect>> r10 = C02061.INSTANCE;
    L7:
        if ((r24 & 2) == 0) goto L9;
        String label2 = "RectAnimation";
    L10:
        TwoWayConverter<Rect, AnimationVector4D> r5 = VectorConvertersKt.getVectorConverter(Rect.Companion);
        int $changed$iv = ((($changed & 14) | (($changed << 3) & 896)) | (($changed << 3) & 7168)) | (($changed << 3) & 57344);
        String label$iv = label2;
        ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
        Object initialValue$iv = r21.invoke(r18.getCurrentState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        Object targetValue$iv = r21.invoke(r18.getTargetState(), $composer, Integer.valueOf(($changed$iv >> 9) & 112));
        int r3 = ($changed$iv << 9) & 57344;
        State<Rect> r8 = createTransitionAnimation(r18, initialValue$iv, targetValue$iv, r10.invoke(r18.getSegment(), $composer, Integer.valueOf(($changed$iv >> 3) & 112)), r5, label$iv, $composer, (r3 | ($changed$iv & 14)) | (($changed$iv << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r8;
    L9:
        label2 = label;
        goto L10
    L5:
        r10 = r19;
        goto L7
    }
}
