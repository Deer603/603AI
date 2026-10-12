package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;

/* JADX INFO: compiled from: MouseWheelScrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001RBP\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00121\u0010\u0006\u001a-\b\u0001\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\"\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J(\u0010$\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&2\u0006\u0010 \u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u000e\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020+J\u0010\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u0013H\u0002J$\u0010.\u001a\b\u0012\u0004\u0012\u0002H00/\"\u0004\b\u0000\u001002\u000e\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H002H\u0002J\u000e\u00103\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJY\u00104\u001a\u00020\r*\u0002052\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u000209072\u0006\u0010:\u001a\u0002082\u0006\u0010;\u001a\u00020<2!\u0010=\u001a\u001d\u0012\u0013\u0012\u001108¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(?\u0012\u0004\u0012\u00020\u00150>H\u0082@¢\u0006\u0002\u0010@J\u0018\u0010A\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@¢\u0006\u0002\u0010BJ\u001e\u0010C\u001a\u00020\u0015*\u00020\u00032\u0006\u0010-\u001a\u00020DH\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ\f\u0010G\u001a\u00020\r*\u00020\u001cH\u0002J\u0014\u0010H\u001a\u000208*\u0002052\u0006\u0010I\u001a\u000208H\u0002J*\u0010H\u001a\u00020\r*\u00020\u00032\u0006\u0010-\u001a\u00020\u00132\u0006\u0010J\u001a\u0002082\u0006\u0010K\u001a\u000208H\u0082@¢\u0006\u0002\u0010LJ\u0014\u0010M\u001a\u0004\u0018\u00010\u0013*\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J;\u0010N\u001a\u00020\r*\u00020\u00032'\u0010O\u001a#\b\u0001\u0012\u0004\u0012\u000205\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0002\bPH\u0082@¢\u0006\u0002\u0010QR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R;\u0010\u0006\u001a-\b\u0001\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u001b\u001a\u00020\u0015*\u00020\u001c8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006S"}, d2 = {"Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;", "", "scrollingLogic", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "mouseWheelScrollConfig", "Landroidx/compose/foundation/gestures/ScrollConfig;", "onScrollStopped", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Velocity;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "velocity", "Lkotlin/coroutines/Continuation;", "", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Landroidx/compose/foundation/gestures/ScrollConfig;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/unit/Density;)V", "channel", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "isScrolling", "", "Lkotlin/jvm/functions/Function2;", "receivingMouseWheelEventsJob", "Lkotlinx/coroutines/Job;", "velocityTracker", "Landroidx/compose/foundation/gestures/MouseWheelVelocityTracker;", "isConsumed", "Landroidx/compose/ui/input/pointer/PointerEvent;", "(Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "onMouseWheel", "pointerEvent", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onMouseWheel-O0kMr_c", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "onPointerEvent", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "startReceivingMouseWheelEvents", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "trackVelocity", "scrollDelta", "untilNull", "Lkotlin/sequences/Sequence;", "E", "builderAction", "Lkotlin/Function0;", "updateDensity", "animateMouseWheelScroll", "Landroidx/compose/foundation/gestures/NestedScrollScope;", "animationState", "Landroidx/compose/animation/core/AnimationState;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "targetValue", "durationMillis", "", "shouldCancelAnimation", "Lkotlin/Function1;", "lastValue", "(Landroidx/compose/foundation/gestures/NestedScrollScope;Landroidx/compose/animation/core/AnimationState;FILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "busyReceive", "(Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "canConsumeDelta", "Landroidx/compose/ui/geometry/Offset;", "canConsumeDelta-Uv8p0NA", "(Landroidx/compose/foundation/gestures/ScrollingLogic;J)Z", "consume", "dispatchMouseWheelScroll", "delta", "threshold", "speed", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;FFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sumOrNull", "userScroll", "block", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "MouseWheelScrollDelta", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MouseWheelScrollingLogic {
    public static final int $stable = 0;
    private final Channel<MouseWheelScrollDelta> channel;
    private Density density;
    private boolean isScrolling;
    private final ScrollConfig mouseWheelScrollConfig;
    private final Function2<Velocity, Continuation<? super Unit>, Object> onScrollStopped;
    private Job receivingMouseWheelEventsJob;
    private final ScrollingLogic scrollingLogic;
    private final MouseWheelVelocityTracker velocityTracker;

    /* JADX INFO: compiled from: MouseWheelScrollable.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u000f\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\fJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0011\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0086\u0002J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\r\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "", "value", "Landroidx/compose/ui/geometry/Offset;", "timeMillis", "", "shouldApplyImmediately", "", "(JJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getShouldApplyImmediately", "()Z", "getTimeMillis", "()J", "getValue-F1C5BW0", "J", "component1", "component1-F1C5BW0", "component2", "component3", "copy", "copy-9KIMszo", "(JJZ)Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "equals", "other", "hashCode", "", "plus", "toString", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class MouseWheelScrollDelta {
        private final boolean shouldApplyImmediately;
        private final long timeMillis;
        private final long value;

        public /* synthetic */ MouseWheelScrollDelta(long r1, long r3, boolean r5, DefaultConstructorMarker r6) {
            this(r1, r3, r5);
        }

        /* JADX INFO: renamed from: copy-9KIMszo$default, reason: not valid java name */
        public static /* synthetic */ MouseWheelScrollDelta m462copy9KIMszo$default(MouseWheelScrollDelta r6, long r7, long r9, boolean r11, int r12, Object r13) {
            if ((r12 & 1) == 0) goto L5;
            r7 = r6.value;
        L5:
            long r1 = r7;
            if ((r12 & 2) == 0) goto L8;
            r9 = r6.timeMillis;
        L8:
            long r3 = r9;
            if ((r12 & 4) == 0) goto L12;
            r11 = r6.shouldApplyImmediately;
        L12:
            return r6.m464copy9KIMszo(r1, r3, r11);
        }

        /* JADX INFO: renamed from: component1-F1C5BW0, reason: not valid java name */
        public final long m463component1F1C5BW0() {
            return this.value;
        }

        public final long component2() {
            return this.timeMillis;
        }

        public final boolean component3() {
            return this.shouldApplyImmediately;
        }

        /* JADX INFO: renamed from: copy-9KIMszo, reason: not valid java name */
        public final MouseWheelScrollDelta m464copy9KIMszo(long r8, long r10, boolean r12) {
            return new MouseWheelScrollDelta(r8, r10, r12, null);
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof MouseWheelScrollDelta) == true) goto L8;
            return false;
        L8:
            MouseWheelScrollDelta r1 = (MouseWheelScrollDelta) r8;
            if (Offset.m4122equalsimpl0(this.value, r1.value) == true) goto L12;
            return false;
        L12:
            if (this.timeMillis == r1.timeMillis) goto L15;
            return false;
        L15:
            if (this.shouldApplyImmediately == r1.shouldApplyImmediately) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Offset.m4127hashCodeimpl(this.value) * 31) + Long.hashCode(this.timeMillis)) * 31) + Boolean.hashCode(this.shouldApplyImmediately);
        }

        public String toString() {
            return "MouseWheelScrollDelta(value=" + Offset.m4133toStringimpl(this.value) + ", timeMillis=" + this.timeMillis + ", shouldApplyImmediately=" + this.shouldApplyImmediately + ')';
        }

        private MouseWheelScrollDelta(long value, long timeMillis, boolean shouldApplyImmediately) {
            this.value = value;
            this.timeMillis = timeMillis;
            this.shouldApplyImmediately = shouldApplyImmediately;
        }

        /* JADX INFO: renamed from: getValue-F1C5BW0, reason: not valid java name */
        public final long m465getValueF1C5BW0() {
            return this.value;
        }

        public final long getTimeMillis() {
            return this.timeMillis;
        }

        public final boolean getShouldApplyImmediately() {
            return this.shouldApplyImmediately;
        }

        public final MouseWheelScrollDelta plus(MouseWheelScrollDelta other) {
            return new MouseWheelScrollDelta(Offset.m4130plusMKHz9U(this.value, other.value), Math.max(this.timeMillis, other.timeMillis), this.shouldApplyImmediately, null);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: MouseWheelScrollable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$MouseWheelScrollDelta;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2", f = "MouseWheelScrollable.kt", i = {0}, l = {170}, m = "invokeSuspend", n = {"job"}, s = {"L$0"})
    static final class C02512 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MouseWheelScrollDelta>, Object> {
        final /* synthetic */ Channel<MouseWheelScrollDelta> $this_busyReceive;
        private /* synthetic */ Object L$0;
        int label;

        C02512(Channel<MouseWheelScrollDelta> r2, Continuation<? super C02512> r3) {
            this.$this_busyReceive = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            C02512 r0 = new C02512(this.$this_busyReceive, r4);
            r0.L$0 = r3;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super MouseWheelScrollDelta> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super MouseWheelScrollDelta> r4) {
            return ((C02512) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r1v8 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r1) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            r1 = this.label;
            switch(r1) {
                case 0: goto L9;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            Job r2 = (Job) this.L$0;
            ResultKt.throwOnFailure(r1);     // Catch: Throwable -> L19
            Job r4 = r2;
            Object r12 = r1;
        L22:
            MouseWheelScrollDelta r13 = (MouseWheelScrollDelta) r12;     // Catch: Throwable -> L17
            Job.DefaultImpls.cancel$default(r4, null, 1, null);
            return r13;
        L17:
            th = th;
            r1 = r4;
        L20:
            Job.DefaultImpls.cancel$default(r1, null, 1, null);
            throw th;
        L9:
            ResultKt.throwOnFailure(r1);
            Job r3 = BuildersKt.launch$default((CoroutineScope) this.L$0, null, null, new MouseWheelScrollingLogic$busyReceive$2$job$1(null), 3, null);
            this.L$0 = r3;     // Catch: Throwable -> L19
            this.label = 1;     // Catch: Throwable -> L19
            Object r5 = this.$this_busyReceive.receive(this);     // Catch: Throwable -> L19
            if (r5 != r0) goto L13;
            return r0;
        L13:
            r12 = r5;
            r4 = r3;
            goto L22
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L19:
            th = th;
            goto L20
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$1, reason: invalid class name */
    /* JADX INFO: compiled from: MouseWheelScrollable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", i = {0, 0, 0, 0}, l = {244, 295}, m = "dispatchMouseWheelScroll", n = {"this", "$this$dispatchMouseWheelScroll", "targetValue", "speed"}, s = {"L$0", "L$1", "L$2", "F$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        float F$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ MouseWheelScrollingLogic this$0;

        AnonymousClass1(MouseWheelScrollingLogic r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r8) {
            this.result = r8;
            this.label |= Integer.MIN_VALUE;
            return MouseWheelScrollingLogic.access$dispatchMouseWheelScroll(this.this$0, null, null, 0.0f, 0.0f, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3, reason: invalid class name */
    /* JADX INFO: compiled from: MouseWheelScrollable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", f = "MouseWheelScrollable.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {253, 266, 283}, m = "invokeSuspend", n = {"$this$userScroll", "requiredAnimation", "$this$userScroll", "requiredAnimation", "durationMillis", "$this$userScroll", "requiredAnimation"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0", "L$0", "L$1"})
    static final class AnonymousClass3 extends SuspendLambda implements Function2<NestedScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> $animationState;
        final /* synthetic */ float $speed;
        final /* synthetic */ Ref.ObjectRef<MouseWheelScrollDelta> $targetScrollDelta;
        final /* synthetic */ Ref.FloatRef $targetValue;
        final /* synthetic */ ScrollingLogic $this_dispatchMouseWheelScroll;
        final /* synthetic */ float $threshold;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ MouseWheelScrollingLogic this$0;

        AnonymousClass3(Ref.FloatRef r2, Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> r3, Ref.ObjectRef<MouseWheelScrollDelta> r4, float r5, MouseWheelScrollingLogic r6, float r7, ScrollingLogic r8, Continuation<? super AnonymousClass3> r9) {
            this.$targetValue = r2;
            this.$animationState = r3;
            this.$targetScrollDelta = r4;
            this.$threshold = r5;
            this.this$0 = r6;
            this.$speed = r7;
            this.$this_dispatchMouseWheelScroll = r8;
            super(2, r9);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r10, Continuation<?> r11) {
            AnonymousClass3 r0 = new AnonymousClass3(this.$targetValue, this.$animationState, this.$targetScrollDelta, this.$threshold, this.this$0, this.$speed, this.$this_dispatchMouseWheelScroll, r11);
            r0.L$0 = r10;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(NestedScrollScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass3) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(NestedScrollScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX WARN: Type inference failed for: r4v19, types: [T, androidx.compose.animation.core.AnimationState] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x013b -> B:10:0x006d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0165 -> B:27:0x0169). Please report as a decompilation issue!!! */
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
            Ref.BooleanRef r4 = (Ref.BooleanRef) this.L$2;
            Ref.BooleanRef requiredAnimation = (Ref.BooleanRef) this.L$1;
            NestedScrollScope $this$userScroll = (NestedScrollScope) this.L$0;
            ResultKt.throwOnFailure($result2);
            Ref.BooleanRef requiredAnimation2 = requiredAnimation;
            NestedScrollScope $this$userScroll2 = $this$userScroll;
            AnonymousClass3 r12 = this;
            final Ref.BooleanRef requiredAnimation3 = r4;
            Object $result3 = $result2;
        L27:
            requiredAnimation3.element = ((Boolean) $result2).booleanValue();
            Object $result4 = $result3;
            requiredAnimation3 = requiredAnimation2;
        L11:
            if (requiredAnimation3.element == false) goto L34;
            requiredAnimation3.element = false;
            float targetValueLeftover = r12.$targetValue.element - r12.$animationState.element.getValue().floatValue();
            if (r12.$targetScrollDelta.element.getShouldApplyImmediately() == false) goto L15;
        L28:
            MouseWheelScrollingLogic.access$dispatchMouseWheelScroll(r12.this$0, $this$userScroll2, targetValueLeftover);
            r12.L$0 = $this$userScroll2;
            r12.L$1 = requiredAnimation3;
            r12.L$2 = requiredAnimation3;
            r12.label = 1;
            Object $result5 = MouseWheelScrollingLogic.access$dispatchMouseWheelScroll$waitNextScrollDelta(r12.this$0, r12.$targetScrollDelta, r12.$targetValue, r12.$this_dispatchMouseWheelScroll, r12.$animationState, 50, r12);
            if ($result5 == r1) goto L30;
            Object $result6 = $result4;
            Ref.BooleanRef requiredAnimation4 = requiredAnimation3;
            requiredAnimation3.element = ((Boolean) $result5).booleanValue();
            $result4 = $result6;
            requiredAnimation3 = requiredAnimation4;
            goto L11
        L30:
            return r1;
        L15:
            if (Math.abs(targetValueLeftover) < r12.$threshold) goto L28;
            float instantDelta = Math.signum(targetValueLeftover) * r12.$threshold;
            MouseWheelScrollingLogic.access$dispatchMouseWheelScroll(r12.this$0, $this$userScroll2, instantDelta);
            Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> r6 = r12.$animationState;
            r6.element = AnimationStateKt.copy$default(r12.$animationState.element, r12.$animationState.element.getValue().floatValue() + instantDelta, 0.0f, 0, 0, false, 30, null);
            int durationMillis = RangesKt.coerceAtMost(MathKt.roundToInt(Math.abs(r12.$targetValue.element - r12.$animationState.element.getValue().floatValue()) / r12.$speed), 100);
            MouseWheelScrollingLogic r13 = r12.this$0;
            AnimationState<Float, AnimationVector1D> r14 = r12.$animationState.element;
            float r15 = r12.$targetValue.element;
            final MouseWheelScrollingLogic r7 = r12.this$0;
            final Ref.ObjectRef<MouseWheelScrollDelta> r8 = r12.$targetScrollDelta;
            final Ref.FloatRef r9 = r12.$targetValue;
            final ScrollingLogic r10 = r12.$this_dispatchMouseWheelScroll;
            r12.L$0 = $this$userScroll2;
            r12.L$1 = requiredAnimation3;
            r12.L$2 = null;
            r12.I$0 = durationMillis;
            r12.label = 2;
            if (MouseWheelScrollingLogic.access$animateMouseWheelScroll(r13, $this$userScroll2, r14, r15, durationMillis, new AnonymousClass1(r7, r8, r9, r10, requiredAnimation3), r12) != r1) goto L20;
            return r1;
        L20:
            int durationMillis2 = durationMillis;
        L22:
            if (requiredAnimation3.element == true) goto L11;
            r12.L$0 = $this$userScroll2;
            r12.L$1 = requiredAnimation3;
            r12.L$2 = requiredAnimation3;
            r12.label = 3;
            Object r5 = MouseWheelScrollingLogic.access$dispatchMouseWheelScroll$waitNextScrollDelta(r12.this$0, r12.$targetScrollDelta, r12.$targetValue, r12.$this_dispatchMouseWheelScroll, r12.$animationState, 50 - ((long) durationMillis2), r12);
            if (r5 != r1) goto L26;
            return r1;
        L26:
            $result3 = $result4;
            $result2 = r5;
            requiredAnimation2 = requiredAnimation3;
            goto L27
        L34:
            return Unit.INSTANCE;
        L7:
            $result4 = $result;
            durationMillis2 = this.I$0;
            Ref.BooleanRef requiredAnimation5 = (Ref.BooleanRef) this.L$1;
            NestedScrollScope $this$userScroll3 = (NestedScrollScope) this.L$0;
            ResultKt.throwOnFailure($result4);
            r12 = this;
            requiredAnimation3 = requiredAnimation5;
            $this$userScroll2 = $this$userScroll3;
            goto L22
        L8:
            Ref.BooleanRef r11 = (Ref.BooleanRef) this.L$2;
            Ref.BooleanRef requiredAnimation6 = (Ref.BooleanRef) this.L$1;
            NestedScrollScope $this$userScroll4 = (NestedScrollScope) this.L$0;
            ResultKt.throwOnFailure($result);
            $this$userScroll2 = $this$userScroll4;
            r12 = this;
            r11.element = ((Boolean) $result).booleanValue();
            $result4 = $result;
            requiredAnimation3 = requiredAnimation6;
            goto L11
        L9:
            ResultKt.throwOnFailure($result);
            $result4 = $result;
            NestedScrollScope $this$userScroll5 = (NestedScrollScope) this.L$0;
            Ref.BooleanRef requiredAnimation7 = new Ref.BooleanRef();
            requiredAnimation7.element = true;
            r12 = this;
            requiredAnimation3 = requiredAnimation7;
            $this$userScroll2 = $this$userScroll5;
            goto L11
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: MouseWheelScrollable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1", f = "MouseWheelScrollable.kt", i = {0, 1}, l = {107, 110}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
    static final class C02521 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MouseWheelScrollingLogic this$0;

        C02521(MouseWheelScrollingLogic r2, Continuation<? super C02521> r3) {
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            C02521 r0 = new C02521(this.this$0, r4);
            r0.L$0 = r3;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((C02521) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x008f -> B:33:0x0033). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L14;
                case 1: goto L9;
                case 2: goto L6;
                default: goto L5;
            };
        L6:
            CoroutineScope $this$launch = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure($result);     // Catch: Throwable -> L12
            C02521 r3 = this;
        L33:
        L30:
            th = th;
        L31:
            MouseWheelScrollingLogic.access$setReceivingMouseWheelEventsJob$p(r3.this$0, null);
            throw th;
        L16:
            if (JobKt.isActive($this$launch.getCoroutineContext()) == false) goto L28;
            r3.L$0 = $this$launch;     // Catch: Throwable -> L30
            r3.label = 1;     // Catch: Throwable -> L30
            Object r4 = MouseWheelScrollingLogic.access$getChannel$p(r3.this$0).receive(r3);     // Catch: Throwable -> L30
            if (r4 != r0) goto L20;
            return r0;
        L20:
            CoroutineScope r11 = $this$launch;
            Object $result2 = $result;
            $result = r4;
            C02521 r5 = r3;
            CoroutineScope $this$launch2 = r11;
        L35:
            MouseWheelScrollDelta scrollDelta = (MouseWheelScrollDelta) $result;     // Catch: Throwable -> L26
            Density $this$invokeSuspend_u24lambda_u240 = MouseWheelScrollingLogic.access$getDensity$p(r5.this$0);     // Catch: Throwable -> L26
            float threshold = $this$invokeSuspend_u24lambda_u240.mo376toPx0680j_4(MouseWheelScrollableKt.access$getAnimationThreshold$p());     // Catch: Throwable -> L26
            Density $this$invokeSuspend_u24lambda_u241 = MouseWheelScrollingLogic.access$getDensity$p(r5.this$0);     // Catch: Throwable -> L26
            float speed = $this$invokeSuspend_u24lambda_u241.mo376toPx0680j_4(MouseWheelScrollableKt.access$getAnimationSpeed$p());     // Catch: Throwable -> L26
            r5.L$0 = $this$launch2;     // Catch: Throwable -> L26
            r5.label = 2;     // Catch: Throwable -> L26
            if (MouseWheelScrollingLogic.access$dispatchMouseWheelScroll(r5.this$0, MouseWheelScrollingLogic.access$getScrollingLogic$p(r5.this$0), scrollDelta, threshold, speed, r5) != r0) goto L24;
            return r0;
        L24:
            $result = $result2;
            $this$launch = $this$launch2;
            r3 = r5;
        L26:
            th = th;
            r3 = r5;
            goto L31
        L28:
            MouseWheelScrollingLogic.access$setReceivingMouseWheelEventsJob$p(r3.this$0, null);
            return Unit.INSTANCE;
        L9:
            CoroutineScope $this$launch3 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure($result);     // Catch: Throwable -> L12
            r5 = this;
            $this$launch2 = $this$launch3;
            $result2 = $result;
            goto L35
        L14:
            ResultKt.throwOnFailure($result);
            $this$launch = (CoroutineScope) this.L$0;
            r3 = this;
            goto L33
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L12:
            th = th;
            r3 = this;
            goto L31
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: MouseWheelScrollable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1", f = "MouseWheelScrollable.kt", i = {0}, l = {179}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
    static final class C02541<E> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super E>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<E> $builderAction;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C02541(Function0<? extends E> r2, Continuation<? super C02541> r3) {
            this.$builderAction = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            C02541 r0 = new C02541(this.$builderAction, r4);
            r0.L$0 = r3;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
            return invoke((SequenceScope) r2, r3);
        }

        public final Object invoke(SequenceScope<? super E> r3, Continuation<? super Unit> r4) {
            return ((C02541) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0040 -> B:14:0x0044). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0046 -> B:16:0x0049). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            Object r2 = this.L$1;
            SequenceScope $this$sequence = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure($result);
            SequenceScope $this$sequence2 = $this$sequence;
            Object element = r2;
            C02541<E> r3 = this;
        L14:
            C02541<E> r1 = r3;
        L16:
            if (element == null) goto L18;
            SequenceScope $this$sequence3 = $this$sequence2;
        L8:
            E r4 = r1.$builderAction.invoke();
            if (r4 == null) goto L15;
            r1.L$0 = $this$sequence3;
            r1.L$1 = r4;
            r1.label = 1;
            Object it = $this$sequence3.yield(r4, r1);
            if (it != r0) goto L13;
            return r0;
        L13:
            $this$sequence2 = $this$sequence3;
            element = r4;
            r3 = r1;
            goto L14
        L15:
            $this$sequence2 = $this$sequence3;
            element = null;
            goto L16
        L18:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            $this$sequence3 = (SequenceScope) this.L$0;
            r1 = this;
            goto L8
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: MouseWheelScrollable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", i = {0}, l = {122}, m = "userScroll", n = {"this"}, s = {"L$0"})
    static final class C02551 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ MouseWheelScrollingLogic this$0;

        C02551(MouseWheelScrollingLogic r1, Continuation<? super C02551> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return MouseWheelScrollingLogic.access$userScroll(this.this$0, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: MouseWheelScrollable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2", f = "MouseWheelScrollable.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
    static final class C02562 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<NestedScrollScope, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ ScrollingLogic $this_userScroll;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C02562(ScrollingLogic r2, Function2<? super NestedScrollScope, ? super Continuation<? super Unit>, ? extends Object> r3, Continuation<? super C02562> r4) {
            this.$this_userScroll = r2;
            this.$block = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            return new C02562(this.$this_userScroll, this.$block, r5);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((C02562) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
            if (this.$this_userScroll.scroll(MutatePriority.UserInput, this.$block, this) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MouseWheelScrollingLogic(ScrollingLogic scrollingLogic, ScrollConfig mouseWheelScrollConfig, Function2<? super Velocity, ? super Continuation<? super Unit>, ? extends Object> r6, Density density) {
        this.scrollingLogic = scrollingLogic;
        this.mouseWheelScrollConfig = mouseWheelScrollConfig;
        this.onScrollStopped = r6;
        this.density = density;
        this.channel = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.velocityTracker = new MouseWheelVelocityTracker();
    }

    public static final /* synthetic */ Object access$animateMouseWheelScroll(MouseWheelScrollingLogic $this, NestedScrollScope $receiver, AnimationState animationState, float targetValue, int durationMillis, Function1 shouldCancelAnimation, Continuation $completion) {
        return $this.animateMouseWheelScroll($receiver, animationState, targetValue, durationMillis, shouldCancelAnimation, $completion);
    }

    public static final /* synthetic */ Object access$busyReceive(MouseWheelScrollingLogic $this, Channel $receiver, Continuation $completion) {
        return $this.busyReceive($receiver, $completion);
    }

    public static final /* synthetic */ float access$dispatchMouseWheelScroll(MouseWheelScrollingLogic $this, NestedScrollScope $receiver, float delta) {
        return $this.dispatchMouseWheelScroll($receiver, delta);
    }

    public static final /* synthetic */ Object access$dispatchMouseWheelScroll(MouseWheelScrollingLogic $this, ScrollingLogic $receiver, MouseWheelScrollDelta scrollDelta, float threshold, float speed, Continuation $completion) {
        return $this.dispatchMouseWheelScroll($receiver, scrollDelta, threshold, speed, $completion);
    }

    public static final /* synthetic */ Object access$dispatchMouseWheelScroll$waitNextScrollDelta(MouseWheelScrollingLogic this$0, Ref.ObjectRef targetScrollDelta, Ref.FloatRef targetValue, ScrollingLogic $this_dispatchMouseWheelScroll, Ref.ObjectRef animationState, long timeoutMillis, Continuation $completion) {
        return dispatchMouseWheelScroll$waitNextScrollDelta(this$0, targetScrollDelta, targetValue, $this_dispatchMouseWheelScroll, animationState, timeoutMillis, $completion);
    }

    public static final /* synthetic */ Channel access$getChannel$p(MouseWheelScrollingLogic $this) {
        return $this.channel;
    }

    public static final /* synthetic */ Density access$getDensity$p(MouseWheelScrollingLogic $this) {
        return $this.density;
    }

    public static final /* synthetic */ ScrollingLogic access$getScrollingLogic$p(MouseWheelScrollingLogic $this) {
        return $this.scrollingLogic;
    }

    public static final /* synthetic */ void access$setReceivingMouseWheelEventsJob$p(MouseWheelScrollingLogic $this, Job r1) {
        $this.receivingMouseWheelEventsJob = r1;
    }

    public static final /* synthetic */ MouseWheelScrollDelta access$sumOrNull(MouseWheelScrollingLogic $this, Channel $receiver) {
        return $this.sumOrNull($receiver);
    }

    public static final /* synthetic */ void access$trackVelocity(MouseWheelScrollingLogic $this, MouseWheelScrollDelta scrollDelta) {
        $this.trackVelocity(scrollDelta);
    }

    public static final /* synthetic */ Object access$userScroll(MouseWheelScrollingLogic $this, ScrollingLogic $receiver, Function2 block, Continuation $completion) {
        return $this.userScroll($receiver, block, $completion);
    }

    public final void updateDensity(Density density) {
        this.density = density;
    }

    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public final void m461onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        if (pass != PointerEventPass.Main) goto L20;
        if (PointerEventType.m5538equalsimpl0(pointerEvent.m5531getType7fucELk(), PointerEventType.Companion.m5547getScroll7fucELk()) == false) goto L20;
        List<PointerInputChange> r4 = pointerEvent.getChanges();
        int index$iv$iv$iv = 0;
        int r9 = r4.size();
    L7:
        if (index$iv$iv$iv >= r9) goto L12;
        Object item$iv$iv$iv = r4.get(index$iv$iv$iv);
        PointerInputChange it$iv = (PointerInputChange) item$iv$iv$iv;
        if (it$iv.isConsumed() == true) goto L10;
        index$iv$iv$iv = index$iv$iv$iv + 1;
        goto L7
    L10:
        boolean r10 = true;
    L14:
        if (r10 == true) goto L25;
        boolean consumed = m460onMouseWheelO0kMr_c(pointerEvent, bounds);
        if (consumed == false) goto L23;
        consume(pointerEvent);
        return;
    L23:
        return;
    L25:
        return;
    L12:
        r10 = false;
    }

    private final boolean isConsumed(PointerEvent $this$isConsumed) {
        List<PointerInputChange> r1 = $this$isConsumed.getChanges();
        int index$iv$iv = 0;
        int r6 = r1.size();
    L3:
        if (index$iv$iv >= r6) goto L8;
        Object item$iv$iv = r1.get(index$iv$iv);
        PointerInputChange it = (PointerInputChange) item$iv$iv;
        if (it.isConsumed() == true) goto L6;
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L6:
        return true;
    L8:
        return false;
    }

    private final void consume(PointerEvent $this$consume) {
        List<PointerInputChange> r0 = $this$consume.getChanges();
        int index$iv = 0;
        int r3 = r0.size();
    L3:
        if (index$iv >= r3) goto L6;
        Object item$iv = r0.get(index$iv);
        PointerInputChange it = (PointerInputChange) item$iv;
        it.consume();
        index$iv = index$iv + 1;
        goto L3
    }

    public final void startReceivingMouseWheelEvents(CoroutineScope coroutineScope) {
        if (this.receivingMouseWheelEventsJob != null) goto L6;
        this.receivingMouseWheelEventsJob = BuildersKt.launch$default(coroutineScope, null, null, new C02521(this, null), 3, null);
        return;
    }

    private final Object userScroll(ScrollingLogic $this$userScroll, Function2<? super NestedScrollScope, ? super Continuation<? super Unit>, ? extends Object> r9, Continuation<? super Unit> r10) {
        if ((r10 instanceof C02551) == false) goto L7;
        C02551 r0 = (C02551) r10;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        MouseWheelScrollingLogic r8 = (MouseWheelScrollingLogic) r0.L$0;
        ResultKt.throwOnFailure($result);
    L17:
        r8.isScrolling = false;
        return Unit.INSTANCE;
    L13:
        ResultKt.throwOnFailure($result);
        this.isScrolling = true;
        C02562 r5 = new C02562($this$userScroll, r9, null);
        r0.L$0 = this;
        r0.label = 1;
        if (SupervisorKt.supervisorScope(r5, r0) != r2) goto L16;
        return r2;
    L16:
        r8 = this;
        goto L17
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C02551(this, r10);
        goto L8
    }

    /* JADX INFO: renamed from: onMouseWheel-O0kMr_c, reason: not valid java name */
    private final boolean m460onMouseWheelO0kMr_c(PointerEvent pointerEvent, long bounds) {
        ScrollConfig $this$onMouseWheel_O0kMr_c_u24lambda_u243 = this.mouseWheelScrollConfig;
        Density $this$onMouseWheel_O0kMr_c_u24lambda_u243_u24lambda_u242 = this.density;
        long scrollDelta = $this$onMouseWheel_O0kMr_c_u24lambda_u243.mo398calculateMouseWheelScroll8xgXZGE($this$onMouseWheel_O0kMr_c_u24lambda_u243_u24lambda_u242, pointerEvent, bounds);
        if (m459canConsumeDeltaUv8p0NA(this.scrollingLogic, scrollDelta) == false) goto L13;
        Channel<MouseWheelScrollDelta> r0 = this.channel;
        long r7 = ((PointerInputChange) CollectionsKt.first(pointerEvent.getChanges())).getUptimeMillis();
        if (this.mouseWheelScrollConfig.isSmoothScrollingEnabled() == true) goto L7;
    L10:
        boolean r1 = true;
    L14:
        return ChannelResult.m8936isSuccessimpl(r0.mo8915trySendJP2dKIU(new MouseWheelScrollDelta(scrollDelta, r7, r1, null)));
    L7:
        if (this.mouseWheelScrollConfig.isPreciseWheelScroll(pointerEvent) == true) goto L10;
        r1 = false;
        goto L14
    L13:
        return this.isScrolling;
    }

    private final MouseWheelScrollDelta sumOrNull(final Channel<MouseWheelScrollDelta> r5) {
        MouseWheelScrollDelta sum = null;
        Iterator r1 = untilNull(new C02531(r5)).iterator();
    L4:
        if (r1.hasNext() == false) goto L10;
        MouseWheelScrollDelta i = (MouseWheelScrollDelta) r1.next();
        if (sum != null) goto L8;
        MouseWheelScrollDelta r3 = i;
    L9:
        sum = r3;
        goto L4
    L8:
        r3 = sum.plus(i);
        goto L9
    L10:
        return sum;
    }

    private final Object busyReceive(Channel<MouseWheelScrollDelta> r3, Continuation<? super MouseWheelScrollDelta> r4) {
        return CoroutineScopeKt.coroutineScope(new C02512(r3, null), r4);
    }

    private final <E> Sequence<E> untilNull(Function0<? extends E> r3) {
        return SequencesKt.sequence(new C02541(r3, null));
    }

    /* JADX INFO: renamed from: canConsumeDelta-Uv8p0NA, reason: not valid java name */
    private final boolean m459canConsumeDeltaUv8p0NA(ScrollingLogic $this$canConsumeDelta_u2dUv8p0NA, long scrollDelta) {
        float delta = $this$canConsumeDelta_u2dUv8p0NA.m514toFloatk4lQ0M($this$canConsumeDelta_u2dUv8p0NA.m512reverseIfNeededMKHz9U(scrollDelta));
        if (delta != 0.0f) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L9;
        return false;
    L9:
        if (delta <= 0.0f) goto L12;
        return $this$canConsumeDelta_u2dUv8p0NA.getScrollableState().getCanScrollForward();
    L12:
        return $this$canConsumeDelta_u2dUv8p0NA.getScrollableState().getCanScrollBackward();
    L5:
        r2 = false;
        goto L6
    }

    private final void trackVelocity(MouseWheelScrollDelta scrollDelta) {
        this.velocityTracker.m466addDeltaUv8p0NA(scrollDelta.getTimeMillis(), scrollDelta.m465getValueF1C5BW0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta] */
    private final Object dispatchMouseWheelScroll(ScrollingLogic $this$dispatchMouseWheelScroll, MouseWheelScrollDelta r27, float threshold, float speed, Continuation<? super Unit> r30) {
        if ((r30 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r1 = (AnonymousClass1) r30;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object r4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r1.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        ResultKt.throwOnFailure($result);
    L32:
        return Unit.INSTANCE;
    L13:
        float speed2 = r1.F$0;
        Ref.FloatRef targetValue = (Ref.FloatRef) r1.L$2;
        ScrollingLogic $this$dispatchMouseWheelScroll2 = (ScrollingLogic) r1.L$1;
        MouseWheelScrollingLogic r8 = (MouseWheelScrollingLogic) r1.L$0;
        ResultKt.throwOnFailure($result);
    L25:
        long velocity = r8.velocityTracker.m467calculateVelocity9UxMQ8M();
        if (Velocity.m7210equalsimpl0(velocity, Velocity.Companion.m7222getZero9UxMQ8M()) == false) goto L28;
        velocity = $this$dispatchMouseWheelScroll2.m516toVelocityadjELrA(($this$dispatchMouseWheelScroll2.reverseIfNeeded(Math.signum(targetValue.element)) * Math.min(Math.abs(targetValue.element) / 100.0f, speed2)) * 1000.0f);
    L28:
        Function2<Velocity, Continuation<? super Unit>, Object> r5 = r8.onScrollStopped;
        Velocity r6 = Velocity.m7202boximpl(velocity);
        r1.L$0 = null;
        r1.L$1 = null;
        r1.L$2 = null;
        r1.label = 2;
        if (r5.invoke(r6, r1) != r4) goto L32;
        return r4;
    L14:
        ResultKt.throwOnFailure($result);
        Ref.ObjectRef targetScrollDelta = new Ref.ObjectRef();
        targetScrollDelta.element = r27;
        trackVelocity(r27);
        MouseWheelScrollDelta it = sumOrNull(this.channel);
        if (it == null) goto L17;
        trackVelocity(it);
        targetScrollDelta.element = ((MouseWheelScrollDelta) targetScrollDelta.element).plus(it);
    L17:
        Ref.FloatRef targetValue2 = new Ref.FloatRef();
        targetValue2.element = $this$dispatchMouseWheelScroll.m514toFloatk4lQ0M($this$dispatchMouseWheelScroll.m512reverseIfNeededMKHz9U(((MouseWheelScrollDelta) targetScrollDelta.element).m465getValueF1C5BW0()));
        if (MouseWheelScrollableKt.access$isLowScrollingDelta(targetValue2.element) == true) goto L20;
        Ref.ObjectRef animationState = new Ref.ObjectRef();
        animationState.element = AnimationStateKt.AnimationState$default(0.0f, 0.0f, 0, 0, false, 30, null);
        $this$dispatchMouseWheelScroll2 = $this$dispatchMouseWheelScroll;
        AnonymousClass3 r9 = new AnonymousClass3(targetValue2, animationState, targetScrollDelta, threshold, this, speed, $this$dispatchMouseWheelScroll, null);
        r1.L$0 = this;
        r1.L$1 = $this$dispatchMouseWheelScroll2;
        r1.L$2 = targetValue2;
        r1.F$0 = speed;
        r1.label = 1;
        if (userScroll($this$dispatchMouseWheelScroll2, r9, r1) != r4) goto L24;
        return r4;
    L24:
        targetValue = targetValue2;
        r8 = this;
        speed2 = speed;
        goto L25
    L20:
        return Unit.INSTANCE;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new AnonymousClass1(this, r30);
        goto L8
    }

    /* JADX WARN: Type inference failed for: r11v7, types: [T, androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta] */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, androidx.compose.animation.core.AnimationState] */
    private static final Object dispatchMouseWheelScroll$waitNextScrollDelta(MouseWheelScrollingLogic r22, Ref.ObjectRef<MouseWheelScrollDelta> r23, Ref.FloatRef r24, ScrollingLogic $this_dispatchMouseWheelScroll, Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> r26, long timeoutMillis, Continuation<? super Boolean> r29) {
        if ((r29 instanceof MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1) == false) goto L7;
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 r1 = (MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1) r29;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object r3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean r5 = true;
        boolean r6 = false;
        switch(r1.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> r4 = (Ref.ObjectRef) r1.L$4;
        ScrollingLogic $this_dispatchMouseWheelScroll2 = (ScrollingLogic) r1.L$3;
        Ref.FloatRef targetValue = (Ref.FloatRef) r1.L$2;
        Ref.ObjectRef<MouseWheelScrollDelta> r8 = (Ref.ObjectRef) r1.L$1;
        MouseWheelScrollingLogic this$0 = (MouseWheelScrollingLogic) r1.L$0;
        ResultKt.throwOnFailure($result);
        Object r11 = $result;
    L21:
        MouseWheelScrollDelta it = (MouseWheelScrollDelta) r11;
        if (it == null) goto L34;
        boolean previousDeltaShouldApplyImmediately = r8.element.getShouldApplyImmediately();
        if (previousDeltaShouldApplyImmediately == false) goto L26;
        boolean r17 = true;
    L27:
        r8.element = MouseWheelScrollDelta.m462copy9KIMszo$default(it, 0, 0, r17, 3, null);
        targetValue.element = $this_dispatchMouseWheelScroll2.m514toFloatk4lQ0M($this_dispatchMouseWheelScroll2.m512reverseIfNeededMKHz9U(r8.element.m465getValueF1C5BW0()));
        r4.element = AnimationStateKt.AnimationState$default(0.0f, 0.0f, 0, 0, false, 30, null);
        this$0.trackVelocity(it);
        if (MouseWheelScrollableKt.access$isLowScrollingDelta(targetValue.element) == false) goto L31;
        r5 = false;
    L31:
        r6 = r5;
        goto L34
    L26:
        r17 = false;
    L34:
        return Boxing.boxBoolean(r6);
    L13:
        ResultKt.throwOnFailure($result);
        this$0 = r22;
        targetValue = r24;
        r8 = r23;
        if (timeoutMillis < 0) goto L16;
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2 r13 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2(this$0, null);
        r1.L$0 = this$0;
        r1.L$1 = r8;
        r1.L$2 = targetValue;
        r1.L$3 = $this_dispatchMouseWheelScroll;
        r1.L$4 = r26;
        r1.label = 1;
        r11 = TimeoutKt.withTimeoutOrNull(timeoutMillis, r13, r1);
        if (r11 != r3) goto L20;
        return r3;
    L20:
        r4 = r26;
        $this_dispatchMouseWheelScroll2 = $this_dispatchMouseWheelScroll;
        goto L21
    L16:
        return Boxing.boxBoolean(false);
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1(r29);
        goto L8
    }

    private final Object animateMouseWheelScroll(final NestedScrollScope $this$animateMouseWheelScroll, AnimationState<Float, AnimationVector1D> r10, float targetValue, int durationMillis, final Function1<? super Float, Boolean> r13, Continuation<? super Unit> r14) {
        final Ref.FloatRef lastValue = new Ref.FloatRef();
        lastValue.element = r10.getValue().floatValue();
        Object r11 = SuspendAnimationKt.animateTo(r10, Boxing.boxFloat(targetValue), AnimationSpecKt.tween$default(durationMillis, 0, EasingKt.getLinearEasing(), 2, null), true, new AnonymousClass2(lastValue, this, $this$animateMouseWheelScroll, r13), r14);
        if (r11 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r11;
    L6:
        return Unit.INSTANCE;
    }

    private final float dispatchMouseWheelScroll(NestedScrollScope $this$dispatchMouseWheelScroll, float delta) {
        ScrollingLogic $this$dispatchMouseWheelScroll_u24lambda_u246 = this.scrollingLogic;
        long offset = $this$dispatchMouseWheelScroll_u24lambda_u246.m515toOffsettuRUvjQ($this$dispatchMouseWheelScroll_u24lambda_u246.reverseIfNeeded(delta));
        long consumed = $this$dispatchMouseWheelScroll.mo468scrollByOzD1aCk(offset, NestedScrollSource.Companion.m5482getUserInputWNlRxjI());
        return $this$dispatchMouseWheelScroll_u24lambda_u246.m514toFloatk4lQ0M($this$dispatchMouseWheelScroll_u24lambda_u246.m512reverseIfNeededMKHz9U(consumed));
    }
}
