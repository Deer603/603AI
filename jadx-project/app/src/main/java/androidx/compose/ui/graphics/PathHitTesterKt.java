package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* JADX INFO: compiled from: PathHitTester.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"EmptyPath", "Landroidx/compose/ui/graphics/Path;", "PathHitTester", "Landroidx/compose/ui/graphics/PathHitTester;", "path", "tolerance", "", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PathHitTesterKt {
    private static final Path EmptyPath = null;

    public static final /* synthetic */ Path access$getEmptyPath$p() {
        return EmptyPath;
    }

    public static /* synthetic */ PathHitTester PathHitTester$default(Path r0, float r1, int r2, Object r3) {
        if ((r2 & 2) == 0) goto L6;
        r1 = 0.5f;
    L6:
        return PathHitTester(r0, r1);
    }

    public static final PathHitTester PathHitTester(Path path, float tolerance) {
        PathHitTester $this$PathHitTester_u24lambda_u240 = new PathHitTester();
        $this$PathHitTester_u24lambda_u240.updatePath(path, tolerance);
        return $this$PathHitTester_u24lambda_u240;
    }

    static {
        EmptyPath = AndroidPath_androidKt.Path();
    }
}
