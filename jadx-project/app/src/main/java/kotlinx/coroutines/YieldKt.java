package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

/* JADX INFO: compiled from: Yield.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u0001H\u0086@¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"yield", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class YieldKt {
    public static final Object yield(Continuation<? super Unit> r7) {
        CoroutineContext context = r7.getContext();
        JobKt.ensureActive(context);
        Continuation r3 = IntrinsicsKt.intercepted(r7);
        if ((r3 instanceof DispatchedContinuation) == false) goto L5;
        DispatchedContinuation cont = (DispatchedContinuation) r3;
    L6:
        if (cont != null) goto L9;
        Object r4 = Unit.INSTANCE;
    L20:
        if (r4 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L23;
        DebugProbesKt.probeCoroutineSuspended(r7);
    L23:
        if (r4 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L26;
        return r4;
    L26:
        return Unit.INSTANCE;
    L9:
        if (cont.dispatcher.isDispatchNeeded(context) == false) goto L11;
        cont.dispatchYield$kotlinx_coroutines_core(context, Unit.INSTANCE);
    L18:
        r4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        goto L20
    L11:
        YieldContext yieldContext = new YieldContext();
        cont.dispatchYield$kotlinx_coroutines_core(context.plus(yieldContext), Unit.INSTANCE);
        if (yieldContext.dispatcherWasUnconfined == false) goto L18;
        if (DispatchedContinuationKt.yieldUndispatched(cont) == false) goto L16;
        Object r5 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
    L17:
        r4 = r5;
        goto L20
    L16:
        r5 = Unit.INSTANCE;
        goto L17
    L5:
        cont = null;
        goto L6
    }
}
