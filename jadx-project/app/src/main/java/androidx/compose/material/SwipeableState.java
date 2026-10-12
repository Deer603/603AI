package androidx.compose.material;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableKt;
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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0017\u0018\u0000 v*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001vBB\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012#\b\u0002\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0002\u0010\rJ$\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020\u00062\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082@¢\u0006\u0002\u0010cJ&\u0010d\u001a\u00020`2\u0006\u0010P\u001a\u00028\u00002\u000e\b\u0002\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0087@¢\u0006\u0002\u0010fJ!\u0010g\u001a\u00020`2\u0012\u0010h\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0011H\u0000¢\u0006\u0002\biJ\u000e\u0010j\u001a\u00020\u00062\u0006\u0010k\u001a\u00020\u0006J\u0016\u0010l\u001a\u00020`2\u0006\u0010m\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010nJ8\u0010o\u001a\u00020`2\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010h\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0011H\u0080@¢\u0006\u0004\bq\u0010rJ\u0016\u0010s\u001a\u00020`2\u0006\u0010a\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010nJ\u0016\u0010t\u001a\u00020`2\u0006\u0010P\u001a\u00028\u0000H\u0087@¢\u0006\u0002\u0010uR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000RC\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u00118@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR+\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0018\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020+X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R+\u0010.\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\u0018\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R \u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u001104X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00105\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010)\"\u0004\b7\u00108R\u001a\u00109\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010)\"\u0004\b;\u00108R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00060=8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u000e\u0010@\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00060=8F¢\u0006\u0006\u001a\u0004\bB\u0010?R\u000e\u0010C\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000E8FX\u0087\u0004¢\u0006\f\u0012\u0004\bF\u0010'\u001a\u0004\bG\u0010HR/\u0010J\u001a\u0004\u0018\u00010I2\b\u0010\u0010\u001a\u0004\u0018\u00010I8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010\u0018\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001a\u0010P\u001a\u00028\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bQ\u0010'\u001a\u0004\bR\u0010!RO\u0010T\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060S2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060S8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010\u0018\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR+\u0010Z\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b[\u0010)\"\u0004\b\\\u00108¨\u0006w"}, d2 = {"Landroidx/compose/material/SwipeableState;", "T", "", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "newValue", "", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "absoluteOffset", "Landroidx/compose/runtime/MutableFloatState;", "<set-?>", "", "anchors", "getAnchors$material_release", "()Ljava/util/Map;", "setAnchors$material_release", "(Ljava/util/Map;)V", "anchors$delegate", "Landroidx/compose/runtime/MutableState;", "getAnimationSpec$material_release", "()Landroidx/compose/animation/core/AnimationSpec;", "animationTarget", "Landroidx/compose/runtime/MutableState;", "getConfirmStateChange$material_release", "()Lkotlin/jvm/functions/Function1;", "currentValue", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "(Ljava/lang/Object;)V", "currentValue$delegate", "direction", "getDirection$annotations", "()V", "getDirection", "()F", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "isAnimationRunning", "()Z", "setAnimationRunning", "(Z)V", "isAnimationRunning$delegate", "latestNonEmptyAnchorsFlow", "Lkotlinx/coroutines/flow/Flow;", "maxBound", "getMaxBound$material_release", "setMaxBound$material_release", "(F)V", "minBound", "getMinBound$material_release", "setMinBound$material_release", "offset", "Landroidx/compose/runtime/State;", "getOffset", "()Landroidx/compose/runtime/State;", "offsetState", "overflow", "getOverflow", "overflowState", NotificationCompat.CATEGORY_PROGRESS, "Landroidx/compose/material/SwipeProgress;", "getProgress$annotations", "getProgress", "()Landroidx/compose/material/SwipeProgress;", "Landroidx/compose/material/ResistanceConfig;", "resistance", "getResistance$material_release", "()Landroidx/compose/material/ResistanceConfig;", "setResistance$material_release", "(Landroidx/compose/material/ResistanceConfig;)V", "resistance$delegate", "targetValue", "getTargetValue$annotations", "getTargetValue", "Lkotlin/Function2;", "thresholds", "getThresholds$material_release", "()Lkotlin/jvm/functions/Function2;", "setThresholds$material_release", "(Lkotlin/jvm/functions/Function2;)V", "thresholds$delegate", "velocityThreshold", "getVelocityThreshold$material_release", "setVelocityThreshold$material_release", "velocityThreshold$delegate", "Landroidx/compose/runtime/MutableFloatState;", "animateInternalToOffset", "", "target", "spec", "(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "anim", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ensureInit", "newAnchors", "ensureInit$material_release", "performDrag", "delta", "performFling", "velocity", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processNewAnchors", "oldAnchors", "processNewAnchors$material_release", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapInternalToOffset", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(message = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
public class SwipeableState<T> {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private final MutableFloatState absoluteOffset;
    private final MutableState anchors$delegate;
    private final AnimationSpec<Float> animationSpec;
    private final MutableState<Float> animationTarget;
    private final Function1<T, Boolean> confirmStateChange;
    private final MutableState currentValue$delegate;
    private final DraggableState draggableState;
    private final MutableState isAnimationRunning$delegate;
    private final Flow<Map<Float, T>> latestNonEmptyAnchorsFlow;
    private float maxBound;
    private float minBound;
    private final MutableFloatState offsetState;
    private final MutableFloatState overflowState;
    private final MutableState resistance$delegate;
    private final MutableState thresholds$delegate;
    private final MutableFloatState velocityThreshold$delegate;

