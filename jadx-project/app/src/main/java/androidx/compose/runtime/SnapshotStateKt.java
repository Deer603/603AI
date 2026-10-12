package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"androidx/compose/runtime/SnapshotStateKt__DerivedStateKt", "androidx/compose/runtime/SnapshotStateKt__ProduceStateKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotMutationPolicyKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotStateKt"}, k = 4, mv = {1, 9, 0}, xi = 48)
public final class SnapshotStateKt {
    public static final <T extends R, R> State<R> collectAsState(Flow<? extends T> r0, R r1, CoroutineContext context, Composer $composer, int $changed, int r5) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(r0, r1, context, $composer, $changed, r5);
    }

    public static final <T> State<T> collectAsState(StateFlow<? extends T> r0, CoroutineContext context, Composer $composer, int $changed, int r4) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(r0, context, $composer, $changed, r4);
    }

    public static final MutableVector<DerivedStateObserver> derivedStateObservers() {
        return SnapshotStateKt__DerivedStateKt.derivedStateObservers();
    }

    public static final <T> State<T> derivedStateOf(SnapshotMutationPolicy<T> r1, Function0<? extends T> r2) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(r1, r2);
    }

    public static final <T> State<T> derivedStateOf(Function0<? extends T> r1) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(r1);
    }

    public static final <T> T getValue(State<? extends T> r1, Object r2, KProperty<?> r3) {
        return (T) SnapshotStateKt__SnapshotStateKt.getValue(r1, r2, r3);
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf();
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf(T... r1) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf(r1);
    }

    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf();
    }

    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf(Pair<? extends K, ? extends V>... r1) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf(r1);
    }

    public static final <T> MutableState<T> mutableStateOf(T r1, SnapshotMutationPolicy<T> r2) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf(r1, r2);
    }

    public static /* synthetic */ MutableState mutableStateOf$default(Object r0, SnapshotMutationPolicy r1, int r2, Object r3) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r0, r1, r2, r3);
    }

    public static final <T> SnapshotStateSet<T> mutableStateSetOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateSetOf();
    }

    public static final <T> SnapshotStateSet<T> mutableStateSetOf(T... r1) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateSetOf(r1);
    }

    public static final <T> SnapshotMutationPolicy<T> neverEqualPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy();
    }

    public static final <R> void observeDerivedStateRecalculations(DerivedStateObserver observer, Function0<? extends R> r1) {
        SnapshotStateKt__DerivedStateKt.observeDerivedStateRecalculations(observer, r1);
    }

    public static final <T> State<T> produceState(T r1, Object key1, Object key2, Object key3, Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> r5, Composer $composer, int $changed) {
        return SnapshotStateKt__ProduceStateKt.produceState(r1, key1, key2, key3, r5, $composer, $changed);
    }

    public static final <T> State<T> produceState(T r1, Object key1, Object key2, Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> r4, Composer $composer, int $changed) {
        return SnapshotStateKt__ProduceStateKt.produceState(r1, key1, key2, r4, $composer, $changed);
    }

    public static final <T> State<T> produceState(T r1, Object key1, Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> r3, Composer $composer, int $changed) {
        return SnapshotStateKt__ProduceStateKt.produceState(r1, key1, r3, $composer, $changed);
    }

    public static final <T> State<T> produceState(T r1, Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> r2, Composer $composer, int $changed) {
        return SnapshotStateKt__ProduceStateKt.produceState(r1, r2, $composer, $changed);
    }

    public static final <T> State<T> produceState(T r1, Object[] keys, Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> r3, Composer $composer, int $changed) {
        return SnapshotStateKt__ProduceStateKt.produceState(r1, keys, r3, $composer, $changed);
    }

    public static final <T> SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy();
    }

    public static final <T> State<T> rememberUpdatedState(T r1, Composer $composer, int $changed) {
        return SnapshotStateKt__SnapshotStateKt.rememberUpdatedState(r1, $composer, $changed);
    }

    public static final <T> void setValue(MutableState<T> r0, Object thisObj, KProperty<?> r2, T r3) {
        SnapshotStateKt__SnapshotStateKt.setValue(r0, thisObj, r2, r3);
    }

    public static final <T> Flow<T> snapshotFlow(Function0<? extends T> r1) {
        return SnapshotStateKt__SnapshotFlowKt.snapshotFlow(r1);
    }

    public static final <T> SnapshotMutationPolicy<T> structuralEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy();
    }

    public static final <T> SnapshotStateList<T> toMutableStateList(Collection<? extends T> r1) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateList(r1);
    }

    public static final <K, V> SnapshotStateMap<K, V> toMutableStateMap(Iterable<? extends Pair<? extends K, ? extends V>> r1) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateMap(r1);
    }
}
