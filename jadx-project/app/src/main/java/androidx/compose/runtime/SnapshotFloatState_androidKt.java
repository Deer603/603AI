package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: compiled from: SnapshotFloatState.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"createSnapshotMutableFloatState", "Landroidx/compose/runtime/MutableFloatState;", "value", "", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SnapshotFloatState_androidKt {
    public static final MutableFloatState createSnapshotMutableFloatState(float value) {
        return new ParcelableSnapshotMutableFloatState(value);
    }
}
