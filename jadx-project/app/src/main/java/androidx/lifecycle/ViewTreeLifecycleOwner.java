package androidx.lifecycle;

import android.view.View;
import androidx.core.viewtree.ViewTree;
import androidx.lifecycle.runtime.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewTreeLifecycleOwner.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\b\u0005\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u00020\u0002H\u0007¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"setViewTreeLifecycleOwner", "", "Landroid/view/View;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "set", "findViewTreeLifecycleOwner", "get", "lifecycle-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ViewTreeLifecycleOwner {
    public static final void set(View $this$setViewTreeLifecycleOwner, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter($this$setViewTreeLifecycleOwner, "<this>");
        $this$setViewTreeLifecycleOwner.setTag(R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }

    public static final LifecycleOwner get(View $this$findViewTreeLifecycleOwner) {
        Intrinsics.checkNotNullParameter($this$findViewTreeLifecycleOwner, "<this>");
        View currentView = $this$findViewTreeLifecycleOwner;
    L3:
        View r1 = null;
        if (currentView == null) goto L15;
        Object r2 = currentView.getTag(R.id.view_tree_lifecycle_owner);
        if ((r2 instanceof LifecycleOwner) == false) goto L8;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) r2;
    L9:
        if (lifecycleOwner != null) goto L10;
        Object r3 = ViewTree.getParentOrViewTreeDisjointParent(currentView);
        if ((r3 instanceof View) == false) goto L14;
        r1 = (View) r3;
    L14:
        currentView = r1;
        goto L3
    L10:
        return lifecycleOwner;
    L8:
        lifecycleOwner = null;
        goto L9
    L15:
        return null;
    }
}
