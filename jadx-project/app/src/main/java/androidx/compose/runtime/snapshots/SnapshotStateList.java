package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;

/* JADX INFO: compiled from: SnapshotStateList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0001ZB\u0007\b\u0016¢\u0006\u0002\u0010\u0006B\u0015\b\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u0015\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\"J\u001d\u0010\u001f\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010!\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010%J\u001e\u0010&\u001a\u00020 2\u0006\u0010$\u001a\u00020\u001a2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016J\u0016\u0010&\u001a\u00020 2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016J\b\u0010)\u001a\u00020#H\u0016J3\u0010*\u001a\u00020 2\b\b\u0002\u0010+\u001a\u00020 2\u001e\u0010,\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0-H\u0082\bJ\u0016\u0010.\u001a\u00020 2\u0006\u0010!\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\"J\u0016\u0010/\u001a\u00020 2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016J\u0016\u00100\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u001aH\u0096\u0002¢\u0006\u0002\u00101J\u0015\u00102\u001a\u00020\u001a2\u0006\u0010!\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00103J\b\u00104\u001a\u00020 H\u0016J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0096\u0002J\u0015\u00107\u001a\u00020\u001a2\u0006\u0010!\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00103J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0016J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00028\u0000092\u0006\u0010$\u001a\u00020\u001aH\u0016J.\u0010:\u001a\u0002H;\"\u0004\b\u0001\u0010;2\u0018\u0010,\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u0002H;0-H\u0082\b¢\u0006\u0002\u0010<J\"\u0010=\u001a\u00020 2\u0018\u0010,\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020 0-H\u0002J\u0010\u0010>\u001a\u00020#2\u0006\u0010?\u001a\u00020\u0010H\u0016J\u0015\u0010@\u001a\u00020 2\u0006\u0010!\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\"J\u0016\u0010A\u001a\u00020 2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016J\u0015\u0010B\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u001aH\u0016¢\u0006\u0002\u00101J\u0016\u0010C\u001a\u00020#2\u0006\u0010D\u001a\u00020\u001a2\u0006\u0010E\u001a\u00020\u001aJ\u0016\u0010F\u001a\u00020 2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016J+\u0010G\u001a\u00020\u001a2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010H\u001a\u00020\u001a2\u0006\u0010I\u001a\u00020\u001aH\u0000¢\u0006\u0002\bJJ\u001e\u0010K\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010!\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010LJ\u0016\u0010M\u001a\u00020\u00102\f\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002J\u001e\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010D\u001a\u00020\u001a2\u0006\u0010E\u001a\u00020\u001aH\u0016J\f\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bJ\b\u0010Q\u001a\u00020RH\u0016J3\u0010S\u001a\u00020#2\b\b\u0002\u0010+\u001a\u00020 2\u001e\u0010,\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0-H\u0082\bJ3\u0010T\u001a\u0002H;\"\u0004\b\u0001\u0010;2\u001d\u0010,\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0004\u0012\u0002H;0-¢\u0006\u0002\bUH\u0082\b¢\u0006\u0002\u0010<J3\u0010V\u001a\u0002H;\"\u0004\b\u0001\u0010;2\u001d\u0010,\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0004\u0012\u0002H;0-¢\u0006\u0002\bUH\u0082\b¢\u0006\u0002\u0010<J0\u0010W\u001a\u00020 *\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010X\u001a\u00020\u001a2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010+\u001a\u00020 H\u0002R \u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8AX\u0080\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u0006["}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "Landroidx/compose/runtime/snapshots/StateObject;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "()V", "persistentList", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V", "debuggerDisplayValue", "", "getDebuggerDisplayValue$annotations", "getDebuggerDisplayValue", "()Ljava/util/List;", "<set-?>", "Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "readable", "Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "getReadable$runtime_release$annotations", "getReadable$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "size", "", "getSize", "()I", "structure", "getStructure$runtime_release", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "conditionalUpdate", "structural", "block", "Lkotlin/Function1;", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "mutate", "R", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "mutateBoolean", "prependStateRecord", "value", "remove", "removeAll", "removeAt", "removeRange", "fromIndex", "toIndex", "retainAll", "retainAllInRange", "start", "end", "retainAllInRange$runtime_release", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "stateRecordWith", "list", "subList", "toList", "toString", "", "update", "withCurrent", "Lkotlin/ExtensionFunctionType;", "writable", "attemptUpdate", "currentModification", "newList", "StateListStateRecord", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SnapshotStateList<T> implements StateObject, List<T>, RandomAccess, KMutableList {
    public static final int $stable = 0;
    private StateRecord firstStateRecord;

    /* JADX INFO: compiled from: SnapshotStateList.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B!\b\u0000\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\u0014\u0010\u0019\u001a\u00020\u00022\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "snapshotId", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "list", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "(JLandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V", "getList$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "setList$runtime_release", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V", "modification", "", "getModification$runtime_release", "()I", "setModification$runtime_release", "(I)V", "structuralChange", "getStructuralChange$runtime_release", "setStructuralChange$runtime_release", "assign", "", "value", "create", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StateListStateRecord<T> extends StateRecord {
        public static final int $stable = 0;
        private PersistentList<? extends T> list;
        private int modification;
        private int structuralChange;

        static {
            $stable = 8;
        }

        public final PersistentList<T> getList$runtime_release() {
            return this.list;
        }

        public final void setList$runtime_release(PersistentList<? extends T> r1) {
            this.list = r1;
        }

        public StateListStateRecord(long snapshotId, PersistentList<? extends T> r3) {
            super(snapshotId);
            this.list = r3;
        }

        public final int getModification$runtime_release() {
            return this.modification;
        }

        public final void setModification$runtime_release(int r1) {
            this.modification = r1;
        }

        public final int getStructuralChange$runtime_release() {
            return this.structuralChange;
        }

        public final void setStructuralChange$runtime_release(int r1) {
            this.structuralChange = r1;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord value) {
            Object lock$iv = SnapshotStateListKt.access$getSync$p();
            monitor-enter(lock$iv);
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord>");     // Catch: Throwable -> L8
            this.list = ((StateListStateRecord) value).list;     // Catch: Throwable -> L8
            this.modification = ((StateListStateRecord) value).modification;     // Catch: Throwable -> L8
            this.structuralChange = ((StateListStateRecord) value).structuralChange;     // Catch: Throwable -> L8
            Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L8
            monitor-exit(lock$iv);
            return;
        L8:
            th = move-exception;
            throw th;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return create(SnapshotKt.currentSnapshot().getSnapshotId());
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create(long snapshotId) {
            return new StateListStateRecord(snapshotId, this.list);
        }
    }

    static {
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] r2) {
        return (T[]) CollectionToArray.toArray(this, r2);
    }

    public SnapshotStateList(PersistentList<? extends T> r2) {
        this.firstStateRecord = stateRecordWith(r2);
    }

    public static final /* synthetic */ boolean access$attemptUpdate(SnapshotStateList $this, StateListStateRecord $receiver, int currentModification, PersistentList newList, boolean structural) {
        return $this.attemptUpdate($receiver, currentModification, newList, structural);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int index) {
        return removeAt(index);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    public SnapshotStateList() {
        this(ExtensionsKt.persistentListOf());
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord value) {
        value.setNext$runtime_release(getFirstStateRecord());
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.firstStateRecord = (StateListStateRecord) value;
    }

    public final List<T> toList() {
        return getReadable$runtime_release().getList$runtime_release();
    }

    public final int getStructure$runtime_release() {
        StateRecord r2 = getFirstStateRecord();
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateRecord $this$withCurrent$iv$iv = (StateListStateRecord) r2;
        StateListStateRecord $this$_get_structure__u24lambda_u240 = (StateListStateRecord) SnapshotKt.current($this$withCurrent$iv$iv);
        return $this$_get_structure__u24lambda_u240.getStructuralChange$runtime_release();
    }

    public final StateListStateRecord<T> getReadable$runtime_release() {
        StateRecord r0 = getFirstStateRecord();
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (StateListStateRecord) SnapshotKt.readable((StateListStateRecord) r0, this);
    }

    public int getSize() {
        return getReadable$runtime_release().getList$runtime_release().size();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return getReadable$runtime_release().getList$runtime_release().contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> r2) {
        return getReadable$runtime_release().getList$runtime_release().containsAll(r2);
    }

    @Override // java.util.List
    public T get(int r2) {
        return (T) getReadable$runtime_release().getList$runtime_release().get(r2);
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        return getReadable$runtime_release().getList$runtime_release().indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return getReadable$runtime_release().getList$runtime_release().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        return getReadable$runtime_release().getList$runtime_release().lastIndexOf(element);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return new StateListIterator(this, 0);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int index) {
        return new StateListIterator(this, index);
    }

    @Override // java.util.List
    public List<T> subList(int fromIndex, int toIndex) {
        boolean value$iv = true;
        if (fromIndex < 0) goto L6;
        if (fromIndex > toIndex) goto L6;
        boolean r2 = true;
    L7:
        if (r2 == true) goto L9;
    L11:
        value$iv = false;
    L13:
        if (value$iv == true) goto L16;
        PreconditionsKt.throwIllegalArgumentException("fromIndex or toIndex are out of bounds");
    L16:
        return new SubList(this, fromIndex, toIndex);
    L9:
        if (toIndex > size()) goto L11;
    L6:
        r2 = false;
        goto L7
    }

    public String toString() {
        StateRecord r0 = getFirstStateRecord();
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateRecord $this$withCurrent$iv = (StateListStateRecord) r0;
        StateListStateRecord it = (StateListStateRecord) SnapshotKt.current($this$withCurrent$iv);
        return "SnapshotStateList(value=" + it.getList$runtime_release() + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T r22) {
        SnapshotStateList<T> r3 = this;
    L3:
        Object lock$iv$iv = SnapshotStateListKt.access$getSync$p();
        monitor-enter(lock$iv$iv);
        StateRecord r12 = r3.getFirstStateRecord();     // Catch: Throwable -> L24
        Intrinsics.checkNotNull(r12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");     // Catch: Throwable -> L24
        StateRecord $this$withCurrent$iv$iv$iv = (StateListStateRecord) r12;     // Catch: Throwable -> L24
        StateListStateRecord current$iv = (StateListStateRecord) SnapshotKt.current($this$withCurrent$iv$iv$iv);     // Catch: Throwable -> L24
        int currentModification$iv = current$iv.getModification$runtime_release();     // Catch: Throwable -> L24
        PersistentList<T> r10 = current$iv.getList$runtime_release();     // Catch: Throwable -> L24
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L24
        monitor-exit(lock$iv$iv);
        Intrinsics.checkNotNull(r10);
        PersistentList<T> r1 = r10.add(r22);
        if (Intrinsics.areEqual(r1, r10) == true) goto L10;
        StateRecord r2 = r3.getFirstStateRecord();
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateRecord $this$writable$iv$iv$iv = (StateListStateRecord) r2;
        Object lock$iv$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv$iv);
        Snapshot r18 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L21
        StateListStateRecord $this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv = (StateListStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv$iv, r3, r18);     // Catch: Throwable -> L21
        boolean r20 = access$attemptUpdate(r3, $this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv, currentModification$iv, r1, true);     // Catch: Throwable -> L21
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

    @Override // java.util.List
    public void add(int index, T r26) {
        int $i$f$update = 0;
        SnapshotStateList<T> r5 = this;
    L3:
        Object lock$iv$iv$iv = SnapshotStateListKt.access$getSync$p();
        monitor-enter(lock$iv$iv$iv);
        StateRecord r14 = r5.getFirstStateRecord();     // Catch: Throwable -> L34
        Intrinsics.checkNotNull(r14, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");     // Catch: Throwable -> L34
        StateRecord $this$withCurrent$iv$iv$iv$iv = (StateListStateRecord) r14;     // Catch: Throwable -> L34
        StateListStateRecord current$iv$iv = (StateListStateRecord) SnapshotKt.current($this$withCurrent$iv$iv$iv$iv);     // Catch: Throwable -> L34
        int currentModification$iv$iv = current$iv$iv.getModification$runtime_release();     // Catch: Throwable -> L34
        PersistentList<T> r12 = current$iv$iv.getList$runtime_release();     // Catch: Throwable -> L34
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L34
        monitor-exit(lock$iv$iv$iv);
        Intrinsics.checkNotNull(r12);
        PersistentList<T> r1 = r12.add(index, r26);
        if (Intrinsics.areEqual(r1, r12) == true) goto L48;
        StateRecord r2 = r5.getFirstStateRecord();
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateRecord $this$writable$iv$iv$iv$iv = (StateListStateRecord) r2;
        Object lock$iv$iv$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv$iv$iv);
        Snapshot r21 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L30
        int $i$f$update2 = $i$f$update;
        StateListStateRecord $this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv$iv = (StateListStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv$iv$iv, r5, r21);     // Catch: Throwable -> L26
        boolean r23 = access$attemptUpdate(r5, $this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv$iv, currentModification$iv$iv, r1, true);     // Catch: Throwable -> L26
        monitor-exit(lock$iv$iv$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r21, r5);
        if (r23 == true) goto L24;
        $i$f$update = $i$f$update2;
        goto L3
    L24:
        return;
    L26:
        th = th;
    L32:
        monitor-exit(lock$iv$iv$iv$iv$iv$iv);
        throw th;
    L28:
        th = th;
    L30:
        th = th;
        goto L32
    L48:
        return;
    L34:
        th = move-exception;
        throw th;
    }

    @Override // java.util.List
    public boolean addAll(final int index, final Collection<? extends T> r3) {
        return mutateBoolean(new AnonymousClass1(index, r3));
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> r22) {
        SnapshotStateList<T> r3 = this;
    L3:
        Object lock$iv$iv = SnapshotStateListKt.access$getSync$p();
        monitor-enter(lock$iv$iv);
        StateRecord r12 = r3.getFirstStateRecord();     // Catch: Throwable -> L24
        Intrinsics.checkNotNull(r12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");     // Catch: Throwable -> L24
        StateRecord $this$withCurrent$iv$iv$iv = (StateListStateRecord) r12;     // Catch: Throwable -> L24
        StateListStateRecord current$iv = (StateListStateRecord) SnapshotKt.current($this$withCurrent$iv$iv$iv);     // Catch: Throwable -> L24
        int currentModification$iv = current$iv.getModification$runtime_release();     // Catch: Throwable -> L24
        PersistentList<T> r10 = current$iv.getList$runtime_release();     // Catch: Throwable -> L24
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L24
        monitor-exit(lock$iv$iv);
        Intrinsics.checkNotNull(r10);
        PersistentList<T> r1 = r10.addAll(r22);
        if (Intrinsics.areEqual(r1, r10) == true) goto L10;
        StateRecord r2 = r3.getFirstStateRecord();
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateRecord $this$writable$iv$iv$iv = (StateListStateRecord) r2;
        Object lock$iv$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv$iv);
        Snapshot r18 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L21
        StateListStateRecord $this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv = (StateListStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv$iv, r3, r18);     // Catch: Throwable -> L21
        boolean r20 = access$attemptUpdate(r3, $this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv, currentModification$iv, r1, true);     // Catch: Throwable -> L21
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

    @Override // java.util.List, java.util.Collection
    public void clear() {
        StateRecord r0 = getFirstStateRecord();
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateRecord $this$writable$iv$iv = (StateListStateRecord) r0;
        Object lock$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv);
        Snapshot r1 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L16
        StateListStateRecord $this$clear_u24lambda_u247 = (StateListStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv, this, r1);     // Catch: Throwable -> L16
        Object lock$iv = SnapshotStateListKt.access$getSync$p();     // Catch: Throwable -> L16
        monitor-enter(lock$iv);     // Catch: Throwable -> L16
        $this$clear_u24lambda_u247.setList$runtime_release(ExtensionsKt.persistentListOf());     // Catch: Throwable -> L13
        $this$clear_u24lambda_u247.setModification$runtime_release($this$clear_u24lambda_u247.getModification$runtime_release() + 1);     // Catch: Throwable -> L13
        $this$clear_u24lambda_u247.setStructuralChange$runtime_release($this$clear_u24lambda_u247.getStructuralChange$runtime_release() + 1);     // Catch: Throwable -> L13
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

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        SnapshotStateList<T> r3 = this;
    L3:
        Object lock$iv$iv = SnapshotStateListKt.access$getSync$p();
        monitor-enter(lock$iv$iv);
        StateRecord r12 = r3.getFirstStateRecord();     // Catch: Throwable -> L24
        Intrinsics.checkNotNull(r12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");     // Catch: Throwable -> L24
        StateRecord $this$withCurrent$iv$iv$iv = (StateListStateRecord) r12;     // Catch: Throwable -> L24
        StateListStateRecord current$iv = (StateListStateRecord) SnapshotKt.current($this$withCurrent$iv$iv$iv);     // Catch: Throwable -> L24
        int currentModification$iv = current$iv.getModification$runtime_release();     // Catch: Throwable -> L24
        PersistentList<T> r10 = current$iv.getList$runtime_release();     // Catch: Throwable -> L24
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L24
        monitor-exit(lock$iv$iv);
        Intrinsics.checkNotNull(r10);
        PersistentList<T> r1 = r10.remove(element);
        if (Intrinsics.areEqual(r1, r10) == true) goto L10;
        StateRecord r2 = r3.getFirstStateRecord();
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateRecord $this$writable$iv$iv$iv = (StateListStateRecord) r2;
        Object lock$iv$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv$iv);
        Snapshot r18 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L21
        StateListStateRecord $this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv = (StateListStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv$iv, r3, r18);     // Catch: Throwable -> L21
        boolean r20 = access$attemptUpdate(r3, $this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv, currentModification$iv, r1, true);     // Catch: Throwable -> L21
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

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> r22) {
        SnapshotStateList<T> r3 = this;
    L3:
        Object lock$iv$iv = SnapshotStateListKt.access$getSync$p();
        monitor-enter(lock$iv$iv);
        StateRecord r12 = r3.getFirstStateRecord();     // Catch: Throwable -> L24
        Intrinsics.checkNotNull(r12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");     // Catch: Throwable -> L24
        StateRecord $this$withCurrent$iv$iv$iv = (StateListStateRecord) r12;     // Catch: Throwable -> L24
        StateListStateRecord current$iv = (StateListStateRecord) SnapshotKt.current($this$withCurrent$iv$iv$iv);     // Catch: Throwable -> L24
        int currentModification$iv = current$iv.getModification$runtime_release();     // Catch: Throwable -> L24
        PersistentList<T> r10 = current$iv.getList$runtime_release();     // Catch: Throwable -> L24
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L24
        monitor-exit(lock$iv$iv);
        Intrinsics.checkNotNull(r10);
        PersistentList<T> r1 = r10.removeAll(r22);
        if (Intrinsics.areEqual(r1, r10) == true) goto L10;
        StateRecord r2 = r3.getFirstStateRecord();
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateRecord $this$writable$iv$iv$iv = (StateListStateRecord) r2;
        Object lock$iv$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv$iv);
        Snapshot r18 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L21
        StateListStateRecord $this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv = (StateListStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv$iv, r3, r18);     // Catch: Throwable -> L21
        boolean r20 = access$attemptUpdate(r3, $this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv, currentModification$iv, r1, true);     // Catch: Throwable -> L21
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

    public T removeAt(int index) {
        T r0 = get(index);
        Object it = r0;
        int r2 = 0;
        SnapshotStateList<T> r7 = this;
    L3:
        Object lock$iv$iv$iv = SnapshotStateListKt.access$getSync$p();
        monitor-enter(lock$iv$iv$iv);
        T r17 = r0;
        StateRecord r1 = r7.getFirstStateRecord();     // Catch: Throwable -> L38
        Object it2 = it;
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");     // Catch: Throwable -> L36
        StateRecord $this$withCurrent$iv$iv$iv$iv = (StateListStateRecord) r1;     // Catch: Throwable -> L36
        StateListStateRecord current$iv$iv = (StateListStateRecord) SnapshotKt.current($this$withCurrent$iv$iv$iv$iv);     // Catch: Throwable -> L36
        int currentModification$iv$iv = current$iv$iv.getModification$runtime_release();     // Catch: Throwable -> L36
        PersistentList<T> r3 = current$iv$iv.getList$runtime_release();     // Catch: Throwable -> L36
        Unit r4 = Unit.INSTANCE;     // Catch: Throwable -> L36
        monitor-exit(lock$iv$iv$iv);
        Intrinsics.checkNotNull(r3);
        PersistentList<T> r5 = r3.removeAt(index);
        if (Intrinsics.areEqual(r5, r3) == true) goto L26;
        StateRecord r6 = r7.getFirstStateRecord();
        Intrinsics.checkNotNull(r6, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateRecord $this$writable$iv$iv$iv$iv = (StateListStateRecord) r6;
        Object lock$iv$iv$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv$iv$iv);
        Snapshot r23 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L32
        int r24 = r2;
        StateListStateRecord $this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv$iv = (StateListStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv$iv$iv, r7, r23);     // Catch: Throwable -> L28
        boolean r25 = access$attemptUpdate(r7, $this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv$iv, currentModification$iv$iv, r5, true);     // Catch: Throwable -> L28
        monitor-exit(lock$iv$iv$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r23, r7);
        if (r25 == true) goto L26;
        r0 = r17;
        it = it2;
        r2 = r24;
    L28:
        th = th;
    L34:
        monitor-exit(lock$iv$iv$iv$iv$iv$iv);
        throw th;
    L30:
        th = th;
    L32:
        th = th;
    L26:
        return r17;
    L36:
        th = th;
    L40:
        monitor-exit(lock$iv$iv$iv);
        throw th;
    L38:
        th = th;
        goto L40
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(final Collection<? extends Object> r2) {
        return mutateBoolean(new C06241(r2));
    }

    @Override // java.util.List
    public T set(int index, T r30) {
        T r0 = get(index);
        Object it = r0;
        int r2 = 0;
        SnapshotStateList<T> r4 = this;
        SnapshotStateList<T> r8 = r4;
    L3:
        Object lock$iv$iv$iv = SnapshotStateListKt.access$getSync$p();
        monitor-enter(lock$iv$iv$iv);
        T r18 = r0;
        StateRecord r1 = r8.getFirstStateRecord();     // Catch: Throwable -> L38
        Object it2 = it;
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");     // Catch: Throwable -> L36
        StateRecord $this$withCurrent$iv$iv$iv$iv = (StateListStateRecord) r1;     // Catch: Throwable -> L36
        StateListStateRecord current$iv$iv = (StateListStateRecord) SnapshotKt.current($this$withCurrent$iv$iv$iv$iv);     // Catch: Throwable -> L36
        int currentModification$iv$iv = current$iv$iv.getModification$runtime_release();     // Catch: Throwable -> L36
        PersistentList<T> r3 = current$iv$iv.getList$runtime_release();     // Catch: Throwable -> L36
        Unit r5 = Unit.INSTANCE;     // Catch: Throwable -> L36
        monitor-exit(lock$iv$iv$iv);
        Intrinsics.checkNotNull(r3);
        PersistentList<T> r6 = r3.set(index, r30);
        if (Intrinsics.areEqual(r6, r3) == true) goto L26;
        StateRecord r7 = r8.getFirstStateRecord();
        int r17 = r2;
        Intrinsics.checkNotNull(r7, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateRecord $this$writable$iv$iv$iv$iv = (StateListStateRecord) r7;
        Object lock$iv$iv$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv$iv$iv);
        Snapshot r25 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L32
        SnapshotStateList<T> r26 = r4;
        StateListStateRecord $this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv$iv = (StateListStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv$iv$iv, r8, r25);     // Catch: Throwable -> L28
        boolean r27 = access$attemptUpdate(r8, $this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv$iv, currentModification$iv$iv, r6, false);     // Catch: Throwable -> L28
        monitor-exit(lock$iv$iv$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r25, r8);
        if (r27 == true) goto L26;
        r2 = r17;
        r0 = r18;
        it = it2;
        r4 = r26;
    L28:
        th = th;
    L34:
        monitor-exit(lock$iv$iv$iv$iv$iv$iv);
        throw th;
    L30:
        th = th;
    L32:
        th = th;
    L26:
        return r18;
    L36:
        th = th;
    L40:
        monitor-exit(lock$iv$iv$iv);
        throw th;
    L38:
        th = th;
        goto L40
    }

    public final void removeRange(int fromIndex, int toIndex) {
        int $i$f$mutate = 0;
    L3:
        Object lock$iv$iv = SnapshotStateListKt.access$getSync$p();
        monitor-enter(lock$iv$iv);
        StateRecord r10 = getFirstStateRecord();     // Catch: Throwable -> L30
        Intrinsics.checkNotNull(r10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");     // Catch: Throwable -> L30
        StateRecord $this$withCurrent$iv$iv$iv = (StateListStateRecord) r10;     // Catch: Throwable -> L30
        StateListStateRecord current$iv = (StateListStateRecord) SnapshotKt.current($this$withCurrent$iv$iv$iv);     // Catch: Throwable -> L30
        int currentModification$iv = current$iv.getModification$runtime_release();     // Catch: Throwable -> L30
        PersistentList<T> r8 = current$iv.getList$runtime_release();     // Catch: Throwable -> L30
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L30
        monitor-exit(lock$iv$iv);
        Intrinsics.checkNotNull(r8);
        PersistentList.Builder<T> r6 = r8.builder();
        PersistentList.Builder<T> it = r6;
        it.subList(fromIndex, toIndex).clear();
        Unit r1 = Unit.INSTANCE;
        PersistentList<? extends T> r7 = r6.build();
        if (Intrinsics.areEqual(r7, r8) == true) goto L29;
        StateRecord r2 = getFirstStateRecord();
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateRecord $this$writable$iv$iv$iv = (StateListStateRecord) r2;
        Object lock$iv$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv$iv);
        Snapshot r18 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L23
        int $i$f$mutate2 = $i$f$mutate;
        boolean r3 = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv$iv, this, r18), currentModification$iv, r7, true);     // Catch: Throwable -> L21
        monitor-exit(lock$iv$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r18, this);
        if (r3 == true) goto L42;
        $i$f$mutate = $i$f$mutate2;
        goto L3
    L42:
        return;
    L21:
        th = th;
    L25:
        monitor-exit(lock$iv$iv$iv$iv$iv);
        throw th;
    L23:
        th = th;
        goto L25
    L29:
        return;
    L30:
        th = move-exception;
        throw th;
    }

    public final int retainAllInRange$runtime_release(Collection<? extends T> r24, int start, int end) {
        int startSize = size();
        int $i$f$mutate = 0;
    L3:
        Object lock$iv$iv = SnapshotStateListKt.access$getSync$p();
        monitor-enter(lock$iv$iv);
        StateRecord r11 = getFirstStateRecord();     // Catch: Throwable -> L38
        Intrinsics.checkNotNull(r11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");     // Catch: Throwable -> L38
        StateRecord $this$withCurrent$iv$iv$iv = (StateListStateRecord) r11;     // Catch: Throwable -> L38
        StateListStateRecord current$iv = (StateListStateRecord) SnapshotKt.current($this$withCurrent$iv$iv$iv);     // Catch: Throwable -> L38
        int currentModification$iv = current$iv.getModification$runtime_release();     // Catch: Throwable -> L38
        PersistentList<T> r9 = current$iv.getList$runtime_release();     // Catch: Throwable -> L38
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L38
        monitor-exit(lock$iv$iv);
        Intrinsics.checkNotNull(r9);
        PersistentList.Builder<T> r7 = r9.builder();
        PersistentList.Builder<T> it = r7;
        it.subList(start, end).retainAll(r24);
        Unit r1 = Unit.INSTANCE;
        PersistentList<? extends T> r8 = r7.build();
        if (Intrinsics.areEqual(r8, r9) == true) goto L35;
        StateRecord r2 = getFirstStateRecord();
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateRecord $this$writable$iv$iv$iv = (StateListStateRecord) r2;
        Object lock$iv$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv$iv);
        Snapshot r20 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L31
        int startSize2 = startSize;
        int $i$f$mutate2 = $i$f$mutate;
        boolean r3 = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv$iv, this, r20), currentModification$iv, r8, true);     // Catch: Throwable -> L25
        monitor-exit(lock$iv$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r20, this);
        if (r3 == true) goto L37;
        startSize = startSize2;
        $i$f$mutate = $i$f$mutate2;
    L37:
        return startSize2 - size();
    L25:
        th = th;
    L33:
        monitor-exit(lock$iv$iv$iv$iv$iv);
        throw th;
    L27:
        th = th;
    L29:
        th = th;
    L31:
        th = th;
        goto L33
    L35:
        startSize2 = startSize;
    L38:
        th = move-exception;
        throw th;
    }

    public final List<T> getDebuggerDisplayValue() {
        StateRecord r2 = getFirstStateRecord();
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateRecord $this$withCurrent$iv$iv = (StateListStateRecord) r2;
        StateListStateRecord $this$_get_debuggerDisplayValue__u24lambda_u2416 = (StateListStateRecord) SnapshotKt.current($this$withCurrent$iv$iv);
        return $this$_get_debuggerDisplayValue__u24lambda_u2416.getList$runtime_release();
    }

    private final <R> R writable(Function1<? super StateListStateRecord<T>, ? extends R> r10) {
        StateRecord r1 = getFirstStateRecord();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateRecord $this$writable$iv = (StateListStateRecord) r1;
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

    private final <R> R withCurrent(Function1<? super StateListStateRecord<T>, ? extends R> r5) {
        StateRecord r1 = getFirstStateRecord();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateRecord $this$withCurrent$iv = (StateListStateRecord) r1;
        return r5.invoke(SnapshotKt.current($this$withCurrent$iv));
    }

    private final boolean mutateBoolean(Function1<? super List<T>, Boolean> r21) {
        int $i$f$mutate = 0;
    L3:
        Object lock$iv$iv = SnapshotStateListKt.access$getSync$p();
        monitor-enter(lock$iv$iv);
        StateRecord r10 = getFirstStateRecord();     // Catch: Throwable -> L30
        Intrinsics.checkNotNull(r10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");     // Catch: Throwable -> L30
        StateRecord $this$withCurrent$iv$iv$iv = (StateListStateRecord) r10;     // Catch: Throwable -> L30
        StateListStateRecord current$iv = (StateListStateRecord) SnapshotKt.current($this$withCurrent$iv$iv$iv);     // Catch: Throwable -> L30
        int currentModification$iv = current$iv.getModification$runtime_release();     // Catch: Throwable -> L30
        PersistentList<T> r8 = current$iv.getList$runtime_release();     // Catch: Throwable -> L30
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L30
        monitor-exit(lock$iv$iv);
        Intrinsics.checkNotNull(r8);
        PersistentList.Builder<T> r6 = r8.builder();
        Object result$iv = r21.invoke(r6);
        PersistentList<? extends T> r7 = r6.build();
        if (Intrinsics.areEqual(r7, r8) == true) goto L29;
        StateRecord r1 = getFirstStateRecord();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateRecord $this$writable$iv$iv$iv = (StateListStateRecord) r1;
        Object lock$iv$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv$iv);
        Snapshot r17 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L23
        int $i$f$mutate2 = $i$f$mutate;
        boolean r2 = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv$iv, this, r17), currentModification$iv, r7, true);     // Catch: Throwable -> L21
        monitor-exit(lock$iv$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r17, this);
        if (r2 == true) goto L29;
        $i$f$mutate = $i$f$mutate2;
    L21:
        th = th;
    L25:
        monitor-exit(lock$iv$iv$iv$iv$iv);
        throw th;
    L23:
        th = th;
    L29:
        return ((Boolean) result$iv).booleanValue();
    L30:
        th = move-exception;
        throw th;
    }

    private final <R> R mutate(Function1<? super List<T>, ? extends R> r21) {
        int $i$f$mutate = 0;
        Object result = null;
    L3:
        Object lock$iv = SnapshotStateListKt.access$getSync$p();
        monitor-enter(lock$iv);
        StateRecord r9 = getFirstStateRecord();     // Catch: Throwable -> L30
        Intrinsics.checkNotNull(r9, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");     // Catch: Throwable -> L30
        StateRecord $this$withCurrent$iv$iv = (StateListStateRecord) r9;     // Catch: Throwable -> L30
        StateListStateRecord current = (StateListStateRecord) SnapshotKt.current($this$withCurrent$iv$iv);     // Catch: Throwable -> L30
        int currentModification = current.getModification$runtime_release();     // Catch: Throwable -> L30
        PersistentList<T> r7 = current.getList$runtime_release();     // Catch: Throwable -> L30
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L30
        monitor-exit(lock$iv);
        Intrinsics.checkNotNull(r7);
        PersistentList.Builder<T> r5 = r7.builder();
        R r2 = r21.invoke(r5);
        PersistentList<? extends T> r6 = r5.build();
        if (Intrinsics.areEqual(r6, r7) == true) goto L29;
        StateRecord r1 = getFirstStateRecord();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateRecord $this$writable$iv$iv = (StateListStateRecord) r1;
        Object lock$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv);
        Snapshot r16 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L23
        int $i$f$mutate2 = $i$f$mutate;
        boolean r3 = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv, this, r16), currentModification, r6, true);     // Catch: Throwable -> L21
        monitor-exit(lock$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r16, this);
        if (r3 == true) goto L42;
        $i$f$mutate = $i$f$mutate2;
        result = r2;
        goto L3
    L42:
        return r2;
    L21:
        th = th;
    L25:
        monitor-exit(lock$iv$iv$iv$iv);
        throw th;
    L23:
        th = th;
        goto L25
    L29:
        return r2;
    L30:
        th = move-exception;
        throw th;
    }

    static /* synthetic */ void update$default(SnapshotStateList $this, boolean structural, Function1 block, int r24, Object r25) {
        if ((r24 & 1) == 0) goto L5;
        boolean structural2 = true;
    L6:
        int $i$f$update = 0;
    L7:
        Object lock$iv$iv = SnapshotStateListKt.access$getSync$p();
        monitor-enter(lock$iv$iv);
        StateRecord r14 = $this.getFirstStateRecord();     // Catch: Throwable -> L38
        Intrinsics.checkNotNull(r14, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");     // Catch: Throwable -> L38
        StateRecord $this$withCurrent$iv$iv$iv = (StateListStateRecord) r14;     // Catch: Throwable -> L38
        StateListStateRecord current$iv = (StateListStateRecord) SnapshotKt.current($this$withCurrent$iv$iv$iv);     // Catch: Throwable -> L38
        int currentModification$iv = current$iv.getModification$runtime_release();     // Catch: Throwable -> L38
        PersistentList<T> r12 = current$iv.getList$runtime_release();     // Catch: Throwable -> L38
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L38
        monitor-exit(lock$iv$iv);
        Intrinsics.checkNotNull(r12);
        PersistentList newList$iv = (PersistentList) block.invoke(r12);
        if (Intrinsics.areEqual(newList$iv, r12) == true) goto L52;
        StateRecord r1 = $this.getFirstStateRecord();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateRecord $this$writable$iv$iv$iv = (StateListStateRecord) r1;
        Object lock$iv$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv$iv);
        Snapshot r20 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L34
        int $i$f$update2 = $i$f$update;
        StateListStateRecord $this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv = (StateListStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv$iv, $this, r20);     // Catch: Throwable -> L30
        boolean r21 = access$attemptUpdate($this, $this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv, currentModification$iv, newList$iv, structural2);     // Catch: Throwable -> L30
        monitor-exit(lock$iv$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r20, $this);
        if (r21 == true) goto L28;
        $i$f$update = $i$f$update2;
        goto L7
    L28:
        return;
    L30:
        th = th;
    L36:
        monitor-exit(lock$iv$iv$iv$iv$iv);
        throw th;
    L32:
        th = th;
    L34:
        th = th;
        goto L36
    L52:
        return;
    L38:
        th = move-exception;
        throw th;
    L5:
        structural2 = structural;
        goto L6
    }

    private final void update(boolean structural, Function1<? super PersistentList<? extends T>, ? extends PersistentList<? extends T>> r25) {
        int $i$f$update = 0;
        SnapshotStateList<T> r4 = this;
    L3:
        Object lock$iv$iv = SnapshotStateListKt.access$getSync$p();
        monitor-enter(lock$iv$iv);
        StateRecord r13 = r4.getFirstStateRecord();     // Catch: Throwable -> L30
        Intrinsics.checkNotNull(r13, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");     // Catch: Throwable -> L30
        StateRecord $this$withCurrent$iv$iv$iv = (StateListStateRecord) r13;     // Catch: Throwable -> L30
        StateListStateRecord current$iv = (StateListStateRecord) SnapshotKt.current($this$withCurrent$iv$iv$iv);     // Catch: Throwable -> L30
        int currentModification$iv = current$iv.getModification$runtime_release();     // Catch: Throwable -> L30
        Object oldList$iv = current$iv.getList$runtime_release();     // Catch: Throwable -> L30
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L30
        monitor-exit(lock$iv$iv);
        Intrinsics.checkNotNull(oldList$iv);
        PersistentList<? extends T> r9 = r25.invoke(oldList$iv);
        if (Intrinsics.areEqual(r9, oldList$iv) == true) goto L42;
        StateRecord r1 = r4.getFirstStateRecord();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateRecord $this$writable$iv$iv$iv = (StateListStateRecord) r1;
        Object lock$iv$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv$iv);
        Snapshot r19 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L26
        StateListStateRecord $this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv = (StateListStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv$iv, r4, r19);     // Catch: Throwable -> L26
        int $i$f$update2 = $i$f$update;
        boolean r22 = access$attemptUpdate(r4, $this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422$iv, currentModification$iv, r9, structural);     // Catch: Throwable -> L24
        monitor-exit(lock$iv$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r19, r4);
        if (r22 == true) goto L22;
        $i$f$update = $i$f$update2;
        goto L3
    L22:
        return;
    L24:
        th = th;
    L28:
        monitor-exit(lock$iv$iv$iv$iv$iv);
        throw th;
    L26:
        th = th;
        goto L28
    L42:
        return;
    L30:
        th = move-exception;
        throw th;
    }

    static /* synthetic */ boolean conditionalUpdate$default(SnapshotStateList $this, boolean structural, Function1 block, int r23, Object r24) {
        if ((r23 & 1) == 0) goto L5;
        boolean structural2 = true;
    L7:
        Object lock$iv = SnapshotStateListKt.access$getSync$p();
        monitor-enter(lock$iv);
        StateRecord r12 = $this.getFirstStateRecord();     // Catch: Throwable -> L28
        Intrinsics.checkNotNull(r12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");     // Catch: Throwable -> L28
        StateRecord $this$withCurrent$iv$iv = (StateListStateRecord) r12;     // Catch: Throwable -> L28
        StateListStateRecord current = (StateListStateRecord) SnapshotKt.current($this$withCurrent$iv$iv);     // Catch: Throwable -> L28
        int currentModification = current.getModification$runtime_release();     // Catch: Throwable -> L28
        PersistentList<T> r10 = current.getList$runtime_release();     // Catch: Throwable -> L28
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L28
        monitor-exit(lock$iv);
        Intrinsics.checkNotNull(r10);
        PersistentList newList = (PersistentList) block.invoke(r10);
        if (Intrinsics.areEqual(newList, r10) == true) goto L14;
        StateRecord r1 = $this.getFirstStateRecord();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateRecord $this$writable$iv$iv = (StateListStateRecord) r1;
        Object lock$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv);
        Snapshot r18 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L25
        StateListStateRecord $this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422 = (StateListStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv, $this, r18);     // Catch: Throwable -> L25
        boolean r19 = access$attemptUpdate($this, $this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422, currentModification, newList, structural2);     // Catch: Throwable -> L25
        monitor-exit(lock$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r18, $this);
        if (r19 == false) goto L7;
        return true;
    L25:
        th = move-exception;
        throw th;
    L14:
        return false;
    L28:
        th = move-exception;
        throw th;
    L5:
        structural2 = structural;
        goto L7
    }

    private final boolean conditionalUpdate(boolean structural, Function1<? super PersistentList<? extends T>, ? extends PersistentList<? extends T>> r23) {
        int $i$f$conditionalUpdate = 0;
        SnapshotStateList<T> r2 = this;
    L3:
        Object lock$iv = SnapshotStateListKt.access$getSync$p();
        monitor-enter(lock$iv);
        StateRecord r11 = r2.getFirstStateRecord();     // Catch: Throwable -> L30
        Intrinsics.checkNotNull(r11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");     // Catch: Throwable -> L30
        StateRecord $this$withCurrent$iv$iv = (StateListStateRecord) r11;     // Catch: Throwable -> L30
        StateListStateRecord current = (StateListStateRecord) SnapshotKt.current($this$withCurrent$iv$iv);     // Catch: Throwable -> L30
        int currentModification = current.getModification$runtime_release();     // Catch: Throwable -> L30
        Object oldList = current.getList$runtime_release();     // Catch: Throwable -> L30
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L30
        monitor-exit(lock$iv);
        Intrinsics.checkNotNull(oldList);
        PersistentList<? extends T> r7 = r23.invoke(oldList);
        if (Intrinsics.areEqual(r7, oldList) == true) goto L42;
        StateRecord r1 = r2.getFirstStateRecord();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateRecord $this$writable$iv$iv = (StateListStateRecord) r1;
        Object lock$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv);
        Snapshot r17 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L26
        StateListStateRecord $this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422 = (StateListStateRecord) SnapshotKt.writableRecord($this$writable$iv$iv, r2, r17);     // Catch: Throwable -> L26
        int $i$f$conditionalUpdate2 = $i$f$conditionalUpdate;
        boolean r20 = access$attemptUpdate(r2, $this$conditionalUpdate_u24lambda_u2423_u24lambda_u2422, currentModification, r7, structural);     // Catch: Throwable -> L24
        monitor-exit(lock$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(r17, r2);
        if (r20 == true) goto L20;
        $i$f$conditionalUpdate = $i$f$conditionalUpdate2;
        goto L3
    L20:
        return true;
    L24:
        th = th;
    L28:
        monitor-exit(lock$iv$iv$iv$iv);
        throw th;
    L26:
        th = th;
        goto L28
    L42:
        return false;
    L30:
        th = move-exception;
        throw th;
    }

    private final boolean attemptUpdate(StateListStateRecord<T> r6, int currentModification, PersistentList<? extends T> r8, boolean structural) {
        Object lock$iv = SnapshotStateListKt.access$getSync$p();
        monitor-enter(lock$iv);
    L15:
        th = move-exception;
        throw th;
    L6:
        if (r6.getModification$runtime_release() != currentModification) goto L12;
        r6.setList$runtime_release(r8);     // Catch: Throwable -> L15
        boolean r3 = true;
        if (structural == false) goto L10;
        r6.setStructuralChange$runtime_release(r6.getStructuralChange$runtime_release() + 1);     // Catch: Throwable -> L15
    L10:
        r6.setModification$runtime_release(r6.getModification$runtime_release() + 1);     // Catch: Throwable -> L15
    L13:
        monitor-exit(lock$iv);
        return r3;
    L12:
        r3 = false;
        goto L13
    }

    private final StateRecord stateRecordWith(PersistentList<? extends T> r8) {
        Snapshot snapshot = SnapshotKt.currentSnapshot();
        StateListStateRecord it = new StateListStateRecord(snapshot.getSnapshotId(), r8);
        if ((snapshot instanceof GlobalSnapshot) == true) goto L6;
        it.setNext$runtime_release(new StateListStateRecord(SnapshotId_jvmKt.toSnapshotId(1), r8));
    L6:
        return it;
    }
}
