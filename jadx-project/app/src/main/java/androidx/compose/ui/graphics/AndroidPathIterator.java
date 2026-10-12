package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: AndroidPathIterator.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\t\u0010\u0017\u001a\u00020\u0016H\u0096\u0002J\t\u0010\u0018\u001a\u00020\u0019H\u0096\u0002J\u0018\u0010\u0018\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0014H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPathIterator;", "Landroidx/compose/ui/graphics/PathIterator;", "path", "Landroidx/compose/ui/graphics/Path;", "conicEvaluation", "Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "tolerance", "", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;F)V", "getConicEvaluation", "()Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "implementation", "Landroidx/graphics/path/PathIterator;", "getPath", "()Landroidx/compose/ui/graphics/Path;", "segmentPoints", "", "getTolerance", "()F", "calculateSize", "", "includeConvertedConics", "", "hasNext", "next", "Landroidx/compose/ui/graphics/PathSegment;", "Landroidx/compose/ui/graphics/PathSegment$Type;", "outPoints", "offset", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AndroidPathIterator implements PathIterator {
    private final PathIterator.ConicEvaluation conicEvaluation;
    private final androidx.graphics.path.PathIterator implementation;
    private final Path path;
    private final float[] segmentPoints;
    private final float tolerance;

    /* JADX INFO: compiled from: AndroidPathIterator.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = null;

        static {
            int[] r0 = new int[PathIterator.ConicEvaluation.values().length];
            r0[PathIterator.ConicEvaluation.AsConic.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L28:
            r0[PathIterator.ConicEvaluation.AsQuadratics.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
        L10:
            $EnumSwitchMapping$0 = r0;
            int[] r1 = new int[PathSegment.Type.values().length];
            r1[PathSegment.Type.Move.ordinal()] = 1;     // Catch: NoSuchFieldError -> L13
        L34:
            r1[PathSegment.Type.Line.ordinal()] = 2;     // Catch: NoSuchFieldError -> L16
        L38:
            r1[PathSegment.Type.Quadratic.ordinal()] = 3;     // Catch: NoSuchFieldError -> L19
        L30:
            r1[PathSegment.Type.Conic.ordinal()] = 4;     // Catch: NoSuchFieldError -> L22
        L36:
            r1[PathSegment.Type.Cubic.ordinal()] = 5;     // Catch: NoSuchFieldError -> L25
        L26:
            $EnumSwitchMapping$1 = r1;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public AndroidPathIterator(Path path, PathIterator.ConicEvaluation conicEvaluation, float tolerance) {
        this.path = path;
        this.conicEvaluation = conicEvaluation;
        this.tolerance = tolerance;
        this.segmentPoints = new float[8];
        Path $this$asAndroidPath$iv = getPath();
        if (($this$asAndroidPath$iv instanceof AndroidPath) == false) goto L13;
        android.graphics.Path r3 = ((AndroidPath) $this$asAndroidPath$iv).getInternalPath();
        PathIterator.ConicEvaluation r1 = getConicEvaluation();
        switch(WhenMappings.$EnumSwitchMapping$0[r1.ordinal()]) {
            case 1: goto L9;
            case 2: goto L8;
            default: goto L7;
        };
    L8:
        androidx.graphics.path.PathIterator.ConicEvaluation r2 = androidx.graphics.path.PathIterator.ConicEvaluation.AsQuadratics;
    L10:
        this.implementation = new androidx.graphics.path.PathIterator(r3, r2, getTolerance());
        return;
    L9:
        r2 = androidx.graphics.path.PathIterator.ConicEvaluation.AsConic;
        goto L10
    L7:
        throw new NoWhenBranchMatchedException();
    L13:
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ PathSegment next() {
        return next();
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    public Path getPath() {
        return this.path;
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    public PathIterator.ConicEvaluation getConicEvaluation() {
        return this.conicEvaluation;
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    public float getTolerance() {
        return this.tolerance;
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    public int calculateSize(boolean includeConvertedConics) {
        return this.implementation.calculateSize(includeConvertedConics);
    }

    @Override // androidx.compose.ui.graphics.PathIterator, java.util.Iterator
    public boolean hasNext() {
        return this.implementation.hasNext();
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    public PathSegment.Type next(float[] outPoints, int offset) {
        return AndroidPathIterator_androidKt.access$toPathSegmentType(this.implementation.next(outPoints, offset));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.graphics.PathIterator, java.util.Iterator
    public PathSegment next() {
        float[] p = this.segmentPoints;
        if (p.length < 8) goto L5;
        PathSegment.Type type = AndroidPathIterator_androidKt.access$toPathSegmentType(this.implementation.next(p, 0));
        if (type != PathSegment.Type.Done) goto L11;
        return PathSegmentKt.getDoneSegment();
    L11:
        if (type != PathSegment.Type.Close) goto L15;
        return PathSegmentKt.getCloseSegment();
    L15:
        switch(WhenMappings.$EnumSwitchMapping$1[type.ordinal()]) {
            case 1: goto L21;
            case 2: goto L20;
            case 3: goto L19;
            case 4: goto L18;
            case 5: goto L17;
            default: goto L16;
        };
    L16:
        float[] points = new float[0];
    L23:
        if (type != PathSegment.Type.Conic) goto L25;
        float r4 = p[6];
    L27:
        return new PathSegment(type, points, r4);
    L25:
        r4 = 0.0f;
        goto L27
    L17:
        points = new float[]{p[0], p[1], p[2], p[3], p[4], p[5], p[6], p[7]};
        goto L23
    L18:
        points = new float[]{p[0], p[1], p[2], p[3], p[4], p[5]};
        goto L23
    L19:
        points = new float[]{p[0], p[1], p[2], p[3], p[4], p[5]};
        goto L23
    L20:
        points = new float[]{p[0], p[1], p[2], p[3]};
        goto L23
    L21:
        points = new float[]{p[0], p[1]};
        goto L23
    L5:
        return PathSegmentKt.getDoneSegment();
    }
}
