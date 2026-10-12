package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import androidx.collection.MutableObjectList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: FocusFinderCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\"\u0010\u0006\u001a\u00020\u0007*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\u0005H\u0002\u001a*\u0010\u0006\u001a\u00020\u0007*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u001e\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0005H\u0002\u001a*\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u0010H\u0002\u001a,\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006\u0013"}, d2 = {"findViewInsideOutShouldExist", "Landroid/view/View;", "root", "start", "id", "", "addFocusableViews", "", "views", "Landroidx/collection/MutableObjectList;", "direction", "inTouchMode", "", "findUserSetNextFocus", "findViewByPredicateInsideOut", "predicate", "Lkotlin/Function1;", "findViewByPredicateTraversal", "childToSkip", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FocusFinderCompat_androidKt {
    public static final /* synthetic */ void access$addFocusableViews(View $receiver, MutableObjectList views, int direction) {
        addFocusableViews($receiver, views, direction);
    }

    public static final /* synthetic */ View access$findUserSetNextFocus(View $receiver, View root, int direction) {
        return findUserSetNextFocus($receiver, root, direction);
    }

    public static final /* synthetic */ View access$findViewInsideOutShouldExist(View root, View start, int id) {
        return findViewInsideOutShouldExist(root, start, id);
    }

    private static final View findUserSetNextFocus(final View $this$findUserSetNextFocus, final View root, int direction) {
        switch(direction) {
            case 1: goto L11;
            case 2: goto L5;
            default: goto L4;
        };
    L4:
        return null;
    L5:
        int next = $this$findUserSetNextFocus.getNextFocusForwardId();
        if (next != (-1)) goto L9;
        return null;
    L9:
        return findViewInsideOutShouldExist(root, $this$findUserSetNextFocus, next);
    L11:
        if ($this$findUserSetNextFocus.getId() != (-1)) goto L14;
        return null;
    L14:
        return findViewByPredicateInsideOut(root, $this$findUserSetNextFocus, new AnonymousClass1(root, $this$findUserSetNextFocus));
    }

    private static final View findViewInsideOutShouldExist(View root, View start, final int id) {
        return findViewByPredicateInsideOut(root, start, new C06521(id));
    }

    private static final View findViewByPredicateInsideOut(View $this$findViewByPredicateInsideOut, View start, Function1<? super View, Boolean> r7) {
        View next = start;
        View childToSkip = null;
    L3:
        View view = findViewByPredicateTraversal(next, r7, childToSkip);
        if (view != null) goto L15;
        if (next == $this$findViewByPredicateInsideOut) goto L15;
        Object r3 = next.getParent();
        if (r3 == null) goto L13;
        if ((r3 instanceof View) == false) goto L20;
        childToSkip = next;
        next = (View) r3;
        goto L3
    L20:
        return null;
    L13:
        return null;
    L15:
        return view;
    }

    private static final View findViewByPredicateTraversal(View $this$findViewByPredicateTraversal, Function1<? super View, Boolean> r5, View childToSkip) {
        if (r5.invoke($this$findViewByPredicateTraversal).booleanValue() == false) goto L6;
        return $this$findViewByPredicateTraversal;
    L6:
        if (($this$findViewByPredicateTraversal instanceof ViewGroup) == false) goto L15;
        int i = 0;
        int r1 = ((ViewGroup) $this$findViewByPredicateTraversal).getChildCount();
    L8:
        if (i >= r1) goto L21;
        View child = ((ViewGroup) $this$findViewByPredicateTraversal).getChildAt(i);
        if (child == childToSkip) goto L14;
        View v = findViewByPredicateTraversal(child, r5, childToSkip);
        if (v == null) goto L14;
        return v;
    L14:
        i = i + 1;
        goto L8
    L21:
        return null;
    L15:
        return null;
    }

    private static final void addFocusableViews(View $this$addFocusableViews, MutableObjectList<View> r2, int direction) {
        addFocusableViews($this$addFocusableViews, r2, direction, $this$addFocusableViews.isInTouchMode());
    }

    private static final void addFocusableViews(View $this$addFocusableViews, MutableObjectList<View> r4, int direction, boolean inTouchMode) {
        if ($this$addFocusableViews.getVisibility() != 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L20;
        if ($this$addFocusableViews.isFocusable() == false) goto L20;
        if ($this$addFocusableViews.isEnabled() == false) goto L20;
        if ($this$addFocusableViews.getWidth() <= 0) goto L20;
        if ($this$addFocusableViews.getHeight() <= 0) goto L20;
        if (inTouchMode == true) goto L17;
    L18:
        r4.add($this$addFocusableViews);
        goto L20
    L17:
        if ($this$addFocusableViews.isFocusableInTouchMode() == true) goto L18;
    L20:
        if (($this$addFocusableViews instanceof ViewGroup) == false) goto L24;
        int i = 0;
        int r1 = ((ViewGroup) $this$addFocusableViews).getChildCount();
    L22:
        if (i >= r1) goto L26;
        addFocusableViews(((ViewGroup) $this$addFocusableViews).getChildAt(i), r4, direction, inTouchMode);
        i = i + 1;
        goto L22
    L26:
        return;
    L24:
        return;
    L5:
        r2 = false;
        goto L6
    }
}
