package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: LongObjectMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ\u0006\u0010\n\u001a\u00020\bJ\r\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0002\b\fJ\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J'\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\bH\u0002J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0011\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086\nJ\u0011\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001dH\u0086\nJ\u0011\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\nJ\u0011\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001eH\u0086\nJ\u0017\u0010\u001f\u001a\u00020\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\nJ\u001d\u0010!\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00028\u0000¢\u0006\u0002\u0010#J\u0014\u0010$\u001a\u00020\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0015\u0010%\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010&J\u001b\u0010%\u001a\u00020'2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00028\u0000¢\u0006\u0002\u0010(J&\u0010)\u001a\u00020\b2\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020'0+H\u0086\bø\u0001\u0000J\u0017\u0010,\u001a\u0004\u0018\u00018\u00002\u0006\u0010-\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010.J\u0015\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\u0004H\u0000¢\u0006\u0002\b1J\u001e\u00102\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u00103J\u0006\u00104\u001a\u00020\u0004R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00065"}, d2 = {"Landroidx/collection/MutableLongObjectMap;", "V", "Landroidx/collection/LongObjectMap;", "initialCapacity", "", "(I)V", "growthLimit", "adjustStorage", "", "adjustStorage$collection", "clear", "dropDeletes", "dropDeletes$collection", "findAbsoluteInsertIndex", "key", "", "findFirstAvailableSlot", "hash1", "getOrPut", "defaultValue", "Lkotlin/Function0;", "(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "keys", "Landroidx/collection/LongList;", "Landroidx/collection/LongSet;", "", "plusAssign", "from", "put", "value", "(JLjava/lang/Object;)Ljava/lang/Object;", "putAll", "remove", "(J)Ljava/lang/Object;", "", "(JLjava/lang/Object;)Z", "removeIf", "predicate", "Lkotlin/Function2;", "removeValueAt", "index", "(I)Ljava/lang/Object;", "resizeStorage", "newCapacity", "resizeStorage$collection", "set", "(JLjava/lang/Object;)V", "trim", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableLongObjectMap<V> extends LongObjectMap<V> {
    private int growthLimit;

    public MutableLongObjectMap() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public /* synthetic */ MutableLongObjectMap(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 6;
    L5:
        this(r1);
    }

    public MutableLongObjectMap(int initialCapacity) {
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
        this.keys = new long[newCapacity];
        this.values = new Object[newCapacity];
        return;
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

    public final V getOrPut(long key, Function0<? extends V> r7) {
        Intrinsics.checkNotNullParameter(r7, "defaultValue");
        V r1 = get(key);
        if (r1 != null) goto L6;
        V r2 = r7.invoke();
        set(key, r2);
        return r2;
    L6:
        return r1;
    }

    public final void set(long key, V r5) {
        int index = findAbsoluteInsertIndex(key);
        this.keys[index] = key;
        this.values[index] = r5;
    }

    public final V put(long r4, V r6) {
        int r0 = findAbsoluteInsertIndex(r4);
        V r1 = (V) this.values[r0];
        this.keys[r0] = r4;
        this.values[r0] = r6;
        return r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(LongObjectMap<V> r23) {
        Intrinsics.checkNotNullParameter(r23, "from");
        LongObjectMap<V> r0 = r23;
        int $i$f$forEach = 0;
        long[] k$iv = r0.keys;
        Object[] v$iv = r0.values;
        long[] m$iv$iv = r0.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L25;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        LongObjectMap<V> r15 = r0;
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
        long key = k$iv[index$iv$iv];
        Object value = v$iv[index$iv$iv];
        set(key, value);
    L15:
        slot$iv$iv = slot$iv$iv >> r1;
        j$iv$iv = j$iv$iv + 1;
        $i$f$forEach = $i$f$forEach;
        r1 = r1;
        k$iv = k$iv;
        v$iv = v$iv;
        goto L7
    L11:
        r17 = false;
        goto L12
    L16:
        int $i$f$forEach2 = $i$f$forEach;
        long[] k$iv2 = k$iv;
        Object[] v$iv2 = v$iv;
        if (bitCount$iv$iv != r1) goto L31;
    L20:
        if (i$iv$iv == lastIndex$iv$iv) goto L32;
        i$iv$iv = i$iv$iv + 1;
        r0 = r15;
        $i$f$forEach = $i$f$forEach2;
        k$iv = k$iv2;
        v$iv = v$iv2;
        goto L4
    L32:
        return;
    L31:
        return;
    L19:
        $i$f$forEach2 = $i$f$forEach;
        k$iv2 = k$iv;
        v$iv2 = v$iv;
        goto L20
    }

    public final void plusAssign(LongObjectMap<V> r2) {
        Intrinsics.checkNotNullParameter(r2, "from");
        putAll(r2);
    }

    public final V remove(long key) {
        MutableLongObjectMap<V> this_$iv = this;
        int $i$f$findKeyIndex$collection = 0;
        int hash$iv$iv = Long.hashCode(key) * ScatterMapKt.MurmurHashC1;
        int hash$iv = hash$iv$iv ^ (hash$iv$iv << 16);
        int $i$f$h2 = hash$iv & WorkQueueKt.MASK;
        int probeMask$iv = this_$iv._capacity;
        int $i$f$h1 = hash$iv >>> 7;
        int probeOffset$iv = $i$f$h1 & probeMask$iv;
        int probeIndex$iv = 0;
    L3:
        long[] metadata$iv$iv = this_$iv.metadata;
        int i$iv$iv = probeOffset$iv >> 3;
        int b$iv$iv = (probeOffset$iv & 7) << 3;
        int $i$f$findKeyIndex$collection2 = $i$f$findKeyIndex$collection;
        int hash$iv2 = hash$iv;
        long g$iv = (((-b$iv$iv) >> 63) & (metadata$iv$iv[i$iv$iv + 1] << (64 - b$iv$iv))) | (metadata$iv$iv[i$iv$iv] >>> b$iv$iv);
        long x$iv$iv = (((long) $i$f$h2) * ScatterMapKt.BitmaskLsb) ^ g$iv;
        long m$iv = ((~x$iv$iv) & (x$iv$iv - ScatterMapKt.BitmaskLsb)) & (-9187201950435737472L);
    L4:
        long $this$hasNext$iv$iv = m$iv;
        if ($this$hasNext$iv$iv == 0) goto L7;
        boolean r15 = true;
    L8:
        if (r15 == false) goto L13;
        long $this$get$iv$iv = m$iv;
        int index$iv = ((Long.numberOfTrailingZeros($this$get$iv$iv) >> 3) + probeOffset$iv) & probeMask$iv;
        if (this_$iv.keys[index$iv] == key) goto L17;
        long $this$next$iv$iv = m$iv;
        m$iv = $this$next$iv$iv & ($this$next$iv$iv - 1);
    L17:
        if (index$iv >= 0) goto L19;
        return null;
    L19:
        return removeValueAt(index$iv);
    L13:
        long $this$maskEmpty$iv$iv = (((~g$iv) << 6) & g$iv) & (-9187201950435737472L);
        if ($this$maskEmpty$iv$iv != 0) goto L15;
        probeIndex$iv = probeIndex$iv + 8;
        probeOffset$iv = (probeOffset$iv + probeIndex$iv) & probeMask$iv;
        $i$f$findKeyIndex$collection = $i$f$findKeyIndex$collection2;
        hash$iv = hash$iv2;
        goto L3
    L15:
        index$iv = -1;
        goto L17
    L7:
        r15 = false;
        goto L8
    }

    public final boolean remove(long key, V r27) {
        MutableLongObjectMap<V> this_$iv = this;
        int $i$f$findKeyIndex$collection = 0;
        int hash$iv$iv = Long.hashCode(key) * ScatterMapKt.MurmurHashC1;
        int hash$iv = hash$iv$iv ^ (hash$iv$iv << 16);
        int $i$f$h2 = hash$iv & WorkQueueKt.MASK;
        int probeMask$iv = this_$iv._capacity;
        int $i$f$h1 = hash$iv >>> 7;
        int probeOffset$iv = $i$f$h1 & probeMask$iv;
        int probeIndex$iv = 0;
    L3:
        long[] metadata$iv$iv = this_$iv.metadata;
        int i$iv$iv = probeOffset$iv >> 3;
        int b$iv$iv = (probeOffset$iv & 7) << 3;
        int $i$f$findKeyIndex$collection2 = $i$f$findKeyIndex$collection;
        int hash$iv2 = hash$iv;
        long g$iv = (((-b$iv$iv) >> 63) & (metadata$iv$iv[i$iv$iv + 1] << (64 - b$iv$iv))) | (metadata$iv$iv[i$iv$iv] >>> b$iv$iv);
        long x$iv$iv = (((long) $i$f$h2) * ScatterMapKt.BitmaskLsb) ^ g$iv;
        long m$iv = ((~x$iv$iv) & (x$iv$iv - ScatterMapKt.BitmaskLsb)) & (-9187201950435737472L);
    L4:
        long $this$hasNext$iv$iv = m$iv;
        if ($this$hasNext$iv$iv == 0) goto L7;
        boolean r8 = true;
    L8:
        if (r8 == false) goto L13;
        long $this$get$iv$iv = m$iv;
        int index$iv = ((Long.numberOfTrailingZeros($this$get$iv$iv) >> 3) + probeOffset$iv) & probeMask$iv;
        if (this_$iv.keys[index$iv] == key) goto L17;
        long $this$next$iv$iv = m$iv;
        m$iv = $this$next$iv$iv & ($this$next$iv$iv - 1);
    L17:
        if (index$iv < 0) goto L23;
        if (Intrinsics.areEqual(this.values[index$iv], r27) == false) goto L23;
        removeValueAt(index$iv);
        return true;
    L23:
        return false;
    L13:
        long $this$maskEmpty$iv$iv = (((~g$iv) << 6) & g$iv) & (-9187201950435737472L);
        if ($this$maskEmpty$iv$iv != 0) goto L15;
        probeIndex$iv = probeIndex$iv + 8;
        probeOffset$iv = (probeOffset$iv + probeIndex$iv) & probeMask$iv;
        $i$f$findKeyIndex$collection = $i$f$findKeyIndex$collection2;
        hash$iv = hash$iv2;
        goto L3
    L15:
        index$iv = -1;
        goto L17
    L7:
        r8 = false;
        goto L8
    }

    public final void removeIf(Function2<? super Long, ? super V, Boolean> r20) {
        Intrinsics.checkNotNullParameter(r20, "predicate");
        int $i$f$removeIf = 0;
        MutableLongObjectMap<V> this_$iv = this;
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
        if (r20.invoke(Long.valueOf(this.keys[index$iv]), this.values[index$iv]).booleanValue() == false) goto L18;
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

    public final void minusAssign(long key) {
        remove(key);
    }

    public final void minusAssign(long[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        int r1 = keys.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        long key = keys[r2];
        remove(key);
        r2 = r2 + 1;
        goto L3
    }

    public final void minusAssign(LongSet keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        int $i$f$minusAssign = 0;
        LongSet this_$iv = keys;
        int $i$f$forEach = 0;
        long[] k$iv = this_$iv.elements;
        long[] m$iv$iv = this_$iv.metadata;
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
        long key = k$iv[index$iv$iv];
        remove(key);
    L15:
        slot$iv$iv = slot$iv$iv >> r1;
        j$iv$iv = j$iv$iv + 1;
        this_$iv = this_$iv;
        r1 = r1;
        $i$f$forEach = $i$f$forEach;
        goto L7
    L11:
        r17 = false;
        goto L12
    L16:
        LongSet this_$iv2 = this_$iv;
        int $i$f$forEach2 = $i$f$forEach;
        if (bitCount$iv$iv != r1) goto L31;
    L20:
        if (i$iv$iv == lastIndex$iv$iv) goto L32;
        i$iv$iv = i$iv$iv + 1;
        $i$f$minusAssign = $i$f$minusAssign2;
        this_$iv = this_$iv2;
        $i$f$forEach = $i$f$forEach2;
        goto L4
    L32:
        return;
    L31:
        return;
    L19:
        this_$iv2 = this_$iv;
        $i$f$forEach2 = $i$f$forEach;
        goto L20
    }

    public final void minusAssign(LongList keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        long[] content$iv = keys.content;
        int i$iv = 0;
        int r5 = keys._size;
    L3:
        if (i$iv >= r5) goto L6;
        long key = content$iv[i$iv];
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
        initializeGrowth();
    }

    private final int findAbsoluteInsertIndex(long key) {
        int hash$iv = Long.hashCode(key) * ScatterMapKt.MurmurHashC1;
        int $i$f$hash = hash$iv ^ (hash$iv << 16);
        int $i$f$h1 = $i$f$hash >>> 7;
        int $i$f$h2 = $i$f$hash & WorkQueueKt.MASK;
        int probeMask = this._capacity;
        int probeOffset = $i$f$h1 & probeMask;
        int probeIndex = 0;
    L3:
        long[] metadata$iv = this.metadata;
        int i$iv = probeOffset >> 3;
        int b$iv = (probeOffset & 7) << 3;
        int probeMask2 = probeMask;
        int probeOffset2 = probeOffset;
        long g = (((-b$iv) >> 63) & (metadata$iv[i$iv + 1] << (64 - b$iv))) | (metadata$iv[i$iv] >>> b$iv);
        long x$iv = (((long) $i$f$h2) * ScatterMapKt.BitmaskLsb) ^ g;
        long m = ((~x$iv) & (x$iv - ScatterMapKt.BitmaskLsb)) & (-9187201950435737472L);
    L4:
        long $this$hasNext$iv = m;
        int r19 = 0;
        if ($this$hasNext$iv == 0) goto L7;
        boolean r7 = true;
    L8:
        if (r7 == false) goto L13;
        long $this$get$iv = m;
        int index = (probeOffset2 + (Long.numberOfTrailingZeros($this$get$iv) >> 3)) & probeMask2;
        if (this.keys[index] == key) goto L11;
        long $this$next$iv = m;
        m = $this$next$iv & ($this$next$iv - 1);
        goto L4
    L11:
        return index;
    L13:
        long $this$maskEmpty$iv = (((~g) << 6) & g) & (-9187201950435737472L);
        if ($this$maskEmpty$iv != 0) goto L15;
        probeIndex = probeIndex + 8;
        probeOffset = (probeOffset2 + probeIndex) & probeMask2;
        probeMask = probeMask2;
        goto L3
    L15:
        int index2 = findFirstAvailableSlot($i$f$h1);
        if (this.growthLimit == 0) goto L18;
    L23:
        this._size++;
        int r5 = this.growthLimit;
        if (((this.metadata[index2 >> 3] >> ((index2 & 7) << 3)) & 255) != 128) goto L26;
        r19 = 1;
    L26:
        this.growthLimit = r5 - r19;
        long[] data$iv = this.metadata;
        int capacity$iv = this._capacity;
        long value$iv = $i$f$h2;
        int i$iv$iv = index2 >> 3;
        int b$iv$iv = (index2 & 7) << 3;
        data$iv[i$iv$iv] = (data$iv[i$iv$iv] & (~(255 << b$iv$iv))) | (value$iv << b$iv$iv);
        int cloneIndex$iv = ((index2 - 7) & capacity$iv) + (capacity$iv & 7);
        data$iv[cloneIndex$iv >> 3] = data$iv[index2 >> 3];
        return index2;
    L18:
        if (((this.metadata[index2 >> 3] >> ((index2 & 7) << 3)) & 255) != 254) goto L20;
        boolean r6 = true;
    L21:
        if (r6 == true) goto L23;
        adjustStorage$collection();
        index2 = findFirstAvailableSlot($i$f$h1);
        goto L23
    L20:
        r6 = false;
        goto L21
    L7:
        r7 = false;
        goto L8
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
        MutableLongObjectMap<V> r0 = this;
        long[] metadata = r0.metadata;
        int capacity = r0._capacity;
        long[] keys = r0.keys;
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
        long r11 = 72057594037927935L;
        metadata[lastIndex$iv - 1] = (metadata[lastIndex$iv - 1] & 72057594037927935L) | (-72057594037927936L);
        int hash1 = 0;
        metadata[lastIndex$iv] = metadata[0];
        int index = 0;
    L6:
        if (index == capacity) goto L21;
        long m = (metadata[index >> 3] >> ((index & 7) << 3)) & 255;
        if (m == 128) goto L9;
        if (m != 254) goto L12;
        long k$iv = keys[index];
        int hash$iv = Long.hashCode(k$iv) * ScatterMapKt.MurmurHashC1;
        int hash = hash$iv ^ (hash$iv << 16);
        int $i$f$h1 = hash >>> 7;
        int r16 = hash1;
        int targetIndex = r0.findFirstAvailableSlot($i$f$h1);
        int probeOffset = $i$f$h1 & capacity;
        int newProbeIndex = ((targetIndex - probeOffset) & capacity) / 8;
        int oldProbeIndex = ((index - probeOffset) & capacity) / 8;
        if (newProbeIndex == oldProbeIndex) goto L15;
        long[] metadata2 = metadata;
        long r24 = r11;
        if (((metadata2[targetIndex >> 3] >> ((targetIndex & 7) << 3)) & 255) != 128) goto L19;
        int $i$f$h2 = hash & WorkQueueKt.MASK;
        long value$iv = $i$f$h2;
        int i$iv2 = targetIndex >> 3;
        int b$iv = (targetIndex & 7) << 3;
        metadata2[i$iv2] = (metadata2[i$iv2] & (~(255 << b$iv))) | (value$iv << b$iv);
        int i$iv3 = index >> 3;
        int b$iv2 = (index & 7) << 3;
        long value$iv2 = 255 << b$iv2;
        metadata2[i$iv3] = ((~value$iv2) & metadata2[i$iv3]) | (128 << b$iv2);
        keys[targetIndex] = keys[index];
        keys[index] = 0;
        values[targetIndex] = values[index];
        values[index] = null;
    L20:
        metadata2[ArraysKt.getLastIndex(metadata2)] = (metadata2[r16] & r24) | Long.MIN_VALUE;
        index = index + 1;
        r0 = this;
        hash1 = r16;
        r11 = r24;
        metadata = metadata2;
        goto L6
    L19:
        int $i$f$h3 = hash & WorkQueueKt.MASK;
        long value$iv3 = $i$f$h3;
        int i$iv4 = targetIndex >> 3;
        int b$iv3 = (targetIndex & 7) << 3;
        metadata2[i$iv4] = ((~(255 << b$iv3)) & metadata2[i$iv4]) | (value$iv3 << b$iv3);
        long oldKey = keys[targetIndex];
        keys[targetIndex] = keys[index];
        keys[index] = oldKey;
        Object oldValue = values[targetIndex];
        values[targetIndex] = values[index];
        values[index] = oldValue;
        index = index - 1;
        goto L20
    L15:
        int $i$f$h4 = hash & WorkQueueKt.MASK;
        long r25 = r11;
        long value$iv4 = $i$f$h4;
        int i$iv5 = index >> 3;
        int b$iv4 = (index & 7) << 3;
        long[] metadata3 = metadata;
        metadata3[i$iv5] = (metadata[i$iv5] & (~(255 << b$iv4))) | (value$iv4 << b$iv4);
        metadata3[ArraysKt.getLastIndex(metadata3)] = (metadata3[r16] & r25) | Long.MIN_VALUE;
        index = index + 1;
        r0 = this;
        hash1 = r16;
        r11 = r25;
        metadata = metadata3;
        goto L6
    L12:
        index = index + 1;
        goto L6
    L9:
        index = index + 1;
        goto L6
    L21:
        initializeGrowth();
    }

    public final void resizeStorage$collection(int newCapacity) {
        MutableLongObjectMap<V> r0 = this;
        long[] previousMetadata = r0.metadata;
        long[] previousKeys = r0.keys;
        Object[] previousValues = r0.values;
        int previousCapacity = r0._capacity;
        initializeStorage(newCapacity);
        long[] newMetadata = r0.metadata;
        long[] newKeys = r0.keys;
        Object[] newValues = r0.values;
        int capacity = r0._capacity;
        int i = 0;
    L3:
        if (i >= previousCapacity) goto L12;
        if (((previousMetadata[i >> 3] >> ((i & 7) << 3)) & 255) >= 128) goto L7;
        boolean r11 = true;
    L8:
        if (r11 == false) goto L11;
        long previousKey = previousKeys[i];
        int hash$iv = Long.hashCode(previousKey) * ScatterMapKt.MurmurHashC1;
        int $i$f$hash = hash$iv ^ (hash$iv << 16);
        int $i$f$h1 = $i$f$hash >>> 7;
        int index = r0.findFirstAvailableSlot($i$f$h1);
        long value$iv = $i$f$hash & WorkQueueKt.MASK;
        int i$iv$iv = index >> 3;
        int b$iv$iv = (index & 7) << 3;
        newMetadata[i$iv$iv] = (newMetadata[i$iv$iv] & (~(255 << b$iv$iv))) | (value$iv << b$iv$iv);
        int cloneIndex$iv = ((index - 7) & capacity) + (capacity & 7);
        newMetadata[cloneIndex$iv >> 3] = newMetadata[index >> 3];
        newKeys[index] = previousKey;
        newValues[index] = previousValues[i];
    L11:
        i = i + 1;
        r0 = this;
        previousMetadata = previousMetadata;
        goto L3
    L7:
        r11 = false;
        goto L8
    }
}
