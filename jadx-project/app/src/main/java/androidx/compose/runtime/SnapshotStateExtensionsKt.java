package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: compiled from: SnapshotStateExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u001a\u0012\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0007\u001a\u0012\u0010\u0007\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\t0\u0002H\u0007\u001a\u0012\u0010\n\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\f0\u0002H\u0007¨\u0006\r"}, d2 = {"asDoubleState", "Landroidx/compose/runtime/DoubleState;", "Landroidx/compose/runtime/State;", "", "asFloatState", "Landroidx/compose/runtime/FloatState;", "", "asIntState", "Landroidx/compose/runtime/IntState;", "", "asLongState", "Landroidx/compose/runtime/LongState;", "", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SnapshotStateExtensionsKt {
    public static final IntState asIntState(State<Integer> r1) {
        if ((r1 instanceof IntState) == false) goto L6;
        return (IntState) r1;
    L6:
        return new UnboxedIntState(r1);
    }

    public static final LongState asLongState(State<Long> r1) {
        if ((r1 instanceof LongState) == false) goto L6;
        return (LongState) r1;
    L6:
        return new UnboxedLongState(r1);
    }

    public static final FloatState asFloatState(State<Float> r1) {
        if ((r1 instanceof FloatState) == false) goto L6;
        return (FloatState) r1;
    L6:
        return new UnboxedFloatState(r1);
    }

    public static final DoubleState asDoubleState(State<Double> r1) {
        if ((r1 instanceof DoubleState) == false) goto L6;
        return (DoubleState) r1;
    L6:
        return new UnboxedDoubleState(r1);
    }
}
