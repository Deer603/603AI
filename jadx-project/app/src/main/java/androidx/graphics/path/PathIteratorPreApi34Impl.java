package androidx.graphics.path;

import android.graphics.Path;
import dalvik.annotation.optimization.FastNative;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PathIteratorImpl.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J!\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0082 J\u0011\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0082 J\b\u0010\u0012\u001a\u00020\u0011H\u0004J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\u0011\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0083 J!\u0010\u0015\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0083 J\u0011\u0010\u0019\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0083 J\u0011\u0010\u001a\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0083 J\u0011\u0010\u001b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0083 J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Landroidx/graphics/path/PathIteratorPreApi34Impl;", "Landroidx/graphics/path/PathIteratorImpl;", "path", "Landroid/graphics/Path;", "conicEvaluation", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "tolerance", "", "(Landroid/graphics/Path;Landroidx/graphics/path/PathIterator$ConicEvaluation;F)V", "internalPathIterator", "", "calculateSize", "", "includeConvertedConics", "", "createInternalPathIterator", "destroyInternalPathIterator", "", "finalize", "hasNext", "internalPathIteratorHasNext", "internalPathIteratorNext", "points", "", "offset", "internalPathIteratorPeek", "internalPathIteratorRawSize", "internalPathIteratorSize", "next", "Landroidx/graphics/path/PathSegment$Type;", "peek", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PathIteratorPreApi34Impl extends PathIteratorImpl {
    private final long internalPathIterator;

    private final native long createInternalPathIterator(Path r1, int r2, float r3);

    private final native void destroyInternalPathIterator(long r1);

    @FastNative
    private final native boolean internalPathIteratorHasNext(long r1);

    @FastNative
    private final native int internalPathIteratorNext(long r1, float[] r3, int r4);

    @FastNative
    private final native int internalPathIteratorPeek(long r1);

    @FastNative
    private final native int internalPathIteratorRawSize(long r1);

    @FastNative
    private final native int internalPathIteratorSize(long r1);

    public /* synthetic */ PathIteratorPreApi34Impl(Path r1, PathIterator.ConicEvaluation r2, float r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = PathIterator.ConicEvaluation.AsQuadratics;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0.25f;
    L8:
        this(r1, r2, r3);
    }

    public PathIteratorPreApi34Impl(Path path, PathIterator.ConicEvaluation conicEvaluation, float tolerance) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(conicEvaluation, "conicEvaluation");
        super(path, conicEvaluation, tolerance);
        this.internalPathIterator = createInternalPathIterator(path, conicEvaluation.ordinal(), tolerance);
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public int calculateSize(boolean includeConvertedConics) {
        if (includeConvertedConics == false) goto L8;
        if (getConicEvaluation() == PathIterator.ConicEvaluation.AsConic) goto L8;
        return internalPathIteratorSize(this.internalPathIterator);
    L8:
        return internalPathIteratorRawSize(this.internalPathIterator);
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public boolean hasNext() {
        return internalPathIteratorHasNext(this.internalPathIterator);
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public PathSegment.Type peek() {
        return PathIteratorImplKt.access$getPathSegmentTypes$p()[internalPathIteratorPeek(this.internalPathIterator)];
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public PathSegment.Type next(float[] points, int offset) {
        Intrinsics.checkNotNullParameter(points, "points");
        return PathIteratorImplKt.access$getPathSegmentTypes$p()[internalPathIteratorNext(this.internalPathIterator, points, offset)];
    }

    protected final void finalize() {
        destroyInternalPathIterator(this.internalPathIterator);
    }
}
