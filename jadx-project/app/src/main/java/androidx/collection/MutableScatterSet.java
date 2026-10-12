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

/* JADX INFO: compiled from: ScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rJ\u0014\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u0014\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u001b\u0010\u000b\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0002\u0010\u0010J\u0014\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0014\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\r\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017J\u0006\u0010\u0018\u001a\u00020\u0014J\r\u0010\u0019\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u001aJ\u0015\u0010\u001b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0004H\u0002J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0016\u0010#\u001a\u00020\u00142\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010$J\u0017\u0010#\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0086\u0002J\u0017\u0010#\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0086\u0002J\u0017\u0010#\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002J\u001e\u0010#\u001a\u00020\u00142\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000fH\u0086\u0002¢\u0006\u0002\u0010%J\u0017\u0010#\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0086\u0002J\u0017\u0010#\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\u0002J\u0016\u0010&\u001a\u00020\u00142\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010$J\u0017\u0010&\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0086\u0002J\u0017\u0010&\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0086\u0002J\u0017\u0010&\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002J\u001e\u0010&\u001a\u00020\u00142\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000fH\u0086\u0002¢\u0006\u0002\u0010%J\u0017\u0010&\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0086\u0002J\u0017\u0010&\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\u0002J\u0013\u0010'\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0002\u0010\nJ\u0014\u0010(\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rJ\u0014\u0010(\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u0014\u0010(\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u001b\u0010(\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0002\u0010\u0010J\u0014\u0010(\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0014\u0010(\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\u0010\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u0004H\u0001J \u0010+\u001a\u00020\u00142\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0-H\u0086\bø\u0001\u0000J\u0015\u0010.\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u0004H\u0000¢\u0006\u0002\b0J\u001a\u00101\u001a\u00020\b2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0-J\u0014\u00101\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u0014\u00101\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u00101\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u000002J\b\u00103\u001a\u00020\u0004H\u0007R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00064"}, d2 = {"Landroidx/collection/MutableScatterSet;", "E", "Landroidx/collection/ScatterSet;", "initialCapacity", "", "(I)V", "growthLimit", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "elements", "Landroidx/collection/ObjectList;", "Landroidx/collection/OrderedScatterSet;", "", "([Ljava/lang/Object;)Z", "", "Lkotlin/sequences/Sequence;", "adjustStorage", "", "adjustStorage$collection", "asMutableSet", "", "clear", "dropDeletes", "dropDeletes$collection", "findAbsoluteInsertIndex", "(Ljava/lang/Object;)I", "findFirstAvailableSlot", "hash1", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "(Ljava/lang/Object;)V", "([Ljava/lang/Object;)V", "plusAssign", "remove", "removeAll", "removeElementAt", "index", "removeIf", "predicate", "Lkotlin/Function1;", "resizeStorage", "newCapacity", "resizeStorage$collection", "retainAll", "", "trim", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableScatterSet<E> extends ScatterSet<E> {
    private int growthLimit;

    public MutableScatterSet() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public MutableScatterSet(int initialCapacity) {
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

    public /* synthetic */ MutableScatterSet(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 6;
    L5:
        this(r1);
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
        return;
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
        long[] $this$initializeMetadata_u24lambda_u241 = new long[size];
        ArraysKt.fill$default($this$initializeMetadata_u24lambda_u241, -9187201950435737472L, 0, 0, 6, null);
        r0 = $this$initializeMetadata_u24lambda_u241;
        goto L5
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    public final boolean add(E r4) {
        int oldSize = getSize();
        int index = findAbsoluteInsertIndex(r4);
        this.elements[index] = r4;
        if (getSize() == oldSize) goto L5;
        return true;
    L5:
        return false;
    }

    public final void plusAssign(E r3) {
        int index = findAbsoluteInsertIndex(r3);
        this.elements[index] = r3;
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

    public final boolean addAll(ScatterSet<E> r3) {
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
        MutableScatterSet<E> this_$iv = this;
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
        MutableScatterSet<E> this_$iv = this;
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

    public final boolean removeAll(ScatterSet<E> r3) {
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
        MutableScatterSet<E> this_$iv = this;
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
        MutableScatterSet<E> this_$iv = this;
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
    public final boolean retainAll(ScatterSet<E> r20) {
        Intrinsics.checkNotNullParameter(r20, "elements");
        Object[] internalElements = this.elements;
        int startSize = this._size;
        MutableScatterSet<E> this_$iv = this;
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
    public final boolean retainAll(OrderedScatterSet<E> r20) {
        Intrinsics.checkNotNullParameter(r20, "elements");
        Object[] internalElements = this.elements;
        int startSize = this._size;
        MutableScatterSet<E> this_$iv = this;
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

    public final boolean retainAll(Function1<? super E, Boolean> r20) {
        Intrinsics.checkNotNullParameter(r20, "predicate");
        Object[] elements = this.elements;
        int startSize = this._size;
        MutableScatterSet<E> this_$iv = this;
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
        if (r20.invoke(elements[index$iv]).booleanValue() == true) goto L18;
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
        MutableScatterSet<E> r0 = this;
        long[] metadata = r0.metadata;
        int capacity = r0._capacity;
        Object[] elements = r0.elements;
        int end$iv = (capacity + 7) >> 3;
        int i$iv = 0;
    L3:
        if (i$iv >= end$iv) goto L5;
        long maskedGroup$iv = metadata[i$iv] & (-9187201950435737472L);
        metadata[i$iv] = ((~maskedGroup$iv) + (maskedGroup$iv >>> 7)) & (-72340172838076674L);
        i$iv = i$iv + 1;
        goto L3
    L5:
        int lastIndex$iv = ArraysKt.getLastIndex(metadata);
        long r10 = 72057594037927935L;
        metadata[lastIndex$iv - 1] = (metadata[lastIndex$iv - 1] & 72057594037927935L) | (-72057594037927936L);
        int newProbeIndex = 0;
        metadata[lastIndex$iv] = metadata[0];
        int index = 0;
    L6:
        if (index == capacity) goto L25;
        long m = (metadata[index >> 3] >> ((index & 7) << 3)) & 255;
        if (m == 128) goto L9;
        if (m != 254) goto L12;
        Object k$iv = elements[index];
        if (k$iv == null) goto L16;
        int r16 = k$iv.hashCode();
    L17:
        int hash$iv = r16 * ScatterMapKt.MurmurHashC1;
        int hash = hash$iv ^ (hash$iv << 16);
        int $i$f$h1 = hash >>> 7;
        int targetIndex = r0.findFirstAvailableSlot($i$f$h1);
        int probeOffset = $i$f$h1 & capacity;
        int r19 = newProbeIndex;
        int newProbeIndex2 = ((targetIndex - probeOffset) & capacity) / 8;
        int oldProbeIndex = ((index - probeOffset) & capacity) / 8;
        if (newProbeIndex2 == oldProbeIndex) goto L19;
        long r24 = r10;
        if (((metadata[targetIndex >> 3] >> ((targetIndex & 7) << 3)) & 255) != 128) goto L23;
        int $i$f$h2 = hash & WorkQueueKt.MASK;
        long value$iv = $i$f$h2;
        int i$iv2 = targetIndex >> 3;
        int b$iv = (targetIndex & 7) << 3;
        long[] metadata2 = metadata;
        metadata2[i$iv2] = (metadata[i$iv2] & (~(255 << b$iv))) | (value$iv << b$iv);
        int i$iv3 = index >> 3;
        int b$iv2 = (index & 7) << 3;
        long value$iv2 = 255 << b$iv2;
        metadata2[i$iv3] = (metadata2[i$iv3] & (~value$iv2)) | (128 << b$iv2);
        elements[targetIndex] = elements[index];
        elements[index] = null;
    L24:
        metadata2[ArraysKt.getLastIndex(metadata2)] = (metadata2[r19] & r24) | Long.MIN_VALUE;
        index = index + 1;
        r0 = this;
        newProbeIndex = r19;
        r10 = r24;
        metadata = metadata2;
        goto L6
    L23:
        metadata2 = metadata;
        int $i$f$h3 = hash & WorkQueueKt.MASK;
        long value$iv3 = $i$f$h3;
        int i$iv4 = targetIndex >> 3;
        int b$iv3 = (targetIndex & 7) << 3;
        metadata2[i$iv4] = (metadata2[i$iv4] & (~(255 << b$iv3))) | (value$iv3 << b$iv3);
        Object oldElement = elements[targetIndex];
        elements[targetIndex] = elements[index];
        elements[index] = oldElement;
        index = index - 1;
        goto L24
    L19:
        int $i$f$h4 = hash & WorkQueueKt.MASK;
        long r25 = r10;
        long value$iv4 = $i$f$h4;
        int i$iv5 = index >> 3;
        int b$iv4 = (index & 7) << 3;
        metadata[i$iv5] = (metadata[i$iv5] & (~(255 << b$iv4))) | (value$iv4 << b$iv4);
        metadata[ArraysKt.getLastIndex(metadata)] = (metadata[r19] & r25) | Long.MIN_VALUE;
        index = index + 1;
        newProbeIndex = r19;
        r10 = r25;
        goto L6
    L16:
        r16 = newProbeIndex;
        goto L17
    L12:
        index = index + 1;
        goto L6
    L9:
        index = index + 1;
        goto L6
    L25:
        initializeGrowth();
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] previousMetadata = this.metadata;
        Object[] previousElements = this.elements;
        int previousCapacity = this._capacity;
        initializeStorage(newCapacity);
        long[] newMetadata = this.metadata;
        Object[] newElements = this.elements;
        int capacity = this._capacity;
        int i = 0;
    L3:
        if (i >= previousCapacity) goto L14;
        int r10 = 0;
        if (((previousMetadata[i >> 3] >> ((i & 7) << 3)) & 255) >= 128) goto L7;
        boolean r9 = true;
    L8:
        if (r9 == false) goto L13;
        Object previousElement = previousElements[i];
        if (previousElement == null) goto L12;
        r10 = previousElement.hashCode();
    L12:
        int hash$iv = r10 * ScatterMapKt.MurmurHashC1;
        int $i$f$hash = hash$iv ^ (hash$iv << 16);
        int $i$f$h1 = $i$f$hash >>> 7;
        int index = findFirstAvailableSlot($i$f$h1);
        int $i$f$h2 = $i$f$hash & WorkQueueKt.MASK;
        long value$iv = $i$f$h2;
        int i$iv$iv = index >> 3;
        int b$iv$iv = (index & 7) << 3;
        newMetadata[i$iv$iv] = (newMetadata[i$iv$iv] & (~(255 << b$iv$iv))) | (value$iv << b$iv$iv);
        int cloneIndex$iv = ((index - 7) & capacity) + (capacity & 7);
        newMetadata[cloneIndex$iv >> 3] = newMetadata[index >> 3];
        newElements[index] = previousElement;
    L13:
        i = i + 1;
        goto L3
    L7:
        r9 = false;
        goto L8
    }

    public final Set<E> asMutableSet() {
        return new MutableSetWrapper(this);
    }
}
