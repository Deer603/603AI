package androidx.lifecycle.viewmodel.internal;

import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: compiled from: CloseableCoroutineScope.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0005H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"VIEW_MODEL_SCOPE_KEY", "", "createViewModelScope", "Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "asCloseable", "Lkotlinx/coroutines/CoroutineScope;", "lifecycle-viewmodel_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CloseableCoroutineScopeKt {
    public static final String VIEW_MODEL_SCOPE_KEY = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY";

    public static final CloseableCoroutineScope createViewModelScope() {
        MainCoroutineDispatcher dispatcher = Dispatchers.getMain().getImmediate();     // Catch: IllegalStateException -> L4 NotImplementedError -> L6
    L9:
        return new CloseableCoroutineScope(dispatcher.plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
    L5:
        dispatcher = EmptyCoroutineContext.INSTANCE;
    L7:
        dispatcher = EmptyCoroutineContext.INSTANCE;
        goto L9
    }

    public static final CloseableCoroutineScope asCloseable(CoroutineScope $this$asCloseable) {
        Intrinsics.checkNotNullParameter($this$asCloseable, "<this>");
        return new CloseableCoroutineScope($this$asCloseable);
    }
}
