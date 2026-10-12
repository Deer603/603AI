package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.ReplaceWith;
import androidx.core.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewGroupCompat {
    private static final WindowInsets CONSUMED = null;
    public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
    public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;
    static boolean sCompatInsetsDispatchInstalled;

    static class Api21Impl {
        private Api21Impl() {
        }

        static void setTransitionGroup(ViewGroup viewGroup, boolean isTransitionGroup) {
            viewGroup.setTransitionGroup(isTransitionGroup);
        }

        static boolean isTransitionGroup(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        static int getNestedScrollAxes(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }
    }

    static {
        CONSUMED = WindowInsetsCompat.CONSUMED.toWindowInsets();
        sCompatInsetsDispatchInstalled = false;
    }

    private ViewGroupCompat() {
    }

    @ReplaceWith(expression = "group.onRequestSendAccessibilityEvent(child, event)")
    @Deprecated
    public static boolean onRequestSendAccessibilityEvent(ViewGroup group, View child, AccessibilityEvent event) {
        return group.onRequestSendAccessibilityEvent(child, event);
    }

    @ReplaceWith(expression = "group.setMotionEventSplittingEnabled(split)")
    @Deprecated
    public static void setMotionEventSplittingEnabled(ViewGroup group, boolean split) {
        group.setMotionEventSplittingEnabled(split);
    }

    @ReplaceWith(expression = "group.getLayoutMode()")
    @Deprecated
    public static int getLayoutMode(ViewGroup group) {
        return group.getLayoutMode();
    }

    @ReplaceWith(expression = "group.setLayoutMode(mode)")
    @Deprecated
    public static void setLayoutMode(ViewGroup group, int mode) {
        group.setLayoutMode(mode);
    }

    public static void setTransitionGroup(ViewGroup group, boolean isTransitionGroup) {
        Api21Impl.setTransitionGroup(group, isTransitionGroup);
    }

    public static boolean isTransitionGroup(ViewGroup group) {
        return Api21Impl.isTransitionGroup(group);
    }

    public static int getNestedScrollAxes(ViewGroup group) {
        return Api21Impl.getNestedScrollAxes(group);
    }

    public static void installCompatInsetsDispatch(View root) {
        if (Build.VERSION.SDK_INT < 30) goto L5;
        return;
    L5:
        View.OnApplyWindowInsetsListener listener = new ViewGroupCompat$$ExternalSyntheticLambda1();
        root.setTag(R.id.tag_compat_insets_dispatch, listener);
        root.setOnApplyWindowInsetsListener(listener);
        sCompatInsetsDispatchInstalled = true;
    }

    static /* synthetic */ WindowInsets lambda$installCompatInsetsDispatch$0(View view, WindowInsets windowInsets) {
        dispatchApplyWindowInsets(view, windowInsets);
        return CONSUMED;
    }

    static WindowInsets dispatchApplyWindowInsets(View view, WindowInsets windowInsets) {
        Object wrappedUserListener = view.getTag(R.id.tag_on_apply_window_listener);
        Object animCallback = view.getTag(R.id.tag_window_insets_animation_callback);
        if ((wrappedUserListener instanceof View.OnApplyWindowInsetsListener) == false) goto L6;
        final View.OnApplyWindowInsetsListener listener = (View.OnApplyWindowInsetsListener) wrappedUserListener;
    L9:
        final WindowInsets[] outInsets = new WindowInsets[1];
        view.setOnApplyWindowInsetsListener(new ViewGroupCompat$$ExternalSyntheticLambda0(outInsets, listener));
        view.dispatchApplyWindowInsets(windowInsets);
        Object compatInsetsDispatch = view.getTag(R.id.tag_compat_insets_dispatch);
        if ((compatInsetsDispatch instanceof View.OnApplyWindowInsetsListener) == false) goto L12;
        View.OnApplyWindowInsetsListener r5 = (View.OnApplyWindowInsetsListener) compatInsetsDispatch;
    L13:
        view.setOnApplyWindowInsetsListener(r5);
        if (outInsets[0] == null) goto L23;
        if (outInsets[0].isConsumed() == true) goto L23;
        if ((view instanceof ViewGroup) == false) goto L23;
        ViewGroup parent = (ViewGroup) view;
        int count = parent.getChildCount();
        int i = 0;
    L20:
        if (i >= count) goto L23;
        dispatchApplyWindowInsets(parent.getChildAt(i), outInsets[0]);
        i = i + 1;
    L23:
        return outInsets[0];
    L12:
        r5 = listener;
        goto L13
    L6:
        if ((animCallback instanceof View.OnApplyWindowInsetsListener) == false) goto L8;
        listener = (View.OnApplyWindowInsetsListener) animCallback;
        goto L9
    L8:
        listener = null;
        goto L9
    }

    static /* synthetic */ WindowInsets lambda$dispatchApplyWindowInsets$1(WindowInsets[] outInsets, View.OnApplyWindowInsetsListener listener, View v, WindowInsets w) {
        if (listener == null) goto L4;
        WindowInsets r0 = listener.onApplyWindowInsets(v, w);
    L5:
        outInsets[0] = r0;
        return CONSUMED;
    L4:
        r0 = v.onApplyWindowInsets(w);
        goto L5
    }
}
