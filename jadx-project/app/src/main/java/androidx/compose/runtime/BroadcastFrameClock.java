package androidx.compose.runtime;

import androidx.compose.runtime.internal.AtomicInt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: BroadcastFrameClock.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\"B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0014\u001a\u00020\u00042\f\b\u0002\u0010\u0015\u001a\u00060\u0016j\u0002`\u0017J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\nH\u0002J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cJ(\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u0002H\u001e0 H\u0096@¢\u0006\u0002\u0010!R\u0018\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "onNewAwaiters", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "awaiters", "", "Landroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter;", "failureCause", "", "hasAwaiters", "", "getHasAwaiters", "()Z", "hasAwaitersUnlocked", "Landroidx/compose/runtime/internal/AtomicInt;", "lock", "", "spareList", "cancel", "cancellationException", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "fail", "cause", "sendFrame", "timeNanos", "", "withFrameNanos", "R", "onFrame", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "FrameAwaiter", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BroadcastFrameClock implements MonotonicFrameClock {
    public static final int $stable = 0;
    private List<FrameAwaiter<?>> awaiters;
    private Throwable failureCause;
    private final AtomicInt hasAwaitersUnlocked;
    private final Object lock;
    private final Function0<Unit> onNewAwaiters;
    private List<FrameAwaiter<?>> spareList;

    /* JADX INFO: compiled from: BroadcastFrameClock.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter;", "R", "", "onFrame", "Lkotlin/Function1;", "", "continuation", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "getContinuation", "()Lkotlin/coroutines/Continuation;", "getOnFrame", "()Lkotlin/jvm/functions/Function1;", "resume", "", "timeNanos", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class FrameAwaiter<R> {
        private final Continuation<R> continuation;
        private final Function1<Long, R> onFrame;

        /* JADX WARN: Multi-variable type inference failed */
        public FrameAwaiter(Function1<? super Long, ? extends R> r1, Continuation<? super R> r2) {
            this.onFrame = r1;
            this.continuation = r2;
        }

        public final Continuation<R> getContinuation() {
            return this.continuation;
        }

        public final Function1<Long, R> getOnFrame() {
            return this.onFrame;
        }

        public final void resume(long timeNanos) {
            Continuation<R> r0 = this.continuation;
            Result.Companion r1 = Result.Companion;     // Catch: Throwable -> L5
            Object r2 = Result.m7425constructorimpl(this.onFrame.invoke(Long.valueOf(timeNanos)));     // Catch: Throwable -> L5
        L7:
            r0.resumeWith(r2);
            return;
        L5:
            th = move-exception;
            Result.Companion r3 = Result.Companion;
            r2 = Result.m7425constructorimpl(ResultKt.createFailure(th));
            goto L7
        }
    }

    static {
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BroadcastFrameClock() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public BroadcastFrameClock(Function0<Unit> r4) {
        this.onNewAwaiters = r4;
        this.lock = new Object();
        this.awaiters = new ArrayList();
        this.spareList = new ArrayList();
        this.hasAwaitersUnlocked = new AtomicInt(0);
    }

    public /* synthetic */ BroadcastFrameClock(Function0 r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }

    public static final /* synthetic */ void access$fail(BroadcastFrameClock $this, Throwable cause) {
        $this.fail(cause);
    }

    public static final /* synthetic */ List access$getAwaiters$p(BroadcastFrameClock $this) {
        return $this.awaiters;
    }

    public static final /* synthetic */ Throwable access$getFailureCause$p(BroadcastFrameClock $this) {
        return $this.failureCause;
    }

    public static final /* synthetic */ AtomicInt access$getHasAwaitersUnlocked$p(BroadcastFrameClock $this) {
        return $this.hasAwaitersUnlocked;
    }

    public static final /* synthetic */ Object access$getLock$p(BroadcastFrameClock $this) {
        return $this.lock;
    }

    public static final /* synthetic */ Function0 access$getOnNewAwaiters$p(BroadcastFrameClock $this) {
        return $this.onNewAwaiters;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r2, Function2<? super R, ? super CoroutineContext.Element, ? extends R> r3) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r2, r3);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> r2) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, r2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> r2) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, r2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext context) {
        return MonotonicFrameClock.DefaultImpls.plus(this, context);
    }

    public final boolean getHasAwaiters() {
        if (this.hasAwaitersUnlocked.get() == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final void sendFrame(long timeNanos) {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
        List<FrameAwaiter<?>> r3 = this.awaiters;     // Catch: Throwable -> L11
        this.awaiters = this.spareList;     // Catch: Throwable -> L11
        this.spareList = r3;     // Catch: Throwable -> L11
        this.hasAwaitersUnlocked.set(0);     // Catch: Throwable -> L11
        int i = 0;
        int r5 = r3.size();     // Catch: Throwable -> L11
    L6:
        if (i >= r5) goto L8;
        r3.get(i).resume(timeNanos);     // Catch: Throwable -> L11
        i = i + 1;     // Catch: Throwable -> L11
        goto L6
    L8:
        r3.clear();     // Catch: Throwable -> L11
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L11
        monitor-exit(lock$iv);
        return;
    L11:
        th = move-exception;
        throw th;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> Object withFrameNanos(Function1<? super Long, ? extends R> r17, Continuation<? super R> r18) {
        boolean hasNewAwaiters = true;
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(r18), 1);
        cancellable$iv.initCancellability();
        CancellableContinuationImpl co = cancellable$iv;
        final FrameAwaiter awaiter = new FrameAwaiter(r17, co);
        Object lock$iv = access$getLock$p(this);
        monitor-enter(lock$iv);
        Throwable cause = access$getFailureCause$p(this);     // Catch: Throwable -> L35
        if (cause == null) goto L11;
        Result.Companion r14 = Result.Companion;     // Catch: Throwable -> L35
        co.resumeWith(Result.m7425constructorimpl(ResultKt.createFailure(cause)));     // Catch: Throwable -> L35
        monitor-exit(lock$iv);
    L30:
        Object r0 = cancellable$iv.getResult();
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L34;
        DebugProbesKt.probeCoroutineSuspended(r18);
    L34:
        return r0;
    L11:
        if (access$getAwaiters$p(this).isEmpty() == true) goto L13;
        boolean hadAwaiters = true;
    L14:
        access$getAwaiters$p(this).add(awaiter);     // Catch: Throwable -> L35
        if (hadAwaiters == true) goto L17;
        access$getHasAwaitersUnlocked$p(this).set(1);     // Catch: Throwable -> L35
    L17:
        if (hadAwaiters == false) goto L20;
        hasNewAwaiters = false;
    L20:
        monitor-exit(lock$iv);
        co.invokeOnCancellation(new BroadcastFrameClock$withFrameNanos$2$1(this, awaiter));
        if (hasNewAwaiters == false) goto L30;
        if (access$getOnNewAwaiters$p(this) == null) goto L30;
        access$getOnNewAwaiters$p(this).invoke();     // Catch: Throwable -> L27
    L27:
        t = move-exception;
        access$fail(this, t);
        goto L30
    L13:
        hadAwaiters = false;
    L35:
        th = move-exception;
        throw th;
    }

    private final void fail(Throwable cause) {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
    L15:
        th = move-exception;
        throw th;
    L6:
        if (this.failureCause == null) goto L9;
        monitor-exit(lock$iv);
        return;
    L9:
        this.failureCause = cause;     // Catch: Throwable -> L15
        List<FrameAwaiter<?>> r3 = this.awaiters;     // Catch: Throwable -> L15
        int index$iv = 0;
        int r6 = r3.size();     // Catch: Throwable -> L15
    L10:
        if (index$iv >= r6) goto L12;
        Object item$iv = r3.get(index$iv);     // Catch: Throwable -> L15
        Continuation<?> r10 = ((FrameAwaiter) item$iv).getContinuation();     // Catch: Throwable -> L15
        Result.Companion r11 = Result.Companion;     // Catch: Throwable -> L15
        r10.resumeWith(Result.m7425constructorimpl(ResultKt.createFailure(cause)));     // Catch: Throwable -> L15
        index$iv = index$iv + 1;     // Catch: Throwable -> L15
        goto L10
    L12:
        this.awaiters.clear();     // Catch: Throwable -> L15
        this.hasAwaitersUnlocked.set(0);     // Catch: Throwable -> L15
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L15
        monitor-exit(lock$iv);
    }

    public static /* synthetic */ void cancel$default(BroadcastFrameClock r0, CancellationException r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = new CancellationException("clock cancelled");
    L5:
        r0.cancel(r1);
    }

    public final void cancel(CancellationException cancellationException) {
        fail(cancellationException);
    }
}
