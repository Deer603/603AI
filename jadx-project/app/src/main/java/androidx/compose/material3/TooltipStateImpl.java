package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: compiled from: Tooltip.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016J\u0016\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0014\u0010\t\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/TooltipStateImpl;", "Landroidx/compose/material3/TooltipState;", "initialIsVisible", "", "isPersistent", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "(ZZLandroidx/compose/foundation/MutatorMutex;)V", "()Z", "isVisible", "job", "Lkotlinx/coroutines/CancellableContinuation;", "", "transition", "Landroidx/compose/animation/core/MutableTransitionState;", "getTransition", "()Landroidx/compose/animation/core/MutableTransitionState;", "dismiss", "onDispose", "show", "mutatePriority", "Landroidx/compose/foundation/MutatePriority;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class TooltipStateImpl implements TooltipState {
    private final boolean isPersistent;
    private CancellableContinuation<? super Unit> job;
    private final MutatorMutex mutatorMutex;
    private final MutableTransitionState<Boolean> transition;

    /* JADX INFO: renamed from: androidx.compose.material3.TooltipStateImpl$show$2, reason: invalid class name */
    /* JADX INFO: compiled from: Tooltip.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.TooltipStateImpl$show$2", f = "Tooltip.kt", i = {}, l = {504, 506}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Continuation<? super Unit>, Object> $cancellableShow;
        final /* synthetic */ MutatePriority $mutatePriority;
        int label;
        final /* synthetic */ TooltipStateImpl this$0;

        /* JADX INFO: renamed from: androidx.compose.material3.TooltipStateImpl$show$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Tooltip.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material3.TooltipStateImpl$show$2$1", f = "Tooltip.kt", i = {}, l = {506}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<Continuation<? super Unit>, Object> $cancellableShow;
            int label;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Function1<? super Continuation<? super Unit>, ? extends Object> r2, Continuation<? super AnonymousClass1> r3) {
                this.$cancellableShow = r2;
                super(2, r3);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
                return new AnonymousClass1(this.$cancellableShow, r4);
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
            L12:
                return Unit.INSTANCE;
            L7:
                ResultKt.throwOnFailure($result);
                Function1<Continuation<? super Unit>, Object> r2 = this.$cancellableShow;
                this.label = 1;
                if (r2.invoke(this) != r0) goto L12;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(TooltipStateImpl r2, Function1<? super Continuation<? super Unit>, ? extends Object> r3, MutatePriority r4, Continuation<? super AnonymousClass2> r5) {
            this.this$0 = r2;
            this.$cancellableShow = r3;
            this.$mutatePriority = r4;
            super(1, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> r5) {
            return new AnonymousClass2(this.this$0, this.$cancellableShow, this.$mutatePriority, r5);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Unit> r2) {
            return invoke2(r2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Unit> r3) {
            return ((AnonymousClass2) create(r3)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            AnonymousClass2 r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L12;
                case 1: goto L8;
                case 2: goto L6;
                default: goto L5;
            };
        L6:
            AnonymousClass2 r1 = this;
            ResultKt.throwOnFailure($result);     // Catch: Throwable -> L10
        L26:
            if (r1.$mutatePriority == MutatePriority.PreventUserInput) goto L29;
            r1.this$0.dismiss();
        L29:
            return Unit.INSTANCE;
        L8:
            r1 = this;
            ResultKt.throwOnFailure($result);     // Catch: Throwable -> L10
            goto L26
        L12:
            ResultKt.throwOnFailure($result);
        L30:
            th = move-exception;
            th = th;
            r0 = this;
        L33:
            if (r0.$mutatePriority == MutatePriority.PreventUserInput) goto L35;
            r0.this$0.dismiss();
        L35:
            throw th;
        L14:
            if (this.this$0.isPersistent() == false) goto L20;
            Function1<Continuation<? super Unit>, Object> r2 = this.$cancellableShow;     // Catch: Throwable -> L30
            this.label = 1;     // Catch: Throwable -> L30
            if (r2.invoke(this) != r0) goto L18;
            return r0;
        L18:
            r1 = this;
            goto L26
        L20:
            this.label = 2;     // Catch: Throwable -> L30
            if (TimeoutKt.withTimeout(1500, new AnonymousClass1(this.$cancellableShow, null), this) != r0) goto L23;
            return r0;
        L23:
            r1 = this;
            goto L26
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L10:
            th = th;
            goto L33
        }
    }

    public TooltipStateImpl(boolean initialIsVisible, boolean isPersistent, MutatorMutex mutatorMutex) {
        this.isPersistent = isPersistent;
        this.mutatorMutex = mutatorMutex;
        this.transition = new MutableTransitionState(Boolean.valueOf(initialIsVisible));
    }

    public static final /* synthetic */ void access$setJob$p(TooltipStateImpl $this, CancellableContinuation r1) {
        $this.job = r1;
    }

    @Override // androidx.compose.material3.TooltipState
    public boolean isPersistent() {
        return this.isPersistent;
    }

    @Override // androidx.compose.material3.TooltipState
    public MutableTransitionState<Boolean> getTransition() {
        return this.transition;
    }

    @Override // androidx.compose.material3.TooltipState
    public boolean isVisible() {
        if (getTransition().getCurrentState().booleanValue() == false) goto L5;
    L8:
        return true;
    L5:
        if (getTransition().getTargetState().booleanValue() == true) goto L8;
        return false;
    }

    @Override // androidx.compose.material3.TooltipState
    public Object show(MutatePriority mutatePriority, Continuation<? super Unit> r6) {
        Function1 cancellableShow = new TooltipStateImpl$show$cancellableShow$1(this, null);
        Object r1 = this.mutatorMutex.mutate(mutatePriority, new AnonymousClass2(this, cancellableShow, mutatePriority, null), r6);
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r1;
    L6:
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.material3.TooltipState
    public void dismiss() {
        getTransition().setTargetState(false);
    }

    @Override // androidx.compose.material3.TooltipState
    public void onDispose() {
        CancellableContinuation<? super Unit> r0 = this.job;
        if (r0 == null) goto L6;
        CancellableContinuation.DefaultImpls.cancel$default(r0, null, 1, null);
        return;
    }
}
