package androidx.graphics.path;

import kotlin.Metadata;

/* JADX INFO: compiled from: PathIteratorImpl.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\"\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"PathSegmentTypes", "", "Landroidx/graphics/path/PathSegment$Type;", "[Landroidx/graphics/path/PathSegment$Type;", "platformToAndroidXSegmentType", "platformType", "", "graphics-path_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PathIteratorImplKt {
    private static final PathSegment.Type[] PathSegmentTypes = null;

    public static final /* synthetic */ PathSegment.Type[] access$getPathSegmentTypes$p() {
        return PathSegmentTypes;
    }

    public static final /* synthetic */ PathSegment.Type access$platformToAndroidXSegmentType(int platformType) {
        return platformToAndroidXSegmentType(platformType);
    }

    private static final PathSegment.Type platformToAndroidXSegmentType(int platformType) {
        switch(platformType) {
            case 0: goto L12;
            case 1: goto L18;
            case 2: goto L17;
            case 3: goto L16;
            case 4: goto L15;
            case 5: goto L14;
            case 6: goto L13;
            default: goto L4;
        };
    L4:
        throw new IllegalArgumentException("Unknown path segment type " + platformType);
    L13:
        return PathSegment.Type.Done;
    L14:
        return PathSegment.Type.Close;
    L15:
        return PathSegment.Type.Cubic;
    L16:
        return PathSegment.Type.Conic;
    L17:
        return PathSegment.Type.Quadratic;
    L18:
        return PathSegment.Type.Line;
    L12:
        return PathSegment.Type.Move;
    }

    static {
        PathSegmentTypes = PathSegment.Type.values();
    }
}
