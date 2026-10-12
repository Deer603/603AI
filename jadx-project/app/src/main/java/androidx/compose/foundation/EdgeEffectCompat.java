package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: EdgeEffectCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\"\u0010\u000b\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u00020\u0011*\u00020\u00052\u0006\u0010\f\u001a\u00020\u0012J\u001a\u0010\u0013\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004J\u0012\u0010\u0016\u001a\u00020\u0011*\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004R\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/EdgeEffectCompat;", "", "()V", "distanceCompat", "", "Landroid/widget/EdgeEffect;", "getDistanceCompat", "(Landroid/widget/EdgeEffect;)F", "create", "context", "Landroid/content/Context;", "absorbToRelaxIfNeeded", "velocity", "edgeEffectLength", "density", "Landroidx/compose/ui/unit/Density;", "onAbsorbCompat", "", "", "onPullDistanceCompat", "deltaDistance", "displacement", "onReleaseWithOppositeDelta", "delta", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EdgeEffectCompat {
    public static final int $stable = 0;
    public static final EdgeEffectCompat INSTANCE = null;

    static {
        INSTANCE = new EdgeEffectCompat();
    }

    private EdgeEffectCompat() {
    }

    public final EdgeEffect create(Context context) {
        if (Build.VERSION.SDK_INT < 31) goto L6;
        return Api31Impl.INSTANCE.create(context, null);
    L6:
        return new GlowEdgeEffectCompat(context);
    }

    public final float onPullDistanceCompat(EdgeEffect $this$onPullDistanceCompat, float deltaDistance, float displacement) {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
        $this$onPullDistanceCompat.onPull(deltaDistance, displacement);
        return deltaDistance;
    L5:
        return Api31Impl.INSTANCE.onPullDistance($this$onPullDistanceCompat, deltaDistance, displacement);
    }

    public final void onAbsorbCompat(EdgeEffect $this$onAbsorbCompat, int velocity) {
        if (Build.VERSION.SDK_INT < 31) goto L7;
        $this$onAbsorbCompat.onAbsorb(velocity);
        return;
    L7:
        if ($this$onAbsorbCompat.isFinished() == false) goto L10;
        $this$onAbsorbCompat.onAbsorb(velocity);
        return;
    }

    public final float absorbToRelaxIfNeeded(EdgeEffect $this$absorbToRelaxIfNeeded, float velocity, float edgeEffectLength, Density density) {
        float flingDistance = EdgeEffectCompat_androidKt.access$flingDistance(density, velocity);
        float actualDistance = getDistanceCompat($this$absorbToRelaxIfNeeded) * edgeEffectLength;
        if (flingDistance > actualDistance) goto L5;
        onAbsorbCompat($this$absorbToRelaxIfNeeded, MathKt.roundToInt(velocity));
        return velocity;
    L5:
        return 0.0f;
    }

    public final void onReleaseWithOppositeDelta(EdgeEffect $this$onReleaseWithOppositeDelta, float delta) {
        if (($this$onReleaseWithOppositeDelta instanceof GlowEdgeEffectCompat) == false) goto L5;
        ((GlowEdgeEffectCompat) $this$onReleaseWithOppositeDelta).releaseWithOppositeDelta(delta);
        return;
    L5:
        $this$onReleaseWithOppositeDelta.onRelease();
    }

    public final float getDistanceCompat(EdgeEffect $this$distanceCompat) {
        if (Build.VERSION.SDK_INT >= 31) goto L7;
        return 0.0f;
    L7:
        return Api31Impl.INSTANCE.getDistance($this$distanceCompat);
    }
}
