package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.DifferentialMotionFlingController;
import androidx.core.view.DifferentialMotionFlingTarget;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ScrollFeedbackProviderCompat;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class NestedScrollView extends FrameLayout implements NestedScrollingParent3, NestedScrollingChild3, ScrollingView {
    private static final AccessibilityDelegate ACCESSIBILITY_DELEGATE = null;
    static final int ANIMATED_SCROLL_GAP = 250;
    private static final float DECELERATION_RATE = 0.0f;
    private static final int DEFAULT_SMOOTH_SCROLL_DURATION = 250;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    static final float MAX_SCROLL_FACTOR = 0.5f;
    private static final int[] SCROLLVIEW_STYLEABLE = null;
    private static final float SCROLL_FRICTION = 0.015f;
    private static final String TAG = "NestedScrollView";
    private int mActivePointerId;
    private final NestedScrollingChildHelper mChildHelper;
    private View mChildToScrollTo;
    DifferentialMotionFlingController mDifferentialMotionFlingController;
    final DifferentialMotionFlingTargetImpl mDifferentialMotionFlingTarget;
    public EdgeEffect mEdgeGlowBottom;
    public EdgeEffect mEdgeGlowTop;
    private boolean mFillViewport;
    private boolean mIsBeingDragged;
    private boolean mIsLaidOut;
    private boolean mIsLayoutDirty;
    private int mLastMotionY;
    private long mLastScroll;
    private int mLastScrollerY;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private int mNestedYOffset;
    private OnScrollChangeListener mOnScrollChangeListener;
    private final NestedScrollingParentHelper mParentHelper;
    private final float mPhysicalCoeff;
    private SavedState mSavedState;
    private final int[] mScrollConsumed;
    ScrollFeedbackProviderCompat mScrollFeedbackProvider;
    private final int[] mScrollOffset;
    private OverScroller mScroller;
    private boolean mSmoothScrollingEnabled;
    private final Rect mTempRect;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    private float mVerticalScrollFactor;

    static class AccessibilityDelegate extends AccessibilityDelegateCompat {
        AccessibilityDelegate() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View host, int action, Bundle arguments) {
            if (super.performAccessibilityAction(host, action, arguments) == false) goto L5;
            return true;
        L5:
            NestedScrollView nsvHost = (NestedScrollView) host;
            if (nsvHost.isEnabled() == true) goto L8;
            return false;
        L8:
            int height = nsvHost.getHeight();
            Rect rect = new Rect();
            if (nsvHost.getMatrix().isIdentity() == true) goto L11;
        L13:
            switch(action) {
                case 4096: goto L20;
                case 8192: goto L15;
                case 16908344: goto L15;
                case 16908346: goto L20;
                default: goto L14;
            };
        L14:
            return false;
        L15:
            int viewportHeight = (height - nsvHost.getPaddingBottom()) - nsvHost.getPaddingTop();
            int targetScrollY = Math.max(nsvHost.getScrollY() - viewportHeight, 0);
            if (targetScrollY == nsvHost.getScrollY()) goto L19;
            nsvHost.smoothScrollTo(0, targetScrollY, true);
            return true;
        L19:
            return false;
        L20:
            int viewportHeight2 = (height - nsvHost.getPaddingBottom()) - nsvHost.getPaddingTop();
            int targetScrollY2 = Math.min(nsvHost.getScrollY() + viewportHeight2, nsvHost.getScrollRange());
            if (targetScrollY2 == nsvHost.getScrollY()) goto L24;
            nsvHost.smoothScrollTo(0, targetScrollY2, true);
            return true;
        L24:
            return false;
        L11:
            if (nsvHost.getGlobalVisibleRect(rect) == false) goto L13;
            height = rect.height();
            goto L13
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
            super.onInitializeAccessibilityNodeInfo(host, info);
            NestedScrollView nsvHost = (NestedScrollView) host;
            info.setClassName(ScrollView.class.getName());
            if (nsvHost.isEnabled() == false) goto L13;
            int scrollRange = nsvHost.getScrollRange();
            if (scrollRange <= 0) goto L14;
            info.setScrollable(true);
            if (nsvHost.getScrollY() <= 0) goto L10;
            info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
            info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP);
        L10:
            if (nsvHost.getScrollY() >= scrollRange) goto L15;
            info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
            info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN);
            return;
        L15:
            return;
        L14:
            return;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
            super.onInitializeAccessibilityEvent(host, event);
            NestedScrollView nsvHost = (NestedScrollView) host;
            event.setClassName(ScrollView.class.getName());
            if (nsvHost.getScrollRange() <= 0) goto L5;
            boolean scrollable = true;
        L6:
            event.setScrollable(scrollable);
            event.setScrollX(nsvHost.getScrollX());
            event.setScrollY(nsvHost.getScrollY());
            AccessibilityRecordCompat.setMaxScrollX(event, nsvHost.getScrollX());
            AccessibilityRecordCompat.setMaxScrollY(event, nsvHost.getScrollRange());
            return;
        L5:
            scrollable = false;
            goto L6
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static boolean getClipToPadding(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    private static final class Api35Impl {
        private Api35Impl() {
        }

        public static void setFrameContentVelocity(View view, float velocity) {
            view.setFrameContentVelocity(velocity);     // Catch: LinkageError -> L4
            return;
        }
    }

    class DifferentialMotionFlingTargetImpl implements DifferentialMotionFlingTarget {
        final /* synthetic */ NestedScrollView this$0;

        DifferentialMotionFlingTargetImpl(NestedScrollView this$0) {
            this.this$0 = this$0;
        }

        @Override // androidx.core.view.DifferentialMotionFlingTarget
        public boolean startDifferentialMotionFling(float velocity) {
            if (velocity != 0.0f) goto L6;
            return false;
        L6:
            stopDifferentialMotionFling();
            this.this$0.fling((int) velocity);
            return true;
        }

        @Override // androidx.core.view.DifferentialMotionFlingTarget
        public void stopDifferentialMotionFling() {
            NestedScrollView.access$000(this.this$0).abortAnimation();
        }

        @Override // androidx.core.view.DifferentialMotionFlingTarget
        public float getScaledScrollFactor() {
            return -this.this$0.getVerticalScrollFactorCompat();
        }
    }

    public interface OnScrollChangeListener {
        void onScrollChange(NestedScrollView r1, int r2, int r3, int r4, int r5);
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        public int scrollPosition;

        SavedState(Parcelable superState) {
            super(superState);
        }

        SavedState(Parcel source) {
            super(source);
            this.scrollPosition = source.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeInt(this.scrollPosition);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.scrollPosition + "}";
        }

        static {
            CREATOR = new AnonymousClass1();
        }
    }

    static /* synthetic */ OverScroller access$000(NestedScrollView x0) {
        return x0.mScroller;
    }

    static {
        DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
        ACCESSIBILITY_DELEGATE = new AccessibilityDelegate();
        SCROLLVIEW_STYLEABLE = new int[]{R.attr.fillViewport};
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attrs) {
        this(context, attrs, androidx.core.R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mTempRect = new Rect();
        this.mIsLayoutDirty = true;
        this.mIsLaidOut = false;
        this.mChildToScrollTo = null;
        this.mIsBeingDragged = false;
        this.mSmoothScrollingEnabled = true;
        this.mActivePointerId = -1;
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        this.mDifferentialMotionFlingTarget = new DifferentialMotionFlingTargetImpl(this);
        this.mDifferentialMotionFlingController = new DifferentialMotionFlingController(getContext(), this.mDifferentialMotionFlingTarget);
        this.mEdgeGlowTop = EdgeEffectCompat.create(context, attrs);
        this.mEdgeGlowBottom = EdgeEffectCompat.create(context, attrs);
        float ppi = context.getResources().getDisplayMetrics().density * 160.0f;
        this.mPhysicalCoeff = (386.0878f * ppi) * 0.84f;
        initScrollView();
        TypedArray a = context.obtainStyledAttributes(attrs, SCROLLVIEW_STYLEABLE, defStyleAttr, 0);
        setFillViewport(a.getBoolean(0, false));
        a.recycle();
        this.mParentHelper = new NestedScrollingParentHelper(this);
        this.mChildHelper = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        ViewCompat.setAccessibilityDelegate(this, ACCESSIBILITY_DELEGATE);
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public void dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type, int[] consumed) {
        this.mChildHelper.dispatchNestedScroll(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type, consumed);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int axes, int type) {
        return this.mChildHelper.startNestedScroll(axes, type);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int type) {
        this.mChildHelper.stopNestedScroll(type);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int type) {
        return this.mChildHelper.hasNestedScrollingParent(type);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type) {
        return this.mChildHelper.dispatchNestedScroll(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow, int type) {
        return this.mChildHelper.dispatchNestedPreScroll(dx, dy, consumed, offsetInWindow, type);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean enabled) {
        this.mChildHelper.setNestedScrollingEnabled(enabled);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.mChildHelper.isNestedScrollingEnabled();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int axes) {
        return startNestedScroll(axes, 0);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        return this.mChildHelper.dispatchNestedScroll(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow) {
        return dispatchNestedPreScroll(dx, dy, consumed, offsetInWindow, 0);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float velocityX, float velocityY, boolean consumed) {
        return this.mChildHelper.dispatchNestedFling(velocityX, velocityY, consumed);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float velocityX, float velocityY) {
        return this.mChildHelper.dispatchNestedPreFling(velocityX, velocityY);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        onNestedScrollInternal(dyUnconsumed, type, consumed);
    }

    private void onNestedScrollInternal(int dyUnconsumed, int type, int[] consumed) {
        int oldScrollY = getScrollY();
        scrollBy(0, dyUnconsumed);
        int myConsumed = getScrollY() - oldScrollY;
        if (consumed == null) goto L5;
        consumed[1] = consumed[1] + myConsumed;
    L5:
        int myUnconsumed = dyUnconsumed - myConsumed;
        this.mChildHelper.dispatchNestedScroll(0, myConsumed, 0, myUnconsumed, null, type, consumed);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View child, View target, int axes, int type) {
        if ((axes & 2) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View child, View target, int axes, int type) {
        this.mParentHelper.onNestedScrollAccepted(child, target, axes, type);
        startNestedScroll(2, type);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View target, int type) {
        this.mParentHelper.onStopNestedScroll(target, type);
        stopNestedScroll(type);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        onNestedScrollInternal(dyUnconsumed, type, null);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed, int type) {
        dispatchNestedPreScroll(dx, dy, consumed, null, type);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View child, View target, int axes) {
        return onStartNestedScroll(child, target, axes, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View child, View target, int axes) {
        onNestedScrollAccepted(child, target, axes, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View target) {
        onStopNestedScroll(target, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        onNestedScrollInternal(dyUnconsumed, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {
        onNestedPreScroll(target, dx, dy, consumed, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        if (consumed == true) goto L5;
        dispatchNestedFling(0.0f, velocityY, true);
        fling((int) velocityY);
        return true;
    L5:
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        return dispatchNestedPreFling(velocityX, velocityY);
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.mParentHelper.getNestedScrollAxes();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() != 0) goto L6;
        return 0.0f;
    L6:
        int length = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < length) goto L9;
        return 1.0f;
    L9:
        return scrollY / length;
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() != 0) goto L6;
        return 0.0f;
    L6:
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        int length = getVerticalFadingEdgeLength();
        int bottomEdge = getHeight() - getPaddingBottom();
        int span = ((child.getBottom() + lp.bottomMargin) - getScrollY()) - bottomEdge;
        if (span < length) goto L9;
        return 1.0f;
    L9:
        return span / length;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    private void initScrollView() {
        this.mScroller = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration configuration = ViewConfiguration.get(getContext());
        this.mTouchSlop = configuration.getScaledTouchSlop();
        this.mMinimumVelocity = configuration.getScaledMinimumFlingVelocity();
        this.mMaximumVelocity = configuration.getScaledMaximumFlingVelocity();
    }

    @Override // android.view.ViewGroup
    public void addView(View child) {
        if (getChildCount() > 0) goto L7;
        super.addView(child);
        return;
    L7:
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        if (getChildCount() > 0) goto L7;
        super.addView(child, index);
        return;
    L7:
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View child, ViewGroup.LayoutParams params) {
        if (getChildCount() > 0) goto L7;
        super.addView(child, params);
        return;
    L7:
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (getChildCount() > 0) goto L7;
        super.addView(child, index, params);
        return;
    L7:
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(OnScrollChangeListener l) {
        this.mOnScrollChangeListener = l;
    }

    private boolean canScroll() {
        if (getChildCount() <= 0) goto L8;
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        int childSize = (child.getHeight() + lp.topMargin) + lp.bottomMargin;
        int parentSpace = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (childSize <= parentSpace) goto L9;
        return true;
    L9:
        return false;
    L8:
        return false;
    }

    public boolean isFillViewport() {
        return this.mFillViewport;
    }

    public void setFillViewport(boolean fillViewport) {
        if (fillViewport == this.mFillViewport) goto L6;
        this.mFillViewport = fillViewport;
        requestLayout();
        return;
    }

    public boolean isSmoothScrollingEnabled() {
        return this.mSmoothScrollingEnabled;
    }

    public void setSmoothScrollingEnabled(boolean smoothScrollingEnabled) {
        this.mSmoothScrollingEnabled = smoothScrollingEnabled;
    }

    @Override // android.view.View
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        if (this.mOnScrollChangeListener == null) goto L6;
        this.mOnScrollChangeListener.onScrollChange(this, l, t, oldl, oldt);
        return;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.mFillViewport == true) goto L5;
        return;
    L5:
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        if (heightMode != 0) goto L9;
        return;
    L9:
        if (getChildCount() <= 0) goto L14;
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        int childSize = child.getMeasuredHeight();
        int parentSpace = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - lp.topMargin) - lp.bottomMargin;
        if (childSize >= parentSpace) goto L15;
        int childWidthMeasureSpec = getChildMeasureSpec(widthMeasureSpec, ((getPaddingLeft() + getPaddingRight()) + lp.leftMargin) + lp.rightMargin, lp.width);
        int childHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(parentSpace, 1073741824);
        child.measure(childWidthMeasureSpec, childHeightMeasureSpec);
        return;
    L15:
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (super.dispatchKeyEvent(event) == false) goto L5;
    L8:
        return true;
    L5:
        if (executeKeyEvent(event) == true) goto L8;
        return false;
    }

    public boolean executeKeyEvent(KeyEvent event) {
        this.mTempRect.setEmpty();
        int r1 = 130;
        if (canScroll() == true) goto L21;
        if (isFocused() == true) goto L7;
    L19:
        return false;
    L7:
        if (event.getKeyCode() == 4) goto L19;
        View currentFocused = findFocus();
        if (currentFocused != this) goto L11;
        currentFocused = null;
    L11:
        View nextFocused = FocusFinder.getInstance().findNextFocus(this, currentFocused, 130);
        if (nextFocused == null) goto L42;
        if (nextFocused != this) goto L15;
        return false;
    L15:
        if (nextFocused.requestFocus(130) == false) goto L44;
        return true;
    L44:
        return false;
    L42:
        return false;
    L21:
        if (event.getAction() == 0) goto L23;
        return false;
    L23:
        switch(event.getKeyCode()) {
            case 19: goto L38;
            case 20: goto L34;
            case 62: goto L30;
            case 92: goto L28;
            case 93: goto L27;
            case 122: goto L26;
            case 123: goto L25;
            default: goto L54;
        };
    L25:
        pageScroll(130);
        return false;
    L26:
        pageScroll(33);
        return false;
    L27:
        boolean handled = fullScroll(130);
        return handled;
    L28:
        boolean handled2 = fullScroll(33);
        return handled2;
    L54:
        return false;
    L30:
        if (event.isShiftPressed() == false) goto L32;
        r1 = 33;
    L32:
        pageScroll(r1);
        return false;
    L34:
        if (event.isAltPressed() == false) goto L36;
        boolean handled3 = fullScroll(130);
        return handled3;
    L36:
        boolean handled4 = arrowScroll(130);
        return handled4;
    L38:
        if (event.isAltPressed() == false) goto L40;
        boolean handled5 = fullScroll(33);
        return handled5;
    L40:
        boolean handled6 = arrowScroll(33);
        return handled6;
    }

    private boolean inChild(int x, int y) {
        if (getChildCount() <= 0) goto L15;
        int scrollY = getScrollY();
        View child = getChildAt(0);
        if (y >= (child.getTop() - scrollY)) goto L7;
        return false;
    L7:
        if (y < (child.getBottom() - scrollY)) goto L9;
        return false;
    L9:
        if (x >= child.getLeft()) goto L11;
        return false;
    L11:
        if (x >= child.getRight()) goto L19;
        return true;
    L19:
        return false;
    L15:
        return false;
    }

    private void initOrResetVelocityTracker() {
        if (this.mVelocityTracker != null) goto L5;
        this.mVelocityTracker = VelocityTracker.obtain();
        return;
    L5:
        this.mVelocityTracker.clear();
    }

    private void initVelocityTrackerIfNotExists() {
        if (this.mVelocityTracker != null) goto L6;
        this.mVelocityTracker = VelocityTracker.obtain();
        return;
    }

    private void recycleVelocityTracker() {
        if (this.mVelocityTracker == null) goto L6;
        this.mVelocityTracker.recycle();
        this.mVelocityTracker = null;
        return;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        if (disallowIntercept == false) goto L4;
        recycleVelocityTracker();
    L4:
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        boolean r3 = true;
        if (action != 2) goto L8;
        if (this.mIsBeingDragged == false) goto L8;
        return true;
    L8:
        switch((action & 255)) {
            case 0: goto L29;
            case 1: goto L25;
            case 2: goto L11;
            case 3: goto L25;
            case 4: goto L46;
            case 5: goto L46;
            case 6: goto L10;
            default: goto L46;
        };
    L10:
        onSecondaryPointerUp(ev);
        goto L46
    L11:
        int activePointerId = this.mActivePointerId;
        if (activePointerId == (-1)) goto L46;
        int pointerIndex = ev.findPointerIndex(activePointerId);
        if (pointerIndex != (-1)) goto L17;
        Log.e(TAG, "Invalid pointerId=" + activePointerId + " in onInterceptTouchEvent");
        goto L46
    L17:
        int y = (int) ev.getY(pointerIndex);
        int yDiff = Math.abs(y - this.mLastMotionY);
        if (yDiff <= this.mTouchSlop) goto L46;
        if ((2 & getNestedScrollAxes()) != 0) goto L46;
        this.mIsBeingDragged = true;
        this.mLastMotionY = y;
        initVelocityTrackerIfNotExists();
        this.mVelocityTracker.addMovement(ev);
        this.mNestedYOffset = 0;
        ViewParent parent = getParent();
        if (parent == null) goto L46;
        parent.requestDisallowInterceptTouchEvent(true);
        goto L46
    L25:
        this.mIsBeingDragged = false;
        this.mActivePointerId = -1;
        recycleVelocityTracker();
        if (this.mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) == false) goto L28;
        postInvalidateOnAnimation();
    L28:
        stopNestedScroll(0);
        goto L46
    L29:
        int y2 = (int) ev.getY();
        if (inChild((int) ev.getX(), y2) == false) goto L32;
        this.mLastMotionY = y2;
        this.mActivePointerId = ev.getPointerId(0);
        initOrResetVelocityTracker();
        this.mVelocityTracker.addMovement(ev);
        this.mScroller.computeScrollOffset();
        if (stopGlowAnimations(ev) == false) goto L41;
    L44:
        this.mIsBeingDragged = r3;
        startNestedScroll(2, 0);
        goto L46
    L41:
        if (this.mScroller.isFinished() == false) goto L44;
        r3 = false;
        goto L44
    L32:
        if (stopGlowAnimations(ev) == false) goto L34;
    L37:
        this.mIsBeingDragged = r3;
        recycleVelocityTracker();
        goto L46
    L34:
        if (this.mScroller.isFinished() == false) goto L37;
        r3 = false;
    L46:
        return this.mIsBeingDragged;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        initVelocityTrackerIfNotExists();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) goto L5;
        this.mNestedYOffset = 0;
    L5:
        MotionEvent velocityTrackerMotionEvent = MotionEvent.obtain(motionEvent);
        velocityTrackerMotionEvent.offsetLocation(0.0f, this.mNestedYOffset);
        switch(actionMasked) {
            case 0: goto L47;
            case 1: goto L35;
            case 2: goto L18;
            case 3: goto L11;
            case 4: goto L59;
            case 5: goto L9;
            case 6: goto L8;
            default: goto L59;
        };
    L8:
        onSecondaryPointerUp(motionEvent);
        this.mLastMotionY = (int) motionEvent.getY(motionEvent.findPointerIndex(this.mActivePointerId));
        goto L59
    L9:
        int index = motionEvent.getActionIndex();
        this.mLastMotionY = (int) motionEvent.getY(index);
        this.mActivePointerId = motionEvent.getPointerId(index);
        goto L59
    L18:
        int activePointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
        if (activePointerIndex != (-1)) goto L21;
        Log.e(TAG, "Invalid pointerId=" + this.mActivePointerId + " in onTouchEvent");
        goto L59
    L21:
        int y = (int) motionEvent.getY(activePointerIndex);
        int deltaY = this.mLastMotionY - y;
        int deltaY2 = deltaY - releaseVerticalGlow(deltaY, motionEvent.getX(activePointerIndex));
        if (this.mIsBeingDragged == true) goto L33;
        if (Math.abs(deltaY2) <= this.mTouchSlop) goto L33;
        ViewParent parent = getParent();
        if (parent == null) goto L28;
        parent.requestDisallowInterceptTouchEvent(true);
    L28:
        this.mIsBeingDragged = true;
        int r4 = this.mTouchSlop;
        if (deltaY2 <= 0) goto L31;
        deltaY2 = deltaY2 - r4;
        goto L33
    L31:
        deltaY2 = deltaY2 + r4;
    L33:
        if (this.mIsBeingDragged == false) goto L59;
        int x = (int) motionEvent.getX(activePointerIndex);
        int scrollOffset = scrollBy(deltaY2, 1, motionEvent, x, 0, false);
        this.mLastMotionY = y - scrollOffset;
        this.mNestedYOffset += scrollOffset;
        goto L59
    L35:
        VelocityTracker velocityTracker = this.mVelocityTracker;
        velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
        int initialVelocity = (int) velocityTracker.getYVelocity(this.mActivePointerId);
        if (Math.abs(initialVelocity) < this.mMinimumVelocity) goto L43;
        if (edgeEffectFling(initialVelocity) == false) goto L40;
    L45:
        endTouchDrag();
        goto L59
    L40:
        if (dispatchNestedPreFling(0.0f, -initialVelocity) == true) goto L45;
        dispatchNestedFling(0.0f, -initialVelocity, true);
        fling(-initialVelocity);
        goto L45
    L43:
        if (this.mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) == false) goto L45;
        postInvalidateOnAnimation();
        goto L45
    L11:
        if (this.mIsBeingDragged == true) goto L13;
    L17:
        endTouchDrag();
        goto L59
    L13:
        if (getChildCount() <= 0) goto L17;
        if (this.mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) == false) goto L17;
        postInvalidateOnAnimation();
        goto L17
    L47:
        if (getChildCount() != 0) goto L50;
        return false;
    L50:
        if (this.mIsBeingDragged == false) goto L55;
        ViewParent parent2 = getParent();
        if (parent2 == null) goto L55;
        parent2.requestDisallowInterceptTouchEvent(true);
    L55:
        if (this.mScroller.isFinished() == true) goto L57;
        abortAnimatedScroll();
    L57:
        initializeTouchDrag((int) motionEvent.getY(), motionEvent.getPointerId(0));
    L59:
        if (this.mVelocityTracker == null) goto L61;
        this.mVelocityTracker.addMovement(velocityTrackerMotionEvent);
    L61:
        velocityTrackerMotionEvent.recycle();
        return true;
    }

    private void initializeTouchDrag(int lastMotionY, int activePointerId) {
        this.mLastMotionY = lastMotionY;
        this.mActivePointerId = activePointerId;
        startNestedScroll(2, 0);
    }

    private void endTouchDrag() {
        this.mActivePointerId = -1;
        this.mIsBeingDragged = false;
        recycleVelocityTracker();
        stopNestedScroll(0);
        this.mEdgeGlowTop.onRelease();
        this.mEdgeGlowBottom.onRelease();
    }

    private int scrollBy(int verticalScrollDistance, int x, int touchType, boolean isSourceMouseOrKeyboard) {
        return scrollBy(verticalScrollDistance, -1, null, x, touchType, isSourceMouseOrKeyboard);
    }

    int scrollBy(int verticalScrollDistance, int verticalScrollAxis, MotionEvent ev, int x, int touchType, boolean isSourceMouseOrKeyboard) {
        if (touchType != 1) goto L6;
        startNestedScroll(2, touchType);
    L6:
        if (dispatchNestedPreScroll(0, verticalScrollDistance, this.mScrollConsumed, this.mScrollOffset, touchType) == false) goto L8;
        int verticalScrollDistance2 = verticalScrollDistance - this.mScrollConsumed[1];
        int totalScrollOffset = 0 + this.mScrollOffset[1];
        int verticalScrollDistance3 = verticalScrollDistance2;
        int totalScrollOffset2 = totalScrollOffset;
    L9:
        int initialScrollY = getScrollY();
        int scrollRangeY = getScrollRange();
        if (canOverScroll() == false) goto L13;
        if (isSourceMouseOrKeyboard == true) goto L13;
        boolean r1 = true;
    L14:
        boolean canOverscroll = r1;
        int verticalScrollDistance4 = verticalScrollDistance3;
        if (overScrollByCompat(0, verticalScrollDistance3, 0, initialScrollY, 0, scrollRangeY, 0, 0, true) == true) goto L17;
    L19:
        boolean r2 = false;
    L20:
        boolean hitScrollBarrier = r2;
        int scrollYDelta = getScrollY() - initialScrollY;
        if (ev == null) goto L24;
        if (scrollYDelta == 0) goto L24;
        getScrollFeedbackProvider().onScrollProgress(ev.getDeviceId(), ev.getSource(), verticalScrollAxis, scrollYDelta);
    L24:
        int unconsumedY = verticalScrollDistance4 - scrollYDelta;
        this.mScrollConsumed[1] = 0;
        dispatchNestedScroll(0, scrollYDelta, 0, unconsumedY, this.mScrollOffset, touchType, this.mScrollConsumed);
        int totalScrollOffset3 = totalScrollOffset2 + this.mScrollOffset[1];
        int verticalScrollDistance5 = verticalScrollDistance4 - this.mScrollConsumed[1];
        int newScrollY = initialScrollY + verticalScrollDistance5;
        if (newScrollY >= 0) goto L33;
        if (canOverscroll == false) goto L42;
        EdgeEffectCompat.onPullDistance(this.mEdgeGlowTop, (-verticalScrollDistance5) / getHeight(), x / getWidth());
        if (ev == null) goto L31;
        getScrollFeedbackProvider().onScrollLimit(ev.getDeviceId(), ev.getSource(), verticalScrollAxis, true);
    L31:
        if (this.mEdgeGlowBottom.isFinished() == true) goto L42;
        this.mEdgeGlowBottom.onRelease();
    L42:
        if (this.mEdgeGlowTop.isFinished() == true) goto L44;
    L45:
        postInvalidateOnAnimation();
        hitScrollBarrier = false;
    L46:
        if (hitScrollBarrier == false) goto L52;
        if (touchType != 0) goto L52;
        if (this.mVelocityTracker == null) goto L52;
        this.mVelocityTracker.clear();
    L52:
        if (touchType != 1) goto L54;
        stopNestedScroll(touchType);
        this.mEdgeGlowTop.onRelease();
        this.mEdgeGlowBottom.onRelease();
    L54:
        return totalScrollOffset3;
    L44:
        if (this.mEdgeGlowBottom.isFinished() == true) goto L46;
    L33:
        if (newScrollY <= scrollRangeY) goto L42;
        if (canOverscroll == false) goto L42;
        EdgeEffectCompat.onPullDistance(this.mEdgeGlowBottom, verticalScrollDistance5 / getHeight(), 1.0f - (x / getWidth()));
        if (ev == null) goto L39;
        getScrollFeedbackProvider().onScrollLimit(ev.getDeviceId(), ev.getSource(), verticalScrollAxis, false);
    L39:
        if (this.mEdgeGlowTop.isFinished() == true) goto L42;
        this.mEdgeGlowTop.onRelease();
        goto L42
    L17:
        if (hasNestedScrollingParent(touchType) == true) goto L19;
        r2 = true;
    L13:
        r1 = false;
        goto L14
    L8:
        verticalScrollDistance3 = verticalScrollDistance;
        totalScrollOffset2 = 0;
        goto L9
    }

    private boolean shouldAbsorb(EdgeEffect edgeEffect, int velocity) {
        if (velocity <= 0) goto L5;
        return true;
    L5:
        float distance = EdgeEffectCompat.getDistance(edgeEffect) * getHeight();
        float flingDistance = getSplineFlingDistance(-velocity);
        if (flingDistance < distance) goto L10;
        return false;
    L10:
        return true;
    }

    int consumeFlingInVerticalStretch(int unconsumedY) {
        int height = getHeight();
        if (unconsumedY > 0) goto L5;
    L11:
        if (unconsumedY < 0) goto L13;
    L19:
        return unconsumedY;
    L13:
        if (EdgeEffectCompat.getDistance(this.mEdgeGlowBottom) == 0.0f) goto L19;
        float deltaDistance = (unconsumedY * 4.0f) / height;
        int consumed = Math.round((height / 4.0f) * EdgeEffectCompat.onPullDistance(this.mEdgeGlowBottom, deltaDistance, 0.5f));
        if (consumed == unconsumedY) goto L18;
        this.mEdgeGlowBottom.finish();
    L18:
        return unconsumedY - consumed;
    L5:
        if (EdgeEffectCompat.getDistance(this.mEdgeGlowTop) == 0.0f) goto L11;
        float deltaDistance2 = ((-unconsumedY) * 4.0f) / height;
        int consumed2 = Math.round(((-height) / 4.0f) * EdgeEffectCompat.onPullDistance(this.mEdgeGlowTop, deltaDistance2, 0.5f));
        if (consumed2 == unconsumedY) goto L10;
        this.mEdgeGlowTop.finish();
    L10:
        return unconsumedY - consumed2;
    }

    private float getSplineFlingDistance(int velocity) {
        double l = Math.log((Math.abs(velocity) * INFLEXION) / (this.mPhysicalCoeff * SCROLL_FRICTION));
        double decelMinusOne = ((double) DECELERATION_RATE) - 1.0d;
        return (float) (((double) (this.mPhysicalCoeff * SCROLL_FRICTION)) * Math.exp((((double) DECELERATION_RATE) / decelMinusOne) * l));
    }

    private boolean edgeEffectFling(int velocityY) {
        if (EdgeEffectCompat.getDistance(this.mEdgeGlowTop) == 0.0f) goto L9;
        if (shouldAbsorb(this.mEdgeGlowTop, velocityY) == false) goto L7;
        this.mEdgeGlowTop.onAbsorb(velocityY);
        return true;
    L7:
        fling(-velocityY);
        return true;
    L9:
        if (EdgeEffectCompat.getDistance(this.mEdgeGlowBottom) != 0.0f) goto L11;
        return false;
    L11:
        if (shouldAbsorb(this.mEdgeGlowBottom, -velocityY) == false) goto L13;
        this.mEdgeGlowBottom.onAbsorb(-velocityY);
        return true;
    L13:
        fling(-velocityY);
        return true;
    }

    private boolean stopGlowAnimations(MotionEvent e) {
        boolean stopped = false;
        if (EdgeEffectCompat.getDistance(this.mEdgeGlowTop) == 0.0f) goto L6;
        EdgeEffectCompat.onPullDistance(this.mEdgeGlowTop, 0.0f, e.getX() / getWidth());
        stopped = true;
    L6:
        if (EdgeEffectCompat.getDistance(this.mEdgeGlowBottom) == 0.0f) goto L9;
        EdgeEffectCompat.onPullDistance(this.mEdgeGlowBottom, 0.0f, 1.0f - (e.getX() / getWidth()));
        return true;
    L9:
        return stopped;
    }

    private void onSecondaryPointerUp(MotionEvent ev) {
        int pointerIndex = ev.getActionIndex();
        int pointerId = ev.getPointerId(pointerIndex);
        if (pointerId != this.mActivePointerId) goto L11;
        if (pointerIndex != 0) goto L6;
        int newPointerIndex = 1;
    L7:
        this.mLastMotionY = (int) ev.getY(newPointerIndex);
        this.mActivePointerId = ev.getPointerId(newPointerIndex);
        if (this.mVelocityTracker == null) goto L12;
        this.mVelocityTracker.clear();
        return;
    L12:
        return;
    L6:
        newPointerIndex = 0;
        goto L7
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 8) goto L22;
        if (this.mIsBeingDragged == true) goto L22;
        if (MotionEventCompat.isFromSource(motionEvent, 2) == false) goto L10;
        float verticalScroll = motionEvent.getAxisValue(9);
        int x = (int) motionEvent.getX();
        int x2 = x;
        int axis = 9;
    L14:
        if (verticalScroll == 0.0f) goto L25;
        int invertedDelta = (int) (getVerticalScrollFactorCompat() * verticalScroll);
        boolean isSourceMouse = MotionEventCompat.isFromSource(motionEvent, InputDeviceCompat.SOURCE_MOUSE);
        scrollBy(-invertedDelta, axis, motionEvent, x2, 1, isSourceMouse);
        if (axis == 0) goto L24;
        this.mDifferentialMotionFlingController.onMotionEvent(motionEvent, axis);
        return true;
    L24:
        return true;
    L25:
        return false;
    L10:
        if (MotionEventCompat.isFromSource(motionEvent, 4194304) == false) goto L12;
        float verticalScroll2 = motionEvent.getAxisValue(26);
        int x3 = getWidth() / 2;
        x2 = x3;
        verticalScroll = verticalScroll2;
        axis = 26;
        goto L14
    L12:
        verticalScroll = 0.0f;
        x2 = 0;
        axis = 0;
    L22:
        return false;
    }

    private boolean canOverScroll() {
        int mode = getOverScrollMode();
        if (mode == 0) goto L11;
        if (mode == 1) goto L6;
    L8:
        return false;
    L6:
        if (getScrollRange() <= 0) goto L8;
        return true;
    L11:
        return true;
    }

    float getVerticalScrollFactorCompat() {
        if (this.mVerticalScrollFactor != 0.0f) goto L10;
        TypedValue outValue = new TypedValue();
        Context context = getContext();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, outValue, true) == false) goto L8;
        this.mVerticalScrollFactor = outValue.getDimension(context.getResources().getDisplayMetrics());
        goto L10
    L8:
        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
    L10:
        return this.mVerticalScrollFactor;
    }

    @Override // android.view.View
    protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
        super.scrollTo(scrollX, scrollY);
    }

    boolean overScrollByCompat(int deltaX, int deltaY, int scrollX, int scrollY, int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent) {
        int overScrollMode = getOverScrollMode();
        if (computeHorizontalScrollRange() <= computeHorizontalScrollExtent()) goto L5;
        boolean canScrollHorizontal = true;
    L7:
        if (computeVerticalScrollRange() <= computeVerticalScrollExtent()) goto L9;
        boolean canScrollVertical = true;
    L10:
        if (overScrollMode == 0) goto L15;
        if (overScrollMode != 1) goto L14;
        if (canScrollHorizontal == true) goto L15;
    L14:
        boolean overScrollHorizontal = false;
    L16:
        if (overScrollMode == 0) goto L21;
        if (overScrollMode != 1) goto L20;
        if (canScrollVertical == true) goto L21;
    L20:
        boolean overScrollVertical = false;
    L22:
        int newScrollX = scrollX + deltaX;
        if (overScrollHorizontal == true) goto L25;
        int maxOverScrollX2 = 0;
    L26:
        int newScrollY = scrollY + deltaY;
        if (overScrollVertical == true) goto L29;
        int maxOverScrollY2 = 0;
    L30:
        int left = -maxOverScrollX2;
        int right = maxOverScrollX2 + scrollRangeX;
        int top = -maxOverScrollY2;
        int bottom = maxOverScrollY2 + scrollRangeY;
        if (newScrollX <= right) goto L33;
        int newScrollX2 = right;
        boolean clampedX = true;
    L37:
        if (newScrollY <= bottom) goto L39;
        int newScrollY2 = bottom;
        boolean clampedY = true;
    L42:
        if (clampedY == false) goto L47;
        if (hasNestedScrollingParent(1) == true) goto L47;
        this.mScroller.springBack(newScrollX2, newScrollY2, 0, 0, 0, getScrollRange());
    L47:
        onOverScrolled(newScrollX2, newScrollY2, clampedX, clampedY);
        if (clampedX == true) goto L52;
        if (clampedY == true) goto L52;
        return false;
    L52:
        return true;
    L39:
        if (newScrollY >= top) goto L41;
        newScrollY2 = top;
        clampedY = true;
        goto L42
    L41:
        newScrollY2 = newScrollY;
        clampedY = false;
        goto L42
    L33:
        if (newScrollX >= left) goto L35;
        newScrollX2 = left;
        clampedX = true;
        goto L37
    L35:
        newScrollX2 = newScrollX;
        clampedX = false;
        goto L37
    L29:
        maxOverScrollY2 = maxOverScrollY;
        goto L30
    L25:
        maxOverScrollX2 = maxOverScrollX;
    L21:
        overScrollVertical = true;
    L15:
        overScrollHorizontal = true;
        goto L16
    L9:
        canScrollVertical = false;
        goto L10
    L5:
        canScrollHorizontal = false;
        goto L7
    }

    int getScrollRange() {
        if (getChildCount() <= 0) goto L6;
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        int childSize = (child.getHeight() + lp.topMargin) + lp.bottomMargin;
        int parentSpace = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int scrollRange = Math.max(0, childSize - parentSpace);
        return scrollRange;
    L6:
        return 0;
    }

    private View findFocusableViewInBounds(boolean topFocus, int top, int bottom) {
        List<View> focusables = getFocusables(2);
        View focusCandidate = null;
        boolean foundFullyContainedFocusable = false;
        int count = focusables.size();
        int i = 0;
    L3:
        if (i >= count) goto L31;
        View view = focusables.get(i);
        int viewTop = view.getTop();
        int viewBottom = view.getBottom();
        if (top >= viewBottom) goto L30;
        if (viewTop >= bottom) goto L30;
        boolean viewIsCloserToBoundary = false;
        if (top >= viewTop) goto L11;
        if (viewBottom >= bottom) goto L11;
        boolean viewIsFullyContained = true;
    L12:
        if (focusCandidate != null) goto L14;
        focusCandidate = view;
        foundFullyContainedFocusable = viewIsFullyContained;
        goto L30
    L14:
        if (topFocus == true) goto L16;
    L17:
        if (topFocus == false) goto L19;
    L22:
        if (foundFullyContainedFocusable == false) goto L26;
        if (viewIsFullyContained == false) goto L30;
        if (viewIsCloserToBoundary == false) goto L30;
        focusCandidate = view;
        goto L30
    L26:
        if (viewIsFullyContained == false) goto L28;
        focusCandidate = view;
        foundFullyContainedFocusable = true;
        goto L30
    L28:
        if (viewIsCloserToBoundary == false) goto L30;
        focusCandidate = view;
        goto L30
    L19:
        if (viewBottom <= focusCandidate.getBottom()) goto L22;
    L20:
        viewIsCloserToBoundary = true;
        goto L22
    L16:
        if (viewTop < focusCandidate.getTop()) goto L20;
    L11:
        viewIsFullyContained = false;
    L30:
        i = i + 1;
        goto L3
    L31:
        return focusCandidate;
    }

    public boolean pageScroll(int direction) {
        if (direction != 130) goto L5;
        boolean down = true;
    L6:
        int height = getHeight();
        Rect r3 = this.mTempRect;
        if (down == false) goto L14;
        r3.top = getScrollY() + height;
        int count = getChildCount();
        if (count <= 0) goto L17;
        View view = getChildAt(count - 1);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) view.getLayoutParams();
        int bottom = (view.getBottom() + lp.bottomMargin) + getPaddingBottom();
        if ((this.mTempRect.top + height) <= bottom) goto L17;
        this.mTempRect.top = bottom - height;
    L17:
        this.mTempRect.bottom = this.mTempRect.top + height;
        return scrollAndFocus(direction, this.mTempRect.top, this.mTempRect.bottom);
    L14:
        r3.top = getScrollY() - height;
        if (this.mTempRect.top >= 0) goto L17;
        this.mTempRect.top = 0;
        goto L17
    L5:
        down = false;
        goto L6
    }

    public boolean fullScroll(int direction) {
        if (direction != 130) goto L5;
        boolean down = true;
    L6:
        int height = getHeight();
        this.mTempRect.top = 0;
        this.mTempRect.bottom = height;
        if (down == false) goto L12;
        int count = getChildCount();
        if (count <= 0) goto L12;
        View view = getChildAt(count - 1);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) view.getLayoutParams();
        this.mTempRect.bottom = (view.getBottom() + lp.bottomMargin) + getPaddingBottom();
        this.mTempRect.top = this.mTempRect.bottom - height;
    L12:
        return scrollAndFocus(direction, this.mTempRect.top, this.mTempRect.bottom);
    L5:
        down = false;
        goto L6
    }

    private boolean scrollAndFocus(int direction, int top, int bottom) {
        boolean handled = true;
        int height = getHeight();
        int containerTop = getScrollY();
        int containerBottom = containerTop + height;
        if (direction != 33) goto L5;
        boolean up = true;
    L6:
        View newFocused = findFocusableViewInBounds(up, top, bottom);
        if (newFocused != null) goto L9;
        newFocused = this;
    L9:
        if (top < containerTop) goto L12;
        if (bottom > containerBottom) goto L12;
        handled = false;
    L17:
        if (newFocused == findFocus()) goto L19;
        newFocused.requestFocus(direction);
    L19:
        return handled;
    L12:
        if (up == false) goto L14;
        int delta = top - containerTop;
    L15:
        scrollBy(delta, 0, 1, true);
        goto L17
    L14:
        delta = bottom - containerBottom;
        goto L15
    L5:
        up = false;
        goto L6
    }

    public boolean arrowScroll(int direction) {
        View currentFocused = findFocus();
        if (currentFocused != this) goto L5;
        currentFocused = null;
    L5:
        View nextFocused = FocusFinder.getInstance().findNextFocus(this, currentFocused, direction);
        int maxJump = getMaxScrollAmount();
        if (nextFocused != null) goto L8;
    L10:
        int scrollDelta = maxJump;
        if (direction == 33) goto L13;
    L15:
        if (direction == 130) goto L17;
    L19:
        if (scrollDelta != 0) goto L21;
        return false;
    L21:
        if (direction != 130) goto L23;
        int finalScrollDelta = scrollDelta;
    L24:
        scrollBy(finalScrollDelta, 0, 1, true);
    L25:
        if (currentFocused != null) goto L27;
    L31:
        return true;
    L27:
        if (currentFocused.isFocused() == false) goto L31;
        if (isOffScreen(currentFocused) == false) goto L31;
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        goto L31
    L23:
        finalScrollDelta = -scrollDelta;
        goto L24
    L17:
        if (getChildCount() <= 0) goto L19;
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        int daBottom = child.getBottom() + lp.bottomMargin;
        int screenBottom = (getScrollY() + getHeight()) - getPaddingBottom();
        scrollDelta = Math.min(daBottom - screenBottom, maxJump);
        goto L19
    L13:
        if (getScrollY() >= scrollDelta) goto L15;
        scrollDelta = getScrollY();
        goto L19
    L8:
        if (isWithinDeltaOfScreen(nextFocused, maxJump, getHeight()) == false) goto L10;
        nextFocused.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(nextFocused, this.mTempRect);
        scrollBy(computeScrollDeltaToGetChildRectOnScreen(this.mTempRect), 0, 1, true);
        nextFocused.requestFocus(direction);
        goto L25
    }

    private boolean isOffScreen(View descendant) {
        return !isWithinDeltaOfScreen(descendant, 0, getHeight());
    }

    private boolean isWithinDeltaOfScreen(View descendant, int delta, int height) {
        descendant.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(descendant, this.mTempRect);
        if ((this.mTempRect.bottom + delta) >= getScrollY()) goto L5;
    L7:
        return false;
    L5:
        if ((this.mTempRect.top - delta) > (getScrollY() + height)) goto L7;
        return true;
    }

    private void doScrollY(int delta) {
        if (delta != 0) goto L4;
        return;
    L4:
        if (this.mSmoothScrollingEnabled == false) goto L6;
        smoothScrollBy(0, delta);
        return;
    L6:
        scrollBy(0, delta);
    }

    public final void smoothScrollBy(int dx, int dy) {
        smoothScrollBy(dx, dy, 250, false);
    }

    public final void smoothScrollBy(int dx, int dy, int scrollDurationMs) {
        smoothScrollBy(dx, dy, scrollDurationMs, false);
    }

    private void smoothScrollBy(int dx, int dy, int scrollDurationMs, boolean withNestedScrolling) {
        if (getChildCount() != 0) goto L5;
        return;
    L5:
        long duration = AnimationUtils.currentAnimationTimeMillis() - this.mLastScroll;
        if (duration <= 250) goto L9;
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        int childSize = (child.getHeight() + lp.topMargin) + lp.bottomMargin;
        int parentSpace = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int scrollY = getScrollY();
        int maxY = Math.max(0, childSize - parentSpace);
        int dy2 = Math.max(0, Math.min(scrollY + dy, maxY)) - scrollY;
        this.mScroller.startScroll(getScrollX(), scrollY, 0, dy2, scrollDurationMs);
        runAnimatedScroll(withNestedScrolling);
    L12:
        this.mLastScroll = AnimationUtils.currentAnimationTimeMillis();
        return;
    L9:
        if (this.mScroller.isFinished() == true) goto L11;
        abortAnimatedScroll();
    L11:
        scrollBy(dx, dy);
        goto L12
    }

    public final void smoothScrollTo(int x, int y) {
        smoothScrollTo(x, y, 250, false);
    }

    public final void smoothScrollTo(int x, int y, int scrollDurationMs) {
        smoothScrollTo(x, y, scrollDurationMs, false);
    }

    void smoothScrollTo(int x, int y, boolean withNestedScrolling) {
        smoothScrollTo(x, y, 250, withNestedScrolling);
    }

    void smoothScrollTo(int x, int y, int scrollDurationMs, boolean withNestedScrolling) {
        smoothScrollBy(x - getScrollX(), y - getScrollY(), scrollDurationMs, withNestedScrolling);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        int count = getChildCount();
        int parentSpace = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (count != 0) goto L5;
        return parentSpace;
    L5:
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        int scrollRange = child.getBottom() + lp.bottomMargin;
        int scrollY = getScrollY();
        int overscrollBottom = Math.max(0, scrollRange - parentSpace);
        if (scrollY < 0) goto L11;
        if (scrollY > overscrollBottom) goto L10;
        return scrollRange;
    L10:
        return scrollRange + (scrollY - overscrollBottom);
    L11:
        return scrollRange - scrollY;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) {
        ViewGroup.LayoutParams lp = child.getLayoutParams();
        int childWidthMeasureSpec = getChildMeasureSpec(parentWidthMeasureSpec, getPaddingLeft() + getPaddingRight(), lp.width);
        int childHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        child.measure(childWidthMeasureSpec, childHeightMeasureSpec);
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) child.getLayoutParams();
        int childWidthMeasureSpec = getChildMeasureSpec(parentWidthMeasureSpec, (((getPaddingLeft() + getPaddingRight()) + lp.leftMargin) + lp.rightMargin) + widthUsed, lp.width);
        int childHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(lp.topMargin + lp.bottomMargin, 0);
        child.measure(childWidthMeasureSpec, childHeightMeasureSpec);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mScroller.isFinished() == false) goto L5;
        return;
    L5:
        this.mScroller.computeScrollOffset();
        int y = this.mScroller.getCurrY();
        int unconsumed = consumeFlingInVerticalStretch(y - this.mLastScrollerY);
        this.mLastScrollerY = y;
        boolean canOverscroll = false;
        this.mScrollConsumed[1] = 0;
        dispatchNestedPreScroll(0, unconsumed, this.mScrollConsumed, null, 1);
        int scrolledByMe = unconsumed - this.mScrollConsumed[1];
        int range = getScrollRange();
        if (Build.VERSION.SDK_INT < 35) goto L8;
        Api35Impl.setFrameContentVelocity(this, Math.abs(this.mScroller.getCurrVelocity()));
    L8:
        if (scrolledByMe == 0) goto L11;
        int oldScrollY = getScrollY();
        overScrollByCompat(0, scrolledByMe, getScrollX(), oldScrollY, 0, range, 0, 0, false);
        int scrolledByMe2 = getScrollY() - oldScrollY;
        int unconsumed2 = scrolledByMe - scrolledByMe2;
        this.mScrollConsumed[1] = 0;
        dispatchNestedScroll(0, scrolledByMe2, 0, unconsumed2, this.mScrollOffset, 1, this.mScrollConsumed);
        scrolledByMe = unconsumed2 - this.mScrollConsumed[1];
    L11:
        if (scrolledByMe == 0) goto L27;
        int mode = getOverScrollMode();
        if (mode == 0) goto L16;
        if (mode != 1) goto L17;
        if (range > 0) goto L16;
    L17:
        if (canOverscroll == false) goto L25;
        if (scrolledByMe >= 0) goto L23;
        if (this.mEdgeGlowTop.isFinished() == false) goto L25;
        this.mEdgeGlowTop.onAbsorb((int) this.mScroller.getCurrVelocity());
        goto L25
    L23:
        if (this.mEdgeGlowBottom.isFinished() == false) goto L25;
        this.mEdgeGlowBottom.onAbsorb((int) this.mScroller.getCurrVelocity());
    L25:
        abortAnimatedScroll();
    L16:
        canOverscroll = true;
    L27:
        if (this.mScroller.isFinished() == true) goto L29;
        postInvalidateOnAnimation();
        return;
    L29:
        stopNestedScroll(1);
    }

    private int releaseVerticalGlow(int deltaY, float x) {
        float consumed = 0.0f;
        float displacement = x / getWidth();
        float pullDistance = deltaY / getHeight();
        if (EdgeEffectCompat.getDistance(this.mEdgeGlowTop) == 0.0f) goto L8;
        consumed = -EdgeEffectCompat.onPullDistance(this.mEdgeGlowTop, -pullDistance, displacement);
        if (EdgeEffectCompat.getDistance(this.mEdgeGlowTop) != 0.0f) goto L12;
        this.mEdgeGlowTop.onRelease();
    L12:
        int pixelsConsumed = Math.round(getHeight() * consumed);
        if (pixelsConsumed == 0) goto L15;
        invalidate();
    L15:
        return pixelsConsumed;
    L8:
        if (EdgeEffectCompat.getDistance(this.mEdgeGlowBottom) == 0.0f) goto L12;
        consumed = EdgeEffectCompat.onPullDistance(this.mEdgeGlowBottom, pullDistance, 1.0f - displacement);
        if (EdgeEffectCompat.getDistance(this.mEdgeGlowBottom) != 0.0f) goto L12;
        this.mEdgeGlowBottom.onRelease();
        goto L12
    }

    private void runAnimatedScroll(boolean participateInNestedScrolling) {
        if (participateInNestedScrolling == false) goto L5;
        startNestedScroll(2, 1);
    L6:
        this.mLastScrollerY = getScrollY();
        postInvalidateOnAnimation();
        return;
    L5:
        stopNestedScroll(1);
        goto L6
    }

    private void abortAnimatedScroll() {
        this.mScroller.abortAnimation();
        stopNestedScroll(1);
    }

    private void scrollToChild(View child) {
        child.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(child, this.mTempRect);
        int scrollDelta = computeScrollDeltaToGetChildRectOnScreen(this.mTempRect);
        if (scrollDelta == 0) goto L6;
        scrollBy(0, scrollDelta);
        return;
    }

    private boolean scrollToChildRect(Rect rect, boolean immediate) {
        int delta = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (delta == 0) goto L5;
        boolean scroll = true;
    L6:
        if (scroll == false) goto L10;
        if (immediate == false) goto L9;
        scrollBy(0, delta);
        goto L10
    L9:
        smoothScrollBy(0, delta);
    L10:
        return scroll;
    L5:
        scroll = false;
        goto L6
    }

    protected int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        if (getChildCount() != 0) goto L5;
        return 0;
    L5:
        int height = getHeight();
        int screenTop = getScrollY();
        int screenBottom = screenTop + height;
        int fadingEdge = getVerticalFadingEdgeLength();
        if (rect.top <= 0) goto L8;
        screenTop = screenTop + fadingEdge;
    L8:
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        if (rect.bottom >= ((child.getHeight() + lp.topMargin) + lp.bottomMargin)) goto L12;
        screenBottom = screenBottom - fadingEdge;
    L12:
        if (rect.bottom <= screenBottom) goto L22;
        if (rect.top <= screenTop) goto L22;
        if (rect.height() <= height) goto L18;
        int scrollYDelta = 0 + (rect.top - screenTop);
    L19:
        int bottom = child.getBottom() + lp.bottomMargin;
        int distanceToBottom = bottom - screenBottom;
        return Math.min(scrollYDelta, distanceToBottom);
    L18:
        scrollYDelta = 0 + (rect.bottom - screenBottom);
    L22:
        if (rect.top < screenTop) goto L24;
        return 0;
    L24:
        if (rect.bottom < screenBottom) goto L26;
        return 0;
    L26:
        if (rect.height() <= height) goto L28;
        int scrollYDelta2 = 0 - (screenBottom - rect.bottom);
    L30:
        return Math.max(scrollYDelta2, -getScrollY());
    L28:
        scrollYDelta2 = 0 - (screenTop - rect.top);
        goto L30
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View child, View focused) {
        if (this.mIsLayoutDirty == true) goto L5;
        scrollToChild(focused);
    L6:
        super.requestChildFocus(child, focused);
        return;
    L5:
        this.mChildToScrollTo = focused;
        goto L6
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) {
        if (direction != 2) goto L6;
        direction = 130;
    L8:
        if (previouslyFocusedRect != null) goto L10;
        View nextFocus = FocusFinder.getInstance().findNextFocus(this, null, direction);
    L12:
        if (nextFocus != null) goto L15;
        return false;
    L15:
        if (isOffScreen(nextFocus) == false) goto L18;
        return false;
    L18:
        return nextFocus.requestFocus(direction, previouslyFocusedRect);
    L10:
        nextFocus = FocusFinder.getInstance().findNextFocusFromRect(this, previouslyFocusedRect, direction);
        goto L12
    L6:
        if (direction != 1) goto L8;
        direction = 33;
        goto L8
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate) {
        rectangle.offset(child.getLeft() - child.getScrollX(), child.getTop() - child.getScrollY());
        return scrollToChildRect(rectangle, immediate);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.mIsLayoutDirty = true;
        super.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        this.mIsLayoutDirty = false;
        if (this.mChildToScrollTo != null) goto L5;
    L7:
        this.mChildToScrollTo = null;
        if (this.mIsLaidOut == false) goto L10;
    L18:
        int parentSpace = getScrollX();
        scrollTo(parentSpace, getScrollY());
        this.mIsLaidOut = true;
        return;
    L10:
        if (this.mSavedState == null) goto L12;
        scrollTo(getScrollX(), this.mSavedState.scrollPosition);
        this.mSavedState = null;
    L12:
        int childSize = 0;
        if (getChildCount() <= 0) goto L15;
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        childSize = (child.getMeasuredHeight() + lp.topMargin) + lp.bottomMargin;
    L15:
        int parentSpace2 = ((b - t) - getPaddingTop()) - getPaddingBottom();
        int currentScrollY = getScrollY();
        int newScrollY = clamp(currentScrollY, parentSpace2, childSize);
        if (newScrollY == currentScrollY) goto L18;
        scrollTo(getScrollX(), newScrollY);
        goto L18
    L5:
        if (isViewDescendantOf(this.mChildToScrollTo, this) == false) goto L7;
        scrollToChild(this.mChildToScrollTo);
        goto L7
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mIsLaidOut = false;
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        View currentFocused = findFocus();
        if (currentFocused == null) goto L10;
        if (this != currentFocused) goto L7;
        return;
    L7:
        if (isWithinDeltaOfScreen(currentFocused, 0, oldh) == false) goto L11;
        currentFocused.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(currentFocused, this.mTempRect);
        int scrollDelta = computeScrollDeltaToGetChildRectOnScreen(this.mTempRect);
        doScrollY(scrollDelta);
        return;
    L11:
        return;
    }

    private static boolean isViewDescendantOf(View child, View parent) {
        if (child != parent) goto L5;
        return true;
    L5:
        Object r1 = child.getParent();
        if ((r1 instanceof ViewGroup) == true) goto L8;
    L10:
        return false;
    L8:
        if (isViewDescendantOf((View) r1, parent) == false) goto L10;
        return true;
    }

    public void fling(int velocityY) {
        if (getChildCount() <= 0) goto L8;
        this.mScroller.fling(getScrollX(), getScrollY(), 0, velocityY, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
        runAnimatedScroll(true);
        if (Build.VERSION.SDK_INT < 35) goto L9;
        Api35Impl.setFrameContentVelocity(this, Math.abs(this.mScroller.getCurrVelocity()));
        return;
    L9:
        return;
    }

    @Override // android.view.View
    public void scrollTo(int x, int y) {
        if (getChildCount() <= 0) goto L10;
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        int parentSpaceHorizontal = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int childSizeHorizontal = (child.getWidth() + lp.leftMargin) + lp.rightMargin;
        int parentSpaceVertical = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int childSizeVertical = (child.getHeight() + lp.topMargin) + lp.bottomMargin;
        int x2 = clamp(x, parentSpaceHorizontal, childSizeHorizontal);
        int y2 = clamp(y, parentSpaceVertical, childSizeVertical);
        if (x2 == getScrollX()) goto L7;
    L8:
        super.scrollTo(x2, y2);
        return;
    L7:
        if (y2 != getScrollY()) goto L8;
        return;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int scrollY = getScrollY();
        if (this.mEdgeGlowTop.isFinished() == true) goto L15;
        int restoreCount = canvas.save();
        int width = getWidth();
        int height = getHeight();
        int xTranslation = 0;
        int yTranslation = Math.min(0, scrollY);
        if (Api21Impl.getClipToPadding(this) == false) goto L8;
        width = width - (getPaddingLeft() + getPaddingRight());
        xTranslation = 0 + getPaddingLeft();
    L8:
        if (Api21Impl.getClipToPadding(this) == false) goto L10;
        height = height - (getPaddingTop() + getPaddingBottom());
        yTranslation = yTranslation + getPaddingTop();
    L10:
        canvas.translate(xTranslation, yTranslation);
        this.mEdgeGlowTop.setSize(width, height);
        if (this.mEdgeGlowTop.draw(canvas) == false) goto L13;
        postInvalidateOnAnimation();
    L13:
        canvas.restoreToCount(restoreCount);
    L15:
        if (this.mEdgeGlowBottom.isFinished() == true) goto L27;
        int restoreCount2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int xTranslation2 = 0;
        int yTranslation2 = Math.max(getScrollRange(), scrollY) + height2;
        if (Api21Impl.getClipToPadding(this) == false) goto L20;
        width2 = width2 - (getPaddingLeft() + getPaddingRight());
        xTranslation2 = 0 + getPaddingLeft();
    L20:
        if (Api21Impl.getClipToPadding(this) == false) goto L22;
        height2 = height2 - (getPaddingTop() + getPaddingBottom());
        yTranslation2 = yTranslation2 - getPaddingBottom();
    L22:
        canvas.translate(xTranslation2 - width2, yTranslation2);
        canvas.rotate(180.0f, width2, 0.0f);
        this.mEdgeGlowBottom.setSize(width2, height2);
        if (this.mEdgeGlowBottom.draw(canvas) == false) goto L25;
        postInvalidateOnAnimation();
    L25:
        canvas.restoreToCount(restoreCount2);
        return;
    }

    private static int clamp(int n, int my, int child) {
        if (my >= child) goto L10;
        if (n >= 0) goto L6;
        return 0;
    L6:
        if ((my + n) > child) goto L8;
        return n;
    L8:
        return child - my;
    L10:
        return 0;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        if ((state instanceof SavedState) == true) goto L6;
        super.onRestoreInstanceState(state);
        return;
    L6:
        SavedState ss = (SavedState) state;
        super.onRestoreInstanceState(ss.getSuperState());
        this.mSavedState = ss;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable superState = super.onSaveInstanceState();
        SavedState ss = new SavedState(superState);
        ss.scrollPosition = getScrollY();
        return ss;
    }

    private ScrollFeedbackProviderCompat getScrollFeedbackProvider() {
        if (this.mScrollFeedbackProvider != null) goto L6;
        this.mScrollFeedbackProvider = ScrollFeedbackProviderCompat.createProvider(this);
    L6:
        return this.mScrollFeedbackProvider;
    }
}
