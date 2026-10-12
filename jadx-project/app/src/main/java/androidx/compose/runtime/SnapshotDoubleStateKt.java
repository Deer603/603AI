package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: SnapshotDoubleState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"androidx/compose/runtime/SnapshotDoubleStateKt__SnapshotDoubleStateKt"}, k = 4, mv = {1, 9, 0}, xi = 48)
public final class SnapshotDoubleStateKt {
    public static final double getValue(DoubleState $this$getValue, Object thisObj, KProperty<?> r4) {
        return SnapshotDoubleStateKt__SnapshotDoubleStateKt.getValue($this$getValue, thisObj, r4);
    }

    public static final MutableDoubleState mutableDoubleStateOf(double value) {
        return SnapshotDoubleStateKt__SnapshotDoubleStateKt.mutableDoubleStateOf(value);
    }

    public static final void setValue(MutableDoubleState $this$setValue, Object thisObj, KProperty<?> r2, double value) {
        SnapshotDoubleStateKt__SnapshotDoubleStateKt.setValue($this$setValue, thisObj, r2, value);
    }
}
