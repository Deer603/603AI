package androidx.savedstate;

import android.view.View;
import androidx.core.viewtree.ViewTree;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewTreeSavedStateRegistryOwner.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\b\u0005\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u00020\u0002H\u0007¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"setViewTreeSavedStateRegistryOwner", "", "Landroid/view/View;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "set", "findViewTreeSavedStateRegistryOwner", "get", "savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ViewTreeSavedStateRegistryOwner {
    public static final void set(View $this$setViewTreeSavedStateRegistryOwner, SavedStateRegistryOwner owner) {
        Intrinsics.checkNotNullParameter($this$setViewTreeSavedStateRegistryOwner, "<this>");
        $this$setViewTreeSavedStateRegistryOwner.setTag(R.id.view_tree_saved_state_registry_owner, owner);
    }

    public static final SavedStateRegistryOwner get(View $this$findViewTreeSavedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter($this$findViewTreeSavedStateRegistryOwner, "<this>");
        View currentView = $this$findViewTreeSavedStateRegistryOwner;
    L3:
        View r1 = null;
        if (currentView == null) goto L16;
        Object r2 = currentView.getTag(R.id.view_tree_saved_state_registry_owner);
        if ((r2 instanceof SavedStateRegistryOwner) == false) goto L8;
        SavedStateRegistryOwner registryOwner = (SavedStateRegistryOwner) r2;
    L10:
        if (registryOwner != null) goto L11;
        Object r3 = ViewTree.getParentOrViewTreeDisjointParent(currentView);
        if ((r3 instanceof View) == false) goto L15;
        r1 = (View) r3;
    L15:
        currentView = r1;
        goto L3
    L11:
        return registryOwner;
    L8:
        registryOwner = null;
        goto L10
    L16:
        return null;
    }
}
