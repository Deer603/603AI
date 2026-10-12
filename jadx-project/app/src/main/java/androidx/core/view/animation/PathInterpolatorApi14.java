package androidx.core.view.animation;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes4.dex */
class PathInterpolatorApi14 implements Interpolator {
    private static final float PRECISION = 0.002f;
    private final float[] mX;
    private final float[] mY;

    PathInterpolatorApi14(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float pathLength = pathMeasure.getLength();
        int numPoints = ((int) (pathLength / PRECISION)) + 1;
        this.mX = new float[numPoints];
        this.mY = new float[numPoints];
        float[] position = new float[2];
        int i = 0;
    L3:
        if (i >= numPoints) goto L5;
        float distance = (i * pathLength) / (numPoints - 1);
        pathMeasure.getPosTan(distance, position, null);
        this.mX[i] = position[0];
        this.mY[i] = position[1];
        i = i + 1;
        goto L3
    }

    PathInterpolatorApi14(float controlX, float controlY) {
        this(createQuad(controlX, controlY));
    }

    PathInterpolatorApi14(float controlX1, float controlY1, float controlX2, float controlY2) {
        this(createCubic(controlX1, controlY1, controlX2, controlY2));
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float t) {
        if (t > 0.0f) goto L6;
        return 0.0f;
    L6:
        if (t < 1.0f) goto L8;
        return 1.0f;
    L8:
        int startIndex = 0;
        int endIndex = this.mX.length - 1;
    L10:
        if ((endIndex - startIndex) <= 1) goto L16;
        int midIndex = (startIndex + endIndex) / 2;
        if (t < this.mX[midIndex]) goto L13;
        startIndex = midIndex;
        goto L10
    L13:
        endIndex = midIndex;
        goto L10
    L16:
        float xRange = this.mX[endIndex] - this.mX[startIndex];
        if (xRange == 0.0f) goto L19;
        float tInRange = t - this.mX[startIndex];
        float fraction = tInRange / xRange;
        float startY = this.mY[startIndex];
        float endY = this.mY[endIndex];
        return ((endY - startY) * fraction) + startY;
    L19:
        return this.mY[startIndex];
    }

    private static Path createQuad(float controlX, float controlY) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(controlX, controlY, 1.0f, 1.0f);
        return path;
    }

    private static Path createCubic(float controlX1, float controlY1, float controlX2, float controlY2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(controlX1, controlY1, controlX2, controlY2, 1.0f, 1.0f);
        return path;
    }
}
