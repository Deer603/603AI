package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.DisposableHandle;

/* JADX INFO: compiled from: OnTimeout.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0002R\u0017\u0010\u0005\u001a\u00020\u00068F¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/selects/OnTimeout;", "", "timeMillis", "", "(J)V", "selectClause", "Lkotlinx/coroutines/selects/SelectClause0;", "getSelectClause$annotations", "()V", "getSelectClause", "()Lkotlinx/coroutines/selects/SelectClause0;", "register", "", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "ignoredParam", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class OnTimeout {
    private final long timeMillis;

    public static /* synthetic */ void getSelectClause$annotations() {
    }

    public OnTimeout(long timeMillis) {
        this.timeMillis = timeMillis;
    }

    public static final /* synthetic */ void access$register(OnTimeout $this, SelectInstance select, Object ignoredParam) {
        $this.register(select, ignoredParam);
    }

    public final SelectClause0 getSelectClause() {
        OnTimeout$selectClause$1 r1 = OnTimeout$selectClause$1.INSTANCE;
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new SelectClause0Impl(this, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r1, 3), null, 4, null);
    }

    private final void register(final SelectInstance<?> r6, Object ignoredParam) {
        if (this.timeMillis > 0) goto L6;
        r6.selectInRegistrationPhase(Unit.INSTANCE);
        return;
    L6:
        Runnable action = new OnTimeout$register$$inlined$Runnable$1(r6, this);
        Intrinsics.checkNotNull(r6, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        SelectImplementation r0 = (SelectImplementation) r6;
        CoroutineContext context = r6.getContext();
        DisposableHandle disposableHandle = DelayKt.getDelay(context).invokeOnTimeout(this.timeMillis, action, context);
        r6.disposeOnCompletion(disposableHandle);
    }
}
