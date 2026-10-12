package androidx.compose.foundation;

import android.view.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

/* JADX INFO: compiled from: EdgeEffectCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"DecelMinusOne", "", "DecelerationRate", "GravityEarth", "", "InchesPerMeter", "Inflection", "PlatformFlingScrollFriction", "flingDistance", "density", "Landroidx/compose/ui/unit/Density;", "velocity", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class EdgeEffectCompat_androidKt {
    private static final double DecelMinusOne = 0.0d;
    private static final double DecelerationRate = 0.0d;
    private static final float GravityEarth = 9.80665f;
    private static final float InchesPerMeter = 39.37f;
    private static final float Inflection = 0.35f;
    private static final float PlatformFlingScrollFriction = 0.0f;

    public static final /* synthetic */ float access$flingDistance(Density density, float velocity) {
        return flingDistance(density, velocity);
    }

    static {
        PlatformFlingScrollFriction = ViewConfiguration.getScrollFriction();
        DecelerationRate = Math.log(0.78d) / Math.log(0.9d);
        DecelMinusOne = DecelerationRate - 1.0d;
    }

    private static final float flingDistance(Density density, float velocity) {
        double magicPhysicalCoefficient = ((density.getDensity() * 386.0878f) * 160.0f) * 0.84f;
        double l = Math.log(((double) (Math.abs(velocity) * Inflection)) / (((double) PlatformFlingScrollFriction) * magicPhysicalCoefficient));
        double distance = (((double) PlatformFlingScrollFriction) * magicPhysicalCoefficient) * Math.exp((DecelerationRate / DecelMinusOne) * l);
        return (float) distance;
    }
}
