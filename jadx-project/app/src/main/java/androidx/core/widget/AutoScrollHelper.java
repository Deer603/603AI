package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AutoScrollHelper implements View.OnTouchListener {
    private static final int DEFAULT_ACTIVATION_DELAY = 0;
    private static final int DEFAULT_EDGE_TYPE = 1;
    private static final float DEFAULT_MAXIMUM_EDGE = Float.MAX_VALUE;
    private static final int DEFAULT_MAXIMUM_VELOCITY_DIPS = 1575;
    private static final int DEFAULT_MINIMUM_VELOCITY_DIPS = 315;
    private static final int DEFAULT_RAMP_DOWN_DURATION = 500;
    private static final int DEFAULT_RAMP_UP_DURATION = 500;
    private static final float DEFAULT_RELATIVE_EDGE = 0.2f;
    private static final float DEFAULT_RELATIVE_VELOCITY = 1.0f;
    public static final int EDGE_TYPE_INSIDE = 0;
    public static final int EDGE_TYPE_INSIDE_EXTEND = 1;
    public static final int EDGE_TYPE_OUTSIDE = 2;
    private static final int HORIZONTAL = 0;
    public static final float NO_MAX = Float.MAX_VALUE;
    public static final float NO_MIN = 0.0f;
    public static final float RELATIVE_UNSPECIFIED = 0.0f;
    private static final int VERTICAL = 1;
    private int mActivationDelay;
    private boolean mAlreadyDelayed;
    boolean mAnimating;
    private final Interpolator mEdgeInterpolator;
    private int mEdgeType;
    private boolean mEnabled;
    private boolean mExclusive;
    private float[] mMaximumEdges;
    private float[] mMaximumVelocity;
    private float[] mMinimumVelocity;
    boolean mNeedsCancel;
    boolean mNeedsReset;
    private float[] mRelativeEdges;
    private float[] mRelativeVelocity;
    private Runnable mRunnable;
    final ClampedScroller mScroller;
    final View mTarget;

    private static class ClampedScroller {
        private long mDeltaTime;
        private int mDeltaX;
        private int mDeltaY;
        private int mEffectiveRampDown;
        private int mRampDownDuration;
        private int mRampUpDuration;
        private long mStartTime;
        private long mStopTime;
        private float mStopValue;
        private float mTargetVelocityX;
        private float mTargetVelocityY;

        ClampedScroller() {
            this.mStartTime = Long.MIN_VALUE;
            this.mStopTime = -1;
            this.mDeltaTime = 0;
            this.mDeltaX = 0;
            this.mDeltaY = 0;
        }

        public void setRampUpDuration(int durationMillis) {
            this.mRampUpDuration = durationMillis;
        }

        public void setRampDownDuration(int durationMillis) {
            this.mRampDownDuration = durationMillis;
        }

        public void start() {
            this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
            this.mStopTime = -1;
            this.mDeltaTime = this.mStartTime;
            this.mStopValue = 0.5f;
            this.mDeltaX = 0;
            this.mDeltaY = 0;
        }

        public void requestStop() {
            long currentTime = AnimationUtils.currentAnimationTimeMillis();
            this.mEffectiveRampDown = AutoScrollHelper.constrain((int) (currentTime - this.mStartTime), 0, this.mRampDownDuration);
            this.mStopValue = getValueAt(currentTime);
            this.mStopTime = currentTime;
        }

        public boolean isFinished() {
            if (this.mStopTime > 0) goto L5;
        L7:
            return false;
        L5:
            if (AnimationUtils.currentAnimationTimeMillis() <= (this.mStopTime + ((long) this.mEffectiveRampDown))) goto L7;
            return true;
        }

        private float getValueAt(long currentTime) {
            if (currentTime >= this.mStartTime) goto L6;
            return 0.0f;
        L6:
            if (this.mStopTime >= 0) goto L8;
        L12:
            long elapsedSinceEnd = this.mStartTime;
            long elapsedSinceStart = currentTime - elapsedSinceEnd;
            return AutoScrollHelper.constrain(elapsedSinceStart / this.mRampUpDuration, 0.0f, 1.0f) * 0.5f;
        L8:
            if (currentTime < this.mStopTime) goto L12;
            long elapsedSinceEnd2 = currentTime - this.mStopTime;
            return (1.0f - this.mStopValue) + (this.mStopValue * AutoScrollHelper.constrain(elapsedSinceEnd2 / this.mEffectiveRampDown, 0.0f, 1.0f));
        }

        private float interpolateValue(float value) {
            return (((-4.0f) * value) * value) + (4.0f * value);
        }

        public void computeScrollDelta() {
            if (this.mDeltaTime == 0) goto L7;
            long currentTime = AnimationUtils.currentAnimationTimeMillis();
            float value = getValueAt(currentTime);
            float scale = interpolateValue(value);
            long elapsedSinceDelta = currentTime - this.mDeltaTime;
            this.mDeltaTime = currentTime;
            this.mDeltaX = (int) ((elapsedSinceDelta * scale) * this.mTargetVelocityX);
            this.mDeltaY = (int) ((elapsedSinceDelta * scale) * this.mTargetVelocityY);
            return;
        L7:
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public void setTargetVelocity(float x, float y) {
            this.mTargetVelocityX = x;
            this.mTargetVelocityY = y;
        }

        public int getHorizontalDirection() {
            return (int) (this.mTargetVelocityX / Math.abs(this.mTargetVelocityX));
        }

        public int getVerticalDirection() {
            return (int) (this.mTargetVelocityY / Math.abs(this.mTargetVelocityY));
        }

        public int getDeltaX() {
            return this.mDeltaX;
        }

        public int getDeltaY() {
            return this.mDeltaY;
        }
    }

    private class ScrollAnimationRunnable implements Runnable {
        final /* synthetic */ AutoScrollHelper this$0;

        ScrollAnimationRunnable(AutoScrollHelper r1) {
            this.this$0 = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.this$0.mAnimating == true) goto L6;
            return;
        L6:
            if (this.this$0.mNeedsReset == false) goto L8;
            this.this$0.mNeedsReset = false;
            this.this$0.mScroller.start();
        L8:
            ClampedScroller scroller = this.this$0.mScroller;
            if (scroller.isFinished() == false) goto L11;
        L18:
            this.this$0.mAnimating = false;
            return;
        L11:
            if (this.this$0.shouldAnimate() == false) goto L18;
            if (this.this$0.mNeedsCancel == false) goto L16;
            this.this$0.mNeedsCancel = false;
            this.this$0.cancelTargetTouch();
        L16:
            scroller.computeScrollDelta();
            int deltaX = scroller.getDeltaX();
            int deltaY = scroller.getDeltaY();
            this.this$0.scrollTargetBy(deltaX, deltaY);
            ViewCompat.postOnAnimation(this.this$0.mTarget, this);
        }
    }

    public abstract boolean canTargetScrollHorizontally(int r1);

    public abstract boolean canTargetScrollVertically(int r1);

    public abstract void scrollTargetBy(int r1, int r2);

    static {
        DEFAULT_ACTIVATION_DELAY = ViewConfiguration.getTapTimeout();
    }

    public AutoScrollHelper(View target) {
        this.mScroller = new ClampedScroller();
        this.mEdgeInterpolator = new AccelerateInterpolator();
        this.mRelativeEdges = new float[]{0.0f, 0.0f};
        this.mMaximumEdges = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.mRelativeVelocity = new float[]{0.0f, 0.0f};
        this.mMinimumVelocity = new float[]{0.0f, 0.0f};
        this.mMaximumVelocity = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.mTarget = target;
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        int maxVelocity = (int) ((metrics.density * 1575.0f) + 0.5f);
        int minVelocity = (int) ((metrics.density * 315.0f) + 0.5f);
        setMaximumVelocity(maxVelocity, maxVelocity);
        setMinimumVelocity(minVelocity, minVelocity);
        setEdgeType(1);
        setMaximumEdges(Float.MAX_VALUE, Float.MAX_VALUE);
        setRelativeEdges(0.2f, 0.2f);
        setRelativeVelocity(1.0f, 1.0f);
        setActivationDelay(DEFAULT_ACTIVATION_DELAY);
        setRampUpDuration(500);
        setRampDownDuration(500);
    }

    public AutoScrollHelper setEnabled(boolean enabled) {
        if (this.mEnabled == false) goto L6;
        if (enabled == true) goto L6;
        requestStop();
    L6:
        this.mEnabled = enabled;
        return this;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public AutoScrollHelper setExclusive(boolean exclusive) {
        this.mExclusive = exclusive;
        return this;
    }

    public boolean isExclusive() {
        return this.mExclusive;
    }

    public AutoScrollHelper setMaximumVelocity(float horizontalMax, float verticalMax) {
        this.mMaximumVelocity[0] = horizontalMax / 1000.0f;
        this.mMaximumVelocity[1] = verticalMax / 1000.0f;
        return this;
    }

    public AutoScrollHelper setMinimumVelocity(float horizontalMin, float verticalMin) {
        this.mMinimumVelocity[0] = horizontalMin / 1000.0f;
        this.mMinimumVelocity[1] = verticalMin / 1000.0f;
        return this;
    }

    public AutoScrollHelper setRelativeVelocity(float horizontal, float vertical) {
        this.mRelativeVelocity[0] = horizontal / 1000.0f;
        this.mRelativeVelocity[1] = vertical / 1000.0f;
        return this;
    }

    public AutoScrollHelper setEdgeType(int type) {
        this.mEdgeType = type;
        return this;
    }

    public AutoScrollHelper setRelativeEdges(float horizontal, float vertical) {
        this.mRelativeEdges[0] = horizontal;
        this.mRelativeEdges[1] = vertical;
        return this;
    }

    public AutoScrollHelper setMaximumEdges(float horizontalMax, float verticalMax) {
        this.mMaximumEdges[0] = horizontalMax;
        this.mMaximumEdges[1] = verticalMax;
        return this;
    }

    public AutoScrollHelper setActivationDelay(int delayMillis) {
        this.mActivationDelay = delayMillis;
        return this;
    }

    public AutoScrollHelper setRampUpDuration(int durationMillis) {
        this.mScroller.setRampUpDuration(durationMillis);
        return this;
    }

    public AutoScrollHelper setRampDownDuration(int durationMillis) {
        this.mScroller.setRampDownDuration(durationMillis);
        return this;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v, MotionEvent event) {
        if (this.mEnabled == true) goto L5;
        return false;
    L5:
        int action = event.getActionMasked();
        switch(action) {
            case 0: goto L9;
            case 1: goto L8;
            case 2: goto L10;
            case 3: goto L8;
            default: goto L16;
        };
    L8:
        requestStop();
        goto L16
    L9:
        this.mNeedsCancel = true;
        this.mAlreadyDelayed = false;
    L10:
        float xTargetVelocity = computeTargetVelocity(0, event.getX(), v.getWidth(), this.mTarget.getWidth());
        float yTargetVelocity = computeTargetVelocity(1, event.getY(), v.getHeight(), this.mTarget.getHeight());
        this.mScroller.setTargetVelocity(xTargetVelocity, yTargetVelocity);
        if (this.mAnimating == true) goto L16;
        if (shouldAnimate() == false) goto L16;
        startAnimating();
    L16:
        if (this.mExclusive == true) goto L18;
        return false;
    L18:
        if (this.mAnimating == true) goto L20;
        return false;
    L20:
        return true;
    }

    boolean shouldAnimate() {
        ClampedScroller scroller = this.mScroller;
        int verticalDirection = scroller.getVerticalDirection();
        int horizontalDirection = scroller.getHorizontalDirection();
        if (verticalDirection != 0) goto L5;
    L6:
        if (horizontalDirection != 0) goto L8;
    L10:
        return false;
    L8:
        if (canTargetScrollHorizontally(horizontalDirection) == false) goto L10;
    L9:
        return true;
    L5:
        if (canTargetScrollVertically(verticalDirection) == true) goto L9;
        goto L6
    }

    private void startAnimating() {
        if (this.mRunnable != null) goto L5;
        this.mRunnable = new ScrollAnimationRunnable(this);
    L5:
        this.mAnimating = true;
        this.mNeedsReset = true;
        if (this.mAlreadyDelayed == false) goto L8;
    L10:
        this.mRunnable.run();
    L11:
        this.mAlreadyDelayed = true;
        return;
    L8:
        if (this.mActivationDelay <= 0) goto L10;
        ViewCompat.postOnAnimationDelayed(this.mTarget, this.mRunnable, this.mActivationDelay);
        goto L11
    }

    private void requestStop() {
        if (this.mNeedsReset == false) goto L5;
        this.mAnimating = false;
        return;
    L5:
        this.mScroller.requestStop();
    }

    private float computeTargetVelocity(int direction, float coordinate, float srcSize, float dstSize) {
        float relativeEdge = this.mRelativeEdges[direction];
        float maximumEdge = this.mMaximumEdges[direction];
        float value = getEdgeValue(relativeEdge, srcSize, maximumEdge, coordinate);
        if (value != 0.0f) goto L5;
        return 0.0f;
    L5:
        float relativeVelocity = this.mRelativeVelocity[direction];
        float minimumVelocity = this.mMinimumVelocity[direction];
        float maximumVelocity = this.mMaximumVelocity[direction];
        float targetVelocity = relativeVelocity * dstSize;
        if (value <= 0.0f) goto L10;
        return constrain(value * targetVelocity, minimumVelocity, maximumVelocity);
    L10:
        return -constrain((-value) * targetVelocity, minimumVelocity, maximumVelocity);
    }

    private float getEdgeValue(float relativeValue, float size, float maxValue, float current) {
        float edgeSize = constrain(relativeValue * size, 0.0f, maxValue);
        float valueLeading = constrainEdgeValue(current, edgeSize);
        float valueTrailing = constrainEdgeValue(size - current, edgeSize);
        float value = valueTrailing - valueLeading;
        if (value >= 0.0f) goto L6;
        float interpolated = -this.mEdgeInterpolator.getInterpolation(-value);
    L9:
        return constrain(interpolated, -1.0f, 1.0f);
    L6:
        if (value <= 0.0f) goto L10;
        interpolated = this.mEdgeInterpolator.getInterpolation(value);
        goto L9
    L10:
        return 0.0f;
    }

    private float constrainEdgeValue(float current, float leading) {
        if (leading != 0.0f) goto L6;
        return 0.0f;
    L6:
        switch(this.mEdgeType) {
            case 0: goto L13;
            case 1: goto L13;
            case 2: goto L9;
            default: goto L23;
        };
    L23:
        return 0.0f;
    L9:
        if (current >= 0.0f) goto L23;
        return current / (-leading);
    L13:
        if (current >= leading) goto L23;
        if (current < 0.0f) goto L19;
        return 1.0f - (current / leading);
    L19:
        if (this.mAnimating == false) goto L23;
        if (this.mEdgeType != 1) goto L23;
        return 1.0f;
    }

    static int constrain(int value, int min, int max) {
        if (value <= max) goto L4;
        return max;
    L4:
        if (value >= min) goto L6;
        return min;
    L6:
        return value;
    }

    static float constrain(float value, float min, float max) {
        if (value <= max) goto L6;
        return max;
    L6:
        if (value >= min) goto L8;
        return min;
    L8:
        return value;
    }

    void cancelTargetTouch() {
        long eventTime = SystemClock.uptimeMillis();
        MotionEvent cancel = MotionEvent.obtain(eventTime, eventTime, 3, 0.0f, 0.0f, 0);
        this.mTarget.onTouchEvent(cancel);
        cancel.recycle();
    }
}
