package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: compiled from: SnapshotStateMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001RB\u0005¢\u0006\u0002\u0010\u0005J.\u0010&\u001a\u00020'2\u001e\u0010(\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*\u0012\u0004\u0012\u00020'0)H\u0080\b¢\u0006\u0002\b+J.\u0010,\u001a\u00020'2\u001e\u0010(\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*\u0012\u0004\u0012\u00020'0)H\u0080\b¢\u0006\u0002\b-J\b\u0010.\u001a\u00020/H\u0016J\u0015\u00100\u001a\u00020'2\u0006\u00101\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00102J\u0015\u00103\u001a\u00020'2\u0006\u00104\u001a\u00028\u0001H\u0016¢\u0006\u0002\u00102J\u0018\u00105\u001a\u0004\u0018\u00018\u00012\u0006\u00101\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u00106J\b\u00107\u001a\u00020'H\u0016J4\u00108\u001a\u0002H9\"\u0004\b\u0002\u001092\u001e\u0010:\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u0002H90)H\u0082\b¢\u0006\u0002\u0010;J\u0010\u0010<\u001a\u00020/2\u0006\u00104\u001a\u00020\u0011H\u0016J\u001f\u0010=\u001a\u0004\u0018\u00018\u00012\u0006\u00101\u001a\u00028\u00002\u0006\u00104\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010>J\u001e\u0010?\u001a\u00020/2\u0014\u0010@\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0017\u0010A\u001a\u0004\u0018\u00018\u00012\u0006\u00101\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00106J.\u0010B\u001a\u00020'2\u001e\u0010(\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\u0012\u0004\u0012\u00020'0)H\u0080\b¢\u0006\u0002\bCJ\u0017\u0010D\u001a\u00020'2\u0006\u00104\u001a\u00028\u0001H\u0000¢\u0006\u0004\bE\u00102J\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007J\b\u0010G\u001a\u00020HH\u0016J5\u0010I\u001a\u00020/2*\u0010:\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010J\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010J0)H\u0082\bJ9\u0010K\u001a\u0002H9\"\u0004\b\u0002\u001092#\u0010:\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c\u0012\u0004\u0012\u0002H90)¢\u0006\u0002\bLH\u0082\b¢\u0006\u0002\u0010;J9\u0010M\u001a\u0002H9\"\u0004\b\u0002\u001092#\u0010:\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c\u0012\u0004\u0012\u0002H90)¢\u0006\u0002\bLH\u0082\b¢\u0006\u0002\u0010;J4\u0010N\u001a\u00020'*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c2\u0006\u0010O\u001a\u00020\u00182\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010JH\u0002J,\u0010Q\u001a\u00020\u0018*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c2\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010JH\u0002R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078AX\u0080\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r0\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c8@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0005\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001aR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010#X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006S"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "K", "V", "Landroidx/compose/runtime/snapshots/StateObject;", "", "()V", "debuggerDisplayValue", "", "getDebuggerDisplayValue$annotations", "getDebuggerDisplayValue", "()Ljava/util/Map;", "entries", "", "", "getEntries", "()Ljava/util/Set;", "<set-?>", "Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "keys", "getKeys", "modification", "", "getModification$runtime_release", "()I", "readable", "Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "getReadable$runtime_release$annotations", "getReadable$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "size", "getSize", "values", "", "getValues", "()Ljava/util/Collection;", "all", "", "predicate", "Lkotlin/Function1;", "", "all$runtime_release", "any", "any$runtime_release", "clear", "", "containsKey", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "mutate", "R", "block", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "prependStateRecord", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", "remove", "removeIf", "removeIf$runtime_release", "removeValue", "removeValue$runtime_release", "toMap", "toString", "", "update", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "withCurrent", "Lkotlin/ExtensionFunctionType;", "writable", "attemptUpdate", "currentModification", "newMap", "commitUpdate", "StateMapStateRecord", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SnapshotStateMap<K, V> implements StateObject, Map<K, V>, KMutableMap {
    public static final int $stable = 0;
    private final Set<Map.Entry<K, V>> entries;
    private StateRecord firstStateRecord;
    private final Set<K> keys;
    private final Collection<V> values;

    /* JADX INFO: compiled from: SnapshotStateMap.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B'\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\u0014\u0010\u0017\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "K", "V", "Landroidx/compose/runtime/snapshots/StateRecord;", "snapshotId", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "map", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "(JLandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)V", "getMap$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "setMap$runtime_release", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)V", "modification", "", "getModification$runtime_release", "()I", "setModification$runtime_release", "(I)V", "assign", "", "value", "create", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StateMapStateRecord<K, V> extends StateRecord {
        public static final int $stable = 0;
        private PersistentMap<K, ? extends V> map;
        private int modification;

        static {
            $stable = 8;
        }

        public final PersistentMap<K, V> getMap$runtime_release() {
            return this.map;
        }

        public final void setMap$runtime_release(PersistentMap<K, ? extends V> r1) {
            this.map = r1;
        }

        public StateMapStateRecord(long snapshotId, PersistentMap<K, ? extends V> r3) {
            super(snapshotId);
            this.map = r3;
        }

        public final int getModification$runtime_release() {
            return this.modification;
        }

        public final void setModification$runtime_release(int r1) {
            this.modification = r1;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord value) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            StateMapStateRecord other = (StateMapStateRecord) value;
            Object lock$iv = SnapshotStateMapKt.access$getSync$p();
            monitor-enter(lock$iv);
            this.map = other.map;     // Catch: Throwable -> L8
            this.modification = other.modification;     // Catch: Throwable -> L8
            Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L8
            monitor-exit(lock$iv);
            return;
        L8:
            th = move-exception;
            throw th;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new StateMapStateRecord(SnapshotKt.currentSnapshot().getSnapshotId(), this.map);
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create(long snapshotId) {
            return new StateMapStateRecord(snapshotId, this.map);
        }
    }

    static {
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    public SnapshotStateMap() {
        PersistentMap map = ExtensionsKt.persistentHashMapOf();
        Snapshot snapshot = SnapshotKt.currentSnapshot();
        StateMapStateRecord it = new StateMapStateRecord(snapshot.getSnapshotId(), map);
        if ((snapshot instanceof GlobalSnapshot) == true) goto L5;
        it.setNext$runtime_release(new StateMapStateRecord(SnapshotId_jvmKt.toSnapshotId(1), map));
    L5:
        this.firstStateRecord = it;
        this.entries = new SnapshotMapEntrySet(this);
        this.keys = new SnapshotMapKeySet(this);
        this.values = new SnapshotMapValueSet(this);
    }

    public static final /* synthetic */ boolean access$attemptUpdate(SnapshotStateMap $this, StateMapStateRecord $receiver, int currentModification, PersistentMap newMap) {
        return $this.attemptUpdate($receiver, currentModification, newMap);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord value) {
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.firstStateRecord = (StateMapStateRecord) value;
    }

    public final Map<K, V> toMap() {
        return getReadable$runtime_release().getMap$runtime_release();
    }

    public int getSize() {
        return getReadable$runtime_release().getMap$runtime_release().size();
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return getReadable$runtime_release().getMap$runtime_release().containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return getReadable$runtime_release().getMap$runtime_release().containsValue(value);
    }

    @Override // java.util.Map
    public V get(Object r2) {
        return (V) getReadable$runtime_release().getMap$runtime_release().get(r2);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getReadable$runtime_release().getMap$runtime_release().isEmpty();
    }

    public Set<Map.Entry<K, V>> getEntries() {
        return this.entries;
    }

    public Set<K> getKeys() {
        return this.keys;
    }

    public Collection<V> getValues() {
        return this.values;
    }

    public String toString() {
        StateRecord r0 = getFirstStateRecord();
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateRecord $this$withCurrent$iv = (StateMapStateRecord) r0;
        StateMapStateRecord it = (StateMapStateRecord) SnapshotKt.current($this$withCurrent$iv);
        return "SnapshotStateMap(value=" + it.getMap$runtime_release() + ")@" + hashCode();
    }

    @Override // java.util.Map
    public void clear() {
        StateRecord r0 = getFirstStateRecord();
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateRecord $this$withCurrent$iv$iv$iv = (StateMapStateRecord) r0;
        StateMapStateRecord $this$update_u24lambda_u2416$iv = (StateMapStateRecord) SnapshotKt.current($this$withCurrent$iv$iv$iv);
        $this$update_u24lambda_u2416$iv.getMap$runtime_release();
        PersistentMap<K, ? extends V> r1 = ExtensionsKt.persistentHashMapOf();
        if (r1 == $this$update_u24lambda_u2416$iv.getMap$runtime_release()) goto L14;
        StateRecord r2 = getFirstStateRecord();
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateRecord $this$writable$iv$iv$iv = (StateMapStateRecord) r2;
        Object lock$iv$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv$iv);
        Snapshot r18 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L10
        commitUpdate((StateMapStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv$iv, this, r18), r1);     // Catch: Throwable -> L10
        monitor-exit(lock$iv$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r18, this);
        return;
    L10:
        th = move-exception;
        throw th;
    }

    @Override // java.util.Map
    public V put(K r22, V r23) {
    L3:
        Object lock$iv$iv = SnapshotStateMapKt.access$getSync$p();
        monitor-enter(lock$iv$iv);
        StateRecord r10 = getFirstStateRecord();     // Catch: Throwable -> L23
        Intrinsics.checkNotNull(r10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");     // Catch: Throwable -> L23
        StateRecord $this$withCurrent$iv$iv$iv = (StateMapStateRecord) r10;     // Catch: Throwable -> L23
        StateMapStateRecord current$iv = (StateMapStateRecord) SnapshotKt.current($this$withCurrent$iv$iv$iv);     // Catch: Throwable -> L23
        PersistentMap<K, V> r8 = current$iv.getMap$runtime_release();     // Catch: Throwable -> L23
        int currentModification$iv = current$iv.getModification$runtime_release();     // Catch: Throwable -> L23
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L23
        monitor-exit(lock$iv$iv);
        Intrinsics.checkNotNull(r8);
        PersistentMap.Builder<K, V> r6 = r8.builder();
        PersistentMap.Builder<K, V> it = r6;
        V r1 = it.put(r22, r23);
        PersistentMap<K, V> r7 = r6.build();
        if (Intrinsics.areEqual(r7, r8) == true) goto L22;
        StateRecord r2 = getFirstStateRecord();
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateRecord $this$writable$iv$iv$iv = (StateMapStateRecord) r2;
        Object lock$iv$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv$iv);
        Snapshot r18 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L18
        StateMapStateRecord $this$mutate_u24lambda_u2413$iv = (StateMapStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv$iv, this, r18);     // Catch: Throwable -> L18
        boolean r20 = access$attemptUpdate(this, $this$mutate_u24lambda_u2413$iv, currentModification$iv, r7);     // Catch: Throwable -> L18
        monitor-exit(lock$iv$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r18, this);
        if (r20 == false) goto L3;
    L18:
        th = move-exception;
        throw th;
    L22:
        return r1;
    L23:
        th = move-exception;
        throw th;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> r21) {
    L3:
        Object lock$iv$iv = SnapshotStateMapKt.access$getSync$p();
        monitor-enter(lock$iv$iv);
        StateRecord r10 = getFirstStateRecord();     // Catch: Throwable -> L23
        Intrinsics.checkNotNull(r10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");     // Catch: Throwable -> L23
        StateRecord $this$withCurrent$iv$iv$iv = (StateMapStateRecord) r10;     // Catch: Throwable -> L23
        StateMapStateRecord current$iv = (StateMapStateRecord) SnapshotKt.current($this$withCurrent$iv$iv$iv);     // Catch: Throwable -> L23
        PersistentMap<K, V> r8 = current$iv.getMap$runtime_release();     // Catch: Throwable -> L23
        int currentModification$iv = current$iv.getModification$runtime_release();     // Catch: Throwable -> L23
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L23
        monitor-exit(lock$iv$iv);
        Intrinsics.checkNotNull(r8);
        PersistentMap.Builder<K, V> r6 = r8.builder();
        PersistentMap.Builder<K, V> it = r6;
        it.putAll(r21);
        Unit r1 = Unit.INSTANCE;
        PersistentMap<K, V> r7 = r6.build();
        if (Intrinsics.areEqual(r7, r8) == true) goto L22;
        StateRecord r2 = getFirstStateRecord();
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateRecord $this$writable$iv$iv$iv = (StateMapStateRecord) r2;
        Object lock$iv$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv$iv);
        Snapshot r17 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L18
        StateMapStateRecord $this$mutate_u24lambda_u2413$iv = (StateMapStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv$iv, this, r17);     // Catch: Throwable -> L18
        boolean r19 = access$attemptUpdate(this, $this$mutate_u24lambda_u2413$iv, currentModification$iv, r7);     // Catch: Throwable -> L18
        monitor-exit(lock$iv$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r17, this);
        if (r19 == false) goto L3;
        return;
    L18:
        th = move-exception;
        throw th;
    L22:
        return;
    L23:
        th = move-exception;
        throw th;
    }

    @Override // java.util.Map
    public V remove(Object key) {
    L3:
        Object lock$iv$iv = SnapshotStateMapKt.access$getSync$p();
        monitor-enter(lock$iv$iv);
        StateRecord r10 = getFirstStateRecord();     // Catch: Throwable -> L23
        Intrinsics.checkNotNull(r10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");     // Catch: Throwable -> L23
        StateRecord $this$withCurrent$iv$iv$iv = (StateMapStateRecord) r10;     // Catch: Throwable -> L23
        StateMapStateRecord current$iv = (StateMapStateRecord) SnapshotKt.current($this$withCurrent$iv$iv$iv);     // Catch: Throwable -> L23
        PersistentMap<K, V> r8 = current$iv.getMap$runtime_release();     // Catch: Throwable -> L23
        int currentModification$iv = current$iv.getModification$runtime_release();     // Catch: Throwable -> L23
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L23
        monitor-exit(lock$iv$iv);
        Intrinsics.checkNotNull(r8);
        PersistentMap.Builder<K, V> r6 = r8.builder();
        PersistentMap.Builder<K, V> it = r6;
        V r1 = it.remove(key);
        PersistentMap<K, V> r7 = r6.build();
        if (Intrinsics.areEqual(r7, r8) == true) goto L22;
        StateRecord r2 = getFirstStateRecord();
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateRecord $this$writable$iv$iv$iv = (StateMapStateRecord) r2;
        Object lock$iv$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv$iv);
        Snapshot r17 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L18
        StateMapStateRecord $this$mutate_u24lambda_u2413$iv = (StateMapStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv$iv, this, r17);     // Catch: Throwable -> L18
        boolean r19 = access$attemptUpdate(this, $this$mutate_u24lambda_u2413$iv, currentModification$iv, r7);     // Catch: Throwable -> L18
        monitor-exit(lock$iv$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r17, this);
        if (r19 == false) goto L3;
    L18:
        th = move-exception;
        throw th;
    L22:
        return r1;
    L23:
        th = move-exception;
        throw th;
    }

    public final int getModification$runtime_release() {
        return getReadable$runtime_release().getModification$runtime_release();
    }

    public final boolean removeValue$runtime_release(V r8) {
        Iterable $this$firstOrNull$iv = entrySet();
        Iterator r2 = $this$firstOrNull$iv.iterator();
    L4:
        if (r2.hasNext() == false) goto L8;
        Object element$iv = r2.next();
        if (Intrinsics.areEqual(((Map.Entry) element$iv).getValue(), r8) == false) goto L4;
    L9:
        Map.Entry it = (Map.Entry) element$iv;
        if (it == null) goto L12;
        remove(it.getKey());
        return true;
    L12:
        return false;
    L8:
        element$iv = null;
        goto L9
    }

    public final StateMapStateRecord<K, V> getReadable$runtime_release() {
        StateRecord r0 = getFirstStateRecord();
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (StateMapStateRecord) SnapshotKt.readable((StateMapStateRecord) r0, this);
    }

    public final boolean removeIf$runtime_release(Function1<? super Map.Entry<K, V>, Boolean> r23) {
        boolean removed = false;
    L3:
        Object lock$iv$iv = SnapshotStateMapKt.access$getSync$p();
        monitor-enter(lock$iv$iv);
        StateRecord r12 = getFirstStateRecord();     // Catch: Throwable -> L29
        Intrinsics.checkNotNull(r12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");     // Catch: Throwable -> L29
        StateRecord $this$withCurrent$iv$iv$iv = (StateMapStateRecord) r12;     // Catch: Throwable -> L29
        StateMapStateRecord current$iv = (StateMapStateRecord) SnapshotKt.current($this$withCurrent$iv$iv$iv);     // Catch: Throwable -> L29
        PersistentMap<K, V> r10 = current$iv.getMap$runtime_release();     // Catch: Throwable -> L29
        int currentModification$iv = current$iv.getModification$runtime_release();     // Catch: Throwable -> L29
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L29
        monitor-exit(lock$iv$iv);
        Intrinsics.checkNotNull(r10);
        PersistentMap.Builder<K, V> r8 = r10.builder();
        PersistentMap.Builder<K, V> it = r8;
        Iterator<Map.Entry<K, V>> r11 = entrySet().iterator();
    L10:
        if (r11.hasNext() == false) goto L14;
        Map.Entry<K, V> r13 = r11.next();
        if (r23.invoke(r13).booleanValue() == false) goto L10;
        it.remove(r13.getKey());
        removed = true;
        goto L10
    L14:
        Unit r1 = Unit.INSTANCE;
        PersistentMap<K, V> r9 = r8.build();
        if (Intrinsics.areEqual(r9, r10) == true) goto L28;
        StateRecord r2 = getFirstStateRecord();
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateRecord $this$writable$iv$iv$iv = (StateMapStateRecord) r2;
        Object lock$iv$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv$iv);
        Snapshot r19 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L24
        StateMapStateRecord $this$mutate_u24lambda_u2413$iv = (StateMapStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv$iv, this, r19);     // Catch: Throwable -> L24
        boolean r21 = access$attemptUpdate(this, $this$mutate_u24lambda_u2413$iv, currentModification$iv, r9);     // Catch: Throwable -> L24
        monitor-exit(lock$iv$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r19, this);
        if (r21 == false) goto L3;
    L24:
        th = move-exception;
        throw th;
    L28:
        return removed;
    L29:
        th = move-exception;
        throw th;
    }

    public final boolean any$runtime_release(Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> r5) {
        Iterator<E> r1 = ((ImmutableSet) getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator();
    L4:
        if (r1.hasNext() == false) goto L9;
        Map.Entry entry = (Map.Entry) r1.next();
        if (r5.invoke(entry).booleanValue() == false) goto L4;
        return true;
    L9:
        return false;
    }

    public final boolean all$runtime_release(Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> r5) {
        Iterator<E> r1 = ((ImmutableSet) getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator();
    L4:
        if (r1.hasNext() == false) goto L9;
        Map.Entry entry = (Map.Entry) r1.next();
        if (r5.invoke(entry).booleanValue() == true) goto L4;
        return false;
    L9:
        return true;
    }

    public final Map<K, V> getDebuggerDisplayValue() {
        StateRecord r2 = getFirstStateRecord();
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateRecord $this$withCurrent$iv$iv = (StateMapStateRecord) r2;
        StateMapStateRecord $this$_get_debuggerDisplayValue__u24lambda_u2410 = (StateMapStateRecord) SnapshotKt.current($this$withCurrent$iv$iv);
        return $this$_get_debuggerDisplayValue__u24lambda_u2410.getMap$runtime_release();
    }

    private final <R> R withCurrent(Function1<? super StateMapStateRecord<K, V>, ? extends R> r5) {
        StateRecord r1 = getFirstStateRecord();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateRecord $this$withCurrent$iv = (StateMapStateRecord) r1;
        return r5.invoke(SnapshotKt.current($this$withCurrent$iv));
    }

    private final <R> R writable(Function1<? super StateMapStateRecord<K, V>, ? extends R> r10) {
        StateRecord r1 = getFirstStateRecord();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateRecord $this$writable$iv = (StateMapStateRecord) r1;
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

    private final <R> R mutate(Function1<? super Map<K, V>, ? extends R> r21) {
        int $i$f$mutate = 0;
    L3:
        Object lock$iv = SnapshotStateMapKt.access$getSync$p();
        monitor-enter(lock$iv);
        StateRecord r9 = getFirstStateRecord();     // Catch: Throwable -> L29
        Intrinsics.checkNotNull(r9, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");     // Catch: Throwable -> L29
        StateRecord $this$withCurrent$iv$iv = (StateMapStateRecord) r9;     // Catch: Throwable -> L29
        StateMapStateRecord current = (StateMapStateRecord) SnapshotKt.current($this$withCurrent$iv$iv);     // Catch: Throwable -> L29
        PersistentMap<K, V> r7 = current.getMap$runtime_release();     // Catch: Throwable -> L29
        int currentModification = current.getModification$runtime_release();     // Catch: Throwable -> L29
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L29
        monitor-exit(lock$iv);
        Intrinsics.checkNotNull(r7);
        PersistentMap.Builder<K, V> r5 = r7.builder();
        R r2 = r21.invoke(r5);
        PersistentMap<K, V> r6 = r5.build();
        if (Intrinsics.areEqual(r6, r7) == true) goto L28;
        StateRecord r1 = getFirstStateRecord();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateRecord $this$writable$iv$iv = (StateMapStateRecord) r1;
        Object lock$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv);
        Snapshot r16 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L23
        StateMapStateRecord $this$mutate_u24lambda_u2413 = (StateMapStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv, this, r16);     // Catch: Throwable -> L23
        int $i$f$mutate2 = $i$f$mutate;
        boolean r19 = access$attemptUpdate(this, $this$mutate_u24lambda_u2413, currentModification, r6);     // Catch: Throwable -> L21
        monitor-exit(lock$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r16, this);
        if (r19 == true) goto L28;
        $i$f$mutate = $i$f$mutate2;
    L21:
        th = th;
    L25:
        monitor-exit(lock$iv$iv$iv$iv);
        throw th;
    L23:
        th = th;
    L28:
        return r2;
    L29:
        th = move-exception;
        throw th;
    }

    private final boolean attemptUpdate(StateMapStateRecord<K, V> r6, int currentModification, PersistentMap<K, ? extends V> r8) {
        Object lock$iv = SnapshotStateMapKt.access$getSync$p();
        monitor-enter(lock$iv);
    L12:
        th = move-exception;
        throw th;
    L6:
        if (r6.getModification$runtime_release() != currentModification) goto L9;
        r6.setMap$runtime_release(r8);     // Catch: Throwable -> L12
        boolean r4 = true;
        r6.setModification$runtime_release(r6.getModification$runtime_release() + 1);     // Catch: Throwable -> L12
    L10:
        monitor-exit(lock$iv);
        return r4;
    L9:
        r4 = false;
        goto L10
    }

    private final void update(Function1<? super PersistentMap<K, ? extends V>, ? extends PersistentMap<K, ? extends V>> r23) {
        StateRecord r0 = getFirstStateRecord();
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateRecord $this$withCurrent$iv$iv = (StateMapStateRecord) r0;
        StateMapStateRecord $this$update_u24lambda_u2416 = (StateMapStateRecord) SnapshotKt.current($this$withCurrent$iv$iv);
        PersistentMap<K, ? extends V> r9 = r23.invoke($this$update_u24lambda_u2416.getMap$runtime_release());
        if (r9 == $this$update_u24lambda_u2416.getMap$runtime_release()) goto L20;
        StateRecord r1 = getFirstStateRecord();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateRecord $this$writable$iv$iv = (StateMapStateRecord) r1;
        Object lock$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv);
        Snapshot r18 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L14
        commitUpdate((StateMapStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv, this, r18), r9);     // Catch: Throwable -> L12
        monitor-exit(lock$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r18, this);
        return;
    L12:
        th = th;
    L16:
        monitor-exit(lock$iv$iv$iv$iv);
        throw th;
    L14:
        th = th;
        goto L16
    }

    private final int commitUpdate(StateMapStateRecord<K, V> r6, PersistentMap<K, ? extends V> r7) {
        Object lock$iv = SnapshotStateMapKt.access$getSync$p();
        monitor-enter(lock$iv);
        r6.setMap$runtime_release(r7);     // Catch: Throwable -> L8
        int r3 = r6.getModification$runtime_release();     // Catch: Throwable -> L8
        r6.setModification$runtime_release(r3 + 1);     // Catch: Throwable -> L8
        monitor-exit(lock$iv);
        return r3;
    L8:
        th = move-exception;
        throw th;
    }
}
