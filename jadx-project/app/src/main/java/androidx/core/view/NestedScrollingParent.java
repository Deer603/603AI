package androidx.core.view;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public interface NestedScrollingParent {
    int getNestedScrollAxes();

    boolean onNestedFling(View r1, float r2, float r3, boolean r4);

    boolean onNestedPreFling(View r1, float r2, float r3);

    void onNestedPreScroll(View r1, int r2, int r3, int[] r4);

    void onNestedScroll(View r1, int r2, int r3, int r4, int r5);

    void onNestedScrollAccepted(View r1, View r2, int r3);

    boolean onStartNestedScroll(View r1, View r2, int r3);

    void onStopNestedScroll(View r1);
}
