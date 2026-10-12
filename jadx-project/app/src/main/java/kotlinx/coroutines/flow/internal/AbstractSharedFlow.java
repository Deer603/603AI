package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;

/* JADX INFO: compiled from: AbstractSharedFlow.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00060\u0003j\u0002`\u0004B\u0005¢\u0006\u0002\u0010\u0005J\r\u0010\u0017\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u0018J\r\u0010\u0019\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u0018J\u001d\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000e2\u0006\u0010\u001b\u001a\u00020\tH$¢\u0006\u0002\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001e0 H\u0084\bJ\u0015\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010#R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R4\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000e2\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000e@BX\u0084\u000e¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "S", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "()V", "_subscriptionCount", "Lkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow;", "<set-?>", "", "nCollectors", "getNCollectors", "()I", "nextIndex", "", "slots", "getSlots", "()[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "subscriptionCount", "Lkotlinx/coroutines/flow/StateFlow;", "getSubscriptionCount", "()Lkotlinx/coroutines/flow/StateFlow;", "allocateSlot", "()Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "createSlot", "createSlotArray", "size", "(I)[Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "forEachSlotLocked", "", "block", "Lkotlin/Function1;", "freeSlot", "slot", "(Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AbstractSharedFlow<S extends AbstractSharedFlowSlot<?>> {
    private SubscriptionCountStateFlow _subscriptionCount;
    private int nCollectors;
    private int nextIndex;
    private S[] slots;

    protected abstract S createSlot();

    protected abstract S[] createSlotArray(int r1);

    public AbstractSharedFlow() {
    }

    public static final /* synthetic */ int access$getNCollectors(AbstractSharedFlow $this) {
        return $this.nCollectors;
    }

    public static final /* synthetic */ AbstractSharedFlowSlot[] access$getSlots(AbstractSharedFlow $this) {
        return $this.slots;
    }

    protected final S[] getSlots() {
        return this.slots;
    }

    protected final int getNCollectors() {
        return this.nCollectors;
    }

    public final StateFlow<Integer> getSubscriptionCount() {
        monitor-enter(this);
        SubscriptionCountStateFlow it = this._subscriptionCount;     // Catch: Throwable -> L12
        if (it != null) goto L9;
        it = new SubscriptionCountStateFlow(this.nCollectors);     // Catch: Throwable -> L12
        this._subscriptionCount = it;     // Catch: Throwable -> L12
    L9:
        monitor-exit(this);
        return it;
    L12:
        th = move-exception;
        throw th;
    }

    protected final S allocateSlot() {
        monitor-enter(this);
        S[] r4 = this.slots;     // Catch: Throwable -> L26
        if (r4 != null) goto L9;
        S[] r5 = (S[]) createSlotArray(2);
        this.slots = r5;     // Catch: Throwable -> L26
        r4 = r5;
    L12:
        int r6 = this.nextIndex;     // Catch: Throwable -> L26
    L13:
        AbstractSharedFlowSlot r7 = r4[r6];     // Catch: Throwable -> L26
        if (r7 != null) goto L16;
        r7 = createSlot();     // Catch: Throwable -> L26
        r4[r6] = r7;     // Catch: Throwable -> L26
    L16:
        S r8 = (S) r7;
        r6 = r6 + 1;     // Catch: Throwable -> L26
        if (r6 < r4.length) goto L19;
        r6 = 0;
    L19:
        Intrinsics.checkNotNull(r8, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");     // Catch: Throwable -> L26
        if (r8.allocateLocked(this) == false) goto L13;
        this.nextIndex = r6;     // Catch: Throwable -> L26
        this.nCollectors++;     // Catch: Throwable -> L26
        SubscriptionCountStateFlow r9 = this._subscriptionCount;     // Catch: Throwable -> L26
        monitor-exit(this);
        if (r9 == null) goto L25;
        r9.increment(1);
    L25:
        return r8;
    L9:
        if (this.nCollectors < r4.length) goto L12;
        Object[] r10 = Arrays.copyOf(r4, r4.length * 2);     // Catch: Throwable -> L26
        Intrinsics.checkNotNullExpressionValue(r10, "copyOf(...)");     // Catch: Throwable -> L26
        this.slots = (S[]) ((AbstractSharedFlowSlot[]) r10);     // Catch: Throwable -> L26
        r4 = (S[]) ((AbstractSharedFlowSlot[]) r10);
    L26:
        th = move-exception;
        throw th;
    }

    protected final void freeSlot(S r8) {
        monitor-enter(this);
        this.nCollectors--;     // Catch: Throwable -> L19
        SubscriptionCountStateFlow r4 = this._subscriptionCount;     // Catch: Throwable -> L19
        int r6 = 0;
        if (this.nCollectors != 0) goto L8;
        this.nextIndex = 0;     // Catch: Throwable -> L19
    L8:
        Intrinsics.checkNotNull(r8, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");     // Catch: Throwable -> L19
        Continuation<Unit>[] r5 = r8.freeLocked(this);     // Catch: Throwable -> L19
        monitor-exit(this);
        int r1 = r5.length;
    L11:
        if (r6 >= r1) goto L16;
        Continuation<Unit> r2 = r5[r6];
        if (r2 == null) goto L15;
        Result.Companion r3 = Result.Companion;
        r2.resumeWith(Result.m7425constructorimpl(Unit.INSTANCE));
    L15:
        r6 = r6 + 1;
        goto L11
    L16:
        if (r4 == null) goto L27;
        r4.increment(-1);
        return;
    L27:
        return;
    L19:
        th = move-exception;
        throw th;
    }

    protected final void forEachSlotLocked(Function1<? super S, Unit> r9) {
        if (access$getNCollectors(this) != 0) goto L5;
        return;
    L5:
        Object[] $this$forEach$iv = access$getSlots(this);
        if ($this$forEach$iv == null) goto L14;
        int r3 = $this$forEach$iv.length;
        int r4 = 0;
    L8:
        if (r4 >= r3) goto L18;
        Object element$iv = $this$forEach$iv[r4];
        if (element$iv == null) goto L12;
        r9.invoke(element$iv);
    L12:
        r4 = r4 + 1;
        goto L8
    L18:
        return;
    }
}
