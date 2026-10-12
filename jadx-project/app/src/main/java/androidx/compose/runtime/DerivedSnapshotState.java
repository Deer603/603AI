package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.Utils_jvmKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DerivedState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001'B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eJ:\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002J\b\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J\b\u0010&\u001a\u00020#H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\u0004\u0018\u00018\u00008G¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011¨\u0006("}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState;", "T", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/DerivedState;", "calculation", "Lkotlin/Function0;", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/SnapshotMutationPolicy;)V", "currentRecord", "Landroidx/compose/runtime/DerivedState$Record;", "getCurrentRecord", "()Landroidx/compose/runtime/DerivedState$Record;", "debuggerDisplayValue", "getDebuggerDisplayValue$annotations", "()V", "getDebuggerDisplayValue", "()Ljava/lang/Object;", "first", "Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "value", "getValue", "current", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "readable", "forceDependencyReads", "", "displayValue", "", "prependStateRecord", "", "toString", "ResultRecord", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DerivedSnapshotState<T> extends StateObjectImpl implements DerivedState<T> {
    private final Function0<T> calculation;
    private ResultRecord<T> first;
    private final SnapshotMutationPolicy<T> policy;

    /* JADX INFO: compiled from: DerivedState.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 /*\u0004\b\u0001\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001/B\u0011\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0002H\u0016J\b\u0010'\u001a\u00020\u0002H\u0016J\u0014\u0010'\u001a\u00020\u00022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u001a\u0010(\u001a\u00020)2\n\u0010*\u001a\u0006\u0012\u0002\b\u00030+2\u0006\u0010,\u001a\u00020-J\u001a\u0010.\u001a\u00020\u00182\n\u0010*\u001a\u0006\u0012\u0002\b\u00030+2\u0006\u0010,\u001a\u00020-R\u0014\u0010\b\u001a\u00028\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u0007R\u001a\u0010!\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001c¨\u00060"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/DerivedState$Record;", "snapshotId", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "(J)V", "currentValue", "getCurrentValue", "()Ljava/lang/Object;", "dependencies", "Landroidx/collection/ObjectIntMap;", "Landroidx/compose/runtime/snapshots/StateObject;", "getDependencies", "()Landroidx/collection/ObjectIntMap;", "setDependencies", "(Landroidx/collection/ObjectIntMap;)V", "result", "", "getResult", "setResult", "(Ljava/lang/Object;)V", "resultHash", "", "getResultHash", "()I", "setResultHash", "(I)V", "validSnapshotId", "getValidSnapshotId", "()J", "setValidSnapshotId", "validSnapshotWriteCount", "getValidSnapshotWriteCount", "setValidSnapshotWriteCount", "assign", "", "value", "create", "isValid", "", "derivedState", "Landroidx/compose/runtime/DerivedState;", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "readableHash", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ResultRecord<T> extends StateRecord implements DerivedState.Record<T> {
        public static final int $stable = 0;
        public static final Companion Companion = null;
        private static final Object Unset = null;
        private ObjectIntMap<StateObject> dependencies;
        private Object result;
        private int resultHash;
        private long validSnapshotId;
        private int validSnapshotWriteCount;

        /* JADX INFO: compiled from: DerivedState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord$Companion;", "", "()V", "Unset", "getUnset", "()Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker r1) {
                this();
            }

            private Companion() {
            }

            public final Object getUnset() {
                return ResultRecord.access$getUnset$cp();
            }
        }

        public static final /* synthetic */ Object access$getUnset$cp() {
            return Unset;
        }

        public ResultRecord(long snapshotId) {
            super(snapshotId);
            this.dependencies = ObjectIntMapKt.emptyObjectIntMap();
            this.result = Unset;
        }

        static {
            Companion = new Companion(null);
            $stable = 8;
            Unset = new Object();
        }

        public final long getValidSnapshotId() {
            return this.validSnapshotId;
        }

        public final void setValidSnapshotId(long r1) {
            this.validSnapshotId = r1;
        }

        public final int getValidSnapshotWriteCount() {
            return this.validSnapshotWriteCount;
        }

        public final void setValidSnapshotWriteCount(int r1) {
            this.validSnapshotWriteCount = r1;
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        public ObjectIntMap<StateObject> getDependencies() {
            return this.dependencies;
        }

        public void setDependencies(ObjectIntMap<StateObject> r1) {
            this.dependencies = r1;
        }

        public final Object getResult() {
            return this.result;
        }

        public final void setResult(Object r1) {
            this.result = r1;
        }

        public final int getResultHash() {
            return this.resultHash;
        }

        public final void setResultHash(int r1) {
            this.resultHash = r1;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord value) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            ResultRecord other = (ResultRecord) value;
            setDependencies(other.getDependencies());
            this.result = other.result;
            this.resultHash = other.resultHash;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return create(SnapshotKt.currentSnapshot().getSnapshotId());
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create(long snapshotId) {
            return new ResultRecord(snapshotId);
        }

        public final boolean isValid(DerivedState<?> r9, Snapshot snapshot) {
            Object lock$iv$iv = SnapshotKt.getLock();
            monitor-enter(lock$iv$iv);
            boolean isValid = false;
            if (this.validSnapshotId != snapshot.getSnapshotId()) goto L11;
            if (this.validSnapshotWriteCount != snapshot.getWriteCount$runtime_release()) goto L11;
            int r3 = 0;
        L12:
            monitor-exit(lock$iv$iv);
            if (this.result == Unset) goto L21;
            if (r3 != 0) goto L17;
        L18:
            isValid = true;
            goto L21
        L17:
            if (this.resultHash == readableHash(r9, snapshot)) goto L18;
        L21:
            if (isValid == false) goto L32;
            if (r3 == 0) goto L32;
            Object lock$iv$iv2 = SnapshotKt.getLock();
            monitor-enter(lock$iv$iv2);
            this.validSnapshotId = snapshot.getSnapshotId();     // Catch: Throwable -> L29
            this.validSnapshotWriteCount = snapshot.getWriteCount$runtime_release();     // Catch: Throwable -> L29
            Unit r4 = Unit.INSTANCE;     // Catch: Throwable -> L29
            monitor-exit(lock$iv$iv2);
        L29:
            th = move-exception;
            throw th;
        L32:
            return isValid;
        L11:
            r3 = 1;
        L33:
            th = move-exception;
            throw th;
        }

        public final int readableHash(DerivedState<?> r32, Snapshot snapshot) {
            int hash = 7;
            Object lock$iv$iv = SnapshotKt.getLock();
            monitor-enter(lock$iv$iv);
            ObjectIntMap<StateObject> r7 = getDependencies();     // Catch: Throwable -> L68
            monitor-exit(lock$iv$iv);
            if (r7.isNotEmpty() == false) goto L67;
            int $i$f$notifyObservers = 0;
            MutableVector<DerivedStateObserver> r5 = SnapshotStateKt.derivedStateObservers();
            int i$iv$iv = 0;
            Object[] content$iv$iv = r5.content;
            int size$iv$iv = r5.getSize();
        L10:
            if (i$iv$iv >= size$iv$iv) goto L12;
            DerivedStateObserver it$iv = (DerivedStateObserver) content$iv$iv[i$iv$iv];
            it$iv.start(r32);
            i$iv$iv = i$iv$iv + 1;
            goto L10
        L12:
            int r0 = 0;
            ObjectIntMap<StateObject> r6 = r7;
            Object[] k$iv = r6.keys;     // Catch: Throwable -> L60
            int[] v$iv = r6.values;     // Catch: Throwable -> L60
            long[] m$iv$iv = r6.metadata;     // Catch: Throwable -> L60
            int lastIndex$iv$iv = m$iv$iv.length - 2;
            int i$iv$iv2 = 0;
            if (0 <= lastIndex$iv$iv) goto L75;
            MutableVector<DerivedStateObserver> r18 = r5;
        L77:
            Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L58
            MutableVector<DerivedStateObserver> r2 = r18;
            int i$iv$iv3 = 0;
            Object[] content$iv$iv2 = r2.content;
            int size$iv$iv2 = r2.getSize();
        L55:
            if (i$iv$iv3 >= size$iv$iv2) goto L67;
            DerivedStateObserver it$iv2 = (DerivedStateObserver) content$iv$iv2[i$iv$iv3];
            it$iv2.done(r32);
            i$iv$iv3 = i$iv$iv3 + 1;
        L58:
            th = th;
        L62:
            MutableVector<DerivedStateObserver> r4 = r18;
            int i$iv$iv4 = 0;
            Object[] content$iv$iv3 = r4.content;
            int size$iv$iv3 = r4.getSize();
        L63:
            if (i$iv$iv4 >= size$iv$iv3) goto L66;
            DerivedStateObserver it$iv3 = (DerivedStateObserver) content$iv$iv3[i$iv$iv4];
            it$iv3.done(r32);
            i$iv$iv4 = i$iv$iv4 + 1;
            goto L63
        L66:
            throw th;
        L75:
            long slot$iv$iv = m$iv$iv[i$iv$iv2];     // Catch: Throwable -> L48
            int hash2 = hash;
            int $i$f$notifyObservers2 = $i$f$notifyObservers;
            r18 = r5;
            ObjectIntMap<StateObject> r19 = r6;
            long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
            if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L45;
            int r8 = 8;
            int bitCount$iv$iv = 8 - ((~(i$iv$iv2 - lastIndex$iv$iv)) >>> 31);
            int j$iv$iv = 0;
        L20:
            if (j$iv$iv >= bitCount$iv$iv) goto L41;
            long value$iv$iv$iv = slot$iv$iv & 255;
            int r25 = r8;
            if (value$iv$iv$iv >= 128) goto L24;
            boolean r20 = true;
        L25:
            if (r20 == false) goto L39;
            int index$iv$iv = (i$iv$iv2 << 3) + j$iv$iv;
            Object r24 = k$iv[index$iv$iv];     // Catch: Throwable -> L37
            int readLevel = v$iv[index$iv$iv];     // Catch: Throwable -> L37
            StateObject stateObject = (StateObject) r24;     // Catch: Throwable -> L37
            int r28 = r0;
            if (readLevel == 1) goto L31;
        L40:
            slot$iv$iv = slot$iv$iv >> r25;
            j$iv$iv = j$iv$iv + 1;
            r8 = r25;
            r0 = r28;
            goto L20
        L31:
            if ((stateObject instanceof DerivedSnapshotState) == false) goto L33;
            StateRecord record = ((DerivedSnapshotState) stateObject).current(snapshot);     // Catch: Throwable -> L37
        L35:
            hash2 = (((hash2 * 31) + Utils_jvmKt.identityHashCode(record)) * 31) + Long.hashCode(record.getSnapshotId$runtime_release());
            goto L40
        L33:
            record = SnapshotKt.current(stateObject.getFirstStateRecord(), snapshot);     // Catch: Throwable -> L37
        L37:
            th = th;
            goto L62
        L39:
            r28 = r0;
            goto L40
        L24:
            r20 = false;
            goto L25
        L41:
            int r29 = r0;
            if (bitCount$iv$iv != r8) goto L44;
            hash = hash2;
        L46:
            if (i$iv$iv2 == lastIndex$iv$iv) goto L77;
            i$iv$iv2 = i$iv$iv2 + 1;
            r5 = r18;
            r6 = r19;
            $i$f$notifyObservers = $i$f$notifyObservers2;
            r0 = r29;
            goto L75
        L44:
            hash = hash2;
            goto L77
        L45:
            r29 = r0;
            hash = hash2;
        L48:
            th = th;
            r18 = r5;
        L60:
            th = th;
            r18 = r5;
        L67:
            return hash;
        L68:
            th = move-exception;
            throw th;
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        public T getCurrentValue() {
            return (T) this.result;
        }
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    @Override // androidx.compose.runtime.DerivedState
    public SnapshotMutationPolicy<T> getPolicy() {
        return this.policy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DerivedSnapshotState(Function0<? extends T> r4, SnapshotMutationPolicy<T> r5) {
        this.calculation = r4;
        this.policy = r5;
        this.first = new ResultRecord(SnapshotKt.currentSnapshot().getSnapshotId());
    }

    public final StateRecord current(Snapshot snapshot) {
        return currentRecord((ResultRecord) SnapshotKt.current(this.first, snapshot), snapshot, false, this.calculation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ResultRecord<T> currentRecord(ResultRecord<T> r36, Snapshot r37, boolean r38, Function0<? extends T> r39) {
        if (r36.isValid(this, r37) == false) goto L57;
        if (r38 == false) goto L56;
        int r6 = 0;
        MutableVector<DerivedStateObserver> r7 = SnapshotStateKt.derivedStateObservers();
        int r9 = 0;
        DerivedStateObserver[] r10 = r7.content;
        int r11 = r7.getSize();
    L6:
        if (r9 >= r11) goto L128;
        r10[r9].start(this);
        r9 = r9 + 1;
        goto L6
    L128:
        ObjectIntMap<StateObject> r8 = r36.getDependencies();     // Catch: Throwable -> L49
        IntRef r12 = (IntRef) SnapshotStateKt__DerivedStateKt.access$getCalculationBlockNestedLevel$p().get();     // Catch: Throwable -> L49
        if (r12 == null) goto L120;
    L15:
        IntRef r13 = r12;
        int r14 = r13.getElement();     // Catch: Throwable -> L49
        Object[] r4 = r8.keys;     // Catch: Throwable -> L49
        int[] r5 = r8.values;     // Catch: Throwable -> L49
        long[] r3 = r8.metadata;     // Catch: Throwable -> L49
        int r0 = r3.length - 2;     // Catch: Throwable -> L49
        int r15 = 0;
        if (0 > r0) goto L40;
    L18:
        long r22 = r3[r15];     // Catch: Throwable -> L49
        Object[] r27 = r4;
        int[] r28 = r5;
        int r24 = r6;
        MutableVector<DerivedStateObserver> r25 = r7;
        if (((((~r22) << 7) & r22) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L38;
        int r16 = 8;
        int r17 = 8 - ((~(r15 - r0)) >>> 31);
        int r18 = 0;
    L22:
        if (r18 >= r17) goto L37;
        if ((r22 & 255) >= 128) goto L26;
        int r19 = 1;
    L27:
        if (r19 == 0) goto L34;
        int r20 = (r15 << 3) + r18;
        StateObject r30 = (StateObject) r27[r20];     // Catch: Throwable -> L47
        r13.setElement(r14 + r28[r20]);     // Catch: Throwable -> L47
        Function1<Object, Unit> r21 = r37.getReadObserver();     // Catch: Throwable -> L47
        if (r21 == null) goto L35;
        r21.invoke(r30);     // Catch: Throwable -> L47
    L35:
        r22 = r22 >> r16;     // Catch: Throwable -> L47
        r18 = r18 + 1;     // Catch: Throwable -> L47
        r16 = r16;
    L47:
        th = th;
    L51:
        MutableVector<DerivedStateObserver> r23 = r25;
        int r26 = 0;
        DerivedStateObserver[] r29 = r23.content;
        int r31 = r23.getSize();
    L52:
        if (r26 >= r31) goto L55;
        r29[r26].done(this);
        r26 = r26 + 1;
        goto L52
    L55:
        throw th;
    L34:
        r18 = r18;
        goto L35
    L26:
        r19 = 0;
        goto L27
    L37:
        if (r17 == r16) goto L38;
    L42:
        r13.setElement(r14);     // Catch: Throwable -> L47
        Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L47
        MutableVector<DerivedStateObserver> r2 = r25;
        int r32 = 0;
        DerivedStateObserver[] r33 = r2.content;
        int r34 = r2.getSize();
    L44:
        if (r32 >= r34) goto L56;
        r33[r32].done(this);
        r32 = r32 + 1;
    L38:
        if (r15 == r0) goto L42;
        r15 = r15 + 1;     // Catch: Throwable -> L47
        r6 = r24;
        r7 = r25;
        r4 = r27;
        r5 = r28;
        goto L18
    L40:
        r25 = r7;
        goto L42
    L120:
        r12 = new IntRef(0);     // Catch: Throwable -> L13
        SnapshotStateKt__DerivedStateKt.access$getCalculationBlockNestedLevel$p().set(r12);     // Catch: Throwable -> L13
    L13:
        th = th;
        r25 = r7;
    L49:
        th = th;
        r25 = r7;
    L56:
        return r36;
    L57:
        final MutableObjectIntMap r35 = new MutableObjectIntMap(0, 1, null);
        IntRef r40 = (IntRef) SnapshotStateKt__DerivedStateKt.access$getCalculationBlockNestedLevel$p().get();
        if (r40 != null) goto L60;
        r40 = new IntRef(0);
        SnapshotStateKt__DerivedStateKt.access$getCalculationBlockNestedLevel$p().set(r40);
    L60:
        final IntRef r41 = r40;
        final int r110 = r41.getElement();
        MutableVector<DerivedStateObserver> r111 = SnapshotStateKt.derivedStateObservers();
        MutableVector<DerivedStateObserver> r42 = r111;
        int r112 = 0;
        DerivedStateObserver[] r113 = r42.content;
        int r43 = r42.getSize();
    L61:
        if (r112 >= r43) goto L126;
        r113[r112].start(this);
        r112 = r112 + 1;
        r42 = r42;
        goto L61
    L126:
        r41.setElement(r110 + 1);     // Catch: Throwable -> L110
        Object r44 = Snapshot.Companion.observe(new DerivedSnapshotState$currentRecord$result$1$1$result$1(this, r41, r35, r110), null, r39);     // Catch: Throwable -> L108
        r41.setElement(r110);     // Catch: Throwable -> L108
        int r114 = 0;
        DerivedStateObserver[] r115 = r111.content;
        int r45 = r111.getSize();
    L68:
        if (r114 >= r45) goto L70;
        r115[r114].done(this);
        r114 = r114 + 1;
        r45 = r45;
        r44 = r44;
        goto L68
    L70:
        Object r210 = r44;
        Object r46 = SnapshotKt.getLock();
        monitor-enter(r46);
        Snapshot r47 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L105
        if (r36.getResult() == ResultRecord.Companion.getUnset()) goto L84;
        SnapshotMutationPolicy<T> r48 = getPolicy();     // Catch: Throwable -> L105
        if (r48 == 0) goto L80;
        boolean r116 = true;
        if (r48.equivalent(r210, r36.getResult()) != true) goto L81;
        boolean r49 = true;
    L82:
        if (r49 == false) goto L85;
        r36.setDependencies(r35);     // Catch: Throwable -> L105
        r36.setResultHash(r36.readableHash(this, r47));     // Catch: Throwable -> L105
        ResultRecord<T> r50 = r36;
    L87:
        monitor-exit(r46);
        IntRef r51 = (IntRef) SnapshotStateKt__DerivedStateKt.access$getCalculationBlockNestedLevel$p().get();
        if (r51 != null) goto L91;
    L93:
        boolean r52 = false;
    L94:
        if (r52 == false) goto L104;
        Snapshot.Companion.notifyObjectsInitialized();
        Object r53 = SnapshotKt.getLock();
        monitor-enter(r53);
        Snapshot r54 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L101
        r50.setValidSnapshotId(r54.getSnapshotId());     // Catch: Throwable -> L101
        r50.setValidSnapshotWriteCount(r54.getWriteCount$runtime_release());     // Catch: Throwable -> L101
        Unit r55 = Unit.INSTANCE;     // Catch: Throwable -> L101
        monitor-exit(r53);
    L101:
        th = move-exception;
        throw th;
    L104:
        return r50;
    L91:
        if (r51.getElement() != 0) goto L93;
        r52 = r116;
    L85:
        r50 = (ResultRecord) SnapshotKt.newWritableRecord(this.first, this, r47);     // Catch: Throwable -> L105
        r50.setDependencies(r35);     // Catch: Throwable -> L105
        r50.setResultHash(r50.readableHash(this, r47));     // Catch: Throwable -> L105
        r50.setResult(r210);     // Catch: Throwable -> L105
    L81:
        r49 = false;
        goto L82
    L80:
        r116 = true;
        goto L81
    L84:
        r116 = true;
    L105:
        th = move-exception;
        throw th;
    L108:
        th = th;
    L112:
        int r117 = 0;
        DerivedStateObserver[] r118 = r111.content;
        Throwable r119 = th;
        int r56 = r111.getSize();
    L113:
        if (r117 >= r56) goto L116;
        r118[r117].done(this);
        r117 = r117 + 1;
        r56 = r56;
        goto L113
    L116:
        throw r119;
    L110:
        th = th;
        goto L112
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.first;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord value) {
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.first = (ResultRecord) value;
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        Function1<Object, Unit> r0 = Snapshot.Companion.getCurrent().getReadObserver();
        if (r0 == null) goto L5;
        r0.invoke(this);
    L5:
        Snapshot r1 = Snapshot.Companion.getCurrent();
        return (T) currentRecord((ResultRecord) SnapshotKt.current(this.first, r1), r1, true, this.calculation).getResult();
    }

    @Override // androidx.compose.runtime.DerivedState
    public DerivedState.Record<T> getCurrentRecord() {
        Snapshot snapshot = Snapshot.Companion.getCurrent();
        ResultRecord<T> record = (ResultRecord) SnapshotKt.current(this.first, snapshot);
        return currentRecord(record, snapshot, false, this.calculation);
    }

    public String toString() {
        StateRecord $this$withCurrent$iv = this.first;
        ResultRecord r2 = (ResultRecord) SnapshotKt.current($this$withCurrent$iv);
        return "DerivedState(value=" + displayValue() + ")@" + hashCode();
    }

    public final T getDebuggerDisplayValue() {
        ResultRecord r2 = (ResultRecord) SnapshotKt.current(this.first);
        if (r2.isValid(this, Snapshot.Companion.getCurrent()) == true) goto L8;
        return null;
    L8:
        return (T) r2.getResult();
    }

    private final String displayValue() {
        StateRecord $this$withCurrent$iv = this.first;
        ResultRecord it = (ResultRecord) SnapshotKt.current($this$withCurrent$iv);
        if (it.isValid(this, Snapshot.Companion.getCurrent()) == true) goto L5;
        return "<Not calculated>";
    L5:
        return String.valueOf(it.getResult());
    }
}
