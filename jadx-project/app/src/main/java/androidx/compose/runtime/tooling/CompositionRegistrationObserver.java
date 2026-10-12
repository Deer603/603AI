package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.Recomposer;
import kotlin.Metadata;

/* JADX INFO: compiled from: CompositionObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/tooling/CompositionRegistrationObserver;", "", "onCompositionRegistered", "", "recomposer", "Landroidx/compose/runtime/Recomposer;", "composition", "Landroidx/compose/runtime/Composition;", "onCompositionUnregistered", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface CompositionRegistrationObserver {
    void onCompositionRegistered(Recomposer r1, Composition r2);

    void onCompositionUnregistered(Recomposer r1, Composition r2);
}
