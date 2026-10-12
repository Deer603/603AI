package androidx.collection;

import androidx.collection.internal.Lock;
import androidx.collection.internal.LruHashMap;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LruCache.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002B\u000f\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0007\u001a\u00020\u0005J/\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u00012\b\u0010\u0019\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0015J\u0006\u0010\b\u001a\u00020\u0005J\u0018\u0010\u001c\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\u0013J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u001d\u0010\u001d\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001¢\u0006\u0002\u0010\u001fJ\u0006\u0010\u000f\u001a\u00020\u0005J\u0015\u0010 \u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0002\u0010\u0013J\u0012\u0010!\u001a\u00020\u00152\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\"\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010#J\u0006\u0010\u0010\u001a\u00020\u0005J\u001d\u0010$\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001H\u0014¢\u0006\u0002\u0010#J\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&J\b\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0005H\u0016R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Landroidx/collection/LruCache;", "K", "", "V", "maxSize", "", "(I)V", "createCount", "evictionCount", "hitCount", "lock", "Landroidx/collection/internal/Lock;", "map", "Landroidx/collection/internal/LruHashMap;", "missCount", "putCount", "size", "create", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "entryRemoved", "", "evicted", "", "oldValue", "newValue", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "evictAll", "get", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "resize", "safeSizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "sizeOf", "snapshot", "", "toString", "", "trimToSize", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final Lock lock;
    private final LruHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int maxSize) {
        this.maxSize = maxSize;
        if (this.maxSize <= 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        RuntimeHelpersKt.throwIllegalArgumentException("maxSize <= 0");
    L9:
        this.map = new LruHashMap(0, 0.75f);
        this.lock = new Lock();
        return;
    L5:
        value$iv = false;
        goto L7
    }

    public void resize(int maxSize) {
        if (maxSize <= 0) goto L4;
        boolean value$iv = true;
    L6:
        if (value$iv == true) goto L8;
        RuntimeHelpersKt.throwIllegalArgumentException("maxSize <= 0");
    L8:
        Lock $this$synchronized$iv = this.lock;
        monitor-enter($this$synchronized$iv);
        this.maxSize = maxSize;     // Catch: Throwable -> L15
        Unit r4 = Unit.INSTANCE;     // Catch: Throwable -> L15
        monitor-exit($this$synchronized$iv);
        trimToSize(maxSize);
        return;
    L15:
        th = move-exception;
        throw th;
    L4:
        value$iv = false;
        goto L6
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final V get(K r10) {
        Intrinsics.checkNotNullParameter(r10, "key");
        Lock r1 = this.lock;
        monitor-enter(r1);
        V r6 = this.map.get(r10);     // Catch: Throwable -> L32
        if (r6 == null) goto L10;
        this.hitCount++;     // Catch: Throwable -> L32
        monitor-exit(r1);
        return r6;
    L10:
        this.missCount++;     // Catch: Throwable -> L32
        monitor-exit(r1);
        V r2 = create(r10);
        if (r2 != null) goto L16;
        return null;
    L16:
        Lock r3 = this.lock;
        monitor-enter(r3);
        this.createCount++;     // Catch: Throwable -> L29
        V r7 = (V) this.map.put(r10, r2);
        if (r7 == null) goto L22;
        this.map.put(r10, r7);     // Catch: Throwable -> L29
    L24:
        monitor-exit(r3);
        if (r7 == null) goto L27;
        entryRemoved(false, r10, r2, r7);
        return r7;
    L27:
        trimToSize(this.maxSize);
        return r2;
    L22:
        this.size += safeSizeOf(r10, r2);     // Catch: Throwable -> L29
        Unit r8 = Unit.INSTANCE;     // Catch: Throwable -> L29
    L29:
        th = move-exception;
        throw th;
    L32:
        th = move-exception;
        throw th;
    }

    public final V put(K r9, V r10) {
        Intrinsics.checkNotNullParameter(r9, "key");
        Intrinsics.checkNotNullParameter(r10, "value");
        Lock $this$synchronized$iv = this.lock;
        monitor-enter($this$synchronized$iv);
        this.putCount++;     // Catch: Throwable -> L14
        this.size += safeSizeOf(r9, r10);     // Catch: Throwable -> L14
        V r6 = this.map.put(r9, r10);     // Catch: Throwable -> L14
        if (r6 == null) goto L8;
        this.size -= safeSizeOf(r9, r6);     // Catch: Throwable -> L14
    L8:
        Unit r5 = Unit.INSTANCE;     // Catch: Throwable -> L14
        monitor-exit($this$synchronized$iv);
        if (r6 == null) goto L12;
        entryRemoved(false, r9, r6, r10);
    L12:
        trimToSize(this.maxSize);
        return r6;
    L14:
        th = move-exception;
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void trimToSize(int r13) {
    L2:
        Lock r2 = this.lock;
        monitor-enter(r2);
        if (this.size >= 0) goto L8;
    L12:
        boolean r7 = false;
    L14:
        if (r7 == true) goto L17;
        RuntimeHelpersKt.throwIllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");     // Catch: Throwable -> L31
    L17:
        if (this.size <= r13) goto L29;
        if (this.map.isEmpty() == true) goto L29;
        Map.Entry r8 = (Map.Entry) CollectionsKt.firstOrNull(this.map.getEntries());     // Catch: Throwable -> L31
        if (r8 == null) goto L23;
        Object r9 = r8.getKey();     // Catch: Throwable -> L31
        Object r10 = r8.getValue();     // Catch: Throwable -> L31
        this.map.remove((K) r9);     // Catch: Throwable -> L31
        this.size -= safeSizeOf(r9, r10);     // Catch: Throwable -> L31
        this.evictionCount++;     // Catch: Throwable -> L31
        monitor-exit(r2);
        entryRemoved(true, r9, r10, null);
        goto L2
    L23:
        monitor-exit(r2);
        return;
    L29:
        monitor-exit(r2);
        return;
    L8:
        if (this.map.isEmpty() == true) goto L10;
    L11:
        r7 = true;
        goto L14
    L10:
        if (this.size != 0) goto L12;
    L31:
        th = move-exception;
        throw th;
    }

    public final V remove(K r9) {
        Intrinsics.checkNotNullParameter(r9, "key");
        Lock $this$synchronized$iv = this.lock;
        monitor-enter($this$synchronized$iv);
        V r6 = this.map.remove(r9);     // Catch: Throwable -> L13
        if (r6 == null) goto L8;
        this.size -= safeSizeOf(r9, r6);     // Catch: Throwable -> L13
    L8:
        Unit r5 = Unit.INSTANCE;     // Catch: Throwable -> L13
        monitor-exit($this$synchronized$iv);
        if (r6 == null) goto L12;
        entryRemoved(false, r9, r6, null);
    L12:
        return r6;
    L13:
        th = move-exception;
        throw th;
    }

    protected void entryRemoved(boolean evicted, K r3, V r4, V r5) {
        Intrinsics.checkNotNullParameter(r3, "key");
        Intrinsics.checkNotNullParameter(r4, "oldValue");
    }

    protected V create(K r2) {
        Intrinsics.checkNotNullParameter(r2, "key");
        return null;
    }

    private final int safeSizeOf(K r7, V r8) {
        int result = sizeOf(r7, r8);
        if (result < 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L10;
        RuntimeHelpersKt.throwIllegalStateException("Negative size: " + r7 + '=' + r8);
    L10:
        return result;
    L5:
        value$iv = false;
        goto L7
    }

    protected int sizeOf(K r2, V r3) {
        Intrinsics.checkNotNullParameter(r2, "key");
        Intrinsics.checkNotNullParameter(r3, "value");
        return 1;
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int size() {
        Lock $this$synchronized$iv = this.lock;
        monitor-enter($this$synchronized$iv);
        int r5 = this.size;     // Catch: Throwable -> L8
        monitor-exit($this$synchronized$iv);
        return r5;
    L8:
        th = move-exception;
        throw th;
    }

    public final int maxSize() {
        Lock $this$synchronized$iv = this.lock;
        monitor-enter($this$synchronized$iv);
        int r5 = this.maxSize;     // Catch: Throwable -> L8
        monitor-exit($this$synchronized$iv);
        return r5;
    L8:
        th = move-exception;
        throw th;
    }

    public final int hitCount() {
        Lock $this$synchronized$iv = this.lock;
        monitor-enter($this$synchronized$iv);
        int r5 = this.hitCount;     // Catch: Throwable -> L8
        monitor-exit($this$synchronized$iv);
        return r5;
    L8:
        th = move-exception;
        throw th;
    }

    public final int missCount() {
        Lock $this$synchronized$iv = this.lock;
        monitor-enter($this$synchronized$iv);
        int r5 = this.missCount;     // Catch: Throwable -> L8
        monitor-exit($this$synchronized$iv);
        return r5;
    L8:
        th = move-exception;
        throw th;
    }

    public final int createCount() {
        Lock $this$synchronized$iv = this.lock;
        monitor-enter($this$synchronized$iv);
        int r5 = this.createCount;     // Catch: Throwable -> L8
        monitor-exit($this$synchronized$iv);
        return r5;
    L8:
        th = move-exception;
        throw th;
    }

    public final int putCount() {
        Lock $this$synchronized$iv = this.lock;
        monitor-enter($this$synchronized$iv);
        int r5 = this.putCount;     // Catch: Throwable -> L8
        monitor-exit($this$synchronized$iv);
        return r5;
    L8:
        th = move-exception;
        throw th;
    }

    public final int evictionCount() {
        Lock $this$synchronized$iv = this.lock;
        monitor-enter($this$synchronized$iv);
        int r5 = this.evictionCount;     // Catch: Throwable -> L8
        monitor-exit($this$synchronized$iv);
        return r5;
    L8:
        th = move-exception;
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<K, V> snapshot() {
        Lock $this$synchronized$iv = this.lock;
        monitor-enter($this$synchronized$iv);
        LinkedHashMap copy = new LinkedHashMap(this.map.getEntries().size());     // Catch: Throwable -> L12
        Iterable $this$forEach$iv = this.map.getEntries();     // Catch: Throwable -> L12
        Iterator r8 = $this$forEach$iv.iterator();     // Catch: Throwable -> L12
    L7:
        if (r8.hasNext() == false) goto L9;
        Object element$iv = r8.next();     // Catch: Throwable -> L12
        Map.Entry r10 = (Map.Entry) element$iv;     // Catch: Throwable -> L12
        Object key = r10.getKey();     // Catch: Throwable -> L12
        Object value = r10.getValue();     // Catch: Throwable -> L12
        copy.put(key, value);     // Catch: Throwable -> L12
        goto L7
    L9:
        LinkedHashMap r6 = copy;     // Catch: Throwable -> L12
        monitor-exit($this$synchronized$iv);
        return r6;
    L12:
        th = move-exception;
        throw th;
    }

    public String toString() {
        Lock $this$synchronized$iv = this.lock;
        monitor-enter($this$synchronized$iv);
        int accesses = this.hitCount + this.missCount;     // Catch: Throwable -> L12
        if (accesses == 0) goto L8;
        int hitPercent = (this.hitCount * 100) / accesses;     // Catch: Throwable -> L12
    L9:
        String r7 = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + hitPercent + "%]";     // Catch: Throwable -> L12
        monitor-exit($this$synchronized$iv);
        return r7;
    L8:
        hitPercent = 0;
    L12:
        th = move-exception;
        throw th;
    }
}
