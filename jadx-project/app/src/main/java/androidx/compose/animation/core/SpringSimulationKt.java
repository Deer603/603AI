package androidx.compose.animation.core;

import kotlin.Metadata;

/* JADX INFO: compiled from: SpringSimulation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Motion", "Landroidx/compose/animation/core/Motion;", "value", "", "velocity", "(FF)J", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SpringSimulationKt {
    public static final long Motion(float value, float velocity) {
        long v1$iv = Float.floatToRawIntBits(value);
        long v2$iv = Float.floatToRawIntBits(velocity);
        return Motion.m154constructorimpl((v1$iv << 32) | (4294967295L & v2$iv));
    }
}
