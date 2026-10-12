package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u001f\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\n\u0010\rJ\u0016\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\tH\u0096\u0002¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0096\u0002J'\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006\"\u0004\b\u0001\u0010\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006H\u0014¢\u0006\u0002\u0010\u001dJ\u0015\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0014¢\u0006\u0002\u0010\u001eJ\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010 \u001a\u00020\tJ\u0013\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00028\u0000¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\tJ\u0015\u0010'\u001a\u00020\t*\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0082\bR\u0018\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006("}, d2 = {"Lkotlin/collections/RingBuffer;", "T", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "buffer", "", "", "filledSize", "", "<init>", "([Ljava/lang/Object;I)V", "capacity", "(I)V", "[Ljava/lang/Object;", "startIndex", "value", "size", "getSize", "()I", "get", "index", "(I)Ljava/lang/Object;", "isFull", "", "iterator", "", "toArray", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "expanded", "maxCapacity", "add", "", "element", "(Ljava/lang/Object;)V", "removeFirst", "n", "forward", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class RingBuffer<T> extends AbstractList<T> implements RandomAccess {
    private final Object[] buffer;
    private final int capacity;
    private int size;
    private int startIndex;

    public RingBuffer(Object[] buffer, int filledSize) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.buffer = buffer;
        boolean r0 = true;
        if (filledSize < 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L17;
        if (filledSize <= this.buffer.length) goto L11;
        r0 = false;
    L11:
        if (r0 == false) goto L15;
        this.capacity = this.buffer.length;
        this.size = filledSize;
        return;
    L15:
        throw new IllegalArgumentException(("ring buffer filled size: " + filledSize + " cannot be larger than the buffer size: " + this.buffer.length).toString());
    L17:
        throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + filledSize).toString());
    L5:
        r2 = false;
        goto L6
    }

    public static final /* synthetic */ Object[] access$getBuffer$p(RingBuffer $this) {
        return $this.buffer;
    }

    public static final /* synthetic */ int access$getCapacity$p(RingBuffer $this) {
        return $this.capacity;
    }

    public static final /* synthetic */ int access$getStartIndex$p(RingBuffer $this) {
        return $this.startIndex;
    }

    public RingBuffer(int capacity) {
        this(new Object[capacity], 0);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int r7) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(r7, size());
        return (T) this.buffer[(this.startIndex + r7) % access$getCapacity$p(this)];
    }

    public final boolean isFull() {
        if (size() != this.capacity) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return new AnonymousClass1(this);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] r6) {
        Intrinsics.checkNotNullParameter(r6, "array");
        if (r6.length >= size()) goto L5;
        Object[] r0 = Arrays.copyOf(r6, size());
        Intrinsics.checkNotNullExpressionValue(r0, "copyOf(...)");
    L6:
        int r1 = size();
        int r2 = 0;
        int r3 = this.startIndex;
    L7:
        if (r2 >= r1) goto L11;
        if (r3 >= this.capacity) goto L11;
        r0[r2] = this.buffer[r3];
        r2 = r2 + 1;
        r3 = r3 + 1;
    L11:
        int r4 = 0;
    L12:
        if (r2 >= r1) goto L15;
        r0[r2] = this.buffer[r4];
        r2 = r2 + 1;
        r4 = r4 + 1;
        goto L12
    L15:
        return (T[]) CollectionsKt.terminateCollectionToArray(r1, r0);
    L5:
        r0 = r6;
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RingBuffer<T> expanded(int maxCapacity) {
        int newCapacity = RangesKt.coerceAtMost((this.capacity + (this.capacity >> 1)) + 1, maxCapacity);
        if (this.startIndex != 0) goto L5;
        Object[] newBuffer = Arrays.copyOf(this.buffer, newCapacity);
        Intrinsics.checkNotNullExpressionValue(newBuffer, "copyOf(...)");
    L7:
        return new RingBuffer(newBuffer, size());
    L5:
        newBuffer = toArray(new Object[newCapacity]);
        goto L7
    }

    @Override // java.util.Collection, java.util.List
    public final void add(T r8) {
        if (isFull() == true) goto L7;
        Object[] r0 = this.buffer;
        int $this$forward$iv = this.startIndex;
        int n$iv = size();
        r0[($this$forward$iv + n$iv) % access$getCapacity$p(this)] = r8;
        this.size = size() + 1;
        return;
    L7:
        throw new IllegalStateException("ring buffer is full");
    }

    public final void removeFirst(int n) {
        boolean r0 = true;
        if (n < 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L22;
        if (n <= size()) goto L11;
        r0 = false;
    L11:
        if (r0 == false) goto L20;
        if (n <= 0) goto L23;
        int start = this.startIndex;
        int end = (start + n) % access$getCapacity$p(this);
        Object[] r3 = this.buffer;
        if (start <= end) goto L16;
        ArraysKt.fill(r3, null, start, this.capacity);
        ArraysKt.fill(this.buffer, null, 0, end);
    L17:
        this.startIndex = end;
        this.size = size() - n;
        return;
    L16:
        ArraysKt.fill(r3, null, start, end);
        goto L17
    L23:
        return;
    L20:
        throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + n + ", size = " + size()).toString());
    L22:
        throw new IllegalArgumentException(("n shouldn't be negative but it is " + n).toString());
    L5:
        r2 = false;
        goto L6
    }

    private final int forward(int $this$forward, int n) {
        return ($this$forward + n) % access$getCapacity$p(this);
    }
}
