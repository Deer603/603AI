package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: OnDemandAllocatingPool.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\r\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\t\u0010\u0014\u001a\u00020\u0004H\u0082\bJ\r\u0010\u0015\u001a\u00020\r*\u00020\u0004H\u0082\bR\t\u0010\b\u001a\u00020\tX\u0082\u0004R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000bX\u0082\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/internal/OnDemandAllocatingPool;", "T", "", "maxCapacity", "", "create", "Lkotlin/Function1;", "(ILkotlin/jvm/functions/Function1;)V", "controlState", "Lkotlinx/atomicfu/AtomicInt;", "elements", "Lkotlinx/atomicfu/AtomicArray;", "allocate", "", "close", "", "stateRepresentation", "", "stateRepresentation$kotlinx_coroutines_core", "toString", "tryForbidNewElements", "isClosed", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OnDemandAllocatingPool<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater controlState$volatile$FU = null;
    private volatile /* synthetic */ int controlState$volatile;
    private final Function1<Integer, T> create;
    private final /* synthetic */ AtomicReferenceArray elements;
    private final int maxCapacity;

    static {
        controlState$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(OnDemandAllocatingPool.class, "controlState$volatile");
    }

    private final /* synthetic */ int getControlState$volatile() {
        return this.controlState$volatile;
    }

    private static final /* synthetic */ AtomicIntegerFieldUpdater getControlState$volatile$FU() {
        return controlState$volatile$FU;
    }

    private final /* synthetic */ AtomicReferenceArray getElements() {
        return this.elements;
    }

    private final /* synthetic */ void loop$atomicfu(Object r2, AtomicIntegerFieldUpdater r3, Function1<? super Integer, Unit> r4) {
    L2:
        r4.invoke(Integer.valueOf(r3.get(r2)));
        goto L2
    }

    private final /* synthetic */ void setControlState$volatile(int r1) {
        this.controlState$volatile = r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnDemandAllocatingPool(int maxCapacity, Function1<? super Integer, ? extends T> r4) {
        this.maxCapacity = maxCapacity;
        this.create = r4;
        this.elements = new AtomicReferenceArray(this.maxCapacity);
    }

    private final int tryForbidNewElements() {
        AtomicIntegerFieldUpdater handler$atomicfu$iv = getControlState$volatile$FU();
    L3:
        int it = handler$atomicfu$iv.get(this);
        if ((it & Integer.MIN_VALUE) == 0) goto L6;
        boolean r9 = true;
    L7:
        if (r9 == true) goto L8;
        if (getControlState$volatile$FU().compareAndSet(this, it, it | Integer.MIN_VALUE) == false) goto L3;
        return it;
    L8:
        return 0;
    L6:
        r9 = false;
        goto L7
    }

    private final boolean isClosed(int $this$isClosed) {
        if ((Integer.MIN_VALUE & $this$isClosed) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean allocate() {
        AtomicIntegerFieldUpdater handler$atomicfu$iv = getControlState$volatile$FU();
    L3:
        int ctl = handler$atomicfu$iv.get(this);
        if ((Integer.MIN_VALUE & ctl) == 0) goto L6;
        int $this$isClosed$iv = 1;
    L7:
        if ($this$isClosed$iv != 0) goto L8;
        if (ctl >= this.maxCapacity) goto L11;
        if (getControlState$volatile$FU().compareAndSet(this, ctl, ctl + 1) == false) goto L3;
        getElements().set(ctl, this.create.invoke(Integer.valueOf(ctl)));
        return true;
    L11:
        return true;
    L8:
        return false;
    L6:
        $this$isClosed$iv = 0;
        goto L7
    }

    public final List<T> close() {
        AtomicIntegerFieldUpdater handler$atomicfu$iv$iv = getControlState$volatile$FU();
    L3:
        int elementsExisting = handler$atomicfu$iv$iv.get(this);
        if ((elementsExisting & Integer.MIN_VALUE) == 0) goto L6;
        boolean r10 = true;
    L7:
        if (r10 == true) goto L8;
        if (getControlState$volatile$FU().compareAndSet(this, elementsExisting, elementsExisting | Integer.MIN_VALUE) == false) goto L3;
    L12:
        Iterable $this$map$iv = RangesKt.until(0, elementsExisting);
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator<Integer> r6 = $this$map$iv.iterator();
    L14:
        if (r6.hasNext() == false) goto L21;
        int item$iv$iv = ((IntIterator) r6).nextInt();
    L16:
        Object element = getElements().getAndSet(item$iv$iv, null);
        if (element == null) goto L16;
        destination$iv$iv.add(element);
        goto L14
    L21:
        return (List) destination$iv$iv;
    L8:
        elementsExisting = 0;
        goto L12
    L6:
        r10 = false;
        goto L7
    }

    public final String stateRepresentation$kotlinx_coroutines_core() {
        int ctl = getControlState$volatile$FU().get(this);
        boolean r2 = false;
        Iterable $this$map$iv = RangesKt.until(0, Integer.MAX_VALUE & ctl);
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator<Integer> r7 = $this$map$iv.iterator();
    L4:
        if (r7.hasNext() == false) goto L6;
        int item$iv$iv = ((IntIterator) r7).nextInt();
        destination$iv$iv.add(getElements().get(item$iv$iv));
        goto L4
    L6:
        String elementsStr = ((List) destination$iv$iv).toString();
        if ((Integer.MIN_VALUE & ctl) == 0) goto L9;
        r2 = true;
    L9:
        if (r2 == false) goto L11;
        String closedStr = "[closed]";
    L13:
        return elementsStr + closedStr;
    L11:
        closedStr = "";
        goto L13
    }

    public String toString() {
        return "OnDemandAllocatingPool(" + stateRepresentation$kotlinx_coroutines_core() + ')';
    }
}
