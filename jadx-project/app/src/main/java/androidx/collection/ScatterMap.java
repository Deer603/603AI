package androidx.collection;

import androidx.autofill.HintConstants;
import androidx.collection.internal.ContainerHelpersKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0004J&\u0010\u0016\u001a\u00020\u00172\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000J\u0006\u0010\u001a\u001a\u00020\u0017J&\u0010\u001a\u001a\u00020\u00172\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000J\r\u0010\u001b\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001dJ\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fJ\u0016\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u00172\u0006\u0010!\u001a\u00028\u0000¢\u0006\u0002\u0010\"J\u0013\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00028\u0001¢\u0006\u0002\u0010\"J\u0006\u0010&\u001a\u00020\u0006J&\u0010&\u001a\u00020\u00062\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000J\u0013\u0010'\u001a\u00020\u00172\b\u0010(\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\u0018\u0010)\u001a\u00020\u00062\u0006\u0010!\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b*\u0010+JD\u0010,\u001a\u00020-26\u0010.\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(!\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020-0\u0019H\u0086\bø\u0001\u0000J/\u00101\u001a\u00020-2!\u0010.\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(3\u0012\u0004\u0012\u00020-02H\u0081\bø\u0001\u0000J/\u00104\u001a\u00020-2!\u0010.\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020-02H\u0086\bø\u0001\u0000J/\u00105\u001a\u00020-2!\u0010.\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020-02H\u0086\bø\u0001\u0000J\u0018\u00106\u001a\u0004\u0018\u00018\u00012\u0006\u0010!\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u00107J\u001b\u00108\u001a\u00028\u00012\u0006\u0010!\u001a\u00028\u00002\u0006\u00109\u001a\u00028\u0001¢\u0006\u0002\u0010:J'\u0010;\u001a\u00028\u00012\u0006\u0010!\u001a\u00028\u00002\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u00010<H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010=J\b\u0010>\u001a\u00020\u0006H\u0016J\u0006\u0010?\u001a\u00020\u0017J\u0006\u0010@\u001a\u00020\u0017Jv\u0010A\u001a\u00020\u001c2\b\b\u0002\u0010B\u001a\u00020C2\b\b\u0002\u0010D\u001a\u00020C2\b\b\u0002\u0010E\u001a\u00020C2\b\b\u0002\u0010F\u001a\u00020\u00062\b\b\u0002\u0010G\u001a\u00020C2:\b\u0002\u0010H\u001a4\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(!\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020C\u0018\u00010\u0019H\u0007J\u0006\u0010I\u001a\u00020\u0017J\b\u0010J\u001a\u00020\u001cH\u0016R\u0012\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\f8\u0000@\u0000X\u0081\u000e¢\u0006\n\n\u0002\u0010\u000e\u0012\u0004\b\r\u0010\u0004R\u0018\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0004R\u0011\u0010\u0012\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\nR\"\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\f8\u0000@\u0000X\u0081\u000e¢\u0006\n\n\u0002\u0010\u000e\u0012\u0004\b\u0015\u0010\u0004\u0082\u0001\u0001K\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006L"}, d2 = {"Landroidx/collection/ScatterMap;", "K", "V", "", "()V", "_capacity", "", "_size", "capacity", "getCapacity", "()I", "keys", "", "getKeys$annotations", "[Ljava/lang/Object;", "metadata", "", "getMetadata$annotations", "size", "getSize", "values", "getValues$annotations", "all", "", "predicate", "Lkotlin/Function2;", "any", "asDebugString", "", "asDebugString$collection", "asMap", "", "contains", "key", "(Ljava/lang/Object;)Z", "containsKey", "containsValue", "value", "count", "equals", "other", "findKeyIndex", "findKeyIndex$collection", "(Ljava/lang/Object;)I", "forEach", "", "block", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "forEachIndexed", "Lkotlin/Function1;", "index", "forEachKey", "forEachValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "getOrDefault", "defaultValue", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getOrElse", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "none", "toString", "Landroidx/collection/MutableScatterMap;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ScatterMap<K, V> {
    public int _capacity;
    public int _size;
    public Object[] keys;
    public long[] metadata;
    public Object[] values;

    public /* synthetic */ ScatterMap(DefaultConstructorMarker r1) {
        this();
    }

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    private ScatterMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = ContainerHelpersKt.EMPTY_OBJECTS;
        this.values = ContainerHelpersKt.EMPTY_OBJECTS;
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

    public final V get(K r24) {
        int r2 = 0;
        if (r24 == null) goto L5;
        int r5 = r24.hashCode();
    L6:
        int r6 = r5 * ScatterMapKt.MurmurHashC1;
        int r3 = r6 ^ (r6 << 16);
        int r7 = r3 & WorkQueueKt.MASK;
        int r8 = this._capacity;
        int r9 = (r3 >>> 7) & r8;
        int r10 = 0;
    L7:
        long[] r11 = this.metadata;
        int r12 = r9 >> 3;
        int r13 = (r9 & 7) << 3;
        int r18 = r7;
        long r4 = (((-r13) >> 63) & (r11[r12 + 1] << (64 - r13))) | (r11[r12] >>> r13);
        long r14 = (((long) r18) * ScatterMapKt.BitmaskLsb) ^ r4;
        int r19 = r2;
        int r110 = r3;
        long r15 = ((~r14) & (r14 - ScatterMapKt.BitmaskLsb)) & (-9187201950435737472L);
    L9:
        if (r15 == 0) goto L11;
        boolean r20 = true;
    L12:
        if (r20 == false) goto L18;
        int r16 = ((Long.numberOfTrailingZeros(r15) >> 3) + r9) & r8;
        if (Intrinsics.areEqual(this.keys[r16], r24) == true) goto L21;
        long r17 = r15;
        r15 = r17 & (r17 - 1);
    L21:
        if (r16 < 0) goto L24;
        return (V) this.values[r16];
    L24:
        return null;
    L18:
        if (((((~r4) << 6) & r4) & (-9187201950435737472L)) != 0) goto L19;
        r10 = r10 + 8;
        r9 = (r9 + r10) & r8;
        r7 = r18;
        r2 = r19;
        r3 = r110;
        goto L7
    L19:
        r16 = -1;
        goto L21
    L11:
        r20 = false;
        goto L12
    L5:
        r5 = 0;
        goto L6
    }

    public final V getOrDefault(K r24, V r25) {
        int r2 = 0;
        if (r24 == null) goto L5;
        int r5 = r24.hashCode();
    L6:
        int r6 = r5 * ScatterMapKt.MurmurHashC1;
        int r3 = r6 ^ (r6 << 16);
        int r7 = r3 & WorkQueueKt.MASK;
        int r8 = this._capacity;
        int r9 = (r3 >>> 7) & r8;
        int r10 = 0;
    L7:
        long[] r11 = this.metadata;
        int r12 = r9 >> 3;
        int r13 = (r9 & 7) << 3;
        int r18 = r7;
        long r4 = (((-r13) >> 63) & (r11[r12 + 1] << (64 - r13))) | (r11[r12] >>> r13);
        long r14 = (((long) r18) * ScatterMapKt.BitmaskLsb) ^ r4;
        int r19 = r2;
        int r110 = r3;
        long r15 = ((~r14) & (r14 - ScatterMapKt.BitmaskLsb)) & (-9187201950435737472L);
    L9:
        if (r15 == 0) goto L11;
        boolean r20 = true;
    L12:
        if (r20 == false) goto L18;
        int r16 = ((Long.numberOfTrailingZeros(r15) >> 3) + r9) & r8;
        if (Intrinsics.areEqual(this.keys[r16], r24) == true) goto L21;
        long r17 = r15;
        r15 = r17 & (r17 - 1);
    L21:
        if (r16 < 0) goto L25;
        return (V) this.values[r16];
    L25:
        return r25;
    L18:
        if (((((~r4) << 6) & r4) & (-9187201950435737472L)) != 0) goto L19;
        r10 = r10 + 8;
        r9 = (r9 + r10) & r8;
        r7 = r18;
        r2 = r19;
        r3 = r110;
        goto L7
    L19:
        r16 = -1;
        goto L21
    L11:
        r20 = false;
        goto L12
    L5:
        r5 = 0;
        goto L6
    }

    public final V getOrElse(K r3, Function0<? extends V> r4) {
        Intrinsics.checkNotNullParameter(r4, "defaultValue");
        V r1 = get(r3);
        if (r1 == null) goto L5;
        return r1;
    L5:
        return r4.invoke();
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

    public final void forEach(Function2<? super K, ? super V, Unit> r21) {
        Intrinsics.checkNotNullParameter(r21, "block");
        int $i$f$forEach = 0;
        Object[] k = this.keys;
        Object[] v = this.values;
        long[] m$iv = this.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 > lastIndex$iv) goto L22;
    L4:
        long slot$iv = m$iv[i$iv];
        int $i$f$forEach2 = $i$f$forEach;
        Object[] k2 = k;
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
        r21.invoke(k2[index$iv], v[index$iv]);
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

    public final void forEachKey(Function1<? super K, Unit> r20) {
        Intrinsics.checkNotNullParameter(r20, "block");
        Object[] k = this.keys;
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
        r20.invoke(k[index$iv]);
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

    public final void forEachValue(Function1<? super V, Unit> r20) {
        Intrinsics.checkNotNullParameter(r20, "block");
        Object[] v = this.values;
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
        r20.invoke(v[index$iv]);
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

    public final boolean all(Function2<? super K, ? super V, Boolean> r26) {
        Intrinsics.checkNotNullParameter(r26, "predicate");
        int $i$f$all = 0;
        Object[] k$iv = this.keys;
        Object[] v$iv = this.values;
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
        Object key = k$iv[index$iv$iv];
        Object value = v$iv[index$iv$iv];
        if (r26.invoke(key, value).booleanValue() == true) goto L18;
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

    public final boolean any(Function2<? super K, ? super V, Boolean> r26) {
        Intrinsics.checkNotNullParameter(r26, "predicate");
        int $i$f$any = 0;
        Object[] k$iv = this.keys;
        Object[] v$iv = this.values;
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
        Object key = k$iv[index$iv$iv];
        Object value = v$iv[index$iv$iv];
        if (r26.invoke(key, value).booleanValue() == false) goto L18;
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

    public final int count(Function2<? super K, ? super V, Boolean> r25) {
        Intrinsics.checkNotNullParameter(r25, "predicate");
        int $i$f$count = 0;
        int count = 0;
        ScatterMap<K, V> r3 = this;
        Object[] k$iv = r3.keys;
        Object[] v$iv = r3.values;
        long[] m$iv$iv = r3.metadata;
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
        Object key = k$iv[index$iv$iv];
        int r21 = r2;
        Object value = v$iv[index$iv$iv];
        ScatterMap<K, V> r23 = r3;
        if (((Boolean) r25.invoke(key, value)).booleanValue() == false) goto L18;
        count2 = count2 + 1;
    L18:
        slot$iv$iv = slot$iv$iv >> r21;
        j$iv$iv = j$iv$iv + 1;
        r2 = r21;
        r3 = r23;
        goto L7
    L17:
        r21 = r2;
        r23 = r3;
        goto L18
    L11:
        r20 = false;
        goto L12
    L19:
        ScatterMap<K, V> r24 = r3;
        if (bitCount$iv$iv != r2) goto L35;
        count = count2;
    L23:
        if (i$iv$iv == lastIndex$iv$iv) goto L28;
        i$iv$iv = i$iv$iv + 1;
        $i$f$count = $i$f$count2;
        r3 = r24;
        goto L4
    L35:
        return count2;
    L22:
        r24 = r3;
        count = count2;
    L28:
        return count;
    }

    public final boolean contains(K r25) {
        int $i$f$findKeyIndex$collection = 0;
        if (r25 == null) goto L5;
        int r5 = r25.hashCode();
    L6:
        int hash$iv$iv = r5 * ScatterMapKt.MurmurHashC1;
        int hash$iv = hash$iv$iv ^ (hash$iv$iv << 16);
        int hash2$iv = hash$iv & WorkQueueKt.MASK;
        int probeMask$iv = this._capacity;
        int $i$f$h1 = hash$iv >>> 7;
        int probeOffset$iv = $i$f$h1 & probeMask$iv;
        int probeIndex$iv = 0;
    L7:
        long[] metadata$iv$iv = this.metadata;
        int i$iv$iv = probeOffset$iv >> 3;
        int b$iv$iv = (probeOffset$iv & 7) << 3;
        int hash2$iv2 = hash2$iv;
        long g$iv = (((-b$iv$iv) >> 63) & (metadata$iv$iv[i$iv$iv + 1] << (64 - b$iv$iv))) | (metadata$iv$iv[i$iv$iv] >>> b$iv$iv);
        long x$iv$iv = (((long) hash2$iv2) * ScatterMapKt.BitmaskLsb) ^ g$iv;
        int $i$f$findKeyIndex$collection2 = $i$f$findKeyIndex$collection;
        int hash$iv2 = hash$iv;
        long m$iv = ((~x$iv$iv) & (x$iv$iv - ScatterMapKt.BitmaskLsb)) & (-9187201950435737472L);
    L8:
        long $this$hasNext$iv$iv = m$iv;
        if ($this$hasNext$iv$iv == 0) goto L11;
        boolean r9 = true;
    L12:
        if (r9 == false) goto L17;
        long $this$get$iv$iv = m$iv;
        int index$iv = ((Long.numberOfTrailingZeros($this$get$iv$iv) >> 3) + probeOffset$iv) & probeMask$iv;
        if (Intrinsics.areEqual(this.keys[index$iv], r25) == true) goto L20;
        long $this$next$iv$iv = m$iv;
        m$iv = $this$next$iv$iv & ($this$next$iv$iv - 1);
    L20:
        if (index$iv >= 0) goto L28;
        return false;
    L28:
        return true;
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
        goto L20
    L11:
        r9 = false;
        goto L12
    L5:
        r5 = 0;
        goto L6
    }

    public final boolean containsKey(K r25) {
        int $i$f$findKeyIndex$collection = 0;
        if (r25 == null) goto L5;
        int r5 = r25.hashCode();
    L6:
        int hash$iv$iv = r5 * ScatterMapKt.MurmurHashC1;
        int hash$iv = hash$iv$iv ^ (hash$iv$iv << 16);
        int hash2$iv = hash$iv & WorkQueueKt.MASK;
        int probeMask$iv = this._capacity;
        int $i$f$h1 = hash$iv >>> 7;
        int probeOffset$iv = $i$f$h1 & probeMask$iv;
        int probeIndex$iv = 0;
    L7:
        long[] metadata$iv$iv = this.metadata;
        int i$iv$iv = probeOffset$iv >> 3;
        int b$iv$iv = (probeOffset$iv & 7) << 3;
        int hash2$iv2 = hash2$iv;
        long g$iv = (((-b$iv$iv) >> 63) & (metadata$iv$iv[i$iv$iv + 1] << (64 - b$iv$iv))) | (metadata$iv$iv[i$iv$iv] >>> b$iv$iv);
        long x$iv$iv = (((long) hash2$iv2) * ScatterMapKt.BitmaskLsb) ^ g$iv;
        int $i$f$findKeyIndex$collection2 = $i$f$findKeyIndex$collection;
        int hash$iv2 = hash$iv;
        long m$iv = ((~x$iv$iv) & (x$iv$iv - ScatterMapKt.BitmaskLsb)) & (-9187201950435737472L);
    L8:
        long $this$hasNext$iv$iv = m$iv;
        if ($this$hasNext$iv$iv == 0) goto L11;
        boolean r9 = true;
    L12:
        if (r9 == false) goto L17;
        long $this$get$iv$iv = m$iv;
        int index$iv = ((Long.numberOfTrailingZeros($this$get$iv$iv) >> 3) + probeOffset$iv) & probeMask$iv;
        if (Intrinsics.areEqual(this.keys[index$iv], r25) == true) goto L20;
        long $this$next$iv$iv = m$iv;
        m$iv = $this$next$iv$iv & ($this$next$iv$iv - 1);
    L20:
        if (index$iv >= 0) goto L28;
        return false;
    L28:
        return true;
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
        goto L20
    L11:
        r9 = false;
        goto L12
    L5:
        r5 = 0;
        goto L6
    }

    public final boolean containsValue(V r23) {
        Object[] v$iv = this.values;
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
        Object v = v$iv[index$iv$iv];
        if (Intrinsics.areEqual(r23, v) == false) goto L18;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String joinToString$default(ScatterMap r1, CharSequence r2, CharSequence r3, CharSequence r4, int r5, CharSequence r6, Function2 r7, int r8, Object r9) {
        if (r9 != null) goto L25;
        if ((r8 & 1) == 0) goto L7;
    L7:
        if ((r8 & 2) == 0) goto L10;
    L10:
        if ((r8 & 4) == 0) goto L13;
    L13:
        if ((r8 & 8) == 0) goto L16;
        r5 = -1;
    L16:
        if ((r8 & 16) == 0) goto L19;
    L19:
        if ((r8 & 32) == 0) goto L21;
        Function2 r10 = null;
    L22:
        CharSequence r11 = r6;
        CharSequence r12 = r4;
        return r1.joinToString(r2, r3, r12, r5, r11, r10);
    L21:
        r10 = r7;
        goto L22
    L25:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function2<? super K, ? super V, ? extends CharSequence> r35) {
        CharSequence r0 = separator;
        Intrinsics.checkNotNullParameter(r0, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder $this$joinToString_u24lambda_u248 = new StringBuilder();
        int r7 = 0;
        $this$joinToString_u24lambda_u248.append(prefix);
        int index = 0;
        ScatterMap<K, V> r9 = this;
        int $i$f$forEach = 0;
        Object[] k$iv = r9.keys;
        Object[] v$iv = r9.values;
        long[] m$iv$iv = r9.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L32;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int r22 = r7;
        int index2 = index;
        ScatterMap<K, V> r19 = r9;
        int $i$f$forEach2 = $i$f$forEach;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L27;
        int r8 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
        int index3 = index2;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L24;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r25 = true;
    L12:
        if (r25 == false) goto L23;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object key = k$iv[index$iv$iv];
        Object value = v$iv[index$iv$iv];
        if (index3 == limit) goto L15;
        if (index3 == 0) goto L18;
        $this$joinToString_u24lambda_u248.append(r0);
    L18:
        if (r35 != null) goto L20;
        $this$joinToString_u24lambda_u248.append(key);
        $this$joinToString_u24lambda_u248.append('=');
        $this$joinToString_u24lambda_u248.append(value);
    L21:
        index3 = index3 + 1;
        goto L23
    L20:
        $this$joinToString_u24lambda_u248.append(r35.invoke(key, value));
        goto L21
    L15:
        $this$joinToString_u24lambda_u248.append(truncated);
    L33:
        String r1 = $this$joinToString_u24lambda_u248.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    L23:
        slot$iv$iv = slot$iv$iv >> r8;
        j$iv$iv = j$iv$iv + 1;
        r0 = separator;
        r8 = r8;
        k$iv = k$iv;
        goto L7
    L11:
        r25 = false;
        goto L12
    L24:
        Object[] k$iv2 = k$iv;
        if (bitCount$iv$iv != r8) goto L32;
        index = index3;
    L28:
        if (i$iv$iv == lastIndex$iv$iv) goto L32;
        i$iv$iv = i$iv$iv + 1;
        r0 = separator;
        r9 = r19;
        $i$f$forEach = $i$f$forEach2;
        r7 = r22;
        k$iv = k$iv2;
        goto L4
    L27:
        k$iv2 = k$iv;
        index = index2;
    L32:
        $this$joinToString_u24lambda_u248.append(postfix);
        goto L33
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final String joinToString(CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, null, 62, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, null, 60, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, limit, null, null, 48, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return joinToString$default(this, separator, prefix, postfix, limit, truncated, null, 32, null);
    }

    public int hashCode() {
        int bitCount$iv$iv = 0;
        ScatterMap<K, V> r1 = this;
        Object[] k$iv = r1.keys;
        Object[] v$iv = r1.values;
        long[] m$iv$iv = r1.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L29;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int hash = bitCount$iv$iv;
        ScatterMap<K, V> r15 = r1;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L23;
        int bitCount$iv$iv2 = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv2) goto L21;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        int r19 = 0;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r18 = true;
    L12:
        if (r18 == false) goto L20;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object key = k$iv[index$iv$iv];
        Object value = v$iv[index$iv$iv];
        if (key == null) goto L16;
        int r22 = key.hashCode();
    L17:
        if (value == null) goto L19;
        r19 = value.hashCode();
    L19:
        hash = hash + (r22 ^ r19);
        goto L20
    L16:
        r22 = 0;
    L20:
        slot$iv$iv = slot$iv$iv >> 8;
        j$iv$iv = j$iv$iv + 1;
        goto L7
    L11:
        r18 = false;
        goto L12
    L21:
        if (bitCount$iv$iv2 != 8) goto L35;
        bitCount$iv$iv = hash;
    L24:
        if (i$iv$iv == lastIndex$iv$iv) goto L29;
        i$iv$iv = i$iv$iv + 1;
        r1 = r15;
        goto L4
    L35:
        return hash;
    L23:
        bitCount$iv$iv = hash;
    L29:
        return bitCount$iv$iv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object other) {
        boolean r1 = true;
        if (other != this) goto L5;
        return true;
    L5:
        boolean r4 = false;
        if ((other instanceof ScatterMap) == true) goto L9;
        return false;
    L9:
        if (((ScatterMap) other).getSize() == getSize()) goto L11;
        return false;
    L11:
        ScatterMap r3 = (ScatterMap) other;
        ScatterMap<K, V> r5 = this;
        Object[] k$iv = r5.keys;
        Object[] v$iv = r5.values;
        long[] m$iv$iv = r5.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L44;
    L13:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        boolean r19 = r1;
        boolean r16 = r4;
        ScatterMap<K, V> r17 = r5;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L39;
        int r2 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L16:
        if (j$iv$iv >= bitCount$iv$iv) goto L38;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L20;
        boolean r6 = r19;
    L21:
        if (r6 == false) goto L35;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int r21 = r2;
        Object key = k$iv[index$iv$iv];
        Object value = v$iv[index$iv$iv];
        if (value != null) goto L32;
        if (r3.get(key) != null) goto L30;
        if (r3.containsKey(key) == false) goto L30;
    L36:
        slot$iv$iv = slot$iv$iv >> r21;
        j$iv$iv = j$iv$iv + 1;
        r2 = r21;
    L30:
        return r16;
    L32:
        if (Intrinsics.areEqual(value, r3.get(key)) == true) goto L36;
        return r16;
    L35:
        r21 = r2;
        goto L36
    L20:
        r6 = r16;
        goto L21
    L38:
        if (bitCount$iv$iv == r2) goto L39;
        return r19;
    L39:
        if (i$iv$iv == lastIndex$iv$iv) goto L55;
        i$iv$iv = i$iv$iv + 1;
        r4 = r16;
        r5 = r17;
        r1 = r19;
        goto L13
    L55:
        return r19;
    L44:
        return true;
    }

    public String toString() {
        ScatterMap<K, V> r0 = this;
        if (r0.isEmpty() == false) goto L6;
        return "{}";
    L6:
        StringBuilder s = new StringBuilder().append('{');
        int bitCount$iv$iv = 0;
        ScatterMap<K, V> r3 = this;
        int $i$f$forEach = 0;
        Object[] k$iv = r3.keys;
        Object[] v$iv = r3.values;
        long[] m$iv$iv = r3.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L38;
    L8:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int i = bitCount$iv$iv;
        ScatterMap<K, V> r17 = r3;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L33;
        int r4 = 8;
        int bitCount$iv$iv2 = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L11:
        if (j$iv$iv >= bitCount$iv$iv2) goto L30;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L15;
        boolean r20 = true;
    L16:
        if (r20 == false) goto L29;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object key = k$iv[index$iv$iv];
        Object value = v$iv[index$iv$iv];
        if (key != r0) goto L20;
        key = "(this)";
    L20:
        s.append(key);
        s.append("=");
        if (value != r0) goto L23;
        Object r5 = "(this)";
    L24:
        s.append(r5);
        int i2 = i + 1;
        if (i2 >= r0._size) goto L27;
        s.append(',').append(' ');
    L27:
        i = i2;
        goto L29
    L23:
        r5 = value;
    L29:
        slot$iv$iv = slot$iv$iv >> r4;
        j$iv$iv = j$iv$iv + 1;
        r0 = this;
        r4 = r4;
        $i$f$forEach = $i$f$forEach;
        goto L11
    L15:
        r20 = false;
        goto L16
    L30:
        int $i$f$forEach2 = $i$f$forEach;
        if (bitCount$iv$iv2 != r4) goto L38;
        bitCount$iv$iv = i;
    L34:
        if (i$iv$iv == lastIndex$iv$iv) goto L38;
        i$iv$iv = i$iv$iv + 1;
        r0 = this;
        r3 = r17;
        $i$f$forEach = $i$f$forEach2;
        goto L8
    L33:
        $i$f$forEach2 = $i$f$forEach;
        bitCount$iv$iv = i;
    L38:
        String r1 = s.append('}').toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    }

    public final String asDebugString$collection() {
        StringBuilder $this$asDebugString_u24lambda_u2412 = new StringBuilder();
        $this$asDebugString_u24lambda_u2412.append('{');
        $this$asDebugString_u24lambda_u2412.append("metadata=[");
        int i = 0;
        int r4 = getCapacity();
    L4:
        if (i >= r4) goto L13;
        long[] data$iv = this.metadata;
        long metadata = (data$iv[i >> 3] >> ((i & 7) << 3)) & 255;
        if (metadata != 128) goto L9;
        $this$asDebugString_u24lambda_u2412.append("Empty");
    L12:
        $this$asDebugString_u24lambda_u2412.append(", ");
        i = i + 1;
        goto L4
    L9:
        if (metadata != 254) goto L11;
        $this$asDebugString_u24lambda_u2412.append("Deleted");
        goto L12
    L11:
        $this$asDebugString_u24lambda_u2412.append(metadata);
        goto L12
    L13:
        $this$asDebugString_u24lambda_u2412.append("], ");
        $this$asDebugString_u24lambda_u2412.append("keys=[");
        int i2 = 0;
        int r6 = this.keys.length;
    L14:
        if (i2 >= r6) goto L16;
        $this$asDebugString_u24lambda_u2412.append(this.keys[i2]);
        $this$asDebugString_u24lambda_u2412.append(", ");
        i2 = i2 + 1;
        goto L14
    L16:
        $this$asDebugString_u24lambda_u2412.append("], ");
        $this$asDebugString_u24lambda_u2412.append("values=[");
        int i3 = 0;
        int r5 = this.values.length;
    L17:
        if (i3 >= r5) goto L19;
        $this$asDebugString_u24lambda_u2412.append(this.values[i3]);
        $this$asDebugString_u24lambda_u2412.append(", ");
        i3 = i3 + 1;
        goto L17
    L19:
        $this$asDebugString_u24lambda_u2412.append("]");
        $this$asDebugString_u24lambda_u2412.append('}');
        String r0 = $this$asDebugString_u24lambda_u2412.toString();
        Intrinsics.checkNotNullExpressionValue(r0, "toString(...)");
        return r0;
    }

    public final int findKeyIndex$collection(K r24) {
        int $i$f$findKeyIndex$collection = 0;
        if (r24 == null) goto L5;
        int r5 = r24.hashCode();
    L6:
        int hash$iv = r5 * ScatterMapKt.MurmurHashC1;
        int hash = hash$iv ^ (hash$iv << 16);
        int hash2 = hash & WorkQueueKt.MASK;
        int probeMask = this._capacity;
        int $i$f$h1 = hash >>> 7;
        int probeOffset = $i$f$h1 & probeMask;
        int probeIndex = 0;
    L7:
        long[] metadata$iv = this.metadata;
        int i$iv = probeOffset >> 3;
        int b$iv = (probeOffset & 7) << 3;
        int hash3 = hash2;
        long g = (((-b$iv) >> 63) & (metadata$iv[i$iv + 1] << (64 - b$iv))) | (metadata$iv[i$iv] >>> b$iv);
        long x$iv = (((long) hash3) * ScatterMapKt.BitmaskLsb) ^ g;
        int $i$f$findKeyIndex$collection2 = $i$f$findKeyIndex$collection;
        int hash4 = hash;
        long m = ((~x$iv) & (x$iv - ScatterMapKt.BitmaskLsb)) & (-9187201950435737472L);
    L8:
        long $this$hasNext$iv = m;
        if ($this$hasNext$iv == 0) goto L11;
        boolean r20 = true;
    L12:
        if (r20 == false) goto L17;
        long $this$get$iv = m;
        int index = ((Long.numberOfTrailingZeros($this$get$iv) >> 3) + probeOffset) & probeMask;
        if (Intrinsics.areEqual(this.keys[index], r24) == true) goto L15;
        long $this$next$iv = m;
        m = $this$next$iv & ($this$next$iv - 1);
        goto L8
    L15:
        return index;
    L17:
        long $this$maskEmpty$iv = (((~g) << 6) & g) & (-9187201950435737472L);
        if ($this$maskEmpty$iv != 0) goto L19;
        probeIndex = probeIndex + 8;
        probeOffset = (probeOffset + probeIndex) & probeMask;
        hash2 = hash3;
        $i$f$findKeyIndex$collection = $i$f$findKeyIndex$collection2;
        hash = hash4;
        goto L7
    L19:
        return -1;
    L11:
        r20 = false;
        goto L12
    L5:
        r5 = 0;
        goto L6
    }

    public final Map<K, V> asMap() {
        return new MapWrapper(this);
    }
}
