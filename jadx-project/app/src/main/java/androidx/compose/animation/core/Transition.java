package androidx.compose.animation.core;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.FloatState;
import androidx.compose.runtime.LongState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\b\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001B!\b\u0011\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u0019\b\u0010\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tB!\b\u0011\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bB/\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ'\u0010S\u001a\u00020#2\u0018\u0010T\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0010R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0002\bUJ\u0019\u0010V\u001a\u00020#2\n\u0010W\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0002\bXJ\u0017\u0010Y\u001a\u00020Z2\u0006\u0010D\u001a\u00028\u0000H\u0001¢\u0006\u0004\b[\u0010\\J\b\u0010]\u001a\u00020\u0012H\u0002J\r\u0010^\u001a\u00020ZH\u0000¢\u0006\u0002\b_J\b\u0010`\u001a\u00020ZH\u0002J\r\u0010a\u001a\u00020ZH\u0000¢\u0006\u0002\bbJ\u001d\u0010c\u001a\u00020Z2\u0006\u0010d\u001a\u00020\u00122\u0006\u0010e\u001a\u00020#H\u0000¢\u0006\u0002\bfJ\u001d\u0010c\u001a\u00020Z2\u0006\u0010g\u001a\u00020\u00122\u0006\u0010h\u001a\u00020iH\u0000¢\u0006\u0002\bfJ\r\u0010j\u001a\u00020ZH\u0000¢\u0006\u0002\bkJ\u0015\u0010l\u001a\u00020Z2\u0006\u0010g\u001a\u00020\u0012H\u0000¢\u0006\u0002\bmJ'\u0010n\u001a\u00020Z2\u0018\u0010o\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030pR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0002\bqJ'\u0010n\u001a\u00020Z2\u0018\u0010T\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0010R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0002\bqJ\u0019\u0010r\u001a\u00020#2\n\u0010W\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0002\bsJ\u0015\u0010t\u001a\u00020Z2\u0006\u0010u\u001a\u00020iH\u0000¢\u0006\u0002\bvJ\u0015\u0010w\u001a\u00020Z2\u0006\u00106\u001a\u00020\u0012H\u0000¢\u0006\u0002\bxJ\u0015\u0010y\u001a\u00020Z2\u0006\u0010z\u001a\u00020{H\u0000¢\u0006\u0002\b|J'\u0010}\u001a\u00020Z2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010D\u001a\u00028\u00002\u0006\u00106\u001a\u00020\u0012H\u0007¢\u0006\u0004\b~\u0010\u007fJ\t\u0010\u0080\u0001\u001a\u00020\u0006H\u0016J\u000f\u0010\u0081\u0001\u001a\u00020ZH\u0000¢\u0006\u0003\b\u0082\u0001J\u0019\u0010\u0083\u0001\u001a\u00020Z2\u0006\u0010D\u001a\u00028\u0000H\u0000¢\u0006\u0005\b\u0084\u0001\u0010GR&\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0010R\b\u0012\u0004\u0012\u00028\u00000\u00000\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00128B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u001b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0010R\b\u0012\u0004\u0012\u00028\u00000\u00000\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#8GX\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b(\u0010'R+\u0010)\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020#8G@AX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b)\u0010'\"\u0004\b*\u0010+R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0015\"\u0004\b2\u0010\u0017R\u0019\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00008\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R$\u00106\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u0010\u0015\"\u0004\b8\u0010\u0017R7\u0010:\u001a\b\u0012\u0004\u0012\u00028\u0000092\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u0000098F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010-\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R+\u0010@\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00128@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010\u0019\u001a\u0004\bA\u0010\u0015\"\u0004\bB\u0010\u0017R+\u0010D\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010-\u001a\u0004\bE\u0010!\"\u0004\bF\u0010GR\u001b\u0010I\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bJ\u0010\u0015R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010M\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u001c8F¢\u0006\u0006\u001a\u0004\bN\u0010\u001eR+\u0010O\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020#8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010-\u001a\u0004\bP\u0010'\"\u0004\bQ\u0010+¨\u0006\u0089\u0001"}, d2 = {"Landroidx/compose/animation/core/Transition;", "S", "", "transitionState", "Landroidx/compose/animation/core/TransitionState;", "label", "", "(Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;)V", "initialState", "(Ljava/lang/Object;Ljava/lang/String;)V", "Landroidx/compose/animation/core/MutableTransitionState;", "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;)V", "parentTransition", "(Landroidx/compose/animation/core/TransitionState;Landroidx/compose/animation/core/Transition;Ljava/lang/String;)V", "_animations", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "<set-?>", "", "_playTimeNanos", "get_playTimeNanos", "()J", "set_playTimeNanos", "(J)V", "_playTimeNanos$delegate", "Landroidx/compose/runtime/MutableLongState;", "_transitions", "animations", "", "getAnimations", "()Ljava/util/List;", "currentState", "getCurrentState", "()Ljava/lang/Object;", "hasInitialValueAnimations", "", "getHasInitialValueAnimations$annotations", "()V", "getHasInitialValueAnimations", "()Z", "isRunning", "isSeeking", "setSeeking$animation_core_release", "(Z)V", "isSeeking$delegate", "Landroidx/compose/runtime/MutableState;", "getLabel", "()Ljava/lang/String;", "lastSeekedTimeNanos", "getLastSeekedTimeNanos$animation_core_release", "setLastSeekedTimeNanos$animation_core_release", "getParentTransition", "()Landroidx/compose/animation/core/Transition;", "value", "playTimeNanos", "getPlayTimeNanos", "setPlayTimeNanos", "Landroidx/compose/animation/core/Transition$Segment;", "segment", "getSegment", "()Landroidx/compose/animation/core/Transition$Segment;", "setSegment", "(Landroidx/compose/animation/core/Transition$Segment;)V", "segment$delegate", "startTimeNanos", "getStartTimeNanos$animation_core_release", "setStartTimeNanos$animation_core_release", "startTimeNanos$delegate", "targetState", "getTargetState", "setTargetState$animation_core_release", "(Ljava/lang/Object;)V", "targetState$delegate", "totalDurationNanos", "getTotalDurationNanos", "totalDurationNanos$delegate", "Landroidx/compose/runtime/State;", "transitions", "getTransitions", "updateChildrenNeeded", "getUpdateChildrenNeeded", "setUpdateChildrenNeeded", "updateChildrenNeeded$delegate", "addAnimation", "animation", "addAnimation$animation_core_release", "addTransition", "transition", "addTransition$animation_core_release", "animateTo", "", "animateTo$animation_core_release", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "calculateTotalDurationNanos", "clearInitialAnimations", "clearInitialAnimations$animation_core_release", "onChildAnimationUpdated", "onDisposed", "onDisposed$animation_core_release", "onFrame", "scaledPlayTimeNanos", "scaleToEnd", "onFrame$animation_core_release", "frameTimeNanos", "durationScale", "", "onTransitionEnd", "onTransitionEnd$animation_core_release", "onTransitionStart", "onTransitionStart$animation_core_release", "removeAnimation", "deferredAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "removeAnimation$animation_core_release", "removeTransition", "removeTransition$animation_core_release", "resetAnimationFraction", "fraction", "resetAnimationFraction$animation_core_release", "seekAnimations", "seekAnimations$animation_core_release", "setInitialAnimations", "animationState", "Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "setInitialAnimations$animation_core_release", "setPlaytimeAfterInitialAndTargetStateEstablished", "seek", "(Ljava/lang/Object;Ljava/lang/Object;J)V", "toString", "updateInitialValues", "updateInitialValues$animation_core_release", "updateTarget", "updateTarget$animation_core_release", "DeferredAnimation", "Segment", "SegmentImpl", "TransitionAnimationState", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Transition<S> {
    public static final int $stable = 0;
    private final SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> _animations;
    private final MutableLongState _playTimeNanos$delegate;
    private final SnapshotStateList<Transition<?>> _transitions;
    private final MutableState isSeeking$delegate;
    private final String label;
    private long lastSeekedTimeNanos;
    private final Transition<?> parentTransition;
    private final MutableState segment$delegate;
    private final MutableLongState startTimeNanos$delegate;
    private final MutableState targetState$delegate;
    private final State totalDurationNanos$delegate;
    private final TransitionState<S> transitionState;
    private final MutableState updateChildrenNeeded$delegate;

    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0002*\u00020\u00032\u00020\u0004:\u0001&B#\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJT\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192#\u0010\u001a\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001d0\u001b¢\u0006\u0002\b\u001e2!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00028\u00010\u001bJ\r\u0010#\u001a\u00020$H\u0000¢\u0006\u0002\b%R{\u0010\r\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u000bR\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\f2.\u0010\n\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u000bR\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "label", "", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;)V", "<set-?>", "Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "Landroidx/compose/animation/core/Transition;", "data", "getData$animation_core_release", "()Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "setData$animation_core_release", "(Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;)V", "data$delegate", "Landroidx/compose/runtime/MutableState;", "getLabel", "()Ljava/lang/String;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "animate", "Landroidx/compose/runtime/State;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "targetValueByState", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "state", "setupSeeking", "", "setupSeeking$animation_core_release", "DeferredAnimationData", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class DeferredAnimation<T, V extends AnimationVector> {
        private final MutableState data$delegate;
        private final String label;
        final /* synthetic */ Transition<S> this$0;
        private final TwoWayConverter<T, V> typeConverter;

        /* JADX INFO: compiled from: Transition.kt */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u0000*\u0004\b\u0003\u0010\u0001*\b\b\u0004\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004Bk\u0012\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0006R\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012#\u0010\b\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u000b0\t¢\u0006\u0002\b\f\u0012!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00028\u00030\t¢\u0006\u0002\u0010\u0011J\u0014\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\nR'\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0006R\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R5\u0010\r\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00028\u00030\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R7\u0010\b\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u000b0\t¢\u0006\u0002\b\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/runtime/State;", "animation", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "Landroidx/compose/animation/core/Transition;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "targetValueByState", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "state", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$TransitionAnimationState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getAnimation", "()Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "getTargetValueByState", "()Lkotlin/jvm/functions/Function1;", "setTargetValueByState", "(Lkotlin/jvm/functions/Function1;)V", "getTransitionSpec", "setTransitionSpec", "value", "getValue", "()Ljava/lang/Object;", "updateAnimationStates", "", "segment", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public final class DeferredAnimationData<T, V extends AnimationVector> implements State<T> {
            private final Transition<S>.TransitionAnimationState<T, V> animation;
            private Function1<? super S, ? extends T> targetValueByState;
            final /* synthetic */ Transition<S>.DeferredAnimation<T, V> this$0;
            private Function1<? super Segment<S>, ? extends FiniteAnimationSpec<T>> transitionSpec;

            public DeferredAnimationData(DeferredAnimation this$0, Transition<S>.TransitionAnimationState<T, V> r2, Function1<? super Segment<S>, ? extends FiniteAnimationSpec<T>> r3, Function1<? super S, ? extends T> r4) {
                this.this$0 = this$0;
                this.animation = r2;
                this.transitionSpec = r3;
                this.targetValueByState = r4;
            }

            public final Transition<S>.TransitionAnimationState<T, V> getAnimation() {
                return this.animation;
            }

            public final Function1<Segment<S>, FiniteAnimationSpec<T>> getTransitionSpec() {
                return this.transitionSpec;
            }

            public final void setTransitionSpec(Function1<? super Segment<S>, ? extends FiniteAnimationSpec<T>> r1) {
                this.transitionSpec = r1;
            }

            public final Function1<S, T> getTargetValueByState() {
                return this.targetValueByState;
            }

            public final void setTargetValueByState(Function1<? super S, ? extends T> r1) {
                this.targetValueByState = r1;
            }

            public final void updateAnimationStates(Segment<S> r5) {
                T r0 = this.targetValueByState.invoke(r5.getTargetState());
                if (this.this$0.this$0.isSeeking() == false) goto L5;
                T r1 = this.targetValueByState.invoke(r5.getInitialState());
                this.animation.updateInitialAndTargetValue$animation_core_release(r1, r0, this.transitionSpec.invoke(r5));
                return;
            L5:
                this.animation.updateTargetValue$animation_core_release(r0, this.transitionSpec.invoke(r5));
            }

            @Override // androidx.compose.runtime.State
            public T getValue() {
                updateAnimationStates(this.this$0.this$0.getSegment());
                return this.animation.getValue();
            }
        }

        public DeferredAnimation(Transition this$0, TwoWayConverter<T, V> r4, String label) {
            this.this$0 = this$0;
            this.typeConverter = r4;
            this.label = label;
            this.data$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        }

        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        public final String getLabel() {
            return this.label;
        }

        public final Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> getData$animation_core_release() {
            State $this$getValue$iv = this.data$delegate;
            return (DeferredAnimationData) $this$getValue$iv.getValue();
        }

        public final void setData$animation_core_release(Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> r4) {
            MutableState $this$setValue$iv = this.data$delegate;
            $this$setValue$iv.setValue(r4);
        }

        public final State<T> animate(Function1<? super Segment<S>, ? extends FiniteAnimationSpec<T>> r8, Function1<? super S, ? extends T> r9) {
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> r0 = getData$animation_core_release();
            if (r0 != null) goto L5;
            r0 = new DeferredAnimationData(this, new TransitionAnimationState(this.this$0, r9.invoke(this.this$0.getCurrentState()), AnimationStateKt.createZeroVectorFrom(this.typeConverter, r9.invoke(this.this$0.getCurrentState())), this.typeConverter, this.label), r8, r9);
            Transition<S> r1 = this.this$0;
            setData$animation_core_release(r0);
            r1.addAnimation$animation_core_release(r0.getAnimation());
        L5:
            Transition<S> r2 = this.this$0;
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> r3 = r0;
            r3.setTargetValueByState(r9);
            r3.setTransitionSpec(r8);
            r3.updateAnimationStates(r2.getSegment());
            return r0;
        }

        public final void setupSeeking$animation_core_release() {
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> r0 = getData$animation_core_release();
            if (r0 == null) goto L6;
            Transition<S> r1 = this.this$0;
            r0.getAnimation().updateInitialAndTargetValue$animation_core_release(r0.getTargetValueByState().invoke(r1.getSegment().getInitialState()), r0.getTargetValueByState().invoke(r1.getSegment().getTargetState()), r0.getTransitionSpec().invoke(r1.getSegment()));
            return;
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001a\u0010\b\u001a\u00020\t*\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0001H\u0096\u0004¢\u0006\u0002\u0010\nR\u0012\u0010\u0003\u001a\u00028\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00028\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/Transition$Segment;", "S", "", "initialState", "getInitialState", "()Ljava/lang/Object;", "targetState", "getTargetState", "isTransitioningTo", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Segment<S> {

        /* JADX INFO: compiled from: Transition.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            public static <S> boolean isTransitioningTo(Segment<S> r1, S r2, S r3) {
                return Segment.access$isTransitioningTo$jd(r1, r2, r3);
            }
        }

        S getInitialState();

        S getTargetState();

        static /* synthetic */ boolean access$isTransitioningTo$jd(Segment $this, Object $receiver, Object targetState) {
            return super.isTransitioningTo($receiver, targetState);
        }

        default boolean isTransitioningTo(S r2, S r3) {
            if (Intrinsics.areEqual(r2, getInitialState()) == true) goto L5;
        L7:
            return false;
        L5:
            if (Intrinsics.areEqual(r3, getTargetState()) == false) goto L7;
            return true;
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0002\u0010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0016\u0010\u0003\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/compose/animation/core/Transition$SegmentImpl;", "S", "Landroidx/compose/animation/core/Transition$Segment;", "initialState", "targetState", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getInitialState", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getTargetState", "equals", "", "other", "", "hashCode", "", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class SegmentImpl<S> implements Segment<S> {
        private final S initialState;
        private final S targetState;

        public SegmentImpl(S r1, S r2) {
            this.initialState = r1;
            this.targetState = r2;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public S getInitialState() {
            return this.initialState;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public S getTargetState() {
            return this.targetState;
        }

        public boolean equals(Object other) {
            if ((other instanceof Segment) == true) goto L5;
        L9:
            return false;
        L5:
            if (Intrinsics.areEqual(getInitialState(), ((Segment) other).getInitialState()) == false) goto L9;
            if (Intrinsics.areEqual(getTargetState(), ((Segment) other).getTargetState()) == false) goto L9;
            return true;
        }

        public int hashCode() {
            S r0 = getInitialState();
            int r1 = 0;
            if (r0 == null) goto L5;
            int r2 = r0.hashCode();
        L6:
            int r3 = r2 * 31;
            S r4 = getTargetState();
            if (r4 == null) goto L10;
            r1 = r4.hashCode();
        L10:
            return r3 + r1;
        L5:
            r2 = 0;
            goto L6
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B3\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00028\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\r\u0010O\u001a\u00020PH\u0000¢\u0006\u0002\bQJ\u001d\u0010R\u001a\u00020P2\u0006\u0010S\u001a\u00020\u001e2\u0006\u0010T\u001a\u00020.H\u0000¢\u0006\u0002\bUJ\r\u0010V\u001a\u00020PH\u0000¢\u0006\u0002\bWJ\u0015\u0010X\u001a\u00020P2\u0006\u0010Y\u001a\u000208H\u0000¢\u0006\u0002\bZJ\u0015\u0010[\u001a\u00020P2\u0006\u0010S\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\\J\u0015\u0010]\u001a\u00020P2\u0006\u0010^\u001a\u00020(H\u0000¢\u0006\u0002\b_J\b\u0010`\u001a\u00020\nH\u0016J!\u0010a\u001a\u00020P2\b\b\u0002\u0010\u0005\u001a\u00028\u00012\b\b\u0002\u0010b\u001a\u00020.H\u0002¢\u0006\u0002\u0010cJ-\u0010d\u001a\u00020P2\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010@\u001a\u00028\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015H\u0000¢\u0006\u0004\be\u0010fJ\r\u0010g\u001a\u00020PH\u0000¢\u0006\u0002\bhJ%\u0010i\u001a\u00020P2\u0006\u0010@\u001a\u00028\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015H\u0000¢\u0006\u0004\bj\u0010kRC\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R7\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00152\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00158F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u001e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010&\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010/\u001a\u00020.2\u0006\u0010\f\u001a\u00020.8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010\u0014\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u000e\u00105\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R+\u00109\u001a\u0002082\u0006\u0010\f\u001a\u0002088@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010@\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010\u0014\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u000e\u0010H\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010I\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u00018V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010\u0014\u001a\u0004\bJ\u0010B\"\u0004\bK\u0010DR\u0010\u0010M\u001a\u00028\u0002X\u0082\u000e¢\u0006\u0004\n\u0002\u0010N¨\u0006l"}, d2 = {"Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/runtime/State;", "initialValue", "initialVelocityVector", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "label", "", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;)V", "<set-?>", "Landroidx/compose/animation/core/TargetBasedAnimation;", "animation", "getAnimation", "()Landroidx/compose/animation/core/TargetBasedAnimation;", "setAnimation", "(Landroidx/compose/animation/core/TargetBasedAnimation;)V", "animation$delegate", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "getAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "setAnimationSpec", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "animationSpec$delegate", "defaultSpring", "Landroidx/compose/animation/core/SpringSpec;", "", "durationNanos", "getDurationNanos$animation_core_release", "()J", "setDurationNanos$animation_core_release", "(J)V", "durationNanos$delegate", "Landroidx/compose/runtime/MutableLongState;", "initialValueAnimation", "initialValueState", "Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "getInitialValueState$animation_core_release", "()Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "setInitialValueState$animation_core_release", "(Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;)V", "interruptionSpec", "", "isFinished", "isFinished$animation_core_release", "()Z", "setFinished$animation_core_release", "(Z)V", "isFinished$delegate", "isSeeking", "getLabel", "()Ljava/lang/String;", "", "resetSnapValue", "getResetSnapValue$animation_core_release", "()F", "setResetSnapValue$animation_core_release", "(F)V", "resetSnapValue$delegate", "Landroidx/compose/runtime/MutableFloatState;", "targetValue", "getTargetValue", "()Ljava/lang/Object;", "setTargetValue", "(Ljava/lang/Object;)V", "targetValue$delegate", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "useOnlyInitialValue", "value", "getValue", "setValue$animation_core_release", "value$delegate", "velocityVector", "Landroidx/compose/animation/core/AnimationVector;", "clearInitialAnimation", "", "clearInitialAnimation$animation_core_release", "onPlayTimeChanged", "playTimeNanos", "scaleToEnd", "onPlayTimeChanged$animation_core_release", "resetAnimation", "resetAnimation$animation_core_release", "resetAnimationValue", "fraction", "resetAnimationValue$animation_core_release", "seekTo", "seekTo$animation_core_release", "setInitialValueAnimation", "animationState", "setInitialValueAnimation$animation_core_release", "toString", "updateAnimation", "isInterrupted", "(Ljava/lang/Object;Z)V", "updateInitialAndTargetValue", "updateInitialAndTargetValue$animation_core_release", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "updateInitialValue", "updateInitialValue$animation_core_release", "updateTargetValue", "updateTargetValue$animation_core_release", "(Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {
        private final MutableState animation$delegate;
        private final MutableState animationSpec$delegate;
        private final SpringSpec<T> defaultSpring;
        private final MutableLongState durationNanos$delegate;
        private TargetBasedAnimation<T, V> initialValueAnimation;
        private SeekableTransitionState.SeekingAnimationState initialValueState;
        private final FiniteAnimationSpec<T> interruptionSpec;
        private final MutableState isFinished$delegate;
        private boolean isSeeking;
        private final String label;
        private final MutableFloatState resetSnapValue$delegate;
        private final MutableState targetValue$delegate;
        final /* synthetic */ Transition<S> this$0;
        private final TwoWayConverter<T, V> typeConverter;
        private boolean useOnlyInitialValue;
        private final MutableState value$delegate;
        private V velocityVector;

        public TransitionAnimationState(Transition this$0, T r12, V r13, TwoWayConverter<T, V> r14, String label) {
            this.this$0 = this$0;
            this.typeConverter = r14;
            this.label = label;
            this.targetValue$delegate = SnapshotStateKt.mutableStateOf$default(r12, null, 2, null);
            this.defaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            this.animationSpec$delegate = SnapshotStateKt.mutableStateOf$default(this.defaultSpring, null, 2, null);
            this.animation$delegate = SnapshotStateKt.mutableStateOf$default(new TargetBasedAnimation(getAnimationSpec(), this.typeConverter, r12, getTargetValue(), r13), null, 2, null);
            this.isFinished$delegate = SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
            this.resetSnapValue$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(-1.0f);
            this.value$delegate = SnapshotStateKt.mutableStateOf$default(r12, null, 2, null);
            this.velocityVector = r13;
            this.durationNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(getAnimation().getDurationNanos());
            Float r15 = VisibilityThresholdsKt.getVisibilityThresholdMap().get(this.typeConverter);
            if (r15 == null) goto L8;
            float it = r15.floatValue();
            V r1 = this.typeConverter.getConvertToVector().invoke(r12);
            int id = 0;
            int r4 = r1.getSize$animation_core_release();
        L5:
            if (id >= r4) goto L7;
            r1.set$animation_core_release(id, it);
            id = id + 1;
            goto L5
        L7:
            Object visibilityThreshold = this.typeConverter.getConvertFromVector().invoke(r1);
        L9:
            this.interruptionSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, visibilityThreshold, 3, null);
            return;
        L8:
            visibilityThreshold = null;
            goto L9
        }

        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        public final String getLabel() {
            return this.label;
        }

        private final T getTargetValue() {
            State $this$getValue$iv = this.targetValue$delegate;
            return $this$getValue$iv.getValue();
        }

        private final void setTargetValue(T r4) {
            MutableState $this$setValue$iv = this.targetValue$delegate;
            $this$setValue$iv.setValue(r4);
        }

        private final void setAnimationSpec(FiniteAnimationSpec<T> r4) {
            MutableState $this$setValue$iv = this.animationSpec$delegate;
            $this$setValue$iv.setValue(r4);
        }

        public final FiniteAnimationSpec<T> getAnimationSpec() {
            State $this$getValue$iv = this.animationSpec$delegate;
            return (FiniteAnimationSpec) $this$getValue$iv.getValue();
        }

        private final void setAnimation(TargetBasedAnimation<T, V> r4) {
            MutableState $this$setValue$iv = this.animation$delegate;
            $this$setValue$iv.setValue(r4);
        }

        public final TargetBasedAnimation<T, V> getAnimation() {
            State $this$getValue$iv = this.animation$delegate;
            return (TargetBasedAnimation) $this$getValue$iv.getValue();
        }

        public final SeekableTransitionState.SeekingAnimationState getInitialValueState$animation_core_release() {
            return this.initialValueState;
        }

        public final void setInitialValueState$animation_core_release(SeekableTransitionState.SeekingAnimationState r1) {
            this.initialValueState = r1;
        }

        public final boolean isFinished$animation_core_release() {
            State $this$getValue$iv = this.isFinished$delegate;
            return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
        }

        public final void setFinished$animation_core_release(boolean r5) {
            MutableState $this$setValue$iv = this.isFinished$delegate;
            $this$setValue$iv.setValue(Boolean.valueOf(r5));
        }

        public final float getResetSnapValue$animation_core_release() {
            FloatState $this$getValue$iv = this.resetSnapValue$delegate;
            return $this$getValue$iv.getFloatValue();
        }

        public final void setResetSnapValue$animation_core_release(float r4) {
            MutableFloatState $this$setValue$iv = this.resetSnapValue$delegate;
            $this$setValue$iv.setFloatValue(r4);
        }

        @Override // androidx.compose.runtime.State
        public T getValue() {
            State $this$getValue$iv = this.value$delegate;
            return $this$getValue$iv.getValue();
        }

        public void setValue$animation_core_release(T r4) {
            MutableState $this$setValue$iv = this.value$delegate;
            $this$setValue$iv.setValue(r4);
        }

        public final long getDurationNanos$animation_core_release() {
            LongState $this$getValue$iv = this.durationNanos$delegate;
            return $this$getValue$iv.getLongValue();
        }

        public final void setDurationNanos$animation_core_release(long r4) {
            MutableLongState $this$setValue$iv = this.durationNanos$delegate;
            $this$setValue$iv.setLongValue(r4);
        }

        public final void onPlayTimeChanged$animation_core_release(long r4, boolean r6) {
            if (r6 == false) goto L4;
            long r0 = getAnimation().getDurationNanos();
        L5:
            setValue$animation_core_release(getAnimation().getValueFromNanos(r0));
            this.velocityVector = (V) getAnimation().getVelocityVectorFromNanos(r0);
            if (getAnimation().isFinishedFromNanos(r0) == false) goto L9;
            setFinished$animation_core_release(true);
            return;
        L9:
            return;
        L4:
            r0 = r4;
            goto L5
        }

        public final void seekTo$animation_core_release(long r3) {
            if (getResetSnapValue$animation_core_release() != (-1.0f)) goto L5;
            boolean r0 = true;
        L6:
            if (r0 == true) goto L8;
            return;
        L8:
            this.isSeeking = true;
            if (Intrinsics.areEqual(getAnimation().getTargetValue(), getAnimation().getInitialValue()) == false) goto L11;
            setValue$animation_core_release(getAnimation().getTargetValue());
            return;
        L11:
            setValue$animation_core_release(getAnimation().getValueFromNanos(r3));
            this.velocityVector = (V) getAnimation().getVelocityVectorFromNanos(r3);
            return;
        L5:
            r0 = false;
            goto L6
        }

        public final void updateInitialValue$animation_core_release() {
            SeekableTransitionState.SeekingAnimationState animState = this.initialValueState;
            if (animState != null) goto L5;
            return;
        L5:
            TargetBasedAnimation<T, V> r1 = this.initialValueAnimation;
            if (r1 != null) goto L8;
            return;
        L8:
            long initialPlayTimeNanos = MathKt.roundToLong(animState.getDurationNanos() * ((double) animState.getValue()));
            T r4 = r1.getValueFromNanos(initialPlayTimeNanos);
            if (this.useOnlyInitialValue == false) goto L11;
            getAnimation().setMutableTargetValue$animation_core_release(r4);
        L11:
            getAnimation().setMutableInitialValue$animation_core_release(r4);
            setDurationNanos$animation_core_release(getAnimation().getDurationNanos());
            if (getResetSnapValue$animation_core_release() != (-2.0f)) goto L14;
            boolean r5 = true;
        L15:
            if (r5 == false) goto L17;
        L20:
            setValue$animation_core_release(r4);
        L22:
            if (initialPlayTimeNanos < animState.getDurationNanos()) goto L24;
            this.initialValueState = null;
            this.initialValueAnimation = null;
            return;
        L24:
            animState.setComplete(false);
            return;
        L17:
            if (this.useOnlyInitialValue == true) goto L20;
            seekTo$animation_core_release(this.this$0.getPlayTimeNanos());
            goto L22
        L14:
            r5 = false;
            goto L15
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ void updateAnimation$default(TransitionAnimationState r0, Object r1, boolean r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r0.getValue();
        L6:
            if ((r3 & 2) == 0) goto L8;
            r2 = false;
        L8:
            r0.updateAnimation(r1, r2);
        }

        private final void updateAnimation(T r14, boolean isInterrupted) {
            TargetBasedAnimation<T, V> r0 = this.initialValueAnimation;
            if (r0 == null) goto L5;
            T r1 = r0.getTargetValue();
        L7:
            if (Intrinsics.areEqual(r1, getTargetValue()) == false) goto L11;
            setAnimation(new TargetBasedAnimation(this.interruptionSpec, this.typeConverter, r14, r14, AnimationVectorsKt.newInstance(this.velocityVector)));
            this.useOnlyInitialValue = true;
            setDurationNanos$animation_core_release(getAnimation().getDurationNanos());
            return;
        L11:
            if (isInterrupted == true) goto L13;
        L18:
            FiniteAnimationSpec<T> r15 = getAnimationSpec();
        L20:
            if (this.this$0.getPlayTimeNanos() > 0) goto L22;
            AnimationSpec spec = r15;
        L23:
            setAnimation(new TargetBasedAnimation(spec, this.typeConverter, r14, getTargetValue(), this.velocityVector));
            setDurationNanos$animation_core_release(getAnimation().getDurationNanos());
            this.useOnlyInitialValue = false;
            Transition.access$onChildAnimationUpdated(this.this$0);
            return;
        L22:
            spec = AnimationSpecKt.delayed(r15, this.this$0.getPlayTimeNanos());
            goto L23
        L13:
            if (this.isSeeking == true) goto L18;
            if ((getAnimationSpec() instanceof SpringSpec) == false) goto L17;
            r15 = getAnimationSpec();
            goto L20
        L17:
            r15 = this.interruptionSpec;
            goto L20
        L5:
            r1 = null;
            goto L7
        }

        public final void resetAnimation$animation_core_release() {
            setResetSnapValue$animation_core_release(-2.0f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void resetAnimationValue$animation_core_release(float fraction) {
            boolean r2 = true;
            if (fraction != (-4.0f)) goto L5;
            boolean r1 = true;
        L6:
            if (r1 == false) goto L8;
        L14:
            TargetBasedAnimation<T, V> r3 = this.initialValueAnimation;
            if (r3 == null) goto L18;
            getAnimation().setMutableInitialValue$animation_core_release(r3.getTargetValue());
            this.initialValueState = null;
            this.initialValueAnimation = null;
        L18:
            if (fraction == (-4.0f)) goto L21;
            r2 = false;
        L21:
            if (r2 == false) goto L23;
            Object animationValue = getAnimation().getInitialValue();
        L24:
            getAnimation().setMutableInitialValue$animation_core_release(animationValue);
            getAnimation().setMutableTargetValue$animation_core_release(animationValue);
            setValue$animation_core_release(animationValue);
            setDurationNanos$animation_core_release(getAnimation().getDurationNanos());
            return;
        L23:
            animationValue = getAnimation().getTargetValue();
            goto L24
        L8:
            if (fraction != (-5.0f)) goto L10;
            boolean r4 = true;
        L11:
            if (r4 == true) goto L14;
            setResetSnapValue$animation_core_release(fraction);
            return;
        L10:
            r4 = false;
            goto L11
        L5:
            r1 = false;
            goto L6
        }

        public final void setInitialValueAnimation$animation_core_release(SeekableTransitionState.SeekingAnimationState animationState) {
            if (Intrinsics.areEqual(getAnimation().getTargetValue(), getAnimation().getInitialValue()) == true) goto L5;
            this.initialValueAnimation = getAnimation();
            this.initialValueState = animationState;
        L5:
            setAnimation(new TargetBasedAnimation(this.interruptionSpec, this.typeConverter, getValue(), getValue(), AnimationVectorsKt.newInstance(this.velocityVector)));
            setDurationNanos$animation_core_release(getAnimation().getDurationNanos());
            this.useOnlyInitialValue = true;
        }

        public final void clearInitialAnimation$animation_core_release() {
            this.initialValueAnimation = null;
            this.initialValueState = null;
            this.useOnlyInitialValue = false;
        }

        public String toString() {
            return "current value: " + getValue() + ", target: " + getTargetValue() + ", spec: " + getAnimationSpec();
        }

        public final void updateTargetValue$animation_core_release(T r9, FiniteAnimationSpec<T> r10) {
            if (this.useOnlyInitialValue == false) goto L11;
            TargetBasedAnimation<T, V> r0 = this.initialValueAnimation;
            if (r0 == null) goto L7;
            T r1 = r0.getTargetValue();
        L9:
            if (Intrinsics.areEqual(r9, r1) == false) goto L11;
            return;
        L7:
            r1 = null;
        L11:
            boolean r2 = true;
            if (Intrinsics.areEqual(getTargetValue(), r9) == true) goto L14;
        L19:
            setTargetValue(r9);
            setAnimationSpec(r10);
            if (getResetSnapValue$animation_core_release() != (-3.0f)) goto L22;
            boolean r3 = true;
        L23:
            if (r3 == false) goto L25;
            T r4 = r9;
        L26:
            updateAnimation(r4, !isFinished$animation_core_release());
            if (getResetSnapValue$animation_core_release() != (-3.0f)) goto L29;
            boolean r5 = true;
        L30:
            setFinished$animation_core_release(r5);
            if (getResetSnapValue$animation_core_release() < 0.0f) goto L34;
            long duration = getAnimation().getDurationNanos();
            setValue$animation_core_release(getAnimation().getValueFromNanos((long) (duration * getResetSnapValue$animation_core_release())));
        L39:
            this.useOnlyInitialValue = false;
            setResetSnapValue$animation_core_release(-1.0f);
            return;
        L34:
            if (getResetSnapValue$animation_core_release() == (-3.0f)) goto L37;
            r2 = false;
        L37:
            if (r2 == false) goto L39;
            setValue$animation_core_release(r9);
            goto L39
        L29:
            r5 = false;
            goto L30
        L25:
            r4 = getValue();
            goto L26
        L22:
            r3 = false;
            goto L23
        L14:
            if (getResetSnapValue$animation_core_release() != (-1.0f)) goto L16;
            boolean r6 = true;
        L17:
            if (r6 == false) goto L19;
            return;
        L16:
            r6 = false;
            goto L17
        }

        public final void updateInitialAndTargetValue$animation_core_release(T r4, T r5, FiniteAnimationSpec<T> r6) {
            setTargetValue(r5);
            setAnimationSpec(r6);
            if (Intrinsics.areEqual(getAnimation().getInitialValue(), r4) == true) goto L5;
        L7:
            updateAnimation$default(this, r4, false, 2, null);
            return;
        L5:
            if (Intrinsics.areEqual(getAnimation().getTargetValue(), r5) == false) goto L7;
        }
    }

    static {
    }

    public static /* synthetic */ void getHasInitialValueAnimations$annotations() {
    }

    public Transition(TransitionState<S> r6, Transition<?> r7, String label) {
        this.transitionState = r6;
        this.parentTransition = r7;
        this.label = label;
        this.targetState$delegate = SnapshotStateKt.mutableStateOf$default(getCurrentState(), null, 2, null);
        this.segment$delegate = SnapshotStateKt.mutableStateOf$default(new SegmentImpl(getCurrentState(), getCurrentState()), null, 2, null);
        this._playTimeNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(0);
        this.startTimeNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(Long.MIN_VALUE);
        this.updateChildrenNeeded$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this._animations = SnapshotStateKt.mutableStateListOf();
        this._transitions = SnapshotStateKt.mutableStateListOf();
        this.isSeeking$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.totalDurationNanos$delegate = SnapshotStateKt.derivedStateOf(new Transition$totalDurationNanos$2(this));
        this.transitionState.transitionConfigured$animation_core_release(this);
    }

    public static final /* synthetic */ long access$calculateTotalDurationNanos(Transition $this) {
        return $this.calculateTotalDurationNanos();
    }

    public static final /* synthetic */ void access$onChildAnimationUpdated(Transition $this) {
        $this.onChildAnimationUpdated();
    }

    public /* synthetic */ Transition(TransitionState r1, Transition r2, String r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = null;
    L5:
        this(r1, r2, r3);
    }

    public final Transition<?> getParentTransition() {
        return this.parentTransition;
    }

    public final String getLabel() {
        return this.label;
    }

    public /* synthetic */ Transition(TransitionState r1, String r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        this(r1, r2);
    }

    public Transition(TransitionState<S> r2, String label) {
        this(r2, null, label);
    }

    public Transition(S r3, String label) {
        this(new MutableTransitionState(r3), null, label);
    }

    public /* synthetic */ Transition(MutableTransitionState r1, String r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        this(r1, r2);
    }

    public Transition(MutableTransitionState<S> r3, String label) {
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type androidx.compose.animation.core.TransitionState<S of androidx.compose.animation.core.Transition>");
        this(r3, null, label);
    }

    public final S getCurrentState() {
        return this.transitionState.getCurrentState();
    }

    public final S getTargetState() {
        return (S) this.targetState$delegate.getValue();
    }

    public final void setTargetState$animation_core_release(S r4) {
        MutableState $this$setValue$iv = this.targetState$delegate;
        $this$setValue$iv.setValue(r4);
    }

    private final void setSegment(Segment<S> r4) {
        MutableState $this$setValue$iv = this.segment$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final Segment<S> getSegment() {
        State $this$getValue$iv = this.segment$delegate;
        return (Segment) $this$getValue$iv.getValue();
    }

    public final boolean isRunning() {
        if (getStartTimeNanos$animation_core_release() == Long.MIN_VALUE) goto L5;
        return true;
    L5:
        return false;
    }

    private final long get_playTimeNanos() {
        LongState $this$getValue$iv = this._playTimeNanos$delegate;
        return $this$getValue$iv.getLongValue();
    }

    private final void set_playTimeNanos(long r4) {
        MutableLongState $this$setValue$iv = this._playTimeNanos$delegate;
        $this$setValue$iv.setLongValue(r4);
    }

    public final long getPlayTimeNanos() {
        Transition<?> r0 = this.parentTransition;
        if (r0 == null) goto L6;
        return r0.getPlayTimeNanos();
    L6:
        return get_playTimeNanos();
    }

    public final void setPlayTimeNanos(long value) {
        if (this.parentTransition != null) goto L6;
        set_playTimeNanos(value);
        return;
    }

    public final long getStartTimeNanos$animation_core_release() {
        LongState $this$getValue$iv = this.startTimeNanos$delegate;
        return $this$getValue$iv.getLongValue();
    }

    public final void setStartTimeNanos$animation_core_release(long r4) {
        MutableLongState $this$setValue$iv = this.startTimeNanos$delegate;
        $this$setValue$iv.setLongValue(r4);
    }

    private final boolean getUpdateChildrenNeeded() {
        State $this$getValue$iv = this.updateChildrenNeeded$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    private final void setUpdateChildrenNeeded(boolean r5) {
        MutableState $this$setValue$iv = this.updateChildrenNeeded$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    public final List<Transition<?>> getTransitions() {
        return this._transitions;
    }

    public final List<Transition<S>.TransitionAnimationState<?, ?>> getAnimations() {
        return this._animations;
    }

    public final boolean isSeeking() {
        State $this$getValue$iv = this.isSeeking$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    public final void setSeeking$animation_core_release(boolean r5) {
        MutableState $this$setValue$iv = this.isSeeking$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    public final long getLastSeekedTimeNanos$animation_core_release() {
        return this.lastSeekedTimeNanos;
    }

    public final void setLastSeekedTimeNanos$animation_core_release(long r1) {
        this.lastSeekedTimeNanos = r1;
    }

    public final boolean getHasInitialValueAnimations() {
        List $this$fastAny$iv = this._animations;
        int index$iv$iv = 0;
        int r5 = $this$fastAny$iv.size();
    L4:
        if (index$iv$iv >= r5) goto L12;
        Object item$iv$iv = $this$fastAny$iv.get(index$iv$iv);
        if (((TransitionAnimationState) item$iv$iv).getInitialValueState$animation_core_release() == null) goto L8;
        boolean r11 = true;
    L9:
        if (r11 == true) goto L10;
        index$iv$iv = index$iv$iv + 1;
        goto L4
    L10:
        boolean r0 = true;
    L13:
        if (r0 == true) goto L23;
        List $this$fastAny$iv2 = this._transitions;
        int index$iv$iv2 = 0;
        int r6 = $this$fastAny$iv2.size();
    L15:
        if (index$iv$iv2 >= r6) goto L20;
        Object item$iv$iv2 = $this$fastAny$iv2.get(index$iv$iv2);
        if (((Transition) item$iv$iv2).getHasInitialValueAnimations() == true) goto L18;
        index$iv$iv2 = index$iv$iv2 + 1;
        goto L15
    L18:
        boolean r1 = true;
    L21:
        if (r1 == true) goto L23;
        return false;
    L20:
        r1 = false;
    L23:
        return true;
    L8:
        r11 = false;
        goto L9
    L12:
        r0 = false;
        goto L13
    }

    public final long getTotalDurationNanos() {
        State $this$getValue$iv = this.totalDurationNanos$delegate;
        return ((Number) $this$getValue$iv.getValue()).longValue();
    }

    private final long calculateTotalDurationNanos() {
        long maxDurationNanos = 0;
        List $this$fastForEach$iv = this._animations;
        int index$iv = 0;
        int r5 = $this$fastForEach$iv.size();
    L3:
        if (index$iv >= r5) goto L5;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        maxDurationNanos = Math.max(maxDurationNanos, ((TransitionAnimationState) item$iv).getDurationNanos$animation_core_release());
        index$iv = index$iv + 1;
        goto L3
    L5:
        List $this$fastForEach$iv2 = this._transitions;
        int index$iv2 = 0;
        int r6 = $this$fastForEach$iv2.size();
    L6:
        if (index$iv2 >= r6) goto L9;
        Object item$iv2 = $this$fastForEach$iv2.get(index$iv2);
        maxDurationNanos = Math.max(maxDurationNanos, ((Transition) item$iv2).calculateTotalDurationNanos());
        index$iv2 = index$iv2 + 1;
        goto L6
    L9:
        return maxDurationNanos;
    }

    public final void onFrame$animation_core_release(long frameTimeNanos, float durationScale) {
        if (getStartTimeNanos$animation_core_release() != Long.MIN_VALUE) goto L5;
        onTransitionStart$animation_core_release(frameTimeNanos);
    L5:
        long deltaT = frameTimeNanos - getStartTimeNanos$animation_core_release();
        boolean r4 = true;
        if (durationScale != 0.0f) goto L8;
        boolean r3 = true;
    L9:
        if (r3 == false) goto L11;
        long scaledPlayTimeNanos = deltaT;
    L12:
        setPlayTimeNanos(scaledPlayTimeNanos);
        if (durationScale == 0.0f) goto L16;
        r4 = false;
    L16:
        onFrame$animation_core_release(scaledPlayTimeNanos, r4);
        return;
    L11:
        scaledPlayTimeNanos = MathKt.roundToLong(deltaT / ((double) durationScale));
        goto L12
    L8:
        r3 = false;
        goto L9
    }

    public final void onFrame$animation_core_release(long scaledPlayTimeNanos, boolean scaleToEnd) {
        if (getStartTimeNanos$animation_core_release() != Long.MIN_VALUE) goto L6;
        onTransitionStart$animation_core_release(scaledPlayTimeNanos);
    L8:
        setUpdateChildrenNeeded(false);
        boolean allFinished = true;
        List $this$fastForEach$iv = this._animations;
        int index$iv = 0;
        int r4 = $this$fastForEach$iv.size();
    L9:
        if (index$iv >= r4) goto L17;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        Transition<S>.TransitionAnimationState<?, ?> r6 = (TransitionAnimationState) item$iv;
        if (r6.isFinished$animation_core_release() == true) goto L14;
        r6.onPlayTimeChanged$animation_core_release(scaledPlayTimeNanos, scaleToEnd);
    L14:
        if (r6.isFinished$animation_core_release() == true) goto L16;
        allFinished = false;
    L16:
        index$iv = index$iv + 1;
        goto L9
    L17:
        List $this$fastForEach$iv2 = this._transitions;
        int index$iv2 = 0;
        int r5 = $this$fastForEach$iv2.size();
    L18:
        if (index$iv2 >= r5) goto L27;
        Object item$iv2 = $this$fastForEach$iv2.get(index$iv2);
        Transition<?> r7 = (Transition) item$iv2;
        if (Intrinsics.areEqual(r7.getTargetState(), r7.getCurrentState()) == true) goto L23;
        r7.onFrame$animation_core_release(scaledPlayTimeNanos, scaleToEnd);
    L23:
        if (Intrinsics.areEqual(r7.getTargetState(), r7.getCurrentState()) == true) goto L25;
        allFinished = false;
    L25:
        index$iv2 = index$iv2 + 1;
        goto L18
    L27:
        if (allFinished == false) goto L36;
        onTransitionEnd$animation_core_release();
        return;
    L36:
        return;
    L6:
        if (this.transitionState.isRunning$animation_core_release() == true) goto L8;
        this.transitionState.setRunning$animation_core_release(true);
        goto L8
    }

    public final void onTransitionStart$animation_core_release(long frameTimeNanos) {
        setStartTimeNanos$animation_core_release(frameTimeNanos);
        this.transitionState.setRunning$animation_core_release(true);
    }

    public final void onDisposed$animation_core_release() {
        onTransitionEnd$animation_core_release();
        this.transitionState.transitionRemoved$animation_core_release();
    }

    public final void onTransitionEnd$animation_core_release() {
        setStartTimeNanos$animation_core_release(Long.MIN_VALUE);
        if ((this.transitionState instanceof MutableTransitionState) == false) goto L5;
        this.transitionState.setCurrentState$animation_core_release(getTargetState());
    L5:
        setPlayTimeNanos(0);
        this.transitionState.setRunning$animation_core_release(false);
        List $this$fastForEach$iv = this._transitions;
        int index$iv = 0;
        int r3 = $this$fastForEach$iv.size();
    L6:
        if (index$iv >= r3) goto L9;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        ((Transition) item$iv).onTransitionEnd$animation_core_release();
        index$iv = index$iv + 1;
        goto L6
    }

    public final void seek(S r12, S r13, long playTimeNanos) {
        setStartTimeNanos$animation_core_release(Long.MIN_VALUE);
        this.transitionState.setRunning$animation_core_release(false);
        if (isSeeking() == false) goto L9;
        if (Intrinsics.areEqual(getCurrentState(), r12) == false) goto L9;
        if (Intrinsics.areEqual(getTargetState(), r13) == false) goto L9;
    L14:
        List $this$fastForEach$iv = this._transitions;
        int index$iv = 0;
        int r3 = $this$fastForEach$iv.size();
    L15:
        if (index$iv >= r3) goto L20;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        Transition<?> r5 = (Transition) item$iv;
        Intrinsics.checkNotNull(r5, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
        if (r5.isSeeking() == false) goto L19;
        r5.seek(r5.getCurrentState(), r5.getTargetState(), playTimeNanos);
    L19:
        index$iv = index$iv + 1;
        goto L15
    L20:
        List $this$fastForEach$iv2 = this._animations;
        int index$iv2 = 0;
        int r4 = $this$fastForEach$iv2.size();
    L21:
        if (index$iv2 >= r4) goto L23;
        Object item$iv2 = $this$fastForEach$iv2.get(index$iv2);
        ((TransitionAnimationState) item$iv2).seekTo$animation_core_release(playTimeNanos);
        index$iv2 = index$iv2 + 1;
        goto L21
    L23:
        this.lastSeekedTimeNanos = playTimeNanos;
        return;
    L9:
        if (Intrinsics.areEqual(getCurrentState(), r12) == false) goto L11;
    L13:
        setTargetState$animation_core_release(r13);
        setSeeking$animation_core_release(true);
        setSegment(new SegmentImpl(r12, r13));
        goto L14
    L11:
        if ((this.transitionState instanceof MutableTransitionState) == false) goto L13;
        this.transitionState.setCurrentState$animation_core_release(r12);
        goto L13
    }

    public final boolean addTransition$animation_core_release(Transition<?> r2) {
        return this._transitions.add(r2);
    }

    public final boolean removeTransition$animation_core_release(Transition<?> r2) {
        return this._transitions.remove(r2);
    }

    public final boolean addAnimation$animation_core_release(Transition<S>.TransitionAnimationState<?, ?> r2) {
        return this._animations.add(r2);
    }

    public final void removeAnimation$animation_core_release(Transition<S>.TransitionAnimationState<?, ?> r2) {
        this._animations.remove(r2);
    }

    public final void updateTarget$animation_core_release(S r8) {
        if (Intrinsics.areEqual(getTargetState(), r8) == true) goto L14;
        setSegment(new SegmentImpl(getTargetState(), r8));
        if (Intrinsics.areEqual(getCurrentState(), getTargetState()) == true) goto L7;
        this.transitionState.setCurrentState$animation_core_release(getTargetState());
    L7:
        setTargetState$animation_core_release(r8);
        if (isRunning() == true) goto L10;
        setUpdateChildrenNeeded(true);
    L10:
        List $this$fastForEach$iv = this._animations;
        int index$iv = 0;
        int r3 = $this$fastForEach$iv.size();
    L11:
        if (index$iv >= r3) goto L16;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        ((TransitionAnimationState) item$iv).resetAnimation$animation_core_release();
        index$iv = index$iv + 1;
        goto L11
    L16:
        return;
    }

    public final void animateTo$animation_core_release(final S r18, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1493585151);
        ComposerKt.sourceInformation($composer2, "C(animateTo):Transition.kt#pdpnli");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L13;
        if (($changed & 8) != 0) goto L7;
        boolean r6 = $composer2.changed(r18);
    L8:
        if (r6 == false) goto L10;
        int r7 = 4;
    L11:
        $dirty = $dirty | r7;
        goto L13
    L10:
        r7 = 2;
        goto L11
    L7:
        r6 = $composer2.changedInstance(r18);
    L13:
        if (($changed & 48) != 0) goto L20;
        if ($composer2.changed(this) == false) goto L17;
        int r8 = 32;
    L18:
        $dirty = $dirty | r8;
        goto L20
    L17:
        r8 = 16;
    L20:
        if (($dirty & 19) == 18) goto L22;
        boolean r9 = true;
    L24:
        if ($composer2.shouldExecute(r9, $dirty & 1) == true) goto L26;
        $composer2.skipToGroupEnd();
    L60:
        ScopeUpdateScope r3 = $composer2.endRestartGroup();
        if (r3 == null) goto L64;
        r3.updateScope(new Transition$animateTo$2(this, r18, $changed));
        return;
    L64:
        return;
    L26:
        if (ComposerKt.isTraceInProgress() == false) goto L29;
        ComposerKt.traceEventStart(-1493585151, $dirty, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1176)");
    L29:
        if (isSeeking() == true) goto L55;
        $composer2.startReplaceGroup(1822801203);
        ComposerKt.sourceInformation($composer2, "");
        updateTarget$animation_core_release(r18);
        if (Intrinsics.areEqual(r18, getCurrentState()) == true) goto L33;
    L38:
        $composer2.startReplaceGroup(1823032494);
        ComposerKt.sourceInformation($composer2, "1184@50127L24,1185@50207L1011,1185@50168L1050");
        ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart($composer2, -954203484, "CC(remember):Effects.kt#9igjgp");
        Object it$iv$iv = $composer2.rememberedValue();
        if (it$iv$iv != Composer.Companion.getEmpty()) goto L42;
        Object value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2);
        $composer2.updateRememberedValue(value$iv$iv);
        it$iv$iv = value$iv$iv;
    L42:
        final CoroutineScope coroutineScope = (CoroutineScope) it$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 335910458, "CC(remember):Transition.kt#9igjgp");
        boolean r4 = $composer2.changedInstance(coroutineScope);
        if (($dirty & 112) != 32) goto L45;
        boolean r10 = true;
    L46:
        boolean invalid$iv = r4 | r10;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L49;
    L52:
        Object value$iv = (Function1) new Transition$animateTo$1$1(coroutineScope, this);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L53:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.DisposableEffect(coroutineScope, this, (Function1) it$iv, $composer2, $dirty & 112);
        $composer2.endReplaceGroup();
    L54:
        $composer2.endReplaceGroup();
    L57:
        if (ComposerKt.isTraceInProgress() == false) goto L60;
        ComposerKt.traceEventEnd();
        goto L60
    L49:
        if (it$iv != Composer.Companion.getEmpty()) goto L53;
    L45:
        r10 = false;
        goto L46
    L33:
        if (isRunning() == true) goto L38;
        if (getUpdateChildrenNeeded() == true) goto L38;
        $composer2.startReplaceGroup(1824275067);
        $composer2.endReplaceGroup();
        goto L54
    L55:
        $composer2.startReplaceGroup(1824284987);
        $composer2.endReplaceGroup();
        goto L57
    L22:
        r9 = false;
        goto L24
    }

    public final void seekAnimations$animation_core_release(long playTimeNanos) {
        if (getStartTimeNanos$animation_core_release() != Long.MIN_VALUE) goto L5;
        setStartTimeNanos$animation_core_release(playTimeNanos);
    L5:
        setPlayTimeNanos(playTimeNanos);
        setUpdateChildrenNeeded(false);
        List $this$fastForEach$iv = this._animations;
        int index$iv = 0;
        int r3 = $this$fastForEach$iv.size();
    L6:
        if (index$iv >= r3) goto L8;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        ((TransitionAnimationState) item$iv).seekTo$animation_core_release(playTimeNanos);
        index$iv = index$iv + 1;
        goto L6
    L8:
        List $this$fastForEach$iv2 = this._transitions;
        int index$iv2 = 0;
        int r4 = $this$fastForEach$iv2.size();
    L9:
        if (index$iv2 >= r4) goto L15;
        Object item$iv2 = $this$fastForEach$iv2.get(index$iv2);
        Transition<?> r5 = (Transition) item$iv2;
        if (Intrinsics.areEqual(r5.getTargetState(), r5.getCurrentState()) == true) goto L13;
        r5.seekAnimations$animation_core_release(playTimeNanos);
    L13:
        index$iv2 = index$iv2 + 1;
        goto L9
    }

    public final void setInitialAnimations$animation_core_release(SeekableTransitionState.SeekingAnimationState animationState) {
        List $this$fastForEach$iv = this._animations;
        int index$iv = 0;
        int r3 = $this$fastForEach$iv.size();
    L3:
        if (index$iv >= r3) goto L5;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        ((TransitionAnimationState) item$iv).setInitialValueAnimation$animation_core_release(animationState);
        index$iv = index$iv + 1;
        goto L3
    L5:
        List $this$fastForEach$iv2 = this._transitions;
        int index$iv2 = 0;
        int r4 = $this$fastForEach$iv2.size();
    L6:
        if (index$iv2 >= r4) goto L9;
        Object item$iv2 = $this$fastForEach$iv2.get(index$iv2);
        ((Transition) item$iv2).setInitialAnimations$animation_core_release(animationState);
        index$iv2 = index$iv2 + 1;
        goto L6
    }

    public final void resetAnimationFraction$animation_core_release(float fraction) {
        List $this$fastForEach$iv = this._animations;
        int index$iv = 0;
        int r3 = $this$fastForEach$iv.size();
    L3:
        if (index$iv >= r3) goto L5;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        ((TransitionAnimationState) item$iv).resetAnimationValue$animation_core_release(fraction);
        index$iv = index$iv + 1;
        goto L3
    L5:
        List $this$fastForEach$iv2 = this._transitions;
        int index$iv2 = 0;
        int r4 = $this$fastForEach$iv2.size();
    L6:
        if (index$iv2 >= r4) goto L9;
        Object item$iv2 = $this$fastForEach$iv2.get(index$iv2);
        ((Transition) item$iv2).resetAnimationFraction$animation_core_release(fraction);
        index$iv2 = index$iv2 + 1;
        goto L6
    }

    public final void clearInitialAnimations$animation_core_release() {
        List $this$fastForEach$iv = this._animations;
        int index$iv = 0;
        int r3 = $this$fastForEach$iv.size();
    L3:
        if (index$iv >= r3) goto L5;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        ((TransitionAnimationState) item$iv).clearInitialAnimation$animation_core_release();
        index$iv = index$iv + 1;
        goto L3
    L5:
        List $this$fastForEach$iv2 = this._transitions;
        int index$iv2 = 0;
        int r4 = $this$fastForEach$iv2.size();
    L6:
        if (index$iv2 >= r4) goto L9;
        Object item$iv2 = $this$fastForEach$iv2.get(index$iv2);
        ((Transition) item$iv2).clearInitialAnimations$animation_core_release();
        index$iv2 = index$iv2 + 1;
        goto L6
    }

    public final void updateInitialValues$animation_core_release() {
        List $this$fastForEach$iv = this._animations;
        int index$iv = 0;
        int r3 = $this$fastForEach$iv.size();
    L3:
        if (index$iv >= r3) goto L5;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        ((TransitionAnimationState) item$iv).updateInitialValue$animation_core_release();
        index$iv = index$iv + 1;
        goto L3
    L5:
        List $this$fastForEach$iv2 = this._transitions;
        int index$iv2 = 0;
        int r4 = $this$fastForEach$iv2.size();
    L6:
        if (index$iv2 >= r4) goto L9;
        Object item$iv2 = $this$fastForEach$iv2.get(index$iv2);
        ((Transition) item$iv2).updateInitialValues$animation_core_release();
        index$iv2 = index$iv2 + 1;
        goto L6
    }

    public String toString() {
        List<Transition<S>.TransitionAnimationState<?, ?>> r0 = getAnimations();
        String r3 = "Transition animation values: ";
        int index$iv$iv = 0;
        int r7 = r0.size();
    L3:
        if (index$iv$iv >= r7) goto L6;
        Object item$iv$iv = r0.get(index$iv$iv);
        String acc = r3;
        StringBuilder r14 = new StringBuilder().append(acc);
        r3 = r14.append((TransitionAnimationState) item$iv$iv).append(", ").toString();
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L6:
        return r3;
    }

    private final void onChildAnimationUpdated() {
        setUpdateChildrenNeeded(true);
        if (isSeeking() == false) goto L10;
        long maxDurationNanos = 0;
        List $this$fastForEach$iv = this._animations;
        int index$iv = 0;
        int r5 = $this$fastForEach$iv.size();
    L5:
        if (index$iv >= r5) goto L7;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        Transition<S>.TransitionAnimationState<?, ?> r7 = (TransitionAnimationState) item$iv;
        maxDurationNanos = Math.max(maxDurationNanos, r7.getDurationNanos$animation_core_release());
        r7.seekTo$animation_core_release(this.lastSeekedTimeNanos);
        index$iv = index$iv + 1;
        goto L5
    L7:
        setUpdateChildrenNeeded(false);
        return;
    }

    public final void removeAnimation$animation_core_release(Transition<S>.DeferredAnimation<?, ?> r3) {
        Transition<S>.DeferredAnimationData<?, ?>.DeferredAnimationData<?, V> r0 = r3.getData$animation_core_release();
        if (r0 == 0) goto L8;
        Transition<S>.TransitionAnimationState<?, ?> r1 = r0.getAnimation();
        if (r1 == null) goto L9;
        removeAnimation$animation_core_release(r1);
        return;
    L9:
        return;
    }
}
