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
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableSet;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00040\u0003B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\"\u0010\u000f\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001d\u0010\u0014\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J\"\u0010\u0015\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0011H\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016J\u001b\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0018H\u0096\u0002J\u001c\u0010\u0019\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\"\u0010\u001a\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0011H\u0016J\"\u0010\u001b\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0011H\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Landroidx/collection/MutableEntries;", "K", "V", "", "", "parent", "Landroidx/collection/MutableScatterMap;", "(Landroidx/collection/MutableScatterMap;)V", "size", "", "getSize", "()I", "add", "", "element", "addAll", "elements", "", "clear", "", "contains", "containsAll", "isEmpty", "iterator", "", "remove", "removeAll", "retainAll", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class MutableEntries<K, V> implements Set<Map.Entry<K, V>>, KMutableSet {
    private final MutableScatterMap<K, V> parent;

    /* JADX INFO: renamed from: androidx.collection.MutableEntries$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScatterMap.kt */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0010)\n\u0002\u0010'\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u0096\u0002J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR,\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"androidx/collection/MutableEntries$iterator$1", "", "", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "iterator", "", "getIterator", "()Ljava/util/Iterator;", "setIterator", "(Ljava/util/Iterator;)V", "hasNext", "", "next", "remove", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 implements Iterator<Map.Entry<K, V>>, KMutableIterator {
        private int current;
        private Iterator<? extends Map.Entry<K, V>> iterator;
        final /* synthetic */ MutableEntries<K, V> this$0;

        /* JADX INFO: renamed from: androidx.collection.MutableEntries$iterator$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: ScatterMap.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.collection.MutableEntries$iterator$1$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1538}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
        static final class C00001 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Map.Entry<K, V>>, Continuation<? super Unit>, Object> {
            int I$0;
            int I$1;
            int I$2;
            int I$3;
            long J$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            final /* synthetic */ MutableEntries<K, V> this$0;
            final /* synthetic */ AnonymousClass1 this$1;

            C00001(MutableEntries<K, V> r2, AnonymousClass1 r3, Continuation<? super C00001> r4) {
                this.this$0 = r2;
                this.this$1 = r3;
                super(2, r4);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
                C00001 r0 = new C00001(this.this$0, this.this$1, r5);
                r0.L$0 = r4;
                return r0;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
                return invoke((SequenceScope) r2, r3);
            }

            public final Object invoke(SequenceScope<? super Map.Entry<K, V>> r3, Continuation<? super Unit> r4) {
                return ((C00001) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0072 -> B:13:0x0088). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00da -> B:25:0x00e5). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00e1 -> B:25:0x00e5). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0102 -> B:30:0x0108). Please report as a decompilation issue!!! */
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
                long[] m$iv = (long[]) this.L$3;
                MutableEntries<K, V> r14 = (MutableEntries) this.L$2;
                AnonymousClass1 r15 = (AnonymousClass1) this.L$1;
                int r16 = 8;
                SequenceScope $this$iterator = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure($result);
                C00001 r4 = this;
            L25:
                slot$iv = slot$iv >> r16;
                j$iv = j$iv + 1;
            L13:
                if (j$iv >= bitCount$iv) goto L26;
                long value$iv$iv = slot$iv & 255;
                if (value$iv$iv >= 128) goto L17;
                boolean r17 = true;
            L18:
                if (r17 == false) goto L25;
                int index = (i$iv << 3) + j$iv;
                r15.setCurrent(index);
                Object[] r0 = MutableEntries.access$getParent$p(r14).keys;
                Object $result2 = $result;
                Object[] r2 = MutableEntries.access$getParent$p(r14).values;
                int $i$f$forEachIndexed2 = $i$f$forEachIndexed;
                int $i$f$forEachIndexed3 = r15.getCurrent();
                MutableMapEntry r6 = new MutableMapEntry(r0, r2, $i$f$forEachIndexed3);
                r4.L$0 = $this$iterator;
                r4.L$1 = r15;
                r4.L$2 = r14;
                r4.L$3 = m$iv;
                r4.I$0 = lastIndex$iv;
                r4.I$1 = i$iv;
                r4.J$0 = slot$iv;
                r4.I$2 = bitCount$iv;
                r4.I$3 = j$iv;
                r4.label = 1;
                if ($this$iterator.yield(r6, r4) != r1) goto L22;
                return r1;
            L22:
                $result = $result2;
                $i$f$forEachIndexed = $i$f$forEachIndexed2;
                goto L25
            L17:
                r17 = false;
                goto L18
            L26:
                int $i$f$forEachIndexed4 = $i$f$forEachIndexed;
                int r3 = r16;
                if (bitCount$iv != r3) goto L36;
                int i$iv2 = i$iv;
                int lastIndex$iv2 = lastIndex$iv;
                long[] m$iv2 = m$iv;
                MutableEntries<K, V> r7 = r14;
                AnonymousClass1 r8 = r15;
                int bitCount$iv2 = $i$f$forEachIndexed4;
                C00001 r11 = r4;
            L30:
                if (i$iv2 == lastIndex$iv2) goto L36;
                i$iv2 = i$iv2 + 1;
                r16 = r3;
            L10:
                long slot$iv2 = m$iv2[i$iv2];
                long[] m$iv3 = m$iv2;
                if (((((~slot$iv2) << 7) & slot$iv2) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L29;
                int bitCount$iv3 = 8 - ((~(i$iv2 - lastIndex$iv2)) >>> 31);
                r15 = r8;
                r14 = r7;
                j$iv = 0;
                $i$f$forEachIndexed = bitCount$iv2;
                bitCount$iv = bitCount$iv3;
                r4 = r11;
                i$iv = i$iv2;
                m$iv = m$iv3;
                lastIndex$iv = lastIndex$iv2;
                slot$iv = slot$iv2;
                goto L13
            L29:
                r3 = r16;
                m$iv2 = m$iv3;
            L36:
                return Unit.INSTANCE;
            L7:
                r16 = 8;
                ResultKt.throwOnFailure(r26);
                $result = r26;
                $this$iterator = (SequenceScope) this.L$0;
                ScatterMap this_$iv = MutableEntries.access$getParent$p(this.this$0);
                r8 = this.this$1;
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

        AnonymousClass1(MutableEntries<K, V> r3) {
            this.this$0 = r3;
            this.current = -1;
            this.iterator = SequencesKt.iterator(new C00001(r3, this, null));
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return next();
        }

        public final Iterator<Map.Entry<K, V>> getIterator() {
            return this.iterator;
        }

        public final void setIterator(Iterator<? extends Map.Entry<K, V>> r2) {
            Intrinsics.checkNotNullParameter(r2, "<set-?>");
            this.iterator = r2;
        }

        public final int getCurrent() {
            return this.current;
        }

        public final void setCurrent(int r1) {
            this.current = r1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            return this.iterator.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.current == (-1)) goto L6;
            MutableEntries.access$getParent$p(this.this$0).removeValueAt(this.current);
            this.current = -1;
            return;
        }
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

    public MutableEntries(MutableScatterMap<K, V> r2) {
        Intrinsics.checkNotNullParameter(r2, "parent");
        this.parent = r2;
    }

    public static final /* synthetic */ MutableScatterMap access$getParent$p(MutableEntries $this) {
        return $this.parent;
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object element) {
        return add((Map.Entry) element);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object element) {
        if (TypeIntrinsics.isMutableMapEntry(element) == true) goto L7;
        return false;
    L7:
        return contains((Map.Entry) element);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object element) {
        if (TypeIntrinsics.isMutableMapEntry(element) == true) goto L7;
        return false;
    L7:
        return remove((Map.Entry) element);
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
        return new AnonymousClass1(this);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.parent.clear();
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

    public boolean contains(Map.Entry<K, V> r3) {
        Intrinsics.checkNotNullParameter(r3, "element");
        return Intrinsics.areEqual(this.parent.get(r3.getKey()), r3.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends Map.Entry<K, V>> r2) {
        Intrinsics.checkNotNullParameter(r2, "elements");
        throw new UnsupportedOperationException();
    }

    public boolean add(Map.Entry<K, V> r2) {
        Intrinsics.checkNotNullParameter(r2, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> r22) {
        Intrinsics.checkNotNullParameter(r22, "elements");
        boolean changed = false;
        ScatterMap this_$iv = this.parent;
        long[] m$iv = this_$iv.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 > lastIndex$iv) goto L47;
    L4:
        long slot$iv = m$iv[i$iv];
        long $this$maskEmptyOrDeleted$iv$iv = (((~slot$iv) << 7) & slot$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv == (-9187201950435737472L)) goto L33;
        int r11 = 8;
        int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
        int j$iv = 0;
    L7:
        if (j$iv >= bitCount$iv) goto L29;
        long value$iv$iv = 255 & slot$iv;
        if (value$iv$iv >= 128) goto L11;
        boolean r16 = true;
    L12:
        if (r16 == false) goto L27;
        int index$iv = (i$iv << 3) + j$iv;
        boolean found = false;
        Iterator<? extends Object> r17 = r22.iterator();
    L15:
        if (r17.hasNext() == false) goto L22;
        Map.Entry entry = (Map.Entry) r17.next();
        int r19 = r11;
        boolean changed2 = changed;
        if (Intrinsics.areEqual(entry.getKey(), this.parent.keys[index$iv]) == false) goto L21;
        if (Intrinsics.areEqual(entry.getValue(), this.parent.values[index$iv]) == false) goto L21;
        found = true;
    L23:
        if (found == true) goto L25;
        this.parent.removeValueAt(index$iv);
        changed = true;
    L28:
        slot$iv = slot$iv >> r19;
        j$iv = j$iv + 1;
        r11 = r19;
        goto L7
    L25:
        changed = changed2;
    L21:
        r11 = r19;
        changed = changed2;
        goto L15
    L22:
        changed2 = changed;
        r19 = r11;
        goto L23
    L27:
        r19 = r11;
        goto L28
    L11:
        r16 = false;
        goto L12
    L29:
        boolean changed3 = changed;
        if (bitCount$iv != r11) goto L36;
        changed = changed3;
        goto L33
    L36:
        return changed3;
    L33:
        if (i$iv == lastIndex$iv) goto L48;
        i$iv = i$iv + 1;
        goto L4
    L48:
        return changed;
    L47:
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> r21) {
        Intrinsics.checkNotNullParameter(r21, "elements");
        boolean changed = false;
        ScatterMap this_$iv = this.parent;
        long[] m$iv = this_$iv.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 > lastIndex$iv) goto L44;
    L4:
        long slot$iv = m$iv[i$iv];
        long $this$maskEmptyOrDeleted$iv$iv = (((~slot$iv) << 7) & slot$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv == (-9187201950435737472L)) goto L30;
        int r11 = 8;
        int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
        int j$iv = 0;
    L7:
        if (j$iv >= bitCount$iv) goto L26;
        long value$iv$iv = 255 & slot$iv;
        if (value$iv$iv >= 128) goto L11;
        boolean r16 = true;
    L12:
        if (r16 == false) goto L24;
        int index$iv = (i$iv << 3) + j$iv;
        Iterator<? extends Object> r17 = r21.iterator();
    L15:
        if (r17.hasNext() == false) goto L22;
        Map.Entry entry = (Map.Entry) r17.next();
        int r18 = r11;
        boolean changed2 = changed;
        if (Intrinsics.areEqual(entry.getKey(), this.parent.keys[index$iv]) == false) goto L21;
        if (Intrinsics.areEqual(entry.getValue(), this.parent.values[index$iv]) == false) goto L21;
        this.parent.removeValueAt(index$iv);
        changed = true;
    L25:
        slot$iv = slot$iv >> r18;
        j$iv = j$iv + 1;
        r11 = r18;
    L21:
        r11 = r18;
        changed = changed2;
        goto L15
    L22:
        r18 = r11;
        goto L25
    L24:
        r18 = r11;
        goto L25
    L11:
        r16 = false;
        goto L12
    L26:
        boolean changed3 = changed;
        if (bitCount$iv != r11) goto L33;
        changed = changed3;
        goto L30
    L33:
        return changed3;
    L30:
        if (i$iv == lastIndex$iv) goto L45;
        i$iv = i$iv + 1;
        goto L4
    L45:
        return changed;
    L44:
        return false;
    }

    public boolean remove(Map.Entry<K, V> r27) {
        Intrinsics.checkNotNullParameter(r27, "element");
        ScatterMap this_$iv = this.parent;
        Object key$iv = r27.getKey();
        int $i$f$findKeyIndex$collection = 0;
        if (key$iv == null) goto L5;
        int r7 = key$iv.hashCode();
    L6:
        int hash$iv$iv = r7 * ScatterMapKt.MurmurHashC1;
        int hash$iv = hash$iv$iv ^ (hash$iv$iv << 16);
        int hash2$iv = hash$iv & WorkQueueKt.MASK;
        int probeMask$iv = this_$iv._capacity;
        int $i$f$h1 = hash$iv >>> 7;
        int probeOffset$iv = $i$f$h1 & probeMask$iv;
        int probeIndex$iv = 0;
    L7:
        long[] metadata$iv$iv = this_$iv.metadata;
        int i$iv$iv = probeOffset$iv >> 3;
        int b$iv$iv = (probeOffset$iv & 7) << 3;
        int hash2$iv2 = hash2$iv;
        long g$iv = ((metadata$iv$iv[i$iv$iv + 1] << (64 - b$iv$iv)) & ((-b$iv$iv) >> 63)) | (metadata$iv$iv[i$iv$iv] >>> b$iv$iv);
        int $i$f$findKeyIndex$collection2 = $i$f$findKeyIndex$collection;
        int hash$iv2 = hash$iv;
        long x$iv$iv = (((long) hash2$iv2) * ScatterMapKt.BitmaskLsb) ^ g$iv;
        long m$iv = ((x$iv$iv - ScatterMapKt.BitmaskLsb) & (~x$iv$iv)) & (-9187201950435737472L);
    L8:
        long $this$hasNext$iv$iv = m$iv;
        if ($this$hasNext$iv$iv == 0) goto L11;
        boolean r6 = true;
    L12:
        if (r6 == false) goto L17;
        long $this$get$iv$iv = m$iv;
        int index$iv = ((Long.numberOfTrailingZeros($this$get$iv$iv) >> 3) + probeOffset$iv) & probeMask$iv;
        if (Intrinsics.areEqual(this_$iv.keys[index$iv], key$iv) == true) goto L21;
        long $this$next$iv$iv = m$iv;
        m$iv = $this$next$iv$iv & ($this$next$iv$iv - 1);
    L21:
        if (index$iv >= 0) goto L23;
    L26:
        return false;
    L23:
        if (Intrinsics.areEqual(this.parent.values[index$iv], r27.getValue()) == false) goto L26;
        this.parent.removeValueAt(index$iv);
        return true;
    L17:
        long $this$maskEmpty$iv$iv = (((~g$iv) << 6) & g$iv) & (-9187201950435737472L);
        if ($this$maskEmpty$iv$iv != 0) goto L19;
        probeIndex$iv = probeIndex$iv + 8;
        probeOffset$iv = (probeOffset$iv + probeIndex$iv) & probeMask$iv;
        hash2$iv = hash2$iv2;
        $i$f$findKeyIndex$collection = $i$f$findKeyIndex$collection2;
        hash$iv = hash$iv2;
        goto L7
    L19:
        index$iv = -1;
        goto L21
    L11:
        r6 = false;
        goto L12
    L5:
        r7 = 0;
        goto L6
    }
}
