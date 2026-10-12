package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidWindowInfo.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/BoundsHelperApi24Impl;", "Landroidx/compose/ui/platform/BoundsHelper;", "()V", "currentWindowBounds", "Landroid/graphics/Rect;", "activity", "Landroid/app/Activity;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class BoundsHelperApi24Impl implements BoundsHelper {
    public static final BoundsHelperApi24Impl INSTANCE = null;

    static {
        INSTANCE = new BoundsHelperApi24Impl();
    }

    private BoundsHelperApi24Impl() {
    }

    @Override // androidx.compose.ui.platform.BoundsHelper
    public Rect currentWindowBounds(Activity activity) {
        Rect bounds = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(bounds);
        if (activity.isInMultiWindowMode() == true) goto L10;
        Point realDisplaySize = new Point();
        defaultDisplay.getRealSize(realDisplaySize);
        int navigationBarHeight = AndroidWindowInfo_androidKt.access$getNavigationBarHeight(activity);
        if ((bounds.bottom + navigationBarHeight) != realDisplaySize.y) goto L8;
        bounds.bottom += navigationBarHeight;
        goto L10
    L8:
        if ((bounds.right + navigationBarHeight) != realDisplaySize.x) goto L10;
        bounds.right += navigationBarHeight;
    L10:
        return bounds;
    }
}
