package androidx.compose.runtime.snapshots.tooling;

import androidx.autofill.HintConstants;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SnapshotObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a°\u0001\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\b\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u0016\b\b\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000f2T\b\u0004\u0010\u0010\u001aN\u0012!\u0012\u001f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\t\u0012!\u0012\u001f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\r\u0012\u0004\u0012\u0002H\u00060\u0011H\u0081\b¢\u0006\u0002\u0010\u0014\u001a \u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00072\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0000\u001a\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0007H\u0000\u001aB\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nH\u0002\u001a:\u0010\u001e\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\"\u0018\u00010!H\u0001\u001aj\u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00020\"\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\"\u0018\u00010!0#*\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nH\u0001\u001a\u0014\u0010$\u001a\u00020%*\u00020&2\u0006\u0010'\u001a\u00020\u0002H\u0007\" \u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0003\u0010\u0004¨\u0006("}, d2 = {"observers", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Landroidx/compose/runtime/snapshots/tooling/SnapshotObserver;", "getObservers$annotations", "()V", "creatingSnapshot", "R", "Landroidx/compose/runtime/snapshots/Snapshot;", "parent", "readObserver", "Lkotlin/Function1;", "", "", "writeObserver", "readonly", "", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "(Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/snapshots/Snapshot;", "dispatchObserverOnApplied", "snapshot", "changes", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/snapshots/StateObject;", "dispatchObserverOnPreDispose", "mergeObservers", "a", "b", "dispatchCreatedObservers", "result", "observerMap", "", "Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;", "Lkotlin/Pair;", "observeSnapshots", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "Landroidx/compose/runtime/snapshots/Snapshot$Companion;", "snapshotObserver", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SnapshotObserverKt {
    private static PersistentList<? extends SnapshotObserver> observers;

    static {
    }

    public static final /* synthetic */ PersistentList access$getObservers$p() {
        return observers;
    }

    private static /* synthetic */ void getObservers$annotations() {
    }

    public static final ObserverHandle observeSnapshots(Snapshot.Companion $this$observeSnapshots, final SnapshotObserver snapshotObserver) {
        Object lock$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv);
        PersistentList<? extends SnapshotObserver> r4 = observers;     // Catch: Throwable -> L12
        if (r4 != null) goto L8;
        r4 = ExtensionsKt.persistentListOf();     // Catch: Throwable -> L12
    L8:
        observers = r4.add(snapshotObserver);     // Catch: Throwable -> L12
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L12
        monitor-exit(lock$iv$iv);
        return new SnapshotObserverKt$$ExternalSyntheticLambda0(snapshotObserver);
    L12:
        th = move-exception;
        throw th;
    }

    static final void observeSnapshots$lambda$3(SnapshotObserver $snapshotObserver) {
        Object lock$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv);
        PersistentList<? extends SnapshotObserver> r4 = observers;     // Catch: Throwable -> L16
        PersistentList<? extends SnapshotObserver> r5 = null;
        if (r4 == null) goto L8;
        PersistentList<? extends SnapshotObserver> r6 = r4.remove($snapshotObserver);     // Catch: Throwable -> L16
    L9:
        if (r6 != null) goto L11;
    L13:
        observers = r5;     // Catch: Throwable -> L16
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L16
        monitor-exit(lock$iv$iv);
        return;
    L11:
        if (r6.isEmpty() == true) goto L13;
        r5 = r6;
        goto L13
    L8:
        r6 = null;
    L16:
        th = move-exception;
        throw th;
    }

    public static final <R extends Snapshot> R creatingSnapshot(Snapshot parent, Function1<Object, Unit> r9, Function1<Object, Unit> r10, boolean readonly, Function2<? super Function1<Object, Unit>, ? super Function1<Object, Unit>, ? extends R> r12) {
        Map<SnapshotObserver, SnapshotInstanceObservers> r1 = null;
        PersistentList observers2 = access$getObservers$p();
        Function1<Object, Unit> r3 = r9;
        Function1<Object, Unit> r4 = r10;
        if (observers2 == null) goto L5;
        Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> r5 = mergeObservers(observers2, parent, readonly, r9, r10);
        SnapshotInstanceObservers mappedObservers = r5.getFirst();
        r3 = mappedObservers.getReadObserver();
        r4 = mappedObservers.getWriteObserver();
        r1 = r5.getSecond();
    L5:
        R r6 = r12.invoke(r3, r4);
        if (observers2 == null) goto L8;
        dispatchCreatedObservers(observers2, parent, r6, r1);
    L8:
        return r6;
    }

    public static final Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> mergeObservers(PersistentList<? extends SnapshotObserver> r16, Snapshot parent, boolean readonly, Function1<Object, Unit> r19, Function1<Object, Unit> r20) {
        Function1<Object, Unit> r0 = r19;
        Function1<Object, Unit> r1 = r20;
        Map r2 = null;
        PersistentList<? extends SnapshotObserver> $this$fastForEach$iv = r16;
        int index$iv = 0;
        int r6 = $this$fastForEach$iv.size();
    L3:
        if (index$iv >= r6) goto L13;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        SnapshotObserver observer = (SnapshotObserver) item$iv;
        SnapshotInstanceObservers instance = observer.onPreCreate(parent, readonly);
        if (instance == null) goto L11;
        r0 = mergeObservers(instance.getReadObserver(), r0);
        r1 = mergeObservers(instance.getWriteObserver(), r1);
        if (r2 != null) goto L9;
        Map newMap = new LinkedHashMap();
        r2 = newMap;
        Map r13 = r2;
    L10:
        r2.put(observer, instance);
        r2 = r13;
        goto L11
    L9:
        r13 = r2;
    L11:
        index$iv = index$iv + 1;
        goto L3
    L13:
        return TuplesKt.to(new SnapshotInstanceObservers(r0, r1), r2);
    }

    private static final Function1<Object, Unit> mergeObservers(final Function1<Object, Unit> r1, final Function1<Object, Unit> r2) {
        if (r1 == null) goto L5;
        if (r2 == null) goto L5;
        return new AnonymousClass2(r1, r2);
    L5:
        if (r1 != null) goto L8;
        return r2;
    L8:
        return r1;
    }

    public static final void dispatchCreatedObservers(PersistentList<? extends SnapshotObserver> r8, Snapshot parent, Snapshot result, Map<SnapshotObserver, SnapshotInstanceObservers> r11) {
        PersistentList<? extends SnapshotObserver> $this$fastForEach$iv = r8;
        int index$iv = 0;
        int r3 = $this$fastForEach$iv.size();
    L3:
        if (index$iv >= r3) goto L10;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        SnapshotObserver observer = (SnapshotObserver) item$iv;
        if (r11 == null) goto L7;
        SnapshotInstanceObservers instance = r11.get(observer);
    L8:
        observer.onCreated(result, parent, instance);
        index$iv = index$iv + 1;
        goto L3
    L7:
        instance = null;
        goto L8
    }

    public static final void dispatchObserverOnPreDispose(Snapshot snapshot) {
        List r0 = observers;
        if (r0 == null) goto L8;
        List $this$fastForEach$iv = r0;
        int index$iv = 0;
        int r3 = $this$fastForEach$iv.size();
    L5:
        if (index$iv >= r3) goto L10;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        SnapshotObserver observer = (SnapshotObserver) item$iv;
        observer.onPreDispose(snapshot);
        index$iv = index$iv + 1;
        goto L5
    L10:
        return;
    }

    public static final void dispatchObserverOnApplied(Snapshot snapshot, ScatterSet<StateObject> r10) {
        List r0 = observers;
        List r1 = r0;
        if (r1 != null) goto L5;
    L8:
        boolean r2 = true;
    L9:
        if (r2 == true) goto L18;
        if (r10 == null) goto L13;
        Set<? extends Object> r3 = ScatterSetWrapperKt.wrapIntoSet(r10);
        if (r3 == null) goto L13;
    L14:
        List $this$fastForEach$iv = r0;
        int index$iv = 0;
        int r5 = $this$fastForEach$iv.size();
    L15:
        if (index$iv >= r5) goto L20;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        SnapshotObserver observer = (SnapshotObserver) item$iv;
        observer.onApplied(snapshot, r3);
        index$iv = index$iv + 1;
        goto L15
    L20:
        return;
    L13:
        r3 = SetsKt.emptySet();
        goto L14
    L18:
        return;
    L5:
        if (r1.isEmpty() == true) goto L8;
        r2 = false;
        goto L9
    }
}
