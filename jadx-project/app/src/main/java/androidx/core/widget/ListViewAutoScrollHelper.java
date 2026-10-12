package androidx.core.widget;

import android.view.View;
import android.widget.ListView;

/* JADX INFO: loaded from: classes4.dex */
public class ListViewAutoScrollHelper extends AutoScrollHelper {
    private final ListView mTarget;

    public ListViewAutoScrollHelper(ListView target) {
        super(target);
        this.mTarget = target;
    }

    @Override // androidx.core.widget.AutoScrollHelper
    public void scrollTargetBy(int deltaX, int deltaY) {
        this.mTarget.scrollListBy(deltaY);
    }

    @Override // androidx.core.widget.AutoScrollHelper
    public boolean canTargetScrollHorizontally(int direction) {
        return false;
    }

    @Override // androidx.core.widget.AutoScrollHelper
    public boolean canTargetScrollVertically(int direction) {
        ListView target = this.mTarget;
        int itemCount = target.getCount();
        if (itemCount != 0) goto L5;
        return false;
    L5:
        int childCount = target.getChildCount();
        int firstPosition = target.getFirstVisiblePosition();
        int lastPosition = firstPosition + childCount;
        if (direction <= 0) goto L12;
        if (lastPosition < itemCount) goto L18;
        View lastView = target.getChildAt(childCount - 1);
        if (lastView.getBottom() > target.getHeight()) goto L22;
        return false;
    L22:
        return true;
    L18:
        return true;
    L12:
        if (direction >= 0) goto L20;
        if (firstPosition > 0) goto L21;
        View firstView = target.getChildAt(0);
        if (firstView.getTop() < 0) goto L23;
        return false;
    L23:
        return true;
    L21:
        return true;
    L20:
        return false;
    }
}
