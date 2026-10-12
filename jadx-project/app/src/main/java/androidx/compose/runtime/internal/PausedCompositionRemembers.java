package androidx.compose.runtime.internal;

import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.collection.MutableVector;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: RememberEventDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/internal/PausedCompositionRemembers;", "Landroidx/compose/runtime/RememberObserver;", "abandoning", "", "(Ljava/util/Set;)V", "pausedRemembers", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/RememberObserverHolder;", "getPausedRemembers", "()Landroidx/compose/runtime/collection/MutableVector;", "onAbandoned", "", "onForgotten", "onRemembered", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PausedCompositionRemembers implements RememberObserver {
    public static final int $stable = 0;
    private final Set<RememberObserver> abandoning;
    private final MutableVector<RememberObserverHolder> pausedRemembers;

    static {
        $stable = 8;
    }

    public PausedCompositionRemembers(Set<RememberObserver> r7) {
        this.abandoning = r7;
        this.pausedRemembers = new MutableVector(new RememberObserverHolder[16], 0);
    }

    public final MutableVector<RememberObserverHolder> getPausedRemembers() {
        return this.pausedRemembers;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        MutableVector<RememberObserverHolder> r0 = this.pausedRemembers;
        int i$iv = 0;
        Object[] content$iv = r0.content;
        int size$iv = r0.getSize();
    L3:
        if (i$iv >= size$iv) goto L6;
        RememberObserverHolder it = (RememberObserverHolder) content$iv[i$iv];
        RememberObserver wrapped = it.getWrapped();
        this.abandoning.remove(wrapped);
        wrapped.onRemembered();
        i$iv = i$iv + 1;
        goto L3
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }
}
