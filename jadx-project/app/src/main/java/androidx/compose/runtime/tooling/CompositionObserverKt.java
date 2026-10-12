package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Recomposer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CompositionObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0006H\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"observe", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "Landroidx/compose/runtime/Composition;", "observer", "Landroidx/compose/runtime/tooling/CompositionObserver;", "Landroidx/compose/runtime/RecomposeScope;", "Landroidx/compose/runtime/tooling/RecomposeScopeObserver;", "Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/tooling/CompositionRegistrationObserver;", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CompositionObserverKt {
    public static final CompositionObserverHandle observe(Recomposer $this$observe, CompositionRegistrationObserver observer) {
        return $this$observe.addCompositionRegistrationObserver$runtime_release(observer);
    }

    public static final CompositionObserverHandle observe(Composition $this$observe, CompositionObserver observer) {
        CompositionImpl r0 = (CompositionImpl) CompositionKt.getCompositionService($this$observe, CompositionKt.getCompositionImplServiceKey());
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.observe$runtime_release(observer);
    }

    public static final CompositionObserverHandle observe(RecomposeScope $this$observe, RecomposeScopeObserver observer) {
        Intrinsics.checkNotNull($this$observe, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
        return ((RecomposeScopeImpl) $this$observe).observe$runtime_release(observer);
    }
}
