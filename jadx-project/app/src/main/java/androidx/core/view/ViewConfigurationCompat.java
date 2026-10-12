package androidx.core.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import androidx.annotation.ReplaceWith;
import androidx.core.util.Supplier;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewConfigurationCompat {
    private static final int NO_FLING_MAX_VELOCITY = Integer.MIN_VALUE;
    private static final int NO_FLING_MIN_VELOCITY = Integer.MAX_VALUE;
    private static final int RESOURCE_ID_NOT_SUPPORTED = -1;
    private static final int RESOURCE_ID_SUPPORTED_BUT_NOT_FOUND = 0;
    private static final String TAG = "ViewConfigCompat";
    private static Method sGetScaledScrollFactorMethod;

    static class Api26Impl {
        private Api26Impl() {
        }

        static float getScaledHorizontalScrollFactor(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        static float getScaledVerticalScrollFactor(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static int getScaledHoverSlop(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        static boolean shouldShowMenuShortcutsWhenKeyboardPresent(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    static class Api34Impl {
        private Api34Impl() {
        }

        static int getScaledMaximumFlingVelocity(ViewConfiguration viewConfiguration, int inputDeviceId, int axis, int source) {
            return viewConfiguration.getScaledMaximumFlingVelocity(inputDeviceId, axis, source);
        }

        static int getScaledMinimumFlingVelocity(ViewConfiguration viewConfiguration, int inputDeviceId, int axis, int source) {
            return viewConfiguration.getScaledMinimumFlingVelocity(inputDeviceId, axis, source);
        }
    }

    public static /* synthetic */ int $r8$lambda$DUnOdzWd_GMixRu8Q8mhfglZyiM(ViewConfiguration r0) {
        return r0.getScaledMinimumFlingVelocity();
    }

    public static /* synthetic */ int $r8$lambda$u_xUdJpIAAO3758SdHprtx7JUP0(ViewConfiguration r0) {
        return r0.getScaledMaximumFlingVelocity();
    }

    static {
    }

    @ReplaceWith(expression = "config.getScaledPagingTouchSlop()")
    @Deprecated
    public static int getScaledPagingTouchSlop(ViewConfiguration config) {
        return config.getScaledPagingTouchSlop();
    }

    @ReplaceWith(expression = "config.hasPermanentMenuKey()")
    @Deprecated
    public static boolean hasPermanentMenuKey(ViewConfiguration config) {
        return config.hasPermanentMenuKey();
    }

    public static float getScaledHorizontalScrollFactor(ViewConfiguration config, Context context) {
        return Api26Impl.getScaledHorizontalScrollFactor(config);
    }

    public static float getScaledVerticalScrollFactor(ViewConfiguration config, Context context) {
        return Api26Impl.getScaledVerticalScrollFactor(config);
    }

    private static float getLegacyScrollFactor(ViewConfiguration config, Context context) {
        if (sGetScaledScrollFactorMethod != null) goto L15;
    L9:
        TypedValue outValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, outValue, true) == true) goto L12;
        return 0.0f;
    L12:
        return outValue.getDimension(context.getResources().getDisplayMetrics());
    L15:
        return ((Integer) sGetScaledScrollFactorMethod.invoke(config, new Object[0])).intValue();
    L8:
        Log.i(TAG, "Could not find method getScaledScrollFactor() on ViewConfiguration");
        goto L9
    }

    public static int getScaledHoverSlop(ViewConfiguration config) {
        if (Build.VERSION.SDK_INT < 28) goto L7;
        return Api28Impl.getScaledHoverSlop(config);
    L7:
        return config.getScaledTouchSlop() / 2;
    }

    public static boolean shouldShowMenuShortcutsWhenKeyboardPresent(ViewConfiguration config, Context context) {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        Resources res = context.getResources();
        int platformResId = getPlatformResId(res, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        if (platformResId != 0) goto L9;
    L11:
        return false;
    L9:
        if (res.getBoolean(platformResId) == false) goto L11;
        return true;
    L5:
        return Api28Impl.shouldShowMenuShortcutsWhenKeyboardPresent(config);
    }

    public static int getScaledMinimumFlingVelocity(Context context, final ViewConfiguration config, int inputDeviceId, int axis, int source) {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return Api34Impl.getScaledMinimumFlingVelocity(config, inputDeviceId, axis, source);
    L7:
        if (isInputDeviceInfoValid(inputDeviceId, axis, source) == true) goto L9;
        return Integer.MAX_VALUE;
    L9:
        Resources res = context.getResources();
        int r2 = getPreApi34MinimumFlingVelocityResId(res, source, axis);
        Objects.requireNonNull(config);
        return getCompatFlingVelocityThreshold(res, r2, new ViewConfigurationCompat$$ExternalSyntheticLambda1(config), Integer.MAX_VALUE);
    }

    public static int getScaledMaximumFlingVelocity(Context context, final ViewConfiguration config, int inputDeviceId, int axis, int source) {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return Api34Impl.getScaledMaximumFlingVelocity(config, inputDeviceId, axis, source);
    L7:
        if (isInputDeviceInfoValid(inputDeviceId, axis, source) == true) goto L9;
        return Integer.MIN_VALUE;
    L9:
        Resources res = context.getResources();
        int r2 = getPreApi34MaximumFlingVelocityResId(res, source, axis);
        Objects.requireNonNull(config);
        return getCompatFlingVelocityThreshold(res, r2, new ViewConfigurationCompat$$ExternalSyntheticLambda0(config), Integer.MIN_VALUE);
    }

    private ViewConfigurationCompat() {
    }

    private static int getPreApi34MaximumFlingVelocityResId(Resources res, int source, int axis) {
        if (source == 4194304) goto L5;
        return -1;
    L5:
        if (axis == 26) goto L7;
        return -1;
    L7:
        return getPlatformResId(res, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
    }

    private static int getPreApi34MinimumFlingVelocityResId(Resources res, int source, int axis) {
        if (source == 4194304) goto L5;
        return -1;
    L5:
        if (axis == 26) goto L7;
        return -1;
    L7:
        return getPlatformResId(res, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
    }

    private static int getPlatformResId(Resources res, String name, String defType) {
        return res.getIdentifier(name, defType, "android");
    }

    private static boolean isInputDeviceInfoValid(int id, int axis, int source) {
        InputDevice device = InputDevice.getDevice(id);
        if (device != null) goto L5;
    L7:
        return false;
    L5:
        if (device.getMotionRange(axis, source) == null) goto L7;
        return true;
    }

    private static int getCompatFlingVelocityThreshold(Resources res, int platformResId, Supplier<Integer> defaultThresholdSupplier, int noFlingThreshold) {
        switch(platformResId) {
            case -1: goto L8;
            case 0: goto L6;
            default: goto L3;
        };
    L3:
        int threshold = res.getDimensionPixelSize(platformResId);
        if (threshold >= 0) goto L10;
        return noFlingThreshold;
    L10:
        return threshold;
    L6:
        return noFlingThreshold;
    L8:
        return defaultThresholdSupplier.get().intValue();
    }
}
