package androidx.compose.runtime.snapshots;

import androidx.autofill.HintConstants;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterSet;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.DerivedStateObserver;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.Thread_jvmKt;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: SnapshotStateObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0001\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u00018B.\u0012'\u0010\u0002\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\tJ\u0016\u0010\u001e\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0002J\u0006\u0010 \u001a\u00020\u0005J\u000e\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0001J)\u0010\"\u001a\u00020\u00052!\u0010#\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00150\u0003J\b\u0010$\u001a\u00020\u0015H\u0002J&\u0010%\u001a\u00020\u0011\"\b\b\u0000\u0010&*\u00020\u00012\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u0002H&\u0012\u0004\u0012\u00020\u00050\u0003H\u0002J\u001d\u0010(\u001a\u00020\u00052\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0003H\u0082\bJ\u001e\u0010*\u001a\u00020\u00052\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010,\u001a\u00020\rH\u0007J?\u0010-\u001a\u00020\u0005\"\b\b\u0000\u0010&*\u00020\u00012\u0006\u0010!\u001a\u0002H&2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u0002H&\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010/J\u0010\u00100\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fH\u0002J\u001d\u00101\u001a\u00020\u00052\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00150\u0003H\u0082\bJ\b\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u00020\u0005H\u0002J\u0006\u00105\u001a\u00020\u0005J\u0006\u00106\u001a\u00020\u0005J\u0016\u00107\u001a\u00020\u00052\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007R&\u0010\n\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u0002\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001aj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "onChangedExecutor", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "callback", "(Lkotlin/jvm/functions/Function1;)V", "applyObserver", "Lkotlin/Function2;", "", "Landroidx/compose/runtime/snapshots/Snapshot;", "applyUnsubscribe", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "currentMap", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "currentMapThreadId", "", "isPaused", "", "observedScopeMaps", "Landroidx/compose/runtime/collection/MutableVector;", "observedScopeMapsLock", "pendingChanges", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/AtomicReference;", "readObserver", "sendingNotifications", "addChanges", "set", "clear", "scope", "clearIf", "predicate", "drainChanges", "ensureMap", "T", "onChanged", "forEachScopeMap", "block", "notifyChanges", "changes", "snapshot", "observeReads", "onValueChangedForScope", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "removeChanges", "removeScopeMapIf", "report", "", "sendNotifications", "start", "stop", "withNoObservations", "ObservedScopeMap", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SnapshotStateObserver {
    public static final int $stable = 0;
    private final Function2<Set<? extends Object>, Snapshot, Unit> applyObserver;
    private ObserverHandle applyUnsubscribe;
    private ObservedScopeMap currentMap;
    private long currentMapThreadId;
    private boolean isPaused;
    private final MutableVector<ObservedScopeMap> observedScopeMaps;
    private final Object observedScopeMapsLock;
    private final Function1<Function0<Unit>, Unit> onChangedExecutor;
    private final AtomicReference<Object> pendingChanges;
    private final Function1<Object, Unit> readObserver;
    private boolean sendingNotifications;

    /* JADX INFO: compiled from: SnapshotStateObserver.kt */
    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010 \u001a\u00020\u0004J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0001H\u0002J\u000e\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0001J\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020\u0004J0\u0010'\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00012\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040*J\u0014\u0010+\u001a\u00020%2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010-J\u000e\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0001J.\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00012\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0002J\u0018\u00101\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u0001H\u0002J)\u00102\u001a\u00020\u00042!\u00103\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020%0\u0003J\u0012\u00106\u001a\u00020\u00042\n\u00107\u001a\u0006\u0012\u0002\b\u00030\rR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\fX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R6\u0010\u0018\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019j\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\fX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "", "onChanged", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "currentScope", "currentScopeReads", "Landroidx/collection/MutableObjectIntMap;", "currentToken", "", "dependencyToDerivedStates", "Landroidx/compose/runtime/collection/ScopeMap;", "Landroidx/compose/runtime/DerivedState;", "Landroidx/collection/MutableScatterMap;", "deriveStateScopeCount", "derivedStateObserver", "Landroidx/compose/runtime/DerivedStateObserver;", "getDerivedStateObserver", "()Landroidx/compose/runtime/DerivedStateObserver;", "invalidated", "Landroidx/collection/MutableScatterSet;", "getOnChanged", "()Lkotlin/jvm/functions/Function1;", "recordedDerivedStateValues", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "scopeToValues", "Landroidx/collection/MutableScatterMap;", "statesToReread", "Landroidx/compose/runtime/collection/MutableVector;", "valueToScopes", "clear", "clearObsoleteStateReads", "scope", "clearScopeObservations", "hasScopeObservations", "", "notifyInvalidatedScopes", "observe", "readObserver", "block", "Lkotlin/Function0;", "recordInvalidation", "changes", "", "recordRead", "value", "recordedValues", "removeObservation", "removeScopeIf", "predicate", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "rereadDerivedState", "derivedState", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class ObservedScopeMap {
        private Object currentScope;
        private MutableObjectIntMap<Object> currentScopeReads;
        private int currentToken;
        private final MutableScatterMap<Object, Object> dependencyToDerivedStates;
        private int deriveStateScopeCount;
        private final DerivedStateObserver derivedStateObserver;
        private final MutableScatterSet<Object> invalidated;
        private final Function1<Object, Unit> onChanged;
        private final HashMap<DerivedState<?>, Object> recordedDerivedStateValues;
        private final MutableScatterMap<Object, MutableObjectIntMap<Object>> scopeToValues;
        private final MutableVector<DerivedState<?>> statesToReread;
        private final MutableScatterMap<Object, Object> valueToScopes;

        public ObservedScopeMap(Function1<Object, Unit> r9) {
            this.onChanged = r9;
            this.currentToken = -1;
            int r1 = 1;
            this.valueToScopes = ScopeMap.m3908constructorimpl$default(null, 1, null);
            int r3 = 0;
            this.scopeToValues = new MutableScatterMap(r3, r1, null);
            this.invalidated = new MutableScatterSet(0, 1, null);
            this.statesToReread = new MutableVector(new DerivedState[16], 0);
            this.derivedStateObserver = new SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1(this);
            this.dependencyToDerivedStates = ScopeMap.m3908constructorimpl$default(null, 1, null);
            this.recordedDerivedStateValues = new HashMap();
        }

        public static final /* synthetic */ int access$getDeriveStateScopeCount$p(ObservedScopeMap $this) {
            return $this.deriveStateScopeCount;
        }

        public static final /* synthetic */ void access$setDeriveStateScopeCount$p(ObservedScopeMap $this, int r1) {
            $this.deriveStateScopeCount = r1;
        }

        public final Function1<Object, Unit> getOnChanged() {
            return this.onChanged;
        }

        public final DerivedStateObserver getDerivedStateObserver() {
            return this.derivedStateObserver;
        }

        public final void recordRead(Object value) {
            Object scope = this.currentScope;
            Intrinsics.checkNotNull(scope);
            int r1 = this.currentToken;
            MutableObjectIntMap<Object> r2 = this.currentScopeReads;
            if (r2 != null) goto L5;
            int r5 = 0;
            r2 = new MutableObjectIntMap(r5, 1, null);
            this.currentScopeReads = r2;
            this.scopeToValues.set(scope, r2);
            Unit r3 = Unit.INSTANCE;
        L5:
            recordRead(value, r1, scope, r2);
        }

        private final void recordRead(Object value, int currentToken, Object currentScope, MutableObjectIntMap<Object> r33) {
            if (this.deriveStateScopeCount <= 0) goto L5;
            return;
        L5:
            int previousToken = r33.put(value, currentToken, -1);
            if ((value instanceof DerivedState) == false) goto L32;
            if (previousToken == currentToken) goto L32;
            DerivedState.Record record = ((DerivedState) value).getCurrentRecord();
            this.recordedDerivedStateValues.put(value, record.getCurrentValue());
            ObjectIntMap<StateObject> r8 = record.getDependencies();
            MutableScatterMap<Object, Object> r9 = this.dependencyToDerivedStates;
            ScopeMap.m3916removeScopeimpl(r9, value);
            ObjectIntMap<StateObject> r10 = r8;
            int $i$f$forEachKey = 0;
            Object[] k$iv = r10.keys;
            ObjectIntMap<StateObject> r13 = r10;
            long[] m$iv$iv = r13.metadata;
            int r16 = 2;
            int lastIndex$iv$iv = m$iv$iv.length - 2;
            int i$iv$iv = 0;
            if (0 > lastIndex$iv$iv) goto L34;
        L10:
            long slot$iv$iv = m$iv$iv[i$iv$iv];
            ObjectIntMap<StateObject> r22 = r10;
            int $i$f$forEachKey2 = $i$f$forEachKey;
            Object[] k$iv2 = k$iv;
            ObjectIntMap<StateObject> r20 = r13;
            long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
            if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L27;
            int r11 = 8;
            int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
            int j$iv$iv = 0;
        L13:
            if (j$iv$iv >= bitCount$iv$iv) goto L26;
            long value$iv$iv$iv = slot$iv$iv & 255;
            if (value$iv$iv$iv >= 128) goto L17;
            boolean r21 = true;
        L18:
            if (r21 == false) goto L24;
            int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
            StateObject dependency = (StateObject) k$iv2[index$iv$iv];
            if ((dependency instanceof StateObjectImpl) == false) goto L22;
            ReaderKind.Companion r27 = ReaderKind.Companion;
            ((StateObjectImpl) dependency).m3941recordReadInh_f27i8$runtime_release(ReaderKind.m3928constructorimpl(2));
        L22:
            ScopeMap.m3902addimpl(r9, dependency, value);
        L24:
            slot$iv$iv = slot$iv$iv >> r11;
            j$iv$iv = j$iv$iv + 1;
            r11 = r11;
            goto L13
        L17:
            r21 = false;
            goto L18
        L26:
            if (bitCount$iv$iv != r11) goto L34;
        L27:
            if (i$iv$iv == lastIndex$iv$iv) goto L34;
            i$iv$iv = i$iv$iv + 1;
            k$iv = k$iv2;
            r13 = r20;
            r10 = r22;
            $i$f$forEachKey = $i$f$forEachKey2;
        L34:
            if (previousToken != (-1)) goto L40;
            if ((value instanceof StateObjectImpl) == false) goto L38;
            ReaderKind.Companion r3 = ReaderKind.Companion;
            ((StateObjectImpl) value).m3941recordReadInh_f27i8$runtime_release(ReaderKind.m3928constructorimpl(r16));
        L38:
            ScopeMap.m3902addimpl(this.valueToScopes, value, currentScope);
            return;
        L40:
            return;
        L32:
            r16 = 2;
            goto L34
        }

        public final void observe(Object scope, Function1<Object, Unit> r12, Function0<Unit> r13) {
            Object previousScope = this.currentScope;
            MutableObjectIntMap<Object> r1 = this.currentScopeReads;
            int previousToken = this.currentToken;
            this.currentScope = scope;
            this.currentScopeReads = this.scopeToValues.get(scope);
            if (this.currentToken != (-1)) goto L5;
            this.currentToken = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());
        L5:
            DerivedStateObserver observer$iv = this.derivedStateObserver;
            MutableVector<DerivedStateObserver> r5 = SnapshotStateKt.derivedStateObservers();
            r5.add(observer$iv);     // Catch: Throwable -> L9
            Snapshot.Companion.observe(r12, null, r13);     // Catch: Throwable -> L9
            r5.removeAt(r5.getSize() - 1);
            Object r3 = this.currentScope;
            Intrinsics.checkNotNull(r3);
            clearObsoleteStateReads(r3);
            this.currentScope = previousScope;
            this.currentScopeReads = r1;
            this.currentToken = previousToken;
            return;
        L9:
            th = move-exception;
            r5.removeAt(r5.getSize() - 1);
            throw th;
        }

        private final void clearObsoleteStateReads(Object scope) {
            int currentToken = this.currentToken;
            MutableObjectIntMap<Object> r2 = this.currentScopeReads;
            if (r2 == null) goto L38;
            int $i$f$removeIf = 0;
            MutableObjectIntMap<Object> this_$iv$iv = r2;
            long[] m$iv$iv = this_$iv$iv.metadata;
            int lastIndex$iv$iv = m$iv$iv.length - 2;
            int i$iv$iv = 0;
            if (0 > lastIndex$iv$iv) goto L45;
        L6:
            long slot$iv$iv = m$iv$iv[i$iv$iv];
            long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
            if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L31;
            int r12 = 8;
            int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
            int j$iv$iv = 0;
        L9:
            if (j$iv$iv >= bitCount$iv$iv) goto L28;
            long value$iv$iv$iv = 255 & slot$iv$iv;
            boolean r18 = false;
            if (value$iv$iv$iv >= 128) goto L13;
            boolean r14 = true;
        L14:
            if (r14 == false) goto L26;
            int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
            int r17 = r12;
            Object value = r2.keys[index$iv$iv];
            int $i$f$removeIf2 = $i$f$removeIf;
            int token = r2.values[index$iv$iv];
            if (token == currentToken) goto L18;
            r18 = true;
        L18:
            boolean willRemove = r18;
            if (willRemove == false) goto L23;
            removeObservation(scope, value);
        L23:
            if (r18 == false) goto L27;
            r2.removeValueAt(index$iv$iv);
        L27:
            slot$iv$iv = slot$iv$iv >> r17;
            j$iv$iv = j$iv$iv + 1;
            r12 = r17;
            $i$f$removeIf = $i$f$removeIf2;
            currentToken = currentToken;
            goto L9
        L26:
            currentToken = currentToken;
            $i$f$removeIf2 = $i$f$removeIf;
            r17 = r12;
            goto L27
        L13:
            r14 = false;
            goto L14
        L28:
            int currentToken2 = currentToken;
            int $i$f$removeIf3 = $i$f$removeIf;
            if (bitCount$iv$iv != r12) goto L46;
        L32:
            if (i$iv$iv == lastIndex$iv$iv) goto L47;
            i$iv$iv = i$iv$iv + 1;
            $i$f$removeIf = $i$f$removeIf3;
            currentToken = currentToken2;
            goto L6
        L47:
            return;
        L46:
            return;
        L31:
            currentToken2 = currentToken;
            $i$f$removeIf3 = $i$f$removeIf;
            goto L32
        L45:
            return;
        }

        public final void clearScopeObservations(Object scope) {
            MutableObjectIntMap recordedValues = this.scopeToValues.remove(scope);
            if (recordedValues != null) goto L5;
            return;
        L5:
            MutableObjectIntMap this_$iv = recordedValues;
            Object[] k$iv = this_$iv.keys;
            int[] v$iv = this_$iv.values;
            long[] m$iv$iv = this_$iv.metadata;
            int lastIndex$iv$iv = m$iv$iv.length - 2;
            int i$iv$iv = 0;
            if (0 > lastIndex$iv$iv) goto L26;
        L7:
            long slot$iv$iv = m$iv$iv[i$iv$iv];
            MutableObjectIntMap recordedValues2 = recordedValues;
            ObjectIntMap this_$iv2 = this_$iv;
            if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L21;
            int r3 = 8;
            int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
            int j$iv$iv = 0;
        L10:
            if (j$iv$iv >= bitCount$iv$iv) goto L20;
            long value$iv$iv$iv = 255 & slot$iv$iv;
            if (value$iv$iv$iv >= 128) goto L14;
            boolean r20 = true;
        L15:
            if (r20 == false) goto L18;
            int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
            Object value = k$iv[index$iv$iv];
            int r21 = v$iv[index$iv$iv];
            removeObservation(scope, value);
        L18:
            slot$iv$iv = slot$iv$iv >> r3;
            j$iv$iv = j$iv$iv + 1;
            r3 = r3;
            goto L10
        L14:
            r20 = false;
            goto L15
        L20:
            if (bitCount$iv$iv == r3) goto L21;
            return;
        L21:
            if (i$iv$iv == lastIndex$iv$iv) goto L33;
            i$iv$iv = i$iv$iv + 1;
            recordedValues = recordedValues2;
            this_$iv = this_$iv2;
            goto L7
        L33:
            return;
        }

        public final void removeScopeIf(Function1<Object, Boolean> r51) {
            MutableScatterMap<Object, MutableObjectIntMap<Object>> r1 = this.scopeToValues;
            int $i$f$removeIf = 0;
            MutableScatterMap<Object, MutableObjectIntMap<Object>> this_$iv$iv = r1;
            int $i$f$forEachIndexed = 0;
            long[] m$iv$iv = this_$iv$iv.metadata;
            int lastIndex$iv$iv = m$iv$iv.length - 2;
            int i$iv$iv = 0;
            if (0 > lastIndex$iv$iv) goto L53;
        L4:
            long slot$iv$iv = m$iv$iv[i$iv$iv];
            char r15 = 7;
            long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
            if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L47;
            int r11 = 8;
            int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
            int j$iv$iv = 0;
        L7:
            if (j$iv$iv >= bitCount$iv$iv) goto L44;
            long value$iv$iv$iv = slot$iv$iv & 255;
            if (value$iv$iv$iv >= 128) goto L11;
            boolean r18 = true;
        L12:
            if (r18 == false) goto L42;
            int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
            Object scope = r1.keys[index$iv$iv];
            ObjectIntMap valueSet = (MutableObjectIntMap) r1.values[index$iv$iv];
            char r28 = r15;
            Boolean r29 = r51.invoke(scope);
            boolean willRemove = r29.booleanValue();
            if (willRemove == false) goto L36;
            int r32 = r11;
            ObjectIntMap this_$iv = valueSet;
            int $i$f$removeIf2 = $i$f$removeIf;
            Object[] k$iv = this_$iv.keys;
            int[] v$iv = this_$iv.values;
            ScatterMap this_$iv$iv2 = this_$iv$iv;
            long[] m$iv$iv2 = this_$iv.metadata;
            int lastIndex$iv$iv2 = m$iv$iv2.length - 2;
            int i$iv$iv2 = 0;
            if (0 > lastIndex$iv$iv2) goto L33;
        L17:
            long slot$iv$iv2 = m$iv$iv2[i$iv$iv2];
            int $i$f$forEachIndexed2 = $i$f$forEachIndexed;
            long[] m$iv$iv3 = m$iv$iv;
            long $this$maskEmptyOrDeleted$iv$iv$iv2 = slot$iv$iv;
            long $this$maskEmptyOrDeleted$iv$iv$iv3 = (((~slot$iv$iv2) << r28) & slot$iv$iv2) & (-9187201950435737472L);
            if ($this$maskEmptyOrDeleted$iv$iv$iv3 == (-9187201950435737472L)) goto L31;
            int bitCount$iv$iv2 = 8 - ((~(i$iv$iv2 - lastIndex$iv$iv2)) >>> 31);
            int j$iv$iv2 = 0;
        L20:
            if (j$iv$iv2 >= bitCount$iv$iv2) goto L29;
            long value$iv$iv$iv2 = slot$iv$iv2 & 255;
            if (value$iv$iv$iv2 >= 128) goto L24;
            boolean r8 = true;
        L25:
            if (r8 == false) goto L28;
            int index$iv$iv2 = (i$iv$iv2 << 3) + j$iv$iv2;
            Object value = k$iv[index$iv$iv2];
            int r49 = v$iv[index$iv$iv2];
            removeObservation(scope, value);
        L28:
            slot$iv$iv2 = slot$iv$iv2 >> r32;
            j$iv$iv2 = j$iv$iv2 + 1;
            goto L20
        L24:
            r8 = false;
            goto L25
        L29:
            int j$iv$iv3 = r32;
            if (bitCount$iv$iv2 == j$iv$iv3) goto L31;
        L38:
            if (r29.booleanValue() == false) goto L43;
            r1.removeValueAt(index$iv$iv);
        L43:
            slot$iv$iv = $this$maskEmptyOrDeleted$iv$iv$iv2 >> 8;
            j$iv$iv = j$iv$iv + 1;
            r11 = 8;
            r15 = r28;
            $i$f$removeIf = $i$f$removeIf2;
            this_$iv$iv = this_$iv$iv2;
            $i$f$forEachIndexed = $i$f$forEachIndexed2;
            m$iv$iv = m$iv$iv3;
        L31:
            if (i$iv$iv2 == lastIndex$iv$iv2) goto L38;
            i$iv$iv2 = i$iv$iv2 + 1;
            slot$iv$iv = $this$maskEmptyOrDeleted$iv$iv$iv2;
            $i$f$forEachIndexed = $i$f$forEachIndexed2;
            m$iv$iv = m$iv$iv3;
            r32 = 8;
            goto L17
        L33:
            $i$f$forEachIndexed2 = $i$f$forEachIndexed;
            m$iv$iv3 = m$iv$iv;
            $this$maskEmptyOrDeleted$iv$iv$iv2 = slot$iv$iv;
            goto L38
        L36:
            $i$f$removeIf2 = $i$f$removeIf;
            this_$iv$iv2 = this_$iv$iv;
            $i$f$forEachIndexed2 = $i$f$forEachIndexed;
            m$iv$iv3 = m$iv$iv;
            $this$maskEmptyOrDeleted$iv$iv$iv2 = slot$iv$iv;
            goto L38
        L42:
            $i$f$removeIf2 = $i$f$removeIf;
            this_$iv$iv2 = this_$iv$iv;
            $i$f$forEachIndexed2 = $i$f$forEachIndexed;
            m$iv$iv3 = m$iv$iv;
            $this$maskEmptyOrDeleted$iv$iv$iv2 = slot$iv$iv;
            r28 = r15;
            goto L43
        L11:
            r18 = false;
            goto L12
        L44:
            int $i$f$removeIf3 = $i$f$removeIf;
            ScatterMap this_$iv$iv3 = this_$iv$iv;
            int $i$f$forEachIndexed3 = $i$f$forEachIndexed;
            long[] m$iv$iv4 = m$iv$iv;
            if (bitCount$iv$iv != r11) goto L65;
        L48:
            if (i$iv$iv == lastIndex$iv$iv) goto L66;
            i$iv$iv = i$iv$iv + 1;
            $i$f$removeIf = $i$f$removeIf3;
            this_$iv$iv = this_$iv$iv3;
            $i$f$forEachIndexed = $i$f$forEachIndexed3;
            m$iv$iv = m$iv$iv4;
            goto L4
        L66:
            return;
        L65:
            return;
        L47:
            $i$f$removeIf3 = $i$f$removeIf;
            this_$iv$iv3 = this_$iv$iv;
            $i$f$forEachIndexed3 = $i$f$forEachIndexed;
            m$iv$iv4 = m$iv$iv;
            goto L48
        }

        public final boolean hasScopeObservations() {
            return this.scopeToValues.isNotEmpty();
        }

        private final void removeObservation(Object scope, Object value) {
            ScopeMap.m3915removeimpl(this.valueToScopes, value, scope);
            if ((value instanceof DerivedState) == true) goto L5;
            return;
        L5:
            if (ScopeMap.m3909containsimpl(this.valueToScopes, value) == true) goto L9;
            ScopeMap.m3916removeScopeimpl(this.dependencyToDerivedStates, value);
            this.recordedDerivedStateValues.remove(value);
            return;
        }

        public final void clear() {
            ScopeMap.m3906clearimpl(this.valueToScopes);
            this.scopeToValues.clear();
            ScopeMap.m3906clearimpl(this.dependencyToDerivedStates);
            this.recordedDerivedStateValues.clear();
        }

        public final boolean recordInvalidation(Set<? extends Object> r76) {
            boolean hasValues = false;
            MutableScatterMap<Object, Object> r2 = this.dependencyToDerivedStates;
            HashMap<DerivedState<?>, Object> r3 = this.recordedDerivedStateValues;
            MutableScatterMap valueToScopes = this.valueToScopes;
            MutableScatterSet<Object> r5 = this.invalidated;
            Set $this$fastForEach$iv = r76;
            int $i$f$fastForEach = 0;
            String r9 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
            if (($this$fastForEach$iv instanceof ScatterSetWrapper) == false) goto L165;
            ScatterSet this_$iv$iv = ((ScatterSetWrapper) $this$fastForEach$iv).getSet$runtime_release();
            Object[] elements$iv$iv = this_$iv$iv.elements;
            ScatterSet this_$iv$iv$iv = this_$iv$iv;
            long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
            int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
            int i$iv$iv$iv = 0;
            if (0 > lastIndex$iv$iv$iv) goto L308;
        L6:
            long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
            Object[] elements$iv$iv2 = elements$iv$iv;
            int r31 = 8;
            Set $this$fastForEach$iv2 = $this$fastForEach$iv;
            int $i$f$fastForEach2 = $i$f$fastForEach;
            if (((((~slot$iv$iv$iv) << 7) & slot$iv$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L158;
            int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
            int j$iv$iv$iv = 0;
        L9:
            if (j$iv$iv$iv >= bitCount$iv$iv$iv) goto L155;
            long value$iv$iv$iv$iv = slot$iv$iv$iv & 255;
            if (value$iv$iv$iv$iv >= 128) goto L13;
            int $i$f$isFull = 1;
        L14:
            if ($i$f$isFull == 0) goto L153;
            int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
            int index$iv$iv = index$iv$iv$iv;
            boolean hasValues2 = hasValues;
            Object value = elements$iv$iv2[index$iv$iv];
            int j$iv$iv$iv2 = j$iv$iv$iv;
            if ((value instanceof StateObjectImpl) == false) goto L22;
            ReaderKind.Companion r36 = ReaderKind.Companion;
            int index$iv$iv$iv2 = ReaderKind.m3928constructorimpl(2);
            if (((StateObjectImpl) value).m3940isReadInh_f27i8$runtime_release(index$iv$iv$iv2) == true) goto L22;
            ScatterSet this_$iv$iv2 = this_$iv$iv;
            String r68 = r9;
            int bitCount$iv$iv$iv2 = bitCount$iv$iv$iv;
            ScatterSet this_$iv$iv$iv2 = this_$iv$iv$iv;
            long[] m$iv$iv$iv2 = m$iv$iv$iv;
            int lastIndex$iv$iv$iv2 = lastIndex$iv$iv$iv;
            int i$iv$iv$iv2 = i$iv$iv$iv;
            hasValues = hasValues2;
        L154:
            slot$iv$iv$iv = slot$iv$iv$iv >> 8;
            j$iv$iv$iv = j$iv$iv$iv2 + 1;
            r31 = 8;
            m$iv$iv$iv = m$iv$iv$iv2;
            lastIndex$iv$iv$iv = lastIndex$iv$iv$iv2;
            this_$iv$iv$iv = this_$iv$iv$iv2;
            this_$iv$iv = this_$iv$iv2;
            r9 = r68;
            bitCount$iv$iv$iv = bitCount$iv$iv$iv2;
            i$iv$iv$iv = i$iv$iv$iv2;
        L22:
            if (ScopeMap.m3909containsimpl(r2, value) == false) goto L121;
            Object value$iv = r2.get(value);
            if (value$iv != null) goto L26;
            this_$iv$iv2 = this_$iv$iv;
            r68 = r9;
            bitCount$iv$iv$iv2 = bitCount$iv$iv$iv;
            this_$iv$iv$iv2 = this_$iv$iv$iv;
            m$iv$iv$iv2 = m$iv$iv$iv;
            lastIndex$iv$iv$iv2 = lastIndex$iv$iv$iv;
            i$iv$iv$iv2 = i$iv$iv$iv;
        L122:
            int r6 = 0;
            Object value$iv2 = valueToScopes.get(value);
            if (value$iv2 != null) goto L125;
            hasValues = hasValues2;
            goto L154
        L125:
            if ((value$iv2 instanceof MutableScatterSet) == false) goto L149;
            ScatterSet this_$iv$iv3 = (MutableScatterSet) value$iv2;
            int $i$f$forEach = 0;
            Object[] elements$iv$iv3 = this_$iv$iv3.elements;
            long[] m$iv$iv$iv3 = this_$iv$iv3.metadata;
            int lastIndex$iv$iv$iv3 = m$iv$iv$iv3.length - 2;
            int i$iv$iv$iv3 = 0;
            if (0 > lastIndex$iv$iv$iv3) goto L148;
        L128:
            long slot$iv$iv$iv2 = m$iv$iv$iv3[i$iv$iv$iv3];
            int r42 = r6;
            Object value$iv3 = value$iv2;
            ScatterSet this_$iv$iv4 = this_$iv$iv3;
            int $i$f$forEach2 = $i$f$forEach;
            long $this$maskEmptyOrDeleted$iv$iv$iv$iv = (((~slot$iv$iv$iv2) << 7) & slot$iv$iv$iv2) & (-9187201950435737472L);
            if ($this$maskEmptyOrDeleted$iv$iv$iv$iv == (-9187201950435737472L)) goto L143;
            int bitCount$iv$iv$iv3 = 8 - ((~(i$iv$iv$iv3 - lastIndex$iv$iv$iv3)) >>> 31);
            int j$iv$iv$iv3 = 0;
        L131:
            if (j$iv$iv$iv3 >= bitCount$iv$iv$iv3) goto L140;
            long value$iv$iv$iv$iv2 = slot$iv$iv$iv2 & 255;
            if (value$iv$iv$iv$iv2 >= 128) goto L135;
            boolean r8 = true;
        L136:
            if (r8 == false) goto L139;
            int index$iv$iv$iv3 = (i$iv$iv$iv3 << 3) + j$iv$iv$iv3;
            r5.add(elements$iv$iv3[index$iv$iv$iv3]);
            hasValues2 = true;
        L139:
            slot$iv$iv$iv2 = slot$iv$iv$iv2 >> 8;
            j$iv$iv$iv3 = j$iv$iv$iv3 + 1;
            value = value;
            goto L131
        L135:
            r8 = false;
            goto L136
        L140:
            Object value2 = value;
            if (bitCount$iv$iv$iv3 != 8) goto L148;
        L144:
            if (i$iv$iv$iv3 == lastIndex$iv$iv$iv3) goto L148;
            i$iv$iv$iv3 = i$iv$iv$iv3 + 1;
            this_$iv$iv3 = this_$iv$iv4;
            $i$f$forEach = $i$f$forEach2;
            r6 = r42;
            value$iv2 = value$iv3;
            value = value2;
            goto L128
        L143:
            value2 = value;
        L148:
            hasValues = hasValues2;
            goto L154
        L149:
            r5.add(value$iv2);
            hasValues = true;
            goto L154
        L26:
            if ((value$iv instanceof MutableScatterSet) == false) goto L84;
            ScatterSet this_$iv$iv5 = (MutableScatterSet) value$iv;
            Object[] elements$iv$iv4 = this_$iv$iv5.elements;
            long[] m$iv$iv$iv4 = this_$iv$iv5.metadata;
            int lastIndex$iv$iv$iv4 = m$iv$iv$iv4.length - 2;
            int i$iv$iv$iv4 = 0;
            if (0 > lastIndex$iv$iv$iv4) goto L81;
        L29:
            long slot$iv$iv$iv3 = m$iv$iv$iv4[i$iv$iv$iv4];
            int index$iv$iv2 = index$iv$iv;
            this_$iv$iv$iv2 = this_$iv$iv$iv;
            m$iv$iv$iv2 = m$iv$iv$iv;
            lastIndex$iv$iv$iv2 = lastIndex$iv$iv$iv;
            long $this$maskEmptyOrDeleted$iv$iv$iv$iv2 = (((~slot$iv$iv$iv3) << 7) & slot$iv$iv$iv3) & (-9187201950435737472L);
            if ($this$maskEmptyOrDeleted$iv$iv$iv$iv2 == (-9187201950435737472L)) goto L78;
            int bitCount$iv$iv$iv4 = 8 - ((~(i$iv$iv$iv4 - lastIndex$iv$iv$iv4)) >>> 31);
            int j$iv$iv$iv4 = 0;
        L32:
            if (j$iv$iv$iv4 >= bitCount$iv$iv$iv4) goto L75;
            long value$iv$iv$iv$iv3 = slot$iv$iv$iv3 & 255;
            if (value$iv$iv$iv$iv3 >= 128) goto L36;
            boolean r13 = true;
        L37:
            if (r13 == false) goto L73;
            int index$iv$iv$iv4 = (i$iv$iv$iv4 << 3) + j$iv$iv$iv4;
            ScatterSet this_$iv$iv6 = this_$iv$iv;
            DerivedState<?> r10 = (DerivedState) elements$iv$iv4[index$iv$iv$iv4];
            Intrinsics.checkNotNull(r10, r9);
            int j$iv$iv$iv5 = j$iv$iv$iv4;
            Object previousValue = r3.get(r10);
            SnapshotMutationPolicy<?> r55 = r10.getPolicy();
            if (r55 != null) goto L41;
            r55 = SnapshotStateKt.structuralEqualityPolicy();
        L41:
            SnapshotMutationPolicy<?> r14 = r55;
            if (r14.equivalent(r10.getCurrentRecord().getCurrentValue(), previousValue) == true) goto L71;
            Object value$iv4 = valueToScopes.get(r10);
            if (value$iv4 != null) goto L46;
            String r69 = r9;
            int bitCount$iv$iv$iv5 = bitCount$iv$iv$iv;
            int i$iv$iv$iv5 = i$iv$iv$iv;
        L74:
            slot$iv$iv$iv3 = slot$iv$iv$iv3 >> 8;
            j$iv$iv$iv4 = j$iv$iv$iv5 + 1;
            r31 = 8;
            this_$iv$iv = this_$iv$iv6;
            r9 = r69;
            bitCount$iv$iv$iv = bitCount$iv$iv$iv5;
            i$iv$iv$iv = i$iv$iv$iv5;
            goto L32
        L46:
            if ((value$iv4 instanceof MutableScatterSet) == false) goto L68;
            ScatterSet this_$iv$iv7 = (MutableScatterSet) value$iv4;
            Object[] elements$iv$iv5 = this_$iv$iv7.elements;
            long[] m$iv$iv$iv5 = this_$iv$iv7.metadata;
            int lastIndex$iv$iv$iv5 = m$iv$iv$iv5.length - 2;
            int i$iv$iv$iv6 = 0;
            if (0 > lastIndex$iv$iv$iv5) goto L65;
        L49:
            long slot$iv$iv$iv4 = m$iv$iv$iv5[i$iv$iv$iv6];
            SnapshotMutationPolicy<?> r72 = r14;
            i$iv$iv$iv5 = i$iv$iv$iv;
            r69 = r9;
            bitCount$iv$iv$iv5 = bitCount$iv$iv$iv;
            if (((((~slot$iv$iv$iv4) << 7) & slot$iv$iv$iv4) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L63;
            int bitCount$iv$iv$iv6 = 8 - ((~(i$iv$iv$iv6 - lastIndex$iv$iv$iv5)) >>> 31);
            int j$iv$iv$iv6 = 0;
        L52:
            if (j$iv$iv$iv6 >= bitCount$iv$iv$iv6) goto L61;
            long value$iv$iv$iv$iv4 = slot$iv$iv$iv4 & 255;
            if (value$iv$iv$iv$iv4 >= 128) goto L56;
            boolean r15 = true;
        L57:
            if (r15 == false) goto L60;
            int index$iv$iv$iv5 = (i$iv$iv$iv6 << 3) + j$iv$iv$iv6;
            Object scope = elements$iv$iv5[index$iv$iv$iv5];
            r5.add(scope);
            hasValues2 = true;
        L60:
            slot$iv$iv$iv4 = slot$iv$iv$iv4 >> r31;
            j$iv$iv$iv6 = j$iv$iv$iv6 + 1;
            goto L52
        L56:
            r15 = false;
            goto L57
        L61:
            int j$iv$iv$iv7 = r31;
            if (bitCount$iv$iv$iv6 != j$iv$iv$iv7) goto L74;
        L63:
            if (i$iv$iv$iv6 == lastIndex$iv$iv$iv5) goto L74;
            i$iv$iv$iv6 = i$iv$iv$iv6 + 1;
            r9 = r69;
            bitCount$iv$iv$iv = bitCount$iv$iv$iv5;
            i$iv$iv$iv = i$iv$iv$iv5;
            r14 = r72;
            r31 = 8;
            goto L49
        L65:
            r69 = r9;
            bitCount$iv$iv$iv5 = bitCount$iv$iv$iv;
            i$iv$iv$iv5 = i$iv$iv$iv;
            goto L74
        L68:
            r69 = r9;
            bitCount$iv$iv$iv5 = bitCount$iv$iv$iv;
            i$iv$iv$iv5 = i$iv$iv$iv;
            r5.add(value$iv4);
            hasValues2 = true;
            goto L74
        L71:
            r69 = r9;
            bitCount$iv$iv$iv5 = bitCount$iv$iv$iv;
            i$iv$iv$iv5 = i$iv$iv$iv;
            this.statesToReread.add(r10);
            goto L74
        L73:
            this_$iv$iv6 = this_$iv$iv;
            r69 = r9;
            bitCount$iv$iv$iv5 = bitCount$iv$iv$iv;
            j$iv$iv$iv5 = j$iv$iv$iv4;
            i$iv$iv$iv5 = i$iv$iv$iv;
            goto L74
        L36:
            r13 = false;
            goto L37
        L75:
            this_$iv$iv2 = this_$iv$iv;
            r68 = r9;
            bitCount$iv$iv$iv2 = bitCount$iv$iv$iv;
            i$iv$iv$iv2 = i$iv$iv$iv;
            if (bitCount$iv$iv$iv4 != r31) goto L122;
        L79:
            if (i$iv$iv$iv4 == lastIndex$iv$iv$iv4) goto L122;
            i$iv$iv$iv4 = i$iv$iv$iv4 + 1;
            m$iv$iv$iv = m$iv$iv$iv2;
            lastIndex$iv$iv$iv = lastIndex$iv$iv$iv2;
            this_$iv$iv$iv = this_$iv$iv$iv2;
            index$iv$iv = index$iv$iv2;
            this_$iv$iv = this_$iv$iv2;
            r9 = r68;
            bitCount$iv$iv$iv = bitCount$iv$iv$iv2;
            i$iv$iv$iv = i$iv$iv$iv2;
            r31 = 8;
            goto L29
        L78:
            this_$iv$iv2 = this_$iv$iv;
            r68 = r9;
            bitCount$iv$iv$iv2 = bitCount$iv$iv$iv;
            i$iv$iv$iv2 = i$iv$iv$iv;
            goto L79
        L81:
            this_$iv$iv2 = this_$iv$iv;
            r68 = r9;
            bitCount$iv$iv$iv2 = bitCount$iv$iv$iv;
            this_$iv$iv$iv2 = this_$iv$iv$iv;
            m$iv$iv$iv2 = m$iv$iv$iv;
            lastIndex$iv$iv$iv2 = lastIndex$iv$iv$iv;
            i$iv$iv$iv2 = i$iv$iv$iv;
            goto L122
        L84:
            this_$iv$iv2 = this_$iv$iv;
            r68 = r9;
            bitCount$iv$iv$iv2 = bitCount$iv$iv$iv;
            this_$iv$iv$iv2 = this_$iv$iv$iv;
            m$iv$iv$iv2 = m$iv$iv$iv;
            lastIndex$iv$iv$iv2 = lastIndex$iv$iv$iv;
            i$iv$iv$iv2 = i$iv$iv$iv;
            DerivedState<?> r7 = (DerivedState) value$iv;
            Object previousValue2 = r3.get(r7);
            SnapshotMutationPolicy<?> r11 = r7.getPolicy();
            if (r11 != null) goto L88;
            r11 = SnapshotStateKt.structuralEqualityPolicy();
        L88:
            if (r11.equivalent(r7.getCurrentRecord().getCurrentValue(), previousValue2) == true) goto L117;
            int r12 = 0;
            Object value$iv5 = valueToScopes.get(r7);
            if (value$iv5 == null) goto L122;
            if ((value$iv5 instanceof MutableScatterSet) == false) goto L114;
            ScatterSet this_$iv$iv8 = (MutableScatterSet) value$iv5;
            Object[] elements$iv$iv6 = this_$iv$iv8.elements;
            long[] m$iv$iv$iv6 = this_$iv$iv8.metadata;
            int lastIndex$iv$iv$iv6 = m$iv$iv$iv6.length - 2;
            int i$iv$iv$iv7 = 0;
            if (0 > lastIndex$iv$iv$iv6) goto L122;
        L95:
            long slot$iv$iv$iv5 = m$iv$iv$iv6[i$iv$iv$iv7];
            SnapshotMutationPolicy<?> r52 = r11;
            int r54 = r12;
            Object value$iv6 = value$iv5;
            ScatterSet this_$iv$iv9 = this_$iv$iv8;
            long $this$maskEmptyOrDeleted$iv$iv$iv$iv3 = (((~slot$iv$iv$iv5) << 7) & slot$iv$iv$iv5) & (-9187201950435737472L);
            if ($this$maskEmptyOrDeleted$iv$iv$iv$iv3 == (-9187201950435737472L)) goto L109;
            int bitCount$iv$iv$iv7 = 8 - ((~(i$iv$iv$iv7 - lastIndex$iv$iv$iv6)) >>> 31);
            int j$iv$iv$iv8 = 0;
        L98:
            if (j$iv$iv$iv8 >= bitCount$iv$iv$iv7) goto L108;
            long value$iv$iv$iv$iv5 = slot$iv$iv$iv5 & 255;
            if (value$iv$iv$iv$iv5 >= 128) goto L102;
            boolean r16 = true;
        L103:
            if (r16 == false) goto L106;
            int index$iv$iv$iv6 = (i$iv$iv$iv7 << 3) + j$iv$iv$iv8;
            Object scope2 = elements$iv$iv6[index$iv$iv$iv6];
            r5.add(scope2);
            hasValues2 = true;
        L106:
            slot$iv$iv$iv5 = slot$iv$iv$iv5 >> 8;
            j$iv$iv$iv8 = j$iv$iv$iv8 + 1;
            goto L98
        L102:
            r16 = false;
            goto L103
        L108:
            if (bitCount$iv$iv$iv7 != 8) goto L122;
        L109:
            if (i$iv$iv$iv7 == lastIndex$iv$iv$iv6) goto L122;
            i$iv$iv$iv7 = i$iv$iv$iv7 + 1;
            value$iv5 = value$iv6;
            this_$iv$iv8 = this_$iv$iv9;
            r11 = r52;
            r12 = r54;
            goto L95
        L114:
            r5.add(value$iv5);
            hasValues2 = true;
            goto L122
        L117:
            this.statesToReread.add(r7);
            goto L122
        L121:
            this_$iv$iv2 = this_$iv$iv;
            r68 = r9;
            bitCount$iv$iv$iv2 = bitCount$iv$iv$iv;
            this_$iv$iv$iv2 = this_$iv$iv$iv;
            m$iv$iv$iv2 = m$iv$iv$iv;
            lastIndex$iv$iv$iv2 = lastIndex$iv$iv$iv;
            i$iv$iv$iv2 = i$iv$iv$iv;
            goto L122
        L153:
            j$iv$iv$iv2 = j$iv$iv$iv;
            this_$iv$iv2 = this_$iv$iv;
            r68 = r9;
            bitCount$iv$iv$iv2 = bitCount$iv$iv$iv;
            this_$iv$iv$iv2 = this_$iv$iv$iv;
            m$iv$iv$iv2 = m$iv$iv$iv;
            lastIndex$iv$iv$iv2 = lastIndex$iv$iv$iv;
            i$iv$iv$iv2 = i$iv$iv$iv;
            goto L154
        L13:
            $i$f$isFull = 0;
            goto L14
        L155:
            ScatterSet this_$iv$iv10 = this_$iv$iv;
            String r610 = r9;
            ScatterSet this_$iv$iv$iv3 = this_$iv$iv$iv;
            long[] m$iv$iv$iv7 = m$iv$iv$iv;
            int lastIndex$iv$iv$iv7 = lastIndex$iv$iv$iv;
            int i$iv$iv$iv8 = i$iv$iv$iv;
            if (bitCount$iv$iv$iv != r31) goto L308;
        L159:
            lastIndex$iv$iv$iv = lastIndex$iv$iv$iv7;
            int i$iv$iv$iv9 = i$iv$iv$iv8;
            if (i$iv$iv$iv9 == lastIndex$iv$iv$iv) goto L308;
            i$iv$iv$iv = i$iv$iv$iv9 + 1;
            $this$fastForEach$iv = $this$fastForEach$iv2;
            $i$f$fastForEach = $i$f$fastForEach2;
            elements$iv$iv = elements$iv$iv2;
            m$iv$iv$iv = m$iv$iv$iv7;
            this_$iv$iv$iv = this_$iv$iv$iv3;
            this_$iv$iv = this_$iv$iv10;
            r9 = r610;
            goto L6
        L158:
            this_$iv$iv10 = this_$iv$iv;
            r610 = r9;
            this_$iv$iv$iv3 = this_$iv$iv$iv;
            m$iv$iv$iv7 = m$iv$iv$iv;
            lastIndex$iv$iv$iv7 = lastIndex$iv$iv$iv;
            i$iv$iv$iv8 = i$iv$iv$iv;
        L308:
            if (this.statesToReread.getSize() == 0) goto L310;
            boolean r17 = true;
        L311:
            if (r17 == false) goto L316;
            MutableVector<DerivedState<?>> r4 = this.statesToReread;
            int i$iv = 0;
            Object[] content$iv = r4.content;
            int size$iv = r4.getSize();
        L313:
            if (i$iv >= size$iv) goto L315;
            rereadDerivedState((DerivedState) content$iv[i$iv]);
            i$iv = i$iv + 1;
            goto L313
        L315:
            this.statesToReread.clear();
        L316:
            return hasValues;
        L310:
            r17 = false;
            goto L311
        L165:
            Set $this$forEach$iv$iv = $this$fastForEach$iv;
            int $i$f$forEach3 = 0;
            Iterator r18 = $this$forEach$iv$iv.iterator();
        L167:
            if (r18.hasNext() == false) goto L308;
            Object element$iv$iv = r18.next();
            int r19 = 0;
            if ((element$iv$iv instanceof StateObjectImpl) == false) goto L174;
            ReaderKind.Companion r110 = ReaderKind.Companion;
            if (((StateObjectImpl) element$iv$iv).m3940isReadInh_f27i8$runtime_release(ReaderKind.m3928constructorimpl(2)) == true) goto L174;
            r2 = r2;
            HashMap<DerivedState<?>, Object> r27 = r3;
            MutableScatterMap valueToScopes2 = valueToScopes;
            Iterable $this$forEach$iv$iv2 = $this$forEach$iv$iv;
            int $i$f$forEach4 = $i$f$forEach3;
            Iterator r35 = r18;
        L305:
            r2 = r2;
            r3 = r27;
            valueToScopes = valueToScopes2;
            r18 = r35;
            $this$forEach$iv$iv = $this$forEach$iv$iv2;
            $i$f$forEach3 = $i$f$forEach4;
        L174:
            if (ScopeMap.m3909containsimpl(r2, element$iv$iv) == false) goto L273;
            int r111 = 0;
            Object value$iv7 = r2.get(element$iv$iv);
            if (value$iv7 != null) goto L178;
            r27 = r3;
            $this$forEach$iv$iv2 = $this$forEach$iv$iv;
            $i$f$forEach4 = $i$f$forEach3;
            r35 = r18;
        L274:
            MutableScatterMap dependencyToDerivedStates = null;
            Object value$iv8 = valueToScopes.get(element$iv$iv);
            if (value$iv8 != null) goto L277;
            valueToScopes2 = valueToScopes;
            goto L305
        L277:
            if ((value$iv8 instanceof MutableScatterSet) == false) goto L302;
            ScatterSet this_$iv$iv11 = (MutableScatterSet) value$iv8;
            Object[] elements$iv$iv7 = this_$iv$iv11.elements;
            long[] m$iv$iv$iv8 = this_$iv$iv11.metadata;
            int lastIndex$iv$iv$iv8 = m$iv$iv$iv8.length - 2;
            int i$iv$iv$iv10 = 0;
            if (0 > lastIndex$iv$iv$iv8) goto L299;
        L280:
            long slot$iv$iv$iv6 = m$iv$iv$iv8[i$iv$iv$iv10];
            boolean hasValues3 = hasValues;
            MutableScatterMap r21 = dependencyToDerivedStates;
            Object value$iv9 = value$iv8;
            valueToScopes2 = valueToScopes;
            long $this$maskEmptyOrDeleted$iv$iv$iv$iv4 = (((~slot$iv$iv$iv6) << 7) & slot$iv$iv$iv6) & (-9187201950435737472L);
            if ($this$maskEmptyOrDeleted$iv$iv$iv$iv4 == (-9187201950435737472L)) goto L296;
            int bitCount$iv$iv$iv8 = 8 - ((~(i$iv$iv$iv10 - lastIndex$iv$iv$iv8)) >>> 31);
            int j$iv$iv$iv9 = 0;
        L283:
            if (j$iv$iv$iv9 >= bitCount$iv$iv$iv8) goto L293;
            long value$iv$iv$iv$iv6 = slot$iv$iv$iv6 & 255;
            if (value$iv$iv$iv$iv6 >= 128) goto L287;
            boolean r20 = true;
        L288:
            if (r20 == false) goto L291;
            int index$iv$iv$iv7 = (i$iv$iv$iv10 << 3) + j$iv$iv$iv9;
            Object scope3 = elements$iv$iv7[index$iv$iv$iv7];
            r5.add(scope3);
            hasValues3 = true;
        L291:
            slot$iv$iv$iv6 = slot$iv$iv$iv6 >> 8;
            j$iv$iv$iv9 = j$iv$iv$iv9 + 1;
            goto L283
        L287:
            r20 = false;
            goto L288
        L293:
            if (bitCount$iv$iv$iv8 != 8) goto L295;
            hasValues = hasValues3;
        L297:
            if (i$iv$iv$iv10 == lastIndex$iv$iv$iv8) goto L305;
            i$iv$iv$iv10 = i$iv$iv$iv10 + 1;
            dependencyToDerivedStates = r21;
            valueToScopes = valueToScopes2;
            value$iv8 = value$iv9;
            goto L280
        L295:
            hasValues = hasValues3;
            goto L305
        L296:
            hasValues = hasValues3;
            goto L297
        L299:
            valueToScopes2 = valueToScopes;
            goto L305
        L302:
            valueToScopes2 = valueToScopes;
            r5.add(value$iv8);
            hasValues = true;
            goto L305
        L178:
            if ((value$iv7 instanceof MutableScatterSet) == false) goto L236;
            ScatterSet this_$iv$iv12 = (MutableScatterSet) value$iv7;
            boolean hasValues4 = hasValues;
            Object[] elements$iv$iv8 = this_$iv$iv12.elements;
            long[] m$iv$iv$iv9 = this_$iv$iv12.metadata;
            int lastIndex$iv$iv$iv9 = m$iv$iv$iv9.length - 2;
            int i$iv$iv$iv11 = 0;
            if (0 > lastIndex$iv$iv$iv9) goto L233;
        L181:
            long slot$iv$iv$iv7 = m$iv$iv$iv9[i$iv$iv$iv11];
            $this$forEach$iv$iv2 = $this$forEach$iv$iv;
            $i$f$forEach4 = $i$f$forEach3;
            r35 = r18;
            Object element$iv$iv2 = element$iv$iv;
            long $this$maskEmptyOrDeleted$iv$iv$iv$iv5 = (((~slot$iv$iv$iv7) << 7) & slot$iv$iv$iv7) & (-9187201950435737472L);
            if ($this$maskEmptyOrDeleted$iv$iv$iv$iv5 == (-9187201950435737472L)) goto L230;
            int bitCount$iv$iv$iv9 = 8 - ((~(i$iv$iv$iv11 - lastIndex$iv$iv$iv9)) >>> 31);
            int j$iv$iv$iv10 = 0;
        L184:
            if (j$iv$iv$iv10 >= bitCount$iv$iv$iv9) goto L227;
            long value$iv$iv$iv$iv7 = slot$iv$iv$iv7 & 255;
            if (value$iv$iv$iv$iv7 >= 128) goto L188;
            boolean r22 = true;
        L189:
            if (r22 == false) goto L225;
            int index$iv$iv$iv8 = (i$iv$iv$iv11 << 3) + j$iv$iv$iv10;
            int j$iv$iv$iv11 = j$iv$iv$iv10;
            DerivedState<?> r23 = (DerivedState) elements$iv$iv8[index$iv$iv$iv8];
            Intrinsics.checkNotNull(r23, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
            Object previousValue3 = r3.get(r23);
            SnapshotMutationPolicy<?> r43 = r23.getPolicy();
            if (r43 != null) goto L193;
            r43 = SnapshotStateKt.structuralEqualityPolicy();
        L193:
            SnapshotMutationPolicy<?> r44 = r43;
            int r45 = r19;
            SnapshotMutationPolicy<?> r112 = r44;
            if (r112.equivalent(r23.getCurrentRecord().getCurrentValue(), previousValue3) == true) goto L223;
            Object value$iv10 = valueToScopes.get(r23);
            if (value$iv10 != null) goto L198;
            int r59 = r111;
            Object value$iv11 = value$iv7;
            ScatterSet this_$iv$iv13 = this_$iv$iv12;
        L226:
            slot$iv$iv$iv7 = slot$iv$iv$iv7 >> 8;
            j$iv$iv$iv10 = j$iv$iv$iv11 + 1;
            r19 = r45;
            value$iv7 = value$iv11;
            this_$iv$iv12 = this_$iv$iv13;
            r111 = r59;
            goto L184
        L198:
            if ((value$iv10 instanceof MutableScatterSet) == false) goto L220;
            ScatterSet this_$iv$iv14 = (MutableScatterSet) value$iv10;
            Object[] elements$iv$iv9 = this_$iv$iv14.elements;
            long[] m$iv$iv$iv10 = this_$iv$iv14.metadata;
            int lastIndex$iv$iv$iv10 = m$iv$iv$iv10.length - 2;
            int i$iv$iv$iv12 = 0;
            if (0 > lastIndex$iv$iv$iv10) goto L217;
        L201:
            long slot$iv$iv$iv8 = m$iv$iv$iv10[i$iv$iv$iv12];
            SnapshotMutationPolicy<?> r60 = r112;
            r59 = r111;
            value$iv11 = value$iv7;
            this_$iv$iv13 = this_$iv$iv12;
            long $this$maskEmptyOrDeleted$iv$iv$iv$iv6 = (((~slot$iv$iv$iv8) << 7) & slot$iv$iv$iv8) & (-9187201950435737472L);
            if ($this$maskEmptyOrDeleted$iv$iv$iv$iv6 == (-9187201950435737472L)) goto L215;
            int bitCount$iv$iv$iv10 = 8 - ((~(i$iv$iv$iv12 - lastIndex$iv$iv$iv10)) >>> 31);
            int j$iv$iv$iv12 = 0;
        L204:
            if (j$iv$iv$iv12 >= bitCount$iv$iv$iv10) goto L214;
            long value$iv$iv$iv$iv8 = slot$iv$iv$iv8 & 255;
            if (value$iv$iv$iv$iv8 >= 128) goto L208;
            boolean r113 = true;
        L209:
            if (r113 == false) goto L212;
            int index$iv$iv$iv9 = (i$iv$iv$iv12 << 3) + j$iv$iv$iv12;
            Object scope4 = elements$iv$iv9[index$iv$iv$iv9];
            r5.add(scope4);
            hasValues4 = true;
        L212:
            slot$iv$iv$iv8 = slot$iv$iv$iv8 >> 8;
            j$iv$iv$iv12 = j$iv$iv$iv12 + 1;
            goto L204
        L208:
            r113 = false;
            goto L209
        L214:
            if (bitCount$iv$iv$iv10 != 8) goto L226;
        L215:
            if (i$iv$iv$iv12 == lastIndex$iv$iv$iv10) goto L226;
            i$iv$iv$iv12 = i$iv$iv$iv12 + 1;
            value$iv7 = value$iv11;
            this_$iv$iv12 = this_$iv$iv13;
            r111 = r59;
            r112 = r60;
            goto L201
        L217:
            r59 = r111;
            value$iv11 = value$iv7;
            this_$iv$iv13 = this_$iv$iv12;
            goto L226
        L220:
            r59 = r111;
            value$iv11 = value$iv7;
            this_$iv$iv13 = this_$iv$iv12;
            r5.add(value$iv10);
            hasValues4 = true;
            goto L226
        L223:
            r59 = r111;
            value$iv11 = value$iv7;
            this_$iv$iv13 = this_$iv$iv12;
            this.statesToReread.add(r23);
            goto L226
        L225:
            j$iv$iv$iv11 = j$iv$iv$iv10;
            r45 = r19;
            r59 = r111;
            value$iv11 = value$iv7;
            this_$iv$iv13 = this_$iv$iv12;
            goto L226
        L188:
            r22 = false;
            goto L189
        L227:
            int r46 = r19;
            int r510 = r111;
            Object value$iv12 = value$iv7;
            ScatterSet this_$iv$iv15 = this_$iv$iv12;
            if (bitCount$iv$iv$iv9 != 8) goto L235;
        L231:
            if (i$iv$iv$iv11 == lastIndex$iv$iv$iv9) goto L235;
            i$iv$iv$iv11 = i$iv$iv$iv11 + 1;
            r18 = r35;
            element$iv$iv = element$iv$iv2;
            $this$forEach$iv$iv = $this$forEach$iv$iv2;
            $i$f$forEach3 = $i$f$forEach4;
            r19 = r46;
            value$iv7 = value$iv12;
            this_$iv$iv12 = this_$iv$iv15;
            r111 = r510;
        L235:
            r27 = r3;
            hasValues = hasValues4;
            goto L274
        L230:
            r46 = r19;
            r510 = r111;
            value$iv12 = value$iv7;
            this_$iv$iv15 = this_$iv$iv12;
            goto L231
        L233:
            $this$forEach$iv$iv2 = $this$forEach$iv$iv;
            $i$f$forEach4 = $i$f$forEach3;
            r35 = r18;
            goto L235
        L236:
            boolean hasValues5 = hasValues;
            $this$forEach$iv$iv2 = $this$forEach$iv$iv;
            $i$f$forEach4 = $i$f$forEach3;
            r35 = r18;
            DerivedState<?> r1 = (DerivedState) value$iv7;
            Object previousValue4 = r3.get(r1);
            SnapshotMutationPolicy<?> r24 = r1.getPolicy();
            if (r24 != null) goto L240;
            r24 = SnapshotStateKt.structuralEqualityPolicy();
        L240:
            if (r24.equivalent(r1.getCurrentRecord().getCurrentValue(), previousValue4) == true) goto L269;
            int r25 = 0;
            Object value$iv13 = valueToScopes.get(r1);
            if (value$iv13 != null) goto L244;
            r27 = r3;
        L270:
            hasValues = hasValues5;
            goto L274
        L244:
            if ((value$iv13 instanceof MutableScatterSet) == false) goto L266;
            ScatterSet this_$iv$iv16 = (MutableScatterSet) value$iv13;
            Object[] elements$iv$iv10 = this_$iv$iv16.elements;
            long[] m$iv$iv$iv11 = this_$iv$iv16.metadata;
            r27 = r3;
            int lastIndex$iv$iv$iv11 = m$iv$iv$iv11.length - 2;
            int i$iv$iv$iv13 = 0;
            if (0 > lastIndex$iv$iv$iv11) goto L270;
        L247:
            long slot$iv$iv$iv9 = m$iv$iv$iv11[i$iv$iv$iv13];
            Object previousValue5 = previousValue4;
            SnapshotMutationPolicy<?> r47 = r24;
            int r40 = r25;
            Object value$iv14 = value$iv13;
            long $this$maskEmptyOrDeleted$iv$iv$iv$iv7 = (((~slot$iv$iv$iv9) << 7) & slot$iv$iv$iv9) & (-9187201950435737472L);
            if ($this$maskEmptyOrDeleted$iv$iv$iv$iv7 == (-9187201950435737472L)) goto L261;
            int bitCount$iv$iv$iv11 = 8 - ((~(i$iv$iv$iv13 - lastIndex$iv$iv$iv11)) >>> 31);
            int j$iv$iv$iv13 = 0;
        L250:
            if (j$iv$iv$iv13 >= bitCount$iv$iv$iv11) goto L260;
            long value$iv$iv$iv$iv9 = slot$iv$iv$iv9 & 255;
            if (value$iv$iv$iv$iv9 >= 128) goto L254;
            boolean r26 = true;
        L255:
            if (r26 == false) goto L258;
            int index$iv$iv$iv10 = (i$iv$iv$iv13 << 3) + j$iv$iv$iv13;
            Object scope5 = elements$iv$iv10[index$iv$iv$iv10];
            r5.add(scope5);
            hasValues5 = true;
        L258:
            slot$iv$iv$iv9 = slot$iv$iv$iv9 >> 8;
            j$iv$iv$iv13 = j$iv$iv$iv13 + 1;
            goto L250
        L254:
            r26 = false;
            goto L255
        L260:
            if (bitCount$iv$iv$iv11 != 8) goto L270;
        L261:
            if (i$iv$iv$iv13 == lastIndex$iv$iv$iv11) goto L270;
            i$iv$iv$iv13 = i$iv$iv$iv13 + 1;
            previousValue4 = previousValue5;
            r25 = r40;
            value$iv13 = value$iv14;
            r24 = r47;
            goto L247
        L266:
            r27 = r3;
            r5.add(value$iv13);
            hasValues5 = true;
            goto L270
        L269:
            r27 = r3;
            this.statesToReread.add(r1);
            goto L270
        L273:
            r27 = r3;
            $this$forEach$iv$iv2 = $this$forEach$iv$iv;
            $i$f$forEach4 = $i$f$forEach3;
            r35 = r18;
            goto L274
        }

        public final void rereadDerivedState(DerivedState<?> r31) {
            MutableScatterMap<Object, MutableObjectIntMap<Object>> r2 = this.scopeToValues;
            int token = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());
            MutableScatterMap<Object, Object> r4 = this.valueToScopes;
            int r5 = 0;
            Object value$iv = r4.get(r31);
            if (value$iv == null) goto L39;
            if ((value$iv instanceof MutableScatterSet) == false) goto L33;
            ScatterSet this_$iv$iv = (MutableScatterSet) value$iv;
            int $i$f$forEach = 0;
            Object[] elements$iv$iv = this_$iv$iv.elements;
            long[] m$iv$iv$iv = this_$iv$iv.metadata;
            int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
            int i$iv$iv$iv = 0;
            if (0 > lastIndex$iv$iv$iv) goto L46;
        L8:
            long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
            int $i$f$forEach2 = $i$f$forEach;
            MutableScatterMap<Object, Object> r18 = r4;
            int r19 = r5;
            if (((((~slot$iv$iv$iv) << 7) & slot$iv$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L27;
            int r6 = 8;
            int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
            int j$iv$iv$iv = 0;
        L11:
            if (j$iv$iv$iv >= bitCount$iv$iv$iv) goto L24;
            long value$iv$iv$iv$iv = slot$iv$iv$iv & 255;
            if (value$iv$iv$iv$iv >= 128) goto L15;
            int $i$f$isFull = 1;
        L16:
            if ($i$f$isFull == 0) goto L22;
            int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
            Object scope = elements$iv$iv[index$iv$iv$iv];
            MutableObjectIntMap<Object> r25 = r2.get(scope);
            if (r25 != null) goto L20;
            int j$iv$iv$iv2 = 0;
            int index$iv$iv$iv2 = 1;
            MutableObjectIntMap<Object> r7 = new MutableObjectIntMap(j$iv$iv$iv2, index$iv$iv$iv2, null);
            r2.set(scope, r7);
            Unit r8 = Unit.INSTANCE;
        L21:
            recordRead(r31, token, scope, r7);
        L23:
            slot$iv$iv$iv = slot$iv$iv$iv >> r6;
            j$iv$iv$iv = j$iv$iv$iv + 1;
            r6 = r6;
            value$iv = value$iv;
            this_$iv$iv = this_$iv$iv;
            goto L11
        L20:
            r7 = r25;
            goto L21
        L22:
            value$iv = value$iv;
            this_$iv$iv = this_$iv$iv;
            j$iv$iv$iv = j$iv$iv$iv;
            goto L23
        L15:
            $i$f$isFull = 0;
            goto L16
        L24:
            Object value$iv2 = value$iv;
            ScatterSet this_$iv$iv2 = this_$iv$iv;
            if (bitCount$iv$iv$iv != r6) goto L47;
        L28:
            if (i$iv$iv$iv == lastIndex$iv$iv$iv) goto L48;
            i$iv$iv$iv = i$iv$iv$iv + 1;
            r4 = r18;
            r5 = r19;
            $i$f$forEach = $i$f$forEach2;
            value$iv = value$iv2;
            this_$iv$iv = this_$iv$iv2;
            goto L8
        L48:
            return;
        L47:
            return;
        L27:
            value$iv2 = value$iv;
            this_$iv$iv2 = this_$iv$iv;
            goto L28
        L46:
            return;
        L33:
            MutableObjectIntMap<Object> r9 = r2.get(value$iv);
            if (r9 != null) goto L36;
            r9 = new MutableObjectIntMap(0, 1, null);
            r2.set(value$iv, r9);
            Unit r10 = Unit.INSTANCE;
        L36:
            recordRead(r31, token, value$iv, r9);
            return;
        }

        public final void notifyInvalidatedScopes() {
            MutableScatterSet<Object> r1 = this.invalidated;
            MutableScatterSet<Object> this_$iv = r1;
            Function1<Object, Unit> r3 = this.onChanged;
            Object[] elements$iv = this_$iv.elements;
            long[] m$iv$iv = this_$iv.metadata;
            int lastIndex$iv$iv = m$iv$iv.length - 2;
            int i$iv$iv = 0;
            if (0 > lastIndex$iv$iv) goto L20;
        L4:
            long slot$iv$iv = m$iv$iv[i$iv$iv];
            MutableScatterSet<Object> r16 = r1;
            if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L18;
            int r2 = 8;
            int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
            int j$iv$iv = 0;
        L7:
            if (j$iv$iv >= bitCount$iv$iv) goto L17;
            long value$iv$iv$iv = 255 & slot$iv$iv;
            if (value$iv$iv$iv >= 128) goto L11;
            boolean r18 = true;
        L12:
            if (r18 == false) goto L15;
            int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
            r3.invoke(elements$iv[index$iv$iv]);
        L15:
            slot$iv$iv = slot$iv$iv >> r2;
            j$iv$iv = j$iv$iv + 1;
            r2 = r2;
            goto L7
        L11:
            r18 = false;
            goto L12
        L17:
            if (bitCount$iv$iv == r2) goto L18;
        L22:
            r16.clear();
            return;
        L18:
            if (i$iv$iv == lastIndex$iv$iv) goto L22;
            i$iv$iv = i$iv$iv + 1;
            r1 = r16;
            goto L4
        L20:
            r16 = r1;
            goto L22
        }
    }

    static {
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(Function1<? super Function0<Unit>, Unit> r7) {
        this.onChangedExecutor = r7;
        this.pendingChanges = new AtomicReference(null);
        this.applyObserver = new SnapshotStateObserver$applyObserver$1(this);
        this.readObserver = new SnapshotStateObserver$readObserver$1(this);
        this.observedScopeMaps = new MutableVector(new ObservedScopeMap[16], 0);
        this.observedScopeMapsLock = new Object();
        this.currentMapThreadId = -1;
    }

    public static final /* synthetic */ void access$addChanges(SnapshotStateObserver $this, Set set) {
        $this.addChanges(set);
    }

    public static final /* synthetic */ boolean access$drainChanges(SnapshotStateObserver $this) {
        return $this.drainChanges();
    }

    public static final /* synthetic */ ObservedScopeMap access$getCurrentMap$p(SnapshotStateObserver $this) {
        return $this.currentMap;
    }

    public static final /* synthetic */ MutableVector access$getObservedScopeMaps$p(SnapshotStateObserver $this) {
        return $this.observedScopeMaps;
    }

    public static final /* synthetic */ Object access$getObservedScopeMapsLock$p(SnapshotStateObserver $this) {
        return $this.observedScopeMapsLock;
    }

    public static final /* synthetic */ boolean access$getSendingNotifications$p(SnapshotStateObserver $this) {
        return $this.sendingNotifications;
    }

    public static final /* synthetic */ boolean access$isPaused$p(SnapshotStateObserver $this) {
        return $this.isPaused;
    }

    public static final /* synthetic */ void access$sendNotifications(SnapshotStateObserver $this) {
        $this.sendNotifications();
    }

    public static final /* synthetic */ void access$setSendingNotifications$p(SnapshotStateObserver $this, boolean r1) {
        $this.sendingNotifications = r1;
    }

    private final boolean drainChanges() {
        Object lock$iv = this.observedScopeMapsLock;
        monitor-enter(lock$iv);
        boolean r4 = this.sendingNotifications;     // Catch: Throwable -> L32
        monitor-exit(lock$iv);
        if (r4 == false) goto L10;
        return false;
    L10:
        boolean hasValues = false;
    L11:
        Set<? extends Object> r3 = removeChanges();
        if (r3 == null) goto L13;
        Object lock$iv$iv = this.observedScopeMapsLock;
        monitor-enter(lock$iv$iv);
        MutableVector<ObservedScopeMap> r9 = this.observedScopeMaps;     // Catch: Throwable -> L29
        int i$iv$iv = 0;
        Object[] content$iv$iv = r9.content;     // Catch: Throwable -> L29
        int size$iv$iv = r9.getSize();     // Catch: Throwable -> L29
    L18:
        if (i$iv$iv >= size$iv$iv) goto L26;
        ObservedScopeMap scopeMap = (ObservedScopeMap) content$iv$iv[i$iv$iv];     // Catch: Throwable -> L29
        if (scopeMap.recordInvalidation(r3) == true) goto L24;
        if (hasValues == true) goto L24;
        boolean r16 = false;
    L25:
        hasValues = r16;
        i$iv$iv = i$iv$iv + 1;     // Catch: Throwable -> L29
    L24:
        r16 = true;
        goto L25
    L26:
        Unit r8 = Unit.INSTANCE;     // Catch: Throwable -> L29
        monitor-exit(lock$iv$iv);
    L29:
        th = move-exception;
        throw th;
    L13:
        return hasValues;
    L32:
        th = move-exception;
        throw th;
    }

    private final void sendNotifications() {
        this.onChangedExecutor.invoke(new AnonymousClass1(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addChanges(Set<? extends Object> r4) {
    L2:
        Object old = this.pendingChanges.get();
        if (old != null) goto L6;
        Collection r1 = r4;
    L12:
        if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.pendingChanges, old, r1) == false) goto L2;
        return;
    L6:
        if ((old instanceof Set) == false) goto L9;
        r1 = CollectionsKt.listOf(new Set[]{old, r4});
        goto L12
    L9:
        if ((old instanceof List) == false) goto L14;
        r1 = CollectionsKt.plus((Collection) old, CollectionsKt.listOf(r4));
        goto L12
    L14:
        report();
        throw new KotlinNothingValueException();
    }

    private final Set<Object> removeChanges() {
    L2:
        Object old = this.pendingChanges.get();
        Object r3 = null;
        if (old == null) goto L4;
        if ((old instanceof Set) == false) goto L9;
        Set<Object> r1 = (Set) old;
        Object r2 = null;
    L19:
        if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.pendingChanges, old, r2) == false) goto L2;
        return r1;
    L9:
        if ((old instanceof List) == false) goto L21;
        r1 = (Set) ((List) old).get(0);
        if (((List) old).size() != 2) goto L14;
        r3 = ((List) old).get(1);
    L17:
        r2 = r3;
        goto L19
    L14:
        if (((List) old).size() <= 2) goto L17;
        r3 = ((List) old).subList(1, ((List) old).size());
        goto L17
    L21:
        report();
        throw new KotlinNothingValueException();
    L4:
        return null;
    }

    private final Void report() {
        ComposerKt.composeRuntimeError("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    private final void forEachScopeMap(Function1<? super ObservedScopeMap, Unit> r11) {
        Object lock$iv = this.observedScopeMapsLock;
        monitor-enter(lock$iv);
        MutableVector<ObservedScopeMap> r4 = this.observedScopeMaps;     // Catch: Throwable -> L11
        int i$iv = 0;
        Object[] content$iv = r4.content;     // Catch: Throwable -> L11
        int size$iv = r4.getSize();     // Catch: Throwable -> L11
    L6:
        if (i$iv >= size$iv) goto L8;
        r11.invoke(content$iv[i$iv]);     // Catch: Throwable -> L11
        i$iv = i$iv + 1;     // Catch: Throwable -> L11
        goto L6
    L8:
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L11
        monitor-exit(lock$iv);
        return;
    L11:
        th = move-exception;
        throw th;
    }

    private final void removeScopeMapIf(Function1<? super ObservedScopeMap, Boolean> r13) {
        Object lock$iv = this.observedScopeMapsLock;
        monitor-enter(lock$iv);
        MutableVector<ObservedScopeMap> r4 = this.observedScopeMaps;     // Catch: Throwable -> L16
        int gap$iv = 0;
        int size$iv = r4.getSize();     // Catch: Throwable -> L16
        int i$iv = 0;
    L6:
        if (i$iv >= size$iv) goto L13;
        if (r13.invoke(r4.content[i$iv]).booleanValue() == false) goto L10;
        gap$iv = gap$iv + 1;     // Catch: Throwable -> L16
    L12:
        i$iv = i$iv + 1;     // Catch: Throwable -> L16
        goto L6
    L10:
        if (gap$iv <= 0) goto L12;
        r4.content[i$iv - gap$iv] = r4.content[i$iv];     // Catch: Throwable -> L16
        goto L12
    L13:
        ArraysKt.fill(r4.content, null, size$iv - gap$iv, size$iv);     // Catch: Throwable -> L16
        r4.setSize(size$iv - gap$iv);     // Catch: Throwable -> L16
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L16
        monitor-exit(lock$iv);
        return;
    L16:
        th = move-exception;
        throw th;
    }

    public final <T> void observeReads(T r13, Function1<? super T, Unit> r14, Function0<Unit> r15) {
        Object lock$iv = this.observedScopeMapsLock;
        monitor-enter(lock$iv);
        ObservedScopeMap scopeMap = ensureMap(r14);     // Catch: Throwable -> L24
        monitor-exit(lock$iv);
        boolean oldPaused = this.isPaused;
        ObservedScopeMap oldMap = this.currentMap;
        long oldThreadId = this.currentMapThreadId;
        if (oldThreadId != (-1)) goto L10;
    L29:
        this.isPaused = false;     // Catch: Throwable -> L21
        this.currentMap = scopeMap;     // Catch: Throwable -> L21
        this.currentMapThreadId = Thread_jvmKt.currentThreadId();     // Catch: Throwable -> L21
        scopeMap.observe(r13, this.readObserver, r15);     // Catch: Throwable -> L21
        this.currentMap = oldMap;
        this.isPaused = oldPaused;
        this.currentMapThreadId = oldThreadId;
        return;
    L21:
        th = move-exception;
        this.currentMap = oldMap;
        this.isPaused = oldPaused;
        this.currentMapThreadId = oldThreadId;
        throw th;
    L10:
        if (oldThreadId != Thread_jvmKt.currentThreadId()) goto L12;
        boolean value$iv = true;
    L14:
        if (value$iv == true) goto L29;
        PreconditionsKt.throwIllegalArgumentException("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + oldThreadId + "), currentThread={id=" + Thread_jvmKt.currentThreadId() + ", name=" + Thread_jvmKt.currentThreadName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        goto L29
    L12:
        value$iv = false;
    L24:
        th = move-exception;
        throw th;
    }

    @Deprecated(message = "Replace with Snapshot.withoutReadObservation()", replaceWith = @ReplaceWith(expression = "Snapshot.withoutReadObservation(block)", imports = {"androidx.compose.runtime.snapshots.Snapshot"}))
    public final void withNoObservations(Function0<Unit> r3) {
        boolean oldPaused = this.isPaused;
        this.isPaused = true;
        r3.invoke();     // Catch: Throwable -> L6
        this.isPaused = oldPaused;
        return;
    L6:
        th = move-exception;
        this.isPaused = oldPaused;
        throw th;
    }

    public final void clear(Object scope) {
        Object lock$iv$iv = this.observedScopeMapsLock;
        monitor-enter(lock$iv$iv);
        MutableVector<ObservedScopeMap> r5 = this.observedScopeMaps;     // Catch: Throwable -> L16
        int gap$iv$iv = 0;
        int size$iv$iv = r5.getSize();     // Catch: Throwable -> L16
        int i$iv$iv = 0;
    L6:
        if (i$iv$iv >= size$iv$iv) goto L13;
        ObservedScopeMap it = r5.content[i$iv$iv];     // Catch: Throwable -> L16
        it.clearScopeObservations(scope);     // Catch: Throwable -> L16
        if (it.hasScopeObservations() == true) goto L10;
        gap$iv$iv = gap$iv$iv + 1;     // Catch: Throwable -> L16
    L12:
        i$iv$iv = i$iv$iv + 1;     // Catch: Throwable -> L16
        goto L6
    L10:
        if (gap$iv$iv <= 0) goto L12;
        r5.content[i$iv$iv - gap$iv$iv] = r5.content[i$iv$iv];     // Catch: Throwable -> L16
        goto L12
    L13:
        ArraysKt.fill(r5.content, null, size$iv$iv - gap$iv$iv, size$iv$iv);     // Catch: Throwable -> L16
        r5.setSize(size$iv$iv - gap$iv$iv);     // Catch: Throwable -> L16
        Unit r4 = Unit.INSTANCE;     // Catch: Throwable -> L16
        monitor-exit(lock$iv$iv);
        return;
    L16:
        th = move-exception;
        throw th;
    }

    public final void clearIf(Function1<Object, Boolean> r14) {
        Object lock$iv$iv = this.observedScopeMapsLock;
        monitor-enter(lock$iv$iv);
        MutableVector<ObservedScopeMap> r5 = this.observedScopeMaps;     // Catch: Throwable -> L16
        int gap$iv$iv = 0;
        int size$iv$iv = r5.getSize();     // Catch: Throwable -> L16
        int i$iv$iv = 0;
    L6:
        if (i$iv$iv >= size$iv$iv) goto L13;
        ObservedScopeMap scopeMap = r5.content[i$iv$iv];     // Catch: Throwable -> L16
        scopeMap.removeScopeIf(r14);     // Catch: Throwable -> L16
        if (scopeMap.hasScopeObservations() == true) goto L10;
        gap$iv$iv = gap$iv$iv + 1;     // Catch: Throwable -> L16
    L12:
        i$iv$iv = i$iv$iv + 1;     // Catch: Throwable -> L16
        goto L6
    L10:
        if (gap$iv$iv <= 0) goto L12;
        r5.content[i$iv$iv - gap$iv$iv] = r5.content[i$iv$iv];     // Catch: Throwable -> L16
        goto L12
    L13:
        ArraysKt.fill(r5.content, null, size$iv$iv - gap$iv$iv, size$iv$iv);     // Catch: Throwable -> L16
        r5.setSize(size$iv$iv - gap$iv$iv);     // Catch: Throwable -> L16
        Unit r4 = Unit.INSTANCE;     // Catch: Throwable -> L16
        monitor-exit(lock$iv$iv);
        return;
    L16:
        th = move-exception;
        throw th;
    }

    public final void start() {
        this.applyUnsubscribe = Snapshot.Companion.registerApplyObserver(this.applyObserver);
    }

    public final void stop() {
        ObserverHandle r0 = this.applyUnsubscribe;
        if (r0 == null) goto L6;
        r0.dispose();
        return;
    }

    public final void notifyChanges(Set<? extends Object> r2, Snapshot snapshot) {
        this.applyObserver.invoke(r2, snapshot);
    }

    public final void clear() {
        Object lock$iv$iv = this.observedScopeMapsLock;
        monitor-enter(lock$iv$iv);
        MutableVector<ObservedScopeMap> r5 = this.observedScopeMaps;     // Catch: Throwable -> L11
        int i$iv$iv = 0;
        Object[] content$iv$iv = r5.content;     // Catch: Throwable -> L11
        int size$iv$iv = r5.getSize();     // Catch: Throwable -> L11
    L6:
        if (i$iv$iv >= size$iv$iv) goto L8;
        ObservedScopeMap scopeMap = (ObservedScopeMap) content$iv$iv[i$iv$iv];     // Catch: Throwable -> L11
        scopeMap.clear();     // Catch: Throwable -> L11
        i$iv$iv = i$iv$iv + 1;     // Catch: Throwable -> L11
        goto L6
    L8:
        Unit r4 = Unit.INSTANCE;     // Catch: Throwable -> L11
        monitor-exit(lock$iv$iv);
        return;
    L11:
        th = move-exception;
        throw th;
    }

    private final <T> ObservedScopeMap ensureMap(Function1<? super T, Unit> r11) {
        MutableVector<ObservedScopeMap> r0 = this.observedScopeMaps;
        ObservedScopeMap[] content$iv = r0.content;
        int size$iv = r0.getSize();
        int i$iv = 0;
    L4:
        if (i$iv >= size$iv) goto L12;
        ObservedScopeMap item$iv = content$iv[i$iv];
        if (item$iv.getOnChanged() != r11) goto L8;
        boolean r9 = true;
    L9:
        if (r9 == true) goto L13;
        i$iv = i$iv + 1;
    L13:
        ObservedScopeMap scopeMap = item$iv;
        if (scopeMap != null) goto L17;
        Intrinsics.checkNotNull(r11, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        ObservedScopeMap map = new ObservedScopeMap((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r11, 1));
        this.observedScopeMaps.add(map);
        return map;
    L17:
        return scopeMap;
    L8:
        r9 = false;
        goto L9
    L12:
        item$iv = null;
        goto L13
    }
}
