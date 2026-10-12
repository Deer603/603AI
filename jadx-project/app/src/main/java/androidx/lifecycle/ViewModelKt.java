package androidx.lifecycle;

import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScopeKt;
import androidx.lifecycle.viewmodel.internal.SynchronizedObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/lifecycle/ViewModel;", "getViewModelScope", "(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;", "VIEW_MODEL_SCOPE_LOCK", "Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;", "lifecycle-viewmodel_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ViewModelKt {
    private static final SynchronizedObject VIEW_MODEL_SCOPE_LOCK = null;

    public static final CoroutineScope getViewModelScope(ViewModel $this$viewModelScope) {
        Intrinsics.checkNotNullParameter($this$viewModelScope, "<this>");
        SynchronizedObject lock$iv = VIEW_MODEL_SCOPE_LOCK;
        monitor-enter(lock$iv);
        CloseableCoroutineScope scope = (CloseableCoroutineScope) $this$viewModelScope.getCloseable(CloseableCoroutineScopeKt.VIEW_MODEL_SCOPE_KEY);     // Catch: Throwable -> L12
        if (scope != null) goto L9;
        scope = CloseableCoroutineScopeKt.createViewModelScope();     // Catch: Throwable -> L12
        $this$viewModelScope.addCloseable(CloseableCoroutineScopeKt.VIEW_MODEL_SCOPE_KEY, scope);     // Catch: Throwable -> L12
    L9:
        monitor-exit(lock$iv);
        return scope;
    L12:
        th = move-exception;
        throw th;
    }

    static {
        VIEW_MODEL_SCOPE_LOCK = new SynchronizedObject();
    }
}
