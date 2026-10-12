package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: compiled from: MouseWheelScrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0007\n\u0000\u001a\f\u0010\b\u001a\u00020\t*\u00020\nH\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"AnimationSpeed", "Landroidx/compose/ui/unit/Dp;", "F", "AnimationThreshold", "MaxAnimationDuration", "", "ScrollProgressTimeout", "", "isLowScrollingDelta", "", "", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MouseWheelScrollableKt {
    private static final float AnimationSpeed = 0.0f;
    private static final float AnimationThreshold = 0.0f;
    private static final int MaxAnimationDuration = 100;
    private static final long ScrollProgressTimeout = 50;

    public static final /* synthetic */ float access$getAnimationSpeed$p() {
        return AnimationSpeed;
    }

    public static final /* synthetic */ float access$getAnimationThreshold$p() {
        return AnimationThreshold;
    }

    public static final /* synthetic */ boolean access$isLowScrollingDelta(float $receiver) {
        return isLowScrollingDelta($receiver);
    }

    private static final boolean isLowScrollingDelta(float $this$isLowScrollingDelta) {
        if (Float.isNaN($this$isLowScrollingDelta) == false) goto L5;
    L8:
        return true;
    L5:
        if (Math.abs($this$isLowScrollingDelta) < 0.5f) goto L8;
        return false;
    }

    static {
        AnimationThreshold = Dp.m6973constructorimpl(6);
        AnimationSpeed = Dp.m6973constructorimpl(1);
    }
}
