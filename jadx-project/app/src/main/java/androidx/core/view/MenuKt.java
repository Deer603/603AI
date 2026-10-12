package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import androidx.autofill.HintConstants;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0003\u001a\u0015\u0010\n\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0086\u0002\u001a0\u0010\r\u001a\u00020\u000e*\u00020\u00032!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000e0\u0010H\u0086\b\u001aE\u0010\u0013\u001a\u00020\u000e*\u00020\u000326\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000e0\u0014H\u0086\b\u001a\u0015\u0010\u0016\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0007H\u0086\n\u001a\r\u0010\u0017\u001a\u00020\u000b*\u00020\u0003H\u0086\b\u001a\r\u0010\u0018\u001a\u00020\u000b*\u00020\u0003H\u0086\b\u001a\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a*\u00020\u0003H\u0086\u0002\u001a\u0015\u0010\u001b\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010\u001c\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0007H\u0086\b\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u0007*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001d"}, d2 = {"children", "Lkotlin/sequences/Sequence;", "Landroid/view/MenuItem;", "Landroid/view/Menu;", "getChildren", "(Landroid/view/Menu;)Lkotlin/sequences/Sequence;", "size", "", "getSize", "(Landroid/view/Menu;)I", "contains", "", "item", "forEach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "forEachIndexed", "Lkotlin/Function2;", "index", "get", "isEmpty", "isNotEmpty", "iterator", "", "minusAssign", "removeItemAt", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MenuKt {

    /* JADX INFO: renamed from: androidx.core.view.MenuKt$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Menu.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"androidx/core/view/MenuKt$iterator$1", "", "Landroid/view/MenuItem;", "index", "", "hasNext", "", "next", "remove", "", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 implements Iterator<MenuItem>, KMutableIterator {
        final /* synthetic */ Menu $this_iterator;
        private int index;

        AnonymousClass1(Menu $receiver) {
            this.$this_iterator = $receiver;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ MenuItem next() {
            return next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.index >= this.$this_iterator.size()) goto L5;
            return true;
        L5:
            return false;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public MenuItem next() {
            Menu r0 = this.$this_iterator;
            int r1 = this.index;
            this.index = r1 + 1;
            MenuItem r2 = r0.getItem(r1);
            if (r2 == null) goto L6;
            return r2;
        L6:
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public void remove() {
            Menu $this$removeItemAt$iv = this.$this_iterator;
            this.index--;
            int index$iv = this.index;
            MenuItem it$iv = $this$removeItemAt$iv.getItem(index$iv);
            if (it$iv == null) goto L5;
            $this$removeItemAt$iv.removeItem(it$iv.getItemId());
            Unit r3 = Unit.INSTANCE;
        L6:
            if (r3 == null) goto L9;
            return;
        L9:
            throw new IndexOutOfBoundsException();
        L5:
            r3 = null;
            goto L6
        }
    }

    public static final MenuItem get(Menu $this$get, int index) {
        return $this$get.getItem(index);
    }

    public static final boolean contains(Menu $this$contains, MenuItem item) {
        int index = 0;
        int r1 = $this$contains.size();
    L3:
        if (index >= r1) goto L9;
        if (Intrinsics.areEqual($this$contains.getItem(index), item) == true) goto L6;
        index = index + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    public static final void minusAssign(Menu $this$minusAssign, MenuItem item) {
        $this$minusAssign.removeItem(item.getItemId());
    }

    public static final int getSize(Menu $this$size) {
        return $this$size.size();
    }

    public static final boolean isEmpty(Menu $this$isEmpty) {
        if ($this$isEmpty.size() != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final boolean isNotEmpty(Menu $this$isNotEmpty) {
        if ($this$isNotEmpty.size() == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final void forEach(Menu $this$forEach, Function1<? super MenuItem, Unit> r5) {
        int index = 0;
        int r2 = $this$forEach.size();
    L3:
        if (index >= r2) goto L5;
        r5.invoke($this$forEach.getItem(index));
        index = index + 1;
        goto L3
    }

    public static final void forEachIndexed(Menu $this$forEachIndexed, Function2<? super Integer, ? super MenuItem, Unit> r6) {
        int index = 0;
        int r2 = $this$forEachIndexed.size();
    L3:
        if (index >= r2) goto L5;
        r6.invoke(Integer.valueOf(index), $this$forEachIndexed.getItem(index));
        index = index + 1;
        goto L3
    }

    public static final Iterator<MenuItem> iterator(Menu $this$iterator) {
        return new AnonymousClass1($this$iterator);
    }

    public static final void removeItemAt(Menu $this$removeItemAt, int index) {
        MenuItem it = $this$removeItemAt.getItem(index);
        if (it == null) goto L5;
        $this$removeItemAt.removeItem(it.getItemId());
        Unit r1 = Unit.INSTANCE;
    L6:
        if (r1 == null) goto L9;
        return;
    L9:
        throw new IndexOutOfBoundsException();
    L5:
        r1 = null;
        goto L6
    }

    public static final Sequence<MenuItem> getChildren(final Menu $this$children) {
        return new MenuKt$children$1($this$children);
    }
}
