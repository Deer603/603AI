package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes4.dex */
public class NestedScrollingChildHelper {
    private boolean mIsNestedScrollingEnabled;
    private ViewParent mNestedScrollingParentNonTouch;
    private ViewParent mNestedScrollingParentTouch;
    private int[] mTempNestedScrollConsumed;
    private final View mView;

    public NestedScrollingChildHelper(View view) {
        this.mView = view;
    }

    public void setNestedScrollingEnabled(boolean enabled) {
        if (this.mIsNestedScrollingEnabled == false) goto L5;
        ViewCompat.stopNestedScroll(this.mView);
    L5:
        this.mIsNestedScrollingEnabled = enabled;
    }

    public boolean isNestedScrollingEnabled() {
        return this.mIsNestedScrollingEnabled;
    }

    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    public boolean hasNestedScrollingParent(int type) {
        if (getNestedScrollingParentForType(type) == null) goto L5;
        return true;
    L5:
        return false;
    }

    public boolean startNestedScroll(int axes) {
        return startNestedScroll(axes, 0);
    }

    public boolean startNestedScroll(int axes, int type) {
        if (hasNestedScrollingParent(type) == false) goto L6;
        return true;
    L6:
        if (isNestedScrollingEnabled() == false) goto L17;
        ViewParent p = this.mView.getParent();
        View child = this.mView;
    L8:
        if (p == null) goto L23;
        if (ViewParentCompat.onStartNestedScroll(p, child, this.mView, axes, type) == true) goto L11;
        if ((p instanceof View) == false) goto L16;
        child = (View) p;
    L16:
        p = p.getParent();
        goto L8
    L11:
        setNestedScrollingParentForType(type, p);
        ViewParentCompat.onNestedScrollAccepted(p, child, this.mView, axes, type);
        return true;
    L23:
        return false;
    L17:
        return false;
    }

    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public void stopNestedScroll(int type) {
        ViewParent parent = getNestedScrollingParentForType(type);
        if (parent == null) goto L6;
        ViewParentCompat.onStopNestedScroll(parent, this.mView, type);
        setNestedScrollingParentForType(type, null);
        return;
    }

    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        return dispatchNestedScrollInternal(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, 0, null);
    }

    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type) {
        return dispatchNestedScrollInternal(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type, null);
    }

    public void dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type, int[] consumed) {
        dispatchNestedScrollInternal(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type, consumed);
    }

    private boolean dispatchNestedScrollInternal(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type, int[] consumed) {
        if (isNestedScrollingEnabled() == false) goto L26;
        ViewParent parent = getNestedScrollingParentForType(type);
        if (parent != null) goto L8;
        return false;
    L8:
        if (dxConsumed != 0) goto L16;
        if (dyConsumed != 0) goto L16;
        if (dxUnconsumed != 0) goto L16;
        if (dyUnconsumed != 0) goto L16;
        if (offsetInWindow == null) goto L26;
        offsetInWindow[0] = 0;
        offsetInWindow[1] = 0;
    L16:
        if (offsetInWindow == null) goto L18;
        this.mView.getLocationInWindow(offsetInWindow);
        int startX = offsetInWindow[0];
        int startY = offsetInWindow[1];
        int startX2 = startX;
        int startY2 = startY;
    L19:
        if (consumed != null) goto L21;
        int[] consumed2 = getTempNestedScrollConsumed();
        consumed2[0] = 0;
        consumed2[1] = 0;
        int[] consumed3 = consumed2;
    L22:
        ViewParentCompat.onNestedScroll(parent, this.mView, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type, consumed3);
        if (offsetInWindow == null) goto L25;
        this.mView.getLocationInWindow(offsetInWindow);
        offsetInWindow[0] = offsetInWindow[0] - startX2;
        offsetInWindow[1] = offsetInWindow[1] - startY2;
    L25:
        return true;
    L21:
        consumed3 = consumed;
        goto L22
    L18:
        startX2 = 0;
        startY2 = 0;
    L26:
        return false;
    }

    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow) {
        return dispatchNestedPreScroll(dx, dy, consumed, offsetInWindow, 0);
    }

    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow, int type) {
        if (isNestedScrollingEnabled() == false) goto L31;
        ViewParent parent = getNestedScrollingParentForType(type);
        if (parent != null) goto L8;
        return false;
    L8:
        if (dx != 0) goto L15;
        if (dy != 0) goto L15;
        if (offsetInWindow == null) goto L31;
        offsetInWindow[0] = 0;
        offsetInWindow[1] = 0;
    L15:
        if (offsetInWindow == null) goto L17;
        this.mView.getLocationInWindow(offsetInWindow);
        int startX = offsetInWindow[0];
        int startY = offsetInWindow[1];
        int startX2 = startX;
        int startY2 = startY;
    L18:
        if (consumed != null) goto L20;
        int[] consumed2 = getTempNestedScrollConsumed();
    L21:
        consumed2[0] = 0;
        consumed2[1] = 0;
        ViewParentCompat.onNestedPreScroll(parent, this.mView, dx, dy, consumed2, type);
        if (offsetInWindow == null) goto L25;
        this.mView.getLocationInWindow(offsetInWindow);
        offsetInWindow[0] = offsetInWindow[0] - startX2;
        offsetInWindow[1] = offsetInWindow[1] - startY2;
    L25:
        if (consumed2[0] != 0) goto L29;
        if (consumed2[1] != 0) goto L29;
        return false;
    L29:
        return true;
    L20:
        consumed2 = consumed;
        goto L21
    L17:
        startX2 = 0;
        startY2 = 0;
    L31:
        return false;
    }

    public boolean dispatchNestedFling(float velocityX, float velocityY, boolean consumed) {
        if (isNestedScrollingEnabled() == false) goto L8;
        ViewParent parent = getNestedScrollingParentForType(0);
        if (parent == null) goto L8;
        return ViewParentCompat.onNestedFling(parent, this.mView, velocityX, velocityY, consumed);
    L8:
        return false;
    }

    public boolean dispatchNestedPreFling(float velocityX, float velocityY) {
        if (isNestedScrollingEnabled() == false) goto L8;
        ViewParent parent = getNestedScrollingParentForType(0);
        if (parent == null) goto L8;
        return ViewParentCompat.onNestedPreFling(parent, this.mView, velocityX, velocityY);
    L8:
        return false;
    }

    public void onDetachedFromWindow() {
        ViewCompat.stopNestedScroll(this.mView);
    }

    public void onStopNestedScroll(View child) {
        ViewCompat.stopNestedScroll(this.mView);
    }

    private ViewParent getNestedScrollingParentForType(int type) {
        switch(type) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L3;
        };
    L3:
        return null;
    L6:
        return this.mNestedScrollingParentNonTouch;
    L8:
        return this.mNestedScrollingParentTouch;
    }

    private void setNestedScrollingParentForType(int type, ViewParent p) {
        switch(type) {
            case 0: goto L5;
            case 1: goto L4;
            default: goto L8;
        };
    L4:
        this.mNestedScrollingParentNonTouch = p;
        return;
    L5:
        this.mNestedScrollingParentTouch = p;
        return;
    }

    private int[] getTempNestedScrollConsumed() {
        if (this.mTempNestedScrollConsumed != null) goto L6;
        this.mTempNestedScrollConsumed = new int[2];
    L6:
        return this.mTempNestedScrollConsumed;
    }
}
