package androidx.collection;

import androidx.autofill.HintConstants;
import androidx.collection.internal.ContainerHelpersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: FloatObjectMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J&\u0010\u0018\u001a\u00020\u00192\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190\u001bH\u0086\bø\u0001\u0000J\u0006\u0010\u001d\u001a\u00020\u0019J&\u0010\u001d\u001a\u00020\u00192\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190\u001bH\u0086\bø\u0001\u0000J\u0011\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001cH\u0086\nJ\u000e\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001cJ\u0013\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00028\u0000¢\u0006\u0002\u0010#J\u0006\u0010$\u001a\u00020\u0005J&\u0010$\u001a\u00020\u00052\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190\u001bH\u0086\bø\u0001\u0000J\u0013\u0010%\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0016\u0010'\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001cH\u0080\b¢\u0006\u0002\b(JD\u0010)\u001a\u00020*26\u0010+\u001a2\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020*0\u001bH\u0086\bø\u0001\u0000J/\u0010.\u001a\u00020*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020*0/H\u0081\bø\u0001\u0000J/\u00101\u001a\u00020*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020*0/H\u0086\bø\u0001\u0000J/\u00102\u001a\u00020*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020*0/H\u0086\bø\u0001\u0000J\u0018\u00103\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001f\u001a\u00020\u001cH\u0086\u0002¢\u0006\u0002\u00104J\u001b\u00105\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u00106\u001a\u00028\u0000¢\u0006\u0002\u00107J'\u00108\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u001c2\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010:J\b\u0010;\u001a\u00020\u0005H\u0016J\u0006\u0010<\u001a\u00020\u0019J\u0006\u0010=\u001a\u00020\u0019J:\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020A2\b\b\u0002\u0010B\u001a\u00020A2\b\b\u0002\u0010C\u001a\u00020A2\b\b\u0002\u0010D\u001a\u00020\u00052\b\b\u0002\u0010E\u001a\u00020AH\u0007Jx\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020A2\b\b\u0002\u0010B\u001a\u00020A2\b\b\u0002\u0010C\u001a\u00020A2\b\b\u0002\u0010D\u001a\u00020\u00052\b\b\u0002\u0010E\u001a\u00020A28\b\u0004\u0010F\u001a2\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020A0\u001bH\u0087\bø\u0001\u0000J\u0006\u0010G\u001a\u00020\u0019J\b\u0010H\u001a\u00020?H\u0016R\u0018\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0018\u0010\u0007\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\u0011\u0010\t\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0003R\u0018\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0003R\u0011\u0010\u0012\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\"\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00158\u0000@\u0000X\u0081\u000e¢\u0006\n\n\u0002\u0010\u0017\u0012\u0004\b\u0016\u0010\u0003\u0082\u0001\u0001I\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006J"}, d2 = {"Landroidx/collection/FloatObjectMap;", "V", "", "()V", "_capacity", "", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "capacity", "getCapacity", "()I", "keys", "", "getKeys$annotations", "metadata", "", "getMetadata$annotations", "size", "getSize", "values", "", "getValues$annotations", "[Ljava/lang/Object;", "all", "", "predicate", "Lkotlin/Function2;", "", "any", "contains", "key", "containsKey", "containsValue", "value", "(Ljava/lang/Object;)Z", "count", "equals", "other", "findKeyIndex", "findKeyIndex$collection", "forEach", "", "block", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "forEachIndexed", "Lkotlin/Function1;", "index", "forEachKey", "forEachValue", "get", "(F)Ljava/lang/Object;", "getOrDefault", "defaultValue", "(FLjava/lang/Object;)Ljava/lang/Object;", "getOrElse", "Lkotlin/Function0;", "(FLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "none", "toString", "Landroidx/collection/MutableFloatObjectMap;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class FloatObjectMap<V> {
    public int _capacity;
    public int _size;
    public float[] keys;
    public long[] metadata;
    public Object[] values;

    public /* synthetic */ FloatObjectMap(DefaultConstructorMarker r1) {
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

    private FloatObjectMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = FloatSetKt.getEmptyFloatArray();
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

    public final V get(float r23) {
        int r1 = 0;
        int r3 = Float.hashCode(r23) * ScatterMapKt.MurmurHashC1;
        int r2 = r3 ^ (r3 << 16);
        int r4 = r2 & WorkQueueKt.MASK;
        int r5 = this._capacity;
        int r6 = (r2 >>> 7) & r5;
        int r7 = 0;
    L3:
        long[] r8 = this.metadata;
        int r9 = r6 >> 3;
        int r10 = (r6 & 7) << 3;
        int r15 = r1;
        int r16 = r2;
        long r11 = (((-r10) >> 63) & (r8[r9 + 1] << (64 - r10))) | (r8[r9] >>> r10);
        long r12 = (((long) r4) * ScatterMapKt.BitmaskLsb) ^ r11;
        long r13 = ((~r12) & (r12 - ScatterMapKt.BitmaskLsb)) & (-9187201950435737472L);
    L4:
        boolean r19 = false;
        if (r13 == 0) goto L7;
        boolean r14 = true;
    L8:
        if (r14 == false) goto L16;
        int r17 = ((Long.numberOfTrailingZeros(r13) >> 3) + r6) & r5;
        if (this.keys[r17] != r23) goto L12;
        r19 = true;
    L12:
        if (r19 == true) goto L19;
        long r18 = r13;
        r13 = r18 & (r18 - 1);
    L19:
        if (r17 < 0) goto L22;
        return (V) this.values[r17];
    L22:
        return null;
    L16:
        if (((((~r11) << 6) & r11) & (-9187201950435737472L)) != 0) goto L17;
        r7 = r7 + 8;
        r6 = (r6 + r7) & r5;
        r1 = r15;
        r2 = r16;
        goto L3
    L17:
        r17 = -1;
        goto L19
    L7:
        r14 = false;
        goto L8
    }

    public final V getOrDefault(float r23, V r24) {
        int r1 = 0;
        int r3 = Float.hashCode(r23) * ScatterMapKt.MurmurHashC1;
        int r2 = r3 ^ (r3 << 16);
        int r4 = r2 & WorkQueueKt.MASK;
        int r5 = this._capacity;
        int r6 = (r2 >>> 7) & r5;
        int r7 = 0;
    L3:
        long[] r8 = this.metadata;
        int r9 = r6 >> 3;
        int r10 = (r6 & 7) << 3;
        int r15 = r1;
        int r16 = r2;
        long r11 = (((-r10) >> 63) & (r8[r9 + 1] << (64 - r10))) | (r8[r9] >>> r10);
        long r12 = (((long) r4) * ScatterMapKt.BitmaskLsb) ^ r11;
        long r13 = ((~r12) & (r12 - ScatterMapKt.BitmaskLsb)) & (-9187201950435737472L);
    L4:
        boolean r19 = false;
        if (r13 == 0) goto L7;
        boolean r14 = true;
    L8:
        if (r14 == false) goto L16;
        int r17 = ((Long.numberOfTrailingZeros(r13) >> 3) + r6) & r5;
        if (this.keys[r17] != r23) goto L12;
        r19 = true;
    L12:
        if (r19 == true) goto L19;
        long r18 = r13;
        r13 = r18 & (r18 - 1);
    L19:
        if (r17 < 0) goto L23;
        return (V) this.values[r17];
    L23:
        return r24;
    L16:
        if (((((~r11) << 6) & r11) & (-9187201950435737472L)) != 0) goto L17;
        r7 = r7 + 8;
        r6 = (r6 + r7) & r5;
        r1 = r15;
        r2 = r16;
        goto L3
    L17:
        r17 = -1;
        goto L19
    L7:
        r14 = false;
        goto L8
    }

    public final V getOrElse(float key, Function0<? extends V> r4) {
        Intrinsics.checkNotNullParameter(r4, "defaultValue");
        V r1 = get(key);
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

    public final void forEach(Function2<? super Float, ? super V, Unit> r21) {
        Intrinsics.checkNotNullParameter(r21, "block");
        int $i$f$forEach = 0;
        float[] k = this.keys;
        Object[] v = this.values;
        long[] m$iv = this.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 > lastIndex$iv) goto L22;
    L4:
        long slot$iv = m$iv[i$iv];
        int $i$f$forEach2 = $i$f$forEach;
        float[] k2 = k;
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
        r21.invoke(Float.valueOf(k2[index$iv]), v[index$iv]);
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

    public final void forEachKey(Function1<? super Float, Unit> r20) {
        Intrinsics.checkNotNullParameter(r20, "block");
        float[] k = this.keys;
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
        r20.invoke(Float.valueOf(k[index$iv]));
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

    public final boolean all(Function2<? super Float, ? super V, Boolean> r26) {
        Intrinsics.checkNotNullParameter(r26, "predicate");
        int $i$f$all = 0;
        float[] k$iv = this.keys;
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
        float key = k$iv[index$iv$iv];
        Object value = v$iv[index$iv$iv];
        if (r26.invoke(Float.valueOf(key), value).booleanValue() == true) goto L18;
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

    public final boolean any(Function2<? super Float, ? super V, Boolean> r26) {
        Intrinsics.checkNotNullParameter(r26, "predicate");
        int $i$f$any = 0;
        float[] k$iv = this.keys;
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
        float key = k$iv[index$iv$iv];
        Object value = v$iv[index$iv$iv];
        if (r26.invoke(Float.valueOf(key), value).booleanValue() == false) goto L18;
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

    public final int count(Function2<? super Float, ? super V, Boolean> r25) {
        Intrinsics.checkNotNullParameter(r25, "predicate");
        int $i$f$count = 0;
        int count = 0;
        FloatObjectMap<V> r3 = this;
        float[] k$iv = r3.keys;
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
        float key = k$iv[index$iv$iv];
        int r21 = r2;
        Object value = v$iv[index$iv$iv];
        FloatObjectMap<V> r23 = r3;
        if (r25.invoke(Float.valueOf(key), value).booleanValue() == false) goto L18;
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
        FloatObjectMap<V> r24 = r3;
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

    public final boolean contains(float key) {
        return containsKey(key);
    }

    public final boolean containsKey(float key) {
        int $i$f$findKeyIndex$collection = 0;
        int hash$iv$iv = Float.hashCode(key) * ScatterMapKt.MurmurHashC1;
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
        int $i$f$findKeyIndex$collection2 = $i$f$findKeyIndex$collection;
        int hash$iv2 = hash$iv;
        long g$iv = (((-b$iv$iv) >> 63) & (metadata$iv$iv[i$iv$iv + 1] << (64 - b$iv$iv))) | (metadata$iv$iv[i$iv$iv] >>> b$iv$iv);
        long x$iv$iv = (((long) $i$f$h2) * ScatterMapKt.BitmaskLsb) ^ g$iv;
        long m$iv = ((~x$iv$iv) & (x$iv$iv - ScatterMapKt.BitmaskLsb)) & (-9187201950435737472L);
    L4:
        long $this$hasNext$iv$iv = m$iv;
        if ($this$hasNext$iv$iv == 0) goto L7;
        boolean r7 = true;
    L8:
        if (r7 == false) goto L16;
        long $this$get$iv$iv = m$iv;
        int index$iv = ((Long.numberOfTrailingZeros($this$get$iv$iv) >> 3) + probeOffset$iv) & probeMask$iv;
        if (this.keys[index$iv] != key) goto L12;
        boolean r8 = true;
    L13:
        if (r8 == true) goto L19;
        long $this$next$iv$iv = m$iv;
        m$iv = $this$next$iv$iv & ($this$next$iv$iv - 1);
    L19:
        if (index$iv >= 0) goto L21;
        return false;
    L21:
        return true;
    L12:
        r8 = false;
        goto L13
    L16:
        long $this$maskEmpty$iv$iv = (((~g$iv) << 6) & g$iv) & (-9187201950435737472L);
        if ($this$maskEmpty$iv$iv != 0) goto L18;
        probeIndex$iv = probeIndex$iv + 8;
        probeOffset$iv = (probeOffset$iv + probeIndex$iv) & probeMask$iv;
        $i$f$findKeyIndex$collection = $i$f$findKeyIndex$collection2;
        hash$iv = hash$iv2;
        goto L3
    L18:
        index$iv = -1;
        goto L19
    L7:
        r7 = false;
        goto L8
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

    public static /* synthetic */ String joinToString$default(FloatObjectMap r1, CharSequence r2, CharSequence r3, CharSequence r4, int r5, CharSequence r6, int r7, Object r8) {
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
        Intrinsics.checkNotNullParameter(r0, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder $this$joinToString_u24lambda_u248 = new StringBuilder();
        int r6 = 0;
        $this$joinToString_u24lambda_u248.append(prefix);
        int index = 0;
        FloatObjectMap<V> r8 = this;
        int $i$f$forEach = 0;
        float[] k$iv = r8.keys;
        Object[] v$iv = r8.values;
        long[] m$iv$iv = r8.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L27;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int r21 = r6;
        int index2 = index;
        FloatObjectMap<V> r18 = r8;
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
        float key = k$iv[index$iv$iv];
        Object value = v$iv[index$iv$iv];
        StringBuilder r27 = $this$joinToString_u24lambda_u248;
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
        r7 = r7;
        $this$joinToString_u24lambda_u248 = r27;
        goto L7
    L15:
        $this$joinToString_u24lambda_u248.append(truncated);
    L30:
        String r1 = r27.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    L19:
        r27 = $this$joinToString_u24lambda_u248;
        goto L20
    L11:
        r24 = false;
        goto L12
    L21:
        r27 = $this$joinToString_u24lambda_u248;
        if (bitCount$iv$iv != r7) goto L29;
        index = index3;
    L25:
        if (i$iv$iv == lastIndex$iv$iv) goto L29;
        i$iv$iv = i$iv$iv + 1;
        r0 = separator;
        r8 = r18;
        $i$f$forEach = $i$f$forEach2;
        r6 = r21;
        $this$joinToString_u24lambda_u248 = r27;
    L29:
        $this$joinToString_u24lambda_u248.append(postfix);
        goto L30
    L24:
        r27 = $this$joinToString_u24lambda_u248;
        index = index2;
        goto L25
    L27:
        r27 = $this$joinToString_u24lambda_u248;
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

    public static /* synthetic */ String joinToString$default(FloatObjectMap $this, CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function2 transform, int r33, Object r34) {
        if (r34 != null) goto L55;
        if ((r33 & 1) == 0) goto L7;
    L9:
        if ((r33 & 2) == 0) goto L11;
    L13:
        if ((r33 & 4) == 0) goto L15;
    L17:
        if ((r33 & 8) == 0) goto L19;
        int limit2 = -1;
    L21:
        if ((r33 & 16) == 0) goto L23;
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
        FloatObjectMap this_$iv = $this;
        int $i$f$forEach = 0;
        float[] k$iv = this_$iv.keys;
        Object[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int $i$f$joinToString = m$iv$iv.length;
        int lastIndex$iv$iv = $i$f$joinToString - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L51;
    L26:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int r35 = r9;
        int index2 = index;
        FloatObjectMap this_$iv2 = this_$iv;
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
        float key = k$iv[index$iv$iv];
        Object value = v$iv[index$iv$iv];
        if (index3 == limit2) goto L37;
        if (index3 == 0) goto L40;
        $this$joinToString_u24lambda_u2410.append(separator);
    L40:
        $this$joinToString_u24lambda_u2410.append((CharSequence) transform.invoke(Float.valueOf(key), value));
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
        r9 = r35;
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

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function2<? super Float, ? super V, ? extends CharSequence> r36) {
        CharSequence r0 = separator;
        Intrinsics.checkNotNullParameter(r0, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        Intrinsics.checkNotNullParameter(r36, "transform");
        StringBuilder $this$joinToString_u24lambda_u2410 = new StringBuilder();
        int r8 = 0;
        $this$joinToString_u24lambda_u2410.append(prefix);
        int index = 0;
        FloatObjectMap<V> r10 = this;
        int $i$f$forEach = 0;
        float[] k$iv = r10.keys;
        Object[] v$iv = r10.values;
        long[] m$iv$iv = r10.metadata;
        int $i$f$joinToString = m$iv$iv.length;
        int lastIndex$iv$iv = $i$f$joinToString - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L27;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int r23 = r8;
        int index2 = index;
        FloatObjectMap<V> r20 = r10;
        int $i$f$forEach2 = $i$f$forEach;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L24;
        int r9 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
        int index3 = index2;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L21;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r26 = true;
    L12:
        if (r26 == false) goto L19;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        float key = k$iv[index$iv$iv];
        Object value = v$iv[index$iv$iv];
        StringBuilder r29 = $this$joinToString_u24lambda_u2410;
        if (index3 == limit) goto L15;
        if (index3 == 0) goto L18;
        $this$joinToString_u24lambda_u2410.append(r0);
    L18:
        $this$joinToString_u24lambda_u2410.append(r36.invoke(Float.valueOf(key), value));
        index3 = index3 + 1;
    L20:
        slot$iv$iv = slot$iv$iv >> r9;
        j$iv$iv = j$iv$iv + 1;
        r0 = separator;
        r9 = r9;
        $this$joinToString_u24lambda_u2410 = r29;
        goto L7
    L15:
        $this$joinToString_u24lambda_u2410.append(truncated);
    L30:
        String r1 = r29.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    L19:
        r29 = $this$joinToString_u24lambda_u2410;
        goto L20
    L11:
        r26 = false;
        goto L12
    L21:
        r29 = $this$joinToString_u24lambda_u2410;
        if (bitCount$iv$iv != r9) goto L29;
        index = index3;
    L25:
        if (i$iv$iv == lastIndex$iv$iv) goto L29;
        i$iv$iv = i$iv$iv + 1;
        r0 = separator;
        r10 = r20;
        $i$f$forEach = $i$f$forEach2;
        r8 = r23;
        $this$joinToString_u24lambda_u2410 = r29;
    L29:
        $this$joinToString_u24lambda_u2410.append(postfix);
        goto L30
    L24:
        r29 = $this$joinToString_u24lambda_u2410;
        index = index2;
        goto L25
    L27:
        r29 = $this$joinToString_u24lambda_u2410;
        goto L29
    }

    public int hashCode() {
        int bitCount$iv$iv = 0;
        FloatObjectMap<V> r1 = this;
        float[] k$iv = r1.keys;
        Object[] v$iv = r1.values;
        long[] m$iv$iv = r1.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L26;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int hash = bitCount$iv$iv;
        FloatObjectMap<V> r15 = r1;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L20;
        int bitCount$iv$iv2 = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv2) goto L18;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        int r19 = 0;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r18 = true;
    L12:
        if (r18 == false) goto L17;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        float key = k$iv[index$iv$iv];
        Object value = v$iv[index$iv$iv];
        int r22 = Float.hashCode(key);
        if (value == null) goto L16;
        r19 = value.hashCode();
    L16:
        hash = hash + (r22 ^ r19);
    L17:
        slot$iv$iv = slot$iv$iv >> 8;
        j$iv$iv = j$iv$iv + 1;
        goto L7
    L11:
        r18 = false;
        goto L12
    L18:
        if (bitCount$iv$iv2 != 8) goto L32;
        bitCount$iv$iv = hash;
    L21:
        if (i$iv$iv == lastIndex$iv$iv) goto L26;
        i$iv$iv = i$iv$iv + 1;
        r1 = r15;
        goto L4
    L32:
        return hash;
    L20:
        bitCount$iv$iv = hash;
    L26:
        return bitCount$iv$iv;
    }

    public boolean equals(Object other) {
        boolean r1 = true;
        if (other != this) goto L5;
        return true;
    L5:
        boolean r4 = false;
        if ((other instanceof FloatObjectMap) == true) goto L9;
        return false;
    L9:
        if (((FloatObjectMap) other).getSize() == getSize()) goto L11;
        return false;
    L11:
        int $i$f$forEach = 0;
        float[] k$iv = this.keys;
        Object[] v$iv = this.values;
        long[] m$iv$iv = this.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L44;
    L13:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        boolean r18 = r1;
        boolean r15 = r4;
        int $i$f$forEach2 = $i$f$forEach;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L38;
        int r2 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L16:
        if (j$iv$iv >= bitCount$iv$iv) goto L35;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L20;
        boolean r5 = r18;
    L21:
        if (r5 == false) goto L33;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        boolean r20 = r15;
        float key = k$iv[index$iv$iv];
        int r21 = r2;
        Object value = v$iv[index$iv$iv];
        if (value != null) goto L30;
        if (((FloatObjectMap) other).get(key) != null) goto L28;
        if (((FloatObjectMap) other).containsKey(key) == false) goto L28;
    L34:
        slot$iv$iv = slot$iv$iv >> r21;
        j$iv$iv = j$iv$iv + 1;
        r15 = r20;
        r2 = r21;
    L28:
        return r20;
    L30:
        if (Intrinsics.areEqual(value, ((FloatObjectMap) other).get(key)) == true) goto L34;
        return r20;
    L33:
        r21 = r2;
        r20 = r15;
        goto L34
    L20:
        r5 = r15;
        goto L21
    L35:
        boolean r22 = r15;
        if (bitCount$iv$iv != r2) goto L54;
    L39:
        if (i$iv$iv == lastIndex$iv$iv) goto L55;
        i$iv$iv = i$iv$iv + 1;
        $i$f$forEach = $i$f$forEach2;
        r1 = r18;
        r4 = r22;
        goto L13
    L55:
        return r18;
    L54:
        return r18;
    L38:
        r22 = r15;
        goto L39
    L44:
        return true;
    }

    public String toString() {
        FloatObjectMap<V> r0 = this;
        if (r0.isEmpty() == false) goto L6;
        return "{}";
    L6:
        StringBuilder s = new StringBuilder().append('{');
        int bitCount$iv$iv = 0;
        FloatObjectMap<V> r3 = this;
        int $i$f$forEach = 0;
        float[] k$iv = r3.keys;
        Object[] v$iv = r3.values;
        long[] m$iv$iv = r3.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L35;
    L8:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int i = bitCount$iv$iv;
        FloatObjectMap<V> r17 = r3;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L30;
        int r4 = 8;
        int bitCount$iv$iv2 = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L11:
        if (j$iv$iv >= bitCount$iv$iv2) goto L27;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L15;
        boolean r20 = true;
    L16:
        if (r20 == false) goto L26;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        float key = k$iv[index$iv$iv];
        Object value = v$iv[index$iv$iv];
        s.append(key);
        s.append("=");
        if (value != r0) goto L20;
        Object r5 = "(this)";
    L21:
        s.append(r5);
        int i2 = i + 1;
        if (i2 >= r0._size) goto L24;
        s.append(',').append(' ');
    L24:
        i = i2;
        goto L26
    L20:
        r5 = value;
    L26:
        slot$iv$iv = slot$iv$iv >> r4;
        j$iv$iv = j$iv$iv + 1;
        r0 = this;
        r4 = r4;
        $i$f$forEach = $i$f$forEach;
        goto L11
    L15:
        r20 = false;
        goto L16
    L27:
        int $i$f$forEach2 = $i$f$forEach;
        if (bitCount$iv$iv2 != r4) goto L35;
        bitCount$iv$iv = i;
    L31:
        if (i$iv$iv == lastIndex$iv$iv) goto L35;
        i$iv$iv = i$iv$iv + 1;
        r0 = this;
        r3 = r17;
        $i$f$forEach = $i$f$forEach2;
        goto L8
    L30:
        $i$f$forEach2 = $i$f$forEach;
        bitCount$iv$iv = i;
    L35:
        String r1 = s.append('}').toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    }

    public final int findKeyIndex$collection(float key) {
        int $i$f$findKeyIndex$collection = 0;
        int hash$iv = Float.hashCode(key) * ScatterMapKt.MurmurHashC1;
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
        int $i$f$findKeyIndex$collection2 = $i$f$findKeyIndex$collection;
        int hash2 = hash;
        long g = (((-b$iv) >> 63) & (metadata$iv[i$iv + 1] << (64 - b$iv))) | (metadata$iv[i$iv] >>> b$iv);
        long x$iv = (((long) $i$f$h2) * ScatterMapKt.BitmaskLsb) ^ g;
        long m = ((~x$iv) & (x$iv - ScatterMapKt.BitmaskLsb)) & (-9187201950435737472L);
    L4:
        long $this$hasNext$iv = m;
        boolean r19 = false;
        if ($this$hasNext$iv == 0) goto L7;
        boolean r7 = true;
    L8:
        if (r7 == false) goto L15;
        long $this$get$iv = m;
        int index = ((Long.numberOfTrailingZeros($this$get$iv) >> 3) + probeOffset) & probeMask;
        if (this.keys[index] != key) goto L12;
        r19 = true;
    L12:
        if (r19 == true) goto L13;
        long $this$next$iv = m;
        m = $this$next$iv & ($this$next$iv - 1);
        goto L4
    L13:
        return index;
    L15:
        long $this$maskEmpty$iv = (((~g) << 6) & g) & (-9187201950435737472L);
        if ($this$maskEmpty$iv != 0) goto L17;
        probeIndex = probeIndex + 8;
        probeOffset = (probeOffset + probeIndex) & probeMask;
        $i$f$findKeyIndex$collection = $i$f$findKeyIndex$collection2;
        hash = hash2;
        goto L3
    L17:
        return -1;
    L7:
        r7 = false;
        goto L8
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, Function2<? super Float, ? super V, ? extends CharSequence> r36) {
        CharSequence r0 = separator;
        Intrinsics.checkNotNullParameter(r0, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(r36, "transform");
        int $i$f$joinToString = 0;
        StringBuilder $this$joinToString_u24lambda_u2410$iv = new StringBuilder();
        int r9 = 0;
        $this$joinToString_u24lambda_u2410$iv.append(prefix);
        int index$iv = 0;
        float[] k$iv$iv = this.keys;
        Object[] v$iv$iv = this.values;
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
        if (j$iv$iv$iv >= bitCount$iv$iv$iv) goto L22;
        long value$iv$iv$iv$iv = slot$iv$iv$iv & 255;
        if (value$iv$iv$iv$iv >= 128) goto L11;
        boolean r27 = true;
    L12:
        if (r27 == false) goto L20;
        int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
        float key$iv = k$iv$iv[index$iv$iv$iv];
        Object value$iv = v$iv$iv[index$iv$iv$iv];
        if (index$iv == limit) goto L15;
        if (index$iv == 0) goto L18;
        $this$joinToString_u24lambda_u2410$iv.append(r0);
    L18:
        $this$joinToString_u24lambda_u2410$iv.append(r36.invoke(Float.valueOf(key$iv), value$iv));
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
        r7 = r7;
        r0 = separator;
        goto L7
    L11:
        r27 = false;
        goto L12
    L22:
        if (bitCount$iv$iv$iv != r7) goto L29;
    L25:
        if (i$iv$iv$iv == lastIndex$iv$iv$iv) goto L29;
        i$iv$iv$iv = i$iv$iv$iv + 1;
        r0 = separator;
        r9 = r21;
        $i$f$joinToString = $i$f$joinToString3;
        $this$joinToString_u24lambda_u2410$iv = r25;
    L29:
        $this$joinToString_u24lambda_u2410$iv.append(postfix);
        goto L30
    L24:
        index$iv = index$iv2;
        goto L25
    L27:
        r25 = $this$joinToString_u24lambda_u2410$iv;
        goto L29
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, Function2<? super Float, ? super V, ? extends CharSequence> r35) {
        CharSequence r0 = separator;
        Intrinsics.checkNotNullParameter(r0, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(r35, "transform");
        int $i$f$joinToString = 0;
        StringBuilder $this$joinToString_u24lambda_u2410$iv = new StringBuilder();
        int r10 = 0;
        $this$joinToString_u24lambda_u2410$iv.append(prefix);
        int index$iv = 0;
        float[] k$iv$iv = this.keys;
        Object[] v$iv$iv = this.values;
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
        float key$iv = k$iv$iv[index$iv$iv$iv];
        Object value$iv = v$iv$iv[index$iv$iv$iv];
        if (index$iv == (-1)) goto L15;
        if (index$iv == 0) goto L18;
        $this$joinToString_u24lambda_u2410$iv.append(r0);
    L18:
        $this$joinToString_u24lambda_u2410$iv.append(r35.invoke(Float.valueOf(key$iv), value$iv));
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

    public final String joinToString(CharSequence separator, CharSequence prefix, Function2<? super Float, ? super V, ? extends CharSequence> r34) {
        CharSequence r0 = separator;
        Intrinsics.checkNotNullParameter(r0, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(r34, "transform");
        int $i$f$joinToString = 0;
        StringBuilder $this$joinToString_u24lambda_u2410$iv = new StringBuilder();
        int r10 = 0;
        $this$joinToString_u24lambda_u2410$iv.append(prefix);
        int index$iv = 0;
        float[] k$iv$iv = this.keys;
        Object[] v$iv$iv = this.values;
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
        float key$iv = k$iv$iv[index$iv$iv$iv];
        Object value$iv = v$iv$iv[index$iv$iv$iv];
        if (index$iv == (-1)) goto L15;
        if (index$iv == 0) goto L18;
        $this$joinToString_u24lambda_u2410$iv.append(r0);
    L18:
        $this$joinToString_u24lambda_u2410$iv.append(r34.invoke(Float.valueOf(key$iv), value$iv));
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

    public final String joinToString(CharSequence separator, Function2<? super Float, ? super V, ? extends CharSequence> r34) {
        CharSequence r0 = separator;
        Intrinsics.checkNotNullParameter(r0, "separator");
        Intrinsics.checkNotNullParameter(r34, "transform");
        int $i$f$joinToString = 0;
        StringBuilder $this$joinToString_u24lambda_u2410$iv = new StringBuilder();
        int r10 = 0;
        $this$joinToString_u24lambda_u2410$iv.append(prefix$iv);
        int index$iv = 0;
        float[] k$iv$iv = this.keys;
        Object[] v$iv$iv = this.values;
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
        float key$iv = k$iv$iv[index$iv$iv$iv];
        Object value$iv = v$iv$iv[index$iv$iv$iv];
        if (index$iv == (-1)) goto L15;
        if (index$iv == 0) goto L18;
        $this$joinToString_u24lambda_u2410$iv.append(r0);
    L18:
        $this$joinToString_u24lambda_u2410$iv.append(r34.invoke(Float.valueOf(key$iv), value$iv));
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

    public final String joinToString(Function2<? super Float, ? super V, ? extends CharSequence> r34) {
        Intrinsics.checkNotNullParameter(r34, "transform");
        int $i$f$joinToString = 0;
        StringBuilder $this$joinToString_u24lambda_u2410$iv = new StringBuilder();
        int r10 = 0;
        $this$joinToString_u24lambda_u2410$iv.append(prefix$iv);
        int index$iv = 0;
        float[] k$iv$iv = this.keys;
        Object[] v$iv$iv = this.values;
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
        float key$iv = k$iv$iv[index$iv$iv$iv];
        Object value$iv = v$iv$iv[index$iv$iv$iv];
        if (index$iv == (-1)) goto L15;
        if (index$iv == 0) goto L18;
        $this$joinToString_u24lambda_u2410$iv.append(separator$iv);
    L18:
        $this$joinToString_u24lambda_u2410$iv.append(r34.invoke(Float.valueOf(key$iv), value$iv));
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
