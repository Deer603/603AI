package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\u001aM\u0010\u0014\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u00182!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u000f0\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001eH\u0002\u001a\u0093\u0001\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0018\"\u0004\b\u0000\u0010\u00162\u0006\u0010 \u001a\u0002H\u00162!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u000f0\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112#\b\u0002\u0010$\u001a\u001d\u0012\u0013\u0012\u0011H\u0016¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0002\u0010&\u001a¡\u0001\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0018\"\u0004\b\u0000\u0010\u00162\u0006\u0010 \u001a\u0002H\u00162\f\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00160(2!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u000f0\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112#\b\u0002\u0010$\u001a\u001d\u0012\u0013\u0012\u0011H\u0016¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0002\u0010)\u001a5\u0010*\u001a\b\u0012\u0004\u0012\u0002H\u00160(\"\b\b\u0000\u0010\u0016*\u00020+2\u001d\u0010,\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160-\u0012\u0004\u0012\u00020.0\u0001¢\u0006\u0002\b/\u001aU\u00100\u001a\u000201\"\u0004\b\u0000\u0010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u00182\u0006\u00102\u001a\u0002032!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u000f0\u00012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\"H\u0000\u001a\u0017\u00104\u001a\u00020.2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\n0\u001eH\u0082\b\u001a\u0014\u00106\u001a\b\u0012\u0004\u0012\u0002H\u001607\"\u0004\b\u0000\u0010\u0016H\u0002\u001aF\u00108\u001a\u00020.\"\u0004\b\u0000\u001092\f\u0010:\u001a\b\u0012\u0004\u0012\u0002H90\u001e2\"\u0010;\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H9\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0=\u0012\u0006\u0012\u0004\u0018\u00010+0<H\u0082@¢\u0006\u0002\u0010>\u001aT\u0010?\u001a\u00020@\"\u0004\b\u0000\u0010\u0016*\u00020@2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u00182\u0006\u0010A\u001a\u00020B2\b\b\u0002\u0010C\u001a\u00020\u00032\n\b\u0002\u0010D\u001a\u0004\u0018\u00010E2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010I\u001a`\u0010?\u001a\u00020@\"\u0004\b\u0000\u0010\u0016*\u00020@2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u00182\u0006\u0010A\u001a\u00020B2\b\b\u0002\u0010C\u001a\u00020\u00032\n\b\u0002\u0010D\u001a\u0004\u0018\u00010E2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G2\b\b\u0002\u0010J\u001a\u00020\u00032\n\b\u0002\u0010H\u001a\u0004\u0018\u00010IH\u0007\u001a\\\u0010?\u001a\u00020@\"\u0004\b\u0000\u0010\u0016*\u00020@2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u00182\u0006\u0010K\u001a\u00020\u00032\u0006\u0010A\u001a\u00020B2\b\b\u0002\u0010C\u001a\u00020\u00032\n\b\u0002\u0010D\u001a\u0004\u0018\u00010E2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010I\u001ah\u0010?\u001a\u00020@\"\u0004\b\u0000\u0010\u0016*\u00020@2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u00182\u0006\u0010K\u001a\u00020\u00032\u0006\u0010A\u001a\u00020B2\b\b\u0002\u0010C\u001a\u00020\u00032\n\b\u0002\u0010D\u001a\u0004\u0018\u00010E2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G2\b\b\u0002\u0010J\u001a\u00020\u00032\n\b\u0002\u0010H\u001a\u0004\u0018\u00010IH\u0007\u001a6\u0010L\u001a\u00020.\"\u0004\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u0002H\u00160\u00182\u0006\u0010M\u001a\u0002H\u00162\u000e\b\u0002\u0010N\u001a\b\u0012\u0004\u0012\u00020\u000f0\"H\u0086@¢\u0006\u0002\u0010O\u001aR\u0010L\u001a\u00020.\"\u0004\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u0002H\u00160\u00182\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020R2\f\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00160(2\u0006\u0010S\u001a\u0002H\u00162\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\"H\u0082@¢\u0006\u0002\u0010T\u001aN\u0010U\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u0002H\u00160\u00182\u0006\u0010M\u001a\u0002H\u00162\u0006\u0010P\u001a\u00020\u000f2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\"2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0086@¢\u0006\u0002\u0010V\u001a\u0014\u0010W\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010X\u001a\u00020\u000fH\u0002\u001a^\u0010Y\u001a\u0002H\u0016\"\u0004\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u0002H\u00160(2\u0006\u0010Z\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020\u000f2!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u000f0\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001eH\u0002¢\u0006\u0002\u0010[\u001aQ\u0010\\\u001a\u00020.\"\u0004\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u0002H\u00160(26\u0010;\u001a2\u0012\u0013\u0012\u0011H\u0016¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(]\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(^\u0012\u0004\u0012\u00020.0<H\u0086\b\u001a&\u0010_\u001a\u00020.\"\u0004\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u0002H\u00160\u00182\u0006\u0010M\u001a\u0002H\u0016H\u0086@¢\u0006\u0002\u0010`\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\"\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006a"}, d2 = {"AlwaysDrag", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "AnchoredDraggableMinFlingVelocity", "Landroidx/compose/ui/unit/Dp;", "getAnchoredDraggableMinFlingVelocity", "()F", "F", "ConfigurationMovedToModifier", "", "ConfirmValueChangeDeprecated", "DEBUG", "GetOrNan", "", "", "NoOpDecayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "SettleWithVelocityDeprecated", "StartDragImmediatelyDeprecated", "AnchoredDraggableLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "T", "state", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "positionalThreshold", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "totalDistance", "velocityThreshold", "Lkotlin/Function0;", "AnchoredDraggableState", "initialValue", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "decayAnimationSpec", "confirmValueChange", "newValue", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "anchors", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "(Ljava/lang/Object;Landroidx/compose/foundation/gestures/DraggableAnchors;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "DraggableAnchors", "", "builder", "Landroidx/compose/foundation/gestures/DraggableAnchorsConfig;", "", "Lkotlin/ExtensionFunctionType;", "anchoredDraggableFlingBehavior", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "density", "Landroidx/compose/ui/unit/Density;", "debugLog", "generateMsg", "emptyDraggableAnchors", "Landroidx/compose/foundation/gestures/DefaultDraggableAnchors;", "restartable", "I", "inputs", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "anchoredDraggable", "Landroidx/compose/ui/Modifier;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "startDragImmediately", "reverseDirection", "animateTo", "targetValue", "animationSpec", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "velocity", "anchoredDragScope", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "latestTarget", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;FLandroidx/compose/foundation/gestures/AnchoredDragScope;Landroidx/compose/foundation/gestures/DraggableAnchors;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToWithDecay", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Ljava/lang/Object;FLandroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coerceToTarget", "target", "computeTarget", "currentOffset", "(Landroidx/compose/foundation/gestures/DraggableAnchors;FFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "forEach", "key", "position", "snapTo", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AnchoredDraggableKt {
    private static final Function1<PointerInputChange, Boolean> AlwaysDrag = null;
    private static final float AnchoredDraggableMinFlingVelocity = 0.0f;
    private static final String ConfigurationMovedToModifier = "This constructor of AnchoredDraggableState has been deprecated. Please pass thresholds and animation specs to anchoredDraggableFlingBehavior(..) instead, which can be passed to Modifier.anchoredDraggable.";
    private static final String ConfirmValueChangeDeprecated = "confirmValueChange is deprecated without replacement. Rather than relying on a callback to veto state changes, the anchor set should not include disallowed anchors. See androidx.compose.foundation.samples.AnchoredDraggableDynamicAnchorsSample for an example of using dynamic anchors over confirmValueChange.";
    private static final boolean DEBUG = false;
    private static final Function1<Integer, Float> GetOrNan = null;
    private static final DecayAnimationSpec<Float> NoOpDecayAnimationSpec = null;
    private static final String SettleWithVelocityDeprecated = "settle does not accept a velocity anymore. Please use FlingBehavior#performFling instead. See AnchoredDraggableSamples.kt for example usages.";
    private static final String StartDragImmediatelyDeprecated = "startDragImmediately has been removed without replacement. Modifier.anchoredDraggable sets startDragImmediately to true by default when animations are running.";

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4, reason: invalid class name */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "anchors", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "latestTarget"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4", f = "AnchoredDraggable.kt", i = {}, l = {1344}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass4<T> extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ AnchoredDraggableState<T> $this_animateTo;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        AnonymousClass4(AnchoredDraggableState<T> r2, AnimationSpec<Float> r3, Continuation<? super AnonymousClass4> r4) {
            this.$this_animateTo = r2;
            this.$animationSpec = r3;
            super(4, r4);
        }

        public final Object invoke(AnchoredDragScope r4, DraggableAnchors<T> r5, T r6, Continuation<? super Unit> r7) {
            AnonymousClass4 r0 = new AnonymousClass4(this.$this_animateTo, this.$animationSpec, r7);
            r0.L$0 = r4;
            r0.L$1 = r5;
            r0.L$2 = r6;
            return r0.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope r2, Object r3, Object r4, Continuation<? super Unit> r5) {
            return invoke(r2, (DraggableAnchors) r3, r4, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L11:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            AnchoredDragScope $this$anchoredDrag = (AnchoredDragScope) this.L$0;
            DraggableAnchors anchors = (DraggableAnchors) this.L$1;
            Object latestTarget = this.L$2;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (AnchoredDraggableKt.access$animateTo(this.$this_animateTo, this.$this_animateTo.getLastVelocity(), $this$anchoredDrag, anchors, latestTarget, this.$animationSpec, this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {0, 0}, l = {1380}, m = "animateToWithDecay", n = {"remainingVelocity", "velocity"}, s = {"L$0", "F$0"})
    static final class C02281<T> extends ContinuationImpl {
        float F$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C02281(Continuation<? super C02281> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r8) {
            this.result = r8;
            this.label |= Integer.MIN_VALUE;
            return AnchoredDraggableKt.animateToWithDecay(null, null, 0.0f, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2, reason: invalid class name */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "anchors", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "latestTarget"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", f = "AnchoredDraggable.kt", i = {}, l = {1391, 1409, 1433}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2<T> extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> {
        final /* synthetic */ DecayAnimationSpec<Float> $decayAnimationSpec;
        final /* synthetic */ Ref.FloatRef $remainingVelocity;
        final /* synthetic */ AnimationSpec<Float> $snapAnimationSpec;
        final /* synthetic */ AnchoredDraggableState<T> $this_animateToWithDecay;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        AnonymousClass2(AnchoredDraggableState<T> r2, float r3, AnimationSpec<Float> r4, Ref.FloatRef r5, DecayAnimationSpec<Float> r6, Continuation<? super AnonymousClass2> r7) {
            this.$this_animateToWithDecay = r2;
            this.$velocity = r3;
            this.$snapAnimationSpec = r4;
            this.$remainingVelocity = r5;
            this.$decayAnimationSpec = r6;
            super(4, r7);
        }

        public final Object invoke(AnchoredDragScope r8, DraggableAnchors<T> r9, T r10, Continuation<? super Unit> r11) {
            AnonymousClass2 r0 = new AnonymousClass2(this.$this_animateToWithDecay, this.$velocity, this.$snapAnimationSpec, this.$remainingVelocity, this.$decayAnimationSpec, r11);
            r0.L$0 = r8;
            r0.L$1 = r9;
            r0.L$2 = r10;
            return r0.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope r2, Object r3, Object r4, Continuation<? super Unit> r5) {
            return invoke(r2, (DraggableAnchors) r3, r4, r5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L9;
                case 1: goto L8;
                case 2: goto L7;
                case 3: goto L6;
                default: goto L5;
            };
        L6:
            Object $result2 = $result;
            ResultKt.throwOnFailure($result2);
        L48:
            this.$remainingVelocity.element = 0.0f;
        L55:
            return Unit.INSTANCE;
        L7:
            Object $result3 = $result;
            ResultKt.throwOnFailure($result3);
            goto L55
        L8:
            Object $result4 = $result;
            ResultKt.throwOnFailure($result4);
        L53:
            this.$remainingVelocity.element = 0.0f;
            goto L55
        L9:
            ResultKt.throwOnFailure($result);
            final AnchoredDragScope $this$anchoredDrag = (AnchoredDragScope) this.L$0;
            DraggableAnchors r8 = (DraggableAnchors) this.L$1;
            Object latestTarget = this.L$2;
            final float targetOffset = r8.positionOf(latestTarget);
            if (Float.isNaN(targetOffset) == true) goto L55;
            final Ref.FloatRef prev = new Ref.FloatRef();
            if (Float.isNaN(this.$this_animateToWithDecay.getOffset()) == false) goto L14;
            float r6 = 0.0f;
        L15:
            prev.element = r6;
            boolean canDecayToTarget = false;
            if (prev.element != targetOffset) goto L18;
            boolean r7 = true;
        L19:
            if (r7 == true) goto L55;
            if ((this.$velocity * (targetOffset - prev.element)) >= 0.0f) goto L23;
        L49:
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (AnchoredDraggableKt.access$animateTo(this.$this_animateToWithDecay, this.$velocity, $this$anchoredDrag, r8, latestTarget, this.$snapAnimationSpec, this) != r1) goto L52;
            return r1;
        L52:
            $result4 = $result;
            goto L53
        L23:
            if (this.$velocity != 0.0f) goto L25;
            boolean r9 = true;
        L26:
            if (r9 == true) goto L49;
            float projectedDecayOffset = DecayAnimationSpecKt.calculateTargetValue(this.$decayAnimationSpec, prev.element, this.$velocity);
            if (this.$velocity <= 0.0f) goto L35;
            if (projectedDecayOffset < targetOffset) goto L38;
            canDecayToTarget = true;
        L38:
            if (canDecayToTarget == false) goto L44;
            AnimationState r22 = AnimationStateKt.AnimationState$default(prev.element, this.$velocity, 0, 0, false, 28, null);
            DecayAnimationSpec<Float> r3 = this.$decayAnimationSpec;
            final Ref.FloatRef r10 = this.$remainingVelocity;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (SuspendAnimationKt.animateDecay$default(r22, r3, false, new AnonymousClass3(targetOffset, prev, $this$anchoredDrag, r10), this, 2, null) != r1) goto L42;
            return r1;
        L42:
            $result3 = $result;
            goto L55
        L44:
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            if (AnchoredDraggableKt.access$animateTo(this.$this_animateToWithDecay, this.$velocity, $this$anchoredDrag, r8, latestTarget, this.$snapAnimationSpec, this) != r1) goto L47;
            return r1;
        L47:
            $result2 = $result;
            goto L48
        L35:
            if (projectedDecayOffset > targetOffset) goto L38;
            canDecayToTarget = true;
            goto L38
        L25:
            r9 = false;
            goto L26
        L18:
            r7 = false;
            goto L19
        L14:
            r6 = this.$this_animateToWithDecay.getOffset();
            goto L15
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {}, l = {1543}, m = "restartable", n = {}, s = {})
    static final class C02291<I> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C02291(Continuation<? super C02291> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return AnchoredDraggableKt.access$restartable(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "I", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", i = {}, l = {1545}, m = "invokeSuspend", n = {}, s = {})
    static final class C02302 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ Function0<I> $inputs;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "I", "latestInputs", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> $block;
            final /* synthetic */ Ref.ObjectRef<Job> $previousDrag;

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: AnchoredDraggable.kt */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "I", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", i = {}, l = {1552}, m = "invokeSuspend", n = {}, s = {})
            static final class C00152 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ CoroutineScope $$this$coroutineScope;
                final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> $block;
                final /* synthetic */ I $latestInputs;
                int label;

                /* JADX WARN: Multi-variable type inference failed */
                C00152(Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> r2, I r3, CoroutineScope r4, Continuation<? super C00152> r5) {
                    this.$block = r2;
                    this.$latestInputs = r3;
                    this.$$this$coroutineScope = r4;
                    super(2, r5);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
                    return new C00152(this.$block, this.$latestInputs, this.$$this$coroutineScope, r6);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                    return invoke2(r2, r3);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                    return ((C00152) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object $result) {
                    Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch(this.label) {
                        case 0: goto L7;
                        case 1: goto L6;
                        default: goto L5;
                    };
                L6:
                    ResultKt.throwOnFailure($result);
                L10:
                    CoroutineScopeKt.cancel(this.$$this$coroutineScope, new AnchoredDragFinishedSignal());
                    return Unit.INSTANCE;
                L7:
                    ResultKt.throwOnFailure($result);
                    Function2<I, Continuation<? super Unit>, Object> r1 = this.$block;
                    I r2 = this.$latestInputs;
                    this.label = 1;
                    if (r1.invoke(r2, this) != r0) goto L10;
                    return r0;
                L5:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Ref.ObjectRef<Job> r1, CoroutineScope r2, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> r3) {
                this.$previousDrag = r1;
                this.$$this$coroutineScope = r2;
                this.$block = r3;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(I r11, Continuation<? super Unit> r12) {
                if ((r12 instanceof AnchoredDraggableKt$restartable$2$1$emit$1) == false) goto L7;
                AnchoredDraggableKt$restartable$2$1$emit$1 r0 = (AnchoredDraggableKt$restartable$2$1$emit$1) r12;
                if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
                r0.label -= Integer.MIN_VALUE;
            L8:
                Object r1 = r0.result;
                Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(r0.label) {
                    case 0: goto L13;
                    case 1: goto L12;
                    default: goto L11;
                };
            L12:
                Job r3 = (Job) r0.L$2;
                Object r4 = r0.L$1;
                AnonymousClass1<T> r5 = (AnonymousClass1) r0.L$0;
                ResultKt.throwOnFailure(r1);
                Object r6 = r4;
            L19:
                Object r13 = r6;
            L20:
                r5.$previousDrag.element = (T) BuildersKt.launch$default(r5.$$this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new C00152(r5.$block, r13, r5.$$this$coroutineScope, null), 1, null);
                return Unit.INSTANCE;
            L13:
                ResultKt.throwOnFailure(r1);
                r5 = this;
                Job r7 = r5.$previousDrag.element;
                r13 = r11;
                if (r7 == null) goto L20;
                r7.cancel(new AnchoredDragFinishedSignal());
                r0.L$0 = r5;
                r0.L$1 = r11;
                r0.L$2 = r7;
                r0.label = 1;
                if (r7.join(r0) != r2) goto L18;
                return r2;
            L18:
                r6 = r11;
                goto L19
            L11:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            L7:
                r0 = new AnchoredDraggableKt$restartable$2$1$emit$1(this, r12);
                goto L8
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C02302(Function0<? extends I> r2, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> r3, Continuation<? super C02302> r4) {
            this.$inputs = r2;
            this.$block = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            C02302 r0 = new C02302(this.$inputs, this.$block, r5);
            r0.L$0 = r4;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((C02302) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L11:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            CoroutineScope $this$coroutineScope = (CoroutineScope) this.L$0;
            Ref.ObjectRef previousDrag = new Ref.ObjectRef();
            this.label = 1;
            if (SnapshotStateKt.snapshotFlow(this.$inputs).collect(new AnonymousClass1(previousDrag, $this$coroutineScope, this.$block), this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "anchors", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "latestTarget"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C02312<T> extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        C02312(Continuation<? super C02312> r2) {
            super(4, r2);
        }

        public final Object invoke(AnchoredDragScope r3, DraggableAnchors<T> r4, T r5, Continuation<? super Unit> r6) {
            C02312 r0 = new C02312(r6);
            r0.L$0 = r3;
            r0.L$1 = r4;
            r0.L$2 = r5;
            return r0.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope r2, Object r3, Object r4, Continuation<? super Unit> r5) {
            return invoke(r2, (DraggableAnchors) r3, r4, r5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r6) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure(r6);
            AnchoredDragScope $this$anchoredDrag = (AnchoredDragScope) this.L$0;
            DraggableAnchors r1 = (DraggableAnchors) this.L$1;
            Object latestTarget = this.L$2;
            float targetOffset = r1.positionOf(latestTarget);
            if (Float.isNaN(targetOffset) == true) goto L10;
            AnchoredDragScope.dragTo$default($this$anchoredDrag, targetOffset, 0.0f, 2, null);
        L10:
            return Unit.INSTANCE;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final /* synthetic */ Object access$animateTo(AnchoredDraggableState $receiver, float velocity, AnchoredDragScope anchoredDragScope, DraggableAnchors anchors, Object latestTarget, AnimationSpec snapAnimationSpec, Continuation $completion) {
        return animateTo($receiver, velocity, anchoredDragScope, anchors, latestTarget, snapAnimationSpec, $completion);
    }

    public static final /* synthetic */ float access$coerceToTarget(float $receiver, float target) {
        return coerceToTarget($receiver, target);
    }

    public static final /* synthetic */ Object access$computeTarget(DraggableAnchors $receiver, float currentOffset, float velocity, Function1 positionalThreshold, Function0 velocityThreshold) {
        return computeTarget($receiver, currentOffset, velocity, positionalThreshold, velocityThreshold);
    }

    public static final /* synthetic */ DefaultDraggableAnchors access$emptyDraggableAnchors() {
        return emptyDraggableAnchors();
    }

    public static final /* synthetic */ Function1 access$getAlwaysDrag$p() {
        return AlwaysDrag;
    }

    public static final /* synthetic */ Function1 access$getGetOrNan$p() {
        return GetOrNan;
    }

    public static final /* synthetic */ Object access$restartable(Function0 inputs, Function2 block, Continuation $completion) {
        return restartable(inputs, block, $completion);
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier r8, AnchoredDraggableState r9, boolean r10, Orientation r11, boolean r12, MutableInteractionSource r13, OverscrollEffect r14, FlingBehavior r15, int r16, Object r17) {
        if ((r16 & 8) == 0) goto L5;
        boolean r4 = true;
    L7:
        if ((r16 & 16) == 0) goto L9;
        MutableInteractionSource r5 = null;
    L11:
        if ((r16 & 32) == 0) goto L13;
        OverscrollEffect r6 = null;
    L15:
        if ((r16 & 64) == 0) goto L17;
        FlingBehavior r7 = null;
    L19:
        return anchoredDraggable(r8, r9, r10, r11, r4, r5, r6, r7);
    L17:
        r7 = r15;
        goto L19
    L13:
        r6 = r14;
        goto L15
    L9:
        r5 = r13;
        goto L11
    L5:
        r4 = r12;
        goto L7
    }

    public static final <T> Modifier anchoredDraggable(Modifier $this$anchoredDraggable, AnchoredDraggableState<T> r12, boolean reverseDirection, Orientation orientation, boolean enabled, MutableInteractionSource interactionSource, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior) {
        Boolean r6 = null;
        return $this$anchoredDraggable.then(new AnchoredDraggableElement(r12, orientation, enabled, Boolean.valueOf(reverseDirection), interactionSource, r6, overscrollEffect, flingBehavior, 32, null));
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier r9, AnchoredDraggableState r10, boolean r11, Orientation r12, boolean r13, MutableInteractionSource r14, OverscrollEffect r15, boolean r16, FlingBehavior r17, int r18, Object r19) {
        if ((r18 & 8) == 0) goto L5;
        boolean r4 = true;
    L7:
        if ((r18 & 16) == 0) goto L9;
        MutableInteractionSource r5 = null;
    L11:
        if ((r18 & 32) == 0) goto L13;
        OverscrollEffect r6 = null;
    L15:
        if ((r18 & 64) == 0) goto L17;
        boolean r7 = r10.isAnimationRunning();
    L19:
        if ((r18 & 128) == 0) goto L21;
        FlingBehavior r8 = null;
    L23:
        return anchoredDraggable(r9, r10, r11, r12, r4, r5, r6, r7, r8);
    L21:
        r8 = r17;
        goto L23
    L17:
        r7 = r16;
        goto L19
    L13:
        r6 = r15;
        goto L15
    L9:
        r5 = r14;
        goto L11
    L5:
        r4 = r13;
        goto L7
    }

    @Deprecated(message = StartDragImmediatelyDeprecated)
    public static final <T> Modifier anchoredDraggable(Modifier $this$anchoredDraggable, AnchoredDraggableState<T> r10, boolean reverseDirection, Orientation orientation, boolean enabled, MutableInteractionSource interactionSource, OverscrollEffect overscrollEffect, boolean startDragImmediately, FlingBehavior flingBehavior) {
        return $this$anchoredDraggable.then(new AnchoredDraggableElement(r10, orientation, enabled, Boolean.valueOf(reverseDirection), interactionSource, Boolean.valueOf(startDragImmediately), overscrollEffect, flingBehavior));
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier r7, AnchoredDraggableState r8, Orientation r9, boolean r10, MutableInteractionSource r11, OverscrollEffect r12, FlingBehavior r13, int r14, Object r15) {
        if ((r14 & 4) == 0) goto L5;
        boolean r3 = true;
    L7:
        if ((r14 & 8) == 0) goto L9;
        MutableInteractionSource r4 = null;
    L11:
        if ((r14 & 16) == 0) goto L13;
        OverscrollEffect r5 = null;
    L15:
        if ((r14 & 32) == 0) goto L17;
        FlingBehavior r6 = null;
    L19:
        return anchoredDraggable(r7, r8, r9, r3, r4, r5, r6);
    L17:
        r6 = r13;
        goto L19
    L13:
        r5 = r12;
        goto L15
    L9:
        r4 = r11;
        goto L11
    L5:
        r3 = r10;
        goto L7
    }

    public static final <T> Modifier anchoredDraggable(Modifier $this$anchoredDraggable, AnchoredDraggableState<T> r12, Orientation orientation, boolean enabled, MutableInteractionSource interactionSource, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior) {
        Boolean r4 = null;
        Boolean r6 = null;
        return $this$anchoredDraggable.then(new AnchoredDraggableElement(r12, orientation, enabled, r4, interactionSource, r6, overscrollEffect, flingBehavior, 32, null));
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier r8, AnchoredDraggableState r9, Orientation r10, boolean r11, MutableInteractionSource r12, OverscrollEffect r13, boolean r14, FlingBehavior r15, int r16, Object r17) {
        if ((r16 & 4) == 0) goto L5;
        boolean r3 = true;
    L7:
        if ((r16 & 8) == 0) goto L9;
        MutableInteractionSource r4 = null;
    L11:
        if ((r16 & 16) == 0) goto L13;
        OverscrollEffect r5 = null;
    L15:
        if ((r16 & 32) == 0) goto L17;
        boolean r6 = r9.isAnimationRunning();
    L19:
        if ((r16 & 64) == 0) goto L21;
        FlingBehavior r7 = null;
    L23:
        return anchoredDraggable(r8, r9, r10, r3, r4, r5, r6, r7);
    L21:
        r7 = r15;
        goto L23
    L17:
        r6 = r14;
        goto L19
    L13:
        r5 = r13;
        goto L15
    L9:
        r4 = r12;
        goto L11
    L5:
        r3 = r11;
        goto L7
    }

    @Deprecated(message = StartDragImmediatelyDeprecated)
    public static final <T> Modifier anchoredDraggable(Modifier $this$anchoredDraggable, AnchoredDraggableState<T> r10, Orientation orientation, boolean enabled, MutableInteractionSource interactionSource, OverscrollEffect overscrollEffect, boolean startDragImmediately, FlingBehavior flingBehavior) {
        return $this$anchoredDraggable.then(new AnchoredDraggableElement(r10, orientation, enabled, null, interactionSource, Boolean.valueOf(startDragImmediately), overscrollEffect, flingBehavior));
    }

    static {
        AlwaysDrag = AnchoredDraggableKt$AlwaysDrag$1.INSTANCE;
        GetOrNan = AnchoredDraggableKt$GetOrNan$1.INSTANCE;
        AnchoredDraggableMinFlingVelocity = Dp.m6973constructorimpl(125);
        NoOpDecayAnimationSpec = DecayAnimationSpecKt.generateDecayAnimationSpec(new AnchoredDraggableKt$NoOpDecayAnimationSpec$1());
    }

    public static final <T> void forEach(DraggableAnchors<T> r5, Function2<? super T, ? super Float, Unit> r6) {
        int i = 0;
        int r2 = r5.getSize();
    L3:
        if (i >= r2) goto L9;
        Object key = r5.anchorAt(i);
        if (key == null) goto L8;
        r6.invoke(key, Float.valueOf(r5.positionAt(i)));
        i = i + 1;
        goto L3
    L8:
        throw new IllegalArgumentException(("There was no key at index " + i + ". Please report a bug.").toString());
    }

    public static final <T> DraggableAnchors<T> DraggableAnchors(Function1<? super DraggableAnchorsConfig<T>, Unit> r4) {
        DraggableAnchorsConfig config = new DraggableAnchorsConfig();
        r4.invoke(config);
        return new DefaultDraggableAnchors(config.buildKeys$foundation_release(), config.buildPositions$foundation_release());
    }

    public static /* synthetic */ AnchoredDraggableState AnchoredDraggableState$default(Object r6, Function1 r7, Function0 r8, AnimationSpec r9, DecayAnimationSpec r10, Function1 r11, int r12, Object r13) {
        if ((r12 & 32) == 0) goto L5;
        Function1 r5 = C02261.INSTANCE;
    L7:
        return AnchoredDraggableState(r6, r7, r8, r9, r10, r5);
    L5:
        r5 = r11;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = ConfigurationMovedToModifier)
    public static final <T> AnchoredDraggableState<T> AnchoredDraggableState(T r3, Function1<? super Float, Float> r4, Function0<Float> r5, AnimationSpec<Float> r6, DecayAnimationSpec<Float> r7, Function1<? super T, Boolean> r8) {
        AnchoredDraggableState<T> r0 = new AnchoredDraggableState(r3, r8);
        r0.setPositionalThreshold$foundation_release(r4);
        r0.setVelocityThreshold$foundation_release(r5);
        r0.setSnapAnimationSpec$foundation_release(r6);
        r0.setDecayAnimationSpec$foundation_release(r7);
        return r0;
    }

    public static /* synthetic */ AnchoredDraggableState AnchoredDraggableState$default(Object r7, DraggableAnchors r8, Function1 r9, Function0 r10, AnimationSpec r11, DecayAnimationSpec r12, Function1 r13, int r14, Object r15) {
        if ((r14 & 64) == 0) goto L5;
        Function1 r6 = AnonymousClass3.INSTANCE;
    L7:
        return AnchoredDraggableState(r7, r8, r9, r10, r11, r12, r6);
    L5:
        r6 = r13;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = ConfigurationMovedToModifier)
    public static final <T> AnchoredDraggableState<T> AnchoredDraggableState(T r3, DraggableAnchors<T> r4, Function1<? super Float, Float> r5, Function0<Float> r6, AnimationSpec<Float> r7, DecayAnimationSpec<Float> r8, Function1<? super T, Boolean> r9) {
        AnchoredDraggableState<T> r0 = new AnchoredDraggableState(r3, r4, r9);
        r0.setPositionalThreshold$foundation_release(r5);
        r0.setVelocityThreshold$foundation_release(r6);
        r0.setSnapAnimationSpec$foundation_release(r7);
        r0.setDecayAnimationSpec$foundation_release(r8);
        return r0;
    }

    public static final <T> Object snapTo(AnchoredDraggableState<T> r9, T r10, Continuation<? super Unit> r11) {
        Object r12 = AnchoredDraggableState.anchoredDrag$default(r9, r10, null, new C02312(null), r11, 2, null);
        if (r12 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r12;
    L6:
        return Unit.INSTANCE;
    }

    private static final <T> Object animateTo(AnchoredDraggableState<T> r9, float velocity, final AnchoredDragScope anchoredDragScope, DraggableAnchors<T> r12, T r13, AnimationSpec<Float> r14, Continuation<? super Unit> r15) {
        float targetOffset = r12.positionOf(r13);
        final Ref.FloatRef prev = new Ref.FloatRef();
        if (Float.isNaN(r9.getOffset()) == false) goto L5;
        float r2 = 0.0f;
    L6:
        prev.element = r2;
        if (Float.isNaN(targetOffset) == true) goto L18;
        if (prev.element != targetOffset) goto L11;
        boolean r3 = true;
    L12:
        if (r3 == true) goto L18;
        Object r10 = SuspendAnimationKt.animate(prev.element, targetOffset, velocity, r14, new AnchoredDraggableKt$animateTo$2$2(anchoredDragScope, prev), r15);
        if (r10 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L18;
        return r10;
    L11:
        r3 = false;
    L18:
        return Unit.INSTANCE;
    L5:
        r2 = r9.getOffset();
        goto L6
    }

    public static /* synthetic */ Object animateTo$default(AnchoredDraggableState r0, Object r1, AnimationSpec r2, Continuation r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L10;
        if (r0.getUsePreModifierChangeBehavior$foundation_release() == false) goto L7;
        r2 = r0.getSnapAnimationSpec();
        goto L10
    L7:
        r2 = AnchoredDraggableDefaults.INSTANCE.getSnapAnimationSpec();
    L10:
        return animateTo(r0, r1, r2, r3);
    }

    public static final <T> Object animateTo(AnchoredDraggableState<T> r9, T r10, AnimationSpec<Float> r11, Continuation<? super Unit> r12) {
        Object r13 = AnchoredDraggableState.anchoredDrag$default(r9, r10, null, new AnonymousClass4(r9, r11, null), r12, 2, null);
        if (r13 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r13;
    L6:
        return Unit.INSTANCE;
    }

    public static final <T> Object animateToWithDecay(AnchoredDraggableState<T> r17, T r18, float velocity, AnimationSpec<Float> r20, DecayAnimationSpec<Float> r21, Continuation<? super Float> r22) {
        if ((r22 instanceof C02281) == false) goto L7;
        C02281 r1 = (C02281) r22;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        C02281 r6 = r1;
        Object $result = r6.result;
        Object r9 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r6.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        float velocity2 = r6.F$0;
        Ref.FloatRef remainingVelocity = (Ref.FloatRef) r6.L$0;
        ResultKt.throwOnFailure($result);
    L18:
        return Boxing.boxFloat(velocity2 - remainingVelocity.element);
    L13:
        ResultKt.throwOnFailure($result);
        Ref.FloatRef remainingVelocity2 = new Ref.FloatRef();
        remainingVelocity2.element = velocity;
        AnonymousClass2 r5 = new AnonymousClass2(r17, velocity, r20, remainingVelocity2, r21, null);
        r6.L$0 = remainingVelocity2;
        r6.F$0 = velocity;
        r6.label = 1;
        if (AnchoredDraggableState.anchoredDrag$default(r17, r18, null, r5, r6, 2, null) != r9) goto L16;
        return r9;
    L16:
        velocity2 = velocity;
        remainingVelocity = remainingVelocity2;
        goto L18
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new C02281(r22);
        goto L8
    }

    public static /* synthetic */ Object animateToWithDecay$default(AnchoredDraggableState r6, Object r7, float r8, AnimationSpec r9, DecayAnimationSpec r10, Continuation r11, int r12, Object r13) {
        if ((r12 & 4) != 0) goto L5;
        AnimationSpec r3 = r9;
    L11:
        if ((r12 & 8) != 0) goto L13;
        DecayAnimationSpec r4 = r10;
    L19:
        return animateToWithDecay(r6, r7, r8, r3, r4, r11);
    L13:
        if (r6.getUsePreModifierChangeBehavior$foundation_release() == false) goto L15;
        DecayAnimationSpec<Float> r14 = r6.getDecayAnimationSpec();
    L16:
        r4 = r14;
        goto L19
    L15:
        r14 = AnchoredDraggableDefaults.INSTANCE.getDecayAnimationSpec();
        goto L16
    L5:
        if (r6.getUsePreModifierChangeBehavior$foundation_release() == false) goto L7;
        AnimationSpec<Float> r15 = r6.getSnapAnimationSpec();
    L8:
        r3 = r15;
        goto L11
    L7:
        r15 = AnchoredDraggableDefaults.INSTANCE.getSnapAnimationSpec();
        goto L8
    }

    private static final <T> T computeTarget(DraggableAnchors<T> r16, float currentOffset, float velocity, Function1<? super Float, Float> r19, Function0<Float> r20) {
        if (Float.isNaN(currentOffset) == true) goto L36;
        boolean r4 = false;
        if (Math.abs(velocity) <= 0.0f) goto L7;
        boolean isMoving = true;
    L8:
        if (isMoving == true) goto L10;
    L12:
        boolean isMovingForward = false;
    L13:
        if (isMoving == true) goto L16;
        T r5 = r16.closestAnchor(currentOffset);
        Intrinsics.checkNotNull(r5);
        return r5;
    L16:
        if (Math.abs(velocity) < Math.abs(r20.invoke().floatValue())) goto L18;
        T r6 = r16.closestAnchor(currentOffset, isMovingForward);
        Intrinsics.checkNotNull(r6);
        return r6;
    L18:
        T r7 = r16.closestAnchor(currentOffset, false);
        Intrinsics.checkNotNull(r7);
        float leftAnchorPosition = r16.positionOf(r7);
        T r8 = r16.closestAnchor(currentOffset, true);
        Intrinsics.checkNotNull(r8);
        float rightAnchorPosition = r16.positionOf(r8);
        float distance = Math.abs(leftAnchorPosition - rightAnchorPosition);
        float relativeThreshold = Math.abs(r19.invoke(Float.valueOf(distance)).floatValue());
        if (isMovingForward == false) goto L21;
        float closestAnchorFromStart = leftAnchorPosition;
    L22:
        float relativePosition = Math.abs(closestAnchorFromStart - currentOffset);
        if (relativePosition < relativeThreshold) goto L25;
        r4 = true;
    L25:
        if (r4 != true) goto L28;
        if (isMovingForward == true) goto L32;
    L39:
        return r7;
    L32:
        return r8;
    L28:
        if (r4 == true) goto L34;
        if (isMovingForward == false) goto L32;
    L34:
        throw new NoWhenBranchMatchedException();
    L21:
        closestAnchorFromStart = rightAnchorPosition;
        goto L22
    L10:
        if (velocity <= 0.0f) goto L12;
        isMovingForward = true;
        goto L13
    L7:
        isMoving = false;
        goto L8
    L36:
        throw new IllegalArgumentException("The offset provided to computeTarget must not be NaN.".toString());
    }

    private static final float coerceToTarget(float $this$coerceToTarget, float target) {
        if (target != 0.0f) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L9;
        return 0.0f;
    L9:
        if (target <= 0.0f) goto L12;
        return RangesKt.coerceAtMost($this$coerceToTarget, target);
    L12:
        return RangesKt.coerceAtLeast($this$coerceToTarget, target);
    L5:
        r1 = false;
        goto L6
    }

    private static final <I> Object restartable(Function0<? extends I> r5, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> r6, Continuation<? super Unit> r7) {
        if ((r7 instanceof C02291) == false) goto L7;
        C02291 r0 = (C02291) r7;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L16;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ResultKt.throwOnFailure($result);     // Catch: AnchoredDragFinishedSignal -> L14
    L23:
        goto L22
    L16:
        ResultKt.throwOnFailure($result);
        C02302 r3 = new C02302(r5, r6, null);     // Catch: AnchoredDragFinishedSignal -> L14
        r0.label = 1;     // Catch: AnchoredDragFinishedSignal -> L14
        if (CoroutineScopeKt.coroutineScope(r3, r0) != r2) goto L23;
        return r2;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L22:
        return Unit.INSTANCE;
    L7:
        r0 = new C02291(r7);
        goto L8
    }

    private static final <T> DefaultDraggableAnchors<T> emptyDraggableAnchors() {
        return new DefaultDraggableAnchors(CollectionsKt.emptyList(), new float[0]);
    }

    public static final float getAnchoredDraggableMinFlingVelocity() {
        return AnchoredDraggableMinFlingVelocity;
    }

    public static final <T> TargetedFlingBehavior anchoredDraggableFlingBehavior(AnchoredDraggableState<T> r2, final Density density, Function1<? super Float, Float> r4, AnimationSpec<Float> r5) {
        DecayAnimationSpec<Float> r0 = NoOpDecayAnimationSpec;
        return SnapFlingBehaviorKt.snapFlingBehavior(AnchoredDraggableLayoutInfoProvider(r2, r4, new C02271(density)), r0, r5);
    }

    private static final <T> SnapLayoutInfoProvider AnchoredDraggableLayoutInfoProvider(final AnchoredDraggableState<T> r1, final Function1<? super Float, Float> r2, final Function0<Float> r3) {
        return new AnonymousClass1(r1, r2, r3);
    }

    private static final void debugLog(Function0<String> r1) {
    }
}
