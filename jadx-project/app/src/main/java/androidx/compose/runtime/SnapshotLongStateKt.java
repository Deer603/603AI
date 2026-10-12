package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: SnapshotLongState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"androidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt"}, k = 4, mv = {1, 9, 0}, xi = 48)
public final class SnapshotLongStateKt {
    public static final long getValue(LongState $this$getValue, Object thisObj, KProperty<?> r4) {
        return SnapshotLongStateKt__SnapshotLongStateKt.getValue($this$getValue, thisObj, r4);
    }

    public static final MutableLongState mutableLongStateOf(long value) {
        return SnapshotLongStateKt__SnapshotLongStateKt.mutableLongStateOf(value);
    }

    public static final void setValue(MutableLongState $this$setValue, Object thisObj, KProperty<?> r2, long value) {
        SnapshotLongStateKt__SnapshotLongStateKt.setValue($this$setValue, thisObj, r2, value);
    }
}
