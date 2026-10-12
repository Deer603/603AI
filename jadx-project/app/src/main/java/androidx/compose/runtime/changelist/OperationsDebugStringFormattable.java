package androidx.compose.runtime.changelist;

import kotlin.Metadata;

/* JADX INFO: compiled from: Operations.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "", "()V", "toDebugString", "", "linePrefix", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class OperationsDebugStringFormattable {
    public static final int $stable = 0;

    static {
    }

    public abstract String toDebugString(String r1);

    public OperationsDebugStringFormattable() {
    }

    public static /* synthetic */ String toDebugString$default(OperationsDebugStringFormattable r0, String r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L7;
        r1 = "  ";
    L7:
        return r0.toDebugString(r1);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toDebugString");
    }
}
