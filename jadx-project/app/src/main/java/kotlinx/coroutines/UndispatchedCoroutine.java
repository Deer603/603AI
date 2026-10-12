package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0014J\u0006\u0010\u0011\u001a\u00020\tJ\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\rR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\r0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/UndispatchedCoroutine;", "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "context", "Lkotlin/coroutines/CoroutineContext;", "uCont", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "threadLocalIsSet", "", "threadStateToRecover", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", "", "afterResume", "", "state", "clearThreadContext", "saveThreadContext", "oldValue", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UndispatchedCoroutine<T> extends ScopeCoroutine<T> {
    private volatile boolean threadLocalIsSet;
    private final ThreadLocal<Pair<CoroutineContext, Object>> threadStateToRecover;

    public UndispatchedCoroutine(CoroutineContext context, Continuation<? super T> r4) {
        if (context.get(UndispatchedMarker.INSTANCE) != null) goto L5;
        CoroutineContext r0 = context.plus(UndispatchedMarker.INSTANCE);
    L6:
        super(r0, r4);
        this.threadStateToRecover = new ThreadLocal();
        if ((r4.getContext().get(ContinuationInterceptor.Key) instanceof CoroutineDispatcher) == true) goto L11;
        Object values = ThreadContextKt.updateThreadContext(context, null);
        ThreadContextKt.restoreThreadContext(context, values);
        saveThreadContext(context, values);
        return;
    L11:
        return;
    L5:
        r0 = context;
        goto L6
    }

    public final void saveThreadContext(CoroutineContext context, Object oldValue) {
        this.threadLocalIsSet = true;
        this.threadStateToRecover.set(TuplesKt.to(context, oldValue));
    }

    public final boolean clearThreadContext() {
        if (this.threadLocalIsSet == true) goto L5;
    L7:
        boolean r0 = false;
    L8:
        this.threadStateToRecover.remove();
        return !r0;
    L5:
        if (this.threadStateToRecover.get() != null) goto L7;
        r0 = true;
        goto L8
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    protected void afterResume(Object state) {
        if (this.threadLocalIsSet == false) goto L8;
        Pair<CoroutineContext, Object> r0 = this.threadStateToRecover.get();
        if (r0 == null) goto L7;
        CoroutineContext ctx = r0.component1();
        Object value = r0.component2();
        ThreadContextKt.restoreThreadContext(ctx, value);
    L7:
        this.threadStateToRecover.remove();
    L8:
        Object result = CompletionStateKt.recoverResult(state, this.uCont);
        Continuation<T> r1 = this.uCont;
        CoroutineContext context$iv = r1.getContext();
        Object oldValue$iv = ThreadContextKt.updateThreadContext(context$iv, null);
        if (oldValue$iv == ThreadContextKt.NO_THREAD_ELEMENTS) goto L11;
        UndispatchedCoroutine<?> r6 = CoroutineContextKt.updateUndispatchedCompletion(r1, context$iv, oldValue$iv);
    L26:
        this.uCont.resumeWith(result);     // Catch: Throwable -> L20
        Unit r7 = Unit.INSTANCE;     // Catch: Throwable -> L20
        if (r6 != null) goto L16;
    L17:
        ThreadContextKt.restoreThreadContext(context$iv, oldValue$iv);
        return;
    L16:
        if (r6.clearThreadContext() == true) goto L17;
        return;
    L20:
        th = move-exception;
        if (r6 != null) goto L23;
    L24:
        ThreadContextKt.restoreThreadContext(context$iv, oldValue$iv);
    L25:
        throw th;
    L23:
        if (r6.clearThreadContext() == false) goto L25;
    L11:
        r6 = null;
        goto L26
    }
}
