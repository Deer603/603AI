package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMapKt;
import androidx.collection.ObjectList;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import java.util.Collections;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: FocusFinderCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000  2\u00020\u0001:\u0002 !B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J0\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J \u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011J2\u0010\u0014\u001a\u0004\u0018\u00010\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0003J\"\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001a\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0002J0\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J2\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat;", "", "()V", "focusedRect", "Landroid/graphics/Rect;", "tmpList", "Landroidx/collection/MutableObjectList;", "Landroid/view/View;", "userSpecifiedFocusComparator", "Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;", "FocusFinder", "", "findNextFocus", "root", "Landroid/view/ViewGroup;", "focused", "direction", "", "focusables", "findNextFocus1d", "findNextFocusInRelativeDirection", "findNextUserSpecifiedFocus", "getEffectiveRoot", "getNextFocusable", "Landroidx/collection/ObjectList;", "count", "outLooped", "", "getPreviousFocusable", "isValidId", "", "id", "Companion", "UserSpecifiedFocusComparator", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FocusFinderCompat {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final FocusFinderCompat$Companion$FocusFinderThreadLocal$1 FocusFinderThreadLocal = null;
    private final Rect focusedRect;
    private final MutableObjectList<View> tmpList;
    private final UserSpecifiedFocusComparator userSpecifiedFocusComparator;

    /* JADX INFO: compiled from: FocusFinderCompat.android.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat$Companion;", "", "()V", "FocusFinderThreadLocal", "androidx/compose/ui/platform/FocusFinderCompat$Companion$FocusFinderThreadLocal$1", "Landroidx/compose/ui/platform/FocusFinderCompat$Companion$FocusFinderThreadLocal$1;", "instance", "Landroidx/compose/ui/platform/FocusFinderCompat;", "getInstance", "()Landroidx/compose/ui/platform/FocusFinderCompat;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final FocusFinderCompat getInstance() {
            FocusFinderCompat r0 = FocusFinderCompat.access$getFocusFinderThreadLocal$cp().get();
            Intrinsics.checkNotNull(r0);
            return r0;
        }
    }

    /* JADX INFO: compiled from: FocusFinderCompat.android.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\u0003:\u0001\u001aB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010\u0013\u001a\u00020\u0014J\u001c\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;", "Ljava/util/Comparator;", "Landroid/view/View;", "Lkotlin/Comparator;", "mNextFocusGetter", "Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;", "(Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;)V", "headsOfChains", "Landroidx/collection/MutableScatterMap;", "isConnectedTo", "Landroidx/collection/MutableScatterSet;", "nextFoci", "originalOrdinal", "Landroidx/collection/MutableObjectIntMap;", "root", "compare", "", "first", "second", "recycle", "", "setFocusables", "focusables", "Landroidx/collection/ObjectList;", "setHeadOfChain", "head", "NextFocusGetter", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class UserSpecifiedFocusComparator implements Comparator<View> {
        private final MutableScatterMap<View, View> headsOfChains;
        private final MutableScatterSet<View> isConnectedTo;
        private final NextFocusGetter mNextFocusGetter;
        private final MutableScatterMap<View, View> nextFoci;
        private final MutableObjectIntMap<View> originalOrdinal;
        private View root;

        /* JADX INFO: compiled from: FocusFinderCompat.android.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;", "", "get", "Landroid/view/View;", "root", "view", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface NextFocusGetter {
            View get(View r1, View r2);
        }

        public UserSpecifiedFocusComparator(NextFocusGetter mNextFocusGetter) {
            this.mNextFocusGetter = mNextFocusGetter;
            this.nextFoci = ScatterMapKt.mutableScatterMapOf();
            this.isConnectedTo = ScatterSetKt.mutableScatterSetOf();
            this.headsOfChains = ScatterMapKt.mutableScatterMapOf();
            this.originalOrdinal = ObjectIntMapKt.mutableObjectIntMapOf();
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(View r3, View r4) {
            return compare2(r3, r4);
        }

        public final void recycle() {
            this.root = null;
            this.headsOfChains.clear();
            this.isConnectedTo.clear();
            this.originalOrdinal.clear();
            this.nextFoci.clear();
        }

        public final void setFocusables(ObjectList<View> r10, View root) {
            this.root = root;
            Object[] content$iv = r10.content;
            int i$iv = 0;
            int r4 = r10._size;
        L3:
            if (i$iv >= r4) goto L5;
            int index = i$iv;
            this.originalOrdinal.set((View) content$iv[i$iv], index);
            i$iv = i$iv + 1;
            goto L3
        L5:
            IntRange r0 = RangesKt.until(0, r10._size);
            int $i$f$getIndices = r0.getFirst();
            int i = r0.getLast();
            if ($i$f$getIndices > i) goto L14;
        L7:
            View view = r10.get(i);
            View next = this.mNextFocusGetter.get(root, view);
            if (next != null) goto L10;
        L12:
            if (i == $i$f$getIndices) goto L14;
            i = i - 1;
            goto L7
        L10:
            if (this.originalOrdinal.containsKey(next) == false) goto L12;
            this.nextFoci.set(view, next);
            this.isConnectedTo.add(next);
        L14:
            IntRange r1 = RangesKt.until(0, r10._size);
            int $i$f$getIndices2 = r1.getFirst();
            int i2 = r1.getLast();
            if ($i$f$getIndices2 > i2) goto L23;
        L16:
            View view2 = r10.get(i2);
            if (this.nextFoci.get(view2) != null) goto L19;
        L21:
            if (i2 == $i$f$getIndices2) goto L27;
            i2 = i2 - 1;
            goto L16
        L27:
            return;
        L19:
            if (this.isConnectedTo.contains(view2) == true) goto L21;
            setHeadOfChain(view2);
            goto L21
        }

        public final void setHeadOfChain(View head) {
            View newHead = head;
            View view = newHead;
        L3:
            if (view == null) goto L10;
            View otherHead = this.headsOfChains.get(view);
            if (otherHead == null) goto L9;
            if (otherHead == newHead) goto L7;
            view = newHead;
            newHead = otherHead;
            goto L9
        L7:
            return;
        L9:
            this.headsOfChains.set(view, newHead);
            view = this.nextFoci.get(view);
            goto L3
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(View first, View second) {
            if (first != second) goto L6;
            return 0;
        L6:
            if (first != null) goto L9;
            return -1;
        L9:
            if (second != null) goto L11;
            return 1;
        L11:
            View firstHead = this.headsOfChains.get(first);
            View secondHead = this.headsOfChains.get(second);
            if (firstHead != secondHead) goto L23;
            if (firstHead == null) goto L23;
            if (first == firstHead) goto L39;
            if (second != firstHead) goto L19;
            return 1;
        L19:
            if (this.nextFoci.get(first) == null) goto L22;
            return -1;
        L22:
            return 1;
        L39:
            return -1;
        L23:
            if (firstHead != null) goto L25;
            View chainedFirst = first;
        L26:
            if (secondHead != null) goto L28;
            View chainedSecond = second;
        L29:
            if (firstHead != null) goto L34;
            if (secondHead != null) goto L34;
            return 0;
        L34:
            if (this.originalOrdinal.get(chainedFirst) >= this.originalOrdinal.get(chainedSecond)) goto L37;
            return -1;
        L37:
            return 1;
        L28:
            chainedSecond = secondHead;
            goto L29
        L25:
            chainedFirst = firstHead;
            goto L26
        }
    }

    public FocusFinderCompat() {
        this.focusedRect = new Rect();
        this.userSpecifiedFocusComparator = new UserSpecifiedFocusComparator(new FocusFinderCompat$$ExternalSyntheticLambda0(this));
        this.tmpList = new MutableObjectList(0, 1, null);
    }

    public static final /* synthetic */ FocusFinderCompat$Companion$FocusFinderThreadLocal$1 access$getFocusFinderThreadLocal$cp() {
        return FocusFinderThreadLocal;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.platform.FocusFinderCompat$Companion$FocusFinderThreadLocal$1] */
    static {
        Companion = new Companion(null);
        $stable = 8;
        FocusFinderThreadLocal = new FocusFinderCompat$Companion$FocusFinderThreadLocal$1();
    }

    static final View userSpecifiedFocusComparator$lambda$0(FocusFinderCompat this$0, View r, View v) {
        if (this$0.isValidId(v.getNextFocusForwardId()) == true) goto L7;
        return null;
    L7:
        return FocusFinderCompat_androidKt.access$findUserSetNextFocus(v, r, 2);
    }

    private final void FocusFinder() {
    }

    public final View findNextFocus1d(ViewGroup root, View focused, int direction) {
        ViewGroup effectiveRoot = getEffectiveRoot(root, focused);
        View next = findNextUserSpecifiedFocus(effectiveRoot, focused, direction);
        if (next == null) goto L5;
        return next;
    L5:
        MutableObjectList<View> r2 = this.tmpList;
        r2.clear();     // Catch: Throwable -> L12
        FocusFinderCompat_androidKt.access$addFocusableViews(effectiveRoot, r2, direction);     // Catch: Throwable -> L12
        if (r2.isEmpty() == true) goto L10;
        next = findNextFocus(effectiveRoot, focused, direction, r2);     // Catch: Throwable -> L12
    L10:
        r2.clear();
        return next;
    L12:
        th = move-exception;
        r2.clear();
        throw th;
    }

    private final ViewGroup getEffectiveRoot(ViewGroup root, View focused) {
        if (focused == null) goto L20;
        if (focused == root) goto L20;
        ViewGroup effective = null;
        ViewParent nextParent = focused.getParent();
    L7:
        if ((nextParent instanceof ViewGroup) == false) goto L19;
        if (nextParent == root) goto L9;
        ViewParent vg = nextParent;
        if (((ViewGroup) vg).getTouchscreenBlocksFocus() == false) goto L18;
        if (focused.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen") == false) goto L18;
        effective = (ViewGroup) vg;
    L18:
        nextParent = ((ViewGroup) nextParent).getParent();
        goto L7
    L9:
        if (effective != null) goto L12;
        return root;
    L12:
        return effective;
    L19:
        return root;
    L20:
        return root;
    }

    private final View findNextUserSpecifiedFocus(ViewGroup root, View focused, int direction) {
        View userSetNextFocus = FocusFinderCompat_androidKt.access$findUserSetNextFocus(focused, root, direction);
        View cycleCheck = userSetNextFocus;
        boolean cycleStep = true;
    L4:
        if (userSetNextFocus == null) goto L25;
        if (userSetNextFocus.isFocusable() == true) goto L8;
    L14:
        userSetNextFocus = FocusFinderCompat_androidKt.access$findUserSetNextFocus(userSetNextFocus, root, direction);
        if (cycleStep == true) goto L17;
        boolean r4 = true;
    L18:
        boolean it = r4;
        cycleStep = it;
        if (r4 == false) goto L4;
        if (cycleCheck == null) goto L22;
        View r5 = FocusFinderCompat_androidKt.access$findUserSetNextFocus(cycleCheck, root, direction);
    L23:
        cycleCheck = r5;
        if (cycleCheck != userSetNextFocus) goto L4;
    L22:
        r5 = null;
        goto L23
    L17:
        r4 = false;
        goto L18
    L8:
        if (userSetNextFocus.getVisibility() != 0) goto L14;
        if (userSetNextFocus.isInTouchMode() == false) goto L13;
        if (userSetNextFocus.isFocusableInTouchMode() == false) goto L14;
    L13:
        return userSetNextFocus;
    L25:
        return null;
    }

    private final View findNextFocus(ViewGroup root, View focused, int direction, MutableObjectList<View> r6) {
        Rect focusedRect = this.focusedRect;
        focused.getFocusedRect(focusedRect);
        root.offsetDescendantRectToMyCoords(focused, focusedRect);
        return findNextFocusInRelativeDirection(r6, root, focused, direction);
    }

    private final View findNextFocusInRelativeDirection(MutableObjectList<View> r5, ViewGroup root, View focused, int direction) {
        Intrinsics.checkNotNull(root);     // Catch: Throwable -> L16
        this.userSpecifiedFocusComparator.setFocusables(r5, root);     // Catch: Throwable -> L16
        Collections.sort(r5.asMutableList(), this.userSpecifiedFocusComparator);     // Catch: Throwable -> L16
        this.userSpecifiedFocusComparator.recycle();
        int count = r5.getSize();
        if (count >= 2) goto L7;
        return null;
    L7:
        View next = null;
        boolean[] looped = new boolean[1];
        switch(direction) {
            case 1: goto L11;
            case 2: goto L10;
            default: goto L12;
        };
    L10:
        next = getNextFocusable(focused, r5, count, looped);
        goto L12
    L11:
        next = getPreviousFocusable(focused, r5, count, looped);
    L12:
        if (next != null) goto L15;
        return r5.get(count - 1);
    L15:
        return next;
    L16:
        th = move-exception;
        this.userSpecifiedFocusComparator.recycle();
        throw th;
    }

    private final View getNextFocusable(View focused, ObjectList<View> r5, int count, boolean[] outLooped) {
        if (count >= 2) goto L6;
        return null;
    L6:
        int position = r5.lastIndexOf(focused);
        if (position >= 0) goto L9;
    L12:
        outLooped[0] = true;
        return r5.get(0);
    L9:
        if ((position + 1) >= count) goto L12;
        return r5.get(position + 1);
    }

    private final View getPreviousFocusable(View focused, ObjectList<View> r4, int count, boolean[] outLooped) {
        if (count >= 2) goto L6;
        return null;
    L6:
        if (focused == null) goto L11;
        int position = r4.indexOf(focused);
        if (position <= 0) goto L11;
        return r4.get(position - 1);
    L11:
        outLooped[0] = true;
        return r4.get(count - 1);
    }

    private final boolean isValidId(int id) {
        if (id != 0) goto L4;
    L6:
        return false;
    L4:
        if (id == (-1)) goto L6;
        return true;
    }
}
