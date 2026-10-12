package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.autofill.HintConstants;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: ViewGroup.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0015\u0010\u0010\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0086\n\u001a0\u0010\u0013\u001a\u00020\u0014*\u00020\u00032!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00140\u0016H\u0086\b\u001aE\u0010\u0019\u001a\u00020\u0014*\u00020\u000326\u0010\u0015\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00140\u001aH\u0086\b\u001a\u0015\u0010\u001c\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u001b\u001a\u00020\rH\u0086\u0002\u001a\r\u0010\u001d\u001a\u00020\u0011*\u00020\u0003H\u0086\b\u001a\r\u0010\u001e\u001a\u00020\u0011*\u00020\u0003H\u0086\b\u001a\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 *\u00020\u0003H\u0086\u0002\u001a\u0015\u0010!\u001a\u00020\u0014*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010\"\u001a\u00020\u0014*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0086\n\u001a\u0017\u0010#\u001a\u00020\u0014*\u00020$2\b\b\u0001\u0010\f\u001a\u00020\rH\u0086\b\u001a5\u0010%\u001a\u00020\u0014*\u00020$2\b\b\u0003\u0010&\u001a\u00020\r2\b\b\u0003\u0010'\u001a\u00020\r2\b\b\u0003\u0010(\u001a\u00020\r2\b\b\u0003\u0010)\u001a\u00020\rH\u0086\b\u001a5\u0010*\u001a\u00020\u0014*\u00020$2\b\b\u0003\u0010+\u001a\u00020\r2\b\b\u0003\u0010'\u001a\u00020\r2\b\b\u0003\u0010,\u001a\u00020\r2\b\b\u0003\u0010)\u001a\u00020\rH\u0086\b\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\"\u0016\u0010\b\u001a\u00020\t*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0016\u0010\f\u001a\u00020\r*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006-"}, d2 = {"children", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "Landroid/view/ViewGroup;", "getChildren", "(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;", "descendants", "getDescendants", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "(Landroid/view/ViewGroup;)Lkotlin/ranges/IntRange;", "size", "", "getSize", "(Landroid/view/ViewGroup;)I", "contains", "", "view", "forEach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "forEachIndexed", "Lkotlin/Function2;", "index", "get", "isEmpty", "isNotEmpty", "iterator", "", "minusAssign", "plusAssign", "setMargins", "Landroid/view/ViewGroup$MarginLayoutParams;", "updateMargins", "left", "top", "right", "bottom", "updateMarginsRelative", "start", "end", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewGroupKt {

    /* JADX INFO: renamed from: androidx.core.view.ViewGroupKt$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: ViewGroup.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"androidx/core/view/ViewGroupKt$iterator$1", "", "Landroid/view/View;", "index", "", "hasNext", "", "next", "remove", "", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 implements Iterator<View>, KMutableIterator {
        final /* synthetic */ ViewGroup $this_iterator;
        private int index;

        AnonymousClass1(ViewGroup $receiver) {
            this.$this_iterator = $receiver;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ View next() {
            return next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.index >= this.$this_iterator.getChildCount()) goto L5;
            return true;
        L5:
            return false;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public View next() {
            ViewGroup r0 = this.$this_iterator;
            int r1 = this.index;
            this.index = r1 + 1;
            View r2 = r0.getChildAt(r1);
            if (r2 == null) goto L6;
            return r2;
        L6:
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup r0 = this.$this_iterator;
            this.index--;
            r0.removeViewAt(this.index);
        }
    }

    public static final View get(ViewGroup $this$get, int index) {
        View r0 = $this$get.getChildAt(index);
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + $this$get.getChildCount());
    }

    public static final boolean contains(ViewGroup $this$contains, View view) {
        if ($this$contains.indexOfChild(view) == (-1)) goto L5;
        return true;
    L5:
        return false;
    }

    public static final void plusAssign(ViewGroup $this$plusAssign, View view) {
        $this$plusAssign.addView(view);
    }

    public static final void minusAssign(ViewGroup $this$minusAssign, View view) {
        $this$minusAssign.removeView(view);
    }

    public static final int getSize(ViewGroup $this$size) {
        return $this$size.getChildCount();
    }

    public static final boolean isEmpty(ViewGroup $this$isEmpty) {
        if ($this$isEmpty.getChildCount() != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final boolean isNotEmpty(ViewGroup $this$isNotEmpty) {
        if ($this$isNotEmpty.getChildCount() == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final void forEach(ViewGroup $this$forEach, Function1<? super View, Unit> r5) {
        int index = 0;
        int r2 = $this$forEach.getChildCount();
    L3:
        if (index >= r2) goto L5;
        r5.invoke($this$forEach.getChildAt(index));
        index = index + 1;
        goto L3
    }

    public static final void forEachIndexed(ViewGroup $this$forEachIndexed, Function2<? super Integer, ? super View, Unit> r6) {
        int index = 0;
        int r2 = $this$forEachIndexed.getChildCount();
    L3:
        if (index >= r2) goto L5;
        r6.invoke(Integer.valueOf(index), $this$forEachIndexed.getChildAt(index));
        index = index + 1;
        goto L3
    }

    public static final IntRange getIndices(ViewGroup $this$indices) {
        return RangesKt.until(0, $this$indices.getChildCount());
    }

    public static final Iterator<View> iterator(ViewGroup $this$iterator) {
        return new AnonymousClass1($this$iterator);
    }

    public static final Sequence<View> getChildren(final ViewGroup $this$children) {
        return new ViewGroupKt$children$1($this$children);
    }

    public static final Sequence<View> getDescendants(final ViewGroup $this$descendants) {
        return new ViewGroupKt$special$$inlined$Sequence$1($this$descendants);
    }

    public static final void setMargins(ViewGroup.MarginLayoutParams $this$setMargins, int size) {
        $this$setMargins.setMargins(size, size, size, size);
    }

    public static /* synthetic */ void updateMargins$default(ViewGroup.MarginLayoutParams $this$updateMargins_u24default, int left, int top, int right, int bottom, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        left = $this$updateMargins_u24default.leftMargin;
    L6:
        if ((r5 & 2) == 0) goto L9;
        top = $this$updateMargins_u24default.topMargin;
    L9:
        if ((r5 & 4) == 0) goto L12;
        right = $this$updateMargins_u24default.rightMargin;
    L12:
        if ((r5 & 8) == 0) goto L14;
        bottom = $this$updateMargins_u24default.bottomMargin;
    L14:
        $this$updateMargins_u24default.setMargins(left, top, right, bottom);
    }

    public static final void updateMargins(ViewGroup.MarginLayoutParams $this$updateMargins, int left, int top, int right, int bottom) {
        $this$updateMargins.setMargins(left, top, right, bottom);
    }

    public static /* synthetic */ void updateMarginsRelative$default(ViewGroup.MarginLayoutParams $this$updateMarginsRelative_u24default, int start, int top, int end, int bottom, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        start = $this$updateMarginsRelative_u24default.getMarginStart();
    L6:
        if ((r5 & 2) == 0) goto L9;
        top = $this$updateMarginsRelative_u24default.topMargin;
    L9:
        if ((r5 & 4) == 0) goto L12;
        end = $this$updateMarginsRelative_u24default.getMarginEnd();
    L12:
        if ((r5 & 8) == 0) goto L14;
        bottom = $this$updateMarginsRelative_u24default.bottomMargin;
    L14:
        $this$updateMarginsRelative_u24default.setMarginStart(start);
        $this$updateMarginsRelative_u24default.topMargin = top;
        $this$updateMarginsRelative_u24default.setMarginEnd(end);
        $this$updateMarginsRelative_u24default.bottomMargin = bottom;
    }

    public static final void updateMarginsRelative(ViewGroup.MarginLayoutParams $this$updateMarginsRelative, int start, int top, int end, int bottom) {
        $this$updateMarginsRelative.setMarginStart(start);
        $this$updateMarginsRelative.topMargin = top;
        $this$updateMarginsRelative.setMarginEnd(end);
        $this$updateMarginsRelative.bottomMargin = bottom;
    }
}
