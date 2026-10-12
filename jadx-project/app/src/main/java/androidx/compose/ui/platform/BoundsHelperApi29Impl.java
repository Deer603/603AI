package androidx.compose.ui.platform;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidWindowInfo.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/BoundsHelperApi29Impl;", "Landroidx/compose/ui/platform/BoundsHelper;", "()V", "currentWindowBounds", "Landroid/graphics/Rect;", "activity", "Landroid/app/Activity;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class BoundsHelperApi29Impl implements BoundsHelper {
    public static final BoundsHelperApi29Impl INSTANCE = null;

    static {
        INSTANCE = new BoundsHelperApi29Impl();
    }

    private BoundsHelperApi29Impl() {
    }

    @Override // androidx.compose.ui.platform.BoundsHelper
    public Rect currentWindowBounds(Activity activity) {
        Configuration config = activity.getResources().getConfiguration();
        boolean r2 = true;
        Field windowConfigField = Configuration.class.getDeclaredField("windowConfiguration");     // Catch: Exception -> L5
        windowConfigField.setAccessible(true);     // Catch: Exception -> L5
        Object windowConfig = windowConfigField.get(config);     // Catch: Exception -> L5
        Method getBoundsMethod = windowConfig.getClass().getDeclaredMethod("getBounds", new Class[0]);     // Catch: Exception -> L5
        Object r7 = getBoundsMethod.invoke(windowConfig, new Object[0]);     // Catch: Exception -> L5
        Intrinsics.checkNotNull(r7, "null cannot be cast to non-null type android.graphics.Rect");     // Catch: Exception -> L5
        Rect bounds = new Rect((Rect) r7);     // Catch: Exception -> L5
        return bounds;
    L5:
        e = move-exception;
        if ((e instanceof NoSuchFieldException) == false) goto L9;
        boolean r4 = true;
    L10:
        if (r4 == false) goto L12;
        boolean r5 = true;
    L13:
        if (r5 == true) goto L16;
        r2 = e instanceof InvocationTargetException;
    L16:
        if (r2 == false) goto L19;
        Rect bounds2 = BoundsHelperApi28Impl.INSTANCE.currentWindowBounds(activity);
        return bounds2;
    L19:
        throw e;
    L12:
        r5 = e instanceof IllegalAccessException;
        goto L13
    L9:
        r4 = e instanceof NoSuchMethodException;
        goto L10
    }
}