    /* JADX INFO: compiled from: Swipeable.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JD\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/material/SwipeableState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/SwipeableState;", "T", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final <T> Saver<SwipeableState<T>, T> Saver(final AnimationSpec<Float> r3, final Function1<? super T, Boolean> r4) {
            return SaverKt.Saver(SwipeableState$Companion$Saver$1.INSTANCE, new SwipeableState$Companion$Saver$2(r3, r4));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SwipeableState$animateInternalToOffset$2, reason: invalid class name */
    /* JADX INFO: compiled from: Swipeable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/gestures/DragScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SwipeableState$animateInternalToOffset$2", f = "Swipeable.kt", i = {}, l = {217}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnimationSpec<Float> $spec;
        final /* synthetic */ float $target;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SwipeableState<T> this$0;

        AnonymousClass2(SwipeableState<T> r2, float r3, AnimationSpec<Float> r4, Continuation<? super AnonymousClass2> r5) {
            this.this$0 = r2;
            this.$target = r3;
            this.$spec = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            AnonymousClass2 r0 = new AnonymousClass2(this.this$0, this.$target, this.$spec, r6);
            r0.L$0 = r5;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(DragScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(DragScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L11;
                case 1: goto L7;
                default: goto L5;
            };
        L11:
            ResultKt.throwOnFailure($result);
            final DragScope $this$drag = (DragScope) this.L$0;
            final Ref.FloatRef prevValue = new Ref.FloatRef();
            prevValue.element = SwipeableState.access$getAbsoluteOffset$p(this.this$0).getFloatValue();
            SwipeableState.access$getAnimationTarget$p(this.this$0).setValue(Boxing.boxFloat(this.$target));
            SwipeableState.access$setAnimationRunning(this.this$0, true);
            this.label = 1;     // Catch: Throwable -> L9
            if (Animatable.animateTo$default(AnimatableKt.Animatable$default(prevValue.element, 0.0f, 2, null), Boxing.boxFloat(this.$target), this.$spec, null, new AnonymousClass1($this$drag, prevValue), this, 4, null) != r0) goto L15;
            return r0;
        L15:
            SwipeableState.access$getAnimationTarget$p(this.this$0).setValue(null);
            SwipeableState.access$setAnimationRunning(this.this$0, false);
            return Unit.INSTANCE;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L7:
            ResultKt.throwOnFailure($result);     // Catch: Throwable -> L9
        L9:
            th = move-exception;
            SwipeableState.access$getAnimationTarget$p(this.this$0).setValue(null);
            SwipeableState.access$setAnimationRunning(this.this$0, false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SwipeableState$animateTo$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Swipeable.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "anchors", "", "", "emit", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C04522<T> implements FlowCollector {
        final /* synthetic */ AnimationSpec<Float> $anim;
        final /* synthetic */ T $targetValue;
        final /* synthetic */ SwipeableState<T> this$0;

        C04522(T r1, SwipeableState<T> r2, AnimationSpec<Float> r3) {
            this.$targetValue = r1;
            this.this$0 = r2;
            this.$anim = r3;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
            return emit((Map) value, $completion);
        }

        /* JADX WARN: Failed to calculate best type for var: r9v0 androidx.compose.material.SwipeableState$animateTo$2
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v0 androidx.compose.material.SwipeableState$animateTo$2, new type: androidx.compose.material.SwipeableState$animateTo$2
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertCasts(FixTypesVisitor.java:477)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Can't change type for register without SSA variable: (r9 I:androidx.compose.material.SwipeableState$animateTo$2 A[D('this' androidx.compose.material.SwipeableState$animateTo$2)])
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:50)
        	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.lambda$applyUpdates$1(TypeUpdateInfo.java:80)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.stream.SortedOps$SizedRefSortingSink.end(SortedOps.java:357)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:510)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:596)
        	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.applyUpdates(TypeUpdateInfo.java:80)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:104)
        	... 8 more
         */
        /* JADX WARN: Not initialized variable reg: 9, insn: 0x00e5: IGET (r10 I:androidx.compose.material.SwipeableState<T>) = 
  (r9 I:androidx.compose.material.SwipeableState$animateTo$2 A[D('this' androidx.compose.material.SwipeableState$animateTo$2)])
 androidx.compose.material.SwipeableState.animateTo.2.this$0 androidx.compose.material.SwipeableState, block:B:39:0x00e5 */
        /* JADX WARN: Type inference failed for: r10v0, types: [androidx.compose.material.SwipeableState, androidx.compose.material.SwipeableState<T>] */
        /* JADX WARN: Type inference failed for: r5v0, types: [int, java.util.Map] */
        public final Object emit(Map<Float, ? extends T> r18, Continuation<? super Unit> r19) {
            if ((r19 instanceof SwipeableState$animateTo$2$emit$1) == false) goto L7;
            SwipeableState$animateTo$2$emit$1 r0 = (SwipeableState$animateTo$2$emit$1) r19;
            if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
            r0.label -= Integer.MIN_VALUE;
        L8:
            SwipeableState$animateTo$2$emit$1 r3 = r0;
            Object r4 = r3.result;
            Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r5 = r3.label;
            switch(r5) {
                case 0: goto L15;
                case 1: goto L12;
                default: goto L11;
            };
        L12:
            Map<Float, ? extends T> r6 = (Map) r3.L$1;
            C04522<T> r9 = (C04522) r3.L$0;
            ResultKt.throwOnFailure(r4);     // Catch: Throwable -> L38
        L21:
            float r2 = SwipeableState.access$getAbsoluteOffset$p(r9.this$0).getFloatValue();
            LinkedHashMap r11 = new LinkedHashMap();
            Iterator<Map.Entry<Float, ? extends T>> r7 = r6.entrySet().iterator();
        L23:
            if (r7.hasNext() == false) goto L30;
            Map.Entry<Float, ? extends T> r12 = r7.next();
            if (Math.abs(r12.getKey().floatValue() - r2) >= 0.5f) goto L27;
            boolean r13 = true;
        L28:
            if (r13 == false) goto L23;
            r11.put(r12.getKey(), r12.getValue());
            goto L23
        L27:
            r13 = false;
            goto L28
        L30:
            Object r8 = CollectionsKt.firstOrNull(r11.values());
            if (r8 != null) goto L33;
            r8 = r9.this$0.getCurrentValue();
        L33:
            SwipeableState.access$setCurrentValue(r9.this$0, r8);
            return Unit.INSTANCE;
        L15:
            ResultKt.throwOnFailure(r4);
            r9 = this;
            r6 = r18;
            Float r10 = SwipeableKt.access$getOffset(r6, r9.$targetValue);     // Catch: Throwable -> L38
            if (r10 == null) goto L37;
            SwipeableState<T> r14 = r9.this$0;     // Catch: Throwable -> L38
            float r15 = r10.floatValue();     // Catch: Throwable -> L38
            AnimationSpec<Float> r16 = r9.$anim;     // Catch: Throwable -> L38
            r3.L$0 = r9;     // Catch: Throwable -> L38
            r3.L$1 = r6;     // Catch: Throwable -> L38
            r3.label = 1;     // Catch: Throwable -> L38
            if (SwipeableState.access$animateInternalToOffset(r14, r15, r16, r3) != r1) goto L21;
            return r1;
        L37:
            throw new IllegalArgumentException("The target value must have an associated anchor.".toString());     // Catch: Throwable -> L38
        L11:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L38:
            th = move-exception;
            C04522 r17 = (SwipeableState<T>) r9.this$0;
            float r110 = SwipeableState.access$getAbsoluteOffset$p(r10).getFloatValue();
            LinkedHashMap r111 = new LinkedHashMap();
            Iterator r20 = r5.entrySet().iterator();
        L41:
            if (r20.hasNext() == false) goto L48;
            Map.Entry r112 = (Map.Entry) r20.next();
            if (Math.abs(((Number) r112.getKey()).floatValue() - r110) >= 0.5f) goto L45;
            boolean r113 = true;
        L46:
            if (r113 == false) goto L41;
            r111.put(r112.getKey(), r112.getValue());
            goto L41
        L45:
            r113 = false;
            goto L46
        L48:
            Object r21 = CollectionsKt.firstOrNull(r111.values());
            if (r21 != null) goto L51;
            r21 = r17.this$0.getCurrentValue();
        L51:
            SwipeableState.access$setCurrentValue(r17.this$0, r21);
            throw th;
        L7:
            r0 = new SwipeableState$animateTo$2$emit$1(this, r19);
            goto L8
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SwipeableState$snapInternalToOffset$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Swipeable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/gestures/DragScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SwipeableState$snapInternalToOffset$2", f = "Swipeable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C04542 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $target;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SwipeableState<T> this$0;

        C04542(float r2, SwipeableState<T> r3, Continuation<? super C04542> r4) {
            this.$target = r2;
            this.this$0 = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            C04542 r0 = new C04542(this.$target, this.this$0, r5);
            r0.L$0 = r4;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(DragScope r3, Continuation<? super Unit> r4) {
            return ((C04542) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(DragScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure(r4);
            DragScope $this$drag = (DragScope) this.L$0;
            $this$drag.dragBy(this.$target - SwipeableState.access$getAbsoluteOffset$p(this.this$0).getFloatValue());
            return Unit.INSTANCE;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.SwipeableState$snapTo$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Swipeable.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "anchors", "", "", "emit", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C04552<T> implements FlowCollector {
        final /* synthetic */ T $targetValue;
        final /* synthetic */ SwipeableState<T> this$0;

        C04552(T r1, SwipeableState<T> r2) {
            this.$targetValue = r1;
            this.this$0 = r2;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
            return emit((Map) value, $completion);
        }

        public final Object emit(Map<Float, ? extends T> r8, Continuation<? super Unit> r9) {
            if ((r9 instanceof SwipeableState$snapTo$2$emit$1) == false) goto L7;
            SwipeableState$snapTo$2$emit$1 r0 = (SwipeableState$snapTo$2$emit$1) r9;
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
            C04552<T> r10 = (C04552) r0.L$0;
            ResultKt.throwOnFailure($result);
        L19:
            SwipeableState.access$setCurrentValue(r10.this$0, r10.$targetValue);
            return Unit.INSTANCE;
        L13:
            ResultKt.throwOnFailure($result);
            Float targetOffset = SwipeableKt.access$getOffset(r8, this.$targetValue);
            if (targetOffset == null) goto L22;
            SwipeableState<T> r4 = this.this$0;
            float r5 = targetOffset.floatValue();
            r0.L$0 = this;
            r0.label = 1;
            if (SwipeableState.access$snapInternalToOffset(r4, r5, r0) != r2) goto L18;
            return r2;
        L18:
            r10 = this;
            goto L19
        L22:
            throw new IllegalArgumentException("The target value must have an associated anchor.".toString());
        L11:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L7:
            r0 = new SwipeableState$snapTo$2$emit$1(this, r9);
            goto L8
        }
    }

    static {
        Companion = new Companion(null);
    }

    public static /* synthetic */ void getDirection$annotations() {
    }

    public static /* synthetic */ void getProgress$annotations() {
    }

    public static /* synthetic */ void getTargetValue$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableState(T r10, AnimationSpec<Float> r11, Function1<? super T, Boolean> r12) {
        this.animationSpec = r11;
        this.confirmStateChange = r12;
        this.currentValue$delegate = SnapshotStateKt.mutableStateOf$default(r10, null, 2, null);
        this.isAnimationRunning$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.offsetState = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.overflowState = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.absoluteOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.animationTarget = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors$delegate = SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
        final Flow $this$filter$iv = SnapshotStateKt.snapshotFlow(new SwipeableState$latestNonEmptyAnchorsFlow$1(this));
        this.latestNonEmptyAnchorsFlow = FlowKt.take(new SwipeableState$special$$inlined$filter$1($this$filter$iv), 1);
        this.minBound = Float.NEGATIVE_INFINITY;
        this.maxBound = Float.POSITIVE_INFINITY;
        this.thresholds$delegate = SnapshotStateKt.mutableStateOf$default(SwipeableState$thresholds$2.INSTANCE, null, 2, null);
        this.velocityThreshold$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.resistance$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggableState = DraggableKt.DraggableState(new SwipeableState$draggableState$1(this));
    }

    public static final /* synthetic */ Object access$animateInternalToOffset(SwipeableState $this, float target, AnimationSpec spec, Continuation $completion) {
        return $this.animateInternalToOffset(target, spec, $completion);
    }

    public static final /* synthetic */ MutableFloatState access$getAbsoluteOffset$p(SwipeableState $this) {
        return $this.absoluteOffset;
    }

    public static final /* synthetic */ MutableState access$getAnimationTarget$p(SwipeableState $this) {
        return $this.animationTarget;
    }

    public static final /* synthetic */ MutableFloatState access$getOffsetState$p(SwipeableState $this) {
        return $this.offsetState;
    }

    public static final /* synthetic */ MutableFloatState access$getOverflowState$p(SwipeableState $this) {
        return $this.overflowState;
    }

    public static final /* synthetic */ void access$setAnimationRunning(SwipeableState $this, boolean r1) {
        $this.setAnimationRunning(r1);
    }

    public static final /* synthetic */ void access$setCurrentValue(SwipeableState $this, Object r1) {
        $this.setCurrentValue(r1);
    }

    public static final /* synthetic */ Object access$snapInternalToOffset(SwipeableState $this, float target, Continuation $completion) {
        return $this.snapInternalToOffset(target, $completion);
    }

    public /* synthetic */ SwipeableState(Object r1, SpringSpec<Float> r2, AnonymousClass1 r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = SwipeableDefaults.INSTANCE.getAnimationSpec();
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = AnonymousClass1.INSTANCE;
    L8:
        this(r1, r2, r3);
    }

    public final AnimationSpec<Float> getAnimationSpec$material_release() {
        return this.animationSpec;
    }

    public final Function1<T, Boolean> getConfirmStateChange$material_release() {
        return this.confirmStateChange;
    }

    private final void setCurrentValue(T r4) {
        MutableState $this$setValue$iv = this.currentValue$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final T getCurrentValue() {
        State $this$getValue$iv = this.currentValue$delegate;
        return $this$getValue$iv.getValue();
    }

    private final void setAnimationRunning(boolean r5) {
        MutableState $this$setValue$iv = this.isAnimationRunning$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    public final boolean isAnimationRunning() {
        State $this$getValue$iv = this.isAnimationRunning$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    public final State<Float> getOffset() {
        return this.offsetState;
    }

    public final State<Float> getOverflow() {
        return this.overflowState;
    }

    public final Map<Float, T> getAnchors$material_release() {
        State $this$getValue$iv = this.anchors$delegate;
        return (Map) $this$getValue$iv.getValue();
    }

    public final void setAnchors$material_release(Map<Float, ? extends T> r4) {
        MutableState $this$setValue$iv = this.anchors$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final float getMinBound$material_release() {
        return this.minBound;
    }

    public final void setMinBound$material_release(float r1) {
        this.minBound = r1;
    }

    public final float getMaxBound$material_release() {
        return this.maxBound;
    }

    public final void setMaxBound$material_release(float r1) {
        this.maxBound = r1;
    }

    public final void ensureInit$material_release(Map<Float, ? extends T> r4) {
        if (getAnchors$material_release().isEmpty() == false) goto L9;
        Float initialOffset = SwipeableKt.access$getOffset(r4, getCurrentValue());
        if (initialOffset == null) goto L8;
        this.offsetState.setFloatValue(initialOffset.floatValue());
        this.absoluteOffset.setFloatValue(initialOffset.floatValue());
        return;
    L8:
        throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object processNewAnchors$material_release(Map<Float, ? extends T> r17, Map<Float, ? extends T> r18, Continuation<? super Unit> r19) {
        if ((r19 instanceof SwipeableState$processNewAnchors$1) == false) goto L7;
        SwipeableState$processNewAnchors$1 r0 = (SwipeableState$processNewAnchors$1) r19;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        SwipeableState$processNewAnchors$1 r3 = r0;
        Object r4 = r3.result;
        Object r5 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r3.label) {
            case 0: goto L25;
            case 1: goto L24;
            case 2: goto L17;
            case 3: goto L12;
            default: goto L11;
        };
    L12:
        float r6 = r3.F$0;
        Map<Float, ? extends T> r7 = (Map) r3.L$1;
        SwipeableState r8 = (SwipeableState) r3.L$0;
        ResultKt.throwOnFailure(r4);     // Catch: Throwable -> L15
        SwipeableState r9 = r8;
    L87:
        r9.setCurrentValue(MapsKt.getValue(r7, Boxing.boxFloat(r6)));
        Float r1 = CollectionsKt.minOrNull(r7.keySet());
        Intrinsics.checkNotNull(r1);
        r9.minBound = r1.floatValue();
        Float r2 = CollectionsKt.maxOrNull(r7.keySet());
        Intrinsics.checkNotNull(r2);
        r9.maxBound = r2.floatValue();
    L33:
        return Unit.INSTANCE;
    L15:
        th = th;
    L90:
        r8.setCurrentValue(MapsKt.getValue(r7, Boxing.boxFloat(r6)));
        Float r10 = CollectionsKt.minOrNull(r7.keySet());
        Intrinsics.checkNotNull(r10);
        r8.minBound = r10.floatValue();
        Float r11 = CollectionsKt.maxOrNull(r7.keySet());
        Intrinsics.checkNotNull(r11);
        r8.maxBound = r11.floatValue();
        throw th;
    L17:
        float r12 = r3.F$0;
        Map<Float, ? extends T> r13 = (Map) r3.L$1;
        SwipeableState r14 = (SwipeableState) r3.L$0;
        ResultKt.throwOnFailure(r4);     // Catch: Throwable -> L20 CancellationException -> L22
        SwipeableState r15 = r14;
    L80:
        r15.setCurrentValue(MapsKt.getValue(r13, Boxing.boxFloat(r12)));
        Float r16 = CollectionsKt.minOrNull(r13.keySet());
        Intrinsics.checkNotNull(r16);
        r15.minBound = r16.floatValue();
        Float r20 = CollectionsKt.maxOrNull(r13.keySet());
        Intrinsics.checkNotNull(r20);
        r15.maxBound = r20.floatValue();
        goto L33
    L20:
        th = th;
        r6 = r12;
        r7 = r13;
        r8 = r14;
    L23:
        float r21 = r12;
        r7 = r13;
        r8 = r14;
    L83:
        r3.L$0 = r8;     // Catch: Throwable -> L88
        r3.L$1 = r7;     // Catch: Throwable -> L88
        r3.F$0 = r21;     // Catch: Throwable -> L88
        r3.label = 3;     // Catch: Throwable -> L88
        if (r8.snapInternalToOffset(r21, r3) != r5) goto L86;
        return r5;
    L86:
        r6 = r21;
        r9 = r8;
    L88:
        th = th;
        r6 = r21;
        goto L90
    L24:
        ResultKt.throwOnFailure(r4);
        goto L33
    L25:
        ResultKt.throwOnFailure(r4);
        r8 = this;
        r7 = r18;
        if (r17.isEmpty() == false) goto L37;
        Float r22 = CollectionsKt.minOrNull(r7.keySet());
        Intrinsics.checkNotNull(r22);
        r8.minBound = r22.floatValue();
        Float r23 = CollectionsKt.maxOrNull(r7.keySet());
        Intrinsics.checkNotNull(r23);
        r8.maxBound = r23.floatValue();
        Float r24 = SwipeableKt.access$getOffset(r7, r8.getCurrentValue());
        if (r24 == null) goto L35;
        float r25 = r24.floatValue();
        r3.label = 1;
        if (r8.snapInternalToOffset(r25, r3) != r5) goto L33;
        return r5;
    L35:
        throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
    L37:
        if (Intrinsics.areEqual(r7, r17) == true) goto L33;
        r8.minBound = Float.NEGATIVE_INFINITY;
        r8.maxBound = Float.POSITIVE_INFINITY;
        Float r26 = r8.animationTarget.getValue();
        Object r27 = null;
        if (r26 == null) goto L56;
        Float r28 = SwipeableKt.access$getOffset(r7, r17.get(r26));
        if (r28 == null) goto L43;
        r21 = r28.floatValue();
    L94:
        AnimationSpec<Float> r29 = r8.animationSpec;     // Catch: CancellationException -> L82 Throwable -> L88
        r3.L$0 = r8;     // Catch: CancellationException -> L82 Throwable -> L88
        r3.L$1 = r7;     // Catch: CancellationException -> L82 Throwable -> L88
        r3.F$0 = r21;     // Catch: CancellationException -> L82 Throwable -> L88
        r3.label = 2;     // Catch: CancellationException -> L82 Throwable -> L88
        if (r8.animateInternalToOffset(r21, r29, r3) != r5) goto L79;
        return r5;
    L79:
        r15 = r8;
        r13 = r7;
        r12 = r21;
        goto L80
    L43:
        Iterator<T> r110 = r7.keySet().iterator();
        if (r110.hasNext() == false) goto L55;
        r27 = r110.next();
        if (r110.hasNext() == false) goto L55;
        float r111 = Math.abs(((Number) r27).floatValue() - r26.floatValue());
    L50:
        Object r30 = r110.next();
        float r112 = Math.abs(((Number) r30).floatValue() - r26.floatValue());
        if (Float.compare(r111, r112) <= 0) goto L54;
        r27 = r30;
        r111 = r112;
    L54:
        if (r110.hasNext() == true) goto L50;
    L55:
        Intrinsics.checkNotNull(r27);
        r21 = ((Number) r27).floatValue();
        goto L94
    L56:
        Object r31 = r17.get(r8.getOffset().getValue());
        if (Intrinsics.areEqual(r31, r8.getCurrentValue()) == false) goto L59;
        r31 = r8.getCurrentValue();
    L59:
        Float r32 = SwipeableKt.access$getOffset(r7, r31);
        if (r32 == null) goto L62;
        r21 = r32.floatValue();
        goto L94
    L62:
        Iterator<T> r113 = r7.keySet().iterator();
        if (r113.hasNext() == false) goto L74;
        r27 = r113.next();
        if (r113.hasNext() == false) goto L74;
        float r114 = Math.abs(((Number) r27).floatValue() - r8.getOffset().getValue().floatValue());
    L69:
        Object r33 = r113.next();
        float r115 = Math.abs(((Number) r33).floatValue() - r8.getOffset().getValue().floatValue());
        if (Float.compare(r114, r115) <= 0) goto L73;
        r27 = r33;
        r114 = r115;
    L73:
        if (r113.hasNext() == true) goto L69;
    L74:
        Intrinsics.checkNotNull(r27);
        r21 = ((Number) r27).floatValue();
        goto L94
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new SwipeableState$processNewAnchors$1(this, r19);
        goto L8
    }

    public final Function2<Float, Float, Float> getThresholds$material_release() {
        State $this$getValue$iv = this.thresholds$delegate;
        return (Function2) $this$getValue$iv.getValue();
    }

    public final void setThresholds$material_release(Function2<? super Float, ? super Float, Float> r4) {
        MutableState $this$setValue$iv = this.thresholds$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final float getVelocityThreshold$material_release() {
        FloatState $this$getValue$iv = this.velocityThreshold$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    public final void setVelocityThreshold$material_release(float r4) {
        MutableFloatState $this$setValue$iv = this.velocityThreshold$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    public final ResistanceConfig getResistance$material_release() {
        State $this$getValue$iv = this.resistance$delegate;
        return (ResistanceConfig) $this$getValue$iv.getValue();
    }

    public final void setResistance$material_release(ResistanceConfig r4) {
        MutableState $this$setValue$iv = this.resistance$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final DraggableState getDraggableState$material_release() {
        return this.draggableState;
    }

    private final Object snapInternalToOffset(float target, Continuation<? super Unit> r8) {
        Object r9 = DraggableState.drag$default(this.draggableState, null, new C04542(target, this, null), r8, 1, null);
        if (r9 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r9;
    L6:
        return Unit.INSTANCE;
    }

    private final Object animateInternalToOffset(float target, AnimationSpec<Float> r8, Continuation<? super Unit> r9) {
        Object r10 = DraggableState.drag$default(this.draggableState, null, new AnonymousClass2(this, target, r8, null), r9, 1, null);
        if (r10 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r10;
    L6:
        return Unit.INSTANCE;
    }

    public final T getTargetValue() {
        Float r0 = this.animationTarget.getValue();
        if (r0 == null) goto L5;
        float target = r0.floatValue();
    L10:
        T r1 = getAnchors$material_release().get(Float.valueOf(target));
        if (r1 == null) goto L13;
        return r1;
    L13:
        return getCurrentValue();
    L5:
        float r2 = getOffset().getValue().floatValue();
        Float r3 = SwipeableKt.access$getOffset(getAnchors$material_release(), getCurrentValue());
        if (r3 == null) goto L8;
        float r4 = r3.floatValue();
    L9:
        target = SwipeableKt.access$computeTarget(r2, r4, getAnchors$material_release().keySet(), getThresholds$material_release(), 0.0f, Float.POSITIVE_INFINITY);
        goto L10
    L8:
        r4 = getOffset().getValue().floatValue();
        goto L9
    }

    public final SwipeProgress<T> getProgress() {
        List bounds = SwipeableKt.access$findBounds(getOffset().getValue().floatValue(), getAnchors$material_release().keySet());
        switch(bounds.size()) {
            case 0: goto L8;
            case 1: goto L7;
            default: goto L5;
        };
    L7:
        Object from = MapsKt.getValue(getAnchors$material_release(), bounds.get(0));
        Object to = MapsKt.getValue(getAnchors$material_release(), bounds.get(0));
        float fraction = 1.0f;
    L12:
        return new SwipeProgress(from, to, fraction);
    L8:
        from = getCurrentValue();
        to = getCurrentValue();
        fraction = 1.0f;
        goto L12
    L5:
        if (getDirection() <= 0.0f) goto L9;
        Pair r4 = TuplesKt.to(bounds.get(0), bounds.get(1));
    L10:
        float a = ((Number) r4.component1()).floatValue();
        float b = ((Number) r4.component2()).floatValue();
        from = MapsKt.getValue(getAnchors$material_release(), Float.valueOf(a));
        to = MapsKt.getValue(getAnchors$material_release(), Float.valueOf(b));
        fraction = (getOffset().getValue().floatValue() - a) / (b - a);
        goto L12
    L9:
        r4 = TuplesKt.to(bounds.get(1), bounds.get(0));
        goto L10
    }

    public final float getDirection() {
        Float r0 = SwipeableKt.access$getOffset(getAnchors$material_release(), getCurrentValue());
        if (r0 == null) goto L5;
        float it = r0.floatValue();
        return Math.signum(getOffset().getValue().floatValue() - it);
    L5:
        return 0.0f;
    }

    public final Object snapTo(T r3, Continuation<? super Unit> r4) {
        Object r0 = this.latestNonEmptyAnchorsFlow.collect(new C04552(r3, this), r4);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(SwipeableState r0, Object r1, AnimationSpec r2, Continuation r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 2) == 0) goto L7;
        r2 = r0.animationSpec;
    L7:
        return r0.animateTo(r1, r2, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
    }

    public final Object animateTo(T r3, AnimationSpec<Float> r4, Continuation<? super Unit> r5) {
        Object r0 = this.latestNonEmptyAnchorsFlow.collect(new C04522(r3, this, r4), r5);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    public final Object performFling(final float velocity, Continuation<? super Unit> r4) {
        Object r0 = this.latestNonEmptyAnchorsFlow.collect(new C04532(this, velocity), r4);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    public final float performDrag(float delta) {
        float potentiallyConsumed = this.absoluteOffset.getFloatValue() + delta;
        float clamped = RangesKt.coerceIn(potentiallyConsumed, this.minBound, this.maxBound);
        float deltaToConsume = clamped - this.absoluteOffset.getFloatValue();
        if (Math.abs(deltaToConsume) <= 0.0f) goto L5;
        this.draggableState.dispatchRawDelta(deltaToConsume);
    L5:
        return deltaToConsume;
    }
}
