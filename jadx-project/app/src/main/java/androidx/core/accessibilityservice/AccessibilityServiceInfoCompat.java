package androidx.core.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import androidx.annotation.ReplaceWith;

/* JADX INFO: loaded from: classes4.dex */
public final class AccessibilityServiceInfoCompat {
    public static final int CAPABILITY_CAN_FILTER_KEY_EVENTS = 8;
    public static final int CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 4;
    public static final int CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION = 2;
    public static final int CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT = 1;
    public static final int FEEDBACK_ALL_MASK = -1;
    public static final int FEEDBACK_BRAILLE = 32;
    public static final int FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = 2;
    public static final int FLAG_REPORT_VIEW_IDS = 16;
    public static final int FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 8;
    public static final int FLAG_REQUEST_FILTER_KEY_EVENTS = 32;
    public static final int FLAG_REQUEST_TOUCH_EXPLORATION_MODE = 4;

    private AccessibilityServiceInfoCompat() {
    }

    @ReplaceWith(expression = "info.loadDescription(packageManager)")
    @Deprecated
    public static String loadDescription(AccessibilityServiceInfo info, PackageManager packageManager) {
        return info.loadDescription(packageManager);
    }

    public static String feedbackTypeToString(int feedbackType) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
    L3:
        if (feedbackType <= 0) goto L15;
        int feedbackTypeFlag = 1 << Integer.numberOfTrailingZeros(feedbackType);
        feedbackType = feedbackType & (~feedbackTypeFlag);
        if (builder.length() <= 1) goto L7;
        builder.append(", ");
    L7:
        switch(feedbackTypeFlag) {
            case 1: goto L13;
            case 2: goto L12;
            case 4: goto L11;
            case 8: goto L10;
            case 16: goto L9;
            default: goto L3;
        };
    L9:
        builder.append("FEEDBACK_GENERIC");
        goto L3
    L10:
        builder.append("FEEDBACK_VISUAL");
        goto L3
    L11:
        builder.append("FEEDBACK_AUDIBLE");
        goto L3
    L12:
        builder.append("FEEDBACK_HAPTIC");
        goto L3
    L13:
        builder.append("FEEDBACK_SPOKEN");
        goto L3
    L15:
        builder.append("]");
        return builder.toString();
    }

    public static String flagToString(int flag) {
        switch(flag) {
            case 1: goto L15;
            case 2: goto L13;
            case 4: goto L11;
            case 8: goto L9;
            case 16: goto L7;
            case 32: goto L5;
            default: goto L3;
        };
    L3:
        return null;
    L5:
        return "FLAG_REQUEST_FILTER_KEY_EVENTS";
    L7:
        return "FLAG_REPORT_VIEW_IDS";
    L9:
        return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
    L11:
        return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
    L13:
        return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
    L15:
        return "DEFAULT";
    }

    @ReplaceWith(expression = "info.getCapabilities()")
    @Deprecated
    public static int getCapabilities(AccessibilityServiceInfo info) {
        return info.getCapabilities();
    }

    public static String capabilityToString(int capability) {
        switch(capability) {
            case 1: goto L11;
            case 2: goto L9;
            case 4: goto L7;
            case 8: goto L5;
            default: goto L3;
        };
    L3:
        return "UNKNOWN";
    L5:
        return "CAPABILITY_CAN_FILTER_KEY_EVENTS";
    L7:
        return "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
    L9:
        return "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION";
    L11:
        return "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
    }
}
