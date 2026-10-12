package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

/* JADX INFO: compiled from: CoroutineScope.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b\u001a\u0006\u0010\t\u001a\u00020\u0002\u001aJ\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r¢\u0006\u0002\b\u0010H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0011\u001a\u000e\u0010\u0012\u001a\u00020\bH\u0086H¢\u0006\u0002\u0010\u0013\u001a\u001e\u0010\u0014\u001a\u00020\u0015*\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020\u00022\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b\u001a\n\u0010\u001c\u001a\u00020\u0015*\u00020\u0002\u001a\u0015\u0010\u001d\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002\"\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0000\u0010\u0005¨\u0006\u001e"}, d2 = {"isActive", "", "Lkotlinx/coroutines/CoroutineScope;", "isActive$annotations", "(Lkotlinx/coroutines/CoroutineScope;)V", "(Lkotlinx/coroutines/CoroutineScope;)Z", "CoroutineScope", "context", "Lkotlin/coroutines/CoroutineContext;", "MainScope", "coroutineScope", "R", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currentCoroutineContext", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "", "message", "", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "ensureActive", "plus", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CoroutineScopeKt {
    public static /* synthetic */ void isActive$annotations(CoroutineScope r0) {
    }

    public static final CoroutineScope plus(CoroutineScope $this$plus, CoroutineContext context) {
        return new ContextScope($this$plus.getCoroutineContext().plus(context));
    }

    public static final CoroutineScope MainScope() {
        return new ContextScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getMain()));
    }

    public static final boolean isActive(CoroutineScope $this$isActive) {
        Job r0 = (Job) $this$isActive.getCoroutineContext().get(Job.Key);
        if (r0 != null) goto L7;
        return true;
    L7:
        return r0.isActive();
    }

    public static final <R> Object coroutineScope(Function2<? super CoroutineScope, ? super Continuation<? super R>, ? extends Object> r4, Continuation<? super R> r5) {
        ScopeCoroutine coroutine = new ScopeCoroutine(r5.getContext(), r5);
        Object r0 = UndispatchedKt.startUndispatchedOrReturn(coroutine, coroutine, r4);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L5;
        DebugProbesKt.probeCoroutineSuspended(r5);
    L5:
        return r0;
    }

    public static final CoroutineScope CoroutineScope(CoroutineContext context) {
        if (context.get(Job.Key) == null) goto L5;
        CoroutineContext r1 = context;
    L7:
        return new ContextScope(r1);
    L5:
        r1 = context.plus(JobKt.Job$default(null, 1, null));
        goto L7
    }

    public static /* synthetic */ void cancel$default(CoroutineScope r0, CancellationException r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        cancel(r0, r1);
    }

    public static final void cancel(CoroutineScope $this$cancel, CancellationException cause) {
        Job job = (Job) $this$cancel.getCoroutineContext().get(Job.Key);
        if (job == null) goto L7;
        job.cancel(cause);
        return;
    L7:
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + $this$cancel).toString());
    }

    public static final void cancel(CoroutineScope $this$cancel, String message, Throwable cause) {
        cancel($this$cancel, ExceptionsKt.CancellationException(message, cause));
    }

    public static /* synthetic */ void cancel$default(CoroutineScope r0, String r1, Throwable r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        cancel(r0, r1, r2);
    }

    public static final void ensureActive(CoroutineScope $this$ensureActive) {
        JobKt.ensureActive($this$ensureActive.getCoroutineContext());
    }

    public static final Object currentCoroutineContext(Continuation<? super CoroutineContext> r2) {
        return r2.getContext();
    }

    private static final Object currentCoroutineContext$$forInline(Continuation<? super CoroutineContext> r0) {
        Continuation $completion = null;
        $completion.getContext();
        throw null;
    }
}
