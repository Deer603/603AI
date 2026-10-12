package androidx.graphics.path;

import android.graphics.PointF;
import kotlin.Metadata;

/* JADX INFO: compiled from: PathSegment.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"CloseSegment", "Landroidx/graphics/path/PathSegment;", "getCloseSegment", "()Landroidx/graphics/path/PathSegment;", "DoneSegment", "getDoneSegment", "graphics-path_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PathSegmentUtilities {
    private static final PathSegment CloseSegment = null;
    private static final PathSegment DoneSegment = null;

    static {
        DoneSegment = new PathSegment(PathSegment.Type.Done, new PointF[0], 0.0f);
        CloseSegment = new PathSegment(PathSegment.Type.Close, new PointF[0], 0.0f);
    }

    public static final PathSegment getDoneSegment() {
        return DoneSegment;
    }

    public static final PathSegment getCloseSegment() {
        return CloseSegment;
    }
}
