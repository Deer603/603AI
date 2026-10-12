package androidx.core.graphics;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class PathUtils {

    static class Api26Impl {
        private Api26Impl() {
        }

        static float[] approximate(Path path, float acceptableError) {
            return path.approximate(acceptableError);
        }
    }

    public static Collection<PathSegment> flatten(Path path) {
        return flatten(path, 0.5f);
    }

    public static Collection<PathSegment> flatten(Path path, float error) {
        float[] pathData = Api26Impl.approximate(path, error);
        int pointCount = pathData.length / 3;
        List<PathSegment> segments = new ArrayList(pointCount);
        int i = 1;
    L3:
        if (i >= pointCount) goto L12;
        int index = i * 3;
        int prevIndex = (i - 1) * 3;
        float d = pathData[index];
        float x = pathData[index + 1];
        float y = pathData[index + 2];
        float pd = pathData[prevIndex];
        float px = pathData[prevIndex + 1];
        float py = pathData[prevIndex + 2];
        if (d == pd) goto L11;
        if (x == px) goto L9;
    L10:
        segments.add(new PathSegment(new PointF(px, py), pd, new PointF(x, y), d));
        goto L11
    L9:
        if (y != py) goto L10;
    L11:
        i = i + 1;
        goto L3
    L12:
        return segments;
    }

    private PathUtils() {
    }
}
