package androidx.compose.ui.platform;

import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/MotionEventVerifierApi29;", "", "()V", "isValidMotionEvent", "", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "index", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class MotionEventVerifierApi29 {
    public static final MotionEventVerifierApi29 INSTANCE = null;

    static {
        INSTANCE = new MotionEventVerifierApi29();
    }

    private MotionEventVerifierApi29() {
    }

    public final boolean isValidMotionEvent(MotionEvent event, int index) {
        float $this$fastIsFinite$iv = event.getRawX(index);
        if ((Float.floatToRawIntBits($this$fastIsFinite$iv) & Integer.MAX_VALUE) >= 2139095040) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L14;
        float $this$fastIsFinite$iv2 = event.getRawY(index);
        if ((Float.floatToRawIntBits($this$fastIsFinite$iv2) & Integer.MAX_VALUE) >= 2139095040) goto L10;
        boolean r1 = true;
    L11:
        if (r1 == false) goto L14;
        return true;
    L10:
        r1 = false;
    L14:
        return false;
    L5:
        r0 = false;
        goto L6
    }
}
