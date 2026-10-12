package androidx.core.hardware.display;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class DisplayManagerCompat {
    static final String DISPLAY_CATEGORY_ALL = "android.hardware.display.category.ALL_INCLUDING_DISABLED";
    public static final String DISPLAY_CATEGORY_BUILT_IN_DISPLAYS = "android.hardware.display.category.BUILT_IN_DISPLAYS";
    public static final String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    static final int DISPLAY_TYPE_INTERNAL = 1;
    private final Context mContext;

    private DisplayManagerCompat(Context context) {
        this.mContext = context;
    }

    public static DisplayManagerCompat getInstance(Context context) {
        return new DisplayManagerCompat(context);
    }

    public Display getDisplay(int displayId) {
        DisplayManager displayManager = (DisplayManager) this.mContext.getSystemService("display");
        return displayManager.getDisplay(displayId);
    }

    public Display[] getDisplays() {
        return ((DisplayManager) this.mContext.getSystemService("display")).getDisplays();
    }

    public Display[] getDisplays(String category) {
        DisplayManager displayManager = (DisplayManager) this.mContext.getSystemService("display");
        if (DISPLAY_CATEGORY_BUILT_IN_DISPLAYS.equals(category) == false) goto L7;
        return computeBuiltInDisplays(displayManager);
    L7:
        return ((DisplayManager) this.mContext.getSystemService("display")).getDisplays(category);
    }

    private static Display[] computeBuiltInDisplays(DisplayManager displayManager) {
        if (Build.VERSION.SDK_INT < 32) goto L5;
        Display[] allDisplays = displayManager.getDisplays(DISPLAY_CATEGORY_ALL);
    L6:
        int numberOfBuiltInDisplays = numberOfDisplaysByType(1, allDisplays);
        Display[] builtInDisplays = new Display[numberOfBuiltInDisplays];
        int builtInDisplayIndex = 0;
        int i = 0;
    L8:
        if (i >= allDisplays.length) goto L13;
        Display display = allDisplays[i];
        if (1 != getTypeCompat(display)) goto L12;
        builtInDisplays[builtInDisplayIndex] = display;
        builtInDisplayIndex = builtInDisplayIndex + 1;
    L12:
        i = i + 1;
        goto L8
    L13:
        return builtInDisplays;
    L5:
        allDisplays = displayManager.getDisplays();
        goto L6
    }

    private static int numberOfDisplaysByType(int type, Display[] displays) {
        int count = 0;
        int i = 0;
    L4:
        if (i >= displays.length) goto L9;
        Display display = displays[i];
        if (type != getTypeCompat(display)) goto L8;
        count = count + 1;
    L8:
        i = i + 1;
        goto L4
    L9:
        return count;
    }

    static int getTypeCompat(Display display) {
        return ((Integer) Objects.requireNonNull(Display.class.getMethod("getType", new Class[0]).invoke(display, new Object[0]))).intValue();
    L5:
        exception = move-exception;
        throw new RuntimeException(exception);
    L9:
        return 0;
    }
}
