package androidx.compose.animation.core;

import androidx.collection.IntList;
import androidx.collection.IntObjectMap;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.AnimationVector;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B9\b\u0016\u0012\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00070\u0005\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bBC\b\u0000\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000e\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0010\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006H\u0002J\u0010\u0010'\u001a\u00020(2\u0006\u0010&\u001a\u00020\u0006H\u0002J \u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,H\u0002J-\u0010-\u001a\u00028\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00028\u00002\u0006\u00101\u001a\u00028\u00002\u0006\u00102\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00103J-\u00104\u001a\u00028\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00028\u00002\u0006\u00101\u001a\u00028\u00002\u0006\u00102\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00103J%\u00105\u001a\u0002062\u0006\u00100\u001a\u00028\u00002\u0006\u00101\u001a\u00028\u00002\u0006\u00102\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00107R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0011\u001a\u00020\u0012X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001bR\u0012\u0010\u001c\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001bR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010#\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001bR\u0012\u0010$\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/animation/core/VectorizedKeyframesSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "keyframes", "", "", "Lkotlin/Pair;", "Landroidx/compose/animation/core/Easing;", "durationMillis", "delayMillis", "(Ljava/util/Map;II)V", "timestamps", "Landroidx/collection/IntList;", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;", "defaultEasing", "initialArcMode", "Landroidx/compose/animation/core/ArcMode;", "(Landroidx/collection/IntList;Landroidx/collection/IntObjectMap;IILandroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "arcSpline", "Landroidx/compose/animation/core/ArcSpline;", "getDelayMillis", "()I", "getDurationMillis", "I", "lastInitialValue", "Landroidx/compose/animation/core/AnimationVector;", "lastTargetValue", "modes", "", "posArray", "", "slopeArray", "times", "valueVector", "velocityVector", "findEntryForTimeMillis", "timeMillis", "getEasedTime", "", "getEasedTimeFromIndex", "index", "asFraction", "", "getValueFromNanos", "playTimeNanos", "", "initialValue", "targetValue", "initialVelocity", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "init", "", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VectorizedKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 0;
    private ArcSpline arcSpline;
    private final Easing defaultEasing;
    private final int delayMillis;
    private final int durationMillis;
    private final int initialArcMode;
    private final IntObjectMap<VectorizedKeyframeSpecElementInfo<V>> keyframes;
    private V lastInitialValue;
    private V lastTargetValue;
    private int[] modes;
    private float[] posArray;
    private float[] slopeArray;
    private float[] times;
    private final IntList timestamps;
    private V valueVector;
    private V velocityVector;

    static {
        $stable = 8;
    }

    public /* synthetic */ VectorizedKeyframesSpec(IntList r1, IntObjectMap r2, int r3, int r4, Easing r5, int r6, DefaultConstructorMarker r7) {
        this(r1, r2, r3, r4, r5, r6);
    }

    private VectorizedKeyframesSpec(IntList timestamps, IntObjectMap<VectorizedKeyframeSpecElementInfo<V>> r3, int durationMillis, int delayMillis, Easing defaultEasing, int initialArcMode) {
        this.timestamps = timestamps;
        this.keyframes = r3;
        this.durationMillis = durationMillis;
        this.delayMillis = delayMillis;
        this.defaultEasing = defaultEasing;
        this.initialArcMode = initialArcMode;
        this.modes = VectorizedAnimationSpecKt.access$getEmptyIntArray$p();
        this.times = VectorizedAnimationSpecKt.access$getEmptyFloatArray$p();
        this.posArray = VectorizedAnimationSpecKt.access$getEmptyFloatArray$p();
        this.slopeArray = VectorizedAnimationSpecKt.access$getEmptyFloatArray$p();
        this.arcSpline = VectorizedAnimationSpecKt.access$getEmptyArcSpline$p();
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.delayMillis;
    }

    public /* synthetic */ VectorizedKeyframesSpec(Map r1, int r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = 0;
    L5:
        this(r1, r2, r3);
    }

    public VectorizedKeyframesSpec(Map<Integer, ? extends Pair<? extends V, ? extends Easing>> r18, int durationMillis, int delayMillis) {
        MutableIntList times = new MutableIntList(r18.size() + 2);
        Iterator<Map.Entry<Integer, ? extends Pair<? extends V, ? extends Easing>>> r5 = r18.entrySet().iterator();
    L4:
        if (r5.hasNext() == false) goto L7;
        int t = r5.next().getKey().intValue();
        times.add(t);
        goto L4
    L7:
        if (r18.containsKey(0) == true) goto L10;
        times.add(0, 0);
    L10:
        if (r18.containsKey(Integer.valueOf(durationMillis)) == true) goto L12;
        int r8 = durationMillis;
        times.add(r8);
    L13:
        times.sort();
        MutableIntList r6 = times;
        MutableIntObjectMap timeToInfoMap = new MutableIntObjectMap(0, 1, null);
        Iterator<Map.Entry<Integer, ? extends Pair<? extends V, ? extends Easing>>> r7 = r18.entrySet().iterator();
    L15:
        if (r7.hasNext() == false) goto L17;
        Map.Entry<Integer, ? extends Pair<? extends V, ? extends Easing>> r9 = r7.next();
        int time = r9.getKey().intValue();
        Pair<? extends V, ? extends Easing> r12 = r9.getValue();
        timeToInfoMap.set(time, new VectorizedKeyframeSpecElementInfo(r12.getFirst(), r12.getSecond(), ArcMode.Companion.m148getArcLinear9TMq4(), null));
        goto L15
    L17:
        this(r6, timeToInfoMap, r8, delayMillis, EasingKt.getLinearEasing(), ArcMode.Companion.m148getArcLinear9TMq4(), null);
        return;
    L12:
        r8 = durationMillis;
        goto L13
    }

    private final void init(V r13, V r14, V r15) {
        if (this.arcSpline == VectorizedAnimationSpecKt.access$getEmptyArcSpline$p()) goto L5;
        boolean r0 = true;
    L7:
        if (this.valueVector != null) goto L22;
        this.valueVector = (V) AnimationVectorsKt.newInstance(r13);
        this.velocityVector = (V) AnimationVectorsKt.newInstance(r15);
        int r1 = this.timestamps._size;
        float[] r3 = new float[r1];
        int r4 = 0;
    L9:
        if (r4 >= r1) goto L11;
        r3[r4] = this.timestamps.get(r4) / 1000.0f;
        r4 = r4 + 1;
        goto L9
    L11:
        this.times = r3;
        int r2 = this.timestamps._size;
        int[] r5 = new int[r2];
        int r6 = 0;
    L12:
        if (r6 >= r2) goto L21;
        VectorizedKeyframeSpecElementInfo<V> r7 = this.keyframes.get(this.timestamps.get(r6));
        if (r7 == null) goto L16;
        int r8 = r7.m199getArcMode9TMq4();
    L18:
        if (ArcMode.m142equalsimpl0(r8, ArcMode.Companion.m148getArcLinear9TMq4()) == true) goto L20;
        r0 = true;
    L20:
        r5[r6] = r8;
        r6 = r6 + 1;
        goto L12
    L16:
        r8 = this.initialArcMode;
        goto L18
    L21:
        this.modes = r5;
    L22:
        if (r0 == true) goto L25;
        return;
    L25:
        if (this.arcSpline != VectorizedAnimationSpecKt.access$getEmptyArcSpline$p()) goto L27;
    L30:
        this.lastInitialValue = r13;
        this.lastTargetValue = r14;
        int r9 = (r13.getSize$animation_core_release() % 2) + r13.getSize$animation_core_release();
        this.posArray = new float[r9];
        this.slopeArray = new float[r9];
        int r10 = this.timestamps._size;
        float[][] r11 = new float[r10][];
        int r12 = 0;
    L31:
        if (r12 >= r10) goto L49;
        int r16 = this.timestamps.get(r12);
        VectorizedKeyframeSpecElementInfo<V> r17 = this.keyframes.get(r16);
        if (r16 != 0) goto L39;
        if (r17 != null) goto L39;
        float[] r18 = new float[r9];
        int r19 = 0;
    L36:
        if (r19 >= r9) goto L48;
        r18[r19] = r13.get$animation_core_release(r19);
        r19 = r19 + 1;
    L48:
        r11[r12] = r18;
        r12 = r12 + 1;
    L39:
        if (r16 != getDurationMillis()) goto L44;
        if (r17 != null) goto L44;
        r18 = new float[r9];
        int r20 = 0;
    L42:
        if (r20 >= r9) goto L48;
        r18[r20] = r14.get$animation_core_release(r20);
        r20 = r20 + 1;
    L44:
        Intrinsics.checkNotNull(r17);
        AnimationVector r21 = r17.getVectorValue();
        float[] r22 = new float[r9];
        int r110 = 0;
    L45:
        if (r110 >= r9) goto L47;
        r22[r110] = r21.get$animation_core_release(r110);
        r110 = r110 + 1;
        goto L45
    L47:
        r18 = r22;
        goto L48
    L49:
        this.arcSpline = new ArcSpline(this.modes, this.times, r11);
        return;
    L27:
        if (Intrinsics.areEqual(this.lastInitialValue, r13) == false) goto L30;
        if (Intrinsics.areEqual(this.lastTargetValue, r14) == false) goto L30;
        return;
    L5:
        r0 = false;
        goto L7
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long r24, V r26, V r27, V r28) {
        int r5 = (int) VectorizedAnimationSpecKt.clampPlayTime(this, r24 / AnimationKt.MillisToNanos);
        VectorizedKeyframeSpecElementInfo<V> r6 = this.keyframes.get(r5);
        if (r6 == null) goto L7;
        return (V) r6.getVectorValue();
    L7:
        if (r5 < getDurationMillis()) goto L9;
        return r27;
    L9:
        if (r5 > 0) goto L11;
        return r26;
    L11:
        init(r26, r27, r28);
        V r8 = this.valueVector;
        Intrinsics.checkNotNull(r8);
        if (this.arcSpline == VectorizedAnimationSpecKt.access$getEmptyArcSpline$p()) goto L17;
        float r9 = getEasedTime(r5);
        float[] r10 = this.posArray;
        this.arcSpline.getPos(r9, r10);
        int r11 = 0;
        int r12 = r10.length;
    L14:
        if (r11 >= r12) goto L16;
        r8.set$animation_core_release(r11, r10[r11]);
        r11 = r11 + 1;
        goto L14
    L16:
        return r8;
    L17:
        int r13 = findEntryForTimeMillis(r5);
        float r14 = getEasedTimeFromIndex(r13, r5, true);
        VectorizedKeyframeSpecElementInfo<V> r15 = this.keyframes.get(this.timestamps.get(r13));
        if (r15 == null) goto L21;
        AnimationVector r16 = r15.getVectorValue();
        if (r16 == null) goto L21;
    L22:
        VectorizedKeyframeSpecElementInfo<V> r17 = this.keyframes.get(this.timestamps.get(r13 + 1));
        if (r17 == null) goto L26;
        AnimationVector r18 = r17.getVectorValue();
        if (r18 == null) goto L26;
    L27:
        AnimationVector r19 = r18;
        int r0 = r8.getSize$animation_core_release();
        int r1 = 0;
    L28:
        if (r1 >= r0) goto L30;
        int r110 = r0;
        AnimationVector r2 = r19;
        r8.set$animation_core_release(r1, ((1.0f - r14) * r16.get$animation_core_release(r1)) + (r2.get$animation_core_release(r1) * r14));
        r1 = r1 + 1;
        r0 = r110;
        r19 = r2;
        goto L28
    L30:
        return r8;
    L26:
        r18 = r27;
    L21:
        r16 = r26;
        goto L22
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long playTimeNanos, V r16, V r17, V r18) {
        long playTimeMillis = playTimeNanos / AnimationKt.MillisToNanos;
        long clampedPlayTime = VectorizedAnimationSpecKt.clampPlayTime(this, playTimeMillis);
        if (clampedPlayTime >= 0) goto L5;
        return r18;
    L5:
        init(r16, r17, r18);
        V r0 = this.velocityVector;
        Intrinsics.checkNotNull(r0);
        if (this.arcSpline == VectorizedAnimationSpecKt.access$getEmptyArcSpline$p()) goto L11;
        float easedTime = getEasedTime((int) clampedPlayTime);
        float[] slopeArray = this.slopeArray;
        this.arcSpline.getSlope(easedTime, slopeArray);
        int i = 0;
        int r11 = slopeArray.length;
    L8:
        if (i >= r11) goto L10;
        r0.set$animation_core_release(i, slopeArray[i]);
        i = i + 1;
        goto L8
    L10:
        return r0;
    L11:
        AnimationVector startNum = VectorizedAnimationSpecKt.getValueFromMillis(this, clampedPlayTime - 1, r16, r17, r18);
        AnimationVector endNum = VectorizedAnimationSpecKt.getValueFromMillis(this, clampedPlayTime, r16, r17, r18);
        int i2 = 0;
        int r4 = startNum.getSize$animation_core_release();
    L12:
        if (i2 >= r4) goto L14;
        r0.set$animation_core_release(i2, (startNum.get$animation_core_release(i2) - endNum.get$animation_core_release(i2)) * 1000.0f);
        i2 = i2 + 1;
        goto L12
    L14:
        return r0;
    }

    private final float getEasedTime(int timeMillis) {
        int index = findEntryForTimeMillis(timeMillis);
        return getEasedTimeFromIndex(index, timeMillis, false);
    }

    private final float getEasedTimeFromIndex(int index, int timeMillis, boolean asFraction) {
        IntList this_$iv = this.timestamps;
        if (index >= (this_$iv._size - 1)) goto L5;
        int timeMin = this.timestamps.get(index);
        int timeMax = this.timestamps.get(index + 1);
        if (timeMillis == timeMin) goto L9;
        int timeRange = timeMax - timeMin;
        VectorizedKeyframeSpecElementInfo<V> r4 = this.keyframes.get(timeMin);
        if (r4 == null) goto L14;
        Easing easing = r4.getEasing();
        if (easing == null) goto L14;
    L15:
        float rawFraction = (timeMillis - timeMin) / timeRange;
        float easedFraction = easing.transform(rawFraction);
        if (asFraction == false) goto L19;
        return easedFraction;
    L19:
        return ((timeRange * easedFraction) + timeMin) / 1000.0f;
    L14:
        easing = this.defaultEasing;
        goto L15
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
