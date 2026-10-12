package kotlinx.coroutines.sync;

import androidx.autofill.HintConstants;
import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.SelectInstanceInternal;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0002+,B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\nH\u0016J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0002J\u0018\u0010 \u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0002\u0010!J\u0018\u0010\"\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0002\u0010!J\u001e\u0010#\u001a\u0004\u0018\u00010\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\n2\b\u0010$\u001a\u0004\u0018\u00010\nH\u0014J\u001e\u0010%\u001a\u00020\u00192\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010&\u001a\u00020'H\u0016J\u0012\u0010(\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010)\u001a\u00020\u001f2\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010*\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R(\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eRk\u0010\u000f\u001a_\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00170\u0010j\u0002`\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001cX\u0082\u0004¨\u0006-"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl;", "Lkotlinx/coroutines/sync/SemaphoreImpl;", "Lkotlinx/coroutines/sync/Mutex;", "locked", "", "(Z)V", "isLocked", "()Z", "onLock", "Lkotlinx/coroutines/selects/SelectClause2;", "", "getOnLock$annotations", "()V", "getOnLock", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSelectCancellationUnlockConstructor", "Lkotlin/Function3;", "Lkotlinx/coroutines/selects/SelectInstance;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "select", "param", "internalResult", "Lkotlin/Function1;", "", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "owner", "Lkotlinx/atomicfu/AtomicRef;", "holdsLock", "holdsLockImpl", "", "lock", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lockSuspend", "onLockProcessResult", "result", "onLockRegFunction", "toString", "", "tryLock", "tryLockImpl", "unlock", "CancellableContinuationWithOwner", "SelectInstanceWithOwner", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class MutexImpl extends SemaphoreImpl implements Mutex {
    private static final /* synthetic */ AtomicReferenceFieldUpdater owner$volatile$FU = null;
    private final Function3<SelectInstance<?>, Object, Object, Function1<Throwable, Unit>> onSelectCancellationUnlockConstructor;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: compiled from: Mutex.kt */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\u0012\u001a\u00020\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0001J\u0011\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0007H\u0097\u0001J\t\u0010\u0017\u001a\u00020\u0002H\u0097\u0001J2\u0010\u0018\u001a\u00020\u00022'\u0010\u0019\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00020\u001aj\u0002`\u001dH\u0096\u0001J\u001d\u0010\u0018\u001a\u00020\u00022\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010 \u001a\u00020!H\u0096\u0001J:\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00022#\u0010$\u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001aH\u0016¢\u0006\u0002\u0010%J\u001c\u0010&\u001a\u00020\u00022\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020(H\u0096\u0001¢\u0006\u0002\u0010)J$\u0010*\u001a\u0004\u0018\u00010\u00072\u0006\u0010#\u001a\u00020\u00022\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0007H\u0097\u0001¢\u0006\u0002\u0010,JF\u0010*\u001a\u0004\u0018\u00010\u00072\u0006\u0010#\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u00072#\u0010$\u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001aH\u0016¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u0004\u0018\u00010\u00072\u0006\u0010/\u001a\u00020\u0014H\u0097\u0001J\u001a\u00100\u001a\u00020\u0002*\u0002012\u0006\u0010#\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0002\u00102J\u0015\u00103\u001a\u00020\u0002*\u0002012\u0006\u0010/\u001a\u00020\u0014H\u0097\u0001R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\nX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0012\u0010\u0011\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner;", "Lkotlinx/coroutines/CancellableContinuation;", "", "Lkotlinx/coroutines/Waiter;", "cont", "Lkotlinx/coroutines/CancellableContinuationImpl;", "owner", "", "(Lkotlinx/coroutines/sync/MutexImpl;Lkotlinx/coroutines/CancellableContinuationImpl;Ljava/lang/Object;)V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "isActive", "", "()Z", "isCancelled", "isCompleted", "cancel", "cause", "", "completeResume", "token", "initCancellability", "invokeOnCancellation", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "Lkotlinx/coroutines/CompletionHandler;", "segment", "Lkotlinx/coroutines/internal/Segment;", "index", "", "resume", "value", "onCancellation", "(Lkotlin/Unit;Lkotlin/jvm/functions/Function1;)V", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "tryResume", "idempotent", "(Lkotlin/Unit;Ljava/lang/Object;)Ljava/lang/Object;", "(Lkotlin/Unit;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "tryResumeWithException", "exception", "resumeUndispatched", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/Unit;)V", "resumeUndispatchedWithException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class CancellableContinuationWithOwner implements CancellableContinuation<Unit>, Waiter {
        public final CancellableContinuationImpl<Unit> cont;
        public final Object owner;
        final /* synthetic */ MutexImpl this$0;

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean cancel(Throwable r2) {
            return this.cont.cancel(r2);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void completeResume(Object r2) {
            this.cont.completeResume(r2);
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.cont.getContext();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void initCancellability() {
            this.cont.initCancellability();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void invokeOnCancellation(Function1<? super Throwable, Unit> r2) {
            this.cont.invokeOnCancellation(r2);
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> r2, int r3) {
            this.cont.invokeOnCancellation(r2, r3);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isActive() {
            return this.cont.isActive();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isCancelled() {
            return this.cont.isCancelled();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isCompleted() {
            return this.cont.isCompleted();
        }

        /* JADX INFO: renamed from: resumeUndispatched, reason: avoid collision after fix types in other method */
        public void resumeUndispatched2(CoroutineDispatcher r2, Unit r3) {
            this.cont.resumeUndispatched(r2, r3);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void resumeUndispatchedWithException(CoroutineDispatcher r2, Throwable r3) {
            this.cont.resumeUndispatchedWithException(r2, r3);
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object r2) {
            this.cont.resumeWith(r2);
        }

        /* JADX INFO: renamed from: tryResume, reason: avoid collision after fix types in other method */
        public Object tryResume2(Unit r2, Object r3) {
            return this.cont.tryResume(r2, r3);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public Object tryResumeWithException(Throwable r2) {
            return this.cont.tryResumeWithException(r2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CancellableContinuationWithOwner(MutexImpl this$0, CancellableContinuationImpl<? super Unit> r2, Object owner) {
            this.this$0 = this$0;
            this.cont = r2;
            this.owner = owner;
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public /* bridge */ /* synthetic */ void resume(Unit r2, Function1 onCancellation) {
            resume2(r2, onCancellation);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public /* bridge */ /* synthetic */ void resumeUndispatched(CoroutineDispatcher $this$resumeUndispatched, Unit r3) {
            resumeUndispatched2($this$resumeUndispatched, r3);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public /* bridge */ /* synthetic */ Object tryResume(Unit r2, Object idempotent) {
            return tryResume2(r2, idempotent);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public /* bridge */ /* synthetic */ Object tryResume(Unit r2, Object idempotent, Function1 onCancellation) {
            return tryResume2(r2, idempotent, onCancellation);
        }

        /* JADX INFO: renamed from: tryResume, reason: avoid collision after fix types in other method */
        public Object tryResume2(Unit value, Object idempotent, Function1<? super Throwable, Unit> r9) {
            MutexImpl r0 = this.this$0;
            boolean r2 = true;
            if (DebugKt.getASSERTIONS_ENABLED() == true) goto L5;
        L12:
            CancellableContinuationImpl<Unit> r1 = this.cont;
            final MutexImpl r4 = this.this$0;
            Object token = r1.tryResume(value, idempotent, new MutexImpl$CancellableContinuationWithOwner$tryResume$token$1(r4, this));
            if (token == null) goto L25;
            MutexImpl r3 = this.this$0;
            if (DebugKt.getASSERTIONS_ENABLED() == true) goto L17;
        L24:
            MutexImpl.access$getOwner$volatile$FU().set(this.this$0, this.owner);
            goto L25
        L17:
            if (MutexImpl.access$getOwner$volatile$FU().get(r3) == MutexKt.access$getNO_OWNER$p()) goto L20;
            r2 = false;
        L20:
            if (r2 == true) goto L24;
            throw new AssertionError();
        L25:
            return token;
        L5:
            if (MutexImpl.access$getOwner$volatile$FU().get(r0) != MutexKt.access$getNO_OWNER$p()) goto L7;
            boolean r5 = true;
        L8:
            if (r5 == true) goto L12;
            throw new AssertionError();
        L7:
            r5 = false;
            goto L8
        }

        /* JADX INFO: renamed from: resume, reason: avoid collision after fix types in other method */
        public void resume2(Unit value, Function1<? super Throwable, Unit> r5) {
            MutexImpl r0 = this.this$0;
            if (DebugKt.getASSERTIONS_ENABLED() == true) goto L5;
        L12:
            MutexImpl.access$getOwner$volatile$FU().set(this.this$0, this.owner);
            CancellableContinuationImpl<Unit> r1 = this.cont;
            final MutexImpl r2 = this.this$0;
            r1.resume(value, new MutexImpl$CancellableContinuationWithOwner$resume$2(r2, this));
            return;
        L5:
            if (MutexImpl.access$getOwner$volatile$FU().get(r0) != MutexKt.access$getNO_OWNER$p()) goto L7;
            boolean r3 = true;
        L8:
            if (r3 == true) goto L12;
            throw new AssertionError();
        L7:
            r3 = false;
            goto L8
        }
    }

    /* JADX INFO: compiled from: Mutex.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096\u0001J\u001d\u0010\u000f\u001a\u00020\f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0096\u0001J\u0012\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0016R\u0012\u0010\u0007\u001a\u00020\bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$SelectInstanceWithOwner;", "Q", "Lkotlinx/coroutines/selects/SelectInstanceInternal;", "select", "owner", "", "(Lkotlinx/coroutines/sync/MutexImpl;Lkotlinx/coroutines/selects/SelectInstanceInternal;Ljava/lang/Object;)V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "disposeOnCompletion", "", "disposableHandle", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCancellation", "segment", "Lkotlinx/coroutines/internal/Segment;", "index", "", "selectInRegistrationPhase", "internalResult", "trySelect", "", "clauseObject", "result", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class SelectInstanceWithOwner<Q> implements SelectInstanceInternal<Q> {
        public final Object owner;
        public final SelectInstanceInternal<Q> select;
        final /* synthetic */ MutexImpl this$0;

        @Override // kotlinx.coroutines.selects.SelectInstance
        public void disposeOnCompletion(DisposableHandle r2) {
            this.select.disposeOnCompletion(r2);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public CoroutineContext getContext() {
            return this.select.getContext();
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> r2, int r3) {
            this.select.invokeOnCancellation(r2, r3);
        }

        public SelectInstanceWithOwner(MutexImpl this$0, SelectInstanceInternal<Q> r2, Object owner) {
            this.this$0 = this$0;
            this.select = r2;
            this.owner = owner;
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public boolean trySelect(Object clauseObject, Object result) {
            MutexImpl r0 = this.this$0;
            if (DebugKt.getASSERTIONS_ENABLED() == true) goto L5;
        L12:
            boolean success = this.select.trySelect(clauseObject, result);
            MutexImpl r1 = this.this$0;
            if (success == false) goto L16;
            MutexImpl.access$getOwner$volatile$FU().set(r1, this.owner);
        L16:
            return success;
        L5:
            if (MutexImpl.access$getOwner$volatile$FU().get(r0) != MutexKt.access$getNO_OWNER$p()) goto L7;
            boolean r2 = true;
        L8:
            if (r2 == true) goto L12;
            throw new AssertionError();
        L7:
            r2 = false;
            goto L8
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public void selectInRegistrationPhase(Object internalResult) {
            MutexImpl r0 = this.this$0;
            if (DebugKt.getASSERTIONS_ENABLED() == true) goto L5;
        L12:
            MutexImpl.access$getOwner$volatile$FU().set(this.this$0, this.owner);
            this.select.selectInRegistrationPhase(internalResult);
            return;
        L5:
            if (MutexImpl.access$getOwner$volatile$FU().get(r0) != MutexKt.access$getNO_OWNER$p()) goto L7;
            boolean r1 = true;
        L8:
            if (r1 == true) goto L12;
            throw new AssertionError();
        L7:
            r1 = false;
            goto L8
        }
    }

    static {
        owner$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "owner$volatile");
    }

    public static /* synthetic */ void getOnLock$annotations() {
    }

    private final /* synthetic */ Object getOwner$volatile() {
        return this.owner$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater getOwner$volatile$FU() {
        return owner$volatile$FU;
    }

    private final /* synthetic */ void setOwner$volatile(Object r1) {
        this.owner$volatile = r1;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public Object lock(Object r2, Continuation<? super Unit> r3) {
        return lock$suspendImpl(this, r2, r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MutexImpl(boolean r2) {
        super(1, r2 ? 1 : 0);
        if (r2 == false) goto L5;
        Symbol r0 = null;
    L6:
        this.owner$volatile = r0;
        this.onSelectCancellationUnlockConstructor = new MutexImpl$onSelectCancellationUnlockConstructor$1(this);
        return;
    L5:
        r0 = MutexKt.access$getNO_OWNER$p();
        goto L6
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater access$getOwner$volatile$FU() {
        return getOwner$volatile$FU();
    }

    public static final /* synthetic */ Object access$lockSuspend(MutexImpl $this, Object owner, Continuation $completion) {
        return $this.lockSuspend(owner, $completion);
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean isLocked() {
        if (getAvailablePermits() != 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean holdsLock(Object owner) {
        if (holdsLockImpl(owner) == 1) goto L7;
        return false;
    L7:
        return true;
    }

    private final int holdsLockImpl(Object owner) {
    L3:
        if (isLocked() == false) goto L4;
        Object curOwner = getOwner$volatile$FU().get(this);
        if (curOwner == MutexKt.access$getNO_OWNER$p()) goto L3;
        if (curOwner != owner) goto L10;
        return 1;
    L10:
        return 2;
    L4:
        return 0;
    }

    static /* synthetic */ Object lock$suspendImpl(MutexImpl $this, Object owner, Continuation<? super Unit> r4) {
        if ($this.tryLock(owner) == true) goto L5;
        Object r0 = $this.lockSuspend(owner, r4);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        return r0;
    L10:
        return Unit.INSTANCE;
    L5:
        return Unit.INSTANCE;
    }

    private final Object lockSuspend(Object owner, Continuation<? super Unit> r10) {
        CancellableContinuationImpl cancellable$iv = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(r10));
        CancellableContinuationWithOwner contWithOwner = new CancellableContinuationWithOwner(this, cancellable$iv, owner);     // Catch: Throwable -> L12
        acquire(contWithOwner);     // Catch: Throwable -> L12
        Object r1 = cancellable$iv.getResult();
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L8;
        DebugProbesKt.probeCoroutineSuspended(r10);
    L8:
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L11;
        return r1;
    L11:
        return Unit.INSTANCE;
    L12:
        e$iv = move-exception;
        cancellable$iv.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
        throw e$iv;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean tryLock(Object owner) {
        switch(tryLockImpl(owner)) {
            case 0: goto L9;
            case 1: goto L8;
            case 2: goto L7;
            default: goto L5;
        };
    L8:
        return false;
    L9:
        return true;
    L5:
        throw new IllegalStateException("unexpected".toString());
    L7:
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + owner).toString());
    }

    private final int tryLockImpl(Object owner) {
    L2:
        boolean r1 = true;
        if (tryAcquire() == true) goto L5;
        if (owner == null) goto L17;
        switch(holdsLockImpl(owner)) {
            case 0: goto L2;
            case 1: goto L22;
            case 2: goto L21;
            default: goto L2;
        };
    L21:
        return 1;
    L22:
        return 2;
    L17:
        return 1;
    L5:
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L7;
    L14:
        getOwner$volatile$FU().set(this, owner);
        return 0;
    L7:
        if (getOwner$volatile$FU().get(this) == MutexKt.access$getNO_OWNER$p()) goto L10;
        r1 = false;
    L10:
        if (r1 == true) goto L14;
        throw new AssertionError();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public void unlock(Object owner) {
    L3:
        if (isLocked() == false) goto L19;
        Object curOwner = getOwner$volatile$FU().get(this);
        if (curOwner == MutexKt.access$getNO_OWNER$p()) goto L3;
        if (curOwner == owner) goto L10;
        if (owner == null) goto L10;
        boolean r1 = false;
    L11:
        if (r1 == false) goto L17;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getOwner$volatile$FU(), this, curOwner, MutexKt.access$getNO_OWNER$p()) == false) goto L3;
        release();
        return;
    L17:
        throw new IllegalStateException(("This mutex is locked by " + curOwner + ", but " + owner + " is expected").toString());
    L10:
        r1 = true;
        goto L11
    L19:
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public SelectClause2<Object, Mutex> getOnLock() {
        MutexImpl$onLock$1 r1 = MutexImpl$onLock$1.INSTANCE;
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Function3 r2 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r1, 3);
        MutexImpl$onLock$2 r3 = MutexImpl$onLock$2.INSTANCE;
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause2Impl(this, r2, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r3, 3), this.onSelectCancellationUnlockConstructor);
    }

    protected void onLockRegFunction(SelectInstance<?> r3, Object owner) {
        if (owner != null) goto L4;
    L6:
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
        onAcquireRegFunction(new SelectInstanceWithOwner(this, (SelectInstanceInternal) r3, owner), owner);
        return;
    L4:
        if (holdsLock(owner) == false) goto L6;
        r3.selectInRegistrationPhase(MutexKt.access$getON_LOCK_ALREADY_LOCKED_BY_OWNER$p());
    }

    protected Object onLockProcessResult(Object owner, Object result) {
        if (Intrinsics.areEqual(result, MutexKt.access$getON_LOCK_ALREADY_LOCKED_BY_OWNER$p()) == true) goto L6;
        return this;
    L6:
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + owner).toString());
    }

    public String toString() {
        return "Mutex@" + DebugStringsKt.getHexAddress(this) + "[isLocked=" + isLocked() + ",owner=" + getOwner$volatile$FU().get(this) + ']';
    }
}
