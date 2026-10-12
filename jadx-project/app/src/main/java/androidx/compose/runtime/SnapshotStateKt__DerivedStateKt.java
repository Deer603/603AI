package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: DerivedState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000\u001a\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0007\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0007\u001a0\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0082\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0014\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0016\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0080\b\u001a*\u0010\u0017\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\b0\u0018H\u0082\b¢\u0006\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"calculationBlockNestedLevel", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "Landroidx/compose/runtime/internal/IntRef;", "derivedStateObservers", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/DerivedStateObserver;", "derivedStateOf", "Landroidx/compose/runtime/State;", "T", "calculation", "Lkotlin/Function0;", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "notifyObservers", "R", "derivedState", "Landroidx/compose/runtime/DerivedState;", "block", "notifyObservers$SnapshotStateKt__DerivedStateKt", "(Landroidx/compose/runtime/DerivedState;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "observeDerivedStateRecalculations", "", "observer", "withCalculationNestedLevel", "Lkotlin/Function1;", "withCalculationNestedLevel$SnapshotStateKt__DerivedStateKt", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "runtime_release"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
final /* synthetic */ class SnapshotStateKt__DerivedStateKt {
    private static final SnapshotThreadLocal<IntRef> calculationBlockNestedLevel = null;
    private static final SnapshotThreadLocal<MutableVector<DerivedStateObserver>> derivedStateObservers = null;

    public static final /* synthetic */ SnapshotThreadLocal access$getCalculationBlockNestedLevel$p() {
        return calculationBlockNestedLevel;
    }

    static {
        calculationBlockNestedLevel = new SnapshotThreadLocal();
        derivedStateObservers = new SnapshotThreadLocal();
    }

    private static final <T> T withCalculationNestedLevel$SnapshotStateKt__DerivedStateKt(Function1<? super IntRef, ? extends T> r5) {
        IntRef it = (IntRef) access$getCalculationBlockNestedLevel$p().get();
        if (it != null) goto L6;
        it = new IntRef(0);
        access$getCalculationBlockNestedLevel$p().set(it);
    L6:
        return r5.invoke(it);
    }

    public static final <T> State<T> derivedStateOf(Function0<? extends T> r2) {
        return new DerivedSnapshotState(r2, null);
    }

    public static final <T> State<T> derivedStateOf(SnapshotMutationPolicy<T> r1, Function0<? extends T> r2) {
        return new DerivedSnapshotState(r2, r1);
    }

    public static final MutableVector<DerivedStateObserver> derivedStateObservers() {
        MutableVector<DerivedStateObserver> r0 = derivedStateObservers.get();
        if (r0 != null) goto L6;
        MutableVector<DerivedStateObserver> r2 = new MutableVector(new DerivedStateObserver[0], 0);
        derivedStateObservers.set(r2);
        return r2;
    L6:
        return r0;
    }

    private static final <R> R notifyObservers$SnapshotStateKt__DerivedStateKt(DerivedState<?> r10, Function0<? extends R> r11) {
        MutableVector<DerivedStateObserver> r1 = SnapshotStateKt.derivedStateObservers();
        int i$iv = 0;
        Object[] content$iv = r1.content;
        int size$iv = r1.getSize();
    L3:
        if (i$iv >= size$iv) goto L18;
        DerivedStateObserver it = (DerivedStateObserver) content$iv[i$iv];
        it.start(r10);
        i$iv = i$iv + 1;
        goto L3
    L18:
        R r2 = r11.invoke();     // Catch: Throwable -> L12
        int i$iv2 = 0;
        Object[] content$iv2 = r1.content;
        int size$iv2 = r1.getSize();
    L8:
        if (i$iv2 >= size$iv2) goto L11;
        DerivedStateObserver it2 = (DerivedStateObserver) content$iv2[i$iv2];
        it2.done(r10);
        i$iv2 = i$iv2 + 1;
        goto L8
    L11:
        return r2;
    L12:
        th = move-exception;
        int i$iv3 = 0;
        Object[] content$iv3 = r1.content;
        int size$iv3 = r1.getSize();
    L14:
        if (i$iv3 >= size$iv3) goto L17;
        DerivedStateObserver it3 = (DerivedStateObserver) content$iv3[i$iv3];
        it3.done(r10);
        i$iv3 = i$iv3 + 1;
        goto L14
    L17:
        throw th;
    }

    public static final <R> void observeDerivedStateRecalculations(DerivedStateObserver observer, Function0<? extends R> r7) {
        MutableVector<DerivedStateObserver> r1 = SnapshotStateKt.derivedStateObservers();
        r1.add(observer);     // Catch: Throwable -> L6
        r7.invoke();     // Catch: Throwable -> L6
        r1.removeAt(r1.getSize() - 1);
        return;
    L6:
        th = move-exception;
        r1.removeAt(r1.getSize() - 1);
        throw th;
    }
}
