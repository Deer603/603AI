package androidx.compose.material;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001aS\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00192\u0006\u0010\u001a\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u001b\u001a\u007f\u0010\u001c\u001a\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0016\u0012\u0004\u0012\u00020\u00120\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\b\b\u0003\u0010!\u001a\u00020\"2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020&H\u0007¢\u0006\u0002\u0010'\u001ak\u0010(\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0,2\u0006\u0010%\u001a\u00020&2\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u0001H\u0003¢\u0006\u0002\u00103\u001a\u007f\u00104\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\b\b\u0003\u0010!\u001a\u00020\"2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010$2\n\b\u0002\u00105\u001a\u0004\u0018\u00010/2\b\b\u0002\u0010%\u001a\u00020&H\u0007¢\u0006\u0002\u00106\u001aK\u00107\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\u0006\u00108\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0,2\u0006\u0010%\u001a\u00020&2\u0006\u0010-\u001a\u00020\b2\u0006\u00105\u001a\u00020/2\u0006\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u00109\u001aS\u0010:\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0,2\u0006\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020\bH\u0003¢\u0006\u0002\u0010=\u001a.\u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\b2\u0006\u0010B\u001a\u00020\b2\u0006\u0010C\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010D\u001a \u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\b2\u0006\u0010H\u001a\u00020\bH\u0002\u001a0\u0010I\u001a\u00020\b2\u0006\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\bH\u0002\u001a<\u0010I\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020\b2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\bH\u0002\u001a.\u0010P\u001a\u00020\b2\u0006\u0010A\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0,2\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\bH\u0002\u001a\u0016\u0010S\u001a\b\u0012\u0004\u0012\u00020\b0,2\u0006\u0010!\u001a\u00020\"H\u0002\u001aF\u0010T\u001a\u00020\u0012*\u00020U2\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010V\u001a\u00020\u00032\u0006\u00105\u001a\u00020/2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010W\u001a\u00020\u0003H\u0003ø\u0001\u0000¢\u0006\u0004\bX\u0010Y\u001a5\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\b\u0018\u00010[*\u00020]2\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020aH\u0082@ø\u0001\u0000¢\u0006\u0004\bb\u0010c\u001a\u0098\u0001\u0010d\u001a\u00020\u0001*\u00020\u00012\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020\b0f2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020\b0f2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010h\u001a\u00020 2\u0006\u0010R\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0018\u0010i\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00120\u00140f2\u001e\u0010j\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120k0fH\u0002\u001aj\u0010l\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010h\u001a\u00020 2\u0018\u0010m\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00140f2\u0014\u0010n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010$0fH\u0002\u001a\\\u0010o\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00142\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010$2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\b\b\u0002\u0010!\u001a\u00020\"H\u0002\u001aj\u0010p\u001a\u00020\u0001*\u00020\u00012\u0006\u0010?\u001a\u00020@2\u0006\u00105\u001a\u00020/2\u0006\u0010R\u001a\u00020\b2\u0006\u0010h\u001a\u00020 2\f\u0010q\u001a\b\u0012\u0004\u0012\u00020\b0f2\u0018\u0010i\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00140f2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020\b0\u00192\u0006\u0010\u001f\u001a\u00020 H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0016\u0010\u000b\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\f\u0010\r\"\u0010\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0016\u0010\u000f\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0010\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006s"}, d2 = {"DefaultSliderConstraints", "Landroidx/compose/ui/Modifier;", "SliderHeight", "Landroidx/compose/ui/unit/Dp;", "F", "SliderMinWidth", "SliderToTickAnimation", "Landroidx/compose/animation/core/TweenSpec;", "", "ThumbDefaultElevation", "ThumbPressedElevation", "ThumbRadius", "getThumbRadius", "()F", "ThumbRippleRadius", "TrackHeight", "getTrackHeight", "CorrectValueSideEffect", "", "scaleToOffset", "Lkotlin/Function1;", "valueRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "trackRange", "valueState", "Landroidx/compose/runtime/MutableState;", "value", "(Lkotlin/jvm/functions/Function1;Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/MutableState;FLandroidx/compose/runtime/Composer;I)V", "RangeSlider", "onValueChange", "modifier", "enabled", "", "steps", "", "onValueChangeFinished", "Lkotlin/Function0;", "colors", "Landroidx/compose/material/SliderColors;", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "RangeSliderImpl", "positionFractionStart", "positionFractionEnd", "tickFractions", "", "width", "startInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "endInteractionSource", "startThumbSemantics", "endThumbSemantics", "(ZFFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Slider", "interactionSource", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "SliderImpl", "positionFraction", "(ZFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Track", "thumbPx", "trackStrokeWidth", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SliderColors;ZFFLjava/util/List;FFLandroidx/compose/runtime/Composer;I)V", "animateToTarget", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "current", "target", "velocity", "(Landroidx/compose/foundation/gestures/DraggableState;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calcFraction", "a", "b", "pos", "scale", "a1", "b1", "x1", "a2", "b2", "x", "snapValueToTick", "minPx", "maxPx", "stepsToTickFractions", "SliderThumb", "Landroidx/compose/foundation/layout/BoxScope;", "offset", "thumbSize", "SliderThumb-PcYyNuk", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/ui/Modifier;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;ZFLandroidx/compose/runtime/Composer;I)V", "awaitSlop", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "id", "Landroidx/compose/ui/input/pointer/PointerId;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/input/pointer/PointerType;", "awaitSlop-8vUncbI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rangeSliderPressDragModifier", "rawOffsetStart", "Landroidx/compose/runtime/State;", "rawOffsetEnd", "isRtl", "gestureEndAction", "onDrag", "Lkotlin/Function2;", "slideOnKeyEvents", "onValueChangeState", "onValueChangeFinishedState", "sliderSemantics", "sliderTapModifier", "rawOffset", "pressOffset", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SliderKt {
    private static final Modifier DefaultSliderConstraints = null;
    private static final float SliderHeight = 0.0f;
    private static final float SliderMinWidth = 0.0f;
    private static final TweenSpec<Float> SliderToTickAnimation = null;
    private static final float ThumbDefaultElevation = 0.0f;
    private static final float ThumbPressedElevation = 0.0f;
    private static final float ThumbRadius = 0.0f;
    private static final float ThumbRippleRadius = 0.0f;
    private static final float TrackHeight = 0.0f;

    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$RangeSlider$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C04392 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $endInteractionSource;
        final /* synthetic */ Function0<Unit> $onValueChangeFinished;
        final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> $onValueChangeState;
        final /* synthetic */ MutableInteractionSource $startInteractionSource;
        final /* synthetic */ int $steps;
        final /* synthetic */ List<Float> $tickFractions;
        final /* synthetic */ ClosedFloatingPointRange<Float> $value;
        final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: Multi-variable type inference failed */
        C04392(ClosedFloatingPointRange<Float> r2, ClosedFloatingPointRange<Float> r3, List<Float> r4, Function0<Unit> r5, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> r6, MutableInteractionSource r7, MutableInteractionSource r8, boolean r9, int r10, SliderColors r11) {
            this.$valueRange = r2;
            this.$value = r3;
            this.$tickFractions = r4;
            this.$onValueChangeFinished = r5;
            this.$onValueChangeState = r6;
            this.$startInteractionSource = r7;
            this.$endInteractionSource = r8;
            this.$enabled = r9;
            this.$steps = r10;
            this.$colors = r11;
            super(3);
        }

        public static final /* synthetic */ float access$invoke$scaleToOffset(ClosedFloatingPointRange $valueRange, Ref.FloatRef minPx, Ref.FloatRef maxPx, float userValue) {
            return invoke$scaleToOffset($valueRange, minPx, maxPx, userValue);
        }

        public static final /* synthetic */ ClosedFloatingPointRange access$invoke$scaleToUserValue(Ref.FloatRef minPx, Ref.FloatRef maxPx, ClosedFloatingPointRange $valueRange, ClosedFloatingPointRange offset) {
            return invoke$scaleToUserValue(minPx, maxPx, $valueRange, offset);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope r4, Composer r5, Integer r6) {
            invoke(r4, r5, r6.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxWithConstraintsScope $this$BoxWithConstraints, Composer $composer, int $changed) {
            ComposerKt.sourceInformation($composer, "C420@18727L7,*425@18888L7,436@19316L60,437@19404L67,440@19517L15,439@19481L164,447@19690L15,446@19654L169,454@19845L24,456@19953L1028,456@19913L1068,482@21063L985,482@21016L1032,527@23147L63,536@23477L65,542@23686L340:Slider.kt#jmzs0o");
            int $dirty = $changed;
            if (($changed & 6) == 0) goto L5;
        L9:
            int $dirty2 = $dirty;
            boolean r3 = true;
            if (($dirty2 & 19) == 18) goto L12;
            boolean r1 = true;
        L14:
            if ($composer.shouldExecute(r1, $dirty2 & 1) == true) goto L16;
            $composer.skipToGroupEnd();
            return;
        L16:
            if (ComposerKt.isTraceInProgress() == false) goto L18;
            ComposerKt.traceEventStart(652589923, $dirty2, -1, "androidx.compose.material.RangeSlider.<anonymous> (Slider.kt:420)");
        L18:
            ProvidableCompositionLocal<LayoutDirection> r2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object r10 = $composer.consume(r2);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (r10 == LayoutDirection.Rtl) goto L22;
            r3 = false;
        L22:
            boolean isRtl = r3;
            float widthPx = Constraints.m6926getMaxWidthimpl($this$BoxWithConstraints.mo630getConstraintsmsEJaDk());
            final Ref.FloatRef maxPx = new Ref.FloatRef();
            final Ref.FloatRef minPx = new Ref.FloatRef();
            ProvidableCompositionLocal<Density> r4 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object r5 = $composer.consume(r4);
            ComposerKt.sourceInformationMarkerEnd($composer);
            Density $this$invoke_u24lambda_u240 = (Density) r5;
            maxPx.element = widthPx - $this$invoke_u24lambda_u240.mo376toPx0680j_4(SliderKt.getThumbRadius());
            minPx.element = $this$invoke_u24lambda_u240.mo376toPx0680j_4(SliderKt.getThumbRadius());
            ComposerKt.sourceInformationMarkerStart($composer, 338516883, "CC(remember):Slider.kt#9igjgp");
            ClosedFloatingPointRange<Float> r6 = this.$value;
            ClosedFloatingPointRange<Float> r7 = this.$valueRange;
            Object it$iv = $composer.rememberedValue();
            if (it$iv != Composer.Companion.getEmpty()) goto L26;
            Object value$iv = PrimitiveSnapshotStateKt.mutableFloatStateOf(invoke$scaleToOffset(r7, minPx, maxPx, r6.getStart().floatValue()));
            $composer.updateRememberedValue(value$iv);
            it$iv = value$iv;
        L26:
            final MutableFloatState rawOffsetStart = (MutableFloatState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 338519706, "CC(remember):Slider.kt#9igjgp");
            ClosedFloatingPointRange<Float> r8 = this.$value;
            ClosedFloatingPointRange<Float> r9 = this.$valueRange;
            Object it$iv2 = $composer.rememberedValue();
            if (it$iv2 != Composer.Companion.getEmpty()) goto L30;
            Object value$iv2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(invoke$scaleToOffset(r9, minPx, maxPx, r8.getEndInclusive().floatValue()));
            $composer.updateRememberedValue(value$iv2);
            it$iv2 = value$iv2;
        L30:
            final MutableFloatState rawOffsetEnd = (MutableFloatState) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 338523270, "CC(remember):Slider.kt#9igjgp");
            boolean invalid$iv = ($composer.changed(this.$valueRange) | $composer.changed(minPx.element)) | $composer.changed(maxPx.element);
            ClosedFloatingPointRange<Float> r11 = this.$valueRange;
            Object it$iv3 = $composer.rememberedValue();
            if (invalid$iv == false) goto L33;
        L36:
            Object value$iv3 = (KFunction) new SliderKt$RangeSlider$2$2$1(r11, minPx, maxPx);
            $composer.updateRememberedValue(value$iv3);
            it$iv3 = value$iv3;
        L37:
            ComposerKt.sourceInformationMarkerEnd($composer);
            SliderKt.access$CorrectValueSideEffect((Function1) ((KFunction) it$iv3), this.$valueRange, RangesKt.rangeTo(minPx.element, maxPx.element), rawOffsetStart, this.$value.getStart().floatValue(), $composer, 3072);
            ComposerKt.sourceInformationMarkerStart($composer, 338528806, "CC(remember):Slider.kt#9igjgp");
            boolean invalid$iv2 = ($composer.changed(this.$valueRange) | $composer.changed(minPx.element)) | $composer.changed(maxPx.element);
            ClosedFloatingPointRange<Float> r12 = this.$valueRange;
            Object it$iv4 = $composer.rememberedValue();
            if (invalid$iv2 == false) goto L40;
        L43:
            Object value$iv4 = (KFunction) new SliderKt$RangeSlider$2$3$1(r12, minPx, maxPx);
            $composer.updateRememberedValue(value$iv4);
            it$iv4 = value$iv4;
        L44:
            ComposerKt.sourceInformationMarkerEnd($composer);
            SliderKt.access$CorrectValueSideEffect((Function1) ((KFunction) it$iv4), this.$valueRange, RangesKt.rangeTo(minPx.element, maxPx.element), rawOffsetEnd, this.$value.getEndInclusive().floatValue(), $composer, 3072);
            ComposerKt.sourceInformationMarkerStart($composer, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer, -954203484, "CC(remember):Effects.kt#9igjgp");
            Object it$iv$iv = $composer.rememberedValue();
            if (it$iv$iv != Composer.Companion.getEmpty()) goto L48;
            Object value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer);
            $composer.updateRememberedValue(value$iv$iv);
            it$iv$iv = value$iv$iv;
        L48:
            final CoroutineScope scope = (CoroutineScope) it$iv$iv;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 338538235, "CC(remember):Slider.kt#9igjgp");
            boolean invalid$iv3 = ((((($composer.changedInstance(this.$tickFractions) | $composer.changed(minPx.element)) | $composer.changed(maxPx.element)) | $composer.changed(this.$onValueChangeFinished)) | $composer.changedInstance(scope)) | $composer.changed(this.$onValueChangeState)) | $composer.changed(this.$valueRange);
            final List<Float> r13 = this.$tickFractions;
            final Function0<Unit> r14 = this.$onValueChangeFinished;
            final State<Function1<ClosedFloatingPointRange<Float>, Unit>> r15 = this.$onValueChangeState;
            final ClosedFloatingPointRange<Float> r16 = this.$valueRange;
            Object it$iv5 = $composer.rememberedValue();
            if (invalid$iv3 == true) goto L55;
            if (it$iv5 == Composer.Companion.getEmpty()) goto L55;
            Ref.FloatRef maxPx2 = maxPx;
            Ref.FloatRef minPx2 = minPx;
        L56:
            ComposerKt.sourceInformationMarkerEnd($composer);
            State gestureEndAction = SnapshotStateKt.rememberUpdatedState((Function1) it$iv5, $composer, 0);
            ComposerKt.sourceInformationMarkerStart($composer, 338573712, "CC(remember):Slider.kt#9igjgp");
            boolean invalid$iv4 = ((($composer.changed(this.$valueRange) | $composer.changed(minPx2.element)) | $composer.changed(maxPx2.element)) | $composer.changed(this.$value)) | $composer.changed(this.$onValueChangeState);
            final ClosedFloatingPointRange<Float> r17 = this.$value;
            final State<Function1<ClosedFloatingPointRange<Float>, Unit>> r18 = this.$onValueChangeState;
            final ClosedFloatingPointRange<Float> r19 = this.$valueRange;
            Object it$iv6 = $composer.rememberedValue();
            if (invalid$iv4 == true) goto L62;
            State gestureEndAction2 = gestureEndAction;
            if (it$iv6 != Composer.Companion.getEmpty()) goto L64;
        L63:
            final Ref.FloatRef maxPx3 = maxPx2;
            final Ref.FloatRef minPx3 = minPx2;
            Object value$iv5 = (Function2) new SliderKt$RangeSlider$2$onDrag$1$1(rawOffsetStart, rawOffsetEnd, r17, minPx3, maxPx3, r18, r19);
            $composer.updateRememberedValue(value$iv5);
            it$iv6 = value$iv5;
        L64:
            ComposerKt.sourceInformationMarkerEnd($composer);
            State onDrag = SnapshotStateKt.rememberUpdatedState((Function2) it$iv6, $composer, 0);
            Modifier pressDrag = SliderKt.access$rangeSliderPressDragModifier(Modifier.Companion, this.$startInteractionSource, this.$endInteractionSource, rawOffsetStart, rawOffsetEnd, this.$enabled, isRtl, widthPx, this.$valueRange, gestureEndAction2, onDrag);
            final float coercedStart = RangesKt.coerceIn(this.$value.getStart().floatValue(), this.$valueRange.getStart().floatValue(), this.$value.getEndInclusive().floatValue());
            final float coercedEnd = RangesKt.coerceIn(this.$value.getEndInclusive().floatValue(), this.$value.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue());
            float fractionStart = SliderKt.access$calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), coercedStart);
            float fractionEnd = SliderKt.access$calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), coercedEnd);
            int startSteps = (int) Math.floor(this.$steps * fractionEnd);
            int endSteps = (int) Math.floor(this.$steps * (1.0f - fractionStart));
            Modifier.Companion r32 = Modifier.Companion;
            boolean r110 = this.$enabled;
            ComposerKt.sourceInformationMarkerStart($composer, 338639478, "CC(remember):Slider.kt#9igjgp");
            boolean invalid$iv5 = $composer.changed(this.$onValueChangeState) | $composer.changed(coercedEnd);
            final State<Function1<ClosedFloatingPointRange<Float>, Unit>> r20 = this.$onValueChangeState;
            Object value$iv6 = $composer.rememberedValue();
            if (invalid$iv5 == true) goto L70;
            float fractionEnd2 = fractionEnd;
            if (value$iv6 != Composer.Companion.getEmpty()) goto L72;
        L71:
            value$iv6 = (Function1) new SliderKt$RangeSlider$2$startThumbSemantics$1$1(r20, coercedEnd);
            $composer.updateRememberedValue(value$iv6);
        L72:
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier startThumbSemantics = SliderKt.access$sliderSemantics(r32, coercedStart, r110, (Function1) value$iv6, this.$onValueChangeFinished, RangesKt.rangeTo(this.$valueRange.getStart().floatValue(), coercedEnd), startSteps);
            Modifier.Companion r33 = Modifier.Companion;
            boolean r21 = this.$enabled;
            ComposerKt.sourceInformationMarkerStart($composer, 338650040, "CC(remember):Slider.kt#9igjgp");
            boolean invalid$iv6 = $composer.changed(this.$onValueChangeState) | $composer.changed(coercedStart);
            final State<Function1<ClosedFloatingPointRange<Float>, Unit>> r111 = this.$onValueChangeState;
            Object value$iv7 = $composer.rememberedValue();
            if (invalid$iv6 == true) goto L78;
            boolean r34 = r21;
            if (value$iv7 != Composer.Companion.getEmpty()) goto L80;
        L79:
            value$iv7 = (Function1) new SliderKt$RangeSlider$2$endThumbSemantics$1$1(r111, coercedStart);
            $composer.updateRememberedValue(value$iv7);
        L80:
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier endThumbSemantics = SliderKt.access$sliderSemantics(r33, coercedEnd, r34, (Function1) value$iv7, this.$onValueChangeFinished, RangesKt.rangeTo(coercedStart, this.$valueRange.getEndInclusive().floatValue()), endSteps);
            SliderKt.access$RangeSliderImpl(this.$enabled, fractionStart, fractionEnd2, this.$tickFractions, this.$colors, maxPx2.element - minPx2.element, this.$startInteractionSource, this.$endInteractionSource, pressDrag, startThumbSemantics, endThumbSemantics, $composer, 14155776, 0);
            if (ComposerKt.isTraceInProgress() == false) goto L85;
            ComposerKt.traceEventEnd();
            return;
        L85:
            return;
        L78:
            r34 = r21;
            goto L79
        L70:
            fractionEnd2 = fractionEnd;
            goto L71
        L62:
            gestureEndAction2 = gestureEndAction;
        L55:
            Object r23 = new SliderKt$RangeSlider$2$gestureEndAction$1$1(rawOffsetStart, rawOffsetEnd, r13, minPx, maxPx, r14, scope, r15, r16);
            minPx2 = minPx;
            maxPx2 = maxPx;
            Object value$iv8 = (Function1) r23;
            $composer.updateRememberedValue(value$iv8);
            it$iv5 = value$iv8;
            goto L56
        L40:
            if (it$iv4 != Composer.Companion.getEmpty()) goto L44;
        L33:
            if (it$iv3 != Composer.Companion.getEmpty()) goto L37;
        L12:
            r1 = false;
            goto L14
        L5:
            if ($composer.changed($this$BoxWithConstraints) == false) goto L7;
            int r22 = 4;
        L8:
            $dirty = $dirty | r22;
            goto L9
        L7:
            r22 = 2;
            goto L8
        }

        private static final ClosedFloatingPointRange<Float> invoke$scaleToUserValue(Ref.FloatRef minPx, Ref.FloatRef maxPx, ClosedFloatingPointRange<Float> r6, ClosedFloatingPointRange<Float> r7) {
            return SliderKt.access$scale(minPx.element, maxPx.element, r7, r6.getStart().floatValue(), r6.getEndInclusive().floatValue());
        }

        private static final float invoke$scaleToOffset(ClosedFloatingPointRange<Float> r4, Ref.FloatRef minPx, Ref.FloatRef maxPx, float userValue) {
            return SliderKt.access$scale(r4.getStart().floatValue(), r4.getEndInclusive().floatValue(), userValue, minPx.element, maxPx.element);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$Slider$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C04412 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Function0<Unit> $onValueChangeFinished;
        final /* synthetic */ State<Function1<Float, Unit>> $onValueChangeState;
        final /* synthetic */ List<Float> $tickFractions;
        final /* synthetic */ float $value;
        final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: Multi-variable type inference failed */
        C04412(ClosedFloatingPointRange<Float> r2, float r3, List<Float> r4, Function0<Unit> r5, MutableInteractionSource r6, boolean r7, SliderColors r8, State<? extends Function1<? super Float, Unit>> r9) {
            this.$valueRange = r2;
            this.$value = r3;
            this.$tickFractions = r4;
            this.$onValueChangeFinished = r5;
            this.$interactionSource = r6;
            this.$enabled = r7;
            this.$colors = r8;
            this.$onValueChangeState = r9;
            super(3);
        }

        public static final /* synthetic */ float access$invoke$scaleToOffset(ClosedFloatingPointRange $valueRange, Ref.FloatRef minPx, Ref.FloatRef maxPx, float userValue) {
            return invoke$scaleToOffset($valueRange, minPx, maxPx, userValue);
        }

        public static final /* synthetic */ float access$invoke$scaleToUserValue(Ref.FloatRef minPx, Ref.FloatRef maxPx, ClosedFloatingPointRange $valueRange, float offset) {
            return invoke$scaleToUserValue(minPx, maxPx, $valueRange, offset);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope r4, Composer r5, Integer r6) {
            invoke(r4, r5, r6.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxWithConstraintsScope $this$BoxWithConstraints, Composer $composer, int $changed) {
            ComposerKt.sourceInformation($composer, "C196@9102L7,*201@9263L7,212@9677L24,213@9726L54,214@9807L36,217@9886L420,226@10339L15,226@10316L83,229@10482L633,229@10444L671,260@11689L55,267@12042L209:Slider.kt#jmzs0o");
            int $dirty = $changed;
            if (($changed & 6) == 0) goto L5;
        L9:
            int $dirty2 = $dirty;
            boolean r3 = true;
            if (($dirty2 & 19) == 18) goto L12;
            boolean r1 = true;
        L14:
            if ($composer.shouldExecute(r1, $dirty2 & 1) == true) goto L16;
            $composer.skipToGroupEnd();
            return;
        L16:
            if (ComposerKt.isTraceInProgress() == false) goto L18;
            ComposerKt.traceEventStart(2085116814, $dirty2, -1, "androidx.compose.material.Slider.<anonymous> (Slider.kt:196)");
        L18:
            ProvidableCompositionLocal<LayoutDirection> r2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object r9 = $composer.consume(r2);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (r9 == LayoutDirection.Rtl) goto L22;
            r3 = false;
        L22:
            boolean isRtl = r3;
            float widthPx = Constraints.m6926getMaxWidthimpl($this$BoxWithConstraints.mo630getConstraintsmsEJaDk());
            Ref.FloatRef maxPx = new Ref.FloatRef();
            final Ref.FloatRef minPx = new Ref.FloatRef();
            ProvidableCompositionLocal<Density> r4 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object r5 = $composer.consume(r4);
            ComposerKt.sourceInformationMarkerEnd($composer);
            Density $this$invoke_u24lambda_u240 = (Density) r5;
            maxPx.element = Math.max(widthPx - $this$invoke_u24lambda_u240.mo376toPx0680j_4(SliderKt.getThumbRadius()), 0.0f);
            minPx.element = Math.min($this$invoke_u24lambda_u240.mo376toPx0680j_4(SliderKt.getThumbRadius()), maxPx.element);
            ComposerKt.sourceInformationMarkerStart($composer, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer, -954203484, "CC(remember):Effects.kt#9igjgp");
            Object it$iv$iv = $composer.rememberedValue();
            if (it$iv$iv != Composer.Companion.getEmpty()) goto L26;
            Object value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer);
            $composer.updateRememberedValue(value$iv$iv);
            it$iv$iv = value$iv$iv;
        L26:
            final CoroutineScope scope = (CoroutineScope) it$iv$iv;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -2058970628, "CC(remember):Slider.kt#9igjgp");
            float r6 = this.$value;
            ClosedFloatingPointRange<Float> r7 = this.$valueRange;
            Object it$iv = $composer.rememberedValue();
            if (it$iv != Composer.Companion.getEmpty()) goto L30;
            Object value$iv = PrimitiveSnapshotStateKt.mutableFloatStateOf(invoke$scaleToOffset(r7, minPx, maxPx, r6));
            $composer.updateRememberedValue(value$iv);
            it$iv = value$iv;
        L30:
            final MutableFloatState rawOffset = (MutableFloatState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -2058968054, "CC(remember):Slider.kt#9igjgp");
            Object it$iv2 = $composer.rememberedValue();
            if (it$iv2 != Composer.Companion.getEmpty()) goto L34;
            Object value$iv2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            $composer.updateRememberedValue(value$iv2);
            it$iv2 = value$iv2;
        L34:
            final MutableFloatState pressOffset = (MutableFloatState) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -2058965142, "CC(remember):Slider.kt#9igjgp");
            boolean invalid$iv = ($composer.changed(minPx.element) | $composer.changed(maxPx.element)) | $composer.changed(this.$valueRange);
            final State<Function1<Float, Unit>> r8 = this.$onValueChangeState;
            final ClosedFloatingPointRange<Float> r10 = this.$valueRange;
            Object it$iv3 = $composer.rememberedValue();
            if (invalid$iv == true) goto L40;
            final Ref.FloatRef maxPx2 = maxPx;
            if (it$iv3 == Composer.Companion.getEmpty()) goto L41;
            Ref.FloatRef minPx2 = minPx;
            Ref.FloatRef minPx3 = maxPx2;
        L42:
            final SliderDraggableState draggableState = (SliderDraggableState) it$iv3;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -2058951051, "CC(remember):Slider.kt#9igjgp");
            boolean invalid$iv2 = ($composer.changed(this.$valueRange) | $composer.changed(minPx2.element)) | $composer.changed(minPx3.element);
            ClosedFloatingPointRange<Float> r11 = this.$valueRange;
            Object it$iv4 = $composer.rememberedValue();
            if (invalid$iv2 == true) goto L49;
            if (it$iv4 == Composer.Companion.getEmpty()) goto L49;
        L50:
            ComposerKt.sourceInformationMarkerEnd($composer);
            final Ref.FloatRef minPx4 = minPx2;
            final Ref.FloatRef maxPx3 = minPx3;
            SliderKt.access$CorrectValueSideEffect((Function1) ((KFunction) it$iv4), this.$valueRange, RangesKt.rangeTo(minPx2.element, minPx3.element), rawOffset, this.$value, $composer, 3072);
            ComposerKt.sourceInformationMarkerStart($composer, -2058945857, "CC(remember):Slider.kt#9igjgp");
            boolean invalid$iv3 = (((($composer.changedInstance(this.$tickFractions) | $composer.changed(minPx4.element)) | $composer.changed(maxPx3.element)) | $composer.changedInstance(scope)) | $composer.changedInstance(draggableState)) | $composer.changed(this.$onValueChangeFinished);
            final List<Float> r12 = this.$tickFractions;
            final Function0<Unit> r13 = this.$onValueChangeFinished;
            Object it$iv5 = $composer.rememberedValue();
            if (invalid$iv3 == true) goto L57;
            if (it$iv5 == Composer.Companion.getEmpty()) goto L57;
            SliderDraggableState draggableState2 = draggableState;
            Ref.FloatRef maxPx4 = maxPx3;
            Ref.FloatRef minPx5 = minPx4;
        L58:
            ComposerKt.sourceInformationMarkerEnd($composer);
            State gestureEndAction = SnapshotStateKt.rememberUpdatedState((Function1) it$iv5, $composer, 0);
            Modifier press = SliderKt.access$sliderTapModifier(Modifier.Companion, draggableState2, this.$interactionSource, widthPx, isRtl, rawOffset, gestureEndAction, pressOffset, this.$enabled);
            Modifier.Companion r14 = Modifier.Companion;
            Orientation r15 = Orientation.Horizontal;
            boolean r17 = draggableState2.isDragging();
            Modifier.Companion r16 = r14;
            SliderDraggableState r18 = draggableState2;
            boolean r19 = this.$enabled;
            MutableInteractionSource r20 = this.$interactionSource;
            ComposerKt.sourceInformationMarkerStart($composer, -2058907811, "CC(remember):Slider.kt#9igjgp");
            boolean invalid$iv4 = $composer.changed(gestureEndAction);
            SliderKt$Slider$2$drag$1$1 value$iv3 = $composer.rememberedValue();
            if (invalid$iv4 == false) goto L61;
        L64:
            value$iv3 = new SliderKt$Slider$2$drag$1$1(gestureEndAction, null);
            $composer.updateRememberedValue(value$iv3);
        L65:
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier drag = DraggableKt.draggable$default(r16, r18, r15, r19, r20, r17, null, (Function3) value$iv3, isRtl, 32, null);
            float coerced = RangesKt.coerceIn(this.$value, this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue());
            float fraction = SliderKt.access$calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), coerced);
            boolean r21 = this.$enabled;
            List<Float> r22 = this.$tickFractions;
            SliderColors r23 = this.$colors;
            float fraction2 = maxPx4.element - minPx5.element;
            SliderKt.access$SliderImpl(r21, fraction, r22, r23, fraction2, this.$interactionSource, press.then(drag), $composer, 0);
            if (ComposerKt.isTraceInProgress() == false) goto L70;
            ComposerKt.traceEventEnd();
            return;
        L70:
            return;
        L61:
            if (value$iv3 != Composer.Companion.getEmpty()) goto L65;
        L57:
            Object r110 = new SliderKt$Slider$2$gestureEndAction$1$1(rawOffset, r12, minPx4, maxPx3, scope, draggableState, r13);
            minPx5 = minPx4;
            maxPx4 = maxPx3;
            draggableState2 = draggableState;
            Object value$iv4 = (Function1) r110;
            $composer.updateRememberedValue(value$iv4);
            it$iv5 = value$iv4;
        L49:
            Object value$iv5 = (KFunction) new SliderKt$Slider$2$2$1(r11, minPx2, minPx3);
            $composer.updateRememberedValue(value$iv5);
            it$iv4 = value$iv5;
        L41:
            Function1<Float, Unit> r111 = new SliderKt$Slider$2$draggableState$1$1(rawOffset, pressOffset, minPx, maxPx2, r8, r10);
            minPx2 = minPx;
            minPx3 = maxPx2;
            Object value$iv6 = new SliderDraggableState(r111);
            $composer.updateRememberedValue(value$iv6);
            it$iv3 = value$iv6;
            goto L42
        L40:
            maxPx2 = maxPx;
            goto L41
        L12:
            r1 = false;
            goto L14
        L5:
            if ($composer.changed($this$BoxWithConstraints) == false) goto L7;
            int r24 = 4;
        L8:
            $dirty = $dirty | r24;
            goto L9
        L7:
            r24 = 2;
            goto L8
        }

        private static final float invoke$scaleToUserValue(Ref.FloatRef minPx, Ref.FloatRef maxPx, ClosedFloatingPointRange<Float> r6, float offset) {
            return SliderKt.access$scale(minPx.element, maxPx.element, offset, r6.getStart().floatValue(), r6.getEndInclusive().floatValue());
        }

        private static final float invoke$scaleToOffset(ClosedFloatingPointRange<Float> r4, Ref.FloatRef minPx, Ref.FloatRef maxPx, float userValue) {
            return SliderKt.access$scale(r4.getStart().floatValue(), r4.getEndInclusive().floatValue(), userValue, minPx.element, maxPx.element);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$animateToTarget$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/DragScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SliderKt$animateToTarget$2", f = "Slider.kt", i = {}, l = {1053}, m = "invokeSuspend", n = {}, s = {})
    static final class C04452 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $current;
        final /* synthetic */ float $target;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        int label;

        C04452(float r2, float r3, float r4, Continuation<? super C04452> r5) {
            this.$current = r2;
            this.$target = r3;
            this.$velocity = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            C04452 r0 = new C04452(this.$current, this.$target, this.$velocity, r6);
            r0.L$0 = r5;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(DragScope r3, Continuation<? super Unit> r4) {
            return ((C04452) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(DragScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
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
            final DragScope $this$drag = (DragScope) this.L$0;
            final Ref.FloatRef latestValue = new Ref.FloatRef();
            latestValue.element = this.$current;
            this.label = 1;
            if (AnimatableKt.Animatable$default(this.$current, 0.0f, 2, null).animateTo(Boxing.boxFloat(this.$target), SliderKt.access$getSliderToTickAnimation$p(), Boxing.boxFloat(this.$velocity), new AnonymousClass1($this$drag, latestValue), this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1, reason: invalid class name */
    /* JADX INFO: compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", i = {}, l = {1082}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableInteractionSource $endInteractionSource;
        final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
        final /* synthetic */ boolean $isRtl;
        final /* synthetic */ float $maxPx;
        final /* synthetic */ State<Function2<Boolean, Float, Unit>> $onDrag;
        final /* synthetic */ State<Float> $rawOffsetEnd;
        final /* synthetic */ State<Float> $rawOffsetStart;
        final /* synthetic */ MutableInteractionSource $startInteractionSource;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Slider.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", i = {}, l = {1083}, m = "invokeSuspend", n = {}, s = {})
        static final class C00811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $$this$pointerInput;
            final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
            final /* synthetic */ boolean $isRtl;
            final /* synthetic */ float $maxPx;
            final /* synthetic */ State<Function2<Boolean, Float, Unit>> $onDrag;
            final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
            final /* synthetic */ State<Float> $rawOffsetEnd;
            final /* synthetic */ State<Float> $rawOffsetStart;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: Slider.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", i = {0, 1, 1, 1, 1, 1, 2, 2}, l = {1084, 1095, 1117}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", NotificationCompat.CATEGORY_EVENT, "interaction", "posX", "draggingStart", "interaction", "draggingStart"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
            static final class C00821 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ CoroutineScope $$this$coroutineScope;
                final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
                final /* synthetic */ boolean $isRtl;
                final /* synthetic */ float $maxPx;
                final /* synthetic */ State<Function2<Boolean, Float, Unit>> $onDrag;
                final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                final /* synthetic */ State<Float> $rawOffsetEnd;
                final /* synthetic */ State<Float> $rawOffsetStart;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                int label;

                /* JADX INFO: renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Slider.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", i = {}, l = {1135}, m = "invokeSuspend", n = {}, s = {})
                static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ Ref.BooleanRef $draggingStart;
                    final /* synthetic */ DragInteraction $finishInteraction;
                    final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                    int label;

                    AnonymousClass2(RangeSliderLogic r2, Ref.BooleanRef r3, DragInteraction r4, Continuation<? super AnonymousClass2> r5) {
                        this.$rangeSliderLogic = r2;
                        this.$draggingStart = r3;
                        this.$finishInteraction = r4;
                        super(2, r5);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
                        return new AnonymousClass2(this.$rangeSliderLogic, this.$draggingStart, this.$finishInteraction, r6);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                        return invoke2(r2, r3);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                        return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
                        this.label = 1;
                        if (this.$rangeSliderLogic.activeInteraction(this.$draggingStart.element).emit(this.$finishInteraction, this) != r0) goto L11;
                        return r0;
                    L5:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C00821(boolean r2, float r3, RangeSliderLogic r4, State<Float> r5, CoroutineScope r6, State<? extends Function1<? super Boolean, Unit>> r7, State<Float> r8, State<? extends Function2<? super Boolean, ? super Float, Unit>> r9, Continuation<? super C00821> r10) {
                    this.$isRtl = r2;
                    this.$maxPx = r3;
                    this.$rangeSliderLogic = r4;
                    this.$rawOffsetStart = r5;
                    this.$$this$coroutineScope = r6;
                    this.$gestureEndAction = r7;
                    this.$rawOffsetEnd = r8;
                    this.$onDrag = r9;
                    super(2, r10);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object r11, Continuation<?> r12) {
                    C00821 r0 = new C00821(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, r12);
                    r0.L$0 = r11;
                    return r0;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(AwaitPointerEventScope r3, Continuation<? super Unit> r4) {
                    return ((C00821) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(AwaitPointerEventScope r2, Continuation<? super Unit> r3) {
                    return invoke2(r2, r3);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object $result) {
                    Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch(this.label) {
                        case 0: goto L13;
                        case 1: goto L12;
                        case 2: goto L11;
                        case 3: goto L6;
                        default: goto L5;
                    };
                L6:
                    Object $result2 = $result;
                    Ref.BooleanRef draggingStart = (Ref.BooleanRef) this.L$1;
                    DragInteraction.Start interaction = (DragInteraction.Start) this.L$0;
                    ResultKt.throwOnFailure($result2);     // Catch: CancellationException -> L9
                    Object $result3 = $result2;
                L75:
                    boolean success = ((Boolean) $result2).booleanValue();     // Catch: CancellationException -> L65
                    if (success == false) goto L63;
                    DragInteraction.Cancel finishInteraction = new DragInteraction.Stop(interaction);     // Catch: CancellationException -> L65
                L74:
                L70:
                    this.$gestureEndAction.getValue().invoke(Boxing.boxBoolean(draggingStart.element));
                    BuildersKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, draggingStart, finishInteraction, null), 3, null);
                    return Unit.INSTANCE;
                L63:
                    finishInteraction = new DragInteraction.Cancel(interaction);     // Catch: CancellationException -> L65
                L66:
                    $result2 = $result3;
                L69:
                    finishInteraction = new DragInteraction.Cancel(interaction);
                    goto L70
                L11:
                    Object $result4 = $result;
                    Ref.BooleanRef draggingStart2 = (Ref.BooleanRef) this.L$4;
                    Ref.FloatRef posX = (Ref.FloatRef) this.L$3;
                    DragInteraction.Start interaction2 = (DragInteraction.Start) this.L$2;
                    PointerInputChange event = (PointerInputChange) this.L$1;
                    AwaitPointerEventScope $this$awaitEachGesture = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure($result4);
                    final Ref.BooleanRef draggingStart3 = draggingStart2;
                    $result3 = $result4;
                L34:
                    Pair it = (Pair) $result4;
                    if (it == null) goto L55;
                    State<Float> r12 = this.$rawOffsetEnd;
                    State<Float> r13 = this.$rawOffsetStart;
                    boolean r14 = this.$isRtl;
                    float slop = DragGestureDetectorCopyKt.m1645pointerSlopE8SPZFQ($this$awaitEachGesture.getViewConfiguration(), event.m5592getTypeT8wyACA());
                    if (Math.abs(r12.getValue().floatValue() - posX.element) < slop) goto L39;
                L41:
                    boolean shouldUpdateCapturedThumb = false;
                L43:
                    if (shouldUpdateCapturedThumb == false) goto L55;
                    float dir = ((Number) it.getSecond()).floatValue();
                    if (r14 == false) goto L50;
                    if (dir >= 0.0f) goto L51;
                L52:
                    boolean r4 = false;
                L53:
                    draggingStart3.element = r4;
                    posX.element += Offset.m4125getXimpl(PointerEventKt.positionChange((PointerInputChange) it.getFirst()));
                L51:
                    r4 = true;
                    goto L53
                L50:
                    if (dir >= 0.0f) goto L52;
                L39:
                    if (Math.abs(r13.getValue().floatValue() - posX.element) >= slop) goto L41;
                    shouldUpdateCapturedThumb = true;
                L55:
                    this.$rangeSliderLogic.captureThumb(draggingStart3.element, posX.element, interaction2, this.$$this$coroutineScope);
                    long r5 = event.m5587getIdJ3iCeTQ();     // Catch: CancellationException -> L67
                    final State<Function2<Boolean, Float, Unit>> r7 = this.$onDrag;     // Catch: CancellationException -> L67
                    final boolean r15 = this.$isRtl;     // Catch: CancellationException -> L67
                    this.L$0 = interaction2;     // Catch: CancellationException -> L67
                    this.L$1 = draggingStart3;     // Catch: CancellationException -> L67
                    this.L$2 = null;     // Catch: CancellationException -> L67
                    this.L$3 = null;     // Catch: CancellationException -> L67
                    this.L$4 = null;     // Catch: CancellationException -> L67
                    this.label = 3;     // Catch: CancellationException -> L67
                    $result2 = DragGestureDetectorKt.m433horizontalDragjO51t88($this$awaitEachGesture, r5, new SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1(r7, draggingStart3, r15), this);     // Catch: CancellationException -> L67
                    if ($result2 != r0) goto L59;
                    return r0;
                L59:
                    interaction = interaction2;
                    draggingStart = draggingStart3;
                L68:
                    $result2 = $result3;
                    interaction = interaction2;
                    draggingStart = draggingStart3;
                    goto L69
                L12:
                    Object $result5 = $result;
                    AwaitPointerEventScope $this$awaitEachGesture2 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure($result5);
                    $this$awaitEachGesture = $this$awaitEachGesture2;
                    $result3 = $result5;
                L17:
                    event = (PointerInputChange) $result5;
                    DragInteraction.Start interaction3 = new DragInteraction.Start();
                    posX = new Ref.FloatRef();
                    if (this.$isRtl == false) goto L20;
                    float r8 = this.$maxPx - Offset.m4125getXimpl(event.m5589getPositionF1C5BW0());
                L21:
                    posX.element = r8;
                    int compare = this.$rangeSliderLogic.compareOffsets(posX.element);
                    draggingStart3 = new Ref.BooleanRef();
                    if (compare == 0) goto L27;
                    if (compare >= 0) goto L25;
                    boolean r9 = true;
                L30:
                    draggingStart3.element = r9;
                    this.L$0 = $this$awaitEachGesture;
                    this.L$1 = event;
                    this.L$2 = interaction3;
                    this.L$3 = posX;
                    this.L$4 = draggingStart3;
                    this.label = 2;
                    Object r10 = SliderKt.m1759access$awaitSlop8vUncbI($this$awaitEachGesture, event.m5587getIdJ3iCeTQ(), event.m5592getTypeT8wyACA(), this);
                    if (r10 != r0) goto L33;
                    return r0;
                L33:
                    interaction2 = interaction3;
                    $result4 = r10;
                    goto L34
                L25:
                    r9 = false;
                    goto L30
                L27:
                    if (this.$rawOffsetStart.getValue().floatValue() <= posX.element) goto L29;
                    r9 = true;
                    goto L30
                L29:
                    r9 = false;
                    goto L30
                L20:
                    r8 = Offset.m4125getXimpl(event.m5589getPositionF1C5BW0());
                    goto L21
                L13:
                    ResultKt.throwOnFailure($result);
                    AwaitPointerEventScope $this$awaitEachGesture3 = (AwaitPointerEventScope) this.L$0;
                    this.L$0 = $this$awaitEachGesture3;
                    this.label = 1;
                    Object r6 = TapGestureDetectorKt.awaitFirstDown$default($this$awaitEachGesture3, false, null, this, 2, null);
                    if (r6 != r0) goto L16;
                    return r0;
                L16:
                    $result3 = $result;
                    $result5 = r6;
                    $this$awaitEachGesture = $this$awaitEachGesture3;
                    goto L17
                L5:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C00811(PointerInputScope r2, boolean r3, float r4, RangeSliderLogic r5, State<Float> r6, State<? extends Function1<? super Boolean, Unit>> r7, State<Float> r8, State<? extends Function2<? super Boolean, ? super Float, Unit>> r9, Continuation<? super C00811> r10) {
                this.$$this$pointerInput = r2;
                this.$isRtl = r3;
                this.$maxPx = r4;
                this.$rangeSliderLogic = r5;
                this.$rawOffsetStart = r6;
                this.$gestureEndAction = r7;
                this.$rawOffsetEnd = r8;
                this.$onDrag = r9;
                super(2, r10);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r11, Continuation<?> r12) {
                C00811 r0 = new C00811(this.$$this$pointerInput, this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, r12);
                r0.L$0 = r11;
                return r0;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                return invoke2(r2, r3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                return ((C00811) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(this.$$this$pointerInput, new C00821(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, $this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null), this) != r0) goto L11;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(MutableInteractionSource r2, MutableInteractionSource r3, State<Float> r4, State<Float> r5, State<? extends Function2<? super Boolean, ? super Float, Unit>> r6, boolean r7, float r8, State<? extends Function1<? super Boolean, Unit>> r9, Continuation<? super AnonymousClass1> r10) {
            this.$startInteractionSource = r2;
            this.$endInteractionSource = r3;
            this.$rawOffsetStart = r4;
            this.$rawOffsetEnd = r5;
            this.$onDrag = r6;
            this.$isRtl = r7;
            this.$maxPx = r8;
            this.$gestureEndAction = r9;
            super(2, r10);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r11, Continuation<?> r12) {
            AnonymousClass1 r0 = new AnonymousClass1(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag, this.$isRtl, this.$maxPx, this.$gestureEndAction, r12);
            r0.L$0 = r11;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(PointerInputScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(PointerInputScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
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
            PointerInputScope $this$pointerInput = (PointerInputScope) this.L$0;
            RangeSliderLogic rangeSliderLogic = new RangeSliderLogic(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(new C00811($this$pointerInput, this.$isRtl, this.$maxPx, rangeSliderLogic, this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null), this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final /* synthetic */ void access$CorrectValueSideEffect(Function1 scaleToOffset, ClosedFloatingPointRange valueRange, ClosedFloatingPointRange trackRange, MutableState valueState, float value, Composer $composer, int $changed) {
        CorrectValueSideEffect(scaleToOffset, valueRange, trackRange, valueState, value, $composer, $changed);
    }

    public static final /* synthetic */ void access$RangeSliderImpl(boolean enabled, float positionFractionStart, float positionFractionEnd, List tickFractions, SliderColors colors, float width, MutableInteractionSource startInteractionSource, MutableInteractionSource endInteractionSource, Modifier modifier, Modifier startThumbSemantics, Modifier endThumbSemantics, Composer $composer, int $changed, int $changed1) {
        RangeSliderImpl(enabled, positionFractionStart, positionFractionEnd, tickFractions, colors, width, startInteractionSource, endInteractionSource, modifier, startThumbSemantics, endThumbSemantics, $composer, $changed, $changed1);
    }

    public static final /* synthetic */ void access$SliderImpl(boolean enabled, float positionFraction, List tickFractions, SliderColors colors, float width, MutableInteractionSource interactionSource, Modifier modifier, Composer $composer, int $changed) {
        SliderImpl(enabled, positionFraction, tickFractions, colors, width, interactionSource, modifier, $composer, $changed);
    }

    /* JADX INFO: renamed from: access$SliderThumb-PcYyNuk, reason: not valid java name */
    public static final /* synthetic */ void m1758access$SliderThumbPcYyNuk(BoxScope $receiver, Modifier modifier, float offset, MutableInteractionSource interactionSource, SliderColors colors, boolean enabled, float thumbSize, Composer $composer, int $changed) {
        m1757SliderThumbPcYyNuk($receiver, modifier, offset, interactionSource, colors, enabled, thumbSize, $composer, $changed);
    }

    public static final /* synthetic */ void access$Track(Modifier modifier, SliderColors colors, boolean enabled, float positionFractionStart, float positionFractionEnd, List tickFractions, float thumbPx, float trackStrokeWidth, Composer $composer, int $changed) {
        Track(modifier, colors, enabled, positionFractionStart, positionFractionEnd, tickFractions, thumbPx, trackStrokeWidth, $composer, $changed);
    }

    public static final /* synthetic */ Object access$animateToTarget(DraggableState draggableState, float current, float target, float velocity, Continuation $completion) {
        return animateToTarget(draggableState, current, target, velocity, $completion);
    }

    /* JADX INFO: renamed from: access$awaitSlop-8vUncbI, reason: not valid java name */
    public static final /* synthetic */ Object m1759access$awaitSlop8vUncbI(AwaitPointerEventScope $receiver, long id, int type, Continuation $completion) {
        return m1760awaitSlop8vUncbI($receiver, id, type, $completion);
    }

    public static final /* synthetic */ float access$calcFraction(float a, float b, float pos) {
        return calcFraction(a, b, pos);
    }

    public static final /* synthetic */ TweenSpec access$getSliderToTickAnimation$p() {
        return SliderToTickAnimation;
    }

    public static final /* synthetic */ Modifier access$rangeSliderPressDragModifier(Modifier $receiver, MutableInteractionSource startInteractionSource, MutableInteractionSource endInteractionSource, State rawOffsetStart, State rawOffsetEnd, boolean enabled, boolean isRtl, float maxPx, ClosedFloatingPointRange valueRange, State gestureEndAction, State onDrag) {
        return rangeSliderPressDragModifier($receiver, startInteractionSource, endInteractionSource, rawOffsetStart, rawOffsetEnd, enabled, isRtl, maxPx, valueRange, gestureEndAction, onDrag);
    }

    public static final /* synthetic */ float access$scale(float a1, float b1, float x1, float a2, float b2) {
        return scale(a1, b1, x1, a2, b2);
    }

    public static final /* synthetic */ ClosedFloatingPointRange access$scale(float a1, float b1, ClosedFloatingPointRange x, float a2, float b2) {
        return scale(a1, b1, x, a2, b2);
    }

    public static final /* synthetic */ Modifier access$sliderSemantics(Modifier $receiver, float value, boolean enabled, Function1 onValueChange, Function0 onValueChangeFinished, ClosedFloatingPointRange valueRange, int steps) {
        return sliderSemantics($receiver, value, enabled, onValueChange, onValueChangeFinished, valueRange, steps);
    }

    public static final /* synthetic */ Modifier access$sliderTapModifier(Modifier $receiver, DraggableState draggableState, MutableInteractionSource interactionSource, float maxPx, boolean isRtl, State rawOffset, State gestureEndAction, MutableState pressOffset, boolean enabled) {
        return sliderTapModifier($receiver, draggableState, interactionSource, maxPx, isRtl, rawOffset, gestureEndAction, pressOffset, enabled);
    }

    public static final /* synthetic */ float access$snapValueToTick(float current, List tickFractions, float minPx, float maxPx) {
        return snapValueToTick(current, tickFractions, minPx, maxPx);
    }

    public static final void Slider(final float value, final Function1<? super Float, Unit> r40, Modifier modifier, boolean enabled, ClosedFloatingPointRange<Float> r43, int steps, Function0<Unit> r45, MutableInteractionSource interactionSource, SliderColors colors, Composer $composer, final int $changed, final int r50) {
        Composer $composer2 = $composer.startRestartGroup(-1962335196);
        ComposerKt.sourceInformation($composer2, "C(Slider)P(7,4,3,1,8,6,5,2)169@8135L35,170@8208L43,171@8276L47,191@8928L7,195@9059L3198,173@8329L3928:Slider.kt#jmzs0o");
        int $dirty = $changed;
        if ((r50 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        float r4 = value;
    L14:
        if ((r50 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L23:
        int r5 = r50 & 4;
        if (r5 == 0) goto L27;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L34:
        int r7 = r50 & 8;
        if (r7 == 0) goto L38;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L46:
        if (($changed & 24576) == 0) goto L48;
        ClosedFloatingPointRange<Float> r9 = r43;
    L56:
        int r12 = r50 & 32;
        if (r12 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        int steps2 = steps;
    L67:
        int r15 = r50 & 64;
        if (r15 == 0) goto L71;
        $dirty = $dirty | 1572864;
    L78:
        int steps3 = r50 & 128;
        if (steps3 == 0) goto L82;
        $dirty = $dirty | 12582912;
    L90:
        if (($changed & 100663296) != 0) goto L100;
        if ((r50 & 256) != 0) goto L97;
        if ($composer2.changed(colors) == false) goto L97;
        int r17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty = $dirty | r17;
    L97:
        r17 = 33554432;
    L100:
        int $dirty2 = $dirty;
        boolean r37 = false;
        if (($dirty & 38347923) == 38347922) goto L103;
        boolean r0 = true;
    L105:
        if ($composer2.shouldExecute(r0, $dirty2 & 1) == false) goto L177;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "164@7921L8");
        if (($changed & 1) != 0) goto L109;
    L119:
        if (r5 == 0) goto L121;
        modifier2 = Modifier.Companion;
    L121:
        if (r7 == 0) goto L124;
        enabled2 = true;
    L124:
        if ((r50 & 16) == 0) goto L126;
        int $dirty3 = $dirty2 & (-57345);
        r9 = RangesKt.rangeTo(0.0f, 1.0f);
    L127:
        if (r12 == 0) goto L129;
        int steps4 = 0;
    L130:
        if (r15 == 0) goto L132;
        Function0<Unit> r8 = null;
    L133:
        if (steps3 == 0) goto L135;
        MutableInteractionSource interactionSource2 = null;
    L137:
        if ((r50 & 256) == 0) goto L139;
        Composer $composer3 = $composer2;
        $dirty3 = $dirty3 & (-234881025);
        steps2 = steps4;
        boolean enabled3 = enabled2;
        SliderColors colors2 = SliderDefaults.INSTANCE.m1756colorsq0g_0yA(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, $composer2, 0, 6, 1023);
    L140:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L144;
        ComposerKt.traceEventStart(-1962335196, $dirty3, -1, "androidx.compose.material.Slider (Slider.kt:165)");
    L144:
        if (interactionSource2 != null) goto L150;
        $composer3.startReplaceGroup(246381876);
        ComposerKt.sourceInformation($composer3, "167@8015L39");
        ComposerKt.sourceInformationMarkerStart($composer3, -407694194, "CC(remember):Slider.kt#9igjgp");
        Composer $this$cache$iv = $composer3;
        Object it$iv = $this$cache$iv.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L149;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $this$cache$iv.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L149:
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endReplaceGroup();
        MutableInteractionSource r18 = (MutableInteractionSource) it$iv;
    L151:
        MutableInteractionSource interactionSource3 = r18;
        if (steps2 < 0) goto L154;
        boolean r3 = true;
    L155:
        if (r3 == false) goto L176;
        State onValueChangeState = SnapshotStateKt.rememberUpdatedState(r40, $composer3, ($dirty3 >> 3) & 14);
        State onValueChangeFinishedState = SnapshotStateKt.rememberUpdatedState(r8, $composer3, ($dirty3 >> 18) & 14);
        ComposerKt.sourceInformationMarkerStart($composer3, -407685834, "CC(remember):Slider.kt#9igjgp");
        if ((458752 & $dirty3) != 131072) goto L159;
        boolean invalid$iv = true;
    L160:
        Composer $this$cache$iv2 = $composer3;
        Object it$iv2 = $this$cache$iv2.rememberedValue();
        if (invalid$iv == true) goto L167;
        if (it$iv2 == Composer.Companion.getEmpty()) goto L167;
    L168:
        List tickFractions = (List) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer3);
        Modifier r1 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
        float arg0$iv = ThumbRadius;
        float r2 = Dp.m6973constructorimpl(2 * arg0$iv);
        float arg0$iv2 = ThumbRadius;
        Function0<Unit> r46 = r8;
        boolean enabled4 = enabled3;
        Modifier r6 = FocusableKt.focusable(sliderSemantics(SizeKt.m768requiredSizeInqDBjuR0$default(r1, r2, Dp.m6973constructorimpl(2 * arg0$iv2), 0.0f, 0.0f, 12, null), r4, enabled4, r40, r46, r9, steps2), enabled4, interactionSource3);
        ProvidableCompositionLocal<LayoutDirection> r10 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r11 = $composer3.consume(r10);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (r11 != LayoutDirection.Rtl) goto L171;
        r37 = true;
    L171:
        int steps5 = steps2;
        Composer $composer4 = $composer3;
        BoxWithConstraintsKt.BoxWithConstraints(slideOnKeyEvents(r6, enabled4, steps5, r9, value, r37, onValueChangeState, onValueChangeFinishedState), null, false, ComposableLambdaKt.rememberComposableLambda(2085116814, true, new C04412(r9, value, tickFractions, r46, interactionSource3, enabled4, colors2, onValueChangeState), $composer4, 54), $composer4, 3072, 6);
        Composer $composer5 = $composer4;
        if (ComposerKt.isTraceInProgress() == false) goto L174;
        ComposerKt.traceEventEnd();
    L174:
        final Modifier modifier3 = modifier2;
        final boolean enabled5 = enabled4;
        final ClosedFloatingPointRange<Float> r13 = r9;
        final Function0<Unit> r14 = r46;
        final SliderColors colors3 = colors2;
        final MutableInteractionSource interactionSource4 = interactionSource2;
        final int steps6 = steps5;
    L178:
        ScopeUpdateScope r16 = $composer5.endRestartGroup();
        if (r16 == null) goto L182;
        r16.updateScope(new C04423(value, r40, modifier3, enabled5, r13, steps6, r14, interactionSource4, colors3, $changed, r50));
        return;
    L182:
        return;
    L167:
        Object value$iv2 = stepsToTickFractions(steps2);
        $this$cache$iv2.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
        goto L168
    L159:
        invalid$iv = false;
        goto L160
    L176:
        throw new IllegalArgumentException("steps should be >= 0".toString());
    L154:
        r3 = false;
        goto L155
    L150:
        $composer3.startReplaceGroup(-407694845);
        $composer3.endReplaceGroup();
        r18 = interactionSource2;
        goto L151
    L139:
        $composer3 = $composer2;
        colors2 = colors;
        steps2 = steps4;
        enabled3 = enabled2;
        goto L140
    L135:
        interactionSource2 = interactionSource;
        goto L137
    L132:
        r8 = r45;
        goto L133
    L129:
        steps4 = steps2;
        goto L130
    L126:
        $dirty3 = $dirty2;
        goto L127
    L109:
        if ($composer2.getDefaultsInvalid() == true) goto L119;
        $composer2.skipToGroupEnd();
        if ((r50 & 16) == 0) goto L114;
        int $dirty4 = $dirty2 & (-57345);
    L116:
        if ((r50 & 256) == 0) goto L118;
        $dirty4 = $dirty4 & (-234881025);
    L118:
        $composer3 = $composer2;
        r8 = r45;
        interactionSource2 = interactionSource;
        colors2 = colors;
        $dirty3 = $dirty4;
        enabled3 = enabled2;
        goto L140
    L114:
        $dirty4 = $dirty2;
        goto L116
    L177:
        $composer5 = $composer2;
        $composer5.skipToGroupEnd();
        r14 = r45;
        modifier3 = modifier2;
        enabled5 = enabled2;
        r13 = r9;
        steps6 = steps2;
        interactionSource4 = interactionSource;
        colors3 = colors;
        goto L178
    L103:
        r0 = false;
        goto L105
    L82:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changed(interactionSource) == false) goto L86;
        int r19 = 8388608;
    L87:
        $dirty = $dirty | r19;
        goto L90
    L86:
        r19 = 4194304;
        goto L87
    L71:
        if (($changed & 1572864) != 0) goto L78;
        if ($composer2.changedInstance(r45) == false) goto L75;
        int r110 = 1048576;
    L76:
        $dirty = $dirty | r110;
        goto L78
    L75:
        r110 = 524288;
        goto L76
    L60:
        if ((196608 & $changed) != 0) goto L66;
        steps2 = steps;
        if ($composer2.changed(steps2) == false) goto L64;
        int r111 = 131072;
    L65:
        $dirty = $dirty | r111;
        goto L67
    L64:
        r111 = 65536;
        goto L65
    L66:
        steps2 = steps;
        goto L67
    L48:
        if ((r50 & 16) != 0) goto L52;
        r9 = r43;
        if ($composer2.changed(r9) == false) goto L53;
        int r112 = 16384;
    L54:
        $dirty = $dirty | r112;
    L53:
        r112 = 8192;
        goto L54
    L52:
        r9 = r43;
        goto L53
    L38:
        if (($changed & 3072) != 0) goto L44;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L42;
        int r20 = 2048;
    L43:
        $dirty = $dirty | r20;
        goto L46
    L42:
        r20 = 1024;
        goto L43
    L44:
        enabled2 = enabled;
        goto L46
    L27:
        if (($changed & 384) != 0) goto L33;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L31;
        int r21 = 256;
    L32:
        $dirty = $dirty | r21;
        goto L34
    L31:
        r21 = 128;
        goto L32
    L33:
        modifier2 = modifier;
        goto L34
    L17:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changedInstance(r40) == false) goto L21;
        int r22 = 32;
    L22:
        $dirty = $dirty | r22;
        goto L23
    L21:
        r22 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r4 = value;
        if ($composer2.changed(r4) == false) goto L10;
        int r23 = 4;
    L11:
        $dirty = $dirty | r23;
        goto L14
    L10:
        r23 = 2;
        goto L11
    L12:
        r4 = value;
        goto L14
    }

    private static final Modifier slideOnKeyEvents(Modifier $this$slideOnKeyEvents, final boolean enabled, final int steps, final ClosedFloatingPointRange<Float> r12, final float value, final boolean isRtl, final State<? extends Function1<? super Float, Unit>> r15, final State<? extends Function0<Unit>> r16) {
        if (steps < 0) goto L4;
        boolean r0 = true;
    L5:
        if (r0 == false) goto L9;
        return KeyInputModifierKt.onKeyEvent($this$slideOnKeyEvents, new C04462(enabled, r12, steps, r15, value, isRtl, r16));
    L9:
        throw new IllegalArgumentException("steps should be >= 0".toString());
    L4:
        r0 = false;
        goto L5
    }

    public static final void RangeSlider(final ClosedFloatingPointRange<Float> r38, final Function1<? super ClosedFloatingPointRange<Float>, Unit> r39, Modifier modifier, boolean enabled, ClosedFloatingPointRange<Float> r42, int steps, Function0<Unit> r44, SliderColors colors, Composer $composer, final int $changed, final int r48) {
        Composer $composer2 = $composer.startRestartGroup(-1556183027);
        ComposerKt.sourceInformation($composer2, "C(RangeSlider)P(6,3,2,1,7,5,4)407@18147L39,408@18244L39,411@18365L35,412@18425L47,419@18684L5348,414@18478L5554:Slider.kt#jmzs0o");
        int $dirty = $changed;
        if ((r48 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        ClosedFloatingPointRange<Float> r4 = r38;
    L14:
        if ((r48 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L23:
        int r5 = r48 & 4;
        if (r5 == 0) goto L27;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L34:
        int r7 = r48 & 8;
        if (r7 == 0) goto L38;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L46:
        if (($changed & 24576) == 0) goto L48;
        ClosedFloatingPointRange<Float> r11 = r42;
    L56:
        int r12 = r48 & 32;
        if (r12 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        int r14 = steps;
    L67:
        int r15 = r48 & 64;
        if (r15 == 0) goto L71;
        $dirty = $dirty | 1572864;
        Function0<Unit> r13 = r44;
    L79:
        if (($changed & 12582912) != 0) goto L89;
        if ((r48 & 128) != 0) goto L86;
        if ($composer2.changed(colors) == false) goto L86;
        int r16 = 8388608;
    L87:
        $dirty = $dirty | r16;
    L86:
        r16 = 4194304;
    L89:
        int $dirty2 = $dirty;
        boolean invalid$iv = false;
        if (($dirty & 4793491) == 4793490) goto L92;
        boolean r0 = true;
    L94:
        if ($composer2.shouldExecute(r0, $dirty2 & 1) == false) goto L157;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "405@18075L8");
        if (($changed & 1) != 0) goto L98;
    L107:
        if (r5 == 0) goto L109;
        modifier2 = Modifier.Companion;
    L109:
        if (r7 == 0) goto L112;
        enabled2 = true;
    L112:
        if ((r48 & 16) == 0) goto L114;
        ClosedFloatingPointRange<Float> r1 = RangesKt.rangeTo(0.0f, 1.0f);
        int $dirty3 = $dirty2 & (-57345);
    L115:
        if (r12 == 0) goto L117;
        int steps2 = 0;
    L118:
        if (r15 == 0) goto L120;
        Function0<Unit> r37 = null;
    L122:
        if ((r48 & 128) == 0) goto L124;
        Composer $composer3 = $composer2;
        $dirty3 = $dirty3 & (-29360129);
        int steps3 = steps2;
        boolean enabled3 = enabled2;
        SliderColors colors2 = SliderDefaults.INSTANCE.m1756colorsq0g_0yA(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, $composer2, 0, 6, 1023);
        Function0<Unit> r17 = r37;
        r11 = r1;
    L125:
        $composer3.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L128;
        ComposerKt.traceEventStart(-1556183027, $dirty3, -1, "androidx.compose.material.RangeSlider (Slider.kt:406)");
    L128:
        ComposerKt.sourceInformationMarkerStart($composer3, 394988383, "CC(remember):Slider.kt#9igjgp");
        Composer $this$cache$iv = $composer3;
        Object it$iv = $this$cache$iv.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L132;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $this$cache$iv.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L132:
        MutableInteractionSource startInteractionSource = (MutableInteractionSource) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerStart($composer3, 394991487, "CC(remember):Slider.kt#9igjgp");
        Composer $this$cache$iv2 = $composer3;
        Object it$iv2 = $this$cache$iv2.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L136;
        Object value$iv2 = InteractionSourceKt.MutableInteractionSource();
        $this$cache$iv2.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L136:
        MutableInteractionSource endInteractionSource = (MutableInteractionSource) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (steps3 < 0) goto L139;
        boolean r2 = true;
    L140:
        if (r2 == false) goto L156;
        State onValueChangeState = SnapshotStateKt.rememberUpdatedState(r39, $composer3, ($dirty3 >> 3) & 14);
        ComposerKt.sourceInformationMarkerStart($composer3, 394997287, "CC(remember):Slider.kt#9igjgp");
        if ((458752 & $dirty3) != 131072) goto L144;
        invalid$iv = true;
    L144:
        Composer $this$cache$iv3 = $composer3;
        Object it$iv3 = $this$cache$iv3.rememberedValue();
        if (invalid$iv == false) goto L147;
    L150:
        Object value$iv3 = stepsToTickFractions(steps3);
        $this$cache$iv3.updateRememberedValue(value$iv3);
        it$iv3 = value$iv3;
    L151:
        List tickFractions = (List) it$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer3);
        Modifier r3 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
        float arg0$iv = ThumbRadius;
        float arg0$iv2 = Dp.m6973constructorimpl(4 * arg0$iv);
        float arg0$iv3 = ThumbRadius;
        Composer $composer4 = $composer3;
        ClosedFloatingPointRange<Float> r18 = r11;
        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m768requiredSizeInqDBjuR0$default(r3, arg0$iv2, Dp.m6973constructorimpl(2 * arg0$iv3), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.rememberComposableLambda(652589923, true, new C04392(r18, r4, tickFractions, r17, onValueChangeState, startInteractionSource, endInteractionSource, enabled3, steps3, colors2), $composer4, 54), $composer4, 3072, 6);
        Composer $composer5 = $composer4;
        if (ComposerKt.isTraceInProgress() == false) goto L154;
        ComposerKt.traceEventEnd();
    L154:
        final Modifier modifier3 = modifier2;
        final ClosedFloatingPointRange<Float> r6 = r18;
        final Function0<Unit> r8 = r17;
        final boolean enabled4 = enabled3;
        final int steps4 = steps3;
        final SliderColors colors3 = colors2;
    L158:
        ScopeUpdateScope r19 = $composer5.endRestartGroup();
        if (r19 == null) goto L162;
        r19.updateScope(new AnonymousClass3(r38, r39, modifier3, enabled4, r6, steps4, r8, colors3, $changed, r48));
        return;
    L162:
        return;
    L147:
        if (it$iv3 != Composer.Companion.getEmpty()) goto L151;
    L156:
        throw new IllegalArgumentException("steps should be >= 0".toString());
    L139:
        r2 = false;
        goto L140
    L124:
        $composer3 = $composer2;
        colors2 = colors;
        r11 = r1;
        steps3 = steps2;
        enabled3 = enabled2;
        r17 = r37;
        goto L125
    L120:
        r37 = r13;
        goto L122
    L117:
        steps2 = r14;
        goto L118
    L114:
        r1 = r11;
        $dirty3 = $dirty2;
        goto L115
    L98:
        if ($composer2.getDefaultsInvalid() == true) goto L107;
        $composer2.skipToGroupEnd();
        if ((r48 & 16) == 0) goto L104;
        $dirty2 = $dirty2 & (-57345);
    L104:
        if ((r48 & 128) == 0) goto L106;
        $composer3 = $composer2;
        colors2 = colors;
        $dirty3 = $dirty2 & (-29360129);
        enabled3 = enabled2;
        r17 = r13;
        steps3 = r14;
        goto L125
    L106:
        $composer3 = $composer2;
        colors2 = colors;
        enabled3 = enabled2;
        r17 = r13;
        steps3 = r14;
        $dirty3 = $dirty2;
        goto L125
    L157:
        $composer5 = $composer2;
        $composer5.skipToGroupEnd();
        modifier3 = modifier2;
        enabled4 = enabled2;
        r6 = r11;
        r8 = r13;
        steps4 = r14;
        colors3 = colors;
        goto L158
    L92:
        r0 = false;
        goto L94
    L71:
        if (($changed & 1572864) != 0) goto L77;
        r13 = r44;
        if ($composer2.changedInstance(r13) == false) goto L75;
        int r110 = 1048576;
    L76:
        $dirty = $dirty | r110;
        goto L79
    L75:
        r110 = 524288;
        goto L76
    L77:
        r13 = r44;
        goto L79
    L60:
        if ((196608 & $changed) != 0) goto L66;
        r14 = steps;
        if ($composer2.changed(r14) == false) goto L64;
        int r111 = 131072;
    L65:
        $dirty = $dirty | r111;
        goto L67
    L64:
        r111 = 65536;
        goto L65
    L66:
        r14 = steps;
        goto L67
    L48:
        if ((r48 & 16) != 0) goto L52;
        r11 = r42;
        if ($composer2.changed(r11) == false) goto L53;
        int r112 = 16384;
    L54:
        $dirty = $dirty | r112;
    L53:
        r112 = 8192;
        goto L54
    L52:
        r11 = r42;
        goto L53
    L38:
        if (($changed & 3072) != 0) goto L44;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L42;
        int r113 = 2048;
    L43:
        $dirty = $dirty | r113;
        goto L46
    L42:
        r113 = 1024;
        goto L43
    L44:
        enabled2 = enabled;
        goto L46
    L27:
        if (($changed & 384) != 0) goto L33;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L31;
        int r9 = 256;
    L32:
        $dirty = $dirty | r9;
        goto L34
    L31:
        r9 = 128;
        goto L32
    L33:
        modifier2 = modifier;
        goto L34
    L17:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changedInstance(r39) == false) goto L21;
        int r10 = 32;
    L22:
        $dirty = $dirty | r10;
        goto L23
    L21:
        r10 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r4 = r38;
        if ($composer2.changed(r4) == false) goto L10;
        int r20 = 4;
    L11:
        $dirty = $dirty | r20;
        goto L14
    L10:
        r20 = 2;
        goto L11
    L12:
        r4 = r38;
        goto L14
    }

    private static final void SliderImpl(final boolean enabled, final float positionFraction, final List<Float> r47, final SliderColors colors, final float width, final MutableInteractionSource interactionSource, final Modifier modifier, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1679682785);
        ComposerKt.sourceInformation($composer2, "C(SliderImpl)P(1,4,5!1,6)686@29859L712:Slider.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L11;
        if ($composer2.changed(enabled) == false) goto L7;
        int r4 = 4;
    L8:
        $dirty = $dirty | r4;
        goto L11
    L7:
        r4 = 2;
    L11:
        if (($changed & 48) != 0) goto L18;
        if ($composer2.changed(positionFraction) == false) goto L15;
        int r5 = 32;
    L16:
        $dirty = $dirty | r5;
        goto L18
    L15:
        r5 = 16;
    L18:
        if (($changed & 384) != 0) goto L24;
        List<Float> r6 = r47;
        if ($composer2.changedInstance(r6) == false) goto L22;
        int r7 = 256;
    L23:
        $dirty = $dirty | r7;
    L26:
        if (($changed & 3072) != 0) goto L32;
        SliderColors r8 = colors;
        if ($composer2.changed(r8) == false) goto L30;
        int r9 = 2048;
    L31:
        $dirty = $dirty | r9;
    L34:
        if (($changed & 24576) != 0) goto L41;
        if ($composer2.changed(width) == false) goto L38;
        int r10 = 16384;
    L39:
        $dirty = $dirty | r10;
        goto L41
    L38:
        r10 = 8192;
    L41:
        if ((196608 & $changed) != 0) goto L47;
        MutableInteractionSource r14 = interactionSource;
        if ($composer2.changed(r14) == false) goto L45;
        int r11 = 131072;
    L46:
        $dirty = $dirty | r11;
    L49:
        if ((1572864 & $changed) == 0) goto L51;
    L55:
        int $dirty2 = $dirty;
        if ((599187 & $dirty2) == 599186) goto L58;
        boolean r1 = true;
    L60:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == true) goto L62;
        $composer2.skipToGroupEnd();
    L83:
        ScopeUpdateScope r15 = $composer2.endRestartGroup();
        if (r15 == null) goto L87;
        r15.updateScope(new C04432(enabled, positionFraction, r47, colors, width, interactionSource, modifier, $changed));
        return;
    L87:
        return;
    L62:
        if (ComposerKt.isTraceInProgress() == false) goto L64;
        ComposerKt.traceEventStart(1679682785, $dirty2, -1, "androidx.compose.material.SliderImpl (Slider.kt:685)");
    L64:
        Modifier modifier$iv = modifier.then(DefaultSliderConstraints);
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r16 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L67;
        ComposablesKt.invalidApplier();
    L67:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L70;
        $composer2.createNode(r16);
    L71:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r0 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L78;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L78;
    L79:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r30 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScope $this$SliderImpl_u24lambda_u249 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, 1221218194, "C*690@30019L7,699@30264L216,709@30489L76:Slider.kt#jmzs0o");
        ProvidableCompositionLocal<Density> r2 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r3 = $composer2.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Density $this$SliderImpl_u24lambda_u249_u24lambda_u248 = (Density) r3;
        float trackStrokeWidth = $this$SliderImpl_u24lambda_u249_u24lambda_u248.mo376toPx0680j_4(TrackHeight);
        float thumbPx = $this$SliderImpl_u24lambda_u249_u24lambda_u248.mo376toPx0680j_4(ThumbRadius);
        float widthDp = $this$SliderImpl_u24lambda_u249_u24lambda_u248.mo372toDpu2uoSUM(width);
        float arg0$iv = ThumbRadius;
        float arg0$iv2 = 2;
        float thumbSize = Dp.m6973constructorimpl(arg0$iv2 * arg0$iv);
        float arg0$iv3 = Dp.m6973constructorimpl(widthDp * positionFraction);
        Track(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), r8, enabled, 0.0f, positionFraction, r6, thumbPx, trackStrokeWidth, $composer2, ((((($dirty2 >> 6) & 112) | 3078) | (($dirty2 << 6) & 896)) | (($dirty2 << 9) & 57344)) | (($dirty2 << 9) & 458752));
        MutableInteractionSource r17 = r14;
        m1757SliderThumbPcYyNuk($this$SliderImpl_u24lambda_u249, Modifier.Companion, arg0$iv3, r17, colors, enabled, thumbSize, $composer2, (((((((0 >> 6) & 112) | 6) & 14) | 1572912) | (($dirty2 >> 6) & 7168)) | (($dirty2 << 3) & 57344)) | (($dirty2 << 15) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L83;
        ComposerKt.traceEventEnd();
    L78:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r0);
        goto L79
    L70:
        $composer2.useNode();
        goto L71
    L58:
        r1 = false;
        goto L60
    L51:
        if ($composer2.changed(modifier) == false) goto L53;
        int r12 = 1048576;
    L54:
        $dirty = $dirty | r12;
        goto L55
    L53:
        r12 = 524288;
        goto L54
    L45:
        r11 = 65536;
        goto L46
    L47:
        r14 = interactionSource;
        goto L49
    L30:
        r9 = 1024;
        goto L31
    L32:
        r8 = colors;
        goto L34
    L22:
        r7 = 128;
        goto L23
    L24:
        r6 = r47;
        goto L26
    }

    private static final void RangeSliderImpl(final boolean enabled, final float positionFractionStart, final float positionFractionEnd, final List<Float> r49, final SliderColors colors, final float width, final MutableInteractionSource startInteractionSource, final MutableInteractionSource endInteractionSource, final Modifier modifier, final Modifier startThumbSemantics, Modifier endThumbSemantics, Composer $composer, final int $changed, final int $changed1) {
        Composer $composer2 = $composer.startRestartGroup(-278895713);
        ComposerKt.sourceInformation($composer2, "C(RangeSliderImpl)P(1,6,5,9!1,10,7!1,4,8)728@31016L35,729@31084L33,730@31122L1526:Slider.kt#jmzs0o");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if (($changed & 6) != 0) goto L9;
        boolean r7 = enabled;
        if ($composer2.changed(r7) == false) goto L7;
        int r16 = 4;
    L8:
        $dirty = $dirty | r16;
    L11:
        if (($changed & 48) != 0) goto L18;
        if ($composer2.changed(positionFractionStart) == false) goto L15;
        int r17 = 32;
    L16:
        $dirty = $dirty | r17;
        goto L18
    L15:
        r17 = 16;
    L18:
        if (($changed & 384) != 0) goto L25;
        if ($composer2.changed(positionFractionEnd) == false) goto L22;
        int r8 = 256;
    L23:
        $dirty = $dirty | r8;
        goto L25
    L22:
        r8 = 128;
    L25:
        if (($changed & 3072) != 0) goto L33;
        if ($composer2.changedInstance(r49) == false) goto L29;
        int r18 = 2048;
    L30:
        $dirty = $dirty | r18;
        goto L33
    L29:
        r18 = 1024;
    L33:
        if (($changed & 24576) != 0) goto L41;
        if ($composer2.changed(colors) == false) goto L37;
        int r19 = 16384;
    L38:
        $dirty = $dirty | r19;
        goto L41
    L37:
        r19 = 8192;
    L41:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L48;
        if ($composer2.changed(width) == false) goto L45;
        int r110 = 131072;
    L46:
        $dirty = $dirty | r110;
        goto L48
    L45:
        r110 = 65536;
    L48:
        if (($changed & 1572864) != 0) goto L55;
        if ($composer2.changed(startInteractionSource) == false) goto L52;
        int r111 = 1048576;
    L53:
        $dirty = $dirty | r111;
        goto L55
    L52:
        r111 = 524288;
    L55:
        if (($changed & 12582912) != 0) goto L62;
        if ($composer2.changed(endInteractionSource) == false) goto L59;
        int r112 = 8388608;
    L60:
        $dirty = $dirty | r112;
        goto L62
    L59:
        r112 = 4194304;
    L62:
        if (($changed & 100663296) != 0) goto L69;
        if ($composer2.changed(modifier) == false) goto L66;
        int r113 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L67:
        $dirty = $dirty | r113;
        goto L69
    L66:
        r113 = 33554432;
    L69:
        if (($changed & 805306368) != 0) goto L76;
        if ($composer2.changed(startThumbSemantics) == false) goto L73;
        int r114 = 536870912;
    L74:
        $dirty = $dirty | r114;
        goto L76
    L73:
        r114 = 268435456;
    L76:
        if (($changed1 & 6) != 0) goto L83;
        if ($composer2.changed(endThumbSemantics) == false) goto L80;
        int r115 = 4;
    L81:
        $dirty1 = $dirty1 | r115;
        goto L83
    L80:
        r115 = 2;
    L83:
        if (($dirty & 306783379) == 306783378) goto L85;
    L88:
        boolean r0 = true;
    L90:
        if ($composer2.shouldExecute(r0, $dirty & 1) == true) goto L92;
        Composer $composer3 = $composer2;
        final Modifier r11 = endThumbSemantics;
        $composer3.skipToGroupEnd();
    L127:
        ScopeUpdateScope r15 = $composer3.endRestartGroup();
        if (r15 == null) goto L131;
        r15.updateScope(new C04402(enabled, positionFractionStart, positionFractionEnd, r49, colors, width, startInteractionSource, endInteractionSource, modifier, startThumbSemantics, r11, $changed, $changed1));
        return;
    L131:
        return;
    L92:
        if (ComposerKt.isTraceInProgress() == false) goto L94;
        ComposerKt.traceEventStart(-278895713, $dirty, $dirty1, "androidx.compose.material.RangeSliderImpl (Slider.kt:726)");
    L94:
        final String startContentDescription = Strings_androidKt.m1781getString4foXLRw(Strings.Companion.m1779getSliderRangeStartUdPEhr4(), $composer2, 6);
        final String endContentDescription = Strings_androidKt.m1781getString4foXLRw(Strings.Companion.m1778getSliderRangeEndUdPEhr4(), $composer2, 6);
        Modifier modifier$iv = modifier.then(DefaultSliderConstraints);
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r27 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L97;
        ComposablesKt.invalidApplier();
    L97:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L100;
        Function0<ComposeUiNode> r2 = r27;
        $composer2.createNode(r2);
    L101:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L107;
        $composer3 = $composer2;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == true) goto L109;
    L108:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r3);
    L109:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r28 = ($changed$iv$iv$iv >> 6) & 14;
        Composer $composer$iv = $composer3;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        int $changed2 = ((0 >> 6) & 112) | 6;
        BoxScope $this$RangeSliderImpl_u24lambda_u2413 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -753149933, "C*734@31282L7,743@31590L267,755@31936L84,754@31867L388,767@32333L82,766@32264L378:Slider.kt#jmzs0o");
        ProvidableCompositionLocal<Density> r1 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer$iv, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r4 = $composer$iv.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        Density $this$RangeSliderImpl_u24lambda_u2413_u24lambda_u2410 = (Density) r4;
        float trackStrokeWidth = $this$RangeSliderImpl_u24lambda_u2413_u24lambda_u2410.mo376toPx0680j_4(TrackHeight);
        float thumbPx = $this$RangeSliderImpl_u24lambda_u2413_u24lambda_u2410.mo376toPx0680j_4(ThumbRadius);
        float widthDp = $this$RangeSliderImpl_u24lambda_u2413_u24lambda_u2410.mo372toDpu2uoSUM(width);
        float arg0$iv = ThumbRadius;
        float arg0$iv2 = 2;
        float thumbSize = Dp.m6973constructorimpl(arg0$iv2 * arg0$iv);
        float arg0$iv3 = Dp.m6973constructorimpl(widthDp * positionFractionStart);
        float arg0$iv4 = Dp.m6973constructorimpl(widthDp * positionFractionEnd);
        int $dirty2 = $dirty;
        Track(SizeKt.fillMaxSize$default($this$RangeSliderImpl_u24lambda_u2413.align(Modifier.Companion, Alignment.Companion.getCenterStart()), 0.0f, 1, null), colors, r7, positionFractionStart, positionFractionEnd, r49, thumbPx, trackStrokeWidth, $composer$iv, ((((($dirty >> 9) & 112) | (($dirty << 6) & 896)) | (($dirty << 6) & 7168)) | (($dirty << 6) & 57344)) | (($dirty << 6) & 458752));
        Modifier.Companion r5 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -855556245, "CC(remember):Slider.kt#9igjgp");
        boolean invalid$iv = $composer$iv.changed(startContentDescription);
        Object it$iv = $composer$iv.rememberedValue();
        if (invalid$iv == false) goto L112;
    L115:
        Object value$iv = (Function1) new SliderKt$RangeSliderImpl$1$2$1(startContentDescription);
        $composer$iv.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L116:
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        m1757SliderThumbPcYyNuk($this$RangeSliderImpl_u24lambda_u2413, FocusableKt.focusable(SemanticsModifierKt.semantics(r5, true, (Function1) it$iv), true, startInteractionSource).then(startThumbSemantics), arg0$iv3, startInteractionSource, colors, enabled, thumbSize, $composer$iv, (((($changed2 & 14) | 1572864) | (($dirty2 >> 9) & 7168)) | ($dirty2 & 57344)) | (($dirty2 << 15) & 458752));
        Modifier.Companion r6 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -855543543, "CC(remember):Slider.kt#9igjgp");
        boolean invalid$iv2 = $composer$iv.changed(endContentDescription);
        Object it$iv2 = $composer$iv.rememberedValue();
        if (invalid$iv2 == false) goto L119;
    L122:
        Object value$iv2 = (Function1) new SliderKt$RangeSliderImpl$1$3$1(endContentDescription);
        $composer$iv.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L123:
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        r11 = endThumbSemantics;
        m1757SliderThumbPcYyNuk($this$RangeSliderImpl_u24lambda_u2413, FocusableKt.focusable(SemanticsModifierKt.semantics(r6, true, (Function1) it$iv2), true, endInteractionSource).then(r11), arg0$iv4, endInteractionSource, colors, enabled, thumbSize, $composer$iv, (((($changed2 & 14) | 1572864) | (($dirty2 >> 12) & 7168)) | ($dirty2 & 57344)) | (($dirty2 << 15) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L127;
        ComposerKt.traceEventEnd();
        goto L127
    L119:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L123;
    L112:
        if (it$iv != Composer.Companion.getEmpty()) goto L116;
    L107:
        $composer3 = $composer2;
        goto L108
    L100:
        r2 = r27;
        $composer2.useNode();
        goto L101
    L85:
        if (($dirty1 & 3) != 2) goto L88;
        r0 = false;
        goto L90
    L7:
        r16 = 2;
        goto L8
    L9:
        r7 = enabled;
        goto L11
    }

    /* JADX INFO: renamed from: SliderThumb-PcYyNuk, reason: not valid java name */
    private static final void m1757SliderThumbPcYyNuk(final BoxScope $this$SliderThumb_u2dPcYyNuk, final Modifier modifier, final float offset, final MutableInteractionSource interactionSource, final SliderColors colors, final boolean enabled, final float thumbSize, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(428907178);
        ComposerKt.sourceInformation($composer2, "C(SliderThumb)P(3,4:c#ui.unit.Dp,2!,5:c#ui.unit.Dp)790@32861L1538:Slider.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed($this$SliderThumb_u2dPcYyNuk) == false) goto L7;
        int r10 = 4;
    L8:
        $dirty = $dirty | r10;
        goto L10
    L7:
        r10 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(modifier) == false) goto L14;
        int r11 = 32;
    L15:
        $dirty = $dirty | r11;
        goto L17
    L14:
        r11 = 16;
    L17:
        if (($changed & 384) != 0) goto L23;
        float r13 = offset;
        if ($composer2.changed(r13) == false) goto L21;
        int r12 = 256;
    L22:
        $dirty = $dirty | r12;
    L25:
        if (($changed & 3072) != 0) goto L32;
        if ($composer2.changed(interactionSource) == false) goto L29;
        int r14 = 2048;
    L30:
        $dirty = $dirty | r14;
        goto L32
    L29:
        r14 = 1024;
    L32:
        if (($changed & 24576) != 0) goto L39;
        if ($composer2.changed(colors) == false) goto L36;
        int r15 = 16384;
    L37:
        $dirty = $dirty | r15;
        goto L39
    L36:
        r15 = 8192;
    L39:
        if ((196608 & $changed) != 0) goto L46;
        if ($composer2.changed(enabled) == false) goto L43;
        int r16 = 131072;
    L44:
        $dirty = $dirty | r16;
        goto L46
    L43:
        r16 = 65536;
    L46:
        if ((1572864 & $changed) == 0) goto L48;
    L52:
        int $dirty2 = $dirty;
        boolean invalid$iv = true;
        if ((599187 & $dirty2) == 599186) goto L55;
        boolean r3 = true;
    L57:
        if ($composer2.shouldExecute(r3, $dirty2 & 1) == true) goto L59;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L103:
        ScopeUpdateScope r9 = $composer3.endRestartGroup();
        if (r9 == null) goto L107;
        r9.updateScope(new SliderKt$SliderThumb$2($this$SliderThumb_u2dPcYyNuk, modifier, offset, interactionSource, colors, enabled, thumbSize, $changed));
        return;
    L107:
        return;
    L59:
        if (ComposerKt.isTraceInProgress() == false) goto L61;
        ComposerKt.traceEventStart(428907178, $dirty2, -1, "androidx.compose.material.SliderThumb (Slider.kt:789)");
    L61:
        Modifier modifier$iv = $this$SliderThumb_u2dPcYyNuk.align(PaddingKt.m729paddingqDBjuR0$default(Modifier.Companion, r13, 0.0f, 0.0f, 0.0f, 14, null), Alignment.Companion.getCenterStart());
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r21 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L64;
        ComposablesKt.invalidApplier();
    L64:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L67;
        Function0<ComposeUiNode> r8 = r21;
        $composer2.createNode(r8);
    L68:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r17 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L75;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L75;
    L76:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r0 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r1 = BoxScopeInstance.INSTANCE;
        int r18 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -752004314, "C791@32957L46,792@33046L658,792@33012L692,820@34344L19,811@33894L499:Slider.kt#jmzs0o");
        ComposerKt.sourceInformationMarkerStart($composer2, 807024988, "CC(remember):Slider.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L79;
        Object value$iv = SnapshotStateKt.mutableStateListOf();
        $composer2.updateRememberedValue(value$iv);
    L80:
        SnapshotStateList interactions = (SnapshotStateList) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 807028448, "CC(remember):Slider.kt#9igjgp");
        if (($dirty2 & 7168) == 2048) goto L84;
        invalid$iv = false;
    L84:
        SliderKt$SliderThumb$1$1$1 value$iv2 = $composer2.rememberedValue();
        $composer3 = $composer2;
        if (invalid$iv == false) goto L87;
    L90:
        value$iv2 = new SliderKt$SliderThumb$1$1$1(interactionSource, interactions, null);
        $composer2.updateRememberedValue(value$iv2);
    L91:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.LaunchedEffect(interactionSource, (Function2) value$iv2, $composer2, ($dirty2 >> 9) & 14);
        if (interactions.isEmpty() == true) goto L94;
        float elevation = ThumbPressedElevation;
    L95:
        float elevation2 = elevation;
        Modifier r38 = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m774sizeVpY3zN4(modifier, thumbSize, thumbSize), interactionSource, RippleKt.m1746rippleH2RKhps$default(false, ThumbRippleRadius, 0, 4, null)), interactionSource, false, 2, null);
        if (enabled == false) goto L98;
        float r39 = elevation2;
    L99:
        SpacerKt.Spacer(BackgroundKt.m233backgroundbw27NRU(ShadowKt.m4001shadows4CzXII$default(r38, r39, RoundedCornerShapeKt.getCircleShape(), false, 0, 0, 24, null), colors.thumbColor(enabled, $composer2, (($dirty2 >> 15) & 14) | (($dirty2 >> 9) & 112)).getValue().m4376unboximpl(), RoundedCornerShapeKt.getCircleShape()), $composer2, 0);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L103;
        ComposerKt.traceEventEnd();
        goto L103
    L98:
        r39 = Dp.m6973constructorimpl(0);
        goto L99
    L94:
        elevation = ThumbDefaultElevation;
        goto L95
    L87:
        if (value$iv2 != Composer.Companion.getEmpty()) goto L91;
    L79:
        value$iv = it$iv;
    L75:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r17);
        goto L76
    L67:
        r8 = r21;
        $composer2.useNode();
        goto L68
    L55:
        r3 = false;
        goto L57
    L48:
        if ($composer2.changed(thumbSize) == false) goto L50;
        int r19 = 1048576;
    L51:
        $dirty = $dirty | r19;
        goto L52
    L50:
        r19 = 524288;
        goto L51
    L21:
        r12 = 128;
        goto L22
    L23:
        r13 = offset;
        goto L25
    }

    private static final void Track(final Modifier modifier, final SliderColors colors, final boolean enabled, final float positionFractionStart, final float positionFractionEnd, final List<Float> r24, final float thumbPx, final float trackStrokeWidth, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1833126050);
        ComposerKt.sourceInformation($composer2, "C(Track)P(2!2,4!1,6)836@34692L35,837@34762L34,838@34832L34,839@34900L33,840@34955L1460,840@34938L1477:Slider.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(modifier) == false) goto L7;
        int r7 = 4;
    L8:
        $dirty = $dirty | r7;
        goto L10
    L7:
        r7 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(colors) == false) goto L14;
        int r8 = 32;
    L15:
        $dirty = $dirty | r8;
        goto L17
    L14:
        r8 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changed(enabled) == false) goto L21;
        int r9 = 256;
    L22:
        $dirty = $dirty | r9;
        goto L24
    L21:
        r9 = 128;
    L24:
        if (($changed & 3072) != 0) goto L30;
        final float r10 = positionFractionStart;
        if ($composer2.changed(r10) == false) goto L28;
        int r11 = 2048;
    L29:
        $dirty = $dirty | r11;
    L32:
        if (($changed & 24576) != 0) goto L38;
        float r12 = positionFractionEnd;
        if ($composer2.changed(r12) == false) goto L36;
        int r13 = 16384;
    L37:
        $dirty = $dirty | r13;
    L40:
        if ((196608 & $changed) != 0) goto L47;
        if ($composer2.changedInstance(r24) == false) goto L44;
        int r14 = 131072;
    L45:
        $dirty = $dirty | r14;
        goto L47
    L44:
        r14 = 65536;
    L47:
        if ((1572864 & $changed) != 0) goto L53;
        float r15 = thumbPx;
        if ($composer2.changed(r15) == false) goto L51;
        int r16 = 1048576;
    L52:
        $dirty = $dirty | r16;
    L55:
        if ((12582912 & $changed) != 0) goto L61;
        float r17 = trackStrokeWidth;
        if ($composer2.changed(r17) == false) goto L59;
        int r18 = 8388608;
    L60:
        $dirty = $dirty | r18;
    L63:
        if (($dirty & 4793491) == 4793490) goto L65;
        boolean r19 = true;
    L67:
        if ($composer2.shouldExecute(r19, $dirty & 1) == true) goto L69;
        $composer2.skipToGroupEnd();
    L98:
        ScopeUpdateScope r110 = $composer2.endRestartGroup();
        if (r110 == null) goto L102;
        r110.updateScope(new C04442(modifier, colors, enabled, positionFractionStart, positionFractionEnd, r24, thumbPx, trackStrokeWidth, $changed));
        return;
    L102:
        return;
    L69:
        if (ComposerKt.isTraceInProgress() == false) goto L71;
        ComposerKt.traceEventStart(1833126050, $dirty, -1, "androidx.compose.material.Track (Slider.kt:835)");
    L71:
        final State<Color> r4 = colors.trackColor(enabled, false, $composer2, ((($dirty >> 6) & 14) | 48) | (($dirty << 3) & 896));
        final State<Color> r111 = colors.trackColor(enabled, true, $composer2, ((($dirty >> 6) & 14) | 48) | (($dirty << 3) & 896));
        final State<Color> r112 = colors.tickColor(enabled, false, $composer2, ((($dirty >> 6) & 14) | 48) | (($dirty << 3) & 896));
        final State<Color> r20 = colors.tickColor(enabled, true, $composer2, ((($dirty >> 6) & 14) | 48) | (($dirty << 3) & 896));
        ComposerKt.sourceInformationMarkerStart($composer2, -1731123463, "CC(remember):Slider.kt#9igjgp");
        if ((3670016 & $dirty) != 1048576) goto L74;
        boolean r0 = true;
    L75:
        boolean r1 = r0 | $composer2.changed(r4);
        if ((29360128 & $dirty) != 8388608) goto L78;
        boolean r2 = true;
    L79:
        boolean r3 = r1 | r2;
        if ((57344 & $dirty) != 16384) goto L82;
        boolean r5 = true;
    L83:
        boolean r6 = r3 | r5;
        if (($dirty & 7168) != 2048) goto L86;
        boolean r113 = true;
    L87:
        boolean invalid$iv = ((((r6 | r113) | $composer2.changed(r111)) | $composer2.changedInstance(r24)) | $composer2.changed(r112)) | $composer2.changed(r20);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L90;
    L93:
        final float r21 = r12;
        final float r22 = r17;
        final float r23 = r15;
        Object value$iv = (Function1) new SliderKt$Track$1$1(r23, r4, r22, r21, r10, r111, r24, r112, r20);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L94:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CanvasKt.Canvas(modifier, (Function1) it$iv, $composer2, $dirty & 14);
        if (ComposerKt.isTraceInProgress() == false) goto L98;
        ComposerKt.traceEventEnd();
        goto L98
    L90:
        if (it$iv != Composer.Companion.getEmpty()) goto L94;
    L86:
        r113 = false;
        goto L87
    L82:
        r5 = false;
        goto L83
    L78:
        r2 = false;
        goto L79
    L74:
        r0 = false;
        goto L75
    L65:
        r19 = false;
        goto L67
    L59:
        r18 = 4194304;
        goto L60
    L61:
        r17 = trackStrokeWidth;
        goto L63
    L51:
        r16 = 524288;
        goto L52
    L53:
        r15 = thumbPx;
        goto L55
    L36:
        r13 = 8192;
        goto L37
    L38:
        r12 = positionFractionEnd;
        goto L40
    L28:
        r11 = 1024;
        goto L29
    L30:
        r10 = positionFractionStart;
        goto L32
    }

    private static final float snapValueToTick(float current, List<Float> r11, float minPx, float maxPx) {
        if (r11.isEmpty() == false) goto L5;
        Object minElem$iv = null;
    L13:
        Object minElem$iv2 = (Float) minElem$iv;
        if (minElem$iv2 == null) goto L17;
        float $this$snapValueToTick_u24lambda_u2419 = ((Number) minElem$iv2).floatValue();
        return MathHelpersKt.lerp(minPx, maxPx, $this$snapValueToTick_u24lambda_u2419);
    L17:
        return current;
    L5:
        minElem$iv = r11.get(0);
        float it = ((Number) minElem$iv).floatValue();
        float minValue$iv = Math.abs(MathHelpersKt.lerp(minPx, maxPx, it) - current);
        int i$iv = 1;
        int r4 = CollectionsKt.getLastIndex(r11);
        if (1 > r4) goto L13;
    L7:
        Object e$iv = r11.get(i$iv);
        float it2 = ((Number) e$iv).floatValue();
        float v$iv = Math.abs(MathHelpersKt.lerp(minPx, maxPx, it2) - current);
        if (Float.compare(minValue$iv, v$iv) <= 0) goto L10;
        minElem$iv = e$iv;
        minValue$iv = v$iv;
    L10:
        if (i$iv == r4) goto L13;
        i$iv = i$iv + 1;
        goto L7
    }

    /* JADX INFO: renamed from: awaitSlop-8vUncbI, reason: not valid java name */
    private static final Object m1760awaitSlop8vUncbI(AwaitPointerEventScope $this$awaitSlop_u2d8vUncbI, long id, int type, Continuation<? super Pair<PointerInputChange, Float>> r12) {
        if ((r12 instanceof SliderKt$awaitSlop$1) == false) goto L7;
        SliderKt$awaitSlop$1 r0 = (SliderKt$awaitSlop$1) r12;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        SliderKt$awaitSlop$1 r6 = r0;
        Object $result = r6.result;
        Object r7 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r6.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        final Ref.FloatRef initialDelta = (Ref.FloatRef) r6.L$0;
        ResultKt.throwOnFailure($result);
        Object r9 = $result;
    L16:
        PointerInputChange afterSlopResult = (PointerInputChange) r9;
        if (afterSlopResult != null) goto L21;
        return null;
    L21:
        return TuplesKt.to(afterSlopResult, Boxing.boxFloat(initialDelta.element));
    L13:
        ResultKt.throwOnFailure($result);
        initialDelta = new Ref.FloatRef();
        Function2<PointerInputChange, Float, Unit> r5 = new SliderKt$awaitSlop$postPointerSlop$1(initialDelta);
        r6.L$0 = initialDelta;
        r6.label = 1;
        r9 = DragGestureDetectorCopyKt.m1642awaitHorizontalPointerSlopOrCancellationgDDlDlE($this$awaitSlop_u2d8vUncbI, id, type, r5, r6);
        if (r9 != r7) goto L16;
        return r7;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new SliderKt$awaitSlop$1(r12);
        goto L8
    }

    private static final List<Float> stepsToTickFractions(int steps) {
        if (steps == 0) goto L10;
        int r0 = steps + 2;
        ArrayList r1 = new ArrayList(r0);
        int r2 = 0;
    L5:
        if (r2 >= r0) goto L8;
        int it = r2;
        r1.add(Float.valueOf(it / (steps + 1)));
        r2 = r2 + 1;
        goto L5
    L8:
        return r1;
    L10:
        return CollectionsKt.emptyList();
    }

    private static final float scale(float a1, float b1, float x1, float a2, float b2) {
        return MathHelpersKt.lerp(a2, b2, calcFraction(a1, b1, x1));
    }

    private static final ClosedFloatingPointRange<Float> scale(float a1, float b1, ClosedFloatingPointRange<Float> r4, float a2, float b2) {
        return RangesKt.rangeTo(scale(a1, b1, r4.getStart().floatValue(), a2, b2), scale(a1, b1, r4.getEndInclusive().floatValue(), a2, b2));
    }

    private static final float calcFraction(float a, float b, float pos) {
        float $this$fastCoerceIn$iv = 0.0f;
        if ((b - a) != 0.0f) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L9;
        $this$fastCoerceIn$iv = (pos - a) / (b - a);
    L9:
        float $this$fastCoerceAtLeast$iv$iv = $this$fastCoerceIn$iv;
        if ($this$fastCoerceAtLeast$iv$iv >= 0.0f) goto L13;
        $this$fastCoerceAtLeast$iv$iv = 0.0f;
    L13:
        if ($this$fastCoerceAtLeast$iv$iv > 1.0f) goto L16;
        return $this$fastCoerceAtLeast$iv$iv;
    L16:
        return 1.0f;
    L5:
        r0 = false;
        goto L6
    }

    private static final void CorrectValueSideEffect(final Function1<? super Float, Float> r17, final ClosedFloatingPointRange<Float> r18, final ClosedFloatingPointRange<Float> r19, final MutableState<Float> r20, final float value, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-743965752);
        ComposerKt.sourceInformation($composer2, "C(CorrectValueSideEffect)P(!1,3!1,4)930@38269L300,930@38258L311:Slider.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L9;
        final Function1<? super Float, Float> r10 = r17;
        if ($composer2.changedInstance(r10) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
    L11:
        if (($changed & 48) != 0) goto L17;
        final ClosedFloatingPointRange<Float> r9 = r18;
        if ($composer2.changed(r9) == false) goto L15;
        int r3 = 32;
    L16:
        $dirty = $dirty | r3;
    L19:
        if (($changed & 384) != 0) goto L25;
        final ClosedFloatingPointRange<Float> r13 = r19;
        if ($composer2.changed(r13) == false) goto L23;
        int r4 = 256;
    L24:
        $dirty = $dirty | r4;
    L27:
        if (($changed & 3072) != 0) goto L33;
        final MutableState<Float> r12 = r20;
        if ($composer2.changed(r12) == false) goto L31;
        int r5 = 2048;
    L32:
        $dirty = $dirty | r5;
    L35:
        if (($changed & 24576) != 0) goto L41;
        float r6 = value;
        if ($composer2.changed(r6) == false) goto L39;
        int r14 = 16384;
    L40:
        $dirty = $dirty | r14;
    L42:
        int $dirty2 = $dirty;
        boolean r16 = true;
        if (($dirty2 & 9363) == 9362) goto L45;
        boolean r1 = true;
    L47:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == true) goto L49;
        $composer2.skipToGroupEnd();
    L82:
        ScopeUpdateScope r8 = $composer2.endRestartGroup();
        if (r8 == null) goto L86;
        r8.updateScope(new AnonymousClass2(r17, r18, r19, r20, value, $changed));
        return;
    L86:
        return;
    L49:
        if (ComposerKt.isTraceInProgress() == false) goto L51;
        ComposerKt.traceEventStart(-743965752, $dirty2, -1, "androidx.compose.material.CorrectValueSideEffect (Slider.kt:929)");
    L51:
        ComposerKt.sourceInformationMarkerStart($composer2, -1313760447, "CC(remember):Slider.kt#9igjgp");
        if (($dirty2 & 112) != 32) goto L54;
        boolean r0 = true;
    L56:
        if (($dirty2 & 14) != 4) goto L58;
        boolean r7 = true;
    L59:
        boolean r11 = r0 | r7;
        if ((57344 & $dirty2) != 16384) goto L62;
        boolean r15 = true;
    L63:
        boolean r21 = r11 | r15;
        if (($dirty2 & 7168) != 2048) goto L66;
        boolean r22 = true;
    L67:
        boolean r23 = r21 | r22;
        if (($dirty2 & 896) == 256) goto L71;
        r16 = false;
    L71:
        boolean invalid$iv = r23 | r16;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L74;
    L77:
        final float r110 = r6;
        Object value$iv = (Function0) new SliderKt$CorrectValueSideEffect$1$1(r9, r10, r110, r12, r13);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L78:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.SideEffect((Function0) it$iv, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L82;
        ComposerKt.traceEventEnd();
        goto L82
    L74:
        if (it$iv != Composer.Companion.getEmpty()) goto L78;
    L66:
        r22 = false;
        goto L67
    L62:
        r15 = false;
        goto L63
    L58:
        r7 = false;
        goto L59
    L54:
        r0 = false;
        goto L56
    L45:
        r1 = false;
        goto L47
    L39:
        r14 = 8192;
        goto L40
    L41:
        r6 = value;
        goto L42
    L31:
        r5 = 1024;
        goto L32
    L33:
        r12 = r20;
        goto L35
    L23:
        r4 = 128;
        goto L24
    L25:
        r13 = r19;
        goto L27
    L15:
        r3 = 16;
        goto L16
    L17:
        r9 = r18;
        goto L19
    L7:
        r2 = 2;
        goto L8
    L9:
        r10 = r17;
        goto L11
    }

    static /* synthetic */ Modifier sliderSemantics$default(Modifier r7, float r8, boolean r9, Function1 r10, Function0 r11, ClosedFloatingPointRange r12, int r13, int r14, Object r15) {
        if ((r14 & 8) == 0) goto L5;
        Function0 r4 = null;
    L7:
        if ((r14 & 16) == 0) goto L9;
        ClosedFloatingPointRange r5 = RangesKt.rangeTo(0.0f, 1.0f);
    L11:
        if ((r14 & 32) == 0) goto L13;
        int r6 = 0;
    L15:
        return sliderSemantics(r7, r8, r9, r10, r4, r5, r6);
    L13:
        r6 = r13;
        goto L15
    L9:
        r5 = r12;
        goto L11
    L5:
        r4 = r11;
        goto L7
    }

    private static final Modifier sliderSemantics(Modifier $this$sliderSemantics, float value, final boolean enabled, final Function1<? super Float, Unit> r12, final Function0<Unit> r13, final ClosedFloatingPointRange<Float> r14, final int steps) {
        final float coerced = RangesKt.coerceIn(value, r14.getStart().floatValue(), r14.getEndInclusive().floatValue());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default($this$sliderSemantics, false, new C04471(enabled, r14, steps, coerced, r12, r13), 1, null), value, r14, steps);
    }

    private static final Modifier sliderTapModifier(Modifier $this$sliderTapModifier, final DraggableState draggableState, final MutableInteractionSource interactionSource, final float maxPx, final boolean isRtl, final State<Float> r17, final State<? extends Function1<? super Float, Unit>> r18, final MutableState<Float> r19, final boolean enabled) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1(draggableState, interactionSource, maxPx, isRtl, r17, r18, r19, enabled);
    L7:
        return ComposedModifierKt.composed($this$sliderTapModifier, r2, new C04482(enabled, draggableState, interactionSource, maxPx, isRtl, r19, r17, r18));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    private static final Object animateToTarget(DraggableState draggableState, float current, float target, float velocity, Continuation<? super Unit> r12) {
        Object r8 = DraggableState.drag$default(draggableState, null, new C04452(current, target, velocity, null), r12, 1, null);
        if (r8 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r8;
    L6:
        return Unit.INSTANCE;
    }

    private static final Modifier rangeSliderPressDragModifier(Modifier $this$rangeSliderPressDragModifier, MutableInteractionSource startInteractionSource, MutableInteractionSource endInteractionSource, State<Float> r16, State<Float> r17, boolean enabled, boolean isRtl, float maxPx, ClosedFloatingPointRange<Float> r21, State<? extends Function1<? super Boolean, Unit>> r22, State<? extends Function2<? super Boolean, ? super Float, Unit>> r23) {
        if (enabled == false) goto L5;
        return SuspendingPointerInputFilterKt.pointerInput($this$rangeSliderPressDragModifier, new Object[]{startInteractionSource, endInteractionSource, Float.valueOf(maxPx), Boolean.valueOf(isRtl), r21}, new AnonymousClass1(startInteractionSource, endInteractionSource, r16, r17, r23, isRtl, maxPx, r22, null));
    L5:
        return $this$rangeSliderPressDragModifier;
    }

    static {
        ThumbRadius = Dp.m6973constructorimpl(10);
        ThumbRippleRadius = Dp.m6973constructorimpl(24);
        ThumbDefaultElevation = Dp.m6973constructorimpl(1);
        ThumbPressedElevation = Dp.m6973constructorimpl(6);
        TrackHeight = Dp.m6973constructorimpl(4);
        SliderHeight = Dp.m6973constructorimpl(48);
        SliderMinWidth = Dp.m6973constructorimpl(144);
        DefaultSliderConstraints = SizeKt.m760heightInVpY3zN4$default(SizeKt.m779widthInVpY3zN4$default(Modifier.Companion, SliderMinWidth, 0.0f, 2, null), 0.0f, SliderHeight, 1, null);
        SliderToTickAnimation = new TweenSpec(100, 0, null, 6, null);
    }

    public static final float getThumbRadius() {
        return ThumbRadius;
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }
}
