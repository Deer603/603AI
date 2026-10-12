package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CompositionLocalMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a3\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\u0007\u001a \u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH\u0000\u001a=\u0010\r\u001a\u00020\u0001*\u00020\u00012.\u0010\u000e\u001a*\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00120\u0010\u0012\u0004\u0012\u00020\u00130\u000fH\u0080\b\u001a%\u0010\u0014\u001a\u0002H\n\"\u0004\b\u0000\u0010\n*\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH\u0000¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"updateCompositionMap", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "values", "", "Landroidx/compose/runtime/ProvidedValue;", "parentScope", "previous", "([Landroidx/compose/runtime/ProvidedValue;Landroidx/compose/runtime/PersistentCompositionLocalMap;Landroidx/compose/runtime/PersistentCompositionLocalMap;)Landroidx/compose/runtime/PersistentCompositionLocalMap;", "contains", "", "T", "key", "Landroidx/compose/runtime/CompositionLocal;", "mutate", "mutator", "Lkotlin/Function1;", "", "", "Landroidx/compose/runtime/ValueHolder;", "", "read", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CompositionLocalMapKt {
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    public static final PersistentCompositionLocalMap mutate(PersistentCompositionLocalMap $this$mutate, Function1<? super Map<CompositionLocal<Object>, ValueHolder<Object>>, Unit> r3) {
        PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> r1 = $this$mutate.builder();
        r3.invoke(r1);
        return r1.build();
    }

    public static final <T> boolean contains(PersistentCompositionLocalMap $this$contains, CompositionLocal<T> r2) {
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return $this$contains.containsKey(r2);
    }

    public static final <T> T read(PersistentCompositionLocalMap r2, CompositionLocal<T> r3) {
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        ValueHolder<Object> r0 = r2.get(r3);
        if (r0 != null) goto L6;
        r0 = r3.getDefaultValueHolder$runtime_release();
    L6:
        return (T) r0.readValue(r2);
    }

    public static /* synthetic */ PersistentCompositionLocalMap updateCompositionMap$default(ProvidedValue[] r0, PersistentCompositionLocalMap r1, PersistentCompositionLocalHashMap r2, int r3, Object r4) {
        if ((r3 & 4) == 0) goto L6;
        r2 = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();
    L6:
        return updateCompositionMap(r0, r1, r2);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    public static final PersistentCompositionLocalMap updateCompositionMap(ProvidedValue<?>[] r9, PersistentCompositionLocalMap parentScope, PersistentCompositionLocalMap previous) {
        PersistentCompositionLocalMap.Builder builder = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf().builder();
        PersistentCompositionLocalMap map = previous;
        int index = 0;
        int r3 = r9.length;
    L3:
        if (index >= r3) goto L11;
        ProvidedValue<?> r4 = r9[index];
        CompositionLocal<?> r5 = r4.getCompositionLocal();
        Intrinsics.checkNotNull(r5, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
        ProvidableCompositionLocal local = (ProvidableCompositionLocal) r5;
        if (r4.getCanOverride() == false) goto L7;
    L8:
        ValueHolder previousState = (ValueHolder) map.get(local);
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
        ValueHolder newState = local.updatedStateOf$runtime_release(r4, previousState);
        builder.put(local, newState);
    L9:
        index = index + 1;
        goto L3
    L7:
        if (contains(parentScope, local) == true) goto L9;
    L11:
        return builder.build();
    }
}
