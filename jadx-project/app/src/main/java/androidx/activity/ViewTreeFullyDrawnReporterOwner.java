package androidx.activity;

import android.view.View;
import androidx.core.viewtree.ViewTree;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewTreeFullyLoadedReporterOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"findViewTreeFullyDrawnReporterOwner", "Landroidx/activity/FullyDrawnReporterOwner;", "Landroid/view/View;", "get", "setViewTreeFullyDrawnReporterOwner", "", "fullyDrawnReporterOwner", "set", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewTreeFullyDrawnReporterOwner {
    public static final void set(View $this$setViewTreeFullyDrawnReporterOwner, FullyDrawnReporterOwner fullyDrawnReporterOwner) {
        Intrinsics.checkNotNullParameter($this$setViewTreeFullyDrawnReporterOwner, "<this>");
        Intrinsics.checkNotNullParameter(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        $this$setViewTreeFullyDrawnReporterOwner.setTag(R.id.report_drawn, fullyDrawnReporterOwner);
    }

    public static final FullyDrawnReporterOwner get(View $this$findViewTreeFullyDrawnReporterOwner) {
        Intrinsics.checkNotNullParameter($this$findViewTreeFullyDrawnReporterOwner, "<this>");
        View currentView = $this$findViewTreeFullyDrawnReporterOwner;
    L3:
        View r1 = null;
        if (currentView == null) goto L15;
        Object r2 = currentView.getTag(R.id.report_drawn);
        if ((r2 instanceof FullyDrawnReporterOwner) == false) goto L8;
        FullyDrawnReporterOwner reporterOwner = (FullyDrawnReporterOwner) r2;
    L9:
        if (reporterOwner != null) goto L10;
        Object r3 = ViewTree.getParentOrViewTreeDisjointParent(currentView);
        if ((r3 instanceof View) == false) goto L14;
        r1 = (View) r3;
    L14:
        currentView = r1;
        goto L3
    L10:
        return reporterOwner;
    L8:
        reporterOwner = null;
        goto L9
    L15:
        return null;
    }
}
