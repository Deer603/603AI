package androidx.core.view;

import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public final class HapticFeedbackConstantsCompat {
    public static final int CLOCK_TICK = 4;
    public static final int CONFIRM = 16;
    public static final int CONTEXT_CLICK = 6;
    public static final int DRAG_START = 25;
    static final int FIRST_CONSTANT_INT = 0;
    public static final int FLAG_IGNORE_VIEW_SETTING = 1;
    public static final int GESTURE_END = 13;
    public static final int GESTURE_START = 12;
    public static final int GESTURE_THRESHOLD_ACTIVATE = 23;
    public static final int GESTURE_THRESHOLD_DEACTIVATE = 24;
    public static final int KEYBOARD_PRESS = 3;
    public static final int KEYBOARD_RELEASE = 7;
    public static final int KEYBOARD_TAP = 3;
    static final int LAST_CONSTANT_INT = 27;
    public static final int LONG_PRESS = 0;
    public static final int NO_HAPTICS = -1;
    public static final int REJECT = 17;
    public static final int SEGMENT_FREQUENT_TICK = 27;
    public static final int SEGMENT_TICK = 26;
    public static final int TEXT_HANDLE_MOVE = 9;
    public static final int TOGGLE_OFF = 22;
    public static final int TOGGLE_ON = 21;
    public static final int VIRTUAL_KEY = 1;
    public static final int VIRTUAL_KEY_RELEASE = 8;

    @Retention(RetentionPolicy.SOURCE)
    public @interface HapticFeedbackFlags {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface HapticFeedbackType {
    }

    static int getFeedbackConstantOrFallback(int feedbackConstant) {
        if (feedbackConstant != (-1)) goto L6;
        return -1;
    L6:
        if (Build.VERSION.SDK_INT >= 34) goto L13;
        switch(feedbackConstant) {
            case 21: goto L11;
            case 22: goto L10;
            case 23: goto L11;
            case 24: goto L10;
            case 25: goto L9;
            case 26: goto L11;
            case 27: goto L10;
            default: goto L13;
        };
    L9:
        feedbackConstant = 0;
        goto L13
    L10:
        feedbackConstant = 4;
        goto L13
    L11:
        feedbackConstant = 6;
    L13:
        if (Build.VERSION.SDK_INT >= 30) goto L20;
        switch(feedbackConstant) {
            case 12: goto L18;
            case 13: goto L17;
            case 14: goto L20;
            case 15: goto L20;
            case 16: goto L18;
            case 17: goto L16;
            default: goto L20;
        };
    L16:
        feedbackConstant = 0;
        goto L20
    L17:
        feedbackConstant = 6;
        goto L20
    L18:
        feedbackConstant = 1;
    L20:
        if (Build.VERSION.SDK_INT >= 27) goto L26;
        switch(feedbackConstant) {
            case 7: goto L23;
            case 8: goto L23;
            case 9: goto L23;
            default: goto L27;
        };
    L23:
        return -1;
    L27:
        return feedbackConstant;
    L26:
        return feedbackConstant;
    }

    private HapticFeedbackConstantsCompat() {
    }
}
