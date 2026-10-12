package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0001j\u0002`\u0007H\u0086@¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nJ\u0006\u0010\u000b\u001a\u00020\u0005R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/ProduceFrameSignal;", "", "()V", "pendingFrameContinuation", "awaitFrameRequest", "", "lock", "Landroidx/compose/runtime/platform/SynchronizedObject;", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestFrameLocked", "Lkotlin/coroutines/Continuation;", "takeFrameRequestLocked", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ProduceFrameSignal {
    private Object pendingFrameContinuation;

    public ProduceFrameSignal() {
    }

    public static final /* synthetic */ Object access$getPendingFrameContinuation$p(ProduceFrameSignal $this) {
        return $this.pendingFrameContinuation;
    }

    public static final /* synthetic */ void access$setPendingFrameContinuation$p(ProduceFrameSignal $this, Object r1) {
        $this.pendingFrameContinuation = r1;
    }

    public final Object awaitFrameRequest(Object lock, Continuation<? super Unit> r12) {
        monitor-enter(lock);
    L36:
        th = move-exception;
        throw th;
    L6:
        if (this.pendingFrameContinuation != RecomposerKt.access$getProduceAnotherFrame$p()) goto L11;
        this.pendingFrameContinuation = RecomposerKt.access$getFramePending$p();     // Catch: Throwable -> L36
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L36
        monitor-exit(lock);
        return r2;
    L11:
        Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L36
        monitor-exit(lock);
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(r12), 1);
        cancellable$iv.initCancellability();
        CancellableContinuationImpl co = cancellable$iv;
        monitor-enter(lock);
    L33:
        th = move-exception;
        throw th;
    L17:
        if (access$getPendingFrameContinuation$p(this) != RecomposerKt.access$getProduceAnotherFrame$p()) goto L19;
        access$setPendingFrameContinuation$p(this, RecomposerKt.access$getFramePending$p());     // Catch: Throwable -> L33
        CancellableContinuation r8 = co;
    L22:
        monitor-exit(lock);
        if (r8 == null) goto L25;
        Result.Companion r6 = Result.Companion;
        r8.resumeWith(Result.m7425constructorimpl(Unit.INSTANCE));
    L25:
        Object r3 = cancellable$iv.getResult();
        if (r3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L29;
        DebugProbesKt.probeCoroutineSuspended(r12);
    L29:
        if (r3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L32;
        return r3;
    L32:
        return Unit.INSTANCE;
    L19:
        access$setPendingFrameContinuation$p(this, co);     // Catch: Throwable -> L33
        r8 = null;
        goto L22
    }

    public final void takeFrameRequestLocked() {
        if (this.pendingFrameContinuation != RecomposerKt.access$getFramePending$p()) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        PreconditionsKt.throwIllegalStateException("frame not pending");
    L9:
        this.pendingFrameContinuation = null;
        return;
    L5:
        value$iv = false;
        goto L7
    }

    public final Continuation<Unit> requestFrameLocked() {
        Object co = this.pendingFrameContinuation;
        if ((co instanceof Continuation) == false) goto L6;
        this.pendingFrameContinuation = RecomposerKt.access$getFramePending$p();
        return (Continuation) co;
    L6:
        if (Intrinsics.areEqual(co, RecomposerKt.access$getProduceAnotherFrame$p()) == false) goto L8;
        boolean r1 = true;
    L10:
        if (r1 == true) goto L18;
        if (co != null) goto L16;
        this.pendingFrameContinuation = RecomposerKt.access$getProduceAnotherFrame$p();
        return null;
    L16:
        throw new IllegalStateException(("invalid pendingFrameContinuation " + co).toString());
    L18:
        return null;
    L8:
        r1 = Intrinsics.areEqual(co, RecomposerKt.access$getFramePending$p());
        goto L10
    }
}
