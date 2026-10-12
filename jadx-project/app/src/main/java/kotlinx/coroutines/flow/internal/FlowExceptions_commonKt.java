package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;

/* JADX INFO: compiled from: FlowExceptions.common.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0081\b\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, d2 = {"checkIndexOverflow", "", "index", "checkOwnership", "", "Lkotlinx/coroutines/flow/internal/AbortFlowException;", "owner", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FlowExceptions_commonKt {
    public static final void checkOwnership(AbortFlowException $this$checkOwnership, Object owner) {
        if ($this$checkOwnership.owner != owner) goto L5;
        return;
    L5:
        throw $this$checkOwnership;
    }

    public static final int checkIndexOverflow(int index) {
        if (index < 0) goto L6;
        return index;
    L6:
        throw new ArithmeticException("Index overflow has happened");
    }
}
