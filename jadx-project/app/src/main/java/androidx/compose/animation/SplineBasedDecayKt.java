package androidx.compose.animation;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

/* JADX INFO: compiled from: SplineBasedDecay.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u000e\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"EndTension", "", "Inflection", "P1", "P2", "StartTension", "computeSplineInfo", "", "splinePositions", "", "splineTimes", "nbSamples", "", "splineBasedDecay", "Landroidx/compose/animation/core/DecayAnimationSpec;", "T", "density", "Landroidx/compose/ui/unit/Density;", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SplineBasedDecayKt {
    private static final float EndTension = 1.0f;
    private static final float Inflection = 0.35f;
    private static final float P1 = 0.175f;
    private static final float P2 = 0.35000002f;
    private static final float StartTension = 0.5f;

    public static final /* synthetic */ void access$computeSplineInfo(float[] splinePositions, float[] splineTimes, int nbSamples) {
        computeSplineInfo(splinePositions, splineTimes, nbSamples);
    }

    private static final void computeSplineInfo(float[] splinePositions, float[] splineTimes, int nbSamples) {
        float xMin = 0.0f;
        float yMin = 0.0f;
        int i = 0;
    L3:
        float r4 = 1.0f;
        if (i >= nbSamples) goto L22;
        float alpha = i / nbSamples;
        float xMax = 1.0f;
    L6:
        float r11 = 2.0f;
        float x = xMin + ((xMax - xMin) / 2.0f);
        float r10 = 3.0f;
        float coef = (x * 3.0f) * (r4 - x);
        float tx = ((((r4 - x) * P1) + (x * P2)) * coef) + ((x * x) * x);
        float r15 = r4;
        float alpha2 = alpha;
        if (Math.abs(tx - alpha) < 1.0E-5d) goto L13;
        if (tx <= alpha2) goto L11;
        xMax = x;
    L12:
        r4 = r15;
        alpha = alpha2;
        goto L6
    L11:
        xMin = x;
        goto L12
    L13:
        float r5 = 0.5f;
        splinePositions[i] = ((((r15 - x) * 0.5f) + x) * coef) + ((x * x) * x);
        float yMax = 1.0f;
    L14:
        float y = yMin + ((yMax - yMin) / r11);
        float coef2 = (y * r10) * (r15 - y);
        float dy = ((((r15 - y) * r5) + y) * coef2) + ((y * y) * y);
        if (Math.abs(dy - alpha2) < 1.0E-5d) goto L21;
        if (dy <= alpha2) goto L19;
        yMax = y;
    L20:
        r5 = 0.5f;
        r10 = 3.0f;
        r11 = 2.0f;
        goto L14
    L19:
        yMin = y;
        goto L20
    L21:
        splineTimes[i] = ((((r15 - y) * P1) + (P2 * y)) * coef2) + ((y * y) * y);
        i = i + 1;
        goto L3
    L22:
        splineTimes[nbSamples] = 1.0f;
        splinePositions[nbSamples] = splineTimes[nbSamples];
    }

    public static final <T> DecayAnimationSpec<T> splineBasedDecay(Density density) {
        return DecayAnimationSpecKt.generateDecayAnimationSpec(new SplineBasedFloatDecayAnimationSpec(density));
    }
}
