package kotlinx.coroutines.internal;

import androidx.autofill.HintConstants;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

/* JADX INFO: compiled from: ThreadSafeHeap.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0004j\u0002`\u0005B\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u0000H\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0002\u0010\u0019J,\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00028\u00002\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\r0\u001dH\u0086\b¢\u0006\u0002\u0010\u001eJ0\u0010\u001f\u001a\u0004\u0018\u00018\u00002!\u0010 \u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\r0\u001d¢\u0006\u0002\u0010#J\u000f\u0010$\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0002\u0010%J\r\u0010&\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010%J\u0015\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\nH\u0002¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0002\u0010*J\u0015\u0010+\u001a\u00028\u00002\u0006\u0010,\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010-J$\u0010.\u001a\u0004\u0018\u00018\u00002\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u001dH\u0086\b¢\u0006\u0002\u0010#J\r\u0010/\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010%J\u0011\u00100\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u0010H\u0082\u0010J\u0011\u00102\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u0010H\u0082\u0010J\u0018\u00103\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u0010H\u0002R\t\u0010\u0007\u001a\u00020\bX\u0082\u0004R\u001a\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u00065"}, d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeap;", "T", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "()V", "_size", "Lkotlinx/atomicfu/AtomicInt;", "a", "", "[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "isEmpty", "", "()Z", "value", "", "size", "getSize", "()I", "setSize", "(I)V", "addImpl", "", "node", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)V", "addLast", "addLastIf", "cond", "Lkotlin/Function1;", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;Lkotlin/jvm/functions/Function1;)Z", "find", "predicate", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "firstImpl", "()Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "peek", "realloc", "()[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "remove", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)Z", "removeAtImpl", "index", "(I)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "removeFirstIf", "removeFirstOrNull", "siftDownFrom", "i", "siftUpFrom", "swap", "j", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class ThreadSafeHeap<T extends ThreadSafeHeapNode & Comparable<? super T>> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _size$volatile$FU = null;
    private volatile /* synthetic */ int _size$volatile;
    private T[] a;

    static {
        _size$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(ThreadSafeHeap.class, "_size$volatile");
    }

    private final /* synthetic */ int get_size$volatile() {
        return this._size$volatile;
    }

    private static final /* synthetic */ AtomicIntegerFieldUpdater get_size$volatile$FU() {
        return _size$volatile$FU;
    }

    private final /* synthetic */ void set_size$volatile(int r1) {
        this._size$volatile = r1;
    }

    public ThreadSafeHeap() {
    }

    public final int getSize() {
        return get_size$volatile$FU().get(this);
    }

    private final void setSize(int value) {
        get_size$volatile$FU().set(this, value);
    }

    public final boolean isEmpty() {
        if (getSize() != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final T find(Function1<? super T, Boolean> r8) {
        monitor-enter(this);
        int r3 = 0;
        int r4 = getSize();     // Catch: Throwable -> L18
    L6:
        T r5 = null;
        if (r3 >= r4) goto L16;
        T[] r6 = this.a;     // Catch: Throwable -> L18
        if (r6 == null) goto L11;
        r5 = (Object) r6[r3];
    L11:
        Intrinsics.checkNotNull(r5);     // Catch: Throwable -> L18
        if (r8.invoke(r5).booleanValue() == true) goto L16;
        r3 = r3 + 1;
    L16:
        monitor-exit(this);
        return r5;
    L18:
        th = move-exception;
        throw th;
    }

    public final T peek() {
        monitor-enter(this);
        T r3 = (T) firstImpl();
        monitor-exit(this);
        return r3;
    L8:
        th = move-exception;
        throw th;
    }

    public final T removeFirstOrNull() {
        monitor-enter(this);
    L13:
        th = move-exception;
        throw th;
    L6:
        if (getSize() <= 0) goto L9;
        T r3 = (T) removeAtImpl(0);
    L11:
        monitor-exit(this);
        return r3;
    L9:
        r3 = null;
        goto L11
    }

    public final T removeFirstIf(Function1<? super T, Boolean> r8) {
        monitor-enter(this);
        ThreadSafeHeapNode r4 = firstImpl();     // Catch: Throwable -> L18
        T r5 = null;
        if (r4 != null) goto L11;
        monitor-exit(this);
        return null;
    L11:
        if (r8.invoke(r4).booleanValue() == false) goto L16;
        r5 = (T) removeAtImpl(0);
    L16:
        monitor-exit(this);
        return r5;
    L18:
        th = move-exception;
        throw th;
    }

    public final void addLast(T r4) {
        monitor-enter(this);
        addImpl(r4);     // Catch: Throwable -> L8
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L8
        monitor-exit(this);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public final boolean addLastIf(T r6, Function1<? super T, Boolean> r7) {
        monitor-enter(this);
    L13:
        th = move-exception;
        throw th;
    L6:
        if (r7.invoke(firstImpl()).booleanValue() == false) goto L9;
        addImpl(r6);     // Catch: Throwable -> L13
        boolean r4 = true;
    L11:
        monitor-exit(this);
        return r4;
    L9:
        r4 = false;
        goto L11
    }

    public final boolean remove(T r8) {
        monitor-enter(this);
        boolean r4 = false;
        if (r8.getHeap() == null) goto L19;
        int index = r8.getIndex();     // Catch: Throwable -> L21
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L11;
    L17:
        removeAtImpl(index);     // Catch: Throwable -> L21
        r4 = true;
        goto L19
    L11:
        if (index < 0) goto L13;
        r4 = true;
    L13:
        if (r4 == true) goto L17;
        throw new AssertionError();     // Catch: Throwable -> L21
    L19:
        monitor-exit(this);
        return r4;
    L21:
        th = move-exception;
        throw th;
    }

    public final T firstImpl() {
        T[] r0 = this.a;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0[0];
    }

    public final T removeAtImpl(int index) {
        boolean r1 = false;
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L5;
    L12:
        T[] r0 = this.a;
        Intrinsics.checkNotNull(r0);
        setSize(getSize() - 1);
        if (index >= getSize()) goto L20;
        swap(index, getSize());
        int j = (index - 1) / 2;
        if (index <= 0) goto L19;
        T r5 = r0[index];
        Intrinsics.checkNotNull(r5);
        T r6 = r0[j];
        Intrinsics.checkNotNull(r6);
        if (((Comparable) r5).compareTo(r6) >= 0) goto L19;
        swap(index, j);
        siftUpFrom(j);
    L19:
        siftDownFrom(index);
    L20:
        T r3 = r0[getSize()];
        Intrinsics.checkNotNull(r3);
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L23;
    L29:
        r3.setHeap(null);
        r3.setIndex(-1);
        r0[getSize()] = null;
        return r3;
    L23:
        if (r3.getHeap() != this) goto L25;
        r1 = true;
    L25:
        if (r1 == true) goto L29;
        throw new AssertionError();
    L5:
        if (getSize() <= 0) goto L7;
        int r2 = 1;
    L8:
        if (r2 != 0) goto L12;
        throw new AssertionError();
    L7:
        r2 = 0;
        goto L8
    }

    public final void addImpl(T r4) {
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L5;
    L12:
        r4.setHeap(this);
        ThreadSafeHeapNode[] a = realloc();
        int i = getSize();
        setSize(i + 1);
        a[i] = r4;
        r4.setIndex(i);
        siftUpFrom(i);
        return;
    L5:
        if (r4.getHeap() != null) goto L7;
        boolean r1 = true;
    L8:
        if (r1 == true) goto L12;
        throw new AssertionError();
    L7:
        r1 = false;
        goto L8
    }

    private final void siftUpFrom(int i) {
    L2:
        if (i <= 0) goto L3;
        T[] r0 = this.a;
        Intrinsics.checkNotNull(r0);
        int j = (i - 1) / 2;
        T r2 = r0[j];
        Intrinsics.checkNotNull(r2);
        T r3 = r0[i];
        Intrinsics.checkNotNull(r3);
        if (((Comparable) r2).compareTo(r3) <= 0) goto L6;
        swap(i, j);
        i = j;
        goto L2
    L6:
        return;
    }

    private final void siftDownFrom(int i) {
    L2:
        int j = (i * 2) + 1;
        if (j >= getSize()) goto L4;
        T[] r1 = this.a;
        Intrinsics.checkNotNull(r1);
        if ((j + 1) >= getSize()) goto L10;
        T r2 = r1[j + 1];
        Intrinsics.checkNotNull(r2);
        T r3 = r1[j];
        Intrinsics.checkNotNull(r3);
        if (((Comparable) r2).compareTo(r3) >= 0) goto L10;
        j = j + 1;
    L10:
        T r4 = r1[i];
        Intrinsics.checkNotNull(r4);
        T r5 = r1[j];
        Intrinsics.checkNotNull(r5);
        if (((Comparable) r4).compareTo(r5) <= 0) goto L12;
        swap(i, j);
        i = j;
        goto L2
    L12:
        return;
    }

    private final T[] realloc() {
        T[] r0 = this.a;
        if (r0 != null) goto L6;
        T[] r1 = (T[]) new ThreadSafeHeapNode[4];
        this.a = r1;
        return r1;
    L6:
        if (getSize() < r0.length) goto L9;
        Object[] r2 = Arrays.copyOf(r0, getSize() * 2);
        Intrinsics.checkNotNullExpressionValue(r2, "copyOf(...)");
        this.a = (T[]) ((ThreadSafeHeapNode[]) r2);
        return (T[]) ((ThreadSafeHeapNode[]) r2);
    L9:
        return r0;
    }

    private final void swap(int i, int j) {
        ThreadSafeHeapNode[] a = this.a;
        Intrinsics.checkNotNull(a);
        ThreadSafeHeapNode ni = a[j];
        Intrinsics.checkNotNull(ni);
        ThreadSafeHeapNode nj = a[i];
        Intrinsics.checkNotNull(nj);
        a[i] = ni;
        a[j] = nj;
        ni.setIndex(i);
        nj.setIndex(j);
    }
}
