package androidx.compose.ui.node;

import androidx.collection.MutableLongList;
import androidx.collection.MutableObjectList;
import androidx.compose.ui.Modifier;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: HitTestResult.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u000e\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002;<B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0011\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\u0014\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016J\u0015\u0010\u0017\u001a\u00020\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0007H\u0096\u0002J\u0006\u0010\u001d\u001a\u00020\u0012J'\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\"H\u0086\bJ$\u0010#\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\"J/\u0010$\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010%\u001a\u00020&2\u0006\u0010 \u001a\u00020\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\"H\u0086\bJ7\u0010$\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010%\u001a\u00020&2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\"H\u0086\bJ\u0010\u0010(\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010)\u001a\u00020\u0012H\u0016J\u0016\u0010*\u001a\u00020\u00122\u0006\u0010%\u001a\u00020&2\u0006\u0010 \u001a\u00020\u0012J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020,H\u0096\u0002J\u0010\u0010-\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020/H\u0016J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020/2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u0010\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u0007H\u0002J\u0018\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0007H\u0002J\u0017\u00105\u001a\u00020\u000f2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000f0\"H\u0086\bJ,\u00107\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010%\u001a\u00020&2\u0006\u0010 \u001a\u00020\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\"J\u001e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"Landroidx/compose/ui/node/HitTestResult;", "", "Landroidx/compose/ui/Modifier$Node;", "()V", "distanceFromEdgeAndFlags", "Landroidx/collection/MutableLongList;", "hitDepth", "", "size", "getSize", "()I", "values", "Landroidx/collection/MutableObjectList;", "", "acceptHits", "", "clear", "contains", "", "element", "containsAll", "elements", "", "findBestHitDistance", "Landroidx/compose/ui/node/DistanceAndFlags;", "findBestHitDistance-fn2tFes", "()J", "get", "index", "hasHit", "hit", "node", "isInLayer", "childHitTest", "Lkotlin/Function0;", "hitExpandedTouchBounds", "hitInMinimumTouchTarget", "distanceFromEdge", "", "isInExpandedBounds", "indexOf", "isEmpty", "isHitInMinimumTouchTargetBetter", "iterator", "", "lastIndexOf", "listIterator", "", "removeNodeAtDepth", "depth", "removeNodesInRange", "startDepth", "endDepth", "siblingHits", "block", "speculativeHit", "subList", "fromIndex", "toIndex", "HitTestResultIterator", "SubList", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HitTestResult implements List<Modifier.Node>, KMappedMarker {
    public static final int $stable = 0;
    private MutableLongList distanceFromEdgeAndFlags;
    private int hitDepth;
    private MutableObjectList<Object> values;

    /* JADX INFO: compiled from: HitTestResult.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\t\u0010\u0011\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/node/HitTestResult$HitTestResultIterator;", "", "Landroidx/compose/ui/Modifier$Node;", "index", "", "minIndex", "maxIndex", "(Landroidx/compose/ui/node/HitTestResult;III)V", "getIndex", "()I", "setIndex", "(I)V", "getMaxIndex", "getMinIndex", "hasNext", "", "hasPrevious", "next", "nextIndex", "previous", "previousIndex", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class HitTestResultIterator implements ListIterator<Modifier.Node>, KMappedMarker {
        private int index;
        private final int maxIndex;
        private final int minIndex;
        final /* synthetic */ HitTestResult this$0;

        /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
        public void add2(Modifier.Node r3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Modifier.Node r3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
        public void set2(Modifier.Node r3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Modifier.Node r3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public HitTestResultIterator(HitTestResult this$0, int index, int minIndex, int maxIndex) {
            this.this$0 = this$0;
            this.index = index;
            this.minIndex = minIndex;
            this.maxIndex = maxIndex;
        }

        public /* synthetic */ HitTestResultIterator(HitTestResult r2, int r3, int r4, int r5, int r6, DefaultConstructorMarker r7) {
            if ((r6 & 1) == 0) goto L6;
            r3 = 0;
        L6:
            if ((r6 & 2) == 0) goto L9;
            r4 = 0;
        L9:
            if ((r6 & 4) == 0) goto L11;
            r5 = r2.size();
        L11:
            this(r2, r3, r4, r5);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return next();
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ Modifier.Node previous() {
            return previous();
        }

        public final int getIndex() {
            return this.index;
        }

        public final void setIndex(int r1) {
            this.index = r1;
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.index >= this.maxIndex) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.index <= this.minIndex) goto L5;
            return true;
        L5:
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.ListIterator, java.util.Iterator
        public Modifier.Node next() {
            MutableObjectList r0 = HitTestResult.access$getValues$p(this.this$0);
            int r1 = this.index;
            this.index = r1 + 1;
            E r2 = r0.get(r1);
            Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) r2;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index - this.minIndex;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.ListIterator
        public Modifier.Node previous() {
            MutableObjectList r0 = HitTestResult.access$getValues$p(this.this$0);
            this.index--;
            E r1 = r0.get(this.index);
            Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) r1;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.index - this.minIndex) - 1;
        }
    }

    /* JADX INFO: compiled from: HitTestResult.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0011\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\u000f\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016J\u0011\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0004H\u0096\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\rH\u0016J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0016R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/node/HitTestResult$SubList;", "", "Landroidx/compose/ui/Modifier$Node;", "minIndex", "", "maxIndex", "(Landroidx/compose/ui/node/HitTestResult;II)V", "getMaxIndex", "()I", "getMinIndex", "size", "getSize", "contains", "", "element", "containsAll", "elements", "", "get", "index", "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class SubList implements List<Modifier.Node>, KMappedMarker {
        private final int maxIndex;
        private final int minIndex;
        final /* synthetic */ HitTestResult this$0;

        /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
        public void add2(int r3, Modifier.Node r4) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int r3, Modifier.Node r4) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean add(Modifier.Node r3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object r3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int r3, Collection<? extends Modifier.Node> r4) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends Modifier.Node> r3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void addFirst(Modifier.Node r3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addFirst(Object r3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void addLast(Modifier.Node r3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addLast(Object r3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.List
        public Modifier.Node remove(int r3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Modifier.Node remove(int r3) {
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

        public Modifier.Node removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: removeFirst, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Object m5878removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Modifier.Node removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: removeLast, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Object m5879removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator<Modifier.Node> r3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> r3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
        public Modifier.Node set2(int r3, Modifier.Node r4) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Modifier.Node set(int r3, Modifier.Node r4) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void sort(Comparator<? super Modifier.Node> r3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] r2) {
            return (T[]) CollectionToArray.toArray(this, r2);
        }

        public SubList(HitTestResult this$0, int minIndex, int maxIndex) {
            this.this$0 = this$0;
            this.minIndex = minIndex;
            this.maxIndex = maxIndex;
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object element) {
            if ((element instanceof Modifier.Node) == true) goto L7;
            return false;
        L7:
            return contains((Modifier.Node) element);
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Modifier.Node get(int index) {
            return get(index);
        }

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object element) {
            if ((element instanceof Modifier.Node) == true) goto L7;
            return -1;
        L7:
            return indexOf((Modifier.Node) element);
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object element) {
            if ((element instanceof Modifier.Node) == true) goto L7;
            return -1;
        L7:
            return lastIndexOf((Modifier.Node) element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        public int getSize() {
            return this.maxIndex - this.minIndex;
        }

        public boolean contains(Modifier.Node element) {
            if (indexOf(element) == (-1)) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> r8) {
            Collection<? extends Object> $this$forEach$iv = r8;
            Iterator r2 = $this$forEach$iv.iterator();
        L4:
            if (r2.hasNext() == false) goto L10;
            Object element$iv = r2.next();
            Modifier.Node it = (Modifier.Node) element$iv;
            if (contains(it) == true) goto L4;
            return false;
        L10:
            return true;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public Modifier.Node get(int index) {
            E r0 = HitTestResult.access$getValues$p(this.this$0).get(this.minIndex + index);
            Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) r0;
        }

        public int indexOf(Modifier.Node element) {
            int i = this.minIndex;
            int r1 = this.maxIndex;
            if (i <= r1) goto L5;
            return -1;
        L5:
            if (Intrinsics.areEqual(HitTestResult.access$getValues$p(this.this$0).get(i), element) == true) goto L7;
            if (i == r1) goto L14;
            i = i + 1;
            goto L5
        L14:
            return -1;
        L7:
            return i - this.minIndex;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            if (size() != 0) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<Modifier.Node> iterator() {
            return new HitTestResultIterator(this.this$0, this.minIndex, this.minIndex, this.maxIndex);
        }

        public int lastIndexOf(Modifier.Node element) {
            int i = this.maxIndex;
            int r1 = this.minIndex;
            if (r1 <= i) goto L5;
            return -1;
        L5:
            if (Intrinsics.areEqual(HitTestResult.access$getValues$p(this.this$0).get(i), element) == true) goto L7;
            if (i == r1) goto L14;
            i = i - 1;
            goto L5
        L14:
            return -1;
        L7:
            return i - this.minIndex;
        }

        @Override // java.util.List
        public ListIterator<Modifier.Node> listIterator() {
            return new HitTestResultIterator(this.this$0, this.minIndex, this.minIndex, this.maxIndex);
        }

        @Override // java.util.List
        public ListIterator<Modifier.Node> listIterator(int index) {
            return new HitTestResultIterator(this.this$0, this.minIndex + index, this.minIndex, this.maxIndex);
        }

        @Override // java.util.List
        public List<Modifier.Node> subList(int fromIndex, int toIndex) {
            return new SubList(this.this$0, this.minIndex + fromIndex, this.minIndex + toIndex);
        }
    }

    static {
        $stable = 8;
    }

    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int r3, Modifier.Node r4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int r3, Modifier.Node r4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(Modifier.Node r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int r3, Collection<? extends Modifier.Node> r4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Modifier.Node> r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addFirst(Modifier.Node r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addLast(Modifier.Node r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Modifier.Node remove(int r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.Node remove(int r3) {
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

    public Modifier.Node removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: removeFirst, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m5876removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Modifier.Node removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: removeLast, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m5877removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<Modifier.Node> r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
    public Modifier.Node set2(int r3, Modifier.Node r4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.Node set(int r3, Modifier.Node r4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void sort(Comparator<? super Modifier.Node> r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] r2) {
        return (T[]) CollectionToArray.toArray(this, r2);
    }

    public HitTestResult() {
        this.values = new MutableObjectList(16);
        this.distanceFromEdgeAndFlags = new MutableLongList(16);
        this.hitDepth = -1;
    }

    public static final /* synthetic */ MutableLongList access$getDistanceFromEdgeAndFlags$p(HitTestResult $this) {
        return $this.distanceFromEdgeAndFlags;
    }

    public static final /* synthetic */ int access$getHitDepth$p(HitTestResult $this) {
        return $this.hitDepth;
    }

    public static final /* synthetic */ MutableObjectList access$getValues$p(HitTestResult $this) {
        return $this.values;
    }

    public static final /* synthetic */ void access$removeNodesInRange(HitTestResult $this, int startDepth, int endDepth) {
        $this.removeNodesInRange(startDepth, endDepth);
    }

    public static final /* synthetic */ void access$setHitDepth$p(HitTestResult $this, int r1) {
        $this.hitDepth = r1;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object element) {
        if ((element instanceof Modifier.Node) == true) goto L7;
        return false;
    L7:
        return contains((Modifier.Node) element);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.Node get(int index) {
        return get(index);
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object element) {
        if ((element instanceof Modifier.Node) == true) goto L7;
        return -1;
    L7:
        return indexOf((Modifier.Node) element);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object element) {
        if ((element instanceof Modifier.Node) == true) goto L7;
        return -1;
    L7:
        return lastIndexOf((Modifier.Node) element);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    public int getSize() {
        return this.values.getSize();
    }

    public final boolean hasHit() {
        long distance = m5875findBestHitDistancefn2tFes();
        if (DistanceAndFlags.m5856getDistanceimpl(distance) < 0.0f) goto L5;
    L9:
        return false;
    L5:
        if (DistanceAndFlags.m5859isInLayerimpl(distance) == false) goto L9;
        if (DistanceAndFlags.m5858isInExpandedBoundsimpl(distance) == true) goto L9;
        return true;
    }

    public final void acceptHits() {
        this.hitDepth = size() - 1;
    }

    public final boolean isHitInMinimumTouchTargetBetter(float distanceFromEdge, boolean isInLayer) {
        if (this.hitDepth != CollectionsKt.getLastIndex(this)) goto L5;
        return true;
    L5:
        long distanceAndFlags = HitTestResultKt.DistanceAndFlags$default(distanceFromEdge, isInLayer, false, 4, null);
        long bestDistance = m5875findBestHitDistancefn2tFes();
        if (DistanceAndFlags.m5852compareTo9YPOF3E(bestDistance, distanceAndFlags) <= 0) goto L9;
        return true;
    L9:
        return false;
    }

    /* JADX INFO: renamed from: findBestHitDistance-fn2tFes, reason: not valid java name */
    private final long m5875findBestHitDistancefn2tFes() {
        long bestDistance = HitTestResultKt.DistanceAndFlags$default(Float.POSITIVE_INFINITY, false, false, 4, null);
        int i = this.hitDepth + 1;
        int r3 = CollectionsKt.getLastIndex(this);
        if (i > r3) goto L15;
    L4:
        long distance = DistanceAndFlags.m5853constructorimpl(this.distanceFromEdgeAndFlags.get(i));
        if (DistanceAndFlags.m5852compareTo9YPOF3E(distance, bestDistance) >= 0) goto L7;
        long r6 = distance;
    L8:
        bestDistance = r6;
        if (DistanceAndFlags.m5856getDistanceimpl(bestDistance) < 0.0f) goto L11;
    L13:
        if (i == r3) goto L15;
        i = i + 1;
        goto L4
    L11:
        if (DistanceAndFlags.m5859isInLayerimpl(bestDistance) == false) goto L13;
        return bestDistance;
    L7:
        r6 = bestDistance;
    L15:
        return bestDistance;
    }

    public final void hit(Modifier.Node node, boolean isInLayer, Function0<Unit> r14) {
        int startDepth$iv$iv = access$getHitDepth$p(this);
        access$removeNodesInRange(this, access$getHitDepth$p(this) + 1, size());
        access$setHitDepth$p(this, access$getHitDepth$p(this) + 1);
        access$getValues$p(this).add(node);
        access$getDistanceFromEdgeAndFlags$p(this).add(HitTestResultKt.access$DistanceAndFlags(-1.0f, isInLayer, false));
        r14.invoke();
        access$setHitDepth$p(this, startDepth$iv$iv);
    }

    public final void hitInMinimumTouchTarget(Modifier.Node node, float distanceFromEdge, boolean isInLayer, Function0<Unit> r12) {
        int startDepth$iv = access$getHitDepth$p(this);
        access$removeNodesInRange(this, access$getHitDepth$p(this) + 1, size());
        access$setHitDepth$p(this, access$getHitDepth$p(this) + 1);
        access$getValues$p(this).add(node);
        access$getDistanceFromEdgeAndFlags$p(this).add(HitTestResultKt.access$DistanceAndFlags(distanceFromEdge, isInLayer, false));
        r12.invoke();
        access$setHitDepth$p(this, startDepth$iv);
    }

    public final void hitInMinimumTouchTarget(Modifier.Node node, float distanceFromEdge, boolean isInLayer, boolean isInExpandedBounds, Function0<Unit> r10) {
        int startDepth = access$getHitDepth$p(this);
        access$removeNodesInRange(this, access$getHitDepth$p(this) + 1, size());
        access$setHitDepth$p(this, access$getHitDepth$p(this) + 1);
        access$getValues$p(this).add(node);
        access$getDistanceFromEdgeAndFlags$p(this).add(HitTestResultKt.access$DistanceAndFlags(distanceFromEdge, isInLayer, isInExpandedBounds));
        r10.invoke();
        access$setHitDepth$p(this, startDepth);
    }

    public final void hitExpandedTouchBounds(Modifier.Node node, boolean isInLayer, Function0<Unit> r15) {
        if (this.hitDepth != CollectionsKt.getLastIndex(this)) goto L6;
        int startDepth$iv = access$getHitDepth$p(this);
        access$removeNodesInRange(this, access$getHitDepth$p(this) + 1, size());
        access$setHitDepth$p(this, access$getHitDepth$p(this) + 1);
        access$getValues$p(this).add(node);
        access$getDistanceFromEdgeAndFlags$p(this).add(HitTestResultKt.access$DistanceAndFlags(0.0f, isInLayer, true));
        r15.invoke();
        access$setHitDepth$p(this, startDepth$iv);
        return;
    L6:
        long previousDistance = m5875findBestHitDistancefn2tFes();
        int previousHitDepth = this.hitDepth;
        if (DistanceAndFlags.m5858isInExpandedBoundsimpl(previousDistance) == false) goto L13;
        this.hitDepth = CollectionsKt.getLastIndex(this);
        int startDepth$iv2 = access$getHitDepth$p(this);
        access$removeNodesInRange(this, access$getHitDepth$p(this) + 1, size());
        access$setHitDepth$p(this, access$getHitDepth$p(this) + 1);
        access$getValues$p(this).add(node);
        access$getDistanceFromEdgeAndFlags$p(this).add(HitTestResultKt.access$DistanceAndFlags(0.0f, isInLayer, true));
        r15.invoke();
        access$setHitDepth$p(this, startDepth$iv2);
        long newDistance = m5875findBestHitDistancefn2tFes();
        if (DistanceAndFlags.m5856getDistanceimpl(newDistance) >= 0.0f) goto L11;
        int startIndex = previousHitDepth + 1;
        int endIndex = this.hitDepth + 1;
        removeNodesInRange(startIndex, endIndex);
    L11:
        this.hitDepth = previousHitDepth;
        return;
    L13:
        if (DistanceAndFlags.m5856getDistanceimpl(previousDistance) <= 0.0f) goto L17;
        int startDepth$iv3 = access$getHitDepth$p(this);
        access$removeNodesInRange(this, access$getHitDepth$p(this) + 1, size());
        access$setHitDepth$p(this, access$getHitDepth$p(this) + 1);
        access$getValues$p(this).add(node);
        access$getDistanceFromEdgeAndFlags$p(this).add(HitTestResultKt.access$DistanceAndFlags(0.0f, isInLayer, true));
        r15.invoke();
        access$setHitDepth$p(this, startDepth$iv3);
        return;
    }

    public final void speculativeHit(Modifier.Node node, float distanceFromEdge, boolean isInLayer, Function0<Unit> r20) {
        if (this.hitDepth != CollectionsKt.getLastIndex(this)) goto L10;
        int startDepth$iv$iv = access$getHitDepth$p(this);
        access$removeNodesInRange(this, access$getHitDepth$p(this) + 1, size());
        access$setHitDepth$p(this, access$getHitDepth$p(this) + 1);
        access$getValues$p(this).add(node);
        access$getDistanceFromEdgeAndFlags$p(this).add(HitTestResultKt.access$DistanceAndFlags(distanceFromEdge, isInLayer, false));
        r20.invoke();
        access$setHitDepth$p(this, startDepth$iv$iv);
        if ((this.hitDepth + 1) != CollectionsKt.getLastIndex(this)) goto L7;
    L8:
        removeNodeAtDepth(this.hitDepth + 1);
        return;
    L7:
        if (DistanceAndFlags.m5858isInExpandedBoundsimpl(m5875findBestHitDistancefn2tFes()) == true) goto L8;
        return;
    L10:
        long previousDistance = m5875findBestHitDistancefn2tFes();
        int previousHitDepth = this.hitDepth;
        this.hitDepth = CollectionsKt.getLastIndex(this);
        int startDepth$iv$iv2 = access$getHitDepth$p(this);
        access$removeNodesInRange(this, access$getHitDepth$p(this) + 1, size());
        access$setHitDepth$p(this, access$getHitDepth$p(this) + 1);
        access$getValues$p(this).add(node);
        access$getDistanceFromEdgeAndFlags$p(this).add(HitTestResultKt.access$DistanceAndFlags(distanceFromEdge, isInLayer, false));
        r20.invoke();
        access$setHitDepth$p(this, startDepth$iv$iv2);
        long newBestDistance = m5875findBestHitDistancefn2tFes();
        if ((this.hitDepth + 1) < CollectionsKt.getLastIndex(this)) goto L13;
    L19:
        removeNodesInRange(this.hitDepth + 1, size());
    L20:
        this.hitDepth = previousHitDepth;
        return;
    L13:
        if (DistanceAndFlags.m5852compareTo9YPOF3E(previousDistance, newBestDistance) <= 0) goto L19;
        int startIndex = previousHitDepth + 1;
        boolean r10 = DistanceAndFlags.m5858isInExpandedBoundsimpl(newBestDistance);
        int r11 = this.hitDepth;
        if (r10 == false) goto L17;
        int endIndex = r11 + 2;
    L18:
        removeNodesInRange(startIndex, endIndex);
        goto L20
    L17:
        endIndex = r11 + 1;
        goto L18
    }

    private final void removeNodeAtDepth(int depth) {
        this.values.removeAt(depth);
        this.distanceFromEdgeAndFlags.removeAt(depth);
    }

    private final void removeNodesInRange(int startDepth, int endDepth) {
        if (startDepth < endDepth) goto L4;
        return;
    L4:
        this.values.removeRange(startDepth, endDepth);
        this.distanceFromEdgeAndFlags.removeRange(startDepth, endDepth);
    }

    public final void siblingHits(Function0<Unit> r3) {
        int depth = access$getHitDepth$p(this);
        r3.invoke();
        access$setHitDepth$p(this, depth);
    }

    public boolean contains(Modifier.Node element) {
        if (indexOf(element) == (-1)) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> r8) {
        Collection<? extends Object> $this$forEach$iv = r8;
        Iterator r2 = $this$forEach$iv.iterator();
    L4:
        if (r2.hasNext() == false) goto L10;
        Object element$iv = r2.next();
        Modifier.Node it = (Modifier.Node) element$iv;
        if (contains(it) == true) goto L4;
        return false;
    L10:
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Modifier.Node get(int index) {
        Object r0 = this.values.get(index);
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (Modifier.Node) r0;
    }

    public int indexOf(Modifier.Node element) {
        int i = 0;
        int r1 = CollectionsKt.getLastIndex(this);
        if (0 <= r1) goto L5;
        return -1;
    L5:
        if (Intrinsics.areEqual(this.values.get(i), element) == true) goto L6;
        if (i == r1) goto L13;
        i = i + 1;
        goto L5
    L13:
        return -1;
    L6:
        return i;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<Modifier.Node> iterator() {
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        return new HitTestResultIterator(this, r2, r3, r4, 7, null);
    }

    public int lastIndexOf(Modifier.Node element) {
        int i = CollectionsKt.getLastIndex(this);
    L4:
        if ((-1) >= i) goto L9;
        if (Intrinsics.areEqual(this.values.get(i), element) == true) goto L7;
        i = i - 1;
        goto L4
    L7:
        return i;
    L9:
        return -1;
    }

    @Override // java.util.List
    public ListIterator<Modifier.Node> listIterator() {
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        return new HitTestResultIterator(this, r2, r3, r4, 7, null);
    }

    @Override // java.util.List
    public ListIterator<Modifier.Node> listIterator(int index) {
        int r3 = 0;
        int r4 = 0;
        return new HitTestResultIterator(this, index, r3, r4, 6, null);
    }

    @Override // java.util.List
    public List<Modifier.Node> subList(int fromIndex, int toIndex) {
        return new SubList(this, fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.hitDepth = -1;
        this.values.clear();
        this.distanceFromEdgeAndFlags.clear();
    }
}
