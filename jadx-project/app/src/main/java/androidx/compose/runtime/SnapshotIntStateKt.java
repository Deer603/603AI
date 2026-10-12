package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: SnapshotIntState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"androidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt"}, k = 4, mv = {1, 9, 0}, xi = 48)
public final class SnapshotIntStateKt {
    public static final int getValue(IntState $this$getValue, Object thisObj, KProperty<?> r3) {
        return SnapshotIntStateKt__SnapshotIntStateKt.getValue($this$getValue, thisObj, r3);
    }

    public static final MutableIntState mutableIntStateOf(int value) {
        return SnapshotIntStateKt__SnapshotIntStateKt.mutableIntStateOf(value);
    }

    public static final void setValue(MutableIntState $this$setValue, Object thisObj, KProperty<?> r2, int value) {
        SnapshotIntStateKt__SnapshotIntStateKt.setValue($this$setValue, thisObj, r2, value);
    }
}
