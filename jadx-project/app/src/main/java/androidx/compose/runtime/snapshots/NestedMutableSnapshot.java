package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BM\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0002\u0010\rJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\nH\u0002J\b\u0010\u0019\u001a\u00020\nH\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/snapshots/NestedMutableSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "snapshotId", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "readObserver", "Lkotlin/Function1;", "", "", "writeObserver", "parent", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/snapshots/MutableSnapshot;)V", "deactivated", "", "getParent", "()Landroidx/compose/runtime/snapshots/MutableSnapshot;", "root", "Landroidx/compose/runtime/snapshots/Snapshot;", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "apply", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "deactivate", "dispose", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NestedMutableSnapshot extends MutableSnapshot {
    public static final int $stable = 0;
    private boolean deactivated;
    private final MutableSnapshot parent;

    static {
        $stable = 8;
    }

    public final MutableSnapshot getParent() {
        return this.parent;
    }

    public NestedMutableSnapshot(long snapshotId, SnapshotIdSet invalid, Function1<Object, Unit> r6, Function1<Object, Unit> r7, MutableSnapshot parent) {
        super(snapshotId, invalid, r6, r7);
        this.parent = parent;
        this.parent.mo3924nestedActivated$runtime_release(this);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this.parent.getRoot();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed$runtime_release() == true) goto L6;
        super.dispose();
        deactivate();
        return;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public SnapshotApplyResult apply() {
        if (this.parent.getApplied$runtime_release() == true) goto L41;
        if (this.parent.getDisposed$runtime_release() == true) goto L41;
        MutableScatterSet<StateObject> r4 = getModified$runtime_release();
        long id = getSnapshotId();
        if (r4 == null) goto L10;
        Map<StateRecord, ? extends StateRecord> r5 = SnapshotKt.access$optimisticMerges(this.parent.getSnapshotId(), this, this.parent.getInvalid$runtime_release());
    L11:
        Object lock$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv);
        SnapshotKt.access$validateOpen(this);     // Catch: Throwable -> L37
        if (r4 != null) goto L17;
    L29:
        closeAndReleasePinning$runtime_release();     // Catch: Throwable -> L37
    L31:
        if (this.parent.getSnapshotId() >= id) goto L33;
        this.parent.advance$runtime_release();     // Catch: Throwable -> L37
    L33:
        this.parent.setInvalid$runtime_release(this.parent.getInvalid$runtime_release().clear(id).andNot(getPreviousIds$runtime_release()));     // Catch: Throwable -> L37
        this.parent.recordPrevious$runtime_release(id);     // Catch: Throwable -> L37
        this.parent.recordPreviousPinnedSnapshot$runtime_release(takeoverPinnedSnapshot$runtime_release());     // Catch: Throwable -> L37
        this.parent.recordPreviousList$runtime_release(getPreviousIds$runtime_release());     // Catch: Throwable -> L37
        this.parent.recordPreviousPinnedSnapshots$runtime_release(getPreviousPinnedSnapshots$runtime_release());     // Catch: Throwable -> L37
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L37
        monitor-exit(lock$iv$iv);
        setApplied$runtime_release(true);
        deactivate();
        SnapshotObserverKt.dispatchObserverOnApplied(this, r4);
        return SnapshotApplyResult.Success.INSTANCE;
    L17:
        if (r4.getSize() == 0) goto L29;
        SnapshotApplyResult result = innerApplyLocked$runtime_release(this.parent.getSnapshotId(), r4, r5, this.parent.getInvalid$runtime_release());     // Catch: Throwable -> L37
        if (Intrinsics.areEqual(result, SnapshotApplyResult.Success.INSTANCE) == true) goto L23;
        monitor-exit(lock$iv$iv);
        return result;
    L23:
        MutableScatterSet<StateObject> r1 = this.parent.getModified$runtime_release();     // Catch: Throwable -> L37
        if (r1 == null) goto L27;
        r1.addAll(r4);     // Catch: Throwable -> L37
        if (r1 != null) goto L31;
    L27:
        this.parent.setModified(r4);     // Catch: Throwable -> L37
        setModified(null);     // Catch: Throwable -> L37
    L37:
        th = move-exception;
        throw th;
    L10:
        r5 = null;
    L41:
        return new SnapshotApplyResult.Failure(this);
    }

    private final void deactivate() {
        if (this.deactivated == true) goto L6;
        this.deactivated = true;
        this.parent.mo3925nestedDeactivated$runtime_release(this);
        return;
    }
}
