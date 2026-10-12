package androidx.compose.material;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.unit.Dp;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/material/SwipeableDefaults;", "", "()V", "AnimationSpec", "Landroidx/compose/animation/core/SpringSpec;", "", "getAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;", "StandardResistanceFactor", "StiffResistanceFactor", "VelocityThreshold", "Landroidx/compose/ui/unit/Dp;", "getVelocityThreshold-D9Ej5fM", "()F", "F", "resistanceConfig", "Landroidx/compose/material/ResistanceConfig;", "anchors", "", "factorAtMin", "factorAtMax", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SwipeableDefaults {
    public static final int $stable = 0;
    private static final SpringSpec<Float> AnimationSpec = null;
    public static final SwipeableDefaults INSTANCE = null;
    public static final float StandardResistanceFactor = 10.0f;
    public static final float StiffResistanceFactor = 20.0f;
    private static final float VelocityThreshold = 0.0f;

    private SwipeableDefaults() {
    }

    static {
        INSTANCE = new SwipeableDefaults();
        AnimationSpec = new SpringSpec(0.0f, 0.0f, null, 7, null);
        VelocityThreshold = Dp.m6973constructorimpl(125);
    }

    public final SpringSpec<Float> getAnimationSpec() {
        return AnimationSpec;
    }

    /* JADX INFO: renamed from: getVelocityThreshold-D9Ej5fM, reason: not valid java name */
    public final float m1791getVelocityThresholdD9Ej5fM() {
        return VelocityThreshold;
    }

    public static /* synthetic */ ResistanceConfig resistanceConfig$default(SwipeableDefaults r1, Set r2, float r3, float r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r3 = 10.0f;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r4 = 10.0f;
    L9:
        return r1.resistanceConfig(r2, r3, r4);
    }

    public final ResistanceConfig resistanceConfig(Set<Float> r3, float factorAtMin, float factorAtMax) {
        if (r3.size() > 1) goto L5;
        return null;
    L5:
        Float r0 = CollectionsKt.maxOrNull(r3);
        Intrinsics.checkNotNull(r0);
        float r1 = r0.floatValue();
        Float r2 = CollectionsKt.minOrNull(r3);
        Intrinsics.checkNotNull(r2);
        float basis = r1 - r2.floatValue();
        return new ResistanceConfig(basis, factorAtMin, factorAtMax);
    }
}
