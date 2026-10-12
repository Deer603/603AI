package androidx.compose.material3.internal;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import androidx.compose.foundation.MutatePriority;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: InternalMutatorMutex.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J<\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0086@¢\u0006\u0002\u0010\u0010JU\u0010\u0011\u001a\u0002H\n\"\u0004\b\u0000\u0010\u0012\"\u0004\b\u0001\u0010\n2\u0006\u0010\u0013\u001a\u0002H\u00122\b\b\u0002\u0010\u000b\u001a\u00020\f2'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u0002H\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014¢\u0006\u0002\b\u0015H\u0086@¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0005H\u0002R\"\u0010\u0003\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/internal/InternalMutatorMutex;", "", "()V", "currentMutator", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/material3/internal/InternalMutatorMutex$Mutator;", "Landroidx/compose/material3/internal/InternalAtomicReference;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "mutate", "R", "priority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mutateWith", "T", "receiver", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryMutate", "", "Lkotlin/Function0;", "", "tryMutateOrCancel", "mutator", "Mutator", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InternalMutatorMutex {
    public static final int $stable = 0;
    private final AtomicReference<Mutator> currentMutator;
    private final Mutex mutex;

    /* JADX INFO: compiled from: InternalMutatorMutex.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0000J\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Landroidx/compose/material3/internal/InternalMutatorMutex$Mutator;", "", "priority", "Landroidx/compose/foundation/MutatePriority;", "job", "Lkotlinx/coroutines/Job;", "(Landroidx/compose/foundation/MutatePriority;Lkotlinx/coroutines/Job;)V", "getJob", "()Lkotlinx/coroutines/Job;", "getPriority", "()Landroidx/compose/foundation/MutatePriority;", "canInterrupt", "", "other", "cancel", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Mutator {
        private final Job job;
        private final MutatePriority priority;

        public Mutator(MutatePriority priority, Job job) {
            this.priority = priority;
            this.job = job;
        }

        public final Job getJob() {
            return this.job;
        }

        public final MutatePriority getPriority() {
            return this.priority;
        }

        public final boolean canInterrupt(Mutator other) {
            if (this.priority.compareTo(other.priority) < 0) goto L5;
            return true;
        L5:
            return false;
        }

        public final void cancel() {
            Job.DefaultImpls.cancel$default(this.job, null, 1, null);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.compose.material3.internal.InternalMutatorMutex$mutate$2, reason: invalid class name */
    /* JADX INFO: compiled from: InternalMutatorMutex.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.internal.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {180, 103}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class AnonymousClass2<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
        final /* synthetic */ Function1<Continuation<? super R>, Object> $block;
        final /* synthetic */ MutatePriority $priority;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ InternalMutatorMutex this$0;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(MutatePriority r2, InternalMutatorMutex r3, Function1<? super Continuation<? super R>, ? extends Object> r4, Continuation<? super AnonymousClass2> r5) {
            this.$priority = r2;
            this.this$0 = r3;
            this.$block = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            AnonymousClass2 r0 = new AnonymousClass2(this.$priority, this.this$0, this.$block, r6);
            r0.L$0 = r5;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Object r3) {
            return invoke(r2, (Continuation) r3);
        }

        public final Object invoke(CoroutineScope r3, Continuation<? super R> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L12;
                case 1: goto L11;
                case 2: goto L6;
                default: goto L5;
            };
        L6:
            AnonymousClass2<R> r1 = this;
            Mutex r2 = null;
            InternalMutatorMutex r4 = (InternalMutatorMutex) r1.L$2;
            Object owner$iv = null;
            Mutex $this$withLock_u24default$iv = (Mutex) r1.L$1;
            Mutator mutator = (Mutator) r1.L$0;
            ResultKt.throwOnFailure($result);     // Catch: Throwable -> L9
        L37:
            MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(InternalMutatorMutex.access$getCurrentMutator$p(r4), mutator, null);     // Catch: Throwable -> L25
            $this$withLock_u24default$iv.unlock(owner$iv);
            return $result;
        L25:
            Throwable th = th;
        L33:
            $this$withLock_u24default$iv.unlock(owner$iv);
            throw th;
        L9:
            Throwable th2 = th;
        L41:
            MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(InternalMutatorMutex.access$getCurrentMutator$p(r4), mutator, null);     // Catch: Throwable -> L31
            throw th2;     // Catch: Throwable -> L31
        L31:
            th = move-exception;
            th = th;
            goto L33
        L11:
            AnonymousClass2<R> r3 = this;
            Mutex $this$withLock_u24default$iv2 = null;
            r4 = (InternalMutatorMutex) r3.L$3;
            Function1<Continuation<? super R>, Object> r5 = (Function1) r3.L$2;
            Object owner$iv2 = null;
            Mutex $this$withLock_u24default$iv3 = (Mutex) r3.L$1;
            Mutator mutator2 = (Mutator) r3.L$0;
            ResultKt.throwOnFailure($result);
        L39:
            r3.L$0 = mutator2;     // Catch: Throwable -> L27
            r3.L$1 = $this$withLock_u24default$iv3;     // Catch: Throwable -> L27
            r3.L$2 = r4;     // Catch: Throwable -> L27
            r3.L$3 = null;     // Catch: Throwable -> L27
            r3.label = 2;     // Catch: Throwable -> L27
            Object r6 = r5.invoke(r3);     // Catch: Throwable -> L27
            if (r6 != r0) goto L20;
            return r0;
        L20:
            $result = r6;
            owner$iv = owner$iv2;
            $this$withLock_u24default$iv = $this$withLock_u24default$iv3;
            mutator = mutator2;
        L27:
            th = move-exception;
            owner$iv = owner$iv2;
            $this$withLock_u24default$iv = $this$withLock_u24default$iv3;
            mutator = mutator2;
            th2 = th;
            r1 = r3;
            r2 = $this$withLock_u24default$iv2;
            goto L41
        L12:
            ResultKt.throwOnFailure($result);
            r3 = this;
            CoroutineScope $this$coroutineScope = (CoroutineScope) r3.L$0;
            MutatePriority r7 = r3.$priority;
            CoroutineContext.Element r8 = $this$coroutineScope.getCoroutineContext().get(Job.Key);
            Intrinsics.checkNotNull(r8);
            Mutator mutator3 = new Mutator(r7, (Job) r8);
            InternalMutatorMutex.access$tryMutateOrCancel(r3.this$0, mutator3);
            Mutex $this$withLock_u24default$iv4 = InternalMutatorMutex.access$getMutex$p(r3.this$0);
            r5 = r3.$block;
            InternalMutatorMutex r9 = r3.this$0;
            r3.L$0 = mutator3;
            r3.L$1 = $this$withLock_u24default$iv4;
            r3.L$2 = r5;
            r3.L$3 = r9;
            r3.label = 1;
            if ($this$withLock_u24default$iv4.lock(null, r3) != r0) goto L15;
            return r0;
        L15:
            $this$withLock_u24default$iv3 = $this$withLock_u24default$iv4;
            $this$withLock_u24default$iv2 = null;
            mutator2 = mutator3;
            r4 = r9;
            owner$iv2 = null;
            goto L39
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.compose.material3.internal.InternalMutatorMutex$mutateWith$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: InternalMutatorMutex.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "R", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.internal.InternalMutatorMutex$mutateWith$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {180, 142}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class C06022<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
        final /* synthetic */ Function2<T, Continuation<? super R>, Object> $block;
        final /* synthetic */ MutatePriority $priority;
        final /* synthetic */ T $receiver;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ InternalMutatorMutex this$0;

        /* JADX WARN: Multi-variable type inference failed */
        C06022(MutatePriority r2, InternalMutatorMutex r3, Function2<? super T, ? super Continuation<? super R>, ? extends Object> r4, T r5, Continuation<? super C06022> r6) {
            this.$priority = r2;
            this.this$0 = r3;
            this.$block = r4;
            this.$receiver = r5;
            super(2, r6);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
            C06022 r0 = new C06022(this.$priority, this.this$0, this.$block, this.$receiver, r8);
            r0.L$0 = r7;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Object r3) {
            return invoke(r2, (Continuation) r3);
        }

        public final Object invoke(CoroutineScope r3, Continuation<? super R> r4) {
            return ((C06022) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L12;
                case 1: goto L11;
                case 2: goto L6;
                default: goto L5;
            };
        L6:
            C06022<R> r1 = this;
            Mutex r2 = null;
            InternalMutatorMutex r4 = (InternalMutatorMutex) r1.L$2;
            Object owner$iv = null;
            Mutex $this$withLock_u24default$iv = (Mutex) r1.L$1;
            Object owner$iv2 = (Mutator) r1.L$0;
            ResultKt.throwOnFailure($result);     // Catch: Throwable -> L9
        L35:
            MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(InternalMutatorMutex.access$getCurrentMutator$p(r4), owner$iv2, null);     // Catch: Throwable -> L25
            $this$withLock_u24default$iv.unlock(owner$iv);
            return $result;
        L25:
            Throwable th = th;
        L33:
            $this$withLock_u24default$iv.unlock(owner$iv);
            throw th;
        L9:
            Throwable th2 = th;
        L39:
            MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(InternalMutatorMutex.access$getCurrentMutator$p(r4), owner$iv2, null);     // Catch: Throwable -> L31
            throw th2;     // Catch: Throwable -> L31
        L31:
            th = move-exception;
            th = th;
            goto L33
        L11:
            C06022<R> r3 = this;
            Mutex $this$withLock_u24default$iv2 = null;
            r4 = (InternalMutatorMutex) r3.L$4;
            Object r5 = r3.L$3;
            Function2 r6 = (Function2) r3.L$2;
            Object owner$iv3 = null;
            Mutex $this$withLock_u24default$iv3 = (Mutex) r3.L$1;
            Object mutator = (Mutator) r3.L$0;
            ResultKt.throwOnFailure($result);
        L37:
            r3.L$0 = mutator;     // Catch: Throwable -> L27
            r3.L$1 = $this$withLock_u24default$iv3;     // Catch: Throwable -> L27
            r3.L$2 = r4;     // Catch: Throwable -> L27
            r3.L$3 = null;     // Catch: Throwable -> L27
            r3.L$4 = null;     // Catch: Throwable -> L27
            r3.label = 2;     // Catch: Throwable -> L27
            Object r7 = r6.invoke(r5, r3);     // Catch: Throwable -> L27
            if (r7 != r0) goto L20;
            return r0;
        L20:
            $result = r7;
            owner$iv = owner$iv3;
            $this$withLock_u24default$iv = $this$withLock_u24default$iv3;
            owner$iv2 = mutator;
        L27:
            th = move-exception;
            owner$iv = owner$iv3;
            $this$withLock_u24default$iv = $this$withLock_u24default$iv3;
            owner$iv2 = mutator;
            th2 = th;
            r1 = r3;
            r2 = $this$withLock_u24default$iv2;
            goto L39
        L12:
            ResultKt.throwOnFailure($result);
            r3 = this;
            CoroutineScope $this$coroutineScope = (CoroutineScope) r3.L$0;
            MutatePriority r8 = r3.$priority;
            CoroutineContext.Element r9 = $this$coroutineScope.getCoroutineContext().get(Job.Key);
            Intrinsics.checkNotNull(r9);
            Mutator mutator2 = new Mutator(r8, (Job) r9);
            InternalMutatorMutex.access$tryMutateOrCancel(r3.this$0, mutator2);
            Mutex $this$withLock_u24default$iv4 = InternalMutatorMutex.access$getMutex$p(r3.this$0);
            r6 = r3.$block;
            r5 = r3.$receiver;
            InternalMutatorMutex r10 = r3.this$0;
            r3.L$0 = mutator2;
            r3.L$1 = $this$withLock_u24default$iv4;
            r3.L$2 = r6;
            r3.L$3 = r5;
            r3.L$4 = r10;
            r3.label = 1;
            if ($this$withLock_u24default$iv4.lock(null, r3) != r0) goto L15;
            return r0;
        L15:
            $this$withLock_u24default$iv3 = $this$withLock_u24default$iv4;
            $this$withLock_u24default$iv2 = null;
            mutator = mutator2;
            r4 = r10;
            owner$iv3 = null;
            goto L37
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
    }

    public InternalMutatorMutex() {
        this.currentMutator = new AtomicReference(null);
        this.mutex = MutexKt.Mutex$default(false, 1, null);
    }

    public static final /* synthetic */ AtomicReference access$getCurrentMutator$p(InternalMutatorMutex $this) {
        return $this.currentMutator;
    }

    public static final /* synthetic */ Mutex access$getMutex$p(InternalMutatorMutex $this) {
        return $this.mutex;
    }

    public static final /* synthetic */ void access$tryMutateOrCancel(InternalMutatorMutex $this, Mutator mutator) {
        $this.tryMutateOrCancel(mutator);
    }

    private final void tryMutateOrCancel(Mutator mutator) {
    L2:
        Mutator oldMutator = this.currentMutator.get();
        if (oldMutator == null) goto L10;
        if (mutator.canInterrupt(oldMutator) == true) goto L10;
        throw new CancellationException("Current mutation had a higher priority");
    L10:
        if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.currentMutator, oldMutator, mutator) == false) goto L2;
        if (oldMutator == null) goto L18;
        oldMutator.cancel();
        return;
    }

    public static /* synthetic */ Object mutate$default(InternalMutatorMutex r0, MutatePriority r1, Function1 r2, Continuation r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = MutatePriority.Default;
    L6:
        return r0.mutate(r1, r2, r3);
    }

    public final <R> Object mutate(MutatePriority priority, Function1<? super Continuation<? super R>, ? extends Object> r4, Continuation<? super R> r5) {
        return CoroutineScopeKt.coroutineScope(new AnonymousClass2(priority, this, r4, null), r5);
    }

    public static /* synthetic */ Object mutateWith$default(InternalMutatorMutex r0, Object r1, MutatePriority r2, Function2 r3, Continuation r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = MutatePriority.Default;
    L6:
        return r0.mutateWith(r1, r2, r3, r4);
    }

    public final <T, R> Object mutateWith(T r7, MutatePriority priority, Function2<? super T, ? super Continuation<? super R>, ? extends Object> r9, Continuation<? super R> r10) {
        return CoroutineScopeKt.coroutineScope(new C06022(priority, this, r9, r7, null), r10);
    }

    public final boolean tryMutate(Function0<Unit> r6) {
        boolean didLock = Mutex.DefaultImpls.tryLock$default(this.mutex, null, 1, null);
        if (didLock == true) goto L10;
    L9:
        return didLock;
    L10:
        r6.invoke();     // Catch: Throwable -> L6
        Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
    L6:
        th = move-exception;
        Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
        throw th;
    }
}
