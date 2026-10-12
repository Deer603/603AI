package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.Window;
import androidx.compose.animation.core.AnimationKt;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class FrameMetricsAggregator {
    public static final int ANIMATION_DURATION = 256;
    public static final int ANIMATION_INDEX = 8;
    public static final int COMMAND_DURATION = 32;
    public static final int COMMAND_INDEX = 5;
    public static final int DELAY_DURATION = 128;
    public static final int DELAY_INDEX = 7;
    public static final int DRAW_DURATION = 8;
    public static final int DRAW_INDEX = 3;
    public static final int EVERY_DURATION = 511;
    public static final int INPUT_DURATION = 2;
    public static final int INPUT_INDEX = 1;
    private static final int LAST_INDEX = 8;
    public static final int LAYOUT_MEASURE_DURATION = 4;
    public static final int LAYOUT_MEASURE_INDEX = 2;
    public static final int SWAP_DURATION = 64;
    public static final int SWAP_INDEX = 6;
    public static final int SYNC_DURATION = 16;
    public static final int SYNC_INDEX = 4;
    public static final int TOTAL_DURATION = 1;
    public static final int TOTAL_INDEX = 0;
    private final FrameMetricsBaseImpl mInstance;

    private static class FrameMetricsApi24Impl extends FrameMetricsBaseImpl {
        private static final int NANOS_PER_MS = 1000000;
        private static final int NANOS_ROUNDING_VALUE = 500000;
        private static Handler sHandler;
        private static HandlerThread sHandlerThread;
        private final ArrayList<WeakReference<Activity>> mActivities;
        Window.OnFrameMetricsAvailableListener mListener;
        SparseIntArray[] mMetrics;
        int mTrackingFlags;

        static {
            sHandlerThread = null;
            sHandler = null;
        }

        FrameMetricsApi24Impl(int trackingFlags) {
            this.mMetrics = new SparseIntArray[9];
            this.mActivities = new ArrayList();
            this.mListener = new AnonymousClass1(this);
            this.mTrackingFlags = trackingFlags;
        }

        void addDurationItem(SparseIntArray buckets, long duration) {
            if (buckets == null) goto L7;
            int durationMs = (int) ((500000 + duration) / AnimationKt.MillisToNanos);
            if (duration < 0) goto L8;
            int oldValue = buckets.get(durationMs);
            buckets.put(durationMs, oldValue + 1);
            return;
        L8:
            return;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public void add(Activity activity) {
            if (sHandlerThread != null) goto L5;
            sHandlerThread = new HandlerThread("FrameMetricsAggregator");
            sHandlerThread.start();
            sHandler = new Handler(sHandlerThread.getLooper());
        L5:
            int i = 0;
        L7:
            if (i > 8) goto L14;
            if (this.mMetrics[i] != null) goto L13;
            if ((this.mTrackingFlags & (1 << i)) == 0) goto L13;
            this.mMetrics[i] = new SparseIntArray();
        L13:
            i = i + 1;
            goto L7
        L14:
            activity.getWindow().addOnFrameMetricsAvailableListener(this.mListener, sHandler);
            this.mActivities.add(new WeakReference(activity));
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public SparseIntArray[] remove(Activity activity) {
            Iterator<WeakReference<Activity>> r0 = this.mActivities.iterator();
        L4:
            if (r0.hasNext() == false) goto L9;
            WeakReference<Activity> activityRef = r0.next();
            if (activityRef.get() != activity) goto L4;
            this.mActivities.remove(activityRef);
        L9:
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.mListener);
            return this.mMetrics;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public SparseIntArray[] stop() {
            int size = this.mActivities.size();
            int i = size - 1;
        L3:
            if (i < 0) goto L9;
            WeakReference<Activity> ref = this.mActivities.get(i);
            Activity activity = ref.get();
            if (ref.get() == null) goto L7;
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.mListener);
            this.mActivities.remove(i);
        L7:
            i = i - 1;
            goto L3
        L9:
            return this.mMetrics;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public SparseIntArray[] getMetrics() {
            return this.mMetrics;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public SparseIntArray[] reset() {
            SparseIntArray[] returnVal = this.mMetrics;
            this.mMetrics = new SparseIntArray[9];
            return returnVal;
        }
    }

    private static class FrameMetricsBaseImpl {
        FrameMetricsBaseImpl() {
        }

        public void add(Activity activity) {
        }

        public SparseIntArray[] remove(Activity activity) {
            return null;
        }

        public SparseIntArray[] stop() {
            return null;
        }

        public SparseIntArray[] getMetrics() {
            return null;
        }

        public SparseIntArray[] reset() {
            return null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MetricType {
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    public FrameMetricsAggregator(int metricTypeFlags) {
        this.mInstance = new FrameMetricsApi24Impl(metricTypeFlags);
    }

    public void add(Activity activity) {
        this.mInstance.add(activity);
    }

    public SparseIntArray[] remove(Activity activity) {
        return this.mInstance.remove(activity);
    }

    public SparseIntArray[] stop() {
        return this.mInstance.stop();
    }

    public SparseIntArray[] reset() {
        return this.mInstance.reset();
    }

    public SparseIntArray[] getMetrics() {
        return this.mInstance.getMetrics();
    }
}
