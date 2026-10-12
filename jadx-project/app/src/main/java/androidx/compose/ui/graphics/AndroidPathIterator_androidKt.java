package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: AndroidPathIterator.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u001a\f\u0010\b\u001a\u00020\t*\u00020\nH\u0002¨\u0006\u000b"}, d2 = {"PathIterator", "Landroidx/compose/ui/graphics/PathIterator;", "path", "Landroidx/compose/ui/graphics/Path;", "conicEvaluation", "Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "tolerance", "", "toPathSegmentType", "Landroidx/compose/ui/graphics/PathSegment$Type;", "Landroidx/graphics/path/PathSegment$Type;", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidPathIterator_androidKt {

    /* JADX INFO: compiled from: AndroidPathIterator.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[androidx.graphics.path.PathSegment.Type.values().length];
            r0[androidx.graphics.path.PathSegment.Type.Move.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L26:
            r0[androidx.graphics.path.PathSegment.Type.Line.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L32:
            r0[androidx.graphics.path.PathSegment.Type.Quadratic.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L36:
            r0[androidx.graphics.path.PathSegment.Type.Conic.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L28:
            r0[androidx.graphics.path.PathSegment.Type.Cubic.ordinal()] = 5;     // Catch: NoSuchFieldError -> L17
        L30:
            r0[androidx.graphics.path.PathSegment.Type.Close.ordinal()] = 6;     // Catch: NoSuchFieldError -> L20
        L38:
            r0[androidx.graphics.path.PathSegment.Type.Done.ordinal()] = 7;     // Catch: NoSuchFieldError -> L23
        L24:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public static final /* synthetic */ PathSegment.Type access$toPathSegmentType(androidx.graphics.path.PathSegment.Type $receiver) {
        return toPathSegmentType($receiver);
    }

    public static /* synthetic */ PathIterator PathIterator$default(Path r0, PathIterator.ConicEvaluation r1, float r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r1 = PathIterator.ConicEvaluation.AsQuadratics;
    L6:
        if ((r3 & 4) == 0) goto L9;
        r2 = 0.25f;
    L9:
        return PathIterator(r0, r1, r2);
    }

    public static final PathIterator PathIterator(Path path, PathIterator.ConicEvaluation conicEvaluation, float tolerance) {
        return new AndroidPathIterator(path, conicEvaluation, tolerance);
    }

    private static final PathSegment.Type toPathSegmentType(androidx.graphics.path.PathSegment.Type $this$toPathSegmentType) {
        switch(WhenMappings.$EnumSwitchMapping$0[$this$toPathSegmentType.ordinal()]) {
            case 1: goto L13;
            case 2: goto L19;
            case 3: goto L18;
            case 4: goto L17;
            case 5: goto L16;
            case 6: goto L15;
            case 7: goto L14;
            default: goto L5;
        };
    L5:
        throw new NoWhenBranchMatchedException();
    L14:
        return PathSegment.Type.Done;
    L15:
        return PathSegment.Type.Close;
    L16:
        return PathSegment.Type.Cubic;
    L17:
        return PathSegment.Type.Conic;
    L18:
        return PathSegment.Type.Quadratic;
    L19:
        return PathSegment.Type.Line;
    L13:
        return PathSegment.Type.Move;
    }
}
