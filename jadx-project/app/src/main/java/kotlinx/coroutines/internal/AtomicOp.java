package kotlinx.coroutines.internal;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: Atomic.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0013R\u0011\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/internal/AtomicOp;", "T", "Lkotlinx/coroutines/internal/OpDescriptor;", "()V", "_consensus", "Lkotlinx/atomicfu/AtomicRef;", "", "atomicOp", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "complete", "", "affected", "failure", "(Ljava/lang/Object;Ljava/lang/Object;)V", "decide", "decision", "perform", "prepare", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AtomicOp<T> extends OpDescriptor {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _consensus$volatile$FU = null;
    private volatile /* synthetic */ Object _consensus$volatile;

    static {
        _consensus$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(AtomicOp.class, Object.class, "_consensus$volatile");
    }

    private final /* synthetic */ Object get_consensus$volatile() {
        return this._consensus$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater get_consensus$volatile$FU() {
        return _consensus$volatile$FU;
    }

    private final /* synthetic */ void set_consensus$volatile(Object r1) {
        this._consensus$volatile = r1;
    }

    public abstract void complete(T r1, Object r2);

    public abstract Object prepare(T r1);

    public AtomicOp() {
        this._consensus$volatile = AtomicKt.NO_DECISION;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.OpDescriptor
    public AtomicOp<?> getAtomicOp() {
        return this;
    }

    private final Object decide(Object decision) {
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L5;
    L12:
        Object current = get_consensus$volatile$FU().get(this);
        if (current == AtomicKt.NO_DECISION) goto L16;
        return current;
    L16:
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_consensus$volatile$FU(), this, AtomicKt.NO_DECISION, decision) == false) goto L19;
        return decision;
    L19:
        return get_consensus$volatile$FU().get(this);
    L5:
        if (decision == AtomicKt.NO_DECISION) goto L7;
        boolean r1 = true;
    L8:
        if (r1 == true) goto L12;
        throw new AssertionError();
    L7:
        r1 = false;
        goto L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.OpDescriptor
    public final Object perform(Object r3) {
        Object decision = get_consensus$volatile$FU().get(this);
        if (decision != AtomicKt.NO_DECISION) goto L5;
        decision = decide(prepare(r3));
    L5:
        complete(r3, decision);
        return decision;
    }
}
