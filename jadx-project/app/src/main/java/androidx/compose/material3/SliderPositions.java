package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "Not necessary with the introduction of Slider state")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016R7\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0010\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00068F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/SliderPositions;", "", "initialActiveRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "initialTickFractions", "", "(Lkotlin/ranges/ClosedFloatingPointRange;[F)V", "<set-?>", "activeRange", "getActiveRange", "()Lkotlin/ranges/ClosedFloatingPointRange;", "setActiveRange$material3_release", "(Lkotlin/ranges/ClosedFloatingPointRange;)V", "activeRange$delegate", "Landroidx/compose/runtime/MutableState;", "tickFractions", "getTickFractions", "()[F", "setTickFractions$material3_release", "([F)V", "tickFractions$delegate", "equals", "", "other", "hashCode", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SliderPositions {
    public static final int $stable = 0;
    private final MutableState activeRange$delegate;
    private final MutableState tickFractions$delegate;

    static {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SliderPositions() {
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    public SliderPositions(ClosedFloatingPointRange<Float> r4, float[] initialTickFractions) {
        this.activeRange$delegate = SnapshotStateKt.mutableStateOf$default(r4, null, 2, null);
        this.tickFractions$delegate = SnapshotStateKt.mutableStateOf$default(initialTickFractions, null, 2, null);
    }

    public /* synthetic */ SliderPositions(ClosedFloatingPointRange r1, float[] r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = RangesKt.rangeTo(0.0f, 1.0f);
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = new float[0];
    L8:
        this(r1, r2);
    }

    public final ClosedFloatingPointRange<Float> getActiveRange() {
        State $this$getValue$iv = this.activeRange$delegate;
        return (ClosedFloatingPointRange) $this$getValue$iv.getValue();
    }

    public final void setActiveRange$material3_release(ClosedFloatingPointRange<Float> r4) {
        MutableState $this$setValue$iv = this.activeRange$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final float[] getTickFractions() {
        State $this$getValue$iv = this.tickFractions$delegate;
        return (float[]) $this$getValue$iv.getValue();
    }

    public final void setTickFractions$material3_release(float[] r4) {
        MutableState $this$setValue$iv = this.tickFractions$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof SliderPositions) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(getActiveRange(), ((SliderPositions) other).getActiveRange()) == true) goto L12;
        return false;
    L12:
        if (Arrays.equals(getTickFractions(), ((SliderPositions) other).getTickFractions()) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int result = getActiveRange().hashCode();
        return (result * 31) + Arrays.hashCode(getTickFractions());
    }
}
