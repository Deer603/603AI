package androidx.compose.ui.platform;

import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidViewConfiguration.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/AndroidViewConfigurationApi34;", "", "()V", "getScaledHandwritingGestureLineMargin", "", "viewConfiguration", "Landroid/view/ViewConfiguration;", "getScaledHandwritingSlop", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AndroidViewConfigurationApi34 {
    public static final AndroidViewConfigurationApi34 INSTANCE = null;

    static {
        INSTANCE = new AndroidViewConfigurationApi34();
    }

    private AndroidViewConfigurationApi34() {
    }

    public final float getScaledHandwritingSlop(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }

    public final float getScaledHandwritingGestureLineMargin(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }
}
