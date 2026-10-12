package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: DeferredTargetAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J+\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\u0002\u0010\u001eR/\u0010\t\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000bR\u0016\u0010\u0017\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Landroidx/compose/animation/core/DeferredTargetAnimation;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "", "vectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Landroidx/compose/animation/core/TwoWayConverter;)V", "<set-?>", "_pendingTarget", "get_pendingTarget", "()Ljava/lang/Object;", "set_pendingTarget", "(Ljava/lang/Object;)V", "_pendingTarget$delegate", "Landroidx/compose/runtime/MutableState;", "animatable", "Landroidx/compose/animation/core/Animatable;", "isIdle", "", "()Z", "pendingTarget", "getPendingTarget", "target", "getTarget", "updateTarget", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "(Ljava/lang/Object;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/animation/core/FiniteAnimationSpec;)Ljava/lang/Object;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DeferredTargetAnimation<T, V extends AnimationVector> {
    public static final int $stable = 0;
    private final MutableState _pendingTarget$delegate;
    private Animatable<T, V> animatable;
    private final TwoWayConverter<T, V> vectorConverter;

    /* JADX INFO: renamed from: androidx.compose.animation.core.DeferredTargetAnimation$updateTarget$1, reason: invalid class name */
    /* JADX INFO: compiled from: DeferredTargetAnimation.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.animation.core.DeferredTargetAnimation$updateTarget$1", f = "DeferredTargetAnimation.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Animatable<T, V> $anim;
        final /* synthetic */ FiniteAnimationSpec<T> $animationSpec;
        final /* synthetic */ T $target;
        int label;
        final /* synthetic */ DeferredTargetAnimation<T, V> this$0;

        AnonymousClass1(Animatable<T, V> r2, DeferredTargetAnimation<T, V> r3, T r4, FiniteAnimationSpec<T> r5, Continuation<? super AnonymousClass1> r6) {
            this.$anim = r2;
            this.this$0 = r3;
            this.$target = r4;
            this.$animationSpec = r5;
            super(2, r6);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
            return new AnonymousClass1(this.$anim, this.this$0, this.$target, this.$animationSpec, r8);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
        L14:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            if (Intrinsics.areEqual(this.$anim.getTargetValue(), DeferredTargetAnimation.access$get_pendingTarget(this.this$0)) == true) goto L14;
            this.label = 1;
            if (Animatable.animateTo$default(this.$anim, this.$target, this.$animationSpec, null, null, this, 12, null) != r0) goto L14;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        $stable = 8;
    }

    public DeferredTargetAnimation(TwoWayConverter<T, V> r3) {
        this.vectorConverter = r3;
        this._pendingTarget$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public static final /* synthetic */ Object access$get_pendingTarget(DeferredTargetAnimation $this) {
        return $this.get_pendingTarget();
    }

    public final T getPendingTarget() {
        return get_pendingTarget();
    }

    private final T get_pendingTarget() {
        State $this$getValue$iv = this._pendingTarget$delegate;
        return $this$getValue$iv.getValue();
    }

    private final void set_pendingTarget(T r4) {
        MutableState $this$setValue$iv = this._pendingTarget$delegate;
        $this$setValue$iv.setValue(r4);
    }

    private final T getTarget() {
        Animatable<T, V> r0 = this.animatable;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.getTargetValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object updateTarget$default(DeferredTargetAnimation r0, Object r1, CoroutineScope r2, SpringSpec r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
    L6:
        return r0.updateTarget(r1, r2, r3);
    }

    public final T updateTarget(T r11, CoroutineScope coroutineScope, FiniteAnimationSpec<T> r13) {
        set_pendingTarget(r11);
        Animatable<T, V> r0 = this.animatable;
        if (r0 != null) goto L5;
        Animatable<T, V> r1 = new Animatable(r11, this.vectorConverter, null, null, 12, null);
        this.animatable = r1;
        Animatable<T, V> r3 = r1;
    L6:
        BuildersKt.launch$default(coroutineScope, null, null, new AnonymousClass1(r3, this, r11, r13, null), 3, null);
        return r3.getValue();
    L5:
        r3 = r0;
        goto L6
    }

    public final boolean isIdle() {
        if (Intrinsics.areEqual(get_pendingTarget(), getTarget()) == false) goto L13;
        Animatable<T, V> r0 = this.animatable;
        if (r0 != null) goto L7;
    L9:
        boolean r1 = false;
    L10:
        if (r1 == false) goto L12;
        return false;
    L12:
        return true;
    L7:
        if (r0.isRunning() != true) goto L9;
        r1 = true;
        goto L10
    L13:
        return false;
    }
}
