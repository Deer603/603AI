package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: Latch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\bJ\u0006\u0010\u0010\u001a\u00020\bJ\"\u0010\u0011\u001a\u0002H\u0012\"\u0004\b\u0000\u0010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0014H\u0086\b¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/Latch;", "", "()V", "_isOpen", "", "awaiters", "", "Lkotlin/coroutines/Continuation;", "", "isOpen", "()Z", "lock", "spareList", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "closeLatch", "openLatch", "withClosed", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Latch {
    public static final int $stable = 0;
    private boolean _isOpen;
    private List<Continuation<Unit>> awaiters;
    private final Object lock;
    private List<Continuation<Unit>> spareList;

    static {
        $stable = 8;
    }

    public Latch() {
        this.lock = new Object();
        this.awaiters = new ArrayList();
        this.spareList = new ArrayList();
        this._isOpen = true;
    }

    public static final /* synthetic */ List access$getAwaiters$p(Latch $this) {
        return $this.awaiters;
    }

    public static final /* synthetic */ Object access$getLock$p(Latch $this) {
        return $this.lock;
    }

    public final boolean isOpen() {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
        boolean r3 = this._isOpen;     // Catch: Throwable -> L8
        monitor-exit(lock$iv);
        return r3;
    L8:
        th = move-exception;
        throw th;
    }

    public final <R> R withClosed(Function0<? extends R> r3) {
        closeLatch();
        R r1 = r3.invoke();     // Catch: Throwable -> L6
        openLatch();
        return r1;
    L6:
        th = move-exception;
        openLatch();
        throw th;
    }

    public final void closeLatch() {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
        this._isOpen = false;     // Catch: Throwable -> L8
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L8
        monitor-exit(lock$iv);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public final void openLatch() {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
    L15:
        th = move-exception;
        throw th;
    L6:
        if (isOpen() == false) goto L9;
        monitor-exit(lock$iv);
        return;
    L9:
        List<Continuation<Unit>> r3 = this.awaiters;     // Catch: Throwable -> L15
        this.awaiters = this.spareList;     // Catch: Throwable -> L15
        this.spareList = r3;     // Catch: Throwable -> L15
        this._isOpen = true;     // Catch: Throwable -> L15
        int i = 0;
        int r5 = r3.size();     // Catch: Throwable -> L15
    L10:
        if (i >= r5) goto L12;
        Continuation<Unit> r6 = r3.get(i);     // Catch: Throwable -> L15
        Result.Companion r7 = Result.Companion;     // Catch: Throwable -> L15
        r6.resumeWith(Result.m7425constructorimpl(Unit.INSTANCE));     // Catch: Throwable -> L15
        i = i + 1;     // Catch: Throwable -> L15
        goto L10
    L12:
        r3.clear();     // Catch: Throwable -> L15
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L15
        monitor-exit(lock$iv);
    }

    public final Object await(Continuation<? super Unit> r11) {
        if (isOpen() == true) goto L5;
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(r11), 1);
        cancellable$iv.initCancellability();
        final CancellableContinuationImpl r4 = cancellable$iv;
        Object lock$iv = access$getLock$p(this);
        monitor-enter(lock$iv);
        access$getAwaiters$p(this).add(r4);     // Catch: Throwable -> L19
        monitor-exit(lock$iv);
        r4.invokeOnCancellation(new Latch$await$2$2(this, r4));
        Object r1 = cancellable$iv.getResult();
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L15;
        DebugProbesKt.probeCoroutineSuspended(r11);
    L15:
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L18;
        return r1;
    L18:
        return Unit.INSTANCE;
    L19:
        th = move-exception;
        throw th;
    L5:
        return Unit.INSTANCE;
    }
}
