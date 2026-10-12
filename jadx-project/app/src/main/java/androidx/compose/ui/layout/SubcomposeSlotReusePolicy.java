package androidx.compose.ui.layout;

import androidx.collection.MutableOrderedScatterSet;
import androidx.collection.OrderedScatterSet;
import androidx.collection.OrderedScatterSetKt;
import androidx.collection.SieveCacheKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\nJ\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "", "areCompatible", "", "slotId", "reusableSlotId", "getSlotsToRetain", "", "slotIds", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "SlotIdsSet", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SubcomposeSlotReusePolicy {

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\b\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0019\b\u0000\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0017\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0002\b\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0018\u0010\u0012\u001a\u00020\u000b2\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0016J\u001c\u0010\u0014\u001a\u00020\u000f2\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u000f0\u0016J\b\u0010\u0017\u001a\u00020\u000bH\u0016J\u0011\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0019H\u0096\u0002J\u0010\u0010\u001a\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002J\u001c\u0010\u001b\u001a\u00020\u000b2\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u000b0\u0016J\u0016\u0010\u001b\u001a\u00020\u000b2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u001c\u0010\u001e\u001a\u00020\u000b2\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u000b0\u0016J\u0016\u0010\u001e\u001a\u00020\u000b2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u000e\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u0007R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006!"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "", "", "set", "Landroidx/collection/MutableOrderedScatterSet;", "(Landroidx/collection/MutableOrderedScatterSet;)V", "size", "", "getSize", "()I", "add", "", "slotId", "add$ui_release", "clear", "", "contains", "element", "containsAll", "elements", "forEach", "block", "Lkotlin/Function1;", "isEmpty", "iterator", "", "remove", "removeAll", "predicate", "slotIds", "retainAll", "trimToSize", "maxSlotsToRetainForReuse", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SlotIdsSet implements Collection<Object>, KMappedMarker {
        public static final int $stable = 0;
        private final MutableOrderedScatterSet<Object> set;

        static {
            $stable = 8;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SlotIdsSet() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends Object> r3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate<? super Object> r3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] r2) {
            return (T[]) CollectionToArray.toArray(this, r2);
        }

        public SlotIdsSet(MutableOrderedScatterSet<Object> r1) {
            this.set = r1;
        }

        @Override // java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object element) {
            return add$ui_release(element);
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        public /* synthetic */ SlotIdsSet(MutableOrderedScatterSet r1, int r2, DefaultConstructorMarker r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = OrderedScatterSetKt.mutableOrderedScatterSetOf();
        L5:
            this(r1);
        }

        public int getSize() {
            return this.set.getSize();
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.set.isEmpty();
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<? extends Object> r8) {
            Collection<? extends Object> $this$forEach$iv = r8;
            Iterator r2 = $this$forEach$iv.iterator();
        L4:
            if (r2.hasNext() == false) goto L10;
            Object element$iv = r2.next();
            if (this.set.contains(element$iv) == true) goto L4;
            return false;
        L10:
            return true;
        }

        @Override // java.util.Collection
        public boolean contains(Object element) {
            return this.set.contains(element);
        }

        public final boolean add$ui_release(Object slotId) {
            return this.set.add(slotId);
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return this.set.asMutableSet().iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object slotId) {
            return this.set.remove(slotId);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<? extends Object> r2) {
            return this.set.remove(r2);
        }

        public final boolean removeAll(Function1<Object, Boolean> r21) {
            int size = this.set.getSize();
            MutableOrderedScatterSet<Object> r2 = this.set;
            int $i$f$removeIf = 0;
            Object[] elements$iv = r2.elements;
            MutableOrderedScatterSet<Object> this_$iv$iv = r2;
            long[] m$iv$iv = this_$iv$iv.metadata;
            int lastIndex$iv$iv = m$iv$iv.length - 2;
            int i$iv$iv = 0;
            if (0 > lastIndex$iv$iv) goto L29;
        L4:
            long slot$iv$iv = m$iv$iv[i$iv$iv];
            if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L23;
            int r11 = 8;
            int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
            int j$iv$iv = 0;
        L7:
            if (j$iv$iv >= bitCount$iv$iv) goto L20;
            long value$iv$iv$iv = 255 & slot$iv$iv;
            if (value$iv$iv$iv >= 128) goto L11;
            boolean r15 = true;
        L12:
            if (r15 == false) goto L18;
            int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
            int r18 = r11;
            int $i$f$removeIf2 = $i$f$removeIf;
            if (r21.invoke(elements$iv[index$iv$iv]).booleanValue() == false) goto L19;
            r2.removeElementAt(index$iv$iv);
        L19:
            slot$iv$iv = slot$iv$iv >> r18;
            j$iv$iv = j$iv$iv + 1;
            r11 = r18;
            $i$f$removeIf = $i$f$removeIf2;
            goto L7
        L18:
            $i$f$removeIf2 = $i$f$removeIf;
            r18 = r11;
            goto L19
        L11:
            r15 = false;
            goto L12
        L20:
            int $i$f$removeIf3 = $i$f$removeIf;
            if (bitCount$iv$iv != r11) goto L29;
        L24:
            if (i$iv$iv == lastIndex$iv$iv) goto L29;
            i$iv$iv = i$iv$iv + 1;
            $i$f$removeIf = $i$f$removeIf3;
            goto L4
        L23:
            $i$f$removeIf3 = $i$f$removeIf;
        L29:
            if (size == this.set.getSize()) goto L31;
            return true;
        L31:
            return false;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<? extends Object> r2) {
            return this.set.retainAll(r2);
        }

        public final boolean retainAll(Function1<Object, Boolean> r21) {
            MutableOrderedScatterSet<Object> r1 = this.set;
            Object[] elements$iv = r1.elements;
            int startSize$iv = r1.getSize();
            MutableOrderedScatterSet<Object> this_$iv$iv = r1;
            long[] m$iv$iv = this_$iv$iv.metadata;
            int lastIndex$iv$iv = m$iv$iv.length - 2;
            int i$iv$iv = 0;
            if (0 > lastIndex$iv$iv) goto L29;
        L4:
            long slot$iv$iv = m$iv$iv[i$iv$iv];
            if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L24;
            int r11 = 8;
            int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
            int j$iv$iv = 0;
        L7:
            if (j$iv$iv >= bitCount$iv$iv) goto L21;
            long value$iv$iv$iv = 255 & slot$iv$iv;
            if (value$iv$iv$iv >= 128) goto L11;
            boolean r15 = true;
        L12:
            if (r15 == false) goto L18;
            int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
            int r18 = r11;
            if (r21.invoke(elements$iv[index$iv$iv]).booleanValue() == true) goto L19;
            r1.removeElementAt(index$iv$iv);
        L19:
            slot$iv$iv = slot$iv$iv >> r18;
            j$iv$iv = j$iv$iv + 1;
            r11 = r18;
            goto L7
        L18:
            r18 = r11;
            goto L19
        L11:
            r15 = false;
            goto L12
        L21:
            if (bitCount$iv$iv != r11) goto L29;
        L24:
            if (i$iv$iv == lastIndex$iv$iv) goto L29;
            i$iv$iv = i$iv$iv + 1;
        L29:
            if (startSize$iv == r1.getSize()) goto L31;
            return true;
        L31:
            return false;
        }

        @Override // java.util.Collection
        public final void clear() {
            this.set.clear();
        }

        public final void trimToSize(int maxSlotsToRetainForReuse) {
            this.set.trimToSize(maxSlotsToRetainForReuse);
        }

        public final void forEach(Function1<Object, Unit> r13) {
            OrderedScatterSet this_$iv = this.set;
            Object[] elements$iv = this_$iv.elements;
            long[] nodes$iv = this_$iv.nodes;
            int candidate$iv = this_$iv.tail;
        L4:
            if (candidate$iv == Integer.MAX_VALUE) goto L7;
            long $this$previousNode$iv$iv = nodes$iv[candidate$iv];
            int previousNode$iv = (int) (($this$previousNode$iv$iv >> 31) & SieveCacheKt.NodeLinkMask);
            r13.invoke(elements$iv[candidate$iv]);
            candidate$iv = previousNode$iv;
            goto L4
        }
    }

    boolean areCompatible(Object r1, Object r2);

    void getSlotsToRetain(SlotIdsSet r1);
}
