package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: VelocityTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001aø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0006J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020\u0014R\"\u0010\u0003\u001a\u00020\u0004X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "", "()V", "currentPointerPositionAccumulator", "Landroidx/compose/ui/geometry/Offset;", "getCurrentPointerPositionAccumulator-F1C5BW0$ui_release", "()J", "setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release", "(J)V", "J", "lastMoveEventTimeStamp", "", "getLastMoveEventTimeStamp$ui_release", "setLastMoveEventTimeStamp$ui_release", "strategy", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "xVelocityTracker", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "yVelocityTracker", "addPosition", "", "timeMillis", "position", "addPosition-Uv8p0NA", "(JJ)V", "calculateVelocity", "Landroidx/compose/ui/unit/Velocity;", "calculateVelocity-9UxMQ8M", "maximumVelocity", "calculateVelocity-AH228Gc", "(J)J", "resetTracking", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VelocityTracker {
    public static final int $stable = 0;
    private long currentPointerPositionAccumulator;
    private long lastMoveEventTimeStamp;
    private final VelocityTracker1D.Strategy strategy;
    private final VelocityTracker1D xVelocityTracker;
    private final VelocityTracker1D yVelocityTracker;

    static {
        $stable = 8;
    }

    public VelocityTracker() {
        if (VelocityTrackerKt.getVelocityTrackerStrategyUseImpulse() == false) goto L5;
        VelocityTracker1D.Strategy r0 = VelocityTracker1D.Strategy.Impulse;
    L6:
        this.strategy = r0;
        this.xVelocityTracker = new VelocityTracker1D(false, this.strategy, 1, null);
        this.yVelocityTracker = new VelocityTracker1D(false, this.strategy, 1, null);
        this.currentPointerPositionAccumulator = Offset.Companion.m4141getZeroF1C5BW0();
        return;
    L5:
        r0 = VelocityTracker1D.Strategy.Lsq2;
        goto L6
    }

    /* JADX INFO: renamed from: getCurrentPointerPositionAccumulator-F1C5BW0$ui_release, reason: not valid java name */
    public final long m5688getCurrentPointerPositionAccumulatorF1C5BW0$ui_release() {
        return this.currentPointerPositionAccumulator;
    }

    /* JADX INFO: renamed from: setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release, reason: not valid java name */
    public final void m5689setCurrentPointerPositionAccumulatork4lQ0M$ui_release(long r1) {
        this.currentPointerPositionAccumulator = r1;
    }

    public final long getLastMoveEventTimeStamp$ui_release() {
        return this.lastMoveEventTimeStamp;
    }

    public final void setLastMoveEventTimeStamp$ui_release(long r1) {
        this.lastMoveEventTimeStamp = r1;
    }

    /* JADX INFO: renamed from: addPosition-Uv8p0NA, reason: not valid java name */
    public final void m5685addPositionUv8p0NA(long timeMillis, long position) {
        int bits$iv$iv$iv = (int) (position >> 32);
        this.xVelocityTracker.addDataPoint(timeMillis, Float.intBitsToFloat(bits$iv$iv$iv));
        int bits$iv$iv$iv2 = (int) (4294967295L & position);
        this.yVelocityTracker.addDataPoint(timeMillis, Float.intBitsToFloat(bits$iv$iv$iv2));
    }

    /* JADX INFO: renamed from: calculateVelocity-9UxMQ8M, reason: not valid java name */
    public final long m5686calculateVelocity9UxMQ8M() {
        return m5687calculateVelocityAH228Gc(VelocityKt.Velocity(Float.MAX_VALUE, Float.MAX_VALUE));
    }

    /* JADX INFO: renamed from: calculateVelocity-AH228Gc, reason: not valid java name */
    public final long m5687calculateVelocityAH228Gc(long maximumVelocity) {
        if (Velocity.m7211getXimpl(maximumVelocity) > 0.0f) goto L5;
    L7:
        boolean value$iv = false;
    L9:
        if (value$iv == true) goto L11;
        InlineClassHelperKt.throwIllegalStateException("maximumVelocity should be a positive value. You specified=" + Velocity.m7218toStringimpl(maximumVelocity));
    L11:
        float velocityX = this.xVelocityTracker.calculateVelocity(Velocity.m7211getXimpl(maximumVelocity));
        float velocityY = this.yVelocityTracker.calculateVelocity(Velocity.m7212getYimpl(maximumVelocity));
        return VelocityKt.Velocity(velocityX, velocityY);
    L5:
        if (Velocity.m7212getYimpl(maximumVelocity) <= 0.0f) goto L7;
        value$iv = true;
        goto L9
    }

    public final void resetTracking() {
        this.xVelocityTracker.resetTracking();
        this.yVelocityTracker.resetTracking();
        this.lastMoveEventTimeStamp = 0;
    }
}
