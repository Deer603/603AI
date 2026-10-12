package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: SnapshotState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u001c\n\u0000\u001a\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u0007\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0004\"\u0002H\u0002H\u0007¢\u0006\u0002\u0010\u0005\u001a \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t0\u0007\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\tH\u0007\u001aQ\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t0\u0007\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t2*\u0010\n\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t0\u000b0\u0004\"\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t0\u000bH\u0007¢\u0006\u0002\u0010\f\u001a1\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001a\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0014\"\u0004\b\u0000\u0010\u0002H\u0007\u001a-\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0014\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0004\"\u0002H\u0002H\u0007¢\u0006\u0002\u0010\u0015\u001a!\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0017\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0018\u001a\u0002H\u0002H\u0007¢\u0006\u0002\u0010\u0019\u001a4\u0010\u001a\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0086\n¢\u0006\u0002\u0010\u001f\u001a<\u0010 \u001a\u00020!\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001e2\u0006\u0010\u000f\u001a\u0002H\u0002H\u0086\n¢\u0006\u0002\u0010\"\u001a\u001c\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020$\u001a4\u0010%\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t0\u0007\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t0\u000b0&¨\u0006'"}, d2 = {"mutableStateListOf", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "elements", "", "([Ljava/lang/Object;)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "mutableStateMapOf", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "K", "V", "pairs", "Lkotlin/Pair;", "([Lkotlin/Pair;)Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "mutableStateOf", "Landroidx/compose/runtime/MutableState;", "value", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)Landroidx/compose/runtime/MutableState;", "mutableStateSetOf", "Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "([Ljava/lang/Object;)Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "rememberUpdatedState", "Landroidx/compose/runtime/State;", "newValue", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "getValue", "thisObj", "", "property", "Lkotlin/reflect/KProperty;", "(Landroidx/compose/runtime/State;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "(Landroidx/compose/runtime/MutableState;Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "toMutableStateList", "", "toMutableStateMap", "", "runtime_release"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
final /* synthetic */ class SnapshotStateKt__SnapshotStateKt {
    public static /* synthetic */ MutableState mutableStateOf$default(Object r0, SnapshotMutationPolicy r1, int r2, Object r3) {
        if ((r2 & 2) == 0) goto L6;
        r1 = SnapshotStateKt.structuralEqualityPolicy();
    L6:
        return SnapshotStateKt.mutableStateOf(r0, r1);
    }

    public static final <T> MutableState<T> mutableStateOf(T r1, SnapshotMutationPolicy<T> r2) {
        return SnapshotState_androidKt.createSnapshotMutableState(r1, r2);
    }

    public static final <T> T getValue(State<? extends T> r2, Object thisObj, KProperty<?> r4) {
        return r2.getValue();
    }

    public static final <T> void setValue(MutableState<T> r1, Object thisObj, KProperty<?> r3, T r4) {
        r1.setValue(r4);
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return new SnapshotStateList();
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf(T... r4) {
        SnapshotStateList<T> r0 = new SnapshotStateList();
        r0.addAll(ArraysKt.toList(r4));
        return r0;
    }

    public static final <T> SnapshotStateList<T> toMutableStateList(Collection<? extends T> r3) {
        SnapshotStateList<T> r0 = new SnapshotStateList();
        r0.addAll(r3);
        return r0;
    }

    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return new SnapshotStateMap();
    }

    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf(Pair<? extends K, ? extends V>... r4) {
        SnapshotStateMap<K, V> r0 = new SnapshotStateMap();
        r0.putAll(MapsKt.toMap(r4));
        return r0;
    }

    public static final <K, V> SnapshotStateMap<K, V> toMutableStateMap(Iterable<? extends Pair<? extends K, ? extends V>> r4) {
        SnapshotStateMap<K, V> r0 = new SnapshotStateMap();
        r0.putAll(MapsKt.toMap(r4));
        return r0;
    }

    public static final <T> SnapshotStateSet<T> mutableStateSetOf() {
        return new SnapshotStateSet();
    }

    public static final <T> SnapshotStateSet<T> mutableStateSetOf(T... r4) {
        SnapshotStateSet<T> r0 = new SnapshotStateSet();
        r0.addAll(ArraysKt.toSet(r4));
        return r0;
    }

    public static final <T> State<T> rememberUpdatedState(T r8, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1058319986, "C(rememberUpdatedState)*329@11488L37:SnapshotState.kt#9igjgp");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1058319986, $changed, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:329)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 141240191, "CC(remember):SnapshotState.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L9;
        Object value$iv = SnapshotStateKt.mutableStateOf$default(r8, null, 2, null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L9:
        MutableState $this$rememberUpdatedState_u24lambda_u246 = (MutableState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        $this$rememberUpdatedState_u24lambda_u246.setValue(r8);
        if (ComposerKt.isTraceInProgress() == false) goto L12;
        ComposerKt.traceEventEnd();
    L12:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return $this$rememberUpdatedState_u24lambda_u246;
    }
}
