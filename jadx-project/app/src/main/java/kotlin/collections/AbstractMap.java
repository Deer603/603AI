package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: AbstractMap.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0007\b'\u0018\u0000 **\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003:\u0001*B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0010\u0010\r\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000eH\u0000¢\u0006\u0002\b\u000fJ\u0013\u0010\u0010\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\u0018\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\b\u0010 \u001a\u00020!H\u0016J\u001c\u0010 \u001a\u00020!2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0002J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0002J#\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010)R\u0014\u0010\u0018\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010'\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lkotlin/collections/AbstractMap;", "K", "V", "", "<init>", "()V", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "containsEntry", "entry", "", "containsEntry$kotlin_stdlib", "equals", "other", "", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "", "isEmpty", "size", "getSize", "()I", "keys", "", "getKeys", "()Ljava/util/Set;", "_keys", "toString", "", "o", "values", "", "getValues", "()Ljava/util/Collection;", "_values", "implFindEntry", "(Ljava/lang/Object;)Ljava/util/Map$Entry;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AbstractMap<K, V> implements Map<K, V>, KMappedMarker {
    public static final Companion Companion = null;
    private volatile Set<? extends K> _keys;
    private volatile Collection<? extends V> _values;

    /* JADX INFO: compiled from: AbstractMap.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007H\u0000¢\u0006\u0002\b\bJ\u001d\u0010\t\u001a\u00020\n2\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007H\u0000¢\u0006\u0002\b\u000bJ'\u0010\f\u001a\u00020\r2\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lkotlin/collections/AbstractMap$Companion;", "", "<init>", "()V", "entryHashCode", "", "e", "", "entryHashCode$kotlin_stdlib", "entryToString", "", "entryToString$kotlin_stdlib", "entryEquals", "", "other", "entryEquals$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final int entryHashCode$kotlin_stdlib(Map.Entry<?, ?> r6) {
            Intrinsics.checkNotNullParameter(r6, "e");
            Object r2 = r6.getKey();
            int r3 = 0;
            if (r2 == null) goto L5;
            int r4 = r2.hashCode();
        L6:
            Object r5 = r6.getValue();
            if (r5 == null) goto L10;
            r3 = r5.hashCode();
        L10:
            return r4 ^ r3;
        L5:
            r4 = 0;
            goto L6
        }

        public final String entryToString$kotlin_stdlib(Map.Entry<?, ?> r5) {
            Intrinsics.checkNotNullParameter(r5, "e");
            return new StringBuilder().append(r5.getKey()).append('=').append(r5.getValue()).toString();
        }

        public final boolean entryEquals$kotlin_stdlib(Map.Entry<?, ?> r4, Object other) {
            Intrinsics.checkNotNullParameter(r4, "e");
            if ((other instanceof Map.Entry) == true) goto L6;
            return false;
        L6:
            if (Intrinsics.areEqual(r4.getKey(), ((Map.Entry) other).getKey()) == true) goto L8;
            return false;
        L8:
            if (Intrinsics.areEqual(r4.getValue(), ((Map.Entry) other).getValue()) == false) goto L12;
            return true;
        L12:
            return false;
        }
    }

    static {
        Companion = new Companion(null);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract Set<Map.Entry<K, V>> getEntries();

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public V put(K r3, V r4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public V remove(Object r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    protected AbstractMap() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object r2) {
        if (implFindEntry(r2) == null) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        Iterable $this$any$iv = entrySet();
        if (($this$any$iv instanceof Collection) == true) goto L5;
    L7:
        Iterator r2 = $this$any$iv.iterator();
    L9:
        if (r2.hasNext() == false) goto L19;
        Object element$iv = r2.next();
        Map.Entry it = (Map.Entry) element$iv;
        if (Intrinsics.areEqual(it.getValue(), value) == false) goto L9;
        return true;
    L19:
        return false;
    L5:
        if (((Collection) $this$any$iv).isEmpty() == false) goto L7;
        return false;
    }

    public final boolean containsEntry$kotlin_stdlib(Map.Entry<?, ?> r7) {
        if (r7 != null) goto L5;
        return false;
    L5:
        Object key = r7.getKey();
        Object value = r7.getValue();
        AbstractMap<K, V> r3 = this;
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Object ourValue = r3.get(key);
        if (Intrinsics.areEqual(value, ourValue) == true) goto L8;
        return false;
    L8:
        if (ourValue != null) goto L12;
        AbstractMap<K, V> r4 = this;
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        if (r4.containsKey(key) == true) goto L14;
        return false;
    L14:
        return true;
    L12:
        return true;
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        if (other != this) goto L6;
        return true;
    L6:
        if ((other instanceof Map) == true) goto L9;
        return false;
    L9:
        if (size() == ((Map) other).size()) goto L11;
        return false;
    L11:
        Iterable $this$all$iv = ((Map) other).entrySet();
        if (($this$all$iv instanceof Collection) == true) goto L14;
    L16:
        Iterator r4 = $this$all$iv.iterator();
    L18:
        if (r4.hasNext() == false) goto L28;
        Object element$iv = r4.next();
        if (containsEntry$kotlin_stdlib((Map.Entry) element$iv) == true) goto L18;
        return false;
    L28:
        return true;
    L14:
        if (((Collection) $this$all$iv).isEmpty() == false) goto L16;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object r2) {
        Map.Entry<K, V> r0 = implFindEntry(r2);
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.getValue();
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public int getSize() {
        return entrySet().size();
    }

    public Set<K> getKeys() {
        if (this._keys != null) goto L5;
        this._keys = new AbstractMap$keys$1(this);
    L5:
        Set<? extends K> r0 = this._keys;
        Intrinsics.checkNotNull(r0);
        return r0;
    }

    static final CharSequence toString$lambda$2(AbstractMap this$0, Map.Entry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this$0.toString(it);
    }

    public String toString() {
        return CollectionsKt.joinToString$default(entrySet(), ", ", "{", "}", 0, null, new AbstractMap$$ExternalSyntheticLambda0(this), 24, null);
    }

    private final String toString(Map.Entry<? extends K, ? extends V> r3) {
        return toString(r3.getKey()) + '=' + toString(r3.getValue());
    }

    private final String toString(Object o) {
        if (o != this) goto L5;
        return "(this Map)";
    L5:
        return String.valueOf(o);
    }

    public Collection<V> getValues() {
        if (this._values != null) goto L5;
        this._values = new AnonymousClass1(this);
    L5:
        Collection<? extends V> r0 = this._values;
        Intrinsics.checkNotNull(r0);
        return r0;
    }

    private final Map.Entry<K, V> implFindEntry(K r8) {
        Iterable $this$firstOrNull$iv = entrySet();
        Iterator r2 = $this$firstOrNull$iv.iterator();
    L4:
        if (r2.hasNext() == false) goto L8;
        Object element$iv = r2.next();
        Map.Entry it = (Map.Entry) element$iv;
        if (Intrinsics.areEqual(it.getKey(), r8) == false) goto L4;
    L10:
        return (Map.Entry) element$iv;
    L8:
        element$iv = null;
        goto L10
    }
}
