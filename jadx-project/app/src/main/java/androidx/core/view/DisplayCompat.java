package androidx.core.view;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import androidx.core.util.Preconditions;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class DisplayCompat {
    private static final int DISPLAY_SIZE_4K_HEIGHT = 2160;
    private static final int DISPLAY_SIZE_4K_WIDTH = 3840;

    static class Api23Impl {
        private Api23Impl() {
        }

        static ModeCompat getMode(Context context, Display display) {
            Display.Mode currentMode = display.getMode();
            Point workaroundSize = DisplayCompat.getCurrentDisplaySizeFromWorkarounds(context, display);
            if (workaroundSize == null) goto L9;
            if (physicalSizeEquals(currentMode, workaroundSize) == true) goto L9;
            return new ModeCompat(currentMode, workaroundSize);
        L9:
            return new ModeCompat(currentMode, true);
        }

        public static ModeCompat[] getSupportedModes(Context context, Display display) {
            Display.Mode[] supportedModes = display.getSupportedModes();
            ModeCompat[] supportedModesCompat = new ModeCompat[supportedModes.length];
            Display.Mode currentMode = display.getMode();
            Point workaroundSize = DisplayCompat.getCurrentDisplaySizeFromWorkarounds(context, display);
            if (workaroundSize != null) goto L5;
        L15:
            int i = 0;
        L17:
            if (i >= supportedModes.length) goto L19;
            boolean isNative = physicalSizeEquals(supportedModes[i], currentMode);
            supportedModesCompat[i] = new ModeCompat(supportedModes[i], isNative);
            i = i + 1;
        L19:
            return supportedModesCompat;
        L5:
            if (physicalSizeEquals(currentMode, workaroundSize) == true) goto L15;
            int i2 = 0;
        L9:
            if (i2 >= supportedModes.length) goto L19;
            if (physicalSizeEquals(supportedModes[i2], currentMode) == false) goto L13;
            ModeCompat r5 = new ModeCompat(supportedModes[i2], workaroundSize);
        L14:
            supportedModesCompat[i2] = r5;
            i2 = i2 + 1;
            goto L9
        L13:
            r5 = new ModeCompat(supportedModes[i2], false);
            goto L14
        }

        static boolean isCurrentModeTheLargestMode(Display display) {
            Display.Mode currentMode = display.getMode();
            Display.Mode[] supportedModes = display.getSupportedModes();
            int r2 = supportedModes.length;
            int r4 = 0;
        L3:
            if (r4 >= r2) goto L11;
            Display.Mode supportedMode = supportedModes[r4];
            if (currentMode.getPhysicalHeight() < supportedMode.getPhysicalHeight()) goto L10;
            if (currentMode.getPhysicalWidth() < supportedMode.getPhysicalWidth()) goto L10;
            r4 = r4 + 1;
        L10:
            return false;
        L11:
            return true;
        }

        static boolean physicalSizeEquals(Display.Mode mode, Point size) {
            if (mode.getPhysicalWidth() != size.x) goto L7;
            if (mode.getPhysicalHeight() != size.y) goto L7;
        L10:
            return true;
        L7:
            if (mode.getPhysicalWidth() == size.y) goto L9;
        L11:
            return false;
        L9:
            if (mode.getPhysicalHeight() != size.x) goto L11;
            goto L10
        }

        static boolean physicalSizeEquals(Display.Mode mode, Display.Mode otherMode) {
            if (mode.getPhysicalWidth() == otherMode.getPhysicalWidth()) goto L5;
        L7:
            return false;
        L5:
            if (mode.getPhysicalHeight() != otherMode.getPhysicalHeight()) goto L7;
            return true;
        }
    }

    public static final class ModeCompat {
        private final boolean mIsNative;
        private final Display.Mode mMode;
        private final Point mPhysicalSize;

        static class Api23Impl {
            private Api23Impl() {
            }

            static int getPhysicalWidth(Display.Mode mode) {
                return mode.getPhysicalWidth();
            }

            static int getPhysicalHeight(Display.Mode mode) {
                return mode.getPhysicalHeight();
            }
        }

        ModeCompat(Point physicalSize) {
            Preconditions.checkNotNull(physicalSize, "physicalSize == null");
            this.mPhysicalSize = physicalSize;
            this.mMode = null;
            this.mIsNative = true;
        }

        ModeCompat(Display.Mode mode, boolean isNative) {
            Preconditions.checkNotNull(mode, "mode == null, can't wrap a null reference");
            this.mPhysicalSize = new Point(Api23Impl.getPhysicalWidth(mode), Api23Impl.getPhysicalHeight(mode));
            this.mMode = mode;
            this.mIsNative = isNative;
        }

        ModeCompat(Display.Mode mode, Point physicalSize) {
            Preconditions.checkNotNull(mode, "mode == null, can't wrap a null reference");
            Preconditions.checkNotNull(physicalSize, "physicalSize == null");
            this.mPhysicalSize = physicalSize;
            this.mMode = mode;
            this.mIsNative = true;
        }

        public int getPhysicalWidth() {
            return this.mPhysicalSize.x;
        }

        public int getPhysicalHeight() {
            return this.mPhysicalSize.y;
        }

        @Deprecated
        public boolean isNative() {
            return this.mIsNative;
        }

        public Display.Mode toMode() {
            return this.mMode;
        }
    }

    private DisplayCompat() {
    }

    public static ModeCompat getMode(Context context, Display display) {
        return Api23Impl.getMode(context, display);
    }

    private static Point getDisplaySize(Context context, Display display) {
        Point displaySize = getCurrentDisplaySizeFromWorkarounds(context, display);
        if (displaySize == null) goto L5;
        return displaySize;
    L5:
        Point displaySize2 = new Point();
        display.getRealSize(displaySize2);
        return displaySize2;
    }

    public static ModeCompat[] getSupportedModes(Context context, Display display) {
        return Api23Impl.getSupportedModes(context, display);
    }

    private static Point parseDisplaySize(String displaySize) throws NumberFormatException {
        String[] displaySizeParts = displaySize.trim().split("x", -1);
        if (displaySizeParts.length != 2) goto L10;
        int width = Integer.parseInt(displaySizeParts[0]);
        int height = Integer.parseInt(displaySizeParts[1]);
        if (width <= 0) goto L10;
        if (height <= 0) goto L10;
        return new Point(width, height);
    L10:
        throw new NumberFormatException();
    }

    private static String getSystemProperty(String name) {
        Class<?> systemProperties = Class.forName("android.os.SystemProperties");     // Catch: Exception -> L4
        Method getMethod = systemProperties.getMethod("get", new Class[]{String.class});     // Catch: Exception -> L4
        return (String) getMethod.invoke(systemProperties, new Object[]{name});
    L5:
        return null;
    }

    private static boolean isTv(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (uiModeManager != null) goto L5;
    L7:
        return false;
    L5:
        if (uiModeManager.getCurrentModeType() != 4) goto L7;
        return true;
    }

    private static Point parsePhysicalDisplaySizeFromSystemProperties(String property, Display display) {
        if (display.getDisplayId() == 0) goto L5;
        return null;
    L5:
        String displaySize = getSystemProperty(property);
        if (TextUtils.isEmpty(displaySize) == true) goto L13;
        if (displaySize == null) goto L13;
        return parseDisplaySize(displaySize);
    L12:
        return null;
    L13:
        return null;
    }

    static Point getCurrentDisplaySizeFromWorkarounds(Context context, Display display) {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        Point displaySize = parsePhysicalDisplaySizeFromSystemProperties("sys.display-size", display);
    L7:
        if (displaySize == null) goto L10;
        return displaySize;
    L10:
        if (isSonyBravia4kTv(context) == true) goto L12;
        return null;
    L12:
        if (isCurrentModeTheLargestMode(display) == true) goto L15;
        return null;
    L15:
        return new Point(DISPLAY_SIZE_4K_WIDTH, DISPLAY_SIZE_4K_HEIGHT);
    L5:
        displaySize = parsePhysicalDisplaySizeFromSystemProperties("vendor.display-size", display);
        goto L7
    }

    private static boolean isSonyBravia4kTv(Context context) {
        if (isTv(context) == true) goto L5;
    L11:
        return false;
    L5:
        if ("Sony".equals(Build.MANUFACTURER) == false) goto L11;
        if (Build.MODEL.startsWith("BRAVIA") == false) goto L11;
        if (context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd") == false) goto L11;
        return true;
    }

    static boolean isCurrentModeTheLargestMode(Display display) {
        return Api23Impl.isCurrentModeTheLargestMode(display);
    }
}
