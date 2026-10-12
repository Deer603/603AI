package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes4.dex */
public class DifferentialMotionFlingController {
    private final Context mContext;
    private final int[] mFlingVelocityThresholds;
    private float mLastFlingVelocity;
    private int mLastProcessedAxis;
    private int mLastProcessedDeviceId;
    private int mLastProcessedSource;
    private final DifferentialMotionFlingTarget mTarget;
    private final DifferentialVelocityProvider mVelocityProvider;
    private final FlingVelocityThresholdCalculator mVelocityThresholdCalculator;
    private VelocityTracker mVelocityTracker;

    interface DifferentialVelocityProvider {
        float getCurrentVelocity(VelocityTracker r1, MotionEvent r2, int r3);
    }

    interface FlingVelocityThresholdCalculator {
        void calculateFlingVelocityThresholds(Context r1, int[] r2, MotionEvent r3, int r4);
    }

    public static /* synthetic */ void $r8$lambda$lv23FpWloyumz6IvnMabmJR9BpE(Context r0, int[] r1, MotionEvent r2, int r3) {
        calculateFlingVelocityThresholds(r0, r1, r2, r3);
    }

    public static /* synthetic */ float $r8$lambda$rCNQ1h5KBIaVcUXhwymI_1638W0(VelocityTracker r0, MotionEvent r1, int r2) {
        return getCurrentVelocity(r0, r1, r2);
    }

    public DifferentialMotionFlingController(Context context, DifferentialMotionFlingTarget target) {
        this(context, target, new DifferentialMotionFlingController$$ExternalSyntheticLambda0(), new DifferentialMotionFlingController$$ExternalSyntheticLambda1());
    }

    DifferentialMotionFlingController(Context context, DifferentialMotionFlingTarget target, FlingVelocityThresholdCalculator velocityThresholdCalculator, DifferentialVelocityProvider velocityProvider) {
        this.mLastProcessedAxis = -1;
        this.mLastProcessedSource = -1;
        this.mLastProcessedDeviceId = -1;
        this.mFlingVelocityThresholds = new int[]{Integer.MAX_VALUE, 0};
        this.mContext = context;
        this.mTarget = target;
        this.mVelocityThresholdCalculator = velocityThresholdCalculator;
        this.mVelocityProvider = velocityProvider;
    }

    public void onMotionEvent(MotionEvent event, int axis) {
        boolean flingParamsChanged = calculateFlingVelocityThresholds(event, axis);
        if (this.mFlingVelocityThresholds[0] == Integer.MAX_VALUE) goto L5;
        float scaledVelocity = getCurrentVelocity(event, axis) * this.mTarget.getScaledScrollFactor();
        float velocityDirection = Math.signum(scaledVelocity);
        float r4 = 0.0f;
        if (flingParamsChanged == false) goto L11;
    L14:
        this.mTarget.stopDifferentialMotionFling();
    L16:
        if (Math.abs(scaledVelocity) >= this.mFlingVelocityThresholds[0]) goto L18;
        return;
    L18:
        float scaledVelocity2 = Math.max(-this.mFlingVelocityThresholds[1], Math.min(scaledVelocity, this.mFlingVelocityThresholds[1]));
        boolean flung = this.mTarget.startDifferentialMotionFling(scaledVelocity2);
        if (flung == false) goto L21;
        r4 = scaledVelocity2;
    L21:
        this.mLastFlingVelocity = r4;
        return;
    L11:
        if (velocityDirection == Math.signum(this.mLastFlingVelocity)) goto L16;
        if (velocityDirection == 0.0f) goto L16;
    L5:
        if (this.mVelocityTracker == null) goto L23;
        this.mVelocityTracker.recycle();
        this.mVelocityTracker = null;
        return;
    }

    private boolean calculateFlingVelocityThresholds(MotionEvent event, int axis) {
        int source = event.getSource();
        int deviceId = event.getDeviceId();
        if (this.mLastProcessedSource == source) goto L5;
    L11:
        this.mVelocityThresholdCalculator.calculateFlingVelocityThresholds(this.mContext, this.mFlingVelocityThresholds, event, axis);
        this.mLastProcessedSource = source;
        this.mLastProcessedDeviceId = deviceId;
        this.mLastProcessedAxis = axis;
        return true;
    L5:
        if (this.mLastProcessedDeviceId != deviceId) goto L11;
        if (this.mLastProcessedAxis != axis) goto L11;
        return false;
    }

    private static void calculateFlingVelocityThresholds(Context context, int[] buffer, MotionEvent event, int axis) {
        ViewConfiguration vc = ViewConfiguration.get(context);
        buffer[0] = ViewConfigurationCompat.getScaledMinimumFlingVelocity(context, vc, event.getDeviceId(), axis, event.getSource());
        buffer[1] = ViewConfigurationCompat.getScaledMaximumFlingVelocity(context, vc, event.getDeviceId(), axis, event.getSource());
    }

    private float getCurrentVelocity(MotionEvent event, int axis) {
        if (this.mVelocityTracker != null) goto L6;
        this.mVelocityTracker = VelocityTracker.obtain();
    L6:
        return this.mVelocityProvider.getCurrentVelocity(this.mVelocityTracker, event, axis);
    }

    private static float getCurrentVelocity(VelocityTracker vt, MotionEvent event, int axis) {
        VelocityTrackerCompat.addMovement(vt, event);
        VelocityTrackerCompat.computeCurrentVelocity(vt, 1000);
        return VelocityTrackerCompat.getAxisVelocity(vt, axis);
    }
}
