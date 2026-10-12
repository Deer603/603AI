package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: compiled from: ClipScrollableContainer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"MaxSupportedElevation", "Landroidx/compose/ui/unit/Dp;", "getMaxSupportedElevation", "()F", "F", "clipScrollableContainer", "Landroidx/compose/ui/Modifier;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ClipScrollableContainerKt {
    private static final float MaxSupportedElevation = 0.0f;

    public static final Modifier clipScrollableContainer(Modifier $this$clipScrollableContainer, Orientation orientation) {
        if (orientation != Orientation.Vertical) goto L5;
        Modifier r0 = ClipKt.clip(Modifier.Companion, VerticalScrollableClipShape.INSTANCE);
    L7:
        return $this$clipScrollableContainer.then(r0);
    L5:
        r0 = ClipKt.clip(Modifier.Companion, HorizontalScrollableClipShape.INSTANCE);
        goto L7
    }

    static {
        MaxSupportedElevation = Dp.m6973constructorimpl(30);
    }

    public static final float getMaxSupportedElevation() {
        return MaxSupportedElevation;
    }
}
