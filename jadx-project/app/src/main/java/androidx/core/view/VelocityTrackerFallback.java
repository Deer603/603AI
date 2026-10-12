package androidx.core.view;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes4.dex */
class VelocityTrackerFallback {
    private static final long ASSUME_POINTER_STOPPED_MS = 40;
    private static final int HISTORY_SIZE = 20;
    private static final long RANGE_MS = 100;
    private int mDataPointsBufferLastUsedIndex;
    private int mDataPointsBufferSize;
    private final long[] mEventTimes;
    private float mLastComputedVelocity;
    private final float[] mMovements;

    VelocityTrackerFallback() {
        this.mMovements = new float[20];
        this.mEventTimes = new long[20];
        this.mLastComputedVelocity = 0.0f;
        this.mDataPointsBufferSize = 0;
        this.mDataPointsBufferLastUsedIndex = 0;
    }

    void addMovement(MotionEvent event) {
        long eventTime = event.getEventTime();
        if (this.mDataPointsBufferSize != 0) goto L5;
    L7:
        this.mDataPointsBufferLastUsedIndex = (this.mDataPointsBufferLastUsedIndex + 1) % 20;
        if (this.mDataPointsBufferSize == 20) goto L10;
        this.mDataPointsBufferSize++;
    L10:
        this.mMovements[this.mDataPointsBufferLastUsedIndex] = event.getAxisValue(26);
        this.mEventTimes[this.mDataPointsBufferLastUsedIndex] = eventTime;
        return;
    L5:
        if ((eventTime - this.mEventTimes[this.mDataPointsBufferLastUsedIndex]) <= ASSUME_POINTER_STOPPED_MS) goto L7;
        clear();
        goto L7
    }

    void computeCurrentVelocity(int units) {
        computeCurrentVelocity(units, Float.MAX_VALUE);
    }

    void computeCurrentVelocity(int units, float maxVelocity) {
        this.mLastComputedVelocity = getCurrentVelocity() * units;
        if (this.mLastComputedVelocity >= (-Math.abs(maxVelocity))) goto L6;
        this.mLastComputedVelocity = -Math.abs(maxVelocity);
        return;
    L6:
        if (this.mLastComputedVelocity <= Math.abs(maxVelocity)) goto L10;
        this.mLastComputedVelocity = Math.abs(maxVelocity);
        return;
    }

    float getAxisVelocity(int axis) {
        if (axis == 26) goto L7;
        return 0.0f;
    L7:
        return this.mLastComputedVelocity;
    }

    private void clear() {
        this.mDataPointsBufferSize = 0;
        this.mLastComputedVelocity = 0.0f;
    }

    private float getCurrentVelocity() {
        if (this.mDataPointsBufferSize >= 2) goto L5;
        return 0.0f;
    L5:
        int firstValidIndex = ((this.mDataPointsBufferLastUsedIndex + 20) - (this.mDataPointsBufferSize - 1)) % 20;
        long lastEventTime = this.mEventTimes[this.mDataPointsBufferLastUsedIndex];
    L6:
        long r8 = lastEventTime - this.mEventTimes[firstValidIndex];
        int r9 = this.mDataPointsBufferSize;
        if (r8 <= RANGE_MS) goto L9;
        this.mDataPointsBufferSize = r9 - 1;
        firstValidIndex = (firstValidIndex + 1) % 20;
        goto L6
    L9:
        if (r9 >= 2) goto L12;
        return 0.0f;
    L12:
        if (this.mDataPointsBufferSize != 2) goto L18;
        int lastIndex = (firstValidIndex + 1) % 20;
        if (this.mEventTimes[firstValidIndex] != this.mEventTimes[lastIndex]) goto L17;
        return 0.0f;
    L17:
        return this.mMovements[lastIndex] / (this.mEventTimes[lastIndex] - this.mEventTimes[firstValidIndex]);
    L18:
        float work = 0.0f;
        int numDataPointsProcessed = 0;
        int i = 0;
    L20:
        if (i >= (this.mDataPointsBufferSize - 1)) goto L29;
        int currentIndex = i + firstValidIndex;
        long eventTime = this.mEventTimes[currentIndex % 20];
        int nextIndex = (currentIndex + 1) % 20;
        if (this.mEventTimes[nextIndex] == eventTime) goto L27;
        numDataPointsProcessed = numDataPointsProcessed + 1;
        float vPrev = kineticEnergyToVelocity(work);
        float delta = this.mMovements[nextIndex];
        float vCurr = delta / (this.mEventTimes[nextIndex] - eventTime);
        work = work + ((vCurr - vPrev) * Math.abs(vCurr));
        if (numDataPointsProcessed != 1) goto L27;
        work = work * 0.5f;
    L27:
        i = i + 1;
        goto L20
    L29:
        return kineticEnergyToVelocity(work);
    }

    private static float kineticEnergyToVelocity(float work) {
        if (work >= 0.0f) goto L5;
        float r0 = -1.0f;
    L7:
        return r0 * ((float) Math.sqrt(Math.abs(work) * 2.0f));
    L5:
        r0 = 1.0f;
        goto L7
    }
}
