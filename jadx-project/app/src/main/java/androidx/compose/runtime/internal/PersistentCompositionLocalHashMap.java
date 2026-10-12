package androidx.compose.runtime.internal;

import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalMapKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ValueHolder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PersistentCompositionLocalMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00192\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005:\u0002\u0018\u0019B1\u0012\"\u0010\u0006\u001a\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\"\u0010\u0012\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0002H\u0096\u0002¢\u0006\u0002\u0010\u0015J(\u0010\u0016\u001a\u00020\u00052\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004H\u0016R6\u0010\u000b\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\r0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/ValueHolder;", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "size", "", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", "entries", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "", "getEntries", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "builder", "Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Builder;", "get", "T", "key", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "putValue", "value", "Builder", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PersistentCompositionLocalHashMap extends PersistentHashMap<CompositionLocal<Object>, ValueHolder<Object>> implements PersistentCompositionLocalMap {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final PersistentCompositionLocalHashMap Empty = null;

    /* JADX INFO: compiled from: PersistentCompositionLocalMap.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\u0007H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Builder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/ValueHolder;", "Landroidx/compose/runtime/PersistentCompositionLocalMap$Builder;", "map", "Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "(Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;)V", "getMap$runtime_release", "()Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "setMap$runtime_release", "build", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder extends PersistentHashMapBuilder<CompositionLocal<Object>, ValueHolder<Object>> implements PersistentCompositionLocalMap.Builder {
        public static final int $stable = 0;
        private PersistentCompositionLocalHashMap map;

        static {
            $stable = 8;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
        public /* bridge */ /* synthetic */ PersistentMap<CompositionLocal<Object>, ValueHolder<Object>> build() {
            return build();
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
        /* JADX INFO: renamed from: build, reason: avoid collision after fix types in other method */
        public /* bridge */ /* synthetic */ PersistentMap<CompositionLocal<Object>, ValueHolder<Object>> build2() {
            return build();
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
        public /* bridge */ /* synthetic */ PersistentMap<CompositionLocal<Object>, ValueHolder<Object>> build() {
            return build();
        }

        public /* bridge */ boolean containsKey(CompositionLocal<Object> r2) {
            return super.containsKey(r2);
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object key) {
            if ((key instanceof CompositionLocal) == true) goto L7;
            return false;
        L7:
            return containsKey((CompositionLocal) key);
        }

        public /* bridge */ boolean containsValue(ValueHolder<Object> r2) {
            return super.containsValue(r2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object value) {
            if ((value instanceof ValueHolder) == true) goto L7;
            return false;
        L7:
            return containsValue((ValueHolder) value);
        }

        public /* bridge */ ValueHolder<Object> get(CompositionLocal<Object> r2) {
            return (ValueHolder) super.get(r2);
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ ValueHolder<Object> get(Object key) {
            if ((key instanceof CompositionLocal) == true) goto L7;
            return null;
        L7:
            return get((CompositionLocal) key);
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object key) {
            if ((key instanceof CompositionLocal) == true) goto L7;
            return null;
        L7:
            return get((CompositionLocal) key);
        }

        public final PersistentCompositionLocalHashMap getMap$runtime_release() {
            return this.map;
        }

        public /* bridge */ ValueHolder<Object> getOrDefault(CompositionLocal<Object> r2, ValueHolder<Object> r3) {
            return (ValueHolder) super.getOrDefault(r2, r3);
        }

        public final /* bridge */ ValueHolder getOrDefault(Object key, ValueHolder defaultValue) {
            if ((key instanceof CompositionLocal) == true) goto L6;
            return defaultValue;
        L6:
            return getOrDefault((CompositionLocal) key, defaultValue);
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object key, Object defaultValue) {
            if ((key instanceof CompositionLocal) == true) goto L6;
            return defaultValue;
        L6:
            return getOrDefault((CompositionLocal) key, (ValueHolder) defaultValue);
        }

        public /* bridge */ ValueHolder<Object> remove(CompositionLocal<Object> r2) {
            return (ValueHolder) super.remove(r2);
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ ValueHolder<Object> remove(Object key) {
            if ((key instanceof CompositionLocal) == true) goto L7;
            return null;
        L7:
            return remove((CompositionLocal) key);
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object key) {
            if ((key instanceof CompositionLocal) == true) goto L7;
            return null;
        L7:
            return remove((CompositionLocal) key);
        }

        public final void setMap$runtime_release(PersistentCompositionLocalHashMap r1) {
            this.map = r1;
        }

        public Builder(PersistentCompositionLocalHashMap map) {
            super(map);
            this.map = map;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
        public PersistentMap<CompositionLocal<Object>, ValueHolder<Object>> build() {
            if (getNode$runtime_release() != this.map.getNode$runtime_release()) goto L5;
            PersistentCompositionLocalHashMap r0 = this.map;
        L6:
            this.map = r0;
            return this.map;
        L5:
            setOwnership(new MutabilityOwnership());
            r0 = new PersistentCompositionLocalHashMap(getNode$runtime_release(), size());
            goto L6
        }
    }

    /* JADX INFO: compiled from: PersistentCompositionLocalMap.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\u00020\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Companion;", "", "()V", "Empty", "Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "getEmpty$annotations", "getEmpty", "()Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        public static /* synthetic */ void getEmpty$annotations() {
        }

        private Companion() {
        }

        public final PersistentCompositionLocalHashMap getEmpty() {
            return PersistentCompositionLocalHashMap.access$getEmpty$cp();
        }
    }

    public static final /* synthetic */ PersistentCompositionLocalHashMap access$getEmpty$cp() {
        return Empty;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public /* bridge */ /* synthetic */ PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> builder() {
        return builder();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    /* JADX INFO: renamed from: builder, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> builder2() {
        return builder();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public /* bridge */ /* synthetic */ PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> builder() {
        return builder();
    }

    public /* bridge */ boolean containsKey(CompositionLocal<Object> r2) {
        return super.containsKey(r2);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object key) {
        if ((key instanceof CompositionLocal) == true) goto L7;
        return false;
    L7:
        return containsKey((CompositionLocal) key);
    }

    public /* bridge */ boolean containsValue(ValueHolder<Object> r2) {
        return super.containsValue(r2);
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object value) {
        if ((value instanceof ValueHolder) == true) goto L7;
        return false;
    L7:
        return containsValue((ValueHolder) value);
    }

    @Override // androidx.compose.runtime.CompositionLocalMap
    public /* bridge */ ValueHolder<Object> get(CompositionLocal<Object> r2) {
        return (ValueHolder) super.get(r2);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ ValueHolder<Object> get(Object key) {
        if ((key instanceof CompositionLocal) == true) goto L7;
        return null;
    L7:
        return get((CompositionLocal) key);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object key) {
        if ((key instanceof CompositionLocal) == true) goto L7;
        return null;
    L7:
        return get((CompositionLocal) key);
    }

    public /* bridge */ ValueHolder<Object> getOrDefault(CompositionLocal<Object> r2, ValueHolder<Object> r3) {
        return (ValueHolder) super.getOrDefault(r2, r3);
    }

    public final /* bridge */ ValueHolder getOrDefault(Object key, ValueHolder defaultValue) {
        if ((key instanceof CompositionLocal) == true) goto L6;
        return defaultValue;
    L6:
        return getOrDefault((CompositionLocal) key, defaultValue);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object key, Object defaultValue) {
        if ((key instanceof CompositionLocal) == true) goto L6;
        return defaultValue;
    L6:
        return getOrDefault((CompositionLocal) key, (ValueHolder) defaultValue);
    }

    public PersistentCompositionLocalHashMap(TrieNode<CompositionLocal<Object>, ValueHolder<Object>> r1, int size) {
        super(r1, size);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, kotlin.collections.AbstractMap, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableSet<Map.Entry<CompositionLocal<Object>, ValueHolder<Object>>> getEntries() {
        return super.getEntries();
    }

    @Override // androidx.compose.runtime.CompositionLocalMap
    public <T> T get(CompositionLocal<T> r2) {
        return (T) CompositionLocalMapKt.read(this, r2);
    }

    @Override // androidx.compose.runtime.PersistentCompositionLocalMap
    public PersistentCompositionLocalMap putValue(CompositionLocal<Object> r6, ValueHolder<Object> r7) {
        TrieNode.ModificationResult<CompositionLocal<Object>, ValueHolder<Object>> r0 = getNode$runtime_release().put(r6.hashCode(), r6, r7, 0);
        if (r0 != null) goto L7;
        return this;
    L7:
        return new PersistentCompositionLocalHashMap(r0.getNode(), size() + r0.getSizeDelta());
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> builder() {
        return new Builder(this);
    }

    static {
        Companion = new Companion(null);
        TrieNode r1 = TrieNode.Companion.getEMPTY$runtime_release();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        Empty = new PersistentCompositionLocalHashMap(r1, 0);
    }
}
