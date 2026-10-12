package androidx.compose.runtime.collection;

import androidx.autofill.HintConstants;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.collection.ObjectListKt;
import androidx.collection.ScatterMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: MultiValueMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081@\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002B\u001d\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J;\u0010\u0018\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u00002!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\t0\u001aH\u0086\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010 2\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0012¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0012¢\u0006\u0004\b+\u0010)J\u0017\u0010,\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b0\u0010.J8\u00101\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u00002!\u00102\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00120\u001a¢\u0006\u0004\b3\u0010\u001eJ\u0010\u00104\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107J\u0013\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010 ¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0004\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005¨\u0006;"}, d2 = {"Landroidx/compose/runtime/collection/MultiValueMap;", "K", "", "V", "map", "Landroidx/collection/MutableScatterMap;", "constructor-impl", "(Landroidx/collection/MutableScatterMap;)Landroidx/collection/MutableScatterMap;", "add", "", "key", "value", "add-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)V", "clear", "clear-impl", "(Landroidx/collection/MutableScatterMap;)V", "contains", "", "contains-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Z", "equals", "other", "equals-impl", "forEachValue", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "forEachValue-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "get", "Landroidx/collection/ObjectList;", "get-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Landroidx/collection/ObjectList;", "hashCode", "", "hashCode-impl", "(Landroidx/collection/MutableScatterMap;)I", "isEmpty", "isEmpty-impl", "(Landroidx/collection/MutableScatterMap;)Z", "isNotEmpty", "isNotEmpty-impl", "removeFirst", "removeFirst-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Ljava/lang/Object;", "removeLast", "removeLast-impl", "removeValueIf", "condition", "removeValueIf-impl", "toString", "", "toString-impl", "(Landroidx/collection/MutableScatterMap;)Ljava/lang/String;", "values", "values-impl", "(Landroidx/collection/MutableScatterMap;)Landroidx/collection/ObjectList;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class MultiValueMap<K, V> {
    private final MutableScatterMap<Object, Object> map;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MultiValueMap m3884boximpl(MutableScatterMap r1) {
        return new MultiValueMap(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <K, V> MutableScatterMap<Object, Object> m3886constructorimpl(MutableScatterMap<Object, Object> r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3889equalsimpl(MutableScatterMap<Object, Object> r2, Object r3) {
        if ((r3 instanceof MultiValueMap) == true) goto L6;
        return false;
    L6:
        if (Intrinsics.areEqual(r2, ((MultiValueMap) r3).m3901unboximpl()) == true) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3890equalsimpl0(MutableScatterMap<Object, Object> r1, MutableScatterMap<Object, Object> r2) {
        return Intrinsics.areEqual(r1, r2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3893hashCodeimpl(MutableScatterMap<Object, Object> r1) {
        return r1.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3899toStringimpl(MutableScatterMap<Object, Object> r2) {
        return "MultiValueMap(map=" + r2 + ')';
    }

    public boolean equals(Object r2) {
        return m3889equalsimpl(this.map, r2);
    }

    public int hashCode() {
        return m3893hashCodeimpl(this.map);
    }

    public String toString() {
        return m3899toStringimpl(this.map);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ MutableScatterMap m3901unboximpl() {
        return this.map;
    }

    private /* synthetic */ MultiValueMap(MutableScatterMap map) {
        this.map = map;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableScatterMap m3887constructorimpl$default(MutableScatterMap r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = new MutableScatterMap(0, 1, null);
    L6:
        return m3886constructorimpl(r1);
    }

    /* JADX INFO: renamed from: add-impl, reason: not valid java name */
    public static final void m3883addimpl(MutableScatterMap<Object, Object> r8, K r9, V r10) {
        int r2 = r8.findInsertIndex(r9);
        if (r2 >= 0) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L8;
        Object r5 = null;
    L9:
        boolean r3 = true ^ TypeIntrinsics.isMutableList(r5);
        if (r5 != null) goto L13;
        Object r6 = r10;
    L17:
        if (r4 == false) goto L19;
        int r7 = ~r2;
        r8.keys[r7] = r9;
        r8.values[r7] = r6;
        return;
    L19:
        r8.values[r2] = r6;
        return;
    L13:
        if ((r5 instanceof MutableObjectList) == false) goto L15;
        Intrinsics.checkNotNull(r5, "null cannot be cast to non-null type androidx.collection.MutableObjectList<kotlin.Any>");
        MutableObjectList r11 = (MutableObjectList) r5;
        r11.add(r10);
        r6 = r11;
        goto L17
    L15:
        r6 = ObjectListKt.mutableObjectListOf(r5, r10);
        goto L17
    L8:
        r5 = r8.values[r2];
        goto L9
    L5:
        r4 = false;
        goto L6
    }

    /* JADX INFO: renamed from: clear-impl, reason: not valid java name */
    public static final void m3885clearimpl(MutableScatterMap<Object, Object> r0) {
        r0.clear();
    }

    /* JADX INFO: renamed from: contains-impl, reason: not valid java name */
    public static final boolean m3888containsimpl(MutableScatterMap<Object, Object> r1, K r2) {
        return r1.contains(r2);
    }

    /* JADX INFO: renamed from: get-impl, reason: not valid java name */
    public static final ObjectList<V> m3892getimpl(MutableScatterMap<Object, Object> r2, K r3) {
        Object entry = r2.get(r3);
        if (entry != null) goto L6;
        return ObjectListKt.emptyObjectList();
    L6:
        if ((entry instanceof MutableObjectList) == false) goto L9;
        return (ObjectList) entry;
    L9:
        return ObjectListKt.objectListOf(entry);
    }

    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m3894isEmptyimpl(MutableScatterMap<Object, Object> r1) {
        return r1.isEmpty();
    }

    /* JADX INFO: renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m3895isNotEmptyimpl(MutableScatterMap<Object, Object> r1) {
        return r1.isNotEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: removeLast-impl, reason: not valid java name */
    public static final V m3897removeLastimpl(MutableScatterMap<Object, Object> r5, K r6) {
        V r0 = (V) r5.get(r6);
        if (r0 != 0) goto L6;
        return null;
    L6:
        if ((r0 instanceof MutableObjectList) == false) goto L14;
        MutableObjectList r1 = (MutableObjectList) r0;
        V r2 = (V) ExtensionsKt.removeLast(r1);
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (r1.isEmpty() == false) goto L11;
        r5.remove(r6);
    L11:
        if (r1.getSize() != 1) goto L17;
        r5.set(r6, r1.first());
    L17:
        return r2;
    L14:
        r5.remove(r6);
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: removeFirst-impl, reason: not valid java name */
    public static final V m3896removeFirstimpl(MutableScatterMap<Object, Object> r5, K r6) {
        V r0 = (V) r5.get(r6);
        if (r0 != 0) goto L6;
        return null;
    L6:
        if ((r0 instanceof MutableObjectList) == false) goto L14;
        MutableObjectList r1 = (MutableObjectList) r0;
        V r2 = (V) r1.removeAt(0);
        if (r1.isEmpty() == false) goto L11;
        r5.remove(r6);
    L11:
        if (r1.getSize() != 1) goto L17;
        r5.set(r6, r1.first());
    L17:
        return r2;
    L14:
        r5.remove(r6);
        return r0;
    }

    /* JADX INFO: renamed from: values-impl, reason: not valid java name */
    public static final ObjectList<V> m3900valuesimpl(MutableScatterMap<Object, Object> r20) {
        if (r20.isEmpty() == true) goto L5;
        MutableObjectList result = new MutableObjectList(0, 1, null);
        MutableScatterMap<Object, Object> this_$iv = r20;
        Object[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L33;
    L8:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L27;
        int r4 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L11:
        if (j$iv$iv >= bitCount$iv$iv) goto L24;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L15;
        boolean r14 = true;
    L16:
        if (r14 == false) goto L22;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int r17 = r4;
        Object entry = v$iv[index$iv$iv];
        ScatterMap this_$iv2 = this_$iv;
        if ((entry instanceof MutableObjectList) == false) goto L20;
        Intrinsics.checkNotNull(entry, "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.collection.MultiValueMap>");
        result.addAll((MutableObjectList) entry);
    L23:
        slot$iv$iv = slot$iv$iv >> r17;
        j$iv$iv = j$iv$iv + 1;
        r4 = r17;
        this_$iv = this_$iv2;
        goto L11
    L20:
        Intrinsics.checkNotNull(entry, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        result.add(entry);
        goto L23
    L22:
        this_$iv2 = this_$iv;
        r17 = r4;
        goto L23
    L15:
        r14 = false;
        goto L16
    L24:
        ScatterMap this_$iv3 = this_$iv;
        if (bitCount$iv$iv != r4) goto L33;
    L28:
        if (i$iv$iv == lastIndex$iv$iv) goto L33;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv3;
        goto L8
    L27:
        this_$iv3 = this_$iv;
    L33:
        return result;
    L5:
        return ObjectListKt.emptyObjectList();
    }

    /* JADX INFO: renamed from: forEachValue-impl, reason: not valid java name */
    public static final void m3891forEachValueimpl(MutableScatterMap<Object, Object> r11, K r12, Function1<? super V, Unit> r13) {
        Object it = r11.get(r12);
        if (it != null) goto L5;
        return;
    L5:
        if ((it instanceof MutableObjectList) == false) goto L10;
        ObjectList this_$iv = (ObjectList) it;
        Object[] content$iv = this_$iv.content;
        int i$iv = 0;
        int r7 = this_$iv._size;
    L7:
        if (i$iv >= r7) goto L15;
        Object value = content$iv[i$iv];
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        r13.invoke(value);
        i$iv = i$iv + 1;
        goto L7
    L15:
        return;
    L10:
        r13.invoke(it);
    }

    /* JADX INFO: renamed from: removeValueIf-impl, reason: not valid java name */
    public static final void m3898removeValueIfimpl(MutableScatterMap<Object, Object> r11, K r12, Function1<? super V, Boolean> r13) {
        Object it = r11.get(r12);
        if (it != null) goto L5;
        return;
    L5:
        if ((it instanceof MutableObjectList) == false) goto L20;
        MutableObjectList this_$iv = (MutableObjectList) it;
        int gap$iv = 0;
        int size$iv = this_$iv._size;
        Object[] content$iv = this_$iv.content;
        MutableObjectList this_$iv$iv = this_$iv;
        IntRange r7 = RangesKt.until(0, this_$iv$iv._size);
        int i$iv = r7.getFirst();
        int r8 = r7.getLast();
        if (i$iv > r8) goto L13;
    L8:
        content$iv[i$iv - gap$iv] = content$iv[i$iv];
        if (r13.invoke(content$iv[i$iv]).booleanValue() == false) goto L11;
        gap$iv = gap$iv + 1;
    L11:
        if (i$iv == r8) goto L13;
        i$iv = i$iv + 1;
    L13:
        ArraysKt.fill(content$iv, null, size$iv - gap$iv, size$iv);
        this_$iv._size -= gap$iv;
        if (((MutableObjectList) it).isEmpty() == false) goto L17;
        r11.remove(r12);
    L17:
        if (((MutableObjectList) it).getSize() != 0) goto L26;
        r11.set(r12, ((MutableObjectList) it).first());
        return;
    L26:
        return;
    L20:
        if (r13.invoke(it).booleanValue() == false) goto L28;
        r11.remove(r12);
        return;
    }
}
