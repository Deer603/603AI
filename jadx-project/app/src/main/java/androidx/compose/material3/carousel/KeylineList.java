package androidx.compose.material3.carousel;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: KeylineList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u0005\b\u0000\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001=B\u0015\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\u0010\u0004J\u0011\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0002H\u0096\u0003J\u0017\u0010!\u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020#H\u0096\u0001J\u0013\u0010$\u001a\u00020\u001f2\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\u000e\u0010'\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020(J\u0011\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\tH\u0096\u0003J\u000e\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020(J\u000e\u0010-\u001a\u00020\u00022\u0006\u0010,\u001a\u00020(J\b\u0010.\u001a\u00020\tH\u0016J\u0011\u0010/\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0002H\u0096\u0001J\t\u00100\u001a\u00020\u001fH\u0096\u0001J\u0006\u00101\u001a\u00020\u001fJ\u000e\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u00020(J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000205H\u0096\u0003J\u000e\u00106\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020(J\u0011\u00107\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0002H\u0096\u0001J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000209H\u0096\u0001J\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\u0002092\u0006\u0010*\u001a\u00020\tH\u0096\u0001J\u001f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020\tH\u0096\u0001R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0011\u0010\u0014\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000bR\u0011\u0010\u0018\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0007R\u0011\u0010\u001a\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000bR\u0012\u0010\u001c\u001a\u00020\tX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000b¨\u0006>"}, d2 = {"Landroidx/compose/material3/carousel/KeylineList;", "", "Landroidx/compose/material3/carousel/Keyline;", "keylines", "(Ljava/util/List;)V", "firstFocal", "getFirstFocal", "()Landroidx/compose/material3/carousel/Keyline;", "firstFocalIndex", "", "getFirstFocalIndex", "()I", "firstNonAnchor", "getFirstNonAnchor", "firstNonAnchorIndex", "getFirstNonAnchorIndex", "lastFocal", "getLastFocal", "lastFocalIndex", "getLastFocalIndex", "lastNonAnchor", "getLastNonAnchor", "lastNonAnchorIndex", "getLastNonAnchorIndex", "pivot", "getPivot", "pivotIndex", "getPivotIndex", "size", "getSize", "contains", "", "element", "containsAll", "elements", "", "equals", "other", "", "firstIndexAfterFocalRangeWithSize", "", "get", "index", "getKeylineAfter", "unadjustedOffset", "getKeylineBefore", "hashCode", "indexOf", "isEmpty", "isFirstFocalItemAtStartOfContainer", "isLastFocalItemAtEndOfContainer", "carouselMainAxisSize", "iterator", "", "lastIndexBeforeFocalRangeWithSize", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KeylineList implements List<Keyline>, KMappedMarker {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final KeylineList Empty = null;
    private final /* synthetic */ List<Keyline> $$delegate_0;
    private final int firstFocalIndex;
    private final int firstNonAnchorIndex;
    private final int lastFocalIndex;
    private final int lastNonAnchorIndex;
    private final int pivotIndex;

    /* JADX INFO: compiled from: KeylineList.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material3/carousel/KeylineList$Companion;", "", "()V", "Empty", "Landroidx/compose/material3/carousel/KeylineList;", "getEmpty", "()Landroidx/compose/material3/carousel/KeylineList;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final KeylineList getEmpty() {
            return KeylineList.access$getEmpty$cp();
        }
    }

    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int r3, Keyline r4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int r3, Keyline r4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(Keyline r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int r3, Collection<? extends Keyline> r4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Keyline> r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Keyline r2) {
        return this.$$delegate_0.contains(r2);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> r2) {
        return this.$$delegate_0.containsAll(r2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Keyline get(int r2) {
        return this.$$delegate_0.get(r2);
    }

    public int getSize() {
        return this.$$delegate_0.size();
    }

    public int indexOf(Keyline r2) {
        return this.$$delegate_0.indexOf(r2);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.$$delegate_0.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<Keyline> iterator() {
        return this.$$delegate_0.iterator();
    }

    public int lastIndexOf(Keyline r2) {
        return this.$$delegate_0.lastIndexOf(r2);
    }

    @Override // java.util.List
    public ListIterator<Keyline> listIterator() {
        return this.$$delegate_0.listIterator();
    }

    @Override // java.util.List
    public ListIterator<Keyline> listIterator(int r2) {
        return this.$$delegate_0.listIterator(r2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Keyline remove(int r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Keyline remove(int r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<Keyline> r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
    public Keyline set2(int r3, Keyline r4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Keyline set(int r3, Keyline r4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void sort(Comparator<? super Keyline> r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<Keyline> subList(int r2, int r3) {
        return this.$$delegate_0.subList(r2, r3);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] r2) {
        return (T[]) CollectionToArray.toArray(this, r2);
    }

    public KeylineList(List<Keyline> r10) {
        this.$$delegate_0 = r10;
        KeylineList $this$indexOfFirst$iv = this;
        int index$iv = 0;
        Iterator<Keyline> r3 = $this$indexOfFirst$iv.iterator();
    L3:
        int r5 = -1;
        if (r3.hasNext() == false) goto L9;
        Object item$iv = r3.next();
        Keyline it = (Keyline) item$iv;
        if (it.isPivot() == true) goto L10;
        index$iv = index$iv + 1;
    L10:
        this.pivotIndex = index$iv;
        KeylineList $this$indexOfFirst$iv2 = this;
        int index$iv2 = 0;
        Iterator<Keyline> r4 = $this$indexOfFirst$iv2.iterator();
    L12:
        if (r4.hasNext() == false) goto L17;
        Object item$iv2 = r4.next();
        Keyline it2 = (Keyline) item$iv2;
        if (it2.isAnchor() == false) goto L18;
        index$iv2 = index$iv2 + 1;
    L18:
        this.firstNonAnchorIndex = index$iv2;
        KeylineList $this$indexOfLast$iv = this;
        ListIterator<Keyline> r2 = $this$indexOfLast$iv.listIterator($this$indexOfLast$iv.size());
    L20:
        if (r2.hasPrevious() == false) goto L24;
        Keyline it3 = r2.previous();
        if (it3.isAnchor() == true) goto L20;
        int r6 = r2.nextIndex();
    L25:
        this.lastNonAnchorIndex = r6;
        KeylineList $this$indexOfFirst$iv3 = this;
        int index$iv3 = 0;
        Iterator<Keyline> r7 = $this$indexOfFirst$iv3.iterator();
    L27:
        if (r7.hasNext() == false) goto L32;
        Object item$iv3 = r7.next();
        Keyline it4 = (Keyline) item$iv3;
        if (it4.isFocal() == true) goto L33;
        index$iv3 = index$iv3 + 1;
    L33:
        this.firstFocalIndex = index$iv3;
        KeylineList $this$indexOfLast$iv2 = this;
        ListIterator<Keyline> r8 = $this$indexOfLast$iv2.listIterator($this$indexOfLast$iv2.size());
    L35:
        if (r8.hasPrevious() == false) goto L40;
        Keyline it5 = r8.previous();
        if (it5.isFocal() == false) goto L35;
        r5 = r8.nextIndex();
    L40:
        this.lastFocalIndex = r5;
        return;
    L32:
        index$iv3 = -1;
        goto L33
    L24:
        r6 = -1;
        goto L25
    L17:
        index$iv2 = -1;
        goto L18
    L9:
        index$iv = -1;
        goto L10
    }

    public static final /* synthetic */ KeylineList access$getEmpty$cp() {
        return Empty;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object element) {
        if ((element instanceof Keyline) == true) goto L7;
        return false;
    L7:
        return contains((Keyline) element);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Keyline get(int index) {
        return get(index);
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object element) {
        if ((element instanceof Keyline) == true) goto L7;
        return -1;
    L7:
        return indexOf((Keyline) element);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object element) {
        if ((element instanceof Keyline) == true) goto L7;
        return -1;
    L7:
        return lastIndexOf((Keyline) element);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    public final int getPivotIndex() {
        return this.pivotIndex;
    }

    public final Keyline getPivot() {
        return get(this.pivotIndex);
    }

    public final int getFirstNonAnchorIndex() {
        return this.firstNonAnchorIndex;
    }

    public final Keyline getFirstNonAnchor() {
        return get(this.firstNonAnchorIndex);
    }

    public final int getLastNonAnchorIndex() {
        return this.lastNonAnchorIndex;
    }

    public final Keyline getLastNonAnchor() {
        return get(this.lastNonAnchorIndex);
    }

    public final int getFirstFocalIndex() {
        return this.firstFocalIndex;
    }

    public final Keyline getFirstFocal() {
        Keyline r0 = (Keyline) CollectionsKt.getOrNull(this, this.firstFocalIndex);
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
    }

    public final int getLastFocalIndex() {
        return this.lastFocalIndex;
    }

    public final Keyline getLastFocal() {
        Keyline r0 = (Keyline) CollectionsKt.getOrNull(this, this.lastFocalIndex);
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
    }

    public final boolean isFirstFocalItemAtStartOfContainer() {
        float firstFocalLeft = getFirstFocal().getOffset() - (getFirstFocal().getSize() / 2.0f);
        if (firstFocalLeft >= 0.0f) goto L5;
    L7:
        return false;
    L5:
        if (Intrinsics.areEqual(getFirstFocal(), getFirstNonAnchor()) == false) goto L7;
        return true;
    }

    public final boolean isLastFocalItemAtEndOfContainer(float carouselMainAxisSize) {
        float lastFocalRight = getLastFocal().getOffset() + (getLastFocal().getSize() / 2.0f);
        if (lastFocalRight <= carouselMainAxisSize) goto L5;
    L7:
        return false;
    L5:
        if (Intrinsics.areEqual(getLastFocal(), getLastNonAnchor()) == false) goto L7;
        return true;
    }

    public final int firstIndexAfterFocalRangeWithSize(float size) {
        int from = this.lastFocalIndex;
        int to = CollectionsKt.getLastIndex(this);
        Iterable $this$firstOrNull$iv = new IntRange(from, to);
        Iterator<Integer> r4 = $this$firstOrNull$iv.iterator();
    L4:
        if (r4.hasNext() == false) goto L11;
        Object element$iv = r4.next();
        int i = ((Number) element$iv).intValue();
        if (get(i).getSize() != size) goto L8;
        boolean r8 = true;
    L9:
        if (r8 == false) goto L4;
    L12:
        Integer r5 = (Integer) element$iv;
        if (r5 == null) goto L16;
        return r5.intValue();
    L16:
        return CollectionsKt.getLastIndex(this);
    L8:
        r8 = false;
        goto L9
    L11:
        element$iv = null;
        goto L12
    }

    public final int lastIndexBeforeFocalRangeWithSize(float size) {
        int from = this.firstFocalIndex - 1;
        Iterable $this$firstOrNull$iv = RangesKt.downTo(from, 0);
        Iterator<Integer> r5 = $this$firstOrNull$iv.iterator();
    L4:
        if (r5.hasNext() == false) goto L11;
        Object element$iv = r5.next();
        int i = ((Number) element$iv).intValue();
        if (get(i).getSize() != size) goto L8;
        boolean r9 = true;
    L9:
        if (r9 == false) goto L4;
    L12:
        Integer r6 = (Integer) element$iv;
        if (r6 == null) goto L16;
        return r6.intValue();
    L16:
        return 0;
    L8:
        r9 = false;
        goto L9
    L11:
        element$iv = null;
        goto L12
    }

    public final Keyline getKeylineBefore(float unadjustedOffset) {
        int r0 = size() - 1;
        if (r0 < 0) goto L9;
    L4:
        int index = r0;
        r0 = r0 - 1;
        Keyline k = get(index);
        if (k.getUnadjustedOffset() < unadjustedOffset) goto L6;
        if (r0 >= 0) goto L4;
    L6:
        return k;
    L9:
        return (Keyline) CollectionsKt.first(this);
    }

    public final Keyline getKeylineAfter(float unadjustedOffset) {
        KeylineList $this$fastFirstOrNull$iv = this;
        int index$iv$iv = 0;
        int r5 = $this$fastFirstOrNull$iv.size();
    L3:
        if (index$iv$iv >= r5) goto L11;
        Object item$iv$iv = $this$fastFirstOrNull$iv.get(index$iv$iv);
        Object it$iv = item$iv$iv;
        Keyline it = (Keyline) it$iv;
        if (it.getUnadjustedOffset() < unadjustedOffset) goto L7;
        boolean r11 = true;
    L8:
        if (r11 == true) goto L12;
        index$iv$iv = index$iv$iv + 1;
    L12:
        Keyline r7 = (Keyline) it$iv;
        if (r7 == null) goto L15;
        return r7;
    L15:
        return (Keyline) CollectionsKt.last(this);
    L7:
        r11 = false;
        goto L8
    L11:
        it$iv = null;
        goto L12
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof KeylineList) == true) goto L9;
        return false;
    L9:
        if (size() == ((KeylineList) other).size()) goto L11;
        return false;
    L11:
        KeylineList $this$fastForEachIndexed$iv = this;
        int index$iv = 0;
        int r5 = $this$fastForEachIndexed$iv.size();
    L12:
        if (index$iv >= r5) goto L18;
        Object item$iv = $this$fastForEachIndexed$iv.get(index$iv);
        Keyline keyline = (Keyline) item$iv;
        int i = index$iv;
        if (Intrinsics.areEqual(keyline, ((KeylineList) other).get(i)) == false) goto L15;
        index$iv = index$iv + 1;
        goto L12
    L15:
        return false;
    L18:
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        int result = 0;
        KeylineList $this$fastForEach$iv = this;
        int index$iv = 0;
        int r4 = $this$fastForEach$iv.size();
    L3:
        if (index$iv >= r4) goto L6;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        Keyline keyline = (Keyline) item$iv;
        result = result + (keyline.hashCode() * 31);
        index$iv = index$iv + 1;
        goto L3
    L6:
        return result;
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        Empty = new KeylineList(CollectionsKt.emptyList());
    }
}
