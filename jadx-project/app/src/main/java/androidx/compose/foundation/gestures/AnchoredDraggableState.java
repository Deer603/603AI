package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.FloatState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.core.app.NotificationCompat;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016*\u0001\u0011\b\u0007\u0018\u0000 \u007f*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u007fB\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006B2\b\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0002\u0010\rBB\b\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012#\b\u0002\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0002\u0010\u000eB\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u000fJy\u0010_\u001a\u00020`2\u0006\u0010S\u001a\u00028\u00002\b\b\u0002\u0010a\u001a\u00020b2W\u0010c\u001aS\b\u0001\u0012\u0004\u0012\u00020e\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(S\u0012\n\u0012\b\u0012\u0004\u0012\u00020`0g\u0012\u0006\u0012\u0004\u0018\u00010\u00020d¢\u0006\u0002\bhH\u0086@¢\u0006\u0002\u0010iJ\\\u0010_\u001a\u00020`2\b\b\u0002\u0010a\u001a\u00020b2B\u0010c\u001a>\b\u0001\u0012\u0004\u0012\u00020e\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020`0g\u0012\u0006\u0012\u0004\u0018\u00010\u00020j¢\u0006\u0002\bhH\u0086@¢\u0006\u0002\u0010kJ\u000e\u0010l\u001a\u00020$2\u0006\u0010m\u001a\u00020$J\u0015\u0010n\u001a\u00020$2\u0006\u0010m\u001a\u00020$H\u0000¢\u0006\u0002\boJ\u001d\u0010C\u001a\u00020$2\u0006\u0010p\u001a\u00028\u00002\u0006\u0010q\u001a\u00028\u0000H\u0007¢\u0006\u0002\u0010rJ\u0006\u0010s\u001a\u00020$J\u001c\u0010t\u001a\u00020`2\f\u0010u\u001a\b\u0012\u0004\u0012\u00020$0LH\u0086@¢\u0006\u0002\u0010vJ\u0016\u0010t\u001a\u00020$2\u0006\u0010w\u001a\u00020$H\u0087@¢\u0006\u0002\u0010xJ\u0015\u0010y\u001a\u00020\f2\u0006\u0010S\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010zJ#\u0010{\u001a\u00020`2\f\u0010|\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\b\b\u0002\u0010}\u001a\u00028\u0000¢\u0006\u0002\u0010~R\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R7\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R5\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR+\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0019\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u000fR8\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020$0#8\u0006@@X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010.\u001a\u0004\u0018\u00018\u00002\b\u0010\u0013\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010\u0019\u001a\u0004\b/\u0010 \"\u0004\b0\u0010\u000fR\u0011\u00102\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b2\u00103R+\u00104\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020$8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b5\u00106\"\u0004\b7\u00108R+\u0010;\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020$8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010:\u001a\u0004\b<\u00106\"\u0004\b=\u00108R5\u0010?\u001a\u001d\u0012\u0013\u0012\u00110$¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(@\u0012\u0004\u0012\u00020$0\bX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001b\"\u0004\bB\u0010\u001dR!\u0010C\u001a\u00020$8GX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bF\u0010G\u0012\u0004\bD\u0010'\u001a\u0004\bE\u00106R+\u0010H\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010\u0019\u001a\u0004\bI\u0010 \"\u0004\bJ\u0010\u000fR8\u0010M\u001a\b\u0012\u0004\u0012\u00020$0L2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020$0L8\u0006@@X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\bN\u0010'\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001b\u0010S\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bU\u0010G\u001a\u0004\bT\u0010 R\u001a\u0010V\u001a\u00020\f8@X\u0080\u0004¢\u0006\f\u0012\u0004\bW\u0010'\u001a\u0004\bX\u00103R \u0010Y\u001a\b\u0012\u0004\u0012\u00020$0ZX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^¨\u0006\u0080\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "T", "", "initialValue", "anchors", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "(Ljava/lang/Object;Landroidx/compose/foundation/gestures/DraggableAnchors;)V", "confirmValueChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "newValue", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/Object;Landroidx/compose/foundation/gestures/DraggableAnchors;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/Object;)V", "anchoredDragScope", "androidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDragScope$1", "Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDragScope$1;", "<set-?>", "getAnchors", "()Landroidx/compose/foundation/gestures/DraggableAnchors;", "setAnchors", "(Landroidx/compose/foundation/gestures/DraggableAnchors;)V", "anchors$delegate", "Landroidx/compose/runtime/MutableState;", "getConfirmValueChange$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setConfirmValueChange$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "currentValue", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "currentValue$delegate", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "decayAnimationSpec", "getDecayAnimationSpec$annotations", "()V", "getDecayAnimationSpec", "()Landroidx/compose/animation/core/DecayAnimationSpec;", "setDecayAnimationSpec$foundation_release", "(Landroidx/compose/animation/core/DecayAnimationSpec;)V", "dragMutex", "Landroidx/compose/foundation/MutatorMutex;", "dragTarget", "getDragTarget", "setDragTarget", "dragTarget$delegate", "isAnimationRunning", "()Z", "lastVelocity", "getLastVelocity", "()F", "setLastVelocity", "(F)V", "lastVelocity$delegate", "Landroidx/compose/runtime/MutableFloatState;", "offset", "getOffset", "setOffset", "offset$delegate", "positionalThreshold", "totalDistance", "getPositionalThreshold$foundation_release", "setPositionalThreshold$foundation_release", NotificationCompat.CATEGORY_PROGRESS, "getProgress$annotations", "getProgress", "progress$delegate", "Landroidx/compose/runtime/State;", "settledValue", "getSettledValue", "setSettledValue", "settledValue$delegate", "Landroidx/compose/animation/core/AnimationSpec;", "snapAnimationSpec", "getSnapAnimationSpec$annotations", "getSnapAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "setSnapAnimationSpec$foundation_release", "(Landroidx/compose/animation/core/AnimationSpec;)V", "targetValue", "getTargetValue", "targetValue$delegate", "usePreModifierChangeBehavior", "getUsePreModifierChangeBehavior$foundation_release$annotations", "getUsePreModifierChangeBehavior$foundation_release", "velocityThreshold", "Lkotlin/Function0;", "getVelocityThreshold$foundation_release", "()Lkotlin/jvm/functions/Function0;", "setVelocityThreshold$foundation_release", "(Lkotlin/jvm/functions/Function0;)V", "anchoredDrag", "", "dragPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function4;", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "anchor", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchRawDelta", "delta", "newOffsetForDelta", "newOffsetForDelta$foundation_release", "from", "to", "(Ljava/lang/Object;Ljava/lang/Object;)F", "requireOffset", "settle", "animationSpec", "(Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "velocity", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trySnapTo", "(Ljava/lang/Object;)Z", "updateAnchors", "newAnchors", "newTarget", "(Landroidx/compose/foundation/gestures/DraggableAnchors;Ljava/lang/Object;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AnchoredDraggableState<T> {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private final AnchoredDraggableState$anchoredDragScope$1 anchoredDragScope;
    private final MutableState anchors$delegate;
    private Function1<? super T, Boolean> confirmValueChange;
    private final MutableState currentValue$delegate;
    public DecayAnimationSpec<Float> decayAnimationSpec;
    private final MutatorMutex dragMutex;
    private final MutableState dragTarget$delegate;
    private final MutableFloatState lastVelocity$delegate;
    private final MutableFloatState offset$delegate;
    public Function1<? super Float, Float> positionalThreshold;
    private final State progress$delegate;
    private final MutableState settledValue$delegate;
    public AnimationSpec<Float> snapAnimationSpec;
    private final State targetValue$delegate;
    public Function0<Float> velocityThreshold;

    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u0001J:\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\t0\bH\u0007J\u0087\u0001\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\f0\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\t0\bH\u0007¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "T", "confirmValueChange", "Lkotlin/Function1;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "positionalThreshold", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "distance", "velocityThreshold", "Lkotlin/Function0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final <T> Saver<AnchoredDraggableState<T>, T> Saver() {
            return SaverKt.Saver(AnchoredDraggableState$Companion$Saver$1.INSTANCE, AnchoredDraggableState$Companion$Saver$2.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Saver Saver$default(Companion r0, AnchoredDraggableState$Companion$Saver$3 r1, int r2, Object r3) {
            if ((r2 & 1) == 0) goto L6;
            r1 = AnchoredDraggableState$Companion$Saver$3.INSTANCE;
        L6:
            return r0.Saver(r1);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "confirmValueChange is deprecated without replacement. Rather than relying on a callback to veto state changes, the anchor set should not include disallowed anchors. See androidx.compose.foundation.samples.AnchoredDraggableDynamicAnchorsSample for an example of using dynamic anchors over confirmValueChange.")
        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(final Function1<? super T, Boolean> r3) {
            return SaverKt.Saver(AnchoredDraggableState$Companion$Saver$4.INSTANCE, new AnchoredDraggableState$Companion$Saver$5(r3));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Saver Saver$default(Companion r6, AnimationSpec r7, DecayAnimationSpec r8, Function1 r9, Function0 r10, Function1 r11, int r12, Object r13) {
            if ((r12 & 16) == 0) goto L5;
            Function1 r5 = AnchoredDraggableState$Companion$Saver$6.INSTANCE;
        L7:
            return r6.Saver(r7, r8, r9, r10, r5);
        L5:
            r5 = r11;
            goto L7
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "This constructor of AnchoredDraggableState has been deprecated. Please pass thresholds and animation specs to anchoredDraggableFlingBehavior(..) instead, which can be passed to Modifier.anchoredDraggable.")
        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(final AnimationSpec<Float> r8, final DecayAnimationSpec<Float> r9, final Function1<? super Float, Float> r10, final Function0<Float> r11, final Function1<? super T, Boolean> r12) {
            return SaverKt.Saver(AnchoredDraggableState$Companion$Saver$7.INSTANCE, new AnchoredDraggableState$Companion$Saver$8(r10, r11, r8, r9, r12));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2, reason: invalid class name */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", i = {}, l = {1125}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> $block;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "latestAnchors", "Landroidx/compose/foundation/gestures/DraggableAnchors;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", i = {}, l = {1126}, m = "invokeSuspend", n = {}, s = {})
        static final class C00172 extends SuspendLambda implements Function2<DraggableAnchors<T>, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> $block;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: Multi-variable type inference failed */
            C00172(Function3<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super Continuation<? super Unit>, ? extends Object> r2, AnchoredDraggableState<T> r3, Continuation<? super C00172> r4) {
                this.$block = r2;
                this.this$0 = r3;
                super(2, r4);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
                C00172 r0 = new C00172(this.$block, this.this$0, r5);
                r0.L$0 = r4;
                return r0;
            }

            public final Object invoke(DraggableAnchors<T> r3, Continuation<? super Unit> r4) {
                return ((C00172) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
                return invoke((DraggableAnchors) r2, r3);
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
                DraggableAnchors<T> r1 = (DraggableAnchors) this.L$0;
                Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> r2 = this.$block;
                AnchoredDraggableState$anchoredDragScope$1 r3 = AnchoredDraggableState.access$getAnchoredDragScope$p(this.this$0);
                this.label = 1;
                if (r2.invoke(r3, r1, this) != r0) goto L11;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(AnchoredDraggableState<T> r2, Function3<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super Continuation<? super Unit>, ? extends Object> r3, Continuation<? super AnonymousClass2> r4) {
            this.this$0 = r2;
            this.$block = r3;
            super(1, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> r4) {
            return new AnonymousClass2(this.this$0, this.$block, r4);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Unit> r2) {
            return invoke2(r2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Unit> r3) {
            return ((AnonymousClass2) create(r3)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            boolean isAtClosestAnchor = true;
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L10:
            T r1 = this.this$0.getAnchors().closestAnchor(this.this$0.getOffset());
            if (r1 == null) goto L20;
            float closestAnchorOffset = this.this$0.getAnchors().positionOf(r1);
            if (Math.abs(this.this$0.getOffset() - closestAnchorOffset) < 0.5f) goto L16;
            isAtClosestAnchor = false;
        L16:
            if (isAtClosestAnchor == false) goto L20;
            if (this.this$0.getConfirmValueChange$foundation_release().invoke(r1).booleanValue() == false) goto L20;
            AnchoredDraggableState.access$setSettledValue(this.this$0, r1);
            AnchoredDraggableState.access$setCurrentValue(this.this$0, r1);
        L20:
            Object closest = Unit.INSTANCE;
            return closest;
        L7:
            ResultKt.throwOnFailure($result);
            final AnchoredDraggableState<T> r3 = this.this$0;
            this.label = 1;
            if (AnchoredDraggableKt.access$restartable(new AnonymousClass1(r3), new C00172(this.$block, this.this$0, null), this) != r0) goto L10;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3, reason: invalid class name */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableState", f = "AnchoredDraggable.kt", i = {0}, l = {1170}, m = "anchoredDrag", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass3 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        AnonymousClass3(AnchoredDraggableState<T> r1, Continuation<? super AnonymousClass3> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.anchoredDrag(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4, reason: invalid class name */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", i = {}, l = {1172}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass4 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2, reason: invalid class name */
        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Landroidx/compose/foundation/gestures/DraggableAnchors;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", i = {}, l = {1174}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<Pair<? extends DraggableAnchors<T>, ? extends T>, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> $block;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(Function4<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super T, ? super Continuation<? super Unit>, ? extends Object> r2, AnchoredDraggableState<T> r3, Continuation<? super AnonymousClass2> r4) {
                this.$block = r2;
                this.this$0 = r3;
                super(2, r4);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
                AnonymousClass2 r0 = new AnonymousClass2(this.$block, this.this$0, r5);
                r0.L$0 = r4;
                return r0;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
                return invoke((Pair) r2, r3);
            }

            public final Object invoke(Pair<? extends DraggableAnchors<T>, ? extends T> r3, Continuation<? super Unit> r4) {
                return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2 for r6v1 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int r1 = r6.label;
                switch(r1) {
                    case 0: goto L7;
                    case 1: goto L6;
                    default: goto L4;
                };
            L4:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw r7;
            L6:
                kotlin.ResultKt.throwOnFailure(r7);
            L10:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE;
                return r0;
            L7:
                kotlin.ResultKt.throwOnFailure(r7);
                java.lang.Object r1 = r6.L$0;
                kotlin.Pair r1 = (kotlin.Pair) r1;
                java.lang.Object r2 = r1.component1();
                androidx.compose.foundation.gestures.DraggableAnchors<T> r2 = (androidx.compose.foundation.gestures.DraggableAnchors) r2;
                java.lang.Object r1 = r1.component2();
                kotlin.jvm.functions.Function4<androidx.compose.foundation.gestures.AnchoredDragScope, androidx.compose.foundation.gestures.DraggableAnchors<T>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r3 = r6.$block;
                androidx.compose.foundation.gestures.AnchoredDraggableState<T> r4 = r6.this$0;
                androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDragScope$1 r4 = androidx.compose.foundation.gestures.AnchoredDraggableState.access$getAnchoredDragScope$p(r4);
                r6.label = 1;
                androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDragScope$1 r4 = r4;
                androidx.compose.foundation.gestures.DraggableAnchors<T> r2 = r2;
                T r1 = (T) r1;
                java.lang.Object r6 = (kotlin.coroutines.Continuation<? super kotlin.Unit>) r6;
                java.lang.Object r1 = r3.invoke(r4, r2, r1, r6);
                if (r1 != r0) goto L10;
                return r0;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(AnchoredDraggableState<T> r2, T r3, Function4<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super T, ? super Continuation<? super Unit>, ? extends Object> r4, Continuation<? super AnonymousClass4> r5) {
            this.this$0 = r2;
            this.$targetValue = r3;
            this.$block = r4;
            super(1, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> r5) {
            return new AnonymousClass4(this.this$0, this.$targetValue, this.$block, r5);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Unit> r2) {
            return invoke2(r2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Unit> r3) {
            return ((AnonymousClass4) create(r3)).invokeSuspend(Unit.INSTANCE);
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
            if (this.this$0.getConfirmValueChange$foundation_release().invoke(this.$targetValue).booleanValue() == false) goto L14;
            float latestTargetOffset = this.this$0.getAnchors().positionOf(this.$targetValue);
            AnchoredDraggableState.access$getAnchoredDragScope$p(this.this$0).dragTo(latestTargetOffset, this.this$0.getLastVelocity());
            AnchoredDraggableState.access$setSettledValue(this.this$0, this.$targetValue);
            AnchoredDraggableState.access$setCurrentValue(this.this$0, this.$targetValue);
        L14:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            AnchoredDraggableState.access$setDragTarget(this.this$0, this.$targetValue);
            final AnchoredDraggableState<T> r2 = this.this$0;
            this.label = 1;
            if (AnchoredDraggableKt.access$restartable(new AnonymousClass1(r2), new AnonymousClass2(this.$block, this.this$0, null), this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        Companion = new Companion(null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This constructor of AnchoredDraggableState has been deprecated. Please pass thresholds and animation specs to anchoredDraggableFlingBehavior(..) instead, which can be passed to Modifier.anchoredDraggable.")
    public static /* synthetic */ void getDecayAnimationSpec$annotations() {
    }

    @Deprecated(message = "Use the progress function to query the progress between two specified anchors.", replaceWith = @ReplaceWith(expression = "progress(state.settledValue, state.targetValue)", imports = {}))
    public static /* synthetic */ void getProgress$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This constructor of AnchoredDraggableState has been deprecated. Please pass thresholds and animation specs to anchoredDraggableFlingBehavior(..) instead, which can be passed to Modifier.anchoredDraggable.")
    public static /* synthetic */ void getSnapAnimationSpec$annotations() {
    }

    public static /* synthetic */ void getUsePreModifierChangeBehavior$foundation_release$annotations() {
    }

    public AnchoredDraggableState(T r5) {
        this.confirmValueChange = AnchoredDraggableState$confirmValueChange$1.INSTANCE;
        this.dragMutex = new MutatorMutex();
        this.currentValue$delegate = SnapshotStateKt.mutableStateOf$default(r5, null, 2, null);
        this.settledValue$delegate = SnapshotStateKt.mutableStateOf$default(r5, null, 2, null);
        this.targetValue$delegate = SnapshotStateKt.derivedStateOf(new AnchoredDraggableState$targetValue$2(this));
        this.offset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
        this.progress$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new C02332(this));
        this.lastVelocity$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.dragTarget$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors$delegate = SnapshotStateKt.mutableStateOf$default(AnchoredDraggableKt.access$emptyDraggableAnchors(), null, 2, null);
        this.anchoredDragScope = new AnchoredDraggableState$anchoredDragScope$1(this);
    }

    public static final /* synthetic */ AnchoredDraggableState$anchoredDragScope$1 access$getAnchoredDragScope$p(AnchoredDraggableState $this) {
        return $this.anchoredDragScope;
    }

    public static final /* synthetic */ Object access$getDragTarget(AnchoredDraggableState $this) {
        return $this.getDragTarget();
    }

    public static final /* synthetic */ void access$setCurrentValue(AnchoredDraggableState $this, Object r1) {
        $this.setCurrentValue(r1);
    }

    public static final /* synthetic */ void access$setDragTarget(AnchoredDraggableState $this, Object r1) {
        $this.setDragTarget(r1);
    }

    public static final /* synthetic */ void access$setLastVelocity(AnchoredDraggableState $this, float r1) {
        $this.setLastVelocity(r1);
    }

    public static final /* synthetic */ void access$setOffset(AnchoredDraggableState $this, float r1) {
        $this.setOffset(r1);
    }

    public static final /* synthetic */ void access$setSettledValue(AnchoredDraggableState $this, Object r1) {
        $this.setSettledValue(r1);
    }

    public AnchoredDraggableState(T r1, DraggableAnchors<T> r2) {
        this(r1);
        setAnchors(r2);
        trySnapTo(r1);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "confirmValueChange is deprecated without replacement. Rather than relying on a callback to veto state changes, the anchor set should not include disallowed anchors. See androidx.compose.foundation.samples.AnchoredDraggableDynamicAnchorsSample for an example of using dynamic anchors over confirmValueChange.")
    public AnchoredDraggableState(T r1, Function1<? super T, Boolean> r2) {
        this(r1);
        this.confirmValueChange = r2;
    }

    public /* synthetic */ AnchoredDraggableState(Object r1, DraggableAnchors r2, AnonymousClass1 r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = AnonymousClass1.INSTANCE;
    L5:
        this(r1, r2, r3);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "confirmValueChange is deprecated without replacement. Rather than relying on a callback to veto state changes, the anchor set should not include disallowed anchors. See androidx.compose.foundation.samples.AnchoredDraggableDynamicAnchorsSample for an example of using dynamic anchors over confirmValueChange.")
    public AnchoredDraggableState(T r1, DraggableAnchors<T> r2, Function1<? super T, Boolean> r3) {
        this(r1, r3);
        setAnchors(r2);
        trySnapTo(r1);
    }

    public final Function1<T, Boolean> getConfirmValueChange$foundation_release() {
        return this.confirmValueChange;
    }

    public final void setConfirmValueChange$foundation_release(Function1<? super T, Boolean> r1) {
        this.confirmValueChange = r1;
    }

    public final Function1<Float, Float> getPositionalThreshold$foundation_release() {
        Function1 r0 = this.positionalThreshold;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.throwUninitializedPropertyAccessException("positionalThreshold");
        return null;
    }

    public final void setPositionalThreshold$foundation_release(Function1<? super Float, Float> r1) {
        this.positionalThreshold = r1;
    }

    public final Function0<Float> getVelocityThreshold$foundation_release() {
        Function0<Float> r0 = this.velocityThreshold;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.throwUninitializedPropertyAccessException("velocityThreshold");
        return null;
    }

    public final void setVelocityThreshold$foundation_release(Function0<Float> r1) {
        this.velocityThreshold = r1;
    }

    public final AnimationSpec<Float> getSnapAnimationSpec() {
        AnimationSpec<Float> r0 = this.snapAnimationSpec;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.throwUninitializedPropertyAccessException("snapAnimationSpec");
        return null;
    }

    public final void setSnapAnimationSpec$foundation_release(AnimationSpec<Float> r1) {
        this.snapAnimationSpec = r1;
    }

    public final DecayAnimationSpec<Float> getDecayAnimationSpec() {
        DecayAnimationSpec<Float> r0 = this.decayAnimationSpec;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.throwUninitializedPropertyAccessException("decayAnimationSpec");
        return null;
    }

    public final void setDecayAnimationSpec$foundation_release(DecayAnimationSpec<Float> r1) {
        this.decayAnimationSpec = r1;
    }

    public final boolean getUsePreModifierChangeBehavior$foundation_release() {
        if (this.positionalThreshold != null) goto L5;
    L11:
        return false;
    L5:
        if (this.velocityThreshold == null) goto L11;
        if (this.snapAnimationSpec == null) goto L11;
        if (this.decayAnimationSpec == null) goto L11;
        return true;
    }

    private final void setCurrentValue(T r4) {
        MutableState $this$setValue$iv = this.currentValue$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final T getCurrentValue() {
        State $this$getValue$iv = this.currentValue$delegate;
        return $this$getValue$iv.getValue();
    }

    private final void setSettledValue(T r4) {
        MutableState $this$setValue$iv = this.settledValue$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final T getSettledValue() {
        State $this$getValue$iv = this.settledValue$delegate;
        return $this$getValue$iv.getValue();
    }

    public final T getTargetValue() {
        return (T) this.targetValue$delegate.getValue();
    }

    private final void setOffset(float r4) {
        MutableFloatState $this$setValue$iv = this.offset$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    public final float getOffset() {
        FloatState $this$getValue$iv = this.offset$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    public final float requireOffset() {
        boolean value$iv = !Float.isNaN(getOffset());
        if (value$iv == true) goto L6;
        InlineClassHelperKt.throwIllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
    L6:
        return getOffset();
    }

    public final boolean isAnimationRunning() {
        if (getDragTarget() == null) goto L5;
        return true;
    L5:
        return false;
    }

    public final float progress(T r7, T r8) {
        float fromOffset = getAnchors().positionOf(r7);
        float toOffset = getAnchors().positionOf(r8);
        float currentOffset = RangesKt.coerceIn(getOffset(), Math.min(fromOffset, toOffset), Math.max(fromOffset, toOffset));
        float fraction = (currentOffset - fromOffset) / (toOffset - fromOffset);
        if (Float.isNaN(fraction) == false) goto L5;
        return 1.0f;
    L5:
        if (fraction >= 1.0E-6f) goto L8;
        return 0.0f;
    L8:
        if (fraction <= 0.999999f) goto L13;
        return 1.0f;
    L13:
        return Math.abs(fraction);
    }

    public final float getProgress() {
        State $this$getValue$iv = this.progress$delegate;
        return ((Number) $this$getValue$iv.getValue()).floatValue();
    }

    private final void setLastVelocity(float r4) {
        MutableFloatState $this$setValue$iv = this.lastVelocity$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    public final float getLastVelocity() {
        FloatState $this$getValue$iv = this.lastVelocity$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    private final T getDragTarget() {
        State $this$getValue$iv = this.dragTarget$delegate;
        return $this$getValue$iv.getValue();
    }

    private final void setDragTarget(T r4) {
        MutableState $this$setValue$iv = this.dragTarget$delegate;
        $this$setValue$iv.setValue(r4);
    }

    private final void setAnchors(DraggableAnchors<T> r4) {
        MutableState $this$setValue$iv = this.anchors$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final DraggableAnchors<T> getAnchors() {
        State $this$getValue$iv = this.anchors$delegate;
        return (DraggableAnchors) $this$getValue$iv.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAnchors$default(AnchoredDraggableState r0, DraggableAnchors r1, Object r2, int r3, Object r4) {
        if ((r3 & 2) != 0) goto L5;
    L11:
        r0.updateAnchors(r1, r2);
        return;
    L5:
        if (Float.isNaN(r0.getOffset()) == true) goto L9;
        r2 = r1.closestAnchor(r0.getOffset());
        if (r2 != null) goto L11;
        r2 = r0.getTargetValue();
        goto L11
    L9:
        r2 = r0.getTargetValue();
        goto L11
    }

    public final void updateAnchors(DraggableAnchors<T> r2, T r3) {
        if (Intrinsics.areEqual(getAnchors(), r2) == true) goto L8;
        setAnchors(r2);
        boolean snapSuccessful = trySnapTo(r3);
        if (snapSuccessful == true) goto L9;
        setDragTarget(r3);
        return;
    L9:
        return;
    }

    public final Object settle(AnimationSpec<Float> r5, Continuation<? super Unit> r6) {
        Object previousValue = getCurrentValue();
        Object targetValue = getAnchors().closestAnchor(requireOffset());
        if (targetValue != null) goto L5;
    L11:
        Object r2 = AnchoredDraggableKt.animateTo(this, previousValue, r5, r6);
        if (r2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L15;
        return r2;
    L15:
        return Unit.INSTANCE;
    L5:
        if (this.confirmValueChange.invoke(targetValue).booleanValue() == false) goto L11;
        Object r3 = AnchoredDraggableKt.animateTo(this, targetValue, r5, r6);
        if (r3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        return r3;
    L10:
        return Unit.INSTANCE;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "settle does not accept a velocity anymore. Please use FlingBehavior#performFling instead. See AnchoredDraggableSamples.kt for example usages.")
    public final Object settle(float velocity, Continuation<? super Float> r15) {
        boolean value$iv = getUsePreModifierChangeBehavior$foundation_release();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalArgumentException("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
    L5:
        Object previousValue = getCurrentValue();
        Object targetValue = AnchoredDraggableKt.access$computeTarget(getAnchors(), requireOffset(), velocity, getPositionalThreshold$foundation_release(), getVelocityThreshold$foundation_release());
        if (this.confirmValueChange.invoke(targetValue).booleanValue() == false) goto L10;
        return AnchoredDraggableKt.animateToWithDecay$default(this, targetValue, velocity, null, null, r15, 12, null);
    L10:
        return AnchoredDraggableKt.animateToWithDecay$default(this, previousValue, velocity, null, null, r15, 12, null);
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState r0, MutatePriority r1, Function3 r2, Continuation r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = MutatePriority.Default;
    L6:
        return r0.anchoredDrag(r1, r2, r3);
    }

    public final Object anchoredDrag(MutatePriority dragPriority, Function3<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super Continuation<? super Unit>, ? extends Object> r5, Continuation<? super Unit> r6) {
        Object r0 = this.dragMutex.mutate(dragPriority, new AnonymousClass2(this, r5, null), r6);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState r0, Object r1, MutatePriority r2, Function4 r3, Continuation r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = MutatePriority.Default;
    L6:
        return r0.anchoredDrag(r1, r2, r3, r4);
    }

    public final Object anchoredDrag(T r9, MutatePriority dragPriority, Function4<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super T, ? super Continuation<? super Unit>, ? extends Object> r11, Continuation<? super Unit> r12) {
        if ((r12 instanceof AnonymousClass3) == false) goto L7;
        AnonymousClass3 r0 = (AnonymousClass3) r12;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        AnchoredDraggableState<T> r10 = (AnchoredDraggableState) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
    L23:
        r10.setDragTarget(null);
    L31:
        Object targetValue = Unit.INSTANCE;
        return targetValue;
    L15:
        th = th;
    L26:
        r10.setDragTarget(null);
        throw th;
    L17:
        ResultKt.throwOnFailure($result);
        if (getAnchors().hasPositionFor(r9) == false) goto L29;
        MutatorMutex r5 = this.dragMutex;     // Catch: Throwable -> L24
        AnonymousClass4 r6 = new AnonymousClass4(this, r9, r11, null);     // Catch: Throwable -> L24
        r0.L$0 = this;     // Catch: Throwable -> L24
        r0.label = 1;     // Catch: Throwable -> L24
        if (r5.mutate(dragPriority, r6, r0) != r2) goto L22;
        return r2;
    L22:
        r10 = this;
    L24:
        th = th;
        r10 = this;
        goto L26
    L29:
        if (this.confirmValueChange.invoke(r9).booleanValue() == false) goto L31;
        setSettledValue(r9);
        setCurrentValue(r9);
        goto L31
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass3(this, r12);
        goto L8
    }

    public final float newOffsetForDelta$foundation_release(float delta) {
        if (Float.isNaN(getOffset()) == false) goto L5;
        float r0 = 0.0f;
    L7:
        return RangesKt.coerceIn(r0 + delta, getAnchors().minPosition(), getAnchors().maxPosition());
    L5:
        r0 = getOffset();
        goto L7
    }

    public final float dispatchRawDelta(float delta) {
        float newOffset = newOffsetForDelta$foundation_release(delta);
        float consumedDelta = newOffset - requireOffset();
        AnchoredDragScope.dragTo$default(this.anchoredDragScope, newOffset, 0.0f, 2, null);
        return consumedDelta;
    }

    private final boolean trySnapTo(T r12) {
        MutatorMutex this_$iv = this.dragMutex;
        boolean didLock$iv = this_$iv.tryLock();
        if (didLock$iv == true) goto L15;
    L14:
        return didLock$iv;
    L15:
        AnchoredDraggableState$anchoredDragScope$1 $this$trySnapTo_u24lambda_u243_u24lambda_u242 = this.anchoredDragScope;     // Catch: Throwable -> L10
        float targetOffset = getAnchors().positionOf(r12);     // Catch: Throwable -> L10
        if (Float.isNaN(targetOffset) == true) goto L8;
        AnchoredDragScope.dragTo$default($this$trySnapTo_u24lambda_u243_u24lambda_u242, targetOffset, 0.0f, 2, null);     // Catch: Throwable -> L10
        setDragTarget(null);     // Catch: Throwable -> L10
    L8:
        setCurrentValue(r12);     // Catch: Throwable -> L10
        setSettledValue(r12);     // Catch: Throwable -> L10
        this_$iv.unlock();
    L10:
        th = move-exception;
        this_$iv.unlock();
        throw th;
    }
}
