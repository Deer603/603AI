package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PersistentHashMapBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0014\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0016J\b\u00101\u001a\u000202H\u0016J\u0015\u00103\u001a\u0002042\u0006\u00105\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00106J\u0018\u00107\u001a\u0004\u0018\u00018\u00012\u0006\u00105\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u00108J\u001f\u00109\u001a\u0004\u0018\u00018\u00012\u0006\u00105\u001a\u00028\u00002\u0006\u0010(\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010:J\u001e\u0010;\u001a\u0002022\u0014\u0010<\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010=H\u0016J\u0017\u0010>\u001a\u0004\u0018\u00018\u00012\u0006\u00105\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00108J\u001b\u0010>\u001a\u0002042\u0006\u00105\u001a\u00028\u00002\u0006\u0010(\u001a\u00028\u0001¢\u0006\u0002\u0010?R&\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u0004\u0018\u00018\u0001X\u0080\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010)\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0010@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0012\"\u0004\b+\u0010\u0014R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u0006@"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "Lkotlin/collections/AbstractMutableMap;", "map", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "modCount", "", "getModCount$runtime_release", "()I", "setModCount$runtime_release", "(I)V", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "getNode$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "setNode$runtime_release", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)V", "operationResult", "getOperationResult$runtime_release", "()Ljava/lang/Object;", "setOperationResult$runtime_release", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "<set-?>", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "ownership", "getOwnership", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "setOwnership", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "value", "size", "getSize", "setSize", "values", "", "getValues", "()Ljava/util/Collection;", "build", "clear", "", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", "", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class PersistentHashMapBuilder<K, V> extends AbstractMutableMap<K, V> implements PersistentMap.Builder<K, V> {
    public static final int $stable = 0;
    private PersistentHashMap<K, V> map;
    private int modCount;
    private TrieNode<K, V> node;
    private V operationResult;
    private MutabilityOwnership ownership;
    private int size;

    static {
        $stable = 8;
    }

    public PersistentHashMapBuilder(PersistentHashMap<K, V> r2) {
        this.map = r2;
        this.ownership = new MutabilityOwnership();
        this.node = this.map.getNode$runtime_release();
        this.size = this.map.size();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
    public /* bridge */ /* synthetic */ PersistentMap build() {
        return build();
    }

    public final MutabilityOwnership getOwnership() {
        return this.ownership;
    }

    protected final void setOwnership(MutabilityOwnership r1) {
        this.ownership = r1;
    }

    public final TrieNode<K, V> getNode$runtime_release() {
        return this.node;
    }

    public final void setNode$runtime_release(TrieNode<K, V> r1) {
        this.node = r1;
    }

    public final V getOperationResult$runtime_release() {
        return this.operationResult;
    }

    public final void setOperationResult$runtime_release(V r1) {
        this.operationResult = r1;
    }

    public final int getModCount$runtime_release() {
        return this.modCount;
    }

    public final void setModCount$runtime_release(int r1) {
        this.modCount = r1;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return this.size;
    }

    public void setSize(int value) {
        this.size = value;
        this.modCount++;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
    public PersistentHashMap<K, V> build() {
        if (this.node != this.map.getNode$runtime_release()) goto L5;
        PersistentHashMap<K, V> r0 = this.map;
    L6:
        this.map = r0;
        return this.map;
    L5:
        this.ownership = new MutabilityOwnership();
        r0 = new PersistentHashMap(this.node, size());
        goto L6
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Set<Map.Entry<K, V>> getEntries() {
        return new PersistentHashMapBuilderEntries(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Set<K> getKeys() {
        return new PersistentHashMapBuilderKeys(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Collection<V> getValues() {
        return new PersistentHashMapBuilderValues(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(K r4) {
        TrieNode<K, V> r0 = this.node;
        if (r4 == null) goto L5;
        int r2 = r4.hashCode();
    L7:
        return r0.containsKey(r2, r4, 0);
    L5:
        r2 = 0;
        goto L7
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(K r4) {
        TrieNode<K, V> r0 = this.node;
        if (r4 == null) goto L5;
        int r2 = r4.hashCode();
    L7:
        return r0.get(r2, r4, 0);
    L5:
        r2 = 0;
        goto L7
    }

    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    public V put(K r8, V r9) {
        this.operationResult = null;
        TrieNode<K, V> r1 = this.node;
        if (r8 == null) goto L5;
        int r0 = r8.hashCode();
    L6:
        this.node = r1.mutablePut(r0, r8, r9, 0, this);
        return this.operationResult;
    L5:
        r0 = 0;
        goto L6
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> r8) {
        if ((r8 instanceof PersistentHashMap) == false) goto L5;
        PersistentHashMap<K, V> r0 = (PersistentHashMap) r8;
    L6:
        if (r0 == null) goto L8;
    L14:
        if (r0 == null) goto L18;
        DeltaCounter intersectionCounter = new DeltaCounter(0, 1, null);
        int oldSize = size();
        TrieNode<K, V> r3 = this.node;
        TrieNode<K, V> r5 = r0.getNode$runtime_release();
        Intrinsics.checkNotNull(r5, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.node = r3.mutablePutAll(r5, 0, intersectionCounter, this);
        int newSize = (r0.size() + oldSize) - intersectionCounter.getCount();
        if (oldSize == newSize) goto L20;
        setSize(newSize);
        return;
    L20:
        return;
    L18:
        super.putAll(r8);
        return;
    L8:
        if ((r8 instanceof PersistentHashMapBuilder) == false) goto L10;
        PersistentHashMapBuilder r1 = (PersistentHashMapBuilder) r8;
    L11:
        if (r1 == null) goto L13;
        r0 = r1.build();
        goto L14
    L13:
        r0 = null;
        goto L14
    L10:
        r1 = null;
        goto L11
    L5:
        r0 = null;
        goto L6
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(K r4) {
        this.operationResult = null;
        TrieNode<K, V> r0 = this.node;
        if (r4 == null) goto L5;
        int r2 = r4.hashCode();
    L6:
        TrieNode r1 = r0.mutableRemove(r2, r4, 0, this);
        if (r1 != null) goto L9;
        r1 = TrieNode.Companion.getEMPTY$runtime_release();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
    L9:
        this.node = r1;
        return this.operationResult;
    L5:
        r2 = 0;
        goto L6
    }

    @Override // java.util.Map
    public final boolean remove(Object key, Object value) {
        int oldSize = size();
        TrieNode<K, V> r1 = this.node;
        if (key == null) goto L5;
        int r2 = key.hashCode();
    L6:
        TrieNode r9 = r1.mutableRemove(r2, key, value, 0, this);
        if (r9 != null) goto L9;
        r9 = TrieNode.Companion.getEMPTY$runtime_release();
        Intrinsics.checkNotNull(r9, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
    L9:
        this.node = r9;
        if (oldSize == size()) goto L13;
        return true;
    L13:
        return false;
    L5:
        r2 = 0;
        goto L6
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        TrieNode<K, V> r0 = TrieNode.Companion.getEMPTY$runtime_release();
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.node = r0;
        setSize(0);
    }
}
