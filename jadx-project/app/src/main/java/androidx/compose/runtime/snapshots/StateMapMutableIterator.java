package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: SnapshotStateMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\"\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B3\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0007¢\u0006\u0002\u0010\tJ\b\u0010\u001c\u001a\u00020\u001dH\u0004J\u0006\u0010\u001e\u001a\u00020\u001fJ\"\u0010 \u001a\u0002H!\"\u0004\b\u0002\u0010!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H!0#H\u0084\b¢\u0006\u0002\u0010$J\u0006\u0010%\u001a\u00020\u001dR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR#\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000e¨\u0006&"}, d2 = {"Landroidx/compose/runtime/snapshots/StateMapMutableIterator;", "K", "V", "", "map", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "iterator", "", "", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;Ljava/util/Iterator;)V", "current", "getCurrent", "()Ljava/util/Map$Entry;", "setCurrent", "(Ljava/util/Map$Entry;)V", "getIterator", "()Ljava/util/Iterator;", "getMap", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "modification", "", "getModification", "()I", "setModification", "(I)V", "next", "getNext", "setNext", "advance", "", "hasNext", "", "modify", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "remove", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
abstract class StateMapMutableIterator<K, V> {
    private Map.Entry<? extends K, ? extends V> current;
    private final Iterator<Map.Entry<K, V>> iterator;
    private final SnapshotStateMap<K, V> map;
    private int modification;
    private Map.Entry<? extends K, ? extends V> next;

    /* JADX WARN: Multi-variable type inference failed */
    public StateMapMutableIterator(SnapshotStateMap<K, V> r2, Iterator<? extends Map.Entry<? extends K, ? extends V>> r3) {
        this.map = r2;
        this.iterator = r3;
        this.modification = this.map.getModification$runtime_release();
        advance();
    }

    public static final /* synthetic */ int access$getModification(StateMapMutableIterator $this) {
        return $this.modification;
    }

    public static final /* synthetic */ void access$setModification(StateMapMutableIterator $this, int r1) {
        $this.modification = r1;
    }

    public final SnapshotStateMap<K, V> getMap() {
        return this.map;
    }

    public final Iterator<Map.Entry<K, V>> getIterator() {
        return this.iterator;
    }

    protected final int getModification() {
        return this.modification;
    }

    protected final void setModification(int r1) {
        this.modification = r1;
    }

    protected final Map.Entry<K, V> getCurrent() {
        return this.current;
    }

    protected final void setCurrent(Map.Entry<? extends K, ? extends V> r1) {
        this.current = r1;
    }

    protected final Map.Entry<K, V> getNext() {
        return this.next;
    }

    protected final void setNext(Map.Entry<? extends K, ? extends V> r1) {
        this.next = r1;
    }

    public final void remove() {
        if (getMap().getModification$runtime_release() != access$getModification(this)) goto L11;
        Map.Entry<? extends K, ? extends V> r3 = this.current;
        if (r3 == null) goto L9;
        this.map.remove(r3.getKey());
        this.current = null;
        Unit r2 = Unit.INSTANCE;
        access$setModification(this, getMap().getModification$runtime_release());
        return;
    L9:
        throw new IllegalStateException();
    L11:
        throw new ConcurrentModificationException();
    }

    public final boolean hasNext() {
        if (this.next == null) goto L5;
        return true;
    L5:
        return false;
    }

    protected final void advance() {
        this.current = this.next;
        if (this.iterator.hasNext() == false) goto L5;
        Map.Entry<K, V> r0 = this.iterator.next();
    L6:
        this.next = r0;
        return;
    L5:
        r0 = null;
        goto L6
    }

    protected final <T> T modify(Function0<? extends T> r6) {
        if (getMap().getModification$runtime_release() != access$getModification(this)) goto L7;
        T r1 = r6.invoke();
        access$setModification(this, getMap().getModification$runtime_release());
        return r1;
    L7:
        throw new ConcurrentModificationException();
    }
}
