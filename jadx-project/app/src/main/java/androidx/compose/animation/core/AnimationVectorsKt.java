package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnimationVectors.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a&\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003\u001a\u001b\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000bH\u0000¢\u0006\u0002\u0010\r\u001a#\u0010\u000e\u001a\u00020\u000f\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000b2\u0006\u0010\u0010\u001a\u0002H\u000bH\u0000¢\u0006\u0002\u0010\u0011\u001a\u001b\u0010\u0012\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000bH\u0000¢\u0006\u0002\u0010\r¨\u0006\u0013"}, d2 = {"AnimationVector", "Landroidx/compose/animation/core/AnimationVector1D;", "v1", "", "Landroidx/compose/animation/core/AnimationVector2D;", "v2", "Landroidx/compose/animation/core/AnimationVector3D;", "v3", "Landroidx/compose/animation/core/AnimationVector4D;", "v4", "copy", "T", "Landroidx/compose/animation/core/AnimationVector;", "(Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "copyFrom", "", "source", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "newInstance", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AnimationVectorsKt {
    public static final AnimationVector1D AnimationVector(float v1) {
        return new AnimationVector1D(v1);
    }

    public static final AnimationVector2D AnimationVector(float v1, float v2) {
        return new AnimationVector2D(v1, v2);
    }

    public static final AnimationVector3D AnimationVector(float v1, float v2, float v3) {
        return new AnimationVector3D(v1, v2, v3);
    }

    public static final AnimationVector4D AnimationVector(float v1, float v2, float v3, float v4) {
        return new AnimationVector4D(v1, v2, v3, v4);
    }

    public static final <T extends AnimationVector> T newInstance(T r2) {
        T r0 = (T) r2.newVector$animation_core_release();
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return r0;
    }

    public static final <T extends AnimationVector> T copy(T r4) {
        T r0 = (T) newInstance(r4);
        int r1 = 0;
        int r2 = r0.getSize$animation_core_release();
    L3:
        if (r1 >= r2) goto L5;
        r0.set$animation_core_release(r1, r4.get$animation_core_release(r1));
        r1 = r1 + 1;
        goto L3
    L5:
        return r0;
    }

    public static final <T extends AnimationVector> void copyFrom(T r3, T r4) {
        int i = 0;
        int r1 = r3.getSize$animation_core_release();
    L3:
        if (i >= r1) goto L5;
        r3.set$animation_core_release(i, r4.get$animation_core_release(i));
        i = i + 1;
        goto L3
    }
}
