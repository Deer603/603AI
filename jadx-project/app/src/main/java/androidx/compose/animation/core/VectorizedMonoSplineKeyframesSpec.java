package androidx.compose.animation.core;

import androidx.collection.IntList;
import androidx.collection.IntObjectMap;
import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VectorizedMonoSplineKeyframesSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B?\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bH\u0002J\u0018\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bH\u0002J\u0010\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u000bH\u0002J-\u0010$\u001a\u00028\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00028\u00002\u0006\u0010(\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010*J-\u0010+\u001a\u00028\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00028\u00002\u0006\u0010(\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010*J%\u0010,\u001a\u00020-2\u0006\u0010'\u001a\u00028\u00002\u0006\u0010(\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010.R\u0014\u0010\f\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0012\u0010\u0015\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001dR\u0012\u0010\u001e\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014¨\u0006/"}, d2 = {"Landroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "timestamps", "Landroidx/collection/IntList;", "keyframes", "Landroidx/collection/IntObjectMap;", "Lkotlin/Pair;", "Landroidx/compose/animation/core/Easing;", "durationMillis", "", "delayMillis", "periodicBias", "", "(Landroidx/collection/IntList;Landroidx/collection/IntObjectMap;IIF)V", "getDelayMillis", "()I", "getDurationMillis", "lastInitialValue", "Landroidx/compose/animation/core/AnimationVector;", "lastTargetValue", "monoSpline", "Landroidx/compose/animation/core/MonoSpline;", "times", "", "valueVector", "values", "", "[[F", "velocityVector", "findEntryForTimeMillis", "timeMillis", "getEasedTimeFromIndex", "index", "getEasing", "getValueFromNanos", "playTimeNanos", "", "initialValue", "targetValue", "initialVelocity", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "init", "", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VectorizedMonoSplineKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 0;
    private final int delayMillis;
    private final int durationMillis;
    private final IntObjectMap<Pair<V, Easing>> keyframes;
    private V lastInitialValue;
    private V lastTargetValue;
    private MonoSpline monoSpline;
    private final float periodicBias;
    private float[] times;
    private final IntList timestamps;
    private V valueVector;
    private float[][] values;
    private V velocityVector;

    static {
        $stable = 8;
    }

    public VectorizedMonoSplineKeyframesSpec(IntList timestamps, IntObjectMap<Pair<V, Easing>> r2, int durationMillis, int delayMillis, float periodicBias) {
        this.timestamps = timestamps;
        this.keyframes = r2;
        this.durationMillis = durationMillis;
        this.delayMillis = delayMillis;
        this.periodicBias = periodicBias;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.delayMillis;
    }

    private final void init(V r18, V r19, V r20) {
        int r4 = 0;
        if (this.valueVector != null) goto L9;
        this.valueVector = (V) AnimationVectorsKt.newInstance(r18);
        this.velocityVector = (V) AnimationVectorsKt.newInstance(r20);
        int r3 = this.timestamps._size;
        float[] r5 = new float[r3];
        int r6 = 0;
    L5:
        if (r6 >= r3) goto L7;
        r5[r6] = this.timestamps.get(r6) / 1000.0f;
        r6 = r6 + 1;
        goto L5
    L7:
        this.times = r5;
    L9:
        if (this.monoSpline != null) goto L11;
    L14:
        boolean r7 = !Intrinsics.areEqual(this.lastInitialValue, r18);
        boolean r8 = !Intrinsics.areEqual(this.lastTargetValue, r19);
        this.lastInitialValue = r18;
        this.lastTargetValue = r19;
        int r9 = r18.getSize$animation_core_release();
        float[][] r10 = this.values;
        if (r10 != null) goto L36;
        int r11 = this.timestamps._size;
        float[][] r12 = new float[r11][];
        int r13 = 0;
    L17:
        if (r13 >= r11) goto L35;
        int r14 = this.timestamps.get(r13);
        Pair<V, Easing> r15 = this.keyframes.get(r14);
        if (r14 != 0) goto L25;
        if (r15 != null) goto L25;
        float[] r16 = new float[r9];
        int r17 = 0;
    L22:
        if (r17 >= r9) goto L34;
        r16[r17] = r18.get$animation_core_release(r17);
        r17 = r17 + 1;
    L34:
        r12[r13] = r16;
        r13 = r13 + 1;
    L25:
        if (r14 != getDurationMillis()) goto L30;
        if (r15 != null) goto L30;
        r16 = new float[r9];
        int r110 = 0;
    L28:
        if (r110 >= r9) goto L34;
        r16[r110] = r19.get$animation_core_release(r110);
        r110 = r110 + 1;
    L30:
        Intrinsics.checkNotNull(r15);
        V r111 = r15.getFirst();
        float[] r112 = new float[r9];
        int r113 = 0;
    L31:
        if (r113 >= r9) goto L33;
        r112[r113] = r111.get$animation_core_release(r113);
        r113 = r113 + 1;
        goto L31
    L33:
        r16 = r112;
        goto L34
    L35:
        r10 = r12;
        this.values = r10;
    L50:
        float[] r21 = this.times;
        if (r21 != null) goto L53;
        Intrinsics.throwUninitializedPropertyAccessException("times");
        r21 = null;
    L53:
        this.monoSpline = new MonoSpline(r21, r10, this.periodicBias);
        return;
    L36:
        if (r7 == true) goto L38;
    L43:
        if (r8 == false) goto L50;
        if (this.keyframes.containsKey(getDurationMillis()) == true) goto L50;
        int r22 = IntList.binarySearch$default(this.timestamps, getDurationMillis(), 0, 0, 6, null);
        float[] r23 = new float[r9];
    L47:
        if (r4 >= r9) goto L49;
        r23[r4] = r19.get$animation_core_release(r4);
        r4 = r4 + 1;
        goto L47
    L49:
        r10[r22] = r23;
        goto L50
    L38:
        if (this.keyframes.containsKey(0) == true) goto L43;
        int r24 = IntList.binarySearch$default(this.timestamps, 0, 0, 0, 6, null);
        float[] r25 = new float[r9];
        int r114 = 0;
    L40:
        if (r114 >= r9) goto L42;
        r25[r114] = r18.get$animation_core_release(r114);
        r114 = r114 + 1;
        goto L40
    L42:
        r10[r24] = r25;
        goto L43
    L11:
        if (Intrinsics.areEqual(this.lastInitialValue, r18) == false) goto L14;
        if (Intrinsics.areEqual(this.lastTargetValue, r19) == false) goto L14;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long playTimeNanos, V r11, V r12, V r13) {
        long playTimeMillis = playTimeNanos / AnimationKt.MillisToNanos;
        int clampedPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, playTimeMillis);
        Pair<V, Easing> r3 = this.keyframes.get(clampedPlayTime);
        if (r3 == null) goto L7;
        return r3.getFirst();
    L7:
        if (clampedPlayTime < getDurationMillis()) goto L9;
        return r12;
    L9:
        if (clampedPlayTime > 0) goto L11;
        return r11;
    L11:
        init(r11, r12, r13);
        int index = findEntryForTimeMillis(clampedPlayTime);
        V r5 = this.valueVector;
        Intrinsics.checkNotNull(r5);
        MonoSpline r6 = this.monoSpline;
        Intrinsics.checkNotNull(r6);
        r6.getPos(getEasedTimeFromIndex(index, clampedPlayTime), r5, index);
        return r5;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long playTimeNanos, V r10, V r11, V r12) {
        long playTimeMillis = playTimeNanos / AnimationKt.MillisToNanos;
        int clampedPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, playTimeMillis);
        init(r10, r11, r12);
        int index = findEntryForTimeMillis(clampedPlayTime);
        V r4 = this.velocityVector;
        Intrinsics.checkNotNull(r4);
        MonoSpline r5 = this.monoSpline;
        Intrinsics.checkNotNull(r5);
        r5.getSlope(getEasedTimeFromIndex(index, clampedPlayTime), r4, index);
        return r4;
    }

    private final Easing getEasing(int index) {
        int timestamp = this.timestamps.get(index);
        Pair<V, Easing> r1 = this.keyframes.get(timestamp);
        if (r1 == null) goto L7;
        Easing r2 = r1.getSecond();
        if (r2 == null) goto L7;
        return r2;
    L7:
        return EasingKt.getLinearEasing();
    }

    private final float getEasedTimeFromIndex(int index, int timeMillis) {
        IntList this_$iv = this.timestamps;
        if (index >= (this_$iv._size - 1)) goto L5;
        int timeMin = this.timestamps.get(index);
        int timeMax = this.timestamps.get(index + 1);
        if (timeMillis == timeMin) goto L9;
        int timeRange = timeMax - timeMin;
        Easing easing = getEasing(index);
        float rawFraction = (timeMillis - timeMin) / timeRange;
        float easedFraction = easing.transform(rawFraction);
        return ((timeRange * easedFraction) + timeMin) / 1000.0f;
    L9:
        return timeMin / 1000.0f;
    L5:
        return timeMillis / 1000.0f;
    }

    private final int findEntryForTimeMillis(int timeMillis) {
        int index = IntList.binarySearch$default(this.timestamps, timeMillis, 0, 0, 6, null);
        if (index >= (-1)) goto L6;
        return -(index + 2);
    L6:
        return index;
    }
}
