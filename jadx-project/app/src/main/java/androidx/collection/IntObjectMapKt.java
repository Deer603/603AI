package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IntObjectMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\u001aD\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u0001\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001aL\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\n\u001a\u00020\u000b2\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u0001\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a'\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0010\u001a7\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u0002H\u00052\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0013\u001aG\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u0002H\u00052\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0016\u001aW\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u0002H\u00052\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u0002H\u00052\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0019\u001ag\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u0002H\u00052\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u0002H\u00052\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u0002H\u00052\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u0002H\u0005¢\u0006\u0002\u0010\u001c\u001a\u0012\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u0005\u001a'\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u0002H\u0005¢\u0006\u0002\u0010\u001e\u001a7\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u0002H\u00052\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u0002H\u0005¢\u0006\u0002\u0010\u001f\u001aG\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u0002H\u00052\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u0002H\u0005¢\u0006\u0002\u0010 \u001aW\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u0002H\u00052\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u0002H\u00052\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u0002H\u0005¢\u0006\u0002\u0010!\u001ag\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u0002H\u00052\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u0002H\u00052\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u0002H\u00052\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u0002H\u0005¢\u0006\u0002\u0010\"\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006#"}, d2 = {"EmptyIntObjectMap", "Landroidx/collection/MutableIntObjectMap;", "", "buildIntObjectMap", "Landroidx/collection/IntObjectMap;", "V", "builderAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "initialCapacity", "", "emptyIntObjectMap", "intObjectMapOf", "key1", "value1", "(ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "key2", "value2", "(ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "key3", "value3", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "key4", "value4", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "key5", "value5", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "mutableIntObjectMapOf", "(ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "(ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class IntObjectMapKt {
    private static final MutableIntObjectMap EmptyIntObjectMap = null;

    static {
        EmptyIntObjectMap = new MutableIntObjectMap(0);
    }

    public static final <V> IntObjectMap<V> emptyIntObjectMap() {
        MutableIntObjectMap r0 = EmptyIntObjectMap;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
        return r0;
    }

    public static final <V> IntObjectMap<V> intObjectMapOf() {
        MutableIntObjectMap r0 = EmptyIntObjectMap;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        return r0;
    }

    public static final <V> IntObjectMap<V> intObjectMapOf(int key1, V r5) {
        MutableIntObjectMap map = new MutableIntObjectMap(0, 1, null);
        map.set(key1, r5);
        return map;
    }

    public static final <V> IntObjectMap<V> intObjectMapOf(int key1, V r5, int key2, V r7) {
        MutableIntObjectMap map = new MutableIntObjectMap(0, 1, null);
        map.set(key1, r5);
        map.set(key2, r7);
        return map;
    }

    public static final <V> IntObjectMap<V> intObjectMapOf(int key1, V r5, int key2, V r7, int key3, V r9) {
        MutableIntObjectMap map = new MutableIntObjectMap(0, 1, null);
        map.set(key1, r5);
        map.set(key2, r7);
        map.set(key3, r9);
        return map;
    }

    public static final <V> IntObjectMap<V> intObjectMapOf(int key1, V r5, int key2, V r7, int key3, V r9, int key4, V r11) {
        MutableIntObjectMap map = new MutableIntObjectMap(0, 1, null);
        map.set(key1, r5);
        map.set(key2, r7);
        map.set(key3, r9);
        map.set(key4, r11);
        return map;
    }

    public static final <V> IntObjectMap<V> intObjectMapOf(int key1, V r5, int key2, V r7, int key3, V r9, int key4, V r11, int key5, V r13) {
        MutableIntObjectMap map = new MutableIntObjectMap(0, 1, null);
        map.set(key1, r5);
        map.set(key2, r7);
        map.set(key3, r9);
        map.set(key4, r11);
        map.set(key5, r13);
        return map;
    }

    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf() {
        return new MutableIntObjectMap(0, 1, null);
    }

    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int key1, V r5) {
        MutableIntObjectMap<V> r0 = new MutableIntObjectMap(0, 1, null);
        r0.set(key1, r5);
        return r0;
    }

    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int key1, V r5, int key2, V r7) {
        MutableIntObjectMap<V> r0 = new MutableIntObjectMap(0, 1, null);
        r0.set(key1, r5);
        r0.set(key2, r7);
        return r0;
    }

    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int key1, V r5, int key2, V r7, int key3, V r9) {
        MutableIntObjectMap<V> r0 = new MutableIntObjectMap(0, 1, null);
        r0.set(key1, r5);
        r0.set(key2, r7);
        r0.set(key3, r9);
        return r0;
    }

    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int key1, V r5, int key2, V r7, int key3, V r9, int key4, V r11) {
        MutableIntObjectMap<V> r0 = new MutableIntObjectMap(0, 1, null);
        r0.set(key1, r5);
        r0.set(key2, r7);
        r0.set(key3, r9);
        r0.set(key4, r11);
        return r0;
    }

    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int key1, V r5, int key2, V r7, int key3, V r9, int key4, V r11, int key5, V r13) {
        MutableIntObjectMap<V> r0 = new MutableIntObjectMap(0, 1, null);
        r0.set(key1, r5);
        r0.set(key2, r7);
        r0.set(key3, r9);
        r0.set(key4, r11);
        r0.set(key5, r13);
        return r0;
    }

    public static final <V> IntObjectMap<V> buildIntObjectMap(Function1<? super MutableIntObjectMap<V>, Unit> r5) {
        Intrinsics.checkNotNullParameter(r5, "builderAction");
        MutableIntObjectMap r1 = new MutableIntObjectMap(0, 1, null);
        r5.invoke(r1);
        return r1;
    }

    public static final <V> IntObjectMap<V> buildIntObjectMap(int initialCapacity, Function1<? super MutableIntObjectMap<V>, Unit> r3) {
        Intrinsics.checkNotNullParameter(r3, "builderAction");
        MutableIntObjectMap r1 = new MutableIntObjectMap(initialCapacity);
        r3.invoke(r1);
        return r1;
    }
}
