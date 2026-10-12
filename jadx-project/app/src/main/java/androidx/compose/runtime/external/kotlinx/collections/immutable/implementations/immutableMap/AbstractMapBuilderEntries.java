package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;

/* JADX INFO: compiled from: PersistentHashMapBuilderContentViews.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b \u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0002*\u0004\b\u0001\u0010\u0003*\u0004\b\u0002\u0010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0002H&J\u0013\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0002\u0010\nJ\u001c\u0010\r\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0002H&¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/AbstractMapBuilderEntries;", "E", "", "K", "V", "Lkotlin/collections/AbstractMutableSet;", "()V", "contains", "", "element", "(Ljava/util/Map$Entry;)Z", "containsEntry", "remove", "removeEntry", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AbstractMapBuilderEntries<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractMutableSet<E> {
    public static final int $stable = 0;

    static {
    }

    public abstract boolean containsEntry(Map.Entry<? extends K, ? extends V> r1);

    public abstract boolean removeEntry(Map.Entry<? extends K, ? extends V> r1);

    public AbstractMapBuilderEntries() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object element) {
        if ((element instanceof Map.Entry) == true) goto L7;
        return false;
    L7:
        return contains((Map.Entry) element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object element) {
        if ((element instanceof Map.Entry) == true) goto L7;
        return false;
    L7:
        return remove((Map.Entry) element);
    }

    public final boolean contains(E r2) {
        if ((r2 instanceof Object) == false) goto L5;
        E r0 = r2;
    L7:
        if ((r0 instanceof Map.Entry) == true) goto L11;
        return false;
    L11:
        return containsEntry(r2);
    L5:
        r0 = null;
        goto L7
    }

    public final boolean remove(E r2) {
        if ((r2 instanceof Object) == false) goto L5;
        E r0 = r2;
    L7:
        if ((r0 instanceof Map.Entry) == true) goto L11;
        return false;
    L11:
        return removeEntry(r2);
    L5:
        r0 = null;
        goto L7
    }
}
