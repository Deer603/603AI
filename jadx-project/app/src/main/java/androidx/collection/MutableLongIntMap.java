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

/* JADX INFO: compiled from: LongIntMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u0006\u0010\t\u001a\u00020\u0007J\r\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u000bJ\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\"\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013H\u0086\bø\u0001\u0000J\b\u0010\u0014\u001a\u00020\u0007H\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0003H\u0002J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0011\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001aH\u0086\nJ\u0011\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001bH\u0086\nJ\u0011\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\nJ\u0011\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001cH\u0086\nJ\u0011\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0001H\u0086\nJ\u0016\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0003J\u001e\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0003J\u000e\u0010\"\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0001J\u000e\u0010#\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010#\u001a\u00020$2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0003J&\u0010%\u001a\u00020\u00072\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020$0'H\u0086\bø\u0001\u0000J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0003H\u0001J\u0015\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0003H\u0000¢\u0006\u0002\b,J\u0019\u0010-\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0003H\u0086\u0002J\u0006\u0010.\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006/"}, d2 = {"Landroidx/collection/MutableLongIntMap;", "Landroidx/collection/LongIntMap;", "initialCapacity", "", "(I)V", "growthLimit", "adjustStorage", "", "adjustStorage$collection", "clear", "dropDeletes", "dropDeletes$collection", "findFirstAvailableSlot", "hash1", "findInsertIndex", "key", "", "getOrPut", "defaultValue", "Lkotlin/Function0;", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "keys", "Landroidx/collection/LongList;", "Landroidx/collection/LongSet;", "", "plusAssign", "from", "put", "value", "default", "putAll", "remove", "", "removeIf", "predicate", "Lkotlin/Function2;", "removeValueAt", "index", "resizeStorage", "newCapacity", "resizeStorage$collection", "set", "trim", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableLongIntMap extends LongIntMap {
    private int growthLimit;

    public MutableLongIntMap() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public MutableLongIntMap(int initialCapacity) {
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

    public /* synthetic */ MutableLongIntMap(int r1, int r2, DefaultConstructorMarker r3) {
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
        this.keys = new long[newCapacity];
        this.values = new int[newCapacity];
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

    public final int getOrPut(long key, Function0<Integer> r6) {
        Intrinsics.checkNotNullParameter(r6, "defaultValue");
        int index = findKeyIndex(key);
        if (index >= 0) goto L6;
        int defValue = r6.invoke().intValue();
        put(key, defValue);
        return defValue;
    L6:
        return this.values[index];
    }

    public final void set(long key, int value) {
        int index = findInsertIndex(key);
        if (index >= 0) goto L5;
        index = ~index;
    L5:
        this.keys[index] = key;
        this.values[index] = value;
    }

    public final void put(long key, int value) {
        set(key, value);
    }

    public final int put(long key, int value, int r7) {
        int index = findInsertIndex(key);
        int previous = r7;
        if (index >= 0) goto L5;
        index = ~index;
    L6:
        this.keys[index] = key;
        this.values[index] = value;
        return previous;
    L5:
        previous = this.values[index];
        goto L6
    }

    public final void putAll(LongIntMap from) {
        Intrinsics.checkNotNullParameter(from, "from");
        LongIntMap this_$iv = from;
        int $i$f$forEach = 0;
        long[] k$iv = this_$iv.keys;
        int[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L25;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        LongIntMap this_$iv2 = this_$iv;
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
        int value = v$iv[index$iv$iv];
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
        int[] v$iv2 = v$iv;
        if (bitCount$iv$iv != r1) goto L31;
    L20:
        if (i$iv$iv == lastIndex$iv$iv) goto L32;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
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

    public final void plusAssign(LongIntMap from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void remove(long key) {
        int index = findKeyIndex(key);
        if (index < 0) goto L6;
        removeValueAt(index);
        return;
    }

    public final boolean remove(long key, int value) {
        int index = findKeyIndex(key);
        if (index >= 0) goto L5;
        return false;
    L5:
        if (this.values[index] != value) goto L10;
        removeValueAt(index);
        return true;
    L10:
        return false;
    }

    public final void removeIf(Function2<? super Long, ? super Integer, Boolean> r20) {
        Intrinsics.checkNotNullParameter(r20, "predicate");
        int $i$f$removeIf = 0;
        MutableLongIntMap this_$iv = this;
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
        if (r20.invoke(Long.valueOf(this.keys[index$iv]), Integer.valueOf(this.values[index$iv])).booleanValue() == false) goto L18;
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

    public final void removeValueAt(int index) {
        this._size--;
        long[] data$iv = this.metadata;
        int capacity$iv = this._capacity;
        int i$iv$iv = index >> 3;
        int b$iv$iv = (index & 7) << 3;
        data$iv[i$iv$iv] = (data$iv[i$iv$iv] & (~(255 << b$iv$iv))) | (254 << b$iv$iv);
        int $i$f$writeRawMetadata = index - 7;
        int cloneIndex$iv = ($i$f$writeRawMetadata & capacity$iv) + (capacity$iv & 7);
        data$iv[cloneIndex$iv >> 3] = data$iv[index >> 3];
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
        initializeGrowth();
    }

    private final int findInsertIndex(long key) {
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
        return ~index2;
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
        MutableLongIntMap r0 = this;
        long[] metadata = r0.metadata;
        int capacity = r0._capacity;
        long[] keys = r0.keys;
        int[] values = r0.values;
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
        values[index] = r16;
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
        int oldValue = values[targetIndex];
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
        MutableLongIntMap r0 = this;
        long[] previousMetadata = r0.metadata;
        long[] previousKeys = r0.keys;
        int[] previousValues = r0.values;
        int previousCapacity = r0._capacity;
        initializeStorage(newCapacity);
        long[] newMetadata = r0.metadata;
        long[] newKeys = r0.keys;
        int[] newValues = r0.values;
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
