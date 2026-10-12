package androidx.core.util;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class Preconditions {
    public static void checkArgument(boolean expression) {
        if (expression == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException();
    }

    public static void checkArgument(boolean expression, Object errorMessage) {
        if (expression == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(String.valueOf(errorMessage));
    }

    public static void checkArgument(boolean expression, String messageTemplate, Object... messageArgs) {
        if (expression == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(String.format(messageTemplate, messageArgs));
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T string) {
        if (TextUtils.isEmpty(string) == true) goto L6;
        return string;
    L6:
        throw new IllegalArgumentException();
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T string, Object errorMessage) {
        if (TextUtils.isEmpty(string) == true) goto L6;
        return string;
    L6:
        throw new IllegalArgumentException(String.valueOf(errorMessage));
    }

    public static <T extends CharSequence> T checkStringNotEmpty(T string, String messageTemplate, Object... messageArgs) {
        if (TextUtils.isEmpty(string) == true) goto L6;
        return string;
    L6:
        throw new IllegalArgumentException(String.format(messageTemplate, messageArgs));
    }

    public static <T> T checkNotNull(T reference) {
        if (reference == null) goto L5;
        return reference;
    L5:
        throw new NullPointerException();
    }

    public static <T> T checkNotNull(T reference, Object errorMessage) {
        if (reference == null) goto L5;
        return reference;
    L5:
        throw new NullPointerException(String.valueOf(errorMessage));
    }

    public static void checkState(boolean expression, String message) {
        if (expression == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(message);
    }

    public static void checkState(boolean expression) {
        checkState(expression, null);
    }

    public static int checkFlagsArgument(int requestedFlags, int allowedFlags) {
        if ((requestedFlags & allowedFlags) != requestedFlags) goto L6;
        return requestedFlags;
    L6:
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(requestedFlags) + ", but only 0x" + Integer.toHexString(allowedFlags) + " are allowed");
    }

    public static int checkArgumentNonnegative(int value, String errorMessage) {
        if (value < 0) goto L5;
        return value;
    L5:
        throw new IllegalArgumentException(errorMessage);
    }

    public static int checkArgumentNonnegative(int value) {
        if (value < 0) goto L5;
        return value;
    L5:
        throw new IllegalArgumentException();
    }

    public static int checkArgumentInRange(int value, int lower, int upper, String valueName) {
        if (value < lower) goto L8;
        if (value > upper) goto L6;
        return value;
    L6:
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{valueName, Integer.valueOf(lower), Integer.valueOf(upper)}));
    L8:
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{valueName, Integer.valueOf(lower), Integer.valueOf(upper)}));
    }

    public static long checkArgumentInRange(long value, long lower, long upper, String valueName) {
        if (value < lower) goto L10;
        if (value > upper) goto L8;
        return value;
    L8:
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{valueName, Long.valueOf(lower), Long.valueOf(upper)}));
    L10:
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{valueName, Long.valueOf(lower), Long.valueOf(upper)}));
    }

    public static float checkArgumentInRange(float value, float lower, float upper, String valueName) {
        if (value < lower) goto L10;
        if (value > upper) goto L8;
        return value;
    L8:
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", new Object[]{valueName, Float.valueOf(lower), Float.valueOf(upper)}));
    L10:
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", new Object[]{valueName, Float.valueOf(lower), Float.valueOf(upper)}));
    }

    public static double checkArgumentInRange(double value, double lower, double upper, String valueName) {
        if (value < lower) goto L10;
        if (value > upper) goto L8;
        return value;
    L8:
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", new Object[]{valueName, Double.valueOf(lower), Double.valueOf(upper)}));
    L10:
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", new Object[]{valueName, Double.valueOf(lower), Double.valueOf(upper)}));
    }

    public static float checkArgumentFinite(float value, String valueName) {
        if (Float.isNaN(value) == true) goto L10;
        if (Float.isInfinite(value) == true) goto L8;
        return value;
    L8:
        throw new IllegalArgumentException(valueName + " must not be infinite");
    L10:
        throw new IllegalArgumentException(valueName + " must not be NaN");
    }

    private Preconditions() {
    }
}
