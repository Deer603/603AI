package androidx.compose.runtime;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Stack.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0018\b\u0002\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bJ\r\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u0019J\r\u0010\u001c\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010 J\r\u0010!\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010\u001eJ\u0015\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00028\u0000¢\u0006\u0004\b%\u0010\u0014J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000'¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0088\u0001\u0003\u0092\u0001\u0012\u0012\u0004\u0012\u0002H\u00010\u0004j\b\u0012\u0004\u0012\u0002H\u0001`\u0005¨\u0006."}, d2 = {"Landroidx/compose/runtime/Stack;", "T", "", "backing", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "constructor-impl", "(Ljava/util/ArrayList;)Ljava/util/ArrayList;", "size", "", "getSize-impl", "(Ljava/util/ArrayList;)I", "clear", "", "clear-impl", "(Ljava/util/ArrayList;)V", "equals", "", "other", "equals-impl", "(Ljava/util/ArrayList;Ljava/lang/Object;)Z", "hashCode", "hashCode-impl", "isEmpty", "isEmpty-impl", "(Ljava/util/ArrayList;)Z", "isNotEmpty", "isNotEmpty-impl", "peek", "peek-impl", "(Ljava/util/ArrayList;)Ljava/lang/Object;", "index", "(Ljava/util/ArrayList;I)Ljava/lang/Object;", "pop", "pop-impl", "push", "value", "push-impl", "toArray", "", "toArray-impl", "(Ljava/util/ArrayList;)[Ljava/lang/Object;", "toString", "", "toString-impl", "(Ljava/util/ArrayList;)Ljava/lang/String;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class Stack<T> {
    private final ArrayList<T> backing;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Stack m3790boximpl(ArrayList r1) {
        return new Stack(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> ArrayList<T> m3792constructorimpl(ArrayList<T> r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3794equalsimpl(ArrayList<T> r2, Object r3) {
        if ((r3 instanceof Stack) == true) goto L6;
        return false;
    L6:
        if (Intrinsics.areEqual(r2, ((Stack) r3).m3806unboximpl()) == true) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3795equalsimpl0(ArrayList<T> r1, ArrayList<T> r2) {
        return Intrinsics.areEqual(r1, r2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3797hashCodeimpl(ArrayList<T> r1) {
        return r1.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3805toStringimpl(ArrayList<T> r2) {
        return "Stack(backing=" + r2 + ')';
    }

    public boolean equals(Object r2) {
        return m3794equalsimpl(this.backing, r2);
    }

    public int hashCode() {
        return m3797hashCodeimpl(this.backing);
    }

    public String toString() {
        return m3805toStringimpl(this.backing);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ ArrayList m3806unboximpl() {
        return this.backing;
    }

    private /* synthetic */ Stack(ArrayList backing) {
        this.backing = backing;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ ArrayList m3793constructorimpl$default(ArrayList r0, int r1, DefaultConstructorMarker r2) {
        if ((r1 & 1) == 0) goto L6;
        r0 = new ArrayList();
    L6:
        return m3792constructorimpl(r0);
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static final int m3796getSizeimpl(ArrayList<T> r1) {
        return r1.size();
    }

    /* JADX INFO: renamed from: push-impl, reason: not valid java name */
    public static final boolean m3803pushimpl(ArrayList<T> r1, T r2) {
        return r1.add(r2);
    }

    /* JADX INFO: renamed from: pop-impl, reason: not valid java name */
    public static final T m3802popimpl(ArrayList<T> r1) {
        return r1.remove(m3796getSizeimpl(r1) - 1);
    }

    /* JADX INFO: renamed from: peek-impl, reason: not valid java name */
    public static final T m3800peekimpl(ArrayList<T> r1) {
        return r1.get(m3796getSizeimpl(r1) - 1);
    }

    /* JADX INFO: renamed from: peek-impl, reason: not valid java name */
    public static final T m3801peekimpl(ArrayList<T> r1, int index) {
        return r1.get(index);
    }

    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m3798isEmptyimpl(ArrayList<T> r1) {
        return r1.isEmpty();
    }

    /* JADX INFO: renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m3799isNotEmptyimpl(ArrayList<T> r1) {
        return !m3798isEmptyimpl(r1);
    }

    /* JADX INFO: renamed from: clear-impl, reason: not valid java name */
    public static final void m3791clearimpl(ArrayList<T> r0) {
        r0.clear();
    }

    /* JADX INFO: renamed from: toArray-impl, reason: not valid java name */
    public static final T[] m3804toArrayimpl(ArrayList<T> r4) {
        int r0 = r4.size();
        T[] r1 = (T[]) new Object[r0];
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        r1[r2] = r4.get(r2);
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }
}
