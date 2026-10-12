package androidx.core.viewtree;

import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewTree.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¨\u0006\u0006"}, d2 = {"getParentOrViewTreeDisjointParent", "Landroid/view/ViewParent;", "Landroid/view/View;", "setViewTreeDisjointParent", "", "parent", "core-viewtree_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewTree {
    public static final void setViewTreeDisjointParent(View $this$setViewTreeDisjointParent, ViewParent parent) {
        Intrinsics.checkNotNullParameter($this$setViewTreeDisjointParent, "<this>");
        $this$setViewTreeDisjointParent.setTag(R.id.view_tree_disjoint_parent, parent);
    }

    public static final ViewParent getParentOrViewTreeDisjointParent(View $this$getParentOrViewTreeDisjointParent) {
        Intrinsics.checkNotNullParameter($this$getParentOrViewTreeDisjointParent, "<this>");
        ViewParent parent = $this$getParentOrViewTreeDisjointParent.getParent();
        if (parent == null) goto L5;
        return parent;
    L5:
        Object djParent = $this$getParentOrViewTreeDisjointParent.getTag(R.id.view_tree_disjoint_parent);
        if ((djParent instanceof ViewParent) == true) goto L10;
        return null;
    L10:
        return (ViewParent) djParent;
    }
}
