package androidx.collection;

import androidx.autofill.HintConstants;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nJ\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fJ\u0006\u0010\r\u001a\u00020\tJS\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00028\u000028\u0010\u0010\u001a4\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u000f\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00028\u00010\u0011H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0015J\r\u0010\u0016\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0017J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0002J\u0015\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u0000H\u0001¢\u0006\u0002\u0010\u001bJ'\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001eH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\tH\u0002J\u0010\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0005H\u0002J\u0010\u0010#\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0016\u0010$\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00028\u0000H\u0086\n¢\u0006\u0002\u0010%J\u0017\u0010$\u001a\u00020\t2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0086\nJ\u0017\u0010$\u001a\u00020\t2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0086\nJ\u001e\u0010$\u001a\u00020\t2\u000e\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000)H\u0086\n¢\u0006\u0002\u0010*J\u0017\u0010$\u001a\u00020\t2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0086\nJ\u0017\u0010$\u001a\u00020\t2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0086\nJ\u001d\u0010-\u001a\u00020\t2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0086\nJ*\u0010-\u001a\u00020\t2\u001a\u0010/\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001000)H\u0086\n¢\u0006\u0002\u00101J\u001d\u0010-\u001a\u00020\t2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100H\u0086\nJ#\u0010-\u001a\u00020\t2\u0018\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001000+H\u0086\nJ\u001d\u0010-\u001a\u00020\t2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000103H\u0086\nJ#\u0010-\u001a\u00020\t2\u0018\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001000,H\u0086\nJ\u001d\u00104\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0001¢\u0006\u0002\u00105J\u001a\u00106\u001a\u00020\t2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003J'\u00106\u001a\u00020\t2\u001a\u0010/\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001000)¢\u0006\u0002\u00101J \u00106\u001a\u00020\t2\u0018\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001000+J\u001a\u00106\u001a\u00020\t2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000103J \u00106\u001a\u00020\t2\u0018\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001000,J\u0015\u00107\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0002\u00108J\u001b\u00107\u001a\u0002092\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0001¢\u0006\u0002\u0010:J&\u0010;\u001a\u00020\t2\u0018\u0010<\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002090\u0011H\u0086\bø\u0001\u0000J\u0017\u0010=\u001a\u0004\u0018\u00018\u00012\u0006\u0010>\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010?J\u0015\u0010@\u001a\u00020\t2\u0006\u0010A\u001a\u00020\u0005H\u0000¢\u0006\u0002\bBJ\u001e\u0010C\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0002\u0010DJ\u0006\u0010E\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006F"}, d2 = {"Landroidx/collection/MutableScatterMap;", "K", "V", "Landroidx/collection/ScatterMap;", "initialCapacity", "", "(I)V", "growthLimit", "adjustStorage", "", "adjustStorage$collection", "asMutableMap", "", "clear", "compute", "key", "computeBlock", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "value", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "dropDeletes", "dropDeletes$collection", "findFirstAvailableSlot", "hash1", "findInsertIndex", "(Ljava/lang/Object;)I", "getOrPut", "defaultValue", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "(Ljava/lang/Object;)V", "keys", "Landroidx/collection/ObjectList;", "Landroidx/collection/ScatterSet;", "", "([Ljava/lang/Object;)V", "", "Lkotlin/sequences/Sequence;", "plusAssign", "from", "pairs", "Lkotlin/Pair;", "([Lkotlin/Pair;)V", "pair", "", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeIf", "predicate", "removeValueAt", "index", "(I)Ljava/lang/Object;", "resizeStorage", "newCapacity", "resizeStorage$collection", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "trim", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableScatterMap<K, V> extends ScatterMap<K, V> {
    private int growthLimit;

    public MutableScatterMap() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public /* synthetic */ MutableScatterMap(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 6;
    L5:
        this(r1);
    }

    public MutableScatterMap(int initialCapacity) {
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
        this.keys = r1;
        if (newCapacity != 0) goto L12;
        Object[] r2 = ContainerHelpersKt.EMPTY_OBJECTS;
    L13:
        this.values = r2;
        return;
    L12:
        r2 = new Object[newCapacity];
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
        initializeGrowth();
        return;
    L4:
        int size = ((((capacity + 1) + 7) + 7) & (-8)) >> 3;
        long[] $this$initializeMetadata_u24lambda_u241 = new long[size];
        ArraysKt.fill$default($this$initializeMetadata_u24lambda_u241, -9187201950435737472L, 0, 0, 6, null);
        int i$iv = capacity >> 3;
        int b$iv = (capacity & 7) << 3;
        $this$initializeMetadata_u24lambda_u241[i$iv] = ($this$initializeMetadata_u24lambda_u241[i$iv] & (~(255 << b$iv))) | (255 << b$iv);
        r0 = $this$initializeMetadata_u24lambda_u241;
        goto L5
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    public final V getOrPut(K r5, Function0<? extends V> r6) {
        Intrinsics.checkNotNullParameter(r6, "defaultValue");
        V r1 = get(r5);
        if (r1 != null) goto L6;
        V r2 = r6.invoke();
        set(r5, r2);
        return r2;
    L6:
        return r1;
    }

    public final V compute(K r7, Function2<? super K, ? super V, ? extends V> r8) {
        Intrinsics.checkNotNullParameter(r8, "computeBlock");
        int index = findInsertIndex(r7);
        if (index >= 0) goto L5;
        boolean inserting = true;
    L6:
        if (inserting == false) goto L8;
        Object r3 = null;
    L9:
        V r4 = r8.invoke(r7, r3);
        if (inserting == false) goto L12;
        int insertionIndex = ~index;
        this.keys[insertionIndex] = r7;
        this.values[insertionIndex] = r4;
    L13:
        return r4;
    L12:
        this.values[index] = r4;
        goto L13
    L8:
        r3 = this.values[index];
        goto L9
    L5:
        inserting = false;
        goto L6
    }

    public final void set(K r4, V r5) {
        int index = findInsertIndex(r4);
        if (index >= 0) goto L5;
        index = ~index;
    L5:
        this.keys[index] = r4;
        this.values[index] = r5;
    }

    public final V put(K r4, V r5) {
        int r0 = findInsertIndex(r4);
        if (r0 >= 0) goto L5;
        r0 = ~r0;
    L5:
        V r1 = (V) this.values[r0];
        this.keys[r0] = r4;
        this.values[r0] = r5;
        return r1;
    }

    public final void putAll(Pair<? extends K, ? extends V>[] r5) {
        Intrinsics.checkNotNullParameter(r5, "pairs");
        int r0 = r5.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        Pair<? extends K, ? extends V> r2 = r5[r1];
        set(r2.component1(), r2.component2());
        r1 = r1 + 1;
        goto L3
    }

    public final void putAll(Iterable<? extends Pair<? extends K, ? extends V>> r4) {
        Intrinsics.checkNotNullParameter(r4, "pairs");
        Iterator<? extends Pair<? extends K, ? extends V>> r0 = r4.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        Pair<? extends K, ? extends V> r1 = r0.next();
        set(r1.component1(), r1.component2());
        goto L4
    }

    public final void putAll(Sequence<? extends Pair<? extends K, ? extends V>> r4) {
        Intrinsics.checkNotNullParameter(r4, "pairs");
        Iterator<? extends Pair<? extends K, ? extends V>> r0 = r4.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        Pair<? extends K, ? extends V> r1 = r0.next();
        set(r1.component1(), r1.component2());
        goto L4
    }

    public final void putAll(Map<K, ? extends V> r8) {
        Intrinsics.checkNotNullParameter(r8, "from");
        Iterator<Map.Entry<K, ? extends V>> r2 = r8.entrySet().iterator();
    L4:
        if (r2.hasNext() == false) goto L7;
        Map.Entry<K, ? extends V> r3 = r2.next();
        set(r3.getKey(), r3.getValue());
        goto L4
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(ScatterMap<K, V> r22) {
        Intrinsics.checkNotNullParameter(r22, "from");
        ScatterMap<K, V> r0 = r22;
        int $i$f$forEach = 0;
        Object[] k$iv = r0.keys;
        Object[] v$iv = r0.values;
        long[] m$iv$iv = r0.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L25;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        ScatterMap<K, V> r15 = r0;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L19;
        int r1 = 8;
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
        Object key = k$iv[index$iv$iv];
        Object value = v$iv[index$iv$iv];
        set(key, value);
    L15:
        slot$iv$iv = slot$iv$iv >> r1;
        j$iv$iv = j$iv$iv + 1;
        r1 = r1;
        $i$f$forEach = $i$f$forEach;
        k$iv = k$iv;
        goto L7
    L11:
        r17 = false;
        goto L12
    L16:
        int $i$f$forEach2 = $i$f$forEach;
        Object[] k$iv2 = k$iv;
        if (bitCount$iv$iv != r1) goto L31;
    L20:
        if (i$iv$iv == lastIndex$iv$iv) goto L32;
        i$iv$iv = i$iv$iv + 1;
        r0 = r15;
        $i$f$forEach = $i$f$forEach2;
        k$iv = k$iv2;
        goto L4
    L32:
        return;
    L31:
        return;
    L19:
        $i$f$forEach2 = $i$f$forEach;
        k$iv2 = k$iv;
        goto L20
    }

    public final void plusAssign(Pair<? extends K, ? extends V> r4) {
        Intrinsics.checkNotNullParameter(r4, "pair");
        set(r4.getFirst(), r4.getSecond());
    }

    public final void plusAssign(Pair<? extends K, ? extends V>[] r2) {
        Intrinsics.checkNotNullParameter(r2, "pairs");
        putAll(r2);
    }

    public final void plusAssign(Iterable<? extends Pair<? extends K, ? extends V>> r2) {
        Intrinsics.checkNotNullParameter(r2, "pairs");
        putAll(r2);
    }

    public final void plusAssign(Sequence<? extends Pair<? extends K, ? extends V>> r2) {
        Intrinsics.checkNotNullParameter(r2, "pairs");
        putAll(r2);
    }

    public final void plusAssign(Map<K, ? extends V> r2) {
        Intrinsics.checkNotNullParameter(r2, "from");
        putAll(r2);
    }

    public final void plusAssign(ScatterMap<K, V> r2) {
        Intrinsics.checkNotNullParameter(r2, "from");
        putAll(r2);
    }

    public final V remove(K r25) {
        MutableScatterMap<K, V> this_$iv = this;
        int $i$f$findKeyIndex$collection = 0;
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
        int $i$f$findKeyIndex$collection2 = $i$f$findKeyIndex$collection;
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
        if (Intrinsics.areEqual(this_$iv.keys[index$iv], r25) == true) goto L21;
        long $this$next$iv$iv = m$iv;
        m$iv = $this$next$iv$iv & ($this$next$iv$iv - 1);
    L21:
        if (index$iv >= 0) goto L23;
        return null;
    L23:
        return removeValueAt(index$iv);
    L17:
        long $this$maskEmpty$iv$iv = (((~g$iv) << 6) & g$iv) & (-9187201950435737472L);
        if ($this$maskEmpty$iv$iv != 0) goto L19;
        probeIndex$iv = probeIndex$iv + 8;
        probeOffset$iv = (probeOffset$iv + probeIndex$iv) & probeMask$iv;
        hash2$iv = hash2$iv2;
        $i$f$findKeyIndex$collection = $i$f$findKeyIndex$collection2;
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

    public final boolean remove(K r26, V r27) {
        MutableScatterMap<K, V> this_$iv = this;
        int $i$f$findKeyIndex$collection = 0;
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
        int $i$f$findKeyIndex$collection2 = $i$f$findKeyIndex$collection;
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
        if (Intrinsics.areEqual(this_$iv.keys[index$iv], r26) == true) goto L21;
        long $this$next$iv$iv = m$iv;
        m$iv = $this$next$iv$iv & ($this$next$iv$iv - 1);
    L21:
        if (index$iv < 0) goto L27;
        if (Intrinsics.areEqual(this.values[index$iv], r27) == false) goto L27;
        removeValueAt(index$iv);
        return true;
    L27:
        return false;
    L17:
        long $this$maskEmpty$iv$iv = (((~g$iv) << 6) & g$iv) & (-9187201950435737472L);
        if ($this$maskEmpty$iv$iv != 0) goto L19;
        probeIndex$iv = probeIndex$iv + 8;
        probeOffset$iv = (probeOffset$iv + probeIndex$iv) & probeMask$iv;
        hash2$iv = hash2$iv2;
        $i$f$findKeyIndex$collection = $i$f$findKeyIndex$collection2;
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

    public final void removeIf(Function2<? super K, ? super V, Boolean> r19) {
        Intrinsics.checkNotNullParameter(r19, "predicate");
        int $i$f$removeIf = 0;
        MutableScatterMap<K, V> this_$iv = this;
        long[] m$iv = this_$iv.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 > lastIndex$iv) goto L27;
    L4:
        long slot$iv = m$iv[i$iv];
        long $this$maskEmptyOrDeleted$iv$iv = (((~slot$iv) << 7) & slot$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv == (-9187201950435737472L)) goto L22;
        int r11 = 8;
        int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
        int j$iv = 0;
    L7:
        if (j$iv >= bitCount$iv) goto L19;
        long value$iv$iv = 255 & slot$iv;
        if (value$iv$iv >= 128) goto L11;
        boolean r16 = true;
    L12:
        if (r16 == false) goto L17;
        int index$iv = (i$iv << 3) + j$iv;
        int r17 = r11;
        int $i$f$removeIf2 = $i$f$removeIf;
        if (r19.invoke(this.keys[index$iv], this.values[index$iv]).booleanValue() == false) goto L18;
        removeValueAt(index$iv);
    L18:
        slot$iv = slot$iv >> r17;
        j$iv = j$iv + 1;
        r11 = r17;
        $i$f$removeIf = $i$f$removeIf2;
        goto L7
    L17:
        $i$f$removeIf2 = $i$f$removeIf;
        r17 = r11;
        goto L18
    L11:
        r16 = false;
        goto L12
    L19:
        int $i$f$removeIf3 = $i$f$removeIf;
        if (bitCount$iv != r11) goto L34;
    L23:
        if (i$iv == lastIndex$iv) goto L35;
        i$iv = i$iv + 1;
        $i$f$removeIf = $i$f$removeIf3;
        goto L4
    L35:
        return;
    L34:
        return;
    L22:
        $i$f$removeIf3 = $i$f$removeIf;
        goto L23
    }

    public final void minusAssign(K r2) {
        remove(r2);
    }

    public final void minusAssign(K[] r5) {
        Intrinsics.checkNotNullParameter(r5, "keys");
        int r1 = r5.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        remove(r5[r2]);
        r2 = r2 + 1;
        goto L3
    }

    public final void minusAssign(Iterable<? extends K> r4) {
        Intrinsics.checkNotNullParameter(r4, "keys");
        Iterator<? extends K> r1 = r4.iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        remove(r1.next());
        goto L4
    }

    public final void minusAssign(Sequence<? extends K> r4) {
        Intrinsics.checkNotNullParameter(r4, "keys");
        Iterator<? extends K> r1 = r4.iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        remove(r1.next());
        goto L4
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<K> r21) {
        Intrinsics.checkNotNullParameter(r21, "keys");
        int $i$f$minusAssign = 0;
        ScatterSet<K> r2 = r21;
        Object[] elements$iv = r2.elements;
        long[] m$iv$iv = r2.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L25;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int $i$f$minusAssign2 = $i$f$minusAssign;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L19;
        int r1 = 8;
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
        Object key = elements$iv[index$iv$iv];
        remove(key);
    L15:
        slot$iv$iv = slot$iv$iv >> r1;
        j$iv$iv = j$iv$iv + 1;
        r1 = r1;
        r2 = r2;
        goto L7
    L11:
        r17 = false;
        goto L12
    L16:
        ScatterSet<K> r19 = r2;
        if (bitCount$iv$iv != r1) goto L31;
    L20:
        if (i$iv$iv == lastIndex$iv$iv) goto L32;
        i$iv$iv = i$iv$iv + 1;
        $i$f$minusAssign = $i$f$minusAssign2;
        r2 = r19;
        goto L4
    L32:
        return;
    L31:
        return;
    L19:
        r19 = r2;
        goto L20
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<K> r9) {
        Intrinsics.checkNotNullParameter(r9, "keys");
        Object[] content$iv = r9.content;
        int i$iv = 0;
        int r5 = r9._size;
    L3:
        if (i$iv >= r5) goto L6;
        Object key = content$iv[i$iv];
        remove(key);
        i$iv = i$iv + 1;
        goto L3
    }

    public final V removeValueAt(int r13) {
        this._size--;
        long[] r0 = this.metadata;
        int r1 = this._capacity;
        int r6 = r13 >> 3;
        int r7 = (r13 & 7) << 3;
        r0[r6] = (r0[r6] & (~(255 << r7))) | (254 << r7);
        r0[(((r13 - 7) & r1) + (r1 & 7)) >> 3] = r0[r13 >> 3];
        this.keys[r13] = null;
        V r2 = (V) this.values[r13];
        this.values[r13] = null;
        return r2;
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
        ArraysKt.fill(this.values, null, 0, this._capacity);
        ArraysKt.fill(this.keys, null, 0, this._capacity);
        initializeGrowth();
    }

    public final int findInsertIndex(K r25) {
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
        if (Intrinsics.areEqual(this.keys[index], r25) == true) goto L15;
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
        return ~index2;
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
        MutableScatterMap<K, V> r0 = this;
        long[] metadata = r0.metadata;
        int capacity = r0._capacity;
        Object[] keys = r0.keys;
        Object[] values = r0.values;
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
        metadata[lastIndex$iv - 1] = (metadata[lastIndex$iv - 1] & 72057594037927935L) | (-72057594037927936L);
        int newProbeIndex = 0;
        metadata[lastIndex$iv] = metadata[0];
        int index = 0;
    L6:
        if (index == capacity) goto L25;
        long m = (metadata[index >> 3] >> ((index & 7) << 3)) & 255;
        if (m == 128) goto L9;
        if (m != 254) goto L12;
        Object k$iv = keys[index];
        if (k$iv == null) goto L16;
        int r15 = k$iv.hashCode();
    L17:
        int hash$iv = r15 * ScatterMapKt.MurmurHashC1;
        int hash = hash$iv ^ (hash$iv << 16);
        int $i$f$h1 = hash >>> 7;
        int targetIndex = r0.findFirstAvailableSlot($i$f$h1);
        int probeOffset = $i$f$h1 & capacity;
        int r18 = newProbeIndex;
        int newProbeIndex2 = ((targetIndex - probeOffset) & capacity) / 8;
        int oldProbeIndex = ((index - probeOffset) & capacity) / 8;
        if (newProbeIndex2 == oldProbeIndex) goto L19;
        long[] metadata2 = metadata;
        if (((metadata2[targetIndex >> 3] >> ((targetIndex & 7) << 3)) & 255) != 128) goto L23;
        int $i$f$h2 = hash & WorkQueueKt.MASK;
        long value$iv = $i$f$h2;
        int i$iv2 = targetIndex >> 3;
        int b$iv = (targetIndex & 7) << 3;
        metadata2[i$iv2] = (metadata2[i$iv2] & (~(255 << b$iv))) | (value$iv << b$iv);
        int i$iv3 = index >> 3;
        int b$iv2 = (index & 7) << 3;
        long value$iv2 = 255 << b$iv2;
        metadata2[i$iv3] = (metadata2[i$iv3] & (~value$iv2)) | (128 << b$iv2);
        keys[targetIndex] = keys[index];
        keys[index] = null;
        values[targetIndex] = values[index];
        values[index] = null;
    L24:
        metadata2[ArraysKt.getLastIndex(metadata2)] = metadata2[r18];
        index = index + 1;
        r0 = this;
        newProbeIndex = r18;
        metadata = metadata2;
        goto L6
    L23:
        int $i$f$h3 = hash & WorkQueueKt.MASK;
        long value$iv3 = $i$f$h3;
        int i$iv4 = targetIndex >> 3;
        int b$iv3 = (targetIndex & 7) << 3;
        metadata2[i$iv4] = (metadata2[i$iv4] & (~(255 << b$iv3))) | (value$iv3 << b$iv3);
        Object oldKey = keys[targetIndex];
        keys[targetIndex] = keys[index];
        keys[index] = oldKey;
        Object oldValue = values[targetIndex];
        values[targetIndex] = values[index];
        values[index] = oldValue;
        index = index - 1;
        goto L24
    L19:
        int $i$f$h4 = hash & WorkQueueKt.MASK;
        long value$iv4 = $i$f$h4;
        int i$iv5 = index >> 3;
        int b$iv4 = (index & 7) << 3;
        long[] metadata3 = metadata;
        metadata3[i$iv5] = (metadata[i$iv5] & (~(255 << b$iv4))) | (value$iv4 << b$iv4);
        metadata3[ArraysKt.getLastIndex(metadata3)] = metadata3[r18];
        index = index + 1;
        r0 = this;
        newProbeIndex = r18;
        metadata = metadata3;
        goto L6
    L16:
        r15 = newProbeIndex;
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
        MutableScatterMap<K, V> r0 = this;
        long[] previousMetadata = r0.metadata;
        Object[] previousKeys = r0.keys;
        Object[] previousValues = r0.values;
        int previousCapacity = r0._capacity;
        initializeStorage(newCapacity);
        long[] newMetadata = r0.metadata;
        Object[] newKeys = r0.keys;
        Object[] newValues = r0.values;
        int capacity = r0._capacity;
        int i = 0;
    L3:
        if (i >= previousCapacity) goto L15;
        int r12 = 0;
        if (((previousMetadata[i >> 3] >> ((i & 7) << 3)) & 255) >= 128) goto L7;
        boolean r11 = true;
    L8:
        if (r11 == false) goto L14;
        Object previousKey = previousKeys[i];
        if (previousKey == null) goto L12;
        r12 = previousKey.hashCode();
    L12:
        int hash$iv = r12 * ScatterMapKt.MurmurHashC1;
        int $i$f$hash = hash$iv ^ (hash$iv << 16);
        int $i$f$h1 = $i$f$hash >>> 7;
        int index = r0.findFirstAvailableSlot($i$f$h1);
        int $i$f$h2 = $i$f$hash & WorkQueueKt.MASK;
        long value$iv = $i$f$h2;
        int i$iv$iv = index >> 3;
        int b$iv$iv = (index & 7) << 3;
        newMetadata[i$iv$iv] = (newMetadata[i$iv$iv] & (~(255 << b$iv$iv))) | (value$iv << b$iv$iv);
        int cloneIndex$iv = ((index - 7) & capacity) + (capacity & 7);
        newMetadata[cloneIndex$iv >> 3] = newMetadata[index >> 3];
        newKeys[index] = previousKey;
        newValues[index] = previousValues[i];
    L14:
        i = i + 1;
        r0 = this;
        previousMetadata = previousMetadata;
        goto L3
    L7:
        r11 = false;
        goto L8
    }

    public final Map<K, V> asMutableMap() {
        return new MutableMapWrapper(this);
    }
}
