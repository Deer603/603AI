package androidx.collection;

import androidx.autofill.HintConstants;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: OrderedScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J:\u0010\u0019\u001a\u00020\u001a2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001a0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010 \u001a\u00020\u001aJ:\u0010 \u001a\u00020\u001a2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001a0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"J\u0016\u0010#\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u0005H\u0007J:\u0010%\u001a\u00020\u00052!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001a0\u001cH\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0013\u0010&\u001a\u00020\u001a2\b\u0010'\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0018\u0010(\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b)\u0010*J\u000b\u0010+\u001a\u00028\u0000¢\u0006\u0002\u0010,J?\u0010+\u001a\u00028\u00002!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001a0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010-JA\u0010.\u001a\u0004\u0018\u00018\u00002!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001a0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010-J:\u0010/\u001a\u0002002!\u00101\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u0002000\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J?\u00102\u001a\u0002002!\u00101\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(3\u0012\u0004\u0012\u0002000\u001cH\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\b4J:\u00105\u001a\u0002002!\u00101\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u0002000\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\b\u00106\u001a\u00020\u0005H\u0016J\u0006\u00107\u001a\u00020\u001aJ\u0006\u00108\u001a\u00020\u001aJR\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020<2\b\b\u0002\u0010=\u001a\u00020<2\b\b\u0002\u0010>\u001a\u00020<2\b\b\u0002\u0010?\u001a\u00020\u00052\b\b\u0002\u0010@\u001a\u00020<2\u0016\b\u0002\u0010A\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020<\u0018\u00010\u001cH\u0007J\u000b\u0010B\u001a\u00028\u0000¢\u0006\u0002\u0010,J?\u0010B\u001a\u00028\u00002!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001a0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010-JA\u0010C\u001a\u0004\u0018\u00018\u00002!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001a0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010-J\u0006\u0010D\u001a\u00020\u001aJ\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000FH\u0086\bJ\b\u0010G\u001a\u00020:H\u0016J:\u0010H\u001a\u0002002!\u00101\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u0002000\u001cH\u0081\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010I\u001a\u0002002!\u00101\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(3\u0012\u0004\u0012\u0002000\u001cH\u0081\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001R\u0012\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\n\n\u0002\u0010\r\u0012\u0004\b\f\u0010\u0003R\u0018\u0010\u000e\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0003R\u0018\u0010\u0010\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0003R\u0018\u0010\u0013\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0003R\u0011\u0010\u0015\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\tR\u0018\u0010\u0017\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0018\u0010\u0003\u0082\u0001\u0001J\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006K"}, d2 = {"Landroidx/collection/OrderedScatterSet;", "E", "", "()V", "_capacity", "", "_size", "capacity", "getCapacity", "()I", "elements", "", "getElements$annotations", "[Ljava/lang/Object;", "head", "getHead$annotations", "metadata", "", "getMetadata$annotations", "nodes", "getNodes$annotations", "size", "getSize", "tail", "getTail$annotations", "all", "", "predicate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "element", "any", "asSet", "", "contains", "(Ljava/lang/Object;)Z", "count", "equals", "other", "findElementIndex", "findElementIndex$collection", "(Ljava/lang/Object;)I", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "forEach", "", "block", "forEachIndex", "index", "forEachIndex$collection", "forEachReverse", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "last", "lastOrNull", "none", "toList", "", "toString", "unorderedForEach", "unorderedForEachIndex", "Landroidx/collection/MutableOrderedScatterSet;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class OrderedScatterSet<E> {
    public int _capacity;
    public int _size;
    public Object[] elements;
    public int head;
    public long[] metadata;
    public long[] nodes;
    public int tail;

    public /* synthetic */ OrderedScatterSet(DefaultConstructorMarker r1) {
        this();
    }

    public static /* synthetic */ void getElements$annotations() {
    }

    public static /* synthetic */ void getHead$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getNodes$annotations() {
    }

    public static /* synthetic */ void getTail$annotations() {
    }

    private OrderedScatterSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = ContainerHelpersKt.EMPTY_OBJECTS;
        this.nodes = SieveCacheKt.getEmptyNodes();
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
    }

    public final int getCapacity() {
        return this._capacity;
    }

    public final int getSize() {
        return this._size;
    }

    public final boolean any() {
        if (this._size == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean none() {
        if (this._size != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean isEmpty() {
        if (this._size != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean isNotEmpty() {
        if (this._size == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final E first() {
        Object[] r2 = this.elements;
        long[] r3 = this.nodes;
        int r4 = this.tail;
        if (r4 == Integer.MAX_VALUE) goto L6;
        int r5 = (int) ((r3[r4] >> 31) & SieveCacheKt.NodeLinkMask);
        return (E) r2[r4];
    L6:
        RuntimeHelpersKt.throwNoSuchElementExceptionForInline("The OrderedScatterSet is empty");
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [E, java.lang.Object] */
    public final E first(Function1<? super E, Boolean> r14) {
        Intrinsics.checkNotNullParameter(r14, "predicate");
        Object[] r3 = this.elements;
        long[] r4 = this.nodes;
        int r5 = this.tail;
    L4:
        if (r5 == Integer.MAX_VALUE) goto L9;
        int r6 = (int) ((r4[r5] >> 31) & SieveCacheKt.NodeLinkMask);
        ?? r7 = (Object) r3[r5];
        if (r14.invoke(r7).booleanValue() == true) goto L7;
        r5 = r6;
        goto L4
    L7:
        return r7;
    L9:
        RuntimeHelpersKt.throwNoSuchElementExceptionForInline("Could not find a match");
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [E, java.lang.Object] */
    public final E firstOrNull(Function1<? super E, Boolean> r14) {
        Intrinsics.checkNotNullParameter(r14, "predicate");
        Object[] r3 = this.elements;
        long[] r4 = this.nodes;
        int r5 = this.tail;
    L4:
        if (r5 == Integer.MAX_VALUE) goto L9;
        int r6 = (int) ((r4[r5] >> 31) & SieveCacheKt.NodeLinkMask);
        ?? r7 = (Object) r3[r5];
        if (r14.invoke(r7).booleanValue() == true) goto L7;
        r5 = r6;
        goto L4
    L7:
        return r7;
    L9:
        return null;
    }

    public final E last() {
        Object[] r2 = this.elements;
        long[] r3 = this.nodes;
        int r4 = this.head;
        if (r4 == Integer.MAX_VALUE) goto L6;
        int r5 = (int) (SieveCacheKt.NodeLinkMask & r3[r4]);
        return (E) r2[r4];
    L6:
        RuntimeHelpersKt.throwNoSuchElementExceptionForInline("The OrderedScatterSet is empty");
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [E, java.lang.Object] */
    public final E last(Function1<? super E, Boolean> r12) {
        Intrinsics.checkNotNullParameter(r12, "predicate");
        Object[] r3 = this.elements;
        long[] r4 = this.nodes;
        int r5 = this.head;
    L4:
        if (r5 == Integer.MAX_VALUE) goto L9;
        int r6 = (int) (SieveCacheKt.NodeLinkMask & r4[r5]);
        ?? r7 = (Object) r3[r5];
        if (r12.invoke(r7).booleanValue() == true) goto L7;
        r5 = r6;
        goto L4
    L7:
        return r7;
    L9:
        RuntimeHelpersKt.throwNoSuchElementExceptionForInline("Could not find a match");
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [E, java.lang.Object] */
    public final E lastOrNull(Function1<? super E, Boolean> r12) {
        Intrinsics.checkNotNullParameter(r12, "predicate");
        Object[] r3 = this.elements;
        long[] r4 = this.nodes;
        int r5 = this.head;
    L4:
        if (r5 == Integer.MAX_VALUE) goto L9;
        int r6 = (int) (SieveCacheKt.NodeLinkMask & r4[r5]);
        ?? r7 = (Object) r3[r5];
        if (r12.invoke(r7).booleanValue() == true) goto L7;
        r5 = r6;
        goto L4
    L7:
        return r7;
    L9:
        return null;
    }

    public final void forEachIndex$collection(Function1<? super Integer, Unit> r11) {
        Intrinsics.checkNotNullParameter(r11, "block");
        long[] nodes = this.nodes;
        int candidate = this.tail;
    L4:
        if (candidate == Integer.MAX_VALUE) goto L6;
        long $this$previousNode$iv = nodes[candidate];
        int previousNode = (int) (($this$previousNode$iv >> 31) & SieveCacheKt.NodeLinkMask);
        r11.invoke(Integer.valueOf(candidate));
        candidate = previousNode;
        goto L4
    }

    public final void unorderedForEachIndex(Function1<? super Integer, Unit> r15) {
        Intrinsics.checkNotNullParameter(r15, "block");
        long[] m = this.metadata;
        int lastIndex = m.length - 2;
        int i = 0;
        if (0 > lastIndex) goto L19;
    L4:
        long slot = m[i];
        long $this$maskEmptyOrDeleted$iv = (((~slot) << 7) & slot) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv == (-9187201950435737472L)) goto L17;
        int bitCount = 8 - ((~(i - lastIndex)) >>> 31);
        int j = 0;
    L7:
        if (j >= bitCount) goto L15;
        long value$iv = 255 & slot;
        if (value$iv >= 128) goto L11;
        boolean r12 = true;
    L12:
        if (r12 == false) goto L14;
        int index = (i << 3) + j;
        r15.invoke(Integer.valueOf(index));
    L14:
        slot = slot >> 8;
        j = j + 1;
        goto L7
    L11:
        r12 = false;
        goto L12
    L15:
        if (bitCount == 8) goto L17;
        return;
    L17:
        if (i == lastIndex) goto L25;
        i = i + 1;
        goto L4
    L25:
        return;
    }

    public final void forEach(Function1<? super E, Unit> r12) {
        Intrinsics.checkNotNullParameter(r12, "block");
        Object[] elements = this.elements;
        long[] nodes = this.nodes;
        int candidate = this.tail;
    L4:
        if (candidate == Integer.MAX_VALUE) goto L6;
        long $this$previousNode$iv = nodes[candidate];
        int previousNode = (int) (($this$previousNode$iv >> 31) & SieveCacheKt.NodeLinkMask);
        r12.invoke(elements[candidate]);
        candidate = previousNode;
        goto L4
    }

    public final void forEachReverse(Function1<? super E, Unit> r10) {
        Intrinsics.checkNotNullParameter(r10, "block");
        Object[] elements = this.elements;
        long[] nodes = this.nodes;
        int candidate = this.head;
    L4:
        if (candidate == Integer.MAX_VALUE) goto L6;
        long $this$nextNode$iv = nodes[candidate];
        int nextNode = (int) (SieveCacheKt.NodeLinkMask & $this$nextNode$iv);
        r10.invoke(elements[candidate]);
        candidate = nextNode;
        goto L4
    }

    public final void unorderedForEach(Function1<? super E, Unit> r20) {
        Intrinsics.checkNotNullParameter(r20, "block");
        Object[] elements = this.elements;
        long[] m$iv = this.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 > lastIndex$iv) goto L21;
    L4:
        long slot$iv = m$iv[i$iv];
        long $this$maskEmptyOrDeleted$iv$iv = (((~slot$iv) << 7) & slot$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv == (-9187201950435737472L)) goto L18;
        int r12 = 8;
        int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
        int j$iv = 0;
    L7:
        if (j$iv >= bitCount$iv) goto L17;
        long value$iv$iv = 255 & slot$iv;
        if (value$iv$iv >= 128) goto L11;
        boolean r17 = true;
    L12:
        if (r17 == false) goto L15;
        int index$iv = (i$iv << 3) + j$iv;
        r20.invoke(elements[index$iv]);
    L15:
        slot$iv = slot$iv >> r12;
        j$iv = j$iv + 1;
        r12 = r12;
        goto L7
    L11:
        r17 = false;
        goto L12
    L17:
        if (bitCount$iv == r12) goto L18;
        return;
    L18:
        if (i$iv == lastIndex$iv) goto L28;
        i$iv = i$iv + 1;
        goto L4
    L28:
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<E> toList() {
        ArrayList r1 = new ArrayList(getSize());
        Object[] elements$iv = this.elements;
        long[] nodes$iv = this.nodes;
        int candidate$iv = this.tail;
    L4:
        if (candidate$iv == Integer.MAX_VALUE) goto L7;
        long $this$previousNode$iv$iv = nodes$iv[candidate$iv];
        int previousNode$iv = (int) (($this$previousNode$iv$iv >> 31) & SieveCacheKt.NodeLinkMask);
        Object element = elements$iv[candidate$iv];
        r1.add(element);
        candidate$iv = previousNode$iv;
        goto L4
    L7:
        return r1;
    }

    public final boolean all(Function1<? super E, Boolean> r24) {
        Intrinsics.checkNotNullParameter(r24, "predicate");
        Object[] elements$iv = this.elements;
        long[] m$iv$iv = this.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L23;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long slot$iv$iv2 = slot$iv$iv;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L21;
        int r11 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L20;
        long value$iv$iv$iv = slot$iv$iv2 & 255;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r13 = true;
    L12:
        if (r13 == false) goto L18;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object element = elements$iv[index$iv$iv];
        if (r24.invoke(element).booleanValue() == true) goto L18;
        return false;
    L18:
        slot$iv$iv2 = slot$iv$iv2 >> r11;
        j$iv$iv = j$iv$iv + 1;
        r11 = r11;
        goto L7
    L11:
        r13 = false;
        goto L12
    L20:
        if (bitCount$iv$iv == r11) goto L21;
        return true;
    L21:
        if (i$iv$iv == lastIndex$iv$iv) goto L34;
        i$iv$iv = i$iv$iv + 1;
        goto L4
    L34:
        return true;
    L23:
        return true;
    }

    public final boolean any(Function1<? super E, Boolean> r24) {
        Intrinsics.checkNotNullParameter(r24, "predicate");
        Object[] elements$iv = this.elements;
        long[] m$iv$iv = this.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L23;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long slot$iv$iv2 = slot$iv$iv;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L21;
        int r11 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L20;
        long value$iv$iv$iv = slot$iv$iv2 & 255;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r13 = true;
    L12:
        if (r13 == false) goto L18;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object element = elements$iv[index$iv$iv];
        if (r24.invoke(element).booleanValue() == false) goto L18;
        return true;
    L18:
        slot$iv$iv2 = slot$iv$iv2 >> r11;
        j$iv$iv = j$iv$iv + 1;
        r11 = r11;
        goto L7
    L11:
        r13 = false;
        goto L12
    L20:
        if (bitCount$iv$iv == r11) goto L21;
        return false;
    L21:
        if (i$iv$iv == lastIndex$iv$iv) goto L34;
        i$iv$iv = i$iv$iv + 1;
        goto L4
    L34:
        return false;
    L23:
        return false;
    }

    public final int count() {
        return getSize();
    }

    public final int count(Function1<? super E, Boolean> r23) {
        Intrinsics.checkNotNullParameter(r23, "predicate");
        int $i$f$count = 0;
        int count = 0;
        Object[] elements$iv = this.elements;
        long[] m$iv$iv = this.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L28;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int $i$f$count2 = $i$f$count;
        int count2 = count;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L22;
        int r2 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L20;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r19 = true;
    L12:
        if (r19 == false) goto L17;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int r110 = r2;
        Object element = elements$iv[index$iv$iv];
        if (r23.invoke(element).booleanValue() == false) goto L18;
        count2 = count2 + 1;
    L18:
        slot$iv$iv = slot$iv$iv >> r110;
        j$iv$iv = j$iv$iv + 1;
        r2 = r110;
        goto L7
    L17:
        r110 = r2;
        goto L18
    L11:
        r19 = false;
        goto L12
    L20:
        if (bitCount$iv$iv != r2) goto L35;
        count = count2;
    L23:
        if (i$iv$iv == lastIndex$iv$iv) goto L28;
        i$iv$iv = i$iv$iv + 1;
        $i$f$count = $i$f$count2;
        goto L4
    L35:
        return count2;
    L22:
        count = count2;
    L28:
        return count;
    }

    public final boolean contains(E r25) {
        int $i$f$findElementIndex$collection = 0;
        if (r25 == null) goto L5;
        int r5 = r25.hashCode();
    L6:
        int hash$iv$iv = r5 * ScatterMapKt.MurmurHashC1;
        int hash$iv = hash$iv$iv ^ (hash$iv$iv << 16);
        int hash2$iv = hash$iv & WorkQueueKt.MASK;
        int probeMask$iv = this._capacity;
        int $i$f$h1 = hash$iv >>> 7;
        int probeOffset$iv = $i$f$h1 & probeMask$iv;
        int probeIndex$iv = 0;
    L7:
        long[] metadata$iv$iv = this.metadata;
        int i$iv$iv = probeOffset$iv >> 3;
        int b$iv$iv = (probeOffset$iv & 7) << 3;
        int hash2$iv2 = hash2$iv;
        long g$iv = (((-b$iv$iv) >> 63) & (metadata$iv$iv[i$iv$iv + 1] << (64 - b$iv$iv))) | (metadata$iv$iv[i$iv$iv] >>> b$iv$iv);
        long x$iv$iv = (((long) hash2$iv2) * ScatterMapKt.BitmaskLsb) ^ g$iv;
        int $i$f$findElementIndex$collection2 = $i$f$findElementIndex$collection;
        int hash$iv2 = hash$iv;
        long m$iv = ((~x$iv$iv) & (x$iv$iv - ScatterMapKt.BitmaskLsb)) & (-9187201950435737472L);
    L8:
        long $this$hasNext$iv$iv = m$iv;
        if ($this$hasNext$iv$iv == 0) goto L11;
        boolean r9 = true;
    L12:
        if (r9 == false) goto L17;
        long $this$get$iv$iv = m$iv;
        int index$iv = ((Long.numberOfTrailingZeros($this$get$iv$iv) >> 3) + probeOffset$iv) & probeMask$iv;
        if (Intrinsics.areEqual(this.elements[index$iv], r25) == true) goto L20;
        long $this$next$iv$iv = m$iv;
        m$iv = $this$next$iv$iv & ($this$next$iv$iv - 1);
    L20:
        if (index$iv >= 0) goto L28;
        return false;
    L28:
        return true;
    L17:
        long $this$maskEmpty$iv$iv = (((~g$iv) << 6) & g$iv) & (-9187201950435737472L);
        if ($this$maskEmpty$iv$iv != 0) goto L19;
        probeIndex$iv = probeIndex$iv + 8;
        probeOffset$iv = (probeOffset$iv + probeIndex$iv) & probeMask$iv;
        hash2$iv = hash2$iv2;
        $i$f$findElementIndex$collection = $i$f$findElementIndex$collection2;
        hash$iv = hash$iv2;
        goto L7
    L19:
        index$iv = -1;
        goto L20
    L11:
        r9 = false;
        goto L12
    L5:
        r5 = 0;
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String joinToString$default(OrderedScatterSet r1, CharSequence r2, CharSequence r3, CharSequence r4, int r5, CharSequence r6, Function1 r7, int r8, Object r9) {
        if (r9 != null) goto L25;
        if ((r8 & 1) == 0) goto L7;
    L7:
        if ((r8 & 2) == 0) goto L10;
    L10:
        if ((r8 & 4) == 0) goto L13;
    L13:
        if ((r8 & 8) == 0) goto L16;
        r5 = -1;
    L16:
        if ((r8 & 16) == 0) goto L19;
    L19:
        if ((r8 & 32) == 0) goto L21;
        Function1 r10 = null;
    L22:
        CharSequence r11 = r6;
        CharSequence r12 = r4;
        return r1.joinToString(r2, r3, r12, r5, r11, r10);
    L21:
        r10 = r7;
        goto L22
    L25:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1<? super E, ? extends CharSequence> r29) {
        CharSequence r0 = separator;
        Intrinsics.checkNotNullParameter(r0, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder $this$joinToString_u24lambda_u2425 = new StringBuilder();
        $this$joinToString_u24lambda_u2425.append(prefix);
        int index = 0;
        OrderedScatterSet<E> r9 = this;
        int $i$f$forEach = 0;
        Object[] elements$iv = r9.elements;
        long[] nodes$iv = r9.nodes;
        int candidate$iv = r9.tail;
    L4:
        if (candidate$iv == Integer.MAX_VALUE) goto L14;
        long $this$previousNode$iv$iv = nodes$iv[candidate$iv];
        OrderedScatterSet<E> r21 = r9;
        int $i$f$forEach2 = $i$f$forEach;
        int previousNode$iv = (int) (($this$previousNode$iv$iv >> 31) & SieveCacheKt.NodeLinkMask);
        Object element = elements$iv[candidate$iv];
        if (index == limit) goto L7;
        if (index == 0) goto L10;
        $this$joinToString_u24lambda_u2425.append(r0);
    L10:
        if (r29 != null) goto L12;
        $this$joinToString_u24lambda_u2425.append(element);
    L13:
        index = index + 1;
        candidate$iv = previousNode$iv;
        r0 = separator;
        r9 = r21;
        $i$f$forEach = $i$f$forEach2;
        goto L4
    L12:
        $this$joinToString_u24lambda_u2425.append(r29.invoke(element));
        goto L13
    L7:
        $this$joinToString_u24lambda_u2425.append(truncated);
    L15:
        String r1 = $this$joinToString_u24lambda_u2425.toString();
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        return r1;
    L14:
        $this$joinToString_u24lambda_u2425.append(postfix);
        goto L15
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final String joinToString(CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, null, 62, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, null, 60, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, limit, null, null, 48, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return joinToString$default(this, separator, prefix, postfix, limit, truncated, null, 32, null);
    }

    public int hashCode() {
        int hash = (this._capacity * 31) + this._size;
        OrderedScatterSet<E> r1 = this;
        Object[] elements$iv = r1.elements;
        long[] m$iv$iv = r1.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L30;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        OrderedScatterSet<E> r15 = r1;
        int hash2 = hash;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L24;
        int r2 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L22;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        int r19 = 0;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r18 = true;
    L12:
        if (r18 == false) goto L19;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        int r110 = r2;
        Object element = elements$iv[index$iv$iv];
        if (Intrinsics.areEqual(element, this) == true) goto L20;
        if (element == null) goto L17;
        r19 = element.hashCode();
    L17:
        hash2 = hash2 + r19;
    L20:
        slot$iv$iv = slot$iv$iv >> r110;
        j$iv$iv = j$iv$iv + 1;
        r2 = r110;
        goto L7
    L19:
        r110 = r2;
        goto L20
    L11:
        r18 = false;
        goto L12
    L22:
        if (bitCount$iv$iv != r2) goto L37;
        hash = hash2;
    L25:
        if (i$iv$iv == lastIndex$iv$iv) goto L30;
        i$iv$iv = i$iv$iv + 1;
        r1 = r15;
        goto L4
    L37:
        return hash2;
    L24:
        hash = hash2;
    L30:
        return hash;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object other) {
        boolean r1 = true;
        if (other != this) goto L5;
        return true;
    L5:
        boolean r4 = false;
        if ((other instanceof OrderedScatterSet) == true) goto L9;
        return false;
    L9:
        if (((OrderedScatterSet) other).getSize() == getSize()) goto L11;
        return false;
    L11:
        OrderedScatterSet r3 = (OrderedScatterSet) other;
        OrderedScatterSet<E> r5 = this;
        Object[] elements$iv = r5.elements;
        long[] m$iv$iv = r5.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L37;
    L13:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        boolean r18 = r1;
        boolean r15 = r4;
        OrderedScatterSet<E> r16 = r5;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L31;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L16:
        if (j$iv$iv >= bitCount$iv$iv) goto L28;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L20;
        boolean r6 = r18;
    L21:
        if (r6 == false) goto L26;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        boolean r20 = r15;
        Object element = elements$iv[index$iv$iv];
        if (r3.contains(element) == true) goto L27;
        return r20;
    L27:
        slot$iv$iv = slot$iv$iv >> 8;
        j$iv$iv = j$iv$iv + 1;
        r15 = r20;
        goto L16
    L26:
        r20 = r15;
        goto L27
    L20:
        r6 = r15;
        goto L21
    L28:
        boolean r21 = r15;
        if (bitCount$iv$iv != 8) goto L45;
    L32:
        if (i$iv$iv == lastIndex$iv$iv) goto L44;
        i$iv$iv = i$iv$iv + 1;
        r5 = r16;
        r1 = r18;
        r4 = r21;
        goto L13
    L44:
        return r18;
    L45:
        return r18;
    L31:
        r21 = r15;
        goto L32
    L37:
        return true;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, new AnonymousClass1(this), 25, null);
    }

    public final int findElementIndex$collection(E r24) {
        int $i$f$findElementIndex$collection = 0;
        if (r24 == null) goto L5;
        int r5 = r24.hashCode();
    L6:
        int hash$iv = r5 * ScatterMapKt.MurmurHashC1;
        int hash = hash$iv ^ (hash$iv << 16);
        int hash2 = hash & WorkQueueKt.MASK;
        int probeMask = this._capacity;
        int $i$f$h1 = hash >>> 7;
        int probeOffset = $i$f$h1 & probeMask;
        int probeIndex = 0;
    L7:
        long[] metadata$iv = this.metadata;
        int i$iv = probeOffset >> 3;
        int b$iv = (probeOffset & 7) << 3;
        int hash3 = hash2;
        long g = (((-b$iv) >> 63) & (metadata$iv[i$iv + 1] << (64 - b$iv))) | (metadata$iv[i$iv] >>> b$iv);
        long x$iv = (((long) hash3) * ScatterMapKt.BitmaskLsb) ^ g;
        int $i$f$findElementIndex$collection2 = $i$f$findElementIndex$collection;
        int hash4 = hash;
        long m = ((~x$iv) & (x$iv - ScatterMapKt.BitmaskLsb)) & (-9187201950435737472L);
    L8:
        long $this$hasNext$iv = m;
        if ($this$hasNext$iv == 0) goto L11;
        boolean r20 = true;
    L12:
        if (r20 == false) goto L17;
        long $this$get$iv = m;
        int index = ((Long.numberOfTrailingZeros($this$get$iv) >> 3) + probeOffset) & probeMask;
        if (Intrinsics.areEqual(this.elements[index], r24) == true) goto L15;
        long $this$next$iv = m;
        m = $this$next$iv & ($this$next$iv - 1);
        goto L8
    L15:
        return index;
    L17:
        long $this$maskEmpty$iv = (((~g) << 6) & g) & (-9187201950435737472L);
        if ($this$maskEmpty$iv != 0) goto L19;
        probeIndex = probeIndex + 8;
        probeOffset = (probeOffset + probeIndex) & probeMask;
        hash2 = hash3;
        $i$f$findElementIndex$collection = $i$f$findElementIndex$collection2;
        hash = hash4;
        goto L7
    L19:
        return -1;
    L11:
        r20 = false;
        goto L12
    L5:
        r5 = 0;
        goto L6
    }

    public final Set<E> asSet() {
        return new OrderedSetWrapper(this);
    }
}
