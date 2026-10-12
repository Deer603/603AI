package androidx.arch.core.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class FastSafeIterableMap<K, V> extends SafeIterableMap<K, V> {
    private final HashMap<K, SafeIterableMap.Entry<K, V>> mHashMap;

    public FastSafeIterableMap() {
        this.mHashMap = new HashMap();
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    protected SafeIterableMap.Entry<K, V> get(K k) {
        return this.mHashMap.get(k);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V putIfAbsent(K key, V v) {
        SafeIterableMap.Entry<K, V> current = get(key);
        if (current != null) goto L5;
        this.mHashMap.put(key, put(key, v));
        return null;
    L5:
        return current.mValue;
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V remove(K r3) {
        V r0 = (V) super.remove(r3);
        this.mHashMap.remove(r3);
        return r0;
    }

    public boolean contains(K key) {
        return this.mHashMap.containsKey(key);
    }

    public Map.Entry<K, V> ceil(K k) {
        if (contains(k) == true) goto L5;
        return null;
    L5:
        return this.mHashMap.get(k).mPrevious;
    }
}
