package androidx.compose.foundation.lazy;

import kotlin.Metadata;

/* JADX INFO: compiled from: LazyListPrefetchStrategy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"LazyListPrefetchStrategy", "Landroidx/compose/foundation/lazy/LazyListPrefetchStrategy;", "nestedPrefetchItemCount", "", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyListPrefetchStrategyKt {
    public static /* synthetic */ LazyListPrefetchStrategy LazyListPrefetchStrategy$default(int r0, int r1, Object r2) {
        if ((r1 & 1) == 0) goto L6;
        r0 = 2;
    L6:
        return LazyListPrefetchStrategy(r0);
    }

    public static final LazyListPrefetchStrategy LazyListPrefetchStrategy(int nestedPrefetchItemCount) {
        return new DefaultLazyListPrefetchStrategy(nestedPrefetchItemCount);
    }
}
