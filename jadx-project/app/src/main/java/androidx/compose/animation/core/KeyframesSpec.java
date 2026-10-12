package androidx.compose.animation.core;

import androidx.collection.IntObjectMap;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002\u000e\u000fB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J,\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\b\b\u0001\u0010\n*\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\n0\rH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec;", "T", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "config", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "(Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;)V", "getConfig", "()Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "vectorize", "Landroidx/compose/animation/core/VectorizedKeyframesSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "converter", "Landroidx/compose/animation/core/TwoWayConverter;", "KeyframeEntity", "KeyframesSpecConfig", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class KeyframesSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final KeyframesSpecConfig<T> config;

    /* JADX INFO: compiled from: AnimationSpec.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B#\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\"\u0010\u0006\u001a\u00020\u0007X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "T", "Landroidx/compose/animation/core/KeyframeBaseEntity;", "value", "easing", "Landroidx/compose/animation/core/Easing;", "arcMode", "Landroidx/compose/animation/core/ArcMode;", "(Ljava/lang/Object;Landroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getArcMode--9T-Mq4$animation_core_release", "()I", "setArcMode-Rur9ykg$animation_core_release", "(I)V", "I", "equals", "", "other", "", "hashCode", "", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class KeyframeEntity<T> extends KeyframeBaseEntity<T> {
        public static final int $stable = 0;
        private int arcMode;

        static {
            $stable = 8;
        }

        public /* synthetic */ KeyframeEntity(Object r1, Easing r2, int r3, DefaultConstructorMarker r4) {
            this(r1, r2, r3);
        }

        public /* synthetic */ KeyframeEntity(Object r1, Easing r2, int r3, int r4, DefaultConstructorMarker r5) {
            if ((r4 & 2) == 0) goto L6;
            r2 = EasingKt.getLinearEasing();
        L6:
            if ((r4 & 4) == 0) goto L8;
            r3 = ArcMode.Companion.m148getArcLinear9TMq4();
        L8:
            this(r1, r2, r3, null);
        }

        /* JADX INFO: renamed from: getArcMode--9T-Mq4$animation_core_release, reason: not valid java name */
        public final int m150getArcMode9TMq4$animation_core_release() {
            return this.arcMode;
        }

        /* JADX INFO: renamed from: setArcMode-Rur9ykg$animation_core_release, reason: not valid java name */
        public final void m151setArcModeRur9ykg$animation_core_release(int r1) {
            this.arcMode = r1;
        }

        private KeyframeEntity(T r2, Easing easing, int arcMode) {
            super(r2, easing, null);
            this.arcMode = arcMode;
        }

        public boolean equals(Object other) {
            if (other != this) goto L6;
            return true;
        L6:
            if ((other instanceof KeyframeEntity) == true) goto L9;
            return false;
        L9:
            if (Intrinsics.areEqual(((KeyframeEntity) other).getValue$animation_core_release(), getValue$animation_core_release()) == false) goto L16;
            if (Intrinsics.areEqual(((KeyframeEntity) other).getEasing$animation_core_release(), getEasing$animation_core_release()) == false) goto L16;
            if (ArcMode.m142equalsimpl0(((KeyframeEntity) other).arcMode, this.arcMode) == false) goto L16;
            return true;
        L16:
            return false;
        }

        public int hashCode() {
            T r0 = getValue$animation_core_release();
            if (r0 == null) goto L5;
            int result = r0.hashCode();
        L6:
            int result2 = (result * 31) + ArcMode.m143hashCodeimpl(this.arcMode);
            return (result2 * 31) + getEasing$animation_core_release().hashCode();
        L5:
            result = 0;
            goto L6
        }
    }

    /* JADX INFO: compiled from: AnimationSpec.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0006\u001a\u00028\u0001H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003*\u00028\u00012\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0096\u0004¢\u0006\u0002\u0010\fJ\"\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003*\u00028\u00012\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0096\u0004¢\u0006\u0002\u0010\u0010J+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0086\u0004ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "T", "Landroidx/compose/animation/core/KeyframesSpecBaseConfig;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "()V", "createEntityFor", "value", "createEntityFor$animation_core_release", "(Ljava/lang/Object;)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "at", "timeStamp", "", "(Ljava/lang/Object;I)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "atFraction", "fraction", "", "(Ljava/lang/Object;F)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "using", "arcMode", "Landroidx/compose/animation/core/ArcMode;", "using-ngzHuyU", "(Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;I)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "with", "", "easing", "Landroidx/compose/animation/core/Easing;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class KeyframesSpecConfig<T> extends KeyframesSpecBaseConfig<T, KeyframeEntity<T>> {
        public static final int $stable = 0;

        static {
        }

        public KeyframesSpecConfig() {
            super(null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ KeyframeBaseEntity at(Object r2, int timeStamp) {
            return at(r2, timeStamp);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ KeyframeBaseEntity atFraction(Object r2, float fraction) {
            return atFraction(r2, fraction);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ KeyframeBaseEntity createEntityFor$animation_core_release(Object r2) {
            return createEntityFor$animation_core_release(r2);
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public KeyframeEntity<T> createEntityFor$animation_core_release(T r7) {
            Easing r2 = null;
            int r3 = 0;
            return new KeyframeEntity(r7, r2, r3, 6, null);
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public KeyframeEntity<T> at(T r7, int timeStamp) {
            Easing r2 = null;
            int r3 = 0;
            KeyframeEntity<T> r0 = new KeyframeEntity(r7, r2, r3, 6, null);
            getKeyframes$animation_core_release().set(timeStamp, r0);
            return r0;
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public KeyframeEntity<T> atFraction(T r3, float fraction) {
            float $this$fastRoundToInt$iv = getDurationMillis() * fraction;
            return at(r3, Math.round($this$fastRoundToInt$iv));
        }

        @Deprecated(message = "Use version that returns an instance of the entity so it can be re-used in other keyframe builders.", replaceWith = @ReplaceWith(expression = "this using easing", imports = {}))
        public final void with(KeyframeEntity<T> r1, Easing easing) {
            r1.setEasing$animation_core_release(easing);
        }

        /* JADX INFO: renamed from: using-ngzHuyU, reason: not valid java name */
        public final KeyframeEntity<T> m152usingngzHuyU(KeyframeEntity<T> r1, int arcMode) {
            r1.m151setArcModeRur9ykg$animation_core_release(arcMode);
            return r1;
        }
    }

    static {
    }

    public KeyframesSpec(KeyframesSpecConfig<T> r1) {
        this.config = r1;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public /* bridge */ /* synthetic */ VectorizedAnimationSpec vectorize(TwoWayConverter converter) {
        return vectorize(converter);
    }

    @Override // androidx.compose.animation.core.DurationBasedAnimationSpec, androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public /* bridge */ /* synthetic */ VectorizedDurationBasedAnimationSpec vectorize(TwoWayConverter converter) {
        return vectorize(converter);
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public /* bridge */ /* synthetic */ VectorizedFiniteAnimationSpec vectorize(TwoWayConverter converter) {
        return vectorize(converter);
    }

    public final KeyframesSpecConfig<T> getConfig() {
        return this.config;
    }

    @Override // androidx.compose.animation.core.DurationBasedAnimationSpec, androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedKeyframesSpec<V> vectorize(TwoWayConverter<T, V> r29) {
        MutableIntList timestamps = new MutableIntList(this.config.getKeyframes$animation_core_release().getSize() + 2);
        MutableIntObjectMap timeToInfoMap = new MutableIntObjectMap(this.config.getKeyframes$animation_core_release().getSize());
        IntObjectMap this_$iv = this.config.getKeyframes$animation_core_release();
        int $i$f$forEach = 0;
        int[] k$iv = this_$iv.keys;
        Object[] v$iv = this_$iv.values;
        IntObjectMap this_$iv$iv = this_$iv;
        long[] m$iv$iv = this_$iv$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L25;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long slot$iv$iv2 = slot$iv$iv;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L19;
        int r13 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L16;
        long value$iv$iv$iv = slot$iv$iv2 & 255;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r20 = true;
    L12:
        if (r20 == false) goto L15;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int key = k$iv[index$iv$iv];
        KeyframeEntity value = (KeyframeEntity) v$iv[index$iv$iv];
        timestamps.add(key);
        timeToInfoMap.set(key, new VectorizedKeyframeSpecElementInfo(r29.getConvertToVector().invoke(value.getValue$animation_core_release()), value.getEasing$animation_core_release(), value.m150getArcMode9TMq4$animation_core_release(), null));
    L15:
        slot$iv$iv2 = slot$iv$iv2 >> r13;
        j$iv$iv = j$iv$iv + 1;
        this_$iv = this_$iv;
        r13 = r13;
        $i$f$forEach = $i$f$forEach;
        k$iv = k$iv;
        v$iv = v$iv;
        this_$iv$iv = this_$iv$iv;
        goto L7
    L11:
        r20 = false;
        goto L12
    L16:
        IntObjectMap this_$iv2 = this_$iv;
        int $i$f$forEach2 = $i$f$forEach;
        int[] k$iv2 = k$iv;
        Object[] v$iv2 = v$iv;
        IntObjectMap this_$iv$iv2 = this_$iv$iv;
        if (bitCount$iv$iv != r13) goto L25;
    L20:
        if (i$iv$iv == lastIndex$iv$iv) goto L25;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
        $i$f$forEach = $i$f$forEach2;
        k$iv = k$iv2;
        v$iv = v$iv2;
        this_$iv$iv = this_$iv$iv2;
        goto L4
    L19:
        this_$iv2 = this_$iv;
        $i$f$forEach2 = $i$f$forEach;
        k$iv2 = k$iv;
        v$iv2 = v$iv;
        this_$iv$iv2 = this_$iv$iv;
    L25:
        if (this.config.getKeyframes$animation_core_release().containsKey(0) == true) goto L27;
        timestamps.add(0, 0);
    L27:
        IntObjectMap this_$iv3 = this.config.getKeyframes$animation_core_release();
        int key$iv = this.config.getDurationMillis();
        if (this_$iv3.containsKey(key$iv) == true) goto L30;
        timestamps.add(this.config.getDurationMillis());
    L30:
        timestamps.sort();
        return new VectorizedKeyframesSpec(timestamps, timeToInfoMap, this.config.getDurationMillis(), this.config.getDelayMillis(), EasingKt.getLinearEasing(), ArcMode.Companion.m148getArcLinear9TMq4(), null);
    }
}
