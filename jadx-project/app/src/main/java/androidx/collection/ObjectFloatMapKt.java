package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ObjectFloatMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0015\u001aD\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u0001\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001aL\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\n\u001a\u00020\u000b2\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u0001\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u0005\u001a'\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011\u001a7\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0002\u0010\u0014\u001aG\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u0002H\u00052\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0002\u0010\u0017\u001aW\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u0002H\u00052\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u0002H\u00052\u0006\u0010\u0019\u001a\u00020\u0010¢\u0006\u0002\u0010\u001a\u001ag\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u0002H\u00052\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u0002H\u00052\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u0002H\u00052\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0002\u0010\u001d\u001a\u0012\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a'\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010 \u001a7\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0002\u0010!\u001aG\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u0002H\u00052\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0002\u0010\"\u001aW\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u0002H\u00052\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u0002H\u00052\u0006\u0010\u0019\u001a\u00020\u0010¢\u0006\u0002\u0010#\u001ag\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u0002H\u00052\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u0002H\u00052\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u0002H\u00052\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0002\u0010$\"\u0016\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006%"}, d2 = {"EmptyObjectFloatMap", "Landroidx/collection/MutableObjectFloatMap;", "", "buildObjectFloatMap", "Landroidx/collection/ObjectFloatMap;", "K", "builderAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "initialCapacity", "", "emptyObjectFloatMap", "mutableObjectFloatMapOf", "key1", "value1", "", "(Ljava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "key2", "value2", "(Ljava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "key3", "value3", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "key4", "value4", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "key5", "value5", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "objectFloatMap", "objectFloatMapOf", "(Ljava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ObjectFloatMapKt {
    private static final MutableObjectFloatMap<Object> EmptyObjectFloatMap = null;

    static {
        EmptyObjectFloatMap = new MutableObjectFloatMap(0);
    }

    public static final <K> ObjectFloatMap<K> emptyObjectFloatMap() {
        MutableObjectFloatMap<Object> r0 = EmptyObjectFloatMap;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.collection.ObjectFloatMap<K of androidx.collection.ObjectFloatMapKt.emptyObjectFloatMap>");
        return r0;
    }

    public static final <K> ObjectFloatMap<K> objectFloatMap() {
        MutableObjectFloatMap<Object> r0 = EmptyObjectFloatMap;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.collection.ObjectFloatMap<K of androidx.collection.ObjectFloatMapKt.objectFloatMap>");
        return r0;
    }

    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K r4, float value1) {
        MutableObjectFloatMap map = new MutableObjectFloatMap(0, 1, null);
        map.set(r4, value1);
        return map;
    }

    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K r4, float value1, K r6, float value2) {
        MutableObjectFloatMap map = new MutableObjectFloatMap(0, 1, null);
        map.set(r4, value1);
        map.set(r6, value2);
        return map;
    }

    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K r4, float value1, K r6, float value2, K r8, float value3) {
        MutableObjectFloatMap map = new MutableObjectFloatMap(0, 1, null);
        map.set(r4, value1);
        map.set(r6, value2);
        map.set(r8, value3);
        return map;
    }

    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K r4, float value1, K r6, float value2, K r8, float value3, K r10, float value4) {
        MutableObjectFloatMap map = new MutableObjectFloatMap(0, 1, null);
        map.set(r4, value1);
        map.set(r6, value2);
        map.set(r8, value3);
        map.set(r10, value4);
        return map;
    }

    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K r4, float value1, K r6, float value2, K r8, float value3, K r10, float value4, K r12, float value5) {
        MutableObjectFloatMap map = new MutableObjectFloatMap(0, 1, null);
        map.set(r4, value1);
        map.set(r6, value2);
        map.set(r8, value3);
        map.set(r10, value4);
        map.set(r12, value5);
        return map;
    }

    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf() {
        return new MutableObjectFloatMap(0, 1, null);
    }

    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K r4, float value1) {
        MutableObjectFloatMap<K> r0 = new MutableObjectFloatMap(0, 1, null);
        r0.set(r4, value1);
        return r0;
    }

    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K r4, float value1, K r6, float value2) {
        MutableObjectFloatMap<K> r0 = new MutableObjectFloatMap(0, 1, null);
        r0.set(r4, value1);
        r0.set(r6, value2);
        return r0;
    }

    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K r4, float value1, K r6, float value2, K r8, float value3) {
        MutableObjectFloatMap<K> r0 = new MutableObjectFloatMap(0, 1, null);
        r0.set(r4, value1);
        r0.set(r6, value2);
        r0.set(r8, value3);
        return r0;
    }

    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K r4, float value1, K r6, float value2, K r8, float value3, K r10, float value4) {
        MutableObjectFloatMap<K> r0 = new MutableObjectFloatMap(0, 1, null);
        r0.set(r4, value1);
        r0.set(r6, value2);
        r0.set(r8, value3);
        r0.set(r10, value4);
        return r0;
    }

    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K r4, float value1, K r6, float value2, K r8, float value3, K r10, float value4, K r12, float value5) {
        MutableObjectFloatMap<K> r0 = new MutableObjectFloatMap(0, 1, null);
        r0.set(r4, value1);
        r0.set(r6, value2);
        r0.set(r8, value3);
        r0.set(r10, value4);
        r0.set(r12, value5);
        return r0;
    }

    public static final <K> ObjectFloatMap<K> buildObjectFloatMap(Function1<? super MutableObjectFloatMap<K>, Unit> r5) {
        Intrinsics.checkNotNullParameter(r5, "builderAction");
        MutableObjectFloatMap r1 = new MutableObjectFloatMap(0, 1, null);
        r5.invoke(r1);
        return r1;
    }

    public static final <K> ObjectFloatMap<K> buildObjectFloatMap(int initialCapacity, Function1<? super MutableObjectFloatMap<K>, Unit> r3) {
        Intrinsics.checkNotNullParameter(r3, "builderAction");
        MutableObjectFloatMap r1 = new MutableObjectFloatMap(initialCapacity);
        r3.invoke(r1);
        return r1;
    }
}
