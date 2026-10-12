package androidx.compose.ui.platform;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidWindowInfo.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/BoundsHelperApi28Impl;", "Landroidx/compose/ui/platform/BoundsHelper;", "()V", "currentWindowBounds", "Landroid/graphics/Rect;", "activity", "Landroid/app/Activity;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class BoundsHelperApi28Impl implements BoundsHelper {
    public static final BoundsHelperApi28Impl INSTANCE = null;

    static {
        INSTANCE = new BoundsHelperApi28Impl();
    }

    private BoundsHelperApi28Impl() {
    }

    @Override // androidx.compose.ui.platform.BoundsHelper
    public Rect currentWindowBounds(Activity activity) {
        Rect bounds = new Rect();
        Configuration config = activity.getResources().getConfiguration();
        boolean r2 = true;
        Field windowConfigField = Configuration.class.getDeclaredField("windowConfiguration");     // Catch: Exception -> L9
        windowConfigField.setAccessible(true);     // Catch: Exception -> L9
        Object windowConfig = windowConfigField.get(config);     // Catch: Exception -> L9
        if (activity.isInMultiWindowMode() == false) goto L7;
        Method getAppBounds = windowConfig.getClass().getDeclaredMethod("getBounds", new Class[0]);     // Catch: Exception -> L9
        Object r8 = getAppBounds.invoke(windowConfig, new Object[0]);     // Catch: Exception -> L9
        Intrinsics.checkNotNull(r8, "null cannot be cast to non-null type android.graphics.Rect");     // Catch: Exception -> L9
        bounds.set((Rect) r8);     // Catch: Exception -> L9
    L55:
    L22:
        WindowManager platformWindowManager = activity.getWindowManager();
        Display currentDisplay = platformWindowManager.getDefaultDisplay();
        Point realDisplaySize = new Point();
        currentDisplay.getRealSize(realDisplaySize);
        if (activity.isInMultiWindowMode() == true) goto L34;
        int navigationBarHeight = AndroidWindowInfo_androidKt.access$getNavigationBarHeight(activity);
        if ((bounds.bottom + navigationBarHeight) != realDisplaySize.y) goto L28;
        bounds.bottom += navigationBarHeight;
        goto L34
    L28:
        if ((bounds.right + navigationBarHeight) != realDisplaySize.x) goto L31;
        bounds.right += navigationBarHeight;
        goto L34
    L31:
        if (bounds.left != navigationBarHeight) goto L34;
        bounds.left = 0;
    L34:
        if (bounds.width() < realDisplaySize.x) goto L38;
        if (bounds.height() < realDisplaySize.y) goto L38;
    L53:
        return bounds;
    L38:
        if (activity.isInMultiWindowMode() == true) goto L53;
        DisplayCutout displayCutout = AndroidWindowInfo_androidKt.access$getCutoutForDisplay(currentDisplay);
        if (displayCutout == null) goto L53;
        if (bounds.left != displayCutout.getSafeInsetLeft()) goto L45;
        bounds.left = 0;
    L45:
        if ((realDisplaySize.x - bounds.right) != displayCutout.getSafeInsetRight()) goto L48;
        bounds.right += displayCutout.getSafeInsetRight();
    L48:
        if (bounds.top != displayCutout.getSafeInsetTop()) goto L51;
        bounds.top = 0;
    L51:
        if ((realDisplaySize.y - bounds.bottom) != displayCutout.getSafeInsetBottom()) goto L53;
        bounds.bottom += displayCutout.getSafeInsetBottom();
        goto L53
    L7:
        Method getAppBounds2 = windowConfig.getClass().getDeclaredMethod("getAppBounds", new Class[0]);     // Catch: Exception -> L9
        Object r9 = getAppBounds2.invoke(windowConfig, new Object[0]);     // Catch: Exception -> L9
        Intrinsics.checkNotNull(r9, "null cannot be cast to non-null type android.graphics.Rect");     // Catch: Exception -> L9
        bounds.set((Rect) r9);     // Catch: Exception -> L9
    L9:
        e = move-exception;
        if ((e instanceof NoSuchFieldException) == false) goto L13;
        boolean r5 = true;
    L14:
        if (r5 == false) goto L16;
        boolean r6 = true;
    L17:
        if (r6 == true) goto L20;
        r2 = e instanceof InvocationTargetException;
    L20:
        if (r2 == false) goto L54;
        AndroidWindowInfo_androidKt.access$getRectSizeFromDisplay(activity, bounds);
        goto L22
    L54:
        throw e;
    L16:
        r6 = e instanceof IllegalAccessException;
        goto L17
    L13:
        r5 = e instanceof NoSuchMethodException;
        goto L14
    }
}
