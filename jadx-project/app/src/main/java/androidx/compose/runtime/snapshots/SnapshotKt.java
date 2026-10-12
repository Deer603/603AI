package androidx.compose.runtime.snapshots;

import androidx.autofill.HintConstants;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\n\u001a\b\u0010'\u001a\u00020\tH\u0002\u001a6\u0010'\u001a\u0002H(\"\u0004\b\u0000\u0010(2!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u0002H(0\u000bH\u0002¢\u0006\u0002\u0010*\u001a\b\u0010+\u001a\u00020\tH\u0002\u001a4\u0010,\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\b\b\u0002\u0010/\u001a\u000200H\u0002\u001a\u001f\u00101\u001a\u0002H(\"\b\b\u0000\u0010(*\u0002022\u0006\u00103\u001a\u0002H(H\u0001¢\u0006\u0002\u00104\u001a'\u00101\u001a\u0002H(\"\b\b\u0000\u0010(*\u0002022\u0006\u00103\u001a\u0002H(2\u0006\u00105\u001a\u00020\bH\u0001¢\u0006\u0002\u00106\u001a\b\u00107\u001a\u00020\bH\u0000\u001aL\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\b\b\u0002\u0010:\u001a\u000200H\u0002\u001aB\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0002\u001a\u0018\u0010=\u001a\u00020\t2\u0006\u00105\u001a\u00020\b2\u0006\u0010>\u001a\u00020\u0012H\u0001\u001a2\u0010?\u001a\u0010\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000202\u0018\u00010@2\n\u0010A\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\fH\u0002\u001a\u0010\u0010E\u001a\u0002002\u0006\u0010>\u001a\u00020\u0012H\u0002\u001a\u0010\u0010F\u001a\u00020\t2\u0006\u0010>\u001a\u00020\u0012H\u0002\u001a\b\u0010G\u001a\u00020HH\u0002\u001a5\u0010I\u001a\u0004\u0018\u0001H(\"\b\b\u0000\u0010(*\u0002022\u0006\u00103\u001a\u0002H(2\n\u0010J\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0002\u0010K\u001a\u0010\u0010L\u001a\u00020\t2\u0006\u0010M\u001a\u00020NH\u0000\u001a\b\u0010O\u001a\u00020HH\u0002\u001a>\u0010P\u001a\u0002H(\"\u0004\b\u0000\u0010(2\u0006\u0010\u0013\u001a\u00020\u00142!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u0002H(0\u000bH\u0002¢\u0006\u0002\u0010Q\u001a/\u0010R\u001a\u0002H(\"\u0004\b\u0000\u0010(2\f\u0010)\u001a\b\u0012\u0004\u0012\u0002H(0SH\u0081\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010T\u001a:\u0010U\u001a\u0002H(\"\b\b\u0000\u0010(*\u00020\b2!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u0002H(0\u000bH\u0002¢\u0006\u0002\u0010V\u001a\u001c\u0010W\u001a\u00020N2\n\u0010X\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000f\u001a\u00020\fH\u0000\u001a\u0012\u0010Y\u001a\u0004\u0018\u0001022\u0006\u0010>\u001a\u00020\u0012H\u0002\u001a(\u0010Z\u001a\u0002002\n\u00107\u001a\u00060\u0001j\u0002`\u00022\n\u0010[\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000f\u001a\u00020\fH\u0002\u001a$\u0010Z\u001a\u0002002\u0006\u0010\\\u001a\u0002022\n\u00105\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000f\u001a\u00020\fH\u0002\u001a\u0010\u0010]\u001a\u00020\t2\u0006\u00105\u001a\u00020\bH\u0002\u001a$\u0010^\u001a\u00020\f*\u00020\f2\n\u0010_\u001a\u00060\u0001j\u0002`\u00022\n\u0010`\u001a\u00060\u0001j\u0002`\u0002H\u0000\u001a!\u0010a\u001a\u000202*\u0002022\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u0002000\u000bH\u0082\b\u001a#\u0010c\u001a\u0002H(\"\b\b\u0000\u0010(*\u000202*\u0002H(2\u0006\u0010>\u001a\u00020\u0012H\u0000¢\u0006\u0002\u0010d\u001a+\u0010e\u001a\u0002H(\"\b\b\u0000\u0010(*\u000202*\u0002H(2\u0006\u0010>\u001a\u00020\u00122\u0006\u00105\u001a\u00020\bH\u0000¢\u0006\u0002\u0010f\u001a+\u0010g\u001a\u0002H(\"\b\b\u0000\u0010(*\u000202*\u0002H(2\u0006\u0010>\u001a\u00020\u00122\u0006\u00105\u001a\u00020\bH\u0002¢\u0006\u0002\u0010f\u001aK\u0010h\u001a\u0002Hi\"\b\b\u0000\u0010(*\u000202\"\u0004\b\u0001\u0010i*\u0002H(2\u0006\u0010>\u001a\u00020\u00122\u0006\u0010j\u001a\u0002H(2\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u0002H(\u0012\u0004\u0012\u0002Hi0\u000b¢\u0006\u0002\bkH\u0080\b¢\u0006\u0002\u0010l\u001a3\u0010m\u001a\u0002H(\"\b\b\u0000\u0010(*\u000202*\u0002H(2\u0006\u0010>\u001a\u00020\u00122\u0006\u00105\u001a\u00020\b2\u0006\u0010j\u001a\u0002H(H\u0000¢\u0006\u0002\u0010n\u001a!\u0010I\u001a\u0002H(\"\b\b\u0000\u0010(*\u000202*\u0002H(2\u0006\u0010>\u001a\u00020\u0012¢\u0006\u0002\u0010d\u001a)\u0010I\u001a\u0002H(\"\b\b\u0000\u0010(*\u000202*\u0002H(2\u0006\u0010>\u001a\u00020\u00122\u0006\u00105\u001a\u00020\b¢\u0006\u0002\u0010f\u001aE\u0010o\u001a\u0002Hi\"\b\b\u0000\u0010(*\u000202\"\u0004\b\u0001\u0010i*\u0002H(2!\u0010)\u001a\u001d\u0012\u0013\u0012\u0011H(¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(3\u0012\u0004\u0012\u0002Hi0\u000bH\u0086\b¢\u0006\u0002\u0010p\u001aC\u0010q\u001a\u0002Hi\"\b\b\u0000\u0010(*\u000202\"\u0004\b\u0001\u0010i*\u0002H(2\u0006\u0010>\u001a\u00020\u00122\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u0002H(\u0012\u0004\u0012\u0002Hi0\u000b¢\u0006\u0002\bkH\u0086\b¢\u0006\u0002\u0010r\u001aK\u0010q\u001a\u0002Hi\"\b\b\u0000\u0010(*\u000202\"\u0004\b\u0001\u0010i*\u0002H(2\u0006\u0010>\u001a\u00020\u00122\u0006\u00105\u001a\u00020\b2\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u0002H(\u0012\u0004\u0012\u0002Hi0\u000b¢\u0006\u0002\bkH\u0086\b¢\u0006\u0002\u0010s\u001a+\u0010t\u001a\u0002H(\"\b\b\u0000\u0010(*\u000202*\u0002H(2\u0006\u0010>\u001a\u00020\u00122\u0006\u00105\u001a\u00020\bH\u0001¢\u0006\u0002\u0010f\"\u0012\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002X\u0082D¢\u0006\u0002\n\u0000\",\u0010\u0003\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\")\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\t0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000\" \u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u000b0\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001c\u0010\u0016\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010!\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$\"\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0&X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006u"}, d2 = {"INVALID_SNAPSHOT", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "applyObservers", "", "Lkotlin/Function2;", "", "", "Landroidx/compose/runtime/snapshots/Snapshot;", "", "emptyLambda", "Lkotlin/Function1;", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "invalid", "extraStateObjects", "Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", "Landroidx/compose/runtime/snapshots/StateObject;", "globalSnapshot", "Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "globalWriteObservers", "lock", "getLock$annotations", "()V", "getLock", "()Ljava/lang/Object;", "nextSnapshotId", "openSnapshots", "pendingApplyObserverCount", "Landroidx/compose/runtime/internal/AtomicInt;", "pinningTable", "Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "snapshotInitializer", "getSnapshotInitializer$annotations", "getSnapshotInitializer", "()Landroidx/compose/runtime/snapshots/Snapshot;", "threadSnapshot", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "advanceGlobalSnapshot", "T", "block", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "checkAndOverwriteUnusedRecordsLocked", "createTransparentSnapshotWithNoParentReadObserver", "previousSnapshot", "readObserver", "ownsPreviousSnapshot", "", "current", "Landroidx/compose/runtime/snapshots/StateRecord;", "r", "(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "snapshot", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "currentSnapshot", "mergedReadObserver", "parentObserver", "mergeReadObserver", "mergedWriteObserver", "writeObserver", "notifyWrite", "state", "optimisticMerges", "", "currentSnapshotId", "applyingSnapshot", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "invalidSnapshots", "overwriteUnusedRecordsLocked", "processForUnusedRecordsLocked", "readError", "", "readable", "id", "(Landroidx/compose/runtime/snapshots/StateRecord;JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/StateRecord;", "releasePinningLocked", "handle", "", "reportReadonlySnapshotWrite", "resetGlobalSnapshotLocked", "(Landroidx/compose/runtime/snapshots/GlobalSnapshot;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "sync", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "takeNewSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "trackPinning", "snapshotId", "usedLocked", "valid", "candidateSnapshot", "data", "validateOpen", "addRange", "from", "until", "findYoungestOr", "predicate", "newOverwritableRecordLocked", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;)Landroidx/compose/runtime/snapshots/StateRecord;", "newWritableRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "newWritableRecordLocked", "overwritable", "R", "candidate", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/StateRecord;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "overwritableRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "withCurrent", "(Landroidx/compose/runtime/snapshots/StateRecord;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writableRecord", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SnapshotKt {
    private static final long INVALID_SNAPSHOT = 0;
    private static List<? extends Function2<? super Set<? extends Object>, ? super Snapshot, Unit>> applyObservers;
    private static final Function1<SnapshotIdSet, Unit> emptyLambda = null;
    private static final SnapshotWeakSet<StateObject> extraStateObjects = null;
    private static final GlobalSnapshot globalSnapshot = null;
    private static List<? extends Function1<Object, Unit>> globalWriteObservers;
    private static final Object lock = null;
    private static long nextSnapshotId;
    private static SnapshotIdSet openSnapshots;
    private static AtomicInt pendingApplyObserverCount;
    private static final SnapshotDoubleIndexHeap pinningTable = null;
    private static final Snapshot snapshotInitializer = null;
    private static final SnapshotThreadLocal<Snapshot> threadSnapshot = null;

    public static final /* synthetic */ Object access$advanceGlobalSnapshot(Function1 block) {
        return advanceGlobalSnapshot(block);
    }

    public static final /* synthetic */ void access$advanceGlobalSnapshot() {
        advanceGlobalSnapshot();
    }

    public static final /* synthetic */ void access$checkAndOverwriteUnusedRecordsLocked() {
        checkAndOverwriteUnusedRecordsLocked();
    }

    public static final /* synthetic */ Snapshot access$createTransparentSnapshotWithNoParentReadObserver(Snapshot previousSnapshot, Function1 readObserver, boolean ownsPreviousSnapshot) {
        return createTransparentSnapshotWithNoParentReadObserver(previousSnapshot, readObserver, ownsPreviousSnapshot);
    }

    public static final /* synthetic */ List access$getApplyObservers$p() {
        return applyObservers;
    }

    public static final /* synthetic */ Function1 access$getEmptyLambda$p() {
        return emptyLambda;
    }

    public static final /* synthetic */ GlobalSnapshot access$getGlobalSnapshot$p() {
        return globalSnapshot;
    }

    public static final /* synthetic */ List access$getGlobalWriteObservers$p() {
        return globalWriteObservers;
    }

    public static final /* synthetic */ long access$getINVALID_SNAPSHOT$p() {
        return INVALID_SNAPSHOT;
    }

    public static final /* synthetic */ long access$getNextSnapshotId$p() {
        return nextSnapshotId;
    }

    public static final /* synthetic */ SnapshotIdSet access$getOpenSnapshots$p() {
        return openSnapshots;
    }

    public static final /* synthetic */ AtomicInt access$getPendingApplyObserverCount$p() {
        return pendingApplyObserverCount;
    }

    public static final /* synthetic */ SnapshotThreadLocal access$getThreadSnapshot$p() {
        return threadSnapshot;
    }

    public static final /* synthetic */ Function1 access$mergedReadObserver(Function1 readObserver, Function1 parentObserver, boolean mergeReadObserver) {
        return mergedReadObserver(readObserver, parentObserver, mergeReadObserver);
    }

    public static final /* synthetic */ Function1 access$mergedWriteObserver(Function1 writeObserver, Function1 parentObserver) {
        return mergedWriteObserver(writeObserver, parentObserver);
    }

    public static final /* synthetic */ Map access$optimisticMerges(long currentSnapshotId, MutableSnapshot applyingSnapshot, SnapshotIdSet invalidSnapshots) {
        return optimisticMerges(currentSnapshotId, applyingSnapshot, invalidSnapshots);
    }

    public static final /* synthetic */ void access$processForUnusedRecordsLocked(StateObject state) {
        processForUnusedRecordsLocked(state);
    }

    public static final /* synthetic */ Void access$readError() {
        return readError();
    }

    public static final /* synthetic */ StateRecord access$readable(StateRecord r, long id, SnapshotIdSet invalid) {
        return readable(r, id, invalid);
    }

    public static final /* synthetic */ Void access$reportReadonlySnapshotWrite() {
        return reportReadonlySnapshotWrite();
    }

    public static final /* synthetic */ Object access$resetGlobalSnapshotLocked(GlobalSnapshot globalSnapshot2, Function1 block) {
        return resetGlobalSnapshotLocked(globalSnapshot2, block);
    }

    public static final /* synthetic */ void access$setApplyObservers$p(List r0) {
        applyObservers = r0;
    }

    public static final /* synthetic */ void access$setGlobalWriteObservers$p(List r0) {
        globalWriteObservers = r0;
    }

    public static final /* synthetic */ void access$setNextSnapshotId$p(long r0) {
        nextSnapshotId = r0;
    }

    public static final /* synthetic */ void access$setOpenSnapshots$p(SnapshotIdSet r0) {
        openSnapshots = r0;
    }

    public static final /* synthetic */ Snapshot access$takeNewSnapshot(Function1 block) {
        return takeNewSnapshot(block);
    }

    public static final /* synthetic */ void access$validateOpen(Snapshot snapshot) {
        validateOpen(snapshot);
    }

    public static /* synthetic */ void getLock$annotations() {
    }

    public static /* synthetic */ void getSnapshotInitializer$annotations() {
    }

    public static final int trackPinning(long snapshotId, SnapshotIdSet invalid) {
        long pinned = invalid.lowest(snapshotId);
        Object lock$iv$iv = getLock();
        monitor-enter(lock$iv$iv);
        int r6 = pinningTable.add(pinned);     // Catch: Throwable -> L8
        monitor-exit(lock$iv$iv);
        return r6;
    L8:
        th = move-exception;
        throw th;
    }

    public static final void releasePinningLocked(int handle) {
        pinningTable.remove(handle);
    }

    public static final Snapshot currentSnapshot() {
        Snapshot r0 = threadSnapshot.get();
        if (r0 == null) goto L5;
        return r0;
    L5:
        return globalSnapshot;
    }

    static {
        emptyLambda = SnapshotKt$emptyLambda$1.INSTANCE;
        threadSnapshot = new SnapshotThreadLocal();
        lock = new Object();
        openSnapshots = SnapshotIdSet.Companion.getEMPTY();
        nextSnapshotId = SnapshotId_jvmKt.toSnapshotId(1) + 1;
        pinningTable = new SnapshotDoubleIndexHeap();
        extraStateObjects = new SnapshotWeakSet();
        applyObservers = CollectionsKt.emptyList();
        globalWriteObservers = CollectionsKt.emptyList();
        long r0 = nextSnapshotId;
        nextSnapshotId++;
        GlobalSnapshot it = new GlobalSnapshot(r0, SnapshotIdSet.Companion.getEMPTY());
        openSnapshots = openSnapshots.set(it.getSnapshotId());
        globalSnapshot = it;
        snapshotInitializer = globalSnapshot;
        pendingApplyObserverCount = new AtomicInt(0);
    }

    static /* synthetic */ Snapshot createTransparentSnapshotWithNoParentReadObserver$default(Snapshot r0, Function1 r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r1 = null;
    L6:
        if ((r3 & 4) == 0) goto L9;
        r2 = false;
    L9:
        return createTransparentSnapshotWithNoParentReadObserver(r0, r1, r2);
    }

    private static final Snapshot createTransparentSnapshotWithNoParentReadObserver(Snapshot previousSnapshot, Function1<Object, Unit> r8, boolean ownsPreviousSnapshot) {
        if ((previousSnapshot instanceof MutableSnapshot) == true) goto L8;
        if (previousSnapshot == null) goto L8;
        return new TransparentObserverSnapshot(previousSnapshot, r8, false, ownsPreviousSnapshot);
    L8:
        if ((previousSnapshot instanceof MutableSnapshot) == false) goto L10;
        MutableSnapshot r0 = (MutableSnapshot) previousSnapshot;
    L12:
        return new TransparentObserverMutableSnapshot(r0, r8, null, false, ownsPreviousSnapshot);
    L10:
        r0 = null;
        goto L12
    }

    static /* synthetic */ Function1 mergedReadObserver$default(Function1 r0, Function1 r1, boolean r2, int r3, Object r4) {
        if ((r3 & 4) == 0) goto L6;
        r2 = true;
    L6:
        return mergedReadObserver(r0, r1, r2);
    }

    private static final Function1<Object, Unit> mergedReadObserver(final Function1<Object, Unit> r2, Function1<Object, Unit> r3, boolean mergeReadObserver) {
        if (mergeReadObserver == false) goto L4;
        final Function1<Object, Unit> r0 = r3;
    L5:
        if (r2 == null) goto L9;
        if (r0 == null) goto L9;
        if (r2 == r0) goto L9;
        return new AnonymousClass1(r2, r0);
    L9:
        if (r2 != null) goto L12;
        return r0;
    L12:
        return r2;
    L4:
        r0 = null;
        goto L5
    }

    private static final Function1<Object, Unit> mergedWriteObserver(final Function1<Object, Unit> r1, final Function1<Object, Unit> r2) {
        if (r1 == null) goto L6;
        if (r2 == null) goto L6;
        if (r1 == r2) goto L6;
        return new C06221(r1, r2);
    L6:
        if (r1 != null) goto L9;
        return r2;
    L9:
        return r1;
    }

    public static final Object getLock() {
        return lock;
    }

    public static final <T> T sync(Function0<? extends T> r4) {
        Object lock$iv = getLock();
        monitor-enter(lock$iv);
        T r3 = r4.invoke();     // Catch: Throwable -> L7
        monitor-exit(lock$iv);
        return r3;
    L7:
        th = move-exception;
        throw th;
    }

    public static final Snapshot getSnapshotInitializer() {
        return snapshotInitializer;
    }

    private static final <T> T resetGlobalSnapshotLocked(GlobalSnapshot globalSnapshot2, Function1<? super SnapshotIdSet, ? extends T> r10) {
        long snapshotId = globalSnapshot2.getSnapshotId();
        T r2 = r10.invoke(openSnapshots.clear(snapshotId));
        long nextGlobalSnapshotId = nextSnapshotId;
        nextSnapshotId++;
        openSnapshots = openSnapshots.clear(snapshotId);
        globalSnapshot2.setSnapshotId$runtime_release(nextGlobalSnapshotId);
        globalSnapshot2.setInvalid$runtime_release(openSnapshots);
        globalSnapshot2.setWriteCount$runtime_release(0);
        globalSnapshot2.setModified(null);
        globalSnapshot2.releasePinnedSnapshotLocked$runtime_release();
        openSnapshots = openSnapshots.set(nextGlobalSnapshotId);
        return r2;
    }

    private static final <T> T advanceGlobalSnapshot(Function1<? super SnapshotIdSet, ? extends T> r27) {
        GlobalSnapshot r1 = globalSnapshot;
        Object r4 = getLock();
        monitor-enter(r4);
        MutableScatterSet<StateObject> r2 = r1.getModified$runtime_release();     // Catch: Throwable -> L63
        if (r2 == null) goto L69;
        pendingApplyObserverCount.add(1);     // Catch: Throwable -> L10
    L10:
        th = th;
    L65:
        monitor-exit(r4);
        throw th;
    L69:
        T r8 = (T) resetGlobalSnapshotLocked(r1, r27);
        monitor-exit(r4);
        if (r2 != null) goto L67;
    L25:
        MutableScatterSet r3 = null;
        Object r5 = getLock();
        monitor-enter(r5);
        int r0 = 0;
        checkAndOverwriteUnusedRecordsLocked();     // Catch: Throwable -> L57
        if (r2 == null) goto L55;
        MutableScatterSet<StateObject> r6 = r2;     // Catch: Throwable -> L57
        Object[] r10 = r6.elements;     // Catch: Throwable -> L57
        long[] r13 = r6.metadata;     // Catch: Throwable -> L57
        int r14 = r13.length - 2;     // Catch: Throwable -> L57
        int r15 = 0;
        if (0 > r14) goto L50;
    L32:
        long r17 = r13[r15];     // Catch: Throwable -> L57
        int r22 = r0;
        GlobalSnapshot r21 = r1;
        MutableScatterSet<StateObject> r19 = r2;
        MutableScatterSet r20 = r3;
        if (((((~r17) << 7) & r17) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L46;
        int r7 = 8 - ((~(r15 - r14)) >>> 31);
        int r9 = 0;
    L36:
        if (r9 >= r7) goto L45;
        if ((r17 & 255) >= 128) goto L40;
        boolean r16 = true;
    L41:
        if (r16 == false) goto L44;
        processForUnusedRecordsLocked((StateObject) r10[(r15 << 3) + r9]);     // Catch: Throwable -> L52
    L52:
        th = th;
    L59:
        monitor-exit(r5);
        throw th;
    L44:
        r17 = r17 >> 8;     // Catch: Throwable -> L52
        r9 = r9 + 1;     // Catch: Throwable -> L52
        goto L36
    L40:
        r16 = false;
        goto L41
    L45:
        if (r7 != 8) goto L50;
    L46:
        if (r15 == r14) goto L50;
        r15 = r15 + 1;     // Catch: Throwable -> L52
        r2 = r19;
        r3 = r20;
        r1 = r21;
        r0 = r22;
    L50:
        Unit r11 = Unit.INSTANCE;     // Catch: Throwable -> L52
    L55:
        monitor-exit(r5);
        return r8;
    L57:
        th = th;
        goto L59
    L67:
        List<? extends Function2<? super Set<? extends Object>, ? super Snapshot, Unit>> r12 = applyObservers;     // Catch: Throwable -> L22
        int r18 = 0;
        int r110 = r12.size();     // Catch: Throwable -> L22
    L18:
        if (r18 >= r110) goto L21;
        r12.get(r18).invoke(ScatterSetWrapperKt.wrapIntoSet(r2), r1);     // Catch: Throwable -> L22
        r18 = r18 + 1;
        goto L18
    L21:
        pendingApplyObserverCount.add(-1);
    L22:
        th = move-exception;
        pendingApplyObserverCount.add(-1);
        throw th;
    L61:
        th = th;
    L63:
        th = th;
        goto L65
    }

    private static final void advanceGlobalSnapshot() {
        advanceGlobalSnapshot(emptyLambda);
    }

    private static final <T extends Snapshot> T takeNewSnapshot(final Function1<? super SnapshotIdSet, ? extends T> r1) {
        return (T) advanceGlobalSnapshot(new C06231(r1));
    }

    private static final void validateOpen(Snapshot snapshot) {
        SnapshotIdSet openSnapshots2 = openSnapshots;
        if (openSnapshots2.get(snapshot.getSnapshotId()) == true) goto L21;
        StringBuilder r1 = new StringBuilder().append("Snapshot is not open: snapshotId=").append(snapshot.getSnapshotId()).append(", disposed=").append(snapshot.getDisposed$runtime_release()).append(", applied=");
        if ((snapshot instanceof MutableSnapshot) == false) goto L7;
        MutableSnapshot r2 = (MutableSnapshot) snapshot;
    L8:
        if (r2 == null) goto L10;
        Object r3 = Boolean.valueOf(r2.getApplied$runtime_release());
    L11:
        StringBuilder r4 = r1.append(r3).append(", lowestPin=");
        Object lock$iv$iv = getLock();
        monitor-enter(lock$iv$iv);
        long r6 = pinningTable.lowestOrDefault(-1);     // Catch: Throwable -> L18
        monitor-exit(lock$iv$iv);
        throw new IllegalStateException(r4.append(r6).toString().toString());
    L18:
        th = move-exception;
        throw th;
    L10:
        r3 = "read-only";
        goto L11
    L7:
        r2 = null;
        goto L8
    }

    private static final boolean valid(long currentSnapshot, long candidateSnapshot, SnapshotIdSet invalid) {
        if (candidateSnapshot != INVALID_SNAPSHOT) goto L5;
    L9:
        return false;
    L5:
        if (candidateSnapshot > currentSnapshot) goto L9;
        if (invalid.get(candidateSnapshot) == true) goto L9;
        return true;
    }

    private static final boolean valid(StateRecord data, long snapshot, SnapshotIdSet invalid) {
        return valid(snapshot, data.getSnapshotId$runtime_release(), invalid);
    }

    private static final <T extends StateRecord> T readable(T r6, long r7, SnapshotIdSet r9) {
        StateRecord r0 = r6;
        T r1 = null;
    L3:
        if (r0 == null) goto L14;
        if (valid(r0, r7, r9) == false) goto L13;
        if (r1 != null) goto L9;
    L10:
        StateRecord r2 = r0;
    L12:
        r1 = (T) r2;
        goto L13
    L9:
        if (r1.getSnapshotId$runtime_release() < r0.getSnapshotId$runtime_release()) goto L10;
        r2 = r1;
    L13:
        r0 = r0.getNext$runtime_release();
        goto L3
    L14:
        if (r1 == null) goto L16;
        return r1;
    L16:
        return null;
    }

    public static final <T extends StateRecord> T readable(T r10, StateObject r11) {
        Snapshot r0 = Snapshot.Companion.getCurrent();
        Function1<Object, Unit> r1 = r0.getReadObserver();
        if (r1 == null) goto L5;
        r1.invoke(r11);
    L5:
        T r2 = (T) readable(r10, r0.getSnapshotId(), r0.getInvalid$runtime_release());
        if (r2 != null) goto L19;
        Object r3 = getLock();
        monitor-enter(r3);
        Snapshot r5 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L16
        StateRecord r6 = r11.getFirstStateRecord();     // Catch: Throwable -> L16
        Intrinsics.checkNotNull(r6, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");     // Catch: Throwable -> L16
        T r7 = (T) readable(r6, r5.getSnapshotId(), r5.getInvalid$runtime_release());
        if (r7 == null) goto L14;
        monitor-exit(r3);
        return r7;
    L14:
        readError();     // Catch: Throwable -> L16
        throw new KotlinNothingValueException();     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        throw th;
    L19:
        return r2;
    }

    public static final <T extends StateRecord> T readable(T r9, StateObject r10, Snapshot r11) {
        Function1<Object, Unit> r0 = r11.getReadObserver();
        if (r0 == null) goto L5;
        r0.invoke(r10);
    L5:
        T r1 = (T) readable(r9, r11.getSnapshotId(), r11.getInvalid$runtime_release());
        if (r1 != null) goto L19;
        Object r2 = getLock();
        monitor-enter(r2);
        Snapshot r4 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L16
        StateRecord r5 = r10.getFirstStateRecord();     // Catch: Throwable -> L16
        Intrinsics.checkNotNull(r5, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");     // Catch: Throwable -> L16
        T r6 = (T) readable(r5, r4.getSnapshotId(), r4.getInvalid$runtime_release());
        if (r6 == null) goto L14;
        monitor-exit(r2);
        return r6;
    L14:
        readError();     // Catch: Throwable -> L16
        throw new KotlinNothingValueException();     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        throw th;
    L19:
        return r1;
    }

    private static final Void readError() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    private static final StateRecord usedLocked(StateObject state) {
        StateRecord current = state.getFirstStateRecord();
        StateRecord validRecord = null;
        long reuseLimit = pinningTable.lowestOrDefault(nextSnapshotId) - 1;
        SnapshotIdSet invalid = SnapshotIdSet.Companion.getEMPTY();
    L3:
        if (current == null) goto L17;
        long currentId = current.getSnapshotId$runtime_release();
        if (currentId == INVALID_SNAPSHOT) goto L6;
        if (valid(current, reuseLimit, invalid) == false) goto L16;
        if (validRecord != null) goto L12;
        validRecord = current;
        goto L16
    L12:
        if (current.getSnapshotId$runtime_release() >= validRecord.getSnapshotId$runtime_release()) goto L15;
        return current;
    L15:
        return validRecord;
    L16:
        current = current.getNext$runtime_release();
        goto L3
    L6:
        return current;
    L17:
        return null;
    }

    private static final boolean overwriteUnusedRecordsLocked(StateObject state) {
        StateRecord current = state.getFirstStateRecord();
        StateRecord overwriteRecord = null;
        StateRecord validRecord = null;
        long reuseLimit = pinningTable.lowestOrDefault(nextSnapshotId);
        int retainedRecords = 0;
    L4:
        if (current == null) goto L34;
        long currentId = current.getSnapshotId$runtime_release();
        if (currentId == INVALID_SNAPSHOT) goto L33;
        if (currentId >= reuseLimit) goto L32;
        if (validRecord != null) goto L12;
        validRecord = current;
        retainedRecords = retainedRecords + 1;
        goto L33
    L12:
        if (current.getSnapshotId$runtime_release() >= validRecord.getSnapshotId$runtime_release()) goto L14;
        StateRecord recordToOverwrite = current;
    L16:
        if (overwriteRecord != null) goto L31;
        StateRecord $this$findYoungestOr$iv = state.getFirstStateRecord();
        StateRecord current$iv = $this$findYoungestOr$iv;
        StateRecord youngest$iv = $this$findYoungestOr$iv;
    L18:
        if (current$iv == null) goto L29;
        StateRecord it = current$iv;
        if (it.getSnapshotId$runtime_release() < reuseLimit) goto L22;
        boolean r15 = true;
    L23:
        if (r15 == true) goto L30;
        if (youngest$iv.getSnapshotId$runtime_release() >= current$iv.getSnapshotId$runtime_release()) goto L28;
        youngest$iv = current$iv;
    L28:
        current$iv = current$iv.getNext$runtime_release();
    L30:
        overwriteRecord = current$iv;
        goto L31
    L22:
        r15 = false;
        goto L23
    L29:
        current$iv = youngest$iv;
    L31:
        recordToOverwrite.setSnapshotId$runtime_release(INVALID_SNAPSHOT);
        recordToOverwrite.assign(overwriteRecord);
        goto L33
    L14:
        recordToOverwrite = validRecord;
        validRecord = current;
        goto L16
    L32:
        retainedRecords = retainedRecords + 1;
    L33:
        current = current.getNext$runtime_release();
        goto L4
    L34:
        if (retainedRecords > 1) goto L36;
        return false;
    L36:
        return true;
    }

    private static final StateRecord findYoungestOr(StateRecord $this$findYoungestOr, Function1<? super StateRecord, Boolean> r8) {
        StateRecord current = $this$findYoungestOr;
        StateRecord youngest = $this$findYoungestOr;
    L3:
        if (current == null) goto L11;
        if (r8.invoke(current).booleanValue() == true) goto L6;
        if (youngest.getSnapshotId$runtime_release() >= current.getSnapshotId$runtime_release()) goto L10;
        youngest = current;
    L10:
        current = current.getNext$runtime_release();
        goto L3
    L6:
        return current;
    L11:
        return youngest;
    }

    private static final void checkAndOverwriteUnusedRecordsLocked() {
        SnapshotWeakSet<StateObject> r0 = extraStateObjects;
        int size$iv = r0.getSize$runtime_release();
        int currentUsed$iv = 0;
        int i$iv = 0;
    L3:
        Object value$iv = null;
        if (i$iv >= size$iv) goto L15;
        WeakReference<StateObject> r6 = r0.getValues$runtime_release()[i$iv];
        if (r6 == null) goto L8;
        value$iv = r6.get();
    L8:
        if (value$iv == null) goto L14;
        StateObject it = (StateObject) value$iv;
        if (overwriteUnusedRecordsLocked(it) == false) goto L14;
        if (currentUsed$iv == i$iv) goto L13;
        r0.getValues$runtime_release()[currentUsed$iv] = r6;
        r0.getHashes$runtime_release()[currentUsed$iv] = r0.getHashes$runtime_release()[i$iv];
    L13:
        currentUsed$iv = currentUsed$iv + 1;
    L14:
        i$iv = i$iv + 1;
        goto L3
    L15:
        int i$iv2 = currentUsed$iv;
    L16:
        if (i$iv2 >= size$iv) goto L18;
        r0.getValues$runtime_release()[i$iv2] = null;
        r0.getHashes$runtime_release()[i$iv2] = 0;
        i$iv2 = i$iv2 + 1;
        goto L16
    L18:
        if (currentUsed$iv == size$iv) goto L27;
        r0.setSize$runtime_release(currentUsed$iv);
        return;
    }

    private static final void processForUnusedRecordsLocked(StateObject state) {
        if (overwriteUnusedRecordsLocked(state) == false) goto L6;
        extraStateObjects.add(state);
        return;
    }

    public static final <T extends StateRecord> T writableRecord(T r10, StateObject r11, Snapshot r12) {
        if (r12.getReadOnly() == false) goto L5;
        r12.mo3926recordModified$runtime_release(r11);
    L5:
        long r0 = r12.getSnapshotId();
        T r2 = (T) readable(r10, r0, r12.getInvalid$runtime_release());
        if (r2 != null) goto L8;
        readError();
        throw new KotlinNothingValueException();
    L8:
        if (r2.getSnapshotId$runtime_release() != r12.getSnapshotId()) goto L10;
        return r2;
    L10:
        Object r4 = getLock();
        monitor-enter(r4);
        T r7 = (T) readable(r11.getFirstStateRecord(), r0, r12.getInvalid$runtime_release());
        if (r7 != null) goto L16;
        readError();     // Catch: Throwable -> L27
        throw new KotlinNothingValueException();     // Catch: Throwable -> L27
    L16:
        if (r7.getSnapshotId$runtime_release() != r0) goto L19;
    L20:
        monitor-exit(r4);
        Intrinsics.checkNotNull(r7, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
        if (r2.getSnapshotId$runtime_release() == SnapshotId_jvmKt.toSnapshotId(1)) goto L24;
        r12.mo3926recordModified$runtime_release(r11);
    L24:
        return r7;
    L19:
        r7 = (T) newWritableRecordLocked(r7, r11, r12);
    L27:
        th = move-exception;
        throw th;
    }

    public static final <T extends StateRecord> T overwritableRecord(T r7, StateObject r8, Snapshot r9, T r10) {
        if (r9.getReadOnly() == false) goto L5;
        r9.mo3926recordModified$runtime_release(r8);
    L5:
        long r0 = r9.getSnapshotId();
        if (r10.getSnapshotId$runtime_release() != r0) goto L8;
        return r10;
    L8:
        Object r3 = getLock();
        monitor-enter(r3);
        T r6 = (T) newOverwritableRecordLocked(r7, r8);
        monitor-exit(r3);
        r6.setSnapshotId$runtime_release(r0);
        if (r10.getSnapshotId$runtime_release() == SnapshotId_jvmKt.toSnapshotId(1)) goto L16;
        r9.mo3926recordModified$runtime_release(r8);
    L16:
        return r6;
    L17:
        th = move-exception;
        throw th;
    }

    public static final <T extends StateRecord> T newWritableRecord(T r5, StateObject r6, Snapshot r7) {
        Object r1 = getLock();
        monitor-enter(r1);
        T r4 = (T) newWritableRecordLocked(r5, r6, r7);
        monitor-exit(r1);
        return r4;
    L8:
        th = move-exception;
        throw th;
    }

    private static final <T extends StateRecord> T newWritableRecordLocked(T r3, StateObject r4, Snapshot r5) {
        T r0 = (T) newOverwritableRecordLocked(r3, r4);
        r0.assign(r3);
        r0.setSnapshotId$runtime_release(r5.getSnapshotId());
        return r0;
    }

    public static final <T extends StateRecord> T newOverwritableRecordLocked(T r5, StateObject r6) {
        T r0 = (T) usedLocked(r6);
        if (r0 == null) goto L5;
        r0.setSnapshotId$runtime_release(Long.MAX_VALUE);
        return r0;
    L5:
        T r1 = (T) r5.create(Long.MAX_VALUE);
        r1.setNext$runtime_release(r6.getFirstStateRecord());
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        r6.prependStateRecord(r1);
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return r1;
    }

    public static final void notifyWrite(Snapshot snapshot, StateObject state) {
        snapshot.setWriteCount$runtime_release(snapshot.getWriteCount$runtime_release() + 1);
        Function1<Object, Unit> r0 = snapshot.getWriteObserver$runtime_release();
        if (r0 == null) goto L6;
        r0.invoke(state);
        return;
    }

    public static final <T extends StateRecord, R> R writable(T r6, StateObject state, Snapshot snapshot, Function1<? super T, ? extends R> r9) {
        Object lock$iv$iv = getLock();
        monitor-enter(lock$iv$iv);
        R r5 = r9.invoke(writableRecord(r6, state, snapshot));     // Catch: Throwable -> L9
        monitor-exit(lock$iv$iv);
        notifyWrite(snapshot, state);
        return r5;
    L9:
        th = move-exception;
        throw th;
    }

    public static final <T extends StateRecord, R> R writable(T r7, StateObject state, Function1<? super T, ? extends R> r9) {
        Object lock$iv$iv = getLock();
        monitor-enter(lock$iv$iv);
        Snapshot r6 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L9
        R r8 = r9.invoke(writableRecord(r7, state, r6));     // Catch: Throwable -> L9
        monitor-exit(lock$iv$iv);
        notifyWrite(r6, state);
        return r8;
    L9:
        th = move-exception;
        throw th;
    }

    public static final <T extends StateRecord, R> R overwritable(T r7, StateObject state, T r9, Function1<? super T, ? extends R> r10) {
        Object lock$iv$iv = getLock();
        monitor-enter(lock$iv$iv);
        Snapshot r6 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L9
        R r8 = r10.invoke(overwritableRecord(r7, state, r6, r9));     // Catch: Throwable -> L9
        monitor-exit(lock$iv$iv);
        notifyWrite(r6, state);
        return r8;
    L9:
        th = move-exception;
        throw th;
    }

    private static final Map<StateRecord, StateRecord> optimisticMerges(long currentSnapshotId, MutableSnapshot applyingSnapshot, SnapshotIdSet invalidSnapshots) {
        MutableScatterSet modified = applyingSnapshot.getModified$runtime_release();
        Map<StateRecord, StateRecord> r3 = null;
        if (modified != null) goto L5;
        return null;
    L5:
        SnapshotIdSet start = applyingSnapshot.getInvalid$runtime_release().set(applyingSnapshot.getSnapshotId()).or(applyingSnapshot.getPreviousIds$runtime_release());
        Object result = null;
        MutableScatterSet this_$iv = modified;
        int $i$f$forEach = 0;
        Object[] elements$iv = this_$iv.elements;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L47;
    L7:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        Map<StateRecord, StateRecord> r19 = r3;
        SnapshotIdSet start2 = start;
        Object result2 = result;
        ScatterSet this_$iv2 = this_$iv;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L43;
        int r4 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L10:
        if (j$iv$iv >= bitCount$iv$iv) goto L40;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L14;
        boolean r18 = true;
    L15:
        if (r18 == false) goto L38;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int r23 = r4;
        StateObject state = (StateObject) elements$iv[index$iv$iv];
        MutableScatterSet modified2 = modified;
        StateRecord first = state.getFirstStateRecord();
        int j$iv$iv2 = j$iv$iv;
        StateRecord current = readable(first, currentSnapshotId, invalidSnapshots);
        if (current != null) goto L19;
        SnapshotIdSet start3 = start2;
    L21:
        SnapshotIdSet start4 = start3;
    L39:
        slot$iv$iv = slot$iv$iv >> r23;
        j$iv$iv = j$iv$iv2 + 1;
        currentSnapshotId = currentSnapshotId;
        r4 = r23;
        modified = modified2;
        start2 = start4;
        $i$f$forEach = $i$f$forEach;
        goto L10
    L19:
        start3 = start2;
        StateRecord previous = readable(first, currentSnapshotId, start3);
        if (previous == null) goto L21;
        if (Intrinsics.areEqual(current, previous) == true) goto L35;
        start4 = start3;
        StateRecord applied = readable(first, applyingSnapshot.getSnapshotId(), applyingSnapshot.getInvalid$runtime_release());
        if (applied == null) goto L33;
        StateRecord merged = state.mergeRecords(previous, current, applied);
        if (merged == null) goto L32;
        HashMap r7 = (Map) result2;
        if (r7 != null) goto L31;
        Object it = new HashMap();
        result2 = it;
        r7 = (Map) it;
    L31:
        r7.put(current, merged);
        goto L39
    L32:
        return r19;
    L33:
        readError();
        throw new KotlinNothingValueException();
    L35:
        start4 = start3;
        goto L39
    L38:
        modified2 = modified;
        r23 = r4;
        j$iv$iv2 = j$iv$iv;
        start4 = start2;
        goto L39
    L14:
        r18 = false;
        goto L15
    L40:
        MutableScatterSet modified3 = modified;
        int $i$f$forEach2 = $i$f$forEach;
        SnapshotIdSet start5 = start2;
        if (bitCount$iv$iv != r4) goto L49;
        result = result2;
    L44:
        if (i$iv$iv == lastIndex$iv$iv) goto L47;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
        r3 = r19;
        modified = modified3;
        start = start5;
        $i$f$forEach = $i$f$forEach2;
    L49:
        return (Map) result2;
    L43:
        modified3 = modified;
        $i$f$forEach2 = $i$f$forEach;
        start5 = start2;
        result = result2;
    L47:
        result2 = result;
        goto L49
    }

    private static final Void reportReadonlySnapshotWrite() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    public static final <T extends StateRecord> T current(T r7, Snapshot r8) {
        T r0 = (T) readable(r7, r8.getSnapshotId(), r8.getInvalid$runtime_release());
        if (r0 != null) goto L16;
        Object r1 = getLock();
        monitor-enter(r1);
        T r4 = (T) readable(r7, r8.getSnapshotId(), r8.getInvalid$runtime_release());
        monitor-exit(r1);
        if (r4 != null) goto L19;
        readError();
        throw new KotlinNothingValueException();
    L19:
        return r4;
    L13:
        th = move-exception;
        throw th;
    L16:
        return r0;
    }

    public static final <T extends StateRecord> T current(T r11) {
        Snapshot r0 = Snapshot.Companion.getCurrent();
        T r2 = (T) readable(r11, r0.getSnapshotId(), r0.getInvalid$runtime_release());
        if (r2 != null) goto L17;
        Object r3 = getLock();
        monitor-enter(r3);
        Snapshot r6 = Snapshot.Companion.getCurrent();     // Catch: Throwable -> L13
        T r8 = (T) readable(r11, r6.getSnapshotId(), r6.getInvalid$runtime_release());
        monitor-exit(r3);
        if (r8 != null) goto L20;
        readError();
        throw new KotlinNothingValueException();
    L20:
        return r8;
    L13:
        th = move-exception;
        throw th;
    L17:
        return r2;
    }

    public static final <T extends StateRecord, R> R withCurrent(T r2, Function1<? super T, ? extends R> r3) {
        return r3.invoke(current(r2));
    }

    public static final SnapshotIdSet addRange(SnapshotIdSet $this$addRange, long from, long until) {
        SnapshotIdSet result = $this$addRange;
        long invalidId = from;
    L4:
        if (invalidId >= until) goto L6;
        result = result.set(invalidId);
        invalidId = invalidId + 1;
        goto L4
    L6:
        return result;
    }
}
