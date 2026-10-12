package androidx.core.graphics;

import android.graphics.PointF;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: classes4.dex */
public final class PathSegment {
    private final PointF mEnd;
    private final float mEndFraction;
    private final PointF mStart;
    private final float mStartFraction;

    public PathSegment(PointF start, float startFraction, PointF end, float endFraction) {
        this.mStart = (PointF) Preconditions.checkNotNull(start, "start == null");
        this.mStartFraction = startFraction;
        this.mEnd = (PointF) Preconditions.checkNotNull(end, "end == null");
        this.mEndFraction = endFraction;
    }

    public PointF getStart() {
        return this.mStart;
    }

    public float getStartFraction() {
        return this.mStartFraction;
    }

    public PointF getEnd() {
        return this.mEnd;
    }

    public float getEndFraction() {
        return this.mEndFraction;
    }

    public boolean equals(Object o) {
        if (this != o) goto L6;
        return true;
    L6:
        if ((o instanceof PathSegment) == true) goto L8;
        return false;
    L8:
        PathSegment that = (PathSegment) o;
        if (Float.compare(this.mStartFraction, that.mStartFraction) != 0) goto L18;
        if (Float.compare(this.mEndFraction, that.mEndFraction) != 0) goto L18;
        if (this.mStart.equals(that.mStart) == false) goto L18;
        if (this.mEnd.equals(that.mEnd) == false) goto L18;
        return true;
    L18:
        return false;
    }

    public int hashCode() {
        int result = this.mStart.hashCode();
        int r1 = result * 31;
        int r4 = 0;
        if (this.mStartFraction == 0.0f) goto L5;
        int r2 = Float.floatToIntBits(this.mStartFraction);
    L6:
        int result2 = r1 + r2;
        int result3 = ((result2 * 31) + this.mEnd.hashCode()) * 31;
        if (this.mEndFraction == 0.0f) goto L10;
        r4 = Float.floatToIntBits(this.mEndFraction);
    L10:
        return result3 + r4;
    L5:
        r2 = 0;
        goto L6
    }

    public String toString() {
        return "PathSegment{start=" + this.mStart + ", startFraction=" + this.mStartFraction + ", end=" + this.mEnd + ", endFraction=" + this.mEndFraction + '}';
    }
}
