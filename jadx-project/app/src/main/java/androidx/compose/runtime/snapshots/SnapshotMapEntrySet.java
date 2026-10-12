package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: SnapshotStateMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00040\u0003B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\"\u0010\u000b\u001a\u00020\t2\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\u001d\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J\"\u0010\u0010\u001a\u00020\u000f2\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\u001b\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0012H\u0096\u0002J\u001c\u0010\u0013\u001a\u00020\u000f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\"\u0010\u0014\u001a\u00020\u000f2\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\"\u0010\u0015\u001a\u00020\u000f2\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotMapEntrySet;", "K", "V", "Landroidx/compose/runtime/snapshots/SnapshotMapSet;", "", "map", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V", "add", "", "element", "addAll", "elements", "", "contains", "", "containsAll", "iterator", "", "remove", "removeAll", "retainAll", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SnapshotMapEntrySet<K, V> extends SnapshotMapSet<K, V, Map.Entry<K, V>> {
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object element) {
        return ((Boolean) add((Map.Entry) element)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection elements) {
        return ((Boolean) addAll(elements)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object element) {
        if (TypeIntrinsics.isMutableMapEntry(element) == true) goto L7;
        return false;
    L7:
        return contains((Map.Entry) element);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object element) {
        if (TypeIntrinsics.isMutableMapEntry(element) == true) goto L7;
        return false;
    L7:
        return remove((Map.Entry) element);
    }

    public SnapshotMapEntrySet(SnapshotStateMap<K, V> r1) {
        super(r1);
    }

    public Void add(Map.Entry<K, V> r2) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection
    public Void addAll(Collection<? extends Map.Entry<K, V>> r2) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new StateMapMutableEntriesIterator(getMap(), ((ImmutableSet) getMap().getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator());
    }

    public boolean remove(Map.Entry<K, V> r3) {
        if (getMap().remove(r3.getKey()) == null) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> r6) {
        boolean removed = false;
        Iterator<? extends Object> r1 = r6.iterator();
    L4:
        if (r1.hasNext() == false) goto L12;
        Map.Entry element = (Map.Entry) r1.next();
        if (getMap().remove(element.getKey()) != null) goto L10;
        if (removed == true) goto L10;
        boolean r3 = false;
    L11:
        removed = r3;
    L10:
        r3 = true;
        goto L11
    L12:
        return removed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> r24) {
        Collection<? extends Object> $this$associate$iv = r24;
        int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associate$iv, 10)), 16);
        LinkedHashMap r3 = new LinkedHashMap(capacity$iv);
        Iterator r6 = $this$associate$iv.iterator();
    L4:
        if (r6.hasNext() == false) goto L6;
        Object element$iv$iv = r6.next();
        Map.Entry it = (Map.Entry) element$iv$iv;
        Pair r8 = TuplesKt.to(it.getKey(), it.getValue());
        r3.put(r8.getFirst(), r8.getSecond());
        goto L4
    L6:
        SnapshotStateMap<K, V> r1 = getMap();
        int $i$f$removeIf$runtime_release = 0;
        boolean removed$iv = false;
    L7:
        Object lock$iv$iv$iv = SnapshotStateMapKt.access$getSync$p();
        monitor-enter(lock$iv$iv$iv);
        StateRecord r14 = r1.getFirstStateRecord();     // Catch: Throwable -> L42
        Intrinsics.checkNotNull(r14, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");     // Catch: Throwable -> L42
        StateRecord $this$withCurrent$iv$iv$iv$iv = (SnapshotStateMap.StateMapStateRecord) r14;     // Catch: Throwable -> L42
        SnapshotStateMap.StateMapStateRecord current$iv$iv = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.current($this$withCurrent$iv$iv$iv$iv);     // Catch: Throwable -> L42
        PersistentMap<K, V> r12 = current$iv$iv.getMap$runtime_release();     // Catch: Throwable -> L42
        int currentModification$iv$iv = current$iv$iv.getModification$runtime_release();     // Catch: Throwable -> L42
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L42
        monitor-exit(lock$iv$iv$iv);
        Intrinsics.checkNotNull(r12);
        PersistentMap.Builder<K, V> r10 = r12.builder();
        PersistentMap.Builder<K, V> it$iv = r10;
        Iterator<Map.Entry<K, V>> r13 = r1.entrySet().iterator();
    L14:
        if (r13.hasNext() == false) goto L26;
        Map.Entry<K, V> r15 = r13.next();
        r1 = r1;
        if (r3.containsKey(r15.getKey()) == false) goto L21;
        $i$f$removeIf$runtime_release = $i$f$removeIf$runtime_release;
        if (Intrinsics.areEqual(r3.get(r15.getKey()), r15.getValue()) == false) goto L22;
        boolean r2 = false;
    L23:
        if (r2 == false) goto L14;
        it$iv.remove(r15.getKey());
        removed$iv = true;
    L22:
        r2 = true;
        goto L23
    L21:
        $i$f$removeIf$runtime_release = $i$f$removeIf$runtime_release;
        goto L22
    L26:
        SnapshotStateMap<K, V> r16 = r1;
        int $i$f$removeIf$runtime_release2 = $i$f$removeIf$runtime_release;
        Unit r4 = Unit.INSTANCE;
        PersistentMap<K, V> r5 = r10.build();
        if (Intrinsics.areEqual(r5, r12) == true) goto L41;
        StateRecord r7 = r1.getFirstStateRecord();
        Intrinsics.checkNotNull(r7, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateRecord $this$writable$iv$iv$iv$iv = (SnapshotStateMap.StateMapStateRecord) r7;
        Object lock$iv$iv$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv$iv$iv);
        Snapshot r20 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L37
        SnapshotStateMap.StateMapStateRecord $this$mutate_u24lambda_u2413$iv$iv = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv$iv$iv, r1, r20);     // Catch: Throwable -> L37
        boolean r22 = SnapshotStateMap.access$attemptUpdate(r1, $this$mutate_u24lambda_u2413$iv$iv, currentModification$iv$iv, r5);     // Catch: Throwable -> L37
        monitor-exit(lock$iv$iv$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r20, r1);
        if (r22 == true) goto L41;
        r1 = r16;
        $i$f$removeIf$runtime_release = $i$f$removeIf$runtime_release2;
    L37:
        th = move-exception;
        throw th;
    L41:
        return removed$iv;
    L42:
        th = move-exception;
        throw th;
    }

    public boolean contains(Map.Entry<K, V> r3) {
        return Intrinsics.areEqual(getMap().get(r3.getKey()), r3.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> r8) {
        Collection<? extends Object> $this$all$iv = r8;
        if (($this$all$iv instanceof Collection) == true) goto L5;
    L7:
        Iterator r2 = $this$all$iv.iterator();
    L9:
        if (r2.hasNext() == false) goto L19;
        Object element$iv = r2.next();
        Map.Entry it = (Map.Entry) element$iv;
        if (contains(it) == true) goto L9;
        return false;
    L19:
        return true;
    L5:
        if ($this$all$iv.isEmpty() == false) goto L7;
        return true;
    }
}
