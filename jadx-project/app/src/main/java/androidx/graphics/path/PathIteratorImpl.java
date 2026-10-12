package androidx.graphics.path;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PathIteratorImpl.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000 !2\u00020\u0001:\u0001!B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&J#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0014H&J\u0006\u0010\u001c\u001a\u00020\u001dJ\u001a\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\u0012H&J\b\u0010 \u001a\u00020\u0019H&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, d2 = {"Landroidx/graphics/path/PathIteratorImpl;", "", "path", "Landroid/graphics/Path;", "conicEvaluation", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "tolerance", "", "(Landroid/graphics/Path;Landroidx/graphics/path/PathIterator$ConicEvaluation;F)V", "getConicEvaluation", "()Landroidx/graphics/path/PathIterator$ConicEvaluation;", "getPath", "()Landroid/graphics/Path;", "pointsData", "", "getTolerance", "()F", "calculateSize", "", "includeConvertedConics", "", "floatsToPoints", "", "Landroid/graphics/PointF;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/graphics/path/PathSegment$Type;", "([FLandroidx/graphics/path/PathSegment$Type;)[Landroid/graphics/PointF;", "hasNext", "next", "Landroidx/graphics/path/PathSegment;", "points", "offset", "peek", "Companion", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class PathIteratorImpl {
    private static final Companion Companion = null;
    private final PathIterator.ConicEvaluation conicEvaluation;
    private final Path path;
    private final float[] pointsData;
    private final float tolerance;

    /* JADX INFO: compiled from: PathIteratorImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/graphics/path/PathIteratorImpl$Companion;", "", "()V", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: PathIteratorImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[PathSegment.Type.values().length];
            r0[PathSegment.Type.Move.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L20:
            r0[PathSegment.Type.Line.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L24:
            r0[PathSegment.Type.Quadratic.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L28:
            r0[PathSegment.Type.Conic.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L22:
            r0[PathSegment.Type.Cubic.ordinal()] = 5;     // Catch: NoSuchFieldError -> L17
        L18:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public abstract int calculateSize(boolean r1);

    public abstract boolean hasNext();

    public abstract PathSegment.Type next(float[] r1, int r2);

    public abstract PathSegment.Type peek();

    public PathIteratorImpl(Path path, PathIterator.ConicEvaluation conicEvaluation, float tolerance) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(conicEvaluation, "conicEvaluation");
        this.path = path;
        this.conicEvaluation = conicEvaluation;
        this.tolerance = tolerance;
        this.pointsData = new float[8];
    }

    public /* synthetic */ PathIteratorImpl(Path r1, PathIterator.ConicEvaluation r2, float r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = PathIterator.ConicEvaluation.AsQuadratics;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0.25f;
    L8:
        this(r1, r2, r3);
    }

    public final Path getPath() {
        return this.path;
    }

    public final PathIterator.ConicEvaluation getConicEvaluation() {
        return this.conicEvaluation;
    }

    public final float getTolerance() {
        return this.tolerance;
    }

    static {
        Companion = new Companion(null);
        System.loadLibrary("androidx.graphics.path");
    }

    public static /* synthetic */ PathSegment.Type next$default(PathIteratorImpl r0, float[] r1, int r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L7;
        r2 = 0;
    L7:
        return r0.next(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: next");
    }

    public final PathSegment next() {
        PathSegment.Type type = next(this.pointsData, 0);
        if (type != PathSegment.Type.Done) goto L7;
        return PathSegmentUtilities.getDoneSegment();
    L7:
        if (type != PathSegment.Type.Close) goto L11;
        return PathSegmentUtilities.getCloseSegment();
    L11:
        if (type != PathSegment.Type.Conic) goto L13;
        float weight = this.pointsData[6];
    L15:
        return new PathSegment(type, floatsToPoints(this.pointsData, type), weight);
    L13:
        weight = 0.0f;
        goto L15
    }

    private final PointF[] floatsToPoints(float[] pointsData, PathSegment.Type type) {
        switch(WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1: goto L8;
            case 2: goto L7;
            case 3: goto L6;
            case 4: goto L6;
            case 5: goto L5;
            default: goto L11;
        };
    L5:
        PointF[] points = {new PointF(pointsData[0], pointsData[1]), new PointF(pointsData[2], pointsData[3]), new PointF(pointsData[4], pointsData[5]), new PointF(pointsData[6], pointsData[7])};
        return points;
    L6:
        PointF[] points2 = {new PointF(pointsData[0], pointsData[1]), new PointF(pointsData[2], pointsData[3]), new PointF(pointsData[4], pointsData[5])};
        return points2;
    L7:
        PointF[] points3 = {new PointF(pointsData[0], pointsData[1]), new PointF(pointsData[2], pointsData[3])};
        return points3;
    L8:
        PointF[] points4 = {new PointF(pointsData[0], pointsData[1])};
        return points4;
    L11:
        return new PointF[0];
    }
}
