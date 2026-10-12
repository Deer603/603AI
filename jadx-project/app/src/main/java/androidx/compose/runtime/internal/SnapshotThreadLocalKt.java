package androidx.compose.runtime.internal;

import kotlin.Metadata;

/* JADX INFO: compiled from: SnapshotThreadLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0002"}, d2 = {"emptyThreadMap", "Landroidx/compose/runtime/internal/ThreadMap;", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SnapshotThreadLocalKt {
    private static final ThreadMap emptyThreadMap = null;

    public static final /* synthetic */ ThreadMap access$getEmptyThreadMap$p() {
        return emptyThreadMap;
    }

    static {
        emptyThreadMap = new ThreadMap(0, new long[0], new Object[0]);
    }
}
