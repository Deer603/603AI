package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LazyLayoutItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0000¨\u0006\u0006"}, d2 = {"findIndexByKey", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "key", "", "lastKnownIndex", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyLayoutItemProviderKt {
    public static final int findIndexByKey(LazyLayoutItemProvider $this$findIndexByKey, Object key, int lastKnownIndex) {
        if (key != null) goto L4;
    L15:
        return lastKnownIndex;
    L4:
        if ($this$findIndexByKey.getItemCount() == 0) goto L15;
        if (lastKnownIndex < $this$findIndexByKey.getItemCount()) goto L9;
    L11:
        int newIndex = $this$findIndexByKey.getIndex(key);
        if (newIndex == (-1)) goto L14;
        return newIndex;
    L14:
        return lastKnownIndex;
    L9:
        if (Intrinsics.areEqual(key, $this$findIndexByKey.getKey(lastKnownIndex)) == false) goto L11;
        return lastKnownIndex;
    }
}
