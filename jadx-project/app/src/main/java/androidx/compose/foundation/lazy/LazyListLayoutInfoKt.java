package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyListLayoutInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"visibleItemsAverageSize", "", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyListLayoutInfoKt {
    public static final int visibleItemsAverageSize(LazyListLayoutInfo $this$visibleItemsAverageSize) {
        List<LazyListItemInfo> r0 = $this$visibleItemsAverageSize.getVisibleItemsInfo();
        int sum$iv = 0;
        int index$iv$iv = 0;
        int r7 = r0.size();
    L3:
        if (index$iv$iv >= r7) goto L6;
        Object item$iv$iv = r0.get(index$iv$iv);
        LazyListItemInfo it = (LazyListItemInfo) item$iv$iv;
        sum$iv = sum$iv + it.getSize();
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L6:
        return (sum$iv / r0.size()) + $this$visibleItemsAverageSize.getMainAxisItemSpacing();
    }
}
