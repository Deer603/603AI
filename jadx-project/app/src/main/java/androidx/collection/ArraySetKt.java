package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ArraySet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004H\u0086\b\u001a+\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00040\u0006\"\u0002H\u0004¢\u0006\u0002\u0010\u0007\u001a)\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0003H\u0080\b\u001a'\u0010\b\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000eH\u0080\b\u001a&\u0010\u000f\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010\u0010\u001a\u0002H\nH\u0080\b¢\u0006\u0002\u0010\u0011\u001a \u0010\u0012\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010\u0013\u001a\u00020\u0001H\u0000\u001a \u0010\u0014\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010\u0015\u001a\u00020\u0001H\u0000\u001a\u0019\u0010\u0016\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u0003H\u0080\b\u001a'\u0010\u0017\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000eH\u0080\b\u001a&\u0010\u0018\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010\u0010\u001a\u0002H\nH\u0080\b¢\u0006\u0002\u0010\u0011\u001a!\u0010\u0019\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010\u001a\u001a\u00020\u0001H\u0080\b\u001a#\u0010\u001b\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0080\b\u001a\u0019\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u0003H\u0080\b\u001a*\u0010\u001f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\b\u0010 \u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0015\u001a\u00020\u0001H\u0000\u001a#\u0010!\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\b\u0010 \u001a\u0004\u0018\u00010\u001dH\u0080\b\u001a\u0018\u0010\"\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u0003H\u0000\u001a\u0019\u0010#\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u0003H\u0080\b\u001a)\u0010$\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0003H\u0080\b\u001a'\u0010$\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000eH\u0080\b\u001a&\u0010%\u001a\u0002H\n\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010&\u001a\u00020\u0001H\u0080\b¢\u0006\u0002\u0010'\u001a&\u0010(\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010\u0010\u001a\u0002H\nH\u0080\b¢\u0006\u0002\u0010\u0011\u001a'\u0010)\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000eH\u0080\b\u001a\u0019\u0010*\u001a\u00020+\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u0003H\u0080\b\u001a&\u0010,\u001a\u0002H\n\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010&\u001a\u00020\u0001H\u0080\b¢\u0006\u0002\u0010'\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"ARRAY_SET_BASE_SIZE", "", "arraySetOf", "Landroidx/collection/ArraySet;", "T", "values", "", "([Ljava/lang/Object;)Landroidx/collection/ArraySet;", "addAllInternal", "", "E", "array", "", "elements", "", "addInternal", "element", "(Landroidx/collection/ArraySet;Ljava/lang/Object;)Z", "allocArrays", "size", "binarySearchInternal", "hash", "clearInternal", "containsAllInternal", "containsInternal", "ensureCapacityInternal", "minimumCapacity", "equalsInternal", "other", "", "hashCodeInternal", "indexOf", "key", "indexOfInternal", "indexOfNull", "isEmptyInternal", "removeAllInternal", "removeAtInternal", "index", "(Landroidx/collection/ArraySet;I)Ljava/lang/Object;", "removeInternal", "retainAllInternal", "toStringInternal", "", "valueAtInternal", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ArraySetKt {
    public static final int ARRAY_SET_BASE_SIZE = 4;

    public static final <T> ArraySet<T> arraySetOf() {
        return new ArraySet(0, 1, null);
    }

    public static final <T> ArraySet<T> arraySetOf(T... r4) {
        Intrinsics.checkNotNullParameter(r4, "values");
        ArraySet<T> r0 = new ArraySet(r4.length);
        int r1 = r4.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r0.add(r4[r2]);
        r2 = r2 + 1;
        goto L3
    L5:
        return r0;
    }

    public static final <E> int binarySearchInternal(ArraySet<E> r2, int hash) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        return ContainerHelpersKt.binarySearch(r2.getHashes$collection(), r2.get_size$collection(), hash);
    L7:
        throw new ConcurrentModificationException();
    }

    public static final <E> int indexOf(ArraySet<E> r5, Object key, int hash) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        int n = r5.get_size$collection();
        if (n != 0) goto L6;
        return -1;
    L6:
        int index = binarySearchInternal(r5, hash);
        if (index >= 0) goto L10;
        return index;
    L10:
        if (Intrinsics.areEqual(key, r5.getArray$collection()[index]) == false) goto L12;
        return index;
    L12:
        int end = index + 1;
    L13:
        if (end >= n) goto L20;
        if (r5.getHashes$collection()[end] != hash) goto L20;
        if (Intrinsics.areEqual(key, r5.getArray$collection()[end]) == true) goto L18;
        end = end + 1;
        goto L13
    L18:
        return end;
    L20:
        int i = index - 1;
    L21:
        if (i < 0) goto L29;
        if (r5.getHashes$collection()[i] != hash) goto L29;
        if (Intrinsics.areEqual(key, r5.getArray$collection()[i]) == true) goto L26;
        i = i - 1;
        goto L21
    L26:
        return i;
    L29:
        return ~end;
    }

    public static final <E> int indexOfNull(ArraySet<E> r2) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        return indexOf(r2, null, 0);
    }

    public static final <E> void allocArrays(ArraySet<E> r1, int size) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        r1.setHashes$collection(new int[size]);
        r1.setArray$collection(new Object[size]);
    }

    public static final <E> void clearInternal(ArraySet<E> r2) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        if (r2.get_size$collection() == 0) goto L6;
        r2.setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
        r2.setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
        r2.set_size$collection(0);
    L6:
        if (r2.get_size$collection() != 0) goto L9;
        return;
    L9:
        throw new ConcurrentModificationException();
    }

    public static final <E> void ensureCapacityInternal(ArraySet<E> r11, int minimumCapacity) {
        Intrinsics.checkNotNullParameter(r11, "<this>");
        int oSize = r11.get_size$collection();
        if (r11.getHashes$collection().length >= minimumCapacity) goto L9;
        int[] ohashes = r11.getHashes$collection();
        Object[] oarray = r11.getArray$collection();
        allocArrays(r11, minimumCapacity);
        if (r11.get_size$collection() <= 0) goto L9;
        ArraysKt.copyInto$default(ohashes, r11.getHashes$collection(), 0, 0, r11.get_size$collection(), 6, null);
        ArraysKt.copyInto$default(oarray, r11.getArray$collection(), 0, 0, r11.get_size$collection(), 6, null);
    L9:
        if (r11.get_size$collection() != oSize) goto L12;
        return;
    L12:
        throw new ConcurrentModificationException();
    }

    public static final <E> boolean containsInternal(ArraySet<E> r2, E r3) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        if (r2.indexOf(r3) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final <E> int indexOfInternal(ArraySet<E> r2, Object key) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        if (key != null) goto L6;
        return indexOfNull(r2);
    L6:
        return indexOf(r2, key, key.hashCode());
    }

    public static final <E> E valueAtInternal(ArraySet<E> r2, int r3) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        return (E) r2.getArray$collection()[r3];
    }

    public static final <E> boolean isEmptyInternal(ArraySet<E> r2) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        if (r2.get_size$collection() > 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final <E> boolean addInternal(ArraySet<E> r17, E r18) {
        Intrinsics.checkNotNullParameter(r17, "<this>");
        int oSize = r17.get_size$collection();
        if (r18 != null) goto L5;
        int hash = 0;
        int index = indexOfNull(r17);
    L6:
        boolean r6 = false;
        if (index < 0) goto L9;
        return false;
    L9:
        int index2 = ~index;
        if (oSize < r17.getHashes$collection().length) goto L28;
        int n = 8;
        if (oSize < 8) goto L15;
        n = (oSize >> 1) + oSize;
    L18:
        int[] ohashes = r17.getHashes$collection();
        Object[] oarray = r17.getArray$collection();
        allocArrays(r17, n);
        if (oSize != r17.get_size$collection()) goto L27;
        if (r17.getHashes$collection().length != 0) goto L23;
        r6 = true;
    L23:
        if (r6 == true) goto L28;
        ArraysKt.copyInto$default(ohashes, r17.getHashes$collection(), 0, 0, ohashes.length, 6, null);
        ArraysKt.copyInto$default(oarray, r17.getArray$collection(), 0, 0, oarray.length, 6, null);
        goto L28
    L27:
        throw new ConcurrentModificationException();
    L15:
        if (oSize >= 4) goto L18;
        n = 4;
    L28:
        if (index2 >= oSize) goto L31;
        ArraysKt.copyInto(r17.getHashes$collection(), r17.getHashes$collection(), index2 + 1, index2, oSize);
        ArraysKt.copyInto(r17.getArray$collection(), r17.getArray$collection(), index2 + 1, index2, oSize);
    L31:
        if (oSize != r17.get_size$collection()) goto L37;
        if (index2 >= r17.getHashes$collection().length) goto L37;
        r17.getHashes$collection()[index2] = hash;
        r17.getArray$collection()[index2] = r18;
        r17.set_size$collection(r17.get_size$collection() + 1);
        return true;
    L37:
        throw new ConcurrentModificationException();
    L5:
        hash = r18.hashCode();
        index = indexOf(r17, r18, hash);
        goto L6
    }

    public static final <E> void addAllInternal(ArraySet<E> r8, ArraySet<? extends E> r9) {
        Intrinsics.checkNotNullParameter(r8, "<this>");
        Intrinsics.checkNotNullParameter(r9, "array");
        int n = r9.get_size$collection();
        r8.ensureCapacity(r8.get_size$collection() + n);
        if (r8.get_size$collection() != 0) goto L10;
        if (n <= 0) goto L13;
        ArraysKt.copyInto$default(r9.getHashes$collection(), r8.getHashes$collection(), 0, 0, n, 6, null);
        ArraysKt.copyInto$default(r9.getArray$collection(), r8.getArray$collection(), 0, 0, n, 6, null);
        if (r8.get_size$collection() != 0) goto L9;
        r8.set_size$collection(n);
        return;
    L9:
        throw new ConcurrentModificationException();
    L13:
        return;
    L10:
        int i = 0;
    L11:
        if (i >= n) goto L16;
        r8.add(r9.valueAt(i));
        i = i + 1;
        goto L11
    }

    public static final <E> boolean removeInternal(ArraySet<E> r3, E r4) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        int index = r3.indexOf(r4);
        if (index < 0) goto L6;
        r3.removeAt(index);
        return true;
    L6:
        return false;
    }

    public static final <E> E removeAtInternal(ArraySet<E> r14, int r15) {
        Intrinsics.checkNotNullParameter(r14, "<this>");
        int r8 = r14.get_size$collection();
        E r9 = (E) r14.getArray$collection()[r15];
        if (r8 > 1) goto L5;
        r14.clear();
    L26:
        return r9;
    L5:
        int r10 = r8 - 1;
        int r2 = 8;
        if (r14.getHashes$collection().length <= 8) goto L20;
        if (r14.get_size$collection() >= (r14.getHashes$collection().length / 3)) goto L20;
        if (r14.get_size$collection() <= 8) goto L13;
        r2 = r14.get_size$collection() + (r14.get_size$collection() >> 1);
    L13:
        int[] r0 = r14.getHashes$collection();
        Object[] r12 = r14.getArray$collection();
        allocArrays(r14, r2);
        if (r15 <= 0) goto L16;
        int r4 = r15;
        ArraysKt.copyInto$default(r0, r14.getHashes$collection(), 0, 0, r4, 6, null);
        Object[] r1 = r12;
        ArraysKt.copyInto$default(r1, r14.getArray$collection(), 0, 0, r4, 6, null);
    L17:
        if (r4 >= r10) goto L24;
        ArraysKt.copyInto(r0, r14.getHashes$collection(), r15, r4 + 1, r10 + 1);
        ArraysKt.copyInto(r1, r14.getArray$collection(), r15, r4 + 1, r10 + 1);
    L24:
        if (r8 != r14.get_size$collection()) goto L28;
        r14.set_size$collection(r10);
        goto L26
    L28:
        throw new ConcurrentModificationException();
    L16:
        r4 = r15;
        r1 = r12;
    L20:
        if (r15 >= r10) goto L22;
        ArraysKt.copyInto(r14.getHashes$collection(), r14.getHashes$collection(), r15, r15 + 1, r10 + 1);
        ArraysKt.copyInto(r14.getArray$collection(), r14.getArray$collection(), r15, r15 + 1, r10 + 1);
    L22:
        r14.getArray$collection()[r10] = null;
        goto L24
    }

    public static final <E> boolean removeAllInternal(ArraySet<E> r5, ArraySet<? extends E> r6) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        Intrinsics.checkNotNullParameter(r6, "array");
        int n = r6.get_size$collection();
        int originalSize = r5.get_size$collection();
        int i = 0;
    L3:
        if (i >= n) goto L5;
        r5.remove(r6.valueAt(i));
        i = i + 1;
        goto L3
    L5:
        int i2 = r5.get_size$collection();
        if (originalSize == i2) goto L8;
        return true;
    L8:
        return false;
    }

    public static final <E> boolean equalsInternal(ArraySet<E> r7, Object other) {
        Intrinsics.checkNotNullParameter(r7, "<this>");
        if (r7 != other) goto L6;
        return true;
    L6:
        if ((other instanceof Set) == true) goto L8;
        return false;
    L8:
        if (r7.size() == ((Set) other).size()) goto L10;
        return false;
    L10:
        int i = 0;
        int r4 = r7.get_size$collection();     // Catch: ClassCastException -> L18 NullPointerException -> L20
    L12:
        if (i >= r4) goto L17;
        Object mine = r7.valueAt(i);     // Catch: ClassCastException -> L18 NullPointerException -> L20
        if (((Set) other).contains(mine) == false) goto L15;
        i = i + 1;
        goto L12
    L15:
        return false;
    L17:
        return true;
    L19:
        return false;
    L21:
        return false;
    }

    public static final <E> int hashCodeInternal(ArraySet<E> r6) {
        Intrinsics.checkNotNullParameter(r6, "<this>");
        int[] hashes = r6.getHashes$collection();
        int s = r6.get_size$collection();
        int result = 0;
        int i = 0;
    L3:
        if (i >= s) goto L5;
        result = result + hashes[i];
        i = i + 1;
        goto L3
    L5:
        return result;
    }

    public static final <E> String toStringInternal(ArraySet<E> r8) {
        Intrinsics.checkNotNullParameter(r8, "<this>");
        if (r8.isEmpty() == false) goto L6;
        return "{}";
    L6:
        StringBuilder $this$toStringInternal_u24lambda_u240 = new StringBuilder(r8.get_size$collection() * 14);
        $this$toStringInternal_u24lambda_u240.append('{');
        int i = 0;
        int r5 = r8.get_size$collection();
    L7:
        if (i >= r5) goto L15;
        if (i <= 0) goto L10;
        $this$toStringInternal_u24lambda_u240.append(", ");
    L10:
        Object value = r8.valueAt(i);
        if (value == r8) goto L13;
        $this$toStringInternal_u24lambda_u240.append(value);
    L14:
        i = i + 1;
        goto L7
    L13:
        $this$toStringInternal_u24lambda_u240.append("(this Set)");
        goto L14
    L15:
        $this$toStringInternal_u24lambda_u240.append('}');
        String r1 = $this$toStringInternal_u24lambda_u240.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    }

    public static final <E> boolean containsAllInternal(ArraySet<E> r4, Collection<? extends E> r5) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        Intrinsics.checkNotNullParameter(r5, "elements");
        Iterator<? extends E> r1 = r5.iterator();
    L4:
        if (r1.hasNext() == false) goto L9;
        Object item = r1.next();
        if (r4.contains(item) == true) goto L4;
        return false;
    L9:
        return true;
    }

    public static final <E> boolean addAllInternal(ArraySet<E> r5, Collection<? extends E> r6) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        Intrinsics.checkNotNullParameter(r6, "elements");
        r5.ensureCapacity(r5.get_size$collection() + r6.size());
        boolean added = false;
        Iterator<? extends E> r2 = r6.iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        added = added | r5.add(r2.next());
        goto L4
    L6:
        return added;
    }

    public static final <E> boolean removeAllInternal(ArraySet<E> r5, Collection<? extends E> r6) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        Intrinsics.checkNotNullParameter(r6, "elements");
        boolean removed = false;
        Iterator<? extends E> r2 = r6.iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        Object value = r2.next();
        removed = removed | r5.remove(value);
        goto L4
    L6:
        return removed;
    }

    public static final <E> boolean retainAllInternal(ArraySet<E> r5, Collection<? extends E> r6) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        Intrinsics.checkNotNullParameter(r6, "elements");
        boolean removed = false;
        int i = r5.get_size$collection();
    L3:
        i = i - 1;
        if ((-1) >= i) goto L9;
        if (CollectionsKt.contains(r6, r5.getArray$collection()[i]) == true) goto L3;
        r5.removeAt(i);
        removed = true;
        goto L3
    L9:
        return removed;
    }
}
