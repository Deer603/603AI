package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ThreadContextElement;

/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0000\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"$\u0010\u0002\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\",\u0010\u0006\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\" \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"NO_THREAD_ELEMENTS", "Lkotlinx/coroutines/internal/Symbol;", "countAll", "Lkotlin/Function2;", "", "Lkotlin/coroutines/CoroutineContext$Element;", "findOne", "Lkotlinx/coroutines/ThreadContextElement;", "updateState", "Lkotlinx/coroutines/internal/ThreadState;", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "threadContextElements", "updateThreadContext", "countOrElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ThreadContextKt {
    public static final Symbol NO_THREAD_ELEMENTS = null;
    private static final Function2<Object, CoroutineContext.Element, Object> countAll = null;
    private static final Function2<ThreadContextElement<?>, CoroutineContext.Element, ThreadContextElement<?>> findOne = null;
    private static final Function2<ThreadState, CoroutineContext.Element, ThreadState> updateState = null;

    static {
        NO_THREAD_ELEMENTS = new Symbol("NO_THREAD_ELEMENTS");
        countAll = ThreadContextKt$countAll$1.INSTANCE;
        findOne = ThreadContextKt$findOne$1.INSTANCE;
        updateState = ThreadContextKt$updateState$1.INSTANCE;
    }

    public static final Object threadContextElements(CoroutineContext context) {
        Object r0 = context.fold(0, countAll);
        Intrinsics.checkNotNull(r0);
        return r0;
    }

    public static final Object updateThreadContext(CoroutineContext context, Object countOrElement) {
        if (countOrElement != null) goto L4;
        Object countOrElement2 = threadContextElements(context);
    L6:
        if (countOrElement2 != 0) goto L9;
        return NO_THREAD_ELEMENTS;
    L9:
        if ((countOrElement2 instanceof Integer) == true) goto L14;
        Intrinsics.checkNotNull(countOrElement2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ThreadContextElement element = (ThreadContextElement) countOrElement2;
        return element.updateThreadContext(context);
    L14:
        return context.fold(new ThreadState(context, ((Number) countOrElement2).intValue()), updateState);
    L4:
        countOrElement2 = countOrElement;
        goto L6
    }

    public static final void restoreThreadContext(CoroutineContext context, Object oldState) {
        if (oldState != NO_THREAD_ELEMENTS) goto L6;
        return;
    L6:
        if ((oldState instanceof ThreadState) == false) goto L8;
        ((ThreadState) oldState).restore(context);
        return;
    L8:
        Object r0 = context.fold(null, findOne);
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ThreadContextElement element = (ThreadContextElement) r0;
        element.restoreThreadContext(context, oldState);
    }
}
