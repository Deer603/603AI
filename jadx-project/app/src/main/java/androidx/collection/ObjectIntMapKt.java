package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ObjectIntMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\u001aD\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u0001\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001aL\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\n\u001a\u00020\u000b2\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u0001\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u0005\u001a'\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0002\u0010\u0010\u001a7\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0002\u0010\u0013\u001aG\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0002\u0010\u0016\u001aW\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u0002H\u00052\u0006\u0010\u0018\u001a\u00020\u000b¢\u0006\u0002\u0010\u0019\u001ag\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u0002H\u00052\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u0002H\u00052\u0006\u0010\u001b\u001a\u00020\u000b¢\u0006\u0002\u0010\u001c\u001a\u0012\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a'\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0002\u0010\u001f\u001a7\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0002\u0010 \u001aG\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0002\u0010!\u001aW\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u0002H\u00052\u0006\u0010\u0018\u001a\u00020\u000b¢\u0006\u0002\u0010\"\u001ag\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u0002H\u00052\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u0002H\u00052\u0006\u0010\u001b\u001a\u00020\u000b¢\u0006\u0002\u0010#\"\u0016\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006$"}, d2 = {"EmptyObjectIntMap", "Landroidx/collection/MutableObjectIntMap;", "", "buildObjectIntMap", "Landroidx/collection/ObjectIntMap;", "K", "builderAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "initialCapacity", "", "emptyObjectIntMap", "mutableObjectIntMapOf", "key1", "value1", "(Ljava/lang/Object;I)Landroidx/collection/MutableObjectIntMap;", "key2", "value2", "(Ljava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/MutableObjectIntMap;", "key3", "value3", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/MutableObjectIntMap;", "key4", "value4", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/MutableObjectIntMap;", "key5", "value5", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/MutableObjectIntMap;", "objectIntMap", "objectIntMapOf", "(Ljava/lang/Object;I)Landroidx/collection/ObjectIntMap;", "(Ljava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/ObjectIntMap;", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/ObjectIntMap;", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/ObjectIntMap;", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/ObjectIntMap;", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ObjectIntMapKt {
    private static final MutableObjectIntMap<Object> EmptyObjectIntMap = null;

    static {
        EmptyObjectIntMap = new MutableObjectIntMap(0);
    }

    public static final <K> ObjectIntMap<K> emptyObjectIntMap() {
        MutableObjectIntMap<Object> r0 = EmptyObjectIntMap;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        return r0;
    }

    public static final <K> ObjectIntMap<K> objectIntMap() {
        MutableObjectIntMap<Object> r0 = EmptyObjectIntMap;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.objectIntMap>");
        return r0;
    }

    public static final <K> ObjectIntMap<K> objectIntMapOf(K r4, int value1) {
        MutableObjectIntMap map = new MutableObjectIntMap(0, 1, null);
        map.set(r4, value1);
        return map;
    }

    public static final <K> ObjectIntMap<K> objectIntMapOf(K r4, int value1, K r6, int value2) {
        MutableObjectIntMap map = new MutableObjectIntMap(0, 1, null);
        map.set(r4, value1);
        map.set(r6, value2);
        return map;
    }

    public static final <K> ObjectIntMap<K> objectIntMapOf(K r4, int value1, K r6, int value2, K r8, int value3) {
        MutableObjectIntMap map = new MutableObjectIntMap(0, 1, null);
        map.set(r4, value1);
        map.set(r6, value2);
        map.set(r8, value3);
        return map;
    }

    public static final <K> ObjectIntMap<K> objectIntMapOf(K r4, int value1, K r6, int value2, K r8, int value3, K r10, int value4) {
        MutableObjectIntMap map = new MutableObjectIntMap(0, 1, null);
        map.set(r4, value1);
        map.set(r6, value2);
        map.set(r8, value3);
        map.set(r10, value4);
        return map;
    }

    public static final <K> ObjectIntMap<K> objectIntMapOf(K r4, int value1, K r6, int value2, K r8, int value3, K r10, int value4, K r12, int value5) {
        MutableObjectIntMap map = new MutableObjectIntMap(0, 1, null);
        map.set(r4, value1);
        map.set(r6, value2);
        map.set(r8, value3);
        map.set(r10, value4);
        map.set(r12, value5);
        return map;
    }

    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf() {
        return new MutableObjectIntMap(0, 1, null);
    }

    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K r4, int value1) {
        MutableObjectIntMap<K> r0 = new MutableObjectIntMap(0, 1, null);
        r0.set(r4, value1);
        return r0;
    }

    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K r4, int value1, K r6, int value2) {
        MutableObjectIntMap<K> r0 = new MutableObjectIntMap(0, 1, null);
        r0.set(r4, value1);
        r0.set(r6, value2);
        return r0;
    }

    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K r4, int value1, K r6, int value2, K r8, int value3) {
        MutableObjectIntMap<K> r0 = new MutableObjectIntMap(0, 1, null);
        r0.set(r4, value1);
        r0.set(r6, value2);
        r0.set(r8, value3);
        return r0;
    }

    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K r4, int value1, K r6, int value2, K r8, int value3, K r10, int value4) {
        MutableObjectIntMap<K> r0 = new MutableObjectIntMap(0, 1, null);
        r0.set(r4, value1);
        r0.set(r6, value2);
        r0.set(r8, value3);
        r0.set(r10, value4);
        return r0;
    }

    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K r4, int value1, K r6, int value2, K r8, int value3, K r10, int value4, K r12, int value5) {
        MutableObjectIntMap<K> r0 = new MutableObjectIntMap(0, 1, null);
        r0.set(r4, value1);
        r0.set(r6, value2);
        r0.set(r8, value3);
        r0.set(r10, value4);
        r0.set(r12, value5);
        return r0;
    }

    public static final <K> ObjectIntMap<K> buildObjectIntMap(Function1<? super MutableObjectIntMap<K>, Unit> r5) {
        Intrinsics.checkNotNullParameter(r5, "builderAction");
        MutableObjectIntMap r1 = new MutableObjectIntMap(0, 1, null);
        r5.invoke(r1);
        return r1;
    }

    public static final <K> ObjectIntMap<K> buildObjectIntMap(int initialCapacity, Function1<? super MutableObjectIntMap<K>, Unit> r3) {
        Intrinsics.checkNotNullParameter(r3, "builderAction");
        MutableObjectIntMap r1 = new MutableObjectIntMap(initialCapacity);
        r3.invoke(r1);
        return r1;
    }
}
