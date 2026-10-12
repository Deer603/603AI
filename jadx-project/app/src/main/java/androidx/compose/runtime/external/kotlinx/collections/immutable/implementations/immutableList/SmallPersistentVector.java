package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SmallPersistentVector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010*\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 (*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001(B\u0015\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\u0007J\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010J#\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0012J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u001d\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016J\u0016\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\nH\u0096\u0002¢\u0006\u0002\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001eJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\u0011\u001a\u00020\nH\u0016J\"\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020%0$H\u0016J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\nH\u0016J#\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0012R\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006)"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "buffer", "", "", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "size", "", "getSize", "()I", "add", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "element", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "index", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "addAll", "c", "", "elements", "bufferOfSize", "(I)[Ljava/lang/Object;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "listIterator", "", "removeAll", "predicate", "Lkotlin/Function1;", "", "removeAt", "set", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SmallPersistentVector<E> extends AbstractPersistentList<E> implements ImmutableList<E> {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final SmallPersistentVector EMPTY = null;
    private final Object[] buffer;

    /* JADX INFO: compiled from: SmallPersistentVector.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "", "getEMPTY", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final SmallPersistentVector getEMPTY() {
            return SmallPersistentVector.access$getEMPTY$cp();
        }
    }

    public SmallPersistentVector(Object[] buffer) {
        this.buffer = buffer;
        if (this.buffer.length > 32) goto L5;
        boolean r0 = true;
    L6:
        CommonFunctionsKt.m3921assert(r0);
        return;
    L5:
        r0 = false;
        goto L6
    }

    public static final /* synthetic */ SmallPersistentVector access$getEMPTY$cp() {
        return EMPTY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection add(Object r2) {
        return add(r2);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection addAll(Collection elements) {
        return addAll(elements);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection.Builder builder() {
        return builder();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection removeAll(Function1 predicate) {
        return removeAll(predicate);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.buffer.length;
    }

    private final Object[] bufferOfSize(int size) {
        return new Object[size];
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> add(E r6) {
        if (size() >= 32) goto L6;
        Object[] newBuffer = Arrays.copyOf(this.buffer, size() + 1);
        Intrinsics.checkNotNullExpressionValue(newBuffer, "copyOf(...)");
        newBuffer[size()] = r6;
        return new SmallPersistentVector(newBuffer);
    L6:
        Object[] tail = UtilsKt.presizedBufferWith(r6);
        return new PersistentVector(this.buffer, tail, size() + 1, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> addAll(Collection<? extends E> r6) {
        if ((size() + r6.size()) > 32) goto L10;
        Object[] newBuffer = Arrays.copyOf(this.buffer, size() + r6.size());
        Intrinsics.checkNotNullExpressionValue(newBuffer, "copyOf(...)");
        int index = size();
        Iterator<? extends E> r2 = r6.iterator();
    L6:
        if (r2.hasNext() == false) goto L9;
        Object element = r2.next();
        newBuffer[index] = element;
        index = index + 1;
        goto L6
    L9:
        return new SmallPersistentVector(newBuffer);
    L10:
        SmallPersistentVector<E> $this$mutate$iv = this;
        PersistentList.Builder<E> r3 = $this$mutate$iv.builder();
        PersistentList.Builder<E> it = r3;
        it.addAll(r6);
        return r3.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> removeAll(Function1<? super E, Boolean> r9) {
        Object[] newBuffer = this.buffer;
        int newSize = size();
        boolean anyRemoved = false;
        int index = 0;
        int r4 = size();
    L3:
        if (index >= r4) goto L12;
        Object element = this.buffer[index];
        if (r9.invoke(element).booleanValue() == false) goto L8;
        if (anyRemoved == true) goto L10;
        Object[] r6 = this.buffer;
        Object[] newBuffer2 = Arrays.copyOf(r6, r6.length);
        Intrinsics.checkNotNullExpressionValue(newBuffer2, "copyOf(...)");
        int newSize2 = index;
        anyRemoved = true;
        newSize = newSize2;
        newBuffer = newBuffer2;
    L10:
        index = index + 1;
        goto L3
    L8:
        if (anyRemoved == false) goto L10;
        newBuffer[newSize] = element;
        newSize = newSize + 1;
        goto L10
    L12:
        if (newSize == size()) goto L23;
        if (newSize != 0) goto L17;
        return EMPTY;
    L17:
        return new SmallPersistentVector(ArraysKt.copyOfRange(newBuffer, 0, newSize));
    L23:
        return this;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> addAll(int index, Collection<? extends E> r10) {
        ListImplementation.checkPositionIndex$runtime_release(index, size());
        if ((size() + r10.size()) > 32) goto L10;
        Object[] newBuffer = bufferOfSize(size() + r10.size());
        ArraysKt.copyInto$default(this.buffer, newBuffer, 0, 0, index, 6, null);
        ArraysKt.copyInto(this.buffer, newBuffer, r10.size() + index, index, size());
        int position = index;
        Iterator<? extends E> r0 = r10.iterator();
    L6:
        if (r0.hasNext() == false) goto L9;
        Object element = r0.next();
        newBuffer[position] = element;
        position = position + 1;
        goto L6
    L9:
        return new SmallPersistentVector(newBuffer);
    L10:
        SmallPersistentVector<E> $this$mutate$iv = this;
        PersistentList.Builder<E> r1 = $this$mutate$iv.builder();
        PersistentList.Builder<E> it = r1;
        it.addAll(index, r10);
        return r1.build();
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> add(int index, E r10) {
        ListImplementation.checkPositionIndex$runtime_release(index, size());
        if (index != size()) goto L7;
        return add(r10);
    L7:
        if (size() >= 32) goto L10;
        Object[] newBuffer = bufferOfSize(size() + 1);
        ArraysKt.copyInto$default(this.buffer, newBuffer, 0, 0, index, 6, null);
        ArraysKt.copyInto(this.buffer, newBuffer, index + 1, index, size());
        newBuffer[index] = r10;
        return new SmallPersistentVector(newBuffer);
    L10:
        Object[] r9 = this.buffer;
        Object[] root = Arrays.copyOf(r9, r9.length);
        Intrinsics.checkNotNullExpressionValue(root, "copyOf(...)");
        ArraysKt.copyInto(this.buffer, root, index + 1, index, size() - 1);
        root[index] = r10;
        Object[] tail = UtilsKt.presizedBufferWith(this.buffer[31]);
        return new PersistentVector(root, tail, size() + 1, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> removeAt(int index) {
        ListImplementation.checkElementIndex$runtime_release(index, size());
        if (size() == 1) goto L5;
        Object[] newBuffer = Arrays.copyOf(this.buffer, size() - 1);
        Intrinsics.checkNotNullExpressionValue(newBuffer, "copyOf(...)");
        ArraysKt.copyInto(this.buffer, newBuffer, index, index + 1, size());
        return new SmallPersistentVector(newBuffer);
    L5:
        return EMPTY;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList.Builder<E> builder() {
        return new PersistentVectorBuilder(this, null, this.buffer, 0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public int indexOf(Object element) {
        return ArraysKt.indexOf(this.buffer, element);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        return ArraysKt.lastIndexOf(this.buffer, element);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public ListIterator<E> listIterator(int index) {
        ListImplementation.checkPositionIndex$runtime_release(index, size());
        return new BufferIterator(this.buffer, index, size());
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public E get(int r2) {
        ListImplementation.checkElementIndex$runtime_release(r2, size());
        return (E) this.buffer[r2];
    }

    @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> set(int index, E r4) {
        ListImplementation.checkElementIndex$runtime_release(index, size());
        Object[] r0 = this.buffer;
        Object[] newBuffer = Arrays.copyOf(r0, r0.length);
        Intrinsics.checkNotNullExpressionValue(newBuffer, "copyOf(...)");
        newBuffer[index] = r4;
        return new SmallPersistentVector(newBuffer);
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        EMPTY = new SmallPersistentVector(new Object[0]);
    }
}
