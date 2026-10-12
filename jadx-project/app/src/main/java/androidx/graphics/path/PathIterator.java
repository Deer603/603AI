package androidx.graphics.path;

import android.graphics.Path;
import android.os.Build;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: PathIterator.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0015H\u0096\u0002J\t\u0010\u0017\u001a\u00020\u0002H\u0096\u0002J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u0013H\u0007J\u0006\u0010\u001c\u001a\u00020\u0018R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Landroidx/graphics/path/PathIterator;", "", "Landroidx/graphics/path/PathSegment;", "path", "Landroid/graphics/Path;", "conicEvaluation", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "tolerance", "", "(Landroid/graphics/Path;Landroidx/graphics/path/PathIterator$ConicEvaluation;F)V", "getConicEvaluation", "()Landroidx/graphics/path/PathIterator$ConicEvaluation;", "implementation", "Landroidx/graphics/path/PathIteratorImpl;", "getPath", "()Landroid/graphics/Path;", "getTolerance", "()F", "calculateSize", "", "includeConvertedConics", "", "hasNext", "next", "Landroidx/graphics/path/PathSegment$Type;", "points", "", "offset", "peek", "ConicEvaluation", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PathIterator implements Iterator<PathSegment>, KMappedMarker {
    private final ConicEvaluation conicEvaluation;
    private final PathIteratorImpl implementation;
    private final Path path;
    private final float tolerance;

    /* JADX INFO: compiled from: PathIterator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/graphics/path/PathIterator$ConicEvaluation;", "", "(Ljava/lang/String;I)V", "AsConic", "AsQuadratics", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final enum ConicEvaluation extends Enum<ConicEvaluation> {
        private static final /* synthetic */ ConicEvaluation[] $VALUES = null;
        public static final ConicEvaluation AsConic = null;
        public static final ConicEvaluation AsQuadratics = null;

        private static final /* synthetic */ ConicEvaluation[] $values() {
            return new ConicEvaluation[]{AsConic, AsQuadratics};
        }

        public static ConicEvaluation valueOf(String r1) {
            return (ConicEvaluation) Enum.valueOf(ConicEvaluation.class, r1);
        }

        public static ConicEvaluation[] values() {
            return (ConicEvaluation[]) $VALUES.clone();
        }

        private ConicEvaluation(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        static {
            AsConic = new ConicEvaluation("AsConic", 0);
            AsQuadratics = new ConicEvaluation("AsQuadratics", 1);
            $VALUES = $values();
        }
    }

    public final PathSegment.Type next(float[] r4) {
        Intrinsics.checkNotNullParameter(r4, "points");
        return next$default(this, r4, 0, 2, null);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public PathIterator(Path path, ConicEvaluation conicEvaluation, float tolerance) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(conicEvaluation, "conicEvaluation");
        this.path = path;
        this.conicEvaluation = conicEvaluation;
        this.tolerance = tolerance;
        if (Build.VERSION.SDK_INT < 34) goto L5;
        PathIteratorPreApi34Impl r0 = new PathIteratorApi34Impl(this.path, this.conicEvaluation, this.tolerance);
    L6:
        this.implementation = r0;
        return;
    L5:
        r0 = new PathIteratorPreApi34Impl(this.path, this.conicEvaluation, this.tolerance);
        goto L6
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ PathSegment next() {
        return next();
    }

    public /* synthetic */ PathIterator(Path r1, ConicEvaluation r2, float r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = ConicEvaluation.AsQuadratics;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0.25f;
    L8:
        this(r1, r2, r3);
    }

    public final Path getPath() {
        return this.path;
    }

    public final ConicEvaluation getConicEvaluation() {
        return this.conicEvaluation;
    }

    public final float getTolerance() {
        return this.tolerance;
    }

    public static /* synthetic */ int calculateSize$default(PathIterator r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = true;
    L6:
        return r0.calculateSize(r1);
    }

    public final int calculateSize(boolean includeConvertedConics) {
        return this.implementation.calculateSize(includeConvertedConics);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.implementation.hasNext();
    }

    public final PathSegment.Type peek() {
        return this.implementation.peek();
    }

    public static /* synthetic */ PathSegment.Type next$default(PathIterator r0, float[] r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = 0;
    L6:
        return r0.next(r1, r2);
    }

    public final PathSegment.Type next(float[] points, int offset) {
        Intrinsics.checkNotNullParameter(points, "points");
        return this.implementation.next(points, offset);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public PathSegment next() {
        return this.implementation.next();
    }
}
