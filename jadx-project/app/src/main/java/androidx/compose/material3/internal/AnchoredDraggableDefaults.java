package androidx.compose.material3.internal;

import androidx.compose.animation.core.SpringSpec;
import kotlin.Metadata;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/material3/internal/AnchoredDraggableDefaults;", "", "()V", "AnimationSpec", "Landroidx/compose/animation/core/SpringSpec;", "", "getAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AnchoredDraggableDefaults {
    public static final int $stable = 0;
    private static final SpringSpec<Float> AnimationSpec = null;
    public static final AnchoredDraggableDefaults INSTANCE = null;

    private AnchoredDraggableDefaults() {
    }

    static {
        INSTANCE = new AnchoredDraggableDefaults();
        AnimationSpec = new SpringSpec(0.0f, 0.0f, null, 7, null);
    }

    public final SpringSpec<Float> getAnimationSpec() {
        return AnimationSpec;
    }
}
