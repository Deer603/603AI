package androidx.collection;

import androidx.autofill.HintConstants;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: IntSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J:\u0010\u0011\u001a\u00020\u00122!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00120\u0014H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010\u0018\u001a\u00020\u0012J:\u0010\u0018\u001a\u00020\u00122!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00120\u0014H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0011\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0004H\u0086\u0002J\b\u0010\u001a\u001a\u00020\u0004H\u0007J:\u0010\u001a\u001a\u00020\u00042!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00120\u0014H\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0013\u0010\u001b\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0016\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0080\b¢\u0006\u0002\b\u001eJ\t\u0010\u001f\u001a\u00020\u0004H\u0086\bJ:\u0010\u001f\u001a\u00020\u00042!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00120\u0014H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010 \u001a\u00020!2!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020!0\u0014H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010#\u001a\u00020!2!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b($\u0012\u0004\u0012\u00020!0\u0014H\u0081\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\b\u0010%\u001a\u00020\u0004H\u0016J\u0006\u0010&\u001a\u00020\u0012J\u0006\u0010'\u001a\u00020\u0012J:\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020+H\u0007JT\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020+2\u0014\b\u0004\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020+0\u0014H\u0087\bø\u0001\u0000J\u0006\u00101\u001a\u00020\u0012J\b\u00102\u001a\u00020)H\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u00020\n8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u0018\u0010\f\u001a\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0002R\u0011\u0010\u000f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\b\u0082\u0001\u00013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00064"}, d2 = {"Landroidx/collection/IntSet;", "", "()V", "_capacity", "", "_size", "capacity", "getCapacity", "()I", "elements", "", "getElements$annotations", "metadata", "", "getMetadata$annotations", "size", "getSize", "all", "", "predicate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "element", "any", "contains", "count", "equals", "other", "findElementIndex", "findElementIndex$collection", "first", "forEach", "", "block", "forEachIndex", "index", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "none", "toString", "Landroidx/collection/MutableIntSet;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class IntSet {
    public int _capacity;
    public int _size;
    public int[] elements;
    public long[] metadata;

    public /* synthetic */ IntSet(DefaultConstructorMarker r1) {
        this();
    }

    public static /* synthetic */ void getElements$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    private IntSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = IntSetKt.getEmptyIntArray();
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

    public final int first() {
        int[] k$iv = this.elements;
        long[] m$iv$iv = this.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L21;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L17;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L16;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r17 = true;
    L12:
        if (r17 == true) goto L13;
        slot$iv$iv = slot$iv$iv >> 8;
        j$iv$iv = j$iv$iv + 1;
        goto L7
    L13:
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int it = k$iv[index$iv$iv];
        return it;
    L11:
        r17 = false;
        goto L12
    L16:
        if (bitCount$iv$iv != 8) goto L21;
    L17:
        if (i$iv$iv == lastIndex$iv$iv) goto L21;
        i$iv$iv = i$iv$iv + 1;
    L21:
        throw new NoSuchElementException("The IntSet is empty");
    }

    public final int first(Function1<? super Integer, Boolean> r22) {
        Intrinsics.checkNotNullParameter(r22, "predicate");
        int $i$f$first = 0;
        IntSet this_$iv = this;
        int[] k$iv = this_$iv.elements;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L26;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int $i$f$first2 = $i$f$first;
        IntSet this_$iv2 = this_$iv;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L21;
        int r2 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L20;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r18 = true;
    L12:
        if (r18 == false) goto L18;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int it = k$iv[index$iv$iv];
        if (r22.invoke(Integer.valueOf(it)).booleanValue() == false) goto L18;
        return it;
    L18:
        slot$iv$iv = slot$iv$iv >> r2;
        j$iv$iv = j$iv$iv + 1;
        r2 = r2;
        goto L7
    L11:
        r18 = false;
        goto L12
    L20:
        if (bitCount$iv$iv != r2) goto L26;
    L21:
        if (i$iv$iv == lastIndex$iv$iv) goto L26;
        i$iv$iv = i$iv$iv + 1;
        $i$f$first = $i$f$first2;
        this_$iv = this_$iv2;
    L26:
        throw new NoSuchElementException("Could not find a match");
    }

    public final void forEachIndex(Function1<? super Integer, Unit> r15) {
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

    public final void forEach(Function1<? super Integer, Unit> r20) {
        Intrinsics.checkNotNullParameter(r20, "block");
        int[] k = this.elements;
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
        r20.invoke(Integer.valueOf(k[index$iv]));
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

    public final boolean all(Function1<? super Integer, Boolean> r24) {
        Intrinsics.checkNotNullParameter(r24, "predicate");
        int[] k$iv = this.elements;
        long[] m$iv$iv = this.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L23;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long slot$iv$iv2 = slot$iv$iv;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L21;
        int r11 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L20;
        long value$iv$iv$iv = slot$iv$iv2 & 255;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r13 = true;
    L12:
        if (r13 == false) goto L18;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int element = k$iv[index$iv$iv];
        if (r24.invoke(Integer.valueOf(element)).booleanValue() == true) goto L18;
        return false;
    L18:
        slot$iv$iv2 = slot$iv$iv2 >> r11;
        j$iv$iv = j$iv$iv + 1;
        r11 = r11;
        goto L7
    L11:
        r13 = false;
        goto L12
    L20:
        if (bitCount$iv$iv == r11) goto L21;
        return true;
    L21:
        if (i$iv$iv == lastIndex$iv$iv) goto L34;
        i$iv$iv = i$iv$iv + 1;
        goto L4
    L34:
        return true;
    L23:
        return true;
    }

    public final boolean any(Function1<? super Integer, Boolean> r24) {
        Intrinsics.checkNotNullParameter(r24, "predicate");
        int[] k$iv = this.elements;
        long[] m$iv$iv = this.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L23;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long slot$iv$iv2 = slot$iv$iv;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L21;
        int r11 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L20;
        long value$iv$iv$iv = slot$iv$iv2 & 255;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r13 = true;
    L12:
        if (r13 == false) goto L18;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int element = k$iv[index$iv$iv];
        if (r24.invoke(Integer.valueOf(element)).booleanValue() == false) goto L18;
        return true;
    L18:
        slot$iv$iv2 = slot$iv$iv2 >> r11;
        j$iv$iv = j$iv$iv + 1;
        r11 = r11;
        goto L7
    L11:
        r13 = false;
        goto L12
    L20:
        if (bitCount$iv$iv == r11) goto L21;
        return false;
    L21:
        if (i$iv$iv == lastIndex$iv$iv) goto L34;
        i$iv$iv = i$iv$iv + 1;
        goto L4
    L34:
        return false;
    L23:
        return false;
    }

    public final int count() {
        return this._size;
    }

    public final int count(Function1<? super Integer, Boolean> r23) {
        Intrinsics.checkNotNullParameter(r23, "predicate");
        int $i$f$count = 0;
        int count = 0;
        int[] k$iv = this.elements;
        long[] m$iv$iv = this.metadata;
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
        if (j$iv$iv >= bitCount$iv$iv) goto L20;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r19 = true;
    L12:
        if (r19 == false) goto L17;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int element = k$iv[index$iv$iv];
        int r21 = r2;
        if (r23.invoke(Integer.valueOf(element)).booleanValue() == false) goto L18;
        count2 = count2 + 1;
    L18:
        slot$iv$iv = slot$iv$iv >> r21;
        j$iv$iv = j$iv$iv + 1;
        r2 = r21;
        goto L7
    L17:
        r21 = r2;
        goto L18
    L11:
        r19 = false;
        goto L12
    L20:
        if (bitCount$iv$iv != r2) goto L35;
        count = count2;
    L23:
        if (i$iv$iv == lastIndex$iv$iv) goto L28;
        i$iv$iv = i$iv$iv + 1;
        $i$f$count = $i$f$count2;
        goto L4
    L35:
        return count2;
    L22:
        count = count2;
    L28:
        return count;
    }

    public final boolean contains(int element) {
        int $i$f$findElementIndex$collection = 0;
        int hash$iv$iv = Integer.hashCode(element) * ScatterMapKt.MurmurHashC1;
        int hash$iv = hash$iv$iv ^ (hash$iv$iv << 16);
        int $i$f$h2 = hash$iv & WorkQueueKt.MASK;
        int probeMask$iv = this._capacity;
        int $i$f$h1 = hash$iv >>> 7;
        int probeOffset$iv = $i$f$h1 & probeMask$iv;
        int probeIndex$iv = 0;
    L3:
        long[] metadata$iv$iv = this.metadata;
        int i$iv$iv = probeOffset$iv >> 3;
        int b$iv$iv = (probeOffset$iv & 7) << 3;
        int $i$f$findElementIndex$collection2 = $i$f$findElementIndex$collection;
        int hash$iv2 = hash$iv;
        long g$iv = (((-b$iv$iv) >> 63) & (metadata$iv$iv[i$iv$iv + 1] << (64 - b$iv$iv))) | (metadata$iv$iv[i$iv$iv] >>> b$iv$iv);
        long x$iv$iv = (((long) $i$f$h2) * ScatterMapKt.BitmaskLsb) ^ g$iv;
        long m$iv = ((~x$iv$iv) & (x$iv$iv - ScatterMapKt.BitmaskLsb)) & (-9187201950435737472L);
    L4:
        long $this$hasNext$iv$iv = m$iv;
        if ($this$hasNext$iv$iv == 0) goto L7;
        boolean r7 = true;
    L8:
        if (r7 == false) goto L13;
        long $this$get$iv$iv = m$iv;
        int index$iv = ((Long.numberOfTrailingZeros($this$get$iv$iv) >> 3) + probeOffset$iv) & probeMask$iv;
        if (this.elements[index$iv] == element) goto L16;
        long $this$next$iv$iv = m$iv;
        m$iv = $this$next$iv$iv & ($this$next$iv$iv - 1);
    L16:
        if (index$iv >= 0) goto L18;
        return false;
    L18:
        return true;
    L13:
        long $this$maskEmpty$iv$iv = (((~g$iv) << 6) & g$iv) & (-9187201950435737472L);
        if ($this$maskEmpty$iv$iv != 0) goto L15;
        probeIndex$iv = probeIndex$iv + 8;
        probeOffset$iv = (probeOffset$iv + probeIndex$iv) & probeMask$iv;
        $i$f$findElementIndex$collection = $i$f$findElementIndex$collection2;
        hash$iv = hash$iv2;
        goto L3
    L15:
        index$iv = -1;
        goto L16
    L7:
        r7 = false;
        goto L8
    }

    public static /* synthetic */ String joinToString$default(IntSet r1, CharSequence r2, CharSequence r3, CharSequence r4, int r5, CharSequence r6, int r7, Object r8) {
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
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder $this$joinToString_u24lambda_u2413 = new StringBuilder();
        int r6 = 0;
        $this$joinToString_u24lambda_u2413.append(prefix);
        int index = 0;
        IntSet this_$iv = this;
        int $i$f$forEach = 0;
        int[] k$iv = this_$iv.elements;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L29;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int r21 = r6;
        int index2 = index;
        IntSet this_$iv2 = this_$iv;
        int $i$f$forEach2 = $i$f$forEach;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L24;
        int r7 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
        int index3 = index2;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L22;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r24 = true;
    L12:
        if (r24 == false) goto L20;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int element = k$iv[index$iv$iv];
        if (index3 == limit) goto L15;
        if (index3 == 0) goto L18;
        $this$joinToString_u24lambda_u2413.append(separator);
    L18:
        $this$joinToString_u24lambda_u2413.append(element);
        index3 = index3 + 1;
        goto L20
    L15:
        $this$joinToString_u24lambda_u2413.append(truncated);
    L30:
        String r4 = $this$joinToString_u24lambda_u2413.toString();
        Intrinsics.checkNotNullExpressionValue(r4, "toString(...)");
        return r4;
    L20:
        slot$iv$iv = slot$iv$iv >> r7;
        j$iv$iv = j$iv$iv + 1;
        r7 = r7;
        goto L7
    L11:
        r24 = false;
        goto L12
    L22:
        if (bitCount$iv$iv != r7) goto L29;
        index = index3;
    L25:
        if (i$iv$iv == lastIndex$iv$iv) goto L29;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
        $i$f$forEach = $i$f$forEach2;
        r6 = r21;
        goto L4
    L24:
        index = index2;
    L29:
        $this$joinToString_u24lambda_u2413.append(postfix);
        goto L30
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

    public static /* synthetic */ String joinToString$default(IntSet $this, CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1 transform, int r31, Object r32) {
        if (r32 != null) goto L55;
        if ((r31 & 1) == 0) goto L7;
    L9:
        if ((r31 & 2) == 0) goto L11;
    L13:
        if ((r31 & 4) == 0) goto L15;
    L17:
        if ((r31 & 8) == 0) goto L19;
        int limit2 = -1;
    L21:
        if ((r31 & 16) == 0) goto L23;
    L24:
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder $this$joinToString_u24lambda_u2415 = new StringBuilder();
        int r9 = 0;
        $this$joinToString_u24lambda_u2415.append(prefix);
        int index = 0;
        IntSet this_$iv = $this;
        int $i$f$forEach = 0;
        int[] k$iv = this_$iv.elements;
        long[] m$iv$iv = this_$iv.metadata;
        int $i$f$joinToString = m$iv$iv.length;
        int lastIndex$iv$iv = $i$f$joinToString - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L51;
    L26:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int r33 = r9;
        int index2 = index;
        IntSet this_$iv2 = this_$iv;
        int $i$f$forEach2 = $i$f$forEach;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L46;
        int r10 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
        int index3 = index2;
    L29:
        if (j$iv$iv >= bitCount$iv$iv) goto L44;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L33;
        boolean r21 = true;
    L34:
        if (r21 == false) goto L42;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int element = k$iv[index$iv$iv];
        if (index3 == limit2) goto L37;
        if (index3 == 0) goto L40;
        $this$joinToString_u24lambda_u2415.append(separator);
    L40:
        $this$joinToString_u24lambda_u2415.append((CharSequence) transform.invoke(Integer.valueOf(element)));
        index3 = index3 + 1;
        goto L42
    L37:
        $this$joinToString_u24lambda_u2415.append(truncated);
    L52:
        String r2 = $this$joinToString_u24lambda_u2415.toString();
        Intrinsics.checkNotNullExpressionValue(r2, "toString(...)");
        return r2;
    L42:
        slot$iv$iv = slot$iv$iv >> r10;
        j$iv$iv = j$iv$iv + 1;
        r10 = r10;
        goto L29
    L33:
        r21 = false;
        goto L34
    L44:
        if (bitCount$iv$iv != r10) goto L51;
        index = index3;
    L47:
        if (i$iv$iv == lastIndex$iv$iv) goto L51;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
        $i$f$forEach = $i$f$forEach2;
        r9 = r33;
        goto L26
    L46:
        index = index2;
    L51:
        $this$joinToString_u24lambda_u2415.append(postfix);
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
        CharSequence separator2 = separator;
        goto L9
    L55:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1<? super Integer, ? extends CharSequence> r34) {
        CharSequence r0 = separator;
        Intrinsics.checkNotNullParameter(r0, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        Intrinsics.checkNotNullParameter(r34, "transform");
        StringBuilder $this$joinToString_u24lambda_u2415 = new StringBuilder();
        int r8 = 0;
        $this$joinToString_u24lambda_u2415.append(prefix);
        int index = 0;
        IntSet this_$iv = this;
        int $i$f$forEach = 0;
        int[] k$iv = this_$iv.elements;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L29;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int r22 = r8;
        int index2 = index;
        IntSet this_$iv2 = this_$iv;
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
        boolean r25 = true;
    L12:
        if (r25 == false) goto L20;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int element = k$iv[index$iv$iv];
        if (index3 == limit) goto L15;
        if (index3 == 0) goto L18;
        $this$joinToString_u24lambda_u2415.append(r0);
    L18:
        $this$joinToString_u24lambda_u2415.append(r34.invoke(Integer.valueOf(element)));
        index3 = index3 + 1;
        goto L20
    L15:
        $this$joinToString_u24lambda_u2415.append(truncated);
    L30:
        String r1 = $this$joinToString_u24lambda_u2415.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    L20:
        slot$iv$iv = slot$iv$iv >> r9;
        j$iv$iv = j$iv$iv + 1;
        r0 = separator;
        r9 = r9;
        goto L7
    L11:
        r25 = false;
        goto L12
    L22:
        if (bitCount$iv$iv != r9) goto L29;
    L25:
        if (i$iv$iv == lastIndex$iv$iv) goto L29;
        i$iv$iv = i$iv$iv + 1;
        r0 = separator;
        index = index3;
        this_$iv = this_$iv2;
        $i$f$forEach = $i$f$forEach2;
        r8 = r22;
        goto L4
    L24:
        index3 = index2;
    L29:
        $this$joinToString_u24lambda_u2415.append(postfix);
        goto L30
    }

    public int hashCode() {
        int hash = 0;
        int[] k$iv = this.elements;
        long[] m$iv$iv = this.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L20;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L16;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L15;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r17 = true;
    L12:
        if (r17 == false) goto L14;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int element = k$iv[index$iv$iv];
        hash = hash + Integer.hashCode(element);
    L14:
        slot$iv$iv = slot$iv$iv >> 8;
        j$iv$iv = j$iv$iv + 1;
        goto L7
    L11:
        r17 = false;
        goto L12
    L15:
        if (bitCount$iv$iv != 8) goto L20;
    L16:
        if (i$iv$iv == lastIndex$iv$iv) goto L20;
        i$iv$iv = i$iv$iv + 1;
    L20:
        return hash;
    }

    public boolean equals(Object other) {
        boolean r2 = true;
        if (other != this) goto L5;
        return true;
    L5:
        boolean r4 = false;
        if ((other instanceof IntSet) == true) goto L9;
        return false;
    L9:
        if (((IntSet) other)._size == this._size) goto L11;
        return false;
    L11:
        IntSet this_$iv = this;
        int[] k$iv = this_$iv.elements;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L37;
    L13:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        boolean r17 = r2;
        IntSet this_$iv2 = this_$iv;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L31;
        int r3 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L16:
        if (j$iv$iv >= bitCount$iv$iv) goto L28;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L20;
        boolean r15 = r17;
    L21:
        if (r15 == false) goto L26;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        boolean r20 = r4;
        int element = k$iv[index$iv$iv];
        if (((IntSet) other).contains(element) == true) goto L27;
        return r20;
    L27:
        slot$iv$iv = slot$iv$iv >> r3;
        j$iv$iv = j$iv$iv + 1;
        r4 = r20;
        r3 = r3;
        goto L16
    L26:
        r20 = r4;
        goto L27
    L20:
        r15 = r4;
        goto L21
    L28:
        boolean r21 = r4;
        if (bitCount$iv$iv != r3) goto L45;
    L32:
        if (i$iv$iv == lastIndex$iv$iv) goto L44;
        i$iv$iv = i$iv$iv + 1;
        r2 = r17;
        this_$iv = this_$iv2;
        r4 = r21;
        goto L13
    L44:
        return r17;
    L45:
        return r17;
    L31:
        r21 = r4;
        goto L32
    L37:
        return true;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    public final int findElementIndex$collection(int element) {
        int $i$f$findElementIndex$collection = 0;
        int hash$iv = Integer.hashCode(element) * ScatterMapKt.MurmurHashC1;
        int hash = hash$iv ^ (hash$iv << 16);
        int $i$f$h2 = hash & WorkQueueKt.MASK;
        int probeMask = this._capacity;
        int $i$f$h1 = hash >>> 7;
        int probeOffset = $i$f$h1 & probeMask;
        int probeIndex = 0;
    L3:
        long[] metadata$iv = this.metadata;
        int i$iv = probeOffset >> 3;
        int b$iv = (probeOffset & 7) << 3;
        int $i$f$findElementIndex$collection2 = $i$f$findElementIndex$collection;
        int hash2 = hash;
        long g = (((-b$iv) >> 63) & (metadata$iv[i$iv + 1] << (64 - b$iv))) | (metadata$iv[i$iv] >>> b$iv);
        long x$iv = (((long) $i$f$h2) * ScatterMapKt.BitmaskLsb) ^ g;
        long m = ((~x$iv) & (x$iv - ScatterMapKt.BitmaskLsb)) & (-9187201950435737472L);
    L4:
        long $this$hasNext$iv = m;
        if ($this$hasNext$iv == 0) goto L7;
        boolean r14 = true;
    L8:
        if (r14 == false) goto L13;
        long $this$get$iv = m;
        int index = ((Long.numberOfTrailingZeros($this$get$iv) >> 3) + probeOffset) & probeMask;
        if (this.elements[index] == element) goto L11;
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
        $i$f$findElementIndex$collection = $i$f$findElementIndex$collection2;
        hash = hash2;
        goto L3
    L15:
        return -1;
    L7:
        r14 = false;
        goto L8
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, Function1<? super Integer, ? extends CharSequence> r34) {
        CharSequence r0 = separator;
        Intrinsics.checkNotNullParameter(r0, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(r34, "transform");
        int $i$f$joinToString = 0;
        StringBuilder $this$joinToString_u24lambda_u2415$iv = new StringBuilder();
        int r9 = 0;
        $this$joinToString_u24lambda_u2415$iv.append(prefix);
        int index$iv = 0;
        int[] k$iv$iv = this.elements;
        long[] m$iv$iv$iv = this.metadata;
        int $i$f$joinToString2 = m$iv$iv$iv.length;
        int lastIndex$iv$iv$iv = $i$f$joinToString2 - 2;
        int i$iv$iv$iv = 0;
        if (0 > lastIndex$iv$iv$iv) goto L27;
    L4:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
        int $i$f$joinToString3 = $i$f$joinToString;
        StringBuilder r24 = $this$joinToString_u24lambda_u2415$iv;
        int r20 = r9;
        int index$iv2 = index$iv;
        long $this$maskEmptyOrDeleted$iv$iv$iv$iv = (((~slot$iv$iv$iv) << 7) & slot$iv$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv$iv == (-9187201950435737472L)) goto L24;
        int r7 = 8;
        int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
        int j$iv$iv$iv = 0;
        index$iv = index$iv2;
    L7:
        if (j$iv$iv$iv >= bitCount$iv$iv$iv) goto L22;
        long value$iv$iv$iv$iv = slot$iv$iv$iv & 255;
        if (value$iv$iv$iv$iv >= 128) goto L11;
        boolean r26 = true;
    L12:
        if (r26 == false) goto L20;
        int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
        int element$iv = k$iv$iv[index$iv$iv$iv];
        if (index$iv == limit) goto L15;
        if (index$iv == 0) goto L18;
        $this$joinToString_u24lambda_u2415$iv.append(r0);
    L18:
        $this$joinToString_u24lambda_u2415$iv.append(r34.invoke(Integer.valueOf(element$iv)));
        index$iv = index$iv + 1;
        goto L20
    L15:
        $this$joinToString_u24lambda_u2415$iv.append(truncated$iv);
    L30:
        String r1 = r24.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    L20:
        slot$iv$iv$iv = slot$iv$iv$iv >> r7;
        j$iv$iv$iv = j$iv$iv$iv + 1;
        r0 = separator;
        r7 = r7;
        goto L7
    L11:
        r26 = false;
        goto L12
    L22:
        if (bitCount$iv$iv$iv != r7) goto L29;
    L25:
        if (i$iv$iv$iv == lastIndex$iv$iv$iv) goto L29;
        i$iv$iv$iv = i$iv$iv$iv + 1;
        r0 = separator;
        r9 = r20;
        $i$f$joinToString = $i$f$joinToString3;
        $this$joinToString_u24lambda_u2415$iv = r24;
    L29:
        $this$joinToString_u24lambda_u2415$iv.append(postfix);
        goto L30
    L24:
        index$iv = index$iv2;
        goto L25
    L27:
        r24 = $this$joinToString_u24lambda_u2415$iv;
        goto L29
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, Function1<? super Integer, ? extends CharSequence> r34) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(r34, "transform");
        int $i$f$joinToString = 0;
        StringBuilder $this$joinToString_u24lambda_u2415$iv = new StringBuilder();
        int r10 = 0;
        $this$joinToString_u24lambda_u2415$iv.append(prefix);
        int index$iv = 0;
        int[] k$iv$iv = this.elements;
        long[] m$iv$iv$iv = this.metadata;
        int $i$f$joinToString2 = m$iv$iv$iv.length;
        int lastIndex$iv$iv$iv = $i$f$joinToString2 - 2;
        int i$iv$iv$iv = 0;
        if (0 > lastIndex$iv$iv$iv) goto L27;
    L4:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
        int $i$f$joinToString3 = $i$f$joinToString;
        StringBuilder r25 = $this$joinToString_u24lambda_u2415$iv;
        int r21 = r10;
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
        boolean r27 = true;
    L12:
        if (r27 == false) goto L20;
        int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
        int element$iv = k$iv$iv[index$iv$iv$iv];
        if (index$iv == (-1)) goto L15;
        if (index$iv == 0) goto L18;
        $this$joinToString_u24lambda_u2415$iv.append(separator);
    L18:
        $this$joinToString_u24lambda_u2415$iv.append(r34.invoke(Integer.valueOf(element$iv)));
        index$iv = index$iv + 1;
        goto L20
    L15:
        $this$joinToString_u24lambda_u2415$iv.append(truncated$iv);
    L30:
        String r1 = r25.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    L20:
        slot$iv$iv$iv = slot$iv$iv$iv >> r8;
        j$iv$iv$iv = j$iv$iv$iv + 1;
        r8 = r8;
        goto L7
    L11:
        r27 = false;
        goto L12
    L22:
        if (bitCount$iv$iv$iv != r8) goto L29;
    L25:
        if (i$iv$iv$iv == lastIndex$iv$iv$iv) goto L29;
        i$iv$iv$iv = i$iv$iv$iv + 1;
        r10 = r21;
        $i$f$joinToString = $i$f$joinToString3;
        $this$joinToString_u24lambda_u2415$iv = r25;
    L29:
        $this$joinToString_u24lambda_u2415$iv.append(postfix);
        goto L30
    L24:
        index$iv = index$iv2;
        goto L25
    L27:
        r25 = $this$joinToString_u24lambda_u2415$iv;
        goto L29
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, Function1<? super Integer, ? extends CharSequence> r33) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(r33, "transform");
        int $i$f$joinToString = 0;
        StringBuilder $this$joinToString_u24lambda_u2415$iv = new StringBuilder();
        int r10 = 0;
        $this$joinToString_u24lambda_u2415$iv.append(prefix);
        int index$iv = 0;
        int[] k$iv$iv = this.elements;
        long[] m$iv$iv$iv = this.metadata;
        int $i$f$joinToString2 = m$iv$iv$iv.length;
        int lastIndex$iv$iv$iv = $i$f$joinToString2 - 2;
        int i$iv$iv$iv = 0;
        if (0 > lastIndex$iv$iv$iv) goto L27;
    L4:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
        int $i$f$joinToString3 = $i$f$joinToString;
        StringBuilder r25 = $this$joinToString_u24lambda_u2415$iv;
        int r21 = r10;
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
        boolean r27 = true;
    L12:
        if (r27 == false) goto L20;
        int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
        int element$iv = k$iv$iv[index$iv$iv$iv];
        if (index$iv == (-1)) goto L15;
        if (index$iv == 0) goto L18;
        $this$joinToString_u24lambda_u2415$iv.append(separator);
    L18:
        $this$joinToString_u24lambda_u2415$iv.append(r33.invoke(Integer.valueOf(element$iv)));
        index$iv = index$iv + 1;
        goto L20
    L15:
        $this$joinToString_u24lambda_u2415$iv.append(truncated$iv);
    L30:
        String r1 = r25.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    L20:
        slot$iv$iv$iv = slot$iv$iv$iv >> r8;
        j$iv$iv$iv = j$iv$iv$iv + 1;
        r8 = r8;
        goto L7
    L11:
        r27 = false;
        goto L12
    L22:
        if (bitCount$iv$iv$iv != r8) goto L29;
    L25:
        if (i$iv$iv$iv == lastIndex$iv$iv$iv) goto L29;
        i$iv$iv$iv = i$iv$iv$iv + 1;
        r10 = r21;
        $i$f$joinToString = $i$f$joinToString3;
        $this$joinToString_u24lambda_u2415$iv = r25;
    L29:
        $this$joinToString_u24lambda_u2415$iv.append(postfix$iv);
        goto L30
    L24:
        index$iv = index$iv2;
        goto L25
    L27:
        r25 = $this$joinToString_u24lambda_u2415$iv;
        goto L29
    }

    public final String joinToString(CharSequence separator, Function1<? super Integer, ? extends CharSequence> r33) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(r33, "transform");
        int $i$f$joinToString = 0;
        StringBuilder $this$joinToString_u24lambda_u2415$iv = new StringBuilder();
        int r10 = 0;
        $this$joinToString_u24lambda_u2415$iv.append(prefix$iv);
        int index$iv = 0;
        int[] k$iv$iv = this.elements;
        long[] m$iv$iv$iv = this.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 > lastIndex$iv$iv$iv) goto L27;
    L4:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
        int $i$f$joinToString2 = $i$f$joinToString;
        StringBuilder r26 = $this$joinToString_u24lambda_u2415$iv;
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
        int element$iv = k$iv$iv[index$iv$iv$iv];
        if (index$iv == (-1)) goto L15;
        if (index$iv == 0) goto L18;
        $this$joinToString_u24lambda_u2415$iv.append(separator);
    L18:
        $this$joinToString_u24lambda_u2415$iv.append(r33.invoke(Integer.valueOf(element$iv)));
        index$iv = index$iv + 1;
        goto L20
    L15:
        $this$joinToString_u24lambda_u2415$iv.append(truncated$iv);
    L30:
        String r2 = r26.toString();
        Intrinsics.checkNotNullExpressionValue(r2, "toString(...)");
        return r2;
    L20:
        slot$iv$iv$iv = slot$iv$iv$iv >> r8;
        j$iv$iv$iv = j$iv$iv$iv + 1;
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
        r10 = r22;
        $i$f$joinToString = $i$f$joinToString2;
        $this$joinToString_u24lambda_u2415$iv = r26;
    L29:
        $this$joinToString_u24lambda_u2415$iv.append(postfix$iv);
        goto L30
    L24:
        index$iv = index$iv2;
        goto L25
    L27:
        r26 = $this$joinToString_u24lambda_u2415$iv;
        goto L29
    }

    public final String joinToString(Function1<? super Integer, ? extends CharSequence> r32) {
        Intrinsics.checkNotNullParameter(r32, "transform");
        int $i$f$joinToString = 0;
        StringBuilder $this$joinToString_u24lambda_u2415$iv = new StringBuilder();
        int r10 = 0;
        $this$joinToString_u24lambda_u2415$iv.append(prefix$iv);
        int index$iv = 0;
        int[] k$iv$iv = this.elements;
        long[] m$iv$iv$iv = this.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 > lastIndex$iv$iv$iv) goto L27;
    L4:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
        int $i$f$joinToString2 = $i$f$joinToString;
        StringBuilder r26 = $this$joinToString_u24lambda_u2415$iv;
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
        int element$iv = k$iv$iv[index$iv$iv$iv];
        if (index$iv == (-1)) goto L15;
        if (index$iv == 0) goto L18;
        $this$joinToString_u24lambda_u2415$iv.append(separator$iv);
    L18:
        $this$joinToString_u24lambda_u2415$iv.append(r32.invoke(Integer.valueOf(element$iv)));
        index$iv = index$iv + 1;
        goto L20
    L15:
        $this$joinToString_u24lambda_u2415$iv.append(truncated$iv);
    L30:
        String r1 = r26.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    L20:
        slot$iv$iv$iv = slot$iv$iv$iv >> r8;
        j$iv$iv$iv = j$iv$iv$iv + 1;
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
        r10 = r22;
        $i$f$joinToString = $i$f$joinToString2;
        $this$joinToString_u24lambda_u2415$iv = r26;
    L29:
        $this$joinToString_u24lambda_u2415$iv.append(postfix$iv);
        goto L30
    L24:
        index$iv = index$iv2;
        goto L25
    L27:
        r26 = $this$joinToString_u24lambda_u2415$iv;
        goto L29
    }
}
