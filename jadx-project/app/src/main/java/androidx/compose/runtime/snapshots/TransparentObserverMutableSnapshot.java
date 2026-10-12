package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.Thread_jvmKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\b\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u00020\u0006H\u0016J\b\u0010;\u001a\u00020\tH\u0016J\u0015\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0010¢\u0006\u0002\b@J\u0015\u0010A\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0010¢\u0006\u0002\bBJ\r\u0010C\u001a\u00020\u0006H\u0010¢\u0006\u0002\bDJ\u0015\u0010E\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u0017H\u0010¢\u0006\u0002\bGJ4\u0010H\u001a\u00020\u00012\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0014\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0016J\u001e\u0010I\u001a\u00020?2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0016R\u0014\u0010\f\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168P@VX\u0090\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R@\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004@VX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R,\u0010(\u001a\u00060&j\u0002`'2\n\u0010\u000f\u001a\u00060&j\u0002`'8V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020&X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010*R$\u00100\u001a\u00020/2\u0006\u0010\u000f\u001a\u00020/8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R@\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004@VX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010 \"\u0004\b7\u0010\"¨\u0006J"}, d2 = {"Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "parentSnapshot", "specifiedReadObserver", "Lkotlin/Function1;", "", "", "specifiedWriteObserver", "mergeParentObservers", "", "ownsParentSnapshot", "(Landroidx/compose/runtime/snapshots/MutableSnapshot;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V", "currentSnapshot", "getCurrentSnapshot", "()Landroidx/compose/runtime/snapshots/MutableSnapshot;", "value", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "getInvalid$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setInvalid$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/runtime/snapshots/StateObject;", "modified", "getModified$runtime_release", "()Landroidx/collection/MutableScatterSet;", "setModified", "(Landroidx/collection/MutableScatterSet;)V", "<set-?>", "readObserver", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "setReadObserver", "(Lkotlin/jvm/functions/Function1;)V", "readOnly", "getReadOnly", "()Z", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "getSnapshotId", "()J", "setSnapshotId$runtime_release", "(J)V", "threadId", "getThreadId$runtime_release", "", "writeCount", "getWriteCount$runtime_release", "()I", "setWriteCount$runtime_release", "(I)V", "writeObserver", "getWriteObserver$runtime_release", "setWriteObserver", "apply", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "dispose", "hasPendingChanges", "nestedActivated", "", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "nestedActivated$runtime_release", "nestedDeactivated", "nestedDeactivated$runtime_release", "notifyObjectsInitialized", "notifyObjectsInitialized$runtime_release", "recordModified", "state", "recordModified$runtime_release", "takeNestedMutableSnapshot", "takeNestedSnapshot", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TransparentObserverMutableSnapshot extends MutableSnapshot {
    public static final int $stable = 0;
    private final boolean mergeParentObservers;
    private final boolean ownsParentSnapshot;
    private final MutableSnapshot parentSnapshot;
    private Function1<Object, Unit> readObserver;
    private final long threadId;
    private Function1<Object, Unit> writeObserver;

    static {
        $stable = 8;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public /* bridge */ /* synthetic */ Function1 getReadObserver() {
        return getReadObserver$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedActivated$runtime_release */
    public /* bridge */ /* synthetic */ void mo3924nestedActivated$runtime_release(Snapshot snapshot) {
        nestedActivated$runtime_release(snapshot);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedDeactivated$runtime_release */
    public /* bridge */ /* synthetic */ void mo3925nestedDeactivated$runtime_release(Snapshot snapshot) {
        nestedDeactivated$runtime_release(snapshot);
    }

    public TransparentObserverMutableSnapshot(MutableSnapshot parentSnapshot, Function1<Object, Unit> r8, Function1<Object, Unit> r9, boolean mergeParentObservers, boolean ownsParentSnapshot) {
        long r1 = SnapshotKt.access$getINVALID_SNAPSHOT$p();
        SnapshotIdSet r3 = SnapshotIdSet.Companion.getEMPTY();
        if (parentSnapshot == null) goto L6;
        Function1<Object, Unit> r0 = parentSnapshot.getReadObserver$runtime_release();
        if (r0 == null) goto L6;
    L7:
        Function1 r4 = SnapshotKt.access$mergedReadObserver(r8, r0, mergeParentObservers);
        if (parentSnapshot == null) goto L11;
        Function1<Object, Unit> r2 = parentSnapshot.getWriteObserver$runtime_release();
        if (r2 == null) goto L11;
    L12:
        super(r1, r3, r4, SnapshotKt.access$mergedWriteObserver(r9, r2));
        this.parentSnapshot = parentSnapshot;
        this.mergeParentObservers = mergeParentObservers;
        this.ownsParentSnapshot = ownsParentSnapshot;
        this.readObserver = super.getReadObserver$runtime_release();
        this.writeObserver = super.getWriteObserver$runtime_release();
        this.threadId = Thread_jvmKt.currentThreadId();
        return;
    L11:
        r2 = SnapshotKt.access$getGlobalSnapshot$p().getWriteObserver$runtime_release();
    L6:
        r0 = SnapshotKt.access$getGlobalSnapshot$p().getReadObserver$runtime_release();
        goto L7
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public Function1<Object, Unit> getReadObserver$runtime_release() {
        return this.readObserver;
    }

    public void setReadObserver(Function1<Object, Unit> r1) {
        this.readObserver = r1;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public Function1<Object, Unit> getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    public void setWriteObserver(Function1<Object, Unit> r1) {
        this.writeObserver = r1;
    }

    public final long getThreadId$runtime_release() {
        return this.threadId;
    }

    private final MutableSnapshot getCurrentSnapshot() {
        MutableSnapshot r0 = this.parentSnapshot;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return SnapshotKt.access$getGlobalSnapshot$p();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        setDisposed$runtime_release(true);
        if (this.ownsParentSnapshot == false) goto L8;
        MutableSnapshot r0 = this.parentSnapshot;
        if (r0 == null) goto L9;
        r0.dispose();
        return;
    L9:
        return;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public long getSnapshotId() {
        return getCurrentSnapshot().getSnapshotId();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setSnapshotId$runtime_release(long value) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public SnapshotIdSet getInvalid$runtime_release() {
        return getCurrentSnapshot().getInvalid$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setInvalid$runtime_release(SnapshotIdSet value) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return getCurrentSnapshot().hasPendingChanges();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public MutableScatterSet<StateObject> getModified$runtime_release() {
        return getCurrentSnapshot().getModified$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public void setModified(MutableScatterSet<StateObject> r2) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public int getWriteCount$runtime_release() {
        return getCurrentSnapshot().getWriteCount$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime_release(int value) {
        getCurrentSnapshot().setWriteCount$runtime_release(value);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return getCurrentSnapshot().getReadOnly();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public SnapshotApplyResult apply() {
        return getCurrentSnapshot().apply();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: recordModified$runtime_release */
    public void mo3926recordModified$runtime_release(StateObject state) {
        getCurrentSnapshot().mo3926recordModified$runtime_release(state);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(Function1<Object, Unit> r5) {
        Function1<Object, Unit> r0 = SnapshotKt.mergedReadObserver$default(r5, getReadObserver$runtime_release(), false, 4, null);
        if (this.mergeParentObservers == true) goto L6;
        return SnapshotKt.access$createTransparentSnapshotWithNoParentReadObserver(getCurrentSnapshot().takeNestedSnapshot(null), r0, true);
    L6:
        return getCurrentSnapshot().takeNestedSnapshot(r0);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public MutableSnapshot takeNestedMutableSnapshot(Function1<Object, Unit> r11, Function1<Object, Unit> r12) {
        Function1<Object, Unit> r6 = SnapshotKt.mergedReadObserver$default(r11, getReadObserver$runtime_release(), false, 4, null);
        Function1<Object, Unit> r7 = SnapshotKt.access$mergedWriteObserver(r12, getWriteObserver$runtime_release());
        if (this.mergeParentObservers == true) goto L6;
        MutableSnapshot nestedSnapshot = getCurrentSnapshot().takeNestedMutableSnapshot(null, r7);
        return new TransparentObserverMutableSnapshot(nestedSnapshot, r6, r7, false, true);
    L6:
        return getCurrentSnapshot().takeNestedMutableSnapshot(r6, r7);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        getCurrentSnapshot().notifyObjectsInitialized$runtime_release();
    }

    public Void nestedActivated$runtime_release(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    public Void nestedDeactivated$runtime_release(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }
}
