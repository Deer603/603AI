package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0012B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/RememberedCoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/runtime/RememberObserver;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "overlayContext", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)V", "_coroutineContext", "coroutineContext", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "lock", "", "cancelIfCreated", "", "onAbandoned", "onForgotten", "onRemembered", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RememberedCoroutineScope implements CoroutineScope, RememberObserver {
    public static final int $stable = 0;
    public static final CoroutineContext CancelledCoroutineContext = null;
    public static final Companion Companion = null;
    private volatile CoroutineContext _coroutineContext;
    private final Object lock;
    private final CoroutineContext overlayContext;
    private final CoroutineContext parentContext;

    /* JADX INFO: compiled from: Effects.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/RememberedCoroutineScope$Companion;", "", "()V", "CancelledCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    public RememberedCoroutineScope(CoroutineContext parentContext, CoroutineContext overlayContext) {
        this.parentContext = parentContext;
        this.overlayContext = overlayContext;
        this.lock = this;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        CoroutineContext r0 = this._coroutineContext;
        if (r0 != null) goto L5;
    L6:
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
        r0 = this._coroutineContext;     // Catch: Throwable -> L19
        if (r0 != null) goto L13;
        CoroutineContext parentContext = this.parentContext;     // Catch: Throwable -> L19
        CompletableJob childJob = JobKt.Job((Job) parentContext.get(Job.Key));     // Catch: Throwable -> L19
        r0 = parentContext.plus(childJob).plus(this.overlayContext);     // Catch: Throwable -> L19
    L15:
        this._coroutineContext = r0;     // Catch: Throwable -> L19
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L19
        monitor-exit(lock$iv);
    L17:
        Intrinsics.checkNotNull(r0);
        return r0;
    L13:
        if (r0 != CancelledCoroutineContext) goto L15;
        CoroutineContext parentContext2 = this.parentContext;     // Catch: Throwable -> L19
        CompletableJob $this$_get_coroutineContext__u24lambda_u241_u24lambda_u240 = JobKt.Job((Job) parentContext2.get(Job.Key));     // Catch: Throwable -> L19
        $this$_get_coroutineContext__u24lambda_u241_u24lambda_u240.cancel(new ForgottenCoroutineScopeException());     // Catch: Throwable -> L19
        r0 = parentContext2.plus($this$_get_coroutineContext__u24lambda_u241_u24lambda_u240).plus(this.overlayContext);     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        throw th;
    L5:
        if (r0 != CancelledCoroutineContext) goto L17;
        goto L6
    }

    public final void cancelIfCreated() {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
        CoroutineContext context = this._coroutineContext;     // Catch: Throwable -> L12
        if (context != null) goto L8;
        this._coroutineContext = CancelledCoroutineContext;     // Catch: Throwable -> L12
    L9:
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L12
        monitor-exit(lock$iv);
        return;
    L8:
        JobKt.cancel(context, new ForgottenCoroutineScopeException());     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        cancelIfCreated();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        cancelIfCreated();
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        CancelledCoroutineContext = new CancelledCoroutineContext();
    }
}
