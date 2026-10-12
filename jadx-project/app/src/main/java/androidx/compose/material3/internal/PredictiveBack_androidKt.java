package androidx.compose.material3.internal;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import kotlin.Metadata;

/* JADX INFO: compiled from: PredictiveBack.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0002"}, d2 = {"PredictiveBackEasing", "Landroidx/compose/animation/core/Easing;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PredictiveBack_androidKt {
    private static final Easing PredictiveBackEasing = null;

    public static final /* synthetic */ Easing access$getPredictiveBackEasing$p() {
        return PredictiveBackEasing;
    }

    static {
        PredictiveBackEasing = new CubicBezierEasing(0.1f, 0.1f, 0.0f, 1.0f);
    }
}
