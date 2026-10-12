package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Result;

/* JADX INFO: compiled from: CompletableDeferred.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002¢\u0006\u0002\u0010\u0004\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a)\u0010\u0007\u001a\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\n¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"CompletableDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "T", "value", "(Ljava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;", "parent", "Lkotlinx/coroutines/Job;", "completeWith", "", "result", "Lkotlin/Result;", "(Lkotlinx/coroutines/CompletableDeferred;Ljava/lang/Object;)Z", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CompletableDeferredKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean completeWith(CompletableDeferred<T> r2, Object r3) {
        Throwable it = Result.m7428exceptionOrNullimpl(r3);
        if (it != null) goto L6;
        return r2.complete(r3);
    L6:
        return r2.completeExceptionally(it);
    }

    public static final <T> CompletableDeferred<T> CompletableDeferred(Job parent) {
        return new CompletableDeferredImpl(parent);
    }

    public static /* synthetic */ CompletableDeferred CompletableDeferred$default(Job r0, int r1, Object r2) {
        if ((r1 & 1) == 0) goto L6;
        r0 = null;
    L6:
        return CompletableDeferred(r0);
    }

    public static final <T> CompletableDeferred<T> CompletableDeferred(T r3) {
        CompletableDeferredImpl $this$CompletableDeferred_u24lambda_u242 = new CompletableDeferredImpl(null);
        $this$CompletableDeferred_u24lambda_u242.complete(r3);
        return $this$CompletableDeferred_u24lambda_u242;
    }
}
