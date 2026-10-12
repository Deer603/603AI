package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: OrderedScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\u0010\u0016\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rJ\u0014\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u001b\u0010\u000b\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0002\u0010\u0010J\u0014\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0014\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\r\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017J\u0006\u0010\u0018\u001a\u00020\u0014J\r\u0010\u0019\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u001aJ\u0015\u0010\u001b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0002J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\u0014H\u0002J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u0004H\u0002J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0016\u0010'\u001a\u00020\u00142\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010(J\u0017\u0010'\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0086\u0002J\u0017\u0010'\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002J\u0017\u0010'\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0086\u0002J\u001e\u0010'\u001a\u00020\u00142\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000fH\u0086\u0002¢\u0006\u0002\u0010)J\u0017\u0010'\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0086\u0002J\u0017\u0010'\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\u0002J\u0011\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u0004H\u0082\bJ\u0016\u0010,\u001a\u00020\u00142\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010(J\u0017\u0010,\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0086\u0002J\u0017\u0010,\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002J\u0017\u0010,\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0086\u0002J\u001e\u0010,\u001a\u00020\u00142\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000fH\u0086\u0002¢\u0006\u0002\u0010)J\u0017\u0010,\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0086\u0002J\u0017\u0010,\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\u0002J\u0013\u0010-\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0002\u0010\nJ\u0014\u0010.\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rJ\u0014\u0010.\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010.\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u001b\u0010.\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0002\u0010\u0010J\u0014\u0010.\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0014\u0010.\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\u0010\u0010/\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u0004H\u0001J \u00100\u001a\u00020\u00142\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b02H\u0086\bø\u0001\u0000J\u0011\u00103\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u0004H\u0082\bJ\u0015\u00104\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u0004H\u0000¢\u0006\u0002\b6J \u00107\u001a\u00020\b2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b02H\u0086\bø\u0001\u0000J\u0014\u00107\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u00107\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u0014\u00107\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u000008J\b\u00109\u001a\u00020\u0004H\u0007J\u000e\u0010:\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\u0004R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006<"}, d2 = {"Landroidx/collection/MutableOrderedScatterSet;", "E", "Landroidx/collection/OrderedScatterSet;", "initialCapacity", "", "(I)V", "growthLimit", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "elements", "Landroidx/collection/ObjectList;", "Landroidx/collection/ScatterSet;", "", "([Ljava/lang/Object;)Z", "", "Lkotlin/sequences/Sequence;", "adjustStorage", "", "adjustStorage$collection", "asMutableSet", "", "clear", "dropDeletes", "dropDeletes$collection", "findAbsoluteInsertIndex", "(Ljava/lang/Object;)I", "findFirstAvailableSlot", "hash1", "fixupNodes", "mapping", "", "", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "(Ljava/lang/Object;)V", "([Ljava/lang/Object;)V", "moveNodeToHead", "index", "plusAssign", "remove", "removeAll", "removeElementAt", "removeIf", "predicate", "Lkotlin/Function1;", "removeNode", "resizeStorage", "newCapacity", "resizeStorage$collection", "retainAll", "", "trim", "trimToSize", "maxSize", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableOrderedScatterSet<E> extends OrderedScatterSet<E> {
    private int growthLimit;

    public MutableOrderedScatterSet() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public /* synthetic */ MutableOrderedScatterSet(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 6;
    L5:
        this(r1);
    }

    public MutableOrderedScatterSet(int initialCapacity) {
        super(null);
        if (initialCapacity < 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
    L9:
        initializeStorage(ScatterMapKt.unloadedCapacity(initialCapacity));
        return;
    L5:
        value$iv = false;
        goto L7
    }

    private final void initializeStorage(int initialCapacity) {
        if (initialCapacity <= 0) goto L4;
        int newCapacity = Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity));
    L5:
        this._capacity = newCapacity;
        initializeMetadata(newCapacity);
        if (newCapacity != 0) goto L8;
        Object[] r1 = ContainerHelpersKt.EMPTY_OBJECTS;
    L9:
        this.elements = r1;
        if (newCapacity != 0) goto L12;
        long[] $this$initializeStorage_u24lambda_u241 = SieveCacheKt.getEmptyNodes();
    L13:
        this.nodes = $this$initializeStorage_u24lambda_u241;
        return;
    L12:
        $this$initializeStorage_u24lambda_u241 = new long[newCapacity];
        ArraysKt.fill$default($this$initializeStorage_u24lambda_u241, 4611686018427387903L, 0, 0, 6, null);
        goto L13
    L8:
        r1 = new Object[newCapacity];
        goto L9
    L4:
        newCapacity = 0;
        goto L5
    }

    private final void initializeMetadata(int capacity) {
        if (capacity != 0) goto L4;
        long[] r0 = ScatterMapKt.EmptyGroup;
    L5:
        this.metadata = r0;
        long[] data$iv = this.metadata;
        int i$iv = capacity >> 3;
        int b$iv = (capacity & 7) << 3;
        data$iv[i$iv] = (data$iv[i$iv] & (~(255 << b$iv))) | (255 << b$iv);
        initializeGrowth();
        return;
    L4:
        int size = ((((capacity + 1) + 7) + 7) & (-8)) >> 3;
        long[] $this$initializeMetadata_u24lambda_u242 = new long[size];
        ArraysKt.fill$default($this$initializeMetadata_u24lambda_u242, -9187201950435737472L, 0, 0, 6, null);
        r0 = $this$initializeMetadata_u24lambda_u242;
        goto L5
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    public final boolean add(E r19) {
        int oldSize = getSize();
        int index = findAbsoluteInsertIndex(r19);
        this.elements[index] = r19;
        long[] r5 = this.nodes;
        int next$iv$iv = this.head;
        r5[index] = (((long) next$iv$iv) & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (this.head == Integer.MAX_VALUE) goto L5;
        long[] r6 = this.nodes;
        int r7 = this.head;
        long node$iv$iv = this.nodes[this.head];
        r6[r7] = (SieveCacheKt.NodeMetaAndNextMask & node$iv$iv) | ((((long) index) & SieveCacheKt.NodeLinkMask) << 31);
    L5:
        this.head = index;
        if (this.tail != Integer.MAX_VALUE) goto L9;
        this.tail = index;
    L9:
        if (getSize() == oldSize) goto L11;
        return true;
    L11:
        return false;
    }

    public final void plusAssign(E r18) {
        int index = findAbsoluteInsertIndex(r18);
        this.elements[index] = r18;
        long[] r4 = this.nodes;
        int next$iv$iv = this.head;
        r4[index] = (((long) next$iv$iv) & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (this.head == Integer.MAX_VALUE) goto L5;
        long[] r5 = this.nodes;
        int r6 = this.head;
        long node$iv$iv = this.nodes[this.head];
        r5[r6] = (SieveCacheKt.NodeMetaAndNextMask & node$iv$iv) | ((((long) index) & SieveCacheKt.NodeLinkMask) << 31);
    L5:
        this.head = index;
        if (this.tail != Integer.MAX_VALUE) goto L10;
        this.tail = index;
        return;
    }

    public final boolean addAll(E[] r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        int oldSize = getSize();
        plusAssign(r3);
        if (oldSize == getSize()) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean addAll(Iterable<? extends E> r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        int oldSize = getSize();
        plusAssign(r3);
        if (oldSize == getSize()) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean addAll(Sequence<? extends E> r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        int oldSize = getSize();
        plusAssign(r3);
        if (oldSize == getSize()) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean addAll(OrderedScatterSet<E> r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        int oldSize = getSize();
        plusAssign(r3);
        if (oldSize == getSize()) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean addAll(ScatterSet<E> r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        int oldSize = getSize();
        plusAssign(r3);
        if (oldSize == getSize()) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean addAll(ObjectList<E> r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        int oldSize = getSize();
        plusAssign(r3);
        if (oldSize == getSize()) goto L5;
        return true;
    L5:
        return false;
    }

    public final void plusAssign(E[] r8) {
        Intrinsics.checkNotNullParameter(r8, "elements");
        int r2 = r8.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L6;
        plusAssign(r8[r3]);
        r3 = r3 + 1;
        goto L3
    }

    public final void plusAssign(Iterable<? extends E> r7) {
        Intrinsics.checkNotNullParameter(r7, "elements");
        Iterator<? extends E> r2 = r7.iterator();
    L4:
        if (r2.hasNext() == false) goto L7;
        plusAssign(r2.next());
        goto L4
    }

    public final void plusAssign(Sequence<? extends E> r7) {
        Intrinsics.checkNotNullParameter(r7, "elements");
        Iterator<? extends E> r2 = r7.iterator();
    L4:
        if (r2.hasNext() == false) goto L7;
        plusAssign(r2.next());
        goto L4
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(OrderedScatterSet<E> r13) {
        Intrinsics.checkNotNullParameter(r13, "elements");
        Object[] elements$iv = r13.elements;
        long[] nodes$iv = r13.nodes;
        int candidate$iv = r13.tail;
    L4:
        if (candidate$iv == Integer.MAX_VALUE) goto L7;
        long $this$previousNode$iv$iv = nodes$iv[candidate$iv];
        int previousNode$iv = (int) (($this$previousNode$iv$iv >> 31) & SieveCacheKt.NodeLinkMask);
        Object element = elements$iv[candidate$iv];
        plusAssign(element);
        candidate$iv = previousNode$iv;
        goto L4
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(ScatterSet<E> r21) {
        Intrinsics.checkNotNullParameter(r21, "elements");
        ScatterSet<E> r0 = r21;
        Object[] elements$iv = r0.elements;
        long[] m$iv$iv = r0.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L25;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L19;
        int r12 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L16;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r17 = true;
    L12:
        if (r17 == false) goto L15;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object element = elements$iv[index$iv$iv];
        plusAssign(element);
    L15:
        slot$iv$iv = slot$iv$iv >> r12;
        j$iv$iv = j$iv$iv + 1;
        r12 = r12;
        r0 = r0;
        goto L7
    L11:
        r17 = false;
        goto L12
    L16:
        ScatterSet<E> r19 = r0;
        if (bitCount$iv$iv != r12) goto L31;
    L20:
        if (i$iv$iv == lastIndex$iv$iv) goto L32;
        i$iv$iv = i$iv$iv + 1;
        r0 = r19;
        goto L4
    L32:
        return;
    L31:
        return;
    L19:
        r19 = r0;
        goto L20
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(ObjectList<E> r8) {
        Intrinsics.checkNotNullParameter(r8, "elements");
        Object[] content$iv = r8.content;
        int i$iv = 0;
        int r4 = r8._size;
    L3:
        if (i$iv >= r4) goto L6;
        Object element = content$iv[i$iv];
        plusAssign(element);
        i$iv = i$iv + 1;
        goto L3
    }

    public final boolean remove(E r26) {
        MutableOrderedScatterSet<E> this_$iv = this;
        int $i$f$findElementIndex$collection = 0;
        if (r26 == null) goto L5;
        int r6 = r26.hashCode();
    L6:
        int hash$iv$iv = r6 * ScatterMapKt.MurmurHashC1;
        int hash$iv = hash$iv$iv ^ (hash$iv$iv << 16);
        int hash2$iv = hash$iv & WorkQueueKt.MASK;
        int probeMask$iv = this_$iv._capacity;
        int $i$f$h1 = hash$iv >>> 7;
        int probeOffset$iv = $i$f$h1 & probeMask$iv;
        int probeIndex$iv = 0;
    L7:
        long[] metadata$iv$iv = this_$iv.metadata;
        int i$iv$iv = probeOffset$iv >> 3;
        int b$iv$iv = (probeOffset$iv & 7) << 3;
        int hash2$iv2 = hash2$iv;
        long g$iv = ((metadata$iv$iv[i$iv$iv + 1] << (64 - b$iv$iv)) & ((-b$iv$iv) >> 63)) | (metadata$iv$iv[i$iv$iv] >>> b$iv$iv);
        long x$iv$iv = (((long) hash2$iv2) * ScatterMapKt.BitmaskLsb) ^ g$iv;
        int $i$f$findElementIndex$collection2 = $i$f$findElementIndex$collection;
        int hash$iv2 = hash$iv;
        long m$iv = ((x$iv$iv - ScatterMapKt.BitmaskLsb) & (~x$iv$iv)) & (-9187201950435737472L);
    L8:
        long $this$hasNext$iv$iv = m$iv;
        if ($this$hasNext$iv$iv == 0) goto L11;
        boolean r10 = true;
    L12:
        if (r10 == false) goto L17;
        long $this$get$iv$iv = m$iv;
        int index$iv = ((Long.numberOfTrailingZeros($this$get$iv$iv) >> 3) + probeOffset$iv) & probeMask$iv;
        if (Intrinsics.areEqual(this_$iv.elements[index$iv], r26) == true) goto L21;
        long $this$next$iv$iv = m$iv;
        m$iv = $this$next$iv$iv & ($this$next$iv$iv - 1);
    L21:
        if (index$iv < 0) goto L23;
        boolean exists = true;
    L24:
        if (exists == false) goto L26;
        removeElementAt(index$iv);
    L26:
        return exists;
    L23:
        exists = false;
        goto L24
    L17:
        long $this$maskEmpty$iv$iv = (((~g$iv) << 6) & g$iv) & (-9187201950435737472L);
        if ($this$maskEmpty$iv$iv != 0) goto L19;
        probeIndex$iv = probeIndex$iv + 8;
        probeOffset$iv = (probeOffset$iv + probeIndex$iv) & probeMask$iv;
        hash2$iv = hash2$iv2;
        $i$f$findElementIndex$collection = $i$f$findElementIndex$collection2;
        hash$iv = hash$iv2;
        goto L7
    L19:
        index$iv = -1;
        goto L21
    L11:
        r10 = false;
        goto L12
    L5:
        r6 = 0;
        goto L6
    }

    public final void minusAssign(E r25) {
        MutableOrderedScatterSet<E> this_$iv = this;
        int $i$f$findElementIndex$collection = 0;
        if (r25 == null) goto L5;
        int r6 = r25.hashCode();
    L6:
        int hash$iv$iv = r6 * ScatterMapKt.MurmurHashC1;
        int hash$iv = hash$iv$iv ^ (hash$iv$iv << 16);
        int hash2$iv = hash$iv & WorkQueueKt.MASK;
        int probeMask$iv = this_$iv._capacity;
        int $i$f$h1 = hash$iv >>> 7;
        int probeOffset$iv = $i$f$h1 & probeMask$iv;
        int probeIndex$iv = 0;
    L7:
        long[] metadata$iv$iv = this_$iv.metadata;
        int i$iv$iv = probeOffset$iv >> 3;
        int b$iv$iv = (probeOffset$iv & 7) << 3;
        int hash2$iv2 = hash2$iv;
        long g$iv = ((metadata$iv$iv[i$iv$iv + 1] << (64 - b$iv$iv)) & ((-b$iv$iv) >> 63)) | (metadata$iv$iv[i$iv$iv] >>> b$iv$iv);
        long x$iv$iv = (((long) hash2$iv2) * ScatterMapKt.BitmaskLsb) ^ g$iv;
        int $i$f$findElementIndex$collection2 = $i$f$findElementIndex$collection;
        int hash$iv2 = hash$iv;
        long m$iv = ((x$iv$iv - ScatterMapKt.BitmaskLsb) & (~x$iv$iv)) & (-9187201950435737472L);
    L8:
        long $this$hasNext$iv$iv = m$iv;
        if ($this$hasNext$iv$iv == 0) goto L11;
        boolean r21 = true;
    L12:
        if (r21 == false) goto L17;
        long $this$get$iv$iv = m$iv;
        int index$iv = ((Long.numberOfTrailingZeros($this$get$iv$iv) >> 3) + probeOffset$iv) & probeMask$iv;
        if (Intrinsics.areEqual(this_$iv.elements[index$iv], r25) == true) goto L21;
        long $this$next$iv$iv = m$iv;
        m$iv = $this$next$iv$iv & ($this$next$iv$iv - 1);
    L21:
        if (index$iv < 0) goto L28;
        removeElementAt(index$iv);
        return;
    L28:
        return;
    L17:
        long $this$maskEmpty$iv$iv = (((~g$iv) << 6) & g$iv) & (-9187201950435737472L);
        if ($this$maskEmpty$iv$iv != 0) goto L19;
        probeIndex$iv = probeIndex$iv + 8;
        probeOffset$iv = (probeOffset$iv + probeIndex$iv) & probeMask$iv;
        hash2$iv = hash2$iv2;
        $i$f$findElementIndex$collection = $i$f$findElementIndex$collection2;
        hash$iv = hash$iv2;
        goto L7
    L19:
        index$iv = -1;
        goto L21
    L11:
        r21 = false;
        goto L12
    L5:
        r6 = 0;
        goto L6
    }

    public final boolean removeAll(E[] r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        int oldSize = getSize();
        minusAssign(r3);
        if (oldSize == getSize()) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean removeAll(Sequence<? extends E> r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        int oldSize = getSize();
        minusAssign(r3);
        if (oldSize == getSize()) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean removeAll(Iterable<? extends E> r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        int oldSize = getSize();
        minusAssign(r3);
        if (oldSize == getSize()) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean removeAll(OrderedScatterSet<E> r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        int oldSize = getSize();
        minusAssign(r3);
        if (oldSize == getSize()) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean removeAll(ScatterSet<E> r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        int oldSize = getSize();
        minusAssign(r3);
        if (oldSize == getSize()) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean removeAll(ObjectList<E> r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        int oldSize = getSize();
        minusAssign(r3);
        if (oldSize == getSize()) goto L5;
        return true;
    L5:
        return false;
    }

    public final void minusAssign(E[] r8) {
        Intrinsics.checkNotNullParameter(r8, "elements");
        int r2 = r8.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L6;
        minusAssign(r8[r3]);
        r3 = r3 + 1;
        goto L3
    }

    public final void minusAssign(Sequence<? extends E> r7) {
        Intrinsics.checkNotNullParameter(r7, "elements");
        Iterator<? extends E> r2 = r7.iterator();
    L4:
        if (r2.hasNext() == false) goto L7;
        minusAssign(r2.next());
        goto L4
    }

    public final void minusAssign(Iterable<? extends E> r7) {
        Intrinsics.checkNotNullParameter(r7, "elements");
        Iterator<? extends E> r2 = r7.iterator();
    L4:
        if (r2.hasNext() == false) goto L7;
        minusAssign(r2.next());
        goto L4
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(OrderedScatterSet<E> r13) {
        Intrinsics.checkNotNullParameter(r13, "elements");
        Object[] elements$iv = r13.elements;
        long[] nodes$iv = r13.nodes;
        int candidate$iv = r13.tail;
    L4:
        if (candidate$iv == Integer.MAX_VALUE) goto L7;
        long $this$previousNode$iv$iv = nodes$iv[candidate$iv];
        int previousNode$iv = (int) (($this$previousNode$iv$iv >> 31) & SieveCacheKt.NodeLinkMask);
        Object element = elements$iv[candidate$iv];
        minusAssign(element);
        candidate$iv = previousNode$iv;
        goto L4
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<E> r21) {
        Intrinsics.checkNotNullParameter(r21, "elements");
        ScatterSet<E> r0 = r21;
        Object[] elements$iv = r0.elements;
        long[] m$iv$iv = r0.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L25;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L19;
        int r12 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L16;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r17 = true;
    L12:
        if (r17 == false) goto L15;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object element = elements$iv[index$iv$iv];
        minusAssign(element);
    L15:
        slot$iv$iv = slot$iv$iv >> r12;
        j$iv$iv = j$iv$iv + 1;
        r12 = r12;
        r0 = r0;
        goto L7
    L11:
        r17 = false;
        goto L12
    L16:
        ScatterSet<E> r19 = r0;
        if (bitCount$iv$iv != r12) goto L31;
    L20:
        if (i$iv$iv == lastIndex$iv$iv) goto L32;
        i$iv$iv = i$iv$iv + 1;
        r0 = r19;
        goto L4
    L32:
        return;
    L31:
        return;
    L19:
        r19 = r0;
        goto L20
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<E> r8) {
        Intrinsics.checkNotNullParameter(r8, "elements");
        Object[] content$iv = r8.content;
        int i$iv = 0;
        int r4 = r8._size;
    L3:
        if (i$iv >= r4) goto L6;
        Object element = content$iv[i$iv];
        minusAssign(element);
        i$iv = i$iv + 1;
        goto L3
    }

    public final void removeIf(Function1<? super E, Boolean> r20) {
        Intrinsics.checkNotNullParameter(r20, "predicate");
        Object[] elements = this.elements;
        MutableOrderedScatterSet<E> this_$iv = this;
        long[] m$iv = this_$iv.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 > lastIndex$iv) goto L24;
    L4:
        long slot$iv = m$iv[i$iv];
        long $this$maskEmptyOrDeleted$iv$iv = (((~slot$iv) << 7) & slot$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv == (-9187201950435737472L)) goto L21;
        int r12 = 8;
        int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
        int j$iv = 0;
    L7:
        if (j$iv >= bitCount$iv) goto L20;
        long value$iv$iv = 255 & slot$iv;
        if (value$iv$iv >= 128) goto L11;
        boolean r17 = true;
    L12:
        if (r17 == false) goto L17;
        int index$iv = (i$iv << 3) + j$iv;
        int r18 = r12;
        if (r20.invoke(elements[index$iv]).booleanValue() == false) goto L18;
        removeElementAt(index$iv);
    L18:
        slot$iv = slot$iv >> r18;
        j$iv = j$iv + 1;
        r12 = r18;
        goto L7
    L17:
        r18 = r12;
        goto L18
    L11:
        r17 = false;
        goto L12
    L20:
        if (bitCount$iv == r12) goto L21;
        return;
    L21:
        if (i$iv == lastIndex$iv) goto L32;
        i$iv = i$iv + 1;
        goto L4
    L32:
        return;
    }

    public final boolean retainAll(Collection<? extends E> r20) {
        Collection<? extends E> r1 = r20;
        Intrinsics.checkNotNullParameter(r1, "elements");
        Object[] internalElements = this.elements;
        int startSize = this._size;
        MutableOrderedScatterSet<E> this_$iv = this;
        long[] m$iv = this_$iv.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 > lastIndex$iv) goto L25;
    L4:
        long slot$iv = m$iv[i$iv];
        if (((((~slot$iv) << 7) & slot$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L21;
        int r10 = 8;
        int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
        int j$iv = 0;
    L7:
        if (j$iv >= bitCount$iv) goto L20;
        long value$iv$iv = 255 & slot$iv;
        if (value$iv$iv >= 128) goto L11;
        boolean r14 = true;
    L12:
        if (r14 == false) goto L17;
        int index$iv = (i$iv << 3) + j$iv;
        int r17 = r10;
        if (CollectionsKt.contains(r1, internalElements[index$iv]) == true) goto L18;
        removeElementAt(index$iv);
    L18:
        slot$iv = slot$iv >> r17;
        j$iv = j$iv + 1;
        r1 = r20;
        r10 = r17;
        goto L7
    L17:
        r17 = r10;
        goto L18
    L11:
        r14 = false;
        goto L12
    L20:
        if (bitCount$iv != r10) goto L25;
    L21:
        if (i$iv == lastIndex$iv) goto L25;
        i$iv = i$iv + 1;
        r1 = r20;
    L25:
        if (startSize == this._size) goto L27;
        return true;
    L27:
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(OrderedScatterSet<E> r20) {
        Intrinsics.checkNotNullParameter(r20, "elements");
        Object[] internalElements = this.elements;
        int startSize = this._size;
        MutableOrderedScatterSet<E> this_$iv = this;
        long[] m$iv = this_$iv.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 > lastIndex$iv) goto L25;
    L4:
        long slot$iv = m$iv[i$iv];
        if (((((~slot$iv) << 7) & slot$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L21;
        int r10 = 8;
        int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
        int j$iv = 0;
    L7:
        if (j$iv >= bitCount$iv) goto L20;
        long value$iv$iv = 255 & slot$iv;
        if (value$iv$iv >= 128) goto L11;
        boolean r14 = true;
    L12:
        if (r14 == false) goto L17;
        int index$iv = (i$iv << 3) + j$iv;
        int r17 = r10;
        if (r20.contains(internalElements[index$iv]) == true) goto L18;
        removeElementAt(index$iv);
    L18:
        slot$iv = slot$iv >> r17;
        j$iv = j$iv + 1;
        r10 = r17;
        goto L7
    L17:
        r17 = r10;
        goto L18
    L11:
        r14 = false;
        goto L12
    L20:
        if (bitCount$iv != r10) goto L25;
    L21:
        if (i$iv == lastIndex$iv) goto L25;
        i$iv = i$iv + 1;
    L25:
        if (startSize == this._size) goto L27;
        return true;
    L27:
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(ScatterSet<E> r20) {
        Intrinsics.checkNotNullParameter(r20, "elements");
        Object[] internalElements = this.elements;
        int startSize = this._size;
        MutableOrderedScatterSet<E> this_$iv = this;
        long[] m$iv = this_$iv.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 > lastIndex$iv) goto L25;
    L4:
        long slot$iv = m$iv[i$iv];
        if (((((~slot$iv) << 7) & slot$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L21;
        int r10 = 8;
        int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
        int j$iv = 0;
    L7:
        if (j$iv >= bitCount$iv) goto L20;
        long value$iv$iv = 255 & slot$iv;
        if (value$iv$iv >= 128) goto L11;
        boolean r14 = true;
    L12:
        if (r14 == false) goto L17;
        int index$iv = (i$iv << 3) + j$iv;
        int r17 = r10;
        if (r20.contains(internalElements[index$iv]) == true) goto L18;
        removeElementAt(index$iv);
    L18:
        slot$iv = slot$iv >> r17;
        j$iv = j$iv + 1;
        r10 = r17;
        goto L7
    L17:
        r17 = r10;
        goto L18
    L11:
        r14 = false;
        goto L12
    L20:
        if (bitCount$iv != r10) goto L25;
    L21:
        if (i$iv == lastIndex$iv) goto L25;
        i$iv = i$iv + 1;
    L25:
        if (startSize == this._size) goto L27;
        return true;
    L27:
        return false;
    }

    public final boolean retainAll(Function1<? super E, Boolean> r21) {
        Intrinsics.checkNotNullParameter(r21, "predicate");
        Object[] elements = this.elements;
        int startSize = getSize();
        MutableOrderedScatterSet<E> this_$iv = this;
        long[] m$iv = this_$iv.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 > lastIndex$iv) goto L26;
    L4:
        long slot$iv = m$iv[i$iv];
        if (((((~slot$iv) << 7) & slot$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L22;
        int r11 = 8;
        int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
        int j$iv = 0;
    L7:
        if (j$iv >= bitCount$iv) goto L21;
        long value$iv$iv = 255 & slot$iv;
        if (value$iv$iv >= 128) goto L11;
        boolean r15 = true;
    L12:
        if (r15 == false) goto L18;
        int index$iv = (i$iv << 3) + j$iv;
        int r18 = r11;
        if (r21.invoke(elements[index$iv]).booleanValue() == true) goto L19;
        removeElementAt(index$iv);
    L19:
        slot$iv = slot$iv >> r18;
        j$iv = j$iv + 1;
        r11 = r18;
        goto L7
    L18:
        r18 = r11;
        goto L19
    L11:
        r15 = false;
        goto L12
    L21:
        if (bitCount$iv != r11) goto L26;
    L22:
        if (i$iv == lastIndex$iv) goto L26;
        i$iv = i$iv + 1;
    L26:
        if (startSize == getSize()) goto L28;
        return true;
    L28:
        return false;
    }

    public final void removeElementAt(int index) {
        this._size--;
        long[] data$iv = this.metadata;
        int capacity$iv = this._capacity;
        int i$iv$iv = index >> 3;
        int b$iv$iv = (index & 7) << 3;
        data$iv[i$iv$iv] = (data$iv[i$iv$iv] & (~(255 << b$iv$iv))) | (254 << b$iv$iv);
        int $i$f$writeRawMetadata = index - 7;
        int cloneIndex$iv = ($i$f$writeRawMetadata & capacity$iv) + (capacity$iv & 7);
        data$iv[cloneIndex$iv >> 3] = data$iv[index >> 3];
        this.elements[index] = null;
        long[] nodes$iv = this.nodes;
        long node$iv = nodes$iv[index];
        int previousIndex$iv = (int) ((node$iv >> 31) & SieveCacheKt.NodeLinkMask);
        int nextIndex$iv = (int) (node$iv & SieveCacheKt.NodeLinkMask);
        if (previousIndex$iv == Integer.MAX_VALUE) goto L5;
        long node$iv$iv = nodes$iv[previousIndex$iv];
        nodes$iv[previousIndex$iv] = (((long) nextIndex$iv) & SieveCacheKt.NodeLinkMask) | (SieveCacheKt.NodeMetaAndPreviousMask & node$iv$iv);
    L6:
        if (nextIndex$iv == Integer.MAX_VALUE) goto L8;
        long node$iv$iv2 = nodes$iv[nextIndex$iv];
        nodes$iv[nextIndex$iv] = (SieveCacheKt.NodeMetaAndNextMask & node$iv$iv2) | ((((long) previousIndex$iv) & SieveCacheKt.NodeLinkMask) << 31);
    L9:
        nodes$iv[index] = 4611686018427387903L;
        return;
    L8:
        this.tail = previousIndex$iv;
        goto L9
    L5:
        this.head = nextIndex$iv;
        goto L6
    }

    private final void moveNodeToHead(int index) {
        long[] r1 = this.nodes;
        int next$iv = this.head;
        r1[index] = (((long) next$iv) & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (this.head == Integer.MAX_VALUE) goto L5;
        long[] r2 = this.nodes;
        int r3 = this.head;
        long node$iv = this.nodes[this.head];
        r2[r3] = (SieveCacheKt.NodeMetaAndNextMask & node$iv) | ((((long) index) & SieveCacheKt.NodeLinkMask) << 31);
    L5:
        this.head = index;
        if (this.tail != Integer.MAX_VALUE) goto L9;
        this.tail = index;
        return;
    }

    private final void removeNode(int index) {
        long[] nodes = this.nodes;
        long node = nodes[index];
        int previousIndex = (int) ((node >> 31) & SieveCacheKt.NodeLinkMask);
        int nextIndex = (int) (node & SieveCacheKt.NodeLinkMask);
        if (previousIndex == Integer.MAX_VALUE) goto L5;
        long node$iv = nodes[previousIndex];
        long r14 = SieveCacheKt.NodeMetaAndPreviousMask & node$iv;
        nodes[previousIndex] = (((long) nextIndex) & SieveCacheKt.NodeLinkMask) | r14;
    L6:
        if (nextIndex == Integer.MAX_VALUE) goto L8;
        long node$iv2 = nodes[nextIndex];
        long node$iv3 = (SieveCacheKt.NodeMetaAndNextMask & node$iv2) | ((((long) previousIndex) & SieveCacheKt.NodeLinkMask) << 31);
        nodes[nextIndex] = node$iv3;
    L9:
        nodes[index] = 4611686018427387903L;
        return;
    L8:
        this.tail = previousIndex;
        goto L9
    L5:
        this.head = nextIndex;
        goto L6
    }

    public final void clear() {
        this._size = 0;
        if (this.metadata == ScatterMapKt.EmptyGroup) goto L5;
        ArraysKt.fill$default(this.metadata, -9187201950435737472L, 0, 0, 6, null);
        long[] data$iv = this.metadata;
        int offset$iv = this._capacity;
        int i$iv = offset$iv >> 3;
        int b$iv = (offset$iv & 7) << 3;
        data$iv[i$iv] = (data$iv[i$iv] & (~(255 << b$iv))) | (255 << b$iv);
    L5:
        ArraysKt.fill(this.elements, null, 0, this._capacity);
        ArraysKt.fill$default(this.nodes, 4611686018427387903L, 0, 0, 6, null);
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
        initializeGrowth();
    }

    private final int findAbsoluteInsertIndex(E r25) {
        if (r25 == null) goto L5;
        int r4 = r25.hashCode();
    L6:
        int hash$iv = r4 * ScatterMapKt.MurmurHashC1;
        int hash = hash$iv ^ (hash$iv << 16);
        int hash1 = hash >>> 7;
        int $i$f$h2 = hash & WorkQueueKt.MASK;
        int probeMask = this._capacity;
        int probeOffset = hash1 & probeMask;
        int probeIndex = 0;
    L7:
        long[] metadata$iv = this.metadata;
        int i$iv = probeOffset >> 3;
        int b$iv = (probeOffset & 7) << 3;
        int hash2 = hash1;
        long g = (((-b$iv) >> 63) & (metadata$iv[i$iv + 1] << (64 - b$iv))) | (metadata$iv[i$iv] >>> b$iv);
        long x$iv = (((long) $i$f$h2) * ScatterMapKt.BitmaskLsb) ^ g;
        int hash3 = hash;
        long m = ((~x$iv) & (x$iv - ScatterMapKt.BitmaskLsb)) & (-9187201950435737472L);
    L8:
        long $this$hasNext$iv = m;
        if ($this$hasNext$iv == 0) goto L11;
        int $i$f$hasNext = 1;
    L12:
        if ($i$f$hasNext == 0) goto L17;
        long $this$get$iv = m;
        int index = ((Long.numberOfTrailingZeros($this$get$iv) >> 3) + probeOffset) & probeMask;
        if (Intrinsics.areEqual(this.elements[index], r25) == true) goto L15;
        long $this$next$iv = m;
        m = $this$next$iv & ($this$next$iv - 1);
        goto L8
    L15:
        return index;
    L17:
        long $this$maskEmpty$iv = (((~g) << 6) & g) & (-9187201950435737472L);
        if ($this$maskEmpty$iv != 0) goto L19;
        hash1 = hash2;
        probeIndex = probeIndex + 8;
        probeOffset = (probeOffset + probeIndex) & probeMask;
        hash = hash3;
        goto L7
    L19:
        int index2 = findFirstAvailableSlot(hash2);
        if (this.growthLimit == 0) goto L22;
    L27:
        this._size++;
        int r3 = this.growthLimit;
        if (((this.metadata[index2 >> 3] >> ((index2 & 7) << 3)) & 255) != 128) goto L30;
        int r17 = 1;
    L31:
        this.growthLimit = r3 - r17;
        long[] data$iv = this.metadata;
        int capacity$iv = this._capacity;
        long value$iv = $i$f$h2;
        int i$iv$iv = index2 >> 3;
        int b$iv$iv = (index2 & 7) << 3;
        data$iv[i$iv$iv] = (data$iv[i$iv$iv] & (~(255 << b$iv$iv))) | (value$iv << b$iv$iv);
        int cloneIndex$iv = ((index2 - 7) & capacity$iv) + (capacity$iv & 7);
        data$iv[cloneIndex$iv >> 3] = data$iv[index2 >> 3];
        return index2;
    L30:
        r17 = 0;
        goto L31
    L22:
        if (((this.metadata[index2 >> 3] >> ((index2 & 7) << 3)) & 255) != 254) goto L24;
        boolean r5 = true;
    L25:
        if (r5 == true) goto L27;
        adjustStorage$collection();
        index2 = findFirstAvailableSlot(hash2);
        goto L27
    L24:
        r5 = false;
        goto L25
    L11:
        $i$f$hasNext = 0;
        goto L12
    L5:
        r4 = 0;
        goto L6
    }

    private final int findFirstAvailableSlot(int hash1) {
        int probeMask = this._capacity;
        int probeOffset = hash1 & probeMask;
        int probeIndex = 0;
    L3:
        long[] metadata$iv = this.metadata;
        int i$iv = probeOffset >> 3;
        int b$iv = (probeOffset & 7) << 3;
        long g = (metadata$iv[i$iv] >>> b$iv) | ((metadata$iv[i$iv + 1] << (64 - b$iv)) & ((-b$iv) >> 63));
        long $this$maskEmptyOrDeleted$iv = (((~g) << 7) & g) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv != 0) goto L6;
        probeIndex = probeIndex + 8;
        probeOffset = (probeOffset + probeIndex) & probeMask;
        goto L3
    L6:
        return ((Long.numberOfTrailingZeros($this$maskEmptyOrDeleted$iv) >> 3) + probeOffset) & probeMask;
    }

    public final int trim() {
        int previousCapacity = this._capacity;
        int newCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (newCapacity >= previousCapacity) goto L6;
        resizeStorage$collection(newCapacity);
        return previousCapacity - this._capacity;
    L6:
        return 0;
    }

    public final void trimToSize(int maxSize) {
        long[] nodes = this.nodes;
        int candidate = this.head;
    L4:
        if (candidate == Integer.MAX_VALUE) goto L10;
        if (this._size <= maxSize) goto L14;
        if (this._size == 0) goto L15;
        long $this$nextNode$iv = nodes[candidate];
        int nextNode = (int) (SieveCacheKt.NodeLinkMask & $this$nextNode$iv);
        removeElementAt(candidate);
        candidate = nextNode;
        goto L4
    L15:
        return;
    L14:
        return;
    }

    public final void adjustStorage$collection() {
        if (this._capacity > 8) goto L5;
    L7:
        resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
        return;
    L5:
        if (Long.compareUnsigned(ULong.m7599constructorimpl(ULong.m7599constructorimpl(this._size) * 32), ULong.m7599constructorimpl(ULong.m7599constructorimpl(this._capacity) * 25)) > 0) goto L7;
        dropDeletes$collection();
    }

    public final void dropDeletes$collection() {
        long[] metadata = this.metadata;
        if (metadata != null) goto L5;
        return;
    L5:
        int capacity = this._capacity;
        Object[] elements = this.elements;
        long[] nodes = this.nodes;
        long[] indexMapping = new long[capacity];
        long r6 = 9223372034707292159L;
        int newProbeIndex = 0;
        ArraysKt.fill(indexMapping, 9223372034707292159L, 0, capacity);
        int end$iv = (capacity + 7) >> 3;
        int i$iv = 0;
    L6:
        if (i$iv >= end$iv) goto L8;
        long maskedGroup$iv = metadata[i$iv] & (-9187201950435737472L);
        metadata[i$iv] = ((~maskedGroup$iv) + (maskedGroup$iv >>> 7)) & (-72340172838076674L);
        i$iv = i$iv + 1;
        goto L6
    L8:
        int lastIndex$iv = ArraysKt.getLastIndex(metadata);
        metadata[lastIndex$iv - 1] = (metadata[lastIndex$iv - 1] & 72057594037927935L) | (-72057594037927936L);
        metadata[lastIndex$iv] = metadata[0];
        int index = 0;
    L9:
        if (index == capacity) goto L39;
        long m = (metadata[index >> 3] >> ((index & 7) << 3)) & 255;
        if (m == 128) goto L12;
        if (m != 254) goto L15;
        Object k$iv = elements[index];
        if (k$iv == null) goto L19;
        int r18 = k$iv.hashCode();
    L20:
        int hash$iv = r18 * ScatterMapKt.MurmurHashC1;
        int hash = hash$iv ^ (hash$iv << 16);
        int $i$f$h1 = hash >>> 7;
        long r19 = r6;
        int targetIndex = findFirstAvailableSlot($i$f$h1);
        int probeOffset = $i$f$h1 & capacity;
        int r21 = newProbeIndex;
        int newProbeIndex2 = ((targetIndex - probeOffset) & capacity) / 8;
        int oldProbeIndex = ((index - probeOffset) & capacity) / 8;
        if (newProbeIndex2 == oldProbeIndex) goto L22;
        int capacity2 = capacity;
        Object[] elements2 = elements;
        if (((metadata[targetIndex >> 3] >> ((targetIndex & 7) << 3)) & 255) != 128) goto L33;
        int $i$f$h2 = hash & WorkQueueKt.MASK;
        long value$iv = $i$f$h2;
        int i$iv2 = targetIndex >> 3;
        int b$iv = (targetIndex & 7) << 3;
        metadata[i$iv2] = (metadata[i$iv2] & (~(255 << b$iv))) | (value$iv << b$iv);
        int i$iv3 = index >> 3;
        int b$iv2 = (index & 7) << 3;
        metadata[i$iv3] = (metadata[i$iv3] & (~(255 << b$iv2))) | (128 << b$iv2);
        elements2[targetIndex] = elements2[index];
        elements2[index] = null;
        nodes[targetIndex] = nodes[index];
        nodes[index] = 4611686018427387903L;
        long mapping = indexMapping[index];
        int src = (int) ((mapping >> 32) & 4294967295L);
        if (src == Integer.MAX_VALUE) goto L31;
        long mapping$iv = indexMapping[src];
        indexMapping[src] = targetIndex | (mapping$iv & (-4294967296L));
        long mapping$iv2 = indexMapping[index];
        indexMapping[index] = (mapping$iv2 & 4294967295L) | (-4294967296L);
    L32:
        indexMapping[targetIndex] = (((long) index) << 32) | ((long) Integer.MAX_VALUE);
    L38:
        metadata[metadata.length - 1] = metadata[r21];
        index = index + 1;
        nodes = nodes;
        capacity = capacity2;
        r6 = r19;
        newProbeIndex = r21;
        elements = elements2;
        goto L9
    L31:
        indexMapping[index] = (((long) Integer.MAX_VALUE) << 32) | ((long) targetIndex);
        goto L32
    L33:
        int $i$f$h3 = hash & WorkQueueKt.MASK;
        long value$iv2 = $i$f$h3;
        int i$iv4 = targetIndex >> 3;
        int b$iv3 = (targetIndex & 7) << 3;
        metadata[i$iv4] = ((~(255 << b$iv3)) & metadata[i$iv4]) | (value$iv2 << b$iv3);
        Object oldElement = elements2[targetIndex];
        elements2[targetIndex] = elements2[index];
        elements2[index] = oldElement;
        long oldNode = nodes[targetIndex];
        nodes[targetIndex] = nodes[index];
        nodes[index] = oldNode;
        long mapping2 = indexMapping[index];
        int src2 = (int) ((mapping2 >> 32) & 4294967295L);
        if (src2 == Integer.MAX_VALUE) goto L36;
        long mapping$iv3 = indexMapping[src2];
        indexMapping[src2] = (mapping$iv3 & (-4294967296L)) | ((long) targetIndex);
        long mapping$iv4 = indexMapping[index];
        long mapping$iv5 = targetIndex;
        indexMapping[index] = (mapping$iv5 << 32) | (mapping$iv4 & 4294967295L);
        int src3 = src2;
    L37:
        indexMapping[targetIndex] = (((long) src3) << 32) | ((long) index);
        index = index - 1;
        goto L38
    L36:
        indexMapping[index] = (((long) targetIndex) << 32) | ((long) targetIndex);
        src3 = index;
        goto L37
    L22:
        int $i$f$h4 = hash & WorkQueueKt.MASK;
        int capacity3 = capacity;
        Object[] elements3 = elements;
        long value$iv3 = $i$f$h4;
        int i$iv5 = index >> 3;
        int b$iv4 = (index & 7) << 3;
        metadata[i$iv5] = (metadata[i$iv5] & (~(255 << b$iv4))) | (value$iv3 << b$iv4);
        long value$iv4 = indexMapping[index];
        if (value$iv4 != r19) goto L25;
        indexMapping[index] = index | (((long) index) << 32);
    L25:
        metadata[metadata.length - 1] = metadata[r21];
        index = index + 1;
        capacity = capacity3;
        r6 = r19;
        newProbeIndex = r21;
        elements = elements3;
        goto L9
    L19:
        r18 = newProbeIndex;
        goto L20
    L15:
        index = index + 1;
        goto L9
    L12:
        index = index + 1;
        goto L9
    L39:
        initializeGrowth();
        fixupNodes(indexMapping);
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] previousMetadata = this.metadata;
        Object[] previousElements = this.elements;
        long[] previousNodes = this.nodes;
        int previousCapacity = this._capacity;
        int[] indexMapping = new int[previousCapacity];
        initializeStorage(newCapacity);
        long[] newMetadata = this.metadata;
        Object[] newElements = this.elements;
        long[] newNodes = this.nodes;
        int capacity = this._capacity;
        int i = 0;
    L3:
        if (i >= previousCapacity) goto L15;
        int r13 = 0;
        if (((previousMetadata[i >> 3] >> ((i & 7) << 3)) & 255) >= 128) goto L7;
        boolean r12 = true;
    L8:
        if (r12 == false) goto L14;
        Object previousKey = previousElements[i];
        if (previousKey == null) goto L12;
        r13 = previousKey.hashCode();
    L12:
        int hash$iv = r13 * ScatterMapKt.MurmurHashC1;
        int $i$f$hash = hash$iv ^ (hash$iv << 16);
        int $i$f$h1 = $i$f$hash >>> 7;
        int index = findFirstAvailableSlot($i$f$h1);
        int $i$f$h2 = $i$f$hash & WorkQueueKt.MASK;
        long value$iv = $i$f$h2;
        int i$iv$iv = index >> 3;
        int b$iv$iv = (index & 7) << 3;
        long value$iv2 = 255 << b$iv$iv;
        newMetadata[i$iv$iv] = (newMetadata[i$iv$iv] & (~value$iv2)) | (value$iv << b$iv$iv);
        int cloneIndex$iv = ((index - 7) & capacity) + (capacity & 7);
        newMetadata[cloneIndex$iv >> 3] = newMetadata[index >> 3];
        newElements[index] = previousKey;
        newNodes[index] = previousNodes[i];
        indexMapping[i] = index;
    L14:
        i = i + 1;
        previousMetadata = previousMetadata;
        previousElements = previousElements;
        goto L3
    L7:
        r12 = false;
        goto L8
    L15:
        fixupNodes(indexMapping);
    }

    private final void fixupNodes(long[] mapping) {
        long[] nodes = this.nodes;
        int i = 0;
        int r3 = nodes.length;
    L3:
        int $i$f$getDst = Integer.MAX_VALUE;
        if (i >= r3) goto L14;
        long node = nodes[i];
        int previous = (int) ((node >> 31) & SieveCacheKt.NodeLinkMask);
        int next = (int) (node & SieveCacheKt.NodeLinkMask);
        long r13 = SieveCacheKt.NodeMetaMask & node;
        if (previous != Integer.MAX_VALUE) goto L8;
        int r4 = Integer.MAX_VALUE;
        long r18 = 4294967295L;
    L9:
        long r5 = (((long) r4) | r13) << 31;
        if (next == Integer.MAX_VALUE) goto L13;
        long $this$dst$iv$iv = mapping[next];
        $i$f$getDst = (int) ($this$dst$iv$iv & r18);
    L13:
        long $this$dst$iv$iv2 = $i$f$getDst;
        nodes[i] = r5 | $this$dst$iv$iv2;
        i = i + 1;
        goto L3
    L8:
        long $this$dst$iv$iv3 = mapping[previous];
        r18 = 4294967295L;
        r4 = (int) ($this$dst$iv$iv3 & 4294967295L);
        goto L9
    L14:
        int i2 = this.head;
        if (i2 == Integer.MAX_VALUE) goto L18;
        long $this$dst$iv = mapping[this.head];
        this.head = (int) ($this$dst$iv & 4294967295L);
    L18:
        if (this.tail == Integer.MAX_VALUE) goto L24;
        long $this$dst$iv2 = mapping[this.tail];
        this.tail = (int) ($this$dst$iv2 & 4294967295L);
        return;
    }

    private final void fixupNodes(int[] mapping) {
        long[] nodes = this.nodes;
        int i = 0;
        int r2 = nodes.length;
    L3:
        int r3 = Integer.MAX_VALUE;
        if (i >= r2) goto L14;
        long node = nodes[i];
        int previous = (int) ((node >> 31) & SieveCacheKt.NodeLinkMask);
        int next = (int) (node & SieveCacheKt.NodeLinkMask);
        long r10 = SieveCacheKt.NodeMetaMask & node;
        if (previous != Integer.MAX_VALUE) goto L8;
        int r12 = Integer.MAX_VALUE;
    L9:
        long r9 = (r10 | ((long) r12)) << 31;
        if (next == Integer.MAX_VALUE) goto L13;
        r3 = mapping[next];
    L13:
        nodes[i] = r9 | ((long) r3);
        i = i + 1;
        goto L3
    L8:
        r12 = mapping[previous];
        goto L9
    L14:
        int i2 = this.head;
        if (i2 == Integer.MAX_VALUE) goto L18;
        this.head = mapping[this.head];
    L18:
        if (this.tail == Integer.MAX_VALUE) goto L24;
        this.tail = mapping[this.tail];
        return;
    }

    public final Set<E> asMutableSet() {
        return new MutableOrderedSetWrapper(this);
    }
}
