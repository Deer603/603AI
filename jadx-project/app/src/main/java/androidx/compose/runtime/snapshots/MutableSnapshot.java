package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserver;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0017\u0018\u0000 j2\u00020\u0001:\u0001jBG\b\u0000\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\u0010\fJ\b\u0010;\u001a\u00020\nH\u0002J\r\u0010<\u001a\u00020\nH\u0000¢\u0006\u0002\b=J$\u0010<\u001a\u0002H>\"\u0004\b\u0000\u0010>2\f\u0010?\u001a\b\u0012\u0004\u0012\u0002H>0@H\u0080\b¢\u0006\u0004\b=\u0010AJ\b\u0010B\u001a\u00020CH\u0016J\r\u0010D\u001a\u00020\nH\u0010¢\u0006\u0002\bEJ\b\u0010F\u001a\u00020\nH\u0016J\b\u0010G\u001a\u00020\u000eH\u0016JE\u0010H\u001a\u00020C2\n\u0010I\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u001b2\u0014\u0010J\u001a\u0010\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020L\u0018\u00010K2\u0006\u0010M\u001a\u00020\u0006H\u0000¢\u0006\u0002\bNJ\u0015\u0010O\u001a\u00020\n2\u0006\u0010P\u001a\u00020\u0001H\u0010¢\u0006\u0002\bQJ\u0015\u0010R\u001a\u00020\n2\u0006\u0010P\u001a\u00020\u0001H\u0010¢\u0006\u0002\bSJ\r\u0010T\u001a\u00020\nH\u0010¢\u0006\u0002\bUJ\u0015\u0010V\u001a\u00020\n2\u0006\u0010W\u001a\u00020\u0015H\u0010¢\u0006\u0002\bXJ\u0019\u0010Y\u001a\u00020\n2\n\u0010Z\u001a\u00060\u0003j\u0002`\u0004H\u0000¢\u0006\u0002\b[J\u0015\u0010\\\u001a\u00020\n2\u0006\u00103\u001a\u00020\u0006H\u0000¢\u0006\u0002\b]J\u0015\u0010^\u001a\u00020\n2\u0006\u0010Z\u001a\u000204H\u0000¢\u0006\u0002\b_J\u0015\u0010`\u001a\u00020\n2\u0006\u0010a\u001a\u00020'H\u0000¢\u0006\u0002\bbJ\r\u0010c\u001a\u00020\nH\u0010¢\u0006\u0002\bdJ\b\u0010e\u001a\u00020\nH\u0002J8\u0010f\u001a\u00020\u00002\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016J\u001e\u0010g\u001a\u00020\u00012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016J\b\u0010h\u001a\u00020\nH\u0002J\b\u0010i\u001a\u00020\nH\u0002R\u001a\u0010\r\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R4\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001b2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001b@VX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020'X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0010R\u0014\u00100\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u000e\u00103\u001a\u000204X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00105\u001a\u000204X\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010-¨\u0006k"}, d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshotId", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "readObserver", "Lkotlin/Function1;", "", "", "writeObserver", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "applied", "", "getApplied$runtime_release", "()Z", "setApplied$runtime_release", "(Z)V", "merged", "", "Landroidx/compose/runtime/snapshots/StateObject;", "getMerged$runtime_release", "()Ljava/util/List;", "setMerged$runtime_release", "(Ljava/util/List;)V", "<set-?>", "Landroidx/collection/MutableScatterSet;", "modified", "getModified$runtime_release", "()Landroidx/collection/MutableScatterSet;", "setModified", "(Landroidx/collection/MutableScatterSet;)V", "previousIds", "getPreviousIds$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setPreviousIds$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "previousPinnedSnapshots", "", "getPreviousPinnedSnapshots$runtime_release", "()[I", "setPreviousPinnedSnapshots$runtime_release", "([I)V", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "readOnly", "getReadOnly", "root", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "snapshots", "", "writeCount", "getWriteCount$runtime_release", "()I", "setWriteCount$runtime_release", "(I)V", "getWriteObserver$runtime_release", "abandon", "advance", "advance$runtime_release", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "apply", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "closeLocked", "closeLocked$runtime_release", "dispose", "hasPendingChanges", "innerApplyLocked", "nextId", "optimisticMerges", "", "Landroidx/compose/runtime/snapshots/StateRecord;", "invalidSnapshots", "innerApplyLocked$runtime_release", "nestedActivated", "snapshot", "nestedActivated$runtime_release", "nestedDeactivated", "nestedDeactivated$runtime_release", "notifyObjectsInitialized", "notifyObjectsInitialized$runtime_release", "recordModified", "state", "recordModified$runtime_release", "recordPrevious", "id", "recordPrevious$runtime_release", "recordPreviousList", "recordPreviousList$runtime_release", "recordPreviousPinnedSnapshot", "recordPreviousPinnedSnapshot$runtime_release", "recordPreviousPinnedSnapshots", "handles", "recordPreviousPinnedSnapshots$runtime_release", "releasePinnedSnapshotsForCloseLocked", "releasePinnedSnapshotsForCloseLocked$runtime_release", "releasePreviouslyPinnedSnapshotsLocked", "takeNestedMutableSnapshot", "takeNestedSnapshot", "validateNotApplied", "validateNotAppliedOrPinned", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class MutableSnapshot extends Snapshot {
    public static final int $stable = 0;
    private static final Companion Companion = null;
    private static final int[] EmptyIntArray = null;
    private boolean applied;
    private List<? extends StateObject> merged;
    private MutableScatterSet<StateObject> modified;
    private SnapshotIdSet previousIds;
    private int[] previousPinnedSnapshots;
    private final Function1<Object, Unit> readObserver;
    private int snapshots;
    private int writeCount;
    private final Function1<Object, Unit> writeObserver;

    /* JADX INFO: compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot$Companion;", "", "()V", "EmptyIntArray", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public /* bridge */ /* synthetic */ Function1 getReadObserver() {
        return getReadObserver$runtime_release();
    }

    public Function1<Object, Unit> getReadObserver$runtime_release() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Function1<Object, Unit> getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    public MutableSnapshot(long snapshotId, SnapshotIdSet invalid, Function1<Object, Unit> r5, Function1<Object, Unit> r6) {
        super(snapshotId, invalid, null);
        this.readObserver = r5;
        this.writeObserver = r6;
        this.previousIds = SnapshotIdSet.Companion.getEMPTY();
        this.previousPinnedSnapshots = EmptyIntArray;
        this.snapshots = 1;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        MutableScatterSet<StateObject> r0 = getModified$runtime_release();
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.isNotEmpty() == true) goto L7;
        return false;
    L7:
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MutableSnapshot takeNestedMutableSnapshot$default(MutableSnapshot r1, Function1 r2, Function1 r3, int r4, Object r5) {
        if (r5 != null) goto L12;
        if ((r4 & 1) == 0) goto L7;
        r2 = null;
    L7:
        if ((r4 & 2) == 0) goto L10;
        r3 = null;
    L10:
        return r1.takeNestedMutableSnapshot(r2, r3);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
    }

    public MutableSnapshot takeNestedMutableSnapshot(Function1<Object, Unit> r32, Function1<Object, Unit> r33) {
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned();
        PersistentList observers$iv = SnapshotObserverKt.access$getObservers$p();
        if (observers$iv == null) goto L5;
        Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> r3 = SnapshotObserverKt.mergeObservers(observers$iv, this, false, r32, r33);
        SnapshotInstanceObservers mappedObservers$iv = r3.getFirst();
        Function1<Object, Unit> r1 = mappedObservers$iv.getReadObserver();
        Function1<Object, Unit> r2 = mappedObservers$iv.getWriteObserver();
        Map<SnapshotObserver, SnapshotInstanceObservers> r12 = r3.getSecond();
        Function1<Object, Unit> r13 = r1;
        Function1<Object, Unit> r14 = r2;
    L6:
        Function1<Object, Unit> r15 = r13;
        Function1<Object, Unit> r4 = r14;
        recordPrevious$runtime_release(getSnapshotId());
        Object lock$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv);
        long newId = SnapshotKt.access$getNextSnapshotId$p();     // Catch: Throwable -> L47
        SnapshotKt.access$setNextSnapshotId$p(SnapshotKt.access$getNextSnapshotId$p() + 1);     // Catch: Throwable -> L47
        SnapshotKt.access$setOpenSnapshots$p(SnapshotKt.access$getOpenSnapshots$p().set(newId));     // Catch: Throwable -> L47
        SnapshotIdSet currentInvalid = getInvalid$runtime_release();     // Catch: Throwable -> L47
        setInvalid$runtime_release(currentInvalid.set(newId));     // Catch: Throwable -> L47
        Snapshot r5 = new NestedMutableSnapshot(newId, SnapshotKt.addRange(currentInvalid, getSnapshotId() + 1, newId), SnapshotKt.mergedReadObserver$default(r15, getReadObserver$runtime_release(), false, 4, null), SnapshotKt.access$mergedWriteObserver(r4, getWriteObserver$runtime_release()), this);     // Catch: Throwable -> L43
        monitor-exit(lock$iv$iv);
        if (getApplied$runtime_release() == true) goto L38;
        if (getDisposed$runtime_release() == true) goto L38;
        long previousId$iv = getSnapshotId();
        Object lock$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv);
        long r0 = SnapshotKt.access$getNextSnapshotId$p();     // Catch: Throwable -> L33
        SnapshotKt.access$setNextSnapshotId$p(SnapshotKt.access$getNextSnapshotId$p() + 1);     // Catch: Throwable -> L33
        setSnapshotId$runtime_release(r0);     // Catch: Throwable -> L31
        SnapshotIdSet r6 = SnapshotKt.access$getOpenSnapshots$p();     // Catch: Throwable -> L31
        long previousId$iv2 = getSnapshotId();     // Catch: Throwable -> L29
        SnapshotKt.access$setOpenSnapshots$p(r6.set(previousId$iv2));     // Catch: Throwable -> L29
        Unit r7 = Unit.INSTANCE;     // Catch: Throwable -> L29
        monitor-exit(lock$iv$iv$iv);
        setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), previousId$iv + 1, getSnapshotId()));
    L29:
        th = th;
    L35:
        monitor-exit(lock$iv$iv$iv);
        throw th;
    L31:
        th = th;
    L33:
        th = th;
    L38:
        Snapshot result$iv = r5;
        if (observers$iv == null) goto L42;
        SnapshotObserverKt.dispatchCreatedObservers(observers$iv, this, result$iv, r12);
    L42:
        return (MutableSnapshot) result$iv;
    L43:
        th = th;
    L49:
        monitor-exit(lock$iv$iv);
        throw th;
    L45:
        th = th;
    L47:
        th = th;
        goto L49
    L5:
        r12 = null;
        r13 = r32;
        r14 = r33;
        goto L6
    }

    public SnapshotApplyResult apply() {
        MutableScatterSet<StateObject> r4 = getModified$runtime_release();
        if (r4 == null) goto L5;
        GlobalSnapshot globalSnapshot = SnapshotKt.access$getGlobalSnapshot$p();
        Map<StateRecord, ? extends StateRecord> r5 = SnapshotKt.access$optimisticMerges(globalSnapshot.getSnapshotId(), this, SnapshotKt.access$getOpenSnapshots$p().clear(globalSnapshot.getSnapshotId()));
    L6:
        List r7 = CollectionsKt.emptyList();
        Object globalModified = null;
        Object lock$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv);
        SnapshotKt.access$validateOpen(this);     // Catch: Throwable -> L113
        if (r4 != null) goto L123;
    L22:
        closeLocked$runtime_release();     // Catch: Throwable -> L113
        GlobalSnapshot globalSnapshot2 = SnapshotKt.access$getGlobalSnapshot$p();     // Catch: Throwable -> L113
        MutableScatterSet previousModified = globalSnapshot2.getModified$runtime_release();     // Catch: Throwable -> L113
        SnapshotKt.access$resetGlobalSnapshotLocked(globalSnapshot2, SnapshotKt.access$getEmptyLambda$p());     // Catch: Throwable -> L113
        if (previousModified != null) goto L25;
    L29:
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L113
        monitor-exit(lock$iv$iv);
        this.applied = true;
        if (globalModified == null) goto L39;
        Set nonNullGlobalModified = ScatterSetWrapperKt.wrapIntoSet((ScatterSet) globalModified);
        if (nonNullGlobalModified.isEmpty() == true) goto L39;
        List $this$fastForEach$iv = r7;
        int index$iv = 0;
        int r11 = $this$fastForEach$iv.size();
    L36:
        if (index$iv >= r11) goto L39;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        Function2 it = (Function2) item$iv;
        it.invoke(nonNullGlobalModified, this);
        index$iv = index$iv + 1;
    L39:
        if (r4 != null) goto L41;
    L46:
        SnapshotObserverKt.dispatchObserverOnApplied(this, r4);
        int $i$f$sync = 0;
        Object lock$iv$iv2 = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv2);
        releasePinnedSnapshotsForCloseLocked$runtime_release();     // Catch: Throwable -> L109
        SnapshotKt.access$checkAndOverwriteUnusedRecordsLocked();     // Catch: Throwable -> L109
        if (globalModified == null) goto L73;
        ScatterSet this_$iv = (ScatterSet) globalModified;     // Catch: Throwable -> L109
        long r21 = 128;
        Object[] elements$iv = this_$iv.elements;     // Catch: Throwable -> L109
        long r23 = 255;
        long[] m$iv$iv = this_$iv.metadata;     // Catch: Throwable -> L109
        int lastIndex$iv$iv = m$iv$iv.length - 2;     // Catch: Throwable -> L109
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L70;
    L53:
        long slot$iv$iv = m$iv$iv[i$iv$iv];     // Catch: Throwable -> L109
        int $i$f$sync2 = $i$f$sync;
        MutableScatterSet<StateObject> r27 = r4;
        Map<StateRecord, ? extends StateRecord> r28 = r5;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L68;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L57:
        if (j$iv$iv >= bitCount$iv$iv) goto L67;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L61;
        boolean r6 = true;
    L62:
        if (r6 == false) goto L65;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        StateObject it2 = (StateObject) elements$iv[index$iv$iv];     // Catch: Throwable -> L97
        SnapshotKt.access$processForUnusedRecordsLocked(it2);     // Catch: Throwable -> L97
    L97:
        th = th;
    L111:
        monitor-exit(lock$iv$iv2);
        throw th;
    L65:
        slot$iv$iv = slot$iv$iv >> 8;     // Catch: Throwable -> L97
        j$iv$iv = j$iv$iv + 1;     // Catch: Throwable -> L97
        goto L57
    L61:
        r6 = false;
        goto L62
    L67:
        if (bitCount$iv$iv == 8) goto L68;
    L74:
        if (r27 == null) goto L99;
        ScatterSet this_$iv2 = r27;     // Catch: Throwable -> L97
        int $i$f$forEach = 0;
        Object[] elements$iv2 = this_$iv2.elements;     // Catch: Throwable -> L97
        ScatterSet this_$iv$iv = this_$iv2;
        int $i$f$forEachIndex = 0;
        long[] m$iv$iv2 = this_$iv$iv.metadata;     // Catch: Throwable -> L97
        int lastIndex$iv$iv2 = m$iv$iv2.length - 2;     // Catch: Throwable -> L97
        int i$iv$iv2 = 0;
        if (0 > lastIndex$iv$iv2) goto L99;
    L77:
        long slot$iv$iv2 = m$iv$iv2[i$iv$iv2];     // Catch: Throwable -> L97
        int $i$f$forEach2 = $i$f$forEach;
        Object[] elements$iv3 = elements$iv2;
        ScatterSet this_$iv$iv2 = this_$iv$iv;
        int $i$f$forEachIndex2 = $i$f$forEachIndex;
        long $this$maskEmptyOrDeleted$iv$iv$iv2 = (((~slot$iv$iv2) << 7) & slot$iv$iv2) & (-9187201950435737472L);     // Catch: Throwable -> L97
        if ($this$maskEmptyOrDeleted$iv$iv$iv2 == (-9187201950435737472L)) goto L92;
        int bitCount$iv$iv2 = 8 - ((~(i$iv$iv2 - lastIndex$iv$iv2)) >>> 31);     // Catch: Throwable -> L97
        int j$iv$iv2 = 0;
    L80:
        if (j$iv$iv2 >= bitCount$iv$iv2) goto L89;
        long value$iv$iv$iv2 = slot$iv$iv2 & r23;     // Catch: Throwable -> L97
        if (value$iv$iv$iv2 >= r21) goto L84;
        boolean r8 = true;
    L85:
        if (r8 == false) goto L87;
        int index$iv$iv2 = (i$iv$iv2 << 3) + j$iv$iv2;     // Catch: Throwable -> L97
        StateObject it3 = (StateObject) elements$iv3[index$iv$iv2];     // Catch: Throwable -> L97
        SnapshotKt.access$processForUnusedRecordsLocked(it3);     // Catch: Throwable -> L97
    L87:
        slot$iv$iv2 = slot$iv$iv2 >> 8;     // Catch: Throwable -> L97
        j$iv$iv2 = j$iv$iv2 + 1;     // Catch: Throwable -> L97
        goto L80
    L84:
        r8 = false;
        goto L85
    L89:
        if (bitCount$iv$iv2 != 8) goto L99;
    L92:
        if (i$iv$iv2 == lastIndex$iv$iv2) goto L99;
        i$iv$iv2 = i$iv$iv2 + 1;     // Catch: Throwable -> L97
        this_$iv$iv = this_$iv$iv2;
        $i$f$forEachIndex = $i$f$forEachIndex2;
        $i$f$forEach = $i$f$forEach2;
        elements$iv2 = elements$iv3;
    L99:
        List<? extends StateObject> r0 = this.merged;     // Catch: Throwable -> L97
        if (r0 == null) goto L105;
        int index$iv2 = 0;
        int r9 = r0.size();     // Catch: Throwable -> L97
    L102:
        if (index$iv2 >= r9) goto L105;
        Object item$iv2 = r0.get(index$iv2);     // Catch: Throwable -> L97
        StateObject it4 = (StateObject) item$iv2;     // Catch: Throwable -> L97
        SnapshotKt.access$processForUnusedRecordsLocked(it4);     // Catch: Throwable -> L97
        index$iv2 = index$iv2 + 1;     // Catch: Throwable -> L97
    L105:
        this.merged = null;     // Catch: Throwable -> L97
        Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L97
        monitor-exit(lock$iv$iv2);
        return SnapshotApplyResult.Success.INSTANCE;
    L68:
        if (i$iv$iv == lastIndex$iv$iv) goto L74;
        i$iv$iv = i$iv$iv + 1;     // Catch: Throwable -> L97
        r4 = r27;
        r5 = r28;
        $i$f$sync = $i$f$sync2;
        goto L53
    L70:
        r27 = r4;
        goto L74
    L73:
        r27 = r4;
        r21 = 128;
        r23 = 255;
    L109:
        th = th;
        goto L111
    L41:
        if (r4.isNotEmpty() == false) goto L46;
        Set modifiedSet = ScatterSetWrapperKt.wrapIntoSet(r4);
        List $this$fastForEach$iv2 = r7;
        int index$iv3 = 0;
        int r12 = $this$fastForEach$iv2.size();
    L43:
        if (index$iv3 >= r12) goto L46;
        Object item$iv3 = $this$fastForEach$iv2.get(index$iv3);
        Function2 it5 = (Function2) item$iv3;
        it5.invoke(modifiedSet, this);
        index$iv3 = index$iv3 + 1;
        goto L43
    L20:
        th = th;
    L115:
        monitor-exit(lock$iv$iv);
        throw th;
    L25:
        if (previousModified.isNotEmpty() == false) goto L29;
        globalModified = previousModified;
        r7 = SnapshotKt.access$getApplyObservers$p();     // Catch: Throwable -> L20
        goto L29
    L123:
        if (r4.getSize() == 0) goto L22;
        GlobalSnapshot globalSnapshot3 = SnapshotKt.access$getGlobalSnapshot$p();     // Catch: Throwable -> L20
        SnapshotApplyResult result = innerApplyLocked$runtime_release(SnapshotKt.access$getNextSnapshotId$p(), r4, r5, SnapshotKt.access$getOpenSnapshots$p().clear(globalSnapshot3.getSnapshotId()));     // Catch: Throwable -> L20
        if (Intrinsics.areEqual(result, SnapshotApplyResult.Success.INSTANCE) == true) goto L18;
        monitor-exit(lock$iv$iv);
        return result;
    L18:
        closeLocked$runtime_release();     // Catch: Throwable -> L20
        Object previousModified2 = globalSnapshot3.getModified$runtime_release();     // Catch: Throwable -> L20
        SnapshotKt.access$resetGlobalSnapshotLocked(globalSnapshot3, SnapshotKt.access$getEmptyLambda$p());     // Catch: Throwable -> L20
        setModified(null);     // Catch: Throwable -> L20
        globalSnapshot3.setModified(null);     // Catch: Throwable -> L20
        globalModified = previousModified2;
        r7 = SnapshotKt.access$getApplyObservers$p();     // Catch: Throwable -> L20
    L113:
        th = th;
        goto L115
    L5:
        r5 = null;
        goto L6
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed$runtime_release() == true) goto L6;
        super.dispose();
        mo3925nestedDeactivated$runtime_release(this);
        SnapshotObserverKt.dispatchObserverOnPreDispose(this);
        return;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(Function1<Object, Unit> r37) {
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned();
        long previousId = getSnapshotId();
        if ((this instanceof GlobalSnapshot) == false) goto L5;
        Snapshot r0 = null;
    L6:
        Snapshot parent$iv = r0;
        PersistentList observers$iv = SnapshotObserverKt.access$getObservers$p();
        if (observers$iv == null) goto L9;
        Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> r13 = SnapshotObserverKt.mergeObservers(observers$iv, parent$iv, true, r37, null);
        SnapshotInstanceObservers mappedObservers$iv = r13.getFirst();
        Function1<Object, Unit> r10 = mappedObservers$iv.getReadObserver();
        Function1<Object, Unit> r11 = mappedObservers$iv.getWriteObserver();
        Function1<Object, Unit> r12 = r10;
        Map<SnapshotObserver, SnapshotInstanceObservers> r14 = r13.getSecond();
    L10:
        Function1<Object, Unit> r15 = r12;
        recordPrevious$runtime_release(getSnapshotId());
        Object lock$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv);
        long readonlyId = SnapshotKt.access$getNextSnapshotId$p();     // Catch: Throwable -> L47
        SnapshotKt.access$setNextSnapshotId$p(SnapshotKt.access$getNextSnapshotId$p() + 1);     // Catch: Throwable -> L47
        SnapshotKt.access$setOpenSnapshots$p(SnapshotKt.access$getOpenSnapshots$p().set(readonlyId));     // Catch: Throwable -> L45
        Snapshot r30 = new NestedReadonlySnapshot(readonlyId, SnapshotKt.addRange(getInvalid$runtime_release(), previousId + 1, readonlyId), SnapshotKt.mergedReadObserver$default(r15, getReadObserver$runtime_release(), false, 4, null), this);     // Catch: Throwable -> L43
        monitor-exit(lock$iv$iv);
        if (getApplied$runtime_release() == true) goto L38;
        if (getDisposed$runtime_release() == true) goto L38;
        long previousId$iv = getSnapshotId();
        Object lock$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv);
        long r2 = SnapshotKt.access$getNextSnapshotId$p();     // Catch: Throwable -> L33
        SnapshotKt.access$setNextSnapshotId$p(SnapshotKt.access$getNextSnapshotId$p() + 1);     // Catch: Throwable -> L33
        setSnapshotId$runtime_release(r2);     // Catch: Throwable -> L33
        SnapshotKt.access$setOpenSnapshots$p(SnapshotKt.access$getOpenSnapshots$p().set(getSnapshotId()));     // Catch: Throwable -> L31
        Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L31
        monitor-exit(lock$iv$iv$iv);
        setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), previousId$iv + 1, getSnapshotId()));
    L31:
        th = th;
    L35:
        monitor-exit(lock$iv$iv$iv);
        throw th;
    L33:
        th = th;
    L38:
        Snapshot result$iv = r30;
        if (observers$iv == null) goto L42;
        SnapshotObserverKt.dispatchCreatedObservers(observers$iv, parent$iv, result$iv, r14);
    L42:
        return result$iv;
    L43:
        th = th;
    L49:
        monitor-exit(lock$iv$iv);
        throw th;
    L45:
        th = th;
    L47:
        th = th;
        goto L49
    L9:
        r12 = r37;
        r14 = null;
        goto L10
    L5:
        r0 = this;
        goto L6
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedActivated$runtime_release */
    public void mo3924nestedActivated$runtime_release(Snapshot snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedDeactivated$runtime_release */
    public void mo3925nestedDeactivated$runtime_release(Snapshot snapshot) {
        if (this.snapshots <= 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        PreconditionsKt.throwIllegalArgumentException("no pending nested snapshots");
    L9:
        this.snapshots--;
        if (this.snapshots == 0) goto L12;
        return;
    L12:
        if (this.applied == true) goto L16;
        abandon();
        return;
    L16:
        return;
    L5:
        value$iv = false;
        goto L7
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        if (this.applied == false) goto L5;
        return;
    L5:
        if (getDisposed$runtime_release() == true) goto L10;
        advance$runtime_release();
        return;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void closeLocked$runtime_release() {
        SnapshotKt.access$setOpenSnapshots$p(SnapshotKt.access$getOpenSnapshots$p().clear(getSnapshotId()).andNot(this.previousIds));
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePreviouslyPinnedSnapshotsLocked();
        super.releasePinnedSnapshotsForCloseLocked$runtime_release();
    }

    private final void validateNotApplied() {
        boolean value$iv = !this.applied;
        if (value$iv == true) goto L7;
        PreconditionsKt.throwIllegalStateException("Unsupported operation on a snapshot that has been applied");
        return;
    }

    private final void validateNotAppliedOrPinned() {
        boolean value$iv = true;
        if (this.applied == false) goto L12;
        MutableSnapshot this_$iv = this;
        if (Snapshot.access$getPinningTrackingHandle$p(this_$iv) < 0) goto L7;
        boolean r0 = true;
    L8:
        if (r0 == true) goto L12;
        value$iv = false;
        goto L12
    L7:
        r0 = false;
    L12:
        if (value$iv == true) goto L16;
        PreconditionsKt.throwIllegalStateException("Unsupported operation on a disposed or applied snapshot");
        return;
    }

    private final void abandon() {
        MutableSnapshot r0 = this;
        MutableScatterSet modified = r0.getModified$runtime_release();
        if (modified == null) goto L39;
        r0.validateNotApplied();
        r0.setModified(null);
        long id = r0.getSnapshotId();
        MutableScatterSet this_$iv = modified;
        Object[] elements$iv = this_$iv.elements;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L39;
    L6:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        MutableScatterSet modified2 = modified;
        long id2 = id;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L32;
        int r2 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L9:
        if (j$iv$iv >= bitCount$iv$iv) goto L29;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L13;
        boolean r20 = true;
    L14:
        if (r20 == false) goto L28;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        StateObject state = (StateObject) elements$iv[index$iv$iv];
        StateRecord current = state.getFirstStateRecord();
    L16:
        if (current == null) goto L28;
        if (current.getSnapshotId$runtime_release() == id2) goto L23;
        int j$iv$iv2 = j$iv$iv;
        if (CollectionsKt.contains(r0.previousIds, Long.valueOf(current.getSnapshotId$runtime_release())) == false) goto L25;
    L24:
        current.setSnapshotId$runtime_release(SnapshotKt.access$getINVALID_SNAPSHOT$p());
    L25:
        current = current.getNext$runtime_release();
        this_$iv = this_$iv;
        j$iv$iv = j$iv$iv2;
        r0 = this;
        goto L16
    L23:
        j$iv$iv2 = j$iv$iv;
    L28:
        slot$iv$iv = slot$iv$iv >> r2;
        j$iv$iv = j$iv$iv + 1;
        this_$iv = this_$iv;
        r2 = r2;
        r0 = this;
        goto L9
    L13:
        r20 = false;
        goto L14
    L29:
        ScatterSet this_$iv2 = this_$iv;
        if (bitCount$iv$iv != r2) goto L39;
    L33:
        if (i$iv$iv == lastIndex$iv$iv) goto L39;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
        modified = modified2;
        id = id2;
        r0 = this;
        goto L6
    L32:
        this_$iv2 = this_$iv;
    L39:
        closeAndReleasePinning$runtime_release();
    }

    public final SnapshotApplyResult innerApplyLocked$runtime_release(long nextId, MutableScatterSet<StateObject> r38, Map<StateRecord, ? extends StateRecord> r39, SnapshotIdSet invalidSnapshots) {
        List r0 = null;
        SnapshotIdSet start = getInvalid$runtime_release().set(getSnapshotId()).or(this.previousIds);
        ArrayList r7 = null;
        MutableScatterSet<StateObject> this_$iv = r38;
        int $i$f$forEach = 0;
        Object[] elements$iv = this_$iv.elements;
        ScatterSet this_$iv$iv = this_$iv;
        int $i$f$forEachIndex = 0;
        long[] m$iv$iv = this_$iv$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L71;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        ArrayList r22 = r7;
        ScatterSet this_$iv2 = this_$iv;
        int $i$f$forEach2 = $i$f$forEach;
        Object[] elements$iv2 = elements$iv;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L67;
        int r8 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L64;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r20 = true;
    L12:
        if (r20 == false) goto L62;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int r26 = r8;
        StateObject state = (StateObject) elements$iv2[index$iv$iv];
        List r27 = r0;
        StateRecord first = state.getFirstStateRecord();
        int j$iv$iv2 = j$iv$iv;
        StateRecord current = SnapshotKt.access$readable(first, nextId, invalidSnapshots);
        if (current == null) goto L21;
        StateRecord previous = SnapshotKt.access$readable(first, getSnapshotId(), start);
        if (previous == null) goto L21;
        if (previous.getSnapshotId$runtime_release() == SnapshotId_jvmKt.toSnapshotId(1)) goto L21;
        if (Intrinsics.areEqual(current, previous) == true) goto L58;
        ScatterSet this_$iv$iv2 = this_$iv$iv;
        int $i$f$forEachIndex2 = $i$f$forEachIndex;
        long r11 = getSnapshotId();
        SnapshotIdSet start2 = start;
        SnapshotIdSet start3 = getInvalid$runtime_release();
        StateRecord applied = SnapshotKt.access$readable(first, r11, start3);
        if (applied == null) goto L56;
        if (r39 == null) goto L29;
        StateRecord merged = r39.get(current);
        if (merged == null) goto L29;
    L31:
        if (merged == null) goto L33;
        if (Intrinsics.areEqual(merged, applied) == true) goto L59;
        if (Intrinsics.areEqual(merged, current) == false) goto L47;
        if (r27 != null) goto L40;
        List it = new ArrayList();
        r27 = it;
    L41:
        it.add(TuplesKt.to(state, current.create(getSnapshotId())));
        if (r22 != null) goto L44;
        ArrayList r1 = new ArrayList();
        r22 = r1;
    L45:
        r1.add(state);
        r0 = r27;
    L63:
        slot$iv$iv = slot$iv$iv >> r26;
        j$iv$iv = j$iv$iv2 + 1;
        r39 = r39;
        this_$iv$iv = this_$iv$iv2;
        r8 = r26;
        $i$f$forEachIndex = $i$f$forEachIndex2;
        start = start2;
        goto L7
    L44:
        r1 = r22;
        goto L45
    L40:
        it = r27;
        goto L41
    L47:
        if (r27 != null) goto L49;
        List it2 = new ArrayList();
        r27 = it2;
    L51:
        if (Intrinsics.areEqual(merged, previous) == true) goto L53;
        Pair r5 = TuplesKt.to(state, merged);
    L54:
        it2.add(r5);
        r0 = r27;
        goto L63
    L53:
        r5 = TuplesKt.to(state, previous.create(getSnapshotId()));
        goto L54
    L49:
        it2 = r27;
    L59:
        r0 = r27;
        goto L63
    L33:
        return new SnapshotApplyResult.Failure(this);
    L29:
        merged = state.mergeRecords(previous, current, applied);
        goto L31
    L56:
        SnapshotKt.access$readError();
        throw new KotlinNothingValueException();
    L58:
        start2 = start;
        this_$iv$iv2 = this_$iv$iv;
        $i$f$forEachIndex2 = $i$f$forEachIndex;
    L21:
        start2 = start;
        this_$iv$iv2 = this_$iv$iv;
        $i$f$forEachIndex2 = $i$f$forEachIndex;
        r0 = r27;
        goto L63
    L62:
        start2 = start;
        r26 = r8;
        j$iv$iv2 = j$iv$iv;
        this_$iv$iv2 = this_$iv$iv;
        $i$f$forEachIndex2 = $i$f$forEachIndex;
        goto L63
    L11:
        r20 = false;
        goto L12
    L64:
        List r28 = r0;
        SnapshotIdSet start4 = start;
        ScatterSet this_$iv$iv3 = this_$iv$iv;
        int $i$f$forEachIndex3 = $i$f$forEachIndex;
        if (bitCount$iv$iv != r8) goto L73;
        r0 = r28;
        r7 = r22;
    L68:
        if (i$iv$iv == lastIndex$iv$iv) goto L71;
        i$iv$iv = i$iv$iv + 1;
        $i$f$forEach = $i$f$forEach2;
        elements$iv = elements$iv2;
        this_$iv = this_$iv2;
        this_$iv$iv = this_$iv$iv3;
        $i$f$forEachIndex = $i$f$forEachIndex3;
        start = start4;
    L73:
        if (r28 == null) goto L86;
        List it3 = r28;
        advance$runtime_release();
        int r9 = it3.size();
        int index$iv = 0;
    L75:
        if (index$iv >= r9) goto L86;
        Object item$iv = it3.get(index$iv);
        Pair merged2 = (Pair) item$iv;
        StateObject state2 = (StateObject) merged2.component1();
        StateRecord stateRecord = (StateRecord) merged2.component2();
        stateRecord.setSnapshotId$runtime_release(nextId);
        Object lock$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv);
        stateRecord.setNext$runtime_release(state2.getFirstStateRecord());     // Catch: Throwable -> L82
        state2.prependStateRecord(stateRecord);     // Catch: Throwable -> L82
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L82
        monitor-exit(lock$iv$iv);
        index$iv = index$iv + 1;
    L82:
        th = move-exception;
        throw th;
    L86:
        if (r22 == null) goto L96;
        ArrayList r3 = r22;
        int index$iv2 = 0;
        int r10 = r3.size();
    L88:
        if (index$iv2 >= r10) goto L90;
        Object item$iv2 = r3.get(index$iv2);
        r38.remove((StateObject) item$iv2);
        index$iv2 = index$iv2 + 1;
        goto L88
    L90:
        List<? extends StateObject> r6 = this.merged;
        if (r6 != null) goto L93;
        List<? extends StateObject> r12 = r3;
    L94:
        this.merged = r12;
        goto L96
    L93:
        r12 = CollectionsKt.plus(r6, r3);
    L96:
        return SnapshotApplyResult.Success.INSTANCE;
    L67:
        start4 = start;
        this_$iv$iv3 = this_$iv$iv;
        $i$f$forEachIndex3 = $i$f$forEachIndex;
        r7 = r22;
    L71:
        r28 = r0;
        r22 = r7;
        goto L73
    }

    public final <T> T advance$runtime_release(Function0<? extends T> r21) {
        recordPrevious$runtime_release(getSnapshotId());
        T r0 = r21.invoke();
        if (getApplied$runtime_release() == false) goto L5;
    L16:
        return r0;
    L5:
        if (getDisposed$runtime_release() == true) goto L16;
        long previousId = getSnapshotId();
        Object lock$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv);
        long r11 = SnapshotKt.access$getNextSnapshotId$p();     // Catch: Throwable -> L12
        SnapshotKt.access$setNextSnapshotId$p(SnapshotKt.access$getNextSnapshotId$p() + 1);     // Catch: Throwable -> L12
        setSnapshotId$runtime_release(r11);     // Catch: Throwable -> L12
        SnapshotKt.access$setOpenSnapshots$p(SnapshotKt.access$getOpenSnapshots$p().set(getSnapshotId()));     // Catch: Throwable -> L12
        Unit r10 = Unit.INSTANCE;     // Catch: Throwable -> L12
        monitor-exit(lock$iv$iv);
        setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), previousId + 1, getSnapshotId()));
    L12:
        th = move-exception;
        throw th;
    }

    public final void advance$runtime_release() {
        recordPrevious$runtime_release(getSnapshotId());
        Unit r0 = Unit.INSTANCE;
        if (getApplied$runtime_release() == false) goto L5;
        return;
    L5:
        if (getDisposed$runtime_release() == true) goto L19;
        long previousId$iv = getSnapshotId();
        Object lock$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv);
        long r10 = SnapshotKt.access$getNextSnapshotId$p();     // Catch: Throwable -> L12
        SnapshotKt.access$setNextSnapshotId$p(SnapshotKt.access$getNextSnapshotId$p() + 1);     // Catch: Throwable -> L12
        setSnapshotId$runtime_release(r10);     // Catch: Throwable -> L12
        SnapshotKt.access$setOpenSnapshots$p(SnapshotKt.access$getOpenSnapshots$p().set(getSnapshotId()));     // Catch: Throwable -> L12
        Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L12
        monitor-exit(lock$iv$iv$iv);
        setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), previousId$iv + 1, getSnapshotId()));
        return;
    L12:
        th = move-exception;
        throw th;
    }

    public final void recordPrevious$runtime_release(long id) {
        Object lock$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv);
        this.previousIds = this.previousIds.set(id);     // Catch: Throwable -> L8
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L8
        monitor-exit(lock$iv$iv);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public final void recordPreviousPinnedSnapshot$runtime_release(int id) {
        if (id < 0) goto L5;
        this.previousPinnedSnapshots = ArraysKt.plus(this.previousPinnedSnapshots, id);
        return;
    }

    public final void recordPreviousPinnedSnapshots$runtime_release(int[] handles) {
        boolean r1 = true;
        if (handles.length != 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L8;
        return;
    L8:
        int[] pinned = this.previousPinnedSnapshots;
        if (pinned.length == 0) goto L12;
        r1 = false;
    L12:
        if (r1 == false) goto L14;
        int[] r2 = handles;
    L15:
        this.previousPinnedSnapshots = r2;
        return;
    L14:
        r2 = ArraysKt.plus(pinned, handles);
        goto L15
    L5:
        r0 = false;
        goto L6
    }

    private final void releasePreviouslyPinnedSnapshotsLocked() {
        int index = 0;
        int r1 = this.previousPinnedSnapshots.length;
    L3:
        if (index >= r1) goto L5;
        SnapshotKt.releasePinningLocked(this.previousPinnedSnapshots[index]);
        index = index + 1;
        goto L3
    }

    public final void recordPreviousList$runtime_release(SnapshotIdSet snapshots) {
        Object lock$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv);
        this.previousIds = this.previousIds.or(snapshots);     // Catch: Throwable -> L8
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L8
        monitor-exit(lock$iv$iv);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: recordModified$runtime_release */
    public void mo3926recordModified$runtime_release(StateObject state) {
        MutableScatterSet<StateObject> r0 = getModified$runtime_release();
        if (r0 != null) goto L5;
        r0 = ScatterSetKt.mutableScatterSetOf();
        setModified(r0);
    L5:
        r0.add(state);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public int getWriteCount$runtime_release() {
        return this.writeCount;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime_release(int r1) {
        this.writeCount = r1;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public MutableScatterSet<StateObject> getModified$runtime_release() {
        return this.modified;
    }

    public void setModified(MutableScatterSet<StateObject> r1) {
        this.modified = r1;
    }

    public final List<StateObject> getMerged$runtime_release() {
        return this.merged;
    }

    public final void setMerged$runtime_release(List<? extends StateObject> r1) {
        this.merged = r1;
    }

    public final SnapshotIdSet getPreviousIds$runtime_release() {
        return this.previousIds;
    }

    public final void setPreviousIds$runtime_release(SnapshotIdSet r1) {
        this.previousIds = r1;
    }

    public final int[] getPreviousPinnedSnapshots$runtime_release() {
        return this.previousPinnedSnapshots;
    }

    public final void setPreviousPinnedSnapshots$runtime_release(int[] r1) {
        this.previousPinnedSnapshots = r1;
    }

    public final boolean getApplied$runtime_release() {
        return this.applied;
    }

    public final void setApplied$runtime_release(boolean r1) {
        this.applied = r1;
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        EmptyIntArray = new int[0];
    }
}
