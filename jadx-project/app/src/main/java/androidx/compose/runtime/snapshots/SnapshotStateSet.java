package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;

/* JADX INFO: compiled from: SnapshotStateSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0001BB\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001fJ\u0016\u0010 \u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016J\b\u0010#\u001a\u00020$H\u0016J)\u0010%\u001a\u00020\u001d2\u001e\u0010&\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(0'H\u0082\bJ\u0016\u0010)\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001fJ\u0016\u0010*\u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016J\b\u0010+\u001a\u00020\u001dH\u0016J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0096\u0002J.\u0010.\u001a\u0002H/\"\u0004\b\u0001\u0010/2\u0018\u0010&\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u0002H/0'H\u0082\b¢\u0006\u0002\u00100J\"\u00101\u001a\u00020\u001d2\u0018\u0010&\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u001d0'H\u0002J\u0010\u00102\u001a\u00020$2\u0006\u00103\u001a\u00020\rH\u0016J\u0015\u00104\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001fJ\u0016\u00105\u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016J\u0016\u00106\u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016J\u0016\u00107\u001a\u00020\r2\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0002J\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\bJ\b\u0010:\u001a\u00020;H\u0016J3\u0010<\u001a\u0002H/\"\u0004\b\u0001\u0010/2\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0004\u0012\u0002H/0'¢\u0006\u0002\b=H\u0082\b¢\u0006\u0002\u00100J3\u0010>\u001a\u0002H/\"\u0004\b\u0001\u0010/2\u001d\u0010&\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0004\u0012\u0002H/0'¢\u0006\u0002\b=H\u0082\b¢\u0006\u0002\u00100J(\u0010?\u001a\u00020\u001d*\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010@\u001a\u00020\u00122\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0002R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b8AX\u0080\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0014¨\u0006C"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "T", "Landroidx/compose/runtime/snapshots/StateObject;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "()V", "debuggerDisplayValue", "", "getDebuggerDisplayValue$annotations", "getDebuggerDisplayValue", "()Ljava/util/Set;", "<set-?>", "Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "modification", "", "getModification$runtime_release", "()I", "readable", "Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;", "getReadable$runtime_release$annotations", "getReadable$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;", "size", "getSize", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "elements", "", "clear", "", "conditionalUpdate", "block", "Lkotlin/Function1;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "contains", "containsAll", "isEmpty", "iterator", "", "mutate", "R", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "mutateBoolean", "prependStateRecord", "value", "remove", "removeAll", "retainAll", "stateRecordWith", "set", "toSet", "toString", "", "withCurrent", "Lkotlin/ExtensionFunctionType;", "writable", "attemptUpdate", "currentModification", "newSet", "StateSetStateRecord", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SnapshotStateSet<T> implements StateObject, Set<T>, RandomAccess, KMutableSet {
    public static final int $stable = 0;
    private StateRecord firstStateRecord;

    /* JADX INFO: compiled from: SnapshotStateSet.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B!\b\u0000\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\u0014\u0010\u0016\u001a\u00020\u00022\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016R\u001a\u0010\t\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "snapshotId", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "set", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "(JLandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)V", "modification", "", "getModification$runtime_release", "()I", "setModification$runtime_release", "(I)V", "getSet$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "setSet$runtime_release", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;)V", "assign", "", "value", "create", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StateSetStateRecord<T> extends StateRecord {
        public static final int $stable = 0;
        private int modification;
        private PersistentSet<? extends T> set;

        static {
            $stable = 8;
        }

        public final PersistentSet<T> getSet$runtime_release() {
            return this.set;
        }

        public final void setSet$runtime_release(PersistentSet<? extends T> r1) {
            this.set = r1;
        }

        public StateSetStateRecord(long snapshotId, PersistentSet<? extends T> r3) {
            super(snapshotId);
            this.set = r3;
        }

        public final int getModification$runtime_release() {
            return this.modification;
        }

        public final void setModification$runtime_release(int r1) {
            this.modification = r1;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord value) {
            Object lock$iv = SnapshotStateSetKt.access$getSync$p();
            monitor-enter(lock$iv);
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord>");     // Catch: Throwable -> L8
            this.set = ((StateSetStateRecord) value).set;     // Catch: Throwable -> L8
            this.modification = ((StateSetStateRecord) value).modification;     // Catch: Throwable -> L8
            Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L8
            monitor-exit(lock$iv);
            return;
        L8:
            th = move-exception;
            throw th;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new StateSetStateRecord(SnapshotKt.currentSnapshot().getSnapshotId(), this.set);
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create(long snapshotId) {
            return new StateSetStateRecord(snapshotId, this.set);
        }
    }

    static {
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] r2) {
        return (T[]) CollectionToArray.toArray(this, r2);
    }

    public SnapshotStateSet() {
        this.firstStateRecord = stateRecordWith(ExtensionsKt.persistentSetOf());
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord value) {
        value.setNext$runtime_release(getFirstStateRecord());
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        this.firstStateRecord = (StateSetStateRecord) value;
    }

    public final Set<T> toSet() {
        return getReadable$runtime_release().getSet$runtime_release();
    }

    public final int getModification$runtime_release() {
        StateRecord r2 = getFirstStateRecord();
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        StateRecord $this$withCurrent$iv$iv = (StateSetStateRecord) r2;
        StateSetStateRecord $this$_get_modification__u24lambda_u240 = (StateSetStateRecord) SnapshotKt.current($this$withCurrent$iv$iv);
        return $this$_get_modification__u24lambda_u240.getModification$runtime_release();
    }

    public final StateSetStateRecord<T> getReadable$runtime_release() {
        StateRecord r0 = getFirstStateRecord();
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return (StateSetStateRecord) SnapshotKt.readable((StateSetStateRecord) r0, this);
    }

    public int getSize() {
        return getReadable$runtime_release().getSet$runtime_release().size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object element) {
        return getReadable$runtime_release().getSet$runtime_release().contains(element);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> r2) {
        return getReadable$runtime_release().getSet$runtime_release().containsAll(r2);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return getReadable$runtime_release().getSet$runtime_release().isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new StateSetIterator(this, getReadable$runtime_release().getSet$runtime_release().iterator());
    }

    public String toString() {
        StateRecord r0 = getFirstStateRecord();
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        StateRecord $this$withCurrent$iv = (StateSetStateRecord) r0;
        StateSetStateRecord it = (StateSetStateRecord) SnapshotKt.current($this$withCurrent$iv);
        return "SnapshotStateSet(value=" + it.getSet$runtime_release() + ")@" + hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(T r22) {
        SnapshotStateSet<T> r3 = this;
    L3:
        Object lock$iv$iv = SnapshotStateSetKt.access$getSync$p();
        monitor-enter(lock$iv$iv);
        StateRecord r12 = r3.getFirstStateRecord();     // Catch: Throwable -> L24
        Intrinsics.checkNotNull(r12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");     // Catch: Throwable -> L24
        StateRecord $this$withCurrent$iv$iv$iv = (StateSetStateRecord) r12;     // Catch: Throwable -> L24
        StateSetStateRecord current$iv = (StateSetStateRecord) SnapshotKt.current($this$withCurrent$iv$iv$iv);     // Catch: Throwable -> L24
        int currentModification$iv = current$iv.getModification$runtime_release();     // Catch: Throwable -> L24
        PersistentSet<T> r10 = current$iv.getSet$runtime_release();     // Catch: Throwable -> L24
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L24
        monitor-exit(lock$iv$iv);
        Intrinsics.checkNotNull(r10);
        PersistentSet<? extends T> r1 = r10.add(r22);
        if (Intrinsics.areEqual(r1, r10) == true) goto L10;
        StateRecord r2 = r3.getFirstStateRecord();
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        StateRecord $this$writable$iv$iv$iv = (StateSetStateRecord) r2;
        Object lock$iv$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv$iv);
        Snapshot r18 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L21
        boolean r20 = r3.attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv$iv, r3, r18), currentModification$iv, r1);     // Catch: Throwable -> L21
        monitor-exit(lock$iv$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r18, r3);
        if (r20 == false) goto L3;
        return true;
    L21:
        th = move-exception;
        throw th;
    L10:
        return false;
    L24:
        th = move-exception;
        throw th;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> r22) {
        SnapshotStateSet<T> r3 = this;
    L3:
        Object lock$iv$iv = SnapshotStateSetKt.access$getSync$p();
        monitor-enter(lock$iv$iv);
        StateRecord r12 = r3.getFirstStateRecord();     // Catch: Throwable -> L24
        Intrinsics.checkNotNull(r12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");     // Catch: Throwable -> L24
        StateRecord $this$withCurrent$iv$iv$iv = (StateSetStateRecord) r12;     // Catch: Throwable -> L24
        StateSetStateRecord current$iv = (StateSetStateRecord) SnapshotKt.current($this$withCurrent$iv$iv$iv);     // Catch: Throwable -> L24
        int currentModification$iv = current$iv.getModification$runtime_release();     // Catch: Throwable -> L24
        PersistentSet<T> r10 = current$iv.getSet$runtime_release();     // Catch: Throwable -> L24
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L24
        monitor-exit(lock$iv$iv);
        Intrinsics.checkNotNull(r10);
        PersistentSet<? extends T> r1 = r10.addAll(r22);
        if (Intrinsics.areEqual(r1, r10) == true) goto L10;
        StateRecord r2 = r3.getFirstStateRecord();
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        StateRecord $this$writable$iv$iv$iv = (StateSetStateRecord) r2;
        Object lock$iv$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv$iv);
        Snapshot r18 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L21
        boolean r20 = r3.attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv$iv, r3, r18), currentModification$iv, r1);     // Catch: Throwable -> L21
        monitor-exit(lock$iv$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r18, r3);
        if (r20 == false) goto L3;
        return true;
    L21:
        th = move-exception;
        throw th;
    L10:
        return false;
    L24:
        th = move-exception;
        throw th;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        StateRecord r0 = getFirstStateRecord();
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        StateRecord $this$writable$iv$iv = (StateSetStateRecord) r0;
        Object lock$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv);
        Snapshot r1 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L16
        StateSetStateRecord $this$clear_u24lambda_u245 = (StateSetStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv, this, r1);     // Catch: Throwable -> L16
        Object lock$iv = SnapshotStateSetKt.access$getSync$p();     // Catch: Throwable -> L16
        monitor-enter(lock$iv);     // Catch: Throwable -> L16
        $this$clear_u24lambda_u245.setSet$runtime_release(ExtensionsKt.persistentSetOf());     // Catch: Throwable -> L13
        $this$clear_u24lambda_u245.setModification$runtime_release($this$clear_u24lambda_u245.getModification$runtime_release() + 1);     // Catch: Throwable -> L13
        monitor-exit(lock$iv);     // Catch: Throwable -> L16
        monitor-exit(lock$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r1, this);
        return;
    L13:
        th = move-exception;
        throw th;     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        throw th;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object element) {
        SnapshotStateSet<T> r3 = this;
    L3:
        Object lock$iv$iv = SnapshotStateSetKt.access$getSync$p();
        monitor-enter(lock$iv$iv);
        StateRecord r12 = r3.getFirstStateRecord();     // Catch: Throwable -> L24
        Intrinsics.checkNotNull(r12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");     // Catch: Throwable -> L24
        StateRecord $this$withCurrent$iv$iv$iv = (StateSetStateRecord) r12;     // Catch: Throwable -> L24
        StateSetStateRecord current$iv = (StateSetStateRecord) SnapshotKt.current($this$withCurrent$iv$iv$iv);     // Catch: Throwable -> L24
        int currentModification$iv = current$iv.getModification$runtime_release();     // Catch: Throwable -> L24
        PersistentSet<T> r10 = current$iv.getSet$runtime_release();     // Catch: Throwable -> L24
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L24
        monitor-exit(lock$iv$iv);
        Intrinsics.checkNotNull(r10);
        PersistentSet<? extends T> r1 = r10.remove(element);
        if (Intrinsics.areEqual(r1, r10) == true) goto L10;
        StateRecord r2 = r3.getFirstStateRecord();
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        StateRecord $this$writable$iv$iv$iv = (StateSetStateRecord) r2;
        Object lock$iv$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv$iv);
        Snapshot r18 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L21
        boolean r20 = r3.attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv$iv, r3, r18), currentModification$iv, r1);     // Catch: Throwable -> L21
        monitor-exit(lock$iv$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r18, r3);
        if (r20 == false) goto L3;
        return true;
    L21:
        th = move-exception;
        throw th;
    L10:
        return false;
    L24:
        th = move-exception;
        throw th;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> r22) {
        SnapshotStateSet<T> r3 = this;
    L3:
        Object lock$iv$iv = SnapshotStateSetKt.access$getSync$p();
        monitor-enter(lock$iv$iv);
        StateRecord r12 = r3.getFirstStateRecord();     // Catch: Throwable -> L24
        Intrinsics.checkNotNull(r12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");     // Catch: Throwable -> L24
        StateRecord $this$withCurrent$iv$iv$iv = (StateSetStateRecord) r12;     // Catch: Throwable -> L24
        StateSetStateRecord current$iv = (StateSetStateRecord) SnapshotKt.current($this$withCurrent$iv$iv$iv);     // Catch: Throwable -> L24
        int currentModification$iv = current$iv.getModification$runtime_release();     // Catch: Throwable -> L24
        PersistentSet<T> r10 = current$iv.getSet$runtime_release();     // Catch: Throwable -> L24
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L24
        monitor-exit(lock$iv$iv);
        Intrinsics.checkNotNull(r10);
        PersistentSet<? extends T> r1 = r10.removeAll(r22);
        if (Intrinsics.areEqual(r1, r10) == true) goto L10;
        StateRecord r2 = r3.getFirstStateRecord();
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        StateRecord $this$writable$iv$iv$iv = (StateSetStateRecord) r2;
        Object lock$iv$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv$iv);
        Snapshot r18 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L21
        boolean r20 = r3.attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv$iv, r3, r18), currentModification$iv, r1);     // Catch: Throwable -> L21
        monitor-exit(lock$iv$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r18, r3);
        if (r20 == false) goto L3;
        return true;
    L21:
        th = move-exception;
        throw th;
    L10:
        return false;
    L24:
        th = move-exception;
        throw th;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(final Collection<? extends Object> r2) {
        return mutateBoolean(new AnonymousClass1(r2));
    }

    public final Set<T> getDebuggerDisplayValue() {
        StateRecord r2 = getFirstStateRecord();
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        StateRecord $this$withCurrent$iv$iv = (StateSetStateRecord) r2;
        StateSetStateRecord $this$_get_debuggerDisplayValue__u24lambda_u248 = (StateSetStateRecord) SnapshotKt.current($this$withCurrent$iv$iv);
        return $this$_get_debuggerDisplayValue__u24lambda_u248.getSet$runtime_release();
    }

    private final <R> R writable(Function1<? super StateSetStateRecord<T>, ? extends R> r10) {
        StateRecord r1 = getFirstStateRecord();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        StateRecord $this$writable$iv = (StateSetStateRecord) r1;
        Object lock$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv);
        Snapshot r8 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L9
        R r9 = r10.invoke(SnapshotKt.writableRecord($this$writable$iv, this, r8));     // Catch: Throwable -> L9
        monitor-exit(lock$iv$iv$iv);
        SnapshotKt.notifyWrite(r8, this);
        return r9;
    L9:
        th = move-exception;
        throw th;
    }

    private final <R> R withCurrent(Function1<? super StateSetStateRecord<T>, ? extends R> r5) {
        StateRecord r1 = getFirstStateRecord();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        StateRecord $this$withCurrent$iv = (StateSetStateRecord) r1;
        return r5.invoke(SnapshotKt.current($this$withCurrent$iv));
    }

    private final boolean mutateBoolean(Function1<? super Set<T>, Boolean> r21) {
    L3:
        Object lock$iv$iv = SnapshotStateSetKt.access$getSync$p();
        monitor-enter(lock$iv$iv);
        StateRecord r10 = getFirstStateRecord();     // Catch: Throwable -> L28
        Intrinsics.checkNotNull(r10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");     // Catch: Throwable -> L28
        StateRecord $this$withCurrent$iv$iv$iv = (StateSetStateRecord) r10;     // Catch: Throwable -> L28
        StateSetStateRecord current$iv = (StateSetStateRecord) SnapshotKt.current($this$withCurrent$iv$iv$iv);     // Catch: Throwable -> L28
        int currentModification$iv = current$iv.getModification$runtime_release();     // Catch: Throwable -> L28
        PersistentSet<T> r8 = current$iv.getSet$runtime_release();     // Catch: Throwable -> L28
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L28
        monitor-exit(lock$iv$iv);
        if (r8 == null) goto L27;
        PersistentSet.Builder<T> r1 = r8.builder();
        if (r1 == null) goto L27;
        Object result$iv = r21.invoke(r1);
        PersistentSet<? extends T> r7 = r1.build();
        if (Intrinsics.areEqual(r7, r8) == true) goto L25;
        StateRecord r2 = getFirstStateRecord();
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        StateRecord $this$writable$iv$iv$iv = (StateSetStateRecord) r2;
        Object lock$iv$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv$iv);
        Snapshot r17 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L21
        boolean r19 = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv$iv, this, r17), currentModification$iv, r7);     // Catch: Throwable -> L21
        monitor-exit(lock$iv$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r17, this);
        if (r19 == false) goto L3;
    L21:
        th = move-exception;
        throw th;
    L25:
        return ((Boolean) result$iv).booleanValue();
    L27:
        throw new IllegalStateException("No set to mutate".toString());
    L28:
        th = move-exception;
        throw th;
    }

    private final <R> R mutate(Function1<? super Set<T>, ? extends R> r21) {
        int $i$f$mutate = 0;
    L3:
        Object lock$iv = SnapshotStateSetKt.access$getSync$p();
        monitor-enter(lock$iv);
        StateRecord r9 = getFirstStateRecord();     // Catch: Throwable -> L34
        Intrinsics.checkNotNull(r9, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");     // Catch: Throwable -> L34
        StateRecord $this$withCurrent$iv$iv = (StateSetStateRecord) r9;     // Catch: Throwable -> L34
        StateSetStateRecord current = (StateSetStateRecord) SnapshotKt.current($this$withCurrent$iv$iv);     // Catch: Throwable -> L34
        int currentModification = current.getModification$runtime_release();     // Catch: Throwable -> L34
        PersistentSet<T> r7 = current.getSet$runtime_release();     // Catch: Throwable -> L34
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L34
        monitor-exit(lock$iv);
        if (r7 == null) goto L33;
        PersistentSet.Builder<T> r1 = r7.builder();
        if (r1 == null) goto L33;
        R r2 = r21.invoke(r1);
        PersistentSet<? extends T> r6 = r1.build();
        if (Intrinsics.areEqual(r6, r7) == true) goto L31;
        StateRecord r3 = getFirstStateRecord();
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        StateRecord $this$writable$iv$iv = (StateSetStateRecord) r3;
        Object lock$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv);
        Snapshot r16 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L26
        int $i$f$mutate2 = $i$f$mutate;
        boolean r19 = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv, this, r16), currentModification, r6);     // Catch: Throwable -> L24
        monitor-exit(lock$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r16, this);
        if (r19 == true) goto L31;
        $i$f$mutate = $i$f$mutate2;
    L24:
        th = th;
    L28:
        monitor-exit(lock$iv$iv$iv$iv);
        throw th;
    L26:
        th = th;
    L31:
        return r2;
    L33:
        throw new IllegalStateException("No set to mutate".toString());
    L34:
        th = move-exception;
        throw th;
    }

    private final boolean conditionalUpdate(Function1<? super PersistentSet<? extends T>, ? extends PersistentSet<? extends T>> r21) {
        SnapshotStateSet<T> r2 = this;
    L3:
        Object lock$iv = SnapshotStateSetKt.access$getSync$p();
        monitor-enter(lock$iv);
        StateRecord r11 = r2.getFirstStateRecord();     // Catch: Throwable -> L24
        Intrinsics.checkNotNull(r11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");     // Catch: Throwable -> L24
        StateRecord $this$withCurrent$iv$iv = (StateSetStateRecord) r11;     // Catch: Throwable -> L24
        StateSetStateRecord current = (StateSetStateRecord) SnapshotKt.current($this$withCurrent$iv$iv);     // Catch: Throwable -> L24
        int currentModification = current.getModification$runtime_release();     // Catch: Throwable -> L24
        Object oldSet = current.getSet$runtime_release();     // Catch: Throwable -> L24
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L24
        monitor-exit(lock$iv);
        Intrinsics.checkNotNull(oldSet);
        PersistentSet<? extends T> r7 = r21.invoke(oldSet);
        if (Intrinsics.areEqual(r7, oldSet) == true) goto L10;
        StateRecord r1 = r2.getFirstStateRecord();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        StateRecord $this$writable$iv$iv = (StateSetStateRecord) r1;
        Object lock$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv);
        Snapshot r17 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L21
        boolean r19 = r2.attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv, r2, r17), currentModification, r7);     // Catch: Throwable -> L21
        monitor-exit(lock$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r17, r2);
        if (r19 == false) goto L3;
        return true;
    L21:
        th = move-exception;
        throw th;
    L10:
        return false;
    L24:
        th = move-exception;
        throw th;
    }

    private final boolean attemptUpdate(StateSetStateRecord<T> r6, int currentModification, PersistentSet<? extends T> r8) {
        Object lock$iv = SnapshotStateSetKt.access$getSync$p();
        monitor-enter(lock$iv);
    L12:
        th = move-exception;
        throw th;
    L6:
        if (r6.getModification$runtime_release() != currentModification) goto L9;
        r6.setSet$runtime_release(r8);     // Catch: Throwable -> L12
        boolean r4 = true;
        r6.setModification$runtime_release(r6.getModification$runtime_release() + 1);     // Catch: Throwable -> L12
    L10:
        monitor-exit(lock$iv);
        return r4;
    L9:
        r4 = false;
        goto L10
    }

    private final StateRecord stateRecordWith(PersistentSet<? extends T> r7) {
        StateSetStateRecord it = new StateSetStateRecord(SnapshotKt.currentSnapshot().getSnapshotId(), r7);
        if (Snapshot.Companion.isInSnapshot() == false) goto L6;
        it.setNext$runtime_release(new StateSetStateRecord(SnapshotId_jvmKt.toSnapshotId(1), r7));
    L6:
        return it;
    }
}
