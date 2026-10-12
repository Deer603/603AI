package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEvent;
import kotlin.Metadata;

/* JADX INFO: compiled from: TapGestureDetector.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0004\u001a\u00020\u0001H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u0005"}, d2 = {"isDeepPress", "", "Landroidx/compose/ui/input/pointer/PointerEvent;", "(Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "firstDownRefersToPrimaryMouseButtonOnly", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TapGestureDetector_androidKt {
    public static final boolean isDeepPress(PointerEvent $this$isDeepPress) {
        if ($this$isDeepPress.getClassification() != 2) goto L5;
        return true;
    L5:
        return false;
    }

    public static final boolean firstDownRefersToPrimaryMouseButtonOnly() {
        return false;
    }
}
