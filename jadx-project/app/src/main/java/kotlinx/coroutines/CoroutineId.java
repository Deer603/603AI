package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/CoroutineId;", "Lkotlinx/coroutines/ThreadContextElement;", "", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "id", "", "(J)V", "getId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "toString", "updateThreadContext", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CoroutineId extends AbstractCoroutineContextElement implements ThreadContextElement<String> {
    public static final Key Key = null;
    private final long id;

    /* JADX INFO: compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineId$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/CoroutineId;", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Key implements CoroutineContext.Key<CoroutineId> {
        public /* synthetic */ Key(DefaultConstructorMarker r1) {
            this();
        }

        private Key() {
        }
    }

    static {
        Key = new Key(null);
    }

    public static /* synthetic */ CoroutineId copy$default(CoroutineId r0, long r1, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.id;
    L6:
        return r0.copy(r1);
    }

    public final long component1() {
        return this.id;
    }

    public final CoroutineId copy(long r2) {
        return new CoroutineId(r2);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof CoroutineId) == true) goto L9;
        return false;
    L9:
        if (this.id == ((CoroutineId) r8).id) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Long.hashCode(this.id);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public /* bridge */ /* synthetic */ void restoreThreadContext(CoroutineContext context, String r3) {
        restoreThreadContext2(context, r3);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public /* bridge */ /* synthetic */ String updateThreadContext(CoroutineContext context) {
        return updateThreadContext2(context);
    }

    public final long getId() {
        return this.id;
    }

    public CoroutineId(long id) {
        super(Key);
        this.id = id;
    }

    public String toString() {
        return "CoroutineId(" + this.id + ')';
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    /* JADX INFO: renamed from: updateThreadContext, reason: avoid collision after fix types in other method */
    public String updateThreadContext2(CoroutineContext context) {
        CoroutineName r0 = (CoroutineName) context.get(CoroutineName.Key);
        if (r0 == null) goto L6;
        String coroutineName = r0.getName();
        if (coroutineName == null) goto L6;
    L7:
        Thread currentThread = Thread.currentThread();
        String oldName = currentThread.getName();
        int lastIndex = StringsKt.lastIndexOf$default(oldName, " @", 0, false, 6, null);
        if (lastIndex >= 0) goto L10;
        lastIndex = oldName.length();
    L10:
        StringBuilder $this$updateThreadContext_u24lambda_u240 = new StringBuilder((coroutineName.length() + lastIndex) + 10);
        String r7 = oldName.substring(0, lastIndex);
        Intrinsics.checkNotNullExpressionValue(r7, "substring(...)");
        $this$updateThreadContext_u24lambda_u240.append(r7);
        $this$updateThreadContext_u24lambda_u240.append(" @");
        $this$updateThreadContext_u24lambda_u240.append(coroutineName);
        $this$updateThreadContext_u24lambda_u240.append('#');
        $this$updateThreadContext_u24lambda_u240.append(this.id);
        String r4 = $this$updateThreadContext_u24lambda_u240.toString();
        Intrinsics.checkNotNullExpressionValue(r4, "toString(...)");
        currentThread.setName(r4);
        return oldName;
    L6:
        coroutineName = "coroutine";
        goto L7
    }

    /* JADX INFO: renamed from: restoreThreadContext, reason: avoid collision after fix types in other method */
    public void restoreThreadContext2(CoroutineContext context, String oldState) {
        Thread.currentThread().setName(oldState);
    }
}
