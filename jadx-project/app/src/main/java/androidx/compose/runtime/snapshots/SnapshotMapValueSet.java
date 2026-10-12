package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SnapshotStateMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00020\u0003B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013H\u0096\u0002J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0015\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016J\u0016\u0010\u0016\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotMapValueSet;", "K", "V", "Landroidx/compose/runtime/snapshots/SnapshotMapSet;", "map", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V", "add", "", "element", "(Ljava/lang/Object;)Ljava/lang/Void;", "addAll", "elements", "", "contains", "", "(Ljava/lang/Object;)Z", "containsAll", "iterator", "Landroidx/compose/runtime/snapshots/StateMapMutableValuesIterator;", "remove", "removeAll", "retainAll", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SnapshotMapValueSet<K, V> extends SnapshotMapSet<K, V, V> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object r2) {
        return ((Boolean) add(r2)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection elements) {
        return ((Boolean) addAll(elements)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public SnapshotMapValueSet(SnapshotStateMap<K, V> r1) {
        super(r1);
    }

    @Override // java.util.Set, java.util.Collection
    public Void add(V r2) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection
    public Void addAll(Collection<? extends V> r2) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public StateMapMutableValuesIterator<K, V> iterator() {
        return new StateMapMutableValuesIterator(getMap(), ((ImmutableSet) getMap().getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object r2) {
        return getMap().removeValue$runtime_release(r2);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> r24) {
        Set set = CollectionsKt.toSet(r24);
        SnapshotStateMap<K, V> r2 = getMap();
        boolean removed$iv = false;
    L3:
        Object lock$iv$iv$iv = SnapshotStateMapKt.access$getSync$p();
        monitor-enter(lock$iv$iv$iv);
        StateRecord r14 = r2.getFirstStateRecord();     // Catch: Throwable -> L31
        Intrinsics.checkNotNull(r14, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");     // Catch: Throwable -> L31
        StateRecord $this$withCurrent$iv$iv$iv$iv = (SnapshotStateMap.StateMapStateRecord) r14;     // Catch: Throwable -> L31
        SnapshotStateMap.StateMapStateRecord current$iv$iv = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.current($this$withCurrent$iv$iv$iv$iv);     // Catch: Throwable -> L31
        PersistentMap<K, V> r12 = current$iv$iv.getMap$runtime_release();     // Catch: Throwable -> L31
        int currentModification$iv$iv = current$iv$iv.getModification$runtime_release();     // Catch: Throwable -> L31
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L31
        monitor-exit(lock$iv$iv$iv);
        Intrinsics.checkNotNull(r12);
        PersistentMap.Builder<K, V> r10 = r12.builder();
        PersistentMap.Builder<K, V> it$iv = r10;
        Iterator<Map.Entry<K, V>> r13 = r2.entrySet().iterator();
    L10:
        if (r13.hasNext() == false) goto L15;
        Map.Entry<K, V> r15 = r13.next();
        r2 = r2;
        if (set.contains(r15.getValue()) == false) goto L10;
        it$iv.remove(r15.getKey());
        removed$iv = true;
        goto L10
    L15:
        SnapshotStateMap<K, V> r16 = r2;
        Unit r1 = Unit.INSTANCE;
        PersistentMap<K, V> r3 = r10.build();
        if (Intrinsics.areEqual(r3, r12) == true) goto L30;
        StateRecord r4 = r2.getFirstStateRecord();
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateRecord $this$writable$iv$iv$iv$iv = (SnapshotStateMap.StateMapStateRecord) r4;
        Object lock$iv$iv$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv$iv$iv);
        Snapshot r20 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L26
        SnapshotStateMap.StateMapStateRecord $this$mutate_u24lambda_u2413$iv$iv = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv$iv$iv, r2, r20);     // Catch: Throwable -> L26
        boolean r22 = SnapshotStateMap.access$attemptUpdate(r2, $this$mutate_u24lambda_u2413$iv$iv, currentModification$iv$iv, r3);     // Catch: Throwable -> L26
        monitor-exit(lock$iv$iv$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r20, r2);
        if (r22 == true) goto L30;
        r2 = r16;
    L26:
        th = move-exception;
        throw th;
    L30:
        return removed$iv;
    L31:
        th = move-exception;
        throw th;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> r24) {
        Set set = CollectionsKt.toSet(r24);
        SnapshotStateMap<K, V> r2 = getMap();
        boolean removed$iv = false;
    L3:
        Object lock$iv$iv$iv = SnapshotStateMapKt.access$getSync$p();
        monitor-enter(lock$iv$iv$iv);
        StateRecord r14 = r2.getFirstStateRecord();     // Catch: Throwable -> L31
        Intrinsics.checkNotNull(r14, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");     // Catch: Throwable -> L31
        StateRecord $this$withCurrent$iv$iv$iv$iv = (SnapshotStateMap.StateMapStateRecord) r14;     // Catch: Throwable -> L31
        SnapshotStateMap.StateMapStateRecord current$iv$iv = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.current($this$withCurrent$iv$iv$iv$iv);     // Catch: Throwable -> L31
        PersistentMap<K, V> r12 = current$iv$iv.getMap$runtime_release();     // Catch: Throwable -> L31
        int currentModification$iv$iv = current$iv$iv.getModification$runtime_release();     // Catch: Throwable -> L31
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L31
        monitor-exit(lock$iv$iv$iv);
        Intrinsics.checkNotNull(r12);
        PersistentMap.Builder<K, V> r10 = r12.builder();
        PersistentMap.Builder<K, V> it$iv = r10;
        Iterator<Map.Entry<K, V>> r13 = r2.entrySet().iterator();
    L10:
        if (r13.hasNext() == false) goto L15;
        Map.Entry<K, V> r15 = r13.next();
        r2 = r2;
        if (set.contains(r15.getValue()) == true) goto L10;
        it$iv.remove(r15.getKey());
        removed$iv = true;
        goto L10
    L15:
        SnapshotStateMap<K, V> r16 = r2;
        Unit r1 = Unit.INSTANCE;
        PersistentMap<K, V> r3 = r10.build();
        if (Intrinsics.areEqual(r3, r12) == true) goto L30;
        StateRecord r4 = r2.getFirstStateRecord();
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateRecord $this$writable$iv$iv$iv$iv = (SnapshotStateMap.StateMapStateRecord) r4;
        Object lock$iv$iv$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv$iv$iv);
        Snapshot r20 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L26
        SnapshotStateMap.StateMapStateRecord $this$mutate_u24lambda_u2413$iv$iv = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv$iv$iv, r2, r20);     // Catch: Throwable -> L26
        boolean r22 = SnapshotStateMap.access$attemptUpdate(r2, $this$mutate_u24lambda_u2413$iv$iv, currentModification$iv$iv, r3);     // Catch: Throwable -> L26
        monitor-exit(lock$iv$iv$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r20, r2);
        if (r22 == true) goto L30;
        r2 = r16;
    L26:
        th = move-exception;
        throw th;
    L30:
        return removed$iv;
    L31:
        th = move-exception;
        throw th;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object element) {
        return getMap().containsValue(element);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> r9) {
        Collection<? extends Object> $this$all$iv = r9;
        if (($this$all$iv instanceof Collection) == true) goto L5;
    L7:
        Iterator r2 = $this$all$iv.iterator();
    L9:
        if (r2.hasNext() == false) goto L19;
        Object element$iv = r2.next();
        if (getMap().containsValue(element$iv) == true) goto L9;
        return false;
    L19:
        return true;
    L5:
        if ($this$all$iv.isEmpty() == false) goto L7;
        return true;
    }
}
