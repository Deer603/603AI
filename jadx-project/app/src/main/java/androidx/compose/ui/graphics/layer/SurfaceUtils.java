package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.view.Surface;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LayerSnapshot.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0003J\n\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/graphics/layer/SurfaceUtils;", "", "()V", "hasRetrievedMethod", "", "lockHardwareCanvasMethod", "Ljava/lang/reflect/Method;", "isLockHardwareCanvasAvailable", "lockCanvas", "Landroid/graphics/Canvas;", "surface", "Landroid/view/Surface;", "lockCanvasFallback", "resolveLockHardwareCanvasMethod", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SurfaceUtils {
    public static final SurfaceUtils INSTANCE = null;
    private static boolean hasRetrievedMethod;
    private static Method lockHardwareCanvasMethod;

    static {
        INSTANCE = new SurfaceUtils();
    }

    private SurfaceUtils() {
    }

    public final Canvas lockCanvas(Surface surface) {
        return SurfaceVerificationHelper.INSTANCE.lockHardwareCanvas(surface);
    }

    public final boolean isLockHardwareCanvasAvailable() {
        return true;
    }

    private final Method resolveLockHardwareCanvasMethod() {
        monitor-enter(this);
        Method method = lockHardwareCanvasMethod;     // Catch: Throwable -> L9
        if (hasRetrievedMethod == true) goto L14;
        hasRetrievedMethod = true;     // Catch: Throwable -> L9
        Method it = Surface.class.getDeclaredMethod("lockHardwareCanvas", new Class[0]);     // Catch: Throwable -> L9
        it.setAccessible(true);     // Catch: Throwable -> L9
        lockHardwareCanvasMethod = it;     // Catch: Throwable -> L9
        method = it;
    L14:
        monitor-exit(this);
        return method;
    L21:
        lockHardwareCanvasMethod = null;     // Catch: Throwable -> L16
        method = null;
    L16:
        th = move-exception;
        throw th;
    }

    private final Canvas lockCanvasFallback(Surface surface) {
        Method method = resolveLockHardwareCanvasMethod();
        if (method == null) goto L6;
        Object r1 = method.invoke(surface, new Object[0]);
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type android.graphics.Canvas");
        return (Canvas) r1;
    L6:
        return surface.lockCanvas(null);
    }
}
