package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: MouseWheelScrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/gestures/MouseWheelVelocityTracker;", "", "()V", "xVelocityTracker", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "yVelocityTracker", "addDelta", "", "timeMillis", "", "delta", "Landroidx/compose/ui/geometry/Offset;", "addDelta-Uv8p0NA", "(JJ)V", "calculateVelocity", "Landroidx/compose/ui/unit/Velocity;", "calculateVelocity-9UxMQ8M", "()J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class MouseWheelVelocityTracker {
    private final VelocityTracker1D xVelocityTracker;
    private final VelocityTracker1D yVelocityTracker;

    public MouseWheelVelocityTracker() {
        this.xVelocityTracker = new VelocityTracker1D(true);
        this.yVelocityTracker = new VelocityTracker1D(true);
    }

    /* JADX INFO: renamed from: addDelta-Uv8p0NA, reason: not valid java name */
    public final void m466addDeltaUv8p0NA(long timeMillis, long delta) {
        int bits$iv$iv$iv = (int) (delta >> 32);
        this.xVelocityTracker.addDataPoint(timeMillis, Float.intBitsToFloat(bits$iv$iv$iv));
        int bits$iv$iv$iv2 = (int) (4294967295L & delta);
        this.yVelocityTracker.addDataPoint(timeMillis, Float.intBitsToFloat(bits$iv$iv$iv2));
    }

    /* JADX INFO: renamed from: calculateVelocity-9UxMQ8M, reason: not valid java name */
    public final long m467calculateVelocity9UxMQ8M() {
        float velocityX = this.xVelocityTracker.calculateVelocity(Float.MAX_VALUE);
        float velocityY = this.yVelocityTracker.calculateVelocity(Float.MAX_VALUE);
        return VelocityKt.Velocity(velocityX, velocityY);
    }
}
