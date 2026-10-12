package androidx.core.view;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.View$OnUnhandledKeyEventListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.ReplaceWith;
import androidx.collection.SimpleArrayMap;
import androidx.core.R;
import androidx.core.util.Preconditions;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.autofill.AutofillIdCompat;
import androidx.core.view.contentcapture.ContentCaptureSessionCompat;
import androidx.core.viewtree.ViewTree;
import androidx.webkit.ProxyConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class ViewCompat {
    private static final int[] ACCESSIBILITY_ACTIONS_RESOURCE_IDS = null;
    public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
    public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
    public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;

    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;

    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;

    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;

    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_AUTO = 0;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO = 2;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO_EXCLUDE_DESCENDANTS = 8;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES_EXCLUDE_DESCENDANTS = 4;

    @Deprecated
    public static final int LAYER_TYPE_HARDWARE = 2;

    @Deprecated
    public static final int LAYER_TYPE_NONE = 0;

    @Deprecated
    public static final int LAYER_TYPE_SOFTWARE = 1;

    @Deprecated
    public static final int LAYOUT_DIRECTION_INHERIT = 2;

    @Deprecated
    public static final int LAYOUT_DIRECTION_LOCALE = 3;

    @Deprecated
    public static final int LAYOUT_DIRECTION_LTR = 0;

    @Deprecated
    public static final int LAYOUT_DIRECTION_RTL = 1;

    @Deprecated
    public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;

    @Deprecated
    public static final int MEASURED_SIZE_MASK = 16777215;

    @Deprecated
    public static final int MEASURED_STATE_MASK = -16777216;

    @Deprecated
    public static final int MEASURED_STATE_TOO_SMALL = 16777216;
    private static final OnReceiveContentViewBehavior NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR = null;

    @Deprecated
    public static final int OVER_SCROLL_ALWAYS = 0;

    @Deprecated
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;

    @Deprecated
    public static final int OVER_SCROLL_NEVER = 2;
    public static final int SCROLL_AXIS_HORIZONTAL = 1;
    public static final int SCROLL_AXIS_NONE = 0;
    public static final int SCROLL_AXIS_VERTICAL = 2;
    public static final int SCROLL_INDICATOR_BOTTOM = 2;
    public static final int SCROLL_INDICATOR_END = 32;
    public static final int SCROLL_INDICATOR_LEFT = 4;
    public static final int SCROLL_INDICATOR_RIGHT = 8;
    public static final int SCROLL_INDICATOR_START = 16;
    public static final int SCROLL_INDICATOR_TOP = 1;
    private static final String TAG = "ViewCompat";
    public static final int TYPE_NON_TOUCH = 1;
    public static final int TYPE_TOUCH = 0;
    private static boolean sAccessibilityDelegateCheckFailed;
    private static Field sAccessibilityDelegateField;
    private static final AccessibilityPaneVisibilityManager sAccessibilityPaneVisibilityManager = null;
    private static Method sChildrenDrawingOrderMethod;
    private static Method sDispatchFinishTemporaryDetach;
    private static Method sDispatchStartTemporaryDetach;
    private static boolean sTempDetachBound;
    private static ThreadLocal<Rect> sThreadLocalRect;
    private static WeakHashMap<View, String> sTransitionNameMap;
    private static boolean sTryHiddenViewTransformMatrixToGlobal;
    private static WeakHashMap<View, ViewPropertyAnimatorCompat> sViewPropertyAnimatorMap;

    static class AccessibilityPaneVisibilityManager implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        private final WeakHashMap<View, Boolean> mPanesToVisible;

        AccessibilityPaneVisibilityManager() {
            this.mPanesToVisible = new WeakHashMap();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT >= 28) goto L8;
            Iterator<Map.Entry<View, Boolean>> r0 = this.mPanesToVisible.entrySet().iterator();
        L6:
            if (r0.hasNext() == false) goto L10;
            Map.Entry<View, Boolean> entry = r0.next();
            checkPaneVisibility(entry);
            goto L6
        L10:
            return;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            registerForLayoutCallback(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }

        void addAccessibilityPane(View pane) {
            WeakHashMap<View, Boolean> r0 = this.mPanesToVisible;
            if (pane.isShown() == true) goto L5;
        L7:
            boolean r1 = false;
        L8:
            r0.put(pane, Boolean.valueOf(r1));
            pane.addOnAttachStateChangeListener(this);
            if (pane.isAttachedToWindow() == false) goto L12;
            registerForLayoutCallback(pane);
            return;
        L12:
            return;
        L5:
            if (pane.getWindowVisibility() != 0) goto L7;
            r1 = true;
            goto L8
        }

        void removeAccessibilityPane(View pane) {
            this.mPanesToVisible.remove(pane);
            pane.removeOnAttachStateChangeListener(this);
            unregisterForLayoutCallback(pane);
        }

        private void checkPaneVisibility(Map.Entry<View, Boolean> panesToVisibleEntry) {
            View pane = panesToVisibleEntry.getKey();
            boolean oldVisibility = panesToVisibleEntry.getValue().booleanValue();
            if (pane.isShown() == true) goto L5;
        L7:
            boolean newVisibility = false;
        L8:
            if (oldVisibility == newVisibility) goto L14;
            if (newVisibility == false) goto L11;
            int contentChangeType = 16;
        L12:
            ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(pane, contentChangeType);
            panesToVisibleEntry.setValue(Boolean.valueOf(newVisibility));
            return;
        L11:
            contentChangeType = 32;
            goto L12
        L14:
            return;
        L5:
            if (pane.getWindowVisibility() != 0) goto L7;
            newVisibility = true;
            goto L8
        }

        private void registerForLayoutCallback(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void unregisterForLayoutCallback(View view) {
            ViewTreeObserver observer = view.getViewTreeObserver();
            observer.removeOnGlobalLayoutListener(this);
        }
    }

    static abstract class AccessibilityViewProperty<T> {
        private final int mContentChangeType;
        private final int mFrameworkMinimumSdk;
        private final int mTagKey;
        private final Class<T> mType;

        abstract T frameworkGet(View r1);

        abstract void frameworkSet(View r1, T r2);

        AccessibilityViewProperty(int tagKey, Class<T> type, int frameworkMinimumSdk) {
            this(tagKey, type, 0, frameworkMinimumSdk);
        }

        AccessibilityViewProperty(int tagKey, Class<T> type, int contentChangeType, int frameworkMinimumSdk) {
            this.mTagKey = tagKey;
            this.mType = type;
            this.mContentChangeType = contentChangeType;
            this.mFrameworkMinimumSdk = frameworkMinimumSdk;
        }

        void set(View view, T value) {
            if (frameworkAvailable() == false) goto L6;
            frameworkSet(view, value);
            return;
        L6:
            if (shouldUpdate(get(view), value) == false) goto L10;
            ViewCompat.ensureAccessibilityDelegateCompat(view);
            view.setTag(this.mTagKey, value);
            ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(view, this.mContentChangeType);
            return;
        }

        T get(View r3) {
            if (frameworkAvailable() == true) goto L5;
            T r0 = (T) r3.getTag(this.mTagKey);
            if (this.mType.isInstance(r0) == false) goto L9;
            return r0;
        L9:
            return null;
        L5:
            return frameworkGet(r3);
        }

        private boolean frameworkAvailable() {
            if (Build.VERSION.SDK_INT < this.mFrameworkMinimumSdk) goto L5;
            return true;
        L5:
            return false;
        }

        boolean shouldUpdate(T oldValue, T newValue) {
            return !newValue.equals(oldValue);
        }

        boolean booleanNullToFalseEquals(Boolean a, Boolean b) {
            if (a != null) goto L5;
        L7:
            boolean aBool = false;
        L8:
            if (b != null) goto L10;
        L12:
            boolean bBool = false;
        L13:
            if (aBool != bBool) goto L16;
            return true;
        L16:
            return false;
        L10:
            if (b.booleanValue() == false) goto L12;
            bBool = true;
            goto L13
        L5:
            if (a.booleanValue() == false) goto L7;
            aBool = true;
            goto L8
        }
    }

    static class Api20Impl {
        private Api20Impl() {
        }

        static void requestApplyInsets(View view) {
            view.requestApplyInsets();
        }

        static WindowInsets onApplyWindowInsets(View view, WindowInsets insets) {
            return view.onApplyWindowInsets(insets);
        }

        static WindowInsets dispatchApplyWindowInsets(View view, WindowInsets insets) {
            if (ViewGroupCompat.sCompatInsetsDispatchInstalled == false) goto L6;
            return ViewGroupCompat.dispatchApplyWindowInsets(view, insets);
        L6:
            return view.dispatchApplyWindowInsets(insets);
        }
    }

    private static class Api21Impl {
        private Api21Impl() {
        }

        public static WindowInsetsCompat getRootWindowInsets(View v) {
            return WindowInsetsCompat.Api21ReflectionHolder.getRootWindowInsets(v);
        }

        static WindowInsetsCompat computeSystemWindowInsets(View v, WindowInsetsCompat insets, Rect outLocalInsets) {
            WindowInsets platformInsets = insets.toWindowInsets();
            if (platformInsets != null) goto L5;
            outLocalInsets.setEmpty();
            return insets;
        L5:
            return WindowInsetsCompat.toWindowInsetsCompat(v.computeSystemWindowInsets(platformInsets, outLocalInsets), v);
        }

        static void setOnApplyWindowInsetsListener(final View v, final OnApplyWindowInsetsListener listener) {
            if (listener == null) goto L4;
            View.OnApplyWindowInsetsListener wrappedUserListener = new AnonymousClass1(v, listener);
        L6:
            if (Build.VERSION.SDK_INT >= 30) goto L8;
            v.setTag(R.id.tag_on_apply_window_listener, wrappedUserListener);
        L8:
            Object compatInsetsDispatch = v.getTag(R.id.tag_compat_insets_dispatch);
            if (compatInsetsDispatch == null) goto L11;
            return;
        L11:
            if (wrappedUserListener == null) goto L13;
            v.setOnApplyWindowInsetsListener(wrappedUserListener);
            return;
        L13:
            View.OnApplyWindowInsetsListener compatInsetsAnimationCallback = (View.OnApplyWindowInsetsListener) v.getTag(R.id.tag_window_insets_animation_callback);
            v.setOnApplyWindowInsetsListener(compatInsetsAnimationCallback);
            return;
        L4:
            wrappedUserListener = null;
            goto L6
        }

        static void callCompatInsetAnimationCallback(WindowInsets insets, View v) {
            View.OnApplyWindowInsetsListener insetsAnimationCallback = (View.OnApplyWindowInsetsListener) v.getTag(R.id.tag_window_insets_animation_callback);
            if (insetsAnimationCallback == null) goto L6;
            insetsAnimationCallback.onApplyWindowInsets(v, insets);
            return;
        }

        static boolean dispatchNestedFling(View view, float velocityX, float velocityY, boolean consumed) {
            return view.dispatchNestedFling(velocityX, velocityY, consumed);
        }

        static boolean dispatchNestedPreFling(View view, float velocityX, float velocityY) {
            return view.dispatchNestedPreFling(velocityX, velocityY);
        }

        static float getZ(View view) {
            return view.getZ();
        }

        static void setZ(View view, float z) {
            view.setZ(z);
        }

        static void setElevation(View view, float elevation) {
            view.setElevation(elevation);
        }

        static void setTranslationZ(View view, float translationZ) {
            view.setTranslationZ(translationZ);
        }

        static float getTranslationZ(View view) {
            return view.getTranslationZ();
        }

        static void setTransitionName(View view, String transitionName) {
            view.setTransitionName(transitionName);
        }

        static boolean isImportantForAccessibility(View view) {
            return view.isImportantForAccessibility();
        }

        static float getElevation(View view) {
            return view.getElevation();
        }

        static String getTransitionName(View view) {
            return view.getTransitionName();
        }

        static void setBackgroundTintList(View view, ColorStateList tint) {
            view.setBackgroundTintList(tint);
        }

        static ColorStateList getBackgroundTintList(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode getBackgroundTintMode(View view) {
            return view.getBackgroundTintMode();
        }

        static void setBackgroundTintMode(View view, PorterDuff.Mode tintMode) {
            view.setBackgroundTintMode(tintMode);
        }

        static void setNestedScrollingEnabled(View view, boolean enabled) {
            view.setNestedScrollingEnabled(enabled);
        }

        static boolean isNestedScrollingEnabled(View view) {
            return view.isNestedScrollingEnabled();
        }

        static boolean startNestedScroll(View view, int axes) {
            return view.startNestedScroll(axes);
        }

        static void stopNestedScroll(View view) {
            view.stopNestedScroll();
        }

        static boolean hasNestedScrollingParent(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean dispatchNestedScroll(View view, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
            return view.dispatchNestedScroll(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow);
        }

        static boolean dispatchNestedPreScroll(View view, int dx, int dy, int[] consumed, int[] offsetInWindow) {
            return view.dispatchNestedPreScroll(dx, dy, consumed, offsetInWindow);
        }
    }

    private static class Api23Impl {
        private Api23Impl() {
        }

        public static WindowInsetsCompat getRootWindowInsets(View v) {
            WindowInsets wi = v.getRootWindowInsets();
            if (wi != null) goto L6;
            return null;
        L6:
            WindowInsetsCompat insets = WindowInsetsCompat.toWindowInsetsCompat(wi);
            insets.setRootWindowInsets(insets);
            insets.copyRootViewBounds(v.getRootView());
            return insets;
        }

        static void setScrollIndicators(View view, int indicators) {
            view.setScrollIndicators(indicators);
        }

        static void setScrollIndicators(View view, int indicators, int mask) {
            view.setScrollIndicators(indicators, mask);
        }

        static int getScrollIndicators(View view) {
            return view.getScrollIndicators();
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static void setPointerIcon(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        static boolean startDragAndDrop(View view, ClipData data, View.DragShadowBuilder shadowBuilder, Object myLocalState, int flags) {
            return view.startDragAndDrop(data, shadowBuilder, myLocalState, flags);
        }

        static void cancelDragAndDrop(View view) {
            view.cancelDragAndDrop();
        }

        static void updateDragShadow(View view, View.DragShadowBuilder shadowBuilder) {
            view.updateDragShadow(shadowBuilder);
        }

        static void dispatchStartTemporaryDetach(View view) {
            view.dispatchStartTemporaryDetach();
        }

        static void dispatchFinishTemporaryDetach(View view) {
            view.dispatchFinishTemporaryDetach();
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static void setAutofillHints(View view, String... autofillHints) {
            view.setAutofillHints(autofillHints);
        }

        static void setTooltipText(View view, CharSequence tooltipText) {
            view.setTooltipText(tooltipText);
        }

        static int getNextClusterForwardId(View view) {
            return view.getNextClusterForwardId();
        }

        static void setNextClusterForwardId(View view, int nextClusterForwardId) {
            view.setNextClusterForwardId(nextClusterForwardId);
        }

        static boolean isKeyboardNavigationCluster(View view) {
            return view.isKeyboardNavigationCluster();
        }

        static void setKeyboardNavigationCluster(View view, boolean isCluster) {
            view.setKeyboardNavigationCluster(isCluster);
        }

        static boolean isFocusedByDefault(View view) {
            return view.isFocusedByDefault();
        }

        static void setFocusedByDefault(View view, boolean isFocusedByDefault) {
            view.setFocusedByDefault(isFocusedByDefault);
        }

        static View keyboardNavigationClusterSearch(View view, View currentCluster, int direction) {
            return view.keyboardNavigationClusterSearch(currentCluster, direction);
        }

        static void addKeyboardNavigationClusters(View view, Collection<View> views, int direction) {
            view.addKeyboardNavigationClusters(views, direction);
        }

        static boolean restoreDefaultFocus(View view) {
            return view.restoreDefaultFocus();
        }

        static boolean hasExplicitFocusable(View view) {
            return view.hasExplicitFocusable();
        }

        static int getImportantForAutofill(View view) {
            return view.getImportantForAutofill();
        }

        static void setImportantForAutofill(View view, int mode) {
            view.setImportantForAutofill(mode);
        }

        static boolean isImportantForAutofill(View view) {
            return view.isImportantForAutofill();
        }

        public static AutofillId getAutofillId(View view) {
            return view.getAutofillId();
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static <T> T requireViewById(View r1, int r2) {
            return (T) r1.requireViewById(r2);
        }

        static CharSequence getAccessibilityPaneTitle(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static void setAccessibilityPaneTitle(View view, CharSequence accessibilityPaneTitle) {
            view.setAccessibilityPaneTitle(accessibilityPaneTitle);
        }

        static void setAccessibilityHeading(View view, boolean isHeading) {
            view.setAccessibilityHeading(isHeading);
        }

        static boolean isAccessibilityHeading(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean isScreenReaderFocusable(View view) {
            return view.isScreenReaderFocusable();
        }

        static void setScreenReaderFocusable(View view, boolean screenReaderFocusable) {
            view.setScreenReaderFocusable(screenReaderFocusable);
        }

        static void addOnUnhandledKeyEventListener(View v, final OnUnhandledKeyEventListenerCompat listener) {
            SimpleArrayMap<OnUnhandledKeyEventListenerCompat, View$OnUnhandledKeyEventListener> viewListeners = (SimpleArrayMap) v.getTag(R.id.tag_unhandled_key_listeners);
            if (viewListeners != null) goto L5;
            viewListeners = new SimpleArrayMap();
            v.setTag(R.id.tag_unhandled_key_listeners, viewListeners);
        L5:
            Objects.requireNonNull(listener);
            View$OnUnhandledKeyEventListener fwListener = new ViewCompat$Api28Impl$$ExternalSyntheticLambda0(listener);
            viewListeners.put(listener, fwListener);
            v.addOnUnhandledKeyEventListener(fwListener);
        }

        static void removeOnUnhandledKeyEventListener(View v, OnUnhandledKeyEventListenerCompat listener) {
            SimpleArrayMap<OnUnhandledKeyEventListenerCompat, View$OnUnhandledKeyEventListener> viewListeners = (SimpleArrayMap) v.getTag(R.id.tag_unhandled_key_listeners);
            if (viewListeners != null) goto L5;
            return;
        L5:
            View$OnUnhandledKeyEventListener fwListener = viewListeners.get(listener);
            if (fwListener == null) goto L9;
            v.removeOnUnhandledKeyEventListener(fwListener);
            return;
        }

        public static void setAutofillId(View view, AutofillIdCompat id) {
            if (id != null) goto L4;
            AutofillId r0 = null;
        L5:
            view.setAutofillId(r0);
            return;
        L4:
            r0 = id.toAutofillId();
            goto L5
        }
    }

    private static class Api29Impl {
        private Api29Impl() {
        }

        static void saveAttributeDataForStyleable(View view, Context context, int[] styleable, AttributeSet attrs, TypedArray t, int defStyleAttr, int defStyleRes) {
            view.saveAttributeDataForStyleable(context, styleable, attrs, t, defStyleAttr, defStyleRes);
        }

        static View.AccessibilityDelegate getAccessibilityDelegate(View view) {
            return view.getAccessibilityDelegate();
        }

        static void setSystemGestureExclusionRects(View view, List<Rect> rects) {
            view.setSystemGestureExclusionRects(rects);
        }

        static List<Rect> getSystemGestureExclusionRects(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static ContentCaptureSession getContentCaptureSession(View view) {
            return view.getContentCaptureSession();
        }

        static void setContentCaptureSession(View view, ContentCaptureSessionCompat contentCaptureSession) {
            if (contentCaptureSession != null) goto L4;
            ContentCaptureSession r0 = null;
        L5:
            view.setContentCaptureSession(r0);
            return;
        L4:
            r0 = contentCaptureSession.toContentCaptureSession();
            goto L5
        }

        static void transformMatrixToGlobal(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }
    }

    private static class Api30Impl {
        private Api30Impl() {
        }

        public static WindowInsetsControllerCompat getWindowInsetsController(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) goto L7;
            return null;
        L7:
            return WindowInsetsControllerCompat.toWindowInsetsControllerCompat(windowInsetsController);
        }

        static void setStateDescription(View view, CharSequence stateDescription) {
            view.setStateDescription(stateDescription);
        }

        static CharSequence getStateDescription(View view) {
            return view.getStateDescription();
        }

        static void setImportantForContentCapture(View view, int mode) {
            view.setImportantForContentCapture(mode);
        }

        static boolean isImportantForContentCapture(View view) {
            return view.isImportantForContentCapture();
        }

        static int getImportantForContentCapture(View view) {
            return view.getImportantForContentCapture();
        }

        static WindowInsets dispatchApplyWindowInsets(View view, WindowInsets insets) {
            return view.dispatchApplyWindowInsets(insets);
        }
    }

    private static final class Api31Impl {
        private Api31Impl() {
        }

        public static void setOnReceiveContentListener(View view, String[] mimeTypes, OnReceiveContentListener listener) {
            if (listener != null) goto L4;
            view.setOnReceiveContentListener(mimeTypes, null);
            return;
        L4:
            view.setOnReceiveContentListener(mimeTypes, new OnReceiveContentListenerAdapter(listener));
        }

        public static String[] getReceiveContentMimeTypes(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static ContentInfoCompat performReceiveContent(View view, ContentInfoCompat payload) {
            ContentInfo platPayload = payload.toContentInfo();
            ContentInfo platResult = view.performReceiveContent(platPayload);
            if (platResult != null) goto L6;
            return null;
        L6:
            if (platResult != platPayload) goto L9;
            return payload;
        L9:
            return ContentInfoCompat.toContentInfoCompat(platResult);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusRealDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FocusRelativeDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface NestedScrollType {
    }

    private static final class OnReceiveContentListenerAdapter implements android.view.OnReceiveContentListener {
        private final OnReceiveContentListener mJetpackListener;

        OnReceiveContentListenerAdapter(OnReceiveContentListener jetpackListener) {
            this.mJetpackListener = jetpackListener;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo platPayload) {
            ContentInfoCompat payload = ContentInfoCompat.toContentInfoCompat(platPayload);
            ContentInfoCompat result = this.mJetpackListener.onReceiveContent(view, payload);
            if (result != null) goto L6;
            return null;
        L6:
            if (result != payload) goto L9;
            return platPayload;
        L9:
            return result.toContentInfo();
        }
    }

    public interface OnUnhandledKeyEventListenerCompat {
        boolean onUnhandledKeyEvent(View r1, KeyEvent r2);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollAxis {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollIndicators {
    }

    static class UnhandledKeyEventManager {
        private static final ArrayList<WeakReference<View>> sViewsWithListeners = null;
        private SparseArray<WeakReference<View>> mCapturedKeys;
        private WeakReference<KeyEvent> mLastDispatchedPreViewKeyEvent;
        private WeakHashMap<View, Boolean> mViewsContainingListeners;

        UnhandledKeyEventManager() {
            this.mViewsContainingListeners = null;
            this.mCapturedKeys = null;
            this.mLastDispatchedPreViewKeyEvent = null;
        }

        static {
            sViewsWithListeners = new ArrayList();
        }

        private SparseArray<WeakReference<View>> getCapturedKeys() {
            if (this.mCapturedKeys != null) goto L6;
            this.mCapturedKeys = new SparseArray();
        L6:
            return this.mCapturedKeys;
        }

        static UnhandledKeyEventManager at(View root) {
            UnhandledKeyEventManager manager = (UnhandledKeyEventManager) root.getTag(R.id.tag_unhandled_key_event_manager);
            if (manager != null) goto L6;
            UnhandledKeyEventManager manager2 = new UnhandledKeyEventManager();
            root.setTag(R.id.tag_unhandled_key_event_manager, manager2);
            return manager2;
        L6:
            return manager;
        }

        boolean dispatch(View root, KeyEvent event) {
            if (event.getAction() != 0) goto L5;
            recalcViewsWithUnhandled();
        L5:
            View consumer = dispatchInOrder(root, event);
            if (event.getAction() != 0) goto L12;
            int keycode = event.getKeyCode();
            if (consumer == null) goto L12;
            if (KeyEvent.isModifierKey(keycode) == true) goto L12;
            getCapturedKeys().put(keycode, new WeakReference(consumer));
        L12:
            if (consumer == null) goto L14;
            return true;
        L14:
            return false;
        }

        private View dispatchInOrder(View view, KeyEvent event) {
            if (this.mViewsContainingListeners != null) goto L5;
        L19:
            return null;
        L5:
            if (this.mViewsContainingListeners.containsKey(view) == false) goto L19;
            if ((view instanceof ViewGroup) == false) goto L16;
            ViewGroup vg = (ViewGroup) view;
            int i = vg.getChildCount() - 1;
        L10:
            if (i < 0) goto L16;
            View v = vg.getChildAt(i);
            View consumer = dispatchInOrder(v, event);
            if (consumer != null) goto L13;
            i = i - 1;
            goto L10
        L13:
            return consumer;
        L16:
            if (onUnhandledKeyEvent(view, event) == false) goto L18;
            return view;
        L18:
            return null;
        }

        boolean preDispatch(KeyEvent event) {
            if (this.mLastDispatchedPreViewKeyEvent != null) goto L5;
        L7:
            this.mLastDispatchedPreViewKeyEvent = new WeakReference(event);
            WeakReference<View> currentReceiver = null;
            SparseArray<WeakReference<View>> capturedKeys = getCapturedKeys();
            if (event.getAction() != 1) goto L12;
            int idx = capturedKeys.indexOfKey(event.getKeyCode());
            if (idx < 0) goto L12;
            currentReceiver = capturedKeys.valueAt(idx);
            capturedKeys.removeAt(idx);
        L12:
            if (currentReceiver != null) goto L14;
            currentReceiver = capturedKeys.get(event.getKeyCode());
        L14:
            if (currentReceiver == null) goto L21;
            View target = currentReceiver.get();
            if (target != null) goto L18;
        L20:
            return true;
        L18:
            if (target.isAttachedToWindow() == false) goto L20;
            onUnhandledKeyEvent(target, event);
            goto L20
        L21:
            return false;
        L5:
            if (this.mLastDispatchedPreViewKeyEvent.get() != event) goto L7;
            return false;
        }

        private boolean onUnhandledKeyEvent(View v, KeyEvent event) {
            ArrayList<OnUnhandledKeyEventListenerCompat> viewListeners = (ArrayList) v.getTag(R.id.tag_unhandled_key_listeners);
            if (viewListeners == null) goto L10;
            int i = viewListeners.size() - 1;
        L5:
            if (i < 0) goto L14;
            if (viewListeners.get(i).onUnhandledKeyEvent(v, event) == true) goto L8;
            i = i - 1;
            goto L5
        L8:
            return true;
        L14:
            return false;
        L10:
            return false;
        }

        static void registerListeningView(View v) {
            ArrayList<WeakReference<View>> r0 = sViewsWithListeners;
            monitor-enter(r0);
            Iterator<WeakReference<View>> r1 = sViewsWithListeners.iterator();     // Catch: Throwable -> L15
        L6:
            if (r1.hasNext() == false) goto L12;
            WeakReference<View> wv = r1.next();     // Catch: Throwable -> L15
            if (wv.get() != v) goto L6;
            monitor-exit(r0);     // Catch: Throwable -> L15
            return;
        L12:
            sViewsWithListeners.add(new WeakReference(v));     // Catch: Throwable -> L15
            monitor-exit(r0);     // Catch: Throwable -> L15
            return;
        L15:
            th = move-exception;
            throw th;
        }

        static void unregisterListeningView(View v) {
            ArrayList<WeakReference<View>> r0 = sViewsWithListeners;
            monitor-enter(r0);
            int i = 0;
        L18:
        L15:
            th = move-exception;
            throw th;
        L6:
            if (i >= sViewsWithListeners.size()) goto L13;
            if (sViewsWithListeners.get(i).get() == v) goto L9;
            i = i + 1;     // Catch: Throwable -> L15
            goto L18
        L9:
            sViewsWithListeners.remove(i);     // Catch: Throwable -> L15
            monitor-exit(r0);     // Catch: Throwable -> L15
            return;
        L13:
            monitor-exit(r0);     // Catch: Throwable -> L15
        }

        private void recalcViewsWithUnhandled() {
            if (this.mViewsContainingListeners == null) goto L6;
            this.mViewsContainingListeners.clear();
        L6:
            if (sViewsWithListeners.isEmpty() == false) goto L8;
            return;
        L8:
            ArrayList<WeakReference<View>> r0 = sViewsWithListeners;
            monitor-enter(r0);
        L25:
            th = move-exception;
            throw th;
        L11:
            if (this.mViewsContainingListeners != null) goto L13;
            this.mViewsContainingListeners = new WeakHashMap();     // Catch: Throwable -> L25
        L13:
            int i = sViewsWithListeners.size() - 1;     // Catch: Throwable -> L25
        L14:
            if (i < 0) goto L23;
            WeakReference<View> vw = sViewsWithListeners.get(i);     // Catch: Throwable -> L25
            View v = vw.get();     // Catch: Throwable -> L25
            if (v != null) goto L18;
            sViewsWithListeners.remove(i);     // Catch: Throwable -> L25
        L22:
            i = i - 1;     // Catch: Throwable -> L25
            goto L14
        L18:
            this.mViewsContainingListeners.put(v, Boolean.TRUE);     // Catch: Throwable -> L25
            ViewParent nxt = v.getParent();     // Catch: Throwable -> L25
        L20:
            if ((nxt instanceof View) == false) goto L22;
            this.mViewsContainingListeners.put((View) nxt, Boolean.TRUE);     // Catch: Throwable -> L25
            nxt = nxt.getParent();     // Catch: Throwable -> L25
            goto L20
        L23:
            monitor-exit(r0);     // Catch: Throwable -> L25
        }
    }

    static {
        sViewPropertyAnimatorMap = null;
        sAccessibilityDelegateCheckFailed = false;
        sTryHiddenViewTransformMatrixToGlobal = true;
        ACCESSIBILITY_ACTIONS_RESOURCE_IDS = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR = new ViewCompat$$ExternalSyntheticLambda0();
        sAccessibilityPaneVisibilityManager = new AccessibilityPaneVisibilityManager();
    }

    private static Rect getEmptyTempRect() {
        if (sThreadLocalRect != null) goto L5;
        sThreadLocalRect = new ThreadLocal();
    L5:
        Rect rect = sThreadLocalRect.get();
        if (rect != null) goto L8;
        rect = new Rect();
        sThreadLocalRect.set(rect);
    L8:
        rect.setEmpty();
        return rect;
    }

    public static void saveAttributeDataForStyleable(View view, Context context, int[] styleable, AttributeSet attrs, TypedArray t, int defStyleAttr, int defStyleRes) {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        Api29Impl.saveAttributeDataForStyleable(view, context, styleable, attrs, t, defStyleAttr, defStyleRes);
        return;
    }

    @ReplaceWith(expression = "view.canScrollHorizontally(direction)")
    @Deprecated
    public static boolean canScrollHorizontally(View view, int direction) {
        return view.canScrollHorizontally(direction);
    }

    @ReplaceWith(expression = "view.canScrollVertically(direction)")
    @Deprecated
    public static boolean canScrollVertically(View view, int direction) {
        return view.canScrollVertically(direction);
    }

    @ReplaceWith(expression = "view.getOverScrollMode()")
    @Deprecated
    public static int getOverScrollMode(View view) {
        return view.getOverScrollMode();
    }

    @ReplaceWith(expression = "view.setOverScrollMode(overScrollMode)")
    @Deprecated
    public static void setOverScrollMode(View view, int overScrollMode) {
        view.setOverScrollMode(overScrollMode);
    }

    @ReplaceWith(expression = "v.onPopulateAccessibilityEvent(event)")
    @Deprecated
    public static void onPopulateAccessibilityEvent(View v, AccessibilityEvent event) {
        v.onPopulateAccessibilityEvent(event);
    }

    @ReplaceWith(expression = "v.onInitializeAccessibilityEvent(event)")
    @Deprecated
    public static void onInitializeAccessibilityEvent(View v, AccessibilityEvent event) {
        v.onInitializeAccessibilityEvent(event);
    }

    @ReplaceWith(expression = "v.onInitializeAccessibilityNodeInfo(info.unwrap())")
    @Deprecated
    public static void onInitializeAccessibilityNodeInfo(View v, AccessibilityNodeInfoCompat info) {
        v.onInitializeAccessibilityNodeInfo(info.unwrap());
    }

    public static void setAccessibilityDelegate(View v, AccessibilityDelegateCompat delegate) {
        if (delegate == null) goto L4;
    L6:
        setImportantForAccessibilityIfNeeded(v);
        if (delegate != null) goto L9;
        View.AccessibilityDelegate r0 = null;
    L10:
        v.setAccessibilityDelegate(r0);
        return;
    L9:
        r0 = delegate.getBridge();
        goto L10
    L4:
        if ((getAccessibilityDelegateInternal(v) instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter) == false) goto L6;
        delegate = new AccessibilityDelegateCompat();
        goto L6
    }

    public static void setAutofillHints(View view, String... autofillHints) {
        Api26Impl.setAutofillHints(view, autofillHints);
    }

    public static int getImportantForAutofill(View v) {
        return Api26Impl.getImportantForAutofill(v);
    }

    public static void setImportantForAutofill(View v, int mode) {
        Api26Impl.setImportantForAutofill(v, mode);
    }

    public static boolean isImportantForAutofill(View v) {
        return Api26Impl.isImportantForAutofill(v);
    }

    public static AutofillIdCompat getAutofillId(View v) {
        return AutofillIdCompat.toAutofillIdCompat(Api26Impl.getAutofillId(v));
    }

    public static void setAutofillId(View v, AutofillIdCompat id) {
        if (Build.VERSION.SDK_INT < 28) goto L6;
        Api28Impl.setAutofillId(v, id);
        return;
    }

    public static void setImportantForContentCapture(View v, int mode) {
        if (Build.VERSION.SDK_INT < 30) goto L6;
        Api30Impl.setImportantForContentCapture(v, mode);
        return;
    }

    public static int getImportantForContentCapture(View v) {
        if (Build.VERSION.SDK_INT >= 30) goto L5;
        return 0;
    L5:
        return Api30Impl.getImportantForContentCapture(v);
    }

    public static boolean isImportantForContentCapture(View v) {
        if (Build.VERSION.SDK_INT >= 30) goto L5;
        return false;
    L5:
        return Api30Impl.isImportantForContentCapture(v);
    }

    public static ContentCaptureSessionCompat getContentCaptureSession(View v) {
        if (Build.VERSION.SDK_INT < 29) goto L9;
        ContentCaptureSession session = Api29Impl.getContentCaptureSession(v);
        if (session != null) goto L8;
        return null;
    L8:
        return ContentCaptureSessionCompat.toContentCaptureSessionCompat(session, v);
    L9:
        return null;
    }

    public static void setContentCaptureSession(View v, ContentCaptureSessionCompat contentCaptureSession) {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        Api29Impl.setContentCaptureSession(v, contentCaptureSession);
        return;
    }

    public static boolean hasAccessibilityDelegate(View view) {
        if (getAccessibilityDelegateInternal(view) == null) goto L5;
        return true;
    L5:
        return false;
    }

    public static AccessibilityDelegateCompat getAccessibilityDelegate(View view) {
        View.AccessibilityDelegate delegate = getAccessibilityDelegateInternal(view);
        if (delegate != null) goto L7;
        return null;
    L7:
        if ((delegate instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter) == false) goto L11;
        return ((AccessibilityDelegateCompat.AccessibilityDelegateAdapter) delegate).mCompat;
    L11:
        return new AccessibilityDelegateCompat(delegate);
    }

    static void ensureAccessibilityDelegateCompat(View v) {
        AccessibilityDelegateCompat delegateCompat = getAccessibilityDelegate(v);
        if (delegateCompat != null) goto L5;
        delegateCompat = new AccessibilityDelegateCompat();
    L5:
        setAccessibilityDelegate(v, delegateCompat);
    }

    private static View.AccessibilityDelegate getAccessibilityDelegateInternal(View v) {
        if (Build.VERSION.SDK_INT < 29) goto L7;
        return Api29Impl.getAccessibilityDelegate(v);
    L7:
        return getAccessibilityDelegateThroughReflection(v);
    }

    private static View.AccessibilityDelegate getAccessibilityDelegateThroughReflection(View v) {
        if (sAccessibilityDelegateCheckFailed == false) goto L6;
        return null;
    L6:
        if (sAccessibilityDelegateField != null) goto L22;
        sAccessibilityDelegateField = View.class.getDeclaredField("mAccessibilityDelegate");     // Catch: Throwable -> L9
        sAccessibilityDelegateField.setAccessible(true);     // Catch: Throwable -> L9
    L10:
        sAccessibilityDelegateCheckFailed = true;
        return null;
    L22:
        Object o = sAccessibilityDelegateField.get(v);     // Catch: Throwable -> L17
        if ((o instanceof View.AccessibilityDelegate) == false) goto L16;
        return (View.AccessibilityDelegate) o;
    L16:
        return null;
    L18:
        sAccessibilityDelegateCheckFailed = true;
        return null;
    }

    @ReplaceWith(expression = "view.hasTransientState()")
    @Deprecated
    public static boolean hasTransientState(View view) {
        return view.hasTransientState();
    }

    @ReplaceWith(expression = "view.setHasTransientState(hasTransientState)")
    @Deprecated
    public static void setHasTransientState(View view, boolean hasTransientState) {
        view.setHasTransientState(hasTransientState);
    }

    @ReplaceWith(expression = "view.postInvalidateOnAnimation()")
    @Deprecated
    public static void postInvalidateOnAnimation(View view) {
        view.postInvalidateOnAnimation();
    }

    @ReplaceWith(expression = "view.postInvalidateOnAnimation(left, top, right, bottom)")
    @Deprecated
    public static void postInvalidateOnAnimation(View view, int left, int top, int right, int bottom) {
        view.postInvalidateOnAnimation(left, top, right, bottom);
    }

    @ReplaceWith(expression = "view.postOnAnimation(action)")
    @Deprecated
    public static void postOnAnimation(View view, Runnable action) {
        view.postOnAnimation(action);
    }

    @ReplaceWith(expression = "view.postOnAnimationDelayed(action, delayMillis)")
    @Deprecated
    public static void postOnAnimationDelayed(View view, Runnable action, long delayMillis) {
        view.postOnAnimationDelayed(action, delayMillis);
    }

    @ReplaceWith(expression = "view.getImportantForAccessibility()")
    @Deprecated
    public static int getImportantForAccessibility(View view) {
        return view.getImportantForAccessibility();
    }

    @ReplaceWith(expression = "view.setImportantForAccessibility(mode)")
    @Deprecated
    public static void setImportantForAccessibility(View view, int mode) {
        view.setImportantForAccessibility(mode);
    }

    public static boolean isImportantForAccessibility(View view) {
        return Api21Impl.isImportantForAccessibility(view);
    }

    @ReplaceWith(expression = "view.performAccessibilityAction(action, arguments)")
    @Deprecated
    public static boolean performAccessibilityAction(View view, int action, Bundle arguments) {
        return view.performAccessibilityAction(action, arguments);
    }

    public static boolean performHapticFeedback(View view, int feedbackConstant) {
        int feedbackConstant2 = HapticFeedbackConstantsCompat.getFeedbackConstantOrFallback(feedbackConstant);
        if (feedbackConstant2 != (-1)) goto L7;
        return false;
    L7:
        return view.performHapticFeedback(feedbackConstant2);
    }

    public static boolean performHapticFeedback(View view, int feedbackConstant, int flags) {
        int feedbackConstant2 = HapticFeedbackConstantsCompat.getFeedbackConstantOrFallback(feedbackConstant);
        if (feedbackConstant2 != (-1)) goto L7;
        return false;
    L7:
        return view.performHapticFeedback(feedbackConstant2, flags);
    }

    public static int addAccessibilityAction(View view, CharSequence label, AccessibilityViewCommand command) {
        int actionId = getAvailableActionIdFromResources(view, label);
        if (actionId == (-1)) goto L5;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat action = new AccessibilityNodeInfoCompat.AccessibilityActionCompat(actionId, label, command);
        addAccessibilityAction(view, action);
    L5:
        return actionId;
    }

    private static int getAvailableActionIdFromResources(View view, CharSequence label) {
        int result = -1;
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actions = getActionList(view);
        int i = 0;
    L4:
        if (i >= actions.size()) goto L10;
        if (TextUtils.equals(label, actions.get(i).getLabel()) == true) goto L8;
        i = i + 1;
        goto L4
    L8:
        return actions.get(i).getId();
    L10:
        int i2 = 0;
    L12:
        if (i2 >= ACCESSIBILITY_ACTIONS_RESOURCE_IDS.length) goto L26;
        if (result != (-1)) goto L26;
        int id = ACCESSIBILITY_ACTIONS_RESOURCE_IDS[i2];
        boolean idAvailable = true;
        int j = 0;
    L17:
        if (j >= actions.size()) goto L23;
        if (actions.get(j).getId() == id) goto L21;
        boolean r6 = true;
    L22:
        idAvailable = idAvailable & r6;
        j = j + 1;
        goto L17
    L21:
        r6 = false;
        goto L22
    L23:
        if (idAvailable == false) goto L25;
        result = id;
    L25:
        i2 = i2 + 1;
    L26:
        return result;
    }

    public static void replaceAccessibilityAction(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat replacedAction, CharSequence label, AccessibilityViewCommand command) {
        if (command != null) goto L5;
        if (label != null) goto L5;
        removeAccessibilityAction(view, replacedAction.getId());
        return;
    L5:
        addAccessibilityAction(view, replacedAction.createReplacementAction(label, command));
    }

    private static void addAccessibilityAction(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat action) {
        ensureAccessibilityDelegateCompat(view);
        removeActionWithId(action.getId(), view);
        getActionList(view).add(action);
        notifyViewAccessibilityStateChangedIfNeeded(view, 0);
    }

    public static void removeAccessibilityAction(View view, int actionId) {
        removeActionWithId(actionId, view);
        notifyViewAccessibilityStateChangedIfNeeded(view, 0);
    }

    private static void removeActionWithId(int actionId, View view) {
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actions = getActionList(view);
        int i = 0;
    L4:
        if (i >= actions.size()) goto L12;
        if (actions.get(i).getId() == actionId) goto L7;
        i = i + 1;
        goto L4
    L7:
        actions.remove(i);
        return;
    }

    private static List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> getActionList(View view) {
        ArrayList<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actions = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (actions != null) goto L6;
        ArrayList<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actions2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, actions2);
        return actions2;
    L6:
        return actions;
    }

    public static void setStateDescription(View view, CharSequence stateDescription) {
        stateDescriptionProperty().set(view, stateDescription);
    }

    public static CharSequence getStateDescription(View view) {
        return stateDescriptionProperty().get(view);
    }

    public static void enableAccessibleClickableSpanSupport(View view) {
        ensureAccessibilityDelegateCompat(view);
    }

    public static AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider provider = view.getAccessibilityNodeProvider();
        if (provider != null) goto L5;
        return null;
    L5:
        return new AccessibilityNodeProviderCompat(provider);
    }

    @ReplaceWith(expression = "view.getAlpha()")
    @Deprecated
    public static float getAlpha(View view) {
        return view.getAlpha();
    }

    @ReplaceWith(expression = "view.setLayerType(layerType, paint)")
    @Deprecated
    public static void setLayerType(View view, int layerType, Paint paint) {
        view.setLayerType(layerType, paint);
    }

    @ReplaceWith(expression = "view.getLayerType()")
    @Deprecated
    public static int getLayerType(View view) {
        return view.getLayerType();
    }

    @ReplaceWith(expression = "view.getLabelFor()")
    @Deprecated
    public static int getLabelFor(View view) {
        return view.getLabelFor();
    }

    @ReplaceWith(expression = "view.setLabelFor(labeledId)")
    @Deprecated
    public static void setLabelFor(View view, int labeledId) {
        view.setLabelFor(labeledId);
    }

    @ReplaceWith(expression = "view.setLayerPaint(paint)")
    @Deprecated
    public static void setLayerPaint(View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    @ReplaceWith(expression = "view.getLayoutDirection()")
    @Deprecated
    public static int getLayoutDirection(View view) {
        return view.getLayoutDirection();
    }

    @ReplaceWith(expression = "view.setLayoutDirection(layoutDirection)")
    @Deprecated
    public static void setLayoutDirection(View view, int layoutDirection) {
        view.setLayoutDirection(layoutDirection);
    }

    @ReplaceWith(expression = "view.getParentForAccessibility()")
    @Deprecated
    public static ViewParent getParentForAccessibility(View view) {
        return view.getParentForAccessibility();
    }

    public static <T extends View> T requireViewById(View r3, int r4) {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        T r0 = (T) r3.findViewById(r4);
        if (r0 == null) goto L10;
        return r0;
    L10:
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    L5:
        return (T) Api28Impl.requireViewById(r3, r4);
    }

    @ReplaceWith(expression = "view.isOpaque()")
    @Deprecated
    public static boolean isOpaque(View view) {
        return view.isOpaque();
    }

    @Deprecated
    public static int resolveSizeAndState(int size, int measureSpec, int childMeasuredState) {
        return View.resolveSizeAndState(size, measureSpec, childMeasuredState);
    }

    @ReplaceWith(expression = "view.getMeasuredWidthAndState()")
    @Deprecated
    public static int getMeasuredWidthAndState(View view) {
        return view.getMeasuredWidthAndState();
    }

    @ReplaceWith(expression = "view.getMeasuredHeightAndState()")
    @Deprecated
    public static int getMeasuredHeightAndState(View view) {
        return view.getMeasuredHeightAndState();
    }

    @ReplaceWith(expression = "view.getMeasuredState()")
    @Deprecated
    public static int getMeasuredState(View view) {
        return view.getMeasuredState();
    }

    @Deprecated
    public static int combineMeasuredStates(int curState, int newState) {
        return View.combineMeasuredStates(curState, newState);
    }

    @ReplaceWith(expression = "view.getAccessibilityLiveRegion()")
    @Deprecated
    public static int getAccessibilityLiveRegion(View view) {
        return view.getAccessibilityLiveRegion();
    }

    @ReplaceWith(expression = "view.setAccessibilityLiveRegion(mode)")
    @Deprecated
    public static void setAccessibilityLiveRegion(View view, int mode) {
        view.setAccessibilityLiveRegion(mode);
    }

    @ReplaceWith(expression = "view.getPaddingStart()")
    @Deprecated
    public static int getPaddingStart(View view) {
        return view.getPaddingStart();
    }

    @ReplaceWith(expression = "view.getPaddingEnd()")
    @Deprecated
    public static int getPaddingEnd(View view) {
        return view.getPaddingEnd();
    }

    @ReplaceWith(expression = "view.setPaddingRelative(start, top, end, bottom)")
    @Deprecated
    public static void setPaddingRelative(View view, int start, int top, int end, int bottom) {
        view.setPaddingRelative(start, top, end, bottom);
    }

    private static void bindTempDetach() {
        sDispatchStartTemporaryDetach = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);     // Catch: NoSuchMethodException -> L4
        sDispatchFinishTemporaryDetach = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);     // Catch: NoSuchMethodException -> L4
    L6:
        sTempDetachBound = true;
        return;
    L4:
        e = move-exception;
        Log.e(TAG, "Couldn't find method", e);
        goto L6
    }

    public static void dispatchStartTemporaryDetach(View view) {
        Api24Impl.dispatchStartTemporaryDetach(view);
    }

    public static void dispatchFinishTemporaryDetach(View view) {
        Api24Impl.dispatchFinishTemporaryDetach(view);
    }

    @ReplaceWith(expression = "view.getTranslationX()")
    @Deprecated
    public static float getTranslationX(View view) {
        return view.getTranslationX();
    }

    @ReplaceWith(expression = "view.getTranslationY()")
    @Deprecated
    public static float getTranslationY(View view) {
        return view.getTranslationY();
    }

    @ReplaceWith(expression = "view.getMatrix()")
    @Deprecated
    public static Matrix getMatrix(View view) {
        return view.getMatrix();
    }

    @ReplaceWith(expression = "view.getMinimumWidth()")
    @Deprecated
    public static int getMinimumWidth(View view) {
        return view.getMinimumWidth();
    }

    @ReplaceWith(expression = "view.getMinimumHeight()")
    @Deprecated
    public static int getMinimumHeight(View view) {
        return view.getMinimumHeight();
    }

    @Deprecated
    public static ViewPropertyAnimatorCompat animate(View view) {
        if (sViewPropertyAnimatorMap != null) goto L5;
        sViewPropertyAnimatorMap = new WeakHashMap();
    L5:
        ViewPropertyAnimatorCompat vpa = sViewPropertyAnimatorMap.get(view);
        if (vpa != null) goto L9;
        ViewPropertyAnimatorCompat vpa2 = new ViewPropertyAnimatorCompat(view);
        sViewPropertyAnimatorMap.put(view, vpa2);
        return vpa2;
    L9:
        return vpa;
    }

    @ReplaceWith(expression = "view.setTranslationX(value)")
    @Deprecated
    public static void setTranslationX(View view, float value) {
        view.setTranslationX(value);
    }

    @ReplaceWith(expression = "view.setTranslationY(value)")
    @Deprecated
    public static void setTranslationY(View view, float value) {
        view.setTranslationY(value);
    }

    @ReplaceWith(expression = "view.setAlpha(value)")
    @Deprecated
    public static void setAlpha(View view, float value) {
        view.setAlpha(value);
    }

    @ReplaceWith(expression = "view.setX(value)")
    @Deprecated
    public static void setX(View view, float value) {
        view.setX(value);
    }

    @ReplaceWith(expression = "view.setY(value)")
    @Deprecated
    public static void setY(View view, float value) {
        view.setY(value);
    }

    @ReplaceWith(expression = "view.setRotation(value)")
    @Deprecated
    public static void setRotation(View view, float value) {
        view.setRotation(value);
    }

    @ReplaceWith(expression = "view.setRotationX(value)")
    @Deprecated
    public static void setRotationX(View view, float value) {
        view.setRotationX(value);
    }

    @ReplaceWith(expression = "view.setRotationY(value)")
    @Deprecated
    public static void setRotationY(View view, float value) {
        view.setRotationY(value);
    }

    @ReplaceWith(expression = "view.setScaleX(value)")
    @Deprecated
    public static void setScaleX(View view, float value) {
        view.setScaleX(value);
    }

    @ReplaceWith(expression = "view.setScaleY(value)")
    @Deprecated
    public static void setScaleY(View view, float value) {
        view.setScaleY(value);
    }

    @ReplaceWith(expression = "view.getPivotX()")
    @Deprecated
    public static float getPivotX(View view) {
        return view.getPivotX();
    }

    @ReplaceWith(expression = "view.setPivotX(value)")
    @Deprecated
    public static void setPivotX(View view, float value) {
        view.setPivotX(value);
    }

    @ReplaceWith(expression = "view.getPivotY()")
    @Deprecated
    public static float getPivotY(View view) {
        return view.getPivotY();
    }

    @ReplaceWith(expression = "view.setPivotY(value)")
    @Deprecated
    public static void setPivotY(View view, float value) {
        view.setPivotY(value);
    }

    @ReplaceWith(expression = "view.getRotation()")
    @Deprecated
    public static float getRotation(View view) {
        return view.getRotation();
    }

    @ReplaceWith(expression = "view.getRotationX()")
    @Deprecated
    public static float getRotationX(View view) {
        return view.getRotationX();
    }

    @ReplaceWith(expression = "view.getRotationY()")
    @Deprecated
    public static float getRotationY(View view) {
        return view.getRotationY();
    }

    @ReplaceWith(expression = "view.getScaleX()")
    @Deprecated
    public static float getScaleX(View view) {
        return view.getScaleX();
    }

    @ReplaceWith(expression = "view.getScaleY()")
    @Deprecated
    public static float getScaleY(View view) {
        return view.getScaleY();
    }

    @ReplaceWith(expression = "view.getX()")
    @Deprecated
    public static float getX(View view) {
        return view.getX();
    }

    @ReplaceWith(expression = "view.getY()")
    @Deprecated
    public static float getY(View view) {
        return view.getY();
    }

    public static void setElevation(View view, float elevation) {
        Api21Impl.setElevation(view, elevation);
    }

    public static float getElevation(View view) {
        return Api21Impl.getElevation(view);
    }

    public static void setTranslationZ(View view, float translationZ) {
        Api21Impl.setTranslationZ(view, translationZ);
    }

    public static float getTranslationZ(View view) {
        return Api21Impl.getTranslationZ(view);
    }

    public static void setTransitionName(View view, String transitionName) {
        Api21Impl.setTransitionName(view, transitionName);
    }

    public static String getTransitionName(View view) {
        return Api21Impl.getTransitionName(view);
    }

    public static void addOverlayView(ViewGroup overlayHost, View overlay) {
        overlayHost.getOverlay().add(overlay);
        ViewTree.setViewTreeDisjointParent((View) overlay.getParent(), overlayHost);
    }

    @ReplaceWith(expression = "view.getWindowSystemUiVisibility()")
    @Deprecated
    public static int getWindowSystemUiVisibility(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static void requestApplyInsets(View view) {
        Api20Impl.requestApplyInsets(view);
    }

    @Deprecated
    public static void setChildrenDrawingOrderEnabled(ViewGroup viewGroup, boolean enabled) {
        if (sChildrenDrawingOrderMethod == null) goto L20;
    L22:
        sChildrenDrawingOrderMethod.invoke(viewGroup, new Object[]{Boolean.valueOf(enabled)});     // Catch: InvocationTargetException -> L12 IllegalArgumentException -> L14 IllegalAccessException -> L16
    L26:
        return;
    L16:
        e = move-exception;
        Log.e(TAG, "Unable to invoke childrenDrawingOrderEnabled", e);
        return;
    L14:
        e = move-exception;
        Log.e(TAG, "Unable to invoke childrenDrawingOrderEnabled", e);
        return;
    L12:
        e = move-exception;
        Log.e(TAG, "Unable to invoke childrenDrawingOrderEnabled", e);
        return;
    L20:
        sChildrenDrawingOrderMethod = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});     // Catch: NoSuchMethodException -> L7
    L9:
        sChildrenDrawingOrderMethod.setAccessible(true);
    L7:
        e = move-exception;
        Log.e(TAG, "Unable to find childrenDrawingOrderEnabled", e);
        goto L9
    }

    @ReplaceWith(expression = "view.getFitsSystemWindows()")
    @Deprecated
    public static boolean getFitsSystemWindows(View view) {
        return view.getFitsSystemWindows();
    }

    @ReplaceWith(expression = "view.setFitsSystemWindows(fitSystemWindows)")
    @Deprecated
    public static void setFitsSystemWindows(View view, boolean fitSystemWindows) {
        view.setFitsSystemWindows(fitSystemWindows);
    }

    @ReplaceWith(expression = "view.jumpDrawablesToCurrentState()")
    @Deprecated
    public static void jumpDrawablesToCurrentState(View view) {
        view.jumpDrawablesToCurrentState();
    }

    public static void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener listener) {
        Api21Impl.setOnApplyWindowInsetsListener(view, listener);
    }

    public static WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets) {
        WindowInsets unwrapped = insets.toWindowInsets();
        if (unwrapped == null) goto L8;
        WindowInsets result = Api20Impl.onApplyWindowInsets(view, unwrapped);
        if (result.equals(unwrapped) == true) goto L8;
        return WindowInsetsCompat.toWindowInsetsCompat(result, view);
    L8:
        return insets;
    }

    public static WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat insets) {
        WindowInsets unwrapped = insets.toWindowInsets();
        if (unwrapped != null) goto L5;
    L12:
        return insets;
    L5:
        if (Build.VERSION.SDK_INT < 30) goto L7;
        WindowInsets result = Api30Impl.dispatchApplyWindowInsets(view, unwrapped);
    L9:
        if (result.equals(unwrapped) == true) goto L12;
        return WindowInsetsCompat.toWindowInsetsCompat(result, view);
    L7:
        result = Api20Impl.dispatchApplyWindowInsets(view, unwrapped);
        goto L9
    }

    public static void setSystemGestureExclusionRects(View view, List<Rect> rects) {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        Api29Impl.setSystemGestureExclusionRects(view, rects);
        return;
    }

    public static List<Rect> getSystemGestureExclusionRects(View view) {
        if (Build.VERSION.SDK_INT < 29) goto L7;
        return Api29Impl.getSystemGestureExclusionRects(view);
    L7:
        return Collections.emptyList();
    }

    public static WindowInsetsCompat getRootWindowInsets(View view) {
        return Api23Impl.getRootWindowInsets(view);
    }

    public static WindowInsetsCompat computeSystemWindowInsets(View view, WindowInsetsCompat insets, Rect outLocalInsets) {
        return Api21Impl.computeSystemWindowInsets(view, insets, outLocalInsets);
    }

    @Deprecated
    public static WindowInsetsControllerCompat getWindowInsetsController(View view) {
        if (Build.VERSION.SDK_INT >= 30) goto L5;
        Context context = view.getContext();
    L8:
        if ((context instanceof ContextWrapper) == false) goto L16;
        if ((context instanceof Activity) == true) goto L11;
        context = ((ContextWrapper) context).getBaseContext();
        goto L8
    L11:
        Window window = ((Activity) context).getWindow();
        if (window != null) goto L14;
        return null;
    L14:
        return WindowCompat.getInsetsController(window, view);
    L16:
        return null;
    L5:
        return Api30Impl.getWindowInsetsController(view);
    }

    public static void setWindowInsetsAnimationCallback(View view, WindowInsetsAnimationCompat.Callback callback) {
        WindowInsetsAnimationCompat.setCallback(view, callback);
    }

    public static void setOnReceiveContentListener(View view, String[] mimeTypes, OnReceiveContentListener listener) {
        if (Build.VERSION.SDK_INT < 31) goto L6;
        Api31Impl.setOnReceiveContentListener(view, mimeTypes, listener);
        return;
    L6:
        if (mimeTypes != null) goto L8;
    L11:
        String[] mimeTypes2 = null;
    L12:
        int r6 = 0;
        if (listener == null) goto L18;
        if (mimeTypes2 == null) goto L16;
        boolean r1 = true;
    L17:
        Preconditions.checkArgument(r1, "When the listener is set, MIME types must also be set");
        goto L18
    L16:
        r1 = false;
    L18:
        if (mimeTypes2 == null) goto L26;
        boolean hasLeadingWildcard = false;
        int r2 = mimeTypes2.length;
    L20:
        if (r6 >= r2) goto L25;
        String mimeType = mimeTypes2[r6];
        if (mimeType.startsWith(ProxyConfig.MATCH_ALL_SCHEMES) == true) goto L23;
        r6 = r6 + 1;
        goto L20
    L23:
        hasLeadingWildcard = true;
    L25:
        Preconditions.checkArgument(!hasLeadingWildcard, "A MIME type set here must not start with *: " + Arrays.toString(mimeTypes2));
    L26:
        view.setTag(R.id.tag_on_receive_content_mime_types, mimeTypes2);
        view.setTag(R.id.tag_on_receive_content_listener, listener);
        return;
    L8:
        if (mimeTypes.length == 0) goto L11;
        mimeTypes2 = mimeTypes;
        goto L12
    }

    public static String[] getOnReceiveContentMimeTypes(View view) {
        if (Build.VERSION.SDK_INT < 31) goto L7;
        return Api31Impl.getReceiveContentMimeTypes(view);
    L7:
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static ContentInfoCompat performReceiveContent(View view, ContentInfoCompat payload) {
        if (Log.isLoggable(TAG, 3) == false) goto L6;
        Log.d(TAG, "performReceiveContent: " + payload + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
    L6:
        if (Build.VERSION.SDK_INT >= 31) goto L8;
        OnReceiveContentListener listener = (OnReceiveContentListener) view.getTag(R.id.tag_on_receive_content_listener);
        if (listener == null) goto L17;
        ContentInfoCompat remaining = listener.onReceiveContent(view, payload);
        if (remaining != null) goto L15;
        return null;
    L15:
        return getFallback(view).onReceiveContent(remaining);
    L17:
        return getFallback(view).onReceiveContent(payload);
    L8:
        return Api31Impl.performReceiveContent(view, payload);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static OnReceiveContentViewBehavior getFallback(View r1) {
        if ((r1 instanceof OnReceiveContentViewBehavior) == false) goto L7;
        return (OnReceiveContentViewBehavior) r1;
    L7:
        return NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR;
    }

    static /* synthetic */ ContentInfoCompat lambda$static$0(ContentInfoCompat payload) {
        return payload;
    }

    @ReplaceWith(expression = "view.setSaveFromParentEnabled(enabled)")
    @Deprecated
    public static void setSaveFromParentEnabled(View view, boolean enabled) {
        view.setSaveFromParentEnabled(enabled);
    }

    @ReplaceWith(expression = "view.setActivated(activated)")
    @Deprecated
    public static void setActivated(View view, boolean activated) {
        view.setActivated(activated);
    }

    @ReplaceWith(expression = "view.hasOverlappingRendering()")
    @Deprecated
    public static boolean hasOverlappingRendering(View view) {
        return view.hasOverlappingRendering();
    }

    @ReplaceWith(expression = "view.isPaddingRelative()")
    @Deprecated
    public static boolean isPaddingRelative(View view) {
        return view.isPaddingRelative();
    }

    @ReplaceWith(expression = "view.setBackground(background)")
    @Deprecated
    public static void setBackground(View view, Drawable background) {
        view.setBackground(background);
    }

    public static ColorStateList getBackgroundTintList(View view) {
        return Api21Impl.getBackgroundTintList(view);
    }

    public static void setBackgroundTintList(View view, ColorStateList tintList) {
        Api21Impl.setBackgroundTintList(view, tintList);
    }

    public static PorterDuff.Mode getBackgroundTintMode(View view) {
        return Api21Impl.getBackgroundTintMode(view);
    }

    public static void setBackgroundTintMode(View view, PorterDuff.Mode mode) {
        Api21Impl.setBackgroundTintMode(view, mode);
    }

    public static void setNestedScrollingEnabled(View view, boolean enabled) {
        Api21Impl.setNestedScrollingEnabled(view, enabled);
    }

    public static boolean isNestedScrollingEnabled(View view) {
        return Api21Impl.isNestedScrollingEnabled(view);
    }

    public static boolean startNestedScroll(View view, int axes) {
        return Api21Impl.startNestedScroll(view, axes);
    }

    public static void stopNestedScroll(View view) {
        Api21Impl.stopNestedScroll(view);
    }

    public static boolean hasNestedScrollingParent(View view) {
        return Api21Impl.hasNestedScrollingParent(view);
    }

    public static boolean dispatchNestedScroll(View view, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        return Api21Impl.dispatchNestedScroll(view, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow);
    }

    public static boolean dispatchNestedPreScroll(View view, int dx, int dy, int[] consumed, int[] offsetInWindow) {
        return Api21Impl.dispatchNestedPreScroll(view, dx, dy, consumed, offsetInWindow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean startNestedScroll(View r1, int axes, int type) {
        if ((r1 instanceof NestedScrollingChild2) == true) goto L5;
        if (type == 0) goto L8;
        return false;
    L8:
        return startNestedScroll(r1, axes);
    L5:
        return ((NestedScrollingChild2) r1).startNestedScroll(axes, type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void stopNestedScroll(View r1, int type) {
        if ((r1 instanceof NestedScrollingChild2) == false) goto L5;
        ((NestedScrollingChild2) r1).stopNestedScroll(type);
        return;
    L5:
        if (type != 0) goto L9;
        stopNestedScroll(r1);
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean hasNestedScrollingParent(View r1, int type) {
        if ((r1 instanceof NestedScrollingChild2) == false) goto L5;
        ((NestedScrollingChild2) r1).hasNestedScrollingParent(type);
        return false;
    L5:
        if (type == 0) goto L7;
        return false;
    L7:
        return hasNestedScrollingParent(r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void dispatchNestedScroll(View r9, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type, int[] consumed) {
        if ((r9 instanceof NestedScrollingChild3) == false) goto L5;
        ((NestedScrollingChild3) r9).dispatchNestedScroll(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type, consumed);
        return;
    L5:
        dispatchNestedScroll(r9, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedScroll(View r8, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type) {
        if ((r8 instanceof NestedScrollingChild2) == false) goto L7;
        return ((NestedScrollingChild2) r8).dispatchNestedScroll(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type);
    L7:
        if (type != 0) goto L11;
        return dispatchNestedScroll(r8, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow);
    L11:
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedPreScroll(View r7, int dx, int dy, int[] consumed, int[] offsetInWindow, int type) {
        if ((r7 instanceof NestedScrollingChild2) == false) goto L7;
        return ((NestedScrollingChild2) r7).dispatchNestedPreScroll(dx, dy, consumed, offsetInWindow, type);
    L7:
        if (type == 0) goto L9;
        return false;
    L9:
        return dispatchNestedPreScroll(r7, dx, dy, consumed, offsetInWindow);
    }

    public static boolean dispatchNestedFling(View view, float velocityX, float velocityY, boolean consumed) {
        return Api21Impl.dispatchNestedFling(view, velocityX, velocityY, consumed);
    }

    public static boolean dispatchNestedPreFling(View view, float velocityX, float velocityY) {
        return Api21Impl.dispatchNestedPreFling(view, velocityX, velocityY);
    }

    @ReplaceWith(expression = "view.isInLayout()")
    @Deprecated
    public static boolean isInLayout(View view) {
        return view.isInLayout();
    }

    @ReplaceWith(expression = "view.isLaidOut()")
    @Deprecated
    public static boolean isLaidOut(View view) {
        return view.isLaidOut();
    }

    @ReplaceWith(expression = "view.isLayoutDirectionResolved()")
    @Deprecated
    public static boolean isLayoutDirectionResolved(View view) {
        return view.isLayoutDirectionResolved();
    }

    public static float getZ(View view) {
        return Api21Impl.getZ(view);
    }

    public static void setZ(View view, float z) {
        Api21Impl.setZ(view, z);
    }

    public static void offsetTopAndBottom(View view, int offset) {
        view.offsetTopAndBottom(offset);
    }

    private static void compatOffsetTopAndBottom(View view, int offset) {
        view.offsetTopAndBottom(offset);
        if (view.getVisibility() != 0) goto L8;
        tickleInvalidationFlag(view);
        Object r0 = view.getParent();
        if ((r0 instanceof View) == false) goto L9;
        tickleInvalidationFlag((View) r0);
        return;
    L9:
        return;
    }

    public static void offsetLeftAndRight(View view, int offset) {
        view.offsetLeftAndRight(offset);
    }

    private static void compatOffsetLeftAndRight(View view, int offset) {
        view.offsetLeftAndRight(offset);
        if (view.getVisibility() != 0) goto L8;
        tickleInvalidationFlag(view);
        Object r0 = view.getParent();
        if ((r0 instanceof View) == false) goto L9;
        tickleInvalidationFlag((View) r0);
        return;
    L9:
        return;
    }

    private static void tickleInvalidationFlag(View view) {
        float y = view.getTranslationY();
        view.setTranslationY(1.0f + y);
        view.setTranslationY(y);
    }

    @ReplaceWith(expression = "view.setClipBounds(clipBounds)")
    @Deprecated
    public static void setClipBounds(View view, Rect clipBounds) {
        view.setClipBounds(clipBounds);
    }

    @ReplaceWith(expression = "view.getClipBounds()")
    @Deprecated
    public static Rect getClipBounds(View view) {
        return view.getClipBounds();
    }

    @ReplaceWith(expression = "view.isAttachedToWindow()")
    @Deprecated
    public static boolean isAttachedToWindow(View view) {
        return view.isAttachedToWindow();
    }

    @ReplaceWith(expression = "view.hasOnClickListeners()")
    @Deprecated
    public static boolean hasOnClickListeners(View view) {
        return view.hasOnClickListeners();
    }

    public static void setScrollIndicators(View view, int indicators) {
        Api23Impl.setScrollIndicators(view, indicators);
    }

    public static void setScrollIndicators(View view, int indicators, int mask) {
        Api23Impl.setScrollIndicators(view, indicators, mask);
    }

    public static int getScrollIndicators(View view) {
        return Api23Impl.getScrollIndicators(view);
    }

    public static void setPointerIcon(View view, PointerIconCompat pointerIcon) {
        if (pointerIcon == null) goto L4;
        Object r0 = pointerIcon.getPointerIcon();
    L5:
        Api24Impl.setPointerIcon(view, (PointerIcon) r0);
        return;
    L4:
        r0 = null;
        goto L5
    }

    @ReplaceWith(expression = "view.getDisplay()")
    @Deprecated
    public static Display getDisplay(View view) {
        return view.getDisplay();
    }

    public static void setTooltipText(View view, CharSequence tooltipText) {
        Api26Impl.setTooltipText(view, tooltipText);
    }

    public static boolean startDragAndDrop(View v, ClipData data, View.DragShadowBuilder shadowBuilder, Object myLocalState, int flags) {
        return Api24Impl.startDragAndDrop(v, data, shadowBuilder, myLocalState, flags);
    }

    public static void cancelDragAndDrop(View v) {
        Api24Impl.cancelDragAndDrop(v);
    }

    public static void updateDragShadow(View v, View.DragShadowBuilder shadowBuilder) {
        Api24Impl.updateDragShadow(v, shadowBuilder);
    }

    public static int getNextClusterForwardId(View view) {
        return Api26Impl.getNextClusterForwardId(view);
    }

    public static void setNextClusterForwardId(View view, int nextClusterForwardId) {
        Api26Impl.setNextClusterForwardId(view, nextClusterForwardId);
    }

    public static boolean isKeyboardNavigationCluster(View view) {
        return Api26Impl.isKeyboardNavigationCluster(view);
    }

    public static void setKeyboardNavigationCluster(View view, boolean isCluster) {
        Api26Impl.setKeyboardNavigationCluster(view, isCluster);
    }

    public static boolean isFocusedByDefault(View view) {
        return Api26Impl.isFocusedByDefault(view);
    }

    public static void setFocusedByDefault(View view, boolean isFocusedByDefault) {
        Api26Impl.setFocusedByDefault(view, isFocusedByDefault);
    }

    public static View keyboardNavigationClusterSearch(View view, View currentCluster, int direction) {
        return Api26Impl.keyboardNavigationClusterSearch(view, currentCluster, direction);
    }

    public static void addKeyboardNavigationClusters(View view, Collection<View> views, int direction) {
        Api26Impl.addKeyboardNavigationClusters(view, views, direction);
    }

    public static boolean restoreDefaultFocus(View view) {
        return Api26Impl.restoreDefaultFocus(view);
    }

    public static boolean hasExplicitFocusable(View view) {
        return Api26Impl.hasExplicitFocusable(view);
    }

    @Deprecated
    public static int generateViewId() {
        return View.generateViewId();
    }

    public static void addOnUnhandledKeyEventListener(View view, OnUnhandledKeyEventListenerCompat listener) {
        if (Build.VERSION.SDK_INT < 28) goto L6;
        Api28Impl.addOnUnhandledKeyEventListener(view, listener);
        return;
    L6:
        ArrayList<OnUnhandledKeyEventListenerCompat> viewListeners = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (viewListeners != null) goto L9;
        viewListeners = new ArrayList();
        view.setTag(R.id.tag_unhandled_key_listeners, viewListeners);
    L9:
        viewListeners.add(listener);
        if (viewListeners.size() != 1) goto L13;
        UnhandledKeyEventManager.registerListeningView(view);
        return;
    }

    public static void removeOnUnhandledKeyEventListener(View view, OnUnhandledKeyEventListenerCompat listener) {
        if (Build.VERSION.SDK_INT < 28) goto L6;
        Api28Impl.removeOnUnhandledKeyEventListener(view, listener);
        return;
    L6:
        ArrayList<OnUnhandledKeyEventListenerCompat> viewListeners = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (viewListeners == null) goto L12;
        viewListeners.remove(listener);
        if (viewListeners.size() != 0) goto L13;
        UnhandledKeyEventManager.unregisterListeningView(view);
        return;
    L13:
        return;
    }

    @Deprecated
    protected ViewCompat() {
    }

    static boolean dispatchUnhandledKeyEventBeforeHierarchy(View root, KeyEvent evt) {
        if (Build.VERSION.SDK_INT < 28) goto L7;
        return false;
    L7:
        return UnhandledKeyEventManager.at(root).preDispatch(evt);
    }

    static boolean dispatchUnhandledKeyEventBeforeCallback(View root, KeyEvent evt) {
        if (Build.VERSION.SDK_INT < 28) goto L7;
        return false;
    L7:
        return UnhandledKeyEventManager.at(root).dispatch(root, evt);
    }

    public static void transformMatrixToGlobal(View view, Matrix matrix) {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        Api29Impl.transformMatrixToGlobal(view, matrix);
        return;
    L6:
        if (sTryHiddenViewTransformMatrixToGlobal == true) goto L13;
    L11:
        fallbackTransformMatrixToGlobal(view, matrix);
        return;
    L13:
        Api29Impl.transformMatrixToGlobal(view, matrix);     // Catch: NoSuchMethodError -> L9
        return;
    L10:
        sTryHiddenViewTransformMatrixToGlobal = false;
        goto L11
    }

    static void fallbackTransformMatrixToGlobal(View view, Matrix matrix) {
        Object r0 = view.getParent();
        if ((r0 instanceof View) == false) goto L5;
        View parentView = (View) r0;
        fallbackTransformMatrixToGlobal(parentView, matrix);
        matrix.preTranslate(-parentView.getScrollX(), -parentView.getScrollY());
    L5:
        matrix.preTranslate(view.getLeft(), view.getTop());
        matrix.preConcat(view.getMatrix());
    }

    public static void setScreenReaderFocusable(View view, boolean screenReaderFocusable) {
        screenReaderFocusableProperty().set(view, Boolean.valueOf(screenReaderFocusable));
    }

    public static boolean isScreenReaderFocusable(View view) {
        Boolean result = screenReaderFocusableProperty().get(view);
        if (result != null) goto L5;
    L7:
        return false;
    L5:
        if (result.booleanValue() == false) goto L7;
        return true;
    }

    private static AccessibilityViewProperty<Boolean> screenReaderFocusableProperty() {
        final int r1 = R.id.tag_screen_reader_focusable;
        final Class<Boolean> r2 = Boolean.class;
        final int r3 = 28;
        return new AnonymousClass1(r1, r2, r3);
    }

    public static void setAccessibilityPaneTitle(View view, CharSequence accessibilityPaneTitle) {
        paneTitleProperty().set(view, accessibilityPaneTitle);
        if (accessibilityPaneTitle == null) goto L5;
        sAccessibilityPaneVisibilityManager.addAccessibilityPane(view);
        return;
    L5:
        sAccessibilityPaneVisibilityManager.removeAccessibilityPane(view);
    }

    public static CharSequence getAccessibilityPaneTitle(View view) {
        return paneTitleProperty().get(view);
    }

    private static AccessibilityViewProperty<CharSequence> paneTitleProperty() {
        final int r1 = R.id.tag_accessibility_pane_title;
        final Class<CharSequence> r2 = CharSequence.class;
        final int r3 = 8;
        final int r4 = 28;
        return new AnonymousClass2(r1, r2, r3, r4);
    }

    private static AccessibilityViewProperty<CharSequence> stateDescriptionProperty() {
        final int r1 = R.id.tag_state_description;
        final Class<CharSequence> r2 = CharSequence.class;
        final int r3 = 64;
        final int r4 = 30;
        return new AnonymousClass3(r1, r2, r3, r4);
    }

    public static boolean isAccessibilityHeading(View view) {
        Boolean result = accessibilityHeadingProperty().get(view);
        if (result != null) goto L5;
    L7:
        return false;
    L5:
        if (result.booleanValue() == false) goto L7;
        return true;
    }

    public static void setAccessibilityHeading(View view, boolean isHeading) {
        accessibilityHeadingProperty().set(view, Boolean.valueOf(isHeading));
    }

    private static AccessibilityViewProperty<Boolean> accessibilityHeadingProperty() {
        final int r1 = R.id.tag_accessibility_heading;
        final Class<Boolean> r2 = Boolean.class;
        final int r3 = 28;
        return new AnonymousClass4(r1, r2, r3);
    }

    static void notifyViewAccessibilityStateChangedIfNeeded(View view, int changeType) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() == true) goto L6;
        return;
    L6:
        if (getAccessibilityPaneTitle(view) != null) goto L8;
    L12:
        boolean isVisibleAccessibilityPane = false;
    L13:
        int r3 = 32;
        if (view.getAccessibilityLiveRegion() != 0) goto L27;
        if (isVisibleAccessibilityPane == true) goto L27;
        if (changeType != 32) goto L20;
        AccessibilityEvent event = AccessibilityEvent.obtain();
        view.onInitializeAccessibilityEvent(event);
        event.setEventType(32);
        event.setContentChangeTypes(changeType);
        event.setSource(view);
        view.onPopulateAccessibilityEvent(event);
        event.getText().add(getAccessibilityPaneTitle(view));
        accessibilityManager.sendAccessibilityEvent(event);
        return;
    L20:
        if (view.getParent() == null) goto L41;
        ViewParent parent = view.getParent();
        parent.notifySubtreeAccessibilityStateChanged(view, view, changeType);     // Catch: AbstractMethodError -> L24
        return;
    L24:
        e = move-exception;
        Log.e(TAG, view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
        return;
    L41:
        return;
    L27:
        AccessibilityEvent event2 = AccessibilityEvent.obtain();
        if (isVisibleAccessibilityPane == true) goto L31;
        r3 = 2048;
    L31:
        event2.setEventType(r3);
        event2.setContentChangeTypes(changeType);
        if (isVisibleAccessibilityPane == false) goto L34;
        event2.getText().add(getAccessibilityPaneTitle(view));
        setImportantForAccessibilityIfNeeded(view);
    L34:
        view.sendAccessibilityEventUnchecked(event2);
        return;
    L8:
        if (view.isShown() == false) goto L12;
        if (view.getWindowVisibility() != 0) goto L12;
        isVisibleAccessibilityPane = true;
        goto L13
    }

    private static void setImportantForAccessibilityIfNeeded(View view) {
        if (view.getImportantForAccessibility() != 0) goto L6;
        view.setImportantForAccessibility(1);
        return;
    }
}
