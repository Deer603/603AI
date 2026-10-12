package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserver;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0010¢\u0006\u0002\b\u0010J\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0010¢\u0006\u0002\b\u0012J\r\u0010\u0013\u001a\u00020\u000bH\u0010¢\u0006\u0002\b\u0014J4\u0010\u0015\u001a\u00020\u00012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00172\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0017H\u0016J\u001e\u0010\u001a\u001a\u00020\u000f2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0017H\u0016¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "snapshotId", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "apply", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "dispose", "", "nestedActivated", "", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "nestedActivated$runtime_release", "nestedDeactivated", "nestedDeactivated$runtime_release", "notifyObjectsInitialized", "notifyObjectsInitialized$runtime_release", "takeNestedMutableSnapshot", "readObserver", "Lkotlin/Function1;", "", "writeObserver", "takeNestedSnapshot", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GlobalSnapshot extends MutableSnapshot {
    public static final int $stable = 0;

    static {
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedActivated$runtime_release, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo3924nestedActivated$runtime_release(Snapshot snapshot) {
        nestedActivated$runtime_release(snapshot);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedDeactivated$runtime_release, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo3925nestedDeactivated$runtime_release(Snapshot snapshot) {
        nestedDeactivated$runtime_release(snapshot);
    }

    public GlobalSnapshot(long snapshotId, SnapshotIdSet invalid) {
        super(snapshotId, invalid, null, AnonymousClass1.INSTANCE);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(Function1<Object, Unit> r12) {
        Map<SnapshotObserver, SnapshotInstanceObservers> r4 = null;
        PersistentList observers$iv = SnapshotObserverKt.access$getObservers$p();
        Function1<Object, Unit> r6 = r12;
        if (observers$iv == null) goto L5;
        Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> r8 = SnapshotObserverKt.mergeObservers(observers$iv, null, true, r12, null);
        SnapshotInstanceObservers mappedObservers$iv = r8.getFirst();
        r6 = mappedObservers$iv.getReadObserver();
        mappedObservers$iv.getWriteObserver();
        r4 = r8.getSecond();
    L5:
        final Function1<Object, Unit> r9 = r6;
        Snapshot result$iv = (ReadonlySnapshot) SnapshotKt.access$takeNewSnapshot(new GlobalSnapshot$takeNestedSnapshot$1$1(r9));
        if (observers$iv == null) goto L9;
        SnapshotObserverKt.dispatchCreatedObservers(observers$iv, null, result$iv, r4);
    L9:
        return result$iv;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public MutableSnapshot takeNestedMutableSnapshot(Function1<Object, Unit> r12, Function1<Object, Unit> r13) {
        Map<SnapshotObserver, SnapshotInstanceObservers> r3 = null;
        PersistentList observers$iv = SnapshotObserverKt.access$getObservers$p();
        Function1<Object, Unit> r5 = r12;
        Function1<Object, Unit> r6 = r13;
        if (observers$iv == null) goto L5;
        Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> r7 = SnapshotObserverKt.mergeObservers(observers$iv, null, false, r12, r13);
        SnapshotInstanceObservers mappedObservers$iv = r7.getFirst();
        r5 = mappedObservers$iv.getReadObserver();
        r6 = mappedObservers$iv.getWriteObserver();
        r3 = r7.getSecond();
    L5:
        final Function1<Object, Unit> r8 = r5;
        final Function1<Object, Unit> r9 = r6;
        Snapshot result$iv = (MutableSnapshot) SnapshotKt.access$takeNewSnapshot(new GlobalSnapshot$takeNestedMutableSnapshot$1$1(r8, r9));
        if (observers$iv == null) goto L9;
        SnapshotObserverKt.dispatchCreatedObservers(observers$iv, null, result$iv, r3);
    L9:
        return (MutableSnapshot) result$iv;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        SnapshotKt.access$advanceGlobalSnapshot();
    }

    public Void nestedDeactivated$runtime_release(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    public Void nestedActivated$runtime_release(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public SnapshotApplyResult apply() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        Object lock$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv);
        releasePinnedSnapshotLocked$runtime_release();     // Catch: Throwable -> L8
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L8
        monitor-exit(lock$iv$iv);
        return;
    L8:
        th = move-exception;
        throw th;
    }
}
