package kotlin.collections;

import androidx.autofill.HintConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: ArrayDeque.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \\*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\\B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007B\u0017\b\u0016\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0005\u0010\nJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0016\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0004H\u0083\b¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\u0011\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0083\bJ\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\b\u0010!\u001a\u00020\"H\u0016J\u000b\u0010#\u001a\u00028\u0000¢\u0006\u0002\u0010$J\r\u0010%\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010$J\u000b\u0010&\u001a\u00028\u0000¢\u0006\u0002\u0010$J\r\u0010'\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010$J\u0013\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00028\u0000¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\u00152\u0006\u0010)\u001a\u00028\u0000¢\u0006\u0002\u0010*J\u000b\u0010,\u001a\u00028\u0000¢\u0006\u0002\u0010$J\r\u0010-\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010$J\u000b\u0010.\u001a\u00028\u0000¢\u0006\u0002\u0010$J\r\u0010/\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010$J\u0015\u00100\u001a\u00020\"2\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\u001d\u00100\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00102J\u001e\u00103\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002J\u0016\u00104\u001a\u00020\"2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u001e\u00104\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u0016\u00105\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0002\u0010\u001bJ\u001e\u00106\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010)\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u00107J\u0016\u00108\u001a\u00020\"2\u0006\u0010)\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u00101J\u0015\u00109\u001a\u00020\u00042\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010:J\u0015\u0010;\u001a\u00020\u00042\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010:J\u0015\u0010<\u001a\u00020\"2\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\u0015\u0010=\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010\u001bJ\u0016\u0010>\u001a\u00020\"2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u0016\u0010?\u001a\u00020\"2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u001d\u0010@\u001a\u00020\"2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\"0BH\u0082\bJ\b\u0010C\u001a\u00020\u0015H\u0016J'\u0010D\u001a\b\u0012\u0004\u0012\u0002HE0\r\"\u0004\b\u0001\u0010E2\f\u0010F\u001a\b\u0012\u0004\u0012\u0002HE0\rH\u0016¢\u0006\u0002\u0010GJ\u0015\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0016¢\u0006\u0002\u0010HJ\u0018\u0010I\u001a\u00020\u00152\u0006\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u0004H\u0014J\u0018\u0010L\u001a\u00020\u00152\u0006\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u0004H\u0002J\u0018\u0010M\u001a\u00020\u00152\u0006\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u0004H\u0002J\u0018\u0010N\u001a\u00020\u00152\u0006\u0010O\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u0004H\u0002J\b\u0010Q\u001a\u00020\u0015H\u0002J)\u0010R\u001a\b\u0012\u0004\u0012\u0002HE0\r\"\u0004\b\u0001\u0010E2\f\u0010F\u001a\b\u0012\u0004\u0012\u0002HE0\rH\u0000¢\u0006\u0004\bS\u0010GJ\u0017\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0000¢\u0006\u0004\bS\u0010HJ\u001d\u0010T\u001a\u00020\u00152\u0006\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u0004H\u0000¢\u0006\u0002\bUJM\u0010V\u001a\u00020\u00152>\u0010W\u001a:\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b(\u000b\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00150XH\u0000¢\u0006\u0002\b[R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u001e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006]"}, d2 = {"Lkotlin/collections/ArrayDeque;", "E", "Lkotlin/collections/AbstractMutableList;", "initialCapacity", "", "<init>", "(I)V", "()V", "elements", "", "(Ljava/util/Collection;)V", "head", "elementData", "", "", "[Ljava/lang/Object;", "value", "size", "getSize", "()I", "ensureCapacity", "", "minCapacity", "copyElements", "newCapacity", "internalGet", "internalIndex", "(I)Ljava/lang/Object;", "positiveMod", "index", "negativeMod", "incremented", "decremented", "isEmpty", "", "first", "()Ljava/lang/Object;", "firstOrNull", "last", "lastOrNull", "addFirst", "element", "(Ljava/lang/Object;)V", "addLast", "removeFirst", "removeFirstOrNull", "removeLast", "removeLastOrNull", "add", "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "copyCollectionElements", "addAll", "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "contains", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "remove", "removeAt", "removeAll", "retainAll", "filterInPlace", "predicate", "Lkotlin/Function1;", "clear", "toArray", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "removeRange", "fromIndex", "toIndex", "removeRangeShiftPreceding", "removeRangeShiftSucceeding", "nullifyNonEmpty", "internalFromIndex", "internalToIndex", "registerModification", "testToArray", "testToArray$kotlin_stdlib", "testRemoveRange", "testRemoveRange$kotlin_stdlib", "internalStructure", "structure", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "internalStructure$kotlin_stdlib", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ArrayDeque<E> extends AbstractMutableList<E> {
    public static final Companion Companion = null;
    private static final int defaultMinCapacity = 10;
    private static final Object[] emptyElementData = null;
    private Object[] elementData;
    private int head;
    private int size;

    /* JADX INFO: compiled from: ArrayDeque.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlin/collections/ArrayDeque$Companion;", "", "<init>", "()V", "emptyElementData", "", "[Ljava/lang/Object;", "defaultMinCapacity", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.size;
    }

    public ArrayDeque(int initialCapacity) {
        if (initialCapacity != 0) goto L5;
        Object[] r0 = emptyElementData;
    L7:
        this.elementData = r0;
        return;
    L5:
        if (initialCapacity <= 0) goto L10;
        r0 = new Object[initialCapacity];
        goto L7
    L10:
        throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
    }

    public ArrayDeque() {
        this.elementData = emptyElementData;
    }

    public ArrayDeque(Collection<? extends E> r6) {
        Intrinsics.checkNotNullParameter(r6, "elements");
        boolean r3 = false;
        this.elementData = r6.toArray(new Object[0]);
        this.size = this.elementData.length;
        if (this.elementData.length != 0) goto L5;
        r3 = true;
    L5:
        if (r3 == false) goto L8;
        this.elementData = emptyElementData;
        return;
    }

    private final void ensureCapacity(int minCapacity) {
        if (minCapacity < 0) goto L13;
        if (minCapacity > this.elementData.length) goto L7;
        return;
    L7:
        if (this.elementData != emptyElementData) goto L10;
        this.elementData = new Object[RangesKt.coerceAtLeast(minCapacity, 10)];
        return;
    L10:
        int newCapacity = AbstractList.Companion.newCapacity$kotlin_stdlib(this.elementData.length, minCapacity);
        copyElements(newCapacity);
        return;
    L13:
        throw new IllegalStateException("Deque is too big.");
    }

    private final void copyElements(int newCapacity) {
        Object[] newElements = new Object[newCapacity];
        ArraysKt.copyInto(this.elementData, newElements, 0, this.head, this.elementData.length);
        ArraysKt.copyInto(this.elementData, newElements, this.elementData.length - this.head, 0, this.head);
        this.head = 0;
        this.elementData = newElements;
    }

    private final E internalGet(int r2) {
        return (E) this.elementData[r2];
    }

    private final int positiveMod(int index) {
        if (index < this.elementData.length) goto L6;
        return index - this.elementData.length;
    L6:
        return index;
    }

    private final int negativeMod(int index) {
        if (index >= 0) goto L5;
        return this.elementData.length + index;
    L5:
        return index;
    }

    private final int internalIndex(int index) {
        return positiveMod(this.head + index);
    }

    private final int incremented(int index) {
        if (index != ArraysKt.getLastIndex(this.elementData)) goto L6;
        return 0;
    L6:
        return index + 1;
    }

    private final int decremented(int index) {
        if (index != 0) goto L5;
        return ArraysKt.getLastIndex(this.elementData);
    L5:
        return index - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        if (size() != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final E first() {
        if (isEmpty() == true) goto L7;
        return (E) this.elementData[this.head];
    L7:
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E firstOrNull() {
        if (isEmpty() == false) goto L6;
        return null;
    L6:
        return (E) this.elementData[this.head];
    }

    public final E last() {
        if (isEmpty() == true) goto L7;
        return (E) this.elementData[positiveMod(this.head + CollectionsKt.getLastIndex(this))];
    L7:
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E lastOrNull() {
        if (isEmpty() == false) goto L6;
        return null;
    L6:
        return (E) this.elementData[positiveMod(this.head + CollectionsKt.getLastIndex(this))];
    }

    public final void addFirst(E r3) {
        registerModification();
        ensureCapacity(size() + 1);
        this.head = decremented(this.head);
        this.elementData[this.head] = r3;
        this.size = size() + 1;
    }

    public final void addLast(E r4) {
        registerModification();
        ensureCapacity(size() + 1);
        this.elementData[positiveMod(this.head + size())] = r4;
        this.size = size() + 1;
    }

    public final E removeFirst() {
        if (isEmpty() == true) goto L7;
        registerModification();
        E r0 = (E) this.elementData[this.head];
        this.elementData[this.head] = null;
        this.head = incremented(this.head);
        this.size = size() - 1;
        return r0;
    L7:
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeFirstOrNull() {
        if (isEmpty() == false) goto L6;
        return null;
    L6:
        return removeFirst();
    }

    public final E removeLast() {
        if (isEmpty() == true) goto L7;
        registerModification();
        int r0 = positiveMod(this.head + CollectionsKt.getLastIndex(this));
        E r1 = (E) this.elementData[r0];
        this.elementData[r0] = null;
        this.size = size() - 1;
        return r1;
    L7:
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeLastOrNull() {
        if (isEmpty() == false) goto L6;
        return null;
    L6:
        return removeLast();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E r2) {
        addLast(r2);
        return true;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int index, E r12) {
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, size());
        if (index != size()) goto L6;
        addLast(r12);
        return;
    L6:
        if (index != 0) goto L9;
        addFirst(r12);
        return;
    L9:
        registerModification();
        ensureCapacity(size() + 1);
        int internalIndex = positiveMod(this.head + index);
        if (index >= ((size() + 1) >> 1)) goto L16;
        int decrementedInternalIndex = decremented(internalIndex);
        int decrementedHead = decremented(this.head);
        int r5 = this.head;
        Object[] r6 = this.elementData;
        if (decrementedInternalIndex < r5) goto L14;
        r6[decrementedHead] = this.elementData[this.head];
        ArraysKt.copyInto(this.elementData, this.elementData, this.head, this.head + 1, decrementedInternalIndex + 1);
    L15:
        this.elementData[decrementedInternalIndex] = r12;
        this.head = decrementedHead;
    L21:
        this.size = size() + 1;
        return;
    L14:
        ArraysKt.copyInto(r6, this.elementData, this.head - 1, this.head, this.elementData.length);
        this.elementData[this.elementData.length - 1] = this.elementData[0];
        ArraysKt.copyInto(this.elementData, this.elementData, 0, 1, decrementedInternalIndex + 1);
        goto L15
    L16:
        int tail = positiveMod(this.head + size());
        Object[] r4 = this.elementData;
        if (internalIndex >= tail) goto L19;
        ArraysKt.copyInto(r4, this.elementData, internalIndex + 1, internalIndex, tail);
    L20:
        this.elementData[internalIndex] = r12;
        goto L21
    L19:
        ArraysKt.copyInto(r4, this.elementData, 1, 0, tail);
        this.elementData[0] = this.elementData[this.elementData.length - 1];
        ArraysKt.copyInto(this.elementData, this.elementData, internalIndex + 1, internalIndex, this.elementData.length - 1);
        goto L20
    }

    private final void copyCollectionElements(int internalIndex, Collection<? extends E> r7) {
        Iterator<? extends E> r0 = r7.iterator();
        int index = internalIndex;
        int r2 = this.elementData.length;
    L3:
        if (index >= r2) goto L7;
        if (r0.hasNext() == false) goto L7;
        this.elementData[index] = r0.next();
        index = index + 1;
    L7:
        int index2 = 0;
        int r3 = this.head;
    L8:
        if (index2 >= r3) goto L12;
        if (r0.hasNext() == false) goto L12;
        this.elementData[index2] = r0.next();
        index2 = index2 + 1;
    L12:
        int index3 = size();
        this.size = index3 + r7.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        if (r3.isEmpty() == false) goto L6;
        return false;
    L6:
        registerModification();
        ensureCapacity(size() + r3.size());
        copyCollectionElements(positiveMod(this.head + size()), r3);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> r14) {
        Intrinsics.checkNotNullParameter(r14, "elements");
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, size());
        if (r14.isEmpty() == false) goto L6;
        return false;
    L6:
        if (index == size()) goto L8;
        registerModification();
        ensureCapacity(size() + r14.size());
        int tail = positiveMod(this.head + size());
        int internalIndex = positiveMod(this.head + index);
        int elementsSize = r14.size();
        if (index >= ((size() + 1) >> 1)) goto L25;
        int shiftedHead = this.head - elementsSize;
        if (internalIndex < this.head) goto L20;
        Object[] r6 = this.elementData;
        if (shiftedHead < 0) goto L16;
        ArraysKt.copyInto(r6, this.elementData, shiftedHead, this.head, internalIndex);
    L24:
        this.head = shiftedHead;
        copyCollectionElements(negativeMod(internalIndex - elementsSize), r14);
    L39:
        return true;
    L16:
        shiftedHead = shiftedHead + r6.length;
        int elementsToShift = internalIndex - this.head;
        int shiftToBack = this.elementData.length - shiftedHead;
        Object[] r8 = this.elementData;
        if (shiftToBack < elementsToShift) goto L19;
        ArraysKt.copyInto(r8, this.elementData, shiftedHead, this.head, internalIndex);
        goto L24
    L19:
        ArraysKt.copyInto(r8, this.elementData, shiftedHead, this.head, this.head + shiftToBack);
        ArraysKt.copyInto(this.elementData, this.elementData, 0, this.head + shiftToBack, internalIndex);
        goto L24
    L20:
        ArraysKt.copyInto(this.elementData, this.elementData, shiftedHead, this.head, this.elementData.length);
        Object[] r7 = this.elementData;
        if (elementsSize < internalIndex) goto L23;
        ArraysKt.copyInto(r7, this.elementData, this.elementData.length - elementsSize, 0, internalIndex);
        goto L24
    L23:
        ArraysKt.copyInto(r7, this.elementData, this.elementData.length - elementsSize, 0, elementsSize);
        ArraysKt.copyInto(this.elementData, this.elementData, 0, elementsSize, internalIndex);
        goto L24
    L25:
        int shiftedInternalIndex = internalIndex + elementsSize;
        Object[] r9 = this.elementData;
        if (internalIndex >= tail) goto L34;
        int r10 = tail + elementsSize;
        int r11 = r9.length;
        Object[] r12 = this.elementData;
        if (r10 > r11) goto L30;
        ArraysKt.copyInto(r12, this.elementData, shiftedInternalIndex, internalIndex, tail);
    L38:
        copyCollectionElements(internalIndex, r14);
        goto L39
    L30:
        int r13 = r12.length;
        Object[] r15 = this.elementData;
        if (shiftedInternalIndex < r13) goto L33;
        ArraysKt.copyInto(r15, this.elementData, shiftedInternalIndex - this.elementData.length, internalIndex, tail);
        goto L38
    L33:
        int shiftToFront = (tail + elementsSize) - r15.length;
        ArraysKt.copyInto(this.elementData, this.elementData, 0, tail - shiftToFront, tail);
        ArraysKt.copyInto(this.elementData, this.elementData, shiftedInternalIndex, internalIndex, tail - shiftToFront);
        goto L38
    L34:
        ArraysKt.copyInto(r9, this.elementData, elementsSize, 0, tail);
        int r16 = this.elementData.length;
        Object[] r17 = this.elementData;
        if (shiftedInternalIndex < r16) goto L37;
        ArraysKt.copyInto(r17, this.elementData, shiftedInternalIndex - this.elementData.length, internalIndex, this.elementData.length);
        goto L38
    L37:
        ArraysKt.copyInto(r17, this.elementData, 0, this.elementData.length - elementsSize, this.elementData.length);
        ArraysKt.copyInto(this.elementData, this.elementData, shiftedInternalIndex, internalIndex, this.elementData.length - elementsSize);
        goto L38
    L8:
        return addAll(r14);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int r3) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(r3, size());
        return (E) this.elementData[positiveMod(this.head + r3)];
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int r4, E r5) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(r4, size());
        int r0 = positiveMod(this.head + r4);
        E r1 = (E) this.elementData[r0];
        this.elementData[r0] = r5;
        return r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        if (indexOf(element) == (-1)) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        int tail = positiveMod(this.head + size());
        if (this.head >= tail) goto L11;
        int index = this.head;
    L5:
        if (index >= tail) goto L35;
        if (Intrinsics.areEqual(element, this.elementData[index]) == true) goto L9;
        index = index + 1;
        goto L5
    L9:
        return index - this.head;
    L35:
        return -1;
    L11:
        int index2 = this.head;
        if (index2 < tail) goto L27;
        int index3 = this.head;
        int r2 = this.elementData.length;
    L14:
        if (index3 >= r2) goto L20;
        if (Intrinsics.areEqual(element, this.elementData[index3]) == true) goto L18;
        index3 = index3 + 1;
        goto L14
    L18:
        return index3 - this.head;
    L20:
        int index4 = 0;
    L21:
        if (index4 >= tail) goto L36;
        if (Intrinsics.areEqual(element, this.elementData[index4]) == true) goto L25;
        index4 = index4 + 1;
        goto L21
    L25:
        return (this.elementData.length + index4) - this.head;
    L36:
        return -1;
    L27:
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        int tail = positiveMod(this.head + size());
        int r1 = this.head;
        int r2 = this.head;
        if (r1 >= tail) goto L12;
        int index = tail - 1;
        if (r2 <= index) goto L7;
    L29:
        return -1;
    L7:
        if (Intrinsics.areEqual(element, this.elementData[index]) == true) goto L9;
        if (index == r2) goto L29;
        index = index - 1;
        goto L7
    L9:
        return index - this.head;
    L12:
        if (r2 <= tail) goto L29;
        int index2 = tail - 1;
    L14:
        Object[] r3 = this.elementData;
        if ((-1) >= index2) goto L21;
        if (Intrinsics.areEqual(element, r3[index2]) == true) goto L19;
        index2 = index2 - 1;
        goto L14
    L19:
        return (this.elementData.length + index2) - this.head;
    L21:
        int index3 = ArraysKt.getLastIndex(r3);
        int r4 = this.head;
        if (r4 > index3) goto L29;
    L24:
        if (Intrinsics.areEqual(element, this.elementData[index3]) == true) goto L26;
        if (index3 == r4) goto L29;
        index3 = index3 - 1;
        goto L24
    L26:
        return index3 - this.head;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        int index = indexOf(element);
        if (index != (-1)) goto L6;
        return false;
    L6:
        removeAt(index);
        return true;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int r11) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(r11, size());
        if (r11 == CollectionsKt.getLastIndex(this)) goto L5;
        if (r11 == 0) goto L8;
        registerModification();
        int r0 = positiveMod(this.head + r11);
        E r1 = (E) this.elementData[r0];
        int r2 = size() >> 1;
        int r4 = this.head;
        if (r11 >= r2) goto L16;
        Object[] r3 = this.elementData;
        if (r0 < r4) goto L14;
        ArraysKt.copyInto(r3, this.elementData, this.head + 1, this.head, r0);
    L15:
        this.elementData[this.head] = null;
        this.head = incremented(this.head);
    L21:
        this.size = size() - 1;
        return r1;
    L14:
        ArraysKt.copyInto(r3, this.elementData, 1, 0, r0);
        this.elementData[0] = this.elementData[this.elementData.length - 1];
        ArraysKt.copyInto(this.elementData, this.elementData, this.head + 1, this.head, this.elementData.length - 1);
        goto L15
    L16:
        int r5 = positiveMod(r4 + CollectionsKt.getLastIndex(this));
        Object[] r6 = this.elementData;
        if (r0 > r5) goto L19;
        ArraysKt.copyInto(r6, this.elementData, r0, r0 + 1, r5 + 1);
    L20:
        this.elementData[r5] = null;
        goto L21
    L19:
        ArraysKt.copyInto(r6, this.elementData, r0, r0 + 1, this.elementData.length);
        this.elementData[this.elementData.length - 1] = this.elementData[0];
        ArraysKt.copyInto(this.elementData, this.elementData, 0, 1, r5 + 1);
        goto L20
    L8:
        return removeFirst();
    L5:
        return removeLast();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> r14) {
        Intrinsics.checkNotNullParameter(r14, "elements");
        boolean modified$iv = false;
        if (isEmpty() == false) goto L5;
    L40:
        return modified$iv;
    L5:
        if (this.elementData.length != 0) goto L7;
        boolean r2 = true;
    L8:
        if (r2 == true) goto L40;
        int tail$iv = positiveMod(this.head + size());
        int newTail$iv = this.head;
        boolean modified$iv2 = false;
        if (this.head >= tail$iv) goto L21;
        int index$iv = this.head;
    L13:
        Object[] r7 = this.elementData;
        if (index$iv >= tail$iv) goto L20;
        Object element$iv = r7[index$iv];
        if (r14.contains(element$iv) == true) goto L18;
        this.elementData[newTail$iv] = element$iv;
        newTail$iv = newTail$iv + 1;
    L19:
        index$iv = index$iv + 1;
        goto L13
    L18:
        modified$iv2 = true;
        goto L19
    L20:
        ArraysKt.fill(r7, null, newTail$iv, tail$iv);
        boolean r12 = modified$iv2;
        int newTail$iv2 = newTail$iv;
        modified$iv = r12;
    L36:
        if (modified$iv == false) goto L40;
        registerModification();
        this.size = negativeMod(newTail$iv2 - this.head);
        goto L40
    L21:
        int index$iv2 = this.head;
        int r8 = this.elementData.length;
    L22:
        if (index$iv2 >= r8) goto L28;
        Object element$iv2 = this.elementData[index$iv2];
        this.elementData[index$iv2] = null;
        if (r14.contains(element$iv2) == true) goto L26;
        this.elementData[newTail$iv] = element$iv2;
        newTail$iv = newTail$iv + 1;
    L27:
        index$iv2 = index$iv2 + 1;
        goto L22
    L26:
        modified$iv2 = true;
        goto L27
    L28:
        int newTail$iv3 = positiveMod(newTail$iv);
        int index$iv3 = 0;
    L29:
        if (index$iv3 >= tail$iv) goto L35;
        Object element$iv3 = this.elementData[index$iv3];
        this.elementData[index$iv3] = null;
        if (r14.contains(element$iv3) == true) goto L33;
        this.elementData[newTail$iv3] = element$iv3;
        newTail$iv3 = incremented(newTail$iv3);
    L34:
        index$iv3 = index$iv3 + 1;
        goto L29
    L33:
        modified$iv2 = true;
        goto L34
    L35:
        boolean r13 = modified$iv2;
        newTail$iv2 = newTail$iv3;
        modified$iv = r13;
        goto L36
    L7:
        r2 = false;
        goto L8
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> r13) {
        Intrinsics.checkNotNullParameter(r13, "elements");
        boolean modified$iv = false;
        if (isEmpty() == false) goto L5;
    L40:
        return modified$iv;
    L5:
        if (this.elementData.length != 0) goto L7;
        boolean r2 = true;
    L8:
        if (r2 == true) goto L40;
        int tail$iv = positiveMod(this.head + size());
        int newTail$iv = this.head;
        boolean modified$iv2 = false;
        if (this.head >= tail$iv) goto L21;
        int index$iv = this.head;
    L13:
        Object[] r7 = this.elementData;
        if (index$iv >= tail$iv) goto L20;
        Object element$iv = r7[index$iv];
        if (r13.contains(element$iv) == false) goto L18;
        this.elementData[newTail$iv] = element$iv;
        newTail$iv = newTail$iv + 1;
    L19:
        index$iv = index$iv + 1;
        goto L13
    L18:
        modified$iv2 = true;
        goto L19
    L20:
        ArraysKt.fill(r7, null, newTail$iv, tail$iv);
        boolean r11 = modified$iv2;
        int newTail$iv2 = newTail$iv;
        modified$iv = r11;
    L36:
        if (modified$iv == false) goto L40;
        registerModification();
        this.size = negativeMod(newTail$iv2 - this.head);
        goto L40
    L21:
        int index$iv2 = this.head;
        int r8 = this.elementData.length;
    L22:
        if (index$iv2 >= r8) goto L28;
        Object element$iv2 = this.elementData[index$iv2];
        this.elementData[index$iv2] = null;
        if (r13.contains(element$iv2) == false) goto L26;
        this.elementData[newTail$iv] = element$iv2;
        newTail$iv = newTail$iv + 1;
    L27:
        index$iv2 = index$iv2 + 1;
        goto L22
    L26:
        modified$iv2 = true;
        goto L27
    L28:
        int newTail$iv3 = positiveMod(newTail$iv);
        int index$iv3 = 0;
    L29:
        if (index$iv3 >= tail$iv) goto L35;
        Object element$iv3 = this.elementData[index$iv3];
        this.elementData[index$iv3] = null;
        if (r13.contains(element$iv3) == false) goto L33;
        this.elementData[newTail$iv3] = element$iv3;
        newTail$iv3 = incremented(newTail$iv3);
    L34:
        index$iv3 = index$iv3 + 1;
        goto L29
    L33:
        modified$iv2 = true;
        goto L34
    L35:
        boolean r12 = modified$iv2;
        newTail$iv2 = newTail$iv3;
        modified$iv = r12;
        goto L36
    L7:
        r2 = false;
        goto L8
    }

    private final boolean filterInPlace(Function1<? super E, Boolean> r11) {
        if (isEmpty() == false) goto L5;
    L38:
        return false;
    L5:
        if (this.elementData.length != 0) goto L7;
        boolean r1 = true;
    L8:
        if (r1 == true) goto L38;
        int tail = positiveMod(this.head + size());
        int newTail = this.head;
        boolean modified = false;
        if (this.head >= tail) goto L21;
        int index = this.head;
    L13:
        Object[] r6 = this.elementData;
        if (index >= tail) goto L20;
        Object element = r6[index];
        if (r11.invoke(element).booleanValue() == false) goto L18;
        this.elementData[newTail] = element;
        newTail = newTail + 1;
    L19:
        index = index + 1;
        goto L13
    L18:
        modified = true;
        goto L19
    L20:
        ArraysKt.fill(r6, null, newTail, tail);
    L35:
        if (modified == false) goto L37;
        registerModification();
        this.size = negativeMod(newTail - this.head);
    L37:
        return modified;
    L21:
        int index2 = this.head;
        int r7 = this.elementData.length;
    L22:
        if (index2 >= r7) goto L28;
        Object element2 = this.elementData[index2];
        this.elementData[index2] = null;
        if (r11.invoke(element2).booleanValue() == false) goto L26;
        this.elementData[newTail] = element2;
        newTail = newTail + 1;
    L27:
        index2 = index2 + 1;
        goto L22
    L26:
        modified = true;
        goto L27
    L28:
        newTail = positiveMod(newTail);
        int index3 = 0;
    L29:
        if (index3 >= tail) goto L35;
        Object element3 = this.elementData[index3];
        this.elementData[index3] = null;
        if (r11.invoke(element3).booleanValue() == false) goto L33;
        this.elementData[newTail] = element3;
        newTail = incremented(newTail);
    L34:
        index3 = index3 + 1;
        goto L29
    L33:
        modified = true;
        goto L34
    L7:
        r1 = false;
        goto L8
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (isEmpty() == true) goto L5;
        registerModification();
        int tail = positiveMod(this.head + size());
        nullifyNonEmpty(this.head, tail);
    L5:
        this.head = 0;
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] r9) {
        Intrinsics.checkNotNullParameter(r9, "array");
        if (r9.length < size()) goto L5;
        Object[] r0 = r9;
    L6:
        Object[] r2 = r0;
        int r5 = positiveMod(this.head + size());
        if (this.head >= r5) goto L10;
        ArraysKt.copyInto$default(this.elementData, r2, 0, this.head, r5, 2, null);
    L13:
        return (T[]) CollectionsKt.terminateCollectionToArray(size(), r2);
    L10:
        if (isEmpty() == true) goto L13;
        ArraysKt.copyInto(this.elementData, r2, 0, this.head, this.elementData.length);
        ArraysKt.copyInto(this.elementData, r2, this.elementData.length - this.head, 0, r5);
        goto L13
    L5:
        r0 = ArraysKt.arrayOfNulls(r9, size());
        goto L6
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractList
    protected void removeRange(int fromIndex, int toIndex) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, size());
        int length = toIndex - fromIndex;
        if (length != 0) goto L6;
        return;
    L6:
        if (length != size()) goto L10;
        clear();
        return;
    L10:
        if (length != 1) goto L13;
        removeAt(fromIndex);
        return;
    L13:
        registerModification();
        if (fromIndex >= (size() - toIndex)) goto L16;
        removeRangeShiftPreceding(fromIndex, toIndex);
        int newHead = positiveMod(this.head + length);
        nullifyNonEmpty(this.head, newHead);
        this.head = newHead;
    L17:
        this.size = size() - length;
        return;
    L16:
        removeRangeShiftSucceeding(fromIndex, toIndex);
        int tail = positiveMod(this.head + size());
        nullifyNonEmpty(negativeMod(tail - length), tail);
        goto L17
    }

    private final void removeRangeShiftPreceding(int fromIndex, int toIndex) {
        int copyFromIndex = positiveMod(this.head + (fromIndex - 1));
        int copyToIndex = positiveMod(this.head + (toIndex - 1));
        int copyCount = fromIndex;
    L3:
        if (copyCount <= 0) goto L5;
        int segmentLength = Math.min(copyCount, Math.min(copyFromIndex + 1, copyToIndex + 1));
        ArraysKt.copyInto(this.elementData, this.elementData, (copyToIndex - segmentLength) + 1, (copyFromIndex - segmentLength) + 1, copyFromIndex + 1);
        copyFromIndex = negativeMod(copyFromIndex - segmentLength);
        copyToIndex = negativeMod(copyToIndex - segmentLength);
        copyCount = copyCount - segmentLength;
        goto L3
    }

    private final void removeRangeShiftSucceeding(int fromIndex, int toIndex) {
        int copyFromIndex = positiveMod(this.head + toIndex);
        int copyToIndex = positiveMod(this.head + fromIndex);
        int copyCount = size() - toIndex;
    L3:
        if (copyCount <= 0) goto L5;
        int segmentLength = Math.min(copyCount, Math.min(this.elementData.length - copyFromIndex, this.elementData.length - copyToIndex));
        ArraysKt.copyInto(this.elementData, this.elementData, copyToIndex, copyFromIndex, copyFromIndex + segmentLength);
        copyFromIndex = positiveMod(copyFromIndex + segmentLength);
        copyToIndex = positiveMod(copyToIndex + segmentLength);
        copyCount = copyCount - segmentLength;
        goto L3
    }

    private final void nullifyNonEmpty(int internalFromIndex, int internalToIndex) {
        Object[] r0 = this.elementData;
        if (internalFromIndex >= internalToIndex) goto L5;
        ArraysKt.fill(r0, null, internalFromIndex, internalToIndex);
        return;
    L5:
        ArraysKt.fill(r0, null, internalFromIndex, this.elementData.length);
        ArraysKt.fill(this.elementData, null, 0, internalToIndex);
    }

    private final void registerModification() {
        this.modCount++;
    }

    public final <T> T[] testToArray$kotlin_stdlib(T[] r2) {
        Intrinsics.checkNotNullParameter(r2, "array");
        return (T[]) toArray(r2);
    }

    public final Object[] testToArray$kotlin_stdlib() {
        return toArray();
    }

    public final void testRemoveRange$kotlin_stdlib(int fromIndex, int toIndex) {
        removeRange(fromIndex, toIndex);
    }

    static {
        Companion = new Companion(null);
        emptyElementData = new Object[0];
    }

    public final void internalStructure$kotlin_stdlib(Function2<? super Integer, ? super Object[], Unit> r5) {
        Intrinsics.checkNotNullParameter(r5, "structure");
        int tail = positiveMod(this.head + size());
        if (isEmpty() == false) goto L5;
    L8:
        int head = this.head;
    L9:
        r5.invoke(Integer.valueOf(head), toArray());
        return;
    L5:
        if (this.head < tail) goto L8;
        head = this.head - this.elementData.length;
        goto L9
    }
}
