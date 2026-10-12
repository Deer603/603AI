package kotlinx.coroutines.debug.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractMutableMap;
import kotlin.collections.AbstractMutableSet;
import kotlin.concurrent.internal.AtomicIntrinsicsKt$$ExternalSyntheticBackportWithForwarding0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: ConcurrentWeakMap.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004:\u0003()*B\u000f\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0014\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\u0018\u0010\u001f\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010!J\u001f\u0010\"\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010$J!\u0010%\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u00002\b\u0010#\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0002\u0010$J\u0017\u0010&\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\u0006\u0010'\u001a\u00020\u001aR\t\u0010\b\u001a\u00020\tX\u0082\u0004R\u001f\u0010\n\u001a\u0018\u0012\u0014\u0012\u00120\fR\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\u000bX\u0082\u0004R&\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "K", "", "V", "Lkotlin/collections/AbstractMutableMap;", "weakRefQueue", "", "(Z)V", "_size", "Lkotlinx/atomicfu/AtomicInt;", "core", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "size", "", "getSize", "()I", "Ljava/lang/ref/ReferenceQueue;", "cleanWeakRef", "", "w", "Lkotlinx/coroutines/debug/internal/HashedWeakRef;", "clear", "decrementSize", "get", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putSynchronized", "remove", "runWeakRefQueueCleaningLoopUntilInterrupted", "Core", "Entry", "KeyValueSet", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ConcurrentWeakMap<K, V> extends AbstractMutableMap<K, V> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _size$volatile$FU = null;
    private static final /* synthetic */ AtomicReferenceFieldUpdater core$volatile$FU = null;
    private volatile /* synthetic */ int _size$volatile;
    private volatile /* synthetic */ Object core$volatile;
    private final ReferenceQueue<K> weakRefQueue;

    /* JADX INFO: compiled from: ConcurrentWeakMap.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0001!B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0007J\u0015\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J,\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0016\"\u0004\b\u0002\u0010\u00172\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H\u00170\u0019J1\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00028\u00002\b\u0010\u001b\u001a\u0004\u0018\u00018\u00012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00120\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fJ\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00070\u0006X\u0082\u0004R\t\u0010\b\u001a\u00020\tX\u0082\u0004R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006X\u0082\u0004¨\u0006\""}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;", "", "allocated", "", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;I)V", "keys", "Lkotlinx/atomicfu/AtomicArray;", "Lkotlinx/coroutines/debug/internal/HashedWeakRef;", "load", "Lkotlinx/atomicfu/AtomicInt;", "shift", "threshold", "values", "cleanWeakRef", "", "weakRef", "getImpl", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "index", "hash", "keyValueIterator", "", "E", "factory", "Lkotlin/Function2;", "putImpl", "value", "weakKey0", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlinx/coroutines/debug/internal/HashedWeakRef;)Ljava/lang/Object;", "rehash", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "removeCleanedAt", "KeyValueIterator", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class Core {
        private static final /* synthetic */ AtomicIntegerFieldUpdater load$volatile$FU = null;
        private final int allocated;
        private final /* synthetic */ AtomicReferenceArray keys;
        private volatile /* synthetic */ int load$volatile;
        private final int shift;
        final /* synthetic */ ConcurrentWeakMap<K, V> this$0;
        private final int threshold;
        private final /* synthetic */ AtomicReferenceArray values;

        /* JADX INFO: compiled from: ConcurrentWeakMap.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0002J\t\u0010\r\u001a\u00020\u000eH\u0096\u0002J\u000e\u0010\u000f\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u00028\u0001X\u0082.¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core$KeyValueIterator;", "E", "", "factory", "Lkotlin/Function2;", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;Lkotlin/jvm/functions/Function2;)V", "index", "", "key", "Ljava/lang/Object;", "value", "findNext", "", "hasNext", "", "next", "()Ljava/lang/Object;", "remove", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private final class KeyValueIterator<E> implements Iterator<E>, KMutableIterator {
            private final Function2<K, V, E> factory;
            private int index;
            private K key;
            final /* synthetic */ ConcurrentWeakMap<K, V>.Core this$0;
            private V value;

            /* JADX WARN: Multi-variable type inference failed */
            public KeyValueIterator(Core this$0, Function2<? super K, ? super V, ? extends E> r3) {
                this.this$0 = this$0;
                this.factory = r3;
                this.index = -1;
                findNext();
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ void remove() {
                remove();
            }

            private final void findNext() {
            L2:
                this.index++;
                if (this.index >= Core.access$getAllocated$p(this.this$0)) goto L15;
                HashedWeakRef r0 = (HashedWeakRef) Core.access$getKeys(this.this$0).get(this.index);
                if (r0 == null) goto L2;
                K r1 = (K) r0.get();
                if (r1 == null) goto L2;
                this.key = r1;
                Object r2 = (V) Core.access$getValues(this.this$0).get(this.index);
                if ((r2 instanceof Marked) == false) goto L12;
                r2 = (V) ((Marked) r2).ref;
            L12:
                if (r2 == null) goto L2;
                this.value = (V) r2;
                return;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.index >= Core.access$getAllocated$p(this.this$0)) goto L5;
                return true;
            L5:
                return false;
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
            @Override // java.util.Iterator
            public E next() {
                if (this.index >= Core.access$getAllocated$p(this.this$0)) goto L13;
                Function2<K, V, E> r0 = this.factory;
                K r1 = this.key;
                if (r1 == true) goto L7;
                Intrinsics.throwUninitializedPropertyAccessException("key");
                r1 = (K) Unit.INSTANCE;
            L7:
                V r2 = this.value;
                if (r2 == true) goto L10;
                Intrinsics.throwUninitializedPropertyAccessException("value");
                r2 = (V) Unit.INSTANCE;
            L10:
                E r3 = (E) r0.invoke(r1, r2);
                findNext();
                return r3;
            L13:
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public Void remove() {
                ConcurrentWeakMapKt.access$noImpl();
                throw new KotlinNothingValueException();
            }
        }

        static {
            load$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(Core.class, "load$volatile");
        }

        private final /* synthetic */ AtomicReferenceArray getKeys() {
            return this.keys;
        }

        private final /* synthetic */ int getLoad$volatile() {
            return this.load$volatile;
        }

        private static final /* synthetic */ AtomicIntegerFieldUpdater getLoad$volatile$FU() {
            return load$volatile$FU;
        }

        private final /* synthetic */ AtomicReferenceArray getValues() {
            return this.values;
        }

        private final /* synthetic */ void setLoad$volatile(int r1) {
            this.load$volatile = r1;
        }

        private final /* synthetic */ void update$atomicfu(Object r3, AtomicIntegerFieldUpdater r4, Function1<? super Integer, Integer> r5) {
        L2:
            int r0 = r4.get(r3);
            if (r4.compareAndSet(r3, r0, r5.invoke(Integer.valueOf(r0)).intValue()) == false) goto L2;
        }

        public static final /* synthetic */ int access$getAllocated$p(Core $this) {
            return $this.allocated;
        }

        public static final /* synthetic */ AtomicReferenceArray access$getKeys(Core $this) {
            return $this.getKeys();
        }

        public static final /* synthetic */ AtomicReferenceArray access$getValues(Core $this) {
            return $this.getValues();
        }

        public Core(ConcurrentWeakMap this$0, int allocated) {
            this.this$0 = this$0;
            this.allocated = allocated;
            this.shift = Integer.numberOfLeadingZeros(this.allocated) + 1;
            this.threshold = (this.allocated * 2) / 3;
            this.keys = new AtomicReferenceArray(this.allocated);
            this.values = new AtomicReferenceArray(this.allocated);
        }

        private final int index(int hash) {
            return ((-1640531527) * hash) >>> this.shift;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final V getImpl(K r6) {
            int r0 = index(r6.hashCode());
        L3:
            HashedWeakRef r1 = (HashedWeakRef) getKeys().get(r0);
            if (r1 == null) goto L5;
            Object r2 = r1.get();
            if (Intrinsics.areEqual(r6, r2) == true) goto L9;
            if (r2 != null) goto L16;
            removeCleanedAt(r0);
        L16:
            if (r0 != 0) goto L18;
            r0 = this.allocated;
        L18:
            r0 = r0 - 1;
            goto L3
        L9:
            V r3 = (V) getValues().get(r0);
            if ((r3 instanceof Marked) == false) goto L13;
            return (V) ((Marked) r3).ref;
        L13:
            return r3;
        L5:
            return null;
        }

        private final void removeCleanedAt(int index) {
        L2:
            Object oldValue = getValues().get(index);
            if (oldValue == null) goto L4;
            if ((oldValue instanceof Marked) == true) goto L7;
            if (AtomicIntrinsicsKt$$ExternalSyntheticBackportWithForwarding0.m(getValues(), index, oldValue, null) == false) goto L2;
            ConcurrentWeakMap.access$decrementSize(this.this$0);
            return;
        L7:
            return;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object putImpl$default(Core r0, Object r1, Object r2, HashedWeakRef r3, int r4, Object r5) {
            if ((r4 & 4) == 0) goto L6;
            r3 = null;
        L6:
            return r0.putImpl(r1, r2, r3);
        }

        public final Object putImpl(K r12, V r13, HashedWeakRef<K> r14) {
            int index = index(r12.hashCode());
            boolean loadIncremented = false;
            HashedWeakRef<K> r2 = r14;
        L3:
            HashedWeakRef w = (HashedWeakRef) getKeys().get(index);
            if (w == null) goto L6;
            Object k = w.get();
            if (Intrinsics.areEqual(r12, k) == true) goto L25;
            if (k != null) goto L38;
            removeCleanedAt(index);
        L38:
            if (index != 0) goto L40;
            index = this.allocated;
        L40:
            index = index - 1;
            goto L3
        L25:
            if (loadIncremented == false) goto L29;
            getLoad$volatile$FU().decrementAndGet(this);
        L29:
            Object oldValue = getValues().get(index);
            if ((oldValue instanceof Marked) == true) goto L32;
            if (AtomicIntrinsicsKt$$ExternalSyntheticBackportWithForwarding0.m(getValues(), index, oldValue, r13) == false) goto L29;
            return oldValue;
        L32:
            return ConcurrentWeakMapKt.access$getREHASH$p();
        L6:
            if (r13 == null) goto L7;
            if (loadIncremented == true) goto L17;
            AtomicIntegerFieldUpdater handler$atomicfu$iv = getLoad$volatile$FU();
        L10:
            int n = handler$atomicfu$iv.get(this);
            if (n >= this.threshold) goto L13;
            if (handler$atomicfu$iv.compareAndSet(this, n, n + 1) == false) goto L10;
            loadIncremented = true;
            goto L17
        L13:
            return ConcurrentWeakMapKt.access$getREHASH$p();
        L17:
            if (r2 != null) goto L20;
            r2 = new HashedWeakRef(r12, ConcurrentWeakMap.access$getWeakRefQueue$p(this.this$0));
        L20:
            if (AtomicIntrinsicsKt$$ExternalSyntheticBackportWithForwarding0.m(getKeys(), index, null, r2) == true) goto L29;
        L7:
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ConcurrentWeakMap<K, V>.Core rehash() {
        L2:
            int r0 = Integer.highestOneBit(RangesKt.coerceAtLeast(this.this$0.size(), 4)) * 4;
            ConcurrentWeakMap<K, V>.Core r1 = (ConcurrentWeakMap<K, V>.Core) new Core(this.this$0, r0);
            int r2 = 0;
            int r3 = this.allocated;
        L3:
            if (r2 >= r3) goto L29;
            HashedWeakRef r4 = (HashedWeakRef) getKeys().get(r2);
            if (r4 == null) goto L7;
            Object r5 = r4.get();
        L8:
            if (r4 == null) goto L12;
            if (r5 != null) goto L12;
            removeCleanedAt(r2);
        L12:
            Object r6 = getValues().get(r2);
            if ((r6 instanceof Marked) == true) goto L14;
            if (AtomicIntrinsicsKt$$ExternalSyntheticBackportWithForwarding0.m(getValues(), r2, r6, ConcurrentWeakMapKt.access$mark(r6)) == false) goto L12;
        L17:
            if (r5 == null) goto L28;
            if (r6 == null) goto L28;
            Object r7 = r1.putImpl(r5, r6, r4);
            if (r7 == ConcurrentWeakMapKt.access$getREHASH$p()) goto L2;
            if (r7 != null) goto L23;
            boolean r8 = true;
        L24:
            if (r8 == true) goto L28;
            throw new AssertionError("Assertion failed");
        L23:
            r8 = false;
        L28:
            r2 = r2 + 1;
            goto L3
        L14:
            r6 = ((Marked) r6).ref;
            goto L17
        L7:
            r5 = null;
            goto L8
        L29:
            return r1;
        }

        public final void cleanWeakRef(HashedWeakRef<?> r3) {
            int index = index(r3.hash);
        L3:
            HashedWeakRef<?> r1 = (HashedWeakRef) getKeys().get(index);
            if (r1 == null) goto L5;
            if (r1 == r3) goto L7;
            if (index != 0) goto L11;
            index = this.allocated;
        L11:
            index = index - 1;
            goto L3
        L7:
            removeCleanedAt(index);
            return;
        }

        public final <E> Iterator<E> keyValueIterator(Function2<? super K, ? super V, ? extends E> r2) {
            return new KeyValueIterator(this, r2);
        }
    }

    /* JADX INFO: compiled from: ConcurrentWeakMap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u0012\u0006\u0010\u0005\u001a\u00028\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\u000b\u001a\u00028\u00032\u0006\u0010\f\u001a\u00028\u0003H\u0016¢\u0006\u0002\u0010\rR\u0016\u0010\u0004\u001a\u00028\u0002X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00028\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Entry;", "K", "V", "", "key", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getKey", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getValue", "setValue", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Entry<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {
        private final K key;
        private final V value;

        public Entry(K r1, V r2) {
            this.key = r1;
            this.value = r2;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public V setValue(V r2) {
            ConcurrentWeakMapKt.access$noImpl();
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: ConcurrentWeakMap.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010)\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\rJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u000fH\u0096\u0002R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$KeyValueSet;", "E", "Lkotlin/collections/AbstractMutableSet;", "factory", "Lkotlin/Function2;", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;Lkotlin/jvm/functions/Function2;)V", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "iterator", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class KeyValueSet<E> extends AbstractMutableSet<E> {
        private final Function2<K, V, E> factory;
        final /* synthetic */ ConcurrentWeakMap<K, V> this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public KeyValueSet(ConcurrentWeakMap this$0, Function2<? super K, ? super V, ? extends E> r2) {
            this.this$0 = this$0;
            this.factory = r2;
        }

        @Override // kotlin.collections.AbstractMutableSet
        public int getSize() {
            return this.this$0.size();
        }

        @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E r2) {
            ConcurrentWeakMapKt.access$noImpl();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return ((Core) ConcurrentWeakMap.access$getCore$volatile$FU().get(this.this$0)).keyValueIterator(this.factory);
        }
    }

    static {
        _size$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(ConcurrentWeakMap.class, "_size$volatile");
        core$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(ConcurrentWeakMap.class, Object.class, "core$volatile");
    }

    public ConcurrentWeakMap() {
        boolean r2 = false;
        this(r2, 1, null);
    }

    private final /* synthetic */ Object getCore$volatile() {
        return this.core$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater getCore$volatile$FU() {
        return core$volatile$FU;
    }

    private final /* synthetic */ int get_size$volatile() {
        return this._size$volatile;
    }

    private static final /* synthetic */ AtomicIntegerFieldUpdater get_size$volatile$FU() {
        return _size$volatile$FU;
    }

    private final /* synthetic */ void setCore$volatile(Object r1) {
        this.core$volatile = r1;
    }

    private final /* synthetic */ void set_size$volatile(int r1) {
        this._size$volatile = r1;
    }

    public static final /* synthetic */ void access$decrementSize(ConcurrentWeakMap $this) {
        $this.decrementSize();
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater access$getCore$volatile$FU() {
        return getCore$volatile$FU();
    }

    public static final /* synthetic */ ReferenceQueue access$getWeakRefQueue$p(ConcurrentWeakMap $this) {
        return $this.weakRefQueue;
    }

    public /* synthetic */ ConcurrentWeakMap(boolean r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = false;
    L5:
        this(r1);
    }

    public ConcurrentWeakMap(boolean weakRefQueue) {
        this.core$volatile = new Core(this, 16);
        if (weakRefQueue == false) goto L5;
        ReferenceQueue<K> r0 = new ReferenceQueue();
    L6:
        this.weakRefQueue = r0;
        return;
    L5:
        r0 = null;
        goto L6
    }

    @Override // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return get_size$volatile$FU().get(this);
    }

    private final void decrementSize() {
        get_size$volatile$FU().decrementAndGet(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object r2) {
        if (r2 != null) goto L6;
        return null;
    L6:
        return (V) ((Core) getCore$volatile$FU().get(this)).getImpl(r2);
    }

    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    public V put(K r8, V r9) {
        V r10 = (V) Core.putImpl$default((Core) getCore$volatile$FU().get(this), r8, r9, null, 4, null);
        if (r10 != ConcurrentWeakMapKt.access$getREHASH$p()) goto L5;
        r10 = putSynchronized(r8, r9);
    L5:
        if (r10 != null) goto L7;
        get_size$volatile$FU().incrementAndGet(this);
    L7:
        return r10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object r9) {
        if (r9 != 0) goto L5;
        return null;
    L5:
        V r10 = (V) Core.putImpl$default((Core) getCore$volatile$FU().get(this), r9, null, null, 4, null);
        if (r10 != ConcurrentWeakMapKt.access$getREHASH$p()) goto L8;
        r10 = putSynchronized(r9, null);
    L8:
        if (r10 == null) goto L10;
        get_size$volatile$FU().decrementAndGet(this);
    L10:
        return r10;
    }

    private final synchronized V putSynchronized(K r8, V r9) {
        monitor-enter(this);
        Core r1 = (Core) getCore$volatile$FU().get(this);     // Catch: Throwable -> L9
    L4:
        K r2 = r8;
        V r3 = r9;
        V r10 = (V) Core.putImpl$default(r1, r2, r3, null, 4, null);
        if (r10 != ConcurrentWeakMapKt.access$getREHASH$p()) goto L6;
        r1 = r1.rehash();     // Catch: Throwable -> L9
        getCore$volatile$FU().set(this, r1);     // Catch: Throwable -> L9
        r8 = r2;
        r9 = r3;
        goto L4
    L6:
        monitor-exit(this);
        return r10;
    L9:
        th = move-exception;
        throw th;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Set<K> getKeys() {
        return new KeyValueSet(this, ConcurrentWeakMap$keys$1.INSTANCE);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Set<Map.Entry<K, V>> getEntries() {
        return new KeyValueSet(this, ConcurrentWeakMap$entries$1.INSTANCE);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Iterator<K> r0 = keySet().iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        Object k = r0.next();
        remove(k);
        goto L4
    }

    public final void runWeakRefQueueCleaningLoopUntilInterrupted() {
        if (this.weakRefQueue == null) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L14;
    L15:
        Reference<? extends K> r1 = this.weakRefQueue.remove();     // Catch: InterruptedException -> L10
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");     // Catch: InterruptedException -> L10
        cleanWeakRef((HashedWeakRef) r1);     // Catch: InterruptedException -> L10
    L11:
        Thread.currentThread().interrupt();
        return;
    L14:
        throw new IllegalStateException("Must be created with weakRefQueue = true".toString());
    L5:
        r0 = false;
        goto L6
    }

    private final void cleanWeakRef(HashedWeakRef<?> r2) {
        ((Core) getCore$volatile$FU().get(this)).cleanWeakRef(r2);
    }
}
