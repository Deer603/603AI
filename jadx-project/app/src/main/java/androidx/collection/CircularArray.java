package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CircularArray.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0016\u001a\u00020\u0012J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\u0016\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u000b\u0010\u001d\u001a\u00028\u0000¢\u0006\u0002\u0010\fJ\u000b\u0010\u001e\u001a\u00028\u0000¢\u0006\u0002\u0010\fJ\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0004J\u000e\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0004J\u0006\u0010\"\u001a\u00020\u0004R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\n\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Landroidx/collection/CircularArray;", "E", "", "minCapacity", "", "(I)V", "capacityBitmask", "elements", "", "[Ljava/lang/Object;", "first", "getFirst", "()Ljava/lang/Object;", "head", "last", "getLast", "tail", "addFirst", "", "element", "(Ljava/lang/Object;)V", "addLast", "clear", "doubleCapacity", "get", "index", "(I)Ljava/lang/Object;", "isEmpty", "", "popFirst", "popLast", "removeFromEnd", "count", "removeFromStart", "size", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CircularArray<E> {
    private int capacityBitmask;
    private E[] elements;
    private int head;
    private int tail;

    public CircularArray() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public CircularArray(int r6) {
        boolean r0 = false;
        if (r6 < 1) goto L5;
        boolean r2 = true;
    L7:
        if (r2 == true) goto L10;
        RuntimeHelpersKt.throwIllegalArgumentException("capacity must be >= 1");
    L10:
        if (r6 > 1073741824) goto L13;
        r0 = true;
    L13:
        if (r0 == true) goto L16;
        RuntimeHelpersKt.throwIllegalArgumentException("capacity must be <= 2^30");
    L16:
        if (Integer.bitCount(r6) == 1) goto L18;
        int r1 = Integer.highestOneBit(r6 - 1) << 1;
    L19:
        this.capacityBitmask = r1 - 1;
        this.elements = (E[]) new Object[r1];
        return;
    L18:
        r1 = r6;
        goto L19
    L5:
        r2 = false;
        goto L7
    }

    public /* synthetic */ CircularArray(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 8;
    L5:
        this(r1);
    }

    private final void doubleCapacity() {
        int r0 = this.elements.length;
        int r1 = r0 - this.head;
        int r2 = r0 << 1;
        if (r2 < 0) goto L7;
        E[] r3 = (E[]) new Object[r2];
        ArraysKt.copyInto(this.elements, r3, 0, this.head, r0);
        ArraysKt.copyInto(this.elements, r3, r1, 0, this.head);
        this.elements = r3;
        this.head = 0;
        this.tail = r0;
        this.capacityBitmask = r2 - 1;
        return;
    L7:
        throw new RuntimeException("Max array capacity exceeded");
    }

    public final void addFirst(E r3) {
        this.head = (this.head - 1) & this.capacityBitmask;
        this.elements[this.head] = r3;
        if (this.head != this.tail) goto L6;
        doubleCapacity();
        return;
    }

    public final void addLast(E r3) {
        this.elements[this.tail] = r3;
        this.tail = (this.tail + 1) & this.capacityBitmask;
        if (this.tail != this.head) goto L6;
        doubleCapacity();
        return;
    }

    public final E popFirst() {
        if (this.head == this.tail) goto L6;
        E r0 = this.elements[this.head];
        this.elements[this.head] = null;
        this.head = (this.head + 1) & this.capacityBitmask;
        return r0;
    L6:
        Object result = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final E popLast() {
        if (this.head == this.tail) goto L6;
        int t = (this.tail - 1) & this.capacityBitmask;
        E r1 = this.elements[t];
        this.elements[t] = null;
        this.tail = t;
        return r1;
    L6:
        CollectionPlatformUtils r0 = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void clear() {
        removeFromStart(size());
    }

    public final void removeFromStart(int count) {
        if (count > 0) goto L5;
        return;
    L5:
        if (count > size()) goto L20;
        int end = this.elements.length;
        if (count >= (end - this.head)) goto L9;
        end = this.head + count;
    L9:
        int i = this.head;
    L11:
        if (i >= end) goto L13;
        this.elements[i] = null;
        i = i + 1;
        goto L11
    L13:
        int i2 = this.head;
        int removed = end - i2;
        int numOfElements = count - removed;
        this.head = (this.head + removed) & this.capacityBitmask;
        if (numOfElements <= 0) goto L24;
        int i3 = 0;
    L16:
        if (i3 >= numOfElements) goto L18;
        this.elements[i3] = null;
        i3 = i3 + 1;
        goto L16
    L18:
        this.head = numOfElements;
        return;
    L24:
        return;
    L20:
        CollectionPlatformUtils r0 = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void removeFromEnd(int count) {
        if (count > 0) goto L5;
        return;
    L5:
        if (count > size()) goto L20;
        int start = 0;
        if (count >= this.tail) goto L9;
        start = this.tail - count;
    L9:
        int i = start;
        int r3 = this.tail;
    L11:
        if (i >= r3) goto L13;
        this.elements[i] = null;
        i = i + 1;
        goto L11
    L13:
        int i2 = this.tail;
        int removed = i2 - start;
        int numOfElements = count - removed;
        this.tail -= removed;
        if (numOfElements <= 0) goto L24;
        this.tail = this.elements.length;
        int newTail = this.tail - numOfElements;
        int i3 = newTail;
        int r6 = this.tail;
    L16:
        if (i3 >= r6) goto L18;
        this.elements[i3] = null;
        i3 = i3 + 1;
        goto L16
    L18:
        this.tail = newTail;
        return;
    L24:
        return;
    L20:
        CollectionPlatformUtils r0 = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final E getFirst() {
        if (this.head == this.tail) goto L6;
        E r0 = this.elements[this.head];
        Intrinsics.checkNotNull(r0);
        return r0;
    L6:
        CollectionPlatformUtils r1 = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final E getLast() {
        if (this.head == this.tail) goto L6;
        E r0 = this.elements[(this.tail - 1) & this.capacityBitmask];
        Intrinsics.checkNotNull(r0);
        return r0;
    L6:
        CollectionPlatformUtils r1 = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final E get(int index) {
        if (index >= 0) goto L4;
    L7:
        CollectionPlatformUtils r0 = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    L4:
        if (index >= size()) goto L7;
        E r1 = this.elements[(this.head + index) & this.capacityBitmask];
        Intrinsics.checkNotNull(r1);
        return r1;
    }

    public final int size() {
        return (this.tail - this.head) & this.capacityBitmask;
    }

    public final boolean isEmpty() {
        if (this.head != this.tail) goto L5;
        return true;
    L5:
        return false;
    }
}
