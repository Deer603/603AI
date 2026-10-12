package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyLayoutPrefetchState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006\t"}, d2 = {"TraversablePrefetchStateNodeKey", "", "ZeroConstraints", "Landroidx/compose/ui/unit/Constraints;", "J", "traversablePrefetchState", "Landroidx/compose/ui/Modifier;", "lazyLayoutPrefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyLayoutPrefetchStateKt {
    private static final String TraversablePrefetchStateNodeKey = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode";
    private static final long ZeroConstraints = 0;

    public static final /* synthetic */ long access$getZeroConstraints$p() {
        return ZeroConstraints;
    }

    public static final Modifier traversablePrefetchState(Modifier $this$traversablePrefetchState, LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        if (lazyLayoutPrefetchState == null) goto L6;
        Modifier r0 = $this$traversablePrefetchState.then(new TraversablePrefetchStateModifierElement(lazyLayoutPrefetchState));
        if (r0 == null) goto L6;
        return r0;
    L6:
        return $this$traversablePrefetchState;
    }

    static {
        ZeroConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 5, null);
    }
}
