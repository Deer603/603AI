package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0007\u001a6\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\t\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a2\u0010\u0011\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00050\u0013H\u0086\b¢\u0006\u0002\u0010\u0014\u001a-\u0010\u0015\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00050\u0013H\u0086\b\u001a2\u0010\u0017\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00050\u0013H\u0086\b¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"NONE", "Lkotlinx/coroutines/internal/Symbol;", "PENDING", "MutableStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "T", "value", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;", "fuseStateFlow", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/StateFlow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "getAndUpdate", "function", "Lkotlin/Function1;", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "update", "", "updateAndGet", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class StateFlowKt {
    private static final Symbol NONE = null;
    private static final Symbol PENDING = null;

    public static final /* synthetic */ Symbol access$getNONE$p() {
        return NONE;
    }

    public static final /* synthetic */ Symbol access$getPENDING$p() {
        return PENDING;
    }

    public static final <T> MutableStateFlow<T> MutableStateFlow(T r2) {
        if (r2 != null) goto L5;
        Object r1 = NullSurrogateKt.NULL;
    L7:
        return new StateFlowImpl(r1);
    L5:
        r1 = r2;
        goto L7
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T updateAndGet(MutableStateFlow<T> r4, Function1<? super T, ? extends T> r5) {
    L3:
        Object prevValue = r4.getValue();
        T r2 = r5.invoke(prevValue);
        if (r4.compareAndSet(prevValue, r2) == false) goto L3;
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
    public static final <T> T getAndUpdate(MutableStateFlow<T> r4, Function1<? super T, ? extends T> r5) {
    L3:
        ?? r1 = (Object) r4.getValue();
        if (r4.compareAndSet(r1, r5.invoke(r1)) == false) goto L3;
        return r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void update(MutableStateFlow<T> r4, Function1<? super T, ? extends T> r5) {
    L3:
        Object prevValue = r4.getValue();
        if (r4.compareAndSet(prevValue, r5.invoke(prevValue)) == false) goto L3;
    }

    static {
        NONE = new Symbol("NONE");
        PENDING = new Symbol("PENDING");
    }

    public static final <T> Flow<T> fuseStateFlow(StateFlow<? extends T> r4, CoroutineContext context, int capacity, BufferOverflow onBufferOverflow) {
        boolean r1 = true;
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L5;
    L12:
        if (capacity >= 0) goto L14;
    L16:
        r1 = false;
    L17:
        if (r1 == true) goto L21;
        if (capacity == (-2)) goto L21;
    L25:
        return SharedFlowKt.fuseSharedFlow(r4, context, capacity, onBufferOverflow);
    L21:
        if (onBufferOverflow != BufferOverflow.DROP_OLDEST) goto L25;
        return r4;
    L14:
        if (capacity >= 2) goto L16;
    L5:
        if (capacity == (-1)) goto L7;
        int r0 = 1;
    L8:
        if (r0 != 0) goto L12;
        throw new AssertionError();
    L7:
        r0 = 0;
        goto L8
    }
}
