package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0016J\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u0013J\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u0013J\u0010\u0010\u001d\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006$"}, d2 = {"Landroidx/compose/runtime/PrioritySet;", "", "list", "Landroidx/collection/MutableIntList;", "constructor-impl", "(Landroidx/collection/MutableIntList;)Landroidx/collection/MutableIntList;", "add", "", "value", "", "add-impl", "(Landroidx/collection/MutableIntList;I)V", "equals", "", "other", "equals-impl", "(Landroidx/collection/MutableIntList;Ljava/lang/Object;)Z", "hashCode", "hashCode-impl", "(Landroidx/collection/MutableIntList;)I", "isEmpty", "isEmpty-impl", "(Landroidx/collection/MutableIntList;)Z", "isNotEmpty", "isNotEmpty-impl", "peek", "peek-impl", "takeMax", "takeMax-impl", "toString", "", "toString-impl", "(Landroidx/collection/MutableIntList;)Ljava/lang/String;", "validateHeap", "validateHeap-impl", "(Landroidx/collection/MutableIntList;)V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class PrioritySet {
    private final MutableIntList list;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PrioritySet m3768boximpl(MutableIntList r1) {
        return new PrioritySet(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static MutableIntList m3769constructorimpl(MutableIntList r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3771equalsimpl(MutableIntList r2, Object r3) {
        if ((r3 instanceof PrioritySet) == true) goto L6;
        return false;
    L6:
        if (Intrinsics.areEqual(r2, ((PrioritySet) r3).m3780unboximpl()) == true) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3772equalsimpl0(MutableIntList r1, MutableIntList r2) {
        return Intrinsics.areEqual(r1, r2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3773hashCodeimpl(MutableIntList r1) {
        return r1.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3778toStringimpl(MutableIntList r2) {
        return "PrioritySet(list=" + r2 + ')';
    }

    public boolean equals(Object r2) {
        return m3771equalsimpl(this.list, r2);
    }

    public int hashCode() {
        return m3773hashCodeimpl(this.list);
    }

    public String toString() {
        return m3778toStringimpl(this.list);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ MutableIntList m3780unboximpl() {
        return this.list;
    }

    private /* synthetic */ PrioritySet(MutableIntList list) {
        this.list = list;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableIntList m3770constructorimpl$default(MutableIntList r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r2 = new MutableIntList(0, 1, null);
    L6:
        return m3769constructorimpl(r2);
    }

    /* JADX INFO: renamed from: add-impl, reason: not valid java name */
    public static final void m3767addimpl(MutableIntList arg0, int value) {
        MutableIntList this_$iv = arg0;
        if (this_$iv._size == 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L8;
    L12:
        MutableIntList this_$iv2 = arg0;
        int index = this_$iv2._size;
        arg0.add(value);
    L13:
        if (index <= 0) goto L18;
        int parent = ((index + 1) >>> 1) - 1;
        int parentValue = arg0.get(parent);
        if (value <= parentValue) goto L18;
        arg0.set(index, parentValue);
        index = parent;
    L18:
        arg0.set(index, value);
        return;
    L8:
        if (arg0.get(0) == value) goto L11;
        MutableIntList this_$iv3 = arg0;
        if (arg0.get(this_$iv3._size - 1) != value) goto L12;
        return;
    L11:
        return;
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m3774isEmptyimpl(MutableIntList arg0) {
        MutableIntList this_$iv = arg0;
        if (this_$iv._size != 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m3775isNotEmptyimpl(MutableIntList arg0) {
        MutableIntList this_$iv = arg0;
        if (this_$iv._size == 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: peek-impl, reason: not valid java name */
    public static final int m3776peekimpl(MutableIntList arg0) {
        return arg0.first();
    }

    /* JADX INFO: renamed from: takeMax-impl, reason: not valid java name */
    public static final int m3777takeMaximpl(MutableIntList arg0) {
        MutableIntList this_$iv = arg0;
        if (this_$iv._size > 0) goto L6;
    L6:
        int value = arg0.get(0);
    L7:
        MutableIntList this_$iv2 = arg0;
        if (this_$iv2._size == 0) goto L10;
        boolean r3 = true;
    L11:
        if (r3 == false) goto L26;
        if (arg0.get(0) != value) goto L26;
        arg0.set(0, arg0.last());
        MutableIntList this_$iv3 = arg0;
        arg0.removeAt(this_$iv3._size - 1);
        int index = 0;
        MutableIntList this_$iv4 = arg0;
        int size = this_$iv4._size;
        MutableIntList this_$iv5 = arg0;
        int max = this_$iv5._size >>> 1;
    L15:
        if (index >= max) goto L7;
        int indexValue = arg0.get(index);
        int left = ((index + 1) * 2) - 1;
        int leftValue = arg0.get(left);
        int right = (index + 1) * 2;
        if (right >= size) goto L23;
        int rightValue = arg0.get(right);
        if (rightValue <= leftValue) goto L23;
        if (rightValue <= indexValue) goto L7;
        arg0.set(index, rightValue);
        arg0.set(right, indexValue);
        index = right;
    L23:
        if (leftValue <= indexValue) goto L7;
        arg0.set(index, leftValue);
        arg0.set(left, indexValue);
        index = left;
    L26:
        return value;
    L10:
        r3 = false;
        goto L11
    }

    /* JADX INFO: renamed from: validateHeap-impl, reason: not valid java name */
    public static final void m3779validateHeapimpl(MutableIntList arg0) {
        MutableIntList this_$iv = arg0;
        int size = this_$iv._size;
        int index = 0;
        int r2 = size / 2;
    L3:
        if (index >= r2) goto L21;
        boolean value$iv = true;
        int left = ((index + 1) * 2) - 1;
        int right = (index + 1) * 2;
        if (arg0.get(index) < arg0.get(left)) goto L7;
        boolean value$iv2 = true;
    L9:
        if (value$iv2 == true) goto L12;
        PreconditionsKt.throwIllegalStateException("Check failed.");
    L12:
        if (right >= size) goto L18;
        if (arg0.get(index) >= arg0.get(right)) goto L18;
        value$iv = false;
    L18:
        if (value$iv == true) goto L20;
        PreconditionsKt.throwIllegalStateException("Check failed.");
    L20:
        index = index + 1;
        goto L3
    L7:
        value$iv2 = false;
        goto L9
    }
}
