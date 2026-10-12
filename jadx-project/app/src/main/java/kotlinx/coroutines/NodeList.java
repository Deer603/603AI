package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\r\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/NodeList;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "Lkotlinx/coroutines/Incomplete;", "()V", "isActive", "", "()Z", "list", "getList", "()Lkotlinx/coroutines/NodeList;", "getString", "", "state", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NodeList extends LockFreeLinkedListHead implements Incomplete {
    public NodeList() {
    }

    @Override // kotlinx.coroutines.Incomplete
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.Incomplete
    public NodeList getList() {
        return this;
    }

    public final String getString(String state) {
        StringBuilder $this$getString_u24lambda_u241 = new StringBuilder();
        $this$getString_u24lambda_u241.append("List{");
        $this$getString_u24lambda_u241.append(state);
        $this$getString_u24lambda_u241.append("}[");
        boolean first = true;
        NodeList this_$iv = this;
        Object r6 = this_$iv.getNext();
        Intrinsics.checkNotNull(r6, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        LockFreeLinkedListNode cur$iv = (LockFreeLinkedListNode) r6;
    L4:
        if (Intrinsics.areEqual(cur$iv, this_$iv) == true) goto L13;
        if ((cur$iv instanceof JobNode) == false) goto L12;
        JobNode node = (JobNode) cur$iv;
        if (first == false) goto L10;
        first = false;
    L11:
        $this$getString_u24lambda_u241.append(node);
        goto L12
    L10:
        $this$getString_u24lambda_u241.append(", ");
    L12:
        cur$iv = cur$iv.getNextNode();
        goto L4
    L13:
        $this$getString_u24lambda_u241.append("]");
        String r0 = $this$getString_u24lambda_u241.toString();
        Intrinsics.checkNotNullExpressionValue(r0, "toString(...)");
        return r0;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public String toString() {
        if (DebugKt.getDEBUG() == false) goto L6;
        return getString("Active");
    L6:
        return super.toString();
    }
}
