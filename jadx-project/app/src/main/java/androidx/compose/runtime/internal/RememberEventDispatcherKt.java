package androidx.compose.runtime.internal;

import androidx.collection.MutableIntList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: RememberEventDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a(\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u00072\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\b"}, d2 = {"swap", "", "Landroidx/collection/MutableIntList;", "a", "", "b", "T", "", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RememberEventDispatcherKt {
    public static final /* synthetic */ void access$swap(MutableIntList $receiver, int a, int b) {
        swap($receiver, a, b);
    }

    public static final /* synthetic */ void access$swap(List $receiver, int a, int b) {
        swap($receiver, a, b);
    }

    private static final <T> void swap(List<T> r2, int a, int b) {
        T r0 = r2.get(a);
        r2.set(a, r2.get(b));
        r2.set(b, r0);
    }

    private static final void swap(MutableIntList $this$swap, int a, int b) {
        int item = $this$swap.get(a);
        $this$swap.set(a, $this$swap.get(b));
        $this$swap.set(b, item);
    }
}
