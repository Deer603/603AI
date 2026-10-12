package androidx.collection;

import androidx.autofill.HintConstants;
import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: LongIntMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J&\u0010\u0015\u001a\u00020\u00162\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160\u0018H\u0086\bø\u0001\u0000J\u0006\u0010\u001a\u001a\u00020\u0016J&\u0010\u001a\u001a\u00020\u00162\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160\u0018H\u0086\bø\u0001\u0000J\u0011\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0019H\u0086\nJ\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0019J\u000e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0004J\u0006\u0010 \u001a\u00020\u0004J&\u0010 \u001a\u00020\u00042\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160\u0018H\u0086\bø\u0001\u0000J\u0013\u0010!\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0019H\u0001JD\u0010$\u001a\u00020%26\u0010&\u001a2\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020%0\u0018H\u0086\bø\u0001\u0000J/\u0010)\u001a\u00020%2!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020%0*H\u0081\bø\u0001\u0000J/\u0010,\u001a\u00020%2!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020%0*H\u0086\bø\u0001\u0000J/\u0010-\u001a\u00020%2!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020%0*H\u0086\bø\u0001\u0000J\u0011\u0010.\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0019H\u0086\u0002J\u0016\u0010/\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u0004J\"\u00101\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00192\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000402H\u0086\bø\u0001\u0000J\b\u00103\u001a\u00020\u0004H\u0016J\u0006\u00104\u001a\u00020\u0016J\u0006\u00105\u001a\u00020\u0016J:\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010;\u001a\u0002092\b\b\u0002\u0010<\u001a\u00020\u00042\b\b\u0002\u0010=\u001a\u000209H\u0007Jx\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010;\u001a\u0002092\b\b\u0002\u0010<\u001a\u00020\u00042\b\b\u0002\u0010=\u001a\u00020928\b\u0004\u0010>\u001a2\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u0002090\u0018H\u0087\bø\u0001\u0000J\u0006\u0010?\u001a\u00020\u0016J\b\u0010@\u001a\u000207H\u0016R\u0018\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0018\u0010\u0006\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0011\u0010\b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002R\u0018\u0010\u000e\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0002R\u0011\u0010\u0010\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\nR\u0018\u0010\u0012\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0002\u0082\u0001\u0001A\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006B"}, d2 = {"Landroidx/collection/LongIntMap;", "", "()V", "_capacity", "", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "capacity", "getCapacity", "()I", "keys", "", "getKeys$annotations", "metadata", "getMetadata$annotations", "size", "getSize", "values", "", "getValues$annotations", "all", "", "predicate", "Lkotlin/Function2;", "", "any", "contains", "key", "containsKey", "containsValue", "value", "count", "equals", "other", "findKeyIndex", "forEach", "", "block", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "forEachIndexed", "Lkotlin/Function1;", "index", "forEachKey", "forEachValue", "get", "getOrDefault", "defaultValue", "getOrElse", "Lkotlin/Function0;", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "none", "toString", "Landroidx/collection/MutableLongIntMap;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class LongIntMap {
    public int _capacity;
    public int _size;
    public long[] keys;
    public long[] metadata;
    public int[] values;

    public /* synthetic */ LongIntMap(DefaultConstructorMarker r1) {
        this();
    }

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    public static /* synthetic */ void get_capacity$collection$annotations() {
    }

    public static /* synthetic */ void get_size$collection$annotations() {
    }

    private LongIntMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = LongSetKt.getEmptyLongArray();
        this.values = IntSetKt.getEmptyIntArray();
    }

    public final int getCapacity() {
        return this._capacity;
    }

    public final int getSize() {
        return this._size;
    }

    public final boolean any() {
        if (this._size == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean none() {
        if (this._size != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean isEmpty() {
        if (this._size != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean isNotEmpty() {
        if (this._size == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final int get(long key) {
        int index = findKeyIndex(key);
        if (index >= 0) goto L6;
        RuntimeHelpersKt.throwNoSuchElementException("Cannot find value for key " + key);
    L6:
        return this.values[index];
    }

    public final int getOrDefault(long key, int defaultValue) {
        int index = findKeyIndex(key);
        if (index >= 0) goto L5;
        return defaultValue;
    L5:
        return this.values[index];
    }

    public final int getOrElse(long key, Function0<Integer> r6) {
        Intrinsics.checkNotNullParameter(r6, "defaultValue");
        int index = findKeyIndex(key);
        if (index >= 0) goto L7;
        return r6.invoke().intValue();
    L7:
        return this.values[index];
    }

    public final void forEachIndexed(Function1<? super Integer, Unit> r15) {
        Intrinsics.checkNotNullParameter(r15, "block");
        long[] m = this.metadata;
        int lastIndex = m.length - 2;
        int i = 0;
        if (0 > lastIndex) goto L19;
    L4:
        long slot = m[i];
        long $this$maskEmptyOrDeleted$iv = (((~slot) << 7) & slot) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv == (-9187201950435737472L)) goto L17;
        int bitCount = 8 - ((~(i - lastIndex)) >>> 31);
        int j = 0;
    L7:
        if (j >= bitCount) goto L15;
        long value$iv = 255 & slot;
        if (value$iv >= 128) goto L11;
        boolean r12 = true;
    L12:
        if (r12 == false) goto L14;
        int index = (i << 3) + j;
        r15.invoke(Integer.valueOf(index));
    L14:
        slot = slot >> 8;
        j = j + 1;
        goto L7
    L11:
        r12 = false;
        goto L12
    L15:
        if (bitCount == 8) goto L17;
        return;
    L17:
        if (i == lastIndex) goto L25;
        i = i + 1;
        goto L4
    L25:
        return;
    }

    public final void forEach(Function2<? super Long, ? super Integer, Unit> r22) {
        Intrinsics.checkNotNullParameter(r22, "block");
        int $i$f$forEach = 0;
        long[] k = this.keys;
        int[] v = this.values;
        long[] m$iv = this.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 > lastIndex$iv) goto L22;
    L4:
        long slot$iv = m$iv[i$iv];
        int $i$f$forEach2 = $i$f$forEach;
        long[] k2 = k;
        if (((((~slot$iv) << 7) & slot$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L18;
        int r3 = 8;
        int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
        int j$iv = 0;
    L7:
        if (j$iv >= bitCount$iv) goto L17;
        long value$iv$iv = 255 & slot$iv;
        if (value$iv$iv >= 128) goto L11;
        boolean r18 = true;
    L12:
        if (r18 == false) goto L15;
        int index$iv = (i$iv << 3) + j$iv;
        r22.invoke(Long.valueOf(k2[index$iv]), Integer.valueOf(v[index$iv]));
    L15:
        slot$iv = slot$iv >> r3;
        j$iv = j$iv + 1;
        r3 = r3;
        goto L7
    L11:
        r18 = false;
        goto L12
    L17:
        if (bitCount$iv == r3) goto L18;
        return;
    L18:
        if (i$iv == lastIndex$iv) goto L29;
        i$iv = i$iv + 1;
        $i$f$forEach = $i$f$forEach2;
        k = k2;
        goto L4
    L29:
        return;
    }

    public final void forEachKey(Function1<? super Long, Unit> r21) {
        Intrinsics.checkNotNullParameter(r21, "block");
        long[] k = this.keys;
        long[] m$iv = this.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 > lastIndex$iv) goto L21;
    L4:
        long slot$iv = m$iv[i$iv];
        long $this$maskEmptyOrDeleted$iv$iv = (((~slot$iv) << 7) & slot$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv == (-9187201950435737472L)) goto L18;
        int r12 = 8;
        int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
        int j$iv = 0;
    L7:
        if (j$iv >= bitCount$iv) goto L17;
        long value$iv$iv = 255 & slot$iv;
        if (value$iv$iv >= 128) goto L11;
        boolean r17 = true;
    L12:
        if (r17 == false) goto L15;
        int index$iv = (i$iv << 3) + j$iv;
        r21.invoke(Long.valueOf(k[index$iv]));
    L15:
        slot$iv = slot$iv >> r12;
        j$iv = j$iv + 1;
        r12 = r12;
        goto L7
    L11:
        r17 = false;
        goto L12
    L17:
        if (bitCount$iv == r12) goto L18;
        return;
    L18:
        if (i$iv == lastIndex$iv) goto L28;
        i$iv = i$iv + 1;
        goto L4
    L28:
        return;
    }

    public final void forEachValue(Function1<? super Integer, Unit> r20) {
        Intrinsics.checkNotNullParameter(r20, "block");
        int[] v = this.values;
        long[] m$iv = this.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 > lastIndex$iv) goto L21;
    L4:
        long slot$iv = m$iv[i$iv];
        long $this$maskEmptyOrDeleted$iv$iv = (((~slot$iv) << 7) & slot$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv == (-9187201950435737472L)) goto L18;
        int r12 = 8;
        int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
        int j$iv = 0;
    L7:
        if (j$iv >= bitCount$iv) goto L17;
        long value$iv$iv = 255 & slot$iv;
        if (value$iv$iv >= 128) goto L11;
        boolean r17 = true;
    L12:
        if (r17 == false) goto L15;
        int index$iv = (i$iv << 3) + j$iv;
        r20.invoke(Integer.valueOf(v[index$iv]));
    L15:
        slot$iv = slot$iv >> r12;
        j$iv = j$iv + 1;
        r12 = r12;
        goto L7
    L11:
        r17 = false;
        goto L12
    L17:
        if (bitCount$iv == r12) goto L18;
        return;
    L18:
        if (i$iv == lastIndex$iv) goto L28;
        i$iv = i$iv + 1;
        goto L4
    L28:
        return;
    }

    public final boolean all(Function2<? super Long, ? super Integer, Boolean> r28) {
        Intrinsics.checkNotNullParameter(r28, "predicate");
        int $i$f$all = 0;
        long[] k$iv = this.keys;
        int[] v$iv = this.values;
        long[] m$iv$iv = this.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L28;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long slot$iv$iv2 = slot$iv$iv;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L22;
        int r12 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L19;
        long value$iv$iv$iv = slot$iv$iv2 & 255;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r14 = true;
    L12:
        if (r14 == false) goto L18;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        long key = k$iv[index$iv$iv];
        int value = v$iv[index$iv$iv];
        if (r28.invoke(Long.valueOf(key), Integer.valueOf(value)).booleanValue() == true) goto L18;
        return false;
    L18:
        slot$iv$iv2 = slot$iv$iv2 >> r12;
        j$iv$iv = j$iv$iv + 1;
        r12 = r12;
        $i$f$all = $i$f$all;
        goto L7
    L11:
        r14 = false;
        goto L12
    L19:
        int $i$f$all2 = $i$f$all;
        if (bitCount$iv$iv != r12) goto L35;
    L23:
        if (i$iv$iv == lastIndex$iv$iv) goto L36;
        i$iv$iv = i$iv$iv + 1;
        $i$f$all = $i$f$all2;
        goto L4
    L36:
        return true;
    L35:
        return true;
    L22:
        $i$f$all2 = $i$f$all;
        goto L23
    L28:
        return true;
    }

    public final boolean any(Function2<? super Long, ? super Integer, Boolean> r28) {
        Intrinsics.checkNotNullParameter(r28, "predicate");
        int $i$f$any = 0;
        long[] k$iv = this.keys;
        int[] v$iv = this.values;
        long[] m$iv$iv = this.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L28;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long slot$iv$iv2 = slot$iv$iv;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L22;
        int r12 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L19;
        long value$iv$iv$iv = slot$iv$iv2 & 255;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r14 = true;
    L12:
        if (r14 == false) goto L18;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        long key = k$iv[index$iv$iv];
        int value = v$iv[index$iv$iv];
        if (r28.invoke(Long.valueOf(key), Integer.valueOf(value)).booleanValue() == false) goto L18;
        return true;
    L18:
        slot$iv$iv2 = slot$iv$iv2 >> r12;
        j$iv$iv = j$iv$iv + 1;
        r12 = r12;
        $i$f$any = $i$f$any;
        goto L7
    L11:
        r14 = false;
        goto L12
    L19:
        int $i$f$any2 = $i$f$any;
        if (bitCount$iv$iv != r12) goto L35;
    L23:
        if (i$iv$iv == lastIndex$iv$iv) goto L36;
        i$iv$iv = i$iv$iv + 1;
        $i$f$any = $i$f$any2;
        goto L4
    L36:
        return false;
    L35:
        return false;
    L22:
        $i$f$any2 = $i$f$any;
        goto L23
    L28:
        return false;
    }

    public final int count() {
        return getSize();
    }

    public final int count(Function2<? super Long, ? super Integer, Boolean> r27) {
        Intrinsics.checkNotNullParameter(r27, "predicate");
        int $i$f$count = 0;
        int count = 0;
        LongIntMap this_$iv = this;
        long[] k$iv = this_$iv.keys;
        int[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L28;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int $i$f$count2 = $i$f$count;
        int count2 = count;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L22;
        int r2 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L19;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r20 = true;
    L12:
        if (r20 == false) goto L17;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        long key = k$iv[index$iv$iv];
        int value = v$iv[index$iv$iv];
        int r24 = r2;
        LongIntMap this_$iv2 = this_$iv;
        if (r27.invoke(Long.valueOf(key), Integer.valueOf(value)).booleanValue() == false) goto L18;
        count2 = count2 + 1;
    L18:
        slot$iv$iv = slot$iv$iv >> r24;
        j$iv$iv = j$iv$iv + 1;
        r2 = r24;
        this_$iv = this_$iv2;
        goto L7
    L17:
        r24 = r2;
        this_$iv2 = this_$iv;
        goto L18
    L11:
        r20 = false;
        goto L12
    L19:
        LongIntMap this_$iv3 = this_$iv;
        if (bitCount$iv$iv != r2) goto L35;
        count = count2;
    L23:
        if (i$iv$iv == lastIndex$iv$iv) goto L28;
        i$iv$iv = i$iv$iv + 1;
        $i$f$count = $i$f$count2;
        this_$iv = this_$iv3;
        goto L4
    L35:
        return count2;
    L22:
        this_$iv3 = this_$iv;
        count = count2;
    L28:
        return count;
    }

    public final boolean contains(long key) {
        return containsKey(key);
    }

    public final boolean containsKey(long key) {
        if (findKeyIndex(key) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean containsValue(int value) {
        int[] v$iv = this.values;
        long[] m$iv$iv = this.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L28;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L22;
        int r12 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L19;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r14 = true;
    L12:
        if (r14 == false) goto L18;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int v = v$iv[index$iv$iv];
        if (value != v) goto L18;
        return true;
    L18:
        slot$iv$iv = slot$iv$iv >> r12;
        j$iv$iv = j$iv$iv + 1;
        r12 = r12;
        goto L7
    L11:
        r14 = false;
        goto L12
    L19:
        boolean r17 = false;
        if (bitCount$iv$iv != r12) goto L35;
    L23:
        if (i$iv$iv == lastIndex$iv$iv) goto L36;
        i$iv$iv = i$iv$iv + 1;
        goto L4
    L36:
        return r17;
    L35:
        return false;
    L22:
        r17 = false;
        goto L23
    L28:
        return false;
    }

    public static /* synthetic */ String joinToString$default(LongIntMap r1, CharSequence r2, CharSequence r3, CharSequence r4, int r5, CharSequence r6, int r7, Object r8) {
        if (r8 != null) goto L22;
        if ((r7 & 1) == 0) goto L7;
    L7:
        if ((r7 & 2) == 0) goto L10;
    L10:
        if ((r7 & 4) == 0) goto L13;
    L13:
        if ((r7 & 8) == 0) goto L16;
        r5 = -1;
    L16:
        if ((r7 & 16) == 0) goto L18;
    L19:
        CharSequence r9 = r4;
        int r10 = r5;
        return r1.joinToString(r2, r3, r9, r10, r8);
    L18:
        CharSequence r11 = r6;
        goto L19
    L22:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        CharSequence r0 = separator;
        CharSequence r3 = truncated;
        Intrinsics.checkNotNullParameter(r0, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(r3, "truncated");
        StringBuilder $this$joinToString_u24lambda_u248 = new StringBuilder();
        int r6 = 0;
        $this$joinToString_u24lambda_u248.append(prefix);
        int index = 0;
        LongIntMap this_$iv = this;
        int $i$f$forEach = 0;
        long[] k$iv = this_$iv.keys;
        int[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L27;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int r21 = r6;
        int index2 = index;
        LongIntMap this_$iv2 = this_$iv;
        int $i$f$forEach2 = $i$f$forEach;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L24;
        int r7 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
        int index3 = index2;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L21;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r24 = true;
    L12:
        if (r24 == false) goto L19;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        long key = k$iv[index$iv$iv];
        int value = v$iv[index$iv$iv];
        StringBuilder r25 = $this$joinToString_u24lambda_u248;
        if (index3 == limit) goto L15;
        if (index3 == 0) goto L18;
        $this$joinToString_u24lambda_u248.append(r0);
    L18:
        $this$joinToString_u24lambda_u248.append(key);
        $this$joinToString_u24lambda_u248.append('=');
        $this$joinToString_u24lambda_u248.append(value);
        index3 = index3 + 1;
    L20:
        slot$iv$iv = slot$iv$iv >> r7;
        j$iv$iv = j$iv$iv + 1;
        r0 = separator;
        r3 = truncated;
        $this$joinToString_u24lambda_u248 = r25;
        r7 = r7;
        goto L7
    L15:
        $this$joinToString_u24lambda_u248.append(r3);
    L30:
        String r1 = r25.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    L19:
        r25 = $this$joinToString_u24lambda_u248;
        goto L20
    L11:
        r24 = false;
        goto L12
    L21:
        r25 = $this$joinToString_u24lambda_u248;
        if (bitCount$iv$iv != r7) goto L29;
        index = index3;
    L25:
        if (i$iv$iv == lastIndex$iv$iv) goto L29;
        i$iv$iv = i$iv$iv + 1;
        r0 = separator;
        r3 = truncated;
        this_$iv = this_$iv2;
        $i$f$forEach = $i$f$forEach2;
        r6 = r21;
        $this$joinToString_u24lambda_u248 = r25;
    L29:
        $this$joinToString_u24lambda_u248.append(postfix);
        goto L30
    L24:
        r25 = $this$joinToString_u24lambda_u248;
        index = index2;
        goto L25
    L27:
        r25 = $this$joinToString_u24lambda_u248;
        goto L29
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final String joinToString(CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, limit, null, 16, null);
    }

    public static /* synthetic */ String joinToString$default(LongIntMap $this, CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function2 transform, int r35, Object r36) {
        if (r36 != null) goto L55;
        if ((r35 & 1) == 0) goto L7;
    L9:
        if ((r35 & 2) == 0) goto L11;
    L13:
        if ((r35 & 4) == 0) goto L15;
    L17:
        if ((r35 & 8) == 0) goto L19;
        int limit2 = -1;
    L21:
        if ((r35 & 16) == 0) goto L23;
    L24:
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder $this$joinToString_u24lambda_u2410 = new StringBuilder();
        int r9 = 0;
        $this$joinToString_u24lambda_u2410.append(prefix);
        int index = 0;
        LongIntMap this_$iv = $this;
        int $i$f$forEach = 0;
        long[] k$iv = this_$iv.keys;
        int[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int $i$f$joinToString = m$iv$iv.length;
        int lastIndex$iv$iv = $i$f$joinToString - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L51;
    L26:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int r37 = r9;
        int index2 = index;
        LongIntMap this_$iv2 = this_$iv;
        int $i$f$forEach2 = $i$f$forEach;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L46;
        int r10 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
        int index3 = index2;
    L29:
        if (j$iv$iv >= bitCount$iv$iv) goto L43;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L33;
        boolean r22 = true;
    L34:
        if (r22 == false) goto L42;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        long key = k$iv[index$iv$iv];
        int value = v$iv[index$iv$iv];
        if (index3 == limit2) goto L37;
        if (index3 == 0) goto L40;
        $this$joinToString_u24lambda_u2410.append(separator);
    L40:
        $this$joinToString_u24lambda_u2410.append((CharSequence) transform.invoke(Long.valueOf(key), Integer.valueOf(value)));
        index3 = index3 + 1;
        goto L42
    L37:
        $this$joinToString_u24lambda_u2410.append(truncated);
    L52:
        String r1 = $this$joinToString_u24lambda_u2410.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    L42:
        slot$iv$iv = slot$iv$iv >> r10;
        j$iv$iv = j$iv$iv + 1;
        r10 = r10;
        CharSequence separator2 = separator2;
        goto L29
    L33:
        r22 = false;
        goto L34
    L43:
        CharSequence separator3 = separator2;
        if (bitCount$iv$iv != r10) goto L51;
        index = index3;
    L47:
        if (i$iv$iv == lastIndex$iv$iv) goto L51;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
        $i$f$forEach = $i$f$forEach2;
        r9 = r37;
        separator2 = separator3;
        goto L26
    L46:
        separator3 = separator2;
        index = index2;
    L51:
        $this$joinToString_u24lambda_u2410.append(postfix);
        goto L52
    L23:
        CharSequence truncated2 = truncated;
        goto L24
    L19:
        limit2 = limit;
        goto L21
    L15:
        CharSequence postfix2 = postfix;
        goto L17
    L11:
        CharSequence prefix2 = prefix;
        goto L13
    L7:
        separator2 = separator;
        goto L9
    L55:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function2<? super Long, ? super Integer, ? extends CharSequence> r37) {
        CharSequence r0 = separator;
        CharSequence r3 = truncated;
        Intrinsics.checkNotNullParameter(r0, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(r3, "truncated");
        Intrinsics.checkNotNullParameter(r37, "transform");
        StringBuilder $this$joinToString_u24lambda_u2410 = new StringBuilder();
        int r8 = 0;
        $this$joinToString_u24lambda_u2410.append(prefix);
        int index = 0;
        LongIntMap this_$iv = this;
        int $i$f$forEach = 0;
        long[] k$iv = this_$iv.keys;
        int[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int $i$f$joinToString = m$iv$iv.length;
        int lastIndex$iv$iv = $i$f$joinToString - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L29;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int r23 = r8;
        int index2 = index;
        LongIntMap this_$iv2 = this_$iv;
        int $i$f$forEach2 = $i$f$forEach;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L24;
        int r9 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
        int index3 = index2;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L22;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r26 = true;
    L12:
        if (r26 == false) goto L20;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        long key = k$iv[index$iv$iv];
        int value = v$iv[index$iv$iv];
        if (index3 == limit) goto L15;
        if (index3 == 0) goto L18;
        $this$joinToString_u24lambda_u2410.append(r0);
    L18:
        $this$joinToString_u24lambda_u2410.append(r37.invoke(Long.valueOf(key), Integer.valueOf(value)));
        index3 = index3 + 1;
        goto L20
    L15:
        $this$joinToString_u24lambda_u2410.append(r3);
    L30:
        String r1 = $this$joinToString_u24lambda_u2410.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    L20:
        slot$iv$iv = slot$iv$iv >> r9;
        j$iv$iv = j$iv$iv + 1;
        r0 = separator;
        r3 = truncated;
        r9 = r9;
        goto L7
    L11:
        r26 = false;
        goto L12
    L22:
        if (bitCount$iv$iv != r9) goto L29;
    L25:
        if (i$iv$iv == lastIndex$iv$iv) goto L29;
        i$iv$iv = i$iv$iv + 1;
        r0 = separator;
        r3 = truncated;
        index = index3;
        this_$iv = this_$iv2;
        $i$f$forEach = $i$f$forEach2;
        r8 = r23;
        goto L4
    L24:
        index3 = index2;
    L29:
        $this$joinToString_u24lambda_u2410.append(postfix);
        goto L30
    }

    public int hashCode() {
        int bitCount$iv$iv = 0;
        LongIntMap this_$iv = this;
        long[] k$iv = this_$iv.keys;
        int[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L23;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int hash = bitCount$iv$iv;
        LongIntMap this_$iv2 = this_$iv;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L17;
        int bitCount$iv$iv2 = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv2) goto L15;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r18 = true;
    L12:
        if (r18 == false) goto L14;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        long key = k$iv[index$iv$iv];
        int value = v$iv[index$iv$iv];
        hash = hash + (Long.hashCode(key) ^ Integer.hashCode(value));
    L14:
        slot$iv$iv = slot$iv$iv >> 8;
        j$iv$iv = j$iv$iv + 1;
        goto L7
    L11:
        r18 = false;
        goto L12
    L15:
        if (bitCount$iv$iv2 != 8) goto L29;
        bitCount$iv$iv = hash;
    L18:
        if (i$iv$iv == lastIndex$iv$iv) goto L23;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
        goto L4
    L29:
        return hash;
    L17:
        bitCount$iv$iv = hash;
    L23:
        return bitCount$iv$iv;
    }

    public boolean equals(Object other) {
        boolean r1 = true;
        if (other != this) goto L5;
        return true;
    L5:
        boolean r4 = false;
        if ((other instanceof LongIntMap) == true) goto L9;
        return false;
    L9:
        if (((LongIntMap) other).getSize() == getSize()) goto L11;
        return false;
    L11:
        LongIntMap this_$iv = this;
        int $i$f$forEach = 0;
        long[] k$iv = this_$iv.keys;
        int[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L41;
    L13:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        boolean r18 = r1;
        boolean r15 = r4;
        int $i$f$forEach2 = $i$f$forEach;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L35;
        int r2 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L16:
        if (j$iv$iv >= bitCount$iv$iv) goto L32;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L20;
        boolean r5 = r18;
    L21:
        if (r5 == false) goto L30;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        long key = k$iv[index$iv$iv];
        boolean r22 = r15;
        int value = v$iv[index$iv$iv];
        int index = ((LongIntMap) other).findKeyIndex(key);
        if (index < 0) goto L29;
        if (value != ((LongIntMap) other).values[index]) goto L29;
    L31:
        slot$iv$iv = slot$iv$iv >> r2;
        j$iv$iv = j$iv$iv + 1;
        this_$iv = this_$iv;
        r2 = r2;
        r15 = r22;
    L29:
        return r22;
    L30:
        r22 = r15;
        goto L31
    L20:
        r5 = r15;
        goto L21
    L32:
        LongIntMap this_$iv2 = this_$iv;
        boolean r23 = r15;
        if (bitCount$iv$iv != r2) goto L49;
    L36:
        if (i$iv$iv == lastIndex$iv$iv) goto L50;
        i$iv$iv = i$iv$iv + 1;
        $i$f$forEach = $i$f$forEach2;
        r1 = r18;
        this_$iv = this_$iv2;
        r4 = r23;
        goto L13
    L50:
        return r18;
    L49:
        return r18;
    L35:
        this_$iv2 = this_$iv;
        r23 = r15;
        goto L36
    L41:
        return true;
    }

    public String toString() {
        if (isEmpty() == false) goto L6;
        return "{}";
    L6:
        StringBuilder s = new StringBuilder().append('{');
        int bitCount$iv$iv = 0;
        LongIntMap this_$iv = this;
        int $i$f$forEach = 0;
        long[] k$iv = this_$iv.keys;
        int[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L32;
    L8:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int i = bitCount$iv$iv;
        LongIntMap this_$iv2 = this_$iv;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L27;
        int r2 = 8;
        int bitCount$iv$iv2 = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L11:
        if (j$iv$iv >= bitCount$iv$iv2) goto L24;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L15;
        boolean r19 = true;
    L16:
        if (r19 == false) goto L22;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int r20 = r2;
        int $i$f$forEach2 = $i$f$forEach;
        long key = k$iv[index$iv$iv];
        long[] k$iv2 = k$iv;
        int value = v$iv[index$iv$iv];
        s.append(key);
        s.append("=");
        s.append(value);
        int i2 = i + 1;
        int value2 = this._size;
        if (i2 >= value2) goto L20;
        i = i2;
        s.append(',').append(' ');
    L23:
        slot$iv$iv = slot$iv$iv >> r20;
        j$iv$iv = j$iv$iv + 1;
        $i$f$forEach = $i$f$forEach2;
        r2 = r20;
        k$iv = k$iv2;
        goto L11
    L20:
        i = i2;
        goto L23
    L22:
        r20 = r2;
        $i$f$forEach2 = $i$f$forEach;
        k$iv2 = k$iv;
        goto L23
    L15:
        r19 = false;
        goto L16
    L24:
        int $i$f$forEach3 = $i$f$forEach;
        long[] k$iv3 = k$iv;
        if (bitCount$iv$iv2 != r2) goto L32;
        bitCount$iv$iv = i;
    L28:
        if (i$iv$iv == lastIndex$iv$iv) goto L32;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
        $i$f$forEach = $i$f$forEach3;
        k$iv = k$iv3;
        goto L8
    L27:
        $i$f$forEach3 = $i$f$forEach;
        k$iv3 = k$iv;
        bitCount$iv$iv = i;
    L32:
        String r1 = s.append('}').toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    }

    public final int findKeyIndex(long key) {
        int hash$iv = Long.hashCode(key) * ScatterMapKt.MurmurHashC1;
        int hash = hash$iv ^ (hash$iv << 16);
        int hash2 = hash & WorkQueueKt.MASK;
        int probeMask = this._capacity;
        int $i$f$h1 = hash >>> 7;
        int probeOffset = $i$f$h1 & probeMask;
        int probeIndex = 0;
    L3:
        long[] metadata$iv = this.metadata;
        int i$iv = probeOffset >> 3;
        int b$iv = (probeOffset & 7) << 3;
        long g = (metadata$iv[i$iv] >>> b$iv) | ((metadata$iv[i$iv + 1] << (64 - b$iv)) & ((-b$iv) >> 63));
        long x$iv = (((long) hash2) * ScatterMapKt.BitmaskLsb) ^ g;
        int hash3 = hash;
        int hash4 = hash2;
        long m = ((~x$iv) & (x$iv - ScatterMapKt.BitmaskLsb)) & (-9187201950435737472L);
    L4:
        long $this$hasNext$iv = m;
        if ($this$hasNext$iv == 0) goto L7;
        boolean r17 = true;
    L8:
        if (r17 == false) goto L13;
        long $this$get$iv = m;
        int index = ((Long.numberOfTrailingZeros($this$get$iv) >> 3) + probeOffset) & probeMask;
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
        probeOffset = (probeOffset + probeIndex) & probeMask;
        hash = hash3;
        hash2 = hash4;
        goto L3
    L15:
        return -1;
    L7:
        r17 = false;
        goto L8
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, Function2<? super Long, ? super Integer, ? extends CharSequence> r38) {
        CharSequence r0 = separator;
        Intrinsics.checkNotNullParameter(r0, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(r38, "transform");
        int $i$f$joinToString = 0;
        StringBuilder $this$joinToString_u24lambda_u2410$iv = new StringBuilder();
        int r9 = 0;
        $this$joinToString_u24lambda_u2410$iv.append(prefix);
        int index$iv = 0;
        long[] k$iv$iv = this.keys;
        int[] v$iv$iv = this.values;
        long[] m$iv$iv$iv = this.metadata;
        int $i$f$joinToString2 = m$iv$iv$iv.length;
        int lastIndex$iv$iv$iv = $i$f$joinToString2 - 2;
        int i$iv$iv$iv = 0;
        if (0 > lastIndex$iv$iv$iv) goto L27;
    L4:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
        int $i$f$joinToString3 = $i$f$joinToString;
        StringBuilder r25 = $this$joinToString_u24lambda_u2410$iv;
        int r21 = r9;
        int index$iv2 = index$iv;
        long $this$maskEmptyOrDeleted$iv$iv$iv$iv = (((~slot$iv$iv$iv) << 7) & slot$iv$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv$iv == (-9187201950435737472L)) goto L24;
        int r7 = 8;
        int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
        int j$iv$iv$iv = 0;
        index$iv = index$iv2;
    L7:
        if (j$iv$iv$iv >= bitCount$iv$iv$iv) goto L21;
        long value$iv$iv$iv$iv = slot$iv$iv$iv & 255;
        if (value$iv$iv$iv$iv >= 128) goto L11;
        boolean r27 = true;
    L12:
        if (r27 == false) goto L20;
        int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
        long key$iv = k$iv$iv[index$iv$iv$iv];
        int value$iv = v$iv$iv[index$iv$iv$iv];
        if (index$iv == limit) goto L15;
        if (index$iv == 0) goto L18;
        $this$joinToString_u24lambda_u2410$iv.append(r0);
    L18:
        $this$joinToString_u24lambda_u2410$iv.append(r38.invoke(Long.valueOf(key$iv), Integer.valueOf(value$iv)));
        index$iv = index$iv + 1;
        goto L20
    L15:
        $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
    L30:
        String r1 = r25.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    L20:
        slot$iv$iv$iv = slot$iv$iv$iv >> r7;
        j$iv$iv$iv = j$iv$iv$iv + 1;
        r0 = separator;
        r7 = r7;
        CharSequence truncated$iv = truncated$iv;
        goto L7
    L11:
        r27 = false;
        goto L12
    L21:
        CharSequence truncated$iv2 = truncated$iv;
        if (bitCount$iv$iv$iv != r7) goto L29;
    L25:
        if (i$iv$iv$iv == lastIndex$iv$iv$iv) goto L29;
        i$iv$iv$iv = i$iv$iv$iv + 1;
        r0 = separator;
        r9 = r21;
        $i$f$joinToString = $i$f$joinToString3;
        $this$joinToString_u24lambda_u2410$iv = r25;
        truncated$iv = truncated$iv2;
    L29:
        $this$joinToString_u24lambda_u2410$iv.append(postfix);
        goto L30
    L24:
        truncated$iv2 = truncated$iv;
        index$iv = index$iv2;
        goto L25
    L27:
        r25 = $this$joinToString_u24lambda_u2410$iv;
        goto L29
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, Function2<? super Long, ? super Integer, ? extends CharSequence> r37) {
        CharSequence r0 = separator;
        Intrinsics.checkNotNullParameter(r0, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(r37, "transform");
        int $i$f$joinToString = 0;
        StringBuilder $this$joinToString_u24lambda_u2410$iv = new StringBuilder();
        int r10 = 0;
        $this$joinToString_u24lambda_u2410$iv.append(prefix);
        int index$iv = 0;
        long[] k$iv$iv = this.keys;
        int[] v$iv$iv = this.values;
        long[] m$iv$iv$iv = this.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 > lastIndex$iv$iv$iv) goto L27;
    L4:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
        int $i$f$joinToString2 = $i$f$joinToString;
        StringBuilder r26 = $this$joinToString_u24lambda_u2410$iv;
        int r22 = r10;
        int index$iv2 = index$iv;
        long $this$maskEmptyOrDeleted$iv$iv$iv$iv = (((~slot$iv$iv$iv) << 7) & slot$iv$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv$iv == (-9187201950435737472L)) goto L24;
        int r8 = 8;
        int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
        int j$iv$iv$iv = 0;
        index$iv = index$iv2;
    L7:
        if (j$iv$iv$iv >= bitCount$iv$iv$iv) goto L22;
        long value$iv$iv$iv$iv = slot$iv$iv$iv & 255;
        if (value$iv$iv$iv$iv >= 128) goto L11;
        boolean r28 = true;
    L12:
        if (r28 == false) goto L20;
        int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
        long key$iv = k$iv$iv[index$iv$iv$iv];
        int value$iv = v$iv$iv[index$iv$iv$iv];
        if (index$iv == (-1)) goto L15;
        if (index$iv == 0) goto L18;
        $this$joinToString_u24lambda_u2410$iv.append(r0);
    L18:
        $this$joinToString_u24lambda_u2410$iv.append(r37.invoke(Long.valueOf(key$iv), Integer.valueOf(value$iv)));
        index$iv = index$iv + 1;
        goto L20
    L15:
        $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
    L30:
        String r1 = r26.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    L20:
        slot$iv$iv$iv = slot$iv$iv$iv >> r8;
        j$iv$iv$iv = j$iv$iv$iv + 1;
        r0 = separator;
        r8 = r8;
        goto L7
    L11:
        r28 = false;
        goto L12
    L22:
        if (bitCount$iv$iv$iv != r8) goto L29;
    L25:
        if (i$iv$iv$iv == lastIndex$iv$iv$iv) goto L29;
        i$iv$iv$iv = i$iv$iv$iv + 1;
        r0 = separator;
        r10 = r22;
        $i$f$joinToString = $i$f$joinToString2;
        $this$joinToString_u24lambda_u2410$iv = r26;
    L29:
        $this$joinToString_u24lambda_u2410$iv.append(postfix);
        goto L30
    L24:
        index$iv = index$iv2;
        goto L25
    L27:
        r26 = $this$joinToString_u24lambda_u2410$iv;
        goto L29
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, Function2<? super Long, ? super Integer, ? extends CharSequence> r36) {
        CharSequence r0 = separator;
        Intrinsics.checkNotNullParameter(r0, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(r36, "transform");
        int $i$f$joinToString = 0;
        StringBuilder $this$joinToString_u24lambda_u2410$iv = new StringBuilder();
        int r10 = 0;
        $this$joinToString_u24lambda_u2410$iv.append(prefix);
        int index$iv = 0;
        long[] k$iv$iv = this.keys;
        int[] v$iv$iv = this.values;
        long[] m$iv$iv$iv = this.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 > lastIndex$iv$iv$iv) goto L27;
    L4:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
        int $i$f$joinToString2 = $i$f$joinToString;
        StringBuilder r26 = $this$joinToString_u24lambda_u2410$iv;
        int r22 = r10;
        int index$iv2 = index$iv;
        long $this$maskEmptyOrDeleted$iv$iv$iv$iv = (((~slot$iv$iv$iv) << 7) & slot$iv$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv$iv == (-9187201950435737472L)) goto L24;
        int r8 = 8;
        int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
        int j$iv$iv$iv = 0;
        index$iv = index$iv2;
    L7:
        if (j$iv$iv$iv >= bitCount$iv$iv$iv) goto L22;
        long value$iv$iv$iv$iv = slot$iv$iv$iv & 255;
        if (value$iv$iv$iv$iv >= 128) goto L11;
        boolean r28 = true;
    L12:
        if (r28 == false) goto L20;
        int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
        long key$iv = k$iv$iv[index$iv$iv$iv];
        int value$iv = v$iv$iv[index$iv$iv$iv];
        if (index$iv == (-1)) goto L15;
        if (index$iv == 0) goto L18;
        $this$joinToString_u24lambda_u2410$iv.append(r0);
    L18:
        $this$joinToString_u24lambda_u2410$iv.append(r36.invoke(Long.valueOf(key$iv), Integer.valueOf(value$iv)));
        index$iv = index$iv + 1;
        goto L20
    L15:
        $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
    L30:
        String r1 = r26.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    L20:
        slot$iv$iv$iv = slot$iv$iv$iv >> r8;
        j$iv$iv$iv = j$iv$iv$iv + 1;
        r0 = separator;
        r8 = r8;
        goto L7
    L11:
        r28 = false;
        goto L12
    L22:
        if (bitCount$iv$iv$iv != r8) goto L29;
    L25:
        if (i$iv$iv$iv == lastIndex$iv$iv$iv) goto L29;
        i$iv$iv$iv = i$iv$iv$iv + 1;
        r0 = separator;
        r10 = r22;
        $i$f$joinToString = $i$f$joinToString2;
        $this$joinToString_u24lambda_u2410$iv = r26;
    L29:
        $this$joinToString_u24lambda_u2410$iv.append(postfix$iv);
        goto L30
    L24:
        index$iv = index$iv2;
        goto L25
    L27:
        r26 = $this$joinToString_u24lambda_u2410$iv;
        goto L29
    }

    public final String joinToString(CharSequence separator, Function2<? super Long, ? super Integer, ? extends CharSequence> r36) {
        CharSequence r0 = separator;
        Intrinsics.checkNotNullParameter(r0, "separator");
        Intrinsics.checkNotNullParameter(r36, "transform");
        int $i$f$joinToString = 0;
        StringBuilder $this$joinToString_u24lambda_u2410$iv = new StringBuilder();
        int r10 = 0;
        $this$joinToString_u24lambda_u2410$iv.append(prefix$iv);
        int index$iv = 0;
        long[] k$iv$iv = this.keys;
        int[] v$iv$iv = this.values;
        long[] m$iv$iv$iv = this.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 > lastIndex$iv$iv$iv) goto L27;
    L4:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
        int $i$f$joinToString2 = $i$f$joinToString;
        StringBuilder r27 = $this$joinToString_u24lambda_u2410$iv;
        int r23 = r10;
        int index$iv2 = index$iv;
        long $this$maskEmptyOrDeleted$iv$iv$iv$iv = (((~slot$iv$iv$iv) << 7) & slot$iv$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv$iv == (-9187201950435737472L)) goto L24;
        int r8 = 8;
        int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
        int j$iv$iv$iv = 0;
        index$iv = index$iv2;
    L7:
        if (j$iv$iv$iv >= bitCount$iv$iv$iv) goto L22;
        long value$iv$iv$iv$iv = slot$iv$iv$iv & 255;
        if (value$iv$iv$iv$iv >= 128) goto L11;
        boolean r29 = true;
    L12:
        if (r29 == false) goto L20;
        int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
        long key$iv = k$iv$iv[index$iv$iv$iv];
        int value$iv = v$iv$iv[index$iv$iv$iv];
        if (index$iv == (-1)) goto L15;
        if (index$iv == 0) goto L18;
        $this$joinToString_u24lambda_u2410$iv.append(r0);
    L18:
        $this$joinToString_u24lambda_u2410$iv.append(r36.invoke(Long.valueOf(key$iv), Integer.valueOf(value$iv)));
        index$iv = index$iv + 1;
        goto L20
    L15:
        $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
    L30:
        String r1 = r27.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    L20:
        slot$iv$iv$iv = slot$iv$iv$iv >> r8;
        j$iv$iv$iv = j$iv$iv$iv + 1;
        r0 = separator;
        r8 = r8;
        goto L7
    L11:
        r29 = false;
        goto L12
    L22:
        if (bitCount$iv$iv$iv != r8) goto L29;
    L25:
        if (i$iv$iv$iv == lastIndex$iv$iv$iv) goto L29;
        i$iv$iv$iv = i$iv$iv$iv + 1;
        r0 = separator;
        r10 = r23;
        $i$f$joinToString = $i$f$joinToString2;
        $this$joinToString_u24lambda_u2410$iv = r27;
    L29:
        $this$joinToString_u24lambda_u2410$iv.append(postfix$iv);
        goto L30
    L24:
        index$iv = index$iv2;
        goto L25
    L27:
        r27 = $this$joinToString_u24lambda_u2410$iv;
        goto L29
    }

    public final String joinToString(Function2<? super Long, ? super Integer, ? extends CharSequence> r36) {
        Intrinsics.checkNotNullParameter(r36, "transform");
        int $i$f$joinToString = 0;
        StringBuilder $this$joinToString_u24lambda_u2410$iv = new StringBuilder();
        int r10 = 0;
        $this$joinToString_u24lambda_u2410$iv.append(prefix$iv);
        int index$iv = 0;
        long[] k$iv$iv = this.keys;
        int[] v$iv$iv = this.values;
        long[] m$iv$iv$iv = this.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 > lastIndex$iv$iv$iv) goto L27;
    L4:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
        int $i$f$joinToString2 = $i$f$joinToString;
        StringBuilder r27 = $this$joinToString_u24lambda_u2410$iv;
        int r23 = r10;
        int index$iv2 = index$iv;
        long $this$maskEmptyOrDeleted$iv$iv$iv$iv = (((~slot$iv$iv$iv) << 7) & slot$iv$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv$iv == (-9187201950435737472L)) goto L24;
        int r8 = 8;
        int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
        int j$iv$iv$iv = 0;
        index$iv = index$iv2;
    L7:
        if (j$iv$iv$iv >= bitCount$iv$iv$iv) goto L21;
        long value$iv$iv$iv$iv = slot$iv$iv$iv & 255;
        if (value$iv$iv$iv$iv >= 128) goto L11;
        boolean r29 = true;
    L12:
        if (r29 == false) goto L20;
        int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
        long key$iv = k$iv$iv[index$iv$iv$iv];
        int value$iv = v$iv$iv[index$iv$iv$iv];
        if (index$iv == (-1)) goto L15;
        if (index$iv == 0) goto L18;
        $this$joinToString_u24lambda_u2410$iv.append(separator$iv);
    L18:
        $this$joinToString_u24lambda_u2410$iv.append(r36.invoke(Long.valueOf(key$iv), Integer.valueOf(value$iv)));
        index$iv = index$iv + 1;
        goto L20
    L15:
        $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
    L30:
        String r1 = r27.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    L20:
        slot$iv$iv$iv = slot$iv$iv$iv >> r8;
        j$iv$iv$iv = j$iv$iv$iv + 1;
        r8 = r8;
        CharSequence separator$iv = separator$iv;
        goto L7
    L11:
        r29 = false;
        goto L12
    L21:
        CharSequence separator$iv2 = separator$iv;
        if (bitCount$iv$iv$iv != r8) goto L29;
    L25:
        if (i$iv$iv$iv == lastIndex$iv$iv$iv) goto L29;
        i$iv$iv$iv = i$iv$iv$iv + 1;
        r10 = r23;
        $i$f$joinToString = $i$f$joinToString2;
        $this$joinToString_u24lambda_u2410$iv = r27;
        separator$iv = separator$iv2;
    L29:
        $this$joinToString_u24lambda_u2410$iv.append(postfix$iv);
        goto L30
    L24:
        separator$iv2 = separator$iv;
        index$iv = index$iv2;
        goto L25
    L27:
        r27 = $this$joinToString_u24lambda_u2410$iv;
        goto L29
    }
}
