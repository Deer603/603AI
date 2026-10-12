package androidx.graphics.path;

import android.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PathIteratorImpl.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Landroidx/graphics/path/PathIteratorApi34Impl;", "Landroidx/graphics/path/PathIteratorImpl;", "path", "Landroid/graphics/Path;", "conicEvaluation", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "tolerance", "", "(Landroid/graphics/Path;Landroidx/graphics/path/PathIterator$ConicEvaluation;F)V", "conicConverter", "Landroidx/graphics/path/ConicConverter;", "platformIterator", "Landroid/graphics/PathIterator;", "calculateSize", "", "includeConvertedConics", "", "hasNext", "next", "Landroidx/graphics/path/PathSegment$Type;", "points", "", "offset", "peek", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PathIteratorApi34Impl extends PathIteratorImpl {
    private final ConicConverter conicConverter;
    private final android.graphics.PathIterator platformIterator;

    public /* synthetic */ PathIteratorApi34Impl(Path r1, PathIterator.ConicEvaluation r2, float r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = PathIterator.ConicEvaluation.AsQuadratics;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0.25f;
    L8:
        this(r1, r2, r3);
    }

    public PathIteratorApi34Impl(Path path, PathIterator.ConicEvaluation conicEvaluation, float tolerance) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(conicEvaluation, "conicEvaluation");
        super(path, conicEvaluation, tolerance);
        android.graphics.PathIterator r0 = path.getPathIterator();
        Intrinsics.checkNotNullExpressionValue(r0, "path.pathIterator");
        this.platformIterator = r0;
        this.conicConverter = new ConicConverter();
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public int calculateSize(boolean includeConvertedConics) {
        if (includeConvertedConics == true) goto L5;
    L7:
        boolean convertConics = false;
    L8:
        int numVerbs = 0;
        android.graphics.PathIterator tempIterator = getPath().getPathIterator();
        Intrinsics.checkNotNullExpressionValue(tempIterator, "path.pathIterator");
        float[] tempFloats = new float[8];
    L10:
        if (tempIterator.hasNext() == false) goto L16;
        int type = tempIterator.next(tempFloats, 0);
        if (type != 3) goto L15;
        if (convertConics == false) goto L15;
        ConicConverter $this$calculateSize_u24lambda_u240 = this.conicConverter;
        ConicConverter.convert$default($this$calculateSize_u24lambda_u240, tempFloats, tempFloats[6], getTolerance(), 0, 8, null);
        numVerbs = numVerbs + $this$calculateSize_u24lambda_u240.getQuadraticCount();
    L15:
        numVerbs = numVerbs + 1;
        goto L10
    L16:
        return numVerbs;
    L5:
        if (getConicEvaluation() != PathIterator.ConicEvaluation.AsQuadratics) goto L7;
        convertConics = true;
        goto L8
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public PathSegment.Type next(float[] points, int offset) {
        Intrinsics.checkNotNullParameter(points, "points");
        if (this.conicConverter.getCurrentQuadratic() >= this.conicConverter.getQuadraticCount()) goto L6;
        this.conicConverter.nextQuadratic(points, offset);
        return PathSegment.Type.Quadratic;
    L6:
        PathSegment.Type typeValue = PathIteratorImplKt.access$platformToAndroidXSegmentType(this.platformIterator.next(points, offset));
        if (typeValue == PathSegment.Type.Conic) goto L9;
    L15:
        return typeValue;
    L9:
        if (getConicEvaluation() != PathIterator.ConicEvaluation.AsQuadratics) goto L15;
        ConicConverter $this$next_u24lambda_u241 = this.conicConverter;
        $this$next_u24lambda_u241.convert(points, points[offset + 6], getTolerance(), offset);
        if ($this$next_u24lambda_u241.getQuadraticCount() <= 0) goto L14;
        $this$next_u24lambda_u241.nextQuadratic(points, offset);
    L14:
        return PathSegment.Type.Quadratic;
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public boolean hasNext() {
        return this.platformIterator.hasNext();
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public PathSegment.Type peek() {
        return PathIteratorImplKt.access$platformToAndroidXSegmentType(this.platformIterator.peek());
    }
}
