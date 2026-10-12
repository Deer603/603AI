package androidx.core.view;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.annotation.ReplaceWith;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class VelocityTrackerCompat {
    private static Map<VelocityTracker, VelocityTrackerFallback> sFallbackTrackers;

    private static class Api34Impl {
        private Api34Impl() {
        }

        static boolean isAxisSupported(VelocityTracker velocityTracker, int axis) {
            return velocityTracker.isAxisSupported(axis);
        }

        static float getAxisVelocity(VelocityTracker velocityTracker, int axis, int id) {
            return velocityTracker.getAxisVelocity(axis, id);
        }

        static float getAxisVelocity(VelocityTracker velocityTracker, int axis) {
            return velocityTracker.getAxisVelocity(axis);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface VelocityTrackableMotionEventAxis {
    }

    static {
        sFallbackTrackers = Collections.synchronizedMap(new WeakHashMap());
    }

    @ReplaceWith(expression = "tracker.getXVelocity(pointerId)")
    @Deprecated
    public static float getXVelocity(VelocityTracker tracker, int pointerId) {
        return tracker.getXVelocity(pointerId);
    }

    @ReplaceWith(expression = "tracker.getYVelocity(pointerId)")
    @Deprecated
    public static float getYVelocity(VelocityTracker tracker, int pointerId) {
        return tracker.getYVelocity(pointerId);
    }

    public static boolean isAxisSupported(VelocityTracker tracker, int axis) {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return Api34Impl.isAxisSupported(tracker, axis);
    L7:
        if (axis == 26) goto L13;
        if (axis == 0) goto L14;
        if (axis == 1) goto L15;
        return false;
    L15:
        return true;
    L14:
        return true;
    L13:
        return true;
    }

    public static float getAxisVelocity(VelocityTracker tracker, int axis) {
        if (Build.VERSION.SDK_INT >= 34) goto L5;
        if (axis != 0) goto L10;
        return tracker.getXVelocity();
    L10:
        if (axis == 1) goto L12;
        VelocityTrackerFallback fallback = getFallbackTrackerOrNull(tracker);
        if (fallback != null) goto L16;
        return 0.0f;
    L16:
        return fallback.getAxisVelocity(axis);
    L12:
        return tracker.getYVelocity();
    L5:
        return Api34Impl.getAxisVelocity(tracker, axis);
    }

    public static float getAxisVelocity(VelocityTracker tracker, int axis, int pointerId) {
        if (Build.VERSION.SDK_INT >= 34) goto L5;
        if (axis != 0) goto L10;
        return tracker.getXVelocity(pointerId);
    L10:
        if (axis == 1) goto L12;
        return 0.0f;
    L12:
        return tracker.getYVelocity(pointerId);
    L5:
        return Api34Impl.getAxisVelocity(tracker, axis, pointerId);
    }

    public static void clear(VelocityTracker tracker) {
        tracker.clear();
        removeFallbackForTracker(tracker);
    }

    public static void recycle(VelocityTracker tracker) {
        tracker.recycle();
        removeFallbackForTracker(tracker);
    }

    public static void computeCurrentVelocity(VelocityTracker tracker, int units, float maxVelocity) {
        tracker.computeCurrentVelocity(units, maxVelocity);
        VelocityTrackerFallback fallback = getFallbackTrackerOrNull(tracker);
        if (fallback == null) goto L6;
        fallback.computeCurrentVelocity(units, maxVelocity);
        return;
    }

    public static void computeCurrentVelocity(VelocityTracker tracker, int units) {
        computeCurrentVelocity(tracker, units, Float.MAX_VALUE);
    }

    public static void addMovement(VelocityTracker tracker, MotionEvent event) {
        tracker.addMovement(event);
        if (Build.VERSION.SDK_INT < 34) goto L6;
        return;
    L6:
        if (event.getSource() == 4194304) goto L8;
        return;
    L8:
        if (sFallbackTrackers.containsKey(tracker) == true) goto L10;
        sFallbackTrackers.put(tracker, new VelocityTrackerFallback());
    L10:
        sFallbackTrackers.get(tracker).addMovement(event);
    }

    private static void removeFallbackForTracker(VelocityTracker tracker) {
        sFallbackTrackers.remove(tracker);
    }

    private static VelocityTrackerFallback getFallbackTrackerOrNull(VelocityTracker tracker) {
        return sFallbackTrackers.get(tracker);
    }

    private VelocityTrackerCompat() {
    }
}
