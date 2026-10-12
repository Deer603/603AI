package androidx.compose.foundation;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: compiled from: BasicMarquee.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u0086D¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/MarqueeDefaults;", "", "()V", "Iterations", "", "getIterations$annotations", "getIterations", "()I", "RepeatDelayMillis", "getRepeatDelayMillis$annotations", "getRepeatDelayMillis", "Spacing", "Landroidx/compose/foundation/MarqueeSpacing;", "getSpacing", "()Landroidx/compose/foundation/MarqueeSpacing;", "Velocity", "Landroidx/compose/ui/unit/Dp;", "getVelocity-D9Ej5fM", "()F", "F", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MarqueeDefaults {
    public static final int $stable = 0;
    public static final MarqueeDefaults INSTANCE = null;
    private static final int Iterations = 0;
    private static final int RepeatDelayMillis = 0;
    private static final MarqueeSpacing Spacing = null;
    private static final float Velocity = 0.0f;

    public static /* synthetic */ void getIterations$annotations() {
    }

    public static /* synthetic */ void getRepeatDelayMillis$annotations() {
    }

    private MarqueeDefaults() {
    }

    static {
        INSTANCE = new MarqueeDefaults();
        Iterations = 3;
        RepeatDelayMillis = 1200;
        Spacing = MarqueeSpacing.Companion.fractionOfContainer(0.33333334f);
        Velocity = Dp.m6973constructorimpl(30);
    }

    public final int getIterations() {
        return Iterations;
    }

    public final int getRepeatDelayMillis() {
        return RepeatDelayMillis;
    }

    public final MarqueeSpacing getSpacing() {
        return Spacing;
    }

    /* JADX INFO: renamed from: getVelocity-D9Ej5fM, reason: not valid java name */
    public final float m315getVelocityD9Ej5fM() {
        return Velocity;
    }
}
