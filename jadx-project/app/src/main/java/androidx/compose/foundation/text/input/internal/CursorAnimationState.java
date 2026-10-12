package androidx.compose.foundation.text.input.internal;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import androidx.compose.runtime.FloatState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: CursorAnimationState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u0007\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\t0\bj\n\u0012\u0006\u0012\u0004\u0018\u00010\t`\nX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CursorAnimationState;", "", "animate", "", "(Z)V", "getAnimate", "()Z", "animationJob", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/Job;", "Landroidx/compose/foundation/AtomicReference;", "<set-?>", "", "cursorAlpha", "getCursorAlpha", "()F", "setCursorAlpha", "(F)V", "cursorAlpha$delegate", "Landroidx/compose/runtime/MutableFloatState;", "cancelAndHide", "", "snapToVisibleAndAnimate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CursorAnimationState {
    public static final int $stable = 0;
    private final boolean animate;
    private AtomicReference<Job> animationJob;
    private final MutableFloatState cursorAlpha$delegate;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2, reason: invalid class name */
    /* JADX INFO: compiled from: CursorAnimationState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CursorAnimationState this$0;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: CursorAnimationState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", i = {}, l = {72, 77, 79, 81}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Job $oldJob;
            int label;
            final /* synthetic */ CursorAnimationState this$0;

            AnonymousClass1(Job r2, CursorAnimationState r3, Continuation<? super AnonymousClass1> r4) {
                this.$oldJob = r2;
                this.this$0 = r3;
                super(2, r4);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
                return new AnonymousClass1(this.$oldJob, this.this$0, r5);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                return invoke2(r2, r3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x007f -> B:43:0x0082). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: goto L13;
                    case 1: goto L12;
                    case 2: goto L8;
                    case 3: goto L7;
                    case 4: goto L6;
                    default: goto L5;
                };
            L6:
                ResultKt.throwOnFailure($result);     // Catch: Throwable -> L10
                AnonymousClass1 r1 = this;
            L43:
                CursorAnimationState.access$setCursorAlpha(r1.this$0, 1.0f);     // Catch: Throwable -> L36
            L28:
                r1.label = 3;     // Catch: Throwable -> L36
                if (DelayKt.delay(500, r1) != r0) goto L31;
                return r0;
            L31:
                CursorAnimationState.access$setCursorAlpha(r1.this$0, 0.0f);     // Catch: Throwable -> L36
                r1.label = 4;     // Catch: Throwable -> L36
                if (DelayKt.delay(500, r1) != r0) goto L43;
                return r0;
            L36:
                th = th;
            L40:
                CursorAnimationState.access$setCursorAlpha(r1.this$0, 0.0f);
                throw th;
            L7:
                ResultKt.throwOnFailure($result);     // Catch: Throwable -> L10
                r1 = this;
                goto L31
            L8:
                ResultKt.throwOnFailure($result);     // Catch: Throwable -> L10
            L25:
                throw new KotlinNothingValueException();     // Catch: Throwable -> L10
            L12:
                ResultKt.throwOnFailure($result);
            L45:
                CursorAnimationState.access$setCursorAlpha(this.this$0, 1.0f);     // Catch: Throwable -> L38
                if (this.this$0.getAnimate() == true) goto L26;
                this.label = 2;     // Catch: Throwable -> L10
                if (DelayKt.awaitCancellation(this) != r0) goto L25;
                return r0;
            L26:
                r1 = this;
            L38:
                th = th;
                r1 = this;
                goto L40
            L13:
                ResultKt.throwOnFailure($result);
                Job r2 = this.$oldJob;
                if (r2 == null) goto L45;
                this.label = 1;
                if (JobKt.cancelAndJoin(r2, this) != r0) goto L45;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            L10:
                th = th;
                r1 = this;
                goto L40
            }
        }

        AnonymousClass2(CursorAnimationState r2, Continuation<? super AnonymousClass2> r3) {
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            AnonymousClass2 r0 = new AnonymousClass2(this.this$0, r4);
            r0.L$0 = r3;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Boolean> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Boolean> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r10) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure(r10);
            CoroutineScope $this$coroutineScope = (CoroutineScope) this.L$0;
            Job oldJob = (Job) CursorAnimationState.access$getAnimationJob$p(this.this$0).getAndSet(null);
            return Boxing.boxBoolean(MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(CursorAnimationState.access$getAnimationJob$p(this.this$0), null, BuildersKt.launch$default($this$coroutineScope, null, null, new AnonymousClass1(oldJob, this.this$0, null), 3, null)));
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        $stable = 8;
    }

    public CursorAnimationState(boolean animate) {
        this.animate = animate;
        this.animationJob = new AtomicReference(null);
        this.cursorAlpha$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    }

    public static final /* synthetic */ AtomicReference access$getAnimationJob$p(CursorAnimationState $this) {
        return $this.animationJob;
    }

    public static final /* synthetic */ void access$setCursorAlpha(CursorAnimationState $this, float r1) {
        $this.setCursorAlpha(r1);
    }

    public final boolean getAnimate() {
        return this.animate;
    }

    private final void setCursorAlpha(float r4) {
        MutableFloatState $this$setValue$iv = this.cursorAlpha$delegate;
        $this$setValue$iv.setFloatValue(r4);
    }

    public final float getCursorAlpha() {
        FloatState $this$getValue$iv = this.cursorAlpha$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    public final Object snapToVisibleAndAnimate(Continuation<? super Unit> r3) {
        Object r0 = CoroutineScopeKt.coroutineScope(new AnonymousClass2(this, null), r3);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    public final void cancelAndHide() {
        Job job = this.animationJob.getAndSet(null);
        if (job == null) goto L6;
        Job.DefaultImpls.cancel$default(job, null, 1, null);
        return;
    }
}
