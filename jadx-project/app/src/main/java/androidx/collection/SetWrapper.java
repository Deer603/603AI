package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
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

/* JADX INFO: compiled from: ScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016J\u0013\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, d2 = {"Landroidx/collection/SetWrapper;", "E", "", "parent", "Landroidx/collection/ScatterSet;", "(Landroidx/collection/ScatterSet;)V", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "", "equals", "other", "", "hashCode", "isEmpty", "iterator", "", "toString", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
class SetWrapper<E> implements Set<E>, KMappedMarker {
    private final ScatterSet<E> parent;

    /* JADX INFO: renamed from: androidx.collection.SetWrapper$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScatterSet.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.collection.SetWrapper$iterator$1", f = "ScatterSet.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {1153}, m = "invokeSuspend", n = {"$this$iterator", "elements$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super E>, Continuation<? super Unit>, Object> {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ SetWrapper<E> this$0;

        AnonymousClass1(SetWrapper<E> r2, Continuation<? super AnonymousClass1> r3) {
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

        public final Object invoke(SequenceScope<? super E> r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x006e -> B:13:0x0082). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b9 -> B:25:0x00c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00bf -> B:25:0x00c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00e0 -> B:31:0x00e4). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r22) {
            AnonymousClass1 r0 = this;
            Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(r0.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            Object $result = r22;
            int $i$f$forEachIndex = 0;
            int j$iv$iv = r0.I$3;
            int bitCount$iv$iv = r0.I$2;
            long slot$iv$iv = r0.J$0;
            int i$iv$iv = r0.I$1;
            int lastIndex$iv$iv = r0.I$0;
            long[] m$iv$iv = (long[]) r0.L$2;
            int r16 = 8;
            Object[] elements$iv = (Object[]) r0.L$1;
            SequenceScope $this$iterator = (SequenceScope) r0.L$0;
            ResultKt.throwOnFailure($result);
        L25:
            slot$iv$iv = slot$iv$iv >> r16;
            j$iv$iv = j$iv$iv + 1;
        L13:
            if (j$iv$iv >= bitCount$iv$iv) goto L26;
            long value$iv$iv$iv = 255 & slot$iv$iv;
            if (value$iv$iv$iv >= 128) goto L17;
            boolean r7 = true;
        L18:
            if (r7 == false) goto L25;
            int index$iv = (i$iv$iv << 3) + j$iv$iv;
            Object element = elements$iv[index$iv];
            r0.L$0 = $this$iterator;
            r0.L$1 = elements$iv;
            r0.L$2 = m$iv$iv;
            r0.I$0 = lastIndex$iv$iv;
            r0.I$1 = i$iv$iv;
            r0.J$0 = slot$iv$iv;
            r0.I$2 = bitCount$iv$iv;
            r0.I$3 = j$iv$iv;
            Object $result2 = $result;
            r0.label = 1;
            if ($this$iterator.yield(element, r0) != r1) goto L22;
            return r1;
        L22:
            $result = $result2;
            goto L25
        L17:
            r7 = false;
            goto L18
        L26:
            Object $result3 = $result;
            int r2 = r16;
            if (bitCount$iv$iv != r2) goto L37;
            AnonymousClass1 r10 = r0;
            r16 = r2;
            int $i$f$forEachIndex2 = $i$f$forEachIndex;
            int i$iv$iv2 = i$iv$iv;
            int lastIndex$iv$iv2 = lastIndex$iv$iv;
            $result = $result3;
            Object[] elements$iv2 = elements$iv;
            SequenceScope $this$iterator2 = $this$iterator;
            long[] m$iv$iv2 = m$iv$iv;
        L31:
            if (i$iv$iv2 == lastIndex$iv$iv2) goto L37;
            i$iv$iv2 = i$iv$iv2 + 1;
        L10:
            slot$iv$iv = m$iv$iv2[i$iv$iv2];
            Object r23 = r1;
            if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L30;
            int bitCount$iv$iv2 = 8 - ((~(i$iv$iv2 - lastIndex$iv$iv2)) >>> 31);
            AnonymousClass1 r13 = r10;
            bitCount$iv$iv = bitCount$iv$iv2;
            r0 = r13;
            m$iv$iv = m$iv$iv2;
            lastIndex$iv$iv = lastIndex$iv$iv2;
            i$iv$iv = i$iv$iv2;
            j$iv$iv = 0;
            $this$iterator = $this$iterator2;
            elements$iv = elements$iv2;
            $i$f$forEachIndex = $i$f$forEachIndex2;
            r1 = r23;
            goto L13
        L30:
            r1 = r23;
        L37:
            return Unit.INSTANCE;
        L7:
            r16 = 8;
            ResultKt.throwOnFailure(r22);
            $result = r22;
            $this$iterator2 = (SequenceScope) r0.L$0;
            ScatterSet this_$iv = SetWrapper.access$getParent$p(r0.this$0);
            elements$iv2 = this_$iv.elements;
            $i$f$forEachIndex2 = 0;
            m$iv$iv2 = this_$iv.metadata;
            lastIndex$iv$iv2 = m$iv$iv2.length - 2;
            i$iv$iv2 = 0;
            if (0 > lastIndex$iv$iv2) goto L37;
            r10 = r0;
            goto L10
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E r3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> r3) {
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

    public SetWrapper(ScatterSet<E> r2) {
        Intrinsics.checkNotNullParameter(r2, "parent");
        this.parent = r2;
    }

    public static final /* synthetic */ ScatterSet access$getParent$p(SetWrapper $this) {
        return $this.parent;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    public int getSize() {
        return this.parent._size;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> r8) {
        Intrinsics.checkNotNullParameter(r8, "elements");
        Iterator<T> r2 = r8.iterator();
    L4:
        if (r2.hasNext() == false) goto L10;
        Object r3 = r2.next();
        if (this.parent.contains((E) r3) == true) goto L4;
        return false;
    L10:
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object element) {
        return this.parent.contains(element);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.parent.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return SequencesKt.iterator(new AnonymousClass1(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object other) {
        if (this != other) goto L5;
        return true;
    L5:
        if (other != null) goto L7;
        return false;
    L7:
        if (getClass() != other.getClass()) goto L13;
        SetWrapper r0 = (SetWrapper) other;
        return Intrinsics.areEqual(this.parent, ((SetWrapper) other).parent);
    L13:
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.parent.hashCode();
    }

    public String toString() {
        return this.parent.toString();
    }
}
