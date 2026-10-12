package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: SaveableStateRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0018\u00010\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u0010\u0010\u0007\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J\u001c\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u0003H\u0016J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00042\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000eH\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000e0\r\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateRegistryImpl;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "restored", "", "", "", "", "canBeSaved", "Lkotlin/Function1;", "", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "Landroidx/collection/MutableScatterMap;", "valueProviders", "", "Lkotlin/Function0;", "value", "consumeRestored", "key", "performSave", "registerProvider", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "valueProvider", "runtime-saveable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SaveableStateRegistryImpl implements SaveableStateRegistry {
    private final Function1<Object, Boolean> canBeSaved;
    private final MutableScatterMap<String, List<Object>> restored;
    private MutableScatterMap<String, List<Function0<Object>>> valueProviders;

    public SaveableStateRegistryImpl(Map<String, ? extends List<? extends Object>> r2, Function1<Object, Boolean> r3) {
        this.canBeSaved = r3;
        if (r2 != null) goto L5;
    L8:
        boolean r0 = true;
    L9:
        if (r0 == true) goto L11;
        MutableScatterMap<String, List<Object>> r1 = SaveableStateRegistryKt.access$toMutableScatterMap(r2);
    L12:
        this.restored = r1;
        return;
    L11:
        r1 = null;
        goto L12
    L5:
        if (r2.isEmpty() == true) goto L8;
        r0 = false;
        goto L9
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(Object value) {
        return this.canBeSaved.invoke(value).booleanValue();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object consumeRestored(String key) {
        MutableScatterMap<String, List<Object>> r0 = this.restored;
        if (r0 == null) goto L5;
        List<Object> r1 = r0.remove(key);
    L6:
        List<Object> r2 = r1;
        if (r2 != null) goto L9;
    L12:
        boolean r3 = true;
    L13:
        if (r3 == false) goto L15;
        return null;
    L15:
        if (r1.size() <= 1) goto L21;
        MutableScatterMap<String, List<Object>> r4 = this.restored;
        if (r4 == null) goto L21;
        List<Object> r5 = r4.put(key, r1.subList(1, r1.size()));
    L21:
        return r1.get(0);
    L9:
        if (r2.isEmpty() == true) goto L12;
        r3 = false;
        goto L13
    L5:
        r1 = null;
        goto L6
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public SaveableStateRegistry.Entry registerProvider(final String key, final Function0<? extends Object> r8) {
        if (SaveableStateRegistryKt.access$fastIsBlank(key) == true) goto L13;
        final MutableScatterMap<String, List<Function0<Object>>> r0 = this.valueProviders;
        if (r0 != null) goto L7;
        r0 = ScatterMapKt.mutableScatterMapOf();
        this.valueProviders = r0;
    L7:
        MutableScatterMap<String, List<Function0<Object>>> r1 = r0;
        List<Function0<Object>> r3 = r1.get(key);
        if (r3 != null) goto L10;
        r3 = new ArrayList();
        r1.set(key, r3);
    L10:
        r3.add(r8);
        return new AnonymousClass3(r0, key, r8);
    L13:
        throw new IllegalArgumentException("Registered key is empty or blank".toString());
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Map<String, List<Object>> performSave() {
        if (this.restored == null) goto L5;
    L8:
        MutableScatterMap<String, List<Object>> r1 = this.restored;
        if (r1 == null) goto L11;
        int r2 = r1.getSize();
    L12:
        MutableScatterMap<String, List<Function0<Object>>> r3 = this.valueProviders;
        if (r3 == null) goto L15;
        int r4 = r3.getSize();
    L16:
        int expectedMapSize = r2 + r4;
        HashMap $this$performSave_u24lambda_u244 = new HashMap(expectedMapSize);
        ScatterMap r6 = this.restored;
        if (r6 == null) goto L41;
        ScatterMap this_$iv = r6;
        long r17 = 128;
        Object[] k$iv = this_$iv.keys;
        Object[] v$iv = this_$iv.values;
        long r21 = 255;
        long[] m$iv$iv = this_$iv.metadata;
        char r19 = 7;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        long r23 = -9187201950435737472L;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L38;
    L20:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        HashMap map = $this$performSave_u24lambda_u244;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L35;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L23:
        if (j$iv$iv >= bitCount$iv$iv) goto L32;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L27;
        int $i$f$isFull = 1;
    L28:
        if ($i$f$isFull == 0) goto L31;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object r30 = k$iv[index$iv$iv];
        List v = (List) v$iv[index$iv$iv];
        String k = (String) r30;
        $this$performSave_u24lambda_u244.put(k, v);
    L31:
        slot$iv$iv = slot$iv$iv >> 8;
        j$iv$iv = j$iv$iv + 1;
        expectedMapSize = expectedMapSize;
        goto L23
    L27:
        $i$f$isFull = 0;
        goto L28
    L32:
        int expectedMapSize2 = expectedMapSize;
        if (bitCount$iv$iv != 8) goto L42;
    L36:
        if (i$iv$iv == lastIndex$iv$iv) goto L42;
        i$iv$iv = i$iv$iv + 1;
        $this$performSave_u24lambda_u244 = map;
        expectedMapSize = expectedMapSize2;
    L42:
        ScatterMap r5 = this.valueProviders;
        if (r5 == null) goto L89;
        ScatterMap this_$iv2 = r5;
        int $i$f$forEach = 0;
        Object[] k$iv2 = this_$iv2.keys;
        Object[] v$iv2 = this_$iv2.values;
        ScatterMap this_$iv$iv = this_$iv2;
        int $i$f$forEachIndexed = 0;
        long[] m$iv$iv2 = this_$iv$iv.metadata;
        int lastIndex$iv$iv2 = m$iv$iv2.length - 2;
        int i$iv$iv2 = 0;
        if (0 > lastIndex$iv$iv2) goto L89;
    L46:
        long slot$iv$iv2 = m$iv$iv2[i$iv$iv2];
        ScatterMap this_$iv3 = this_$iv2;
        int $i$f$forEach2 = $i$f$forEach;
        if (((((~slot$iv$iv2) << r19) & slot$iv$iv2) & r23) == r23) goto L82;
        int bitCount$iv$iv2 = 8 - ((~(i$iv$iv2 - lastIndex$iv$iv2)) >>> 31);
        int j$iv$iv2 = 0;
    L49:
        if (j$iv$iv2 >= bitCount$iv$iv2) goto L79;
        long value$iv$iv$iv2 = slot$iv$iv2 & r21;
        if (value$iv$iv$iv2 >= r17) goto L53;
        int $i$f$isFull2 = 1;
    L54:
        if ($i$f$isFull2 == 0) goto L77;
        int index$iv$iv2 = (i$iv$iv2 << 3) + j$iv$iv2;
        Object r20 = k$iv2[index$iv$iv2];
        int j$iv$iv3 = j$iv$iv2;
        List list = (List) v$iv2[index$iv$iv2];
        String key = (String) r20;
        Object[] k$iv3 = k$iv2;
        if (list.size() != 1) goto L65;
        Object value = ((Function0) list.get(0)).invoke();
        if (value == null) goto L78;
        if (canBeSaved(value) == false) goto L63;
        map.put(key, CollectionsKt.arrayListOf(new Object[]{value}));
        goto L78
    L63:
        throw new IllegalStateException(RememberSaveableKt.generateCannotBeSavedErrorMessage(value).toString());
    L78:
        slot$iv$iv2 = slot$iv$iv2 >> 8;
        j$iv$iv2 = j$iv$iv3 + 1;
        this_$iv$iv = this_$iv$iv;
        k$iv2 = k$iv3;
        v$iv2 = v$iv2;
        $i$f$forEachIndexed = $i$f$forEachIndexed;
        goto L49
    L65:
        HashMap r7 = map;
        int r8 = list.size();
        ArrayList r9 = new ArrayList(r8);
        int $i$f$forEachIndexed2 = 0;
    L66:
        if ($i$f$forEachIndexed2 >= r8) goto L75;
        int index = $i$f$forEachIndexed2;
        int r37 = r8;
        List list2 = list;
        Object value2 = ((Function0) list.get(index)).invoke();
        if (value2 == null) goto L74;
        if (canBeSaved(value2) == true) goto L74;
        throw new IllegalStateException(RememberSaveableKt.generateCannotBeSavedErrorMessage(value2).toString());
    L74:
        r9.add(value2);
        $i$f$forEachIndexed2 = $i$f$forEachIndexed2 + 1;
        r8 = r37;
        list = list2;
        goto L66
    L75:
        r7.put(key, r9);
        goto L78
    L77:
        j$iv$iv3 = j$iv$iv2;
        k$iv3 = k$iv2;
        goto L78
    L53:
        $i$f$isFull2 = 0;
        goto L54
    L79:
        Object[] k$iv4 = k$iv2;
        Object[] v$iv3 = v$iv2;
        ScatterMap this_$iv$iv2 = this_$iv$iv;
        int $i$f$forEachIndexed3 = $i$f$forEachIndexed;
        if (bitCount$iv$iv2 != 8) goto L89;
    L83:
        if (i$iv$iv2 == lastIndex$iv$iv2) goto L89;
        i$iv$iv2 = i$iv$iv2 + 1;
        this_$iv2 = this_$iv3;
        $i$f$forEach = $i$f$forEach2;
        this_$iv$iv = this_$iv$iv2;
        k$iv2 = k$iv4;
        v$iv2 = v$iv3;
        $i$f$forEachIndexed = $i$f$forEachIndexed3;
        goto L46
    L82:
        k$iv4 = k$iv2;
        v$iv3 = v$iv2;
        this_$iv$iv2 = this_$iv$iv;
        $i$f$forEachIndexed3 = $i$f$forEachIndexed;
    L89:
        return map;
    L35:
        expectedMapSize2 = expectedMapSize;
        goto L36
    L38:
        map = $this$performSave_u24lambda_u244;
        goto L42
    L41:
        map = $this$performSave_u24lambda_u244;
        r17 = 128;
        r19 = 7;
        r21 = 255;
        r23 = -9187201950435737472L;
        goto L42
    L15:
        r4 = 0;
        goto L16
    L11:
        r2 = 0;
        goto L12
    L5:
        if (this.valueProviders != null) goto L8;
        return MapsKt.emptyMap();
    }
}
