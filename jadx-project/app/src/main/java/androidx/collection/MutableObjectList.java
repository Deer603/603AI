package androidx.collection;

import androidx.autofill.HintConstants;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: ObjectList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0003;<=B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u000eJ\u001d\u0010\u000b\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014J\u0019\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0002\u0010\u0016J\u001e\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J#\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0002\u0010\u0017J\u001e\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018J\u0014\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019J\u0014\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aJ\u0014\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bJ\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eJ\u0006\u0010\u001f\u001a\u00020\u000fJ\u0011\u0010 \u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0004H\u0086\bJ\u0016\u0010!\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00028\u0000H\u0086\n¢\u0006\u0002\u0010\"J\u0017\u0010!\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002J\u0017\u0010!\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\u0002J\u001c\u0010!\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0086\u0002¢\u0006\u0002\u0010#J\u0017\u0010!\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\u0002J\u0017\u0010!\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0086\u0002J\u0017\u0010!\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0086\u0002J\u0016\u0010$\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00028\u0000H\u0086\n¢\u0006\u0002\u0010\"J\u0017\u0010$\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002J\u0017\u0010$\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\u0002J\u001c\u0010$\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0086\u0002¢\u0006\u0002\u0010#J\u0017\u0010$\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\u0002J\u0017\u0010$\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0086\u0002J\u0017\u0010$\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0086\u0002J\u0013\u0010%\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u000eJ\u0014\u0010&\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010&\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014J\u0019\u0010&\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0002\u0010\u0016J\u0014\u0010&\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019J\u0014\u0010&\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aJ\u0014\u0010&\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bJ\u0015\u0010'\u001a\u00028\u00002\b\b\u0001\u0010\u0010\u001a\u00020\u0004¢\u0006\u0002\u0010(J/\u0010)\u001a\u00020\u000f2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\f0+H\u0086\bø\u0001\u0000J\u001a\u0010.\u001a\u00020\u000f2\b\b\u0001\u0010/\u001a\u00020\u00042\b\b\u0001\u00100\u001a\u00020\u0004J%\u00101\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00042\u000e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u0015H\u0001¢\u0006\u0002\u00104J\u0014\u00105\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0019\u00105\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0002\u0010\u0016J\u0014\u00105\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018J\u0014\u00105\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019J\u0014\u00105\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bJ \u00106\u001a\u00028\u00002\b\b\u0001\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u00107J\u0010\u00108\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J\u0010\u00109\u001a\u00020\u000f2\b\b\u0002\u0010:\u001a\u00020\u0004R\u0012\u0010\u0006\u001a\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006>"}, d2 = {"Landroidx/collection/MutableObjectList;", "E", "Landroidx/collection/ObjectList;", "initialCapacity", "", "(I)V", "capacity", "getCapacity", "()I", "list", "Landroidx/collection/MutableObjectList$ObjectListMutableList;", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "Landroidx/collection/ScatterSet;", "", "([Ljava/lang/Object;)Z", "(I[Ljava/lang/Object;)Z", "", "", "", "Lkotlin/sequences/Sequence;", "asList", "asMutableList", "", "clear", "ensureCapacity", "minusAssign", "(Ljava/lang/Object;)V", "([Ljava/lang/Object;)V", "plusAssign", "remove", "removeAll", "removeAt", "(I)Ljava/lang/Object;", "removeIf", "predicate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "removeRange", "start", "end", "resizeStorage", "oldContent", "", "(I[Ljava/lang/Object;)V", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "throwIndexOutOfBoundsInclusiveException", "trim", "minCapacity", "MutableObjectListIterator", "ObjectListMutableList", "SubList", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableObjectList<E> extends ObjectList<E> {
    private ObjectListMutableList<E> list;

    /* JADX INFO: compiled from: ObjectList.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ\t\u0010\r\u001a\u00020\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0010\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\r\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/collection/MutableObjectList$MutableObjectListIterator;", "T", "", "list", "", "index", "", "(Ljava/util/List;I)V", "prevIndex", "add", "", "element", "(Ljava/lang/Object;)V", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "previous", "previousIndex", "remove", "set", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class MutableObjectListIterator<T> implements ListIterator<T>, KMutableListIterator {
        private final List<T> list;
        private int prevIndex;

        public MutableObjectListIterator(List<T> r2, int index) {
            Intrinsics.checkNotNullParameter(r2, "list");
            this.list = r2;
            this.prevIndex = index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.prevIndex < (this.list.size() - 1)) goto L7;
            return false;
        L7:
            return true;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> r0 = this.list;
            this.prevIndex++;
            return r0.get(this.prevIndex);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.list.remove(this.prevIndex);
            this.prevIndex--;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.prevIndex < 0) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.prevIndex + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            List<T> r0 = this.list;
            int r1 = this.prevIndex;
            this.prevIndex = r1 - 1;
            return r0.get(r1);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.prevIndex;
        }

        @Override // java.util.ListIterator
        public void add(T r3) {
            List<T> r0 = this.list;
            this.prevIndex++;
            r0.add(this.prevIndex, r3);
        }

        @Override // java.util.ListIterator
        public void set(T r3) {
            this.list.set(this.prevIndex, r3);
        }
    }

    /* JADX INFO: compiled from: ObjectList.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\rJ\u001d\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0016\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u0016\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\rJ\u0016\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0016\u0010\u0017\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u000bH\u0016J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001dH\u0096\u0002J\u0015\u0010\u001e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010 H\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010 2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\rJ\u0016\u0010\"\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0015\u0010#\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0018J\u0016\u0010$\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u001e\u0010%\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010&J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006*"}, d2 = {"Landroidx/collection/MutableObjectList$ObjectListMutableList;", "T", "", "objectList", "Landroidx/collection/MutableObjectList;", "(Landroidx/collection/MutableObjectList;)V", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class ObjectListMutableList<T> implements List<T>, KMutableList {
        private final MutableObjectList<T> objectList;

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] r2) {
            Intrinsics.checkNotNullParameter(r2, "array");
            return (T[]) CollectionToArray.toArray(this, r2);
        }

        public ObjectListMutableList(MutableObjectList<T> r2) {
            Intrinsics.checkNotNullParameter(r2, "objectList");
            this.objectList = r2;
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int index) {
            return removeAt(index);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        public int getSize() {
            return this.objectList.getSize();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            return this.objectList.contains(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> r3) {
            Intrinsics.checkNotNullParameter(r3, "elements");
            return this.objectList.containsAll(r3);
        }

        @Override // java.util.List
        public T get(int index) {
            ObjectListKt.access$checkIndex(this, index);
            return this.objectList.get(index);
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            return this.objectList.indexOf(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.objectList.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            return this.objectList.lastIndexOf(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T r2) {
            return this.objectList.add(r2);
        }

        @Override // java.util.List
        public void add(int index, T r3) {
            this.objectList.add(index, r3);
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection<? extends T> r3) {
            Intrinsics.checkNotNullParameter(r3, "elements");
            return this.objectList.addAll(index, r3);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> r3) {
            Intrinsics.checkNotNullParameter(r3, "elements");
            return this.objectList.addAll(r3);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.objectList.clear();
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int index) {
            return new MutableObjectListIterator(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            return this.objectList.remove(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> r3) {
            Intrinsics.checkNotNullParameter(r3, "elements");
            return this.objectList.removeAll(r3);
        }

        public T removeAt(int index) {
            ObjectListKt.access$checkIndex(this, index);
            return this.objectList.removeAt(index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> r2) {
            Intrinsics.checkNotNullParameter(r2, "elements");
            return this.objectList.retainAll(r2);
        }

        @Override // java.util.List
        public T set(int index, T r3) {
            ObjectListKt.access$checkIndex(this, index);
            return this.objectList.set(index, r3);
        }

        @Override // java.util.List
        public List<T> subList(int fromIndex, int toIndex) {
            ObjectListKt.access$checkSubIndex(this, fromIndex, toIndex);
            return new SubList(this, fromIndex, toIndex);
        }
    }

    /* JADX INFO: compiled from: ObjectList.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000eJ\u001d\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0016\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u0016\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u0017\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0016\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0002\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\fH\u0016J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001eH\u0096\u0002J\u0015\u0010\u001f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001bJ\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010!H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010!2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000eJ\u0016\u0010#\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0015\u0010$\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u0019J\u0016\u0010%\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u001e\u0010&\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010'J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0005H\u0016R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Landroidx/collection/MutableObjectList$SubList;", "T", "", "list", "start", "", "end", "(Ljava/util/List;II)V", "size", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class SubList<T> implements List<T>, KMutableList {
        private int end;
        private final List<T> list;
        private final int start;

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] r2) {
            Intrinsics.checkNotNullParameter(r2, "array");
            return (T[]) CollectionToArray.toArray(this, r2);
        }

        public SubList(List<T> r2, int start, int end) {
            Intrinsics.checkNotNullParameter(r2, "list");
            this.list = r2;
            this.start = start;
            this.end = end;
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int index) {
            return removeAt(index);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        public int getSize() {
            return this.end - this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            int i = this.start;
            int r1 = this.end;
        L3:
            if (i >= r1) goto L9;
            if (Intrinsics.areEqual(this.list.get(i), element) == true) goto L6;
            i = i + 1;
            goto L3
        L6:
            return true;
        L9:
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> r8) {
            Intrinsics.checkNotNullParameter(r8, "elements");
            Collection<? extends Object> $this$forEach$iv = r8;
            Iterator<T> r2 = $this$forEach$iv.iterator();
        L4:
            if (r2.hasNext() == false) goto L10;
            Object element$iv = r2.next();
            if (contains(element$iv) == true) goto L4;
            return false;
        L10:
            return true;
        }

        @Override // java.util.List
        public T get(int index) {
            ObjectListKt.access$checkIndex(this, index);
            return this.list.get(this.start + index);
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            int i = this.start;
            int r1 = this.end;
        L3:
            if (i >= r1) goto L9;
            if (Intrinsics.areEqual(this.list.get(i), element) == true) goto L7;
            i = i + 1;
            goto L3
        L7:
            return i - this.start;
        L9:
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            if (this.end != this.start) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            int i = this.end - 1;
            int r1 = this.start;
            if (r1 <= i) goto L5;
            return -1;
        L5:
            if (Intrinsics.areEqual(this.list.get(i), element) == true) goto L7;
            if (i == r1) goto L14;
            i = i - 1;
            goto L5
        L14:
            return -1;
        L7:
            return i - this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T r4) {
            List<T> r0 = this.list;
            int r1 = this.end;
            this.end = r1 + 1;
            r0.add(r1, r4);
            return true;
        }

        @Override // java.util.List
        public void add(int index, T r4) {
            this.list.add(this.start + index, r4);
            this.end++;
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection<? extends T> r4) {
            Intrinsics.checkNotNullParameter(r4, "elements");
            this.list.addAll(this.start + index, r4);
            this.end += r4.size();
            if (r4.size() <= 0) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> r3) {
            Intrinsics.checkNotNullParameter(r3, "elements");
            this.list.addAll(this.end, r3);
            this.end += r3.size();
            if (r3.size() <= 0) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i = this.end - 1;
            int r1 = this.start;
            if (r1 > i) goto L7;
        L4:
            this.list.remove(i);
            if (i == r1) goto L7;
            i = i - 1;
        L7:
            this.end = this.start;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int index) {
            return new MutableObjectListIterator(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            int i = this.start;
            int r1 = this.end;
        L3:
            if (i >= r1) goto L9;
            if (Intrinsics.areEqual(this.list.get(i), element) == true) goto L6;
            i = i + 1;
            goto L3
        L6:
            this.list.remove(i);
            this.end--;
            return true;
        L9:
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> r8) {
            Intrinsics.checkNotNullParameter(r8, "elements");
            int originalEnd = this.end;
            Collection<? extends Object> $this$forEach$iv = r8;
            Iterator<T> r3 = $this$forEach$iv.iterator();
        L4:
            if (r3.hasNext() == false) goto L7;
            Object element$iv = r3.next();
            remove(element$iv);
            goto L4
        L7:
            if (originalEnd == this.end) goto L9;
            return true;
        L9:
            return false;
        }

        public T removeAt(int index) {
            ObjectListKt.access$checkIndex(this, index);
            T r0 = this.list.remove(this.start + index);
            this.end--;
            return r0;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> r7) {
            Intrinsics.checkNotNullParameter(r7, "elements");
            int originalEnd = this.end;
            int i = this.end - 1;
            int r3 = this.start;
            if (r3 > i) goto L10;
        L4:
            Object element = this.list.get(i);
            if (r7.contains(element) == true) goto L7;
            this.list.remove(i);
            this.end--;
        L7:
            if (i == r3) goto L10;
            i = i - 1;
        L10:
            if (originalEnd != this.end) goto L15;
            return false;
        L15:
            return true;
        }

        @Override // java.util.List
        public T set(int index, T r4) {
            ObjectListKt.access$checkIndex(this, index);
            return this.list.set(this.start + index, r4);
        }

        @Override // java.util.List
        public List<T> subList(int fromIndex, int toIndex) {
            ObjectListKt.access$checkSubIndex(this, fromIndex, toIndex);
            return new SubList(this, fromIndex, toIndex);
        }
    }

    public MutableObjectList() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public MutableObjectList(int initialCapacity) {
        super(initialCapacity, null);
    }

    public /* synthetic */ MutableObjectList(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 16;
    L5:
        this(r1);
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final boolean add(E r7) {
        int capacity$iv = this._size + 1;
        Object[] oldContent$iv = this.content;
        if (oldContent$iv.length >= capacity$iv) goto L5;
        resizeStorage(capacity$iv, oldContent$iv);
    L5:
        this.content[this._size] = r7;
        this._size++;
        return true;
    }

    public final void add(int index, E r8) {
        boolean r0 = false;
        if (index >= 0) goto L5;
    L7:
        if (r0 == true) goto L9;
        throwIndexOutOfBoundsInclusiveException(index);
    L9:
        int capacity$iv = this._size + 1;
        Object[] oldContent$iv = this.content;
        if (oldContent$iv.length >= capacity$iv) goto L12;
        resizeStorage(capacity$iv, oldContent$iv);
    L12:
        Object[] content = this.content;
        if (index == this._size) goto L15;
        ArraysKt.copyInto(content, content, index + 1, index, this._size);
    L15:
        content[index] = r8;
        this._size++;
        return;
    L5:
        if (index > this._size) goto L7;
        r0 = true;
        goto L7
    }

    public final boolean addAll(int index, E[] r15) {
        Intrinsics.checkNotNullParameter(r15, "elements");
        if (index >= 0) goto L5;
    L7:
        boolean r2 = false;
    L8:
        if (r2 == true) goto L11;
        throwIndexOutOfBoundsInclusiveException(index);
    L11:
        if (r15.length != 0) goto L13;
        boolean r3 = true;
    L14:
        if (r3 == false) goto L16;
        return false;
    L16:
        int capacity$iv = this._size + r15.length;
        Object[] oldContent$iv = this.content;
        if (oldContent$iv.length >= capacity$iv) goto L19;
        resizeStorage(capacity$iv, oldContent$iv);
    L19:
        Object[] content = this.content;
        if (index == this._size) goto L22;
        ArraysKt.copyInto(content, content, r15.length + index, index, this._size);
    L22:
        ArraysKt.copyInto$default(r15, content, index, 0, 0, 12, null);
        this._size += r15.length;
        return true;
    L13:
        r3 = false;
        goto L14
    L5:
        if (index > this._size) goto L7;
        r2 = true;
        goto L8
    }

    public final boolean addAll(int index, Collection<? extends E> r13) {
        Intrinsics.checkNotNullParameter(r13, "elements");
        if (index >= 0) goto L5;
    L7:
        boolean r2 = false;
    L8:
        if (r2 == true) goto L11;
        throwIndexOutOfBoundsInclusiveException(index);
    L11:
        if (r13.isEmpty() == false) goto L13;
        return false;
    L13:
        int capacity$iv = this._size + r13.size();
        Object[] oldContent$iv = this.content;
        if (oldContent$iv.length >= capacity$iv) goto L16;
        resizeStorage(capacity$iv, oldContent$iv);
    L16:
        Object[] content = this.content;
        if (index == this._size) goto L19;
        ArraysKt.copyInto(content, content, r13.size() + index, index, this._size);
    L19:
        Collection<? extends E> $this$forEachIndexed$iv = r13;
        int i = 0;
        Iterator r5 = $this$forEachIndexed$iv.iterator();
    L21:
        if (r5.hasNext() == false) goto L26;
        Object item$iv = r5.next();
        int index$iv = i + 1;
        if (i >= 0) goto L25;
        CollectionsKt.throwIndexOverflow();
    L25:
        content[index + i] = item$iv;
        i = index$iv;
        goto L21
    L26:
        this._size += r13.size();
        return true;
    L5:
        if (index > this._size) goto L7;
        r2 = true;
        goto L8
    }

    public final boolean addAll(int index, ObjectList<E> r9) {
        Intrinsics.checkNotNullParameter(r9, "elements");
        if (index >= 0) goto L5;
    L7:
        boolean r2 = false;
    L8:
        if (r2 == true) goto L11;
        throwIndexOutOfBoundsInclusiveException(index);
    L11:
        if (r9.isEmpty() == false) goto L13;
        return false;
    L13:
        int capacity$iv = this._size + r9._size;
        Object[] oldContent$iv = this.content;
        if (oldContent$iv.length >= capacity$iv) goto L16;
        resizeStorage(capacity$iv, oldContent$iv);
    L16:
        Object[] content = this.content;
        if (index == this._size) goto L19;
        ArraysKt.copyInto(content, content, r9._size + index, index, this._size);
    L19:
        ArraysKt.copyInto(r9.content, content, index, 0, r9._size);
        this._size += r9._size;
        return true;
    L5:
        if (index > this._size) goto L7;
        r2 = true;
        goto L8
    }

    private final void throwIndexOutOfBoundsInclusiveException(int index) {
        RuntimeHelpersKt.throwIndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
    }

    public final boolean addAll(ObjectList<E> r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        int oldSize = this._size;
        plusAssign(r3);
        if (oldSize == this._size) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean addAll(ScatterSet<E> r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        int oldSize = this._size;
        plusAssign(r3);
        if (oldSize == this._size) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean addAll(E[] r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        int oldSize = this._size;
        plusAssign(r3);
        if (oldSize == this._size) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean addAll(List<? extends E> r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        int oldSize = this._size;
        plusAssign(r3);
        if (oldSize == this._size) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean addAll(Iterable<? extends E> r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        int oldSize = this._size;
        plusAssign(r3);
        if (oldSize == this._size) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean addAll(Sequence<? extends E> r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        int oldSize = this._size;
        plusAssign(r3);
        if (oldSize == this._size) goto L5;
        return true;
    L5:
        return false;
    }

    public final void plusAssign(ObjectList<E> r6) {
        Intrinsics.checkNotNullParameter(r6, "elements");
        if (r6.isEmpty() == false) goto L5;
        return;
    L5:
        int capacity$iv = this._size + r6._size;
        Object[] oldContent$iv = this.content;
        if (oldContent$iv.length >= capacity$iv) goto L8;
        resizeStorage(capacity$iv, oldContent$iv);
    L8:
        Object[] content = this.content;
        ArraysKt.copyInto(r6.content, content, this._size, 0, r6._size);
        this._size += r6._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(ScatterSet<E> r22) {
        Intrinsics.checkNotNullParameter(r22, "elements");
        if (r22.isEmpty() == false) goto L5;
        return;
    L5:
        int capacity$iv = this._size + r22.getSize();
        Object[] oldContent$iv = this.content;
        if (oldContent$iv.length >= capacity$iv) goto L8;
        resizeStorage(capacity$iv, oldContent$iv);
    L8:
        ScatterSet<E> r2 = r22;
        Object[] elements$iv = r2.elements;
        long[] m$iv$iv = r2.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L31;
    L10:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L25;
        int r1 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L13:
        if (j$iv$iv >= bitCount$iv$iv) goto L22;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L17;
        boolean r16 = true;
    L18:
        if (r16 == false) goto L21;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object element = elements$iv[index$iv$iv];
        add(element);
    L21:
        slot$iv$iv = slot$iv$iv >> r1;
        j$iv$iv = j$iv$iv + 1;
        r1 = r1;
        r2 = r2;
        goto L13
    L17:
        r16 = false;
        goto L18
    L22:
        ScatterSet<E> r20 = r2;
        if (bitCount$iv$iv != r1) goto L37;
    L26:
        if (i$iv$iv == lastIndex$iv$iv) goto L38;
        i$iv$iv = i$iv$iv + 1;
        r2 = r20;
        goto L10
    L38:
        return;
    L37:
        return;
    L25:
        r20 = r2;
        goto L26
    }

    public final void plusAssign(E[] r13) {
        Intrinsics.checkNotNullParameter(r13, "elements");
        if (r13.length != 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L8;
        return;
    L8:
        int capacity$iv = this._size + r13.length;
        Object[] oldContent$iv = this.content;
        if (oldContent$iv.length >= capacity$iv) goto L11;
        resizeStorage(capacity$iv, oldContent$iv);
    L11:
        Object[] content = this.content;
        ArraysKt.copyInto$default(r13, content, this._size, 0, 0, 12, null);
        this._size += r13.length;
        return;
    L5:
        r0 = false;
        goto L6
    }

    public final void plusAssign(List<? extends E> r7) {
        Intrinsics.checkNotNullParameter(r7, "elements");
        if (r7.isEmpty() == false) goto L5;
        return;
    L5:
        int size = this._size;
        int capacity$iv = r7.size() + size;
        Object[] oldContent$iv = this.content;
        if (oldContent$iv.length >= capacity$iv) goto L8;
        resizeStorage(capacity$iv, oldContent$iv);
    L8:
        Object[] content = this.content;
        int i = 0;
        int r3 = r7.size();
    L9:
        if (i >= r3) goto L11;
        content[i + size] = r7.get(i);
        i = i + 1;
        goto L9
    L11:
        int i2 = this._size;
        this._size = i2 + r7.size();
    }

    public final void plusAssign(Iterable<? extends E> r9) {
        Intrinsics.checkNotNullParameter(r9, "elements");
        Iterator<? extends E> r2 = r9.iterator();
    L4:
        if (r2.hasNext() == false) goto L7;
        add(r2.next());
        goto L4
    }

    public final void plusAssign(Sequence<? extends E> r9) {
        Intrinsics.checkNotNullParameter(r9, "elements");
        Iterator<? extends E> r2 = r9.iterator();
    L4:
        if (r2.hasNext() == false) goto L7;
        add(r2.next());
        goto L4
    }

    public final void clear() {
        ArraysKt.fill(this.content, null, 0, this._size);
        this._size = 0;
    }

    public static /* synthetic */ void trim$default(MutableObjectList r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = r0._size;
    L5:
        r0.trim(r1);
    }

    public final void trim(int minCapacity) {
        int minSize = Math.max(minCapacity, this._size);
        if (this.content.length <= minSize) goto L6;
        Object[] r1 = Arrays.copyOf(this.content, minSize);
        Intrinsics.checkNotNullExpressionValue(r1, "copyOf(...)");
        this.content = r1;
        return;
    }

    public final void ensureCapacity(int capacity) {
        Object[] oldContent = this.content;
        if (oldContent.length >= capacity) goto L6;
        resizeStorage(capacity, oldContent);
        return;
    }

    public final void resizeStorage(int capacity, Object[] oldContent) {
        Intrinsics.checkNotNullParameter(oldContent, "oldContent");
        int oldSize = oldContent.length;
        int newSize = Math.max(capacity, (oldSize * 3) / 2);
        Object[] newContent = new Object[newSize];
        this.content = ArraysKt.copyInto(oldContent, newContent, 0, 0, oldSize);
    }

    public final void plusAssign(E r2) {
        add(r2);
    }

    public final void minusAssign(E r2) {
        remove(r2);
    }

    public final boolean remove(E r3) {
        int index = indexOf(r3);
        if (index < 0) goto L6;
        removeAt(index);
        return true;
    L6:
        return false;
    }

    public final void removeIf(Function1<? super E, Boolean> r9) {
        Intrinsics.checkNotNullParameter(r9, "predicate");
        int gap = 0;
        int size = this._size;
        Object[] content = this.content;
        MutableObjectList<E> this_$iv = this;
        IntRange r4 = RangesKt.until(0, this_$iv._size);
        int i = r4.getFirst();
        int r5 = r4.getLast();
        if (i > r5) goto L9;
    L4:
        content[i - gap] = content[i];
        if (r9.invoke(content[i]).booleanValue() == false) goto L7;
        gap = gap + 1;
    L7:
        if (i == r5) goto L9;
        i = i + 1;
    L9:
        ArraysKt.fill(content, null, size - gap, size);
        this._size -= gap;
    }

    public final boolean removeAll(E[] r5) {
        Intrinsics.checkNotNullParameter(r5, "elements");
        int initialSize = this._size;
        int i = 0;
        int r2 = r5.length;
    L3:
        if (i >= r2) goto L5;
        remove(r5[i]);
        i = i + 1;
        goto L3
    L5:
        int i2 = this._size;
        if (initialSize == i2) goto L8;
        return true;
    L8:
        return false;
    }

    public final boolean removeAll(ObjectList<E> r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        int initialSize = this._size;
        minusAssign(r3);
        if (initialSize == this._size) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean removeAll(ScatterSet<E> r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        int initialSize = this._size;
        minusAssign(r3);
        if (initialSize == this._size) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean removeAll(List<? extends E> r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        int initialSize = this._size;
        minusAssign(r3);
        if (initialSize == this._size) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean removeAll(Iterable<? extends E> r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        int initialSize = this._size;
        minusAssign(r3);
        if (initialSize == this._size) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean removeAll(Sequence<? extends E> r3) {
        Intrinsics.checkNotNullParameter(r3, "elements");
        int initialSize = this._size;
        minusAssign(r3);
        if (initialSize == this._size) goto L5;
        return true;
    L5:
        return false;
    }

    public final void minusAssign(E[] r10) {
        Intrinsics.checkNotNullParameter(r10, "elements");
        int r2 = r10.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L6;
        remove(r10[r3]);
        r3 = r3 + 1;
        goto L3
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<E> r10) {
        Intrinsics.checkNotNullParameter(r10, "elements");
        Object[] content$iv = r10.content;
        int i$iv = 0;
        int r4 = r10._size;
    L3:
        if (i$iv >= r4) goto L6;
        Object element = content$iv[i$iv];
        remove(element);
        i$iv = i$iv + 1;
        goto L3
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<E> r23) {
        Intrinsics.checkNotNullParameter(r23, "elements");
        ScatterSet<E> r0 = r23;
        Object[] elements$iv = r0.elements;
        long[] m$iv$iv = r0.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L25;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L19;
        int r12 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L16;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r17 = true;
    L12:
        if (r17 == false) goto L15;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object element = elements$iv[index$iv$iv];
        remove(element);
    L15:
        slot$iv$iv = slot$iv$iv >> r12;
        j$iv$iv = j$iv$iv + 1;
        r12 = r12;
        r0 = r0;
        goto L7
    L11:
        r17 = false;
        goto L12
    L16:
        ScatterSet<E> r21 = r0;
        if (bitCount$iv$iv != r12) goto L31;
    L20:
        if (i$iv$iv == lastIndex$iv$iv) goto L32;
        i$iv$iv = i$iv$iv + 1;
        r0 = r21;
        goto L4
    L32:
        return;
    L31:
        return;
    L19:
        r21 = r0;
        goto L20
    }

    public final void minusAssign(List<? extends E> r6) {
        Intrinsics.checkNotNullParameter(r6, "elements");
        int i = 0;
        int r1 = r6.size();
    L3:
        if (i >= r1) goto L5;
        remove(r6.get(i));
        i = i + 1;
        goto L3
    }

    public final void minusAssign(Iterable<? extends E> r9) {
        Intrinsics.checkNotNullParameter(r9, "elements");
        Iterator<? extends E> r2 = r9.iterator();
    L4:
        if (r2.hasNext() == false) goto L7;
        remove(r2.next());
        goto L4
    }

    public final void minusAssign(Sequence<? extends E> r9) {
        Intrinsics.checkNotNullParameter(r9, "elements");
        Iterator<? extends E> r2 = r9.iterator();
    L4:
        if (r2.hasNext() == false) goto L7;
        remove(r2.next());
        goto L4
    }

    public final E removeAt(int r7) {
        boolean r0 = false;
        if (r7 >= 0) goto L5;
    L7:
        if (r0 == true) goto L9;
        throwIndexOutOfBoundsExclusiveException$collection(r7);
    L9:
        Object[] r1 = this.content;
        E r2 = (E) r1[r7];
        if (r7 == (this._size - 1)) goto L12;
        ArraysKt.copyInto(r1, r1, r7, r7 + 1, this._size);
    L12:
        this._size--;
        r1[this._size] = null;
        return r2;
    L5:
        if (r7 >= this._size) goto L7;
        r0 = true;
        goto L7
    }

    public final void removeRange(int start, int end) {
        boolean r0 = true;
        if (start >= 0) goto L5;
    L7:
        boolean r2 = false;
    L9:
        if (r2 == false) goto L16;
        if (end >= 0) goto L12;
    L14:
        r0 = false;
    L15:
        if (r0 == false) goto L16;
    L17:
        if (end >= start) goto L19;
        RuntimeHelpersKt.throwIllegalArgumentException("Start (" + start + ") is more than end (" + end + ')');
    L19:
        if (end != start) goto L21;
        return;
    L21:
        if (end >= this._size) goto L23;
        ArraysKt.copyInto(this.content, this.content, start, end, this._size);
    L23:
        int newSize = this._size - (end - start);
        ArraysKt.fill(this.content, null, newSize, this._size);
        this._size = newSize;
        return;
    L12:
        if (end > this._size) goto L14;
    L16:
        RuntimeHelpersKt.throwIndexOutOfBoundsException("Start (" + start + ") and end (" + end + ") must be in 0.." + this._size);
        goto L17
    L5:
        if (start > this._size) goto L7;
        r2 = true;
        goto L9
    }

    public final boolean retainAll(E[] r7) {
        Intrinsics.checkNotNullParameter(r7, "elements");
        int initialSize = this._size;
        Object[] content = this.content;
        MutableObjectList<E> this_$iv = this;
        int i = this_$iv._size - 1;
    L4:
        if ((-1) >= i) goto L10;
        Object element = content[i];
        if (ArraysKt.indexOf(r7, element) >= 0) goto L8;
        removeAt(i);
    L8:
        i = i - 1;
        goto L4
    L10:
        if (initialSize != this._size) goto L17;
        return false;
    L17:
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(ObjectList<E> r7) {
        Intrinsics.checkNotNullParameter(r7, "elements");
        int initialSize = this._size;
        Object[] content = this.content;
        MutableObjectList<E> this_$iv = this;
        int i = this_$iv._size - 1;
    L4:
        if ((-1) >= i) goto L10;
        Object element = content[i];
        if (r7.contains(element) == true) goto L8;
        removeAt(i);
    L8:
        i = i - 1;
        goto L4
    L10:
        if (initialSize != this._size) goto L17;
        return false;
    L17:
        return true;
    }

    public final boolean retainAll(Collection<? extends E> r7) {
        Intrinsics.checkNotNullParameter(r7, "elements");
        int initialSize = this._size;
        Object[] content = this.content;
        MutableObjectList<E> this_$iv = this;
        int i = this_$iv._size - 1;
    L4:
        if ((-1) >= i) goto L10;
        Object element = content[i];
        if (r7.contains(element) == true) goto L8;
        removeAt(i);
    L8:
        i = i - 1;
        goto L4
    L10:
        if (initialSize != this._size) goto L17;
        return false;
    L17:
        return true;
    }

    public final boolean retainAll(Iterable<? extends E> r7) {
        Intrinsics.checkNotNullParameter(r7, "elements");
        int initialSize = this._size;
        Object[] content = this.content;
        MutableObjectList<E> this_$iv = this;
        int i = this_$iv._size - 1;
    L4:
        if ((-1) >= i) goto L10;
        Object element = content[i];
        if (CollectionsKt.contains(r7, element) == true) goto L8;
        removeAt(i);
    L8:
        i = i - 1;
        goto L4
    L10:
        if (initialSize != this._size) goto L17;
        return false;
    L17:
        return true;
    }

    public final boolean retainAll(Sequence<? extends E> r7) {
        Intrinsics.checkNotNullParameter(r7, "elements");
        int initialSize = this._size;
        Object[] content = this.content;
        MutableObjectList<E> this_$iv = this;
        int i = this_$iv._size - 1;
    L4:
        if ((-1) >= i) goto L10;
        Object element = content[i];
        if (SequencesKt.contains(r7, element) == true) goto L8;
        removeAt(i);
    L8:
        i = i - 1;
        goto L4
    L10:
        if (initialSize != this._size) goto L17;
        return false;
    L17:
        return true;
    }

    public final E set(int r3, E r4) {
        boolean r0 = false;
        if (r3 >= 0) goto L5;
    L7:
        if (r0 == true) goto L9;
        throwIndexOutOfBoundsExclusiveException$collection(r3);
    L9:
        Object[] r1 = this.content;
        E r2 = (E) r1[r3];
        r1[r3] = r4;
        return r2;
    L5:
        if (r3 >= this._size) goto L7;
        r0 = true;
        goto L7
    }

    @Override // androidx.collection.ObjectList
    public List<E> asList() {
        return asMutableList();
    }

    public final List<E> asMutableList() {
        ObjectListMutableList<E> r0 = this.list;
        if (r0 != null) goto L7;
        r0 = new ObjectListMutableList(this);
        this.list = r0;
    L7:
        return r0;
    }
}
