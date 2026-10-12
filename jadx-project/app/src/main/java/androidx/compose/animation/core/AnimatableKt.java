package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: compiled from: Animatable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"negativeInfinityBounds1D", "Landroidx/compose/animation/core/AnimationVector1D;", "negativeInfinityBounds2D", "Landroidx/compose/animation/core/AnimationVector2D;", "negativeInfinityBounds3D", "Landroidx/compose/animation/core/AnimationVector3D;", "negativeInfinityBounds4D", "Landroidx/compose/animation/core/AnimationVector4D;", "positiveInfinityBounds1D", "positiveInfinityBounds2D", "positiveInfinityBounds3D", "positiveInfinityBounds4D", "Animatable", "Landroidx/compose/animation/core/Animatable;", "", "initialValue", "visibilityThreshold", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AnimatableKt {
    private static final AnimationVector1D negativeInfinityBounds1D = null;
    private static final AnimationVector2D negativeInfinityBounds2D = null;
    private static final AnimationVector3D negativeInfinityBounds3D = null;
    private static final AnimationVector4D negativeInfinityBounds4D = null;
    private static final AnimationVector1D positiveInfinityBounds1D = null;
    private static final AnimationVector2D positiveInfinityBounds2D = null;
    private static final AnimationVector3D positiveInfinityBounds3D = null;
    private static final AnimationVector4D positiveInfinityBounds4D = null;

    public static final /* synthetic */ AnimationVector1D access$getNegativeInfinityBounds1D$p() {
        return negativeInfinityBounds1D;
    }

    public static final /* synthetic */ AnimationVector2D access$getNegativeInfinityBounds2D$p() {
        return negativeInfinityBounds2D;
    }

    public static final /* synthetic */ AnimationVector3D access$getNegativeInfinityBounds3D$p() {
        return negativeInfinityBounds3D;
    }

    public static final /* synthetic */ AnimationVector4D access$getNegativeInfinityBounds4D$p() {
        return negativeInfinityBounds4D;
    }

    public static final /* synthetic */ AnimationVector1D access$getPositiveInfinityBounds1D$p() {
        return positiveInfinityBounds1D;
    }

    public static final /* synthetic */ AnimationVector2D access$getPositiveInfinityBounds2D$p() {
        return positiveInfinityBounds2D;
    }

    public static final /* synthetic */ AnimationVector3D access$getPositiveInfinityBounds3D$p() {
        return positiveInfinityBounds3D;
    }

    public static final /* synthetic */ AnimationVector4D access$getPositiveInfinityBounds4D$p() {
        return positiveInfinityBounds4D;
    }

    public static /* synthetic */ Animatable Animatable$default(float r0, float r1, int r2, Object r3) {
        if ((r2 & 2) == 0) goto L6;
        r1 = 0.01f;
    L6:
        return Animatable(r0, r1);
    }

    public static final Animatable<Float, AnimationVector1D> Animatable(float initialValue, float visibilityThreshold) {
        String r4 = null;
        return new Animatable(Float.valueOf(initialValue), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), Float.valueOf(visibilityThreshold), r4, 8, null);
    }

    static {
        positiveInfinityBounds1D = AnimationVectorsKt.AnimationVector(Float.POSITIVE_INFINITY);
        positiveInfinityBounds2D = AnimationVectorsKt.AnimationVector(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
        positiveInfinityBounds3D = AnimationVectorsKt.AnimationVector(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
        positiveInfinityBounds4D = AnimationVectorsKt.AnimationVector(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
        negativeInfinityBounds1D = AnimationVectorsKt.AnimationVector(Float.NEGATIVE_INFINITY);
        negativeInfinityBounds2D = AnimationVectorsKt.AnimationVector(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        negativeInfinityBounds3D = AnimationVectorsKt.AnimationVector(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        negativeInfinityBounds4D = AnimationVectorsKt.AnimationVector(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    }
}
