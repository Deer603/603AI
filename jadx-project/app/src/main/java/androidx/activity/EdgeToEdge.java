package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EdgeToEdge.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u000b\u001a\u00020\f*\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0002\b\u0011\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u0006\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\u0005\"\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"DefaultDarkScrim", "", "getDefaultDarkScrim$annotations", "()V", "getDefaultDarkScrim", "()I", "DefaultLightScrim", "getDefaultLightScrim$annotations", "getDefaultLightScrim", "Impl", "Landroidx/activity/EdgeToEdgeImpl;", "enableEdgeToEdge", "", "Landroidx/activity/ComponentActivity;", "statusBarStyle", "Landroidx/activity/SystemBarStyle;", "navigationBarStyle", "enable", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class EdgeToEdge {
    private static final int DefaultDarkScrim = 0;
    private static final int DefaultLightScrim = 0;
    private static EdgeToEdgeImpl Impl;

    public static /* synthetic */ void getDefaultDarkScrim$annotations() {
    }

    public static /* synthetic */ void getDefaultLightScrim$annotations() {
    }

    static {
        DefaultLightScrim = Color.argb(230, 255, 255, 255);
        DefaultDarkScrim = Color.argb(128, 27, 27, 27);
    }

    public static final int getDefaultLightScrim() {
        return DefaultLightScrim;
    }

    public static final int getDefaultDarkScrim() {
        return DefaultDarkScrim;
    }

    public static /* synthetic */ void enable$default(ComponentActivity r6, SystemBarStyle r7, SystemBarStyle r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r7 = SystemBarStyle.Companion.auto$default(SystemBarStyle.Companion, 0, 0, null, 4, null);
    L6:
        if ((r9 & 2) == 0) goto L8;
        r8 = SystemBarStyle.Companion.auto$default(SystemBarStyle.Companion, DefaultLightScrim, DefaultDarkScrim, null, 4, null);
    L8:
        enable(r6, r7, r8);
    }

    public static final void enable(ComponentActivity $this$enableEdgeToEdge, SystemBarStyle statusBarStyle, SystemBarStyle navigationBarStyle) {
        Intrinsics.checkNotNullParameter($this$enableEdgeToEdge, "<this>");
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        View view = $this$enableEdgeToEdge.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(view, "window.decorView");
        Function1<Resources, Boolean> r0 = statusBarStyle.getDetectDarkMode$activity_release();
        Resources r1 = view.getResources();
        Intrinsics.checkNotNullExpressionValue(r1, "view.resources");
        boolean statusBarIsDark = r0.invoke(r1).booleanValue();
        Function1<Resources, Boolean> r2 = navigationBarStyle.getDetectDarkMode$activity_release();
        Resources r3 = view.getResources();
        Intrinsics.checkNotNullExpressionValue(r3, "view.resources");
        boolean navigationBarIsDark = r2.invoke(r3).booleanValue();
        EdgeToEdgeImpl r4 = Impl;
        if (r4 == null) goto L5;
        EdgeToEdgeImpl impl = r4;
    L16:
        Window r5 = $this$enableEdgeToEdge.getWindow();
        Intrinsics.checkNotNullExpressionValue(r5, "window");
        impl.setUp(statusBarStyle, navigationBarStyle, r5, view, statusBarIsDark, navigationBarIsDark);
        Window r10 = $this$enableEdgeToEdge.getWindow();
        Intrinsics.checkNotNullExpressionValue(r10, "window");
        impl.adjustLayoutInDisplayCutoutMode(r10);
        return;
    L5:
        if (Build.VERSION.SDK_INT < 30) goto L8;
        EdgeToEdgeApi26 r6 = new EdgeToEdgeApi30();
    L14:
        impl = r6;
        goto L16
    L8:
        if (Build.VERSION.SDK_INT < 29) goto L11;
        r6 = new EdgeToEdgeApi29();
        goto L14
    L11:
        if (Build.VERSION.SDK_INT < 28) goto L13;
        r6 = new EdgeToEdgeApi28();
        goto L14
    L13:
        r6 = new EdgeToEdgeApi26();
        goto L14
    }

    public static final void enable(ComponentActivity $this$enableEdgeToEdge) {
        Intrinsics.checkNotNullParameter($this$enableEdgeToEdge, "<this>");
        enable$default($this$enableEdgeToEdge, null, null, 3, null);
    }

    public static final void enable(ComponentActivity $this$enableEdgeToEdge, SystemBarStyle statusBarStyle) {
        Intrinsics.checkNotNullParameter($this$enableEdgeToEdge, "<this>");
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        enable$default($this$enableEdgeToEdge, statusBarStyle, null, 2, null);
    }
}
