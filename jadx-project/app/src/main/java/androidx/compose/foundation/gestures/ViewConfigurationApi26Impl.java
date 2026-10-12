package androidx.compose.foundation.gestures;

import android.view.ViewConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidScrollable.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/gestures/ViewConfigurationApi26Impl;", "", "()V", "getHorizontalScrollFactor", "", "viewConfiguration", "Landroid/view/ViewConfiguration;", "getVerticalScrollFactor", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ViewConfigurationApi26Impl {
    public static final ViewConfigurationApi26Impl INSTANCE = null;

    static {
        INSTANCE = new ViewConfigurationApi26Impl();
    }

    private ViewConfigurationApi26Impl() {
    }

    public final float getVerticalScrollFactor(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public final float getHorizontalScrollFactor(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }
}
