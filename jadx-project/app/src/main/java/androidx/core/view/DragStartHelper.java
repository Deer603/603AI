package androidx.core.view;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class DragStartHelper {
    private boolean mDragging;
    private int mLastTouchX;
    private int mLastTouchY;
    private final OnDragStartListener mListener;
    private final View.OnLongClickListener mLongClickListener;
    private final View.OnTouchListener mTouchListener;
    private final View mView;

    public interface OnDragStartListener {
        boolean onDragStart(View r1, DragStartHelper r2);
    }

    public DragStartHelper(View view, OnDragStartListener listener) {
        this.mLongClickListener = new DragStartHelper$$ExternalSyntheticLambda0(this);
        this.mTouchListener = new DragStartHelper$$ExternalSyntheticLambda1(this);
        this.mView = view;
        this.mListener = listener;
    }

    public void attach() {
        this.mView.setOnLongClickListener(this.mLongClickListener);
        this.mView.setOnTouchListener(this.mTouchListener);
    }

    public void detach() {
        this.mView.setOnLongClickListener(null);
        this.mView.setOnTouchListener(null);
    }

    public boolean onTouch(View v, MotionEvent event) {
        int x = (int) event.getX();
        int y = (int) event.getY();
        switch(event.getAction()) {
            case 0: goto L21;
            case 1: goto L20;
            case 2: goto L6;
            case 3: goto L20;
            default: goto L22;
        };
    L20:
        this.mDragging = false;
        goto L22
    L21:
        this.mLastTouchX = x;
        this.mLastTouchY = y;
    L22:
        return false;
    L6:
        if (MotionEventCompat.isFromSource(event, InputDeviceCompat.SOURCE_MOUSE) == false) goto L22;
        if ((event.getButtonState() & 1) == 0) goto L22;
        if (this.mDragging == true) goto L22;
        if (this.mLastTouchX == x) goto L16;
    L18:
        this.mLastTouchX = x;
        this.mLastTouchY = y;
        this.mDragging = this.mListener.onDragStart(v, this);
        return this.mDragging;
    L16:
        if (this.mLastTouchY != y) goto L18;
        goto L18
    }

    public boolean onLongClick(View v) {
        if (this.mDragging == false) goto L6;
        return true;
    L6:
        this.mDragging = this.mListener.onDragStart(v, this);
        return this.mDragging;
    }

    public void getTouchPosition(Point point) {
        point.set(this.mLastTouchX, this.mLastTouchY);
    }
}
