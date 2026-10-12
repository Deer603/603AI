package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: compiled from: AnimationState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u001ai\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0002\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0006*\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\t2\u0006\u0010\n\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u0002H\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0001¢\u0006\u0002\u0010\u0010\u001aB\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00022\u0006\u0010\n\u001a\u00020\u00112\b\b\u0002\u0010\u000b\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0001\u001ak\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0002\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0006*\u00020\u0007*\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u00022\b\b\u0002\u0010\u0014\u001a\u0002H\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u0001H\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0001¢\u0006\u0002\u0010\u0016\u001aT\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0002*\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0001\u001a3\u0010\u0018\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0006*\u00020\u0007*\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\t2\u0006\u0010\u0014\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0019\"\u001d\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u001a"}, d2 = {"isFinished", "", "Landroidx/compose/animation/core/AnimationState;", "(Landroidx/compose/animation/core/AnimationState;)Z", "AnimationState", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "initialValue", "initialVelocity", "lastFrameTimeNanos", "", "finishedTimeNanos", "isRunning", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;JJZ)Landroidx/compose/animation/core/AnimationState;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "copy", "value", "velocityVector", "(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;JJZ)Landroidx/compose/animation/core/AnimationState;", "velocity", "createZeroVectorFrom", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)Landroidx/compose/animation/core/AnimationVector;", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AnimationStateKt {
    public static final boolean isFinished(AnimationState<?, ?> r4) {
        if (r4.getFinishedTimeNanos() == Long.MIN_VALUE) goto L5;
        return true;
    L5:
        return false;
    }

    public static /* synthetic */ AnimationState copy$default(AnimationState r0, Object r1, AnimationVector r2, long r3, long r5, boolean r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.getValue();
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = AnimationVectorsKt.copy(r0.getVelocityVector());
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.getLastFrameTimeNanos();
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = r0.getFinishedTimeNanos();
    L15:
        if ((r8 & 16) == 0) goto L17;
        boolean r10 = r0.isRunning();
    L18:
        long r11 = r5;
        long r6 = r3;
        return copy(r0, r1, r2, r6, r11, r10);
    L17:
        r10 = r7;
        goto L18
    }

    public static final <T, V extends AnimationVector> AnimationState<T, V> copy(AnimationState<T, V> r9, T r10, V r11, long lastFrameTimeNanos, long finishedTimeNanos, boolean isRunning) {
        return new AnimationState(r9.getTypeConverter(), r10, r11, lastFrameTimeNanos, finishedTimeNanos, isRunning);
    }

    public static /* synthetic */ AnimationState copy$default(AnimationState r0, float r1, float r2, long r3, long r5, boolean r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = ((Number) r0.getValue()).floatValue();
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = ((AnimationVector1D) r0.getVelocityVector()).getValue();
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.getLastFrameTimeNanos();
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = r0.getFinishedTimeNanos();
    L15:
        if ((r8 & 16) == 0) goto L17;
        boolean r10 = r0.isRunning();
    L18:
        long r11 = r5;
        long r6 = r3;
        return copy(r0, r1, r2, r6, r11, r10);
    L17:
        r10 = r7;
        goto L18
    }

    public static final AnimationState<Float, AnimationVector1D> copy(AnimationState<Float, AnimationVector1D> r9, float value, float velocity, long lastFrameTimeNanos, long finishedTimeNanos, boolean isRunning) {
        return new AnimationState(r9.getTypeConverter(), Float.valueOf(value), AnimationVectorsKt.AnimationVector(velocity), lastFrameTimeNanos, finishedTimeNanos, isRunning);
    }

    public static /* synthetic */ AnimationState AnimationState$default(float r2, float r3, long r4, long r6, boolean r8, int r9, Object r10) {
        if ((r9 & 2) == 0) goto L6;
        r3 = 0.0f;
    L6:
        if ((r9 & 4) == 0) goto L9;
        r4 = Long.MIN_VALUE;
    L9:
        if ((r9 & 8) == 0) goto L12;
        r6 = Long.MIN_VALUE;
    L12:
        if ((r9 & 16) == 0) goto L14;
        boolean r11 = false;
    L16:
        return AnimationState(r2, r3, r4, r6, r11);
    L14:
        r11 = r8;
        goto L16
    }

    public static final AnimationState<Float, AnimationVector1D> AnimationState(float initialValue, float initialVelocity, long lastFrameTimeNanos, long finishedTimeNanos, boolean isRunning) {
        return new AnimationState(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), Float.valueOf(initialValue), AnimationVectorsKt.AnimationVector(initialVelocity), lastFrameTimeNanos, finishedTimeNanos, isRunning);
    }

    public static /* synthetic */ AnimationState AnimationState$default(TwoWayConverter r2, Object r3, Object r4, long r5, long r7, boolean r9, int r10, Object r11) {
        if ((r10 & 8) == 0) goto L6;
        r5 = Long.MIN_VALUE;
    L6:
        if ((r10 & 16) == 0) goto L9;
        r7 = Long.MIN_VALUE;
    L9:
        if ((r10 & 32) == 0) goto L12;
        r9 = false;
    L12:
        return AnimationState(r2, r3, r4, r5, r7, r9);
    }

    public static final <T, V extends AnimationVector> AnimationState<T, V> AnimationState(TwoWayConverter<T, V> r9, T r10, T r11, long lastFrameTimeNanos, long finishedTimeNanos, boolean isRunning) {
        return new AnimationState(r9, r10, r9.getConvertToVector().invoke(r11), lastFrameTimeNanos, finishedTimeNanos, isRunning);
    }

    public static final <T, V extends AnimationVector> V createZeroVectorFrom(TwoWayConverter<T, V> r3, T r4) {
        AnimationVector r0 = r3.getConvertToVector().invoke(r4);
        AnimationVector it = r0;
        it.reset$animation_core_release();
        return r0;
    }
}
