package androidx.compose.material3.internal;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.FloatState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.Pair;
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
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0001\u0018\u0000 i*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001iB\u0081\u0001\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000f\u0012#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\u0010\u0013Bq\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000f\u0012#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\u0010\u0014Jy\u0010L\u001a\u00020M2\u0006\u0010G\u001a\u00028\u00002\b\b\u0002\u0010N\u001a\u00020O2W\u0010P\u001aS\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(G\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0R\u0012\u0006\u0012\u0004\u0018\u00010\u00020Q¢\u0006\u0002\bSH\u0086@¢\u0006\u0002\u0010TJ\\\u0010L\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020O2B\u0010P\u001a>\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0R\u0012\u0006\u0012\u0004\u0018\u00010\u00020U¢\u0006\u0002\bSH\u0086@¢\u0006\u0002\u0010VJ%\u0010W\u001a\u00028\u00002\u0006\u0010?\u001a\u00020\b2\u0006\u0010'\u001a\u00028\u00002\u0006\u0010X\u001a\u00020\bH\u0002¢\u0006\u0002\u0010YJ\u001d\u0010Z\u001a\u00028\u00002\u0006\u0010?\u001a\u00020\b2\u0006\u0010'\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010[J\u000e\u0010\\\u001a\u00020\b2\u0006\u0010]\u001a\u00020\bJ\u0015\u0010^\u001a\u00020\b2\u0006\u0010]\u001a\u00020\bH\u0000¢\u0006\u0002\b_J\u0006\u0010`\u001a\u00020\bJ\u0016\u0010a\u001a\u00020M2\u0006\u0010X\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010bJ\u0015\u0010c\u001a\u00020\u00122\u0006\u0010G\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010dJ#\u0010e\u001a\u00020M2\f\u0010f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\b\b\u0002\u0010g\u001a\u00028\u0000¢\u0006\u0002\u0010hR\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R7\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010 \u001a\u00028\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R/\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R+\u0010'\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u001d\u001a\u0004\b(\u0010\"\"\u0004\b)\u0010*R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010.\u001a\u0004\u0018\u00018\u00002\b\u0010\u0017\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010\u001d\u001a\u0004\b/\u0010\"\"\u0004\b0\u0010*R\u0014\u00102\u001a\u000203X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u00106\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b6\u00107R+\u00108\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R+\u0010?\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bB\u0010>\u001a\u0004\b@\u0010:\"\u0004\bA\u0010<R/\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\b0\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010&R\u001b\u0010D\u001a\u00020\b8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bF\u0010$\u001a\u0004\bE\u0010:R\u001b\u0010G\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bI\u0010$\u001a\u0004\bH\u0010\"R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010K¨\u0006j"}, d2 = {"Landroidx/compose/material3/internal/AnchoredDraggableState;", "T", "", "initialValue", "anchors", "Landroidx/compose/material3/internal/DraggableAnchors;", "positionalThreshold", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "totalDistance", "velocityThreshold", "Lkotlin/Function0;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmValueChange", "newValue", "", "(Ljava/lang/Object;Landroidx/compose/material3/internal/DraggableAnchors;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "anchoredDragScope", "Landroidx/compose/material3/internal/AnchoredDragScope;", "<set-?>", "getAnchors", "()Landroidx/compose/material3/internal/DraggableAnchors;", "setAnchors", "(Landroidx/compose/material3/internal/DraggableAnchors;)V", "anchors$delegate", "Landroidx/compose/runtime/MutableState;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "closestValue", "getClosestValue$material3_release", "()Ljava/lang/Object;", "closestValue$delegate", "Landroidx/compose/runtime/State;", "getConfirmValueChange$material3_release", "()Lkotlin/jvm/functions/Function1;", "currentValue", "getCurrentValue", "setCurrentValue", "(Ljava/lang/Object;)V", "currentValue$delegate", "dragMutex", "Landroidx/compose/material3/internal/InternalMutatorMutex;", "dragTarget", "getDragTarget", "setDragTarget", "dragTarget$delegate", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material3_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "isAnimationRunning", "()Z", "lastVelocity", "getLastVelocity", "()F", "setLastVelocity", "(F)V", "lastVelocity$delegate", "Landroidx/compose/runtime/MutableFloatState;", "offset", "getOffset", "setOffset", "offset$delegate", "getPositionalThreshold$material3_release", NotificationCompat.CATEGORY_PROGRESS, "getProgress", "progress$delegate", "targetValue", "getTargetValue", "targetValue$delegate", "getVelocityThreshold$material3_release", "()Lkotlin/jvm/functions/Function0;", "anchoredDrag", "", "dragPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function4;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "computeTarget", "velocity", "(FLjava/lang/Object;F)Ljava/lang/Object;", "computeTargetWithoutThresholds", "(FLjava/lang/Object;)Ljava/lang/Object;", "dispatchRawDelta", "delta", "newOffsetForDelta", "newOffsetForDelta$material3_release", "requireOffset", "settle", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trySnapTo", "(Ljava/lang/Object;)Z", "updateAnchors", "newAnchors", "newTarget", "(Landroidx/compose/material3/internal/DraggableAnchors;Ljava/lang/Object;)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AnchoredDraggableState<T> {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private final AnchoredDragScope anchoredDragScope;
    private final MutableState anchors$delegate;
    private final AnimationSpec<Float> animationSpec;
    private final State closestValue$delegate;
    private final Function1<T, Boolean> confirmValueChange;
    private final MutableState currentValue$delegate;
    private final InternalMutatorMutex dragMutex;
    private final MutableState dragTarget$delegate;
    private final DraggableState draggableState;
    private final MutableFloatState lastVelocity$delegate;
    private final MutableFloatState offset$delegate;
    private final Function1<Float, Float> positionalThreshold;
    private final State progress$delegate;
    private final State targetValue$delegate;
    private final Function0<Float> velocityThreshold;

    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Ju\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\f0\u000b2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/internal/AnchoredDraggableState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "T", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "Lkotlin/Function1;", "", "positionalThreshold", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "distance", "velocityThreshold", "Lkotlin/Function0;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(final AnimationSpec<Float> r3, final Function1<? super T, Boolean> r4, final Function1<? super Float, Float> r5, final Function0<Float> r6) {
            return SaverKt.Saver(AnchoredDraggableState$Companion$Saver$1.INSTANCE, new AnchoredDraggableState$Companion$Saver$2(r5, r6, r3, r4));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableState", f = "AnchoredDraggable.kt", i = {0}, l = {520}, m = "anchoredDrag", n = {"this"}, s = {"L$0"})
    static final class C05951 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        C05951(AnchoredDraggableState<T> r1, Continuation<? super C05951> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.anchoredDrag(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", i = {}, l = {521}, m = "invokeSuspend", n = {}, s = {})
    static final class C05962 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> $block;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "latestAnchors", "Landroidx/compose/material3/internal/DraggableAnchors;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", i = {}, l = {522}, m = "invokeSuspend", n = {}, s = {})
        static final class C01292 extends SuspendLambda implements Function2<DraggableAnchors<T>, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> $block;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: Multi-variable type inference failed */
            C01292(Function3<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super Continuation<? super Unit>, ? extends Object> r2, AnchoredDraggableState<T> r3, Continuation<? super C01292> r4) {
                this.$block = r2;
                this.this$0 = r3;
                super(2, r4);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
                C01292 r0 = new C01292(this.$block, this.this$0, r5);
                r0.L$0 = r4;
                return r0;
            }

            public final Object invoke(DraggableAnchors<T> r3, Continuation<? super Unit> r4) {
                return ((C01292) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
            L12:
                return Unit.INSTANCE;
            L7:
                ResultKt.throwOnFailure($result);
                DraggableAnchors<T> r2 = (DraggableAnchors) this.L$0;
                Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> r3 = this.$block;
                AnchoredDragScope r4 = AnchoredDraggableState.access$getAnchoredDragScope$p(this.this$0);
                this.label = 1;
                if (r3.invoke(r4, r2, this) != r0) goto L12;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C05962(AnchoredDraggableState<T> r2, Function3<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super Continuation<? super Unit>, ? extends Object> r3, Continuation<? super C05962> r4) {
            this.this$0 = r2;
            this.$block = r3;
            super(1, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> r4) {
            return new C05962(this.this$0, this.$block, r4);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Unit> r2) {
            return invoke2(r2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Unit> r3) {
            return ((C05962) create(r3)).invokeSuspend(Unit.INSTANCE);
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
        L12:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            final AnchoredDraggableState<T> r3 = this.this$0;
            this.label = 1;
            if (AnchoredDraggableKt.access$restartable(new AnonymousClass1(r3), new C01292(this.$block, this.this$0, null), this) != r0) goto L12;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3, reason: invalid class name */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableState", f = "AnchoredDraggable.kt", i = {0}, l = {567}, m = "anchoredDrag", n = {"this"}, s = {"L$0"})
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

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4, reason: invalid class name */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", i = {}, l = {569}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass4 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2, reason: invalid class name */
        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Landroidx/compose/material3/internal/DraggableAnchors;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", i = {}, l = {571}, m = "invokeSuspend", n = {}, s = {})
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
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2 for r7v1 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int r1 = r7.label;
                switch(r1) {
                    case 0: goto L7;
                    case 1: goto L6;
                    default: goto L4;
                };
            L4:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw r8;
            L6:
                kotlin.ResultKt.throwOnFailure(r8);
            L11:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE;
                return r1;
            L7:
                kotlin.ResultKt.throwOnFailure(r8);
                java.lang.Object r2 = r7.L$0;
                kotlin.Pair r2 = (kotlin.Pair) r2;
                java.lang.Object r3 = r2.component1();
                androidx.compose.material3.internal.DraggableAnchors<T> r3 = (androidx.compose.material3.internal.DraggableAnchors) r3;
                java.lang.Object r2 = r2.component2();
                kotlin.jvm.functions.Function4<androidx.compose.material3.internal.AnchoredDragScope, androidx.compose.material3.internal.DraggableAnchors<T>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r4 = r7.$block;
                androidx.compose.material3.internal.AnchoredDraggableState<T> r5 = r7.this$0;
                androidx.compose.material3.internal.AnchoredDragScope r5 = androidx.compose.material3.internal.AnchoredDraggableState.access$getAnchoredDragScope$p(r5);
                r7.label = 1;
                androidx.compose.material3.internal.DraggableAnchors<T> r3 = r3;
                T r2 = (T) r2;
                java.lang.Object r7 = (kotlin.coroutines.Continuation<? super kotlin.Unit>) r7;
                java.lang.Object r2 = r4.invoke(r5, r3, r2, r7);
                if (r2 != r0) goto L11;
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
        L12:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            AnchoredDraggableState.access$setDragTarget(this.this$0, this.$targetValue);
            final AnchoredDraggableState<T> r3 = this.this$0;
            this.label = 1;
            if (AnchoredDraggableKt.access$restartable(new AnonymousClass1(r3), new AnonymousClass2(this.$block, this.this$0, null), this) != r0) goto L12;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        Companion = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState(T r5, Function1<? super Float, Float> r6, Function0<Float> r7, AnimationSpec<Float> r8, Function1<? super T, Boolean> r9) {
        this.positionalThreshold = r6;
        this.velocityThreshold = r7;
        this.animationSpec = r8;
        this.confirmValueChange = r9;
        this.dragMutex = new InternalMutatorMutex();
        this.draggableState = new AnchoredDraggableState$draggableState$1(this);
        this.currentValue$delegate = SnapshotStateKt.mutableStateOf$default(r5, null, 2, null);
        this.targetValue$delegate = SnapshotStateKt.derivedStateOf(new AnchoredDraggableState$targetValue$2(this));
        this.closestValue$delegate = SnapshotStateKt.derivedStateOf(new AnchoredDraggableState$closestValue$2(this));
        this.offset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
        this.progress$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new AnchoredDraggableState$progress$2(this));
        this.lastVelocity$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.dragTarget$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors$delegate = SnapshotStateKt.mutableStateOf$default(AnchoredDraggableKt.access$emptyDraggableAnchors(), null, 2, null);
        this.anchoredDragScope = new AnchoredDraggableState$anchoredDragScope$1(this);
    }

    public static final /* synthetic */ Object access$computeTarget(AnchoredDraggableState $this, float offset, Object currentValue, float velocity) {
        return $this.computeTarget(offset, currentValue, velocity);
    }

    public static final /* synthetic */ Object access$computeTargetWithoutThresholds(AnchoredDraggableState $this, float offset, Object currentValue) {
        return $this.computeTargetWithoutThresholds(offset, currentValue);
    }

    public static final /* synthetic */ AnchoredDragScope access$getAnchoredDragScope$p(AnchoredDraggableState $this) {
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

    public /* synthetic */ AnchoredDraggableState(Object r7, Function1 r8, Function0 r9, AnimationSpec r10, Function1 r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 16) == 0) goto L5;
        Function1 r5 = AnonymousClass1.INSTANCE;
    L6:
        this(r7, r8, r9, r10, r5);
        return;
    L5:
        r5 = r11;
        goto L6
    }

    public final Function1<Float, Float> getPositionalThreshold$material3_release() {
        return this.positionalThreshold;
    }

    public final Function0<Float> getVelocityThreshold$material3_release() {
        return this.velocityThreshold;
    }

    public final AnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final Function1<T, Boolean> getConfirmValueChange$material3_release() {
        return this.confirmValueChange;
    }

    public /* synthetic */ AnchoredDraggableState(Object r8, DraggableAnchors r9, Function1 r10, Function0 r11, AnimationSpec r12, Function1 r13, int r14, DefaultConstructorMarker r15) {
        if ((r14 & 32) == 0) goto L5;
        Function1 r6 = AnonymousClass2.INSTANCE;
    L6:
        this(r8, r9, r10, r11, r12, r6);
        return;
    L5:
        r6 = r13;
        goto L6
    }

    public AnchoredDraggableState(T r7, DraggableAnchors<T> r8, Function1<? super Float, Float> r9, Function0<Float> r10, AnimationSpec<Float> r11, Function1<? super T, Boolean> r12) {
        this(r7, r9, r10, r11, r12);
        setAnchors(r8);
        trySnapTo(r7);
    }

    public final DraggableState getDraggableState$material3_release() {
        return this.draggableState;
    }

    private final void setCurrentValue(T r4) {
        MutableState $this$setValue$iv = this.currentValue$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final T getCurrentValue() {
        State $this$getValue$iv = this.currentValue$delegate;
        return $this$getValue$iv.getValue();
    }

    public final T getTargetValue() {
        return (T) this.targetValue$delegate.getValue();
    }

    public final T getClosestValue$material3_release() {
        return (T) this.closestValue$delegate.getValue();
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
        if (Float.isNaN(getOffset()) == true) goto L7;
        return getOffset();
    L7:
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
    }

    public final boolean isAnimationRunning() {
        if (getDragTarget() == null) goto L5;
        return true;
    L5:
        return false;
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

    public final Object settle(float velocity, Continuation<? super Unit> r6) {
        T r0 = getCurrentValue();
        T r1 = computeTarget(requireOffset(), r0, velocity);
        if (this.confirmValueChange.invoke(r1).booleanValue() == false) goto L9;
        Object r2 = AnchoredDraggableKt.animateTo(this, r1, velocity, r6);
        if (r2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L8;
        return r2;
    L8:
        return Unit.INSTANCE;
    L9:
        Object r3 = AnchoredDraggableKt.animateTo(this, r0, velocity, r6);
        if (r3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L13;
        return r3;
    L13:
        return Unit.INSTANCE;
    }

    private final T computeTarget(float offset, T r10, float velocity) {
        DraggableAnchors<T> r0 = getAnchors();
        float currentAnchorPosition = r0.positionOf(r10);
        float velocityThresholdPx = this.velocityThreshold.invoke().floatValue();
        if (currentAnchorPosition != offset) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == true) goto L32;
        if (Float.isNaN(currentAnchorPosition) == true) goto L32;
        if (currentAnchorPosition >= offset) goto L20;
        if (velocity < velocityThresholdPx) goto L15;
        T r4 = r0.closestAnchor(offset, true);
        Intrinsics.checkNotNull(r4);
        return r4;
    L15:
        T r5 = r0.closestAnchor(offset, true);
        Intrinsics.checkNotNull(r5);
        float distance = Math.abs(r0.positionOf(r5) - currentAnchorPosition);
        float relativeThreshold = Math.abs(this.positionalThreshold.invoke(Float.valueOf(distance)).floatValue());
        if (offset < Math.abs(currentAnchorPosition + relativeThreshold)) goto L32;
        return r5;
    L20:
        if (velocity > (-velocityThresholdPx)) goto L22;
        T r6 = r0.closestAnchor(offset, false);
        Intrinsics.checkNotNull(r6);
        return r6;
    L22:
        T r7 = r0.closestAnchor(offset, false);
        Intrinsics.checkNotNull(r7);
        float distance2 = Math.abs(currentAnchorPosition - r0.positionOf(r7));
        float relativeThreshold2 = Math.abs(this.positionalThreshold.invoke(Float.valueOf(distance2)).floatValue());
        float absoluteThreshold = Math.abs(currentAnchorPosition - relativeThreshold2);
        if (offset >= 0.0f) goto L28;
        if (Math.abs(offset) < absoluteThreshold) goto L32;
        return r7;
    L28:
        if (offset > absoluteThreshold) goto L32;
        return r7;
    L32:
        return r10;
    L5:
        r3 = false;
        goto L6
    }

    private final T computeTargetWithoutThresholds(float offset, T r7) {
        DraggableAnchors<T> r0 = getAnchors();
        float currentAnchorPosition = r0.positionOf(r7);
        if (currentAnchorPosition != offset) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == true) goto L20;
        if (Float.isNaN(currentAnchorPosition) == true) goto L20;
        if (currentAnchorPosition >= offset) goto L15;
        T r3 = r0.closestAnchor(offset, true);
        if (r3 == null) goto L20;
        return r3;
    L15:
        T r4 = r0.closestAnchor(offset, false);
        if (r4 == null) goto L20;
        return r4;
    L20:
        return r7;
    L5:
        r2 = false;
        goto L6
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState r0, MutatePriority r1, Function3 r2, Continuation r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = MutatePriority.Default;
    L6:
        return r0.anchoredDrag(r1, r2, r3);
    }

    public final Object anchoredDrag(MutatePriority dragPriority, Function3<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super Continuation<? super Unit>, ? extends Object> r9, Continuation<? super Unit> r10) {
        if ((r10 instanceof C05951) == false) goto L7;
        C05951 r0 = (C05951) r10;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        AnchoredDraggableState<T> r8 = (AnchoredDraggableState) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
    L22:
        T r11 = r8.getAnchors().closestAnchor(r8.getOffset());
        if (r11 == null) goto L30;
        if (Math.abs(r8.getOffset() - r8.getAnchors().positionOf(r11)) > 0.5f) goto L30;
        if (r8.confirmValueChange.invoke(r11).booleanValue() == false) goto L30;
        r8.setCurrentValue(r11);
    L30:
        return Unit.INSTANCE;
    L15:
        th = th;
    L33:
        T r2 = r8.getAnchors().closestAnchor(r8.getOffset());
        if (r2 != null) goto L36;
    L40:
        throw th;
    L36:
        if (Math.abs(r8.getOffset() - r8.getAnchors().positionOf(r2)) > 0.5f) goto L40;
        if (r8.confirmValueChange.invoke(r2).booleanValue() == false) goto L40;
        r8.setCurrentValue(r2);
        goto L40
    L17:
        ResultKt.throwOnFailure($result);
        InternalMutatorMutex r4 = this.dragMutex;     // Catch: Throwable -> L31
        C05962 r5 = new C05962(this, r9, null);     // Catch: Throwable -> L31
        r0.L$0 = this;     // Catch: Throwable -> L31
        r0.label = 1;     // Catch: Throwable -> L31
        if (r4.mutate(dragPriority, r5, r0) != r1) goto L21;
        return r1;
    L21:
        r8 = this;
    L31:
        th = th;
        r8 = this;
        goto L33
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C05951(this, r10);
        goto L8
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
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
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
        T r13 = r10.getAnchors().closestAnchor(r10.getOffset());
        if (r13 != null) goto L26;
    L42:
        Object targetValue = Unit.INSTANCE;
        return targetValue;
    L26:
        if (Math.abs(r10.getOffset() - r10.getAnchors().positionOf(r13)) > 0.5f) goto L42;
        if (r10.confirmValueChange.invoke(r13).booleanValue() == false) goto L42;
        r10.setCurrentValue(r13);
    L15:
        th = th;
    L33:
        r10.setDragTarget(null);
        T r14 = r10.getAnchors().closestAnchor(r10.getOffset());
        if (r14 != null) goto L36;
    L40:
        throw th;
    L36:
        if (Math.abs(r10.getOffset() - r10.getAnchors().positionOf(r14)) > 0.5f) goto L40;
        if (r10.confirmValueChange.invoke(r14).booleanValue() == false) goto L40;
        r10.setCurrentValue(r14);
        goto L40
    L17:
        ResultKt.throwOnFailure($result);
        if (getAnchors().hasAnchorFor(r9) == true) goto L44;
        setCurrentValue(r9);
        goto L42
    L44:
        InternalMutatorMutex r5 = this.dragMutex;     // Catch: Throwable -> L31
        AnonymousClass4 r6 = new AnonymousClass4(this, r9, r11, null);     // Catch: Throwable -> L31
        r0.L$0 = this;     // Catch: Throwable -> L31
        r0.label = 1;     // Catch: Throwable -> L31
        if (r5.mutate(dragPriority, r6, r0) != r1) goto L22;
        return r1;
    L22:
        r10 = this;
    L31:
        th = th;
        r10 = this;
        goto L33
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass3(this, r12);
        goto L8
    }

    public final float newOffsetForDelta$material3_release(float delta) {
        if (Float.isNaN(getOffset()) == false) goto L5;
        float r0 = 0.0f;
    L7:
        return RangesKt.coerceIn(r0 + delta, getAnchors().minAnchor(), getAnchors().maxAnchor());
    L5:
        r0 = getOffset();
        goto L7
    }

    public final float dispatchRawDelta(float delta) {
        float newOffset = newOffsetForDelta$material3_release(delta);
        if (Float.isNaN(getOffset()) == false) goto L5;
        float oldOffset = 0.0f;
    L6:
        setOffset(newOffset);
        return newOffset - oldOffset;
    L5:
        oldOffset = getOffset();
        goto L6
    }

    private final boolean trySnapTo(final T r3) {
        return this.dragMutex.tryMutate(new C05971(this, r3));
    }
}
