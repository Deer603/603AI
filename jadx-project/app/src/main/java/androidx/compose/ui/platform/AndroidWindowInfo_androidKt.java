package androidx.compose.ui.platform;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.compose.ui.unit.IntSize;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidWindowInfo.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¢\u0006\u0002\u0010\u0004\u001a\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0010*\u00020\fH\u0082\u0010¨\u0006\u0014"}, d2 = {"calculateWindowSize", "Landroidx/compose/ui/unit/IntSize;", "androidComposeView", "Landroidx/compose/ui/platform/AndroidComposeView;", "(Landroidx/compose/ui/platform/AndroidComposeView;)J", "getCutoutForDisplay", "Landroid/view/DisplayCutout;", "display", "Landroid/view/Display;", "getNavigationBarHeight", "", "context", "Landroid/content/Context;", "getRectSizeFromDisplay", "", "activity", "Landroid/app/Activity;", "bounds", "Landroid/graphics/Rect;", "findActivity", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidWindowInfo_androidKt {
    public static final /* synthetic */ DisplayCutout access$getCutoutForDisplay(Display display) {
        return getCutoutForDisplay(display);
    }

    public static final /* synthetic */ int access$getNavigationBarHeight(Context context) {
        return getNavigationBarHeight(context);
    }

    public static final /* synthetic */ void access$getRectSizeFromDisplay(Activity activity, Rect bounds) {
        getRectSizeFromDisplay(activity, bounds);
    }

    public static final long calculateWindowSize(AndroidComposeView androidComposeView) {
        Context context = androidComposeView.getContext();
        Activity activity = findActivity(context);
        if (activity == null) goto L6;
        Rect bounds = BoundsHelper.Companion.getInstance().currentWindowBounds(activity);
        int width$iv = bounds.width();
        int height$iv = bounds.height();
        return IntSize.m7139constructorimpl((4294967295L & ((long) height$iv)) | (((long) width$iv) << 32));
    L6:
        Configuration configuration = context.getResources().getConfiguration();
        float density = context.getResources().getDisplayMetrics().density;
        float $this$fastRoundToInt$iv = configuration.screenWidthDp * density;
        int width = Math.round($this$fastRoundToInt$iv);
        float $this$fastRoundToInt$iv2 = configuration.screenHeightDp * density;
        int height = Math.round($this$fastRoundToInt$iv2);
        return IntSize.m7139constructorimpl((4294967295L & ((long) height)) | (((long) width) << 32));
    }

    private static final Activity findActivity(Context $this$findActivity) {
    L3:
        if (($this$findActivity instanceof Activity) == true) goto L12;
        if (($this$findActivity instanceof ContextWrapper) == false) goto L8;
        $this$findActivity = ((ContextWrapper) $this$findActivity).getBaseContext();
        goto L3
    L8:
        return null;
    L12:
        return (Activity) $this$findActivity;
    }

    private static final int getNavigationBarHeight(Context context) {
        Resources resources = context.getResources();
        int resourceId = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (resourceId > 0) goto L7;
        return 0;
    L7:
        return resources.getDimensionPixelSize(resourceId);
    }

    private static final void getRectSizeFromDisplay(Activity activity, Rect bounds) {
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(bounds);
    }

    private static final DisplayCutout getCutoutForDisplay(Display display) {
        boolean r1 = true;
        Constructor<?> r4 = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);     // Catch: Exception -> L7
        r4.setAccessible(true);     // Catch: Exception -> L7
        Object displayInfo = r4.newInstance(new Object[0]);     // Catch: Exception -> L7
        Method getDisplayInfoMethod = display.getClass().getDeclaredMethod("getDisplayInfo", new Class[]{displayInfo.getClass()});     // Catch: Exception -> L7
        getDisplayInfoMethod.setAccessible(true);     // Catch: Exception -> L7
        getDisplayInfoMethod.invoke(display, new Object[]{displayInfo});     // Catch: Exception -> L7
        Field displayCutoutField = displayInfo.getClass().getDeclaredField("displayCutout");     // Catch: Exception -> L7
        displayCutoutField.setAccessible(true);     // Catch: Exception -> L7
        Object cutout = displayCutoutField.get(displayInfo);     // Catch: Exception -> L7
        if ((cutout instanceof DisplayCutout) == false) goto L25;
        DisplayCutout displayCutout = (DisplayCutout) cutout;     // Catch: Exception -> L7
        return displayCutout;
    L25:
        return null;
    L7:
        e = move-exception;
        if ((e instanceof ClassNotFoundException) == false) goto L11;
        boolean r3 = true;
    L12:
        if (r3 == false) goto L14;
        boolean r5 = true;
    L15:
        if (r5 == false) goto L17;
        boolean r6 = true;
    L18:
        if (r6 == false) goto L20;
        boolean r7 = true;
    L21:
        if (r7 == true) goto L24;
        r1 = e instanceof InstantiationException;
    L24:
        if (r1 == true) goto L30;
        throw e;
    L30:
        return null;
    L20:
        r7 = e instanceof InvocationTargetException;
        goto L21
    L17:
        r6 = e instanceof IllegalAccessException;
        goto L18
    L14:
        r5 = e instanceof NoSuchFieldException;
        goto L15
    L11:
        r3 = e instanceof NoSuchMethodException;
        goto L12
    }
}
