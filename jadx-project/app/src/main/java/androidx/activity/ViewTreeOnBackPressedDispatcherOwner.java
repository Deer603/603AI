package androidx.activity;

import android.view.View;
import androidx.core.viewtree.ViewTree;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"findViewTreeOnBackPressedDispatcherOwner", "Landroidx/activity/OnBackPressedDispatcherOwner;", "Landroid/view/View;", "get", "setViewTreeOnBackPressedDispatcherOwner", "", "onBackPressedDispatcherOwner", "set", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewTreeOnBackPressedDispatcherOwner {
    public static final void set(View $this$setViewTreeOnBackPressedDispatcherOwner, OnBackPressedDispatcherOwner onBackPressedDispatcherOwner) {
        Intrinsics.checkNotNullParameter($this$setViewTreeOnBackPressedDispatcherOwner, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        $this$setViewTreeOnBackPressedDispatcherOwner.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }

    public static final OnBackPressedDispatcherOwner get(View $this$findViewTreeOnBackPressedDispatcherOwner) {
        Intrinsics.checkNotNullParameter($this$findViewTreeOnBackPressedDispatcherOwner, "<this>");
        View currentView = $this$findViewTreeOnBackPressedDispatcherOwner;
    L3:
        View r1 = null;
        if (currentView == null) goto L16;
        Object r2 = currentView.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
        if ((r2 instanceof OnBackPressedDispatcherOwner) == false) goto L8;
        OnBackPressedDispatcherOwner dispatchOwner = (OnBackPressedDispatcherOwner) r2;
    L10:
        if (dispatchOwner != null) goto L11;
        Object r3 = ViewTree.getParentOrViewTreeDisjointParent(currentView);
        if ((r3 instanceof View) == false) goto L15;
        r1 = (View) r3;
    L15:
        currentView = r1;
        goto L3
    L11:
        return dispatchOwner;
    L8:
        dispatchOwner = null;
        goto L10
    L16:
        return null;
    }
}
