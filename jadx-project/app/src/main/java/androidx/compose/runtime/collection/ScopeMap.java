package androidx.compose.runtime.collection;

import androidx.autofill.HintConstants;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScopeMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002B\u001d\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00028\u00002!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001e0\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b&\u0010'J\u001a\u0010(\u001a\u00020\u00152\b\u0010)\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b*\u0010'J;\u0010+\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000f0\u0017H\u0086\b¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b/\u0010\rJ\u001d\u00100\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b4\u00105J5\u00106\u001a\u00020\u000f2#\b\u0004\u00107\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\b¢\u0006\u0004\b8\u00109J\u001d\u0010:\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010;\u001a\u00028\u0001¢\u0006\u0004\b<\u0010\u0013J\u0010\u0010=\u001a\u00020>HÖ\u0001¢\u0006\u0004\b?\u0010@R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0088\u0001\u0004¨\u0006A"}, d2 = {"Landroidx/compose/runtime/collection/ScopeMap;", "Key", "", "Scope", "map", "Landroidx/collection/MutableScatterMap;", "constructor-impl", "(Landroidx/collection/MutableScatterMap;)Landroidx/collection/MutableScatterMap;", "getMap", "()Landroidx/collection/MutableScatterMap;", "size", "", "getSize-impl", "(Landroidx/collection/MutableScatterMap;)I", "add", "", "key", "scope", "add-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)V", "anyScopeOf", "", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "anyScopeOf-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z", "asMap", "", "", "asMap-impl", "(Landroidx/collection/MutableScatterMap;)Ljava/util/Map;", "clear", "clear-impl", "(Landroidx/collection/MutableScatterMap;)V", "contains", "element", "contains-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Z", "equals", "other", "equals-impl", "forEachScopeOf", "forEachScopeOf-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "hashCode", "hashCode-impl", "remove", "remove-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)Z", "removeScope", "removeScope-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)V", "removeScopeIf", "predicate", "removeScopeIf-impl", "(Landroidx/collection/MutableScatterMap;Lkotlin/jvm/functions/Function1;)V", "set", "value", "set-impl", "toString", "", "toString-impl", "(Landroidx/collection/MutableScatterMap;)Ljava/lang/String;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class ScopeMap<Key, Scope> {
    private final MutableScatterMap<Object, Object> map;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ScopeMap m3905boximpl(MutableScatterMap r1) {
        return new ScopeMap(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <Key, Scope> MutableScatterMap<Object, Object> m3907constructorimpl(MutableScatterMap<Object, Object> r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3910equalsimpl(MutableScatterMap<Object, Object> r2, Object r3) {
        if ((r3 instanceof ScopeMap) == true) goto L6;
        return false;
    L6:
        if (Intrinsics.areEqual(r2, ((ScopeMap) r3).m3920unboximpl()) == true) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3911equalsimpl0(MutableScatterMap<Object, Object> r1, MutableScatterMap<Object, Object> r2) {
        return Intrinsics.areEqual(r1, r2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3914hashCodeimpl(MutableScatterMap<Object, Object> r1) {
        return r1.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3919toStringimpl(MutableScatterMap<Object, Object> r2) {
        return "ScopeMap(map=" + r2 + ')';
    }

    public boolean equals(Object r2) {
        return m3910equalsimpl(this.map, r2);
    }

    public int hashCode() {
        return m3914hashCodeimpl(this.map);
    }

    public String toString() {
        return m3919toStringimpl(this.map);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ MutableScatterMap m3920unboximpl() {
        return this.map;
    }

    private /* synthetic */ ScopeMap(MutableScatterMap map) {
        this.map = map;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableScatterMap m3908constructorimpl$default(MutableScatterMap r0, int r1, DefaultConstructorMarker r2) {
        if ((r1 & 1) == 0) goto L6;
        r0 = ScatterMapKt.mutableScatterMapOf();
    L6:
        return m3907constructorimpl(r0);
    }

    public final MutableScatterMap<Object, Object> getMap() {
        return this.map;
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static final int m3913getSizeimpl(MutableScatterMap<Object, Object> r1) {
        return r1.getSize();
    }

    /* JADX INFO: renamed from: add-impl, reason: not valid java name */
    public static final void m3902addimpl(MutableScatterMap<Object, Object> r10, Key r11, Scope r12) {
        int r2 = r10.findInsertIndex(r11);
        if (r2 >= 0) goto L5;
        boolean r5 = true;
    L7:
        if (r5 == false) goto L9;
        Object r7 = null;
    L11:
        if (r7 != null) goto L14;
        Object r9 = r12;
    L21:
        if (r5 == false) goto L23;
        int r3 = ~r2;
        r10.keys[r3] = r11;
        r10.values[r3] = r9;
        return;
    L23:
        r10.values[r2] = r9;
        return;
    L14:
        if ((r7 instanceof MutableScatterSet) == false) goto L16;
        Intrinsics.checkNotNull(r7, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
        ((MutableScatterSet) r7).add(r12);
    L19:
        r9 = r7;
        goto L21
    L16:
        if (r7 == r12) goto L19;
        MutableScatterSet r13 = new MutableScatterSet(0, 1, null);
        Intrinsics.checkNotNull(r7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
        r13.add(r7);
        r13.add(r12);
        r9 = r13;
        goto L21
    L9:
        r7 = r10.values[r2];
        goto L11
    L5:
        r5 = false;
        goto L7
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m3918setimpl(MutableScatterMap<Object, Object> r0, Key r1, Scope r2) {
        r0.set(r1, r2);
    }

    /* JADX INFO: renamed from: contains-impl, reason: not valid java name */
    public static final boolean m3909containsimpl(MutableScatterMap<Object, Object> r1, Key r2) {
        return r1.containsKey(r2);
    }

    /* JADX INFO: renamed from: forEachScopeOf-impl, reason: not valid java name */
    public static final void m3912forEachScopeOfimpl(MutableScatterMap<Object, Object> r21, Key r22, Function1<? super Scope, Unit> r23) {
        Object value = r21.get(r22);
        if (value != null) goto L5;
        return;
    L5:
        if ((value instanceof MutableScatterSet) == false) goto L27;
        ScatterSet this_$iv = (MutableScatterSet) value;
        int $i$f$forEach = 0;
        Object[] elements$iv = this_$iv.elements;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L35;
    L8:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        ScatterSet this_$iv2 = this_$iv;
        int $i$f$forEach2 = $i$f$forEach;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L22;
        int r4 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L11:
        if (j$iv$iv >= bitCount$iv$iv) goto L21;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L15;
        boolean r19 = true;
    L16:
        if (r19 == false) goto L19;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        r23.invoke(elements$iv[index$iv$iv]);
    L19:
        slot$iv$iv = slot$iv$iv >> r4;
        j$iv$iv = j$iv$iv + 1;
        r4 = r4;
        goto L11
    L15:
        r19 = false;
        goto L16
    L21:
        if (bitCount$iv$iv == r4) goto L22;
        return;
    L22:
        if (i$iv$iv == lastIndex$iv$iv) goto L37;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
        $i$f$forEach = $i$f$forEach2;
        goto L8
    L37:
        return;
    L35:
        return;
    L27:
        r23.invoke(value);
    }

    /* JADX INFO: renamed from: anyScopeOf-impl, reason: not valid java name */
    public static final boolean m3903anyScopeOfimpl(MutableScatterMap<Object, Object> r25, Key r26, Function1<? super Scope, Boolean> r27) {
        Object value$iv = r25.get(r26);
        if (value$iv != null) goto L5;
        return false;
    L5:
        if ((value$iv instanceof MutableScatterSet) == false) goto L31;
        ScatterSet this_$iv$iv = (MutableScatterSet) value$iv;
        int $i$f$forEach = 0;
        Object[] elements$iv$iv = this_$iv$iv.elements;
        long[] m$iv$iv$iv = this_$iv$iv.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 > lastIndex$iv$iv$iv) goto L43;
    L8:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
        ScatterSet this_$iv$iv2 = this_$iv$iv;
        int $i$f$forEach2 = $i$f$forEach;
        long $this$maskEmptyOrDeleted$iv$iv$iv$iv = (((~slot$iv$iv$iv) << 7) & slot$iv$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv$iv == (-9187201950435737472L)) goto L25;
        int r5 = 8;
        int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
        int j$iv$iv$iv = 0;
    L11:
        if (j$iv$iv$iv >= bitCount$iv$iv$iv) goto L24;
        long value$iv$iv$iv$iv = slot$iv$iv$iv & 255;
        if (value$iv$iv$iv$iv >= 128) goto L15;
        int $i$f$isFull = 1;
    L16:
        if ($i$f$isFull == 0) goto L22;
        int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
        Object it = elements$iv$iv[index$iv$iv$iv];
        if (r27.invoke(it).booleanValue() == false) goto L22;
        return true;
    L22:
        slot$iv$iv$iv = slot$iv$iv$iv >> r5;
        j$iv$iv$iv = j$iv$iv$iv + 1;
        r5 = r5;
        goto L11
    L15:
        $i$f$isFull = 0;
        goto L16
    L24:
        if (bitCount$iv$iv$iv == r5) goto L25;
        return false;
    L25:
        if (i$iv$iv$iv == lastIndex$iv$iv$iv) goto L46;
        i$iv$iv$iv = i$iv$iv$iv + 1;
        $i$f$forEach = $i$f$forEach2;
        this_$iv$iv = this_$iv$iv2;
        goto L8
    L46:
        return false;
    L43:
        return false;
    L31:
        if (r27.invoke(value$iv).booleanValue() == false) goto L44;
        return true;
    L44:
        return false;
    }

    /* JADX INFO: renamed from: clear-impl, reason: not valid java name */
    public static final void m3906clearimpl(MutableScatterMap<Object, Object> r0) {
        r0.clear();
    }

    /* JADX INFO: renamed from: remove-impl, reason: not valid java name */
    public static final boolean m3915removeimpl(MutableScatterMap<Object, Object> r4, Key r5, Scope r6) {
        Object value = r4.get(r5);
        if (value != null) goto L6;
        return false;
    L6:
        if ((value instanceof MutableScatterSet) == false) goto L14;
        MutableScatterSet set = (MutableScatterSet) value;
        boolean removed = set.remove(r6);
        if (removed == true) goto L10;
    L12:
        return removed;
    L10:
        if (set.isEmpty() == false) goto L12;
        r4.remove(r5);
        goto L12
    L14:
        if (Intrinsics.areEqual(value, r6) == false) goto L18;
        r4.remove(r5);
        return true;
    L18:
        return false;
    }

    /* JADX INFO: renamed from: removeScopeIf-impl, reason: not valid java name */
    public static final void m3917removeScopeIfimpl(MutableScatterMap<Object, Object> r45, Function1<? super Scope, Boolean> r46) {
        int r1 = 0;
        int $i$f$removeIf = 0;
        MutableScatterMap<Object, Object> this_$iv$iv = r45;
        int $i$f$forEachIndexed = 0;
        long[] m$iv$iv = this_$iv$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L56;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L50;
        int r12 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L47;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r19 = true;
    L12:
        if (r19 == false) goto L45;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object r14 = r45.keys[index$iv$iv];
        Object value = r45.values[index$iv$iv];
        int r24 = r12;
        if ((value instanceof MutableScatterSet) == false) goto L39;
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
        MutableScatterSet set = (MutableScatterSet) value;
        Object[] elements$iv = set.elements;
        long[] m$iv$iv2 = set.metadata;
        int lastIndex$iv$iv2 = m$iv$iv2.length - 2;
        int i$iv$iv2 = 0;
        if (0 > lastIndex$iv$iv2) goto L36;
    L17:
        long slot$iv$iv2 = m$iv$iv2[i$iv$iv2];
        int $i$f$forEachIndexed2 = $i$f$forEachIndexed;
        long[] m$iv$iv3 = m$iv$iv;
        long $this$maskEmptyOrDeleted$iv$iv$iv2 = slot$iv$iv;
        long $this$maskEmptyOrDeleted$iv$iv$iv3 = (((~slot$iv$iv2) << 7) & slot$iv$iv2) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv3 == (-9187201950435737472L)) goto L34;
        int bitCount$iv$iv2 = 8 - ((~(i$iv$iv2 - lastIndex$iv$iv2)) >>> 31);
        int j$iv$iv2 = 0;
    L20:
        if (j$iv$iv2 >= bitCount$iv$iv2) goto L32;
        long value$iv$iv$iv2 = slot$iv$iv2 & 255;
        if (value$iv$iv$iv2 >= 128) goto L24;
        boolean r9 = true;
    L25:
        if (r9 == false) goto L30;
        int index$iv$iv2 = (i$iv$iv2 << 3) + j$iv$iv2;
        int j$iv$iv3 = j$iv$iv2;
        if (r46.invoke(elements$iv[index$iv$iv2]).booleanValue() == false) goto L31;
        set.removeElementAt(index$iv$iv2);
    L31:
        slot$iv$iv2 = slot$iv$iv2 >> r24;
        j$iv$iv2 = j$iv$iv3 + 1;
        goto L20
    L30:
        j$iv$iv3 = j$iv$iv2;
        goto L31
    L24:
        r9 = false;
        goto L25
    L32:
        int j$iv$iv4 = r24;
        if (bitCount$iv$iv2 == j$iv$iv4) goto L34;
    L38:
        boolean r2 = set.isEmpty();
    L41:
        if (r2 == false) goto L46;
        r45.removeValueAt(index$iv$iv);
    L46:
        slot$iv$iv = $this$maskEmptyOrDeleted$iv$iv$iv2 >> 8;
        j$iv$iv = j$iv$iv + 1;
        r12 = 8;
        $i$f$removeIf = $i$f$removeIf;
        r1 = r1;
        this_$iv$iv = this_$iv$iv;
        $i$f$forEachIndexed = $i$f$forEachIndexed2;
        m$iv$iv = m$iv$iv3;
    L34:
        if (i$iv$iv2 == lastIndex$iv$iv2) goto L38;
        i$iv$iv2 = i$iv$iv2 + 1;
        slot$iv$iv = $this$maskEmptyOrDeleted$iv$iv$iv2;
        $i$f$forEachIndexed = $i$f$forEachIndexed2;
        m$iv$iv = m$iv$iv3;
        r24 = 8;
        goto L17
    L36:
        $i$f$forEachIndexed2 = $i$f$forEachIndexed;
        m$iv$iv3 = m$iv$iv;
        $this$maskEmptyOrDeleted$iv$iv$iv2 = slot$iv$iv;
        goto L38
    L39:
        $i$f$forEachIndexed2 = $i$f$forEachIndexed;
        m$iv$iv3 = m$iv$iv;
        $this$maskEmptyOrDeleted$iv$iv$iv2 = slot$iv$iv;
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
        r2 = r46.invoke(value).booleanValue();
        goto L41
    L45:
        r1 = r1;
        $i$f$removeIf = $i$f$removeIf;
        this_$iv$iv = this_$iv$iv;
        $i$f$forEachIndexed2 = $i$f$forEachIndexed;
        m$iv$iv3 = m$iv$iv;
        $this$maskEmptyOrDeleted$iv$iv$iv2 = slot$iv$iv;
        goto L46
    L11:
        r19 = false;
        goto L12
    L47:
        int r31 = r1;
        int $i$f$removeIf2 = $i$f$removeIf;
        ScatterMap this_$iv$iv2 = this_$iv$iv;
        int $i$f$forEachIndexed3 = $i$f$forEachIndexed;
        long[] m$iv$iv4 = m$iv$iv;
        if (bitCount$iv$iv != r12) goto L69;
    L51:
        if (i$iv$iv == lastIndex$iv$iv) goto L70;
        i$iv$iv = i$iv$iv + 1;
        $i$f$removeIf = $i$f$removeIf2;
        r1 = r31;
        this_$iv$iv = this_$iv$iv2;
        $i$f$forEachIndexed = $i$f$forEachIndexed3;
        m$iv$iv = m$iv$iv4;
        goto L4
    L70:
        return;
    L69:
        return;
    L50:
        r31 = r1;
        $i$f$removeIf2 = $i$f$removeIf;
        this_$iv$iv2 = this_$iv$iv;
        $i$f$forEachIndexed3 = $i$f$forEachIndexed;
        m$iv$iv4 = m$iv$iv;
        goto L51
    }

    /* JADX INFO: renamed from: removeScope-impl, reason: not valid java name */
    public static final void m3916removeScopeimpl(MutableScatterMap<Object, Object> r21, Scope r22) {
        int $i$f$removeIf = 0;
        MutableScatterMap<Object, Object> this_$iv$iv = r21;
        long[] m$iv$iv = this_$iv$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L33;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L27;
        int r11 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L24;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        boolean r17 = false;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r13 = true;
    L12:
        if (r13 == false) goto L22;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int r16 = r11;
        Object r12 = r21.keys[index$iv$iv];
        Object value = r21.values[index$iv$iv];
        int $i$f$removeIf2 = $i$f$removeIf;
        if ((value instanceof MutableScatterSet) == false) goto L16;
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
        MutableScatterSet set = (MutableScatterSet) value;
        set.remove(r22);
        r17 = set.isEmpty();
    L19:
        if (r17 == false) goto L23;
        r21.removeValueAt(index$iv$iv);
    L23:
        slot$iv$iv = slot$iv$iv >> r16;
        j$iv$iv = j$iv$iv + 1;
        r11 = r16;
        $i$f$removeIf = $i$f$removeIf2;
        goto L7
    L16:
        if (value != r22) goto L19;
        r17 = true;
        goto L19
    L22:
        $i$f$removeIf2 = $i$f$removeIf;
        r16 = r11;
        goto L23
    L11:
        r13 = false;
        goto L12
    L24:
        int $i$f$removeIf3 = $i$f$removeIf;
        if (bitCount$iv$iv != r11) goto L40;
    L28:
        if (i$iv$iv == lastIndex$iv$iv) goto L41;
        i$iv$iv = i$iv$iv + 1;
        $i$f$removeIf = $i$f$removeIf3;
        goto L4
    L41:
        return;
    L40:
        return;
    L27:
        $i$f$removeIf3 = $i$f$removeIf;
        goto L28
    }

    /* JADX INFO: renamed from: asMap-impl, reason: not valid java name */
    public static final Map<Key, Set<Scope>> m3904asMapimpl(MutableScatterMap<Object, Object> r23) {
        HashMap result = new HashMap();
        MutableScatterMap<Object, Object> this_$iv = r23;
        int $i$f$forEach = 0;
        Object[] k$iv = this_$iv.keys;
        Object[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L26;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        HashMap result2 = result;
        ScatterMap this_$iv2 = this_$iv;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L23;
        int r1 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L20;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r18 = true;
    L12:
        if (r18 == false) goto L19;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object key = k$iv[index$iv$iv];
        Object value = v$iv[index$iv$iv];
        HashMap r3 = result2;
        Intrinsics.checkNotNull(key, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap");
        if ((value instanceof MutableScatterSet) == false) goto L16;
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
        MutableScatterSet set = (MutableScatterSet) value;
        Set r4 = set.asSet();
    L17:
        r3.put(key, r4);
        goto L19
    L16:
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
        r4 = SetsKt.mutableSetOf(new Object[]{value});
    L19:
        slot$iv$iv = slot$iv$iv >> r1;
        j$iv$iv = j$iv$iv + 1;
        r1 = r1;
        $i$f$forEach = $i$f$forEach;
        k$iv = k$iv;
        v$iv = v$iv;
        goto L7
    L11:
        r18 = false;
        goto L12
    L20:
        int $i$f$forEach2 = $i$f$forEach;
        Object[] k$iv2 = k$iv;
        Object[] v$iv2 = v$iv;
        if (bitCount$iv$iv != r1) goto L29;
    L24:
        if (i$iv$iv == lastIndex$iv$iv) goto L29;
        i$iv$iv = i$iv$iv + 1;
        result = result2;
        this_$iv = this_$iv2;
        $i$f$forEach = $i$f$forEach2;
        k$iv = k$iv2;
        v$iv = v$iv2;
    L29:
        return result2;
    L23:
        $i$f$forEach2 = $i$f$forEach;
        k$iv2 = k$iv;
        v$iv2 = v$iv;
        goto L24
    L26:
        result2 = result;
        goto L29
    }
}
