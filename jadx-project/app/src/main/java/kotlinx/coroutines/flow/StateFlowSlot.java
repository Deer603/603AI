package kotlinx.coroutines.flow;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.internal.Concurrent_commonKt;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u000e\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ'\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00100\u000f2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\fJ\u0006\u0010\u0013\u001a\u00020\tR\"\u0010\u0004\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowSlot;", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "Lkotlinx/coroutines/flow/StateFlowImpl;", "()V", "_state", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Lkotlinx/coroutines/internal/WorkaroundAtomicReference;", "allocateLocked", "", "flow", "awaitPending", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "freeLocked", "", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/flow/StateFlowImpl;)[Lkotlin/coroutines/Continuation;", "makePending", "takePending", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class StateFlowSlot extends AbstractSharedFlowSlot<StateFlowImpl<?>> {
    private final AtomicReference<Object> _state;

    public StateFlowSlot() {
        this._state = new AtomicReference(null);
    }

    public static final /* synthetic */ AtomicReference access$get_state$p(StateFlowSlot $this) {
        return $this._state;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public /* bridge */ /* synthetic */ boolean allocateLocked(StateFlowImpl<?> r2) {
        return allocateLocked2(r2);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public /* bridge */ /* synthetic */ Continuation[] freeLocked(StateFlowImpl<?> r2) {
        return freeLocked2(r2);
    }

    /* JADX INFO: renamed from: allocateLocked, reason: avoid collision after fix types in other method */
    public boolean allocateLocked2(StateFlowImpl<?> r3) {
        if (Concurrent_commonKt.getValue(this._state) == null) goto L6;
        return false;
    L6:
        Concurrent_commonKt.setValue(this._state, StateFlowKt.access$getNONE$p());
        return true;
    }

    /* JADX INFO: renamed from: freeLocked, reason: avoid collision after fix types in other method */
    public Continuation<Unit>[] freeLocked2(StateFlowImpl<?> r3) {
        Concurrent_commonKt.setValue(this._state, null);
        return AbstractSharedFlowKt.EMPTY_RESUMES;
    }

    public final void makePending() {
        AtomicReference<Object> r0 = this._state;
    L3:
        Object state = Concurrent_commonKt.getValue(r0);
        if (state == null) goto L5;
        if (state == StateFlowKt.access$getPENDING$p()) goto L8;
        Symbol r5 = StateFlowKt.access$getNONE$p();
        AtomicReference<Object> r6 = this._state;
        if (state == r5) goto L12;
        if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(r6, state, StateFlowKt.access$getNONE$p()) == false) goto L3;
        Result.Companion r7 = Result.Companion;
        ((CancellableContinuationImpl) state).resumeWith(Result.m7425constructorimpl(Unit.INSTANCE));
        return;
    L12:
        if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(r6, state, StateFlowKt.access$getPENDING$p()) == false) goto L3;
        return;
    L8:
        return;
    }

    public final boolean takePending() {
        Object state = this._state.getAndSet(StateFlowKt.access$getNONE$p());
        Intrinsics.checkNotNull(state);
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L10;
        if ((state instanceof CancellableContinuationImpl) == false) goto L10;
        throw new AssertionError();
    L10:
        if (state != StateFlowKt.access$getPENDING$p()) goto L12;
        return true;
    L12:
        return false;
    }

    public final Object awaitPending(Continuation<? super Unit> r11) {
        boolean r5 = true;
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(r11), 1);
        cancellable$iv.initCancellability();
        CancellableContinuationImpl cont = cancellable$iv;
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L10;
        if ((Concurrent_commonKt.getValue(access$get_state$p(this)) instanceof CancellableContinuationImpl) == false) goto L10;
        throw new AssertionError();
    L10:
        if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(access$get_state$p(this), StateFlowKt.access$getNONE$p(), cont) == false) goto L12;
    L22:
        Object r1 = cancellable$iv.getResult();
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L26;
        DebugProbesKt.probeCoroutineSuspended(r11);
    L26:
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L29;
        return r1;
    L29:
        return Unit.INSTANCE;
    L12:
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L14;
    L21:
        Result.Companion r7 = Result.Companion;
        cont.resumeWith(Result.m7425constructorimpl(Unit.INSTANCE));
        goto L22
    L14:
        if (Concurrent_commonKt.getValue(access$get_state$p(this)) == StateFlowKt.access$getPENDING$p()) goto L17;
        r5 = false;
    L17:
        if (r5 == true) goto L21;
        throw new AssertionError();
    }
}
