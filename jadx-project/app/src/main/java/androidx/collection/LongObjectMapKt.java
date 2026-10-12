package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LongObjectMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0015\u001aD\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u0001\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001aL\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\n\u001a\u00020\u000b2\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u0001\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a'\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0011\u001a7\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0014\u001aG\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0017\u001aW\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u0002H\u00052\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u0002H\u0005¢\u0006\u0002\u0010\u001a\u001ag\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u0002H\u00052\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u0002H\u00052\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u0002H\u0005¢\u0006\u0002\u0010\u001d\u001a\u0012\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u0005\u001a'\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u0002H\u0005¢\u0006\u0002\u0010\u001f\u001a7\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u0002H\u0005¢\u0006\u0002\u0010 \u001aG\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u0002H\u0005¢\u0006\u0002\u0010!\u001aW\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u0002H\u00052\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u0002H\u0005¢\u0006\u0002\u0010\"\u001ag\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u0002H\u00052\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u0002H\u00052\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u0002H\u0005¢\u0006\u0002\u0010#\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006$"}, d2 = {"EmptyLongObjectMap", "Landroidx/collection/MutableLongObjectMap;", "", "buildLongObjectMap", "Landroidx/collection/LongObjectMap;", "V", "builderAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "initialCapacity", "", "emptyLongObjectMap", "longObjectMapOf", "key1", "", "value1", "(JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "key2", "value2", "(JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "key3", "value3", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "key4", "value4", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "key5", "value5", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "mutableLongObjectMapOf", "(JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "(JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LongObjectMapKt {
    private static final MutableLongObjectMap EmptyLongObjectMap = null;

    static {
        EmptyLongObjectMap = new MutableLongObjectMap(0);
    }

    public static final <V> LongObjectMap<V> emptyLongObjectMap() {
        MutableLongObjectMap r0 = EmptyLongObjectMap;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        return r0;
    }

    public static final <V> LongObjectMap<V> longObjectMapOf() {
        MutableLongObjectMap r0 = EmptyLongObjectMap;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.longObjectMapOf>");
        return r0;
    }

    public static final <V> LongObjectMap<V> longObjectMapOf(long key1, V r6) {
        MutableLongObjectMap map = new MutableLongObjectMap(0, 1, null);
        map.set(key1, r6);
        return map;
    }

    public static final <V> LongObjectMap<V> longObjectMapOf(long key1, V r6, long key2, V r9) {
        MutableLongObjectMap map = new MutableLongObjectMap(0, 1, null);
        map.set(key1, r6);
        map.set(key2, r9);
        return map;
    }

    public static final <V> LongObjectMap<V> longObjectMapOf(long key1, V r6, long key2, V r9, long key3, V r12) {
        MutableLongObjectMap map = new MutableLongObjectMap(0, 1, null);
        map.set(key1, r6);
        map.set(key2, r9);
        map.set(key3, r12);
        return map;
    }

    public static final <V> LongObjectMap<V> longObjectMapOf(long key1, V r6, long key2, V r9, long key3, V r12, long key4, V r15) {
        MutableLongObjectMap map = new MutableLongObjectMap(0, 1, null);
        map.set(key1, r6);
        map.set(key2, r9);
        map.set(key3, r12);
        map.set(key4, r15);
        return map;
    }

    public static final <V> LongObjectMap<V> longObjectMapOf(long key1, V r18, long key2, V r21, long key3, V r24, long key4, V r27, long key5, V r30) {
        MutableLongObjectMap map = new MutableLongObjectMap(0, 1, null);
        map.set(key1, r18);
        map.set(key2, r21);
        map.set(key3, r24);
        map.set(key4, r27);
        map.set(key5, r30);
        return map;
    }

    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf() {
        return new MutableLongObjectMap(0, 1, null);
    }

    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long key1, V r6) {
        MutableLongObjectMap<V> r0 = new MutableLongObjectMap(0, 1, null);
        r0.set(key1, r6);
        return r0;
    }

    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long key1, V r6, long key2, V r9) {
        MutableLongObjectMap<V> r0 = new MutableLongObjectMap(0, 1, null);
        r0.set(key1, r6);
        r0.set(key2, r9);
        return r0;
    }

    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long key1, V r6, long key2, V r9, long key3, V r12) {
        MutableLongObjectMap<V> r0 = new MutableLongObjectMap(0, 1, null);
        r0.set(key1, r6);
        r0.set(key2, r9);
        r0.set(key3, r12);
        return r0;
    }

    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long key1, V r6, long key2, V r9, long key3, V r12, long key4, V r15) {
        MutableLongObjectMap<V> r0 = new MutableLongObjectMap(0, 1, null);
        r0.set(key1, r6);
        r0.set(key2, r9);
        r0.set(key3, r12);
        r0.set(key4, r15);
        return r0;
    }

    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long key1, V r18, long key2, V r21, long key3, V r24, long key4, V r27, long key5, V r30) {
        MutableLongObjectMap<V> r0 = new MutableLongObjectMap(0, 1, null);
        r0.set(key1, r18);
        r0.set(key2, r21);
        r0.set(key3, r24);
        r0.set(key4, r27);
        r0.set(key5, r30);
        return r0;
    }

    public static final <V> LongObjectMap<V> buildLongObjectMap(Function1<? super MutableLongObjectMap<V>, Unit> r5) {
        Intrinsics.checkNotNullParameter(r5, "builderAction");
        MutableLongObjectMap r1 = new MutableLongObjectMap(0, 1, null);
        r5.invoke(r1);
        return r1;
    }

    public static final <V> LongObjectMap<V> buildLongObjectMap(int initialCapacity, Function1<? super MutableLongObjectMap<V>, Unit> r3) {
        Intrinsics.checkNotNullParameter(r3, "builderAction");
        MutableLongObjectMap r1 = new MutableLongObjectMap(initialCapacity);
        r3.invoke(r1);
        return r1;
    }
}
