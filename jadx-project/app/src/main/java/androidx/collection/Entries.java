package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00040\u0003B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001d\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J\"\u0010\u000f\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0011H\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\u001b\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0014H\u0096\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Landroidx/collection/Entries;", "K", "V", "", "", "parent", "Landroidx/collection/ScatterMap;", "(Landroidx/collection/ScatterMap;)V", "size", "", "getSize", "()I", "contains", "", "element", "containsAll", "elements", "", "isEmpty", "iterator", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class Entries<K, V> implements Set<Map.Entry<? extends K, ? extends V>>, KMappedMarker {
    private final ScatterMap<K, V> parent;

    /* JADX INFO: renamed from: androidx.collection.Entries$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScatterMap.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.collection.Entries$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1414}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Map.Entry<? extends K, ? extends V>>, Continuation<? super Unit>, Object> {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ Entries<K, V> this$0;

        AnonymousClass1(Entries<K, V> r2, Continuation<? super AnonymousClass1> r3) {
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            AnonymousClass1 r0 = new AnonymousClass1(this.this$0, r4);
            r0.L$0 = r3;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
            return invoke((SequenceScope) r2, r3);
        }

        public final Object invoke(SequenceScope<? super Map.Entry<? extends K, ? extends V>> r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0068 -> B:13:0x007d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00c8 -> B:25:0x00cd). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00cb -> B:25:0x00cd). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00e7 -> B:30:0x00eb). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r26) {
            Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            Object $result = r26;
            int $i$f$forEachIndexed = 0;
            int j$iv = this.I$3;
            int bitCount$iv = this.I$2;
            long slot$iv = this.J$0;
            int i$iv = this.I$1;
            int lastIndex$iv = this.I$0;
            long[] m$iv = (long[]) this.L$2;
            Entries<K, V> r14 = (Entries) this.L$1;
            SequenceScope $this$iterator = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure($result);
            AnonymousClass1 r3 = this;
            int r17 = 8;
        L25:
            slot$iv = slot$iv >> r17;
            j$iv = j$iv + 1;
        L13:
            if (j$iv >= bitCount$iv) goto L27;
            long value$iv$iv = slot$iv & 255;
            if (value$iv$iv >= 128) goto L17;
            boolean r6 = true;
        L18:
            if (r6 == false) goto L25;
            int index = (i$iv << 3) + j$iv;
            Object $result2 = $result;
            MapEntry r0 = new MapEntry(Entries.access$getParent$p(r14).keys[index], Entries.access$getParent$p(r14).values[index]);
            r3.L$0 = $this$iterator;
            r3.L$1 = r14;
            r3.L$2 = m$iv;
            r3.I$0 = lastIndex$iv;
            r3.I$1 = i$iv;
            r3.J$0 = slot$iv;
            r3.I$2 = bitCount$iv;
            r3.I$3 = j$iv;
            r3.label = 1;
            if ($this$iterator.yield(r0, r3) != r1) goto L22;
            return r1;
        L22:
            $result = $result2;
            goto L25
        L17:
            r6 = false;
            goto L18
        L27:
            if (bitCount$iv != r17) goto L36;
            int bitCount$iv2 = $i$f$forEachIndexed;
            int i$iv2 = i$iv;
            int lastIndex$iv2 = lastIndex$iv;
            long[] m$iv2 = m$iv;
            Entries<K, V> r7 = r14;
            SequenceScope $this$iterator2 = $this$iterator;
            AnonymousClass1 r11 = r3;
        L30:
            if (i$iv2 == lastIndex$iv2) goto L36;
            i$iv2 = i$iv2 + 1;
        L10:
            long slot$iv2 = m$iv2[i$iv2];
            r17 = 8;
            if (((((~slot$iv2) << 7) & slot$iv2) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L30;
            int bitCount$iv3 = 8 - ((~(i$iv2 - lastIndex$iv2)) >>> 31);
            $this$iterator = $this$iterator2;
            r14 = r7;
            $i$f$forEachIndexed = bitCount$iv2;
            bitCount$iv = bitCount$iv3;
            j$iv = 0;
            r3 = r11;
            i$iv = i$iv2;
            m$iv = m$iv2;
            lastIndex$iv = lastIndex$iv2;
            slot$iv = slot$iv2;
        L36:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure(r26);
            $result = r26;
            $this$iterator2 = (SequenceScope) this.L$0;
            ScatterMap this_$iv = Entries.access$getParent$p(this.this$0);
            r7 = this.this$0;
            bitCount$iv2 = 0;
            m$iv2 = this_$iv.metadata;
            lastIndex$iv2 = m$iv2.length - 2;
            i$iv2 = 0;
            if (0 > lastIndex$iv2) goto L36;
            r11 = this;
            goto L10
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(Map.Entry<? extends K, ? extends V> r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends Map.Entry<? extends K, ? extends V>> r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] r2) {
        Intrinsics.checkNotNullParameter(r2, "array");
        return (T[]) CollectionToArray.toArray(this, r2);
    }

    public Entries(ScatterMap<K, V> r2) {
        Intrinsics.checkNotNullParameter(r2, "parent");
        this.parent = r2;
    }

    public static final /* synthetic */ ScatterMap access$getParent$p(Entries $this) {
        return $this.parent;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object element) {
        if ((element instanceof Map.Entry) == true) goto L7;
        return false;
    L7:
        return contains((Map.Entry) element);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    public int getSize() {
        return this.parent._size;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.parent.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return SequencesKt.iterator(new AnonymousClass1(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> r10) {
        Intrinsics.checkNotNullParameter(r10, "elements");
        Collection<? extends Object> r0 = r10;
        if (r0.isEmpty() == true) goto L16;
        Iterator<T> r2 = r0.iterator();
    L7:
        if (r2.hasNext() == false) goto L17;
        Map.Entry r5 = (Map.Entry) r2.next();
        if (Intrinsics.areEqual(this.parent.get((K) r5.getKey()), r5.getValue()) == true) goto L7;
        return false;
    L17:
        return true;
    L16:
        return true;
    }

    public boolean contains(Map.Entry<? extends K, ? extends V> r3) {
        Intrinsics.checkNotNullParameter(r3, "element");
        return Intrinsics.areEqual(this.parent.get(r3.getKey()), r3.getValue());
    }
}
