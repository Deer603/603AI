package androidx.compose.ui.graphics;

import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CanvasUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/CanvasUtils;", "", "()V", "inorderBarrierMethod", "Ljava/lang/reflect/Method;", "orderMethodsFetched", "", "reorderBarrierMethod", "enableZ", "", "canvas", "Landroid/graphics/Canvas;", "enable", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CanvasUtils {
    public static final CanvasUtils INSTANCE = null;
    private static Method inorderBarrierMethod;
    private static boolean orderMethodsFetched;
    private static Method reorderBarrierMethod;

    static {
        INSTANCE = new CanvasUtils();
    }

    private CanvasUtils() {
    }

    public final void enableZ(android.graphics.Canvas canvas, boolean enable) {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        CanvasZHelper.INSTANCE.enableZ(canvas, enable);
        return;
    L6:
        if (orderMethodsFetched == false) goto L44;
    L29:
        if (enable == true) goto L42;
    L37:
        if (enable == false) goto L39;
        return;
    L39:
        if (inorderBarrierMethod == null) goto L50;
        Method r0 = inorderBarrierMethod;     // Catch: InvocationTargetException -> L33 IllegalAccessException -> L35
        Intrinsics.checkNotNull(r0);     // Catch: InvocationTargetException -> L33 IllegalAccessException -> L35
        r0.invoke(canvas, new Object[0]);     // Catch: InvocationTargetException -> L33 IllegalAccessException -> L35
        return;
    L48:
        return;
    L47:
        return;
    L50:
        return;
    L42:
        if (reorderBarrierMethod == null) goto L37;
        Method r1 = reorderBarrierMethod;     // Catch: InvocationTargetException -> L33 IllegalAccessException -> L35
        Intrinsics.checkNotNull(r1);     // Catch: InvocationTargetException -> L33 IllegalAccessException -> L35
        r1.invoke(canvas, new Object[0]);     // Catch: InvocationTargetException -> L33 IllegalAccessException -> L35
        goto L37
    L44:
        if (Build.VERSION.SDK_INT != 28) goto L12;
        Method getDeclaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, new Class[0].getClass()});     // Catch: NoSuchMethodException -> L22 InvocationTargetException -> L24 IllegalAccessException -> L26
        reorderBarrierMethod = (Method) getDeclaredMethod.invoke(android.graphics.Canvas.class, new Object[]{"insertReorderBarrier", new Class[0]});     // Catch: NoSuchMethodException -> L22 InvocationTargetException -> L24 IllegalAccessException -> L26
        inorderBarrierMethod = (Method) getDeclaredMethod.invoke(android.graphics.Canvas.class, new Object[]{"insertInorderBarrier", new Class[0]});     // Catch: NoSuchMethodException -> L22 InvocationTargetException -> L24 IllegalAccessException -> L26
    L13:
        Method r2 = reorderBarrierMethod;     // Catch: NoSuchMethodException -> L22 InvocationTargetException -> L24 IllegalAccessException -> L26
        if (r2 == null) goto L17;
        r2.setAccessible(true);     // Catch: NoSuchMethodException -> L22 InvocationTargetException -> L24 IllegalAccessException -> L26
    L17:
        Method r3 = inorderBarrierMethod;     // Catch: NoSuchMethodException -> L22 InvocationTargetException -> L24 IllegalAccessException -> L26
        if (r3 == null) goto L27;
        r3.setAccessible(true);     // Catch: NoSuchMethodException -> L22 InvocationTargetException -> L24 IllegalAccessException -> L26
        goto L27
    L12:
        reorderBarrierMethod = android.graphics.Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);     // Catch: NoSuchMethodException -> L22 InvocationTargetException -> L24 IllegalAccessException -> L26
        inorderBarrierMethod = android.graphics.Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);     // Catch: NoSuchMethodException -> L22 InvocationTargetException -> L24 IllegalAccessException -> L26
    L27:
        orderMethodsFetched = true;
        goto L29
    }
}
