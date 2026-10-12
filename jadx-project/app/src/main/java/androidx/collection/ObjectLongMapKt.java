package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ObjectLongMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0015\u001aD\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u0001\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001aL\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\n\u001a\u00020\u000b2\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u0001\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u0005\u001a'\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011\u001a7\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0002\u0010\u0014\u001aG\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u0002H\u00052\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0002\u0010\u0017\u001aW\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u0002H\u00052\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u0002H\u00052\u0006\u0010\u0019\u001a\u00020\u0010¢\u0006\u0002\u0010\u001a\u001ag\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u0002H\u00052\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u0002H\u00052\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u0002H\u00052\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0002\u0010\u001d\u001a\u0012\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a'\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010 \u001a7\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0002\u0010!\u001aG\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u0002H\u00052\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0002\u0010\"\u001aW\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u0002H\u00052\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u0002H\u00052\u0006\u0010\u0019\u001a\u00020\u0010¢\u0006\u0002\u0010#\u001ag\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u0002H\u00052\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u0002H\u00052\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u0002H\u00052\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0002\u0010$\"\u0016\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006%"}, d2 = {"EmptyObjectLongMap", "Landroidx/collection/MutableObjectLongMap;", "", "buildObjectLongMap", "Landroidx/collection/ObjectLongMap;", "K", "builderAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "initialCapacity", "", "emptyObjectLongMap", "mutableObjectLongMapOf", "key1", "value1", "", "(Ljava/lang/Object;J)Landroidx/collection/MutableObjectLongMap;", "key2", "value2", "(Ljava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/MutableObjectLongMap;", "key3", "value3", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/MutableObjectLongMap;", "key4", "value4", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/MutableObjectLongMap;", "key5", "value5", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/MutableObjectLongMap;", "objectLongMap", "objectLongMapOf", "(Ljava/lang/Object;J)Landroidx/collection/ObjectLongMap;", "(Ljava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/ObjectLongMap;", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/ObjectLongMap;", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/ObjectLongMap;", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/ObjectLongMap;", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ObjectLongMapKt {
    private static final MutableObjectLongMap<Object> EmptyObjectLongMap = null;

    static {
        EmptyObjectLongMap = new MutableObjectLongMap(0);
    }

    public static final <K> ObjectLongMap<K> emptyObjectLongMap() {
        MutableObjectLongMap<Object> r0 = EmptyObjectLongMap;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.collection.ObjectLongMap<K of androidx.collection.ObjectLongMapKt.emptyObjectLongMap>");
        return r0;
    }

    public static final <K> ObjectLongMap<K> objectLongMap() {
        MutableObjectLongMap<Object> r0 = EmptyObjectLongMap;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.collection.ObjectLongMap<K of androidx.collection.ObjectLongMapKt.objectLongMap>");
        return r0;
    }

    public static final <K> ObjectLongMap<K> objectLongMapOf(K r4, long value1) {
        MutableObjectLongMap map = new MutableObjectLongMap(0, 1, null);
        map.set(r4, value1);
        return map;
    }

    public static final <K> ObjectLongMap<K> objectLongMapOf(K r4, long value1, K r7, long value2) {
        MutableObjectLongMap map = new MutableObjectLongMap(0, 1, null);
        map.set(r4, value1);
        map.set(r7, value2);
        return map;
    }

    public static final <K> ObjectLongMap<K> objectLongMapOf(K r4, long value1, K r7, long value2, K r10, long value3) {
        MutableObjectLongMap map = new MutableObjectLongMap(0, 1, null);
        map.set(r4, value1);
        map.set(r7, value2);
        map.set(r10, value3);
        return map;
    }

    public static final <K> ObjectLongMap<K> objectLongMapOf(K r4, long value1, K r7, long value2, K r10, long value3, K r13, long value4) {
        MutableObjectLongMap map = new MutableObjectLongMap(0, 1, null);
        map.set(r4, value1);
        map.set(r7, value2);
        map.set(r10, value3);
        map.set(r13, value4);
        return map;
    }

    public static final <K> ObjectLongMap<K> objectLongMapOf(K r17, long value1, K r20, long value2, K r23, long value3, K r26, long value4, K r29, long value5) {
        MutableObjectLongMap map = new MutableObjectLongMap(0, 1, null);
        map.set(r17, value1);
        map.set(r20, value2);
        map.set(r23, value3);
        map.set(r26, value4);
        map.set(r29, value5);
        return map;
    }

    public static final <K> MutableObjectLongMap<K> mutableObjectLongMapOf() {
        return new MutableObjectLongMap(0, 1, null);
    }

    public static final <K> MutableObjectLongMap<K> mutableObjectLongMapOf(K r4, long value1) {
        MutableObjectLongMap<K> r0 = new MutableObjectLongMap(0, 1, null);
        r0.set(r4, value1);
        return r0;
    }

    public static final <K> MutableObjectLongMap<K> mutableObjectLongMapOf(K r4, long value1, K r7, long value2) {
        MutableObjectLongMap<K> r0 = new MutableObjectLongMap(0, 1, null);
        r0.set(r4, value1);
        r0.set(r7, value2);
        return r0;
    }

    public static final <K> MutableObjectLongMap<K> mutableObjectLongMapOf(K r4, long value1, K r7, long value2, K r10, long value3) {
        MutableObjectLongMap<K> r0 = new MutableObjectLongMap(0, 1, null);
        r0.set(r4, value1);
        r0.set(r7, value2);
        r0.set(r10, value3);
        return r0;
    }

    public static final <K> MutableObjectLongMap<K> mutableObjectLongMapOf(K r4, long value1, K r7, long value2, K r10, long value3, K r13, long value4) {
        MutableObjectLongMap<K> r0 = new MutableObjectLongMap(0, 1, null);
        r0.set(r4, value1);
        r0.set(r7, value2);
        r0.set(r10, value3);
        r0.set(r13, value4);
        return r0;
    }

    public static final <K> MutableObjectLongMap<K> mutableObjectLongMapOf(K r17, long value1, K r20, long value2, K r23, long value3, K r26, long value4, K r29, long value5) {
        MutableObjectLongMap<K> r0 = new MutableObjectLongMap(0, 1, null);
        r0.set(r17, value1);
        r0.set(r20, value2);
        r0.set(r23, value3);
        r0.set(r26, value4);
        r0.set(r29, value5);
        return r0;
    }

    public static final <K> ObjectLongMap<K> buildObjectLongMap(Function1<? super MutableObjectLongMap<K>, Unit> r5) {
        Intrinsics.checkNotNullParameter(r5, "builderAction");
        MutableObjectLongMap r1 = new MutableObjectLongMap(0, 1, null);
        r5.invoke(r1);
        return r1;
    }

    public static final <K> ObjectLongMap<K> buildObjectLongMap(int initialCapacity, Function1<? super MutableObjectLongMap<K>, Unit> r3) {
        Intrinsics.checkNotNullParameter(r3, "builderAction");
        MutableObjectLongMap r1 = new MutableObjectLongMap(initialCapacity);
        r3.invoke(r1);
        return r1;
    }
}
